import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBI)I")
	public static int method1758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static191.method3055(arg0 + 45365, arg1 + 91923, 4) + (Static191.method3055(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static191.method3055(arg0, arg1, 1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}
