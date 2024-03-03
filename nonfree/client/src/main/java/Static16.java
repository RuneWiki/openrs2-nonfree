import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt4746;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int anInt4748;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!wm;")
	public static Class19 aClass19_10;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([II[J)V", line = 24)
	public static void method4408(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static57.method1673(arg1, arg1.length - 1, arg0, 0);
	}
}
