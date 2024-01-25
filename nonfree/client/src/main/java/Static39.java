import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!r;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_9 = new Class344(47, 8);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZLclient!vp;Lclient!vp;I)I")
	public static int method1066(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class222_Sub1 arg1, @OriginalArg(3) Class222_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg2.anInt10273;
			local12 = arg1.anInt10273;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static73.method1573(arg2.method7996().aString132, arg1.method7996().aString132, Static142.anInt3088);
		} else if (arg3 == 3) {
			if (arg2.aString223.equals("-")) {
				if (arg1.aString223.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString223.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static73.method1573(arg2.aString223, arg1.aString223, Static142.anInt3088);
			}
		} else if (arg3 == 4) {
			if (arg2.method7989()) {
				return arg1.method7989() ? 0 : 1;
			} else if (arg1.method7989()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method7990()) {
				return arg1.method7990() ? 0 : 1;
			} else if (arg1.method7990()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method7991()) {
				return arg1.method7991() ? 0 : 1;
			} else if (arg1.method7991()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method7993()) {
				return arg1.method7993() ? 0 : 1;
			} else if (arg1.method7993()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg2.anInt10278;
			local12 = arg1.anInt10278;
			if (arg0) {
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
			return arg2.anInt10276 - arg1.anInt10276;
		}
	}
}
