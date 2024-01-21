import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Lclient!h;")
	public static Class4_Sub11 aClass4_Sub11_4;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	public static final int[] anIntArray243 = new int[200];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	public static int anInt2619 = -1;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_950 = Static177.method3050(" <col=00ff80>");

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	public static int anInt2621 = -1;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	public static volatile int anInt2622 = -1;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	public static volatile int anInt2623 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class46 method1977(@OriginalArg(1) int arg0) {
		@Pc(5) Class46 local5 = Static127.method2240(arg0);
		for (@Pc(15) int local15 = local5.method1677() - 3; local15 > 0; local15 -= 3) {
			local5 = Static69.method1482(new Class46[] { local5.method1666(local15, 0), Static56.aClass46_1230, local5.method1650(local15) });
		}
		if (local5.method1677() > 9) {
			return Static69.method1482(new Class46[] { aClass46_950, local5.method1666(local5.method1677() - 8, 0), Static172.aClass46_1411, Static71.aClass46_715, local5, Static37.aClass46_334 });
		} else if (local5.method1677() > 6) {
			return Static69.method1482(new Class46[] { Static101.aClass46_930, local5.method1666(local5.method1677() - 4, 0), Static135.aClass46_1180, Static71.aClass46_715, local5, Static37.aClass46_334 });
		} else {
			return Static69.method1482(new Class46[] { Static111.aClass46_1004, local5, Static149.aClass46_1259 });
		}
	}
}
