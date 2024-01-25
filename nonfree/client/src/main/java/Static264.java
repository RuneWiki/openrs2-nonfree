import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Lclient!bq;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_94 = new Class256("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
	public static int anInt4916 = 0;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	public static int method3969() {
		if ((double) Static169.aFloat100 == 3.0D) {
			return 37;
		} else if ((double) Static169.aFloat100 == 4.0D) {
			return 50;
		} else if ((double) Static169.aFloat100 == 6.0D) {
			return 75;
		} else if ((double) Static169.aFloat100 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	public static void method3970() {
		Static43.aClass129_5.method3025();
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(IZ)V")
	public static void method3971(@OriginalArg(1) boolean arg0) {
		Static90.method1519(Static216.anInt4171, Static96.anInt2175, Static108.anInt2264, arg0);
	}
}
