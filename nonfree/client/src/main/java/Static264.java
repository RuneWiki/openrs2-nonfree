import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jga", name = "db", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!jga", name = "Q", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_102 = new Class200(36, 4);

	@OriginalMember(owner = "client!jga", name = "eb", descriptor = "I")
	public static int anInt4966 = -1;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!rl;Lclient!ac;Lclient!cc;BIIII)V")
	public static void method4366(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class16_Sub1_Sub1_Sub3_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub27 local12 = new Class2_Sub27();
		local12.anInt5404 = arg6 << 9;
		local12.anInt5418 = arg4;
		local12.anInt5408 = arg5 << 9;
		if (arg1 != null) {
			local12.aClass5_1 = arg1;
			@Pc(33) int local33 = arg1.anInt67;
			@Pc(36) int local36 = arg1.anInt72;
			if (arg3 == 1 || arg3 == 3) {
				local36 = arg1.anInt67;
				local33 = arg1.anInt72;
			}
			local12.anIntArray344 = arg1.anIntArray12;
			local12.anInt5407 = arg1.anInt92;
			local12.aBoolean400 = arg1.aBoolean13;
			local12.anInt5402 = arg1.anInt98 << 9;
			local12.anInt5419 = arg1.anInt94;
			local12.anInt5406 = arg1.anInt75;
			local12.anInt5412 = arg1.anInt80;
			local12.anInt5409 = arg5 + local36 << 9;
			local12.anInt5403 = arg1.anInt99 << 9;
			local12.anInt5413 = arg1.anInt103;
			local12.anInt5417 = arg1.anInt107;
			local12.anInt5415 = local33 + arg6 << 9;
			local12.aBoolean402 = arg1.aBoolean15;
			if (arg1.anIntArray9 != null) {
				local12.aBoolean401 = true;
				local12.method4738();
			}
			if (local12.anIntArray344 != null) {
				local12.anInt5414 = local12.anInt5413 + (int) (Math.random() * (double) (local12.anInt5407 - local12.anInt5413));
			}
			Static143.aClass114_16.method2771(local12);
		} else if (arg2 != null) {
			local12.aClass16_Sub1_Sub1_Sub3_Sub1_1 = arg2;
			@Pc(153) Class113 local153 = arg2.aClass113_1;
			if (local153.anIntArray213 != null) {
				local12.aBoolean401 = true;
				local153 = local153.method2752(Static382.aClass282_1);
			}
			if (local153 != null) {
				local12.anInt5409 = local153.anInt3238 + arg5 << 9;
				local12.anInt5415 = local153.anInt3238 + arg6 << 9;
				local12.anInt5417 = Static317.method4870(arg2);
				local12.anInt5419 = local153.anInt3205;
				local12.anInt5412 = local153.anInt3217;
				local12.aBoolean402 = local153.aBoolean251;
				local12.anInt5406 = local153.anInt3216;
				local12.anInt5403 = local153.anInt3220 << 9;
				local12.anInt5402 = local153.anInt3204 << 9;
			}
			Static536.aClass114_41.method2771(local12);
		} else if (arg0 != null) {
			local12.aClass16_Sub1_Sub1_Sub3_Sub2_2 = arg0;
			local12.anInt5415 = arg6 + arg0.method6999() << 9;
			local12.anInt5409 = arg0.method6999() + arg5 << 9;
			local12.anInt5417 = Static84.method1794(arg0);
			local12.anInt5403 = arg0.anInt8153 << 9;
			local12.aBoolean402 = arg0.aBoolean594;
			local12.anInt5412 = arg0.anInt8141;
			local12.anInt5402 = 0;
			local12.anInt5419 = 256;
			local12.anInt5406 = 256;
			Static289.aClass323_19.method7477(local12, (long) arg0.anInt8075);
		}
	}
}
