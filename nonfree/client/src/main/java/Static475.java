import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "Lclient!jo;")
	public static Class168 aClass168_108;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "[J")
	public static final long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean646 = true;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Z")
	public static boolean aBoolean647 = true;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "[I")
	public static final int[] anIntArray766 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_97 = new Class181(11, 16);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg5 < 1 || arg6 > Static228.anInt4746 - 2 || arg5 > Static44.anInt1275 - 2) {
			return;
		}
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && Static539.method7769(arg6, arg5)) {
			local41 = arg2 + 1;
		}
		if (!Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145) && !Static400.method6292(arg5, arg6, local41, Static410.anInt7667)) {
			return;
		}
		if (Static256.aClass224ArrayArrayArray1 == null) {
			return;
		}
		Static173.aClass202_Sub1_1.method5743(arg4, Static55.aClass194Array1[arg2], arg6, Static323.aClass9_8, arg2, arg5);
		if (arg3 < 0) {
			return;
		}
		@Pc(87) boolean local87 = Static104.aClass6_Sub6_Sub1_4.aBoolean121;
		Static104.aClass6_Sub6_Sub1_4.aBoolean121 = true;
		Static173.aClass202_Sub1_1.method5739(local41, Static55.aClass194Array1[arg2], arg2, arg3, arg5, arg7, arg0, Static323.aClass9_8, arg1, arg6);
		Static104.aClass6_Sub6_Sub1_4.aBoolean121 = local87;
		return;
	}
}
