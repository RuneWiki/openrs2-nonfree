import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
	public static int anInt3209;

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "J")
	public static long aLong83;

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)V")
	public static void method2908() {
		Static490.method7292();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!qk;IIZB)V")
	public static void method2910(@OriginalArg(0) Class279 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) int local8 = arg0.anInt8153;
		@Pc(11) int local11 = arg0.anInt8141;
		if (arg0.aByte107 == 0) {
			arg0.anInt8153 = arg0.anInt8191;
		} else if (arg0.aByte107 == 1) {
			arg0.anInt8153 = arg1 - arg0.anInt8191;
		} else if (arg0.aByte107 == 2) {
			arg0.anInt8153 = arg0.anInt8191 * arg1 >> 14;
		}
		if (arg0.aByte108 == 0) {
			arg0.anInt8141 = arg0.anInt8194;
		} else if (arg0.aByte108 == 1) {
			arg0.anInt8141 = arg2 - arg0.anInt8194;
		} else if (arg0.aByte108 == 2) {
			arg0.anInt8141 = arg0.anInt8194 * arg2 >> 14;
		}
		if (arg0.aByte107 == 4) {
			arg0.anInt8153 = arg0.anInt8141 * arg0.anInt8133 / arg0.anInt8173;
		}
		if (arg0.aByte108 == 4) {
			arg0.anInt8141 = arg0.anInt8153 * arg0.anInt8173 / arg0.anInt8133;
		}
		if (Static351.aBoolean491 && (Static76.method1833(arg0).anInt2466 != 0 || arg0.anInt8204 == 0)) {
			if (arg0.anInt8141 < 5 && arg0.anInt8153 < 5) {
				arg0.anInt8141 = 5;
				arg0.anInt8153 = 5;
			} else {
				if (arg0.anInt8153 <= 0) {
					arg0.anInt8153 = 5;
				}
				if (arg0.anInt8141 <= 0) {
					arg0.anInt8141 = 5;
				}
			}
		}
		if (Static198.anInt8759 == arg0.anInt8137) {
			Static270.aClass279_8 = arg0;
		}
		if (arg3 && arg0.anObjectArray21 != null && (arg0.anInt8153 != local8 || local11 != arg0.anInt8141)) {
			@Pc(203) Class3_Sub21 local203 = new Class3_Sub21();
			local203.anObjectArray1 = arg0.anObjectArray21;
			local203.aClass279_5 = arg0;
			Static443.aClass223_45.method5868(local203);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILclient!cs;)I")
	public static int method2911(@OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anInt5739 == 0) {
			return 0;
		}
		@Pc(67) int local67;
		@Pc(60) int local60;
		if (arg0.anInt5744 != -1) {
			@Pc(22) Class4_Sub1_Sub2_Sub1 local22 = null;
			if (arg0.anInt5744 < 32768) {
				@Pc(46) Class3_Sub28 local46 = (Class3_Sub28) Static551.aClass280_43.method7107((long) arg0.anInt5744);
				if (local46 != null) {
					local22 = local46.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				}
			} else if (arg0.anInt5744 >= 32768) {
				local22 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[arg0.anInt5744 - 32768];
			}
			if (local22 != null) {
				local60 = arg0.anInt8916 - local22.anInt8916;
				local67 = arg0.anInt8911 - local22.anInt8911;
				if (local60 != 0 || local67 != 0) {
					arg0.method5065((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub1_Sub2_Sub1_Sub2) {
			@Pc(90) Class4_Sub1_Sub2_Sub1_Sub2 local90 = (Class4_Sub1_Sub2_Sub1_Sub2) arg0;
			if (local90.anInt5818 != -1 && (local90.anInt5792 == 0 || local90.anInt5794 > 0)) {
				local90.method5065(local90.anInt5818);
				local90.anInt5818 = -1;
			}
		} else if (arg0 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
			@Pc(120) Class4_Sub1_Sub2_Sub1_Sub1 local120 = (Class4_Sub1_Sub2_Sub1_Sub1) arg0;
			if (local120.anInt3767 != -1 && (local120.anInt5792 == 0 || local120.anInt5794 > 0)) {
				local60 = local120.anInt8916 - (local120.anInt3767 - Static299.anInt5307 - Static299.anInt5307) * 256;
				local67 = local120.anInt8911 - (local120.anInt3779 - Static171.anInt3340 - Static171.anInt3340) * 256;
				if (local60 != 0 || local67 != 0) {
					local120.method5065((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
				local120.anInt3767 = -1;
			}
		}
		return arg0.method5073();
	}
}
