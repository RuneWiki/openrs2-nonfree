import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "[B")
	public static byte[] aByteArray8;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_580 = Static56.method972("Prepared sound engine");

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "Lclient!ae;")
	public static Class5 aClass5_579 = aClass5_580;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
	public static int anInt1247 = -1;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_13 = new Class9(64);

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lclient!ae;")
	private static Class5 aClass5_581 = Static56.method972("New User");

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_582 = Static56.method972(" has logged in)3");

	@OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
	public static int anInt1250 = 0;

	@OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_583 = aClass5_581;

	@OriginalMember(owner = "client!ib", name = "nb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_14 = new Class9(30);

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_584 = aClass5_582;

	@OriginalMember(owner = "client!ib", name = "qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_585 = Static56.method972("weiss:");

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_586 = Static56.method972("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ib", name = "sb", descriptor = "I")
	public static int anInt1252 = 0;

	@OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
	public static int anInt1253 = 1;

	@OriginalMember(owner = "client!ib", name = "ub", descriptor = "Lclient!ae;")
	public static Class5 aClass5_587 = Static56.method972("Fps:");

	@OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
	public static final int anInt1254 = 7759444;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public static void method836() {
		aClass5_580 = null;
		aClass9_14 = null;
		aClass5_584 = null;
		anIntArrayArrayArray1 = null;
		aClass5_585 = null;
		aClass5_587 = null;
		aClass9_13 = null;
		aClass5_579 = null;
		aClass5_582 = null;
		aClass5_583 = null;
		aClass5_581 = null;
		aByteArray8 = null;
		aClass5_586 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)Lclient!ae;")
	public static Class5 method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - arg1;
		if (local4 < -9) {
			return Static85.aClass5_962;
		} else if (local4 < -6) {
			return Static83.aClass5_939;
		} else if (local4 < -3) {
			return Static42.aClass5_546;
		} else if (local4 < 0) {
			return Static24.aClass5_331;
		} else if (local4 > 9) {
			return Static62.aClass5_793;
		} else if (local4 > 6) {
			return Static34.aClass5_457;
		} else if (local4 > 3) {
			return Static64.aClass5_797;
		} else if (local4 > 0) {
			return Static3.aClass5_96;
		} else {
			return Static23.aClass5_314;
		}
	}
}
