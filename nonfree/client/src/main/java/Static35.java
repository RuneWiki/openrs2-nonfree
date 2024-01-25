import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Lclient!tr;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "[Lclient!lk;")
	public static Class145_Sub1[] aClass145_Sub1Array7;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "[Lclient!eq;")
	public static Class70[] aClass70Array3;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_36 = new Class229();

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "[I")
	public static final int[] anIntArray427 = new int[5];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg5 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(95) int local95 = local37 - local53 * (local61 - 1);
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = local45 * (local57 - 3);
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = (local61 - 3) * local53;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg5 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (local21 - 1) * local107;
		@Pc(151) int[] local151 = Static376.anIntArrayArray64[arg4];
		Static15.method463(arg1, local151, arg6 - arg2, -local16 + arg6);
		Static15.method463(arg3, local151, arg6 - local16, local16 + arg6);
		Static15.method463(arg1, local151, local16 + arg6, arg2 + arg6);
		while (local9 > 0) {
			@Pc(192) boolean local192 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local115;
					local78 += local133;
					local115 += local103;
					local7++;
					local133 += local103;
				}
			}
			if (local192) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local141;
						local87 += local125;
						local11++;
						local125 += local111;
						local141 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local87 += local125;
					local141 += local111;
					local125 += local111;
					local11++;
				}
				local87 += -local147;
				local95 += -local131;
				local147 -= local107;
				local131 -= local107;
			}
			if (local78 < 0) {
				local78 += local133;
				local70 += local115;
				local133 += local103;
				local115 += local103;
				local7++;
			}
			local70 += -local139;
			local78 += -local121;
			local121 -= local99;
			local9--;
			local139 -= local99;
			@Pc(329) int local329 = arg4 - local9;
			@Pc(334) int local334 = arg4 + local9;
			@Pc(338) int local338 = arg6 + local7;
			@Pc(343) int local343 = arg6 - local7;
			if (local192) {
				@Pc(368) int local368 = arg6 + local11;
				@Pc(372) int local372 = arg6 - local11;
				Static15.method463(arg1, Static376.anIntArrayArray64[local329], local343, local372);
				Static15.method463(arg3, Static376.anIntArrayArray64[local329], local372, local368);
				Static15.method463(arg1, Static376.anIntArrayArray64[local329], local368, local338);
				Static15.method463(arg1, Static376.anIntArrayArray64[local334], local343, local372);
				Static15.method463(arg3, Static376.anIntArrayArray64[local334], local372, local368);
				Static15.method463(arg1, Static376.anIntArrayArray64[local334], local368, local338);
			} else {
				Static15.method463(arg1, Static376.anIntArrayArray64[local329], local343, local338);
				Static15.method463(arg1, Static376.anIntArrayArray64[local334], local343, local338);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[B)I")
	public static int method4616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local10 = Class162.anIntArray375[(local10 ^ arg2[local12]) & 0xFF] ^ local10 >>> 8;
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	public static void method4617() {
		Static127.anInt2697 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static396.anInt6816; local3++) {
			@Pc(8) Class70 local8 = aClass70Array3[local3];
			@Pc(12) int local12;
			if (Static121.anIntArray283 != null) {
				for (local12 = 0; local12 < Static121.anIntArray283.length; local12++) {
					if (Static121.anIntArray283[local12] != -1000000 && (local8.anInt2250 <= Static121.anIntArray283[local12] || local8.anInt2236 <= Static121.anIntArray283[local12]) && (local8.anInt2248 <= Static106.anIntArray200[local12] || local8.anInt2237 <= Static106.anIntArray200[local12]) && (local8.anInt2248 >= Static20.anIntArray42[local12] || local8.anInt2237 >= Static20.anIntArray42[local12]) && (local8.anInt2245 <= Static433.anIntArray558[local12] || local8.anInt2253 <= Static433.anIntArray558[local12]) && (local8.anInt2245 >= Static6.anIntArray10[local12] || local8.anInt2253 >= Static6.anIntArray10[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt2239 == 1) {
				local12 = local8.anInt2252 + Static251.anInt4730 - Static444.anInt7531;
				if (local12 >= 0 && local12 <= Static251.anInt4730 + Static251.anInt4730) {
					local110 = local8.anInt2251 + Static251.anInt4730 - Static340.anInt6288;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static251.anInt4730 + Static251.anInt4730) {
						continue;
					}
					local128 = local8.anInt2235 + Static251.anInt4730 - Static340.anInt6288;
					if (local128 > Static251.anInt4730 + Static251.anInt4730) {
						local128 = Static251.anInt4730 + Static251.anInt4730;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static200.aBooleanArrayArray2[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static28.anInt787 - local8.anInt2248;
						if (local164 > Static237.anInt4556) {
							local8.anInt2234 = 1;
						} else {
							if (local164 >= -Static237.anInt4556) {
								continue;
							}
							local8.anInt2234 = 2;
							local164 = -local164;
						}
						local8.anInt2243 = (local8.anInt2245 - Static91.anInt1938 << 8) / local164;
						local8.anInt2249 = (local8.anInt2253 - Static91.anInt1938 << 8) / local164;
						local8.anInt2240 = (local8.anInt2250 - Static365.anInt6534 << 8) / local164;
						local8.anInt2241 = (local8.anInt2236 - Static365.anInt6534 << 8) / local164;
						Static201.aClass70Array2[Static127.anInt2697++] = local8;
					}
				}
			} else if (local8.anInt2239 == 2) {
				local12 = local8.anInt2251 + Static251.anInt4730 - Static340.anInt6288;
				if (local12 >= 0 && local12 <= Static251.anInt4730 + Static251.anInt4730) {
					local110 = local8.anInt2252 + Static251.anInt4730 - Static444.anInt7531;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static251.anInt4730 + Static251.anInt4730) {
						continue;
					}
					local128 = local8.anInt2242 + Static251.anInt4730 - Static444.anInt7531;
					if (local128 > Static251.anInt4730 + Static251.anInt4730) {
						local128 = Static251.anInt4730 + Static251.anInt4730;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static200.aBooleanArrayArray2[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static91.anInt1938 - local8.anInt2245;
						if (local164 > Static237.anInt4556) {
							local8.anInt2234 = 3;
						} else {
							if (local164 >= -Static237.anInt4556) {
								continue;
							}
							local8.anInt2234 = 4;
							local164 = -local164;
						}
						local8.anInt2247 = (local8.anInt2248 - Static28.anInt787 << 8) / local164;
						local8.anInt2244 = (local8.anInt2237 - Static28.anInt787 << 8) / local164;
						local8.anInt2240 = (local8.anInt2250 - Static365.anInt6534 << 8) / local164;
						local8.anInt2241 = (local8.anInt2236 - Static365.anInt6534 << 8) / local164;
						Static201.aClass70Array2[Static127.anInt2697++] = local8;
					}
				}
			} else if (local8.anInt2239 == 4) {
				local12 = local8.anInt2250 - Static365.anInt6534;
				if (local12 > Static126.anInt3501) {
					local110 = local8.anInt2251 + Static251.anInt4730 - Static340.anInt6288;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static251.anInt4730 + Static251.anInt4730) {
						continue;
					}
					local128 = local8.anInt2235 + Static251.anInt4730 - Static340.anInt6288;
					if (local128 > Static251.anInt4730 + Static251.anInt4730) {
						local128 = Static251.anInt4730 + Static251.anInt4730;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt2252 + Static251.anInt4730 - Static444.anInt7531;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static251.anInt4730 + Static251.anInt4730) {
						continue;
					}
					local164 = local8.anInt2242 + Static251.anInt4730 - Static444.anInt7531;
					if (local164 > Static251.anInt4730 + Static251.anInt4730) {
						local164 = Static251.anInt4730 + Static251.anInt4730;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static200.aBooleanArrayArray2[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt2234 = 5;
						local8.anInt2247 = (local8.anInt2248 - Static28.anInt787 << 8) / local12;
						local8.anInt2244 = (local8.anInt2237 - Static28.anInt787 << 8) / local12;
						local8.anInt2243 = (local8.anInt2245 - Static91.anInt1938 << 8) / local12;
						local8.anInt2249 = (local8.anInt2253 - Static91.anInt1938 << 8) / local12;
						Static201.aClass70Array2[Static127.anInt2697++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Lclient!rr;")
	public static Class1_Sub1 method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_2;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!eo;Lclient!qa;I)V")
	public static void method4619(@OriginalArg(0) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class32 local10 = arg1.method1726(arg2);
		if (local10 == null) {
			return;
		}
		arg2.pa(arg3, arg0, arg3 + arg1.anInt2178, arg0 + arg1.lb);
		if (Static103.anInt2292 == 2 || Static103.anInt2292 == 5 || Static369.aClass22_19 == null) {
			arg2.j(-16777216, local10, arg3, arg0);
			return;
		}
		@Pc(49) int local49;
		@Pc(66) int local66;
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (Static107.anInt2382 == 4) {
			local57 = (int) -Static235.aFloat60 & 0x3FFF;
			local63 = 4096;
			local66 = Static358.anInt5918;
			local49 = Static222.anInt4311;
		} else {
			local49 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
			local57 = Static397.anInt6876 + (int) -Static235.aFloat60 & 0x3FFF;
			local63 = 4096 - Static317.anInt5759 * 16;
			local66 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
		}
		@Pc(94) int local94 = local49 / 32 + 208 + 48 - Static399.anInt6923 * 2;
		@Pc(112) int local112 = Static127.anInt2696 * 4 + 48 - (Static127.anInt2696 - 104) * 2 - local66 / 32;
		Static369.aClass22_19.method6076((float) arg3 + (float) arg1.anInt2178 / 2.0F, (float) arg1.lb / 2.0F + (float) arg0, (float) local94, (float) local112, local63, local57 << 2, local10, arg3, arg0);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(146) Class3_Sub25 local146 = (Class3_Sub25) Static285.aClass229_33.method5328(); local146 != null; local146 = (Class3_Sub25) Static285.aClass229_33.method5325()) {
			@Pc(151) int local151 = local146.anInt4134;
			local162 = (Static17.aClass226_1.anIntArray487[local151] >> 14 & 0x3FFF) - Static108.anInt3458;
			local172 = (Static17.aClass226_1.anIntArray487[local151] & 0x3FFF) - Static339.anInt6223;
			local183 = local162 * 4 + 2 - local49 / 32;
			local194 = local172 * 4 + 2 - local66 / 32;
			Static408.method5485(arg2, local10, local183, arg1, local194, arg0, Static17.aClass226_1.anIntArray486[local151], arg3);
		}
		for (local162 = 0; local162 < Static77.anInt1692; local162++) {
			local172 = Static76.anIntArray152[local162] * 4 + 2 - local49 / 32;
			local183 = Static214.anIntArray319[local162] * 4 + 2 - local66 / 32;
			@Pc(253) Class128 local253 = Static55.aClass25_1.method855(Static238.anIntArray354[local162]);
			if (local253.anIntArray307 != null) {
				local253 = local253.method3307(Static369.aClass11_1);
				if (local253 == null || local253.anInt4000 == -1) {
					continue;
				}
			}
			Static408.method5485(arg2, local10, local172, arg1, local183, arg0, local253.anInt4000, arg3);
		}
		for (@Pc(289) Class3_Sub44 local289 = (Class3_Sub44) Static157.aClass127_15.method3248(); local289 != null; local289 = (Class3_Sub44) Static157.aClass127_15.method3252()) {
			local183 = (int) (local289.aLong227 >> 28 & 0x3L);
			if (Static239.anInt4586 == local183) {
				local194 = (int) (local289.aLong227 & 0x3FFFL) * 4 + 2 - local49 / 32;
				@Pc(334) int local334 = (int) (local289.aLong227 >> 14 & 0x3FFFL) * 4 + 2 - local66 / 32;
				Static263.method3974(arg3, local10, local334, local194, arg1, arg0, Static198.aClass22Array13[0]);
			}
		}
		@Pc(404) int local404;
		for (local183 = 0; local183 < Static453.anInt7682; local183++) {
			@Pc(362) Class1_Sub3_Sub3_Sub2 local362 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local183]];
			if (local362 != null && local362.method4850() && Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 == local362.aByte77) {
				@Pc(376) Class47 local376 = local362.aClass47_1;
				if (local376 != null && local376.anIntArray134 != null) {
					local376 = local376.method1296(Static369.aClass11_1);
				}
				if (local376 != null && local376.aBoolean126 && local376.aBoolean122) {
					local404 = local362.anInt6053 / 32 - local49 / 32;
					@Pc(414) int local414 = local362.anInt6055 / 32 - local66 / 32;
					if (local376.anInt1598 == -1) {
						Static263.method3974(arg3, local10, local414, local404, arg1, arg0, Static198.aClass22Array13[1]);
					} else {
						Static408.method5485(arg2, local10, local404, arg1, local414, arg0, local376.anInt1598, arg3);
					}
				}
			}
		}
		local194 = Static207.anInt4136;
		@Pc(455) int[] local455 = Static322.anIntArray436;
		@Pc(489) int local489;
		@Pc(498) int local498;
		@Pc(502) int local502;
		for (local404 = 0; local404 < local194; local404++) {
			@Pc(465) Class1_Sub3_Sub3_Sub1 local465 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local455[local404]];
			if (local465 != null && local465.method3928() && local465 != Static113.aClass1_Sub3_Sub3_Sub1_4 && Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 == local465.aByte77) {
				local489 = local465.anInt6053 / 32 - local49 / 32;
				local498 = local465.anInt6055 / 32 - local66 / 32;
				@Pc(500) boolean local500 = false;
				for (local502 = 0; local502 < Static317.anInt5757; local502++) {
					if (local465.aString47.equals(Static170.aStringArray78[local502]) && Static195.anIntArray296[local502] != 0) {
						local500 = true;
						break;
					}
				}
				@Pc(529) boolean local529 = false;
				for (@Pc(531) int local531 = 0; local531 < Static154.anInt3337; local531++) {
					if (local465.aString47.equals(Static65.aClass26Array2[local531].aString7)) {
						local529 = true;
						break;
					}
				}
				@Pc(555) boolean local555 = false;
				if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4876 != 0 && local465.anInt4876 != 0 && local465.anInt4876 == Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4876) {
					local555 = true;
				}
				if (local465.aBoolean364) {
					Static263.method3974(arg3, local10, local498, local489, arg1, arg0, Static198.aClass22Array13[6]);
				} else if (local500) {
					Static263.method3974(arg3, local10, local498, local489, arg1, arg0, Static198.aClass22Array13[3]);
				} else if (local529) {
					Static263.method3974(arg3, local10, local498, local489, arg1, arg0, Static198.aClass22Array13[5]);
				} else if (local555) {
					Static263.method3974(arg3, local10, local498, local489, arg1, arg0, Static198.aClass22Array13[4]);
				} else {
					Static263.method3974(arg3, local10, local498, local489, arg1, arg0, Static198.aClass22Array13[2]);
				}
			}
		}
		@Pc(654) Class125[] local654 = Static370.aClass125Array1;
		@Pc(748) int local748;
		for (local489 = 0; local489 < local654.length; local489++) {
			@Pc(662) Class125 local662 = local654[local489];
			if (local662 != null && local662.anInt3865 != 0 && Static290.anInt5325 % 20 < 10) {
				@Pc(721) int local721;
				if (local662.anInt3865 == 1 && local662.anInt3862 >= 0 && Static451.aClass1_Sub3_Sub3_Sub2Array1.length > local662.anInt3862) {
					@Pc(700) Class1_Sub3_Sub3_Sub2 local700 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local662.anInt3862];
					if (local700 != null) {
						local502 = local700.anInt6053 / 32 - local49 / 32;
						local721 = local700.anInt6055 / 32 - local66 / 32;
						Static442.method5898(360000L, arg1, local721, local502, arg3, local10, local662.anInt3870, arg0);
					}
				}
				if (local662.anInt3865 == 2) {
					local748 = local662.anInt3866 / 32 - local49 / 32;
					local502 = local662.anInt3864 / 32 - local66 / 32;
					@Pc(764) long local764 = (long) (local662.anInt3863 << 5);
					@Pc(768) long local768 = local764 * local764;
					Static442.method5898(local768, arg1, local502, local748, arg3, local10, local662.anInt3870, arg0);
				}
				if (local662.anInt3865 == 10 && local662.anInt3862 >= 0 && local662.anInt3862 < Static308.aClass1_Sub3_Sub3_Sub1Array1.length) {
					@Pc(801) Class1_Sub3_Sub3_Sub1 local801 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local662.anInt3862];
					if (local801 != null) {
						local502 = local801.anInt6053 / 32 - local49 / 32;
						local721 = local801.anInt6055 / 32 - local66 / 32;
						Static442.method5898(360000L, arg1, local721, local502, arg3, local10, local662.anInt3870, arg0);
					}
				}
			}
		}
		if (Static107.anInt2382 == 4) {
			return;
		}
		if (Static388.anInt6735 != 0) {
			local498 = Static388.anInt6735 * 4 + (Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() + -1) * 2 + 2 - local49 / 32;
			local748 = Static116.anInt6680 * 4 + (Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() - 1) * 2 + 2 - local66 / 32;
			Static263.method3974(arg3, local10, local748, local498, arg1, arg0, Static63.aClass22Array22[Static196.aBoolean301 ? 1 : 0]);
		}
		arg2.method2600(3, arg3 + arg1.anInt2178 / 2 - 1, 3, arg1.lb / 2 + arg0 - 1, -1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!sj;I)V")
	public static void method4620(@OriginalArg(0) Class3_Sub38 arg0) {
		if (!Static378.aBoolean462) {
			arg0.method5987();
			Static169.anInt3551--;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method4621() {
		Static191.aClass5_33.method116();
		Static229.aClass5_36.method116();
		Static281.aClass5_46.method116();
		Static248.aClass5_39.method116();
		Static420.aClass5_56.method116();
	}
}
