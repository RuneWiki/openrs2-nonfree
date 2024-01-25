import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!uda", name = "C", descriptor = "Lclient!pq;")
	public static Class251 aClass251_142;

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "Lclient!pq;")
	public static Class251 aClass251_143;

	@OriginalMember(owner = "client!uda", name = "J", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_180 = new Class40(8, 16);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method7039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg4[local26] = (byte) (arg4[local26] - arg2[arg5++]);
				@Pc(39) int local39 = arg7++;
				arg4[local39] = (byte) (arg4[local39] - arg2[arg5++]);
				@Pc(52) int local52 = arg7++;
				arg4[local52] = (byte) (arg4[local52] - arg2[arg5++]);
				@Pc(65) int local65 = arg7++;
				arg4[local65] = (byte) (arg4[local65] - arg2[arg5++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg7++;
				arg4[local26] = (byte) (arg4[local26] - arg2[arg5++]);
			}
			arg5 += arg1;
			arg7 += arg3;
		}
	}
}
