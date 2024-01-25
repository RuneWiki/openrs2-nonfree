import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "Lclient!en;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_118 = new Class160(8, -1);

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)I")
	public static int method7482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
