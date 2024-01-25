import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt36 = -1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Please remove ";

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public static int anInt39 = 0;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt40 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public static void method27(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 5);
		local8.method2034();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZBLclient!jj;ILclient!jj;)I")
	public static int method28(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class83_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg1.anInt3243;
			local12 = arg3.anInt3243;
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
			return Static204.method3618(arg3.method2846().aString233, Static253.anInt5246, arg1.method2846().aString233);
		} else if (arg2 == 3) {
			if (arg1.aString111.equals("-")) {
				if (arg3.aString111.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString111.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static204.method3618(arg3.aString111, Static253.anInt5246, arg1.aString111);
			}
		} else if (arg2 == 4) {
			if (arg1.method2837()) {
				return arg3.method2837() ? 0 : 1;
			} else if (arg3.method2837()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method2838()) {
				return arg3.method2838() ? 0 : 1;
			} else if (arg3.method2838()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method2835()) {
				return arg3.method2835() ? 0 : 1;
			} else if (arg3.method2835()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method2832()) {
				return arg3.method2832() ? 0 : 1;
			} else if (arg3.method2832()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg1.anInt3249;
			local12 = arg3.anInt3249;
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
			return arg1.anInt3250 - arg3.anInt3250;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!ir;")
	public static Class4_Sub20 method30() {
		if (Static42.aClass130_46 == null || Static179.aClass140_1 == null) {
			return null;
		}
		Static179.aClass140_1.method3691(Static42.aClass130_46);
		@Pc(23) Class4_Sub20 local23 = (Class4_Sub20) Static179.aClass140_1.method3687();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class139 local32 = Static20.method377(local23.anInt3082);
			return local32 != null && local32.aBoolean372 && local32.method3656() ? local23 : Static248.method4312();
		}
	}
}
