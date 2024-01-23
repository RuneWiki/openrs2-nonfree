import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[1000];

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static int anInt2232 = -1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V")
	public static void method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static49.anInt1057 = Static147.aClass119ArrayArray1[arg1][arg0].anInt3251;
		Static259.anInt5231 = Static147.aClass119ArrayArray1[arg1][arg0].anInt3253;
		Static190.anInt3578 = Static147.aClass119ArrayArray1[arg1][arg0].anInt3248;
		Static34.method628((float) Static49.anInt1057, (float) Static259.anInt5231, (float) Static190.anInt3578);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ak;ZII)Lclient!bf;")
	public static Class1_Sub2_Sub2 method1824(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static139.method2193(arg0, arg1, 0) ? Static54.method923() : null;
	}
}
