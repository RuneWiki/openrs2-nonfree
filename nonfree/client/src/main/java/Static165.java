import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!u", name = "p", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array2;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "I")
	public static int anInt3639;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1344 = Static177.method3050("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1345 = aClass46_1344;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "J")
	public static volatile long aLong132 = 0L;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1346 = Static177.method3050("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1347 = Static177.method3050("<col=ff7000>");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	public static boolean method2751(@OriginalArg(1) int arg0) {
		if (Static139.aBooleanArray13[arg0]) {
			return true;
		} else if (Static167.aClass62_42.method2877(arg0)) {
			@Pc(23) int local23 = Static167.aClass62_42.method2865(arg0);
			if (local23 == 0) {
				Static139.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static54.aClass1ArrayArray1[arg0] == null) {
				Static54.aClass1ArrayArray1[arg0] = new Class1[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static54.aClass1ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static167.aClass62_42.method2878(arg0, local42);
					if (local56 != null) {
						Static54.aClass1ArrayArray1[arg0][local42] = new Class1();
						Static54.aClass1ArrayArray1[arg0][local42].anInt53 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static54.aClass1ArrayArray1[arg0][local42].method9(new Class4_Sub11(local56));
						} else {
							Static54.aClass1ArrayArray1[arg0][local42].method3(new Class4_Sub11(local56));
						}
					}
				}
			}
			Static139.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rd;I)V")
	public static void method2752(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static66.anInt1811 != 1) {
			return;
		}
		if (Static28.anInt747 >= 280 && Static28.anInt747 <= 294 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(0, 0);
			return;
		}
		if (Static28.anInt747 >= 295 && Static28.anInt747 <= 360 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(0, 1);
			return;
		}
		if (Static28.anInt747 >= 390 && Static28.anInt747 <= 404 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(1, 0);
			return;
		}
		if (Static28.anInt747 >= 405 && Static28.anInt747 <= 470 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(1, 1);
			return;
		}
		if (Static28.anInt747 >= 500 && Static28.anInt747 <= 514 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(2, 0);
			return;
		}
		if (Static28.anInt747 >= 515 && Static28.anInt747 <= 580 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(2, 1);
			return;
		}
		if (Static28.anInt747 >= 610 && Static28.anInt747 <= 624 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(3, 0);
			return;
		}
		if (Static28.anInt747 >= 625 && Static28.anInt747 <= 690 && Static73.anInt1877 >= 4 && Static73.anInt1877 <= 18) {
			Static65.method1388(3, 1);
			return;
		}
		if (Static28.anInt747 >= 708 && Static73.anInt1877 >= 4 && Static28.anInt747 <= 758 && Static73.anInt1877 <= 20) {
			Static53.aBoolean64 = false;
			Static18.aClass4_Sub1_Sub7_Sub2_1.method2533(0, 0);
			Static116.aClass4_Sub1_Sub7_Sub2_3.method2533(382, 0);
			Static85.aClass4_Sub1_Sub7_Sub3_3.method2642(382 - Static85.aClass4_Sub1_Sub7_Sub3_3.anInt3484 / 2, 18);
			return;
		}
		if (Static73.anInt1867 == -1) {
			return;
		}
		@Pc(277) Class19 local277 = Static132.aClass19Array1[Static73.anInt1867];
		if (Static94.aBoolean106 == local277.aBoolean39) {
			@Pc(301) byte[] local301 = Static69.method1482(new Class46[] { local277.aClass46_244, Static30.aClass46_247 }).method1660();
			Static57.aString1 = new String(local301, 0, local301.length);
			Static69.anInt1855 = local277.anInt761;
			if (Static89.anInt2298 != 0) {
				Static144.anInt3350 = 443;
				Static89.anInt2298 = 0;
				Static121.anInt2925 = 43594;
				Static93.anInt2386 = 43594;
			}
			Static53.aBoolean64 = false;
			Static18.aClass4_Sub1_Sub7_Sub2_1.method2533(0, 0);
			Static116.aClass4_Sub1_Sub7_Sub2_3.method2533(382, 0);
			Static85.aClass4_Sub1_Sub7_Sub3_3.method2642(382 - Static85.aClass4_Sub1_Sub7_Sub3_3.anInt3484 / 2, 18);
			return;
		}
		@Pc(401) Class46 local401 = Static69.method1482(new Class46[] { Static144.aClass46_1239, local277.aClass46_244, Static30.aClass46_247, Static3.aClass46_45, Static71.aClass46_713, Static127.method2240(Static103.aBoolean113 ? 1 : 0), Static118.aClass46_1064, Static127.method2240(Static142.anInt3317), Static151.aClass46_1273, Static127.method2240(Static38.anInt1004) });
		try {
			arg0.getAppletContext().showDocument(local401.method1676(), "_self");
		} catch (@Pc(410) Exception local410) {
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
	public static void method2753(@OriginalArg(0) int arg0) {
		if (method2751(arg0)) {
			Static45.method757(Static54.aClass1ArrayArray1[arg0], -1);
		}
	}
}
