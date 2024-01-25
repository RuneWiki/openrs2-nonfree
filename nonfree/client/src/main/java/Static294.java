import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[I")
	public static final int[] anIntArray233 = new int[2048];

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Lclient!rq;")
	public static Class23_Sub2_Sub4 method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class23_Sub2_Sub4 local14 = local7.aClass23_Sub2_Sub4_1;
			local7.aClass23_Sub2_Sub4_1 = null;
			Static161.method2738(local14);
			return local14;
		}
	}
}
