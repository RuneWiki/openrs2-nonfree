import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eg", name = "C", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!wg;IIIIIIII)Z")
	public static boolean method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg3 - 64;
		Static473.anIntArrayArray51[64][64] = 99;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static252.anIntArray303[0] = arg9;
		@Pc(46) int local46 = local37 + 1;
		Static233.anIntArray284[0] = arg3;
		@Pc(51) int[][] local51 = arg2.anIntArrayArray64;
		while (local39 != local46) {
			local7 = Static252.anIntArray303[local39];
			local9 = Static233.anIntArray284[local39];
			@Pc(71) int local71 = local7 - local18;
			@Pc(76) int local76 = local9 - local23;
			local39 = local39 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg2.anInt9517;
			@Pc(94) int local94 = local9 - arg2.anInt9521;
			if (arg7 == -4) {
				if (arg5 == local7 && arg4 == local9) {
					Static71.anInt4965 = local7;
					Static540.anInt8913 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static570.method7437(local7, 2, 2, arg4, arg0, arg5, local9, arg6)) {
					Static71.anInt4965 = local7;
					Static540.anInt8913 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg2.method7599(2, local7, arg5, local9, arg6, arg0, arg4, 2, arg1)) {
					Static540.anInt8913 = local9;
					Static71.anInt4965 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg2.method7600(arg1, local7, arg5, arg6, arg4, 2, arg0, local9)) {
					Static540.anInt8913 = local9;
					Static71.anInt4965 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg2.method7594(2, arg8, arg5, local9, arg7, arg4, local7)) {
					Static71.anInt4965 = local7;
					Static540.anInt8913 = local9;
					return true;
				}
			} else if (arg2.method7598(local9, local7, arg8, arg4, arg5, arg7, 2)) {
				Static71.anInt4965 = local7;
				Static540.anInt8913 = local9;
				return true;
			}
			@Pc(245) int local245 = Static481.anIntArrayArray53[local71][local76] + 1;
			if (local71 > 0 && Static473.anIntArrayArray51[local71 - 1][local76] == 0 && (local51[local88 - 1][local94] & 0x43A40000) == 0 && (local51[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static252.anIntArray303[local46] = local7 - 1;
				Static233.anIntArray284[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local71 - 1][local76] = 2;
				Static481.anIntArrayArray53[local71 - 1][local76] = local245;
			}
			if (local71 < 126 && Static473.anIntArrayArray51[local71 + 1][local76] == 0 && (local51[local88 + 2][local94] & 0x60E40000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static252.anIntArray303[local46] = local7 + 1;
				Static233.anIntArray284[local46] = local9;
				Static473.anIntArrayArray51[local71 + 1][local76] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 + 1][local76] = local245;
			}
			if (local76 > 0 && Static473.anIntArrayArray51[local71][local76 - 1] == 0 && (local51[local88][local94 - 1] & 0x43A40000) == 0 && (local51[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static252.anIntArray303[local46] = local7;
				Static233.anIntArray284[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local71][local76 - 1] = 1;
				Static481.anIntArrayArray53[local71][local76 - 1] = local245;
			}
			if (local76 < 126 && Static473.anIntArrayArray51[local71][local76 + 1] == 0 && (local51[local88][local94 + 2] & 0x4E240000) == 0 && (local51[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static252.anIntArray303[local46] = local7;
				Static233.anIntArray284[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local71][local76 + 1] = 4;
				Static481.anIntArrayArray53[local71][local76 + 1] = local245;
			}
			if (local71 > 0 && local76 > 0 && Static473.anIntArrayArray51[local71 - 1][local76 - 1] == 0 && (local51[local88 - 1][local94] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local51[local88][local94 - 1] & 0x63E40000) == 0) {
				Static252.anIntArray303[local46] = local7 - 1;
				Static233.anIntArray284[local46] = local9 - 1;
				Static473.anIntArrayArray51[local71 - 1][local76 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 - 1][local76 - 1] = local245;
			}
			if (local71 < 126 && local76 > 0 && Static473.anIntArrayArray51[local71 + 1][local76 - 1] == 0 && (local51[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local51[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local51[local88 + 2][local94] & 0x78E40000) == 0) {
				Static252.anIntArray303[local46] = local7 + 1;
				Static233.anIntArray284[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local71 + 1][local76 - 1] = 9;
				Static481.anIntArrayArray53[local71 + 1][local76 - 1] = local245;
			}
			if (local71 > 0 && local76 < 126 && Static473.anIntArrayArray51[local71 - 1][local76 + 1] == 0 && (local51[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local51[local88][local94 + 2] & 0x7E240000) == 0) {
				Static252.anIntArray303[local46] = local7 - 1;
				Static233.anIntArray284[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local71 - 1][local76 + 1] = 6;
				Static481.anIntArrayArray53[local71 - 1][local76 + 1] = local245;
			}
			if (local71 < 126 && local76 < 126 && Static473.anIntArrayArray51[local71 + 1][local76 + 1] == 0 && (local51[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local51[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static252.anIntArray303[local46] = local7 + 1;
				Static233.anIntArray284[local46] = local9 + 1;
				Static473.anIntArrayArray51[local71 + 1][local76 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 + 1][local76 + 1] = local245;
			}
		}
		Static540.anInt8913 = local9;
		Static71.anInt4965 = local7;
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)Z")
	public static boolean method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	public static void method1700() {
		for (@Pc(3) int local3 = 0; local3 < Static276.anInt4784; local3++) {
			@Pc(9) Class67 local9 = Static537.aClass67Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(212) int local212;
			if (local9.aClass2_Sub3_Sub3_1 == null) {
				local9.anInt1395--;
				if (local9.anInt1395 >= (local9.method1223() ? -1500 : -10)) {
					if (local9.aByte17 == 1 && local9.aClass100_1 == null) {
						local9.aClass100_1 = Static596.method1807(Static48.aClass229_11, local9.anInt1390, 0);
						if (local9.aClass100_1 == null) {
							continue;
						}
						local9.anInt1395 += local9.aClass100_1.method1805();
					} else if (local9.method1223() && (local9.aClass2_Sub37_1 == null || local9.aClass2_Sub13_Sub1_1 == null)) {
						if (local9.aClass2_Sub37_1 == null) {
							local9.aClass2_Sub37_1 = Static406.method5536(Static391.aClass229_109, local9.anInt1390);
						}
						if (local9.aClass2_Sub37_1 == null) {
							continue;
						}
						if (local9.aClass2_Sub13_Sub1_1 == null) {
							local9.aClass2_Sub13_Sub1_1 = local9.aClass2_Sub37_1.method5535(new int[] { 22050 });
							if (local9.aClass2_Sub13_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt1395 < 0) {
						@Pc(109) int local109 = 8192;
						if (local9.anInt1388 == 0) {
							local212 = (local9.aByte17 == 3 ? Static257.aClass2_Sub35_Sub1_1.anInt7495 : Static257.aClass2_Sub35_Sub1_1.anInt7505) * local9.anInt1393 >> 2;
						} else {
							@Pc(119) int local119 = local9.anInt1388 >> 24 & 0x3;
							if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 == local119) {
								@Pc(134) int local134 = (local9.anInt1388 & 0xFF) << 9;
								@Pc(140) int local140 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() << 8;
								@Pc(147) int local147 = local9.anInt1388 >> 16 & 0xFF;
								@Pc(159) int local159 = (local147 << 9) + local140 + 256 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
								@Pc(166) int local166 = local9.anInt1388 >> 8 & 0xFF;
								@Pc(177) int local177 = local140 + (local166 << 9) + 256 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
								@Pc(185) int local185 = Math.abs(local159) + Math.abs(local177) - 512;
								if (local134 < local185) {
									local9.anInt1395 = -99999;
									continue;
								}
								if (local185 < 0) {
									local185 = 0;
								}
								local212 = Static257.aClass2_Sub35_Sub1_1.anInt7512 * (local134 - local185) * local9.anInt1393 / local134 >> 2;
								if (local9.aClass12_Sub2_1 != null && local9.aClass12_Sub2_1 instanceof Class12_Sub2_Sub1) {
									@Pc(223) Class12_Sub2_Sub1 local223 = (Class12_Sub2_Sub1) local9.aClass12_Sub2_1;
									@Pc(226) short local226 = local223.aShort121;
									@Pc(229) short local229 = local223.aShort120;
								}
								if (local159 != 0 || local177 != 0) {
									@Pc(252) int local252 = -Static584.anInt9487 - (int) (Math.atan2((double) local159, (double) local177) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local252 > 8192) {
										local252 = 16384 - local252;
									}
									@Pc(269) int local269;
									if (local185 <= 0) {
										local269 = 8192;
									} else if (local185 >= 4096) {
										local269 = 16384;
									} else {
										local269 = (8192 - local185) / 4096 + 8192;
									}
									local109 = local252 * local269 / 8192 + (16384 - local269 >> 1);
								}
							} else {
								local212 = 0;
							}
						}
						if (local212 > 0) {
							@Pc(322) Class2_Sub13_Sub1 local322 = null;
							if (local9.aByte17 == 1) {
								local322 = local9.aClass100_1.method1806().method7647(Static398.aClass132_1);
							} else if (local9.method1223()) {
								local322 = local9.aClass2_Sub13_Sub1_1;
							}
							@Pc(350) Class2_Sub3_Sub3 local350 = local9.aClass2_Sub3_Sub3_1 = Static599.method4313(local322, local9.anInt1391, local212, local109);
							local350.method4331(local9.anInt1392 - 1);
							Static246.aClass2_Sub3_Sub4_2.method6706(local350);
						}
					}
				} else {
					local11 = true;
				}
			} else if (!local9.aClass2_Sub3_Sub3_1.method7656()) {
				local11 = true;
			}
			if (local11) {
				Static276.anInt4784--;
				for (local212 = local3; local212 < Static276.anInt4784; local212++) {
					Static537.aClass67Array1[local212] = Static537.aClass67Array1[local212 + 1];
				}
				local3--;
			}
		}
		if (Static271.aBoolean352 && !Static343.method5007()) {
			if (Static257.aClass2_Sub35_Sub1_1.anInt7490 != 0 && Static491.anInt7770 != -1) {
				if (Static562.aClass2_Sub3_Sub2_6 == null) {
					Static228.method2769(Static491.anInt7770, Static106.aClass229_32, Static257.aClass2_Sub35_Sub1_1.anInt7490);
				} else {
					Static436.method5718(Static257.aClass2_Sub35_Sub1_1.anInt7490, Static562.aClass2_Sub3_Sub2_6, Static491.anInt7770, Static106.aClass229_32);
				}
			}
			Static271.aBoolean352 = false;
			Static562.aClass2_Sub3_Sub2_6 = null;
		} else if (Static257.aClass2_Sub35_Sub1_1.anInt7490 != 0 && Static491.anInt7770 != -1 && !Static343.method5007()) {
			@Pc(438) Class2_Sub34 local438 = Static555.method7264(Static21.aClass154_5, Static551.aClass64_2);
			local438.aClass2_Sub7_Sub2_2.method4495(Static491.anInt7770);
			Static100.method1508(local438);
			Static491.anInt7770 = -1;
		}
	}
}
