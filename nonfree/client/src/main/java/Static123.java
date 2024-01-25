import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)I")
	public static int method2326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static256.method4338(4, arg1 + 91923, arg0 + 45365) + (Static256.method4338(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static256.method4338(1, arg1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
