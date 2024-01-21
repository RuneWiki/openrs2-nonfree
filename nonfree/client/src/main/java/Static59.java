import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Z")
	public static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_535 = Static65.method1172("me");

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public static int anInt1602 = 127;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!kb;")
	public static Class46 aClass46_536 = Static65.method1172("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
	public static int[] anIntArray151 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "Lclient!kb;")
	private static Class46 aClass46_540 = Static65.method1172("To create a new account you need to");

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_538 = aClass46_540;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "Lclient!kb;")
	private static Class46 aClass46_539 = Static65.method1172("Please enter your password)3");

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Lclient!kb;")
	public static Class46 aClass46_541 = aClass46_539;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method1100(@OriginalArg(1) Class44 arg0) {
		Static80.aClass44_14 = arg0;
		Static135.anInt3166 = Static80.aClass44_14.method1619(16);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!h;)V")
	public static void method1101(@OriginalArg(1) Class33 arg0) {
		@Pc(6) int local6 = arg0.anInt1432;
		if (local6 == 324) {
			if (Static111.anInt2637 == -1) {
				Static25.anInt3993 = arg0.anInt1453;
				Static111.anInt2637 = arg0.anInt1448;
			}
			if (Static70.aClass64_2.aBoolean123) {
				arg0.anInt1448 = Static111.anInt2637;
			} else {
				arg0.anInt1448 = Static25.anInt3993;
			}
		} else if (local6 == 325) {
			if (Static111.anInt2637 == -1) {
				Static111.anInt2637 = arg0.anInt1448;
				Static25.anInt3993 = arg0.anInt1453;
			}
			if (Static70.aClass64_2.aBoolean123) {
				arg0.anInt1448 = Static25.anInt3993;
			} else {
				arg0.anInt1448 = Static111.anInt2637;
			}
		} else if (local6 == 327) {
			arg0.anInt1460 = 150;
			arg0.anInt1485 = (int) (Math.sin((double) Static20.anInt512 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1418 = -1;
			arg0.anInt1494 = 5;
		} else if (local6 == 328) {
			if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233 == null) {
				arg0.anInt1418 = 0;
			} else {
				arg0.anInt1460 = 150;
				arg0.anInt1485 = (int) (Math.sin((double) Static20.anInt512 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1494 = 5;
				arg0.anInt1418 = ((int) Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233.method1348() << 11) + 2047;
				arg0.anInt1493 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1719;
				arg0.anInt1423 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1686;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method1102() {
		aCalendar1 = null;
		aClass46_539 = null;
		aClass46_541 = null;
		aClass46_535 = null;
		aClass46_536 = null;
		aClass46_540 = null;
		aClass46_538 = null;
		anIntArray151 = null;
	}
}
