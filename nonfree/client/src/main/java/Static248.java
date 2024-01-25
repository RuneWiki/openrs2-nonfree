import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!rb;")
	public static Class211 aClass211_96;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt3993 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLclient!gk;ILclient!gk;Z)I")
	public static int method3154(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class65_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg3.anInt2401;
			local12 = arg1.anInt2401;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static326.method4916(Static331.anInt5597, arg3.method1992().aString144, arg1.method1992().aString144);
		} else if (arg2 == 3) {
			if (arg3.aString74.equals("-")) {
				if (arg1.aString74.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString74.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static326.method4916(Static331.anInt5597, arg3.aString74, arg1.aString74);
			}
		} else if (arg2 == 4) {
			if (arg3.method1987()) {
				return arg1.method1987() ? 0 : 1;
			} else if (arg1.method1987()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method1990()) {
				return arg1.method1990() ? 0 : 1;
			} else if (arg1.method1990()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method1989()) {
				return arg1.method1989() ? 0 : 1;
			} else if (arg1.method1989()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method1988()) {
				return arg1.method1988() ? 0 : 1;
			} else if (arg1.method1988()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg3.anInt2408;
			local12 = arg1.anInt2408;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg3.anInt2404 - arg1.anInt2404;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)I")
	public static int method3156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
