import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_311 = Static146.method2172("sl_arrows");

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public static int anInt731 = 0;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!sg;")
	private static Class77 aClass77_315 = Static146.method2172("red:");

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_312 = aClass77_315;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!sg;")
	private static Class77 aClass77_317 = Static146.method2172("No response from server)3");

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_313 = aClass77_317;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_314 = Static146.method2172("<col=ffff00>*V");

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_316 = aClass77_315;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_318 = Static146.method2172(" <col=ffff00>");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method521() {
		for (@Pc(6) Class2_Sub25 local6 = (Class2_Sub25) Static63.aClass10_45.method444(); local6 != null; local6 = (Class2_Sub25) Static63.aClass10_45.method451()) {
			if (local6.aClass2_Sub9_Sub1_3 != null) {
				Static153.aClass2_Sub9_Sub4_2.method2938(local6.aClass2_Sub9_Sub1_3);
				local6.aClass2_Sub9_Sub1_3 = null;
			}
			if (local6.aClass2_Sub9_Sub1_2 != null) {
				Static153.aClass2_Sub9_Sub4_2.method2938(local6.aClass2_Sub9_Sub1_2);
				local6.aClass2_Sub9_Sub1_2 = null;
			}
		}
		Static63.aClass10_45.method454();
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method522() {
		aClass77_317 = null;
		aClass77_313 = null;
		aClass77_314 = null;
		aClass77_315 = null;
		anIntArray99 = null;
		aClass77_318 = null;
		aClass77_311 = null;
		aClass77_312 = null;
		aClass77_316 = null;
	}
}
