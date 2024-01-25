import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
	public static int anInt4774;

	@OriginalMember(owner = "client!kfa", name = "O", descriptor = "Lclient!mv;")
	public static Class229 aClass229_67;

	@OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
	public static int anInt4780 = 0;

	@OriginalMember(owner = "client!kfa", name = "N", descriptor = "I")
	public static int anInt4784 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjava/lang/String;)Lclient!md;")
	public static Class219 method4016(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class219 local8;
		try {
			local8 = (Class219) Class.forName("Class219_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class219_Sub2();
		}
		local8.anInt9427 = arg0;
		local8.aString142 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!r;II)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static410.anInt6680 == 0 || Static307.anInt5082 == 0) {
			return;
		}
		arg1.la(Static226.anInt3311, Static585.anInt9495, Static410.anInt6680, Static307.anInt5082);
		arg1.da(Static63.anInt1139, Static151.anInt2435, Static410.anInt6680, Static307.anInt5082);
		@Pc(37) Class25 local37 = arg1.method6889();
		local37.na(Static448.anInt1220, Static451.anInt8490, Static89.anInt1594, Static47.anInt876, Static210.anInt3051, Static170.anInt2586);
		arg1.method6816(local37);
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(127) int[] local127;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(170) int local170;
		if (Static261.aClass151Array2 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			local57 = arg1.BA();
			local66 = local57 * (arg2 - Static226.anInt3311) / Static410.anInt6680;
			local74 = local57 * (arg0 - Static585.anInt9495) / Static307.anInt5082;
			local77 = arg1.U();
			local85 = (arg2 - Static226.anInt3311) * local77 / Static410.anInt6680;
			local94 = local77 * (arg0 - Static585.anInt9495) / Static307.anInt5082;
			@Pc(109) int[] local109 = new int[] { local66, local74, local57 };
			local37.YA(local109);
			local127 = new int[] { local85, local94, local77 };
			local37.YA(local127);
			@Pc(132) float local132 = 0.0F;
			local140 = local127[0] - local109[0];
			local149 = local127[1] - local109[1];
			local157 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				local170 = (int) ((float) local140 * local132 + (float) local109[0]);
				@Pc(174) int local174 = local170 >> 9;
				@Pc(185) int local185 = (int) ((float) local109[2] + local132 * (float) local157);
				@Pc(189) int local189 = local185 >> 9;
				if (local174 > 0 && local189 > 0 && local174 < Static281.anInt4822 && Static29.anInt491 > local189) {
					@Pc(206) int local206 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128;
					if (local206 < 3 && (Static433.aByteArrayArrayArray15[1][local174][local189] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static261.aClass151Array2[local206].method7680(local170, local185) < (float) local149 * local132 + (float) local109[1]) {
						local52 = local170 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() - 1 << 8) >> 9;
						local54 = local185 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() - 1 << 8) >> 9;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static355.aBoolean473 && (Static277.anInt4787 & 0x40) != 0) {
					@Pc(332) Class273 local332 = Static494.method6329(Static464.anInt7423, Static460.anInt7404);
					if (local332 == null) {
						Static5.method84();
					} else {
						Static438.method5750(Static434.aString105, local54, 57, 0L, local52, " ->", false, -1, Static251.anInt4193, true);
					}
				} else {
					if (Static209.aBoolean218) {
						Static438.method5750(Static229.aClass159_29.method2776(Static261.anInt4297), local54, 17, 0L, local52, "", false, -1, -1, true);
					}
					Static438.method5750(Static88.aString20, local54, 10, 0L, local52, "", false, -1, Static283.anInt9028, true);
				}
			}
		}
		@Pc(352) Class220 local352 = Static224.aClass220_4;
		for (@Pc(357) Class12_Sub3 local357 = (Class12_Sub3) local352.method4661(); local357 != null; local357 = (Class12_Sub3) local352.method4660()) {
			if ((Static355.aBoolean472 || local357.aClass12_Sub2_2.aByte128 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) && local357.method2592(arg1, arg2, arg0)) {
				if (local357.aClass12_Sub2_2 instanceof Class12_Sub2_Sub1) {
					local57 = ((Class12_Sub2_Sub1) local357.aClass12_Sub2_2).aShort120;
					local66 = ((Class12_Sub2_Sub1) local357.aClass12_Sub2_2).aShort121;
				} else {
					local57 = local357.aClass12_Sub2_2.anInt9374 >> 9;
					local66 = local357.aClass12_Sub2_2.anInt9375 >> 9;
				}
				@Pc(483) int local483;
				@Pc(605) int local605;
				if (local357.aClass12_Sub2_2 instanceof Class12_Sub2_Sub1_Sub4_Sub1) {
					@Pc(414) Class12_Sub2_Sub1_Sub4_Sub1 local414 = (Class12_Sub2_Sub1_Sub4_Sub1) local357.aClass12_Sub2_2;
					local77 = local414.method6777();
					if ((local77 & 0x1) == 0 && (local414.anInt9374 & 0x1FF) == 0 && (local414.anInt9375 & 0x1FF) == 0 || (local77 & 0x1) == 1 && (local414.anInt9374 & 0x1FF) == 256 && (local414.anInt9375 & 0x1FF) == 256) {
						local85 = local414.anInt9374 - (local414.method6777() - 1 << 8);
						local94 = local414.anInt9375 - (local414.method6777() - 1 << 8);
						for (local483 = 0; local483 < Static365.anInt6148; local483++) {
							@Pc(494) Class2_Sub5 local494 = (Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local483]);
							if (local494 != null) {
								@Pc(499) Class12_Sub2_Sub1_Sub4_Sub2 local499 = local494.aClass12_Sub2_Sub1_Sub4_Sub2_1;
								if (local499.anInt8387 != Static532.anInt8757 && local499.aBoolean709) {
									local140 = local499.anInt9374 - (local499.aClass295_1.anInt7362 - 1 << 8);
									local149 = local499.anInt9375 - (local499.aClass295_1.anInt7362 - 1 << 8);
									if (local85 <= local140 && local499.aClass295_1.anInt7362 <= local414.method6777() - (local140 - local85 >> 9) && local149 >= local94 && local499.aClass295_1.anInt7362 <= local414.method6777() - (local149 - local94 >> 9)) {
										Static354.method5072(local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local499);
										local499.anInt8387 = Static532.anInt8757;
									}
								}
							}
						}
						local605 = Static84.anInt9548;
						@Pc(607) int[] local607 = Static520.anIntArray555;
						for (local140 = 0; local140 < local605; local140++) {
							@Pc(617) Class12_Sub2_Sub1_Sub4_Sub1 local617 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local607[local140]];
							if (local617 != null && local617.anInt8387 != Static532.anInt8757 && local617 != local414 && local617.aBoolean709) {
								local157 = local617.anInt9374 - (local617.method6777() - 1 << 8);
								local170 = local617.anInt9375 - (local617.method6777() - 1 << 8);
								if (local85 <= local157 && local617.method6777() <= local414.method6777() - (local157 - local85 >> 9) && local94 <= local170 && local617.method6777() <= local414.method6777() - (local170 - local94 >> 9)) {
									Static117.method1705(local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local617);
									local617.anInt8387 = Static532.anInt8757;
								}
							}
						}
					}
					if (local414.anInt8387 == Static532.anInt8757) {
						continue;
					}
					Static117.method1705(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 != local357.aClass12_Sub2_2.aByte128, local414);
					local414.anInt8387 = Static532.anInt8757;
				}
				@Pc(866) int local866;
				if (local357.aClass12_Sub2_2 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
					@Pc(754) Class12_Sub2_Sub1_Sub4_Sub2 local754 = (Class12_Sub2_Sub1_Sub4_Sub2) local357.aClass12_Sub2_2;
					if (local754.aClass295_1 != null) {
						if ((local754.aClass295_1.anInt7362 & 0x1) == 0 && (local754.anInt9374 & 0x1FF) == 0 && (local754.anInt9375 & 0x1FF) == 0 || (local754.aClass295_1.anInt7362 & 0x1) == 1 && (local754.anInt9374 & 0x1FF) == 256 && (local754.anInt9375 & 0x1FF) == 256) {
							local77 = local754.anInt9374 - (local754.aClass295_1.anInt7362 - 1 << 8);
							local85 = local754.anInt9375 - (local754.aClass295_1.anInt7362 - 1 << 8);
							for (local94 = 0; local94 < Static365.anInt6148; local94++) {
								@Pc(837) Class2_Sub5 local837 = (Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local94]);
								if (local837 != null) {
									@Pc(842) Class12_Sub2_Sub1_Sub4_Sub2 local842 = local837.aClass12_Sub2_Sub1_Sub4_Sub2_1;
									if (local842.anInt8387 != Static532.anInt8757 && local754 != local842 && local842.aBoolean709) {
										local866 = local842.anInt9374 - (local842.aClass295_1.anInt7362 - 1 << 8);
										local140 = local842.anInt9375 - (local842.aClass295_1.anInt7362 - 1 << 8);
										if (local866 >= local77 && local754.aClass295_1.anInt7362 - (local866 - local77 >> 9) >= local842.aClass295_1.anInt7362 && local85 <= local140 && local754.aClass295_1.anInt7362 - (local140 - local85 >> 9) >= local842.aClass295_1.anInt7362) {
											Static354.method5072(local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local842);
											local842.anInt8387 = Static532.anInt8757;
										}
									}
								}
							}
							local483 = Static84.anInt9548;
							local127 = Static520.anIntArray555;
							for (local866 = 0; local866 < local483; local866++) {
								@Pc(950) Class12_Sub2_Sub1_Sub4_Sub1 local950 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local127[local866]];
								if (local950 != null && local950.anInt8387 != Static532.anInt8757 && local950.aBoolean709) {
									local149 = local950.anInt9374 - (local950.method6777() - 1 << 8);
									local157 = local950.anInt9375 - (local950.method6777() - 1 << 8);
									if (local77 <= local149 && local950.method6777() <= local754.aClass295_1.anInt7362 - (local149 - local77 >> 9) && local85 <= local157 && local950.method6777() <= local754.aClass295_1.anInt7362 - (local157 - local85 >> 9)) {
										Static117.method1705(local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local950);
										local950.anInt8387 = Static532.anInt8757;
									}
								}
							}
						}
						if (Static532.anInt8757 == local754.anInt8387) {
							continue;
						}
						Static354.method5072(local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local754);
						local754.anInt8387 = Static532.anInt8757;
					}
				}
				if (local357.aClass12_Sub2_2 instanceof Class12_Sub2_Sub3_Sub1) {
					local74 = local57 + Static485.anInt7725;
					local77 = local66 + Static310.anInt5129;
					@Pc(1100) Class2_Sub6 local1100 = (Class2_Sub6) Static531.aClass90_39.method1685((long) (local74 | local357.aClass12_Sub2_2.aByte128 << 28 | local77 << 14));
					if (local1100 != null) {
						for (@Pc(1108) Class2_Sub32 local1108 = (Class2_Sub32) local1100.aClass70_1.method1266(); local1108 != null; local1108 = (Class2_Sub32) local1100.aClass70_1.method1271()) {
							@Pc(1116) Class164 local1116 = Static466.aClass130_2.method2311(local1108.anInt5953);
							if (Static355.aBoolean473 && local357.aClass12_Sub2_2.aByte128 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) {
								@Pc(1139) Class57 local1139 = Static401.anInt6603 == -1 ? null : Static537.aClass191_2.method3971(Static401.anInt6603);
								if ((Static277.anInt4787 & 0x1) != 0 && (local1139 == null || local1116.method3320(local1139.anInt1160, Static401.anInt6603) != local1139.anInt1160)) {
									Static438.method5750(Static434.aString105, local66, 3, (long) local1108.anInt5953, local57, Static196.aString39 + " -> <col=ff9040>" + local1116.aString48, false, -1, Static251.anInt4193, true);
								}
							}
							if (local357.aClass12_Sub2_2.aByte128 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) {
								@Pc(1202) String[] local1202 = local1116.aStringArray22;
								for (local866 = 4; local866 >= 0; local866--) {
									if (local1202 != null && local1202[local866] != null) {
										@Pc(1214) byte local1214 = 0;
										if (local866 == 0) {
											local1214 = 45;
										}
										local149 = Static183.anInt2722;
										if (local866 == 1) {
											local1214 = 25;
										}
										if (local866 == 2) {
											local1214 = 5;
										}
										if (local866 == 3) {
											local1214 = 8;
										}
										if (local866 == 4) {
											local1214 = 51;
										}
										if (local866 == local1116.anInt3863) {
											local149 = local1116.anInt3883;
										}
										if (local866 == local1116.anInt3872) {
											local149 = local1116.anInt3850;
										}
										Static438.method5750(local1202[local866], local66, local1214, (long) local1108.anInt5953, local57, "<col=ff9040>" + local1116.aString48, false, -1, local149, true);
									}
								}
							}
							Static438.method5750(Static229.aClass159_24.method2776(Static261.anInt4297), local66, 1010, (long) local1108.anInt5953, local57, "<col=ff9040>" + local1116.aString48, local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, -1, Static379.anInt6320, true);
						}
					}
				}
				if (local357.aClass12_Sub2_2 instanceof Interface14) {
					@Pc(1349) Interface14 local1349 = (Interface14) local357.aClass12_Sub2_2;
					@Pc(1356) Class216 local1356 = Static362.aClass290_2.method5799(local1349.method7094());
					if (local1356.anIntArray362 != null) {
						local1356 = local1356.method4560(Static426.aClass160_1);
					}
					if (local1356 != null) {
						if (Static355.aBoolean473 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 == local357.aClass12_Sub2_2.aByte128) {
							@Pc(1388) Class57 local1388 = Static401.anInt6603 == -1 ? null : Static537.aClass191_2.method3971(Static401.anInt6603);
							if ((Static277.anInt4787 & 0x4) != 0 && (local1388 == null || local1356.method4555(Static401.anInt6603, local1388.anInt1160) != local1388.anInt1160)) {
								Static438.method5750(Static434.aString105, local66, 9, Static26.method360(local66, local1349, local57), local57, Static196.aString39 + " -> <col=00ffff>" + local1356.aString66, false, -1, Static251.anInt4193, true);
							}
						}
						if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 == local357.aClass12_Sub2_2.aByte128) {
							@Pc(1449) String[] local1449 = local1356.aStringArray29;
							if (local1449 != null) {
								for (local94 = 4; local94 >= 0; local94--) {
									if (local1449[local94] != null) {
										@Pc(1461) short local1461 = 0;
										if (local94 == 0) {
											local1461 = 21;
										}
										local605 = Static183.anInt2722;
										if (local94 == 1) {
											local1461 = 18;
										}
										if (local94 == 2) {
											local1461 = 11;
										}
										if (local94 == 3) {
											local1461 = 4;
										}
										if (local94 == 4) {
											local1461 = 1003;
										}
										if (local94 == local1356.anInt5269) {
											local605 = local1356.anInt5236;
										}
										if (local1356.anInt5285 == local94) {
											local605 = local1356.anInt5270;
										}
										Static438.method5750(local1449[local94], local66, local1461, Static26.method360(local66, local1349, local57), local57, "<col=00ffff>" + local1356.aString66, false, -1, local605, true);
									}
								}
							}
						}
						Static438.method5750(Static229.aClass159_24.method2776(Static261.anInt4297), local66, 1007, (long) local1356.anInt5259, local57, "<col=00ffff>" + local1356.aString66, local357.aClass12_Sub2_2.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, -1, Static379.anInt6320, true);
					}
				}
			}
		}
	}
}
