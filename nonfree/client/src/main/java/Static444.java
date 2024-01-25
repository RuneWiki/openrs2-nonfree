import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_10;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_250 = new Class194(47, -2);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIIIILclient!nfa;II)Z")
	public static boolean method6661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class237 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg7 - 64;
		@Pc(22) int local22 = arg2 - 64;
		Static634.anIntArrayArray60[64][64] = 99;
		Static184.anIntArrayArray19[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static333.anIntArray343[0] = arg7;
		@Pc(42) int local42 = 0;
		@Pc(53) int local53 = local36 + 1;
		Static58.anIntArray68[0] = arg2;
		@Pc(58) int[][] local58 = arg8.anIntArrayArray33;
		while (true) {
			label282: while (true) {
				@Pc(73) int local73;
				@Pc(78) int local78;
				@Pc(90) int local90;
				@Pc(96) int local96;
				@Pc(239) int local239;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local53 == local42) {
									Static255.anInt4980 = local7;
									Static58.anInt1078 = local9;
									return false;
								}
								local9 = Static58.anIntArray68[local42];
								local7 = Static333.anIntArray343[local42];
								local73 = local7 - local17;
								local78 = local9 - local22;
								local42 = local42 + 1 & 0xFFF;
								local90 = local7 - arg8.anInt6799;
								local96 = local9 - arg8.anInt6790;
								if (arg9 == -4) {
									if (local7 == arg1 && arg3 == local9) {
										Static255.anInt4980 = local7;
										Static58.anInt1078 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static559.method7954(arg4, local7, arg3, arg1, arg6, arg10, arg6, local9)) {
										Static58.anInt1078 = local9;
										Static255.anInt4980 = local7;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg8.method5909(arg4, arg6, local9, arg6, arg5, arg3, arg10, arg1, local7)) {
										Static255.anInt4980 = local7;
										Static58.anInt1078 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg8.method5903(arg4, arg5, local7, arg6, local9, arg1, arg10, arg3)) {
										Static58.anInt1078 = local9;
										Static255.anInt4980 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg8.method5902(arg3, arg9, arg0, arg1, local9, arg6, local7)) {
										Static58.anInt1078 = local9;
										Static255.anInt4980 = local7;
										return true;
									}
								} else if (arg8.method5910(arg1, arg6, arg3, local7, arg9, local9, arg0)) {
									Static255.anInt4980 = local7;
									Static58.anInt1078 = local9;
									return true;
								}
								local239 = Static184.anIntArrayArray19[local73][local78] + 1;
								if (local73 > 0 && Static634.anIntArrayArray60[local73 - 1][local78] == 0 && (local58[local90 - 1][local96] & 0x43A40000) == 0 && (local58[local90 - 1][local96 + arg6 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static333.anIntArray343[local53] = local7 - 1;
											Static58.anIntArray68[local53] = local9;
											local53 = local53 + 1 & 0xFFF;
											Static634.anIntArrayArray60[local73 - 1][local78] = 2;
											Static184.anIntArrayArray19[local73 - 1][local78] = local239;
											break;
										}
										if ((local58[local90 - 1][local282 + local96] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local73 && Static634.anIntArrayArray60[local73 + 1][local78] == 0 && (local58[arg6 + local90][local96] & 0x60E40000) == 0 && (local58[local90 + arg6][arg6 + local96 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static333.anIntArray343[local53] = local7 + 1;
											Static58.anIntArray68[local53] = local9;
											local53 = local53 + 1 & 0xFFF;
											Static634.anIntArrayArray60[local73 + 1][local78] = 8;
											Static184.anIntArrayArray19[local73 + 1][local78] = local239;
											break;
										}
										if ((local58[arg6 + local90][local96 + local282] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local78 > 0 && Static634.anIntArrayArray60[local73][local78 - 1] == 0 && (local58[local90][local96 - 1] & 0x43A40000) == 0 && (local58[arg6 + local90 - 1][local96 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static333.anIntArray343[local53] = local7;
											Static58.anIntArray68[local53] = local9 - 1;
											Static634.anIntArrayArray60[local73][local78 - 1] = 1;
											local53 = local53 + 1 & 0xFFF;
											Static184.anIntArrayArray19[local73][local78 - 1] = local239;
											break;
										}
										if ((local58[local282 + local90][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local78 < 128 - arg6 && Static634.anIntArrayArray60[local73][local78 + 1] == 0 && (local58[local90][arg6 + local96] & 0x4E240000) == 0 && (local58[arg6 + local90 - 1][arg6 + local96] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static333.anIntArray343[local53] = local7;
											Static58.anIntArray68[local53] = local9 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static634.anIntArrayArray60[local73][local78 + 1] = 4;
											Static184.anIntArrayArray19[local73][local78 + 1] = local239;
											break;
										}
										if ((local58[local90 + local282][arg6 + local96] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local73 > 0 && local78 > 0 && Static634.anIntArrayArray60[local73 - 1][local78 - 1] == 0 && (local58[local90 - 1][local96 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 <= local282) {
											Static333.anIntArray343[local53] = local7 - 1;
											Static58.anIntArray68[local53] = local9 - 1;
											Static634.anIntArrayArray60[local73 - 1][local78 - 1] = 3;
											local53 = local53 + 1 & 0xFFF;
											Static184.anIntArrayArray19[local73 - 1][local78 - 1] = local239;
											break;
										}
										if ((local58[local90 - 1][local282 + local96 - 1] & 0x4FA40000) != 0 || (local58[local282 + local90 - 1][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local73 && local78 > 0 && Static634.anIntArrayArray60[local73 + 1][local78 - 1] == 0 && (local58[arg6 + local90][local96 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6) {
											Static333.anIntArray343[local53] = local7 + 1;
											Static58.anIntArray68[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static634.anIntArrayArray60[local73 + 1][local78 - 1] = 9;
											Static184.anIntArrayArray19[local73 + 1][local78 - 1] = local239;
											break;
										}
										if ((local58[arg6 + local90][local96 + local282 - 1] & 0x78E40000) != 0 || (local58[local282 + local90][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local73 > 0 && local78 < 128 - arg6 && Static634.anIntArrayArray60[local73 - 1][local78 + 1] == 0 && (local58[local90 - 1][arg6 + local96] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg6; local282++) {
										if ((local58[local90 - 1][local96 + local282] & 0x4FA40000) != 0 || (local58[local90 + local282 - 1][arg6 + local96] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static333.anIntArray343[local53] = local7 - 1;
									Static58.anIntArray68[local53] = local9 + 1;
									local53 = local53 + 1 & 0xFFF;
									Static634.anIntArrayArray60[local73 - 1][local78 + 1] = 6;
									Static184.anIntArrayArray19[local73 - 1][local78 + 1] = local239;
								}
							} while (128 - arg6 <= local73);
						} while (128 - arg6 <= local78);
					} while (Static634.anIntArrayArray60[local73 + 1][local78 + 1] != 0);
				} while ((local58[local90 + arg6][local96 + arg6] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg6; local282++) {
					if ((local58[local90 + local282][local96 + arg6] & 0x7E240000) != 0 || (local58[local90 + arg6][local96 + local282] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static333.anIntArray343[local53] = local7 + 1;
				Static58.anIntArray68[local53] = local9 + 1;
				Static634.anIntArrayArray60[local73 + 1][local78 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local73 + 1][local78 + 1] = local239;
			}
		}
	}
}
