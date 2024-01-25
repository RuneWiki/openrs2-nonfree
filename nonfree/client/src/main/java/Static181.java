import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public static int anInt3574 = 104;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt3575 = 0;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt3576 = -1;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt3578 = -1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ja;IIIII)V")
	public static void method2960(@OriginalArg(0) Class6_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt3591 == -1 && arg0.anIntArray227 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg0.anInt3597 * Static291.aClass28_Sub1_1.anInt1036 >> 8;
		if (arg0.anInt3599 < arg1) {
			local16 = arg1 - arg0.anInt3599;
		} else if (arg0.anInt3594 > arg1) {
			local16 = arg0.anInt3594 - arg1;
		}
		if (arg3 > arg0.anInt3592) {
			local16 += arg3 - arg0.anInt3592;
		} else if (arg0.anInt3596 > arg3) {
			local16 += arg0.anInt3596 - arg3;
		}
		if (arg0.anInt3603 == 0 || arg0.anInt3603 < local16 - 64 || Static291.aClass28_Sub1_1.anInt1036 == 0 || arg2 != arg0.anInt3589) {
			if (arg0.aClass6_Sub4_Sub1_3 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(arg0.aClass6_Sub4_Sub1_3);
				arg0.aClass6_Sub4_Sub1_3 = null;
			}
			if (arg0.aClass6_Sub4_Sub1_2 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(arg0.aClass6_Sub4_Sub1_2);
				arg0.aClass6_Sub4_Sub1_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(145) int local145 = (arg0.anInt3603 - local16) * local24 / arg0.anInt3603;
		if (arg0.aClass6_Sub4_Sub1_3 != null) {
			arg0.aClass6_Sub4_Sub1_3.method463(local145);
		} else if (arg0.anInt3591 >= 0) {
			@Pc(163) Class127 local163 = Static454.method3004(Static298.aClass100_55, arg0.anInt3591, 0);
			if (local163 != null) {
				@Pc(170) Class6_Sub17_Sub1 local170 = local163.method3001().method2572(Static9.aClass14_1);
				@Pc(175) Class6_Sub4_Sub1 local175 = Static452.method431(local170, local145);
				local175.method435(-1);
				Static360.aClass6_Sub4_Sub4_2.method5905(local175);
				arg0.aClass6_Sub4_Sub1_3 = local175;
			}
		}
		if (arg0.aClass6_Sub4_Sub1_2 != null) {
			arg0.aClass6_Sub4_Sub1_2.method463(local145);
			if (!arg0.aClass6_Sub4_Sub1_2.method6531()) {
				arg0.aClass6_Sub4_Sub1_2 = null;
			}
		} else if (arg0.anIntArray227 != null && (arg0.anInt3602 -= arg4) <= 0) {
			@Pc(223) int local223 = (int) (Math.random() * (double) arg0.anIntArray227.length);
			@Pc(231) Class127 local231 = Static454.method3004(Static298.aClass100_55, arg0.anIntArray227[local223], 0);
			if (local231 != null) {
				@Pc(238) Class6_Sub17_Sub1 local238 = local231.method3001().method2572(Static9.aClass14_1);
				@Pc(243) Class6_Sub4_Sub1 local243 = Static452.method431(local238, local145);
				local243.method435(0);
				Static360.aClass6_Sub4_Sub4_2.method5905(local243);
				arg0.anInt3602 = arg0.anInt3590 + (int) (Math.random() * (double) (arg0.anInt3601 - arg0.anInt3590));
				arg0.aClass6_Sub4_Sub1_2 = local243;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method2961() {
		for (@Pc(1) int local1 = 0; local1 < Static96.anInt5952; local1++) {
			@Pc(6) Class3_Sub2 local6 = Static81.aClass3_Sub2Array1[local1];
			Static384.method5696(local6);
			Static81.aClass3_Sub2Array1[local1] = null;
		}
		Static96.anInt5952 = 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!he;ZI)Lclient!rp;")
	public static Class6_Sub35 method2962(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2515(arg1);
		return local13 == null ? null : new Class6_Sub35(local13);
	}
}
