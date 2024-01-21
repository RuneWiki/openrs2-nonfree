import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_15;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt1992 = 0;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt1993 = 1;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1047 = Static23.method501("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1048 = Static23.method501(" ");

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1049 = Static23.method501("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1050 = Static23.method501(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[112];

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt1998 = 0;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public static int anInt1999 = 0;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[B")
	public static byte[] aByteArray28 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1051 = Static23.method501("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
	public static void method1418(@OriginalArg(1) int arg0) {
		Static72.method1438(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method1419() {
		aBooleanArray14 = null;
		aClass42_1050 = null;
		aClass42_1047 = null;
		aClass42_1051 = null;
		aClass42_1049 = null;
		aClass42_1048 = null;
		aClass33_Sub1_15 = null;
		aByteArray28 = null;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method1422() {
		for (@Pc(11) Class1_Sub13 local11 = (Class1_Sub13) Static73.aClass22_10.method515(); local11 != null; local11 = (Class1_Sub13) Static73.aClass22_10.method519()) {
			if (local11.aClass1_Sub12_Sub2_1 != null) {
				Static91.aClass1_Sub12_Sub1_1.method1594(local11.aClass1_Sub12_Sub2_1);
				local11.aClass1_Sub12_Sub2_1 = null;
			}
			if (local11.aClass1_Sub12_Sub2_2 != null) {
				Static91.aClass1_Sub12_Sub1_1.method1594(local11.aClass1_Sub12_Sub2_2);
				local11.aClass1_Sub12_Sub2_2 = null;
			}
		}
		Static73.aClass22_10.method523();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1427() {
		Static80.aClass1_Sub8_Sub1_2.method1240();
		@Pc(13) int local13 = Static80.aClass1_Sub8_Sub1_2.method1238(8);
		@Pc(18) int local18;
		if (Static91.anInt2403 > local13) {
			for (local18 = local13; local18 < Static91.anInt2403; local18++) {
				Static64.anIntArray224[Static93.anInt2456++] = Static98.anIntArray375[local18];
			}
		}
		if (local13 > Static91.anInt2403) {
			throw new RuntimeException("gnpov1");
		}
		Static91.anInt2403 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(61) int local61 = Static98.anIntArray375[local18];
			@Pc(65) Class1_Sub1_Sub8_Sub1_Sub1 local65 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local61];
			@Pc(70) int local70 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			if (local70 == 0) {
				Static98.anIntArray375[Static91.anInt2403++] = local61;
				local65.anInt2559 = Static27.anInt768;
			} else {
				@Pc(95) int local95 = Static80.aClass1_Sub8_Sub1_2.method1238(2);
				if (local95 == 0) {
					Static98.anIntArray375[Static91.anInt2403++] = local61;
					local65.anInt2559 = Static27.anInt768;
					Static77.anIntArray313[Static63.anInt1520++] = local61;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local95 == 1) {
						Static98.anIntArray375[Static91.anInt2403++] = local61;
						local65.anInt2559 = Static27.anInt768;
						local139 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local65.method1758(local139, false);
						local149 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
						if (local149 == 1) {
							Static77.anIntArray313[Static63.anInt1520++] = local61;
						}
					} else if (local95 == 2) {
						Static98.anIntArray375[Static91.anInt2403++] = local61;
						local65.anInt2559 = Static27.anInt768;
						local139 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local65.method1758(local139, true);
						local149 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local65.method1758(local149, true);
						@Pc(203) int local203 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
						if (local203 == 1) {
							Static77.anIntArray313[Static63.anInt1520++] = local61;
						}
					} else if (local95 == 3) {
						Static64.anIntArray224[Static93.anInt2456++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)Z")
	public static boolean method1428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static6.anInt142) {
			return true;
		} else if (arg0 == 1 && Static97.anInt2484 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static17.anInt600 == arg1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!ja;)V")
	public static void method1429(@OriginalArg(1) Class33 arg0) {
		Static104.aClass33_31 = arg0;
	}
}
