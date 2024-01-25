import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!ui;")
	public static Class230 aClass230_78;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!o;")
	public static final Class169 aClass169_306 = new Class169("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "Lclient!o;")
	public static final Class169 aClass169_307 = new Class169("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
	public static int anInt5707 = -1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBII)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static264.anInt4589 || Static194.anInt3448 > arg0) {
			return;
		}
		@Pc(16) boolean local16;
		if (arg1 < Static372.anInt1561) {
			local16 = false;
			arg1 = Static372.anInt1561;
		} else if (arg1 <= Static98.anInt1774) {
			local16 = true;
		} else {
			arg1 = Static98.anInt1774;
			local16 = false;
		}
		@Pc(49) boolean local49;
		if (Static372.anInt1561 > arg2) {
			local49 = false;
			arg2 = Static372.anInt1561;
		} else if (arg2 > Static98.anInt1774) {
			arg2 = Static98.anInt1774;
			local49 = false;
		} else {
			local49 = true;
		}
		if (arg3 < Static194.anInt3448) {
			arg3 = Static194.anInt3448;
		} else {
			Static382.method5419(Static369.anIntArrayArray35[arg3++], arg1, arg2, arg4);
		}
		if (arg0 > Static264.anInt4589) {
			arg0 = Static264.anInt4589;
		} else {
			Static382.method5419(Static369.anIntArrayArray35[arg0--], arg1, arg2, arg4);
		}
		@Pc(97) int local97;
		if (local16 && local49) {
			for (local97 = arg3; local97 <= arg0; local97++) {
				@Pc(103) int[] local103 = Static369.anIntArrayArray35[local97];
				local103[arg1] = local103[arg2] = arg4;
			}
		} else if (local16) {
			for (local97 = arg3; local97 <= arg0; local97++) {
				Static369.anIntArrayArray35[local97][arg1] = arg4;
			}
		} else if (local49) {
			for (local97 = arg3; local97 <= arg0; local97++) {
				Static369.anIntArrayArray35[local97][arg2] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	public static void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static345.method4878(arg0)) {
			Static11.method2935(Static137.aClass117ArrayArray1[arg0], arg1);
		}
	}
}
