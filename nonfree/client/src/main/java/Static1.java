import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Jc", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!a", name = "Mc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_26 = Static108.method1915("(Udns");

	@OriginalMember(owner = "client!a", name = "yb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_32 = Static108.method1915("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_27 = aClass39_32;

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_28 = Static108.method1915("Verbindung mit");

	@OriginalMember(owner = "client!a", name = "pb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_29 = Static108.method1915("Select");

	@OriginalMember(owner = "client!a", name = "rb", descriptor = "I")
	public static int anInt59 = 0;

	@OriginalMember(owner = "client!a", name = "sb", descriptor = "[I")
	public static int[] anIntArray10 = new int[25];

	@OriginalMember(owner = "client!a", name = "vb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_31 = Static108.method1915("title_mute");

	@OriginalMember(owner = "client!a", name = "zb", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!a", name = "fc", descriptor = "Lclient!ie;")
	public static Class31 aClass31_4 = new Class31();

	@OriginalMember(owner = "client!a", name = "rc", descriptor = "[I")
	public static int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!a", name = "sc", descriptor = "I")
	public static int anInt90 = -1;

	@OriginalMember(owner = "client!a", name = "Tc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_36 = aClass39_29;

	@OriginalMember(owner = "client!a", name = "gd", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!a", name = "vd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_39 = Static108.method1915("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method37() {
		aClass39_29 = null;
		aClass39_32 = null;
		aClass39_27 = null;
		aByteArrayArrayArray1 = null;
		aClass39_28 = null;
		aClass39_26 = null;
		aClass39_31 = null;
		aFrame1 = null;
		anIntArray10 = null;
		aClass31_4 = null;
		aClass39_36 = null;
		anIntArray13 = null;
		aClass39_39 = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IB)Z")
	public static boolean method43(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static void method44() {
		Static105.anInt2670 = -1;
		Static48.anInt1316 = 0;
		Static72.anInt1801 = 0;
		Static103.aClass1_Sub18_Sub1_5.anInt3078 = 0;
		Static49.anInt1372 = 0;
		Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
		Static13.aBoolean47 = false;
		Static20.anInt729 = -1;
		Static55.anInt1505 = -1;
		Static35.anInt1069 = 0;
		Static110.anInt2795 = 0;
		Static122.anInt2981 = 0;
		Static121.anInt2967 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1.length; local40++) {
			if (Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local40] != null) {
				Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local40].anInt2510 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local62++) {
			if (Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local62] != null) {
				Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local62].anInt2510 = -1;
			}
		}
		Static57.method1031();
		Static41.method2108(30);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method45() {
		@Pc(20) int local20;
		if (Static23.anInt812 == 0) {
			Static32.aClass5_2 = new Class5(4, 104, 104, Static51.anIntArrayArrayArray6);
			for (local20 = 0; local20 < 4; local20++) {
				Static62.aClass23Array2[local20] = new Class23(104, 104);
			}
			Static34.aClass1_Sub1_Sub4_Sub4_3 = new Class1_Sub1_Sub4_Sub4(512, 512);
			Static23.anInt812 = 20;
			Static99.anInt2441 = 5;
			Static38.aClass39_542 = Static39.aClass39_547;
			return;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static23.anInt812 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local65 = local57 * 32 + 143;
				local71 = local65 * 3 + 600;
				local75 = Class1_Sub1_Sub4_Sub2.anIntArray138[local65];
				local55[local57] = local75 * local71 >> 16;
			}
			Static7.method144(local55);
			Static23.anInt812 = 30;
			Static38.aClass39_542 = Static63.aClass39_824;
			Static99.anInt2441 = 10;
		} else if (Static23.anInt812 == 30) {
			Static40.aClass62_Sub1_32 = Static37.method668(true, true, 0, false);
			Static129.aClass62_Sub1_77 = Static37.method668(true, true, 1, false);
			Static31.aClass62_Sub1_26 = Static37.method668(false, true, 2, true);
			Static34.aClass62_Sub1_28 = Static37.method668(true, true, 3, false);
			Static103.aClass62_Sub1_66 = Static37.method668(true, true, 4, false);
			Static126.aClass62_Sub1_75 = Static37.method668(true, true, 5, true);
			Static77.aClass62_Sub1_53 = Static37.method668(true, false, 6, true);
			Static120.aClass62_Sub1_76 = Static37.method668(true, true, 7, false);
			Static4.aClass62_Sub1_7 = Static37.method668(true, true, 8, false);
			Static35.aClass62_Sub1_29 = Static37.method668(true, true, 9, false);
			Static9.aClass62_Sub1_73 = Static37.method668(true, true, 10, false);
			Static29.aClass62_Sub1_24 = Static37.method668(true, true, 11, false);
			Static75.aClass62_Sub1_50 = Static37.method668(true, true, 12, false);
			Static68.aClass62_Sub1_47 = Static37.method668(false, true, 13, true);
			Static20.aClass62_Sub1_18 = Static37.method668(true, false, 14, false);
			Static57.aClass62_Sub1_42 = Static37.method668(true, true, 15, false);
			Static23.anInt812 = 40;
			Static38.aClass39_542 = Static102.aClass39_1250;
			Static99.anInt2441 = 20;
		} else if (Static23.anInt812 == 40) {
			local20 = Static40.aClass62_Sub1_32.method2023() * 4 / 100;
			local20 += Static129.aClass62_Sub1_77.method2023() * 4 / 100;
			local20 += Static31.aClass62_Sub1_26.method2023() * 2 / 100;
			local20 += Static34.aClass62_Sub1_28.method2023() * 2 / 100;
			local20 += Static103.aClass62_Sub1_66.method2023() * 6 / 100;
			local20 += Static126.aClass62_Sub1_75.method2023() * 4 / 100;
			local20 += Static77.aClass62_Sub1_53.method2023() * 2 / 100;
			local20 += Static120.aClass62_Sub1_76.method2023() * 60 / 100;
			local20 += Static4.aClass62_Sub1_7.method2023() * 2 / 100;
			local20 += Static35.aClass62_Sub1_29.method2023() * 2 / 100;
			local20 += Static9.aClass62_Sub1_73.method2023() * 2 / 100;
			local20 += Static29.aClass62_Sub1_24.method2023() * 2 / 100;
			local20 += Static75.aClass62_Sub1_50.method2023() * 2 / 100;
			local20 += Static68.aClass62_Sub1_47.method2023() * 2 / 100;
			local20 += Static20.aClass62_Sub1_18.method2023() * 2 / 100;
			local20 += Static57.aClass62_Sub1_42.method2023() * 2 / 100;
			if (local20 == 100) {
				Static99.anInt2441 = 30;
				Static38.aClass39_542 = Static90.aClass39_1075;
				Static23.anInt812 = 45;
			} else {
				if (local20 != 0) {
					Static38.aClass39_542 = Static30.method601(new Class39[] { Static73.aClass39_898, Static69.method1226(local20), Static22.aClass39_380 });
				}
				Static99.anInt2441 = 30;
			}
		} else if (Static23.anInt812 == 45) {
			Static116.method1990(!Static68.aBoolean149);
			@Pc(462) Class1_Sub8_Sub4 local462 = new Class1_Sub8_Sub4();
			local462.method1773();
			Static65.aClass26_2 = Static71.method1247(Static16.aCanvas10, 22050, Static92.aClass79_2, 0);
			Static65.aClass26_2.method1927(local462);
			Static117.method2027(Static20.aClass62_Sub1_18, local462, Static103.aClass62_Sub1_66, Static57.aClass62_Sub1_42);
			Static19.aClass26_1 = Static71.method1247(Static16.aCanvas10, 2048, Static92.aClass79_2, 1);
			Static19.aClass1_Sub8_Sub3_1 = new Class1_Sub8_Sub3();
			Static19.aClass26_1.method1927(Static19.aClass1_Sub8_Sub3_1);
			Static93.aClass24_1 = new Class24(22050, Static44.anInt1243);
			Static23.anInt812 = 50;
			Static99.anInt2441 = 35;
			Static38.aClass39_542 = Static53.aClass39_705;
		} else if (Static23.anInt812 == 50) {
			local20 = 0;
			if (Static97.aClass1_Sub1_Sub4_Sub3_5 == null) {
				Static97.aClass1_Sub1_Sub4_Sub3_5 = Static107.method1885(Static35.aClass39_501, Static8.aClass39_147, Static4.aClass62_Sub1_7);
			} else {
				local20++;
			}
			if (Static93.aClass1_Sub1_Sub4_Sub3_3 == null) {
				Static93.aClass1_Sub1_Sub4_Sub3_3 = Static107.method1885(Static57.aClass39_758, Static8.aClass39_147, Static4.aClass62_Sub1_7);
			} else {
				local20++;
			}
			if (Static53.aClass1_Sub1_Sub4_Sub3_1 == null) {
				Static53.aClass1_Sub1_Sub4_Sub3_1 = Static107.method1885(Static86.aClass39_1038, Static8.aClass39_147, Static4.aClass62_Sub1_7);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static91.aClass39_1081, Static69.method1226(local20 * 100 / 3), Static22.aClass39_380 });
				Static99.anInt2441 = 40;
			} else {
				Static23.anInt812 = 60;
				Static38.aClass39_542 = Static70.aClass39_875;
				Static99.anInt2441 = 40;
			}
		} else if (Static23.anInt812 == 60) {
			local20 = Static68.method1214(Static9.aClass62_Sub1_73, Static4.aClass62_Sub1_7);
			local57 = Static89.method1474();
			if (local57 > local20) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static18.aClass39_322, Static69.method1226(local20 * 100 / local57), Static22.aClass39_380 });
				Static99.anInt2441 = 50;
			} else {
				Static38.aClass39_542 = Static20.aClass39_349;
				Static99.anInt2441 = 50;
				Static41.method2108(5);
				Static23.anInt812 = 70;
			}
		} else if (Static23.anInt812 == 70) {
			if (Static31.aClass62_Sub1_26.method2001()) {
				Static48.method832(Static31.aClass62_Sub1_26);
				Static24.method453(Static31.aClass62_Sub1_26);
				Static58.method1043(Static120.aClass62_Sub1_76, Static31.aClass62_Sub1_26);
				Static9.method2068(Static120.aClass62_Sub1_76, Static31.aClass62_Sub1_26, Static68.aBoolean149);
				Static90.method1480(Static120.aClass62_Sub1_76, Static31.aClass62_Sub1_26);
				Static88.method1468(Static120.aClass62_Sub1_76, Static46.aBoolean224, Static97.aClass1_Sub1_Sub4_Sub3_5, Static31.aClass62_Sub1_26);
				Static55.method997(Static129.aClass62_Sub1_77, Static40.aClass62_Sub1_32, Static31.aClass62_Sub1_26);
				Static58.method1040(Static31.aClass62_Sub1_26, Static120.aClass62_Sub1_76);
				Static87.method1425(Static31.aClass62_Sub1_26);
				Static129.method2212(Static31.aClass62_Sub1_26);
				Static107.method1890(Static4.aClass62_Sub1_7, Static34.aClass62_Sub1_28, Static120.aClass62_Sub1_76);
				Static127.method2195(Static31.aClass62_Sub1_26);
				Static120.method2131(Static31.aClass62_Sub1_26);
				Static38.aClass39_542 = Static65.aClass39_838;
				Static23.anInt812 = 80;
				Static99.anInt2441 = 60;
			} else {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static8.aClass39_146, Static69.method1226(Static31.aClass62_Sub1_26.method2025()), Static22.aClass39_380 });
				Static99.anInt2441 = 60;
			}
		} else if (Static23.anInt812 == 80) {
			local20 = 0;
			if (Static67.aClass1_Sub1_Sub4_Sub4_4 == null) {
				Static67.aClass1_Sub1_Sub4_Sub4_4 = Static67.method1204(Static4.aClass62_Sub1_7, Static8.aClass39_147, Static64.aClass39_832);
			} else {
				local20++;
			}
			if (Static24.aClass1_Sub1_Sub4_Sub4_1 == null) {
				Static24.aClass1_Sub1_Sub4_Sub4_1 = Static67.method1204(Static4.aClass62_Sub1_7, Static8.aClass39_147, Static34.aClass39_490);
			} else {
				local20++;
			}
			if (Static122.aClass1_Sub1_Sub4_Sub1Array11 == null) {
				Static122.aClass1_Sub1_Sub4_Sub1Array11 = Static3.method72(Static4.aClass62_Sub1_7, Static67.aClass39_850, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static79.aClass1_Sub1_Sub4_Sub4Array11 == null) {
				Static79.aClass1_Sub1_Sub4_Sub4Array11 = Static117.method2020(Static2.aClass39_48, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static73.aClass1_Sub1_Sub4_Sub4Array8 == null) {
				Static73.aClass1_Sub1_Sub4_Sub4Array8 = Static117.method2020(Static35.aClass39_496, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static98.aClass1_Sub1_Sub4_Sub4Array10 == null) {
				Static98.aClass1_Sub1_Sub4_Sub4Array10 = Static117.method2020(Static12.aClass39_230, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static75.aClass1_Sub1_Sub4_Sub4Array9 == null) {
				Static75.aClass1_Sub1_Sub4_Sub4Array9 = Static117.method2020(Static95.aClass39_1396, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static29.aClass1_Sub1_Sub4_Sub4Array5 == null) {
				Static29.aClass1_Sub1_Sub4_Sub4Array5 = Static117.method2020(Static103.aClass39_1277, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static26.aClass1_Sub1_Sub4_Sub4_2 == null) {
				Static26.aClass1_Sub1_Sub4_Sub4_2 = Static67.method1204(Static4.aClass62_Sub1_7, Static8.aClass39_147, Static33.aClass39_485);
			} else {
				local20++;
			}
			if (Static18.aClass1_Sub1_Sub4_Sub4Array3 == null) {
				Static18.aClass1_Sub1_Sub4_Sub4Array3 = Static117.method2020(Static101.aClass39_1236, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static37.aClass1_Sub1_Sub4_Sub4Array6 == null) {
				Static37.aClass1_Sub1_Sub4_Sub4Array6 = Static117.method2020(Static87.aClass39_1015, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static24.aClass1_Sub1_Sub4_Sub4Array4 == null) {
				Static24.aClass1_Sub1_Sub4_Sub4Array4 = Static117.method2020(Static54.aClass39_733, Static4.aClass62_Sub1_7, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static67.aClass1_Sub1_Sub4_Sub1Array6 == null) {
				Static67.aClass1_Sub1_Sub4_Sub1Array6 = Static3.method72(Static4.aClass62_Sub1_7, Static120.aClass39_1521, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (Static74.aClass1_Sub1_Sub4_Sub1Array8 == null) {
				Static74.aClass1_Sub1_Sub4_Sub1Array8 = Static3.method72(Static4.aClass62_Sub1_7, Static98.aClass39_1191, Static8.aClass39_147);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static57.aClass39_757, Static69.method1226(local20 * 100 / 14), Static22.aClass39_380 });
				Static99.anInt2441 = 70;
			} else {
				Static24.aClass1_Sub1_Sub4_Sub4_1.method1527();
				local57 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				local65 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(964) int local964 = 0; local964 < Static79.aClass1_Sub1_Sub4_Sub4Array11.length; local964++) {
					Static79.aClass1_Sub1_Sub4_Sub4Array11[local964].method1529(local75 + local57, local65 + local75, local75 + local71);
				}
				Static122.aClass1_Sub1_Sub4_Sub1Array11[0].method498(local75 + local57, local65 + local75, local75 + local71);
				Static38.aClass39_542 = Static126.aClass39_1511;
				Static23.anInt812 = 85;
				Static99.anInt2441 = 70;
			}
		} else if (Static23.anInt812 == 85) {
			local20 = Static44.method788(Static4.aClass62_Sub1_7);
			local57 = Static10.method266();
			if (local20 < local57) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static24.aClass39_404, Static69.method1226(local20 * 100 / local57), Static22.aClass39_380 });
				Static99.anInt2441 = 80;
			} else {
				Static23.anInt812 = 90;
				Static99.anInt2441 = 80;
				Static38.aClass39_542 = Static37.aClass39_517;
			}
		} else if (Static23.anInt812 == 90) {
			if (Static35.aClass62_Sub1_29.method2001()) {
				@Pc(1105) Class47 local1105 = new Class47(Static35.aClass62_Sub1_29, Static4.aClass62_Sub1_7, 20, 0.8D, Static68.aBoolean149 ? 64 : 128);
				Static27.method572(local1105);
				Static27.method560(0.8D);
				Static99.anInt2441 = 90;
				Static38.aClass39_542 = Static44.aClass39_593;
				Static23.anInt812 = 110;
			} else {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static74.aClass39_917, Static69.method1226(Static35.aClass62_Sub1_29.method2025()), Static22.aClass39_380 });
				Static99.anInt2441 = 90;
			}
		} else if (Static23.anInt812 == 110) {
			Static81.aClass75_1 = new Class75();
			Static92.aClass79_2.method2087(10, Static81.aClass75_1);
			Static38.aClass39_542 = Static21.aClass39_360;
			Static23.anInt812 = 120;
			Static99.anInt2441 = 94;
		} else if (Static23.anInt812 == 120) {
			if (Static9.aClass62_Sub1_73.method2007(Static8.aClass39_147, Static116.aClass39_1389)) {
				@Pc(1174) Class68 local1174 = new Class68(Static9.aClass62_Sub1_73.method2013(Static8.aClass39_147, Static116.aClass39_1389));
				Static11.method272(local1174);
				Static99.anInt2441 = 96;
				Static23.anInt812 = 130;
				Static38.aClass39_542 = Static10.aClass39_218;
			} else {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static64.aClass39_830, Static11.aClass39_221 });
				Static99.anInt2441 = 96;
			}
		} else if (Static23.anInt812 == 130) {
			if (!Static34.aClass62_Sub1_28.method2001()) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static21.aClass39_362, Static69.method1226(Static34.aClass62_Sub1_28.method2025() * 4 / 5), Static22.aClass39_380 });
				Static99.anInt2441 = 100;
			} else if (!Static75.aClass62_Sub1_50.method2001()) {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static21.aClass39_362, Static69.method1226(Static75.aClass62_Sub1_50.method2025() / 6 + 80), Static22.aClass39_380 });
				Static99.anInt2441 = 100;
			} else if (Static68.aClass62_Sub1_47.method2001()) {
				Static99.anInt2441 = 100;
				Static38.aClass39_542 = Static9.aClass39_1442;
				Static23.anInt812 = 140;
			} else {
				Static38.aClass39_542 = Static30.method601(new Class39[] { Static21.aClass39_362, Static69.method1226(Static68.aClass62_Sub1_47.method2025() / 20 + 96), Static22.aClass39_380 });
				Static99.anInt2441 = 100;
			}
		} else if (Static23.anInt812 == 140) {
			Static41.method2108(10);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;I)V")
	public static void method50(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt72 >> 16;
		if (local8 == Static110.anInt2786 || local8 == Static9.anInt2991) {
			Static113.aBoolean226 = true;
		}
		if (local8 == Static91.anInt2131 || Static23.anIntArray117[Static120.anInt3073] == local8) {
			Static35.aBoolean96 = true;
		}
	}
}
