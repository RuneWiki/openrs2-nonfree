import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public static int anInt686;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public static int anInt681 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Lclient!me;")
	public static Class71 method527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class71 local7 = Static7.method102(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass71Array2 == null || local7.aClass71Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass71Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
	public static void method530() {
		Static22.aClass53_4.method1496(5);
		Static144.aClass53_23.method1496(5);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(BI)I")
	public static int method531(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
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
		} else if (local12 == 19 || local12 == 21) {
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
}
