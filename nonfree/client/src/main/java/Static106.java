import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "[S")
	public static short[] aShortArray15;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!q;")
	public static Class3_Sub18 aClass3_Sub18_1 = new Class3_Sub18(0, 0);

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_836 = Static65.method1172("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_837 = null;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_838 = Static65.method1172(")4lang)4de");

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	public static int anInt2534 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!jg;Lclient!jg;Ljava/awt/Component;I)V")
	public static void method1728(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Component arg2) {
		if (Static88.aBoolean91) {
			return;
		}
		Static103.method2221();
		@Pc(15) byte[] local15 = arg1.method1622(Static130.aClass46_1067, Static129.aClass46_1053);
		Static128.aClass3_Sub2_Sub3_Sub3_32 = new Class3_Sub2_Sub3_Sub3(local15, arg2);
		Static89.aClass3_Sub2_Sub3_Sub3_23 = Static128.aClass3_Sub2_Sub3_Sub3_32.method1886();
		Static137.aClass3_Sub2_Sub3_Sub2_5 = method1736(Static14.aClass46_97, arg0, Static130.aClass46_1067);
		Static124.aClass3_Sub2_Sub3_Sub2_4 = method1736(Static177.aClass46_1395, arg0, Static130.aClass46_1067);
		Static9.aClass3_Sub2_Sub3_Sub2_1 = method1736(Static72.aClass46_633, arg0, Static130.aClass46_1067);
		Static122.aClass3_Sub2_Sub3_Sub2Array5 = Static25.method2908(Static74.aClass46_648, arg0, Static130.aClass46_1067);
		Static146.aClass3_Sub2_Sub3_Sub2Array7 = Static25.method2908(Static96.aClass46_786, arg0, Static130.aClass46_1067);
		Static63.anIntArray157 = new int[256];
		for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
			Static63.anIntArray157[local63] = local63 * 262144;
		}
		for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
			Static63.anIntArray157[local79 + 64] = local79 * 1024 + 16711680;
		}
		for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
			Static63.anIntArray157[local99 + 128] = local99 * 4 + 16776960;
		}
		for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
			Static63.anIntArray157[local118 + 192] = 16777215;
		}
		Static31.anIntArray66 = new int[256];
		for (@Pc(135) int local135 = 0; local135 < 64; local135++) {
			Static31.anIntArray66[local135] = local135 * 1024;
		}
		for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
			Static31.anIntArray66[local149 + 64] = local149 * 4 + 65280;
		}
		for (@Pc(169) int local169 = 0; local169 < 64; local169++) {
			Static31.anIntArray66[local169 + 128] = local169 * 262144 + 65535;
		}
		for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
			Static31.anIntArray66[local190 + 192] = 16777215;
		}
		Static78.anIntArray240 = new int[256];
		for (@Pc(207) int local207 = 0; local207 < 64; local207++) {
			Static78.anIntArray240[local207] = local207 * 4;
		}
		for (@Pc(221) int local221 = 0; local221 < 64; local221++) {
			Static78.anIntArray240[local221 + 64] = local221 * 262144 + 255;
		}
		for (@Pc(239) int local239 = 0; local239 < 64; local239++) {
			Static78.anIntArray240[local239 + 128] = local239 * 1024 + 16711935;
		}
		for (@Pc(257) int local257 = 0; local257 < 64; local257++) {
			Static78.anIntArray240[local257 + 192] = 16777215;
		}
		Static153.anIntArray398 = new int[32768];
		Static2.anIntArray2 = new int[32768];
		Static1.anIntArray1 = new int[256];
		Static16.method324(null);
		Static122.anInt2903 = 0;
		Static65.anIntArray165 = new int[32768];
		Static139.aBoolean134 = false;
		if (Static68.anInt1768 == 0) {
			Static148.aBoolean151 = true;
		} else {
			Static148.aBoolean151 = false;
		}
		Static54.anIntArray134 = new int[32768];
		Static130.aClass46_1066 = Static130.aClass46_1067;
		Static130.aClass46_1063 = Static130.aClass46_1067;
		if (Static148.aBoolean151) {
			Static102.method1680();
		} else {
			Static1.method1(Static53.aClass44_Sub1_5, Static151.aClass46_1192, Static130.aClass46_1067);
		}
		Static89.method1481(false);
		Static88.aBoolean91 = true;
		Static128.aClass3_Sub2_Sub3_Sub3_32.method1888(0, 0);
		Static89.aClass3_Sub2_Sub3_Sub3_23.method1888(382, 0);
		Static137.aClass3_Sub2_Sub3_Sub2_5.method1713(382 - Static137.aClass3_Sub2_Sub3_Sub2_5.anInt2494 / 2, 18);
		Static85.aClass3_Sub2_Sub3_Sub3_7 = new Class3_Sub2_Sub3_Sub3(128, 254);
		Static41.aClass3_Sub2_Sub3_Sub3_39 = new Class3_Sub2_Sub3_Sub3(128, 254);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
	public static void method1735() {
		if (Static129.aClass1_3 != null) {
			Static129.aClass1_3.method10();
			Static129.aClass1_3 = null;
		}
		Static165.method2648();
		Static154.aClass62_1.method1972();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static128.aClass69Array1[local18].method2258();
		}
		System.gc();
		Static102.method1680();
		Static170.anInt3767 = -1;
		Static150.aBoolean146 = false;
		Static53.method1008();
		Static180.method2893(10);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!kb;Lclient!jg;Lclient!kb;)Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 method1736(@OriginalArg(1) Class46 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(13) int local13 = arg1.method1617(arg0);
		@Pc(19) int local19 = arg1.method1631(arg2, local13);
		return Static140.method186(local13, local19, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1739() {
		aShortArray15 = null;
		aClass46_837 = null;
		aClass46_836 = null;
		aClass46_838 = null;
		aClass3_Sub18_1 = null;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V")
	public static void method1740() {
		@Pc(17) int local17;
		if (Static163.anInt3621 == 0) {
			Static154.aClass62_1 = new Class62(4, 104, 104, Static133.anIntArrayArrayArray8);
			for (local17 = 0; local17 < 4; local17++) {
				Static128.aClass69Array1[local17] = new Class69(104, 104);
			}
			Static12.aClass3_Sub2_Sub3_Sub3_43 = new Class3_Sub2_Sub3_Sub3(512, 512);
			Static130.aClass46_1059 = Static34.aClass46_263;
			Static52.anInt1390 = 5;
			Static163.anInt3621 = 20;
			return;
		}
		@Pc(56) int local56;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (Static163.anInt3621 == 20) {
			@Pc(54) int[] local54 = new int[9];
			for (local56 = 0; local56 < 9; local56++) {
				local67 = local56 * 32 + 128 + 15;
				local73 = local67 * 3 + 600;
				local77 = Class3_Sub2_Sub3_Sub4.anIntArray347[local67];
				local54[local56] = local73 * local77 >> 16;
			}
			Static117.method1995(local54);
			Static130.aClass46_1059 = Static84.aClass46_707;
			Static163.anInt3621 = 30;
			Static52.anInt1390 = 10;
		} else if (Static163.anInt3621 == 30) {
			Static95.aClass44_Sub1_10 = Static40.method844(true, false, 0, true);
			Static178.aClass44_Sub1_16 = Static40.method844(true, false, 1, true);
			Static63.aClass44_Sub1_7 = Static40.method844(true, true, 2, false);
			Static160.aClass44_Sub1_15 = Static40.method844(true, false, 3, true);
			Static65.aClass44_Sub1_8 = Static40.method844(true, false, 4, true);
			Static51.aClass44_Sub1_3 = Static40.method844(true, true, 5, true);
			Static53.aClass44_Sub1_5 = Static40.method844(false, true, 6, true);
			Static24.aClass44_Sub1_1 = Static40.method844(true, false, 7, true);
			Static181.aClass44_Sub1_18 = Static40.method844(true, false, 8, true);
			Static179.aClass44_Sub1_17 = Static40.method844(true, true, 9, false);
			Static56.aClass44_Sub1_6 = Static40.method844(true, false, 10, true);
			Static91.aClass44_Sub1_9 = Static40.method844(true, false, 11, true);
			Static153.aClass44_Sub1_14 = Static40.method844(true, false, 12, true);
			Static42.aClass44_Sub1_2 = Static40.method844(true, true, 13, false);
			Static53.aClass44_Sub1_4 = Static40.method844(false, false, 14, true);
			Static126.aClass44_Sub1_11 = Static40.method844(true, false, 15, true);
			Static52.anInt1390 = 20;
			Static130.aClass46_1059 = Static52.aClass46_456;
			Static163.anInt3621 = 40;
		} else if (Static163.anInt3621 == 40) {
			local17 = Static95.aClass44_Sub1_10.method1637() * 4 / 100;
			local17 += Static178.aClass44_Sub1_16.method1637() * 4 / 100;
			local17 += Static63.aClass44_Sub1_7.method1637() * 2 / 100;
			local17 += Static160.aClass44_Sub1_15.method1637() * 2 / 100;
			local17 += Static65.aClass44_Sub1_8.method1637() * 6 / 100;
			local17 += Static51.aClass44_Sub1_3.method1637() * 4 / 100;
			local17 += Static53.aClass44_Sub1_5.method1637() * 2 / 100;
			local17 += Static24.aClass44_Sub1_1.method1637() * 60 / 100;
			local17 += Static181.aClass44_Sub1_18.method1637() * 2 / 100;
			local17 += Static179.aClass44_Sub1_17.method1637() * 2 / 100;
			local17 += Static56.aClass44_Sub1_6.method1637() * 2 / 100;
			local17 += Static91.aClass44_Sub1_9.method1637() * 2 / 100;
			local17 += Static153.aClass44_Sub1_14.method1637() * 2 / 100;
			local17 += Static42.aClass44_Sub1_2.method1637() * 2 / 100;
			local17 += Static53.aClass44_Sub1_4.method1637() * 2 / 100;
			local17 += Static126.aClass44_Sub1_11.method1637() * 2 / 100;
			if (local17 == 100) {
				Static130.aClass46_1059 = Static72.aClass46_636;
				Static52.anInt1390 = 30;
				Static163.anInt3621 = 45;
			} else {
				if (local17 != 0) {
					Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static175.aClass46_1383, Static57.method1068(local17), Static21.aClass46_1050 });
				}
				Static52.anInt1390 = 30;
			}
		} else if (Static163.anInt3621 == 45) {
			Static119.method2036(!Static71.aBoolean76);
			@Pc(448) Class3_Sub5_Sub2 local448 = new Class3_Sub5_Sub2();
			local448.method2299();
			Static139.aClass12_2 = Static47.method932(Static100.aCanvas1, 0, Static66.aClass68_4, 22050);
			Static139.aClass12_2.method2666(local448);
			Static56.method1049(local448, Static65.aClass44_Sub1_8, Static53.aClass44_Sub1_4, Static126.aClass44_Sub1_11);
			Static127.aClass12_1 = Static47.method932(Static100.aCanvas1, 1, Static66.aClass68_4, 2048);
			Static163.aClass3_Sub5_Sub3_2 = new Class3_Sub5_Sub3();
			Static127.aClass12_1.method2666(Static163.aClass3_Sub5_Sub3_2);
			Static121.aClass41_1 = new Class41(22050, Static149.anInt3584);
			Static52.anInt1390 = 35;
			Static163.anInt3621 = 50;
			Static130.aClass46_1059 = Static178.aClass46_1408;
		} else if (Static163.anInt3621 == 50) {
			local17 = 0;
			if (Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5 == null) {
				Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5 = Static84.method1408(Static181.aClass44_Sub1_18, Static33.aClass46_249, Static38.aClass46_298, Static42.aClass44_Sub1_2);
			} else {
				local17++;
			}
			if (Static49.aClass3_Sub2_Sub3_Sub1_Sub1_3 == null) {
				Static49.aClass3_Sub2_Sub3_Sub1_Sub1_3 = Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5;
			} else {
				local17++;
			}
			if (Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2 == null) {
				Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2 = Static84.method1408(Static181.aClass44_Sub1_18, Static161.aClass46_1295, Static38.aClass46_298, Static42.aClass44_Sub1_2);
			} else {
				local17++;
			}
			if (Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4 == null) {
				Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4 = Static84.method1408(Static181.aClass44_Sub1_18, Static156.aClass46_1258, Static38.aClass46_298, Static42.aClass44_Sub1_2);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static30.aClass46_181, Static57.method1068(local17 * 100 / 4), Static21.aClass46_1050 });
				Static52.anInt1390 = 40;
			} else {
				Static52.anInt1390 = 40;
				Static130.aClass46_1059 = Static127.aClass46_1039;
				Static163.anInt3621 = 60;
			}
		} else if (Static163.anInt3621 == 60) {
			local17 = Static124.method2125(Static56.aClass44_Sub1_6, Static181.aClass44_Sub1_18);
			local56 = Static78.method1629();
			if (local17 < local56) {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static170.aClass46_1349, Static57.method1068(local17 * 100 / local56), Static21.aClass46_1050 });
				Static52.anInt1390 = 50;
			} else {
				Static52.anInt1390 = 50;
				Static130.aClass46_1059 = Static42.aClass46_373;
				Static180.method2893(5);
				Static163.anInt3621 = 70;
			}
		} else if (Static163.anInt3621 == 70) {
			if (Static63.aClass44_Sub1_7.method1612()) {
				Static87.method1450(Static63.aClass44_Sub1_7);
				Static51.method1001(Static63.aClass44_Sub1_7);
				Static16.method322(Static24.aClass44_Sub1_1, Static63.aClass44_Sub1_7);
				Static134.method2270(Static63.aClass44_Sub1_7, Static71.aBoolean76, Static24.aClass44_Sub1_1);
				Static88.method1475(Static24.aClass44_Sub1_1, Static63.aClass44_Sub1_7);
				Static14.method296(Static63.aClass44_Sub1_7, Static52.aBoolean41, Static24.aClass44_Sub1_1, Static49.aClass3_Sub2_Sub3_Sub1_Sub1_3);
				Static98.method1605(Static178.aClass44_Sub1_16, Static63.aClass44_Sub1_7, Static95.aClass44_Sub1_10);
				Static157.method2543(Static24.aClass44_Sub1_1, Static63.aClass44_Sub1_7);
				Static68.method1187(Static63.aClass44_Sub1_7);
				Static59.method1100(Static63.aClass44_Sub1_7);
				Static179.method2877(Static181.aClass44_Sub1_18, Static160.aClass44_Sub1_15, Static24.aClass44_Sub1_1, Static42.aClass44_Sub1_2);
				Static150.method2479(Static63.aClass44_Sub1_7);
				Static18.method334(Static63.aClass44_Sub1_7);
				Static52.anInt1390 = 60;
				Static130.aClass46_1059 = Static124.aClass46_1024;
				Static104.method1714();
				Static163.anInt3621 = 80;
			} else {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static71.aClass46_627, Static57.method1068(Static63.aClass44_Sub1_7.method1641()), Static21.aClass46_1050 });
				Static52.anInt1390 = 60;
			}
		} else if (Static163.anInt3621 == 80) {
			local17 = 0;
			if (Static147.aClass3_Sub2_Sub3_Sub3_37 == null) {
				Static147.aClass3_Sub2_Sub3_Sub3_37 = Static113.method1444(Static38.aClass46_298, Static55.aClass46_481, Static181.aClass44_Sub1_18);
			} else {
				local17++;
			}
			if (Static24.aClass3_Sub2_Sub3_Sub3_5 == null) {
				Static24.aClass3_Sub2_Sub3_Sub3_5 = Static113.method1444(Static38.aClass46_298, Static66.aClass46_601, Static181.aClass44_Sub1_18);
			} else {
				local17++;
			}
			if (Static7.aClass3_Sub2_Sub3_Sub2Array1 == null) {
				Static7.aClass3_Sub2_Sub3_Sub2Array1 = Static25.method2908(Static39.aClass46_1447, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static2.aClass3_Sub2_Sub3_Sub3Array1 == null) {
				Static2.aClass3_Sub2_Sub3_Sub3Array1 = Static19.method362(Static20.aClass46_145, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static100.aClass3_Sub2_Sub3_Sub3Array8 == null) {
				Static100.aClass3_Sub2_Sub3_Sub3Array8 = Static19.method362(Static152.aClass46_1202, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static95.aClass3_Sub2_Sub3_Sub3Array6 == null) {
				Static95.aClass3_Sub2_Sub3_Sub3Array6 = Static19.method362(Static180.aClass46_1428, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static60.aClass3_Sub2_Sub3_Sub3Array4 == null) {
				Static60.aClass3_Sub2_Sub3_Sub3Array4 = Static19.method362(Static81.aClass46_694, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static101.aClass3_Sub2_Sub3_Sub3Array9 == null) {
				Static101.aClass3_Sub2_Sub3_Sub3Array9 = Static19.method362(Static30.aClass46_186, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static18.aClass3_Sub2_Sub3_Sub3Array2 == null) {
				Static18.aClass3_Sub2_Sub3_Sub3Array2 = Static19.method362(Static172.aClass46_1353, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static179.aClass3_Sub2_Sub3_Sub3Array10 == null) {
				Static179.aClass3_Sub2_Sub3_Sub3Array10 = Static19.method362(Static10.aClass46_87, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static53.aClass3_Sub2_Sub3_Sub3Array3 == null) {
				Static53.aClass3_Sub2_Sub3_Sub3Array3 = Static19.method362(Static57.aClass46_518, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static119.aClass3_Sub2_Sub3_Sub2Array4 == null) {
				Static119.aClass3_Sub2_Sub3_Sub2Array4 = Static25.method2908(Static136.aClass46_1098, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static177.aClass3_Sub2_Sub3_Sub2Array10 == null) {
				Static177.aClass3_Sub2_Sub3_Sub2Array10 = Static25.method2908(Static149.aClass46_1300, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (Static54.aClass3_Sub2_Sub3_Sub2_2 == null) {
				Static54.aClass3_Sub2_Sub3_Sub2_2 = method1736(Static127.aClass46_1037, Static181.aClass44_Sub1_18, Static38.aClass46_298);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static98.aClass46_790, Static57.method1068(local17 * 100 / 14), Static21.aClass46_1050 });
				Static52.anInt1390 = 70;
			} else {
				local56 = (int) (Math.random() * 21.0D) - 10;
				Static138.aClass3_Sub2_Sub3_Sub2Array3 = Static177.aClass3_Sub2_Sub3_Sub2Array10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 21.0D) - 10;
				Static24.aClass3_Sub2_Sub3_Sub3_5.method1878();
				local77 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(953) int local953 = 0; local953 < Static2.aClass3_Sub2_Sub3_Sub3Array1.length; local953++) {
					Static2.aClass3_Sub2_Sub3_Sub3Array1[local953].method1897(local77 + local56, local67 + local77, local77 + local73);
				}
				Static7.aClass3_Sub2_Sub3_Sub2Array1[0].method1712(local77 + local56, local77 + local67, local73 + local77);
				Static170.method2712();
				Static52.anInt1390 = 70;
				Static130.aClass46_1059 = Static24.aClass46_154;
				Static163.anInt3621 = 90;
			}
		} else if (Static163.anInt3621 == 90) {
			if (Static179.aClass44_Sub1_17.method1612()) {
				@Pc(1044) Class88 local1044 = new Class88(Static179.aClass44_Sub1_17, Static181.aClass44_Sub1_18, 20, Static71.aBoolean76 ? 64 : 128);
				Static132.method2229(local1044);
				Static132.method2235(0.7F);
				Static163.anInt3621 = 110;
				Static52.anInt1390 = 90;
				Static130.aClass46_1059 = Static48.aClass46_433;
			} else {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static140.aClass46_68, Static57.method1068(Static179.aClass44_Sub1_17.method1641()), Static21.aClass46_1050 });
				Static52.anInt1390 = 90;
			}
		} else if (Static163.anInt3621 == 110) {
			Static89.aClass84_1 = new Class84();
			Static66.aClass68_4.method2193(Static89.aClass84_1, 10);
			Static130.aClass46_1059 = Static84.aClass46_702;
			Static52.anInt1390 = 94;
			Static163.anInt3621 = 120;
		} else if (Static163.anInt3621 == 120) {
			if (Static56.aClass44_Sub1_6.method1613(Static22.aClass46_148, Static38.aClass46_298)) {
				@Pc(1113) Class75 local1113 = new Class75(Static56.aClass44_Sub1_6.method1622(Static38.aClass46_298, Static22.aClass46_148));
				Static77.method1279(local1113);
				Static130.aClass46_1059 = Static181.aClass46_1444;
				Static163.anInt3621 = 130;
				Static52.anInt1390 = 96;
			} else {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static100.aClass46_806, Static41.aClass46_1319 });
				Static52.anInt1390 = 96;
			}
		} else if (Static163.anInt3621 == 130) {
			if (!Static160.aClass44_Sub1_15.method1612()) {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static134.aClass46_1086, Static57.method1068(Static160.aClass44_Sub1_15.method1641() * 4 / 5), Static21.aClass46_1050 });
				Static52.anInt1390 = 100;
			} else if (!Static153.aClass44_Sub1_14.method1612()) {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static134.aClass46_1086, Static57.method1068(Static153.aClass44_Sub1_14.method1641() / 6 + 80), Static21.aClass46_1050 });
				Static52.anInt1390 = 100;
			} else if (Static42.aClass44_Sub1_2.method1612()) {
				Static163.anInt3621 = 140;
				Static52.anInt1390 = 100;
				Static130.aClass46_1059 = Static16.aClass46_116;
			} else {
				Static130.aClass46_1059 = Static178.method2860(new Class46[] { Static134.aClass46_1086, Static57.method1068(Static42.aClass44_Sub1_2.method1641() / 20 + 96), Static21.aClass46_1050 });
				Static52.anInt1390 = 100;
			}
		} else if (Static163.anInt3621 == 140) {
			Static180.method2893(10);
		}
	}
}
