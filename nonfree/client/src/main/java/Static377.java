import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_98 = new Class130(35, 8);

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "Lclient!wk;")
	public static final Class374 aClass374_3 = new Class374();

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_101 = new Class200(64, 3);

	@OriginalMember(owner = "client!nha", name = "r", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_10 = new Class337(7, 3);

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!ha;IZ)V")
	public static void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static157.anInt3107 == 0 || Static72.anInt1724 == 0) {
			return;
		}
		@Pc(45) Class39 local45;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(30) int local30;
		@Pc(58) int local58;
		@Pc(60) int local60;
		if (Static219.aBoolean285) {
			Static34.method1253(false);
			local45 = arg1.method7503();
			@Pc(71) int[] local71 = arg1.Y();
			local32 = local71[1];
			local30 = local71[3];
			local34 = local71[2];
			local36 = local71[0];
			local58 = arg2 + Static555.method8007(false);
			local60 = Static458.method7006(false) + arg0;
		} else {
			arg1.DA(Static294.anInt5192, Static160.anInt3139, Static157.anInt3107, Static72.anInt1724);
			local30 = Static72.anInt1724;
			local32 = Static160.anInt3139;
			local34 = Static157.anInt3107;
			local36 = Static294.anInt5192;
			arg1.KA(Static353.anInt6778, Static285.anInt5068, Static157.anInt3107, Static72.anInt1724);
			local45 = arg1.method7552();
			local45.method7249(Static621.anInt10057, Static638.anInt10171, Static44.anInt1313, Static265.anInt4848, Static551.anInt9267, Static296.anInt5216);
			arg1.method7504(local45);
			local58 = arg2;
			local60 = arg0;
		}
		if (local30 == 0) {
			local30 = 1;
		}
		if (local34 == 0) {
			local34 = 1;
		}
		Static511.method7629(true);
		@Pc(132) int local132;
		@Pc(143) int local143;
		@Pc(152) int local152;
		@Pc(271) int local271;
		@Pc(280) int local280;
		@Pc(291) int local291;
		@Pc(302) int local302;
		@Pc(124) int local124;
		@Pc(352) int local352;
		if (Static559.aClass51Array4 != null && (!Static190.aBoolean232 || (Static37.anInt1189 & 0x40) != 0)) {
			local124 = -1;
			@Pc(126) int local126 = -1;
			@Pc(129) int local129 = arg1.i();
			local132 = arg1.XA();
			@Pc(170) int local170;
			@Pc(161) int local161;
			if (Static279.aBoolean329) {
				local170 = local152 = (local60 - local32) * Static401.anInt7417 / local30;
				local143 = local161 = Static401.anInt7417 * (local58 - local36) / local34;
			} else {
				local143 = local129 * (local58 - local36) / local34;
				local152 = local132 * (local60 - local32) / local30;
				local161 = (local58 - local36) * local132 / local34;
				local170 = (local60 - local32) * local129 / local30;
			}
			@Pc(209) int[] local209 = new int[] { local143, local170, local129 };
			@Pc(224) int[] local224 = new int[] { local161, local152, local132 };
			local45.method7241(local209);
			local45.method7241(local224);
			@Pc(258) float local258 = Static495.method7330((float) local224[0], (float) local209[2], (float) local224[1], 4, (float) local209[1], (float) local209[0], (float) local224[2]);
			if (local258 > 0.0F) {
				local271 = local224[0] - local209[0];
				local280 = local224[2] - local209[2];
				local291 = (int) (local258 * (float) local271 + (float) local209[0]);
				local302 = (int) ((float) local209[2] + local258 * (float) local280);
				local124 = local291 + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() - 1 << 8) >> 9;
				local126 = local302 + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() - 1 << 8) >> 9;
				@Pc(329) byte local329 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123;
				if (local329 < 3 && (Static513.aByteArrayArrayArray18[1][local291 >> 9][local302 >> 9] & 0x2) != 0) {
					local352 = local329 + 1;
				}
			}
			if (local124 != -1 && local126 != -1) {
				if (Static190.aBoolean232 && (Static37.anInt1189 & 0x40) != 0) {
					@Pc(419) Class279 local419 = Static406.method6473(Static161.anInt3179, Static433.anInt7818);
					if (local419 == null) {
						Static282.method4549();
					} else {
						Static582.method8234(Static136.aString18, true, local126, true, " ->", local124, (long) (local124 << 0 | local126), Static262.anInt4805, 0L, 47, -1, false);
					}
				} else {
					if (Static146.aBoolean189) {
						Static582.method8234(Static59.aClass43_27.method1598(Static325.anInt6083), true, local126, true, "", local124, (long) (local126 | local124 << 0), -1, 0L, 18, -1, false);
					}
					Static582.method8234(Static123.aString17, true, local126, true, "", local124, (long) (local126 | local124 << 0), Static524.anInt8435, 0L, 5, -1, false);
				}
			}
		}
		if (Static219.aBoolean285) {
			Static227.method3763();
		}
		for (local124 = 0; local124 < (Static219.aBoolean285 ? 2 : 1); local124++) {
			@Pc(462) boolean local462 = local124 == 0;
			@Pc(468) Class301 local468 = local462 ? Static374.aClass301_3 : Static308.aClass301_1;
			local132 = arg2;
			local143 = arg0;
			if (Static219.aBoolean285) {
				Static34.method1253(local462);
				local132 = arg2 + Static555.method8007(local462);
				local143 = arg0 + Static458.method7006(local462);
			}
			@Pc(492) Class120 local492 = local468.aClass120_6;
			for (@Pc(497) Class4_Sub8 local497 = (Class4_Sub8) local492.method2966(); local497 != null; local497 = (Class4_Sub8) local492.method2962()) {
				if ((Static548.aBoolean664 || local497.aClass4_Sub1_2.aByte123 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) && local497.method7122(local132, arg1, local143)) {
					@Pc(527) int local527;
					if (local497.aClass4_Sub1_2 instanceof Class4_Sub1_Sub2) {
						local527 = ((Class4_Sub1_Sub2) local497.aClass4_Sub1_2).aShort116;
						local152 = ((Class4_Sub1_Sub2) local497.aClass4_Sub1_2).aShort118;
					} else {
						local152 = local497.aClass4_Sub1_2.anInt8916 >> 9;
						local527 = local497.aClass4_Sub1_2.anInt8911 >> 9;
					}
					@Pc(663) int local663;
					@Pc(675) int local675;
					@Pc(782) int local782;
					@Pc(558) int local558;
					if (local497.aClass4_Sub1_2 instanceof Class4_Sub1_Sub2_Sub1_Sub2) {
						@Pc(554) Class4_Sub1_Sub2_Sub1_Sub2 local554 = (Class4_Sub1_Sub2_Sub1_Sub2) local497.aClass4_Sub1_2;
						local558 = local554.method5059();
						if ((local558 & 0x1) == 0 && (local554.anInt8916 & 0x1FF) == 0 && (local554.anInt8911 & 0x1FF) == 0 || (local558 & 0x1) == 1 && (local554.anInt8916 & 0x1FF) == 256 && (local554.anInt8911 & 0x1FF) == 256) {
							local271 = local554.anInt8916 - (local554.method5059() - 1 << 8);
							local280 = local554.anInt8911 - (local554.method5059() - 1 << 8);
							for (local291 = 0; local291 < Static94.anInt2209; local291++) {
								@Pc(634) Class3_Sub28 local634 = (Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local291]);
								if (local634 != null) {
									@Pc(639) Class4_Sub1_Sub2_Sub1_Sub1 local639 = local634.aClass4_Sub1_Sub2_Sub1_Sub1_2;
									if (Static101.anInt2262 != local639.anInt5787 && local639.aBoolean405) {
										local663 = local639.anInt8916 - (local639.aClass109_1.anInt3032 - 1 << 8);
										local675 = local639.anInt8911 - (local639.aClass109_1.anInt3032 - 1 << 8);
										if (local271 <= local663 && local639.aClass109_1.anInt3032 <= local554.method5059() - (local663 - local271 >> 9) && local675 >= local280 && local639.aClass109_1.anInt3032 <= local554.method5059() - (local675 - local280 >> 9)) {
											Static478.method7169(local497.aClass4_Sub1_2.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, local639);
											local639.anInt5787 = Static101.anInt2262;
										}
									}
								}
							}
							local302 = Static274.anInt4964;
							@Pc(742) int[] local742 = Static70.anIntArray392;
							for (local663 = 0; local663 < local302; local663++) {
								@Pc(752) Class4_Sub1_Sub2_Sub1_Sub2 local752 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local742[local663]];
								if (local752 != null && local752.anInt5787 != Static101.anInt2262 && local752 != local554 && local752.aBoolean405) {
									local782 = local752.anInt8916 - (local752.method5059() - 1 << 8);
									@Pc(794) int local794 = local752.anInt8911 - (local752.method5059() - 1 << 8);
									if (local271 <= local782 && local752.method5059() <= local554.method5059() - (local782 - local271 >> 9) && local280 <= local794 && local752.method5059() <= local554.method5059() - (local794 - local280 >> 9)) {
										Static428.method4110(local752, local497.aClass4_Sub1_2.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123);
										local752.anInt5787 = Static101.anInt2262;
									}
								}
							}
						}
						if (Static101.anInt2262 == local554.anInt5787) {
							continue;
						}
						Static428.method4110(local554, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 != local497.aClass4_Sub1_2.aByte123);
						local554.anInt5787 = Static101.anInt2262;
					}
					if (local497.aClass4_Sub1_2 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
						@Pc(891) Class4_Sub1_Sub2_Sub1_Sub1 local891 = (Class4_Sub1_Sub2_Sub1_Sub1) local497.aClass4_Sub1_2;
						if (local891.aClass109_1 != null) {
							if ((local891.aClass109_1.anInt3032 & 0x1) == 0 && (local891.anInt8916 & 0x1FF) == 0 && (local891.anInt8911 & 0x1FF) == 0 || (local891.aClass109_1.anInt3032 & 0x1) == 1 && (local891.anInt8916 & 0x1FF) == 256 && (local891.anInt8911 & 0x1FF) == 256) {
								local558 = local891.anInt8916 - (local891.aClass109_1.anInt3032 - 1 << 8);
								local271 = local891.anInt8911 - (local891.aClass109_1.anInt3032 - 1 << 8);
								for (local280 = 0; local280 < Static94.anInt2209; local280++) {
									@Pc(971) Class3_Sub28 local971 = (Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local280]);
									if (local971 != null) {
										@Pc(976) Class4_Sub1_Sub2_Sub1_Sub1 local976 = local971.aClass4_Sub1_Sub2_Sub1_Sub1_2;
										if (local976.anInt5787 != Static101.anInt2262 && local976 != local891 && local976.aBoolean405) {
											local352 = local976.anInt8916 - (local976.aClass109_1.anInt3032 - 1 << 8);
											local663 = local976.anInt8911 - (local976.aClass109_1.anInt3032 - 1 << 8);
											if (local352 >= local558 && local891.aClass109_1.anInt3032 - (local352 - local558 >> 9) >= local976.aClass109_1.anInt3032 && local271 <= local663 && local976.aClass109_1.anInt3032 <= local891.aClass109_1.anInt3032 - (local663 - local271 >> 9)) {
												Static478.method7169(local497.aClass4_Sub1_2.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, local976);
												local976.anInt5787 = Static101.anInt2262;
											}
										}
									}
								}
								local291 = Static274.anInt4964;
								@Pc(1079) int[] local1079 = Static70.anIntArray392;
								for (local352 = 0; local352 < local291; local352++) {
									@Pc(1089) Class4_Sub1_Sub2_Sub1_Sub2 local1089 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local1079[local352]];
									if (local1089 != null && local1089.anInt5787 != Static101.anInt2262 && local1089.aBoolean405) {
										local675 = local1089.anInt8916 - (local1089.method5059() - 1 << 8);
										local782 = local1089.anInt8911 - (local1089.method5059() - 1 << 8);
										if (local558 <= local675 && local1089.method5059() <= local891.aClass109_1.anInt3032 - (local675 - local558 >> 9) && local782 >= local271 && local1089.method5059() <= local891.aClass109_1.anInt3032 - (local782 - local271 >> 9)) {
											Static428.method4110(local1089, local497.aClass4_Sub1_2.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123);
											local1089.anInt5787 = Static101.anInt2262;
										}
									}
								}
							}
							if (Static101.anInt2262 == local891.anInt5787) {
								continue;
							}
							Static478.method7169(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 != local497.aClass4_Sub1_2.aByte123, local891);
							local891.anInt5787 = Static101.anInt2262;
						}
					}
					if (local497.aClass4_Sub1_2 instanceof Class4_Sub1_Sub1_Sub1) {
						@Pc(1222) int local1222 = local152 + Static299.anInt5307;
						local558 = Static171.anInt3340 + local527;
						@Pc(1243) Class3_Sub51 local1243 = (Class3_Sub51) Static356.aClass280_28.method7107((long) (local497.aClass4_Sub1_2.aByte123 << 28 | local558 << 14 | local1222));
						if (local1243 != null) {
							local280 = 0;
							@Pc(1253) Class3_Sub45 local1253 = (Class3_Sub45) local1243.aClass223_62.method5873();
							while (local1253 != null) {
								@Pc(1261) Class38 local1261 = Static320.aClass53_2.method1770(local1253.anInt8270);
								if (Static190.aBoolean232 && local497.aClass4_Sub1_2.aByte123 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) {
									@Pc(1279) Class300 local1279 = Static540.anInt9171 == -1 ? null : Static449.aClass55_2.method1843(Static540.anInt9171);
									if ((Static37.anInt1189 & 0x1) != 0 && (local1279 == null || local1261.method1485(local1279.anInt8686, Static540.anInt9171) != local1279.anInt8686)) {
										Static582.method8234(Static136.aString18, true, local527, false, Static11.aString107 + " -> <col=ff9040>" + local1261.aString6, local152, (long) local280, Static262.anInt4805, (long) local1253.anInt8270, 57, -1, false);
									}
								}
								if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 == local497.aClass4_Sub1_2.aByte123) {
									@Pc(1338) String[] local1338 = local1261.aStringArray2;
									for (local663 = 4; local663 >= 0; local663--) {
										if (local1338 != null && local1338[local663] != null) {
											@Pc(1350) byte local1350 = 0;
											local782 = Static523.anInt8986;
											if (local663 == 0) {
												local1350 = 51;
											}
											if (local663 == 1) {
												local1350 = 11;
											}
											if (local663 == 2) {
												local1350 = 2;
											}
											if (local663 == 3) {
												local1350 = 60;
											}
											if (local663 == local1261.anInt1439) {
												local782 = local1261.anInt1466;
											}
											if (local663 == 4) {
												local1350 = 48;
											}
											if (local1261.anInt1496 == local663) {
												local782 = local1261.lb;
											}
											Static582.method8234(local1338[local663], true, local527, false, "<col=ff9040>" + local1261.aString6, local152, (long) local280, local782, (long) local1253.anInt8270, local1350, -1, false);
										}
									}
								}
								Static582.method8234(Static59.aClass43_22.method1598(Static325.anInt6083), true, local527, false, "<col=ff9040>" + local1261.aString6, local152, (long) local280, Static98.anInt2238, (long) local1253.anInt8270, 1011, -1, local497.aClass4_Sub1_2.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123);
								local1253 = (Class3_Sub45) local1243.aClass223_62.method5871();
								local280++;
							}
						}
					}
					if (local497.aClass4_Sub1_2 instanceof Interface2) {
						@Pc(1492) Interface2 local1492 = (Interface2) local497.aClass4_Sub1_2;
						@Pc(1499) Class299 local1499 = Static105.aClass302_1.method7466(local1492.method7381());
						if (local1499.anIntArray533 != null) {
							local1499 = local1499.method7418(Static373.aClass150_1);
						}
						if (local1499 != null) {
							if (Static190.aBoolean232 && local497.aClass4_Sub1_2.aByte123 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) {
								@Pc(1531) Class300 local1531 = Static540.anInt9171 == -1 ? null : Static449.aClass55_2.method1843(Static540.anInt9171);
								if ((Static37.anInt1189 & 0x4) != 0 && (local1531 == null || local1499.method7414(local1531.anInt8686, Static540.anInt9171) != local1531.anInt8686)) {
									Static582.method8234(Static136.aString18, true, local527, false, Static11.aString107 + " -> <col=00ffff>" + local1499.aString97, local152, (long) local1492.hashCode(), Static262.anInt4805, Static585.method8268(local152, local1492, local527), 8, -1, false);
								}
							}
							if (local497.aClass4_Sub1_2.aByte123 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) {
								@Pc(1589) String[] local1589 = local1499.aStringArray32;
								if (local1589 != null) {
									for (local280 = 4; local280 >= 0; local280--) {
										if (local1589[local280] != null) {
											@Pc(1601) short local1601 = 0;
											if (local280 == 0) {
												local1601 = 6;
											}
											local302 = Static523.anInt8986;
											if (local280 == 1) {
												local1601 = 15;
											}
											if (local280 == 2) {
												local1601 = 30;
											}
											if (local280 == 3) {
												local1601 = 44;
											}
											if (local280 == 4) {
												local1601 = 1012;
											}
											if (local280 == local1499.anInt8667) {
												local302 = local1499.anInt8682;
											}
											if (local280 == local1499.anInt8645) {
												local302 = local1499.anInt8663;
											}
											Static582.method8234(local1589[local280], true, local527, false, "<col=00ffff>" + local1499.aString97, local152, (long) local1492.hashCode(), local302, Static585.method8268(local152, local1492, local527), local1601, -1, false);
										}
									}
								}
								Static582.method8234(Static59.aClass43_22.method1598(Static325.anInt6083), true, local527, false, "<col=00ffff>" + local1499.aString97, local152, (long) local1492.hashCode(), Static98.anInt2238, (long) local1499.anInt8677, 1009, -1, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 != local497.aClass4_Sub1_2.aByte123);
							}
						}
					}
				}
			}
			if (Static219.aBoolean285) {
				Static227.method3763();
			}
		}
		Static511.method7629(false);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIIII)V")
	public static void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			Static611.method8472(arg3, arg2, Static460.anIntArrayArray53[arg0], arg1);
		} else {
			Static611.method8472(arg2, arg3, Static460.anIntArrayArray53[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method6073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		Static513.aClass309Array4[Static402.anInt7434++] = new Class309(4, arg2, arg4, arg5, arg5, arg4, arg1, arg3, arg3, arg1, arg0, arg0, arg6, arg6);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!sl;)Lclient!ih;")
	public static Class3_Sub2 method6076(@OriginalArg(1) Class3_Sub3 arg0) {
		arg0.method4225();
		@Pc(18) int local18 = arg0.method4225();
		@Pc(22) Class3_Sub2 local22 = Static527.method7738(local18);
		local22.anInt10030 = arg0.method4225();
		@Pc(31) int local31 = arg0.method4225();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method4225();
			local22.method8600(arg0, local39);
		}
		local22.method8598();
		return local22;
	}
}
