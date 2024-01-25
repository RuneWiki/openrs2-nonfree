import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_113 = new Class202("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method3102() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static368.aBooleanArray32[local3] = true;
		}
	}
}
