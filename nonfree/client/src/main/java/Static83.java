import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_936 = Static109.method1737("Lade Texturen )2 ");

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_938 = Static109.method1737("Login");

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_937 = aClass53_938;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_939 = Static109.method1737("@yel@*V");

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_940 = Static109.method1737("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "[I")
	public static int[] anIntArray268 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method1427(@OriginalArg(1) int arg0) {
		Static52.anInt1349 += arg0 * 128;
		@Pc(30) int local30;
		if (Static52.anInt1349 > Static124.anIntArray417.length) {
			local30 = (int) (Math.random() * 12.0D);
			Static52.anInt1349 -= Static124.anIntArray417.length;
			Static9.method135(Static45.aClass3_Sub1_Sub5_Sub3Array4[local30]);
		}
		local30 = 0;
		@Pc(46) int local46 = arg0 * 128;
		@Pc(53) int local53 = (256 - arg0) * 128;
		@Pc(80) int local80;
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local80 = Static106.anIntArray322[local46 + local30] - Static124.anIntArray417[local30 + Static52.anInt1349 & Static124.anIntArray417.length - 1] * arg0 / 6;
			if (local80 < 0) {
				local80 = 0;
			}
			Static106.anIntArray322[local30++] = local80;
		}
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(117) int local117;
		for (local80 = 256 - arg0; local80 < 256; local80++) {
			local108 = local80 * 128;
			for (local110 = 0; local110 < 128; local110++) {
				local117 = (int) (Math.random() * 100.0D);
				if (local117 < 50 && local110 > 10 && local110 < 118) {
					Static106.anIntArray322[local110 + local108] = 255;
				} else {
					Static106.anIntArray322[local108 + local110] = 0;
				}
			}
		}
		if (Static123.anInt2862 > 0) {
			Static123.anInt2862 -= arg0 * 4;
		}
		if (Static111.anInt2582 > 0) {
			Static111.anInt2582 -= arg0 * 4;
		}
		if (Static123.anInt2862 == 0 && Static111.anInt2582 == 0) {
			local108 = (int) (Math.random() * (double) (2000 / arg0));
			if (local108 == 1) {
				Static111.anInt2582 = 1024;
			}
			if (local108 == 0) {
				Static123.anInt2862 = 1024;
			}
		}
		for (local108 = 0; local108 < 256 - arg0; local108++) {
			Static102.anIntArray318[local108] = Static102.anIntArray318[local108 + arg0];
		}
		for (local110 = 256 - arg0; local110 < 256; local110++) {
			Static102.anIntArray318[local110] = (int) (Math.sin((double) Static86.anInt2081 / 14.0D) * 16.0D + Math.sin((double) Static86.anInt2081 / 15.0D) * 14.0D + Math.sin((double) Static86.anInt2081 / 16.0D) * 12.0D);
			Static86.anInt2081++;
		}
		Static109.anInt2494 += arg0;
		local117 = (arg0 + (Static27.anInt843 & 0x1)) / 2;
		if (local117 <= 0) {
			return;
		}
		@Pc(294) int local294;
		@Pc(301) int local301;
		for (@Pc(285) int local285 = 0; local285 < Static109.anInt2494 * 100; local285++) {
			local294 = (int) (Math.random() * 124.0D) + 2;
			local301 = (int) (Math.random() * 128.0D) + 128;
			Static106.anIntArray322[local294 + (local301 << 7)] = 192;
		}
		Static109.anInt2494 = 0;
		@Pc(328) int local328;
		@Pc(331) int local331;
		for (local294 = 0; local294 < 256; local294++) {
			local301 = 0;
			local328 = local294 * 128;
			for (local331 = -local117; local331 < 128; local331++) {
				if (local117 + local331 < 128) {
					local301 += Static106.anIntArray322[local331 + local328 + local117];
				}
				if (local331 - local117 - 1 >= 0) {
					local301 -= Static106.anIntArray322[local328 + local331 - local117 - 1];
				}
				if (local331 >= 0) {
					Static41.anIntArray143[local331 + local328] = local301 / (local117 * 2 + 1);
				}
			}
		}
		for (local301 = 0; local301 < 128; local301++) {
			local328 = 0;
			for (local331 = -local117; local331 < 256; local331++) {
				@Pc(413) int local413 = local331 * 128;
				if (local331 + local117 < 256) {
					local328 += Static41.anIntArray143[local117 * 128 + local413 + local301];
				}
				if (local331 - local117 - 1 >= 0) {
					local328 -= Static41.anIntArray143[local413 + local301 - local117 * 128 - 128];
				}
				if (local331 >= 0) {
					Static106.anIntArray322[local413 + local301] = local328 / (local117 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public static void method1428() {
		anIntArray268 = null;
		aClass53_937 = null;
		aClass53_939 = null;
		aClass53_936 = null;
		aClass53_940 = null;
		aClass53_938 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZZ)V")
	public static void method1429(@OriginalArg(0) boolean arg0) {
		Static40.method820();
		Static79.anInt1980++;
		if (Static79.anInt1980 < 50 && !arg0) {
			return;
		}
		Static79.anInt1980 = 0;
		if (Static41.aBoolean42 || Static40.aClass37_2 == null) {
			return;
		}
		Static115.aClass3_Sub7_Sub1_3.method662(36);
		try {
			Static40.aClass37_2.method953(Static115.aClass3_Sub7_Sub1_3.anInt964, Static115.aClass3_Sub7_Sub1_3.aByteArray15);
			Static115.aClass3_Sub7_Sub1_3.anInt964 = 0;
		} catch (@Pc(47) IOException local47) {
			Static41.aBoolean42 = true;
		}
	}
}
