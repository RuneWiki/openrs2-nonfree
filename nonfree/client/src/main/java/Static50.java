import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array52;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!te;")
	public static Class6_Sub2_Sub14 aClass6_Sub2_Sub14_53;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1363 = Static34.method846(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1364 = Static34.method846("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1365 = Static34.method846("backleft2");

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1366 = Static34.method846("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1367 = Static34.method846("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1368 = aClass55_1364;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([BZBI)V")
	public static void method2079(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static57.aClass5_1 == null) {
			return;
		}
		if (Static49.anInt1569 >= 0) {
			Static57.aClass5_1.method1606();
			Static49.anInt1569 = -1;
			Static52.anInt1647 = 20;
			Static104.anInt3067 = 0;
			Static93.aByteArray13 = null;
		}
		if (arg0 == null) {
			return;
		}
		if (Static52.anInt1647 > 0) {
			Static57.aClass5_1.method1602(arg2);
			Static52.anInt1647 = 0;
		}
		Static49.anInt1569 = arg2;
		Static57.aClass5_1.method1600(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method2080() {
		aClass55_1365 = null;
		aClass55_1364 = null;
		aClass55_1363 = null;
		aClass6_Sub2_Sub14_53 = null;
		aClass55_1368 = null;
		aClass55_1366 = null;
		aClass55_1367 = null;
		aClass6_Sub2_Sub2_Sub1Array52 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method2081() {
		@Pc(20) int local20;
		if (Static28.anInt1136 == 0) {
			Static109.aClass34_1 = new Class34(4, 104, 104, Static6.anIntArrayArrayArray1);
			for (local20 = 0; local20 < 4; local20++) {
				Static96.aClass57Array1[local20] = new Class57(104, 104);
			}
			Static67.aClass6_Sub2_Sub2_Sub2_12 = new Class6_Sub2_Sub2_Sub2(512, 512);
			Static102.anInt3022 = 5;
			Static29.aClass55_434 = Static15.aClass55_283;
			Static28.anInt1136 = 20;
			return;
		}
		@Pc(57) int local57;
		@Pc(68) int local68;
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (Static28.anInt1136 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local68 = local57 * 32 + 128 + 15;
				local74 = local68 * 3 + 600;
				local78 = Class6_Sub2_Sub2_Sub3.anIntArray77[local68];
				local55[local57] = local74 * local78 >> 16;
			}
			Static48.method1038(local55);
			Static28.anInt1136 = 30;
			Static102.anInt3022 = 10;
			Static29.aClass55_434 = Static10.aClass55_249;
		} else if (Static28.anInt1136 == 30) {
			Static87.aClass40_Sub1_29 = Static45.method990(0, false, true, true);
			Static41.aClass40_Sub1_17 = Static45.method990(1, false, true, true);
			Static88.aClass40_Sub1_44 = Static45.method990(2, true, true, false);
			Static24.aClass40_Sub1_12 = Static45.method990(3, false, true, true);
			Static55.aClass40_Sub1_24 = Static45.method990(4, false, true, true);
			Static9.aClass40_Sub1_5 = Static45.method990(5, true, true, true);
			Static43.aClass40_Sub1_19 = Static45.method990(6, true, false, true);
			Static51.aClass40_Sub1_22 = Static45.method990(7, false, true, true);
			Static92.aClass40_Sub1_33 = Static45.method990(8, false, true, true);
			Static33.aClass40_Sub1_15 = Static45.method990(9, false, true, true);
			Static72.aClass40_Sub1_27 = Static45.method990(10, false, true, true);
			Static109.aClass40_Sub1_42 = Static45.method990(11, false, true, true);
			Static105.aClass40_Sub1_40 = Static45.method990(12, false, true, true);
			Static29.aClass55_434 = Static78.aClass55_904;
			Static102.anInt3022 = 20;
			Static28.anInt1136 = 40;
		} else if (Static28.anInt1136 == 40) {
			local20 = Static87.aClass40_Sub1_29.method1253() * 5 / 100;
			local20 += Static41.aClass40_Sub1_17.method1253() * 5 / 100;
			local20 += Static88.aClass40_Sub1_44.method1253() * 5 / 100;
			local20 += Static24.aClass40_Sub1_12.method1253() * 5 / 100;
			local20 += Static55.aClass40_Sub1_24.method1253() * 5 / 100;
			local20 += Static9.aClass40_Sub1_5.method1253() * 5 / 100;
			local20 += Static43.aClass40_Sub1_19.method1253() * 5 / 100;
			local20 += Static51.aClass40_Sub1_22.method1253() * 40 / 100;
			local20 += Static92.aClass40_Sub1_33.method1253() * 5 / 100;
			local20 += Static33.aClass40_Sub1_15.method1253() * 5 / 100;
			local20 += Static72.aClass40_Sub1_27.method1253() * 5 / 100;
			local20 += Static109.aClass40_Sub1_42.method1253() * 5 / 100;
			local20 += Static105.aClass40_Sub1_40.method1253() * 5 / 100;
			if (local20 == 100) {
				Static29.aClass55_434 = Static61.aClass55_746;
				Static102.anInt3022 = 30;
				Static28.anInt1136 = 45;
			} else {
				if (local20 != 0) {
					Static29.aClass55_434 = Static89.method1698(new Class55[] { Static106.aClass55_966, Static58.method1196(local20), Static7.aClass55_125 });
				}
				Static102.anInt3022 = 30;
			}
		} else if (Static28.anInt1136 == 45) {
			Static71.method1423(!Static90.aBoolean119, Static102.aClass20_4);
			Static26.aClass6_Sub3_Sub2_3 = Static107.method2005(Static102.aClass20_4, Static32.aCanvas1);
			Static87.aClass10_1 = new Class10(22050, Static59.anInt1823);
			Static28.anInt1136 = 50;
			Static102.anInt3022 = 35;
			Static29.aClass55_434 = Static41.aClass55_542;
		} else if (Static28.anInt1136 == 50) {
			local20 = 0;
			if (Static57.aClass6_Sub2_Sub2_Sub4_2 == null) {
				Static57.aClass6_Sub2_Sub2_Sub4_2 = Static75.method1434(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static20.aClass55_342);
			} else {
				local20++;
			}
			if (Static4.aClass6_Sub2_Sub2_Sub4_6 == null) {
				Static4.aClass6_Sub2_Sub2_Sub4_6 = Static75.method1434(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static88.aClass55_1370);
			} else {
				local20++;
			}
			if (Static81.aClass6_Sub2_Sub2_Sub4_4 == null) {
				Static81.aClass6_Sub2_Sub2_Sub4_4 = Static75.method1434(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static90.aClass55_1052);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static57.aClass55_676, Static58.method1196(local20 * 100 / 3), Static7.aClass55_125 });
				Static102.anInt3022 = 40;
			} else {
				Static28.anInt1136 = 60;
				Static102.anInt3022 = 40;
				Static29.aClass55_434 = Static11.aClass55_258;
			}
		} else if (Static28.anInt1136 == 60) {
			local20 = Static106.method1596(Static72.aClass40_Sub1_27, Static92.aClass40_Sub1_33);
			local57 = Static72.method1427();
			if (local20 < local57) {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static26.aClass55_873, Static58.method1196(local20 * 100 / local57), Static7.aClass55_125 });
				Static102.anInt3022 = 50;
			} else {
				Static29.aClass55_434 = Static39.aClass55_657;
				Static102.anInt3022 = 50;
				Static114.method2097(5);
				Static28.anInt1136 = 70;
			}
		} else if (Static28.anInt1136 == 70) {
			if (Static88.aClass40_Sub1_44.method1234()) {
				Static94.method1795(Static88.aClass40_Sub1_44);
				Static47.method1013(Static88.aClass40_Sub1_44);
				Static38.method907(Static88.aClass40_Sub1_44, Static51.aClass40_Sub1_22);
				Static54.method1159(Static88.aClass40_Sub1_44, Static90.aBoolean119, Static51.aClass40_Sub1_22);
				Static20.method590(Static88.aClass40_Sub1_44, Static51.aClass40_Sub1_22);
				Static27.method881(Static57.aClass6_Sub2_Sub2_Sub4_2, Static47.aBoolean69, Static51.aClass40_Sub1_22, Static88.aClass40_Sub1_44);
				method2087(Static88.aClass40_Sub1_44, Static87.aClass40_Sub1_29, Static41.aClass40_Sub1_17);
				Static21.method649(Static51.aClass40_Sub1_22, Static88.aClass40_Sub1_44);
				Static87.method1677(Static88.aClass40_Sub1_44);
				Static22.method658(Static88.aClass40_Sub1_44);
				Static22.method656(Static51.aClass40_Sub1_22, Static92.aClass40_Sub1_33, Static24.aClass40_Sub1_12);
				Static28.anInt1136 = 80;
				Static102.anInt3022 = 60;
				Static29.aClass55_434 = Static112.aClass55_1356;
			} else {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static43.aClass55_558, Static58.method1196(Static88.aClass40_Sub1_44.method1248()), Static7.aClass55_125 });
				Static102.anInt3022 = 60;
			}
		} else if (Static28.anInt1136 == 80) {
			local20 = 0;
			if (Static26.aClass6_Sub2_Sub2_Sub2_13 == null) {
				Static26.aClass6_Sub2_Sub2_Sub2_13 = Static70.method1402(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static20.aClass55_338);
			} else {
				local20++;
			}
			if (Static43.aClass6_Sub2_Sub2_Sub2_7 == null) {
				Static43.aClass6_Sub2_Sub2_Sub2_7 = Static70.method1402(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static63.aClass55_752);
			} else {
				local20++;
			}
			if (Static77.aClass6_Sub2_Sub2_Sub1Array36 == null) {
				Static77.aClass6_Sub2_Sub2_Sub1Array36 = Static47.method1016(Static92.aClass40_Sub1_33, Static34.aClass55_502, Static96.aClass55_1181);
			} else {
				local20++;
			}
			if (Static56.aClass6_Sub2_Sub2_Sub2Array9 == null) {
				Static56.aClass6_Sub2_Sub2_Sub2Array9 = Static47.method1017(Static34.aClass55_502, Static105.aClass55_1289, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static38.aClass6_Sub2_Sub2_Sub2Array7 == null) {
				Static38.aClass6_Sub2_Sub2_Sub2Array7 = Static47.method1017(Static34.aClass55_502, Static108.aClass55_1305, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static21.aClass6_Sub2_Sub2_Sub2Array4 == null) {
				Static21.aClass6_Sub2_Sub2_Sub2Array4 = Static47.method1017(Static34.aClass55_502, Static17.aClass55_315, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static58.aClass6_Sub2_Sub2_Sub2Array10 == null) {
				Static58.aClass6_Sub2_Sub2_Sub2Array10 = Static47.method1017(Static34.aClass55_502, Static32.aClass55_463, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static5.aClass6_Sub2_Sub2_Sub2Array12 == null) {
				Static5.aClass6_Sub2_Sub2_Sub2Array12 = Static47.method1017(Static34.aClass55_502, Static92.aClass55_1090, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static55.aClass6_Sub2_Sub2_Sub2_9 == null) {
				Static55.aClass6_Sub2_Sub2_Sub2_9 = Static70.method1402(Static34.aClass55_502, Static92.aClass40_Sub1_33, Static111.aClass55_1331);
			} else {
				local20++;
			}
			if (Static39.aClass6_Sub2_Sub2_Sub2Array8 == null) {
				Static39.aClass6_Sub2_Sub2_Sub2Array8 = Static47.method1017(Static34.aClass55_502, Static57.aClass55_673, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static18.aClass6_Sub2_Sub2_Sub2Array3 == null) {
				Static18.aClass6_Sub2_Sub2_Sub2Array3 = Static47.method1017(Static34.aClass55_502, Static27.aClass55_529, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static12.aClass6_Sub2_Sub2_Sub2Array2 == null) {
				Static12.aClass6_Sub2_Sub2_Sub2Array2 = Static47.method1017(Static34.aClass55_502, Static57.aClass55_674, Static92.aClass40_Sub1_33);
			} else {
				local20++;
			}
			if (Static18.aClass6_Sub2_Sub2_Sub1Array16 == null) {
				Static18.aClass6_Sub2_Sub2_Sub1Array16 = Static47.method1016(Static92.aClass40_Sub1_33, Static34.aClass55_502, Static15.aClass55_286);
			} else {
				local20++;
			}
			if (Static57.aClass6_Sub2_Sub2_Sub1Array29 == null) {
				Static57.aClass6_Sub2_Sub2_Sub1Array29 = Static47.method1016(Static92.aClass40_Sub1_33, Static34.aClass55_502, Static21.aClass55_363);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static106.aClass55_973, Static58.method1196(local20 * 100 / 14), Static7.aClass55_125 });
				Static102.anInt3022 = 70;
			} else {
				Static43.aClass6_Sub2_Sub2_Sub2_7.method636();
				local68 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 21.0D) - 10;
				local57 = (int) (Math.random() * 21.0D) - 10;
				local78 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(883) int local883 = 0; local883 < Static56.aClass6_Sub2_Sub2_Sub2Array9.length; local883++) {
					Static56.aClass6_Sub2_Sub2_Sub2Array9[local883].method633(local78 + local57, local78 + local68, local78 + local74);
				}
				Static77.aClass6_Sub2_Sub2_Sub1Array36[0].method317(local57 + local78, local78 + local68, local74 + local78);
				Static29.aClass55_434 = Static17.aClass55_316;
				Static102.anInt3022 = 70;
				Static28.anInt1136 = 85;
			}
		} else if (Static28.anInt1136 == 85) {
			local20 = Static6.method244(Static92.aClass40_Sub1_33);
			local57 = Static44.method1828();
			if (local20 < local57) {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static5.aClass55_885, Static58.method1196(local20 * 100 / local57), Static7.aClass55_125 });
				Static102.anInt3022 = 80;
			} else {
				Static102.anInt3022 = 80;
				Static29.aClass55_434 = Static47.aClass55_585;
				Static28.anInt1136 = 90;
			}
		} else if (Static28.anInt1136 == 90) {
			if (Static33.aClass40_Sub1_15.method1234()) {
				@Pc(1020) Class18 local1020 = new Class18(Static33.aClass40_Sub1_15, Static92.aClass40_Sub1_33, 20, 0.8D, Static90.aBoolean119 ? 64 : 128);
				Static30.method793(local1020);
				Static30.method792(0.8D);
				Static102.anInt3022 = 90;
				Static28.anInt1136 = 110;
				Static29.aClass55_434 = Static70.aClass55_835;
			} else {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static52.aClass55_633, Static58.method1196(Static33.aClass40_Sub1_15.method1248()), Static7.aClass55_125 });
				Static102.anInt3022 = 90;
			}
		} else if (Static28.anInt1136 == 110) {
			Static56.aClass51_1 = new Class51();
			Static102.aClass20_4.method728(10, Static56.aClass51_1);
			Static29.aClass55_434 = Static110.aClass55_1325;
			Static102.anInt3022 = 94;
			Static28.anInt1136 = 120;
		} else if (Static28.anInt1136 == 120) {
			if (Static72.aClass40_Sub1_27.method1232(Static109.aClass55_1319, Static34.aClass55_502)) {
				@Pc(1087) Class39 local1087 = new Class39(Static72.aClass40_Sub1_27.method1246(Static109.aClass55_1319, Static34.aClass55_502));
				Static12.method458(local1087);
				Static29.aClass55_434 = Static39.aClass55_655;
				Static28.anInt1136 = 130;
				Static102.anInt3022 = 96;
			} else {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static51.aClass55_610, Static9.aClass55_158 });
				Static102.anInt3022 = 96;
			}
		} else if (Static28.anInt1136 == 130) {
			if (!Static24.aClass40_Sub1_12.method1234()) {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static112.aClass55_1351, Static58.method1196(Static24.aClass40_Sub1_12.method1248() * 4 / 5), Static7.aClass55_125 });
				Static102.anInt3022 = 100;
			} else if (Static105.aClass40_Sub1_40.method1234()) {
				Static29.aClass55_434 = Static104.aClass55_1288;
				Static28.anInt1136 = 140;
				Static102.anInt3022 = 100;
			} else {
				Static29.aClass55_434 = Static89.method1698(new Class55[] { Static112.aClass55_1351, Static58.method1196(Static105.aClass40_Sub1_40.method1248() / 5 + 80), Static7.aClass55_125 });
				Static102.anInt3022 = 100;
			}
		} else if (Static28.anInt1136 == 140) {
			Static114.method2097(10);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILclient!eb;)V")
	public static void method2082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub2_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static14.anInt811 + Static8.anInt383 & 0x7FF;
		@Pc(21) int local21 = arg1 * arg1 + arg0 * arg0;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Static42.anIntArray117[local12];
		@Pc(37) int local37 = local29 * 256 / (Static27.anInt1352 + 256);
		@Pc(46) int local46 = Static42.anIntArray124[local12];
		@Pc(54) int local54 = local46 * 256 / (Static27.anInt1352 + 256);
		@Pc(65) int local65 = local37 * arg0 + arg1 * local54 >> 16;
		@Pc(76) int local76 = local54 * arg0 - local37 * arg1 >> 16;
		if (local21 > 2500) {
			arg2.method630(Static67.aClass6_Sub2_Sub2_Sub1_15, local65 + 94 + 4 - arg2.anInt993 / 2, -(arg2.anInt992 / 2) + -local76 + 79);
		} else {
			arg2.method646(local65 + 98 - arg2.anInt993 / 2, -local76 + 83 + -(arg2.anInt992 / 2) - 4);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2084(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static69.aClass9_1);
		arg0.removeMouseMotionListener(Static69.aClass9_1);
		arg0.removeFocusListener(Static69.aClass9_1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(JI)Lclient!rc;")
	public static Class55 method2085(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) long local29 = arg0;
			@Pc(36) int local36 = 0;
			while (local29 != 0L) {
				local29 /= 37L;
				local36++;
			}
			@Pc(52) byte[] local52 = new byte[local36];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local36--;
				local52[local36] = Static31.aByteArray6[(int) (local56 - arg0 * 37L)];
			}
			@Pc(83) Class55 local83 = new Class55();
			local83.aByteArray12 = local52;
			local83.anInt2411 = local52.length;
			return local83;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!pb;Lclient!pb;Lclient!pb;I)V")
	private static void method2087(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		Static107.aClass40_38 = arg2;
		Static46.aClass40_39 = arg0;
		Static27.aClass40_20 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public static void method2088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << -353020624) + arg0);
		@Pc(16) Class6_Sub2_Sub9 local16 = (Class6_Sub2_Sub9) Static78.aClass38_24.method1183(local10);
		if (local16 != null) {
			Static57.aClass11_2.method459(local16);
		}
	}
}
