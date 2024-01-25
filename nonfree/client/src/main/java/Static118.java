import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!sc;")
	public static final Class208 aClass208_6 = new Class208();

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!o;")
	public static final Class169 aClass169_103 = new Class169("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1733(@OriginalArg(1) String arg0) {
		Static101.method1458("", 0, 0, "", arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method1734() {
		if (Static17.aClass164_1 != null) {
			Static17.aClass164_1.method5320();
			Static42.aClass137_1 = null;
			Static17.aClass164_1 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ui;Lclient!di;Lclient!ui;Lclient!ui;I)Z")
	public static boolean method1736(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class1_Sub7_Sub1 arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		Static179.aClass230_48 = arg2;
		Static394.aClass230_94 = arg0;
		Static197.aClass1_Sub7_Sub1_3 = arg1;
		Static31.aClass230_9 = arg3;
		return true;
	}
}
