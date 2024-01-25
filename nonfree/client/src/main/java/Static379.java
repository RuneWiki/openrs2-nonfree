import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mha", name = "v", descriptor = "Lclient!uda;")
	public static Class14_Sub2_Sub20 aClass14_Sub2_Sub20_3;

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
	public static int anInt6681 = 100;

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(ZB)V")
	public static void method5835(@OriginalArg(0) boolean arg0) {
		Static133.method2023(Static563.anInt4939, Static506.anInt8791, arg0, Static358.anInt6145);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
	public static void method5836(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(20) int local20 = (arg3 + arg0) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) long local26 = arg1[local20];
		arg1[local20] = arg1[arg0];
		arg1[arg0] = local26;
		@Pc(40) Object local40 = arg2[local20];
		arg2[local20] = arg2[arg0];
		arg2[arg0] = local40;
		@Pc(59) int local59 = local26 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg3; local61 < arg0; local61++) {
			if (arg1[local61] < (long) (local61 & local59) + local26) {
				@Pc(80) long local80 = arg1[local61];
				arg1[local61] = arg1[local22];
				arg1[local22] = local80;
				@Pc(94) Object local94 = arg2[local61];
				arg2[local61] = arg2[local22];
				arg2[local22++] = local94;
			}
		}
		arg1[arg0] = arg1[local22];
		arg1[local22] = local26;
		arg2[arg0] = arg2[local22];
		arg2[local22] = local40;
		method5836(local22 - 1, arg1, arg2, arg3);
		method5836(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIII)V")
	public static void method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg1 + Static36.anInt617;
		@Pc(13) int local13 = arg2 + Static550.anInt9242;
		if (Static63.aClass89ArrayArrayArray1 == null || arg1 < 0 || arg2 < 0 || Static380.anInt6689 <= arg1 || Static542.anInt9214 <= arg2 || Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != arg0) {
			return;
		}
		@Pc(69) long local69 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(75) Class14_Sub25 local75 = (Class14_Sub25) Static282.aClass125_17.method2630(local69);
		if (local75 == null) {
			Static446.method6638(arg0, arg1, arg2);
			return;
		}
		@Pc(90) Class14_Sub43 local90 = (Class14_Sub43) local75.aClass32_27.method584();
		if (local90 == null) {
			Static446.method6638(arg0, arg1, arg2);
			return;
		}
		@Pc(105) Class4_Sub3_Sub4_Sub1 local105 = (Class4_Sub3_Sub4_Sub1) Static446.method6638(arg0, arg1, arg2);
		if (local105 == null) {
			local105 = new Class4_Sub3_Sub4_Sub1(arg1 << 9, Static258.aClass159Array1[arg0].method8207(arg2, arg1), arg2 << 9, arg0, arg0);
		} else {
			local105.anInt9913 = local105.anInt9910 = -1;
		}
		local105.anInt9919 = local90.anInt9586;
		local105.anInt9909 = local90.anInt9585;
		label56: while (true) {
			@Pc(150) Class14_Sub43 local150 = (Class14_Sub43) local75.aClass32_27.method577();
			if (local150 == null) {
				break;
			}
			if (local105.anInt9919 != local150.anInt9586) {
				local105.anInt9913 = local150.anInt9586;
				local105.anInt9926 = local150.anInt9585;
				while (true) {
					@Pc(177) Class14_Sub43 local177 = (Class14_Sub43) local75.aClass32_27.method577();
					if (local177 == null) {
						break label56;
					}
					if (local105.anInt9919 != local177.anInt9586 && local105.anInt9913 != local177.anInt9586) {
						local105.anInt9910 = local177.anInt9586;
						local105.anInt9914 = local177.anInt9585;
					}
				}
			}
		}
		@Pc(227) int local227 = Static388.method5919((arg2 << 9) + 256, (arg1 << 9) - -256, arg0);
		local105.anInt11182 = local227;
		local105.aByte146 = (byte) arg0;
		local105.anInt11184 = arg1 << 9;
		local105.aByte147 = (byte) arg0;
		local105.anInt9915 = 0;
		local105.anInt11178 = arg2 << 9;
		if (Static551.method7974(arg1, arg2)) {
			local105.aByte147++;
		}
		Static440.method2421(arg0, arg1, arg2, local227, local105);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZB)V")
	public static void method5838(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) Class14_Sub42 local12 = (Class14_Sub42) Static618.aClass32_66.method584(); local12 != null; local12 = (Class14_Sub42) Static618.aClass32_66.method577()) {
			if (local12.aClass14_Sub1_Sub1_4 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(local12.aClass14_Sub1_Sub1_4);
				local12.aClass14_Sub1_Sub1_4 = null;
			}
			if (local12.aClass14_Sub1_Sub1_3 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(local12.aClass14_Sub1_Sub1_3);
				local12.aClass14_Sub1_Sub1_3 = null;
			}
			local12.method9513();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(60) Class14_Sub42 local60 = (Class14_Sub42) Static489.aClass32_57.method584(); local60 != null; local60 = (Class14_Sub42) Static489.aClass32_57.method577()) {
			if (local60.aClass14_Sub1_Sub1_4 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(local60.aClass14_Sub1_Sub1_4);
				local60.aClass14_Sub1_Sub1_4 = null;
			}
			local60.method9513();
		}
		for (@Pc(88) Class14_Sub42 local88 = (Class14_Sub42) Static341.aClass125_19.method2633(); local88 != null; local88 = (Class14_Sub42) Static341.aClass125_19.method2627()) {
			if (local88.aClass14_Sub1_Sub1_4 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(local88.aClass14_Sub1_Sub1_4);
				local88.aClass14_Sub1_Sub1_4 = null;
			}
			local88.method9513();
		}
	}
}
