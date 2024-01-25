import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[B")
	public static byte[] aByteArray109;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
	public static final int[] anIntArray611 = new int[2048];

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "Z")
	public static boolean aBoolean920 = false;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V")
	public static void method9021() {
		@Pc(5) int local5 = 0;
		if (Static172.aClass5_Sub50_14.aClass12_Sub4_1.method930() == 1) {
			local5 = 55;
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6299() == 0) {
			local5 |= 0x40;
		}
		Static386.method5709(local5);
		Static568.aClass315_5.method7512(local5);
		Static110.aClass105_1.method2651(local5);
		Static231.aClass19_2.method276(local5);
		Static239.aClass91_1.method2244(local5);
		Static374.method5597(local5);
		Static556.method7716(local5);
		Static541.method7584(local5);
		Static626.method8474(local5);
		Static248.method3851();
	}
}
