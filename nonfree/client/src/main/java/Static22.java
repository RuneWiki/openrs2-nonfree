import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Lclient!pl;")
	public static Class259 aClass259_16;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!cba;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!cg;")
	public static final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!av", name = "j", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
	public static boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static110.method1655(arg1, arg0) || Static357.method5304(arg0, arg1);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZLclient!iw;Lclient!iw;)I")
	public static int method431(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class136_Sub1 arg2, @OriginalArg(4) Class136_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg2.anInt4377;
			local12 = arg3.anInt4377;
			if (!arg1) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static406.method5919(Static52.anInt1264, arg3.method3658().aString94, arg2.method3658().aString94);
		} else if (arg0 == 3) {
			if (arg2.aString34.equals("-")) {
				if (arg3.aString34.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString34.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static406.method5919(Static52.anInt1264, arg3.aString34, arg2.aString34);
			}
		} else if (arg0 == 4) {
			if (arg2.method3650()) {
				return arg3.method3650() ? 0 : 1;
			} else if (arg3.method3650()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method3649()) {
				return arg3.method3649() ? 0 : 1;
			} else if (arg3.method3649()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method3652()) {
				return arg3.method3652() ? 0 : 1;
			} else if (arg3.method3652()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method3651()) {
				return arg3.method3651() ? 0 : 1;
			} else if (arg3.method3651()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg2.anInt4387;
			local12 = arg3.anInt4387;
			if (arg1) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
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
			return arg2.anInt4389 - arg3.anInt4389;
		}
	}
}
