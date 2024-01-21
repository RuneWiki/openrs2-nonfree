import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ga", name = "Xb", descriptor = "Lclient!sd;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!ga", name = "Ub", descriptor = "Lclient!je;")
	private static Class40 aClass40_522 = Static69.method1231("Loaded title screen");

	@OriginalMember(owner = "client!ga", name = "Yb", descriptor = "Lclient!je;")
	public static Class40 aClass40_523 = Static69.method1231("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ga", name = "ac", descriptor = "Lclient!je;")
	public static Class40 aClass40_524 = Static69.method1231("gelb:");

	@OriginalMember(owner = "client!ga", name = "dc", descriptor = "Lclient!je;")
	public static Class40 aClass40_525 = Static69.method1231("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ga", name = "jc", descriptor = "Lclient!je;")
	public static Class40 aClass40_526 = aClass40_522;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B)Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 method667(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class2_Sub1_Sub2_Sub3_Sub1 local18 = new Class2_Sub1_Sub2_Sub3_Sub1(arg0, Static3.anIntArray5, Static105.anIntArray287, Static3.anIntArray6, Static57.anIntArray149, Static69.anIntArray205, Static127.aByteArrayArray9);
			Static126.method2088();
			return local18;
		}
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "(B)V")
	public static void method668() {
		aClass70_1 = null;
		aClass40_526 = null;
		aClass40_522 = null;
		aClass40_523 = null;
		aClass40_524 = null;
		aClass40_525 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method669(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static68.anInt1856 != 1) {
			return;
		}
		if (Static41.anInt1096 >= 280 && Static41.anInt1096 <= 294 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(0, 0);
			return;
		}
		if (Static41.anInt1096 >= 295 && Static41.anInt1096 <= 360 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(0, 1);
			return;
		}
		if (Static41.anInt1096 >= 390 && Static41.anInt1096 <= 404 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(1, 0);
			return;
		}
		if (Static41.anInt1096 >= 405 && Static41.anInt1096 <= 470 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(1, 1);
			return;
		}
		if (Static41.anInt1096 >= 500 && Static41.anInt1096 <= 514 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(2, 0);
			return;
		}
		if (Static41.anInt1096 >= 515 && Static41.anInt1096 <= 580 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(2, 1);
			return;
		}
		if (Static41.anInt1096 >= 610 && Static41.anInt1096 <= 624 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(3, 0);
			return;
		}
		if (Static41.anInt1096 >= 625 && Static41.anInt1096 <= 690 && Static103.anInt2511 >= 4 && Static103.anInt2511 <= 18) {
			Static81.method1414(3, 1);
			return;
		}
		if (Static41.anInt1096 >= 708 && Static103.anInt2511 >= 4 && Static41.anInt1096 <= 758 && Static103.anInt2511 <= 20) {
			Static60.aBoolean124 = false;
			Static95.aClass2_Sub1_Sub2_Sub4_4.method1712(0, 0);
			Static93.aClass2_Sub1_Sub2_Sub4_3.method1712(382, 0);
			Static73.aClass2_Sub1_Sub2_Sub1_12.method1084(382 - Static73.aClass2_Sub1_Sub2_Sub1_12.anInt1632 / 2, 18);
			return;
		}
		if (Static124.anInt2878 == -1) {
			return;
		}
		@Pc(280) Class68 local280 = Static81.aClass68Array1[Static124.anInt2878];
		if (Static92.aBoolean184 == local280.aBoolean202) {
			@Pc(304) byte[] local304 = Static40.method722(new Class40[] { local280.aClass40_1344, Static118.aClass40_1492 }).method952();
			Static45.aString1 = new String(local304, 0, local304.length);
			if (Static34.anInt804 != 0) {
				Static86.anInt3032 = 443;
				Static47.anInt1271 = 43594;
				Static7.anInt198 = 43594;
				Static34.anInt804 = 0;
			}
			Static60.aBoolean124 = false;
			Static15.anInt298 = local280.anInt2515;
			Static95.aClass2_Sub1_Sub2_Sub4_4.method1712(0, 0);
			Static93.aClass2_Sub1_Sub2_Sub4_3.method1712(382, 0);
			Static73.aClass2_Sub1_Sub2_Sub1_12.method1084(382 - Static73.aClass2_Sub1_Sub2_Sub1_12.anInt1632 / 2, 18);
			return;
		}
		@Pc(402) Class40 local402 = Static40.method722(new Class40[] { Static120.aClass40_1519, local280.aClass40_1344, Static118.aClass40_1492, Static43.aClass40_575, Static114.aClass40_1429, Static49.method886(Static34.aBoolean60 ? 1 : 0), Static48.aClass40_634, Static49.method886(Static2.anInt102), Static66.aClass40_858, Static49.method886(Static134.anInt1649) });
		try {
			arg0.getAppletContext().showDocument(local402.method991(), "_self");
			return;
		} catch (@Pc(411) Exception local411) {
			return;
		}
	}
}
