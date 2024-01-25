import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!om", name = "E", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "Lclient!hh;")
	public static Class109 aClass109_67;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "I")
	public static int anInt4857 = 0;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
	public static final int[] anIntArray376 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	public static void method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static282.anInt4734 == 1) {
			Static449.aClass78Array15[Static290.anInt4875 / 100].method6003(Static449.anInt7762 - 8, Static14.anInt279 - 8);
		}
		if (Static282.anInt4734 == 2) {
			Static449.aClass78Array15[Static290.anInt4875 / 100 + 4].method6003(Static449.anInt7762 - 8, Static14.anInt279 + -8);
		}
		Static358.method5120();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZIII)V")
	public static void method3976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 - arg6;
		@Pc(13) int local13 = arg5 + arg6;
		for (@Pc(15) int local15 = arg5; local15 < local13; local15++) {
			Static23.method323(Static283.anIntArrayArray30[local15], arg0, arg4, arg3);
		}
		@Pc(34) int local34 = arg3 - arg6;
		@Pc(39) int local39 = arg0 + arg6;
		for (@Pc(41) int local41 = arg2; local41 > local9; local41--) {
			Static23.method323(Static283.anIntArrayArray30[local41], arg0, arg4, arg3);
		}
		for (@Pc(66) int local66 = local13; local66 <= local9; local66++) {
			@Pc(72) int[] local72 = Static283.anIntArrayArray30[local66];
			Static23.method323(local72, arg0, arg4, local39);
			Static23.method323(local72, local39, arg1, local34);
			Static23.method323(local72, local34, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
	public static void method3980(@OriginalArg(0) int arg0) {
		Static270.anInt2351 = arg0;
		@Pc(7) Class151 local7 = Static34.aClass151_21;
		synchronized (Static34.aClass151_21) {
			Static34.aClass151_21.method3298();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!qa;III)Lclient!c;")
	public static Class37 method3981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class37 local12 = (Class37) Static175.aClass151_134.method3288(local6);
		if (local12 == null) {
			@Pc(22) Class155 local22 = Static106.method1704(arg4, Static172.aClass109_40);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt4075 < 13) {
				local22.method3405();
			}
			local12 = arg2.method4617(local22, 2055, Static124.anInt2344, 64, 768);
			Static175.aClass151_134.method3291(local6, local12);
		}
		local12 = local12.method4155((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.k(arg1);
		}
		if (arg3 != 0) {
			local12.WA(arg3);
		}
		if (arg5 != 0) {
			local12.o(arg5);
		}
		if (arg0 != 0) {
			local12.ja(0, arg0, 0);
		}
		return local12;
	}
}
