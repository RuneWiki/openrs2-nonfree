import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	public static int anInt10884;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public static int anInt10885;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public static int anInt10890;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!hu;")
	public static Class150 aClass150_11;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method9066(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!ru;Lclient!ru;BI)I")
	public static int method9067(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class217_Sub1 arg1, @OriginalArg(2) Class217_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt9131;
			local14 = arg2.anInt9131;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static657.method9109(Static232.anInt4258, arg1.method7553().aString65, arg2.method7553().aString65);
		} else if (arg3 == 3) {
			if (arg1.aString88.equals("-")) {
				if (arg2.aString88.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString88.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static657.method9109(Static232.anInt4258, arg1.aString88, arg2.aString88);
			}
		} else if (arg3 == 4) {
			if (arg1.method7551()) {
				return arg2.method7551() ? 0 : 1;
			} else if (arg2.method7551()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method7550()) {
				return arg2.method7550() ? 0 : 1;
			} else if (arg2.method7550()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method7549()) {
				return arg2.method7549() ? 0 : 1;
			} else if (arg2.method7549()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method7548()) {
				return arg2.method7548() ? 0 : 1;
			} else if (arg2.method7548()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt9136;
			local14 = arg2.anInt9136;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt9134 - arg2.anInt9134;
		}
	}
}
