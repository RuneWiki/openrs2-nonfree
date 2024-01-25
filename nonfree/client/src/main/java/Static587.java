import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
	public static int anInt9462;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_140 = new Class218(72, 16);

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_141 = new Class218(19, -1);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method8280() {
		if (Static247.aClass291_1.aBoolean618) {
			Static387.anInt6096 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static387.anInt6096 = (int) (local34 / 1048576L) + 1;
				} catch (@Pc(44) Throwable local44) {
				}
			}
		} catch (@Pc(46) Exception local46) {
		}
	}
}
