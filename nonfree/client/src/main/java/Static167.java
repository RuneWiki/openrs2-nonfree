import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_45 = new Class96("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_70 = new Class254(73, 3);

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public static void method2607() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local16.invoke(local25, (Object[]) null);
					Static398.anInt7109 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public static void method2608() {
		for (@Pc(10) Class1_Sub25 local10 = (Class1_Sub25) Static285.aClass142_2.method3199(); local10 != null; local10 = (Class1_Sub25) Static285.aClass142_2.method3198()) {
			if (local10.aBoolean288) {
				local10.method3052();
			}
		}
		for (@Pc(30) Class1_Sub25 local30 = (Class1_Sub25) Static427.aClass142_49.method3199(); local30 != null; local30 = (Class1_Sub25) Static427.aClass142_49.method3198()) {
			if (local30.aBoolean288) {
				local30.method3052();
			}
		}
	}
}
