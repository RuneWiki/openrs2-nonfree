import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_6 = new Class286("", 10);

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[6][];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
	public static void method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static519.anInt8267 < arg1 || Static617.anInt9501 > arg0) {
			return;
		}
		@Pc(38) boolean local38;
		if (Static8.anInt99 > arg4) {
			local38 = false;
			arg4 = Static8.anInt99;
		} else if (arg4 <= Static14.anInt206) {
			local38 = true;
		} else {
			local38 = false;
			arg4 = Static14.anInt206;
		}
		@Pc(64) boolean local64;
		if (Static8.anInt99 > arg2) {
			arg2 = Static8.anInt99;
			local64 = false;
		} else if (Static14.anInt206 >= arg2) {
			local64 = true;
		} else {
			arg2 = Static14.anInt206;
			local64 = false;
		}
		if (arg1 < Static617.anInt9501) {
			arg1 = Static617.anInt9501;
		} else {
			Static494.method7075(arg4, arg3, arg2, Static449.anIntArrayArray48[arg1++], 18601);
		}
		if (Static519.anInt8267 >= arg0) {
			Static494.method7075(arg4, arg3, arg2, Static449.anIntArrayArray48[arg0--], 18601);
		} else {
			arg0 = Static519.anInt8267;
		}
		@Pc(128) int local128;
		if (local38 && local64) {
			for (local128 = arg1; local128 <= arg0; local128++) {
				@Pc(186) int[] local186 = Static449.anIntArrayArray48[local128];
				local186[arg4] = local186[arg2] = arg3;
			}
		} else if (local38) {
			for (local128 = arg1; local128 <= arg0; local128++) {
				Static449.anIntArrayArray48[local128][arg4] = arg3;
			}
		} else if (local64) {
			for (local128 = arg1; local128 <= arg0; local128++) {
				Static449.anIntArrayArray48[local128][arg2] = arg3;
			}
		}
	}
}
