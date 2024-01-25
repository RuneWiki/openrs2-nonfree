import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZII)Z")
	public static boolean method3978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static62.method4211(arg0, arg1) & Static458.method6369(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)Lclient!uo;")
	public static Class336 method3979(@OriginalArg(0) int arg0) {
		@Pc(15) Class336 local15 = (Class336) Static506.aClass10_57.method250((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static260.aClass246_124.method5653(0, arg0);
		local15 = new Class336();
		if (local25 != null) {
			local15.method7128(new Class3_Sub11(local25), arg0);
		}
		Static506.aClass10_57.method254(local15, (long) arg0);
		return local15;
	}
}
