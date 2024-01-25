import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "Lclient!qn;")
	public static Class291 aClass291_2;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "Lclient!dr;")
	public static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_2;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z")
	public static boolean method4210() {
		return Static450.anInt7444 > 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public static void method4211(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(6, (long) arg0);
		local9.method2194();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BJI)Ljava/lang/String;")
	public static String method4212(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static125.method2359(arg0);
		@Pc(16) int local16 = Static379.aCalendar20.get(5);
		@Pc(22) int local22 = Static379.aCalendar20.get(2) + 1;
		@Pc(26) int local26 = Static379.aCalendar20.get(1);
		return Integer.toString(local16 / 10) + local16 % 10 + "/" + local22 / 10 + local22 % 10 + "/" + local26 % 100 / 10 + local26 % 10;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)Z")
	public static boolean method4214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static419.method1507(arg1, arg0) & (Static154.method2816(arg1, arg0) | (arg1 & 0x2000) != 0 | Static81.method1583(arg1, arg0));
	}
}
