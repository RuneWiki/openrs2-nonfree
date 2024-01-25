import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!lh;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_2 = new Class234(78, 6);

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_2 = new Class57("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vr;ILclient!np;Lclient!qo;)V")
	public static void method89(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Class196 arg2) {
		@Pc(10) Class110 local10 = arg2.method4501(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5091();
		if (local16 < local10.method5090()) {
			local16 = local10.method5090();
		}
		@Pc(28) int local28 = arg0.anInt6280;
		@Pc(31) int local31 = arg0.anInt6275;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg2.aString53 != null) {
			local33 = Static316.aClass190_8.method4357(null, Static84.aStringArray13, arg2.aString53, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static84.aStringArray13[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static98.aClass111_2.method2358(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = Static98.aClass111_2.method2357() * local33 + Static98.aClass111_2.method2359() / 2;
		}
		local51 = local16 / 2 + arg0.anInt6280;
		@Pc(103) int local103 = arg0.anInt6275;
		if (Static42.anInt533 + local16 > local28) {
			local51 = local35 / 2 + Static42.anInt533 + local16 / 2 + 10 + 5;
			local28 = Static42.anInt533;
		} else if (Static42.anInt537 - local16 < local28) {
			local28 = Static42.anInt537 - local16;
			local51 = Static42.anInt537 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		if (local16 + Static42.anInt543 > local31) {
			local31 = Static42.anInt543;
			local103 = local16 / 2 + Static42.anInt543 + 10;
		} else if (local31 > Static42.anInt538 - local16) {
			local103 = Static42.anInt538 - local16 / 2 - local37 - 10;
			local31 = Static42.anInt538 - local16;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg0.anInt6280), (double) (local31 - arg0.anInt6275)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5092((float) local28 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local31, 4096, local74);
		@Pc(240) int local240 = -2;
		@Pc(242) int local242 = -2;
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		if (arg2.aString53 != null) {
			local240 = local51 - local35 / 2 - 5;
			local242 = local103;
			local244 = local240 + local35 + 10;
			local246 = Static98.aClass111_2.method2357() * local33 + local103 + 3;
			if (arg2.anInt4997 != 0) {
				arg1.method4954(local246 - local103, local103, local244 - local240, local240, arg2.anInt4997);
			}
			if (arg2.anInt5010 != 0) {
				arg1.method4885(local246 - local103, arg2.anInt5010, local244 - local240, local103, local240);
			}
			for (@Pc(320) int local320 = 0; local320 < local33; local320++) {
				@Pc(326) String local326 = Static84.aStringArray13[local320];
				if (local33 - 1 > local320) {
					local326 = local326.substring(0, local326.length() - 4);
				}
				Static98.aClass111_2.method2360(arg1, local326, local51, local103, arg2.anInt5012);
				local103 += Static98.aClass111_2.method2357();
			}
		}
		if (arg2.anInt4994 == -1 && arg2.aString53 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(381) Class3_Sub27 local381 = new Class3_Sub27(arg0);
		local381.anInt3893 = local16 + local28;
		local381.anInt3896 = local244;
		local381.anInt3903 = local31 - local16;
		local381.anInt3904 = local240;
		local381.anInt3899 = local242;
		local381.anInt3898 = local16 + local31;
		local381.anInt3900 = local246;
		local381.anInt3897 = local28 - local16;
		Static299.aClass138_37.method3053(local381);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public static void method91() {
		Static179.aClass139_37.method3072();
		Static103.aClass139_21.method3072();
		Static322.aClass139_82.method3072();
		Static212.aClass139_45.method3072();
		Static116.aClass139_25.method3072();
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lclient!w;")
	public static Class3_Sub7_Sub16 method92() {
		return Static42.aClass3_Sub7_Sub16_2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
	public static void method93() {
		for (@Pc(1) int local1 = 0; local1 < Static104.anInt2067; local1++) {
			if (!Static305.aBooleanArray124[local1]) {
				@Pc(10) Class3_Sub12_Sub1 local10 = Static19.aClass3_Sub12_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt6145;
				@Pc(18) int local18 = local10.anInt6129 - Static132.anInt2502;
				@Pc(26) int local26 = (local18 * 2 >> Static187.anInt3390) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt6127 - local18 >> Static187.anInt3390;
				@Pc(47) int local47 = local10.anInt6122 - local18 >> Static187.anInt3390;
				@Pc(54) int local54 = local10.anInt6122 + local18 >> Static187.anInt3390;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static103.anInt2050) {
					local54 = Static103.anInt2050 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray93[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static44.anInt791) {
						local101 = Static44.anInt791 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class28_Sub1 local134 = Static30.method472(local13, local118, local71, nm.class);
						if (local134 != null && local134.aByte74 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte74 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray93[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray93[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray93[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray93[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static305.aBooleanArray124[local1] = true;
				Static337.aClass7Array3[local13].method5645(local10, local33);
			}
		}
	}
}
