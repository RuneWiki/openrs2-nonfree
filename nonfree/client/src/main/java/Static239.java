import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public static int anInt4284;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "Lclient!hv;")
	public static Class110 aClass110_2;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "[I")
	public static final int[] anIntArray345 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
	public static int anInt4288 = 0;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
	public static void method3548() {
		if (Static295.aString39.length() == 0) {
			return;
		}
		Static391.method5338("--> " + Static295.aString39);
		Static194.method2939(false, Static295.aString39);
		Static295.aString39 = "";
		Static27.anInt561 = 0;
		Static162.anInt2970 = 0;
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)V")
	public static void method3549() {
		if (aClass110_2 != null) {
			aClass110_2.method4778();
		}
		if (Static220.aClass110_1 != null) {
			Static220.aClass110_1.method4778();
		}
	}
}
