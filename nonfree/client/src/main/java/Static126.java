import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array8;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array7;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_5;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt3633 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt3634 = 0;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt3635 = 0;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public static int anInt3636 = -1;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_909 = Static8.method128("Spieler");

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_910 = Static8.method128("headicons_hint");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method2489() {
		aClass18_909 = null;
		aClass18_910 = null;
		aClass1_Sub1_Sub8_Sub1Array8 = null;
		aClass1_Sub1_Sub8_Sub3Array7 = null;
		aClass1_Sub1_Sub8_Sub3_5 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method2490(@OriginalArg(1) int arg0) {
		if (Static41.anInt1326 == 0) {
			Static47.aClass1_Sub5_Sub3_12.method1239(arg0);
		} else {
			Static91.anInt2765 = arg0;
		}
	}
}
