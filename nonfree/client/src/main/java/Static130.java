import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Lclient!es;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_91 = new Class67(24, -1);

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
	public static final int[] anIntArray173 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IJ)V")
	public static void method1645(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 + Static75.anInt1063;
		@Pc(15) int local15 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 + Static102.anInt1386;
		if (Static23.anInt350 - local10 < -500 || Static23.anInt350 - local10 > 500 || Static446.anInt7039 - local15 < -500 || Static446.anInt7039 - local15 > 500) {
			Static446.anInt7039 = local15;
			Static23.anInt350 = local10;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (Static23.anInt350 != local10) {
			local67 = local10 - Static23.anInt350;
			local75 = (int) ((long) local67 * arg0 / 320L);
			if (local67 > 0) {
				if (local75 == 0) {
					local75 = 1;
				} else if (local75 > local67) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = -1;
			} else if (local75 < local67) {
				local75 = local67;
			}
			Static23.anInt350 += local75;
		}
		if (Static446.anInt7039 != local15) {
			local67 = local15 - Static446.anInt7039;
			local75 = (int) (arg0 * (long) local67 / 320L);
			if (local67 <= 0) {
				if (local75 == 0) {
					local75 = -1;
				} else if (local67 > local75) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = 1;
			} else if (local75 > local67) {
				local75 = local67;
			}
			Static446.anInt7039 += local75;
		}
		if (!Static126.aClass19_Sub1_1.aBoolean382) {
			Static336.aFloat72 += Static286.aFloat68 * (float) arg0 / 6.0F;
			Static99.aFloat9 += (float) arg0 * Static392.aFloat81 / 6.0F;
		}
		Static454.method5849();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!hm;I)Lclient!hm;")
	public static Class107 method1647(@OriginalArg(0) Class107 arg0) {
		if (arg0.anInt2624 != -1) {
			return Static55.method754(arg0.anInt2624);
		}
		@Pc(28) int local28 = arg0.anInt2660 >>> 16;
		@Pc(33) Class200 local33 = new Class200(Static462.aClass208_42);
		for (@Pc(38) Class1_Sub37 local38 = (Class1_Sub37) local33.method4225(); local38 != null; local38 = (Class1_Sub37) local33.method4223()) {
			if (local28 == local38.anInt5481) {
				return Static55.method754((int) local38.aLong236);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
	public static int method1648(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method1657(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static88.aString13 = arg1;
		Static99.aString14 = arg0;
		if (Static436.anInt6898 != 3 && (Static99.aString14.equals("") || Static88.aString13.equals(""))) {
			Static447.method5752(3);
			return;
		}
		Static106.aBoolean649 = false;
		if (Static436.anInt6898 != 1) {
			Static3.anInt42 = 0;
			Static188.anInt3433 = -1;
		}
		Static447.method5752(-3);
		Static63.anInt982 = 0;
		Static372.anInt5995 = 1;
		Static392.anInt6309 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method1660(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static178.method2589(Static182.aClass242_49);
		Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg0) + 1);
		Static426.aClass1_Sub19_Sub2_2.method2935(arg0);
		Static426.aClass1_Sub19_Sub2_2.method2933(arg1);
	}
}
