import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_81 = new Class146(6, 7);

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_215 = new Class56(47, 5);

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "[I")
	public static int[] anIntArray466 = new int[2];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg4 && arg6 == arg3 && arg0 == arg5 && arg2 == arg1) {
			Static398.method4985(arg6, arg2, arg8, arg0, arg7);
			return;
		}
		@Pc(36) int local36 = arg8;
		@Pc(38) int local38 = arg6;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = local50 + arg0 - arg8 - local58;
		@Pc(83) int local83 = arg2 + local54 - local62 - arg6;
		@Pc(93) int local93 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local62 + local46 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local127 * local72;
			@Pc(135) int local135 = local127 * local83;
			@Pc(139) int local139 = local93 * local121;
			@Pc(143) int local143 = local101 * local121;
			@Pc(147) int local147 = local113 * local106;
			@Pc(151) int local151 = local111 * local113;
			@Pc(161) int local161 = (local147 + local131 + local139 >> 12) + arg8;
			@Pc(171) int local171 = arg6 + (local151 + local135 + local143 >> 12);
			Static398.method4985(local38, local171, local36, local161, arg7);
			local38 = local171;
			local36 = local161;
		}
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
	public static void method4708() {
		for (@Pc(3) int local3 = 0; local3 < Static418.anInt7061; local3++) {
			@Pc(11) Class46 local11 = Static246.aClass46Array1[local3];
			if (local11.aByte19 == 2) {
				if (local11.aClass4_Sub14_Sub4_1 == null) {
					local11.anInt1156 = Integer.MIN_VALUE;
				} else {
					Static406.aClass4_Sub14_Sub2_2.method2420(local11.aClass4_Sub14_Sub4_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Z")
	public static boolean method4709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
