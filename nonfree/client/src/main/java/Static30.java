import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static int anInt633;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!c;")
	public static Class17 aClass17_4 = new Class17();

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt636 = 0;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "[J")
	public static long[] aLongArray2 = new long[500];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method620(@OriginalArg(0) String arg0) {
		Static147.aString99 = arg0;
		if (Static95.aClass184_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static95.aClass184_3.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static95.aClass184_3.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static265.method4180(Static61.method1150() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static311.method1066("document.cookie=\"" + local36 + "\"", Static95.aClass184_3.anApplet1);
		} catch (@Pc(89) Throwable local89) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method622() {
		if (Static28.aBoolean46) {
			return;
		}
		if (Static115.aBoolean148) {
			Static126.aFloat73 = (int) Static126.aFloat73 + 191 & 0xFFFFFF80;
		} else {
			Static111.aFloat68 += (24.0F - Static111.aFloat68) / 2.0F;
		}
		Static28.aBoolean46 = true;
		Static82.aBoolean100 = true;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lclient!gh;")
	public static Class58 method623() {
		@Pc(33) Class58 local33;
		if (Static251.aBoolean330) {
			local33 = new Class58_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], Static99.aByteArrayArray8[0], Static138.anIntArray228);
		} else {
			local33 = new Class58_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], Static99.aByteArrayArray8[0], Static138.anIntArray228);
		}
		Static184.method2969();
		return local33;
	}
}
