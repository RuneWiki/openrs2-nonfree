import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_39 = new Class200(56, 12);

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_21 = new Class102(50);

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_40 = new Class200(98, 4);

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
	public static int anInt3395 = -2;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V")
	public static void method3045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(9, arg2);
		local8.method3608();
		local8.anInt4062 = arg0;
		local8.anInt4064 = arg1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!sl;)Lclient!cba;")
	public static Class6_Sub2_Sub1 method3047(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(12) Class6_Sub2 local12 = Static453.method3847(arg0);
		@Pc(16) int local16 = arg0.method4209();
		return new Class6_Sub2_Sub1(local12.aClass83_8, local12.aClass50_7, local12.anInt2442, local12.anInt2443, local12.anInt2440, local12.anInt2436, local12.anInt2437, local12.anInt2439, local12.anInt2444, local12.anInt1640, local12.anInt1636, local12.anInt1638, local12.anInt1642, local12.anInt1644, local12.anInt1641, local16);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIBIII)V")
	public static void method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static366.method5972(arg4, arg0, arg3, arg1);
			}
		} else if (local10 == 0) {
			Static377.method6072(arg3, arg1, arg0, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(58) boolean local58 = local15 < local10;
			@Pc(62) int local62;
			@Pc(66) int local66;
			if (local58) {
				local62 = arg0;
				arg0 = arg3;
				local66 = arg2;
				arg3 = local62;
				arg2 = arg4;
				arg4 = local66;
			}
			if (arg2 < arg0) {
				local62 = arg0;
				arg0 = arg2;
				local66 = arg3;
				arg3 = arg4;
				arg2 = local62;
				arg4 = local66;
			}
			local62 = arg3;
			local66 = arg2 - arg0;
			@Pc(98) int local98 = arg4 - arg3;
			@Pc(107) int local107 = -(local66 >> 1);
			if (local98 < 0) {
				local98 = -local98;
			}
			@Pc(119) int local119 = arg4 > arg3 ? 1 : -1;
			@Pc(123) int local123;
			if (local58) {
				for (local123 = arg0; local123 <= arg2; local123++) {
					local107 += local98;
					Static460.anIntArrayArray53[local123][local62] = arg1;
					if (local107 > 0) {
						local62 += local119;
						local107 -= local66;
					}
				}
			} else {
				for (local123 = arg0; local123 <= arg2; local123++) {
					local107 += local98;
					Static460.anIntArrayArray53[local62][local123] = arg1;
					if (local107 > 0) {
						local62 += local119;
						local107 -= local66;
					}
				}
			}
		}
	}
}
