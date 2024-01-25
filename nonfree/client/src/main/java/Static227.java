import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "Lclient!c;")
	public static Class33 aClass33_3;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_99 = new Class7("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_127 = new Class107(35, 6);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lclient!kl;")
	public static Class137 method3470(@OriginalArg(1) int arg0) {
		@Pc(16) Class137[] local16 = Static27.method576();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class137 local24 = local16[local18];
			if (local24.anInt3909 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
