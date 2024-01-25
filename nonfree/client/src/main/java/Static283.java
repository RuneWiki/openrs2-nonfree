import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public static final int anInt5185 = 1339;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!uu;")
	public static Class247 aClass247_13 = null;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static int anInt5187 = 104;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZILclient!kf;ZLclient!kf;)I")
	public static int method3963(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78_Sub1 arg2, @OriginalArg(4) Class78_Sub1 arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg1 == 1) {
			local14 = arg2.anInt3878;
			local17 = arg3.anInt3878;
			if (!arg0) {
				if (local17 == -1) {
					local17 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg1 == 2) {
			return Static40.method698(arg3.method3175().aString3, arg2.method3175().aString3, Static178.anInt3423);
		} else if (arg1 == 3) {
			if (arg2.aString37.equals("-")) {
				if (arg3.aString37.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString37.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static40.method698(arg3.aString37, arg2.aString37, Static178.anInt3423);
			}
		} else if (arg1 == 4) {
			if (arg2.method3171()) {
				return arg3.method3171() ? 0 : 1;
			} else if (arg3.method3171()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg2.method3172()) {
				return arg3.method3172() ? 0 : 1;
			} else if (arg3.method3172()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg2.method3174()) {
				return arg3.method3174() ? 0 : 1;
			} else if (arg3.method3174()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg2.method3173()) {
				return arg3.method3173() ? 0 : 1;
			} else if (arg3.method3173()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local14 = arg2.anInt3887;
			local17 = arg3.anInt3887;
			if (arg0) {
				if (local17 == 1000) {
					local17 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local17 == -1) {
					local17 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg2.anInt3881 - arg3.anInt3881;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public static boolean method3965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
