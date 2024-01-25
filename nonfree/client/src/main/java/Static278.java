import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "Lclient!os;")
	public static final Class182 aClass182_211 = new Class182("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "Lclient!os;")
	public static final Class182 aClass182_212 = new Class182("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	public static int anInt5921 = -1;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Lclient!os;")
	public static final Class182 aClass182_213 = new Class182("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public static void method4705() {
		if (Static333.aClass130_2 != null) {
			Static333.aClass130_2.method3642();
		}
		if (Static321.aClass130_1 != null) {
			Static321.aClass130_1.method3642();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4706(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static323.method4420(arg0, "%0a", "\n"));
	}
}
