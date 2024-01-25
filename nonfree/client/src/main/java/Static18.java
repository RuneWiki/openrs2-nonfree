import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Lclient!vo;")
	public static Class348 aClass348_10;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Lclient!ct;")
	public static final Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Lclient!eq;")
	public static final Class96 aClass96_3 = new Class96();

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public static final int anInt941 = 7000;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(CI)Z")
	public static boolean method809(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method812(@OriginalArg(0) long arg0) {
		Static68.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static68.aCalendar1.get(7);
		@Pc(17) int local17 = Static68.aCalendar1.get(5);
		@Pc(21) int local21 = Static68.aCalendar1.get(2);
		@Pc(25) int local25 = Static68.aCalendar1.get(1);
		@Pc(29) int local29 = Static68.aCalendar1.get(11);
		@Pc(33) int local33 = Static68.aCalendar1.get(12);
		@Pc(37) int local37 = Static68.aCalendar1.get(13);
		return Static501.aStringArray38[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static388.aStringArray30[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!at;Z)V")
	public static void method815(@OriginalArg(0) Class21_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort119; local2 <= arg0.aShort120; local2++) {
			for (@Pc(6) int local6 = arg0.aShort121; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class182 local16 = Static571.aClass182ArrayArrayArray3[arg0.aByte127][local2][local6];
				if (local16 != null) {
					@Pc(21) Class192 local21 = local16.aClass192_2;
					@Pc(23) Class192 local23 = null;
					while (local21 != null) {
						if (local21.aClass21_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass192_2 = local21.aClass192_3;
							} else {
								local23.aClass192_3 = local21.aClass192_3;
							}
							local21.method4605();
							break;
						}
						local23 = local21;
						local21 = local21.aClass192_3;
					}
				}
			}
		}
		if (!arg1) {
			Static173.method2881(arg0);
		}
	}
}
