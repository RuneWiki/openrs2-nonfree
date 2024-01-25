import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_170 = new Class221(51, 12);

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_36 = new Class180();

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static final int anInt5189 = 1338;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
	public static boolean aBoolean453 = true;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!s;ILclient!s;I[[BII[[BLclient!dr;[[I[[BZ[[B)V")
	public static void method4379(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class37 arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(25) int local25 = local12 < arg1 - 1 ? local12 + 1 : local12;
			for (@Pc(27) int local27 = 0; local27 < arg5; local27++) {
				@Pc(44) int local44 = arg5 - 1 <= local27 ? local27 : local27 + 1;
				if (Static230.method4872() || Static32.method438(local12, local27, Static30.anInt483, arg3)) {
					@Pc(58) boolean local58 = false;
					@Pc(60) boolean local60 = false;
					@Pc(63) boolean[] local63 = new boolean[4];
					@Pc(69) int local69 = arg4[local12][local27];
					@Pc(75) int local75 = arg11[local12][local27];
					@Pc(83) int local83 = arg6[local12][local27] & 0xFF;
					@Pc(91) int local91 = arg9[local12][local27] & 0xFF;
					@Pc(99) int local99 = arg9[local12][local44] & 0xFF;
					@Pc(107) int local107 = arg9[local25][local44] & 0xFF;
					@Pc(115) int local115 = arg9[local25][local27] & 0xFF;
					if (local83 != 0 || local91 != 0) {
						@Pc(132) Class63 local132 = local83 == 0 ? null : Static364.method5843(local83 - 1);
						@Pc(145) Class121 local145 = local91 == 0 ? null : Static229.method4237(local91 - 1);
						if (local69 == 0 && local132 == null) {
							local69 = 12;
						}
						@Pc(156) Class63 local156 = local132;
						if (local132 != null) {
							if (local132.anInt1560 == -1 && local132.anInt1569 == -1) {
								local156 = local132;
								local132 = null;
							} else if (local145 != null && local69 != 0) {
								local60 = local132.aBoolean140;
							}
						}
						@Pc(253) int local253;
						@Pc(310) int local310;
						@Pc(363) int local363;
						@Pc(373) int local373;
						if ((local69 == 0 || local69 == 12) && local12 > 0 && local27 > 0 && arg1 > local12 && local27 < arg5) {
							@Pc(236) int local236 = arg9[local25][local27 - 1] == local91 ? 1 : -1;
							local253 = local91 == arg9[local12 - 1][local27 - 1] ? 1 : -1;
							@Pc(272) int local272 = local91 == arg9[local25][local44] ? 1 : -1;
							if (local91 == arg9[local12][local27 - 1]) {
								local236++;
								local253++;
							} else {
								local253--;
								local236--;
							}
							local310 = local91 == arg9[local12 - 1][local44] ? 1 : -1;
							if (local91 == arg9[local25][local27]) {
								local272++;
								local236++;
							} else {
								local236--;
								local272--;
							}
							if (local91 == arg9[local12][local44]) {
								local310++;
								local272++;
							} else {
								local310--;
								local272--;
							}
							if (arg9[local12 - 1][local27] == local91) {
								local310++;
								local253++;
							} else {
								local253--;
								local310--;
							}
							local363 = local253 - local272;
							if (local363 < 0) {
								local363 = -local363;
							}
							local373 = local236 - local310;
							if (local373 < 0) {
								local373 = -local373;
							}
							if (local363 == local373) {
								local363 = arg2.method4453(local12, local27) - arg2.method4453(local25, local44);
								local373 = arg2.method4453(local25, local27) - arg2.method4453(local12, local44);
								if (local363 < 0) {
									local363 = -local363;
								}
								if (local373 < 0) {
									local373 = -local373;
								}
							}
							local75 = local373 > local363 ? 1 : 0;
						}
						for (local253 = 0; local253 < 13; local253++) {
							Static50.anIntArray73[local253] = -1;
							Static335.anIntArray500[local253] = 1;
						}
						@Pc(455) boolean[] local455 = local132 != null && local132.aBoolean140 ? Static267.aBooleanArrayArray5[local69] : Static6.aBooleanArrayArray1[local69];
						Static94.method1858(arg4, local27, local69, arg11, local145, local75, arg5, arg1, arg6, local132, local12, local63, arg7);
						@Pc(485) boolean local485 = local132 != null && local132.anInt1569 != local132.anInt1560;
						if (!local485) {
							for (local310 = 0; local310 < 8; local310++) {
								if (Static50.anIntArray73[local310] >= 0 && Static229.anIntArray391[local310] != Static142.anIntArray248[local310]) {
									local485 = true;
									break;
								}
							}
						}
						if (!local455[local75 + 1 & 0x3]) {
							local63[1] = Static180.method3464(local63[1], (Static335.anIntArray500[2] & Static335.anIntArray500[4]) == 0);
						}
						if (!local455[local75 + 3 & 0x3]) {
							local63[3] = Static180.method3464(local63[3], (Static335.anIntArray500[0] & Static335.anIntArray500[6]) == 0);
						}
						if (!local455[local75 & 0x3]) {
							local63[0] = Static180.method3464(local63[0], (Static335.anIntArray500[0] & Static335.anIntArray500[2]) == 0);
						}
						if (!local455[local75 + 2 & 0x3]) {
							local63[2] = Static180.method3464(local63[2], (Static335.anIntArray500[4] & Static335.anIntArray500[6]) == 0);
						}
						if (!local60 && (local69 == 0 || local69 == 12)) {
							if (local63[0] && !local63[1] && !local63[2] && local63[3]) {
								local75 = 0;
								local69 = local69 == 0 ? 13 : 14;
								local63[0] = local63[3] = false;
							} else if (local63[0] && local63[1] && !local63[2] && !local63[3]) {
								local63[0] = local63[1] = false;
								local69 = local69 == 0 ? 13 : 14;
								local75 = 3;
							} else if (!local63[0] && local63[1] && local63[2] && !local63[3]) {
								local63[1] = local63[2] = false;
								local75 = 2;
								local69 = local69 == 0 ? 13 : 14;
							} else if (!local63[0] && !local63[1] && local63[2] && local63[3]) {
								local75 = 1;
								local63[2] = local63[3] = false;
								local69 = local69 == 0 ? 13 : 14;
							}
						}
						@Pc(802) boolean local802 = !local60 && !local63[0] && !local63[2] && !local63[1] && !local63[3];
						@Pc(804) int[] local804 = null;
						@Pc(814) int[] local814;
						@Pc(810) int[] local810;
						@Pc(826) int[] local826;
						if (local802) {
							local810 = Static85.anIntArrayArray20[local69];
							local814 = Static36.anIntArrayArray12[local69];
							local363 = local145 == null ? 0 : Static345.anIntArray513[local69];
							local826 = Static327.anIntArrayArray54[local69];
							local373 = local132 == null ? 0 : Static223.anIntArray359[local69];
						} else if (local60) {
							local373 = local132 == null ? 0 : Static276.anIntArray439[local69];
							local826 = Static128.anIntArrayArray27[local69];
							local363 = local145 == null ? 0 : Static106.anIntArray174[local69];
							local804 = Static132.anIntArrayArray29[local69];
							local810 = Static11.anIntArrayArray4[local69];
							local814 = Static115.anIntArrayArray23[local69];
						} else {
							local363 = local145 == null ? 0 : Static249.anIntArray405[local69];
							local814 = Static350.anIntArrayArray55[local69];
							local826 = Static155.anIntArrayArray33[local69];
							local373 = local132 == null ? 0 : Static80.anIntArray125[local69];
							local804 = Static67.anIntArrayArray38[local69];
							local810 = Static62.anIntArrayArray18[local69];
						}
						@Pc(908) int local908 = local373 + local363;
						if (local908 <= 0) {
							Static211.method5300(arg3, local12, local27);
						} else {
							if (local63[0]) {
								local908++;
							}
							if (local63[2]) {
								local908++;
							}
							if (local63[1]) {
								local908++;
							}
							if (local63[3]) {
								local908++;
							}
							@Pc(941) int local941 = 0;
							@Pc(943) int local943 = 0;
							@Pc(947) int local947 = local908 * 3;
							@Pc(954) int[] local954 = arg10 ? new int[local947] : null;
							@Pc(961) int[] local961 = local485 ? new int[local947] : null;
							@Pc(964) int[] local964 = new int[local947];
							@Pc(967) int[] local967 = new int[local947];
							@Pc(970) int[] local970 = new int[local947];
							@Pc(973) int[] local973 = new int[local947];
							@Pc(976) int[] local976 = new int[local947];
							@Pc(978) int local978 = -1;
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = 256;
							@Pc(1078) byte local1078;
							@Pc(1032) int local1032;
							@Pc(1034) int local1034;
							@Pc(1266) int local1266;
							@Pc(1272) int local1272;
							@Pc(1281) int local1281;
							@Pc(1285) int local1285;
							@Pc(1289) int local1289;
							@Pc(1366) int local1366;
							@Pc(1374) int local1374;
							if (local132 != null) {
								local978 = local132.anInt1560;
								local980 = arg7.method3738() ? local132.anInt1559 : local132.anInt1570;
								local982 = local132.anInt1558;
								local1032 = Static98.method1972(local132, arg7);
								for (local1034 = 0; local1034 < local373; local1034++) {
									if (local63[-local75 & 0x3] && local941 == local804[0]) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 1;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 1;
										Static301.anIntArray462[4] = local810[local941];
										local1078 = 6;
										Static301.anIntArray462[5] = local826[local941];
									} else if (local63[2 - local75 & 0x3] && local941 == local804[2]) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 5;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 5;
										Static301.anIntArray462[4] = local810[local941];
										local1078 = 6;
										Static301.anIntArray462[5] = local826[local941];
									} else if (local63[1 - local75 & 0x3] && local804[1] == local941) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 3;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 3;
										Static301.anIntArray462[4] = local810[local941];
										local1078 = 6;
										Static301.anIntArray462[5] = local826[local941];
									} else if (local63[3 - local75 & 0x3] && local804[3] == local941) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 7;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 7;
										Static301.anIntArray462[4] = local810[local941];
										Static301.anIntArray462[5] = local826[local941];
										local1078 = 6;
									} else {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = local810[local941];
										local1078 = 3;
										Static301.anIntArray462[2] = local826[local941];
									}
									local941++;
									for (local1266 = 0; local1266 < local1078; local1266++) {
										local1272 = Static301.anIntArray462[local1266];
										local1281 = local1272 - local75 * 2 & 0x7;
										local1285 = Static164.anIntArray289[local1272];
										local1289 = Static171.anIntArray293[local1272];
										if (local75 == 1) {
											local964[local943] = local1289;
											local967[local943] = 128 - local1285;
										} else if (local75 == 2) {
											local964[local943] = 128 - local1285;
											local967[local943] = 128 - local1289;
										} else if (local75 == 3) {
											local964[local943] = 128 - local1289;
											local967[local943] = local1285;
										} else {
											local964[local943] = local1285;
											local967[local943] = local1289;
										}
										if (arg10 && Static70.aBooleanArrayArray2[local69][local1272]) {
											local1366 = (local12 << 7) + local964[local943];
											local1374 = (local27 << 7) + local967[local943];
											local954[local943] = arg0.method4452(local1366, local1374) - arg2.method4452(local1366, local1374);
										}
										if (local1272 < 8 && Static50.anIntArray73[local1281] > local132.anInt1557) {
											if (local961 != null) {
												local961[local943] = Static142.anIntArray248[local1281];
											}
											local976[local943] = Static261.anIntArray412[local1281];
											local973[local943] = Static263.anIntArray430[local1281];
											local970[local943] = Static229.anIntArray391[local1281];
										} else {
											if (local961 != null) {
												local961[local943] = local1032;
											}
											local973[local943] = arg7.method3738() ? local132.anInt1559 : local132.anInt1570;
											local976[local943] = local132.anInt1558;
											local970[local943] = local978;
										}
										local943++;
									}
								}
								if (!arg10 && arg3 == 0) {
									Static295.method4933(local12, local27, local132.anInt1563, local132.anInt1564 * 8);
								}
								if (local69 != 12 && local132.anInt1560 != -1 && local132.aBoolean142) {
									local58 = true;
								}
							} else if (local802) {
								local941 = Static223.anIntArray359[local69];
							} else if (local60) {
								local941 = Static276.anIntArray439[local69];
							} else {
								local941 = Static80.anIntArray125[local69];
							}
							if (local145 != null) {
								if (local115 == 0) {
									local115 = local91;
								}
								if (local107 == 0) {
									local107 = local91;
								}
								if (local99 == 0) {
									local99 = local91;
								}
								@Pc(1521) Class121 local1521 = Static229.method4237(local91 - 1);
								@Pc(1527) Class121 local1527 = Static229.method4237(local99 - 1);
								@Pc(1533) Class121 local1533 = Static229.method4237(local107 - 1);
								@Pc(1539) Class121 local1539 = Static229.method4237(local115 - 1);
								for (local1281 = 0; local1281 < local363; local1281++) {
									if (local63[-local75 & 0x3] && local804[0] == local941) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 1;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 1;
										Static301.anIntArray462[4] = local810[local941];
										Static301.anIntArray462[5] = local826[local941];
										local1078 = 6;
									} else if (local63[2 - local75 & 0x3] && local941 == local804[2]) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 5;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 5;
										Static301.anIntArray462[4] = local810[local941];
										local1078 = 6;
										Static301.anIntArray462[5] = local826[local941];
									} else if (local63[1 - local75 & 0x3] && local941 == local804[1]) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 3;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 3;
										Static301.anIntArray462[4] = local810[local941];
										local1078 = 6;
										Static301.anIntArray462[5] = local826[local941];
									} else if (local63[3 - local75 & 0x3] && local804[3] == local941) {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = 7;
										Static301.anIntArray462[2] = local826[local941];
										Static301.anIntArray462[3] = 7;
										Static301.anIntArray462[4] = local810[local941];
										Static301.anIntArray462[5] = local826[local941];
										local1078 = 6;
									} else {
										Static301.anIntArray462[0] = local814[local941];
										Static301.anIntArray462[1] = local810[local941];
										local1078 = 3;
										Static301.anIntArray462[2] = local826[local941];
									}
									local941++;
									for (local1285 = 0; local1285 < local1078; local1285++) {
										local1289 = Static301.anIntArray462[local1285];
										local1366 = local1289 - local75 * 2 & 0x7;
										local1374 = Static164.anIntArray289[local1289];
										@Pc(1795) int local1795 = Static171.anIntArray293[local1289];
										@Pc(1813) int local1813;
										@Pc(1808) int local1808;
										if (local75 == 1) {
											local1808 = 128 - local1374;
											local1813 = local1795;
										} else if (local75 == 2) {
											local1808 = 128 - local1795;
											local1813 = 128 - local1374;
										} else if (local75 == 3) {
											local1813 = 128 - local1795;
											local1808 = local1374;
										} else {
											local1813 = local1374;
											local1808 = local1795;
										}
										local964[local943] = local1813;
										local967[local943] = local1808;
										@Pc(1862) int local1862;
										@Pc(1868) int local1868;
										if (arg10 && Static70.aBooleanArrayArray2[local69][local1289]) {
											local1862 = local1813 + (local12 << 7);
											local1868 = local1808 + (local27 << 7);
											local954[local943] = arg0.method4452(local1862, local1868) - arg2.method4452(local1862, local1868);
										}
										if (local1289 < 8 && Static50.anIntArray73[local1366] >= 0) {
											if (local961 != null) {
												local961[local943] = Static142.anIntArray248[local1366];
											}
											local976[local943] = Static261.anIntArray412[local1366];
											local973[local943] = Static263.anIntArray430[local1366];
											local970[local943] = Static229.anIntArray391[local1366];
										} else {
											if (local60 && Static70.aBooleanArrayArray2[local69][local1289]) {
												local973[local943] = local980;
												local976[local943] = local982;
												local970[local943] = local978;
											} else if (local1813 == 0 && local1808 == 0) {
												local970[local943] = arg8[local12][local27];
												local973[local943] = local1521.anInt3852;
												local976[local943] = local1521.anInt3862;
											} else if (local1813 == 0 && local1808 == 128) {
												local970[local943] = arg8[local12][local44];
												local973[local943] = local1527.anInt3852;
												local976[local943] = local1527.anInt3862;
											} else if (local1813 == 128 && local1808 == 128) {
												local970[local943] = arg8[local25][local44];
												local973[local943] = local1533.anInt3852;
												local976[local943] = local1533.anInt3862;
											} else if (local1813 == 128 && local1808 == 0) {
												local970[local943] = arg8[local25][local27];
												local973[local943] = local1539.anInt3852;
												local976[local943] = local1539.anInt3862;
											} else {
												if (local1813 < 64) {
													if (local1808 < 64) {
														local973[local943] = local1521.anInt3852;
														local976[local943] = local1521.anInt3862;
													} else {
														local973[local943] = local1527.anInt3852;
														local976[local943] = local1527.anInt3862;
													}
												} else if (local1808 < 64) {
													local973[local943] = local1539.anInt3852;
													local976[local943] = local1539.anInt3862;
												} else {
													local973[local943] = local1533.anInt3852;
													local976[local943] = local1533.anInt3862;
												}
												local1862 = Static114.method2245(local1813 << 7 >> 7, arg8[local12][local27], arg8[local25][local27]);
												local1868 = Static114.method2245(local1813 << 7 >> 7, arg8[local12][local44], arg8[local25][local44]);
												local970[local943] = Static114.method2245(local1808 << 7 >> 7, local1862, local1868);
											}
											if (local961 != null) {
												local961[local943] = local970[local943];
											}
										}
										local943++;
									}
								}
								if (local69 != 0 && local145.aBoolean332) {
									local58 = true;
								}
							}
							local1032 = arg2.method4453(local12, local27);
							local1034 = arg2.method4453(local25, local27);
							local1266 = arg2.method4453(local25, local44);
							local1272 = arg2.method4453(local12, local44);
							if (arg3 > 0) {
								@Pc(2211) boolean local2211 = true;
								if (local91 == 0 && local69 != 0) {
									local2211 = false;
								}
								if (local83 > 0 && local156 != null && !local156.aBoolean141) {
									local2211 = false;
								}
								if (local2211 && local1034 == local1032 && local1266 == local1032 && local1272 == local1032) {
									Static314.aByteArrayArrayArray11[arg3][local12][local27] = (byte) (Static314.aByteArrayArrayArray11[arg3][local12][local27] | 0x4);
								}
							}
							local1281 = 0;
							local1285 = 0;
							if (arg10) {
								local1281 = Static366.method3921(local12, local27);
								local1285 = Static273.method4728(local12, local27);
							}
							arg2.method4449(local12, local27, local964, local954, local967, local970, local961, local973, local976, local1281, local1285, local58);
							Static211.method5300(arg3, local12, local27);
						}
					}
				}
			}
		}
	}
}
