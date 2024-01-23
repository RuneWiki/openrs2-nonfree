import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
	public static int anInt4794;

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1291 = null;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1292 = Static231.method3737("::clientdrop");

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
	public static int[] anIntArray369 = new int[128];

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public static void method3594() {
		if (Static37.anInt769 > 0) {
			Static37.anInt769--;
		}
		if (Static207.anInt4426 > 1) {
			Static90.anInt1963 = Static218.anInt4760;
			Static207.anInt4426--;
		}
		if (Static191.aBoolean371) {
			Static191.aBoolean371 = false;
			Static38.method718();
			return;
		}
		for (@Pc(41) int local41 = 0; local41 < 100 && Static80.method1379(); local41++) {
		}
		if (Static178.anInt3884 != 30) {
			return;
		}
		Static140.method658(Static193.aClass1_Sub26_Sub1_2);
		@Pc(67) Object local67 = Static35.aClass121_1.anObject5;
		@Pc(90) int local90;
		@Pc(96) int local96;
		@Pc(98) int local98;
		@Pc(112) int local112;
		@Pc(118) int local118;
		synchronized (Static35.aClass121_1.anObject5) {
			if (!Static20.aBoolean199) {
				Static35.aClass121_1.anInt4831 = 0;
			} else if (Static95.anInt2075 != 0 || Static35.aClass121_1.anInt4831 >= 40) {
				Static193.aClass1_Sub26_Sub1_2.method3000(138);
				Static193.aClass1_Sub26_Sub1_2.method2967(0);
				local90 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
				local96 = 0;
				for (local98 = 0; local98 < Static35.aClass121_1.anInt4831 && Static193.aClass1_Sub26_Sub1_2.anInt4021 - local90 < 240; local98++) {
					local112 = Static35.aClass121_1.anIntArray372[local98];
					local96++;
					local118 = Static35.aClass121_1.anIntArray371[local98];
					@Pc(120) boolean local120 = false;
					if (local112 < 0) {
						local112 = 0;
					} else if (local112 > 65534) {
						local112 = 65534;
					}
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 65534) {
						local118 = 65534;
					}
					if (Static35.aClass121_1.anIntArray372[local98] == -1 && Static35.aClass121_1.anIntArray371[local98] == -1) {
						local112 = -1;
						local120 = true;
						local118 = -1;
					}
					if (Static35.anInt744 != local118 || Static214.anInt4634 != local112) {
						@Pc(194) int local194 = local112 - Static214.anInt4634;
						Static214.anInt4634 = local112;
						@Pc(201) int local201 = local118 - Static35.anInt744;
						Static35.anInt744 = local118;
						if (Static97.anInt2097 < 8 && local201 >= -32 && local201 <= 31 && local194 >= -32 && local194 <= 31) {
							local201 += 32;
							local194 += 32;
							Static193.aClass1_Sub26_Sub1_2.method2963(local194 + (local201 << 6) + (Static97.anInt2097 << 12));
							Static97.anInt2097 = 0;
						} else if (Static97.anInt2097 < 32 && local201 >= -128 && local201 <= 127 && local194 >= -128 && local194 <= 127) {
							local201 += 128;
							local194 += 128;
							Static193.aClass1_Sub26_Sub1_2.method2967(Static97.anInt2097 + 128);
							Static193.aClass1_Sub26_Sub1_2.method2963((local201 << 8) + local194);
							Static97.anInt2097 = 0;
						} else if (Static97.anInt2097 < 32) {
							Static193.aClass1_Sub26_Sub1_2.method2967(Static97.anInt2097 + 192);
							if (local120) {
								Static193.aClass1_Sub26_Sub1_2.method2973(Integer.MIN_VALUE);
							} else {
								Static193.aClass1_Sub26_Sub1_2.method2973(local118 | local112 << 16);
							}
							Static97.anInt2097 = 0;
						} else {
							Static193.aClass1_Sub26_Sub1_2.method2963(Static97.anInt2097 + 57344);
							if (local120) {
								Static193.aClass1_Sub26_Sub1_2.method2973(Integer.MIN_VALUE);
							} else {
								Static193.aClass1_Sub26_Sub1_2.method2973(local118 | local112 << 16);
							}
							Static97.anInt2097 = 0;
						}
					} else if (Static97.anInt2097 < 2047) {
						Static97.anInt2097++;
					}
				}
				Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local90);
				if (local96 >= Static35.aClass121_1.anInt4831) {
					Static35.aClass121_1.anInt4831 = 0;
				} else {
					Static35.aClass121_1.anInt4831 -= local96;
					for (local112 = 0; local112 < Static35.aClass121_1.anInt4831; local112++) {
						Static35.aClass121_1.anIntArray371[local112] = Static35.aClass121_1.anIntArray371[local96 + local112];
						Static35.aClass121_1.anIntArray372[local112] = Static35.aClass121_1.anIntArray372[local112 + local96];
					}
				}
			}
		}
		if (Static95.anInt2075 != 0) {
			@Pc(428) long local428 = (Static232.aLong155 - Static104.aLong120) / 50L;
			Static104.aLong120 = Static232.aLong155;
			local96 = Static20.anInt2218;
			if (local428 > 32767L) {
				local428 = 32767L;
			}
			local112 = (int) local428;
			local90 = Static161.anInt3533;
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 65535) {
				local90 = 65535;
			}
			@Pc(459) byte local459 = 0;
			if (Static95.anInt2075 == 2) {
				local459 = 1;
			}
			if (local96 < 0) {
				local96 = 0;
			} else if (local96 > 65535) {
				local96 = 65535;
			}
			Static193.aClass1_Sub26_Sub1_2.method3000(169);
			Static193.aClass1_Sub26_Sub1_2.method2949(local459 << 15 | local112);
			Static193.aClass1_Sub26_Sub1_2.method2951(local96 | local90 << 16);
		}
		if (Static47.anInt1069 > 0) {
			Static47.anInt1069--;
		}
		if (Static132.aBooleanArray19[96] || Static132.aBooleanArray19[97] || Static132.aBooleanArray19[98] || Static132.aBooleanArray19[99]) {
			Static22.aBoolean35 = true;
		}
		if (Static22.aBoolean35 && Static47.anInt1069 <= 0) {
			Static47.anInt1069 = 20;
			Static22.aBoolean35 = false;
			Static193.aClass1_Sub26_Sub1_2.method3000(171);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static88.anInt1924);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static79.anInt1741);
		}
		if (Static194.aBoolean377 && !Static192.aBoolean373) {
			Static192.aBoolean373 = true;
			Static193.aClass1_Sub26_Sub1_2.method3000(158);
			Static193.aClass1_Sub26_Sub1_2.method2967(1);
		}
		if (!Static194.aBoolean377 && Static192.aBoolean373) {
			Static192.aBoolean373 = false;
			Static193.aClass1_Sub26_Sub1_2.method3000(158);
			Static193.aClass1_Sub26_Sub1_2.method2967(0);
		}
		if (!Static195.aBoolean382) {
			Static193.aClass1_Sub26_Sub1_2.method3000(232);
			Static193.aClass1_Sub26_Sub1_2.method2994(Static163.method2613());
			Static195.aBoolean382 = true;
		}
		Static85.method1435();
		if (Static178.anInt3884 != 30) {
			return;
		}
		Static56.method1119();
		Static144.method2375();
		Static114.anInt2522++;
		if (Static114.anInt2522 > 750) {
			Static38.method718();
			return;
		}
		Static107.method1859();
		Static212.method3409();
		Static126.method2113();
		if (Static66.aClass86_3 != null) {
			Static151.method2477();
		}
		for (@Pc(648) int local648 = Static29.method576(true); local648 != -1; local648 = Static29.method576(false)) {
			Static126.method2109(local648);
			Static36.anIntArray80[Static173.anInt3758++ & 0x1F] = local648;
		}
		for (@Pc(673) Class1_Sub2_Sub19 local673 = Static196.method3172(); local673 != null; local673 = Static196.method3172()) {
			local90 = local673.method3685();
			local96 = local673.method3690();
			if (local90 == 1) {
				Static87.anIntArray198[local96] = local673.anInt4916;
				Static201.anIntArray353[Static133.anInt2874++ & 0x1F] = local96;
			} else if (local90 == 2) {
				Static23.aClass107Array2[local96] = local673.aClass107_1333;
				Static157.anIntArray301[Static73.anInt1674++ & 0x1F] = local96;
			}
		}
		Static204.anInt2498++;
		if (Static217.anInt4746 != 0) {
			Static228.anInt4955 += 20;
			if (Static228.anInt4955 >= 400) {
				Static217.anInt4746 = 0;
			}
		}
		if (Static213.aClass86_15 != null) {
			Static157.anInt3441++;
			if (Static157.anInt3441 >= 15) {
				Static16.method354(Static213.aClass86_15);
				Static213.aClass86_15 = null;
			}
		}
		@Pc(821) Class86 local821;
		if (Static67.aClass86_4 != null) {
			Static16.method354(Static67.aClass86_4);
			Static130.anInt2833++;
			if (Static67.anInt1559 + 5 < Static220.anInt4822 || Static67.anInt1559 - 5 > Static220.anInt4822 || Static181.anInt4311 > Static56.anInt1412 + 5 || Static181.anInt4311 < Static56.anInt1412 - 5) {
				Static54.aBoolean120 = true;
			}
			if (Static198.anInt4319 == 0) {
				if (Static54.aBoolean120 && Static130.anInt2833 >= 5) {
					if (Static67.aClass86_4 == Static233.aClass86_17 && Static82.anInt1781 != Static15.anInt340) {
						@Pc(819) byte local819 = 0;
						local821 = Static67.aClass86_4;
						if (Static125.anInt2700 == 1 && local821.anInt3285 == 206) {
							local819 = 1;
						}
						if (local821.anIntArray285[Static82.anInt1781] <= 0) {
							local819 = 0;
						}
						if (Static27.method478(Static34.method676(local821))) {
							local98 = Static15.anInt340;
							local112 = Static82.anInt1781;
							local821.anIntArray285[local112] = local821.anIntArray285[local98];
							local821.anIntArray275[local112] = local821.anIntArray275[local98];
							local821.anIntArray285[local98] = -1;
							local821.anIntArray275[local98] = 0;
						} else if (local819 == 1) {
							local98 = Static15.anInt340;
							local112 = Static82.anInt1781;
							while (local98 != local112) {
								if (local112 < local98) {
									local821.method2436(local98 - 1, local98);
									local98--;
								} else if (local112 > local98) {
									local821.method2436(local98 + 1, local98);
									local98++;
								}
							}
						} else {
							local821.method2436(Static82.anInt1781, Static15.anInt340);
						}
						Static193.aClass1_Sub26_Sub1_2.method3000(142);
						Static193.aClass1_Sub26_Sub1_2.method2963(Static15.anInt340);
						Static193.aClass1_Sub26_Sub1_2.method2973(Static67.aClass86_4.anInt3239);
						Static193.aClass1_Sub26_Sub1_2.method2954(local819);
						Static193.aClass1_Sub26_Sub1_2.method2988(Static82.anInt1781);
					}
				} else if ((Static159.anInt3500 == 1 || Static206.method3282(Static8.anInt259 - 1)) && Static8.anInt259 > 2 || Static157.anInt3442 == 1) {
					Static115.method2004();
				} else if (Static8.anInt259 > 0 || Static157.anInt3442 == 2) {
					Static222.method2962(Static8.anInt259 - 1);
				}
				Static95.anInt2075 = 0;
				Static67.aClass86_4 = null;
				Static157.anInt3441 = 10;
			}
		}
		Static150.anInt3332 = 0;
		Static151.aBoolean291 = false;
		local821 = Static215.aClass86_16;
		Static96.aClass86_6 = null;
		Static185.aBoolean438 = false;
		@Pc(1003) Class86 local1003 = Static146.aClass86_7;
		Static146.aClass86_7 = null;
		Static215.aClass86_16 = null;
		while (Static90.method1530() && Static150.anInt3332 < 128) {
			Static81.anIntArray178[Static150.anInt3332] = Static80.anInt1768;
			anIntArray369[Static150.anInt3332] = Static141.anInt3118;
			Static150.anInt3332++;
		}
		Static66.aClass86_3 = null;
		if (Static77.anInt1732 != -1) {
			Static105.method1797(0, 0, 0, Static158.anInt3484, 0, Static77.anInt1732, Static180.anInt4990);
		}
		Static218.anInt4760++;
		while (true) {
			@Pc(1053) Class1_Sub22 local1053;
			@Pc(1069) Class86 local1069;
			@Pc(1058) Class86 local1058;
			do {
				local1053 = (Class1_Sub22) Static91.aClass120_11.method3566();
				if (local1053 == null) {
					while (true) {
						do {
							local1053 = (Class1_Sub22) Static70.aClass120_8.method3566();
							if (local1053 == null) {
								while (true) {
									do {
										local1053 = (Class1_Sub22) Static146.aClass120_17.method3566();
										if (local1053 == null) {
											if (Static141.aBoolean263 && Static66.aClass86_3 == null) {
												Static141.aBoolean263 = false;
											}
											if (Static54.aClass86_1 != null) {
												Static221.method3627();
											}
											if (Static156.anInt3417 > 0 && Static132.aBooleanArray19[82] && Static132.aBooleanArray19[81] && Static178.anInt3882 != 0) {
												local98 = Static191.anInt4237 - Static178.anInt3882;
												if (local98 < 0) {
													local98 = 0;
												} else if (local98 > 3) {
													local98 = 3;
												}
												Static132.method2195(Static152.anInt3377 + Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], local98, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0] + Static36.anInt764);
											}
											if (Static192.anInt4246 != -1) {
												local112 = Static59.anInt1434;
												local98 = Static192.anInt4246;
												if (Static156.anInt3417 > 0 && Static132.aBooleanArray19[82] && Static132.aBooleanArray19[81]) {
													Static132.method2195(local112 + Static152.anInt3377, Static191.anInt4237, Static36.anInt764 + local98);
												} else {
													@Pc(1308) boolean local1308 = Static119.method2054(0, local112, 0, local98, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, true, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 0);
													if (local1308) {
														Static228.anInt4955 = 0;
														Static217.anInt4746 = 1;
														Static163.anInt3549 = Static20.anInt2218;
														Static118.anInt2619 = Static161.anInt3533;
													}
												}
												Static192.anInt4246 = -1;
											}
											Static25.method452();
											if (Static215.aClass86_16 != local821) {
												if (local821 != null) {
													Static16.method354(local821);
												}
												if (Static215.aClass86_16 != null) {
													Static16.method354(Static215.aClass86_16);
												}
											}
											if (Static146.aClass86_7 != local1003 && Static47.anInt1062 == Static92.anInt1989) {
												if (local1003 != null) {
													Static16.method354(local1003);
												}
												if (Static146.aClass86_7 != null) {
													Static16.method354(Static146.aClass86_7);
												}
											}
											if (Static146.aClass86_7 == null) {
												if (Static92.anInt1989 > 0) {
													Static92.anInt1989--;
												}
											} else if (Static47.anInt1062 > Static92.anInt1989) {
												Static92.anInt1989++;
												if (Static47.anInt1062 == Static92.anInt1989) {
													Static16.method354(Static146.aClass86_7);
												}
											}
											if (Static61.anInt1480 == 1) {
												Static230.method3728();
											} else if (Static61.anInt1480 == 2) {
												Static138.method2316();
											} else {
												Static178.method2832();
											}
											for (local98 = 0; local98 < 5; local98++) {
												@Pc(1417) int local1417 = Static86.anIntArray197[local98]++;
											}
											local112 = Static31.method2202();
											local118 = Static8.method250();
											if (local112 > 4500 && local118 > 4500) {
												Static37.anInt769 = 250;
												Static71.method1279(4000);
												Static193.aClass1_Sub26_Sub1_2.method3000(225);
											}
											Static231.anInt4995++;
											Static185.anInt4913++;
											@Pc(1471) int local1471;
											if (Static231.anInt4995 > 500) {
												Static231.anInt4995 = 0;
												local1471 = (int) (Math.random() * 8.0D);
												if ((local1471 & 0x1) == 1) {
													Static152.anInt3367 += Static71.anInt1632;
												}
												if ((local1471 & 0x4) == 4) {
													Static143.anInt3135 += Static71.anInt1630;
												}
												if ((local1471 & 0x2) == 2) {
													Static162.anInt3539 += Static200.anInt3493;
												}
											}
											if (Static152.anInt3367 < -50) {
												Static71.anInt1632 = 2;
											}
											if (Static162.anInt3539 < -55) {
												Static200.anInt3493 = 2;
											}
											Static15.anInt341++;
											if (Static152.anInt3367 > 50) {
												Static71.anInt1632 = -2;
											}
											if (Static15.anInt341 > 500) {
												Static15.anInt341 = 0;
												local1471 = (int) (Math.random() * 8.0D);
												if ((local1471 & 0x1) == 1) {
													Static123.anInt2690 += Static159.anInt3502;
												}
												if ((local1471 & 0x2) == 2) {
													Static174.anInt3796 += Static125.anInt2701;
												}
											}
											if (Static143.anInt3135 < -40) {
												Static71.anInt1630 = 1;
											}
											if (Static174.anInt3796 < -20) {
												Static125.anInt2701 = 1;
											}
											if (Static123.anInt2690 < -60) {
												Static159.anInt3502 = 2;
											}
											if (Static123.anInt2690 > 60) {
												Static159.anInt3502 = -2;
											}
											if (Static162.anInt3539 > 55) {
												Static200.anInt3493 = -2;
											}
											if (Static143.anInt3135 > 40) {
												Static71.anInt1630 = -1;
											}
											if (Static174.anInt3796 > 10) {
												Static125.anInt2701 = -1;
											}
											if (Static185.anInt4913 > 50) {
												Static193.aClass1_Sub26_Sub1_2.method3000(120);
											}
											Static71.method1282();
											try {
												if (Static167.aClass82_3 != null && Static193.aClass1_Sub26_Sub1_2.anInt4021 > 0) {
													Static167.aClass82_3.method2399(Static193.aClass1_Sub26_Sub1_2.anInt4021, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
													Static185.anInt4913 = 0;
													Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
													return;
												}
												return;
											} catch (@Pc(1627) IOException local1627) {
												Static38.method718();
												return;
											}
										}
										local1058 = local1053.aClass86_10;
										if (local1058.anInt3219 < 0) {
											break;
										}
										local1069 = Static13.method333(local1058.anInt3225);
									} while (local1069 == null || local1069.aClass86Array1 == null || local1069.aClass86Array1.length <= local1058.anInt3219 || local1058 != local1069.aClass86Array1[local1058.anInt3219]);
									Static60.method1156(local1053);
								}
							}
							local1058 = local1053.aClass86_10;
							if (local1058.anInt3219 < 0) {
								break;
							}
							local1069 = Static13.method333(local1058.anInt3225);
						} while (local1069 == null || local1069.aClass86Array1 == null || local1058.anInt3219 >= local1069.aClass86Array1.length || local1058 != local1069.aClass86Array1[local1058.anInt3219]);
						Static60.method1156(local1053);
					}
				}
				local1058 = local1053.aClass86_10;
				if (local1058.anInt3219 < 0) {
					break;
				}
				local1069 = Static13.method333(local1058.anInt3225);
			} while (local1069 == null || local1069.aClass86Array1 == null || local1058.anInt3219 >= local1069.aClass86Array1.length || local1069.aClass86Array1[local1058.anInt3219] != local1058);
			Static60.method1156(local1053);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!jb;IIZ)Lclient!ka;")
	public static Class64_Sub1 method3595(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		return Static83.method1393(arg1, arg0) ? Static31.method2206() : null;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	public static void method3596() {
		Static165.aClass61_43.method1697();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IB)I")
	public static int method3597(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!jb;ILclient!sc;)Lclient!uf;")
	public static Class119 method3599(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class107 arg1) {
		@Pc(12) int local12 = arg0.method837(arg1);
		if (local12 == -1) {
			return new Class119(0);
		}
		@Pc(26) int[] local26 = arg0.method830(local12);
		@Pc(32) Class119 local32 = new Class119(local26.length);
		for (@Pc(39) int local39 = 0; local39 < local32.anInt4555; local39++) {
			@Pc(52) Class1_Sub26 local52 = new Class1_Sub26(arg0.method819(local26[local39], local12));
			local32.aClass107Array29[local39] = local52.method2978();
			local32.aByteArray63[local39] = local52.method2992();
			local32.aShortArray52[local39] = (short) local52.method2964();
			local32.aShortArray51[local39] = (short) local52.method2964();
			local32.anIntArray367[local39] = local52.method2958();
		}
		return local32;
	}
}
