import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Lclient!jc;")
	public static final Class145 aClass145_7 = new Class145();

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_113 = new Class6(95, 1);

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	public static int anInt6563 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5686(@OriginalArg(1) long arg0) {
		Static48.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static48.aCalendar1.get(7);
		@Pc(17) int local17 = Static48.aCalendar1.get(5);
		@Pc(21) int local21 = Static48.aCalendar1.get(2);
		@Pc(25) int local25 = Static48.aCalendar1.get(1);
		@Pc(29) int local29 = Static48.aCalendar1.get(11);
		@Pc(38) int local38 = Static48.aCalendar1.get(12);
		@Pc(42) int local42 = Static48.aCalendar1.get(13);
		return Static372.aStringArray32[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static408.aStringArray41[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
	public static void method5687() {
		if (Static34.aClass243_1 == null) {
			return;
		}
		if (Static34.aClass243_1.anInt6905 == 1) {
			Static34.aClass243_1 = null;
			return;
		}
		if (Static34.aClass243_1.anInt6905 == 2) {
			Static21.method865(2, Static42.aClass182_3, Static478.aString70);
			Static34.aClass243_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!vp;B)I")
	public static int method5688(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1) {
		if (!Static62.method1740(arg1).method7986(arg0) && arg1.anObjectArray6 == null) {
			return -1;
		} else if (arg1.anIntArray749 == null || arg1.anIntArray749.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray749[arg0];
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	public static void method5690(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static313.aClass206ArrayArrayArray2 = Static406.aClass206ArrayArrayArray3;
			Static290.aClass10Array7 = Static106.aClass10Array5;
		} else {
			Static313.aClass206ArrayArrayArray2 = Static171.aClass206ArrayArrayArray1;
			Static290.aClass10Array7 = Static53.aClass10Array3;
		}
		Static538.anInt9338 = Static313.aClass206ArrayArrayArray2.length;
	}
}
