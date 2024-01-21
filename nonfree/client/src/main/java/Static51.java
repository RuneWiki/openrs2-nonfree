import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_808 = Static6.method100("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_803 = aClass26_808;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_804 = Static6.method100("(Y");

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_805 = Static6.method100(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_806 = Static6.method100("Loading title screen )2 ");

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_807 = Static6.method100("::fpsoff");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
	public static int[] anIntArray158 = new int[4000];

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_809 = aClass26_806;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!he;")
	public static Class26 method1079(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static119.method2136(new Class26[] { Static132.aClass26_1819, Static122.method2170(arg0), Static71.aClass26_1010 });
		} else if (arg0 < 10000000) {
			return Static119.method2136(new Class26[] { Static109.aClass26_1597, Static122.method2170(arg0 / 1000), Static121.aClass26_1725, Static71.aClass26_1010 });
		} else {
			return Static119.method2136(new Class26[] { Static28.aClass26_474, Static122.method2170(arg0 / 1000000), Static52.aClass26_816, Static71.aClass26_1010 });
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1080() {
		Static14.aClass66_3.method1971();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1081() {
		aClass26_807 = null;
		anIntArray157 = null;
		aClass26_806 = null;
		aClass26_803 = null;
		anIntArray158 = null;
		aClass26_804 = null;
		aClass26_808 = null;
		aClass26_809 = null;
		aClass26_805 = null;
	}
}
