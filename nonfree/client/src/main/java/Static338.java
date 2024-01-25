import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mba", name = "mh", descriptor = "[[[Lclient!dn;")
	public static Class77[][][] aClass77ArrayArrayArray3;

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IIII)Lclient!cs;")
	public static Class4_Sub1_Sub2_Sub1 method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class77 local11 = Static330.aClass77ArrayArrayArray2[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class4_Sub1_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(31) Class128 local31 = local11.aClass128_1; local31 != null; local31 = local31.aClass128_2) {
			@Pc(35) Class4_Sub1_Sub2 local35 = local31.aClass4_Sub1_Sub2_1;
			if (local35 instanceof Class4_Sub1_Sub2_Sub1) {
				@Pc(41) Class4_Sub1_Sub2_Sub1 local41 = (Class4_Sub1_Sub2_Sub1) local35;
				@Pc(51) int local51 = (local41.method5059() - 1) * 256 + 252;
				@Pc(59) int local59 = local41.anInt8916 - local51 >> 9;
				@Pc(67) int local67 = local41.anInt8911 - local51 >> 9;
				@Pc(74) int local74 = local51 + local41.anInt8916 >> 9;
				@Pc(81) int local81 = local51 + local41.anInt8911 >> 9;
				if (arg0 >= local59 && arg2 >= local67 && local74 >= arg0 && local81 >= arg2) {
					@Pc(110) int local110 = (local81 + 1 - arg2) * (local74 + 1 - arg0);
					if (local19 < local110) {
						local19 = local110;
						local17 = local41;
					}
				}
			}
		}
		return local17;
	}
}
