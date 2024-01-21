import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!pc;")
	public static Class12 aClass12_51;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!td;")
	public static Class54 aClass54_24;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!hb;")
	public static Class27 aClass27_843 = Static87.method1648("Icons redrawn");

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!hb;")
	public static Class27 aClass27_844 = Static87.method1648("Untersuchen");

	@OriginalMember(owner = "client!n", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_845 = Static87.method1648("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_846 = Static87.method1648("Okay");

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!hb;")
	public static Class27 aClass27_847 = Static87.method1648("0(U");

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_848 = aClass27_845;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "Lclient!hb;")
	public static Class27 aClass27_849 = Static87.method1648(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!n", name = "N", descriptor = "I")
	public static int anInt1735 = 0;

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_850 = Static87.method1648("@cya@");

	@OriginalMember(owner = "client!n", name = "R", descriptor = "Lclient!hb;")
	public static Class27 aClass27_851 = Static87.method1648("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	public static void method1235() {
		for (@Pc(3) int local3 = 0; local3 < Static70.anInt1829; local3++) {
			@Pc(9) int local9 = Static82.anIntArray335[local3];
			@Pc(13) Class3_Sub3_Sub1_Sub4_Sub1 local13 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local9];
			@Pc(17) int local17 = Static47.aClass3_Sub11_Sub1_1.method1421();
			if ((local17 & 0x40) != 0) {
				local13.anInt2428 = Static47.aClass3_Sub11_Sub1_1.method1441();
				local13.anInt2406 = Static47.aClass3_Sub11_Sub1_1.method1451();
			}
			if ((local17 & 0x10) != 0) {
				local13.aClass3_Sub3_Sub3_1 = Static99.method1802(Static47.aClass3_Sub11_Sub1_1.method1451());
				local13.anInt2401 = local13.aClass3_Sub3_Sub3_1.anInt934;
				local13.anInt2386 = local13.aClass3_Sub3_Sub3_1.anInt925;
				local13.anInt2375 = local13.aClass3_Sub3_Sub3_1.anInt940;
				local13.anInt2398 = local13.aClass3_Sub3_Sub3_1.anInt932;
				local13.anInt2435 = local13.aClass3_Sub3_Sub3_1.anInt920;
				local13.anInt2411 = local13.aClass3_Sub3_Sub3_1.anInt921;
				local13.anInt2410 = local13.aClass3_Sub3_Sub3_1.anInt919;
				local13.anInt2431 = local13.aClass3_Sub3_Sub3_1.anInt906;
				local13.anInt2412 = local13.aClass3_Sub3_Sub3_1.anInt918;
			}
			@Pc(98) int local98;
			@Pc(102) int local102;
			if ((local17 & 0x2) != 0) {
				local98 = Static47.aClass3_Sub11_Sub1_1.method1470();
				local102 = Static47.aClass3_Sub11_Sub1_1.method1445();
				local13.method1678(local102, Static2.anInt38, local98);
				local13.anInt2380 = Static2.anInt38 + 300;
				local13.anInt2413 = Static47.aClass3_Sub11_Sub1_1.method1470();
				local13.anInt2396 = Static47.aClass3_Sub11_Sub1_1.method1421();
			}
			if ((local17 & 0x80) != 0) {
				local13.aClass27_1138 = Static47.aClass3_Sub11_Sub1_1.method1426();
				local13.anInt2400 = 100;
			}
			if ((local17 & 0x8) != 0) {
				local98 = Static47.aClass3_Sub11_Sub1_1.method1441();
				if (local98 == 65535) {
					local98 = -1;
				}
				local102 = Static47.aClass3_Sub11_Sub1_1.method1445();
				if (local98 == local13.anInt2430 && local98 != -1) {
					@Pc(222) int local222 = Static16.method298(local98).anInt2620;
					if (local222 == 1) {
						local13.anInt2388 = local102;
						local13.anInt2397 = 0;
						local13.anInt2414 = 0;
						local13.anInt2425 = 0;
					}
					if (local222 == 2) {
						local13.anInt2414 = 0;
					}
				} else if (local98 == -1 || local13.anInt2430 == -1 || Static16.method298(local98).anInt2621 >= Static16.method298(local13.anInt2430).anInt2621) {
					local13.anInt2397 = 0;
					local13.anInt2425 = 0;
					local13.anInt2430 = local98;
					local13.anInt2414 = 0;
					local13.anInt2420 = local13.anInt2405;
					local13.anInt2388 = local102;
				}
			}
			if ((local17 & 0x1) != 0) {
				local98 = Static47.aClass3_Sub11_Sub1_1.method1470();
				local102 = Static47.aClass3_Sub11_Sub1_1.method1445();
				local13.method1678(local102, Static2.anInt38, local98);
				local13.anInt2380 = Static2.anInt38 + 300;
				local13.anInt2413 = Static47.aClass3_Sub11_Sub1_1.method1422();
				local13.anInt2396 = Static47.aClass3_Sub11_Sub1_1.method1445();
			}
			if ((local17 & 0x20) != 0) {
				local13.anInt2403 = Static47.aClass3_Sub11_Sub1_1.method1419();
				if (local13.anInt2403 == 65535) {
					local13.anInt2403 = -1;
				}
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt2385 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local98 = Static47.aClass3_Sub11_Sub1_1.method1423();
				local13.anInt2392 = local98 >> 16;
				local13.anInt2389 = 0;
				if (local13.anInt2385 == 65535) {
					local13.anInt2385 = -1;
				}
				local13.anInt2391 = Static2.anInt38 + (local98 & 0xFFFF);
				local13.anInt2404 = 0;
				if (Static2.anInt38 < local13.anInt2391) {
					local13.anInt2404 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1236() {
		aClass27_847 = null;
		aClass27_846 = null;
		aClass27_848 = null;
		aClass12_51 = null;
		aClass54_24 = null;
		aClass27_845 = null;
		aClass27_843 = null;
		aClass27_851 = null;
		aClass27_849 = null;
		aClass3_Sub3_Sub2_Sub2Array10 = null;
		aClass27_844 = null;
		aClass27_850 = null;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	public static void method1237() {
		for (@Pc(14) Class3_Sub13 local14 = (Class3_Sub13) Static82.aClass28_10.method884(); local14 != null; local14 = (Class3_Sub13) Static82.aClass28_10.method875()) {
			if (local14.anInt2707 == -1) {
				local14.anInt2706 = 0;
				Static59.method1105(local14);
			} else {
				local14.method1883();
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1238(@OriginalArg(1) Component arg0) {
		try {
			@Pc(5) Method local5 = Static49.aMethod1;
			if (local5 != null) {
				local5.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(19) Throwable local19) {
		}
		arg0.addKeyListener(Static15.aClass53_1);
		arg0.addFocusListener(Static15.aClass53_1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V")
	public static void method1239(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static32.anIntArray151[arg0];
		@Pc(16) int local16 = Static53.anIntArray234[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		@Pc(24) int local24 = Static101.anIntArray390[arg0];
		@Pc(28) int local28 = Static82.anIntArray336[arg0];
		if (Static68.anInt1744 != 0 && local16 != 1005) {
			Static68.anInt1744 = 0;
			Static13.aBoolean40 = true;
		}
		@Pc(69) boolean local69;
		if (local16 == 54) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static52.anInt1416 = Static35.anInt850;
			Static30.anInt779 = Static50.anInt1341;
			Static94.anInt2554 = 0;
			Static61.anInt1552 = 2;
			Static78.aClass3_Sub11_Sub1_3.method1478(224);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24 + Static89.anInt2464);
		}
		if (local16 == 9) {
			Static78.aClass3_Sub11_Sub1_3.method1478(25);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static102.anInt2656);
			Static78.aClass3_Sub11_Sub1_3.method1433(Static82.anInt2210);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static80.anInt2189);
			Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24);
			Static87.anInt2334 = 2;
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			Static103.anInt2670 = 0;
			if (Static104.anInt2723 == local12 >> 16) {
				Static87.anInt2334 = 1;
			}
			if (local12 >> 16 == Static84.anInt2220) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 18) {
			Static97.method1607(Static64.anInt1661);
			Static64.anInt1661 = -1;
			Static13.aBoolean40 = true;
		}
		@Pc(201) Class3_Sub3_Sub1_Sub4_Sub2 local201;
		if (local16 == 37) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static30.anInt779 = Static50.anInt1341;
				Static61.anInt1552 = 2;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(99);
				Static78.aClass3_Sub11_Sub1_3.method1461(local28);
				Static78.aClass3_Sub11_Sub1_3.method1425(Static30.anInt778);
			}
		}
		if (local16 == 1001) {
			Static50.method982(local28, local12, local24);
			Static78.aClass3_Sub11_Sub1_3.method1478(40);
			Static78.aClass3_Sub11_Sub1_3.method1467(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static89.anInt2464 + local24);
		}
		if (local16 == 35) {
			Static78.aClass3_Sub11_Sub1_3.method1478(218);
			Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24);
			Static103.anInt2670 = 0;
			Static108.anInt2778 = local12;
			Static87.anInt2334 = 2;
			anInt1735 = local24;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		@Pc(350) Class3_Sub3_Sub1_Sub4_Sub1 local350;
		if (local16 == 19) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static30.anInt779 = Static50.anInt1341;
				Static52.anInt1416 = Static35.anInt850;
				Static94.anInt2554 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1478(232);
				Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			}
		}
		@Pc(405) Class3_Sub3_Sub6 local405;
		if (local16 == 1004) {
			local405 = Static77.method1516(local12);
			if (local405 == null || local405.anIntArray275[local24] < 100000) {
				Static78.aClass3_Sub11_Sub1_3.method1478(0);
				Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			} else {
				Static43.method901(Static98.method1779(new Class27[] { Static97.method1616(local405.anIntArray275[local24]), Static108.aClass27_1349, Static37.method696(local28).aClass27_869 }), Static45.aClass27_182, 0);
			}
			Static103.anInt2670 = 0;
			Static108.anInt2778 = local12;
			anInt1735 = local24;
			Static87.anInt2334 = 2;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 16) {
			Static102.anInt2656 = local24;
			Static42.anInt1235 = 1;
			Static82.anInt2210 = local12;
			Static80.anInt2189 = local28;
			Static81.aClass27_1046 = Static98.method1779(new Class27[] { Static101.aClass27_1272, Static37.method696(local28).aClass27_869, Static22.aClass27_296 });
			Static75.aBoolean101 = true;
			if (Static81.aClass27_1046 == null) {
				Static81.aClass27_1046 = Static43.aClass27_604;
			}
			Static39.anInt964 = 0;
			return;
		}
		if (local16 == 26) {
			if (Static12.aBoolean16) {
				Static76.aClass18_1.method536(local24 - 4, local12 + -4);
			} else {
				Static76.aClass18_1.method536(Static50.anInt1341 - 4, Static35.anInt850 + -4);
			}
		}
		if (local16 == 21) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static61.anInt1552 = 2;
			Static52.anInt1416 = Static35.anInt850;
			Static30.anInt779 = Static50.anInt1341;
			Static94.anInt2554 = 0;
			Static78.aClass3_Sub11_Sub1_3.method1478(138);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static101.anInt2631 + local12);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1461(local24 + Static89.anInt2464);
		}
		@Pc(646) int local646;
		@Pc(660) long local660;
		@Pc(641) Class27 local641;
		if (local16 == 6 || local16 == 49 || local16 == 10 || local16 == 20) {
			local641 = Static55.aClass27Array9[arg0];
			local646 = local641.method739(Static22.aClass27_296);
			if (local646 != -1) {
				local660 = local641.method731(local646 + 5).method735().method758();
				if (local16 == 6) {
					Static85.method1631(local660);
				}
				if (local16 == 49) {
					Static68.method1245(local660);
				}
				if (local16 == 10) {
					Static20.method342(local660);
				}
				if (local16 == 20) {
					Static4.method1893(local660);
				}
			}
		}
		if (local16 == 40 && Static50.method982(local28, local12, local24)) {
			Static78.aClass3_Sub11_Sub1_3.method1478(37);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28 >> 14 & 0x7FFF);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static101.anInt2631 + local12);
			Static78.aClass3_Sub11_Sub1_3.method1437(Static30.anInt778);
			Static78.aClass3_Sub11_Sub1_3.method1461(local24 + Static89.anInt2464);
		}
		if (local16 == 1006) {
			Static94.anInt2554 = 0;
			Static61.anInt1552 = 2;
			Static52.anInt1416 = Static35.anInt850;
			Static30.anInt779 = Static50.anInt1341;
			Static78.aClass3_Sub11_Sub1_3.method1478(0);
			Static78.aClass3_Sub11_Sub1_3.method1471(local28);
		}
		if (local16 == 8) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static30.anInt779 = Static50.anInt1341;
				Static52.anInt1416 = Static35.anInt850;
				Static94.anInt2554 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1478(140);
				Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			}
		}
		if (local16 == 12) {
			Static78.aClass3_Sub11_Sub1_3.method1478(105);
			Static78.aClass3_Sub11_Sub1_3.method1467(local24);
			Static78.aClass3_Sub11_Sub1_3.method1440(local12);
			Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			Static87.anInt2334 = 2;
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (local12 >> 16 == Static84.anInt2220) {
				Static87.anInt2334 = 3;
			}
			Static103.anInt2670 = 0;
		}
		if (local16 == 30) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
				Static30.anInt779 = Static50.anInt1341;
				Static78.aClass3_Sub11_Sub1_3.method1478(204);
				Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			}
		}
		if (local16 == 48) {
			Static50.method982(local28, local12, local24);
			Static78.aClass3_Sub11_Sub1_3.method1478(84);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static101.anInt2631 + local12);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24 + Static89.anInt2464);
			Static78.aClass3_Sub11_Sub1_3.method1471(local28 >> 14 & 0x7FFF);
		}
		if (local16 == 4) {
			Static50.method982(local28, local12, local24);
			Static78.aClass3_Sub11_Sub1_3.method1478(113);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24 + Static89.anInt2464);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28 >> 14 & 0x7FFF);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static101.anInt2631 + local12);
		}
		if (local16 == 39 && Static50.method982(local28, local12, local24)) {
			Static78.aClass3_Sub11_Sub1_3.method1478(128);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static89.anInt2464 + local24);
			Static78.aClass3_Sub11_Sub1_3.method1440(Static82.anInt2210);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static80.anInt2189);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static102.anInt2656);
			Static78.aClass3_Sub11_Sub1_3.method1467(local12 + Static101.anInt2631);
		}
		if (local16 == 27) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static30.anInt779 = Static50.anInt1341;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
				Static61.anInt1552 = 2;
				Static78.aClass3_Sub11_Sub1_3.method1478(92);
				Static78.aClass3_Sub11_Sub1_3.method1461(Static102.anInt2656);
				Static78.aClass3_Sub11_Sub1_3.method1433(Static82.anInt2210);
				Static78.aClass3_Sub11_Sub1_3.method1461(local28);
				Static78.aClass3_Sub11_Sub1_3.method1467(Static80.anInt2189);
			}
		}
		if (local16 == 13) {
			Static50.method982(local28, local12, local24);
			Static78.aClass3_Sub11_Sub1_3.method1478(132);
			Static78.aClass3_Sub11_Sub1_3.method1467(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28 >> 14 & 0x7FFF);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static89.anInt2464 + local24);
		}
		if (local16 == 32) {
			local641 = Static55.aClass27Array9[arg0];
			local646 = local641.method739(Static22.aClass27_296);
			if (local646 != -1) {
				if (Static104.anInt2723 == -1) {
					Static73.method1340();
					if (Static4.anInt2754 != -1) {
						Static45.aClass27_178 = local641.method731(local646 + 5).method735();
						Static108.anInt2774 = Static104.anInt2723 = Static4.anInt2754;
						Static13.aBoolean41 = false;
					}
				} else {
					Static43.method901(Static106.aClass27_416, Static45.aClass27_182, 0);
				}
			}
		}
		if (local16 == 5) {
			Static78.aClass3_Sub11_Sub1_3.method1478(129);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24);
			Static78.aClass3_Sub11_Sub1_3.method1433(local12);
			anInt1735 = local24;
			Static103.anInt2670 = 0;
			Static108.anInt2778 = local12;
			Static87.anInt2334 = 2;
			if (Static104.anInt2723 == local12 >> 16) {
				Static87.anInt2334 = 1;
			}
			if (local12 >> 16 == Static84.anInt2220) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 41) {
			Static78.aClass3_Sub11_Sub1_3.method1478(131);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24);
			Static78.aClass3_Sub11_Sub1_3.method1437(local12);
			Static103.anInt2670 = 0;
			Static87.anInt2334 = 2;
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			if (Static104.anInt2723 == local12 >> 16) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 17) {
			Static73.method1340();
		}
		if (local16 == 28 && Static109.anInt2025 == -1) {
			Static78.aClass3_Sub11_Sub1_3.method1478(251);
			Static78.aClass3_Sub11_Sub1_3.method1433(local12);
			Static109.anInt2025 = local12;
		}
		if (local16 == 36) {
			Static78.aClass3_Sub11_Sub1_3.method1478(54);
			Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24);
			Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			Static103.anInt2670 = 0;
			Static87.anInt2334 = 2;
			Static108.anInt2778 = local12;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			anInt1735 = local24;
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 2) {
			Static78.aClass3_Sub11_Sub1_3.method1478(236);
			Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24);
			Static78.aClass3_Sub11_Sub1_3.method1440(local12);
			anInt1735 = local24;
			Static87.anInt2334 = 2;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (local12 >> 16 == Static84.anInt2220) {
				Static87.anInt2334 = 3;
			}
			Static103.anInt2670 = 0;
			Static108.anInt2778 = local12;
		}
		if (local16 == 7) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static94.anInt2554 = 0;
				Static61.anInt1552 = 2;
				Static52.anInt1416 = Static35.anInt850;
				Static30.anInt779 = Static50.anInt1341;
				Static78.aClass3_Sub11_Sub1_3.method1478(83);
				Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			}
		}
		if (local16 == 15) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static52.anInt1416 = Static35.anInt850;
				Static61.anInt1552 = 2;
				Static94.anInt2554 = 0;
				Static30.anInt779 = Static50.anInt1341;
				Static78.aClass3_Sub11_Sub1_3.method1478(215);
				Static78.aClass3_Sub11_Sub1_3.method1448(local28);
				Static78.aClass3_Sub11_Sub1_3.method1440(Static30.anInt778);
			}
		}
		@Pc(1591) int local1591;
		if (local16 == 42) {
			local641 = Static55.aClass27Array9[arg0];
			local646 = local641.method739(Static22.aClass27_296);
			if (local646 != -1) {
				local660 = local641.method731(local646 + 5).method735().method758();
				local1591 = -1;
				for (@Pc(1593) int local1593 = 0; local1593 < Static43.anInt1241; local1593++) {
					if (local660 == Static53.aLongArray8[local1593]) {
						local1591 = local1593;
						break;
					}
				}
				if (local1591 != -1 && Static22.anIntArray116[local1591] > 0) {
					Static97.aBoolean112 = true;
					Static7.anInt175 = 3;
					Static45.aClass27_175 = Static45.aClass27_182;
					Static68.anInt1744 = 0;
					Static13.aBoolean40 = true;
					Static24.aLong26 = Static53.aLongArray8[local1591];
					Static45.aClass27_173 = Static98.method1779(new Class27[] { Static64.aClass27_806, Static46.aClass27Array5[local1591] });
				}
			}
		}
		if (local16 == 50) {
			Static78.aClass3_Sub11_Sub1_3.method1478(196);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			Static78.aClass3_Sub11_Sub1_3.method1467(local24);
			Static78.aClass3_Sub11_Sub1_3.method1433(local12);
			Static87.anInt2334 = 2;
			Static103.anInt2670 = 0;
			anInt1735 = local24;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			Static108.anInt2778 = local12;
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 1003) {
			Static52.anInt1416 = Static35.anInt850;
			Static94.anInt2554 = 0;
			Static61.anInt1552 = 2;
			Static30.anInt779 = Static50.anInt1341;
			Static78.aClass3_Sub11_Sub1_3.method1478(187);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28 >> 14 & 0x7FFF);
		}
		if (local16 == 11) {
			Static50.method982(local28, local12, local24);
			Static78.aClass3_Sub11_Sub1_3.method1478(234);
			Static78.aClass3_Sub11_Sub1_3.method1461(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1461(local24 + Static89.anInt2464);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28 >> 14 & 0x7FFF);
		}
		if (local16 == 14) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static61.anInt1552 = 2;
			Static52.anInt1416 = Static35.anInt850;
			Static94.anInt2554 = 0;
			Static30.anInt779 = Static50.anInt1341;
			Static78.aClass3_Sub11_Sub1_3.method1478(222);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(Static101.anInt2631 + local12);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static89.anInt2464 + local24);
		}
		if (local16 == 1) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static61.anInt1552 = 2;
			Static52.anInt1416 = Static35.anInt850;
			Static94.anInt2554 = 0;
			Static30.anInt779 = Static50.anInt1341;
			Static78.aClass3_Sub11_Sub1_3.method1478(56);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28);
			Static78.aClass3_Sub11_Sub1_3.method1467(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static102.anInt2656);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static80.anInt2189);
			Static78.aClass3_Sub11_Sub1_3.method1471(Static89.anInt2464 + local24);
			Static78.aClass3_Sub11_Sub1_3.method1433(Static82.anInt2210);
		}
		if (local16 == 55) {
			Static78.aClass3_Sub11_Sub1_3.method1478(49);
			Static78.aClass3_Sub11_Sub1_3.method1440(Static30.anInt778);
			Static78.aClass3_Sub11_Sub1_3.method1433(local12);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24);
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			Static87.anInt2334 = 2;
			Static103.anInt2670 = 0;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (local12 >> 16 == Static84.anInt2220) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 53) {
			Static78.aClass3_Sub11_Sub1_3.method1478(104);
			Static78.aClass3_Sub11_Sub1_3.method1440(local12);
			Static78.aClass3_Sub11_Sub1_3.method1461(local24);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			Static103.anInt2670 = 0;
			Static87.anInt2334 = 2;
			if (local12 >> 16 == Static104.anInt2723) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (local16 == 22) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static30.anInt779 = Static50.anInt1341;
				Static52.anInt1416 = Static35.anInt850;
				Static94.anInt2554 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1478(210);
				Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			}
		}
		if (local16 == 52) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static30.anInt779 = Static50.anInt1341;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(225);
				Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			}
		}
		if (local16 == 47) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static52.anInt1416 = Static35.anInt850;
				Static61.anInt1552 = 2;
				Static94.anInt2554 = 0;
				Static30.anInt779 = Static50.anInt1341;
				Static78.aClass3_Sub11_Sub1_3.method1478(247);
				Static78.aClass3_Sub11_Sub1_3.method1467(local28);
			}
		}
		if (local16 == 24) {
			Static78.aClass3_Sub11_Sub1_3.method1478(180);
			Static78.aClass3_Sub11_Sub1_3.method1437(local12);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24);
			Static78.aClass3_Sub11_Sub1_3.method1467(local28);
			anInt1735 = local24;
			Static87.anInt2334 = 2;
			if (Static104.anInt2723 == local12 >> 16) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
			Static108.anInt2778 = local12;
			Static103.anInt2670 = 0;
		}
		if (local16 == 23) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static94.anInt2554 = 0;
			Static30.anInt779 = Static50.anInt1341;
			Static61.anInt1552 = 2;
			Static52.anInt1416 = Static35.anInt850;
			Static78.aClass3_Sub11_Sub1_3.method1478(86);
			Static78.aClass3_Sub11_Sub1_3.method1461(local12 + Static101.anInt2631);
			Static78.aClass3_Sub11_Sub1_3.method1425(Static30.anInt778);
			Static78.aClass3_Sub11_Sub1_3.method1448(Static89.anInt2464 + local24);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
		}
		if (local16 == 34) {
			local405 = Static77.method1516(local12);
			Static68.anInt1748 = local405.anInt1591;
			Static30.anInt778 = local12;
			Static10.aClass27_130 = local405.aClass27_781;
			Static39.anInt964 = 1;
			Static75.aBoolean101 = true;
			Static42.anInt1235 = 0;
			Static16.aClass27_189 = Static98.method1779(new Class27[] { Static92.aClass27_1211, local405.aClass27_786, Static22.aClass27_296 });
			if (Static68.anInt1748 == 16) {
				Static86.aBoolean116 = true;
				Static75.aBoolean101 = true;
				Static34.anInt825 = 3;
			}
			return;
		}
		if (local16 == 56 || local16 == 38) {
			local641 = Static55.aClass27Array9[arg0];
			local646 = local641.method739(Static22.aClass27_296);
			if (local646 != -1) {
				local641 = local641.method731(local646 + 5).method735();
				@Pc(2442) Class27 local2442 = local641.method743().method746();
				@Pc(2444) boolean local2444 = false;
				for (local1591 = 0; local1591 < Static104.anInt2718; local1591++) {
					@Pc(2454) Class3_Sub3_Sub1_Sub4_Sub2 local2454 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local1591]];
					if (local2454 != null && local2454.aClass27_1150 != null && local2454.aClass27_1150.method763(local2442)) {
						Static15.method251(false, 1, 2, local2454.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local2454.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
						local2444 = true;
						if (local16 == 56) {
							Static78.aClass3_Sub11_Sub1_3.method1478(140);
							Static78.aClass3_Sub11_Sub1_3.method1461(Static99.anIntArray387[local1591]);
						}
						if (local16 == 38) {
							Static78.aClass3_Sub11_Sub1_3.method1478(204);
							Static78.aClass3_Sub11_Sub1_3.method1471(Static99.anIntArray387[local1591]);
						}
						break;
					}
				}
				if (!local2444) {
					Static43.method901(Static98.method1779(new Class27[] { Static46.aClass27_610, local2442 }), Static45.aClass27_182, 0);
				}
			}
		}
		if (local16 == 3) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static30.anInt779 = Static50.anInt1341;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(71);
				Static78.aClass3_Sub11_Sub1_3.method1467(Static102.anInt2656);
				Static78.aClass3_Sub11_Sub1_3.method1461(Static80.anInt2189);
				Static78.aClass3_Sub11_Sub1_3.method1448(local28);
				Static78.aClass3_Sub11_Sub1_3.method1425(Static82.anInt2210);
			}
		}
		if (local16 == 43) {
			Static78.aClass3_Sub11_Sub1_3.method1478(241);
			Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			local405 = Static77.method1516(local12);
			if (local405.anIntArrayArray46 != null && local405.anIntArrayArray46[0][0] == 5) {
				local646 = local405.anIntArrayArray46[0][1];
				if (Static18.anIntArray60[local646] != local405.anIntArray272[0]) {
					Static18.anIntArray60[local646] = local405.anIntArray272[0];
					Static59.method1109(local646);
					Static75.aBoolean101 = true;
				}
			}
		}
		if (local16 == 33) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static30.anInt779 = Static50.anInt1341;
				Static94.anInt2554 = 0;
				Static61.anInt1552 = 2;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(5);
				Static78.aClass3_Sub11_Sub1_3.method1467(local28);
			}
		}
		if (local16 == 29) {
			Static78.aClass3_Sub11_Sub1_3.method1478(241);
			Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			local405 = Static77.method1516(local12);
			if (local405.anIntArrayArray46 != null && local405.anIntArrayArray46[0][0] == 5) {
				local646 = local405.anIntArrayArray46[0][1];
				Static18.anIntArray60[local646] = 1 - Static18.anIntArray60[local646];
				Static59.method1109(local646);
				Static75.aBoolean101 = true;
			}
		}
		if (local16 == 46) {
			local405 = Static77.method1516(local12);
			@Pc(2816) boolean local2816 = true;
			if (local405.anInt1601 > 0) {
				local2816 = Static32.method665(local405);
			}
			if (local2816) {
				Static78.aClass3_Sub11_Sub1_3.method1478(241);
				Static78.aClass3_Sub11_Sub1_3.method1425(local12);
			}
		}
		if (local16 == 1002) {
			Static52.anInt1416 = Static35.anInt850;
			Static61.anInt1552 = 2;
			Static94.anInt2554 = 0;
			Static30.anInt779 = Static50.anInt1341;
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				@Pc(2857) Class3_Sub3_Sub3 local2857 = local350.aClass3_Sub3_Sub3_1;
				if (local2857.anIntArray166 != null) {
					local2857 = local2857.method720();
				}
				if (local2857 != null) {
					Static78.aClass3_Sub11_Sub1_3.method1478(179);
					Static78.aClass3_Sub11_Sub1_3.method1467(local2857.anInt914);
				}
			}
		}
		if (local16 == 45) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static52.anInt1416 = Static35.anInt850;
			Static61.anInt1552 = 2;
			Static94.anInt2554 = 0;
			Static30.anInt779 = Static50.anInt1341;
			Static78.aClass3_Sub11_Sub1_3.method1478(79);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1448(local24 + Static89.anInt2464);
			Static78.aClass3_Sub11_Sub1_3.method1448(Static101.anInt2631 + local12);
		}
		if (local16 == 25) {
			local350 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local28];
			if (local350 != null) {
				Static15.method251(false, 1, 2, local350.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local350.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static30.anInt779 = Static50.anInt1341;
				Static94.anInt2554 = 0;
				Static61.anInt1552 = 2;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(58);
				Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			}
		}
		if (local16 == 51) {
			local201 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
			if (local201 != null) {
				Static15.method251(false, 1, 2, local201.anIntArray357[0], 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local201.anIntArray359[0], 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
				Static61.anInt1552 = 2;
				Static94.anInt2554 = 0;
				Static30.anInt779 = Static50.anInt1341;
				Static52.anInt1416 = Static35.anInt850;
				Static78.aClass3_Sub11_Sub1_3.method1478(173);
				Static78.aClass3_Sub11_Sub1_3.method1471(local28);
			}
		}
		if (local16 == 44) {
			local69 = Static15.method251(false, 0, 2, local12, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			if (!local69) {
				Static15.method251(false, 1, 2, local12, 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local24, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			}
			Static30.anInt779 = Static50.anInt1341;
			Static94.anInt2554 = 0;
			Static52.anInt1416 = Static35.anInt850;
			Static61.anInt1552 = 2;
			Static78.aClass3_Sub11_Sub1_3.method1478(67);
			Static78.aClass3_Sub11_Sub1_3.method1448(local28);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static89.anInt2464 + local24);
			Static78.aClass3_Sub11_Sub1_3.method1467(Static101.anInt2631 + local12);
		}
		if (local16 == 31) {
			Static78.aClass3_Sub11_Sub1_3.method1478(201);
			Static78.aClass3_Sub11_Sub1_3.method1440(local12);
			Static78.aClass3_Sub11_Sub1_3.method1461(local28);
			Static78.aClass3_Sub11_Sub1_3.method1471(local24);
			Static103.anInt2670 = 0;
			anInt1735 = local24;
			Static108.anInt2778 = local12;
			Static87.anInt2334 = 2;
			if (Static104.anInt2723 == local12 >> 16) {
				Static87.anInt2334 = 1;
			}
			if (Static84.anInt2220 == local12 >> 16) {
				Static87.anInt2334 = 3;
			}
		}
		if (Static42.anInt1235 != 0) {
			Static75.aBoolean101 = true;
			Static42.anInt1235 = 0;
		}
		if (Static39.anInt964 != 0) {
			Static39.anInt964 = 0;
			Static75.aBoolean101 = true;
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public static void method1240() {
		if (Static31.anInt805 != 0) {
			return;
		}
		@Pc(11) int local11 = Static106.anInt834;
		if (Static39.anInt964 == 1 && Static50.anInt1341 >= 516 && Static35.anInt850 >= 160 && Static50.anInt1341 <= 765 && Static35.anInt850 <= 205) {
			local11 = 0;
		}
		@Pc(49) int local49;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (!Static12.aBoolean16) {
			if (local11 == 1 && Static61.anInt1553 > 0) {
				local49 = Static53.anIntArray234[Static61.anInt1553 - 1];
				if (local49 == 24 || local49 == 41 || local49 == 35 || local49 == 53 || local49 == 50 || local49 == 12 || local49 == 36 || local49 == 31 || local49 == 5 || local49 == 2 || local49 == 16 || local49 == 1004) {
					local109 = Static101.anIntArray390[Static61.anInt1553 - 1];
					local115 = Static32.anIntArray151[Static61.anInt1553 - 1];
					@Pc(119) Class3_Sub3_Sub6 local119 = Static77.method1516(local115);
					if (local119.aBoolean86 || local119.aBoolean80) {
						Static4.anInt2757 = local109;
						Static16.anInt380 = 0;
						Static90.anInt2497 = Static50.anInt1341;
						Static66.aBoolean90 = false;
						Static31.anInt805 = 2;
						Static76.anInt2143 = Static35.anInt850;
						if (local115 >> 16 == Static104.anInt2723) {
							Static31.anInt805 = 1;
						}
						Static52.anInt1407 = local115;
						if (Static84.anInt2220 == local115 >> 16) {
							Static31.anInt805 = 3;
						}
						return;
					}
				}
			}
			if (local11 == 1 && (Static85.anInt2313 == 1 || Static85.method1630(Static61.anInt1553 - 1)) && Static61.anInt1553 > 2) {
				local11 = 2;
			}
			if (local11 == 1 && Static61.anInt1553 > 0) {
				method1239(Static61.anInt1553 - 1);
			}
			if (local11 == 2 && Static61.anInt1553 > 0) {
				Static4.method1891();
				return;
			}
			return;
		}
		if (local11 != 1) {
			local49 = Static85.anInt2297;
			local109 = Static93.anInt2546;
			if (Static22.anInt582 == 0) {
				local109 -= 4;
				local49 -= 4;
			}
			if (Static22.anInt582 == 1) {
				local109 -= 205;
				local49 -= 553;
			}
			if (Static22.anInt582 == 2) {
				local109 -= 357;
				local49 -= 17;
			}
			if (local49 < Static91.anInt2517 - 10 || local49 > Static71.anInt1864 + Static91.anInt2517 + 10 || local109 < Static40.anInt1206 - 10 || Static40.anInt1206 + anInt1724 + 10 < local109) {
				Static12.aBoolean16 = false;
				if (Static22.anInt582 == 1) {
					Static75.aBoolean101 = true;
				}
				if (Static22.anInt582 == 2) {
					Static13.aBoolean40 = true;
				}
			}
		}
		if (local11 != 1) {
			return;
		}
		local109 = Static40.anInt1206;
		local49 = Static91.anInt2517;
		local115 = Static71.anInt1864;
		@Pc(287) int local287 = Static50.anInt1341;
		@Pc(289) int local289 = Static35.anInt850;
		if (Static22.anInt582 == 0) {
			local289 -= 4;
			local287 -= 4;
		}
		@Pc(298) int local298 = -1;
		if (Static22.anInt582 == 1) {
			local289 -= 205;
			local287 -= 553;
		}
		if (Static22.anInt582 == 2) {
			local287 -= 17;
			local289 -= 357;
		}
		for (@Pc(312) int local312 = 0; local312 < Static61.anInt1553; local312++) {
			@Pc(327) int local327 = local109 + (-local312 + -1 + Static61.anInt1553) * 15 + 31;
			if (local49 < local287 && local287 < local49 + local115 && local327 - 13 < local289 && local327 + 3 > local289) {
				local298 = local312;
			}
		}
		if (local298 != -1) {
			method1239(local298);
		}
		if (Static22.anInt582 == 2) {
			Static13.aBoolean40 = true;
		}
		if (Static22.anInt582 == 1) {
			Static75.aBoolean101 = true;
		}
		Static12.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZZ)Lclient!hb;")
	public static Class27 method1241(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local17++;
		}
		@Pc(38) int local38 = local17;
		if (arg0 < 0) {
			local38 = local17 + 1;
		}
		@Pc(46) byte[] local46 = new byte[local38];
		if (arg0 < 0) {
			local46[0] = 45;
		}
		for (@Pc(62) int local62 = 0; local62 < local17; local62++) {
			@Pc(68) int local68 = arg0 % 10;
			arg0 /= 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			local46[local38 - local62 - 1] = (byte) (local68 + 48);
		}
		@Pc(104) Class27 local104 = new Class27();
		local104.aByteArray9 = local46;
		local104.anInt963 = local38;
		return local104;
	}
}
