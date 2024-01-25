import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public static int anInt7764;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt7766;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt7763 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BZ)V")
	public static void method6884(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static352.aClass1_Sub17_Sub2_2.method4515(Static494.anInt8660) >= 15) {
				@Pc(21) int local21 = Static352.aClass1_Sub17_Sub2_2.method4517(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					@Pc(35) Class1_Sub41 local35 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local21);
					@Pc(41) Class20_Sub1_Sub1_Sub2 local41;
					if (local35 == null) {
						local41 = new Class20_Sub1_Sub1_Sub2();
						local41.anInt8969 = local21;
						local35 = new Class1_Sub41(local41);
						Static362.aClass230_46.method6139((long) local21, local35);
						Static35.aClass1_Sub41Array1[Static342.anInt6322++] = local35;
						local28 = true;
					}
					local41 = local35.aClass20_Sub1_Sub1_Sub2_2;
					Static220.anIntArray339[Static141.anInt2822++] = local21;
					local41.anInt8985 = Static445.anInt7791;
					if (local41.aClass283_1 != null && local41.aClass283_1.method7376()) {
						Static231.method4171(local41);
					}
					@Pc(95) int local95 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
					if (local95 == 1) {
						Static392.anIntArray674[Static336.anInt6245++] = local21;
					}
					@Pc(119) int local119 = (Static352.aClass1_Sub17_Sub2_2.method4517(3) + 4 & 0x14600007) << 11;
					@Pc(126) int local126;
					if (arg0) {
						local126 = Static352.aClass1_Sub17_Sub2_2.method4517(8);
						if (local126 > 127) {
							local126 -= 256;
						}
					} else {
						local126 = Static352.aClass1_Sub17_Sub2_2.method4517(5);
						if (local126 > 15) {
							local126 -= 32;
						}
					}
					@Pc(150) int local150;
					if (arg0) {
						local150 = Static352.aClass1_Sub17_Sub2_2.method4517(8);
						if (local150 > 127) {
							local150 -= 256;
						}
					} else {
						local150 = Static352.aClass1_Sub17_Sub2_2.method4517(5);
						if (local150 > 15) {
							local150 -= 32;
						}
					}
					@Pc(174) int local174 = Static352.aClass1_Sub17_Sub2_2.method4517(2);
					@Pc(179) int local179 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
					local41.method7826(Static358.aClass95_1.method2362(Static352.aClass1_Sub17_Sub2_2.method4517(14)));
					local41.method7810(local41.aClass283_1.anInt8439);
					local41.anInt9018 = local41.aClass283_1.anInt8419 << 3;
					if (local28) {
						local41.method7821(true, local119);
					}
					local41.method7830(local179 == 1, local41.method7808(), Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] + local126, local174, Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] + local150);
					if (local41.aClass283_1.method7376()) {
						Static509.method7776(local41.anIntArray780[0], local41, null, null, local41.anIntArray781[0], 0, local41.aByte108);
					}
					continue;
				}
			}
			Static352.aClass1_Sub17_Sub2_2.method4518();
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method6886() {
		if (Static283.aClass139_2 != Static190.aClass139_1) {
			try {
				Static558.method7782("tbrefresh", Static125.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
