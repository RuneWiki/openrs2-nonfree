import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!rf;")
	public static Class69 aClass69_4;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!pd;")
	public static Class20 aClass20_53;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "[Lclient!ub;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1353 = Static28.method504("wishes to duel with you)3");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1346 = aClass39_1353;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1347 = Static28.method504("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1348 = Static28.method504(" )2> ");

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1352 = Static28.method504("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1349 = aClass39_1352;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1350 = Static28.method504("wishes to trade with you)3");

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1351 = aClass39_1350;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Lclient!le;")
	public static Class4_Sub10 method1873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub10 local7 = new Class4_Sub10();
		local7.anInt1724 = arg0;
		local7.anInt1721 = arg2;
		Static15.aClass42_4.method1056(local7, (long) arg1);
		Static42.method709(arg0);
		Static93.method2207(arg0);
		@Pc(29) Class4_Sub5 local29 = Static54.method949(arg1);
		if (local29 != null) {
			Static19.method344(local29);
		}
		if (Static101.aClass4_Sub5_55 != null) {
			Static19.method344(Static101.aClass4_Sub5_55);
			Static101.aClass4_Sub5_55 = null;
		}
		Static105.anInt2033 = 0;
		Static101.aBoolean122 = false;
		Static1.method6(Static73.anInt1764, Static51.anInt2470, Static65.anInt1666, Static126.anInt3156);
		return local7;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
	public static boolean method1874(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1875() {
		aClass39_1346 = null;
		aClass39_1352 = null;
		aClass39_1347 = null;
		aClass39_1351 = null;
		aClass76Array1 = null;
		aClass39_1350 = null;
		aClass39_1349 = null;
		aClass39_1348 = null;
		aClass69_4 = null;
		aClass20_53 = null;
		aClass39_1353 = null;
	}
}
