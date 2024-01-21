import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "Lclient!sf;")
	public static Class66 aClass66_11 = new Class66(50);

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Z")
	public static volatile boolean aBoolean47 = true;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "Lclient!he;")
	private static Class26 aClass26_438 = Static6.method100("scroll:");

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "Lclient!he;")
	public static Class26 aClass26_439 = aClass26_438;

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "Lclient!he;")
	private static Class26 aClass26_444 = Static6.method100("purple:");

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "Lclient!he;")
	public static Class26 aClass26_440 = aClass26_444;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_441 = aClass26_444;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "Lclient!he;")
	public static Class26 aClass26_442 = Static6.method100("jolt");

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
	public static int anInt893 = 1;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "[S")
	public static short[] aShortArray7 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "Lclient!he;")
	public static Class26 aClass26_443 = aClass26_438;

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_445 = Static6.method100(")3");

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "Lclient!he;")
	public static Class26 aClass26_446 = Static6.method100("weiss:");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ef;ILclient!ef;II)Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 method512(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return Static90.method1659(arg3, arg2, arg1) ? Static120.method2154(arg0.method566(arg2, arg3)) : null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!he;IIIIBLclient!he;)V")
	public static void method514(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class26 arg5) {
		if (Static109.aBoolean162 || Static56.anInt1695 >= 500) {
			return;
		}
		Static56.aClass26Array13[Static56.anInt1695] = arg5;
		Static29.aClass26Array7[Static56.anInt1695] = arg0;
		Static132.anIntArray411[Static56.anInt1695] = arg3;
		Static7.anIntArray16[Static56.anInt1695] = arg4;
		Static67.anIntArray338[Static56.anInt1695] = arg2;
		Static64.anIntArray178[Static56.anInt1695] = arg1;
		Static56.anInt1695++;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method515() {
		aClass66_11 = null;
		aClass26_440 = null;
		aShortArray7 = null;
		aClass26_444 = null;
		aClass26_443 = null;
		aClass26_441 = null;
		aByteArrayArrayArray1 = null;
		aClass26_439 = null;
		aClass26_445 = null;
		aClass26_438 = null;
		aClass26_442 = null;
		aClass26_446 = null;
	}
}
