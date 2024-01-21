import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "J")
	public static long aLong68;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_2142 = Static94.method1596("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!pb;")
	public static Class46 aClass46_7 = new Class46();

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	public static volatile int anInt2062 = 0;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
	public static int anInt2064 = 0;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Lclient!a;")
	private static Class1 aClass1_2147 = Static94.method1596("cyan:");

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!a;")
	public static Class1 aClass1_2143 = aClass1_2147;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!a;")
	public static Class1 aClass1_2144 = Static94.method1596("(U2");

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_2145 = Static94.method1596("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_2146 = Static94.method1596("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!ba;")
	public static Class2_Sub3 aClass2_Sub3_2 = new Class2_Sub3(8);

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "Lclient!la;")
	public static Class33 aClass33_2 = new Class33();

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "[I")
	public static int[] anIntArray266 = new int[1000];

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!a;")
	public static Class1 aClass1_2148 = Static94.method1596("Texturen geladen)3");

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!a;")
	public static Class1 aClass1_2149 = Static94.method1596("m");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1433() {
		aClass1_2147 = null;
		anIntArray266 = null;
		aClass46_7 = null;
		aClass33_2 = null;
		aClass1_2144 = null;
		aClass2_Sub1_Sub2_Sub4_5 = null;
		aClass1_2149 = null;
		aClass2_Sub3_2 = null;
		anIntArray265 = null;
		aClass1_2148 = null;
		aClass1_2146 = null;
		aClass1_2143 = null;
		aClass1_2142 = null;
		aClass1_2145 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1 method1436(@OriginalArg(0) int arg0) {
		@Pc(14) Class1 local14 = Static43.method994(arg0);
		for (@Pc(20) int local20 = local14.method10() - 3; local20 > 0; local20 -= 3) {
			local14 = Static97.method1655(new Class1[] { local14.method19(0, local20), Static60.aClass1_1853, local14.method1(local20) });
		}
		if (local14.method10() > 8) {
			local14 = Static97.method1655(new Class1[] { Static84.aClass1_2356, local14.method19(0, local14.method10() - 8), Static64.aClass1_1968, Static87.aClass1_2420, local14, Static85.aClass1_2368 });
		} else if (local14.method10() > 4) {
			local14 = Static97.method1655(new Class1[] { Static107.aClass1_2859, local14.method19(0, local14.method10() - 4), Static79.aClass1_2215, Static87.aClass1_2420, local14, Static85.aClass1_2368 });
		}
		return Static97.method1655(new Class1[] { Static81.aClass1_2273, local14 });
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method1440() {
		Static93.aClass11_23.method435();
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	public static void method1441() {
		try {
			@Pc(2) Graphics local2 = Static103.aCanvas1.getGraphics();
			Static53.aClass4_40.method1525(17, local2, 357);
		} catch (@Pc(15) Exception local15) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	public static void method1443() {
		if (Static77.aBoolean113 && Static50.anInt1644 != Static2.anInt287) {
			Static67.method1788(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], Static27.anInt1032, Static85.anInt2263, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], Static2.anInt287);
		} else if (Static7.anInt1201 != Static2.anInt287) {
			Static7.anInt1201 = Static2.anInt287;
			Static40.method1075(Static2.anInt287);
		}
	}
}
