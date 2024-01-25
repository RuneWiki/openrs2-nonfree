import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Lclient!fo;")
	public static Class129 aClass129_7;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "Lclient!rha;")
	public static final Class309 aClass309_6 = new Class309("LIVE", "", "", 0);

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
	public static int anInt3996 = -1;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	public static int anInt3999 = 0;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[4];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method3396(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static478.method6828(arg0);
		@Pc(10) int local10 = Static635.aCalendar2.get(5);
		@Pc(19) int local19 = Static635.aCalendar2.get(2);
		@Pc(23) int local23 = Static635.aCalendar2.get(1);
		return arg1 == 3 ? Static94.method1884(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static487.aStringArrayArray1[arg1][local19] + "-" + local23;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V")
	public static void method3397(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub6_Sub7 local17 = Static198.method3146((long) arg0, 2);
		local17.method1709();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!km;)V")
	public static void method3398(@OriginalArg(0) Class211 arg0) {
		Static52.aClass211_2 = arg0;
	}
}
