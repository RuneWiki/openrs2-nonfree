import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_9;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "[I")
	public static int[] anIntArray105 = new int[50];

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
	public static int anInt847 = 0;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "Lclient!vc;")
	private static Class71 aClass71_497 = Static38.method736("Error loading your profile)3");

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_495 = aClass71_497;

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
	public static int anInt850 = 0;

	@OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lclient!qa;")
	public static Class54 aClass54_20 = new Class54(64);

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_496 = Static38.method736("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
	public static int anInt853 = 0;

	@OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_498 = Static38.method736("Bad session id)3");

	@OriginalMember(owner = "client!fb", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_499 = aClass71_498;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public static void method616() {
		for (@Pc(14) Class5_Sub4 local14 = (Class5_Sub4) Static14.aClass52_3.method1358(); local14 != null; local14 = (Class5_Sub4) Static14.aClass52_3.method1363()) {
			if (local14.aClass5_Sub2_Sub1_1 != null) {
				Static19.aClass5_Sub2_Sub2_1.method1121(local14.aClass5_Sub2_Sub1_1);
				local14.aClass5_Sub2_Sub1_1 = null;
			}
			if (local14.aClass5_Sub2_Sub1_2 != null) {
				Static19.aClass5_Sub2_Sub2_1.method1121(local14.aClass5_Sub2_Sub1_2);
				local14.aClass5_Sub2_Sub1_2 = null;
			}
		}
		Static14.aClass52_3.method1360();
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public static void method617() {
		aClass71_495 = null;
		aClass71_499 = null;
		aClass71_497 = null;
		aClass71_498 = null;
		aClass24_Sub1_9 = null;
		aClass54_20 = null;
		anIntArray105 = null;
		aClass71_496 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!vc;")
	public static Class71 method618(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static51.method962(arg0) : Static72.aClass71_877;
	}
}
