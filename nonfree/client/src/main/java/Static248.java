import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
	public static final int[] anIntArray320 = new int[50];

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIIIII)V")
	public static void method4475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg1);
		@Pc(15) int local15 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg3);
		@Pc(21) int local21 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg0);
		@Pc(27) int local27 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg4);
		@Pc(35) int local35 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg1 + arg2);
		@Pc(44) int local44 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg3 - arg2);
		for (@Pc(46) int local46 = local9; local46 < local35; local46++) {
			Static426.method6794(local27, Static333.anIntArrayArray56[local46], local21, arg5);
		}
		for (@Pc(73) int local73 = local15; local73 > local44; local73--) {
			Static426.method6794(local27, Static333.anIntArrayArray56[local73], local21, arg5);
		}
		@Pc(94) int local94 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 + arg0);
		@Pc(103) int local103 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg4 - arg2);
		for (@Pc(105) int local105 = local35; local105 <= local44; local105++) {
			@Pc(110) int[] local110 = Static333.anIntArrayArray56[local105];
			Static426.method6794(local94, local110, local21, arg5);
			Static426.method6794(local27, local110, local103, arg5);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)V")
	public static void method4477(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub4_Sub6 local14 = Static367.method6025(8, arg0);
		local14.method1896();
	}
}
