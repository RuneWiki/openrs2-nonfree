import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIB)Lclient!li;")
	public static Class41_Sub1_Sub1_Sub3 method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class313 local11 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class41_Sub1_Sub1_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class40 local22 = local11.aClass40_3; local22 != null; local22 = local22.aClass40_1) {
			@Pc(26) Class41_Sub1_Sub1 local26 = local22.aClass41_Sub1_Sub1_1;
			if (local26 instanceof Class41_Sub1_Sub1_Sub3) {
				@Pc(32) Class41_Sub1_Sub1_Sub3 local32 = (Class41_Sub1_Sub1_Sub3) local26;
				@Pc(42) int local42 = local32.method7917() * 256 + 252 - 256;
				@Pc(49) int local49 = local32.anInt10366 - local42 >> 9;
				@Pc(57) int local57 = local32.anInt10367 - local42 >> 9;
				@Pc(64) int local64 = local42 + local32.anInt10366 >> 9;
				@Pc(71) int local71 = local42 + local32.anInt10367 >> 9;
				if (local49 <= arg1 && local57 <= arg2 && local64 >= arg1 && local71 >= arg2) {
					@Pc(105) int local105 = (local64 + 1 - arg1) * (-arg2 + 1 + local71);
					if (local19 < local105) {
						local19 = local105;
						local17 = local32;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIZII)V")
	public static void method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static224.anInt3582 = arg2;
		Static620.anInt9983 = arg0;
		Static509.anInt5961 = arg1;
		Static83.anInt1418 = arg4;
		Static554.anInt3891 = arg3;
		Static616.anInt9927 = arg5;
	}
}
