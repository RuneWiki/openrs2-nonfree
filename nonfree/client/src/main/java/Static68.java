import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	public static int anInt1361;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Lclient!cea;")
	public static Class9_Sub2_Sub1_Sub2_Sub1 aClass9_Sub2_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_49 = new Class194(98, 4);

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
	public static void method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static368.method5889(arg1, arg4, arg2, arg0);
			}
		} else if (local10 == 0) {
			Static138.method2376(arg2, arg0, arg1, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(61) boolean local61 = local15 < local10;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg0;
				local67 = arg3;
				arg0 = arg2;
				arg2 = local65;
				arg3 = arg4;
				arg4 = local67;
			}
			if (arg0 > arg3) {
				local65 = arg0;
				local67 = arg2;
				arg0 = arg3;
				arg3 = local65;
				arg2 = arg4;
				arg4 = local67;
			}
			local65 = arg2;
			local67 = arg3 - arg0;
			@Pc(108) int local108 = arg4 - arg2;
			@Pc(113) int local113 = -(local67 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(125) int local125 = arg4 <= arg2 ? -1 : 1;
			@Pc(129) int local129;
			if (local61) {
				for (local129 = arg0; local129 <= arg3; local129++) {
					local113 += local108;
					Static71.anIntArrayArray5[local129][local65] = arg1;
					if (local113 > 0) {
						local113 -= local67;
						local65 += local125;
					}
				}
			} else {
				for (local129 = arg0; local129 <= arg3; local129++) {
					Static71.anIntArrayArray5[local65][local129] = arg1;
					local113 += local108;
					if (local113 > 0) {
						local113 -= local67;
						local65 += local125;
					}
				}
			}
		}
	}
}
