import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!bw;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
	public static final int[] anIntArray665 = new int[8];

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_209 = new Class150(83, 8);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method6902(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static165.method2923(0, arg1, arg0, arg0.length - 1);
	}
}
