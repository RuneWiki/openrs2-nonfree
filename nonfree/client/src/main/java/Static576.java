import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
	public static int anInt9207;

	// $FF: synthetic field
	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
	public static void method8037() {
		if (Static651.aClass122_38.aBoolean282) {
			Static532.anInt8714 = 96;
			return;
		}
		try {
			@Pc(26) Method local26 = (aClass21 == null ? (aClass21 = Class336.a("java.lang.Runtime")) : aClass21).getMethod("maxMemory");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Long local36 = (Long) local26.invoke(local30, (Object[]) null);
					Static532.anInt8714 = (int) (local36 / 1048576L) + 1;
				} catch (@Pc(46) Throwable local46) {
				}
			}
		} catch (@Pc(48) Exception local48) {
		}
	}
}
