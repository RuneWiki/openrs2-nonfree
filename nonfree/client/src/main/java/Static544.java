import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Lclient!lp;")
	public static Class6_Sub8_Sub4 aClass6_Sub8_Sub4_10;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!af;")
	public static final Class10 aClass10_52 = new Class10(8);

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "Z")
	public static boolean aBoolean667 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
	public static int method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static391.method5565(arg1 + 91923, 4, arg0 + 45365) + (Static391.method5565(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static391.method5565(arg1, 1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
