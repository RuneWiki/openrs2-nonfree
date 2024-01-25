import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
	public static int anInt6764;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	public static int anInt6769;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I")
	public static int method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static22.method7565(arg0 + 91923, 4, arg1 + 45365) + (Static22.method7565(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static22.method7565(arg0, 1, arg1) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}
}
