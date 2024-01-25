import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!kr;")
	public static Class171 aClass171_78;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_29 = new Class313(10);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BI[III[[B[[B[I)I")
	public static int method4065(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg3];
		@Pc(15) int local15 = arg2[arg3] + local9;
		@Pc(19) int local19 = arg6[arg1];
		@Pc(25) int local25 = arg2[arg1] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg0[arg3] & 0xFF;
		if (local45 > (arg0[arg1] & 0xFF)) {
			local45 = arg0[arg1] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg5[arg3];
		@Pc(70) byte[] local70 = arg4[arg1];
		@Pc(74) int local74 = local27 - local9;
		@Pc(79) int local79 = local27 - local19;
		for (@Pc(81) int local81 = local27; local81 < local34; local81++) {
			@Pc(93) int local93 = local66[local74++] + local70[local79++];
			if (local93 < local45) {
				local45 = local93;
			}
		}
		return -local45;
	}
}
