import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!wja", name = "g", descriptor = "Lclient!vba;")
	public static Class5_Sub3_Sub20 aClass5_Sub3_Sub20_5;

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "Lclient!jaa;")
	public static final Class173 aClass173_7 = new Class173();

	@OriginalMember(owner = "client!wja", name = "f", descriptor = "I")
	public static int anInt10679 = 0;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIBIII)V")
	public static void method8874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static275.method4483(arg2, arg1, arg3, arg4);
			}
		} else if (local10 == 0) {
			Static246.method3847(arg4, arg1, arg2, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(67) boolean local67 = local10 > local15;
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (local67) {
				local71 = arg1;
				local73 = arg0;
				arg1 = arg4;
				arg0 = arg3;
				arg4 = local71;
				arg3 = local73;
			}
			if (arg0 < arg1) {
				local71 = arg1;
				local73 = arg4;
				arg1 = arg0;
				arg4 = arg3;
				arg0 = local71;
				arg3 = local73;
			}
			local71 = arg4;
			local73 = arg0 - arg1;
			@Pc(116) int local116 = arg3 - arg4;
			@Pc(121) int local121 = -(local73 >> 1);
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(136) int local136 = arg3 <= arg4 ? -1 : 1;
			@Pc(140) int local140;
			if (local67) {
				for (local140 = arg1; local140 <= arg0; local140++) {
					local121 += local116;
					Static16.anIntArrayArray2[local140][local71] = arg2;
					if (local121 > 0) {
						local71 += local136;
						local121 -= local73;
					}
				}
			} else {
				for (local140 = arg1; local140 <= arg0; local140++) {
					local121 += local116;
					Static16.anIntArrayArray2[local71][local140] = arg2;
					if (local121 > 0) {
						local121 -= local73;
						local71 += local136;
					}
				}
			}
		}
	}
}
