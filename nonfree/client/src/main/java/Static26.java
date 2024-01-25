import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!av", name = "jb", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!av", name = "kb", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
	public static boolean method590(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method591(@OriginalArg(1) String arg0) {
		if (Static419.aClass249Array1 != null) {
			Static144.method2331(Static292.aClass296_377);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg0));
			Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)V")
	public static void method592(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static69.anInt1331 = arg0;
		Static487.aClass72_Sub4Array1 = new Class72_Sub4[Static74.anIntArray157[Static69.anInt1331] + 1];
		Static115.anInt2354 = 0;
		Static371.anInt6837 = 0;
	}
}
