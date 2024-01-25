import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array8;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "[I")
	public static final int[] anIntArray175 = new int[8];

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_28 = new Class6(80, 7);

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg6 < 1 || Static542.anInt9387 - 2 < arg5 || Static36.anInt1324 - 2 < arg6) {
			return;
		}
		@Pc(31) int local31 = arg0;
		if (arg0 < 3 && Static180.method3467(arg5, arg6)) {
			local31 = arg0 + 1;
		}
		if (!Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926) && !Static94.method2176(Static435.anInt7457, arg6, arg5, local31)) {
			return;
		}
		if (Static313.aClass206ArrayArrayArray2 == null) {
			return;
		}
		Static108.aClass118_Sub1_2.method3449(arg2, arg6, Static70.aClass299Array1[arg0], Static478.aClass9_10, arg0, arg5);
		if (arg1 < 0) {
			return;
		}
		@Pc(75) boolean local75 = Static89.aClass1_Sub28_Sub1_1.aBoolean319;
		Static89.aClass1_Sub28_Sub1_1.aBoolean319 = true;
		Static108.aClass118_Sub1_2.method3450(arg5, Static478.aClass9_10, arg4, arg6, arg1, Static70.aClass299Array1[arg0], arg7, arg3, local31, arg0);
		Static89.aClass1_Sub28_Sub1_1.aBoolean319 = local75;
		return;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZIILclient!kda;)V")
	public static void method2027(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class160 arg2) {
		Static118.anInt2858 = arg1;
		Static491.anInt8374 = 1;
		Static249.aClass160_53 = arg2;
		Static141.aBoolean205 = false;
		Static141.anInt3296 = 0;
		Static52.anInt1509 = arg0;
		Static178.anInt3810 = 10000;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I")
	public static int method2029() {
		return 42;
	}
}
