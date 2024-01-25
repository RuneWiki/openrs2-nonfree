import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_14 = new Class279(64);

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_39 = new Class376(67, -1);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method2272() {
		Static585.method7868(false);
		if (Static276.anInt5173 >= 0 && Static276.anInt5173 != 0) {
			Static422.method6016(false, Static276.anInt5173);
			Static276.anInt5173 = -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2273(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public static void method2274() {
		Static502.aFont1 = null;
		Static582.anImage3 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
	public static boolean method2278(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
