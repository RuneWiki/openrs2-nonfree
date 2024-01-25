import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIIII)V")
	public static void method5178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		Static337.method5150(arg2 + arg3, arg1, arg3 - arg2, Static176.anIntArrayArray28[arg0]);
		@Pc(31) int local31 = -1;
		while (local11 < local13) {
			local31 += 2;
			local16 += local31;
			local11++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(54) int[] local54 = Static176.anIntArrayArray28[arg0 + local13];
				@Pc(61) int[] local61 = Static176.anIntArrayArray28[arg0 - local13];
				@Pc(65) int local65 = arg3 + local11;
				@Pc(70) int local70 = arg3 - local11;
				Static337.method5150(local65, arg1, local70, local54);
				Static337.method5150(local65, arg1, local70, local61);
			}
			@Pc(86) int local86 = local13 + arg3;
			@Pc(91) int local91 = arg3 - local13;
			@Pc(97) int[] local97 = Static176.anIntArrayArray28[local11 + arg0];
			@Pc(104) int[] local104 = Static176.anIntArrayArray28[arg0 - local11];
			Static337.method5150(local86, arg1, local91, local97);
			Static337.method5150(local86, arg1, local91, local104);
		}
	}
}
