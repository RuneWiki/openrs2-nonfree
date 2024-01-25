import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public static int anInt3780;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[8];

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	public static int anInt3785 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([BII[BIIIII)V")
	public static void method3336(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg1++;
				arg0[local31] = (byte) (arg0[local31] - arg2[arg7++]);
				@Pc(44) int local44 = arg1++;
				arg0[local44] = (byte) (arg0[local44] - arg2[arg7++]);
				@Pc(57) int local57 = arg1++;
				arg0[local57] = (byte) (arg0[local57] - arg2[arg7++]);
				@Pc(70) int local70 = arg1++;
				arg0[local70] = (byte) (arg0[local70] - arg2[arg7++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg1++;
				arg0[local31] = (byte) (arg0[local31] - arg2[arg7++]);
			}
			arg1 += arg6;
			arg7 += arg5;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
	public static boolean method3337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static381.method5974(arg1, arg0) || Static342.method5379(arg1, arg0);
	}
}
