import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "[Lclient!i;")
	public static Class115[] aClass115Array3;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "Lclient!us;")
	public static Class335 aClass335_3;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_78 = new Class344(17, 7);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)V")
	public static void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static292.anInt5983 <= arg2 && Static61.anInt1627 >= arg2) {
			@Pc(23) int local23 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg3);
			@Pc(29) int local29 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg0);
			Static97.method1898(local29, local23, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(III)Z")
	public static boolean method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static155.method2652(arg0, arg1) & Static315.method4962(arg0, arg1);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method6462(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static299.aClass7_12 = arg0;
		Static315.anInt6311 = arg1;
		Static406.aBoolean566 = Static315.anInt6311 > 1 && Static299.aClass7_12.method7821();
		Static392.anInt3635 = 9;
		Static168.anInt3487 = 0x1 << Static392.anInt3635;
		Static209.anInt4422 = Static168.anInt3487 >> 1;
		Math.sqrt((double) (Static209.anInt4422 * Static209.anInt4422 + Static209.anInt4422 * Static209.anInt4422));
		Static218.anInt4559 = 4;
		Static10.anInt812 = arg2;
		Static255.anInt5209 = arg3;
		Static30.anInt1124 = arg4;
		Static518.aClass149_1 = Static562.method7947();
		Static1.method3888();
		Static175.aClass182ArrayArrayArray1 = new Class182[4][Static10.anInt812][Static255.anInt5209];
		aClass115Array3 = new Class115[4];
		if (arg5) {
			Static511.anIntArrayArray56 = new int[Static10.anInt812][Static255.anInt5209];
			Static254.aByteArrayArray18 = new byte[Static10.anInt812][Static255.anInt5209];
			Static565.aShortArrayArray14 = new short[Static10.anInt812][Static255.anInt5209];
			Static288.aClass182ArrayArrayArray2 = new Class182[1][Static10.anInt812][Static255.anInt5209];
			Static140.aClass115Array1 = new Class115[1];
		} else {
			Static511.anIntArrayArray56 = null;
			Static254.aByteArrayArray18 = null;
			Static565.aShortArrayArray14 = null;
			Static288.aClass182ArrayArrayArray2 = null;
			Static140.aClass115Array1 = null;
		}
		if (arg6) {
			Static358.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static201.aClass85Array1 = new Class85[65535];
			Static516.aBooleanArray25 = new boolean[65535];
			Static566.anInt10281 = 0;
		} else {
			Static358.aLongArrayArrayArray1 = null;
			Static201.aClass85Array1 = null;
			Static516.aBooleanArray25 = null;
			Static566.anInt10281 = 0;
		}
		Static402.method6122(false);
		Static48.aClass21_Sub1ArrayArray4 = new Class21_Sub1[2][];
		Static48.aClass21_Sub1ArrayArray4[0] = new Class21_Sub1[Static98.anIntArray115[0]];
		Static48.aClass21_Sub1ArrayArray4[1] = new Class21_Sub1[Static98.anIntArray115[1]];
		Static137.anIntArray143 = new int[2];
		Static338.aClass21_Sub1ArrayArray2 = new Class21_Sub1[2][];
		Static338.aClass21_Sub1ArrayArray2[0] = new Class21_Sub1[Static57.anIntArray57[0]];
		Static338.aClass21_Sub1ArrayArray2[1] = new Class21_Sub1[Static57.anIntArray57[1]];
		Static254.anIntArray281 = new int[2];
		Static375.aClass21_Sub1ArrayArray3 = new Class21_Sub1[2][];
		Static375.aClass21_Sub1ArrayArray3[0] = new Class21_Sub1[Static54.anIntArray55[0]];
		Static375.aClass21_Sub1ArrayArray3[1] = new Class21_Sub1[Static54.anIntArray55[1]];
		Static27.anIntArray195 = new int[2];
		Static562.aClass21_Sub1Array2 = new Class21_Sub1[10000];
		Static277.anInt5771 = 0;
		Static378.aClass21_Sub1Array1 = new Class21_Sub1[5000];
		Static459.anInt8207 = 0;
		Static80.aClass21_Sub1_Sub1Array1 = new Class21_Sub1_Sub1[5000];
		Static496.anInt9339 = 0;
		Static339.aBooleanArrayArray8 = new boolean[Static30.anInt1124 + Static30.anInt1124 + 1][Static30.anInt1124 + Static30.anInt1124 + 1];
		Static586.aBooleanArrayArray12 = new boolean[Static30.anInt1124 + Static30.anInt1124 + 2][Static30.anInt1124 + Static30.anInt1124 + 2];
		if (Static406.aBoolean566) {
			Static375.aBooleanArrayArrayArray2 = new boolean[4][Static30.anInt1124 + Static30.anInt1124 + 1][Static30.anInt1124 + Static30.anInt1124 + 1];
			Static212.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static574.aClass180Array1 != null) {
				Static363.method5476();
			}
			Static574.aClass180Array1 = new Class180[Static315.anInt6311];
			Static299.aClass7_12.method7790(Static574.aClass180Array1.length + 1);
			Static299.aClass7_12.method7839(0);
			for (@Pc(247) int local247 = 0; local247 < Static574.aClass180Array1.length; local247++) {
				Static574.aClass180Array1[local247] = new Class180(local247 + 1, Static299.aClass7_12);
				(new Thread(Static574.aClass180Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static315.anInt6311 == 2) {
				local282 = 4;
				Static8.anInt745 = 2;
			} else if (Static315.anInt6311 == 3) {
				local282 = 6;
				Static8.anInt745 = 3;
			} else {
				local282 = 8;
				Static8.anInt745 = 4;
			}
			Static112.aClass203Array1 = new Class203[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static112.aClass203Array1[local302] = new Class203(Static329.aStringArrayArray5[Static315.anInt6311 - 2][local302]);
			}
		} else {
			Static8.anInt745 = 1;
		}
		Static13.anIntArray13 = new int[Static8.anInt745 - 1];
		Static427.anIntArray456 = new int[Static8.anInt745 - 1];
	}
}
