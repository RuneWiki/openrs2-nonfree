import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
	public static final int anInt3701 = 50;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
	public static int[] anIntArray341 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2198 = Static107.method1838("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	public static int anInt3704 = 0;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
	public static int[] anIntArray342 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
	public static int[] anIntArray344 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "[I")
	public static int[] anIntArray345 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "[I")
	public static int[] anIntArray346 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "[I")
	public static int[] anIntArray347 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2199 = Static107.method1838("rot:");

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lclient!ch;")
	public static Class14 aClass14_187 = new Class14(50);

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "[I")
	public static int[] anIntArray348 = new int[anInt3701];

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array58 = new Class28[anInt3701];

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Lclient!fg;")
	public static Class2_Sub4_Sub10 method2581() {
		if (Static139.aClass2_Sub4_Sub10_1 == null) {
			Static139.aClass2_Sub4_Sub10_1 = new Class2_Sub4_Sub10();
		}
		return Static139.aClass2_Sub4_Sub10_1;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method2582() {
		for (@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) Static80.aClass65_6.method2115(); local15 != null; local15 = (Class2_Sub6) Static80.aClass65_6.method2117()) {
			if (local15.aClass2_Sub4_Sub6_1 != null) {
				local15.method403();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lclient!mh;")
	public static Class52 method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass52_1;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
	public static void method2584() {
		@Pc(13) int local13;
		if (Static62.anInt1684 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static62.anInt1684 > 768) {
					Static142.anIntArray285[local13] = Static125.method2033(1024 - Static62.anInt1684, Static116.anIntArray263[local13], Static35.anIntArray73[local13]);
				} else if (Static62.anInt1684 > 256) {
					Static142.anIntArray285[local13] = Static116.anIntArray263[local13];
				} else {
					Static142.anIntArray285[local13] = Static125.method2033(256 - Static62.anInt1684, Static35.anIntArray73[local13], Static116.anIntArray263[local13]);
				}
			}
		} else if (Static95.anInt2366 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static95.anInt2366 > 768) {
					Static142.anIntArray285[local13] = Static125.method2033(1024 - Static95.anInt2366, Static26.anIntArray63[local13], Static35.anIntArray73[local13]);
				} else if (Static95.anInt2366 <= 256) {
					Static142.anIntArray285[local13] = Static125.method2033(256 - Static95.anInt2366, Static35.anIntArray73[local13], Static26.anIntArray63[local13]);
				} else {
					Static142.anIntArray285[local13] = Static26.anIntArray63[local13];
				}
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				Static142.anIntArray285[local13] = Static35.anIntArray73[local13];
			}
		}
		local13 = 0;
		@Pc(161) int local161 = Static105.aClass2_Sub4_Sub3_Sub4_5.anInt3981 * 9;
		@Pc(163) int local163 = 0;
		@Pc(180) int local180;
		@Pc(190) int local190;
		@Pc(197) int local197;
		@Pc(203) int local203;
		@Pc(222) int local222;
		@Pc(220) int local220;
		for (@Pc(165) int local165 = 1; local165 < 255; local165++) {
			local180 = (256 - local165) * Static74.anIntArray189[local165] / 256 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			local13 += local180;
			for (local190 = local180; local190 < 128; local190++) {
				local197 = Static48.anIntArray106[local13++];
				local203 = Static105.aClass2_Sub4_Sub3_Sub4_5.anIntArray366[local161++];
				if (local197 == 0) {
					Static85.aClass2_Sub4_Sub3_Sub4_3.anIntArray366[local163++] = local203;
				} else {
					local220 = 256 - local197;
					local222 = local197;
					local197 = Static142.anIntArray285[local197];
					Static85.aClass2_Sub4_Sub3_Sub4_3.anIntArray366[local163++] = (local222 * (local197 & 0xFF00) + (local203 & 0xFF00) * local220 & 0xFF0000) + ((local203 & 0xFF00FF) * local220 + local222 * (local197 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local197 = 0; local197 < local180; local197++) {
				Static85.aClass2_Sub4_Sub3_Sub4_3.anIntArray366[local163++] = Static105.aClass2_Sub4_Sub3_Sub4_5.anIntArray366[local161++];
			}
			local161 += Static105.aClass2_Sub4_Sub3_Sub4_5.anInt3981 - 128;
		}
		local163 = 0;
		Static85.aClass2_Sub4_Sub3_Sub4_3.method2823(0, 9);
		local13 = 0;
		local161 = Static105.aClass2_Sub4_Sub3_Sub4_5.anInt3981 * 9 + 128;
		for (local180 = 1; local180 < 255; local180++) {
			local190 = Static74.anIntArray189[local180] * (256 - local180) / 256 + 22;
			if (local190 < 0) {
				local190 = 0;
			}
			for (local197 = 0; local197 < local190; local197++) {
				@Pc(344) int local344 = local163++;
				local161--;
				Static71.aClass2_Sub4_Sub3_Sub4_2.anIntArray366[local344] = Static105.aClass2_Sub4_Sub3_Sub4_5.anIntArray366[local161];
			}
			for (local203 = local190; local203 < 128; local203++) {
				local222 = Static48.anIntArray106[local13++];
				local161--;
				local220 = Static105.aClass2_Sub4_Sub3_Sub4_5.anIntArray366[local161];
				if (local222 == 0) {
					Static71.aClass2_Sub4_Sub3_Sub4_2.anIntArray366[local163++] = local220;
				} else {
					@Pc(374) int local374 = local222;
					@Pc(379) int local379 = 256 - local222;
					local222 = Static142.anIntArray285[local222];
					Static71.aClass2_Sub4_Sub3_Sub4_2.anIntArray366[local163++] = ((local220 & 0xFF00) * local379 + local374 * (local222 & 0xFF00) & 0xFF0000) + (local379 * (local220 & 0xFF00FF) + (local222 & 0xFF00FF) * local374 & 0xFF00FF00) >> 8;
				}
			}
			local13 += local190;
			local161 += Static105.aClass2_Sub4_Sub3_Sub4_5.anInt3981 + 128;
		}
		Static71.aClass2_Sub4_Sub3_Sub4_2.method2823(637, 9);
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void method2589() {
		anIntArray345 = null;
		aClass28_2198 = null;
		aClass28Array58 = null;
		anIntArray348 = null;
		anIntArray346 = null;
		anIntArray347 = null;
		anIntArray344 = null;
		anIntArray342 = null;
		aClass28_2199 = null;
		aClass14_187 = null;
		anIntArray341 = null;
	}
}
