import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public static int anInt7464;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt7463 = 1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!lj;IIII)V")
	public static void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt3851 == -1 && arg1.anIntArray280 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg1.anInt3850 * Static413.aClass49_Sub1_1.anInt3204 >> 8;
		if (arg0 > arg1.anInt3860) {
			local15 = arg0 - arg1.anInt3860;
		} else if (arg1.anInt3852 > arg0) {
			local15 = arg1.anInt3852 - arg0;
		}
		if (arg1.anInt3859 < arg3) {
			local15 += arg3 - arg1.anInt3859;
		} else if (arg3 < arg1.anInt3854) {
			local15 += arg1.anInt3854 - arg3;
		}
		if (arg1.anInt3853 == 0 || local15 - 64 > arg1.anInt3853 || Static413.aClass49_Sub1_1.anInt3204 == 0 || arg2 != arg1.anInt3855) {
			if (arg1.aClass4_Sub14_Sub4_2 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(arg1.aClass4_Sub14_Sub4_2);
				arg1.aClass4_Sub14_Sub4_2 = null;
			}
			if (arg1.aClass4_Sub14_Sub4_3 != null) {
				Static406.aClass4_Sub14_Sub2_2.method2420(arg1.aClass4_Sub14_Sub4_3);
				arg1.aClass4_Sub14_Sub4_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(153) int local153 = (arg1.anInt3853 - local15) * local23 / arg1.anInt3853;
		if (arg1.aClass4_Sub14_Sub4_2 != null) {
			arg1.aClass4_Sub14_Sub4_2.method4819(local153);
		} else if (arg1.anInt3851 >= 0) {
			@Pc(176) Class38 local176 = Static459.method614(Static277.aClass211_67, arg1.anInt3851, 0);
			if (local176 != null) {
				@Pc(183) Class4_Sub15_Sub1 local183 = local176.method615().method2508(Static5.aClass17_1);
				@Pc(188) Class4_Sub14_Sub4 local188 = Static466.method4814(local183, local153);
				local188.method4812(-1);
				Static406.aClass4_Sub14_Sub2_2.method2418(local188);
				arg1.aClass4_Sub14_Sub4_2 = local188;
			}
		}
		if (arg1.aClass4_Sub14_Sub4_3 != null) {
			arg1.aClass4_Sub14_Sub4_3.method4819(local153);
			if (arg1.aClass4_Sub14_Sub4_3.method6060()) {
				return;
			}
			arg1.aClass4_Sub14_Sub4_3 = null;
		} else if (arg1.anIntArray280 != null && (arg1.anInt3845 -= arg4) <= 0) {
			@Pc(222) int local222 = (int) (Math.random() * (double) arg1.anIntArray280.length);
			@Pc(230) Class38 local230 = Static459.method614(Static277.aClass211_67, arg1.anIntArray280[local222], 0);
			if (local230 != null) {
				@Pc(237) Class4_Sub15_Sub1 local237 = local230.method615().method2508(Static5.aClass17_1);
				@Pc(242) Class4_Sub14_Sub4 local242 = Static466.method4814(local237, local153);
				local242.method4812(0);
				Static406.aClass4_Sub14_Sub2_2.method2418(local242);
				arg1.aClass4_Sub14_Sub4_3 = local242;
				arg1.anInt3845 = (int) (Math.random() * (double) (arg1.anInt3857 - arg1.anInt3856)) + arg1.anInt3856;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[BIB)V")
	public static void method5925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		arg1 += arg0;
		@Pc(24) int local24 = arg2 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg1 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}
