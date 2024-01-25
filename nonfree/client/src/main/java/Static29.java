import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "[I")
	public static final int[] anIntArray14 = new int[3];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIII)I")
	public static int method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) int local25 = 65536 - Class377.anIntArray601[arg0 * 8192 / arg2] >> 1;
		return (arg1 * local25 >> 16) + (arg3 * (65536 - local25) >> 16);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZD)V")
	public static void method326(@OriginalArg(1) double arg0) {
		if (Static31.aDouble2 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static542.anIntArray505[local7] = local19 > 255 ? 255 : local19;
		}
		Static31.aDouble2 = arg0;
	}
}
