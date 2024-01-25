import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt8508;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass18;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_83 = new Class286(26, -1);

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	public static int anInt8511 = 0;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "Lclient!m;")
	public static final Class235 aClass235_41 = new Class235(70);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method7147() {
		if (Static310.aClass47_4.aBoolean98) {
			Static719.anInt11246 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = (aClass18 == null ? (aClass18 = Class291.a("java.lang.Runtime")) : aClass18).getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static719.anInt11246 = (int) (local34 / 1048576L) + 1;
				} catch (@Pc(44) Throwable local44) {
				}
			}
		} catch (@Pc(46) Exception local46) {
		}
	}
}
