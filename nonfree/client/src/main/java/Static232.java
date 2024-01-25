import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_80 = new Class73(46, 2);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method4369() {
		for (@Pc(3) int local3 = 0; local3 < Static530.anInt9223; local3++) {
			@Pc(14) Class343 local14 = Static433.aClass343Array1[local3];
			@Pc(16) boolean local16 = false;
			@Pc(141) int local141;
			if (local14.aClass6_Sub4_Sub5_4 == null) {
				local14.anInt9814--;
				if (local14.anInt9814 < (local14.method8016() ? -1500 : -10)) {
					local16 = true;
				} else {
					if (local14.aByte125 == 1 && local14.aClass51_1 == null) {
						local14.aClass51_1 = Static648.method2092(Static168.aClass223_47, local14.anInt9812, 0);
						if (local14.aClass51_1 == null) {
							continue;
						}
						local14.anInt9814 += local14.aClass51_1.method2093();
					} else if (local14.method8016() && (local14.aClass6_Sub20_3 == null || local14.aClass6_Sub27_Sub1_4 == null)) {
						if (local14.aClass6_Sub20_3 == null) {
							local14.aClass6_Sub20_3 = Static172.method3243(Static360.aClass223_74, local14.anInt9812);
						}
						if (local14.aClass6_Sub20_3 == null) {
							continue;
						}
						if (local14.aClass6_Sub27_Sub1_4 == null) {
							local14.aClass6_Sub27_Sub1_4 = local14.aClass6_Sub20_3.method3238(new int[] { 22050 });
							if (local14.aClass6_Sub27_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local14.anInt9814 < 0) {
						@Pc(116) int local116 = 8192;
						if (local14.anInt9817 == 0) {
							local141 = local14.anInt9820 * (local14.aByte125 == 3 ? Static87.aClass6_Sub33_6.aClass14_Sub22_2.method7288() : Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288()) >> 2;
						} else {
							@Pc(150) int local150 = local14.anInt9817 >> 24 & 0x3;
							if (local150 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
								@Pc(169) int local169 = (local14.anInt9817 & 0xFF) << 9;
								@Pc(175) int local175 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() << 8;
								@Pc(182) int local182 = local14.anInt9817 >> 16 & 0xFF;
								@Pc(194) int local194 = local175 + (local182 << 9) - (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 - 256);
								@Pc(201) int local201 = local14.anInt9817 >> 8 & 0xFF;
								@Pc(213) int local213 = (local201 << 9) - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 - (-local175 - 256);
								@Pc(221) int local221 = Math.abs(local194) + Math.abs(local213) - 512;
								if (local169 < local221) {
									local14.anInt9814 = -99999;
									continue;
								}
								if (local221 < 0) {
									local221 = 0;
								}
								local141 = (local169 - local221) * Static87.aClass6_Sub33_6.aClass14_Sub22_1.method7288() * local14.anInt9820 / local169 >> 2;
								if (local14.aClass9_Sub4_21 != null && local14.aClass9_Sub4_21 instanceof Class9_Sub4_Sub2) {
									@Pc(265) Class9_Sub4_Sub2 local265 = (Class9_Sub4_Sub2) local14.aClass9_Sub4_21;
									@Pc(268) short local268 = local265.aShort114;
									@Pc(271) short local271 = local265.aShort115;
								}
								if (local194 != 0 || local213 != 0) {
									@Pc(294) int local294 = -Static349.anInt6848 - (int) (Math.atan2((double) local194, (double) local213) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local294 > 8192) {
										local294 = 16384 - local294;
									}
									@Pc(309) int local309;
									if (local221 <= 0) {
										local309 = 8192;
									} else if (local221 >= 4096) {
										local309 = 16384;
									} else {
										local309 = (8192 - local221) / 4096 + 8192;
									}
									local116 = local309 * local294 / 8192 + (16384 - local309 >> 1);
								}
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(348) Class6_Sub27_Sub1 local348 = null;
							if (local14.aByte125 == 1) {
								local348 = local14.aClass51_1.method2094().method4220(Static286.aClass321_2);
							} else if (local14.method8016()) {
								local348 = local14.aClass6_Sub27_Sub1_4;
							}
							@Pc(380) Class6_Sub4_Sub5 local380 = local14.aClass6_Sub4_Sub5_4 = Static656.method8647(local348, local14.anInt9822, local141, local116);
							local380.method8667(local14.anInt9813 - 1);
							Static152.aClass6_Sub4_Sub3_2.method5194(local380);
						}
					}
				}
			} else if (!local14.aClass6_Sub4_Sub5_4.method8791()) {
				local16 = true;
			}
			if (local16) {
				Static530.anInt9223--;
				for (local141 = local3; local141 < Static530.anInt9223; local141++) {
					Static433.aClass343Array1[local141] = Static433.aClass343Array1[local141 + 1];
				}
				local3--;
			}
		}
		if (Static342.aBoolean544 && !Static15.method551()) {
			if (Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288() != 0 && Static281.anInt5925 != -1) {
				if (Static606.aClass6_Sub4_Sub2_3 == null) {
					Static406.method6373(Static5.aClass223_2, Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288(), Static281.anInt5925);
				} else {
					Static634.method8700(Static281.anInt5925, Static606.aClass6_Sub4_Sub2_3, Static5.aClass223_2, Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288());
				}
			}
			Static342.aBoolean544 = false;
			Static606.aClass6_Sub4_Sub2_3 = null;
		} else if (Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288() != 0 && Static281.anInt5925 != -1 && !Static15.method551()) {
			@Pc(504) Class6_Sub17 local504 = Static330.method7824(Static272.aClass185_59, Static569.aClass134_2);
			local504.aClass6_Sub8_Sub1_2.method8202(Static281.anInt5925);
			Static452.method6867(local504);
			Static281.anInt5925 = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
	public static void method4371() {
		@Pc(8) int local8 = Static191.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static191.aByteArrayArray7[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static447.anInt8106; local25++) {
					if (Static228.anIntArray215[local10] == Static383.anIntArray346[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static383.anIntArray346[Static447.anInt8106] = Static228.anIntArray215[local10];
					local23 = Static447.anInt8106++;
				}
				@Pc(72) Class6_Sub8 local72 = new Class6_Sub8(Static191.aByteArrayArray7[local10]);
				@Pc(74) int local74 = 0;
				while (Static191.aByteArrayArray7[local10].length > local72.anInt10061 && local74 < 511 && Static288.anInt5977 < 1023) {
					@Pc(91) int local91 = local74++ << 6 | local23;
					@Pc(95) int local95 = local72.method8220();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(121) int local121 = local105 + (Static228.anIntArray215[local10] >> 8) * 64 - Static477.anInt8412;
					@Pc(135) int local135 = (Static228.anIntArray215[local10] & 0xFF) * 64 + local109 - Static227.anInt5049;
					@Pc(144) Class158 local144 = Static8.aClass309_1.method7453(local72.method8220());
					@Pc(153) Class6_Sub42 local153 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local91);
					if (local153 == null && (local144.aByte57 & 0x1) > 0 && local99 == Static213.anInt4581 && local121 >= 0 && Static306.anInt6176 > local121 + local144.anInt5826 && local135 >= 0 && Static108.anInt2930 > local144.anInt5826 + local135) {
						@Pc(191) Class9_Sub4_Sub2_Sub1_Sub1 local191 = new Class9_Sub4_Sub2_Sub1_Sub1();
						local191.anInt4299 = local91;
						@Pc(199) Class6_Sub42 local199 = new Class6_Sub42(local191);
						Static461.aClass380_35.method8753(local199, (long) local91);
						Static303.aClass6_Sub42Array1[Static337.anInt6701++] = local199;
						Static562.anIntArray508[Static288.anInt5977++] = local91;
						local191.anInt4333 = Static384.anInt7234;
						local191.method1994(local144);
						local191.method3631(local191.aClass158_1.anInt5826);
						local191.anInt4342 = local191.aClass158_1.anInt5813 << 3;
						local191.method3633(local191.aClass158_1.aByte65 + 4 << 11 & 0x3FDA, true);
						local191.method1989(local191.method3620(), local121, true, local135, local99);
					}
				}
			}
		}
	}
}
