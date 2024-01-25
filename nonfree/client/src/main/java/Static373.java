import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public static int anInt6397;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method5464() {
		if (Static294.aClass230_3.aBoolean471 && Static271.aClass54_16.anInt869 != -1) {
			Static165.method2325(Static271.aClass54_16.anInt869, Static271.aClass54_16.aString15);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZLclient!iu;BLclient!iu;)I")
	public static int method5467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class180_Sub1 arg2, @OriginalArg(4) Class180_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg2.anInt4548;
			local12 = arg3.anInt4548;
			if (!arg1) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static587.method8424(arg2.method3872().aString103, Static323.anInt5795, arg3.method3872().aString103);
		} else if (arg0 == 3) {
			if (arg2.aString67.equals("-")) {
				if (arg3.aString67.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString67.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static587.method8424(arg2.aString67, Static323.anInt5795, arg3.aString67);
			}
		} else if (arg0 == 4) {
			if (arg2.method3870()) {
				return arg3.method3870() ? 0 : 1;
			} else if (arg3.method3870()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method3868()) {
				return arg3.method3868() ? 0 : 1;
			} else if (arg3.method3868()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method3871()) {
				return arg3.method3871() ? 0 : 1;
			} else if (arg3.method3871()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method3867()) {
				return arg3.method3867() ? 0 : 1;
			} else if (arg3.method3867()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg2.anInt4555;
			local12 = arg3.anInt4555;
			if (arg1) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt4558 - arg3.anInt4558;
		}
	}
}
