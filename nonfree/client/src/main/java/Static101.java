import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!kc;")
	public static Class11 aClass11_24;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public static int anInt2750;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub3_Sub1Array5;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!lc;")
	public static Class31 aClass31_940 = Static56.method1206("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!lc;")
	public static Class31 aClass31_941 = Static56.method1206("scrollbar");

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static volatile int anInt2740 = 0;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_942 = Static56.method1206("Import complete");

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_943 = Static56.method1206("Take @lre@");

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	public static int anInt2751 = 128;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!lc;")
	public static Class31 aClass31_944 = Static56.method1206("Chat panel redrawn");

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_945 = Static56.method1206("scroll:");

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt2755 = 0;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public static int anInt2760 = 2;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Lclient!lc;")
	public static Class31 aClass31_946 = Static56.method1206("Aug");

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Lclient!lc;")
	public static Class31 aClass31_947 = Static56.method1206("Walk here");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method1720(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method1726() {
		aClass31_943 = null;
		aClass2_Sub1_Sub3_Sub1Array5 = null;
		aClass31_947 = null;
		aClass31_942 = null;
		aClass31_944 = null;
		aClass31_945 = null;
		aClass31_946 = null;
		aClass11_24 = null;
		aClass31_941 = null;
		aClass31_940 = null;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method1731() {
		if (Static40.anInt2035 > 0) {
			Static69.method1377();
		} else {
			Static75.method1404(40);
			Static86.aClass35_3 = Static89.aClass35_4;
		}
	}
}
