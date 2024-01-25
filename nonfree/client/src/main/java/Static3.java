import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	public static int anInt24;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_2 = new Class134("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;Lclient!la;Z)V")
	public static void method33(@OriginalArg(1) String arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(22) int local22 = Static278.aClass141_8.method2906(null, 250, arg0);
		@Pc(31) int local31 = Static278.aClass141_8.method2905(null, 250, arg0) * 13;
		Static82.aClass163_1.P(6, 6, local22 + 4 + 4, local31 - -4 + 4, -16777216, 0);
		Static82.aClass163_1.method5565(6, 6, local22 + 8, local31 + 4 - -4, -1, 0);
		arg1.method4517(null, local22, 10, 10, 0, 1, 0, null, null, -1, arg0, local31, -1);
		Static403.method5083(6, local22 + 4 + 4, local31 + 4 + 4, 6);
		if (arg2) {
			Static82.aClass163_1.method5562();
		}
	}
}
