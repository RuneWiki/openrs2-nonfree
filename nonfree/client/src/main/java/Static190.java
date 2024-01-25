import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public static int anInt4029;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Z")
	public static boolean aBoolean258 = true;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)B")
	public static byte method3485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	public static void method3489() {
		@Pc(8) int local8 = Static69.aByteArrayArray3.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static69.aByteArrayArray3[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static135.anInt2376; local25++) {
					if (Static273.anIntArray447[local25] == Static35.anIntArray45[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static273.anIntArray447[Static135.anInt2376] = Static35.anIntArray45[local15];
					local23 = Static135.anInt2376++;
				}
				@Pc(73) Class6_Sub14 local73 = new Class6_Sub14(Static69.aByteArrayArray3[local15]);
				@Pc(75) int local75 = 0;
				while (local73.anInt7244 < Static69.aByteArrayArray3[local15].length && local75 < 511 && Static516.anInt8936 < 1023) {
					@Pc(92) int local92 = local23 | local75++ << 6;
					@Pc(96) int local96 = local73.method6006();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = local106 + (Static35.anIntArray45[local15] >> 8) * 64 - Static218.anInt3718;
					@Pc(136) int local136 = (Static35.anIntArray45[local15] & 0xFF) * 64 + local110 - Static167.anInt3048;
					@Pc(143) Class257 local143 = Static51.aClass202_1.method4897(local73.method6006());
					@Pc(150) Class6_Sub28 local150 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local92);
					if (local150 == null && (local143.aByte69 & 0x1) > 0 && Static356.anInt6242 == local100 && local123 >= 0 && Static301.anInt4912 > local123 + local143.anInt7167 && local136 >= 0 && local143.anInt7167 + local136 < Static473.anInt7969) {
						@Pc(197) Class29_Sub2_Sub1_Sub1 local197 = new Class29_Sub2_Sub1_Sub1();
						local197.anInt8541 = local92;
						@Pc(205) Class6_Sub28 local205 = new Class6_Sub28(local197);
						Static31.aClass212_1.method5104((long) local92, local205);
						Static354.aClass6_Sub28Array1[Static505.anInt8419++] = local205;
						Static274.anIntArray385[Static516.anInt8936++] = local92;
						local197.anInt8511 = Static358.anInt6263;
						local197.method1594(local143);
						local197.method7005(local197.aClass257_1.anInt7167);
						local197.anInt8549 = local197.aClass257_1.anInt7166 << 3;
						local197.method7007((local197.aClass257_1.lb + 4 & 0x25800007) << 11, true);
						local197.method1586(local100, local136, local123, true, local197.method7008());
					}
				}
			}
		}
	}
}
