import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_33 = new Class73(91, -2);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZILclient!saa;Lclient!saa;I)I")
	public static int method1620(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class299_Sub1 arg1, @OriginalArg(3) Class299_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (arg3 == 1) {
			local17 = arg1.anInt8028;
			local20 = arg2.anInt8028;
			if (!arg0) {
				if (local20 == -1) {
					local20 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local17 - local20;
		} else if (arg3 == 2) {
			return Static209.method3708(arg1.method6540().aString101, arg2.method6540().aString101, Static25.anInt769);
		} else if (arg3 == 3) {
			if (arg1.aString82.equals("-")) {
				if (arg2.aString82.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString82.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static209.method3708(arg1.aString82, arg2.aString82, Static25.anInt769);
			}
		} else if (arg3 == 4) {
			if (arg1.method6530()) {
				return arg2.method6530() ? 0 : 1;
			} else if (arg2.method6530()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method6535()) {
				return arg2.method6535() ? 0 : 1;
			} else if (arg2.method6535()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method6531()) {
				return arg2.method6531() ? 0 : 1;
			} else if (arg2.method6531()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method6534()) {
				return arg2.method6534() ? 0 : 1;
			} else if (arg2.method6534()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local17 = arg1.anInt8034;
			local20 = arg2.anInt8034;
			if (arg0) {
				if (local20 == 1000) {
					local20 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local17 == -1) {
					local17 = 1000;
				}
				if (local20 == -1) {
					local20 = 1000;
				}
			}
			return local17 - local20;
		} else {
			return arg1.anInt8035 - arg2.anInt8035;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
	public static void method1626() {
		Static354.aClass136_96.method3474(5);
	}
}
