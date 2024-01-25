import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZ)V")
	public static void method8785(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(23) Class3_Sub48 local23 = Static89.method1200(Static517.aClass286_89, Static532.aClass400_3.aClass399_2);
			local23.aClass3_Sub28_Sub2_1.method5282(arg0);
			Static532.aClass400_3.method9223(local23);
		} else {
			Static185.method2825(Static80.aClass258_2, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
	public static void method8786(@OriginalArg(0) int arg0) {
		Static545.anInt7064 = arg0;
		@Pc(7) Class338 local7 = Static595.aClass338_57;
		synchronized (Static595.aClass338_57) {
			Static595.aClass338_57.method8051();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public static void method8787(@OriginalArg(1) int arg0) {
		Static32.anInt513 = arg0;
	}
}
