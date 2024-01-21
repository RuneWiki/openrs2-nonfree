import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	public static int method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 ^ local17 << 13;
		@Pc(37) int local37 = local23 * (local23 * 15731 * local23 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!f;ILclient!f;Lclient!f;Lclient!g;)Z")
	public static boolean method621(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) Class3_Sub9_Sub2 arg3) {
		Static171.aClass13_31 = arg2;
		Static163.aClass13_26 = arg1;
		Static51.aClass13_10 = arg0;
		Static147.aClass3_Sub9_Sub2_2 = arg3;
		return true;
	}
}
