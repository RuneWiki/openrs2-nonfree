import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
	public static int[] anIntArray784;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_133 = new Class45("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "[I")
	public static final int[] anIntArray785 = new int[32];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)I")
	public static int method7832(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI[BIII[B)V")
	public static void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg3[local26] = (byte) (arg3[local26] - arg7[arg1++]);
				@Pc(39) int local39 = arg0++;
				arg3[local39] = (byte) (arg3[local39] - arg7[arg1++]);
				@Pc(52) int local52 = arg0++;
				arg3[local52] = (byte) (arg3[local52] - arg7[arg1++]);
				@Pc(65) int local65 = arg0++;
				arg3[local65] = (byte) (arg3[local65] - arg7[arg1++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg0++;
				arg3[local26] = (byte) (arg3[local26] - arg7[arg1++]);
			}
			arg1 += arg4;
			arg0 += arg5;
		}
	}
}
