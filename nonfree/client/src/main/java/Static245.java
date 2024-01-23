import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!in;")
	public static Class71 aClass71_20;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public static int anInt4881 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public static int method3807(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIIIII)V")
	public static void method3809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static23.method431(arg1, Static49.anInt1129, Static297.anInt5619);
		@Pc(25) int local25 = Static23.method431(arg2, Static49.anInt1129, Static297.anInt5619);
		@Pc(31) int local31 = Static23.method431(arg4, Static68.anInt1451, Static224.anInt4436);
		@Pc(37) int local37 = Static23.method431(arg0, Static68.anInt1451, Static224.anInt4436);
		@Pc(46) int local46 = Static23.method431(arg1 + arg3, Static49.anInt1129, Static297.anInt5619);
		@Pc(55) int local55 = Static23.method431(arg2 - arg3, Static49.anInt1129, Static297.anInt5619);
		@Pc(57) int local57;
		for (local57 = local19; local57 < local46; local57++) {
			Static126.method1523(Static22.anIntArrayArray3[local57], local37, arg5, local31);
		}
		for (local57 = local25; local57 > local55; local57--) {
			Static126.method1523(Static22.anIntArrayArray3[local57], local37, arg5, local31);
		}
		@Pc(103) int local103 = Static23.method431(arg4 + arg3, Static68.anInt1451, Static224.anInt4436);
		@Pc(111) int local111 = Static23.method431(arg0 - arg3, Static68.anInt1451, Static224.anInt4436);
		for (local57 = local46; local57 <= local55; local57++) {
			@Pc(124) int[] local124 = Static22.anIntArrayArray3[local57];
			Static126.method1523(local124, local103, arg5, local31);
			Static126.method1523(local124, local37, arg5, local111);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)V")
	public static void method3810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static283.aClass1_Sub11_Sub1_3.method2697(69);
		Static283.aClass1_Sub11_Sub1_3.method2670(arg0);
		Static283.aClass1_Sub11_Sub1_3.method2660(arg1);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static void method3811() {
		Static246.aClass135_31.method3317();
	}
}
