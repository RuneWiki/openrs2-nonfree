import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!og;")
	public static Class7_Sub2_Sub2 aClass7_Sub2_Sub2_1;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
	public static int anInt3890;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static final int anInt3867 = 50;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static volatile int anInt3869 = 0;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public static final int anInt3880 = 2301979;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1361 = Static151.method2243("Fps:");

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	public static int anInt3885 = -1;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1362 = Static151.method2243(" seconds)3");

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1363 = aClass62_1362;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void method2665(@OriginalArg(1) int arg0) {
		if (Static35.anInt841 == 0) {
			Static30.aClass2_Sub2_Sub1_1.method358(arg0);
		} else {
			Static46.anInt1030 = arg0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILclient!hg;)V")
	public static void method2678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub11 arg4) {
		@Pc(12) Class2_Sub8 local12 = new Class2_Sub8();
		local12.anInt1470 = arg4.anInt1552;
		local12.anInt1464 = arg4.anInt1542;
		local12.anInt1460 = arg2 * 128;
		local12.anInt1468 = arg0 * 128;
		local12.anInt1466 = arg4.anInt1574;
		@Pc(37) int local37 = arg4.anInt1556;
		@Pc(40) int local40 = arg4.anInt1559;
		local12.anIntArray125 = arg4.anIntArray131;
		local12.anInt1463 = arg3;
		local12.anInt1459 = arg4.anInt1540 * 128;
		if (arg1 == 1 || arg1 == 3) {
			local37 = arg4.anInt1559;
			local40 = arg4.anInt1556;
		}
		local12.anInt1472 = (local37 + arg2) * 128;
		local12.anInt1458 = (local40 + arg0) * 128;
		if (arg4.anIntArray133 != null) {
			local12.aClass2_Sub1_Sub11_1 = arg4;
			local12.method993();
		}
		Static82.aClass13_4.method304(local12);
		if (local12.anIntArray125 != null) {
			local12.anInt1467 = (int) (Math.random() * (double) (local12.anInt1464 - local12.anInt1470)) + local12.anInt1470;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Lclient!ej;")
	public static Class2_Sub1_Sub8 method2680(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub8 local10 = (Class2_Sub1_Sub8) Static124.aClass53_14.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static72.aClass71_14.method2130(Static35.method610(arg0), Static2.method51(arg0));
		local10 = new Class2_Sub1_Sub8();
		if (local34 != null) {
			local10.method751(new Class2_Sub11(local34));
		}
		Static124.aClass53_14.method1645((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!pb;ILclient!pb;)I")
	public static int method2681(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2119(Static59.anInt1227)) {
			local5++;
		}
		if (arg1.method2119(Static211.anInt4416)) {
			local5++;
		}
		if (arg1.method2119(Static213.anInt4434)) {
			local5++;
		}
		if (arg1.method2119(Static56.anInt1143)) {
			local5++;
		}
		if (arg1.method2119(Static9.anInt245)) {
			local5++;
		}
		if (arg1.method2119(Static190.anInt3936)) {
			local5++;
		}
		arg1.method2119(Static92.anInt2047);
		arg1.method2119(Static66.anInt1402);
		arg1.method2119(Static94.anInt2095);
		arg1.method2119(Static164.anInt3465);
		arg1.method2119(Static1.anInt34);
		return local5;
	}
}
