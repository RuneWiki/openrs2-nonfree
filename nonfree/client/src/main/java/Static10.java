import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!jd;")
	public static Class84 aClass84_6;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public static int anInt280 = 0;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public static int anInt283 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBII)V")
	public static void method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg4 - arg2;
		if (local14 == 0) {
			if (local10 != 0) {
				Static264.method4418(arg2, arg0, arg3, arg1);
			}
		} else if (local10 == 0) {
			Static246.method4095(arg2, arg4, arg1, arg3);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(63) boolean local63 = local10 > local14;
			@Pc(67) int local67;
			@Pc(73) int local73;
			if (local63) {
				local67 = arg2;
				arg2 = arg1;
				arg1 = local67;
				local73 = arg4;
				arg4 = arg0;
				arg0 = local73;
			}
			if (arg4 < arg2) {
				local67 = arg2;
				arg2 = arg4;
				arg4 = local67;
				local73 = arg1;
				arg1 = arg0;
				arg0 = local73;
			}
			local67 = arg1;
			local73 = arg4 - arg2;
			@Pc(109) int local109 = arg0 - arg1;
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(121) int local121 = arg1 >= arg0 ? -1 : 1;
			@Pc(126) int local126 = -(local73 >> 1);
			@Pc(130) int local130;
			if (local63) {
				for (local130 = arg2; local130 <= arg4; local130++) {
					local126 += local109;
					Static274.anIntArrayArray50[local130][local67] = arg3;
					if (local126 > 0) {
						local67 += local121;
						local126 -= local73;
					}
				}
			} else {
				for (local130 = arg2; local130 <= arg4; local130++) {
					Static274.anIntArrayArray50[local67][local130] = arg3;
					local126 += local109;
					if (local126 > 0) {
						local67 += local121;
						local126 -= local73;
					}
				}
			}
		}
	}
}
