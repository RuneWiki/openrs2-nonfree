import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	public static int anInt1873;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!o;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_47;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!rd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt1867 = -1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt1868 = -1;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_721 = Static177.method3050("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "J")
	public static long aLong60 = 0L;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!rd;)V")
	public static void method1502(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static53.aBoolean64) {
			Static165.method2752(arg0);
			return;
		}
		if (Static66.anInt1811 == 1 && Static28.anInt747 >= 715 && anInt1877 >= 453) {
			Static154.aBoolean168 = !Static154.aBoolean168;
			if (Static154.aBoolean168) {
				Static50.method953();
			} else {
				Static118.method2141(255, Static65.anInt1715, aClass62_Sub1_47);
			}
		}
		if (Static143.anInt3333 == 5) {
			return;
		}
		Static103.anInt2611++;
		if (Static143.anInt3333 != 10) {
			return;
		}
		if (Static142.anInt3317 != 2 && Static64.anInt1688 == 0) {
			if (Static66.anInt1811 == 1 && Static28.anInt747 >= 5 && Static28.anInt747 <= 105 && anInt1877 >= 463 && anInt1877 <= 498) {
				Static44.method735();
				return;
			}
			if (Static63.aClass87_2 != null) {
				Static44.method735();
			}
		}
		@Pc(109) int local109 = Static66.anInt1811;
		@Pc(111) int local111 = Static28.anInt747;
		@Pc(113) int local113 = anInt1877;
		if (Static99.anInt2519 == 0) {
			@Pc(121) boolean local121 = false;
			if (local109 == 1 && local111 >= 227 && local111 <= 377 && local113 >= 271 && local113 <= 311) {
				Static99.anInt2519 = 3;
				Static25.anInt622 = 0;
			}
			if (Static89.anInt2298 != 0) {
				while (Static92.method1806()) {
					if (Static31.anInt796 == 84) {
						local121 = true;
						break;
					}
				}
			}
			if (local121 || local109 == 1 && local111 >= 387 && local111 <= 537 && local113 >= 271 && local113 <= 311) {
				Static3.aClass46_32 = Static72.aClass46_720;
				Static3.aClass46_40 = Static62.aClass46_624;
				Static3.aClass46_35 = Static62.aClass46_616;
				Static25.anInt622 = 0;
				Static99.anInt2519 = 2;
			}
		} else if (Static99.anInt2519 == 2) {
			@Pc(220) short local220 = 231;
			@Pc(221) int local221 = local220 + 30;
			if (local109 == 1 && local113 >= 246 && local113 < 261) {
				Static25.anInt622 = 0;
			}
			local221 += 15;
			if (local109 == 1 && local113 >= 261 && local113 < 276) {
				Static25.anInt622 = 1;
			}
			local221 += 15;
			if (local109 == 1 && local111 >= 227 && local111 <= 377 && local113 >= 301 && local113 <= 341) {
				Static3.aClass46_38 = Static3.aClass46_38.method1651().method1654();
				if (Static3.aClass46_38.method1677() == 0) {
					Static85.method1709(Static62.aClass46_622, Static62.aClass46_633, Static184.aClass46_1518);
					return;
				}
				if (Static3.aClass46_31.method1677() == 0) {
					Static85.method1709(Static62.aClass46_610, Static62.aClass46_612, Static92.aClass46_855);
					return;
				}
				Static85.method1709(Static62.aClass46_630, Static62.aClass46_602, Static13.aClass46_151);
				Static187.method3168(20);
				return;
			}
			if (local109 == 1 && local111 >= 387 && local111 <= 537 && local113 >= 301 && local113 <= 341) {
				Static3.aClass46_31 = Static3.aClass46_33;
				Static99.anInt2519 = 0;
				Static3.aClass46_38 = Static3.aClass46_33;
			}
			while (true) {
				@Pc(371) boolean local371;
				label204: do {
					while (Static92.method1806()) {
						local371 = false;
						for (@Pc(373) int local373 = 0; local373 < Static117.aClass46_1059.method1677(); local373++) {
							if (Static108.anInt2665 == Static117.aClass46_1059.method1672(local373)) {
								local371 = true;
								break;
							}
						}
						if (Static25.anInt622 != 0) {
							continue label204;
						}
						if (Static31.anInt796 == 85 && Static3.aClass46_38.method1677() > 0) {
							Static3.aClass46_38 = Static3.aClass46_38.method1666(Static3.aClass46_38.method1677() - 1, 0);
						}
						if (Static31.anInt796 == 84 || Static31.anInt796 == 80) {
							Static25.anInt622 = 1;
						}
						if (local371 && Static3.aClass46_38.method1677() < 12) {
							Static3.aClass46_38 = Static3.aClass46_38.method1655(Static108.anInt2665);
						}
					}
					return;
				} while (Static25.anInt622 != 1);
				if (Static31.anInt796 == 85 && Static3.aClass46_31.method1677() > 0) {
					Static3.aClass46_31 = Static3.aClass46_31.method1666(Static3.aClass46_31.method1677() - 1, 0);
				}
				if (Static31.anInt796 == 84 || Static31.anInt796 == 80) {
					Static25.anInt622 = 0;
				}
				if (Static89.anInt2298 != 0 && Static31.anInt796 == 84) {
					Static3.aClass46_38 = Static3.aClass46_38.method1651().method1654();
					if (Static3.aClass46_38.method1677() == 0) {
						Static85.method1709(Static62.aClass46_622, Static62.aClass46_633, Static184.aClass46_1518);
						return;
					}
					if (Static3.aClass46_31.method1677() == 0) {
						Static85.method1709(Static62.aClass46_610, Static62.aClass46_612, Static92.aClass46_855);
						return;
					}
					Static85.method1709(Static62.aClass46_630, Static62.aClass46_602, Static13.aClass46_151);
					Static187.method3168(20);
					return;
				}
				if (local371 && Static3.aClass46_31.method1677() < 20) {
					Static3.aClass46_31 = Static3.aClass46_31.method1655(Static108.anInt2665);
				}
			}
		} else if (Static99.anInt2519 == 3 && local109 == 1 && local111 >= 307 && local111 <= 457 && local113 >= 301 && local113 <= 341) {
			Static99.anInt2519 = 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static165.method2751(arg0)) {
			Static35.method613(Static54.aClass1ArrayArray1[arg0], arg1);
		}
	}
}
