import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_129 = new Class209("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method4568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg4 < 1 || Static229.anInt4427 - 2 < arg2 || arg4 > Static379.anInt6422 - 2) {
			return;
		}
		@Pc(27) int local27 = arg0;
		if (arg0 < 3 && Static40.method645(arg4, arg2)) {
			local27 = arg0 + 1;
		}
		if (!Static12.aClass79_Sub1_1.method3966(Static399.anInt6653) && !Static161.method5537(Static427.anInt7117, local27, arg4, arg2)) {
			return;
		}
		if (Static440.aClass106ArrayArrayArray3 == null) {
			return;
		}
		Static55.aClass23_Sub1_1.method4087(arg4, Static194.aClass70Array1[arg0], arg6, arg2, arg0, Static33.aClass49_1);
		if (arg1 >= 0) {
			@Pc(73) boolean local73 = Static12.aClass79_Sub1_1.aBoolean360;
			Static12.aClass79_Sub1_1.aBoolean360 = true;
			Static55.aClass23_Sub1_1.method4086(arg1, Static33.aClass49_1, arg4, Static194.aClass70Array1[arg0], local27, arg3, arg2, arg0, arg5, arg7);
			Static12.aClass79_Sub1_1.aBoolean360 = local73;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z")
	public static boolean method4569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static359.method4894(arg1, arg0) & Static55.method921(arg1, arg0);
	}
}
