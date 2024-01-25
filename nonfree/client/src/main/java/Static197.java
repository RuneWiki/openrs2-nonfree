import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "Lclient!fu;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII[BII[B)V")
	public static void method3494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg5 >> 2);
		@Pc(20) int local20 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg6; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg0++;
				arg4[local31] = (byte) (arg4[local31] - arg7[arg3++]);
				@Pc(44) int local44 = arg0++;
				arg4[local44] = (byte) (arg4[local44] - arg7[arg3++]);
				@Pc(57) int local57 = arg0++;
				arg4[local57] = (byte) (arg4[local57] - arg7[arg3++]);
				@Pc(70) int local70 = arg0++;
				arg4[local70] = (byte) (arg4[local70] - arg7[arg3++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg0++;
				arg4[local31] = (byte) (arg4[local31] - arg7[arg3++]);
			}
			arg3 += arg2;
			arg0 += arg1;
		}
	}
}
