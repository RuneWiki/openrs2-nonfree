import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_23 = new Class45("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_24 = new Class45("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	public static void method1126() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static6.anInt163 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
