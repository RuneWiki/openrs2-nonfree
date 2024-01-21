import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "Lclient!ja;")
	public static Class31 aClass31_7;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
	public static int anInt2783;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!jd;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1373 = Static14.method2017("wave:");

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Z")
	public static volatile boolean aBoolean131 = true;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
	public static int anInt2780 = 0;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1374 = aClass36_1373;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIZ)V")
	public static void method1960(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static41.aClass29_1 == null) {
			return;
		}
		if (Static79.anInt2048 >= 0) {
			Static20.anInt502 = arg1;
			if (Static79.anInt2048 == 0) {
				Static38.anInt969 = 1;
			} else {
				@Pc(39) int local39 = Static67.method1164(Static79.anInt2048);
				@Pc(43) int local43 = local39 - Static99.anInt2032;
				Static38.anInt969 = (local43 + 3600) / arg1;
				if (Static38.anInt969 < 1) {
					Static38.anInt969 = 1;
				}
			}
			Static11.aBoolean4 = arg3;
			Static17.aByteArray4 = arg0;
			Static88.anInt2316 = arg2;
		} else if (Static38.anInt969 == 0) {
			Static36.method735(arg2, arg3, arg0);
		} else {
			Static17.aByteArray4 = arg0;
			Static88.anInt2316 = arg2;
			Static11.aBoolean4 = arg3;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ea;)V")
	private static void method1961(@OriginalArg(1) Class18 arg0) {
		Static79.aClass18_1 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ac;III)Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 method1962(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static14.method2024(arg0, arg2, arg1) ? Static27.method567() : null;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method1963() {
		@Pc(20) int local20;
		if (Static10.anInt241 == 0) {
			Static85.aClass61_1 = new Class61(4, 104, 104, Static27.anIntArrayArrayArray4);
			for (local20 = 0; local20 < 4; local20++) {
				Static11.aClass4Array1[local20] = new Class4(104, 104);
			}
			Static6.aClass2_Sub1_Sub1_Sub3_2 = new Class2_Sub1_Sub1_Sub3(512, 512);
			Static57.anInt1497 = 5;
			Static15.aClass36_181 = Static74.aClass36_918;
			Static10.anInt241 = 20;
			return;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(75) int local75;
		@Pc(69) int local69;
		if (Static10.anInt241 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local65 = local57 * 32 + 143;
				local69 = Class2_Sub1_Sub1_Sub4.anIntArray265[local65];
				local75 = local65 * 3 + 600;
				local55[local57] = local75 * local69 >> 16;
			}
			Static93.method1708(local55);
			Static57.anInt1497 = 10;
			Static15.aClass36_181 = Static118.aClass36_1460;
			Static10.anInt241 = 30;
		} else if (Static10.anInt241 == 30) {
			Static86.aClass3_Sub1_9 = Static82.method1500(0, true, false, true);
			Static77.aClass3_Sub1_7 = Static82.method1500(1, true, false, true);
			Static97.aClass3_Sub1_10 = Static82.method1500(2, false, true, true);
			Static23.aClass3_Sub1_2 = Static82.method1500(3, true, false, true);
			Static57.aClass3_Sub1_6 = Static82.method1500(4, true, false, true);
			Static110.aClass3_Sub1_13 = Static82.method1500(5, true, true, true);
			Static111.aClass3_Sub1_14 = Static82.method1500(6, true, true, false);
			Static27.aClass3_Sub1_3 = Static82.method1500(7, true, false, true);
			Static29.aClass3_Sub1_4 = Static82.method1500(8, true, false, true);
			Static85.aClass3_Sub1_8 = Static82.method1500(9, true, false, true);
			Static100.aClass3_Sub1_12 = Static82.method1500(10, true, false, true);
			Static100.aClass3_Sub1_11 = Static82.method1500(11, true, false, true);
			Static113.aClass3_Sub1_16 = Static82.method1500(12, true, false, true);
			Static112.aClass3_Sub1_15 = Static82.method1500(13, false, true, true);
			Static15.aClass36_181 = Static55.aClass36_1322;
			Static10.anInt241 = 40;
			Static57.anInt1497 = 20;
		} else if (Static10.anInt241 == 40) {
			local20 = Static86.aClass3_Sub1_9.method958() * 5 / 100;
			local20 += Static77.aClass3_Sub1_7.method958() * 5 / 100;
			local20 += Static97.aClass3_Sub1_10.method958() * 5 / 100;
			local20 += Static23.aClass3_Sub1_2.method958() * 5 / 100;
			local20 += Static57.aClass3_Sub1_6.method958() * 5 / 100;
			local20 += Static110.aClass3_Sub1_13.method958() * 5 / 100;
			local20 += Static111.aClass3_Sub1_14.method958() * 5 / 100;
			local20 += Static27.aClass3_Sub1_3.method958() * 40 / 100;
			local20 += Static29.aClass3_Sub1_4.method958() * 5 / 100;
			local20 += Static85.aClass3_Sub1_8.method958() * 3 / 100;
			local20 += Static100.aClass3_Sub1_12.method958() * 5 / 100;
			local20 += Static100.aClass3_Sub1_11.method958() * 5 / 100;
			local20 += Static113.aClass3_Sub1_16.method958() * 5 / 100;
			local20 += Static112.aClass3_Sub1_15.method958() * 2 / 100;
			if (local20 == 100) {
				Static15.aClass36_181 = Static62.aClass36_777;
				Static57.anInt1497 = 30;
				Static10.anInt241 = 45;
			} else {
				if (local20 != 0) {
					Static15.aClass36_181 = Static49.method949(new Class36[] { Static14.aClass36_1413, Static57.method1055(local20), Static34.aClass36_481 });
				}
				Static57.anInt1497 = 30;
			}
		} else if (Static10.anInt241 == 45) {
			Static1.method7(Static67.aClass11_1, !Static35.aBoolean51);
			Static100.aClass2_Sub3_Sub2_1 = Static109.method1987(Static67.aClass11_1, Static107.aCanvas1);
			Static17.aClass54_1 = new Class54(22050, Static3.anInt1282);
			Static57.anInt1497 = 35;
			Static10.anInt241 = 50;
			Static15.aClass36_181 = Static22.aClass36_310;
		} else if (Static10.anInt241 == 50) {
			local20 = 0;
			if (Static25.aClass2_Sub1_Sub1_Sub2_3 == null) {
				Static25.aClass2_Sub1_Sub1_Sub2_3 = Static117.method1370(Static105.aClass36_1352, Static42.aClass36_555, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static11.aClass2_Sub1_Sub1_Sub2_1 == null) {
				Static11.aClass2_Sub1_Sub1_Sub2_1 = Static117.method1370(Static105.aClass36_1352, Static100.aClass36_1273, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static97.aClass2_Sub1_Sub1_Sub2_4 == null) {
				Static97.aClass2_Sub1_Sub1_Sub2_4 = Static117.method1370(Static105.aClass36_1352, Static111.aClass36_1411, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static48.aClass36_632, Static57.method1055(local20 * 100 / 3), Static34.aClass36_481 });
				Static57.anInt1497 = 40;
			} else {
				Static10.anInt241 = 60;
				Static15.aClass36_181 = Static97.aClass36_1252;
				Static57.anInt1497 = 40;
			}
		} else if (Static10.anInt241 == 60) {
			local20 = Static61.method1117(Static100.aClass3_Sub1_12, Static29.aClass3_Sub1_4);
			local57 = Static39.method757();
			if (local57 > local20) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static49.aClass36_650, Static57.method1055(local20 * 100 / local57), Static34.aClass36_481 });
				Static57.anInt1497 = 50;
			} else {
				Static15.aClass36_181 = Static71.aClass36_884;
				Static57.anInt1497 = 50;
				Static104.method1914(5);
				Static10.anInt241 = 70;
			}
		} else if (Static10.anInt241 == 70) {
			if (Static97.aClass3_Sub1_10.method935()) {
				Static60.method1111(Static97.aClass3_Sub1_10);
				Static105.method1932(Static97.aClass3_Sub1_10);
				Static3.method924(Static27.aClass3_Sub1_3, Static97.aClass3_Sub1_10);
				Static51.method1833(Static35.aBoolean51, Static27.aClass3_Sub1_3, Static97.aClass3_Sub1_10);
				Static39.method760(Static27.aClass3_Sub1_3, Static97.aClass3_Sub1_10);
				Static82.method1501(Static97.aClass3_Sub1_10, Static25.aClass2_Sub1_Sub1_Sub2_3, Static27.aClass3_Sub1_3, Static33.aBoolean13);
				Static56.method1047(Static77.aClass3_Sub1_7, Static97.aClass3_Sub1_10, Static86.aClass3_Sub1_9);
				Static7.method172(Static27.aClass3_Sub1_3, Static97.aClass3_Sub1_10);
				Static69.method1200(Static97.aClass3_Sub1_10);
				Static36.method738(Static97.aClass3_Sub1_10);
				Static38.method749(Static29.aClass3_Sub1_4, Static27.aClass3_Sub1_3, Static23.aClass3_Sub1_2);
				Static15.aClass36_181 = Static112.aClass36_1442;
				Static10.anInt241 = 80;
				Static57.anInt1497 = 60;
			} else {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static20.aClass36_269, Static57.method1055(Static97.aClass3_Sub1_10.method956()), Static34.aClass36_481 });
				Static57.anInt1497 = 60;
			}
		} else if (Static10.anInt241 == 80) {
			local20 = 0;
			if (Static42.aClass2_Sub1_Sub1_Sub3_4 == null) {
				Static42.aClass2_Sub1_Sub1_Sub3_4 = Static63.method1126(Static105.aClass36_1352, Static4.aClass36_73, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static79.aClass2_Sub1_Sub1_Sub3_6 == null) {
				Static79.aClass2_Sub1_Sub1_Sub3_6 = Static63.method1126(Static105.aClass36_1352, Static29.aClass36_424, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static112.aClass2_Sub1_Sub1_Sub1Array52 == null) {
				Static112.aClass2_Sub1_Sub1_Sub1Array52 = Static89.method1639(Static27.aClass36_401, Static105.aClass36_1352, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static57.aClass2_Sub1_Sub1_Sub3Array19 == null) {
				Static57.aClass2_Sub1_Sub1_Sub3Array19 = Static107.method1940(Static66.aClass36_821, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static111.aClass2_Sub1_Sub1_Sub3Array37 == null) {
				Static111.aClass2_Sub1_Sub1_Sub3Array37 = Static107.method1940(Static59.aClass36_758, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static6.aClass2_Sub1_Sub1_Sub3Array4 == null) {
				Static6.aClass2_Sub1_Sub1_Sub3Array4 = Static107.method1940(Static66.aClass36_822, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static112.aClass2_Sub1_Sub1_Sub3Array39 == null) {
				Static112.aClass2_Sub1_Sub1_Sub3Array39 = Static107.method1940(Static60.aClass36_767, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static18.aClass2_Sub1_Sub1_Sub3Array7 == null) {
				Static18.aClass2_Sub1_Sub1_Sub3Array7 = Static107.method1940(Static4.aClass36_66, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static1.aClass2_Sub1_Sub1_Sub3_1 == null) {
				Static1.aClass2_Sub1_Sub1_Sub3_1 = Static63.method1126(Static105.aClass36_1352, Static100.aClass36_1275, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static48.aClass2_Sub1_Sub1_Sub3Array17 == null) {
				Static48.aClass2_Sub1_Sub1_Sub3Array17 = Static107.method1940(Static42.aClass36_556, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static14.aClass2_Sub1_Sub1_Sub3Array38 == null) {
				Static14.aClass2_Sub1_Sub1_Sub3Array38 = Static107.method1940(Static79.aClass36_963, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static89.aClass2_Sub1_Sub1_Sub3Array29 == null) {
				Static89.aClass2_Sub1_Sub1_Sub3Array29 = Static107.method1940(Static45.aClass36_615, Static29.aClass3_Sub1_4, Static105.aClass36_1352);
			} else {
				local20++;
			}
			if (Static96.aClass2_Sub1_Sub1_Sub1Array46 == null) {
				Static96.aClass2_Sub1_Sub1_Sub1Array46 = Static89.method1639(Static62.aClass36_774, Static105.aClass36_1352, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (Static4.aClass2_Sub1_Sub1_Sub1Array5 == null) {
				Static4.aClass2_Sub1_Sub1_Sub1Array5 = Static89.method1639(Static4.aClass36_75, Static105.aClass36_1352, Static29.aClass3_Sub1_4);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static11.aClass36_159, Static57.method1055(local20 * 100 / 14), Static34.aClass36_481 });
				Static57.anInt1497 = 70;
			} else {
				local65 = (int) (Math.random() * 21.0D) - 10;
				Static79.aClass2_Sub1_Sub1_Sub3_6.method1239();
				local57 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 41.0D) - 20;
				local75 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(903) int local903 = 0; local903 < Static57.aClass2_Sub1_Sub1_Sub3Array19.length; local903++) {
					Static57.aClass2_Sub1_Sub1_Sub3Array19[local903].method1235(local69 + local57, local69 + local65, local69 + local75);
				}
				Static112.aClass2_Sub1_Sub1_Sub1Array52[0].method96(local69 + local57, local65 + local69, local69 + local75);
				Static57.anInt1497 = 70;
				Static15.aClass36_181 = Static65.aClass36_819;
				Static10.anInt241 = 85;
			}
		} else if (Static10.anInt241 == 85) {
			local20 = Static8.method177(Static29.aClass3_Sub1_4);
			local57 = Static57.method1054();
			if (local20 < local57) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static10.aClass36_155, Static57.method1055(local20 * 100 / local57), Static34.aClass36_481 });
				Static57.anInt1497 = 80;
			} else {
				Static10.anInt241 = 90;
				Static57.anInt1497 = 80;
				Static15.aClass36_181 = Static77.aClass36_948;
			}
		} else if (Static10.anInt241 == 90) {
			if (Static85.aClass3_Sub1_8.method935()) {
				@Pc(1041) Class62 local1041 = new Class62(Static85.aClass3_Sub1_8, Static29.aClass3_Sub1_4, 20, 0.8D, Static35.aBoolean51 ? 64 : 128);
				Static87.method1601(local1041);
				Static87.method1602(0.8D);
				Static10.anInt241 = 110;
				Static15.aClass36_181 = Static86.aClass36_1037;
				Static57.anInt1497 = 90;
			} else {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static106.aClass36_1331, Static57.method1055(Static85.aClass3_Sub1_8.method956()), Static34.aClass36_481 });
				Static57.anInt1497 = 90;
			}
		} else if (Static10.anInt241 == 110) {
			Static56.aClass60_1 = new Class60();
			Static67.aClass11_1.method237(10, Static56.aClass60_1);
			Static15.aClass36_181 = Static94.aClass36_1182;
			Static10.anInt241 = 120;
			Static57.anInt1497 = 94;
		} else if (Static10.anInt241 == 120) {
			if (Static100.aClass3_Sub1_12.method926(Static17.aClass36_226, Static105.aClass36_1352)) {
				@Pc(1108) Class18 local1108 = new Class18(Static100.aClass3_Sub1_12.method922(Static105.aClass36_1352, Static17.aClass36_226));
				method1961(local1108);
				Static15.aClass36_181 = Static24.aClass36_343;
				Static10.anInt241 = 130;
				Static57.anInt1497 = 96;
			} else {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static83.aClass36_988, Static6.aClass36_79 });
				Static57.anInt1497 = 96;
			}
		} else if (Static10.anInt241 == 130) {
			if (!Static23.aClass3_Sub1_2.method935()) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static104.aClass36_1318, Static57.method1055(Static23.aClass3_Sub1_2.method956() * 4 / 5), Static34.aClass36_481 });
				Static57.anInt1497 = 100;
			} else if (!Static113.aClass3_Sub1_16.method935()) {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static104.aClass36_1318, Static57.method1055(Static113.aClass3_Sub1_16.method956() / 6 + 80), Static34.aClass36_481 });
				Static57.anInt1497 = 100;
			} else if (Static112.aClass3_Sub1_15.method935()) {
				Static15.aClass36_181 = Static105.aClass36_1349;
				Static57.anInt1497 = 100;
				Static10.anInt241 = 140;
			} else {
				Static15.aClass36_181 = Static49.method949(new Class36[] { Static104.aClass36_1318, Static57.method1055(Static112.aClass3_Sub1_15.method956() / 20 + 96), Static34.aClass36_481 });
				Static57.anInt1497 = 100;
			}
		} else if (Static10.anInt241 == 140) {
			Static104.method1914(10);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1964() {
		aClass34_8 = null;
		aClass36_1374 = null;
		aClass31_7 = null;
		aClass36_1373 = null;
	}
}
