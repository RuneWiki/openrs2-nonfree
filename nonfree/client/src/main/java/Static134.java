import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
	public static int anInt5655;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
	public static int anInt5645 = 0;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
	public static int anInt5649 = 20;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	public static int anInt5656 = 0;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	public static int anInt5660 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static197.anIntArrayArrayArray11[arg0][local16][local20] == -Static186.anInt3555) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static24.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5;
			if (!Static154.method2639(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static154.method2639(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static154.method2639(local16, local156, local182)) {
				return false;
			} else if (Static154.method2639(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static12.method165(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static154.method2639(local16 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5, local20 + 1) && Static154.method2639(local16 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static154.method2639(local16 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static154.method2639(local16 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLclient!nk;)Lclient!pa;")
	public static Class1_Sub2_Sub1 method4726(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return Static31.method501(arg1, arg0) ? Static289.method4413() : null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V")
	public static void method4727(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 7);
		local8.method2873();
	}
}
