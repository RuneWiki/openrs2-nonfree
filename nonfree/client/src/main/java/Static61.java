import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!re;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public static int anInt1170 = 0;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public static int anInt1174 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public static int method1136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static235.method3658(arg1 + 45365, 4, arg0 + 91923) + (Static235.method3658(arg1 + 10294, 2, arg0 - -37821) + -128 >> 1) + (Static235.method3658(arg1, 1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)[Lclient!hh;")
	public static Class117[] method1137() {
		return new Class117[] { Static319.aClass117_1, Static319.aClass117_2, Static319.aClass117_3, Static319.aClass117_4, Static319.aClass117_5, Static319.aClass117_6, Static319.aClass117_7, Static319.aClass117_8, Static319.aClass117_9, Static319.aClass117_10, Static319.aClass117_11, Static319.aClass117_12, Static319.aClass117_13, Static319.aClass117_14 };
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)Z")
	public static boolean method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static16.method470(arg1, arg0) & Static450.method6875(arg0, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg3) {
			Static432.method6628(arg5, arg0, arg1, arg4, arg3, arg6);
		} else if (Static7.anInt8119 <= arg6 - arg3 && arg3 + arg6 <= Static34.anInt603 && arg1 - arg2 >= Static328.anInt6154 && Static394.anInt7462 >= arg1 + arg2) {
			Static191.method6950(arg1, arg4, arg6, arg0, arg2, arg3, arg5);
		} else {
			Static164.method2787(arg2, arg0, arg6, arg5, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIII[BI)V")
	public static void method1142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg0 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg0 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg1 = local39 + 1;
			arg2[local39] = 1;
		}
	}
}
