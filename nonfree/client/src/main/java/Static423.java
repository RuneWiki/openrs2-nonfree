import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	public static void method6608() {
		Static352.aClass1_Sub17_Sub2_2.method4510();
		@Pc(13) int local13 = Static352.aClass1_Sub17_Sub2_2.method4517(8);
		@Pc(22) int local22;
		if (local13 < Static141.anInt2822) {
			for (local22 = local13; local22 < Static141.anInt2822; local22++) {
				Static314.anIntArray469[Static363.anInt6549++] = Static220.anIntArray339[local22];
			}
		}
		if (Static141.anInt2822 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static141.anInt2822 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static220.anIntArray339[local22];
			@Pc(68) Class20_Sub1_Sub1_Sub2 local68 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) local60)).aClass20_Sub1_Sub1_Sub2_2;
			@Pc(73) int local73 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
			if (local73 == 0) {
				Static220.anIntArray339[Static141.anInt2822++] = local60;
				local68.anInt8985 = Static445.anInt7791;
			} else {
				@Pc(96) int local96 = Static352.aClass1_Sub17_Sub2_2.method4517(2);
				if (local96 == 0) {
					Static220.anIntArray339[Static141.anInt2822++] = local60;
					local68.anInt8985 = Static445.anInt7791;
					Static392.anIntArray674[Static336.anInt6245++] = local60;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local96 == 1) {
						Static220.anIntArray339[Static141.anInt2822++] = local60;
						local68.anInt8985 = Static445.anInt7791;
						local138 = Static352.aClass1_Sub17_Sub2_2.method4517(3);
						local68.method7824(local138, 1);
						local148 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
						if (local148 == 1) {
							Static392.anIntArray674[Static336.anInt6245++] = local60;
						}
					} else if (local96 == 2) {
						Static220.anIntArray339[Static141.anInt2822++] = local60;
						local68.anInt8985 = Static445.anInt7791;
						if (Static352.aClass1_Sub17_Sub2_2.method4517(1) == 1) {
							local138 = Static352.aClass1_Sub17_Sub2_2.method4517(3);
							local68.method7824(local138, 2);
							local148 = Static352.aClass1_Sub17_Sub2_2.method4517(3);
							local68.method7824(local148, 2);
						} else {
							local138 = Static352.aClass1_Sub17_Sub2_2.method4517(3);
							local68.method7824(local138, 0);
						}
						local138 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
						if (local138 == 1) {
							Static392.anIntArray674[Static336.anInt6245++] = local60;
						}
					} else if (local96 == 3) {
						Static314.anIntArray469[Static363.anInt6549++] = local60;
					}
				}
			}
		}
	}
}
