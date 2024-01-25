import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public static int anInt5823;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Lclient!wo;")
	public static Class216 aClass216_91;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public static int anInt5824;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBI)I")
	public static int method4982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static51.method1312(arg1 + 45365, 4, arg0 + 91923) + (Static51.method1312(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static51.method1312(arg1, 1, arg0) - 128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}
