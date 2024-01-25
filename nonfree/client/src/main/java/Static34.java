import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
	public static void method1253(@OriginalArg(1) boolean arg0) {
		Static420.aClass39_10.method7236(Static398.aClass5_13.method7503());
		@Pc(14) int[] local14 = Static398.aClass5_13.Y();
		Static190.anInt3597 = local14[3];
		Static612.anInt9919 = local14[0];
		Static231.anInt4363 = local14[1];
		Static116.anInt2540 = local14[2];
		if (arg0) {
			Static398.aClass5_13.DA(Static395.anInt7324, Static259.anInt4785, Static608.anInt9869, Static504.anInt8719);
			Static220.method3684(Static602.aDouble33);
		} else {
			Static398.aClass5_13.DA(Static368.anInt6967, Static140.anInt2835, Static525.anInt4734, Static46.anInt1328);
			Static220.method3684(Static617.aDouble35);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)Z")
	public static boolean method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg1 + arg2;
		@Pc(17) int local17 = arg4 + arg0;
		@Pc(21) int local21 = arg3 + arg5;
		if (!Static441.method6862(arg1, local17, local8, local21, local21, local17, arg5, local17, arg1)) {
			return false;
		} else if (Static441.method6862(local8, local17, local8, local21, arg5, local17, arg5, local17, arg1)) {
			if (Static596.anInt9756 > arg1) {
				if (!Static441.method6862(arg1, local17, arg1, local21, arg5, arg0, local21, local17, arg1)) {
					return false;
				}
				if (!Static441.method6862(arg1, local17, arg1, arg5, arg5, arg0, local21, arg0, arg1)) {
					return false;
				}
			} else if (!Static441.method6862(local8, local17, local8, local21, arg5, arg0, local21, local17, local8)) {
				return false;
			} else if (!Static441.method6862(local8, local17, local8, arg5, arg5, arg0, local21, arg0, local8)) {
				return false;
			}
			if (Static588.anInt9618 > arg5) {
				if (!Static441.method6862(arg1, local17, local8, arg5, arg5, arg0, arg5, local17, arg1)) {
					return false;
				}
				if (!Static441.method6862(local8, local17, local8, arg5, arg5, arg0, arg5, arg0, arg1)) {
					return false;
				}
			} else if (!Static441.method6862(arg1, local17, local8, local21, local21, arg0, local21, local17, arg1)) {
				return false;
			} else if (!Static441.method6862(local8, local17, local8, local21, local21, arg0, local21, arg0, arg1)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
