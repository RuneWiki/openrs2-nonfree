import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!s", name = "X", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1102 = null;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1103 = Static158.method3034("Fps:");

	@OriginalMember(owner = "client!s", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1104 = Static158.method3034("Nehmen");

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1105 = Static158.method3034("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
	public static final int[] anIntArray446 = new int[5];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!og;Z)Lclient!ob;")
	public static Class60 method3069(@OriginalArg(0) Class2_Sub3 arg0) {
		return Static106.method2395(arg0);
	}
}
