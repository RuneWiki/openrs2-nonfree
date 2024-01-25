import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!ufa;")
	public static Class328 aClass328_10;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[I")
	public static final int[] anIntArray465 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public static void method6147(@OriginalArg(1) int arg0) {
		Static73.anInt7677 = arg0;
		@Pc(7) Class342 local7 = Static424.aClass342_187;
		synchronized (Static424.aClass342_187) {
			Static424.aClass342_187.method7693();
		}
		local7 = Static254.aClass342_96;
		synchronized (Static254.aClass342_96) {
			Static254.aClass342_96.method7693();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
	public static void method6148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static85.anInt2285 == 1) {
			Static574.method7742(Static474.aClass3_Sub13_3, arg1, arg0);
		} else if (Static85.anInt2285 == 2) {
			Static483.method6564(arg0, arg1);
		}
		Static85.anInt2285 = 0;
		Static474.aClass3_Sub13_3 = null;
	}
}
