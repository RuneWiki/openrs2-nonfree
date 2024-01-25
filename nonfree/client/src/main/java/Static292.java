import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "[I")
	public static final int[] anIntArray365 = new int[32];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static489.method6853(arg6, Static326.anInt6028, Static80.anInt1738);
		@Pc(17) int local17 = Static489.method6853(arg1, Static326.anInt6028, Static80.anInt1738);
		@Pc(25) int local25 = Static489.method6853(arg4, Static553.anInt9074, Static249.anInt4668);
		@Pc(31) int local31 = Static489.method6853(arg2, Static553.anInt9074, Static249.anInt4668);
		@Pc(40) int local40 = Static489.method6853(arg6 + arg3, Static326.anInt6028, Static80.anInt1738);
		@Pc(48) int local48 = Static489.method6853(arg1 - arg3, Static326.anInt6028, Static80.anInt1738);
		for (@Pc(50) int local50 = local11; local50 < local40; local50++) {
			Static276.method3099(local25, Static582.anIntArrayArray69[local50], arg5, local31);
		}
		for (@Pc(70) int local70 = local17; local70 > local48; local70--) {
			Static276.method3099(local25, Static582.anIntArrayArray69[local70], arg5, local31);
		}
		@Pc(92) int local92 = Static489.method6853(arg3 + arg4, Static553.anInt9074, Static249.anInt4668);
		@Pc(105) int local105 = Static489.method6853(arg2 - arg3, Static553.anInt9074, Static249.anInt4668);
		for (@Pc(107) int local107 = local40; local107 <= local48; local107++) {
			@Pc(113) int[] local113 = Static582.anIntArrayArray69[local107];
			Static276.method3099(local25, local113, arg5, local92);
			Static276.method3099(local92, local113, arg0, local105);
			Static276.method3099(local105, local113, arg5, local31);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	public static void method4380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static451.method310(local7.aClass6_Sub1_Sub5_1);
		Static451.method310(local7.aClass6_Sub1_Sub5_2);
		if (local7.aClass6_Sub1_Sub5_1 != null) {
			local7.aClass6_Sub1_Sub5_1 = null;
		}
		if (local7.aClass6_Sub1_Sub5_2 != null) {
			local7.aClass6_Sub1_Sub5_2 = null;
		}
	}
}
