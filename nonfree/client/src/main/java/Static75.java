import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!je", name = "mb", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!je", name = "wb", descriptor = "Z")
	public static boolean aBoolean117;

	@OriginalMember(owner = "client!je", name = "Db", descriptor = "Lclient!ah;")
	public static Class7 aClass7_32;

	@OriginalMember(owner = "client!je", name = "T", descriptor = "I")
	public static int anInt2242 = 0;

	@OriginalMember(owner = "client!je", name = "W", descriptor = "[S")
	public static short[] aShortArray25 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "Lclient!eh;")
	private static Class28 aClass28_687 = Static170.method3101("M");

	@OriginalMember(owner = "client!je", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_682 = aClass28_687;

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_683 = Static170.method3101("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!je", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_684 = Static170.method3101("Hier wechseln");

	@OriginalMember(owner = "client!je", name = "lb", descriptor = "Lclient!gf;")
	public static Class33 aClass33_10 = null;

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_685 = aClass28_687;

	@OriginalMember(owner = "client!je", name = "Ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_686 = Static170.method3101("leuchten3:");

	@OriginalMember(owner = "client!je", name = "Eb", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1728() {
		for (@Pc(4) Class3_Sub7 local4 = (Class3_Sub7) Static119.aClass87_11.method3203(); local4 != null; local4 = (Class3_Sub7) Static119.aClass87_11.method3199()) {
			@Pc(8) int local8 = local4.anInt1548;
			if (Static48.method1149(local8)) {
				@Pc(14) boolean local14 = true;
				@Pc(18) Class33[] local18 = Static42.aClass33ArrayArray1[local8];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					if (local18[local20] != null) {
						local14 = local18[local20].aBoolean90;
						break;
					}
				}
				if (!local14) {
					@Pc(42) int local42 = (int) local4.aLong144;
					@Pc(46) Class33 local46 = Static19.method576(local42);
					if (local46 != null) {
						Static16.method534(local46);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public static void method1729() {
		aClass28_685 = null;
		aClass28_682 = null;
		aShortArray25 = null;
		aClass28_684 = null;
		aClass7_32 = null;
		aClass3_Sub2_Sub2_Sub4Array1 = null;
		aClass28_683 = null;
		aClass28_686 = null;
		aClass33_10 = null;
		aClass28_687 = null;
	}
}
