import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
	public static int anInt4030;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "[I")
	public static int[] anIntArray328 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method3239(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static79.method1220(0, arg1.length - 1, arg1, arg0);
	}
}
