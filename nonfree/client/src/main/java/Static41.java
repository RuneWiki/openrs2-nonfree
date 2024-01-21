import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_17;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!le;")
	public static Class36 aClass36_17 = new Class36(50);

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
	public static int[] anIntArray96 = new int[1000];

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public static int anInt1398 = 0;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!rc;")
	private static Class55 aClass55_539 = Static34.method846("Prepared sound engine");

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!rc;")
	private static Class55 aClass55_540 = Static34.method846("Connecting to friendserver");

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt1399 = 0;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_541 = aClass55_540;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_542 = aClass55_539;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!rc;")
	public static Class55 aClass55_543 = Static34.method846("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	public static int anInt1401 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method923() {
		Static100.aClass36_35.method1155();
		Static51.aClass36_20.method1155();
		Static97.aClass36_33.method1155();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)I")
	public static int method924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method926() {
		aClass55_539 = null;
		aClass55_541 = null;
		aClass55_542 = null;
		aClass36_17 = null;
		aClass55_540 = null;
		anIntArray96 = null;
		aClass40_Sub1_17 = null;
		anIntArray97 = null;
		aBooleanArray3 = null;
		aClass55_543 = null;
	}
}
