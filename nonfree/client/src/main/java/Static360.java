import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!dda;")
	public static Class53 aClass53_151;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_267 = new Class202("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
	public static boolean method7738(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
