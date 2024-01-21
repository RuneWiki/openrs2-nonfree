import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
	public static int[] anIntArray356;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!ea;")
	private static Class18 aClass18_977 = Static8.method128("Login");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_974 = aClass18_977;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_975 = Static8.method128("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_976 = Static8.method128(" loggt sich ein)3");

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!ea;")
	private static Class18 aClass18_978 = Static8.method128("Walk here");

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!ea;")
	public static Class18 aClass18_979 = aClass18_978;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method2605() {
		aClass18_978 = null;
		aClass18_976 = null;
		aClass18_979 = null;
		anIntArray356 = null;
		aClass18_974 = null;
		aClass18_977 = null;
		aClass18_975 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ef;)Z")
	public static boolean method2606(@OriginalArg(1) Class20 arg0) {
		if (Static33.aBoolean37) {
			if (Static36.method758(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1213 == 0) {
				return false;
			}
		}
		return arg0.aBoolean50;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZI)I")
	public static int method2607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray247.length) {
			return local10.anIntArray247[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIII)V")
	public static void method2608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.anInt2081 == 0 || arg1 == 0 || Static33.anInt1116 >= 50) {
			return;
		}
		Static101.anIntArray268[Static33.anInt1116] = arg2;
		Static71.anIntArray190[Static33.anInt1116] = arg1;
		Static167.anIntArray412[Static33.anInt1116] = arg0;
		Static159.aClass12Array1[Static33.anInt1116] = null;
		Static124.anIntArray312[Static33.anInt1116] = 0;
		Static33.anInt1116++;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	public static void method2609(@OriginalArg(1) int arg0) {
		Static144.anInt3998 += arg0 * 128;
		@Pc(27) int local27;
		if (Static61.anIntArray157.length < Static144.anInt3998) {
			Static144.anInt3998 -= Static61.anIntArray157.length;
			local27 = (int) (Math.random() * 12.0D);
			Static102.method2135(Static163.aClass1_Sub1_Sub8_Sub1Array10[local27]);
		}
		local27 = 0;
		@Pc(47) int local47 = arg0 * 128;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(80) int local80;
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local80 = Static107.anIntArray277[local27 + local47] - Static61.anIntArray157[Static61.anIntArray157.length - 1 & Static144.anInt3998 + local27] * arg0 / 6;
			if (local80 < 0) {
				local80 = 0;
			}
			Static107.anIntArray277[local27++] = local80;
		}
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		for (local80 = 256 - arg0; local80 < 256; local80++) {
			local111 = local80 * 128;
			for (local113 = 0; local113 < 128; local113++) {
				local120 = (int) (Math.random() * 100.0D);
				if (local120 < 50 && local113 > 10 && local113 < 118) {
					Static107.anIntArray277[local111 + local113] = 255;
				} else {
					Static107.anIntArray277[local111 + local113] = 0;
				}
			}
		}
		if (Static72.anInt2208 > 0) {
			Static72.anInt2208 -= arg0 * 4;
		}
		if (Static97.anInt3005 > 0) {
			Static97.anInt3005 -= arg0 * 4;
		}
		if (Static97.anInt3005 == 0 && Static72.anInt2208 == 0) {
			local111 = (int) ((double) (2000 / arg0) * Math.random());
			if (local111 == 0) {
				Static97.anInt3005 = 1024;
			}
			if (local111 == 1) {
				Static72.anInt2208 = 1024;
			}
		}
		for (local111 = 0; local111 < 256 - arg0; local111++) {
			Static166.anIntArray409[local111] = Static166.anIntArray409[local111 + arg0];
		}
		for (local113 = 256 - arg0; local113 < 256; local113++) {
			Static166.anIntArray409[local113] = (int) (Math.sin((double) Static4.anInt152 / 14.0D) * 16.0D + Math.sin((double) Static4.anInt152 / 15.0D) * 14.0D + Math.sin((double) Static4.anInt152 / 16.0D) * 12.0D);
			Static4.anInt152++;
		}
		Static135.anInt3816 += arg0;
		local120 = ((Static41.anInt1322 & 0x1) + arg0) / 2;
		if (local120 <= 0) {
			return;
		}
		@Pc(298) int local298;
		@Pc(291) int local291;
		for (@Pc(282) int local282 = 0; local282 < Static135.anInt3816 * 100; local282++) {
			local291 = (int) (Math.random() * 128.0D) + 128;
			local298 = (int) (Math.random() * 124.0D) + 2;
			Static107.anIntArray277[(local291 << 7) + local298] = 192;
		}
		Static135.anInt3816 = 0;
		@Pc(324) int local324;
		@Pc(327) int local327;
		for (local298 = 0; local298 < 256; local298++) {
			local291 = 0;
			local324 = local298 * 128;
			for (local327 = -local120; local327 < 128; local327++) {
				if (local120 + local327 < 128) {
					local291 += Static107.anIntArray277[local327 + local324 + local120];
				}
				if (local327 - local120 - 1 >= 0) {
					local291 -= Static107.anIntArray277[local327 + local324 - local120 - 1];
				}
				if (local327 >= 0) {
					Static74.anIntArray198[local327 + local324] = local291 / (local120 * 2 + 1);
				}
			}
		}
		for (local291 = 0; local291 < 128; local291++) {
			local324 = 0;
			for (local327 = -local120; local327 < 256; local327++) {
				@Pc(413) int local413 = local327 * 128;
				if (local327 + local120 < 256) {
					local324 += Static74.anIntArray198[local413 + local291 + local120 * 128];
				}
				if (local327 - local120 - 1 >= 0) {
					local324 -= Static74.anIntArray198[local413 + local291 - local120 * 128 - 128];
				}
				if (local327 >= 0) {
					Static107.anIntArray277[local291 + local413] = local324 / (local120 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public static boolean method2610(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
