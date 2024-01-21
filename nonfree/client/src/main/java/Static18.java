import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!jg;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array2;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_121 = Static65.method1172(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public static int anInt423 = 0;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public static int anInt425 = 0;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt426 = 2;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_122 = Static65.method1172("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!jg;)V")
	public static void method334(@OriginalArg(1) Class44 arg0) {
		Static46.aClass44_6 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method335() {
		aClass3_Sub2_Sub3_Sub3Array2 = null;
		aClass44_4 = null;
		aClass46_122 = null;
		aClass46_121 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLclient!id;)V")
	public static void method336(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		@Pc(6) int local6 = arg1.anInt1766;
		@Pc(10) int local10 = (int) arg1.aLong143;
		arg1.method2900();
		if (arg0) {
			Static156.method2535(local6);
		}
		Static56.method1052(local6);
		@Pc(25) Class33 local25 = Static179.method2873(local10);
		if (local25 != null) {
			Static142.method2373(local25);
		}
		Static105.aBoolean103 = false;
		Static87.anInt2129 = 0;
		Static66.method1174(Static163.anInt3620, Static56.anInt1516, Static33.anInt924, Static39.anInt3979);
		if (Static85.anInt674 != -1) {
			Static169.method2711(Static85.anInt674, 1);
		}
	}
}
