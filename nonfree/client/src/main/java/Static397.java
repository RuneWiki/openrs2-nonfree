import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nia", name = "G", descriptor = "I")
	public static int anInt6848;

	@OriginalMember(owner = "client!nia", name = "H", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_23 = new Class6(6, 1);

	@OriginalMember(owner = "client!nia", name = "N", descriptor = "I")
	public static int anInt6854 = 0;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)V")
	public static void method5726(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class3_Sub32 local6 = (Class3_Sub32) Static497.aClass193_54.method4457(); local6 != null; local6 = (Class3_Sub32) Static497.aClass193_54.method4459()) {
			if (local6.aClass3_Sub9_Sub2_1 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(local6.aClass3_Sub9_Sub2_1);
				local6.aClass3_Sub9_Sub2_1 = null;
			}
			if (local6.aClass3_Sub9_Sub2_2 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(local6.aClass3_Sub9_Sub2_2);
				local6.aClass3_Sub9_Sub2_2 = null;
			}
			local6.method8770();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class3_Sub32 local57 = (Class3_Sub32) Static378.aClass193_33.method4457(); local57 != null; local57 = (Class3_Sub32) Static378.aClass193_33.method4459()) {
			if (local57.aClass3_Sub9_Sub2_1 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(local57.aClass3_Sub9_Sub2_1);
				local57.aClass3_Sub9_Sub2_1 = null;
			}
			local57.method8770();
		}
		for (@Pc(84) Class3_Sub32 local84 = (Class3_Sub32) Static554.aClass62_43.method1680(); local84 != null; local84 = (Class3_Sub32) Static554.aClass62_43.method1681()) {
			if (local84.aClass3_Sub9_Sub2_1 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(local84.aClass3_Sub9_Sub2_1);
				local84.aClass3_Sub9_Sub2_1 = null;
			}
			local84.method8770();
		}
	}

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "(B)Z")
	public static boolean method5727() {
		try {
			@Pc(7) Class195 local7 = new Class195();
			@Pc(12) byte[] local12 = local7.method4489(Static189.aByteArray75);
			Static479.method6832(local12);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}
}
