import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!sd;")
	public static Class29 aClass29_50;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!t;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public static int[] anIntArray308 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_913 = Static63.method1251("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public static int anInt2191 = 0;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_914 = Static63.method1251("Offline");

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_915 = Static63.method1251("null");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class45 method1476(@OriginalArg(1) int arg0) {
		return Static88.method1689(false, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1477() {
		anIntArray309 = null;
		aClass68_4 = null;
		aClass29_50 = null;
		aClass45_913 = null;
		aClass45_915 = null;
		aClass45_914 = null;
		anIntArray308 = null;
	}
}
