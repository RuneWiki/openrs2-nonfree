import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Lclient!mt;")
	public static Class199 aClass199_14;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
	public static final int[] anIntArray639 = new int[3];

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!h;")
	public static final Class114 aClass114_155 = new Class114("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_112 = new Class186(52, 6);

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Lclient!h;")
	public static final Class114 aClass114_156 = new Class114("K", "T", "K", "K");

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)V")
	public static void method6954() {
		Static444.method6416(Static17.aClass186_4);
		Static192.aClass1_Sub13_Sub2_1.method3060(Static155.method3122());
		Static192.aClass1_Sub13_Sub2_1.method3038(Static290.anInt6867);
		Static192.aClass1_Sub13_Sub2_1.method3038(Static90.anInt2326);
		Static192.aClass1_Sub13_Sub2_1.method3060(Static89.aClass1_Sub28_Sub1_1.anInt4890);
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V")
	public static void method6956() {
		Static535.aClass1_Sub12_Sub4_3.method6549();
		Static491.anInt8374 = 1;
		Static249.aClass160_53 = null;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(B)Z")
	public static boolean method6957() {
		try {
			if (Static491.anInt8374 == 2) {
				if (Static35.aClass1_Sub38_1 == null) {
					Static35.aClass1_Sub38_1 = Static558.method5759(Static249.aClass160_53, Static52.anInt1509, Static141.anInt3296);
					if (Static35.aClass1_Sub38_1 == null) {
						return false;
					}
				}
				if (Static398.aClass131_1 == null) {
					Static398.aClass131_1 = new Class131(Static420.aClass160_87, Static543.aClass160_106);
				}
				if (Static535.aClass1_Sub12_Sub4_3.method6552(Static310.aClass160_70, Static398.aClass131_1, Static35.aClass1_Sub38_1)) {
					Static535.aClass1_Sub12_Sub4_3.method6540();
					Static535.aClass1_Sub12_Sub4_3.method6554(Static118.anInt2858);
					Static535.aClass1_Sub12_Sub4_3.method6556(Static35.aClass1_Sub38_1, Static141.aBoolean205);
					Static398.aClass131_1 = null;
					Static249.aClass160_53 = null;
					Static35.aClass1_Sub38_1 = null;
					Static491.anInt8374 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static535.aClass1_Sub12_Sub4_3.method6549();
			Static491.anInt8374 = 0;
			Static249.aClass160_53 = null;
			Static35.aClass1_Sub38_1 = null;
			Static398.aClass131_1 = null;
		}
		return false;
	}
}
