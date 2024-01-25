import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "[I")
	public static final int[] anIntArray62 = new int[3];

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
	public static int anInt983 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public static void method1022() {
		Static522.anInt8991++;
		Static185.anInt3047 = 0;
		Static24.anInt329 = 0;
		Static11.method234();
		Static438.method6531();
		Static582.method8307();
		@Pc(21) boolean local21 = false;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < Static24.anInt329; local23++) {
			local31 = Static575.anIntArray496[local23];
			@Pc(38) Class14_Sub44 local38 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local31);
			@Pc(41) Class4_Sub3_Sub3_Sub3_Sub1 local41 = local38.aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local41.anInt3285 != Static522.anInt8991) {
				if (Static455.aBoolean533 && Static157.method2249(local31)) {
					Static465.method6860();
				}
				if (local41.aClass362_1.method8644()) {
					Static55.method995(local41);
				}
				local41.method2572((Class362) null);
				local38.method9513();
				local21 = true;
			}
		}
		if (local21) {
			Static549.anInt1216 = Static100.aClass125_9.method2624();
			Static100.aClass125_9.method2629(Static28.aClass14_Sub44Array2);
		}
		if (Static277.aClass347_2.aClass14_Sub21_Sub2_1.anInt8936 != Static277.aClass347_2.anInt9628) {
			throw new RuntimeException("gnp1 pos:" + Static277.aClass347_2.aClass14_Sub21_Sub2_1.anInt8936 + " psize:" + Static277.aClass347_2.anInt9628);
		}
		for (local31 = 0; local31 < Static662.anInt10795; local31++) {
			if (Static100.aClass125_9.method2630((long) Static253.anIntArray241[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static662.anInt10795);
			}
		}
		if (Static549.anInt1216 - Static662.anInt10795 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static549.anInt1216 - Static662.anInt10795));
		}
		for (@Pc(207) int local207 = 0; local207 < Static549.anInt1216; local207++) {
			if (Static522.anInt8991 != Static28.aClass14_Sub44Array2[local207].aClass4_Sub3_Sub3_Sub3_Sub1_2.anInt3285) {
				throw new RuntimeException("gnp4 uk:" + Static28.aClass14_Sub44Array2[local207].aClass4_Sub3_Sub3_Sub3_Sub1_2.anInt3238);
			}
		}
	}
}
