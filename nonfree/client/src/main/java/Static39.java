import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!ja;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "Z")
	private static boolean aBoolean19;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!mc;")
	public static Class42 aClass42_239 = Static23.method501("");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_230 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt416 = 78;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_235 = Static23.method501("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_231 = aClass42_235;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!mc;")
	public static Class42 aClass42_232 = Static23.method501("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_233 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Lclient!mc;")
	private static Class42 aClass42_237 = Static23.method501("Login limit exceeded)3");

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_234 = aClass42_237;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_236 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!mc;")
	public static Class42 aClass42_238 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!mc;")
	public static Class42 aClass42_240 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_241 = Static23.method501("auf der Hautpseite)3");

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_242 = aClass42_239;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method302() {
		aClass42_233 = null;
		aClass33_4 = null;
		aClass42_237 = null;
		aClass42_232 = null;
		aClass42_239 = null;
		aClass42_242 = null;
		aClass42_236 = null;
		aClass42_231 = null;
		aClass42_234 = null;
		aClass42_240 = null;
		aClass42_241 = null;
		anIntArray37 = null;
		aClass42_230 = null;
		aClass42_235 = null;
		aClass42_238 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Lclient!db;")
	public static Class1_Sub1_Sub4 method304(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static84.aClass37_22.method982((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass33_4.method1305(arg0, 4);
		local10 = new Class1_Sub1_Sub4();
		if (local20 != null) {
			local10.method399(arg0, new Class1_Sub8(local20));
		}
		local10.method401();
		Static84.aClass37_22.method981((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method308() {
		Static98.aClass1_Sub8_Sub1_3.method1236(11);
		if (Static29.anInt819 != -1) {
			Static59.method1418(Static29.anInt819);
			Static23.aBoolean33 = true;
			Static29.anInt819 = -1;
			Static62.aBoolean87 = false;
			Static89.aBoolean132 = true;
		}
		if (Static108.anInt2745 != -1) {
			Static59.method1418(Static108.anInt2745);
			Static28.aBoolean41 = true;
			Static62.aBoolean87 = false;
			Static108.anInt2745 = -1;
		}
		if (Static43.anInt1144 != -1) {
			Static59.method1418(Static43.anInt1144);
			Static43.anInt1144 = -1;
			Static12.method278(30);
		}
		if (Static57.anInt2701 != -1) {
			Static59.method1418(Static57.anInt2701);
			Static57.anInt2701 = -1;
		}
		if (Static108.anInt2743 != -1) {
			Static59.method1418(Static108.anInt2743);
			Static108.anInt2743 = -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
	public static void method316() {
		@Pc(20) int local20;
		if (Static108.anInt2747 == 0) {
			Static88.aClass20_1 = new Class20(4, 104, 104, Static10.anIntArrayArrayArray1);
			for (local20 = 0; local20 < 4; local20++) {
				Static91.aClass6Array1[local20] = new Class6(104, 104);
			}
			Static89.aClass1_Sub1_Sub1_Sub1_12 = new Class1_Sub1_Sub1_Sub1(512, 512);
			Static108.anInt2747 = 20;
			Static51.anInt1376 = 5;
			aClass42_230 = Static64.aClass42_830;
			return;
		}
		@Pc(59) int local59;
		@Pc(70) int local70;
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (Static108.anInt2747 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local70 = local59 * 32 + 128 + 15;
				local76 = local70 * 3 + 600;
				local80 = Class1_Sub1_Sub1_Sub2.anIntArray144[local70];
				local57[local59] = local80 * local76 >> 16;
			}
			Static22.method495(local57);
			Static51.anInt1376 = 10;
			Static108.anInt2747 = 30;
			aClass42_230 = Static95.aClass42_1327;
		} else if (Static108.anInt2747 == 30) {
			Static59.aClass33_Sub1_15 = Static7.method154(true, false, 0, true);
			Static24.aClass33_Sub1_9 = Static7.method154(true, false, 1, true);
			Static103.aClass33_Sub1_20 = Static7.method154(false, true, 2, true);
			Static93.aClass33_Sub1_19 = Static7.method154(true, false, 3, true);
			Static7.aClass33_Sub1_1 = Static7.method154(true, false, 4, true);
			Static33.aClass33_Sub1_11 = Static7.method154(true, true, 5, true);
			Static7.aClass33_Sub1_2 = Static7.method154(true, true, 6, false);
			Static38.aClass33_Sub1_12 = Static7.method154(true, false, 7, true);
			Static8.aClass33_Sub1_5 = Static7.method154(true, false, 8, true);
			Static47.aClass33_Sub1_18 = Static7.method154(true, false, 9, true);
			Static25.aClass33_Sub1_10 = Static7.method154(true, false, 10, true);
			Static83.aClass33_Sub1_16 = Static7.method154(true, false, 11, true);
			Static51.anInt1376 = 20;
			aClass42_230 = Static33.aClass42_455;
			Static108.anInt2747 = 40;
		} else if (Static108.anInt2747 == 40) {
			local20 = Static59.aClass33_Sub1_15.method1325() * 5 / 100;
			local20 += Static24.aClass33_Sub1_9.method1325() * 5 / 100;
			local20 += Static103.aClass33_Sub1_20.method1325() * 5 / 100;
			local20 += Static93.aClass33_Sub1_19.method1325() * 5 / 100;
			local20 += Static7.aClass33_Sub1_1.method1325() * 5 / 100;
			local20 += Static33.aClass33_Sub1_11.method1325() * 5 / 100;
			local20 += Static7.aClass33_Sub1_2.method1325() * 5 / 100;
			local20 += Static38.aClass33_Sub1_12.method1325() * 45 / 100;
			local20 += Static8.aClass33_Sub1_5.method1325() * 5 / 100;
			local20 += Static47.aClass33_Sub1_18.method1325() * 5 / 100;
			local20 += Static25.aClass33_Sub1_10.method1325() * 5 / 100;
			local20 += Static83.aClass33_Sub1_16.method1325() * 5 / 100;
			if (local20 == 100) {
				Static108.anInt2747 = 45;
				aClass42_230 = Static3.aClass42_86;
				Static51.anInt1376 = 30;
			} else {
				if (local20 != 0) {
					aClass42_230 = Static57.method1822(new Class42[] { Static7.aClass42_118, Static38.method642(local20), Static25.aClass42_392 });
				}
				Static51.anInt1376 = 30;
			}
		} else if (Static108.anInt2747 == 45) {
			Static51.method966(!Static75.aBoolean85, Static64.aClass60_3);
			Static91.aClass1_Sub12_Sub1_1 = Static29.method566(Static89.aCanvas1, Static64.aClass60_3);
			Static27.aClass16_1 = new Class16(22050, Static7.anInt234);
			Static108.anInt2747 = 50;
			Static51.anInt1376 = 35;
			aClass42_230 = Static70.aClass42_915;
		} else if (Static108.anInt2747 == 50) {
			local20 = 0;
			if (Static37.aClass1_Sub1_Sub1_Sub3_2 == null) {
				Static37.aClass1_Sub1_Sub1_Sub3_2 = Static80.method1483(Static15.aClass42_299, Static11.aClass42_195, Static8.aClass33_Sub1_5);
			} else {
				local20++;
			}
			if (Static95.aClass1_Sub1_Sub1_Sub3_3 == null) {
				Static95.aClass1_Sub1_Sub1_Sub3_3 = Static80.method1483(Static28.aClass42_430, Static11.aClass42_195, Static8.aClass33_Sub1_5);
			} else {
				local20++;
			}
			if (Static3.aClass1_Sub1_Sub1_Sub3_1 == null) {
				Static3.aClass1_Sub1_Sub1_Sub3_1 = Static80.method1483(Static19.aClass42_348, Static11.aClass42_195, Static8.aClass33_Sub1_5);
			} else {
				local20++;
			}
			if (local20 < 3) {
				aClass42_230 = Static57.method1822(new Class42[] { Static2.aClass42_70, Static38.method642(local20 * 100 / 3), Static25.aClass42_392 });
				Static51.anInt1376 = 40;
			} else {
				Static51.anInt1376 = 40;
				Static108.anInt2747 = 60;
				aClass42_230 = Static23.aClass42_377;
			}
		} else if (Static108.anInt2747 == 60) {
			local20 = Static27.method543(Static25.aClass33_Sub1_10, Static8.aClass33_Sub1_5);
			local59 = Static33.method576();
			if (local59 > local20) {
				aClass42_230 = Static57.method1822(new Class42[] { Static20.aClass42_355, Static38.method642(local20 * 100 / local59), Static25.aClass42_392 });
				Static51.anInt1376 = 50;
			} else {
				Static51.anInt1376 = 50;
				aClass42_230 = Static50.aClass42_892;
				Static12.method278(5);
				Static108.anInt2747 = 70;
			}
		} else if (Static108.anInt2747 == 70) {
			if (Static103.aClass33_Sub1_20.method1309()) {
				Static73.method1331(Static103.aClass33_Sub1_20);
				Static28.method562(Static103.aClass33_Sub1_20);
				Static48.method857(Static38.aClass33_Sub1_12, Static103.aClass33_Sub1_20);
				Static34.method591(Static103.aClass33_Sub1_20, Static38.aClass33_Sub1_12, Static75.aBoolean85);
				Static62.method1035(Static38.aClass33_Sub1_12, Static103.aClass33_Sub1_20);
				Static98.method1711(Static103.aClass33_Sub1_20, Static38.aClass33_Sub1_12, Static90.aBoolean133);
				Static83.method1519(Static103.aClass33_Sub1_20, Static24.aClass33_Sub1_9, Static59.aClass33_Sub1_15);
				Static89.method1643(Static103.aClass33_Sub1_20, Static38.aClass33_Sub1_12);
				Static59.method1429(Static103.aClass33_Sub1_20);
				Static106.method1846(Static103.aClass33_Sub1_20);
				Static87.method1576(Static93.aClass33_Sub1_19, Static8.aClass33_Sub1_5, Static38.aClass33_Sub1_12);
				aClass42_230 = Static31.aClass42_1210;
				Static51.anInt1376 = 60;
				Static108.anInt2747 = 80;
			} else {
				aClass42_230 = Static57.method1822(new Class42[] { Static93.aClass42_1316, Static38.method642(Static103.aClass33_Sub1_20.method1328()), Static25.aClass42_392 });
				Static51.anInt1376 = 60;
			}
		} else if (Static108.anInt2747 == 80) {
			local20 = 0;
			if (Static28.aClass1_Sub1_Sub1_Sub1_1 == null) {
				Static28.aClass1_Sub1_Sub1_Sub1_1 = Static87.method1580(Static67.aClass42_860, Static8.aClass33_Sub1_5, Static11.aClass42_195);
			} else {
				local20++;
			}
			if (Static63.aClass1_Sub1_Sub1_Sub1_5 == null) {
				Static63.aClass1_Sub1_Sub1_Sub1_5 = Static87.method1580(Static82.aClass42_1169, Static8.aClass33_Sub1_5, Static11.aClass42_195);
			} else {
				local20++;
			}
			if (Static81.aClass1_Sub1_Sub1_Sub4Array5 == null) {
				Static81.aClass1_Sub1_Sub1_Sub4Array5 = Static77.method1415(Static8.aClass33_Sub1_5, Static11.aClass42_195, Static35.aClass42_483);
			} else {
				local20++;
			}
			if (Static108.aClass1_Sub1_Sub1_Sub1Array47 == null) {
				Static108.aClass1_Sub1_Sub1_Sub1Array47 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static75.aClass42_761);
			} else {
				local20++;
			}
			if (Static107.aClass1_Sub1_Sub1_Sub1Array45 == null) {
				Static107.aClass1_Sub1_Sub1_Sub1Array45 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static5.aClass42_95);
			} else {
				local20++;
			}
			if (Static82.aClass1_Sub1_Sub1_Sub1Array34 == null) {
				Static82.aClass1_Sub1_Sub1_Sub1Array34 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static57.aClass42_1421);
			} else {
				local20++;
			}
			if (Static90.aClass1_Sub1_Sub1_Sub1Array39 == null) {
				Static90.aClass1_Sub1_Sub1_Sub1Array39 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static2.aClass42_66);
			} else {
				local20++;
			}
			if (Static53.aClass1_Sub1_Sub1_Sub1Array46 == null) {
				Static53.aClass1_Sub1_Sub1_Sub1Array46 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static77.aClass42_1045);
			} else {
				local20++;
			}
			if (Static53.aClass1_Sub1_Sub1_Sub1_14 == null) {
				Static53.aClass1_Sub1_Sub1_Sub1_14 = Static87.method1580(Static101.aClass42_1393, Static8.aClass33_Sub1_5, Static11.aClass42_195);
			} else {
				local20++;
			}
			if (Static48.aClass1_Sub1_Sub1_Sub1Array19 == null) {
				Static48.aClass1_Sub1_Sub1_Sub1Array19 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static29.aClass42_441);
			} else {
				local20++;
			}
			if (Static42.aClass1_Sub1_Sub1_Sub1Array44 == null) {
				Static42.aClass1_Sub1_Sub1_Sub1Array44 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static42.aClass42_1381);
			} else {
				local20++;
			}
			if (Static29.aClass1_Sub1_Sub1_Sub1Array10 == null) {
				Static29.aClass1_Sub1_Sub1_Sub1Array10 = Static68.method1167(Static11.aClass42_195, Static8.aClass33_Sub1_5, Static19.aClass42_345);
			} else {
				local20++;
			}
			if (Static19.aClass1_Sub1_Sub1_Sub4Array1 == null) {
				Static19.aClass1_Sub1_Sub1_Sub4Array1 = Static77.method1415(Static8.aClass33_Sub1_5, Static11.aClass42_195, Static12.aClass42_211);
			} else {
				local20++;
			}
			if (Static90.aClass1_Sub1_Sub1_Sub4Array6 == null) {
				Static90.aClass1_Sub1_Sub1_Sub4Array6 = Static77.method1415(Static8.aClass33_Sub1_5, Static11.aClass42_195, Static84.aClass42_1205);
			} else {
				local20++;
			}
			if (local20 < 14) {
				aClass42_230 = Static57.method1822(new Class42[] { Static25.aClass42_391, Static38.method642(local20 * 100 / 14), Static25.aClass42_392 });
				Static51.anInt1376 = 70;
			} else {
				Static63.aClass1_Sub1_Sub1_Sub1_5.method75();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local76 = (int) (Math.random() * 21.0D) - 10;
				local80 = (int) (Math.random() * 41.0D) - 20;
				local70 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(844) int local844 = 0; local844 < Static108.aClass1_Sub1_Sub1_Sub1Array47.length; local844++) {
					Static108.aClass1_Sub1_Sub1_Sub1Array47[local844].method73(local59 + local80, local70 + local80, local80 + local76);
				}
				Static81.aClass1_Sub1_Sub1_Sub4Array5[0].method1143(local59 + local80, local80 + local70, local80 + local76);
				Static51.anInt1376 = 70;
				aClass42_230 = Static31.aClass42_1215;
				Static108.anInt2747 = 85;
			}
		} else if (Static108.anInt2747 == 85) {
			local20 = Static37.method625(Static8.aClass33_Sub1_5);
			local59 = Static17.method420();
			if (local59 > local20) {
				aClass42_230 = Static57.method1822(new Class42[] { Static10.aClass42_180, Static38.method642(local20 * 100 / local59), Static25.aClass42_392 });
				Static51.anInt1376 = 80;
			} else {
				Static108.anInt2747 = 90;
				aClass42_230 = Static88.aClass42_1255;
				Static51.anInt1376 = 80;
			}
		} else if (Static108.anInt2747 == 90) {
			if (Static47.aClass33_Sub1_18.method1309()) {
				@Pc(987) Class11 local987 = new Class11(Static47.aClass33_Sub1_18, Static8.aClass33_Sub1_5, 20, 0.8D, Static75.aBoolean85 ? 64 : 128);
				Static41.method680(local987);
				Static41.method685(0.8D);
				Static51.anInt1376 = 90;
				aClass42_230 = Static15.aClass42_300;
				Static108.anInt2747 = 110;
			} else {
				aClass42_230 = Static57.method1822(new Class42[] { Static95.aClass42_1326, Static38.method642(Static47.aClass33_Sub1_18.method1328()), Static25.aClass42_392 });
				Static51.anInt1376 = 90;
			}
		} else if (Static108.anInt2747 == 110) {
			Static33.aClass38_1 = new Class38();
			Static64.aClass60_3.method1807(Static33.aClass38_1, 10);
			aClass42_230 = Static42.aClass42_1387;
			Static108.anInt2747 = 120;
			Static51.anInt1376 = 94;
		} else if (Static108.anInt2747 == 120) {
			if (Static25.aClass33_Sub1_10.method1313(Static68.aClass42_878, Static11.aClass42_195)) {
				@Pc(1056) Class28 local1056 = new Class28(Static25.aClass33_Sub1_10.method1311(Static11.aClass42_195, Static68.aClass42_878));
				Static35.method600(local1056);
				Static51.anInt1376 = 96;
				Static108.anInt2747 = 130;
				aClass42_230 = Static24.aClass42_386;
			} else {
				aClass42_230 = Static57.method1822(new Class42[] { Static28.aClass42_428, Static45.aClass42_955 });
				Static51.anInt1376 = 96;
			}
		} else if (Static108.anInt2747 == 130) {
			if (Static93.aClass33_Sub1_19.method1309()) {
				Static108.anInt2747 = 140;
				Static51.anInt1376 = 100;
				aClass42_230 = Static23.aClass42_376;
			} else {
				aClass42_230 = Static57.method1822(new Class42[] { Static43.aClass42_615, Static38.method642(Static93.aClass33_Sub1_19.method1328()), Static25.aClass42_392 });
				Static51.anInt1376 = 100;
			}
		} else if (Static108.anInt2747 == 140) {
			Static12.method278(10);
		}
	}
}
