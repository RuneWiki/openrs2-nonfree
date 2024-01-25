import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public static int anInt7810;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public static int anInt7806 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method6782() {
		@Pc(8) int local8 = Static311.aByteArrayArray14.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (Static311.aByteArrayArray14[local17] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static439.anInt7273; local29++) {
					if (Static310.anIntArray316[local29] == Static75.anIntArray68[local17]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static310.anIntArray316[Static439.anInt7273] = Static75.anIntArray68[local17];
					local27 = Static439.anInt7273++;
				}
				@Pc(84) Class5_Sub36 local84 = new Class5_Sub36(Static311.aByteArrayArray14[local17]);
				@Pc(86) int local86 = 0;
				while (Static311.aByteArrayArray14[local17].length > local84.anInt8456 && local86 < 511 && Static438.anInt7239 < 1023) {
					@Pc(109) int local109 = local86++ << 6 | local27;
					@Pc(113) int local113 = local84.method7333();
					@Pc(117) int local117 = local113 >> 14;
					@Pc(123) int local123 = local113 >> 7 & 0x3F;
					@Pc(127) int local127 = local113 & 0x3F;
					@Pc(140) int local140 = (Static75.anIntArray68[local17] >> 8) * 64 + local123 - Static315.anInt5380;
					@Pc(152) int local152 = local127 + (Static75.anIntArray68[local17] & 0xFF) * 64 - Static290.anInt5128;
					@Pc(159) Class105 local159 = Static378.aClass369_2.method8471(local84.method7333());
					@Pc(166) Class5_Sub9 local166 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local109);
					if (local166 == null && (local159.aByte28 & 0x1) > 0 && local117 == Static8.anInt112 && local140 >= 0 && Static271.anInt4910 > local140 + local159.anInt2811 && local152 >= 0 && local152 + local159.anInt2811 < Static613.anInt9909) {
						@Pc(214) Class4_Sub1_Sub1_Sub2_Sub2 local214 = new Class4_Sub1_Sub1_Sub2_Sub2();
						local214.anInt6843 = local109;
						@Pc(222) Class5_Sub9 local222 = new Class5_Sub9(local214);
						Static677.aClass306_37.method6944(local222, (long) local109, -12002);
						Static591.aClass5_Sub9Array1[Static259.anInt4657++] = local222;
						Static558.anIntArray500[Static438.anInt7239++] = local109;
						local214.anInt6827 = Static565.anInt8921;
						local214.method5947(local159);
						local214.method5931(local214.aClass105_1.anInt2811);
						local214.anInt6855 = local214.aClass105_1.anInt2841 << 3;
						local214.method5936(true, (local214.aClass105_1.aByte32 + 4 & 0xA1C00007) << 11);
						local214.method5946(local140, true, local152, local214.method5932(), local117);
					}
				}
			}
		}
	}
}
