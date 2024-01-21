import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!of;")
	public static Class1_Sub19 aClass1_Sub19_2 = new Class1_Sub19(8);

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lclient!qd;")
	public static Class63 aClass63_9 = new Class63(64);

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lclient!id;")
	private static Class34 aClass34_592 = Static9.method266("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_593 = aClass34_592;

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "Lclient!jd;")
	public static Class38 aClass38_8 = new Class38();

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lclient!id;")
	public static Class34 aClass34_594 = Static9.method266("sl_stars");

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_595 = Static9.method266("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lclient!id;")
	private static Class34 aClass34_597 = Static9.method266("Password: ");

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_596 = aClass34_597;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
	public static int anInt1241 = 128;

	@OriginalMember(owner = "client!ge", name = "jb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ie;I)V")
	public static void method739(@OriginalArg(0) Class35 arg0) {
		Static17.aClass35_4 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!id;BLclient!id;Lclient!ie;)Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 method740(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class35 arg2) {
		@Pc(8) int local8 = arg2.method1582(arg1);
		@Pc(22) int local22 = arg2.method1564(arg0, local8);
		return Static113.method1819(local22, arg2, local8);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
	public static boolean method741(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method742() {
		aBooleanArray8 = null;
		aClass38_8 = null;
		aClass34_592 = null;
		aClass63_9 = null;
		aClass34_596 = null;
		aClass34_597 = null;
		aClass34_593 = null;
		aClass34_594 = null;
		aByteArray17 = null;
		aClass1_Sub19_2 = null;
		aClass34_595 = null;
	}
}
