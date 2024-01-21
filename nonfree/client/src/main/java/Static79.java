import java.awt.Frame;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!md", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	public static int anInt2009;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 aClass5_Sub2_Sub1_Sub3_4;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_7;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	public static int anInt2014;

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!r;")
	private static Class61 aClass61_611 = Static129.method2060("Please enter your username)3");

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!r;")
	public static Class61 aClass61_612 = Static129.method2060("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_613 = Static129.method2060("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Lclient!r;")
	public static Class61 aClass61_614 = Static129.method2060(")4lang)4de");

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!r;")
	public static Class61 aClass61_615 = aClass61_611;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!e;I)V")
	public static void method1297(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static95.aBoolean86) {
			Static92.method1456(arg0);
			return;
		}
		if (Static75.anInt1772 == 1 && Static26.anInt613 >= 715 && Static12.anInt308 >= 453) {
			Static41.aBoolean80 = !Static41.aBoolean80;
			if (Static41.aBoolean80) {
				Static29.method624();
			} else {
				Static120.method1903(Static90.aClass61_699, Static42.aClass26_Sub1_6, Static112.aClass61_882);
			}
		}
		if (Static24.anInt723 == 5) {
			return;
		}
		Static62.anInt1534++;
		if (Static24.anInt723 != 10) {
			return;
		}
		if (Static91.anInt2419 != 2 && Static13.anInt367 == 0) {
			if (Static75.anInt1772 == 1 && Static26.anInt613 >= 5 && Static26.anInt613 <= 105 && Static12.anInt308 >= 463 && Static12.anInt308 <= 498) {
				Static119.method1899();
				return;
			}
			if (Static118.aClass1_1 != null) {
				Static119.method1899();
			}
		}
		@Pc(116) int local116 = Static75.anInt1772;
		@Pc(118) int local118 = Static26.anInt613;
		@Pc(120) int local120 = Static12.anInt308;
		if (Static2.anInt22 == 0) {
			if (local116 == 1 && local118 >= 227 && local118 <= 377 && local120 >= 271 && local120 <= 311) {
				Static2.anInt22 = 3;
				Static43.anInt1118 = 0;
			}
			@Pc(170) boolean local170 = false;
			if (Static30.anInt925 != 0) {
				while (Static100.method1681()) {
					if (Static104.anInt2711 == 84) {
						local170 = true;
						break;
					}
				}
			}
			if (local170 || local116 == 1 && local118 >= 387 && local118 <= 537 && local120 >= 271 && local120 <= 311) {
				Static2.anInt22 = 2;
				Static112.aClass61_885 = Static23.aClass61_210;
				Static43.anInt1118 = 0;
				Static112.aClass61_884 = Static127.aClass61_1024;
				Static112.aClass61_883 = Static127.aClass61_1020;
			}
		} else if (Static2.anInt22 == 2) {
			@Pc(233) short local233 = 231;
			@Pc(236) int local236 = local233 + 30;
			if (local116 == 1 && local120 >= 246 && local120 < 261) {
				Static43.anInt1118 = 0;
			}
			local236 += 15;
			if (local116 == 1 && local120 >= 261 && local120 < 276) {
				Static43.anInt1118 = 1;
			}
			local236 += 15;
			if (local116 == 1 && local118 >= 227 && local118 <= 377 && local120 >= 301 && local120 <= 341) {
				Static112.aClass61_881 = Static112.aClass61_881.method1726().method1701();
				if (Static112.aClass61_881.method1733() == 0) {
					Static24.method503(Static127.aClass61_1048, Static127.aClass61_1055, aClass61_615);
				} else if (Static112.aClass61_880.method1733() == 0) {
					Static24.method503(Static127.aClass61_1042, Static127.aClass61_1058, Static99.aClass61_768);
				} else {
					Static24.method503(Static127.aClass61_1037, Static127.aClass61_1057, Static99.aClass61_773);
					Static36.method697(20);
				}
			} else {
				if (local116 == 1 && local118 >= 387 && local118 <= 537 && local120 >= 301 && local120 <= 341) {
					Static112.aClass61_880 = Static112.aClass61_882;
					Static2.anInt22 = 0;
					Static112.aClass61_881 = Static112.aClass61_882;
				}
				while (true) {
					@Pc(395) boolean local395;
					label238: do {
						while (Static100.method1681()) {
							local395 = false;
							for (@Pc(397) int local397 = 0; local397 < Static42.aClass61_335.method1733(); local397++) {
								if (Static88.anInt3385 == Static42.aClass61_335.method1714(local397)) {
									local395 = true;
									break;
								}
							}
							if (Static43.anInt1118 != 0) {
								continue label238;
							}
							if (Static104.anInt2711 == 85 && Static112.aClass61_881.method1733() > 0) {
								Static112.aClass61_881 = Static112.aClass61_881.method1730(Static112.aClass61_881.method1733() - 1, 0);
							}
							if (Static104.anInt2711 == 84 || Static104.anInt2711 == 80) {
								Static43.anInt1118 = 1;
							}
							if (local395 && Static112.aClass61_881.method1733() < 12) {
								Static112.aClass61_881 = Static112.aClass61_881.method1720(Static88.anInt3385);
							}
						}
						return;
					} while (Static43.anInt1118 != 1);
					if (Static104.anInt2711 == 85 && Static112.aClass61_880.method1733() > 0) {
						Static112.aClass61_880 = Static112.aClass61_880.method1730(Static112.aClass61_880.method1733() - 1, 0);
					}
					if (Static104.anInt2711 == 84 || Static104.anInt2711 == 80) {
						Static43.anInt1118 = 0;
					}
					if (Static30.anInt925 != 0 && Static104.anInt2711 == 84) {
						Static112.aClass61_881 = Static112.aClass61_881.method1726().method1701();
						if (Static112.aClass61_881.method1733() == 0) {
							Static24.method503(Static127.aClass61_1048, Static127.aClass61_1055, aClass61_615);
							return;
						}
						if (Static112.aClass61_880.method1733() == 0) {
							Static24.method503(Static127.aClass61_1042, Static127.aClass61_1058, Static99.aClass61_768);
							return;
						}
						Static24.method503(Static127.aClass61_1037, Static127.aClass61_1057, Static99.aClass61_773);
						Static36.method697(20);
						return;
					}
					if (local395 && Static112.aClass61_880.method1733() < 20) {
						Static112.aClass61_880 = Static112.aClass61_880.method1720(Static88.anInt3385);
					}
				}
			}
		} else if (Static2.anInt22 == 3 && local116 == 1 && local118 >= 307 && local118 <= 457 && local120 >= 301 && local120 <= 341) {
			Static2.anInt22 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method1298() {
		aClass61_611 = null;
		aCalendar1 = null;
		aByteArrayArrayArray5 = null;
		aFrame1 = null;
		aClass5_Sub2_Sub1_Sub3_4 = null;
		aClass61_612 = null;
		aClass5_Sub11_7 = null;
		aClass61_613 = null;
		aClass61_615 = null;
		aClass61_614 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z")
	public static boolean method1299(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!ke;)Z")
	public static boolean method1300(@OriginalArg(1) Class5_Sub11 arg0) {
		if (Static30.aBoolean26) {
			if (Static42.method755(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1669 == 0) {
				return false;
			}
		}
		return arg0.aBoolean71;
	}
}
