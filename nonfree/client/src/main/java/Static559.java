import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!br;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!tt;")
	public static Class340 aClass340_1;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!sea;")
	public static Class269 aClass269_1;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public static final int anInt9085 = 328;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[I")
	public static int[] method7936(@OriginalArg(1) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static125.method2359(Static162.method2939(arg0));
		local6[0] = Static379.aCalendar20.get(5);
		local6[1] = Static379.aCalendar20.get(2);
		local6[2] = Static379.aCalendar20.get(1);
		return local6;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
	public static void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub11_Sub4 local16 = Static583.method8201(19, (long) arg1 << 32 | (long) arg0);
		local16.method2194();
	}
}
