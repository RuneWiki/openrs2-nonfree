import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass13;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public static int anInt5127 = -1;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public static void method4366() {
		try {
			@Pc(17) Method local17 = (aClass13 == null ? (aClass13 = Class52_Sub3.a("java.lang.Runtime")) : aClass13).getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static28.anInt9247 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}
}
