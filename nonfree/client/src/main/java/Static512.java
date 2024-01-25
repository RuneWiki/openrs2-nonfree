import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt8559;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_123 = new Class376(36, 3);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	public static void method7235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static164.anInt3010 == arg2 && Static660.anInt10216 == arg0 && arg1 == Static267.anInt5037) {
			return;
		}
		Static660.anInt10216 = arg0;
		Static267.anInt5037 = arg1;
		Static164.anInt3010 = arg2;
		Static674.aBoolean763 = true;
		@Pc(35) double local35 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(45) double local45 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(48) double local48 = Math.cos(local45);
		@Pc(51) double local51 = Math.sin(local45);
		@Pc(54) double local54 = Math.cos(local35);
		@Pc(57) double local57 = Math.sin(local35);
		Static197.aDouble17 = local54;
		Static544.aDouble29 = local51;
		Static314.aDouble22 = local48;
		Static310.aDouble21 = local57;
		Static438.aDouble27 = local48 * local54;
		Static561.aDouble31 = 0.0D;
		Static257.aDouble19 = local57 * local51;
		Static679.aDouble36 = local57 * -local48;
		Static4.aDouble1 = local54 * -local51;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public static boolean method7236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class178 local8 = Static349.aClass374_2.method8357(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4016(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIIIIBI)V")
	public static void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (!Static368.method5461(arg2)) {
			return;
		}
		if (Static384.aClass208ArrayArray2[arg2] == null) {
			Static82.method1752(Static562.aClass208ArrayArray3[arg2], -1, arg0, arg8, arg5, arg10, arg6, arg9, arg7, arg4, arg1, arg3);
		} else {
			Static82.method1752(Static384.aClass208ArrayArray2[arg2], -1, arg0, arg8, arg5, arg10, arg6, arg9, arg7, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)I")
	public static int method7238(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
