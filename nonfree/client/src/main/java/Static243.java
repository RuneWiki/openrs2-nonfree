import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "[Lclient!ia;")
	public static Class167[] aClass167Array11;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "Lclient!da;")
	public static Class69 aClass69_5;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
	public static void method3909(@OriginalArg(1) int arg0) {
		Static403.anInt6887 = 3;
		Static476.anInt8110 = arg0;
		Static666.anInt10253 = 100;
		Static30.anInt914 = -1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!waa;ZILclient!waa;Z)I")
	public static int method3910(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub1 arg3) {
		@Pc(19) int local19;
		@Pc(22) int local22;
		if (arg2 == 1) {
			local19 = arg0.anInt10060;
			local22 = arg3.anInt10060;
			if (!arg1) {
				if (local22 == -1) {
					local22 = 2001;
				}
				if (local19 == -1) {
					local19 = 2001;
				}
			}
			return local19 - local22;
		} else if (arg2 == 2) {
			return Static499.method7105(arg0.method8555().aString113, arg3.method8555().aString113, Static319.anInt5939);
		} else if (arg2 == 3) {
			if (arg0.aString129.equals("-")) {
				if (arg3.aString129.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString129.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static499.method7105(arg0.aString129, arg3.aString129, Static319.anInt5939);
			}
		} else if (arg2 == 4) {
			if (arg0.method8550()) {
				return arg3.method8550() ? 0 : 1;
			} else if (arg3.method8550()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method8552()) {
				return arg3.method8552() ? 0 : 1;
			} else if (arg3.method8552()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method8549()) {
				return arg3.method8549() ? 0 : 1;
			} else if (arg3.method8549()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method8551()) {
				return arg3.method8551() ? 0 : 1;
			} else if (arg3.method8551()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local19 = arg0.anInt10063;
			local22 = arg3.anInt10063;
			if (arg1) {
				if (local19 == 1000) {
					local19 = -1;
				}
				if (local22 == 1000) {
					local22 = -1;
				}
			} else {
				if (local19 == -1) {
					local19 = 1000;
				}
				if (local22 == -1) {
					local22 = 1000;
				}
			}
			return local19 - local22;
		} else {
			return arg0.anInt10062 - arg3.anInt10062;
		}
	}
}
