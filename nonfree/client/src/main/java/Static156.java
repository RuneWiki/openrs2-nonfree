import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1458 = Static51.method932("compass");

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!ve;")
	public static Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1459 = Static51.method932("Login");

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1460 = aClass10_1459;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "[I")
	public static int[] anIntArray358 = new int[1000];

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1461 = Static51.method932(" loggt sich ein)3");

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt3342 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)I")
	public static int method2398(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		return arg0 * arg1[1] + arg2 * arg1[0];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method2399() {
		@Pc(7) int local7 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 + Static25.anInt670;
		if (Static99.aBooleanArray9[98]) {
			Static152.anInt3298 += (12 - Static152.anInt3298) / 2;
		} else if (Static99.aBooleanArray9[99]) {
			Static152.anInt3298 += (-Static152.anInt3298 - 12) / 2;
		} else {
			Static152.anInt3298 /= 2;
		}
		if (Static99.aBooleanArray9[96]) {
			Static178.anInt3797 += (-Static178.anInt3797 - 24) / 2;
		} else if (Static99.aBooleanArray9[97]) {
			Static178.anInt3797 += (24 - Static178.anInt3797) / 2;
		} else {
			Static178.anInt3797 /= 2;
		}
		Static12.anInt365 += Static152.anInt3298 / 2;
		if (Static12.anInt365 < 128) {
			Static12.anInt365 = 128;
		}
		if (Static12.anInt365 > 383) {
			Static12.anInt365 = 383;
		}
		@Pc(100) int local100 = Static160.anInt3400 + Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499;
		if (Static67.anInt2918 - local7 < -500 || Static67.anInt2918 - local7 > 500 || Static63.anInt1562 - local100 < -500 || Static63.anInt1562 - local100 > 500) {
			Static63.anInt1562 = local100;
			Static67.anInt2918 = local7;
		}
		Static45.anInt1123 = Static178.anInt3797 / 2 + Static45.anInt1123 & 0x7FF;
		if (Static63.anInt1562 != local100) {
			Static63.anInt1562 += (local100 - Static63.anInt1562) / 16;
		}
		if (Static67.anInt2918 != local7) {
			Static67.anInt2918 += (local7 - Static67.anInt2918) / 16;
		}
		@Pc(174) int local174 = Static67.anInt2918 >> 7;
		@Pc(183) int local183 = Static63.anInt1562 >> 7;
		@Pc(189) int local189 = Static178.method2702(Static63.anInt1562, Static67.anInt2918, Static56.anInt1432);
		@Pc(191) int local191 = 0;
		@Pc(209) int local209;
		if (local174 > 3 && local183 > 3 && local174 < 100 && local183 < 100) {
			for (local209 = local174 - 4; local209 <= local174 + 4; local209++) {
				for (@Pc(215) int local215 = local183 - 4; local215 <= local183 + 4; local215++) {
					@Pc(219) int local219 = Static56.anInt1432;
					if (local219 < 3 && (Static50.aByteArrayArrayArray3[1][local209][local215] & 0x2) == 2) {
						local219++;
					}
					@Pc(249) int local249 = local189 - Static162.anIntArrayArrayArray8[local219][local209][local215];
					if (local249 > local191) {
						local191 = local249;
					}
				}
			}
		}
		local209 = local191 * 192;
		if (local209 > 98048) {
			local209 = 98048;
		}
		if (local209 < 32768) {
			local209 = 32768;
		}
		if (local209 > Static54.anInt1352) {
			Static54.anInt1352 += (local209 - Static54.anInt1352) / 24;
		} else if (local209 < Static54.anInt1352) {
			Static54.anInt1352 += (local209 - Static54.anInt1352) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method2400() {
		aClass10_1459 = null;
		aClass84_1 = null;
		anIntArray358 = null;
		aClass10_1460 = null;
		aClass10_1461 = null;
		aClass10_1458 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)Z")
	public static boolean method2401(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
