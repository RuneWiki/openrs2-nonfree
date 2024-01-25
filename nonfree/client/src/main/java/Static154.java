import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_53 = new Class117("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_54 = new Class117("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!bj;")
	public static Class26 aClass26_25 = new Class26(64);

	@OriginalMember(owner = "client!k", name = "t", descriptor = "[I")
	public static final int[] anIntArray195 = new int[6];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([[IB)V")
	public static void method2468(@OriginalArg(0) int[][] arg0) {
		Static73.anIntArrayArray6 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method2471() {
		@Pc(1) Class26 local1 = aClass26_25;
		synchronized (aClass26_25) {
			aClass26_25.method333();
		}
		local1 = Static261.aClass26_47;
		synchronized (Static261.aClass26_47) {
			Static261.aClass26_47.method333();
		}
		local1 = Static174.aClass26_31;
		synchronized (Static174.aClass26_31) {
			Static174.aClass26_31.method333();
		}
		local1 = Static83.aClass26_10;
		synchronized (Static83.aClass26_10) {
			Static83.aClass26_10.method333();
		}
	}
}
