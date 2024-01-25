import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_20 = new Class231("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_21 = new Class231("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_22 = new Class231("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "[I")
	public static final int[] anIntArray78 = new int[3];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Lclient!ce;")
	public static Class36 method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static175.aClass36ArrayArrayArray1[0][arg1][arg2] != null && Static175.aClass36ArrayArrayArray1[0][arg1][arg2].aClass36_1 != null;
			if (local28 && arg0 >= Static180.anInt3181 - 1) {
				return null;
			}
			Static83.method1221(arg0, arg1, arg2);
		}
		return Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public static void method978() {
		if (Static433.anInt7309 == 2) {
			Static274.method3920(3);
		} else if (Static433.anInt7309 == 6) {
			Static274.method3920(7);
		} else if (Static433.anInt7309 == 9) {
			Static274.method3920(10);
		}
	}
}
