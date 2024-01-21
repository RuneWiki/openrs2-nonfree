import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_719 = Static56.method1206("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public static int anInt2058 = -1;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!lc;")
	public static Class31 aClass31_720 = Static56.method1206(")3");

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_721 = Static56.method1206("b12_full");

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
	public static int[] anIntArray288 = new int[4000];

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_722 = Static56.method1206("Connecting to friendserver");

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_723 = Static56.method1206("Close");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_724 = Static56.method1206("@gr1@");

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_725 = Static56.method1206("Login");

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
	public static int[] anIntArray289 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1286() {
		anIntArray289 = null;
		anIntArray288 = null;
		aClass31_721 = null;
		aClass31_725 = null;
		aClass31_722 = null;
		aClass31_719 = null;
		aClass31_724 = null;
		aClass31_723 = null;
		aClass31_720 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	public static void method1287(@OriginalArg(1) int arg0) {
		if (!Static40.method1277(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub2[] local14 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class2_Sub1_Sub2 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt264 = 0;
				local27.anInt253 = 0;
			}
		}
	}
}
