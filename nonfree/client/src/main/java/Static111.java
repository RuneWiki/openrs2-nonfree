import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_45;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt2413;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_46;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!u;")
	private static Class74 aClass74_1535 = Static72.method1077("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_1536 = Static72.method1077("Handel akzeptieren");

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1537 = Static72.method1077("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1538 = Static72.method1077("Neuer Benutzer");

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1539 = aClass74_1535;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_1540 = Static72.method1077(" )2> @whi@");

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_1541 = Static72.method1077("Nehmen");

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
	public static int[] anIntArray346 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ic;B)Lclient!u;")
	public static Class74 method1677(@OriginalArg(0) Class2_Sub10 arg0) {
		return Static70.method1064(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
	public static int method1678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 * 57 + arg1;
		@Pc(19) int local19 = local13 << 13 ^ local13;
		@Pc(33) int local33 = Integer.MAX_VALUE & (local19 * local19 * 15731 + 789221) * local19 + 1376312589;
		return local33 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lclient!s;")
	public static Class66 method1679() {
		try {
			return (Class66) Class.forName("Class66_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method1680() {
		aClass74_1540 = null;
		aClass74_1538 = null;
		aClass74_1539 = null;
		aClass74_1535 = null;
		aClass2_Sub2_Sub1_Sub1_46 = null;
		aClass74_1541 = null;
		anIntArray346 = null;
		aClass2_Sub2_Sub1_Sub1_45 = null;
		aClass74_1537 = null;
		aClass74_1536 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!ve;Lclient!ve;)Lclient!ve;")
	public static Class2_Sub2_Sub17 method1681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub17 arg2, @OriginalArg(4) Class2_Sub2_Sub17 arg3) {
		@Pc(32) Class2_Sub2_Sub17 local32 = Static7.method1865(0, arg0, arg1, arg2.anInt2829, arg2.anInt2810, Static89.aClass2_Sub2_Sub17ArrayArray1[arg2.anInt2794 >> 16], arg3, 0, 0, 0, arg2.anInt2794);
		if (local32 == null) {
			if (arg2.aClass2_Sub2_Sub17Array2 != null) {
				local32 = Static7.method1865(0, arg0, arg1, arg2.anInt2829, arg2.anInt2810, arg2.aClass2_Sub2_Sub17Array2, arg3, 0, 0, 0, arg2.anInt2794);
			}
			return local32;
		} else {
			return local32;
		}
	}
}
