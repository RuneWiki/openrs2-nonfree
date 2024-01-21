import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fd", name = "Hb", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fd", name = "Rb", descriptor = "Lclient!id;")
	public static Class34 aClass34_494 = Static9.method266(")1");

	@OriginalMember(owner = "client!fd", name = "Zb", descriptor = "Lclient!id;")
	private static Class34 aClass34_496 = Static9.method266("Connection timed out)3");

	@OriginalMember(owner = "client!fd", name = "Tb", descriptor = "Lclient!id;")
	public static Class34 aClass34_495 = aClass34_496;

	@OriginalMember(owner = "client!fd", name = "yc", descriptor = "[I")
	public static int[] anIntArray107 = new int[25];

	@OriginalMember(owner = "client!fd", name = "Zc", descriptor = "Lclient!id;")
	private static Class34 aClass34_500 = Static9.method266("Loading)3)3)3");

	@OriginalMember(owner = "client!fd", name = "Pc", descriptor = "Lclient!id;")
	public static Class34 aClass34_499 = aClass34_500;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method640() {
		@Pc(25) int local25;
		if (Static32.anInt1440 == 0) {
			Static39.aClass44_1 = new Class44(4, 104, 104, Static98.anIntArrayArrayArray4);
			for (local25 = 0; local25 < 4; local25++) {
				Static114.aClass58Array1[local25] = new Class58(104, 104);
			}
			Static27.aClass1_Sub1_Sub2_Sub1_2 = new Class1_Sub1_Sub2_Sub1(512, 512);
			Static120.aClass34_1467 = Static86.aClass34_1127;
			Static32.anInt1440 = 20;
			Static3.anInt276 = 5;
			return;
		}
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(78) int local78;
		@Pc(82) int local82;
		if (Static32.anInt1440 == 20) {
			@Pc(60) int[] local60 = new int[9];
			for (local62 = 0; local62 < 9; local62++) {
				local72 = local62 * 32 + 15 + 128;
				local78 = local72 * 3 + 600;
				local82 = Class1_Sub1_Sub2_Sub4.anIntArray335[local72];
				local60[local62] = local82 * local78 >> 16;
			}
			Static68.method1164(local60);
			Static3.anInt276 = 10;
			Static32.anInt1440 = 30;
			Static120.aClass34_1467 = Static128.aClass34_1543;
		} else if (Static32.anInt1440 == 30) {
			Static102.aClass35_Sub1_24 = Static42.method725(true, false, 0, true);
			Static9.aClass35_Sub1_7 = Static42.method725(true, false, 1, true);
			Static115.aClass35_Sub1_27 = Static42.method725(true, true, 2, false);
			Static106.aClass35_Sub1_25 = Static42.method725(true, false, 3, true);
			Static133.aClass35_Sub1_29 = Static42.method725(true, false, 4, true);
			Static10.aClass35_Sub1_8 = Static42.method725(true, true, 5, true);
			Static32.aClass35_Sub1_12 = Static42.method725(false, true, 6, true);
			Static74.aClass35_Sub1_16 = Static42.method725(true, false, 7, true);
			Static51.aClass35_Sub1_13 = Static42.method725(true, false, 8, true);
			Static10.aClass35_Sub1_9 = Static42.method725(true, false, 9, true);
			Static128.aClass35_Sub1_28 = Static42.method725(true, false, 10, true);
			Static80.aClass35_Sub1_17 = Static42.method725(true, false, 11, true);
			Static81.aClass35_Sub1_19 = Static42.method725(true, false, 12, true);
			Static42.aClass35_Sub1_10 = Static42.method725(true, true, 13, false);
			Static6.aClass35_Sub1_6 = Static42.method725(false, false, 14, true);
			Static45.aClass35_Sub1_26 = Static42.method725(true, false, 15, true);
			Static32.anInt1440 = 40;
			Static3.anInt276 = 20;
			Static120.aClass34_1467 = Static73.aClass34_955;
		} else if (Static32.anInt1440 == 40) {
			local25 = Static102.aClass35_Sub1_24.method1586() * 4 / 100;
			local25 += Static9.aClass35_Sub1_7.method1586() * 4 / 100;
			local25 += Static115.aClass35_Sub1_27.method1586() * 2 / 100;
			local25 += Static106.aClass35_Sub1_25.method1586() * 2 / 100;
			local25 += Static133.aClass35_Sub1_29.method1586() * 6 / 100;
			local25 += Static10.aClass35_Sub1_8.method1586() * 4 / 100;
			local25 += Static32.aClass35_Sub1_12.method1586() * 2 / 100;
			local25 += Static74.aClass35_Sub1_16.method1586() * 60 / 100;
			local25 += Static51.aClass35_Sub1_13.method1586() * 2 / 100;
			local25 += Static10.aClass35_Sub1_9.method1586() * 2 / 100;
			local25 += Static128.aClass35_Sub1_28.method1586() * 2 / 100;
			local25 += Static80.aClass35_Sub1_17.method1586() * 2 / 100;
			local25 += Static81.aClass35_Sub1_19.method1586() * 2 / 100;
			local25 += Static42.aClass35_Sub1_10.method1586() * 2 / 100;
			local25 += Static6.aClass35_Sub1_6.method1586() * 2 / 100;
			local25 += Static45.aClass35_Sub1_26.method1586() * 2 / 100;
			if (local25 == 100) {
				Static32.anInt1440 = 45;
				Static120.aClass34_1467 = Static27.aClass34_436;
				Static3.anInt276 = 30;
			} else {
				if (local25 != 0) {
					Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static37.aClass34_504, Static85.method1456(local25), Static49.aClass34_712 });
				}
				Static3.anInt276 = 30;
			}
		} else if (Static32.anInt1440 == 45) {
			Static50.method913(!Static21.aBoolean39);
			@Pc(453) Class1_Sub4_Sub1 local453 = new Class1_Sub4_Sub1();
			local453.method307();
			Static98.aClass22_4 = Static72.method1263(Static7.aCanvas1, Static100.aClass15_4, 22050, 0);
			Static98.aClass22_4.method938(local453);
			Static126.method1980(local453, Static45.aClass35_Sub1_26, Static6.aClass35_Sub1_6, Static133.aClass35_Sub1_29);
			Static127.aClass22_3 = Static72.method1263(Static7.aCanvas1, Static100.aClass15_4, 2048, 1);
			Static30.aClass1_Sub4_Sub4_2 = new Class1_Sub4_Sub4();
			Static127.aClass22_3.method938(Static30.aClass1_Sub4_Sub4_2);
			Static110.aClass43_2 = new Class43(22050, Static12.anInt553);
			Static32.anInt1440 = 50;
			Static3.anInt276 = 35;
			Static120.aClass34_1467 = Static22.aClass34_390;
		} else if (Static32.anInt1440 == 50) {
			local25 = 0;
			if (Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3 == null) {
				Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3 = Static73.method1288(Static81.aClass34_1058, Static51.aClass35_Sub1_13, Static100.aClass34_1250, Static42.aClass35_Sub1_10);
			} else {
				local25++;
			}
			if (Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4 == null) {
				Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4 = Static73.method1288(Static81.aClass34_1058, Static51.aClass35_Sub1_13, Static127.aClass34_1017, Static42.aClass35_Sub1_10);
			} else {
				local25++;
			}
			if (Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7 == null) {
				Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7 = Static73.method1288(Static81.aClass34_1058, Static51.aClass35_Sub1_13, Static42.aClass34_574, Static42.aClass35_Sub1_10);
			} else {
				local25++;
			}
			if (local25 < 3) {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static75.aClass34_1007, Static85.method1456(local25 * 100 / 3), Static49.aClass34_712 });
				Static3.anInt276 = 40;
			} else {
				Static120.aClass34_1467 = Static23.aClass34_404;
				Static32.anInt1440 = 60;
				Static3.anInt276 = 40;
			}
		} else if (Static32.anInt1440 == 60) {
			local25 = Static91.method1555(Static128.aClass35_Sub1_28, Static51.aClass35_Sub1_13);
			local62 = Static102.method1712();
			if (local25 < local62) {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static72.aClass34_930, Static85.method1456(local25 * 100 / local62), Static49.aClass34_712 });
				Static3.anInt276 = 50;
			} else {
				Static120.aClass34_1467 = Static110.aClass34_1266;
				Static3.anInt276 = 50;
				Static41.method695(5);
				Static32.anInt1440 = 70;
			}
		} else if (Static32.anInt1440 == 70) {
			if (Static115.aClass35_Sub1_27.method1570()) {
				Static47.method874(Static115.aClass35_Sub1_27);
				Static86.method1465(Static115.aClass35_Sub1_27);
				Static72.method1265(Static74.aClass35_Sub1_16, Static115.aClass35_Sub1_27);
				Static30.method558(Static74.aClass35_Sub1_16, Static115.aClass35_Sub1_27, Static21.aBoolean39);
				Static39.method681(Static74.aClass35_Sub1_16, Static115.aClass35_Sub1_27);
				Static27.method547(Static28.aBoolean177, Static74.aClass35_Sub1_16, Static115.aClass35_Sub1_27, Static16.aClass1_Sub1_Sub2_Sub3_Sub1_3);
				Static11.method281(Static115.aClass35_Sub1_27, Static9.aClass35_Sub1_7, Static102.aClass35_Sub1_24);
				Static26.method497(Static115.aClass35_Sub1_27, Static74.aClass35_Sub1_16);
				method642(Static115.aClass35_Sub1_27);
				Static96.method1641(Static115.aClass35_Sub1_27);
				Static32.method902(Static106.aClass35_Sub1_25, Static51.aClass35_Sub1_13, Static42.aClass35_Sub1_10, Static74.aClass35_Sub1_16);
				Static129.method2018(Static115.aClass35_Sub1_27);
				Static43.method739(Static115.aClass35_Sub1_27);
				Static120.aClass34_1467 = Static128.aClass34_1540;
				Static3.anInt276 = 60;
				Static32.anInt1440 = 80;
			} else {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static3.aClass34_123, Static85.method1456(Static115.aClass35_Sub1_27.method1590()), Static49.aClass34_712 });
				Static3.anInt276 = 60;
			}
		} else if (Static32.anInt1440 == 80) {
			local25 = 0;
			if (Static55.aClass1_Sub1_Sub2_Sub1_3 == null) {
				Static55.aClass1_Sub1_Sub2_Sub1_3 = Static12.method319(Static27.aClass34_437, Static51.aClass35_Sub1_13, Static81.aClass34_1058);
			} else {
				local25++;
			}
			if (Static115.aClass1_Sub1_Sub2_Sub1_5 == null) {
				Static115.aClass1_Sub1_Sub2_Sub1_5 = Static12.method319(Static101.aClass34_1270, Static51.aClass35_Sub1_13, Static81.aClass34_1058);
			} else {
				local25++;
			}
			if (Static91.aClass1_Sub1_Sub2_Sub2Array8 == null) {
				Static91.aClass1_Sub1_Sub2_Sub2Array8 = Static101.method1690(Static51.aClass35_Sub1_13, Static28.aClass34_1558, Static81.aClass34_1058);
			} else {
				local25++;
			}
			if (Static132.aClass1_Sub1_Sub2_Sub1Array10 == null) {
				Static132.aClass1_Sub1_Sub2_Sub1Array10 = Static27.method548(Static91.aClass34_1176, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static6.aClass1_Sub1_Sub2_Sub1Array1 == null) {
				Static6.aClass1_Sub1_Sub2_Sub1Array1 = Static27.method548(Static93.aClass34_1191, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static12.aClass1_Sub1_Sub2_Sub1Array2 == null) {
				Static12.aClass1_Sub1_Sub2_Sub1Array2 = Static27.method548(Static128.aClass34_1544, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static78.aClass1_Sub1_Sub2_Sub1Array7 == null) {
				Static78.aClass1_Sub1_Sub2_Sub1Array7 = Static27.method548(Static16.aClass34_343, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static24.aClass1_Sub1_Sub2_Sub1Array3 == null) {
				Static24.aClass1_Sub1_Sub2_Sub1Array3 = Static27.method548(Static71.aClass34_887, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static64.aClass1_Sub1_Sub2_Sub1Array6 == null) {
				Static64.aClass1_Sub1_Sub2_Sub1Array6 = Static27.method548(Static77.aClass34_1027, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static24.aClass1_Sub1_Sub2_Sub1Array4 == null) {
				Static24.aClass1_Sub1_Sub2_Sub1Array4 = Static27.method548(Static2.aClass34_108, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static95.aClass1_Sub1_Sub2_Sub1Array8 == null) {
				Static95.aClass1_Sub1_Sub2_Sub1Array8 = Static27.method548(Static19.aClass34_349, Static81.aClass34_1058, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (Static67.aClass1_Sub1_Sub2_Sub2Array7 == null) {
				Static67.aClass1_Sub1_Sub2_Sub2Array7 = Static101.method1690(Static51.aClass35_Sub1_13, Static73.aClass34_957, Static81.aClass34_1058);
			} else {
				local25++;
			}
			if (Static54.aClass1_Sub1_Sub2_Sub2Array6 == null) {
				Static54.aClass1_Sub1_Sub2_Sub2Array6 = Static101.method1690(Static51.aClass35_Sub1_13, Static116.aClass34_1429, Static81.aClass34_1058);
			} else {
				local25++;
			}
			if (Static45.aClass1_Sub1_Sub2_Sub2_14 == null) {
				Static45.aClass1_Sub1_Sub2_Sub2_14 = Static43.method740(Static81.aClass34_1058, Static29.aClass34_442, Static51.aClass35_Sub1_13);
			} else {
				local25++;
			}
			if (local25 < 14) {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static99.aClass34_1249, Static85.method1456(local25 * 100 / 14), Static49.aClass34_712 });
				Static3.anInt276 = 70;
			} else {
				Static103.aClass1_Sub1_Sub2_Sub2Array5 = Static54.aClass1_Sub1_Sub2_Sub2Array6;
				local62 = (int) (Math.random() * 21.0D) - 10;
				local72 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 21.0D) - 10;
				Static115.aClass1_Sub1_Sub2_Sub1_5.method177();
				local82 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(953) int local953 = 0; local953 < Static132.aClass1_Sub1_Sub2_Sub1Array10.length; local953++) {
					Static132.aClass1_Sub1_Sub2_Sub1Array10[local953].method188(local62 + local82, local72 + local82, local82 + local78);
				}
				Static91.aClass1_Sub1_Sub2_Sub2Array8[0].method541(local82 + local62, local82 + local72, local78 + local82);
				Static57.method1024();
				Static32.anInt1440 = 90;
				Static120.aClass34_1467 = Static69.aClass34_853;
				Static3.anInt276 = 70;
			}
		} else if (Static32.anInt1440 == 90) {
			if (Static10.aClass35_Sub1_9.method1570()) {
				@Pc(1045) Class74 local1045 = new Class74(Static10.aClass35_Sub1_9, Static51.aClass35_Sub1_13, 20, 0.8D, Static21.aBoolean39 ? 64 : 128);
				Static108.method1781(local1045);
				Static108.method1771(0.8D);
				Static3.anInt276 = 90;
				Static120.aClass34_1467 = Static3.aClass34_114;
				Static32.anInt1440 = 110;
			} else {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static75.aClass34_1006, Static85.method1456(Static10.aClass35_Sub1_9.method1590()), Static49.aClass34_712 });
				Static3.anInt276 = 90;
			}
		} else if (Static32.anInt1440 == 110) {
			Static48.aClass36_1 = new Class36();
			Static100.aClass15_4.method488(10, Static48.aClass36_1);
			Static120.aClass34_1467 = Static70.aClass34_856;
			Static3.anInt276 = 94;
			Static32.anInt1440 = 120;
		} else if (Static32.anInt1440 == 120) {
			if (Static128.aClass35_Sub1_28.method1566(Static89.aClass34_978, Static81.aClass34_1058)) {
				@Pc(1114) Class21 local1114 = new Class21(Static128.aClass35_Sub1_28.method1569(Static89.aClass34_978, Static81.aClass34_1058));
				Static85.method1453(local1114);
				Static3.anInt276 = 96;
				Static32.anInt1440 = 130;
				Static120.aClass34_1467 = Static64.aClass34_809;
			} else {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static114.aClass34_1380, Static109.aClass34_1576 });
				Static3.anInt276 = 96;
			}
		} else if (Static32.anInt1440 == 130) {
			if (!Static106.aClass35_Sub1_25.method1570()) {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static51.aClass34_722, Static85.method1456(Static106.aClass35_Sub1_25.method1590() * 4 / 5), Static49.aClass34_712 });
				Static3.anInt276 = 100;
			} else if (!Static81.aClass35_Sub1_19.method1570()) {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static51.aClass34_722, Static85.method1456(Static81.aClass35_Sub1_19.method1590() / 6 + 80), Static49.aClass34_712 });
				Static3.anInt276 = 100;
			} else if (Static42.aClass35_Sub1_10.method1570()) {
				Static32.anInt1440 = 140;
				Static120.aClass34_1467 = Static114.aClass34_1372;
				Static3.anInt276 = 100;
			} else {
				Static120.aClass34_1467 = Static91.method1554(new Class34[] { Static51.aClass34_722, Static85.method1456(Static42.aClass35_Sub1_10.method1590() / 20 + 96), Static49.aClass34_712 });
				Static3.anInt276 = 100;
			}
		} else if (Static32.anInt1440 == 140) {
			Static41.method695(10);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	public static void method641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static39.aClass44_1.method1145(arg3, arg1, arg0);
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(33) int local33;
		@Pc(55) int local55;
		@Pc(61) int local61;
		if (local11 != 0) {
			local21 = Static39.aClass44_1.method1138(arg3, arg1, arg0, local11);
			local27 = local21 >> 6 & 0x3;
			local31 = local21 & 0x1F;
			local33 = arg2;
			@Pc(36) int[] local36 = Static27.aClass1_Sub1_Sub2_Sub1_2.anIntArray26;
			if (local11 > 0) {
				local33 = arg4;
			}
			local55 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			local61 = local11 >> 14 & 0x7FFF;
			@Pc(65) Class1_Sub1_Sub16 local65 = Static28.method2008(local61);
			if (local65.anInt2972 == -1) {
				if (local31 == 0 || local31 == 2) {
					if (local27 == 0) {
						local36[local55] = local33;
						local36[local55 + 512] = local33;
						local36[local55 + 1024] = local33;
						local36[local55 + 1536] = local33;
					} else if (local27 == 1) {
						local36[local55] = local33;
						local36[local55 + 1] = local33;
						local36[local55 + 2] = local33;
						local36[local55 + 3] = local33;
					} else if (local27 == 2) {
						local36[local55 + 3] = local33;
						local36[local55 + 512 + 3] = local33;
						local36[local55 + 1027] = local33;
						local36[local55 + 1539] = local33;
					} else if (local27 == 3) {
						local36[local55 + 1536] = local33;
						local36[local55 + 1 + 1536] = local33;
						local36[local55 + 1536 + 2] = local33;
						local36[local55 + 1539] = local33;
					}
				}
				if (local31 == 3) {
					if (local27 == 0) {
						local36[local55] = local33;
					} else if (local27 == 1) {
						local36[local55 + 3] = local33;
					} else if (local27 == 2) {
						local36[local55 + 3 + 1536] = local33;
					} else if (local27 == 3) {
						local36[local55 + 1536] = local33;
					}
				}
				if (local31 == 2) {
					if (local27 == 3) {
						local36[local55] = local33;
						local36[local55 + 512] = local33;
						local36[local55 + 1024] = local33;
						local36[local55 + 1536] = local33;
					} else if (local27 == 0) {
						local36[local55] = local33;
						local36[local55 + 1] = local33;
						local36[local55 + 2] = local33;
						local36[local55 + 3] = local33;
					} else if (local27 == 1) {
						local36[local55 + 3] = local33;
						local36[local55 + 515] = local33;
						local36[local55 + 1027] = local33;
						local36[local55 + 1536 + 3] = local33;
					} else if (local27 == 2) {
						local36[local55 + 1536] = local33;
						local36[local55 + 1537] = local33;
						local36[local55 + 1536 + 2] = local33;
						local36[local55 + 3 + 1536] = local33;
					}
				}
			} else {
				@Pc(374) Class1_Sub1_Sub2_Sub2 local374 = Static91.aClass1_Sub1_Sub2_Sub2Array8[local65.anInt2972];
				if (local374 != null) {
					@Pc(387) int local387 = (local65.anInt2962 * 4 - local374.anInt883) / 2;
					@Pc(398) int local398 = (local65.anInt2946 * 4 - local374.anInt880) / 2;
					local374.method542(arg1 * 4 + local387 + 48, local398 + (-local65.anInt2946 + -arg0 + 104) * 4 + 48);
				}
			}
		}
		local11 = Static39.aClass44_1.method1156(arg3, arg1, arg0);
		if (local11 != 0) {
			local21 = Static39.aClass44_1.method1138(arg3, arg1, arg0, local11);
			local27 = local21 >> 6 & 0x3;
			local31 = local21 & 0x1F;
			local33 = local11 >> 14 & 0x7FFF;
			@Pc(462) Class1_Sub1_Sub16 local462 = Static28.method2008(local33);
			@Pc(493) int local493;
			if (local462.anInt2972 != -1) {
				@Pc(561) Class1_Sub1_Sub2_Sub2 local561 = Static91.aClass1_Sub1_Sub2_Sub2Array8[local462.anInt2972];
				if (local561 != null) {
					local61 = (local462.anInt2962 * 4 - local561.anInt883) / 2;
					local493 = (local462.anInt2946 * 4 - local561.anInt880) / 2;
					local561.method542(arg1 * 4 + local61 + 48, (104 - arg0 + -local462.anInt2946) * 4 + 48 + local493);
				}
			} else if (local31 == 9) {
				local55 = 15658734;
				if (local11 > 0) {
					local55 = 15597568;
				}
				@Pc(478) int[] local478 = Static27.aClass1_Sub1_Sub2_Sub1_2.anIntArray26;
				local493 = (52736 - arg0 * 512) * 4 + arg1 * 4 + 24624;
				if (local27 == 0 || local27 == 2) {
					local478[local493 + 1536] = local55;
					local478[local493 + 1024 + 1] = local55;
					local478[local493 + 512 + 2] = local55;
					local478[local493 + 3] = local55;
				} else {
					local478[local493] = local55;
					local478[local493 + 512 + 1] = local55;
					local478[local493 + 1024 + 2] = local55;
					local478[local493 + 1539] = local55;
				}
			}
		}
		local11 = Static39.aClass44_1.method1153(arg3, arg1, arg0);
		if (local11 == 0) {
			return;
		}
		local21 = local11 >> 14 & 0x7FFF;
		@Pc(628) Class1_Sub1_Sub16 local628 = Static28.method2008(local21);
		if (local628.anInt2972 == -1) {
			return;
		}
		@Pc(638) Class1_Sub1_Sub2_Sub2 local638 = Static91.aClass1_Sub1_Sub2_Sub2Array8[local628.anInt2972];
		if (local638 != null) {
			local33 = (local628.anInt2962 * 4 - local638.anInt883) / 2;
			@Pc(662) int local662 = (local628.anInt2946 * 4 - local638.anInt880) / 2;
			local638.method542(local33 + arg1 * 4 + 48, local662 + (48 - -((-arg0 + (104 - local628.anInt2946)) * 4)));
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ie;I)V")
	private static void method642(@OriginalArg(0) Class35 arg0) {
		Static47.aClass35_11 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method647() {
		aClass34_500 = null;
		aClass34_494 = null;
		anIntArray107 = null;
		aClass34_499 = null;
		aClass34_496 = null;
		aClass34_495 = null;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
	public static void method649() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)Z")
	public static boolean method655() {
		return Static93.anInt2429 == 0 ? Static22.aClass1_Sub4_Sub1_1.method327() : true;
	}
}
