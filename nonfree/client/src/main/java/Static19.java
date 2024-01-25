import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "Lclient!vo;")
	public static Class348 aClass348_11;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "[Lclient!ri;")
	public static final Interface19[] anInterface19Array1 = new Interface19[75];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIBI)I")
	public static int method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg2;
		@Pc(26) int local26 = (arg2 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return ((local8 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local8 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nea;IIIIIBIIIII)Z")
	public static boolean method823(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg6;
		@Pc(14) int local14 = arg10;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(28) int local28 = arg10 - 64;
		Static237.anIntArrayArray26[64][64] = 99;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static140.anIntArray146[0] = arg6;
		@Pc(51) int local51 = local42 + 1;
		Static398.anIntArray416[0] = arg10;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray31;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(80) int local80;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(246) int local246;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static208.anInt4412 = local14;
									Static263.anInt5323 = local7;
									return false;
								}
								local7 = Static140.anIntArray146[local44];
								local14 = Static398.anIntArray416[local44];
								local70 = local7 - local23;
								local44 = local44 + 1 & 0xFFF;
								local80 = local14 - local28;
								local85 = local7 - arg0.anInt6640;
								local91 = local14 - arg0.anInt6654;
								if (arg1 == -4) {
									if (local7 == arg5 && arg3 == local14) {
										Static263.anInt5323 = local7;
										Static208.anInt4412 = local14;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static407.method6148(arg8, local7, arg5, arg8, local14, arg9, arg4, arg3)) {
										Static263.anInt5323 = local7;
										Static208.anInt4412 = local14;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg0.method5279(arg3, local7, arg7, local14, arg4, arg8, arg8, arg5, arg9)) {
										Static263.anInt5323 = local7;
										Static208.anInt4412 = local14;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg0.method5277(local14, local7, arg4, arg9, arg5, arg7, arg3, arg8)) {
										Static208.anInt4412 = local14;
										Static263.anInt5323 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg0.method5267(local14, arg8, arg1, arg2, arg5, local7, arg3)) {
										Static208.anInt4412 = local14;
										Static263.anInt5323 = local7;
										return true;
									}
								} else if (arg0.method5265(arg3, arg8, arg1, arg5, local14, arg2, local7)) {
									Static208.anInt4412 = local14;
									Static263.anInt5323 = local7;
									return true;
								}
								local246 = Static481.anIntArrayArray53[local70][local80] + 1;
								if (local70 > 0 && Static237.anIntArrayArray26[local70 - 1][local80] == 0 && (local56[local85 - 1][local91] & 0x43A40000) == 0 && (local56[local85 - 1][local91 + arg8 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg8 - 1) {
											Static140.anIntArray146[local51] = local7 - 1;
											Static398.anIntArray416[local51] = local14;
											Static237.anIntArrayArray26[local70 - 1][local80] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static481.anIntArrayArray53[local70 - 1][local80] = local246;
											break;
										}
										if ((local56[local85 - 1][local91 + local292] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local70 < 128 - arg8 && Static237.anIntArrayArray26[local70 + 1][local80] == 0 && (local56[local85 + arg8][local91] & 0x60E40000) == 0 && (local56[arg8 + local85][local91 + arg8 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg8 - 1) {
											Static140.anIntArray146[local51] = local7 + 1;
											Static398.anIntArray416[local51] = local14;
											local51 = local51 + 1 & 0xFFF;
											Static237.anIntArrayArray26[local70 + 1][local80] = 8;
											Static481.anIntArrayArray53[local70 + 1][local80] = local246;
											break;
										}
										if ((local56[local85 + arg8][local91 + local292] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 > 0 && Static237.anIntArrayArray26[local70][local80 - 1] == 0 && (local56[local85][local91 - 1] & 0x43A40000) == 0 && (local56[local85 + arg8 - 1][local91 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg8 - 1) {
											Static140.anIntArray146[local51] = local7;
											Static398.anIntArray416[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static237.anIntArrayArray26[local70][local80 - 1] = 1;
											Static481.anIntArrayArray53[local70][local80 - 1] = local246;
											break;
										}
										if ((local56[local85 + local292][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 < 128 - arg8 && Static237.anIntArrayArray26[local70][local80 + 1] == 0 && (local56[local85][arg8 + local91] & 0x4E240000) == 0 && (local56[local85 + arg8 - 1][local91 + arg8] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg8 - 1) {
											Static140.anIntArray146[local51] = local7;
											Static398.anIntArray416[local51] = local14 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static237.anIntArrayArray26[local70][local80 + 1] = 4;
											Static481.anIntArrayArray53[local70][local80 + 1] = local246;
											break;
										}
										if ((local56[local292 + local85][arg8 + local91] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local70 > 0 && local80 > 0 && Static237.anIntArrayArray26[local70 - 1][local80 - 1] == 0 && (local56[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg8 <= local292) {
											Static140.anIntArray146[local51] = local7 - 1;
											Static398.anIntArray416[local51] = local14 - 1;
											Static237.anIntArrayArray26[local70 - 1][local80 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static481.anIntArrayArray53[local70 - 1][local80 - 1] = local246;
											break;
										}
										if ((local56[local85 - 1][local292 + local91 - 1] & 0x4FA40000) != 0 || (local56[local292 + local85 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg8 > local70 && local80 > 0 && Static237.anIntArrayArray26[local70 + 1][local80 - 1] == 0 && (local56[arg8 + local85][local91 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg8) {
											Static140.anIntArray146[local51] = local7 + 1;
											Static398.anIntArray416[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static237.anIntArrayArray26[local70 + 1][local80 - 1] = 9;
											Static481.anIntArrayArray53[local70 + 1][local80 - 1] = local246;
											break;
										}
										if ((local56[arg8 + local85][local91 + local292 - 1] & 0x78E40000) != 0 || (local56[local85 + local292][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local70 > 0 && 128 - arg8 > local80 && Static237.anIntArrayArray26[local70 - 1][local80 + 1] == 0 && (local56[local85 - 1][local91 + arg8] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg8; local292++) {
										if ((local56[local85 - 1][local292 + local91] & 0x4FA40000) != 0 || (local56[local85 + local292 - 1][arg8 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static140.anIntArray146[local51] = local7 - 1;
									Static398.anIntArray416[local51] = local14 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static237.anIntArrayArray26[local70 - 1][local80 + 1] = 6;
									Static481.anIntArrayArray53[local70 - 1][local80 + 1] = local246;
								}
							} while (128 - arg8 <= local70);
						} while (local80 >= 128 - arg8);
					} while (Static237.anIntArrayArray26[local70 + 1][local80 + 1] != 0);
				} while ((local56[arg8 + local85][local91 + arg8] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg8; local292++) {
					if ((local56[local292 + local85][local91 + arg8] & 0x7E240000) != 0 || (local56[local85 + arg8][local91 + local292] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static140.anIntArray146[local51] = local7 + 1;
				Static398.anIntArray416[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local70 + 1][local80 + 1] = 12;
				Static481.anIntArrayArray53[local70 + 1][local80 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method825(@OriginalArg(1) int arg0) {
		Static15.anIntArray16 = new int[arg0];
		Static211.anIntArray211 = new int[arg0];
		Static333.anIntArray354 = new int[arg0];
		Static425.anIntArray455 = new int[arg0];
		Static301.anIntArray332 = new int[arg0];
	}
}
