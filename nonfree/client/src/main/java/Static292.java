import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!am;")
	public static Class11 aClass11_129;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!am;")
	public static Class11 aClass11_130;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "Lclient!ok;")
	public static Class147 aClass147_8;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString221 = " from your friend list first.";

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt5918 = 0;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString222 = null;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIZII)V")
	public static void method4976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg1 + arg3;
		for (@Pc(24) int local24 = arg3; local24 < local14; local24++) {
			Static182.method3394(arg2, Static30.anIntArrayArray10[local24], arg4, arg5);
		}
		@Pc(46) int local46 = arg5 - arg1;
		for (@Pc(48) int local48 = arg0; local48 > local10; local48--) {
			Static182.method3394(arg2, Static30.anIntArrayArray10[local48], arg4, arg5);
		}
		@Pc(66) int local66 = arg1 + arg2;
		for (@Pc(68) int local68 = local14; local68 <= local10; local68++) {
			@Pc(74) int[] local74 = Static30.anIntArrayArray10[local68];
			Static182.method3394(arg2, local74, arg4, local66);
			Static182.method3394(local46, local74, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method4980(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIB)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > arg2) {
			Static182.method3394(arg2, Static30.anIntArrayArray10[arg1], arg3, arg0);
		} else {
			Static182.method3394(arg0, Static30.anIntArrayArray10[arg1], arg3, arg2);
		}
	}
}
