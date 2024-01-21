import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!cd;")
	private static Class10 aClass10_343 = Static51.method932("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_342 = aClass10_343;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!va;")
	public static Class2_Sub11 aClass2_Sub11_2 = new Class2_Sub11(8);

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static int anInt757 = -1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_344 = Static51.method932("Loaded interfaces");

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_345 = aClass10_344;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!sa;")
	public static Class72 aClass72_6 = new Class72(30);

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!cd;")
	private static Class10 aClass10_348 = Static51.method932("glow1:");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_346 = aClass10_348;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!sa;")
	public static Class72 aClass72_7 = new Class72(64);

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_347 = aClass10_348;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_349 = Static51.method932("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_350 = Static51.method932("Sprites geladen)3");

	@OriginalMember(owner = "client!d", name = "x", descriptor = "I")
	public static int anInt760 = 0;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
	public static int[] anIntArray60 = new int[500];

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_351 = Static51.method932("<col=40ff00>");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method595() {
		Static18.anIntArrayArray5 = null;
		Static57.aByteArrayArrayArray5 = null;
		Static37.anIntArrayArrayArray3 = null;
		Static121.anIntArray296 = null;
		Static100.anIntArray243 = null;
		Static145.aByteArrayArrayArray9 = null;
		Static36.anIntArray74 = null;
		Static150.anIntArray379 = null;
		Static95.anIntArray237 = null;
		Static99.aByteArrayArrayArray8 = null;
		Static9.aByteArrayArrayArray1 = null;
		Static11.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)I")
	public static int method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 256 - arg2;
		return (arg2 * (arg0 & 0xFF00) + (arg1 & 0xFF00) * local8 & 0xFF0000) + (local8 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method599() {
		aClass10_351 = null;
		aClass2_Sub11_2 = null;
		aClass10_349 = null;
		aClass72_7 = null;
		aClass10_343 = null;
		aClass10_348 = null;
		anIntArray60 = null;
		aClass10_346 = null;
		aClass10_344 = null;
		aClass10_345 = null;
		aClass10_347 = null;
		aClass72_6 = null;
		aClass10_350 = null;
		aClass10_342 = null;
	}
}
