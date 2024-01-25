import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!uj;")
	public static Class14_Sub19_Sub4 aClass14_Sub19_Sub4_2;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!ah;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "[I")
	public static final int[] anIntArray273 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([[BLclient!lf;[[I[[BII[[B[[BIIZLclient!e;Lclient!lf;)V")
	public static void method2885(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class46 arg10, @OriginalArg(12) Class114 arg11) {
		for (@Pc(8) int local8 = 0; local8 < arg5; local8++) {
			@Pc(25) int local25 = arg5 - 1 <= local8 ? local8 : local8 + 1;
			for (@Pc(27) int local27 = 0; local27 < arg8; local27++) {
				@Pc(44) int local44 = local27 >= arg8 - 1 ? local27 : local27 + 1;
				if (Static96.method2208() || Static112.method2401(local8, Static125.anInt2720, arg4, local27)) {
					@Pc(58) boolean local58 = false;
					@Pc(60) boolean local60 = false;
					@Pc(63) boolean[] local63 = new boolean[4];
					@Pc(69) int local69 = arg7[local8][local27];
					@Pc(75) int local75 = arg0[local8][local27];
					@Pc(83) int local83 = arg6[local8][local27] & 0xFF;
					@Pc(91) int local91 = arg3[local8][local27] & 0xFF;
					@Pc(99) int local99 = arg3[local8][local44] & 0xFF;
					@Pc(107) int local107 = arg3[local25][local44] & 0xFF;
					@Pc(115) int local115 = arg3[local25][local27] & 0xFF;
					if (local83 != 0 || local91 != 0) {
						@Pc(135) Class69 local135 = local83 == 0 ? null : Static327.method5626(local83 - 1);
						@Pc(148) Class48 local148 = local91 == 0 ? null : Static354.method5983(local91 - 1);
						if (local69 == 0 && local135 == null) {
							local69 = 12;
						}
						@Pc(156) Class69 local156 = local135;
						if (local135 != null) {
							if (local135.anInt2182 == -1 && local135.anInt2179 == -1) {
								local156 = local135;
								local135 = null;
							} else if (local148 != null && local69 != 0) {
								local60 = local135.aBoolean150;
							}
						}
						@Pc(255) int local255;
						@Pc(289) int local289;
						@Pc(365) int local365;
						@Pc(378) int local378;
						if ((local69 == 0 || local69 == 12) && local8 > 0 && local27 > 0 && arg5 > local8 && arg8 > local27) {
							@Pc(234) int local234 = arg3[local25][local27 - 1] == local91 ? 1 : -1;
							local255 = local91 == arg3[local8 - 1][local27 - 1] ? 1 : -1;
							@Pc(268) int local268 = arg3[local25][local44] == local91 ? 1 : -1;
							local289 = local91 == arg3[local8 - 1][local44] ? 1 : -1;
							if (arg3[local8][local27 - 1] == local91) {
								local234++;
								local255++;
							} else {
								local234--;
								local255--;
							}
							if (local91 == arg3[local25][local27]) {
								local268++;
								local234++;
							} else {
								local268--;
								local234--;
							}
							if (local91 == arg3[local8][local44]) {
								local268++;
								local289++;
							} else {
								local289--;
								local268--;
							}
							if (arg3[local8 - 1][local27] == local91) {
								local255++;
								local289++;
							} else {
								local289--;
								local255--;
							}
							local365 = local255 - local268;
							if (local365 < 0) {
								local365 = -local365;
							}
							local378 = local234 - local289;
							if (local378 < 0) {
								local378 = -local378;
							}
							if (local365 == local378) {
								local365 = arg1.method3610(local8, local27) - arg1.method3610(local25, local44);
								if (local365 < 0) {
									local365 = -local365;
								}
								local378 = arg1.method3610(local25, local27) - arg1.method3610(local8, local44);
								if (local378 < 0) {
									local378 = -local378;
								}
							}
							local75 = local378 <= local365 ? 0 : 1;
						}
						for (local255 = 0; local255 < 13; local255++) {
							Static94.anIntArray198[local255] = -1;
							Static102.anIntArray212[local255] = 1;
						}
						@Pc(464) boolean[] local464 = local135 != null && local135.aBoolean150 ? Static242.aBooleanArrayArray2[local69] : Static286.aBooleanArrayArray5[local69];
						Static260.method4486(arg6, local27, local75, local63, arg0, local8, arg10, arg7, arg5, arg8, local148, local69, local135);
						@Pc(490) boolean local490 = local135 != null && local135.anInt2179 != local135.anInt2182;
						if (!local490) {
							for (local289 = 0; local289 < 8; local289++) {
								if (Static94.anIntArray198[local289] >= 0 && Static80.anIntArray177[local289] != Static271.anIntArray468[local289]) {
									local490 = true;
									break;
								}
							}
						}
						if (!local464[local75 + 1 & 0x3]) {
							local63[1] = Static107.method2324(local63[1], (Static102.anIntArray212[4] & Static102.anIntArray212[2]) == 0);
						}
						if (!local464[local75 + 3 & 0x3]) {
							local63[3] = Static107.method2324(local63[3], (Static102.anIntArray212[0] & Static102.anIntArray212[6]) == 0);
						}
						if (!local464[local75 & 0x3]) {
							local63[0] = Static107.method2324(local63[0], (Static102.anIntArray212[2] & Static102.anIntArray212[0]) == 0);
						}
						if (!local464[local75 + 2 & 0x3]) {
							local63[2] = Static107.method2324(local63[2], (Static102.anIntArray212[6] & Static102.anIntArray212[4]) == 0);
						}
						if (!local60 && (local69 == 0 || local69 == 12)) {
							if (local63[0] && !local63[1] && !local63[2] && local63[3]) {
								local69 = local69 == 0 ? 13 : 14;
								local75 = 0;
								local63[0] = local63[3] = false;
							} else if (local63[0] && local63[1] && !local63[2] && !local63[3]) {
								local69 = local69 == 0 ? 13 : 14;
								local63[0] = local63[1] = false;
								local75 = 3;
							} else if (!local63[0] && local63[1] && local63[2] && !local63[3]) {
								local69 = local69 == 0 ? 13 : 14;
								local63[1] = local63[2] = false;
								local75 = 2;
							} else if (!local63[0] && !local63[1] && local63[2] && local63[3]) {
								local63[2] = local63[3] = false;
								local75 = 1;
								local69 = local69 == 0 ? 13 : 14;
							}
						}
						@Pc(804) boolean local804 = !local60 && !local63[0] && !local63[2] && !local63[1] && !local63[3];
						@Pc(806) int[] local806 = null;
						@Pc(824) int[] local824;
						@Pc(836) int[] local836;
						@Pc(820) int[] local820;
						if (local804) {
							local365 = local148 == null ? 0 : Static212.anIntArray379[local69];
							local820 = Static284.anIntArrayArray82[local69];
							local824 = Static214.anIntArrayArray71[local69];
							local378 = local135 == null ? 0 : Static181.anIntArray325[local69];
							local836 = Static355.anIntArrayArray99[local69];
						} else if (local60) {
							local378 = local135 == null ? 0 : Static269.anIntArray466[local69];
							local365 = local148 == null ? 0 : Static40.anIntArray62[local69];
							local820 = Static295.anIntArrayArray84[local69];
							local806 = Static70.anIntArrayArray22[local69];
							local836 = Static206.anIntArrayArray98[local69];
							local824 = Static8.anIntArrayArray2[local69];
						} else {
							local820 = Static321.anIntArrayArray88[local69];
							local365 = local148 == null ? 0 : Static8.anIntArray10[local69];
							local836 = Static63.anIntArrayArray19[local69];
							local806 = Static196.anIntArrayArray62[local69];
							local378 = local135 == null ? 0 : Static23.anIntArray38[local69];
							local824 = Static4.anIntArrayArray1[local69];
						}
						@Pc(909) int local909 = local365 + local378;
						if (local909 <= 0) {
							Static243.method4280(arg4, local8, local27);
						} else {
							if (local63[0]) {
								local909++;
							}
							if (local63[2]) {
								local909++;
							}
							if (local63[1]) {
								local909++;
							}
							if (local63[3]) {
								local909++;
							}
							@Pc(942) int local942 = 0;
							@Pc(944) int local944 = 0;
							@Pc(948) int local948 = local909 * 3;
							@Pc(955) int[] local955 = arg9 ? new int[local948] : null;
							@Pc(962) int[] local962 = local490 ? new int[local948] : null;
							@Pc(965) int[] local965 = new int[local948];
							@Pc(968) int[] local968 = new int[local948];
							@Pc(971) int[] local971 = new int[local948];
							@Pc(974) int[] local974 = new int[local948];
							@Pc(977) int[] local977 = new int[local948];
							@Pc(979) int local979 = -1;
							@Pc(981) int local981 = -1;
							@Pc(983) int local983 = 256;
							@Pc(1085) byte local1085;
							@Pc(1033) int local1033;
							@Pc(1035) int local1035;
							@Pc(1267) int local1267;
							@Pc(1273) int local1273;
							@Pc(1282) int local1282;
							@Pc(1286) int local1286;
							@Pc(1290) int local1290;
							@Pc(1369) int local1369;
							@Pc(1378) int local1378;
							if (local135 != null) {
								local979 = local135.anInt2182;
								local981 = arg10.method5160() ? local135.anInt2172 : local135.anInt2178;
								local983 = local135.anInt2186;
								local1033 = Static137.method2755(local135, arg10);
								for (local1035 = 0; local1035 < local378; local1035++) {
									if (local63[-local75 & 0x3] && local942 == local806[0]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 1;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 1;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else if (local63[2 - local75 & 0x3] && local806[2] == local942) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 5;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 5;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else if (local63[1 - local75 & 0x3] && local942 == local806[1]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 3;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 3;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else if (local63[3 - local75 & 0x3] && local942 == local806[3]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 7;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 7;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = local836[local942];
										local1085 = 3;
										Static188.anIntArray332[2] = local820[local942];
									}
									local942++;
									for (local1267 = 0; local1267 < local1085; local1267++) {
										local1273 = Static188.anIntArray332[local1267];
										local1282 = local1273 - local75 * 2 & 0x7;
										local1286 = Static69.anIntArray119[local1273];
										local1290 = Static291.anIntArray508[local1273];
										if (local75 == 1) {
											local965[local944] = local1290;
											local968[local944] = 128 - local1286;
										} else if (local75 == 2) {
											local965[local944] = 128 - local1286;
											local968[local944] = 128 - local1290;
										} else if (local75 == 3) {
											local965[local944] = 128 - local1290;
											local968[local944] = local1286;
										} else {
											local965[local944] = local1286;
											local968[local944] = local1290;
										}
										if (arg9 && Static249.aBooleanArrayArray3[local69][local1273]) {
											local1369 = local965[local944] + (local8 << 7);
											local1378 = (local27 << 7) + local968[local944];
											local955[local944] = arg11.method3607(local1369, local1378) - arg1.method3607(local1369, local1378);
										}
										if (local1273 < 8 && Static94.anIntArray198[local1282] > local135.anInt2183) {
											if (local962 != null) {
												local962[local944] = Static271.anIntArray468[local1282];
											}
											local977[local944] = Static202.anIntArray355[local1282];
											local974[local944] = Static184.anIntArray329[local1282];
											local971[local944] = Static80.anIntArray177[local1282];
										} else {
											if (local962 != null) {
												local962[local944] = local1033;
											}
											local974[local944] = arg10.method5160() ? local135.anInt2172 : local135.anInt2178;
											local977[local944] = local135.anInt2186;
											local971[local944] = local979;
										}
										local944++;
									}
								}
								if (!arg9 && arg4 == 0) {
									Static117.method4691(local8, local27, local135.anInt2175, local135.anInt2177 * 8);
								}
								if (local69 != 12 && local135.anInt2182 != -1 && local135.aBoolean149) {
									local58 = true;
								}
							} else if (local804) {
								local942 = Static181.anIntArray325[local69];
							} else if (local60) {
								local942 = Static269.anIntArray466[local69];
							} else {
								local942 = Static23.anIntArray38[local69];
							}
							if (local148 != null) {
								if (local99 == 0) {
									local99 = local91;
								}
								if (local107 == 0) {
									local107 = local91;
								}
								if (local115 == 0) {
									local115 = local91;
								}
								@Pc(1525) Class48 local1525 = Static354.method5983(local91 - 1);
								@Pc(1531) Class48 local1531 = Static354.method5983(local99 - 1);
								@Pc(1537) Class48 local1537 = Static354.method5983(local107 - 1);
								@Pc(1543) Class48 local1543 = Static354.method5983(local115 - 1);
								for (local1282 = 0; local1282 < local365; local1282++) {
									if (local63[-local75 & 0x3] && local942 == local806[0]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 1;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 1;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else if (local63[2 - local75 & 0x3] && local942 == local806[2]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 5;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 5;
										Static188.anIntArray332[4] = local836[local942];
										local1085 = 6;
										Static188.anIntArray332[5] = local820[local942];
									} else if (local63[1 - local75 & 0x3] && local806[1] == local942) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 3;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 3;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else if (local63[3 - local75 & 0x3] && local942 == local806[3]) {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = 7;
										Static188.anIntArray332[2] = local820[local942];
										Static188.anIntArray332[3] = 7;
										Static188.anIntArray332[4] = local836[local942];
										Static188.anIntArray332[5] = local820[local942];
										local1085 = 6;
									} else {
										Static188.anIntArray332[0] = local824[local942];
										Static188.anIntArray332[1] = local836[local942];
										Static188.anIntArray332[2] = local820[local942];
										local1085 = 3;
									}
									for (local1286 = 0; local1286 < local1085; local1286++) {
										local1290 = Static188.anIntArray332[local1286];
										local1369 = local1290 - local75 * 2 & 0x7;
										local1378 = Static69.anIntArray119[local1290];
										@Pc(1799) int local1799 = Static291.anIntArray508[local1290];
										@Pc(1811) int local1811;
										@Pc(1809) int local1809;
										if (local75 == 1) {
											local1809 = 128 - local1378;
											local1811 = local1799;
										} else if (local75 == 2) {
											local1811 = 128 - local1378;
											local1809 = 128 - local1799;
										} else if (local75 == 3) {
											local1809 = local1378;
											local1811 = 128 - local1799;
										} else {
											local1811 = local1378;
											local1809 = local1799;
										}
										local965[local944] = local1811;
										local968[local944] = local1809;
										@Pc(1870) int local1870;
										@Pc(1876) int local1876;
										if (arg9 && Static249.aBooleanArrayArray3[local69][local1290]) {
											local1870 = local1811 + (local8 << 7);
											local1876 = local1809 + (local27 << 7);
											local955[local944] = arg11.method3607(local1870, local1876) - arg1.method3607(local1870, local1876);
										}
										if (local1290 < 8 && Static94.anIntArray198[local1369] >= 0) {
											if (local962 != null) {
												local962[local944] = Static271.anIntArray468[local1369];
											}
											local977[local944] = Static202.anIntArray355[local1369];
											local974[local944] = Static184.anIntArray329[local1369];
											local971[local944] = Static80.anIntArray177[local1369];
										} else {
											if (local60 && Static249.aBooleanArrayArray3[local69][local1290]) {
												local974[local944] = local981;
												local977[local944] = local983;
												local971[local944] = local979;
											} else if (local1811 == 0 && local1809 == 0) {
												local971[local944] = arg2[local8][local27];
												local974[local944] = local1525.anInt1634;
												local977[local944] = local1525.anInt1630;
											} else if (local1811 == 0 && local1809 == 128) {
												local971[local944] = arg2[local8][local44];
												local974[local944] = local1531.anInt1634;
												local977[local944] = local1531.anInt1630;
											} else if (local1811 == 128 && local1809 == 128) {
												local971[local944] = arg2[local25][local44];
												local974[local944] = local1537.anInt1634;
												local977[local944] = local1537.anInt1630;
											} else if (local1811 == 128 && local1809 == 0) {
												local971[local944] = arg2[local25][local27];
												local974[local944] = local1543.anInt1634;
												local977[local944] = local1543.anInt1630;
											} else {
												if (local1811 >= 64) {
													if (local1809 < 64) {
														local974[local944] = local1543.anInt1634;
														local977[local944] = local1543.anInt1630;
													} else {
														local974[local944] = local1537.anInt1634;
														local977[local944] = local1537.anInt1630;
													}
												} else if (local1809 < 64) {
													local974[local944] = local1525.anInt1634;
													local977[local944] = local1525.anInt1630;
												} else {
													local974[local944] = local1531.anInt1634;
													local977[local944] = local1531.anInt1630;
												}
												local1870 = Static221.method3973(arg2[local25][local27], local1811 << 7 >> 7, arg2[local8][local27]);
												local1876 = Static221.method3973(arg2[local25][local44], local1811 << 7 >> 7, arg2[local8][local44]);
												local971[local944] = Static221.method3973(local1876, local1809 << 7 >> 7, local1870);
											}
											if (local962 != null) {
												local962[local944] = local971[local944];
											}
										}
										local944++;
									}
									local942++;
								}
								if (local69 != 0 && local148.aBoolean105) {
									local58 = true;
								}
							}
							local1033 = arg1.method3610(local8, local27);
							local1035 = arg1.method3610(local25, local27);
							local1267 = arg1.method3610(local25, local44);
							local1273 = arg1.method3610(local8, local44);
							if (arg4 > 0) {
								@Pc(2221) boolean local2221 = true;
								if (local91 == 0 && local69 != 0) {
									local2221 = false;
								}
								if (local83 > 0 && local156 != null && !local156.aBoolean151) {
									local2221 = false;
								}
								if (local2221 && local1033 == local1035 && local1267 == local1033 && local1033 == local1273) {
									Static294.aByteArrayArrayArray12[arg4][local8][local27] = (byte) (Static294.aByteArrayArrayArray12[arg4][local8][local27] | 0x4);
								}
							}
							local1282 = 0;
							local1286 = 0;
							if (arg9) {
								local1282 = Static2.method105(local8, local27);
								local1286 = Static104.method2279(local8, local27);
							}
							arg1.method3603(local8, local27, local965, local955, local968, local971, local962, local974, local977, local1282, local1286, local58);
							Static243.method4280(arg4, local8, local27);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ne;IZ)I")
	public static int method2886(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray69 == null || arg1 >= arg0.anIntArrayArray69.length) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg0.anIntArrayArray69[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local38 = Static201.anIntArray352[local25[local29++]];
				}
				if (local36 == 2) {
					local38 = Static250.anIntArray436[local25[local29++]];
				}
				if (local36 == 3) {
					local38 = Static234.anIntArray413[local25[local29++]];
				}
				@Pc(91) int local91;
				@Pc(102) Class146 local102;
				@Pc(107) int local107;
				@Pc(119) int local119;
				if (local36 == 4) {
					local91 = local25[local29++] << 16;
					@Pc(98) int local98 = local91 + local25[local29++];
					local102 = Static273.method4632(local98);
					local107 = local25[local29++];
					if (local107 != -1 && (!Static296.method5066(local107).aBoolean444 || Static15.aBoolean420)) {
						for (local119 = 0; local119 < local102.anIntArray374.length; local119++) {
							if (local102.anIntArray374[local119] == local107 + 1) {
								local38 += local102.anIntArray361[local119];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static102.anIntArray211[local25[local29++]];
				}
				if (local36 == 6) {
					local38 = Class14_Sub3_Sub10.anIntArray181[Static250.anIntArray436[local25[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static102.anIntArray211[local25[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005;
				}
				if (local36 == 9) {
					for (local91 = 0; local91 < 25; local91++) {
						if (Static327.aBooleanArray28[local91]) {
							local38 += Static250.anIntArray436[local91];
						}
					}
				}
				if (local36 == 10) {
					local91 = local25[local29++] << 16;
					local91 += local25[local29++];
					local102 = Static273.method4632(local91);
					local107 = local25[local29++];
					if (local107 != -1 && (!Static296.method5066(local107).aBoolean444 || Static15.aBoolean420)) {
						for (local119 = 0; local119 < local102.anIntArray374.length; local119++) {
							if (local102.anIntArray374[local119] == local107 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static279.anInt5303;
				}
				if (local36 == 12) {
					local38 = Static265.anInt5046;
				}
				if (local36 == 13) {
					local91 = Static102.anIntArray211[local25[local29++]];
					@Pc(322) int local322 = local25[local29++];
					local38 = (local91 & 0x1 << local322) == 0 ? 0 : 1;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 14) {
					local91 = local25[local29++];
					local38 = Static120.method2561(local91);
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 18) {
					local38 = Static151.anInt3234 + (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7);
				}
				if (local36 == 19) {
					local38 = (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7) + Static251.anInt3170;
				}
				if (local36 == 20) {
					local38 = local25[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local27 += local38;
					}
					if (local31 == 1) {
						local27 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local31 == 3) {
						local27 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(441) Exception local441) {
			return -1;
		}
	}
}
