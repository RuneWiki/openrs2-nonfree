import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_145 = new Class85("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!qb;")
	public static final Class5_Sub31 aClass5_Sub31_1 = new Class5_Sub31(0, 0);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
	public static final int[] anIntArray629 = new int[] { 0, 0, 2, 8, 0, 3, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, -2, 8, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, -2, 0, 6, 0, 0, 3, 0, 0, 6, 0, 0, 0, 0, 0, 0, -2, 0, 10, 1, 0, 0, 0, 0, 0, 0, -1, 2, 15, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 10, 0, 6, -2, 0, 0, 0, 0, 0, 0, 12, 6, 0, -1, 0, 0, 0, 0, 0, 8, 0, 4, 0, 12, 11, 0, 0, -1, -1, 0, 3, 7, 6, 0, 8, 0, 6, 0, 0, -1, 3, -2, 0, 6, 12, 0, 0, 5, 2, 0, 0, 0, 7, -2, 0, 0, -2, -2, 0, 0, 0, -2, 0, 0, 3, 0, 0, 9, 0, 0, -2, 17, 0, 0, 28, 0, 0, 8, 0, -2, 4, 12, -1, 0, 2, 2, 0, 14, 0, -1, 0, 0, 1, 0, 8, 0, 0, 0, 10, -1, 1, 0, 0, 0, 0, 0, 3, 6, 3, -1, 0, 7, 6, 5, 4, 0, 1, 3, 0, 0, 7, 0, 6, 8, 0, -1, 8, 6, 0, 0, 0, -1, 0, 20, 0, 0, 8, 0, 0, 0, 1, 0, 0, -1, 0, -1, 0, 8, 0, 0, 0, 0, 12, 0, 0, 15, 0, -1, 10, 0, -1, -1, 0, 6, 0, 2, 0, 0, -1, 0, 5, 0, 0, 14, 0, 0, 0 };

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	public static final int[] anIntArray630 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	public static final int[] anIntArray631 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public static int anInt6686 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
	public static void method5932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static75.anInt1447 <= arg1 && arg1 <= Static346.anInt6668) {
			@Pc(15) int local15 = Static161.method2842(arg3, Static353.anInt6760, Static163.anInt3234);
			@Pc(21) int local21 = Static161.method2842(arg0, Static353.anInt6760, Static163.anInt3234);
			Static69.method1307(local15, local21, arg1, arg2);
		}
	}
}
