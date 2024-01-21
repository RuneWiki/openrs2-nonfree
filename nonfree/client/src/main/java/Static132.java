import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 aClass4_Sub3_Sub6_Sub1_Sub1_6;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!ud;")
	public static Class75 aClass75_15 = new Class75(32);

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_1136 = Static41.method597(":clan:");

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "Lclient!od;")
	private static Class60 aClass60_1141 = Static41.method597("Existing User");

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_1137 = aClass60_1141;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_1138 = Static41.method597("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_1139 = Static41.method597("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_1140 = Static41.method597("::qa_op_test");

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public static int anInt2950 = 0;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "Lclient!od;")
	public static Class60 aClass60_1142 = Static41.method597("Mitglieder)2Welt");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Z")
	public static boolean method1987(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static82.anIntArray226[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1001;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method1988() {
		aClass60_1139 = null;
		aClass60_1136 = null;
		aClass60_1141 = null;
		aClass75_15 = null;
		aClass60_1142 = null;
		aClass60_1138 = null;
		aClass60_1137 = null;
		aClass4_Sub3_Sub6_Sub1_Sub1_6 = null;
		aClass60_1140 = null;
	}
}
