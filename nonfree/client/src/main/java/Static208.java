import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt3820;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public static int anInt3821;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_33 = new Class160(260);

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static final int anInt3819 = 1407;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Z")
	public static boolean method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static66.method1052(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static333.anInt5694;
			@Pc(14) int local14 = arg2 << Static333.anInt5694;
			return Static4.method85(local10 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg2) + arg3, local14 + 1) && Static4.method85(local10 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg2) + arg3, local14 + 1) && Static4.method85(local10 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg2 + 1) + arg3, local14 + Static180.anInt6489 - 1) && Static4.method85(local10 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg2 + 1) + arg3, local14 + Static180.anInt6489 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z")
	public static boolean method3511() {
		if (Static217.aBoolean297) {
			try {
				Static403.method4138("showVideoAd", Static359.aClass111_5.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIZIIII)Z")
	public static boolean method3513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(41) int local41 = Static194.method3308(arg6, arg5, Static58.aClass188Array1[Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69], arg4, arg8, arg7, arg1, arg2, arg3, Static360.anIntArray1274, Static206.aClass1_Sub5_Sub1_Sub1_1.method5547(), Static48.anIntArray196, arg9, arg0);
		if (local41 < 1) {
			return false;
		}
		Static60.anInt1159 = Static360.anIntArray1274[local41 - 1];
		Static358.anInt2084 = Static48.anIntArray196[local41 - 1];
		Static331.aBoolean415 = false;
		Static237.method3838();
		return true;
	}
}
