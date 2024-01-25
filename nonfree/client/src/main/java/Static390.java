import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIILclient!qn;Lclient!qn;)V")
	public static void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub4 arg3, @OriginalArg(4) Class20_Sub4 arg4) {
		@Pc(4) Class64 local4 = Static442.method6845(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub4_2 = arg3;
			local4.aClass20_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([BIIIBII)Z")
	public static boolean method6234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(34) int local34 = -((arg2 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg1 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local34; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local18;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}
}
