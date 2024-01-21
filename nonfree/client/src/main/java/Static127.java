import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!kc;")
	public static Class22 aClass22_20;

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 aClass2_Sub1_Sub9_Sub1_9;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1204 = Static2.method59("Fertigkeit)2");

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1207 = Static2.method59("Loading friend list");

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1205 = aClass80_1207;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1206 = Static2.method59("Benutzen");

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
	public static int[] anIntArray410 = new int[4000];

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "[I")
	public static int[] anIntArray411 = new int[128];

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1211 = Static2.method59("glow2:");

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1208 = aClass80_1211;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1209 = aClass80_1211;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
	public static int anInt3196 = 0;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1210 = Static2.method59("backtop1");

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1212 = Static2.method59("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BIIIIII[Lclient!me;)V")
	public static void method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class49[] arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg0 > 0 && local7 + arg0 < 103 && arg7 + local11 > 0 && local11 + arg7 < 103) {
					arg8[arg3].anIntArrayArray24[arg0 + local7][arg7 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(78) Class2_Sub17 local78 = new Class2_Sub17(arg2);
		for (@Pc(80) int local80 = 0; local80 < 4; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
					if (local80 == arg6 && local84 >= arg5 && local84 < arg5 + 8 && local88 >= arg4 && local88 < arg4 + 8) {
						Static83.method1249(arg1, arg3, 0, local78, Static71.method1142(local88 & 0x7, local84 & 0x7, arg1) + arg0, 0, Static82.method1960(arg1, local84 & 0x7, local88 & 0x7) + arg7);
					} else {
						Static83.method1249(0, 0, 0, local78, -1, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2005(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static131.method1114(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)V")
	public static void method2032() {
		anIntArray411 = null;
		aClass80_1208 = null;
		aClass80_1210 = null;
		aClass80_1209 = null;
		aClass80_1205 = null;
		aClass80_1211 = null;
		aClass80_1204 = null;
		aClass22_20 = null;
		aClass80_1206 = null;
		anIntArray410 = null;
		aClass2_Sub1_Sub9_Sub1_9 = null;
		aClass80_1207 = null;
		aClass80_1212 = null;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(Z)V")
	public static void method2033() {
		@Pc(5) int local5 = Static55.anInt1315 * 128 + 64;
		@Pc(15) int local15 = Static68.anInt1871 * 128 + 64;
		@Pc(23) int local23 = Static24.method513(local5, Static16.anInt444, local15) - Static24.anInt987;
		if (local15 > Static42.anInt1257) {
			Static42.anInt1257 += Static45.anInt2097 * (local15 - Static42.anInt1257) / 1000 + Static123.anInt3120;
			if (Static42.anInt1257 > local15) {
				Static42.anInt1257 = local15;
			}
		}
		if (local15 < Static42.anInt1257) {
			Static42.anInt1257 -= Static45.anInt2097 * (Static42.anInt1257 - local15) / 1000 + Static123.anInt3120;
			if (Static42.anInt1257 < local15) {
				Static42.anInt1257 = local15;
			}
		}
		local15 = Static110.anInt2909 * 128 + 64;
		if (local5 > Static53.anInt1647) {
			Static53.anInt1647 += Static123.anInt3120 + (local5 - Static53.anInt1647) * Static45.anInt2097 / 1000;
			if (Static53.anInt1647 > local5) {
				Static53.anInt1647 = local5;
			}
		}
		if (local5 < Static53.anInt1647) {
			Static53.anInt1647 -= Static123.anInt3120 + (Static53.anInt1647 - local5) * Static45.anInt2097 / 1000;
			if (local5 > Static53.anInt1647) {
				Static53.anInt1647 = local5;
			}
		}
		local5 = Static40.anInt1236 * 128 + 64;
		if (Static107.anInt2863 < local23) {
			Static107.anInt2863 += Static123.anInt3120 + (local23 - Static107.anInt2863) * Static45.anInt2097 / 1000;
			if (Static107.anInt2863 > local23) {
				Static107.anInt2863 = local23;
			}
		}
		if (Static107.anInt2863 > local23) {
			Static107.anInt2863 -= (Static107.anInt2863 - local23) * Static45.anInt2097 / 1000 + Static123.anInt3120;
			if (Static107.anInt2863 < local23) {
				Static107.anInt2863 = local23;
			}
		}
		local23 = Static24.method513(local5, Static16.anInt444, local15) - Static81.anInt2042;
		@Pc(194) int local194 = local5 - Static53.anInt1647;
		@Pc(199) int local199 = local23 - Static107.anInt2863;
		@Pc(204) int local204 = local15 - Static42.anInt1257;
		@Pc(216) int local216 = (int) Math.sqrt((double) (local194 * local194 + local204 * local204));
		@Pc(227) int local227 = (int) (Math.atan2((double) local199, (double) local216) * 325.949D) & 0x7FF;
		if (local227 < 128) {
			local227 = 128;
		}
		if (local227 > 383) {
			local227 = 383;
		}
		@Pc(250) int local250 = (int) (Math.atan2((double) local194, (double) local204) * -325.949D) & 0x7FF;
		if (local227 > Static82.anInt3082) {
			Static82.anInt3082 += Static57.anInt1734 + (local227 - Static82.anInt3082) * Static108.anInt2877 / 1000;
			if (Static82.anInt3082 > local227) {
				Static82.anInt3082 = local227;
			}
		}
		if (Static82.anInt3082 > local227) {
			Static82.anInt3082 -= Static108.anInt2877 * (Static82.anInt3082 - local227) / 1000 + Static57.anInt1734;
			if (Static82.anInt3082 < local227) {
				Static82.anInt3082 = local227;
			}
		}
		@Pc(306) int local306 = local250 - Static80.anInt2025;
		if (local306 > 1024) {
			local306 -= 2048;
		}
		if (local306 < -1024) {
			local306 += 2048;
		}
		if (local306 > 0) {
			Static80.anInt2025 += Static57.anInt1734 + local306 * Static108.anInt2877 / 1000;
			Static80.anInt2025 &= 0x7FF;
		}
		if (local306 < 0) {
			Static80.anInt2025 -= Static57.anInt1734 + -local306 * Static108.anInt2877 / 1000;
			Static80.anInt2025 &= 0x7FF;
		}
		@Pc(356) int local356 = local250 - Static80.anInt2025;
		if (local356 > 1024) {
			local356 -= 2048;
		}
		if (local356 < -1024) {
			local356 += 2048;
		}
		if (local356 < 0 && local306 > 0 || local356 > 0 && local306 < 0) {
			Static80.anInt2025 = local250;
		}
	}
}
