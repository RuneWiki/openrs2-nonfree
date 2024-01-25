import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "[J")
	public static long[] aLongArray13;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "Lclient!al;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!oa;B)V")
	public static void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static332.anInt6027 == 0 || Static108.anInt2079 == 0) {
			return;
		}
		arg2.m(Static138.anInt3087, Static44.anInt1027, Static332.anInt6027, Static108.anInt2079);
		arg2.ca(Static35.anInt1964, Static220.anInt4394, Static332.anInt6027, Static108.anInt2079);
		@Pc(35) Class54 local35 = arg2.method6882();
		local35.pa(Static589.anInt9568, Static178.anInt3724, Static249.anInt4926, Static444.anInt7710, Static21.anInt688, Static362.anInt6348);
		arg2.method6829(local35);
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(93) int local93;
		@Pc(108) int[] local108;
		@Pc(126) int[] local126;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(156) int local156;
		if (Static273.aClass59Array4 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(55) int local55 = arg2.U();
			local64 = local55 * (arg1 - Static138.anInt3087) / Static332.anInt6027;
			local73 = (arg0 - Static44.anInt1027) * local55 / Static108.anInt2079;
			local76 = arg2.IA();
			local85 = local76 * (arg1 - Static138.anInt3087) / Static332.anInt6027;
			local93 = local76 * (arg0 - Static44.anInt1027) / Static108.anInt2079;
			local108 = new int[] { local64, local73, local55 };
			local35.O(local108);
			local126 = new int[] { local85, local93, local76 };
			local35.O(local126);
			@Pc(131) float local131 = 0.0F;
			local139 = local126[0] - local108[0];
			local147 = local126[1] - local108[1];
			local156 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				@Pc(169) int local169 = (int) ((float) local139 * local131 + (float) local108[0]);
				@Pc(173) int local173 = local169 >> 9;
				@Pc(184) int local184 = (int) (local131 * (float) local156 + (float) local108[2]);
				@Pc(188) int local188 = local184 >> 9;
				if (local173 > 0 && local188 > 0 && local173 < Static473.anInt8075 && local188 < Static165.anInt6749) {
					@Pc(208) int local208 = Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108;
					if (local208 < 3 && (Static154.aByteArrayArrayArray4[1][local173][local188] & 0x2) != 0) {
						local208++;
					}
					if ((float) Static273.aClass59Array4[local208].sa(local169, local184) < (float) local108[1] + local131 * (float) local147) {
						local50 = local169 + (Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() - 1 << 8) >> 9;
						local52 = (Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() - 1 << 8) + local184 >> 9;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static199.aBoolean458 && (Static348.anInt6222 & 0x40) != 0) {
					@Pc(337) Class292 local337 = Static391.method5747(Static593.anInt9601, Static115.anInt2199);
					if (local337 == null) {
						Static489.method6689();
					} else {
						Static142.method7766(false, true, -1, 45, Static104.aString16, 0L, " ->", local52, Static209.anInt4228, local50);
					}
				} else {
					if (Static317.aClass37_3 == Static255.aClass37_2) {
						Static142.method7766(false, true, -1, 8, Static230.aClass156_26.method4065(Static25.anInt769), 0L, "", local52, -1, local50);
					}
					Static142.method7766(false, true, -1, 9, Static356.aString47, 0L, "", local52, Static543.anInt8952, local50);
				}
			}
		}
		@Pc(365) Class40 local365 = Static98.aClass40_2;
		for (@Pc(370) Class98_Sub8 local370 = (Class98_Sub8) local365.method1132(); local370 != null; local370 = (Class98_Sub8) local365.method1129()) {
			if ((Static6.aBoolean275 || Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local370.anInt9635) && local370.method7858(arg0, arg1, arg2)) {
				@Pc(578) int local578;
				@Pc(500) int local500;
				if (local370.aClass4_1 instanceof Class4_Sub1_Sub1_Sub2) {
					@Pc(394) Class4_Sub1_Sub1_Sub2 local394 = (Class4_Sub1_Sub1_Sub2) local370.aClass4_1;
					local73 = local394.method5892();
					if ((local73 & 0x1) == 0 && (local394.anInt9542 & 0x1FF) == 0 && (local394.anInt9540 & 0x1FF) == 0 || (local73 & 0x1) == 1 && (local394.anInt9542 & 0x1FF) == 256 && (local394.anInt9540 & 0x1FF) == 256) {
						local76 = local394.anInt9542 - (local394.method5892() - 1 << 8);
						local85 = local394.anInt9540 - (local394.method5892() - 1 << 8);
						for (local93 = 0; local93 < Static464.anInt7995; local93++) {
							@Pc(474) Class6_Sub34 local474 = (Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local93]);
							if (local474 != null) {
								@Pc(479) Class4_Sub1_Sub1_Sub1 local479 = local474.aClass4_Sub1_Sub1_Sub1_2;
								if (local479.anInt7064 != Static312.anInt5688 && local479.aBoolean493) {
									local500 = local479.anInt9542 - (local479.aClass273_1.anInt7439 - 1 << 8);
									local139 = local479.anInt9540 - (local479.aClass273_1.anInt7439 - 1 << 8);
									if (local500 >= local76 && local479.aClass273_1.anInt7439 <= local394.method5892() - (local500 - local76 >> 9) && local85 <= local139 && local479.aClass273_1.anInt7439 <= local394.method5892() - (local139 - local85 >> 9)) {
										Static314.method4916(local479, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635);
										local479.anInt7064 = Static312.anInt5688;
									}
								}
							}
						}
						local578 = Static231.anInt4727;
						local126 = Static249.anIntArray372;
						for (local500 = 0; local500 < local578; local500++) {
							@Pc(590) Class4_Sub1_Sub1_Sub2 local590 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local126[local500]];
							if (local590 != null && Static312.anInt5688 != local590.anInt7064 && local590 != local394 && local590.aBoolean493) {
								local147 = local590.anInt9542 - (local590.method5892() - 1 << 8);
								local156 = local590.anInt9540 - (local590.method5892() - 1 << 8);
								if (local76 <= local147 && local590.method5892() <= local394.method5892() - (local147 - local76 >> 9) && local156 >= local85 && local590.method5892() <= local394.method5892() - (local156 - local85 >> 9)) {
									Static362.method5433(local590, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635);
									local590.anInt7064 = Static312.anInt5688;
								}
							}
						}
					}
					if (Static312.anInt5688 == local394.anInt7064) {
						continue;
					}
					Static362.method5433(local394, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635);
					local394.anInt7064 = Static312.anInt5688;
				}
				@Pc(845) int local845;
				if (local370.aClass4_1 instanceof Class4_Sub1_Sub1_Sub1) {
					@Pc(726) Class4_Sub1_Sub1_Sub1 local726 = (Class4_Sub1_Sub1_Sub1) local370.aClass4_1;
					if (local726.aClass273_1 != null) {
						if ((local726.aClass273_1.anInt7439 & 0x1) == 0 && (local726.anInt9542 & 0x1FF) == 0 && (local726.anInt9540 & 0x1FF) == 0 || (local726.aClass273_1.anInt7439 & 0x1) == 1 && (local726.anInt9542 & 0x1FF) == 256 && (local726.anInt9540 & 0x1FF) == 256) {
							local73 = local726.anInt9542 - (local726.aClass273_1.anInt7439 - 1 << 8);
							local76 = local726.anInt9540 - (local726.aClass273_1.anInt7439 - 1 << 8);
							for (local85 = 0; local85 < Static464.anInt7995; local85++) {
								@Pc(812) Class6_Sub34 local812 = (Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local85]);
								if (local812 != null) {
									@Pc(817) Class4_Sub1_Sub1_Sub1 local817 = local812.aClass4_Sub1_Sub1_Sub1_2;
									if (local817.anInt7064 != Static312.anInt5688 && local726 != local817 && local817.aBoolean493) {
										local845 = local817.anInt9542 - (local817.aClass273_1.anInt7439 - 1 << 8);
										local500 = local817.anInt9540 - (local817.aClass273_1.anInt7439 - 1 << 8);
										if (local73 <= local845 && local726.aClass273_1.anInt7439 - (local845 - local73 >> 9) >= local817.aClass273_1.anInt7439 && local500 >= local76 && local817.aClass273_1.anInt7439 <= local726.aClass273_1.anInt7439 - (local500 - local76 >> 9)) {
											Static314.method4916(local817, local370.anInt9635 != Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108);
											local817.anInt7064 = Static312.anInt5688;
										}
									}
								}
							}
							local93 = Static231.anInt4727;
							local108 = Static249.anIntArray372;
							for (local845 = 0; local845 < local93; local845++) {
								@Pc(940) Class4_Sub1_Sub1_Sub2 local940 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local108[local845]];
								if (local940 != null && Static312.anInt5688 != local940.anInt7064 && local940.aBoolean493) {
									local139 = local940.anInt9542 - (local940.method5892() - 1 << 8);
									local147 = local940.anInt9540 - (local940.method5892() - 1 << 8);
									if (local139 >= local73 && local940.method5892() <= local726.aClass273_1.anInt7439 - (local139 - local73 >> 9) && local76 <= local147 && local940.method5892() <= local726.aClass273_1.anInt7439 - (local147 - local76 >> 9)) {
										Static362.method5433(local940, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635);
										local940.anInt7064 = Static312.anInt5688;
									}
								}
							}
						}
						if (Static312.anInt5688 == local726.anInt7064) {
							continue;
						}
						Static314.method4916(local726, local370.anInt9635 != Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108);
						local726.anInt7064 = Static312.anInt5688;
					}
				}
				if (local370.aClass4_1 instanceof Class4_Sub4_Sub1) {
					local64 = local370.anInt9634 + Static39.anInt4952;
					local73 = local370.anInt9631 + Static138.anInt3088;
					@Pc(1104) Class6_Sub51 local1104 = (Class6_Sub51) Static478.aClass128_40.method3263((long) (local370.anInt9635 << 28 | local73 << 14 | local64));
					if (local1104 != null) {
						for (@Pc(1112) Class6_Sub10 local1112 = (Class6_Sub10) local1104.aClass361_68.method7840(); local1112 != null; local1112 = (Class6_Sub10) local1104.aClass361_68.method7832()) {
							@Pc(1120) Class237 local1120 = Static444.aClass322_2.method7141(local1112.anInt1069);
							if (Static199.aBoolean458 && Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local370.anInt9635) {
								@Pc(1137) Class320 local1137 = Static592.anInt9588 == -1 ? null : Static577.aClass185_2.method4519(Static592.anInt9588);
								if ((Static348.anInt6222 & 0x1) != 0 && (local1137 == null || local1120.method5531(local1137.anInt8653, Static592.anInt9588) != local1137.anInt8653)) {
									Static142.method7766(false, true, -1, 46, Static104.aString16, (long) local1112.anInt1069, Static22.aString33 + " -> <col=ff9040>" + local1120.aString58, local370.anInt9631, Static209.anInt4228, local370.anInt9634);
								}
							}
							if (Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local370.anInt9635) {
								@Pc(1194) String[] local1194 = local1120.aStringArray26;
								for (local845 = 4; local845 >= 0; local845--) {
									if (local1194 != null && local1194[local845] != null) {
										@Pc(1206) byte local1206 = 0;
										if (local845 == 0) {
											local1206 = 21;
										}
										local139 = Static482.anInt8150;
										if (local845 == 1) {
											local1206 = 16;
										}
										if (local845 == 2) {
											local1206 = 49;
										}
										if (local845 == 3) {
											local1206 = 12;
										}
										if (local845 == 4) {
											local1206 = 18;
										}
										if (local1120.anInt6566 == local845) {
											local139 = local1120.anInt6532;
										}
										if (local845 == local1120.anInt6526) {
											local139 = local1120.anInt6546;
										}
										Static142.method7766(false, true, -1, local1206, local1194[local845], (long) local1112.anInt1069, "<col=ff9040>" + local1120.aString58, local370.anInt9631, local139, local370.anInt9634);
									}
								}
							}
							Static142.method7766(Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635, true, -1, 1009, Static230.aClass156_21.method4065(Static25.anInt769), (long) local1112.anInt1069, "<col=ff9040>" + local1120.aString58, local370.anInt9631, Static355.anInt7386, local370.anInt9634);
						}
					}
				}
				if (local370.aClass4_1 instanceof Interface18) {
					@Pc(1348) Interface18 local1348 = (Interface18) local370.aClass4_1;
					@Pc(1355) Class252 local1355 = Static412.aClass307_4.method6636(local1348.method6265());
					if (local1355.anIntArray506 != null) {
						local1355 = local1355.method5799(Static498.aClass101_1);
					}
					if (local1355 != null) {
						if (Static199.aBoolean458 && local370.anInt9635 == Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108) {
							@Pc(1386) Class320 local1386 = Static592.anInt9588 == -1 ? null : Static577.aClass185_2.method4519(Static592.anInt9588);
							if ((Static348.anInt6222 & 0x4) != 0 && (local1386 == null || local1355.method5798(local1386.anInt8653, Static592.anInt9588) != local1386.anInt8653)) {
								Static142.method7766(false, true, -1, 50, Static104.aString16, Static349.method5331(local1348, local370.anInt9634, local370.anInt9631), Static22.aString33 + " -> <col=00ffff>" + local1355.aString59, local370.anInt9631, Static209.anInt4228, local370.anInt9634);
							}
						}
						if (Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local370.anInt9635) {
							@Pc(1446) String[] local1446 = local1355.aStringArray28;
							if (local1446 != null) {
								for (local85 = 4; local85 >= 0; local85--) {
									if (local1446[local85] != null) {
										@Pc(1458) short local1458 = 0;
										if (local85 == 0) {
											local1458 = 23;
										}
										local578 = Static482.anInt8150;
										if (local85 == 1) {
											local1458 = 15;
										}
										if (local85 == 2) {
											local1458 = 20;
										}
										if (local85 == 3) {
											local1458 = 11;
										}
										if (local85 == local1355.anInt6922) {
											local578 = local1355.anInt6918;
										}
										if (local85 == 4) {
											local1458 = 1004;
										}
										if (local1355.anInt6912 == local85) {
											local578 = local1355.anInt6925;
										}
										Static142.method7766(false, true, -1, local1458, local1446[local85], Static349.method5331(local1348, local370.anInt9634, local370.anInt9631), "<col=00ffff>" + local1355.aString59, local370.anInt9631, local578, local370.anInt9634);
									}
								}
							}
						}
						Static142.method7766(Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 != local370.anInt9635, true, -1, 1011, Static230.aClass156_21.method4065(Static25.anInt769), (long) local1355.anInt6905, "<col=00ffff>" + local1355.aString59, local370.anInt9631, Static355.anInt7386, local370.anInt9634);
					}
				}
			}
		}
	}
}
