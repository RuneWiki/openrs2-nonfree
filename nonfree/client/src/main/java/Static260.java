import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jfa", name = "G", descriptor = "F")
	public static float aFloat170;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
	public static final int anInt8324 = 4;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIII)V")
	public static void method7058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(37) int local37 = arg3 << 1;
		@Pc(46) int local46 = local21 + local13 * (1 - local37);
		@Pc(55) int local55 = local17 - local25 * (local37 - 1);
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local21 * 3;
		@Pc(79) int local79 = local25 * ((arg3 << 1) - 3);
		@Pc(85) int local85 = local63;
		Static280.method5108(arg1 + arg4, Static208.anIntArrayArray20[arg2], arg1 - arg4, arg0);
		@Pc(104) int local104 = local59 * (arg3 - 1);
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local55 += local85;
					local46 += local71;
					local7++;
					local85 += local63;
					local71 += local63;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local7++;
				local85 += local63;
				local71 += local63;
			}
			local55 += -local79;
			local46 += -local104;
			local104 -= local59;
			local79 -= local59;
			local9--;
			@Pc(178) int local178 = arg2 - local9;
			@Pc(183) int local183 = arg2 + local9;
			@Pc(188) int local188 = arg1 + local7;
			@Pc(193) int local193 = arg1 - local7;
			Static280.method5108(local188, Static208.anIntArrayArray20[local178], local193, arg0);
			Static280.method5108(local188, Static208.anIntArrayArray20[local183], local193, arg0);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7061(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!se;I)Z")
	public static boolean method7063(@OriginalArg(0) Interface21 arg0) {
		@Pc(10) Class161 local10 = Static27.aClass342_3.method8534(arg0.method8625());
		if (local10.anInt5364 == -1) {
			return true;
		} else {
			@Pc(22) Class306 local22 = Static16.aClass237_3.method6466(local10.anInt5364);
			return local22.anInt9255 == -1 ? true : local22.method7742();
		}
	}
}
