import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[B[BZIIIII)V")
	public static void method5160(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg4++;
				arg2[local26] += arg1[arg5++];
				@Pc(38) int local38 = arg4++;
				arg2[local38] += arg1[arg5++];
				@Pc(50) int local50 = arg4++;
				arg2[local50] += arg1[arg5++];
				@Pc(62) int local62 = arg4++;
				arg2[local62] += arg1[arg5++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg4++;
				arg2[local26] += arg1[arg5++];
			}
			arg5 += arg6;
			arg4 += arg7;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
	public static void method5162() {
		Static443.aClass112_50.method3643();
		Static376.aClass112_42.method3643();
		Static237.aClass112_29.method3643();
		Static510.aClass112_54.method3643();
	}
}
