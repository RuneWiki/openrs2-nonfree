import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static498 {

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_131 = new Class45("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z")
	public static boolean method7618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static197.method3751(arg1, arg0) & Static495.method7591(arg1, arg0);
	}
}
