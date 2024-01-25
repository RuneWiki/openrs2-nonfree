import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!fd;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_110 = new Class158("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_111 = new Class158("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	public static int anInt4325 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!ec;)Lclient!ec;")
	public static Class68 method3351(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2129 != -1) {
			return Static300.method4351(arg0.anInt2129);
		}
		@Pc(17) int local17 = arg0.anInt2135 >>> 16;
		@Pc(27) Class175 local27 = new Class175(Static177.aClass38_18);
		for (@Pc(32) Class1_Sub39 local32 = (Class1_Sub39) local27.method3825(); local32 != null; local32 = (Class1_Sub39) local27.method3822()) {
			if (local17 == local32.anInt6172) {
				return Static300.method4351((int) local32.aLong228);
			}
		}
		return null;
	}
}
