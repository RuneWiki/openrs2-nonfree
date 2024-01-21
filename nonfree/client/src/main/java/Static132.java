import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!ie;")
	public static Class35 aClass35_6;

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "Lclient!mb;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1316 = Static56.method816("Connection lost)3");

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1317 = Static56.method816("Drop");

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1318 = Static56.method816("<)4col>");

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array23 = new Class34[1000];

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1319 = aClass34_1316;

	@OriginalMember(owner = "client!wd", name = "sb", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!wd", name = "vb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1320 = aClass34_1317;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wf;IZI)V")
	public static void method1838(@OriginalArg(0) Class8_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static93.aClass8_Sub24_7 != null || Static90.aBoolean14 || (arg0 == null || Static19.method355(arg0) == null)) {
			return;
		}
		Static93.aClass8_Sub24_7 = arg0;
		Static15.aClass8_Sub24_3 = Static19.method355(arg0);
		Static69.anInt1682 = 0;
		Static96.anInt547 = arg2;
		Static68.anInt1678 = arg1;
		Static20.aBoolean31 = false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)I")
	public static int method1840(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(B)V")
	public static void method1870() {
		@Pc(17) int local17;
		if (Static51.anInt1346 == 0) {
			Static3.aClass64_1 = new Class64(4, 104, 104, Static24.anIntArrayArrayArray4);
			for (local17 = 0; local17 < 4; local17++) {
				Static97.aClass42Array1[local17] = new Class42(104, 104);
			}
			Static41.aClass8_Sub1_Sub3_Sub3_1 = new Class8_Sub1_Sub3_Sub3(512, 512);
			Static70.anInt1702 = 5;
			Static51.anInt1346 = 20;
			Static83.aClass34_935 = Static83.aClass34_928;
			return;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(80) int local80;
		@Pc(73) int local73;
		if (Static51.anInt1346 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local69 = local59 * 32 + 128 + 15;
				local73 = Class8_Sub1_Sub3_Sub1.anIntArray38[local69];
				local80 = local69 * 3 + 600;
				local57[local59] = local80 * local73 >> 16;
			}
			Static98.method1390(local57);
			Static70.anInt1702 = 10;
			Static83.aClass34_935 = Static7.aClass34_46;
			Static51.anInt1346 = 30;
		} else if (Static51.anInt1346 == 30) {
			Static82.aClass14_Sub1_14 = Static60.method931(false, 0, true, true);
			Static90.aClass14_Sub1_4 = Static60.method931(false, 1, true, true);
			Static100.aClass14_Sub1_18 = Static60.method931(true, 2, true, false);
			Static38.aClass14_Sub1_7 = Static60.method931(false, 3, true, true);
			Static94.aClass14_Sub1_17 = Static60.method931(false, 4, true, true);
			Static36.aClass14_Sub1_6 = Static60.method931(true, 5, true, true);
			Static67.aClass14_Sub1_9 = Static60.method931(true, 6, false, true);
			Static82.aClass14_Sub1_15 = Static60.method931(false, 7, true, true);
			Static92.aClass14_Sub1_16 = Static60.method931(false, 8, true, true);
			Static9.aClass14_Sub1_2 = Static60.method931(false, 9, true, true);
			Static70.aClass14_Sub1_11 = Static60.method931(false, 10, true, true);
			Static77.aClass14_Sub1_13 = Static60.method931(false, 11, true, true);
			Static129.aClass14_Sub1_19 = Static60.method931(false, 12, true, true);
			Static68.aClass14_Sub1_10 = Static60.method931(true, 13, true, false);
			Static76.aClass14_Sub1_12 = Static60.method931(false, 14, false, true);
			Static8.aClass14_Sub1_1 = Static60.method931(false, 15, true, true);
			Static51.anInt1346 = 40;
			Static70.anInt1702 = 20;
			Static83.aClass34_935 = Static95.aClass34_1048;
		} else if (Static51.anInt1346 == 40) {
			local17 = Static82.aClass14_Sub1_14.method1174() * 4 / 100;
			local17 += Static90.aClass14_Sub1_4.method1174() * 4 / 100;
			local17 += Static100.aClass14_Sub1_18.method1174() * 2 / 100;
			local17 += Static38.aClass14_Sub1_7.method1174() * 2 / 100;
			local17 += Static94.aClass14_Sub1_17.method1174() * 6 / 100;
			local17 += Static36.aClass14_Sub1_6.method1174() * 4 / 100;
			local17 += Static67.aClass14_Sub1_9.method1174() * 2 / 100;
			local17 += Static82.aClass14_Sub1_15.method1174() * 60 / 100;
			local17 += Static92.aClass14_Sub1_16.method1174() * 2 / 100;
			local17 += Static9.aClass14_Sub1_2.method1174() * 2 / 100;
			local17 += Static70.aClass14_Sub1_11.method1174() * 2 / 100;
			local17 += Static77.aClass14_Sub1_13.method1174() * 2 / 100;
			local17 += Static129.aClass14_Sub1_19.method1174() * 2 / 100;
			local17 += Static68.aClass14_Sub1_10.method1174() * 2 / 100;
			local17 += Static76.aClass14_Sub1_12.method1174() * 2 / 100;
			local17 += Static8.aClass14_Sub1_1.method1174() * 2 / 100;
			if (local17 == 100) {
				Static70.anInt1702 = 30;
				Static83.aClass34_935 = Static33.aClass34_481;
				Static51.anInt1346 = 45;
			} else {
				if (local17 != 0) {
					Static83.aClass34_935 = Static44.method669(new Class34[] { Static87.aClass34_1004, Static44.method672(local17), Static27.aClass34_384 });
				}
				Static70.anInt1702 = 30;
			}
		} else if (Static51.anInt1346 == 45) {
			Static48.method1954(!Static108.aBoolean98);
			@Pc(454) Class8_Sub11_Sub1 local454 = new Class8_Sub11_Sub1();
			local454.method890();
			Static96.aClass13_2 = Static58.method903(0, Static119.aCanvas1, 22050, Static93.aClass40_3);
			Static96.aClass13_2.method1606(local454);
			Static33.method549(Static94.aClass14_Sub1_17, local454, Static8.aClass14_Sub1_1, Static76.aClass14_Sub1_12);
			Static112.aClass13_3 = Static58.method903(1, Static119.aCanvas1, 2048, Static93.aClass40_3);
			Static104.aClass8_Sub11_Sub4_1 = new Class8_Sub11_Sub4();
			Static112.aClass13_3.method1606(Static104.aClass8_Sub11_Sub4_1);
			aClass51_2 = new Class51(22050, Static23.anInt713);
			Static70.anInt1702 = 35;
			Static51.anInt1346 = 50;
			Static83.aClass34_935 = Static128.aClass34_1390;
		} else if (Static51.anInt1346 == 50) {
			local17 = 0;
			if (Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1 == null) {
				Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1 = Static101.method1461(Static36.aClass34_504, Static68.aClass14_Sub1_10, Static117.aClass34_1231, Static92.aClass14_Sub1_16);
			} else {
				local17++;
			}
			if (Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3 == null) {
				Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3 = Static101.method1461(Static36.aClass34_504, Static68.aClass14_Sub1_10, Static102.aClass34_1432, Static92.aClass14_Sub1_16);
			} else {
				local17++;
			}
			if (Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2 == null) {
				Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2 = Static101.method1461(Static36.aClass34_504, Static68.aClass14_Sub1_10, Static96.aClass34_285, Static92.aClass14_Sub1_16);
			} else {
				local17++;
			}
			if (local17 < 3) {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static27.aClass34_383, Static44.method672(local17 * 100 / 3), Static27.aClass34_384 });
				Static70.anInt1702 = 40;
			} else {
				Static51.anInt1346 = 60;
				Static83.aClass34_935 = Static57.aClass34_718;
				Static70.anInt1702 = 40;
			}
		} else if (Static51.anInt1346 == 60) {
			local17 = Static29.method517(Static92.aClass14_Sub1_16, Static70.aClass14_Sub1_11);
			local59 = Static34.method560();
			if (local59 > local17) {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static39.aClass34_515, Static44.method672(local17 * 100 / local59), Static27.aClass34_384 });
				Static70.anInt1702 = 50;
			} else {
				Static83.aClass34_935 = Static7.aClass34_44;
				Static70.anInt1702 = 50;
				Static82.method1201(5);
				Static51.anInt1346 = 70;
			}
		} else if (Static51.anInt1346 == 70) {
			if (Static100.aClass14_Sub1_18.method1148()) {
				Static75.method1098(Static100.aClass14_Sub1_18);
				Static68.method1040(Static100.aClass14_Sub1_18);
				Static44.method671(Static82.aClass14_Sub1_15, Static100.aClass14_Sub1_18);
				Static106.method1509(Static82.aClass14_Sub1_15, Static108.aBoolean98, Static100.aClass14_Sub1_18);
				Static103.method1474(Static100.aClass14_Sub1_18, Static82.aClass14_Sub1_15);
				Static84.method1247(Static16.aBoolean19, Static82.aClass14_Sub1_15, Static100.aClass14_Sub1_18, Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1);
				Static42.method637(Static82.aClass14_Sub1_14, Static100.aClass14_Sub1_18, Static90.aClass14_Sub1_4);
				Static99.method1449(Static82.aClass14_Sub1_15, Static100.aClass14_Sub1_18);
				Static67.method1024(Static100.aClass14_Sub1_18);
				Static51.method764(Static100.aClass14_Sub1_18);
				Static1.method1(Static68.aClass14_Sub1_10, Static82.aClass14_Sub1_15, Static38.aClass14_Sub1_7, Static92.aClass14_Sub1_16);
				Static40.method607(Static100.aClass14_Sub1_18);
				Static40.method604(Static100.aClass14_Sub1_18);
				Static83.aClass34_935 = Static10.aClass34_133;
				Static70.anInt1702 = 60;
				Static51.anInt1346 = 80;
			} else {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static108.aClass34_1169, Static44.method672(Static100.aClass14_Sub1_18.method1173()), Static27.aClass34_384 });
				Static70.anInt1702 = 60;
			}
		} else if (Static51.anInt1346 == 80) {
			local17 = 0;
			if (Static116.aClass8_Sub1_Sub3_Sub3_5 == null) {
				Static116.aClass8_Sub1_Sub3_Sub3_5 = Static108.method1526(Static108.aClass34_1168, Static36.aClass34_504, Static92.aClass14_Sub1_16);
			} else {
				local17++;
			}
			if (Static59.aClass8_Sub1_Sub3_Sub3_2 == null) {
				Static59.aClass8_Sub1_Sub3_Sub3_2 = Static108.method1526(Static53.aClass34_692, Static36.aClass34_504, Static92.aClass14_Sub1_16);
			} else {
				local17++;
			}
			if (Static34.aClass8_Sub1_Sub3_Sub2Array2 == null) {
				Static34.aClass8_Sub1_Sub3_Sub2Array2 = Static72.method1070(Static36.aClass34_504, Static92.aClass14_Sub1_16, Static130.aClass34_1406);
			} else {
				local17++;
			}
			if (Static134.aClass8_Sub1_Sub3_Sub3Array41 == null) {
				Static134.aClass8_Sub1_Sub3_Sub3Array41 = Static127.method1982(Static109.aClass34_1172, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static61.aClass8_Sub1_Sub3_Sub3Array25 == null) {
				Static61.aClass8_Sub1_Sub3_Sub3Array25 = Static127.method1982(Static94.aClass34_1036, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static7.aClass8_Sub1_Sub3_Sub3Array1 == null) {
				Static7.aClass8_Sub1_Sub3_Sub3Array1 = Static127.method1982(Static14.aClass34_207, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static58.aClass8_Sub1_Sub3_Sub3Array22 == null) {
				Static58.aClass8_Sub1_Sub3_Sub3Array22 = Static127.method1982(Static28.aClass34_387, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static59.aClass8_Sub1_Sub3_Sub3Array24 == null) {
				Static59.aClass8_Sub1_Sub3_Sub3Array24 = Static127.method1982(Static42.aClass34_547, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static116.aClass8_Sub1_Sub3_Sub3Array35 == null) {
				Static116.aClass8_Sub1_Sub3_Sub3Array35 = Static127.method1982(Static50.aClass34_662, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static127.aClass8_Sub1_Sub3_Sub3Array40 == null) {
				Static127.aClass8_Sub1_Sub3_Sub3Array40 = Static127.method1982(Static130.aClass34_1415, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static123.aClass8_Sub1_Sub3_Sub3Array38 == null) {
				Static123.aClass8_Sub1_Sub3_Sub3Array38 = Static127.method1982(Static59.aClass34_742, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (Static45.aClass8_Sub1_Sub3_Sub2Array3 == null) {
				Static45.aClass8_Sub1_Sub3_Sub2Array3 = Static72.method1070(Static36.aClass34_504, Static92.aClass14_Sub1_16, Static10.aClass34_134);
			} else {
				local17++;
			}
			if (Static53.aClass8_Sub1_Sub3_Sub2Array6 == null) {
				Static53.aClass8_Sub1_Sub3_Sub2Array6 = Static72.method1070(Static36.aClass34_504, Static92.aClass14_Sub1_16, Static95.aClass34_1050);
			} else {
				local17++;
			}
			if (Static22.aClass8_Sub1_Sub3_Sub2_7 == null) {
				Static22.aClass8_Sub1_Sub3_Sub2_7 = Static87.method1306(Static45.aClass34_576, Static92.aClass14_Sub1_16, Static36.aClass34_504);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static104.aClass34_1118, Static44.method672(local17 * 100 / 14), Static27.aClass34_384 });
				Static70.anInt1702 = 70;
			} else {
				local59 = (int) (Math.random() * 21.0D) - 10;
				Static131.aClass8_Sub1_Sub3_Sub2Array10 = Static53.aClass8_Sub1_Sub3_Sub2Array6;
				Static59.aClass8_Sub1_Sub3_Sub3_2.method1585();
				local69 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 41.0D) - 20;
				local80 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(964) int local964 = 0; local964 < Static134.aClass8_Sub1_Sub3_Sub3Array41.length; local964++) {
					Static134.aClass8_Sub1_Sub3_Sub3Array41[local964].method1590(local59 + local73, local73 + local69, local80 + local73);
				}
				Static34.aClass8_Sub1_Sub3_Sub2Array2[0].method301(local59 + local73, local73 + local69, local73 + local80);
				Static70.method1051();
				Static70.anInt1702 = 70;
				Static83.aClass34_935 = Static96.aClass34_283;
				Static51.anInt1346 = 90;
			}
		} else if (Static51.anInt1346 == 90) {
			if (Static9.aClass14_Sub1_2.method1148()) {
				@Pc(1060) Class26 local1060 = new Class26(Static9.aClass14_Sub1_2, Static92.aClass14_Sub1_16, 20, 0.8D, Static108.aBoolean98 ? 64 : 128);
				Static11.method180(local1060);
				Static11.method186(0.8D);
				Static83.aClass34_935 = Static19.aClass34_292;
				Static70.anInt1702 = 90;
				Static51.anInt1346 = 110;
			} else {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static61.aClass34_757, Static44.method672(Static9.aClass14_Sub1_2.method1173()), Static27.aClass34_384 });
				Static70.anInt1702 = 90;
			}
		} else if (Static51.anInt1346 == 110) {
			Static134.aClass33_1 = new Class33();
			Static93.aClass40_3.method951(Static134.aClass33_1, 10);
			Static70.anInt1702 = 94;
			Static51.anInt1346 = 120;
			Static83.aClass34_935 = Static107.aClass34_1151;
		} else if (Static51.anInt1346 == 120) {
			if (Static70.aClass14_Sub1_11.method1154(Static25.aClass34_360, Static36.aClass34_504)) {
				@Pc(1131) Class21 local1131 = new Class21(Static70.aClass14_Sub1_11.method1166(Static25.aClass34_360, Static36.aClass34_504));
				Static96.method334(local1131);
				Static83.aClass34_935 = Static36.aClass34_501;
				Static51.anInt1346 = 130;
				Static70.anInt1702 = 96;
			} else {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static83.aClass34_932, Static44.aClass34_563 });
				Static70.anInt1702 = 96;
			}
		} else if (Static51.anInt1346 == 130) {
			if (!Static38.aClass14_Sub1_7.method1148()) {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static33.aClass34_483, Static44.method672(Static38.aClass14_Sub1_7.method1173() * 4 / 5), Static27.aClass34_384 });
				Static70.anInt1702 = 100;
			} else if (!Static129.aClass14_Sub1_19.method1148()) {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static33.aClass34_483, Static44.method672(Static129.aClass14_Sub1_19.method1173() / 6 + 80), Static27.aClass34_384 });
				Static70.anInt1702 = 100;
			} else if (Static68.aClass14_Sub1_10.method1148()) {
				Static51.anInt1346 = 140;
				Static83.aClass34_935 = Static50.aClass34_656;
				Static70.anInt1702 = 100;
			} else {
				Static83.aClass34_935 = Static44.method669(new Class34[] { Static33.aClass34_483, Static44.method672(Static68.aClass14_Sub1_10.method1173() / 20 + 96), Static27.aClass34_384 });
				Static70.anInt1702 = 100;
			}
		} else if (Static51.anInt1346 == 140) {
			Static82.method1201(10);
		}
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(I)V")
	public static void method1890() {
		aClass34_1316 = null;
		aClass34_1318 = null;
		aClass34_1320 = null;
		aClass35_6 = null;
		aClass34Array23 = null;
		aClass34_1319 = null;
		aClass51_2 = null;
		aClass34_1317 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!h;II)V")
	public static void method1891(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub1_Sub4_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1 || Static96.anInt552 >= 400) {
			return;
		}
		@Pc(56) Class34 local56;
		if (arg1.anInt1272 == 0) {
			local56 = Static44.method669(new Class34[] { arg1.aClass34_638, Static53.method778(arg1.anInt1275, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1275), Static3.aClass34_24, Static59.aClass34_739, Static44.method672(arg1.anInt1275), Static30.aClass34_451 });
		} else {
			local56 = Static44.method669(new Class34[] { arg1.aClass34_638, Static3.aClass34_24, Static2.aClass34_6, Static44.method672(arg1.anInt1272), Static30.aClass34_451 });
		}
		@Pc(132) int local132;
		if (Static88.anInt2340 == 1) {
			Static72.method1076(arg0, Static44.method669(new Class34[] { Static88.aClass34_1100, Static36.aClass34_503, local56 }), arg2, Static22.aClass34_1204, 19, arg3);
		} else if (!Static32.aBoolean41) {
			for (local132 = 7; local132 >= 0; local132--) {
				if (Static20.aClass34Array8[local132] != null) {
					@Pc(144) short local144 = 0;
					if (Static20.aClass34Array8[local132].method806(Static60.aClass34_749)) {
						if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1275 < arg1.anInt1275) {
							local144 = 2000;
						}
						if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1265 != 0 && arg1.anInt1265 != 0) {
							if (arg1.anInt1265 == Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1265) {
								local144 = 2000;
							} else {
								local144 = 0;
							}
						}
					} else if (Static40.aBooleanArray5[local132]) {
						local144 = 2000;
					}
					@Pc(202) int local202 = Static76.anIntArray231[local132] + local144;
					Static72.method1076(arg0, Static44.method669(new Class34[] { Static81.aClass34_889, local56 }), arg2, Static20.aClass34Array8[local132], local202, arg3);
				}
			}
		} else if ((Static120.anInt2889 & 0x8) == 8) {
			Static72.method1076(arg0, Static44.method669(new Class34[] { Static120.aClass34_1321, Static36.aClass34_503, local56 }), arg2, Static49.aClass34_652, 2, arg3);
		}
		for (local132 = 0; local132 < Static96.anInt552; local132++) {
			if (Static50.anIntArray166[local132] == 45) {
				Static6.aClass34Array3[local132] = Static44.method669(new Class34[] { Static81.aClass34_889, local56 });
				break;
			}
		}
	}
}
