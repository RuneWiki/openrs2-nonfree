import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static549 {

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "Lclient!sba;")
	public static Class300 aClass300_11;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
	public static final int[] anIntArray697 = new int[8];

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "[J")
	public static final long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method7595(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static148.method5907(arg0, 0, arg0.length - 1, arg1);
	}
}
