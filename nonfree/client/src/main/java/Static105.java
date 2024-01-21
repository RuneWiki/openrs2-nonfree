import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1578 = Static80.method1463(" million");

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1575 = aClass63_1578;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!aa;")
	public static Class2 aClass2_10 = new Class2(512);

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1576 = Static80.method1463("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1577 = Static80.method1463("::clientdrop");

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "[I")
	public static int[] anIntArray319 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1579 = Static80.method1463("Stufe)2");

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1580 = Static80.method1463("Enter object name");

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "[I")
	public static int[] anIntArray320 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1581 = aClass63_1580;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method1894() {
		Static41.aClass49_12.method1389();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!rd;Lclient!ge;BLclient!rd;)Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 method1896(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(8) int local8 = arg1.method91(arg0);
		@Pc(19) int local19 = arg1.method107(local8, arg2);
		return Static22.method531(local8, local19, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static13.anInt433 != 0 && arg0 != -1) {
			Static47.method1028(Static113.aClass7_Sub1_4, arg0, 0, Static13.anInt433);
			Static64.aBoolean100 = true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
	public static void method1898() {
		if (Static74.anInt2070 > 0) {
			Static74.anInt2070--;
		}
		if (Static31.anInt1015 > 1) {
			Static31.anInt1015--;
		}
		if (Static73.aBoolean110) {
			Static73.aBoolean110 = false;
			Static85.method1864();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static92.method1678(); local29++) {
		}
		if (Static46.anInt1432 != 30 && Static46.anInt1432 != 35) {
			return;
		}
		if (Static84.aBoolean123 && Static46.anInt1432 == 30) {
			Static19.anInt642 = 0;
			Static47.anInt1499 = 0;
			while (Static120.method2145()) {
			}
			for (@Pc(64) int local64 = 0; local64 < Static44.aBooleanArray8.length; local64++) {
				Static44.aBooleanArray8[local64] = false;
			}
		}
		Static18.method465(Static23.aClass6_Sub4_Sub1_4);
		@Pc(91) Object local91 = Static2.aClass45_1.anObject3;
		@Pc(119) int local119;
		@Pc(112) int local112;
		@Pc(121) int local121;
		@Pc(135) int local135;
		synchronized (Static2.aClass45_1.anObject3) {
			if (!Static94.aBoolean141) {
				Static2.aClass45_1.anInt2010 = 0;
			} else if (Static19.anInt642 != 0 || Static2.aClass45_1.anInt2010 >= 40) {
				Static23.aClass6_Sub4_Sub1_4.method1347(178);
				local112 = 0;
				Static23.aClass6_Sub4_Sub1_4.method1330(0);
				local119 = Static23.aClass6_Sub4_Sub1_4.anInt1949;
				@Pc(155) int local155;
				for (local121 = 0; Static2.aClass45_1.anInt2010 > local121 && Static23.aClass6_Sub4_Sub1_4.anInt1949 - local119 < 240; local121++) {
					local135 = Static2.aClass45_1.anIntArray226[local121];
					local112++;
					if (local135 < 0) {
						local135 = 0;
					} else if (local135 > 764) {
						local135 = 764;
					}
					local155 = Static2.aClass45_1.anIntArray227[local121];
					if (local155 < 0) {
						local155 = 0;
					} else if (local155 > 502) {
						local155 = 502;
					}
					@Pc(175) int local175 = local155 * 765 + local135;
					if (Static2.aClass45_1.anIntArray227[local121] == -1 && Static2.aClass45_1.anIntArray226[local121] == -1) {
						local175 = 524287;
						local135 = -1;
						local155 = -1;
					}
					if (Static72.anInt2046 != local135 || Static31.anInt1028 != local155) {
						@Pc(218) int local218 = local135 - Static72.anInt2046;
						Static72.anInt2046 = local135;
						@Pc(224) int local224 = local155 - Static31.anInt1028;
						Static31.anInt1028 = local155;
						if (Static12.anInt421 < 8 && local218 >= -32 && local218 <= 31 && local224 >= -32 && local224 <= 31) {
							local218 += 32;
							local224 += 32;
							Static23.aClass6_Sub4_Sub1_4.method1332(local224 + (Static12.anInt421 << 12) + (local218 << 6));
							Static12.anInt421 = 0;
						} else if (Static12.anInt421 < 8) {
							Static23.aClass6_Sub4_Sub1_4.method1319((Static12.anInt421 << 19) + local175 + 8388608);
							Static12.anInt421 = 0;
						} else {
							Static23.aClass6_Sub4_Sub1_4.method1292((Static12.anInt421 << 19) + local175 - 1073741824);
							Static12.anInt421 = 0;
						}
					} else if (Static12.anInt421 < 2047) {
						Static12.anInt421++;
					}
				}
				Static23.aClass6_Sub4_Sub1_4.method1316(Static23.aClass6_Sub4_Sub1_4.anInt1949 - local119);
				if (local112 >= Static2.aClass45_1.anInt2010) {
					Static2.aClass45_1.anInt2010 = 0;
				} else {
					Static2.aClass45_1.anInt2010 -= local112;
					for (local155 = 0; local155 < Static2.aClass45_1.anInt2010; local155++) {
						Static2.aClass45_1.anIntArray226[local155] = Static2.aClass45_1.anIntArray226[local112 + local155];
						Static2.aClass45_1.anIntArray227[local155] = Static2.aClass45_1.anIntArray227[local155 + local112];
					}
				}
			}
		}
		if (Static19.anInt642 != 0) {
			@Pc(385) long local385 = (Static117.aLong82 - Static42.aLong36) / 50L;
			if (local385 > 4095L) {
				local385 = 4095L;
			}
			Static42.aLong36 = Static117.aLong82;
			local112 = Static59.anInt1765;
			@Pc(397) byte local397 = 0;
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 764) {
				local112 = 764;
			}
			local119 = Static61.anInt1804;
			if (Static19.anInt642 == 2) {
				local397 = 1;
			}
			if (local119 < 0) {
				local119 = 0;
			} else if (local119 > 502) {
				local119 = 502;
			}
			local121 = local119 * 765 + local112;
			local135 = (int) local385;
			Static23.aClass6_Sub4_Sub1_4.method1347(27);
			Static23.aClass6_Sub4_Sub1_4.method1322(local121 + (local397 << 19) + (local135 << 20));
		}
		if (Static44.aBooleanArray8[96] || Static44.aBooleanArray8[97] || Static44.aBooleanArray8[98] || Static44.aBooleanArray8[99]) {
			Static46.aBoolean70 = true;
		}
		if (Static82.anInt2238 > 0) {
			Static82.anInt2238--;
		}
		if (Static46.aBoolean70 && Static82.anInt2238 <= 0) {
			Static82.anInt2238 = 20;
			Static46.aBoolean70 = false;
			Static23.aClass6_Sub4_Sub1_4.method1347(226);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static109.anInt3032);
			Static23.aClass6_Sub4_Sub1_4.method1298(Static67.anInt1848);
		}
		if (Static81.aBoolean114 && !Static85.aBoolean151) {
			Static85.aBoolean151 = true;
			Static23.aClass6_Sub4_Sub1_4.method1347(240);
			Static23.aClass6_Sub4_Sub1_4.method1330(1);
		}
		if (!Static81.aBoolean114 && Static85.aBoolean151) {
			Static85.aBoolean151 = false;
			Static23.aClass6_Sub4_Sub1_4.method1347(240);
			Static23.aClass6_Sub4_Sub1_4.method1330(0);
		}
		Static118.method2113();
		if (Static46.anInt1432 != 30 && Static46.anInt1432 != 35) {
			return;
		}
		Static24.method584();
		Static51.method1069();
		Static100.anInt2788++;
		if (Static100.anInt2788 > 750) {
			Static85.method1864();
			return;
		}
		Static77.method1441();
		Static21.method527();
		Static23.method1549();
		if (Static112.anInt3088 != 0) {
			Static34.anInt1151 += 20;
			if (Static34.anInt1151 >= 400) {
				Static112.anInt3088 = 0;
			}
		}
		if (Static112.anInt3090 != 0) {
			Static106.anInt2947++;
			if (Static106.anInt2947 >= 15) {
				if (Static112.anInt3090 == 3) {
					Static15.aBoolean29 = true;
				}
				if (Static112.anInt3090 == 2) {
					Static10.aBoolean20 = true;
				}
				Static112.anInt3090 = 0;
			}
		}
		Static68.anInt1973++;
		if (Static38.anInt1235 != 0) {
			Static19.anInt631++;
			if (Static77.anInt2143 + 5 < Static102.anInt2823 || Static77.anInt2143 - 5 > Static102.anInt2823 || Static42.anInt1320 + 5 < Static59.anInt1768 || Static59.anInt1768 < Static42.anInt1320 - 5) {
				Static7.aBoolean9 = true;
			}
			if (Static47.anInt1499 == 0) {
				if (Static38.anInt1235 == 3) {
					Static15.aBoolean29 = true;
				}
				if (Static38.anInt1235 == 2) {
					Static10.aBoolean20 = true;
				}
				Static38.anInt1235 = 0;
				if (Static7.aBoolean9 && Static19.anInt631 >= 5) {
					Static50.anInt1518 = -1;
					Static112.method2068();
					if (Static24.anInt817 == Static50.anInt1518 && Static111.anInt3050 != Static36.anInt1216) {
						@Pc(722) Class6_Sub3_Sub17 local722 = Static12.method339(Static24.anInt817);
						@Pc(724) byte local724 = 0;
						if (Static2.anInt27 == 1 && local722.anInt3248 == 206) {
							local724 = 1;
						}
						if (local722.anIntArray362[Static111.anInt3050] <= 0) {
							local724 = 0;
						}
						if (method1900(Static82.method1498(local722))) {
							local119 = Static36.anInt1216;
							local112 = Static111.anInt3050;
							local722.anIntArray362[local112] = local722.anIntArray362[local119];
							local722.anIntArray363[local112] = local722.anIntArray363[local119];
							local722.anIntArray362[local119] = -1;
							local722.anIntArray363[local119] = 0;
						} else if (local724 == 1) {
							local112 = Static111.anInt3050;
							local119 = Static36.anInt1216;
							while (local119 != local112) {
								if (local112 < local119) {
									local722.method2144(local119, local119 - 1);
									local119--;
								} else if (local112 > local119) {
									local722.method2144(local119, local119 + 1);
									local119++;
								}
							}
						} else {
							local722.method2144(Static36.anInt1216, Static111.anInt3050);
						}
						Static23.aClass6_Sub4_Sub1_4.method1347(239);
						Static23.aClass6_Sub4_Sub1_4.method1317(Static24.anInt817);
						Static23.aClass6_Sub4_Sub1_4.method1330(local724);
						Static23.aClass6_Sub4_Sub1_4.method1298(Static111.anInt3050);
						Static23.aClass6_Sub4_Sub1_4.method1298(Static36.anInt1216);
					}
				} else if ((Static39.anInt1244 == 1 || Static53.method2061(Static18.anInt569 - 1)) && Static18.anInt569 > 2) {
					Static10.method267();
				} else if (Static18.anInt569 > 0) {
					Static37.method874(Static18.anInt569 - 1);
				}
				Static106.anInt2947 = 10;
				Static19.anInt642 = 0;
			}
		}
		if (Static14.anInt480 == -1) {
			if (Static102.anInt2833 != -1) {
				Static11.method1286(34, Static102.anInt2833, 4, 516, 338, 4);
			} else if (Static31.anInt1025 != -1) {
				Static11.method1286(34, Static31.anInt1025, 4, 516, 338, 4);
			}
			if (Static25.anInt847 != -1) {
				Static11.method1286(34, Static25.anInt847, 553, 743, 466, 205);
			} else if (Static111.anIntArray352[Static86.anInt2366] != -1) {
				Static11.method1286(34, Static111.anIntArray352[Static86.anInt2366], 553, 743, 466, 205);
			}
			if (Static49.anInt1513 != -1) {
				Static11.method1286(34, Static49.anInt1513, 17, 496, 453, 357);
			} else if (Static79.anInt2158 != -1) {
				Static11.method1286(34, Static79.anInt2158, 17, 496, 453, 357);
			}
		} else {
			Static11.method1286(34, Static14.anInt480, 0, 765, 503, 0);
			if (Static85.anInt2839 != -1) {
				Static11.method1286(34, Static85.anInt2839, 0, 765, 503, 0);
			}
		}
		if (Static14.anInt480 == -1) {
			if (Static102.anInt2833 != -1) {
				Static11.method1286(-35, Static102.anInt2833, 4, 516, 338, 4);
			} else if (Static31.anInt1025 != -1) {
				Static11.method1286(-35, Static31.anInt1025, 4, 516, 338, 4);
			}
			if (Static25.anInt847 != -1) {
				Static11.method1286(-35, Static25.anInt847, 553, 743, 466, 205);
			} else if (Static111.anIntArray352[Static86.anInt2366] != -1) {
				Static11.method1286(-35, Static111.anIntArray352[Static86.anInt2366], 553, 743, 466, 205);
			}
			if (Static49.anInt1513 != -1) {
				Static11.method1286(-35, Static49.anInt1513, 17, 496, 453, 357);
			} else if (Static79.anInt2158 != -1) {
				Static11.method1286(-35, Static79.anInt2158, 17, 496, 453, 357);
			}
		} else {
			Static11.method1286(-35, Static14.anInt480, 0, 765, 503, 0);
			if (Static85.anInt2839 != -1) {
				Static11.method1286(-35, Static85.anInt2839, 0, 765, 503, 0);
			}
		}
		Static24.method579();
		@Pc(1116) int local1116;
		if (Static28.anInt920 != -1) {
			local1116 = Static28.anInt920;
			local119 = Static28.anInt906;
			@Pc(1138) boolean local1138 = Static113.method488(0, local1116, 0, true, local119, 0, 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], 0, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], 0);
			if (local1138) {
				Static84.anInt2419 = Static59.anInt1765;
				Static76.anInt2138 = Static61.anInt1804;
				Static34.anInt1151 = 0;
				Static112.anInt3088 = 1;
			}
			Static28.anInt920 = -1;
		}
		if (Static19.anInt642 == 1 && Static2.aClass63_14 != null) {
			Static19.anInt642 = 0;
			Static2.aClass63_14 = null;
			Static15.aBoolean29 = true;
		}
		Static66.method2125();
		if (Static14.anInt480 == -1) {
			Static30.method718();
			Static5.method42();
			Static80.method1462();
		}
		if (Static30.anInt958 == -1 && Static103.anInt3207 == -1 && Static81.anInt2220 == -1) {
			if (Static84.anInt2421 > 0) {
				Static84.anInt2421--;
			}
		} else if (Static44.anInt1391 > Static84.anInt2421) {
			Static84.anInt2421++;
			if (Static44.anInt1391 == Static84.anInt2421) {
				if (Static103.anInt3207 != -1) {
					Static10.aBoolean20 = true;
				}
				if (Static30.anInt958 != -1) {
					Static15.aBoolean29 = true;
				}
			}
		}
		if (Static47.anInt1499 == 1 || Static19.anInt642 == 1) {
			Static11.anInt1969++;
		}
		Static114.method2076();
		if (Static17.aBoolean142) {
			Static18.method466();
		}
		for (local1116 = 0; local1116 < 5; local1116++) {
			@Pc(1241) int local1241 = Static81.anIntArray249[local1116]++;
		}
		Static29.method703();
		local119 = Static54.method1092();
		local112 = Static76.method1434();
		if (local119 > 4500 && local112 > 4500) {
			Static74.anInt2070 = 250;
			Static120.method2135(4000);
			Static23.aClass6_Sub4_Sub1_4.method1347(140);
		}
		Static56.anInt1710++;
		Static103.anInt3212++;
		Static37.anInt1226++;
		if (Static37.anInt1226 > 500) {
			Static37.anInt1226 = 0;
			local121 = (int) (Math.random() * 8.0D);
			if ((local121 & 0x2) == 2) {
				Static52.anInt1596 += Static40.anInt2121;
			}
			if ((local121 & 0x1) == 1) {
				Static102.anInt2827 += Static91.anInt2565;
			}
			if ((local121 & 0x4) == 4) {
				Static115.anInt3137 += Static5.anInt48;
			}
		}
		if (Static102.anInt2827 < -50) {
			Static91.anInt2565 = 2;
		}
		if (Static52.anInt1596 < -55) {
			Static40.anInt2121 = 2;
		}
		if (Static52.anInt1596 > 55) {
			Static40.anInt2121 = -2;
		}
		if (Static103.anInt3212 > 500) {
			Static103.anInt3212 = 0;
			local121 = (int) (Math.random() * 8.0D);
			if ((local121 & 0x2) == 2) {
				Static11.anInt1914 += Static54.anInt1630;
			}
			if ((local121 & 0x1) == 1) {
				Static84.anInt2420 += Static120.anInt3288;
			}
		}
		if (Static84.anInt2420 < -60) {
			Static120.anInt3288 = 2;
		}
		if (Static11.anInt1914 < -20) {
			Static54.anInt1630 = 1;
		}
		if (Static11.anInt1914 > 10) {
			Static54.anInt1630 = -1;
		}
		if (Static115.anInt3137 < -40) {
			Static5.anInt48 = 1;
		}
		if (Static115.anInt3137 > 40) {
			Static5.anInt48 = -1;
		}
		if (Static102.anInt2827 > 50) {
			Static91.anInt2565 = -2;
		}
		if (Static84.anInt2420 > 60) {
			Static120.anInt3288 = -2;
		}
		if (Static56.anInt1710 > 50) {
			Static23.aClass6_Sub4_Sub1_4.method1347(147);
		}
		try {
			if (Static100.aClass47_4 != null && Static23.aClass6_Sub4_Sub1_4.anInt1949 > 0) {
				Static100.aClass47_4.method1377(Static23.aClass6_Sub4_Sub1_4.anInt1949, Static23.aClass6_Sub4_Sub1_4.aByteArray27);
				Static23.aClass6_Sub4_Sub1_4.anInt1949 = 0;
				Static56.anInt1710 = 0;
			}
		} catch (@Pc(1451) IOException local1451) {
			Static85.method1864();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)Z")
	public static boolean method1900(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V")
	public static void method1901() {
		aClass63_1578 = null;
		aClass63_1576 = null;
		anIntArray320 = null;
		aClass2_10 = null;
		aClass63_1579 = null;
		aClass63_1581 = null;
		anIntArray319 = null;
		aClass63_1577 = null;
		aClass63_1575 = null;
		anIntArray321 = null;
		aClass63_1580 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII[Lclient!hc;[BBI)V")
	public static void method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class30[] arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg5 + local3 > 0 && arg5 + local3 < 103 && local7 + arg2 > 0 && local7 + arg2 < 103) {
					arg6[arg1].anIntArrayArray18[local3 + arg5][arg2 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Class6_Sub4 local79 = new Class6_Sub4(arg7);
		for (@Pc(85) int local85 = 0; local85 < 4; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
					if (arg0 == local85 && arg4 <= local89 && arg4 + 8 > local89 && arg3 <= local93 && arg3 + 8 > local93) {
						Static33.method842(arg5 + Static57.method1136(arg8, local89 & 0x7, local93 & 0x7), arg2 - -Static58.method1142(local89 & 0x7, local93 & 0x7, arg8), arg1, 0, local79, 0, arg8);
					} else {
						Static33.method842(-1, -1, 0, 0, local79, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)Lclient!ie;")
	public static Class6_Sub3_Sub9 method1903(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub3_Sub9 local12 = (Class6_Sub3_Sub9) Static51.aClass49_16.method1397((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static81.aClass7_Sub1_13.method110(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class6_Sub3_Sub9();
		@Pc(35) Class6_Sub4 local35 = new Class6_Sub4(local22);
		local35.anInt1949 = local35.aByteArray27.length - 12;
		@Pc(46) int local46 = local35.method1289();
		local12.anInt1640 = local35.method1306();
		local12.anInt1639 = local35.method1306();
		local12.anInt1635 = local35.method1306();
		local12.anInt1632 = local35.method1306();
		local12.anIntArray180 = new int[local46];
		local35.anInt1949 = 0;
		@Pc(80) int local80 = 0;
		local12.anIntArray177 = new int[local46];
		local12.aClass63Array14 = new Class63[local46];
		while (local35.aByteArray27.length - 12 > local35.anInt1949) {
			@Pc(94) int local94 = local35.method1306();
			if (local94 == 3) {
				local12.aClass63Array14[local80] = local35.method1339();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray180[local80] = local35.method1321();
			} else {
				local12.anIntArray180[local80] = local35.method1289();
			}
			local12.anIntArray177[local80++] = local94;
		}
		Static51.aClass49_16.method1396((long) arg0, local12);
		return local12;
	}
}
