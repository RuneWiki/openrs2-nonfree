import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[8];

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public static int anInt213 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method191() {
		Static353.method5842(false);
		if (Static100.anInt1934 >= 0 && Static100.anInt1934 != 0) {
			Static20.method360(Static100.anInt1934);
			Static100.anInt1934 = -1;
		}
	}
}
