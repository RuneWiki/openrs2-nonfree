import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
	public static int anInt230;

	@OriginalMember(owner = "client!ak", name = "W", descriptor = "Lclient!hh;")
	public static Class50 aClass50_105 = Static186.method3527("<col=ff7000>");

	@OriginalMember(owner = "client!ak", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_106 = Static186.method3527("weiss:");

	@OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
	public static int anInt228 = 0;

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[200];

	@OriginalMember(owner = "client!ak", name = "eb", descriptor = "[I")
	public static int[] anIntArray26 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!pg;I)Lclient!pb;")
	public static Class13_Sub4 method178(@OriginalArg(0) Class1_Sub17 arg0) {
		return new Class13_Sub4(arg0.method2167(), arg0.method2167(), arg0.method2167(), arg0.method2167(), arg0.method2135(), arg0.method2135(), arg0.method2142());
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IZ)V")
	public static void method179(@OriginalArg(0) int arg0) {
		Static199.anInt4011 = arg0;
		Static192.anInt3939 = 50;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
	public static void method181() {
		Static121.method1940(false);
		Static78.anInt1572 = 0;
		@Pc(8) boolean local8 = true;
		for (@Pc(14) int local14 = 0; local14 < Static6.aByteArrayArray1.length; local14++) {
			if (Static99.anIntArray520[local14] != -1 && Static6.aByteArrayArray1[local14] == null) {
				Static6.aByteArrayArray1[local14] = Static136.aClass86_Sub1_16.method3325(Static99.anIntArray520[local14], 0);
				if (Static6.aByteArrayArray1[local14] == null) {
					Static78.anInt1572++;
					local8 = false;
				}
			}
			if (Static16.anIntArray34[local14] != -1 && Static64.aByteArrayArray3[local14] == null) {
				Static64.aByteArrayArray3[local14] = Static136.aClass86_Sub1_16.method3309(Static24.anIntArrayArray5[local14], 0, Static16.anIntArray34[local14]);
				if (Static64.aByteArrayArray3[local14] == null) {
					local8 = false;
					Static78.anInt1572++;
				}
			}
			if (Static77.anIntArray126 != null && Static87.aByteArrayArray6[local14] == null && Static77.anIntArray126[local14] != -1) {
				Static87.aByteArrayArray6[local14] = Static136.aClass86_Sub1_16.method3309(Static24.anIntArrayArray5[local14], 0, Static77.anIntArray126[local14]);
				if (Static87.aByteArrayArray6[local14] == null) {
					Static78.anInt1572++;
					local8 = false;
				}
			}
		}
		if (Static201.aClass1_Sub1_Sub6_2 == null || !Static204.aClass86_Sub1_36.method3317(Static17.method257(new Class50[] { Static201.aClass1_Sub1_Sub6_2.aClass50_396, Static67.aClass50_476 }))) {
			Static6.aClass62_1 = null;
		} else if (Static204.aClass86_Sub1_36.method3310(Static17.method257(new Class50[] { Static201.aClass1_Sub1_Sub6_2.aClass50_396, Static67.aClass50_476 }))) {
			Static6.aClass62_1 = Static56.method822(Static204.aClass86_Sub1_36, Static17.method257(new Class50[] { Static201.aClass1_Sub1_Sub6_2.aClass50_396, Static67.aClass50_476 }));
		} else {
			Static78.anInt1572++;
			local8 = false;
		}
		if (!local8) {
			Static75.anInt1527 = 1;
			return;
		}
		local8 = true;
		Static114.anInt2290 = 0;
		@Pc(216) int local216;
		@Pc(227) int local227;
		for (@Pc(198) int local198 = 0; local198 < Static6.aByteArrayArray1.length; local198++) {
			@Pc(204) byte[] local204 = Static64.aByteArrayArray3[local198];
			if (local204 != null) {
				local216 = (Static103.anIntArray197[local198] >> 8) * 64 - Static91.anInt4078;
				local227 = (Static103.anIntArray197[local198] & 0xFF) * 64 - Static101.anInt2041;
				if (Static140.aBoolean123) {
					local216 = 10;
					local227 = 10;
				}
				local8 &= Static53.method803(local204, local216, local227);
			}
		}
		if (!local8) {
			Static75.anInt1527 = 2;
			return;
		}
		if (Static75.anInt1527 != 0) {
			Static77.method1123(true, Static17.method257(new Class50[] { Static32.aClass50_226, Static163.aClass50_1100 }));
		}
		Static192.method3138();
		Static116.method1857();
		Static32.method462();
		for (@Pc(285) int local285 = 0; local285 < 4; local285++) {
			Static22.aClass16Array1[local285].method431();
		}
		@Pc(310) int local310;
		for (local216 = 0; local216 < 4; local216++) {
			for (local227 = 0; local227 < 104; local227++) {
				for (local310 = 0; local310 < 104; local310++) {
					Static159.aByteArrayArrayArray13[local216][local227][local310] = 0;
				}
			}
		}
		Static181.method2963(false);
		Static192.method3138();
		System.gc();
		Static121.method1940(true);
		Static213.method3306();
		if (!Static140.aBoolean123) {
			Static72.method1045();
			Static121.method1940(true);
			Static58.method861();
			if (Static87.aByteArrayArray6 != null) {
				Static138.method2296();
			}
		}
		if (Static140.aBoolean123) {
			Static207.method3277();
			Static121.method1940(true);
			Static82.method1206();
		}
		Static116.method1857();
		Static121.method1940(true);
		Static171.method2820(Static22.aClass16Array1);
		Static121.method1940(true);
		local227 = Static57.anInt1121;
		if (local227 > Static212.anInt4195) {
			local227 = Static212.anInt4195;
		}
		if (local227 < Static212.anInt4195 - 1) {
		}
		if (Static79.method2552()) {
			Static179.method2940(0);
		} else {
			Static179.method2940(Static57.anInt1121);
		}
		Static116.method1860();
		@Pc(425) int local425;
		for (local310 = 0; local310 < 104; local310++) {
			for (local425 = 0; local425 < 104; local425++) {
				Static183.method3009(local310, local425);
			}
		}
		Static49.method763();
		Static192.method3138();
		Static20.method305();
		Static116.method1857();
		if (Static69.aFrame1 != null && Static33.aClass26_2 != null && Static220.anInt4304 == 25) {
			Static32.aClass1_Sub17_Sub1_1.method2182(69);
			Static32.aClass1_Sub17_Sub1_1.method2124(1057001181);
		}
		if (!Static140.aBoolean123) {
			@Pc(480) int local480 = (anInt230 + 6) / 8;
			local425 = (anInt230 - 6) / 8;
			@Pc(492) int local492 = (Static201.anInt4067 - 6) / 8;
			@Pc(498) int local498 = (Static201.anInt4067 + 6) / 8;
			for (@Pc(502) int local502 = local425 - 1; local502 <= local480 + 1; local502++) {
				for (@Pc(508) int local508 = local492 - 1; local508 <= local498 + 1; local508++) {
					if (local502 < local425 || local502 > local480 || local492 > local508 || local508 > local498) {
						Static136.aClass86_Sub1_16.method3333(Static17.method257(new Class50[] { Static183.aClass50_1235, Static160.method2684(local502), Static198.aClass50_1293, Static160.method2684(local508) }));
						Static136.aClass86_Sub1_16.method3333(Static17.method257(new Class50[] { Static122.aClass50_832, Static160.method2684(local502), Static198.aClass50_1293, Static160.method2684(local508) }));
					}
				}
			}
		}
		if (Static220.anInt4304 == 28) {
			Static229.method3481(10);
		} else {
			Static229.method3481(30);
			if (Static33.aClass26_2 != null) {
				Static32.aClass1_Sub17_Sub1_1.method2182(219);
			}
		}
		Static192.method3138();
		Static19.method292();
	}

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
	public static void method182() {
		Static41.aClass84_17.method2576();
		Static182.aClass84_31.method2576();
	}
}
