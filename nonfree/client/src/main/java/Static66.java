import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!h", name = "U", descriptor = "Lclient!wa;")
	public static Class23 aClass23_28;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_498 = Static161.method2452("Login limit exceeded)3");

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_497 = aClass20_498;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_499 = Static161.method2452("Click to switch");

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "Lclient!dc;")
	public static Class20 aClass20_500 = aClass20_499;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(III)I")
	public static int method1093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local17 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local17 * arg1;
		} else {
			return local17;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wa;IIILclient!wa;)Lclient!ig;")
	public static Class5_Sub2_Sub8 method1094(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class23 arg3) {
		return Static167.method2532(arg0, arg2, arg1) ? Static33.method539(arg3.method738(arg1, arg2)) : null;
	}
}
