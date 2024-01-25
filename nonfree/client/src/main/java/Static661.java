import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Z")
	public static boolean method9148() {
		return Static513.method7491("jaclib") ? Static513.method7491("hw3d") : false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method9152() {
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0 && Static240.anInt3974 != Static559.anInt9430) {
			Static286.method4303(Static353.anInt6205, false, 11, Static128.anInt6986);
		} else {
			Static182.method2665(Static457.aClass57_11);
			if (Static240.anInt3974 != Static119.anInt1890) {
				Static251.method3706();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIBI)V")
	public static void method9155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		Static646.method7025(Static569.anIntArrayArray54[arg2], arg3 - arg0, arg3 + arg0, arg1);
		while (local9 > local7) {
			local19 += 2;
			local7++;
			local17 += local19;
			if (local17 >= 0) {
				local9--;
				local17 -= local9 << 1;
				@Pc(54) int[] local54 = Static569.anIntArrayArray54[local9 + arg2];
				@Pc(60) int[] local60 = Static569.anIntArrayArray54[arg2 - local9];
				@Pc(65) int local65 = arg3 + local7;
				@Pc(70) int local70 = arg3 - local7;
				Static646.method7025(local54, local70, local65, arg1);
				Static646.method7025(local60, local70, local65, arg1);
			}
			@Pc(87) int local87 = arg3 + local9;
			@Pc(91) int local91 = arg3 - local9;
			@Pc(97) int[] local97 = Static569.anIntArrayArray54[local7 + arg2];
			@Pc(104) int[] local104 = Static569.anIntArrayArray54[arg2 - local7];
			Static646.method7025(local97, local91, local87, arg1);
			Static646.method7025(local104, local91, local87, arg1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public static void method9156() {
		Static547.anIntArray522 = Static6.method93(0.4F);
	}
}
