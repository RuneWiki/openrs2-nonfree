import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_76 = new Class267("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public static void method4638() {
		@Pc(9) int[] local9 = new int[Static380.aClass231_2.anInt6780];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static380.aClass231_2.anInt6780; local17++) {
			@Pc(24) Class4 local24 = Static380.aClass231_2.method5648(local17);
			if (local24.anInt100 >= 0 || local24.anInt70 >= 0) {
				local9[local15++] = local17;
			}
		}
		Static46.anIntArray78 = new int[local15];
		for (@Pc(51) int local51 = 0; local51 < local15; local51++) {
			Static46.anIntArray78[local51] = local9[local51];
		}
	}
}
