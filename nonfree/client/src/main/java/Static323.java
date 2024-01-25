import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5319(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg2.indexOf(arg0); local17 != -1; local17 = arg2.indexOf(arg0, local17 + arg1.length())) {
			arg2 = arg2.substring(0, local17) + arg1 + arg2.substring(arg0.length() + local17);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lclient!lg;B)V")
	public static void method5320(@OriginalArg(0) Class60[] arg0) {
		Static118.anInt2542 = arg0.length;
		Static229.aClass60Array12 = new Class60[Static118.anInt2542 + 10];
		Static319.anIntArray507 = new int[Static118.anInt2542 + 10];
		Static363.method4759(arg0, 0, Static229.aClass60Array12, 0, Static118.anInt2542);
		for (@Pc(32) int local32 = 0; local32 < Static118.anInt2542; local32++) {
			Static319.anIntArray507[local32] = Static229.aClass60Array12[local32].method5691();
		}
		for (@Pc(47) int local47 = Static118.anInt2542; local47 < Static229.aClass60Array12.length; local47++) {
			Static319.anIntArray507[local47] = 12;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([[B[[B[ZLclient!vm;IIB[[BLclient!fc;Lclient!qq;IIII)V")
	public static void method5321(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) Class92 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class71 arg7, @OriginalArg(9) Class172 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(49) int local49;
		if (arg7 != null && arg8 != null || arg8 != null && arg5 == 12 || arg7 != null && arg5 == 0) {
			@Pc(33) boolean[] local33 = arg7 != null && arg7.aBoolean142 ? Static110.aBooleanArrayArray3[arg5] : Static37.aBooleanArrayArray1[arg5];
			@Pc(60) Class71 local60;
			@Pc(77) byte local77;
			@Pc(93) int local93;
			@Pc(98) int local98;
			if (arg10 > 0) {
				if (arg9 > 0) {
					local49 = arg0[arg9 - 1][arg10 - 1] & 0xFF;
					if (local49 > 0) {
						local60 = Static125.method5092(local49 - 1);
						if (local60.anInt1792 != -1 && local60.aBoolean142) {
							local77 = arg1[arg9 - 1][arg10 - 1];
							local93 = arg6[arg9 - 1][arg10 - 1] * 2 + 4 & 0x7;
							local98 = Static145.method2845(local60, arg3);
							if (Static281.aBooleanArrayArray5[local77][local93]) {
								Static151.anIntArray299[0] = local60.anInt1792;
								Static222.anIntArray380[0] = local98;
								Static84.anIntArray177[0] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
								Static159.anIntArray312[0] = local60.anInt1793;
								Static60.anIntArray143[0] = local60.anInt1787;
								Static87.anIntArray197[0] = 256;
							}
						}
					}
				}
				if (arg9 < arg11 - 1) {
					local49 = arg0[arg9 + 1][arg10 - 1] & 0xFF;
					if (local49 > 0) {
						local60 = Static125.method5092(local49 - 1);
						if (local60.anInt1792 != -1 && local60.aBoolean142) {
							local77 = arg1[arg9 + 1][arg10 - 1];
							local93 = arg6[arg9 + 1][arg10 - 1] * 2 + 6 & 0x7;
							local98 = Static145.method2845(local60, arg3);
							if (Static281.aBooleanArrayArray5[local77][local93]) {
								Static151.anIntArray299[2] = local60.anInt1792;
								Static222.anIntArray380[2] = local98;
								Static84.anIntArray177[2] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
								Static159.anIntArray312[2] = local60.anInt1793;
								Static60.anIntArray143[2] = local60.anInt1787;
								Static87.anIntArray197[2] = 512;
							}
						}
					}
				}
			}
			if (arg10 < arg4 - 1) {
				if (arg9 > 0) {
					local49 = arg0[arg9 - 1][arg10 + 1] & 0xFF;
					if (local49 > 0) {
						local60 = Static125.method5092(local49 - 1);
						if (local60.anInt1792 != -1 && local60.aBoolean142) {
							local77 = arg1[arg9 - 1][arg10 + 1];
							local93 = arg6[arg9 - 1][arg10 + 1] * 2 + 2 & 0x7;
							local98 = Static145.method2845(local60, arg3);
							if (Static281.aBooleanArrayArray5[local77][local93]) {
								Static151.anIntArray299[6] = local60.anInt1792;
								Static222.anIntArray380[6] = local98;
								Static84.anIntArray177[6] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
								Static159.anIntArray312[6] = local60.anInt1793;
								Static60.anIntArray143[6] = local60.anInt1787;
								Static87.anIntArray197[6] = 64;
							}
						}
					}
				}
				if (arg9 < arg11 - 1) {
					local49 = arg0[arg9 + 1][arg10 + 1] & 0xFF;
					if (local49 > 0) {
						local60 = Static125.method5092(local49 - 1);
						if (local60.anInt1792 != -1 && local60.aBoolean142) {
							local77 = arg1[arg9 + 1][arg10 + 1];
							local93 = --(arg6[arg9 + 1][arg10 + 1] * 2) & 0x7;
							local98 = Static145.method2845(local60, arg3);
							if (Static281.aBooleanArrayArray5[local77][local93]) {
								Static151.anIntArray299[4] = local60.anInt1792;
								Static222.anIntArray380[4] = local98;
								Static84.anIntArray177[4] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
								Static159.anIntArray312[4] = local60.anInt1793;
								Static60.anIntArray143[4] = local60.anInt1787;
								Static87.anIntArray197[4] = 128;
							}
						}
					}
				}
			}
			@Pc(539) int local539;
			@Pc(544) int local544;
			@Pc(546) int local546;
			@Pc(508) byte local508;
			if (arg10 > 0) {
				local49 = arg0[arg9][arg10 - 1] & 0xFF;
				if (local49 > 0) {
					local60 = Static125.method5092(local49 - 1);
					if (local60.anInt1792 != -1) {
						local77 = arg1[arg9][arg10 - 1];
						local508 = arg6[arg9][arg10 - 1];
						if (local60.aBoolean142) {
							local98 = 2;
							local539 = local508 * 2 + 4;
							local544 = Static145.method2845(local60, arg3);
							for (local546 = 0; local546 < 3; local546++) {
								local98 &= 0x7;
								local539 &= 0x7;
								if (Static281.aBooleanArrayArray5[local77][local539] && Static60.anIntArray143[local98] <= local60.anInt1787) {
									Static151.anIntArray299[local98] = local60.anInt1792;
									Static222.anIntArray380[local98] = local544;
									Static84.anIntArray177[local98] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
									Static159.anIntArray312[local98] = local60.anInt1793;
									if (Static60.anIntArray143[local98] == local60.anInt1787) {
										Static87.anIntArray197[local98] |= 0x20;
									} else {
										Static87.anIntArray197[local98] = 32;
									}
									Static60.anIntArray143[local98] = local60.anInt1787;
								}
								local98--;
								local539++;
							}
							if (!local33[arg12 & 0x3]) {
								arg2[0] = Static110.aBooleanArrayArray3[local77][local508 + 2 & 0x3];
							}
						} else if (!local33[arg12 & 0x3]) {
							arg2[0] = Static37.aBooleanArrayArray1[local77][local508 + 2 & 0x3];
						}
					}
				}
			}
			if (arg4 - 1 > arg10) {
				local49 = arg0[arg9][arg10 + 1] & 0xFF;
				if (local49 > 0) {
					local60 = Static125.method5092(local49 - 1);
					if (local60.anInt1792 != -1) {
						local77 = arg1[arg9][arg10 + 1];
						local508 = arg6[arg9][arg10 + 1];
						if (local60.aBoolean142) {
							local98 = 4;
							local539 = local508 * 2 + 2;
							local544 = Static145.method2845(local60, arg3);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local98 &= 0x7;
								if (Static281.aBooleanArrayArray5[local77][local539] && local60.anInt1787 >= Static60.anIntArray143[local98]) {
									Static151.anIntArray299[local98] = local60.anInt1792;
									Static222.anIntArray380[local98] = local544;
									Static84.anIntArray177[local98] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
									Static159.anIntArray312[local98] = local60.anInt1793;
									if (Static60.anIntArray143[local98] == local60.anInt1787) {
										Static87.anIntArray197[local98] |= 0x10;
									} else {
										Static87.anIntArray197[local98] = 16;
									}
									Static60.anIntArray143[local98] = local60.anInt1787;
								}
								local98++;
								local539--;
							}
							if (!local33[arg12 + 2 & 0x3]) {
								arg2[2] = Static110.aBooleanArrayArray3[local77][local508 & 0x3];
							}
						} else if (!local33[arg12 + 2 & 0x3]) {
							arg2[2] = Static37.aBooleanArrayArray1[local77][local508 & 0x3];
						}
					}
				}
			}
			if (arg9 > 0) {
				local49 = arg0[arg9 - 1][arg10] & 0xFF;
				if (local49 > 0) {
					local60 = Static125.method5092(local49 - 1);
					if (local60.anInt1792 != -1) {
						local77 = arg1[arg9 - 1][arg10];
						local508 = arg6[arg9 - 1][arg10];
						if (local60.aBoolean142) {
							local98 = 6;
							local539 = local508 * 2 + 4;
							local544 = Static145.method2845(local60, arg3);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local98 &= 0x7;
								if (Static281.aBooleanArrayArray5[local77][local539] && local60.anInt1787 >= Static60.anIntArray143[local98]) {
									Static151.anIntArray299[local98] = local60.anInt1792;
									Static222.anIntArray380[local98] = local544;
									Static84.anIntArray177[local98] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
									Static159.anIntArray312[local98] = local60.anInt1793;
									if (Static60.anIntArray143[local98] == local60.anInt1787) {
										Static87.anIntArray197[local98] |= 0x8;
									} else {
										Static87.anIntArray197[local98] = 8;
									}
									Static60.anIntArray143[local98] = local60.anInt1787;
								}
								local98++;
								local539--;
							}
							if (!local33[arg12 + 3 & 0x3]) {
								arg2[3] = Static110.aBooleanArrayArray3[local77][local508 + 1 & 0x3];
							}
						} else if (!local33[arg12 + 3 & 0x3]) {
							arg2[3] = Static37.aBooleanArrayArray1[local77][local508 + 1 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg9) {
				local49 = arg0[arg9 + 1][arg10] & 0xFF;
				if (local49 > 0) {
					local60 = Static125.method5092(local49 - 1);
					if (local60.anInt1792 != -1) {
						local77 = arg1[arg9 + 1][arg10];
						local508 = arg6[arg9 + 1][arg10];
						if (local60.aBoolean142) {
							local98 = 4;
							local539 = local508 * 2 + 6;
							local544 = Static145.method2845(local60, arg3);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local98 &= 0x7;
								if (Static281.aBooleanArrayArray5[local77][local539] && Static60.anIntArray143[local98] <= local60.anInt1787) {
									Static151.anIntArray299[local98] = local60.anInt1792;
									Static222.anIntArray380[local98] = local544;
									Static84.anIntArray177[local98] = arg3.method4463() ? local60.anInt1788 : local60.anInt1784;
									Static159.anIntArray312[local98] = local60.anInt1793;
									if (Static60.anIntArray143[local98] == local60.anInt1787) {
										Static87.anIntArray197[local98] |= 0x4;
									} else {
										Static87.anIntArray197[local98] = 4;
									}
									Static60.anIntArray143[local98] = local60.anInt1787;
								}
								local98--;
								local539++;
							}
							if (!local33[arg12 + 1 & 0x3]) {
								arg2[1] = Static110.aBooleanArrayArray3[local77][local508 + 3 & 0x3];
							}
						} else if (!local33[arg12 + 1 & 0x3]) {
							arg2[1] = Static37.aBooleanArrayArray1[local77][local508 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		@Pc(1207) int local1207 = Static145.method2845(arg7, arg3);
		if (!arg7.aBoolean142) {
			return;
		}
		for (local49 = 0; local49 < 8; local49++) {
			@Pc(1223) int local1223 = local49 - arg12 * 2 & 0x7;
			if (Static281.aBooleanArrayArray5[arg5][local49] && Static60.anIntArray143[local1223] <= arg7.anInt1787) {
				Static151.anIntArray299[local1223] = arg7.anInt1792;
				Static222.anIntArray380[local1223] = local1207;
				Static84.anIntArray177[local1223] = arg3.method4463() ? arg7.anInt1788 : arg7.anInt1784;
				Static159.anIntArray312[local1223] = arg7.anInt1793;
				if (arg7.anInt1787 == Static60.anIntArray143[local1223]) {
					Static87.anIntArray197[local1223] |= 0x2;
				} else {
					Static87.anIntArray197[local1223] = 2;
				}
				Static60.anIntArray143[local1223] = arg7.anInt1787;
			}
		}
	}
}
