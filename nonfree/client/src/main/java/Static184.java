import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt4228 = 0;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_61 = new Class45(29, 6);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	public static void method3615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static332.method5312(Static294.aClass77_56);
		Static383.aClass12_Sub8_Sub2_1.method5215(arg1);
		Static383.aClass12_Sub8_Sub2_1.method5223(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method3617() {
		if (Static49.aFloat10 < 1024.0F) {
			Static49.aFloat10 = 1024.0F;
		}
		if (Static49.aFloat10 > 3072.0F) {
			Static49.aFloat10 = 3072.0F;
		}
		while (Static500.aFloat186 >= 16384.0F) {
			Static500.aFloat186 -= 16384.0F;
		}
		while (Static500.aFloat186 < 0.0F) {
			Static500.aFloat186 += 16384.0F;
		}
		@Pc(41) int local41 = Static401.anInt7550 >> 7;
		@Pc(45) int local45 = Static112.anInt2594 >> 7;
		@Pc(53) int local53 = Static443.method6717(Static401.anInt7550, Static112.anInt2594, Static56.anInt1418);
		@Pc(62) int local62 = 0;
		@Pc(88) int local88;
		if (local41 > 3 && local45 > 3 && Static37.anInt7512 - 4 > local41 && local45 < Static329.anInt6247 - 4) {
			for (local88 = local41 - 4; local88 <= local41 + 4; local88++) {
				for (@Pc(94) int local94 = local45 - 4; local94 <= local45 + 4; local94++) {
					@Pc(98) int local98 = Static56.anInt1418;
					if (local98 < 3 && Static112.method2322(local94, local88)) {
						local98++;
					}
					@Pc(111) int local111 = 0;
					if (Static113.aClass119_Sub1_1.aByteArrayArrayArray15 != null && Static113.aClass119_Sub1_1.aByteArrayArrayArray15[local98] != null) {
						local111 = (Static113.aClass119_Sub1_1.aByteArrayArrayArray15[local98][local88][local94] & 0xFF) * 8;
					}
					@Pc(144) int local144 = local53 + local111 - Static51.aClass215Array6[local98].ba(local88, local94);
					if (local144 > local62) {
						local62 = local144;
					}
				}
			}
		}
		local88 = (local62 >> 0) * 1536;
		if (local88 > 786432) {
			local88 = 786432;
		}
		if (local88 < 262144) {
			local88 = 262144;
		}
		if (local88 > Static32.anInt534) {
			Static32.anInt534 += (local88 - Static32.anInt534) / 24;
		} else if (Static32.anInt534 > local88) {
			Static32.anInt534 += (local88 - Static32.anInt534) / 80;
		}
	}
}
