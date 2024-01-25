import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public static final int[] anIntArray89 = new int[1000];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[BII[BII)V")
	public static void method708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg4++;
				arg6[local34] += arg3[arg0++];
				@Pc(46) int local46 = arg4++;
				arg6[local46] += arg3[arg0++];
				@Pc(58) int local58 = arg4++;
				arg6[local58] += arg3[arg0++];
				@Pc(70) int local70 = arg4++;
				arg6[local70] += arg3[arg0++];
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local34 = arg4++;
				arg6[local34] += arg3[arg0++];
			}
			arg4 += arg2;
			arg0 += arg5;
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z")
	public static boolean method714() {
		try {
			@Pc(7) Class323 local7 = new Class323();
			@Pc(14) byte[] local14 = local7.method7178(Static589.aByteArray104);
			Static561.method7604(local14);
			return true;
		} catch (@Pc(26) Exception local26) {
			return false;
		}
	}
}
