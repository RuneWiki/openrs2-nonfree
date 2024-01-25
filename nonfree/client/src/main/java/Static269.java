import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
	public static int anInt4246;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "Lclient!eh;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!jda", name = "w", descriptor = "Lclient!cb;")
	public static Class50 aClass50_71;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_152 = new Class196(29, -2);

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "Z")
	public static boolean aBoolean284 = true;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!nba;)V")
	public static void method3784(@OriginalArg(1) Class5_Sub2_Sub13 arg0) {
		if (arg0 == null) {
			return;
		}
		Static153.aClass124_24.method2574(arg0);
		Static223.anInt3566++;
		@Pc(40) Class5_Sub2_Sub5 local40;
		if (arg0.aBoolean480 || "".equals(arg0.aString66)) {
			local40 = new Class5_Sub2_Sub5(arg0.aString66);
			Static150.anInt2471++;
		} else {
			@Pc(34) long local34 = arg0.aLong197;
			for (local40 = (Class5_Sub2_Sub5) Static277.aClass335_21.method7766(local34); local40 != null && !local40.aString27.equals(arg0.aString66); local40 = (Class5_Sub2_Sub5) Static277.aClass335_21.method7769()) {
			}
			if (local40 == null) {
				local40 = (Class5_Sub2_Sub5) Static440.aClass265_47.method6577(local34);
				if (local40 != null && !local40.aString27.equals(arg0.aString66)) {
					local40 = null;
				}
				if (local40 == null) {
					local40 = new Class5_Sub2_Sub5(arg0.aString66);
				}
				Static277.aClass335_21.method7770(local34, local40);
				Static150.anInt2471++;
			}
		}
		if (local40.method2537(arg0)) {
			Static258.method6480(local40);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[Lclient!wq;ZIIIIIIII)V")
	public static void method3785(@OriginalArg(0) int arg0, @OriginalArg(1) Class394[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
		for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
			@Pc(21) Class394 local21 = arg1[local16];
			if (local21 != null && (arg3 == local21.anInt10530 || arg3 == -1412584499 && Static610.aClass394_12 == local21)) {
				@Pc(43) int local43 = arg0 + local21.anInt10494;
				@Pc(48) int local48 = local21.anInt10486 + arg8;
				@Pc(55) int local55 = local43 + local21.anInt10536 + 1;
				@Pc(62) int local62 = local48 + local21.anInt10532 + 1;
				@Pc(68) int local68;
				if (arg5 == -1) {
					Class305.aRectangleArray1[Static283.anInt4411].setBounds(arg0 + local21.anInt10494, local21.anInt10486 + arg8, local21.anInt10536, local21.anInt10532);
					local68 = Static283.anInt4411++;
				} else {
					local68 = arg5;
				}
				local21.anInt10500 = Static421.anInt7434;
				local21.anInt10449 = local68;
				if (!Static81.method1279(local21)) {
					if (local21.anInt10477 != 0) {
						Static184.method2687(local21);
					}
					@Pc(111) int local111 = arg0 + local21.anInt10494;
					@Pc(116) int local116 = arg8 + local21.anInt10486;
					@Pc(118) int local118 = 0;
					@Pc(120) int local120 = 0;
					if (Static305.aBoolean315) {
						local118 = Static304.method4150();
						local120 = Static563.method7702();
					}
					@Pc(131) int local131 = local21.anInt10467;
					if (Static292.aBoolean301 && (Static81.method1268(local21).anInt7813 != 0 || local21.anInt10479 == 0) && local131 > 127) {
						local131 = 127;
					}
					@Pc(183) int local183;
					@Pc(189) int local189;
					if (Static610.aClass394_12 == local21) {
						if (arg3 != -1412584499 && (local21.anInt10509 == Static364.anInt6368 || Static409.anInt7021 == local21.anInt10509)) {
							Static244.anInt3955 = arg8;
							Static26.aClass394Array1 = arg1;
							Static503.anInt8533 = arg0;
							continue;
						}
						if (Static133.aBoolean153 && Static254.aBoolean280) {
							local183 = local118 + Static178.aClass111_1.method8703();
							local189 = local120 + Static178.aClass111_1.method8696();
							local183 -= Static546.anInt8936;
							local189 -= Static127.anInt2189;
							if (local183 < Static364.anInt6380) {
								local183 = Static364.anInt6380;
							}
							if (Static42.anInt602 > local189) {
								local189 = Static42.anInt602;
							}
							if (local183 + local21.anInt10536 > Static364.anInt6380 + Static96.aClass394_1.anInt10536) {
								local183 = Static364.anInt6380 + Static96.aClass394_1.anInt10536 - local21.anInt10536;
							}
							local111 = local183;
							if (Static42.anInt602 + Static96.aClass394_1.anInt10532 < local21.anInt10532 + local189) {
								local189 = Static96.aClass394_1.anInt10532 + Static42.anInt602 - local21.anInt10532;
							}
							local116 = local189;
						}
						if (local21.anInt10509 == Static409.anInt7021) {
							local131 = 128;
						}
					}
					@Pc(324) int local324;
					@Pc(317) int local317;
					@Pc(273) int local273;
					@Pc(278) int local278;
					if (local21.anInt10479 == 2) {
						local324 = arg4;
						local183 = arg6;
						local189 = arg9;
						local317 = arg7;
					} else {
						local273 = local21.anInt10536 + local111;
						local278 = local116 + local21.anInt10532;
						local189 = arg9 >= local116 ? arg9 : local116;
						local183 = local111 > arg6 ? local111 : arg6;
						if (local21.anInt10479 == 9) {
							local273++;
							local278++;
						}
						local317 = local278 >= arg7 ? arg7 : local278;
						local324 = local273 >= arg4 ? arg4 : local273;
					}
					if (local324 > local183 && local317 > local189) {
						@Pc(627) int local627;
						@Pc(671) int local671;
						@Pc(764) int local764;
						@Pc(766) int local766;
						@Pc(658) int local658;
						@Pc(660) int local660;
						if (local21.anInt10477 != 0) {
							if (local21.anInt10477 == Static542.anInt8895 || local21.anInt10477 == Static263.anInt4211) {
								Static655.method8587(local21, local111, local116);
								if (!Static305.aBoolean315) {
									Static540.method7467(local21.anInt10532, Static263.anInt4211 == local21.anInt10477, local116, local21.anInt10536, local111);
									Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
								}
								Static425.aBooleanArray18[local68] = true;
								continue;
							}
							if (Static63.anInt998 == local21.anInt10477) {
								if (local21.method8731(Static563.aClass143_13) != null) {
									Static491.method7177();
									Static242.method8204(local116, Static563.aClass143_13, local111, local21);
									Static209.aBooleanArray4[local68] = true;
									Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
									if (Static305.aBoolean315) {
										if (arg2) {
											Static430.method7439(local48, local62, local43, local55);
										} else {
											Static242.method8203(local43, local48, local55, local62);
										}
									}
								}
								continue;
							}
							if (Static268.anInt4594 == local21.anInt10477) {
								Static595.method8075(local111, local116, Static563.aClass143_13, local21);
								continue;
							}
							if (local21.anInt10477 == Static408.anInt7016) {
								Static387.method5667(local111, Static563.aClass143_13, local21, local116, local21.anInt10483 % 64);
								continue;
							}
							if (Static79.anInt1280 == local21.anInt10477) {
								if (local21.method8731(Static563.aClass143_13) != null) {
									Static428.method6455(local111, local21, local116);
									Static209.aBooleanArray4[local68] = true;
									Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
									if (Static305.aBoolean315) {
										if (arg2) {
											Static430.method7439(local48, local62, local43, local55);
										} else {
											Static242.method8203(local43, local48, local55, local62);
										}
									}
								}
								continue;
							}
							if (local21.anInt10477 == Static589.anInt9654) {
								Static102.method1686(local111, local116, Static218.anInterface3_3, local21.anInt10532, local21.anInt10536, Static563.aClass143_13);
								Static425.aBooleanArray18[local68] = true;
								Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
								continue;
							}
							if (local21.anInt10477 == Static55.anInt890) {
								Static152.method2243(local21.anInt10536, local111, local21.anInt10532, Static563.aClass143_13, local116);
								Static425.aBooleanArray18[local68] = true;
								Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
								continue;
							}
							if (Static143.anInt2379 == local21.anInt10477) {
								if (!Static451.aBoolean575 && !Static433.aBoolean559) {
									continue;
								}
								local273 = local21.anInt10536 + local111;
								if (Static305.aBoolean315) {
									if (arg2) {
										Static430.method7439(local48, local62, local43, local55);
									} else {
										Static242.method8203(local43, local48, local55, local62);
									}
								}
								local278 = local116 + 15;
								if (Static451.aBoolean575) {
									local627 = -256;
									if (Static581.anInt9565 < 20) {
										local627 = -65536;
									}
									Static5.aClass72_1.method6923("Fps:" + Static581.anInt9565, -1, local627, local278, local273);
									local278 += 15;
									@Pc(649) Runtime local649 = Runtime.getRuntime();
									local658 = (int) ((local649.totalMemory() - local649.freeMemory()) / 1024L);
									local660 = -256;
									if (local658 > 98304) {
										local660 = -65536;
										if (Static464.aBoolean586) {
											Static345.method5206();
											for (local671 = 0; local671 < 10; local671++) {
												System.gc();
											}
											local658 = (int) ((local649.totalMemory() - local649.freeMemory()) / 1024L);
											if (local658 > 65536) {
												Static566.method7772("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static5.aClass72_1.method6923("Mem:" + local658 + "k", -1, local660, local278, local273);
									local278 += 15;
									Static5.aClass72_1.method6923("In:" + Static113.anInt2020 + "B/s Out:" + Static539.anInt8855 + "B/s", -1, -256, local278, local273);
									local278 += 15;
									local671 = Static563.aClass143_13.E() / 1024;
									Static5.aClass72_1.method6923("Offheap:" + local671 + "k", -1, local671 <= 65536 ? -256 : -65536, local278, local273);
									local278 += 15;
									local764 = 0;
									local766 = 0;
									@Pc(768) int local768 = 0;
									for (@Pc(770) int local770 = 0; local770 < 37; local770++) {
										if (Static366.aClass7_Sub1Array2[local770] != null) {
											local764 += Static366.aClass7_Sub1Array2[local770].method159();
											local766 += Static366.aClass7_Sub1Array2[local770].method165();
											local768 += Static366.aClass7_Sub1Array2[local770].method161();
										}
									}
									@Pc(809) int local809 = local768 * 100 / local764;
									@Pc(815) int local815 = local766 * 10000 / local764;
									@Pc(835) String local835 = "Cache:" + Static594.method8048(2, true, (long) local815, 0) + "% (" + local809 + "%)";
									Static383.aClass72_10.method6923(local835, -1, -256, local278, local273);
									local278 += 12;
								}
								if (Static512.anInt8632 > 0) {
									Static383.aClass72_10.method6923("Particles: " + Static303.anInt4679 + " / " + Static512.anInt8632, -1, -256, local278, local273);
								}
								local278 += 12;
								if (Static433.aBoolean559) {
									Static383.aClass72_10.method6923("Polys: " + Static563.aClass143_13.I() + " Models: " + Static563.aClass143_13.M(), -1, -256, local278, local273);
									local278 += 12;
									Static383.aClass72_10.method6923("Ls: " + Static495.anInt8462 + " La: " + Static633.anInt10108 + " NPC: " + Static558.anInt9108 + " Pl: " + Static216.anInt3456, -1, -256, local278, local273);
									Static365.method5375();
									local278 += 12;
								}
								Static425.aBooleanArray18[local68] = true;
								continue;
							}
						}
						@Pc(997) Class5_Sub4 local997;
						if (local21.anInt10479 == 0) {
							if (Static363.anInt6353 == local21.anInt10477 && Static563.aClass143_13.method6224()) {
								Static563.aClass143_13.method6192(local111, local116, local21.anInt10536, local21.anInt10532);
							}
							method3785(local111 - local21.anInt10506, arg1, arg2, local21.anInt10490, local324, local68, local183, local317, local116 - local21.anInt10448, local189);
							if (local21.aClass394Array2 != null) {
								method3785(local111 - local21.anInt10506, local21.aClass394Array2, arg2, local21.anInt10490, local324, local68, local183, local317, local116 - local21.anInt10448, local189);
							}
							local997 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local21.anInt10490);
							if (local997 != null) {
								Static389.method572(local68, local183, local116, local324, local997.anInt257, local189, local317, local111);
							}
							if (local21.anInt10477 == Static363.anInt6353 && Static563.aClass143_13.method6224()) {
								Static563.aClass143_13.method6220();
							}
							Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
						}
						if (Static224.aBooleanArray6[local68] || Static325.anInt5947 > 1) {
							if (local21.anInt10479 == 3) {
								if (local131 == 0) {
									if (local21.aBoolean771) {
										Static563.aClass143_13.aa(local111, local116, local21.anInt10536, local21.anInt10532, local21.anInt10483, 0);
									} else {
										Static563.aClass143_13.method6229(local111, local116, local21.anInt10536, local21.anInt10532, local21.anInt10483, 0);
									}
								} else if (local21.aBoolean771) {
									Static563.aClass143_13.aa(local111, local116, local21.anInt10536, local21.anInt10532, 255 - (local131 & 0xFF) << 24 | local21.anInt10483 & 0xFFFFFF, 1);
								} else {
									Static563.aClass143_13.method6229(local111, local116, local21.anInt10536, local21.anInt10532, local21.anInt10483 & 0xFFFFFF | 255 - (local131 & 0xFF) << 24, 1);
								}
								if (Static305.aBoolean315) {
									if (arg2) {
										Static430.method7439(local48, local62, local43, local55);
									} else {
										Static242.method8203(local43, local48, local55, local62);
									}
								}
							} else {
								@Pc(1172) Class219 local1172;
								if (local21.anInt10479 == 4) {
									@Pc(1147) Class72 local1147 = local21.method8741(Static563.aClass143_13);
									if (local1147 != null) {
										local278 = local21.anInt10483;
										@Pc(1161) String local1161 = local21.aString118;
										if (local21.anInt10469 != -1) {
											local1172 = Static259.aClass135_1.method2776(local21.anInt10469);
											local1161 = local1172.aString61;
											if (local1161 == null) {
												local1161 = "null";
											}
											if ((local1172.anInt6168 == 1 || local21.anInt10522 != 1) && local21.anInt10522 != -1) {
												local1161 = "<col=ff9040>" + local1161 + "</col> x" + Static562.method7689(local21.anInt10522);
											}
										}
										if (local21.anInt10492 != -1) {
											local1161 = Static177.method2601(local21.anInt10492);
											if (local1161 == null) {
												local1161 = "";
											}
										}
										if (Static415.aClass394_5 == local21) {
											local1161 = Static49.aClass42_31.method730(Static259.anInt4113);
											local278 = local21.anInt10483;
										}
										if (Static489.aBoolean607) {
											Static563.aClass143_13.T(local111, local116, local21.anInt10536 + local111, local116 - -local21.anInt10532);
										}
										local1147.method6913(0, (Class1) null, local21.anInt10505, local21.anInt10532, local116, local21.aBoolean779 ? 255 - (local131 & 0xFF) << 24 : -1, local1161, local21.anInt10496, local21.anInt10536, Static166.aClass59Array5, local21.anInt10481, (int[]) null, 0, local278 | 255 - (local131 & 0xFF) << 24, local111, local21.anInt10518);
										if (Static489.aBoolean607) {
											Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
										}
										if (local1161.trim().length() > 0) {
											if (!Static489.aBoolean607) {
												@Pc(1315) Class198 local1315 = Static403.method5900(Static563.aClass143_13, local21.anInt10527);
												local658 = local1315.method4084(local21.anInt10536, Static166.aClass59Array5, local1161);
												local660 = local1315.method4082(local21.anInt10536, local21.anInt10505, local1161, Static166.aClass59Array5);
												if (Static305.aBoolean315) {
													if (arg2) {
														Static430.method7439(local116, local660 + local116, local111, local658 + local111);
													} else {
														Static242.method8203(local111, local116, local658 + local111, local660 + local116);
													}
												}
											} else if (Static305.aBoolean315) {
												if (arg2) {
													Static430.method7439(local48, local62, local43, local55);
												} else {
													Static242.method8203(local43, local48, local55, local62);
												}
											}
										}
									} else if (Static291.aBoolean789) {
										Static609.method8190(local21);
									}
								} else {
									@Pc(1494) int local1494;
									if (local21.anInt10479 == 5) {
										if (local21.anInt10488 >= 0) {
											local21.method8742(Static1.aClass286_5, Static117.aClass64_1).method2425(local111, local116, local21.anInt10536, 0, local21.anInt10475 << 3, 0, local21.anInt10532, Static563.aClass143_13, local21.anInt10476 << 3);
										} else {
											@Pc(1427) Class59 local1427;
											if (local21.anInt10469 != -1) {
												@Pc(1443) Class239 local1443 = local21.aBoolean784 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null;
												local1427 = Static259.aClass135_1.method2778(local1443, local21.anInt10445, Static563.aClass143_13, local21.anInt10504, local21.anInt10522, local21.anInt10452 | 0xFF000000, local21.anInt10469);
											} else if (local21.anInt10492 == -1) {
												local1427 = local21.method8732(Static563.aClass143_13);
											} else {
												local1427 = Static44.method617(Static563.aClass143_13, local21.anInt10492);
											}
											if (local1427 != null) {
												local278 = local1427.method8053();
												local627 = local1427.method8064();
												local1494 = (local21.anInt10483 == 0 ? 16777215 : local21.anInt10483 & 0xFFFFFF) | 255 - (local131 & 0xFF) << 24;
												if (local21.aBoolean772) {
													Static563.aClass143_13.T(local111, local116, local111 + local21.anInt10536, local21.anInt10532 + local116);
													if (local21.anInt10525 != 0) {
														local658 = (local278 + local21.anInt10536 - 1) / local278;
														local660 = (local21.anInt10532 + local627 - 1) / local627;
														for (local671 = 0; local671 < local658; local671++) {
															for (local764 = 0; local764 < local660; local764++) {
																if (local21.anInt10483 == 0) {
																	local1427.method8071((float) (local111 + local671 * local278) + (float) local278 / 2.0F, (float) local627 / 2.0F + (float) (local116 + local764 * local627), 4096, local21.anInt10525);
																} else {
																	local1427.method8068((float) local278 / 2.0F + (float) (local111 + local671 * local278), (float) local627 / 2.0F + (float) (local116 - -(local764 * local627)), 4096, local21.anInt10525, local1494);
																}
															}
														}
													} else if (local21.anInt10483 == 0 && local131 == 0) {
														local1427.method8063(local111, local116, local21.anInt10536, local21.anInt10532);
													} else {
														local1427.method8060(local111, local116, local21.anInt10536, local21.anInt10532, 0, local1494, 1);
													}
													Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
												} else if (local21.anInt10483 == 0 && local131 == 0) {
													if (local21.anInt10525 != 0) {
														local1427.method8071((float) local21.anInt10536 / 2.0F + (float) local111, (float) local21.anInt10532 / 2.0F + (float) local116, local21.anInt10536 * 4096 / local278, local21.anInt10525);
													} else if (local278 == local21.anInt10536 && local21.anInt10532 == local627) {
														local1427.method8057(local111, local116);
													} else {
														local1427.method8055(local111, local116, local21.anInt10536, local21.anInt10532);
													}
												} else if (local21.anInt10525 != 0) {
													local1427.method8068((float) local21.anInt10536 / 2.0F + (float) local111, (float) local116 + (float) local21.anInt10532 / 2.0F, local21.anInt10536 * 4096 / local278, local21.anInt10525, local1494);
												} else if (local21.anInt10536 == local278 && local627 == local21.anInt10532) {
													local1427.method8067(local111, local116, 0, local1494, 1);
												} else {
													local1427.method8058(local111, local116, local21.anInt10536, local21.anInt10532, 0, local1494, 1);
												}
											} else if (Static291.aBoolean789) {
												Static609.method8190(local21);
											}
										}
										if (Static305.aBoolean315) {
											if (arg2) {
												Static430.method7439(local48, local62, local43, local55);
											} else {
												Static242.method8203(local43, local48, local55, local62);
											}
										}
									} else if (local21.anInt10479 == 6) {
										Static335.method5149();
										local997 = null;
										@Pc(1802) Class114 local1802 = null;
										local627 = 0;
										@Pc(1835) Class65 local1835;
										@Pc(1843) Class239 local1843;
										if (local21.anInt10469 != -1) {
											local1172 = Static259.aClass135_1.method2776(local21.anInt10469);
											if (local1172 != null) {
												local1172 = local1172.method5179(local21.anInt10522);
												local1835 = local21.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(local21.anInt10499);
												local1843 = local21.aBoolean784 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null;
												local1802 = local1172.method5173(2048, local21.anInt10447, 1, local21.anInt10534, local21.anInt10535, Static563.aClass143_13, local1835, local1843);
												if (local1802 == null) {
													Static609.method8190(local21);
												} else {
													local627 = -local1802.fa() >> 1;
												}
											}
										} else if (local21.anInt10482 == 5) {
											local1494 = local21.anInt10528;
											if (local1494 >= 0 && local1494 < 2048) {
												@Pc(1894) Class41_Sub1_Sub1_Sub3_Sub2 local1894 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local1494];
												@Pc(1907) Class65 local1907 = local21.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(local21.anInt10499);
												if (local1894 != null && (local1494 == Static177.anInt2910 || Static395.method5733(local1894.aString100) == local21.anInt10459)) {
													local1802 = local1894.aClass239_1.method5580(-1, (int[]) null, (Class65) null, 0, Static670.aClass83_2, Static459.aClass128_2, local1907, 0, 2048, Static58.aClass230_1, Static259.aClass135_1, 0, Static233.aClass172_1, Static413.aClass63_1, Static563.aClass143_13, local21.anInt10447, local21.anInt10535, local21.anInt10534, (Class127[]) null);
												}
											}
										} else if (local21.anInt10482 == 8 || local21.anInt10482 == 9) {
											@Pc(1970) Class5_Sub48 local1970 = Static386.method5663(false, local21.anInt10528);
											local1835 = local21.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(local21.anInt10499);
											if (local1970 != null) {
												local1843 = local21.aBoolean784 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null;
												local1802 = local1970.method7610(local1835, local1843, local21.anInt10535, local21.anInt10459, local21.anInt10534, local21.anInt10482 == 9, Static563.aClass143_13, local21.anInt10447);
											}
										} else if (local21.anInt10499 == -1) {
											local1802 = local21.method8738(Static259.aClass135_1, -1, Static233.aClass172_1, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1, local997, 0, (Class65) null, Static413.aClass63_1, 2048, Static459.aClass128_2, Static563.aClass143_13, -1, Static58.aClass230_1, Static670.aClass83_2);
											if (local1802 == null && Static291.aBoolean789) {
												Static609.method8190(local21);
											}
										} else {
											@Pc(2029) Class65 local2029 = Static459.aClass128_2.method2686(local21.anInt10499);
											local1802 = local21.method8738(Static259.aClass135_1, local21.anInt10535, Static233.aClass172_1, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1, local997, local21.anInt10534, local2029, Static413.aClass63_1, 2048, Static459.aClass128_2, Static563.aClass143_13, local21.anInt10447, Static58.aClass230_1, Static670.aClass83_2);
											if (local1802 == null && Static291.aBoolean789) {
												Static609.method8190(local21);
											}
										}
										if (local1802 != null) {
											if (local21.anInt10451 <= 0) {
												local1494 = 512;
											} else {
												local1494 = (local21.anInt10536 << 9) / local21.anInt10451;
											}
											if (local21.anInt10508 > 0) {
												local658 = (local21.anInt10532 << 9) / local21.anInt10508;
											} else {
												local658 = 512;
											}
											local660 = local111 + local21.anInt10536 / 2;
											local671 = local21.anInt10532 / 2 + local116;
											if (!local21.aBoolean782) {
												local671 += local658 * local21.anInt10468 >> 9;
												local660 += local21.anInt10457 * local1494 >> 9;
											}
											Static108.aClass56_4.method8400();
											Static563.aClass143_13.method6222(Static108.aClass56_4);
											Static563.aClass143_13.DA(local660, local671, local1494, local658);
											Static563.aClass143_13.ya();
											if (local21.aBoolean773) {
												Static563.aClass143_13.C(false);
											}
											if (local21.aBoolean782) {
												aClass56_5.method8392(local21.anInt10493);
												aClass56_5.method8386(local21.anInt10455);
												aClass56_5.method8385(local21.anInt10513);
												aClass56_5.method8390(local21.anInt10457, local21.anInt10468, local21.anInt10450);
											} else {
												local764 = (local21.anInt10515 << 2) * Class242.anIntArray384[local21.anInt10493 << 3] >> 14;
												local766 = (local21.anInt10515 << 2) * Class242.anIntArray383[local21.anInt10493 << 3] >> 14;
												aClass56_5.method8401(-local21.anInt10513 << 3);
												aClass56_5.method8386(local21.anInt10455 << 3);
												aClass56_5.method8390(local21.anInt10474 << 2, local627 + local764 + (local21.anInt10473 << 2), (local21.anInt10473 << 2) + local766);
												aClass56_5.method8387(local21.anInt10493 << 3);
											}
											local21.method8743(aClass56_5, local1802, Static421.anInt7434, Static563.aClass143_13);
											if (Static489.aBoolean607) {
												Static563.aClass143_13.T(local111, local116, local111 + local21.anInt10536, local21.anInt10532 + local116);
											}
											if (local21.aBoolean782) {
												if (local21.aBoolean774) {
													local1802.method8807(aClass56_5, (Class41_Sub9) null, local21.anInt10515, 1);
												} else {
													local1802.method8801(aClass56_5, (Class41_Sub9) null, 1);
													if (local21.aClass41_Sub7_8 != null) {
														Static563.aClass143_13.method6215(local21.aClass41_Sub7_8.method7079());
													}
												}
											} else if (local21.aBoolean774) {
												local1802.method8807(aClass56_5, (Class41_Sub9) null, local21.anInt10515 << 2, 1);
											} else {
												local1802.method8801(aClass56_5, (Class41_Sub9) null, 1);
												if (local21.aClass41_Sub7_8 != null) {
													Static563.aClass143_13.method6215(local21.aClass41_Sub7_8.method7079());
												}
											}
											if (Static489.aBoolean607) {
												Static563.aClass143_13.KA(arg6, arg9, arg4, arg7);
											}
											if (local21.aBoolean773) {
												Static563.aClass143_13.C(true);
											}
										}
										if (Static305.aBoolean315) {
											if (arg2) {
												Static430.method7439(local48, local62, local43, local55);
											} else {
												Static242.method8203(local43, local48, local55, local62);
											}
										}
									} else if (local21.anInt10479 == 9) {
										if (local21.aBoolean776) {
											local627 = local111 + local21.anInt10536;
											local1494 = local116;
											local278 = local116 + local21.anInt10532;
										} else {
											local1494 = local21.anInt10532 + local116;
											local627 = local21.anInt10536 + local111;
											local278 = local116;
										}
										if (local21.anInt10533 == 1) {
											Static563.aClass143_13.method6216(local111, local278, local627, local1494, local21.anInt10483, 0);
										} else {
											Static563.aClass143_13.method6200(local111, local278, local627, local1494, local21.anInt10483, local21.anInt10533);
										}
										if (Static305.aBoolean315) {
											if (arg2) {
												Static430.method7439(local48, local62, local43, local55);
											} else {
												Static242.method8203(local43, local48, local55, local62);
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
