import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt4807;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!fo;Lclient!fo;)V")
	public static void method3749(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		Static449.aClass82_105 = arg0;
		Static457.aClass82_106 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method3750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method3751(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 10);
		local8.method2667();
	}
}
