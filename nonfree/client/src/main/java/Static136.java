import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!cc;")
	public static Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_968 = Static8.method128(")4lang)4de");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_969 = Static8.method128("M");

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_970 = aClass18_969;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
	public static int[] anIntArray355 = new int[5];

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_971 = Static8.method128("Okay");

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_972 = aClass18_969;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	public static final int anInt3831 = 50;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!ea;")
	public static Class18 aClass18_973 = Static8.method128("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method2596() {
		anIntArray355 = null;
		aClass18_972 = null;
		aClass18_969 = null;
		aClass10_1 = null;
		aClass18_970 = null;
		aClass18_973 = null;
		aClass18_968 = null;
		aClass18_971 = null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public static void method2600() {
		Static107.anInt3144 = 0;
		@Pc(12) int local12 = Static117.anInt3328 + (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 >> 7);
		@Pc(25) int local25 = Static110.anInt3227 + (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static107.anInt3144 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static107.anInt3144 = 1;
		}
		if (Static107.anInt3144 == 1 && local12 >= 3139 && local12 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static107.anInt3144 = 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
	public static void method2601(@OriginalArg(0) int arg0) {
		Static85.method1848();
		Static2.method56();
		@Pc(14) int local14 = Static173.method3151(arg0).anInt3707;
		if (local14 == 0) {
			return;
		}
		@Pc(29) int local29 = Static170.anIntArray420[arg0];
		if (local14 == 1) {
			if (local29 == 1) {
				Static79.method1759(0.9F);
			}
			if (local29 == 2) {
				Static79.method1759(0.8F);
			}
			if (local29 == 3) {
				Static79.method1759(0.7F);
			}
			if (local29 == 4) {
				Static79.method1759(0.6F);
			}
			Static122.method2398();
		}
		if (local14 == 3) {
			@Pc(67) short local67 = 0;
			if (local29 == 0) {
				local67 = 255;
			}
			if (local29 == 1) {
				local67 = 192;
			}
			if (local29 == 2) {
				local67 = 128;
			}
			if (local29 == 3) {
				local67 = 64;
			}
			if (local29 == 4) {
				local67 = 0;
			}
			if (local67 != Static94.anInt2923) {
				if (Static94.anInt2923 == 0 && Static157.anInt4311 != -1) {
					Static28.method2243(local67, 0, Static115.aClass16_Sub1_36, Static157.anInt4311);
					Static116.aBoolean143 = false;
				} else if (local67 == 0) {
					Static31.method687();
					Static116.aBoolean143 = false;
				} else {
					Static126.method2490(local67);
				}
				Static94.anInt2923 = local67;
			}
		}
		if (local14 == 10) {
			if (local29 == 0) {
				Static97.anInt3004 = 127;
			}
			if (local29 == 1) {
				Static97.anInt3004 = 96;
			}
			if (local29 == 2) {
				Static97.anInt3004 = 64;
			}
			if (local29 == 3) {
				Static97.anInt3004 = 32;
			}
			if (local29 == 4) {
				Static97.anInt3004 = 0;
			}
		}
		if (local14 == 9) {
			Static71.anInt2160 = local29;
		}
		if (local14 == 5) {
			Static8.anInt219 = local29;
		}
		if (local14 == 4) {
			if (local29 == 0) {
				Static69.anInt2081 = 127;
			}
			if (local29 == 1) {
				Static69.anInt2081 = 96;
			}
			if (local29 == 2) {
				Static69.anInt2081 = 64;
			}
			if (local29 == 3) {
				Static69.anInt2081 = 32;
			}
			if (local29 == 4) {
				Static69.anInt2081 = 0;
			}
		}
		if (local14 == 6) {
			Static126.anInt3634 = local29;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public static boolean method2603(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
