import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method6691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = (Static523.aShort105 - Static69.aShort31) * local7 / 100 + Static69.aShort31;
		Static469.anInt7885 = Static469.anInt7886 * local34 >> 8;
		@Pc(46) int local46 = arg6 * local34 >> 8;
		@Pc(53) int local53 = 16384 - arg4 & 0x3FFF;
		@Pc(59) int local59 = 16384 - arg0 & 0x3FFF;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = local46;
		if (local53 != 0) {
			local63 = Class377.anIntArray600[local53] * -local46 >> 14;
			local65 = Class377.anIntArray601[local53] * local46 >> 14;
		}
		if (local59 != 0) {
			local61 = Class377.anIntArray600[local59] * local65 >> 14;
			local65 = Class377.anIntArray601[local59] * local65 >> 14;
		}
		Static210.anInt4029 = arg4;
		Static19.anInt277 = arg3 - local61;
		Static290.anInt5062 = 0;
		Static117.anInt2170 = arg1 - local65;
		Static441.anInt7550 = arg5 - local63;
		Static491.anInt8292 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIB)I")
	public static int method6692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
