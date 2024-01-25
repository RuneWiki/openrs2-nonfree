import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[Lclient!i;")
	public static Class83[] aClass83Array6;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBII[BII[BI)V")
	public static void method6498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg4++;
				arg6[local39] += arg3[arg5++];
				@Pc(51) int local51 = arg4++;
				arg6[local51] += arg3[arg5++];
				@Pc(63) int local63 = arg4++;
				arg6[local63] += arg3[arg5++];
				@Pc(75) int local75 = arg4++;
				arg6[local75] += arg3[arg5++];
			}
			for (@Pc(90) int local90 = local15; local90 < 0; local90++) {
				local39 = arg4++;
				arg6[local39] += arg3[arg5++];
			}
			arg4 += arg0;
			arg5 += arg2;
		}
	}
}
