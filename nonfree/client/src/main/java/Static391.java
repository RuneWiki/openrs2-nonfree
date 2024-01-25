import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public static void method1869() {
		@Pc(8) int local8 = Static27.aByteArrayArray5.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static27.aByteArrayArray5[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static74.anInt145; local25++) {
					if (Static243.anIntArray373[local25] == Static175.anIntArray282[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static243.anIntArray373[Static74.anInt145] = Static175.anIntArray282[local15];
					local23 = Static74.anInt145++;
				}
				@Pc(69) Class6_Sub15 local69 = new Class6_Sub15(Static27.aByteArrayArray5[local15]);
				@Pc(71) int local71 = 0;
				while (Static27.aByteArrayArray5[local15].length > local69.anInt3487 && local71 < 511 && Static147.anInt7038 < 1023) {
					@Pc(90) int local90 = local71++ << 6 | local23;
					@Pc(94) int local94 = local69.method3108();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = local104 + (Static175.anIntArray282[local15] >> 8) * 64 - Static206.anInt3592;
					@Pc(134) int local134 = (Static175.anIntArray282[local15] & 0xFF) * 64 + local108 - Static99.anInt1814;
					@Pc(143) Class17 local143 = Static336.aClass59_2.method1468(local69.method3108());
					if (Static450.aClass3_Sub3_Sub6_Sub2Array1[local90] == null && (local143.aByte6 & 0x1) > 0 && Static3.anInt6323 == local98 && local121 >= 0 && Static84.anInt1632 > local121 + local143.anInt344 && local134 >= 0 && local134 + local143.anInt344 < Static261.anInt4480) {
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local90] = new Class3_Sub3_Sub6_Sub2();
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local90].anInt6731 = local90;
						@Pc(201) Class3_Sub3_Sub6_Sub2 local201 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local90];
						Static345.anIntArray507[Static147.anInt7038++] = local90;
						local201.anInt6745 = Static125.anInt2225;
						local201.method5529(local143);
						local201.method5513(local201.aClass17_1.anInt344);
						local201.anInt6679 = local201.aClass17_1.anInt351 << 3;
						if (local201.anInt6679 == 0) {
							local201.method5522(0);
						} else {
							local201.method5522(local201.aClass17_1.aByte7 + 4 << 11 & 0x3F5B);
						}
						local201.method5525(local98, local134, local201.method5512(), local121, true);
					}
				}
			}
		}
	}
}
