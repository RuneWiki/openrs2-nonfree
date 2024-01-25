import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!au", name = "F", descriptor = "Lclient!tq;")
	public static Class279 aClass279_3;

	@OriginalMember(owner = "client!au", name = "H", descriptor = "S")
	public static short aShort15 = 320;

	@OriginalMember(owner = "client!au", name = "K", descriptor = "Lclient!h;")
	public static final Class114 aClass114_11 = new Class114("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!au", name = "M", descriptor = "Lclient!h;")
	public static final Class114 aClass114_12 = new Class114("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(CZ)Z")
	public static boolean method1018(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
