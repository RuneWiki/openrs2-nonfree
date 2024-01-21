import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!bc;")
	public static Class6 aClass6_22;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_54;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1545 = Static108.method1915("wave2:");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1543 = aClass39_1545;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1544 = aClass39_1545;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public static int anInt3156 = 0;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1546 = Static108.method1915("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1547 = Static108.method1915("<col=80ff00>");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method2204() {
		if (Static77.anInt1932 != 0 || Static66.aClass1_Sub1_Sub1_3 != null) {
			return;
		}
		@Pc(14) int local14 = Static91.anInt2130;
		if (Static46.aBoolean222 && Static89.anInt2109 >= 516 && Static38.anInt1157 >= 160 && Static89.anInt2109 <= 765 && Static38.anInt1157 <= 205) {
			local14 = 0;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(126) int local126;
		if (!Static13.aBoolean47) {
			if (local14 == 1 && Static110.anInt2795 > 0) {
				local43 = Static66.anIntArray246[Static110.anInt2795 - 1];
				if (local43 == 24 || local43 == 4 || local43 == 22 || local43 == 38 || local43 == 7 || local43 == 18 || local43 == 34 || local43 == 1 || local43 == 37 || local43 == 9 || local43 == 19 || local43 == 1005) {
					local126 = Static67.anIntArray250[Static110.anInt2795 - 1];
					local45 = Static100.anIntArray390[Static110.anInt2795 - 1];
					@Pc(290) Class1_Sub1_Sub1 local290 = Static41.method2106(local126);
					if (Static93.method1568(Static129.method2213(local290)) || method2206(Static129.method2213(local290))) {
						Static77.anInt1932 = 2;
						Static8.anInt426 = Static38.anInt1157;
						Static98.anInt2391 = local126;
						Static57.anInt1549 = local45;
						Static32.anInt692 = 0;
						Static28.aBoolean205 = false;
						if (local126 >> 16 == Static48.anInt1318) {
							Static77.anInt1932 = 1;
						}
						Static65.anInt1718 = Static89.anInt2109;
						if (Static110.anInt2786 == local126 >> 16) {
							Static77.anInt1932 = 3;
						}
						return;
					}
				}
			}
			if (local14 == 1 && (Static98.anInt2389 == 1 || Static119.method2050(Static110.anInt2795 - 1)) && Static110.anInt2795 > 2) {
				local14 = 2;
			}
			if (local14 == 1 && Static110.anInt2795 > 0) {
				Static98.method1723(Static110.anInt2795 - 1);
			}
			if (local14 != 2 || Static110.anInt2795 <= 0) {
				return;
			}
			Static23.method447();
			return;
		}
		if (local14 != 1) {
			local43 = Static29.anInt971;
			local45 = Static3.anInt150;
			if (Static46.anInt2774 == 0) {
				local45 -= 4;
				local43 -= 4;
			}
			if (Static46.anInt2774 == 1) {
				local43 -= 553;
				local45 -= 205;
			}
			if (Static46.anInt2774 == 2) {
				local45 -= 357;
				local43 -= 17;
			}
			if (Static36.anInt1081 - 10 > local43 || local43 > Static108.anInt2712 + Static36.anInt1081 + 10 || Static89.anInt2108 - 10 > local45 || local45 > Static89.anInt2108 + Static122.anInt2971 + 10) {
				if (Static46.anInt2774 == 2) {
					Static113.aBoolean226 = true;
				}
				Static13.aBoolean47 = false;
				if (Static46.anInt2774 == 1) {
					Static35.aBoolean96 = true;
				}
			}
		}
		if (local14 != 1) {
			return;
		}
		local43 = Static36.anInt1081;
		local45 = Static89.anInt2108;
		local126 = Static108.anInt2712;
		@Pc(128) int local128 = Static38.anInt1157;
		@Pc(130) int local130 = Static89.anInt2109;
		@Pc(132) int local132 = -1;
		if (Static46.anInt2774 == 0) {
			local130 -= 4;
			local128 -= 4;
		}
		if (Static46.anInt2774 == 1) {
			local128 -= 205;
			local130 -= 553;
		}
		if (Static46.anInt2774 == 2) {
			local130 -= 17;
			local128 -= 357;
		}
		for (@Pc(150) int local150 = 0; local150 < Static110.anInt2795; local150++) {
			@Pc(165) int local165 = local45 + (Static110.anInt2795 - local150 - 1) * 15 + 31;
			if (local43 < local130 && local43 + local126 > local130 && local128 > local165 - 13 && local165 + 3 > local128) {
				local132 = local150;
			}
		}
		if (local132 != -1) {
			Static98.method1723(local132);
		}
		Static13.aBoolean47 = false;
		if (Static46.anInt2774 == 2) {
			Static113.aBoolean226 = true;
		}
		if (Static46.anInt2774 == 1) {
			Static35.aBoolean96 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method2205() {
		aClass39_1547 = null;
		aClass39_1543 = null;
		aCRC32_2 = null;
		aClass39_1544 = null;
		aClass1_Sub1_Sub4_Sub1_54 = null;
		aClass39_1546 = null;
		aClass39_1545 = null;
		aClass6_22 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public static boolean method2206(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V")
	public static void method2207(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static71.method1248(arg0)) {
			return;
		}
		@Pc(21) Class1_Sub1_Sub1[] local21 = Static102.aClass1_Sub1_Sub1ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local21.length; local28++) {
			@Pc(34) Class1_Sub1_Sub1 local34 = local21[local28];
			if (local34.anObjectArray16 != null) {
				Static52.method962(local34.anObjectArray16, 0, null, 0, local34, 0);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
	public static int method2208(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
