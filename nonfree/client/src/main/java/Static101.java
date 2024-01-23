import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public static int anInt2453;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!i;")
	private static Class41 aClass41_724 = Static184.method2923("Loading fonts )2 ");

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_725 = Static184.method2923("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!i;")
	private static Class41 aClass41_729 = Static184.method2923("Free world");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_726 = aClass41_729;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_727 = Static184.method2923("mapdots");

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_728 = aClass41_724;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt2450 = 0;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_730 = Static184.method2923(" from your friend list first)3");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_731 = Static184.method2923("(U1");

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_732 = Static184.method2923("T");

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_733 = aClass41_730;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class2_Sub2_Sub11 method1730(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static134.aClass43_13.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = Static56.aClass15_12.method387(arg0, 0);
		} else {
			local30 = Static59.aClass15_14.method387(arg0 & 0x7FFF, 0);
		}
		local10 = new Class2_Sub2_Sub11();
		if (local30 != null) {
			local10.method1770(new Class2_Sub3(local30));
		}
		if (arg0 >= 32768) {
			local10.method1773();
		}
		Static134.aClass43_13.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method1732() {
		if (Static30.aClass63_1 != null) {
			Static30.aClass63_1.method2043();
			Static30.aClass63_1 = null;
		}
		Static25.method3300();
		Static74.method1382();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static149.aClass42Array1[local17].method1432();
		}
		Static177.method2840();
		System.gc();
		Static103.method1771();
		Static96.aBoolean127 = false;
		Static2.anInt70 = -1;
		Static40.method861();
		Static116.method1955(10);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIZI)V")
	public static void method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(14) int local14 = arg3 - arg2;
		@Pc(18) int local18 = arg2 + arg5;
		@Pc(22) int local22 = arg0 - arg2;
		for (@Pc(24) int local24 = arg4; local24 < local9; local24++) {
			Static204.method3147(arg5, arg1, arg0, Static3.anIntArrayArray1[local24]);
		}
		for (@Pc(40) int local40 = arg3; local40 > local14; local40--) {
			Static204.method3147(arg5, arg1, arg0, Static3.anIntArrayArray1[local40]);
		}
		for (@Pc(60) int local60 = local9; local60 <= local14; local60++) {
			@Pc(68) int[] local68 = Static3.anIntArrayArray1[local60];
			Static204.method3147(arg5, arg1, local18, local68);
			Static204.method3147(local22, arg1, arg0, local68);
		}
	}
}
