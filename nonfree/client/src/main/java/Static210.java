import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
	public static int[] anIntArray344 = new int[100];

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	public static int anInt4109 = 0;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString141 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V")
	public static void method3313(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static64.anInt1390 += arg0 * 128;
		@Pc(46) int local46;
		if (Static298.anIntArray417.length < Static64.anInt1390) {
			Static64.anInt1390 -= Static298.anIntArray417.length;
			local46 = (int) (Math.random() * 12.0D);
			Static293.method4563(Static11.aClass58_Sub2Array1[local46]);
		}
		local46 = 0;
		@Pc(57) int local57 = arg0 * 128;
		@Pc(64) int local64 = (256 - arg0) * 128;
		@Pc(66) int local66;
		@Pc(91) int local91;
		for (local66 = 0; local66 < local64; local66++) {
			local91 = Static49.anIntArray120[local57 + local46] - arg0 * Static298.anIntArray417[Static64.anInt1390 + local46 & Static298.anIntArray417.length + -1] / 6;
			if (local91 < 0) {
				local91 = 0;
			}
			Static49.anIntArray120[local46++] = local91;
		}
		@Pc(120) int local120;
		@Pc(128) int local128;
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			local91 = local66 * 128;
			for (local120 = 0; local120 < 128; local120++) {
				local128 = (int) (Math.random() * 100.0D);
				if (local128 < 50 && local120 > 10 && local120 < 118) {
					Static49.anIntArray120[local91 + local120] = 255;
				} else {
					Static49.anIntArray120[local91 + local120] = 0;
				}
			}
		}
		for (local66 = 0; local66 < 256 - arg0; local66++) {
			Static232.anIntArray375[local66] = Static232.anIntArray375[local66 + arg0];
		}
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			Static232.anIntArray375[local66] = (int) (Math.sin((double) Static151.anInt2973 / 14.0D) * 16.0D + Math.sin((double) Static151.anInt2973 / 15.0D) * 14.0D + Math.sin((double) Static151.anInt2973 / 16.0D) * 12.0D);
			Static151.anInt2973++;
		}
		local66 = ((Static50.anInt1118 & 0x1) + arg0) / 2;
		Static41.anInt853 += arg0;
		if (local66 <= 0) {
			return;
		}
		for (local91 = 0; local91 < Static41.anInt853; local91++) {
			local120 = (int) (Math.random() * 124.0D) + 2;
			local128 = (int) (Math.random() * 128.0D) + 128;
			Static49.anIntArray120[local120 + (local128 << 7)] = 192;
		}
		Static41.anInt853 = 0;
		@Pc(300) int local300;
		for (local91 = 0; local91 < 256; local91++) {
			local120 = 0;
			local128 = local91 * 128;
			for (local300 = -local66; local300 < 128; local300++) {
				if (local300 + local66 < 128) {
					local120 += Static49.anIntArray120[local128 + local300 + local66];
				}
				if (local300 - local66 - 1 >= 0) {
					local120 -= Static49.anIntArray120[local300 + local128 - local66 - 1];
				}
				if (local300 >= 0) {
					Static240.anIntArray220[local300 + local128] = local120 / (local66 * 2 + 1);
				}
			}
		}
		for (local91 = 0; local91 < 128; local91++) {
			local120 = 0;
			for (local128 = -local66; local128 < 256; local128++) {
				local300 = local128 * 128;
				if (local66 + local128 < 256) {
					local120 += Static240.anIntArray220[local66 * 128 + local300 + local91];
				}
				if (local128 - local66 - 1 >= 0) {
					local120 -= Static240.anIntArray220[local91 + local300 - local66 * 128 - 128];
				}
				if (local128 >= 0) {
					Static49.anIntArray120[local300 + local91] = local120 / (local66 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	public static void method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static65.anInt5697; local7++) {
			if (Static226.anIntArray370[local7] + Static184.anIntArray305[local7] > arg0 && arg0 + arg1 > Static226.anIntArray370[local7] && Static242.anIntArray380[local7] + Static184.anIntArray304[local7] > arg3 && Static242.anIntArray380[local7] < arg3 + arg2) {
				Static22.aBooleanArray8[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILclient!pi;)Lclient!eg;")
	public static Class5_Sub2 method3317(@OriginalArg(1) Class4_Sub24 arg0) {
		return new Class5_Sub2(arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3063(), arg0.method3063(), arg0.method3110());
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)Lclient!tl;")
	public static Class4_Sub30 method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub30 local13 = new Class4_Sub30();
		local13.anInt5201 = arg1;
		local13.anInt5208 = arg0;
		Static167.aClass163_25.method4181((long) arg2, local13);
		Static89.method1498(arg0);
		@Pc(36) Class97 local36 = Static148.method2340(arg2);
		if (local36 != null) {
			Static178.method2927(local36);
		}
		if (Static44.aClass97_6 != null) {
			Static178.method2927(Static44.aClass97_6);
			Static44.aClass97_6 = null;
		}
		@Pc(50) int local50 = Static286.anInt5602;
		@Pc(52) int local52;
		for (local52 = 0; local52 < local50; local52++) {
			if (Static144.method2296(Static256.aShortArray81[local52])) {
				Static167.method2663(local52);
			}
		}
		if (Static286.anInt5602 == 1) {
			Static137.aBoolean176 = false;
			Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
		} else {
			Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
			local52 = Static86.aClass4_Sub2_Sub9_3.method4086(Static187.aString131);
			for (@Pc(84) int local84 = 0; local84 < Static286.anInt5602; local84++) {
				@Pc(93) int local93 = Static86.aClass4_Sub2_Sub9_3.method4086(Static149.method2347(local84));
				if (local52 < local93) {
					local52 = local93;
				}
			}
			Static16.anInt356 = local52 + 8;
			Static43.anInt870 = Static286.anInt5602 * 15 + (Static86.aBoolean103 ? 26 : 22);
		}
		if (local36 != null) {
			Static64.method1168(local36, false);
		}
		Static140.method2240(arg0);
		if (Static56.anInt1264 != -1) {
			Static85.method1423(Static56.anInt1264, 1);
		}
		return local13;
	}
}
