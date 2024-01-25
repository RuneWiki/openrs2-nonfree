import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!fs;")
	public static Class134 aClass134_27;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZZ)V")
	public static void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class5_Sub53 local10 = arg1 ? Static335.aClass5_Sub53_6 : Static208.aClass5_Sub53_9;
		if (local10 == null || arg0 < 0 || local10.anInt10557 <= arg0) {
			return;
		}
		@Pc(36) Class297 local36 = local10.aClass297Array1[arg0];
		if (local36.aByte124 != -1) {
			return;
		}
		@Pc(46) String local46 = local36.aString109;
		@Pc(51) Class5_Sub50 local51 = Static457.method6722(Static316.aClass387_59, Static80.aClass313_1);
		local51.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(local46) + 3);
		local51.aClass5_Sub23_Sub2_2.method8502(arg1 ? 1 : 0);
		local51.aClass5_Sub23_Sub2_2.method8480(arg0);
		local51.aClass5_Sub23_Sub2_2.method8538(local46);
		Static494.method7120(local51);
	}
}
