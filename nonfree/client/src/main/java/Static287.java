import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)V")
	public static void method5380(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub5_Sub21 local16 = Static101.method1629(2, arg0);
		local16.method8961();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII[B)V")
	public static void method5381(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		arg2 += arg0;
		@Pc(24) int local24 = arg1 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg2 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZIILclient!ha;)V")
	public static void method5382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class133 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static33.anInt543 == 0 || Static385.anInt6364 == 0) {
			return;
		}
		@Pc(34) Class113 local34;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(66) int local66;
		if (Static428.aBoolean526) {
			Static142.method2051(false);
			local34 = arg2.method7299();
			@Pc(37) int[] local37 = arg2.Y();
			local41 = local37[0];
			local45 = local37[1];
			local49 = local37[2];
			local53 = local37[3];
			local60 = arg0 + Static465.method6899(false);
			local66 = Static31.method334(false) + arg1;
		} else {
			arg2.DA(Static322.anInt5456, Static557.anInt9404, Static33.anInt543, Static385.anInt6364);
			local41 = Static322.anInt5456;
			local45 = Static557.anInt9404;
			local53 = Static385.anInt6364;
			local49 = Static33.anInt543;
			arg2.KA(Static9.anInt207, Static302.anInt5273, Static33.anInt543, Static385.anInt6364);
			local34 = arg2.method7275();
			local34.method8451(Static565.anInt9561, Static356.anInt5934, Static636.anInt10568, Static170.anInt3041, Static609.anInt10201, Static316.anInt5385);
			local60 = arg0;
			arg2.method7269(local34);
			local66 = arg1;
		}
		if (local49 == 0) {
			local49 = 1;
		}
		if (local53 == 0) {
			local53 = 1;
		}
		Static123.method4148(true);
		@Pc(138) int local138;
		@Pc(175) int local175;
		@Pc(166) int local166;
		@Pc(275) int local275;
		@Pc(284) int local284;
		@Pc(295) int local295;
		@Pc(306) int local306;
		@Pc(130) int local130;
		@Pc(358) int local358;
		if (Static20.aClass61Array2 != null && (!Static285.aBoolean378 || (Static427.anInt7391 & 0x40) != 0)) {
			local130 = -1;
			@Pc(132) int local132 = -1;
			@Pc(135) int local135 = arg2.i();
			local138 = arg2.XA();
			@Pc(157) int local157;
			@Pc(149) int local149;
			if (Static57.aBoolean65) {
				local157 = local166 = Static469.anInt7885 * (local66 - local45) / local53;
				local175 = local149 = (local60 - local41) * Static469.anInt7885 / local49;
			} else {
				local149 = local138 * (local60 - local41) / local49;
				local157 = local135 * (local66 - local45) / local53;
				local166 = (local66 - local45) * local138 / local53;
				local175 = local135 * (local60 - local41) / local49;
			}
			@Pc(213) int[] local213 = new int[] { local175, local157, local135 };
			local34.method8449(local213);
			@Pc(231) int[] local231 = new int[] { local149, local166, local138 };
			local34.method8449(local231);
			@Pc(262) float local262 = Static631.method8922((float) local213[1], (float) local231[1], (float) local231[0], (float) local231[2], 4, (float) local213[2], (float) local213[0]);
			if (local262 > 0.0F) {
				local275 = local231[0] - local213[0];
				local284 = local231[2] - local213[2];
				local295 = (int) ((float) local213[0] + (float) local275 * local262);
				local306 = (int) ((float) local284 * local262 + (float) local213[2]);
				local130 = local295 + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() - 1 << 8) >> 9;
				local132 = local306 + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() - 1 << 8) >> 9;
				@Pc(335) byte local335 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132;
				if (local335 < 3 && (Static305.aByteArrayArrayArray18[1][local295 >> 9][local306 >> 9] & 0x2) != 0) {
					local358 = local335 + 1;
				}
			}
			if (local130 != -1 && local132 != -1) {
				if (Static285.aBoolean378 && (Static427.anInt7391 & 0x40) != 0) {
					@Pc(425) Class295 local425 = Static324.method4920(Static375.anInt6224, Static570.anInt9615);
					if (local425 == null) {
						Static420.method6387();
					} else {
						Static150.method2214(local132, " ->", true, true, Static83.anInt6737, local130, -1, (long) (local130 << 0 | local132), false, Static493.aString96, 21, 0L);
					}
				} else {
					if (Static256.aBoolean333) {
						Static150.method2214(local132, "", true, true, -1, local130, -1, (long) (local130 << 0 | local132), false, Static174.aClass120_27.method2690(Static266.anInt4796), 59, 0L);
					}
					Static150.method2214(local132, "", true, true, Static405.anInt6784, local130, -1, (long) (local130 << 0 | local132), false, Static502.aString99, 16, 0L);
				}
			}
		}
		if (Static428.aBoolean526) {
			Static583.method8431();
		}
		for (local130 = 0; (Static428.aBoolean526 ? 2 : 1) > local130; local130++) {
			@Pc(467) boolean local467 = local130 == 0;
			@Pc(473) Class155 local473 = local467 ? Static348.aClass155_3 : Static108.aClass155_1;
			local138 = arg0;
			local175 = arg1;
			if (Static428.aBoolean526) {
				Static142.method2051(local467);
				local138 = arg0 + Static465.method6899(local467);
				local175 = arg1 + Static31.method334(local467);
			}
			@Pc(497) Class99 local497 = local473.aClass99_4;
			for (@Pc(502) Class4_Sub6 local502 = (Class4_Sub6) local497.method2045(); local502 != null; local502 = (Class4_Sub6) local497.method2047()) {
				if ((Static125.aBoolean76 || Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 == local502.aClass4_Sub2_9.aByte132) && local502.method2723(local175, local138, arg2)) {
					@Pc(537) int local537;
					if (local502.aClass4_Sub2_9 instanceof Class4_Sub2_Sub1) {
						local166 = ((Class4_Sub2_Sub1) local502.aClass4_Sub2_9).aShort107;
						local537 = ((Class4_Sub2_Sub1) local502.aClass4_Sub2_9).aShort108;
					} else {
						local166 = local502.aClass4_Sub2_9.anInt10231 >> 9;
						local537 = local502.aClass4_Sub2_9.anInt10229 >> 9;
					}
					@Pc(671) int local671;
					@Pc(682) int local682;
					@Pc(788) int local788;
					@Pc(563) int local563;
					if (local502.aClass4_Sub2_9 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
						@Pc(559) Class4_Sub2_Sub1_Sub1_Sub1 local559 = (Class4_Sub2_Sub1_Sub1_Sub1) local502.aClass4_Sub2_9;
						local563 = local559.method1018();
						if ((local563 & 0x1) == 0 && (local559.anInt10231 & 0x1FF) == 0 && (local559.anInt10229 & 0x1FF) == 0 || (local563 & 0x1) == 1 && (local559.anInt10231 & 0x1FF) == 256 && (local559.anInt10229 & 0x1FF) == 256) {
							local275 = local559.anInt10231 - (local559.method1018() - 1 << 8);
							local284 = local559.anInt10229 - (local559.method1018() - 1 << 8);
							for (local295 = 0; local295 < Static280.anInt4989; local295++) {
								@Pc(642) Class5_Sub3 local642 = (Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local295]);
								if (local642 != null) {
									@Pc(647) Class4_Sub2_Sub1_Sub1_Sub2 local647 = local642.aClass4_Sub2_Sub1_Sub1_Sub2_1;
									if (local647.anInt1205 != Static631.anInt10493 && local647.aBoolean71) {
										local671 = local647.anInt10231 - (local647.aClass225_1.anInt5618 - 1 << 8);
										local682 = local647.anInt10229 - (local647.aClass225_1.anInt5618 - 1 << 8);
										if (local275 <= local671 && local647.aClass225_1.anInt5618 <= local559.method1018() - (local671 - local275 >> 9) && local682 >= local284 && local647.aClass225_1.anInt5618 <= local559.method1018() - (local682 - local284 >> 9)) {
											Static607.method8166(local647, local502.aClass4_Sub2_9.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132);
											local647.anInt1205 = Static631.anInt10493;
										}
									}
								}
							}
							local306 = Static320.anInt5442;
							@Pc(749) int[] local749 = Static278.anIntArray264;
							for (local671 = 0; local671 < local306; local671++) {
								@Pc(759) Class4_Sub2_Sub1_Sub1_Sub1 local759 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local749[local671]];
								if (local759 != null && local759.anInt1205 != Static631.anInt10493 && local559 != local759 && local759.aBoolean71) {
									local788 = local759.anInt10231 - (local759.method1018() - 1 << 8);
									@Pc(800) int local800 = local759.anInt10229 - (local759.method1018() - 1 << 8);
									if (local788 >= local275 && local759.method1018() <= local559.method1018() - (local788 - local275 >> 9) && local800 >= local284 && local759.method1018() <= local559.method1018() - (local800 - local284 >> 9)) {
										Static179.method2722(local502.aClass4_Sub2_9.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, local759);
										local759.anInt1205 = Static631.anInt10493;
									}
								}
							}
						}
						if (local559.anInt1205 == Static631.anInt10493) {
							continue;
						}
						Static179.method2722(local502.aClass4_Sub2_9.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, local559);
						local559.anInt1205 = Static631.anInt10493;
					}
					if (local502.aClass4_Sub2_9 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
						@Pc(890) Class4_Sub2_Sub1_Sub1_Sub2 local890 = (Class4_Sub2_Sub1_Sub1_Sub2) local502.aClass4_Sub2_9;
						if (local890.aClass225_1 != null) {
							if ((local890.aClass225_1.anInt5618 & 0x1) == 0 && (local890.anInt10231 & 0x1FF) == 0 && (local890.anInt10229 & 0x1FF) == 0 || (local890.aClass225_1.anInt5618 & 0x1) == 1 && (local890.anInt10231 & 0x1FF) == 256 && (local890.anInt10229 & 0x1FF) == 256) {
								local563 = local890.anInt10231 - (local890.aClass225_1.anInt5618 - 1 << 8);
								local275 = local890.anInt10229 - (local890.aClass225_1.anInt5618 - 1 << 8);
								for (local284 = 0; local284 < Static280.anInt4989; local284++) {
									@Pc(974) Class5_Sub3 local974 = (Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local284]);
									if (local974 != null) {
										@Pc(979) Class4_Sub2_Sub1_Sub1_Sub2 local979 = local974.aClass4_Sub2_Sub1_Sub1_Sub2_1;
										if (local979.anInt1205 != Static631.anInt10493 && local890 != local979 && local979.aBoolean71) {
											local358 = local979.anInt10231 - (local979.aClass225_1.anInt5618 - 1 << 8);
											local671 = local979.anInt10229 - (local979.aClass225_1.anInt5618 - 1 << 8);
											if (local358 >= local563 && local979.aClass225_1.anInt5618 <= local890.aClass225_1.anInt5618 - (local358 - local563 >> 9) && local275 <= local671 && local979.aClass225_1.anInt5618 <= local890.aClass225_1.anInt5618 - (local671 - local275 >> 9)) {
												Static607.method8166(local979, local502.aClass4_Sub2_9.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132);
												local979.anInt1205 = Static631.anInt10493;
											}
										}
									}
								}
								local295 = Static320.anInt5442;
								@Pc(1081) int[] local1081 = Static278.anIntArray264;
								for (local358 = 0; local358 < local295; local358++) {
									@Pc(1091) Class4_Sub2_Sub1_Sub1_Sub1 local1091 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local1081[local358]];
									if (local1091 != null && Static631.anInt10493 != local1091.anInt1205 && local1091.aBoolean71) {
										local682 = local1091.anInt10231 - (local1091.method1018() - 1 << 8);
										local788 = local1091.anInt10229 - (local1091.method1018() - 1 << 8);
										if (local563 <= local682 && local1091.method1018() <= local890.aClass225_1.anInt5618 - (local682 - local563 >> 9) && local788 >= local275 && local1091.method1018() <= local890.aClass225_1.anInt5618 - (local788 - local275 >> 9)) {
											Static179.method2722(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != local502.aClass4_Sub2_9.aByte132, local1091);
											local1091.anInt1205 = Static631.anInt10493;
										}
									}
								}
							}
							if (Static631.anInt10493 == local890.anInt1205) {
								continue;
							}
							Static607.method8166(local890, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != local502.aClass4_Sub2_9.aByte132);
							local890.anInt1205 = Static631.anInt10493;
						}
					}
					if (local502.aClass4_Sub2_9 instanceof Class4_Sub2_Sub5_Sub1) {
						@Pc(1214) int local1214 = Static565.anInt9560 + local166;
						local563 = Static567.anInt9589 + local537;
						@Pc(1235) Class5_Sub18 local1235 = (Class5_Sub18) Static440.aClass273_28.method6581((long) (local1214 | local502.aClass4_Sub2_9.aByte132 << 28 | local563 << 14));
						if (local1235 != null) {
							local284 = 0;
							for (@Pc(1245) Class5_Sub32 local1245 = (Class5_Sub32) local1235.aClass330_8.method7913(); local1245 != null; local1245 = (Class5_Sub32) local1235.aClass330_8.method7915()) {
								@Pc(1253) Class255 local1253 = Static643.aClass275_2.method6641(local1245.anInt5333);
								if (Static285.aBoolean378 && local502.aClass4_Sub2_9.aByte132 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) {
									@Pc(1271) Class16 local1271 = Static229.anInt4250 == -1 ? null : Static302.aClass291_1.method6836(Static229.anInt4250);
									if ((Static427.anInt7391 & 0x1) != 0 && (local1271 == null || local1253.method5854(Static229.anInt4250, local1271.anInt256) != local1271.anInt256)) {
										Static150.method2214(local537, Static92.aString22 + " -> <col=ff9040>" + local1253.aString73, true, false, Static83.anInt6737, local166, -1, (long) local284, false, Static493.aString96, 48, (long) local1245.anInt5333);
									}
								}
								if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 == local502.aClass4_Sub2_9.aByte132) {
									@Pc(1329) String[] local1329 = local1253.aStringArray53;
									for (local671 = 4; local671 >= 0; local671--) {
										if (local1329 != null && local1329[local671] != null) {
											@Pc(1341) byte local1341 = 0;
											local788 = Static113.anInt2114;
											if (local671 == 0) {
												local1341 = 47;
											}
											if (local671 == 1) {
												local1341 = 13;
											}
											if (local671 == 2) {
												local1341 = 57;
											}
											if (local671 == 3) {
												local1341 = 18;
											}
											if (local671 == local1253.anInt6557) {
												local788 = local1253.anInt6564;
											}
											if (local671 == 4) {
												local1341 = 11;
											}
											if (local1253.anInt6556 == local671) {
												local788 = local1253.anInt6537;
											}
											Static150.method2214(local537, "<col=ff9040>" + local1253.aString73, true, false, local788, local166, -1, (long) local284, false, local1329[local671], local1341, (long) local1245.anInt5333);
										}
									}
								}
								Static150.method2214(local537, "<col=ff9040>" + local1253.aString73, true, false, Static59.anInt1158, local166, -1, (long) local284, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != local502.aClass4_Sub2_9.aByte132, Static174.aClass120_22.method2690(Static266.anInt4796), 1011, (long) local1245.anInt5333);
								local284++;
							}
						}
					}
					if (local502.aClass4_Sub2_9 instanceof Interface22) {
						@Pc(1481) Interface22 local1481 = (Interface22) local502.aClass4_Sub2_9;
						@Pc(1488) Class181 local1488 = Static61.aClass246_7.method5497(local1481.method8490());
						if (local1488.anIntArray235 != null) {
							local1488 = local1488.method4279(Static301.aClass59_1);
						}
						if (local1488 != null) {
							if (Static285.aBoolean378 && local502.aClass4_Sub2_9.aByte132 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) {
								@Pc(1521) Class16 local1521 = Static229.anInt4250 == -1 ? null : Static302.aClass291_1.method6836(Static229.anInt4250);
								if ((Static427.anInt7391 & 0x4) != 0 && (local1521 == null || local1488.method4275(Static229.anInt4250, local1521.anInt256) != local1521.anInt256)) {
									Static150.method2214(local537, Static92.aString22 + " -> <col=00ffff>" + local1488.aString51, true, false, Static83.anInt6737, local166, -1, (long) local1481.hashCode(), false, Static493.aString96, 5, Static120.method1839(local537, local166, local1481));
								}
							}
							if (local502.aClass4_Sub2_9.aByte132 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) {
								@Pc(1583) String[] local1583 = local1488.aStringArray34;
								if (local1583 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local1583[local284] != null) {
											@Pc(1595) short local1595 = 0;
											if (local284 == 0) {
												local1595 = 50;
											}
											local306 = Static113.anInt2114;
											if (local284 == 1) {
												local1595 = 25;
											}
											if (local284 == 2) {
												local1595 = 6;
											}
											if (local284 == 3) {
												local1595 = 44;
											}
											if (local284 == local1488.anInt4777) {
												local306 = local1488.anInt4776;
											}
											if (local284 == 4) {
												local1595 = 1009;
											}
											if (local284 == local1488.anInt4787) {
												local306 = local1488.anInt4778;
											}
											Static150.method2214(local537, "<col=00ffff>" + local1488.aString51, true, false, local306, local166, -1, (long) local1481.hashCode(), false, local1583[local284], local1595, Static120.method1839(local537, local166, local1481));
										}
									}
								}
								Static150.method2214(local537, "<col=00ffff>" + local1488.aString51, true, false, Static59.anInt1158, local166, -1, (long) local1481.hashCode(), local502.aClass4_Sub2_9.aByte132 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, Static174.aClass120_22.method2690(Static266.anInt4796), 1006, (long) local1488.anInt4758);
							}
						}
					}
				}
			}
			if (Static428.aBoolean526) {
				Static583.method8431();
			}
		}
		Static123.method4148(false);
	}
}
