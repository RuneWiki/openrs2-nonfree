import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Lclient!fh;")
	public static Class58 aClass58_55;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Lclient!fh;")
	public static Class58 aClass58_56;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "[I")
	public static int[] anIntArray218 = new int[32];

	@OriginalMember(owner = "client!in", name = "A", descriptor = "[I")
	public static int[] anIntArray219 = new int[32];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	public static String method1941(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static214.anInterface1_1 != null) {
			@Pc(18) String local18 = Static214.anInterface1_1.method3237(arg0, arg2, arg1);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public static void method1943() {
		Static241.aClass26_48.method517(50);
		Static6.aClass26_1.method517(50);
		Static25.aClass26_4.method517(50);
	}
}
