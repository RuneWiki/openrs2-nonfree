import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!tm", name = "X", descriptor = "Lclient!dp;")
	public static Class53 aClass53_141;

	@OriginalMember(owner = "client!tm", name = "Y", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!tm", name = "cb", descriptor = "I")
	public static int anInt5783;

	@OriginalMember(owner = "client!tm", name = "db", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "Lclient!ec;")
	public static final Class6_Sub10 aClass6_Sub10_7 = new Class6_Sub10(new byte[5000]);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLclient!jo;IILclient!jo;I)I")
	public static int method5239(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class64_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class64_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = method5243(arg2, arg0, arg4, arg5);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = method5243(arg2, arg1, arg4, arg3);
			return arg1 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method5240(@OriginalArg(0) Class132 arg0) {
		@Pc(7) Class132 local7 = Static264.method4485(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local12 = Static209.anInt3815;
			local15 = Static94.anInt1731;
		} else {
			local12 = local7.anInt3507;
			local15 = local7.anInt3503;
		}
		Static118.method2412(local12, false, local15, arg0);
		Static177.method3432(arg0, local12, local15);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public static void method5241(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static230.anInt4308 = arg1;
		Static327.anInt3039 = 0;
		Static265.anInt4933 = arg0;
		Static311.anInt5837 = 0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!jo;ZLclient!jo;II)I")
	private static int method5243(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class64_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg2.anInt2852;
			local14 = arg0.anInt2852;
			if (!arg1) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static136.method2601(arg2.method3071().aString283, Static247.anInt4265, arg0.method3071().aString283);
		} else if (arg3 == 3) {
			if (arg2.aString124.equals("-")) {
				if (arg0.aString124.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString124.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static136.method2601(arg2.aString124, Static247.anInt4265, arg0.aString124);
			}
		} else if (arg3 == 4) {
			if (arg2.method3064()) {
				return arg0.method3064() ? 0 : 1;
			} else if (arg0.method3064()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method3067()) {
				return arg0.method3067() ? 0 : 1;
			} else if (arg0.method3067()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method3065()) {
				return arg0.method3065() ? 0 : 1;
			} else if (arg0.method3065()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method3062()) {
				return arg0.method3062() ? 0 : 1;
			} else if (arg0.method3062()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg2.anInt2865;
			local14 = arg0.anInt2865;
			if (arg1) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
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
			return arg2.anInt2867 - arg0.anInt2867;
		}
	}
}
