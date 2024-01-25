import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "Lclient!oda;")
	public static Class238 aClass238_3;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!pe;ZI)Lclient!sga;")
	public static Class297 method5901(@OriginalArg(0) Class254 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method6420(arg1);
		return local13 == null ? null : new Class297(local13);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method5902() {
		if (Static300.aClass15_13 != null) {
			Static300.aClass15_13.method5337();
			Static300.aClass111_11 = null;
			Static300.aClass15_13 = null;
		}
	}
}
