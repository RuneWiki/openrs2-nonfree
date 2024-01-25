import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Lclient!oi;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
	public static final int[] anIntArray185 = new int[14];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
	public static void method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(14) int local14 = arg4 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static111.method1531(arg3, arg1, arg0, arg2);
			}
		} else if (local9 == 0) {
			Static384.method5636(arg1, arg4, arg2, arg0);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(61) boolean local61 = local9 > local14;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg0;
				local67 = arg4;
				arg0 = arg2;
				arg2 = local65;
				arg4 = arg3;
				arg3 = local67;
			}
			if (arg4 < arg0) {
				local65 = arg0;
				arg0 = arg4;
				local67 = arg2;
				arg4 = local65;
				arg2 = arg3;
				arg3 = local67;
			}
			local65 = arg2;
			local67 = arg4 - arg0;
			@Pc(101) int local101 = arg3 - arg2;
			@Pc(106) int local106 = -(local67 >> 1);
			@Pc(113) int local113 = arg3 > arg2 ? 1 : -1;
			if (local101 < 0) {
				local101 = -local101;
			}
			@Pc(123) int local123;
			if (local61) {
				for (local123 = arg0; local123 <= arg4; local123++) {
					Static133.anIntArrayArray15[local123][local65] = arg1;
					local106 += local101;
					if (local106 > 0) {
						local106 -= local67;
						local65 += local113;
					}
				}
			} else {
				for (local123 = arg0; local123 <= arg4; local123++) {
					Static133.anIntArrayArray15[local65][local123] = arg1;
					local106 += local101;
					if (local106 > 0) {
						local65 += local113;
						local106 -= local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lclient!rp;")
	public static Class212 method2624(@OriginalArg(0) int arg0) {
		@Pc(13) Class212[] local13 = Static449.method5912();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class212 local21 = local13[local15];
			if (arg0 == local21.anInt5877) {
				return local21;
			}
		}
		return null;
	}
}
