import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[Lclient!pp;")
	public static Class291[] aClass291Array1;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!gl;")
	public static Class136 aClass136_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass16;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method4811() {
		try {
			@Pc(17) Method local17 = (aClass16 == null ? (aClass16 = Class211.a("java.lang.Runtime")) : aClass16).getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static348.anInt5747 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}
}
