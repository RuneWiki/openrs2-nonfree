import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!h;")
	public static final Class114 aClass114_22 = new Class114(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "Lclient!ee;")
	public static final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!h;")
	public static final Class114 aClass114_23 = new Class114("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V")
	public static void method1492(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class167 local7 = Static151.aClass167Array1[99];
		for (@Pc(9) int local9 = 99; local9 > 0; local9--) {
			Static151.aClass167Array1[local9] = Static151.aClass167Array1[local9 - 1];
		}
		if (local7 == null) {
			local7 = new Class167(arg5, arg4, arg3, arg0, arg1, arg6, arg2);
		} else {
			local7.method4327(arg6, arg3, arg2, arg0, arg4, arg5, arg1);
		}
		Static151.aClass167Array1[0] = local7;
		Static231.anInt7332++;
		Static54.anInt4080 = Static418.anInt7279;
	}
}
