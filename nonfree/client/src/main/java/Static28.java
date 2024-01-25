import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!at", name = "R", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!nt;ILclient!ha;II)V")
	public static void method1029(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class252 local16 = arg0.method6017(arg2);
		if (local16 == null) {
			return;
		}
		@Pc(23) Class1 local23 = local16.aClass1_1;
		arg2.KA(arg3, arg1, arg0.anInt7015 + arg3, arg1 - -arg0.anInt7045);
		if (Static306.anInt4920 == 2 || Static306.anInt4920 == 5 || Static462.aClass178_13 == null) {
			arg2.A(-16777216, local23, arg3, arg1);
			return;
		}
		@Pc(73) int local73;
		@Pc(71) int local71;
		@Pc(69) int local69;
		@Pc(75) int local75;
		if (Static262.anInt4081 == 4) {
			local69 = (int) -Static382.aFloat40 & 0x3FFF;
			local71 = Static78.anInt1842;
			local73 = Static13.anInt566;
			local75 = 4096;
		} else {
			local75 = 4096 - Static402.anInt6239 * 16;
			local73 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
			local69 = (int) -Static382.aFloat40 + Static194.anInt3310 & 0x3FFF;
			local71 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
		}
		@Pc(112) int local112 = local73 / 128 + 48 - (Static497.anInt7926 - 104) * 2;
		@Pc(130) int local130 = Static646.anInt9979 * 4 + 208 + 48 - Static646.anInt9979 * 2 - local71 / 128;
		Static462.aClass178_13.method7628((float) arg0.anInt7015 / 2.0F + (float) arg3, (float) arg1 + (float) arg0.anInt7045 / 2.0F, (float) local112, (float) local130, local75, local69 << 2, local23, arg3, arg1);
		@Pc(184) int local184;
		@Pc(194) int local194;
		@Pc(204) int local204;
		@Pc(215) int local215;
		for (@Pc(166) Class3_Sub44 local166 = (Class3_Sub44) Static437.aClass342_53.method7644(); local166 != null; local166 = (Class3_Sub44) Static437.aClass342_53.method7650()) {
			@Pc(173) int local173 = local166.anInt7298;
			local184 = (Static242.aClass377_3.anIntArray733[local173] >> 14 & 0x3FFF) - Static291.anInt4448;
			local194 = (Static242.aClass377_3.anIntArray733[local173] & 0x3FFF) - Static189.anInt3243;
			local204 = local184 * 4 + 2 - local73 / 128;
			local215 = local194 * 4 + 2 - local71 / 128;
			Static152.method9581(local215, local23, Static242.aClass377_3.anIntArray732[local173], local204, arg3, arg2, arg1, arg0);
		}
		for (local184 = 0; local184 < Static660.anInt10119; local184++) {
			local194 = Static268.anIntArray330[local184] * 4 + 2 - local73 / 128;
			local204 = Static347.anIntArray397[local184] * 4 + 2 - local71 / 128;
			@Pc(277) Class247 local277 = Static216.aClass53_3.method1523(Static485.anIntArray563[local184]);
			if (local277.anIntArray477 != null) {
				local277 = local277.method5442(Static380.aClass127_1);
				if (local277 == null || local277.anInt6241 == -1) {
					continue;
				}
			}
			Static152.method9581(local204, local23, local277.anInt6241, local194, arg3, arg2, arg1, arg0);
		}
		@Pc(371) int local371;
		@Pc(382) int local382;
		for (@Pc(323) Class3_Sub28 local323 = (Class3_Sub28) Static113.aClass313_9.method7103(); local323 != null; local323 = (Class3_Sub28) Static113.aClass313_9.method7110()) {
			local204 = (int) (local323.aLong345 >> 28 & 0x3L);
			if (Static606.anInt9195 == local204) {
				local215 = (int) (local323.aLong345 & 0x3FFFL) - Static291.anInt4448;
				@Pc(360) int local360 = (int) (local323.aLong345 >> 14 & 0x3FFFL) - Static189.anInt3243;
				local371 = local215 * 4 + 2 - local73 / 128;
				local382 = local360 * 4 + 2 - local71 / 128;
				Static687.method9072(local371, local23, arg3, Static419.aClass178Array17[0], arg0, arg1, local382);
			}
		}
		@Pc(479) int local479;
		for (local204 = 0; local204 < anInt1087; local204++) {
			@Pc(415) Class3_Sub52 local415 = (Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local204]);
			if (local415 != null) {
				@Pc(420) Class9_Sub1_Sub1_Sub2_Sub2 local420 = local415.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				if (local420.method7500() && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 == local420.aByte139) {
					@Pc(434) Class219 local434 = local420.aClass219_1;
					if (local434 != null && local434.anIntArray405 != null) {
						local434 = local434.method5035(Static380.aClass127_1);
					}
					if (local434 != null && local434.aBoolean371 && local434.aBoolean370) {
						local382 = local420.anInt10694 / 128 - local73 / 128;
						local479 = local420.anInt10695 / 128 - local71 / 128;
						if (local434.anInt5710 == -1) {
							Static687.method9072(local382, local23, arg3, Static419.aClass178Array17[1], arg0, arg1, local479);
						} else {
							Static152.method9581(local479, local23, local434.anInt5710, local382, arg3, arg2, arg1, arg0);
						}
					}
				}
			}
		}
		local215 = Static607.anInt9201;
		@Pc(524) int[] local524 = Static384.anIntArray436;
		@Pc(582) int local582;
		@Pc(586) int local586;
		@Pc(619) int local619;
		for (local371 = 0; local371 < local215; local371++) {
			@Pc(534) Class9_Sub1_Sub1_Sub2_Sub1 local534 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local524[local371]];
			if (local534 != null && local534.method476() && !local534.aBoolean34 && local534 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 == local534.aByte139) {
				local479 = local534.anInt10694 / 128 - local73 / 128;
				local582 = local534.anInt10695 / 128 - local71 / 128;
				@Pc(584) boolean local584 = false;
				for (local586 = 0; local586 < Static544.anInt9946; local586++) {
					if (local534.aString4.equals(Static636.aStringArray41[local586]) && Static113.anIntArray135[local586] != 0) {
						local584 = true;
						break;
					}
				}
				@Pc(617) boolean local617 = false;
				for (local619 = 0; local619 < Static651.anInt10057; local619++) {
					if (local534.aString4.equals(Static273.aClass61Array1[local619].aString37)) {
						local617 = true;
						break;
					}
				}
				@Pc(649) boolean local649 = false;
				if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt548 != 0 && local534.anInt548 != 0 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt548 == local534.anInt548) {
					local649 = true;
				}
				if (local534.aBoolean36) {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[6], arg0, arg1, local582);
				} else if (local649) {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[4], arg0, arg1, local582);
				} else if (local534.aBoolean37) {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[7], arg0, arg1, local582);
				} else if (local584) {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[3], arg0, arg1, local582);
				} else if (local617) {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[5], arg0, arg1, local582);
				} else {
					Static687.method9072(local479, local23, arg3, Static419.aClass178Array17[2], arg0, arg1, local582);
				}
			}
		}
		@Pc(786) Class197[] local786 = Static110.aClass197Array1;
		@Pc(876) int local876;
		for (local479 = 0; local479 < local786.length; local479++) {
			@Pc(794) Class197 local794 = local786[local479];
			if (local794 != null && local794.anInt5073 != 0 && Static716.anInt11157 % 20 < 10) {
				@Pc(839) int local839;
				if (local794.anInt5073 == 1) {
					@Pc(824) Class3_Sub52 local824 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local794.anInt5082);
					if (local824 != null) {
						@Pc(829) Class9_Sub1_Sub1_Sub2_Sub2 local829 = local824.aClass9_Sub1_Sub1_Sub2_Sub2_2;
						local839 = local829.anInt10694 / 128 - local73 / 128;
						local619 = local829.anInt10695 / 128 - local71 / 128;
						Static702.method9305(360000L, local839, local794.anInt5072, arg1, arg0, local23, local619, arg3);
					}
				}
				if (local794.anInt5073 == 2) {
					local876 = local794.anInt5081 / 128 - local73 / 128;
					local586 = local794.anInt5074 / 128 - local71 / 128;
					@Pc(892) long local892 = (long) (local794.anInt5079 << 7);
					@Pc(896) long local896 = local892 * local892;
					Static702.method9305(local896, local876, local794.anInt5072, arg1, arg0, local23, local586, arg3);
				}
				if (local794.anInt5073 == 10 && local794.anInt5082 >= 0 && Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1.length > local794.anInt5082) {
					@Pc(930) Class9_Sub1_Sub1_Sub2_Sub1 local930 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local794.anInt5082];
					if (local930 != null) {
						local586 = local930.anInt10694 / 128 - local73 / 128;
						local839 = local930.anInt10695 / 128 - local71 / 128;
						Static702.method9305(360000L, local586, local794.anInt5072, arg1, arg0, local23, local839, arg3);
					}
				}
			}
		}
		if (Static262.anInt4081 == 4) {
			return;
		}
		if (Static681.anInt10651 != 0) {
			local582 = Static681.anInt10651 * 4 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() * 2 + 2 - local73 / 128 - 2;
			local876 = Static517.anInt8136 * 4 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() * 2 + 2 - local71 / 128 - 2;
			Static687.method9072(local582, local23, arg3, Static656.aClass178Array15[Static216.aBoolean223 ? 1 : 0], arg0, arg1, local876);
		}
		if (!Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aBoolean34) {
			arg2.method9378(arg1 + arg0.anInt7045 / 2 - 1, arg3 + -1 + arg0.anInt7015 / 2, -1, 3, 3);
			return;
		}
	}
}
