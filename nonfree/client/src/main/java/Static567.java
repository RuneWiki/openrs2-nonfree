import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "Lclient!wla;")
	public static Class405 aClass405_3;

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "[I")
	public static final int[] anIntArray518 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "Lclient!ak;")
	public static final Class13 aClass13_3 = new Class13(128);

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
	public static final int anInt9370 = 50;

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "[I")
	public static final int[] anIntArray519 = new int[anInt9370];

	@OriginalMember(owner = "client!rw", name = "M", descriptor = "[I")
	public static final int[] anIntArray520 = new int[anInt9370];

	@OriginalMember(owner = "client!rw", name = "O", descriptor = "[Lclient!jd;")
	public static final Class184[] aClass184Array1 = new Class184[anInt9370];

	@OriginalMember(owner = "client!rw", name = "N", descriptor = "[I")
	public static final int[] anIntArray521 = new int[anInt9370];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIBLclient!ha;)V")
	public static void method7891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static204.anInt3530 == 0 || Static599.anInt9769 == 0) {
			return;
		}
		@Pc(49) Class181 local49;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(62) int local62;
		if (Static178.aBoolean264) {
			Static443.method6437(false);
			local49 = arg2.method7683();
			@Pc(75) int[] local75 = arg2.Y();
			local36 = local75[0];
			local34 = local75[1];
			local40 = local75[2];
			local38 = local75[3];
			local64 = Static637.method8637(false) + arg1;
			local62 = arg0 + Static706.method9217(false);
		} else {
			arg2.DA(Static241.anInt4516, Static144.anInt2745, Static204.anInt3530, Static599.anInt9769);
			local34 = Static144.anInt2745;
			local36 = Static241.anInt4516;
			local38 = Static599.anInt9769;
			local40 = Static204.anInt3530;
			arg2.KA(Static518.anInt8817, Static139.anInt2622, Static204.anInt3530, Static599.anInt9769);
			local49 = arg2.method7646();
			local49.method6352(Static147.anInt2788, Static530.anInt8963, Static139.anInt2623, Static59.anInt933, Static454.anInt8007, Static714.anInt11139);
			arg2.method7642(local49);
			local62 = arg0;
			local64 = arg1;
		}
		if (local38 == 0) {
			local38 = 1;
		}
		Static624.method8446(true);
		if (local40 == 0) {
			local40 = 1;
		}
		@Pc(139) int local139;
		@Pc(168) int local168;
		@Pc(159) int local159;
		@Pc(276) int local276;
		@Pc(285) int local285;
		@Pc(296) int local296;
		@Pc(307) int local307;
		@Pc(131) int local131;
		@Pc(359) int local359;
		if (Static167.aClass313Array1 != null && (!Static212.aBoolean297 || (Static718.anInt11231 & 0x40) != 0)) {
			local131 = -1;
			@Pc(133) int local133 = -1;
			@Pc(136) int local136 = arg2.i();
			local139 = arg2.XA();
			@Pc(150) int local150;
			@Pc(176) int local176;
			if (Static568.aBoolean784) {
				local168 = local176 = Static705.anInt11029 * (local64 - local36) / local40;
				local150 = local159 = (local62 - local34) * Static705.anInt11029 / local38;
			} else {
				local150 = (local62 - local34) * local136 / local38;
				local159 = local139 * (local62 - local34) / local38;
				local168 = (local64 - local36) * local136 / local40;
				local176 = local139 * (local64 - local36) / local40;
			}
			@Pc(214) int[] local214 = new int[] { local168, local150, local136 };
			@Pc(229) int[] local229 = new int[] { local176, local159, local139 };
			local49.method6347(local214);
			local49.method6347(local229);
			@Pc(263) float local263 = Static535.method7524((float) local214[1], 4, (float) local229[2], (float) local214[2], (float) local229[1], (float) local229[0], (float) local214[0]);
			if (local263 > 0.0F) {
				local276 = local229[0] - local214[0];
				local285 = local229[2] - local214[2];
				local296 = (int) ((float) local276 * local263 + (float) local214[0]);
				local307 = (int) (local263 * (float) local285 + (float) local214[2]);
				local131 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() - 1 << 8) + local296 >> 9;
				local133 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() - 1 << 8) + local307 >> 9;
				@Pc(334) byte local334 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146;
				if (local334 < 3 && (Static6.aByteArrayArrayArray1[1][local296 >> 9][local307 >> 9] & 0x2) != 0) {
					local359 = local334 + 1;
				}
			}
			if (local131 != -1 && local133 != -1) {
				if (Static212.aBoolean297 && (Static718.anInt11231 & 0x40) != 0) {
					@Pc(388) Class20 local388 = Static244.method3731(Static397.anInt7112, Static198.anInt3491);
					if (local388 == null) {
						Static427.method6535();
					} else {
						Static91.method1249(Static27.anInt421, Static177.aString97, 0L, (long) (local131 << 0 | local133), 57, local133, false, true, local131, " ->", true, -1);
					}
				} else {
					if (Static168.aBoolean770) {
						Static91.method1249(-1, Static476.aClass279_27.method6992(Static141.anInt2658), 0L, (long) (local133 | local131 << 0), 49, local133, false, true, local131, "", true, -1);
					}
					Static91.method1249(Static701.anInt10980, Static475.aString111, 0L, (long) (local133 | local131 << 0), 45, local133, false, true, local131, "", true, -1);
				}
			}
		}
		if (Static178.aBoolean264) {
			Static661.method8827();
		}
		for (local131 = 0; local131 < (Static178.aBoolean264 ? 2 : 1); local131++) {
			@Pc(491) boolean local491 = local131 == 0;
			@Pc(498) Class88 local498 = local491 ? Static424.aClass88_1 : Static648.aClass88_3;
			local139 = arg1;
			local168 = arg0;
			if (Static178.aBoolean264) {
				Static443.method6437(local491);
				local139 = arg1 + Static637.method8637(local491);
				local168 = arg0 + Static706.method9217(local491);
			}
			@Pc(522) Class66 local522 = local498.aClass66_1;
			for (@Pc(527) Class19_Sub8 local527 = (Class19_Sub8) local522.method1381(); local527 != null; local527 = (Class19_Sub8) local522.method1380()) {
				if ((Static171.aBoolean258 || Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 == local527.aClass19_Sub1_16.aByte146) && local527.method5985(local139, arg2, local168)) {
					@Pc(563) int local563;
					if (local527.aClass19_Sub1_16 instanceof Class19_Sub1_Sub3) {
						local563 = ((Class19_Sub1_Sub3) local527.aClass19_Sub1_16).aShort124;
						local159 = ((Class19_Sub1_Sub3) local527.aClass19_Sub1_16).aShort121;
					} else {
						local563 = local527.aClass19_Sub1_16.anInt11211 >> 9;
						local159 = local527.aClass19_Sub1_16.anInt11204 >> 9;
					}
					@Pc(705) int local705;
					@Pc(716) int local716;
					@Pc(840) int local840;
					@Pc(594) int local594;
					if (local527.aClass19_Sub1_16 instanceof Class19_Sub1_Sub3_Sub2_Sub2) {
						@Pc(590) Class19_Sub1_Sub3_Sub2_Sub2 local590 = (Class19_Sub1_Sub3_Sub2_Sub2) local527.aClass19_Sub1_16;
						local594 = local590.method6592();
						if ((local594 & 0x1) == 0 && (local590.anInt11204 & 0x1FF) == 0 && (local590.anInt11211 & 0x1FF) == 0 || (local594 & 0x1) == 1 && (local590.anInt11204 & 0x1FF) == 256 && (local590.anInt11211 & 0x1FF) == 256) {
							local276 = local590.anInt11204 - (local590.method6592() - 1 << 8);
							local285 = local590.anInt11211 - (local590.method6592() - 1 << 8);
							for (local296 = 0; local296 < Static337.anInt5854; local296++) {
								@Pc(675) Class3_Sub13 local675 = (Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local296]);
								if (local675 != null) {
									@Pc(680) Class19_Sub1_Sub3_Sub2_Sub1 local680 = local675.aClass19_Sub1_Sub3_Sub2_Sub1_2;
									if (Static269.anInt4883 != local680.anInt7803 && local680.aBoolean594) {
										local705 = local680.anInt11204 - (local680.aClass18_1.anInt437 - 1 << 8);
										local716 = local680.anInt11211 - (local680.aClass18_1.anInt437 - 1 << 8);
										if (local276 <= local705 && local680.aClass18_1.anInt437 <= local590.method6592() - (local705 - local276 >> 9) && local716 >= local285 && local680.aClass18_1.anInt437 <= local590.method6592() - (local716 - local285 >> 9)) {
											Static127.method2136(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 != local527.aClass19_Sub1_16.aByte146, local680);
											local680.anInt7803 = Static269.anInt4883;
										}
									}
								}
							}
							local307 = Static558.anInt9284;
							@Pc(796) int[] local796 = Static408.anIntArray393;
							for (local705 = 0; local705 < local307; local705++) {
								@Pc(806) Class19_Sub1_Sub3_Sub2_Sub2 local806 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local796[local705]];
								if (local806 != null && local806.anInt7803 != Static269.anInt4883 && local806 != local590 && local806.aBoolean594) {
									local840 = local806.anInt11204 - (local806.method6592() - 1 << 8);
									@Pc(852) int local852 = local806.anInt11211 - (local806.method6592() - 1 << 8);
									if (local276 <= local840 && local806.method6592() <= local590.method6592() - (local840 - local276 >> 9) && local285 <= local852 && local806.method6592() <= local590.method6592() - (local852 - local285 >> 9)) {
										Static318.method4775(local527.aClass19_Sub1_16.aByte146 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, local806);
										local806.anInt7803 = Static269.anInt4883;
									}
								}
							}
						}
						if (Static269.anInt4883 == local590.anInt7803) {
							continue;
						}
						Static318.method4775(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 != local527.aClass19_Sub1_16.aByte146, local590);
						local590.anInt7803 = Static269.anInt4883;
					}
					if (local527.aClass19_Sub1_16 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
						@Pc(963) Class19_Sub1_Sub3_Sub2_Sub1 local963 = (Class19_Sub1_Sub3_Sub2_Sub1) local527.aClass19_Sub1_16;
						if (local963.aClass18_1 != null) {
							if ((local963.aClass18_1.anInt437 & 0x1) == 0 && (local963.anInt11204 & 0x1FF) == 0 && (local963.anInt11211 & 0x1FF) == 0 || (local963.aClass18_1.anInt437 & 0x1) == 1 && (local963.anInt11204 & 0x1FF) == 256 && (local963.anInt11211 & 0x1FF) == 256) {
								local594 = local963.anInt11204 - (local963.aClass18_1.anInt437 - 1 << 8);
								local276 = local963.anInt11211 - (local963.aClass18_1.anInt437 - 1 << 8);
								for (local285 = 0; local285 < Static337.anInt5854; local285++) {
									@Pc(1060) Class3_Sub13 local1060 = (Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local285]);
									if (local1060 != null) {
										@Pc(1065) Class19_Sub1_Sub3_Sub2_Sub1 local1065 = local1060.aClass19_Sub1_Sub3_Sub2_Sub1_2;
										if (local1065.anInt7803 != Static269.anInt4883 && local963 != local1065 && local1065.aBoolean594) {
											local359 = local1065.anInt11204 - (local1065.aClass18_1.anInt437 - 1 << 8);
											local705 = local1065.anInt11211 - (local1065.aClass18_1.anInt437 - 1 << 8);
											if (local359 >= local594 && local1065.aClass18_1.anInt437 <= local963.aClass18_1.anInt437 - (local359 - local594 >> 9) && local705 >= local276 && local963.aClass18_1.anInt437 - (local705 - local276 >> 9) >= local1065.aClass18_1.anInt437) {
												Static127.method2136(local527.aClass19_Sub1_16.aByte146 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, local1065);
												local1065.anInt7803 = Static269.anInt4883;
											}
										}
									}
								}
								local296 = Static558.anInt9284;
								@Pc(1185) int[] local1185 = Static408.anIntArray393;
								for (local359 = 0; local359 < local296; local359++) {
									@Pc(1195) Class19_Sub1_Sub3_Sub2_Sub2 local1195 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local1185[local359]];
									if (local1195 != null && local1195.anInt7803 != Static269.anInt4883 && local1195.aBoolean594) {
										local716 = local1195.anInt11204 - (local1195.method6592() - 1 << 8);
										local840 = local1195.anInt11211 - (local1195.method6592() - 1 << 8);
										if (local716 >= local594 && local1195.method6592() <= local963.aClass18_1.anInt437 - (local716 - local594 >> 9) && local276 <= local840 && local1195.method6592() <= local963.aClass18_1.anInt437 - (local840 - local276 >> 9)) {
											Static318.method4775(local527.aClass19_Sub1_16.aByte146 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, local1195);
											local1195.anInt7803 = Static269.anInt4883;
										}
									}
								}
							}
							if (local963.anInt7803 == Static269.anInt4883) {
								continue;
							}
							Static127.method2136(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 != local527.aClass19_Sub1_16.aByte146, local963);
							local963.anInt7803 = Static269.anInt4883;
						}
					}
					if (local527.aClass19_Sub1_16 instanceof Class19_Sub1_Sub4_Sub1) {
						@Pc(1348) int local1348 = Static714.anInt11156 + local159;
						local594 = Static339.anInt5859 + local563;
						@Pc(1369) Class3_Sub20 local1369 = (Class3_Sub20) Static46.aClass136_5.method3503((long) (local527.aClass19_Sub1_16.aByte146 << 28 | local594 << 14 | local1348));
						if (local1369 != null) {
							local285 = 0;
							@Pc(1379) Class3_Sub50 local1379 = (Class3_Sub50) local1369.aClass357_9.method8390();
							while (local1379 != null) {
								@Pc(1387) Class91 local1387 = Static243.aClass406_2.method9394(local1379.anInt9937);
								if (Static212.aBoolean297 && local527.aClass19_Sub1_16.aByte146 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
									@Pc(1415) Class319 local1415 = Static502.anInt8594 == -1 ? null : Static646.aClass106_1.method2677(Static502.anInt8594);
									if ((Static718.anInt11231 & 0x1) != 0 && (local1415 == null || local1387.method2368(local1415.anInt9232, Static502.anInt8594) != local1415.anInt9232)) {
										Static91.method1249(Static27.anInt421, Static177.aString97, (long) local1379.anInt9937, (long) local285, 16, local563, false, false, local159, Static90.aString28 + " -> <col=ff9040>" + local1387.aString47, true, -1);
									}
								}
								if (local527.aClass19_Sub1_16.aByte146 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
									@Pc(1482) String[] local1482 = local1387.aStringArray7;
									for (local705 = local1482.length - 1; local705 >= 0; local705--) {
										if (local1482[local705] != null) {
											@Pc(1497) short local1497 = 0;
											if (local705 == 0) {
												local1497 = 52;
											}
											local840 = Static103.anInt1659;
											if (local705 == 1) {
												local1497 = 53;
											}
											if (local705 == 2) {
												local1497 = 51;
											}
											if (local705 == 3) {
												local1497 = 4;
											}
											if (local705 == 4) {
												local1497 = 60;
											}
											if (local705 == local1387.anInt2731) {
												local840 = local1387.anInt2684;
											}
											if (local705 == 5) {
												local1497 = 1001;
											}
											if (local1387.anInt2707 == local705) {
												local840 = local1387.anInt2713;
											}
											Static91.method1249(local840, local1482[local705], (long) local1379.anInt9937, (long) local285, local1497, local563, false, false, local159, "<col=ff9040>" + local1387.aString47, true, -1);
										}
									}
								}
								local1379 = (Class3_Sub50) local1369.aClass357_9.method8405();
								local285++;
							}
						}
					}
					if (local527.aClass19_Sub1_16 instanceof Interface19) {
						@Pc(1614) Interface19 local1614 = (Interface19) local527.aClass19_Sub1_16;
						@Pc(1621) Class144 local1621 = Static70.aClass323_1.method7792(local1614.method9384());
						if (local1621.anIntArray239 != null) {
							local1621 = local1621.method3629(Static577.aClass362_1);
						}
						if (local1621 != null) {
							if (Static212.aBoolean297 && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 == local527.aClass19_Sub1_16.aByte146) {
								@Pc(1657) Class319 local1657 = Static502.anInt8594 == -1 ? null : Static646.aClass106_1.method2677(Static502.anInt8594);
								if ((Static718.anInt11231 & 0x4) != 0 && (local1657 == null || local1621.method3640(local1657.anInt9232, Static502.anInt8594) != local1657.anInt9232)) {
									Static91.method1249(Static27.anInt421, Static177.aString97, Static679.method8951(local159, local1614, local563), (long) local1614.hashCode(), 2, local563, false, false, local159, Static90.aString28 + " -> <col=00ffff>" + local1621.aString76, true, -1);
								}
							}
							if (local527.aClass19_Sub1_16.aByte146 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
								@Pc(1730) String[] local1730 = local1621.aStringArray15;
								if (local1730 != null) {
									for (local285 = local1730.length - 1; local285 >= 0; local285--) {
										if (local1730[local285] != null) {
											@Pc(1747) short local1747 = 0;
											local307 = Static103.anInt1659;
											if (local285 == 0) {
												local1747 = 6;
											}
											if (local285 == 1) {
												local1747 = 44;
											}
											if (local285 == 2) {
												local1747 = 59;
											}
											if (local285 == 3) {
												local1747 = 48;
											}
											if (local285 == 4) {
												local1747 = 1006;
											}
											if (local285 == local1621.anInt4408) {
												local307 = local1621.anInt4416;
											}
											if (local285 == 5) {
												local1747 = 1004;
											}
											if (local1621.anInt4430 == local285) {
												local307 = local1621.lb;
											}
											Static91.method1249(local307, local1730[local285], Static679.method8951(local159, local1614, local563), (long) local1614.hashCode(), local1747, local563, false, false, local159, "<col=00ffff>" + local1621.aString76, true, -1);
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static178.aBoolean264) {
				Static661.method8827();
			}
		}
		Static624.method8446(false);
	}
}
