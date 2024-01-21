import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1461;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "Lclient!gd;")
	public static Class31 aClass31_5;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ad;")
	private static Class4 aClass4_749 = Static75.method1216("Loading config )2 ");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt1472 = 0;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_750 = aClass4_749;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_751 = Static75.method1216("Ok");

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_752 = aClass4_751;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[I")
	public static int[] anIntArray211 = new int[5];

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	public static int anInt1484 = -1;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!ad;")
	private static Class4 aClass4_753 = Static75.method1216(" has logged out)3");

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Lclient!ad;")
	private static Class4 aClass4_754 = Static75.method1216("Loading )2 please wait)3");

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "[I")
	public static int[] anIntArray212 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "Lclient!ad;")
	public static Class4 aClass4_755 = aClass4_753;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
	public static int anInt1489 = 0;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	public static int anInt1491 = 0;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_756 = aClass4_754;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "Lclient!ad;")
	public static Class4 aClass4_757 = Static75.method1216("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "Lclient!ad;")
	public static Class4 aClass4_758 = Static75.method1216("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
	public static int anInt1493 = 128;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1005() {
		if (Static2.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static54.anIntArray177[186] = 57;
			Static54.anIntArray177[187] = 27;
			Static54.anIntArray177[188] = 71;
			Static54.anIntArray177[189] = 26;
			Static54.anIntArray177[190] = 72;
			Static54.anIntArray177[191] = 73;
			Static54.anIntArray177[192] = 58;
			Static54.anIntArray177[219] = 42;
			Static54.anIntArray177[220] = 74;
			Static54.anIntArray177[221] = 43;
			Static54.anIntArray177[222] = 59;
			Static54.anIntArray177[223] = 28;
			return;
		}
		Static54.anIntArray177[44] = 71;
		Static54.anIntArray177[45] = 26;
		Static54.anIntArray177[46] = 72;
		Static54.anIntArray177[47] = 73;
		Static54.anIntArray177[59] = 57;
		Static54.anIntArray177[61] = 27;
		Static54.anIntArray177[91] = 42;
		Static54.anIntArray177[92] = 74;
		Static54.anIntArray177[93] = 43;
		if (Static2.aMethod2 == null) {
			Static54.anIntArray177[192] = 58;
			Static54.anIntArray177[222] = 59;
		} else {
			Static54.anIntArray177[192] = 28;
			Static54.anIntArray177[222] = 58;
			Static54.anIntArray177[520] = 59;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1006() {
		while (Static95.method1502()) {
			if (Static48.anInt1201 != -1 && Static72.anInt1740 == Static48.anInt1201) {
				if (Static109.anInt2752 == 85 && Static113.aClass4_1602.method118() > 0) {
					Static113.aClass4_1602 = Static113.aClass4_1602.method136(0, Static113.aClass4_1602.method118() - 1);
				}
				if ((Static94.method1479(Static47.anInt1180) || Static47.anInt1180 == 32) && Static113.aClass4_1602.method118() < 12) {
					Static113.aClass4_1602 = Static113.aClass4_1602.method121(Static47.anInt1180);
				}
			} else {
				@Pc(125) int local125;
				if (Static58.aBoolean103) {
					if (Static109.anInt2752 == 85 && Static113.aClass4_1605.method118() > 0) {
						Static113.aClass4_1605 = Static113.aClass4_1605.method136(0, Static113.aClass4_1605.method118() - 1);
						Static86.aBoolean153 = true;
					}
					if (Static30.method620(Static47.anInt1180) && Static113.aClass4_1605.method118() < 80) {
						Static113.aClass4_1605 = Static113.aClass4_1605.method121(Static47.anInt1180);
						Static86.aBoolean153 = true;
					}
					if (Static109.anInt2752 == 84) {
						Static86.aBoolean153 = true;
						Static58.aBoolean103 = false;
						@Pc(78) long local78;
						if (Static91.anInt2058 == 1) {
							local78 = Static113.aClass4_1605.method149();
							Static31.method627(local78);
						}
						if (Static91.anInt2058 == 2 && Static87.anInt1451 > 0) {
							local78 = Static113.aClass4_1605.method149();
							Static44.method812(local78);
						}
						if (Static91.anInt2058 == 3 && Static113.aClass4_1605.method118() > 0) {
							Static5.aClass3_Sub4_Sub1_1.method464(5);
							Static5.aClass3_Sub4_Sub1_1.method423(0);
							local125 = Static5.aClass3_Sub4_Sub1_1.anInt627;
							Static5.aClass3_Sub4_Sub1_1.method456(Static24.aLong18);
							Static68.method1118(Static5.aClass3_Sub4_Sub1_1, Static113.aClass4_1605);
							Static5.aClass3_Sub4_Sub1_1.method437(Static5.aClass3_Sub4_Sub1_1.anInt627 - local125);
							if (Static55.anInt1391 == 2) {
								Static46.aBoolean243 = true;
								Static55.anInt1391 = 1;
								Static5.aClass3_Sub4_Sub1_1.method464(24);
								Static5.aClass3_Sub4_Sub1_1.method423(Static58.anInt1429);
								Static5.aClass3_Sub4_Sub1_1.method423(Static55.anInt1391);
								Static5.aClass3_Sub4_Sub1_1.method423(Static44.anInt1146);
							}
						}
						if (Static91.anInt2058 == 4 && Static28.anInt869 < 100) {
							local78 = Static113.aClass4_1605.method149();
							Static87.method995(local78);
						}
						if (Static91.anInt2058 == 5 && Static28.anInt869 > 0) {
							local78 = Static113.aClass4_1605.method149();
							Static112.method1922(local78);
						}
					}
				} else if (Static85.anInt1991 == 1) {
					if (Static109.anInt2752 == 85 && Static113.aClass4_1603.method118() > 0) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method136(0, Static113.aClass4_1603.method118() - 1);
						Static86.aBoolean153 = true;
					}
					if (Static53.method1656(Static47.anInt1180) && Static113.aClass4_1603.method118() < 10) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method121(Static47.anInt1180);
						Static86.aBoolean153 = true;
					}
					if (Static109.anInt2752 == 84) {
						if (Static113.aClass4_1603.method118() > 0) {
							local125 = 0;
							if (Static113.aClass4_1603.method131()) {
								local125 = Static113.aClass4_1603.method123();
							}
							Static5.aClass3_Sub4_Sub1_1.method464(229);
							Static5.aClass3_Sub4_Sub1_1.method424(local125);
						}
						Static86.aBoolean153 = true;
						Static85.anInt1991 = 0;
					}
				} else if (Static85.anInt1991 == 2) {
					if (Static109.anInt2752 == 85 && Static113.aClass4_1603.method118() > 0) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method136(0, Static113.aClass4_1603.method118() - 1);
						Static86.aBoolean153 = true;
					}
					if ((Static94.method1479(Static47.anInt1180) || Static47.anInt1180 == 32) && Static113.aClass4_1603.method118() < 12) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method121(Static47.anInt1180);
						Static86.aBoolean153 = true;
					}
					if (Static109.anInt2752 == 84) {
						if (Static113.aClass4_1603.method118() > 0) {
							Static5.aClass3_Sub4_Sub1_1.method464(110);
							Static5.aClass3_Sub4_Sub1_1.method456(Static113.aClass4_1603.method149());
						}
						Static85.anInt1991 = 0;
						Static86.aBoolean153 = true;
					}
				} else if (Static85.anInt1991 == 3) {
					if (Static109.anInt2752 == 85 && Static113.aClass4_1603.method118() > 0) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method136(0, Static113.aClass4_1603.method118() - 1);
						Static86.aBoolean153 = true;
					}
					if (Static30.method620(Static47.anInt1180) && Static113.aClass4_1603.method118() < 40) {
						Static113.aClass4_1603 = Static113.aClass4_1603.method121(Static47.anInt1180);
						Static86.aBoolean153 = true;
					}
				} else if (Static6.anInt259 == -1 && anInt1484 == -1) {
					if (Static109.anInt2752 == 85 && Static113.aClass4_1606.method118() > 0) {
						Static113.aClass4_1606 = Static113.aClass4_1606.method136(0, Static113.aClass4_1606.method118() - 1);
						Static86.aBoolean153 = true;
					}
					if (Static30.method620(Static47.anInt1180) && Static113.aClass4_1606.method118() < 80) {
						Static113.aClass4_1606 = Static113.aClass4_1606.method121(Static47.anInt1180);
						Static86.aBoolean153 = true;
					}
					if (Static109.anInt2752 == 84 && Static113.aClass4_1606.method118() > 0) {
						if (Static67.anInt1652 == 2) {
							if (Static113.aClass4_1606.method151(Static58.aClass4_735)) {
								Static112.method1925();
							}
							if (Static113.aClass4_1606.method151(Static62.aClass4_815)) {
								Static28.aBoolean53 = true;
							}
							if (Static113.aClass4_1606.method151(Static6.aClass4_124)) {
								Static28.aBoolean53 = false;
							}
							if (Static113.aClass4_1606.method151(Static11.aClass4_1592)) {
								for (local125 = 0; local125 < 4; local125++) {
									for (@Pc(523) int local523 = 1; local523 < 103; local523++) {
										for (@Pc(527) int local527 = 1; local527 < 103; local527++) {
											Static12.aClass40Array1[local125].anIntArrayArray16[local523][local527] = 0;
										}
									}
								}
							}
							if (Static113.aClass4_1606.method151(Static106.aClass4_1478) && Static67.anInt1653 == 2) {
								throw new RuntimeException();
							}
							if (Static113.aClass4_1606.method151(Static72.aClass4_919)) {
								Static13.aBoolean22 = true;
							}
						}
						if (Static113.aClass4_1606.method132(Static67.aClass4_841)) {
							Static5.aClass3_Sub4_Sub1_1.method464(238);
							Static5.aClass3_Sub4_Sub1_1.method423(Static113.aClass4_1606.method118() - 1);
							Static5.aClass3_Sub4_Sub1_1.method453(Static113.aClass4_1606.method137(2));
						} else {
							@Pc(584) Class4 local584 = Static113.aClass4_1606.method153();
							@Pc(590) byte local590 = 0;
							@Pc(592) byte local592 = 0;
							if (local584.method132(Static110.aClass4_1554)) {
								local592 = 0;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static110.aClass4_1554.method118());
							} else if (local584.method132(Static77.aClass4_1025)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static77.aClass4_1025.method118());
								local592 = 1;
							} else if (local584.method132(Static51.aClass4_668)) {
								local592 = 2;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static51.aClass4_668.method118());
							} else if (local584.method132(Static106.aClass4_1474)) {
								local592 = 3;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static106.aClass4_1474.method118());
							} else if (local584.method132(Static7.aClass4_137)) {
								local592 = 4;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static7.aClass4_137.method118());
							} else if (local584.method132(Static78.aClass4_220)) {
								local592 = 5;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static78.aClass4_220.method118());
							} else if (local584.method132(Static73.aClass4_926)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static73.aClass4_926.method118());
								local592 = 6;
							} else if (local584.method132(Static46.aClass4_1535)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static46.aClass4_1535.method118());
								local592 = 7;
							} else if (local584.method132(Static3.aClass4_1298)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static3.aClass4_1298.method118());
								local592 = 8;
							} else if (local584.method132(Static29.aClass4_435)) {
								local592 = 9;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static29.aClass4_435.method118());
							} else if (local584.method132(Static19.aClass4_240)) {
								local592 = 10;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static19.aClass4_240.method118());
							} else if (local584.method132(Static42.aClass4_568)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static42.aClass4_568.method118());
								local592 = 11;
							}
							local584 = Static113.aClass4_1606.method153();
							if (local584.method132(Static107.aClass4_1493)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static107.aClass4_1493.method118());
								local590 = 1;
							} else if (local584.method132(Static38.aClass4_1575)) {
								local590 = 2;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static38.aClass4_1575.method118());
							} else if (local584.method132(Static64.aClass4_828)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static64.aClass4_828.method118());
								local590 = 3;
							} else if (local584.method132(Static7.aClass4_128)) {
								local590 = 4;
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static7.aClass4_128.method118());
							} else if (local584.method132(Static1.aClass4_6)) {
								Static113.aClass4_1606 = Static113.aClass4_1606.method137(Static1.aClass4_6.method118());
								local590 = 5;
							}
							Static5.aClass3_Sub4_Sub1_1.method464(43);
							Static5.aClass3_Sub4_Sub1_1.method423(0);
							@Pc(897) int local897 = Static5.aClass3_Sub4_Sub1_1.anInt627;
							Static5.aClass3_Sub4_Sub1_1.method423(local592);
							Static5.aClass3_Sub4_Sub1_1.method423(local590);
							Static68.method1118(Static5.aClass3_Sub4_Sub1_1, Static113.aClass4_1606);
							Static5.aClass3_Sub4_Sub1_1.method437(Static5.aClass3_Sub4_Sub1_1.anInt627 - local897);
							if (Static58.anInt1429 == 2) {
								Static58.anInt1429 = 3;
								Static46.aBoolean243 = true;
								Static5.aClass3_Sub4_Sub1_1.method464(24);
								Static5.aClass3_Sub4_Sub1_1.method423(Static58.anInt1429);
								Static5.aClass3_Sub4_Sub1_1.method423(Static55.anInt1391);
								Static5.aClass3_Sub4_Sub1_1.method423(Static44.anInt1146);
							}
						}
						Static113.aClass4_1606 = Static113.aClass4_1604;
						Static86.aBoolean153 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method1007(@OriginalArg(0) int arg0) {
		if (Static20.anInt479 == arg0) {
			return;
		}
		if (Static20.anInt479 == 0) {
			Static56.method940();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static15.anInt359 = 0;
			Static54.anInt1278 = 0;
			Static112.anInt2823 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && aClass31_5 != null) {
			aClass31_5.method717();
			aClass31_5 = null;
		}
		if (Static20.anInt479 == 25 || Static20.anInt479 == 40) {
			Static12.method214();
			Static50.method1842();
		}
		if (Static20.anInt479 == 25) {
			Static22.anInt501 = 1;
			Static70.anInt1687 = 1;
			Static71.anInt1711 = 0;
			Static76.anInt1811 = 0;
			Static16.anInt363 = 0;
		}
		if (arg0 == 35) {
			Static6.method164();
			Static28.method592();
			if (Static4.aClass25_18 == null) {
				Static4.aClass25_18 = Static11.method1928(Static9.aCanvas1, 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static4.aClass25_18 = null;
			Static6.method164();
			Static46.method1876(Static31.aClass64_Sub1_8, Static9.aCanvas1, Static67.aClass64_Sub1_12);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static4.aClass25_18 = null;
			Static28.method592();
			Static4.method111(Static9.aCanvas1, Static31.aClass64_Sub1_8);
		}
		Static103.aBoolean216 = true;
		Static20.anInt479 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1008() {
		if (Static5.aClass68_1 != null) {
			@Pc(7) Class68 local7 = Static5.aClass68_1;
			synchronized (Static5.aClass68_1) {
				Static5.aClass68_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] method1009() {
		@Pc(8) Class3_Sub1_Sub4_Sub2[] local8 = new Class3_Sub1_Sub4_Sub2[Static64.anInt1616];
		for (@Pc(10) int local10 = 0; local10 < Static64.anInt1616; local10++) {
			@Pc(20) Class3_Sub1_Sub4_Sub2 local20 = local8[local10] = new Class3_Sub1_Sub4_Sub2();
			local20.anInt2576 = Static77.anInt1836;
			local20.anInt2574 = Static5.anInt256;
			local20.anInt2577 = Static55.anIntArray188[local10];
			local20.anInt2575 = Static34.anIntArray96[local10];
			local20.anInt2573 = Static15.anIntArray31[local10];
			local20.anInt2578 = Static39.anIntArray112[local10];
			@Pc(50) byte[] local50 = Static16.aByteArrayArray2[local10];
			@Pc(56) int local56 = local20.anInt2578 * local20.anInt2573;
			local20.anIntArray325 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray325[local62] = Static42.anIntArray156[local50[local62] & 0xFF];
			}
		}
		Static21.method297();
		return local8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1010() {
		aClass4_756 = null;
		aClass4_753 = null;
		aClass4_754 = null;
		aClass4_755 = null;
		anIntArray212 = null;
		aClass4_749 = null;
		anIntArray211 = null;
		aClass4_752 = null;
		aClass4_751 = null;
		aClass31_5 = null;
		aClass4_758 = null;
		aClass4_750 = null;
		aClass4_757 = null;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	public static void method1011(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static63.anIntArray225[arg0];
		@Pc(19) int local19 = Static107.anIntArray331[arg0];
		@Pc(23) int local23 = Static22.anIntArray38[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) int local31 = Static52.anIntArray176[arg0];
		if (Static85.anInt1991 != 0 && local23 != 1002) {
			Static86.aBoolean153 = true;
			Static85.anInt1991 = 0;
		}
		@Pc(72) boolean local72;
		if (local23 == 62) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static55.anInt1393 = Static4.anInt194;
			anInt1491 = 0;
			Static49.anInt1217 = Static91.anInt2055;
			Static19.anInt476 = 2;
			Static5.aClass3_Sub4_Sub1_1.method464(208);
			Static5.aClass3_Sub4_Sub1_1.method457(Static22.anInt498);
			Static5.aClass3_Sub4_Sub1_1.method442(Static78.anInt434);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method425(local15 + Static43.anInt1144);
			Static5.aClass3_Sub4_Sub1_1.method431(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method457(Static77.anInt1837);
		}
		if (local23 == 1004) {
			Static19.anInt476 = 2;
			anInt1491 = 0;
			Static55.anInt1393 = Static4.anInt194;
			Static49.anInt1217 = Static91.anInt2055;
			Static5.aClass3_Sub4_Sub1_1.method464(50);
			Static5.aClass3_Sub4_Sub1_1.method457(local31);
		}
		if (local23 == 19) {
			Static103.method1691(local31, local19, local15);
			Static5.aClass3_Sub4_Sub1_1.method464(49);
			Static5.aClass3_Sub4_Sub1_1.method425(Static43.anInt1144 + local15);
			Static5.aClass3_Sub4_Sub1_1.method425(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method431(local19 + Static93.anInt2429);
		}
		if (local23 == 2) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static55.anInt1393 = Static4.anInt194;
			Static19.anInt476 = 2;
			anInt1491 = 0;
			Static49.anInt1217 = Static91.anInt2055;
			Static5.aClass3_Sub4_Sub1_1.method464(157);
			Static5.aClass3_Sub4_Sub1_1.method425(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method425(local15 + Static43.anInt1144);
		}
		if (local23 == 44) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static55.anInt1393 = Static4.anInt194;
			Static49.anInt1217 = Static91.anInt2055;
			anInt1491 = 0;
			Static19.anInt476 = 2;
			Static5.aClass3_Sub4_Sub1_1.method464(176);
			Static5.aClass3_Sub4_Sub1_1.method442(Static9.anInt313);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method431(Static43.anInt1144 + local15);
			Static5.aClass3_Sub4_Sub1_1.method425(local19 + Static93.anInt2429);
		}
		@Pc(379) Class3_Sub1_Sub1_Sub1_Sub2 local379;
		if (local23 == 58) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static49.anInt1217 = Static91.anInt2055;
				Static19.anInt476 = 2;
				Static55.anInt1393 = Static4.anInt194;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(98);
				Static5.aClass3_Sub4_Sub1_1.method425(local31);
			}
		}
		if (local23 == 31) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(212);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		@Pc(491) int local491;
		@Pc(471) Class3_Sub1_Sub14 local471;
		if (local23 == 41) {
			Static5.aClass3_Sub4_Sub1_1.method464(187);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			local471 = Static47.method828(local19);
			if (local471.anIntArrayArray21 != null && local471.anIntArrayArray21[0][0] == 5) {
				local491 = local471.anIntArrayArray21[0][1];
				Static106.anIntArray329[local491] = 1 - Static106.anIntArray329[local491];
				Static45.method813(local491);
				Static39.aBoolean74 = true;
			}
		}
		if (local23 == 40) {
			Static5.aClass3_Sub4_Sub1_1.method464(121);
			Static5.aClass3_Sub4_Sub1_1.method457(local15);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method433(local19);
			Static106.anInt2669 = local15;
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			Static71.anInt1710 = 0;
			if (Static48.anInt1201 == local19 >> 16) {
				Static22.anInt500 = 1;
			}
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 52) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static49.anInt1217 = Static91.anInt2055;
				anInt1491 = 0;
				Static55.anInt1393 = Static4.anInt194;
				Static19.anInt476 = 2;
				Static5.aClass3_Sub4_Sub1_1.method464(12);
				Static5.aClass3_Sub4_Sub1_1.method431(local31);
			}
		}
		@Pc(616) Class3_Sub1_Sub1_Sub1_Sub1 local616;
		if (local23 == 5) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static19.anInt476 = 2;
				anInt1491 = 0;
				Static49.anInt1217 = Static91.anInt2055;
				Static55.anInt1393 = Static4.anInt194;
				Static5.aClass3_Sub4_Sub1_1.method464(131);
				Static5.aClass3_Sub4_Sub1_1.method424(Static9.anInt313);
				Static5.aClass3_Sub4_Sub1_1.method455(local31);
			}
		}
		if (local23 == 53 && Static103.method1691(local31, local19, local15)) {
			Static5.aClass3_Sub4_Sub1_1.method464(126);
			Static5.aClass3_Sub4_Sub1_1.method455(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method442(Static9.anInt313);
			Static5.aClass3_Sub4_Sub1_1.method457(local15 + Static43.anInt1144);
		}
		if (local23 == 1006) {
			anInt1491 = 0;
			Static49.anInt1217 = Static91.anInt2055;
			Static19.anInt476 = 2;
			Static55.anInt1393 = Static4.anInt194;
			Static5.aClass3_Sub4_Sub1_1.method464(60);
			Static5.aClass3_Sub4_Sub1_1.method425(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 57) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static49.anInt1217 = Static91.anInt2055;
				anInt1491 = 0;
				Static55.anInt1393 = Static4.anInt194;
				Static19.anInt476 = 2;
				Static5.aClass3_Sub4_Sub1_1.method464(254);
				Static5.aClass3_Sub4_Sub1_1.method431(local31);
			}
		}
		if (local23 == 10) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				anInt1491 = 0;
				Static19.anInt476 = 2;
				Static49.anInt1217 = Static91.anInt2055;
				Static55.anInt1393 = Static4.anInt194;
				Static5.aClass3_Sub4_Sub1_1.method464(101);
				Static5.aClass3_Sub4_Sub1_1.method457(local31);
			}
		}
		if (local23 == 1005) {
			Static103.method1691(local31, local19, local15);
			Static5.aClass3_Sub4_Sub1_1.method464(68);
			Static5.aClass3_Sub4_Sub1_1.method457(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method425(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method455(Static43.anInt1144 + local15);
		}
		if (local23 == 25) {
			Static5.aClass3_Sub4_Sub1_1.method464(145);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method457(local15);
			Static5.aClass3_Sub4_Sub1_1.method433(local19);
			Static106.anInt2669 = local15;
			Static22.anInt500 = 2;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			Static71.anInt1710 = 0;
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
			Static11.anInt2846 = local19;
		}
		if (local23 == 8) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static49.anInt1217 = Static91.anInt2055;
			Static19.anInt476 = 2;
			anInt1491 = 0;
			Static55.anInt1393 = Static4.anInt194;
			Static5.aClass3_Sub4_Sub1_1.method464(201);
			Static5.aClass3_Sub4_Sub1_1.method425(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method457(Static43.anInt1144 + local15);
			Static5.aClass3_Sub4_Sub1_1.method457(local31);
		}
		if (local23 == 1003) {
			local471 = Static47.method828(local19);
			if (local471 == null || local471.anIntArray272[local15] < 100000) {
				Static5.aClass3_Sub4_Sub1_1.method464(50);
				Static5.aClass3_Sub4_Sub1_1.method457(local31);
			} else {
				Static21.method296(method1012(new Class4[] { Static93.method1632(local471.anIntArray272[local15]), Static68.aClass4_850, Static3.method1550(local31).aClass4_347 }), Static113.aClass4_1604, 0);
			}
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			Static106.anInt2669 = local15;
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
			Static71.anInt1710 = 0;
		}
		if (local23 == 37) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(63);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 46) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(210);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		@Pc(1206) long local1206;
		@Pc(1195) int local1195;
		@Pc(1183) Class4 local1183;
		if (local23 == 20) {
			local1183 = Static104.aClass4Array20[arg0];
			local491 = local1183.method117(Static46.aClass4_1539);
			if (local491 != -1) {
				local1195 = -1;
				local1206 = local1183.method137(local491 + 5).method124().method149();
				for (@Pc(1208) int local1208 = 0; local1208 < Static87.anInt1451; local1208++) {
					if (local1206 == Static31.aLongArray9[local1208]) {
						local1195 = local1208;
						break;
					}
				}
				if (local1195 != -1 && Static36.anIntArray101[local1195] > 0) {
					Static113.aClass4_1605 = Static113.aClass4_1604;
					Static91.anInt2058 = 3;
					Static58.aBoolean103 = true;
					Static85.anInt1991 = 0;
					Static86.aBoolean153 = true;
					Static24.aLong18 = Static31.aLongArray9[local1195];
					Static113.aClass4_1601 = method1012(new Class4[] { Static112.aClass4_1586, Static21.aClass4Array2[local1195] });
				}
			}
		}
		if (local23 == 48) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static55.anInt1393 = Static4.anInt194;
				Static49.anInt1217 = Static91.anInt2055;
				Static19.anInt476 = 2;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(29);
				Static5.aClass3_Sub4_Sub1_1.method425(local31);
			}
		}
		if (local23 == 65) {
			Static66.method1101(Static77.anInt1841);
			Static77.anInt1841 = -1;
			Static86.aBoolean153 = true;
		}
		if (local23 == 54 && Static103.method1691(local31, local19, local15)) {
			Static5.aClass3_Sub4_Sub1_1.method464(223);
			Static5.aClass3_Sub4_Sub1_1.method455(Static22.anInt498);
			Static5.aClass3_Sub4_Sub1_1.method433(Static78.anInt434);
			Static5.aClass3_Sub4_Sub1_1.method431(local15 + Static43.anInt1144);
			Static5.aClass3_Sub4_Sub1_1.method455(Static77.anInt1837);
			Static5.aClass3_Sub4_Sub1_1.method455(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method425(Static93.anInt2429 + local19);
		}
		if (local23 == 26) {
			Static5.aClass3_Sub4_Sub1_1.method464(33);
			Static5.aClass3_Sub4_Sub1_1.method425(local15);
			Static5.aClass3_Sub4_Sub1_1.method450(local19);
			Static5.aClass3_Sub4_Sub1_1.method457(local31);
			Static106.anInt2669 = local15;
			Static22.anInt500 = 2;
			Static11.anInt2846 = local19;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
			Static71.anInt1710 = 0;
		}
		if (local23 == 36) {
			Static103.method1691(local31, local19, local15);
			Static5.aClass3_Sub4_Sub1_1.method464(8);
			Static5.aClass3_Sub4_Sub1_1.method455(local19 + Static93.anInt2429);
			Static5.aClass3_Sub4_Sub1_1.method457(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method425(local15 + Static43.anInt1144);
		}
		if (local23 == 7) {
			Static5.aClass3_Sub4_Sub1_1.method464(151);
			Static5.aClass3_Sub4_Sub1_1.method433(local19);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
			Static106.anInt2669 = local15;
			Static71.anInt1710 = 0;
			Static22.anInt500 = 2;
			if (Static48.anInt1201 == local19 >> 16) {
				Static22.anInt500 = 1;
			}
			Static11.anInt2846 = local19;
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 12) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				anInt1491 = 0;
				Static55.anInt1393 = Static4.anInt194;
				Static19.anInt476 = 2;
				Static49.anInt1217 = Static91.anInt2055;
				Static5.aClass3_Sub4_Sub1_1.method464(128);
				Static5.aClass3_Sub4_Sub1_1.method457(local31);
			}
		}
		if (local23 == 66) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(153);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 55) {
			Static5.aClass3_Sub4_Sub1_1.method464(41);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method433(local19);
			Static11.anInt2846 = local19;
			Static71.anInt1710 = 0;
			Static106.anInt2669 = local15;
			Static22.anInt500 = 2;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 50) {
			local471 = Static47.method828(local19);
			@Pc(1676) boolean local1676 = true;
			if (local471.anInt2087 > 0) {
				local1676 = Static16.method235(local471);
			}
			if (local1676) {
				Static5.aClass3_Sub4_Sub1_1.method464(187);
				Static5.aClass3_Sub4_Sub1_1.method424(local19);
			}
		}
		if (local23 == 17) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static19.anInt476 = 2;
				anInt1491 = 0;
				Static49.anInt1217 = Static91.anInt2055;
				Static55.anInt1393 = Static4.anInt194;
				Static5.aClass3_Sub4_Sub1_1.method464(109);
				Static5.aClass3_Sub4_Sub1_1.method431(Static77.anInt1837);
				Static5.aClass3_Sub4_Sub1_1.method433(Static78.anInt434);
				Static5.aClass3_Sub4_Sub1_1.method431(local31);
				Static5.aClass3_Sub4_Sub1_1.method457(Static22.anInt498);
			}
		}
		if (local23 == 1001) {
			Static49.anInt1217 = Static91.anInt2055;
			anInt1491 = 0;
			Static19.anInt476 = 2;
			Static55.anInt1393 = Static4.anInt194;
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				@Pc(1786) Class3_Sub1_Sub17 local1786 = local616.aClass3_Sub1_Sub17_1;
				if (local1786.anIntArray307 != null) {
					local1786 = local1786.method1676();
				}
				if (local1786 != null) {
					Static5.aClass3_Sub4_Sub1_1.method464(172);
					Static5.aClass3_Sub4_Sub1_1.method457(local1786.anInt2522);
				}
			}
		}
		if (local23 == 11) {
			local1183 = Static104.aClass4Array20[arg0];
			local491 = local1183.method117(Static46.aClass4_1539);
			if (local491 != -1) {
				if (Static48.anInt1201 == -1) {
					Static42.method795();
					if (Static23.anInt514 != -1) {
						Static113.aClass4_1602 = local1183.method137(local491 + 5).method124();
						Static72.anInt1740 = Static48.anInt1201 = Static23.anInt514;
						Static70.aBoolean130 = false;
					}
				} else {
					Static21.method296(Static23.aClass4_258, Static113.aClass4_1604, 0);
				}
			}
		}
		if (local23 == 18) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static19.anInt476 = 2;
				Static49.anInt1217 = Static91.anInt2055;
				Static55.anInt1393 = Static4.anInt194;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(242);
				Static5.aClass3_Sub4_Sub1_1.method457(local31);
			}
		}
		if (local23 == 22) {
			local471 = Static47.method828(local19);
			Static98.anInt2368 = 0;
			Static9.anInt313 = local19;
			Static63.anInt1604 = local471.anInt2120;
			Static92.aClass4_1188 = local471.aClass4_1185;
			Static39.aBoolean74 = true;
			Static101.anInt2512 = 1;
			Static34.aClass4_519 = method1012(new Class4[] { Static34.aClass4_522, local471.aClass4_1190, Static46.aClass4_1539 });
			if (Static63.anInt1604 == 16) {
				Static70.anInt1686 = 3;
				Static89.aBoolean159 = true;
				Static39.aBoolean74 = true;
			}
			return;
		}
		if (local23 == 45) {
			Static103.method1691(local31, local19, local15);
			Static5.aClass3_Sub4_Sub1_1.method464(204);
			Static5.aClass3_Sub4_Sub1_1.method431(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method457(local15 + Static43.anInt1144);
			Static5.aClass3_Sub4_Sub1_1.method457(local31 >> 14 & 0x7FFF);
		}
		if (local23 == 14) {
			Static77.anInt1837 = local31;
			Static22.anInt498 = local15;
			Static78.anInt434 = local19;
			Static98.anInt2368 = 1;
			Static48.aClass4_630 = method1012(new Class4[] { Static101.aClass4_1391, Static3.method1550(local31).aClass4_347, Static46.aClass4_1539 });
			Static101.anInt2512 = 0;
			Static39.aBoolean74 = true;
			if (Static48.aClass4_630 == null) {
				Static48.aClass4_630 = Static79.aClass4_1053;
			}
			return;
		}
		if (local23 == 38) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static55.anInt1393 = Static4.anInt194;
				Static19.anInt476 = 2;
				Static49.anInt1217 = Static91.anInt2055;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(114);
				Static5.aClass3_Sub4_Sub1_1.method455(local31);
			}
		}
		if (local23 == 43) {
			Static5.aClass3_Sub4_Sub1_1.method464(187);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			local471 = Static47.method828(local19);
			if (local471.anIntArrayArray21 != null && local471.anIntArrayArray21[0][0] == 5) {
				local491 = local471.anIntArrayArray21[0][1];
				if (local471.anIntArray268[0] != Static106.anIntArray329[local491]) {
					Static106.anIntArray329[local491] = local471.anIntArray268[0];
					Static45.method813(local491);
					Static39.aBoolean74 = true;
				}
			}
		}
		if (local23 == 47) {
			if (Static106.aBoolean231) {
				Static38.aClass61_30.method1301(local15 - 4, local19 + -4);
			} else {
				Static38.aClass61_30.method1301(Static4.anInt194 - 4, Static91.anInt2055 + -4);
			}
		}
		if (local23 == 39) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(163);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 9) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static55.anInt1393 = Static4.anInt194;
				anInt1491 = 0;
				Static19.anInt476 = 2;
				Static49.anInt1217 = Static91.anInt2055;
				Static5.aClass3_Sub4_Sub1_1.method464(177);
				Static5.aClass3_Sub4_Sub1_1.method455(local31);
			}
		}
		if (local23 == 30 && Static69.anInt2250 == -1) {
			Static5.aClass3_Sub4_Sub1_1.method464(34);
			Static5.aClass3_Sub4_Sub1_1.method442(local19);
			Static69.anInt2250 = local19;
		}
		if (local23 == 28) {
			Static5.aClass3_Sub4_Sub1_1.method464(148);
			Static5.aClass3_Sub4_Sub1_1.method442(local19);
			Static5.aClass3_Sub4_Sub1_1.method425(local31);
			Static5.aClass3_Sub4_Sub1_1.method450(Static9.anInt313);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
			Static106.anInt2669 = local15;
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			Static71.anInt1710 = 0;
			if (Static48.anInt1201 == local19 >> 16) {
				Static22.anInt500 = 1;
			}
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 42) {
			Static5.aClass3_Sub4_Sub1_1.method464(112);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method457(local31);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
			Static106.anInt2669 = local15;
			Static71.anInt1710 = 0;
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 4 || local23 == 56) {
			local1183 = Static104.aClass4Array20[arg0];
			local491 = local1183.method117(Static46.aClass4_1539);
			if (local491 != -1) {
				local1183 = local1183.method137(local491 + 5).method124();
				@Pc(2436) Class4 local2436 = local1183.method159().method130();
				@Pc(2438) boolean local2438 = false;
				for (local1195 = 0; local1195 < Static11.anInt2841; local1195++) {
					@Pc(2448) Class3_Sub1_Sub1_Sub1_Sub2 local2448 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local1195]];
					if (local2448 != null && local2448.aClass4_1302 != null && local2448.aClass4_1302.method160(local2436)) {
						local2438 = true;
						Static107.method1822(local2448.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local2448.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
						if (local23 == 4) {
							Static5.aClass3_Sub4_Sub1_1.method464(242);
							Static5.aClass3_Sub4_Sub1_1.method457(Static92.anIntArray270[local1195]);
						}
						if (local23 == 56) {
							Static5.aClass3_Sub4_Sub1_1.method464(98);
							Static5.aClass3_Sub4_Sub1_1.method425(Static92.anIntArray270[local1195]);
						}
						break;
					}
				}
				if (!local2438) {
					Static21.method296(method1012(new Class4[] { Static25.aClass4_350, local2436 }), Static113.aClass4_1604, 0);
				}
			}
		}
		if (local23 == 6) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static55.anInt1393 = Static4.anInt194;
			Static19.anInt476 = 2;
			Static49.anInt1217 = Static91.anInt2055;
			anInt1491 = 0;
			Static5.aClass3_Sub4_Sub1_1.method464(207);
			Static5.aClass3_Sub4_Sub1_1.method455(Static43.anInt1144 + local15);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method425(Static93.anInt2429 + local19);
		}
		if (local23 == 21) {
			Static5.aClass3_Sub4_Sub1_1.method464(250);
			Static5.aClass3_Sub4_Sub1_1.method442(Static78.anInt434);
			Static5.aClass3_Sub4_Sub1_1.method457(local15);
			Static5.aClass3_Sub4_Sub1_1.method450(local19);
			Static5.aClass3_Sub4_Sub1_1.method457(Static22.anInt498);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method455(Static77.anInt1837);
			Static22.anInt500 = 2;
			Static11.anInt2846 = local19;
			Static106.anInt2669 = local15;
			Static71.anInt1710 = 0;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (Static6.anInt259 == local19 >> 16) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 27) {
			Static5.aClass3_Sub4_Sub1_1.method464(186);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method442(local19);
			Static5.aClass3_Sub4_Sub1_1.method425(local15);
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			if (Static48.anInt1201 == local19 >> 16) {
				Static22.anInt500 = 1;
			}
			Static71.anInt1710 = 0;
			Static106.anInt2669 = local15;
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 63) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static19.anInt476 = 2;
				anInt1491 = 0;
				Static55.anInt1393 = Static4.anInt194;
				Static49.anInt1217 = Static91.anInt2055;
				Static5.aClass3_Sub4_Sub1_1.method464(206);
				Static5.aClass3_Sub4_Sub1_1.method433(Static78.anInt434);
				Static5.aClass3_Sub4_Sub1_1.method455(Static22.anInt498);
				Static5.aClass3_Sub4_Sub1_1.method431(local31);
				Static5.aClass3_Sub4_Sub1_1.method457(Static77.anInt1837);
			}
		}
		if (local23 == 23) {
			Static103.method1691(local31, local19, local15);
			Static5.aClass3_Sub4_Sub1_1.method464(243);
			Static5.aClass3_Sub4_Sub1_1.method431(local19 + Static93.anInt2429);
			Static5.aClass3_Sub4_Sub1_1.method457(local31 >> 14 & 0x7FFF);
			Static5.aClass3_Sub4_Sub1_1.method455(local15 + Static43.anInt1144);
		}
		if (local23 == 33) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(123);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 34) {
			local616 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local31];
			if (local616 != null) {
				Static107.method1822(local616.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local616.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static49.anInt1217 = Static91.anInt2055;
				Static19.anInt476 = 2;
				Static55.anInt1393 = Static4.anInt194;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(142);
				Static5.aClass3_Sub4_Sub1_1.method431(local31);
			}
		}
		if (local23 == 60) {
			Static5.aClass3_Sub4_Sub1_1.method464(83);
			Static5.aClass3_Sub4_Sub1_1.method442(local19);
			Static5.aClass3_Sub4_Sub1_1.method457(local31);
			Static5.aClass3_Sub4_Sub1_1.method431(local15);
			Static11.anInt2846 = local19;
			Static71.anInt1710 = 0;
			Static22.anInt500 = 2;
			Static106.anInt2669 = local15;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 15) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(196);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 24) {
			local379 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local379 != null) {
				Static107.method1822(local379.anIntArray286[0], 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local379.anIntArray289[0], Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
				Static19.anInt476 = 2;
				Static55.anInt1393 = Static4.anInt194;
				Static49.anInt1217 = Static91.anInt2055;
				anInt1491 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(136);
				Static5.aClass3_Sub4_Sub1_1.method457(local31);
				Static5.aClass3_Sub4_Sub1_1.method442(Static9.anInt313);
			}
		}
		if (local23 == 32) {
			Static5.aClass3_Sub4_Sub1_1.method464(66);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method457(local15);
			Static106.anInt2669 = local15;
			Static71.anInt1710 = 0;
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			if (local19 >> 16 == Static48.anInt1201) {
				Static22.anInt500 = 1;
			}
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (local23 == 16) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(84);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 51) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(100);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 49) {
			Static42.method795();
		}
		if (local23 == 64) {
			Static47.method828(local19);
			Static5.aClass3_Sub4_Sub1_1.method464(147);
			Static5.aClass3_Sub4_Sub1_1.method424(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local15);
		}
		if (local23 == 59 || local23 == 1 || local23 == 29 || local23 == 61) {
			local1183 = Static104.aClass4Array20[arg0];
			local491 = local1183.method117(Static46.aClass4_1539);
			if (local491 != -1) {
				local1206 = local1183.method137(local491 + 5).method124().method149();
				if (local23 == 59) {
					Static31.method627(local1206);
				}
				if (local23 == 1) {
					Static87.method995(local1206);
				}
				if (local23 == 29) {
					Static44.method812(local1206);
				}
				if (local23 == 61) {
					Static112.method1922(local1206);
				}
			}
		}
		if (local23 == 35) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			Static49.anInt1217 = Static91.anInt2055;
			Static55.anInt1393 = Static4.anInt194;
			Static19.anInt476 = 2;
			anInt1491 = 0;
			Static5.aClass3_Sub4_Sub1_1.method464(1);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static5.aClass3_Sub4_Sub1_1.method455(local15 + Static43.anInt1144);
			Static5.aClass3_Sub4_Sub1_1.method431(local19 + Static93.anInt2429);
		}
		if (local23 == 13) {
			local72 = Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (!local72) {
				Static107.method1822(local19, 2, false, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local15, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 1, 1);
			}
			anInt1491 = 0;
			Static49.anInt1217 = Static91.anInt2055;
			Static19.anInt476 = 2;
			Static55.anInt1393 = Static4.anInt194;
			Static5.aClass3_Sub4_Sub1_1.method464(215);
			Static5.aClass3_Sub4_Sub1_1.method431(Static93.anInt2429 + local19);
			Static5.aClass3_Sub4_Sub1_1.method431(local31);
			Static5.aClass3_Sub4_Sub1_1.method455(Static43.anInt1144 + local15);
		}
		if (local23 == 3) {
			Static5.aClass3_Sub4_Sub1_1.method464(137);
			Static5.aClass3_Sub4_Sub1_1.method425(local15);
			Static5.aClass3_Sub4_Sub1_1.method450(local19);
			Static5.aClass3_Sub4_Sub1_1.method455(local31);
			Static11.anInt2846 = local19;
			Static22.anInt500 = 2;
			Static71.anInt1710 = 0;
			Static106.anInt2669 = local15;
			if (Static48.anInt1201 == local19 >> 16) {
				Static22.anInt500 = 1;
			}
			if (local19 >> 16 == Static6.anInt259) {
				Static22.anInt500 = 3;
			}
		}
		if (Static98.anInt2368 != 0) {
			Static39.aBoolean74 = true;
			Static98.anInt2368 = 0;
		}
		if (Static101.anInt2512 != 0) {
			Static39.aBoolean74 = true;
			Static101.anInt2512 = 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z[Lclient!ad;)Lclient!ad;")
	public static Class4 method1012(@OriginalArg(1) Class4[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static79.method1263(0, arg0, arg0.length);
	}
}
