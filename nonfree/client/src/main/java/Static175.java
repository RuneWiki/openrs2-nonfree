import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Lclient!pe;")
	public static Class1_Sub2_Sub15 aClass1_Sub2_Sub15_3;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt3799;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!ng;")
	public static Class82 aClass82_4;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1032 = Static231.method3737("Location");

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1033 = Static231.method3737("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1034 = aClass107_1033;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1035 = Static231.method3737("Fps:");

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array22 = new Class107[8];

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1036 = Static231.method3737("VOLL");

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1037 = aClass107_1032;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)V")
	public static void method2779(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	public static void method2780(@OriginalArg(0) int arg0) {
		Static194.anInt4290 = -1;
		if (arg0 == 37) {
			Static24.aFloat2 = 3.0F;
		} else if (arg0 == 50) {
			Static24.aFloat2 = 4.0F;
		} else if (arg0 == 75) {
			Static24.aFloat2 = 6.0F;
		} else {
			Static24.aFloat2 = 8.0F;
		}
		Static194.anInt4290 = -1;
	}
}
