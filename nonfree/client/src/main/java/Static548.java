import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZF)F")
	public static float method7163(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBII)Z")
	public static boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface14 local9 = (Interface14) Static389.method5373(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static510.method6614(local9) & true;
		}
		local9 = (Interface14) Static32.method551(arg0, arg1, arg2, je.class);
		if (local9 != null) {
			local11 &= Static510.method6614(local9);
		}
		local9 = (Interface14) Static347.method5019(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static510.method6614(local9);
		}
		return local11;
	}
}
