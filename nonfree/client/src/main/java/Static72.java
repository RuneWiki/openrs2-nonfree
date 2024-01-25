import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!co", name = "u", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_10 = new Class140(2, 2);

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Lclient!qg;")
	public static final Class272 aClass272_5 = new Class272("WTQA", 2);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)I")
	public static int method1560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static56.method999(arg1 + 45365, 4, arg0 + 91923) + (Static56.method999(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static56.method999(arg1, 1, arg0) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}
}
