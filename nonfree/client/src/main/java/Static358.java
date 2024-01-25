import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method2929() {
		@Pc(5) Class137 local5 = Static144.aClass137_23;
		synchronized (Static144.aClass137_23) {
			Static144.aClass137_23.method2739();
		}
		local5 = Static264.aClass137_46;
		synchronized (Static264.aClass137_46) {
			Static264.aClass137_46.method2739();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[SI)[S")
	public static short[] method2932(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static461.method1987(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
