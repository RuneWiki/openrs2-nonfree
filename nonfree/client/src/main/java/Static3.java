import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "[Lclient!jc;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "Lclient!rb;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public static int anInt74;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub26 aClass5_Sub2_Sub26_1;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_32 = Static161.method2452("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_33 = Static161.method2452("sl_arrows");

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_34 = Static161.method2452("Error connecting to server)3");

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_35 = Static161.method2452("<col=ffffff>");

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_36 = aClass20_32;

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_37 = Static161.method2452("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_38 = aClass20_34;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_40 = Static161.method2452("Existing User");

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_39 = aClass20_40;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public static void method95() {
		if (Static14.aBoolean14 && Static38.anInt829 != Static111.anInt2327) {
			Static90.method1500(Static111.anInt2327, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], Static119.anInt2546, Static132.anInt3723);
		} else if (Static118.anInt3279 != Static111.anInt2327) {
			Static118.anInt3279 = Static111.anInt2327;
			Static182.method2758(Static111.anInt2327);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public static void method96(@OriginalArg(1) int arg0) {
		Static103.anInt2176 += arg0 * 128;
		@Pc(22) int local22;
		if (Static103.anInt2176 > Static183.anIntArray379.length) {
			local22 = (int) (Math.random() * 12.0D);
			Static103.anInt2176 -= Static183.anIntArray379.length;
			Static217.method3204(Static143.aClass47_Sub1Array1[local22]);
		}
		local22 = 0;
		@Pc(51) int local51 = (256 - arg0) * 128;
		@Pc(55) int local55 = arg0 * 128;
		@Pc(81) int local81;
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			local81 = Static90.anIntArray190[local22 + local55] - Static183.anIntArray379[Static103.anInt2176 + local22 & Static183.anIntArray379.length + -1] * arg0 / 6;
			if (local81 < 0) {
				local81 = 0;
			}
			Static90.anIntArray190[local22++] = local81;
		}
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		for (local81 = 256 - arg0; local81 < 256; local81++) {
			local111 = local81 * 128;
			for (local113 = 0; local113 < 128; local113++) {
				local120 = (int) (Math.random() * 100.0D);
				if (local120 < 50 && local113 > 10 && local113 < 118) {
					Static90.anIntArray190[local111 + local113] = 255;
				} else {
					Static90.anIntArray190[local113 + local111] = 0;
				}
			}
		}
		if (Static28.anInt537 > 0) {
			Static28.anInt537 -= arg0 * 4;
		}
		if (Static55.anInt1158 > 0) {
			Static55.anInt1158 -= arg0 * 4;
		}
		if (Static28.anInt537 == 0 && Static55.anInt1158 == 0) {
			local111 = (int) (Math.random() * (double) (2000 / arg0));
			if (local111 == 0) {
				Static28.anInt537 = 1024;
			}
			if (local111 == 1) {
				Static55.anInt1158 = 1024;
			}
		}
		for (local111 = 0; local111 < 256 - arg0; local111++) {
			Static62.anIntArray128[local111] = Static62.anIntArray128[local111 + arg0];
		}
		for (local113 = 256 - arg0; local113 < 256; local113++) {
			Static62.anIntArray128[local113] = (int) (Math.sin((double) Static203.anInt3986 / 14.0D) * 16.0D + Math.sin((double) Static203.anInt3986 / 15.0D) * 14.0D + Math.sin((double) Static203.anInt3986 / 16.0D) * 12.0D);
			Static203.anInt3986++;
		}
		Static27.anInt497 += arg0;
		local120 = ((Static177.anInt3533 & 0x1) + arg0) / 2;
		if (local120 <= 0) {
			return;
		}
		@Pc(285) int local285;
		@Pc(292) int local292;
		for (@Pc(276) int local276 = 0; local276 < Static27.anInt497 * 100; local276++) {
			local285 = (int) (Math.random() * 124.0D) + 2;
			local292 = (int) (Math.random() * 128.0D) + 128;
			Static90.anIntArray190[(local292 << 7) + local285] = 192;
		}
		Static27.anInt497 = 0;
		@Pc(316) int local316;
		@Pc(321) int local321;
		for (local285 = 0; local285 < 256; local285++) {
			local316 = local285 * 128;
			local292 = 0;
			for (local321 = -local120; local321 < 128; local321++) {
				if (local120 + local321 < 128) {
					local292 += Static90.anIntArray190[local120 + local321 + local316];
				}
				if (local321 - local120 - 1 >= 0) {
					local292 -= Static90.anIntArray190[local316 + local321 - local120 - 1];
				}
				if (local321 >= 0) {
					Static54.anIntArray108[local316 + local321] = local292 / (local120 * 2 + 1);
				}
			}
		}
		for (local292 = 0; local292 < 128; local292++) {
			local316 = 0;
			for (local321 = -local120; local321 < 256; local321++) {
				@Pc(401) int local401 = local321 * 128;
				if (local120 + local321 < 256) {
					local316 += Static54.anIntArray108[local120 * 128 + local292 + local401];
				}
				if (local321 - local120 - 1 >= 0) {
					local316 -= Static54.anIntArray108[local292 + local401 - local120 * 128 - 128];
				}
				if (local321 >= 0) {
					Static90.anIntArray190[local292 + local401] = local316 / (local120 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IBI)Lclient!dc;")
	public static Class20 method97(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static204.aClass20_1494;
		} else if (local7 < -6) {
			return Static184.aClass20_1359;
		} else if (local7 < -3) {
			return Static103.aClass20_809;
		} else if (local7 < 0) {
			return Static170.aClass20_1260;
		} else if (local7 > 9) {
			return Static200.aClass20_1477;
		} else if (local7 > 6) {
			return Static142.aClass20_1119;
		} else if (local7 > 3) {
			return Static86.aClass20_687;
		} else if (local7 > 0) {
			return Static209.aClass20_1515;
		} else {
			return Static43.aClass20_330;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mf;BII)V")
	public static void method99(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static48.aClass69_4 != null || Static104.aBoolean95 || (arg0 == null || Static85.method1458(arg0) == null)) {
			return;
		}
		Static48.aClass69_4 = arg0;
		Static119.aClass69_9 = Static85.method1458(arg0);
		Static65.anInt1420 = arg2;
		Static37.anInt1355 = 0;
		Static11.aBoolean11 = false;
		Static140.anInt2922 = arg1;
	}
}
