import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public static int anInt3975;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!cr;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_60 = new Class287(73, -1);

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public static int anInt3977 = -2;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public static void method3233() {
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static248.anInt4912 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}
}
