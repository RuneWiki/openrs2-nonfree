import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
	public static int anInt8613;

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "Lclient!vo;")
	public static Class348 aClass348_104;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
	public static int anInt8614 = -1;

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "[Lclient!hw;")
	public static final Class21_Sub1_Sub1_Sub1_Sub2[] aClass21_Sub1_Sub1_Sub1_Sub2Array1 = new Class21_Sub1_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
	public static boolean method6645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!r;)V")
	public static void method6646(@OriginalArg(1) Class7 arg0) {
		if (Static384.anInt7556 < 2 && !Static430.aBoolean586 || Static292.aClass155_7 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static430.aBoolean586 && Static384.anInt7556 < 2) {
			local39 = Static317.aString131 + Static223.aClass152_36.method3624(Static142.anInt3088) + Static393.aString154 + " ->";
		} else if (Static405.aBoolean565 && Static38.aClass174_1.method4090(81) && Static384.anInt7556 > 2) {
			local39 = Static576.method8116((Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285.aClass4_285);
		} else {
			@Pc(35) Class4_Sub36 local35 = (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285;
			local39 = Static576.method8116(local35);
			@Pc(41) int[] local41 = null;
			if (Static221.method956(local35.anInt7137)) {
				local41 = Static338.aClass29_1.method977((int) local35.aLong194).anIntArray384;
			} else if (local35.anInt7142 != -1) {
				local41 = Static338.aClass29_1.method977(local35.anInt7142).anIntArray384;
			} else if (Static208.method3402(local35.anInt7137)) {
				@Pc(119) Class4_Sub29 local119 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local35.aLong194);
				if (local119 != null) {
					@Pc(124) Class21_Sub1_Sub1_Sub1_Sub1 local124 = local119.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(127) Class51 local127 = local124.aClass51_1;
					if (local127.anIntArray61 != null) {
						local127 = local127.method1371(Static523.aClass173_1);
					}
					if (local127 != null) {
						local41 = local127.anIntArray63;
					}
				}
			} else if (Static324.method5022(local35.anInt7137)) {
				@Pc(84) Class233 local84;
				if (local35.anInt7137 == 1008) {
					local84 = Static103.aClass298_1.method6822((int) local35.aLong194);
				} else {
					local84 = Static103.aClass298_1.method6822((int) (local35.aLong194 >>> 32 & 0x7FFFFFFFL));
				}
				if (local84.anIntArray374 != null) {
					local84 = local84.method5295(Static523.aClass173_1);
				}
				if (local84 != null) {
					local41 = local84.anIntArray376;
				}
			}
			if (local41 != null) {
				local39 = local39 + Static282.method4486(local41);
			}
		}
		if (Static384.anInt7556 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static384.anInt7556 - 2) + Static223.aClass152_29.method3624(Static142.anInt3088);
		}
		if (Static220.aClass155_16 != null) {
			@Pc(263) Class45 local263 = Static220.aClass155_16.method3698(arg0);
			if (local263 == null) {
				local263 = Static306.aClass45_4;
			}
			local263.method4845(Static44.anIntArray33, Static220.aClass155_16.anInt4818, Static455.anIntArray504, Static172.anInt3620, Static220.aClass155_16.anInt4777, Static220.aClass155_16.anInt4806, Static220.aClass155_16.anInt4794, local39, Static58.anInt1554, Static387.aRandom1, Static393.aClass88Array9, Static392.anInt3639, Static220.aClass155_16.anInt4831, Static220.aClass155_16.anInt4823);
			Static430.method6395(Static455.anIntArray504[0], Static455.anIntArray504[2], Static455.anIntArray504[1], Static455.anIntArray504[3]);
		} else if (Static397.aClass155_11 != null && Static592.aClass128_4 == Static162.aClass128_1) {
			@Pc(243) int local243 = Static306.aClass45_4.method4839(Static393.aClass88Array9, Static313.anInt6278 + 16, Static387.aRandom1, Static44.anIntArray33, Static332.anInt6460 + 4, local39, Static172.anInt3620);
			Static430.method6395(Static332.anInt6460 + 4, Static503.aClass198_12.method4769(local39) - -local243, Static313.anInt6278, 16);
			return;
		}
	}
}
