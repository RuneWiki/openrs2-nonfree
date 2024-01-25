import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public static int anInt1319 = 100;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "J")
	public static long aLong33 = 0L;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!rg;ILclient!qa;IILclient!au;Lclient!jk;)V")
	public static void method1206(@OriginalArg(0) int arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class4_Sub4 arg5, @OriginalArg(7) Class122 arg6) {
		@Pc(14) int local14 = arg5.anInt362 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg4 + 2;
		if (arg1.anInt6164 != 0) {
			arg3.method2072(local18, local14, arg2 + 10, arg6.method3400() * arg0 + arg4 + (-local18 - -1), arg1.anInt6164);
		}
		if (arg1.anInt6167 != 0) {
			arg3.method2095(local18, local14, arg1.anInt6167, arg2 + 10, -local18 + arg4 + arg0 * arg6.method3400() + 1);
		}
		@Pc(73) int local73 = arg1.anInt6188;
		if (arg5.aBoolean19 && arg1.anInt6191 != -1) {
			local73 = arg1.anInt6191;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0; local86++) {
			@Pc(92) String local92 = Static124.aStringArray13[local86];
			if (arg0 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg6.method3399(arg3, local92, arg5.anInt362, arg4, local73);
			arg4 += arg6.method3400();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!tf;Lclient!tf;I)V")
	public static void method1211(@OriginalArg(0) Class240 arg0, @OriginalArg(1) Class240 arg1) {
		Static448.method6134(Static93.aClass212_28);
		Static457.aClass4_Sub20_Sub1_5.method4561(arg1.anInt6909);
		Static457.aClass4_Sub20_Sub1_5.method4571(arg1.anInt6885);
		Static457.aClass4_Sub20_Sub1_5.method4561(arg0.anInt6909);
		Static457.aClass4_Sub20_Sub1_5.method4610(arg0.anInt6876);
		Static457.aClass4_Sub20_Sub1_5.method4571(arg0.anInt6885);
		Static457.aClass4_Sub20_Sub1_5.method4587(arg1.anInt6876);
	}
}
