import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "Lclient!nr;")
	public static Class1_Sub6_Sub4 aClass1_Sub6_Sub4_2;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_36 = new Class217(55, 3);

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Lclient!tg;")
	public static final Class195 aClass195_2 = new Class195();

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "[I")
	public static int[] anIntArray70 = new int[2];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub20 local7 = null;
		for (@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static75.aClass42_19.method1543(); local12 != null; local12 = (Class1_Sub20) Static75.aClass42_19.method1551()) {
			if (local12.anInt2707 == arg5 && arg0 == local12.anInt2716 && local12.anInt2698 == arg2 && local12.anInt2709 == arg4) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub20();
			local7.anInt2709 = arg4;
			local7.anInt2698 = arg2;
			local7.anInt2707 = arg5;
			local7.anInt2716 = arg0;
			Static55.method1351(local7);
			Static75.aClass42_19.method1549(local7);
		}
		local7.anInt2700 = arg1;
		local7.anInt2717 = arg6;
		local7.anInt2708 = arg3;
		local7.anInt2706 = 0;
		local7.anInt2713 = -1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ct;I)V")
	public static void method951(@OriginalArg(0) Class30 arg0) {
		Static364.aClass30_109 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ct;Lclient!ct;B)V")
	public static void method952(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		Static62.aClass30_14 = arg0;
		Static69.aClass30_16 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public static void method954() {
		Static301.aClass21_154.method844(5);
	}
}
