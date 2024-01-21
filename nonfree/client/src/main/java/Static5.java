import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!sh;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!sg;")
	private static Class77 aClass77_54 = Static146.method2172("button near the top of that page)3");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_55 = aClass77_54;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_56 = Static146.method2172("leuchten1:");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public static void method97(@OriginalArg(1) int arg0) {
		Static175.anInt4465 += arg0 * 128;
		@Pc(35) int local35;
		if (Static175.anInt4465 > Static133.anIntArray476.length) {
			Static175.anInt4465 -= Static133.anIntArray476.length;
			local35 = (int) (Math.random() * 12.0D);
			Static128.method2198(Static4.aClass2_Sub2_Sub3_Sub3Array19[local35]);
		}
		local35 = 0;
		@Pc(46) int local46 = arg0 * 128;
		@Pc(52) int local52 = (256 - arg0) * 128;
		@Pc(78) int local78;
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			local78 = Static16.anIntArray72[local35 + local46] - arg0 * Static133.anIntArray476[Static133.anIntArray476.length - 1 & local35 + Static175.anInt4465] / 6;
			if (local78 < 0) {
				local78 = 0;
			}
			Static16.anIntArray72[local35++] = local78;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local78 = 256 - arg0; local78 < 256; local78++) {
			local105 = local78 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static16.anIntArray72[local107 + local105] = 255;
				} else {
					Static16.anIntArray72[local107 + local105] = 0;
				}
			}
		}
		if (Static138.anInt3343 > 0) {
			Static138.anInt3343 -= arg0 * 4;
		}
		if (Static158.anInt3916 > 0) {
			Static158.anInt3916 -= arg0 * 4;
		}
		if (Static158.anInt3916 == 0 && Static138.anInt3343 == 0) {
			local105 = (int) ((double) (2000 / arg0) * Math.random());
			if (local105 == 0) {
				Static158.anInt3916 = 1024;
			}
			if (local105 == 1) {
				Static138.anInt3343 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static170.anIntArray600[local105] = Static170.anIntArray600[arg0 + local105];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static170.anIntArray600[local107] = (int) (Math.sin((double) Static34.anInt1022 / 14.0D) * 16.0D + Math.sin((double) Static34.anInt1022 / 15.0D) * 14.0D + Math.sin((double) Static34.anInt1022 / 16.0D) * 12.0D);
			Static34.anInt1022++;
		}
		Static123.anInt3020 += arg0;
		local114 = ((Static143.anInt3513 & 0x1) + arg0) / 2;
		if (local114 <= 0) {
			return;
		}
		@Pc(287) int local287;
		@Pc(294) int local294;
		for (@Pc(278) int local278 = 0; local278 < Static123.anInt3020 * 100; local278++) {
			local287 = (int) (Math.random() * 124.0D) + 2;
			local294 = (int) (Math.random() * 128.0D) + 128;
			Static16.anIntArray72[local287 + (local294 << 7)] = 192;
		}
		Static123.anInt3020 = 0;
		@Pc(323) int local323;
		@Pc(328) int local328;
		for (local287 = 0; local287 < 256; local287++) {
			local323 = local287 * 128;
			local294 = 0;
			for (local328 = -local114; local328 < 128; local328++) {
				if (local114 + local328 < 128) {
					local294 += Static16.anIntArray72[local114 + local323 + local328];
				}
				if (local328 - local114 - 1 >= 0) {
					local294 -= Static16.anIntArray72[local328 + local323 - local114 - 1];
				}
				if (local328 >= 0) {
					Static1.anIntArray3[local323 + local328] = local294 / (local114 * 2 + 1);
				}
			}
		}
		for (local294 = 0; local294 < 128; local294++) {
			local323 = 0;
			for (local328 = -local114; local328 < 256; local328++) {
				@Pc(406) int local406 = local328 * 128;
				if (local114 + local328 < 256) {
					local323 += Static1.anIntArray3[local114 * 128 + local294 + local406];
				}
				if (local328 - local114 - 1 >= 0) {
					local323 -= Static1.anIntArray3[local406 + local294 - (local114 + 1) * 128];
				}
				if (local328 >= 0) {
					Static16.anIntArray72[local294 + local406] = local323 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Z")
	public static boolean method98(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(21) Class2_Sub2_Sub4 local21 = (Class2_Sub2_Sub4) Static42.aClass74_4.method2433(local10);
		if (local21 != null) {
			Static173.aClass85_2.method2761(local21);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static176.anInt4482; local1++) {
			if (arg2 < Static56.anIntArray233[local1] + Static94.anIntArray385[local1] && arg2 + arg1 > Static56.anIntArray233[local1] && Static98.anIntArray396[local1] + Static74.anIntArray330[local1] > arg3 && arg3 + arg0 > Static74.anIntArray330[local1]) {
				Static103.aBooleanArray9[local1] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method101() {
		aClass78_1 = null;
		aClass77_56 = null;
		aClass77_54 = null;
		aClass77_55 = null;
	}
}
