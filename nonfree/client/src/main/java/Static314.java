import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!lg;")
	public static Class60 aClass60_12;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!tq;)Lclient!sd;")
	public static Class122_Sub3 method2744(@OriginalArg(1) Class4_Sub7 arg0) {
		return new Class122_Sub3(arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2402(), arg0.method2402(), arg0.method2380());
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BB)Z")
	public static boolean method2745(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class4_Sub7 local16 = new Class4_Sub7(arg0);
		@Pc(20) int local20 = local16.method2380();
		if (local20 != 1) {
			return false;
		}
		@Pc(38) boolean local38 = local16.method2380() == 1;
		if (local38) {
			Static103.method2840(local16);
		}
		Static167.method3165(local16);
		return true;
	}
}
