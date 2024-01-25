import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "Lclient!fe;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "Lclient!fea;")
	public static final Class104 aClass104_1 = new Class104("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_4 = new Class357("", 13);

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V")
	public static void method933() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static475.anInt8164 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V")
	public static void method935() {
		Static196.anInt3437 = 0;
		Static564.anInt9386 = 0;
		Static661.anInt10597 = 0;
		Static266.anInt4658 = 0;
	}
}
