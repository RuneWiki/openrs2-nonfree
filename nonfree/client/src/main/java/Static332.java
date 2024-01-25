import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "Lclient!ya;")
	public static Class49 aClass49_10;

	@OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
	public static int anInt5719;

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_131 = new Class209("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)I")
	public static int method4608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static10.anIntArray30[arg0 & 0x3] : Static128.anIntArray208[arg0 & 0x3];
	}
}
