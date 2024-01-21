import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Z")
	public static boolean aBoolean166;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!ge;")
	public static Class7 aClass7_56;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public static int anInt3106;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 aClass6_Sub3_Sub3_Sub1_4;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1687 = Static80.method1463("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1688 = aClass63_1687;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_11 = new Class1();

	@OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
	public static int[] anIntArray356 = new int[2048];

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1689 = Static80.method1463("Null");

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	public static int anInt3105 = 0;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1690 = Static80.method1463("Konfig geladen)3");

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1691 = Static80.method1463("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1692 = Static80.method1463(" loggt sich aus)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public static void method2074() {
		Static7.aClass49_2.method1389();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method2076() {
		if (Static44.aBooleanArray8[96]) {
			Static87.anInt2413 += (-Static87.anInt2413 - 24) / 2;
		} else if (Static44.aBooleanArray8[97]) {
			Static87.anInt2413 += (24 - Static87.anInt2413) / 2;
		} else {
			Static87.anInt2413 /= 2;
		}
		Static109.anInt3032 = Static109.anInt3032 + Static87.anInt2413 / 2 & 0x7FF;
		if (Static44.aBooleanArray8[98]) {
			Static123.anInt3306 += (12 - Static123.anInt3306) / 2;
		} else if (Static44.aBooleanArray8[99]) {
			Static123.anInt3306 += (-Static123.anInt3306 - 12) / 2;
		} else {
			Static123.anInt3306 /= 2;
		}
		Static67.anInt1848 += Static123.anInt3306 / 2;
		@Pc(92) int local92 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 + Static52.anInt1596;
		if (Static67.anInt1848 < 128) {
			Static67.anInt1848 = 128;
		}
		@Pc(105) int local105 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 + Static102.anInt2827;
		if (Static67.anInt1848 > 383) {
			Static67.anInt1848 = 383;
		}
		if (Static57.anInt1727 - local105 < -500 || Static57.anInt1727 - local105 > 500 || Static90.anInt2543 - local92 < -500 || Static90.anInt2543 - local92 > 500) {
			Static90.anInt2543 = local92;
			Static57.anInt1727 = local105;
		}
		@Pc(146) int local146 = 0;
		if (local92 != Static90.anInt2543) {
			Static90.anInt2543 += (local92 - Static90.anInt2543) / 16;
		}
		if (local105 != Static57.anInt1727) {
			Static57.anInt1727 += (local105 - Static57.anInt1727) / 16;
		}
		@Pc(181) int local181 = Static57.anInt1727 >> 7;
		@Pc(185) int local185 = Static90.anInt2543 >> 7;
		@Pc(191) int local191 = Static110.method2038(Static101.anInt2810, Static90.anInt2543, Static57.anInt1727);
		@Pc(213) int local213;
		if (local181 > 3 && local185 > 3 && local181 < 100 && local185 < 100) {
			for (local213 = local181 - 4; local213 <= local181 + 4; local213++) {
				for (@Pc(219) int local219 = local185 - 4; local219 <= local185 + 4; local219++) {
					@Pc(223) int local223 = Static101.anInt2810;
					if (local223 < 3 && (Static103.aByteArrayArrayArray92[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(251) int local251 = local191 - Static11.anIntArrayArrayArray6[local223][local213][local219];
					if (local251 > local146) {
						local146 = local251;
					}
				}
			}
		}
		local213 = local146 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (local213 > Static89.anInt2469) {
			Static89.anInt2469 += (local213 - Static89.anInt2469) / 24;
		} else if (local213 < Static89.anInt2469) {
			Static89.anInt2469 += (local213 - Static89.anInt2469) / 80;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method2077() {
		aClass6_Sub3_Sub3_Sub1_4 = null;
		aClass1_11 = null;
		aClass63_1692 = null;
		aClass63_1689 = null;
		anIntArray356 = null;
		aClass63_1690 = null;
		aClass63_1687 = null;
		aClass7_56 = null;
		aClass63_1688 = null;
		aClass63_1691 = null;
	}
}
