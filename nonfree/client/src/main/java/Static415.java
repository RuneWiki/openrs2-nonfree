import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_167 = new Class81(90, 10);

	@OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
	public static int anInt7071 = 0;

	@OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
	public static int anInt7073 = 0;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIB)V")
	public static void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static313.aFloat105 < Static313.aFloat106) {
			Static313.aFloat105 = (float) ((double) Static313.aFloat105 + (double) Static313.aFloat105 / 30.0D);
			if (Static313.aFloat106 < Static313.aFloat105) {
				Static313.aFloat105 = Static313.aFloat106;
			}
			Static341.method5077();
			Static313.anInt4082 = (int) Static313.aFloat105 >> 1;
			Static313.aByteArrayArrayArray4 = Static205.method3503(Static313.anInt4082);
		} else if (Static313.aFloat106 < Static313.aFloat105) {
			Static313.aFloat105 = (float) ((double) Static313.aFloat105 - (double) Static313.aFloat105 / 30.0D);
			if (Static313.aFloat105 < Static313.aFloat106) {
				Static313.aFloat105 = Static313.aFloat106;
			}
			Static341.method5077();
			Static313.anInt4082 = (int) Static313.aFloat105 >> 1;
			Static313.aByteArrayArrayArray4 = Static205.method3503(Static313.anInt4082);
		}
		if (Static582.anInt9419 != -1 && Static248.anInt4641 != -1) {
			@Pc(79) int local79 = Static582.anInt9419 - Static222.anInt1235;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static248.anInt4641 - Static536.anInt8850;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static222.anInt1235 += local79;
			if (local79 == 0 && local96 == 0) {
				Static582.anInt9419 = -1;
				Static248.anInt4641 = -1;
			}
			Static536.anInt8850 += local96;
			Static341.method5077();
		}
		if (Static538.anInt8880 <= 0) {
			Static297.anInt8265 = -1;
			Static519.anInt8575 = -1;
		} else {
			Static44.anInt1118--;
			if (Static44.anInt1118 == 0) {
				Static44.anInt1118 = 100;
				Static538.anInt8880--;
			}
		}
		if (!Static55.aBoolean105 || Static266.aClass361_88 == null) {
			return;
		}
		for (@Pc(161) Class1_Sub47 local161 = (Class1_Sub47) Static266.aClass361_88.method7854(); local161 != null; local161 = (Class1_Sub47) Static266.aClass361_88.method7853()) {
			@Pc(170) Class196 local170 = Static313.aClass46_2.method1408(local161.aClass1_Sub27_1.anInt5625);
			if (local161.method7028(arg1, arg0)) {
				if (local170.aStringArray23 != null) {
					if (local170.aStringArray23[4] != null) {
						Static374.method5440(true, -1, 1008, local170.aStringArray23[4], false, (long) local161.aClass1_Sub27_1.anInt5625, -1, 0, local170.anInt5173, local170.aString56);
					}
					if (local170.aStringArray23[3] != null) {
						Static374.method5440(true, -1, 1009, local170.aStringArray23[3], false, (long) local161.aClass1_Sub27_1.anInt5625, -1, 0, local170.anInt5173, local170.aString56);
					}
					if (local170.aStringArray23[2] != null) {
						Static374.method5440(true, -1, 1002, local170.aStringArray23[2], false, (long) local161.aClass1_Sub27_1.anInt5625, -1, 0, local170.anInt5173, local170.aString56);
					}
					if (local170.aStringArray23[1] != null) {
						Static374.method5440(true, -1, 1012, local170.aStringArray23[1], false, (long) local161.aClass1_Sub27_1.anInt5625, -1, 0, local170.anInt5173, local170.aString56);
					}
					if (local170.aStringArray23[0] != null) {
						Static374.method5440(true, -1, 1004, local170.aStringArray23[0], false, (long) local161.aClass1_Sub27_1.anInt5625, -1, 0, local170.anInt5173, local170.aString56);
					}
				}
				if (!local161.aClass1_Sub27_1.aBoolean417) {
					local161.aClass1_Sub27_1.aBoolean417 = true;
					Static145.method2360(Static509.aClass37_7, local161.aClass1_Sub27_1.anInt5625, local170.anInt5173);
				}
				if (local161.aClass1_Sub27_1.aBoolean417) {
					Static145.method2360(Static314.aClass37_3, local161.aClass1_Sub27_1.anInt5625, local170.anInt5173);
				}
			} else if (local161.aClass1_Sub27_1.aBoolean417) {
				local161.aClass1_Sub27_1.aBoolean417 = false;
				Static145.method2360(Static382.aClass37_5, local161.aClass1_Sub27_1.anInt5625, local170.anInt5173);
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)[Lclient!jw;")
	public static Class181[] method5821() {
		return new Class181[] { Static387.aClass181_10, Static44.aClass181_2, Static219.aClass181_6, Static63.aClass181_3, Static282.aClass181_7, Static564.aClass181_14, Static464.aClass181_11, Static134.aClass181_16, Class17_Sub3.lb, Static465.aClass181_12, Static495.aClass181_13, Static37.aClass181_1, Static359.aClass181_9, Static146.aClass181_5, Static568.aClass181_15 };
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public static void method5823(@OriginalArg(0) int arg0) {
		Static344.anInt6075 = arg0;
		@Pc(11) Class326 local11 = Static421.aClass326_42;
		synchronized (Static421.aClass326_42) {
			Static421.aClass326_42.method7230();
		}
	}
}
