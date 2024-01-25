import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
	public static int anInt4500 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BILclient!uh;IIIIIIIII)Z")
	public static boolean method3574(@OriginalArg(1) int arg0, @OriginalArg(2) Class240 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg9;
		@Pc(24) int local24 = arg3 - 64;
		@Pc(29) int local29 = arg9 - 64;
		Static73.anIntArrayArray6[64][64] = 99;
		Static93.anIntArrayArray9[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static37.anIntArray34[0] = arg3;
		@Pc(52) int local52 = local43 + 1;
		Static168.anIntArray365[0] = arg9;
		@Pc(57) int[][] local57 = arg1.anIntArrayArray60;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(71) int local71;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(246) int local246;
				@Pc(295) int local295;
				do {
					do {
						do {
							label259: do {
								if (local45 == local52) {
									Static134.anInt2388 = local7;
									Static116.anInt1976 = local9;
									return false;
								}
								local9 = Static168.anIntArray365[local45];
								local7 = Static37.anIntArray34[local45];
								local71 = local9 - local29;
								local75 = local7 - local24;
								local45 = local45 + 1 & 0xFFF;
								local87 = local7 - arg1.anInt6848;
								local93 = local9 - arg1.anInt6844;
								if (arg5 == -4) {
									if (arg6 == local7 && arg0 == local9) {
										Static116.anInt1976 = local9;
										Static134.anInt2388 = local7;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static246.method3174(local7, arg8, arg6, arg0, local9, arg2, arg7, arg8)) {
										Static134.anInt2388 = local7;
										Static116.anInt1976 = local9;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg1.method5418(local9, arg8, arg7, arg6, arg8, local7, arg0, arg4, arg2)) {
										Static116.anInt1976 = local9;
										Static134.anInt2388 = local7;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg1.method5421(arg4, local9, arg8, arg7, arg2, arg0, arg6, local7)) {
										Static116.anInt1976 = local9;
										Static134.anInt2388 = local7;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg1.method5420(local7, arg5, local9, arg10, arg8, arg0, arg6)) {
										Static116.anInt1976 = local9;
										Static134.anInt2388 = local7;
										return true;
									}
								} else if (arg1.method5410(arg5, local9, arg0, arg10, arg6, arg8, local7)) {
									Static134.anInt2388 = local7;
									Static116.anInt1976 = local9;
									return true;
								}
								local246 = Static93.anIntArrayArray9[local75][local71] + 1;
								if (local75 > 0 && Static73.anIntArrayArray6[local75 - 1][local71] == 0 && (local57[local87 - 1][local93] & 0x43A40000) == 0 && (local57[local87 - 1][local93 + arg8 - 1] & 0x4E240000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg8 - 1) {
											Static37.anIntArray34[local52] = local7 - 1;
											Static168.anIntArray365[local52] = local9;
											Static73.anIntArrayArray6[local75 - 1][local71] = 2;
											local52 = local52 + 1 & 0xFFF;
											Static93.anIntArrayArray9[local75 - 1][local71] = local246;
											break;
										}
										if ((local57[local87 - 1][local93 + local295] & 0x4FA40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg8 > local75 && Static73.anIntArrayArray6[local75 + 1][local71] == 0 && (local57[arg8 + local87][local93] & 0x60E40000) == 0 && (local57[arg8 + local87][local93 + arg8 - 1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 - 1 <= local295) {
											Static37.anIntArray34[local52] = local7 + 1;
											Static168.anIntArray365[local52] = local9;
											Static73.anIntArrayArray6[local75 + 1][local71] = 8;
											local52 = local52 + 1 & 0xFFF;
											Static93.anIntArrayArray9[local75 + 1][local71] = local246;
											break;
										}
										if ((local57[arg8 + local87][local295 + local93] & 0x78E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local71 > 0 && Static73.anIntArrayArray6[local75][local71 - 1] == 0 && (local57[local87][local93 - 1] & 0x43A40000) == 0 && (local57[arg8 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 - 1 <= local295) {
											Static37.anIntArray34[local52] = local7;
											Static168.anIntArray365[local52] = local9 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static73.anIntArrayArray6[local75][local71 - 1] = 1;
											Static93.anIntArrayArray9[local75][local71 - 1] = local246;
											break;
										}
										if ((local57[local87 + local295][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local71 < 128 - arg8 && Static73.anIntArrayArray6[local75][local71 + 1] == 0 && (local57[local87][arg8 + local93] & 0x4E240000) == 0 && (local57[local87 + arg8 - 1][local93 + arg8] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg8 - 1) {
											Static37.anIntArray34[local52] = local7;
											Static168.anIntArray365[local52] = local9 + 1;
											Static73.anIntArrayArray6[local75][local71 + 1] = 4;
											local52 = local52 + 1 & 0xFFF;
											Static93.anIntArrayArray9[local75][local71 + 1] = local246;
											break;
										}
										if ((local57[local87 + local295][arg8 + local93] & 0x7E240000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local75 > 0 && local71 > 0 && Static73.anIntArrayArray6[local75 - 1][local71 - 1] == 0 && (local57[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg8) {
											Static37.anIntArray34[local52] = local7 - 1;
											Static168.anIntArray365[local52] = local9 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static73.anIntArrayArray6[local75 - 1][local71 - 1] = 3;
											Static93.anIntArrayArray9[local75 - 1][local71 - 1] = local246;
											break;
										}
										if ((local57[local87 - 1][local93 + local295 - 1] & 0x4FA40000) != 0 || (local57[local87 + local295 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg8 > local75 && local71 > 0 && Static73.anIntArrayArray6[local75 + 1][local71 - 1] == 0 && (local57[local87 + arg8][local93 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 <= local295) {
											Static37.anIntArray34[local52] = local7 + 1;
											Static168.anIntArray365[local52] = local9 - 1;
											Static73.anIntArrayArray6[local75 + 1][local71 - 1] = 9;
											local52 = local52 + 1 & 0xFFF;
											Static93.anIntArrayArray9[local75 + 1][local71 - 1] = local246;
											break;
										}
										if ((local57[local87 + arg8][local93 + local295 - 1] & 0x78E40000) != 0 || (local57[local87 + local295][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local75 > 0 && 128 - arg8 > local71 && Static73.anIntArrayArray6[local75 - 1][local71 + 1] == 0 && (local57[local87 - 1][arg8 + local93] & 0x4E240000) == 0) {
									for (local295 = 1; local295 < arg8; local295++) {
										if ((local57[local87 - 1][local295 + local93] & 0x4FA40000) != 0 || (local57[local295 + local87 - 1][local93 + arg8] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static37.anIntArray34[local52] = local7 - 1;
									Static168.anIntArray365[local52] = local9 + 1;
									Static73.anIntArrayArray6[local75 - 1][local71 + 1] = 6;
									local52 = local52 + 1 & 0xFFF;
									Static93.anIntArrayArray9[local75 - 1][local71 + 1] = local246;
								}
							} while (128 - arg8 <= local75);
						} while (128 - arg8 <= local71);
					} while (Static73.anIntArrayArray6[local75 + 1][local71 + 1] != 0);
				} while ((local57[local87 + arg8][local93 + arg8] & 0x78240000) != 0);
				for (local295 = 1; local295 < arg8; local295++) {
					if ((local57[local87 + local295][arg8 + local93] & 0x7E240000) != 0 || (local57[arg8 + local87][local93 + local295] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static37.anIntArray34[local52] = local7 + 1;
				Static168.anIntArray365[local52] = local9 + 1;
				Static73.anIntArrayArray6[local75 + 1][local71 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local75 + 1][local71 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Lclient!lb;")
	public static Class5_Sub2_Sub9 method3575() {
		@Pc(13) Class5_Sub2_Sub9 local13 = (Class5_Sub2_Sub9) Static168.aClass123_9.method2616();
		if (local13 != null) {
			local13.method6003();
			local13.method6006();
			return local13;
		}
		do {
			local13 = (Class5_Sub2_Sub9) Static383.aClass123_11.method2616();
			if (local13 == null) {
				return null;
			}
			if (local13.method3022() > Static446.method5903()) {
				return null;
			}
			local13.method6003();
			local13.method6006();
		} while ((local13.aLong235 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!pn;)V")
	public static void method3576(@OriginalArg(1) Class194 arg0) {
		Static281.aClass5_Sub15_Sub2_13.method5614(arg0.method3978());
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)Z")
	public static boolean method3577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static272.aBoolean283) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static34.aClass76ArrayArray1[local13] == null || Static34.aClass76ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class76 local35 = Static34.aClass76ArrayArray1[local13][local17];
		@Pc(57) Class5_Sub41 local57;
		if (arg1 == -1 && local35.anInt2060 == 0) {
			for (local57 = (Class5_Sub41) Static122.aClass177_13.method3618(); local57 != null; local57 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
				if (local57.anInt6815 == 25 || local57.anInt6815 == 1008 || local57.anInt6815 == 2 || local57.anInt6815 == 23 || local57.anInt6815 == 47) {
					for (@Pc(147) Class76 local147 = Static213.method2817(local57.anInt6819); local147 != null; local147 = Static30.method477(local147)) {
						if (local147.anInt2100 == local35.anInt2100) {
							return true;
						}
					}
				}
			}
		} else {
			for (local57 = (Class5_Sub41) Static122.aClass177_13.method3618(); local57 != null; local57 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
				if (local57.anInt6818 == arg1 && local57.anInt6819 == local35.anInt2100 && (local57.anInt6815 == 25 || local57.anInt6815 == 1008 || local57.anInt6815 == 2 || local57.anInt6815 == 23 || local57.anInt6815 == 47)) {
					return true;
				}
			}
		}
		return false;
	}
}
