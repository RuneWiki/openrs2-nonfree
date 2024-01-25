import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array5;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Lclient!dm;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1124(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static279.method4735(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
	public static void method1126() {
		@Pc(5) byte local5 = 0;
		if (Static8.aBoolean7) {
			local5 = 55;
		}
		Static66.method1390(local5);
		Static204.method3633(local5);
		Static41.method896(local5);
		Static290.method4921(local5);
		Static189.method3464(local5);
		Static328.method5522(local5);
		Static68.method1519(local5);
		Static327.method5514(local5);
		Static192.method3485(local5);
		if (Static247.anInt3874 == 10) {
			Static293.method4971(28);
		} else if (Static247.anInt3874 == 30) {
			Static293.method4971(25);
			return;
		}
	}
}
