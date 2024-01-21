import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "[Lclient!ma;")
	public static Class1_Sub14[] aClass1_Sub14Array1;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array8;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "Lclient!af;")
	public static Class5 aClass5_1185 = Static45.method1937("compass");

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "Lclient!af;")
	private static Class5 aClass5_1186 = Static45.method1937("OFF");

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1187 = Static45.method1937("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1188 = aClass5_1186;

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!r", name = "sb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1189 = Static45.method1937("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!r", name = "wb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1190 = Static45.method1937("<col=00ffff>");

	@OriginalMember(owner = "client!r", name = "zb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1191 = Static45.method1937("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V")
	public static void method1725() {
		if (Static45.aClass1_Sub17_66 != null || Static72.aClass1_Sub17_45 != null) {
			return;
		}
		@Pc(13) int local13 = Static12.anInt3243;
		@Pc(32) int local32;
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (Static69.aBoolean48) {
			if (local13 != 1) {
				local84 = Static97.anInt2395;
				local32 = Static98.anInt2407;
				if (Static24.anInt761 - 10 > local32 || local32 > Static24.anInt761 + Static27.anInt840 + 10 || local84 < Static17.anInt514 - 10 || local84 > Static49.anInt1182 + Static17.anInt514 + 10) {
					Static69.aBoolean48 = false;
					Static98.method1648(Static24.anInt761, Static17.anInt514, Static27.anInt840, Static49.anInt1182);
				}
			}
			if (local13 != 1) {
				return;
			}
			local32 = Static24.anInt761;
			local84 = Static17.anInt514;
			@Pc(230) int local230 = Static9.anInt280;
			local90 = Static27.anInt840;
			@Pc(234) int local234 = -1;
			@Pc(236) int local236 = Static97.anInt2390;
			for (@Pc(238) int local238 = 0; local238 < Static18.anInt3043; local238++) {
				@Pc(253) int local253 = local84 + (Static18.anInt3043 - (local238 + 1)) * 15 + 31;
				if (local32 < local230 && local230 < local90 + local32 && local253 - 13 < local236 && local236 < local253 + 3) {
					local234 = local238;
				}
			}
			if (local234 != -1) {
				Static86.method1528(local234);
			}
			Static69.aBoolean48 = false;
			Static98.method1648(Static24.anInt761, Static17.anInt514, Static27.anInt840, Static49.anInt1182);
			return;
		}
		if (local13 == 1 && Static18.anInt3043 > 0) {
			local32 = Static124.anIntArray455[Static18.anInt3043 - 1];
			if (local32 == 22 || local32 == 20 || local32 == 5 || local32 == 14 || local32 == 33 || local32 == 18 || local32 == 58 || local32 == 15 || local32 == 28 || local32 == 11 || local32 == 43 || local32 == 1007) {
				local84 = Static42.anIntArray186[Static18.anInt3043 - 1];
				local90 = Static99.anIntArray375[Static18.anInt3043 - 1];
				@Pc(94) Class1_Sub17 local94 = Static36.method680(local90);
				if (Static54.method939(Static6.method221(local94)) || Static74.method1275(Static6.method221(local94))) {
					Static21.aBoolean21 = false;
					Static25.anInt775 = 0;
					if (Static45.aClass1_Sub17_66 != null) {
						Static119.method2161(Static45.aClass1_Sub17_66);
					}
					Static45.aClass1_Sub17_66 = Static36.method680(local90);
					Static62.anInt2471 = Static9.anInt280;
					Static119.anInt3097 = Static97.anInt2390;
					Static41.anInt1057 = local84;
					Static119.method2161(Static45.aClass1_Sub17_66);
					return;
				}
			}
		}
		if (local13 == 1 && (Static76.anInt1795 == 1 && Static18.anInt3043 > 2 || Static81.method1433(Static18.anInt3043 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static18.anInt3043 > 0) {
			Static86.method1528(Static18.anInt3043 - 1);
		}
		if (local13 == 2 && Static18.anInt3043 > 0) {
			Static81.method1432();
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(Z)V")
	public static void method1726() {
		try {
			if (Static125.anInt3198 == 1) {
				@Pc(15) int local15 = Static2.aClass1_Sub1_Sub3_1.method1177();
				if (local15 > 0 && Static2.aClass1_Sub1_Sub3_1.method1172()) {
					local15 -= Static26.anInt806;
					if (local15 < 0) {
						local15 = 0;
					}
					Static2.aClass1_Sub1_Sub3_1.method1176(local15);
				} else {
					Static2.aClass1_Sub1_Sub3_1.method1175();
					Static2.aClass1_Sub1_Sub3_1.method1168();
					if (Static73.aClass41_12 == null) {
						Static125.anInt3198 = 0;
					} else {
						Static125.anInt3198 = 2;
					}
					Static38.aClass60_1 = null;
					Static66.aClass1_Sub8_3 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static2.aClass1_Sub1_Sub3_1.method1175();
			Static73.aClass41_12 = null;
			Static66.aClass1_Sub8_3 = null;
			Static38.aClass60_1 = null;
			Static125.anInt3198 = 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(Z)V")
	public static void method1727() {
		aLongArray4 = null;
		aClass1_Sub3_Sub1_Sub2Array8 = null;
		aClass5_1185 = null;
		aClass5_1189 = null;
		aClass5_1190 = null;
		aClass5_1186 = null;
		aClass1_Sub14Array1 = null;
		aClass5_1187 = null;
		aClass5_1191 = null;
		aClass5_1188 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1733() {
		if (Static97.aClass10_1 != null) {
			Static97.aClass10_1.method1301();
		}
		if (Static113.aClass10_2 != null) {
			Static113.aClass10_2.method1301();
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Z")
	public static boolean method1734() {
		@Pc(5) Class62 local5 = Static73.aClass62_1;
		synchronized (Static73.aClass62_1) {
			if (Static122.anInt3120 == Static56.anInt1346) {
				return false;
			} else {
				Static25.anInt776 = Static52.anIntArray205[Static56.anInt1346];
				Static1.anInt46 = Static22.anIntArray85[Static56.anInt1346];
				Static56.anInt1346 = Static56.anInt1346 + 1 & 0x7F;
				return true;
			}
		}
	}
}
