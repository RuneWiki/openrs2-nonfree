import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public static int anInt2376;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1106 = Static32.method683("Nehmen");

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
	public static int anInt2388 = 2;

	@OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!nh", name = "ob", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1107 = Static32.method683("");

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Lclient!vg;")
	public static Class85 method1938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class85 local7 = Static140.method2337(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass85Array2 == null || arg1 >= local7.aClass85Array2.length) {
			return null;
		} else {
			return local7.aClass85Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	public static void method1939() {
		aClass49_1106 = null;
		aClass49_1107 = null;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(III)V")
	public static void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)I")
	public static int method1942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method1943() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
	public static void method1945(@OriginalArg(1) int arg0) {
		Static151.anInt3254 += arg0 * 128;
		@Pc(31) int local31;
		if (Static151.anInt3254 > Static167.anIntArray323.length) {
			Static151.anInt3254 -= Static167.anIntArray323.length;
			local31 = (int) (Math.random() * 12.0D);
			Static20.method389(Static185.aClass2_Sub2_Sub2_Sub2Array10[local31]);
		}
		local31 = 0;
		@Pc(44) int local44 = (256 - arg0) * 128;
		@Pc(48) int local48 = arg0 * 128;
		@Pc(77) int local77;
		for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
			local77 = Static34.anIntArray80[local48 + local31] - Static167.anIntArray323[local31 + Static151.anInt3254 & Static167.anIntArray323.length + -1] * arg0 / 6;
			if (local77 < 0) {
				local77 = 0;
			}
			Static34.anIntArray80[local31++] = local77;
		}
		@Pc(100) int local100;
		@Pc(102) int local102;
		@Pc(109) int local109;
		for (local77 = 256 - arg0; local77 < 256; local77++) {
			local100 = local77 * 128;
			for (local102 = 0; local102 < 128; local102++) {
				local109 = (int) (Math.random() * 100.0D);
				if (local109 < 50 && local102 > 10 && local102 < 118) {
					Static34.anIntArray80[local100 + local102] = 255;
				} else {
					Static34.anIntArray80[local102 + local100] = 0;
				}
			}
		}
		if (Static112.anInt2316 > 0) {
			Static112.anInt2316 -= arg0 * 4;
		}
		if (Static85.anInt1806 > 0) {
			Static85.anInt1806 -= arg0 * 4;
		}
		if (Static112.anInt2316 == 0 && Static85.anInt1806 == 0) {
			local100 = (int) ((double) (2000 / arg0) * Math.random());
			if (local100 == 0) {
				Static112.anInt2316 = 1024;
			}
			if (local100 == 1) {
				Static85.anInt1806 = 1024;
			}
		}
		for (local100 = 0; local100 < 256 - arg0; local100++) {
			Static170.anIntArray330[local100] = Static170.anIntArray330[arg0 + local100];
		}
		for (local102 = 256 - arg0; local102 < 256; local102++) {
			Static170.anIntArray330[local102] = (int) (Math.sin((double) Static103.anInt2176 / 14.0D) * 16.0D + Math.sin((double) Static103.anInt2176 / 15.0D) * 14.0D + Math.sin((double) Static103.anInt2176 / 16.0D) * 12.0D);
			Static103.anInt2176++;
		}
		local109 = (arg0 + (Static127.anInt2757 & 0x1)) / 2;
		Static169.anInt3680 += arg0;
		if (local109 <= 0) {
			return;
		}
		@Pc(277) int local277;
		@Pc(284) int local284;
		for (@Pc(268) int local268 = 0; local268 < Static169.anInt3680 * 100; local268++) {
			local277 = (int) (Math.random() * 124.0D) + 2;
			local284 = (int) (Math.random() * 128.0D) + 128;
			Static34.anIntArray80[local277 + (local284 << 7)] = 192;
		}
		Static169.anInt3680 = 0;
		@Pc(315) int local315;
		@Pc(318) int local318;
		for (local277 = 0; local277 < 256; local277++) {
			local284 = 0;
			local315 = local277 * 128;
			for (local318 = -local109; local318 < 128; local318++) {
				if (local109 + local318 < 128) {
					local284 += Static34.anIntArray80[local109 + local315 + local318];
				}
				if (local318 - local109 - 1 >= 0) {
					local284 -= Static34.anIntArray80[local318 + local315 - local109 - 1];
				}
				if (local318 >= 0) {
					Static11.anIntArray14[local318 + local315] = local284 / (local109 * 2 + 1);
				}
			}
		}
		for (local284 = 0; local284 < 128; local284++) {
			local315 = 0;
			for (local318 = -local109; local318 < 256; local318++) {
				@Pc(405) int local405 = local318 * 128;
				if (local109 + local318 < 256) {
					local315 += Static11.anIntArray14[local109 * 128 + local405 + local284];
				}
				if (local318 - local109 - 1 >= 0) {
					local315 -= Static11.anIntArray14[local284 + local405 - (local109 + 1) * 128];
				}
				if (local318 >= 0) {
					Static34.anIntArray80[local405 + local284] = local315 / (local109 * 2 + 1);
				}
			}
		}
	}
}
