import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "Lclient!mea;")
	public static Class230 aClass230_9 = null;

	@OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
	public static int anInt8235 = 0;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	public static void method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static498.aFloat217 > Static498.aFloat216) {
			Static498.aFloat216 = (float) ((double) Static498.aFloat216 + (double) Static498.aFloat216 / 30.0D);
			if (Static498.aFloat217 < Static498.aFloat216) {
				Static498.aFloat216 = Static498.aFloat217;
			}
			Static27.method617();
			Static498.anInt8791 = (int) Static498.aFloat216 >> 1;
			Static498.aByteArrayArrayArray10 = Static243.method3622(Static498.anInt8791);
		} else if (Static498.aFloat217 < Static498.aFloat216) {
			Static498.aFloat216 = (float) ((double) Static498.aFloat216 - (double) Static498.aFloat216 / 30.0D);
			if (Static498.aFloat217 > Static498.aFloat216) {
				Static498.aFloat216 = Static498.aFloat217;
			}
			Static27.method617();
			Static498.anInt8791 = (int) Static498.aFloat216 >> 1;
			Static498.aByteArrayArrayArray10 = Static243.method3622(Static498.anInt8791);
		}
		if (Static157.anInt3118 != -1 && Static367.anInt6812 != -1) {
			@Pc(84) int local84 = Static157.anInt3118 - Static397.anInt7311;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(101) int local101 = Static367.anInt6812 - Static517.anInt9046;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			Static397.anInt7311 += local84;
			Static517.anInt9046 += local101;
			if (local84 == 0 && local101 == 0) {
				Static367.anInt6812 = -1;
				Static157.anInt3118 = -1;
			}
			Static27.method617();
		}
		if (Static241.anInt4364 > 0) {
			Static149.anInt6799--;
			if (Static149.anInt6799 == 0) {
				Static149.anInt6799 = 100;
				Static241.anInt4364--;
			}
		} else {
			Static255.anInt4512 = -1;
			Static159.anInt8121 = -1;
		}
		if (!Static349.aBoolean457 || Static461.aClass262_48 == null) {
			return;
		}
		for (@Pc(169) Class14_Sub54 local169 = (Class14_Sub54) Static461.aClass262_48.method6318(); local169 != null; local169 = (Class14_Sub54) Static461.aClass262_48.method6311()) {
			@Pc(178) Class42 local178 = Static498.aClass116_4.method2783(local169.aClass14_Sub46_1.anInt8309);
			if (local169.method9069(arg0, arg1)) {
				if (local178.aStringArray5 != null) {
					if (local178.aStringArray5[4] != null) {
						Static261.method3780((long) local169.aClass14_Sub46_1.anInt8309, -1, true, local178.aString11, false, -1, false, local178.anInt1303, (long) local169.aClass14_Sub46_1.anInt8309, 0, local178.aStringArray5[4], 1002);
					}
					if (local178.aStringArray5[3] != null) {
						Static261.method3780((long) local169.aClass14_Sub46_1.anInt8309, -1, true, local178.aString11, false, -1, false, local178.anInt1303, (long) local169.aClass14_Sub46_1.anInt8309, 0, local178.aStringArray5[3], 1008);
					}
					if (local178.aStringArray5[2] != null) {
						Static261.method3780((long) local169.aClass14_Sub46_1.anInt8309, -1, true, local178.aString11, false, -1, false, local178.anInt1303, (long) local169.aClass14_Sub46_1.anInt8309, 0, local178.aStringArray5[2], 1007);
					}
					if (local178.aStringArray5[1] != null) {
						Static261.method3780((long) local169.aClass14_Sub46_1.anInt8309, -1, true, local178.aString11, false, -1, false, local178.anInt1303, (long) local169.aClass14_Sub46_1.anInt8309, 0, local178.aStringArray5[1], 1003);
					}
					if (local178.aStringArray5[0] != null) {
						Static261.method3780((long) local169.aClass14_Sub46_1.anInt8309, -1, true, local178.aString11, false, -1, false, local178.anInt1303, (long) local169.aClass14_Sub46_1.anInt8309, 0, local178.aStringArray5[0], 1006);
					}
				}
				if (!local169.aClass14_Sub46_1.aBoolean575) {
					local169.aClass14_Sub46_1.aBoolean575 = true;
					Static632.method8833(Static335.aClass276_11, local169.aClass14_Sub46_1.anInt8309, local178.anInt1303);
				}
				if (local169.aClass14_Sub46_1.aBoolean575) {
					Static632.method8833(Static24.aClass276_1, local169.aClass14_Sub46_1.anInt8309, local178.anInt1303);
				}
			} else if (local169.aClass14_Sub46_1.aBoolean575) {
				local169.aClass14_Sub46_1.aBoolean575 = false;
				Static632.method8833(Static220.aClass276_9, local169.aClass14_Sub46_1.anInt8309, local178.anInt1303);
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static313.anInt9045 <= arg6 && Static575.anInt9879 >= arg0 && arg3 >= Static468.anInt355 && Static370.anInt10475 >= arg4) {
			Static383.method5697(arg1, arg6, arg4, arg3, arg2, arg5, arg0);
		} else {
			Static55.method1188(arg2, arg0, arg5, arg3, arg1, arg4, arg6);
		}
	}
}
