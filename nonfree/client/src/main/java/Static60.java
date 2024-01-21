import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 aClass2_Sub3_Sub2_Sub4_Sub1_3;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
	public static int[] anIntArray92 = new int[100];

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_393 = Static38.method685("(Udns");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_395 = Static38.method685("Too many connections from your address)3");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_394 = aClass6_395;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt1424 = -1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method924() {
		anIntArray92 = null;
		aClass6_394 = null;
		aClass6_395 = null;
		aClass6_393 = null;
		aClass2_Sub3_Sub2_Sub4_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class6 method925(@OriginalArg(1) int arg0) {
		return Static58.method956(new Class6[] { Static106.method2806(arg0 >> 24 & 0xFF), Static47.aClass6_365, Static106.method2806(arg0 >> 16 & 0xFF), Static47.aClass6_365, Static106.method2806(arg0 >> 8 & 0xFF), Static47.aClass6_365, Static106.method2806(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!qf;")
	public static Class2_Sub3_Sub14 method926() {
		if (Static38.aClass2_Sub3_Sub14_1 == null) {
			Static38.aClass2_Sub3_Sub14_1 = new Class2_Sub3_Sub14();
		}
		return Static38.aClass2_Sub3_Sub14_1;
	}
}
