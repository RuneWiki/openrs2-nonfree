import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "Lclient!wm;")
	public static Class345 aClass345_1;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "Lclient!nj;")
	public static final Class212 aClass212_1 = new Class212(64);

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "[I")
	public static final int[] anIntArray42 = new int[32];

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
	public static boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
	public static int anInt551 = 64;

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "I")
	public static int anInt552 = -1;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V")
	public static void method450() {
		Static503.method848(Static480.aClass6_Sub37_Sub1_1.aBoolean397);
		Static555.aClass6_Sub19_Sub4_8 = new Class6_Sub19_Sub4();
		Static555.aClass6_Sub19_Sub4_8.method7733();
		Static29.aClass45_1 = Static573.method7835(22050, Static152.aClass57_4, Static34.aCanvas15, 0);
		Static29.aClass45_1.method6501(Static555.aClass6_Sub19_Sub4_8);
		Static277.method3981(Static555.aClass6_Sub19_Sub4_8, Static509.aClass251_142, Static63.aClass251_23, Static527.aClass251_147);
		Static194.aClass45_2 = Static573.method7835(2048, Static152.aClass57_4, Static34.aCanvas15, 1);
		Static144.aClass6_Sub19_Sub3_2 = new Class6_Sub19_Sub3();
		Static194.aClass45_2.method6501(Static144.aClass6_Sub19_Sub3_2);
		Static246.aClass21_1 = new Class21(22050, Static508.anInt8600);
		Static318.anInt5763 = Static375.aClass251_107.method5863("scape main");
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
	public static void method453() {
		if (!Static79.method1195()) {
			return;
		}
		if (Static316.aStringArray22 == null) {
			Static61.method778();
		}
		Static501.anInt8338 = 0;
		Static43.aBoolean27 = true;
		try {
			Static505.aClipboard1 = Static153.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(25) Exception local25) {
		}
	}
}
