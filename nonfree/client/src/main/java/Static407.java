import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Lclient!rb;")
	public static final Class209 aClass209_3 = new Class209("runescape", 0);

	@OriginalMember(owner = "client!um", name = "D", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_145 = new Class256("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!um", name = "H", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5517(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static387.aClass26_9.method2267();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static387.aClass26_9.method2292();
		} else if (!Static387.aClass26_9.method2228()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static399.aClass167_Sub1_1.aBoolean488 = arg0;
			Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5519() {
		Static168.anInt3255 = 0;
		Static288.aClass265_41.method6003();
		Static237.aBoolean384 = false;
	}
}
