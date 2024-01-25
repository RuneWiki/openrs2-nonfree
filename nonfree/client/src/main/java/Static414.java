import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "J")
	public static long aLong234;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public static int anInt7559 = 0;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_126 = new Class67("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Lclient!mh;")
	public static Class95 method6214() {
		try {
			return new Class95_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class95) Class.forName("Class95_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class95_Sub3();
			}
		}
	}
}
