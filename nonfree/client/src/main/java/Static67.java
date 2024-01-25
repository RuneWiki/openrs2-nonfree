import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "B")
	public static byte aByte13;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array4;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!dr;")
	public static Class1_Sub12 aClass1_Sub12_1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	public static int[] anIntArray105 = new int[2];

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt1458 = 0;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "J")
	public static volatile long aLong32 = 0L;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString54 = "scroll:";

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int anInt1464 = 2;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1211() {
		if (Static343.anInt6573 == 2) {
			Static267.anInt5492 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static267.anInt5492 = (int) (local34 / 1048576L) + 1;
					return;
				} catch (@Pc(44) Throwable local44) {
					return;
				}
			}
		} catch (@Pc(46) Exception local46) {
			return;
		}
	}
}
