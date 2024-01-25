import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!um", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "Lclient!in;")
	public static Class157 aClass157_93;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public static void method3581() {
		@Pc(1) Class169 local1 = Static20.aClass169_4;
		synchronized (Static20.aClass169_4) {
			Static20.aClass169_4.method5009();
		}
		local1 = Static378.aClass169_18;
		synchronized (Static378.aClass169_18) {
			Static378.aClass169_18.method5009();
		}
	}
}
