import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_34 = new Class40("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg4; local11 <= arg0; local11++) {
				if (Static448.anIntArrayArray65[local7][local11] == arg1 && Static357.anIntArrayArray53[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
