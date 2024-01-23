import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
	public static boolean aBoolean25;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!mb;")
	public static Class70 aClass70_9;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ie;")
	public static Class53 aClass53_5 = new Class53(200);

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt604 = 0;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_192 = Static64.method1101("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!ia;")
	private static Class51 aClass51_193 = Static64.method1101("OFF");

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_194 = aClass51_193;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_195 = aClass51_192;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLclient!mb;)Lclient!fd;")
	public static Class1_Sub9 method479(@OriginalArg(0) int arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(6) byte[] local6 = arg1.method3524(arg0);
		return local6 == null ? null : new Class1_Sub9(local6);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Z")
	public static boolean method480() {
		try {
			if (Static198.anInt4222 == 2) {
				if (Static200.aClass1_Sub28_1 == null) {
					Static200.aClass1_Sub28_1 = Static240.method3715(Static3.aClass70_1, Static124.anInt4550, Static4.anInt78);
					if (Static200.aClass1_Sub28_1 == null) {
						return false;
					}
				}
				if (Static77.aClass88_1 == null) {
					Static77.aClass88_1 = new Class88(Static167.aClass70_35, Static181.aClass70_37);
				}
				if (Static225.aClass1_Sub4_Sub1_3.method377(Static77.aClass88_1, Static200.aClass1_Sub28_1, Static9.aClass70_4)) {
					Static225.aClass1_Sub4_Sub1_3.method394();
					Static225.aClass1_Sub4_Sub1_3.method362(Static191.anInt4125);
					Static225.aClass1_Sub4_Sub1_3.method392(Static200.aClass1_Sub28_1, Static21.aBoolean23);
					Static200.aClass1_Sub28_1 = null;
					Static198.anInt4222 = 0;
					Static3.aClass70_1 = null;
					Static77.aClass88_1 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static225.aClass1_Sub4_Sub1_3.method379();
			Static77.aClass88_1 = null;
			Static3.aClass70_1 = null;
			Static200.aClass1_Sub28_1 = null;
			Static198.anInt4222 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
	public static int method481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static167.method2863(arg0 - 1, arg1 + -1) + Static167.method2863(arg0 - 1, arg1 + 1) + Static167.method2863(arg0 + 1, arg1 + -1) + Static167.method2863(arg0 + 1, arg1 - -1);
		@Pc(75) int local75 = Static167.method2863(arg0, arg1 - 1) + Static167.method2863(arg0, arg1 + 1) + Static167.method2863(arg0 - 1, arg1) + Static167.method2863(arg0 + 1, arg1);
		@Pc(80) int local80 = Static167.method2863(arg0, arg1);
		return local80 / 4 + local45 / 16 + local75 / 8;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	public static void method482() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static14.aBooleanArray7[local7] = false;
		}
		Static161.anInt3480 = -1;
		Static164.anInt3637 = -1;
		Static70.anInt1624 = 1;
	}
}
