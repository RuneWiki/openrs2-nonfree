import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[II)V")
	public static void method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 != 18601) {
			method7077(-9);
		}
		arg0--;
		@Pc(15) int local15 = arg2 - 1;
		@Pc(18) int local18 = local15 - 7;
		while (local18 > arg0) {
			@Pc(22) int local22 = arg0 + 1;
			arg3[local22] = arg1;
			@Pc(27) int local27 = local22 + 1;
			arg3[local27] = arg1;
			@Pc(32) int local32 = local27 + 1;
			arg3[local32] = arg1;
			@Pc(37) int local37 = local32 + 1;
			arg3[local37] = arg1;
			@Pc(42) int local42 = local37 + 1;
			arg3[local42] = arg1;
			@Pc(47) int local47 = local42 + 1;
			arg3[local47] = arg1;
			@Pc(52) int local52 = local47 + 1;
			arg3[local52] = arg1;
			arg0 = local52 + 1;
			arg3[arg0] = arg1;
		}
		while (local15 > arg0) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
	public static boolean method7076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method7077(@OriginalArg(0) int arg0) {
		if (arg0 != 32768) {
			method7076(75, -12);
		}
		if (!Static530.aBoolean724) {
			Static298.aFloat64 += (24.0F - Static298.aFloat64) / 2.0F;
			Static530.aBoolean724 = true;
			Static176.aBoolean298 = true;
		}
	}
}
