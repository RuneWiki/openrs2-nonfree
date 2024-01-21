import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!fb;")
	public static Class3_Sub11 aClass3_Sub11_1 = new Class3_Sub11(0, 0);

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][105][105];

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "Lclient!sd;")
	private static Class73 aClass73_820 = Static122.method531("Close");

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_817 = aClass73_820;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!sd;")
	public static Class73 aClass73_818 = Static122.method531("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	public static volatile int anInt1534 = 0;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "Lclient!sd;")
	public static Class73 aClass73_819 = Static122.method531("Sprites geladen)3");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!sd;)V")
	public static void method1180(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(11) Class73 local11 = arg1.method2452().method2451();
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < Static6.anInt158; local20++) {
			@Pc(28) Class3_Sub1_Sub4_Sub7_Sub1 local28 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local20]];
			if (local28 != null && local28.aClass73_1521 != null && local28.aClass73_1521.method2438(local11)) {
				local18 = true;
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local28.anIntArray326[0], false, local28.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				if (arg0 == 1) {
					Static139.aClass3_Sub12_Sub1_3.method1400(255);
					Static139.aClass3_Sub12_Sub1_3.method1363(Static47.anIntArray184[local20]);
				} else if (arg0 == 4) {
					Static139.aClass3_Sub12_Sub1_3.method1400(132);
					Static139.aClass3_Sub12_Sub1_3.method1353(Static47.anIntArray184[local20]);
				} else if (arg0 == 6) {
					Static139.aClass3_Sub12_Sub1_3.method1400(86);
					Static139.aClass3_Sub12_Sub1_3.method1391(Static47.anIntArray184[local20]);
				} else if (arg0 == 7) {
					Static139.aClass3_Sub12_Sub1_3.method1400(205);
					Static139.aClass3_Sub12_Sub1_3.method1391(Static47.anIntArray184[local20]);
				}
				break;
			}
		}
		if (!local18) {
			Static135.method2234(0, Static19.method372(new Class73[] { Static27.aClass73_419, local11 }), Static173.aClass73_2030);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1181() {
		aByteArrayArrayArray3 = null;
		aClass3_Sub11_1 = null;
		aClass73_818 = null;
		aString2 = null;
		aClass73_817 = null;
		anIntArrayArrayArray5 = null;
		aClass73_819 = null;
		aClass73_820 = null;
	}
}
