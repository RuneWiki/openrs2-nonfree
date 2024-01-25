import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg7 == arg1 && arg4 == arg0 && arg5 == arg2) {
			Static196.method2623(arg3, arg6, arg1, arg5, arg0);
			return;
		}
		@Pc(32) int local32 = arg3;
		@Pc(34) int local34 = arg1;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(68) int local68 = arg0 + local46 - arg3 - local54;
		@Pc(78) int local78 = arg5 + local50 - arg1 - local58;
		@Pc(87) int local87 = local54 + local38 - local46 - local46;
		@Pc(96) int local96 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(105) int local105 = local50 - local42;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local115 * local107 >> 12;
			@Pc(125) int local125 = local68 * local121;
			@Pc(129) int local129 = local121 * local78;
			@Pc(133) int local133 = local115 * local87;
			@Pc(137) int local137 = local115 * local96;
			@Pc(141) int local141 = local107 * local101;
			@Pc(145) int local145 = local107 * local105;
			@Pc(155) int local155 = (local141 + local133 + local125 >> 12) + arg3;
			@Pc(165) int local165 = (local145 + local137 + local129 >> 12) + arg1;
			Static196.method2623(local32, arg6, local34, local165, local155);
			local34 = local165;
			local32 = local155;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BZ)Z")
	public static boolean method253(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static407.aClass200_9.method5839();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static407.aClass200_9.method5887();
		} else if (!Static407.aClass200_9.method5844()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static216.aClass1_Sub1_1.aBoolean304 = arg0;
			Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
			return true;
		}
	}
}
