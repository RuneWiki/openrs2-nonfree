import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public static final int anInt7026 = 1405;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
	public static final int[] anIntArray435 = new int[1];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/lang/String;)V")
	public static void method5902(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		Static576.method7738(-1, true, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIILclient!jw;I)Z")
	public static boolean method5903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class169 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg10;
		@Pc(18) int local18 = arg1 - 64;
		Static285.anIntArrayArray111[64][64] = 99;
		@Pc(34) int local34 = arg10 - 64;
		Static427.anIntArrayArray161[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static305.anIntArray301[0] = arg1;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static47.anIntArray608[0] = arg10;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray105;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(77) int local77;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(247) int local247;
				@Pc(293) int local293;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static439.anInt7337 = local9;
									Static505.anInt8221 = local7;
									return false;
								}
								local9 = Static47.anIntArray608[local48];
								local7 = Static305.anIntArray301[local48];
								local48 = local48 + 1 & 0xFFF;
								local77 = local9 - local34;
								local82 = local7 - local18;
								local88 = local7 - arg9.anInt4643;
								local94 = local9 - arg9.anInt4631;
								if (arg6 == -4) {
									if (local7 == arg8 && local9 == arg2) {
										Static439.anInt7337 = local9;
										Static505.anInt8221 = local7;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static551.method7301(arg4, arg7, arg8, arg0, arg2, local9, arg7, local7)) {
										Static439.anInt7337 = local9;
										Static505.anInt8221 = local7;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg9.method4033(arg8, local7, arg5, arg2, arg7, arg4, arg0, local9, arg7)) {
										Static505.anInt8221 = local7;
										Static439.anInt7337 = local9;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg9.method4036(arg0, arg4, local7, arg8, arg7, arg5, local9, arg2)) {
										Static439.anInt7337 = local9;
										Static505.anInt8221 = local7;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg9.method4024(arg7, arg2, arg6, arg3, local7, arg8, local9)) {
										Static439.anInt7337 = local9;
										Static505.anInt8221 = local7;
										return true;
									}
								} else if (arg9.method4039(arg3, arg8, arg6, local7, arg7, local9, arg2)) {
									Static505.anInt8221 = local7;
									Static439.anInt7337 = local9;
									return true;
								}
								local247 = Static427.anIntArrayArray161[local82][local77] + 1;
								if (local82 > 0 && Static285.anIntArrayArray111[local82 - 1][local77] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg7 - 1] & 0x4E240000) == 0) {
									local293 = 1;
									while (true) {
										if (arg7 - 1 <= local293) {
											Static305.anIntArray301[local51] = local7 - 1;
											Static47.anIntArray608[local51] = local9;
											Static285.anIntArrayArray111[local82 - 1][local77] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static427.anIntArrayArray161[local82 - 1][local77] = local247;
											break;
										}
										if ((local56[local88 - 1][local94 + local293] & 0x4FA40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg7 > local82 && Static285.anIntArrayArray111[local82 + 1][local77] == 0 && (local56[local88 + arg7][local94] & 0x60E40000) == 0 && (local56[local88 + arg7][local94 + arg7 - 1] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg7 - 1) {
											Static305.anIntArray301[local51] = local7 + 1;
											Static47.anIntArray608[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static285.anIntArrayArray111[local82 + 1][local77] = 8;
											Static427.anIntArrayArray161[local82 + 1][local77] = local247;
											break;
										}
										if ((local56[local88 + arg7][local293 + local94] & 0x78E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local77 > 0 && Static285.anIntArrayArray111[local82][local77 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg7 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg7 - 1 <= local293) {
											Static305.anIntArray301[local51] = local7;
											Static47.anIntArray608[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static285.anIntArrayArray111[local82][local77 - 1] = 1;
											Static427.anIntArrayArray161[local82][local77 - 1] = local247;
											break;
										}
										if ((local56[local88 + local293][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg7 > local77 && Static285.anIntArrayArray111[local82][local77 + 1] == 0 && (local56[local88][local94 + arg7] & 0x4E240000) == 0 && (local56[arg7 + local88 - 1][arg7 + local94] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg7 - 1) {
											Static305.anIntArray301[local51] = local7;
											Static47.anIntArray608[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static285.anIntArrayArray111[local82][local77 + 1] = 4;
											Static427.anIntArrayArray161[local82][local77 + 1] = local247;
											break;
										}
										if ((local56[local293 + local88][arg7 + local94] & 0x7E240000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local82 > 0 && local77 > 0 && Static285.anIntArrayArray111[local82 - 1][local77 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg7 <= local293) {
											Static305.anIntArray301[local51] = local7 - 1;
											Static47.anIntArray608[local51] = local9 - 1;
											Static285.anIntArrayArray111[local82 - 1][local77 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static427.anIntArrayArray161[local82 - 1][local77 - 1] = local247;
											break;
										}
										if ((local56[local88 - 1][local293 + local94 - 1] & 0x4FA40000) != 0 || (local56[local88 + local293 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local82 < 128 - arg7 && local77 > 0 && Static285.anIntArrayArray111[local82 + 1][local77 - 1] == 0 && (local56[arg7 + local88][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg7 <= local293) {
											Static305.anIntArray301[local51] = local7 + 1;
											Static47.anIntArray608[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static285.anIntArrayArray111[local82 + 1][local77 - 1] = 9;
											Static427.anIntArrayArray161[local82 + 1][local77 - 1] = local247;
											break;
										}
										if ((local56[local88 + arg7][local293 + local94 - 1] & 0x78E40000) != 0 || (local56[local88 + local293][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local82 > 0 && 128 - arg7 > local77 && Static285.anIntArrayArray111[local82 - 1][local77 + 1] == 0 && (local56[local88 - 1][local94 + arg7] & 0x4E240000) == 0) {
									for (local293 = 1; local293 < arg7; local293++) {
										if ((local56[local88 - 1][local94 + local293] & 0x4FA40000) != 0 || (local56[local88 + local293 - 1][arg7 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static305.anIntArray301[local51] = local7 - 1;
									Static47.anIntArray608[local51] = local9 + 1;
									Static285.anIntArrayArray111[local82 - 1][local77 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static427.anIntArrayArray161[local82 - 1][local77 + 1] = local247;
								}
							} while (128 - arg7 <= local82);
						} while (128 - arg7 <= local77);
					} while (Static285.anIntArrayArray111[local82 + 1][local77 + 1] != 0);
				} while ((local56[local88 + arg7][local94 + arg7] & 0x78240000) != 0);
				for (local293 = 1; local293 < arg7; local293++) {
					if ((local56[local88 + local293][local94 + arg7] & 0x7E240000) != 0 || (local56[arg7 + local88][local94 + local293] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9 + 1;
				Static285.anIntArrayArray111[local82 + 1][local77 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local82 + 1][local77 + 1] = local247;
			}
		}
	}
}
