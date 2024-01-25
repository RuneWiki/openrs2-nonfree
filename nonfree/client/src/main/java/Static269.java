import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	public static int anInt4577;

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
	public static int anInt4579;

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "Lclient!ya;")
	public static Class51 aClass51_9;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_101 = new Class253(96, 10);

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	public static int anInt4578 = 0;

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_71 = new Class2(64, -1);

	@OriginalMember(owner = "client!nj", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!ok;)I")
	public static int method3625(@OriginalArg(1) Class178 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3848(Static292.anInt4876)) {
			local5++;
		}
		if (arg0.method3848(Static309.anInt5154)) {
			local5++;
		}
		if (arg0.method3848(Static393.anInt6288)) {
			local5++;
		}
		if (arg0.method3848(Static374.anInt6085)) {
			local5++;
		}
		if (arg0.method3848(Static409.anInt6472)) {
			local5++;
		}
		if (arg0.method3848(Static225.anInt4944)) {
			local5++;
		}
		if (arg0.method3848(Static301.anInt5047)) {
			local5++;
		}
		if (arg0.method3848(Static350.anInt5615)) {
			local5++;
		}
		if (arg0.method3848(Static386.anInt6224)) {
			local5++;
		}
		if (arg0.method3848(Static170.anInt4637)) {
			local5++;
		}
		if (arg0.method3848(Static297.anInt4921)) {
			local5++;
		}
		if (arg0.method3848(Static280.anInt4685)) {
			local5++;
		}
		if (arg0.method3848(Static182.anInt3280)) {
			local5++;
		}
		if (arg0.method3848(Static76.anInt1556)) {
			local5++;
		}
		if (arg0.method3848(Static328.anInt5383)) {
			local5++;
		}
		if (arg0.method3848(Static387.anInt3380)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3626(@OriginalArg(1) String arg0) {
		if (Static231.aStringArray52 == null) {
			Static309.method4074();
		}
		@Pc(22) String[] local22 = Static295.method3893(arg0, '\n');
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static72.anInt1377; local28 > 0; local28--) {
				Static231.aStringArray52[local28] = Static231.aStringArray52[local28 - 1];
			}
			Static231.aStringArray52[0] = local22[local24];
			if (Static72.anInt1377 < Static231.aStringArray52.length - 1) {
				if (Static68.anInt1324 > 0) {
					Static68.anInt1324++;
				}
				Static72.anInt1377++;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!go;I)V")
	private static void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2) {
		@Pc(13) Class119 local13 = arg2.method2163(aClass51_9);
		if (local13 == null) {
			return;
		}
		aClass51_9.OA(arg0, arg1, arg0 + arg2.anInt2595, arg1 + arg2.anInt2638);
		if (Static57.anInt986 < 3) {
			Static97.aClass11_6.method4398((float) arg0 + (float) arg2.anInt2595 / 2.0F, (float) arg2.anInt2638 / 2.0F + (float) arg1, ((int) -Static97.aFloat52 & 0x3FFF) << 2, local13, arg0, arg1);
		} else {
			aClass51_9.ca(-16777216, local13, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZIII[Lclient!go;II)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class95[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		aClass51_9.OA(arg4, arg5, arg3, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(19) Class95 local19 = arg6[local13];
			if (local19 != null && (local19.anInt2646 == arg1 || arg1 == -1412584499 && Static191.aClass95_9 == local19)) {
				@Pc(58) int local58;
				if (arg7 == -1) {
					Class7_Sub4_Sub2_Sub1.aRectangleArray1[Static57.anInt967].setBounds(arg0 + local19.anInt2601, local19.anInt2584 + arg8, local19.anInt2595, local19.anInt2638);
					local58 = Static57.anInt967++;
				} else {
					local58 = arg7;
				}
				local19.anInt2611 = local58;
				local19.anInt2608 = Static274.anInt4617;
				if (!Static52.method717(local19)) {
					if (local19.anInt2607 != 0) {
						Static286.method3219(local19);
					}
					@Pc(83) int local83 = local19.anInt2601 + arg0;
					@Pc(89) int local89 = local19.anInt2584 + arg8;
					@Pc(92) int local92 = local19.anInt2669;
					if (Static283.aBoolean297 && (Static52.method725(local19).anInt2235 != 0 || local19.anInt2616 == 0) && local92 > 127) {
						local92 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (Static191.aClass95_9 == local19) {
						if (arg1 != -1412584499 && (local19.anInt2589 == Static153.anInt5629 || local19.anInt2589 == Static352.anInt5642)) {
							Static97.anInt1983 = arg0;
							Static279.anInt7417 = arg8;
							Static360.aClass95Array2 = arg6;
							continue;
						}
						if (Static268.aBoolean286 && Static129.aBoolean141) {
							local152 = Static154.aClass50_1.method1860();
							local156 = Static154.aClass50_1.method1870();
							local152 -= Static44.anInt727;
							local156 -= Static98.anInt1995;
							if (Static413.anInt6556 > local152) {
								local152 = Static413.anInt6556;
							}
							if (Static413.anInt6556 + Static36.aClass95_1.anInt2595 < local19.anInt2595 + local152) {
								local152 = Static413.anInt6556 + Static36.aClass95_1.anInt2595 - local19.anInt2595;
							}
							if (local156 < Static100.anInt2032) {
								local156 = Static100.anInt2032;
							}
							if (local156 + local19.anInt2638 > Static36.aClass95_1.anInt2638 + Static100.anInt2032) {
								local156 = Static36.aClass95_1.anInt2638 + Static100.anInt2032 - local19.anInt2638;
							}
							local83 = local152;
							local89 = local156;
						}
						if (Static352.anInt5642 == local19.anInt2589) {
							local92 = 128;
						}
					}
					@Pc(285) int local285;
					@Pc(296) int local296;
					@Pc(244) int local244;
					@Pc(250) int local250;
					if (local19.anInt2616 == 2) {
						local296 = arg2;
						local156 = arg5;
						local152 = arg4;
						local285 = arg3;
					} else {
						local244 = local83 + local19.anInt2595;
						local250 = local89 + local19.anInt2638;
						local156 = arg5 < local89 ? local89 : arg5;
						if (local19.anInt2616 == 9) {
							local250++;
							local244++;
						}
						local152 = arg4 < local83 ? local83 : arg4;
						local285 = local244 < arg3 ? local244 : arg3;
						local296 = local250 < arg2 ? local250 : arg2;
					}
					if (local285 > local152 && local156 < local296) {
						@Pc(573) int local573;
						@Pc(599) int local599;
						@Pc(601) int local601;
						@Pc(523) int local523;
						@Pc(525) int local525;
						if (local19.anInt2607 != 0) {
							if (local19.anInt2607 == Static293.anInt4887 || Static278.anInt4675 == local19.anInt2607) {
								Static71.method1181(Static278.anInt4675 == local19.anInt2607, local83, local19.anInt2595, local89, local19.anInt2638);
								Static69.aBooleanArray2[local58] = true;
								aClass51_9.OA(arg4, arg5, arg3, arg2);
								continue;
							}
							if (local19.anInt2607 == Static27.anInt396) {
								if (local19.method2163(aClass51_9) != null) {
									Static330.method4331();
									Static288.method3811(aClass51_9, local89, local83, local19);
									Static308.aBooleanArray28[local58] = true;
									aClass51_9.OA(arg4, arg5, arg3, arg2);
								}
								continue;
							}
							if (Static117.anInt2385 == local19.anInt2607) {
								if (local19.method2163(aClass51_9) != null) {
									method3628(local83, local89, local19);
									Static308.aBooleanArray28[local58] = true;
									aClass51_9.OA(arg4, arg5, arg3, arg2);
								}
								continue;
							}
							if (local19.anInt2607 == Static242.anInt4142) {
								Static283.method3742(local19.anInt2595, local89, aClass51_9, local19.anInt2638, Static351.anInterface4_5, local83);
								Static69.aBooleanArray2[local58] = true;
								aClass51_9.OA(arg4, arg5, arg3, arg2);
								continue;
							}
							if (local19.anInt2607 == Static28.anInt403) {
								Static300.method4012(local89, local83, local19.anInt2638, local19.anInt2595, aClass51_9);
								Static69.aBooleanArray2[local58] = true;
								aClass51_9.OA(arg4, arg5, arg3, arg2);
								continue;
							}
							if (Static262.anInt7389 == local19.anInt2607) {
								if (!Static416.aBoolean433 && !Static416.aBoolean434) {
									continue;
								}
								local244 = local83 + local19.anInt2595;
								local250 = local89 + 15;
								if (Static416.aBoolean433) {
									Static259.aClass63_7.method4584(local250, local244, -256, "Fps:" + Static446.anInt7362);
									local250 += 15;
									@Pc(514) Runtime local514 = Runtime.getRuntime();
									local523 = (int) ((local514.totalMemory() - local514.freeMemory()) / 1024L);
									local525 = -256;
									if (local523 > 65536) {
										local525 = -65536;
									}
									Static259.aClass63_7.method4584(local250, local244, local525, "Mem:" + local523 + "k");
									local250 += 15;
									Static259.aClass63_7.method4584(local250, local244, -256, "In:" + Static139.anInt2674 + "B/s Out:" + Static99.anInt2004 + "B/s");
									local250 += 15;
									local573 = aClass51_9.IA() / 1024;
									Static259.aClass63_7.method4584(local250, local244, local573 > 65536 ? -65536 : -256, "Offheap:" + local573 + "k");
									local250 += 15;
									local599 = 0;
									local601 = 0;
									@Pc(603) int local603 = 0;
									for (@Pc(605) int local605 = 0; local605 < 30; local605++) {
										local599 += Static250.aClass4_Sub1Array2[local605].method5788();
										local601 += Static250.aClass4_Sub1Array2[local605].method5787();
										local603 += Static250.aClass4_Sub1Array2[local605].method5783();
									}
									@Pc(641) int local641 = local603 * 100 / local599;
									@Pc(647) int local647 = local601 * 10000 / local599;
									@Pc(667) String local667 = "Cache:" + Static350.method4525((long) local647, 2, 0, true) + "% (" + local641 + "%)";
									Static359.aClass63_11.method4584(local250, local244, -256, local667);
									local250 += 12;
								}
								if (Static226.anInt3950 > 0) {
									Static359.aClass63_11.method4584(local250, local244, -256, "Particles: " + Static321.anInt5281 + " / " + Static226.anInt3950);
								}
								local250 += 12;
								if (Static416.aBoolean434) {
									Static359.aClass63_11.method4584(local250, local244, -256, "Polys: " + aClass51_9.ZA() + " Models: " + aClass51_9.w());
									local250 += 12;
									Static359.aClass63_11.method4584(local250, local244, -256, "Ls: " + Static207.anInt3647 + " La: " + Static345.anInt5551 + " NPC: " + Static7.anInt43 + " Pl: " + Static197.anInt3471);
									Static32.method423();
									local250 += 12;
								}
								Static69.aBooleanArray2[local58] = true;
								continue;
							}
						}
						if (local19.anInt2616 == 0) {
							if (Static421.anInt6707 == local19.anInt2607 && aClass51_9.method5326()) {
								aClass51_9.method5319(local83, local89, local19.anInt2595, local19.anInt2638);
							}
							method3629(local83 - local19.anInt2627, local19.anInt2583, local296, local285, local152, local156, arg6, local58, local89 - local19.anInt2585);
							if (local19.aClass95Array1 != null) {
								method3629(local83 - local19.anInt2627, local19.anInt2583, local296, local285, local152, local156, local19.aClass95Array1, local58, local89 - local19.anInt2585);
							}
							@Pc(826) Class7_Sub44 local826 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local19.anInt2583);
							if (local826 != null) {
								Static352.method4542(local156, local285, local58, local296, local89, local152, local826.anInt7165, local83);
							}
							if (Static421.anInt6707 == local19.anInt2607 && aClass51_9.method5326()) {
								aClass51_9.method5302();
								Static367.aBoolean390 = true;
							}
							aClass51_9.OA(arg4, arg5, arg3, arg2);
						}
						if (Static271.aBooleanArray26[local58] || Static288.anInt4801 > 1) {
							if (local19.anInt2616 == 3) {
								if (local92 == 0) {
									if (local19.aBoolean158) {
										aClass51_9.O(local83, local89, local19.anInt2595, local19.anInt2638, local19.anInt2653, 0);
									} else {
										aClass51_9.method5287(local83, local89, local19.anInt2595, local19.anInt2638, local19.anInt2653, 0);
									}
								} else if (local19.aBoolean158) {
									aClass51_9.O(local83, local89, local19.anInt2595, local19.anInt2638, 255 - (local92 & 0xFF) << 24 | local19.anInt2653 & 0xFFFFFF, 1);
								} else {
									aClass51_9.method5287(local83, local89, local19.anInt2595, local19.anInt2638, local19.anInt2653 & 0xFFFFFF | 255 - (local92 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt2616 == 4) {
								@Pc(962) Class63 local962 = local19.method2156(aClass51_9);
								if (local962 != null) {
									local250 = local19.anInt2653;
									@Pc(977) String local977 = local19.aString28;
									if (local19.anInt2599 != -1) {
										@Pc(987) Class45 local987 = Static259.aClass206_2.method4320(local19.anInt2599);
										local977 = local987.aString6;
										if (local977 == null) {
											local977 = "null";
										}
										if ((local987.anInt961 == 1 || local19.anInt2604 != 1) && local19.anInt2604 != -1) {
											local977 = "<col=ff9040>" + local977 + "</col> x" + Static310.method4079(local19.anInt2604);
										}
									}
									if (Static63.aClass95_2 == local19) {
										local977 = Static282.aClass55_102.method1205(Static5.anInt20);
										local250 = local19.anInt2653;
									}
									if (Static178.aBoolean196) {
										aClass51_9.fa(local83, local89, local83 + local19.anInt2595, local19.anInt2638 + local89);
									}
									local962.method4583(local19.anInt2638, local19.anInt2628, local977, null, local83, local19.anInt2643, local89, null, local19.anInt2595, 0, local19.anInt2655, local19.aBoolean154 ? 255 - (local92 & 0xFF) << 24 : -1, 255 - (local92 & 0xFF) << 24 | local250, 0, Static321.aClass11Array9, local19.anInt2597);
									if (Static178.aBoolean196) {
										aClass51_9.OA(arg4, arg5, arg3, arg2);
									}
								} else if (Static283.aBoolean296) {
									Static413.method5189(local19);
								}
							} else {
								@Pc(1159) int local1159;
								if (local19.anInt2616 == 5) {
									if (local19.anInt2663 < 0) {
										@Pc(1144) Class11 local1144;
										if (local19.anInt2599 == -1) {
											local1144 = local19.method2165(aClass51_9);
										} else {
											@Pc(1126) Class75 local1126 = local19.aBoolean151 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null;
											local1144 = Static259.aClass206_2.method4324(local19.anInt2609, local19.anInt2599, local19.anInt2596 | 0xFF000000, local19.anInt2604, local19.anInt2648, aClass51_9, local1126);
										}
										if (local1144 != null) {
											local250 = local1144.j();
											local1159 = local1144.T();
											local523 = (local19.anInt2653 == 0 ? 16777215 : local19.anInt2653 & 0xFFFFFF) | 255 - (local92 & 0xFF) << 24;
											if (local19.aBoolean165) {
												aClass51_9.fa(local83, local89, local19.anInt2595 + local83, local89 - -local19.anInt2638);
												if (local19.anInt2615 != 0) {
													local525 = (local19.anInt2595 + local250 - 1) / local250;
													local573 = (local19.anInt2638 + local1159 - 1) / local1159;
													for (local599 = 0; local599 < local525; local599++) {
														for (local601 = 0; local601 < local573; local601++) {
															if (local19.anInt2653 == 0) {
																local1144.method4393((float) local250 / 2.0F + (float) (local83 + local599 * local250), (float) (local1159 * local601 + local89) + (float) local1159 / 2.0F, 4096, local19.anInt2615);
															} else {
																local1144.method4392((float) local250 / 2.0F + (float) (local83 + local599 * local250), (float) local1159 / 2.0F + (float) (local601 * local1159 + local89), 4096, local19.anInt2615, local523);
															}
														}
													}
												} else if (local19.anInt2653 == 0 && local92 == 0) {
													local1144.method4390(local83, local89, local19.anInt2595, local19.anInt2638);
												} else {
													local1144.JA(local83, local89, local19.anInt2595, local19.anInt2638, 0, local523, 1);
												}
												aClass51_9.OA(arg4, arg5, arg3, arg2);
											} else if (local19.anInt2653 == 0 && local92 == 0) {
												if (local19.anInt2615 != 0) {
													local1144.method4393((float) local19.anInt2595 / 2.0F + (float) local83, (float) local19.anInt2638 / 2.0F + (float) local89, local19.anInt2595 * 4096 / local250, local19.anInt2615);
												} else if (local250 == local19.anInt2595 && local1159 == local19.anInt2638) {
													local1144.method4394(local83, local89);
												} else {
													local1144.method4399(local83, local89, local19.anInt2595, local19.anInt2638);
												}
											} else if (local19.anInt2615 != 0) {
												local1144.method4392((float) local19.anInt2595 / 2.0F + (float) local83, (float) local89 + (float) local19.anInt2638 / 2.0F, local19.anInt2595 * 4096 / local250, local19.anInt2615, local523);
											} else if (local19.anInt2595 == local250 && local19.anInt2638 == local1159) {
												local1144.r(local83, local89, 0, local523, 1);
											} else {
												local1144.s(local83, local89, local19.anInt2595, local19.anInt2638, 0, local523, 1);
											}
										} else if (Static283.aBoolean296) {
											Static413.method5189(local19);
										}
									} else {
										local19.method2167(Static411.aClass217_1, Static439.aClass255_1).method4084(local19.anInt2595, local19.anInt2606 << 3, 0, 0, local19.anInt2638, local83, local89, local19.anInt2591 << 3, aClass51_9);
									}
								} else if (local19.anInt2616 == 6) {
									Static217.method3062();
									@Pc(1521) Class163 local1521 = null;
									local250 = 0;
									@Pc(1554) Class139 local1554;
									@Pc(1562) Class75 local1562;
									if (local19.anInt2599 != -1) {
										@Pc(1534) Class45 local1534 = Static259.aClass206_2.method4320(local19.anInt2599);
										if (local1534 != null) {
											local1534 = local1534.method762(local19.anInt2604);
											local1554 = local19.anInt2659 == -1 ? null : Static364.aClass151_2.method3293(local19.anInt2659);
											local1562 = local19.aBoolean151 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null;
											local1521 = local1534.method761(aClass51_9, 1, local1554, local19.anInt2582, local19.anInt2621, 2048, local1562, local19.anInt2639);
											if (local1521 == null) {
												Static413.method5189(local19);
											} else {
												local250 = -local1521.MA() >> 1;
											}
										}
									} else if (local19.anInt2673 == 5) {
										local1159 = local19.anInt2665;
										if (local1159 >= 0 && local1159 < 2048) {
											@Pc(1614) Class26_Sub2_Sub4_Sub2 local1614 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local1159];
											@Pc(1626) Class139 local1626 = local19.anInt2659 == -1 ? null : Static364.aClass151_2.method3293(local19.anInt2659);
											if (local1614 != null && (local1159 == Static296.anInt4920 || Static259.method3456(local1614.aString69) == local19.anInt2626)) {
												local1521 = local1614.aClass75_1.method1849(0, 0, local19.anInt2639, 2048, Static442.aClass98_1, Static259.aClass206_2, aClass51_9, Static223.aClass154_1, Static364.aClass151_2, local1626, null, null, -1, local19.anInt2621, Static224.aClass239_7, local19.anInt2582, Static430.aClass162_2);
											}
										}
									} else if (local19.anInt2673 == 8 || local19.anInt2673 == 9) {
										@Pc(1685) Class7_Sub27 local1685 = Static288.method3810(false, local19.anInt2665);
										local1554 = local19.anInt2659 == -1 ? null : Static364.aClass151_2.method3293(local19.anInt2659);
										if (local1685 != null) {
											local1562 = local19.aBoolean151 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null;
											local1521 = local1685.method2972(local19.anInt2582, local19.anInt2639, local19.anInt2673 == 9, local19.anInt2626, aClass51_9, local1554, local19.anInt2621, local1562);
										}
									} else if (local19.anInt2659 == -1) {
										local1521 = local19.method2152(Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1, Static224.aClass239_7, Static430.aClass162_2, -1, 0, -1, Static223.aClass154_1, Static442.aClass98_1, 2048, Static364.aClass151_2, aClass51_9, Static259.aClass206_2, null);
										if (local1521 == null && Static283.aBoolean296) {
											Static413.method5189(local19);
										}
									} else {
										@Pc(1744) Class139 local1744 = Static364.aClass151_2.method3293(local19.anInt2659);
										local1521 = local19.method2152(Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1, Static224.aClass239_7, Static430.aClass162_2, local19.anInt2621, local19.anInt2582, local19.anInt2639, Static223.aClass154_1, Static442.aClass98_1, 2048, Static364.aClass151_2, aClass51_9, Static259.aClass206_2, local1744);
										if (local1521 == null && Static283.aBoolean296) {
											Static413.method5189(local19);
										}
									}
									if (local1521 != null) {
										if (local19.anInt2635 > 0) {
											local1159 = (local19.anInt2595 << 9) / local19.anInt2635;
										} else {
											local1159 = 512;
										}
										if (local19.anInt2588 > 0) {
											local523 = (local19.anInt2638 << 9) / local19.anInt2588;
										} else {
											local523 = 512;
										}
										local525 = (local1159 * local19.anInt2644 >> 9) + local19.anInt2595 / 2 + local83;
										local573 = (local19.anInt2662 * local523 >> 9) + local19.anInt2638 / 2 + local89;
										Static179.aClass33_11.xa();
										aClass51_9.ea(Static179.aClass33_11);
										aClass51_9.H(local525, local573, local1159, local523);
										aClass51_9.g((float) (local19.anInt2647 << 0), local19.aBoolean159 ? (float) (local19.anInt2594 << 0) : (float) (local19.anInt2594 << 0) * 1.5F);
										if (arg1 == -1412584499 || Static367.aBoolean390) {
											aClass51_9.e();
											aClass51_9.method5278();
											aClass51_9.OA(arg4, arg5, arg3, arg2);
											Static367.aBoolean390 = false;
										}
										if (local19.aBoolean161) {
											aClass51_9.method5333(false);
										}
										local599 = (local19.anInt2667 << 0) * Class22_Sub7.anIntArray411[local19.anInt2670 << 3] >> 15;
										local601 = (local19.anInt2667 << 0) * Class22_Sub7.anIntArray410[local19.anInt2670 << 3] >> 15;
										Static379.aClass33_8.O(-local19.anInt2625 << 3);
										Static379.aClass33_8.ja(local19.anInt2618 << 3);
										Static379.aClass33_8.o(local19.anInt2650 << 0, (local19.anInt2631 << 0) + local599 + local250, local601 + (local19.anInt2631 << 0));
										Static379.aClass33_8.ka(local19.anInt2670 << 3);
										if (Static178.aBoolean196) {
											aClass51_9.fa(local83, local89, local83 + local19.anInt2595, local89 + local19.anInt2638);
										}
										if (local19.aBoolean159) {
											local1521.method4650(Static379.aClass33_8, null, local19.anInt2667 << 0);
										} else {
											local1521.method4667(Static379.aClass33_8, null, 1);
										}
										if (Static178.aBoolean196) {
											aClass51_9.OA(arg4, arg5, arg3, arg2);
										}
										if (local19.aBoolean161) {
											aClass51_9.method5333(true);
										}
										aClass51_9.g(0.0F, 0.0F);
									}
								} else if (local19.anInt2616 == 9) {
									if (local19.aBoolean156) {
										local250 = local89 + local19.anInt2638;
										local1159 = local19.anInt2595 + local83;
										local523 = local89;
									} else {
										local523 = local19.anInt2638 + local89;
										local250 = local89;
										local1159 = local19.anInt2595 + local83;
									}
									if (local19.anInt2654 == 1) {
										aClass51_9.method5289(local83, local250, local1159, local523, local19.anInt2653, 0);
									} else {
										aClass51_9.method5280(local83, local250, local1159, local523, local19.anInt2653, local19.anInt2654);
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
