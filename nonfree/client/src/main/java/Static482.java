import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rfa", name = "P", descriptor = "I")
	public static int anInt8212;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBC)I")
	public static int method7142(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)V")
	public static void method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static2.method20(arg3, arg4, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static545.method7971(arg4, arg3, arg1, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(65) boolean local65 = local15 < local10;
			@Pc(69) int local69;
			@Pc(73) int local73;
			if (local65) {
				local69 = arg3;
				arg3 = arg4;
				local73 = arg1;
				arg1 = arg2;
				arg4 = local69;
				arg2 = local73;
			}
			if (arg3 > arg1) {
				local69 = arg3;
				arg3 = arg1;
				local73 = arg4;
				arg1 = local69;
				arg4 = arg2;
				arg2 = local73;
			}
			local69 = arg4;
			local73 = arg1 - arg3;
			@Pc(106) int local106 = arg2 - arg4;
			@Pc(111) int local111 = -(local73 >> 1);
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(127) int local127 = arg2 > arg4 ? 1 : -1;
			@Pc(131) int local131;
			if (local65) {
				for (local131 = arg3; local131 <= arg1; local131++) {
					Static249.anIntArrayArray23[local131][local69] = arg0;
					local111 += local106;
					if (local111 > 0) {
						local69 += local127;
						local111 -= local73;
					}
				}
			} else {
				for (local131 = arg3; local131 <= arg1; local131++) {
					Static249.anIntArrayArray23[local69][local131] = arg0;
					local111 += local106;
					if (local111 > 0) {
						local111 -= local73;
						local69 += local127;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(JJ)J")
	public static long method7144(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
