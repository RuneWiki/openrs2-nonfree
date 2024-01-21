import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt1093;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public static int anInt1096;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!pe;")
	private static Class65 aClass65_494 = Static119.method1462(" has logged in)3");

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_495 = aClass65_494;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	public static int[] anIntArray131 = new int[500];

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!pe;")
	private static Class65 aClass65_496 = Static119.method1462("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_497 = Static119.method1462("<img=0>");

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!pe;")
	private static Class65 aClass65_498 = Static119.method1462("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!pe;")
	private static Class65 aClass65_499 = Static119.method1462("Login");

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_500 = aClass65_499;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_501 = aClass65_498;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_502 = aClass65_496;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method766() {
		aClass65_501 = null;
		aClass65_499 = null;
		aClass65_498 = null;
		aClass65_495 = null;
		aClass65_496 = null;
		anIntArray131 = null;
		anIntArray130 = null;
		aClass65_494 = null;
		aClass65_500 = null;
		aClass65_502 = null;
		aClass65_497 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
	public static void method767(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static49.anInt1201 >= 100) {
			Static59.method1098(0, Static110.aClass65_1038, Static28.aClass65_337);
			return;
		}
		@Pc(27) Class65 local27 = Static57.method1080(arg0).method1506();
		for (@Pc(29) int local29 = 0; local29 < Static49.anInt1201; local29++) {
			if (Static30.aLongArray1[local29] == arg0) {
				Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { local27, Static127.aClass65_1193 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static91.anInt2030; local64++) {
			if (arg0 == Static93.aLongArray5[local64]) {
				Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { Static75.aClass65_979, local27, Static108.aClass65_1019 }));
				return;
			}
		}
		if (local27.method1512(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass65_457)) {
			Static59.method1098(0, Static110.aClass65_1038, Static117.aClass65_1117);
			return;
		}
		Static30.aLongArray1[Static49.anInt1201] = arg0;
		Static120.aClass65Array69[Static49.anInt1201++] = Static57.method1080(arg0);
		Static59.anInt1470 = Static8.anInt228;
		Static49.aClass2_Sub4_Sub1_1.method962(162);
		Static49.aClass2_Sub4_Sub1_1.method948(arg0);
	}
}
