import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public static int anInt1804;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)J")
	public static long method1666() {
		return Static228.aClass145_1.method8780();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BIIIIBI[B)V")
	public static void method1667(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg4 >> 2);
		@Pc(19) int local19 = -(arg4 & 0x3);
		for (@Pc(22) int local22 = -arg2; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg0++;
				arg7[local30] += arg1[arg3++];
				@Pc(42) int local42 = arg0++;
				arg7[local42] += arg1[arg3++];
				@Pc(54) int local54 = arg0++;
				arg7[local54] += arg1[arg3++];
				@Pc(66) int local66 = arg0++;
				arg7[local66] += arg1[arg3++];
			}
			for (@Pc(81) int local81 = local19; local81 < 0; local81++) {
				local30 = arg0++;
				arg7[local30] += arg1[arg3++];
			}
			arg3 += arg6;
			arg0 += arg5;
		}
	}
}
