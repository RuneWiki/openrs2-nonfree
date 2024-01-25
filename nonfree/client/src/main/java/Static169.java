import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public static int anInt2875;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIII[BIIZ)V")
	public static void method2495(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(23) int local23 = -(arg1 >> 2);
		@Pc(28) int local28 = -(arg1 & 0x3);
		for (@Pc(31) int local31 = -arg6; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg4++;
				arg5[local39] = (byte) (arg5[local39] - arg0[arg2++]);
				@Pc(52) int local52 = arg4++;
				arg5[local52] = (byte) (arg5[local52] - arg0[arg2++]);
				@Pc(65) int local65 = arg4++;
				arg5[local65] = (byte) (arg5[local65] - arg0[arg2++]);
				@Pc(78) int local78 = arg4++;
				arg5[local78] = (byte) (arg5[local78] - arg0[arg2++]);
			}
			for (@Pc(97) int local97 = local28; local97 < 0; local97++) {
				local39 = arg4++;
				arg5[local39] = (byte) (arg5[local39] - arg0[arg2++]);
			}
			arg2 += arg3;
			arg4 += arg7;
		}
	}
}
