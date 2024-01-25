import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_8 = new Class236(70, 8);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg7[local26] += arg3[arg0++];
				@Pc(38) int local38 = arg6++;
				arg7[local38] += arg3[arg0++];
				@Pc(50) int local50 = arg6++;
				arg7[local50] += arg3[arg0++];
				@Pc(62) int local62 = arg6++;
				arg7[local62] += arg3[arg0++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg6++;
				arg7[local26] += arg3[arg0++];
			}
			arg6 += arg1;
			arg0 += arg2;
		}
	}
}
