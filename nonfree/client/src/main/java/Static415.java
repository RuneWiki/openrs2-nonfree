import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_102 = new Class267("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_53 = new Class44(5);

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt7434 = 0;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
	public static boolean aBoolean470 = true;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	private static final int anInt7435 = 1405;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIB[Lclient!ts;IIIII)V")
	public static void method6099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class239[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class239 local23 = arg3[local17];
			if (local23 != null && (local23.anInt6895 == arg1 || arg1 == -1412584499 && Static240.aClass239_8 == local23)) {
				@Pc(48) int local48;
				if (arg6 == -1) {
					Class12_Sub2.aRectangleArray1[Static386.anInt6857].setBounds(arg7 + local23.anInt6922, arg4 + local23.anInt6905, local23.anInt6898, local23.anInt6899);
					local48 = Static386.anInt6857++;
				} else {
					local48 = arg6;
				}
				local23.anInt6893 = Static66.anInt1741;
				local23.anInt6972 = local48;
				if (!Static50.method1153(local23)) {
					if (local23.anInt6911 != 0) {
						Static443.method6409(local23);
					}
					@Pc(96) int local96 = local23.anInt6922 + arg7;
					@Pc(101) int local101 = arg4 + local23.anInt6905;
					@Pc(104) int local104 = local23.anInt6914;
					if (Static27.aBoolean39 && (Static50.method1150(local23).anInt1492 != 0 || local23.anInt6900 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (local23 == Static240.aClass239_8) {
						if (arg1 != -1412584499 && (local23.anInt6955 == Static141.anInt1372 || Static131.anInt2785 == local23.anInt6955)) {
							Static259.anInt4725 = arg7;
							Static22.aClass239Array1 = arg3;
							Static59.anInt1659 = arg4;
							continue;
						}
						if (Static145.aBoolean189 && Static335.aBoolean364) {
							local152 = Static186.aClass50_1.method1436();
							local156 = Static186.aClass50_1.method1446();
							local152 -= Static428.anInt7618;
							local156 -= Static263.anInt4753;
							if (Static312.anInt5429 > local152) {
								local152 = Static312.anInt5429;
							}
							if (Static97.anInt2205 > local156) {
								local156 = Static97.anInt2205;
							}
							if (local23.anInt6898 + local152 > Static312.anInt5429 + Static97.aClass239_3.anInt6898) {
								local152 = Static97.aClass239_3.anInt6898 + Static312.anInt5429 - local23.anInt6898;
							}
							if (local23.anInt6899 + local156 > Static97.anInt2205 - -Static97.aClass239_3.anInt6899) {
								local156 = Static97.anInt2205 + Static97.aClass239_3.anInt6899 - local23.anInt6899;
							}
							local96 = local152;
							local101 = local156;
						}
						if (local23.anInt6955 == Static131.anInt2785) {
							local104 = 128;
						}
					}
					@Pc(279) int local279;
					@Pc(268) int local268;
					@Pc(232) int local232;
					@Pc(237) int local237;
					if (local23.anInt6900 == 2) {
						local152 = arg5;
						local279 = arg2;
						local268 = arg0;
						local156 = arg8;
					} else {
						local232 = local96 + local23.anInt6898;
						local237 = local23.anInt6899 + local101;
						local156 = local101 <= arg8 ? arg8 : local101;
						local152 = local96 > arg5 ? local96 : arg5;
						if (local23.anInt6900 == 9) {
							local237++;
							local232++;
						}
						local268 = arg0 > local237 ? local237 : arg0;
						local279 = arg2 <= local232 ? arg2 : local232;
					}
					if (local279 > local152 && local268 > local156) {
						@Pc(556) int local556;
						@Pc(580) int local580;
						@Pc(582) int local582;
						@Pc(504) int local504;
						@Pc(506) int local506;
						if (local23.anInt6911 != 0) {
							if (Static267.anInt4852 == local23.anInt6911 || local23.anInt6911 == Static71.anInt1875) {
								Static267.method4085(local23.anInt6898, local23.anInt6899, local96, local101, local23.anInt6911 == Static71.anInt1875);
								Static180.aBooleanArray8[local48] = true;
								Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
								continue;
							}
							if (Static134.anInt2828 == local23.anInt6911) {
								if (local23.method5734(Static126.aClass66_5) != null) {
									Static280.method4210();
									Static165.method2740(local101, local23, local96, Static126.aClass66_5);
									Static256.aBooleanArray16[local48] = true;
									Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
								}
								continue;
							}
							if (local23.anInt6911 == Static133.anInt6879) {
								if (local23.method5734(Static126.aClass66_5) != null) {
									Static159.method4786(local101, local23, local96);
									Static256.aBooleanArray16[local48] = true;
									Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
								}
								continue;
							}
							if (Static82.anInt5148 == local23.anInt6911) {
								Static252.method3890(local96, local101, local23.anInt6898, Static397.anInterface8_6, local23.anInt6899, Static126.aClass66_5);
								Static180.aBooleanArray8[local48] = true;
								Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
								continue;
							}
							if (Static320.anInt5537 == local23.anInt6911) {
								Static222.method3348(local96, local101, local23.anInt6899, Static126.aClass66_5, local23.anInt6898);
								Static180.aBooleanArray8[local48] = true;
								Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
								continue;
							}
							if (local23.anInt6911 == anInt7435) {
								if (!Static250.aBoolean295 && !Static28.aBoolean40) {
									continue;
								}
								local232 = local23.anInt6898 + local96;
								local237 = local101 + 15;
								if (Static250.aBoolean295) {
									Static35.aClass29_1.method4790(local237, "Fps:" + Static135.anInt2872, local232, -256);
									local237 += 15;
									@Pc(495) Runtime local495 = Runtime.getRuntime();
									local504 = (int) ((local495.totalMemory() - local495.freeMemory()) / 1024L);
									local506 = -256;
									if (local504 > 65536) {
										local506 = -65536;
									}
									Static35.aClass29_1.method4790(local237, "Mem:" + local504 + "k", local232, local506);
									local237 += 15;
									Static35.aClass29_1.method4790(local237, "In:" + Static345.anInt6217 + "B/s Out:" + Static223.anInt4046 + "B/s", local232, -256);
									local237 += 15;
									local556 = Static126.aClass66_5.method4984() / 1024;
									Static35.aClass29_1.method4790(local237, "Offheap:" + local556 + "k", local232, local556 <= 65536 ? -256 : -65536);
									local237 += 15;
									local580 = 0;
									local582 = 0;
									@Pc(584) int local584 = 0;
									for (@Pc(586) int local586 = 0; local586 < 30; local586++) {
										local580 += Static360.aClass68_Sub1Array2[local586].method5224();
										local582 += Static360.aClass68_Sub1Array2[local586].method5225();
										local584 += Static360.aClass68_Sub1Array2[local586].method5217();
									}
									@Pc(622) int local622 = local584 * 100 / local580;
									@Pc(628) int local628 = local582 * 10000 / local580;
									@Pc(648) String local648 = "Cache:" + Static142.method2452(0, 2, (long) local628, true) + "% (" + local622 + "%)";
									Static440.aClass29_3.method4790(local237, local648, local232, -256);
									local237 += 12;
								}
								if (Static336.anInt5844 > 0) {
									Static440.aClass29_3.method4790(local237, "Particles: " + Static223.anInt4049 + " / " + Static336.anInt5844, local232, -256);
								}
								local237 += 12;
								if (Static28.aBoolean40) {
									Static440.aClass29_3.method4790(local237, "Polys: " + Static126.aClass66_5.method5072() + " Models: " + Static126.aClass66_5.method5022(), local232, -256);
									local237 += 12;
									Static440.aClass29_3.method4790(local237, "Ls: " + Static343.anInt6130 + " La: " + Static222.anInt4030 + " NPC: " + Static2.anInt6389 + " Pl: " + Static110.anInt6979, local232, -256);
									local237 += 12;
									Static12.method348();
								}
								Static180.aBooleanArray8[local48] = true;
								continue;
							}
						}
						if (local23.anInt6900 == 0) {
							if (local23.anInt6911 == Static8.anInt324 && Static126.aClass66_5.method5056()) {
								Static126.aClass66_5.method5013(local96, local101, local23.anInt6898, local23.anInt6899);
							}
							method6099(local268, local23.anInt6908, local279, arg3, local101 - local23.anInt6887, local152, local48, local96 - local23.anInt6931, local156);
							if (local23.aClass239Array2 != null) {
								method6099(local268, local23.anInt6908, local279, local23.aClass239Array2, local101 - local23.anInt6887, local152, local48, local96 - local23.anInt6931, local156);
							}
							@Pc(814) Class6_Sub9 local814 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local23.anInt6908);
							if (local814 != null) {
								Static16.method472(local279, local156, local101, local48, local96, local152, local268, local814.anInt1505);
							}
							if (local23.anInt6911 == Static8.anInt324 && Static126.aClass66_5.method5056()) {
								Static126.aClass66_5.method5010();
								Static302.aBoolean345 = true;
							}
							Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
						}
						if (Static43.aBooleanArray4[local48] || Static69.anInt1815 > 1) {
							if (local23.anInt6900 == 3) {
								if (local104 == 0) {
									if (local23.aBoolean444) {
										Static126.aClass66_5.method5004(local96, local101, local23.anInt6898, local23.anInt6899, local23.lb, 0);
									} else {
										Static126.aClass66_5.method4972(local96, local101, local23.anInt6898, local23.anInt6899, local23.lb, 0);
									}
								} else if (local23.aBoolean444) {
									Static126.aClass66_5.method5004(local96, local101, local23.anInt6898, local23.anInt6899, 255 - (local104 & 0xFF) << 24 | local23.lb & 0xFFFFFF, 1);
								} else {
									Static126.aClass66_5.method4972(local96, local101, local23.anInt6898, local23.anInt6899, 255 - (local104 & 0xFF) << 24 | local23.lb & 0xFFFFFF, 1);
								}
							} else if (local23.anInt6900 == 4) {
								@Pc(953) Class29 local953 = local23.method5725(Static126.aClass66_5);
								if (local953 != null) {
									local237 = local23.lb;
									@Pc(968) String local968 = local23.aString62;
									if (local23.anInt6903 != -1) {
										@Pc(981) Class4 local981 = Static380.aClass231_2.method5648(local23.anInt6903);
										local968 = local981.aString1;
										if (local968 == null) {
											local968 = "null";
										}
										if ((local981.anInt105 == 1 || local23.anInt6933 != 1) && local23.anInt6933 != -1) {
											local968 = "<col=ff9040>" + local968 + "</col> x" + Static342.method4964(local23.anInt6933);
										}
									}
									if (local23 == Static100.aClass239_4) {
										local968 = Static190.aClass267_10.method6581(Static161.anInt3239);
										local237 = local23.lb;
									}
									if (Static382.aBoolean280) {
										Static126.aClass66_5.method5023(local96, local101, local23.anInt6898 + local96, local101 - -local23.anInt6899);
									}
									local953.method4785(local23.anInt6898, local23.anInt6952, null, local23.anInt6958, 0, local23.anInt6883, Static15.aClass87Array1, local23.aBoolean439 ? 255 - (local104 & 0xFF) << 24 : -1, local237 | 255 - (local104 & 0xFF) << 24, local23.anInt6919, local23.anInt6899, 0, local968, null, local96, local101);
									if (Static382.aBoolean280) {
										Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
									}
								} else if (Static406.aBoolean463) {
									Static437.method6328(local23);
								}
							} else {
								@Pc(1156) int local1156;
								if (local23.anInt6900 == 5) {
									if (local23.anInt6937 < 0) {
										@Pc(1141) Class87 local1141;
										if (local23.anInt6903 == -1) {
											local1141 = local23.method5742(Static126.aClass66_5);
										} else {
											@Pc(1123) Class259 local1123 = local23.aBoolean450 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null;
											local1141 = Static380.aClass231_2.method5638(local23.anInt6902, local23.anInt6933, local1123, Static126.aClass66_5, local23.anInt6903, local23.anInt6882 | 0xFF000000, local23.anInt6928);
										}
										if (local1141 != null) {
											local237 = local1141.method6565();
											local1156 = local1141.method6561();
											local504 = 255 - (local104 & 0xFF) << 24 | (local23.lb == 0 ? 16777215 : local23.lb & 0xFFFFFF);
											if (local23.aBoolean441) {
												Static126.aClass66_5.method5023(local96, local101, local23.anInt6898 + local96, local101 - -local23.anInt6899);
												if (local23.anInt6884 != 0) {
													local506 = (local23.anInt6898 + local237 - 1) / local237;
													local556 = (local1156 + local23.anInt6899 - 1) / local1156;
													for (local580 = 0; local580 < local506; local580++) {
														for (local582 = 0; local582 < local556; local582++) {
															if (local23.lb == 0) {
																local1141.method6568((float) (local237 * local580 + local96) + (float) local237 / 2.0F, (float) local1156 / 2.0F + (float) (local101 + local1156 * local582), 4096, local23.anInt6884);
															} else {
																local1141.method6557((float) (local96 + local237 * local580) + (float) local237 / 2.0F, (float) (local101 + local582 * local1156) + (float) local1156 / 2.0F, 4096, local23.anInt6884, local504);
															}
														}
													}
												} else if (local23.lb == 0 && local104 == 0) {
													local1141.method6559(local96, local101, local23.anInt6898, local23.anInt6899);
												} else {
													local1141.method6573(local96, local101, local23.anInt6898, local23.anInt6899, 0, local504);
												}
												Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
											} else if (local23.lb == 0 && local104 == 0) {
												if (local23.anInt6884 != 0) {
													local1141.method6568((float) local23.anInt6898 / 2.0F + (float) local96, (float) local101 + (float) local23.anInt6899 / 2.0F, local23.anInt6898 * 4096 / local237, local23.anInt6884);
												} else if (local237 == local23.anInt6898 && local1156 == local23.anInt6899) {
													local1141.method6567(local96, local101);
												} else {
													local1141.method6564(local96, local101, local23.anInt6898, local23.anInt6899);
												}
											} else if (local23.anInt6884 != 0) {
												local1141.method6557((float) local96 + (float) local23.anInt6898 / 2.0F, (float) local101 + (float) local23.anInt6899 / 2.0F, local23.anInt6898 * 4096 / local237, local23.anInt6884, local504);
											} else if (local237 == local23.anInt6898 && local1156 == local23.anInt6899) {
												local1141.method6560(local96, local101, 0, local504);
											} else {
												local1141.method6571(local96, local101, local23.anInt6898, local23.anInt6899, 0, local504, 1);
											}
										} else if (Static406.aBoolean463) {
											Static437.method6328(local23);
										}
									} else {
										local23.method5732(Static133.aClass133_2, Static89.aClass70_1).method2640(local23.anInt6921 << 3, 0, local96, 0, local23.anInt6939 << 3, local23.anInt6898, Static126.aClass66_5, local101, local23.anInt6899);
									}
								} else if (local23.anInt6900 == 6) {
									Static421.method6169();
									@Pc(1520) Class224 local1520 = null;
									local237 = 0;
									@Pc(1627) Class131 local1627;
									@Pc(1637) Class259 local1637;
									if (local23.anInt6903 != -1) {
										@Pc(1745) Class4 local1745 = Static380.aClass231_2.method5648(local23.anInt6903);
										if (local1745 != null) {
											local1745 = local1745.method65(local23.anInt6933);
											local1627 = local23.anInt6924 == -1 ? null : Static5.aClass217_1.method5234(local23.anInt6924);
											local1637 = local23.aBoolean450 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null;
											local1520 = local1745.method72(2048, local23.anInt6929, local1627, local23.anInt6934, 1, Static126.aClass66_5, local1637, local23.anInt6932);
											if (local1520 == null) {
												Static437.method6328(local23);
											} else {
												local237 = -local1520.method5812() >> 1;
											}
										}
									} else if (local23.anInt6886 == 5) {
										local1156 = local23.anInt6910;
										if (local1156 >= 0 && local1156 < 2048) {
											@Pc(1677) Class3_Sub2_Sub1_Sub2 local1677 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local1156];
											@Pc(1692) Class131 local1692 = local23.anInt6924 == -1 ? null : Static5.aClass217_1.method5234(local23.anInt6924);
											if (local1677 != null && (local1156 == Static4.anInt7923 || Static38.method943(local1677.aString54) == local23.anInt6930)) {
												local1520 = local1677.aClass259_1.method6312(local23.anInt6929, 0, Static380.aClass231_2, local23.anInt6934, Static126.aClass66_5, Static235.aClass263_2, Static5.aClass217_1, -1, null, 0, Static270.aClass18_1, 2048, local1692, null, Static393.aClass207_1, Static145.aClass27_1, local23.anInt6932);
											}
										}
									} else if (local23.anInt6886 == 8 || local23.anInt6886 == 9) {
										@Pc(1614) Class6_Sub37 local1614 = Static375.method5604(false, local23.anInt6910);
										local1627 = local23.anInt6924 == -1 ? null : Static5.aClass217_1.method5234(local23.anInt6924);
										if (local1614 != null) {
											local1637 = local23.aBoolean450 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null;
											local1520 = local1614.method5270(Static126.aClass66_5, local23.anInt6929, local23.anInt6932, local23.anInt6934, local23.anInt6886 == 9, local1637, local23.anInt6930, local1627);
										}
									} else if (local23.anInt6924 == -1) {
										local1520 = local23.method5726(Static5.aClass217_1, -1, Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1, -1, Static235.aClass263_2, Static126.aClass66_5, null, Static270.aClass18_1, 0, Static393.aClass207_1, 2048, Static145.aClass27_1, Static380.aClass231_2);
										if (local1520 == null && Static406.aBoolean463) {
											Static437.method6328(local23);
										}
									} else {
										@Pc(1577) Class131 local1577 = Static5.aClass217_1.method5234(local23.anInt6924);
										local1520 = local23.method5726(Static5.aClass217_1, local23.anInt6929, Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1, local23.anInt6932, Static235.aClass263_2, Static126.aClass66_5, local1577, Static270.aClass18_1, local23.anInt6934, Static393.aClass207_1, 2048, Static145.aClass27_1, Static380.aClass231_2);
										if (local1520 == null && Static406.aBoolean463) {
											Static437.method6328(local23);
										}
									}
									if (local1520 != null) {
										if (local23.anInt6923 <= 0) {
											local1156 = 512;
										} else {
											local1156 = (local23.anInt6898 << 9) / local23.anInt6923;
										}
										if (local23.anInt6925 <= 0) {
											local504 = 512;
										} else {
											local504 = (local23.anInt6899 << 9) / local23.anInt6925;
										}
										local506 = local23.anInt6898 / 2 + local96 + (local23.anInt6945 * local1156 >> 9);
										local556 = (local23.anInt6915 * local504 >> 9) + local23.anInt6899 / 2 + local101;
										Static382.aClass5_4.method3842();
										Static126.aClass66_5.method5071(Static382.aClass5_4);
										Static126.aClass66_5.method5003(local506, local556, local1156, local504);
										Static126.aClass66_5.method5055((float) (local23.anInt6965 << 0), local23.aBoolean442 ? (float) (local23.anInt6909 << 0) : (float) (local23.anInt6909 << 0) * 1.5F);
										if (arg1 == -1412584499 || Static302.aBoolean345) {
											Static126.aClass66_5.method5070();
											Static126.aClass66_5.method4990();
											Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
											Static302.aBoolean345 = false;
										}
										if (local23.aBoolean445) {
											Static126.aClass66_5.method5007(false);
										}
										local580 = (local23.anInt6943 << 0) * Class145.anIntArray279[local23.anInt6885 << 3] >> 15;
										local582 = (local23.anInt6943 << 0) * Class145.anIntArray280[local23.anInt6885 << 3] >> 15;
										Static312.aClass5_5.method3836(-local23.anInt6889 << 3);
										Static312.aClass5_5.method3847(local23.anInt6935 << 3);
										Static312.aClass5_5.method3843(local23.anInt6966 << 0, local237 + local580 + (local23.anInt6962 << 0), (local23.anInt6962 << 0) + local582);
										Static312.aClass5_5.method3838(local23.anInt6885 << 3);
										if (Static382.aBoolean280) {
											Static126.aClass66_5.method5023(local96, local101, local23.anInt6898 + local96, local101 - -local23.anInt6899);
										}
										if (local23.aBoolean442) {
											local1520.method5796(Static312.aClass5_5, null, local23.anInt6943 << 0);
										} else {
											local1520.method5798(Static312.aClass5_5, null, 1);
										}
										if (Static382.aBoolean280) {
											Static126.aClass66_5.method5044(arg5, arg8, arg2, arg0);
										}
										if (local23.aBoolean445) {
											Static126.aClass66_5.method5007(true);
										}
										Static126.aClass66_5.method5055(0.0F, 0.0F);
									}
								} else if (local23.anInt6900 == 9) {
									if (local23.aBoolean446) {
										local1156 = local23.anInt6898 + local96;
										local504 = local101;
										local237 = local23.anInt6899 + local101;
									} else {
										local504 = local23.anInt6899 + local101;
										local237 = local101;
										local1156 = local96 + local23.anInt6898;
									}
									if (local23.anInt6901 == 1) {
										Static126.aClass66_5.method5037(local96, local237, local1156, local504, local23.lb, 0);
									} else {
										Static126.aClass66_5.method5016(local96, local237, local1156, local504, local23.lb, local23.anInt6901);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!jo;")
	public static Class3_Sub2 method6101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class145 local14 = local7.aClass145_1; local14 != null; local14 = local14.aClass145_2) {
			@Pc(18) Class3_Sub2 local18 = local14.aClass3_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort101 == arg1 && local18.aShort102 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
