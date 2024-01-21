import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
	public static int[] anIntArray185 = new int[100];

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
	public static boolean aBoolean58 = true;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!sg;")
	private static Class77 aClass77_476 = Static146.method2172("Username: ");

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_474 = aClass77_476;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_475 = Static146.method2172("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt1188 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method824() {
		@Pc(20) int local20;
		if (Static63.anInt1681 == 0) {
			Static172.aClass60_1 = new Class60(4, 104, 104, Static122.anIntArrayArrayArray2);
			for (local20 = 0; local20 < 4; local20++) {
				Static27.aClass86Array1[local20] = new Class86(104, 104);
			}
			Static76.aClass2_Sub2_Sub3_Sub2_4 = new Class2_Sub2_Sub3_Sub2(512, 512);
			Static39.aClass77_449 = Static39.aClass77_447;
			Static49.anInt1343 = 5;
			Static63.anInt1681 = 20;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(76) int local76;
		@Pc(69) int local69;
		if (Static63.anInt1681 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local65 = local55 * 32 + 15 + 128;
				local69 = Class2_Sub2_Sub3_Sub1.anIntArray50[local65];
				local76 = local65 * 3 + 600;
				local53[local55] = local69 * local76 >> 16;
			}
			Static116.method2047(local53);
			Static49.anInt1343 = 10;
			Static63.anInt1681 = 30;
			Static39.aClass77_449 = Static180.aClass77_1559;
		} else if (Static63.anInt1681 == 30) {
			Static110.aClass43_Sub1_16 = Static181.method3018(0, false, true, true);
			Static83.aClass43_Sub1_11 = Static181.method3018(1, false, true, true);
			Static8.aClass43_Sub1_1 = Static181.method3018(2, true, true, false);
			Static176.aClass43_Sub1_19 = Static181.method3018(3, false, true, true);
			Static55.aClass43_Sub1_9 = Static181.method3018(4, false, true, true);
			Static120.aClass43_Sub1_6 = Static181.method3018(5, true, true, true);
			Static176.aClass43_Sub1_20 = Static181.method3018(6, true, false, true);
			Static164.aClass43_Sub1_18 = Static181.method3018(7, false, true, true);
			Static91.aClass43_Sub1_12 = Static181.method3018(8, false, true, true);
			Static15.aClass43_Sub1_3 = Static181.method3018(9, true, true, false);
			Static108.aClass43_Sub1_13 = Static181.method3018(10, false, true, true);
			Static125.aClass43_Sub1_15 = Static181.method3018(11, false, true, true);
			Static41.aClass43_Sub1_7 = Static181.method3018(12, false, true, true);
			Static28.aClass43_Sub1_4 = Static181.method3018(13, true, true, false);
			Static161.aClass43_Sub1_17 = Static181.method3018(14, false, false, true);
			Static78.aClass43_Sub1_10 = Static181.method3018(15, false, true, true);
			Static63.anInt1681 = 40;
			Static39.aClass77_449 = Static39.aClass77_440;
			Static49.anInt1343 = 20;
		} else if (Static63.anInt1681 == 40) {
			local20 = Static110.aClass43_Sub1_16.method2232() * 4 / 100;
			local20 += Static83.aClass43_Sub1_11.method2232() * 4 / 100;
			local20 += Static8.aClass43_Sub1_1.method2232() * 2 / 100;
			local20 += Static176.aClass43_Sub1_19.method2232() * 2 / 100;
			local20 += Static55.aClass43_Sub1_9.method2232() * 6 / 100;
			local20 += Static120.aClass43_Sub1_6.method2232() * 4 / 100;
			local20 += Static176.aClass43_Sub1_20.method2232() * 2 / 100;
			local20 += Static164.aClass43_Sub1_18.method2232() * 60 / 100;
			local20 += Static91.aClass43_Sub1_12.method2232() * 2 / 100;
			local20 += Static15.aClass43_Sub1_3.method2232() * 2 / 100;
			local20 += Static108.aClass43_Sub1_13.method2232() * 2 / 100;
			local20 += Static125.aClass43_Sub1_15.method2232() * 2 / 100;
			local20 += Static41.aClass43_Sub1_7.method2232() * 2 / 100;
			local20 += Static28.aClass43_Sub1_4.method2232() * 2 / 100;
			local20 += Static161.aClass43_Sub1_17.method2232() * 2 / 100;
			local20 += Static78.aClass43_Sub1_10.method2232() * 2 / 100;
			if (local20 == 100) {
				Static39.aClass77_449 = Static174.aClass77_1515;
				Static63.anInt1681 = 45;
				Static49.anInt1343 = 30;
			} else {
				if (local20 != 0) {
					Static39.aClass77_449 = Static146.method2168(new Class77[] { Static14.aClass77_225, Static2.method61(local20), Static34.aClass77_399 });
				}
				Static49.anInt1343 = 30;
			}
		} else if (Static63.anInt1681 == 45) {
			Static91.method1670(!Static92.aBoolean101);
			@Pc(444) Class2_Sub9_Sub3 local444 = new Class2_Sub9_Sub3();
			local444.method2467();
			Static18.aClass19_10 = Static110.method2391(22050, Static144.aClass50_4, Static1.aCanvas1, 0);
			Static18.aClass19_10.method895(local444);
			Static168.method2810(Static55.aClass43_Sub1_9, Static161.aClass43_Sub1_17, local444, Static78.aClass43_Sub1_10);
			Static131.aClass19_35 = Static110.method2391(2048, Static144.aClass50_4, Static1.aCanvas1, 1);
			Static153.aClass2_Sub9_Sub4_2 = new Class2_Sub9_Sub4();
			Static131.aClass19_35.method895(Static153.aClass2_Sub9_Sub4_2);
			Static150.aClass27_1 = new Class27(22050, Static63.anInt1680);
			Static39.aClass77_449 = Static161.aClass77_1356;
			Static63.anInt1681 = 50;
			Static49.anInt1343 = 35;
		} else if (Static63.anInt1681 == 50) {
			local20 = 0;
			if (Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5 == null) {
				Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5 = Static41.method806(Static160.aClass77_1556, Static41.aClass77_468, Static91.aClass43_Sub1_12, Static28.aClass43_Sub1_4);
			} else {
				local20++;
			}
			if (Static120.aClass2_Sub2_Sub3_Sub4_Sub1_2 == null) {
				Static120.aClass2_Sub2_Sub3_Sub4_Sub1_2 = Static99.aClass2_Sub2_Sub3_Sub4_Sub1_5;
			} else {
				local20++;
			}
			if (Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3 == null) {
				Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3 = Static41.method806(Static96.aClass77_935, Static41.aClass77_468, Static91.aClass43_Sub1_12, Static28.aClass43_Sub1_4);
			} else {
				local20++;
			}
			if (Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4 == null) {
				Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4 = Static41.method806(Static67.aClass77_744, Static41.aClass77_468, Static91.aClass43_Sub1_12, Static28.aClass43_Sub1_4);
			} else {
				local20++;
			}
			if (local20 < 4) {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static157.aClass77_1330, Static2.method61(local20 * 100 / 4), Static34.aClass77_399 });
				Static49.anInt1343 = 40;
			} else {
				Static39.aClass77_449 = Static158.aClass77_1343;
				Static49.anInt1343 = 40;
				Static63.anInt1681 = 60;
			}
		} else if (Static63.anInt1681 == 60) {
			local20 = Static3.method70(Static91.aClass43_Sub1_12, Static108.aClass43_Sub1_13);
			local55 = Static181.method3017();
			if (local20 < local55) {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static75.aClass77_795, Static2.method61(local20 * 100 / local55), Static34.aClass77_399 });
				Static49.anInt1343 = 50;
			} else {
				Static49.anInt1343 = 50;
				Static39.aClass77_449 = Static39.aClass77_442;
				Static123.method2155(5);
				Static63.anInt1681 = 70;
			}
		} else if (Static63.anInt1681 == 70) {
			if (Static8.aClass43_Sub1_1.method2221()) {
				Static45.method830(Static8.aClass43_Sub1_1);
				Static138.method2315(Static8.aClass43_Sub1_1);
				Static61.method1149(Static8.aClass43_Sub1_1, Static164.aClass43_Sub1_18);
				Static86.method1587(Static164.aClass43_Sub1_18, Static92.aBoolean101, Static8.aClass43_Sub1_1);
				Static118.method2102(Static164.aClass43_Sub1_18, Static8.aClass43_Sub1_1);
				Static31.method613(Static8.aClass43_Sub1_1, Static153.aBoolean154, Static164.aClass43_Sub1_18, Static120.aClass2_Sub2_Sub3_Sub4_Sub1_2);
				Static139.method2328(Static8.aClass43_Sub1_1, Static110.aClass43_Sub1_16, Static83.aClass43_Sub1_11);
				Static10.method151(Static164.aClass43_Sub1_18, Static8.aClass43_Sub1_1);
				Static11.method175(Static8.aClass43_Sub1_1);
				Static126.method1616(Static8.aClass43_Sub1_1);
				Static154.method2639(Static28.aClass43_Sub1_4, Static176.aClass43_Sub1_19, Static91.aClass43_Sub1_12, Static164.aClass43_Sub1_18);
				Static119.method2125(Static8.aClass43_Sub1_1);
				Static84.method2227(Static8.aClass43_Sub1_1);
				Static39.aClass77_449 = Static72.aClass77_773;
				Static63.anInt1681 = 80;
				Static49.anInt1343 = 60;
			} else {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static37.aClass77_425, Static2.method61(Static8.aClass43_Sub1_1.method2236()), Static34.aClass77_399 });
				Static49.anInt1343 = 60;
			}
		} else if (Static63.anInt1681 == 80) {
			local20 = 0;
			if (Static58.aClass2_Sub2_Sub3_Sub2_3 == null) {
				Static58.aClass2_Sub2_Sub3_Sub2_3 = Static79.method1469(Static91.aClass43_Sub1_12, Static28.aClass77_342, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static55.aClass2_Sub2_Sub3_Sub2_2 == null) {
				Static55.aClass2_Sub2_Sub3_Sub2_2 = Static79.method1469(Static91.aClass43_Sub1_12, Static17.aClass77_267, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static55.aClass2_Sub2_Sub3_Sub3Array9 == null) {
				Static55.aClass2_Sub2_Sub3_Sub3Array9 = Static15.method327(Static170.aClass77_1440, Static41.aClass77_468, Static91.aClass43_Sub1_12);
			} else {
				local20++;
			}
			if (Static150.aClass2_Sub2_Sub3_Sub2Array11 == null) {
				Static150.aClass2_Sub2_Sub3_Sub2Array11 = Static166.method2917(Static91.aClass43_Sub1_12, Static4.aClass77_1497, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static83.aClass2_Sub2_Sub3_Sub2Array4 == null) {
				Static83.aClass2_Sub2_Sub3_Sub2Array4 = Static166.method2917(Static91.aClass43_Sub1_12, Static46.aClass77_484, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static6.aClass2_Sub2_Sub3_Sub2Array1 == null) {
				Static6.aClass2_Sub2_Sub3_Sub2Array1 = Static166.method2917(Static91.aClass43_Sub1_12, Static1.aClass77_4, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static133.aClass2_Sub2_Sub3_Sub2Array10 == null) {
				Static133.aClass2_Sub2_Sub3_Sub2Array10 = Static166.method2917(Static91.aClass43_Sub1_12, Static18.aClass77_268, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static167.aClass2_Sub2_Sub3_Sub2Array12 == null) {
				Static167.aClass2_Sub2_Sub3_Sub2Array12 = Static166.method2917(Static91.aClass43_Sub1_12, Static52.aClass77_566, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static98.aClass2_Sub2_Sub3_Sub2Array7 == null) {
				Static98.aClass2_Sub2_Sub3_Sub2Array7 = Static166.method2917(Static91.aClass43_Sub1_12, Static120.aClass77_404, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static84.aClass2_Sub2_Sub3_Sub2Array9 == null) {
				Static84.aClass2_Sub2_Sub3_Sub2Array9 = Static166.method2917(Static91.aClass43_Sub1_12, Static70.aClass77_755, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static107.aClass2_Sub2_Sub3_Sub2Array8 == null) {
				Static107.aClass2_Sub2_Sub3_Sub2Array8 = Static166.method2917(Static91.aClass43_Sub1_12, Static143.aClass77_1247, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (Static27.aClass2_Sub2_Sub3_Sub3Array4 == null) {
				Static27.aClass2_Sub2_Sub3_Sub3Array4 = Static15.method327(Static77.aClass77_810, Static41.aClass77_468, Static91.aClass43_Sub1_12);
			} else {
				local20++;
			}
			if (Static34.aClass2_Sub2_Sub3_Sub3Array6 == null) {
				Static34.aClass2_Sub2_Sub3_Sub3Array6 = Static15.method327(Static114.aClass77_1067, Static41.aClass77_468, Static91.aClass43_Sub1_12);
			} else {
				local20++;
			}
			if (Static100.aClass2_Sub2_Sub3_Sub3_2 == null) {
				Static100.aClass2_Sub2_Sub3_Sub3_2 = Static179.method2997(Static125.aClass77_1121, Static91.aClass43_Sub1_12, Static41.aClass77_468);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static115.aClass77_1078, Static2.method61(local20 * 100 / 14), Static34.aClass77_399 });
				Static49.anInt1343 = 70;
			} else {
				Static102.aClass2_Sub2_Sub3_Sub3Array11 = Static34.aClass2_Sub2_Sub3_Sub3Array6;
				Static55.aClass2_Sub2_Sub3_Sub2_2.method390();
				local76 = (int) (Math.random() * 21.0D) - 10;
				local65 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 41.0D) - 20;
				local55 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(949) int local949 = 0; local949 < Static150.aClass2_Sub2_Sub3_Sub2Array11.length; local949++) {
					Static150.aClass2_Sub2_Sub3_Sub2Array11[local949].method394(local55 + local69, local65 + local69, local76 + local69);
				}
				Static55.aClass2_Sub2_Sub3_Sub3Array9[0].method1022(local69 + local55, local65 + local69, local76 + local69);
				Static66.method1326();
				Static63.anInt1681 = 90;
				Static49.anInt1343 = 70;
				Static39.aClass77_449 = Static85.aClass77_870;
			}
		} else if (Static63.anInt1681 == 90) {
			if (Static15.aClass43_Sub1_3.method2221()) {
				@Pc(1042) Class46 local1042 = new Class46(Static15.aClass43_Sub1_3, Static91.aClass43_Sub1_12, 20, Static92.aBoolean101 ? 64 : 128);
				Static12.method242(local1042);
				Static12.method240(0.7F);
				Static49.anInt1343 = 90;
				Static39.aClass77_449 = Static155.aClass77_1320;
				Static63.anInt1681 = 110;
			} else {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static27.aClass77_340, Static2.method61(Static15.aClass43_Sub1_3.method2236()), Static34.aClass77_399 });
				Static49.anInt1343 = 90;
			}
		} else if (Static63.anInt1681 == 110) {
			Static55.aClass40_1 = new Class40();
			Static144.aClass50_4.method1748(Static55.aClass40_1, 10);
			Static63.anInt1681 = 120;
			Static49.anInt1343 = 94;
			Static39.aClass77_449 = Static51.aClass77_546;
		} else if (Static63.anInt1681 == 120) {
			if (Static108.aClass43_Sub1_13.method2214(Static146.aClass77_1125, Static41.aClass77_468)) {
				@Pc(1111) Class34 local1111 = new Class34(Static108.aClass43_Sub1_13.method2212(Static41.aClass77_468, Static146.aClass77_1125));
				Static121.method2131(local1111);
				Static39.aClass77_449 = Static71.aClass77_767;
				Static49.anInt1343 = 96;
				Static63.anInt1681 = 130;
			} else {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static94.aClass77_924, Static76.aClass77_802 });
				Static49.anInt1343 = 96;
			}
		} else if (Static63.anInt1681 == 130) {
			if (!Static176.aClass43_Sub1_19.method2221()) {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static6.aClass77_64, Static2.method61(Static176.aClass43_Sub1_19.method2236() * 4 / 5), Static34.aClass77_399 });
				Static49.anInt1343 = 100;
			} else if (!Static41.aClass43_Sub1_7.method2221()) {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static6.aClass77_64, Static2.method61(Static41.aClass43_Sub1_7.method2236() / 6 + 80), Static34.aClass77_399 });
				Static49.anInt1343 = 100;
			} else if (Static28.aClass43_Sub1_4.method2221()) {
				Static49.anInt1343 = 100;
				Static63.anInt1681 = 140;
				Static39.aClass77_449 = Static155.aClass77_1315;
			} else {
				Static39.aClass77_449 = Static146.method2168(new Class77[] { Static6.aClass77_64, Static2.method61(Static28.aClass43_Sub1_4.method2236() / 20 + 96), Static34.aClass77_399 });
				Static49.anInt1343 = 100;
			}
		} else if (Static63.anInt1681 == 140) {
			Static123.method2155(10);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public static void method828() {
		aClass77_474 = null;
		aClass77_475 = null;
		aBooleanArray5 = null;
		aClass77_476 = null;
		anIntArray185 = null;
	}
}
