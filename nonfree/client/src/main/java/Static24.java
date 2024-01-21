import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array3;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "Lclient!jd;")
	public static Class38 aClass38_7 = new Class38();

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_413 = Static9.method266("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "Lclient!id;")
	public static Class34 aClass34_414 = Static9.method266("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_415 = Static9.method266("ams");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method479() {
		aClass34_415 = null;
		aClass1_Sub1_Sub2_Sub1Array3 = null;
		aClass1_Sub1_Sub2_Sub1Array4 = null;
		anIntArray82 = null;
		aClass38_7 = null;
		aClass34_414 = null;
		aClass34_413 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!te;)V")
	public static void method480(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static110.aBoolean136) {
			Static64.method1104(arg0);
			return;
		}
		if (Static55.anInt1547 == 1 && Static119.anInt2832 >= 715 && Static118.anInt2830 >= 453) {
			Static28.aBoolean178 = !Static28.aBoolean178;
			if (Static28.aBoolean178) {
				Static98.method1651();
			} else {
				Static85.method1454(Static26.aClass34_417, Static120.aClass34_1469, Static32.aClass35_Sub1_12);
			}
		}
		if (Static44.anInt1247 == 5) {
			return;
		}
		Static80.anInt2129++;
		if (Static44.anInt1247 != 10) {
			return;
		}
		if (Static88.anInt2289 != 2 && Static122.anInt2892 == 0) {
			if (Static55.anInt1547 == 1 && Static119.anInt2832 >= 5 && Static119.anInt2832 <= 105 && Static118.anInt2830 >= 463 && Static118.anInt2830 <= 498) {
				Static23.method460();
				return;
			}
			if (Static55.aClass46_1 != null) {
				Static23.method460();
			}
		}
		@Pc(120) int local120 = Static119.anInt2832;
		@Pc(122) int local122 = Static118.anInt2830;
		@Pc(124) int local124 = Static55.anInt1547;
		if (Static77.anInt2084 == 0) {
			if (local124 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 271 && local122 <= 311) {
				Static77.anInt2084 = 3;
				Static29.anInt899 = 0;
			}
			if (local124 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 271 && local122 <= 311) {
				Static120.aClass34_1470 = Static71.aClass34_870;
				Static29.anInt899 = 0;
				Static120.aClass34_1462 = Static127.aClass34_1021;
				Static77.anInt2084 = 2;
				Static120.aClass34_1459 = Static71.aClass34_899;
				return;
			}
			return;
		}
		if (Static77.anInt2084 == 2) {
			@Pc(232) short local232 = 231;
			@Pc(235) int local235 = local232 + 30;
			if (local124 == 1 && local122 >= 246 && local122 < 261) {
				Static29.anInt899 = 0;
			}
			local235 += 15;
			if (local124 == 1 && local122 >= 261 && local122 < 276) {
				Static29.anInt899 = 1;
			}
			local235 += 15;
			if (local124 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 301 && local122 <= 341) {
				Static120.aClass34_1461 = Static120.aClass34_1461.method966().method969();
				if (Static120.aClass34_1461.method982() == 0) {
					Static14.method345(Static71.aClass34_898, Static47.aClass34_674, Static71.aClass34_866);
					return;
				}
				if (Static120.aClass34_1468.method982() == 0) {
					Static14.method345(Static71.aClass34_886, Static105.aClass34_1299, Static71.aClass34_867);
					return;
				}
				Static14.method345(Static71.aClass34_871, Static48.aClass34_709, Static71.aClass34_885);
				Static41.method695(20);
				return;
			}
			if (local124 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 301 && local122 <= 341) {
				Static120.aClass34_1461 = Static120.aClass34_1469;
				Static77.anInt2084 = 0;
				Static120.aClass34_1468 = Static120.aClass34_1469;
			}
			while (true) {
				while (Static21.method446()) {
					@Pc(378) boolean local378 = false;
					for (@Pc(380) int local380 = 0; local380 < Static41.aClass34_551.method982(); local380++) {
						if (Static127.anInt2073 == Static41.aClass34_551.method953(local380)) {
							local378 = true;
							break;
						}
					}
					if (Static29.anInt899 == 0) {
						if (Static116.anInt2808 == 85 && Static120.aClass34_1461.method982() > 0) {
							Static120.aClass34_1461 = Static120.aClass34_1461.method962(Static120.aClass34_1461.method982() - 1, 0);
						}
						if (Static116.anInt2808 == 84 || Static116.anInt2808 == 80) {
							Static29.anInt899 = 1;
						}
						if (local378 && Static120.aClass34_1461.method982() < 12) {
							Static120.aClass34_1461 = Static120.aClass34_1461.method990(Static127.anInt2073);
						}
					} else if (Static29.anInt899 == 1) {
						if (Static116.anInt2808 == 85 && Static120.aClass34_1468.method982() > 0) {
							Static120.aClass34_1468 = Static120.aClass34_1468.method962(Static120.aClass34_1468.method982() - 1, 0);
						}
						if (Static116.anInt2808 == 84 || Static116.anInt2808 == 80) {
							Static29.anInt899 = 0;
						}
						if (Static31.anInt921 == 2 && Static116.anInt2808 == 84) {
							Static120.aClass34_1461 = Static120.aClass34_1461.method966().method969();
							if (Static120.aClass34_1461.method982() == 0) {
								Static14.method345(Static71.aClass34_898, Static47.aClass34_674, Static71.aClass34_866);
								return;
							}
							if (Static120.aClass34_1468.method982() == 0) {
								Static14.method345(Static71.aClass34_886, Static105.aClass34_1299, Static71.aClass34_867);
								return;
							}
							Static14.method345(Static71.aClass34_871, Static48.aClass34_709, Static71.aClass34_885);
							Static41.method695(20);
							return;
						}
						if (local378 && Static120.aClass34_1468.method982() < 20) {
							Static120.aClass34_1468 = Static120.aClass34_1468.method990(Static127.anInt2073);
						}
					}
				}
				return;
			}
		}
		if (Static77.anInt2084 != 3 || local124 != 1 || local120 < 307 || local120 > 457 || local122 < 301 || local122 > 341) {
			return;
		}
		Static77.anInt2084 = 0;
	}
}
