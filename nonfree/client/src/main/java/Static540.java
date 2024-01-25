import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	public static int anInt9050;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public static int anInt9051 = -1;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)Lclient!rn;")
	public static Class299 method7344(@OriginalArg(0) int arg0) {
		@Pc(10) Class299 local10 = (Class299) Static466.aClass207_48.method4390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static11.aClass308_3.method6569(0, arg0);
		local10 = new Class299();
		if (local20 != null) {
			local10.method6412(new Class1_Sub3(local20), arg0);
		}
		Static466.aClass207_48.method4391((long) arg0, local10);
		return local10;
	}
}
