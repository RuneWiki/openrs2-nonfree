import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_346 = Static64.method1101(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	public static void method835(@OriginalArg(1) int arg0) {
		Static87.anInt2015 = arg0;
		Static41.anInt977 = -1;
		Static155.anInt3422 = -1;
		Static220.method3635();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public static void method837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static122.anInt2710 || Static225.anInt4729 > arg0) {
			return;
		}
		@Pc(31) boolean local31;
		if (Static160.anInt3454 > arg4) {
			local31 = false;
			arg4 = Static160.anInt3454;
		} else if (Static149.anInt3252 >= arg4) {
			local31 = true;
		} else {
			local31 = false;
			arg4 = Static149.anInt3252;
		}
		@Pc(55) boolean local55;
		if (Static160.anInt3454 > arg1) {
			arg1 = Static160.anInt3454;
			local55 = false;
		} else if (arg1 <= Static149.anInt3252) {
			local55 = true;
		} else {
			local55 = false;
			arg1 = Static149.anInt3252;
		}
		if (arg3 >= Static225.anInt4729) {
			Static71.method1261(Static113.anIntArrayArray10[arg3++], arg4, arg2, arg1);
		} else {
			arg3 = Static225.anInt4729;
		}
		if (arg0 <= Static122.anInt2710) {
			Static71.method1261(Static113.anIntArrayArray10[arg0--], arg4, arg2, arg1);
		} else {
			arg0 = Static122.anInt2710;
		}
		@Pc(105) int local105;
		if (local31 && local55) {
			for (local105 = arg3; local105 <= arg0; local105++) {
				@Pc(111) int[] local111 = Static113.anIntArrayArray10[local105];
				local111[arg4] = local111[arg1] = arg2;
			}
		} else if (local31) {
			for (local105 = arg3; local105 <= arg0; local105++) {
				Static113.anIntArrayArray10[local105][arg4] = arg2;
			}
		} else if (local55) {
			for (local105 = arg3; local105 <= arg0; local105++) {
				Static113.anIntArrayArray10[local105][arg1] = arg2;
			}
		}
	}
}
