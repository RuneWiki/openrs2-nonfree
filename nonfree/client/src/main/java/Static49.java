import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static49 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public static int anInt1089 = 0;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
	public static final int[] anIntArray122 = new int[250];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CI)Z")
	public static boolean method921(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	public static void method924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static320.aClass4_Sub7_Sub1_3.method1237(135);
		}
		if (arg1 == 1) {
			Static320.aClass4_Sub7_Sub1_3.method1237(169);
		}
		Static320.aClass4_Sub7_Sub1_3.method2390(Static81.anInt1732 + arg2);
		Static320.aClass4_Sub7_Sub1_3.method2390(Static10.anInt231 + arg0);
		Static320.aClass4_Sub7_Sub1_3.method2384(Static77.aBooleanArray13[82] ? 1 : 0);
		Static165.aBoolean283 = false;
		Static219.anInt4563 = arg2;
		Static321.anInt6340 = arg0;
		Static100.method1855();
	}
}
