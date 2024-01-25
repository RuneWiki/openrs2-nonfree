import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
	public static int anInt8564;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "J")
	public static long aLong220 = 0L;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIB)Z")
	public static boolean method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static197.aByteArrayArrayArray24[1].length > arg0 && arg1 < Static197.aByteArrayArrayArray24[1][arg0].length) {
			return (Static197.aByteArrayArrayArray24[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
	public static void method7385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) int local20 = arg3 - arg1;
		@Pc(25) int local25 = arg2 - arg0;
		if (local25 == 0) {
			if (local20 != 0) {
				Static368.method5826(arg1, arg3, arg4, arg0);
			}
		} else if (local20 == 0) {
			Static215.method3658(arg1, arg0, arg2, arg4);
		} else {
			if (local20 < 0) {
				local20 = -local20;
			}
			if (local25 < 0) {
				local25 = -local25;
			}
			@Pc(69) boolean local69 = local25 < local20;
			@Pc(73) int local73;
			@Pc(77) int local77;
			if (local69) {
				local73 = arg0;
				arg0 = arg1;
				local77 = arg2;
				arg1 = local73;
				arg2 = arg3;
				arg3 = local77;
			}
			if (arg2 < arg0) {
				local73 = arg0;
				local77 = arg1;
				arg0 = arg2;
				arg1 = arg3;
				arg2 = local73;
				arg3 = local77;
			}
			local73 = arg1;
			local77 = arg2 - arg0;
			@Pc(113) int local113 = arg3 - arg1;
			@Pc(118) int local118 = -(local77 >> 1);
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(134) int local134 = arg3 <= arg1 ? -1 : 1;
			@Pc(138) int local138;
			if (local69) {
				for (local138 = arg0; local138 <= arg2; local138++) {
					local118 += local113;
					Static484.anIntArrayArray41[local138][local73] = arg4;
					if (local118 > 0) {
						local73 += local134;
						local118 -= local77;
					}
				}
			} else {
				for (local138 = arg0; local138 <= arg2; local138++) {
					local118 += local113;
					Static484.anIntArrayArray41[local73][local138] = arg4;
					if (local118 > 0) {
						local118 -= local77;
						local73 += local134;
					}
				}
			}
		}
	}
}
