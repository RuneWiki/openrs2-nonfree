import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lclient!c;")
	public static Class10 aClass10_8;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
	public static int anInt800;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "J")
	public static volatile long aLong26 = 0L;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_244 = Static41.method597("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!cb;")
	public static Class12 aClass12_7 = new Class12(64);

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lclient!od;")
	public static Class60 aClass60_245 = Static41.method597("headicons_hint");

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!od;")
	public static Class60 aClass60_246 = Static41.method597("nav");

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lclient!od;")
	public static Class60 aClass60_247 = Static41.method597("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method416() {
		if (Static8.aBoolean3 && Static91.anInt2145 != Static77.anInt1866) {
			Static90.method1472(Static121.anInt2776, Static77.anInt1866, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], Static47.anInt1153, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0]);
		} else if (Static77.anInt1866 != Static117.anInt2725) {
			Static117.anInt2725 = Static77.anInt1866;
			Static103.method1713(Static77.anInt1866);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method419(@OriginalArg(1) int arg0) {
		Static72.anInt1824 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method421() {
		@Pc(5) Object local5 = Static72.anObject4;
		synchronized (Static72.anObject4) {
			if (Static32.anInt941 == 0) {
				Static105.aClass81_4.method1937(5, new Class46());
			}
			Static32.anInt941 = 600;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method422() {
		aClass60_244 = null;
		aClass10_8 = null;
		aClass12_7 = null;
		aByteArrayArray4 = null;
		Class4_Sub3_Sub4.anIntArray85 = null;
		aClass60_245 = null;
		aClass60_246 = null;
		aClass60_247 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method423() {
		if (Static25.aBooleanArray4[96]) {
			Static28.anInt2001 += (-Static28.anInt2001 - 24) / 2;
		} else if (Static25.aBooleanArray4[97]) {
			Static28.anInt2001 += (24 - Static28.anInt2001) / 2;
		} else {
			Static28.anInt2001 /= 2;
		}
		@Pc(44) int local44 = Static12.anInt2546 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440;
		@Pc(49) int local49 = Static50.anInt1418 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407;
		Static79.anInt1896 = Static79.anInt1896 + Static28.anInt2001 / 2 & 0x7FF;
		if (Static25.aBooleanArray4[98]) {
			Static122.anInt2788 += (12 - Static122.anInt2788) / 2;
		} else if (Static25.aBooleanArray4[99]) {
			Static122.anInt2788 += (-Static122.anInt2788 - 12) / 2;
		} else {
			Static122.anInt2788 /= 2;
		}
		if (Static79.anInt1902 - local44 < -500 || Static79.anInt1902 - local44 > 500 || Static83.anInt1957 - local49 < -500 || Static83.anInt1957 - local49 > 500) {
			Static83.anInt1957 = local49;
			Static79.anInt1902 = local44;
		}
		if (local44 != Static79.anInt1902) {
			Static79.anInt1902 += (local44 - Static79.anInt1902) / 16;
		}
		if (local49 != Static83.anInt1957) {
			Static83.anInt1957 += (local49 - Static83.anInt1957) / 16;
		}
		@Pc(159) int local159 = Static79.anInt1902 >> 7;
		Static48.anInt1174 += Static122.anInt2788 / 2;
		@Pc(167) int local167 = 0;
		@Pc(171) int local171 = Static83.anInt1957 >> 7;
		if (Static48.anInt1174 < 128) {
			Static48.anInt1174 = 128;
		}
		if (Static48.anInt1174 > 383) {
			Static48.anInt1174 = 383;
		}
		@Pc(194) int local194 = Static55.method882(Static83.anInt1957, Static79.anInt1902, Static77.anInt1866);
		@Pc(214) int local214;
		if (local159 > 3 && local171 > 3 && local159 < 100 && local171 < 100) {
			for (local214 = local159 - 4; local214 <= local159 + 4; local214++) {
				for (@Pc(220) int local220 = local171 - 4; local220 <= local171 + 4; local220++) {
					@Pc(224) int local224 = Static77.anInt1866;
					if (local224 < 3 && (Static69.aByteArrayArrayArray5[1][local214][local220] & 0x2) == 2) {
						local224++;
					}
					@Pc(250) int local250 = local194 - Static16.anIntArrayArrayArray1[local224][local214][local220];
					if (local167 < local250) {
						local167 = local250;
					}
				}
			}
		}
		local214 = local167 * 192;
		if (local214 > 98048) {
			local214 = 98048;
		}
		if (local214 < 32768) {
			local214 = 32768;
		}
		if (local214 > Static102.anInt2426) {
			Static102.anInt2426 += (local214 - Static102.anInt2426) / 24;
		} else if (local214 < Static102.anInt2426) {
			Static102.anInt2426 += (local214 - Static102.anInt2426) / 80;
			return;
		}
	}
}
