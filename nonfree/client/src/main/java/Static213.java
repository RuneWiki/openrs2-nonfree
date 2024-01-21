import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1525 = Static161.method2452("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1526 = Static161.method2452(")3");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wa;BI)[Lclient!jc;")
	public static Class47[] method3128(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		return Static114.method506(arg0, arg1) ? Static69.method1142() : null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)I")
	public static int method3129(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V")
	public static void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(27) int local27 = Static171.method2627(Static27.anInt493, arg0 + arg2, Static72.anInt1572);
		@Pc(36) int local36 = Static171.method2627(Static27.anInt493, arg0 - arg2, Static72.anInt1572);
		Static27.method409(local27, arg1, Static9.anIntArrayArray1[arg3], local36);
		while (local7 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(87) int local87;
			@Pc(95) int local95;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local65 = arg3 - local13;
				local69 = local13 + arg3;
				if (local69 >= Static173.anInt3464 && local65 <= Static174.anInt3493) {
					local87 = Static171.method2627(Static27.anInt493, local7 + arg0, Static72.anInt1572);
					local95 = Static171.method2627(Static27.anInt493, arg0 - local7, Static72.anInt1572);
					if (local69 <= Static174.anInt3493) {
						Static27.method409(local87, arg1, Static9.anIntArrayArray1[local69], local95);
					}
					if (local65 >= Static173.anInt3464) {
						Static27.method409(local87, arg1, Static9.anIntArrayArray1[local65], local95);
					}
				}
			}
			local7++;
			local65 = arg3 - local7;
			local69 = local7 + arg3;
			if (local69 >= Static173.anInt3464 && Static174.anInt3493 >= local65) {
				local87 = Static171.method2627(Static27.anInt493, arg0 + local13, Static72.anInt1572);
				local95 = Static171.method2627(Static27.anInt493, arg0 - local13, Static72.anInt1572);
				if (local69 <= Static174.anInt3493) {
					Static27.method409(local87, arg1, Static9.anIntArrayArray1[local69], local95);
				}
				if (local65 >= Static173.anInt3464) {
					Static27.method409(local87, arg1, Static9.anIntArrayArray1[local65], local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ce;Z)Lclient!kb;")
	public static Class54_Sub1 method3131(@OriginalArg(0) Class5_Sub6 arg0) {
		return new Class54_Sub1(arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3072(), arg0.method3072(), arg0.method3062());
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZ)V")
	public static void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static137.anInt2871; local3++) {
			if (arg2 < Static52.anIntArray104[local3] + Static49.anIntArray99[local3] && Static52.anIntArray104[local3] < arg1 + arg2 && arg3 < Static55.anIntArray109[local3] + Static106.anIntArray237[local3] && arg3 + arg0 > Static55.anIntArray109[local3]) {
				Static185.aBooleanArray43[local3] = true;
			}
		}
	}
}
