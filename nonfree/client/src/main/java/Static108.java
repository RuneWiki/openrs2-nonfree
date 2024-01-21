import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!pb;")
	public static Class31 aClass31_37;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt2749;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array47;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1451 = Static23.method501("Login server offline)3");

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt2743 = -1;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1452 = Static23.method501(":chalreq:");

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1453 = Static23.method501("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1454 = Static23.method501(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	public static int[] anIntArray405 = new int[25];

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public static int anInt2745 = -1;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public static int anInt2746 = 0;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1455 = Static23.method501(":0");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1456 = aClass42_1451;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public static int anInt2747 = 0;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public static int anInt2748 = 3;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1457 = Static23.method501("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1458 = Static23.method501("Invalid username or password)3");

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public static int anInt2750 = -1;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1459 = aClass42_1458;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public static void method1850(@OriginalArg(1) boolean arg0) {
		if (Static97.aClass47_29 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub8 local16 = new Class1_Sub8(4);
			local16.method1185(arg0 ? 2 : 3);
			local16.method1225(0);
			Static97.aClass47_29.method1343(4, local16.aByteArray24);
		} catch (@Pc(37) IOException local37) {
			try {
				Static97.aClass47_29.method1338();
			} catch (@Pc(42) Exception local42) {
			}
			Static97.aClass47_29 = null;
			Static58.anInt1442++;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method1851() {
		aClass42_1452 = null;
		aClass42_1459 = null;
		aClass42_1454 = null;
		aClass1_Sub1_Sub1_Sub1Array47 = null;
		aClass31_37 = null;
		aClass42_1456 = null;
		anIntArray405 = null;
		aClass42_1455 = null;
		aClass42_1458 = null;
		aClass42_1457 = null;
		aClass42_1451 = null;
		aClass42_1453 = null;
	}
}
