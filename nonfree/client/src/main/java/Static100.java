import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dha", name = "K", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!dha", name = "O", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!ni;B)Lclient!ufa;")
	public static Class4 method2419(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1) {
		@Pc(15) Class4 local15 = (Class4) Static260.aClass94_23.method2960((long) arg0);
		if (local15 == null) {
			if (Static246.aBoolean433) {
				local15 = Static467.aClass5_13.method6121(Static655.method7890(arg1, arg0), true);
			} else {
				local15 = Static476.method7043(arg1.method5942(arg0));
			}
			Static260.aClass94_23.method2963((long) arg0, local15);
		}
		return local15;
	}
}
