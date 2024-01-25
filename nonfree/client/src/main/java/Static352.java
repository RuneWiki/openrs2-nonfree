import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt6483 = -1;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
	public static final int[] anIntArray551 = new int[14];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!mg;B)V")
	public static void method5594(@OriginalArg(0) Class7_Sub5 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass7_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass7_Sub6Array1[local14].aBoolean409 = false;
		}
		@Pc(28) Class199[] local28 = Class250.aClass199Array1;
		synchronized (Class250.aClass199Array1) {
			if (Class250.aClass199Array1.length > local12 && Static75.anIntArray125[local12] < 200) {
				Class250.aClass199Array1[local12].method4898(arg0);
				@Pc(63) int local63 = Static75.anIntArray125[local12]++;
			}
		}
	}
}
