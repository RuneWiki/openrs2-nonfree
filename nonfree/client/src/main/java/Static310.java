import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	public static int anInt4994;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
	public static int anInt4998;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIIII)I")
	public static int method4219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26 = 65536 - Canvas_Sub1.anIntArray498[arg0 * 8192 / arg1] >> 1;
		return (arg2 * (65536 - local26) >> 16) + (local26 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZI)I")
	public static int method4220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}
}
