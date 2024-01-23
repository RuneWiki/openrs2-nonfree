import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public static int anInt3513;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!ke;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!aj;B)Lclient!jc;")
	public static Class3_Sub2 method2738(@OriginalArg(0) Class8_Sub2 arg0) {
		return new Class3_Sub2(arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2323(), arg0.method2334());
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public static void method2739() {
		Static11.aClass61_23.method1379();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIII[J)V")
	public static void method2740(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(10) int local10 = arg2;
		@Pc(17) int local17 = (arg2 + arg1) / 2;
		@Pc(21) long local21 = arg3[local17];
		arg3[local17] = arg3[arg1];
		arg3[arg1] = local21;
		@Pc(35) int local35 = arg0[local17];
		arg0[local17] = arg0[arg1];
		arg0[arg1] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg1; local47++) {
			if (arg3[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(70) long local70 = arg3[local47];
				arg3[local47] = arg3[local10];
				arg3[local10] = local70;
				@Pc(84) int local84 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10++] = local84;
			}
		}
		arg3[arg1] = arg3[local10];
		arg3[local10] = local21;
		arg0[arg1] = arg0[local10];
		arg0[local10] = local35;
		method2740(arg0, local10 - 1, arg2, arg3);
		method2740(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class8_Sub1_Sub10 method2742(@OriginalArg(1) int arg0) {
		@Pc(15) Class8_Sub1_Sub10 local15 = (Class8_Sub1_Sub10) Static270.aClass125_50.method2957((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = Static192.aClass132_67.method3194(0, arg0);
		} else {
			local32 = Static135.aClass132_49.method3194(0, arg0 & 0x7FFF);
		}
		local15 = new Class8_Sub1_Sub10();
		if (local32 != null) {
			local15.method2274(new Class8_Sub2(local32));
		}
		if (arg0 >= 32768) {
			local15.method2283();
		}
		Static270.aClass125_50.method2956((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public static void method2743(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static248.anInt4917 != -1) {
				Static291.method2816(Static248.anInt4917);
			}
			for (@Pc(16) Class8_Sub32 local16 = (Class8_Sub32) Static213.aClass129_22.method3035(); local16 != null; local16 = (Class8_Sub32) Static213.aClass129_22.method3048()) {
				Static7.method60(true, local16);
			}
			Static248.anInt4917 = -1;
			Static213.aClass129_22 = new Class129(8);
			Static12.method213();
			Static248.anInt4917 = Static161.anInt3266;
			Static269.method3756(false);
			Static141.method2237();
			Static217.method3401(Static248.anInt4917);
		}
		Static9.anInt85 = -1;
		Static2.method6(Static16.anInt3516);
		Static21.aClass36_Sub3_Sub1_1 = new Class36_Sub3_Sub1();
		Static21.aClass36_Sub3_Sub1_1.anInt4117 = 3000;
		Static21.aClass36_Sub3_Sub1_1.anInt4118 = 3000;
		if (!Static116.aBoolean188 && Static198.anInt3914 == 0) {
			Static107.method1714(Static145.aClass132_55);
			Static49.method774(10);
			return;
		}
		if (Static172.anInt3428 == 2) {
			Static185.anInt3689 = Static273.anInt5369 << 7;
			Static46.anInt1044 = Static231.anInt4685 << 7;
		} else {
			Static74.method1178();
		}
		if (Static116.aBoolean188) {
			Static293.method4282();
		}
		Static25.method432();
		Static49.method774(28);
	}
}
