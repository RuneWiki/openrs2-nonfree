import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static352 {

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "[Lclient!o;")
	public static Class6[] aClass6Array11;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_154 = new Class12(77, 0);

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_147 = new Class119("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_148 = new Class119("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BII)Z")
	public static boolean method4760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z")
	public static boolean method4761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static128.method2024(arg0, arg1) || Static318.method2926(arg1, arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
	public static boolean method4762(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static69.method1137(arg6)) {
			return;
		}
		if (Static46.aClass124ArrayArray1[arg6] == null) {
			Static55.method973(Static87.aClass124ArrayArray7[arg6], -1, arg3, arg8, arg0, arg1, arg5, arg4, arg7, arg2);
		} else {
			Static55.method973(Static46.aClass124ArrayArray1[arg6], -1, arg3, arg8, arg0, arg1, arg5, arg4, arg7, arg2);
		}
	}
}
