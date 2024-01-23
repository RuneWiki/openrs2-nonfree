import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	public static int anInt5174 = -2;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "Lclient!cc;")
	public static Class26 aClass26_54 = new Class26(64);

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public static int anInt5178 = 0;

	@OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
	public static int anInt5183 = -1;

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4235(@OriginalArg(0) Class58 arg0) {
		Static241.aClass58_86 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean method4236(@OriginalArg(0) Class189 arg0) {
		if (arg0.anIntArray668 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray668.length; local19++) {
			@Pc(29) int local29 = Static298.method4501(local19, arg0);
			@Pc(34) int local34 = arg0.anIntArray671[local19];
			if (arg0.anIntArray668[local19] == 2) {
				if (local29 >= local34) {
					return false;
				}
			} else if (arg0.anIntArray668[local19] == 3) {
				if (local29 <= local34) {
					return false;
				}
			} else if (arg0.anIntArray668[local19] == 4) {
				if (local29 == local34) {
					return false;
				}
			} else if (local34 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	public static void method4237() {
		Static133.aClass26_26.method511();
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Lclient!dc;")
	public static Class37 method4238(@OriginalArg(0) int arg0) {
		@Pc(6) Class37 local6 = (Class37) Static105.aClass26_21.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static77.aClass58_40.method1372(1, arg0);
		local6 = new Class37();
		local6.anInt900 = arg0;
		if (local21 != null) {
			local6.method746(new Class4_Sub10(local21));
		}
		local6.method743();
		if (local6.anInt907 == 2 && Static187.aClass85_16.method1845((long) arg0) == null) {
			Static187.aClass85_16.method1841(new Class4_Sub32(Static46.anInt876), (long) arg0);
			Static250.aClass37Array1[Static46.anInt876++] = local6;
		}
		Static105.aClass26_21.method510(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)V")
	public static void method4239() {
		if (Static29.method456() || Static60.anInt1216 == Static281.anInt5335) {
			Static40.method638();
			if (Static281.anInt5335 != Static248.anInt4710) {
				Static93.method2015();
			}
		} else {
			Static2.method2(false, Static177.anInt3360, false, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], Static3.anInt5, Static281.anInt5335);
		}
	}
}
