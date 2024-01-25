import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public static int anInt10194;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public static int anInt10195;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_193 = new Class322(114, 0);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)V")
	public static void method8789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg2;
		@Pc(14) int local14 = arg3 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static288.method4733(arg4, arg2, arg0, arg1);
			}
		} else if (local9 == 0) {
			Static153.method3053(arg3, arg1, arg4, arg2);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(63) boolean local63 = local9 > local14;
			@Pc(67) int local67;
			@Pc(71) int local71;
			if (local63) {
				local67 = arg1;
				arg1 = arg2;
				local71 = arg3;
				arg2 = local67;
				arg3 = arg0;
				arg0 = local71;
			}
			if (arg3 < arg1) {
				local67 = arg1;
				arg1 = arg3;
				local71 = arg2;
				arg2 = arg0;
				arg3 = local67;
				arg0 = local71;
			}
			local67 = arg2;
			local71 = arg3 - arg1;
			@Pc(108) int local108 = arg0 - arg2;
			@Pc(113) int local113 = -(local71 >> 1);
			@Pc(125) int local125 = arg0 <= arg2 ? -1 : 1;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(137) int local137;
			if (local63) {
				for (local137 = arg1; local137 <= arg3; local137++) {
					Static36.anIntArrayArray4[local137][local67] = arg4;
					local113 += local108;
					if (local113 > 0) {
						local67 += local125;
						local113 -= local71;
					}
				}
			} else {
				for (local137 = arg1; local137 <= arg3; local137++) {
					local113 += local108;
					Static36.anIntArrayArray4[local67][local137] = arg4;
					if (local113 > 0) {
						local67 += local125;
						local113 -= local71;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIIIII)V")
	public static void method8790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg2) {
			Static158.method3116(arg0, arg3, arg2, arg4);
		} else if (arg4 - arg2 >= Static398.anInt6878 && arg4 + arg2 <= Static8.anInt136 && Static605.anInt9561 <= arg3 - arg1 && arg3 + arg1 <= Static223.anInt4380) {
			Static105.method2016(arg1, arg4, arg2, arg3, arg0);
		} else {
			Static183.method3451(arg3, arg2, arg4, arg1, arg0);
		}
	}
}
