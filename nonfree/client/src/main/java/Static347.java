import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public static int anInt6759 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([[BLclient!da;ZIILclient!tj;IB[[B[[I[[B[[BLclient!da;)V")
	public static void method5651(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class122 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class22 arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg3; local3++) {
			@Pc(20) int local20 = local3 < arg3 - 1 ? local3 + 1 : local3;
			for (@Pc(22) int local22 = 0; local22 < arg6; local22++) {
				@Pc(35) int local35 = arg6 - 1 <= local22 ? local22 : local22 + 1;
				if (Static75.method1142() || Static109.method1871(local22, arg4, local3, Static353.anInt6829)) {
					@Pc(51) boolean local51 = false;
					@Pc(53) boolean local53 = false;
					@Pc(56) boolean[] local56 = new boolean[4];
					@Pc(62) int local62 = arg0[local3][local22];
					@Pc(68) int local68 = arg7[local3][local22];
					@Pc(76) int local76 = arg10[local3][local22] & 0xFF;
					@Pc(84) int local84 = arg9[local3][local22] & 0xFF;
					@Pc(92) int local92 = arg9[local3][local35] & 0xFF;
					@Pc(100) int local100 = arg9[local20][local35] & 0xFF;
					@Pc(108) int local108 = arg9[local20][local22] & 0xFF;
					if (local76 != 0 || local84 != 0) {
						@Pc(131) Class1 local131 = local76 == 0 ? null : Static216.method3748(local76 - 1);
						@Pc(144) Class155 local144 = local84 == 0 ? null : Static106.method1817(local84 - 1);
						if (local62 == 0 && local131 == null) {
							local62 = 12;
						}
						@Pc(155) Class1 local155 = local131;
						if (local131 != null) {
							if (local131.anInt11 == -1 && local131.anInt14 == -1) {
								local155 = local131;
								local131 = null;
							} else if (local144 != null && local62 != 0) {
								local53 = local131.aBoolean3;
							}
						}
						@Pc(258) int local258;
						@Pc(277) int local277;
						@Pc(346) int local346;
						@Pc(356) int local356;
						if ((local62 == 0 || local62 == 12) && local3 > 0 && local22 > 0 && local3 < arg3 && local22 < arg6) {
							@Pc(226) int local226 = local84 == arg9[local20][local35] ? 1 : -1;
							@Pc(241) int local241 = local84 == arg9[local20][local22 - 1] ? 1 : -1;
							local258 = arg9[local3 - 1][local22 - 1] == local84 ? 1 : -1;
							local277 = arg9[local3 - 1][local35] == local84 ? 1 : -1;
							if (local84 == arg9[local3][local22 - 1]) {
								local241++;
								local258++;
							} else {
								local241--;
								local258--;
							}
							if (arg9[local20][local22] == local84) {
								local241++;
								local226++;
							} else {
								local241--;
								local226--;
							}
							if (local84 == arg9[local3][local35]) {
								local226++;
								local277++;
							} else {
								local277--;
								local226--;
							}
							if (local84 == arg9[local3 - 1][local22]) {
								local258++;
								local277++;
							} else {
								local277--;
								local258--;
							}
							local346 = local258 - local226;
							if (local346 < 0) {
								local346 = -local346;
							}
							local356 = local241 - local277;
							if (local356 < 0) {
								local356 = -local356;
							}
							if (local356 == local346) {
								local346 = arg1.method4672(local3, local22) - arg1.method4672(local20, local35);
								local356 = arg1.method4672(local20, local22) - arg1.method4672(local3, local35);
								if (local346 < 0) {
									local346 = -local346;
								}
								if (local356 < 0) {
									local356 = -local356;
								}
							}
							local68 = local346 >= local356 ? 0 : 1;
						}
						for (local258 = 0; local258 < 13; local258++) {
							Static118.anIntArray149[local258] = -1;
							Static69.anIntArray86[local258] = 1;
						}
						@Pc(439) boolean[] local439 = local131 != null && local131.aBoolean3 ? Static241.aBooleanArrayArray12[local62] : Static189.aBooleanArrayArray8[local62];
						Static168.method2721(arg6, local56, local22, local62, arg5, arg0, arg7, local144, local3, local68, local131, arg3, arg10);
						@Pc(471) boolean local471 = local131 != null && local131.anInt14 != local131.anInt11;
						if (!local471) {
							for (local277 = 0; local277 < 8; local277++) {
								if (Static118.anIntArray149[local277] >= 0 && Static188.anIntArray304[local277] != Static169.anIntArray240[local277]) {
									local471 = true;
									break;
								}
							}
						}
						if (!local439[local68 + 1 & 0x3]) {
							local56[1] = Static87.method1389(local56[1], (Static69.anIntArray86[4] & Static69.anIntArray86[2]) == 0);
						}
						if (!local439[local68 + 3 & 0x3]) {
							local56[3] = Static87.method1389(local56[3], (Static69.anIntArray86[6] & Static69.anIntArray86[0]) == 0);
						}
						if (!local439[local68 & 0x3]) {
							local56[0] = Static87.method1389(local56[0], (Static69.anIntArray86[0] & Static69.anIntArray86[2]) == 0);
						}
						if (!local439[local68 + 2 & 0x3]) {
							local56[2] = Static87.method1389(local56[2], (Static69.anIntArray86[4] & Static69.anIntArray86[6]) == 0);
						}
						if (!local53 && (local62 == 0 || local62 == 12)) {
							if (local56[0] && !local56[1] && !local56[2] && local56[3]) {
								local62 = local62 == 0 ? 13 : 14;
								local56[0] = local56[3] = false;
								local68 = 0;
							} else if (local56[0] && local56[1] && !local56[2] && !local56[3]) {
								local68 = 3;
								local56[0] = local56[1] = false;
								local62 = local62 == 0 ? 13 : 14;
							} else if (!local56[0] && local56[1] && local56[2] && !local56[3]) {
								local68 = 2;
								local62 = local62 == 0 ? 13 : 14;
								local56[1] = local56[2] = false;
							} else if (!local56[0] && !local56[1] && local56[2] && local56[3]) {
								local68 = 1;
								local62 = local62 == 0 ? 13 : 14;
								local56[2] = local56[3] = false;
							}
						}
						@Pc(782) boolean local782 = !local53 && !local56[0] && !local56[2] && !local56[1] && !local56[3];
						@Pc(784) int[] local784 = null;
						@Pc(806) int[] local806;
						@Pc(790) int[] local790;
						@Pc(794) int[] local794;
						if (local782) {
							local790 = Static125.anIntArrayArray16[local62];
							local794 = Static26.anIntArrayArray4[local62];
							local356 = local131 == null ? 0 : Static257.anIntArray415[local62];
							local806 = Static245.anIntArrayArray45[local62];
							local346 = local144 == null ? 0 : Static245.anIntArray398[local62];
						} else if (local53) {
							local806 = Static190.anIntArrayArray33[local62];
							local784 = Static194.anIntArrayArray36[local62];
							local794 = Static313.anIntArrayArray56[local62];
							local790 = Static256.anIntArrayArray48[local62];
							local356 = local131 == null ? 0 : Static342.anIntArray558[local62];
							local346 = local144 == null ? 0 : Static155.anIntArray113[local62];
						} else {
							local806 = Static252.anIntArrayArray47[local62];
							local784 = Static285.anIntArrayArray53[local62];
							local356 = local131 == null ? 0 : Static18.anIntArray19[local62];
							local346 = local144 == null ? 0 : Static351.anIntArray569[local62];
							local794 = Static164.anIntArrayArray58[local62];
							local790 = Static224.anIntArrayArray41[local62];
						}
						@Pc(887) int local887 = local346 + local356;
						if (local887 <= 0) {
							Static128.method2212(arg4, local3, local22);
						} else {
							if (local56[0]) {
								local887++;
							}
							if (local56[2]) {
								local887++;
							}
							if (local56[1]) {
								local887++;
							}
							if (local56[3]) {
								local887++;
							}
							@Pc(917) int local917 = 0;
							@Pc(919) int local919 = 0;
							@Pc(923) int local923 = local887 * 3;
							@Pc(930) int[] local930 = arg2 ? new int[local923] : null;
							@Pc(937) int[] local937 = local471 ? new int[local923] : null;
							@Pc(940) int[] local940 = new int[local923];
							@Pc(943) int[] local943 = new int[local923];
							@Pc(946) int[] local946 = new int[local923];
							@Pc(949) int[] local949 = new int[local923];
							@Pc(952) int[] local952 = new int[local923];
							@Pc(954) int local954 = -1;
							@Pc(956) int local956 = -1;
							@Pc(958) int local958 = 256;
							@Pc(1074) byte local1074;
							@Pc(1010) int local1010;
							@Pc(1012) int local1012;
							@Pc(1248) int local1248;
							@Pc(1254) int local1254;
							@Pc(1263) int local1263;
							@Pc(1267) int local1267;
							@Pc(1271) int local1271;
							@Pc(1350) int local1350;
							@Pc(1358) int local1358;
							if (local131 != null) {
								local954 = local131.anInt11;
								local956 = arg5.method4747() ? local131.anInt15 : local131.anInt13;
								local958 = local131.anInt3;
								local1010 = Static267.method4546(local131, arg5);
								for (local1012 = 0; local1012 < local356; local1012++) {
									if (local56[-local68 & 0x3] && local784[0] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 1;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 1;
										Static333.anIntArray540[4] = local790[local917];
										local1074 = 6;
										Static333.anIntArray540[5] = local794[local917];
									} else if (local56[2 - local68 & 0x3] && local784[2] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 5;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 5;
										Static333.anIntArray540[4] = local790[local917];
										local1074 = 6;
										Static333.anIntArray540[5] = local794[local917];
									} else if (local56[1 - local68 & 0x3] && local784[1] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 3;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 3;
										Static333.anIntArray540[4] = local790[local917];
										Static333.anIntArray540[5] = local794[local917];
										local1074 = 6;
									} else if (local56[3 - local68 & 0x3] && local784[3] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 7;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 7;
										Static333.anIntArray540[4] = local790[local917];
										local1074 = 6;
										Static333.anIntArray540[5] = local794[local917];
									} else {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = local790[local917];
										Static333.anIntArray540[2] = local794[local917];
										local1074 = 3;
									}
									local917++;
									for (local1248 = 0; local1248 < local1074; local1248++) {
										local1254 = Static333.anIntArray540[local1248];
										local1263 = local1254 - local68 * 2 & 0x7;
										local1267 = Static137.anIntArray153[local1254];
										local1271 = Static273.anIntArray436[local1254];
										if (local68 == 1) {
											local940[local919] = local1271;
											local943[local919] = 128 - local1267;
										} else if (local68 == 2) {
											local940[local919] = 128 - local1267;
											local943[local919] = 128 - local1271;
										} else if (local68 == 3) {
											local940[local919] = 128 - local1271;
											local943[local919] = local1267;
										} else {
											local940[local919] = local1267;
											local943[local919] = local1271;
										}
										if (arg2 && Static260.aBooleanArrayArray13[local62][local1254]) {
											local1350 = local940[local919] + (local3 << 7);
											local1358 = (local22 << 7) + local943[local919];
											local930[local919] = arg11.method4678(local1350, local1358) - arg1.method4678(local1350, local1358);
										}
										if (local1254 < 8 && Static118.anIntArray149[local1263] > local131.anInt5) {
											if (local937 != null) {
												local937[local919] = Static188.anIntArray304[local1263];
											}
											local952[local919] = Static331.anIntArray539[local1263];
											local949[local919] = Static114.anIntArray144[local1263];
											local946[local919] = Static169.anIntArray240[local1263];
										} else {
											if (local937 != null) {
												local937[local919] = local1010;
											}
											local949[local919] = arg5.method4747() ? local131.anInt15 : local131.anInt13;
											local952[local919] = local131.anInt3;
											local946[local919] = local954;
										}
										local919++;
									}
								}
								if (!arg2 && arg4 == 0) {
									Static166.method2681(local3, local22, local131.anInt1, local131.anInt4 * 8);
								}
								if (local62 != 12 && local131.anInt11 != -1 && local131.aBoolean2) {
									local51 = true;
								}
							} else if (local782) {
								local917 = Static257.anIntArray415[local62];
							} else if (local53) {
								local917 = Static342.anIntArray558[local62];
							} else {
								local917 = Static18.anIntArray19[local62];
							}
							if (local144 != null) {
								if (local100 == 0) {
									local100 = local84;
								}
								if (local92 == 0) {
									local92 = local84;
								}
								if (local108 == 0) {
									local108 = local84;
								}
								@Pc(1503) Class155 local1503 = Static106.method1817(local84 - 1);
								@Pc(1509) Class155 local1509 = Static106.method1817(local92 - 1);
								@Pc(1515) Class155 local1515 = Static106.method1817(local100 - 1);
								@Pc(1521) Class155 local1521 = Static106.method1817(local108 - 1);
								for (local1263 = 0; local1263 < local346; local1263++) {
									if (local56[-local68 & 0x3] && local784[0] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 1;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 1;
										Static333.anIntArray540[4] = local790[local917];
										local1074 = 6;
										Static333.anIntArray540[5] = local794[local917];
									} else if (local56[2 - local68 & 0x3] && local917 == local784[2]) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 5;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 5;
										Static333.anIntArray540[4] = local790[local917];
										Static333.anIntArray540[5] = local794[local917];
										local1074 = 6;
									} else if (local56[1 - local68 & 0x3] && local784[1] == local917) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 3;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 3;
										Static333.anIntArray540[4] = local790[local917];
										Static333.anIntArray540[5] = local794[local917];
										local1074 = 6;
									} else if (local56[3 - local68 & 0x3] && local917 == local784[3]) {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = 7;
										Static333.anIntArray540[2] = local794[local917];
										Static333.anIntArray540[3] = 7;
										Static333.anIntArray540[4] = local790[local917];
										Static333.anIntArray540[5] = local794[local917];
										local1074 = 6;
									} else {
										Static333.anIntArray540[0] = local806[local917];
										Static333.anIntArray540[1] = local790[local917];
										local1074 = 3;
										Static333.anIntArray540[2] = local794[local917];
									}
									local917++;
									for (local1267 = 0; local1267 < local1074; local1267++) {
										local1271 = Static333.anIntArray540[local1267];
										local1350 = local1271 - local68 * 2 & 0x7;
										local1358 = Static137.anIntArray153[local1271];
										@Pc(1778) int local1778 = Static273.anIntArray436[local1271];
										@Pc(1789) int local1789;
										@Pc(1791) int local1791;
										if (local68 == 1) {
											local1789 = local1778;
											local1791 = 128 - local1358;
										} else if (local68 == 2) {
											local1791 = 128 - local1778;
											local1789 = 128 - local1358;
										} else if (local68 == 3) {
											local1791 = local1358;
											local1789 = 128 - local1778;
										} else {
											local1789 = local1358;
											local1791 = local1778;
										}
										local940[local919] = local1789;
										local943[local919] = local1791;
										@Pc(1841) int local1841;
										@Pc(1847) int local1847;
										if (arg2 && Static260.aBooleanArrayArray13[local62][local1271]) {
											local1841 = (local3 << 7) + local1789;
											local1847 = (local22 << 7) + local1791;
											local930[local919] = arg11.method4678(local1841, local1847) - arg1.method4678(local1841, local1847);
										}
										if (local1271 < 8 && Static118.anIntArray149[local1350] >= 0) {
											if (local937 != null) {
												local937[local919] = Static188.anIntArray304[local1350];
											}
											local952[local919] = Static331.anIntArray539[local1350];
											local949[local919] = Static114.anIntArray144[local1350];
											local946[local919] = Static169.anIntArray240[local1350];
										} else {
											if (local53 && Static260.aBooleanArrayArray13[local62][local1271]) {
												local949[local919] = local956;
												local952[local919] = local958;
												local946[local919] = local954;
											} else if (local1789 == 0 && local1791 == 0) {
												local946[local919] = arg8[local3][local22];
												local949[local919] = local1503.anInt4702;
												local952[local919] = local1503.anInt4709;
											} else if (local1789 == 0 && local1791 == 128) {
												local946[local919] = arg8[local3][local35];
												local949[local919] = local1509.anInt4702;
												local952[local919] = local1509.anInt4709;
											} else if (local1789 == 128 && local1791 == 128) {
												local946[local919] = arg8[local20][local35];
												local949[local919] = local1515.anInt4702;
												local952[local919] = local1515.anInt4709;
											} else if (local1789 == 128 && local1791 == 0) {
												local946[local919] = arg8[local20][local22];
												local949[local919] = local1521.anInt4702;
												local952[local919] = local1521.anInt4709;
											} else {
												if (local1789 >= 64) {
													if (local1791 >= 64) {
														local949[local919] = local1515.anInt4702;
														local952[local919] = local1515.anInt4709;
													} else {
														local949[local919] = local1521.anInt4702;
														local952[local919] = local1521.anInt4709;
													}
												} else if (local1791 >= 64) {
													local949[local919] = local1509.anInt4702;
													local952[local919] = local1509.anInt4709;
												} else {
													local949[local919] = local1503.anInt4702;
													local952[local919] = local1503.anInt4709;
												}
												local1841 = Static12.method219(local1789 << 7 >> 7, arg8[local20][local22], arg8[local3][local22]);
												local1847 = Static12.method219(local1789 << 7 >> 7, arg8[local20][local35], arg8[local3][local35]);
												local946[local919] = Static12.method219(local1791 << 7 >> 7, local1847, local1841);
											}
											if (local937 != null) {
												local937[local919] = local946[local919];
											}
										}
										local919++;
									}
								}
								if (local62 != 0 && local144.aBoolean269) {
									local51 = true;
								}
							}
							local1010 = arg1.method4672(local3, local22);
							local1012 = arg1.method4672(local20, local22);
							local1248 = arg1.method4672(local20, local35);
							local1254 = arg1.method4672(local3, local35);
							if (arg4 > 0) {
								@Pc(2187) boolean local2187 = true;
								if (local84 == 0 && local62 != 0) {
									local2187 = false;
								}
								if (local76 > 0 && local155 != null && !local155.aBoolean1) {
									local2187 = false;
								}
								if (local2187 && local1012 == local1010 && local1010 == local1248 && local1010 == local1254) {
									Static310.aByteArrayArrayArray14[arg4][local3][local22] = (byte) (Static310.aByteArrayArrayArray14[arg4][local3][local22] | 0x4);
								}
							}
							local1263 = 0;
							local1267 = 0;
							if (arg2) {
								local1263 = Static3.method28(local3, local22);
								local1267 = Static120.method2119(local3, local22);
							}
							arg1.method4674(local3, local22, local940, local930, local943, local946, local937, local949, local952, local1263, local1267, local51);
							Static128.method2212(arg4, local3, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method5657() {
		Static151.method2441(Static226.anInt4626);
		@Pc(20) int local20 = (Static110.anInt2324 >> 10) + (Static186.anInt3094 >> 3);
		@Pc(28) int local28 = (Static210.anInt4317 >> 10) + (Static296.anInt5889 >> 3);
		Static149.anIntArrayArray20 = new int[18][4];
		Static269.anIntArray432 = new int[18];
		Static73.aByteArrayArray7 = new byte[18][];
		Static81.aByteArrayArray9 = new byte[18][];
		Static76.aByteArrayArray8 = new byte[18][];
		Static290.aByteArrayArray19 = new byte[18][];
		Static169.anIntArray239 = new int[18];
		Static314.anIntArray512 = new int[18];
		Static112.aByteArrayArray12 = new byte[18][];
		Static314.anIntArray511 = new int[18];
		Static54.anIntArray76 = new int[18];
		Static277.anIntArray439 = new int[18];
		@Pc(75) int local75 = 0;
		@Pc(94) int local94;
		for (@Pc(83) int local83 = (local20 - (Static162.anInt2152 >> 4)) / 8; local83 <= ((Static162.anInt2152 >> 4) + local20) / 8; local83++) {
			for (local94 = (local28 - (Static122.anInt2632 >> 4)) / 8; local94 <= ((Static122.anInt2632 >> 4) + local28) / 8; local94++) {
				@Pc(102) int local102 = local94 + (local83 << 8);
				Static169.anIntArray239[local75] = local102;
				Static314.anIntArray511[local75] = Static50.aClass100_20.method2304("m" + local83 + "_" + local94);
				Static314.anIntArray512[local75] = Static50.aClass100_20.method2304("l" + local83 + "_" + local94);
				Static54.anIntArray76[local75] = Static50.aClass100_20.method2304("n" + local83 + "_" + local94);
				Static277.anIntArray439[local75] = Static50.aClass100_20.method2304("um" + local83 + "_" + local94);
				Static269.anIntArray432[local75] = Static50.aClass100_20.method2304("ul" + local83 + "_" + local94);
				if (Static54.anIntArray76[local75] == -1) {
					Static314.anIntArray511[local75] = -1;
					Static314.anIntArray512[local75] = -1;
					Static277.anIntArray439[local75] = -1;
					Static269.anIntArray432[local75] = -1;
				}
				local75++;
			}
		}
		for (local94 = local75; local94 < Static54.anIntArray76.length; local94++) {
			Static54.anIntArray76[local94] = -1;
			Static314.anIntArray511[local94] = -1;
			Static314.anIntArray512[local94] = -1;
			Static277.anIntArray439[local94] = -1;
			Static269.anIntArray432[local94] = -1;
		}
		Static243.method4157(true, 8, false, 0, local28, local20, 8);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5659(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static287.anInt5782++;
		Static227.anInt4637 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static262.anInt6843; local7 < Static131.anInt2754; local7++) {
			@Pc(12) Class45[][] local12 = Static256.aClass45ArrayArrayArray2[local7];
			for (local14 = Static309.anInt6136; local14 < Static127.anInt2725; local14++) {
				for (@Pc(17) int local17 = Static88.anInt1752; local17 < Static36.anInt806; local17++) {
					@Pc(24) Class45 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static192.aBooleanArrayArray9[local14 + Static14.anInt494 - Static74.anInt1441][local17 + Static14.anInt494 - Static89.anInt6705] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean63 = true;
							local24.aBoolean64 = true;
							if (local24.aClass160_1 == null) {
								local24.aBoolean65 = false;
							} else {
								local24.aBoolean65 = true;
							}
							Static227.anInt4637++;
						} else {
							local24.aBoolean63 = false;
							local24.aBoolean64 = false;
							local24.aByte9 = 0;
							if (local14 >= Static74.anInt1441 - 16 && local14 <= Static74.anInt1441 + 16 && local17 >= Static89.anInt6705 - 16 && local17 <= Static89.anInt6705 + 16 && (local24.aClass5_Sub5_1 != null || local24.aClass5_Sub5_2 != null || local24.aClass5_Sub1_1 != null || local24.aClass5_Sub1_2 != null || local24.aClass5_Sub3_1 != null || local24.aClass160_1 != null)) {
								Static71.aClass103_3.method5630(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static182.aClass22Array2 == Static69.aClass22Array1;
		for (local14 = Static262.anInt6843; local14 < Static131.anInt2754; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static140.aClass122_3.method4747() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static192.aBooleanArrayArray9.length;
				if (Static309.anInt6136 + Static192.aBooleanArrayArray9.length > Static103.anInt2156) {
					local172 -= Static309.anInt6136 + Static192.aBooleanArrayArray9.length - Static103.anInt2156;
				}
				@Pc(192) int local192 = Static192.aBooleanArrayArray9[0].length;
				if (Static88.anInt1752 + Static192.aBooleanArrayArray9[0].length > Static116.anInt2499) {
					local192 -= Static88.anInt1752 + Static192.aBooleanArrayArray9[0].length - Static116.anInt2499;
				}
				@Pc(213) int local213 = Static113.anInt6413;
				while (true) {
					if (local213 >= local172) {
						Static71.aClass103_3.method5627(true, local161, local14, Static69.aClass22Array1[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static309.anInt6136 - Static113.anInt6413;
					for (@Pc(222) int local222 = Static63.anInt1294; local222 < local192; local222++) {
						Static108.aBooleanArrayArray15[local213][local222] = false;
						if (Static192.aBooleanArrayArray9[local213][local222]) {
							@Pc(241) int local241 = local222 + Static88.anInt1752 - Static63.anInt1294;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static256.aClass45ArrayArrayArray2[local243][local220][local241] != null && Static256.aClass45ArrayArrayArray2[local243][local220][local241].aByte7 == local14) {
									Static108.aBooleanArrayArray15[local213][local222] = Static256.aClass45ArrayArrayArray2[local243][local220][local241].aBoolean63;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static71.aClass103_3.method5627(false, local161, local14, Static69.aClass22Array1[local14]);
			}
			Static71.aClass103_3.method5634();
		}
		if (!Static257.method4351(true)) {
			Static257.method4351(false);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
	public static void method5662() {
		@Pc(5) Class198 local5 = Static270.aClass198_50;
		synchronized (Static270.aClass198_50) {
			Static270.aClass198_50.method5243(5);
		}
	}
}
