import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!pu;")
	public static Class270 aClass270_13;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public static int anInt1393;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZILclient!vb;Lclient!vb;)I")
	public static int method1215(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class317_Sub1 arg2, @OriginalArg(4) Class317_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg3.anInt9107;
			local14 = arg2.anInt9107;
			if (!arg0) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static53.method977(arg3.method7460().aString88, Static307.anInt5279, arg2.method7460().aString88);
		} else if (arg1 == 3) {
			if (arg3.aString91.equals("-")) {
				if (arg2.aString91.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString91.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static53.method977(arg3.aString91, Static307.anInt5279, arg2.aString91);
			}
		} else if (arg1 == 4) {
			if (arg3.method7456()) {
				return arg2.method7456() ? 0 : 1;
			} else if (arg2.method7456()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method7454()) {
				return arg2.method7454() ? 0 : 1;
			} else if (arg2.method7454()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method7453()) {
				return arg2.method7453() ? 0 : 1;
			} else if (arg2.method7453()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method7457()) {
				return arg2.method7457() ? 0 : 1;
			} else if (arg2.method7457()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg3.anInt9114;
			local14 = arg2.anInt9114;
			if (arg0) {
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
			return arg3.anInt9112 - arg2.anInt9112;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
	public static boolean method1218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static142.method2139(arg1, arg0) | Static515.method7171(arg1, arg0) | Static427.method5927(arg0, arg1)) & Static116.method1841(arg1, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILclient!vq;ILclient!vq;III)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub3_Sub3_Sub1 arg4, @OriginalArg(6) Class8_Sub3_Sub3_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5.method5440();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class22 local20 = (Class22) Static574.aClass222_62.method4430((long) local7);
		if (local20 == null) {
			@Pc(27) Class102[] local27 = Static601.method2079(Static463.aClass270_98, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static16.aClass134_1.method6896(local27[0], true);
			Static574.aClass222_62.method4434(local20, (long) local7);
		}
		Static363.method4914(arg2 >> 1, arg4.anInt9370, arg6 >> 1, 0, arg4.anInt9365, arg4.aByte123, arg4.method5434() * 256);
		@Pc(73) int local73 = Static348.anIntArray473[0] + arg0 - 18;
		@Pc(81) int local81 = local73 + arg1 / 4 * 18;
		@Pc(92) int local92 = arg3 + Static348.anIntArray473[1] - 16 - 54;
		@Pc(114) int local114 = local92 + arg1 % 4 * 18;
		local20.method7662(local81, local114);
		if (arg4 == arg5) {
			Static16.aClass134_1.method6927(18, -256, local114 - 1, 18, local81 - 1);
		}
		@Pc(136) Class8_Sub6 local136 = Static557.method7582();
		local136.anInt5319 = local114;
		local136.anInt5318 = local81 + 16;
		local136.aClass8_Sub3_Sub3_Sub1_1 = arg5;
		local136.anInt5315 = local81;
		local136.anInt5316 = local114 + 16;
		Static496.aClass209_6.method4190(local136);
	}
}
