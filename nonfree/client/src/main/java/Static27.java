import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_319 = Static161.method2971("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!ld;")
	public static Class47 aClass47_6 = new Class47(260);

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_321 = Static161.method2971("flash1:");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_320 = aClass13_321;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_322 = aClass13_321;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array4 = new Class1_Sub2_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method811() {
		while (true) {
			@Pc(10) Class82 local10 = Static64.aClass82_5;
			@Pc(17) Class1_Sub18 local17;
			synchronized (Static64.aClass82_5) {
				local17 = (Class1_Sub18) Static15.aClass82_2.method2851();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass4_Sub1_46.method2272(local17.aClass28_3, false, (int) local17.aLong158, local17.aByteArray32);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method812() {
		aClass13_322 = null;
		aClass47_6 = null;
		aClass13_319 = null;
		aClass1_Sub2_Sub1_Sub3Array4 = null;
		aClass13_321 = null;
		aClass13_320 = null;
	}
}
