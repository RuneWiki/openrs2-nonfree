import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_10;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!mc;")
	private static Class42 aClass42_393 = Static23.method501("purple:");

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_388 = aClass42_393;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!mc;")
	private static Class42 aClass42_389 = Static23.method501("Loading sprites )2 ");

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!mb;")
	public static Class41 aClass41_3 = new Class41(32);

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_390 = Static23.method501("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_391 = aClass42_389;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_392 = Static23.method501("(U");

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_394 = Static23.method501("null");

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_395 = Static23.method501("_");

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Lclient!mc;")
	public static Class42 aClass42_396 = null;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_397 = Static23.method501(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!mc;")
	public static Class42 aClass42_398 = Static23.method501("Nehmen");

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
	public static int anInt735 = -1;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public static int anInt736 = 0;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Lclient!mc;")
	public static Class42 aClass42_399 = Static23.method501("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method516() {
		aClass42_393 = null;
		aClass42_399 = null;
		aClass42_397 = null;
		aClass42_388 = null;
		aClass42_394 = null;
		aClass41_3 = null;
		aClass42_395 = null;
		aClass42_396 = null;
		aClass42_390 = null;
		aClass42_392 = null;
		aClass42_398 = null;
		aClass33_Sub1_10 = null;
		anIntArray71 = null;
		aClass42_391 = null;
		aClass42_389 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!ja;)Z")
	public static boolean method522(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(4) byte[] local4 = arg1.method1307(arg0);
		if (local4 == null) {
			return false;
		} else {
			Static23.method504(local4);
			return true;
		}
	}
}
