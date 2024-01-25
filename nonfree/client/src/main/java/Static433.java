import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!pj;")
	public static final Class195 aClass195_4 = new Class195(0);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!ts;")
	public static Class239 aClass239_15 = null;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_403 = new Class123(33, 10);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method6297() {
		if (Static31.anInt889 > 0) {
			Static31.anInt889--;
		}
		if (Static381.anInt6821 > 1) {
			Static381.anInt6821--;
			Static24.anInt781 = Static144.anInt2943;
		}
		if (Static327.aBoolean352) {
			Static327.aBoolean352 = false;
			Static406.method6008();
			return;
		}
		if (!Static250.aBoolean294) {
			Static41.method963();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static417.method6120(); local35++) {
		}
		if (Static217.anInt3941 != 30) {
			return;
		}
		Static334.method4879(Static390.aClass92_138.method2373(), Static109.aClass6_Sub1_Sub1_5);
		if (Static61.aClass6_Sub30_1 == null) {
			if (Static449.method6552() >= Static46.aLong46) {
				Static61.aClass6_Sub30_1 = Static128.aClass31_1.method912(Static207.aString29);
			}
		} else if (Static61.aClass6_Sub30_1.anInt5547 != -1) {
			Static403.method5961(Static47.aClass92_23);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static61.aClass6_Sub30_1.anInt5547);
			Static61.aClass6_Sub30_1 = null;
			Static46.aLong46 = Static449.method6552() + 30000L;
		}
		@Pc(100) Class6_Sub33 local100 = (Class6_Sub33) Static124.aClass244_13.method5976();
		@Pc(118) int local118;
		@Pc(139) int local139;
		@Pc(159) int local159;
		@Pc(172) boolean local172;
		@Pc(222) int local222;
		@Pc(229) int local229;
		@Pc(241) int local241;
		if (local100 != null || Static449.method6552() - 2000L > Static11.aLong19) {
			@Pc(115) boolean local115 = false;
			local118 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
			for (@Pc(123) Class6_Sub33 local123 = (Class6_Sub33) Static337.aClass244_28.method5976(); local123 != null && Static109.aClass6_Sub1_Sub1_5.anInt7898 - local118 < 240; local123 = (Class6_Sub33) Static337.aClass244_28.method5964()) {
				local123.method6525();
				local139 = local123.method5287();
				if (local139 < 0) {
					local139 = 0;
				} else if (local139 > 65534) {
					local139 = 65534;
				}
				local159 = local123.method5290();
				if (local159 < 0) {
					local159 = 0;
				} else if (local159 > 65534) {
					local159 = 65534;
				}
				local172 = false;
				if (local123.method5287() == -1 && local123.method5290() == -1) {
					local159 = -1;
					local172 = true;
					local139 = -1;
				}
				if (local159 != Static426.anInt7593 || Static298.anInt5281 != local139) {
					if (!local115) {
						Static403.method5961(Static355.aClass92_125);
						Static109.aClass6_Sub1_Sub1_5.method6439(0);
						local115 = true;
						local118 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
					}
					local222 = local159 - Static426.anInt7593;
					Static426.anInt7593 = local159;
					local229 = local139 - Static298.anInt5281;
					Static298.anInt5281 = local139;
					local241 = (int) ((local123.method5294() - Static11.aLong19) / 20L);
					if (local241 < 8 && local222 >= -32 && local222 <= 31 && local229 >= -32 && local229 <= 31) {
						local229 += 32;
						local222 += 32;
						Static109.aClass6_Sub1_Sub1_5.method6453(local229 + (local222 << 6) + (local241 << 12));
					} else if (local241 < 32 && local222 >= -128 && local222 <= 127 && local229 >= -128 && local229 <= 127) {
						local222 += 128;
						Static109.aClass6_Sub1_Sub1_5.method6439(local241 + 128);
						local229 += 128;
						Static109.aClass6_Sub1_Sub1_5.method6453(local229 + (local222 << 8));
					} else if (local241 < 32) {
						Static109.aClass6_Sub1_Sub1_5.method6439(local241 + 192);
						if (local172) {
							Static109.aClass6_Sub1_Sub1_5.method6461(Integer.MIN_VALUE);
						} else {
							Static109.aClass6_Sub1_Sub1_5.method6461(local139 << 16 | local159);
						}
					} else {
						Static109.aClass6_Sub1_Sub1_5.method6453(local241 + 57344);
						if (local172) {
							Static109.aClass6_Sub1_Sub1_5.method6461(Integer.MIN_VALUE);
						} else {
							Static109.aClass6_Sub1_Sub1_5.method6461(local159 | local139 << 16);
						}
					}
					Static11.aLong19 = local123.method5294();
				}
			}
			if (local115) {
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local118);
			}
		}
		@Pc(414) int local414;
		@Pc(463) int local463;
		if (local100 != null) {
			@Pc(398) long local398 = (local100.method5294() - Static336.aLong173) / 50L;
			if (local398 > 32767L) {
				local398 = 32767L;
			}
			Static336.aLong173 = local100.method5294();
			local414 = local100.method5287();
			if (local414 < 0) {
				local414 = 0;
			} else if (local414 > 65535) {
				local414 = 65535;
			}
			local139 = local100.method5290();
			if (local139 < 0) {
				local139 = 0;
			} else if (local139 > 65535) {
				local139 = 65535;
			}
			@Pc(450) byte local450 = 0;
			if (local100.method5293() == 2) {
				local450 = 1;
			}
			Static403.method5961(Static337.aClass92_118);
			local463 = (int) local398;
			Static109.aClass6_Sub1_Sub1_5.method6484(local139 | local414 << 16);
			Static109.aClass6_Sub1_Sub1_5.method6453(local450 << 15 | local463);
		}
		@Pc(487) int local487;
		if (Static207.anInt3852 > 0) {
			local487 = 0;
			for (local118 = 0; local118 < Static207.anInt3852; local118++) {
				if (Static196.aClass40Array1[local118].method2678()) {
					local487++;
				}
			}
			if (local487 > 0) {
				Static403.method5961(Static197.aClass92_67);
				if (local487 > 75) {
					local487 = 75;
				}
				Static109.aClass6_Sub1_Sub1_5.method6439(local487 * 3);
				for (local414 = 0; local414 < Static207.anInt3852; local414++) {
					@Pc(539) Class40 local539 = Static196.aClass40Array1[local414];
					if (local539.method2678()) {
						@Pc(553) long local553 = (local539.method2680() - Static150.aLong89) / 50L;
						Static150.aLong89 = local539.method2680();
						if (local553 > 65535L) {
							local553 = 65535L;
						}
						Static109.aClass6_Sub1_Sub1_5.method6439(local539.method2681());
						Static109.aClass6_Sub1_Sub1_5.method6453((int) local553);
					}
				}
			}
		}
		if (Static350.anInt6295 > 0) {
			Static350.anInt6295--;
		}
		if (Static65.aBoolean151 && Static350.anInt6295 <= 0) {
			Static350.anInt6295 = 20;
			Static65.aBoolean151 = false;
			Static403.method5961(Static373.aClass92_134);
			Static109.aClass6_Sub1_Sub1_5.method6464((int) Static265.aFloat51 >> 3);
			Static109.aClass6_Sub1_Sub1_5.method6464((int) Static165.aFloat28 >> 3);
		}
		if (Static185.aBoolean236 && !Static94.aBoolean144) {
			Static94.aBoolean144 = true;
			Static403.method5961(Static87.aClass92_33);
			Static109.aClass6_Sub1_Sub1_5.method6439(1);
		}
		if (!Static185.aBoolean236 && Static94.aBoolean144) {
			Static94.aBoolean144 = false;
			Static403.method5961(Static87.aClass92_33);
			Static109.aClass6_Sub1_Sub1_5.method6439(0);
		}
		if (!Static38.aBoolean93) {
			Static403.method5961(Static108.aClass92_39);
			Static109.aClass6_Sub1_Sub1_5.method6439(0);
			local487 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
			@Pc(688) Class6_Sub1 local688 = Static291.aClass28_Sub1_1.method833();
			Static109.aClass6_Sub1_Sub1_5.method6440(local688.aByteArray96, local688.anInt7898);
			Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local487);
			Static38.aBoolean93 = true;
		}
		if (Static409.aClass101ArrayArrayArray3 != null) {
			if (Static429.anInt7656 == 2) {
				Static327.method4728();
			} else if (Static429.anInt7656 == 3) {
				Static445.method6521();
			}
		}
		if (Static305.aBoolean347) {
			Static305.aBoolean347 = false;
		} else {
			Static408.aFloat98 /= 2.0F;
		}
		if (Static293.aBoolean13) {
			Static293.aBoolean13 = false;
		} else {
			Static29.aFloat4 /= 2.0F;
		}
		Static392.method4239();
		if (Static217.anInt3941 != 30) {
			return;
		}
		Static118.method2055();
		Static220.method3309();
		Static195.method5948();
		Static89.method1608();
		Static40.anInt1173++;
		if (Static40.anInt1173 > 750) {
			Static406.method6008();
			return;
		}
		Static133.method5723();
		Static129.method2309();
		Static237.method3662();
		for (local487 = Static393.aClass207_1.method4636(true); local487 != -1; local487 = Static393.aClass207_1.method4636(false)) {
			Static41.method961(local487);
			Static334.anIntArray397[Static383.anInt6834++ & 0x1F] = local487;
		}
		@Pc(862) Class239 local862;
		for (@Pc(814) Class6_Sub2_Sub7 local814 = Static307.method4513(); local814 != null; local814 = Static307.method4513()) {
			local414 = local814.method3090();
			local139 = local814.method3089();
			if (local414 == 1) {
				Static331.anIntArray389[local139] = local814.anInt3749;
				Static304.aBoolean346 |= Static384.aBooleanArray25[local139];
				Static442.anIntArray547[Static147.anInt2996++ & 0x1F] = local139;
			} else if (local414 == 2) {
				Static172.aStringArray23[local139] = local814.aString28;
				Static33.anIntArray63[Static284.anInt5109++ & 0x1F] = local139;
			} else if (local414 == 3) {
				local862 = Static121.method2092(local139);
				if (!local814.aString28.equals(local862.aString62)) {
					local862.aString62 = local814.aString28;
					Static437.method6328(local862);
				}
			} else if (local414 == 4) {
				local862 = Static121.method2092(local139);
				local463 = local814.anInt3749;
				local222 = local814.anInt3744;
				local229 = local814.anInt3746;
				if (local463 != local862.anInt6886 || local862.anInt6910 != local222 || local862.anInt6930 != local229) {
					local862.anInt6930 = local229;
					local862.anInt6910 = local222;
					local862.anInt6886 = local463;
					Static437.method6328(local862);
				}
			} else if (local414 == 5) {
				local862 = Static121.method2092(local139);
				if (local814.anInt3749 != local862.anInt6924 || local814.anInt3749 == -1) {
					local862.anInt6932 = 0;
					local862.anInt6934 = 0;
					local862.anInt6924 = local814.anInt3749;
					local862.anInt6929 = 1;
					Static437.method6328(local862);
				}
			} else if (local414 == 6) {
				local159 = local814.anInt3749;
				local463 = local159 >> 10 & 0x1F;
				local222 = local159 >> 5 & 0x1F;
				local229 = local159 & 0x1F;
				local241 = (local229 << 3) + ((local463 << 19) + (local222 << 11));
				@Pc(928) Class239 local928 = Static121.method2092(local139);
				if (local928.lb != local241) {
					local928.lb = local241;
					Static437.method6328(local928);
				}
			} else if (local414 == 7) {
				local862 = Static121.method2092(local139);
				local172 = local814.anInt3749 == 1;
				if (local172 != local862.aBoolean438) {
					local862.aBoolean438 = local172;
					Static437.method6328(local862);
				}
			} else if (local414 == 8) {
				local862 = Static121.method2092(local139);
				if (local814.anInt3749 != local862.anInt6885 || local862.anInt6935 != local814.anInt3744 || local862.anInt6943 != local814.anInt3746) {
					local862.anInt6943 = local814.anInt3746;
					local862.anInt6885 = local814.anInt3749;
					local862.anInt6935 = local814.anInt3744;
					if (local862.anInt6903 != -1) {
						if (local862.anInt6923 > 0) {
							local862.anInt6943 = local862.anInt6943 * 32 / local862.anInt6923;
						} else if (local862.anInt6896 > 0) {
							local862.anInt6943 = local862.anInt6943 * 32 / local862.anInt6896;
						}
					}
					Static437.method6328(local862);
				}
			} else if (local414 == 9) {
				local862 = Static121.method2092(local139);
				if (local862.anInt6903 != local814.anInt3749 || local862.anInt6933 != local814.anInt3744) {
					local862.anInt6903 = local814.anInt3749;
					local862.anInt6933 = local814.anInt3744;
					Static437.method6328(local862);
				}
			} else if (local414 == 10) {
				local862 = Static121.method2092(local139);
				if (local862.anInt6966 != local814.anInt3749 || local862.anInt6962 != local814.anInt3744 || local862.anInt6889 != local814.anInt3746) {
					local862.anInt6966 = local814.anInt3749;
					local862.anInt6889 = local814.anInt3746;
					local862.anInt6962 = local814.anInt3744;
					Static437.method6328(local862);
				}
			} else if (local414 == 11) {
				local862 = Static121.method2092(local139);
				local862.anInt6905 = local862.anInt6918 = local814.anInt3744;
				local862.aByte98 = 0;
				local862.anInt6922 = local862.anInt6951 = local814.anInt3749;
				local862.aByte100 = 0;
				Static437.method6328(local862);
			} else if (local414 == 12) {
				local862 = Static121.method2092(local139);
				local463 = local814.anInt3749;
				if (local862 != null && local862.anInt6900 == 0) {
					if (local862.anInt6941 - local862.anInt6899 < local463) {
						local463 = local862.anInt6941 - local862.anInt6899;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local862.anInt6887 != local463) {
						local862.anInt6887 = local463;
						Static437.method6328(local862);
					}
				}
			} else if (local414 == 14) {
				local862 = Static121.method2092(local139);
				local862.anInt6920 = local814.anInt3749;
			} else if (local414 == 15) {
				Static114.anInt5655 = local814.anInt3749;
				Static409.aBoolean467 = true;
				Static346.anInt6243 = local814.anInt3744;
			} else if (local414 == 16) {
				local862 = Static121.method2092(local139);
				local862.anInt6892 = local814.anInt3749;
			}
		}
		Static254.anInt4641++;
		if (Static312.anInt5455 != 0) {
			Static49.anInt1319 += 20;
			if (Static49.anInt1319 >= 400) {
				Static312.anInt5455 = 0;
			}
		}
		if (Static73.aClass239_1 != null) {
			Static376.anInt6758++;
			if (Static376.anInt6758 >= 15) {
				Static437.method6328(Static73.aClass239_1);
				Static73.aClass239_1 = null;
			}
		}
		Static158.aClass239_5 = null;
		Static396.aClass239_10 = null;
		Static335.aBoolean364 = false;
		Static14.aBoolean19 = false;
		Static272.method4103(null, -1, -1);
		Static97.method1810(null, -1, -1);
		if (!Static174.aBoolean224) {
			Static327.anInt5630 = -1;
		}
		Static86.method823();
		Static144.anInt2943++;
		if (Static339.aBoolean367) {
			Static403.method5961(Static418.aClass92_146);
			Static109.aClass6_Sub1_Sub1_5.method6484(Static289.anInt5183 | Static336.anInt5846 << 14 | Static110.anInt6978 << 28);
			Static339.aBoolean367 = false;
		}
		while (true) {
			@Pc(1441) Class6_Sub42 local1441;
			@Pc(1446) Class239 local1446;
			do {
				local1441 = (Class6_Sub42) Static17.aClass244_5.method5973();
				if (local1441 == null) {
					while (true) {
						do {
							local1441 = (Class6_Sub42) Static409.aClass244_44.method5973();
							if (local1441 == null) {
								while (true) {
									do {
										local1441 = (Class6_Sub42) Static376.aClass244_40.method5973();
										if (local1441 == null) {
											if (Static396.aClass239_10 == null) {
												Static378.anInt6770 = 0;
											}
											if (Static240.aClass239_8 != null) {
												Static172.method2860();
											}
											if (Static291.anInt5199 > 0 && Static54.aClass187_1.method4602(82) && Static54.aClass187_1.method4602(81) && Static43.anInt1190 != 0) {
												local414 = Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 - Static43.anInt1190;
												if (local414 < 0) {
													local414 = 0;
												} else if (local414 > 3) {
													local414 = 3;
												}
												Static235.method3638(Static348.anInt6273 + Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0], Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0] + Static2.anInt6396, local414);
											}
											Static83.method1573();
											for (local414 = 0; local414 < 5; local414++) {
												@Pc(1638) int local1638 = Static194.anIntArray237[local414]++;
											}
											if (Static304.aBoolean346 && Static449.method6552() - 60000L > Static43.aLong45) {
												Static327.method4731();
											}
											Static210.anInt3895++;
											if (Static210.anInt3895 > 500) {
												Static210.anInt3895 = 0;
												local139 = (int) (Math.random() * 8.0D);
												if ((local139 & 0x1) == 1) {
													Static273.anInt4889 += Static103.anInt2237;
												}
												if ((local139 & 0x4) == 4) {
													Static176.anInt3528 += Static153.anInt3144;
												}
												if ((local139 & 0x2) == 2) {
													Static8.anInt328 += Static230.anInt4198;
												}
											}
											if (Static273.anInt4889 < -50) {
												Static103.anInt2237 = 2;
											}
											if (Static8.anInt328 < -55) {
												Static230.anInt4198 = 2;
											}
											if (Static273.anInt4889 > 50) {
												Static103.anInt2237 = -2;
											}
											if (Static8.anInt328 > 55) {
												Static230.anInt4198 = -2;
											}
											if (Static176.anInt3528 < -40) {
												Static153.anInt3144 = 1;
											}
											Static242.anInt4492++;
											if (Static176.anInt3528 > 40) {
												Static153.anInt3144 = -1;
											}
											if (Static242.anInt4492 > 500) {
												Static242.anInt4492 = 0;
												local139 = (int) (Math.random() * 8.0D);
												if ((local139 & 0x1) == 1) {
													Static439.anInt418 += Static269.anInt4874;
												}
												if ((local139 & 0x2) == 2) {
													Static280.anInt5012 += Static381.anInt6820;
												}
											}
											if (Static439.anInt418 < -60) {
												Static269.anInt4874 = 2;
											}
											if (Static439.anInt418 > 60) {
												Static269.anInt4874 = -2;
											}
											if (Static280.anInt5012 < -20) {
												Static381.anInt6820 = 1;
											}
											Static258.anInt4690++;
											if (Static280.anInt5012 > 10) {
												Static381.anInt6820 = -1;
											}
											if (Static258.anInt4690 > 50) {
												Static403.method5961(Static450.aClass92_155);
											}
											if (Static268.aBoolean303) {
												Static321.method4632();
												Static268.aBoolean303 = false;
											}
											try {
												if (Static177.aClass73_6 != null && Static109.aClass6_Sub1_Sub1_5.anInt7898 > 0) {
													Static76.anInt7823 += Static109.aClass6_Sub1_Sub1_5.anInt7898;
													Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
													Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
													Static258.anInt4690 = 0;
													return;
												}
												return;
											} catch (@Pc(1851) IOException local1851) {
												Static406.method6008();
												return;
											}
										}
										local1446 = local1441.aClass239_13;
										if (local1446.anInt6907 < 0) {
											break;
										}
										local862 = Static121.method2092(local1446.anInt6895);
									} while (local862 == null || local862.aClass239Array2 == null || local1446.anInt6907 >= local862.aClass239Array2.length || local1446 != local862.aClass239Array2[local1446.anInt6907]);
									Static166.method2744(local1441);
								}
							}
							local1446 = local1441.aClass239_13;
							if (local1446.anInt6907 < 0) {
								break;
							}
							local862 = Static121.method2092(local1446.anInt6895);
						} while (local862 == null || local862.aClass239Array2 == null || local862.aClass239Array2.length <= local1446.anInt6907 || local1446 != local862.aClass239Array2[local1446.anInt6907]);
						Static166.method2744(local1441);
					}
				}
				local1446 = local1441.aClass239_13;
				if (local1446.anInt6907 < 0) {
					break;
				}
				local862 = Static121.method2092(local1446.anInt6895);
			} while (local862 == null || local862.aClass239Array2 == null || local1446.anInt6907 >= local862.aClass239Array2.length || local1446 != local862.aClass239Array2[local1446.anInt6907]);
			Static166.method2744(local1441);
		}
	}
}
