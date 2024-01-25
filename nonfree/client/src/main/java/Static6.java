import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
	public static int anInt135;

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_1 = new Class40("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_2 = new Class40("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)V")
	public static void method261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class227 local9 = Static227.aClass227ArrayArray1[arg0][arg2];
		Static75.method1353(local9 == null ? Static281.aClass227_1 : local9, arg1);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!ne;Z)I")
	public static int method262(@OriginalArg(0) Class206 arg0) {
		if (Static170.aClass206_2 == arg0) {
			return 9216;
		} else if (Static526.aClass206_5 == arg0) {
			return 34065;
		} else if (Static276.aClass206_3 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V")
	public static void method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class37 local28 = Static152.aClass37ArrayArrayArray1[local9][arg0][arg1] = Static152.aClass37ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte22--;
				for (@Pc(40) Class108 local40 = local28.aClass108_1; local40 != null; local40 = local40.aClass108_3) {
					@Pc(44) Class15_Sub2 local44 = local40.aClass15_Sub2_1;
					if (local44.aShort110 == arg0 && local44.aShort109 == arg1) {
						local44.aByte91--;
					}
				}
			}
		}
		if (Static152.aClass37ArrayArrayArray1[0][arg0][arg1] == null) {
			Static152.aClass37ArrayArrayArray1[0][arg0][arg1] = new Class37(0, arg0, arg1);
			Static152.aClass37ArrayArrayArray1[0][arg0][arg1].aByte26 = 1;
		}
		Static152.aClass37ArrayArrayArray1[0][arg0][arg1].aClass37_1 = local7;
		Static152.aClass37ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
