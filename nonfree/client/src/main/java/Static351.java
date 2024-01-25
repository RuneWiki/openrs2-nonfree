import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!nca;ILclient!nca;Lclient!nca;Lclient!nca;)V")
	public static void method4860(@OriginalArg(0) Class254 arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) Class254 arg3) {
		Static240.aClass254_166 = arg3;
		Static376.aClass254_107 = arg0;
		Static543.aClass254_134 = arg2;
		Static581.aClass273ArrayArray2 = new Class273[Static240.aClass254_166.method6094()][];
		Static39.aBooleanArray5 = new boolean[Static240.aClass254_166.method6094()];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4861(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		if (arg1 == 2063193349) {
			for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
				local10 = (long) arg0.charAt(local18) + (local10 << 5) - local10;
			}
			return local10;
		} else {
			return -86L;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)I")
	public static int method4862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local9 << 13 ^ local9;
		@Pc(35) int local35 = local21 * (local21 * 15731 * local21 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}
}
