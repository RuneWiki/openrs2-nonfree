import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_84 = new Class337(106, 5);

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_85 = new Class337(98, 20);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I")
	public static int method4248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static553.method8060(arg1 + 45365, arg0 + 91923, 4) + (Static553.method8060(arg1 + 10294, arg0 + 37821, 2) + -128 >> 1) + (Static553.method8060(arg1, arg0, 1) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I")
	public static int method4250() {
		return Static83.anInt6730++;
	}
}
