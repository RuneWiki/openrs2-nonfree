import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ie", name = "mb", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array7;

	@OriginalMember(owner = "client!ie", name = "ub", descriptor = "Lclient!oc;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!ie", name = "Vb", descriptor = "I")
	public static int anInt1647;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
	public static int anInt1618 = -1;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_571 = Static2.method59(" )2> @lre@");

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_572 = Static2.method59("Sprites geladen)3");

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "Lclient!wd;")
	private static Class80 aClass80_573 = Static2.method59("Prepared visibility map");

	@OriginalMember(owner = "client!ie", name = "kb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_574 = Static2.method59("mapmarker");

	@OriginalMember(owner = "client!ie", name = "Ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_575 = Static2.method59("T");

	@OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
	public static int[] anIntArray208 = new int[2048];

	@OriginalMember(owner = "client!ie", name = "Wb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_577 = Static2.method59("Create a free account");

	@OriginalMember(owner = "client!ie", name = "Rb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_576 = aClass80_577;

	@OriginalMember(owner = "client!ie", name = "Xb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_578 = aClass80_573;

	@OriginalMember(owner = "client!ie", name = "cc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_579 = Static2.method59("::noclip");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method953(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static28.method1427(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			System.out.println("Error: " + local12);
			local12 = local12.replace(':', '.');
			local12 = local12.replace('@', '_');
			local12 = local12.replace('&', '_');
			local12 = local12.replace('#', '_');
			if (Static18.aClass74_3.anApplet1 != null) {
				@Pc(106) Class56 local106 = Static18.aClass74_3.method1874(new URL(Static18.aClass74_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static7.anInt192 + "&u=" + Static30.aLong28 + "&v1=" + Static116.aString3 + "&v2=" + Static116.aString5 + "&e=" + local12));
				while (local106.anInt2056 == 0) {
					Static62.method1070(1L);
				}
				if (local106.anInt2056 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public static void method954() {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = -1; local7 < Static92.anInt2273; local7++) {
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = anIntArray208[local7];
			}
			@Pc(24) Class2_Sub1_Sub1_Sub4_Sub2 local24 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local16];
			if (local24 != null && local24.anInt2328 > 0) {
				local24.anInt2328--;
				if (local24.anInt2328 == 0) {
					local24.aClass80_918 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static110.anInt2908; local16++) {
			@Pc(56) int local56 = Static85.anIntArray277[local16];
			@Pc(60) Class2_Sub1_Sub1_Sub4_Sub1 local60 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local56];
			if (local60 != null && local60.anInt2328 > 0) {
				local60.anInt2328--;
				if (local60.anInt2328 == 0) {
					local60.aClass80_918 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public static void method960() {
		aClass80_576 = null;
		aClass56_4 = null;
		aClass80_577 = null;
		aClass80_573 = null;
		aClass80_572 = null;
		aClass2_Sub1_Sub9_Sub1Array7 = null;
		aClass80_578 = null;
		aClass80_575 = null;
		aClass80_574 = null;
		anIntArray208 = null;
		aClass80_571 = null;
		aClass80_579 = null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
	public static void method966() {
		while (true) {
			if (Static100.aClass2_Sub17_Sub1_1.method1807(Static65.anInt1843) >= 11) {
				@Pc(20) int local20 = Static100.aClass2_Sub17_Sub1_1.method1801(11);
				if (local20 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local20] == null) {
						local25 = true;
						Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local20] = new Class2_Sub1_Sub1_Sub4_Sub2();
						if (Static90.aClass2_Sub17Array1[local20] != null) {
							Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local20].method1445(Static90.aClass2_Sub17Array1[local20]);
						}
					}
					anIntArray208[Static92.anInt2273++] = local20;
					@Pc(61) Class2_Sub1_Sub1_Sub4_Sub2 local61 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local20];
					local61.anInt2342 = Static10.anInt300;
					@Pc(71) int local71 = Static8.anIntArray20[Static100.aClass2_Sub17_Sub1_1.method1801(3)];
					if (local25) {
						local61.anInt2347 = local71;
					}
					@Pc(85) int local85 = Static100.aClass2_Sub17_Sub1_1.method1801(5);
					@Pc(90) int local90 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
					if (local85 > 15) {
						local85 -= 32;
					}
					if (local90 == 1) {
						Static16.anIntArray68[Static93.anInt2410++] = local20;
					}
					@Pc(114) int local114 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
					@Pc(123) int local123 = Static100.aClass2_Sub17_Sub1_1.method1801(5);
					if (local123 > 15) {
						local123 -= 32;
					}
					local61.method1434(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0] + local123, local85 + Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], local114 == 1);
					continue;
				}
			}
			Static100.aClass2_Sub17_Sub1_1.method1806();
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ff;Z)Z")
	public static boolean method968(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(8) byte[] local8 = arg1.method372(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static39.method375(local8);
			return true;
		}
	}
}
