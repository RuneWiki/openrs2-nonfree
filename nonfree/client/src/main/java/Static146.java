import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array6;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
	public static final int[] anIntArray179 = new int[1000];

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	public static int anInt3560 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBIII[B[BI)V")
	public static void method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg6[arg7++]);
				@Pc(44) int local44 = arg4++;
				arg5[local44] = (byte) (arg5[local44] - arg6[arg7++]);
				@Pc(57) int local57 = arg4++;
				arg5[local57] = (byte) (arg5[local57] - arg6[arg7++]);
				@Pc(70) int local70 = arg4++;
				arg5[local70] = (byte) (arg5[local70] - arg6[arg7++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg4++;
				arg5[local31] = (byte) (arg5[local31] - arg6[arg7++]);
			}
			arg4 += arg0;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method3246() {
		Static542.anInt9759 = -1;
		Static339.anInt6841 = -1;
		Static566.anInt10156 = 0;
	}
}
