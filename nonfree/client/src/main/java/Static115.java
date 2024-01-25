import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!ko;")
	public static Class142 aClass142_15;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!cp;IZILclient!cp;)I")
	public static int method1798(@OriginalArg(0) Class48_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class48_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg0.anInt1018;
			local14 = arg3.anInt1018;
			if (!arg1) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static267.method3730(arg0.method855().aString6, arg3.method855().aString6, Static389.anInt7061);
		} else if (arg2 == 3) {
			if (arg0.aString20.equals("-")) {
				if (arg3.aString20.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString20.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static267.method3730(arg0.aString20, arg3.aString20, Static389.anInt7061);
			}
		} else if (arg2 == 4) {
			if (arg0.method846()) {
				return arg3.method846() ? 0 : 1;
			} else if (arg3.method846()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method845()) {
				return arg3.method845() ? 0 : 1;
			} else if (arg3.method845()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method852()) {
				return arg3.method852() ? 0 : 1;
			} else if (arg3.method852()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method850()) {
				return arg3.method850() ? 0 : 1;
			} else if (arg3.method850()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg0.anInt1025;
			local14 = arg3.anInt1025;
			if (arg1) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt1026 - arg3.anInt1026;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZI)I")
	public static int method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class1_Sub13 local16 = Static379.method5347(arg1, arg2);
		if (local16 == null) {
			return 0;
		} else if (arg0 >= 0 && local16.anIntArray80.length > arg0) {
			return local16.anIntArray80[arg0];
		} else {
			return 0;
		}
	}
}
