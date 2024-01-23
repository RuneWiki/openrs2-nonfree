import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[Lclient!pl;")
	public static Class132[] aClass132Array1;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt6023 = 0;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
	public static int[] anIntArray533 = new int[2048];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method4620() {
		Static2.aClass1_Sub14_Sub1_1.method2252(108);
		Static2.aClass1_Sub14_Sub1_1.method2191(Static217.method3458());
		Static2.aClass1_Sub14_Sub1_1.method2208(Static38.anInt950);
		Static2.aClass1_Sub14_Sub1_1.method2208(Static270.anInt5412);
		Static2.aClass1_Sub14_Sub1_1.method2191(Static309.anInt6196);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4621(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static2.aClass1_Sub14_Sub1_1.method2252(193);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0));
			Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!th;)V")
	public static void method4622(@OriginalArg(1) Class168 arg0) {
		Static313.aClass168_211 = arg0;
	}
}
