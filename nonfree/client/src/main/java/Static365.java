import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public static int anInt6315;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!bda;I)I")
	public static int method5396(@OriginalArg(0) Class34 arg0) {
		if (arg0 == Static362.aClass34_172) {
			return 7681;
		} else if (Static313.aClass34_88 == arg0) {
			return 8448;
		} else if (Static141.aClass34_77 == arg0) {
			return 34165;
		} else if (Static11.aClass34_6 == arg0) {
			return 260;
		} else if (arg0 == Static414.aClass34_113) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)V")
	public static void method5397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static577.method8285(local7.aClass8_Sub1_Sub1_1);
			if (local7.aClass8_Sub1_Sub1_1 != null) {
				local7.aClass8_Sub1_Sub1_1 = null;
			}
		}
	}
}
