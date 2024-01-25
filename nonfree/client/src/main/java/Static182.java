import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method3119(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local8 = (local8 << 5) + (long) arg0.charAt(local15) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V")
	public static void method3120(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		if (Static407.anInt6909 == 2) {
			Static47.anInt1279 = 0;
			Static400.anInt7896 = local11;
			Static502.anInt9930 = local15;
		}
		Static225.aFloat85 = (float) local11;
		Static464.aFloat130 = (float) local15;
		Static209.method3510();
		Static583.aBoolean679 = true;
	}
}
