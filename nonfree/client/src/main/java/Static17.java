import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Lclient!jb;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "Lclient!qf;")
	private static Class60 aClass60_279 = Static59.method1195("K");

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!qf;")
	public static Class60 aClass60_275 = aClass60_279;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "I")
	public static int anInt758 = 0;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "Lclient!qf;")
	public static Class60 aClass60_276 = Static59.method1195("blinken2:");

	@OriginalMember(owner = "client!d", name = "L", descriptor = "Lclient!qf;")
	public static Class60 aClass60_277 = Static59.method1195("<col=00ff80>");

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!qf;")
	public static Class60 aClass60_278 = Static59.method1195("::");

	@OriginalMember(owner = "client!d", name = "X", descriptor = "I")
	public static int anInt764 = 0;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Lclient!qf;")
	private static Class60 aClass60_280 = Static59.method1195("Prepared visibility map");

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_281 = aClass60_279;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "J")
	public static long aLong25 = 0L;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_282 = Static59.method1195("Privater Chat");

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_283 = aClass60_280;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_284 = Static59.method1195("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
	public static void method502(@OriginalArg(0) int arg0) {
		if (Static104.anInt3014 == 0) {
			Static30.aClass3_Sub2_Sub4_1.method2188(arg0);
		} else {
			Static104.anInt3013 = arg0;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	public static void method503() {
		aClass60_281 = null;
		aClass60_278 = null;
		aClass60_275 = null;
		aClass60_279 = null;
		aClass60_276 = null;
		aClass25_3 = null;
		aClass60_282 = null;
		aClass60_284 = null;
		aClass60_277 = null;
		aClass60_280 = null;
		aClass60_283 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
	public static boolean method505(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
