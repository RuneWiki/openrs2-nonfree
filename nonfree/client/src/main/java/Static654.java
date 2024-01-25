import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
	public static int anInt10064;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_51 = new Class62(16);

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	public static final int anInt10067 = 1339;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIZI)V")
	public static void method8553(@OriginalArg(2) boolean arg0) {
		Static293.aBoolean421 = arg0;
		Static11.anInt121 = 2;
		Static656.anInt1392 = 22050;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!ju;I)V")
	public static void method8554(@OriginalArg(0) Class201 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg0 == Static136.aClass201_7) {
			local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
			local21 = Static646.anInt9924 + (local12 >> 4 & 0x7);
			local27 = Static212.anInt3897 + (local12 & 0x7);
			local31 = Static67.aClass3_Sub17_Sub2_4.method4858();
			local35 = Static67.aClass3_Sub17_Sub2_4.method4888();
			local39 = Static67.aClass3_Sub17_Sub2_4.method4858();
			local43 = Static67.aClass3_Sub17_Sub2_4.method4888();
			if (local21 >= 0 && local27 >= 0 && local21 < Static251.anInt4680 && Static406.anInt6924 > local27) {
				local69 = local21 * 512 + 256;
				local75 = local27 * 512 + 256;
				local77 = Static467.anInt7971;
				if (local77 < 3 && Static190.method3051(local27, local21)) {
					local77++;
				}
				@Pc(110) Class23_Sub2_Sub1_Sub5 local110 = new Class23_Sub2_Sub1_Sub5(local31, local39, Static621.anInt9665, Static467.anInt7971, local77, local69, Static194.method5133(local69, local75, Static467.anInt7971) - local35, local75, local21, local21, local27, local27, local43);
				Static514.aClass193_56.method4462(new Class3_Sub6_Sub17(local110));
			}
		} else if (Static312.aClass201_14 == arg0) {
			local12 = Static67.aClass3_Sub17_Sub2_4.method4884();
			local21 = Static67.aClass3_Sub17_Sub2_4.method4879();
			local27 = Static67.aClass3_Sub17_Sub2_4.method4844();
			local31 = Static212.anInt3897 + (local27 & 0x7);
			local35 = Static347.anInt7851 + local31;
			local39 = Static646.anInt9924 + (local27 >> 4 & 0x7);
			local43 = Static417.anInt7047 + local39;
			@Pc(187) boolean local187 = local39 >= 0 && local31 >= 0 && local39 < Static251.anInt4680 && local31 < Static406.anInt6924;
			if (local187 || Static208.method3294(Static176.anInt3321)) {
				Static146.method2529(local43, new Class3_Sub25(local21, local12), local35, Static467.anInt7971);
				if (local187) {
					Static263.method4141(local39, local31, Static467.anInt7971);
				}
			}
		} else {
			@Pc(276) int local276;
			@Pc(280) int local280;
			@Pc(284) int local284;
			@Pc(288) int local288;
			if (arg0 == Static261.aClass201_12) {
				local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
				@Pc(226) boolean local226 = (local12 & 0x80) != 0;
				local27 = (local12 >> 3 & 0x7) + Static646.anInt9924;
				local31 = (local12 & 0x7) + Static212.anInt3897;
				local35 = local27 + Static67.aClass3_Sub17_Sub2_4.method4861();
				local39 = Static67.aClass3_Sub17_Sub2_4.method4861() + local31;
				local43 = Static67.aClass3_Sub17_Sub2_4.method4869();
				local69 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local75 = Static67.aClass3_Sub17_Sub2_4.method4888() * 4;
				local77 = Static67.aClass3_Sub17_Sub2_4.method4888() * 4;
				local276 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local280 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local284 = Static67.aClass3_Sub17_Sub2_4.method4888();
				local288 = Static67.aClass3_Sub17_Sub2_4.method4858();
				if (local284 == 255) {
					local284 = -1;
				}
				if (local27 >= 0 && local31 >= 0 && local27 < Static251.anInt4680 && Static406.anInt6924 > local31 && local35 >= 0 && local39 >= 0 && local35 < Static251.anInt4680 && Static406.anInt6924 > local39 && local69 != 65535) {
					local39 = local39 * 512 + 256;
					local27 = local27 * 512 + 256;
					local77 <<= 0x2;
					local75 <<= 0x2;
					local35 = local35 * 512 + 256;
					local288 <<= 0x2;
					local31 = local31 * 512 + 256;
					@Pc(388) Class23_Sub2_Sub1_Sub1 local388 = new Class23_Sub2_Sub1_Sub1(local69, Static467.anInt7971, Static467.anInt7971, local27, local31, local75, Static621.anInt9665 + local276, Static621.anInt9665 + local280, local284, local288, 0, local43, local77, local226, -1);
					local388.method923(local39, local276 + Static621.anInt9665, Static194.method5133(local35, local39, Static467.anInt7971) - local77, local35);
					Static607.aClass193_65.method4462(new Class3_Sub6_Sub15(local388));
				}
			} else {
				@Pc(574) int local574;
				@Pc(599) int local599;
				if (Static384.aClass201_6 == arg0) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4844();
					local21 = Static67.aClass3_Sub17_Sub2_4.method4850();
					local27 = Static646.anInt9924 + (local21 >> 4 & 0x7);
					local31 = Static212.anInt3897 + (local21 & 0x7);
					local35 = Static67.aClass3_Sub17_Sub2_4.method4884();
					@Pc(447) Class178 local447 = Static349.aClass374_2.method8357(local35);
					local43 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local69 = local43 >> 2;
					local75 = Static326.anIntArray387[local69];
					if (local69 == 11) {
						local69 = 10;
					}
					local77 = 0;
					if (local447.aByteArray41 != null) {
						local276 = -1;
						for (local280 = 0; local280 < local447.aByteArray41.length; local280++) {
							if (local447.aByteArray41[local280] == local69) {
								local276 = local280;
								break;
							}
						}
						local77 = local447.anIntArrayArray48[local276].length;
					}
					local276 = 0;
					if (local447.aShortArray105 != null) {
						local276 = local447.aShortArray105.length;
					}
					local280 = 0;
					if (local447.aShortArray106 != null) {
						local280 = local447.aShortArray106.length;
					}
					if ((local12 & 0x1) == 1) {
						Static33.method1062(local31, (Class81) null, local27, local75, Static467.anInt7971);
					} else {
						@Pc(534) int[] local534 = null;
						if ((local12 & 0x2) == 2) {
							local534 = new int[local77];
							for (local288 = 0; local288 < local77; local288++) {
								local534[local288] = Static67.aClass3_Sub17_Sub2_4.method4858();
							}
						}
						@Pc(564) short[] local564 = null;
						if ((local12 & 0x4) == 4) {
							local564 = new short[local276];
							for (local574 = 0; local574 < local276; local574++) {
								local564[local574] = (short) Static67.aClass3_Sub17_Sub2_4.method4858();
							}
						}
						@Pc(589) short[] local589 = null;
						if ((local12 & 0x8) == 8) {
							local589 = new short[local280];
							for (local599 = 0; local599 < local280; local599++) {
								local589[local599] = (short) Static67.aClass3_Sub17_Sub2_4.method4858();
							}
						}
						Static33.method1062(local31, new Class81((long) Static429.aLong210++, local534, local564, local589), local27, local75, Static467.anInt7971);
					}
				} else if (Static13.aClass201_1 == arg0) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4872();
					local21 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local27 = Static212.anInt3897 + (local21 & 0x7);
					local31 = local27 + Static347.anInt7851;
					local35 = Static646.anInt9924 + (local21 >> 4 & 0x7);
					local39 = Static417.anInt7047 + local35;
					@Pc(687) Class3_Sub24 local687 = (Class3_Sub24) Static421.aClass62_32.method1682((long) (local31 << 14 | Static467.anInt7971 << 28 | local39));
					if (local687 != null) {
						for (@Pc(695) Class3_Sub25 local695 = (Class3_Sub25) local687.aClass193_26.method4457(); local695 != null; local695 = (Class3_Sub25) local687.aClass193_26.method4459()) {
							if (local695.anInt4451 == (local12 & 0x7FFF)) {
								local695.method8770();
								break;
							}
						}
						if (local687.aClass193_26.method4454()) {
							local687.method8770();
						}
						if (local35 >= 0 && local27 >= 0 && Static251.anInt4680 > local35 && local27 < Static406.anInt6924) {
							Static263.method4141(local35, local27, Static467.anInt7971);
						}
					}
				} else if (arg0 == Static197.aClass201_8) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local21 = (local12 >> 4 & 0xF) + Static646.anInt9924 * 2;
					local27 = Static212.anInt3897 * 2 + (local12 & 0xF);
					local31 = Static67.aClass3_Sub17_Sub2_4.method4888();
					@Pc(792) boolean local792 = (local31 & 0x1) != 0;
					@Pc(803) boolean local803 = (local31 & 0x2) != 0;
					local43 = local803 ? local31 >> 2 : -1;
					local69 = local21 + Static67.aClass3_Sub17_Sub2_4.method4861();
					local75 = Static67.aClass3_Sub17_Sub2_4.method4861() + local27;
					local77 = Static67.aClass3_Sub17_Sub2_4.method4869();
					local276 = Static67.aClass3_Sub17_Sub2_4.method4869();
					local280 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local284 = Static67.aClass3_Sub17_Sub2_4.method4888();
					if (local803) {
						local284 = (byte) local284;
					} else {
						local284 *= 4;
					}
					local288 = Static67.aClass3_Sub17_Sub2_4.method4888() * 4;
					local574 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local599 = Static67.aClass3_Sub17_Sub2_4.method4858();
					@Pc(868) int local868 = Static67.aClass3_Sub17_Sub2_4.method4888();
					if (local868 == 255) {
						local868 = -1;
					}
					@Pc(879) int local879 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local21 >= 0 && local27 >= 0 && local21 < Static251.anInt4680 * 2 && local27 < Static251.anInt4680 * 2 && local69 >= 0 && local75 >= 0 && local69 < Static406.anInt6924 * 2 && local75 < Static406.anInt6924 * 2 && local280 != 65535) {
						local284 <<= 0x2;
						local69 *= 256;
						local75 *= 256;
						local288 <<= 0x2;
						local27 *= 256;
						local21 = local21 * 256;
						local879 <<= 0x2;
						if (local77 != 0 && local43 != -1) {
							@Pc(966) Class23_Sub2_Sub1_Sub2 local966 = null;
							@Pc(973) int local973;
							if (local77 < 0) {
								local973 = -local77 - 1;
								if (local973 == Static251.anInt4687) {
									local966 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2;
								} else {
									local966 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local973];
								}
							} else {
								local973 = local77 - 1;
								@Pc(999) Class3_Sub11 local999 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local973);
								if (local999 != null) {
									local966 = local999.aClass23_Sub2_Sub1_Sub2_Sub2_1;
								}
							}
							if (local966 != null) {
								@Pc(1010) Class351 local1010 = local966.method8630();
								if (local1010.anIntArrayArray99 != null && local1010.anIntArrayArray99[local43] != null) {
									local284 -= local1010.anIntArrayArray99[local43][1];
								}
								if (local1010.anIntArrayArray98 != null && local1010.anIntArrayArray98[local43] != null) {
									local284 -= local1010.anIntArrayArray98[local43][1];
								}
							}
						}
						@Pc(1067) Class23_Sub2_Sub1_Sub1 local1067 = new Class23_Sub2_Sub1_Sub1(local280, Static467.anInt7971, Static467.anInt7971, local21, local27, local284, local574 + Static621.anInt9665, Static621.anInt9665 + local599, local868, local879, local77, local276, local288, local792, local43);
						local1067.method923(local75, local574 + Static621.anInt9665, -local288 + Static194.method5133(local69, local75, Static467.anInt7971), local69);
						Static607.aClass193_65.method4462(new Class3_Sub6_Sub15(local1067));
					}
				} else if (Static198.aClass201_9 == arg0) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4872();
					local21 = Static67.aClass3_Sub17_Sub2_4.method4872();
					local27 = Static67.aClass3_Sub17_Sub2_4.method4884();
					local31 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local35 = Static212.anInt3897 + (local31 & 0x7);
					local39 = Static347.anInt7851 + local35;
					local43 = Static646.anInt9924 + (local31 >> 4 & 0x7);
					local69 = Static417.anInt7047 + local43;
					if (local21 != Static251.anInt4687) {
						@Pc(1162) boolean local1162 = local43 >= 0 && local35 >= 0 && Static251.anInt4680 > local43 && Static406.anInt6924 > local35;
						if (local1162 || Static208.method3294(Static176.anInt3321)) {
							Static146.method2529(local69, new Class3_Sub25(local27, local12), local39, Static467.anInt7971);
							if (local1162) {
								Static263.method4141(local43, local35, Static467.anInt7971);
							}
						}
					}
				} else if (arg0 == Static600.aClass201_22) {
					Static67.aClass3_Sub17_Sub2_4.method4888();
					local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local21 = (local12 >> 4 & 0x7) + Static646.anInt9924;
					local27 = Static212.anInt3897 + (local12 & 0x7);
					local31 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local35 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local39 = Static67.aClass3_Sub17_Sub2_4.method4862();
					@Pc(1228) String local1228 = Static67.aClass3_Sub17_Sub2_4.method4847();
					Static422.method6014(local31, local35, local21, local27, local39, local1228, Static467.anInt7971);
				} else if (arg0 == Static350.aClass201_16) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local21 = Static212.anInt3897 + (local12 & 0x7);
					local27 = Static347.anInt7851 + local21;
					local31 = Static646.anInt9924 + (local12 >> 4 & 0x7);
					local35 = local31 + Static417.anInt7047;
					local39 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local43 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local69 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (Static421.aClass62_32 != null) {
						@Pc(1297) Class3_Sub24 local1297 = (Class3_Sub24) Static421.aClass62_32.method1682((long) (local35 | Static467.anInt7971 << 28 | local27 << 14));
						if (local1297 != null) {
							for (@Pc(1305) Class3_Sub25 local1305 = (Class3_Sub25) local1297.aClass193_26.method4457(); local1305 != null; local1305 = (Class3_Sub25) local1297.aClass193_26.method4459()) {
								if (local1305.anInt4451 == (local39 & 0x7FFF) && local1305.anInt4450 == local43) {
									local1305.method8770();
									local1305.anInt4450 = local69;
									Static146.method2529(local35, local1305, local27, Static467.anInt7971);
									break;
								}
							}
							if (local31 >= 0 && local21 >= 0 && local31 < Static251.anInt4680 && Static406.anInt6924 > local21) {
								Static263.method4141(local31, local21, Static467.anInt7971);
							}
						}
					}
				} else if (arg0 == Static249.aClass201_11) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4874();
					local21 = Static646.anInt9924 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static212.anInt3897;
					local31 = Static67.aClass3_Sub17_Sub2_4.method4844();
					local35 = local31 >> 2;
					local39 = local31 & 0x3;
					local43 = Static326.anIntArray387[local35];
					if (Static208.method3294(Static176.anInt3321) || local21 >= 0 && local27 >= 0 && Static251.anInt4680 > local21 && local27 < Static406.anInt6924) {
						Static471.method8501(local35, local39, Static467.anInt7971, local27, local43, local21, -1);
					}
				} else if (arg0 == Static569.aClass201_19) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local21 = Static646.anInt9924 + (local12 >> 4 & 0x7);
					local27 = Static212.anInt3897 + (local12 & 0x7);
					local31 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local31 == 65535) {
						local31 = -1;
					}
					local35 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local39 = local35 >> 4 & 0xF;
					local43 = local35 & 0x7;
					local69 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local75 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local77 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local21 >= 0 && local27 >= 0 && Static251.anInt4680 > local21 && Static406.anInt6924 > local27) {
						local276 = local39 + 1;
						if (local21 - local276 <= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] && local276 + local21 >= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] && local27 - local276 <= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] <= local27 + local276) {
							Static206.method3268(local39 + (local21 << 16) + (Static467.anInt7971 << 24) + (local27 << 8), local69, local43, local31, local75, local77);
						}
					}
				} else if (Static211.aClass201_23 == arg0) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4879();
					local21 = Static67.aClass3_Sub17_Sub2_4.method4850();
					local27 = Static646.anInt9924 + (local21 >> 4 & 0x7);
					local31 = (local21 & 0x7) + Static212.anInt3897;
					local35 = Static67.aClass3_Sub17_Sub2_4.method4850();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local69 = Static326.anIntArray387[local39];
					if (Static208.method3294(Static176.anInt3321) || local27 >= 0 && local31 >= 0 && Static251.anInt4680 > local27 && local31 < Static406.anInt6924) {
						Static471.method8501(local39, local43, Static467.anInt7971, local31, local69, local27, local12);
					}
				} else if (arg0 == Static320.aClass201_15) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local21 = Static646.anInt9924 + (local12 >> 4 & 0x7);
					local27 = Static212.anInt3897 + (local12 & 0x7);
					local31 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local31 == 65535) {
						local31 = -1;
					}
					local35 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local39 = local35 >> 4 & 0xF;
					local43 = local35 & 0x7;
					local69 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local75 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local77 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if (local21 >= 0 && local27 >= 0 && local21 < Static251.anInt4680 && local27 < Static406.anInt6924) {
						local276 = local39 + 1;
						if (local21 - local276 <= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] <= local276 + local21 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] >= local27 - local276 && local276 + local27 >= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0]) {
							Static505.method7159(local77, local39 + (local21 << 16) + (Static467.anInt7971 << 24) + (local27 << 8), local31, local75, local69, local43);
						}
					}
				} else if (arg0 == Static631.aClass201_21) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4872();
					if (local12 == 65535) {
						local12 = -1;
					}
					local21 = Static67.aClass3_Sub17_Sub2_4.method4888();
					local27 = (local21 >> 4 & 0x7) + Static646.anInt9924;
					local31 = (local21 & 0x7) + Static212.anInt3897;
					local35 = Static67.aClass3_Sub17_Sub2_4.method4874();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local69 = Static326.anIntArray387[local39];
					Static658.method8566(local27, Static467.anInt7971, local69, local43, local39, local12, local31);
				} else if (Static300.aClass201_13 == arg0) {
					local12 = Static67.aClass3_Sub17_Sub2_4.method4858();
					local21 = Static67.aClass3_Sub17_Sub2_4.method4888();
					Static349.aClass374_2.method8357(local12).method4016(local21);
				} else {
					Static81.method1711("T3 - " + arg0, (Throwable) null);
					Static431.method6362(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([BII)[B")
	public static byte[] method8556(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = new byte[arg1];
		Static689.method8055(arg0, 0, local12, 0, arg1);
		return local12;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
	public static void method8557() {
		@Pc(7) int local7 = Static187.anInt3432;
		@Pc(9) int[] local9 = Static668.anIntArray664;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class23_Sub2_Sub1_Sub2_Sub1 local24 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local9[local16]];
			if (local24 != null) {
				Static249.method3942(local24.method8625(), local24);
			}
		}
	}
}
