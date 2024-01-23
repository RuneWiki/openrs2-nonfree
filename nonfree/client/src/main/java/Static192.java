import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Lclient!jd;")
	public static Class84 aClass84_81;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString200;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString199 = " from your friend list first.";

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public static int anInt3987 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method3212() {
		Static61.aClass22_2.method4639();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static246.aLongArray21[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static84.aLongArray2[local10] = 0L;
		}
		Static163.anInt3422 = 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIIZIIII)[I")
	public static int[] method3213(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub1_Sub35 local10 = new Class2_Sub1_Sub35();
		local10.anInt5873 = 8;
		local10.anInt5868 = 4;
		local10.aBoolean473 = true;
		local10.anInt5867 = 35;
		local10.anInt5865 = 8;
		local10.anInt5875 = (int) (arg0 * 4096.0F);
		local10.method4934();
		Static155.method4925(2048, 1);
		local10.method4712(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method3214(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(11) int local11 = Static96.anInt2115 >> 2 << 10;
		@Pc(15) byte[][] local15 = new byte[Static142.anInt3081][Static52.anInt1205];
		@Pc(19) int local19 = Static293.anInt6079 >> 1;
		@Pc(31) int local31;
		@Pc(119) int local119;
		@Pc(132) int local132;
		while (arg0.anInt5328 < arg0.aByteArray72.length) {
			local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			if (arg0.method4261() == 1) {
				local35 = true;
				local31 = arg0.method4261();
				local33 = arg0.method4261();
			}
			@Pc(57) int local57 = arg0.method4261();
			@Pc(61) int local61 = arg0.method4261();
			@Pc(68) int local68 = local57 * 64 - Static115.anInt2461;
			@Pc(79) int local79 = Static52.anInt1205 + Static239.anInt4870 - local61 * 64 - 1;
			if (local68 >= 0 && local79 - 63 >= 0 && Static142.anInt3081 > local68 + 63 && local79 < Static52.anInt1205) {
				for (local119 = 0; local119 < 64; local119++) {
					@Pc(130) byte[] local130 = local15[local68 + local119];
					for (local132 = 0; local132 < 64; local132++) {
						if (!local35 || local31 * 8 <= local119 && local119 < local31 * 8 + 8 && local33 * 8 <= local132 && local33 * 8 + 8 > local132) {
							local130[local79 - local132] = arg0.method4220();
						}
					}
				}
			} else if (local35) {
				arg0.anInt5328 += 64;
			} else {
				arg0.anInt5328 += 4096;
			}
		}
		local31 = Static52.anInt1205;
		@Pc(191) int[] local191 = new int[local31];
		@Pc(193) int local193 = Static142.anInt3081;
		@Pc(196) int[] local196 = new int[local31];
		@Pc(199) int[] local199 = new int[local31];
		@Pc(202) int[] local202 = new int[local31];
		@Pc(205) int[] local205 = new int[local31];
		for (local119 = -5; local119 < local193; local119++) {
			@Pc(242) int local242;
			@Pc(306) int local306;
			for (@Pc(216) int local216 = 0; local216 < local31; local216++) {
				local132 = local119 + 5;
				@Pc(288) int local288;
				if (local193 > local132) {
					local242 = local15[local132][local216] & 0xFF;
					if (local242 > 0) {
						@Pc(252) Class87 local252 = Static110.method2045(local242 - 1);
						local191[local216] += local252.anInt2591;
						local196[local216] += local252.anInt2590;
						local202[local216] += local252.anInt2599;
						local199[local216] += local252.anInt2594;
						local288 = local205[local216]++;
					}
				}
				local242 = local119 - 5;
				if (local242 >= 0) {
					local306 = local15[local242][local216] & 0xFF;
					if (local306 > 0) {
						@Pc(315) Class87 local315 = Static110.method2045(local306 - 1);
						local191[local216] -= local315.anInt2591;
						local196[local216] -= local315.anInt2590;
						local202[local216] -= local315.anInt2599;
						local199[local216] -= local315.anInt2594;
						local288 = local205[local216]--;
					}
				}
			}
			if (local119 >= 0) {
				local132 = 0;
				@Pc(370) int[][] local370 = Static278.anIntArrayArrayArray15[local119 >> 6];
				local306 = 0;
				local242 = 0;
				@Pc(376) int local376 = 0;
				@Pc(378) int local378 = 0;
				for (@Pc(380) int local380 = -5; local380 < local31; local380++) {
					@Pc(391) int local391 = local380 + 5;
					if (local391 < local31) {
						local376 += local205[local391];
						local132 += local191[local391];
						local306 += local202[local391];
						local242 += local196[local391];
						local378 += local199[local391];
					}
					@Pc(428) int local428 = local380 - 5;
					if (local428 >= 0) {
						local242 -= local196[local428];
						local376 -= local205[local428];
						local306 -= local202[local428];
						local378 -= local199[local428];
						local132 -= local191[local428];
					}
					if (local380 >= 0 && local376 > 0) {
						@Pc(477) int[] local477 = local370[local380 >> 6];
						@Pc(495) int local495 = local378 == 0 ? 0 : Static72.method1336(local132 * 256 / local378, local242 / local376, local306 / local376);
						if (local15[local119][local380] != 0) {
							if (local477 == null) {
								local477 = local370[local380 >> 6] = new int[4096];
							}
							@Pc(535) int local535 = local19 + (local495 & 0x7F);
							if (local535 < 0) {
								local535 = 0;
							} else if (local535 > 127) {
								local535 = 127;
							}
							@Pc(565) int local565 = (local11 + local495 & 0xFC00) - (-(local495 & 0x380) - local535);
							local477[(local119 & 0x3F) + ((local380 & 0x3F) << 6)] = Static93.anIntArray152[Static291.method4823(96, local565)];
						} else if (local477 != null) {
							local477[((local380 & 0x3F) << 6) + (local119 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)[Lclient!rj;")
	public static Class2_Sub3_Sub1[] method3215() {
		@Pc(13) Class2_Sub3_Sub1[] local13 = new Class2_Sub3_Sub1[Static27.anInt576];
		for (@Pc(15) int local15 = 0; local15 < Static27.anInt576; local15++) {
			@Pc(30) int local30 = Static30.anIntArray46[local15] * Static19.anIntArray30[local15];
			@Pc(34) byte[] local34 = Static273.aByteArrayArray115[local15];
			if (Static29.aBooleanArray4[local15]) {
				@Pc(111) byte[] local111 = Static107.aByteArrayArray52[local15];
				@Pc(114) int[] local114 = new int[local30];
				for (@Pc(116) int local116 = 0; local116 < local30; local116++) {
					local114[local116] = (local111[local116] & 0xFF) << 24 | Static187.anIntArray314[local34[local116] & 0xFF];
				}
				if (Static60.aBoolean106) {
					local13[local15] = new Class2_Sub3_Sub1_Sub2_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], local114);
				} else {
					local13[local15] = new Class2_Sub3_Sub1_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], local114);
				}
			} else {
				@Pc(41) int[] local41 = new int[local30];
				for (@Pc(43) int local43 = 0; local43 < local30; local43++) {
					local41[local43] = Static187.anIntArray314[local34[local43] & 0xFF];
				}
				if (Static60.aBoolean106) {
					local13[local15] = new Class2_Sub3_Sub1_Sub2(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], local41);
				} else {
					local13[local15] = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], local41);
				}
			}
		}
		Static171.method2953();
		return local13;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lclient!eh;")
	public static Class50 method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass50_1;
	}
}
