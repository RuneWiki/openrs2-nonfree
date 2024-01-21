import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public static int anInt2995;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public static int anInt2998;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	public static int[] anIntArray468 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1479 = Static108.method1915(" )2>");

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1483 = Static108.method1915("K");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1480 = aClass39_1483;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1481 = aClass39_1483;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static volatile int anInt2992 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!jb;")
	public static Class33 aClass33_42 = new Class33(64);

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1482 = Static108.method1915("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1484 = Static108.method1915("Benutzername: ");

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1485 = Static108.method1915("<col=c0ff00>");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1486 = Static108.method1915("");

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1487 = Static108.method1915("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1488 = Static108.method1915("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2072() {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = -1; local3 < Static57.anInt1547; local3++) {
			if (local3 == -1) {
				local14 = 2047;
			} else {
				local14 = Static12.anIntArray91[local3];
			}
			@Pc(22) Class1_Sub1_Sub2_Sub1_Sub2 local22 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local14];
			if (local22 != null && local22.anInt2498 > 0) {
				local22.anInt2498--;
				if (local22.anInt2498 == 0) {
					local22.aClass39_1226 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static20.anInt731; local14++) {
			@Pc(58) int local58 = Static51.anIntArray192[local14];
			@Pc(62) Class1_Sub1_Sub2_Sub1_Sub1 local62 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local58];
			if (local62 != null && local62.anInt2498 > 0) {
				local62.anInt2498--;
				if (local62.anInt2498 == 0) {
					local62.aClass39_1226 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	public static int method2073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2075() {
		aClass39_1486 = null;
		aClass39_1481 = null;
		aClass39_1480 = null;
		aClass39_1488 = null;
		aClass39_1487 = null;
		aClass33_42 = null;
		aClass39_1482 = null;
		aClass1_Sub1_Sub1_4 = null;
		aClass39_1479 = null;
		anIntArray468 = null;
		aClass39_1484 = null;
		aClass39_1485 = null;
		aClass39_1483 = null;
	}
}
