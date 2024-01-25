import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "Lclient!ji;")
	public static Class6_Sub21 aClass6_Sub21_7;

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
	public static int anInt8032;

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
	public static int anInt8036 = -1;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!kda;IIFFFIFFIII[BI)V")
	public static void method6536(@OriginalArg(0) Class84 arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(10) int arg7, @OriginalArg(12) byte[] arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg0.method2516(arg4, arg3 * 127.0F, arg6 / (float) 16, arg5 / (float) 128, 0, arg2 / (float) 128, local12);
			local42 = arg7;
			arg2 *= 2.0F;
			arg5 *= 2.0F;
			arg6 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg8[local42] = (byte) ((float) arg8[local42] + local12[local56]);
				local42++;
			}
			arg3 *= arg1;
		}
		local42 = arg7;
		for (local56 = 0; local56 < 16384; local56++) {
			arg8[local42] = (byte) (arg8[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
	public static void method6538() {
		@Pc(5) int local5 = 0;
		if (Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242)) {
			local5 = 55;
		}
		if (!Static140.aClass6_Sub48_Sub1_1.aBoolean676) {
			local5 |= 0x40;
		}
		Static183.method3374(local5);
		Static412.aClass307_4.method6635(local5);
		Static444.aClass322_2.method7138(local5);
		Static577.aClass125_2.method3234(local5);
		Static289.aClass66_7.method1650(local5);
		Static111.method1977(local5);
		Static298.method4754(local5);
		Static404.method5924(local5);
		Static195.method3545(local5);
		Static573.method7683();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)V")
	public static void method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub2_3 != null) {
			local7.aClass4_Sub2_3 = null;
		}
		if (local7.aClass4_Sub2_2 != null) {
			local7.aClass4_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)V")
	public static void method6541() {
		if (Static331.aFloat140 < 1024.0F) {
			Static331.aFloat140 = 1024.0F;
		}
		while (Static428.aFloat160 >= 16384.0F) {
			Static428.aFloat160 -= 16384.0F;
		}
		if (Static331.aFloat140 > 3072.0F) {
			Static331.aFloat140 = 3072.0F;
		}
		while (Static428.aFloat160 < 0.0F) {
			Static428.aFloat160 += 16384.0F;
		}
		@Pc(41) int local41 = Static405.anInt7184 >> 9;
		@Pc(45) int local45 = anInt8032 >> 9;
		@Pc(51) int local51 = Static160.method2951(anInt8032, Static405.anInt7184, Static97.anInt1863);
		@Pc(53) int local53 = 0;
		@Pc(77) int local77;
		if (local41 > 3 && local45 > 3 && Static473.anInt8075 - 4 > local41 && Static165.anInt6749 - 4 > local45) {
			for (local77 = local41 - 4; local77 <= local41 + 4; local77++) {
				for (@Pc(83) int local83 = local45 - 4; local83 <= local45 + 4; local83++) {
					@Pc(87) int local87 = Static97.anInt1863;
					if (local87 < 3 && Static270.method4475(local77, local83)) {
						local87++;
					}
					@Pc(100) int local100 = 0;
					if (Static20.aClass115_Sub1_1.aByteArrayArrayArray13 != null && Static20.aClass115_Sub1_1.aByteArrayArrayArray13[local87] != null) {
						local100 = (Static20.aClass115_Sub1_1.aByteArrayArrayArray13[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local51 + local100 - Static133.aClass59Array3[local87].JA(local77, local83);
					if (local133 > local53) {
						local53 = local133;
					}
				}
			}
		}
		local77 = (local53 >> 2) * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (local77 > Static90.anInt9289) {
			Static90.anInt9289 += (local77 - Static90.anInt9289) / 24;
		} else if (Static90.anInt9289 > local77) {
			Static90.anInt9289 += (local77 - Static90.anInt9289) / 80;
		}
	}
}
