import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public static int anInt2425;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array11;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	public static int anInt2422 = 0;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1017 = Static119.method1462("lila:");

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1020 = Static119.method1462(" from your friend list first");

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1019 = aClass65_1020;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
	public static final int anInt2428 = 2301979;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class2_Sub1_Sub7 method1744(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub7 local10 = (Class2_Sub1_Sub7) Static43.aClass8_29.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static57.aClass56_21.method1666(arg0, 14);
		local10 = new Class2_Sub1_Sub7();
		if (local20 != null) {
			local10.method843(new Class2_Sub4(local20));
		}
		Static43.aClass8_29.method176((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIIIIILclient!na;)V")
	public static void method1745(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class56 arg3) {
		Static121.aBoolean105 = false;
		Static44.anInt1080 = 1;
		Static79.anInt1731 = 2;
		Static78.aClass56_26 = arg3;
		anInt2425 = arg2;
		Static39.anInt839 = arg1;
		Static133.anInt2917 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wa;B)Lclient!pe;")
	public static Class65 method1746(@OriginalArg(0) Class2_Sub22 arg0) {
		if (Static83.method1356(Static114.method1834(arg0)) == 0) {
			return null;
		} else if (arg0.aClass65_1222 == null || arg0.aClass65_1222.method1474().method1502() == 0) {
			return Static12.aBoolean14 ? Static90.aClass65_844 : null;
		} else {
			return arg0.aClass65_1222;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method1747() {
		if (!Static3.aBoolean5) {
			Static126.anIntArray355[0] = 1005;
			Static49.anInt1205 = 1;
			Static83.aClass65Array39[0] = Static105.aClass65_995;
			Static83.aClass65Array40[0] = Static110.aClass65_1038;
		}
		if (Static17.anInt384 != -1) {
			Static40.method673(Static17.anInt384);
		}
		for (@Pc(29) int local29 = 0; local29 < Static17.anInt392; local29++) {
			if (Static100.aBooleanArray16[local29]) {
				Static9.aBooleanArray3[local29] = true;
			}
			Static67.aBooleanArray11[local29] = Static100.aBooleanArray16[local29];
			Static100.aBooleanArray16[local29] = false;
		}
		Static35.anInt794 = -1;
		Static40.anInt846 = -1;
		Static102.aClass2_Sub22_13 = null;
		Static22.anInt548 = Static10.anInt2951;
		if (Static17.anInt384 != -1) {
			Static17.anInt392 = 0;
			Static32.method623(765, 0, 0, 503, -1, Static17.anInt384, 0, 0);
		}
		Static118.method2070();
		Static106.method1723();
		if (Static3.aBoolean5) {
			Static83.method1354();
		} else if (Static40.anInt846 != -1) {
			Static107.method1737(Static35.anInt794, Static40.anInt846);
		}
		if (Static20.anInt520 == 3) {
			for (@Pc(108) int local108 = 0; local108 < Static17.anInt392; local108++) {
				if (Static67.aBooleanArray11[local108]) {
					Static118.method2063(Static41.anIntArray117[local108], Static95.anIntArray284[local108], Static47.anIntArray143[local108], Static115.anIntArray335[local108], 16711935, 128);
				} else if (Static9.aBooleanArray3[local108]) {
					Static118.method2063(Static41.anIntArray117[local108], Static95.anIntArray284[local108], Static47.anIntArray143[local108], Static115.anIntArray335[local108], 16711680, 128);
				}
			}
		}
		Static107.method1730(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948, Static59.anInt1479, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958, Static117.anInt2579);
		Static117.anInt2579 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
	public static void method1748() {
		if (Static35.aBooleanArray6[96]) {
			Static28.anInt696 += (-Static28.anInt696 - 24) / 2;
		} else if (Static35.aBooleanArray6[97]) {
			Static28.anInt696 += (24 - Static28.anInt696) / 2;
		} else {
			Static28.anInt696 /= 2;
		}
		if (Static35.aBooleanArray6[98]) {
			Static41.anInt1014 += (12 - Static41.anInt1014) / 2;
		} else if (Static35.aBooleanArray6[99]) {
			Static41.anInt1014 += (-Static41.anInt1014 - 12) / 2;
		} else {
			Static41.anInt1014 /= 2;
		}
		Static82.anInt2719 = Static82.anInt2719 + Static28.anInt696 / 2 & 0x7FF;
		Static44.anInt1082 += Static41.anInt1014 / 2;
		if (Static44.anInt1082 < 128) {
			Static44.anInt1082 = 128;
		}
		@Pc(99) int local99 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 + Static84.anInt1812;
		if (Static44.anInt1082 > 383) {
			Static44.anInt1082 = 383;
		}
		@Pc(117) int local117 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 + Static4.anInt1236;
		@Pc(119) int local119 = 0;
		if (Static41.anInt1012 - local99 < -500 || Static41.anInt1012 - local99 > 500 || Static133.anInt2927 - local117 < -500 || Static133.anInt2927 - local117 > 500) {
			Static133.anInt2927 = local117;
			Static41.anInt1012 = local99;
		}
		if (local99 != Static41.anInt1012) {
			Static41.anInt1012 += (local99 - Static41.anInt1012) / 16;
		}
		@Pc(164) int local164 = Static41.anInt1012 >> 7;
		if (local117 != Static133.anInt2927) {
			Static133.anInt2927 += (local117 - Static133.anInt2927) / 16;
		}
		@Pc(180) int local180 = Static133.anInt2927 >> 7;
		@Pc(186) int local186 = Static106.method1718(Static133.anInt2927, Static41.anInt1012, Static59.anInt1479);
		@Pc(206) int local206;
		if (local164 > 3 && local180 > 3 && local164 < 100 && local180 < 100) {
			for (local206 = local164 - 4; local206 <= local164 + 4; local206++) {
				for (@Pc(212) int local212 = local180 - 4; local212 <= local180 + 4; local212++) {
					@Pc(216) int local216 = Static59.anInt1479;
					if (local216 < 3 && (Static88.aByteArrayArrayArray3[1][local206][local212] & 0x2) == 2) {
						local216++;
					}
					@Pc(244) int local244 = local186 - Static67.anIntArrayArrayArray8[local216][local206][local212];
					if (local244 > local119) {
						local119 = local244;
					}
				}
			}
		}
		local206 = local119 * 192;
		if (local206 > 98048) {
			local206 = 98048;
		}
		if (local206 < 32768) {
			local206 = 32768;
		}
		if (Static37.anInt813 < local206) {
			Static37.anInt813 += (local206 - Static37.anInt813) / 24;
		} else if (local206 < Static37.anInt813) {
			Static37.anInt813 += (local206 - Static37.anInt813) / 80;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method1749() {
		aShortArrayArray5 = null;
		aClass2_Sub1_Sub4_Sub1Array11 = null;
		aClass65_1017 = null;
		aClass65_1020 = null;
		aClass65_1019 = null;
	}
}
