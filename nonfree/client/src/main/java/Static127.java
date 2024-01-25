import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!ph;")
	public static Class162 aClass162_4;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!vp;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "S")
	public static short aShort31 = 1;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	public static final int anInt2832 = -1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method2616() {
		@Pc(7) Class217[] local7 = Class45.aClass217Array1;
		synchronized (Class45.aClass217Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class45.aClass217Array1.length; local16++) {
				Class45.aClass217Array1[local16] = new Class217();
				Static122.anIntArray251[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg2 == arg7 && arg1 == arg8 && arg5 == arg6) {
			Static82.method1813(arg1, arg3, arg2, arg4, arg6);
			return;
		}
		@Pc(23) int local23 = arg3;
		@Pc(25) int local25 = arg2;
		@Pc(29) int local29 = arg3 * 3;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(59) int local59 = local37 + arg1 - arg3 - local45;
		@Pc(68) int local68 = local41 + arg6 - local49 - arg2;
		@Pc(77) int local77 = local29 + local45 - local37 - local37;
		@Pc(87) int local87 = local33 + local49 - local41 - local41;
		@Pc(92) int local92 = local37 - local29;
		@Pc(97) int local97 = local41 - local33;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(107) int local107 = local99 * local99 >> 12;
			@Pc(113) int local113 = local99 * local107 >> 12;
			@Pc(117) int local117 = local113 * local59;
			@Pc(121) int local121 = local113 * local68;
			@Pc(125) int local125 = local107 * local77;
			@Pc(129) int local129 = local107 * local87;
			@Pc(133) int local133 = local99 * local92;
			@Pc(137) int local137 = local97 * local99;
			@Pc(147) int local147 = (local117 + local125 + local133 >> 12) + arg3;
			@Pc(157) int local157 = (local137 + local129 + local121 >> 12) + arg2;
			Static82.method1813(local147, local23, local25, arg4, local157);
			local23 = local147;
			local25 = local157;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Lclient!sl;")
	public static Class17_Sub5 method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass17_Sub5_1 == null ? null : local7.aClass17_Sub5_1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
	public static void method2620(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub4_Sub9 local10 = Static139.method4227(arg0, 2);
		local10.method1868();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	public static void method2621() {
		@Pc(1) Class87 local1 = Static248.aClass87_43;
		synchronized (Static248.aClass87_43) {
			Static248.aClass87_43.method2477();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)Lclient!ul;")
	public static Class205 method2622(@OriginalArg(0) int arg0) {
		@Pc(15) Class205 local15 = (Class205) Static198.aClass87_10.method2482((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static213.aClass216_72.method5648(31, arg0);
		local15 = new Class205();
		if (local27 != null) {
			local15.method5275(new Class1_Sub8(local27), arg0);
		}
		Static198.aClass87_10.method2481(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!be;II)V")
	public static void method2625(@OriginalArg(1) Class17_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt4830 && arg1 != -1) {
			@Pc(87) Class24 local87 = Static110.method5411(arg1);
			@Pc(90) int local90 = local87.anInt1037;
			if (local90 == 1) {
				arg0.anInt4863 = 0;
				arg0.anInt4840 = 0;
				arg0.anInt4856 = arg2;
				arg0.anInt4854 = 1;
				arg0.anInt4828 = 0;
				Static318.method5216(arg0.anInt5109, arg0.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0, local87, arg0.anInt4863);
			}
			if (local90 == 2) {
				arg0.anInt4828 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4830 == -1 || Static110.method5411(arg1).anInt1051 >= Static110.method5411(arg0.anInt4830).anInt1051) {
			arg0.anInt4856 = arg2;
			arg0.anInt4828 = 0;
			arg0.anInt4840 = 0;
			arg0.anInt4830 = arg1;
			arg0.anInt4897 = arg0.anInt4893;
			arg0.anInt4854 = 1;
			arg0.anInt4863 = 0;
			if (arg0.anInt4830 == -1) {
				return;
			}
			Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, Static110.method5411(arg0.anInt4830), arg0.anInt4863);
		}
	}
}
