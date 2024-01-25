import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_74 = new Class211(25, -1);

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public static int anInt3108 = 0;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_75 = new Class211(49, -2);

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	public static void method2521() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static138.anInt2443 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
