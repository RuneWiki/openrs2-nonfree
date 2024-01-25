import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static584 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	public static int[] anIntArray712;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public static int anInt9650;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!db;")
	public static final Class64 aClass64_484 = new Class64(2, 3);

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "[J")
	public static final long[] aLongArray17 = new long[100];

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public static int anInt9652 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!oa;I)V")
	public static void method7912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2) {
		Static249.aClass66_9 = arg2;
		Static522.aClass285ArrayArray1 = new Class285[arg0][arg1];
		if (Static4.anIntArray7 != null) {
			Static289.aClass75_2 = Static125.method2680(Static4.anIntArray7[5], Static4.anIntArray7[4], Static4.anIntArray7[1], Static4.anIntArray7[3], Static4.anIntArray7[2], Static4.anIntArray7[0]);
		}
		Static185.aClass285_5 = new Class285();
		Static577.method7857();
	}
}
