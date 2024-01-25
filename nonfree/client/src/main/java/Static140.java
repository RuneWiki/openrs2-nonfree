import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method2008() {
		Static320.aClass126ArrayArray2 = new Class126[Static247.aClass166_209.method3695()][];
		Static70.aClass126ArrayArray4 = new Class126[Static247.aClass166_209.method3695()][];
		Static389.aBooleanArray25 = new boolean[Static247.aClass166_209.method3695()];
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI[S)[S")
	public static short[] method2009(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static457.method1219(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
