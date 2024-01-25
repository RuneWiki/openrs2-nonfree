import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_37 = new Class359(128, 4);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt5026 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIZI)V")
	public static void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static367.method5559(-7, arg3 - arg1, arg0, Static36.anIntArrayArray4[arg2], arg3 + arg1);
		@Pc(35) int local35 = -1;
		while (local9 > local7) {
			local35 += 2;
			local12 += local35;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(62) int[] local62 = Static36.anIntArrayArray4[arg2 + local9];
				@Pc(68) int[] local68 = Static36.anIntArrayArray4[arg2 - local9];
				@Pc(72) int local72 = local7 + arg3;
				@Pc(77) int local77 = arg3 - local7;
				Static367.method5559(-7, local77, arg0, local62, local72);
				Static367.method5559(-7, local77, arg0, local68, local72);
			}
			@Pc(93) int local93 = local9 + arg3;
			@Pc(97) int local97 = arg3 - local9;
			@Pc(103) int[] local103 = Static36.anIntArrayArray4[local7 + arg2];
			@Pc(110) int[] local110 = Static36.anIntArrayArray4[arg2 - local7];
			Static367.method5559(-7, local97, arg0, local103, local93);
			Static367.method5559(-7, local97, arg0, local110, local93);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!vo;)Lclient!vo;")
	public static Class381 method4536(@OriginalArg(1) Class381 arg0) {
		if (arg0.anInt10079 != -1) {
			return Static69.method899(arg0.anInt10079);
		}
		@Pc(21) int local21 = arg0.anInt10089 >>> 16;
		@Pc(33) Class289 local33 = new Class289(Static477.aClass74_31);
		for (@Pc(38) Class6_Sub25 local38 = (Class6_Sub25) local33.method7032(); local38 != null; local38 = (Class6_Sub25) local33.method7033()) {
			if (local21 == local38.anInt5007) {
				return Static69.method899((int) local38.aLong346);
			}
		}
		return null;
	}
}
