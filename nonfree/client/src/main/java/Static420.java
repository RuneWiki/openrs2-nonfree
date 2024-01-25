import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I")
	public static int method6044() {
		if (Static528.aFrame1 == null) {
			return Static502.aBoolean605 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Z")
	public static boolean method6045() throws IOException {
		if (Static235.aClass45_1 == null) {
			return false;
		}
		@Pc(79) int local79;
		if (Static491.aClass64_424 == null) {
			if (Static184.aBoolean299) {
				if (!Static235.aClass45_1.method841(1)) {
					return false;
				}
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				Static184.aBoolean299 = false;
				Static218.anInt4452 = 0;
				Static520.anInt8876++;
			}
			Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
			if (Static487.aClass4_Sub9_Sub1_2.method1037()) {
				if (!Static235.aClass45_1.method841(1)) {
					return false;
				}
				Static235.aClass45_1.method838(1, 1, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				Static218.anInt4452 = 0;
				Static520.anInt8876++;
			}
			Static184.aBoolean299 = true;
			@Pc(73) Class64[] local73 = Static476.method6627();
			local79 = Static487.aClass4_Sub9_Sub1_2.method1042();
			if (local79 < 0 || local79 >= local73.length) {
				throw new IOException("invo:" + local79 + " ip:" + Static487.aClass4_Sub9_Sub1_2.anInt7219);
			}
			Static491.aClass64_424 = local73[local79];
			Static474.anInt4412 = Static491.aClass64_424.anInt1704;
		}
		if (Static474.anInt4412 == -1) {
			if (!Static235.aClass45_1.method841(1)) {
				return false;
			}
			Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
			Static520.anInt8876++;
			Static218.anInt4452 = 0;
			Static474.anInt4412 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
		}
		if (Static474.anInt4412 == -2) {
			if (!Static235.aClass45_1.method841(2)) {
				return false;
			}
			Static235.aClass45_1.method838(2, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
			Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
			Static474.anInt4412 = Static487.aClass4_Sub9_Sub1_2.method5982();
			Static520.anInt8876 += 2;
			Static218.anInt4452 = 0;
		}
		if (Static474.anInt4412 > 0) {
			if (!Static235.aClass45_1.method841(Static474.anInt4412)) {
				return false;
			}
			Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
			Static235.aClass45_1.method838(Static474.anInt4412, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
			Static218.anInt4452 = 0;
			Static520.anInt8876 += Static474.anInt4412;
		}
		Static342.aClass64_294 = Static29.aClass64_37;
		Static29.aClass64_37 = Static202.aClass64_165;
		Static202.aClass64_165 = Static491.aClass64_424;
		if (Static491.aClass64_424 == Static39.aClass64_49) {
			Static414.method5939(Static555.aClass284_26);
			Static491.aClass64_424 = null;
			return true;
		}
		@Pc(446) int local446;
		@Pc(541) String local541;
		@Pc(235) boolean local235;
		@Pc(239) String local239;
		@Pc(243) String local243;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(255) boolean local255;
		@Pc(274) int local274;
		@Pc(505) String local505;
		@Pc(253) String local253;
		@Pc(308) boolean local308;
		if (Static491.aClass64_424 == Static227.aClass64_201) {
			while (Static487.aClass4_Sub9_Sub1_2.anInt7219 < Static474.anInt4412) {
				local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
				local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
				local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
				local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
				local251 = Static487.aClass4_Sub9_Sub1_2.method6015();
				local253 = "";
				local255 = false;
				if (local247 > 0) {
					local253 = Static487.aClass4_Sub9_Sub1_2.method6010();
					local255 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
				}
				for (local274 = 0; local274 < Static282.anInt5285; local274++) {
					if (local235) {
						if (local243.equals(Static300.aStringArray26[local274])) {
							Static300.aStringArray26[local274] = local239;
							Static38.aStringArray3[local274] = local243;
							local239 = null;
							break;
						}
					} else if (local239.equals(Static300.aStringArray26[local274])) {
						if (local247 != Static26.anIntArray417[local274]) {
							local308 = true;
							for (@Pc(315) Class26_Sub1_Sub2 local315 = (Class26_Sub1_Sub2) Static259.aClass8_3.method110(); local315 != null; local315 = (Class26_Sub1_Sub2) Static259.aClass8_3.method113()) {
								if (local315.aString78.equals(local239)) {
									if (local247 != 0 && local315.aShort89 == 0) {
										local308 = false;
										local315.method7575();
									} else if (local247 == 0 && local315.aShort89 != 0) {
										local315.method7575();
										local308 = false;
									}
								}
							}
							if (local308) {
								Static259.aClass8_3.method109(new Class26_Sub1_Sub2(local239, local247));
							}
							Static26.anIntArray417[local274] = local247;
						}
						Static38.aStringArray3[local274] = local243;
						Static12.aStringArray1[local274] = local253;
						Static506.anIntArray669[local274] = local251;
						local239 = null;
						Static520.aBooleanArray38[local274] = local255;
						break;
					}
				}
				if (local239 != null && Static282.anInt5285 < 200) {
					Static300.aStringArray26[Static282.anInt5285] = local239;
					Static38.aStringArray3[Static282.anInt5285] = local243;
					Static26.anIntArray417[Static282.anInt5285] = local247;
					Static12.aStringArray1[Static282.anInt5285] = local253;
					Static506.anIntArray669[Static282.anInt5285] = local251;
					Static520.aBooleanArray38[Static282.anInt5285] = local255;
					Static282.anInt5285++;
				}
			}
			Static506.anInt8762 = Static191.anInt5895;
			Static98.anInt2440 = 2;
			local79 = Static282.anInt5285;
			while (local79 > 0) {
				local235 = true;
				local79--;
				for (local446 = 0; local446 < local79; local446++) {
					if (Static238.aClass300_10.anInt7993 != Static26.anIntArray417[local446] && Static26.anIntArray417[local446 + 1] == Static238.aClass300_10.anInt7993 || Static26.anIntArray417[local446] == 0 && Static26.anIntArray417[local446 + 1] != 0) {
						local247 = Static26.anIntArray417[local446];
						Static26.anIntArray417[local446] = Static26.anIntArray417[local446 + 1];
						Static26.anIntArray417[local446 + 1] = local247;
						local505 = Static12.aStringArray1[local446];
						Static12.aStringArray1[local446] = Static12.aStringArray1[local446 + 1];
						Static12.aStringArray1[local446 + 1] = local505;
						local253 = Static300.aStringArray26[local446];
						Static300.aStringArray26[local446] = Static300.aStringArray26[local446 + 1];
						Static300.aStringArray26[local446 + 1] = local253;
						local541 = Static38.aStringArray3[local446];
						Static38.aStringArray3[local446] = Static38.aStringArray3[local446 + 1];
						Static38.aStringArray3[local446 + 1] = local541;
						local274 = Static506.anIntArray669[local446];
						Static506.anIntArray669[local446] = Static506.anIntArray669[local446 + 1];
						Static506.anIntArray669[local446 + 1] = local274;
						local308 = Static520.aBooleanArray38[local446];
						Static520.aBooleanArray38[local446] = Static520.aBooleanArray38[local446 + 1];
						local235 = false;
						Static520.aBooleanArray38[local446 + 1] = local308;
					}
				}
				if (local235) {
					break;
				}
			}
			Static491.aClass64_424 = null;
			return true;
		}
		@Pc(614) int local614;
		if (Static196.aClass64_157 == Static491.aClass64_424) {
			local614 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
			Static511.aClass335_2.method7431(local79, local614);
			Static491.aClass64_424 = null;
			return true;
		}
		@Pc(712) int local712;
		@Pc(718) int local718;
		@Pc(660) boolean local660;
		@Pc(670) int local670;
		@Pc(685) int local685;
		@Pc(720) int local720;
		@Pc(1175) int local1175;
		@Pc(837) int local837;
		if (Static83.aClass64_490 == Static491.aClass64_424) {
			local614 = Static487.aClass4_Sub9_Sub1_2.method5988();
			local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
			local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local247 = Static487.aClass4_Sub9_Sub1_2.method6014();
			local251 = Static487.aClass4_Sub9_Sub1_2.method5994();
			local660 = (local247 & 0x80) != 0;
			if (local614 >> 30 == 0) {
				@Pc(818) Class318 local818;
				@Pc(834) Class77 local834;
				@Pc(884) Class77 local884;
				if (local614 >> 29 != 0) {
					local670 = local614 & 0xFFFF;
					@Pc(779) Class4_Sub50 local779 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local670);
					if (local779 != null) {
						if (local79 == 65535) {
							local79 = -1;
						}
						@Pc(789) Class10_Sub1_Sub2_Sub1 local789 = local779.aClass10_Sub1_Sub2_Sub1_1;
						@Pc(791) boolean local791 = true;
						local718 = local660 ? local789.anInt8529 : local789.anInt8504;
						if (local79 != -1 && local718 != -1) {
							if (local718 == local79) {
								local818 = Static206.aClass275_1.method6050(local79);
								if (local818.aBoolean610 && local818.anInt8788 != -1) {
									local834 = Static168.aClass327_2.method7326(local818.anInt8788);
									local837 = local834.anInt2586;
									if (local837 == 0 || local837 == 2) {
										local791 = false;
									} else if (local837 == 1) {
										local791 = true;
									}
								}
							} else {
								local818 = Static206.aClass275_1.method6050(local79);
								@Pc(868) Class318 local868 = Static206.aClass275_1.method6050(local718);
								if (local818.anInt8788 != -1 && local868.anInt8788 != -1) {
									local884 = Static168.aClass327_2.method7326(local818.anInt8788);
									@Pc(890) Class77 local890 = Static168.aClass327_2.method7326(local868.anInt8788);
									if (local890.anInt2582 > local884.anInt2582) {
										local791 = false;
									}
								}
							}
						}
						if (local791) {
							if (local660) {
								local789.anInt8516 = local446 + Static237.anInt7561;
								local789.anInt8515 = 1;
								local789.anInt8529 = local79;
								local789.anInt8489 = local247 & 0x7;
								local789.anInt8486 = local251;
								local789.anInt8460 = 0;
								local789.anInt8519 = 0;
								if (local789.anInt8516 > Static237.anInt7561) {
									local789.anInt8460 = -1;
								}
								if (local789.anInt8529 != -1 && local789.anInt8516 == Static237.anInt7561) {
									local720 = Static206.aClass275_1.method6050(local789.anInt8529).anInt8788;
									if (local720 != -1) {
										local834 = Static168.aClass327_2.method7326(local720);
										if (local834 != null && local834.anIntArray238 != null) {
											Static240.method4084(local789.aByte101, local789.anInt8934, local789.anInt8929, 0, local834, false);
										}
									}
								}
							} else {
								local789.anInt8479 = local251;
								local789.anInt8507 = 1;
								local789.anInt8481 = 0;
								local789.anInt8504 = local79;
								local789.anInt8514 = local446 + Static237.anInt7561;
								local789.anInt8494 = local247 & 0x7;
								local789.anInt8500 = 0;
								if (local789.anInt8514 > Static237.anInt7561) {
									local789.anInt8500 = -1;
								}
								if (local789.anInt8504 != -1 && local789.anInt8514 == Static237.anInt7561) {
									local720 = Static206.aClass275_1.method6050(local789.anInt8504).anInt8788;
									if (local720 != -1) {
										local834 = Static168.aClass327_2.method7326(local720);
										if (local834 != null && local834.anIntArray238 != null) {
											Static240.method4084(local789.aByte101, local789.anInt8934, local789.anInt8929, 0, local834, false);
										}
									}
								}
							}
						}
					}
				} else if (local614 >> 28 != 0) {
					local670 = local614 & 0xFFFF;
					@Pc(1073) Class10_Sub1_Sub2_Sub2 local1073;
					if (Static416.anInt7186 == local670) {
						local1073 = Static129.aClass10_Sub1_Sub2_Sub2_1;
					} else {
						local1073 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local670];
					}
					if (local1073 != null) {
						if (local79 == 65535) {
							local79 = -1;
						}
						local308 = true;
						local712 = local660 ? local1073.anInt8529 : local1073.anInt8504;
						@Pc(1172) Class77 local1172;
						if (local79 != -1 && local712 != -1) {
							@Pc(1116) Class318 local1116;
							if (local712 == local79) {
								local1116 = Static206.aClass275_1.method6050(local79);
								if (local1116.aBoolean610 && local1116.anInt8788 != -1) {
									local1172 = Static168.aClass327_2.method7326(local1116.anInt8788);
									local1175 = local1172.anInt2586;
									if (local1175 == 0 || local1175 == 2) {
										local308 = false;
									} else if (local1175 == 1) {
										local308 = true;
									}
								}
							} else {
								local1116 = Static206.aClass275_1.method6050(local79);
								local818 = Static206.aClass275_1.method6050(local712);
								if (local1116.anInt8788 != -1 && local818.anInt8788 != -1) {
									local834 = Static168.aClass327_2.method7326(local1116.anInt8788);
									local884 = Static168.aClass327_2.method7326(local818.anInt8788);
									if (local834.anInt2582 < local884.anInt2582) {
										local308 = false;
									}
								}
							}
						}
						if (local308) {
							if (local660) {
								local1073.anInt8529 = local79;
								local1073.anInt8489 = local247 & 0x7;
								local1073.anInt8486 = local251;
								local1073.anInt8516 = Static237.anInt7561 + local446;
								local1073.anInt8460 = 0;
								local1073.anInt8515 = 1;
								local1073.anInt8519 = 0;
								if (Static237.anInt7561 < local1073.anInt8516) {
									local1073.anInt8460 = -1;
								}
								if (local1073.anInt8529 == 65535) {
									local1073.anInt8529 = -1;
								}
								if (local1073.anInt8529 != -1 && Static237.anInt7561 == local1073.anInt8516) {
									local718 = Static206.aClass275_1.method6050(local1073.anInt8529).anInt8788;
									if (local718 != -1) {
										local1172 = Static168.aClass327_2.method7326(local718);
										if (local1172 != null && local1172.anIntArray238 != null) {
											Static240.method4084(local1073.aByte101, local1073.anInt8934, local1073.anInt8929, 0, local1172, Static129.aClass10_Sub1_Sub2_Sub2_1 == local1073);
										}
									}
								}
							} else {
								local1073.anInt8514 = Static237.anInt7561 + local446;
								local1073.anInt8504 = local79;
								local1073.anInt8494 = local247 & 0x7;
								local1073.anInt8479 = local251;
								local1073.anInt8481 = 0;
								local1073.anInt8500 = 0;
								local1073.anInt8507 = 1;
								if (Static237.anInt7561 < local1073.anInt8514) {
									local1073.anInt8500 = -1;
								}
								if (local1073.anInt8504 == 65535) {
									local1073.anInt8504 = -1;
								}
								if (local1073.anInt8504 != -1 && local1073.anInt8514 == Static237.anInt7561) {
									local718 = Static206.aClass275_1.method6050(local1073.anInt8504).anInt8788;
									if (local718 != -1) {
										local1172 = Static168.aClass327_2.method7326(local718);
										if (local1172 != null && local1172.anIntArray238 != null) {
											Static240.method4084(local1073.aByte101, local1073.anInt8934, local1073.anInt8929, 0, local1172, local1073 == Static129.aClass10_Sub1_Sub2_Sub2_1);
										}
									}
								}
							}
						}
					}
				}
			} else {
				local670 = local614 >> 28 & 0x3;
				local274 = (local614 >> 14 & 0x3FFF) - Static373.anInt6695;
				local685 = (local614 & 0x3FFF) - Static6.anInt97;
				if (local274 >= 0 && local685 >= 0 && Static38.anInt740 > local274 && Static38.anInt741 > local685) {
					local712 = local274 * 512 + 256;
					local718 = local685 * 512 + 256;
					local720 = local670;
					if (local670 < 3 && Static163.method3178(local685, local274)) {
						local720 = local670 + 1;
					}
					@Pc(755) Class10_Sub1_Sub4 local755 = new Class10_Sub1_Sub4(local79, 0, Static237.anInt7561, local670, local720, local712, Static160.method3164(local712, local670, local718) - local251, local718, local274, local274, local685, local685, local247 & 0x7);
					Static328.aClass124_29.method3275(new Class4_Sub7_Sub9(local755));
				}
			}
			Static491.aClass64_424 = null;
			return true;
		} else if (Static389.aClass64_331 == Static491.aClass64_424) {
			Static414.method5939(Static368.aClass284_16);
			Static491.aClass64_424 = null;
			return true;
		} else if (Static435.aClass64_353 == Static491.aClass64_424) {
			Static472.aClass104_4 = Static390.method5715(Static487.aClass4_Sub9_Sub1_2.method6015());
			Static491.aClass64_424 = null;
			return true;
		} else {
			@Pc(1443) int local1443;
			@Pc(1427) boolean local1427;
			if (Static491.aClass64_424 == Static439.aClass64_481) {
				local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
				local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
				local1427 = (local79 & 0x1) == 1;
				Static76.method1359(local614, local1427);
				local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
				for (local251 = 0; local251 < local247; local251++) {
					local1443 = Static487.aClass4_Sub9_Sub1_2.method5994();
					local670 = Static487.aClass4_Sub9_Sub1_2.method6014();
					if (local670 == 255) {
						local670 = Static487.aClass4_Sub9_Sub1_2.method5965();
					}
					Static457.method6435(local614, local1427, local670, local1443 - 1, local251);
				}
				Static481.anIntArray641[Static83.anInt9715++ & 0x1F] = local614;
				Static491.aClass64_424 = null;
				return true;
			} else if (Static491.aClass64_424 == Static299.aClass64_259) {
				Static414.method5939(Static270.aClass284_13);
				Static491.aClass64_424 = null;
				return true;
			} else if (Static584.aClass64_484 == Static491.aClass64_424) {
				local614 = Static487.aClass4_Sub9_Sub1_2.method6005();
				local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
				local1427 = (local79 & 0x1) == 1;
				Static346.method5158(local1427, local614);
				Static481.anIntArray641[Static83.anInt9715++ & 0x1F] = local614;
				Static491.aClass64_424 = null;
				return true;
			} else if (Static491.aClass64_424 == Static11.aClass64_12) {
				Static414.method5939(Static498.aClass284_24);
				Static491.aClass64_424 = null;
				return true;
			} else if (Static408.aClass64_341 == Static491.aClass64_424) {
				local614 = Static487.aClass4_Sub9_Sub1_2.method5977();
				local79 = Static487.aClass4_Sub9_Sub1_2.method5982();
				local446 = Static487.aClass4_Sub9_Sub1_2.method6026();
				if (Static84.method1580(local614)) {
					Static124.method2650(local446, local79);
				}
				Static491.aClass64_424 = null;
				return true;
			} else if (Static491.aClass64_424 == Static231.aClass64_207) {
				local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
				if (local614 == 65535) {
					local614 = -1;
				}
				local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
				local446 = Static487.aClass4_Sub9_Sub1_2.method5973();
				if (Static84.method1580(local79)) {
					Static494.method7057(local446, 1, -1, local614);
				}
				Static491.aClass64_424 = null;
				return true;
			} else if (Static491.aClass64_424 == Static366.aClass64_318) {
				Static362.method5445(false);
				Static491.aClass64_424 = null;
				return false;
			} else {
				@Pc(1674) long local1674;
				@Pc(1680) Class4_Sub31 local1680;
				@Pc(1689) Class4_Sub31 local1689;
				if (Static491.aClass64_424 == Static350.aClass64_297) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method6026();
					local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
					if (local79 == 65535) {
						local79 = -1;
					}
					local446 = Static487.aClass4_Sub9_Sub1_2.method5977();
					local247 = Static487.aClass4_Sub9_Sub1_2.method6026();
					local251 = Static487.aClass4_Sub9_Sub1_2.method5982();
					if (local251 == 65535) {
						local251 = -1;
					}
					if (Static84.method1580(local446)) {
						for (local1443 = local251; local1443 <= local79; local1443++) {
							local1674 = ((long) local247 << 32) + ((long) local1443);
							local1680 = (Class4_Sub31) Static446.aClass183_31.method4289(local1674);
							if (local1680 != null) {
								local1689 = new Class4_Sub31(local614, local1680.anInt5881);
								local1680.method8013();
							} else if (local1443 == -1) {
								local1689 = new Class4_Sub31(local614, Static92.method2118(local247).aClass4_Sub31_1.anInt5881);
							} else {
								local1689 = new Class4_Sub31(local614, -1);
							}
							Static446.aClass183_31.method4282(local1674, local1689);
						}
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static491.aClass64_424 == Static161.aClass64_136) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method6005();
					local79 = Static487.aClass4_Sub9_Sub1_2.method6018();
					local446 = Static487.aClass4_Sub9_Sub1_2.method5973();
					if (Static84.method1580(local614)) {
						Static309.method4767(local79, local446);
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static369.aClass64_321 == Static491.aClass64_424) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method5965();
					local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
					local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
					if (Static84.method1580(local79)) {
						Static387.method7902(local614, local446);
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static150.aClass64_436 == Static491.aClass64_424) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method6027();
					local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
					local446 = Static487.aClass4_Sub9_Sub1_2.method5977();
					if (Static84.method1580(local446)) {
						if (local614 == 2) {
							Static591.method7950();
						}
						Static249.anInt4945 = local79;
						Static263.method6566(local79);
						Static435.method6179(false);
						Static205.method3638(Static249.anInt4945);
						for (local247 = 0; local247 < 100; local247++) {
							Static271.aBooleanArray21[local247] = true;
						}
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static135.aClass64_119 == Static491.aClass64_424) {
					local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
					@Pc(1857) byte[] local1857 = new byte[Static474.anInt4412 - 1];
					Static487.aClass4_Sub9_Sub1_2.method5966(Static474.anInt4412 - 1, local1857);
					Static263.method6568(local235, local1857);
					Static491.aClass64_424 = null;
					return true;
				} else if (Static491.aClass64_424 == Static217.aClass64_183) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
					local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
					local446 = Static487.aClass4_Sub9_Sub1_2.method5977();
					local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
					local251 = Static487.aClass4_Sub9_Sub1_2.method5988();
					if (Static84.method1580(local79)) {
						Static587.method2114(local614, local247, local446, local251);
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static200.aClass64_164 == Static491.aClass64_424) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
					if (local614 == 65535) {
						local614 = -1;
					}
					local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
					local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
					local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
					Static560.method7718(local446, local247, local614, true, local79);
					Static491.aClass64_424 = null;
					return true;
				} else if (Static109.aClass64_102 == Static491.aClass64_424) {
					Static22.method427(Static487.aClass4_Sub9_Sub1_2, Static474.anInt4412);
					Static491.aClass64_424 = null;
					return true;
				} else if (Static408.aClass64_340 == Static491.aClass64_424) {
					local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
					local79 = Static487.aClass4_Sub9_Sub1_2.method5988();
					local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
					if (Static84.method1580(local446)) {
						Static52.method799(local614, local79);
					}
					Static491.aClass64_424 = null;
					return true;
				} else if (Static491.aClass64_424 == Static204.aClass64_171) {
					if (Static528.aFrame1 != null) {
						Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
					}
					@Pc(2000) byte[] local2000 = new byte[Static474.anInt4412];
					Static487.aClass4_Sub9_Sub1_2.method1044(Static474.anInt4412, local2000);
					local239 = Static519.method7291(local2000, 0, Static474.anInt4412);
					Static8.method7646(Static147.aClass161_4, local239, true, Static403.anInt6994 == 1);
					Static491.aClass64_424 = null;
					return true;
				} else if (Static208.aClass64_173 == Static491.aClass64_424) {
					Static393.anInt9509 = Static487.aClass4_Sub9_Sub1_2.method5974();
					Static448.aBoolean537 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
					Static491.aClass64_424 = null;
					return true;
				} else {
					@Pc(2077) String local2077;
					if (Static491.aClass64_424 == Static436.aClass64_359) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method6027();
						local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (local79 == 65535) {
							local79 = -1;
						}
						local446 = Static487.aClass4_Sub9_Sub1_2.method6009();
						local2077 = Static487.aClass4_Sub9_Sub1_2.method6010();
						if (local446 >= 1 && local446 <= 8) {
							if (local2077.equalsIgnoreCase("null")) {
								local2077 = null;
							}
							Static282.aStringArray24[local446 - 1] = local2077;
							Static338.anIntArray486[local446 - 1] = local79;
							Static157.aBooleanArray23[local446 - 1] = local614 == 0;
						}
						Static491.aClass64_424 = null;
						return true;
					}
					@Pc(2122) byte local2122;
					if (Static491.aClass64_424 == Static353.aClass64_305) {
						local2122 = Static487.aClass4_Sub9_Sub1_2.method5981();
						local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
						local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (Static84.method1580(local446)) {
							Static124.method2650(local2122, local79);
						}
						Static491.aClass64_424 = null;
						return true;
					} else if (Static172.aClass64_150 == Static491.aClass64_424) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
						local79 = Static487.aClass4_Sub9_Sub1_2.method5965();
						local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
						local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
						local251 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (Static84.method1580(local247)) {
							Static494.method7057(local79, 7, local446, local614 << 16 | local251);
						}
						Static491.aClass64_424 = null;
						return true;
					} else if (Static491.aClass64_424 == Static31.aClass64_43) {
						Static414.method5939(Static275.aClass284_14);
						Static491.aClass64_424 = null;
						return true;
					} else if (Static491.aClass64_424 == Static93.aClass64_89) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method5965();
						local79 = Static487.aClass4_Sub9_Sub1_2.method6005();
						local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (local446 == 65535) {
							local446 = -1;
						}
						if (Static84.method1580(local79)) {
							Static208.method3669(local614, local446);
						}
						Static491.aClass64_424 = null;
						return true;
					} else if (Static57.aClass64_57 == Static491.aClass64_424) {
						Static245.aString59 = Static474.anInt4412 <= 2 ? Static275.aClass198_25.method4407(Static56.anInt953) : Static487.aClass4_Sub9_Sub1_2.method6010();
						Static528.anInt8988 = Static474.anInt4412 > 0 ? Static487.aClass4_Sub9_Sub1_2.method5982() : -1;
						if (Static528.anInt8988 == 65535) {
							Static528.anInt8988 = -1;
						}
						Static491.aClass64_424 = null;
						return true;
					} else if (Static69.aClass64_70 == Static491.aClass64_424) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method6027();
						local79 = Static487.aClass4_Sub9_Sub1_2.method6009();
						local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (local446 == 65535) {
							local446 = -1;
						}
						Static178.method3349(local79, local446, local614);
						Static491.aClass64_424 = null;
						return true;
					} else if (Static511.aClass64_56 == Static491.aClass64_424) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method5971();
						local79 = Static487.aClass4_Sub9_Sub1_2.method5982();
						if (local79 == 65535) {
							local79 = -1;
						}
						local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
						Static466.method6512(local446, local614, local79);
						Static491.aClass64_424 = null;
						return true;
					} else if (Static491.aClass64_424 == Static6.aClass64_7) {
						Static487.aClass4_Sub9_Sub1_2.anInt7219 += 28;
						if (Static487.aClass4_Sub9_Sub1_2.method6024()) {
							Static471.method6563(Static487.aClass4_Sub9_Sub1_2.anInt7219 - 28, Static487.aClass4_Sub9_Sub1_2);
						}
						Static491.aClass64_424 = null;
						return true;
					} else if (Static439.aClass64_480 == Static491.aClass64_424) {
						local614 = Static487.aClass4_Sub9_Sub1_2.method6014();
						local79 = Static487.aClass4_Sub9_Sub1_2.method5965();
						local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
						if (Static84.method1580(local446)) {
							Static536.method7439(local614, local79);
						}
						Static491.aClass64_424 = null;
						return true;
					} else {
						@Pc(2405) long local2405;
						@Pc(2410) long local2410;
						if (Static491.aClass64_424 == Static541.aClass64_454) {
							local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
							local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
							local243 = local239;
							if (local235) {
								local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
							}
							local2405 = Static487.aClass4_Sub9_Sub1_2.method5982();
							local2410 = Static487.aClass4_Sub9_Sub1_2.method6023();
							local274 = Static487.aClass4_Sub9_Sub1_2.method6015();
							local685 = Static487.aClass4_Sub9_Sub1_2.method5982();
							@Pc(2426) long local2426 = (local2405 << 32) + local2410;
							@Pc(2428) boolean local2428 = false;
							local1175 = 0;
							while (true) {
								if (local1175 >= 100) {
									if (local274 <= 1 && Static15.method308(local243)) {
										local2428 = true;
									}
									break;
								}
								if (Static584.aLongArray17[local1175] == local2426) {
									local2428 = true;
									break;
								}
								local1175++;
							}
							if (!local2428 && Static102.anInt2531 == 0) {
								Static584.aLongArray17[Static567.anInt9473] = local2426;
								Static567.anInt9473 = (Static567.anInt9473 + 1) % 100;
								@Pc(2484) String local2484 = Static320.aClass363_1.method8038(local685).method7169(Static487.aClass4_Sub9_Sub1_2);
								if (local274 == 2) {
									Static140.method2841(local239, 18, "<img=1>" + local239, 0, local2484, null, local685, "<img=1>" + local243);
								} else if (local274 == 1) {
									Static140.method2841(local239, 18, "<img=0>" + local239, 0, local2484, null, local685, "<img=0>" + local243);
								} else {
									Static140.method2841(local239, 18, local239, 0, local2484, null, local685, local243);
								}
							}
							Static491.aClass64_424 = null;
							return true;
						} else if (Static478.aClass64_418 == Static491.aClass64_424) {
							Static304.anInt5550 = Static487.aClass4_Sub9_Sub1_2.method6015();
							Static204.anInt4280 = Static191.anInt5895;
							Static491.aClass64_424 = null;
							return true;
						} else if (Static320.aClass64_288 == Static491.aClass64_424) {
							Static414.method5939(Static56.aClass284_4);
							Static491.aClass64_424 = null;
							return true;
						} else if (Static491.aClass64_424 == Static312.aClass64_491) {
							local614 = Static487.aClass4_Sub9_Sub1_2.method5978();
							local79 = Static487.aClass4_Sub9_Sub1_2.method6026();
							local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
							local2077 = "";
							local505 = local2077;
							if ((local446 & 0x1) != 0) {
								local2077 = Static487.aClass4_Sub9_Sub1_2.method6010();
								if ((local446 & 0x2) == 0) {
									local505 = local2077;
								} else {
									local505 = Static487.aClass4_Sub9_Sub1_2.method6010();
								}
							}
							local253 = Static487.aClass4_Sub9_Sub1_2.method6010();
							if (local614 == 99) {
								Static444.method6281(local253);
							} else if (local505.equals("") || !Static15.method308(local505)) {
								Static410.method5899(local2077, local2077, local253, local614, local505, local79);
							} else {
								Static491.aClass64_424 = null;
								return true;
							}
							Static491.aClass64_424 = null;
							return true;
						} else if (Static464.aClass64_422 == Static491.aClass64_424) {
							Static511.aClass335_2.method7426();
							Static491.aClass64_424 = null;
							Static501.anInt8685 += 32;
							return true;
						} else if (Static491.aClass64_424 == Static269.aClass64_231) {
							Static376.method5609(Static487.aClass4_Sub9_Sub1_2.method6010());
							Static491.aClass64_424 = null;
							return true;
						} else if (Static27.aClass64_30 == Static491.aClass64_424) {
							Static414.method5939(Static398.aClass284_18);
							Static491.aClass64_424 = null;
							return true;
						} else if (Static491.aClass64_424 == Static518.aClass64_435) {
							Static414.method5939(Static498.aClass284_23);
							Static491.aClass64_424 = null;
							return true;
						} else {
							@Pc(2735) boolean local2735;
							if (Static491.aClass64_424 == Static21.aClass64_28) {
								local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
								local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
								local243 = local239;
								if (local235) {
									local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
								}
								local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
								local2735 = false;
								if (local247 <= 1) {
									if (Static448.aBoolean537 && !Static251.aBoolean372 || Static266.aBoolean387) {
										local2735 = true;
									} else if (local247 <= 1 && Static15.method308(local243)) {
										local2735 = true;
									}
								}
								if (!local2735 && Static102.anInt2531 == 0) {
									local253 = Static95.method7585(Static158.method3147(Static487.aClass4_Sub9_Sub1_2));
									if (local247 == 2) {
										Static140.method2841(local239, 24, "<img=1>" + local239, 0, local253, null, -1, "<img=1>" + local243);
									} else if (local247 == 1) {
										Static140.method2841(local239, 24, "<img=0>" + local239, 0, local253, null, -1, "<img=0>" + local243);
									} else {
										Static140.method2841(local239, 24, local239, 0, local253, null, -1, local243);
									}
								}
								Static491.aClass64_424 = null;
								return true;
							} else if (Static154.aClass64_135 == Static491.aClass64_424) {
								Static451.anInt9796 = Static487.aClass4_Sub9_Sub1_2.method6015();
								Static491.aClass64_424 = null;
								return true;
							} else if (Static491.aClass64_424 == Static370.aClass64_322) {
								Static362.method5445(Static570.aBoolean672);
								Static491.aClass64_424 = null;
								return false;
							} else if (Static491.aClass64_424 == Static451.aClass64_493) {
								local614 = Static487.aClass4_Sub9_Sub1_2.method6014();
								local79 = local614 >> 2;
								local446 = local614 & 0x3;
								local247 = Static528.anIntArray683[local79];
								local251 = Static487.aClass4_Sub9_Sub1_2.method6005();
								if (local251 == 65535) {
									local251 = -1;
								}
								local1443 = Static487.aClass4_Sub9_Sub1_2.method5988();
								local670 = local1443 >> 28 & 0x3;
								local274 = local1443 >> 14 & 0x3FFF;
								local274 -= Static373.anInt6695;
								local685 = local1443 & 0x3FFF;
								local685 -= Static6.anInt97;
								Static582.method7877(local79, local247, local251, local446, local685, local670, local274);
								Static491.aClass64_424 = null;
								return true;
							} else if (Static491.aClass64_424 == Static424.aClass64_346) {
								local614 = Static487.aClass4_Sub9_Sub1_2.method6026();
								local79 = Static487.aClass4_Sub9_Sub1_2.method6014();
								local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
								Static339.anIntArray487[local446] = local614;
								Static365.anIntArray528[local446] = local79;
								Static384.anIntArray545[local446] = 1;
								local247 = Static6.anIntArray8[local446] - 1;
								for (local251 = 0; local251 < local247; local251++) {
									if (Exception_Sub1.anIntArray601[local251] <= local614) {
										Static384.anIntArray545[local446] = local251 + 2;
									}
								}
								Static74.anIntArray202[Static164.anInt3572++ & 0x1F] = local446;
								Static491.aClass64_424 = null;
								return true;
							} else {
								@Pc(3008) String local3008;
								@Pc(3056) Class193 local3056;
								if (Static491.aClass64_424 == Static320.aClass64_287) {
									local3008 = Static487.aClass4_Sub9_Sub1_2.method6010();
									local1427 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
									if (local1427) {
										local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
									} else {
										local239 = local3008;
									}
									local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
									@Pc(3037) byte local3037 = Static487.aClass4_Sub9_Sub1_2.method6021();
									local660 = false;
									if (local3037 == -128) {
										local660 = true;
									}
									if (local660) {
										if (Static63.anInt1182 == 0) {
											Static491.aClass64_424 = null;
											return true;
										}
										for (local670 = 0; local670 < Static63.anInt1182 && (!Static168.aClass193Array1[local670].aString65.equals(local239) || local247 != Static168.aClass193Array1[local670].anInt5149); local670++) {
										}
										if (Static63.anInt1182 > local670) {
											while (Static63.anInt1182 - 1 > local670) {
												Static168.aClass193Array1[local670] = Static168.aClass193Array1[local670 + 1];
												local670++;
											}
											Static63.anInt1182--;
											Static168.aClass193Array1[Static63.anInt1182] = null;
										}
									} else {
										local541 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local3056 = new Class193();
										local3056.aString66 = local3008;
										local3056.aString65 = local239;
										local3056.aString64 = Static488.method6774(local3056.aString65);
										local3056.aString67 = local541;
										local3056.aByte66 = local3037;
										local3056.anInt5149 = local247;
										for (local685 = Static63.anInt1182 - 1; local685 >= 0; local685--) {
											local712 = Static168.aClass193Array1[local685].aString64.compareTo(local3056.aString64);
											if (local712 == 0) {
												Static168.aClass193Array1[local685].anInt5149 = local247;
												Static168.aClass193Array1[local685].aByte66 = local3037;
												Static168.aClass193Array1[local685].aString67 = local541;
												if (local239.equals(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93)) {
													Static535.aByte104 = local3037;
												}
												Static335.anInt6553 = Static191.anInt5895;
												Static491.aClass64_424 = null;
												return true;
											}
											if (local712 < 0) {
												break;
											}
										}
										if (Static168.aClass193Array1.length <= Static63.anInt1182) {
											Static491.aClass64_424 = null;
											return true;
										}
										for (local712 = Static63.anInt1182 - 1; local712 > local685; local712--) {
											Static168.aClass193Array1[local712 + 1] = Static168.aClass193Array1[local712];
										}
										if (Static63.anInt1182 == 0) {
											Static168.aClass193Array1 = new Class193[100];
										}
										Static168.aClass193Array1[local685 + 1] = local3056;
										Static63.anInt1182++;
										if (local239.equals(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93)) {
											Static535.aByte104 = local3037;
										}
									}
									Static491.aClass64_424 = null;
									Static335.anInt6553 = Static191.anInt5895;
									return true;
								} else if (Static491.aClass64_424 == Static315.aClass64_280) {
									Static286.anInt8741 = Static487.aClass4_Sub9_Sub1_2.method6015();
									for (local614 = 0; local614 < Static286.anInt8741; local614++) {
										Static101.aStringArray5[local614] = Static487.aClass4_Sub9_Sub1_2.method6010();
										Static383.aStringArray29[local614] = Static487.aClass4_Sub9_Sub1_2.method6010();
										if (Static383.aStringArray29[local614].equals("")) {
											Static383.aStringArray29[local614] = Static101.aStringArray5[local614];
										}
										Static550.aStringArray38[local614] = Static487.aClass4_Sub9_Sub1_2.method6010();
										Static229.aStringArray21[local614] = Static487.aClass4_Sub9_Sub1_2.method6010();
										if (Static229.aStringArray21[local614].equals("")) {
											Static229.aStringArray21[local614] = Static550.aStringArray38[local614];
										}
										Static410.aBooleanArray29[local614] = false;
									}
									Static491.aClass64_424 = null;
									Static506.anInt8762 = Static191.anInt5895;
									return true;
								} else if (Static261.aClass64_229 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method6027();
									@Pc(3347) int[] local3347 = new int[4];
									for (local446 = 0; local446 < 4; local446++) {
										local3347[local446] = Static487.aClass4_Sub9_Sub1_2.method5982();
									}
									local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
									@Pc(3374) Class4_Sub50 local3374 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local247);
									if (local3374 != null) {
										Static136.method2808(local614, local3374.aClass10_Sub1_Sub2_Sub1_1, local3347);
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static491.aClass64_424 == Static272.aClass64_233) {
									Static552.method7616(false);
									Static491.aClass64_424 = null;
									return true;
								} else if (Static379.aClass64_338 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method6009();
									local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
									if (Static84.method1580(local79)) {
										Static187.anInt8848 = local614;
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static491.aClass64_424 == Static286.aClass64_431) {
									Static414.method5939(Static427.aClass284_21);
									Static491.aClass64_424 = null;
									return true;
								} else if (Static444.aClass64_375 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
									local79 = Static487.aClass4_Sub9_Sub1_2.method6026();
									if (Static84.method1580(local614)) {
										@Pc(3451) Class4_Sub49 local3451 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local79);
										if (local3451 != null) {
											Static597.method8029(local3451, false, true);
										}
										if (Static74.aClass115_2 != null) {
											Static330.method4950(Static74.aClass115_2);
											Static74.aClass115_2 = null;
										}
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static439.aClass64_482 == Static491.aClass64_424) {
									local2122 = Static487.aClass4_Sub9_Sub1_2.method6004();
									local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
									Static511.aClass335_2.method7429(local79, local2122);
									Static491.aClass64_424 = null;
									return true;
								} else if (Static440.aClass64_366 == Static491.aClass64_424) {
									Static530.anInt9013 = Static487.aClass4_Sub9_Sub1_2.method6009();
									Static81.anInt9840 = Static487.aClass4_Sub9_Sub1_2.method6025() << 3;
									Static314.anInt9407 = Static487.aClass4_Sub9_Sub1_2.method6021() << 3;
									for (@Pc(3519) Class4_Sub15 local3519 = (Class4_Sub15) Static486.aClass183_34.method4286(); local3519 != null; local3519 = (Class4_Sub15) Static486.aClass183_34.method4283()) {
										local79 = (int) (local3519.aLong307 >> 28 & 0x3L);
										local446 = (int) (local3519.aLong307 & 0x3FFFL);
										local247 = local446 - Static373.anInt6695;
										local251 = (int) (local3519.aLong307 >> 14 & 0x3FFFL);
										local1443 = local251 - Static6.anInt97;
										if (Static530.anInt9013 == local79 && local247 >= Static314.anInt9407 && local247 < Static314.anInt9407 + 8 && local1443 >= Static81.anInt9840 && local1443 < Static81.anInt9840 + 8) {
											local3519.method8013();
											if (local247 >= 0 && local1443 >= 0 && local247 < Static38.anInt740 && local1443 < Static38.anInt741) {
												Static293.method4590(local247, local1443, Static530.anInt9013);
											}
										}
									}
									for (@Pc(3626) Class4_Sub37 local3626 = (Class4_Sub37) Static263.aClass124_53.method3267(); local3626 != null; local3626 = (Class4_Sub37) Static263.aClass124_53.method3273()) {
										if (local3626.anInt7084 >= Static314.anInt9407 && local3626.anInt7084 < Static314.anInt9407 + 8 && Static81.anInt9840 <= local3626.anInt7086 && Static81.anInt9840 + 8 > local3626.anInt7086 && local3626.anInt7083 == Static530.anInt9013) {
											local3626.anInt7093 = 0;
										}
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static395.aClass64_334 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
									local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
									local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
									local247 = Static487.aClass4_Sub9_Sub1_2.method5982() << 2;
									local251 = Static487.aClass4_Sub9_Sub1_2.method6015();
									local1443 = Static487.aClass4_Sub9_Sub1_2.method6015();
									if (Static84.method1580(local614)) {
										Static447.method6309(local446, local79, local1443, local247, local251);
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static491.aClass64_424 == Static537.aClass64_448) {
									if (Static69.method1224(Static598.anInt9831)) {
										Static72.anInt1537 = (int) ((float) Static487.aClass4_Sub9_Sub1_2.method5982() * 2.5F);
									} else {
										Static72.anInt1537 = Static487.aClass4_Sub9_Sub1_2.method5982() * 30;
									}
									Static491.aClass64_424 = null;
									Static204.anInt4280 = Static191.anInt5895;
									return true;
								} else if (Static491.aClass64_424 == Static215.aClass64_182) {
									Static314.anInt9407 = Static487.aClass4_Sub9_Sub1_2.method5981() << 3;
									Static81.anInt9840 = Static487.aClass4_Sub9_Sub1_2.method6025() << 3;
									Static530.anInt9013 = Static487.aClass4_Sub9_Sub1_2.method6009();
									while (Static474.anInt4412 > Static487.aClass4_Sub9_Sub1_2.anInt7219) {
										@Pc(3790) Class284 local3790 = Static255.method4264()[Static487.aClass4_Sub9_Sub1_2.method6015()];
										Static414.method5939(local3790);
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static441.aClass64_365 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method5977();
									if (local614 == 65535) {
										local614 = -1;
									}
									local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
									if (local79 == 65535) {
										local79 = -1;
									}
									local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
									local247 = Static487.aClass4_Sub9_Sub1_2.method6026();
									local251 = Static487.aClass4_Sub9_Sub1_2.method5994();
									if (Static84.method1580(local446)) {
										for (local1443 = local614; local1443 <= local79; local1443++) {
											local1674 = ((long) local247 << 32) + (long) local1443;
											local1680 = (Class4_Sub31) Static446.aClass183_31.method4289(local1674);
											if (local1680 != null) {
												local1689 = new Class4_Sub31(local1680.anInt5878, local251);
												local1680.method8013();
											} else if (local1443 == -1) {
												local1689 = new Class4_Sub31(Static92.method2118(local247).aClass4_Sub31_1.anInt5878, local251);
											} else {
												local1689 = new Class4_Sub31(0, local251);
											}
											Static446.aClass183_31.method4282(local1674, local1689);
										}
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static2.aClass64_4 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method5977();
									local79 = Static487.aClass4_Sub9_Sub1_2.method5988();
									local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
									if (local446 == 65535) {
										local446 = -1;
									}
									if (Static84.method1580(local614)) {
										Static494.method7057(local79, 2, -1, local446);
									}
									Static491.aClass64_424 = null;
									return true;
								} else if (Static65.aClass64_67 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
									local79 = Static487.aClass4_Sub9_Sub1_2.method5965();
									Static511.aClass335_2.method7429(local614, local79);
									Static491.aClass64_424 = null;
									return true;
								} else if (Static86.aClass64_78 == Static491.aClass64_424) {
									Static414.method5939(Static28.aClass284_2);
									Static491.aClass64_424 = null;
									return true;
								} else if (Static571.aClass64_466 == Static491.aClass64_424) {
									local614 = Static487.aClass4_Sub9_Sub1_2.method6015();
									@Pc(4004) boolean local4004 = (local614 & 0x1) == 1;
									local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
									local2077 = Static487.aClass4_Sub9_Sub1_2.method6010();
									if (local2077.equals("")) {
										local2077 = local243;
									}
									local505 = Static487.aClass4_Sub9_Sub1_2.method6010();
									local253 = Static487.aClass4_Sub9_Sub1_2.method6010();
									if (local253.equals("")) {
										local253 = local505;
									}
									if (local4004) {
										for (local670 = 0; local670 < Static286.anInt8741; local670++) {
											if (Static383.aStringArray29[local670].equals(local253)) {
												Static101.aStringArray5[local670] = local243;
												Static383.aStringArray29[local670] = local2077;
												Static550.aStringArray38[local670] = local505;
												Static229.aStringArray21[local670] = local253;
												break;
											}
										}
									} else {
										Static101.aStringArray5[Static286.anInt8741] = local243;
										Static383.aStringArray29[Static286.anInt8741] = local2077;
										Static550.aStringArray38[Static286.anInt8741] = local505;
										Static229.aStringArray21[Static286.anInt8741] = local253;
										Static410.aBooleanArray29[Static286.anInt8741] = (local614 & 0x2) == 2;
										Static286.anInt8741++;
									}
									Static506.anInt8762 = Static191.anInt5895;
									Static491.aClass64_424 = null;
									return true;
								} else {
									@Pc(4141) Class4_Sub49 local4141;
									if (Static491.aClass64_424 == Static12.aClass64_13) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5977();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5988();
										local446 = Static487.aClass4_Sub9_Sub1_2.method6014();
										local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (Static84.method1580(local247)) {
											local4141 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local79);
											if (local4141 != null) {
												Static597.method8029(local4141, false, local614 != local4141.anInt9337);
											}
											Static241.method4092(local614, local79, false, local446);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static578.aClass64_476 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method6015();
										if (Static487.aClass4_Sub9_Sub1_2.method6015() == 0) {
											Static221.aClass334Array1[local614] = new Class334();
										} else {
											Static487.aClass4_Sub9_Sub1_2.anInt7219--;
											Static221.aClass334Array1[local614] = new Class334(Static487.aClass4_Sub9_Sub1_2);
										}
										Static221.anInt4543 = Static191.anInt5895;
										Static491.aClass64_424 = null;
										return true;
									} else if (Static497.aClass64_426 == Static491.aClass64_424) {
										local3008 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local239 = Static95.method7585(Static158.method3147(Static487.aClass4_Sub9_Sub1_2));
										Static410.method5899(local3008, local3008, local239, 6, local3008, 0);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static288.aClass64_250) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local79 = local614 >> 5;
										local446 = local614 & 0x1F;
										if (local446 == 0) {
											Static186.aClass18Array1[local79] = null;
											Static491.aClass64_424 = null;
											return true;
										}
										@Pc(4262) Class18 local4262 = new Class18();
										local4262.anInt388 = local446;
										local4262.anInt392 = Static487.aClass4_Sub9_Sub1_2.method6015();
										if (local4262.anInt392 >= 0 && local4262.anInt392 < Static315.aClass13Array20.length) {
											if (local4262.anInt388 == 1 || local4262.anInt388 == 10) {
												local4262.anInt387 = Static487.aClass4_Sub9_Sub1_2.method5982();
												Static487.aClass4_Sub9_Sub1_2.anInt7219 += 6;
											} else if (local4262.anInt388 >= 2 && local4262.anInt388 <= 6) {
												if (local4262.anInt388 == 2) {
													local4262.anInt393 = 256;
													local4262.anInt382 = 256;
												}
												if (local4262.anInt388 == 3) {
													local4262.anInt382 = 0;
													local4262.anInt393 = 256;
												}
												if (local4262.anInt388 == 4) {
													local4262.anInt393 = 256;
													local4262.anInt382 = 512;
												}
												if (local4262.anInt388 == 5) {
													local4262.anInt393 = 0;
													local4262.anInt382 = 256;
												}
												if (local4262.anInt388 == 6) {
													local4262.anInt382 = 256;
													local4262.anInt393 = 512;
												}
												local4262.anInt388 = 2;
												local4262.anInt385 = Static487.aClass4_Sub9_Sub1_2.method6015();
												local4262.anInt382 += Static487.aClass4_Sub9_Sub1_2.method5982() - Static373.anInt6695 << 9;
												local4262.anInt393 += Static487.aClass4_Sub9_Sub1_2.method5982() - Static6.anInt97 << 9;
												local4262.anInt380 = Static487.aClass4_Sub9_Sub1_2.method6015() << 2;
												local4262.anInt381 = Static487.aClass4_Sub9_Sub1_2.method5982();
											}
											local4262.anInt383 = Static487.aClass4_Sub9_Sub1_2.method5982();
											if (local4262.anInt383 == 65535) {
												local4262.anInt383 = -1;
											}
											Static186.aClass18Array1[local79] = local4262;
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static365.aClass64_315) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (local614 == 65535) {
											local614 = -1;
										}
										local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
										Static3.method60(local79, local247, local446, local614);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static364.aClass64_312) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5988();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6005();
										Static511.aClass335_2.method7431(local79, local614);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static70.aClass64_71 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										@Pc(4504) Class10_Sub1_Sub2_Sub2 local4504;
										if (Static416.anInt7186 == local614) {
											local4504 = Static129.aClass10_Sub1_Sub2_Sub2_1;
										} else {
											local4504 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local614];
										}
										if (local4504 == null) {
											Static491.aClass64_424 = null;
											return true;
										}
										local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local2735 = (local446 & 0x8000) != 0;
										if (local4504.aString93 != null && local4504.aClass355_1 != null) {
											local660 = false;
											if (local247 <= 1) {
												if (!local2735 && (Static448.aBoolean537 && !Static251.aBoolean372 || Static266.aBoolean387)) {
													local660 = true;
												} else if (Static15.method308(local4504.aString93)) {
													local660 = true;
												}
											}
											if (!local660 && Static102.anInt2531 == 0) {
												local274 = -1;
												if (local2735) {
													local446 &= 0x7FFF;
													@Pc(4581) Class301 local4581 = Static495.method7461(Static487.aClass4_Sub9_Sub1_2);
													local274 = local4581.anInt8051;
													local541 = local4581.aClass4_Sub7_Sub16_1.method7169(Static487.aClass4_Sub9_Sub1_2);
												} else {
													local541 = Static95.method7585(Static158.method3147(Static487.aClass4_Sub9_Sub1_2));
												}
												local4504.aString91 = local541.trim();
												local4504.anInt8501 = 150;
												local4504.anInt8499 = local446 >> 8;
												local4504.anInt8471 = local446 & 0xFF;
												if (local247 == 1 || local247 == 2) {
													local685 = local2735 ? 17 : 1;
												} else {
													local685 = local2735 ? 17 : 2;
												}
												if (local247 == 2) {
													Static140.method2841(local4504.aString92, local685, "<img=1>" + local4504.method7047(), 0, local541, null, local274, "<img=1>" + local4504.method7042());
												} else if (local247 == 1) {
													Static140.method2841(local4504.aString92, local685, "<img=0>" + local4504.method7047(), 0, local541, null, local274, "<img=0>" + local4504.method7042());
												} else {
													Static140.method2841(local4504.aString92, local685, local4504.method7047(), 0, local541, null, local274, local4504.method7042());
												}
											}
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static390.aClass64_332) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5977();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5965();
										if (Static84.method1580(local614)) {
											Static494.method7057(local79, 3, -1, -1);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static317.aClass64_283 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5965();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
										if (Static84.method1580(local79)) {
											Static494.method7057(local614, 5, 0, Static416.anInt7186);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static333.aClass64_291) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (Static84.method1580(local614) && Static458.aClass115ArrayArray2[local79] != null) {
											for (local251 = local446; local251 < local247; local251++) {
												local1443 = Static487.aClass4_Sub9_Sub1_2.method6023();
												if (Static458.aClass115ArrayArray2[local79].length > local251 && Static458.aClass115ArrayArray2[local79][local251] != null) {
													Static458.aClass115ArrayArray2[local79][local251].anInt3513 = local1443;
												}
											}
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static85.aClass64_77 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6014();
										if (local79 == 255) {
											local79 = -1;
											local614 = -1;
										}
										Static571.method7722(local614, local79);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static532.aClass64_445) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method6026();
										Static370.aClass299_6 = Static147.aClass161_4.method3832(local614);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static45.aClass64_54 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5973();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local247 = Static487.aClass4_Sub9_Sub1_2.method5965();
										if (Static84.method1580(local79)) {
											Static494.method7057(local247, 5, local614, local446);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static482.aClass64_421 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5965();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
										local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
										local247 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (Static84.method1580(local79)) {
											Static293.method4591(local614, (local446 << 16) + local247);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static493.aClass64_425 == Static491.aClass64_424) {
										Static335.anInt6553 = Static191.anInt5895;
										if (Static474.anInt4412 == 0) {
											Static168.aClass193Array1 = null;
											Static63.anInt1182 = 0;
											Static210.aString44 = null;
											Static491.aClass64_424 = null;
											Static151.aString28 = null;
											return true;
										}
										Static151.aString28 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
										if (local235) {
											Static487.aClass4_Sub9_Sub1_2.method6010();
										}
										@Pc(5012) long local5012 = Static487.aClass4_Sub9_Sub1_2.method5997();
										Static210.aString44 = Static446.method6284(local5012);
										Static68.aByte26 = Static487.aClass4_Sub9_Sub1_2.method6021();
										local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
										if (local247 == 255) {
											Static491.aClass64_424 = null;
											return true;
										}
										Static63.anInt1182 = local247;
										@Pc(5036) Class193[] local5036 = new Class193[100];
										for (local1443 = 0; local1443 < Static63.anInt1182; local1443++) {
											local5036[local1443] = new Class193();
											local5036[local1443].aString66 = Static487.aClass4_Sub9_Sub1_2.method6010();
											local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
											if (local235) {
												local5036[local1443].aString65 = Static487.aClass4_Sub9_Sub1_2.method6010();
											} else {
												local5036[local1443].aString65 = local5036[local1443].aString66;
											}
											local5036[local1443].aString64 = Static488.method6774(local5036[local1443].aString65);
											local5036[local1443].anInt5149 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local5036[local1443].aByte66 = Static487.aClass4_Sub9_Sub1_2.method6021();
											local5036[local1443].aString67 = Static487.aClass4_Sub9_Sub1_2.method6010();
											if (local5036[local1443].aString65.equals(Static129.aClass10_Sub1_Sub2_Sub2_1.aString93)) {
												Static535.aByte104 = local5036[local1443].aByte66;
											}
										}
										local685 = Static63.anInt1182;
										while (local685 > 0) {
											local255 = true;
											local685--;
											for (local712 = 0; local712 < local685; local712++) {
												if (local5036[local712].aString64.compareTo(local5036[local712 + 1].aString64) > 0) {
													local3056 = local5036[local712];
													local5036[local712] = local5036[local712 + 1];
													local5036[local712 + 1] = local3056;
													local255 = false;
												}
											}
											if (local255) {
												break;
											}
										}
										Static491.aClass64_424 = null;
										Static168.aClass193Array1 = local5036;
										return true;
									} else if (Static491.aClass64_424 == Static286.aClass64_432) {
										Static414.method5939(Static23.aClass284_1);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static97.aClass64_419) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5994();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
										if (Static84.method1580(local79)) {
											Static83.method7959(local446, local614);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static210.aClass64_174) {
										Static491.aClass64_424 = null;
										return false;
									} else if (Static491.aClass64_424 == Static586.aClass64_69) {
										Static414.method5939(Static178.aClass284_9);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static86.aClass64_79 == Static491.aClass64_424) {
										Static414.method5939(Static576.aClass284_27);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static10.aClass64_11) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local251 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local1443 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (Static84.method1580(local614)) {
											Static21.aBooleanArray5[local79] = true;
											Static354.anIntArray513[local79] = local446;
											Static492.anIntArray655[local79] = local247;
											Static29.anIntArray110[local79] = local251;
											Static133.anIntArray297[local79] = local1443;
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static178.aClass64_154 == Static491.aClass64_424) {
										Static214.method4827(Static487.aClass4_Sub9_Sub1_2, Static474.anInt4412, Static147.aClass161_4);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static213.aClass64_176 == Static491.aClass64_424) {
										Static466.anInt7872 = Static487.aClass4_Sub9_Sub1_2.method6014();
										Static290.anInt5384 = Static487.aClass4_Sub9_Sub1_2.method6015();
										Static491.aClass64_424 = null;
										return true;
									} else if (Static443.aClass64_373 == Static491.aClass64_424) {
										local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
										local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local243 = local239;
										if (local235) {
											local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
										}
										local2405 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local2410 = Static487.aClass4_Sub9_Sub1_2.method6023();
										local274 = Static487.aClass4_Sub9_Sub1_2.method6015();
										@Pc(5396) long local5396 = local2410 + (local2405 << 32);
										@Pc(5398) boolean local5398 = false;
										local720 = 0;
										while (true) {
											if (local720 >= 100) {
												if (local274 <= 1) {
													if (Static448.aBoolean537 && !Static251.aBoolean372 || Static266.aBoolean387) {
														local5398 = true;
													} else if (Static15.method308(local243)) {
														local5398 = true;
													}
												}
												break;
											}
											if (Static584.aLongArray17[local720] == local5396) {
												local5398 = true;
												break;
											}
											local720++;
										}
										if (!local5398 && Static102.anInt2531 == 0) {
											Static584.aLongArray17[Static567.anInt9473] = local5396;
											Static567.anInt9473 = (Static567.anInt9473 + 1) % 100;
											@Pc(5455) String local5455 = Static95.method7585(Static158.method3147(Static487.aClass4_Sub9_Sub1_2));
											if (local274 == 2) {
												Static140.method2841(local239, 7, "<img=1>" + local239, 0, local5455, null, -1, "<img=1>" + local243);
											} else if (local274 == 1) {
												Static140.method2841(local239, 7, "<img=0>" + local239, 0, local5455, null, -1, "<img=0>" + local243);
											} else {
												Static140.method2841(local239, 3, local239, 0, local5455, null, -1, local243);
											}
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static589.aClass64_486 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local446 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local247 = Static487.aClass4_Sub9_Sub1_2.method5982() << 2;
										local251 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local1443 = Static487.aClass4_Sub9_Sub1_2.method6015();
										if (Static84.method1580(local614)) {
											Static166.method3203(local1443, local247, true, local79, local251, local446);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static198.aClass64_158) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method6026();
										local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5977();
										if (Static84.method1580(local446)) {
											Static300.method4872(local614, local239);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static12.aClass64_14 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										if (Static84.method1580(local614)) {
											Static12.method271();
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static264.aClass64_230) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5994();
										local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5977();
										if (Static84.method1580(local446)) {
											Static157.method5015(local239, local614);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static416.aClass64_343) {
										Static552.method7616(true);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static548.aClass64_458 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5965();
										local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
										local446 = Static487.aClass4_Sub9_Sub1_2.method5994();
										if (Static84.method1580(local79)) {
											Static484.method7809(local446, local614);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static369.aClass64_320 == Static491.aClass64_424) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
										local1427 = (local79 & 0x1) == 1;
										while (Static474.anInt4412 > Static487.aClass4_Sub9_Sub1_2.anInt7219) {
											local247 = Static487.aClass4_Sub9_Sub1_2.method5978();
											local251 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local1443 = 0;
											if (local251 != 0) {
												local1443 = Static487.aClass4_Sub9_Sub1_2.method6015();
												if (local1443 == 255) {
													local1443 = Static487.aClass4_Sub9_Sub1_2.method6026();
												}
											}
											Static457.method6435(local614, local1427, local1443, local251 - 1, local247);
										}
										Static481.anIntArray641[Static83.anInt9715++ & 0x1F] = local614;
										Static491.aClass64_424 = null;
										return true;
									} else if (Static535.aClass64_447 == Static491.aClass64_424) {
										local3008 = Static487.aClass4_Sub9_Sub1_2.method6010();
										local79 = Static487.aClass4_Sub9_Sub1_2.method6005();
										local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
										if (Static84.method1580(local446)) {
											Static157.method5015(local3008, local79);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static96.aClass64_94) {
										Static92.method2115();
										Static491.aClass64_424 = null;
										return false;
									} else if (Static34.aClass64_459 == Static491.aClass64_424) {
										Static399.method5795();
										Static491.aClass64_424 = null;
										return false;
									} else if (Static491.aClass64_424 == Static137.aClass64_122) {
										Static414.method5939(Static243.aClass284_11);
										Static491.aClass64_424 = null;
										return true;
									} else if (Static491.aClass64_424 == Static439.aClass64_483) {
										local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
										local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
										@Pc(5834) Object[] local5834 = new Object[local239.length() + 1];
										for (local247 = local239.length() - 1; local247 >= 0; local247--) {
											if (local239.charAt(local247) == 's') {
												local5834[local247 + 1] = Static487.aClass4_Sub9_Sub1_2.method6010();
											} else {
												local5834[local247 + 1] = Integer.valueOf(Static487.aClass4_Sub9_Sub1_2.method6026());
											}
										}
										local5834[0] = Integer.valueOf(Static487.aClass4_Sub9_Sub1_2.method6026());
										if (Static84.method1580(local614)) {
											@Pc(5892) Class4_Sub12 local5892 = new Class4_Sub12();
											local5892.anObjectArray3 = local5834;
											Static205.method3636(local5892);
										}
										Static491.aClass64_424 = null;
										return true;
									} else if (Static535.aClass64_446 == Static491.aClass64_424) {
										Static414.method5939(Static143.aClass284_8);
										Static491.aClass64_424 = null;
										return true;
									} else {
										@Pc(5951) long local5951;
										if (Static277.aClass64_236 == Static491.aClass64_424) {
											local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
											local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
											local243 = local239;
											if (local235) {
												local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
											}
											local2405 = Static487.aClass4_Sub9_Sub1_2.method5997();
											local2410 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local5951 = Static487.aClass4_Sub9_Sub1_2.method6023();
											local712 = Static487.aClass4_Sub9_Sub1_2.method6015();
											@Pc(5961) long local5961 = local5951 + (local2410 << 32);
											@Pc(5963) boolean local5963 = false;
											local837 = 0;
											while (true) {
												if (local837 >= 100) {
													if (local712 <= 1) {
														if (Static448.aBoolean537 && !Static251.aBoolean372 || Static266.aBoolean387) {
															local5963 = true;
														} else if (Static15.method308(local243)) {
															local5963 = true;
														}
													}
													break;
												}
												if (local5961 == Static584.aLongArray17[local837]) {
													local5963 = true;
													break;
												}
												local837++;
											}
											if (!local5963 && Static102.anInt2531 == 0) {
												Static584.aLongArray17[Static567.anInt9473] = local5961;
												Static567.anInt9473 = (Static567.anInt9473 + 1) % 100;
												@Pc(6031) String local6031 = Static95.method7585(Static158.method3147(Static487.aClass4_Sub9_Sub1_2));
												if (local712 == 2 || local712 == 3) {
													Static140.method2841(local239, 9, "<img=1>" + local239, 0, local6031, Static383.method5682(local2405), -1, "<img=1>" + local243);
												} else if (local712 == 1) {
													Static140.method2841(local239, 9, "<img=0>" + local239, 0, local6031, Static383.method5682(local2405), -1, "<img=0>" + local243);
												} else {
													Static140.method2841(local239, 9, local239, 0, local6031, Static383.method5682(local2405), -1, local243);
												}
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static491.aClass64_424 == Static388.aClass64_330) {
											for (local614 = 0; local614 < Static246.aClass10_Sub1_Sub2_Sub2Array1.length; local614++) {
												if (Static246.aClass10_Sub1_Sub2_Sub2Array1[local614] != null) {
													Static246.aClass10_Sub1_Sub2_Sub2Array1[local614].anIntArray651 = null;
													Static246.aClass10_Sub1_Sub2_Sub2Array1[local614].anInt8483 = -1;
												}
											}
											for (local79 = 0; local79 < Static566.anInt9466; local79++) {
												Static161.aClass4_Sub50Array1[local79].aClass10_Sub1_Sub2_Sub1_1.anIntArray651 = null;
												Static161.aClass4_Sub50Array1[local79].aClass10_Sub1_Sub2_Sub1_1.anInt8483 = -1;
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static491.aClass64_424 == Static75.aClass64_74) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method6017();
											local79 = Static487.aClass4_Sub9_Sub1_2.method6026();
											local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local247 = Static487.aClass4_Sub9_Sub1_2.method6017();
											if (Static84.method1580(local446)) {
												Static519.method7288(local614, local247, local79);
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static43.aClass64_53 == Static491.aClass64_424) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local79 = Static487.aClass4_Sub9_Sub1_2.method5988();
											local446 = Static487.aClass4_Sub9_Sub1_2.method6005();
											if (local446 == 65535) {
												local446 = -1;
											}
											local247 = Static487.aClass4_Sub9_Sub1_2.method5965();
											if (Static84.method1580(local614)) {
												Static62.method4585(local79, local247, local446);
												@Pc(6244) Class222 local6244 = Static195.aClass99_1.method2798(local446);
												Static587.method2114(local6244.anInt5814, local6244.anInt5776, local6244.anInt5781, local247);
												Static467.method6533(local247, local6244.anInt5823, local6244.anInt5821, local6244.anInt5788);
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static442.aClass64_372 == Static491.aClass64_424) {
											local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
											local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
											local243 = local239;
											if (local235) {
												local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
											}
											local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
											local251 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local660 = false;
											if (local247 <= 1 && Static15.method308(local243)) {
												local660 = true;
											}
											if (!local660 && Static102.anInt2531 == 0) {
												local541 = Static320.aClass363_1.method8038(local251).method7169(Static487.aClass4_Sub9_Sub1_2);
												if (local247 == 2) {
													Static140.method2841(local239, 25, "<img=1>" + local239, 0, local541, null, local251, "<img=1>" + local243);
												} else if (local247 == 1) {
													Static140.method2841(local239, 25, "<img=0>" + local239, 0, local541, null, local251, "<img=0>" + local243);
												} else {
													Static140.method2841(local239, 25, local239, 0, local541, null, local251, local243);
												}
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static317.aClass64_282 == Static491.aClass64_424) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method5988();
											local79 = Static487.aClass4_Sub9_Sub1_2.method5982();
											if (Static84.method1580(local79)) {
												if (local614 == -1) {
													Static140.anInt3147 = -1;
													Static380.anInt6749 = -1;
												} else {
													local446 = local614 >> 14 & 0x3FFF;
													local446 -= Static373.anInt6695;
													local247 = local614 & 0x3FFF;
													local247 -= Static6.anInt97;
													if (local446 < 0) {
														local446 = 0;
													} else if (local446 >= Static38.anInt740) {
														local446 = Static38.anInt740;
													}
													if (local247 < 0) {
														local247 = 0;
													} else if (Static38.anInt741 <= local247) {
														local247 = Static38.anInt741;
													}
													Static380.anInt6749 = (local446 << 9) + 256;
													Static140.anInt3147 = (local247 << 9) + 256;
												}
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static277.aClass64_235 == Static491.aClass64_424) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
											if (local614 == 65535) {
												local614 = -1;
											}
											local79 = Static487.aClass4_Sub9_Sub1_2.method6015();
											local446 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local247 = Static487.aClass4_Sub9_Sub1_2.method6015();
											Static560.method7718(local446, local247, local614, false, local79);
											Static491.aClass64_424 = null;
											return true;
										} else if (Static581.aClass64_478 == Static491.aClass64_424) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method5982();
											if (Static84.method1580(local614)) {
												Static486.method6754();
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static491.aClass64_424 == Static172.aClass64_149) {
											if (Static249.anInt4945 != -1) {
												Static349.method5193(0, Static249.anInt4945);
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static351.aClass64_299 == Static491.aClass64_424) {
											local235 = Static487.aClass4_Sub9_Sub1_2.method6015() == 1;
											local239 = Static487.aClass4_Sub9_Sub1_2.method6010();
											local243 = local239;
											if (local235) {
												local243 = Static487.aClass4_Sub9_Sub1_2.method6010();
											}
											local2405 = Static487.aClass4_Sub9_Sub1_2.method5997();
											local2410 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local5951 = Static487.aClass4_Sub9_Sub1_2.method6023();
											local712 = Static487.aClass4_Sub9_Sub1_2.method6015();
											local718 = Static487.aClass4_Sub9_Sub1_2.method5982();
											@Pc(6605) long local6605 = local5951 + (local2410 << 32);
											@Pc(6607) boolean local6607 = false;
											@Pc(6609) int local6609 = 0;
											while (true) {
												if (local6609 >= 100) {
													if (local712 <= 1 && Static15.method308(local243)) {
														local6607 = true;
													}
													break;
												}
												if (local6605 == Static584.aLongArray17[local6609]) {
													local6607 = true;
													break;
												}
												local6609++;
											}
											if (!local6607 && Static102.anInt2531 == 0) {
												Static584.aLongArray17[Static567.anInt9473] = local6605;
												Static567.anInt9473 = (Static567.anInt9473 + 1) % 100;
												@Pc(6658) String local6658 = Static320.aClass363_1.method8038(local718).method7169(Static487.aClass4_Sub9_Sub1_2);
												if (local712 == 2) {
													Static140.method2841(local239, 20, "<img=1>" + local239, 0, local6658, Static383.method5682(local2405), local718, "<img=1>" + local243);
												} else if (local712 == 1) {
													Static140.method2841(local239, 20, "<img=0>" + local239, 0, local6658, Static383.method5682(local2405), local718, "<img=0>" + local243);
												} else {
													Static140.method2841(local239, 20, local239, 0, local6658, Static383.method5682(local2405), local718, local243);
												}
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static133.aClass64_118 == Static491.aClass64_424) {
											Static256.method4266();
											Static491.aClass64_424 = null;
											return true;
										} else if (Static491.aClass64_424 == Static242.aClass64_209) {
											Static314.anInt9407 = Static487.aClass4_Sub9_Sub1_2.method6004() << 3;
											Static530.anInt9013 = Static487.aClass4_Sub9_Sub1_2.method6014();
											Static81.anInt9840 = Static487.aClass4_Sub9_Sub1_2.method6025() << 3;
											Static491.aClass64_424 = null;
											return true;
										} else if (Static423.aClass64_345 == Static491.aClass64_424) {
											local3008 = Static487.aClass4_Sub9_Sub1_2.method6010();
											local79 = Static487.aClass4_Sub9_Sub1_2.method5982();
											local243 = Static320.aClass363_1.method8038(local79).method7169(Static487.aClass4_Sub9_Sub1_2);
											Static140.method2841(local3008, 19, local3008, 0, local243, null, local79, local3008);
											Static491.aClass64_424 = null;
											return true;
										} else if (Static310.aClass64_277 == Static491.aClass64_424) {
											Static121.anInt7260 = Static487.aClass4_Sub9_Sub1_2.method6003();
											Static204.anInt4280 = Static191.anInt5895;
											Static491.aClass64_424 = null;
											return true;
										} else if (Static595.aClass64_492 == Static491.aClass64_424) {
											local614 = Static487.aClass4_Sub9_Sub1_2.method5973();
											local79 = Static487.aClass4_Sub9_Sub1_2.method5977();
											local446 = Static487.aClass4_Sub9_Sub1_2.method5965();
											if (Static84.method1580(local79)) {
												@Pc(6840) Class4_Sub49 local6840 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local614);
												local4141 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local446);
												if (local4141 != null) {
													Static597.method8029(local4141, false, local6840 == null || local6840.anInt9337 != local4141.anInt9337);
												}
												if (local6840 != null) {
													local6840.method8013();
													Static543.aClass183_39.method4282((long) local446, local6840);
												}
												@Pc(6884) Class115 local6884 = Static92.method2118(local614);
												if (local6884 != null) {
													Static330.method4950(local6884);
												}
												local6884 = Static92.method2118(local446);
												if (local6884 != null) {
													Static330.method4950(local6884);
													Static424.method6072(local6884, true);
												}
												if (Static249.anInt4945 != -1) {
													Static349.method5193(1, Static249.anInt4945);
												}
											}
											Static491.aClass64_424 = null;
											return true;
										} else if (Static8.aClass64_463 == Static491.aClass64_424) {
											Static414.method5939(Static34.aClass284_25);
											Static491.aClass64_424 = null;
											return true;
										} else if (Static491.aClass64_424 == Static161.aClass64_137) {
											Static491.aClass64_424 = null;
											Static98.anInt2440 = 1;
											Static506.anInt8762 = Static191.anInt5895;
											return true;
										} else {
											Static473.method6593(null, "T1 - " + (Static491.aClass64_424 == null ? -1 : Static491.aClass64_424.method1581()) + "," + (Static29.aClass64_37 == null ? -1 : Static29.aClass64_37.method1581()) + "," + (Static342.aClass64_294 == null ? -1 : Static342.aClass64_294.method1581()) + " - " + Static474.anInt4412);
											Static362.method5445(false);
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	public static void method6046() {
		try {
			if (Static445.anInt7588 == 1) {
				@Pc(14) int local14 = Static228.aClass4_Sub13_Sub3_2.method5113();
				if (local14 > 0 && Static228.aClass4_Sub13_Sub3_2.method5118()) {
					local14 -= Static289.anInt5377;
					if (local14 < 0) {
						local14 = 0;
					}
					Static228.aClass4_Sub13_Sub3_2.method5125(local14);
				} else {
					Static228.aClass4_Sub13_Sub3_2.method5145();
					Static228.aClass4_Sub13_Sub3_2.method5126();
					Static141.aClass246_1 = null;
					if (Static347.aClass31_74 == null) {
						Static445.anInt7588 = 0;
					} else {
						Static445.anInt7588 = 2;
					}
					Static25.aClass4_Sub43_1 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static228.aClass4_Sub13_Sub3_2.method5145();
			Static347.aClass31_74 = null;
			Static25.aClass4_Sub43_1 = null;
			Static141.aClass246_1 = null;
			Static445.anInt7588 = 0;
		}
	}
}
