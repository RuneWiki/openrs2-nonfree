import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "[[[Lclient!wk;")
	public static Class1_Sub33[][][] aClass1_Sub33ArrayArrayArray3;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString171 = "K";

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public static void method2610(@OriginalArg(1) int arg0) {
		Static183.aClass187_94.method4530();
		Static183.aClass187_94 = new Class187(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([Ljava/lang/Object;I[IIB)V")
	public static void method2611(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(19) int local19 = arg3;
		@Pc(26) int local26 = (arg3 + arg1) / 2;
		@Pc(30) int local30 = arg2[local26];
		arg2[local26] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(44) Object local44 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local44;
		for (@Pc(56) int local56 = arg3; local56 < arg1; local56++) {
			if (arg2[local56] < (local56 & 0x1) + local30) {
				@Pc(76) int local76 = arg2[local56];
				arg2[local56] = arg2[local19];
				arg2[local19] = local76;
				@Pc(90) Object local90 = arg0[local56];
				arg0[local56] = arg0[local19];
				arg0[local19++] = local90;
			}
		}
		arg2[arg1] = arg2[local19];
		arg2[local19] = local30;
		arg0[arg1] = arg0[local19];
		arg0[local19] = local44;
		method2611(arg0, local19 - 1, arg2, arg3);
		method2611(arg0, arg1, arg2, local19 + 1);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public static void method2614() {
		Static69.method4281();
		Static55.method974();
		Static146.method2492();
		Static48.method903();
		Static295.method4497();
		Static136.method2365();
		Static278.method4291();
		Static24.method378();
		Static236.method3647();
		Static135.method2338();
		Static201.method3229();
		Static6.method36();
		Static311.method4759();
		Static212.method612();
		Static2.method15();
		Static219.method3417();
		Static234.method3633();
		Static31.method506();
		Static100.method1812();
		Static105.method1213();
		Static113.method2019();
		Static244.aClass187_124.method4534(5);
		Static311.aClass187_157.method4534(5);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method2615() {
		Static51.aClass187_32.method4525();
		Static131.aClass187_71.method4525();
	}
}
