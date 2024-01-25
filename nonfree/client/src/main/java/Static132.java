import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fca", name = "lc", descriptor = "[I")
	public static final int[] anIntArray294 = new int[6];

	@OriginalMember(owner = "client!fca", name = "uc", descriptor = "I")
	public static int anInt2327 = -1;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZB)V")
	public static void method1972(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static420.aClass6_Sub14_Sub2_2.method6047(Static567.anInt9502) >= 15) {
				@Pc(16) int local16 = Static420.aClass6_Sub14_Sub2_2.method6052(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class6_Sub28 local28 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local16);
					@Pc(34) Class29_Sub2_Sub1_Sub1 local34;
					if (local28 == null) {
						local34 = new Class29_Sub2_Sub1_Sub1();
						local34.anInt8541 = local16;
						local28 = new Class6_Sub28(local34);
						Static31.aClass212_1.method5104((long) local16, local28);
						local21 = true;
						Static354.aClass6_Sub28Array1[Static505.anInt8419++] = local28;
					}
					local34 = local28.aClass29_Sub2_Sub1_Sub1_2;
					Static274.anIntArray385[Static516.anInt8936++] = local16;
					local34.anInt8511 = Static358.anInt6263;
					if (local34.aClass257_1 != null && local34.aClass257_1.method5944()) {
						Static577.method5078(local34);
					}
					local34.method1594(Static51.aClass202_1.method4897(Static420.aClass6_Sub14_Sub2_2.method6052(14)));
					@Pc(98) int local98 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
					@Pc(105) int local105;
					if (arg0) {
						local105 = Static420.aClass6_Sub14_Sub2_2.method6052(8);
						if (local105 > 127) {
							local105 -= 256;
						}
					} else {
						local105 = Static420.aClass6_Sub14_Sub2_2.method6052(5);
						if (local105 > 15) {
							local105 -= 32;
						}
					}
					@Pc(131) int local131;
					if (arg0) {
						local131 = Static420.aClass6_Sub14_Sub2_2.method6052(8);
						if (local131 > 127) {
							local131 -= 256;
						}
					} else {
						local131 = Static420.aClass6_Sub14_Sub2_2.method6052(5);
						if (local131 > 15) {
							local131 -= 32;
						}
					}
					@Pc(153) int local153 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
					if (local153 == 1) {
						Static519.anIntArray669[Static353.anInt6225++] = local16;
					}
					@Pc(169) int local169 = Static420.aClass6_Sub14_Sub2_2.method6052(2);
					@Pc(180) int local180 = Static420.aClass6_Sub14_Sub2_2.method6052(3) + 4 << 11 & 0x3C8F;
					local34.method7005(local34.aClass257_1.anInt7167);
					local34.anInt8549 = local34.aClass257_1.anInt7166 << 3;
					if (local21) {
						local34.method7007(local180, true);
					}
					local34.method1586(local169, Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] + local105, Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] - -local131, local98 == 1, local34.method7008());
					if (local34.aClass257_1.method5944()) {
						Static176.method2703(null, local34.aByte103, local34, local34.anIntArray661[0], null, 0, local34.anIntArray660[0]);
					}
					continue;
				}
			}
			Static420.aClass6_Sub14_Sub2_2.method6051();
			return;
		}
	}
}
