import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray32;

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
	public static int anInt1171 = -1;

	@OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
	public static int anInt1172 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILclient!fp;)V")
	public static void method1098(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		Static161.method3062(arg1);
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 > 1) {
			for (local12 = 0; local12 < Static311.anInt5653; local12++) {
				for (local16 = 0; local16 < Static189.anInt3820; local16++) {
					if ((Static264.aByteArrayArrayArray7[1][local12][local16] & 0x2) == 2) {
						Static268.method4839(local12, local16);
					}
				}
			}
		}
		for (local12 = 0; local12 < arg0; local12++) {
			for (local16 = 0; local16 <= Static189.anInt3820; local16++) {
				for (@Pc(61) int local61 = 0; local61 <= Static311.anInt5653; local61++) {
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(119) int local119;
					@Pc(123) int local123;
					@Pc(212) int local212;
					@Pc(220) int local220;
					@Pc(240) int local240;
					@Pc(244) int local244;
					if ((Static312.aByteArrayArrayArray9[local12][local61][local16] & 0x1) != 0) {
						local75 = local16;
						local77 = local16;
						local79 = local12;
						while (local75 > 0 && (Static312.aByteArrayArrayArray9[local12][local61][local75 - 1] & 0x1) != 0) {
							local75--;
						}
						while (Static189.anInt3820 > local77 && (Static312.aByteArrayArrayArray9[local12][local61][local77 + 1] & 0x1) != 0) {
							local77++;
						}
						local119 = local12;
						label164: while (local79 > 0) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((Static312.aByteArrayArrayArray9[local79 - 1][local61][local123] & 0x1) == 0) {
									break label164;
								}
							}
							local79--;
						}
						label153: while (local119 < 3) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((Static312.aByteArrayArrayArray9[local119 + 1][local61][local123] & 0x1) == 0) {
									break label153;
								}
							}
							local119++;
						}
						local123 = (local77 + 1 - local75) * (local119 + 1 - local79);
						if (local123 >= 2) {
							local212 = Static102.anIntArrayArrayArray134[local119][local61][local75] - 240;
							local220 = Static102.anIntArrayArrayArray134[local79][local61][local75];
							Static255.method4771(1, local61 * 128, local61 * 128, local75 * 128, local77 * 128 + 128, local212, local220);
							for (local240 = local79; local240 <= local119; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static312.aByteArrayArrayArray9[local240][local61][local244] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static312.aByteArrayArrayArray9[local12][local61][local16] & 0x2) != 0) {
						local75 = local61;
						local77 = local61;
						local79 = local12;
						local119 = local12;
						while (local75 > 0 && (Static312.aByteArrayArrayArray9[local12][local75 - 1][local16] & 0x2) != 0) {
							local75--;
						}
						while (Static311.anInt5653 > local77 && (Static312.aByteArrayArrayArray9[local12][local77 + 1][local16] & 0x2) != 0) {
							local77++;
						}
						label218: while (local79 > 0) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((Static312.aByteArrayArrayArray9[local79 - 1][local123][local16] & 0x2) == 0) {
									break label218;
								}
							}
							local79--;
						}
						label207: while (local119 < 3) {
							for (local123 = local75; local123 <= local77; local123++) {
								if ((Static312.aByteArrayArrayArray9[local119 + 1][local123][local16] & 0x2) == 0) {
									break label207;
								}
							}
							local119++;
						}
						local123 = (local119 + 1 - local79) * (local77 - (local75 - 1));
						if (local123 >= 2) {
							local212 = Static102.anIntArrayArrayArray134[local119][local75][local16] - 240;
							local220 = Static102.anIntArrayArrayArray134[local79][local75][local16];
							Static255.method4771(2, local75 * 128, local77 * 128 + 128, local16 * 128, local16 * 128, local212, local220);
							for (local240 = local79; local240 <= local119; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static312.aByteArrayArrayArray9[local240][local244][local16] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static312.aByteArrayArrayArray9[local12][local61][local16] & 0x4) != 0) {
						local75 = local61;
						local77 = local61;
						local79 = local16;
						local119 = local16;
						while (local79 > 0 && (Static312.aByteArrayArrayArray9[local12][local61][local79 - 1] & 0x4) != 0) {
							local79--;
						}
						while (local119 < Static189.anInt3820 && (Static312.aByteArrayArrayArray9[local12][local61][local119 + 1] & 0x4) != 0) {
							local119++;
						}
						label271: while (local75 > 0) {
							for (local123 = local79; local123 <= local119; local123++) {
								if ((Static312.aByteArrayArrayArray9[local12][local75 - 1][local123] & 0x4) == 0) {
									break label271;
								}
							}
							local75--;
						}
						label260: while (local77 < Static311.anInt5653) {
							for (local123 = local79; local123 <= local119; local123++) {
								if ((Static312.aByteArrayArrayArray9[local12][local77 + 1][local123] & 0x4) == 0) {
									break label260;
								}
							}
							local77++;
						}
						if ((local77 + 1 - local75) * (local119 + 1 - local79) >= 4) {
							local123 = Static102.anIntArrayArrayArray134[local12][local75][local79];
							Static255.method4771(4, local75 * 128, local77 * 128 + 128, local79 * 128, local119 * 128 + 128, local123, local123);
							for (@Pc(660) int local660 = local75; local660 <= local77; local660++) {
								for (local212 = local79; local212 <= local119; local212++) {
									Static312.aByteArrayArrayArray9[local12][local660][local212] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
