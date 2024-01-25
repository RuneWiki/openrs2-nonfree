import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "Lclient!ep;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray101 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!lj", name = "S", descriptor = "[I")
	public static final int[] anIntArray356 = new int[50];

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	public static int anInt3979 = 0;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)I")
	public static int method3217() {
		if (Static50.aFrame1 == null) {
			return Static429.aBoolean496 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!za;IILclient!la;ZZ)V")
	public static void method3218(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) boolean arg5) {
		if (arg5) {
			Static193.aClass41_8.method6090((Static49.anInt789 - Static193.aClass41_8.RA()) / 2, (Static344.anInt6105 - Static193.aClass41_8.Q()) / 2);
			Static28.aClass41_1.method6090((Static49.anInt789 - Static28.aClass41_1.RA()) / 2, 18);
		}
		@Pc(33) String local33 = "";
		if (Static183.aClass200_3 == Static10.aClass200_1) {
			local33 = Static411.aClass231_115.method5261(Static80.anInt6195);
		} else if (Static10.aClass200_1 == Static201.aClass200_4) {
			local33 = Static13.aClass231_6.method5261(Static80.anInt6195);
		}
		arg4.method4883(local33, Static49.anInt789 / 2, Static344.anInt6105 / 2 - 26, arg2, -1);
		@Pc(71) int local71 = Static344.anInt6105 / 2 - 18;
		arg1.method5979(Static49.anInt789 / 2 - 152, local71, 304, 34, arg3, 0);
		arg1.method5979(Static49.anInt789 / 2 - 151, local71 + 1, 302, 32, 0, 0);
		arg1.P(Static49.anInt789 / 2 - 150, local71 + 2, Static215.anInt3675 * 3, 30, arg0, 0);
		arg1.P(Static215.anInt3675 * 3 + Static49.anInt789 / 2 - 150, local71 + 2, 300 - Static215.anInt3675 * 3, 30, 0, 0);
		arg4.method4883(Static400.aString68, Static49.anInt789 / 2, Static344.anInt6105 / 2 + 4, arg2, -1);
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
	public static void method3219() {
		Static262.method3692();
		Static434.aClass141_4 = null;
		Static57.aClass226ArrayArray1 = null;
		Static218.aClass141_2 = null;
		Static28.aClass75_3 = null;
		Static121.aClass141_1 = null;
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)I")
	public static int method3220() {
		return 2;
	}
}
