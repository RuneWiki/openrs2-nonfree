import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt2854;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt2847 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_924 = Static49.method1293("M");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_923 = aClass70_924;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!rf;")
	private static Class70 aClass70_929 = Static49.method1293("Loading fonts )2 ");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_925 = aClass70_929;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!rf;")
	public static Class70 aClass70_926 = Static49.method1293("Stufe)2");

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
	public static int[] anIntArray270 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!rf;")
	public static Class70 aClass70_927 = aClass70_924;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_928 = Static49.method1293("Titelbild geladen)3");

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method2116() {
		anIntArray270 = null;
		aClass70_927 = null;
		aClass70_928 = null;
		aClass70_924 = null;
		aClass70_925 = null;
		aClass70_929 = null;
		aClass1_Sub1_Sub1_Sub3_3 = null;
		aClass70_923 = null;
		aClass70_926 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public static void method2117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static134.anInt3479 != 0 && arg1 != -1) {
			Static34.method876(Static134.anInt3479, Static161.aClass76_Sub1_16, 0, arg1);
			aBoolean115 = true;
		}
	}
}
