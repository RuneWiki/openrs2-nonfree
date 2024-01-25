import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jca", name = "T", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!jca", name = "R", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_53 = new Class230(69, 7);

	@OriginalMember(owner = "client!jca", name = "V", descriptor = "I")
	public static int anInt4897 = 0;

	@OriginalMember(owner = "client!jca", name = "W", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([I[Ljava/lang/Object;Z)V")
	public static void method4121(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static285.method4909(0, arg1, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!jba;ZILclient!jba;)I")
	public static int method4122(@OriginalArg(0) int arg0, @OriginalArg(1) Class69_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class69_Sub1 arg3) {
		@Pc(14) int local14;
		if (arg0 == 1) {
			@Pc(11) int local11 = arg3.anInt4839;
			local14 = arg1.anInt4839;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static108.method2273(arg3.method4090().aString28, arg1.method4090().aString28, Static126.anInt2904);
		} else if (arg0 == 3) {
			if (arg3.aString49.equals("-")) {
				if (arg1.aString49.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString49.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static108.method2273(arg3.aString49, arg1.aString49, Static126.anInt2904);
			}
		} else if (arg0 == 4) {
			if (arg3.method4080()) {
				return arg1.method4080() ? 0 : 1;
			} else if (arg1.method4080()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method4082()) {
				return arg1.method4082() ? 0 : 1;
			} else if (arg1.method4082()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method4081()) {
				return arg1.method4081() ? 0 : 1;
			} else if (arg1.method4081()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method4087()) {
				return arg1.method4087() ? 0 : 1;
			} else if (arg1.method4087()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local14 = arg3.anInt4847;
			@Pc(200) int local200 = arg1.anInt4847;
			if (arg2) {
				if (local200 == 1000) {
					local200 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local200 == -1) {
					local200 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local14 - local200;
		} else {
			return arg3.anInt4848 - arg1.anInt4848;
		}
	}
}
