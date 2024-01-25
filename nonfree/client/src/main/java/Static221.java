import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hu", name = "D", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "Lclient!hv;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "[I")
	public static final int[] anIntArray289 = new int[13];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public static void method4286() {
		Static111.method2712(false);
		Static375.anInt7103 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static166.aByteArrayArray8.length; local14++) {
			if (Static210.anIntArray279[local14] != -1 && Static166.aByteArrayArray8[local14] == null) {
				Static166.aByteArrayArray8[local14] = Static123.aClass181_28.method5023(Static210.anIntArray279[local14], 0);
				if (Static166.aByteArrayArray8[local14] == null) {
					Static375.anInt7103++;
					local12 = false;
				}
			}
			if (Static330.anIntArray389[local14] != -1 && Static89.aByteArrayArray4[local14] == null) {
				Static89.aByteArrayArray4[local14] = Static123.aClass181_28.method5041(Static330.anIntArray389[local14], Static330.anIntArrayArray59[local14], 0);
				if (Static89.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static375.anInt7103++;
				}
			}
			if (Static507.anIntArray563[local14] != -1 && Static378.aByteArrayArray14[local14] == null) {
				Static378.aByteArrayArray14[local14] = Static123.aClass181_28.method5023(Static507.anIntArray563[local14], 0);
				if (Static378.aByteArrayArray14[local14] == null) {
					Static375.anInt7103++;
					local12 = false;
				}
			}
			if (Static492.anIntArray553[local14] != -1 && Static63.aByteArrayArray3[local14] == null) {
				Static63.aByteArrayArray3[local14] = Static123.aClass181_28.method5023(Static492.anIntArray553[local14], 0);
				if (Static63.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static375.anInt7103++;
				}
			}
			if (Static231.anIntArray306 != null && Static172.aByteArrayArray9[local14] == null && Static231.anIntArray306[local14] != -1) {
				Static172.aByteArrayArray9[local14] = Static123.aClass181_28.method5041(Static231.anIntArray306[local14], Static330.anIntArrayArray59[local14], 0);
				if (Static172.aByteArrayArray9[local14] == null) {
					Static375.anInt7103++;
					local12 = false;
				}
			}
		}
		if (Static236.aClass57_3 == null) {
			if (Static492.aClass3_Sub1_Sub16_3 == null || !Static35.aClass181_4.method5034(Static492.aClass3_Sub1_Sub16_3.aString75 + "_staticelements")) {
				Static236.aClass57_3 = new Class57(0);
			} else if (Static35.aClass181_4.method5038(Static492.aClass3_Sub1_Sub16_3.aString75 + "_staticelements")) {
				Static236.aClass57_3 = Static74.method1856(Static87.aBoolean195, Static35.aClass181_4, Static492.aClass3_Sub1_Sub16_3.aString75 + "_staticelements");
			} else {
				Static375.anInt7103++;
				local12 = false;
			}
		}
		if (!local12) {
			Static621.anInt10312 = 1;
			return;
		}
		local12 = true;
		Static320.anInt6482 = 0;
		@Pc(268) int local268;
		@Pc(278) int local278;
		for (@Pc(249) int local249 = 0; local249 < Static166.aByteArrayArray8.length; local249++) {
			@Pc(255) byte[] local255 = Static89.aByteArrayArray4[local249];
			if (local255 != null) {
				local268 = (Static475.anIntArray531[local249] >> 8) * 64 - Static446.anInt8090;
				local278 = (Static475.anIntArray531[local249] & 0xFF) * 64 - Static124.anInt3150;
				if (Static631.anInt10399 != 0) {
					local268 = 10;
					local278 = 10;
				}
				local12 &= Static286.method4980(local268, local278, local255, Static394.anInt7540, Static462.anInt8391);
			}
			local255 = Static63.aByteArrayArray3[local249];
			if (local255 != null) {
				local268 = (Static475.anIntArray531[local249] >> 8) * 64 - Static446.anInt8090;
				local278 = (Static475.anIntArray531[local249] & 0xFF) * 64 - Static124.anInt3150;
				if (Static631.anInt10399 != 0) {
					local278 = 10;
					local268 = 10;
				}
				local12 &= Static286.method4980(local268, local278, local255, Static394.anInt7540, Static462.anInt8391);
			}
		}
		if (!local12) {
			Static621.anInt10312 = 2;
			return;
		}
		if (Static621.anInt10312 != 0) {
			Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_12.method4986(Static380.anInt7247) + "<br>(100%)");
		}
		Static14.method8598();
		Static598.method8184();
		Static235.method4530();
		@Pc(375) boolean local375 = false;
		if (Static47.aClass33_3.method6235() && Static552.aClass3_Sub48_30.aClass23_Sub26_1.method7099() == 2) {
			for (local268 = 0; local268 < Static166.aByteArrayArray8.length; local268++) {
				if (Static63.aByteArrayArray3[local268] != null || Static378.aByteArrayArray14[local268] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub28_1.method7679() == 1) {
			local268 = Static291.anIntArray348[Static582.anInt9733];
		} else {
			local268 = Static493.anIntArray556[Static582.anInt9733];
		}
		if (Static47.aClass33_3.method6192()) {
			local268++;
		}
		Static362.method5869(Static47.aClass33_3, Static134.anInt3479, Static394.anInt7540, Static462.anInt8391, local268, local375, Static47.aClass33_3.method6226() > 0);
		Static298.method5767(Static154.anInt3784);
		if (Static154.anInt3784 == 0) {
			Static350.method5753(null);
		} else {
			Static350.method5753(Static641.aClass25_14);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static334.aClass291Array20[local278].method7196();
		}
		Static137.method3123();
		Static471.method6995(false);
		Static39.method752();
		Static278.aClass147_5 = null;
		Static537.aBoolean779 = false;
		Static14.method8598();
		System.gc();
		Static111.method2712(true);
		Static109.method2702();
		Static54.anInt4726 = Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537();
		Static23.aBoolean32 = Static6.anInt66 >= 96;
		Static236.aBoolean471 = Static552.aClass3_Sub48_30.aClass23_Sub26_1.method7099() == 2;
		Static385.aBoolean888 = Static552.aClass3_Sub48_30.aClass23_Sub7_1.method3329() == 1;
		Static403.anInt4294 = Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 1 ? -1 : Static630.anInt10396;
		Static242.aBoolean482 = Static552.aClass3_Sub48_30.aClass23_Sub16_1.method4881() == 1;
		Static379.aBoolean626 = Static552.aClass3_Sub48_30.aClass23_Sub4_1.method1180() == 1;
		Static593.aClass132_Sub1_2 = new Class132_Sub1(4, Static394.anInt7540, Static462.anInt8391, false);
		if (Static631.anInt10399 == 0) {
			Static267.method4897(Static166.aByteArrayArray8, Static593.aClass132_Sub1_2);
		} else {
			Static233.method4484(Static166.aByteArrayArray8, Static593.aClass132_Sub1_2);
		}
		Static215.method4222(Static394.anInt7540 >> 4, Static462.anInt8391 >> 4);
		Static49.method1148();
		if (local375) {
			Static526.method6820(true);
			Static78.aClass132_Sub1_1 = new Class132_Sub1(1, Static394.anInt7540, Static462.anInt8391, true);
			if (Static631.anInt10399 == 0) {
				Static267.method4897(Static378.aByteArrayArray14, Static78.aClass132_Sub1_1);
				Static111.method2712(true);
			} else {
				Static233.method4484(Static378.aByteArrayArray14, Static78.aClass132_Sub1_1);
				Static111.method2712(true);
			}
			Static78.aClass132_Sub1_1.method7710(Static593.aClass132_Sub1_2.anIntArrayArrayArray12[0]);
			Static78.aClass132_Sub1_1.method7711(null, Static47.aClass33_3, null);
			Static526.method6820(false);
		}
		Static593.aClass132_Sub1_2.method7711(local375 ? Static78.aClass132_Sub1_1.anIntArrayArrayArray12 : null, Static47.aClass33_3, Static334.aClass291Array20);
		if (Static631.anInt10399 == 0) {
			Static111.method2712(true);
			Static518.method8301(Static593.aClass132_Sub1_2, Static89.aByteArrayArray4);
			if (Static172.aByteArrayArray9 != null) {
				Static333.method4603();
			}
		} else {
			Static111.method2712(true);
			Static367.method5895(Static89.aByteArrayArray4, Static593.aClass132_Sub1_2);
		}
		Static598.method8184();
		if (Static6.anInt66 < 96) {
			Static398.method6368();
		}
		Static111.method2712(true);
		Static593.aClass132_Sub1_2.method7712(Static47.aClass33_3, local375 ? Static524.aClass274Array3[0] : null, null);
		Static593.aClass132_Sub1_2.method7720(false, Static47.aClass33_3);
		Static111.method2712(true);
		if (local375) {
			Static526.method6820(true);
			Static111.method2712(true);
			if (Static631.anInt10399 == 0) {
				Static518.method8301(Static78.aClass132_Sub1_1, Static63.aByteArrayArray3);
			} else {
				Static367.method5895(Static63.aByteArrayArray3, Static78.aClass132_Sub1_1);
			}
			Static598.method8184();
			Static111.method2712(true);
			Static78.aClass132_Sub1_1.method7712(Static47.aClass33_3, null, Static445.aClass274Array1[0]);
			Static78.aClass132_Sub1_1.method7720(true, Static47.aClass33_3);
			Static111.method2712(true);
			Static526.method6820(false);
		}
		Static207.method4082();
		@Pc(756) int local756 = Static593.aClass132_Sub1_2.anInt9355;
		if (Static552.anInt9440 < local756) {
			local756 = Static552.anInt9440;
		}
		if (local756 < Static552.anInt9440 - 1) {
			local756 = Static552.anInt9440 - 1;
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0) {
			Static164.method7297(local756);
		} else {
			Static164.method7297(0);
		}
		@Pc(795) int local795;
		@Pc(799) int local799;
		for (@Pc(791) int local791 = 0; local791 < 4; local791++) {
			for (local795 = 0; local795 < Static394.anInt7540; local795++) {
				for (local799 = 0; local799 < Static462.anInt8391; local799++) {
					Static10.method116(local791, local799, local795);
				}
			}
		}
		Static159.method3381();
		Static14.method8598();
		Static100.method2541();
		Static598.method8184();
		Static468.method6982();
		@Pc(852) Class3_Sub26 local852;
		if (Static599.aFrame141 != null && Static412.aClass51_25 != null && Static581.anInt9720 == 11) {
			local852 = Static640.method8636(Static230.aClass344_58, Static403.aClass294_3);
			local852.aClass3_Sub15_Sub1_3.method8419(1057001181);
			Static472.method5189(local852);
		}
		if (Static631.anInt10399 == 0) {
			local795 = (Static472.anInt6106 - (Static394.anInt7540 >> 4)) / 8;
			local799 = (Static472.anInt6106 + (Static394.anInt7540 >> 4)) / 8;
			@Pc(892) int local892 = (Static79.anInt1964 - (Static462.anInt8391 >> 4)) / 8;
			@Pc(900) int local900 = ((Static462.anInt8391 >> 4) + Static79.anInt1964) / 8;
			for (@Pc(904) int local904 = local795 - 1; local904 <= local799 + 1; local904++) {
				for (@Pc(910) int local910 = local892 - 1; local910 <= local900 + 1; local910++) {
					if (local795 > local904 || local904 > local799 || local910 < local892 || local910 > local900) {
						Static123.aClass181_28.method5051("m" + local904 + "_" + local910);
						Static123.aClass181_28.method5051("l" + local904 + "_" + local910);
					}
				}
			}
		}
		if (Static581.anInt9720 == 4) {
			Static182.method3694(3);
		} else if (Static581.anInt9720 == 8) {
			Static182.method3694(7);
		} else {
			Static182.method3694(10);
			if (Static412.aClass51_25 != null) {
				local852 = Static640.method8636(Static484.aClass344_105, Static403.aClass294_3);
				Static472.method5189(local852);
			}
		}
		Static253.method4770();
		Static14.method8598();
		Static123.method2861();
		Static160.aBoolean330 = true;
		if (Static619.aBoolean862) {
			Static117.method2792("Took: " + (Static444.method6719() - Static572.aLong253) + "ms");
			Static619.aBoolean862 = false;
		}
	}
}
