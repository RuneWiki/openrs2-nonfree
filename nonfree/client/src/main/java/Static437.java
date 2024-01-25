import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	public static int anInt7761;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "Lclient!tj;")
	public static final Class154 aClass154_1 = Static439.method356();

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_106 = new Class267("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!ts;)V")
	public static void method6328(@OriginalArg(1) Class239 arg0) {
		if (Static129.anInt2771 == arg0.anInt6893) {
			Static180.aBooleanArray8[arg0.anInt6972] = true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public static void method6337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static154.anInt3149 == 1) {
			Static202.method3123(arg0, Static113.aClass6_Sub40_1, arg1);
		} else if (Static154.anInt3149 == 2) {
			Static54.method1217(arg1, arg0);
		}
		Static113.aClass6_Sub40_1 = null;
		Static154.anInt3149 = 0;
	}
}
