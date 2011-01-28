/*
Copyright 2011 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.danga.camli;

import android.test.ActivityInstrumentationTestCase2;

public class CamliActivityTest extends ActivityInstrumentationTestCase2<CamliActivity> {
	
	public CamliActivityTest(String pkg, Class<CamliActivity> activityClass) {
		super(pkg, activityClass);
		// TODO Auto-generated constructor stub
	}

	public void testSanity() {
		assertEquals(2, 1 + 1);
		assertEquals(4, 2 + 2);
	}
}
