import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static277 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Z")
	public static boolean aBoolean496;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_85 = new Class154(30);

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString206 = "Use";

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	public static int anInt5630 = -1;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt5631 = -1;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
	public static final int[] anIntArray457 = new int[1000];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!tq;)Lclient!si;")
	public static Class122_Sub4 method4777(@OriginalArg(1) Class4_Sub7 arg0) {
		return new Class122_Sub4(arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2402(), arg0.method2380());
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4778(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static320.aClass4_Sub7_Sub1_3.method1237(127);
			Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0));
			Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
		}
	}
}
