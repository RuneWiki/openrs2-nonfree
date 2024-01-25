import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!nh;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	public static int anInt524;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_1 = new Class92(16);

	@OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
	public static final int[] anIntArray61 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!b", name = "v", descriptor = "[S")
	public static short[] aShortArray2 = new short[256];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public static void method403() {
		Static68.aClass87_15.method2473(5);
		Static259.aClass87_26.method2473(5);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method404() {
		@Pc(1) Class87 local1 = Static20.aClass87_3;
		synchronized (Static20.aClass87_3) {
			Static20.aClass87_3.method2485();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method406(@OriginalArg(1) long arg0) {
		Static260.aCalendar4.setTime(new Date(arg0));
		@Pc(21) int local21 = Static260.aCalendar4.get(7);
		@Pc(25) int local25 = Static260.aCalendar4.get(5);
		@Pc(29) int local29 = Static260.aCalendar4.get(2);
		@Pc(33) int local33 = Static260.aCalendar4.get(1);
		@Pc(37) int local37 = Static260.aCalendar4.get(11);
		@Pc(41) int local41 = Static260.aCalendar4.get(12);
		@Pc(45) int local45 = Static260.aCalendar4.get(13);
		return Static337.aStringArray63[local21 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static233.aStringArray58[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
