import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "[Lclient!vc;")
	public static final Class91[] aClass91Array1 = new Class91[6];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public static int method3371(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method3376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static38.aClass1_Sub14_Sub1_3.method3067(98);
		Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		Static38.aClass1_Sub14_Sub1_3.method3026(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIIII)V")
	public static void method3379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(11) int local11 = arg1 * arg1;
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = local11 << 1;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = arg1 << 1;
		@Pc(29) int local29 = local21 << 1;
		@Pc(39) int local39 = (1 - local25) * local21 + local17;
		@Pc(43) int local43 = local21 << 2;
		@Pc(51) int local51 = local11 - (local25 - 1) * local29;
		@Pc(67) int local67 = local17 * 3;
		@Pc(71) int local71 = local11 << 2;
		@Pc(79) int local79 = ((arg1 << 1) - 3) * local29;
		@Pc(85) int local85 = local71;
		@Pc(91) int local91 = (arg1 - 1) * local43;
		@Pc(114) int local114;
		@Pc(123) int local123;
		if (Static118.anInt2521 <= arg3 && Static204.anInt2389 >= arg3) {
			local114 = Static19.method429(Static102.anInt2207, arg4 + arg0, Static116.anInt2488);
			local123 = Static19.method429(Static102.anInt2207, arg4 - arg0, Static116.anInt2488);
			Static74.method1123(local123, arg2, Static142.anIntArrayArray25[arg3], local114);
		}
		while (local7 > 0) {
			local7--;
			local114 = arg3 - local7;
			local123 = arg3 + local7;
			if (local39 < 0) {
				while (local39 < 0) {
					local13++;
					local39 += local67;
					local51 += local85;
					local67 += local71;
					local85 += local71;
				}
			}
			if (local51 < 0) {
				local13++;
				local39 += local67;
				local51 += local85;
				local85 += local71;
				local67 += local71;
			}
			if (local123 >= Static118.anInt2521 && Static204.anInt2389 >= local114) {
				@Pc(207) int local207 = Static19.method429(Static102.anInt2207, local13 + arg4, Static116.anInt2488);
				@Pc(216) int local216 = Static19.method429(Static102.anInt2207, arg4 - local13, Static116.anInt2488);
				if (Static118.anInt2521 <= local114) {
					Static74.method1123(local216, arg2, Static142.anIntArrayArray25[local114], local207);
				}
				if (local123 <= Static204.anInt2389) {
					Static74.method1123(local216, arg2, Static142.anIntArrayArray25[local123], local207);
				}
			}
			local51 += -local79;
			local79 -= local43;
			local39 += -local91;
			local91 -= local43;
		}
	}
}
