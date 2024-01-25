import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!jk;")
	public static Class106 aClass106_5;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	public static final boolean aBoolean389 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0];
		@Pc(13) int local13 = Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0];
		if (Static8.anInt5875 == 1) {
			if (!Static63.method4860(arg1, arg0, -2, local8, 1, 1, 0, false, local13, 0)) {
				Static63.method4860(arg1, arg0, -3, local8, 1, 1, 0, false, local13, 0);
			}
		} else if (!Static63.method4860(arg1, arg0, -3, local8, 1, 1, 0, false, local13, 0)) {
			Static63.method4860(arg1, arg0, -2, local8, 1, 1, 0, false, local13, 0);
		}
	}
}
