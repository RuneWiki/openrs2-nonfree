import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gh", name = "Mc", descriptor = "I")
	public static int anInt1539;

	@OriginalMember(owner = "client!gh", name = "Oc", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!gh", name = "oc", descriptor = "Lclient!nd;")
	public static Class59 aClass59_14 = new Class59(200);

	@OriginalMember(owner = "client!gh", name = "wc", descriptor = "Lclient!tg;")
	public static Class81 aClass81_517 = Static120.method2057("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!gh", name = "Lc", descriptor = "Lclient!tg;")
	public static Class81 aClass81_519 = Static120.method2057("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V")
	public static void method1103() {
		aClass59_14 = null;
		anIntArray125 = null;
		aClass81_519 = null;
		aClass81_517 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ka;I)Lclient!ba;")
	public static Class1_Sub5 method1104(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method336();
		@Pc(13) int local13 = arg0.method336();
		@Pc(17) Class local17 = Static77.method1341(local13);
		try {
			@Pc(21) Class1_Sub5 local21 = (Class1_Sub5) local17.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt4136 = local9;
				local21.anInt4134 = arg0.method336();
				@Pc(39) int local39 = arg0.method336();
				for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
					@Pc(47) int local47 = arg0.method336();
					local21.method3148(arg0, local47);
				}
			}
			local21.method3146();
			return local21;
		} catch (@Pc(66) IllegalAccessException local66) {
			throw new RuntimeException();
		} catch (@Pc(71) InstantiationException local71) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)V")
	public static void method1106() {
		@Pc(14) int local14;
		if (Static114.anInt2137 == 0) {
			Static176.method3054(Static157.anIntArrayArrayArray7);
			for (local14 = 0; local14 < 4; local14++) {
				Static141.aClass28Array2[local14] = new Class28(104, 104);
			}
			Static114.aClass1_Sub2_Sub2_Sub3_7 = new Class1_Sub2_Sub2_Sub3(512, 512);
			Static165.aClass81_1338 = Static112.aClass81_917;
			Static44.anInt1088 = 5;
			Static114.anInt2137 = 20;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		@Pc(65) int local65;
		@Pc(69) int local69;
		if (Static114.anInt2137 == 20) {
			@Pc(47) int[] local47 = new int[9];
			for (local49 = 0; local49 < 9; local49++) {
				local59 = local49 * 32 + 128 + 15;
				local65 = local59 * 3 + 600;
				local69 = Class1_Sub2_Sub2_Sub1.anIntArray30[local59];
				local47[local49] = local65 * local69 >> 16;
			}
			Static173.method3044(local47);
			Static165.aClass81_1338 = Static96.aClass81_740;
			Static44.anInt1088 = 10;
			Static114.anInt2137 = 30;
		} else if (Static114.anInt2137 == 30) {
			Static144.aClass82_Sub1_14 = Static113.method1995(false, true, true, 0);
			Static176.aClass82_Sub1_18 = Static113.method1995(false, true, true, 1);
			Static129.aClass82_Sub1_13 = Static113.method1995(true, false, true, 2);
			Static149.aClass82_Sub1_15 = Static113.method1995(false, true, true, 3);
			Static7.aClass82_Sub1_2 = Static113.method1995(false, true, true, 4);
			Static17.aClass82_Sub1_6 = Static113.method1995(true, true, true, 5);
			Static158.aClass82_Sub1_17 = Static113.method1995(true, true, false, 6);
			Static3.aClass82_Sub1_1 = Static113.method1995(false, true, true, 7);
			Static104.aClass82_Sub1_11 = Static113.method1995(false, true, true, 8);
			Static19.aClass82_Sub1_7 = Static113.method1995(true, false, true, 9);
			Static111.aClass82_Sub1_12 = Static113.method1995(false, true, true, 10);
			Static14.aClass82_Sub1_3 = Static113.method1995(false, true, true, 11);
			Static152.aClass82_Sub1_16 = Static113.method1995(false, true, true, 12);
			Static98.aClass82_Sub1_10 = Static113.method1995(true, false, true, 13);
			Static15.aClass82_Sub1_5 = Static113.method1995(false, true, false, 14);
			Static43.aClass82_Sub1_8 = Static113.method1995(false, true, true, 15);
			Static165.aClass81_1338 = Static125.aClass81_995;
			Static44.anInt1088 = 20;
			Static114.anInt2137 = 40;
		} else if (Static114.anInt2137 == 40) {
			local14 = Static144.aClass82_Sub1_14.method2978() * 4 / 100;
			local14 += Static176.aClass82_Sub1_18.method2978() * 4 / 100;
			local14 += Static129.aClass82_Sub1_13.method2978() * 2 / 100;
			local14 += Static149.aClass82_Sub1_15.method2978() * 2 / 100;
			local14 += Static7.aClass82_Sub1_2.method2978() * 6 / 100;
			local14 += Static17.aClass82_Sub1_6.method2978() * 4 / 100;
			local14 += Static158.aClass82_Sub1_17.method2978() * 2 / 100;
			local14 += Static3.aClass82_Sub1_1.method2978() * 60 / 100;
			local14 += Static104.aClass82_Sub1_11.method2978() * 2 / 100;
			local14 += Static19.aClass82_Sub1_7.method2978() * 2 / 100;
			local14 += Static111.aClass82_Sub1_12.method2978() * 2 / 100;
			local14 += Static14.aClass82_Sub1_3.method2978() * 2 / 100;
			local14 += Static152.aClass82_Sub1_16.method2978() * 2 / 100;
			local14 += Static98.aClass82_Sub1_10.method2978() * 2 / 100;
			local14 += Static15.aClass82_Sub1_5.method2978() * 2 / 100;
			local14 += Static43.aClass82_Sub1_8.method2978() * 2 / 100;
			if (local14 == 100) {
				Static165.aClass81_1338 = Static7.aClass81_80;
				Static44.anInt1088 = 30;
				Static168.method2982(Static158.aClass82_Sub1_17, Static104.aClass82_Sub1_11, Static111.aClass82_Sub1_12);
				Static114.anInt2137 = 45;
			} else {
				if (local14 != 0) {
					Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static24.aClass81_203, Static149.method2548(local14), Static141.aClass81_247 });
				}
				Static44.anInt1088 = 30;
			}
		} else if (Static114.anInt2137 == 45) {
			Static2.method21(!Static50.aBoolean45);
			@Pc(468) Class1_Sub10_Sub3 local468 = new Class1_Sub10_Sub3();
			local468.method1293();
			Static139.aClass31_2 = Static183.method3130(Static114.aCanvas3, 0, Static86.aClass68_2, 22050);
			Static139.aClass31_2.method2992(local468);
			Static52.method930(local468, Static43.aClass82_Sub1_8, Static7.aClass82_Sub1_2, Static15.aClass82_Sub1_5);
			Static80.aClass31_1 = Static183.method3130(Static114.aCanvas3, 1, Static86.aClass68_2, 2048);
			Static25.aClass1_Sub10_Sub1_1 = new Class1_Sub10_Sub1();
			Static80.aClass31_1.method2992(Static25.aClass1_Sub10_Sub1_1);
			Static34.aClass18_1 = new Class18(22050, Static185.anInt3915);
			Static114.anInt2137 = 50;
			Static165.aClass81_1338 = Static90.aClass81_697;
			Static44.anInt1088 = 35;
		} else if (Static114.anInt2137 == 50) {
			local14 = 0;
			if (Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2 == null) {
				Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2 = Static174.method2957(Static1.aClass81_8, Static104.aClass82_Sub1_11, Static98.aClass82_Sub1_10, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static139.aClass1_Sub2_Sub2_Sub2_Sub1_4 == null) {
				Static139.aClass1_Sub2_Sub2_Sub2_Sub1_4 = Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2;
			} else {
				local14++;
			}
			if (Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5 == null) {
				Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5 = Static174.method2957(Static34.aClass81_320, Static104.aClass82_Sub1_11, Static98.aClass82_Sub1_10, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3 == null) {
				Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3 = Static174.method2957(Static88.aClass81_690, Static104.aClass82_Sub1_11, Static98.aClass82_Sub1_10, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static44.aClass81_386, Static149.method2548(local14 * 100 / 4), Static141.aClass81_247 });
				Static44.anInt1088 = 40;
			} else {
				Static114.anInt2137 = 60;
				Static44.anInt1088 = 40;
				Static165.aClass81_1338 = Static77.aClass81_624;
			}
		} else if (Static114.anInt2137 == 60) {
			local14 = Static66.method1197(Static104.aClass82_Sub1_11, Static111.aClass82_Sub1_12);
			local49 = Static112.method1962();
			if (local49 > local14) {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static26.aClass81_229, Static149.method2548(local14 * 100 / local49), Static141.aClass81_247 });
				Static44.anInt1088 = 50;
			} else {
				Static165.aClass81_1338 = Static77.aClass81_627;
				Static44.anInt1088 = 50;
				Static142.method2392(5);
				Static114.anInt2137 = 70;
			}
		} else if (Static114.anInt2137 == 70) {
			if (Static129.aClass82_Sub1_13.method2960()) {
				Static166.method2906(Static129.aClass82_Sub1_13);
				Static82.method1384(Static129.aClass82_Sub1_13);
				Static153.method2673(Static3.aClass82_Sub1_1, Static129.aClass82_Sub1_13);
				Static114.method1634(Static129.aClass82_Sub1_13, Static50.aBoolean45, Static3.aClass82_Sub1_1);
				Static85.method324(Static129.aClass82_Sub1_13, Static3.aClass82_Sub1_1);
				Static30.method639(Static3.aClass82_Sub1_1, Static44.aBoolean40, Static129.aClass82_Sub1_13, Static139.aClass1_Sub2_Sub2_Sub2_Sub1_4);
				Static92.method1575(Static176.aClass82_Sub1_18, Static144.aClass82_Sub1_14, Static129.aClass82_Sub1_13);
				Static74.method1320(Static129.aClass82_Sub1_13, Static3.aClass82_Sub1_1);
				Static89.method3069(Static129.aClass82_Sub1_13);
				Static163.method2848(Static129.aClass82_Sub1_13);
				Static89.method3070(Static149.aClass82_Sub1_15, Static98.aClass82_Sub1_10, Static104.aClass82_Sub1_11, Static3.aClass82_Sub1_1);
				Static77.method1346(Static129.aClass82_Sub1_13);
				Static113.method1999(Static129.aClass82_Sub1_13);
				Static165.aClass81_1338 = Static45.aClass81_399;
				Static44.anInt1088 = 60;
				Static62.method1109();
				Static114.anInt2137 = 80;
			} else {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static10.aClass81_102, Static149.method2548(Static129.aClass82_Sub1_13.method2975()), Static141.aClass81_247 });
				Static44.anInt1088 = 60;
			}
		} else if (Static114.anInt2137 == 80) {
			local14 = 0;
			if (Static148.aClass1_Sub2_Sub2_Sub3_10 == null) {
				Static148.aClass1_Sub2_Sub2_Sub3_10 = Static82.method1382(Static149.aClass81_1213, Static77.aClass81_626, Static104.aClass82_Sub1_11);
			} else {
				local14++;
			}
			if (Static178.aClass1_Sub2_Sub2_Sub4Array12 == null) {
				Static178.aClass1_Sub2_Sub2_Sub4Array12 = Static54.method965(Static149.aClass81_1213, Static104.aClass82_Sub1_11, Static170.aClass81_1381);
			} else {
				local14++;
			}
			if (Static131.aClass1_Sub2_Sub2_Sub3Array9 == null) {
				Static131.aClass1_Sub2_Sub2_Sub3Array9 = Static131.method2246(Static104.aClass82_Sub1_11, Static160.aClass81_1305, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static9.aClass1_Sub2_Sub2_Sub3Array2 == null) {
				Static9.aClass1_Sub2_Sub2_Sub3Array2 = Static131.method2246(Static104.aClass82_Sub1_11, Static1.aClass81_10, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static135.aClass1_Sub2_Sub2_Sub3Array7 == null) {
				Static135.aClass1_Sub2_Sub2_Sub3Array7 = Static131.method2246(Static104.aClass82_Sub1_11, Static121.aClass81_982, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static146.aClass1_Sub2_Sub2_Sub3Array10 == null) {
				Static146.aClass1_Sub2_Sub2_Sub3Array10 = Static131.method2246(Static104.aClass82_Sub1_11, Static174.aClass81_1359, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static107.aClass1_Sub2_Sub2_Sub3Array8 == null) {
				Static107.aClass1_Sub2_Sub2_Sub3Array8 = Static131.method2246(Static104.aClass82_Sub1_11, Static115.aClass81_949, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static36.aClass1_Sub2_Sub2_Sub3Array3 == null) {
				Static36.aClass1_Sub2_Sub2_Sub3Array3 = Static131.method2246(Static104.aClass82_Sub1_11, Static19.aClass81_161, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static181.aClass1_Sub2_Sub2_Sub3Array12 == null) {
				Static181.aClass1_Sub2_Sub2_Sub3Array12 = Static131.method2246(Static104.aClass82_Sub1_11, Static10.aClass81_104, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static32.aClass1_Sub2_Sub2_Sub3_8 == null) {
				Static32.aClass1_Sub2_Sub2_Sub3_8 = Static82.method1382(Static149.aClass81_1213, Static41.aClass81_367, Static104.aClass82_Sub1_11);
			} else {
				local14++;
			}
			if (Static173.aClass1_Sub2_Sub2_Sub3Array11 == null) {
				Static173.aClass1_Sub2_Sub2_Sub3Array11 = Static131.method2246(Static104.aClass82_Sub1_11, Static136.aClass81_1047, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static7.aClass1_Sub2_Sub2_Sub3Array1 == null) {
				Static7.aClass1_Sub2_Sub2_Sub3Array1 = Static131.method2246(Static104.aClass82_Sub1_11, Static185.aClass81_1373, Static149.aClass81_1213);
			} else {
				local14++;
			}
			if (Static69.aClass1_Sub2_Sub2_Sub4Array5 == null) {
				Static69.aClass1_Sub2_Sub2_Sub4Array5 = Static54.method965(Static149.aClass81_1213, Static104.aClass82_Sub1_11, Static183.aClass81_1439);
			} else {
				local14++;
			}
			if (Static110.aClass1_Sub2_Sub2_Sub4Array8 == null) {
				Static110.aClass1_Sub2_Sub2_Sub4Array8 = Static54.method965(Static149.aClass81_1213, Static104.aClass82_Sub1_11, Static57.aClass81_476);
			} else {
				local14++;
			}
			if (local14 < 14) {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static11.aClass81_222, Static149.method2548(local14 * 100 / 13), Static141.aClass81_247 });
				Static44.anInt1088 = 70;
			} else {
				Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
				Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
				Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
				if (Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2 != Static139.aClass1_Sub2_Sub2_Sub2_Sub1_4) {
					Static139.aClass1_Sub2_Sub2_Sub2_Sub1_4.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
				}
				for (local49 = 0; local49 < Static181.aClass1_Sub2_Sub2_Sub3Array12.length; local49++) {
					Static181.aClass1_Sub2_Sub2_Sub3Array12[local49].method2120();
				}
				local59 = (int) (Math.random() * 21.0D) - 10;
				local65 = (int) (Math.random() * 21.0D) - 10;
				Static148.aClass1_Sub2_Sub2_Sub3_10.method2120();
				@Pc(1024) int local1024 = (int) (Math.random() * 41.0D) - 20;
				local69 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1033) int local1033 = 0; local1033 < Static131.aClass1_Sub2_Sub2_Sub3Array9.length; local1033++) {
					Static131.aClass1_Sub2_Sub2_Sub3Array9[local1033].method2121(local59 + local1024, local1024 + local65, local1024 + local69);
				}
				Static178.aClass1_Sub2_Sub2_Sub4Array12[0].method2583(local59 + local1024, local1024 + local65, local69 + local1024);
				Static44.anInt1088 = 70;
				Static165.aClass81_1338 = Static144.aClass81_1131;
				Static114.anInt2137 = 90;
			}
		} else if (Static114.anInt2137 == 90) {
			if (Static19.aClass82_Sub1_7.method2960()) {
				@Pc(1125) Class27 local1125 = new Class27(Static19.aClass82_Sub1_7, Static104.aClass82_Sub1_11, 20, Static50.aBoolean45 ? 64 : 128);
				Static22.method489(local1125);
				Static22.method497(0.7F);
				Static114.anInt2137 = 110;
				Static44.anInt1088 = 90;
				Static165.aClass81_1338 = Static1.aClass81_9;
			} else {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static131.aClass81_1028, Static149.method2548(Static19.aClass82_Sub1_7.method2975()), Static141.aClass81_247 });
				Static44.anInt1088 = 90;
			}
		} else if (Static114.anInt2137 == 110) {
			Static40.aClass51_1 = new Class51();
			Static86.aClass68_2.method2226(10, Static40.aClass51_1);
			Static165.aClass81_1338 = Static102.aClass81_789;
			Static44.anInt1088 = 94;
			Static114.anInt2137 = 120;
		} else if (Static114.anInt2137 == 120) {
			if (Static111.aClass82_Sub1_12.method2949(Static173.aClass81_1396, Static149.aClass81_1213)) {
				@Pc(1194) Class63 local1194 = new Class63(Static111.aClass82_Sub1_12.method2951(Static149.aClass81_1213, Static173.aClass81_1396));
				Static112.method1968(local1194);
				Static44.anInt1088 = 96;
				Static114.anInt2137 = 130;
				Static165.aClass81_1338 = Static129.aClass81_1024;
			} else {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static152.aClass81_1249, Static70.aClass81_589 });
				Static44.anInt1088 = 96;
			}
		} else if (Static114.anInt2137 == 130) {
			if (!Static149.aClass82_Sub1_15.method2960()) {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static67.aClass81_560, Static149.method2548(Static149.aClass82_Sub1_15.method2975() * 4 / 5), Static141.aClass81_247 });
				Static44.anInt1088 = 100;
			} else if (!Static152.aClass82_Sub1_16.method2960()) {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static67.aClass81_560, Static149.method2548(Static152.aClass82_Sub1_16.method2975() / 6 + 80), Static141.aClass81_247 });
				Static44.anInt1088 = 100;
			} else if (Static98.aClass82_Sub1_10.method2960()) {
				Static165.aClass81_1338 = Static96.aClass81_744;
				Static44.anInt1088 = 100;
				Static114.anInt2137 = 140;
			} else {
				Static165.aClass81_1338 = Static127.method2169(new Class81[] { Static67.aClass81_560, Static149.method2548(Static98.aClass82_Sub1_10.method2975() / 20 + 96), Static141.aClass81_247 });
				Static44.anInt1088 = 100;
			}
		} else if (Static114.anInt2137 == 140) {
			Static17.aClass82_Sub1_6.method2943(false);
			Static158.aClass82_Sub1_17.method2943(true);
			Static104.aClass82_Sub1_11.method2943(true);
			Static98.aClass82_Sub1_10.method2943(true);
			Static111.aClass82_Sub1_12.method2943(true);
			Static142.method2392(10);
		}
	}
}
