import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	public static int anInt5575;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_48 = new Class156();

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public static int anInt5583 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public static void method4427(@OriginalArg(0) int arg0) {
		Static162.anInt2742 = 3;
		Static47.anInt838 = -1;
		Static237.anInt3819 = 100;
		Static120.anInt2210 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 > Static155.anInt2670 || arg1 < Static219.anInt6125) {
			return;
		}
		@Pc(22) boolean local22;
		if (Static317.anInt6670 > arg4) {
			arg4 = Static317.anInt6670;
			local22 = false;
		} else if (Static215.anInt3546 < arg4) {
			local22 = false;
			arg4 = Static215.anInt3546;
		} else {
			local22 = true;
		}
		@Pc(40) boolean local40;
		if (arg3 < Static317.anInt6670) {
			local40 = false;
			arg3 = Static317.anInt6670;
		} else if (arg3 <= Static215.anInt3546) {
			local40 = true;
		} else {
			local40 = false;
			arg3 = Static215.anInt3546;
		}
		if (arg2 < Static219.anInt6125) {
			arg2 = Static219.anInt6125;
		} else {
			Static216.method2862(arg4, arg3, arg0, Static229.anIntArrayArray26[arg2++]);
		}
		if (arg1 > Static155.anInt2670) {
			arg1 = Static155.anInt2670;
		} else {
			Static216.method2862(arg4, arg3, arg0, Static229.anIntArrayArray26[arg1--]);
		}
		@Pc(105) int local105;
		if (local22 && local40) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				@Pc(147) int[] local147 = Static229.anIntArrayArray26[local105];
				local147[arg4] = local147[arg3] = arg0;
			}
		} else if (local22) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				Static229.anIntArrayArray26[local105][arg4] = arg0;
			}
		} else if (local40) {
			for (local105 = arg2; local105 <= arg1; local105++) {
				Static229.anIntArrayArray26[local105][arg3] = arg0;
			}
		}
	}
}
