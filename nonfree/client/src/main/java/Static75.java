import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!g;")
	public static Class26 aClass26_17;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1110 = Static72.method1077("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!e;")
	public static Class16 aClass16_58 = new Class16(64);

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_1115 = Static72.method1077("Choose Option");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1111 = aClass74_1115;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1112 = Static72.method1077("null");

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1113 = Static72.method1077(": ");

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt1600 = 127;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	public static int anInt1601 = 0;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_1114 = Static72.method1077("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1116 = Static72.method1077("Freie Welt");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1099() {
		aClass16_58 = null;
		aClass74_1116 = null;
		aClass74_1111 = null;
		aClass26_17 = null;
		aClass74_1113 = null;
		aClass74_1112 = null;
		aClass74_1110 = null;
		aClass74_1115 = null;
		aClass74_1114 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1100() {
		@Pc(17) int local17;
		if (Static105.anInt2321 == 0) {
			Static84.aClass69_1 = new Class69(4, 104, 104, Static56.anIntArrayArrayArray2);
			for (local17 = 0; local17 < 4; local17++) {
				Static50.aClass55Array1[local17] = new Class55(104, 104);
			}
			Static80.aClass2_Sub2_Sub1_Sub2_5 = new Class2_Sub2_Sub1_Sub2(512, 512);
			Static49.aClass74_850 = Static85.aClass74_1246;
			Static105.anInt2321 = 20;
			Static81.anInt1787 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (Static105.anInt2321 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local64 = local54 * 32 + 15 + 128;
				local70 = local64 * 3 + 600;
				local74 = Class2_Sub2_Sub1_Sub4.anIntArray122[local64];
				local52[local54] = local70 * local74 >> 16;
			}
			Static108.method1653(local52);
			Static81.anInt1787 = 10;
			Static105.anInt2321 = 30;
			Static49.aClass74_850 = Static90.aClass74_1295;
		} else if (Static105.anInt2321 == 30) {
			Static31.aClass26_Sub1_26 = Static24.method491(true, true, false, 0);
			Static23.aClass26_Sub1_24 = Static24.method491(true, true, false, 1);
			Static66.aClass26_Sub1_46 = Static24.method491(true, false, true, 2);
			Static93.aClass26_Sub1_56 = Static24.method491(true, true, false, 3);
			Static82.aClass26_Sub1_54 = Static24.method491(true, true, false, 4);
			Static121.aClass26_Sub1_71 = Static24.method491(true, true, true, 5);
			Static35.aClass26_Sub1_77 = Static24.method491(false, true, true, 6);
			Static11.aClass26_Sub1_14 = Static24.method491(true, true, false, 7);
			Static50.aClass26_Sub1_35 = Static24.method491(true, true, false, 8);
			Static103.aClass26_Sub1_63 = Static24.method491(true, true, false, 9);
			Static55.aClass26_Sub1_20 = Static24.method491(true, true, false, 10);
			Static56.aClass26_Sub1_41 = Static24.method491(true, true, false, 11);
			Static53.aClass26_Sub1_38 = Static24.method491(true, true, false, 12);
			Static3.aClass26_Sub1_3 = Static24.method491(true, false, true, 13);
			Static110.aClass26_Sub1_67 = Static24.method491(false, true, false, 14);
			Static126.aClass26_Sub1_76 = Static24.method491(true, true, false, 15);
			Static105.anInt2321 = 40;
			Static49.aClass74_850 = Static20.aClass74_460;
			Static81.anInt1787 = 20;
		} else if (Static105.anInt2321 == 40) {
			local17 = Static31.aClass26_Sub1_26.method1380() * 4 / 100;
			local17 += Static23.aClass26_Sub1_24.method1380() * 4 / 100;
			local17 += Static66.aClass26_Sub1_46.method1380() * 2 / 100;
			local17 += Static93.aClass26_Sub1_56.method1380() * 2 / 100;
			local17 += Static82.aClass26_Sub1_54.method1380() * 6 / 100;
			local17 += Static121.aClass26_Sub1_71.method1380() * 4 / 100;
			local17 += Static35.aClass26_Sub1_77.method1380() * 2 / 100;
			local17 += Static11.aClass26_Sub1_14.method1380() * 60 / 100;
			local17 += Static50.aClass26_Sub1_35.method1380() * 2 / 100;
			local17 += Static103.aClass26_Sub1_63.method1380() * 2 / 100;
			local17 += Static55.aClass26_Sub1_20.method1380() * 2 / 100;
			local17 += Static56.aClass26_Sub1_41.method1380() * 2 / 100;
			local17 += Static53.aClass26_Sub1_38.method1380() * 2 / 100;
			local17 += Static3.aClass26_Sub1_3.method1380() * 2 / 100;
			local17 += Static110.aClass26_Sub1_67.method1380() * 2 / 100;
			local17 += Static126.aClass26_Sub1_76.method1380() * 2 / 100;
			if (local17 == 100) {
				Static81.anInt1787 = 30;
				Static49.aClass74_850 = Static103.aClass74_1477;
				Static105.anInt2321 = 45;
			} else {
				if (local17 != 0) {
					Static49.aClass74_850 = Static91.method1340(new Class74[] { Static86.aClass74_1249, Static56.method940(local17), Static34.aClass74_621 });
				}
				Static81.anInt1787 = 30;
			}
		} else if (Static105.anInt2321 == 45) {
			Static57.method951(!Static84.aBoolean73);
			@Pc(440) Class2_Sub16_Sub2 local440 = new Class2_Sub16_Sub2();
			local440.method1789();
			Static79.aClass22_1 = Static55.method386(Static35.aClass15_59, 0, 22050, Static51.aCanvas2);
			Static79.aClass22_1.method1088(local440);
			Static21.method458(Static82.aClass26_Sub1_54, local440, Static126.aClass26_Sub1_76, Static110.aClass26_Sub1_67);
			Static98.aClass22_2 = Static55.method386(Static35.aClass15_59, 1, 2048, Static51.aCanvas2);
			Static55.aClass2_Sub16_Sub3_2 = new Class2_Sub16_Sub3();
			Static98.aClass22_2.method1088(Static55.aClass2_Sub16_Sub3_2);
			Static52.aClass33_1 = new Class33(22050, Static119.anInt2551);
			Static49.aClass74_850 = Static89.aClass74_1289;
			Static105.anInt2321 = 50;
			Static81.anInt1787 = 35;
		} else if (Static105.anInt2321 == 50) {
			local17 = 0;
			if (Static123.aClass2_Sub2_Sub1_Sub3_13 == null) {
				Static123.aClass2_Sub2_Sub1_Sub3_13 = Static114.method1690(Static50.aClass26_Sub1_35, Static97.aClass74_1736, Static6.aClass74_124);
			} else {
				local17++;
			}
			if (Static77.aClass2_Sub2_Sub1_Sub3_9 == null) {
				Static77.aClass2_Sub2_Sub1_Sub3_9 = Static114.method1690(Static50.aClass26_Sub1_35, Static97.aClass74_1736, Static24.aClass74_511);
			} else {
				local17++;
			}
			if (Static54.aClass2_Sub2_Sub1_Sub3_7 == null) {
				Static54.aClass2_Sub2_Sub1_Sub3_7 = Static114.method1690(Static50.aClass26_Sub1_35, Static97.aClass74_1736, Static33.aClass74_612);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static49.aClass74_857, Static56.method940(local17 * 100 / 3), Static34.aClass74_621 });
				Static81.anInt1787 = 40;
			} else {
				Static49.aClass74_850 = Static70.aClass74_1089;
				Static105.anInt2321 = 60;
				Static81.anInt1787 = 40;
			}
		} else if (Static105.anInt2321 == 60) {
			local17 = Static38.method655(Static50.aClass26_Sub1_35, Static55.aClass26_Sub1_20);
			local54 = Static93.method1383();
			if (local54 > local17) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static9.aClass74_231, Static56.method940(local17 * 100 / local54), Static34.aClass74_621 });
				Static81.anInt1787 = 50;
			} else {
				Static49.aClass74_850 = Static80.aClass74_1215;
				Static81.anInt1787 = 50;
				Static106.method1597(5);
				Static105.anInt2321 = 70;
			}
		} else if (Static105.anInt2321 == 70) {
			if (Static66.aClass26_Sub1_46.method1353()) {
				Static82.method1269(Static66.aClass26_Sub1_46);
				Static69.method1055(Static66.aClass26_Sub1_46);
				Static52.method873(Static66.aClass26_Sub1_46, Static11.aClass26_Sub1_14);
				Static54.method914(Static66.aClass26_Sub1_46, Static11.aClass26_Sub1_14, Static84.aBoolean73);
				Static25.method495(Static11.aClass26_Sub1_14, Static66.aClass26_Sub1_46);
				Static79.method1248(Static1.aBoolean86, Static11.aClass26_Sub1_14, Static66.aClass26_Sub1_46, Static123.aClass2_Sub2_Sub1_Sub3_13);
				Static1.method1460(Static23.aClass26_Sub1_24, Static31.aClass26_Sub1_26, Static66.aClass26_Sub1_46);
				Static12.method274(Static11.aClass26_Sub1_14, Static66.aClass26_Sub1_46);
				Static17.method404(Static66.aClass26_Sub1_46);
				Static79.method1251(Static66.aClass26_Sub1_46);
				Static47.method773(Static11.aClass26_Sub1_14, Static50.aClass26_Sub1_35, Static93.aClass26_Sub1_56);
				Static114.method1692(Static66.aClass26_Sub1_46);
				Static8.method171(Static66.aClass26_Sub1_46);
				Static81.anInt1787 = 60;
				Static105.anInt2321 = 80;
				Static49.aClass74_850 = Static36.aClass74_649;
			} else {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static117.aClass74_1587, Static56.method940(Static66.aClass26_Sub1_46.method1377()), Static34.aClass74_621 });
				Static81.anInt1787 = 60;
			}
		} else if (Static105.anInt2321 == 80) {
			local17 = 0;
			if (Static67.aClass2_Sub2_Sub1_Sub2_3 == null) {
				Static67.aClass2_Sub2_Sub1_Sub2_3 = Static10.method246(Static7.aClass74_1654, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (Static71.aClass2_Sub2_Sub1_Sub2_4 == null) {
				Static71.aClass2_Sub2_Sub1_Sub2_4 = Static10.method246(Static90.aClass74_1296, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (Static107.aClass2_Sub2_Sub1_Sub1Array10 == null) {
				Static107.aClass2_Sub2_Sub1_Sub1Array10 = Static25.method494(Static43.aClass74_708, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (Static8.aClass2_Sub2_Sub1_Sub2Array1 == null) {
				Static8.aClass2_Sub2_Sub1_Sub2Array1 = Static25.method497(Static126.aClass74_1711, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static27.aClass2_Sub2_Sub1_Sub2Array4 == null) {
				Static27.aClass2_Sub2_Sub1_Sub2Array4 = Static25.method497(Static105.aClass74_1483, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static43.aClass2_Sub2_Sub1_Sub2Array5 == null) {
				Static43.aClass2_Sub2_Sub1_Sub2Array5 = Static25.method497(Static93.aClass74_1336, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static105.aClass2_Sub2_Sub1_Sub2Array10 == null) {
				Static105.aClass2_Sub2_Sub1_Sub2Array10 = Static25.method497(Static10.aClass74_278, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static55.aClass2_Sub2_Sub1_Sub2Array3 == null) {
				Static55.aClass2_Sub2_Sub1_Sub2Array3 = Static25.method497(Static51.aClass74_1430, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static1.aClass2_Sub2_Sub1_Sub2_6 == null) {
				Static1.aClass2_Sub2_Sub1_Sub2_6 = Static10.method246(Static14.aClass74_400, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (Static71.aClass2_Sub2_Sub1_Sub2Array7 == null) {
				Static71.aClass2_Sub2_Sub1_Sub2Array7 = Static25.method497(Static89.aClass74_1292, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub1_Sub2Array9 == null) {
				Static85.aClass2_Sub2_Sub1_Sub2Array9 = Static25.method497(Static39.aClass74_681, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static46.aClass2_Sub2_Sub1_Sub2Array6 == null) {
				Static46.aClass2_Sub2_Sub1_Sub2Array6 = Static25.method497(Static62.aClass74_990, Static97.aClass74_1736, Static50.aClass26_Sub1_35);
			} else {
				local17++;
			}
			if (Static47.aClass2_Sub2_Sub1_Sub1Array5 == null) {
				Static47.aClass2_Sub2_Sub1_Sub1Array5 = Static25.method494(Static53.aClass74_908, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (Static34.aClass2_Sub2_Sub1_Sub1Array2 == null) {
				Static34.aClass2_Sub2_Sub1_Sub1Array2 = Static25.method494(Static18.aClass74_442, Static50.aClass26_Sub1_35, Static97.aClass74_1736);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static25.aClass74_519, Static56.method940(local17 * 100 / 14), Static34.aClass74_621 });
				Static81.anInt1787 = 70;
			} else {
				local64 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 21.0D) - 10;
				local54 = (int) (Math.random() * 21.0D) - 10;
				Static71.aClass2_Sub2_Sub1_Sub2_4.method220();
				local74 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(932) int local932 = 0; local932 < Static8.aClass2_Sub2_Sub1_Sub2Array1.length; local932++) {
					Static8.aClass2_Sub2_Sub1_Sub2Array1[local932].method204(local54 + local74, local64 + local74, local70 + local74);
				}
				Static107.aClass2_Sub2_Sub1_Sub1Array10[0].method95(local74 + local54, local64 - -local74, local70 + local74);
				Static49.aClass74_850 = Static86.aClass74_1252;
				Static105.anInt2321 = 85;
				Static81.anInt1787 = 70;
			}
		} else if (Static105.anInt2321 == 85) {
			local17 = Static127.method1926(Static50.aClass26_Sub1_35);
			local54 = Static8.method172();
			if (local17 < local54) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static57.aClass74_971, Static56.method940(local17 * 100 / local54), Static34.aClass74_621 });
				Static81.anInt1787 = 80;
			} else {
				Static49.aClass74_850 = Static8.aClass74_197;
				Static81.anInt1787 = 80;
				Static105.anInt2321 = 90;
			}
		} else if (Static105.anInt2321 == 90) {
			if (Static103.aClass26_Sub1_63.method1353()) {
				@Pc(1071) Class46 local1071 = new Class46(Static103.aClass26_Sub1_63, Static50.aClass26_Sub1_35, 20, 0.8D, Static84.aBoolean73 ? 64 : 128);
				Static44.method723(local1071);
				Static44.method718(0.8D);
				Static105.anInt2321 = 110;
				Static49.aClass74_850 = Static110.aClass74_1533;
				Static81.anInt1787 = 90;
			} else {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static95.aClass74_1395, Static56.method940(Static103.aClass26_Sub1_63.method1377()), Static34.aClass74_621 });
				Static81.anInt1787 = 90;
			}
		} else if (Static105.anInt2321 == 110) {
			Static39.aClass43_1 = new Class43();
			Static35.aClass15_59.method463(10, Static39.aClass43_1);
			Static81.anInt1787 = 94;
			Static49.aClass74_850 = Static4.aClass74_40;
			Static105.anInt2321 = 120;
		} else if (Static105.anInt2321 == 120) {
			if (Static55.aClass26_Sub1_20.method1372(Static97.aClass74_1736, Static14.aClass74_399)) {
				@Pc(1138) Class31 local1138 = new Class31(Static55.aClass26_Sub1_20.method1371(Static97.aClass74_1736, Static14.aClass74_399));
				Static14.method340(local1138);
				Static49.aClass74_850 = Static121.aClass74_1617;
				Static81.anInt1787 = 96;
				Static105.anInt2321 = 130;
			} else {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static72.aClass74_1105, Static85.aClass74_1239 });
				Static81.anInt1787 = 96;
			}
		} else if (Static105.anInt2321 == 130) {
			if (!Static93.aClass26_Sub1_56.method1353()) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static49.aClass74_854, Static56.method940(Static93.aClass26_Sub1_56.method1377() * 4 / 5), Static34.aClass74_621 });
				Static81.anInt1787 = 100;
			} else if (!Static53.aClass26_Sub1_38.method1353()) {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static49.aClass74_854, Static56.method940(Static53.aClass26_Sub1_38.method1377() / 6 + 80), Static34.aClass74_621 });
				Static81.anInt1787 = 100;
			} else if (Static3.aClass26_Sub1_3.method1353()) {
				Static49.aClass74_850 = Static9.aClass74_227;
				Static105.anInt2321 = 140;
				Static81.anInt1787 = 100;
			} else {
				Static49.aClass74_850 = Static91.method1340(new Class74[] { Static49.aClass74_854, Static56.method940(Static3.aClass26_Sub1_3.method1377() / 20 + 96), Static34.aClass74_621 });
				Static81.anInt1787 = 100;
			}
		} else if (Static105.anInt2321 == 140) {
			Static106.method1597(10);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method1101(@OriginalArg(0) int arg0) {
		if (Static9.anInt300 == 0) {
			Static12.aClass2_Sub16_Sub2_1.method1808(arg0);
		} else {
			Static121.anInt2594 = arg0;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method1102() {
		@Pc(1) Class65 local1 = Static112.aClass65_1;
		synchronized (Static112.aClass65_1) {
			Static52.anInt1256 = Static128.anInt2896;
			Static46.anInt1062 = Static31.anInt796;
			Static62.anInt1414 = Static9.anInt292;
			Static41.anInt973 = Static16.anInt465;
			Static120.anInt2565 = Static109.anInt2395;
			Static15.anInt442 = Static90.anInt1904;
			Static8.aLong13 = Static88.aLong74;
			Static16.anInt465 = 0;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIILclient!ve;III)V")
	public static void method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub17 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static17.aBoolean17) {
			Static66.anInt1460 = 32;
		} else {
			Static66.anInt1460 = 0;
		}
		Static17.aBoolean17 = false;
		@Pc(186) int local186;
		if (arg4 >= arg2 && arg2 + 16 > arg4 && arg3 <= arg1 && arg3 + 16 > arg1) {
			if (arg0 == 2 || arg0 == 3) {
				Static55.aBoolean16 = true;
			}
			arg5.anInt2836 -= Static106.anInt2330 * 4;
			if (arg0 == 1) {
				Static116.aBoolean107 = true;
			}
		} else if (arg4 >= arg2 && arg2 + 16 > arg4 && arg1 >= arg3 + arg6 - 16 && arg3 + arg6 > arg1) {
			if (arg0 == 2 || arg0 == 3) {
				Static55.aBoolean16 = true;
			}
			arg5.anInt2836 += Static106.anInt2330 * 4;
			if (arg0 == 1) {
				Static116.aBoolean107 = true;
			}
		} else if (arg4 >= arg2 - Static66.anInt1460 && arg4 < Static66.anInt1460 + arg2 + 16 && arg1 >= arg3 + 16 && arg1 < arg6 + arg3 - 16 && Static106.anInt2330 > 0) {
			if (arg0 == 1) {
				Static116.aBoolean107 = true;
			}
			Static17.aBoolean17 = true;
			if (arg0 == 2 || arg0 == 3) {
				Static55.aBoolean16 = true;
			}
			local186 = (arg6 - 32) * arg6 / arg7;
			if (local186 < 8) {
				local186 = 8;
			}
			@Pc(200) int local200 = arg6 - local186 - 32;
			@Pc(212) int local212 = arg1 - local186 / 2 - arg3 - 16;
			arg5.anInt2836 = local212 * (arg7 - arg6) / local200;
		}
		if (Static10.anInt322 == 0) {
			return;
		}
		local186 = arg5.anInt2810;
		if (arg0 == -1) {
			local186 = 479;
		}
		if (arg2 - local186 > arg4 || arg3 > arg1 || arg2 + 16 <= arg4 || arg6 + arg3 < arg1) {
			return;
		}
		arg5.anInt2836 += Static10.anInt322 * 45;
		if (arg0 == 1) {
			Static116.aBoolean107 = true;
		}
		if (arg0 == 2 || arg0 == 3) {
			Static55.aBoolean16 = true;
		}
		return;
	}
}
