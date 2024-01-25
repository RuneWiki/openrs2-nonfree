import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public static void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(21) int local21 = -arg1;
		Static491.method7219(Static249.anIntArrayArray23[arg3], arg0 - arg1, arg2, arg0 + arg1);
		@Pc(37) int local37 = -1;
		while (local7 < local9) {
			local37 += 2;
			local7++;
			local21 += local37;
			if (local21 >= 0) {
				local9--;
				local21 -= local9 << 1;
				@Pc(60) int[] local60 = Static249.anIntArrayArray23[arg3 + local9];
				@Pc(66) int[] local66 = Static249.anIntArrayArray23[arg3 - local9];
				@Pc(70) int local70 = arg0 + local7;
				@Pc(74) int local74 = arg0 - local7;
				Static491.method7219(local60, local74, arg2, local70);
				Static491.method7219(local66, local74, arg2, local70);
			}
			@Pc(90) int local90 = local9 + arg0;
			@Pc(95) int local95 = arg0 - local9;
			@Pc(101) int[] local101 = Static249.anIntArrayArray23[local7 + arg3];
			@Pc(108) int[] local108 = Static249.anIntArrayArray23[arg3 - local7];
			Static491.method7219(local101, local95, arg2, local90);
			Static491.method7219(local108, local95, arg2, local90);
		}
	}
}
