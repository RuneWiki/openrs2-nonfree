import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZI)I")
	public static int method4752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static168.method2733(4, arg1 + 45365, arg0 + 91923) + (Static168.method2733(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static168.method2733(1, arg1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
