import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!lk;Z)Lclient!pj;")
	public static Class104_Sub3 method2444(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class104_Sub3(arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4235(), arg0.method4240());
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)V")
	public static void method2445(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) Class2_Sub42 local12 = (Class2_Sub42) Static181.aClass210_23.method5035(); local12 != null; local12 = (Class2_Sub42) Static181.aClass210_23.method5037()) {
			if (local12.aClass2_Sub2_Sub2_2 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(local12.aClass2_Sub2_Sub2_2);
				local12.aClass2_Sub2_Sub2_2 = null;
			}
			if (local12.aClass2_Sub2_Sub2_3 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(local12.aClass2_Sub2_Sub2_3);
				local12.aClass2_Sub2_Sub2_3 = null;
			}
			local12.method5745();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(60) Class2_Sub42 local60 = (Class2_Sub42) Static39.aClass210_7.method5035(); local60 != null; local60 = (Class2_Sub42) Static39.aClass210_7.method5037()) {
			if (local60.aClass2_Sub2_Sub2_2 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(local60.aClass2_Sub2_Sub2_2);
				local60.aClass2_Sub2_Sub2_2 = null;
			}
			local60.method5745();
		}
		for (@Pc(87) Class2_Sub42 local87 = (Class2_Sub42) Static208.aClass214_22.method5060(); local87 != null; local87 = (Class2_Sub42) Static208.aClass214_22.method5064()) {
			if (local87.aClass2_Sub2_Sub2_2 != null) {
				Static339.aClass2_Sub2_Sub1_2.method110(local87.aClass2_Sub2_Sub2_2);
				local87.aClass2_Sub2_Sub2_2 = null;
			}
			local87.method5745();
		}
	}
}
