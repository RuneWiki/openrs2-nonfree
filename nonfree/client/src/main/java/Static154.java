import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	public static int anInt2453;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "Lclient!qo;")
	public static Class291 aClass291_2;

	@OriginalMember(owner = "client!fga", name = "y", descriptor = "Lclient!da;")
	public static Class6 aClass6_6;

	@OriginalMember(owner = "client!fga", name = "vb", descriptor = "Lclient!tg;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIII)V")
	public static void method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(14) int local14 = arg1 - arg4;
		if (local14 == 0) {
			if (local10 != 0) {
				Static355.method5610(arg3, arg4, arg2, arg0);
			}
		} else if (local10 == 0) {
			Static267.method4042(arg0, arg1, arg4, arg2);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(58) boolean local58 = local14 < local10;
			@Pc(62) int local62;
			@Pc(64) int local64;
			if (local58) {
				local62 = arg4;
				local64 = arg1;
				arg4 = arg0;
				arg0 = local62;
				arg1 = arg3;
				arg3 = local64;
			}
			if (arg4 > arg1) {
				local62 = arg4;
				local64 = arg0;
				arg4 = arg1;
				arg1 = local62;
				arg0 = arg3;
				arg3 = local64;
			}
			local62 = arg0;
			local64 = arg1 - arg4;
			@Pc(99) int local99 = arg3 - arg0;
			@Pc(104) int local104 = -(local64 >> 1);
			if (local99 < 0) {
				local99 = -local99;
			}
			@Pc(127) int local127 = arg3 <= arg0 ? -1 : 1;
			@Pc(131) int local131;
			if (local58) {
				for (local131 = arg4; local131 <= arg1; local131++) {
					Static267.anIntArrayArray20[local131][local62] = arg2;
					local104 += local99;
					if (local104 > 0) {
						local62 += local127;
						local104 -= local64;
					}
				}
			} else {
				for (local131 = arg4; local131 <= arg1; local131++) {
					local104 += local99;
					Static267.anIntArrayArray20[local62][local131] = arg2;
					if (local104 > 0) {
						local104 -= local64;
						local62 += local127;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!wd;B)V")
	public static void method2236(@OriginalArg(0) Class5_Sub12_Sub2 arg0) {
		arg0.method8622(Static355.aClass384_92.method8882());
		arg0.method8622(Static48.aClass384_22.method8882());
		arg0.method8622(Static400.aClass384_100.method8882());
		arg0.method8622(Static240.aClass384_57.method8882());
		arg0.method8622(Static61.aClass384_23.method8882());
		arg0.method8622(Static342.aClass384_86.method8882());
		arg0.method8622(Static7.aClass384_3.method8882());
		arg0.method8622(Static107.aClass384_33.method8882());
		arg0.method8622(Static488.aClass384_112.method8882());
		arg0.method8622(Static409.aClass384_102.method8882());
		arg0.method8622(Static635.aClass384_137.method8882());
		arg0.method8622(Static372.aClass384_96.method8882());
		arg0.method8622(Static416.aClass384_104.method8882());
		arg0.method8622(Static288.aClass384_72.method8882());
		arg0.method8622(Static340.aClass384_85.method8882());
		arg0.method8622(Static339.aClass384_84.method8882());
		arg0.method8622(Static159.aClass384_40.method8882());
		arg0.method8622(Static511.aClass384_113.method8882());
		arg0.method8622(Static148.aClass384_59.method8882());
		arg0.method8622(Static8.aClass384_5.method8882());
		arg0.method8622(Static152.aClass384_39.method8882());
		arg0.method8622(Static348.aClass384_89.method8882());
		arg0.method8622(Static462.aClass384_98.method8882());
		arg0.method8622(Static280.aClass384_71.method8882());
		arg0.method8622(Static330.aClass384_83.method8882());
		arg0.method8622(Static602.aClass384_131.method8882());
		arg0.method8622(Static179.aClass384_45.method8882());
		arg0.method8622(Static557.aClass384_123.method8882());
		arg0.method8622(Static308.aClass384_78.method8882());
		arg0.method8622(Static347.aClass384_128.method8882());
		arg0.method8622(Static361.aClass384_95.method8882());
		arg0.method8622(Static40.aClass384_20.method8882());
		arg0.method8622(Static135.method2001());
		arg0.method8622(Static31.method612());
		arg0.method8622(Static148.aClass384_60.method8882());
	}
}
