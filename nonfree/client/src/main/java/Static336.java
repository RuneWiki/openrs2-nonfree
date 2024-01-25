import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_183 = new Class235(76, 4);

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	public static int anInt5682 = 1;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_9 = new Class101(7, 0, 1, 1);

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	public static void method4661() {
		if (Static16.aClass134_1 == null) {
			return;
		}
		Static544.aClass209_9.method4186();
		Static145.method2157();
		Static376.method5050();
		Static342.method4693();
		Static253.method3723();
		Static92.method1616();
		if (Static544.aClass197_1 != null) {
			Static544.aClass197_1.method3945();
		}
		Static331.method4529();
		Static283.method3948();
		Static403.method5616();
		Static108.method1744();
		Static507.method7074(false);
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class8_Sub3_Sub3_Sub1_Sub1 local39 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local33];
			if (local39 != null) {
				for (@Pc(43) int local43 = 0; local43 < local39.aClass63Array3.length; local43++) {
					local39.aClass63Array3[local43] = null;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static35.anInt540; local68++) {
			@Pc(75) Class8_Sub3_Sub3_Sub1_Sub2 local75 = Static466.aClass1_Sub42Array1[local68].aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass63Array3.length; local79++) {
					local75.aClass63Array3[local79] = null;
				}
			}
		}
		Static250.aClass113_2 = null;
		Static458.aClass113_6 = null;
		Static16.aClass134_1.method6939();
		Static16.aClass134_1 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4662(@OriginalArg(1) long arg0) {
		Static584.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static584.aCalendar2.get(7);
		@Pc(17) int local17 = Static584.aCalendar2.get(5);
		@Pc(26) int local26 = Static584.aCalendar2.get(2);
		@Pc(30) int local30 = Static584.aCalendar2.get(1);
		@Pc(34) int local34 = Static584.aCalendar2.get(11);
		@Pc(38) int local38 = Static584.aCalendar2.get(12);
		@Pc(42) int local42 = Static584.aCalendar2.get(13);
		return Static592.aStringArray43[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static225.aStringArray19[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	public static void method4664(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(16, arg0);
		local8.method6593();
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Z")
	public static boolean method4665(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
