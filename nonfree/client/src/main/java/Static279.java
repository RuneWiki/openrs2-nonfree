import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!vp;")
	public static Class309 aClass309_6 = null;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII[B[B)V")
	public static void method4749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(8) int local8 = -(arg2 >> 2);
		@Pc(13) int local13 = -(arg2 & 0x3);
		for (@Pc(20) int local20 = -arg1; local20 < 0; local20++) {
			@Pc(26) int local26;
			for (@Pc(23) int local23 = local8; local23 < 0; local23++) {
				local26 = arg4++;
				arg6[local26] = (byte) (arg6[local26] - arg7[arg3++]);
				@Pc(39) int local39 = arg4++;
				arg6[local39] = (byte) (arg6[local39] - arg7[arg3++]);
				@Pc(52) int local52 = arg4++;
				arg6[local52] = (byte) (arg6[local52] - arg7[arg3++]);
				@Pc(65) int local65 = arg4++;
				arg6[local65] = (byte) (arg6[local65] - arg7[arg3++]);
			}
			for (@Pc(81) int local81 = local13; local81 < 0; local81++) {
				local26 = arg4++;
				arg6[local26] = (byte) (arg6[local26] - arg7[arg3++]);
			}
			arg3 += arg5;
			arg4 += arg0;
		}
	}
}
