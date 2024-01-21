import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_905 = Static181.method2795("Location");

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[J")
	public static final long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_908 = Static181.method2795("Please enter your password)3");

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Lclient!qe;")
	public static Class83 aClass83_906 = aClass83_908;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!qe;")
	public static Class83 aClass83_907 = aClass83_905;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_909 = Static181.method2795("sl_button");

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_911 = Static181.method2795("Please wait)3)3)3");

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "Lclient!qe;")
	public static Class83 aClass83_910 = aClass83_911;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	public static int anInt3074 = 0;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	public static int anInt3076 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!qe;B)V")
	public static void method2340(@OriginalArg(0) Class83 arg0) {
		try {
			Static39.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method2395(Static39.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(10) Exception local10) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	public static void method2341() {
		@Pc(5) Object local5 = Static167.anObject4;
		synchronized (Static167.anObject4) {
			if (Static104.anInt2409 != 0) {
				Static104.anInt2409 = 1;
				try {
					Static167.anObject4.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILclient!eh;)Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 method2342(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		return Static161.method222(arg1, arg0) ? Static176.method2705() : null;
	}
}
