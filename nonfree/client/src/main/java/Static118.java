import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "Lclient!mo;")
	public static Class143 aClass143_58;

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
	public static int anInt2594 = -1;

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "[I")
	public static int[] anIntArray230 = new int[2];

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
	public static void method2477() {
		Static164.anInt3458 = 0;
		Static222.anInt4457 = 0;
		Static252.method4377();
		Static244.method4281();
		Static305.method5312();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static164.anInt3458; local17++) {
			local23 = Static4.anIntArray6[local17];
			if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local23].anInt5927 != Static153.anInt3257) {
				if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local23].aClass192_1.method5286()) {
					Static261.method3791(Static266.aClass10_Sub3_Sub3_Sub1Array1[local23]);
				}
				Static266.aClass10_Sub3_Sub3_Sub1Array1[local23].method4957(null);
				Static266.aClass10_Sub3_Sub3_Sub1Array1[local23] = null;
			}
		}
		if (Static327.anInt6307 != Static30.aClass14_Sub4_Sub2_1.anInt2637) {
			throw new RuntimeException("gnp1 pos:" + Static30.aClass14_Sub4_Sub2_1.anInt2637 + " psize:" + Static327.anInt6307);
		}
		for (local23 = 0; local23 < Static315.anInt6456; local23++) {
			if (Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static315.anInt6456);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method2480(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
