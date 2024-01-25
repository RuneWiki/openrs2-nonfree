import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public static void method284() {
		for (@Pc(1) int local1 = Static324.anInt5879; local1 < Static330.anInt4381; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static347.anInt6411; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static191.anInt6006; local7++) {
					@Pc(16) Class217 local16 = Static440.aClass217ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub1_Sub2 local21 = local16.aClass11_Sub1_Sub2_1;
						@Pc(24) Class11_Sub1_Sub2 local24 = local16.aClass11_Sub1_Sub2_2;
						if (local21 != null && local21.method8313()) {
							Static248.method4055(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8313()) {
								Static248.method4055(local24, local1, local4, local7, 1, 1);
								local24.method8316(0, Static328.aClass87_6, local21, false, 0, 0);
								local24.method8311();
							}
							local21.method8311();
						}
						for (@Pc(68) Class61 local68 = local16.aClass61_2; local68 != null; local68 = local68.aClass61_1) {
							@Pc(72) Class11_Sub1_Sub1 local72 = local68.aClass11_Sub1_Sub1_1;
							if (local72 != null && local72.method8313()) {
								Static248.method4055(local72, local1, local4, local7, local72.aShort96 + 1 - local72.aShort95, local72.aShort94 - local72.aShort97 + 1);
								local72.method8311();
							}
						}
						@Pc(108) Class11_Sub1_Sub4 local108 = local16.aClass11_Sub1_Sub4_1;
						if (local108 != null && local108.method8313()) {
							Static228.method3853(local108, local1, local4, local7);
							local108.method8311();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIBIIILclient!jn;)Z")
	public static boolean method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class179 arg10) {
		@Pc(5) int local5 = arg5;
		@Pc(7) int local7 = arg7;
		@Pc(21) int local21 = arg5 - 64;
		@Pc(25) int local25 = arg7 - 64;
		Static559.anIntArrayArray88[64][64] = 99;
		Static597.anIntArrayArray96[64][64] = 0;
		@Pc(39) byte local39 = 0;
		Static369.anIntArray441[0] = arg5;
		@Pc(45) int local45 = 0;
		@Pc(48) int local48 = local39 + 1;
		Static423.anIntArray719[0] = arg7;
		@Pc(53) int[][] local53 = arg10.anIntArrayArray44;
		while (true) {
			label282: while (true) {
				@Pc(67) int local67;
				@Pc(78) int local78;
				@Pc(84) int local84;
				@Pc(89) int local89;
				@Pc(243) int local243;
				@Pc(283) int local283;
				do {
					do {
						do {
							label259: do {
								if (local45 == local48) {
									Static590.anInt9764 = local7;
									Static540.anInt9014 = local5;
									return false;
								}
								local7 = Static423.anIntArray719[local45];
								local5 = Static369.anIntArray441[local45];
								local67 = local5 - local21;
								local45 = local45 + 1 & 0xFFF;
								local78 = local7 - local25;
								local84 = local5 - arg10.anInt5187;
								local89 = local7 - arg10.anInt5199;
								if (arg2 == -4) {
									if (local5 == arg0 && arg9 == local7) {
										Static590.anInt9764 = local7;
										Static540.anInt9014 = local5;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static299.method4661(arg1, arg4, local7, arg8, local5, arg0, arg8, arg9)) {
										Static590.anInt9764 = local7;
										Static540.anInt9014 = local5;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg10.method4345(arg9, arg1, local7, arg8, local5, arg0, arg4, arg8, arg3)) {
										Static590.anInt9764 = local7;
										Static540.anInt9014 = local5;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg10.method4339(local5, local7, arg3, arg8, arg0, arg1, arg9, arg4)) {
										Static590.anInt9764 = local7;
										Static540.anInt9014 = local5;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg10.method4353(arg9, local7, arg2, arg6, arg8, arg0, local5)) {
										Static590.anInt9764 = local7;
										Static540.anInt9014 = local5;
										return true;
									}
								} else if (arg10.method4346(arg8, arg9, arg6, local5, arg2, arg0, local7)) {
									Static540.anInt9014 = local5;
									Static590.anInt9764 = local7;
									return true;
								}
								local243 = Static597.anIntArrayArray96[local67][local78] + 1;
								if (local67 > 0 && Static559.anIntArrayArray88[local67 - 1][local78] == 0 && (local53[local84 - 1][local89] & 0x43A40000) == 0 && (local53[local84 - 1][local89 + arg8 - 1] & 0x4E240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg8 - 1 <= local283) {
											Static369.anIntArray441[local48] = local5 - 1;
											Static423.anIntArray719[local48] = local7;
											Static559.anIntArrayArray88[local67 - 1][local78] = 2;
											local48 = local48 + 1 & 0xFFF;
											Static597.anIntArrayArray96[local67 - 1][local78] = local243;
											break;
										}
										if ((local53[local84 - 1][local89 + local283] & 0x4FA40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg8 > local67 && Static559.anIntArrayArray88[local67 + 1][local78] == 0 && (local53[arg8 + local84][local89] & 0x60E40000) == 0 && (local53[arg8 + local84][arg8 + local89 - 1] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg8 - 1 <= local283) {
											Static369.anIntArray441[local48] = local5 + 1;
											Static423.anIntArray719[local48] = local7;
											Static559.anIntArrayArray88[local67 + 1][local78] = 8;
											local48 = local48 + 1 & 0xFFF;
											Static597.anIntArrayArray96[local67 + 1][local78] = local243;
											break;
										}
										if ((local53[local84 + arg8][local283 + local89] & 0x78E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local78 > 0 && Static559.anIntArrayArray88[local67][local78 - 1] == 0 && (local53[local84][local89 - 1] & 0x43A40000) == 0 && (local53[local84 + arg8 - 1][local89 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg8 - 1) {
											Static369.anIntArray441[local48] = local5;
											Static423.anIntArray719[local48] = local7 - 1;
											local48 = local48 + 1 & 0xFFF;
											Static559.anIntArrayArray88[local67][local78 - 1] = 1;
											Static597.anIntArrayArray96[local67][local78 - 1] = local243;
											break;
										}
										if ((local53[local283 + local84][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local78 < 128 - arg8 && Static559.anIntArrayArray88[local67][local78 + 1] == 0 && (local53[local84][local89 + arg8] & 0x4E240000) == 0 && (local53[local84 + arg8 - 1][local89 + arg8] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg8 - 1 <= local283) {
											Static369.anIntArray441[local48] = local5;
											Static423.anIntArray719[local48] = local7 + 1;
											Static559.anIntArrayArray88[local67][local78 + 1] = 4;
											local48 = local48 + 1 & 0xFFF;
											Static597.anIntArrayArray96[local67][local78 + 1] = local243;
											break;
										}
										if ((local53[local84 + local283][local89 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local67 > 0 && local78 > 0 && Static559.anIntArrayArray88[local67 - 1][local78 - 1] == 0 && (local53[local84 - 1][local89 - 1] & 0x43A40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg8 <= local283) {
											Static369.anIntArray441[local48] = local5 - 1;
											Static423.anIntArray719[local48] = local7 - 1;
											Static559.anIntArrayArray88[local67 - 1][local78 - 1] = 3;
											local48 = local48 + 1 & 0xFFF;
											Static597.anIntArrayArray96[local67 - 1][local78 - 1] = local243;
											break;
										}
										if ((local53[local84 - 1][local283 + local89 - 1] & 0x4FA40000) != 0 || (local53[local283 + local84 - 1][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (128 - arg8 > local67 && local78 > 0 && Static559.anIntArrayArray88[local67 + 1][local78 - 1] == 0 && (local53[arg8 + local84][local89 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg8) {
											Static369.anIntArray441[local48] = local5 + 1;
											Static423.anIntArray719[local48] = local7 - 1;
											Static559.anIntArrayArray88[local67 + 1][local78 - 1] = 9;
											local48 = local48 + 1 & 0xFFF;
											Static597.anIntArrayArray96[local67 + 1][local78 - 1] = local243;
											break;
										}
										if ((local53[arg8 + local84][local89 + local283 - 1] & 0x78E40000) != 0 || (local53[local283 + local84][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local67 > 0 && local78 < 128 - arg8 && Static559.anIntArrayArray88[local67 - 1][local78 + 1] == 0 && (local53[local84 - 1][arg8 + local89] & 0x4E240000) == 0) {
									for (local283 = 1; local283 < arg8; local283++) {
										if ((local53[local84 - 1][local283 + local89] & 0x4FA40000) != 0 || (local53[local283 + local84 - 1][arg8 + local89] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static369.anIntArray441[local48] = local5 - 1;
									Static423.anIntArray719[local48] = local7 + 1;
									local48 = local48 + 1 & 0xFFF;
									Static559.anIntArrayArray88[local67 - 1][local78 + 1] = 6;
									Static597.anIntArrayArray96[local67 - 1][local78 + 1] = local243;
								}
							} while (128 - arg8 <= local67);
						} while (local78 >= 128 - arg8);
					} while (Static559.anIntArrayArray88[local67 + 1][local78 + 1] != 0);
				} while ((local53[arg8 + local84][arg8 + local89] & 0x78240000) != 0);
				for (local283 = 1; local283 < arg8; local283++) {
					if ((local53[local283 + local84][local89 + arg8] & 0x7E240000) != 0 || (local53[local84 + arg8][local283 + local89] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static369.anIntArray441[local48] = local5 + 1;
				Static423.anIntArray719[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local67 + 1][local78 + 1] = 12;
				Static597.anIntArrayArray96[local67 + 1][local78 + 1] = local243;
			}
		}
	}
}
