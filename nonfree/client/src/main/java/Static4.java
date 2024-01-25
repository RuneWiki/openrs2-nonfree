import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	public static int anInt41;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString2 = "shake:";

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt39 = 255;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method32() {
		Static60.aClass6_1 = new Class6(8);
		Static267.anInt5493 = 0;
		for (@Pc(17) Class7_Sub7 local17 = (Class7_Sub7) Static116.aClass122_2.method2626(); local17 != null; local17 = (Class7_Sub7) Static116.aClass122_2.method2630()) {
			local17.method2824();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method33() {
		if (Static261.anInt5376 == 10) {
			Static16.method298(28);
		}
		if (Static261.anInt5376 == 30) {
			Static16.method298(25);
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	public static void method34() {
		@Pc(5) Class37 local5 = Static287.aClass37_91;
		synchronized (Static287.aClass37_91) {
			Static287.aClass37_91.method919();
		}
	}
}
