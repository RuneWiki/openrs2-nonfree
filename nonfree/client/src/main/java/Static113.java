import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!fc;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
	public static int[] anIntArray348 = new int[2048];

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public static int anInt2455 = 0;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1159 = Static134.method2017("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1160 = Static134.method2017("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	private static int anInt2461 = 2;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1717() {
		if (Static6.aClass53_1 != null) {
			@Pc(3) Class53 local3 = Static6.aClass53_1;
			synchronized (Static6.aClass53_1) {
				Static6.aClass53_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!la;Lclient!la;I)I")
	public static int method1718(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method293(Static43.aClass76_141, Static111.aClass76_1153)) {
			local5++;
		}
		if (arg0.method293(Static125.aClass76_1280, Static111.aClass76_1153)) {
			local5++;
		}
		if (arg0.method293(Static130.aClass76_1305, Static111.aClass76_1153)) {
			local5++;
		}
		if (arg0.method293(Static1.aClass76_5, Static111.aClass76_1153)) {
			local5++;
		}
		if (arg0.method293(Static7.aClass76_60, Static111.aClass76_1153)) {
			local5++;
		}
		if (arg0.method293(Static63.aClass76_684, Static111.aClass76_1153)) {
			local5++;
		}
		arg0.method293(Static119.aClass76_1219, Static111.aClass76_1153);
		arg0.method293(Static12.aClass76_100, Static111.aClass76_1153);
		arg0.method293(Static105.aClass76_1103, Static111.aClass76_1153);
		arg0.method293(Static125.aClass76_1283, Static111.aClass76_1153);
		arg0.method293(Static40.aClass76_486, Static111.aClass76_1153);
		return local5;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1719() {
		if (Static32.anInt812 > 1) {
			Static32.anInt812--;
		}
		if (Static39.anInt1120 > 0) {
			Static39.anInt1120--;
		}
		if (Static24.aBoolean43) {
			Static24.aBoolean43 = false;
			Static93.method1501();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static32.method478(); local29++) {
		}
		if (Static39.anInt1113 != 30) {
			return;
		}
		Static92.method1499(Static69.aClass4_Sub10_Sub1_2);
		@Pc(51) Object local51 = Static93.aClass20_1.anObject3;
		@Pc(83) int local83;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(106) int local106;
		@Pc(101) int local101;
		synchronized (Static93.aClass20_1.anObject3) {
			if (!Static28.aBoolean47) {
				Static93.aClass20_1.anInt543 = 0;
			} else if (Static38.anInt1093 != 0 || Static93.aClass20_1.anInt543 >= 40) {
				Static69.aClass4_Sub10_Sub1_2.method611(133);
				Static69.aClass4_Sub10_Sub1_2.method600(0);
				local83 = Static69.aClass4_Sub10_Sub1_2.anInt931;
				local85 = 0;
				for (local87 = 0; Static93.aClass20_1.anInt543 > local87 && Static69.aClass4_Sub10_Sub1_2.anInt931 - local83 < 240; local87++) {
					local85++;
					local101 = Static93.aClass20_1.anIntArray77[local87];
					local106 = Static93.aClass20_1.anIntArray78[local87];
					if (local101 < 0) {
						local101 = 0;
					} else if (local101 > 764) {
						local101 = 764;
					}
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 502) {
						local106 = 502;
					}
					@Pc(141) int local141 = local106 * 765 + local101;
					if (Static93.aClass20_1.anIntArray78[local87] == -1 && Static93.aClass20_1.anIntArray77[local87] == -1) {
						local141 = 524287;
						local106 = -1;
						local101 = -1;
					}
					if (local101 != Static78.anInt1982 || local106 != Static39.anInt1128) {
						@Pc(184) int local184 = local101 - Static78.anInt1982;
						Static78.anInt1982 = local101;
						@Pc(191) int local191 = local106 - Static39.anInt1128;
						Static39.anInt1128 = local106;
						if (Static70.anInt1783 < 8 && local184 >= -32 && local184 <= 31 && local191 >= -32 && local191 <= 31) {
							local184 += 32;
							local191 += 32;
							Static69.aClass4_Sub10_Sub1_2.method575((Static70.anInt1783 << 12) + (local184 << 6) + local191);
							Static70.anInt1783 = 0;
						} else if (Static70.anInt1783 < 8) {
							Static69.aClass4_Sub10_Sub1_2.method577((Static70.anInt1783 << 19) + local141 + 8388608);
							Static70.anInt1783 = 0;
						} else {
							Static69.aClass4_Sub10_Sub1_2.method597(local141 + (Static70.anInt1783 << 19) - 1073741824);
							Static70.anInt1783 = 0;
						}
					} else if (Static70.anInt1783 < 2047) {
						Static70.anInt1783++;
					}
				}
				Static69.aClass4_Sub10_Sub1_2.method558(Static69.aClass4_Sub10_Sub1_2.anInt931 - local83);
				if (local85 < Static93.aClass20_1.anInt543) {
					Static93.aClass20_1.anInt543 -= local85;
					for (local106 = 0; local106 < Static93.aClass20_1.anInt543; local106++) {
						Static93.aClass20_1.anIntArray77[local106] = Static93.aClass20_1.anIntArray77[local106 + local85];
						Static93.aClass20_1.anIntArray78[local106] = Static93.aClass20_1.anIntArray78[local106 + local85];
					}
				} else {
					Static93.aClass20_1.anInt543 = 0;
				}
			}
		}
		if (Static38.anInt1093 != 0) {
			@Pc(348) long local348 = (Static36.aLong37 - Static100.aLong79) / 50L;
			local83 = Static20.anInt427;
			Static100.aLong79 = Static36.aLong37;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 502) {
				local83 = 502;
			}
			if (local348 > 4095L) {
				local348 = 4095L;
			}
			local85 = Static75.anInt1928;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 764) {
				local85 = 764;
			}
			@Pc(396) byte local396 = 0;
			local87 = local83 * 765 + local85;
			local101 = (int) local348;
			if (Static38.anInt1093 == 2) {
				local396 = 1;
			}
			Static69.aClass4_Sub10_Sub1_2.method611(106);
			Static69.aClass4_Sub10_Sub1_2.method597((local396 << 19) + (local101 << 20) + local87);
		}
		if (Static42.aBooleanArray7[96] || Static42.aBooleanArray7[97] || Static42.aBooleanArray7[98] || Static42.aBooleanArray7[99]) {
			Static19.aBoolean70 = true;
		}
		if (Static27.anInt2816 > 0) {
			Static27.anInt2816--;
		}
		if (Static19.aBoolean70 && Static27.anInt2816 <= 0) {
			Static19.aBoolean70 = false;
			Static27.anInt2816 = 20;
			Static69.aClass4_Sub10_Sub1_2.method611(12);
			Static69.aClass4_Sub10_Sub1_2.method603(Static60.anInt1576);
			Static69.aClass4_Sub10_Sub1_2.method603(Static5.anInt111);
		}
		if (Static59.aBoolean96 && !Static17.aBoolean19) {
			Static17.aBoolean19 = true;
			Static69.aClass4_Sub10_Sub1_2.method611(36);
			Static69.aClass4_Sub10_Sub1_2.method600(1);
		}
		if (!Static59.aBoolean96 && Static17.aBoolean19) {
			Static17.aBoolean19 = false;
			Static69.aClass4_Sub10_Sub1_2.method611(36);
			Static69.aClass4_Sub10_Sub1_2.method600(0);
		}
		Static5.method67();
		if (Static39.anInt1113 != 30) {
			return;
		}
		Static49.method852();
		Static42.method794();
		Static67.anInt1720++;
		if (Static67.anInt1720 > 750) {
			Static93.method1501();
			return;
		}
		Static30.method968();
		Static27.method2003();
		Static58.method1013();
		if (Static118.anInt2555 != 0) {
			Static60.anInt1573 += 20;
			if (Static60.anInt1573 >= 400) {
				Static118.anInt2555 = 0;
			}
		}
		Static1.anInt5++;
		if (Static123.aClass4_Sub8_15 != null) {
			Static3.anInt2204++;
			if (Static3.anInt2204 >= 15) {
				Static63.method1095(Static123.aClass4_Sub8_15);
				Static123.aClass4_Sub8_15 = null;
			}
		}
		@Pc(670) Class4_Sub8 local670;
		if (Static23.aClass4_Sub8_7 != null) {
			Static63.method1095(Static23.aClass4_Sub8_7);
			if (Static2.anInt31 > Static42.anInt1163 + 5 || Static2.anInt31 < Static42.anInt1163 - 5 || Static126.anInt2734 > Static111.anInt2443 + 5 || Static126.anInt2734 < Static111.anInt2443 - 5) {
				Static75.aBoolean118 = true;
			}
			Static36.anInt1011++;
			if (Static122.anInt2680 == 0) {
				if (Static75.aBoolean118 && Static36.anInt1011 >= 5) {
					if (Static23.aClass4_Sub8_7 == Static132.aClass4_Sub8_16 && Static94.anInt2168 != Static106.anInt2352) {
						@Pc(668) byte local668 = 0;
						local670 = Static23.aClass4_Sub8_7;
						if (Static105.anInt2348 == 1 && local670.anInt458 == 206) {
							local668 = 1;
						}
						if (local670.anIntArray71[Static106.anInt2352] <= 0) {
							local668 = 0;
						}
						if (Static52.method941(Static35.method627(local670))) {
							local83 = Static94.anInt2168;
							local85 = Static106.anInt2352;
							local670.anIntArray71[local85] = local670.anIntArray71[local83];
							local670.anIntArray66[local85] = local670.anIntArray66[local83];
							local670.anIntArray71[local83] = -1;
							local670.anIntArray66[local83] = 0;
						} else if (local668 == 1) {
							local83 = Static94.anInt2168;
							local85 = Static106.anInt2352;
							while (local85 != local83) {
								if (local85 < local83) {
									local670.method322(local83, local83 - 1);
									local83--;
								} else if (local83 < local85) {
									local670.method322(local83, local83 + 1);
									local83++;
								}
							}
						} else {
							local670.method322(Static94.anInt2168, Static106.anInt2352);
						}
						Static69.aClass4_Sub10_Sub1_2.method611(120);
						Static69.aClass4_Sub10_Sub1_2.method592(local668);
						Static69.aClass4_Sub10_Sub1_2.method603(Static106.anInt2352);
						Static69.aClass4_Sub10_Sub1_2.method565(Static94.anInt2168);
						Static69.aClass4_Sub10_Sub1_2.method590(Static23.aClass4_Sub8_7.anInt514);
					}
				} else if ((Static8.anInt167 == 1 || Static5.method79(Static10.anInt206 - 1)) && Static10.anInt206 > 2) {
					Static105.method1614();
				} else if (Static10.anInt206 > 0) {
					Static129.method1936(Static10.anInt206 - 1);
				}
				Static3.anInt2204 = 10;
				Static38.anInt1093 = 0;
				Static23.aClass4_Sub8_7 = null;
			}
		}
		Static39.anInt1130 = 0;
		Static87.aBoolean120 = false;
		Static43.aBoolean17 = false;
		Static77.aClass4_Sub8_12 = null;
		local670 = Static40.aClass4_Sub8_8;
		@Pc(850) Class4_Sub8 local850 = Static65.aClass4_Sub8_4;
		Static40.aClass4_Sub8_8 = null;
		Static65.aClass4_Sub8_4 = null;
		while (Static45.method812() && Static39.anInt1130 < 128) {
			Static122.anIntArray389[Static39.anInt1130] = Static28.anInt589;
			Static41.anIntArray130[Static39.anInt1130] = Static78.anInt1984;
			Static39.anInt1130++;
		}
		Static23.method350(0, 0, 765, Static6.anInt132, 0, 503, 0);
		Static36.anInt1031++;
		while (true) {
			@Pc(892) Class4_Sub20 local892;
			@Pc(908) Class4_Sub8 local908;
			@Pc(897) Class4_Sub8 local897;
			do {
				local892 = (Class4_Sub20) Static72.aClass78_8.method1919();
				if (local892 == null) {
					while (true) {
						do {
							local892 = (Class4_Sub20) Static120.aClass78_13.method1919();
							if (local892 == null) {
								while (true) {
									do {
										local892 = (Class4_Sub20) Static97.aClass78_10.method1919();
										if (local892 == null) {
											if (Static17.aClass4_Sub8_1 != null) {
												Static132.method2009();
											}
											if (Static131.anInt2802 != -1) {
												local83 = Static131.anInt2802;
												local85 = Static131.anInt2779;
												@Pc(1057) boolean local1057 = Static68.method1136(0, 0, local83, 0, 0, true, local85, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
												if (local1057) {
													Static60.anInt1572 = Static20.anInt427;
													Static10.anInt204 = Static75.anInt1928;
													Static118.anInt2555 = 1;
													Static60.anInt1573 = 0;
												}
												Static131.anInt2802 = -1;
											}
											Static9.method112();
											if (Static40.aClass4_Sub8_8 != local670) {
												if (local670 != null) {
													Static63.method1095(local670);
												}
												if (Static40.aClass4_Sub8_8 != null) {
													Static63.method1095(Static40.aClass4_Sub8_8);
												}
											}
											if (local850 != Static65.aClass4_Sub8_4 && Static120.anInt2589 == Static39.anInt1123) {
												if (local850 != null) {
													Static63.method1095(local850);
												}
												if (Static65.aClass4_Sub8_4 != null) {
													Static63.method1095(Static65.aClass4_Sub8_4);
												}
											}
											if (Static65.aClass4_Sub8_4 == null) {
												if (Static120.anInt2589 > 0) {
													Static120.anInt2589--;
												}
											} else if (Static39.anInt1123 > Static120.anInt2589) {
												Static120.anInt2589++;
												if (Static120.anInt2589 == Static39.anInt1123) {
													Static63.method1095(Static65.aClass4_Sub8_4);
												}
											}
											Static29.method382();
											if (Static125.aBoolean155) {
												Static90.method1480();
											}
											for (local83 = 0; local83 < 5; local83++) {
												@Pc(1145) int local1145 = Static12.anIntArray37[local83]++;
											}
											local85 = Static2.method12();
											local87 = Static111.method1710();
											if (local85 > 4500 && local87 > 4500) {
												Static39.anInt1120 = 250;
												Static7.method96(4000);
												Static69.aClass4_Sub10_Sub1_2.method611(146);
											}
											Static63.anInt1634++;
											if (Static63.anInt1634 > 500) {
												Static63.anInt1634 = 0;
												local106 = (int) (Math.random() * 8.0D);
												if ((local106 & 0x1) == 1) {
													Static28.anInt580 += Static23.anInt537;
												}
												if ((local106 & 0x4) == 4) {
													Static85.anInt2045 += Static106.anInt2358;
												}
												if ((local106 & 0x2) == 2) {
													Static45.anInt1191 += Static68.anInt1730;
												}
											}
											if (Static28.anInt580 < -50) {
												Static23.anInt537 = 2;
											}
											if (Static85.anInt2045 < -40) {
												Static106.anInt2358 = 1;
											}
											if (Static28.anInt580 > 50) {
												Static23.anInt537 = -2;
											}
											if (Static45.anInt1191 < -55) {
												Static68.anInt1730 = 2;
											}
											if (Static85.anInt2045 > 40) {
												Static106.anInt2358 = -1;
											}
											if (Static45.anInt1191 > 55) {
												Static68.anInt1730 = -2;
											}
											Static87.anInt1970++;
											Static8.anInt166++;
											if (Static87.anInt1970 > 500) {
												local106 = (int) (Math.random() * 8.0D);
												if ((local106 & 0x1) == 1) {
													Static14.anInt244 += anInt2461;
												}
												if ((local106 & 0x2) == 2) {
													Static27.anInt2814 += Static93.anInt2154;
												}
												Static87.anInt1970 = 0;
											}
											if (Static27.anInt2814 < -20) {
												Static93.anInt2154 = 1;
											}
											if (Static27.anInt2814 > 10) {
												Static93.anInt2154 = -1;
											}
											if (Static14.anInt244 < -60) {
												anInt2461 = 2;
											}
											if (Static14.anInt244 > 60) {
												anInt2461 = -2;
											}
											if (Static8.anInt166 > 50) {
												Static69.aClass4_Sub10_Sub1_2.method611(25);
											}
											try {
												if (Static48.aClass75_4 != null && Static69.aClass4_Sub10_Sub1_2.anInt931 > 0) {
													Static48.aClass75_4.method1849(Static69.aClass4_Sub10_Sub1_2.anInt931, Static69.aClass4_Sub10_Sub1_2.aByteArray17);
													Static69.aClass4_Sub10_Sub1_2.anInt931 = 0;
													Static8.anInt166 = 0;
													return;
												}
												return;
											} catch (@Pc(1355) IOException local1355) {
												Static93.method1501();
												return;
											}
										}
										local897 = local892.aClass4_Sub8_14;
										if (local897.anInt466 < 0) {
											break;
										}
										local908 = Static52.method946(local897.anInt489);
									} while (local908 == null || local908.aClass4_Sub8Array1 == null || local897.anInt466 >= local908.aClass4_Sub8Array1.length || local908.aClass4_Sub8Array1[local897.anInt466] != local897);
									Static20.method307(local892);
								}
							}
							local897 = local892.aClass4_Sub8_14;
							if (local897.anInt466 < 0) {
								break;
							}
							local908 = Static52.method946(local897.anInt489);
						} while (local908 == null || local908.aClass4_Sub8Array1 == null || local897.anInt466 >= local908.aClass4_Sub8Array1.length || local897 != local908.aClass4_Sub8Array1[local897.anInt466]);
						Static20.method307(local892);
					}
				}
				local897 = local892.aClass4_Sub8_14;
				if (local897.anInt466 < 0) {
					break;
				}
				local908 = Static52.method946(local897.anInt489);
			} while (local908 == null || local908.aClass4_Sub8Array1 == null || local897.anInt466 >= local908.aClass4_Sub8Array1.length || local897 != local908.aClass4_Sub8Array1[local897.anInt466]);
			Static20.method307(local892);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public static void method1720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static39.anInt1125 == 0 && !Static18.aBoolean21) {
			Static79.method551(9, 0, arg0 - arg3, arg2 - arg1, Static15.aClass76_132, Static133.aClass76_1322);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static116.anInt2527; local33++) {
			@Pc(41) int local41 = Static116.anIntArray378[local33];
			@Pc(47) int local47 = local41 >> 7 & 0x7F;
			@Pc(51) int local51 = local41 & 0x7F;
			@Pc(57) int local57 = local41 >> 29 & 0x3;
			@Pc(63) int local63 = local41 >> 14 & 0x7FFF;
			if (local31 != local41) {
				local31 = local41;
				@Pc(111) int local111;
				if (local57 == 2 && Static54.aClass81_10.method1982(Static124.anInt2712, local51, local47, local41) >= 0) {
					@Pc(82) Class4_Sub4_Sub8 local82 = Static104.method1600(local63);
					if (local82.anIntArray192 != null) {
						local82 = local82.method994();
					}
					if (local82 == null) {
						continue;
					}
					if (Static39.anInt1125 == 1) {
						Static79.method551(15, local41, local47, local51, Static73.aClass76_814, Static59.method1017(new Class76[] { Static49.aClass76_557, Static132.aClass76_1318, local82.aClass76_636 }));
					} else if (!Static18.aBoolean21) {
						@Pc(101) Class76[] local101 = local82.aClass76Array13;
						if (Static55.aBoolean83) {
							local101 = Static63.method1091(local101);
						}
						if (local101 != null) {
							for (local111 = 4; local111 >= 0; local111--) {
								if (local101[local111] != null) {
									@Pc(119) short local119 = 0;
									if (local111 == 0) {
										local119 = 8;
									}
									if (local111 == 1) {
										local119 = 4;
									}
									if (local111 == 2) {
										local119 = 38;
									}
									if (local111 == 3) {
										local119 = 30;
									}
									if (local111 == 4) {
										local119 = 1001;
									}
									Static79.method551(local119, local41, local47, local51, local101[local111], Static59.method1017(new Class76[] { Static121.aClass76_1236, local82.aClass76_636 }));
								}
							}
						}
						Static79.method551(1006, local82.anInt1525 << 14, local47, local51, Static130.aClass76_1306, Static59.method1017(new Class76[] { Static121.aClass76_1236, local82.aClass76_636 }));
					} else if ((Static119.anInt2563 & 0x4) == 4) {
						Static79.method551(42, local41, local47, local51, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static132.aClass76_1318, local82.aClass76_636 }));
					}
				}
				@Pc(307) int local307;
				@Pc(315) Class4_Sub4_Sub3_Sub1_Sub1 local315;
				@Pc(366) Class4_Sub4_Sub3_Sub1_Sub2 local366;
				if (local57 == 1) {
					@Pc(284) Class4_Sub4_Sub3_Sub1_Sub1 local284 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local63];
					if (local284.aClass4_Sub4_Sub10_1.anInt1706 == 1 && (local284.anInt1393 & 0x7F) == 64 && (local284.anInt1416 & 0x7F) == 64) {
						for (local307 = 0; local307 < Static76.anInt1935; local307++) {
							local315 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local307]];
							if (local315 != null && local284 != local315 && local315.aClass4_Sub4_Sub10_1.anInt1706 == 1 && local284.anInt1393 == local315.anInt1393 && local284.anInt1416 == local315.anInt1416) {
								Static106.method1615(Static47.anIntArray153[local307], local315.aClass4_Sub4_Sub10_1, local47, local51);
							}
						}
						for (local111 = 0; local111 < Static106.anInt2357; local111++) {
							local366 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[anIntArray348[local111]];
							if (local366 != null && local366.anInt1393 == local284.anInt1393 && local366.anInt1416 == local284.anInt1416) {
								Static134.method2016(local51, local47, anIntArray348[local111], local366);
							}
						}
					}
					Static106.method1615(local63, local284.aClass4_Sub4_Sub10_1, local47, local51);
				}
				if (local57 == 0) {
					@Pc(407) Class4_Sub4_Sub3_Sub1_Sub2 local407 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local63];
					if ((local407.anInt1393 & 0x7F) == 64 && (local407.anInt1416 & 0x7F) == 64) {
						for (local307 = 0; local307 < Static76.anInt1935; local307++) {
							local315 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local307]];
							if (local315 != null && local315.aClass4_Sub4_Sub10_1.anInt1706 == 1 && local315.anInt1393 == local407.anInt1393 && local315.anInt1416 == local407.anInt1416) {
								Static106.method1615(Static47.anIntArray153[local307], local315.aClass4_Sub4_Sub10_1, local47, local51);
							}
						}
						for (local111 = 0; local111 < Static106.anInt2357; local111++) {
							local366 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[anIntArray348[local111]];
							if (local366 != null && local407 != local366 && local366.anInt1393 == local407.anInt1393 && local366.anInt1416 == local407.anInt1416) {
								Static134.method2016(local51, local47, anIntArray348[local111], local366);
							}
						}
					}
					Static134.method2016(local51, local47, local63, local407);
				}
				if (local57 == 3) {
					@Pc(527) Class78 local527 = Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local51][local47];
					if (local527 != null) {
						for (@Pc(534) Class4_Sub4_Sub3_Sub3 local534 = (Class4_Sub4_Sub3_Sub3) local527.method1924(); local534 != null; local534 = (Class4_Sub4_Sub3_Sub3) local527.method1927()) {
							@Pc(541) Class4_Sub4_Sub7 local541 = Static61.method1040(local534.anInt1200);
							if (Static39.anInt1125 == 1) {
								Static79.method551(39, local534.anInt1200, local47, local51, Static73.aClass76_814, Static59.method1017(new Class76[] { Static49.aClass76_557, Static101.aClass76_1062, local541.aClass76_556 }));
							} else if (!Static18.aBoolean21) {
								@Pc(555) Class76[] local555 = local541.aClass76Array11;
								if (Static55.aBoolean83) {
									local555 = Static63.method1091(local555);
								}
								for (@Pc(563) int local563 = 4; local563 >= 0; local563--) {
									if (local555 != null && local555[local563] != null) {
										@Pc(607) byte local607 = 0;
										if (local563 == 0) {
											local607 = 49;
										}
										if (local563 == 1) {
											local607 = 24;
										}
										if (local563 == 2) {
											local607 = 18;
										}
										if (local563 == 3) {
											local607 = 12;
										}
										if (local563 == 4) {
											local607 = 22;
										}
										Static79.method551(local607, local534.anInt1200, local47, local51, local555[local563], Static59.method1017(new Class76[] { Static54.aClass76_1195, local541.aClass76_556 }));
									} else if (local563 == 2) {
										Static79.method551(18, local534.anInt1200, local47, local51, Static35.aClass76_412, Static59.method1017(new Class76[] { Static54.aClass76_1195, local541.aClass76_556 }));
									}
								}
								Static79.method551(1007, local534.anInt1200, local47, local51, Static130.aClass76_1306, Static59.method1017(new Class76[] { Static54.aClass76_1195, local541.aClass76_556 }));
							} else if ((Static119.anInt2563 & 0x1) == 1) {
								Static79.method551(45, local534.anInt1200, local47, local51, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static101.aClass76_1062, local541.aClass76_556 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!dd;II)Lclient!v;")
	public static Class76 method1721(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (!Static104.method1602(arg1, Static35.method627(arg0)) && arg0.anObjectArray23 == null) {
			return null;
		} else if (arg0.aClass76Array3 == null || arg0.aClass76Array3.length <= arg1 || arg0.aClass76Array3[arg1] == null || arg0.aClass76Array3[arg1].method1883().method1851() == 0) {
			return Static99.aBoolean157 ? Static59.method1017(new Class76[] { Static75.aClass76_826, Static63.method1092(arg1) }) : null;
		} else {
			return arg0.aClass76Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method1722() {
		aClass76_1160 = null;
		aClass76_1159 = null;
		aBooleanArray15 = null;
		aClass24_6 = null;
		aShortArrayArray6 = null;
		anIntArray348 = null;
	}
}
