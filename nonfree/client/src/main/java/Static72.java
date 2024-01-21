import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_11;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!tb;")
	public static Class70 aClass70_15 = new Class70();

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_709 = Static121.method2047("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
	public static int[] anIntArray189 = new int[200];

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!qc;")
	public static Class60 aClass60_710 = Static121.method2047("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_711 = Static121.method2047("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_712 = Static121.method2047("k");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1382() {
		anIntArray189 = null;
		aClass40_Sub1_11 = null;
		anIntArray188 = null;
		aClass70_15 = null;
		aClass60_711 = null;
		aClass60_710 = null;
		anIntArray187 = null;
		aClass60_712 = null;
		aClass60_709 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1383() {
		for (@Pc(10) Class4_Sub21 local10 = (Class4_Sub21) Static8.aClass70_2.method1939(); local10 != null; local10 = (Class4_Sub21) Static8.aClass70_2.method1936()) {
			if (local10.aClass4_Sub2_Sub1_3 != null) {
				Static119.aClass4_Sub2_Sub3_2.method750(local10.aClass4_Sub2_Sub1_3);
				local10.aClass4_Sub2_Sub1_3 = null;
			}
			if (local10.aClass4_Sub2_Sub1_2 != null) {
				Static119.aClass4_Sub2_Sub3_2.method750(local10.aClass4_Sub2_Sub1_2);
				local10.aClass4_Sub2_Sub1_2 = null;
			}
		}
		Static8.aClass70_2.method1933();
	}
}
