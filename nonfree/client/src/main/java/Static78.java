import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1470() {
		@Pc(1) int local1 = Static209.anInt3954;
		@Pc(3) int[] local3 = Static457.anIntArray607;
		@Pc(8) int local8 = Static56.aClass14_Sub22_5.aClass21_Sub4_1.method1258();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class12_Sub2_Sub2_Sub1_Sub2 local32 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local3[local25]];
			if (!local32.method2438()) {
				local32.anInt2924 = -1;
			} else if (local32.aBoolean230) {
				local32.anInt2924 = -1;
			} else {
				local32.method8969();
				if (local32.aShort111 >= 0 && local32.aShort110 >= 0 && local32.aShort112 < Static26.anInt462 && local32.aShort109 < Static445.anInt6140) {
					local32.aBoolean226 = local32.aBoolean222 ? local23 : false;
					if (local32 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2) {
						local32.anInt2924 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean221) {
							local85++;
						}
						if (local32.anInt2953 > Static87.anInt1951) {
							local85 += 2;
						}
						local85 += 5 - local32.method2422() << 2;
						if (local32.aBoolean229 || local32.aBoolean231) {
							local85 += 512;
						} else {
							if (Static291.anInt5168 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt2924 = local85 + 1;
					}
				} else {
					local32.anInt2924 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static471.anInt8216; local129++) {
			@Pc(140) Class12_Sub2_Sub2_Sub1_Sub1 local140 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local129])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			if (local140.method615() && local140.aClass283_1.method7133(Static595.aClass241_1)) {
				local140.method8969();
				if (local140.aShort111 >= 0 && local140.aShort110 >= 0 && local140.aShort112 < Static26.anInt462 && local140.aShort109 < Static445.anInt6140) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean221) {
						local177++;
					}
					if (local140.anInt2953 > Static87.anInt1951) {
						local177 += 2;
					}
					local177 += 5 - local140.method2422() << 2;
					if (Static291.anInt5168 == 0) {
						if (local140.aClass283_1.aBoolean621) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static291.anInt5168 == 1) {
						if (local140.aClass283_1.aBoolean621) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass283_1.aBoolean615) {
						local177 += 1024;
					} else if (!local140.aClass283_1.aBoolean613) {
						local177 += 256;
					}
					local140.anInt2924 = local177 + 1;
				} else {
					local140.anInt2924 = -1;
				}
			} else {
				local140.anInt2924 = -1;
			}
		}
		for (local85 = 0; local85 < Static590.aClass390Array1.length; local85++) {
			@Pc(243) Class390 local243 = Static590.aClass390Array1[local85];
			if (local243 != null) {
				if (local243.anInt11100 == 1) {
					@Pc(257) Class14_Sub44 local257 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local243.anInt11103);
					if (local257 != null) {
						@Pc(262) Class12_Sub2_Sub2_Sub1_Sub1 local262 = local257.aClass12_Sub2_Sub2_Sub1_Sub1_2;
						if (local262.anInt2924 >= 0) {
							local262.anInt2924 += 2048;
						}
					}
				} else if (local243.anInt11100 == 10) {
					@Pc(281) Class12_Sub2_Sub2_Sub1_Sub2 local281 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local243.anInt11103];
					if (local281 != null && local281 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 && local281.anInt2924 >= 0) {
						local281.anInt2924 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1471() {
		for (@Pc(1) int local1 = 0; local1 < Static26.anInt462; local1++) {
			@Pc(6) int[] local6 = Static566.anIntArrayArray53[local1];
			for (@Pc(8) int local8 = 0; local8 < Static445.anInt6140; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rr;[[BB)V")
	public static void method1472(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt9077; local14++) {
			Static299.method4404();
			for (local20 = 0; local20 < Static26.anInt462 >> 3; local20++) {
				for (local24 = 0; local24 < Static445.anInt6140 >> 3; local24++) {
					local34 = Static333.anIntArrayArrayArray4[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean636 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static332.anIntArray455.length; local78++) {
								if (local76 == Static332.anIntArray455[local78] && arg1[local78] != null) {
									@Pc(100) Class14_Sub29 local100 = new Class14_Sub29(arg1[local78]);
									arg0.method7511(local66, local54, local60, local14, local43, local20 * 8, local100, local24 * 8, Static226.aClass226Array3);
									arg0.method7526(local100, local20 * 8, local66, local24 * 8, local54, local12[0] == -1 ? local12 : null, local14, Static677.aClass137_47, local60, local43);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt9077; local20++) {
			Static299.method4404();
			for (local24 = 0; local24 < Static26.anInt462 >> 3; local24++) {
				for (local34 = 0; local34 < Static445.anInt6140 >> 3; local34++) {
					local43 = Static333.anIntArrayArrayArray4[local20][local24][local34];
					if (local43 == -1) {
						arg0.method7514(local24 * 8, 8, 8, local34 * 8, local20);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static378.aClass153_1 = Static20.aClass385_31.method9142(local12[2], local12[1], local12[3], local12[0], Static379.aClass250_13);
			Static419.anInt7564 = local12[4];
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mea;)Z")
	public static boolean method1473(@OriginalArg(0) Class230 arg0) {
		if (Static28.aBoolean59) {
			if (method1481(arg0).anInt6586 != 0) {
				return false;
			}
			if (arg0.anInt6660 == 0) {
				return false;
			}
		}
		return arg0.aBoolean475;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1474() {
		Static534.anInt9227 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static471.anInt8216; local3++) {
			@Pc(14) Class12_Sub2_Sub2_Sub1_Sub1 local14 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local3])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			if (local14.aBoolean221 && local14.method2421() != -1) {
				@Pc(32) int local32 = (local14.method2422() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10998 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt11002 - local32 >> 9;
				@Pc(53) Class12_Sub2_Sub2_Sub1 local53 = Static492.method7262(local46, local14.aByte146, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt2945;
					if (local53 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt2906 == 0 && local53.method2421() != -1) {
						Static203.anIntArray311[Static534.anInt9227] = local58;
						Static364.anIntArray487[Static534.anInt9227] = local58;
						Static534.anInt9227++;
						local53.anInt2906++;
					}
					Static203.anIntArray311[Static534.anInt9227] = local58;
					Static364.anIntArray487[Static534.anInt9227] = local14.anInt2945 + 2048;
					Static534.anInt9227++;
					local53.anInt2906++;
				}
			}
		}
		Static24.method458(0, Static364.anIntArray487, Static534.anInt9227 - 1, Static203.anIntArray311);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mea;IIIIIIIIIII)V")
	public static void method1475(@OriginalArg(0) Class230[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class230 local6 = arg0[local1];
			if (local6 != null && local6.anInt6668 == arg1) {
				@Pc(17) int local17 = local6.anInt6725 + arg6;
				@Pc(22) int local22 = local6.anInt6676 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt6660 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt6703;
					local45 = local22 + local6.anInt6701;
					if (local6.anInt6660 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6660 == 0 || local6.aBoolean479 || method1481(local6).anInt6586 != 0 || local6 == Static176.aClass230_2 || local6.anInt6693 == Static240.anInt4349 || local6.anInt6693 == Static490.anInt8759) {
					if (!method1473(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static128.aBoolean202) {
							local40 = Static619.method8679();
							local45 = Static571.method8194();
						}
						if (local6 == Static299.aClass230_4 && Static93.method6852(Static299.aClass230_4) != null) {
							Static454.aBoolean547 = true;
							Static647.anInt10816 = local17;
							Static36.anInt977 = local22;
						}
						if (local6.aBoolean476 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean473 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class14_Sub55 local168 = (Class14_Sub55) Static576.aClass262_67.method6318(); local168 != null; local168 = (Class14_Sub55) Static576.aClass262_67.method6311()) {
									if (local168.aBoolean747) {
										local168.method9315();
										local168.aClass230_14.aBoolean477 = false;
									}
								}
								if (Static147.anInt2822 == 0) {
									Static299.aClass230_4 = null;
									Static176.aClass230_2 = null;
								}
								Static119.anInt2451 = 0;
								Static349.aBoolean457 = false;
								Static672.aBoolean763 = false;
								if (!Static505.aBoolean629) {
									Static229.method3485();
								}
							}
							@Pc(232) boolean local232;
							if (Static666.aClass79_1.method3361() + local40 >= local28 && Static666.aClass79_1.method3358() + local45 >= local30 && Static666.aClass79_1.method3361() + local40 < local32 && Static666.aClass79_1.method3358() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static238.aBoolean302 && local232) {
								if (local6.anInt6649 >= 0) {
									Static416.anInt7542 = local6.anInt6649;
								} else if (local6.aBoolean473) {
									Static416.anInt7542 = -1;
								}
							}
							if (!Static505.aBoolean629 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static390.method5824(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static666.aClass79_1.method3351() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class14_Sub30 local291 = (Class14_Sub30) Static425.aClass262_44.method6318();
							if (local291 != null && local291.method8572() == 0 && local291.method8578() + local40 >= local28 && local291.method8571() + local45 >= local30 && local291.method8578() + local40 < local32 && local291.method8571() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray78 != null && !Static597.method8445()) {
								for (local335 = 0; local335 < local6.aByteArray78.length; local335++) {
									if (Static68.aClass65_1.method1565(local6.aByteArray78[local335])) {
										if (local6.anIntArray476 == null || Static87.anInt1951 >= local6.anIntArray476[local335]) {
											@Pc(367) byte local367 = local6.aByteArray77[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static68.aClass65_1.method1565(86) && !Static68.aClass65_1.method1565(82) && !Static68.aClass65_1.method1565(81)) && ((local367 & 0x2) == 0 || Static68.aClass65_1.method1565(86)) && ((local367 & 0x1) == 0 || Static68.aClass65_1.method1565(82)) && ((local367 & 0x4) == 0 || Static68.aClass65_1.method1565(81))) {
												if (local335 < 10) {
													Static69.method1357(-1, local6.anInt6663, local335 + 1, "");
												} else if (local335 == 10) {
													Static141.method1563();
													@Pc(438) Class14_Sub33 local438 = method1481(local6);
													Static178.method2842(local438.method5402(), local438.anInt6587, local6);
													Static139.aString30 = Static59.method1225(local6);
													if (Static139.aString30 == null) {
														Static139.aString30 = "Null";
													}
													Static639.aString114 = local6.aString71 + "<col=ffffff>";
												}
												local469 = local6.anIntArray477[local335];
												if (local6.anIntArray476 == null) {
													local6.anIntArray476 = new int[local6.aByteArray78.length];
												}
												if (local469 == 0) {
													local6.anIntArray476[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray476[local335] = Static87.anInt1951 + local469;
												}
											}
										}
									} else if (local6.anIntArray476 != null) {
										local6.anIntArray476[local335] = 0;
									}
								}
							}
							if (local286) {
								Static496.method7328(local45 + local291.method8571() - local22, local6, local40 + local291.method8578() - local17);
							}
							if (Static299.aClass230_4 != null && Static299.aClass230_4 != local6 && local232 && method1481(local6).method5412()) {
								Static361.aClass230_7 = local6;
							}
							if (local6 == Static176.aClass230_2) {
								Static380.aBoolean497 = true;
								Static174.anInt10838 = local17;
								Static660.anInt10983 = local22;
							}
							if (local6.aBoolean479 || local6.anInt6693 != 0) {
								@Pc(558) Class14_Sub55 local558;
								if (local232 && Static23.anInt426 != 0 && local6.anObjectArray9 != null) {
									local558 = new Class14_Sub55();
									local558.aBoolean747 = true;
									local558.aClass230_14 = local6;
									local558.anInt10933 = Static23.anInt426;
									local558.anObjectArray33 = local6.anObjectArray9;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static299.aClass230_4 != null || Static505.aBoolean629 || local6.anInt6693 != Static87.anInt1953 && Static119.anInt2451 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt6693 != 0) {
									if (local6.anInt6693 == Static243.anInt4385 || local6.anInt6693 == Static553.anInt9422) {
										Static459.aClass230_8 = local6;
										if (Static378.aClass153_1 != null) {
											Static378.aClass153_1.method3547(local6.anInt6701, Static677.aClass137_47);
										}
										if (local6.anInt6693 == Static243.anInt4385) {
											if (Static505.aBoolean629 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static122.method2082(Static677.aClass137_47, arg9, arg8);
											@Pc(641) Class12_Sub9 local641 = (Class12_Sub9) Static532.aClass376_8.method9008();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt7200 && arg10 < local641.anInt7202 && arg11 >= local641.anInt7201 && arg11 < local641.anInt7203) {
													Static229.method3485();
													Static475.method6876(local641.aClass12_Sub2_Sub2_Sub1_1);
												}
												local641 = (Class12_Sub9) Static532.aClass376_8.method9014();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt6693 == Static240.anInt4349) {
										if (local6.method5457(Static677.aClass137_47) == null || Static51.anInt1226 != 0 && Static51.anInt1226 != 3 || Static505.aBoolean629 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray481[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray483[local708]) {
											continue;
										}
										local335 -= local6.anInt6703 / 2;
										local708 -= local6.anInt6701 / 2;
										if (Static378.anInt6935 == 4) {
											local747 = (int) Static543.aFloat228 & 0x3FFF;
										} else {
											local747 = (int) Static543.aFloat228 + Static470.anInt10171 & 0x3FFF;
										}
										@Pc(759) int local759 = Class32.anIntArray76[local747];
										@Pc(763) int local763 = Class32.anIntArray77[local747];
										if (Static378.anInt6935 != 4) {
											local759 = local759 * (Static422.anInt7593 + 256) >> 8;
											local763 = local763 * (Static422.anInt7593 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static378.anInt6935 == 4) {
											local813 = (Static322.anInt6116 >> 9) + (local792 >> 2);
											local821 = (Static620.anInt10427 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() - 1) * 256;
											local813 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 - local830 >> 9) + (local792 >> 2);
											local821 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 - local830 >> 9) - (local802 >> 2);
										}
										if (Static238.aBoolean302 && (Static156.anInt3080 & 0x40) != 0) {
											@Pc(863) Class230 local863 = Static572.method8204(Static639.anInt10686, Static402.anInt10315);
											if (local863 == null) {
												Static141.method1563();
											} else {
												Static261.method3780(1L, local6.anInt6646, true, " ->", false, Static275.anInt4778, true, local813, (long) (local6.anInt6679 << 0 | local6.anInt6663), local821, Static139.aString30, 51);
											}
											continue;
										}
										if (Static630.aClass77_8 == Static635.aClass77_9) {
											Static261.method3780(1L, -1, true, "", false, -1, true, local813, 0L, local821, Static514.aClass303_29.method7473(Static232.anInt4258), 20);
										}
										Static261.method3780(1L, -1, true, "", false, Static167.anInt3248, true, local813, 0L, local821, Static181.aString32, 23);
										continue;
									}
									if (local6.anInt6693 == Static87.anInt1953) {
										Static289.aClass230_3 = local6;
										if (local232) {
											Static349.aBoolean457 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method8578() - local17 - local6.anInt6703 / 2) * 2.0D / (double) Static498.aFloat216);
											local708 = (int) -((double) (local45 + local291.method8571() - local22 - local6.anInt6701 / 2) * 2.0D / (double) Static498.aFloat216);
											local469 = Static397.anInt7311 + local335 + Static498.anInt8795;
											local747 = Static517.anInt9046 + local708 + Static498.anInt8796;
											@Pc(994) Class14_Sub3_Sub16 local994 = Static126.method2098();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method7674(local469, local999, local747);
											if (local999 != null) {
												if (Static68.aClass65_1.method1565(82) && Static447.anInt10238 > 0) {
													Static524.method7529(local999[1], local999[2], local999[0]);
													continue;
												}
												Static672.aBoolean763 = true;
												Static671.anInt11144 = local999[0];
												Static92.anInt2036 = local999[1];
												Static386.anInt7119 = local999[2];
											}
											Static119.anInt2451 = 1;
											Static315.aBoolean410 = false;
											Static325.anInt6166 = Static666.aClass79_1.method3361();
											Static260.anInt4561 = Static666.aClass79_1.method3358();
											continue;
										}
										if (local276 && Static119.anInt2451 > 0) {
											if (Static119.anInt2451 == 1 && (Static325.anInt6166 != Static666.aClass79_1.method3361() || Static260.anInt4561 != Static666.aClass79_1.method3358())) {
												Static32.anInt9380 = Static397.anInt7311;
												Static527.anInt9141 = Static517.anInt9046;
												Static119.anInt2451 = 2;
											}
											if (Static119.anInt2451 == 2) {
												Static315.aBoolean410 = true;
												Static1.method8563(Static32.anInt9380 + (int) ((double) (Static325.anInt6166 - Static666.aClass79_1.method3361()) * 2.0D / (double) Static498.aFloat217));
												Static131.method6553(Static527.anInt9141 - (int) ((double) (Static260.anInt4561 - Static666.aClass79_1.method3358()) * 2.0D / (double) Static498.aFloat217));
											}
											continue;
										}
										if (Static119.anInt2451 > 0 && !Static315.aBoolean410) {
											if ((Static113.anInt2288 == 1 || Static297.method4375()) && Static313.anInt9044 > 2) {
												Static88.method8997(Static260.anInt4561, Static325.anInt6166);
											} else if (Static89.method1685()) {
												Static88.method8997(Static260.anInt4561, Static325.anInt6166);
											}
										}
										Static119.anInt2451 = 0;
										continue;
									}
									if (local6.anInt6693 == Static122.anInt2457) {
										if (local276) {
											Static258.method3700(local45 + Static666.aClass79_1.method3358() - local22, local6.anInt6703, local40 + Static666.aClass79_1.method3361() - local17, local6.anInt6701);
										}
										continue;
									}
									if (local6.anInt6693 == Static490.anInt8759) {
										Static320.method5063(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean482 && local286) {
									local6.aBoolean482 = true;
									if (local6.anObjectArray21 != null) {
										local558 = new Class14_Sub55();
										local558.aBoolean747 = true;
										local558.aClass230_14 = local6;
										local558.anInt10932 = local40 + local291.method8578() - local17;
										local558.anInt10933 = local45 + local291.method8571() - local22;
										local558.anObjectArray33 = local6.anObjectArray21;
										Static576.aClass262_67.method6314(local558);
									}
								}
								if (local6.aBoolean482 && local276 && local6.anObjectArray29 != null) {
									local558 = new Class14_Sub55();
									local558.aBoolean747 = true;
									local558.aClass230_14 = local6;
									local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
									local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
									local558.anObjectArray33 = local6.anObjectArray29;
									Static576.aClass262_67.method6314(local558);
								}
								if (local6.aBoolean482 && !local276) {
									local6.aBoolean482 = false;
									if (local6.anObjectArray32 != null) {
										local558 = new Class14_Sub55();
										local558.aBoolean747 = true;
										local558.aClass230_14 = local6;
										local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
										local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
										local558.anObjectArray33 = local6.anObjectArray32;
										Static490.aClass262_58.method6314(local558);
									}
								}
								if (local276 && local6.anObjectArray6 != null) {
									local558 = new Class14_Sub55();
									local558.aBoolean747 = true;
									local558.aClass230_14 = local6;
									local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
									local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
									local558.anObjectArray33 = local6.anObjectArray6;
									Static576.aClass262_67.method6314(local558);
								}
								if (!local6.aBoolean477 && local232) {
									local6.aBoolean477 = true;
									if (local6.anObjectArray17 != null) {
										local558 = new Class14_Sub55();
										local558.aBoolean747 = true;
										local558.aClass230_14 = local6;
										local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
										local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
										local558.anObjectArray33 = local6.anObjectArray17;
										Static576.aClass262_67.method6314(local558);
									}
								}
								if (local6.aBoolean477 && local232 && local6.anObjectArray3 != null) {
									local558 = new Class14_Sub55();
									local558.aBoolean747 = true;
									local558.aClass230_14 = local6;
									local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
									local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
									local558.anObjectArray33 = local6.anObjectArray3;
									Static576.aClass262_67.method6314(local558);
								}
								if (local6.aBoolean477 && !local232) {
									local6.aBoolean477 = false;
									if (local6.anObjectArray15 != null) {
										local558 = new Class14_Sub55();
										local558.aBoolean747 = true;
										local558.aClass230_14 = local6;
										local558.anInt10932 = local40 + Static666.aClass79_1.method3361() - local17;
										local558.anInt10933 = local45 + Static666.aClass79_1.method3358() - local22;
										local558.anObjectArray33 = local6.anObjectArray15;
										Static490.aClass262_58.method6314(local558);
									}
								}
								if (local6.anObjectArray13 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray13;
									Static158.aClass262_14.method6314(local558);
								}
								@Pc(1570) Class14_Sub55 local1570;
								if (local6.anObjectArray27 != null && Static283.anInt4863 > local6.anInt6720) {
									if (local6.anIntArray485 == null || Static283.anInt4863 - local6.anInt6720 > 32) {
										local558 = new Class14_Sub55();
										local558.aClass230_14 = local6;
										local558.anObjectArray33 = local6.anObjectArray27;
										Static576.aClass262_67.method6314(local558);
									} else {
										label699: for (local335 = local6.anInt6720; local335 < Static283.anInt4863; local335++) {
											local708 = Static611.anIntArray752[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray485.length; local469++) {
												if (local6.anIntArray485[local469] == local708) {
													local1570 = new Class14_Sub55();
													local1570.aClass230_14 = local6;
													local1570.anObjectArray33 = local6.anObjectArray27;
													Static576.aClass262_67.method6314(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt6720 = Static283.anInt4863;
								}
								if (local6.anObjectArray5 != null && Static304.anInt5326 > local6.anInt6673) {
									if (local6.anIntArray480 == null || Static304.anInt5326 - local6.anInt6673 > 32) {
										local558 = new Class14_Sub55();
										local558.aClass230_14 = local6;
										local558.anObjectArray33 = local6.anObjectArray5;
										Static576.aClass262_67.method6314(local558);
									} else {
										label675: for (local335 = local6.anInt6673; local335 < Static304.anInt5326; local335++) {
											local708 = Static638.anIntArray796[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray480.length; local469++) {
												if (local6.anIntArray480[local469] == local708) {
													local1570 = new Class14_Sub55();
													local1570.aClass230_14 = local6;
													local1570.anObjectArray33 = local6.anObjectArray5;
													Static576.aClass262_67.method6314(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt6673 = Static304.anInt5326;
								}
								if (local6.anObjectArray11 != null && Static665.anInt4337 > local6.anInt6709) {
									if (local6.anIntArray479 == null || Static665.anInt4337 - local6.anInt6709 > 32) {
										local558 = new Class14_Sub55();
										local558.aClass230_14 = local6;
										local558.anObjectArray33 = local6.anObjectArray11;
										Static576.aClass262_67.method6314(local558);
									} else {
										label651: for (local335 = local6.anInt6709; local335 < Static665.anInt4337; local335++) {
											local708 = Static626.anIntArray778[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray479.length; local469++) {
												if (local6.anIntArray479[local469] == local708) {
													local1570 = new Class14_Sub55();
													local1570.aClass230_14 = local6;
													local1570.anObjectArray33 = local6.anObjectArray11;
													Static576.aClass262_67.method6314(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt6709 = Static665.anInt4337;
								}
								if (local6.anObjectArray12 != null && Static497.anInt10442 > local6.anInt6654) {
									if (local6.anIntArray484 == null || Static497.anInt10442 - local6.anInt6654 > 32) {
										local558 = new Class14_Sub55();
										local558.aClass230_14 = local6;
										local558.anObjectArray33 = local6.anObjectArray12;
										Static576.aClass262_67.method6314(local558);
									} else {
										label627: for (local335 = local6.anInt6654; local335 < Static497.anInt10442; local335++) {
											local708 = Static34.anIntArray71[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray484.length; local469++) {
												if (local6.anIntArray484[local469] == local708) {
													local1570 = new Class14_Sub55();
													local1570.aClass230_14 = local6;
													local1570.anObjectArray33 = local6.anObjectArray12;
													Static576.aClass262_67.method6314(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt6654 = Static497.anInt10442;
								}
								if (local6.anObjectArray10 != null && Static286.anInt4884 > local6.anInt6717) {
									if (local6.anIntArray482 == null || Static286.anInt4884 - local6.anInt6717 > 32) {
										local558 = new Class14_Sub55();
										local558.aClass230_14 = local6;
										local558.anObjectArray33 = local6.anObjectArray10;
										Static576.aClass262_67.method6314(local558);
									} else {
										label603: for (local335 = local6.anInt6717; local335 < Static286.anInt4884; local335++) {
											local708 = Static285.anIntArray394[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray482.length; local469++) {
												if (local6.anIntArray482[local469] == local708) {
													local1570 = new Class14_Sub55();
													local1570.aClass230_14 = local6;
													local1570.anObjectArray33 = local6.anObjectArray10;
													Static576.aClass262_67.method6314(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt6717 = Static286.anInt4884;
								}
								if (Static513.anInt9020 > local6.anInt6643 && local6.anObjectArray14 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray14;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static619.anInt10403 > local6.anInt6643 && local6.anObjectArray1 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray1;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static233.anInt4277 > local6.anInt6643 && local6.anObjectArray7 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray7;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static218.anInt4113 > local6.anInt6643 && local6.anObjectArray25 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray25;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static444.anInt7851 > local6.anInt6643 && local6.anObjectArray16 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray16;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static308.anInt5374 > local6.anInt6643 && local6.anObjectArray30 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray30;
									Static576.aClass262_67.method6314(local558);
								}
								if (Static514.anInt9026 > local6.anInt6643 && local6.anObjectArray2 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray2;
									Static576.aClass262_67.method6314(local558);
								}
								local6.anInt6643 = Static441.anInt7833;
								if (local6.anObjectArray23 != null) {
									for (local335 = 0; local335 < Static569.anInt9812; local335++) {
										@Pc(2082) Class14_Sub55 local2082 = new Class14_Sub55();
										local2082.aClass230_14 = local6;
										local2082.anInt10936 = Static433.anInterface7Array3[local335].method3427();
										local2082.anInt10931 = Static433.anInterface7Array3[local335].method3428();
										local2082.anObjectArray33 = local6.anObjectArray23;
										Static576.aClass262_67.method6314(local2082);
									}
								}
								if (Static456.aBoolean550 && local6.anObjectArray20 != null) {
									local558 = new Class14_Sub55();
									local558.aClass230_14 = local6;
									local558.anObjectArray33 = local6.anObjectArray20;
									Static576.aClass262_67.method6314(local558);
								}
							}
							if (local6.anInt6660 == 5 && local6.anInt6719 != -1) {
								local6.method5456(Static20.aClass385_31, Static379.aClass250_13).method3547(local6.anInt6701, Static677.aClass137_47);
							}
							Static520.method7497(local6);
							if (local6.anInt6660 == 0) {
								method1475(arg0, local6.anInt6663, local28, local30, local32, local34, local17 - local6.anInt6705, local22 - local6.anInt6641, arg8, arg9, arg10, arg11);
								if (local6.aClass230Array2 != null) {
									method1475(local6.aClass230Array2, local6.anInt6663, local28, local30, local32, local34, local17 - local6.anInt6705, local22 - local6.anInt6641, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class14_Sub32 local2208 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local6.anInt6663);
								if (local2208 != null) {
									if (Static630.aClass77_8 == Static174.aClass77_11 && local2208.anInt6350 == 0 && !Static505.aBoolean629 && local232 && !Static28.aBoolean59) {
										Static229.method3485();
									}
									Static523.method7522(arg8, local34, arg11, local30, local2208.anInt6351, local17, arg9, arg10, local28, local32, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static520.method7497(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1477(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static209.anInt3954;
		@Pc(3) int[] local3 = Static457.anIntArray607;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static471.anInt8216; local5++) {
			@Pc(15) Class12_Sub2_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local5 - local1])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			}
			if (local15.aByte146 == arg0 && local15.anInt2924 >= 0) {
				@Pc(39) int local39 = local15.method2422();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10998 & 0x1FF) != 0 || (local15.anInt11002 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10998 & 0x1FF) != 256 || (local15.anInt11002 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10998 >> 9;
					local80 = local15.anInt11002 >> 9;
					if (local15.anInt2924 > Static566.anIntArrayArray53[local75][local80]) {
						Static566.anIntArrayArray53[local75][local80] = local15.anInt2924;
						Static155.anIntArrayArray17[local75][local80] = 1;
					} else if (local15.anInt2924 == Static566.anIntArrayArray53[local75][local80]) {
						local116 = Static155.anIntArrayArray17[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10998 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt11002 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10998 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt11002 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt2924 > Static566.anIntArrayArray53[local158][local161]) {
								Static566.anIntArrayArray53[local158][local161] = local15.anInt2924;
								Static155.anIntArrayArray17[local158][local161] = 1;
							} else if (local15.anInt2924 == Static566.anIntArrayArray53[local158][local161]) {
								local116 = Static155.anIntArrayArray17[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	public static void method1479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Class14_Sub3_Sub9 local11 = Static142.method2219((long) arg0, 10);
		local11.method2817();
		local11.anInt3419 = arg3;
		local11.anInt3409 = arg2;
		local11.anInt3413 = arg1;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mea;)Lclient!mea;")
	public static Class230 method1480(@OriginalArg(0) Class230 arg0) {
		@Pc(4) int local4 = method1481(arg0).method5406();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static655.method9094(arg0.anInt6668);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mea;)Lclient!mca;")
	public static Class14_Sub33 method1481(@OriginalArg(0) Class230 arg0) {
		@Pc(13) Class14_Sub33 local13 = (Class14_Sub33) Static476.aClass187_59.method4078(((long) arg0.anInt6663 << 32) + (long) arg0.anInt6679);
		return local13 == null ? arg0.aClass14_Sub33_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1485(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static209.anInt3954;
		@Pc(3) int[] local3 = Static457.anIntArray607;
		@Pc(11) int local11 = Static156.aBoolean237 ? local1 : local1 + Static471.anInt8216;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local13 - local1])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			}
			if (local23.aByte146 == arg0) {
				local23.anInt2906 = 0;
				if (local23.anInt2924 < 0) {
					local23.aBoolean221 = false;
				} else {
					@Pc(54) int local54 = local23.method2422();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10998 & 0x1FF) != 0 || (local23.anInt11002 & 0x1FF) != 0) {
							local23.aBoolean221 = false;
							continue;
						}
					} else if ((local23.anInt10998 & 0x1FF) != 256 || (local23.anInt11002 & 0x1FF) != 256) {
						local23.aBoolean221 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10998 >> 9;
						local101 = local23.anInt11002 >> 9;
						if (local23.anInt2924 != Static566.anIntArrayArray53[local96][local101]) {
							local23.aBoolean221 = true;
							continue;
						}
						if (Static155.anIntArrayArray17[local96][local101] > 1) {
							local126 = Static155.anIntArrayArray17[local96][local101]--;
							local23.aBoolean221 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10998 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt11002 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10998 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt11002 + local96 >> 9;
						if (!Static676.method9297(local169, local23.anInt2924, local162, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt2924 == Static566.anIntArrayArray53[local180][local183]) {
										local126 = Static155.anIntArrayArray17[local180][local183]--;
									}
								}
							}
							local23.aBoolean221 = true;
							continue;
						}
					}
					local23.aBoolean221 = false;
					local23.anInt10997 = Static152.method2434(local23.anInt10998, local23.aByte146, local23.anInt11002);
					Static662.method9184(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1486() {
		@Pc(1) int local1 = Static209.anInt3954;
		@Pc(3) int[] local3 = Static457.anIntArray607;
		@Pc(11) int local11 = Static156.aBoolean237 ? local1 : local1 + Static471.anInt8216;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub2_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local13 - local1])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			}
			if (local23.anInt2924 >= 0) {
				@Pc(43) int local43 = local23.method2422();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10998 & 0x1FF) == 0 && (local23.anInt11002 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10998 & 0x1FF) == 256 && (local23.anInt11002 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10997 = Static152.method2434(local23.anInt10998, local23.aByte146, local23.anInt11002);
				Static662.method9184(local23, true);
			}
		}
	}
}
