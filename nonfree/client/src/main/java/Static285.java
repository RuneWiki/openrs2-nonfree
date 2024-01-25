import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!o;")
	public static final Class169 aClass169_267 = new Class169("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)I")
	public static int method4333(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method4334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (Static372.anInt1561 <= arg2 && arg2 <= Static98.anInt1774 && arg7 >= Static372.anInt1561 && arg7 <= Static98.anInt1774 && Static372.anInt1561 <= arg0 && arg0 <= Static98.anInt1774 && arg4 >= Static372.anInt1561 && arg4 <= Static98.anInt1774 && Static194.anInt3448 <= arg5 && Static264.anInt4589 >= arg5 && arg6 >= Static194.anInt3448 && Static264.anInt4589 >= arg6 && arg1 >= Static194.anInt3448 && Static264.anInt4589 >= arg1 && arg3 >= Static194.anInt3448 && arg3 <= Static264.anInt4589) {
			Static236.method3261(arg2, arg5, arg4, arg0, arg8, arg1, arg6, arg3, arg7);
		} else {
			Static384.method5440(arg6, arg4, arg7, arg3, arg5, arg2, arg1, arg8, arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)I")
	public static int method4335(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
