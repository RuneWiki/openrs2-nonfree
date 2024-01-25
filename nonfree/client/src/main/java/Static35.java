import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([BIIZ[BIIII)V")
	public static void method600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(19) int local19 = -(arg7 & 0x3);
		for (@Pc(22) int local22 = -arg5; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg6++;
				arg0[local30] = (byte) (arg0[local30] - arg3[arg2++]);
				@Pc(43) int local43 = arg6++;
				arg0[local43] = (byte) (arg0[local43] - arg3[arg2++]);
				@Pc(56) int local56 = arg6++;
				arg0[local56] = (byte) (arg0[local56] - arg3[arg2++]);
				@Pc(69) int local69 = arg6++;
				arg0[local69] = (byte) (arg0[local69] - arg3[arg2++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg6++;
				arg0[local30] = (byte) (arg0[local30] - arg3[arg2++]);
			}
			arg6 += arg4;
			arg2 += arg1;
		}
	}
}
