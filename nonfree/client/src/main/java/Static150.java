import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!kn", name = "T", descriptor = "Lclient!pl;")
	public static Class139 aClass139_3;

	@OriginalMember(owner = "client!kn", name = "V", descriptor = "[S")
	public static short[] aShortArray70 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "Lclient!fk;")
	public static Class56 aClass56_9 = new Class56();

	@OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!kn", name = "bb", descriptor = "[I")
	public static int[] anIntArray329 = new int[100];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 < arg4; local7++) {
			for (@Pc(12) int local12 = arg1; local12 < arg3; local12++) {
				if (Static249.anIntArrayArray70[local7][local12] == arg0 && Static222.anIntArrayArray62[local7][local12] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(IB)V")
	public static void method2550() {
		Static206.aClass98_34.method2565(5);
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)I")
	public static int method2551() {
		return Static215.anInt4218;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IJ)V")
	public static void method2552(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static220.method4263(arg0 - 1L);
			Static220.method4263(1L);
		} else {
			Static220.method4263(arg0);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
	public static void method2553() {
		Static123.aClass98_15.method2565(5);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!bi;BZ)V")
	public static void method2554(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) int local10;
		if (Static283.aBoolean393 || arg1) {
			local10 = Static123.anInt2333;
			@Pc(16) int local16 = local10 * 956 / 503;
			Static194.aClass3_Sub4_Sub12_2.method4703((Static253.anInt5224 - local16) / 2, 0, local16, local10);
			Static79.aClass81_2.method2501(Static253.anInt5224 / 2 - Static79.aClass81_2.anInt2797 / 2, 18);
		}
		arg0.method3684(Static47.anInt5990 == 1 ? Static100.aString75 : Static246.aString174, Static253.anInt5224 / 2, Static123.anInt2333 / 2 - 26, 16777215, -1);
		local10 = Static123.anInt2333 / 2 - 18;
		if (Static283.aBoolean393) {
			Static234.method3979(Static253.anInt5224 / 2 - 152, local10, 304, 34, 9179409);
			Static234.method3979(Static253.anInt5224 / 2 - 151, local10 + 1, 302, 32, 0);
			Static234.method3973(Static253.anInt5224 / 2 - 150, local10 - -2, Static37.anInt657 * 3, 30, 9179409);
			Static234.method3973(Static37.anInt657 * 3 + Static253.anInt5224 / 2 - 150, local10 + 2, 300 - Static37.anInt657 * 3, 30, 0);
		} else {
			Static143.method2455(Static253.anInt5224 / 2 - 152, local10, 304, 34, 9179409);
			Static143.method2455(Static253.anInt5224 / 2 - 151, local10 + 1, 302, 32, 0);
			Static143.method2462(Static253.anInt5224 / 2 - 150, local10 + 2, Static37.anInt657 * 3, 30, 9179409);
			Static143.method2462(Static253.anInt5224 / 2 + Static37.anInt657 * 3 - 150, local10 - -2, 300 - Static37.anInt657 * 3, 30, 0);
		}
		arg0.method3684(Static27.aString15, Static253.anInt5224 / 2, Static123.anInt2333 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "(I)V")
	public static void method2556() {
		Static188.aClass98_30.method2572();
		Static132.aClass98_16.method2572();
		Static3.aClass98_1.method2572();
	}

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "(I)V")
	public static void method2557() {
		Static155.aClass98_22.method2572();
		Static53.aClass98_48.method2572();
	}
}
