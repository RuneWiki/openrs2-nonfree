import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread4;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt4065;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!wv;IBZI)V")
	public static void method3447(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt9578;
		@Pc(11) int local11 = arg0.anInt9638;
		if (arg0.aByte126 == 0) {
			arg0.anInt9578 = arg0.anInt9627;
		} else if (arg0.aByte126 == 1) {
			arg0.anInt9578 = arg1 - arg0.anInt9627;
		} else if (arg0.aByte126 == 2) {
			arg0.anInt9578 = arg1 * arg0.anInt9627 >> 14;
		}
		if (arg0.aByte124 == 0) {
			arg0.anInt9638 = arg0.anInt9582;
		} else if (arg0.aByte124 == 1) {
			arg0.anInt9638 = arg3 - arg0.anInt9582;
		} else if (arg0.aByte124 == 2) {
			arg0.anInt9638 = arg3 * arg0.anInt9582 >> 14;
		}
		if (arg0.aByte126 == 4) {
			arg0.anInt9578 = arg0.anInt9638 * arg0.anInt9589 / arg0.anInt9588;
		}
		if (arg0.aByte124 == 4) {
			arg0.anInt9638 = arg0.anInt9578 * arg0.anInt9588 / arg0.anInt9589;
		}
		if (Static484.aBoolean581 && (Static72.method1565(arg0).anInt5698 != 0 || arg0.anInt9595 == 0)) {
			if (arg0.anInt9638 < 5 && arg0.anInt9578 < 5) {
				arg0.anInt9638 = 5;
				arg0.anInt9578 = 5;
			} else {
				if (arg0.anInt9578 <= 0) {
					arg0.anInt9578 = 5;
				}
				if (arg0.anInt9638 <= 0) {
					arg0.anInt9638 = 5;
				}
			}
		}
		if (Static440.anInt7395 == arg0.anInt9607) {
			Static399.aClass365_12 = arg0;
		}
		if (arg2 && arg0.anObjectArray8 != null && (local8 != arg0.anInt9578 || local11 != arg0.anInt9638)) {
			@Pc(204) Class1_Sub2 local204 = new Class1_Sub2();
			local204.anObjectArray1 = arg0.anObjectArray8;
			local204.aClass365_1 = arg0;
			Static215.aClass361_44.method7855(local204);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)I")
	public static int method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg0;
		} else if (local18 == 1) {
			return arg3;
		} else if (local18 == 2) {
			return 1 + 7 - arg5 - arg0;
		} else {
			return 1 + 7 - arg4 - arg3;
		}
	}
}
