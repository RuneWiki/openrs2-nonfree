import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
	public static int anInt6947;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_4 = new Class240("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_121 = new Class44(58, -2);

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_122 = new Class44(111, 2);

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_123 = new Class44(49, 2);

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method5625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0];
		@Pc(13) int local13 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0];
		if (local8 < 0 || Static26.anInt462 <= local8 || local13 < 0 || local13 >= Static445.anInt6140) {
			return false;
		} else if (arg3 >= 0 && Static26.anInt462 > arg3 && arg5 >= 0 && arg5 < Static445.anInt6140) {
			@Pc(72) int local72 = Static254.method3732(arg1, arg0, arg6, arg3, Static226.aClass226Array3[Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146], arg4, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422(), Static422.anIntArray562, local8, arg7, arg2, local13, Static314.anIntArray437, arg5);
			if (local72 < 1) {
				return false;
			}
			Static659.anInt10975 = Static422.anIntArray562[local72 - 1];
			Static35.anInt964 = Static314.anIntArray437[local72 - 1];
			Static378.aBoolean496 = false;
			Static592.method1599();
			return true;
		} else {
			return false;
		}
	}
}
