import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_107 = new Class102(68, 2);

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_108 = new Class102(72, 3);

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!cd;)V")
	public static void method2508(@OriginalArg(1) Class2_Sub8 arg0) {
		if (Static309.aClass270ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface2 local8 = null;
		if (arg0.anInt837 == 0) {
			local8 = (Interface2) Static113.method1718(arg0.anInt831, arg0.anInt827, arg0.anInt826);
		}
		if (arg0.anInt837 == 1) {
			local8 = (Interface2) Static333.method4460(arg0.anInt831, arg0.anInt827, arg0.anInt826);
		}
		if (arg0.anInt837 == 2) {
			local8 = (Interface2) Static144.method2120(arg0.anInt831, arg0.anInt827, arg0.anInt826, bn.class);
		}
		if (arg0.anInt837 == 3) {
			local8 = (Interface2) Static350.method4653(arg0.anInt831, arg0.anInt827, arg0.anInt826);
		}
		if (local8 == null) {
			arg0.anInt828 = 0;
			arg0.anInt829 = -1;
			arg0.anInt825 = 0;
		} else {
			arg0.anInt829 = local8.method5292();
			arg0.anInt828 = local8.method5296();
			arg0.anInt825 = local8.method5298();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static317.anInt6670 <= arg5 && arg5 <= Static215.anInt3546 && Static317.anInt6670 <= arg8 && arg8 <= Static215.anInt3546 && Static317.anInt6670 <= arg3 && Static215.anInt3546 >= arg3 && Static317.anInt6670 <= arg6 && Static215.anInt3546 >= arg6 && arg1 >= Static219.anInt6125 && arg1 <= Static155.anInt2670 && arg0 >= Static219.anInt6125 && arg0 <= Static155.anInt2670 && Static219.anInt6125 <= arg2 && arg2 <= Static155.anInt2670 && Static219.anInt6125 <= arg7 && Static155.anInt2670 >= arg7) {
			Static123.method5623(arg4, arg2, arg5, arg0, arg6, arg8, arg3, arg1, arg7);
		} else {
			Static16.method201(arg4, arg5, arg1, arg8, arg7, arg6, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Z")
	public static boolean method2510(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 17 || arg0 == 46 || arg0 == 5 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method2514() {
		Static310.aClass72_34.method1650();
		Static242.aClass261_9.method5486();
		Static334.aClass261_10.method5486();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIII)V")
	public static void method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class21_Sub8 local6 = (Class21_Sub8) Static286.aClass93_4.method2080(); local6 != null; local6 = (Class21_Sub8) Static286.aClass93_4.method2081()) {
			if (Static266.anInt4392 >= local6.anInt7109) {
				local6.method5593();
			} else {
				Static34.method521(local6.anInt7113, arg2 >> 1, (local6.anInt7106 << 7) + 64, (local6.anInt7103 << 7) + 64, arg3 >> 1, local6.anInt7110 * 2);
				Static143.aClass92_3.method4515(local6.anInt7111 | 0xFF000000, local6.aString197, 0, arg0 + Static31.anIntArray53[1], arg1 - -Static31.anIntArray53[0]);
			}
		}
	}
}
