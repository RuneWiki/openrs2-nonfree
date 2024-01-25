import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_74 = new Class169(84, 3);

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
	public static int anInt2787 = 1;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIII)V")
	public static void method2590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static457.anInt8209 <= arg0 - arg1 && Static407.anInt7583 >= arg1 + arg0 && Static427.anInt7845 <= arg3 - arg1 && Static631.anInt10922 >= arg3 + arg1) {
			Static283.method4743(arg0, arg1, arg2, arg3);
		} else {
			Static173.method3388(arg2, arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)V")
	public static void method2591() {
		Static632.anInt10931 = -1;
		Static311.anInt5615 = 1;
		Static530.anInt9738 = 2;
		Static337.aClass124_71 = null;
		Static151.aClass2_Sub26_Sub3_5 = null;
		Static264.anInt5034 = -1;
		Static138.aBoolean196 = false;
		Static131.anInt2515 = 0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!cea;Lclient!gga;Z)V")
	public static void method2592(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class124 arg1) {
		Static31.aClass48_1 = arg0;
		Static238.aString58 = "";
		Static628.aClass124_127 = arg1;
		if (Class346.aString114.startsWith("win")) {
			Static238.aString58 = Static238.aString58 + "windows/";
		} else if (Class346.aString114.startsWith("linux")) {
			Static238.aString58 = Static238.aString58 + "linux/";
		} else if (Class346.aString114.startsWith("mac")) {
			Static238.aString58 = Static238.aString58 + "macos/";
		}
		if (Static31.aClass48_1.aBoolean76) {
			Static238.aString58 = Static238.aString58 + "msjava/";
		} else if (Class346.aString115.startsWith("amd64") || Class346.aString115.startsWith("x86_64")) {
			Static238.aString58 = Static238.aString58 + "x86_64/";
		} else if (Class346.aString115.startsWith("i386") || Class346.aString115.startsWith("i486") || Class346.aString115.startsWith("i586") || Class346.aString115.startsWith("x86")) {
			Static238.aString58 = Static238.aString58 + "x86/";
		} else if (Class346.aString115.startsWith("ppc")) {
			Static238.aString58 = Static238.aString58 + "ppc/";
		} else {
			Static238.aString58 = Static238.aString58 + "universal/";
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public static void method2593() {
		if (Static579.anInt10049 == 3) {
			Static248.method4408(4);
		} else if (Static579.anInt10049 == 7) {
			Static248.method4408(8);
		} else if (Static579.anInt10049 == 10) {
			Static248.method4408(11);
		}
	}
}
