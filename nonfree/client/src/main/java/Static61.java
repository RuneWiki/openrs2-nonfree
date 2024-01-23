import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!kh;")
	private static Class60 aClass60_477 = Static200.method3116(" ");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_476 = aClass60_477;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array9 = new Class60[200];

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[S")
	public static short[] aShortArray17 = new short[256];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public static int method1102(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!nc;I)Lclient!ih;")
	public static Class49 method1103(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(12) Class49 local12 = new Class49();
		local12.anInt1999 = arg0.method946();
		local12.aClass1_Sub1_Sub19_1 = Static152.method2598(local12.anInt1999);
		return local12;
	}
}
