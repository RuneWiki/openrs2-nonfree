import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Z[B)Z")
	public static boolean method951(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub12 local8 = new Class6_Sub12(arg0);
		@Pc(12) int local12 = local8.method6019();
		if (local12 != 2) {
			return false;
		}
		@Pc(26) boolean local26 = local8.method6019() == 1;
		if (local26) {
			Static306.method4605(local8);
		}
		Static277.method4168(local8);
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)Lclient!rv;")
	public static Class285 method953() {
		return new Class285(1, false);
	}
}
