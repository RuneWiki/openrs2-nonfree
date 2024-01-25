import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!we;")
	public static Class214 aClass214_4;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lclient!tj;")
	public static Class193 aClass193_102;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	public static int anInt6252;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "[Lclient!fa;")
	public static final Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array1 = new Class8_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_8 = new Class124(128);

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_230 = new Class198(4);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I")
	public static int method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIBIIILclient!qr;I)Z")
	public static boolean method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class170 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(14) int local14 = arg1;
		@Pc(23) int local23 = arg8 - 64;
		Static98.anIntArrayArray66[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static315.anIntArrayArray169[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static142.anIntArray279[0] = arg8;
		@Pc(51) int local51 = local42 + 1;
		Static186.anIntArray331[0] = arg1;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray143;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(70) int local70;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(249) int local249;
				@Pc(286) int local286;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static123.anInt2948 = local7;
									Static132.anInt3100 = local14;
									return false;
								}
								local14 = Static186.anIntArray331[local44];
								local7 = Static142.anIntArray279[local44];
								local70 = local14 - local34;
								local75 = local7 - local23;
								local44 = local44 + 1 & 0xFFF;
								local87 = local7 - arg9.anInt5336;
								local93 = local14 - arg9.anInt5341;
								if (arg6 == -4) {
									if (arg3 == local7 && arg0 == local14) {
										Static123.anInt2948 = local7;
										Static132.anInt3100 = local14;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static174.method3349(arg5, arg10, arg3, arg10, arg7, arg0, local14, local7)) {
										Static123.anInt2948 = local7;
										Static132.anInt3100 = local14;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg9.method4586(arg4, arg7, arg5, arg10, arg3, arg10, local14, local7, arg0)) {
										Static132.anInt3100 = local14;
										Static123.anInt2948 = local7;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg9.method4587(arg4, local14, arg5, arg0, arg3, local7, arg10, arg7)) {
										Static132.anInt3100 = local14;
										Static123.anInt2948 = local7;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg9.method4585(arg2, arg0, arg6, local14, arg3, local7, arg10)) {
										Static132.anInt3100 = local14;
										Static123.anInt2948 = local7;
										return true;
									}
								} else if (arg9.method4599(arg6, local14, arg2, arg3, arg10, arg0, local7)) {
									Static123.anInt2948 = local7;
									Static132.anInt3100 = local14;
									return true;
								}
								local249 = Static315.anIntArrayArray169[local75][local70] + 1;
								if (local75 > 0 && Static98.anIntArrayArray66[local75 - 1][local70] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + arg10 - 1] & 0x4E240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg10 - 1) {
											Static142.anIntArray279[local51] = local7 - 1;
											Static186.anIntArray331[local51] = local14;
											Static98.anIntArrayArray66[local75 - 1][local70] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75 - 1][local70] = local249;
											break;
										}
										if ((local56[local87 - 1][local93 + local286] & 0x4FA40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (128 - arg10 > local75 && Static98.anIntArrayArray66[local75 + 1][local70] == 0 && (local56[arg10 + local87][local93] & 0x60E40000) == 0 && (local56[local87 + arg10][local93 + arg10 - 1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg10 - 1 <= local286) {
											Static142.anIntArray279[local51] = local7 + 1;
											Static186.anIntArray331[local51] = local14;
											Static98.anIntArrayArray66[local75 + 1][local70] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75 + 1][local70] = local249;
											break;
										}
										if ((local56[local87 + arg10][local93 + local286] & 0x78E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local70 > 0 && Static98.anIntArrayArray66[local75][local70 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[arg10 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg10 - 1 <= local286) {
											Static142.anIntArray279[local51] = local7;
											Static186.anIntArray331[local51] = local14 - 1;
											Static98.anIntArrayArray66[local75][local70 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75][local70 - 1] = local249;
											break;
										}
										if ((local56[local87 + local286][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local70 < 128 - arg10 && Static98.anIntArrayArray66[local75][local70 + 1] == 0 && (local56[local87][arg10 + local93] & 0x4E240000) == 0 && (local56[arg10 + local87 - 1][local93 + arg10] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg10 - 1) {
											Static142.anIntArray279[local51] = local7;
											Static186.anIntArray331[local51] = local14 + 1;
											Static98.anIntArrayArray66[local75][local70 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75][local70 + 1] = local249;
											break;
										}
										if ((local56[local286 + local87][local93 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 > 0 && local70 > 0 && Static98.anIntArrayArray66[local75 - 1][local70 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg10 <= local286) {
											Static142.anIntArray279[local51] = local7 - 1;
											Static186.anIntArray331[local51] = local14 - 1;
											Static98.anIntArrayArray66[local75 - 1][local70 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75 - 1][local70 - 1] = local249;
											break;
										}
										if ((local56[local87 - 1][local286 + local93 - 1] & 0x4FA40000) != 0 || (local56[local286 + local87 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 < 128 - arg10 && local70 > 0 && Static98.anIntArrayArray66[local75 + 1][local70 - 1] == 0 && (local56[arg10 + local87][local93 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg10) {
											Static142.anIntArray279[local51] = local7 + 1;
											Static186.anIntArray331[local51] = local14 - 1;
											Static98.anIntArrayArray66[local75 + 1][local70 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray169[local75 + 1][local70 - 1] = local249;
											break;
										}
										if ((local56[local87 + arg10][local286 + local93 - 1] & 0x78E40000) != 0 || (local56[local286 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 > 0 && local70 < 128 - arg10 && Static98.anIntArrayArray66[local75 - 1][local70 + 1] == 0 && (local56[local87 - 1][local93 + arg10] & 0x4E240000) == 0) {
									for (local286 = 1; local286 < arg10; local286++) {
										if ((local56[local87 - 1][local93 + local286] & 0x4FA40000) != 0 || (local56[local87 + local286 - 1][arg10 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static142.anIntArray279[local51] = local7 - 1;
									Static186.anIntArray331[local51] = local14 + 1;
									Static98.anIntArrayArray66[local75 - 1][local70 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static315.anIntArrayArray169[local75 - 1][local70 + 1] = local249;
								}
							} while (128 - arg10 <= local75);
						} while (128 - arg10 <= local70);
					} while (Static98.anIntArrayArray66[local75 + 1][local70 + 1] != 0);
				} while ((local56[local87 + arg10][local93 + arg10] & 0x78240000) != 0);
				for (local286 = 1; local286 < arg10; local286++) {
					if ((local56[local87 + local286][arg10 + local93] & 0x7E240000) != 0 || (local56[local87 + arg10][local286 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static142.anIntArray279[local51] = local7 + 1;
				Static186.anIntArray331[local51] = local14 + 1;
				Static98.anIntArrayArray66[local75 + 1][local70 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local75 + 1][local70 + 1] = local249;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method5295() {
		Static295.anIntArray457 = Static58.method1228(0.4F);
	}
}
