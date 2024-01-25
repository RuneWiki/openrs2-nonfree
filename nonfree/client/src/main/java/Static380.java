import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!qaa", name = "s", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_94 = new Class306("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qaa", name = "x", descriptor = "Lclient!ba;")
	public static final Class17 aClass17_29 = new Class17(64);

	@OriginalMember(owner = "client!qaa", name = "y", descriptor = "I")
	public static int anInt6942 = 0;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == arg5) {
			Static466.method6541(arg6, arg5, arg1, arg3, arg0, arg2);
		} else if (Static358.anInt8908 <= arg0 - arg5 && arg0 + arg5 <= Static216.anInt4203 && arg3 - arg4 >= Static99.anInt1988 && arg4 + arg3 <= Static205.anInt4042) {
			Static431.method6281(arg5, arg0, arg3, arg2, arg1, arg4, arg6);
		} else {
			Static369.method5697(arg6, arg4, arg5, arg1, arg0, arg3, arg2);
		}
	}
}
