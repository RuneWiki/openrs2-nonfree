import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static65 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt5541;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt5538 = 0;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!gd;")
	public static Class61 aClass61_52 = new Class61(500);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Z")
	public static boolean aBoolean466 = false;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
	public static int[] anIntArray476 = new int[500];

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString193 = "glow1:";

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!pk;)Z")
	public static boolean method4176(@OriginalArg(1) Class132 arg0) {
		return arg0.method3166(Static61.anInt1335);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BJ)V")
	public static void method4180(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static66.aClass8_Sub2_Sub1_4.method2398(99);
			Static66.aClass8_Sub2_Sub1_4.method2378(arg0);
		}
	}
}
