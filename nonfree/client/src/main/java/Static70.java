import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_26;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Lclient!se;")
	public static Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public static int anInt2004 = 0;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_683 = Static161.method2971("Angreifen");

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_684 = Static161.method2971("runes");

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!dd;")
	public static Class13 aClass13_685 = Static161.method2971("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
	public static int anInt2007 = 0;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Lclient!th;")
	public static Class82 aClass82_6 = new Class82();

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Lclient!dd;")
	public static Class13 aClass13_686 = Static161.method2971("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	public static int anInt2008 = 0;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "[I")
	public static int[] anIntArray212 = new int[50];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIIZILclient!fa;)V")
	public static void method1461(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub2_Sub8 arg4) {
		if (Static175.anInt3994 >= 50 || (arg4.anIntArray159 == null || arg2 >= arg4.anIntArray159.length)) {
			return;
		}
		@Pc(23) int local23 = arg4.anIntArray159[arg2];
		if (local23 == 0) {
			return;
		}
		@Pc(35) int local35 = local23 >> 8;
		@Pc(41) int local41 = local23 >> 4 & 0x7;
		@Pc(45) int local45 = local23 & 0xF;
		if (local45 == 0) {
			if (arg0) {
				Static149.method2600(local41, local35, 0);
			}
		} else if (Static21.anInt786 != 0) {
			@Pc(64) int local64 = (arg1 - 64) / 128;
			Static156.anIntArray383[Static175.anInt3994] = local35;
			@Pc(74) int local74 = (arg3 - 64) / 128;
			Static17.anIntArray100[Static175.anInt3994] = local41;
			anIntArray212[Static175.anInt3994] = 0;
			Static114.aClass83Array1[Static175.anInt3994] = null;
			Static167.anIntArray434[Static175.anInt3994] = local45 + (local64 << 16) + (local74 << 8);
			Static175.anInt3994++;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method1462() {
		aClass79_1 = null;
		aClass13_685 = null;
		anIntArray212 = null;
		aClass82_6 = null;
		aClass13_686 = null;
		aClass13_683 = null;
		aClass13_684 = null;
		aClass4_Sub1_26 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public static void method1463() {
		if (anInt2004 > 0) {
			anInt2004--;
		}
		if (Static16.anInt689 > 1) {
			Static16.anInt689--;
		}
		if (Static47.aBoolean245) {
			Static47.aBoolean245 = false;
			Static49.method1238();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static151.method3030(); local27++) {
		}
		if (Static2.anInt97 != 30) {
			return;
		}
		Static111.method2160(Static1.aClass1_Sub8_Sub1_1);
		@Pc(55) Object local55 = Static187.aClass26_1.anObject1;
		@Pc(87) int local87;
		@Pc(76) int local76;
		@Pc(89) int local89;
		@Pc(104) int local104;
		@Pc(120) int local120;
		synchronized (Static187.aClass26_1.anObject1) {
			if (!Static120.aBoolean234) {
				Static187.aClass26_1.anInt1893 = 0;
			} else if (Static109.anInt2976 != 0 || Static187.aClass26_1.anInt1893 >= 40) {
				local76 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(229);
				Static1.aClass1_Sub8_Sub1_1.method1643(0);
				local87 = Static1.aClass1_Sub8_Sub1_1.anInt2195;
				for (local89 = 0; local89 < Static187.aClass26_1.anInt1893 && Static1.aClass1_Sub8_Sub1_1.anInt2195 - local87 < 240; local89++) {
					local76++;
					local104 = Static187.aClass26_1.anIntArray194[local89];
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					local120 = Static187.aClass26_1.anIntArray193[local89];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 764) {
						local120 = 764;
					}
					@Pc(139) int local139 = local120 + local104 * 765;
					if (Static187.aClass26_1.anIntArray194[local89] == -1 && Static187.aClass26_1.anIntArray193[local89] == -1) {
						local120 = -1;
						local104 = -1;
						local139 = 524287;
					}
					if (local120 != Static89.anInt2502 || local104 != Static155.anInt4159) {
						@Pc(185) int local185 = local120 - Static89.anInt2502;
						Static89.anInt2502 = local120;
						@Pc(192) int local192 = local104 - Static155.anInt4159;
						Static155.anInt4159 = local104;
						if (Static44.anInt1471 < 8 && local185 >= -32 && local185 <= 31 && local192 >= -32 && local192 <= 31) {
							local192 += 32;
							local185 += 32;
							Static1.aClass1_Sub8_Sub1_1.method1650((Static44.anInt1471 << 12) + (local185 << 6) + local192);
							Static44.anInt1471 = 0;
						} else if (Static44.anInt1471 < 8) {
							Static1.aClass1_Sub8_Sub1_1.method1620(local139 + (Static44.anInt1471 << 19) + 8388608);
							Static44.anInt1471 = 0;
						} else {
							Static1.aClass1_Sub8_Sub1_1.method1635((Static44.anInt1471 << 19) + local139 - 1073741824);
							Static44.anInt1471 = 0;
						}
					} else if (Static44.anInt1471 < 2047) {
						Static44.anInt1471++;
					}
				}
				Static1.aClass1_Sub8_Sub1_1.method1612(Static1.aClass1_Sub8_Sub1_1.anInt2195 - local87);
				if (local76 < Static187.aClass26_1.anInt1893) {
					Static187.aClass26_1.anInt1893 -= local76;
					for (local104 = 0; local104 < Static187.aClass26_1.anInt1893; local104++) {
						Static187.aClass26_1.anIntArray193[local104] = Static187.aClass26_1.anIntArray193[local104 + local76];
						Static187.aClass26_1.anIntArray194[local104] = Static187.aClass26_1.anIntArray194[local76 + local104];
					}
				} else {
					Static187.aClass26_1.anInt1893 = 0;
				}
			}
		}
		if (Static109.anInt2976 != 0) {
			local87 = Static8.anInt293;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 502) {
				local87 = 502;
			}
			local76 = Static122.anInt3191;
			@Pc(368) long local368 = (Static75.aLong70 - Static140.aLong122) / 50L;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 764) {
				local76 = 764;
			}
			local89 = local76 + local87 * 765;
			Static140.aLong122 = Static75.aLong70;
			if (local368 > 4095L) {
				local368 = 4095L;
			}
			@Pc(397) byte local397 = 0;
			if (Static109.anInt2976 == 2) {
				local397 = 1;
			}
			local120 = (int) local368;
			Static1.aClass1_Sub8_Sub1_1.method1654(12);
			Static1.aClass1_Sub8_Sub1_1.method1621((local397 << 19) + ((local120 << 20) + local89));
		}
		if (Static176.aBooleanArray53[96] || Static176.aBooleanArray53[97] || Static176.aBooleanArray53[98] || Static176.aBooleanArray53[99]) {
			Static148.aBoolean278 = true;
		}
		if (Static93.anInt2714 > 0) {
			Static93.anInt2714--;
		}
		if (Static148.aBoolean278 && Static93.anInt2714 <= 0) {
			Static148.aBoolean278 = false;
			Static93.anInt2714 = 20;
			Static1.aClass1_Sub8_Sub1_1.method1654(115);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static2.anInt101);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static30.anInt1075);
		}
		if (Static42.aBoolean96 && !Static110.aBoolean222) {
			Static110.aBoolean222 = true;
			Static1.aClass1_Sub8_Sub1_1.method1654(139);
			Static1.aClass1_Sub8_Sub1_1.method1643(1);
		}
		if (!Static42.aBoolean96 && Static110.aBoolean222) {
			Static110.aBoolean222 = false;
			Static1.aClass1_Sub8_Sub1_1.method1654(139);
			Static1.aClass1_Sub8_Sub1_1.method1643(0);
		}
		Static57.method1343();
		if (Static2.anInt97 != 30) {
			return;
		}
		Static134.method2408();
		Static7.method2240();
		Static143.anInt3523++;
		if (Static143.anInt3523 > 750) {
			Static49.method1238();
			return;
		}
		Static186.method3018();
		Static123.method2282();
		Static134.method2409();
		if (Static98.anInt3739 != 0) {
			Static101.anInt2831 += 20;
			if (Static101.anInt2831 >= 400) {
				Static98.anInt3739 = 0;
			}
		}
		Static117.anInt3116++;
		if (Static46.aClass20_3 != null) {
			Static8.anInt289++;
			if (Static8.anInt289 >= 15) {
				Static125.method2300(Static46.aClass20_3);
				Static46.aClass20_3 = null;
			}
		}
		@Pc(648) Class20 local648;
		if (Static37.aClass20_2 != null) {
			Static125.method2300(Static37.aClass20_2);
			Static93.anInt2713++;
			if (Static179.anInt4049 + 5 < Static14.anInt481 || Static179.anInt4049 - 5 > Static14.anInt481 || Static117.anInt3109 + 5 < Static86.anInt2447 || Static117.anInt3109 - 5 > Static86.anInt2447) {
				Static38.aBoolean80 = true;
			}
			if (Static148.anInt3596 == 0) {
				if (Static38.aBoolean80 && Static93.anInt2713 >= 5) {
					if (Static37.aClass20_2 == Static11.aClass20_1 && Static133.anInt3348 != Static171.anInt3964) {
						local648 = Static37.aClass20_2;
						@Pc(650) byte local650 = 0;
						if (Static98.anInt3743 == 1 && local648.anInt1586 == 206) {
							local650 = 1;
						}
						if (local648.anIntArray168[Static133.anInt3348] <= 0) {
							local650 = 0;
						}
						if (Static17.method653(Static53.method1292(local648))) {
							local76 = Static133.anInt3348;
							local87 = Static171.anInt3964;
							local648.anIntArray168[local76] = local648.anIntArray168[local87];
							local648.anIntArray163[local76] = local648.anIntArray163[local87];
							local648.anIntArray168[local87] = -1;
							local648.anIntArray163[local87] = 0;
						} else if (local650 == 1) {
							local87 = Static171.anInt3964;
							local76 = Static133.anInt3348;
							while (local76 != local87) {
								if (local87 > local76) {
									local648.method1236(local87 - 1, local87);
									local87--;
								} else if (local76 > local87) {
									local648.method1236(local87 + 1, local87);
									local87++;
								}
							}
						} else {
							local648.method1236(Static133.anInt3348, Static171.anInt3964);
						}
						Static1.aClass1_Sub8_Sub1_1.method1654(78);
						Static1.aClass1_Sub8_Sub1_1.method1640(Static37.aClass20_2.anInt1630);
						Static1.aClass1_Sub8_Sub1_1.method1629(Static133.anInt3348);
						Static1.aClass1_Sub8_Sub1_1.method1643(local650);
						Static1.aClass1_Sub8_Sub1_1.method1614(Static171.anInt3964);
					}
				} else if ((Static187.anInt4123 == 1 || Static145.method2574(Static53.anInt1722 - 1)) && Static53.anInt1722 > 2) {
					Static69.method1458();
				} else if (Static53.anInt1722 > 0) {
					Static17.method651(Static53.anInt1722 - 1);
				}
				Static37.aClass20_2 = null;
				Static8.anInt289 = 10;
				Static109.anInt2976 = 0;
			}
		}
		Static110.aClass20_8 = null;
		Static115.aBoolean227 = false;
		local648 = Static120.aClass20_9;
		Static67.anInt1957 = 0;
		Static178.aBoolean312 = false;
		@Pc(829) Class20 local829 = Static145.aClass20_10;
		Static145.aClass20_10 = null;
		Static120.aClass20_9 = null;
		while (Static2.method69() && Static67.anInt1957 < 128) {
			Static169.anIntArray437[Static67.anInt1957] = Static37.anInt1202;
			Static57.anIntArray188[Static67.anInt1957] = Static135.anInt3373;
			Static67.anInt1957++;
		}
		if (Static82.anInt2319 != -1) {
			Static40.method1045(503, 0, 765, 0, 0, 0, Static82.anInt2319);
		}
		Static10.anInt388++;
		while (true) {
			@Pc(874) Class1_Sub23 local874;
			@Pc(890) Class20 local890;
			@Pc(879) Class20 local879;
			do {
				local874 = (Class1_Sub23) aClass82_6.method2851();
				if (local874 == null) {
					while (true) {
						do {
							local874 = (Class1_Sub23) Static47.aClass82_10.method2851();
							if (local874 == null) {
								while (true) {
									do {
										local874 = (Class1_Sub23) Static108.aClass82_8.method2851();
										if (local874 == null) {
											if (Static162.aClass20_11 != null) {
												Static74.method1564();
											}
											if (Static168.anInt3947 != -1) {
												local87 = Static168.anInt3947;
												local76 = Static61.anInt1892;
												@Pc(1039) boolean local1039 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, true, local87, local76, 0, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
												if (local1039) {
													Static101.anInt2831 = 0;
													Static98.anInt3739 = 1;
													Static151.anInt4127 = Static122.anInt3191;
													Static119.anInt3146 = Static8.anInt293;
												}
												Static168.anInt3947 = -1;
											}
											Static90.method1897();
											if (local648 != Static120.aClass20_9) {
												if (local648 != null) {
													Static125.method2300(local648);
												}
												if (Static120.aClass20_9 != null) {
													Static125.method2300(Static120.aClass20_9);
												}
											}
											if (local829 != Static145.aClass20_10 && Static144.anInt3536 == Static104.anInt2872) {
												if (local829 != null) {
													Static125.method2300(local829);
												}
												if (Static145.aClass20_10 != null) {
													Static125.method2300(Static145.aClass20_10);
												}
											}
											if (Static145.aClass20_10 == null) {
												if (Static144.anInt3536 > 0) {
													Static144.anInt3536--;
												}
											} else if (Static144.anInt3536 < Static104.anInt2872) {
												Static144.anInt3536++;
												if (Static144.anInt3536 == Static104.anInt2872) {
													Static125.method2300(Static145.aClass20_10);
												}
											}
											Static125.method2297();
											if (Static2.aBoolean11) {
												Static5.method102();
											}
											for (local87 = 0; local87 < 5; local87++) {
												@Pc(1127) int local1127 = Static32.anIntArray450[local87]++;
											}
											local76 = Static60.method1401();
											local89 = Static182.method791();
											if (local76 > 4500 && local89 > 4500) {
												anInt2004 = 250;
												Static75.method1566(4000);
												Static1.aClass1_Sub8_Sub1_1.method1654(70);
											}
											Static102.anInt2850++;
											Static162.anInt3817++;
											if (Static162.anInt3817 > 500) {
												local104 = (int) (Math.random() * 8.0D);
												Static162.anInt3817 = 0;
												if ((local104 & 0x4) == 4) {
													Static144.anInt3535 += Static47.anInt3274;
												}
												if ((local104 & 0x2) == 2) {
													Static133.anInt3344 += Static80.anInt2280;
												}
												if ((local104 & 0x1) == 1) {
													Static109.anInt2977 += Static28.anInt995;
												}
											}
											Static97.anInt4166++;
											if (Static133.anInt3344 < -55) {
												Static80.anInt2280 = 2;
											}
											if (Static133.anInt3344 > 55) {
												Static80.anInt2280 = -2;
											}
											if (Static102.anInt2850 > 500) {
												Static102.anInt2850 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x1) == 1) {
													Static79.anInt2241 += Static182.anInt914;
												}
												if ((local104 & 0x2) == 2) {
													Static60.anInt1871 += Static98.anInt3740;
												}
											}
											if (Static109.anInt2977 < -50) {
												Static28.anInt995 = 2;
											}
											if (Static79.anInt2241 < -60) {
												Static182.anInt914 = 2;
											}
											if (Static144.anInt3535 < -40) {
												Static47.anInt3274 = 1;
											}
											if (Static60.anInt1871 < -20) {
												Static98.anInt3740 = 1;
											}
											if (Static60.anInt1871 > 10) {
												Static98.anInt3740 = -1;
											}
											if (Static144.anInt3535 > 40) {
												Static47.anInt3274 = -1;
											}
											if (Static79.anInt2241 > 60) {
												Static182.anInt914 = -2;
											}
											if (Static109.anInt2977 > 50) {
												Static28.anInt995 = -2;
											}
											if (Static97.anInt4166 > 50) {
												Static1.aClass1_Sub8_Sub1_1.method1654(46);
											}
											try {
												if (Static96.aClass62_4 != null && Static1.aClass1_Sub8_Sub1_1.anInt2195 > 0) {
													Static96.aClass62_4.method2281(Static1.aClass1_Sub8_Sub1_1.anInt2195, Static1.aClass1_Sub8_Sub1_1.aByteArray27);
													Static97.anInt4166 = 0;
													Static1.aClass1_Sub8_Sub1_1.anInt2195 = 0;
													return;
												}
												return;
											} catch (@Pc(1335) IOException local1335) {
												Static49.method1238();
												return;
											}
										}
										local879 = local874.aClass20_13;
										if (local879.anInt1608 < 0) {
											break;
										}
										local890 = Static119.method2230(local879.anInt1623);
									} while (local890 == null || local890.aClass20Array1 == null || local879.anInt1608 >= local890.aClass20Array1.length || local890.aClass20Array1[local879.anInt1608] != local879);
									Static1.method43(local874);
								}
							}
							local879 = local874.aClass20_13;
							if (local879.anInt1608 < 0) {
								break;
							}
							local890 = Static119.method2230(local879.anInt1623);
						} while (local890 == null || local890.aClass20Array1 == null || local890.aClass20Array1.length <= local879.anInt1608 || local879 != local890.aClass20Array1[local879.anInt1608]);
						Static1.method43(local874);
					}
				}
				local879 = local874.aClass20_13;
				if (local879.anInt1608 < 0) {
					break;
				}
				local890 = Static119.method2230(local879.anInt1623);
			} while (local890 == null || local890.aClass20Array1 == null || local879.anInt1608 >= local890.aClass20Array1.length || local879 != local890.aClass20Array1[local879.anInt1608]);
			Static1.method43(local874);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([Lclient!dd;III)Lclient!dd;")
	public static Class13 method1464(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[arg2 + local9] == null) {
				arg0[local9 + arg2] = Static26.aClass13_316;
			}
			local7 += arg0[local9 + arg2].anInt1080;
		}
		@Pc(54) byte[] local54 = new byte[local7];
		@Pc(56) int local56 = 0;
		@Pc(67) Class13 local67;
		for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
			local67 = arg0[arg2 + local58];
			Static193.method2480(local67.aByteArray19, 0, local54, local56, local67.anInt1080);
			local56 += local67.anInt1080;
		}
		local67 = new Class13();
		local67.aByteArray19 = local54;
		local67.anInt1080 = local7;
		return local67;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!w;)V")
	public static void method1465(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static95.aBoolean208) {
			Static37.method992(arg0);
			return;
		}
		if (Static109.anInt2976 == 1 && Static122.anInt3191 >= 715 && Static8.anInt293 >= 453) {
			Static43.aBoolean100 = !Static43.aBoolean100;
			if (Static43.aBoolean100) {
				Static15.method626();
			} else {
				Static15.method630(Static144.aClass4_Sub1_47, Static51.anInt1674, 255);
			}
		}
		if (Static2.anInt97 == 5) {
			return;
		}
		Static43.anInt1434++;
		if (Static2.anInt97 != 10) {
			return;
		}
		if (Static159.anInt3758 != 2 && Static94.anInt2756 == 0) {
			if (Static109.anInt2976 == 1 && Static122.anInt3191 >= 5 && Static122.anInt3191 <= 105 && Static8.anInt293 >= 463 && Static8.anInt293 <= 498) {
				Static163.method2792();
				return;
			}
			if (Static45.aClass3_1 != null) {
				Static163.method2792();
			}
		}
		@Pc(114) int local114 = Static109.anInt2976;
		@Pc(116) int local116 = Static122.anInt3191;
		@Pc(118) int local118 = Static8.anInt293;
		if (Static60.anInt1884 == 0) {
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 271 && local118 <= 311) {
				Static129.anInt3271 = 0;
				Static60.anInt1884 = 3;
			}
			@Pc(540) boolean local540 = false;
			if (Static21.anInt787 != 0) {
				while (Static2.method69()) {
					if (Static37.anInt1202 == 84) {
						local540 = true;
						break;
					}
				}
			}
			if (local540 || local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 271 && local118 <= 311) {
				Static122.aClass13_1061 = Static118.aClass13_1048;
				Static129.anInt3271 = 0;
				Static122.aClass13_1067 = Static101.aClass13_921;
				Static122.aClass13_1062 = Static101.aClass13_903;
				Static60.anInt1884 = 2;
			}
		} else if (Static60.anInt1884 == 2) {
			@Pc(167) short local167 = 231;
			@Pc(172) int local172 = local167 + 30;
			if (local114 == 1 && local118 >= 246 && local118 < 261) {
				Static129.anInt3271 = 0;
			}
			local172 += 15;
			if (local114 == 1 && local118 >= 261 && local118 < 276) {
				Static129.anInt3271 = 1;
			}
			local172 += 15;
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 301 && local118 <= 341) {
				Static122.aClass13_1057 = Static122.aClass13_1057.method880().method903();
				if (Static122.aClass13_1057.method904() == 0) {
					Static168.method2878(Static109.aClass13_988, Static101.aClass13_898, Static101.aClass13_923);
				} else if (Static122.aClass13_1065.method904() == 0) {
					Static168.method2878(Static161.aClass13_1400, Static101.aClass13_929, Static101.aClass13_912);
				} else {
					Static168.method2878(Static58.aClass13_624, Static101.aClass13_931, Static101.aClass13_905);
					Static53.method1293(20);
				}
			} else {
				if (local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 301 && local118 <= 341) {
					Static60.anInt1884 = 0;
					Static122.aClass13_1057 = Static122.aClass13_1063;
					Static122.aClass13_1065 = Static122.aClass13_1063;
				}
				while (true) {
					@Pc(316) boolean local316;
					label204: do {
						while (Static2.method69()) {
							local316 = false;
							for (@Pc(318) int local318 = 0; local318 < Static50.aClass13_559.method904(); local318++) {
								if (Static135.anInt3373 == Static50.aClass13_559.method898(local318)) {
									local316 = true;
									break;
								}
							}
							if (Static129.anInt3271 != 0) {
								continue label204;
							}
							if (Static37.anInt1202 == 85 && Static122.aClass13_1057.method904() > 0) {
								Static122.aClass13_1057 = Static122.aClass13_1057.method883(0, Static122.aClass13_1057.method904() - 1);
							}
							if (Static37.anInt1202 == 84 || Static37.anInt1202 == 80) {
								Static129.anInt3271 = 1;
							}
							if (local316 && Static122.aClass13_1057.method904() < 12) {
								Static122.aClass13_1057 = Static122.aClass13_1057.method899(Static135.anInt3373);
							}
						}
						return;
					} while (Static129.anInt3271 != 1);
					if (Static37.anInt1202 == 85 && Static122.aClass13_1065.method904() > 0) {
						Static122.aClass13_1065 = Static122.aClass13_1065.method883(0, Static122.aClass13_1065.method904() - 1);
					}
					if (Static37.anInt1202 == 84 || Static37.anInt1202 == 80) {
						Static129.anInt3271 = 0;
					}
					if (Static21.anInt787 != 0 && Static37.anInt1202 == 84) {
						Static122.aClass13_1057 = Static122.aClass13_1057.method880().method903();
						if (Static122.aClass13_1057.method904() == 0) {
							Static168.method2878(Static109.aClass13_988, Static101.aClass13_898, Static101.aClass13_923);
							return;
						}
						if (Static122.aClass13_1065.method904() == 0) {
							Static168.method2878(Static161.aClass13_1400, Static101.aClass13_929, Static101.aClass13_912);
							return;
						}
						Static168.method2878(Static58.aClass13_624, Static101.aClass13_931, Static101.aClass13_905);
						Static53.method1293(20);
						return;
					}
					if (local316 && Static122.aClass13_1065.method904() < 20) {
						Static122.aClass13_1065 = Static122.aClass13_1065.method899(Static135.anInt3373);
					}
				}
			}
		} else if (Static60.anInt1884 == 3 && local114 == 1 && local116 >= 307 && local116 <= 457 && local118 >= 301 && local118 <= 341) {
			Static60.anInt1884 = 0;
		}
	}
}
