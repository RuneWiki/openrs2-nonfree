import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!dn;")
	public static Class69 aClass69_89;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Lclient!raa;")
	public static final Class246 aClass246_5 = new Class246();

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!kca;")
	public static final Class1_Sub28 aClass1_Sub28_1 = new Class1_Sub28(0, 0);

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public static int anInt7958 = 0;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_122 = new Class252(26, 7);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7008(@OriginalArg(1) long arg0) {
		Static545.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static545.aCalendar2.get(7);
		@Pc(17) int local17 = Static545.aCalendar2.get(5);
		@Pc(21) int local21 = Static545.aCalendar2.get(2);
		@Pc(25) int local25 = Static545.aCalendar2.get(1);
		@Pc(29) int local29 = Static545.aCalendar2.get(11);
		@Pc(38) int local38 = Static545.aCalendar2.get(12);
		@Pc(42) int local42 = Static545.aCalendar2.get(13);
		return Static532.aStringArray41[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static18.aStringArray1[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!os;I)V")
	public static void method7009(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method4480();
		Static507.aClass211Array1 = new Class211[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static507.aClass211Array1[local14] = new Class211();
			Static507.aClass211Array1[local14].anInt6295 = arg0.method4480();
			Static507.aClass211Array1[local14].aString151 = arg0.method4456();
		}
		Static411.anInt9221 = arg0.method4480();
		Static81.anInt1884 = arg0.method4480();
		Static329.anInt6176 = arg0.method4480();
		Static332.aClass38_Sub1Array99 = new Class38_Sub1[Static81.anInt1884 + 1 - Static411.anInt9221];
		for (@Pc(62) int local62 = 0; local62 < Static329.anInt6176; local62++) {
			@Pc(68) int local68 = arg0.method4480();
			@Pc(76) Class38_Sub1 local76 = Static332.aClass38_Sub1Array99[local68] = new Class38_Sub1();
			local76.anInt5565 = arg0.method4487();
			local76.anInt5571 = arg0.method4481();
			local76.anInt5576 = local68 + Static411.anInt9221;
			local76.aString133 = arg0.method4456();
			local76.aString132 = arg0.method4456();
		}
		Static75.anInt1799 = arg0.method4481();
		Static69.aBoolean144 = true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z")
	public static boolean method7010(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 17 || arg0 == 59 || arg0 == 23 || arg0 == 45) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1012;
		}
	}
}
