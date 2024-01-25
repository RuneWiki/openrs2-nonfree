import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
	public static int anInt4303 = 0;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II[BIIB[BII)V")
	public static void method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg0 >> 2);
		@Pc(20) int local20 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg2[arg6++]);
				@Pc(44) int local44 = arg4++;
				arg5[local44] = (byte) (arg5[local44] - arg2[arg6++]);
				@Pc(57) int local57 = arg4++;
				arg5[local57] = (byte) (arg5[local57] - arg2[arg6++]);
				@Pc(70) int local70 = arg4++;
				arg5[local70] = (byte) (arg5[local70] - arg2[arg6++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg2[arg6++]);
			}
			arg6 += arg3;
			arg4 += arg1;
		}
	}
}
