import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[B[BIIIIBI)V")
	public static void method824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg4++;
				arg2[local26] = (byte) (arg2[local26] - arg1[arg0++]);
				@Pc(39) int local39 = arg4++;
				arg2[local39] = (byte) (arg2[local39] - arg1[arg0++]);
				@Pc(52) int local52 = arg4++;
				arg2[local52] = (byte) (arg2[local52] - arg1[arg0++]);
				@Pc(65) int local65 = arg4++;
				arg2[local65] = (byte) (arg2[local65] - arg1[arg0++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg4++;
				arg2[local26] = (byte) (arg2[local26] - arg1[arg0++]);
			}
			arg0 += arg3;
			arg4 += arg6;
		}
	}
}
