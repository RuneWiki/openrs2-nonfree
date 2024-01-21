import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_14;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!uc;")
	public static Class77 aClass77_5;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!jb;")
	public static Class1_Sub10 aClass1_Sub10_1;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1093 = Static78.method1313("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!p;")
	public static Class63 aClass63_20 = new Class63(64);

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
	public static int[] anIntArray401 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1094 = Static78.method1313("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1095 = Static78.method1313("Mitglieder)2Welt");

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public static int anInt2322 = 1;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1099 = Static78.method1313("wishes to duel with you)3");

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1096 = aClass25_1099;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1097 = Static78.method1313("Benutzen");

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1100 = Static78.method1313("Ok");

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1098 = aClass25_1100;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!aa;")
	public static Class2 aClass2_10 = new Class2();

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1101 = aClass25_1094;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)I")
	public static int method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) Static67.aClass66_10.method1650((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 >= 0 && local6.anIntArray11.length > arg0) {
			return local6.anIntArray11[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public static void method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class1_Sub2_Sub12 local21 = (Class1_Sub2_Sub12) Static37.aClass66_7.method1650(local10);
		if (local21 != null) {
			Static127.aClass27_2.method897(local21);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1658() {
		aClass25_1095 = null;
		aClass25_1093 = null;
		aClass25_1096 = null;
		anIntArray401 = null;
		anIntArray402 = null;
		aClass1_Sub2_Sub2_Sub4_14 = null;
		aClass25_1099 = null;
		aClass25_1097 = null;
		aClass63_20 = null;
		aClass25_1100 = null;
		aClass77_5 = null;
		aClass25_1098 = null;
		aClass25_1094 = null;
		aClass1_Sub10_1 = null;
		aClass25_1101 = null;
		aClass2_10 = null;
	}
}
