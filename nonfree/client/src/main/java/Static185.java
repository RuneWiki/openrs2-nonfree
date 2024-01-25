import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "[Lclient!eb;")
	public static final Class64[] aClass64Array1 = new Class64[14];

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_25 = new Class77(5);

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray71 = new boolean[100];

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "[I")
	public static final int[] anIntArray258 = new int[4096];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[J[I)V")
	public static void method2684(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static15.method274(arg1, 0, arg0.length - 1, arg0);
	}
}
