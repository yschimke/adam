/*
 * Copyright (C) 2021 Anton Malinskiy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.malinskiy.adam.request.abb

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.malinskiy.adam.extension.toRequestString
import org.junit.Test

class AbbExecRequestTest {
    @Test
    fun testSerialize() {
        assertThat(AbbExecRequest(listOf("cmd", "package", "install")).serialize().toRequestString())
            .isEqualTo("001Cabb_exec:cmd\u0000package\u0000install")
    }
}
