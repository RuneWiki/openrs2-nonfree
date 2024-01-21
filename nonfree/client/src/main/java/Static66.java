import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_499 = Static158.method3034(" is already on your ignore list)3");

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_500 = Static158.method3034("<br>");

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
	public static volatile int anInt2048 = 0;

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
	public static int anInt2049 = 0;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_501 = aClass60_499;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(III)I")
	public static int method1523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
