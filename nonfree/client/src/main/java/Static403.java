import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIZILclient!gga;II)V")
	public static void method6617(@OriginalArg(1) int arg0, @OriginalArg(4) Class124 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static494.method7792(arg0, arg2, arg1);
			return;
		}
		Static632.anInt10931 = 0;
		Static131.anInt2515 = arg2;
		Static311.anInt5615 = 1;
		Static264.anInt5034 = arg0;
		Static138.aBoolean196 = false;
		Static337.aClass124_71 = arg1;
		Static151.aClass2_Sub26_Sub3_5 = null;
		Static530.anInt9738 = Static300.aClass2_Sub26_Sub3_8.method6976() / arg3;
		if (Static530.anInt9738 < 1) {
			Static530.anInt9738 = 1;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V")
	public static void method6620() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static561.aBooleanArray58[local7] = true;
		}
	}
}
