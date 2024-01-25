import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method7902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg0 >> 2);
		@Pc(13) int local13 = -(arg0 & 0x3);
		for (@Pc(16) int local16 = -arg6; local16 < 0; local16++) {
			@Pc(26) int local26;
			for (@Pc(23) int local23 = local8; local23 < 0; local23++) {
				local26 = arg5++;
				arg4[local26] = (byte) (arg4[local26] - arg2[arg1++]);
				@Pc(39) int local39 = arg5++;
				arg4[local39] = (byte) (arg4[local39] - arg2[arg1++]);
				@Pc(52) int local52 = arg5++;
				arg4[local52] = (byte) (arg4[local52] - arg2[arg1++]);
				@Pc(65) int local65 = arg5++;
				arg4[local65] = (byte) (arg4[local65] - arg2[arg1++]);
			}
			for (@Pc(81) int local81 = local13; local81 < 0; local81++) {
				local26 = arg5++;
				arg4[local26] = (byte) (arg4[local26] - arg2[arg1++]);
			}
			arg5 += arg3;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)I")
	public static int method7903(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local19 >> 12) + 40960;
		return local13 * local35 >> 12;
	}
}
