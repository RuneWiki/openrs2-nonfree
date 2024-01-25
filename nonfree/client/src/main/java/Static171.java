import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gfa", name = "O", descriptor = "I")
	public static int anInt3413 = 0;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(III)Z")
	public static boolean method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static421.method5999(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static559.method7530(arg1, arg0) | Static134.method2625(arg1, arg0) ? true : ((arg0 & 0x2000) != 0 | Static269.method4101(arg0, arg1) | Static398.method5800(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3052(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V")
	public static void method3053(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(6, arg0);
		local8.method7329();
	}

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "(III)V")
	public static void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static44.aFloat203 > Static44.aFloat204) {
			Static44.aFloat204 = (float) ((double) Static44.aFloat204 + (double) Static44.aFloat204 / 30.0D);
			if (Static44.aFloat203 < Static44.aFloat204) {
				Static44.aFloat204 = Static44.aFloat203;
			}
			Static109.method1915();
			Static44.anInt9255 = (int) Static44.aFloat204 >> 1;
			Static44.aByteArrayArrayArray18 = Static395.method5771(Static44.anInt9255);
		} else if (Static44.aFloat204 > Static44.aFloat203) {
			Static44.aFloat204 = (float) ((double) Static44.aFloat204 - (double) Static44.aFloat204 / 30.0D);
			if (Static44.aFloat203 > Static44.aFloat204) {
				Static44.aFloat204 = Static44.aFloat203;
			}
			Static109.method1915();
			Static44.anInt9255 = (int) Static44.aFloat204 >> 1;
			Static44.aByteArrayArrayArray18 = Static395.method5771(Static44.anInt9255);
		}
		if (Static455.anInt7670 != -1 && Static406.anInt7005 != -1) {
			@Pc(87) int local87 = Static455.anInt7670 - Static56.anInt1176;
			if (local87 < 2 || local87 > 2) {
				local87 /= 8;
			}
			@Pc(104) int local104 = Static406.anInt7005 - Static334.anInt5600;
			Static56.anInt1176 -= -local87;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static334.anInt5600 += local104;
			if (local87 == 0 && local104 == 0) {
				Static455.anInt7670 = -1;
				Static406.anInt7005 = -1;
			}
			Static109.method1915();
		}
		if (Static555.anInt8826 > 0) {
			Static369.anInt6362--;
			if (Static369.anInt6362 == 0) {
				Static555.anInt8826--;
				Static369.anInt6362 = 100;
			}
		} else {
			Static58.anInt1270 = -1;
			Static65.anInt1511 = -1;
		}
		if (!Static251.aBoolean333 || Static565.aClass112_71 == null) {
			return;
		}
		for (@Pc(176) Class3_Sub14 local176 = (Class3_Sub14) Static565.aClass112_71.method3088(); local176 != null; local176 = (Class3_Sub14) Static565.aClass112_71.method3084()) {
			@Pc(187) Class174 local187 = Static44.aClass102_4.method2925(local176.aClass3_Sub51_1.anInt9426);
			if (local176.method1877(arg0, arg1)) {
				if (local187.aStringArray18 != null) {
					if (local187.aStringArray18[4] != null) {
						Static137.method2680(-1, 0, local187.aString31, (long) local176.aClass3_Sub51_1.anInt9426, true, 1002, local187.aStringArray18[4], false, -1, local187.anInt4760);
					}
					if (local187.aStringArray18[3] != null) {
						Static137.method2680(-1, 0, local187.aString31, (long) local176.aClass3_Sub51_1.anInt9426, true, 1010, local187.aStringArray18[3], false, -1, local187.anInt4760);
					}
					if (local187.aStringArray18[2] != null) {
						Static137.method2680(-1, 0, local187.aString31, (long) local176.aClass3_Sub51_1.anInt9426, true, 1012, local187.aStringArray18[2], false, -1, local187.anInt4760);
					}
					if (local187.aStringArray18[1] != null) {
						Static137.method2680(-1, 0, local187.aString31, (long) local176.aClass3_Sub51_1.anInt9426, true, 1001, local187.aStringArray18[1], false, -1, local187.anInt4760);
					}
					if (local187.aStringArray18[0] != null) {
						Static137.method2680(-1, 0, local187.aString31, (long) local176.aClass3_Sub51_1.anInt9426, true, 1008, local187.aStringArray18[0], false, -1, local187.anInt4760);
					}
				}
				if (!local176.aClass3_Sub51_1.aBoolean732) {
					local176.aClass3_Sub51_1.aBoolean732 = true;
					Static312.method4573(Static42.aClass137_1, local176.aClass3_Sub51_1.anInt9426, local187.anInt4760);
				}
				if (local176.aClass3_Sub51_1.aBoolean732) {
					Static312.method4573(Static131.aClass137_7, local176.aClass3_Sub51_1.anInt9426, local187.anInt4760);
				}
			} else if (local176.aClass3_Sub51_1.aBoolean732) {
				local176.aClass3_Sub51_1.aBoolean732 = false;
				Static312.method4573(Static59.aClass137_4, local176.aClass3_Sub51_1.anInt9426, local187.anInt4760);
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
	public static void method3055() {
		Static544.aClass54_15 = null;
		Static15.aClass14Array3 = null;
		Static460.aClass54_10 = null;
		Static367.aClass14Array13 = null;
		Static586.aClass14Array8 = null;
		Static506.aClass14Array15 = null;
		Static5.aClass14Array1 = null;
		Static494.aClass14Array14 = null;
		Static362.aClass14_18 = null;
		Static186.aClass14Array10 = null;
		Static17.aClass14Array5 = null;
		Static580.aClass14Array16 = null;
		Static32.aClass14Array6 = null;
		Static569.aClass54_9 = null;
		Static17.aClass14_1 = null;
		Static10.aClass14Array2 = null;
		Static16.aClass14Array4 = null;
		Static210.aClass14Array11 = null;
	}
}
