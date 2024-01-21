import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public static int anInt2560 = 1;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
	public static boolean method1838(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBII)V")
	public static void method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static62.method946(arg4, arg3, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static57.method915(arg1, arg3, arg2, arg4);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(59) boolean local59 = local10 > local15;
			@Pc(63) int local63;
			@Pc(67) int local67;
			if (local59) {
				local63 = arg4;
				arg4 = arg3;
				local67 = arg1;
				arg3 = local63;
				arg1 = arg0;
				arg0 = local67;
			}
			if (arg1 < arg4) {
				local63 = arg4;
				arg4 = arg1;
				local67 = arg3;
				arg3 = arg0;
				arg0 = local67;
				arg1 = local63;
			}
			local63 = arg3;
			local67 = arg1 - arg4;
			@Pc(103) int local103 = arg0 - arg3;
			@Pc(108) int local108 = -(local67 >> 1);
			@Pc(124) int local124 = arg3 >= arg0 ? -1 : 1;
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(133) int local133;
			if (local59) {
				for (local133 = arg4; local133 <= arg1; local133++) {
					local108 += local103;
					Static157.anIntArrayArray24[local133][local63] = arg2;
					if (local108 > 0) {
						local108 -= local67;
						local63 += local124;
					}
				}
			} else {
				for (local133 = arg4; local133 <= arg1; local133++) {
					local108 += local103;
					Static157.anIntArrayArray24[local63][local133] = arg2;
					if (local108 > 0) {
						local63 += local124;
						local108 -= local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IBI)I")
	public static int method1840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(38) int local38 = Static70.method1022(arg1 + 91923, arg0 + 45365, 4) + (Static70.method1022(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static70.method1022(arg1, arg0, 1) + -128 >> 2) - 128;
		local38 = (int) ((double) local38 * 0.3D) + 35;
		if (local38 < 10) {
			local38 = 10;
		} else if (local38 > 60) {
			local38 = 60;
		}
		return local38;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ce;I)Lclient!mh;")
	public static Class30_Sub3 method1841(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class30_Sub3(arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1271(), arg0.method1271(), arg0.method1278());
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZBZ)I")
	public static int method1842() {
		return Static64.anInt1359 + Static143.anInt2941;
	}
}
