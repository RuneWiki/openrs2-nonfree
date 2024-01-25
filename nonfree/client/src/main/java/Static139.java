import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
	public static void method2455(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 7);
		local8.method6212();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!kea;Lclient!kea;ILclient!kea;Lclient!ci;)Z")
	public static boolean method2456(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) Class3_Sub9_Sub1 arg3) {
		Static345.aClass3_Sub9_Sub1_2 = arg3;
		Static345.aClass161_73 = arg1;
		Static407.aClass161_92 = arg0;
		Static530.aClass161_116 = arg2;
		return true;
	}
}
