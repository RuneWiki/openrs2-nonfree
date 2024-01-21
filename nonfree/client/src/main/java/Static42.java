import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt1048;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt1049;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public static int anInt1052;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!bc;")
	public static Class8 aClass8_28 = new Class8(30);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lclient!pd;")
	public static Class2_Sub1_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub1_Sub4_Sub2Array1 = new Class2_Sub1_Sub1_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_462 = Static119.method1462("<col=ff9040>");

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!pe;")
	private static Class65 aClass65_463 = Static119.method1462("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt1050 = 0;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_464 = Static119.method1462("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!pe;")
	private static Class65 aClass65_465 = Static119.method1462("wishes to trade with you)3");

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_466 = Static119.method1462("auf der Hautpseite)3");

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_467 = aClass65_465;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_468 = Static119.method1462("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_469 = aClass65_463;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method738() {
		for (@Pc(7) int local7 = 0; local7 < Static110.anInt2469; local7++) {
			@Pc(13) int local13 = Static117.anIntArray340[local7];
			@Pc(17) Class2_Sub1_Sub1_Sub4_Sub2 local17 = aClass2_Sub1_Sub1_Sub4_Sub2Array1[local13];
			if (local17 != null) {
				Static7.method153(local17.aClass2_Sub1_Sub12_1.anInt2142, local17);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method739() {
		aClass8_28 = null;
		aClass65_464 = null;
		aClass2_Sub1_Sub1_Sub4_Sub2Array1 = null;
		aClass65_468 = null;
		aClass65_462 = null;
		aClass65_467 = null;
		aClass65_465 = null;
		aByteArrayArray3 = null;
		aClass65_466 = null;
		aClass65_469 = null;
		aShortArray13 = null;
		aClass65_463 = null;
	}
}
