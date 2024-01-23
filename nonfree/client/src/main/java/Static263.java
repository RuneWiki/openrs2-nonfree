import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	public static int anInt5161;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
	public static int anInt5160 = 0;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method4118(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static292.method4552(arg0, arg0.length - 1, 0, arg1);
	}
}
