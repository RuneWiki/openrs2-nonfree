import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt6075 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5247(@OriginalArg(0) Class82 arg0) {
		for (@Pc(10) Class9_Sub8 local10 = (Class9_Sub8) Static76.aClass139_2.method3198(); local10 != null; local10 = (Class9_Sub8) Static76.aClass139_2.method3205()) {
			if (local10.aBoolean494) {
				local10.method5948(arg0);
			}
		}
	}
}
