import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "Lclient!oa;")
	public static Class9 aClass9_12;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
	public static int anInt1257;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
	public static int anInt1258;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
	public static int anInt1247 = 0;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_50 = new Class17(64);

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_425 = Static56.method1206("Dec");

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_426 = Static56.method1206("*6n*6nIf you do not remember making this request*6ncancel it immediately)1 and change your password)3");

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_427 = Static56.method1206("Accept challenge @whi@");

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_428 = Static56.method1206("Invalid loginserver requested");

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_429 = Static56.method1206("Loaded interfaces");

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public static void method838() {
		aClass31_425 = null;
		aClass31_428 = null;
		aClass9_12 = null;
		aClass17_50 = null;
		aClass31_429 = null;
		aClass31_426 = null;
		aClass31_427 = null;
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
	public static void method840() {
		@Pc(10) int local10 = Static44.anInt1590 + Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006;
		@Pc(15) int local15 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 + Static50.anInt504;
		@Pc(17) int local17 = 0;
		if (Static62.anInt2114 - local10 < -500 || Static62.anInt2114 - local10 > 500 || Static75.anInt2248 - local15 < -500 || Static75.anInt2248 - local15 > 500) {
			Static75.anInt2248 = local15;
			Static62.anInt2114 = local10;
		}
		if (Static75.anInt2248 != local15) {
			Static75.anInt2248 += (local15 - Static75.anInt2248) / 16;
		}
		if (Static62.anInt2114 != local10) {
			Static62.anInt2114 += (local10 - Static62.anInt2114) / 16;
		}
		@Pc(75) int local75 = Static62.anInt2114 >> 7;
		@Pc(79) int local79 = Static75.anInt2248 >> 7;
		if (Static103.aBooleanArray57[96]) {
			Static23.anInt1026 += (-Static23.anInt1026 - 24) / 2;
		} else if (Static103.aBooleanArray57[97]) {
			Static23.anInt1026 += (24 - Static23.anInt1026) / 2;
		} else {
			Static23.anInt1026 /= 2;
		}
		if (Static103.aBooleanArray57[98]) {
			Static61.anInt2107 += (12 - Static61.anInt2107) / 2;
		} else if (Static103.aBooleanArray57[99]) {
			Static61.anInt2107 += (-Static61.anInt2107 - 12) / 2;
		} else {
			Static61.anInt2107 /= 2;
		}
		Static101.anInt2751 += Static61.anInt2107 / 2;
		if (Static101.anInt2751 < 128) {
			Static101.anInt2751 = 128;
		}
		if (Static101.anInt2751 > 383) {
			Static101.anInt2751 = 383;
		}
		Static12.anInt542 = Static23.anInt1026 / 2 + Static12.anInt542 & 0x7FF;
		@Pc(182) int local182 = Static42.method1057(Static62.anInt2114, Static75.anInt2248, Static58.anInt1945);
		@Pc(200) int local200;
		if (local75 > 3 && local79 > 3 && local75 < 100 && local79 < 100) {
			for (local200 = local75 - 4; local200 <= local75 + 4; local200++) {
				for (@Pc(206) int local206 = local79 - 4; local206 <= local79 + 4; local206++) {
					@Pc(210) int local210 = Static58.anInt1945;
					if (local210 < 3 && (Static34.aByteArrayArrayArray17[1][local200][local206] & 0x2) == 2) {
						local210++;
					}
					@Pc(240) int local240 = local182 - Static16.anIntArrayArrayArray1[local210][local200][local206];
					if (local240 > local17) {
						local17 = local240;
					}
				}
			}
		}
		local200 = local17 * 192;
		if (local200 > 98048) {
			local200 = 98048;
		}
		if (local200 < 32768) {
			local200 = 32768;
		}
		if (local200 > Static89.anInt2387) {
			Static89.anInt2387 += (local200 - Static89.anInt2387) / 24;
		} else if (local200 < Static89.anInt2387) {
			Static89.anInt2387 += (local200 - Static89.anInt2387) / 80;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method843() {
		Static98.aClass17_45.method782();
		Static49.aClass17_97.method782();
		Static44.aClass17_63.method782();
	}
}
