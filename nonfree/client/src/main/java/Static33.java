import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!ac;")
	public static Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_428 = Static56.method972("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!ae;")
	private static Class5 aClass5_434 = Static56.method972(" has logged out)3");

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_429 = aClass5_434;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_430 = Static56.method972("(U1");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_431 = Static56.method972("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_432 = Static56.method972("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_433 = Static56.method972("cross");

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt927 = 0;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
	public static int[] anIntArray119 = new int[5];

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_435 = Static56.method972("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_436 = Static56.method972("(Z");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method648() {
		Static115.aClass37_1.method1695();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static69.aLongArray5[local14] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static111.aLongArray7[local28] = 0L;
		}
		Static3.anInt291 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLclient!bf;Lclient!bf;I)V")
	public static void method649(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		Static82.aClass11_46 = arg2;
		Static64.aBoolean79 = arg0;
		Static2.aClass11_6 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method650() {
		Static31.aClass9_12.method283();
		Static3.aClass9_4.method283();
		Static82.aClass9_21.method283();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method651(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static13.anIntArray61[arg0];
		@Pc(16) int local16 = Static70.anIntArray207[arg0];
		@Pc(20) int local20 = Static52.anIntArray162[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(30) int local30 = Static12.anIntArray57[arg0];
		if (Static68.anInt1553 != 0 && local20 != 1002) {
			Static15.aBoolean22 = true;
			Static68.anInt1553 = 0;
		}
		if (local20 == 32) {
			Static95.aClass3_Sub6_Sub1_3.method1645(182);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1634(local12);
			Static95.aClass3_Sub6_Sub1_3.method1592(local16);
			Static43.anInt1217 = local12;
			Static109.anInt2868 = local16;
			Static35.anInt1005 = 2;
			Static42.anInt1190 = 0;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 1005) {
			Static2.method113(local30, local12, local16);
			Static95.aClass3_Sub6_Sub1_3.method1645(120);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 12 && Static2.method113(local30, local12, local16)) {
			Static95.aClass3_Sub6_Sub1_3.method1645(78);
			Static95.aClass3_Sub6_Sub1_3.method1630(Static62.anInt1671);
			Static95.aClass3_Sub6_Sub1_3.method1634(local12 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static47.anInt1309);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1635(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 8 && Static85.anInt2100 == -1) {
			Static99.method1662(local12, local16);
			Static4.anInt323 = local12;
			Static85.anInt2100 = local16;
		}
		@Pc(224) boolean local224;
		if (local20 == 40) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static5.anInt352 = 2;
			Static37.anInt1040 = 0;
			Static67.anInt1779 = Static99.anInt2491;
			Static31.anInt1151 = Static45.anInt1269;
			Static95.aClass3_Sub6_Sub1_3.method1645(149);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30);
		}
		@Pc(297) int local297;
		@Pc(312) long local312;
		@Pc(292) Class5 local292;
		if (local20 == 31 || local20 == 21 || local20 == 2 || local20 == 50) {
			local292 = Static49.aClass5Array9[arg0];
			local297 = local292.method154(Static36.aClass5_1258);
			if (local297 != -1) {
				local312 = local292.method159(local297 + 5).method143().method146();
				if (local20 == 31) {
					Static113.method1938(local312);
				}
				if (local20 == 21) {
					Static109.method1901(local312);
				}
				if (local20 == 2) {
					Static24.method460(local312);
				}
				if (local20 == 50) {
					Static23.method451(local312);
				}
			}
		}
		if (local20 == 38) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static5.anInt352 = 2;
			Static67.anInt1779 = Static99.anInt2491;
			Static31.anInt1151 = Static45.anInt1269;
			Static37.anInt1040 = 0;
			Static95.aClass3_Sub6_Sub1_3.method1645(252);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static52.anInt1378 + local16);
		}
		if (local20 == 28) {
			Static95.aClass3_Sub6_Sub1_3.method1645(0);
			Static95.aClass3_Sub6_Sub1_3.method1589(local12);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			Static95.aClass3_Sub6_Sub1_3.method1592(local16);
			Static42.anInt1190 = 0;
			Static109.anInt2868 = local16;
			Static43.anInt1217 = local12;
			Static35.anInt1005 = 2;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 35) {
			Static95.aClass3_Sub6_Sub1_3.method1645(144);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static43.anInt1217 = local12;
			Static42.anInt1190 = 0;
			Static109.anInt2868 = local16;
			Static35.anInt1005 = 2;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
		}
		@Pc(529) Class3_Sub1_Sub17 local529;
		if (local20 == 14) {
			local529 = Static67.method1171(local16, local12);
			if (local529 != null) {
				Static68.method992();
				Static35.method684(local529.method1710(), local12, local16);
				Static116.aBoolean157 = true;
				Static14.anInt2886 = 0;
				Static16.aClass5_274 = local529.method1721(Static23.aBoolean33);
				if (Static16.aClass5_274 == null) {
					Static16.aClass5_274 = Static62.aClass5_790;
				}
				if (local529.aBoolean127) {
					Static15.aClass5_210 = Static75.method1261(new Class5[] { local529.aClass5_1186, Static36.aClass5_1258 });
				} else {
					Static15.aClass5_210 = Static75.method1261(new Class5[] { Static62.aClass5_793, local529.aClass5_1187, Static36.aClass5_1258 });
				}
				if (Static62.anInt1672 == 16 && !local529.aBoolean127) {
					Static60.anInt2979 = 3;
					Static100.aBoolean123 = true;
					Static116.aBoolean157 = true;
				}
			}
			return;
		}
		@Pc(614) Class3_Sub1_Sub1_Sub1_Sub1 local614;
		if (local20 == 42) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static5.anInt352 = 2;
				Static67.anInt1779 = Static99.anInt2491;
				Static37.anInt1040 = 0;
				Static31.anInt1151 = Static45.anInt1269;
				Static95.aClass3_Sub6_Sub1_3.method1645(154);
				Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			}
		}
		if (local20 == 47) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static67.anInt1779 = Static99.anInt2491;
				Static31.anInt1151 = Static45.anInt1269;
				Static37.anInt1040 = 0;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(146);
				Static95.aClass3_Sub6_Sub1_3.method1622(Static85.anInt2106);
				Static95.aClass3_Sub6_Sub1_3.method1634(Static105.anInt2694);
				Static95.aClass3_Sub6_Sub1_3.method1634(Static32.anInt920);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (local20 == 53) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static37.anInt1040 = 0;
				Static5.anInt352 = 2;
				Static67.anInt1779 = Static99.anInt2491;
				Static31.anInt1151 = Static45.anInt1269;
				Static95.aClass3_Sub6_Sub1_3.method1645(222);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (local20 == 4) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static5.anInt352 = 2;
			Static67.anInt1779 = Static99.anInt2491;
			Static37.anInt1040 = 0;
			Static31.anInt1151 = Static45.anInt1269;
			Static95.aClass3_Sub6_Sub1_3.method1645(114);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static105.anInt2694);
			Static95.aClass3_Sub6_Sub1_3.method1635(local16 + Static52.anInt1378);
			Static95.aClass3_Sub6_Sub1_3.method1611(Static85.anInt2106);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static32.anInt920);
		}
		if (local20 == 49) {
			Static95.aClass3_Sub6_Sub1_3.method1645(171);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static109.anInt2868 = local16;
			Static35.anInt1005 = 2;
			Static42.anInt1190 = 0;
			Static43.anInt1217 = local12;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 26) {
			Static95.aClass3_Sub6_Sub1_3.method1645(188);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			Static95.aClass3_Sub6_Sub1_3.method1622(local16);
			Static43.anInt1217 = local12;
			Static35.anInt1005 = 2;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
			Static109.anInt2868 = local16;
			Static42.anInt1190 = 0;
		}
		if (local20 == 11) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static37.anInt1040 = 0;
			Static67.anInt1779 = Static99.anInt2491;
			Static31.anInt1151 = Static45.anInt1269;
			Static5.anInt352 = 2;
			Static95.aClass3_Sub6_Sub1_3.method1645(38);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static109.anInt2875 + local12);
		}
		if (local20 == 43) {
			Static2.method113(local30, local12, local16);
			Static95.aClass3_Sub6_Sub1_3.method1645(69);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30 >> 14 & 0x7FFF);
			Static95.aClass3_Sub6_Sub1_3.method1634(local16 + Static52.anInt1378);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static109.anInt2875 + local12);
		}
		if (local20 == 48) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static31.anInt1151 = Static45.anInt1269;
				Static37.anInt1040 = 0;
				Static67.anInt1779 = Static99.anInt2491;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(200);
				Static95.aClass3_Sub6_Sub1_3.method1589(Static47.anInt1309);
				Static95.aClass3_Sub6_Sub1_3.method1592(Static62.anInt1671);
				Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			}
		}
		@Pc(1177) Class3_Sub1_Sub1_Sub1_Sub2 local1177;
		if (local20 == 58) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static67.anInt1779 = Static99.anInt2491;
				Static37.anInt1040 = 0;
				Static31.anInt1151 = Static45.anInt1269;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(104);
				Static95.aClass3_Sub6_Sub1_3.method1630(Static85.anInt2106);
				Static95.aClass3_Sub6_Sub1_3.method1599(Static32.anInt920);
				Static95.aClass3_Sub6_Sub1_3.method1589(local30);
				Static95.aClass3_Sub6_Sub1_3.method1599(Static105.anInt2694);
			}
		}
		if (local20 == 45 && Static2.method113(local30, local12, local16)) {
			Static95.aClass3_Sub6_Sub1_3.method1645(195);
			Static95.aClass3_Sub6_Sub1_3.method1599(local16 + Static52.anInt1378);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30 >> 14 & 0x7FFF);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static105.anInt2694);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static32.anInt920);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1592(Static85.anInt2106);
		}
		if (local20 == 1004) {
			local529 = Static58.method1009(local16);
			if (local529 == null || local529.anIntArray308[local12] < 100000) {
				Static95.aClass3_Sub6_Sub1_3.method1645(219);
				Static95.aClass3_Sub6_Sub1_3.method1635(local30);
			} else {
				Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { Static96.method1319(local529.anIntArray308[local12]), Static46.aClass5_610, Static37.method694(local30).aClass5_300 }), 0);
			}
			Static43.anInt1217 = local12;
			Static35.anInt1005 = 2;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
			Static109.anInt2868 = local16;
			Static42.anInt1190 = 0;
		}
		if (local20 == 25) {
			Static95.aClass3_Sub6_Sub1_3.method1645(221);
			Static95.aClass3_Sub6_Sub1_3.method1630(local16);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			Static109.anInt2868 = local16;
			Static35.anInt1005 = 2;
			Static42.anInt1190 = 0;
			Static43.anInt1217 = local12;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 6) {
			Static2.method113(local30, local12, local16);
			Static95.aClass3_Sub6_Sub1_3.method1645(202);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30 >> 14 & 0x7FFF);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static52.anInt1378 + local16);
		}
		if (local20 == 19) {
			Static95.aClass3_Sub6_Sub1_3.method1645(178);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
			Static95.aClass3_Sub6_Sub1_3.method1635(local30);
			Static95.aClass3_Sub6_Sub1_3.method1622(local16);
			Static35.anInt1005 = 2;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			Static42.anInt1190 = 0;
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
			Static43.anInt1217 = local12;
			Static109.anInt2868 = local16;
		}
		if (local20 == 33) {
			if (Static103.aBoolean142) {
				Static73.aClass42_1.method1011(local12 - 4, local16 + -4);
			} else {
				Static73.aClass42_1.method1011(Static45.anInt1269 - 4, Static99.anInt2491 + -4);
			}
		}
		if (local20 == 24) {
			Static67.method1174(Static100.anInt2515);
			Static100.anInt2515 = -1;
			Static15.aBoolean22 = true;
		}
		if (local20 == 34) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static5.anInt352 = 2;
			Static31.anInt1151 = Static45.anInt1269;
			Static37.anInt1040 = 0;
			Static67.anInt1779 = Static99.anInt2491;
			Static95.aClass3_Sub6_Sub1_3.method1645(85);
			Static95.aClass3_Sub6_Sub1_3.method1635(local16 + Static52.anInt1378);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30);
		}
		if (local20 == 51) {
			Static51.method1564(local16, local12, local30);
		}
		if (local20 == 1) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static37.anInt1040 = 0;
				Static67.anInt1779 = Static99.anInt2491;
				Static31.anInt1151 = Static45.anInt1269;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(206);
				Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			}
		}
		@Pc(1745) int local1745;
		if (local20 == 10) {
			local292 = Static49.aClass5Array9[arg0];
			local297 = local292.method154(Static36.aClass5_1258);
			if (local297 != -1) {
				local312 = local292.method159(local297 + 5).method143().method146();
				local1745 = -1;
				for (@Pc(1747) int local1747 = 0; local1747 < Static5.anInt346; local1747++) {
					if (local312 == Static94.aLongArray2[local1747]) {
						local1745 = local1747;
						break;
					}
				}
				if (local1745 != -1 && Static57.anIntArray183[local1745] > 0) {
					Static15.aBoolean22 = true;
					Static103.aBoolean141 = true;
					Static17.anInt614 = 3;
					Static68.anInt1553 = 0;
					Static110.aClass5_1301 = Static110.aClass5_1307;
					Static61.aLong52 = Static94.aLongArray2[local1745];
					Static110.aClass5_1299 = Static75.method1261(new Class5[] { Static62.aClass5_792, Static34.aClass5Array8[local1745] });
				}
			}
		}
		if (local20 == 36) {
			Static95.aClass3_Sub6_Sub1_3.method1645(54);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			local529 = Static58.method1009(local16);
			if (local529.anIntArrayArray20 != null && local529.anIntArrayArray20[0][0] == 5) {
				local297 = local529.anIntArrayArray20[0][1];
				Static110.anIntArray373[local297] = 1 - Static110.anIntArray373[local297];
				Static60.method1961(local297);
				Static116.aBoolean157 = true;
			}
		}
		if (local20 == 1001) {
			Static31.anInt1151 = Static45.anInt1269;
			Static37.anInt1040 = 0;
			Static5.anInt352 = 2;
			Static67.anInt1779 = Static99.anInt2491;
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				@Pc(1883) Class3_Sub1_Sub13 local1883 = local614.aClass3_Sub1_Sub13_1;
				if (local1883.anIntArray251 != null) {
					local1883 = local1883.method1480();
				}
				if (local1883 != null) {
					Static95.aClass3_Sub6_Sub1_3.method1645(158);
					Static95.aClass3_Sub6_Sub1_3.method1634(local1883.anInt2212);
				}
			}
		}
		if (local20 == 15 || local20 == 37) {
			local292 = Static49.aClass5Array9[arg0];
			local297 = local292.method154(Static36.aClass5_1258);
			if (local297 != -1) {
				local292 = local292.method159(local297 + 5).method143();
				@Pc(1942) Class5 local1942 = local292.method155().method147();
				@Pc(1944) boolean local1944 = false;
				for (local1745 = 0; local1745 < Static38.anInt1056; local1745++) {
					@Pc(1954) Class3_Sub1_Sub1_Sub1_Sub2 local1954 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local1745]];
					if (local1954 != null && local1954.aClass5_765 != null && local1954.aClass5_765.method171(local1942)) {
						local1944 = true;
						Static37.method696(0, local1954.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1954.anIntArray181[0]);
						if (local20 == 15) {
							Static95.aClass3_Sub6_Sub1_3.method1645(101);
							Static95.aClass3_Sub6_Sub1_3.method1599(Static1.anIntArray6[local1745]);
						}
						if (local20 == 37) {
							Static95.aClass3_Sub6_Sub1_3.method1645(11);
							Static95.aClass3_Sub6_Sub1_3.method1599(Static1.anIntArray6[local1745]);
						}
						break;
					}
				}
				if (!local1944) {
					Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { Static65.aClass5_1113, local1942 }), 0);
				}
			}
		}
		if (local20 == 27) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static37.anInt1040 = 0;
			Static67.anInt1779 = Static99.anInt2491;
			Static31.anInt1151 = Static45.anInt1269;
			Static5.anInt352 = 2;
			Static95.aClass3_Sub6_Sub1_3.method1645(64);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			Static95.aClass3_Sub6_Sub1_3.method1630(Static62.anInt1671);
			Static95.aClass3_Sub6_Sub1_3.method1634(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static109.anInt2875 + local12);
			Static95.aClass3_Sub6_Sub1_3.method1599(Static47.anInt1309);
		}
		if (local20 == 16) {
			Static95.aClass3_Sub6_Sub1_3.method1645(29);
			Static95.aClass3_Sub6_Sub1_3.method1622(local16);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12);
			Static35.anInt1005 = 2;
			Static43.anInt1217 = local12;
			Static42.anInt1190 = 0;
			Static109.anInt2868 = local16;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 7) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static31.anInt1151 = Static45.anInt1269;
				Static67.anInt1779 = Static99.anInt2491;
				Static5.anInt352 = 2;
				Static37.anInt1040 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1645(236);
				Static95.aClass3_Sub6_Sub1_3.method1635(local30);
				Static95.aClass3_Sub6_Sub1_3.method1635(Static47.anInt1309);
				Static95.aClass3_Sub6_Sub1_3.method1592(Static62.anInt1671);
			}
		}
		if (local20 == 18) {
			Static95.aClass3_Sub6_Sub1_3.method1645(147);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static32.anInt920);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static105.anInt2694);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1592(local16);
			Static95.aClass3_Sub6_Sub1_3.method1630(Static85.anInt2106);
			Static95.aClass3_Sub6_Sub1_3.method1634(local12);
			Static42.anInt1190 = 0;
			Static109.anInt2868 = local16;
			Static35.anInt1005 = 2;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
			Static43.anInt1217 = local12;
		}
		if (local20 == 55) {
			Static2.method113(local30, local12, local16);
			Static95.aClass3_Sub6_Sub1_3.method1645(47);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static52.anInt1378 + local16);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30 >> 14 & 0x7FFF);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static109.anInt2875 + local12);
		}
		if (local20 == 46) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static37.anInt1040 = 0;
				Static5.anInt352 = 2;
				Static31.anInt1151 = Static45.anInt1269;
				Static67.anInt1779 = Static99.anInt2491;
				Static95.aClass3_Sub6_Sub1_3.method1645(87);
				Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			}
		}
		if (local20 == 13) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static67.anInt1779 = Static99.anInt2491;
				Static37.anInt1040 = 0;
				Static31.anInt1151 = Static45.anInt1269;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(89);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (local20 == 56) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static31.anInt1151 = Static45.anInt1269;
				Static67.anInt1779 = Static99.anInt2491;
				Static37.anInt1040 = 0;
				Static5.anInt352 = 2;
				Static95.aClass3_Sub6_Sub1_3.method1645(101);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (local20 == 20) {
			@Pc(2532) boolean local2532 = true;
			local529 = Static58.method1009(local16);
			if (local529.anInt2646 > 0) {
				local2532 = Static81.method1298(local529);
			}
			if (local2532) {
				Static95.aClass3_Sub6_Sub1_3.method1645(54);
				Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			}
		}
		if (local20 == 57) {
			Static2.method113(local30, local12, local16);
			Static95.aClass3_Sub6_Sub1_3.method1645(245);
			Static95.aClass3_Sub6_Sub1_3.method1634(local12 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1634(local30 >> 14 & 0x7FFF);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static52.anInt1378 + local16);
		}
		if (local20 == 41) {
			Static95.aClass3_Sub6_Sub1_3.method1645(54);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			local529 = Static58.method1009(local16);
			if (local529.anIntArrayArray20 != null && local529.anIntArrayArray20[0][0] == 5) {
				local297 = local529.anIntArrayArray20[0][1];
				if (Static110.anIntArray373[local297] != local529.anIntArray304[0]) {
					Static110.anIntArray373[local297] = local529.anIntArray304[0];
					Static60.method1961(local297);
					Static116.aBoolean157 = true;
				}
			}
		}
		if (local20 == 1003) {
			Static31.anInt1151 = Static45.anInt1269;
			Static67.anInt1779 = Static99.anInt2491;
			Static5.anInt352 = 2;
			Static37.anInt1040 = 0;
			Static95.aClass3_Sub6_Sub1_3.method1645(219);
			Static95.aClass3_Sub6_Sub1_3.method1635(local30);
		}
		if (local20 == 17) {
			local614 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local30];
			if (local614 != null) {
				Static37.method696(0, local614.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local614.anIntArray181[0]);
				Static31.anInt1151 = Static45.anInt1269;
				Static67.anInt1779 = Static99.anInt2491;
				Static5.anInt352 = 2;
				Static37.anInt1040 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1645(224);
				Static95.aClass3_Sub6_Sub1_3.method1634(local30);
			}
		}
		if (local20 == 22) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static5.anInt352 = 2;
				Static31.anInt1151 = Static45.anInt1269;
				Static67.anInt1779 = Static99.anInt2491;
				Static37.anInt1040 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1645(169);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (local20 == 30) {
			Static95.aClass3_Sub6_Sub1_3.method1645(113);
			Static95.aClass3_Sub6_Sub1_3.method1630(local16);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
			Static109.anInt2868 = local16;
			Static43.anInt1217 = local12;
			Static42.anInt1190 = 0;
			Static35.anInt1005 = 2;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 23) {
			Static68.method992();
			Static14.anInt2886 = 1;
			Static105.anInt2694 = local30;
			Static32.anInt920 = local12;
			Static116.aBoolean157 = true;
			Static85.anInt2106 = local16;
			Static85.aClass5_967 = Static75.method1261(new Class5[] { Static95.aClass5_1120, Static37.method694(local30).aClass5_300, Static36.aClass5_1258 });
			if (Static85.aClass5_967 == null) {
				Static85.aClass5_967 = Static54.aClass5_704;
			}
			return;
		}
		if (local20 == 3) {
			local224 = Static37.method696(0, local16, 0, 2, 0, 0, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			if (!local224) {
				Static37.method696(0, local16, 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local12);
			}
			Static37.anInt1040 = 0;
			Static5.anInt352 = 2;
			Static31.anInt1151 = Static45.anInt1269;
			Static67.anInt1779 = Static99.anInt2491;
			Static95.aClass3_Sub6_Sub1_3.method1645(136);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static95.aClass3_Sub6_Sub1_3.method1634(local16 + Static52.anInt1378);
		}
		if (local20 == 29) {
			Static93.method1557();
		}
		if (local20 == 39) {
			Static95.aClass3_Sub6_Sub1_3.method1645(145);
			Static95.aClass3_Sub6_Sub1_3.method1611(Static62.anInt1671);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static47.anInt1309);
			Static95.aClass3_Sub6_Sub1_3.method1599(local12);
		}
		if (local20 == 9) {
			local292 = Static49.aClass5Array9[arg0];
			local297 = local292.method154(Static36.aClass5_1258);
			if (local297 != -1) {
				if (Static89.anInt2288 == -1) {
					Static93.method1557();
					if (Static81.anInt2006 != -1) {
						Static110.aClass5_1306 = local292.method159(local297 + 5).method143();
						Static103.aBoolean140 = false;
						Static37.anInt1012 = Static89.anInt2288 = Static81.anInt2006;
					}
				} else {
					Static64.method1084(Static110.aClass5_1307, Static47.aClass5_631, 0);
				}
			}
		}
		if (local20 == 54) {
			Static95.aClass3_Sub6_Sub1_3.method1645(48);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12);
			Static95.aClass3_Sub6_Sub1_3.method1622(local16);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30);
			Static35.anInt1005 = 2;
			Static109.anInt2868 = local16;
			Static43.anInt1217 = local12;
			if (Static89.anInt2288 == local16 >> 16) {
				Static35.anInt1005 = 1;
			}
			if (Static88.anInt2255 == local16 >> 16) {
				Static35.anInt1005 = 3;
			}
			Static42.anInt1190 = 0;
		}
		if (local20 == 1006) {
			Static67.anInt1779 = Static99.anInt2491;
			Static31.anInt1151 = Static45.anInt1269;
			Static5.anInt352 = 2;
			Static37.anInt1040 = 0;
			Static95.aClass3_Sub6_Sub1_3.method1645(36);
			Static95.aClass3_Sub6_Sub1_3.method1589(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 5) {
			Static95.aClass3_Sub6_Sub1_3.method1645(243);
			Static95.aClass3_Sub6_Sub1_3.method1611(local16);
			Static95.aClass3_Sub6_Sub1_3.method1635(local12);
			Static95.aClass3_Sub6_Sub1_3.method1630(Static62.anInt1671);
			Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static47.anInt1309);
			Static43.anInt1217 = local12;
			Static35.anInt1005 = 2;
			Static109.anInt2868 = local16;
			if (local16 >> 16 == Static89.anInt2288) {
				Static35.anInt1005 = 1;
			}
			Static42.anInt1190 = 0;
			if (local16 >> 16 == Static88.anInt2255) {
				Static35.anInt1005 = 3;
			}
		}
		if (local20 == 52) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static5.anInt352 = 2;
				Static67.anInt1779 = Static99.anInt2491;
				Static31.anInt1151 = Static45.anInt1269;
				Static37.anInt1040 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1645(229);
				Static95.aClass3_Sub6_Sub1_3.method1635(local30);
			}
		}
		if (local20 == 44) {
			local1177 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30];
			if (local1177 != null) {
				Static37.method696(0, local1177.anIntArray177[0], 0, 2, 1, 1, false, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1177.anIntArray181[0]);
				Static31.anInt1151 = Static45.anInt1269;
				Static5.anInt352 = 2;
				Static37.anInt1040 = 0;
				Static67.anInt1779 = Static99.anInt2491;
				Static95.aClass3_Sub6_Sub1_3.method1645(11);
				Static95.aClass3_Sub6_Sub1_3.method1599(local30);
			}
		}
		if (Static14.anInt2886 != 0) {
			Static116.aBoolean157 = true;
			Static14.anInt2886 = 0;
		}
		if (Static100.aBoolean124) {
			Static68.method992();
			Static116.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZI)I")
	public static int method652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	public static void method653() {
		aClass3_Sub2_1 = null;
		aClass5_431 = null;
		aClass5_435 = null;
		aClass5_436 = null;
		aClass5_430 = null;
		aClass5_432 = null;
		anIntArray119 = null;
		aClass5_429 = null;
		anIntArrayArray8 = null;
		aClass5_433 = null;
		aClass5_428 = null;
		aClass5_434 = null;
	}
}
