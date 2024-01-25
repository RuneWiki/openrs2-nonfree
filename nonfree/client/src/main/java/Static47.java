import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!co", name = "T", descriptor = "[S")
	public static short[] aShortArray8;

	@OriginalMember(owner = "client!co", name = "W", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11 = null;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
	public static void method793() {
		@Pc(5) Class109 local5 = Static39.aClass109_12;
		synchronized (Static39.aClass109_12) {
			Static39.aClass109_12.method2850();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII[[B[[B[ZLclient!ap;[[BIIIILclient!aj;Lclient!ea;)V")
	public static void method794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) Class11 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class9 arg11, @OriginalArg(13) Class55 arg12) {
		@Pc(46) int local46;
		if (arg11 != null && arg5 != null || arg5 != null && arg10 == 12 || arg11 != null && arg10 == 0) {
			@Pc(27) boolean[] local27 = arg11 != null && arg11.aBoolean17 ? Static121.aBooleanArrayArray3[arg10] : Static120.aBooleanArrayArray2[arg10];
			@Pc(57) Class9 local57;
			@Pc(75) byte local75;
			@Pc(92) int local92;
			@Pc(97) int local97;
			if (arg7 > 0) {
				if (arg1 > 0) {
					local46 = arg2[arg1 - 1][arg7 - 1] & 0xFF;
					if (local46 > 0) {
						local57 = Static355.method6032(local46 - 1);
						if (local57.anInt200 != -1 && local57.aBoolean17) {
							local75 = arg3[arg1 - 1][arg7 - 1];
							local92 = arg6[arg1 - 1][arg7 - 1] * 2 + 4 & 0x7;
							local97 = Static107.method4269(local57, arg12);
							if (Static101.aBooleanArrayArray1[local75][local92]) {
								Static357.anIntArray646[0] = local57.anInt200;
								Static254.anIntArray489[0] = local97;
								Static181.anIntArray361[0] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
								Static102.anIntArray181[0] = local57.anInt198;
								Static318.anIntArray594[0] = local57.anInt199;
								Static87.anIntArray136[0] = 256;
							}
						}
					}
				}
				if (arg8 - 1 > arg1) {
					local46 = arg2[arg1 + 1][arg7 - 1] & 0xFF;
					if (local46 > 0) {
						local57 = Static355.method6032(local46 - 1);
						if (local57.anInt200 != -1 && local57.aBoolean17) {
							local75 = arg3[arg1 + 1][arg7 - 1];
							local92 = arg6[arg1 + 1][arg7 - 1] * 2 + 6 & 0x7;
							local97 = Static107.method4269(local57, arg12);
							if (Static101.aBooleanArrayArray1[local75][local92]) {
								Static357.anIntArray646[2] = local57.anInt200;
								Static254.anIntArray489[2] = local97;
								Static181.anIntArray361[2] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
								Static102.anIntArray181[2] = local57.anInt198;
								Static318.anIntArray594[2] = local57.anInt199;
								Static87.anIntArray136[2] = 512;
							}
						}
					}
				}
			}
			if (arg7 < arg9 - 1) {
				if (arg1 > 0) {
					local46 = arg2[arg1 - 1][arg7 + 1] & 0xFF;
					if (local46 > 0) {
						local57 = Static355.method6032(local46 - 1);
						if (local57.anInt200 != -1 && local57.aBoolean17) {
							local75 = arg3[arg1 - 1][arg7 + 1];
							local92 = arg6[arg1 - 1][arg7 + 1] * 2 + 2 & 0x7;
							local97 = Static107.method4269(local57, arg12);
							if (Static101.aBooleanArrayArray1[local75][local92]) {
								Static357.anIntArray646[6] = local57.anInt200;
								Static254.anIntArray489[6] = local97;
								Static181.anIntArray361[6] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
								Static102.anIntArray181[6] = local57.anInt198;
								Static318.anIntArray594[6] = local57.anInt199;
								Static87.anIntArray136[6] = 64;
							}
						}
					}
				}
				if (arg8 - 1 > arg1) {
					local46 = arg2[arg1 + 1][arg7 + 1] & 0xFF;
					if (local46 > 0) {
						local57 = Static355.method6032(local46 - 1);
						if (local57.anInt200 != -1 && local57.aBoolean17) {
							local75 = arg3[arg1 + 1][arg7 + 1];
							local92 = arg6[arg1 + 1][arg7 + 1] * 2 & 0x7;
							local97 = Static107.method4269(local57, arg12);
							if (Static101.aBooleanArrayArray1[local75][local92]) {
								Static357.anIntArray646[4] = local57.anInt200;
								Static254.anIntArray489[4] = local97;
								Static181.anIntArray361[4] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
								Static102.anIntArray181[4] = local57.anInt198;
								Static318.anIntArray594[4] = local57.anInt199;
								Static87.anIntArray136[4] = 128;
							}
						}
					}
				}
			}
			@Pc(520) int local520;
			@Pc(525) int local525;
			@Pc(527) int local527;
			@Pc(509) byte local509;
			if (arg7 > 0) {
				local46 = arg2[arg1][arg7 - 1] & 0xFF;
				if (local46 > 0) {
					local57 = Static355.method6032(local46 - 1);
					if (local57.anInt200 != -1) {
						local75 = arg3[arg1][arg7 - 1];
						local509 = arg6[arg1][arg7 - 1];
						if (local57.aBoolean17) {
							local97 = 2;
							local520 = local509 * 2 + 4;
							local525 = Static107.method4269(local57, arg12);
							for (local527 = 0; local527 < 3; local527++) {
								local520 &= 0x7;
								local97 &= 0x7;
								if (Static101.aBooleanArrayArray1[local75][local520] && local57.anInt199 >= Static318.anIntArray594[local97]) {
									Static357.anIntArray646[local97] = local57.anInt200;
									Static254.anIntArray489[local97] = local525;
									Static181.anIntArray361[local97] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
									Static102.anIntArray181[local97] = local57.anInt198;
									if (Static318.anIntArray594[local97] == local57.anInt199) {
										Static87.anIntArray136[local97] |= 0x20;
									} else {
										Static87.anIntArray136[local97] = 32;
									}
									Static318.anIntArray594[local97] = local57.anInt199;
								}
								local97--;
								local520++;
							}
							if (!local27[arg0 & 0x3]) {
								arg4[0] = Static121.aBooleanArrayArray3[local75][local509 + 2 & 0x3];
							}
						} else if (!local27[arg0 & 0x3]) {
							arg4[0] = Static120.aBooleanArrayArray2[local75][local509 + 2 & 0x3];
						}
					}
				}
			}
			if (arg9 - 1 > arg7) {
				local46 = arg2[arg1][arg7 + 1] & 0xFF;
				if (local46 > 0) {
					local57 = Static355.method6032(local46 - 1);
					if (local57.anInt200 != -1) {
						local75 = arg3[arg1][arg7 + 1];
						local509 = arg6[arg1][arg7 + 1];
						if (local57.aBoolean17) {
							local97 = 4;
							local520 = local509 * 2 + 2;
							local525 = Static107.method4269(local57, arg12);
							for (local527 = 0; local527 < 3; local527++) {
								local97 &= 0x7;
								local520 &= 0x7;
								if (Static101.aBooleanArrayArray1[local75][local520] && Static318.anIntArray594[local97] <= local57.anInt199) {
									Static357.anIntArray646[local97] = local57.anInt200;
									Static254.anIntArray489[local97] = local525;
									Static181.anIntArray361[local97] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
									Static102.anIntArray181[local97] = local57.anInt198;
									if (local57.anInt199 == Static318.anIntArray594[local97]) {
										Static87.anIntArray136[local97] |= 0x10;
									} else {
										Static87.anIntArray136[local97] = 16;
									}
									Static318.anIntArray594[local97] = local57.anInt199;
								}
								local97++;
								local520--;
							}
							if (!local27[arg0 + 2 & 0x3]) {
								arg4[2] = Static121.aBooleanArrayArray3[local75][--local509 & 0x3];
							}
						} else if (!local27[arg0 + 2 & 0x3]) {
							arg4[2] = Static120.aBooleanArrayArray2[local75][local509 & 0x3];
						}
					}
				}
			}
			if (arg1 > 0) {
				local46 = arg2[arg1 - 1][arg7] & 0xFF;
				if (local46 > 0) {
					local57 = Static355.method6032(local46 - 1);
					if (local57.anInt200 != -1) {
						local75 = arg3[arg1 - 1][arg7];
						local509 = arg6[arg1 - 1][arg7];
						if (local57.aBoolean17) {
							local97 = 6;
							local520 = local509 * 2 + 4;
							local525 = Static107.method4269(local57, arg12);
							for (local527 = 0; local527 < 3; local527++) {
								local520 &= 0x7;
								local97 &= 0x7;
								if (Static101.aBooleanArrayArray1[local75][local520] && Static318.anIntArray594[local97] <= local57.anInt199) {
									Static357.anIntArray646[local97] = local57.anInt200;
									Static254.anIntArray489[local97] = local525;
									Static181.anIntArray361[local97] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
									Static102.anIntArray181[local97] = local57.anInt198;
									if (local57.anInt199 == Static318.anIntArray594[local97]) {
										Static87.anIntArray136[local97] |= 0x8;
									} else {
										Static87.anIntArray136[local97] = 8;
									}
									Static318.anIntArray594[local97] = local57.anInt199;
								}
								local97++;
								local520--;
							}
							if (!local27[arg0 + 3 & 0x3]) {
								arg4[3] = Static121.aBooleanArrayArray3[local75][local509 + 1 & 0x3];
							}
						} else if (!local27[arg0 + 3 & 0x3]) {
							arg4[3] = Static120.aBooleanArrayArray2[local75][local509 + 1 & 0x3];
						}
					}
				}
			}
			if (arg1 < arg8 - 1) {
				local46 = arg2[arg1 + 1][arg7] & 0xFF;
				if (local46 > 0) {
					local57 = Static355.method6032(local46 - 1);
					if (local57.anInt200 != -1) {
						local75 = arg3[arg1 + 1][arg7];
						local509 = arg6[arg1 + 1][arg7];
						if (local57.aBoolean17) {
							local97 = 4;
							local520 = local509 * 2 + 6;
							local525 = Static107.method4269(local57, arg12);
							for (local527 = 0; local527 < 3; local527++) {
								local520 &= 0x7;
								local97 &= 0x7;
								if (Static101.aBooleanArrayArray1[local75][local520] && Static318.anIntArray594[local97] <= local57.anInt199) {
									Static357.anIntArray646[local97] = local57.anInt200;
									Static254.anIntArray489[local97] = local525;
									Static181.anIntArray361[local97] = arg12.method5177() ? local57.anInt202 : local57.anInt192;
									Static102.anIntArray181[local97] = local57.anInt198;
									if (Static318.anIntArray594[local97] == local57.anInt199) {
										Static87.anIntArray136[local97] |= 0x4;
									} else {
										Static87.anIntArray136[local97] = 4;
									}
									Static318.anIntArray594[local97] = local57.anInt199;
								}
								local520++;
								local97--;
							}
							if (!local27[arg0 + 1 & 0x3]) {
								arg4[1] = Static121.aBooleanArrayArray3[local75][local509 + 3 & 0x3];
							}
						} else if (!local27[arg0 + 1 & 0x3]) {
							arg4[1] = Static120.aBooleanArrayArray2[local75][local509 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		@Pc(1228) int local1228 = Static107.method4269(arg11, arg12);
		if (!arg11.aBoolean17) {
			return;
		}
		for (local46 = 0; local46 < 8; local46++) {
			@Pc(1244) int local1244 = local46 - arg0 * 2 & 0x7;
			if (Static101.aBooleanArrayArray1[arg10][local46] && arg11.anInt199 >= Static318.anIntArray594[local1244]) {
				Static357.anIntArray646[local1244] = arg11.anInt200;
				Static254.anIntArray489[local1244] = local1228;
				Static181.anIntArray361[local1244] = arg12.method5177() ? arg11.anInt202 : arg11.anInt192;
				Static102.anIntArray181[local1244] = arg11.anInt198;
				if (arg11.anInt199 == Static318.anIntArray594[local1244]) {
					Static87.anIntArray136[local1244] |= 0x2;
				} else {
					Static87.anIntArray136[local1244] = 2;
				}
				Static318.anIntArray594[local1244] = arg11.anInt199;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
	public static int method795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg1 & arg2 - 1;
		@Pc(28) int local28 = Static143.method2566(local7, local17);
		@Pc(35) int local35 = Static143.method2566(local7 + 1, local17);
		@Pc(42) int local42 = Static143.method2566(local7, local17 + 1);
		@Pc(56) int local56 = Static143.method2566(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static183.method3324(local28, local13, local35, arg2);
		@Pc(70) int local70 = Static183.method3324(local42, local13, local56, arg2);
		return Static183.method3324(local63, local23, local70, arg2);
	}
}
