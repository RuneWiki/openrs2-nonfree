import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!bba;")
	public static Class11_Sub1_Sub1 method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class61 local14 = local7.aClass61_2; local14 != null; local14 = local14.aClass61_1) {
			@Pc(18) Class11_Sub1_Sub1 local18 = local14.aClass11_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort95 == arg1 && local18.aShort97 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!dm;Lclient!dm;)V")
	public static void method5769(@OriginalArg(1) Class78 arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(12) Class2_Sub50 local12 = Static595.method8194(Static610.aClass310_2, Static95.aClass269_21);
		local12.aClass2_Sub34_Sub2_2.method6864(arg0.anInt1968);
		local12.aClass2_Sub34_Sub2_2.method6854(arg1.anInt1978);
		local12.aClass2_Sub34_Sub2_2.method6854(arg0.anInt2006);
		local12.aClass2_Sub34_Sub2_2.method6869(arg1.anInt1968);
		local12.aClass2_Sub34_Sub2_2.method6916(arg0.anInt1978);
		local12.aClass2_Sub34_Sub2_2.method6857(arg1.anInt2006);
		Static311.method4754(local12);
	}
}
