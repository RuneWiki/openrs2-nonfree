import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt5829;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt5830;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)I")
	public static int method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)I")
	public static int method4856(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static212.method3355(arg0);
	}
}
