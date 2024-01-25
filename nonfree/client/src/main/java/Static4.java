import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!r;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[I")
	public static final int[] anIntArray7 = new int[250];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "F")
	public static float aFloat1 = 0.0F;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method57(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static159.aClass58_7.method1767(Static48.aClass33_26.method797(Static131.anInt2839));
		@Pc(24) int local24;
		for (@Pc(18) Class3_Sub44 local18 = (Class3_Sub44) Static187.aClass130_15.method3543(); local18 != null; local18 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			local24 = Static373.method5518(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static151.anInt3123 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (Static318.anInt5754 < local13 + local58) {
			local58 = Static318.anInt5754 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(78) int local78 = arg1;
		if (arg1 + local24 > Static447.anInt7372) {
			local78 = Static447.anInt7372 - local24;
		}
		if (local78 < 0) {
			local78 = 0;
		}
		Static50.anInt1065 = local58;
		Static324.anInt5822 = local13;
		Static32.anInt717 = (Static490.aBoolean625 ? 26 : 22) + Static151.anInt3123 * 16;
		Static255.aBoolean352 = true;
		Static343.anInt6039 = local78;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII[Lclient!lk;II)V")
	public static void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class203[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		aClass43_1.da(arg8, arg3, arg4, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(19) Class203 local19 = arg6[local13];
			if (local19 != null && (local19.anInt5518 == arg5 || arg5 == -1412584499 && Static265.aClass203_82 == local19)) {
				@Pc(65) int local65;
				if (arg1 == -1) {
					Class55_Sub2_Sub1.aRectangleArray1[Static591.anInt9382].setBounds(local19.anInt5527 + arg7, arg0 + local19.anInt5440, local19.anInt5513, local19.anInt5476);
					local65 = Static591.anInt9382++;
				} else {
					local65 = arg1;
				}
				local19.anInt5514 = Static305.anInt5560;
				local19.anInt5457 = local65;
				if (!Static69.method1646(local19)) {
					if (local19.anInt5510 != 0) {
						Static205.method3669(local19);
					}
					@Pc(92) int local92 = local19.anInt5527 + arg7;
					@Pc(97) int local97 = arg0 + local19.anInt5440;
					@Pc(100) int local100 = local19.anInt5495;
					if (Static393.aBoolean543 && (Static69.method1651(local19).anInt730 != 0 || local19.anInt5473 == 0) && local100 > 127) {
						local100 = 127;
					}
					@Pc(155) int local155;
					@Pc(159) int local159;
					if (local19 == Static265.aClass203_82) {
						if (arg5 != -1412584499 && (local19.anInt5508 == Static28.anInt682 || local19.anInt5508 == Static422.anInt7063)) {
							Static431.anInt3510 = arg0;
							Static533.anInt8146 = arg7;
							Static211.aClass203Array1 = arg6;
							continue;
						}
						if (Static16.aBoolean22 && Static297.aBoolean432) {
							local155 = Static563.aClass156_1.method5689();
							local159 = Static563.aClass156_1.method5690();
							local155 -= Static419.anInt8466;
							local159 -= Static550.anInt7641;
							if (local155 < Static383.anInt6588) {
								local155 = Static383.anInt6588;
							}
							if (Static11.anInt125 > local159) {
								local159 = Static11.anInt125;
							}
							if (local155 + local19.anInt5513 > Static383.anInt6588 + Static215.aClass203_73.anInt5513) {
								local155 = Static383.anInt6588 + Static215.aClass203_73.anInt5513 - local19.anInt5513;
							}
							if (Static11.anInt125 + Static215.aClass203_73.anInt5476 < local19.anInt5476 + local159) {
								local159 = Static11.anInt125 + Static215.aClass203_73.anInt5476 - local19.anInt5476;
							}
							local92 = local155;
							local97 = local159;
						}
						if (Static422.anInt7063 == local19.anInt5508) {
							local100 = 128;
						}
					}
					@Pc(296) int local296;
					@Pc(285) int local285;
					@Pc(247) int local247;
					@Pc(252) int local252;
					if (local19.anInt5473 == 2) {
						local296 = arg4;
						local285 = arg2;
						local159 = arg3;
						local155 = arg8;
					} else {
						local247 = local19.anInt5513 + local92;
						local252 = local19.anInt5476 + local97;
						local155 = local92 > arg8 ? local92 : arg8;
						if (local19.anInt5473 == 9) {
							local252++;
							local247++;
						}
						local159 = arg3 >= local97 ? arg3 : local97;
						local285 = arg2 <= local252 ? arg2 : local252;
						local296 = arg4 <= local247 ? arg4 : local247;
					}
					if (local296 > local155 && local159 < local285) {
						@Pc(502) int local502;
						@Pc(537) int local537;
						@Pc(550) int local550;
						@Pc(645) int local645;
						@Pc(535) int local535;
						if (local19.anInt5510 != 0) {
							if (local19.anInt5510 == Static519.anInt8233 || local19.anInt5510 == Static530.anInt8348) {
								Static89.method2012(local92, local97, local19.anInt5513, local19.anInt5476, Static530.anInt8348 == local19.anInt5510);
								Static253.aBooleanArray17[local65] = true;
								aClass43_1.da(arg8, arg3, arg4, arg2);
								continue;
							}
							if (Static591.anInt9388 == local19.anInt5510) {
								if (local19.method4780(aClass43_1) != null) {
									Static66.method1526();
									Static220.method3815(local92, aClass43_1, local97, local19);
									Static97.aBooleanArray4[local65] = true;
									aClass43_1.da(arg8, arg3, arg4, arg2);
								}
								continue;
							}
							if (local19.anInt5510 == Static202.anInt4103) {
								if (local19.method4780(aClass43_1) != null) {
									Static472.method6500(local97, local92, local19);
									Static97.aBooleanArray4[local65] = true;
									aClass43_1.da(arg8, arg3, arg4, arg2);
								}
								continue;
							}
							if (Static477.anInt7750 == local19.anInt5510) {
								Static308.method4828(local19.anInt5513, local19.anInt5476, Static56.anInterface8_3, aClass43_1, local92, local97);
								Static253.aBooleanArray17[local65] = true;
								aClass43_1.da(arg8, arg3, arg4, arg2);
								continue;
							}
							if (Static311.anInt5618 == local19.anInt5510) {
								Static19.method424(aClass43_1, local19.anInt5476, local92, local97, local19.anInt5513);
								Static253.aBooleanArray17[local65] = true;
								aClass43_1.da(arg8, arg3, arg4, arg2);
								continue;
							}
							if (local19.anInt5510 == Static527.anInt8328) {
								if (!Static537.aBoolean334 && !Static202.aBoolean317) {
									continue;
								}
								local247 = local19.anInt5513 + local92;
								local252 = local97 + 15;
								if (Static537.aBoolean334) {
									local502 = -256;
									if (Static306.anInt5563 < 20) {
										local502 = -65536;
									}
									Static49.aClass117_1.method7659(local502, local247, -1, "Fps:" + Static306.anInt5563, local252);
									local252 += 15;
									@Pc(526) Runtime local526 = Runtime.getRuntime();
									local535 = (int) ((local526.totalMemory() - local526.freeMemory()) / 1024L);
									local537 = -256;
									if (local535 > 98304) {
										local537 = -65536;
										if (Static367.aBoolean520) {
											Static227.method3894();
											for (local550 = 0; local550 < 10; local550++) {
												System.gc();
											}
											local535 = (int) ((local526.totalMemory() - local526.freeMemory()) / 1024L);
											if (local535 > 65536) {
												Static118.method2471("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static49.aClass117_1.method7659(local537, local247, -1, "Mem:" + local535 + "k", local252);
									local252 += 15;
									Static49.aClass117_1.method7659(-256, local247, -1, "In:" + Static257.anInt4912 + "B/s Out:" + Static347.anInt6095 + "B/s", local252);
									local252 += 15;
									local550 = aClass43_1.b() / 1024;
									Static49.aClass117_1.method7659(local550 <= 65536 ? -256 : -65536, local247, -1, "Offheap:" + local550 + "k", local252);
									local252 += 15;
									local645 = 0;
									@Pc(647) int local647 = 0;
									@Pc(649) int local649 = 0;
									for (@Pc(651) int local651 = 0; local651 < 35; local651++) {
										if (Static478.aClass303_Sub1Array2[local651] != null) {
											local645 += Static478.aClass303_Sub1Array2[local651].method6959();
											local647 += Static478.aClass303_Sub1Array2[local651].method6961();
											local649 += Static478.aClass303_Sub1Array2[local651].method6962();
										}
									}
									@Pc(691) int local691 = local649 * 100 / local645;
									@Pc(697) int local697 = local647 * 10000 / local645;
									@Pc(717) String local717 = "Cache:" + Static585.method7725(true, 2, (long) local697, 0) + "% (" + local691 + "%)";
									Static410.aClass117_8.method7659(-256, local247, -1, local717, local252);
									local252 += 12;
								}
								if (Static135.anInt2895 > 0) {
									Static410.aClass117_8.method7659(-256, local247, -1, "Particles: " + Static596.anInt9426 + " / " + Static135.anInt2895, local252);
								}
								local252 += 12;
								if (Static202.aBoolean317) {
									Static410.aClass117_8.method7659(-256, local247, -1, "Polys: " + aClass43_1.DA() + " Models: " + aClass43_1.T(), local252);
									local252 += 12;
									Static410.aClass117_8.method7659(-256, local247, -1, "Ls: " + Static160.anInt3208 + " La: " + Static124.anInt3632 + " NPC: " + Static373.anInt6340 + " Pl: " + Static433.anInt7164, local252);
									local252 += 12;
									Static270.method4387();
								}
								Static253.aBooleanArray17[local65] = true;
								continue;
							}
						}
						if (local19.anInt5473 == 0) {
							if (local19.anInt5510 == Static82.anInt2181 && aClass43_1.method7216()) {
								aClass43_1.method7214(local92, local97, local19.anInt5513, local19.anInt5476);
							}
							method58(local97 - local19.anInt5512, local65, local285, local159, local296, local19.anInt5531, arg6, local92 - local19.anInt5466, local155);
							if (local19.aClass203Array2 != null) {
								method58(local97 - local19.anInt5512, local65, local285, local159, local296, local19.anInt5531, local19.aClass203Array2, local92 - local19.anInt5466, local155);
							}
							@Pc(875) Class3_Sub28 local875 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local19.anInt5531);
							if (local875 != null) {
								Static138.method2654(local65, local875.anInt5333, local159, local285, local92, local97, local155, local296);
							}
							if (local19.anInt5510 == Static82.anInt2181 && aClass43_1.method7216()) {
								aClass43_1.method7171();
							}
							aClass43_1.da(arg8, arg3, arg4, arg2);
						}
						if (Static332.aBooleanArray24[local65] || Static309.anInt2464 > 1) {
							if (local19.anInt5473 == 3) {
								if (local100 == 0) {
									if (local19.aBoolean441) {
										aClass43_1.J(local92, local97, local19.anInt5513, local19.anInt5476, local19.anInt5450, 0);
									} else {
										aClass43_1.method7170(local92, local97, local19.anInt5513, local19.anInt5476, local19.anInt5450, 0);
									}
								} else if (local19.aBoolean441) {
									aClass43_1.J(local92, local97, local19.anInt5513, local19.anInt5476, local19.anInt5450 & 0xFFFFFF | 255 - (local100 & 0xFF) << 24, 1);
								} else {
									aClass43_1.method7170(local92, local97, local19.anInt5513, local19.anInt5476, local19.anInt5450 & 0xFFFFFF | 255 - (local100 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt5473 == 4) {
								@Pc(1016) Class117 local1016 = local19.method4770(aClass43_1);
								if (local1016 != null) {
									local252 = local19.anInt5450;
									@Pc(1031) String local1031 = local19.aString75;
									if (local19.anInt5507 != -1) {
										@Pc(1041) Class339 local1041 = Static517.aClass145_1.method3798(local19.anInt5507);
										local1031 = local1041.aString120;
										if (local1031 == null) {
											local1031 = "null";
										}
										if ((local1041.anInt8789 == 1 || local19.anInt5497 != 1) && local19.anInt5497 != -1) {
											local1031 = "<col=ff9040>" + local1031 + "</col> x" + Static406.method5892(local19.anInt5497);
										}
									}
									if (Static48.aClass203_24 == local19) {
										local1031 = Static48.aClass33_33.method797(Static131.anInt2839);
										local252 = local19.anInt5450;
									}
									if (Static438.aBoolean339) {
										aClass43_1.V(local92, local97, local19.anInt5513 + local92, local19.anInt5476 + local97);
									}
									local1016.method7651(local19.anInt5447, local19.anInt5485, null, local92, local1031, 0, 0, Static90.aClass46Array4, local19.aBoolean444 ? 255 - (local100 & 0xFF) << 24 : -1, local252 | 255 - (local100 & 0xFF) << 24, local97, local19.anInt5483, null, local19.anInt5476, local19.anInt5513, local19.anInt5454);
									if (Static438.aBoolean339) {
										aClass43_1.da(arg8, arg3, arg4, arg2);
									}
								} else if (Static80.aBoolean705) {
									Static138.method2656(local19);
								}
							} else {
								@Pc(1233) int local1233;
								if (local19.anInt5473 == 5) {
									if (local19.anInt5533 < 0) {
										@Pc(1196) Class46 local1196;
										if (local19.anInt5507 == -1) {
											local1196 = local19.method4772(aClass43_1);
										} else {
											@Pc(1178) Class75 local1178 = local19.aBoolean442 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null;
											local1196 = Static517.aClass145_1.method3793(local19.anInt5497, local19.anInt5503, aClass43_1, local1178, local19.anInt5456 | 0xFF000000, local19.anInt5467, local19.anInt5507);
										}
										if (local1196 != null) {
											local252 = local1196.A();
											local502 = local1196.ca();
											local1233 = (local19.anInt5450 == 0 ? 16777215 : local19.anInt5450 & 0xFFFFFF) | 255 - (local100 & 0xFF) << 24;
											if (local19.aBoolean437) {
												aClass43_1.V(local92, local97, local92 + local19.anInt5513, local97 - -local19.anInt5476);
												if (local19.anInt5519 != 0) {
													local535 = (local252 + local19.anInt5513 - 1) / local252;
													local537 = (local502 + local19.anInt5476 - 1) / local502;
													for (local550 = 0; local550 < local535; local550++) {
														for (local645 = 0; local645 < local537; local645++) {
															if (local19.anInt5450 == 0) {
																local1196.method7611((float) local252 / 2.0F + (float) (local92 + local550 * local252), (float) local502 / 2.0F + (float) (local645 * local502 + local97), 4096, local19.anInt5519);
															} else {
																local1196.method7609((float) (local550 * local252 + local92) + (float) local252 / 2.0F, (float) local502 / 2.0F + (float) (local502 * local645 + local97), 4096, local19.anInt5519, local1233);
															}
														}
													}
												} else if (local19.anInt5450 == 0 && local100 == 0) {
													local1196.method7612(local92, local97, local19.anInt5513, local19.anInt5476);
												} else {
													local1196.DA(local92, local97, local19.anInt5513, local19.anInt5476, 0, local1233, 1);
												}
												aClass43_1.da(arg8, arg3, arg4, arg2);
											} else if (local19.anInt5450 == 0 && local100 == 0) {
												if (local19.anInt5519 != 0) {
													local1196.method7611((float) local92 + (float) local19.anInt5513 / 2.0F, (float) local19.anInt5476 / 2.0F + (float) local97, local19.anInt5513 * 4096 / local252, local19.anInt5519);
												} else if (local252 == local19.anInt5513 && local502 == local19.anInt5476) {
													local1196.method7606(local92, local97);
												} else {
													local1196.method7616(local92, local97, local19.anInt5513, local19.anInt5476);
												}
											} else if (local19.anInt5519 != 0) {
												local1196.method7609((float) local92 + (float) local19.anInt5513 / 2.0F, (float) local19.anInt5476 / 2.0F + (float) local97, local19.anInt5513 * 4096 / local252, local19.anInt5519, local1233);
											} else if (local252 == local19.anInt5513 && local502 == local19.anInt5476) {
												local1196.V(local92, local97, 0, local1233, 1);
											} else {
												local1196.method7613(local92, local97, local19.anInt5513, local19.anInt5476, 0, local1233, 1);
											}
										} else if (Static80.aBoolean705) {
											Static138.method2656(local19);
										}
									} else {
										local19.method4782(Static125.aClass349_1, Static257.aClass182_1).method5529(local92, local97, local19.anInt5513, local19.anInt5472 << 3, local19.anInt5487 << 3, 0, local19.anInt5476, aClass43_1, 0);
									}
								} else if (local19.anInt5473 == 6) {
									Static589.method7755();
									@Pc(1572) Class57 local1572 = null;
									local252 = 0;
									@Pc(1746) Class17 local1746;
									@Pc(1756) Class75 local1756;
									if (local19.anInt5507 != -1) {
										@Pc(1786) Class339 local1786 = Static517.aClass145_1.method3798(local19.anInt5507);
										if (local1786 != null) {
											local1786 = local1786.method7315(local19.anInt5497);
											local1746 = local19.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(local19.anInt5505);
											local1756 = local19.aBoolean442 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null;
											local1572 = local1786.method7316(local1746, 2048, local19.anInt5481, local19.anInt5511, aClass43_1, local19.anInt5458, 1, local1756);
											if (local1572 == null) {
												Static138.method2656(local19);
											} else {
												local252 = -local1572.J() >> 1;
											}
										}
									} else if (local19.anInt5448 == 5) {
										local502 = local19.anInt5523;
										if (local502 >= 0 && local502 < 2048) {
											@Pc(1600) Class9_Sub1_Sub1_Sub2_Sub2 local1600 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local502];
											@Pc(1613) Class17 local1613 = local19.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(local19.anInt5505);
											if (local1600 != null && (Static502.anInt8011 == local502 || Static128.method2550(local1600.aString94) == local19.anInt5491)) {
												local1572 = local1600.aClass75_1.method2378(0, Static107.aClass352_2, local19.anInt5511, local19.anInt5458, Static427.aClass56_1, Static517.aClass145_1, null, Static330.aClass279_2, local1613, aClass43_1, Static510.aClass284_2, 2048, 0, Static363.aClass135_1, -1, local19.anInt5481, null);
											}
										}
									} else if (local19.anInt5448 == 8 || local19.anInt5448 == 9) {
										@Pc(1734) Class3_Sub48 local1734 = Static144.method2729(false, local19.anInt5523);
										local1746 = local19.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(local19.anInt5505);
										if (local1734 != null) {
											local1756 = local19.aBoolean442 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null;
											local1572 = local1734.method7571(aClass43_1, local19.anInt5491, local1756, local19.anInt5458, local19.anInt5511, local19.anInt5448 == 9, local19.anInt5481, local1746);
										}
									} else if (local19.anInt5505 == -1) {
										local1572 = local19.method4771(Static510.aClass284_2, 2048, null, aClass43_1, Static517.aClass145_1, 0, Static330.aClass279_2, -1, Static107.aClass352_2, Static363.aClass135_1, Static427.aClass56_1, -1, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1);
										if (local1572 == null && Static80.aBoolean705) {
											Static138.method2656(local19);
										}
									} else {
										@Pc(1699) Class17 local1699 = Static330.aClass279_2.method6216(local19.anInt5505);
										local1572 = local19.method4771(Static510.aClass284_2, 2048, local1699, aClass43_1, Static517.aClass145_1, local19.anInt5511, Static330.aClass279_2, local19.anInt5458, Static107.aClass352_2, Static363.aClass135_1, Static427.aClass56_1, local19.anInt5481, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1);
										if (local1572 == null && Static80.aBoolean705) {
											Static138.method2656(local19);
										}
									}
									if (local1572 != null) {
										if (local19.anInt5524 > 0) {
											local502 = (local19.anInt5513 << 9) / local19.anInt5524;
										} else {
											local502 = 512;
										}
										if (local19.anInt5459 > 0) {
											local1233 = (local19.anInt5476 << 9) / local19.anInt5459;
										} else {
											local1233 = 512;
										}
										local535 = local19.anInt5513 / 2 + local92;
										local537 = local19.anInt5476 / 2 + local97;
										if (!local19.aBoolean440) {
											local537 += local1233 * local19.anInt5470 >> 9;
											local535 += local19.anInt5455 * local502 >> 9;
										}
										Static328.aClass109_5.Y();
										aClass43_1.method7187(Static328.aClass109_5);
										aClass43_1.la(local535, local537, local502, local1233);
										aClass43_1.ya();
										if (local19.aBoolean448) {
											aClass43_1.ZA(false);
										}
										if (local19.aBoolean440) {
											Static315.aClass109_4.oa(local19.anInt5521);
											Static315.aClass109_4.ZA(local19.anInt5465);
											Static315.aClass109_4.AA(local19.anInt5532);
											Static315.aClass109_4.U(local19.anInt5455, local19.anInt5470, local19.anInt5449);
										} else {
											local550 = Class3_Sub17.anIntArray175[local19.anInt5521 << 3] * (local19.anInt5498 << 2) >> 14;
											local645 = (local19.anInt5498 << 2) * Class3_Sub17.anIntArray177[local19.anInt5521 << 3] >> 14;
											Static315.aClass109_4.J(-local19.anInt5532 << 3);
											Static315.aClass109_4.ZA(local19.anInt5465 << 3);
											Static315.aClass109_4.U(local19.anInt5443 << 2, local252 + (local19.anInt5530 << 2) + local550, local645 - -(local19.anInt5530 << 2));
											Static315.aClass109_4.w(local19.anInt5521 << 3);
										}
										local19.method4769(Static315.aClass109_4, local1572, Static305.anInt5560, aClass43_1);
										if (Static438.aBoolean339) {
											aClass43_1.V(local92, local97, local92 + local19.anInt5513, local97 - -local19.anInt5476);
										}
										if (local19.aBoolean440) {
											if (local19.aBoolean443) {
												local1572.method7521(Static315.aClass109_4, null, local19.anInt5498, 1);
											} else {
												local1572.method7501(Static315.aClass109_4, null, 1);
												if (local19.aClass9_Sub6_6 != null) {
													aClass43_1.method7189(local19.aClass9_Sub6_6.method3051());
												}
											}
										} else if (local19.aBoolean443) {
											local1572.method7521(Static315.aClass109_4, null, local19.anInt5498 << 2, 1);
										} else {
											local1572.method7501(Static315.aClass109_4, null, 1);
											if (local19.aClass9_Sub6_6 != null) {
												aClass43_1.method7189(local19.aClass9_Sub6_6.method3051());
											}
										}
										if (Static438.aBoolean339) {
											aClass43_1.da(arg8, arg3, arg4, arg2);
										}
										if (local19.aBoolean448) {
											aClass43_1.ZA(true);
										}
									}
								} else if (local19.anInt5473 == 9) {
									if (local19.aBoolean453) {
										local1233 = local97;
										local502 = local92 + local19.anInt5513;
										local252 = local97 + local19.anInt5476;
									} else {
										local252 = local97;
										local1233 = local97 + local19.anInt5476;
										local502 = local92 + local19.anInt5513;
									}
									if (local19.anInt5471 == 1) {
										aClass43_1.method7137(local92, local252, local502, local1233, local19.anInt5450, 0);
									} else {
										aClass43_1.method7155(local92, local252, local502, local1233, local19.anInt5450, local19.anInt5471);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!la;)V")
	public static void method59(@OriginalArg(0) Class117 arg0) {
		Static593.aClass117_12 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lclient!mba;")
	public static Class77 method61() {
		try {
			return new Class77_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class77) Class.forName("Class77_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class77_Sub3();
			}
		}
	}
}
