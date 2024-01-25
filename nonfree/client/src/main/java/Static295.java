import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public static int anInt5963;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	public static int anInt5964 = 100;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "[I")
	public static final int[] anIntArray490 = new int[14];

	@OriginalMember(owner = "client!so", name = "s", descriptor = "J")
	public static long aLong222 = 0L;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method5019(@OriginalArg(1) Class17_Sub2 arg0) {
		arg0.aClass2_1 = null;
		@Pc(12) int local12 = arg0.aClass17_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass17_Sub6Array1[local14].aBoolean424 = false;
		}
		@Pc(28) Class204[] local28 = Class63.aClass204Array6;
		synchronized (Class63.aClass204Array6) {
			if (local12 < Class63.aClass204Array6.length && Static162.anIntArray314[local12] < 200) {
				Class63.aClass204Array6[local12].method5365(arg0);
				@Pc(57) int local57 = Static162.anIntArray314[local12]++;
			}
		}
	}
}
