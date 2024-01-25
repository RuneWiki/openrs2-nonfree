import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "Lclient!aga;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	public static int anInt8127;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
	public static boolean method6759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static457.aBoolean566) {
			return false;
		} else if (Static13.anInt359 < 100) {
			return false;
		} else {
			@Pc(44) int local44;
			@Pc(48) int local48;
			if (arg4 != arg5 || arg1 != arg3) {
				for (local44 = arg5; local44 <= arg4; local44++) {
					for (local48 = arg3; local48 <= arg1; local48++) {
						if (-Static7.anInt135 == Static354.anIntArrayArrayArray14[arg0][local44][local48]) {
							return false;
						}
					}
				}
				local48 = (arg5 << Static378.anInt6665) + 1;
				@Pc(115) int local115 = (arg3 << Static378.anInt6665) + 2;
				if (Static20.method542(Static20.aClass17Array1[arg0].method6642(arg5, arg3), local48, (arg1 + 1 - arg3) * Static47.anInt1239, Static47.anInt1239 * (arg4 + 1 - arg5), arg2, local115)) {
					Static264.anInt4970++;
					return true;
				} else {
					return false;
				}
			} else if (Static158.method2431(arg5, arg0, arg3)) {
				local44 = arg5 << Static378.anInt6665;
				local48 = arg3 << Static378.anInt6665;
				if (Static20.method542(Static20.aClass17Array1[arg0].method6642(arg5, arg3), local44, Static47.anInt1239, Static47.anInt1239, arg2, local48)) {
					Static264.anInt4970++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ir;III)V")
	public static void method6762(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class293 local12;
		if (arg2 < Static446.anInt7725) {
			local12 = Static118.aClass293ArrayArrayArray14[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass20_Sub2_Sub3_1 != null && local12.aClass20_Sub2_Sub3_1.method7254()) {
				arg0.method7257(0, local12.aClass20_Sub2_Sub3_1, true, 0, Static63.aClass12_5, Static47.anInt1239);
			}
		}
		if (arg3 < Static446.anInt7725) {
			local12 = Static118.aClass293ArrayArrayArray14[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass20_Sub2_Sub3_1 != null && local12.aClass20_Sub2_Sub3_1.method7254()) {
				arg0.method7257(Static47.anInt1239, local12.aClass20_Sub2_Sub3_1, true, 0, Static63.aClass12_5, 0);
			}
		}
		if (arg2 < Static446.anInt7725 && arg3 < Static218.anInt4229) {
			local12 = Static118.aClass293ArrayArrayArray14[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass20_Sub2_Sub3_1 != null && local12.aClass20_Sub2_Sub3_1.method7254()) {
				arg0.method7257(Static47.anInt1239, local12.aClass20_Sub2_Sub3_1, true, 0, Static63.aClass12_5, Static47.anInt1239);
			}
		}
		if (arg2 < Static446.anInt7725 && arg3 > 0) {
			local12 = Static118.aClass293ArrayArrayArray14[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass20_Sub2_Sub3_1 != null && local12.aClass20_Sub2_Sub3_1.method7254()) {
				arg0.method7257(-Static47.anInt1239, local12.aClass20_Sub2_Sub3_1, true, 0, Static63.aClass12_5, Static47.anInt1239);
			}
		}
	}
}
