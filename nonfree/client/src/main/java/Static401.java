import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray128;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
	public static int anInt6449;

	@OriginalMember(owner = "client!tr", name = "U", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_100 = new Class142("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
	public static int anInt6459 = 765;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static95.method5202(arg8)) {
			return;
		}
		if (Static166.aClass107ArrayArray2[arg8] == null) {
			Static55.method753(Static45.aClass107ArrayArray1[arg8], -1, arg3, arg6, arg2, arg1, arg5, arg7, arg0, arg4);
		} else {
			Static55.method753(Static166.aClass107ArrayArray2[arg8], -1, arg3, arg6, arg2, arg1, arg5, arg7, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5193(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static88.method1055(arg0, "\n", "%0a"));
	}
}
