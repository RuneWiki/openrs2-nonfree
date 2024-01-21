import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_19;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_429 = Static63.method1251("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_430 = Static63.method1251("");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_431 = Static63.method1251("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_432 = Static63.method1251("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_433 = Static63.method1251("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_434 = Static63.method1251("Icons redrawn");

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_435 = Static63.method1251("Fallen lassen");

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt888 = 0;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static final int anInt891 = 5063219;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lclient!ge;")
	public static Class29_Sub1[] aClass29_Sub1Array1 = new Class29_Sub1[256];

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "[I")
	public static int[] anIntArray151 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method626() {
		@Pc(17) int local17;
		if (Static117.anInt3061 == 0) {
			Static110.aClass34_1 = new Class34(4, 104, 104, Static40.anIntArrayArrayArray2);
			for (local17 = 0; local17 < 4; local17++) {
				Static51.aClass37Array1[local17] = new Class37(104, 104);
			}
			Static84.aClass5_Sub2_Sub6_Sub3_2 = new Class5_Sub2_Sub6_Sub3(512, 512);
			Static31.anInt926 = 5;
			Static40.aClass45_517 = Static62.aClass45_775;
			Static117.anInt3061 = 20;
			return;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (Static117.anInt3061 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local67 = local59 * 32 + 143;
				local73 = local67 * 3 + 600;
				local77 = Class5_Sub2_Sub6_Sub2.anIntArray360[local67];
				local57[local59] = local77 * local73 >> 16;
			}
			Static43.method886(local57);
			Static40.aClass45_517 = Static10.aClass45_168;
			Static31.anInt926 = 10;
			Static117.anInt3061 = 30;
		} else if (Static117.anInt3061 == 30) {
			Static63.aClass29_Sub1_27 = Static70.method1360(true, 0, false, true);
			Static105.aClass29_Sub1_45 = Static70.method1360(true, 1, false, true);
			Static62.aClass29_Sub1_25 = Static70.method1360(false, 2, true, true);
			Static48.aClass29_Sub1_22 = Static70.method1360(true, 3, false, true);
			Static100.aClass29_Sub1_43 = Static70.method1360(true, 4, false, true);
			Static46.aClass29_Sub1_17 = Static70.method1360(true, 5, true, true);
			Static21.aClass29_Sub1_11 = Static70.method1360(true, 6, true, false);
			Static1.aClass29_Sub1_1 = Static70.method1360(true, 7, false, true);
			Static112.aClass29_Sub1_48 = Static70.method1360(true, 8, false, true);
			Static6.aClass29_Sub1_4 = Static70.method1360(true, 9, false, true);
			Static36.aClass29_Sub1_15 = Static70.method1360(true, 10, false, true);
			Static77.aClass29_Sub1_33 = Static70.method1360(true, 11, false, true);
			Static71.aClass29_Sub1_32 = Static70.method1360(true, 12, false, true);
			Static92.aClass29_Sub1_50 = Static70.method1360(false, 13, true, true);
			Static121.aClass29_Sub1_38 = Static70.method1360(true, 14, false, false);
			Static66.aClass29_Sub1_29 = Static70.method1360(true, 15, false, true);
			Static40.aClass45_517 = Static119.aClass45_1353;
			Static31.anInt926 = 20;
			Static117.anInt3061 = 40;
		} else if (Static117.anInt3061 == 40) {
			local17 = Static63.aClass29_Sub1_27.method772() * 4 / 100;
			local17 += Static105.aClass29_Sub1_45.method772() * 4 / 100;
			local17 += Static62.aClass29_Sub1_25.method772() * 2 / 100;
			local17 += Static48.aClass29_Sub1_22.method772() * 2 / 100;
			local17 += Static100.aClass29_Sub1_43.method772() * 6 / 100;
			local17 += Static46.aClass29_Sub1_17.method772() * 4 / 100;
			local17 += Static21.aClass29_Sub1_11.method772() * 2 / 100;
			local17 += Static1.aClass29_Sub1_1.method772() * 60 / 100;
			local17 += Static112.aClass29_Sub1_48.method772() * 2 / 100;
			local17 += Static6.aClass29_Sub1_4.method772() * 2 / 100;
			local17 += Static36.aClass29_Sub1_15.method772() * 2 / 100;
			local17 += Static77.aClass29_Sub1_33.method772() * 2 / 100;
			local17 += Static71.aClass29_Sub1_32.method772() * 2 / 100;
			local17 += Static92.aClass29_Sub1_50.method772() * 2 / 100;
			local17 += Static121.aClass29_Sub1_38.method772() * 2 / 100;
			local17 += Static66.aClass29_Sub1_29.method772() * 2 / 100;
			if (local17 == 100) {
				Static40.aClass45_517 = Static85.aClass45_1022;
				Static117.anInt3061 = 45;
				Static31.anInt926 = 30;
			} else {
				if (local17 != 0) {
					Static40.aClass45_517 = Static39.method1443(new Class45[] { Static66.aClass45_813, Static76.method1476(local17), Static99.aClass45_1140 });
				}
				Static31.anInt926 = 30;
			}
		} else if (Static117.anInt3061 == 45) {
			Static36.aClass5_Sub7_Sub4_2 = new Class5_Sub7_Sub4();
			Static36.aClass5_Sub7_Sub4_2.method2046();
			Static102.method1893(!Static103.aBoolean122);
			Static41.aClass15_3 = Static62.method1230(22050, Static75.aCanvas1, 0, Static96.aClass77_3);
			Static122.aClass15_4 = Static62.method1230(2048, Static75.aCanvas1, 1, Static96.aClass77_3);
			Static41.aClass15_3.method1526(Static36.aClass5_Sub7_Sub4_2);
			Static47.aClass5_Sub7_Sub3_2 = new Class5_Sub7_Sub3();
			Static122.aClass15_4.method1526(Static47.aClass5_Sub7_Sub3_2);
			Static41.method1528(Static36.aClass5_Sub7_Sub4_2, Static121.aClass29_Sub1_38, Static100.aClass29_Sub1_43, Static66.aClass29_Sub1_29);
			Static39.aClass71_2 = new Class71(22050, Static1.anInt3);
			Static31.anInt926 = 35;
			Static117.anInt3061 = 50;
			Static40.aClass45_517 = Static80.aClass45_957;
		} else if (Static117.anInt3061 == 50) {
			local17 = 0;
			if (Static71.aClass5_Sub2_Sub6_Sub1_4 == null) {
				Static71.aClass5_Sub2_Sub6_Sub1_4 = Static55.method1152(Static78.aClass45_929, Static53.aClass45_1003, Static112.aClass29_Sub1_48);
			} else {
				local17++;
			}
			if (Static78.aClass5_Sub2_Sub6_Sub1_5 == null) {
				Static78.aClass5_Sub2_Sub6_Sub1_5 = Static55.method1152(Static78.aClass45_929, Static109.aClass45_1261, Static112.aClass29_Sub1_48);
			} else {
				local17++;
			}
			if (Static8.aClass5_Sub2_Sub6_Sub1_1 == null) {
				Static8.aClass5_Sub2_Sub6_Sub1_1 = Static55.method1152(Static78.aClass45_929, Static108.aClass45_1242, Static112.aClass29_Sub1_48);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static98.aClass45_1130, Static76.method1476(local17 * 100 / 3), Static99.aClass45_1140 });
				Static31.anInt926 = 40;
			} else {
				Static31.anInt926 = 40;
				Static40.aClass45_517 = Static103.aClass45_1184;
				Static117.anInt3061 = 60;
			}
		} else if (Static117.anInt3061 == 60) {
			local17 = Static3.method67(Static36.aClass29_Sub1_15, Static112.aClass29_Sub1_48);
			local59 = Static13.method269();
			if (local59 > local17) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static60.aClass45_717, Static76.method1476(local17 * 100 / local59), Static99.aClass45_1140 });
				Static31.anInt926 = 50;
			} else {
				Static31.anInt926 = 50;
				Static40.aClass45_517 = Static98.aClass45_1138;
				Static39.method1422(5);
				Static117.anInt3061 = 70;
			}
		} else if (Static117.anInt3061 == 70) {
			if (Static62.aClass29_Sub1_25.method759()) {
				Static30.method303(Static62.aClass29_Sub1_25);
				Static57.method1173(Static62.aClass29_Sub1_25);
				Static57.method1175(Static62.aClass29_Sub1_25, Static1.aClass29_Sub1_1);
				Static66.method1290(Static1.aClass29_Sub1_1, Static62.aClass29_Sub1_25, Static103.aBoolean122);
				Static74.method1697(Static1.aClass29_Sub1_1, Static62.aClass29_Sub1_25);
				Static91.method1709(Static68.aBoolean95, Static71.aClass5_Sub2_Sub6_Sub1_4, Static1.aClass29_Sub1_1, Static62.aClass29_Sub1_25);
				Static69.method1346(Static63.aClass29_Sub1_27, Static62.aClass29_Sub1_25, Static105.aClass29_Sub1_45);
				Static38.method797(Static62.aClass29_Sub1_25, Static1.aClass29_Sub1_1);
				Static49.method1106(Static62.aClass29_Sub1_25);
				Static47.method985(Static62.aClass29_Sub1_25);
				Static101.method751(Static48.aClass29_Sub1_22, Static1.aClass29_Sub1_1, Static112.aClass29_Sub1_48);
				Static39.method1429(Static62.aClass29_Sub1_25);
				Static40.aClass45_517 = Static122.aClass45_1375;
				Static31.anInt926 = 60;
				Static117.anInt3061 = 80;
			} else {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static13.aClass45_202, Static76.method1476(Static62.aClass29_Sub1_25.method764()), Static99.aClass45_1140 });
				Static31.anInt926 = 60;
			}
		} else if (Static117.anInt3061 == 80) {
			local17 = 0;
			if (Static108.aClass5_Sub2_Sub6_Sub3_6 == null) {
				Static108.aClass5_Sub2_Sub6_Sub3_6 = Static117.method2123(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static96.aClass45_1109);
			} else {
				local17++;
			}
			if (Static85.aClass5_Sub2_Sub6_Sub3_3 == null) {
				Static85.aClass5_Sub2_Sub6_Sub3_3 = Static117.method2123(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static121.aClass45_1012);
			} else {
				local17++;
			}
			if (Static97.aClass5_Sub2_Sub6_Sub4Array5 == null) {
				Static97.aClass5_Sub2_Sub6_Sub4Array5 = Static96.method1798(Static122.aClass45_1381, Static112.aClass29_Sub1_48, Static78.aClass45_929);
			} else {
				local17++;
			}
			if (Static107.aClass5_Sub2_Sub6_Sub3Array8 == null) {
				Static107.aClass5_Sub2_Sub6_Sub3Array8 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static14.aClass45_203);
			} else {
				local17++;
			}
			if (Static39.aClass5_Sub2_Sub6_Sub3Array4 == null) {
				Static39.aClass5_Sub2_Sub6_Sub3Array4 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static97.aClass45_1120);
			} else {
				local17++;
			}
			if (Static52.aClass5_Sub2_Sub6_Sub3Array12 == null) {
				Static52.aClass5_Sub2_Sub6_Sub3Array12 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static93.aClass45_1084);
			} else {
				local17++;
			}
			if (Static117.aClass5_Sub2_Sub6_Sub3Array10 == null) {
				Static117.aClass5_Sub2_Sub6_Sub3Array10 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static21.aClass45_317);
			} else {
				local17++;
			}
			if (Static80.aClass5_Sub2_Sub6_Sub3Array6 == null) {
				Static80.aClass5_Sub2_Sub6_Sub3Array6 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static14.aClass45_205);
			} else {
				local17++;
			}
			if (Static81.aClass5_Sub2_Sub6_Sub3_1 == null) {
				Static81.aClass5_Sub2_Sub6_Sub3_1 = Static117.method2123(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static51.aClass45_648);
			} else {
				local17++;
			}
			if (Static72.aClass5_Sub2_Sub6_Sub3Array5 == null) {
				Static72.aClass5_Sub2_Sub6_Sub3Array5 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static8.aClass45_109);
			} else {
				local17++;
			}
			if (Static97.aClass5_Sub2_Sub6_Sub3Array7 == null) {
				Static97.aClass5_Sub2_Sub6_Sub3Array7 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static32.aClass45_458);
			} else {
				local17++;
			}
			if (Static110.aClass5_Sub2_Sub6_Sub3Array9 == null) {
				Static110.aClass5_Sub2_Sub6_Sub3Array9 = Static84.method1589(Static78.aClass45_929, Static112.aClass29_Sub1_48, Static11.aClass45_174);
			} else {
				local17++;
			}
			if (Static96.aClass5_Sub2_Sub6_Sub4Array4 == null) {
				Static96.aClass5_Sub2_Sub6_Sub4Array4 = Static96.method1798(Static25.aClass45_386, Static112.aClass29_Sub1_48, Static78.aClass45_929);
			} else {
				local17++;
			}
			if (Static14.aClass5_Sub2_Sub6_Sub4Array1 == null) {
				Static14.aClass5_Sub2_Sub6_Sub4Array1 = Static96.method1798(Static54.aClass45_653, Static112.aClass29_Sub1_48, Static78.aClass45_929);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static117.aClass45_1340, Static76.method1476(local17 * 100 / 14), Static99.aClass45_1140 });
				Static31.anInt926 = 70;
			} else {
				Static85.aClass5_Sub2_Sub6_Sub3_3.method1775();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 21.0D) - 10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				local77 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(931) int local931 = 0; local931 < Static107.aClass5_Sub2_Sub6_Sub3Array8.length; local931++) {
					Static107.aClass5_Sub2_Sub6_Sub3Array8[local931].method1782(local77 + local59, local67 + local77, local77 + local73);
				}
				Static97.aClass5_Sub2_Sub6_Sub4Array5[0].method1876(local59 + local77, local67 + local77, local73 + local77);
				Static31.anInt926 = 70;
				Static40.aClass45_517 = Static111.aClass45_1273;
				Static117.anInt3061 = 85;
			}
		} else if (Static117.anInt3061 == 85) {
			local17 = Static104.method1904(Static112.aClass29_Sub1_48);
			local59 = Static110.method1985();
			if (local59 > local17) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static4.aClass45_37, Static76.method1476(local17 * 100 / local59), Static99.aClass45_1140 });
				Static31.anInt926 = 80;
			} else {
				Static31.anInt926 = 80;
				Static117.anInt3061 = 90;
				Static40.aClass45_517 = Static17.aClass45_247;
			}
		} else if (Static117.anInt3061 == 90) {
			if (Static6.aClass29_Sub1_4.method759()) {
				@Pc(1070) Class57 local1070 = new Class57(Static6.aClass29_Sub1_4, Static112.aClass29_Sub1_48, 20, 0.8D, Static103.aBoolean122 ? 64 : 128);
				Static86.method1664(local1070);
				Static86.method1667(0.8D);
				Static117.anInt3061 = 110;
				Static31.anInt926 = 90;
				Static40.aClass45_517 = Static23.aClass45_377;
			} else {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static122.aClass45_1389, Static76.method1476(Static6.aClass29_Sub1_4.method764()), Static99.aClass45_1140 });
				Static31.anInt926 = 90;
			}
		} else if (Static117.anInt3061 == 110) {
			Static68.aClass1_1 = new Class1();
			Static96.aClass77_3.method2166(Static68.aClass1_1, 10);
			Static117.anInt3061 = 120;
			Static40.aClass45_517 = Static42.aClass45_398;
			Static31.anInt926 = 94;
		} else if (Static117.anInt3061 == 120) {
			if (Static36.aClass29_Sub1_15.method736(Static78.aClass45_929, Static101.aClass45_485)) {
				@Pc(1137) Class48 local1137 = new Class48(Static36.aClass29_Sub1_15.method735(Static78.aClass45_929, Static101.aClass45_485));
				Static102.method1892(local1137);
				Static31.anInt926 = 96;
				Static40.aClass45_517 = Static28.aClass45_426;
				Static117.anInt3061 = 130;
			} else {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static52.aClass45_1372, Static4.aClass45_38 });
				Static31.anInt926 = 96;
			}
		} else if (Static117.anInt3061 == 130) {
			if (!Static48.aClass29_Sub1_22.method759()) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static107.aClass45_1227, Static76.method1476(Static48.aClass29_Sub1_22.method764() * 4 / 5), Static99.aClass45_1140 });
				Static31.anInt926 = 100;
			} else if (!Static71.aClass29_Sub1_32.method759()) {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static107.aClass45_1227, Static76.method1476(Static71.aClass29_Sub1_32.method764() / 6 + 80), Static99.aClass45_1140 });
				Static31.anInt926 = 100;
			} else if (Static92.aClass29_Sub1_50.method759()) {
				Static31.anInt926 = 100;
				Static117.anInt3061 = 140;
				Static40.aClass45_517 = Static121.aClass45_1011;
			} else {
				Static40.aClass45_517 = Static39.method1443(new Class45[] { Static107.aClass45_1227, Static76.method1476(Static92.aClass29_Sub1_50.method764() / 20 + 96), Static99.aClass45_1140 });
				Static31.anInt926 = 100;
			}
		} else if (Static117.anInt3061 == 140) {
			Static39.method1422(10);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method628(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static37.method789(local18) : local18;
		} else if (arg1 instanceof Class24) {
			@Pc(32) Class24 local32 = (Class24) arg1;
			return local32.method677();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!j;III)V")
	public static void method629(@OriginalArg(1) Class5_Sub2_Sub4_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1 == arg0 || Static14.anInt426 >= 400) {
			return;
		}
		@Pc(55) Class45 local55;
		if (arg0.anInt1584 == 0) {
			local55 = Static39.method1443(new Class45[] { arg0.aClass45_629, Static70.method1359(arg0.anInt1569, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1569), Static61.aClass45_762, Static44.aClass45_546, Static76.method1476(arg0.anInt1569), Static98.aClass45_1123 });
		} else {
			local55 = Static39.method1443(new Class45[] { arg0.aClass45_629, Static61.aClass45_762, Static3.aClass45_34, Static76.method1476(arg0.anInt1584), Static98.aClass45_1123 });
		}
		@Pc(157) int local157;
		if (Static16.anInt502 == 1) {
			Static108.method1945(arg3, 29, Static39.method1443(new Class45[] { Static12.aClass45_1357, Static46.aClass45_563, local55 }), arg2, arg1, Static117.aClass45_1345);
		} else if (!Static13.aBoolean12) {
			for (local157 = 4; local157 >= 0; local157--) {
				if (Static11.aClass45Array3[local157] != null) {
					@Pc(168) short local168 = 0;
					if (Static11.aClass45Array3[local157].method1330(Static25.aClass45_387)) {
						if (arg0.anInt1569 > Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1569) {
							local168 = 2000;
						}
						if (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1577 != 0 && arg0.anInt1577 != 0) {
							if (arg0.anInt1577 == Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1577) {
								local168 = 2000;
							} else {
								local168 = 0;
							}
						}
					} else if (Static37.aBooleanArray11[local157]) {
						local168 = 2000;
					}
					@Pc(214) int local214 = 0;
					if (local157 == 0) {
						local214 = local168 + 52;
					}
					if (local157 == 1) {
						local214 = local168 + 4;
					}
					if (local157 == 2) {
						local214 = local168 + 20;
					}
					if (local157 == 3) {
						local214 = local168 + 17;
					}
					if (local157 == 4) {
						local214 = local168 + 8;
					}
					Static108.method1945(arg3, local214, Static39.method1443(new Class45[] { Static39.aClass45_886, local55 }), arg2, arg1, Static11.aClass45Array3[local157]);
				}
			}
		} else if ((Static101.anInt1044 & 0x8) == 8) {
			Static108.method1945(arg3, 47, Static39.method1443(new Class45[] { Static3.aClass45_32, Static46.aClass45_563, local55 }), arg2, arg1, Static31.aClass45_445);
		}
		for (local157 = 0; local157 < Static14.anInt426; local157++) {
			if (Static2.anIntArray5[local157] == 48) {
				Static35.aClass45Array10[local157] = Static39.method1443(new Class45[] { Static46.aClass45_564, Static74.aClass45_1047, Static39.aClass45_886, local55 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method630() {
		anIntArray151 = null;
		aClass45_434 = null;
		aClass45_432 = null;
		aClass45_433 = null;
		aClass29_Sub1Array1 = null;
		aClass5_Sub2_Sub6_Sub4_19 = null;
		aClass45_431 = null;
		aClass45_430 = null;
		aClass45_429 = null;
		aClass45_435 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method632() {
		if (Static28.anInt881 == 1 && Static67.anInt1906 >= 715 && Static36.anInt1063 >= 453) {
			Static30.aBoolean19 = !Static30.aBoolean19;
			if (Static30.aBoolean19) {
				Static77.method1482();
			} else {
				Static46.method979(Static23.aClass45_373, Static40.aClass45_520, Static21.aClass29_Sub1_11);
			}
			Static59.method1208();
		}
		if (Static121.anInt2385 == 5) {
			return;
		}
		Static93.method1724();
		if (Static121.anInt2385 != 10) {
			return;
		}
		@Pc(55) int local55 = Static28.anInt881;
		@Pc(59) int local59 = Static36.anInt1063 - 171;
		@Pc(63) int local63 = Static67.anInt1906 - 202;
		if (Static92.anInt3054 == 0) {
			if (local55 == 1 && local63 >= 25 && local63 <= 175 && local59 >= 100 && local59 <= 140) {
				Static92.anInt3054 = 3;
				Static75.anInt2185 = 0;
			}
			if (local55 != 1 || local63 < 185 || local63 > 335 || local59 < 100 || local59 > 140) {
				return;
			}
			Static40.aClass45_515 = Static14.aClass45_204;
			Static40.aClass45_524 = Static61.aClass45_736;
			Static40.aClass45_529 = Static61.aClass45_749;
			Static75.anInt2185 = 0;
			Static92.anInt3054 = 2;
			return;
		}
		if (Static92.anInt3054 == 2) {
			@Pc(70) byte local70 = 60;
			@Pc(73) int local73 = local70 + 30;
			if (local55 == 1 && local59 >= 75 && local59 < 90) {
				Static75.anInt2185 = 0;
			}
			local73 += 15;
			if (local55 == 1 && local59 >= 90 && local59 < 105) {
				Static75.anInt2185 = 1;
			}
			local73 += 15;
			if (local55 == 1 && local63 >= 25 && local63 <= 175 && local59 >= 130 && local59 <= 170) {
				Static40.aClass45_518 = Static40.aClass45_518.method1315().method1303();
				Static4.method71(Static61.aClass45_751, Static61.aClass45_725, Static55.aClass45_675);
				Static39.method1422(20);
				return;
			}
			if (local55 == 1 && local63 >= 185 && local63 <= 335 && local59 >= 130 && local59 <= 170) {
				Static40.aClass45_518 = Static40.aClass45_520;
				Static92.anInt3054 = 0;
				Static40.aClass45_525 = Static40.aClass45_520;
			}
			while (true) {
				@Pc(210) boolean local210;
				label157: do {
					while (Static117.method2126()) {
						local210 = false;
						for (@Pc(212) int local212 = 0; local212 < Static80.aClass45_952.method1317(); local212++) {
							if (Static25.anInt792 == Static80.aClass45_952.method1324(local212)) {
								local210 = true;
								break;
							}
						}
						if (Static75.anInt2185 != 0) {
							continue label157;
						}
						if (Static47.anInt1349 == 85 && Static40.aClass45_518.method1317() > 0) {
							Static40.aClass45_518 = Static40.aClass45_518.method1322(Static40.aClass45_518.method1317() - 1, 0);
						}
						if (Static47.anInt1349 == 84 || Static47.anInt1349 == 80) {
							Static75.anInt2185 = 1;
						}
						if (local210 && Static40.aClass45_518.method1317() < 12) {
							Static40.aClass45_518 = Static40.aClass45_518.method1326(Static25.anInt792);
						}
					}
					return;
				} while (Static75.anInt2185 != 1);
				if (Static47.anInt1349 == 85 && Static40.aClass45_525.method1317() > 0) {
					Static40.aClass45_525 = Static40.aClass45_525.method1322(Static40.aClass45_525.method1317() - 1, 0);
				}
				if (Static47.anInt1349 == 84 || Static47.anInt1349 == 80) {
					Static75.anInt2185 = 0;
				}
				if (local210 && Static40.aClass45_525.method1317() < 20) {
					Static40.aClass45_525 = Static40.aClass45_525.method1326(Static25.anInt792);
				}
			}
		}
		if (Static92.anInt3054 == 3 && local55 == 1 && local63 >= 105 && local63 <= 255 && local59 >= 130 && local59 <= 170) {
			Static92.anInt3054 = 0;
			return;
		}
	}
}
