import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_1 = new Class99(14, 1);

	@OriginalMember(owner = "client!it", name = "k", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_2 = new Class99(15, 4);

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_3 = new Class99(16, -2);

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_4 = new Class99(17, 0);

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_5 = new Class99(18, -2);

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_6 = new Class99(19, -2);

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_7 = new Class99(20, 6);

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_8 = new Class99(21, 9);

	@OriginalMember(owner = "client!it", name = "r", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_9 = new Class99(22, -2);

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_10 = new Class99(23, 4);

	@OriginalMember(owner = "client!it", name = "t", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_11 = new Class99(24, -1);

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!hk;")
	public static final Class99 aClass99_12 = new Class99(25, -2);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B[I[J)V")
	public static void method2602(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static65.method1076(arg1, 0, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!u;Lclient!u;ZB)I")
	public static int method2603(@OriginalArg(0) int arg0, @OriginalArg(1) Class147_Sub1 arg1, @OriginalArg(2) Class147_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg2.anInt6661;
			local14 = arg1.anInt6661;
			if (!arg3) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static293.method4020(arg2.method5215().aString63, arg1.method5215().aString63, Static394.anInt6582);
		} else if (arg0 == 3) {
			if (arg2.aString72.equals("-")) {
				if (arg1.aString72.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString72.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static293.method4020(arg2.aString72, arg1.aString72, Static394.anInt6582);
			}
		} else if (arg0 == 4) {
			if (arg2.method5211()) {
				return arg1.method5211() ? 0 : 1;
			} else if (arg1.method5211()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method5212()) {
				return arg1.method5212() ? 0 : 1;
			} else if (arg1.method5212()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method5209()) {
				return arg1.method5209() ? 0 : 1;
			} else if (arg1.method5209()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method5213()) {
				return arg1.method5213() ? 0 : 1;
			} else if (arg1.method5213()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg2.anInt6664;
			local14 = arg1.anInt6664;
			if (arg3) {
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
			return arg2.anInt6663 - arg1.anInt6663;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!ug;I)V")
	public static void method2604(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (Static363.aClass219_4 == null) {
			return;
		}
		try {
			Static363.aClass219_4.method4836(0L);
			Static363.aClass219_4.method4847(24, arg1.aByteArray86, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public static void method2605() {
		Static297.aClass199_156.method4385();
		Static303.aClass199_188.method4385();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!fo;Lclient!fo;)I")
	public static int method2607(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1820(Static378.anInt2799)) {
			local5++;
		}
		if (arg0.method1820(Static364.anInt3532)) {
			local5++;
		}
		if (arg0.method1820(Static179.anInt3130)) {
			local5++;
		}
		if (arg1.method1820(Static378.anInt2799)) {
			local5++;
		}
		if (arg1.method1820(Static364.anInt3532)) {
			local5++;
		}
		if (arg1.method1820(Static179.anInt3130)) {
			local5++;
		}
		return local5;
	}
}
