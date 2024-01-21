import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_11 = new Class47(64);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt1619 = 0;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt1623 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lclient!vd;B)[Lclient!vd;")
	public static Class92[] method1107(@OriginalArg(0) Class92[] arg0) {
		@Pc(13) Class92[] local13 = new Class92[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static208.method787(new Class92[] { Static49.method872(local15), Static116.aClass92_1154 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static208.method787(new Class92[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method1108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!gg;)V")
	public static void method1109(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static196.anInt4284 != 1) {
			return;
		}
		if (Static57.anInt1370 >= 280 && Static57.anInt1370 <= 294 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(0, 0);
			return;
		}
		if (Static57.anInt1370 >= 295 && Static57.anInt1370 <= 360 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(1, 0);
			return;
		}
		if (Static57.anInt1370 >= 390 && Static57.anInt1370 <= 404 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(0, 1);
			return;
		}
		if (Static57.anInt1370 >= 405 && Static57.anInt1370 <= 470 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(1, 1);
			return;
		}
		if (Static57.anInt1370 >= 500 && Static57.anInt1370 <= 514 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(0, 2);
			return;
		}
		if (Static57.anInt1370 >= 515 && Static57.anInt1370 <= 580 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(1, 2);
			return;
		}
		if (Static57.anInt1370 >= 610 && Static57.anInt1370 <= 624 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(0, 3);
			return;
		}
		if (Static57.anInt1370 >= 625 && Static57.anInt1370 <= 690 && Static140.anInt2804 >= 4 && Static140.anInt2804 <= 18) {
			Static117.method1729(1, 3);
			return;
		}
		if (Static57.anInt1370 >= 700 && Static140.anInt2804 >= 4 && Static57.anInt1370 <= 758 && Static140.anInt2804 <= 20) {
			Static36.aBoolean65 = false;
			Static113.method1687();
			return;
		}
		if (Static94.anInt1982 == -1) {
			return;
		}
		@Pc(261) Class70 local261 = Static90.aClass70Array1[Static94.anInt1982];
		if (local261.aBoolean165 == Static181.aBoolean221) {
			@Pc(283) byte[] local283 = Static208.method787(new Class92[] { local261.aClass92_1349, Static171.aClass92_1719 }).method3228();
			Static109.aString5 = new String(local283, 0, local283.length);
			if (Static86.anInt1862 != 0) {
				Static23.anInt561 = 43594;
				Static160.anInt3336 = 43594;
				Static200.anInt4360 = 443;
				Static86.anInt1862 = 0;
			}
			Static36.aBoolean65 = false;
			Static183.anInt3929 = local261.anInt2796;
			Static113.method1687();
			return;
		}
		@Pc(369) Class92 local369 = Static208.method787(new Class92[] { Static28.aClass92_293, local261.aClass92_1349, Static160.aClass92_1620, Static49.method872(Static93.anInt1976), Static168.aClass92_1691, Static49.method872(Static111.aBoolean141 ? 1 : 0), Static175.aClass92_1803, Static49.method872(Static40.anInt3561), Static5.aClass92_42, Static49.method872(Static179.anInt3907) });
		try {
			arg0.getAppletContext().showDocument(local369.method3207(), "_self");
		} catch (@Pc(378) Exception local378) {
		}
	}
}
