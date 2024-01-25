import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_7 = new Class316(67, 3);

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_7 = new Class98(54, 3);

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!kh;")
	public static final Class172 aClass172_5 = new Class172();

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([B[[BI[I[[BI[IZ)I")
	public static int method362(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		@Pc(9) int local9 = arg3[arg2];
		@Pc(15) int local15 = local9 + arg6[arg2];
		@Pc(19) int local19 = arg3[arg5];
		@Pc(25) int local25 = arg6[arg5] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg0[arg2] & 0xFF;
		if (local49 > (arg0[arg5] & 0xFF)) {
			local49 = arg0[arg5] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg1[arg2];
		@Pc(74) byte[] local74 = arg4[arg5];
		@Pc(79) int local79 = local27 - local9;
		@Pc(89) int local89 = local27 - local19;
		for (@Pc(91) int local91 = local27; local91 < local34; local91++) {
			@Pc(103) int local103 = local74[local89++] + local70[local79++];
			if (local103 < local49) {
				local49 = local103;
			}
		}
		return -local49;
	}
}
