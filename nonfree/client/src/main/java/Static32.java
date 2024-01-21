import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!v;")
	private static Class62 aClass62_431 = Static45.method753("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!v;")
	private static Class62 aClass62_432 = Static45.method753("purple:");

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_433 = Static45.method753("@cr1@");

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!v;")
	private static Class62 aClass62_434 = Static45.method753("cyan:");

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "Lclient!v;")
	private static Class62 aClass62_437 = Static45.method753("yellow:");

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!v;")
	public static Class62 aClass62_435 = aClass62_437;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "Lclient!v;")
	private static Class62 aClass62_444 = Static45.method753("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_436 = aClass62_444;

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_438 = Static45.method753("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lclient!v;")
	public static Class62 aClass62_439 = aClass62_432;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_440 = aClass62_434;

	@OriginalMember(owner = "client!ge", name = "jb", descriptor = "[I")
	public static int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!ge", name = "kb", descriptor = "Lclient!v;")
	public static Class62 aClass62_441 = Static45.method753("b12_full");

	@OriginalMember(owner = "client!ge", name = "mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_442 = Static45.method753("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "[Lclient!cc;")
	public static Class11[] aClass11Array1 = new Class11[4];

	@OriginalMember(owner = "client!ge", name = "qb", descriptor = "Lclient!v;")
	public static Class62 aClass62_443 = Static45.method753("Lade Benutzeroberfl\u001c1che )2 ");

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "Lclient!v;")
	public static Class62 aClass62_445 = aClass62_431;

	@OriginalMember(owner = "client!ge", name = "ub", descriptor = "Lclient!v;")
	public static Class62 aClass62_446 = Static45.method753("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
	public static void method625() {
		for (@Pc(8) Class3_Sub6 local8 = (Class3_Sub6) Static77.aClass24_58.method534(); local8 != null; local8 = (Class3_Sub6) Static77.aClass24_58.method525()) {
			if (local8.aClass3_Sub4_Sub1_1 != null) {
				Static53.aClass3_Sub4_Sub2_1.method1570(local8.aClass3_Sub4_Sub1_1);
				local8.aClass3_Sub4_Sub1_1 = null;
			}
			if (local8.aClass3_Sub4_Sub1_2 != null) {
				Static53.aClass3_Sub4_Sub2_1.method1570(local8.aClass3_Sub4_Sub1_2);
				local8.aClass3_Sub4_Sub1_2 = null;
			}
		}
		Static77.aClass24_58.method531();
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
	public static void method627() {
		aClass62_438 = null;
		aClass62_436 = null;
		aClass62_437 = null;
		aClass62_440 = null;
		aClass62_446 = null;
		aClass62_431 = null;
		aClass62_441 = null;
		aClass62_433 = null;
		aClass62_432 = null;
		aClass62_435 = null;
		aClass62_444 = null;
		aClass62_442 = null;
		aClass62_445 = null;
		anIntArray70 = null;
		aClass62_439 = null;
		aClass62_434 = null;
		aClass11Array1 = null;
		aClass62_443 = null;
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V")
	public static void method628() {
		@Pc(10) int local10 = Static39.anInt1161 + Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882;
		@Pc(15) int local15 = Static50.anInt2800 + Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887;
		if (Static77.anInt2064 - local10 < -500 || Static77.anInt2064 - local10 > 500 || Static45.anInt1332 - local15 < -500 || Static45.anInt1332 - local15 > 500) {
			Static77.anInt2064 = local10;
			Static45.anInt1332 = local15;
		}
		if (local10 != Static77.anInt2064) {
			Static77.anInt2064 += (local10 - Static77.anInt2064) / 16;
		}
		if (local15 != Static45.anInt1332) {
			Static45.anInt1332 += (local15 - Static45.anInt1332) / 16;
		}
		@Pc(75) int local75 = Static45.anInt1332 >> 7;
		if (Static109.aBooleanArray13[96]) {
			Static29.anInt938 += (-Static29.anInt938 - 24) / 2;
		} else if (Static109.aBooleanArray13[97]) {
			Static29.anInt938 += (24 - Static29.anInt938) / 2;
		} else {
			Static29.anInt938 /= 2;
		}
		@Pc(112) int local112 = Static77.anInt2064 >> 7;
		if (Static109.aBooleanArray13[98]) {
			Static7.anInt216 += (12 - Static7.anInt216) / 2;
		} else if (Static109.aBooleanArray13[99]) {
			Static7.anInt216 += (-Static7.anInt216 - 12) / 2;
		} else {
			Static7.anInt216 /= 2;
		}
		Static53.anInt1432 = Static53.anInt1432 + Static29.anInt938 / 2 & 0x7FF;
		@Pc(156) int local156 = 0;
		Static71.anInt1947 += Static7.anInt216 / 2;
		if (Static71.anInt1947 < 128) {
			Static71.anInt1947 = 128;
		}
		if (Static71.anInt1947 > 383) {
			Static71.anInt1947 = 383;
		}
		@Pc(180) int local180 = Static91.method1541(Static77.anInt2064, Static45.anInt1332, Static27.anInt818);
		@Pc(198) int local198;
		if (local112 > 3 && local75 > 3 && local112 < 100 && local75 < 100) {
			for (local198 = local112 - 4; local198 <= local112 + 4; local198++) {
				for (@Pc(204) int local204 = local75 - 4; local204 <= local75 + 4; local204++) {
					@Pc(208) int local208 = Static27.anInt818;
					if (local208 < 3 && (Static44.aByteArrayArrayArray6[1][local198][local204] & 0x2) == 2) {
						local208++;
					}
					@Pc(236) int local236 = local180 - Static79.anIntArrayArrayArray4[local208][local198][local204];
					if (local236 > local156) {
						local156 = local236;
					}
				}
			}
		}
		local198 = local156 * 192;
		if (local198 > 98048) {
			local198 = 98048;
		}
		if (local198 < 32768) {
			local198 = 32768;
		}
		if (Static83.anInt539 < local198) {
			Static83.anInt539 += (local198 - Static83.anInt539) / 24;
		} else if (Static83.anInt539 > local198) {
			Static83.anInt539 += (local198 - Static83.anInt539) / 80;
			return;
		}
	}
}
