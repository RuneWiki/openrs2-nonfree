import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "J")
	public static long aLong414;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public static int anInt9371;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method7749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(15) int local15 = -(arg3 >> 2);
		@Pc(20) int local20 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg1; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg0++;
				arg4[local31] = (byte) (arg4[local31] - arg2[arg5++]);
				@Pc(44) int local44 = arg0++;
				arg4[local44] = (byte) (arg4[local44] - arg2[arg5++]);
				@Pc(57) int local57 = arg0++;
				arg4[local57] = (byte) (arg4[local57] - arg2[arg5++]);
				@Pc(70) int local70 = arg0++;
				arg4[local70] = (byte) (arg4[local70] - arg2[arg5++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg0++;
				arg4[local31] = (byte) (arg4[local31] - arg2[arg5++]);
			}
			arg0 += arg7;
			arg5 += arg6;
		}
	}
}
