import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "[I")
	public static final int[] anIntArray105 = new int[200];

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(BI)V")
	public static void method2402(@OriginalArg(1) int arg0) {
		if (!Static219.method3673(arg0)) {
			return;
		}
		@Pc(18) Class279[] local18 = Static92.aClass279ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class279 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt8145 = 0;
				local26.anInt8135 = 0;
				local26.anInt8179 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	public static void method2404() {
		@Pc(10) Class102 local10 = Static613.aClass102_63;
		synchronized (Static613.aClass102_63) {
			Static613.aClass102_63.method2680();
		}
		local10 = Static83.aClass102_11;
		synchronized (Static83.aClass102_11) {
			Static83.aClass102_11.method2680();
		}
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(BI)V")
	public static void method2405() {
		Static279.aClass102_30.method2668(5);
	}
}
