import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
	public static int anInt10294 = -1;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
	public static int anInt10298 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIII)V")
	public static void method9029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(72) int local72 = local21 * 3;
		@Pc(80) int local80 = local25 * ((arg0 << 1) - 3);
		@Pc(86) int local86 = local55;
		@Pc(92) int local92 = local51 * (arg0 - 1);
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (arg4 >= Static617.anInt9501 && arg4 <= Static519.anInt8267) {
			local112 = Static67.method9535(Static8.anInt99, arg2 + arg3, Static14.anInt206);
			local120 = Static67.method9535(Static8.anInt99, arg3 - arg2, Static14.anInt206);
			Static494.method7075(local120, arg1, local112, Static449.anIntArrayArray48[arg4], 18601);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local72;
					local47 += local86;
					local86 += local55;
					local7++;
					local72 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local86;
				local38 += local72;
				local86 += local55;
				local72 += local55;
				local7++;
			}
			local47 += -local80;
			local38 += -local92;
			local80 -= local51;
			local92 -= local51;
			local9--;
			local112 = arg4 - local9;
			local120 = local9 + arg4;
			if (local120 >= Static617.anInt9501 && local112 <= Static519.anInt8267) {
				@Pc(235) int local235 = Static67.method9535(Static8.anInt99, local7 + arg3, Static14.anInt206);
				@Pc(243) int local243 = Static67.method9535(Static8.anInt99, arg3 - local7, Static14.anInt206);
				if (local112 >= Static617.anInt9501) {
					Static494.method7075(local243, arg1, local235, Static449.anIntArrayArray48[local112], 18601);
				}
				if (local120 <= Static519.anInt8267) {
					Static494.method7075(local243, arg1, local235, Static449.anIntArrayArray48[local120], 18601);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([IZ)Ljava/lang/String;")
	public static String method9030(@OriginalArg(0) int[] arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(18) int local18 = Static453.anInt7382;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(29) Class131 local29 = Static412.aClass344_1.method8186(arg0[local20]);
			if (local29.anInt3147 != -1) {
				@Pc(42) Class43 local42 = (Class43) Static288.aClass85_33.method1737((long) local29.anInt3147);
				if (local42 == null) {
					@Pc(50) Class355 local50 = Static737.method8362(Static117.aClass254_47, local29.anInt3147, 0);
					if (local50 != null) {
						local42 = Static396.aClass145_6.method9683(local50, true);
						Static288.aClass85_33.method1745((long) local29.anInt3147, 16383, local42);
					}
				}
				if (local42 != null) {
					Static467.aClass43Array17[local18] = local42;
					local16.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local16.toString();
	}
}
