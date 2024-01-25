import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public static int anInt5460 = 0;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_95 = new Class322(86, 1);

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
	public static int anInt5467 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public static void method4978() {
		Static425.anIntArray469 = null;
		Static329.anIntArray330 = null;
		Static4.anIntArray3 = null;
		Static36.aBoolean37 = false;
		Static173.anIntArray192 = null;
		Static491.anIntArray524 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
	public static void method4981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static149.anInt3119; local12++) {
			@Pc(18) Rectangle local18 = Class6_Sub24.aRectangleArray2[local12];
			if (arg3 < local18.x + local18.width && local18.x < arg0 + arg3 && local18.y + local18.height > arg1 && local18.y < arg2 + arg1) {
				Static411.aBooleanArray22[local12] = true;
			}
		}
		Static494.method3707(arg1, arg3, arg2 + arg1, arg0 + arg3);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)Lclient!o;")
	public static Class259 method4985(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static627.aFloat139 == 3.0D) {
				return Static70.aClass259_2;
			}
			if ((double) Static627.aFloat139 == 4.0D) {
				return Static471.aClass259_8;
			}
			if ((double) Static627.aFloat139 == 6.0D) {
				return Static292.aClass259_3;
			}
			if ((double) Static627.aFloat139 >= 8.0D) {
				return Static462.aClass259_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static627.aFloat139 == 3.0D) {
				return Static292.aClass259_3;
			}
			if ((double) Static627.aFloat139 == 4.0D) {
				return Static462.aClass259_7;
			}
			if ((double) Static627.aFloat139 == 6.0D) {
				return Static393.aClass259_5;
			}
			if ((double) Static627.aFloat139 >= 8.0D) {
				return Static383.aClass259_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static627.aFloat139 == 3.0D) {
				return Static393.aClass259_5;
			}
			if ((double) Static627.aFloat139 == 4.0D) {
				return Static383.aClass259_4;
			}
			if ((double) Static627.aFloat139 == 6.0D) {
				return Static446.aClass259_6;
			}
			if ((double) Static627.aFloat139 >= 8.0D) {
				return Static53.aClass259_1;
			}
		}
		return null;
	}
}
