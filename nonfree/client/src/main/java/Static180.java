import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_61 = new Class92(41, 3);

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method2955(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static416.method6104(0, arg0, arg1, arg0.length - 1);
	}
}
