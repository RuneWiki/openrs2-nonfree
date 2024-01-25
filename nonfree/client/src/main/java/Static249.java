import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Lclient!mw;")
	public static Class231 aClass231_1;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	public static int anInt4512;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_65 = new Class218(30, -1);

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	public static int anInt4508 = -1;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public static void method4130() {
		if (Static260.anInt4398 == 10) {
			Static260.anInt4398 = 11;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIBLclient!lda;Lclient!lda;)I")
	public static int method4131(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class98_Sub1 arg2, @OriginalArg(4) Class98_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local9 = arg2.anInt5505;
			local12 = arg3.anInt5505;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static379.method5470(arg2.method5044().aString47, arg3.method5044().aString47, Static609.anInt9834);
		} else if (arg1 == 3) {
			if (arg2.aString55.equals("-")) {
				if (arg3.aString55.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString55.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static379.method5470(arg2.aString55, arg3.aString55, Static609.anInt9834);
			}
		} else if (arg1 == 4) {
			if (arg2.method5039()) {
				return arg3.method5039() ? 0 : 1;
			} else if (arg3.method5039()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg2.method5036()) {
				return arg3.method5036() ? 0 : 1;
			} else if (arg3.method5036()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg2.method5035()) {
				return arg3.method5035() ? 0 : 1;
			} else if (arg3.method5035()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg2.method5043()) {
				return arg3.method5043() ? 0 : 1;
			} else if (arg3.method5043()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local9 = arg2.anInt5513;
			local12 = arg3.anInt5513;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt5514 - arg3.anInt5514;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!or;)V")
	public static void method4132(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class260 arg1) {
		@Pc(12) int local12 = arg1.anInt6939 == 0 ? arg1.anInt6963 : arg1.anInt6939;
		@Pc(21) int local21 = arg1.anInt6970 == 0 ? arg1.anInt6971 : arg1.anInt6970;
		Static103.method1836(arg1.anInt6930, local12, Static489.aClass260ArrayArray3[arg1.anInt6930 >> 16], local21, arg0);
		if (arg1.aClass260Array2 != null) {
			Static103.method1836(arg1.anInt6930, local12, arg1.aClass260Array2, local21, arg0);
		}
		@Pc(54) Class3_Sub46 local54 = (Class3_Sub46) Static455.aClass83_31.method2368((long) arg1.anInt6930);
		if (local54 != null) {
			Static159.method2894(local21, local12, local54.anInt7855, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ob;")
	public static Class248 method4134(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class248 local8;
		try {
			local8 = (Class248) Class.forName("Class248_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class248_Sub2();
		}
		local8.anInt8927 = arg0;
		local8.aString105 = arg1;
		return local8;
	}
}
