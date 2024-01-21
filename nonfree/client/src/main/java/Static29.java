import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public static int anInt599;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[[Lclient!dd;")
	public static Class4_Sub8[][] aClass4_Sub8ArrayArray1;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!la;")
	public static Class17 aClass17_7;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_241 = Static134.method2017("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!v;")
	private static Class76 aClass76_242 = Static134.method2017("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!v;")
	private static Class76 aClass76_243 = Static134.method2017("Please use a different world)3");

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_244 = aClass76_242;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "[B")
	public static byte[] aByteArray10 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_245 = aClass76_243;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_246 = aClass76_243;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Lclient!ua;")
	public static Class72 aClass72_11 = new Class72(260);

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "[Lclient!fb;")
	public static Class4_Sub4_Sub3_Sub1_Sub1[] aClass4_Sub4_Sub3_Sub1_Sub1Array1 = new Class4_Sub4_Sub3_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public static void method382() {
		if (Static42.aBooleanArray7[98]) {
			Static60.anInt1575 += (12 - Static60.anInt1575) / 2;
		} else if (Static42.aBooleanArray7[99]) {
			Static60.anInt1575 += (-Static60.anInt1575 - 12) / 2;
		} else {
			Static60.anInt1575 /= 2;
		}
		Static5.anInt111 += Static60.anInt1575 / 2;
		if (Static42.aBooleanArray7[96]) {
			Static49.anInt1261 += (-Static49.anInt1261 - 24) / 2;
		} else if (Static42.aBooleanArray7[97]) {
			Static49.anInt1261 += (24 - Static49.anInt1261) / 2;
		} else {
			Static49.anInt1261 /= 2;
		}
		if (Static5.anInt111 < 128) {
			Static5.anInt111 = 128;
		}
		@Pc(83) int local83 = Static28.anInt580 + Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393;
		if (Static5.anInt111 > 383) {
			Static5.anInt111 = 383;
		}
		@Pc(95) int local95 = Static45.anInt1191 + Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416;
		Static60.anInt1576 = Static49.anInt1261 / 2 + Static60.anInt1576 & 0x7FF;
		if (Static101.anInt2307 - local83 < -500 || Static101.anInt2307 - local83 > 500 || Static88.anInt2090 - local95 < -500 || Static88.anInt2090 - local95 > 500) {
			Static101.anInt2307 = local83;
			Static88.anInt2090 = local95;
		}
		if (Static101.anInt2307 != local83) {
			Static101.anInt2307 += (local83 - Static101.anInt2307) / 16;
		}
		if (local95 != Static88.anInt2090) {
			Static88.anInt2090 += (local95 - Static88.anInt2090) / 16;
		}
		@Pc(176) int local176 = Static101.anInt2307 >> 7;
		@Pc(178) int local178 = 0;
		@Pc(182) int local182 = Static88.anInt2090 >> 7;
		@Pc(188) int local188 = Static67.method1133(Static124.anInt2712, Static101.anInt2307, Static88.anInt2090);
		@Pc(204) int local204;
		if (local176 > 3 && local182 > 3 && local176 < 100 && local182 < 100) {
			for (local204 = local176 - 4; local204 <= local176 + 4; local204++) {
				for (@Pc(210) int local210 = local182 - 4; local210 <= local182 + 4; local210++) {
					@Pc(214) int local214 = Static124.anInt2712;
					if (local214 < 3 && (Static62.aByteArrayArrayArray4[1][local204][local210] & 0x2) == 2) {
						local214++;
					}
					@Pc(239) int local239 = local188 - Static66.anIntArrayArrayArray3[local214][local204][local210];
					if (local239 > local178) {
						local178 = local239;
					}
				}
			}
		}
		local204 = local178 * 192;
		if (local204 > 98048) {
			local204 = 98048;
		}
		if (local204 < 32768) {
			local204 = 32768;
		}
		if (Static84.anInt2027 < local204) {
			Static84.anInt2027 += (local204 - Static84.anInt2027) / 24;
		} else if (Static84.anInt2027 > local204) {
			Static84.anInt2027 += (local204 - Static84.anInt2027) / 80;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public static void method383() {
		anIntArrayArrayArray1 = null;
		aClass76_243 = null;
		aClass72_11 = null;
		aClass76_242 = null;
		aClass76_245 = null;
		aClass76_244 = null;
		aClass76_246 = null;
		aClass17_7 = null;
		aClass4_Sub4_Sub3_Sub1_Sub1Array1 = null;
		aByteArray10 = null;
		aClass4_Sub8ArrayArray1 = null;
		aClass76_241 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method384() {
		anIntArrayArrayArray1 = null;
		Static31.aByteArrayArrayArray3 = null;
		Static124.anIntArrayArray27 = null;
		Static49.anIntArray158 = null;
		Static122.anIntArray390 = null;
		Static24.aByteArrayArrayArray1 = null;
		Static84.aByteArrayArrayArray5 = null;
		Static95.anIntArray312 = null;
		Static67.anIntArray232 = null;
		Static123.anIntArray392 = null;
		Static31.aByteArrayArrayArray2 = null;
		Static129.aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static91.anInt2121 = -1;
			Static122.anInt2674 = -1;
			return;
		}
		@Pc(36) int local36 = Static67.method1133(Static124.anInt2712, arg1, arg0) - arg2;
		@Pc(40) int local40 = arg1 - Static106.anInt2354;
		@Pc(44) int local44 = arg0 - Static120.anInt2582;
		@Pc(48) int local48 = local36 - Static96.anInt2222;
		@Pc(52) int local52 = Class4_Sub4_Sub5_Sub1.anIntArray118[Static103.anInt2317];
		@Pc(56) int local56 = Class4_Sub4_Sub5_Sub1.anIntArray119[Static74.anInt1911];
		@Pc(60) int local60 = Class4_Sub4_Sub5_Sub1.anIntArray118[Static74.anInt1911];
		@Pc(69) int local69 = Class4_Sub4_Sub5_Sub1.anIntArray119[Static103.anInt2317];
		@Pc(79) int local79 = local69 * local40 + local52 * local44 >> 16;
		@Pc(89) int local89 = local69 * local44 - local40 * local52 >> 16;
		@Pc(91) int local91 = local79;
		@Pc(101) int local101 = local56 * local48 - local89 * local60 >> 16;
		@Pc(112) int local112 = local48 * local60 + local89 * local56 >> 16;
		if (local112 >= 50) {
			Static91.anInt2121 = (local101 << 9) / local112 + 167;
			Static122.anInt2674 = (local91 << 9) / local112 + 256;
		} else {
			Static91.anInt2121 = -1;
			Static122.anInt2674 = -1;
		}
	}
}
