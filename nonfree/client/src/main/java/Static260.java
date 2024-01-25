import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString187 = " from your ignore list first.";

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public static int anInt5000 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BC)Z")
	public static boolean method4481(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static284.aCharArray7;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (arg0 == local40) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
	public static void method4482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static164.aClass14_Sub4_Sub2_3.method2557(178);
		Static164.aClass14_Sub4_Sub2_3.method2532(arg0);
		Static164.aClass14_Sub4_Sub2_3.method2509(arg1);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method4485() {
		Static16.anInt297 = 0;
		Static2.anInt106 = -1;
		Static313.anInt6042 = 0;
		Static140.aBoolean195 = false;
		Static44.anInt1104 = 1;
		Static276.anInt5254 = -3;
		Static156.anInt5903 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([[BII[Z[[BILclient!e;[[BBIILclient!ee;ILclient!fr;)V")
	public static void method4486(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class48 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class69 arg12) {
		@Pc(60) int local60;
		if (arg12 != null && arg10 != null || arg10 != null && arg11 == 12 || arg12 != null && arg11 == 0) {
			@Pc(41) boolean[] local41 = arg12 != null && arg12.aBoolean150 ? Static242.aBooleanArrayArray2[arg11] : Static286.aBooleanArrayArray5[arg11];
			@Pc(71) Class69 local71;
			@Pc(89) byte local89;
			@Pc(105) int local105;
			@Pc(110) int local110;
			if (arg1 > 0) {
				if (arg5 > 0) {
					local60 = arg0[arg5 - 1][arg1 - 1] & 0xFF;
					if (local60 > 0) {
						local71 = Static327.method5626(local60 - 1);
						if (local71.anInt2182 != -1 && local71.aBoolean150) {
							local89 = arg7[arg5 - 1][arg1 - 1];
							local105 = arg4[arg5 - 1][arg1 - 1] * 2 + 4 & 0x7;
							local110 = Static137.method2755(local71, arg6);
							if (Static249.aBooleanArrayArray3[local89][local105]) {
								Static80.anIntArray177[0] = local71.anInt2182;
								Static271.anIntArray468[0] = local110;
								Static184.anIntArray329[0] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
								Static202.anIntArray355[0] = local71.anInt2186;
								Static94.anIntArray198[0] = local71.anInt2183;
								Static102.anIntArray212[0] = 256;
							}
						}
					}
				}
				if (arg5 < arg8 - 1) {
					local60 = arg0[arg5 + 1][arg1 - 1] & 0xFF;
					if (local60 > 0) {
						local71 = Static327.method5626(local60 - 1);
						if (local71.anInt2182 != -1 && local71.aBoolean150) {
							local89 = arg7[arg5 + 1][arg1 - 1];
							local105 = arg4[arg5 + 1][arg1 - 1] * 2 + 6 & 0x7;
							local110 = Static137.method2755(local71, arg6);
							if (Static249.aBooleanArrayArray3[local89][local105]) {
								Static80.anIntArray177[2] = local71.anInt2182;
								Static271.anIntArray468[2] = local110;
								Static184.anIntArray329[2] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
								Static202.anIntArray355[2] = local71.anInt2186;
								Static94.anIntArray198[2] = local71.anInt2183;
								Static102.anIntArray212[2] = 512;
							}
						}
					}
				}
			}
			if (arg1 < arg9 - 1) {
				if (arg5 > 0) {
					local60 = arg0[arg5 - 1][arg1 + 1] & 0xFF;
					if (local60 > 0) {
						local71 = Static327.method5626(local60 - 1);
						if (local71.anInt2182 != -1 && local71.aBoolean150) {
							local89 = arg7[arg5 - 1][arg1 + 1];
							local105 = arg4[arg5 - 1][arg1 + 1] * 2 + 2 & 0x7;
							local110 = Static137.method2755(local71, arg6);
							if (Static249.aBooleanArrayArray3[local89][local105]) {
								Static80.anIntArray177[6] = local71.anInt2182;
								Static271.anIntArray468[6] = local110;
								Static184.anIntArray329[6] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
								Static202.anIntArray355[6] = local71.anInt2186;
								Static94.anIntArray198[6] = local71.anInt2183;
								Static102.anIntArray212[6] = 64;
							}
						}
					}
				}
				if (arg5 < arg8 - 1) {
					local60 = arg0[arg5 + 1][arg1 + 1] & 0xFF;
					if (local60 > 0) {
						local71 = Static327.method5626(local60 - 1);
						if (local71.anInt2182 != -1 && local71.aBoolean150) {
							local89 = arg7[arg5 + 1][arg1 + 1];
							local105 = arg4[arg5 + 1][arg1 + 1] * 2 & 0x7;
							local110 = Static137.method2755(local71, arg6);
							if (Static249.aBooleanArrayArray3[local89][local105]) {
								Static80.anIntArray177[4] = local71.anInt2182;
								Static271.anIntArray468[4] = local110;
								Static184.anIntArray329[4] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
								Static202.anIntArray355[4] = local71.anInt2186;
								Static94.anIntArray198[4] = local71.anInt2183;
								Static102.anIntArray212[4] = 128;
							}
						}
					}
				}
			}
			@Pc(534) int local534;
			@Pc(539) int local539;
			@Pc(541) int local541;
			@Pc(523) byte local523;
			if (arg1 > 0) {
				local60 = arg0[arg5][arg1 - 1] & 0xFF;
				if (local60 > 0) {
					local71 = Static327.method5626(local60 - 1);
					if (local71.anInt2182 != -1) {
						local89 = arg7[arg5][arg1 - 1];
						local523 = arg4[arg5][arg1 - 1];
						if (local71.aBoolean150) {
							local110 = 2;
							local534 = local523 * 2 + 4;
							local539 = Static137.method2755(local71, arg6);
							for (local541 = 0; local541 < 3; local541++) {
								local534 &= 0x7;
								local110 &= 0x7;
								if (Static249.aBooleanArrayArray3[local89][local534] && Static94.anIntArray198[local110] <= local71.anInt2183) {
									Static80.anIntArray177[local110] = local71.anInt2182;
									Static271.anIntArray468[local110] = local539;
									Static184.anIntArray329[local110] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
									Static202.anIntArray355[local110] = local71.anInt2186;
									if (local71.anInt2183 == Static94.anIntArray198[local110]) {
										Static102.anIntArray212[local110] |= 0x20;
									} else {
										Static102.anIntArray212[local110] = 32;
									}
									Static94.anIntArray198[local110] = local71.anInt2183;
								}
								local534++;
								local110--;
							}
							if (!local41[arg2 & 0x3]) {
								arg3[0] = Static242.aBooleanArrayArray2[local89][local523 + 2 & 0x3];
							}
						} else if (!local41[arg2 & 0x3]) {
							arg3[0] = Static286.aBooleanArrayArray5[local89][local523 + 2 & 0x3];
						}
					}
				}
			}
			if (arg9 - 1 > arg1) {
				local60 = arg0[arg5][arg1 + 1] & 0xFF;
				if (local60 > 0) {
					local71 = Static327.method5626(local60 - 1);
					if (local71.anInt2182 != -1) {
						local89 = arg7[arg5][arg1 + 1];
						local523 = arg4[arg5][arg1 + 1];
						if (local71.aBoolean150) {
							local110 = 4;
							local534 = local523 * 2 + 2;
							local539 = Static137.method2755(local71, arg6);
							for (local541 = 0; local541 < 3; local541++) {
								local534 &= 0x7;
								local110 &= 0x7;
								if (Static249.aBooleanArrayArray3[local89][local534] && local71.anInt2183 >= Static94.anIntArray198[local110]) {
									Static80.anIntArray177[local110] = local71.anInt2182;
									Static271.anIntArray468[local110] = local539;
									Static184.anIntArray329[local110] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
									Static202.anIntArray355[local110] = local71.anInt2186;
									if (local71.anInt2183 == Static94.anIntArray198[local110]) {
										Static102.anIntArray212[local110] |= 0x10;
									} else {
										Static102.anIntArray212[local110] = 16;
									}
									Static94.anIntArray198[local110] = local71.anInt2183;
								}
								local534--;
								local110++;
							}
							if (!local41[arg2 + 2 & 0x3]) {
								arg3[2] = Static242.aBooleanArrayArray2[local89][local523 & 0x3];
							}
						} else if (!local41[arg2 + 2 & 0x3]) {
							arg3[2] = Static286.aBooleanArrayArray5[local89][local523 & 0x3];
						}
					}
				}
			}
			if (arg5 > 0) {
				local60 = arg0[arg5 - 1][arg1] & 0xFF;
				if (local60 > 0) {
					local71 = Static327.method5626(local60 - 1);
					if (local71.anInt2182 != -1) {
						local89 = arg7[arg5 - 1][arg1];
						local523 = arg4[arg5 - 1][arg1];
						if (local71.aBoolean150) {
							local110 = 6;
							local534 = local523 * 2 + 4;
							local539 = Static137.method2755(local71, arg6);
							for (local541 = 0; local541 < 3; local541++) {
								local534 &= 0x7;
								local110 &= 0x7;
								if (Static249.aBooleanArrayArray3[local89][local534] && Static94.anIntArray198[local110] <= local71.anInt2183) {
									Static80.anIntArray177[local110] = local71.anInt2182;
									Static271.anIntArray468[local110] = local539;
									Static184.anIntArray329[local110] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
									Static202.anIntArray355[local110] = local71.anInt2186;
									if (Static94.anIntArray198[local110] == local71.anInt2183) {
										Static102.anIntArray212[local110] |= 0x8;
									} else {
										Static102.anIntArray212[local110] = 8;
									}
									Static94.anIntArray198[local110] = local71.anInt2183;
								}
								local110++;
								local534--;
							}
							if (!local41[arg2 + 3 & 0x3]) {
								arg3[3] = Static242.aBooleanArrayArray2[local89][local523 + 1 & 0x3];
							}
						} else if (!local41[arg2 + 3 & 0x3]) {
							arg3[3] = Static286.aBooleanArrayArray5[local89][local523 + 1 & 0x3];
						}
					}
				}
			}
			if (arg8 - 1 > arg5) {
				local60 = arg0[arg5 + 1][arg1] & 0xFF;
				if (local60 > 0) {
					local71 = Static327.method5626(local60 - 1);
					if (local71.anInt2182 != -1) {
						local89 = arg7[arg5 + 1][arg1];
						local523 = arg4[arg5 + 1][arg1];
						if (local71.aBoolean150) {
							local110 = 4;
							local534 = local523 * 2 + 6;
							local539 = Static137.method2755(local71, arg6);
							for (local541 = 0; local541 < 3; local541++) {
								local110 &= 0x7;
								local534 &= 0x7;
								if (Static249.aBooleanArrayArray3[local89][local534] && Static94.anIntArray198[local110] <= local71.anInt2183) {
									Static80.anIntArray177[local110] = local71.anInt2182;
									Static271.anIntArray468[local110] = local539;
									Static184.anIntArray329[local110] = arg6.method5160() ? local71.anInt2172 : local71.anInt2178;
									Static202.anIntArray355[local110] = local71.anInt2186;
									if (local71.anInt2183 == Static94.anIntArray198[local110]) {
										Static102.anIntArray212[local110] |= 0x4;
									} else {
										Static102.anIntArray212[local110] = 4;
									}
									Static94.anIntArray198[local110] = local71.anInt2183;
								}
								local110--;
								local534++;
							}
							if (!local41[arg2 + 1 & 0x3]) {
								arg3[1] = Static242.aBooleanArrayArray2[local89][local523 + 3 & 0x3];
							}
						} else if (!local41[arg2 + 1 & 0x3]) {
							arg3[1] = Static286.aBooleanArrayArray5[local89][local523 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		@Pc(1241) int local1241 = Static137.method2755(arg12, arg6);
		if (!arg12.aBoolean150) {
			return;
		}
		for (local60 = 0; local60 < 8; local60++) {
			@Pc(1257) int local1257 = local60 - arg2 * 2 & 0x7;
			if (Static249.aBooleanArrayArray3[arg11][local60] && arg12.anInt2183 >= Static94.anIntArray198[local1257]) {
				Static80.anIntArray177[local1257] = arg12.anInt2182;
				Static271.anIntArray468[local1257] = local1241;
				Static184.anIntArray329[local1257] = arg6.method5160() ? arg12.anInt2172 : arg12.anInt2178;
				Static202.anIntArray355[local1257] = arg12.anInt2186;
				if (arg12.anInt2183 == Static94.anIntArray198[local1257]) {
					Static102.anIntArray212[local1257] |= 0x2;
				} else {
					Static102.anIntArray212[local1257] = 2;
				}
				Static94.anIntArray198[local1257] = arg12.anInt2183;
			}
		}
		return;
	}
}
