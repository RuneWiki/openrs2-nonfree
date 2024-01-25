import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!bj;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_17 = new Class307(7, 2);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method7523(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	public static void method7524() {
		Static530.method7224(false);
		Static580.anInt9408 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static331.aByteArrayArray20.length; local14++) {
			if (Static549.anIntArray609[local14] != -1 && Static331.aByteArrayArray20[local14] == null) {
				Static331.aByteArrayArray20[local14] = Static373.aClass111_90.method2441(0, Static549.anIntArray609[local14]);
				if (Static331.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static580.anInt9408++;
				}
			}
			if (Static515.anIntArray586[local14] != -1 && Static457.aByteArrayArray25[local14] == null) {
				Static457.aByteArrayArray25[local14] = Static373.aClass111_90.method2440(Static357.anIntArrayArray43[local14], Static515.anIntArray586[local14], 0);
				if (Static457.aByteArrayArray25[local14] == null) {
					local12 = false;
					Static580.anInt9408++;
				}
			}
			if (Static201.anIntArray451[local14] != -1 && Static466.aByteArrayArray10[local14] == null) {
				Static466.aByteArrayArray10[local14] = Static373.aClass111_90.method2441(0, Static201.anIntArray451[local14]);
				if (Static466.aByteArrayArray10[local14] == null) {
					Static580.anInt9408++;
					local12 = false;
				}
			}
			if (Static585.anIntArray630[local14] != -1 && Static349.aByteArrayArray21[local14] == null) {
				Static349.aByteArrayArray21[local14] = Static373.aClass111_90.method2441(0, Static585.anIntArray630[local14]);
				if (Static349.aByteArrayArray21[local14] == null) {
					Static580.anInt9408++;
					local12 = false;
				}
			}
			if (Static328.anIntArray378 != null && Static429.aByteArrayArray24[local14] == null && Static328.anIntArray378[local14] != -1) {
				Static429.aByteArrayArray24[local14] = Static373.aClass111_90.method2440(Static357.anIntArrayArray43[local14], Static328.anIntArray378[local14], 0);
				if (Static429.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static580.anInt9408++;
				}
			}
		}
		if (Static53.aClass236_1 == null) {
			if (Static306.aClass1_Sub3_Sub17_3 == null || !Static460.aClass111_108.method2446(Static306.aClass1_Sub3_Sub17_3.aString84 + "_staticelements")) {
				Static53.aClass236_1 = new Class236(0);
			} else if (Static460.aClass111_108.method2464(Static306.aClass1_Sub3_Sub17_3.aString84 + "_staticelements")) {
				Static53.aClass236_1 = Static407.method5753(Static33.aBoolean76, Static306.aClass1_Sub3_Sub17_3.aString84 + "_staticelements", Static460.aClass111_108);
			} else {
				Static580.anInt9408++;
				local12 = false;
			}
		}
		if (!local12) {
			Static180.anInt3231 = 1;
			return;
		}
		Static30.anInt868 = 0;
		local12 = true;
		@Pc(266) int local266;
		@Pc(276) int local276;
		for (@Pc(247) int local247 = 0; local247 < Static331.aByteArrayArray20.length; local247++) {
			@Pc(253) byte[] local253 = Static457.aByteArrayArray25[local247];
			if (local253 != null) {
				local266 = (Static298.anIntArray348[local247] >> 8) * 64 - Static376.anInt6631;
				local276 = (Static298.anIntArray348[local247] & 0xFF) * 64 - Static24.anInt674;
				if (Static102.anInt2115 != 0) {
					local276 = 10;
					local266 = 10;
				}
				local12 &= Static53.method1238(local266, local276, Static500.anInt6888, local253, Static573.anInt9325);
			}
			local253 = Static349.aByteArrayArray21[local247];
			if (local253 != null) {
				local266 = (Static298.anIntArray348[local247] >> 8) * 64 - Static376.anInt6631;
				local276 = (Static298.anIntArray348[local247] & 0xFF) * 64 - Static24.anInt674;
				if (Static102.anInt2115 != 0) {
					local276 = 10;
					local266 = 10;
				}
				local12 &= Static53.method1238(local266, local276, Static500.anInt6888, local253, Static573.anInt9325);
			}
		}
		if (!local12) {
			Static180.anInt3231 = 2;
			return;
		}
		if (Static180.anInt3231 != 0) {
			Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_14.method1864(Static562.anInt9127) + "<br>(100%)", Static21.aClass35_1);
		}
		Static99.method1834();
		Static181.method2770();
		@Pc(378) boolean local378 = false;
		if (Static136.aClass12_8.method6413() && Static479.aClass1_Sub7_Sub1_1.aBoolean228) {
			for (local266 = 0; local266 < Static331.aByteArrayArray20.length; local266++) {
				if (Static349.aByteArrayArray21[local266] != null || Static466.aByteArrayArray10[local266] != null) {
					local378 = true;
					break;
				}
			}
		}
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean230) {
			local266 = Static179.anIntArray188[Static562.anInt9126];
		} else {
			local266 = Static98.anIntArray121[Static562.anInt9126];
		}
		if (Static136.aClass12_8.method6455()) {
			local266++;
		}
		Static305.method4716(Static136.aClass12_8, Static408.anInt7003, Static500.anInt6888, Static573.anInt9325, local266, local378, Static136.aClass12_8.method6406() > 0);
		if (Static18.aBoolean42) {
			Static38.method900(Static443.aClass35_11);
		} else {
			Static38.method900(null);
		}
		for (local276 = 0; local276 < 4; local276++) {
			Static28.aClass94Array2[local276].method2209();
		}
		Static218.method3612();
		Static96.method1809(false);
		Static293.method4615();
		Static137.aBoolean197 = false;
		Static498.aClass224_1 = null;
		Static99.method1834();
		System.gc();
		Static530.method7224(true);
		Static323.method4889();
		Static208.anInt8804 = Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609);
		Static346.aBoolean439 = Static479.aClass1_Sub7_Sub1_1.aBoolean228;
		Static229.aBoolean645 = Static72.anInt1778 >= 96;
		Static452.aBoolean562 = Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609);
		Static265.aBoolean380 = !Static479.aClass1_Sub7_Sub1_1.aBoolean234;
		Static595.anInt9666 = Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) ? -1 : Static296.anInt5478;
		Static288.aBoolean403 = Static88.method1741(Static375.anInt6609) || Static479.aClass1_Sub7_Sub1_1.aBoolean226;
		Static392.aBoolean492 = Static479.aClass1_Sub7_Sub1_1.aBoolean223;
		Static81.aClass231_Sub1_1 = new Class231_Sub1(4, Static500.anInt6888, Static573.anInt9325, false);
		if (Static102.anInt2115 == 0) {
			Static93.method1778(Static81.aClass231_Sub1_1, Static331.aByteArrayArray20);
		} else {
			Static417.method5836(Static331.aByteArrayArray20, Static81.aClass231_Sub1_1);
		}
		Static95.method1802(Static500.anInt6888 >> 4, Static573.anInt9325 >> 4);
		Static340.method5069();
		if (local378) {
			Static200.method3430(true);
			Static579.aClass231_Sub1_2 = new Class231_Sub1(1, Static500.anInt6888, Static573.anInt9325, true);
			if (Static102.anInt2115 == 0) {
				Static93.method1778(Static579.aClass231_Sub1_2, Static466.aByteArrayArray10);
				Static530.method7224(true);
			} else {
				Static417.method5836(Static466.aByteArrayArray10, Static579.aClass231_Sub1_2);
				Static530.method7224(true);
			}
			Static579.aClass231_Sub1_2.method6691(Static81.aClass231_Sub1_1.anIntArrayArrayArray17[0]);
			Static579.aClass231_Sub1_2.method6687(null, Static136.aClass12_8, null);
			Static200.method3430(false);
		}
		Static81.aClass231_Sub1_1.method6687(local378 ? Static579.aClass231_Sub1_2.anIntArrayArrayArray17 : null, Static136.aClass12_8, Static28.aClass94Array2);
		if (Static102.anInt2115 == 0) {
			Static530.method7224(true);
			Static236.method3832(Static457.aByteArrayArray25, Static81.aClass231_Sub1_1);
			if (Static429.aByteArrayArray24 != null) {
				Static2.method44();
			}
		} else {
			Static530.method7224(true);
			Static88.method1739(Static457.aByteArrayArray25, Static81.aClass231_Sub1_1);
		}
		Static181.method2770();
		if (Static72.anInt1778 < 96) {
			Static567.method7641();
		}
		Static530.method7224(true);
		Static81.aClass231_Sub1_1.method6684(Static136.aClass12_8, local378 ? Static499.aClass17Array3[0] : null, null);
		Static81.aClass231_Sub1_1.method6697(false, Static136.aClass12_8);
		Static530.method7224(true);
		if (local378) {
			Static200.method3430(true);
			Static530.method7224(true);
			if (Static102.anInt2115 == 0) {
				Static236.method3832(Static349.aByteArrayArray21, Static579.aClass231_Sub1_2);
			} else {
				Static88.method1739(Static349.aByteArrayArray21, Static579.aClass231_Sub1_2);
			}
			Static181.method2770();
			Static530.method7224(true);
			Static579.aClass231_Sub1_2.method6684(Static136.aClass12_8, null, Static158.aClass17Array2[0]);
			Static579.aClass231_Sub1_2.method6697(true, Static136.aClass12_8);
			Static530.method7224(true);
			Static200.method3430(false);
		}
		Static16.method503();
		@Pc(734) int local734 = Static81.aClass231_Sub1_1.anInt8044;
		if (local734 > Static240.anInt4595) {
			local734 = Static240.anInt4595;
		}
		if (Static240.anInt4595 - 1 > local734) {
			local734 = Static240.anInt4595 - 1;
		}
		if (Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609)) {
			Static490.method6895(0);
		} else {
			Static490.method6895(local734);
		}
		@Pc(765) int local765;
		@Pc(769) int local769;
		for (@Pc(761) int local761 = 0; local761 < 4; local761++) {
			for (local765 = 0; local765 < Static500.anInt6888; local765++) {
				for (local769 = 0; local769 < Static573.anInt9325; local769++) {
					Static213.method3552(local765, local769, local761);
				}
			}
		}
		Static566.method7638();
		Static99.method1834();
		Static74.method1613();
		Static181.method2770();
		Static129.method2211();
		@Pc(822) Class1_Sub48 local822;
		if (Static208.aFrame4 != null && Static400.aClass75_3 != null && Static177.anInt2101 == 11) {
			local822 = Static320.method4867(Static442.aClass170_2, Static199.aClass319_73);
			local822.aClass1_Sub20_Sub1_2.method4421(1057001181);
			Static34.method813(local822);
		}
		if (Static102.anInt2115 == 0) {
			local765 = (Static246.anInt8758 - (Static500.anInt6888 >> 4)) / 8;
			local769 = ((Static500.anInt6888 >> 4) + Static246.anInt8758) / 8;
			@Pc(858) int local858 = (Static360.anInt6293 - (Static573.anInt9325 >> 4)) / 8;
			@Pc(867) int local867 = (Static360.anInt6293 + (Static573.anInt9325 >> 4)) / 8;
			for (@Pc(871) int local871 = local765 - 1; local871 <= local769 + 1; local871++) {
				for (@Pc(877) int local877 = local858 - 1; local877 <= local867 + 1; local877++) {
					if (local871 < local765 || local769 < local871 || local858 > local877 || local877 > local867) {
						Static373.aClass111_90.method2443("m" + local871 + "_" + local877);
						Static373.aClass111_90.method2443("l" + local871 + "_" + local877);
					}
				}
			}
		}
		if (Static177.anInt2101 == 4) {
			Static243.method3970(3);
		} else if (Static177.anInt2101 == 8) {
			Static243.method3970(7);
		} else {
			Static243.method3970(10);
			if (Static400.aClass75_3 != null) {
				local822 = Static320.method4867(Static442.aClass170_2, Static168.aClass319_61);
				Static34.method813(local822);
			}
		}
		Static140.method2301();
		Static99.method1834();
		Static164.method2524();
		if (Static189.aBoolean321) {
			Static374.method5444("Took: " + (Static255.method4035() - Static454.aLong340) + "ms");
			Static189.aBoolean321 = false;
		}
	}
}
