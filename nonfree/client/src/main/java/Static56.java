import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_6;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
	public static int anInt1516;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "Lclient!kb;")
	private static Class46 aClass46_498 = Static65.method1172("Unable to connect)3");

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static int anInt1508 = 0;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!kb;")
	public static Class46 aClass46_499 = Static65.method1172("sl_back");

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "Lclient!kb;")
	private static Class46 aClass46_507 = Static65.method1172("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_500 = aClass46_507;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "Lclient!kb;")
	private static Class46 aClass46_503 = Static65.method1172("Type");

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!kb;")
	public static Class46 aClass46_501 = aClass46_503;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "Lclient!kb;")
	public static Class46 aClass46_502 = aClass46_498;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_504 = Static65.method1172("Freie Welt");

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "Lclient!kb;")
	private static Class46 aClass46_505 = Static65.method1172("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_506 = aClass46_498;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public static int anInt1517 = 0;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_508 = aClass46_505;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
	public static int anInt1521 = 2;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!qh;ILclient!jg;Lclient!jg;Lclient!jg;)Z")
	public static boolean method1049(@OriginalArg(0) Class3_Sub5_Sub2 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) Class44 arg3) {
		Static15.aClass44_2 = arg2;
		Static100.aClass44_18 = arg3;
		Static72.aClass44_12 = arg1;
		Static125.aClass3_Sub5_Sub2_2 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method1051() {
		aClass46_499 = null;
		aClass46_503 = null;
		aClass46_508 = null;
		aClass46_500 = null;
		aClass46_505 = null;
		aClass46_504 = null;
		aClass46_501 = null;
		aClass46_498 = null;
		aClass46_506 = null;
		aClass46_507 = null;
		aClass44_Sub1_6 = null;
		aClass46_502 = null;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	public static void method1052(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class3_Sub25 local10 = (Class3_Sub25) Static34.aClass54_3.method1598(); local10 != null; local10 = (Class3_Sub25) Static34.aClass54_3.method1609()) {
			if ((long) arg0 == (local10.aLong143 >> 48 & 0xFFFFL)) {
				local10.method2900();
			}
		}
	}
}
