import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public static int anInt1639;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!da;")
	public static Class15 aClass15_39;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public static int anInt1629 = -1;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!wb;")
	private static Class65 aClass65_730 = Static24.method441("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!wb;")
	private static Class65 aClass65_731 = Static24.method441("white:");

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_732 = aClass65_731;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_733 = aClass65_730;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static int anInt1640 = 0;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_734 = Static24.method441("Benutzername: ");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method958() {
		@Pc(17) int local17;
		if (Static7.anInt285 == 0) {
			Static67.aClass18_1 = new Class18(4, 104, 104, Static61.anIntArrayArrayArray6);
			for (local17 = 0; local17 < 4; local17++) {
				Static84.aClass58Array1[local17] = new Class58(104, 104);
			}
			Static90.aClass2_Sub1_Sub4_Sub2_6 = new Class2_Sub1_Sub4_Sub2(512, 512);
			Static36.anInt1219 = 5;
			Static105.aClass65_1284 = Static63.aClass65_867;
			Static7.anInt285 = 20;
			return;
		}
		@Pc(54) int local54;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (Static7.anInt285 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local63 = local54 * 32 + 143;
				local70 = local63 * 3 + 600;
				local74 = Class2_Sub1_Sub4_Sub1.anIntArray55[local63];
				local52[local54] = local74 * local70 >> 16;
			}
			Static31.method616(local52);
			Static36.anInt1219 = 10;
			Static105.aClass65_1284 = Static89.aClass65_1152;
			Static7.anInt285 = 30;
		} else if (Static7.anInt285 == 30) {
			Static104.aClass33_Sub1_48 = Static70.method1272(0, true, true, false);
			Static69.aClass33_Sub1_35 = Static70.method1272(1, true, true, false);
			Static18.aClass33_Sub1_43 = Static70.method1272(2, true, false, true);
			Static23.aClass33_Sub1_12 = Static70.method1272(3, true, true, false);
			Static25.aClass33_Sub1_13 = Static70.method1272(4, true, true, false);
			Static56.aClass33_Sub1_24 = Static70.method1272(5, true, true, true);
			Static26.aClass33_Sub1_50 = Static70.method1272(6, false, true, true);
			Static67.aClass33_Sub1_33 = Static70.method1272(7, true, true, false);
			Static28.aClass33_Sub1_15 = Static70.method1272(8, true, true, false);
			Static108.aClass33_Sub1_49 = Static70.method1272(9, true, true, false);
			Static19.aClass33_Sub1_31 = Static70.method1272(10, true, true, false);
			Static99.aClass33_Sub1_44 = Static70.method1272(11, true, true, false);
			Static105.aClass65_1284 = Static4.aClass65_96;
			Static36.anInt1219 = 20;
			Static7.anInt285 = 40;
		} else if (Static7.anInt285 == 40) {
			local17 = Static104.aClass33_Sub1_48.method1156() * 5 / 100;
			local17 += Static69.aClass33_Sub1_35.method1156() * 5 / 100;
			local17 += Static18.aClass33_Sub1_43.method1156() * 5 / 100;
			local17 += Static23.aClass33_Sub1_12.method1156() * 5 / 100;
			local17 += Static25.aClass33_Sub1_13.method1156() * 5 / 100;
			local17 += Static56.aClass33_Sub1_24.method1156() * 5 / 100;
			local17 += Static26.aClass33_Sub1_50.method1156() * 5 / 100;
			local17 += Static67.aClass33_Sub1_33.method1156() * 45 / 100;
			local17 += Static28.aClass33_Sub1_15.method1156() * 5 / 100;
			local17 += Static108.aClass33_Sub1_49.method1156() * 5 / 100;
			local17 += Static19.aClass33_Sub1_31.method1156() * 5 / 100;
			local17 += Static99.aClass33_Sub1_44.method1156() * 5 / 100;
			if (local17 == 100) {
				Static36.anInt1219 = 30;
				Static105.aClass65_1284 = Static87.aClass65_1134;
				Static7.anInt285 = 45;
			} else {
				if (local17 != 0) {
					Static105.aClass65_1284 = Static13.method282(new Class65[] { Static36.aClass65_514, Static93.method1617(local17), Static89.aClass65_1151 });
				}
				Static36.anInt1219 = 30;
			}
		} else if (Static7.anInt285 == 45) {
			Static15.method309(Static97.aClass53_3, !Static4.aBoolean16);
			Static8.aClass2_Sub10_Sub2_1 = Static42.method808(Static97.aClass53_3, Static70.aCanvas1);
			Static99.aClass12_3 = new Class12(22050, Static42.anInt1353);
			Static105.aClass65_1284 = Static37.aClass65_521;
			Static36.anInt1219 = 35;
			Static7.anInt285 = 50;
		} else if (Static7.anInt285 == 50) {
			local17 = 0;
			if (Static60.aClass2_Sub1_Sub4_Sub4_2 == null) {
				Static60.aClass2_Sub1_Sub4_Sub4_2 = Static17.method369(Static8.aClass65_145, Static67.aClass65_928, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (Static110.aClass2_Sub1_Sub4_Sub4_3 == null) {
				Static110.aClass2_Sub1_Sub4_Sub4_3 = Static17.method369(Static8.aClass65_145, Static84.aClass65_1084, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (Static38.aClass2_Sub1_Sub4_Sub4_1 == null) {
				Static38.aClass2_Sub1_Sub4_Sub4_1 = Static17.method369(Static8.aClass65_145, Static97.aClass65_1208, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static97.aClass65_1210, Static93.method1617(local17 * 100 / 3), Static89.aClass65_1151 });
				Static36.anInt1219 = 40;
			} else {
				Static105.aClass65_1284 = Static83.aClass65_1069;
				Static7.anInt285 = 60;
				Static36.anInt1219 = 40;
			}
		} else if (Static7.anInt285 == 60) {
			local17 = Static90.method833(Static28.aClass33_Sub1_15, Static19.aClass33_Sub1_31);
			local54 = Static63.method1109();
			if (local54 > local17) {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static26.aClass65_1356, Static93.method1617(local17 * 100 / local54), Static89.aClass65_1151 });
				Static36.anInt1219 = 50;
			} else {
				Static105.aClass65_1284 = Static9.aClass65_163;
				Static36.anInt1219 = 50;
				Static76.method1307(5);
				Static7.anInt285 = 70;
			}
		} else if (Static7.anInt285 == 70) {
			if (Static18.aClass33_Sub1_43.method1146()) {
				Static81.method1798(Static18.aClass33_Sub1_43);
				Static3.method87(Static18.aClass33_Sub1_43);
				Static65.method1165(Static18.aClass33_Sub1_43, Static67.aClass33_Sub1_33);
				Static52.method927(Static18.aClass33_Sub1_43, Static4.aBoolean16, Static67.aClass33_Sub1_33);
				Static70.method1267(Static67.aClass33_Sub1_33, Static18.aClass33_Sub1_43);
				Static39.method761(Static18.aClass33_Sub1_43, Static67.aClass33_Sub1_33, Static105.aBoolean152);
				Static19.method1101(Static104.aClass33_Sub1_48, Static69.aClass33_Sub1_35, Static18.aClass33_Sub1_43);
				Static98.method1700(Static18.aClass33_Sub1_43, Static67.aClass33_Sub1_33);
				Static84.method1451(Static18.aClass33_Sub1_43);
				Static6.method132(Static18.aClass33_Sub1_43);
				Static75.method1298(Static28.aClass33_Sub1_15, Static23.aClass33_Sub1_12, Static67.aClass33_Sub1_33);
				Static7.anInt285 = 80;
				Static105.aClass65_1284 = Static95.aClass65_896;
				Static36.anInt1219 = 60;
			} else {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static79.aClass65_1038, Static93.method1617(Static18.aClass33_Sub1_43.method1162()), Static89.aClass65_1151 });
				Static36.anInt1219 = 60;
			}
		} else if (Static7.anInt285 == 80) {
			local17 = 0;
			if (Static24.aClass2_Sub1_Sub4_Sub2_4 == null) {
				Static24.aClass2_Sub1_Sub4_Sub2_4 = Static37.method750(Static28.aClass33_Sub1_15, Static8.aClass65_145, Static51.aClass65_686);
			} else {
				local17++;
			}
			if (Static62.aClass2_Sub1_Sub4_Sub2_10 == null) {
				Static62.aClass2_Sub1_Sub4_Sub2_10 = Static37.method750(Static28.aClass33_Sub1_15, Static8.aClass65_145, Static45.aClass65_607);
			} else {
				local17++;
			}
			if (Static33.aClass2_Sub1_Sub4_Sub3Array6 == null) {
				Static33.aClass2_Sub1_Sub4_Sub3Array6 = Static90.method837(Static78.aClass65_266, Static8.aClass65_145, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (Static45.aClass2_Sub1_Sub4_Sub2Array7 == null) {
				Static45.aClass2_Sub1_Sub4_Sub2Array7 = Static84.method1453(Static28.aClass33_Sub1_15, Static98.aClass65_1236, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static97.aClass2_Sub1_Sub4_Sub2Array8 == null) {
				Static97.aClass2_Sub1_Sub4_Sub2Array8 = Static84.method1453(Static28.aClass33_Sub1_15, Static47.aClass65_617, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static6.aClass2_Sub1_Sub4_Sub2Array4 == null) {
				Static6.aClass2_Sub1_Sub4_Sub2Array4 = Static84.method1453(Static28.aClass33_Sub1_15, Static24.aClass65_345, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static38.aClass2_Sub1_Sub4_Sub2Array6 == null) {
				Static38.aClass2_Sub1_Sub4_Sub2Array6 = Static84.method1453(Static28.aClass33_Sub1_15, Static96.aClass65_1199, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static102.aClass2_Sub1_Sub4_Sub2Array9 == null) {
				Static102.aClass2_Sub1_Sub4_Sub2Array9 = Static84.method1453(Static28.aClass33_Sub1_15, Static1.aClass65_2, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static20.aClass2_Sub1_Sub4_Sub2_3 == null) {
				Static20.aClass2_Sub1_Sub4_Sub2_3 = Static37.method750(Static28.aClass33_Sub1_15, Static8.aClass65_145, Static26.aClass65_1355);
			} else {
				local17++;
			}
			if (Static2.aClass2_Sub1_Sub4_Sub2Array1 == null) {
				Static2.aClass2_Sub1_Sub4_Sub2Array1 = Static84.method1453(Static28.aClass33_Sub1_15, Static28.aClass65_378, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static6.aClass2_Sub1_Sub4_Sub2Array3 == null) {
				Static6.aClass2_Sub1_Sub4_Sub2Array3 = Static84.method1453(Static28.aClass33_Sub1_15, Static100.aClass65_1247, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static3.aClass2_Sub1_Sub4_Sub2Array2 == null) {
				Static3.aClass2_Sub1_Sub4_Sub2Array2 = Static84.method1453(Static28.aClass33_Sub1_15, Static52.aClass65_719, Static8.aClass65_145);
			} else {
				local17++;
			}
			if (Static36.aClass2_Sub1_Sub4_Sub3Array3 == null) {
				Static36.aClass2_Sub1_Sub4_Sub3Array3 = Static90.method837(Static83.aClass65_1068, Static8.aClass65_145, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (Static46.aClass2_Sub1_Sub4_Sub3Array5 == null) {
				Static46.aClass2_Sub1_Sub4_Sub3Array5 = Static90.method837(Static45.aClass65_603, Static8.aClass65_145, Static28.aClass33_Sub1_15);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static80.aClass65_1043, Static93.method1617(local17 * 100 / 14), Static89.aClass65_1151 });
				Static36.anInt1219 = 70;
			} else {
				Static62.aClass2_Sub1_Sub4_Sub2_10.method481();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 41.0D) - 20;
				local63 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(845) int local845 = 0; local845 < Static45.aClass2_Sub1_Sub4_Sub2Array7.length; local845++) {
					Static45.aClass2_Sub1_Sub4_Sub2Array7[local845].method477(local74 + local54, local63 - -local74, local70 + local74);
				}
				Static33.aClass2_Sub1_Sub4_Sub3Array6[0].method1485(local54 + local74, local74 + local63, local70 + local74);
				Static36.anInt1219 = 70;
				Static7.anInt285 = 85;
				Static105.aClass65_1284 = Static102.aClass65_1270;
			}
		} else if (Static7.anInt285 == 85) {
			local17 = Static110.method1844(Static28.aClass33_Sub1_15);
			local54 = Static34.method700();
			if (local54 > local17) {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static15.aClass65_245, Static93.method1617(local17 * 100 / local54), Static89.aClass65_1151 });
				Static36.anInt1219 = 80;
			} else {
				Static7.anInt285 = 90;
				Static36.anInt1219 = 80;
				Static105.aClass65_1284 = Static79.aClass65_1036;
			}
		} else if (Static7.anInt285 == 90) {
			if (Static108.aClass33_Sub1_49.method1146()) {
				@Pc(993) Class4 local993 = new Class4(Static108.aClass33_Sub1_49, Static28.aClass33_Sub1_15, 20, 0.8D, Static4.aBoolean16 ? 64 : 128);
				Static10.method250(local993);
				Static10.method248(0.8D);
				Static105.aClass65_1284 = Static16.aClass65_253;
				Static7.anInt285 = 110;
				Static36.anInt1219 = 90;
			} else {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static95.aClass65_895, Static93.method1617(Static108.aClass33_Sub1_49.method1162()), Static89.aClass65_1151 });
				Static36.anInt1219 = 90;
			}
		} else if (Static7.anInt285 == 110) {
			Static100.aClass6_1 = new Class6();
			Static97.aClass53_3.method1628(Static100.aClass6_1, 10);
			Static36.anInt1219 = 94;
			Static7.anInt285 = 120;
			Static105.aClass65_1284 = Static63.aClass65_871;
		} else if (Static7.anInt285 == 120) {
			if (Static19.aClass33_Sub1_31.method1152(Static8.aClass65_145, Static90.aClass65_625)) {
				@Pc(1060) Class1 local1060 = new Class1(Static19.aClass33_Sub1_31.method1138(Static90.aClass65_625, Static8.aClass65_145));
				Static56.method991(local1060);
				Static7.anInt285 = 130;
				Static36.anInt1219 = 96;
				Static105.aClass65_1284 = Static41.aClass65_570;
			} else {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static18.aClass65_1141, Static85.aClass65_1103 });
				Static36.anInt1219 = 96;
			}
		} else if (Static7.anInt285 == 130) {
			if (Static23.aClass33_Sub1_12.method1146()) {
				Static36.anInt1219 = 100;
				Static105.aClass65_1284 = Static59.aClass65_825;
				Static7.anInt285 = 140;
			} else {
				Static105.aClass65_1284 = Static13.method282(new Class65[] { Static69.aClass65_957, Static93.method1617(Static23.aClass33_Sub1_12.method1162()), Static89.aClass65_1151 });
				Static36.anInt1219 = 100;
			}
		} else if (Static7.anInt285 == 140) {
			Static76.method1307(10);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method959(@OriginalArg(1) Component arg0) {
		@Pc(13) Method local13 = Static94.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static50.aClass26_1);
		arg0.addFocusListener(Static50.aClass26_1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!od;)V")
	public static void method960(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0) {
		arg0.aBoolean86 = false;
		@Pc(21) Class2_Sub1_Sub6 local21;
		if (arg0.anInt1542 != -1) {
			local21 = Static71.method1291(arg0.anInt1542);
			if (local21 == null || local21.anIntArray155 == null) {
				arg0.anInt1542 = -1;
			} else {
				arg0.anInt1526++;
				if (local21.anIntArray155.length > arg0.anInt1547 && arg0.anInt1526 > local21.anIntArray157[arg0.anInt1547]) {
					arg0.anInt1547++;
					arg0.anInt1526 = 1;
				}
				if (arg0.anInt1547 >= local21.anIntArray155.length) {
					arg0.anInt1526 = 0;
					arg0.anInt1547 = 0;
				}
			}
		}
		if (arg0.anInt1554 != -1 && arg0.anInt1535 <= Static108.anInt2902) {
			if (arg0.anInt1563 < 0) {
				arg0.anInt1563 = 0;
			}
			@Pc(107) int local107 = Static20.method402(arg0.anInt1554).anInt2681;
			if (local107 == -1) {
				arg0.anInt1554 = -1;
			} else {
				@Pc(119) Class2_Sub1_Sub6 local119 = Static71.method1291(local107);
				if (local119 == null || local119.anIntArray155 == null) {
					arg0.anInt1554 = -1;
				} else {
					arg0.anInt1557++;
					if (local119.anIntArray155.length > arg0.anInt1563 && local119.anIntArray157[arg0.anInt1563] < arg0.anInt1557) {
						arg0.anInt1563++;
						arg0.anInt1557 = 1;
					}
					if (arg0.anInt1563 >= local119.anIntArray155.length && (arg0.anInt1563 < 0 || arg0.anInt1563 >= local119.anIntArray155.length)) {
						arg0.anInt1554 = -1;
					}
				}
			}
		}
		if (arg0.anInt1552 != -1 && arg0.anInt1569 <= 1) {
			local21 = Static71.method1291(arg0.anInt1552);
			if (local21.anInt1197 == 1 && arg0.anInt1534 > 0 && Static108.anInt2902 >= arg0.anInt1565 && Static108.anInt2902 > arg0.anInt1517) {
				arg0.anInt1569 = 1;
				return;
			}
		}
		if (arg0.anInt1552 != -1 && arg0.anInt1569 == 0) {
			local21 = Static71.method1291(arg0.anInt1552);
			if (local21 == null || local21.anIntArray155 == null) {
				arg0.anInt1552 = -1;
			} else {
				arg0.anInt1566++;
				if (local21.anIntArray155.length > arg0.anInt1549 && arg0.anInt1566 > local21.anIntArray157[arg0.anInt1549]) {
					arg0.anInt1566 = 1;
					arg0.anInt1549++;
				}
				if (local21.anIntArray155.length <= arg0.anInt1549) {
					arg0.anInt1564++;
					arg0.anInt1549 -= local21.anInt1205;
					if (arg0.anInt1564 >= local21.anInt1203) {
						arg0.anInt1552 = -1;
					}
					if (arg0.anInt1549 < 0 || local21.anIntArray155.length <= arg0.anInt1549) {
						arg0.anInt1552 = -1;
					}
				}
				arg0.aBoolean86 = local21.aBoolean72;
			}
		}
		if (arg0.anInt1569 > 0) {
			arg0.anInt1569--;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method961() {
		aClass15_39 = null;
		aClass65_730 = null;
		aClass65_731 = null;
		aFrame1 = null;
		aClass65_732 = null;
		aClass65_734 = null;
		aClass65_733 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZ)Lclient!wb;")
	public static Class65 method962(@OriginalArg(2) int arg0) {
		@Pc(22) int local22 = arg0 / 10;
		@Pc(24) int local24 = 1;
		while (local22 != 0) {
			local24++;
			local22 /= 10;
		}
		@Pc(35) int local35 = local24;
		if (arg0 < 0) {
			local35 = local24 + 1;
		}
		@Pc(46) byte[] local46 = new byte[local35];
		if (arg0 < 0) {
			local46[0] = 45;
		}
		for (@Pc(62) int local62 = 0; local62 < local24; local62++) {
			@Pc(68) int local68 = arg0 % 10;
			arg0 /= 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			local46[local35 - local62 - 1] = (byte) (local68 + 48);
		}
		@Pc(105) Class65 local105 = new Class65();
		local105.anInt2878 = local35;
		local105.aByteArray70 = local46;
		return local105;
	}
}
