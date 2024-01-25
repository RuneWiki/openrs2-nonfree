import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
	public static void method7109(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class6_Sub34 local10 = (Class6_Sub34) Static315.aClass298_124.method6809(); local10 != null; local10 = (Class6_Sub34) Static315.aClass298_124.method6821()) {
			if (local10.aClass6_Sub15_Sub2_3 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(local10.aClass6_Sub15_Sub2_3);
				local10.aClass6_Sub15_Sub2_3 = null;
			}
			if (local10.aClass6_Sub15_Sub2_4 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(local10.aClass6_Sub15_Sub2_4);
				local10.aClass6_Sub15_Sub2_4 = null;
			}
			local10.method7948();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class6_Sub34 local53 = (Class6_Sub34) Static377.aClass298_144.method6809(); local53 != null; local53 = (Class6_Sub34) Static377.aClass298_144.method6821()) {
			if (local53.aClass6_Sub15_Sub2_3 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(local53.aClass6_Sub15_Sub2_3);
				local53.aClass6_Sub15_Sub2_3 = null;
			}
			local53.method7948();
		}
		for (@Pc(80) Class6_Sub34 local80 = (Class6_Sub34) Static149.aClass234_31.method5469(); local80 != null; local80 = (Class6_Sub34) Static149.aClass234_31.method5465()) {
			if (local80.aClass6_Sub15_Sub2_3 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(local80.aClass6_Sub15_Sub2_3);
				local80.aClass6_Sub15_Sub2_3 = null;
			}
			local80.method7948();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public static void method7110() {
		Static311.method4668(Static431.anInt7712);
	}
}
