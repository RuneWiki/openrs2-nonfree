import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_29;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!bc;")
	public static Class6 aClass6_9;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt1070;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_21;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt1067 = 0;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_493 = Static108.method1915("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
	public static int[] anIntArray155 = new int[50];

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!kd;")
	private static Class39 aClass39_494 = Static108.method1915("System update in: ");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt1068 = 0;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_497 = Static108.method1915("M");

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_495 = aClass39_497;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_496 = Static108.method1915("hitmarks");

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_498 = aClass39_494;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!ta;")
	public static Class70 aClass70_1 = new Class70(32);

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_499 = Static108.method1915("(U4");

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!kd;")
	private static Class39 aClass39_502 = Static108.method1915("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_500 = aClass39_502;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[Lclient!qc;")
	public static Class1_Sub18[] aClass1_Sub18Array1 = new Class1_Sub18[2048];

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_501 = Static108.method1915("p11_full");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
	public static int method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			arg1--;
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method646() {
		aClass1_Sub18Array1 = null;
		aClass39_497 = null;
		aClass39_500 = null;
		aClass70_1 = null;
		aClass39_496 = null;
		aClass39_493 = null;
		aClass39_499 = null;
		aClass39_494 = null;
		aClass39_501 = null;
		aClass39_495 = null;
		aClass39_502 = null;
		aByteArrayArray3 = null;
		aClass6_9 = null;
		aClass62_Sub1_29 = null;
		aClass39_498 = null;
		aClass1_Sub1_Sub4_Sub1_21 = null;
		anIntArray155 = null;
	}
}
