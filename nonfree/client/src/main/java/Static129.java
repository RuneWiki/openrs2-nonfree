import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt3037;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public static int anInt3035 = 0;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public static int anInt3040 = 0;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	public static int method2644(@OriginalArg(1) int arg0) {
		if (Static155.aClass114_3 != null) {
			Static155.aClass114_3.method3165();
			Static155.aClass114_3 = null;
		}
		Static247.anInt5052++;
		if (Static247.anInt5052 > 4) {
			Static247.anInt5052 = 0;
			Static28.anInt6554 = 0;
			return arg0;
		}
		if (Static207.anInt4331 == Static156.anInt5228) {
			Static156.anInt5228 = Static100.anInt2562;
		} else {
			Static156.anInt5228 = Static207.anInt4331;
		}
		Static28.anInt6554 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIB)V")
	public static void method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13 = arg0 - arg1;
		@Pc(18) int local18 = arg4 - arg2;
		if (local18 == 0) {
			if (local13 != 0) {
				Static127.method2622(arg2, arg1, arg3, arg0);
			}
		} else if (local13 == 0) {
			Static96.method5421(arg3, arg2, arg4, arg1);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local18 < 0) {
				local18 = -local18;
			}
			@Pc(71) boolean local71 = local13 > local18;
			@Pc(75) int local75;
			@Pc(77) int local77;
			if (local71) {
				local75 = arg2;
				local77 = arg4;
				arg2 = arg1;
				arg1 = local75;
				arg4 = arg0;
				arg0 = local77;
			}
			if (arg4 < arg2) {
				local75 = arg2;
				local77 = arg1;
				arg2 = arg4;
				arg1 = arg0;
				arg4 = local75;
				arg0 = local77;
			}
			local75 = arg1;
			local77 = arg4 - arg2;
			@Pc(116) int local116 = arg0 - arg1;
			@Pc(121) int local121 = -(local77 >> 1);
			@Pc(128) int local128 = arg0 <= arg1 ? -1 : 1;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(137) int local137;
			if (local71) {
				for (local137 = arg2; local137 <= arg4; local137++) {
					Static223.anIntArrayArray124[local137][local75] = arg3;
					local121 += local116;
					if (local121 > 0) {
						local121 -= local77;
						local75 += local128;
					}
				}
			} else {
				for (local137 = arg2; local137 <= arg4; local137++) {
					Static223.anIntArrayArray124[local75][local137] = arg3;
					local121 += local116;
					if (local121 > 0) {
						local121 -= local77;
						local75 += local128;
					}
				}
			}
		}
	}
}
