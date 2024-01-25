import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "I")
	public static int anInt3145 = -1;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B[[S[[F)[[S")
	public static short[][] method2765(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < arg0[local11].length; local15++) {
				arg0[local11][local15] = (short) (int) (arg1[local11][local15] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(JI)V")
	public static void method2766(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(III)Lclient!ev;")
	public static Class41_Sub1_Sub3 method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub1_Sub3_1;
	}
}
