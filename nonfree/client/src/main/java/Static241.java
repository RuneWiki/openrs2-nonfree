import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
	public static int anInt4779;

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
	public static int anInt4780;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4331(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static383.anInt7249;
		@Pc(16) int[] local16 = Static404.anIntArray362;
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < local14; local20++) {
			@Pc(28) Class15_Sub3_Sub3_Sub1_Sub1 local28 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local16[local20]];
			if (local28 != null && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 != local28 && local28.aString29 != null && local28.aString29.equalsIgnoreCase(arg0)) {
				local18 = true;
				@Pc(57) Class2_Sub52 local57;
				if (arg1 == 1) {
					local57 = Static311.method5098(Static53.aClass341_13, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5170(0);
					local57.aClass2_Sub8_Sub2_2.method5218(local16[local20]);
					Static38.method791(local57);
				} else if (arg1 == 4) {
					local57 = Static311.method5098(Static22.aClass341_8, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5189(0);
					local57.aClass2_Sub8_Sub2_2.method5218(local16[local20]);
					Static38.method791(local57);
				} else if (arg1 == 5) {
					local57 = Static311.method5098(Static629.aClass341_106, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5218(local16[local20]);
					local57.aClass2_Sub8_Sub2_2.method5189(0);
					Static38.method791(local57);
				} else if (arg1 == 6) {
					local57 = Static311.method5098(Static476.aClass341_84, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5192(local16[local20]);
					local57.aClass2_Sub8_Sub2_2.method5170(0);
					Static38.method791(local57);
				} else if (arg1 == 7) {
					local57 = Static311.method5098(Static90.aClass341_20, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5208(0);
					local57.aClass2_Sub8_Sub2_2.method5205(local16[local20]);
					Static38.method791(local57);
				} else if (arg1 == 9) {
					local57 = Static311.method5098(Static614.aClass341_104, Static125.aClass179_1);
					local57.aClass2_Sub8_Sub2_2.method5218(local16[local20]);
					local57.aClass2_Sub8_Sub2_2.method5225(0);
					Static38.method791(local57);
				}
				break;
			}
		}
		if (!local18) {
			Static439.method7152(Static205.aClass134_21.method3906(Static204.anInt8130) + arg0);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!nfa;Z[[[BIB)Z")
	public static boolean method4334(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static153.aBoolean254) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt11022 >> Static170.anInt3602;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt11024 >> Static170.anInt3602;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class15_Sub3_Sub3) {
			local10 = ((Class15_Sub3_Sub3) arg0).aShort63;
			local17 = ((Class15_Sub3_Sub3) arg0).aShort65;
			local8 = ((Class15_Sub3_Sub3) arg0).aShort62;
			local15 = ((Class15_Sub3_Sub3) arg0).aShort64;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte141 < Static60.anInt1169 && local38 >= Static588.anInt10264 && local38 < Static283.anInt5218 && local41 >= Static166.anInt3589 && local41 < Static84.anInt1472) {
					if ((arg2 == null || arg0.aByte142 < arg3 || arg2[arg0.aByte142][local38][local41] != arg4) && arg0.method9437() && !arg0.method9433(Static64.aClass101_1)) {
						return false;
					}
					if (!arg1 && local38 >= Static440.anInt8000 - 16 && local38 <= Static440.anInt8000 + 16 && local41 >= Static139.anInt2631 - 16 && local41 <= Static139.anInt2631 + 16) {
						if (Static27.aBoolean27) {
							Static647.aClass119Array1[Static454.anInt6411++].method3565(arg0);
							Static454.anInt6411 %= Static294.anInt5364;
						} else {
							arg0.method9438(Static64.aClass101_1);
						}
					}
				}
			}
		}
		return true;
	}
}
