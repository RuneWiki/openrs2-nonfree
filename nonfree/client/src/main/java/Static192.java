import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!bc;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1404 = Static161.method2452("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt3776 = -1;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1405 = Static161.method2452(")1");

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1406 = Static161.method2452("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1407 = Static161.method2452("Password: ");

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1408 = Static161.method2452("Select a world");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1409 = aClass20_1406;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1410 = Static161.method2452("Fps:");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1411 = aClass20_1407;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1412 = aClass20_1408;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static int anInt3781 = -1;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1413 = Static161.method2452(" ");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZZ)I")
	public static int method2855() {
		return Static9.anInt210 + Static26.anInt4032;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method2856() {
		Static64.aClass8_15.method233();
		Static126.aClass84_7.method2335();
		Static193.aClass8_36.method233();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wa;ZLclient!wa;BZ)V")
	public static void method2857(@OriginalArg(0) Class23 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(4) boolean arg3) {
		Static10.aClass23_7 = arg0;
		Static8.aClass23_5 = arg2;
		Static57.aBoolean70 = arg3;
		Static214.aBoolean186 = arg1;
		Static179.aClass84_19 = new Class84(30);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[Lclient!mf;IIIIIII)V")
	public static void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static42.method812(arg0, arg1, arg6, arg4);
		Static149.method2267();
		for (@Pc(14) int local14 = 0; local14 < arg2.length; local14++) {
			@Pc(20) Class69 local20 = arg2[local14];
			if (local20 != null && (local20.anInt2498 == arg5 || arg5 == -1412584499 && Static48.aClass69_4 == local20)) {
				@Pc(45) int local45;
				if (arg7 == -1) {
					Static52.anIntArray104[Static137.anInt2871] = arg8 + local20.anInt2536;
					Static55.anIntArray109[Static137.anInt2871] = arg3 + local20.anInt2539;
					Static49.anIntArray99[Static137.anInt2871] = local20.anInt2541;
					Static106.anIntArray237[Static137.anInt2871] = local20.anInt2471;
					local45 = Static137.anInt2871++;
				} else {
					local45 = arg7;
				}
				local20.anInt2548 = Static177.anInt3533;
				local20.anInt2510 = local45;
				if (!local20.aBoolean103 || !Static23.method326(local20)) {
					if (local20.anInt2550 > 0) {
						Static92.method1515(local20);
					}
					@Pc(104) int local104 = arg8 + local20.anInt2536;
					@Pc(107) int local107 = local20.anInt2540;
					@Pc(112) int local112 = local20.anInt2539 + arg3;
					if (Static148.aBoolean130 && (Static94.method1538(local20) != 0 || local20.anInt2474 == 0) && local107 > 127) {
						local107 = 127;
					}
					@Pc(157) int local157;
					@Pc(172) int local172;
					if (Static48.aClass69_4 == local20) {
						if (arg5 != -1412584499 && !local20.aBoolean107) {
							Static30.anInt578 = arg8;
							Static61.aClass69Array1 = arg2;
							Static110.anInt2298 = arg3;
							continue;
						}
						if (Static11.aBoolean11 && Static143.aBoolean128) {
							local157 = Static70.anInt1549;
							local157 -= Static65.anInt1420;
							if (Static95.anInt2011 > local157) {
								local157 = Static95.anInt2011;
							}
							local172 = Static207.anInt4069;
							local172 -= Static140.anInt2922;
							if (Static119.anInt2513 > local172) {
								local172 = Static119.anInt2513;
							}
							if (Static119.anInt2513 + Static119.aClass69_9.anInt2471 < local20.anInt2471 + local172) {
								local172 = Static119.anInt2513 + Static119.aClass69_9.anInt2471 - local20.anInt2471;
							}
							if (Static119.aClass69_9.anInt2541 + Static95.anInt2011 < local20.anInt2541 + local157) {
								local157 = Static95.anInt2011 + Static119.aClass69_9.anInt2541 - local20.anInt2541;
							}
							local112 = local172;
							local104 = local157;
						}
						if (!local20.aBoolean107) {
							local107 = 128;
						}
					}
					@Pc(240) int local240;
					@Pc(246) int local246;
					@Pc(267) int local267;
					@Pc(273) int local273;
					if (local20.anInt2474 == 2) {
						local240 = arg6;
						local172 = arg1;
						local157 = arg0;
						local246 = arg4;
					} else {
						local172 = arg1 < local112 ? local112 : arg1;
						local157 = arg0 < local104 ? local104 : arg0;
						local267 = local20.anInt2541 + local104;
						local273 = local112 + local20.anInt2471;
						if (local20.anInt2474 == 9) {
							local273++;
							local267++;
						}
						local246 = arg4 <= local273 ? arg4 : local273;
						local240 = local267 < arg6 ? local267 : arg6;
					}
					if (!local20.aBoolean103 || local157 < local240 && local172 < local246) {
						if (local20.anInt2550 != 0) {
							if (local20.anInt2550 == 1337) {
								Static131.anInt2717 = local112;
								anInt3776 = local104;
								Static41.method762(local20.anInt2541, local104, local20.anInt2471, local112);
								Static42.method812(arg0, arg1, arg6, arg4);
								continue;
							}
							if (local20.anInt2550 == 1338) {
								if (local20.method1892()) {
									Static2.method44(local112, local45, local20, local104);
									Static42.method812(arg0, arg1, arg6, arg4);
								}
								continue;
							}
							if (local20.anInt2550 == 1339) {
								if (local20.method1892()) {
									Static126.method797(local20, local45, local112, local104);
									Static42.method812(arg0, arg1, arg6, arg4);
								}
								continue;
							}
							if (local20.anInt2550 == 1400) {
								Static186.method2814(local20.anInt2541, local112, local20.anInt2471, local104);
								Static185.aBooleanArray43[local45] = true;
								Static75.aBooleanArray17[local45] = true;
								Static42.method812(arg0, arg1, arg6, arg4);
								continue;
							}
							if (local20.anInt2550 == 1401) {
								Static46.method845(local112, local104, local20.anInt2471, local20.anInt2541);
								Static185.aBooleanArray43[local45] = true;
								Static75.aBooleanArray17[local45] = true;
								Static42.method812(arg0, arg1, arg6, arg4);
								continue;
							}
						}
						if (local20.anInt2474 == 0 && local20.aBoolean116 && local157 <= Static70.anInt1549 && local172 <= Static207.anInt4069 && Static70.anInt1549 < local240 && local246 > Static207.anInt4069 && !Static104.aBoolean95 && !Static148.aBoolean130) {
							Static85.anInt1879 = 1;
							Static203.aClass20Array32[0] = Static141.aClass20_1110;
							Static151.aShortArray40[0] = 1006;
							Static193.aClass20Array31[0] = Static215.aClass20_1545;
						}
						local273 = Static207.anInt4069;
						local267 = Static70.anInt1549;
						if (!Static104.aBoolean95 && local267 >= local157 && local273 >= local172 && local267 < local240 && local246 > local273) {
							Static7.method170(local273 - local112, local267 + -local104, local20);
						}
						if (local20.anInt2474 == 0) {
							if (!local20.aBoolean103 && Static23.method326(local20) && local20 != Static86.aClass69_6) {
								continue;
							}
							if (!local20.aBoolean103) {
								if (local20.anInt2517 - local20.anInt2471 < local20.anInt2514) {
									local20.anInt2514 = local20.anInt2517 - local20.anInt2471;
								}
								if (local20.anInt2514 < 0) {
									local20.anInt2514 = 0;
								}
							}
							method2858(local157, local172, arg2, local112 - local20.anInt2514, local246, local20.anInt2523, local240, local45, local104 - local20.anInt2478);
							if (local20.aClass69Array2 != null) {
								method2858(local157, local172, local20.aClass69Array2, local112 - local20.anInt2514, local246, local20.anInt2523, local240, local45, local104 - local20.anInt2478);
							}
							@Pc(619) Class5_Sub25 local619 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local20.anInt2523);
							if (local619 != null) {
								if (local619.anInt3530 == 0 && Static70.anInt1549 >= local157 && local172 <= Static207.anInt4069 && local240 > Static70.anInt1549 && Static207.anInt4069 < local246 && !Static104.aBoolean95 && !Static148.aBoolean130) {
									Static203.aClass20Array32[0] = Static141.aClass20_1110;
									Static193.aClass20Array31[0] = Static215.aClass20_1545;
									Static85.anInt1879 = 1;
									Static151.aShortArray40[0] = 1006;
								}
								Static195.method2892(local172, local157, local246, local45, local104, local240, local619.anInt3526, local112);
							}
							Static42.method812(arg0, arg1, arg6, arg4);
							Static149.method2267();
						}
						if (Static139.aBooleanArray31[local45] || Static108.anInt2202 > 1) {
							if (local20.anInt2474 == 0 && !local20.aBoolean103 && local20.anInt2471 < local20.anInt2517) {
								Static117.method1867(local20.anInt2471, local20.anInt2541 + local104, local20.anInt2517, local20.anInt2514, local112);
							}
							if (local20.anInt2474 != 1) {
								@Pc(719) int local719;
								@Pc(723) int local723;
								@Pc(743) int local743;
								@Pc(921) int local921;
								@Pc(800) int local800;
								@Pc(717) int local717;
								@Pc(734) int local734;
								@Pc(937) int local937;
								if (local20.anInt2474 == 2) {
									local717 = 0;
									for (local719 = 0; local719 < local20.anInt2527; local719++) {
										for (local723 = 0; local723 < local20.anInt2533; local723++) {
											local734 = local112 + (local20.anInt2470 + 32) * local719;
											local743 = (local20.anInt2494 + 32) * local723 + local104;
											if (local717 < 20) {
												local743 += local20.anIntArray276[local717];
												local734 += local20.anIntArray279[local717];
											}
											if (local20.anIntArray277[local717] > 0) {
												local800 = local20.anIntArray277[local717] - 1;
												if (local743 + 32 > arg0 && local743 < arg6 && arg1 < local734 + 32 && local734 < arg4 || local20 == Static101.aClass69_7 && Static178.anInt3564 == local717) {
													@Pc(866) Class5_Sub2_Sub10 local866;
													if (Static57.anInt1307 == 1 && Static37.anInt1354 == local717 && Static96.anInt2016 == local20.anInt2523) {
														local866 = Static203.method3018(local20.aBoolean106, local800, local20.anIntArray286[local717], 0, 2);
													} else {
														local866 = Static203.method3018(local20.aBoolean106, local800, local20.anIntArray286[local717], 3153952, 1);
													}
													if (local866 == null) {
														Static184.method2779(local20);
													} else if (local20 == Static101.aClass69_7 && Static178.anInt3564 == local717) {
														local921 = Static207.anInt4069 - Static215.anInt4183;
														if (local921 < 5 && local921 > -5) {
															local921 = 0;
														}
														local937 = Static70.anInt1549 - Static146.anInt3035;
														if (local937 < 5 && local937 > -5) {
															local937 = 0;
														}
														if (Static208.anInt4083 < 5) {
															local937 = 0;
															local921 = 0;
														}
														local866.method2405(local743 + local937, local734 + local921, 128);
														if (arg5 != -1) {
															@Pc(975) Class69 local975 = arg2[arg5 & 0xFFFF];
															@Pc(977) int local977 = Static42.anInt974;
															@Pc(979) int local979 = Static42.anInt972;
															@Pc(1002) int local1002;
															if (local921 + local734 < local979 && local975.anInt2514 > 0) {
																local1002 = (local979 - local921 - local734) * Static176.anInt3529 / 3;
																if (Static176.anInt3529 * 10 < local1002) {
																	local1002 = Static176.anInt3529 * 10;
																}
																if (local1002 > local975.anInt2514) {
																	local1002 = local975.anInt2514;
																}
																Static215.anInt4183 += local1002;
																local975.anInt2514 -= local1002;
																Static184.method2779(local975);
															}
															if (local977 < local921 + local734 + 32 && local975.anInt2517 - local975.anInt2471 > local975.anInt2514) {
																local1002 = (local734 + local921 + 32 - local977) * Static176.anInt3529 / 3;
																if (Static176.anInt3529 * 10 < local1002) {
																	local1002 = Static176.anInt3529 * 10;
																}
																if (local975.anInt2517 - local975.anInt2514 - local975.anInt2471 < local1002) {
																	local1002 = local975.anInt2517 - local975.anInt2471 - local975.anInt2514;
																}
																local975.anInt2514 += local1002;
																Static215.anInt4183 -= local1002;
																Static184.method2779(local975);
															}
														}
													} else if (local20 == Static62.aClass69_5 && Static49.anInt1068 == local717) {
														local866.method2405(local743, local734, 128);
													} else {
														local866.method2403(local743, local734);
													}
												}
											} else if (local20.anIntArray278 != null && local717 < 20) {
												@Pc(776) Class5_Sub2_Sub10 local776 = local20.method1895(local717);
												if (local776 != null) {
													local776.method2403(local743, local734);
												} else if (Static9.aBoolean9) {
													Static184.method2779(local20);
												}
											}
											local717++;
										}
									}
								} else if (local20.anInt2474 == 3) {
									if (Static140.method2176(local20)) {
										local717 = local20.anInt2515;
										if (local20 == Static86.aClass69_6 && local20.anInt2499 != 0) {
											local717 = local20.anInt2499;
										}
									} else {
										local717 = local20.anInt2487;
										if (Static86.aClass69_6 == local20 && local20.anInt2528 != 0) {
											local717 = local20.anInt2528;
										}
									}
									if (local107 == 0) {
										if (local20.aBoolean110) {
											Static42.method824(local104, local112, local20.anInt2541, local20.anInt2471, local717);
										} else {
											Static42.method817(local104, local112, local20.anInt2541, local20.anInt2471, local717);
										}
									} else if (local20.aBoolean110) {
										Static42.method814(local104, local112, local20.anInt2541, local20.anInt2471, local717, 256 - (local107 & 0xFF));
									} else {
										Static42.method815(local104, local112, local20.anInt2541, local20.anInt2471, local717, 256 - (local107 & 0xFF));
									}
								} else {
									@Pc(1236) Class5_Sub2_Sub8 local1236;
									if (local20.anInt2474 == 4) {
										local1236 = local20.method1893(Static3.aClass47Array1);
										if (local1236 != null) {
											@Pc(1248) Class20 local1248 = local20.aClass20_920;
											if (Static140.method2176(local20)) {
												local719 = local20.anInt2515;
												if (Static86.aClass69_6 == local20 && local20.anInt2499 != 0) {
													local719 = local20.anInt2499;
												}
												if (local20.aClass20_921.method582() > 0) {
													local1248 = local20.aClass20_921;
												}
											} else {
												local719 = local20.anInt2487;
												if (local20 == Static86.aClass69_6 && local20.anInt2528 != 0) {
													local719 = local20.anInt2528;
												}
											}
											if (local20.aBoolean103 && local20.anInt2537 != -1) {
												@Pc(1307) Class5_Sub2_Sub11 local1307 = Static196.method2908(local20.anInt2537);
												local1248 = local1307.aClass20_861;
												if (local1248 == null) {
													local1248 = Static168.aClass20_1240;
												}
												if ((local1307.anInt2314 == 1 || local20.anInt2545 != 1) && local20.anInt2545 != -1) {
													local1248 = Static70.method1166(new Class20[] { Static171.aClass20_1270, local1248, Static147.aClass20_1150, Static179.method2708(local20.anInt2545) });
												}
											}
											if (local20 == Static133.aClass69_12) {
												local1248 = Static9.aClass20_103;
												local719 = local20.anInt2487;
											}
											if (!local20.aBoolean103) {
												local1248 = Static105.method1717(local20, local1248);
											}
											local1236.method1349(local1248, local104, local112, local20.anInt2541, local20.anInt2471, local719, local20.aBoolean108 ? 0 : -1, local20.anInt2544, local20.anInt2493, local20.anInt2501);
										} else if (Static9.aBoolean9) {
											Static184.method2779(local20);
										}
									} else if (local20.anInt2474 == 5) {
										@Pc(1412) Class5_Sub2_Sub10 local1412;
										if (local20.aBoolean103) {
											if (local20.anInt2537 == -1) {
												local1412 = local20.method1891(false);
											} else {
												local1412 = Static203.method3018(local20.aBoolean106, local20.anInt2537, local20.anInt2545, local20.anInt2516, local20.anInt2543);
											}
											if (local1412 != null) {
												local719 = local1412.anInt3216;
												local723 = local1412.anInt3219;
												if (local20.aBoolean109) {
													local743 = (local20.anInt2541 + local719 - 1) / local719;
													local734 = (local20.anInt2471 + local723 - 1) / local723;
													Static42.method806(local104, local112, local20.anInt2541 + local104, local112 + local20.anInt2471);
													for (local937 = 0; local937 < local743; local937++) {
														for (local921 = 0; local921 < local734; local921++) {
															if (local20.anInt2473 != 0) {
																local1412.method2406(4096, local112 + local723 * local921 + local723 / 2, local719 * local937 + (local104 - -(local719 / 2)), local20.anInt2473);
															} else if (local107 == 0) {
																local1412.method2403(local104 + local937 * local719, local921 * local723 + local112);
															} else {
																local1412.method2405(local937 * local719 + local104, local112 - -(local723 * local921), 256 - (local107 & 0xFF));
															}
														}
													}
													Static42.method812(arg0, arg1, arg6, arg4);
												} else {
													local743 = local20.anInt2541 * 4096 / local719;
													if (local20.anInt2473 != 0) {
														local1412.method2406(local743, local20.anInt2471 / 2 + local112, local104 - -(local20.anInt2541 / 2), local20.anInt2473);
													} else if (local107 != 0) {
														local1412.method2404(local104, local112, local20.anInt2541, local20.anInt2471, 256 - (local107 & 0xFF));
													} else if (local20.anInt2541 == local719 && local20.anInt2471 == local723) {
														local1412.method2403(local104, local112);
													} else {
														local1412.method2407(local104, local112, local20.anInt2541, local20.anInt2471);
													}
												}
											} else if (Static9.aBoolean9) {
												Static184.method2779(local20);
											}
										} else {
											local1412 = local20.method1891(Static140.method2176(local20));
											if (local1412 != null) {
												local1412.method2403(local104, local112);
											} else if (Static9.aBoolean9) {
												Static184.method2779(local20);
											}
										}
									} else {
										@Pc(1833) Class5_Sub2_Sub11 local1833;
										@Pc(1936) int local1936;
										if (local20.anInt2474 == 6) {
											@Pc(1698) boolean local1698 = Static140.method2176(local20);
											@Pc(1700) Class1_Sub1 local1700 = null;
											if (local1698) {
												local719 = local20.anInt2535;
											} else {
												local719 = local20.anInt2476;
											}
											local743 = 0;
											if (local20.anInt2537 != -1) {
												local1833 = Static196.method2908(local20.anInt2537);
												if (local1833 != null) {
													local1833 = local1833.method1776(local20.anInt2545);
													local1700 = local1833.method1782(0, 1, null);
													if (local1700 == null) {
														Static184.method2779(local20);
													} else {
														local743 = -local1700.method2449() / 2;
													}
												}
											} else if (local20.anInt2532 == 5) {
												if (local20.anInt2520 == -1) {
													local1700 = Static159.aClass56_2.method1699(-1, -1, null, null);
												} else {
													local734 = local20.anInt2520 & 0x7FF;
													if (local734 == Static65.anInt1414) {
														local734 = 2047;
													}
													@Pc(1748) Class1_Sub2_Sub2 local1748 = Static6.aClass1_Sub2_Sub2Array1[local734];
													@Pc(1757) Class5_Sub2_Sub22 local1757 = local719 == -1 ? null : Static14.method253(local719);
													if (local1748 != null && (int) local1748.aClass20_848.method595() << 11 == (local20.anInt2520 & 0xFFFFF800)) {
														local1700 = local1748.aClass56_1.method1699(local20.anInt2525, 0, null, local1757);
													}
												}
											} else if (local719 == -1) {
												local1700 = local20.method1896(Static210.aClass1_Sub2_Sub2_2.aClass56_1, local1698, null, -1);
												if (local1700 == null && Static9.aBoolean9) {
													Static184.method2779(local20);
												}
											} else {
												@Pc(1810) Class5_Sub2_Sub22 local1810 = Static14.method253(local719);
												local1700 = local20.method1896(Static210.aClass1_Sub2_Sub2_2.aClass56_1, local1698, local1810, local20.anInt2525);
												if (local1700 == null && Static9.aBoolean9) {
													Static184.method2779(local20);
												}
											}
											if (local1700 != null) {
												if (local20.anInt2481 <= 0) {
													local734 = 256;
												} else {
													local734 = (local20.anInt2541 << 8) / local20.anInt2481;
												}
												local921 = (local734 * local20.anInt2492 >> 8) + local104 + local20.anInt2541 / 2;
												if (local20.anInt2508 > 0) {
													local937 = (local20.anInt2471 << 8) / local20.anInt2508;
												} else {
													local937 = 256;
												}
												local800 = local112 + local20.anInt2471 / 2 + (local937 * local20.anInt2484 >> 8);
												Static149.method2266(local921, local800);
												local1936 = Class80.anIntArray324[local20.anInt2529] * local20.anInt2496 >> 16;
												@Pc(1946) int local1946 = Class80.anIntArray327[local20.anInt2529] * local20.anInt2496 >> 16;
												if (!local20.aBoolean103) {
													local1700.method673(local20.anInt2531, 0, local20.anInt2529, 0, local1936, local1946);
												} else if (local20.aBoolean102) {
													((Class1_Sub1_Sub1) local1700).method680(local20.anInt2531, local20.anInt2472, local20.anInt2529, local20.anInt2480, local743 + local1936 + local20.anInt2506, local1946 + local20.anInt2506, local20.anInt2496);
												} else {
													local1700.method673(local20.anInt2531, local20.anInt2472, local20.anInt2529, local20.anInt2480, local20.anInt2506 + local743 + local1936, local1946 + local20.anInt2506);
												}
												Static149.method2274();
											}
										} else {
											if (local20.anInt2474 == 7) {
												local1236 = local20.method1893(Static3.aClass47Array1);
												if (local1236 == null) {
													if (Static9.aBoolean9) {
														Static184.method2779(local20);
													}
													continue;
												}
												local719 = 0;
												for (local723 = 0; local723 < local20.anInt2527; local723++) {
													for (local743 = 0; local743 < local20.anInt2533; local743++) {
														if (local20.anIntArray277[local719] > 0) {
															local1833 = Static196.method2908(local20.anIntArray277[local719] - 1);
															@Pc(2093) Class20 local2093;
															if (local1833.anInt2314 != 1 && local20.anIntArray286[local719] == 1) {
																local2093 = Static70.method1166(new Class20[] { Static171.aClass20_1270, local1833.aClass20_861, Static43.aClass20_332 });
															} else {
																local2093 = Static70.method1166(new Class20[] { Static171.aClass20_1270, local1833.aClass20_861, Static147.aClass20_1150, Static179.method2708(local20.anIntArray286[local719]) });
															}
															local921 = (local20.anInt2494 + 115) * local743 + local104;
															local800 = local112 + local723 * (local20.anInt2470 + 12);
															if (local20.anInt2544 == 0) {
																local1236.method1334(local2093, local921, local800, local20.anInt2487, local20.aBoolean108 ? 0 : -1);
															} else if (local20.anInt2544 == 1) {
																local1236.method1350(local2093, local921 + 57, local800, local20.anInt2487, local20.aBoolean108 ? 0 : -1);
															} else {
																local1236.method1352(local2093, local921 + 115 - 1, local800, local20.anInt2487, local20.aBoolean108 ? 0 : -1);
															}
														}
														local719++;
													}
												}
											}
											if (local20.anInt2474 == 8 && Static186.aClass69_14 == local20 && Static115.anInt2418 == Static210.anInt923) {
												local717 = 0;
												local719 = 0;
												@Pc(2242) Class5_Sub2_Sub8 local2242 = Static165.aClass5_Sub2_Sub8_5;
												@Pc(2245) Class20 local2245 = local20.aClass20_920;
												local2245 = Static105.method1717(local20, local2245);
												@Pc(2266) Class20 local2266;
												while (local2245.method582() > 0) {
													local937 = local2245.method584(Static33.aClass20_259);
													if (local937 == -1) {
														local2266 = local2245;
														local2245 = Static215.aClass20_1545;
													} else {
														local2266 = local2245.method559(local937, 0);
														local2245 = local2245.method549(local937 + 4);
													}
													local921 = local2242.method1333(local2266);
													local719 += local2242.anInt1726 + 1;
													if (local921 > local717) {
														local717 = local921;
													}
												}
												local719 += 7;
												local921 = local112 + local20.anInt2471 + 5;
												if (arg4 < local921 + local719) {
													local921 = arg4 - local719;
												}
												local717 += 6;
												local937 = local104 + local20.anInt2541 - local717 - 5;
												if (local104 + 5 > local937) {
													local937 = local104 + 5;
												}
												if (arg6 < local717 + local937) {
													local937 = arg6 - local717;
												}
												Static42.method824(local937, local921, local717, local719, 16777120);
												Static42.method817(local937, local921, local717, local719, 0);
												local800 = local921 + local2242.anInt1726 + 2;
												local2245 = local20.aClass20_920;
												local2245 = Static105.method1717(local20, local2245);
												while (local2245.method582() > 0) {
													local1936 = local2245.method584(Static33.aClass20_259);
													if (local1936 == -1) {
														local2266 = local2245;
														local2245 = Static215.aClass20_1545;
													} else {
														local2266 = local2245.method559(local1936, 0);
														local2245 = local2245.method549(local1936 + 4);
													}
													local2242.method1334(local2266, local937 + 3, local800, 0, -1);
													local800 += local2242.anInt1726 + 1;
												}
											}
											if (local20.anInt2474 == 9) {
												if (local20.aBoolean112) {
													local723 = local104 + local20.anInt2541;
													local719 = local20.anInt2471 + local112;
													local743 = local112;
												} else {
													local723 = local20.anInt2541 + local104;
													local719 = local112;
													local743 = local112 + local20.anInt2471;
												}
												if (local20.anInt2502 == 1) {
													Static42.method805(local104, local719, local723, local743, local20.anInt2487);
												} else {
													Static42.method811(local104, local719, local723, local743, local20.anInt2487, local20.anInt2502);
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
}
