import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!ff;")
	public static Class11 aClass11_40;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!kc;")
	public static Class22 aClass22_18;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!t;")
	public static Class2_Sub17_Sub1 aClass2_Sub17_Sub1_1 = new Class2_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1003 = Static2.method59("Name eingeben:");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][105][105];

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1006 = Static2.method59("Malformed login packet)3");

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1004 = aClass80_1006;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1005 = Static2.method59("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!re", name = "s", descriptor = "[I")
	public static int[] anIntArray337 = new int[2000];

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	public static int anInt2626 = -1;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1007 = Static2.method59("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!va;)Z")
	public static boolean method1602(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		if (arg0.anIntArray394 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray394.length; local12++) {
			@Pc(19) int local19 = Static37.method651(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray395[local12];
			if (arg0.anIntArray394[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray394[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray394[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1603() {
		if (Static20.anInt906 != 1) {
			return;
		}
		if (Static13.anInt365 >= 539 && Static13.anInt365 <= 573 && Static108.anInt2880 >= 169 && Static108.anInt2880 < 205 && Static39.anIntArray89[0] != -1) {
			Static23.anInt875 = 0;
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
		}
		if (Static13.anInt365 >= 569 && Static13.anInt365 <= 599 && Static108.anInt2880 >= 168 && Static108.anInt2880 < 205 && Static39.anIntArray89[1] != -1) {
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
			Static23.anInt875 = 1;
		}
		if (Static13.anInt365 >= 597 && Static13.anInt365 <= 627 && Static108.anInt2880 >= 168 && Static108.anInt2880 < 205 && Static39.anIntArray89[2] != -1) {
			Static70.aBoolean131 = true;
			Static23.anInt875 = 2;
			Static57.aBoolean119 = true;
		}
		if (Static13.anInt365 >= 625 && Static13.anInt365 <= 669 && Static108.anInt2880 >= 168 && Static108.anInt2880 < 203 && Static39.anIntArray89[3] != -1) {
			Static23.anInt875 = 3;
			Static57.aBoolean119 = true;
			Static70.aBoolean131 = true;
		}
		if (Static13.anInt365 >= 666 && Static13.anInt365 <= 696 && Static108.anInt2880 >= 168 && Static108.anInt2880 < 205 && Static39.anIntArray89[4] != -1) {
			Static70.aBoolean131 = true;
			Static23.anInt875 = 4;
			Static57.aBoolean119 = true;
		}
		if (Static13.anInt365 >= 694 && Static13.anInt365 <= 724 && Static108.anInt2880 >= 168 && Static108.anInt2880 < 205 && Static39.anIntArray89[5] != -1) {
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
			Static23.anInt875 = 5;
		}
		if (Static13.anInt365 >= 722 && Static13.anInt365 <= 756 && Static108.anInt2880 >= 169 && Static108.anInt2880 < 205 && Static39.anIntArray89[6] != -1) {
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
			Static23.anInt875 = 6;
		}
		if (Static13.anInt365 >= 540 && Static13.anInt365 <= 574 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 502 && Static39.anIntArray89[7] != -1) {
			Static23.anInt875 = 7;
			Static57.aBoolean119 = true;
			Static70.aBoolean131 = true;
		}
		if (Static13.anInt365 >= 572 && Static13.anInt365 <= 602 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 503 && Static39.anIntArray89[8] != -1) {
			Static57.aBoolean119 = true;
			Static70.aBoolean131 = true;
			Static23.anInt875 = 8;
		}
		if (Static13.anInt365 >= 599 && Static13.anInt365 <= 629 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 503 && Static39.anIntArray89[9] != -1) {
			Static23.anInt875 = 9;
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
		}
		if (Static13.anInt365 >= 627 && Static13.anInt365 <= 671 && Static108.anInt2880 >= 467 && Static108.anInt2880 < 502 && Static39.anIntArray89[10] != -1) {
			Static70.aBoolean131 = true;
			Static57.aBoolean119 = true;
			Static23.anInt875 = 10;
		}
		if (Static13.anInt365 >= 669 && Static13.anInt365 <= 699 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 503 && Static39.anIntArray89[11] != -1) {
			Static23.anInt875 = 11;
			Static57.aBoolean119 = true;
			Static70.aBoolean131 = true;
		}
		if (Static13.anInt365 >= 696 && Static13.anInt365 <= 726 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 503 && Static39.anIntArray89[12] != -1) {
			Static70.aBoolean131 = true;
			Static23.anInt875 = 12;
			Static57.aBoolean119 = true;
		}
		if (Static13.anInt365 >= 724 && Static13.anInt365 <= 758 && Static108.anInt2880 >= 466 && Static108.anInt2880 < 502 && Static39.anIntArray89[13] != -1) {
			Static23.anInt875 = 13;
			Static57.aBoolean119 = true;
			Static70.aBoolean131 = true;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1605() {
		anIntArray337 = null;
		anIntArrayArrayArray5 = null;
		aClass2_Sub17_Sub1_1 = null;
		aClass11_40 = null;
		aClass80_1003 = null;
		aClass80_1007 = null;
		aClass80_1006 = null;
		aClass22_18 = null;
		aClass80_1005 = null;
		aClass80_1004 = null;
	}
}
