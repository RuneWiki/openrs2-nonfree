import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
	public static final int[] anIntArray627 = new int[4];

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_162 = new Class298(46, 3);

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "[Lclient!ff;")
	public static final Class3_Sub22[] aClass3_Sub22Array5 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIII)V")
	public static void method6896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg1) {
			Static167.method2946(arg1, arg0, arg4, arg3);
		} else if (arg3 - arg1 >= Static110.anInt2597 && Static459.anInt7524 >= arg1 + arg3 && arg0 - arg2 >= Static385.anInt6630 && arg0 + arg2 <= Static69.anInt1918) {
			Static203.method3657(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static463.method6418(arg2, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 + arg0;
		@Pc(11) int local11 = arg1 + arg2;
		@Pc(15) int local15 = arg5 + arg3;
		if (!Static172.method2976(arg3, arg4, local11, local15, local15, local11, arg4, local7, local11)) {
			return false;
		} else if (Static172.method2976(arg3, local7, local11, arg3, local15, local11, arg4, local7, local11)) {
			if (arg4 < Static93.anInt2300) {
				if (!Static172.method2976(local15, arg4, local11, arg3, local15, arg2, arg4, arg4, local11)) {
					return false;
				}
				if (!Static172.method2976(local15, arg4, local11, arg3, arg3, arg2, arg4, arg4, arg2)) {
					return false;
				}
			} else if (!Static172.method2976(local15, local7, local11, arg3, local15, arg2, local7, local7, local11)) {
				return false;
			} else if (!Static172.method2976(local15, local7, local11, arg3, arg3, arg2, local7, local7, arg2)) {
				return false;
			}
			if (Static321.anInt5796 > arg3) {
				if (!Static172.method2976(arg3, arg4, local11, arg3, arg3, arg2, arg4, local7, local11)) {
					return false;
				}
				if (!Static172.method2976(arg3, local7, local11, arg3, arg3, arg2, arg4, local7, arg2)) {
					return false;
				}
			} else if (!Static172.method2976(local15, arg4, local11, local15, local15, arg2, arg4, local7, local11)) {
				return false;
			} else if (!Static172.method2976(local15, local7, local11, local15, local15, arg2, arg4, local7, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method6899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
