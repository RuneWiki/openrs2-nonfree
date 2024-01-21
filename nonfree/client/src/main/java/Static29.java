import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "Lclient!ef;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ci", name = "db", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!ci", name = "fb", descriptor = "[[[Lclient!ga;")
	public static Class1_Sub8[][][] aClass1_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_197 = Static81.method1507("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ci", name = "X", descriptor = "Lclient!dj;")
	public static Class24 aClass24_195 = aClass24_197;

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_196 = Static81.method1507("sl_stars");

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
	public static int anInt766 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ve;BI)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method573(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1) {
		return Static136.method2383(arg1, arg0) ? Static122.method2070() : null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ID)V")
	public static void method574(@OriginalArg(1) double arg0) {
		if (arg0 == Static33.aDouble2) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static104.anIntArray192[local7] = local19 <= 255 ? local19 : 255;
		}
		Static33.aDouble2 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(II)Z")
	public static boolean method575(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!dj;)I")
	public static int method576(@OriginalArg(1) Class24 arg0) {
		return arg0.method781() + 1;
	}
}
