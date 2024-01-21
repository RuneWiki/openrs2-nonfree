import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	public static int anInt2460;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Lclient!sg;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
	public static int anInt2459 = -1;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
	public static int anInt2462 = -1;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
	public static int anInt2464 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!vd;I)I")
	public static int method1703(@OriginalArg(0) Class92 arg0) {
		return arg0.method3233() + 1;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIII)V")
	public static void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg3 - arg5;
		@Pc(13) int local13 = arg5 + arg0;
		@Pc(18) int local18 = arg1 + arg5;
		for (@Pc(20) int local20 = arg0; local20 < local13; local20++) {
			Static74.method1123(arg1, arg4, Static142.anIntArrayArray25[local20], arg2);
		}
		@Pc(39) int local39 = arg2 - arg5;
		for (@Pc(41) int local41 = arg3; local41 > local5; local41--) {
			Static74.method1123(arg1, arg4, Static142.anIntArrayArray25[local41], arg2);
		}
		for (@Pc(65) int local65 = local13; local65 <= local5; local65++) {
			@Pc(71) int[] local71 = Static142.anIntArrayArray25[local65];
			Static74.method1123(arg1, arg4, local71, local18);
			Static74.method1123(local39, arg4, local71, arg2);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public static void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg0; local3 <= arg2 + arg0; local3++) {
			for (@Pc(18) int local18 = arg1; local18 <= arg3 + arg1; local18++) {
				if (local18 >= 0 && local18 < 104 && local3 >= 0 && local3 < 104) {
					Static34.aByteArrayArrayArray8[0][local18][local3] = 127;
					if (local18 == arg1 && local18 > 0) {
						Static156.anIntArrayArrayArray6[0][local18][local3] = Static156.anIntArrayArrayArray6[0][local18 - 1][local3];
					}
					if (local18 == arg1 + arg3 && local18 < 103) {
						Static156.anIntArrayArrayArray6[0][local18][local3] = Static156.anIntArrayArrayArray6[0][local18 + 1][local3];
					}
					if (local3 == arg0 && local3 > 0) {
						Static156.anIntArrayArrayArray6[0][local18][local3] = Static156.anIntArrayArrayArray6[0][local18][local3 - 1];
					}
					if (local3 == arg0 + arg2 && local3 < 103) {
						Static156.anIntArrayArrayArray6[0][local18][local3] = Static156.anIntArrayArrayArray6[0][local18][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Z")
	public static boolean method1708(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
