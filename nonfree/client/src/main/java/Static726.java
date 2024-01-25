import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static726 {

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "J")
	public static long aLong344;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public static void method9589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 >= -12) {
			aLong344 = 49L;
		}
		@Pc(18) int local18 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg6);
		@Pc(24) int local24 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg5);
		@Pc(30) int local30 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4);
		@Pc(36) int local36 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1);
		@Pc(44) int local44 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg6 + arg3);
		@Pc(53) int local53 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg5 - arg3);
		for (@Pc(55) int local55 = local18; local55 < local44; local55++) {
			Static202.method3077(Static118.anIntArrayArray7[local55], local30, arg0, local36);
		}
		for (@Pc(77) int local77 = local24; local77 > local53; local77--) {
			Static202.method3077(Static118.anIntArrayArray7[local77], local30, arg0, local36);
		}
		@Pc(103) int local103 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4 + arg3);
		@Pc(112) int local112 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg1 - arg3);
		for (@Pc(114) int local114 = local44; local114 <= local53; local114++) {
			@Pc(122) int[] local122 = Static118.anIntArrayArray7[local114];
			Static202.method3077(local122, local30, arg0, local103);
			Static202.method3077(local122, local112, arg0, local36);
		}
	}
}
