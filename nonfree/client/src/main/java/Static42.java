import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!pl;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public static int anInt917 = 2;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
	public static void method897(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static125.method2260(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)I")
	public static int method898(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
