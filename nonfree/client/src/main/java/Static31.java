import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
	public static boolean aBoolean51;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_314 = Static170.method3101("l");

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_315 = Static170.method3101("");

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public static int anInt959 = 0;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_316 = Static170.method3101("leuchten2:");

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_317 = Static170.method3101("Loading wordpack )2 ");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!eh;")
	private static Class28 aClass28_323 = Static170.method3101(" has logged in)3");

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_318 = aClass28_323;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_319 = aClass28_317;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_320 = Static170.method3101("Texturen geladen)3");

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!eh;")
	private static Class28 aClass28_321 = Static170.method3101("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!eh;")
	private static Class28 aClass28_324 = Static170.method3101("Unable to find ");

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_322 = aClass28_324;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_325 = aClass28_321;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method790() {
		aClass28_325 = null;
		aClass28_320 = null;
		aClass28_324 = null;
		aClass28_321 = null;
		aClass28_318 = null;
		aClass28_319 = null;
		aClass28_322 = null;
		aClass28_316 = null;
		aClass28_323 = null;
		aClass28_314 = null;
		aClass28_315 = null;
		aClass28_317 = null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method791() {
		if (Static52.aClass38_1 != null) {
			Static52.aClass38_1.method1632();
			Static52.aClass38_1 = null;
		}
		Static86.method1985();
		Static116.method2333();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static45.aClass21Array1[local17].method805();
		}
		System.gc();
		Static164.method3023();
		Static93.anInt2608 = -1;
		Static61.aBoolean101 = false;
		Static59.method1336();
		Static173.method3141(10);
	}
}
