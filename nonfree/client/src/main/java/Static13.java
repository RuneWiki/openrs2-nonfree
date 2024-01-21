import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public static int anInt365 = 0;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_152 = Static2.method59("null");

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_153 = Static2.method59("Angreifen");

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt368 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public static void method223(@OriginalArg(0) int arg0) {
		Static102.anInt2670 += arg0 * 128;
		@Pc(21) int local21;
		if (Static102.anInt2670 > Static64.anIntArray225.length) {
			Static102.anInt2670 -= Static64.anIntArray225.length;
			local21 = (int) (Math.random() * 12.0D);
			Static92.method1396(Static40.aClass2_Sub1_Sub9_Sub3Array3[local21]);
		}
		local21 = 0;
		@Pc(43) int local43 = arg0 * 128;
		@Pc(50) int local50 = (256 - arg0) * 128;
		@Pc(76) int local76;
		for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
			local76 = Static70.anIntArray246[local21 + local43] - arg0 * Static64.anIntArray225[local21 + Static102.anInt2670 & Static64.anIntArray225.length + -1] / 6;
			if (local76 < 0) {
				local76 = 0;
			}
			Static70.anIntArray246[local21++] = local76;
		}
		@Pc(100) int local100;
		@Pc(102) int local102;
		@Pc(109) int local109;
		for (local76 = 256 - arg0; local76 < 256; local76++) {
			local100 = local76 * 128;
			for (local102 = 0; local102 < 128; local102++) {
				local109 = (int) (Math.random() * 100.0D);
				if (local109 < 50 && local102 > 10 && local102 < 118) {
					Static70.anIntArray246[local102 + local100] = 255;
				} else {
					Static70.anIntArray246[local102 + local100] = 0;
				}
			}
		}
		if (Static66.anInt1859 > 0) {
			Static66.anInt1859 -= arg0 * 4;
		}
		if (Static19.anInt796 > 0) {
			Static19.anInt796 -= arg0 * 4;
		}
		if (Static19.anInt796 == 0 && Static66.anInt1859 == 0) {
			local100 = (int) ((double) (2000 / arg0) * Math.random());
			if (local100 == 0) {
				Static19.anInt796 = 1024;
			}
			if (local100 == 1) {
				Static66.anInt1859 = 1024;
			}
		}
		for (local100 = 0; local100 < 256 - arg0; local100++) {
			Static65.anIntArray230[local100] = Static65.anIntArray230[arg0 + local100];
		}
		for (local102 = 256 - arg0; local102 < 256; local102++) {
			Static65.anIntArray230[local102] = (int) (Math.sin((double) Static20.anInt911 / 14.0D) * 16.0D + Math.sin((double) Static20.anInt911 / 15.0D) * 14.0D + Math.sin((double) Static20.anInt911 / 16.0D) * 12.0D);
			Static20.anInt911++;
		}
		local109 = ((Static10.anInt300 & 0x1) + arg0) / 2;
		Static108.anInt2872 += arg0;
		if (local109 <= 0) {
			return;
		}
		@Pc(291) int local291;
		@Pc(284) int local284;
		for (@Pc(275) int local275 = 0; local275 < Static108.anInt2872 * 100; local275++) {
			local284 = (int) (Math.random() * 128.0D) + 128;
			local291 = (int) (Math.random() * 124.0D) + 2;
			Static70.anIntArray246[(local284 << 7) + local291] = 192;
		}
		Static108.anInt2872 = 0;
		@Pc(321) int local321;
		@Pc(324) int local324;
		for (local291 = 0; local291 < 256; local291++) {
			local284 = 0;
			local321 = local291 * 128;
			for (local324 = -local109; local324 < 128; local324++) {
				if (local324 + local109 < 128) {
					local284 += Static70.anIntArray246[local109 + local321 + local324];
				}
				if (local324 - local109 - 1 >= 0) {
					local284 -= Static70.anIntArray246[local324 + local321 - local109 - 1];
				}
				if (local324 >= 0) {
					Static56.anIntArray217[local321 + local324] = local284 / (local109 * 2 + 1);
				}
			}
		}
		for (local284 = 0; local284 < 128; local284++) {
			local321 = 0;
			for (local324 = -local109; local324 < 256; local324++) {
				@Pc(400) int local400 = local324 * 128;
				if (local324 + local109 < 256) {
					local321 += Static56.anIntArray217[local400 + local284 + local109 * 128];
				}
				if (local324 - local109 - 1 >= 0) {
					local321 -= Static56.anIntArray217[local284 + local400 - local109 * 128 - 128];
				}
				if (local324 >= 0) {
					Static70.anIntArray246[local400 + local284] = local321 / (local109 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method224() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!se;IZ)V")
	public static void method225(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (Static10.anInt300 < arg0.anInt2366) {
			Static90.method1341(arg0);
		} else if (Static10.anInt300 > arg0.anInt2383) {
			Static125.method1782(arg0);
		} else {
			Static126.method1986(arg0);
		}
		if (arg0.anInt2370 < 128 || arg0.anInt2324 < 128 || arg0.anInt2370 >= 13184 || arg0.anInt2324 >= 13184) {
			arg0.anInt2383 = 0;
			arg0.anInt2374 = -1;
			arg0.anInt2362 = -1;
			arg0.anInt2324 = arg0.anIntArray309[0] * 128 + arg0.anInt2364 * 64;
			arg0.anInt2370 = arg0.anIntArray312[0] * 128 + arg0.anInt2364 * 64;
			arg0.anInt2366 = 0;
			arg0.method1437();
		}
		if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1 == arg0 && (arg0.anInt2370 < 1536 || arg0.anInt2324 < 1536 || arg0.anInt2370 >= 11776 || arg0.anInt2324 >= 11776)) {
			arg0.anInt2366 = 0;
			arg0.anInt2324 = arg0.anInt2364 * 64 + arg0.anIntArray309[0] * 128;
			arg0.anInt2383 = 0;
			arg0.anInt2370 = arg0.anIntArray312[0] * 128 + arg0.anInt2364 * 64;
			arg0.anInt2374 = -1;
			arg0.anInt2362 = -1;
			arg0.method1437();
		}
		Static24.method515(arg0);
		Static115.method1864(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method226() {
		aClass80_153 = null;
		aClass80_152 = null;
	}
}
