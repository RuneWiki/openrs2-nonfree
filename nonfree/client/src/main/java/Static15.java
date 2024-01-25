import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public static int anInt415;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBIII[Lclient!rr;IIII)V")
	public static void method325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class292[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
		for (@Pc(17) int local17 = 0; local17 < arg4.length; local17++) {
			@Pc(23) Class292 local23 = arg4[local17];
			if (local23 != null && (local23.anInt7901 == arg0 || arg0 == -1412584499 && Static547.aClass292_14 == local23)) {
				@Pc(66) int local66;
				if (arg2 == -1) {
					Class237.aRectangleArray1[Static414.anInt7237].setBounds(arg8 + local23.anInt7883, arg7 + local23.anInt7923, local23.anInt7963, local23.anInt7912);
					local66 = Static414.anInt7237++;
				} else {
					local66 = arg2;
				}
				local23.anInt7889 = local66;
				local23.anInt7900 = Static312.anInt5688;
				if (!Static67.method1363(local23)) {
					if (local23.anInt7955 != 0) {
						Static397.method5813(local23);
					}
					@Pc(93) int local93 = arg8 + local23.anInt7883;
					@Pc(98) int local98 = local23.anInt7923 + arg7;
					@Pc(101) int local101 = local23.anInt7903;
					if (Static226.aBoolean321 && (Static67.method1354(local23).anInt317 != 0 || local23.lb == 0) && local101 > 127) {
						local101 = 127;
					}
					@Pc(151) int local151;
					@Pc(155) int local155;
					if (local23 == Static547.aClass292_14) {
						if (arg0 != -1412584499 && (local23.anInt7961 == Static166.anInt3564 || local23.anInt7961 == Static456.anInt7863)) {
							Static122.aClass292Array1 = arg4;
							Static225.anInt4650 = arg7;
							Static252.anInt2858 = arg8;
							continue;
						}
						if (Static226.aBoolean322 && Static577.aBoolean723) {
							local151 = Static164.aClass173_1.method6487();
							local155 = Static164.aClass173_1.method6489();
							local151 -= Static66.anInt1325;
							local155 -= Static565.anInt6649;
							if (Static428.anInt7474 > local151) {
								local151 = Static428.anInt7474;
							}
							if (local155 < Static529.anInt4675) {
								local155 = Static529.anInt4675;
							}
							if (local23.anInt7963 + local151 > Static473.aClass292_10.anInt7963 + Static428.anInt7474) {
								local151 = Static473.aClass292_10.anInt7963 + Static428.anInt7474 - local23.anInt7963;
							}
							local93 = local151;
							if (local23.anInt7912 + local155 > Static529.anInt4675 - -Static473.aClass292_10.anInt7912) {
								local155 = Static473.aClass292_10.anInt7912 + Static529.anInt4675 - local23.anInt7912;
							}
							local98 = local155;
						}
						if (Static456.anInt7863 == local23.anInt7961) {
							local101 = 128;
						}
					}
					@Pc(232) int local232;
					@Pc(234) int local234;
					@Pc(243) int local243;
					@Pc(248) int local248;
					if (local23.lb == 2) {
						local155 = arg6;
						local232 = arg5;
						local234 = arg1;
						local151 = arg3;
					} else {
						local243 = local23.anInt7963 + local93;
						local248 = local23.anInt7912 + local98;
						local151 = local93 > arg3 ? local93 : arg3;
						local155 = arg6 < local98 ? local98 : arg6;
						if (local23.lb == 9) {
							local248++;
							local243++;
						}
						local234 = local248 >= arg1 ? arg1 : local248;
						local232 = local243 >= arg5 ? arg5 : local243;
					}
					if (local232 > local151 && local234 > local155) {
						@Pc(520) int local520;
						@Pc(533) int local533;
						@Pc(632) int local632;
						@Pc(484) int local484;
						@Pc(518) int local518;
						if (local23.anInt7955 != 0) {
							if (Static322.anInt5908 == local23.anInt7955 || local23.anInt7955 == Static384.anInt6753) {
								Static348.method5328(local23.anInt7912, Static384.anInt6753 == local23.anInt7955, local98, local93, local23.anInt7963);
								Static31.aBooleanArray17[local66] = true;
								Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
								continue;
							}
							if (Static471.anInt6501 == local23.anInt7955) {
								if (local23.method6463(Static240.aClass14_7) != null) {
									Static482.method6632();
									Static425.method6112(Static240.aClass14_7, local93, local23, local98);
									Static143.aBooleanArray15[local66] = true;
									Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
								}
								continue;
							}
							if (local23.anInt7955 == Static414.anInt7240) {
								if (local23.method6463(Static240.aClass14_7) != null) {
									Static24.method789(local93, local98, local23);
									Static143.aBooleanArray15[local66] = true;
									Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
								}
								continue;
							}
							if (local23.anInt7955 == Static117.anInt2721) {
								Static232.method6051(Static240.aClass14_7, local23.anInt7912, local23.anInt7963, local98, Static488.anInterface4_11, local93);
								Static31.aBooleanArray17[local66] = true;
								Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
								continue;
							}
							if (Static4.anInt239 == local23.anInt7955) {
								Static89.method1676(Static240.aClass14_7, local98, local23.anInt7912, local23.anInt7963, local93);
								Static31.aBooleanArray17[local66] = true;
								Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
								continue;
							}
							if (Static571.anInt9349 == local23.anInt7955) {
								if (!Static43.aBoolean62 && !Static591.aBoolean735) {
									continue;
								}
								local243 = local93 + local23.anInt7963;
								local248 = local98 + 15;
								if (Static43.aBoolean62) {
									local484 = -256;
									if (Static367.anInt6478 < 20) {
										local484 = -65536;
									}
									Static101.aClass92_9.method6388(local484, local248, "Fps:" + Static367.anInt6478, local243);
									local248 += 15;
									@Pc(508) Runtime local508 = Runtime.getRuntime();
									local518 = (int) ((local508.totalMemory() - local508.freeMemory()) / 1024L);
									local520 = -256;
									if (local518 > 65536) {
										local520 = -65536;
										if (Static73.aBoolean111) {
											Static411.method7694();
											for (local533 = 0; local533 < 10; local533++) {
												System.gc();
											}
											local518 = (int) ((local508.totalMemory() - local508.freeMemory()) / 1024L);
											if (local518 > 65536) {
												Static273.method4517("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static101.aClass92_9.method6388(local520, local248, "Mem:" + local518 + "k", local243);
									local248 += 15;
									Static101.aClass92_9.method6388(-256, local248, "In:" + Static541.anInt6702 + "B/s Out:" + Static235.anInt4760 + "B/s", local243);
									local248 += 15;
									local533 = Static240.aClass14_7.v() / 1024;
									Static101.aClass92_9.method6388(local533 <= 65536 ? -256 : -65536, local248, "Offheap:" + local533 + "k", local243);
									local248 += 15;
									local632 = 0;
									@Pc(634) int local634 = 0;
									@Pc(636) int local636 = 0;
									for (@Pc(638) int local638 = 0; local638 < 35; local638++) {
										if (Static197.aClass160_Sub1Array2[local638] != null) {
											local632 += Static197.aClass160_Sub1Array2[local638].method6362();
											local634 += Static197.aClass160_Sub1Array2[local638].method6363();
											local636 += Static197.aClass160_Sub1Array2[local638].method6361();
										}
									}
									@Pc(678) int local678 = local636 * 100 / local632;
									@Pc(684) int local684 = local634 * 10000 / local632;
									@Pc(704) String local704 = "Cache:" + Static58.method1226(2, (long) local684, true, 0) + "% (" + local678 + "%)";
									Static319.aClass92_11.method6388(-256, local248, local704, local243);
									local248 += 12;
								}
								if (Static12.anInt335 > 0) {
									Static319.aClass92_11.method6388(-256, local248, "Particles: " + Static489.anInt8241 + " / " + Static12.anInt335, local243);
								}
								local248 += 12;
								if (Static591.aBoolean735) {
									Static319.aClass92_11.method6388(-256, local248, "Polys: " + Static240.aClass14_7.SA() + " Models: " + Static240.aClass14_7.aa(), local243);
									local248 += 12;
									Static319.aClass92_11.method6388(-256, local248, "Ls: " + Static552.anInt9133 + " La: " + Static130.anInt2951 + " NPC: " + Static119.anInt2849 + " Pl: " + Static518.anInt8739, local243);
									local248 += 12;
									Static97.method1749();
								}
								Static31.aBooleanArray17[local66] = true;
								continue;
							}
						}
						if (local23.lb == 0) {
							if (Static203.anInt4172 == local23.anInt7955 && Static240.aClass14_7.method6887()) {
								Static240.aClass14_7.method6864(local93, local98, local23.anInt7963, local23.anInt7912);
							}
							method325(local23.anInt7890, local234, local66, local151, arg4, local232, local155, local98 - local23.anInt7911, -local23.anInt7957 + local93);
							if (local23.aClass292Array2 != null) {
								method325(local23.anInt7890, local234, local66, local151, local23.aClass292Array2, local232, local155, local98 - local23.anInt7911, local93 + -local23.anInt7957);
							}
							@Pc(863) Class6_Sub11 local863 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local23.anInt7890);
							if (local863 != null) {
								Static135.method2644(local98, local232, local155, local66, local234, local151, local863.anInt1216, local93);
							}
							if (Static203.anInt4172 == local23.anInt7955 && Static240.aClass14_7.method6887()) {
								Static240.aClass14_7.method6834();
								Static299.aBoolean389 = true;
							}
							Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
						}
						if (Static528.aBooleanArray37[local66] || Static273.anInt5224 > 1) {
							if (local23.lb == 3) {
								if (local101 == 0) {
									if (local23.aBoolean564) {
										Static240.aClass14_7.C(local93, local98, local23.anInt7963, local23.anInt7912, local23.anInt7898, 0);
									} else {
										Static240.aClass14_7.method6875(local93, local98, local23.anInt7963, local23.anInt7912, local23.anInt7898, 0);
									}
								} else if (local23.aBoolean564) {
									Static240.aClass14_7.C(local93, local98, local23.anInt7963, local23.anInt7912, 255 - (local101 & 0xFF) << 24 | local23.anInt7898 & 0xFFFFFF, 1);
								} else {
									Static240.aClass14_7.method6875(local93, local98, local23.anInt7963, local23.anInt7912, local23.anInt7898 & 0xFFFFFF | 255 - (local101 & 0xFF) << 24, 1);
								}
							} else if (local23.lb == 4) {
								@Pc(1003) Class92 local1003 = local23.method6461(Static240.aClass14_7);
								if (local1003 != null) {
									local248 = local23.anInt7898;
									@Pc(1018) String local1018 = local23.aString77;
									if (local23.anInt7933 != -1) {
										@Pc(1029) Class237 local1029 = Static444.aClass322_2.method7141(local23.anInt7933);
										local1018 = local1029.aString58;
										if (local1018 == null) {
											local1018 = "null";
										}
										if ((local1029.anInt6524 == 1 || local23.anInt7924 != 1) && local23.anInt7924 != -1) {
											local1018 = "<col=ff9040>" + local1018 + "</col> x" + Static227.method4028(local23.anInt7924);
										}
									}
									if (local23 == Static518.aClass292_13) {
										local1018 = Static230.aClass156_30.method4065(Static25.anInt769);
										local248 = local23.anInt7898;
									}
									if (Static196.aBoolean279) {
										Static240.aClass14_7.Q(local93, local98, local93 + local23.anInt7963, local98 + local23.anInt7912);
									}
									local1003.method6405(local23.aBoolean557 ? 255 - (local101 & 0xFF) << 24 : -1, local23.anInt7963, 0, Static241.aClass58Array12, local1018, local23.anInt7970, local23.anInt7912, local23.anInt7916, 0, local248 | 255 - (local101 & 0xFF) << 24, null, local93, null, local23.anInt7971, local98, local23.anInt7930);
									if (Static196.aBoolean279) {
										Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
									}
								} else if (Static419.aBoolean504) {
									Static464.method6502(local23);
								}
							} else {
								@Pc(1251) int local1251;
								if (local23.lb == 5) {
									if (local23.anInt7943 >= 0) {
										local23.method6477(Static230.aClass306_1, Static209.aClass270_1).method5996(local93, local98, local23.anInt7963, local23.anInt7925 << 3, local23.anInt7912, 0, Static240.aClass14_7, local23.anInt7894 << 3, 0);
									} else {
										@Pc(1214) Class58 local1214;
										if (local23.anInt7933 == -1) {
											local1214 = local23.method6468(Static240.aClass14_7);
										} else {
											@Pc(1196) Class123 local1196 = local23.aBoolean570 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null;
											local1214 = Static444.aClass322_2.method7145(local23.anInt7938 | 0xFF000000, local23.anInt7933, local23.anInt7917, local23.anInt7924, local1196, local23.anInt7881, Static240.aClass14_7);
										}
										if (local1214 != null) {
											local248 = local1214.AA();
											local484 = local1214.a();
											local1251 = (local23.anInt7898 == 0 ? 16777215 : local23.anInt7898 & 0xFFFFFF) | 255 - (local101 & 0xFF) << 24;
											if (local23.aBoolean562) {
												Static240.aClass14_7.Q(local93, local98, local23.anInt7963 + local93, local98 - -local23.anInt7912);
												if (local23.anInt7931 != 0) {
													local518 = (local23.anInt7963 + local248 - 1) / local248;
													local520 = (local23.anInt7912 + local484 - 1) / local484;
													for (local533 = 0; local533 < local518; local533++) {
														for (local632 = 0; local632 < local520; local632++) {
															if (local23.anInt7898 == 0) {
																local1214.method7665((float) local248 / 2.0F + (float) (local93 + local248 * local533), (float) (local632 * local484 + local98) + (float) local484 / 2.0F, 4096, local23.anInt7931);
															} else {
																local1214.method7664((float) local248 / 2.0F + (float) (local93 + local248 * local533), (float) (local484 * local632 + local98) + (float) local484 / 2.0F, 4096, local23.anInt7931, local1251);
															}
														}
													}
												} else if (local23.anInt7898 == 0 && local101 == 0) {
													local1214.method7661(local93, local98, local23.anInt7963, local23.anInt7912);
												} else {
													local1214.ba(local93, local98, local23.anInt7963, local23.anInt7912, 0, local1251, 1);
												}
												Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
											} else if (local23.anInt7898 == 0 && local101 == 0) {
												if (local23.anInt7931 != 0) {
													local1214.method7665((float) local93 + (float) local23.anInt7963 / 2.0F, (float) local98 + (float) local23.anInt7912 / 2.0F, local23.anInt7963 * 4096 / local248, local23.anInt7931);
												} else if (local248 == local23.anInt7963 && local23.anInt7912 == local484) {
													local1214.method7666(local93, local98);
												} else {
													local1214.method7657(local93, local98, local23.anInt7963, local23.anInt7912);
												}
											} else if (local23.anInt7931 != 0) {
												local1214.method7664((float) local93 + (float) local23.anInt7963 / 2.0F, (float) local23.anInt7912 / 2.0F + (float) local98, local23.anInt7963 * 4096 / local248, local23.anInt7931, local1251);
											} else if (local248 == local23.anInt7963 && local484 == local23.anInt7912) {
												local1214.I(local93, local98, 0, local1251, 1);
											} else {
												local1214.KA(local93, local98, local23.anInt7963, local23.anInt7912, 0, local1251, 1);
											}
										} else if (Static419.aBoolean504) {
											Static464.method6502(local23);
										}
									}
								} else if (local23.lb == 6) {
									Static117.method2478();
									@Pc(1563) Class20 local1563 = null;
									local248 = 0;
									@Pc(1595) Class57 local1595;
									@Pc(1603) Class123 local1603;
									if (local23.anInt7933 != -1) {
										@Pc(1575) Class237 local1575 = Static444.aClass322_2.method7141(local23.anInt7933);
										if (local1575 != null) {
											local1575 = local1575.method5532(local23.anInt7924);
											local1595 = local23.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(local23.anInt7936);
											local1603 = local23.aBoolean570 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null;
											local1563 = local1575.method5536(1, local1595, local23.anInt7941, local23.anInt7969, local1603, local23.anInt7886, 2048, Static240.aClass14_7);
											if (local1563 == null) {
												Static464.method6502(local23);
											} else {
												local248 = -local1563.DA() >> 1;
											}
										}
									} else if (local23.anInt7885 == 5) {
										local484 = local23.anInt7942;
										if (local484 >= 0 && local484 < 2048) {
											@Pc(1650) Class4_Sub1_Sub1_Sub2 local1650 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local484];
											@Pc(1662) Class57 local1662 = local23.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(local23.anInt7936);
											if (local1650 != null && (Static272.anInt5214 == local484 || Static597.method7850(local1650.aString63) == local23.anInt7967)) {
												local1563 = local1650.aClass123_1.method3204(2048, Static444.aClass322_2, -1, Static304.aClass333_1, local23.anInt7969, local23.anInt7941, local1662, Static78.aClass298_2, Static577.aClass125_2, 0, Static498.aClass101_1, Static333.aClass149_1, null, 0, null, local23.anInt7886, Static240.aClass14_7);
											}
										}
									} else if (local23.anInt7885 == 8 || local23.anInt7885 == 9) {
										@Pc(1790) Class6_Sub49 local1790 = Static84.method1640(local23.anInt7942, false);
										local1595 = local23.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(local23.anInt7936);
										if (local1790 != null) {
											local1603 = local23.aBoolean570 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null;
											local1563 = local1790.method7523(local23.anInt7941, local1603, Static240.aClass14_7, local23.anInt7967, local23.anInt7969, local23.anInt7886, local1595, local23.anInt7885 == 9);
										}
									} else if (local23.anInt7936 == -1) {
										local1563 = local23.method6474(Static444.aClass322_2, Static304.aClass333_1, Static498.aClass101_1, Static78.aClass298_2, 0, -1, null, Static333.aClass149_1, -1, Static577.aClass125_2, Static240.aClass14_7, 2048, Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1);
										if (local1563 == null && Static419.aBoolean504) {
											Static464.method6502(local23);
										}
									} else {
										@Pc(1755) Class57 local1755 = Static78.aClass298_2.method6521(local23.anInt7936);
										local1563 = local23.method6474(Static444.aClass322_2, Static304.aClass333_1, Static498.aClass101_1, Static78.aClass298_2, local23.anInt7941, local23.anInt7886, local1755, Static333.aClass149_1, local23.anInt7969, Static577.aClass125_2, Static240.aClass14_7, 2048, Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1);
										if (local1563 == null && Static419.aBoolean504) {
											Static464.method6502(local23);
										}
									}
									if (local1563 != null) {
										if (local23.anInt7914 > 0) {
											local484 = (local23.anInt7963 << 9) / local23.anInt7914;
										} else {
											local484 = 512;
										}
										if (local23.anInt7947 <= 0) {
											local1251 = 512;
										} else {
											local1251 = (local23.anInt7912 << 9) / local23.anInt7947;
										}
										local518 = (local484 * local23.anInt7944 >> 9) + local23.anInt7963 / 2 + local93;
										local520 = local23.anInt7912 / 2 + local98 + (local1251 * local23.anInt7934 >> 9);
										Static21.aClass54_1.Y();
										Static240.aClass14_7.method6829(Static21.aClass54_1);
										Static240.aClass14_7.m(local518, local520, local484, local1251);
										Static240.aClass14_7.ka((float) (local23.anInt7921 << 2), local23.aBoolean559 ? (float) (local23.anInt7892 << 2) : (float) (local23.anInt7892 << 2) * 1.5F);
										if (arg0 == -1412584499 || Static299.aBoolean389) {
											Static240.aClass14_7.F();
											Static240.aClass14_7.method6892();
											Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
											Static299.aBoolean389 = false;
										}
										if (local23.aBoolean565) {
											Static240.aClass14_7.method6880(false);
										}
										local533 = (local23.anInt7904 << 2) * Class6_Sub2_Sub7.anIntArray178[local23.anInt7951 << 3] >> 14;
										local632 = Class6_Sub2_Sub7.anIntArray177[local23.anInt7951 << 3] * (local23.anInt7904 << 2) >> 14;
										Static528.aClass54_6.ra(-local23.anInt7926 << 3);
										Static528.aClass54_6.P(local23.anInt7897 << 3);
										Static528.aClass54_6.G(local23.anInt7939 << 2, local248 + local533 + (local23.anInt7893 << 2), (local23.anInt7893 << 2) + local632);
										Static528.aClass54_6.S(local23.anInt7951 << 3);
										local23.method6478(local1563, Static528.aClass54_6, Static240.aClass14_7, Static312.anInt5688);
										if (Static196.aBoolean279) {
											Static240.aClass14_7.Q(local93, local98, local93 + local23.anInt7963, local23.anInt7912 + local98);
										}
										if (local23.aBoolean559) {
											local1563.method7259(Static528.aClass54_6, null, local23.anInt7904 << 2);
										} else if (local23.aClass98_Sub3_5 == null) {
											local1563.method7256(Static528.aClass54_6, null, 1);
										} else {
											Static240.aClass14_7.method6856(local1563, local23.aClass98_Sub3_5.method4541(), Static528.aClass54_6, null, 1);
										}
										if (Static196.aBoolean279) {
											Static240.aClass14_7.ca(arg3, arg6, arg5, arg1);
										}
										if (local23.aBoolean565) {
											Static240.aClass14_7.method6880(true);
										}
										Static240.aClass14_7.ka(0.0F, 0.0F);
									}
								} else if (local23.lb == 9) {
									if (local23.aBoolean563) {
										local1251 = local98;
										local484 = local23.anInt7963 + local93;
										local248 = local23.anInt7912 + local98;
									} else {
										local248 = local98;
										local1251 = local23.anInt7912 + local98;
										local484 = local93 + local23.anInt7963;
									}
									if (local23.anInt7906 == 1) {
										Static240.aClass14_7.method6894(local93, local248, local484, local1251, local23.anInt7898, 0);
									} else {
										Static240.aClass14_7.method6893(local93, local248, local484, local1251, local23.anInt7898, local23.anInt7906);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
	public static int method327(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
