import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!qi;")
	public static final Class207 aClass207_3 = new Class207("WTRC", 1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method2660(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(15) int local15 = -(arg5 >> 2);
		@Pc(20) int local20 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg6++;
				arg1[local31] += arg7[arg4++];
				@Pc(43) int local43 = arg6++;
				arg1[local43] += arg7[arg4++];
				@Pc(55) int local55 = arg6++;
				arg1[local55] += arg7[arg4++];
				@Pc(67) int local67 = arg6++;
				arg1[local67] += arg7[arg4++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg6++;
				arg1[local31] += arg7[arg4++];
			}
			arg4 += arg3;
			arg6 += arg2;
		}
	}
}
