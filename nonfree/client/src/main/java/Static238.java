import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
	public static int anInt4825 = -1;

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "[I")
	public static int[] anIntArray528 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "[J")
	public static long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
	public static int anInt4830 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
	public static void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg1, 5);
		local8.method971();
		local8.anInt1132 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
	public static void method4038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 + 1;
		Static235.method3988(arg0, Static129.anIntArrayArray40[arg4], arg3, arg2);
		@Pc(18) int local18 = arg1 - 1;
		Static235.method3988(arg0, Static129.anIntArrayArray40[arg1], arg3, arg2);
		for (@Pc(25) int local25 = local9; local25 <= local18; local25++) {
			@Pc(32) int[] local32 = Static129.anIntArrayArray40[local25];
			local32[arg2] = local32[arg3] = arg0;
		}
	}
}
