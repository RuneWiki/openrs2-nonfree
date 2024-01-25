import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tia", name = "w", descriptor = "Lclient!aj;")
	public static Class15 aClass15_165;

	@OriginalMember(owner = "client!tia", name = "o", descriptor = "F")
	public static float aFloat226 = 0.0F;

	@OriginalMember(owner = "client!tia", name = "p", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_159 = new Class218(13, 8);

	@OriginalMember(owner = "client!tia", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray57 = new boolean[200];

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZ[BIII[BII)V")
	public static void method9347(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg1[local31] += arg5[arg4++];
				@Pc(43) int local43 = arg3++;
				arg1[local43] += arg5[arg4++];
				@Pc(55) int local55 = arg3++;
				arg1[local55] += arg5[arg4++];
				@Pc(67) int local67 = arg3++;
				arg1[local67] += arg5[arg4++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg3++;
				arg1[local31] += arg5[arg4++];
			}
			arg3 += arg7;
			arg4 += arg6;
		}
	}
}
