import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_21;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_22;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt3476 = 0;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray18 = new byte[1000][];

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt3481 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1447 = Static59.method1195("Cancel");

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1446 = aClass60_1447;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public static int anInt3484 = 0;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!eb;")
	public static Class17 aClass17_56 = new Class17(64);

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public static int anInt3485 = -1;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int anInt3486 = 0;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1448 = Static59.method1195("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!eb;")
	public static Class17 aClass17_57 = new Class17(30);

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1449 = Static59.method1195("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray72 = new boolean[5];

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1450 = Static59.method1195("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1451 = Static59.method1195("gr-Un:");

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1452 = Static59.method1195("Untersuchen");

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method2301() {
		aClass3_Sub1_Sub2_Sub4_22 = null;
		aClass17_56 = null;
		anIntArray392 = null;
		aClass60_1447 = null;
		aClass60_1450 = null;
		aClass60_1448 = null;
		Class82.anIntArray393 = null;
		aClass60_1452 = null;
		aClass3_Sub1_Sub2_Sub4_21 = null;
		aClass17_57 = null;
		aClass60_1446 = null;
		aBooleanArray72 = null;
		aByteArrayArray18 = null;
		aClass60_1449 = null;
		aClass60_1451 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public static void method2302(@OriginalArg(1) boolean arg0) {
		Static100.method1983();
		Static17.anInt758++;
		if (Static17.anInt758 < 50 && !arg0) {
			return;
		}
		Static17.anInt758 = 0;
		if (Static62.aBoolean67 || Static104.aClass47_3 == null) {
			return;
		}
		Static81.aClass3_Sub12_Sub1_2.method1980(183);
		try {
			Static104.aClass47_3.method1562(Static81.aClass3_Sub12_Sub1_2.aByteArray77, Static81.aClass3_Sub12_Sub1_2.anInt2886);
			Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
		} catch (@Pc(46) IOException local46) {
			Static62.aBoolean67 = true;
		}
	}
}
