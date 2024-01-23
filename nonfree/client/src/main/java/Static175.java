import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!nk;")
	public static Class121 aClass121_83;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array7;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString197 = "Loading world list data";

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public static int anInt3407 = 0;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
	public static int[] anIntArray286 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!lf;I)V")
	public static void method2943(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (Static70.aClass68_1 == null) {
			return;
		}
		try {
			Static70.aClass68_1.method1973(0L);
			Static70.aClass68_1.method1978(arg1, arg0.aByteArray17, 24);
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public static void method2944() {
		Static160.aClass187_85.method4525();
		Static285.aClass187_143.method4525();
		Static226.aClass187_114.method4525();
	}
}
