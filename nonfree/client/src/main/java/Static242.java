import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	public static int anInt5008;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
	public static int anInt5017;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "[I")
	public static final int[] anIntArray293 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method4538(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static573.method7712(arg1);
		@Pc(10) int local10 = Static462.aCalendar4.get(5);
		@Pc(14) int local14 = Static462.aCalendar4.get(2);
		@Pc(18) int local18 = Static462.aCalendar4.get(1);
		return arg0 == 3 ? Static105.method1584(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static558.aStringArrayArray2[arg0][local14] + "-" + local18;
	}
}
