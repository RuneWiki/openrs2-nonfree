import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt3371 = -1;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public static final int anInt3372 = 1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lclient!bg;")
	public static Class29 method2973(@OriginalArg(0) int arg0) {
		@Pc(10) Class29 local10 = (Class29) Static271.aClass211_41.method5534((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static172.aClass254_118.method6401(1, arg0);
		local10 = new Class29();
		local10.anInt995 = arg0;
		if (local20 != null) {
			local10.method1075(new Class3_Sub7(local20));
		}
		local10.method1078();
		if (local10.anInt980 == 2 && Static486.aClass25_36.method946((long) arg0) == null) {
			Static486.aClass25_36.method945(new Class3_Sub48(Static37.anInt1041), (long) arg0);
			Static88.aClass29Array1[Static37.anInt1041++] = local10;
		}
		Static271.aClass211_41.method5529((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg1);
		@Pc(17) int local17 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg2);
		@Pc(23) int local23 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg5);
		@Pc(29) int local29 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg0);
		@Pc(37) int local37 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg6 + arg1);
		@Pc(46) int local46 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg2 - arg6);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static426.method6794(local29, Static333.anIntArrayArray56[local48], local23, arg4);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static426.method6794(local29, Static333.anIntArrayArray56[local73], local23, arg4);
		}
		@Pc(99) int local99 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg5 + arg6);
		@Pc(108) int local108 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg0 - arg6);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static333.anIntArrayArray56[local110];
			Static426.method6794(local99, local116, local23, arg4);
			Static426.method6794(local108, local116, local99, arg3);
			Static426.method6794(local29, local116, local108, arg4);
		}
	}
}
