import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1115 = Static193.method3027("shake:");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_23 = new Class85(64);

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1116 = aClass70_1115;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1117 = aClass70_1115;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1118 = Static193.method3027("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1119 = Static193.method3027(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1120 = Static193.method3027("");

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public static int anInt2300 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V")
	public static void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= Static119.anInt2428 && Static200.anInt4074 >= arg3 && arg5 >= Static26.anInt554 && Static52.anInt1117 >= arg4) {
			if (arg1 == 1) {
				Static135.method1921(arg2, arg3, arg0, arg4, arg5);
			} else {
				Static138.method1972(arg4, arg0, arg2, arg5, arg3, arg1);
			}
		} else if (arg1 == 1) {
			Static90.method1301(arg4, arg2, arg3, arg0, arg5);
		} else {
			Static43.method707(arg3, arg2, arg5, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)I")
	public static int method1646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	private static int method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[S[Lclient!oc;II)V")
	public static void method1649(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class70[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) Class70 local18 = arg1[local12];
		arg1[local12] = arg1[arg2];
		arg1[arg2] = local18;
		@Pc(32) short local32 = arg0[local12];
		arg0[local12] = arg0[arg2];
		arg0[arg2] = local32;
		for (@Pc(44) int local44 = arg3; local44 < arg2; local44++) {
			if (local18 == null || arg1[local44] != null && (local44 & 0x1) > arg1[local44].method2050(local18)) {
				@Pc(69) Class70 local69 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14] = local69;
				@Pc(83) short local83 = arg0[local44];
				arg0[local44] = arg0[local14];
				arg0[local14++] = local83;
			}
		}
		arg1[arg2] = arg1[local14];
		arg1[local14] = local18;
		arg0[arg2] = arg0[local14];
		arg0[local14] = local32;
		method1649(arg0, arg1, local14 - 1, arg3);
		method1649(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII[BIII[Lclient!pd;)V")
	public static void method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class77[] arg8) {
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if (local14 + arg4 > 0 && arg4 + local14 < 103 && local17 + arg3 > 0 && local17 + arg3 < 103) {
					arg8[arg6].anIntArrayArray23[arg4 + local14][local17 + arg3] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class3_Sub4 local82 = new Class3_Sub4(arg5);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
					if (arg2 == local84 && local87 >= arg1 && local87 < arg1 + 8 && arg7 <= local90 && arg7 + 8 > local90) {
						Static196.method3063(method1647(arg0, local87 & 0x7, local90 & 0x7) + arg4, arg6, arg0, 0, local82, 0, Static200.method3180(arg0, local90 & 0x7, local87 & 0x7) + arg3);
					} else {
						Static196.method3063(-1, 0, 0, 0, local82, 0, -1);
					}
				}
			}
		}
	}
}
