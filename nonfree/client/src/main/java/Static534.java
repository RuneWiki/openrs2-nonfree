import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_131 = new Class200(40, -1);

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[Lclient!rl;")
	public static final Class147_Sub1[] aClass147_Sub1Array2 = new Class147_Sub1[37];

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!g;IZLclient!g;)I")
	public static int method7803(@OriginalArg(0) int arg0, @OriginalArg(1) Class96_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class96_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg1.anInt3292;
			local14 = arg3.anInt3292;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static24.method993(arg3.method2973().aString71, Static325.anInt6083, arg1.method2973().aString71);
		} else if (arg0 == 3) {
			if (arg1.aString30.equals("-")) {
				if (arg3.aString30.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString30.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static24.method993(arg3.aString30, Static325.anInt6083, arg1.aString30);
			}
		} else if (arg0 == 4) {
			if (arg1.method2971()) {
				return arg3.method2971() ? 0 : 1;
			} else if (arg3.method2971()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method2972()) {
				return arg3.method2972() ? 0 : 1;
			} else if (arg3.method2972()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method2969()) {
				return arg3.method2969() ? 0 : 1;
			} else if (arg3.method2969()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method2970()) {
				return arg3.method2970() ? 0 : 1;
			} else if (arg3.method2970()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg1.anInt3304;
			local14 = arg3.anInt3304;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt3303 - arg3.anInt3303;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static630.anInt10099 <= arg1 && arg3 <= Static16.anInt4339 && Static11.anInt9803 <= arg2 && arg4 <= Static149.anInt2949) {
			Static153.method2807(arg5, arg1, arg3, arg2, arg0, arg4, arg6);
		} else {
			Static214.method3618(arg2, arg5, arg6, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([SII)[S")
	public static short[] method7809(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static653.method6857(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
