import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "[Lclient!qk;")
	public static Class2_Sub36_Sub1[] aClass2_Sub36_Sub1Array7;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
	public static void method5250(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class2_Sub7 local6 = (Class2_Sub7) Static47.aClass216_17.method5992(); local6 != null; local6 = (Class2_Sub7) Static47.aClass216_17.method6000()) {
			if (local6.aClass2_Sub3_Sub2_2 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(local6.aClass2_Sub3_Sub2_2);
				local6.aClass2_Sub3_Sub2_2 = null;
			}
			if (local6.aClass2_Sub3_Sub2_1 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(local6.aClass2_Sub3_Sub2_1);
				local6.aClass2_Sub3_Sub2_1 = null;
			}
			local6.method5945();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class2_Sub7 local49 = (Class2_Sub7) Static283.aClass216_43.method5992(); local49 != null; local49 = (Class2_Sub7) Static283.aClass216_43.method6000()) {
			if (local49.aClass2_Sub3_Sub2_2 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(local49.aClass2_Sub3_Sub2_2);
				local49.aClass2_Sub3_Sub2_2 = null;
			}
			local49.method5945();
		}
		for (@Pc(76) Class2_Sub7 local76 = (Class2_Sub7) Static167.aClass199_17.method5747(); local76 != null; local76 = (Class2_Sub7) Static167.aClass199_17.method5753()) {
			if (local76.aClass2_Sub3_Sub2_2 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(local76.aClass2_Sub3_Sub2_2);
				local76.aClass2_Sub3_Sub2_2 = null;
			}
			local76.method5945();
		}
	}
}
