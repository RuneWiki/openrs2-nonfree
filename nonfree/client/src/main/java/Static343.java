import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt6063;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public static final int[] anIntArray412 = new int[4096];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
	public static void method5090(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static130.method6499(arg0, arg1.length - 1, 0, arg1);
	}
}
