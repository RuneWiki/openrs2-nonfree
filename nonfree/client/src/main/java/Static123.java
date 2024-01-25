import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!o;")
	public static Class85 aClass85_9;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!po;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILclient!et;IILclient!ir;ILclient!fu;)V")
	public static void method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub1_Sub3_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub1_Sub3_Sub2 arg5, @OriginalArg(7) Class87 arg6) {
		@Pc(7) Class1_Sub35 local7 = new Class1_Sub35();
		local7.anInt5300 = arg1 << 7;
		local7.anInt5299 = arg3 << 7;
		local7.anInt5291 = arg4;
		if (arg6 != null) {
			local7.aClass87_1 = arg6;
			@Pc(33) int local33 = arg6.anInt1916;
			@Pc(36) int local36 = arg6.anInt1959;
			if (arg0 == 1 || arg0 == 3) {
				local36 = arg6.anInt1916;
				local33 = arg6.anInt1959;
			}
			local7.anInt5298 = arg6.anInt1961;
			local7.anInt5293 = arg3 + local36 << 7;
			local7.anInt5294 = arg6.anInt1931;
			local7.anInt5290 = arg1 + local33 << 7;
			local7.anInt5297 = arg6.anInt1937;
			local7.anInt5288 = arg6.anInt1914;
			local7.anInt5296 = arg6.anInt1915 << 7;
			local7.anIntArray389 = arg6.anIntArray171;
			if (arg6.anIntArray170 != null) {
				local7.aBoolean477 = true;
				local7.method4222();
			}
			if (local7.anIntArray389 != null) {
				local7.anInt5287 = local7.anInt5298 + (int) ((double) (local7.anInt5297 - local7.anInt5298) * Math.random());
			}
			Static463.aClass14_53.method205(local7);
		} else if (arg2 != null) {
			local7.aClass11_Sub1_Sub3_Sub1_1 = arg2;
			@Pc(130) Class272 local130 = arg2.aClass272_1;
			if (local130.anIntArray543 != null) {
				local7.aBoolean477 = true;
				local130 = local130.method5900(Static32.aClass4_1);
			}
			if (local130 != null) {
				local7.anInt5293 = local130.anInt7346 + arg3 << 7;
				local7.anInt5290 = local130.anInt7346 + arg1 << 7;
				local7.anInt5294 = Static64.method872(arg2);
				local7.anInt5288 = local130.anInt7340;
				local7.anInt5296 = local130.anInt7313 << 7;
			}
			Static175.aClass14_12.method205(local7);
		} else if (arg5 != null) {
			local7.aClass11_Sub1_Sub3_Sub2_2 = arg5;
			local7.anInt5290 = arg1 + arg5.method2635() << 7;
			local7.anInt5293 = arg5.method2635() + arg3 << 7;
			local7.anInt5294 = Static20.method313(arg5);
			local7.anInt5296 = arg5.anInt3366 << 7;
			local7.anInt5288 = arg5.anInt3383;
			Static263.aClass208_28.method4413((long) arg5.anInt3279, local7);
		}
	}
}
