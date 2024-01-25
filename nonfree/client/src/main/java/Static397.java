import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B[[F[[S)[[S")
	public static short[][] method5728(@OriginalArg(1) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg1[local7].length; local11++) {
				arg1[local7][local11] = (short) (int) (arg0[local7][local11] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class67 local13 = local7.aClass67_3; local13 != null; local13 = local13.aClass67_1) {
			@Pc(17) Class2_Sub1_Sub1 local17 = local13.aClass2_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort118 == arg1 && local17.aShort121 == arg2) {
				Static475.method6972(local17, false);
				return;
			}
		}
	}
}
