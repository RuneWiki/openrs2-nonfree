import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!bk", name = "S", descriptor = "Lclient!pd;")
	public static Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "Lclient!hc;")
	public static Class51 aClass51_10;

	@OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString34 = "cyan:";

	@OriginalMember(owner = "client!bk", name = "ab", descriptor = "[Lclient!ca;")
	public static Class9_Sub3[] aClass9_Sub3Array1 = new Class9_Sub3[4];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!hc;B)V")
	public static void method477(@OriginalArg(0) Class51 arg0) {
		Static46.aClass51_18 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!hc;I)I")
	public static int method478(@OriginalArg(0) Class51 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method1868(Static136.anInt3376)) {
			local1++;
		}
		if (arg0.method1868(Static207.anInt4554)) {
			local1++;
		}
		if (arg0.method1868(Static119.anInt3086)) {
			local1++;
		}
		if (arg0.method1868(Static63.anInt1769)) {
			local1++;
		}
		if (arg0.method1868(Static132.anInt3285)) {
			local1++;
		}
		if (arg0.method1868(Static4.anInt109)) {
			local1++;
		}
		if (arg0.method1868(Static51.anInt1456)) {
			local1++;
		}
		if (arg0.method1868(Static85.anInt2426)) {
			local1++;
		}
		if (arg0.method1868(Static204.anInt4527)) {
			local1++;
		}
		if (arg0.method1868(Static68.anInt1405)) {
			local1++;
		}
		if (arg0.method1868(Static109.anInt2900)) {
			local1++;
		}
		if (arg0.method1868(Static74.anInt2036)) {
			local1++;
		}
		if (arg0.method1868(Static202.anInt4465)) {
			local1++;
		}
		if (arg0.method1868(Static266.anInt5552)) {
			local1++;
		}
		if (arg0.method1868(Static137.anInt3325)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZJ)V")
	public static void method479(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static167.anInt3911; local17++) {
			if (Static150.aLongArray23[local17] == arg0) {
				Static167.anInt3911--;
				for (@Pc(35) int local35 = local17; local35 < Static167.anInt3911; local35++) {
					Static150.aLongArray23[local35] = Static150.aLongArray23[local35 + 1];
					Static226.aStringArray37[local35] = Static226.aStringArray37[local35 + 1];
					Static181.aBooleanArray16[local35] = Static181.aBooleanArray16[local35 + 1];
				}
				Static52.anInt1461 = Static243.anInt5249;
				Static171.aClass1_Sub13_Sub1_3.method1825(57);
				Static171.aClass1_Sub13_Sub1_3.method1770(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZIILclient!gj;Lclient!gh;IIIIIIIII)Lclient!gh;")
	public static Class9_Sub5 method480(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) Class9_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) long local26 = ((long) arg6 << 48) + ((long) arg10 << 32) + (long) ((arg8 << 24) + arg7 + (arg1 << 16));
		@Pc(32) Class9_Sub5 local32 = (Class9_Sub5) Static212.aClass79_31.method2483(local26);
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(144) int local144;
		if (local32 == null) {
			@Pc(39) byte local39;
			if (arg7 == 1) {
				local39 = 9;
			} else if (arg7 == 2) {
				local39 = 12;
			} else if (arg7 == 3) {
				local39 = 15;
			} else if (arg7 == 4) {
				local39 = 18;
			} else {
				local39 = 21;
			}
			@Pc(86) Class9_Sub3 local86 = new Class9_Sub3(local39 * 3 + 1, -local39 + local39 * 2 * 3, 0);
			@Pc(90) int[][] local90 = new int[3][local39];
			local96 = local86.method533(0, 0);
			@Pc(111) int[] local111 = new int[] { 64, 96, 128 };
			@Pc(125) int local125;
			@Pc(154) int local154;
			for (local113 = 0; local113 < 3; local113++) {
				local119 = local111[local113];
				local123 = local111[local113];
				for (local125 = 0; local125 < local39; local125++) {
					@Pc(133) int local133 = (local125 << 11) / local39;
					local144 = arg2 + Class132.anIntArray440[local133] * local119 >> 16;
					local154 = Class132.anIntArray439[local133] * local123 + arg12 >> 16;
					local90[local113][local125] = local86.method533(local144, local154);
				}
			}
			for (local119 = 0; local119 < 3; local119++) {
				local123 = (local119 * 256 + 128) / 3;
				local125 = 256 - local123;
				@Pc(200) byte local200 = (byte) (local125 * arg1 + arg8 * local123 >> 8);
				@Pc(245) short local245 = (short) (((arg10 & 0x7F) * local125 + (arg6 & 0x7F) * local123 & 0x7F00) + ((arg10 & 0x380) * local125 + (arg6 & 0x380) * local123 & 0x38000) + (local123 * (arg6 & 0xFC00) + (arg10 & 0xFC00) * local125 & 0xFC0000) >> 8);
				for (local154 = 0; local154 < local39; local154++) {
					if (local119 == 0) {
						local86.method542(local96, local90[0][(local154 + 1) % local39], local90[0][local154], local245, local200);
					} else {
						local86.method542(local90[local119 - 1][local154], local90[local119 - 1][(local154 + 1) % local39], local90[local119][(local154 + 1) % local39], local245, local200);
						local86.method542(local90[local119 - 1][local154], local90[local119][(local154 + 1) % local39], local90[local119][local154], local245, local200);
					}
				}
			}
			local32 = local86.method526(64, 768, -50, -10, -50);
			Static212.aClass79_31.method2486(local32, local26);
		}
		@Pc(370) int local370 = arg7 * 64 - 1;
		@Pc(373) int local373 = -local370;
		@Pc(375) int local375 = local370;
		@Pc(378) int local378 = arg4.method3616();
		local96 = local370;
		@Pc(383) int local383 = -local370;
		if (arg0) {
			if (arg9 > 640 && arg9 < 1408) {
				local96 = local370 + 128;
			}
			if (arg9 > 1664 || arg9 < 384) {
				local373 -= 128;
			}
			if (arg9 > 1152 && arg9 < 1920) {
				local375 = local370 + 128;
			}
			if (arg9 > 128 && arg9 < 896) {
				local383 -= 128;
			}
		}
		if (local378 < local383) {
			local378 = local383;
		}
		local113 = arg4.method3599();
		if (local113 > local375) {
			local113 = local375;
		}
		local119 = arg4.method3608();
		local123 = arg4.method3602();
		if (local96 < local123) {
			local123 = local96;
		}
		@Pc(449) Class1_Sub2_Sub8 local449 = null;
		if (arg3 != null) {
			@Pc(456) int local456 = arg3.anIntArray168[arg5];
			local449 = Static210.method3478(local456 >> 16);
			arg5 = local456 & 0xFFFF;
		}
		if (local119 < local373) {
			local119 = local373;
		}
		if (local449 == null) {
			local32 = local32.method3625(true, true, true);
			local32.method3606((local113 - local378) / 2, 128, (local123 - local119) / 2);
			local32.method3613((local113 + local378) / 2, 0, (local119 + local123) / 2);
		} else {
			local32 = local32.method3625(!local449.method1657(arg5), !local449.method1660(arg5), true);
			local32.method3606((local113 - local378) / 2, 128, (local123 - local119) / 2);
			local32.method3613((local113 + local378) / 2, 0, (local123 + local119) / 2);
			local32.method3598(local449, arg5);
		}
		if (arg9 != 0) {
			local32.method3622(arg9);
		}
		@Pc(570) Class9_Sub5_Sub1 local570 = (Class9_Sub5_Sub1) local32;
		if (Static200.method3326(Static137.anInt3321, arg12 + local119, arg2 + local378) != arg11 || arg11 != Static200.method3326(Static137.anInt3321, local123 + arg12, arg2 - -local113)) {
			for (local144 = 0; local144 < local570.anInt4809; local144++) {
				local570.anIntArray398[local144] += Static200.method3326(Static137.anInt3321, arg12 + local570.anIntArray393[local144], local570.anIntArray397[local144] + arg2) - arg11;
			}
			local570.aBoolean248 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZLclient!jb;BIIIIIII)V")
	public static void method482(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg0 && !Static25.method507() && (Static145.aByteArrayArrayArray13[0][arg5][arg2] & 0x2) == 0) {
			if ((Static145.aByteArrayArrayArray13[arg3][arg5][arg2] & 0x10) != 0) {
				return;
			}
			if (Static172.method2976(arg5, arg2, arg3) != Static171.anInt3993) {
				return;
			}
		}
		if (arg3 < Static124.anInt3159) {
			Static124.anInt3159 = arg3;
		}
		@Pc(55) Class31 local55 = Static77.method1518(arg8);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (arg7 == 1 || arg7 == 3) {
			local66 = local55.anInt1331;
			local69 = local55.anInt1321;
		} else {
			local69 = local55.anInt1331;
			local66 = local55.anInt1321;
		}
		@Pc(99) int local99;
		@Pc(93) int local93;
		if (arg5 + local66 <= 104) {
			local93 = arg5 + (local66 + 1 >> 1);
			local99 = (local66 >> 1) + arg5;
		} else {
			local99 = arg5;
			local93 = arg5 + 1;
		}
		@Pc(120) int local120;
		@Pc(118) int local118;
		if (arg2 + local69 > 104) {
			local118 = arg2 + 1;
			local120 = arg2;
		} else {
			local120 = (local69 >> 1) + arg2;
			local118 = (local69 + 1 >> 1) + arg2;
		}
		@Pc(144) int local144 = (local66 << 6) + (arg5 << 7);
		@Pc(148) int[][] local148 = Static38.anIntArrayArrayArray6[arg6];
		@Pc(175) int local175 = local148[local93][local120] + local148[local99][local120] + local148[local99][local118] + local148[local93][local118] >> 2;
		@Pc(177) int[][] local177 = null;
		@Pc(186) int local186 = (arg2 << 7) + (local69 << 6);
		@Pc(203) long local203 = (long) (arg2 << 7 | arg5 | arg4 << 14 | arg7 << 20 | 0x40000000);
		if (arg6 < 3) {
			local177 = Static38.anIntArrayArrayArray6[arg6 + 1];
		}
		if (local55.anInt1336 == 0) {
			local203 |= Long.MIN_VALUE;
		}
		if (local55.anInt1320 == 1) {
			local203 |= 0x400000L;
		}
		if (local55.aBoolean72) {
			local203 |= 0x80000000L;
		}
		local203 |= (long) arg8 << 32;
		if (local55.method928()) {
			Static117.method2319(null, arg7, arg5, arg3, arg2, null, local55);
		}
		@Pc(271) int local271 = local55.anInt1309;
		@Pc(280) boolean local280 = local55.aBoolean79 & true;
		@Pc(328) Class9 local328;
		@Pc(325) Class54 local325;
		if (arg4 == 22) {
			if (Static249.aBoolean270 || local55.anInt1336 != 0 || local55.anInt1323 == 1 || local55.aBoolean70) {
				if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
					local325 = local55.method932(22, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
					local328 = local325.aClass9_2;
				} else {
					local328 = new Class9_Sub4(arg8, 22, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
				}
				Static191.method3226(arg3, arg5, arg2, local175, local328, local203, local55.aBoolean76);
				if (local55.anInt1323 == 1 && arg1 != null) {
					arg1.method2211(arg2, arg5);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
				local325 = local55.method932(10, arg0, local148, null, local175, arg4 == 11 ? arg7 + 4 : arg7, local186, local144, local177, local280);
				local328 = local325.aClass9_2;
			} else {
				local328 = new Class9_Sub4(arg8, 10, arg4 == 11 ? arg7 + 4 : arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
			}
			if (local328 != null) {
				@Pc(448) boolean local448 = Static171.method2972(arg3, arg5, arg2, local175, local66, local69, local328, local203);
				if (local55.aBoolean68 && local448 && arg0) {
					@Pc(457) int local457 = 15;
					if (local328 instanceof Class9_Sub5) {
						local457 = ((Class9_Sub5) local328).method3605() / 4;
						if (local457 > 30) {
							local457 = 30;
						}
					}
					for (@Pc(475) int local475 = 0; local475 <= local66; local475++) {
						for (@Pc(479) int local479 = 0; local479 <= local69; local479++) {
							if (Static39.aByteArrayArrayArray4[arg3][arg5 + local475][local479 + arg2] < local457) {
								Static39.aByteArrayArrayArray4[arg3][arg5 + local475][arg2 + local479] = (byte) local457;
							}
						}
					}
				}
			}
			if (local55.anInt1323 != 0 && arg1 != null) {
				arg1.method2205(local66, arg2, arg5, local69, local55.aBoolean74, !local55.aBoolean71);
			}
		} else if (arg4 >= 12) {
			if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
				local325 = local55.method932(arg4, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
				local328 = local325.aClass9_2;
			} else {
				local328 = new Class9_Sub4(arg8, arg4, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
			}
			Static171.method2972(arg3, arg5, arg2, local175, 1, 1, local328, local203);
			if (arg0 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0 && local55.anInt1332 != 0) {
				Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x4;
			}
			if (local55.anInt1323 != 0 && arg1 != null) {
				arg1.method2205(local66, arg2, arg5, local69, local55.aBoolean74, !local55.aBoolean71);
			}
		} else if (arg4 == 0) {
			if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
				local325 = local55.method932(0, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
				local328 = local325.aClass9_2;
			} else {
				local328 = new Class9_Sub4(arg8, 0, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
			}
			Static209.method3464(arg3, arg5, arg2, local175, local328, null, Static18.anIntArray50[arg7], 0, local203);
			if (arg0) {
				if (arg7 == 0) {
					if (local55.aBoolean68) {
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2] = 50;
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2 + 1] = 50;
					}
					if (local55.anInt1332 == 1) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x1;
					}
				} else if (arg7 == 1) {
					if (local55.aBoolean68) {
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2 + 1] = 50;
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2 + 1] = 50;
					}
					if (local55.anInt1332 == 1) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2 + 1] |= 0x2;
					}
				} else if (arg7 == 2) {
					if (local55.aBoolean68) {
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2] = 50;
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2 + 1] = 50;
					}
					if (local55.anInt1332 == 1) {
						Static79.anIntArrayArrayArray7[arg3][arg5 + 1][arg2] |= 0x1;
					}
				} else if (arg7 == 3) {
					if (local55.aBoolean68) {
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2] = 50;
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2] = 50;
					}
					if (local55.anInt1332 == 1) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x2;
					}
				}
			}
			if (local55.anInt1323 != 0 && arg1 != null) {
				arg1.method2213(local55.aBoolean74, !local55.aBoolean71, arg5, arg7, arg4, arg2);
			}
			if (local55.anInt1303 != 16) {
				Static165.method2875(arg3, arg5, arg2, local55.anInt1303);
			}
		} else if (arg4 == 1) {
			if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
				local325 = local55.method932(1, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
				local328 = local325.aClass9_2;
			} else {
				local328 = new Class9_Sub4(arg8, 1, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
			}
			Static209.method3464(arg3, arg5, arg2, local175, local328, null, Static265.anIntArray468[arg7], 0, local203);
			if (local55.aBoolean68 && arg0) {
				if (arg7 == 0) {
					Static39.aByteArrayArrayArray4[arg3][arg5][arg2 + 1] = 50;
				} else if (arg7 == 1) {
					Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2 + 1] = 50;
				} else if (arg7 == 2) {
					Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2] = 50;
				} else if (arg7 == 3) {
					Static39.aByteArrayArrayArray4[arg3][arg5][arg2] = 50;
				}
			}
			if (local55.anInt1323 != 0 && arg1 != null) {
				arg1.method2213(local55.aBoolean74, !local55.aBoolean71, arg5, arg7, arg4, arg2);
			}
		} else {
			@Pc(1120) int local1120;
			if (arg4 == 2) {
				local1120 = arg7 + 1 & 0x3;
				@Pc(1160) Class9 local1160;
				@Pc(1146) Class9 local1146;
				if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
					@Pc(1178) Class54 local1178 = local55.method932(2, arg0, local148, null, local175, arg7 + 4, local186, local144, local177, local280);
					local1146 = local1178.aClass9_2;
					@Pc(1195) Class54 local1195 = local55.method932(2, arg0, local148, null, local175, local1120, local186, local144, local177, local280);
					local1160 = local1195.aClass9_2;
				} else {
					local1146 = new Class9_Sub4(arg8, 2, arg7 + 4, arg6, arg5, arg2, local271, local55.aBoolean73, null);
					local1160 = new Class9_Sub4(arg8, 2, local1120, arg6, arg5, arg2, local271, local55.aBoolean73, null);
				}
				Static209.method3464(arg3, arg5, arg2, local175, local1146, local1160, Static18.anIntArray50[arg7], Static18.anIntArray50[local1120], local203);
				if (local55.anInt1332 == 1 && arg0) {
					if (arg7 == 0) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x1;
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2 + 1] |= 0x2;
					} else if (arg7 == 1) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2 + 1] |= 0x2;
						Static79.anIntArrayArrayArray7[arg3][arg5 + 1][arg2] |= 0x1;
					} else if (arg7 == 2) {
						Static79.anIntArrayArrayArray7[arg3][arg5 + 1][arg2] |= 0x1;
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x2;
					} else if (arg7 == 3) {
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x2;
						Static79.anIntArrayArrayArray7[arg3][arg5][arg2] |= 0x1;
					}
				}
				if (local55.anInt1323 != 0 && arg1 != null) {
					arg1.method2213(local55.aBoolean74, !local55.aBoolean71, arg5, arg7, arg4, arg2);
				}
				if (local55.anInt1303 != 16) {
					Static165.method2875(arg3, arg5, arg2, local55.anInt1303);
				}
			} else if (arg4 == 3) {
				if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
					local325 = local55.method932(3, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
					local328 = local325.aClass9_2;
				} else {
					local328 = new Class9_Sub4(arg8, 3, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
				}
				Static209.method3464(arg3, arg5, arg2, local175, local328, null, Static265.anIntArray468[arg7], 0, local203);
				if (local55.aBoolean68 && arg0) {
					if (arg7 == 0) {
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2 + 1] = 50;
					} else if (arg7 == 1) {
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2 + 1] = 50;
					} else if (arg7 == 2) {
						Static39.aByteArrayArrayArray4[arg3][arg5 + 1][arg2] = 50;
					} else if (arg7 == 3) {
						Static39.aByteArrayArrayArray4[arg3][arg5][arg2] = 50;
					}
				}
				if (local55.anInt1323 != 0 && arg1 != null) {
					arg1.method2213(local55.aBoolean74, !local55.aBoolean71, arg5, arg7, arg4, arg2);
				}
			} else if (arg4 == 9) {
				if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
					local325 = local55.method932(arg4, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
					local328 = local325.aClass9_2;
				} else {
					local328 = new Class9_Sub4(arg8, arg4, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
				}
				Static171.method2972(arg3, arg5, arg2, local175, 1, 1, local328, local203);
				if (local55.anInt1323 != 0 && arg1 != null) {
					arg1.method2205(local66, arg2, arg5, local69, local55.aBoolean74, !local55.aBoolean71);
				}
				if (local55.anInt1303 != 16) {
					Static165.method2875(arg3, arg5, arg2, local55.anInt1303);
				}
			} else if (arg4 == 4) {
				if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
					local325 = local55.method932(4, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
					local328 = local325.aClass9_2;
				} else {
					local328 = new Class9_Sub4(arg8, 4, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
				}
				Static239.method3938(arg3, arg5, arg2, local175, local328, null, Static18.anIntArray50[arg7], 0, 0, 0, local203);
			} else {
				@Pc(1738) long local1738;
				@Pc(1782) Class9 local1782;
				@Pc(1779) Class54 local1779;
				if (arg4 == 5) {
					local1120 = 16;
					local1738 = Static11.method222(arg3, arg5, arg2);
					if (local1738 != 0L) {
						local1120 = Static77.method1518((int) (local1738 >>> 32) & Integer.MAX_VALUE).anInt1303;
					}
					if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
						local1779 = local55.method932(4, arg0, local148, null, local175, arg7, local186, local144, local177, local280);
						local1782 = local1779.aClass9_2;
					} else {
						local1782 = new Class9_Sub4(arg8, 4, arg7, arg6, arg5, arg2, local271, local55.aBoolean73, null);
					}
					Static239.method3938(arg3, arg5, arg2, local175, local1782, null, Static18.anIntArray50[arg7], 0, Static49.anIntArray107[arg7] * local1120, local1120 * Static230.anIntArray463[arg7], local203);
				} else if (arg4 == 6) {
					local1120 = 8;
					local1738 = Static11.method222(arg3, arg5, arg2);
					if (local1738 != 0L) {
						local1120 = Static77.method1518((int) (local1738 >>> 32) & Integer.MAX_VALUE).anInt1303 / 2;
					}
					if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
						local1779 = local55.method932(4, arg0, local148, null, local175, arg7 + 4, local186, local144, local177, local280);
						local1782 = local1779.aClass9_2;
					} else {
						local1782 = new Class9_Sub4(arg8, 4, arg7 + 4, arg6, arg5, arg2, local271, local55.aBoolean73, null);
					}
					Static239.method3938(arg3, arg5, arg2, local175, local1782, null, 256, arg7, Static149.anIntArray270[arg7] * local1120, Static1.anIntArray3[arg7] * local1120, local203);
				} else if (arg4 == 7) {
					@Pc(1932) int local1932 = arg7 + 2 & 0x3;
					if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
						@Pc(1960) Class54 local1960 = local55.method932(4, arg0, local148, null, local175, local1932 + 4, local186, local144, local177, local280);
						local328 = local1960.aClass9_2;
					} else {
						local328 = new Class9_Sub4(arg8, 4, local1932 + 4, arg6, arg5, arg2, local271, local55.aBoolean73, null);
					}
					Static239.method3938(arg3, arg5, arg2, local175, local328, null, 256, local1932, 0, 0, local203);
				} else if (arg4 == 8) {
					local1738 = Static11.method222(arg3, arg5, arg2);
					local1120 = 8;
					if (local1738 != 0L) {
						local1120 = Static77.method1518(Integer.MAX_VALUE & (int) (local1738 >>> 32)).anInt1303 / 2;
					}
					@Pc(2028) int local2028 = arg7 + 2 & 0x3;
					@Pc(2070) Class9 local2070;
					if (local271 == -1 && local55.anIntArray100 == null && !local55.aBoolean77) {
						@Pc(2088) Class54 local2088 = local55.method932(4, arg0, local148, null, local175, arg7 + 4, local186, local144, local177, local280);
						local1782 = local2088.aClass9_2;
						@Pc(2107) Class54 local2107 = local55.method932(4, arg0, local148, null, local175, local2028 + 4, local186, local144, local177, local280);
						local2070 = local2107.aClass9_2;
					} else {
						local1782 = new Class9_Sub4(arg8, 4, arg7 + 4, arg6, arg5, arg2, local271, local55.aBoolean73, null);
						local2070 = new Class9_Sub4(arg8, 4, local2028 + 4, arg6, arg5, arg2, local271, local55.aBoolean73, null);
					}
					Static239.method3938(arg3, arg5, arg2, local175, local1782, local2070, 256, arg7, Static149.anIntArray270[arg7] * local1120, local1120 * Static1.anIntArray3[arg7], local203);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	public static void method483() {
		Static229.method3840();
		Static238.method3932();
		Static46.method962();
		Static246.method4008();
		Static241.method3955();
		Static160.method2813();
		Static111.method2249();
		Static13.method230();
		Static186.method3149();
		Static211.method3594();
		Static218.method3560();
		Static212.method3504();
		Static213.method3511();
		Static101.method2104();
		Static70.method1361();
		Static94.method3215();
		Static97.method2668();
		Static84.method1816();
		if (Static157.anInt3784 != 0) {
			for (@Pc(48) int local48 = 0; local48 < Static243.aByteArrayArray12.length; local48++) {
				Static243.aByteArrayArray12[local48] = null;
			}
			Static138.anInt3368 = 0;
		}
		Static94.method3210();
		Static240.method3948();
		Static158.aClass79_21.method2489();
		((Class15_Sub1) Static235.anInterface1_1).method399();
		Static186.aClass58_11.method2090();
		Static252.aClass51_81.method1846();
		Static37.aClass51_13.method1846();
		Static215.aClass51_69.method1846();
		Static146.aClass51_48.method1846();
		Static251.aClass51_80.method1846();
		Static258.aClass51_83.method1846();
		Static197.aClass51_28.method1846();
		aClass51_10.method1846();
		Static97.aClass51_49.method1846();
		Static218.aClass51_71.method1846();
		Static118.aClass51_39.method1846();
		Static127.aClass79_18.method2489();
	}
}
