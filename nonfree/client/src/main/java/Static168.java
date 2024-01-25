import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_30 = new Class26(64);

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	public static int anInt3339 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)I")
	public static int method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(25) int local25 = arg5 & 0x3;
		if (local25 == 0) {
			return arg3;
		} else if (local25 == 1) {
			return 1 + 7 - arg4 - arg2;
		} else if (local25 == 2) {
			return 8 - arg3 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
	public static int method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static108.aClass77Array2 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 7;
		@Pc(20) int local20 = arg2 >> 7;
		if (local16 < 0 || local20 < 0 || local16 > Static24.anInt454 - 1 || Static240.anInt4832 - 1 < local20) {
			return 0;
		}
		@Pc(41) int local41 = arg1;
		if (arg1 < 3 && (Static1.aByteArrayArrayArray1[1][local16][local20] & 0x2) != 0) {
			local41 = arg1 + 1;
		}
		return Static108.aClass77Array2[local41].method4133(arg0, arg2);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public static void method2723() {
		if (Static143.aClass78_3 != null) {
			Static143.aClass78_3.method5513();
		}
		if (Static126.aClass78_4 != null) {
			Static126.aClass78_4.method5513();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
	public static void method2724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static280.anInt219; local7++) {
			@Pc(13) Rectangle local13 = Class157.aRectangleArray3[local7];
			if (arg2 < local13.x + local13.width && arg2 + arg3 > local13.x && local13.y + local13.height > arg1 && arg0 + arg1 > local13.y) {
				Static292.aBooleanArray22[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!km;)V")
	public static void method2725(@OriginalArg(1) Class67_Sub3_Sub3_Sub1 arg0) {
		for (@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Static169.aClass16_52.method193(); local12 != null; local12 = (Class11_Sub1) Static169.aClass16_52.method188()) {
			if (arg0 == local12.aClass67_Sub3_Sub3_Sub1_1) {
				if (local12.aClass11_Sub10_Sub1_2 != null) {
					Static341.aClass11_Sub10_Sub3_2.method3737(local12.aClass11_Sub10_Sub1_2);
					local12.aClass11_Sub10_Sub1_2 = null;
				}
				local12.method5701();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
	public static void method2726() {
		Static313.aClass11_Sub25_Sub1_5.method2454(210);
		Static313.aClass11_Sub25_Sub1_5.method5204(Static140.anInt2585);
	}
}
