import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!ch", name = "eb", descriptor = "Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 aClass1_Sub1_Sub12_Sub4_2;

	@OriginalMember(owner = "client!ch", name = "hb", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "Lclient!ed;")
	public static Class23 aClass23_272 = Static169.method2903("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Lclient!ff;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "Lclient!ed;")
	private static Class23 aClass23_276 = Static169.method2903("World");

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Lclient!ed;")
	public static Class23 aClass23_273 = aClass23_276;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lclient!ed;")
	private static Class23 aClass23_274 = Static169.method2903("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_275 = aClass23_274;

	@OriginalMember(owner = "client!ch", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_277 = null;

	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_278 = aClass23_276;

	@OriginalMember(owner = "client!ch", name = "fb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_279 = Static169.method2903("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ch", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_280 = aClass23_279;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Z")
	public static boolean method432(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	public static void method435() {
		aClass23_273 = null;
		aClass23_280 = null;
		anIntArray105 = null;
		aClass23_277 = null;
		aClass1_Sub1_Sub12_Sub4_2 = null;
		aClass23_276 = null;
		aClass23_278 = null;
		aClass23_272 = null;
		aClass23_275 = null;
		aClass23_279 = null;
		aClass1_Sub8_Sub1_1 = null;
		aClass23_274 = null;
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
	public static void method436() {
		Static50.aClass79_5.method2659();
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
	public static void method437() {
		Static8.aBoolean17 = true;
		Static159.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lclient!ed;")
	public static Class23 method438(@OriginalArg(1) int arg0) {
		return Static149.method2571(new Class23[] { Static27.method498(arg0 >> 24 & 0xFF), Static162.aClass23_1525, Static27.method498(arg0 >> 16 & 0xFF), Static162.aClass23_1525, Static27.method498(arg0 >> 8 & 0xFF), Static162.aClass23_1525, Static27.method498(arg0 & 0xFF) });
	}
}
