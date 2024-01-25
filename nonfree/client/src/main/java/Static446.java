import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "[Lclient!ts;")
	public static Class243[] aClass243Array1;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	public static int anInt7492;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
	public static int anInt7495;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIBIIIILclient!sd;III)Z")
	public static boolean method5983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class220 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg3 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static315.anIntArrayArray49[64][64] = 99;
		Static282.anIntArrayArray45[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static422.anIntArray685[0] = arg3;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static392.anIntArray649[0] = arg6;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray56;
		while (true) {
			label282: while (true) {
				@Pc(77) int local77;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(239) int local239;
				@Pc(281) int local281;
				do {
					do {
						do {
							label259: do {
								if (local51 == local48) {
									Static136.anInt2794 = local9;
									Static243.anInt4413 = local7;
									return false;
								}
								local9 = Static392.anIntArray649[local48];
								local7 = Static422.anIntArray685[local48];
								local48 = local48 + 1 & 0xFFF;
								local77 = local7 - local18;
								local82 = local9 - local23;
								local88 = local7 - arg7.anInt6196;
								local94 = local9 - arg7.anInt6189;
								if (arg2 == -4) {
									if (local7 == arg1 && arg5 == local9) {
										Static136.anInt2794 = local9;
										Static243.anInt4413 = local7;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static43.method655(arg1, arg8, local9, local7, arg10, arg10, arg0, arg5)) {
										Static136.anInt2794 = local9;
										Static243.anInt4413 = local7;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg7.method4885(arg1, arg10, arg5, arg9, arg8, arg0, local9, local7, arg10)) {
										Static136.anInt2794 = local9;
										Static243.anInt4413 = local7;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg7.method4889(arg9, local7, arg8, local9, arg10, arg0, arg5, arg1)) {
										Static136.anInt2794 = local9;
										Static243.anInt4413 = local7;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg7.method4881(arg5, local9, arg2, arg4, arg1, local7, arg10)) {
										Static243.anInt4413 = local7;
										Static136.anInt2794 = local9;
										return true;
									}
								} else if (arg7.method4874(arg10, local9, arg2, arg5, arg1, local7, arg4)) {
									Static136.anInt2794 = local9;
									Static243.anInt4413 = local7;
									return true;
								}
								local239 = Static282.anIntArrayArray45[local77][local82] + 1;
								if (local77 > 0 && Static315.anIntArrayArray49[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][arg10 + local94 - 1] & 0x4E240000) == 0) {
									local281 = 1;
									while (true) {
										if (arg10 - 1 <= local281) {
											Static422.anIntArray685[local51] = local7 - 1;
											Static392.anIntArray649[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray49[local77 - 1][local82] = 2;
											Static282.anIntArrayArray45[local77 - 1][local82] = local239;
											break;
										}
										if ((local56[local88 - 1][local281 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local77 < 128 - arg10 && Static315.anIntArrayArray49[local77 + 1][local82] == 0 && (local56[arg10 + local88][local94] & 0x60E40000) == 0 && (local56[local88 + arg10][local94 + arg10 - 1] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg10 - 1) {
											Static422.anIntArray685[local51] = local7 + 1;
											Static392.anIntArray649[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static315.anIntArrayArray49[local77 + 1][local82] = 8;
											Static282.anIntArrayArray45[local77 + 1][local82] = local239;
											break;
										}
										if ((local56[local88 + arg10][local281 + local94] & 0x78E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local82 > 0 && Static315.anIntArrayArray49[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg10 - 1][local94 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg10 - 1 <= local281) {
											Static422.anIntArray685[local51] = local7;
											Static392.anIntArray649[local51] = local9 - 1;
											Static315.anIntArrayArray49[local77][local82 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static282.anIntArrayArray45[local77][local82 - 1] = local239;
											break;
										}
										if ((local56[local281 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local82 < 128 - arg10 && Static315.anIntArrayArray49[local77][local82 + 1] == 0 && (local56[local88][local94 + arg10] & 0x4E240000) == 0 && (local56[local88 + arg10 - 1][local94 + arg10] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (arg10 - 1 <= local281) {
											Static422.anIntArray685[local51] = local7;
											Static392.anIntArray649[local51] = local9 + 1;
											Static315.anIntArrayArray49[local77][local82 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static282.anIntArrayArray45[local77][local82 + 1] = local239;
											break;
										}
										if ((local56[local281 + local88][local94 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local77 > 0 && local82 > 0 && Static315.anIntArrayArray49[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg10 <= local281) {
											Static422.anIntArray685[local51] = local7 - 1;
											Static392.anIntArray649[local51] = local9 - 1;
											Static315.anIntArrayArray49[local77 - 1][local82 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static282.anIntArrayArray45[local77 - 1][local82 - 1] = local239;
											break;
										}
										if ((local56[local88 - 1][local94 + local281 - 1] & 0x4FA40000) != 0 || (local56[local88 + local281 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (128 - arg10 > local77 && local82 > 0 && Static315.anIntArrayArray49[local77 + 1][local82 - 1] == 0 && (local56[arg10 + local88][local94 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg10 <= local281) {
											Static422.anIntArray685[local51] = local7 + 1;
											Static392.anIntArray649[local51] = local9 - 1;
											Static315.anIntArrayArray49[local77 + 1][local82 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static282.anIntArrayArray45[local77 + 1][local82 - 1] = local239;
											break;
										}
										if ((local56[arg10 + local88][local94 + local281 - 1] & 0x78E40000) != 0 || (local56[local281 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local77 > 0 && 128 - arg10 > local82 && Static315.anIntArrayArray49[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + arg10] & 0x4E240000) == 0) {
									for (local281 = 1; local281 < arg10; local281++) {
										if ((local56[local88 - 1][local94 + local281] & 0x4FA40000) != 0 || (local56[local88 + local281 - 1][local94 + arg10] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static422.anIntArray685[local51] = local7 - 1;
									Static392.anIntArray649[local51] = local9 + 1;
									Static315.anIntArrayArray49[local77 - 1][local82 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static282.anIntArrayArray45[local77 - 1][local82 + 1] = local239;
								}
							} while (local77 >= 128 - arg10);
						} while (local82 >= 128 - arg10);
					} while (Static315.anIntArrayArray49[local77 + 1][local82 + 1] != 0);
				} while ((local56[local88 + arg10][arg10 + local94] & 0x78240000) != 0);
				for (local281 = 1; local281 < arg10; local281++) {
					if ((local56[local281 + local88][local94 + arg10] & 0x7E240000) != 0 || (local56[arg10 + local88][local281 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static422.anIntArray685[local51] = local7 + 1;
				Static392.anIntArray649[local51] = local9 + 1;
				Static315.anIntArrayArray49[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static282.anIntArrayArray45[local77 + 1][local82 + 1] = local239;
			}
		}
	}
}
