import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
	public static int anInt2369 = 1;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_27 = new Class215(73, 2);

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "S")
	public static short aShort18 = 32767;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ba;III[Z)V")
	public static void method2015(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static417.aClass65Array4 == Static285.aClass65Array3) {
			return;
		}
		@Pc(9) int local9 = Static67.aClass65Array1[arg1].a(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class65 local22 = Static67.aClass65Array1[local11];
				if (local22 != null) {
					local22.p(arg0, arg2, local9 - local22.a(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method2016(@OriginalArg(0) Class247 arg0) {
		@Pc(11) Class247 local11 = Static12.method125(arg0);
		@Pc(17) int local17;
		@Pc(15) int local15;
		if (local11 == null) {
			local15 = Static302.anInt5346;
			local17 = Static141.anInt2881;
		} else {
			local17 = local11.anInt6833;
			local15 = local11.anInt6805;
		}
		Static43.method5658(false, local17, arg0, local15);
		Static309.method4160(arg0, local17, local15);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIIILclient!bn;I)V")
	public static void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub8 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt616 == -1 && arg3.anIntArray37 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(29) int local29 = arg3.anInt620 * Static323.aClass50_Sub1_1.anInt3449 >> 8;
		if (arg3.anInt615 < arg2) {
			local15 = arg2 - arg3.anInt615;
		} else if (arg3.anInt614 > arg2) {
			local15 = arg3.anInt614 - arg2;
		}
		if (arg1 > arg3.anInt612) {
			local15 += arg1 - arg3.anInt612;
		} else if (arg3.anInt613 > arg1) {
			local15 += arg3.anInt613 - arg1;
		}
		if (arg3.anInt611 == 0 || local15 - 64 > arg3.anInt611 || Static323.aClass50_Sub1_1.anInt3449 == 0 || arg3.anInt619 != arg0) {
			if (arg3.aClass4_Sub15_Sub3_2 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(arg3.aClass4_Sub15_Sub3_2);
				arg3.aClass4_Sub15_Sub3_2 = null;
			}
			if (arg3.aClass4_Sub15_Sub3_1 != null) {
				Static360.aClass4_Sub15_Sub2_2.method2955(arg3.aClass4_Sub15_Sub3_1);
				arg3.aClass4_Sub15_Sub3_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(149) int local149 = (arg3.anInt611 - local15) * local29 / arg3.anInt611;
		if (arg3.aClass4_Sub15_Sub3_2 != null) {
			arg3.aClass4_Sub15_Sub3_2.method4478(local149);
		} else if (arg3.anInt616 >= 0) {
			@Pc(161) Class241 local161 = Static464.method5244(Static67.aClass76_19, arg3.anInt616, 0);
			if (local161 != null) {
				@Pc(168) Class4_Sub4_Sub1 local168 = local161.method5245().method3079(Static275.aClass261_1);
				@Pc(173) Class4_Sub15_Sub3 local173 = Static462.method4489(local168, local149);
				local173.method4461(-1);
				Static360.aClass4_Sub15_Sub2_2.method2954(local173);
				arg3.aClass4_Sub15_Sub3_2 = local173;
			}
		}
		if (arg3.aClass4_Sub15_Sub3_1 != null) {
			arg3.aClass4_Sub15_Sub3_1.method4478(local149);
			if (arg3.aClass4_Sub15_Sub3_1.method5683()) {
				return;
			}
			arg3.aClass4_Sub15_Sub3_1 = null;
		} else if (arg3.anIntArray37 != null && (arg3.anInt618 -= arg4) <= 0) {
			@Pc(210) int local210 = (int) (Math.random() * (double) arg3.anIntArray37.length);
			@Pc(218) Class241 local218 = Static464.method5244(Static67.aClass76_19, arg3.anIntArray37[local210], 0);
			if (local218 != null) {
				@Pc(225) Class4_Sub4_Sub1 local225 = local218.method5245().method3079(Static275.aClass261_1);
				@Pc(230) Class4_Sub15_Sub3 local230 = Static462.method4489(local225, local149);
				local230.method4461(0);
				Static360.aClass4_Sub15_Sub2_2.method2954(local230);
				arg3.anInt618 = (int) ((double) (arg3.anInt622 - arg3.anInt623) * Math.random()) + arg3.anInt623;
				arg3.aClass4_Sub15_Sub3_1 = local230;
				return;
			}
		}
	}
}
