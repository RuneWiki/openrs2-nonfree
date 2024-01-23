import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString16 = "Continue";

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!hh;")
	public static Class69 aClass69_2 = new Class69();

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "[I")
	public static int[] anIntArray35 = new int[32];

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public static void method303(@OriginalArg(1) int arg0) {
		Static254.anInt5884 = 20;
		Static79.anInt2909 = arg0;
		Static35.anInt735 = 3;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([SB)[S")
	public static short[] method304(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(13) short[] local13 = new short[arg0.length];
			Static300.method489(arg0, 0, local13, 0, arg0.length);
			return local13;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	public static void method305(@OriginalArg(1) int arg0) {
		if (Static137.anInt3867 == 0) {
			Static256.aClass1_Sub8_Sub4_3.method4218(arg0);
		} else {
			Static186.anInt3480 = arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
	public static void method306(@OriginalArg(0) int arg0) {
		Static189.anInt3540 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ak;BLclient!ak;)V")
	public static void method308(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static3.aClass7_12 = arg1;
		Static273.aClass7_219 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IB)Z")
	public static boolean method309(@OriginalArg(0) int arg0) {
		Static92.aBoolean131 = true;
		Static170.anInt3124 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		Static188.method2835(arg2);
		@Pc(25) int local25 = arg2;
		@Pc(30) int local30 = arg2 - arg5;
		@Pc(33) int local33 = -arg2;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(43) int local43 = local30;
		@Pc(46) int local46 = -local30;
		@Pc(48) int local48 = -1;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (arg3 >= Static24.anInt556 && Static284.anInt5643 >= arg3) {
			@Pc(59) int[] local59 = Static151.anIntArrayArray26[arg3];
			local68 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - arg2);
			local76 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 + arg0);
			local84 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - local30);
			local92 = Static45.method818(Static28.anInt606, Static245.anInt1237, local30 + arg0);
			Static288.method4405(arg1, local84, local68, local59);
			Static288.method4405(arg4, local92, local84, local59);
			Static288.method4405(arg1, local76, local92, local59);
		}
		@Pc(114) int local114 = -1;
		while (local25 > local7) {
			local48 += 2;
			local114 += 2;
			local46 += local114;
			if (local46 >= 0 && local43 >= 1) {
				local43--;
				Static295.anIntArray690[local43] = local7;
				local46 -= local43 << 1;
			}
			local7++;
			local33 += local48;
			@Pc(217) int local217;
			@Pc(225) int local225;
			@Pc(236) int[] local236;
			@Pc(165) int local165;
			if (local33 >= 0) {
				local25--;
				local33 -= local25 << 1;
				local165 = arg3 - local25;
				local68 = local25 + arg3;
				if (local68 >= Static24.anInt556 && local165 <= Static284.anInt5643) {
					if (local25 < local30) {
						local76 = Static295.anIntArray690[local25];
						local84 = Static45.method818(Static28.anInt606, Static245.anInt1237, local7 + arg0);
						local92 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - local7);
						local217 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 + local76);
						local225 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - local76);
						if (Static284.anInt5643 >= local68) {
							local236 = Static151.anIntArrayArray26[local68];
							Static288.method4405(arg1, local225, local92, local236);
							Static288.method4405(arg4, local217, local225, local236);
							Static288.method4405(arg1, local84, local217, local236);
						}
						if (Static24.anInt556 <= local165) {
							local236 = Static151.anIntArrayArray26[local165];
							Static288.method4405(arg1, local225, local92, local236);
							Static288.method4405(arg4, local217, local225, local236);
							Static288.method4405(arg1, local84, local217, local236);
						}
					} else {
						local76 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 + local7);
						local84 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - local7);
						if (local68 <= Static284.anInt5643) {
							Static288.method4405(arg1, local76, local84, Static151.anIntArrayArray26[local68]);
						}
						if (local165 >= Static24.anInt556) {
							Static288.method4405(arg1, local76, local84, Static151.anIntArrayArray26[local165]);
						}
					}
				}
			}
			local165 = arg3 - local7;
			local68 = local7 + arg3;
			if (local68 >= Static24.anInt556 && Static284.anInt5643 >= local165) {
				local76 = arg0 + local25;
				local84 = arg0 - local25;
				if (local76 >= Static245.anInt1237 && local84 <= Static28.anInt606) {
					local76 = Static45.method818(Static28.anInt606, Static245.anInt1237, local76);
					local84 = Static45.method818(Static28.anInt606, Static245.anInt1237, local84);
					if (local7 >= local30) {
						if (Static284.anInt5643 >= local68) {
							Static288.method4405(arg1, local76, local84, Static151.anIntArrayArray26[local68]);
						}
						if (local165 >= Static24.anInt556) {
							Static288.method4405(arg1, local76, local84, Static151.anIntArrayArray26[local165]);
						}
					} else {
						local92 = local7 > local43 ? Static295.anIntArray690[local7] : local43;
						local217 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 + local92);
						local225 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0 - local92);
						if (local68 <= Static284.anInt5643) {
							local236 = Static151.anIntArrayArray26[local68];
							Static288.method4405(arg1, local225, local84, local236);
							Static288.method4405(arg4, local217, local225, local236);
							Static288.method4405(arg1, local76, local217, local236);
						}
						if (Static24.anInt556 <= local165) {
							local236 = Static151.anIntArrayArray26[local165];
							Static288.method4405(arg1, local225, local84, local236);
							Static288.method4405(arg4, local217, local225, local236);
							Static288.method4405(arg1, local76, local217, local236);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Lclient!ck;")
	public static Class27 method311(@OriginalArg(1) int arg0) {
		@Pc(21) Class27 local21 = (Class27) Static45.aClass31_8.method852((long) arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(33) byte[] local33 = Static270.aClass7_215.method253(arg0, 31);
		local21 = new Class27();
		if (local33 != null) {
			local21.method749(new Class1_Sub18(local33), arg0);
		}
		Static45.aClass31_8.method851(local21, (long) arg0);
		return local21;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg4 - arg1;
		@Pc(21) int local21 = arg7 - arg2;
		@Pc(29) int local29 = (arg5 - arg3 << 16) / local16;
		@Pc(37) int local37 = (arg6 - arg0 << 16) / local21;
		Static258.method4000(arg1, local37, arg2, arg0, arg4, arg3, local29, arg7);
	}
}
