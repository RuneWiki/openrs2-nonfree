import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "W", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
	public static int anInt154;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_64 = Static186.method3527("welle2:");

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_65 = Static186.method3527("Hidden)2");

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][13][13];

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_66 = Static186.method3527("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_69 = Static186.method3527("");

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_67 = aClass50_69;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_68 = aClass50_69;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Z")
	public static boolean method126(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static27.aShortArray4[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1007;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!qh;II)V")
	public static void method127(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2) {
		if (Static214.anInt4249 != 0 && Static214.anInt4249 != 3 || !arg1.method2909()) {
			return;
		}
		@Pc(22) int local22 = arg1.anIntArray394[arg0];
		if (local22 > arg2 || arg1.anIntArray398[arg0] + local22 < arg2) {
			return;
		}
		@Pc(41) int local41 = arg0 - arg1.anInt3620 / 2;
		@Pc(48) int local48 = arg2 - arg1.anInt3600 / 2;
		@Pc(54) int local54 = Static104.anInt2068 + Static223.anInt4341 & 0x7FF;
		@Pc(58) int local58 = Class120.anIntArray492[local54];
		@Pc(62) int local62 = Class120.anIntArray491[local54];
		@Pc(70) int local70 = (Static106.anInt2129 + 256) * local58 >> 8;
		@Pc(78) int local78 = (Static106.anInt2129 + 256) * local62 >> 8;
		@Pc(93) int local93 = local70 * local41 - local78 * local48 >> 11;
		@Pc(103) int local103 = local70 * local48 + local41 * local78 >> 11;
		@Pc(110) int local110 = local103 + Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7;
		@Pc(118) int local118 = Static230.aClass20_Sub3_Sub1_3.anInt3008 - local93 >> 7;
		if (Static122.anInt2447 > 0 && Static188.aBooleanArray21[82] && Static188.aBooleanArray21[81]) {
			Static16.method231(Static101.anInt2041 + local118, Static212.anInt4195, Static91.anInt4078 + local110);
			return;
		}
		@Pc(163) boolean local163 = Static233.method3515(local110, 1, 0, 0, 0, local118, true, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
		if (!local163) {
			return;
		}
		Static32.aClass1_Sub17_Sub1_1.method2175(local48);
		Static32.aClass1_Sub17_Sub1_1.method2175(local41);
		Static32.aClass1_Sub17_Sub1_1.method2151(Static104.anInt2068);
		Static32.aClass1_Sub17_Sub1_1.method2175(57);
		Static32.aClass1_Sub17_Sub1_1.method2175(Static223.anInt4341);
		Static32.aClass1_Sub17_Sub1_1.method2175(Static106.anInt2129);
		Static32.aClass1_Sub17_Sub1_1.method2175(89);
		Static32.aClass1_Sub17_Sub1_1.method2151(Static230.aClass20_Sub3_Sub1_3.anInt3022);
		Static32.aClass1_Sub17_Sub1_1.method2151(Static230.aClass20_Sub3_Sub1_3.anInt3008);
		Static32.aClass1_Sub17_Sub1_1.method2175(Static181.anInt3752);
		Static32.aClass1_Sub17_Sub1_1.method2175(63);
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method128() {
		Static170.aClass84_30.method2585();
		Static199.aClass84_32.method2585();
		Static201.aClass84_34.method2585();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)Z")
	public static boolean method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static114.anInt2280 + arg0 * Static141.anInt3806 >> 16;
		@Pc(19) int local19 = arg3 * Static141.anInt3806 - arg0 * Static114.anInt2280 >> 16;
		@Pc(29) int local29 = arg1 * Static83.anInt2312 + local19 * Static201.anInt4054 >> 16;
		@Pc(39) int local39 = arg1 * Static201.anInt4054 - local19 * Static83.anInt2312 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static83.anInt2312 + local19 * Static201.anInt4054 >> 16;
		@Pc(76) int local76 = arg2 * Static201.anInt4054 - local19 * Static83.anInt2312 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static16.anInt304 && local87 < Static16.anInt304) {
			return false;
		} else if (local50 > Static73.anInt3193 && local87 > Static73.anInt3193) {
			return false;
		} else if (local56 < Static62.anInt1230 && local93 < Static62.anInt1230) {
			return false;
		} else {
			return local56 <= Static138.anInt2807 || local93 <= Static138.anInt2807;
		}
	}
}
