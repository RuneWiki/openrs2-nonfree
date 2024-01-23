import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!nb;")
	public static Class15 aClass15_13;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!q;")
	public static Class80 aClass80_7;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "Lclient!i;")
	private static Class41 aClass41_471 = Static184.method2923("Examine");

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "Lclient!i;")
	public static Class41 aClass41_469 = aClass41_471;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!i;")
	private static Class41 aClass41_470 = Static184.method2923("Please reload this page)3");

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	public static int anInt1632 = 0;

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
	public static int anInt1633 = 255;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_472 = aClass41_470;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!hj;B)V")
	public static void method1127(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static34.anInt909 != 1) {
			return;
		}
		if (Static200.anInt4491 >= 280 && Static200.anInt4491 <= 294 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(0, 0);
			return;
		}
		if (Static200.anInt4491 >= 295 && Static200.anInt4491 <= 360 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(0, 1);
			return;
		}
		if (Static200.anInt4491 >= 390 && Static200.anInt4491 <= 404 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(1, 0);
			return;
		}
		if (Static200.anInt4491 >= 405 && Static200.anInt4491 <= 470 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(1, 1);
			return;
		}
		if (Static200.anInt4491 >= 500 && Static200.anInt4491 <= 514 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(2, 0);
			return;
		}
		if (Static200.anInt4491 >= 515 && Static200.anInt4491 <= 580 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(2, 1);
			return;
		}
		if (Static200.anInt4491 >= 610 && Static200.anInt4491 <= 624 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(3, 0);
			return;
		}
		if (Static200.anInt4491 >= 625 && Static200.anInt4491 <= 690 && Static154.anInt3614 >= 4 && Static154.anInt3614 <= 18) {
			Static79.method1450(3, 1);
			return;
		}
		if (Static200.anInt4491 >= 700 && Static154.anInt3614 >= 4 && Static200.anInt4491 <= 758 && Static154.anInt3614 <= 20) {
			Static185.aBoolean264 = false;
			Static196.method3069();
			return;
		}
		if (Static76.anInt787 == -1) {
			return;
		}
		@Pc(254) Class37 local254 = Static178.aClass37Array1[Static76.anInt787];
		if (Static60.aBoolean291 == local254.aBoolean91) {
			@Pc(278) byte[] local278 = Static149.method2324(new Class41[] { local254.aClass41_482, Static182.aClass41_1108 }).method1402();
			Static83.aString3 = new String(local278, 0, local278.length);
			Static26.anInt662 = local254.anInt1671;
			if (Static101.anInt2449 != 0) {
				Static45.anInt1335 = 443;
				Static101.anInt2449 = 0;
				Static151.anInt3442 = 43594;
				Static195.anInt4421 = 43594;
			}
			Static185.aBoolean264 = false;
			Static196.method3069();
			return;
		}
		@Pc(362) Class41 local362 = Static149.method2324(new Class41[] { Static83.aClass41_630, local254.aClass41_482, Static144.aClass41_916, Static152.method2471(Static111.anInt2675), Static4.aClass41_40, Static152.method2471(Static217.aBoolean290 ? 1 : 0), Static2.aClass41_19, Static152.method2471(Static128.anInt2993), Static65.aClass41_542, Static152.method2471(Static62.anInt1676) });
		try {
			arg0.getAppletContext().showDocument(local362.method1395(), "_self");
		} catch (@Pc(371) Exception local371) {
		}
	}
}
