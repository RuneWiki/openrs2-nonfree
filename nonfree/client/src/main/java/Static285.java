import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!jd;")
	public static Class84 aClass84_122;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!ec;")
	public static Class46 aClass46_41 = new Class46(64);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString287 = "white:";

	@OriginalMember(owner = "client!w", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V")
	public static void method4723(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg3 + arg2) / 2;
		@Pc(23) int local23 = arg3;
		@Pc(27) long local27 = arg1[local21];
		arg1[local21] = arg1[arg2];
		arg1[arg2] = local27;
		@Pc(41) Object local41 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local41;
		for (@Pc(53) int local53 = arg3; local53 < arg2; local53++) {
			if (arg1[local53] < (long) (local53 & 0x1) + local27) {
				@Pc(76) long local76 = arg1[local53];
				arg1[local53] = arg1[local23];
				arg1[local23] = local76;
				@Pc(90) Object local90 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23++] = local90;
			}
		}
		arg1[arg2] = arg1[local23];
		arg1[local23] = local27;
		arg0[arg2] = arg0[local23];
		arg0[local23] = local41;
		method4723(arg0, arg1, local23 - 1, arg3);
		method4723(arg0, arg1, arg2, local23 + 1);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method4724() {
		Static259.aClass46_34.method1079();
		Static148.aClass46_26.method1079();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4727(@OriginalArg(0) String arg0) {
		return Static257.method4289(10, arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method4728(@OriginalArg(0) Class84 arg0) {
		Static102.anInt2236 = arg0.method2121("runes");
	}
}
