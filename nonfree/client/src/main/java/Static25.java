import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_13;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_347 = Static24.method441("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
	public static int[] anIntArray100 = new int[256];

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_348 = Static24.method441("Regelversto-8 melden");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!ge;")
	public static Class21 aClass21_7 = new Class21(200);

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_349 = Static24.method441(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_350 = Static24.method441("Bad session id)3");

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_351 = aClass65_350;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_352 = Static24.method441("backvmid2");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
	public static int method447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(28) int local28 = arg0;
		if (arg0 < 3 && (Static50.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
			local28 = arg0 + 1;
		}
		@Pc(51) int local51 = arg2 & 0x7F;
		@Pc(55) int local55 = arg1 & 0x7F;
		@Pc(81) int local81 = Static61.anIntArrayArrayArray6[local28][local7 + 1][local11] * local51 + (128 - local51) * Static61.anIntArrayArrayArray6[local28][local7][local11] >> 7;
		@Pc(111) int local111 = Static61.anIntArrayArrayArray6[local28][local7 + 1][local11 + 1] * local51 + Static61.anIntArrayArrayArray6[local28][local7][local11 + 1] * (128 - local51) >> 336137319;
		return local81 * (128 - local55) + local55 * local111 >> 7;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method448(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static3.anIntArray20[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 51;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method449() {
		anIntArray100 = null;
		aClass65_352 = null;
		aClass65_350 = null;
		aClass65_347 = null;
		aClass33_Sub1_13 = null;
		aClass65_349 = null;
		aClass65_348 = null;
		aClass65_351 = null;
		aClass21_7 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBZ)I")
	public static int method450() {
		return Static20.anInt622 + Static67.anInt2021;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method451() {
		@Pc(14) int local14;
		if (Static29.anInt818 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static29.anInt818 > 768) {
					Static41.anIntArray170[local14] = Static22.method418(1024 - Static29.anInt818, Static100.anIntArray407[local14], Static69.anIntArray279[local14]);
				} else if (Static29.anInt818 <= 256) {
					Static41.anIntArray170[local14] = Static22.method418(256 - Static29.anInt818, Static69.anIntArray279[local14], Static100.anIntArray407[local14]);
				} else {
					Static41.anIntArray170[local14] = Static69.anIntArray279[local14];
				}
			}
		} else if (Static89.anInt2551 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static89.anInt2551 > 768) {
					Static41.anIntArray170[local14] = Static22.method418(1024 - Static89.anInt2551, Static100.anIntArray407[local14], Static90.anIntArray195[local14]);
				} else if (Static89.anInt2551 > 256) {
					Static41.anIntArray170[local14] = Static90.anIntArray195[local14];
				} else {
					Static41.anIntArray170[local14] = Static22.method418(256 - Static89.anInt2551, Static90.anIntArray195[local14], Static100.anIntArray407[local14]);
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static41.anIntArray170[local14] = Static100.anIntArray407[local14];
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static59.aClass15_43.anIntArray257[local14] = Static38.aClass2_Sub1_Sub4_Sub2_5.anIntArray105[local14];
		}
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 1152;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(211) int local211;
		@Pc(216) int local216;
		@Pc(221) int local221;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local180 = (256 - local168) * anIntArray100[local168] / 256;
			local184 = local180 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local164 += local184;
			for (local194 = local184; local194 < 128; local194++) {
				local201 = Static37.anIntArray160[local164++];
				if (local201 == 0) {
					local166++;
				} else {
					local211 = local201;
					local216 = 256 - local201;
					local221 = Static59.aClass15_43.anIntArray257[local166];
					local201 = Static41.anIntArray170[local201];
					Static59.aClass15_43.anIntArray257[local166++] = (local216 * (local221 & 0xFF00) + local211 * (local201 & 0xFF00) & 0xFF0000) + ((local221 & 0xFF00FF) * local216 + (local201 & 0xFF00FF) * local211 & 0xFF00FF00) >> 8;
				}
			}
			local166 += local184;
		}
		local166 = 1176;
		local164 = 0;
		for (local180 = 0; local180 < 33920; local180++) {
			Static50.aClass15_35.anIntArray257[local180] = Static95.aClass2_Sub1_Sub4_Sub2_12.anIntArray105[local180];
		}
		for (local184 = 1; local184 < 255; local184++) {
			local194 = (256 - local184) * anIntArray100[local184] / 256;
			local166 += local194;
			local201 = 103 - local194;
			for (local211 = 0; local211 < local201; local211++) {
				local216 = Static37.anIntArray160[local164++];
				if (local216 == 0) {
					local166++;
				} else {
					local221 = local216;
					@Pc(337) int local337 = 256 - local216;
					local216 = Static41.anIntArray170[local216];
					@Pc(346) int local346 = Static50.aClass15_35.anIntArray257[local166];
					Static50.aClass15_35.anIntArray257[local166++] = ((local216 & 0xFF00FF) * local221 + local337 * (local346 & 0xFF00FF) & 0xFF00FF00) + (local221 * (local216 & 0xFF00) + local337 * (local346 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local164 += 128 - local201;
			local166 += 128 - local201 - local194;
		}
	}
}
