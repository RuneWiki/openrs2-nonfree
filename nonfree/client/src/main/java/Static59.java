import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt1331;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_7;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_8;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "Lclient!bc;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!oa;")
	public static final Class75 aClass75_6 = new Class75(4096);

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_457 = Static161.method2452("Malformed login packet)3");

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	public static int anInt1343 = 0;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "Lclient!dc;")
	public static Class20 aClass20_458 = aClass20_457;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[J")
	public static final long[] aLongArray13 = new long[100];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method1006() {
		if (Static101.aClass69_7 != null || Static48.aClass69_4 != null) {
			return;
		}
		@Pc(18) int local18 = Static85.anInt1876;
		@Pc(29) int local29;
		@Pc(80) int local80;
		if (Static104.aBoolean95) {
			@Pc(27) int local27;
			if (local18 != 1) {
				local27 = Static70.anInt1549;
				local29 = Static207.anInt4069;
				if (local27 < Static218.anInt4221 - 10 || Static218.anInt4221 + Static130.anInt2714 + 10 < local27 || Static8.anInt207 - 10 > local29 || local29 > Static198.anInt3862 + Static8.anInt207 + 10) {
					Static104.aBoolean95 = false;
					Static213.method3132(Static198.anInt3862, Static130.anInt2714, Static218.anInt4221, Static8.anInt207);
				}
			}
			if (local18 == 1) {
				local29 = Static8.anInt207;
				local27 = Static218.anInt4221;
				local80 = Static130.anInt2714;
				@Pc(82) int local82 = -1;
				@Pc(84) int local84 = Static179.anInt3572;
				@Pc(86) int local86 = Static175.anInt3521;
				for (@Pc(88) int local88 = 0; local88 < Static85.anInt1879; local88++) {
					@Pc(103) int local103 = (Static85.anInt1879 - local88 - 1) * 15 + local29 + 31;
					if (local84 > local27 && local84 < local80 + local27 && local103 - 13 < local86 && local86 < local103 + 3) {
						local82 = local88;
					}
				}
				if (local82 != -1) {
					Static136.method2111(local82);
				}
				Static104.aBoolean95 = false;
				Static213.method3132(Static198.anInt3862, Static130.anInt2714, Static218.anInt4221, Static8.anInt207);
				return;
			}
			return;
		}
		if (local18 == 1 && Static85.anInt1879 > 0) {
			@Pc(167) short local167 = Static151.aShortArray40[Static85.anInt1879 - 1];
			if (local167 == 36 || local167 == 7 || local167 == 8 || local167 == 28 || local167 == 51 || local167 == 50 || local167 == 47 || local167 == 20 || local167 == 6 || local167 == 11 || local167 == 18 || local167 == 1007) {
				local29 = Static63.anIntArray131[Static85.anInt1879 - 1];
				local80 = Static170.anIntArray362[Static85.anInt1879 - 1];
				@Pc(225) Class69 local225 = Static157.method2392(local80);
				if (Static118.method2458(Static94.method1538(local225)) || Static16.method274(Static94.method1538(local225))) {
					Static191.aBoolean170 = false;
					Static208.anInt4083 = 0;
					if (Static101.aClass69_7 != null) {
						Static184.method2779(Static101.aClass69_7);
					}
					Static101.aClass69_7 = Static157.method2392(local80);
					Static178.anInt3564 = local29;
					Static146.anInt3035 = Static179.anInt3572;
					Static215.anInt4183 = Static175.anInt3521;
					Static184.method2779(Static101.aClass69_7);
					return;
				}
			}
		}
		if (local18 == 1 && (Static189.anInt3754 == 1 && Static85.anInt1879 > 2 || Static183.method2774(Static85.anInt1879 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static85.anInt1879 > 0) {
			Static136.method2111(Static85.anInt1879 - 1);
		}
		if (local18 != 2 || Static85.anInt1879 <= 0) {
			return;
		}
		Static75.method1218();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!wa;B)[Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1[] method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2) {
		return Static167.method2532(arg2, arg1, arg0) ? Static77.method2447() : null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass50_1 = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Lclient!de;")
	public static Class7 method1013() {
		try {
			return (Class7) Class.forName("Class7_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub1();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!wa;Lclient!wa;I)V")
	public static void method1014(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1) {
		Static87.aClass23_49 = arg1;
		Static217.aClass23_79 = arg0;
	}
}
