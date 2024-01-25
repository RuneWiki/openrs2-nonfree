import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mv", name = "P", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!mv", name = "H", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_98 = new Class349(100, 16);

	@OriginalMember(owner = "client!mv", name = "R", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_99 = new Class349(52, 9);

	@OriginalMember(owner = "client!mv", name = "T", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIII)V")
	public static void method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = local13 << 1;
		@Pc(37) int local37 = arg2 << 1;
		@Pc(46) int local46 = local29 + local13 * (1 - local37);
		@Pc(55) int local55 = local17 - (local37 - 1) * local33;
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg2 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = (arg2 - 1) * local59;
		@Pc(109) int local109;
		@Pc(118) int local118;
		if (Static275.anInt4756 <= arg1 && arg1 <= Static48.anInt898) {
			local109 = Static290.method4092(Static89.anInt1576, arg4 + arg3, Static130.anInt2131);
			local118 = Static290.method4092(Static89.anInt1576, arg3 - arg4, Static130.anInt2131);
			Static437.method5735(local118, Static238.anIntArrayArray36[arg1], local109, arg0);
		}
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local55 += local85;
					local46 += local71;
					local7++;
					local71 += local63;
					local85 += local63;
				}
			}
			if (local55 < 0) {
				local46 += local71;
				local55 += local85;
				local85 += local63;
				local71 += local63;
				local7++;
			}
			local46 += -local91;
			local55 += -local79;
			local79 -= local59;
			local9--;
			local91 -= local59;
			local109 = arg1 - local9;
			local118 = arg1 + local9;
			if (Static275.anInt4756 <= local118 && local109 <= Static48.anInt898) {
				@Pc(223) int local223 = Static290.method4092(Static89.anInt1576, local7 + arg3, Static130.anInt2131);
				@Pc(232) int local232 = Static290.method4092(Static89.anInt1576, arg3 - local7, Static130.anInt2131);
				if (local109 >= Static275.anInt4756) {
					Static437.method5735(local232, Static238.anIntArrayArray36[local109], local223, arg0);
				}
				if (local118 <= Static48.anInt898) {
					Static437.method5735(local232, Static238.anIntArrayArray36[local118], local223, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!gk;I)Lclient!lo;")
	public static Class213_Sub1 method4975(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(7) Class213 local7 = Static368.method6719(arg0);
		@Pc(15) int local15 = arg0.method4470();
		return new Class213_Sub1(local7.anInt5124, local7.aClass322_7, local7.aClass347_7, local7.anInt5119, local7.anInt5118, local15);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Lclient!gk;I)Lclient!pc;")
	public static Class153_Sub2 method4978(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(7) Class153 local7 = Static415.method1370(arg0);
		@Pc(11) int local11 = arg0.method4518();
		@Pc(15) int local15 = arg0.method4518();
		@Pc(24) int local24 = arg0.method4518();
		@Pc(28) int local28 = arg0.method4518();
		@Pc(32) int local32 = arg0.method4518();
		@Pc(36) int local36 = arg0.method4518();
		return new Class153_Sub2(local7.aClass322_13, local7.aClass347_13, local7.anInt9314, local7.anInt9315, local7.anInt9316, local7.anInt9312, local7.anInt9317, local7.anInt9313, local7.anInt9310, local11, local15, local24, local28, local32, local36);
	}
}
