import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString351 = "skill: ";

	@OriginalMember(owner = "client!te", name = "E", descriptor = "I")
	public static int anInt4922 = 0;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	public static int anInt4924 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3730(@OriginalArg(1) long arg0) {
		Static200.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static200.aCalendar1.get(7);
		@Pc(17) int local17 = Static200.aCalendar1.get(5);
		@Pc(26) int local26 = Static200.aCalendar1.get(2);
		@Pc(30) int local30 = Static200.aCalendar1.get(1);
		@Pc(34) int local34 = Static200.aCalendar1.get(11);
		@Pc(38) int local38 = Static200.aCalendar1.get(12);
		@Pc(42) int local42 = Static200.aCalendar1.get(13);
		return Static184.aStringArray34[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static117.aStringArray22[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!hc;Lclient!hc;)V")
	public static void method3731(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Class51 arg1) {
		Static153.aClass51_52 = arg0;
		Static221.aClass51_72 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Lclient!od;")
	public static Class1_Sub2_Sub12 method3732(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub12 local18 = (Class1_Sub2_Sub12) Static18.aClass58_1.method2093((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(33) byte[] local33;
		if (arg0 >= 32768) {
			local33 = Static226.aClass51_74.method1874(1, arg0 & 0x7FFF);
		} else {
			local33 = Static57.aClass51_20.method1874(1, arg0);
		}
		local18 = new Class1_Sub2_Sub12();
		if (local33 != null) {
			local18.method2912(new Class1_Sub13(local33));
		}
		if (arg0 >= 32768) {
			local18.method2913();
		}
		Static18.aClass58_1.method2089((long) arg0, local18);
		return local18;
	}
}
