import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public static int anInt2785;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!bh;")
	public static Class15 aClass15_4;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!k", name = "l", descriptor = "S")
	public static short aShort15 = 320;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method2158() {
		aClass15_4 = null;
		anIntArrayArray25 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZJ)V")
	public static void method2159(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static231.anInt4525 >= 100 && !Static183.aBoolean235 || Static231.anInt4525 >= 200) {
			Static271.method4062(Static121.aString76, 0, "");
			return;
		}
		@Pc(32) String local32 = Static211.method3379(arg0);
		@Pc(34) int local34;
		for (local34 = 0; local34 < Static231.anInt4525; local34++) {
			if (arg0 == Static153.aLongArray7[local34]) {
				Static271.method4062(local32 + Static187.aString122, 0, "");
				return;
			}
		}
		for (local34 = 0; local34 < Static297.anInt5497; local34++) {
			if (Static126.aLongArray6[local34] == arg0) {
				Static271.method4062(Static129.aString83 + local32 + Static221.aString141, 0, "");
				return;
			}
		}
		if (local32.equals(Static239.aClass12_Sub3_Sub2_2.aString132)) {
			Static271.method4062(Static190.aString123, 0, "");
			return;
		}
		Static196.aStringArray31[Static231.anInt4525] = local32;
		Static153.aLongArray7[Static231.anInt4525] = arg0;
		Static131.anIntArray247[Static231.anInt4525] = 0;
		Static175.aStringArray28[Static231.anInt4525] = "";
		Static266.anIntArray447[Static231.anInt4525] = 0;
		Static176.aBooleanArray10[Static231.anInt4525] = false;
		Static233.anInt4542 = Static177.anInt3485;
		Static231.anInt4525++;
		Static142.aClass4_Sub17_Sub1_3.method1905(144);
		Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
	public static int method2160(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII)V")
	public static void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static127.anInt2701 == 1) {
			Static55.aClass4_Sub2_Sub1Array4[Static126.anInt2697 / 100].method3454(Static237.anInt4589 - 8, Static145.anInt2968 + -8);
		}
		if (Static127.anInt2701 == 2) {
			Static55.aClass4_Sub2_Sub1Array4[Static126.anInt2697 / 100 + 4].method3454(Static237.anInt4589 - 8, Static145.anInt2968 + -8);
		}
		Static269.method4009();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
	public static int method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}
}
