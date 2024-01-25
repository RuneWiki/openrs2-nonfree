import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 + arg5;
		@Pc(13) int local13 = arg3 - arg2;
		for (@Pc(15) int local15 = arg5; local15 < local9; local15++) {
			Static306.method5239(Static46.anIntArrayArray4[local15], arg4, arg1, arg0);
		}
		@Pc(38) int local38 = arg4 - arg2;
		@Pc(43) int local43 = arg0 + arg2;
		for (@Pc(45) int local45 = arg3; local45 > local13; local45--) {
			Static306.method5239(Static46.anIntArrayArray4[local45], arg4, arg1, arg0);
		}
		for (@Pc(63) int local63 = local9; local63 <= local13; local63++) {
			@Pc(69) int[] local69 = Static46.anIntArrayArray4[local63];
			Static306.method5239(local69, local43, arg1, arg0);
			Static306.method5239(local69, arg4, arg1, local38);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)Z")
	public static boolean method3117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static368.aBoolean505) {
			return false;
		} else if (Static192.anInt3745 < 100) {
			return false;
		} else if (Static181.method3235(arg2, arg0, arg3)) {
			@Pc(26) int local26 = arg3 << Static145.anInt3093;
			@Pc(30) int local30 = arg2 << Static145.anInt3093;
			if (Static60.method1008(Static279.anInt5708, Static499.aClass83Array3[arg0].method7217(arg2, arg3), local30, arg1, Static279.anInt5708, local26)) {
				Static561.anInt5883++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
