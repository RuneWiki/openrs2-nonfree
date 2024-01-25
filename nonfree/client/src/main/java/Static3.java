import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!ir;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method27() {
		Static231.aFont1 = null;
		Static156.anImage2 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
	public static int method28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static245.anIntArrayArray46 == null ? 0 : Static245.anIntArrayArray46[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!tj;B)V")
	public static void method32(@OriginalArg(0) Class122 arg0) {
		if (Static192.anInt4000 < 0 || Static221.anInt4562 < 0 || Static237.anInt4732 == 0 || Static260.anInt5199 == 0) {
			return;
		}
		arg0.method4772(Static164.anInt6260, Static279.anInt5572, Static237.anInt4732, Static260.anInt5199);
		arg0.method4768(Static20.anInt549, Static97.anInt2040, Static237.anInt4732, Static260.anInt5199);
		@Pc(38) Class56 local38 = arg0.method4743();
		local38.method4684(Static348.anInt6763, Static69.anInt1411, Static261.anInt5250, Static61.anInt1282, Static169.anInt3575, Static306.anInt6053);
		arg0.method4785(local38);
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (Static235.anInt4719 == 0 && Static355.aClass22Array3 != null) {
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(67) int local67 = arg0.method4795();
			local76 = (Static192.anInt4000 - Static164.anInt6260) * local67 / Static237.anInt4732;
			local85 = local67 * (Static221.anInt4562 - Static279.anInt5572) / Static260.anInt5199;
			local88 = arg0.method4776();
			local96 = (Static192.anInt4000 - Static164.anInt6260) * local88 / Static237.anInt4732;
			local105 = (Static221.anInt4562 - Static279.anInt5572) * local88 / Static260.anInt5199;
			@Pc(120) int[] local120 = new int[] { local76, local85, local67 };
			local38.method4692(local120);
			@Pc(138) int[] local138 = new int[] { local96, local105, local88 };
			local38.method4692(local138);
			@Pc(143) float local143 = 0.0F;
			@Pc(152) int local152 = local138[0] - local120[0];
			@Pc(160) int local160 = local138[1] - local120[1];
			@Pc(169) int local169 = local138[2] - local120[2];
			while (local143 < 1.0F) {
				@Pc(182) int local182 = (int) ((float) local120[0] + local143 * (float) local152);
				@Pc(186) int local186 = local182 >> 7;
				@Pc(197) int local197 = (int) ((float) local120[2] + local143 * (float) local169);
				@Pc(201) int local201 = local197 >> 7;
				if (local186 > 0 && local201 > 0 && Static162.anInt2152 > local186 && local201 < Static122.anInt2632) {
					@Pc(224) int local224 = Static163.anInt3184;
					if (local224 < 3 && (Static160.aByteArrayArrayArray9[1][local186][local201] & 0x2) != 0) {
						local224++;
					}
					if ((float) Static355.aClass22Array3[local224].method4678(local182, local197) < (float) local120[1] + local143 * (float) local160) {
						local62 = (Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() - 1) * 64 + local182 >> 7;
						local64 = local197 + (Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() - 1) * 64 >> 7;
						break;
					}
				}
				local143 = (float) ((double) local143 + 0.01D);
			}
			if (local62 != -1 && local64 != -1) {
				if (Static155.aBoolean96 && (Static299.anInt5948 & 0x40) != 0) {
					@Pc(343) Class181 local343 = Static214.method3735(Static203.anInt4169, Static147.anInt2908);
					if (local343 == null) {
						Static345.method5626();
					} else {
						Static271.method4580(local64, Static303.aString199, " ->", Static244.anInt4838, 0L, local62, 9);
					}
				} else {
					if (Static309.anInt6133 == 1) {
						Static271.method4580(local64, Static153.aString113, "", -1, 0L, local62, 14);
					}
					Static271.method4580(local64, Static340.aString251, "", -1, 0L, local62, 25);
				}
			}
		}
		@Pc(360) Class65 local360 = Static35.aClass65_5;
		for (@Pc(365) Class8_Sub7 local365 = (Class8_Sub7) local360.method1462(); local365 != null; local365 = (Class8_Sub7) local360.method1461()) {
			if (local365.method4550(Static192.anInt4000, arg0, Static221.anInt4562) && Static163.anInt3184 == local365.anInt5412) {
				@Pc(492) int local492;
				@Pc(503) int local503;
				if (local365.aClass5_1 instanceof Class5_Sub4_Sub4_Sub1) {
					@Pc(390) Class5_Sub4_Sub4_Sub1 local390 = (Class5_Sub4_Sub4_Sub1) local365.aClass5_1;
					local76 = local390.method4208();
					if ((local76 & 0x1) == 0 && (local390.anInt5901 & 0x7F) == 0 && (local390.anInt5905 & 0x7F) == 0 || (local76 & 0x1) == 1 && (local390.anInt5901 & 0x7F) == 64 && (local390.anInt5905 & 0x7F) == 64) {
						local85 = local390.anInt5901 - (local390.method4208() - 1) * 64;
						local88 = local390.anInt5905 + 64 - local390.method4208() * 64;
						for (local96 = 0; local96 < Static42.anInt897; local96++) {
							@Pc(466) Class5_Sub4_Sub4_Sub2 local466 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local96]];
							if (local466 != null && local466.anInt4914 != Static51.anInt1101 && local466.aBoolean282) {
								local492 = local466.anInt5901 - (local466.aClass119_1.anInt3645 - 1) * 64;
								local503 = local466.anInt5905 + 64 - local466.aClass119_1.anInt3645 * 64;
								if (local492 >= local85 && local466.aClass119_1.anInt3645 <= local390.method4208() - (local492 - local85 >> 7) && local503 >= local88 && local466.aClass119_1.anInt3645 <= local390.method4208() - (local503 - local88 >> 7)) {
									Static77.method1166(local466);
									local466.anInt4914 = Static51.anInt1101;
								}
							}
						}
						for (local105 = 0; local105 < Static170.anInt6275; local105++) {
							@Pc(563) Class5_Sub4_Sub4_Sub1 local563 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local105]];
							if (local563 != null && local563.anInt4914 != Static51.anInt1101 && local390 != local563 && local563.aBoolean282) {
								local503 = local563.anInt5901 + 64 - local563.method4208() * 64;
								@Pc(599) int local599 = local563.anInt5905 + 64 - local563.method4208() * 64;
								if (local503 >= local85 && local563.method4208() <= local390.method4208() - (local503 - local85 >> 7) && local599 >= local88 && local563.method4208() <= local390.method4208() - (local599 - local88 >> 7)) {
									Static277.method4639(local563);
									local563.anInt4914 = Static51.anInt1101;
								}
							}
						}
					}
					if (local390.anInt4914 == Static51.anInt1101) {
						continue;
					}
					Static277.method4639(local390);
					local390.anInt4914 = Static51.anInt1101;
				}
				if (local365.aClass5_1 instanceof Class5_Sub4_Sub4_Sub2) {
					@Pc(665) Class5_Sub4_Sub4_Sub2 local665 = (Class5_Sub4_Sub4_Sub2) local365.aClass5_1;
					if (local665.aClass119_1 != null) {
						if ((local665.aClass119_1.anInt3645 & 0x1) == 0 && (local665.anInt5901 & 0x7F) == 0 && (local665.anInt5905 & 0x7F) == 0 || (local665.aClass119_1.anInt3645 & 0x1) == 1 && (local665.anInt5901 & 0x7F) == 64 && (local665.anInt5905 & 0x7F) == 64) {
							local76 = local665.anInt5901 + 64 - local665.aClass119_1.anInt3645 * 64;
							local85 = local665.anInt5905 + 64 - local665.aClass119_1.anInt3645 * 64;
							for (local88 = 0; local88 < Static42.anInt897; local88++) {
								@Pc(748) Class5_Sub4_Sub4_Sub2 local748 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local88]];
								if (local748 != null && local748.anInt4914 != Static51.anInt1101 && local665 != local748 && local748.aBoolean282) {
									local105 = local748.anInt5901 + 64 - local748.aClass119_1.anInt3645 * 64;
									local492 = local748.anInt5905 - (local748.aClass119_1.anInt3645 - 1) * 64;
									if (local76 <= local105 && local748.aClass119_1.anInt3645 <= local665.aClass119_1.anInt3645 - (local105 - local76 >> 7) && local85 <= local492 && local665.aClass119_1.anInt3645 - (local492 - local85 >> 7) >= local748.aClass119_1.anInt3645) {
										Static77.method1166(local748);
										local748.anInt4914 = Static51.anInt1101;
									}
								}
							}
							for (local96 = 0; local96 < Static170.anInt6275; local96++) {
								@Pc(851) Class5_Sub4_Sub4_Sub1 local851 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local96]];
								if (local851 != null && local851.anInt4914 != Static51.anInt1101 && local851.aBoolean282) {
									local492 = local851.anInt5901 - (local851.method4208() - 1) * 64;
									local503 = local851.anInt5905 - (local851.method4208() - 1) * 64;
									if (local76 <= local492 && local851.method4208() <= local665.aClass119_1.anInt3645 - (local492 - local76 >> 7) && local85 <= local503 && local851.method4208() <= local665.aClass119_1.anInt3645 - (local503 - local85 >> 7)) {
										Static277.method4639(local851);
										local851.anInt4914 = Static51.anInt1101;
									}
								}
							}
						}
						if (local665.anInt4914 == Static51.anInt1101) {
							continue;
						}
						Static77.method1166(local665);
						local665.anInt4914 = Static51.anInt1101;
					}
				}
				if (local365.aClass5_1 instanceof Class5_Sub2_Sub1) {
					@Pc(984) Class3_Sub40 local984 = (Class3_Sub40) Static128.aClass24_18.method609((long) (local365.anInt5409 | local365.anInt5412 << 28 | local365.anInt5411 << 14));
					if (local984 != null) {
						for (@Pc(992) Class3_Sub38 local992 = (Class3_Sub38) local984.aClass127_41.method3391(); local992 != null; local992 = (Class3_Sub38) local984.aClass127_41.method3389()) {
							@Pc(999) Class41 local999 = Static230.method5537(local992.anInt5434);
							if (Static235.anInt4719 == 1) {
								Static271.method4580(local365.anInt5411, Static87.aString57, Static200.aString156 + " -> <col=ff9040>" + local999.aString36, Static274.anInt5908, (long) local992.anInt5434, local365.anInt5409, 46);
							} else if (Static155.aBoolean96) {
								@Pc(1162) Class3_Sub7_Sub4 local1162 = Static58.anInt1273 == -1 ? null : Static11.method177(Static58.anInt1273);
								if ((Static299.anInt5948 & 0x1) != 0 && (local1162 == null || local999.method926(Static58.anInt1273, local1162.anInt808) != local1162.anInt808)) {
									Static271.method4580(local365.anInt5411, Static303.aString199, Static309.aString229 + " -> <col=ff9040>" + local999.aString36, Static244.anInt4838, (long) local992.anInt5434, local365.anInt5409, 17);
								}
							} else {
								@Pc(1038) String[] local1038 = local999.aStringArray8;
								for (local96 = 4; local96 >= 0; local96--) {
									if (local1038 != null && local1038[local96] != null) {
										@Pc(1050) byte local1050 = 0;
										if (local96 == 0) {
											local1050 = 7;
										}
										local492 = Static298.anInt5938;
										if (local96 == 1) {
											local1050 = 10;
										}
										if (local96 == 2) {
											local1050 = 39;
										}
										if (local96 == 3) {
											local1050 = 19;
										}
										if (local96 == 4) {
											local1050 = 18;
										}
										if (local96 == local999.anInt1208) {
											local492 = local999.anInt1219;
										}
										if (local999.anInt1215 == local96) {
											local492 = local999.anInt1196;
										}
										Static271.method4580(local365.anInt5411, local1038[local96], "<col=ff9040>" + local999.aString36, local492, (long) local992.anInt5434, local365.anInt5409, local1050);
									}
								}
								Static271.method4580(local365.anInt5411, Static334.aString243, "<col=ff9040>" + local999.aString36, Static344.anInt6694, (long) local992.anInt5434, local365.anInt5409, 1005);
							}
						}
					}
				}
				if (local365.aClass5_1 instanceof Interface5) {
					@Pc(1227) Interface5 local1227 = (Interface5) local365.aClass5_1;
					@Pc(1233) Class170 local1233 = Static268.method4553(local1227.method5344());
					if (local1233.anIntArray424 != null) {
						local1233 = local1233.method4398();
					}
					if (local1233 != null) {
						if (Static235.anInt4719 == 1) {
							Static271.method4580(local365.anInt5411, Static87.aString57, Static200.aString156 + " -> <col=00ffff>" + local1233.aString187, Static274.anInt5908, Static291.method4969(local365.anInt5409, local1227, local365.anInt5411), local365.anInt5409, 32);
						} else if (Static155.aBoolean96) {
							@Pc(1257) Class3_Sub7_Sub4 local1257 = Static58.anInt1273 == -1 ? null : Static11.method177(Static58.anInt1273);
							if ((Static299.anInt5948 & 0x4) != 0 && (local1257 == null || local1233.method4406(local1257.anInt808, Static58.anInt1273) != local1257.anInt808)) {
								Static271.method4580(local365.anInt5411, Static303.aString199, Static309.aString229 + " -> <col=00ffff>" + local1233.aString187, Static244.anInt4838, Static291.method4969(local365.anInt5409, local1227, local365.anInt5411), local365.anInt5409, 28);
							}
						} else {
							@Pc(1315) String[] local1315 = local1233.aStringArray33;
							if (local1315 != null) {
								for (local88 = 4; local88 >= 0; local88--) {
									if (local1315[local88] != null) {
										@Pc(1327) short local1327 = 0;
										local105 = Static298.anInt5938;
										if (local88 == 0) {
											local1327 = 29;
										}
										if (local88 == 1) {
											local1327 = 40;
										}
										if (local88 == 2) {
											local1327 = 38;
										}
										if (local88 == 3) {
											local1327 = 44;
										}
										if (local88 == local1233.anInt5237) {
											local105 = local1233.anInt5244;
										}
										if (local88 == 4) {
											local1327 = 1003;
										}
										if (local88 == local1233.anInt5210) {
											local105 = local1233.anInt5222;
										}
										Static271.method4580(local365.anInt5411, local1315[local88], "<col=00ffff>" + local1233.aString187, local105, Static291.method4969(local365.anInt5409, local1227, local365.anInt5411), local365.anInt5409, local1327);
									}
								}
							}
							Static271.method4580(local365.anInt5411, Static334.aString243, "<col=00ffff>" + local1233.aString187, Static344.anInt6694, (long) local1233.anInt5232, local365.anInt5409, 1011);
						}
					}
				}
			}
		}
	}
}
