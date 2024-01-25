import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	public static void method4041() {
		Static227.aClass11_94.method214();
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	public static void method4042() {
		if (Static276.method4686() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static295.anInt5671 - 4 & 0xFF);
		@Pc(21) int local21 = Static295.anInt5671 % Static195.anInt3965;
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local27 = 0; local27 < Static298.anInt5716; local27++) {
				Static124.aByteArrayArrayArray6[local23][local21][local27] = local17;
			}
		}
		if (Static219.anInt4400 == 3) {
			return;
		}
		for (local27 = 0; local27 < 2; local27++) {
			Static118.anIntArray230[local27] = -1000000;
			Static63.anIntArray110[local27] = 1000000;
			Static167.anIntArray487[local27] = 0;
			Static9.anIntArray12[local27] = 1000000;
			Static353.anIntArray644[local27] = 0;
		}
		@Pc(134) int local134;
		if (Static205.anInt4115 != 1) {
			local134 = Static279.method4730(Static219.anInt4400, Static124.anInt2717, Static141.anInt2986);
			if (local134 - Static103.anInt2301 >= 800 || (Static108.aByteArrayArrayArray5[Static219.anInt4400][Static124.anInt2717 >> 7][Static141.anInt2986 >> 7] & 0x4) == 0) {
				return;
			}
			Static154.method3024(false, Static98.aClass213ArrayArrayArray2, Static124.anInt2717 >> 7, Static141.anInt2986 >> 7, 1);
			return;
		}
		if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7][Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7] & 0x4) != 0) {
			Static154.method3024(false, Static98.aClass213ArrayArrayArray2, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7, 0);
		}
		if (Static112.anInt2486 >= 2560) {
			return;
		}
		local134 = Static124.anInt2717 >> 7;
		@Pc(138) int local138 = Static141.anInt2986 >> 7;
		@Pc(143) int local143 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7;
		@Pc(148) int local148 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7;
		@Pc(156) int local156;
		if (local143 <= local134) {
			local156 = local134 - local143;
		} else {
			local156 = local143 - local134;
		}
		@Pc(170) int local170;
		if (local148 > local138) {
			local170 = local148 - local138;
		} else {
			local170 = local138 - local148;
		}
		if ((local156 != 0 || local170 != 0) && -Static195.anInt3965 < local156 && Static195.anInt3965 > local156 && -Static298.anInt5716 < local170 && Static298.anInt5716 > local170) {
			@Pc(247) int local247;
			@Pc(249) int local249;
			if (local156 > local170) {
				local247 = local170 * 65536 / local156;
				local249 = 32768;
				while (local134 != local143) {
					if (local143 > local134) {
						local134++;
					} else if (local143 < local134) {
						local134--;
					}
					if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][local134][local138] & 0x4) != 0) {
						Static154.method3024(false, Static98.aClass213ArrayArrayArray2, local134, local138, 1);
						return;
					}
					local249 += local247;
					if (local249 >= 65536) {
						local249 -= 65536;
						if (local148 > local138) {
							local138++;
						} else if (local148 < local138) {
							local138--;
						}
						if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][local134][local138] & 0x4) != 0) {
							Static154.method3024(false, Static98.aClass213ArrayArrayArray2, local134, local138, 1);
							return;
						}
					}
				}
				return;
			}
			local247 = local156 * 65536 / local170;
			local249 = 32768;
			while (local138 != local148) {
				if (local148 > local138) {
					local138++;
				} else if (local138 > local148) {
					local138--;
				}
				if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][local134][local138] & 0x4) != 0) {
					Static154.method3024(false, Static98.aClass213ArrayArrayArray2, local134, local138, 1);
					return;
				}
				local249 += local247;
				if (local249 >= 65536) {
					if (local143 > local134) {
						local134++;
					} else if (local134 > local143) {
						local134--;
					}
					local249 -= 65536;
					if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][local134][local138] & 0x4) != 0) {
						Static154.method3024(false, Static98.aClass213ArrayArrayArray2, local134, local138, 1);
						return;
					}
				}
			}
			return;
		}
		Static47.method1149(null, "RC: " + local134 + "," + local138 + " " + local143 + "," + local148 + " " + Static151.anInt3234 + "," + Static251.anInt3170);
		return;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!cb;Lclient!cb;)V")
	public static void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub4 arg3, @OriginalArg(4) Class10_Sub4 arg4) {
		if (Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static243.method4280(arg0, arg1, arg2);
		}
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub4_1 = arg3;
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub4_2 = arg4;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(31) int local31 = local17 << 1;
		@Pc(35) int local35 = local13 << 1;
		@Pc(39) int local39 = arg4 << 1;
		@Pc(48) int local48 = local31 + local13 * (1 - local39);
		@Pc(57) int local57 = local17 - local35 * (local39 - 1);
		@Pc(61) int local61 = local13 << 2;
		@Pc(65) int local65 = local17 << 2;
		@Pc(73) int local73 = local31 * 3;
		@Pc(81) int local81 = ((arg4 << 1) - 3) * local35;
		@Pc(87) int local87 = local65;
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (Static32.anInt750 <= arg3 && arg3 <= Static112.anInt2485) {
			local105 = Static222.method3991(arg1 + arg0, Static275.anInt5244, Static6.anInt136);
			local114 = Static222.method3991(arg0 - arg1, Static275.anInt5244, Static6.anInt136);
			Static27.method690(local105, Static104.anIntArrayArray31[arg3], arg2, local114);
		}
		@Pc(128) int local128 = (arg4 - 1) * local61;
		while (local9 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local48 += local73;
					local57 += local87;
					local87 += local65;
					local7++;
					local73 += local65;
				}
			}
			if (local57 < 0) {
				local57 += local87;
				local48 += local73;
				local7++;
				local87 += local65;
				local73 += local65;
			}
			local48 += -local128;
			local57 += -local81;
			local9--;
			local81 -= local61;
			local128 -= local61;
			local105 = arg3 - local9;
			local114 = arg3 + local9;
			if (local114 >= Static32.anInt750 && local105 <= Static112.anInt2485) {
				@Pc(226) int local226 = Static222.method3991(local7 + arg0, Static275.anInt5244, Static6.anInt136);
				@Pc(235) int local235 = Static222.method3991(arg0 - local7, Static275.anInt5244, Static6.anInt136);
				if (local105 >= Static32.anInt750) {
					Static27.method690(local226, Static104.anIntArrayArray31[local105], arg2, local235);
				}
				if (Static112.anInt2485 >= local114) {
					Static27.method690(local226, Static104.anIntArrayArray31[local114], arg2, local235);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIZIIIIII)Z")
	public static boolean method4046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static323.method978(arg9, Static332.anIntArray613, arg1, arg8, Static188.anIntArray331, arg7, arg2, Static75.aClass65Array1[Static219.anInt4400], arg0, arg5, Static173.aClass10_Sub3_Sub3_Sub2_1.method5353(), arg4, arg3, arg6);
		if (local24 < 1) {
			return false;
		}
		Static140.anInt2984 = Static188.anIntArray331[local24 - 1];
		Static213.anInt4250 = Static332.anIntArray613[local24 - 1];
		Static276.aBoolean348 = false;
		Static297.method5073();
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!fn;IIIIIII)Z")
	public static boolean method4047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg1;
		@Pc(23) int local23 = arg9 - 64;
		Static114.anIntArrayArray36[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static216.anIntArrayArray73[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static34.anIntArray392[0] = arg9;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static161.anIntArray298[0] = arg1;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray29;
		while (local51 != local48) {
			local7 = Static34.anIntArray392[local48];
			local9 = Static161.anIntArray298[local48];
			@Pc(71) int local71 = local9 - local34;
			@Pc(76) int local76 = local7 - local23;
			local48 = local48 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg2.anInt2120;
			@Pc(93) int local93 = local9 - arg2.anInt2134;
			if (arg8 == -4) {
				if (arg4 == local7 && arg6 == local9) {
					Static4.anInt124 = local9;
					Static7.anInt190 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static71.method5022(2, 2, local9, arg6, local7, arg7, arg0, arg4)) {
					Static7.anInt190 = local7;
					Static4.anInt124 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg2.method2124(arg3, arg0, arg7, arg6, local7, 2, arg4, local9, 2)) {
					Static7.anInt190 = local7;
					Static4.anInt124 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg2.method2126(local7, arg0, 2, arg3, local9, arg6, arg4, arg7)) {
					Static4.anInt124 = local9;
					Static7.anInt190 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg2.method2131(arg8, local9, 2, arg5, arg4, local7, arg6)) {
					Static7.anInt190 = local7;
					Static4.anInt124 = local9;
					return true;
				}
			} else if (arg2.method2132(arg4, 2, arg8, arg5, local7, local9, arg6)) {
				Static4.anInt124 = local9;
				Static7.anInt190 = local7;
				return true;
			}
			@Pc(244) int local244 = Static216.anIntArrayArray73[local76][local71] + 1;
			if (local76 > 0 && Static114.anIntArrayArray36[local76 - 1][local71] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static34.anIntArray392[local51] = local7 - 1;
				Static161.anIntArray298[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local76 - 1][local71] = 2;
				Static216.anIntArrayArray73[local76 - 1][local71] = local244;
			}
			if (local76 < 126 && Static114.anIntArrayArray36[local76 + 1][local71] == 0 && (local56[local88 + 2][local93] & 0x60E40000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static34.anIntArray392[local51] = local7 + 1;
				Static161.anIntArray298[local51] = local9;
				Static114.anIntArrayArray36[local76 + 1][local71] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local76 + 1][local71] = local244;
			}
			if (local71 > 0 && Static114.anIntArrayArray36[local76][local71 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static34.anIntArray392[local51] = local7;
				Static161.anIntArray298[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local76][local71 - 1] = 1;
				Static216.anIntArrayArray73[local76][local71 - 1] = local244;
			}
			if (local71 < 126 && Static114.anIntArrayArray36[local76][local71 + 1] == 0 && (local56[local88][local93 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static34.anIntArray392[local51] = local7;
				Static161.anIntArray298[local51] = local9 + 1;
				Static114.anIntArrayArray36[local76][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local76][local71 + 1] = local244;
			}
			if (local76 > 0 && local71 > 0 && Static114.anIntArrayArray36[local76 - 1][local71 - 1] == 0 && (local56[local88 - 1][local93] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local88][local93 - 1] & 0x63E40000) == 0) {
				Static34.anIntArray392[local51] = local7 - 1;
				Static161.anIntArray298[local51] = local9 - 1;
				Static114.anIntArrayArray36[local76 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local76 - 1][local71 - 1] = local244;
			}
			if (local76 < 126 && local71 > 0 && Static114.anIntArrayArray36[local76 + 1][local71 - 1] == 0 && (local56[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local93] & 0x78E40000) == 0) {
				Static34.anIntArray392[local51] = local7 + 1;
				Static161.anIntArray298[local51] = local9 - 1;
				Static114.anIntArrayArray36[local76 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local76 + 1][local71 - 1] = local244;
			}
			if (local76 > 0 && local71 < 126 && Static114.anIntArrayArray36[local76 - 1][local71 + 1] == 0 && (local56[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local88][local93 + 2] & 0x7E240000) == 0) {
				Static34.anIntArray392[local51] = local7 - 1;
				Static161.anIntArray298[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local76 - 1][local71 + 1] = 6;
				Static216.anIntArrayArray73[local76 - 1][local71 + 1] = local244;
			}
			if (local76 < 126 && local71 < 126 && Static114.anIntArrayArray36[local76 + 1][local71 + 1] == 0 && (local56[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static34.anIntArray392[local51] = local7 + 1;
				Static161.anIntArray298[local51] = local9 + 1;
				Static114.anIntArrayArray36[local76 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local76 + 1][local71 + 1] = local244;
			}
		}
		Static4.anInt124 = local9;
		Static7.anInt190 = local7;
		return false;
	}
}
