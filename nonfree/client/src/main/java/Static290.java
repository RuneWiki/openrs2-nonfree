import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt9206 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	public static int method7653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static154.aByteArrayArrayArray15[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static154.aByteArrayArrayArray15[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)I")
	public static int method7656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}
}
