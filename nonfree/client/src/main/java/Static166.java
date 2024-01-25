import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!qa;")
	public static Class172 aClass172_6;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt3384 = -1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_103 = new Class189("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_104 = new Class189("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static final int anInt3387 = 205;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
	public static void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static339.anInt5767 = arg1 - Static144.anInt5420;
		Static405.anInt6683 = arg0 - Static144.anInt5410;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Lclient!ag;")
	public static Class7_Sub1 method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_Sub1_1 == null ? null : local7.aClass7_Sub1_1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V")
	public static void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg2; local3 <= arg4; local3++) {
			Static412.method5293(Static262.anIntArrayArray31[local3], arg3, arg1, arg0);
		}
	}
}
