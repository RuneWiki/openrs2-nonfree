import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "[I")
	public static final int[] anIntArray558 = new int[3];

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)Lclient!ol;")
	public static Class25_Sub2_Sub2_Sub5 method7564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class333 local11 = Static189.aClass333ArrayArrayArray1[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(29) Class25_Sub2_Sub2_Sub5 local29 = null;
		@Pc(31) int local31 = -1;
		for (@Pc(34) Class147 local34 = local11.aClass147_3; local34 != null; local34 = local34.aClass147_2) {
			@Pc(38) Class25_Sub2_Sub2 local38 = local34.aClass25_Sub2_Sub2_1;
			if (local38 instanceof Class25_Sub2_Sub2_Sub5) {
				@Pc(44) Class25_Sub2_Sub2_Sub5 local44 = (Class25_Sub2_Sub2_Sub5) local38;
				@Pc(54) int local54 = local44.method6668() * 256 + 252 - 256;
				@Pc(62) int local62 = local44.anInt8476 - local54 >> 9;
				@Pc(70) int local70 = local44.anInt8482 - local54 >> 9;
				@Pc(77) int local77 = local54 + local44.anInt8476 >> 9;
				@Pc(85) int local85 = local44.anInt8482 + local54 >> 9;
				if (arg1 >= local62 && arg0 >= local70 && arg1 <= local77 && arg0 <= local85) {
					@Pc(114) int local114 = (local77 + 1 - arg1) * (local85 - (-1 - -arg0));
					if (local114 > local31) {
						local31 = local114;
						local29 = local44;
					}
				}
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)I")
	public static int method7566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg2;
			arg2 = arg1;
			arg1 = local14;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return arg3;
		} else if (local7 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return 1 + 7 - arg1 - arg3;
		}
	}
}
