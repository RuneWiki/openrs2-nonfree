import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!mb;")
	public static Class70 aClass70_44;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt4648 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	public static int[] anIntArray362 = new int[128];

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public static int anInt4654 = 0;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1585 = Static64.method1101("Standort");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)V")
	public static void method3637(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static225.anInt4729 = 0;
		Static149.anInt3252 = arg0;
		Static122.anInt2710 = arg1;
		Static160.anInt3454 = 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBII)V")
	public static void method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static127.anInt2862; local7++) {
			if (Static33.anIntArray48[local7] + Static187.anIntArray305[local7] > arg3 && arg1 + arg3 > Static33.anIntArray48[local7] && arg0 < Static62.anIntArray93[local7] + Static164.anIntArray239[local7] && Static62.anIntArray93[local7] < arg0 + arg2) {
				Static73.aBooleanArray10[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([SI[Lclient!ia;)V")
	public static void method3645(@OriginalArg(0) short[] arg0, @OriginalArg(2) Class51[] arg1) {
		Static42.method3759(arg1.length - 1, 0, arg1, arg0);
	}
}
