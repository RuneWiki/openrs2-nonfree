import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Lclient!q;")
	public static Class62 aClass62_31;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!bc;")
	public static Class6 aClass6_19;

	@OriginalMember(owner = "client!u", name = "U", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1383 = Static108.method1915("Your account has been disabled)3");

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1381 = aClass39_1383;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1386 = Static108.method1915(" ");

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1382 = aClass39_1386;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1384 = Static108.method1915("::noclip");

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1385 = Static108.method1915("Schlie-8en");

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1390 = Static108.method1915("Enter your username (V password)3");

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1387 = aClass39_1390;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1388 = Static108.method1915(")4lang)4de");

	@OriginalMember(owner = "client!u", name = "O", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1389 = Static108.method1915("huffman");

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1391 = Static108.method1915("");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
	public static void method1988() {
		for (@Pc(7) int local7 = 0; local7 < Static56.anInt1518; local7++) {
			@Pc(13) int local13 = Static35.anIntArray155[local7]--;
			if (Static35.anIntArray155[local7] >= -10) {
				@Pc(80) Class51 local80 = Static2.aClass51Array1[local7];
				if (local80 == null) {
					local80 = Static134.method1393(Static103.aClass62_Sub1_66, Static18.anIntArray103[local7], 0);
					if (local80 == null) {
						continue;
					}
					Static35.anIntArray155[local7] += local80.method1391();
					Static2.aClass51Array1[local7] = local80;
				}
				if (Static35.anIntArray155[local7] < 0) {
					@Pc(199) int local199;
					if (Static38.anIntArray166[local7] == 0) {
						local199 = Static34.anInt1064;
					} else {
						@Pc(123) int local123 = (Static38.anIntArray166[local7] & 0xFF) * 128;
						@Pc(131) int local131 = Static38.anIntArray166[local7] >> 16 & 0xFF;
						@Pc(140) int local140 = local131 * 128 + 64 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521;
						if (local140 < 0) {
							local140 = -local140;
						}
						@Pc(153) int local153 = Static38.anIntArray166[local7] >> 8 & 0xFF;
						@Pc(163) int local163 = local153 * 128 + 64 - Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508;
						if (local163 < 0) {
							local163 = -local163;
						}
						@Pc(177) int local177 = local163 + local140 - 128;
						if (local177 > local123) {
							Static35.anIntArray155[local7] = -100;
							continue;
						}
						if (local177 < 0) {
							local177 = 0;
						}
						local199 = (local123 - local177) * Static86.anInt2059 / local123;
					}
					if (local199 > 0) {
						@Pc(213) Class1_Sub16_Sub1 local213 = local80.method1392().method1564(Static93.aClass24_1);
						@Pc(218) Class1_Sub8_Sub1 local218 = Static131.method948(local213, local199);
						local218.method923(Static127.anIntArray481[local7] - 1);
						Static19.aClass1_Sub8_Sub3_1.method1640(local218);
					}
					Static35.anIntArray155[local7] = -100;
				}
			} else {
				Static56.anInt1518--;
				for (@Pc(27) int local27 = local7; local27 < Static56.anInt1518; local27++) {
					Static18.anIntArray103[local27] = Static18.anIntArray103[local27 + 1];
					Static2.aClass51Array1[local27] = Static2.aClass51Array1[local27 + 1];
					Static127.anIntArray481[local27] = Static127.anIntArray481[local27 + 1];
					Static35.anIntArray155[local27] = Static35.anIntArray155[local27 + 1];
					Static38.anIntArray166[local27] = Static38.anIntArray166[local27 + 1];
				}
				local7--;
			}
		}
		if (Static10.aBoolean46 && !Static103.method1839()) {
			if (Static90.anInt2125 != 0 && Static95.anInt2869 != -1) {
				Static37.method669(0, Static95.anInt2869, Static90.anInt2125, Static77.aClass62_Sub1_53);
			}
			Static10.aBoolean46 = false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B[B)V")
	public static void method1989(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub18 local10 = new Class1_Sub18(arg0);
		local10.anInt3078 = arg0.length - 2;
		Static4.anInt160 = local10.method2156();
		Static64.anIntArray244 = new int[Static4.anInt160];
		Static21.anIntArray107 = new int[Static4.anInt160];
		Static2.anIntArray21 = new int[Static4.anInt160];
		Static113.anIntArray436 = new int[Static4.anInt160];
		Static81.aByteArrayArray8 = new byte[Static4.anInt160][];
		local10.anInt3078 = arg0.length - Static4.anInt160 * 8 - 7;
		Static41.anInt3022 = local10.method2156();
		Static95.anInt2872 = local10.method2156();
		@Pc(66) int local66 = (local10.method2169() & 0xFF) + 1;
		for (@Pc(68) int local68 = 0; local68 < Static4.anInt160; local68++) {
			Static21.anIntArray107[local68] = local10.method2156();
		}
		for (@Pc(86) int local86 = 0; local86 < Static4.anInt160; local86++) {
			Static113.anIntArray436[local86] = local10.method2156();
		}
		for (@Pc(100) int local100 = 0; local100 < Static4.anInt160; local100++) {
			Static64.anIntArray244[local100] = local10.method2156();
		}
		for (@Pc(114) int local114 = 0; local114 < Static4.anInt160; local114++) {
			Static2.anIntArray21[local114] = local10.method2156();
		}
		local10.anInt3078 = arg0.length + 3 - Static4.anInt160 * 8 - local66 * 3 - 7;
		Static23.anIntArray116 = new int[local66];
		for (@Pc(148) int local148 = 1; local148 < local66; local148++) {
			Static23.anIntArray116[local148] = local10.method2145();
			if (Static23.anIntArray116[local148] == 0) {
				Static23.anIntArray116[local148] = 1;
			}
		}
		local10.anInt3078 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static4.anInt160; local177++) {
			@Pc(183) int local183 = Static64.anIntArray244[local177];
			@Pc(187) int local187 = Static2.anIntArray21[local177];
			@Pc(191) int local191 = local183 * local187;
			@Pc(194) byte[] local194 = new byte[local191];
			Static81.aByteArrayArray8[local177] = local194;
			@Pc(202) int local202 = local10.method2169();
			@Pc(212) int local212;
			if (local202 == 0) {
				for (local212 = 0; local212 < local191; local212++) {
					local194[local212] = local10.method2178();
				}
			} else if (local202 == 1) {
				for (local212 = 0; local212 < local183; local212++) {
					for (@Pc(216) int local216 = 0; local216 < local187; local216++) {
						local194[local212 + local183 * local216] = local10.method2178();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIZI)V")
	public static void method1990(@OriginalArg(0) boolean arg0) {
		Static56.anInt1515 = 2;
		Static44.anInt1243 = 22050;
		Static18.aBoolean56 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1991() {
		@Pc(7) Class71 local7 = Static98.aClass71_1;
		synchronized (Static98.aClass71_1) {
			Static71.anInt1796 = Static24.anInt828;
			@Pc(18) int local18;
			if (Static36.anInt1083 < 0) {
				for (local18 = 0; local18 < 112; local18++) {
					Static65.aBooleanArray8[local18] = false;
				}
				Static36.anInt1083 = Static117.anInt2907;
			} else {
				while (Static117.anInt2907 != Static36.anInt1083) {
					local18 = Static92.anIntArray328[Static117.anInt2907];
					Static117.anInt2907 = Static117.anInt2907 + 1 & 0x7F;
					if (local18 < 0) {
						Static65.aBooleanArray8[~local18] = false;
					} else {
						Static65.aBooleanArray8[local18] = true;
					}
				}
			}
			Static24.anInt828 = Static69.anInt1767;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public static void method1992() {
		aClass39_1383 = null;
		aClass39_1390 = null;
		aClass39_1385 = null;
		aClass39_1386 = null;
		aClass39_1382 = null;
		aFont1 = null;
		aClass39_1381 = null;
		aClass39_1391 = null;
		aClass39_1384 = null;
		aClass39_1389 = null;
		aClass6_19 = null;
		aClass39_1387 = null;
		aClass62_31 = null;
		aClass39_1388 = null;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method1993() {
		Static79.aClass6_17.method2069();
		Static27.method566();
	}
}
