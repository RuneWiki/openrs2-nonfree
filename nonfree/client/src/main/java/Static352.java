import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt5753 = -1;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	public static final int[] anIntArray689 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!og;")
	public static Class173 aClass173_1 = new Class173();

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method4942() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static323.anInt5471 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method4943() {
		Static108.method1520();
		Static330.aClass164_8 = null;
		Static34.aClass16_1 = null;
		Static151.aClass16_3 = null;
		Static364.aClass161ArrayArray3 = null;
		Static39.aClass16_2 = null;
	}
}
