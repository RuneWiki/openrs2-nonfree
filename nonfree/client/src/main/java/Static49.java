import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public static int anInt5921;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!vh;")
	public static Class250 aClass250_67;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method4791() {
		@Pc(14) boolean local14 = Static173.aClass1_Sub1_Sub1_1.method4129() == 1;
		@Pc(18) int local18 = Static173.aClass1_Sub1_Sub1_1.method4129();
		@Pc(22) int local22 = Static173.aClass1_Sub1_Sub1_1.method4095();
		@Pc(26) int local26 = Static173.aClass1_Sub1_Sub1_1.method4093();
		Static12.anInt325 = Static173.aClass1_Sub1_Sub1_1.method4129();
		Static156.method2356(local18);
		Static173.aClass1_Sub1_Sub1_1.method144();
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(53) int local53;
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < Static135.anInt2314 >> 3; local42++) {
				for (local46 = 0; local46 < Static352.anInt6022 >> 3; local46++) {
					local53 = Static173.aClass1_Sub1_Sub1_1.method146(1);
					if (local53 == 1) {
						Static257.anIntArrayArrayArray13[local38][local42][local46] = Static173.aClass1_Sub1_Sub1_1.method146(26);
					} else {
						Static257.anIntArrayArrayArray13[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static173.aClass1_Sub1_Sub1_1.method148();
		local42 = (Static283.anInt4985 - Static173.aClass1_Sub1_Sub1_1.anInt5056) / 16;
		Static303.anIntArrayArray151 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static303.anIntArrayArray151[local46][local53] = Static173.aClass1_Sub1_Sub1_1.method4087();
			}
		}
		Static442.anIntArray407 = new int[local42];
		Static337.anIntArray642 = new int[local42];
		Static86.anIntArray149 = new int[local42];
		Static209.aByteArrayArray149 = new byte[local42][];
		Static14.aByteArrayArray9 = new byte[local42][];
		Static231.anIntArray336 = new int[local42];
		Static25.aByteArrayArray15 = null;
		Static68.aByteArrayArray29 = new byte[local42][];
		Static208.anIntArray319 = null;
		Static157.anIntArray255 = new int[local42];
		Static264.aByteArrayArray90 = new byte[local42][];
		local42 = 0;
		for (local53 = 0; local53 < 4; local53++) {
			for (@Pc(184) int local184 = 0; local184 < Static135.anInt2314 >> 3; local184++) {
				for (@Pc(188) int local188 = 0; local188 < Static352.anInt6022 >> 3; local188++) {
					@Pc(198) int local198 = Static257.anIntArrayArrayArray13[local53][local184][local188];
					if (local198 != -1) {
						@Pc(208) int local208 = local198 >> 14 & 0x3FF;
						@Pc(214) int local214 = local198 >> 3 & 0x7FF;
						@Pc(224) int local224 = local214 / 8 + (local208 / 8 << 8);
						for (@Pc(226) int local226 = 0; local226 < local42; local226++) {
							if (local224 == Static157.anIntArray255[local226]) {
								local224 = -1;
								break;
							}
						}
						if (local224 != -1) {
							Static157.anIntArray255[local42] = local224;
							@Pc(254) int local254 = local224 >> 8 & 0xFF;
							@Pc(258) int local258 = local224 & 0xFF;
							Static86.anIntArray149[local42] = Static88.aClass250_19.method5652("m" + local254 + "_" + local258);
							Static337.anIntArray642[local42] = Static88.aClass250_19.method5652("l" + local254 + "_" + local258);
							Static231.anIntArray336[local42] = Static88.aClass250_19.method5652("um" + local254 + "_" + local258);
							Static442.anIntArray407[local42] = Static88.aClass250_19.method5652("ul" + local254 + "_" + local258);
							local42++;
						}
					}
				}
			}
		}
		Static149.method2261(false, local14, local22, local26);
	}
}
