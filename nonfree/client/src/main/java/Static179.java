import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static370.aClass180Array6[Static28.anInt387++] = new Class180(4, arg1, arg0, arg2, arg2, arg0, arg6, arg4, arg4, arg6, arg3, arg3, arg5, arg5);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZIILclient!wq;)V")
	public static void method2637(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class394 arg3) {
		@Pc(6) int local6 = arg3.anInt10536;
		if (arg3.aByte154 == 0) {
			arg3.anInt10536 = arg3.anInt10463;
		} else if (arg3.aByte154 == 1) {
			arg3.anInt10536 = arg1 - arg3.anInt10463;
		} else if (arg3.aByte154 == 2) {
			arg3.anInt10536 = arg1 * arg3.anInt10463 >> 14;
		}
		@Pc(49) int local49 = arg3.anInt10532;
		if (arg3.aByte152 == 0) {
			arg3.anInt10532 = arg3.anInt10443;
		} else if (arg3.aByte152 == 1) {
			arg3.anInt10532 = arg2 - arg3.anInt10443;
		} else if (arg3.aByte152 == 2) {
			arg3.anInt10532 = arg2 * arg3.anInt10443 >> 14;
		}
		if (arg3.aByte154 == 4) {
			arg3.anInt10536 = arg3.anInt10532 * arg3.anInt10454 / arg3.anInt10472;
		}
		if (arg3.aByte152 == 4) {
			arg3.anInt10532 = arg3.anInt10472 * arg3.anInt10536 / arg3.anInt10454;
		}
		if (Static292.aBoolean301 && (Static81.method1268(arg3).anInt7813 != 0 || arg3.anInt10479 == 0)) {
			if (arg3.anInt10532 < 5 && arg3.anInt10536 < 5) {
				arg3.anInt10536 = 5;
				arg3.anInt10532 = 5;
			} else {
				if (arg3.anInt10536 <= 0) {
					arg3.anInt10536 = 5;
				}
				if (arg3.anInt10532 <= 0) {
					arg3.anInt10532 = 5;
				}
			}
		}
		if (Static542.anInt8895 == arg3.anInt10477) {
			Static463.aClass394_6 = arg3;
		}
		if (arg0 && arg3.anObjectArray20 != null && (arg3.anInt10536 != local6 || local49 != arg3.anInt10532)) {
			@Pc(191) Class5_Sub28 local191 = new Class5_Sub28();
			local191.aClass394_2 = arg3;
			local191.anObjectArray2 = arg3.anObjectArray20;
			Static259.aClass124_40.method2574(local191);
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(IBI)V")
	public static void method2638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static195.anInt3145 = arg1 - Static407.anInt6543;
		Static158.anInt2662 = arg0 - Static407.anInt6539;
	}
}
