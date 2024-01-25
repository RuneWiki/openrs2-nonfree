import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_65 = new Class242(28, 3);

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt4194 = 0;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt4196 = -1;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public static int anInt4197 = 0;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt4198 = 0;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_149 = new Class67(92, 6);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lclient!ni;")
	public static Class171 method3312() {
		try {
			return (Class171) Class.forName("Class171_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method3313() {
		if (Static53.aClass253_1 == null) {
			return;
		}
		if (Static53.aClass253_1.anInt6669 == 1) {
			Static53.aClass253_1 = null;
			return;
		}
		if (Static53.aClass253_1.anInt6669 == 2) {
			Static126.method1562(2, Static15.aClass177_1, Static149.aString21);
			Static53.aClass253_1 = null;
			return;
		}
	}
}
