import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!ie;")
	public static Class35 aClass35_20;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public static int anInt2062;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public static int anInt2063;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_11;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
	public static boolean aBoolean109;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt2054 = 0;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean108 = false;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[S")
	public static short[] aShortArray8 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!qd;")
	public static Class63 aClass63_12 = new Class63(100);

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public static volatile int anInt2060 = 0;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!qd;")
	public static Class63 aClass63_13 = new Class63(50);

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public static final int anInt2065 = 50;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array19 = new Class34[anInt2065];

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
	public static int[] anIntArray233 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
	public static int[] anIntArray234 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public static final int anInt2061 = 3353893;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
	public static int[] anIntArray235 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public static int anInt2064 = -1;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
	public static int[] anIntArray236 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "A", descriptor = "[I")
	public static int[] anIntArray238 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[I")
	public static int[] anIntArray239 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_1014 = Static9.method266("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
	public static int[] anIntArray240 = new int[anInt2065];

	@OriginalMember(owner = "client!md", name = "F", descriptor = "[S")
	public static short[] aShortArray9 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Lclient!id;")
	public static Class34 aClass34_1015 = Static9.method266("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Lclient!id;")
	public static Class34 aClass34_1016 = Static9.method266("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!md", name = "I", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1345() {
		if (Static56.aBooleanArray15[98]) {
			Static10.anInt470 += (12 - Static10.anInt470) / 2;
		} else if (Static56.aBooleanArray15[99]) {
			Static10.anInt470 += (-Static10.anInt470 - 12) / 2;
		} else {
			Static10.anInt470 /= 2;
		}
		if (Static56.aBooleanArray15[96]) {
			Static13.anInt574 += (-Static13.anInt574 - 24) / 2;
		} else if (Static56.aBooleanArray15[97]) {
			Static13.anInt574 += (24 - Static13.anInt574) / 2;
		} else {
			Static13.anInt574 /= 2;
		}
		Static132.anInt3154 = Static132.anInt3154 + Static13.anInt574 / 2 & 0x7FF;
		@Pc(84) int local84 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 + Static120.anInt2857;
		@Pc(89) int local89 = Static66.anInt1755 + Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428;
		if (Static8.anInt444 - local89 < -500 || Static8.anInt444 - local89 > 500 || Static41.anInt1170 - local84 < -500 || Static41.anInt1170 - local84 > 500) {
			Static8.anInt444 = local89;
			Static41.anInt1170 = local84;
		}
		if (Static8.anInt444 != local89) {
			Static8.anInt444 += (local89 - Static8.anInt444) / 16;
		}
		Static43.anInt1241 += Static10.anInt470 / 2;
		if (Static43.anInt1241 < 128) {
			Static43.anInt1241 = 128;
		}
		@Pc(145) int local145 = Static8.anInt444 >> 7;
		if (local84 != Static41.anInt1170) {
			Static41.anInt1170 += (local84 - Static41.anInt1170) / 16;
		}
		if (Static43.anInt1241 > 383) {
			Static43.anInt1241 = 383;
		}
		@Pc(166) int local166 = Static41.anInt1170 >> 7;
		@Pc(177) int local177 = Static45.method1845(Static42.anInt1208, Static41.anInt1170, Static8.anInt444);
		@Pc(179) int local179 = 0;
		@Pc(199) int local199;
		if (local145 > 3 && local166 > 3 && local145 < 100 && local166 < 100) {
			for (local199 = local145 - 4; local199 <= local145 + 4; local199++) {
				for (@Pc(205) int local205 = local166 - 4; local205 <= local166 + 4; local205++) {
					@Pc(209) int local209 = Static42.anInt1208;
					if (local209 < 3 && (Static105.aByteArrayArrayArray9[1][local199][local205] & 0x2) == 2) {
						local209++;
					}
					@Pc(237) int local237 = local177 - Static98.anIntArrayArrayArray4[local209][local199][local205];
					if (local237 > local179) {
						local179 = local237;
					}
				}
			}
		}
		local199 = local179 * 192;
		if (local199 > 98048) {
			local199 = 98048;
		}
		if (local199 < 32768) {
			local199 = 32768;
		}
		if (local199 > Static30.anInt913) {
			Static30.anInt913 += (local199 - Static30.anInt913) / 24;
		} else if (Static30.anInt913 > local199) {
			Static30.anInt913 += (local199 - Static30.anInt913) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1346() {
		for (@Pc(7) int local7 = 0; local7 < Static64.anInt1731; local7++) {
			@Pc(20) int local20 = Static1.anIntArray19[local7];
			@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local20];
			if (local24 != null) {
				Static121.method1919(local24, local24.aClass1_Sub1_Sub17_1.anInt3042);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method1347() {
		while (true) {
			@Pc(12) Class38 local12 = Static43.aClass38_8;
			@Pc(19) Class1_Sub18 local19;
			synchronized (Static43.aClass38_8) {
				local19 = (Class1_Sub18) Static60.aClass38_11.method1040();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass35_Sub1_22.method1583(false, (int) local19.aLong162, local19.aByteArray38, local19.aClass33_1);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Z")
	public static boolean method1348(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method1349() {
		aClass34Array19 = null;
		anIntArray236 = null;
		aClass63_12 = null;
		aShortArray9 = null;
		anIntArray238 = null;
		anIntArray240 = null;
		anIntArray239 = null;
		aClass34_1015 = null;
		aShortArray8 = null;
		aClass63_13 = null;
		aClass35_20 = null;
		anIntArray237 = null;
		anIntArray234 = null;
		aClass1_Sub9_11 = null;
		aClass34_1016 = null;
		anIntArray235 = null;
		anIntArray232 = null;
		anIntArray233 = null;
		aClass34_1014 = null;
	}
}
