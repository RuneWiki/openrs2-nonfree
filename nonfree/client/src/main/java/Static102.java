import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!h;")
	public static Class1_Sub16 aClass1_Sub16_2;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "Lclient!km;")
	public static Class91 aClass91_85;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString139 = "wishes to trade with you.";

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public static int anInt2417 = 1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
	public static void method1902(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static239.aBoolean363) {
			Static239.aBoolean363 = arg0;
			Static106.method1949();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIIZII)V")
	public static void method1903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static279.anInt5382++;
		Static227.method3560();
		@Pc(32) int local32;
		if (arg2) {
			Static116.method4440(false, 0, false);
		} else {
			Static35.method1448(0);
			Static116.method4440(true, 0, false);
			if (Static246.anInt4896 == 0) {
				for (local32 = 1; local32 <= 5; local32++) {
					Static116.method4440(false, local32, false);
					Static116.method4440(false, local32, true);
					Static35.method1448(local32);
				}
			} else {
				for (local32 = 1; local32 <= 5; local32++) {
					Static35.method1448(local32);
					Static116.method4440(false, local32, false);
					Static116.method4440(false, local32, true);
				}
			}
		}
		if (!arg2) {
			Static61.method1095();
		}
		Static40.method826();
		if (Static277.aBoolean412) {
			Static253.method3879(arg4, arg0, true, arg1, arg3);
			arg3 = Static248.anInt4910;
			arg1 = Static38.anInt1002;
			arg4 = Static114.anInt2607;
			arg0 = Static150.anInt3231;
		}
		@Pc(126) int local126;
		if (Static220.anInt4376 == 1) {
			local32 = (int) Static125.aFloat20;
			if (local32 < Static196.anInt2438 / 256) {
				local32 = Static196.anInt2438 / 256;
			}
			local126 = (int) Static298.aFloat58 + Static118.anInt2738 & 0x7FF;
			if (Static71.aBooleanArray16[4] && local32 < Static181.anIntArray339[4] + 128) {
				local32 = Static181.anIntArray339[4] + 128;
			}
			Static268.method4064(local126, local32, arg1, local32 * 3 + 600, Static92.anInt2083, Static20.method383(Static197.aClass14_Sub2_Sub1_2.anInt4630, Static140.anInt3034, Static197.aClass14_Sub2_Sub1_2.anInt4680) - 50, Static114.anInt2610);
		} else if (Static220.anInt4376 == 5) {
			Static237.method3660(arg1);
		}
		local32 = Static69.anInt1504;
		local126 = Static297.anInt5618;
		@Pc(179) int local179 = Static134.anInt2950;
		@Pc(181) int local181 = Static239.anInt4738;
		@Pc(183) int local183 = Static91.anInt2040;
		@Pc(185) int local185;
		@Pc(229) int local229;
		for (local185 = 0; local185 < 5; local185++) {
			if (Static71.aBooleanArray16[local185]) {
				local229 = (int) ((double) (Static186.anIntArray345[local185] * 2 + 1) * Math.random() - (double) Static186.anIntArray345[local185] + Math.sin((double) Static246.anIntArray427[local185] * ((double) Static14.anIntArray35[local185] / 100.0D)) * (double) Static181.anIntArray339[local185]);
				if (local185 == 1) {
					Static297.anInt5618 += local229;
				}
				if (local185 == 3) {
					Static91.anInt2040 = Static91.anInt2040 + local229 & 0x7FF;
				}
				if (local185 == 4) {
					Static134.anInt2950 += local229;
					if (Static134.anInt2950 < 128) {
						Static134.anInt2950 = 128;
					}
					if (Static134.anInt2950 > 383) {
						Static134.anInt2950 = 383;
					}
				}
				if (local185 == 2) {
					Static239.anInt4738 += local229;
				}
				if (local185 == 0) {
					Static69.anInt1504 += local229;
				}
			}
		}
		Static85.method1486();
		@Pc(343) int local343;
		if (Static277.aBoolean412) {
			Static41.method847(arg3, arg4, arg0 + arg3, arg4 + arg1);
			@Pc(297) float local297 = (float) Static91.anInt2040 * 0.17578125F;
			@Pc(302) float local302 = (float) Static134.anInt2950 * 0.17578125F;
			if (Static220.anInt4376 == 3) {
				local302 = Static149.aFloat33 * 360.0F / 6.2831855F;
				local297 = Static139.aFloat25 * 360.0F / 6.2831855F;
			}
			if (Static194.anInt4017 == 10) {
				local343 = Static130.method2223(Static69.anInt1504 >> 10, Static285.anInt5431, Static239.anInt4738 >> 10, Static129.anInt2881);
			} else {
				local343 = Static130.method2223(Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] >> 3, Static285.anInt5431, Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] >> 3, Static129.anInt2881);
			}
			if (Static170.anInt3639 >= 0) {
				Static277.method4220();
				@Pc(369) Class100 local369 = Static63.method1126(Static143.anInt3072, Static170.anInt3639, Static128.anInt2844, Static203.anInt4126);
				local369.method2742(Static103.anInt2428, arg3, arg4, arg0, arg1, Static134.anInt2950, Static91.anInt2040, local343);
			} else {
				Static277.method4191(local343);
			}
			Static277.method4225(arg3, arg4, arg0, arg1, arg0 / 2 + arg3, arg4 + arg1 / 2, local302, local297, Static93.anInt2105, Static93.anInt2105);
			Static279.method4238(false);
			Static277.method4216();
			Static277.method4192(true);
			Static277.method4209(true);
		} else {
			Static50.method950(arg3, arg4, arg0 + arg3, arg1 + arg4);
			Static110.method2030();
			if (Static170.anInt3639 < 0) {
				Static50.method954(arg3, arg4, arg0, arg1, 0);
			} else {
				@Pc(441) Class100 local441 = Static63.method1126(Static143.anInt3072, Static170.anInt3639, Static128.anInt2844, Static203.anInt4126);
				local441.method2737(Static103.anInt2428, arg3, arg4, arg0, arg1, Static134.anInt2950, Static91.anInt2040);
			}
		}
		if (Static14.aBoolean23 || arg3 > Static137.anInt3016 || arg0 + arg3 <= Static137.anInt3016 || arg4 > Static29.anInt661 || Static29.anInt661 >= arg1 + arg4) {
			Static139.anInt3026 = 0;
			Static114.aBoolean186 = false;
		} else {
			Static139.anInt3026 = 0;
			local229 = Static128.anInt2846;
			local185 = Static169.anInt3630;
			local343 = Static209.anInt4169;
			Static114.aBoolean186 = true;
			Static298.anInt5620 = local185 + (Static137.anInt3016 - arg3) * (local229 - local185) / arg0;
			@Pc(502) int local502 = Static23.anInt474;
			Static264.anInt5179 = local343 + (Static29.anInt661 - arg4) * (-local343 + local502) / arg1;
		}
		Static105.method1947();
		@Pc(535) byte local535 = Static67.method1221() == 2 ? (byte) Static279.anInt5382 : 1;
		if (Static277.aBoolean412) {
			Static120.method2141(Static237.anInt4710, !Static200.aBoolean310);
			Static17.method3928(Static91.anInt2040, Static134.anInt2950, Static297.anInt5618, Static239.anInt4738, Static69.anInt1504);
			Static277.anInt5361 = Static237.anInt4710;
			Static240.method3696(Static69.anInt1504, Static297.anInt5618, Static239.anInt4738, Static134.anInt2950, Static91.anInt2040, Static35.aByteArrayArrayArray12, Static125.anIntArray258, Static232.anIntArray405, Static100.anIntArray212, Static18.anIntArray42, Static14.anIntArray33, Static140.anInt3034 + 1, local535, Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7, Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7);
			Static129.aBoolean215 = true;
			Static120.method2136();
			Static17.method3928(0, 0, 0, 0, 0);
			Static105.method1947();
			Static196.method1926(arg4, arg0, arg1, Static93.anInt2105, arg3, Static93.anInt2105);
			Static212.method3366(arg4, Static93.anInt2105, arg0, arg3, arg1, Static93.anInt2105);
			Static143.method2365();
		} else {
			Static240.method3696(Static69.anInt1504, Static297.anInt5618, Static239.anInt4738, Static134.anInt2950, Static91.anInt2040, Static35.aByteArrayArrayArray12, Static125.anIntArray258, Static232.anIntArray405, Static100.anIntArray212, Static18.anIntArray42, Static14.anIntArray33, Static140.anInt3034 + 1, local535, Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7, Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7);
			Static105.method1947();
			Static143.method2365();
			Static196.method1926(arg4, arg0, arg1, 256, arg3, 256);
			Static212.method3366(arg4, 256, arg0, arg3, arg1, 256);
		}
		((Class85_Sub1) Static110.anInterface2_1).method2278(Static129.anInt2881);
		Static21.method409(arg3, arg4, arg1, arg0);
		Static91.anInt2040 = local183;
		Static297.anInt5618 = local126;
		Static69.anInt1504 = local32;
		Static134.anInt2950 = local179;
		Static239.anInt4738 = local181;
		if (Static111.aBoolean184 && Static177.aClass162_3.method4043() == 0) {
			Static111.aBoolean184 = false;
		}
		if (Static111.aBoolean184) {
			if (Static277.aBoolean412) {
				Static41.method832(arg3, arg4, arg0, arg1, 0);
			} else {
				Static50.method954(arg3, arg4, arg0, arg1, 0);
			}
			Static21.method412(false, Static186.aString229);
		}
		if (!arg2 && !Static111.aBoolean184 && !Static14.aBoolean23 && arg3 <= Static137.anInt3016 && Static137.anInt3016 < arg0 + arg3 && Static29.anInt661 >= arg4 && arg4 + arg1 > Static29.anInt661) {
			Static284.method4266(arg1, Static137.anInt3016, arg4, Static29.anInt661, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZII)I")
	public static int method1904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static110.anIntArray224[Static271.method4128(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(26) int local26 = Static110.anInterface2_1.method2263(arg0 & 0xFFFF);
			@Pc(36) int local36;
			@Pc(61) int local61;
			if (local26 != 0) {
				if (arg2 < 0) {
					local36 = 0;
				} else if (arg2 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg2 * 131586;
				}
				if (local26 == 256) {
					local16 = local36;
				} else {
					local61 = 256 - local26;
					local16 = ((local16 & 0xFF00FF) * local61 + local26 * (local36 & 0xFF00FF) & 0xFF00FF00) + (local26 * (local36 & 0xFF00) + ((local16 & 0xFF00) * local61) & 0xFF0000) >> 8;
				}
			}
			local36 = Static110.anInterface2_1.method2271(arg0 & 0xFFFF);
			if (local36 != 0) {
				local36 += 256;
				@Pc(118) int local118 = (local16 >> 16 & 0xFF) * local36;
				if (local118 > 65535) {
					local118 = 65535;
				}
				@Pc(131) int local131 = (local16 & 0xFF) * local36;
				if (local131 > 65535) {
					local131 = 65535;
				}
				local61 = local36 * (local16 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				local16 = ((local118 & 0x2800FF00) << 8) + (local61 & 0xFF00) + (local131 >> 8);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIILclient!dn;JLclient!dn;Lclient!dn;)V")
	public static void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) Class14 arg7) {
		@Pc(3) Class31 local3 = new Class31();
		local3.aClass14_4 = arg4;
		local3.anInt1119 = arg1 * 128 + 64;
		local3.anInt1124 = arg2 * 128 + 64;
		local3.anInt1117 = arg3;
		local3.aLong45 = arg5;
		local3.aClass14_2 = arg6;
		local3.aClass14_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub26 local42 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt4090; local46++) {
				@Pc(55) Class25 local55 = local42.aClass25Array4[local46];
				if ((local55.aLong39 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass14_1.method4091();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt1118 = -local34;
		if (Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub26(arg0, arg1, arg2);
		}
		Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local3;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZZIIII)V")
	public static void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && Static181.anInt3792 == arg0 && Static153.anInt3329 == arg6 && (arg4 == Static226.anInt4504 || Static60.method1068())) {
			return;
		}
		Static153.anInt3329 = arg6;
		Static226.anInt4504 = arg4;
		Static181.anInt3792 = arg0;
		if (Static60.method1068()) {
			Static226.anInt4504 = 0;
		}
		if (arg1) {
			Static163.method2823(28);
		} else {
			Static163.method2823(25);
		}
		Static21.method412(true, Static186.aString229);
		@Pc(57) int local57 = Static83.anInt1875;
		Static83.anInt1875 = arg6 * 8 - 48;
		@Pc(65) int local65 = Static53.anInt5288;
		Static53.anInt5288 = arg0 * 8 - 48;
		Static236.aClass1_Sub2_Sub21_2 = Static82.method1393(Static153.anInt3329 * 8, Static181.anInt3792 * 8);
		@Pc(85) int local85 = Static83.anInt1875 - local57;
		Static92.aClass82_6 = null;
		@Pc(94) int local94 = Static53.anInt5288 - local65;
		@Pc(100) int local100;
		@Pc(109) Class14_Sub2_Sub2 local109;
		@Pc(114) int local114;
		if (arg1) {
			Static233.anInt4582 = 0;
			for (local100 = 0; local100 < 32768; local100++) {
				local109 = Static254.aClass14_Sub2_Sub2Array1[local100];
				if (local109 != null) {
					local109.anInt4630 -= local85 * 128;
					local109.anInt4680 -= local94 * 128;
					if (local109.anInt4680 >= 0 && local109.anInt4680 <= 13184 && local109.anInt4630 >= 0 && local109.anInt4630 <= 13184) {
						for (local114 = 0; local114 < 10; local114++) {
							local109.anIntArray415[local114] -= local94;
							local109.anIntArray418[local114] -= local85;
						}
						Static281.anIntArray464[Static233.anInt4582++] = local100;
					} else {
						Static254.aClass14_Sub2_Sub2Array1[local100].method3663(null);
						Static254.aClass14_Sub2_Sub2Array1[local100] = null;
					}
				}
			}
		} else {
			for (local100 = 0; local100 < 32768; local100++) {
				local109 = Static254.aClass14_Sub2_Sub2Array1[local100];
				if (local109 != null) {
					for (local114 = 0; local114 < 10; local114++) {
						local109.anIntArray415[local114] -= local94;
						local109.anIntArray418[local114] -= local85;
					}
					local109.anInt4630 -= local85 * 128;
					local109.anInt4680 -= local94 * 128;
				}
			}
		}
		for (local100 = 0; local100 < 2048; local100++) {
			@Pc(264) Class14_Sub2_Sub1 local264 = Static98.aClass14_Sub2_Sub1Array1[local100];
			if (local264 != null) {
				for (local114 = 0; local114 < 10; local114++) {
					local264.anIntArray415[local114] -= local94;
					local264.anIntArray418[local114] -= local85;
				}
				local264.anInt4680 -= local94 * 128;
				local264.anInt4630 -= local85 * 128;
			}
		}
		Static140.anInt3034 = arg4;
		@Pc(316) byte local316 = 104;
		@Pc(318) byte local318 = 0;
		@Pc(320) byte local320 = 1;
		if (local94 < 0) {
			local320 = -1;
			local316 = -1;
			local318 = 103;
		}
		@Pc(331) byte local331 = 104;
		Static197.aClass14_Sub2_Sub1_2.method1349(arg5, arg3, false);
		@Pc(339) byte local339 = 1;
		@Pc(341) byte local341 = 0;
		if (local85 < 0) {
			local339 = -1;
			local331 = -1;
			local341 = 103;
		}
		for (@Pc(353) int local353 = local318; local353 != local316; local353 += local320) {
			for (@Pc(362) int local362 = local341; local362 != local331; local362 += local339) {
				@Pc(374) int local374 = local362 + local85;
				@Pc(378) int local378 = local353 + local94;
				for (@Pc(380) int local380 = 0; local380 < 4; local380++) {
					if (local378 >= 0 && local374 >= 0 && local378 < 104 && local374 < 104) {
						Static229.aClass61ArrayArrayArray1[local380][local353][local362] = Static229.aClass61ArrayArrayArray1[local380][local378][local374];
					} else {
						Static229.aClass61ArrayArrayArray1[local380][local353][local362] = null;
					}
				}
			}
		}
		for (@Pc(449) Class1_Sub20 local449 = (Class1_Sub20) Static80.aClass61_3.method1835(); local449 != null; local449 = (Class1_Sub20) Static80.aClass61_3.method1836()) {
			local449.anInt3341 -= local85;
			local449.anInt3353 -= local94;
			if (local449.anInt3353 < 0 || local449.anInt3341 < 0 || local449.anInt3353 >= 104 || local449.anInt3341 >= 104) {
				local449.method4441();
			}
		}
		if (arg1) {
			Static244.anInt4843 -= local94;
			Static239.anInt4738 -= local85 * 128;
			Static76.anInt1612 -= local85;
			Static189.anInt3906 -= local85;
			Static69.anInt1504 -= local94 * 128;
			Static188.anInt3900 -= local94;
		} else {
			Static220.anInt4376 = 1;
		}
		if (Static45.anInt1101 != 0) {
			Static44.anInt1074 -= local85;
			Static45.anInt1101 -= local94;
		}
		Static103.anInt2427 = 0;
		if (Static277.aBoolean412 && arg1 && (Math.abs(local94) > 104 || Math.abs(local85) > 104)) {
			Static149.method2601();
		}
		Static242.anInt4790 = -1;
		Static211.aClass61_23.method1845();
		Static201.aClass61_22.method1845();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public static void method1908() {
		Static272.aClass70_20.method2082();
		Static3.aClass140_1.method3417();
		Static109.aClass140_3.method3417();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZBI)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static14.aLong18 = 0L;
		@Pc(8) int local8 = Static31.method647();
		@Pc(10) boolean local10 = false;
		if (arg0 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (arg0 <= 0 != local8 <= 0) {
			local10 = true;
		}
		if (Static288.aString328.startsWith("mac") && arg0 > 0) {
			arg2 = true;
		}
		if (arg2 && arg0 > 0) {
			local10 = true;
		}
		Static19.method362(arg0, arg1, arg2, local10, local8, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Z")
	public static boolean method1910(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static61.aShortArray23[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1002;
	}
}
