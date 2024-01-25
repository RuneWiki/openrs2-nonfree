import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "I")
	public static int anInt1266;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cja", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass5;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
	public static int anInt1267 = -1;

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
	public static void method1059() {
		try {
			@Pc(24) Method local24 = (aClass5 == null ? (aClass5 = Class53.a("java.lang.Runtime")) : aClass5).getMethod("availableProcessors");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Integer local34 = (Integer) local24.invoke(local28, (Object[]) null);
					Static673.anInt10651 = local34;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
	public static void method1060() {
		Static538.aClass9_20 = null;
		Static106.anInt1679 = -1;
	}
}
