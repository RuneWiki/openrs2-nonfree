import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!oha", name = "q", descriptor = "[I")
	public static final int[] anIntArray429 = new int[13];

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!oha", name = "t", descriptor = "Lclient!rg;")
	public static final Class293 aClass293_7 = new Class293();

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIZI[BI[B)V")
	public static void method6320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg3++;
				arg5[local39] = (byte) (arg5[local39] - arg7[arg4++]);
				@Pc(52) int local52 = arg3++;
				arg5[local52] = (byte) (arg5[local52] - arg7[arg4++]);
				@Pc(65) int local65 = arg3++;
				arg5[local65] = (byte) (arg5[local65] - arg7[arg4++]);
				@Pc(78) int local78 = arg3++;
				arg5[local78] = (byte) (arg5[local78] - arg7[arg4++]);
			}
			for (@Pc(94) int local94 = local15; local94 < 0; local94++) {
				local39 = arg3++;
				arg5[local39] = (byte) (arg5[local39] - arg7[arg4++]);
			}
			arg4 += arg1;
			arg3 += arg6;
		}
	}
}
