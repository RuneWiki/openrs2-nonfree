import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	public static int anInt6072;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "J")
	public static volatile long aLong178 = 0L;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt6075 = -1;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I")
	public static int method5025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(37) int local37 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}
}
