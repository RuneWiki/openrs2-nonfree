import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vu", name = "U", descriptor = "Lclient!os;")
	public static final Class182 aClass182_251 = new Class182("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)Z")
	public static boolean method5804(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)V")
	public static void method5805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static157.anInt3176 == 2) {
			Static127.anInt2604 = local15;
			Static242.anInt5735 = 0;
			Static362.anInt6155 = local7;
		}
		Static16.aFloat6 = local15;
		Static149.aFloat53 = local7;
		Static428.method5674();
		Static406.aBoolean448 = true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg4) {
			Static164.method3362(arg3, arg2, arg1, arg0, arg6, arg5);
		} else if (Static115.anInt2362 <= arg5 - arg0 && Static146.anInt3034 >= arg0 + arg5 && arg6 - arg4 >= Static319.anInt5496 && Static160.anInt3220 >= arg6 + arg4) {
			Static125.method2192(arg2, arg4, arg6, arg1, arg0, arg3, arg5);
		} else {
			Static327.method3798(arg3, arg4, arg0, arg5, arg1, arg2, arg6);
		}
	}
}
