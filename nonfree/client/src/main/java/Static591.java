import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!tga;")
	public static Class347 aClass347_3;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public static int anInt9781;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!kka;")
	public static final Class205 aClass205_17 = new Class205();

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "[I")
	public static final int[] anIntArray508 = new int[200];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZI[Lclient!qga;IIIIIII)V")
	public static void method8402(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class299[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class299 local19 = arg3[local13];
			if (local19 != null && (local19.anInt8527 == arg7 || arg7 == -1412584499 && local19 == Static649.aClass299_12)) {
				@Pc(48) int local48 = local19.anInt8534 + arg8;
				@Pc(53) int local53 = local19.anInt8603 + arg4;
				@Pc(60) int local60 = local19.anInt8573 + local48 + 1;
				@Pc(67) int local67 = local19.anInt8547 + local53 + 1;
				@Pc(94) int local94;
				if (arg5 == -1) {
					Class14_Sub33.aRectangleArray2[Static132.anInt2080].setBounds(local19.anInt8534 + arg8, arg4 + local19.anInt8603, local19.anInt8573, local19.anInt8547);
					local94 = Static132.anInt2080++;
				} else {
					local94 = arg5;
				}
				local19.anInt8555 = local94;
				local19.anInt8539 = Static530.anInt9105;
				if (!Static80.method1359(local19)) {
					if (local19.anInt8542 != 0) {
						Static80.method1373(local19);
					}
					@Pc(122) int local122 = arg8 + local19.anInt8534;
					@Pc(128) int local128 = local19.anInt8603 + arg4;
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					if (Static656.aBoolean741) {
						local130 = Static532.method7876();
						local132 = Static276.method4674();
					}
					@Pc(143) int local143 = local19.anInt8568;
					if (Static123.aBoolean140 && (Static80.method1360(local19).anInt453 != 0 || local19.anInt8610 == 0) && local143 > 127) {
						local143 = 127;
					}
					@Pc(219) int local219;
					@Pc(225) int local225;
					if (local19 == Static649.aClass299_12) {
						if (arg7 != -1412584499 && (Static267.anInt4946 == local19.anInt8556 || Static629.anInt10319 == local19.anInt8556)) {
							Static26.anInt353 = arg4;
							Static540.aClass299Array3 = arg3;
							Static666.anInt10882 = arg8;
							continue;
						}
						if (Static614.aBoolean702 && Static30.aBoolean33) {
							local219 = local130 + Static656.aClass118_1.method7586();
							local225 = local132 + Static656.aClass118_1.method7590();
							local225 -= Static611.anInt10054;
							local219 -= Static109.anInt1855;
							if (Static327.anInt5651 > local219) {
								local219 = Static327.anInt5651;
							}
							if (Static530.aClass299_9.anInt8573 + Static327.anInt5651 < local19.anInt8573 + local219) {
								local219 = Static530.aClass299_9.anInt8573 + Static327.anInt5651 - local19.anInt8573;
							}
							if (local225 < Static558.anInt9347) {
								local225 = Static558.anInt9347;
							}
							if (local225 + local19.anInt8547 > Static530.aClass299_9.anInt8547 + Static558.anInt9347) {
								local225 = Static558.anInt9347 + Static530.aClass299_9.anInt8547 - local19.anInt8547;
							}
							local122 = local219;
							local128 = local225;
						}
						if (local19.anInt8556 == Static629.anInt10319) {
							local143 = 128;
						}
					}
					@Pc(350) int local350;
					@Pc(358) int local358;
					@Pc(304) int local304;
					@Pc(310) int local310;
					if (local19.anInt8610 == 2) {
						local225 = arg9;
						local350 = arg2;
						local219 = arg6;
						local358 = arg0;
					} else {
						local304 = local122 + local19.anInt8573;
						local310 = local128 + local19.anInt8547;
						local225 = arg9 < local128 ? local128 : arg9;
						if (local19.anInt8610 == 9) {
							local304++;
							local310++;
						}
						local219 = local122 <= arg6 ? arg6 : local122;
						local350 = arg2 <= local304 ? arg2 : local304;
						local358 = local310 >= arg0 ? arg0 : local310;
					}
					if (local350 > local219 && local358 > local225) {
						@Pc(727) int local727;
						@Pc(763) int local763;
						@Pc(774) int local774;
						@Pc(915) int local915;
						@Pc(917) int local917;
						@Pc(761) int local761;
						if (local19.anInt8542 != 0) {
							if (local19.anInt8542 == Static353.anInt10726 || Static288.anInt5258 == local19.anInt8542) {
								Static97.method1617(local122, local128, local19);
								if (!Static656.aBoolean741) {
									Static143.method2158(local128, local19.anInt8547, Static288.anInt5258 == local19.anInt8542, local19.anInt8573, local122);
									Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
								}
								Static415.aBooleanArray17[local94] = true;
								continue;
							}
							if (Static59.anInt989 == local19.anInt8542) {
								if (local19.method7439(Static103.aClass144_3) != null) {
									Static599.method8480();
									Static211.method3240(Static103.aClass144_3, local128, local122, local19);
									Static655.aBooleanArray27[local94] = true;
									Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
									if (Static656.aBoolean741) {
										if (arg1) {
											Static140.method2127(local60, local48, local67, local53);
										} else {
											Static635.method8898(local53, local67, local60, local48);
										}
									}
								}
								continue;
							}
							if (local19.anInt8542 == Static466.anInt7819) {
								Static319.method5042(local128, Static103.aClass144_3, local19, local122);
								continue;
							}
							if (Static139.anInt2198 == local19.anInt8542) {
								Static440.method2422(local19.anInt8566 % 64, local128, 1374237767, local122, Static103.aClass144_3, local19);
								continue;
							}
							if (Static483.anInt8342 == local19.anInt8542) {
								if (local19.method7439(Static103.aClass144_3) != null) {
									Static121.method1891(local122, local19, local128);
									Static655.aBooleanArray27[local94] = true;
									Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
									if (Static656.aBoolean741) {
										if (arg1) {
											Static140.method2127(local60, local48, local67, local53);
										} else {
											Static635.method8898(local53, local67, local60, local48);
										}
									}
								}
								continue;
							}
							if (local19.anInt8542 == Static451.anInt7535) {
								Static522.method7763(local19.anInt8573, Static160.anInterface4_3, local122, Static103.aClass144_3, local128, local19.anInt8547);
								Static415.aBooleanArray17[local94] = true;
								Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
								continue;
							}
							if (Static89.anInt10172 == local19.anInt8542) {
								Static648.method9084(local128, Static103.aClass144_3, local19.anInt8547, local122, local19.anInt8573);
								Static415.aBooleanArray17[local94] = true;
								Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
								continue;
							}
							if (Static540.anInt9207 == local19.anInt8542) {
								if (!Static432.aBoolean511 && !Static127.aBoolean780) {
									continue;
								}
								local304 = local122 + local19.anInt8573;
								local310 = local128 + 15;
								if (Static656.aBoolean741) {
									if (arg1) {
										Static140.method2127(local60, local48, local67, local53);
									} else {
										Static635.method8898(local53, local67, local60, local48);
									}
								}
								if (Static432.aBoolean511) {
									local727 = -256;
									if (Static485.anInt8396 < 20) {
										local727 = -65536;
									}
									Static446.aClass68_8.method9429(local727, local304, local310, -1, "Fps:" + Static485.anInt8396);
									local310 += 15;
									@Pc(751) Runtime local751 = Runtime.getRuntime();
									local761 = (int) ((local751.totalMemory() - local751.freeMemory()) / 1024L);
									local763 = -256;
									if (local761 > 98304) {
										local763 = -65536;
										if (Static105.aBoolean665) {
											Static243.method4060();
											for (local774 = 0; local774 < 10; local774++) {
												System.gc();
											}
											local761 = (int) ((local751.totalMemory() - local751.freeMemory()) / 1024L);
											if (local761 > 65536) {
												Static354.method5381("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static446.aClass68_8.method9429(local763, local304, local310, -1, "Mem:" + local761 + "k");
									local310 += 15;
									Static446.aClass68_8.method9429(-256, local304, local310, -1, "Game: In:" + Static277.aClass347_2.anInt9629 + "B/s Out:" + Static277.aClass347_2.anInt9627 + "B/s");
									local310 += 15;
									Static446.aClass68_8.method9429(-256, local304, local310, -1, "Lobby: In:" + Static277.aClass347_1.anInt9629 + "B/s Out:" + Static277.aClass347_1.anInt9627 + "B/s");
									local310 += 15;
									local774 = Static103.aClass144_3.E() / 1024;
									Static446.aClass68_8.method9429(local774 > 65536 ? -65536 : -256, local304, local310, -1, "Offheap:" + local774 + "k");
									local310 += 15;
									local915 = 0;
									local917 = 0;
									@Pc(919) int local919 = 0;
									for (@Pc(921) int local921 = 0; local921 < 37; local921++) {
										if (Static84.aClass293_Sub1Array2[local921] != null) {
											local915 += Static84.aClass293_Sub1Array2[local921].method7314();
											local917 += Static84.aClass293_Sub1Array2[local921].method7317();
											local919 += Static84.aClass293_Sub1Array2[local921].method7319();
										}
									}
									@Pc(967) int local967 = local919 * 100 / local915;
									@Pc(973) int local973 = local917 * 10000 / local915;
									@Pc(999) String local999 = "Cache:" + Static465.method6863(2, true, (long) local973, 0) + "% (" + local967 + "%)";
									Static474.aClass68_9.method9429(-256, local304, local310, -1, local999);
									local310 += 12;
								}
								if (Static479.anInt8315 > 0) {
									Static474.aClass68_9.method9429(-256, local304, local310, -1, "Particles: " + Static557.anInt8794 + " / " + Static479.anInt8315);
								}
								local310 += 12;
								if (Static127.aBoolean780) {
									Static474.aClass68_9.method9429(-256, local304, local310, -1, "Polys: " + Static103.aClass144_3.I() + " Models: " + Static103.aClass144_3.M());
									local310 += 12;
									Static474.aClass68_9.method9429(-256, local304, local310, -1, "Ls: " + Static43.anInt695 + " La: " + Static14.anInt197 + " NPC: " + Static658.anInt10759 + " Pl: " + Static458.anInt7634);
									Static405.method6120();
									local310 += 12;
								}
								Static415.aBooleanArray17[local94] = true;
								continue;
							}
						}
						@Pc(1189) Class14_Sub13 local1189;
						if (local19.anInt8610 == 0) {
							if (Static210.anInt3682 == local19.anInt8542 && Static103.aClass144_3.method6898()) {
								Static103.aClass144_3.method6965(local122, local128, local19.anInt8573, local19.anInt8547);
							}
							method8402(local358, arg1, local350, arg3, local128 - local19.anInt8617, local94, local219, local19.anInt8526, local122 - local19.anInt8552, local225);
							if (local19.aClass299Array2 != null) {
								method8402(local358, arg1, local350, local19.aClass299Array2, local128 - local19.anInt8617, local94, local219, local19.anInt8526, local122 - local19.anInt8552, local225);
							}
							local1189 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local19.anInt8526);
							if (local1189 != null) {
								Static3.method78(local350, local225, local219, local358, local94, local1189.anInt1465, local128, local122);
							}
							if (Static210.anInt3682 == local19.anInt8542 && Static103.aClass144_3.method6898()) {
								Static103.aClass144_3.method6936();
							}
							Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
						}
						if (Static234.aBooleanArray13[local94] || Static58.anInt983 > 1) {
							if (local19.anInt8610 == 3) {
								if (local143 == 0) {
									if (local19.aBoolean605) {
										Static103.aClass144_3.aa(local122, local128, local19.anInt8573, local19.anInt8547, local19.anInt8566, 0);
									} else {
										Static103.aClass144_3.method6923(local122, local128, local19.anInt8573, local19.anInt8547, local19.anInt8566, 0);
									}
								} else if (local19.aBoolean605) {
									Static103.aClass144_3.aa(local122, local128, local19.anInt8573, local19.anInt8547, local19.anInt8566 & 0xFFFFFF | 255 - (local143 & 0xFF) << 24, 1);
								} else {
									Static103.aClass144_3.method6923(local122, local128, local19.anInt8573, local19.anInt8547, 255 - (local143 & 0xFF) << 24 | local19.anInt8566 & 0xFFFFFF, 1);
								}
								if (Static656.aBoolean741) {
									if (arg1) {
										Static140.method2127(local60, local48, local67, local53);
									} else {
										Static635.method8898(local53, local67, local60, local48);
									}
								}
							} else {
								@Pc(1403) Class284 local1403;
								if (local19.anInt8610 == 4) {
									@Pc(1374) Class68 local1374 = local19.method7431(Static103.aClass144_3);
									if (local1374 != null) {
										local310 = local19.anInt8566;
										@Pc(1393) String local1393 = local19.aString96;
										if (local19.anInt8621 != -1) {
											local1403 = Static252.aClass56_1.method1052(local19.anInt8621);
											local1393 = local1403.aString89;
											if (local1393 == null) {
												local1393 = "null";
											}
											if ((local1403.lb == 1 || local19.anInt8565 != 1) && local19.anInt8565 != -1) {
												local1393 = "<col=ff9040>" + local1393 + "</col> x" + Static506.method7584(local19.anInt8565);
											}
										}
										if (local19.anInt8582 != -1) {
											local1393 = Static231.method3888(local19.anInt8582);
											if (local1393 == null) {
												local1393 = "";
											}
										}
										if (local19 == Static432.aClass299_7) {
											local1393 = Static21.aClass21_30.method324(Static26.anInt352);
											local310 = local19.anInt8566;
										}
										if (Static461.aBoolean540) {
											Static103.aClass144_3.T(local122, local128, local122 + local19.anInt8573, local128 - -local19.anInt8547);
										}
										local1374.method9421(local19.anInt8573, (int[]) null, local19.anInt8606, local19.anInt8571, Static610.aClass45Array31, local310 | 255 - (local143 & 0xFF) << 24, local128, 0, local122, local19.anInt8547, local19.anInt8562, local19.aBoolean609 ? 255 - (local143 & 0xFF) << 24 : -1, (Class1) null, local19.anInt8605, 0, local1393);
										if (Static461.aBoolean540) {
											Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
										}
										if (local1393.trim().length() > 0) {
											if (!Static461.aBoolean540) {
												@Pc(1571) Class350 local1571 = Static607.method8543(Static103.aClass144_3, local19.anInt8575);
												local761 = local1571.method8352(Static610.aClass45Array31, local19.anInt8573, local1393);
												local763 = local1571.method8351(local19.anInt8606, local19.anInt8573, local1393, Static610.aClass45Array31);
												if (Static656.aBoolean741) {
													if (arg1) {
														Static140.method2127(local122 + local761, local122, local763 + local128, local128);
													} else {
														Static635.method8898(local128, local128 + local763, local761 + local122, local122);
													}
												}
											} else if (Static656.aBoolean741) {
												if (arg1) {
													Static140.method2127(local60, local48, local67, local53);
												} else {
													Static635.method8898(local53, local67, local60, local48);
												}
											}
										}
									} else if (Static93.aBoolean107) {
										Static538.method7933(local19);
									}
								} else {
									@Pc(1784) int local1784;
									if (local19.anInt8610 == 5) {
										if (local19.anInt8622 >= 0) {
											local19.method7443(Static103.aClass171_1, Static254.aClass142_1).method8685(local19.anInt8573, local122, local128, Static103.aClass144_3, local19.anInt8614 << 3, local19.anInt8581 << 3, local19.anInt8547);
										} else {
											@Pc(1734) Class45 local1734;
											if (local19.anInt8621 != -1) {
												@Pc(1716) Class398 local1716 = local19.aBoolean608 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null;
												local1734 = Static252.aClass56_1.method1051(local19.anInt8623, local19.anInt8530 | 0xFF000000, Static103.aClass144_3, local1716, local19.anInt8536, local19.anInt8565, local19.anInt8621);
											} else if (local19.anInt8582 == -1) {
												local1734 = local19.method7452(Static103.aClass144_3);
											} else {
												local1734 = Static169.method2461(Static103.aClass144_3, local19.anInt8582);
											}
											if (local1734 != null) {
												local310 = local1734.method7508();
												local727 = local1734.method7504();
												local1784 = (local19.anInt8566 == 0 ? 16777215 : local19.anInt8566 & 0xFFFFFF) | 255 - (local143 & 0xFF) << 24;
												if (local19.aBoolean615) {
													Static103.aClass144_3.T(local122, local128, local122 + local19.anInt8573, local19.anInt8547 + local128);
													if (local19.anInt8541 != 0) {
														local761 = (local310 + local19.anInt8573 - 1) / local310;
														local763 = (local727 + local19.anInt8547 - 1) / local727;
														for (local774 = 0; local774 < local761; local774++) {
															for (local915 = 0; local915 < local763; local915++) {
																if (local19.anInt8566 == 0) {
																	local1734.method7494((float) (local774 * local310 + local122) + (float) local310 / 2.0F, (float) local727 / 2.0F + (float) (local727 * local915 + local128), 4096, local19.anInt8541);
																} else {
																	local1734.method7496((float) local310 / 2.0F + (float) (local122 + local310 * local774), (float) local727 / 2.0F + (float) (local128 - -(local727 * local915)), 4096, local19.anInt8541, local1784);
																}
															}
														}
													} else if (local19.anInt8566 == 0 && local143 == 0) {
														local1734.method7500(local122, local128, local19.anInt8573, local19.anInt8547);
													} else {
														local1734.method7487(local122, local128, local19.anInt8573, local19.anInt8547, 0, local1784, 1);
													}
													Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
												} else if (local19.anInt8566 == 0 && local143 == 0) {
													if (local19.anInt8541 != 0) {
														local1734.method7494((float) local122 + (float) local19.anInt8573 / 2.0F, (float) local19.anInt8547 / 2.0F + (float) local128, local19.anInt8573 * 4096 / local310, local19.anInt8541);
													} else if (local310 == local19.anInt8573 && local19.anInt8547 == local727) {
														local1734.method7488(local122, local128);
													} else {
														local1734.method7502(local122, local128, local19.anInt8573, local19.anInt8547);
													}
												} else if (local19.anInt8541 != 0) {
													local1734.method7496((float) local122 + (float) local19.anInt8573 / 2.0F, (float) local128 + (float) local19.anInt8547 / 2.0F, local19.anInt8573 * 4096 / local310, local19.anInt8541, local1784);
												} else if (local19.anInt8573 == local310 && local727 == local19.anInt8547) {
													local1734.method7491(local122, local128, 0, local1784, 1);
												} else {
													local1734.method7493(local122, local128, local19.anInt8573, local19.anInt8547, 0, local1784, 1);
												}
											} else if (Static93.aBoolean107) {
												Static538.method7933(local19);
											}
										}
										if (Static656.aBoolean741) {
											if (arg1) {
												Static140.method2127(local60, local48, local67, local53);
											} else {
												Static635.method8898(local53, local67, local60, local48);
											}
										}
									} else if (local19.anInt8610 == 6) {
										Static132.method2016();
										local1189 = null;
										@Pc(2184) Class129 local2184 = null;
										local727 = 0;
										if (local19.anInt8621 != -1) {
											local1403 = Static252.aClass56_1.method1052(local19.anInt8621);
											if (local1403 != null) {
												local1403 = local1403.method6841(local19.anInt8565);
												local2184 = local1403.method6846(2048, local19.aBoolean608 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null, 1, local19.aClass181_11, Static103.aClass144_3);
												if (local2184 == null) {
													Static538.method7933(local19);
												} else {
													local727 = -local2184.fa() >> 1;
												}
											}
										} else if (local19.anInt8543 == 5) {
											local1784 = local19.anInt8546;
											if (local1784 >= 0 && local1784 < 2048) {
												@Pc(2328) Class4_Sub3_Sub3_Sub3_Sub2 local2328 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local1784];
												if (local2328 != null && (Static597.anInt9858 == local1784 || Static186.method2742(local2328.aString37) == local19.anInt8559)) {
													local2184 = local2328.aClass398_1.method9460(Static52.aClass175_1, Static642.aClass400_2, 2048, 0, (Class181) null, Static152.aClass61_1, Static59.aClass204_1, (Class181[]) null, Static103.aClass144_3, (int[]) null, Static252.aClass56_1, local19.aClass181_11, Static265.aClass103_2, Static188.aClass238_1);
												}
											}
										} else if (local19.anInt8543 == 8 || local19.anInt8543 == 9) {
											@Pc(2283) Class14_Sub14 local2283 = Static495.method7455(local19.anInt8546, false);
											if (local2283 != null) {
												local2184 = local2283.method1787(local19.aBoolean608 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null, local19.anInt8559, local19.anInt8543 == 9, Static103.aClass144_3, local19.aClass181_11);
											}
										} else if (local19.aClass181_11 != null && local19.aClass181_11.method8970()) {
											local2184 = local19.method7447(Static103.aClass144_3, Static188.aClass238_1, Static52.aClass175_1, 2048, Static265.aClass103_2, local19.aClass181_11, local1189, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1, Static152.aClass61_1, Static59.aClass204_1, Static252.aClass56_1);
											if (local2184 == null && Static93.aBoolean107) {
												Static538.method7933(local19);
											}
										} else {
											local2184 = local19.method7447(Static103.aClass144_3, Static188.aClass238_1, Static52.aClass175_1, 2048, Static265.aClass103_2, (Class181) null, local1189, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1, Static152.aClass61_1, Static59.aClass204_1, Static252.aClass56_1);
											if (local2184 == null && Static93.aBoolean107) {
												Static538.method7933(local19);
											}
										}
										if (local2184 != null) {
											if (local19.anInt8545 <= 0) {
												local1784 = 512;
											} else {
												local1784 = (local19.anInt8573 << 9) / local19.anInt8545;
											}
											if (local19.anInt8612 <= 0) {
												local761 = 512;
											} else {
												local761 = (local19.anInt8547 << 9) / local19.anInt8612;
											}
											local763 = local122 + local19.anInt8573 / 2;
											local774 = local19.anInt8547 / 2 + local128;
											if (!local19.aBoolean600) {
												local774 += local761 * local19.anInt8615 >> 9;
												local763 += local19.anInt8551 * local1784 >> 9;
											}
											Static281.aClass263_4.method8432();
											Static103.aClass144_3.method6896(Static281.aClass263_4);
											Static103.aClass144_3.DA(local763, local774, local1784, local761);
											Static103.aClass144_3.ya();
											if (local19.aBoolean612) {
												Static103.aClass144_3.C(false);
											}
											if (local19.aBoolean600) {
												Static467.aClass263_9.method8436(local19.anInt8593);
												Static467.aClass263_9.method8435(local19.anInt8598);
												Static467.aClass263_9.method8441(local19.anInt8585);
												Static467.aClass263_9.method8442(local19.anInt8551, local19.anInt8615, local19.anInt8600);
											} else {
												local915 = Class141.anIntArray207[local19.anInt8593 << 3] * (local19.anInt8587 << 2) >> 14;
												local917 = (local19.anInt8587 << 2) * Class141.anIntArray208[local19.anInt8593 << 3] >> 14;
												Static467.aClass263_9.method8449(-local19.anInt8585 << 3);
												Static467.aClass263_9.method8435(local19.anInt8598 << 3);
												Static467.aClass263_9.method8442(local19.anInt8554 << 2, local727 + (local19.anInt8574 << 2) + local915, (local19.anInt8574 << 2) + local917);
												Static467.aClass263_9.method8439(local19.anInt8593 << 3);
											}
											local19.method7435(local2184, Static530.anInt9105, Static467.aClass263_9, Static103.aClass144_3);
											if (Static461.aBoolean540) {
												Static103.aClass144_3.T(local122, local128, local19.anInt8573 + local122, local19.anInt8547 + local128);
											}
											if (local19.aBoolean600) {
												if (local19.aBoolean610) {
													local2184.method5289(Static467.aClass263_9, (Class4_Sub1) null, local19.anInt8587, 1);
												} else {
													local2184.method5307(Static467.aClass263_9, (Class4_Sub1) null, 1);
													if (local19.aClass4_Sub8_8 != null) {
														Static103.aClass144_3.method6903(local19.aClass4_Sub8_8.method8675());
													}
												}
											} else if (local19.aBoolean610) {
												local2184.method5289(Static467.aClass263_9, (Class4_Sub1) null, local19.anInt8587 << 2, 1);
											} else {
												local2184.method5307(Static467.aClass263_9, (Class4_Sub1) null, 1);
												if (local19.aClass4_Sub8_8 != null) {
													Static103.aClass144_3.method6903(local19.aClass4_Sub8_8.method8675());
												}
											}
											if (Static461.aBoolean540) {
												Static103.aClass144_3.KA(arg6, arg9, arg2, arg0);
											}
											if (local19.aBoolean612) {
												Static103.aClass144_3.C(true);
											}
										}
										if (Static656.aBoolean741) {
											if (arg1) {
												Static140.method2127(local60, local48, local67, local53);
											} else {
												Static635.method8898(local53, local67, local60, local48);
											}
										}
									} else if (local19.anInt8610 == 9) {
										if (local19.aBoolean611) {
											local310 = local19.anInt8547 + local128;
											local727 = local122 + local19.anInt8573;
											local1784 = local128;
										} else {
											local1784 = local128 + local19.anInt8547;
											local310 = local128;
											local727 = local19.anInt8573 + local122;
										}
										if (local19.anInt8597 == 1) {
											Static103.aClass144_3.method6969(local122, local310, local727, local1784, local19.anInt8566, 0);
										} else {
											Static103.aClass144_3.method6933(local122, local310, local727, local1784, local19.anInt8566, local19.anInt8597);
										}
										if (Static656.aBoolean741) {
											if (arg1) {
												Static140.method2127(local60, local48, local67, local53);
											} else {
												Static635.method8898(local53, local67, local60, local48);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
