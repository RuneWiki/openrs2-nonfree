import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lclient!jb;")
	public static Class37 aClass37_8;

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
	public static int anInt2529;

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1588 = Static72.method1077("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1583 = aClass74_1588;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lclient!u;")
	private static Class74 aClass74_1584 = Static72.method1077("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1585 = Static72.method1077("(Udns");

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
	public static int anInt2524 = 0;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "Lclient!u;")
	public static Class74 aClass74_1586 = aClass74_1584;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public static int anInt2525 = -1;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1589 = Static72.method1077("Loading config )2 ");

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1587 = aClass74_1589;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1742(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static133.method956(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z")
	public static boolean method1743() {
		return Static9.anInt300 == 0 ? Static12.aClass2_Sub16_Sub2_1.method1791() : true;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method1744() {
		aClass74_1588 = null;
		aClass74_1587 = null;
		aClass74_1585 = null;
		aClass74_1583 = null;
		aClass37_8 = null;
		aClass74_1589 = null;
		aClass74_1584 = null;
		aClass74_1586 = null;
	}
}
