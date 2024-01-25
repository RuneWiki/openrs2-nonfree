import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ul", name = "W", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!ul", name = "S", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_246 = new Class56(53, -2);

	@OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
	public static int anInt6935 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	public static void method5568(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(16, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(CB)Z")
	public static boolean method5572(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static55.aCharArray1;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
	public static void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static249.method6044(Static267.anIntArrayArray50[arg1], arg3, arg0 + arg2, -arg0 + arg2);
		while (local7 < local9) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(50) int[] local50 = Static267.anIntArrayArray50[local9 + arg1];
				@Pc(57) int[] local57 = Static267.anIntArrayArray50[arg1 - local9];
				@Pc(62) int local62 = arg2 + local7;
				@Pc(67) int local67 = arg2 - local7;
				Static249.method6044(local50, arg3, local62, local67);
				Static249.method6044(local57, arg3, local62, local67);
			}
			@Pc(83) int local83 = arg2 + local9;
			@Pc(87) int local87 = arg2 - local9;
			@Pc(93) int[] local93 = Static267.anIntArrayArray50[local7 + arg1];
			@Pc(99) int[] local99 = Static267.anIntArrayArray50[arg1 - local7];
			Static249.method6044(local93, arg3, local83, local87);
			Static249.method6044(local99, arg3, local83, local87);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)I")
	public static int method5574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
