import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
	public static final int[] anIntArray513 = new int[5];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method6506(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!ls;BII)V")
	public static void method6507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11_Sub1_Sub1_Sub3 arg2, @OriginalArg(6) int arg3) {
		Static264.method3878(arg2.aByte113, arg1, arg0, arg2.anInt8906, 0, arg2.anInt8902, arg3);
	}
}
