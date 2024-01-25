import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_43 = new Class175("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public static int anInt1156 = 16777215;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBILclient!eo;)V")
	public static void method1007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		if (arg2.aByte36 == 0) {
			arg2.anInt2212 = arg2.anInt2185;
		} else if (arg2.aByte36 == 1) {
			arg2.anInt2212 = arg2.anInt2185 + (arg1 - arg2.lb) / 2;
		} else if (arg2.aByte36 == 2) {
			arg2.anInt2212 = arg1 - arg2.anInt2185 - arg2.lb;
		} else if (arg2.aByte36 == 3) {
			arg2.anInt2212 = arg2.anInt2185 * arg1 >> 14;
		} else if (arg2.aByte36 == 4) {
			arg2.anInt2212 = (arg2.anInt2185 * arg1 >> 14) + (arg1 - arg2.lb) / 2;
		} else {
			arg2.anInt2212 = arg1 - arg2.lb - (arg1 * arg2.anInt2185 >> 14);
		}
		if (arg2.aByte37 == 0) {
			arg2.anInt2217 = arg2.anInt2188;
		} else if (arg2.aByte37 == 1) {
			arg2.anInt2217 = arg2.anInt2188 + (arg0 - arg2.anInt2178) / 2;
		} else if (arg2.aByte37 == 2) {
			arg2.anInt2217 = arg0 - arg2.anInt2178 - arg2.anInt2188;
		} else if (arg2.aByte37 == 3) {
			arg2.anInt2217 = arg2.anInt2188 * arg0 >> 14;
		} else if (arg2.aByte37 == 4) {
			arg2.anInt2217 = (arg0 - arg2.anInt2178) / 2 + (arg2.anInt2188 * arg0 >> 14);
		} else {
			arg2.anInt2217 = arg0 - (arg2.anInt2188 * arg0 >> 14) - arg2.anInt2178;
		}
		if (!Static176.aBoolean278 || Static56.method1160(arg2).anInt4282 == 0 && arg2.anInt2182 != 0) {
			return;
		}
		if (arg2.anInt2217 < 0) {
			arg2.anInt2217 = 0;
		} else if (arg2.anInt2217 + arg2.anInt2178 > arg0) {
			arg2.anInt2217 = arg0 - arg2.anInt2178;
		}
		if (arg2.anInt2212 < 0) {
			arg2.anInt2212 = 0;
		} else if (arg2.anInt2212 + arg2.lb > arg1) {
			arg2.anInt2212 = arg1 - arg2.lb;
			return;
		}
	}
}
