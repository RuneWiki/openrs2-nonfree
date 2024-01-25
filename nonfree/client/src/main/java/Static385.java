import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "[Lclient!waa;")
	public static final Interface26[] anInterface26Array2 = new Interface26[75];

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_35 = new Class163();

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BII)I")
	public static int method4985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIZI)I")
	public static int method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg1) {
			return arg1 <= arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}
}
