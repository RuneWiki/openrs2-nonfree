import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "[Lclient!h;")
	public static final Class25_Sub1_Sub1_Sub2[] aClass25_Sub1_Sub1_Sub2Array1 = new Class25_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "[I")
	public static final int[] anIntArray365 = new int[32];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
	public static int method2526(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
