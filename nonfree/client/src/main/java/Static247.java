import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "[I")
	public static final int[] anIntArray318 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)V")
	public static void method4479(@OriginalArg(0) int arg0) {
		Static535.anInt9213 = arg0;
		@Pc(15) Class236 local15 = Static505.aClass236_85;
		synchronized (Static505.aClass236_85) {
			Static505.aClass236_85.method6253();
		}
	}
}
