import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg4[local26] += arg1[arg7++];
				@Pc(38) int local38 = arg6++;
				arg4[local38] += arg1[arg7++];
				@Pc(50) int local50 = arg6++;
				arg4[local50] += arg1[arg7++];
				@Pc(62) int local62 = arg6++;
				arg4[local62] += arg1[arg7++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg6++;
				arg4[local26] += arg1[arg7++];
			}
			arg6 += arg5;
			arg7 += arg2;
		}
	}
}
