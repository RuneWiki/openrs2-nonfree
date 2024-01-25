import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!io", name = "y", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!io", name = "D", descriptor = "I")
	public static int anInt3008 = 0;

	@OriginalMember(owner = "client!io", name = "L", descriptor = "I")
	public static int anInt3014 = -1;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "I")
	public static int anInt3015 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method2813() {
		@Pc(9) Class21 local9 = Static288.aClass21_148;
		synchronized (Static288.aClass21_148) {
			Static288.aClass21_148.method851();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!mj;Lclient!mj;IZ)I")
	public static int method2815(@OriginalArg(1) Class135_Sub1 arg0, @OriginalArg(2) Class135_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) int local12;
		if (arg2 == 1) {
			@Pc(9) int local9 = arg1.anInt4030;
			local12 = arg0.anInt4030;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static51.method1233(Static254.anInt5172, arg0.method3734().aString46, arg1.method3734().aString46);
		} else if (arg2 == 3) {
			if (arg1.aString41.equals("-")) {
				if (arg0.aString41.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString41.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static51.method1233(Static254.anInt5172, arg0.aString41, arg1.aString41);
			}
		} else if (arg2 == 4) {
			if (arg1.method3728()) {
				return arg0.method3728() ? 0 : 1;
			} else if (arg0.method3728()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method3729()) {
				return arg0.method3729() ? 0 : 1;
			} else if (arg0.method3729()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method3730()) {
				return arg0.method3730() ? 0 : 1;
			} else if (arg0.method3730()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method3731()) {
				return arg0.method3731() ? 0 : 1;
			} else if (arg0.method3731()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local12 = arg1.anInt4038;
			@Pc(203) int local203 = arg0.anInt4038;
			if (arg3) {
				if (local203 == 1000) {
					local203 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local203 == -1) {
					local203 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local12 - local203;
		} else {
			return arg1.anInt4037 - arg0.anInt4037;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Lclient!un;")
	public static Class208 method2817(@OriginalArg(1) int arg0) {
		@Pc(5) Class21 local5 = Static232.aClass21_125;
		@Pc(14) Class208 local14;
		synchronized (Static232.aClass21_125) {
			local14 = (Class208) Static232.aClass21_125.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static80.aClass30_20.method1161(Static19.method534(arg0), Static107.method2304(arg0));
		local14 = new Class208();
		local14.anInt6184 = arg0;
		if (local34 != null) {
			local14.method5538(new Class1_Sub7(local34));
		}
		local14.method5533();
		@Pc(60) Class21 local60 = Static232.aClass21_125;
		synchronized (Static232.aClass21_125) {
			Static232.aClass21_125.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!kg;)V")
	public static void method2819(@OriginalArg(1) Class112 arg0) {
		@Pc(11) Class112 local11 = Static131.method2690(arg0);
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (local11 == null) {
			local19 = Static130.anInt2825;
			local16 = Static213.anInt4274;
		} else {
			local16 = local11.anInt3381;
			local19 = local11.anInt3444;
		}
		Static191.method5773(local19, local16, false, arg0);
		Static10.method322(arg0, local19, local16);
	}
}
