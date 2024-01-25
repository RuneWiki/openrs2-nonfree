import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public static int anInt4128;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_220 = new Class159("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBIII)V")
	public static void method3725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg2);
		@Pc(17) int local17 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg5);
		@Pc(23) int local23 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1);
		@Pc(37) int local37 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg3);
		@Pc(45) int local45 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg2 + arg4);
		@Pc(54) int local54 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg5 - arg4);
		for (@Pc(56) int local56 = local11; local56 < local45; local56++) {
			Static135.method2878(Static223.anIntArrayArray124[local56], local37, arg0, local23);
		}
		for (@Pc(76) int local76 = local17; local76 > local54; local76--) {
			Static135.method2878(Static223.anIntArrayArray124[local76], local37, arg0, local23);
		}
		@Pc(103) int local103 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 + arg4);
		@Pc(112) int local112 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg3 - arg4);
		for (@Pc(114) int local114 = local45; local114 <= local54; local114++) {
			@Pc(120) int[] local120 = Static223.anIntArrayArray124[local114];
			Static135.method2878(local120, local103, arg0, local23);
			Static135.method2878(local120, local37, arg0, local112);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!me;")
	public static Class4_Sub4_Sub10 method3730(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub10 local10 = (Class4_Sub4_Sub10) Static144.aClass124_5.method3525((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static171.aClass193_62.method5047(19, arg0);
		local10 = new Class4_Sub4_Sub10();
		if (local20 != null) {
			local10.method3663(new Class4_Sub11(local20));
		}
		Static144.aClass124_5.method3528(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Lclient!vd;")
	public static Class208 method3733(@OriginalArg(0) int arg0) {
		@Pc(10) Class208 local10 = (Class208) Static330.aClass198_234.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static74.aClass193_21.method5047(1, arg0);
		local10 = new Class208();
		local10.anInt6369 = arg0;
		if (local20 != null) {
			local10.method5388(new Class4_Sub11(local20));
		}
		local10.method5391();
		if (local10.anInt6383 == 2 && Static74.aClass43_10.method1273((long) arg0) == null) {
			Static74.aClass43_10.method1276(new Class4_Sub8(Static349.anInt6621), (long) arg0);
			Static318.aClass208Array1[Static349.anInt6621++] = local10;
		}
		Static330.aClass198_234.method5201(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
	public static void method3735(@OriginalArg(0) int arg0) {
		Static40.method814();
		@Pc(10) int local10 = Static334.method3562(arg0).anInt2657;
		if (local10 == 0) {
			return;
		}
		@Pc(20) int local20 = Static328.anIntArray485[arg0];
		if (local10 == 5) {
			Static321.anInt4799 = local20;
		}
		if (local10 == 6) {
			Static191.anInt4020 = local20;
		}
	}
}
