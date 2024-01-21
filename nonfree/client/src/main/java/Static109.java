import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!b;")
	public static Class7 aClass7_18 = new Class7(128);

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "[I")
	public static int[] anIntArray283 = new int[200];

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1461 = Static122.method531("au");

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[104][104];

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1462 = Static122.method531("Loaded wordpack");

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1463 = Static122.method531("weiss:");

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "Z")
	public static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1464 = Static122.method531("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!nd", name = "rb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1465 = aClass73_1462;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIB)I")
	public static int method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class72 local11 = Static99.aClass72ArrayArrayArray1[Static147.anInt3309][arg1][arg0];
		if (local11 == null) {
			Static119.aClass35_1.method1165(Static147.anInt3309, arg1, arg0);
			return;
		}
		@Pc(21) Class3_Sub1_Sub4_Sub2 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class3_Sub1_Sub4_Sub2 local28;
		for (local28 = (Class3_Sub1_Sub4_Sub2) local11.method2401(); local28 != null; local28 = (Class3_Sub1_Sub4_Sub2) local11.method2407()) {
			@Pc(34) Class3_Sub1_Sub7 local34 = Static3.method42(local28.anInt813);
			@Pc(37) int local37 = local34.anInt1208;
			if (local34.anInt1216 == 1) {
				local37 *= local28.anInt819 + 1;
			}
			if (local37 > local23) {
				local23 = local37;
				local21 = local28;
			}
		}
		if (local21 == null) {
			Static119.aClass35_1.method1165(Static147.anInt3309, arg1, arg0);
			return;
		}
		local11.method2397(local21);
		@Pc(78) Class3_Sub1_Sub4_Sub2 local78 = null;
		local28 = (Class3_Sub1_Sub4_Sub2) local11.method2401();
		@Pc(85) Class3_Sub1_Sub4_Sub2 local85 = null;
		@Pc(93) int local93 = arg1 + (arg0 << 7) + 1610612736;
		while (local28 != null) {
			if (local21.anInt813 != local28.anInt813) {
				if (local85 == null) {
					local85 = local28;
				}
				if (local28.anInt813 != local85.anInt813 && local78 == null) {
					local78 = local28;
				}
			}
			local28 = (Class3_Sub1_Sub4_Sub2) local11.method2407();
		}
		Static119.aClass35_1.method1150(Static147.anInt3309, arg1, arg0, Static107.method1922(arg1 * 128 + 64, arg0 * 128 - -64, Static147.anInt3309), local21, local93, local85, local78);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
	public static void method1956() {
		if (Static137.aClass5_2 != null) {
			Static137.aClass5_2.method2587();
		}
		if (Static79.aClass5_1 != null) {
			Static79.aClass5_1.method2587();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1957(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static4.aClass56_1);
		arg0.removeFocusListener(Static4.aClass56_1);
		Static56.anInt1327 = -1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method1958(@OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg0) {
		arg0.aBoolean212 = false;
		@Pc(19) Class3_Sub1_Sub8 local19;
		if (arg0.anInt3141 != -1) {
			local19 = Static98.method1697(arg0.anInt3141);
			if (local19 == null || local19.anIntArray138 == null) {
				arg0.anInt3141 = -1;
			} else {
				arg0.anInt3153++;
				if (arg0.anInt3174 < local19.anIntArray138.length && local19.anIntArray136[arg0.anInt3174] < arg0.anInt3153) {
					arg0.anInt3153 = 1;
					arg0.anInt3174++;
					Static103.method1798(arg0 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1, arg0.anInt3174, arg0.anInt3159, local19, arg0.anInt3169);
				}
				if (arg0.anInt3174 >= local19.anIntArray138.length) {
					arg0.anInt3153 = 0;
					arg0.anInt3174 = 0;
					Static103.method1798(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 == arg0, arg0.anInt3174, arg0.anInt3159, local19, arg0.anInt3169);
				}
			}
		}
		if (arg0.anInt3149 != -1 && Static44.anInt1024 >= arg0.anInt3176) {
			if (arg0.anInt3189 < 0) {
				arg0.anInt3189 = 0;
			}
			@Pc(134) int local134 = Static12.method196(arg0.anInt3149).anInt2378;
			if (local134 == -1) {
				arg0.anInt3149 = -1;
			} else {
				@Pc(147) Class3_Sub1_Sub8 local147 = Static98.method1697(local134);
				if (local147 == null || local147.anIntArray138 == null) {
					arg0.anInt3149 = -1;
				} else {
					arg0.anInt3162++;
					if (arg0.anInt3189 < local147.anIntArray138.length && arg0.anInt3162 > local147.anIntArray136[arg0.anInt3189]) {
						arg0.anInt3162 = 1;
						arg0.anInt3189++;
						Static103.method1798(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 == arg0, arg0.anInt3189, arg0.anInt3159, local147, arg0.anInt3169);
					}
					if (arg0.anInt3189 >= local147.anIntArray138.length && (arg0.anInt3189 < 0 || local147.anIntArray138.length <= arg0.anInt3189)) {
						arg0.anInt3149 = -1;
					}
				}
			}
		}
		if (arg0.anInt3184 != -1 && arg0.anInt3173 <= 1) {
			local19 = Static98.method1697(arg0.anInt3184);
			if (local19.anInt1318 == 1 && arg0.anInt3135 > 0 && arg0.anInt3128 <= Static44.anInt1024 && arg0.anInt3131 < Static44.anInt1024) {
				arg0.anInt3173 = 1;
				return;
			}
		}
		if (arg0.anInt3184 != -1 && arg0.anInt3173 == 0) {
			local19 = Static98.method1697(arg0.anInt3184);
			if (local19 == null || local19.anIntArray138 == null) {
				arg0.anInt3184 = -1;
			} else {
				arg0.anInt3164++;
				if (local19.anIntArray138.length > arg0.anInt3172 && local19.anIntArray136[arg0.anInt3172] < arg0.anInt3164) {
					arg0.anInt3164 = 1;
					arg0.anInt3172++;
					Static103.method1798(arg0 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1, arg0.anInt3172, arg0.anInt3159, local19, arg0.anInt3169);
				}
				if (arg0.anInt3172 >= local19.anIntArray138.length) {
					arg0.anInt3187++;
					arg0.anInt3172 -= local19.anInt1316;
					if (local19.anInt1322 <= arg0.anInt3187) {
						arg0.anInt3184 = -1;
					} else if (arg0.anInt3172 >= 0 && local19.anIntArray138.length > arg0.anInt3172) {
						Static103.method1798(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 == arg0, arg0.anInt3172, arg0.anInt3159, local19, arg0.anInt3169);
					} else {
						arg0.anInt3184 = -1;
					}
				}
				arg0.aBoolean212 = local19.aBoolean88;
			}
		}
		if (arg0.anInt3173 > 0) {
			arg0.anInt3173--;
		}
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(III)Lclient!vd;")
	public static Class83 method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class83 local12 = Static80.method1396(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass83Array2 == null || local12.aClass83Array2.length <= arg0) {
			return null;
		} else {
			return local12.aClass83Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1960() {
		aClass73_1464 = null;
		aClass73_1465 = null;
		aClass7_18 = null;
		aClass73_1463 = null;
		anIntArray283 = null;
		anIntArrayArray29 = null;
		aClass73_1461 = null;
		aClass73_1462 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lclient!t;")
	public static Class3_Sub1_Sub17 method1961(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub1_Sub17 local14 = (Class3_Sub1_Sub17) Static98.aClass7_14.method183((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static119.aClass13_21.method348(5, arg0);
		local14 = new Class3_Sub1_Sub17();
		if (local28 != null) {
			local14.method2479(new Class3_Sub12(local28));
		}
		Static98.aClass7_14.method186(local14, (long) arg0);
		return local14;
	}
}
