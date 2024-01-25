import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public static int anInt4563;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[Lclient!au;")
	public static final Interface2[] anInterface2Array1 = new Interface2[75];

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt4559 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method3784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(101) int local101;
		@Pc(109) int local109;
		if (Static326.anInt6028 <= arg4 && Static80.anInt1738 >= arg4) {
			local101 = Static489.method6853(arg3 + arg1, Static553.anInt9074, Static249.anInt4668);
			local109 = Static489.method6853(arg1 - arg3, Static553.anInt9074, Static249.anInt4668);
			Static276.method3099(local109, Static582.anIntArrayArray69[arg4], arg0, local101);
		}
		@Pc(123) int local123 = (arg2 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local77 += local55;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local63 += local55;
				local7++;
				local77 += local55;
			}
			local38 += -local123;
			local47 += -local71;
			local9--;
			local123 -= local51;
			local71 -= local51;
			local101 = arg4 - local9;
			local109 = arg4 + local9;
			if (Static326.anInt6028 <= local109 && Static80.anInt1738 >= local101) {
				@Pc(216) int local216 = Static489.method6853(local7 + arg1, Static553.anInt9074, Static249.anInt4668);
				@Pc(225) int local225 = Static489.method6853(arg1 - local7, Static553.anInt9074, Static249.anInt4668);
				if (local101 >= Static326.anInt6028) {
					Static276.method3099(local225, Static582.anIntArrayArray69[local101], arg0, local216);
				}
				if (local109 <= Static80.anInt1738) {
					Static276.method3099(local225, Static582.anIntArrayArray69[local109], arg0, local216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3788(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lclient!baa;")
	public static Class28 method3789(@OriginalArg(1) int arg0) {
		@Pc(8) Class28[] local8 = Static131.method7333();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt657) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method3795() {
		for (@Pc(7) int local7 = 0; local7 < anInt4559; local7++) {
			@Pc(13) Class351 local13 = Static515.aClass351Array1[local7];
			if (local13.aByte122 == 3) {
				if (local13.aClass2_Sub10_Sub4_4 == null) {
					local13.anInt9300 = Integer.MIN_VALUE;
				} else {
					Static122.aClass2_Sub10_Sub1_2.method1012(local13.aClass2_Sub10_Sub4_4);
				}
			}
		}
	}
}
