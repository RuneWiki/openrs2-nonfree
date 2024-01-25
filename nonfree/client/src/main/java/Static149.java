import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	public static int anInt2991;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	public static int anInt2987 = 0;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_26 = new Class125(64);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)Lclient!gh;")
	public static Class106 method2553(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static55.aFloat69 == 3.0D) {
				return Static131.aClass106_3;
			}
			if ((double) Static55.aFloat69 == 4.0D) {
				return Static131.aClass106_2;
			}
			if ((double) Static55.aFloat69 == 6.0D) {
				return Static509.aClass106_9;
			}
			if ((double) Static55.aFloat69 >= 8.0D) {
				return Static446.aClass106_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static55.aFloat69 == 3.0D) {
				return Static509.aClass106_9;
			}
			if ((double) Static55.aFloat69 == 4.0D) {
				return Static446.aClass106_7;
			}
			if ((double) Static55.aFloat69 == 6.0D) {
				return Static98.aClass106_1;
			}
			if ((double) Static55.aFloat69 >= 8.0D) {
				return Static480.aClass106_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static55.aFloat69 == 3.0D) {
				return Static98.aClass106_1;
			}
			if ((double) Static55.aFloat69 == 4.0D) {
				return Static480.aClass106_8;
			}
			if ((double) Static55.aFloat69 == 6.0D) {
				return Static499.aClass106_5;
			}
			if ((double) Static55.aFloat69 >= 8.0D) {
				return Static192.aClass106_6;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method2554(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 11);
		local8.method6212();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg1; local16++) {
				if (Static405.anIntArrayArray72[local12][local16] == arg0 && Static169.anIntArrayArray42[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
