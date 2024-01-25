import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_114 = new Class254(109, -1);

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt6153 = -1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg4 && arg1 == arg8 && arg5 == arg3 && arg2 == arg7) {
			Static165.method3363(arg3, arg8, arg4, arg0, arg2);
			return;
		}
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg8;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(72) int local72 = local50 + arg3 - arg4 - local58;
		@Pc(82) int local82 = arg2 + local54 - arg8 - local62;
		@Pc(92) int local92 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local127 * local72;
			@Pc(135) int local135 = local127 * local82;
			@Pc(139) int local139 = local92 * local121;
			@Pc(143) int local143 = local121 * local101;
			@Pc(147) int local147 = local106 * local113;
			@Pc(151) int local151 = local111 * local113;
			@Pc(162) int local162 = arg4 + (local139 + local131 + local147 >> 12);
			@Pc(172) int local172 = (local143 + local135 + local151 >> 12) + arg8;
			Static165.method3363(local162, local38, local36, arg0, local172);
			local36 = local162;
			local38 = local172;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method5252(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static85.method1890(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(40) int local40;
			do {
				local40 = arg0.nextInt();
			} while (local40 >= local37);
			return Static278.method4601(arg1, local40);
		}
	}
}
