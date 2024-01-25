import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!ed;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
	public static final int anInt5840 = 1403;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([BIIIIIII[B)V")
	public static void method5013(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg0[local31] += arg7[arg4++];
				@Pc(43) int local43 = arg6++;
				arg0[local43] += arg7[arg4++];
				@Pc(55) int local55 = arg6++;
				arg0[local55] += arg7[arg4++];
				@Pc(67) int local67 = arg6++;
				arg0[local67] += arg7[arg4++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg6++;
				arg0[local31] += arg7[arg4++];
			}
			arg6 += arg2;
			arg4 += arg5;
		}
	}
}
