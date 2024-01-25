import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIII)V")
	public static void method3729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg2);
		@Pc(28) int local28 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg4);
		@Pc(34) int local34 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1);
		@Pc(40) int local40 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg0);
		@Pc(48) int local48 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg3 + arg2);
		@Pc(57) int local57 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg4 - arg3);
		for (@Pc(59) int local59 = local22; local59 < local48; local59++) {
			Static583.method7816(Static158.anIntArrayArray66[local59], arg5, local34, local40);
		}
		for (@Pc(79) int local79 = local28; local79 > local57; local79--) {
			Static583.method7816(Static158.anIntArrayArray66[local79], arg5, local34, local40);
		}
		@Pc(108) int local108 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 + arg3);
		@Pc(117) int local117 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg0 - arg3);
		for (@Pc(119) int local119 = local48; local119 <= local57; local119++) {
			@Pc(125) int[] local125 = Static158.anIntArrayArray66[local119];
			Static583.method7816(local125, arg5, local34, local108);
			Static583.method7816(local125, arg5, local117, local40);
		}
	}
}
