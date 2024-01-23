import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	public static int anInt4521;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[500];

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "J")
	public static long aLong179 = 0L;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lclient!sb;")
	public static Class152[] aClass152Array2 = new Class152[14];

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Walk here";

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString162 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3871(@OriginalArg(1) long arg0) {
		Static1.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static1.aCalendar1.get(7);
		@Pc(17) int local17 = Static1.aCalendar1.get(5);
		@Pc(27) int local27 = Static1.aCalendar1.get(2);
		@Pc(31) int local31 = Static1.aCalendar1.get(1);
		@Pc(35) int local35 = Static1.aCalendar1.get(11);
		@Pc(39) int local39 = Static1.aCalendar1.get(12);
		@Pc(43) int local43 = Static1.aCalendar1.get(13);
		return Static288.aStringArray34[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static187.aStringArray22[local27] + "-" + local31 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public static void method3873() {
		Static241.aClass175_35.method4287();
		Static85.aClass175_12.method4287();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILclient!od;I)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt3864 && arg2 != -1) {
			@Pc(20) Class152 local20 = Static107.method2016(arg2);
			@Pc(23) int local23 = local20.anInt4603;
			if (local23 == 1) {
				arg1.anInt3850 = 0;
				arg1.anInt3842 = 1;
				arg1.anInt3798 = arg0;
				arg1.anInt3847 = 0;
				arg1.anInt3789 = 0;
				Static291.method4385(local20, false, arg1.anInt3856, arg1.anInt3865, arg1.anInt3847);
			}
			if (local23 == 2) {
				arg1.anInt3789 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt3864 == -1 || Static107.method2016(arg2).anInt4608 >= Static107.method2016(arg1.anInt3864).anInt4608) {
			arg1.anInt3783 = arg1.anInt3863;
			arg1.anInt3864 = arg2;
			arg1.anInt3798 = arg0;
			arg1.anInt3842 = 1;
			arg1.anInt3847 = 0;
			arg1.anInt3789 = 0;
			arg1.anInt3850 = 0;
			if (arg1.anInt3864 != -1) {
				Static291.method4385(Static107.method2016(arg1.anInt3864), false, arg1.anInt3856, arg1.anInt3865, arg1.anInt3847);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
	public static void method3875() {
		if (Static13.aClass121_1 != null) {
			Static13.aClass121_1.method3575();
		}
		if (Static129.aClass121_2 != null) {
			Static129.aClass121_2.method3575();
		}
	}
}
