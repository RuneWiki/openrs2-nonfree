import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "J")
	public static long aLong46;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_17 = new Class267("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZ)V")
	public static void method1022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static294.anInt5208 == 0) {
			Static124.method2122(false);
		} else {
			Static317.anInt2329 = Static294.anInt5208;
			Static436.method6326(0);
		}
		Static241.anInt7798 = arg0;
		Static94.anInt2154 = arg1;
		Static228.aBoolean278 = arg3;
		Static7.method935(arg2);
	}
}
