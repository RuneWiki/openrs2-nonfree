import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_59 = new Class303(29, 6);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIZ[BI[BI)V")
	public static void method4372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg7 >> 2);
		@Pc(20) int local20 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg2++;
				arg6[local31] = (byte) (arg6[local31] - arg4[arg0++]);
				@Pc(44) int local44 = arg2++;
				arg6[local44] = (byte) (arg6[local44] - arg4[arg0++]);
				@Pc(57) int local57 = arg2++;
				arg6[local57] = (byte) (arg6[local57] - arg4[arg0++]);
				@Pc(70) int local70 = arg2++;
				arg6[local70] = (byte) (arg6[local70] - arg4[arg0++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg2++;
				arg6[local31] = (byte) (arg6[local31] - arg4[arg0++]);
			}
			arg0 += arg1;
			arg2 += arg5;
		}
	}
}
