import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray77 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
	public static final int anInt2971 = 1337;

	@OriginalMember(owner = "client!iq", name = "Z", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 + arg0;
		@Pc(15) int local15 = arg2 - arg0;
		for (@Pc(29) int local29 = arg4; local29 < local10; local29++) {
			Static315.method4662(arg3, Static15.anIntArrayArray1[local29], arg6, arg1);
		}
		for (@Pc(47) int local47 = arg2; local47 > local15; local47--) {
			Static315.method4662(arg3, Static15.anIntArrayArray1[local47], arg6, arg1);
		}
		@Pc(69) int local69 = arg0 + arg6;
		@Pc(74) int local74 = arg3 - arg0;
		for (@Pc(76) int local76 = local10; local76 <= local15; local76++) {
			@Pc(82) int[] local82 = Static15.anIntArrayArray1[local76];
			Static315.method4662(local69, local82, arg6, arg1);
			Static315.method4662(local74, local82, local69, arg5);
			Static315.method4662(arg3, local82, local74, arg1);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method2785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0];
		@Pc(25) int local25 = Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0];
		if (Static119.aClass150_1 == Static275.aClass150_3) {
			if (!Static208.method3513(local25, 1, 0, arg1, local20, false, -2, 0, 1, arg0)) {
				Static208.method3513(local25, 1, 0, arg1, local20, false, -3, 0, 1, arg0);
			}
		} else if (!Static208.method3513(local25, 1, 0, arg1, local20, false, -3, 0, 1, arg0)) {
			Static208.method3513(local25, 1, 0, arg1, local20, false, -2, 0, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V")
	public static void method2786() {
		Static333.aClass160_54.method3595();
		Static340.aClass160_58.method3595();
		Static41.aClass160_6.method3595();
		Static1.aClass160_63.method3595();
		Static298.aClass160_47.method3595();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V")
	public static void method2787(@OriginalArg(0) int arg0) {
		Static234.method3798();
		Static322.method4781();
		Static23.method417(true, arg0);
		Static54.method3529(Static111.aClass63_3, Static263.aClass171_64, Static120.aClass171_35);
		Static125.method2503(Static111.aClass63_3, Static263.aClass171_64);
		Static212.method3555(Static63.aClass18Array3);
		Static145.method4669();
		Static240.method3873();
		if (Static391.anInt6627 == 10) {
			Static48.method809(false);
		} else if (Static391.anInt6627 == 30) {
			Static104.method2180(25);
		} else if (Static391.anInt6627 == 5) {
			Static251.method3966(Static111.aClass63_3, Static263.aClass171_64);
			return;
		}
	}
}
