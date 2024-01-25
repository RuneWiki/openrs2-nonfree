import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
	public static int method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static175.method7482(4, arg1 + 91923, arg0 + 45365) + (Static175.method7482(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static175.method7482(1, arg1, arg0) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
