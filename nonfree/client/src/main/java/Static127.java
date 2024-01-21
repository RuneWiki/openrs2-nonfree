import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 aClass1_Sub1_Sub12_Sub4_5;

	@OriginalMember(owner = "client!pf", name = "kb", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
	public static int anInt3355 = 0;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
	public static int[] anIntArray441 = new int[1000];

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1252 = Static169.method2903("Loaded wordpack");

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1251 = aClass23_1252;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
	public static int anInt3360 = 0;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)Z")
	public static boolean method2273(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
	public static int method2274() {
		@Pc(7) int local7 = 3;
		if (Static46.anInt4326 < 310) {
			@Pc(14) int local14 = Static162.anInt3999 >> 7;
			@Pc(18) int local18 = Static166.anInt4090 >> 7;
			if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][local14][local18] & 0x4) != 0) {
				local7 = Static85.anInt2267;
			}
			@Pc(35) int local35 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7;
			@Pc(40) int local40 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 >> 7;
			@Pc(52) int local52;
			if (local14 >= local35) {
				local52 = local14 - local35;
			} else {
				local52 = local35 - local14;
			}
			@Pc(69) int local69;
			if (local40 > local18) {
				local69 = local40 - local18;
			} else {
				local69 = local18 - local40;
			}
			@Pc(85) int local85;
			@Pc(87) int local87;
			if (local69 < local52) {
				local85 = local69 * 65536 / local52;
				local87 = 32768;
				while (local35 != local14) {
					local87 += local85;
					if (local14 < local35) {
						local14++;
					} else if (local14 > local35) {
						local14--;
					}
					if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][local14][local18] & 0x4) != 0) {
						local7 = Static85.anInt2267;
					}
					if (local87 >= 65536) {
						local87 -= 65536;
						if (local40 > local18) {
							local18++;
						} else if (local18 > local40) {
							local18--;
						}
						if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][local14][local18] & 0x4) != 0) {
							local7 = Static85.anInt2267;
						}
					}
				}
			} else {
				local87 = 32768;
				local85 = local52 * 65536 / local69;
				while (local40 != local18) {
					local87 += local85;
					if (local18 < local40) {
						local18++;
					} else if (local40 < local18) {
						local18--;
					}
					if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][local14][local18] & 0x4) != 0) {
						local7 = Static85.anInt2267;
					}
					if (local87 >= 65536) {
						local87 -= 65536;
						if (local14 < local35) {
							local14++;
						} else if (local14 > local35) {
							local14--;
						}
						if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][local14][local18] & 0x4) != 0) {
							local7 = Static85.anInt2267;
						}
					}
				}
			}
		}
		if ((Static12.aByteArrayArrayArray11[Static85.anInt2267][Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7][Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 >> 7] & 0x4) != 0) {
			local7 = Static85.anInt2267;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public static void method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg0;
		@Pc(15) int[] local15 = new int[4];
		@Pc(17) int local17 = 1;
		local15[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg0 != Static96.anIntArray310[local23]) {
				local8[local17] = Static96.anIntArray310[local23];
				local15[local17] = Static108.anIntArray251[local23];
				local17++;
			}
		}
		Static96.anIntArray310 = local8;
		Static108.anIntArray251 = local15;
		Static122.method2771(Static98.aClass78Array1, Static108.anIntArray251, Static98.aClass78Array1.length - 1, 0, Static96.anIntArray310);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
	public static void method2277() {
		anIntArray442 = null;
		aClass23_1251 = null;
		aClass23_1252 = null;
		aClass1_Sub1_Sub12_Sub4_5 = null;
		anIntArray441 = null;
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method2278() {
		if (!Static164.aBoolean201) {
			Static37.anIntArray124[0] = 1003;
			Static102.aClass23Array11[0] = Static139.aClass23_1332;
			Static38.anInt1037 = 1;
			Static104.aClass23Array12[0] = Static101.aClass23_1001;
		}
		if (Static165.anInt4050 != -1) {
			Static75.method1346(Static165.anInt4050);
		}
		for (@Pc(29) int local29 = 0; local29 < Static112.anInt2869; local29++) {
			if (Static98.aBooleanArray12[local29]) {
				Static18.aBooleanArray5[local29] = true;
			}
			Static8.aBooleanArray3[local29] = Static98.aBooleanArray12[local29];
			Static98.aBooleanArray12[local29] = false;
		}
		Static79.anInt2156 = -1;
		Static149.aClass60_14 = null;
		Static54.anInt1547 = Static26.anInt845;
		Static166.anInt4091 = -1;
		if (Static165.anInt4050 != -1) {
			Static112.anInt2869 = 0;
			Static47.method764(0, 0, 0, 765, 503, 0, Static165.anInt4050, -1);
		}
		Static150.method3016();
		Static142.method2475();
		if (Static164.aBoolean201) {
			Static164.method2831();
		} else if (Static166.anInt4091 != -1) {
			Static48.method783(Static166.anInt4091, Static79.anInt2156);
		}
		if (Static20.anInt670 == 3) {
			for (@Pc(106) int local106 = 0; local106 < Static112.anInt2869; local106++) {
				if (Static8.aBooleanArray3[local106]) {
					Static150.method3020(Static87.anIntArray121[local106], Static103.anIntArray345[local106], Static23.anIntArray97[local106], Static18.anIntArray79[local106], 16711935, 128);
				} else if (Static18.aBooleanArray5[local106]) {
					Static150.method3020(Static87.anIntArray121[local106], Static103.anIntArray345[local106], Static23.anIntArray97[local106], Static18.anIntArray79[local106], 16711680, 128);
				}
			}
		}
		Static11.method216(Static85.anInt2267, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838, Static58.anInt1635);
		Static58.anInt1635 = 0;
	}
}
