import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "[I")
	public static int[] anIntArray650 = new int[1];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I")
	public static int method7920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)I")
	public static int method7921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(23) int local23 = local9 << 13 ^ local9;
		@Pc(37) int local37 = Integer.MAX_VALUE & local23 * (local23 * 15731 * local23 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}
}
