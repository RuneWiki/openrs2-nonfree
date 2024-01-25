import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt2622;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_5 = new Class117(1, 2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	public static int[] method2497(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static56.method1300(Static670.method6029(arg0));
		local6[0] = Static33.aCalendar24.get(5);
		local6[1] = Static33.aCalendar24.get(2);
		local6[2] = Static33.aCalendar24.get(1);
		return local6;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
	public static boolean method2499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static180.method8497(arg0, arg1) | (arg1 & 0x70000) != 0 || Static612.method8029(arg1, arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)I")
	public static int method2500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > arg1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg0;
			arg0 = local6;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}
}
