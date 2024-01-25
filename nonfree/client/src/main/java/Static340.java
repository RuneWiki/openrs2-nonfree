import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "J")
	public static long aLong160;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
	public static final int[] anIntArray503 = new int[14];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method5355() {
		Static452.aBoolean600 = false;
		Static330.method3994(Static193.anInt3519, Static536.anInt9313, Static529.anInt9144, Static178.anInt3307);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILclient!ih;Lclient!qa;)V")
	public static void method5356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) Class39 arg4) {
		@Pc(9) Class313 local9 = Static537.aClass112_4.method2955(arg3.anInt3666);
		if (local9.anInt9320 == -1) {
			return;
		}
		if (arg3.aBoolean294) {
			@Pc(26) int local26 = arg2 + arg3.anInt3654;
			arg2 = local26 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(38) Class35 local38 = local9.method7747(arg3.aBoolean293, arg4, arg2);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg3.anInt3653;
		@Pc(47) int local47 = arg3.anInt3650;
		if ((arg2 & 0x1) == 1) {
			local44 = arg3.anInt3650;
			local47 = arg3.anInt3653;
		}
		@Pc(66) int local66 = local38.EA();
		@Pc(69) int local69 = local38.ma();
		if (local9.aBoolean674) {
			local66 = local44 * 4;
			local69 = local47 * 4;
		}
		if (local9.anInt9323 == 0) {
			local38.method7347(arg1, arg0 + 4 - local47 * 4, local66, local69);
		} else {
			local38.ra(arg1, arg0 + 4 - local47 * 4, local66, local69, 0, local9.anInt9323 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!ps;Ljava/lang/String;)I")
	public static int method5357(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt6132;
		@Pc(10) byte[] local10 = Static277.method4359(arg1);
		arg0.method5190(local10.length);
		arg0.anInt6132 += Static505.aClass190_1.method4723(arg0.anInt6132, arg0.aByteArray96, local10.length, local10, 0);
		return arg0.anInt6132 - local6;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	public static void method5359() {
		Static227.aClass231_40.method6240();
	}
}
