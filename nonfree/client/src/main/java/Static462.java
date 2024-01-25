import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
	public static int anInt8470;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!vda;")
	public static Class355 aClass355_2;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public static int anInt8469 = 0;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_194 = new Class215(98, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIILclient!fe;II)Z")
	public static boolean method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class104 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg5 - 64;
		Static475.anIntArrayArray57[64][64] = 99;
		@Pc(45) int local45 = arg2 - 64;
		Static5.anIntArrayArray1[64][64] = 0;
		@Pc(53) byte local53 = 0;
		Static407.anIntArray495[0] = arg5;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local53 + 1;
		Static485.anIntArray581[0] = arg2;
		@Pc(67) int[][] local67 = arg8.anIntArrayArray17;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(87) int local87;
				@Pc(98) int local98;
				@Pc(103) int local103;
				@Pc(246) int local246;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local59 == local62) {
									Static359.anInt7117 = local9;
									Static604.anInt10625 = local7;
									return false;
								}
								local9 = Static485.anIntArray581[local59];
								local7 = Static407.anIntArray495[local59];
								local82 = local7 - local17;
								local87 = local9 - local45;
								local59 = local59 + 1 & 0xFFF;
								local98 = local7 - arg8.anInt3585;
								local103 = local9 - arg8.anInt3573;
								if (arg9 == -4) {
									if (local7 == arg4 && arg10 == local9) {
										Static604.anInt10625 = local7;
										Static359.anInt7117 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static164.method3541(arg0, arg10, arg7, local7, local9, arg4, arg7, arg3)) {
										Static359.anInt7117 = local9;
										Static604.anInt10625 = local7;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg8.method3252(arg4, arg6, arg7, arg3, local7, arg7, local9, arg10, arg0)) {
										Static604.anInt10625 = local7;
										Static359.anInt7117 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg8.method3258(local7, arg10, arg7, arg3, arg0, arg6, local9, arg4)) {
										Static604.anInt10625 = local7;
										Static359.anInt7117 = local9;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg8.method3250(arg4, local9, arg7, arg1, local7, arg10, arg9)) {
										Static604.anInt10625 = local7;
										Static359.anInt7117 = local9;
										return true;
									}
								} else if (arg8.method3259(arg10, local9, arg4, local7, arg9, arg1, arg7)) {
									Static359.anInt7117 = local9;
									Static604.anInt10625 = local7;
									return true;
								}
								local246 = Static5.anIntArrayArray1[local82][local87] + 1;
								if (local82 > 0 && Static475.anIntArrayArray57[local82 - 1][local87] == 0 && (local67[local98 - 1][local103] & 0x43A40000) == 0 && (local67[local98 - 1][arg7 + local103 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 - 1 <= local282) {
											Static407.anIntArray495[local62] = local7 - 1;
											Static485.anIntArray581[local62] = local9;
											local62 = local62 + 1 & 0xFFF;
											Static475.anIntArrayArray57[local82 - 1][local87] = 2;
											Static5.anIntArrayArray1[local82 - 1][local87] = local246;
											break;
										}
										if ((local67[local98 - 1][local282 + local103] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local82 < 128 - arg7 && Static475.anIntArrayArray57[local82 + 1][local87] == 0 && (local67[local98 + arg7][local103] & 0x60E40000) == 0 && (local67[arg7 + local98][local103 + arg7 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 - 1 <= local282) {
											Static407.anIntArray495[local62] = local7 + 1;
											Static485.anIntArray581[local62] = local9;
											Static475.anIntArrayArray57[local82 + 1][local87] = 8;
											local62 = local62 + 1 & 0xFFF;
											Static5.anIntArrayArray1[local82 + 1][local87] = local246;
											break;
										}
										if ((local67[arg7 + local98][local103 + local282] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local87 > 0 && Static475.anIntArrayArray57[local82][local87 - 1] == 0 && (local67[local98][local103 - 1] & 0x43A40000) == 0 && (local67[local98 + arg7 - 1][local103 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7 - 1) {
											Static407.anIntArray495[local62] = local7;
											Static485.anIntArray581[local62] = local9 - 1;
											Static475.anIntArrayArray57[local82][local87 - 1] = 1;
											local62 = local62 + 1 & 0xFFF;
											Static5.anIntArrayArray1[local82][local87 - 1] = local246;
											break;
										}
										if ((local67[local98 + local282][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local87 < 128 - arg7 && Static475.anIntArrayArray57[local82][local87 + 1] == 0 && (local67[local98][local103 + arg7] & 0x4E240000) == 0 && (local67[arg7 + local98 - 1][local103 + arg7] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 - 1 <= local282) {
											Static407.anIntArray495[local62] = local7;
											Static485.anIntArray581[local62] = local9 + 1;
											Static475.anIntArrayArray57[local82][local87 + 1] = 4;
											local62 = local62 + 1 & 0xFFF;
											Static5.anIntArrayArray1[local82][local87 + 1] = local246;
											break;
										}
										if ((local67[local98 + local282][arg7 + local103] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local82 > 0 && local87 > 0 && Static475.anIntArrayArray57[local82 - 1][local87 - 1] == 0 && (local67[local98 - 1][local103 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 <= local282) {
											Static407.anIntArray495[local62] = local7 - 1;
											Static485.anIntArray581[local62] = local9 - 1;
											local62 = local62 + 1 & 0xFFF;
											Static475.anIntArrayArray57[local82 - 1][local87 - 1] = 3;
											Static5.anIntArrayArray1[local82 - 1][local87 - 1] = local246;
											break;
										}
										if ((local67[local98 - 1][local103 + local282 - 1] & 0x4FA40000) != 0 || (local67[local98 + local282 - 1][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local82 < 128 - arg7 && local87 > 0 && Static475.anIntArrayArray57[local82 + 1][local87 - 1] == 0 && (local67[local98 + arg7][local103 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 <= local282) {
											Static407.anIntArray495[local62] = local7 + 1;
											Static485.anIntArray581[local62] = local9 - 1;
											Static475.anIntArrayArray57[local82 + 1][local87 - 1] = 9;
											local62 = local62 + 1 & 0xFFF;
											Static5.anIntArrayArray1[local82 + 1][local87 - 1] = local246;
											break;
										}
										if ((local67[local98 + arg7][local282 + local103 - 1] & 0x78E40000) != 0 || (local67[local98 + local282][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local82 > 0 && local87 < 128 - arg7 && Static475.anIntArrayArray57[local82 - 1][local87 + 1] == 0 && (local67[local98 - 1][arg7 + local103] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg7; local282++) {
										if ((local67[local98 - 1][local282 + local103] & 0x4FA40000) != 0 || (local67[local282 + local98 - 1][local103 + arg7] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static407.anIntArray495[local62] = local7 - 1;
									Static485.anIntArray581[local62] = local9 + 1;
									Static475.anIntArrayArray57[local82 - 1][local87 + 1] = 6;
									local62 = local62 + 1 & 0xFFF;
									Static5.anIntArrayArray1[local82 - 1][local87 + 1] = local246;
								}
							} while (128 - arg7 <= local82);
						} while (local87 >= 128 - arg7);
					} while (Static475.anIntArrayArray57[local82 + 1][local87 + 1] != 0);
				} while ((local67[arg7 + local98][local103 + arg7] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg7; local282++) {
					if ((local67[local98 + local282][local103 + arg7] & 0x7E240000) != 0 || (local67[arg7 + local98][local103 + local282] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static407.anIntArray495[local62] = local7 + 1;
				Static485.anIntArray581[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local82 + 1][local87 + 1] = 12;
				Static5.anIntArrayArray1[local82 + 1][local87 + 1] = local246;
			}
		}
	}
}
