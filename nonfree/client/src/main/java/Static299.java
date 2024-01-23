import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
	public static int anInt5347;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Lclient!sm;")
	public static Class164 aClass164_1 = new Class164();

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "Lclient!vh;")
	public static Class187 aClass187_149 = new Class187(16);

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
	public static void method4545() {
		Static157.method1360(false);
		Static193.anInt3675 = 0;
		@Pc(10) boolean local10 = true;
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static54.aByteArrayArray2.length; local12++) {
			if (Static47.anIntArray59[local12] != -1 && Static54.aByteArrayArray2[local12] == null) {
				Static54.aByteArrayArray2[local12] = Static313.aClass121_73.method3115(Static47.anIntArray59[local12], 0);
				if (Static54.aByteArrayArray2[local12] == null) {
					Static193.anInt3675++;
					local10 = false;
				}
			}
			if (Static130.anIntArray225[local12] != -1 && Static175.aByteArrayArray8[local12] == null) {
				Static175.aByteArrayArray8[local12] = Static313.aClass121_73.method3111(Static281.anIntArrayArray42[local12], 0, Static130.anIntArray225[local12]);
				if (Static175.aByteArrayArray8[local12] == null) {
					Static193.anInt3675++;
					local10 = false;
				}
			}
			if (Static156.aBoolean211) {
				if (Static168.anIntArray280[local12] != -1 && Static115.aByteArrayArray5[local12] == null) {
					Static115.aByteArrayArray5[local12] = Static313.aClass121_73.method3115(Static168.anIntArray280[local12], 0);
					if (Static115.aByteArrayArray5[local12] == null) {
						local10 = false;
						Static193.anInt3675++;
					}
				}
				if (Static129.anIntArray224[local12] != -1 && Static306.aByteArrayArray17[local12] == null) {
					Static306.aByteArrayArray17[local12] = Static313.aClass121_73.method3115(Static129.anIntArray224[local12], 0);
					if (Static306.aByteArrayArray17[local12] == null) {
						Static193.anInt3675++;
						local10 = false;
					}
				}
			}
			if (Static222.anIntArray345 != null && Static309.aByteArrayArray18[local12] == null && Static222.anIntArray345[local12] != -1) {
				Static309.aByteArrayArray18[local12] = Static313.aClass121_73.method3111(Static281.anIntArrayArray42[local12], 0, Static222.anIntArray345[local12]);
				if (Static309.aByteArrayArray18[local12] == null) {
					Static193.anInt3675++;
					local10 = false;
				}
			}
		}
		if (Static228.aClass150_2 == null) {
			if (Static199.aClass1_Sub2_Sub21_2 == null || !Static242.aClass121_104.method3120(Static199.aClass1_Sub2_Sub21_2.aString301 + "_labels")) {
				Static228.aClass150_2 = new Class150(0);
			} else if (Static242.aClass121_104.method3114(Static199.aClass1_Sub2_Sub21_2.aString301 + "_labels")) {
				Static228.aClass150_2 = Static45.method887(Static199.aClass1_Sub2_Sub21_2.aString301 + "_labels", Static242.aClass121_104, Static254.aBoolean315);
			} else {
				local10 = false;
				Static193.anInt3675++;
			}
		}
		if (!local10) {
			Static63.anInt3251 = 1;
			return;
		}
		local10 = true;
		Static258.anInt4706 = 0;
		@Pc(309) int local309;
		@Pc(298) int local298;
		for (local12 = 0; local12 < Static54.aByteArrayArray2.length; local12++) {
			@Pc(285) byte[] local285 = Static175.aByteArrayArray8[local12];
			if (local285 != null) {
				local298 = (Static224.anIntArray348[local12] & 0xFF) * 64 - Static192.anInt3637;
				local309 = (Static224.anIntArray348[local12] >> 8) * 64 - Static199.anInt3817;
				if (Static284.aBoolean349) {
					local298 = 10;
					local309 = 10;
				}
				local10 &= Static189.method3085(local298, local309, local285);
			}
			if (Static156.aBoolean211) {
				local285 = Static306.aByteArrayArray17[local12];
				if (local285 != null) {
					local309 = (Static224.anIntArray348[local12] >> 8) * 64 - Static199.anInt3817;
					local298 = (Static224.anIntArray348[local12] & 0xFF) * 64 - Static192.anInt3637;
					if (Static284.aBoolean349) {
						local309 = 10;
						local298 = 10;
					}
					local10 &= Static189.method3085(local298, local309, local285);
				}
			}
		}
		if (!local10) {
			Static63.anInt3251 = 2;
			return;
		}
		if (Static63.anInt3251 != 0) {
			Static1.method14(true, Static180.aString200 + "<br>(100%)");
		}
		Static115.method2067();
		@Pc(395) boolean local395 = false;
		Static259.method4090();
		@Pc(410) int local410;
		if (Static156.aBoolean211 && Static187.aBoolean243) {
			for (local410 = 0; local410 < Static54.aByteArrayArray2.length; local410++) {
				if (Static306.aByteArrayArray17[local410] != null || Static115.aByteArrayArray5[local410] != null) {
					local395 = true;
					break;
				}
			}
		}
		Static52.method4717(Static156.aBoolean211 ? 28 : 25, local395);
		for (local410 = 0; local410 < 4; local410++) {
			Static240.aClass118Array1[local410].method3038();
		}
		for (local410 = 0; local410 < 4; local410++) {
			for (local309 = 0; local309 < 104; local309++) {
				for (local298 = 0; local298 < 104; local298++) {
					Static104.aByteArrayArrayArray3[local410][local309][local298] = 0;
				}
			}
		}
		Static21.method361(false);
		if (Static156.aBoolean211) {
			Static150.aClass23_Sub1_2.method1492();
			for (local410 = 0; local410 < 13; local410++) {
				for (local309 = 0; local309 < 13; local309++) {
					Static150.aClass42ArrayArray1[local410][local309].aBoolean83 = true;
				}
			}
		}
		if (Static156.aBoolean211) {
			Static101.method1823();
		}
		if (Static156.aBoolean211) {
			Static218.method1096();
		}
		Static115.method2067();
		System.gc();
		Static157.method1360(true);
		Static287.method4398(false);
		if (!Static284.aBoolean349) {
			Static70.method1409(false);
			Static157.method1360(true);
			if (Static156.aBoolean211) {
				local410 = Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] >> 3;
				local309 = Static90.aClass15_Sub5_Sub2_2.anIntArray504[0] >> 3;
				Static222.method3452(local410, local309);
			}
			Static136.method2367(false);
			if (Static309.aByteArrayArray18 != null) {
				Static63.method2809();
			}
		}
		if (Static284.aBoolean349) {
			Static139.method2415(false);
			Static157.method1360(true);
			if (Static156.aBoolean211) {
				local309 = Static90.aClass15_Sub5_Sub2_2.anIntArray504[0] >> 3;
				local410 = Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] >> 3;
				Static222.method3452(local410, local309);
			}
			Static209.method3327(false);
		}
		Static259.method4090();
		Static157.method1360(true);
		Static254.method4038(Static240.aClass118Array1, false, Static284.aBoolean349 ? Static4.anIntArrayArrayArray1 : (int[][][]) null);
		if (Static156.aBoolean211) {
			Static101.method1822();
		}
		Static157.method1360(true);
		local410 = Static251.anInt4555;
		if (Static65.anInt1300 < local410) {
			local410 = Static65.anInt1300;
		}
		if (Static65.anInt1300 - 1 <= local410) {
		}
		if (Static278.method4290()) {
			Static112.method2014(0);
		} else {
			Static112.method2014(Static251.anInt4555);
		}
		Static212.method607();
		if (Static156.aBoolean211 && local395) {
			Static76.method1484(true);
			Static287.method4398(true);
			if (!Static284.aBoolean349) {
				Static70.method1409(true);
				Static157.method1360(true);
				Static136.method2367(true);
			}
			if (Static284.aBoolean349) {
				Static139.method2415(true);
				Static157.method1360(true);
				Static209.method3327(true);
			}
			Static259.method4090();
			Static157.method1360(true);
			Static254.method4038(Static240.aClass118Array1, true, Static284.aBoolean349 ? Static4.anIntArrayArrayArray1 : (int[][][]) null);
			Static157.method1360(true);
			Static212.method607();
			Static76.method1484(false);
		}
		if (Static156.aBoolean211) {
			for (local309 = 0; local309 < 13; local309++) {
				for (local298 = 0; local298 < 13; local298++) {
					Static150.aClass42ArrayArray1[local309][local298].method1237(Static24.anIntArrayArrayArray2[0], local309 * 8, local298 * 8);
				}
			}
		}
		for (local309 = 0; local309 < 104; local309++) {
			for (local298 = 0; local298 < 104; local298++) {
				Static143.method2465(local309, local298);
			}
		}
		Static132.method3147();
		Static115.method2067();
		Static285.method4384();
		Static259.method4090();
		Static140.aBoolean355 = false;
		if (Static156.aBoolean211) {
			Static249.method3933(true);
		}
		if (Static197.aFrame1 != null && Static5.aClass97_1 != null && Static37.anInt773 == 25) {
			Static127.aClass1_Sub14_Sub1_3.method1408(54);
			Static127.aClass1_Sub14_Sub1_3.method1387(1057001181);
		}
		if (!Static284.aBoolean349) {
			@Pc(839) int local839 = (Static11.anInt171 + 6) / 8;
			local298 = (Static129.anInt2589 + 6) / 8;
			local309 = (Static129.anInt2589 - 6) / 8;
			@Pc(857) int local857 = (Static11.anInt171 - 6) / 8;
			for (@Pc(861) int local861 = local309 - 1; local861 <= local298 + 1; local861++) {
				for (@Pc(874) int local874 = local857 - 1; local874 <= local839 + 1; local874++) {
					if (local861 < local309 || local861 > local298 || local857 > local874 || local874 > local839) {
						Static313.aClass121_73.method3119("m" + local861 + "_" + local874);
						Static313.aClass121_73.method3119("l" + local861 + "_" + local874);
					}
				}
			}
		}
		if (Static37.anInt773 == 28) {
			Static65.method1215(10);
		} else {
			Static65.method1215(30);
			if (Static5.aClass97_1 != null) {
				Static127.aClass1_Sub14_Sub1_3.method1408(29);
			}
		}
		Static66.method3666();
		Static115.method2067();
		Static57.method1003();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!nk;Z)V")
	public static void method4546(@OriginalArg(0) Class121 arg0) {
		Static129.aClass121_60 = arg0;
		Static114.anInt2376 = Static129.aClass121_60.method3125(4);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!wf;IIZ)V")
	public static void method4547(@OriginalArg(0) Class15_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg0.anInt5594 && arg1 != -1) {
			@Pc(80) Class157 local80 = Static80.method1561(arg1);
			@Pc(83) int local83 = local80.anInt4524;
			if (local83 == 1) {
				arg0.anInt5522 = 1;
				arg0.anInt5539 = 0;
				arg0.anInt5538 = 0;
				arg0.anInt5585 = arg2;
				arg0.anInt5537 = 0;
				Static31.method503(local80, arg0.anInt5537, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
			}
			if (local83 == 2) {
				arg0.anInt5538 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt5594 == -1 || Static80.method1561(arg1).anInt4512 >= Static80.method1561(arg0.anInt5594).anInt4512) {
			arg0.anInt5522 = 1;
			arg0.anInt5589 = arg0.anInt5578;
			arg0.anInt5537 = 0;
			arg0.anInt5539 = 0;
			arg0.anInt5585 = arg2;
			arg0.anInt5538 = 0;
			arg0.anInt5594 = arg1;
			if (arg0.anInt5594 != -1) {
				Static31.method503(Static80.method1561(arg0.anInt5594), arg0.anInt5537, arg0.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg0, arg0.anInt5559);
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4548(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static120.anInt2510; local18++) {
			if (arg0.equalsIgnoreCase(Static106.aStringArray16[local18])) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	public static int method4549(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	public static void method4551() {
		Static70.aClass187_45.method4525();
	}
}
