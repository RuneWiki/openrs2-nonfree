import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "Lclient!rf;")
	public static Class198 aClass198_1;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_193 = new Class131(8, -1);

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_105 = new Class84(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public static int anInt7703 = -1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void method6007() {
		if (Static144.aFloat36 < 1024.0F) {
			Static144.aFloat36 = 1024.0F;
		}
		if (Static144.aFloat36 > 3072.0F) {
			Static144.aFloat36 = 3072.0F;
		}
		while (Static274.aFloat78 >= 16384.0F) {
			Static274.aFloat78 -= 16384.0F;
		}
		while (Static274.aFloat78 < 0.0F) {
			Static274.aFloat78 += 16384.0F;
		}
		@Pc(41) int local41 = Static220.anInt3977 >> 7;
		@Pc(45) int local45 = Static202.anInt3669 >> 7;
		@Pc(56) int local56 = Static289.method4078(Static220.anInt3977, Static202.anInt3669, Static152.anInt2600);
		@Pc(58) int local58 = 0;
		@Pc(84) int local84;
		if (local41 > 3 && local45 > 3 && Static135.anInt2314 - 4 > local41 && local45 < Static352.anInt6022 - 4) {
			for (local84 = local41 - 4; local84 <= local41 + 4; local84++) {
				for (@Pc(90) int local90 = local45 - 4; local90 <= local45 + 4; local90++) {
					@Pc(94) int local94 = Static152.anInt2600;
					if (local94 < 3 && Static340.method4799(local90, local84)) {
						local94++;
					}
					@Pc(107) int local107 = 0;
					if (Static59.aClass155_Sub1_2.aByteArrayArrayArray10 != null && Static59.aClass155_Sub1_2.aByteArrayArrayArray10[local94] != null) {
						local107 = (Static59.aClass155_Sub1_2.aByteArrayArrayArray10[local94][local84][local90] & 0xFF) * 8;
					}
					@Pc(140) int local140 = local56 + local107 - Static92.aClass136Array1[local94].I(local84, local90);
					if (local58 < local140) {
						local58 = local140;
					}
				}
			}
		}
		local84 = (local58 >> 0) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (local84 > Static275.anInt221) {
			Static275.anInt221 += (local84 - Static275.anInt221) / 24;
		} else if (Static275.anInt221 > local84) {
			Static275.anInt221 += (local84 - Static275.anInt221) / 80;
			return;
		}
	}
}
