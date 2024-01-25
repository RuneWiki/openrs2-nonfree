import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!aga;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt4751;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "F")
	public static float aFloat116 = 0.0F;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFFI)I")
	public static int method3815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB[BI)V")
	public static void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		arg2 += arg0;
		@Pc(23) int local23 = arg1 - arg0 >> 2;
		while (true) {
			local23--;
			if (local23 < 0) {
				local23 = arg1 - arg0 & 0x3;
				while (true) {
					local23--;
					if (local23 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(37) int local37 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg3[local37] = 1;
			@Pc(47) int local47 = local42 + 1;
			arg3[local42] = 1;
			arg2 = local47 + 1;
			arg3[local47] = 1;
		}
	}
}
