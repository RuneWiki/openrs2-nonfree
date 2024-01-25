import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
	public static void method8377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class112 local9 = Static442.aClass112ArrayArray1[arg2][arg1];
		Static505.method7415(arg0, local9 == null ? Static211.aClass112_5 : local9);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)Z")
	public static boolean method8378() throws IOException {
		if (Static299.aClass241_3 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static257.aClass362_105 == null) {
			if (Static470.aBoolean613) {
				if (!Static299.aClass241_3.method7084(1)) {
					return false;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				Static395.anInt7584 = 0;
				Static470.aBoolean613 = false;
				Static48.anInt687++;
			}
			Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
			if (Static319.aClass4_Sub11_Sub1_2.method1528()) {
				if (!Static299.aClass241_3.method7084(1)) {
					return false;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 1);
				Static395.anInt7584 = 0;
				Static48.anInt687++;
			}
			Static470.aBoolean613 = true;
			@Pc(69) Class362[] local69 = Static212.method3529();
			local73 = Static319.aClass4_Sub11_Sub1_2.method1532();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static319.aClass4_Sub11_Sub1_2.anInt5831);
			}
			Static257.aClass362_105 = local69[local73];
			Static186.anInt3680 = Static257.aClass362_105.anInt10155;
		}
		if (Static186.anInt3680 == -1) {
			if (!Static299.aClass241_3.method7084(1)) {
				return false;
			}
			Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
			Static186.anInt3680 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
			Static395.anInt7584 = 0;
			Static48.anInt687++;
		}
		if (Static186.anInt3680 == -2) {
			if (!Static299.aClass241_3.method7084(2)) {
				return false;
			}
			Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 2, 0);
			Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
			Static186.anInt3680 = Static319.aClass4_Sub11_Sub1_2.method4936();
			Static48.anInt687 += 2;
			Static395.anInt7584 = 0;
		}
		if (Static186.anInt3680 > 0) {
			if (!Static299.aClass241_3.method7084(Static186.anInt3680)) {
				return false;
			}
			Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
			Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, Static186.anInt3680, 0);
			Static395.anInt7584 = 0;
			Static48.anInt687 += Static186.anInt3680;
		}
		Static400.aClass362_168 = Static401.aClass362_169;
		Static401.aClass362_169 = Static370.aClass362_153;
		Static370.aClass362_153 = Static257.aClass362_105;
		@Pc(210) byte local210;
		if (Static257.aClass362_105 == Static309.aClass362_132) {
			local210 = Static319.aClass4_Sub11_Sub1_2.method4952();
			local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
			Static45.aClass148_1.method3456(local210, local73);
			Static257.aClass362_105 = null;
			return true;
		}
		@Pc(230) int local230;
		if (Static542.aClass362_215 == Static257.aClass362_105) {
			local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local73 = Static319.aClass4_Sub11_Sub1_2.method4931();
			if (Static485.method7230(local230)) {
				@Pc(245) Class4_Sub37 local245 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local73);
				if (local245 != null) {
					Static161.method525(false, true, local245);
				}
				if (Static69.aClass225_8 != null) {
					Static92.method2100(Static69.aClass225_8);
					Static69.aClass225_8 = null;
				}
			}
			Static257.aClass362_105 = null;
			return true;
		} else if (Static241.aClass362_97 == Static257.aClass362_105) {
			Static478.method7173();
			Static257.aClass362_105 = null;
			return true;
		} else {
			@Pc(310) long local310;
			@Pc(314) int local314;
			@Pc(286) boolean local286;
			@Pc(290) String local290;
			@Pc(292) String local292;
			@Pc(303) long local303;
			@Pc(325) int local325;
			if (Static257.aClass362_105 == Static453.aClass362_189) {
				local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
				local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
				local292 = local290;
				if (local286) {
					local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
				}
				local303 = Static319.aClass4_Sub11_Sub1_2.method4936();
				local310 = Static319.aClass4_Sub11_Sub1_2.method4934();
				local314 = Static319.aClass4_Sub11_Sub1_2.method4905();
				@Pc(321) long local321 = (local303 << 32) + local310;
				@Pc(323) boolean local323 = false;
				local325 = 0;
				while (true) {
					if (local325 >= 100) {
						if (local314 <= 1) {
							if (Static263.aBoolean365 && !Static593.aBoolean725 || Static417.aBoolean537) {
								local323 = true;
							} else if (Static511.method7464(local292)) {
								local323 = true;
							}
						}
						break;
					}
					if (local321 == Static446.aLongArray15[local325]) {
						local323 = true;
						break;
					}
					local325++;
				}
				if (!local323 && Static24.anInt386 == 0) {
					Static446.aLongArray15[Static384.anInt7374] = local321;
					Static384.anInt7374 = (Static384.anInt7374 + 1) % 100;
					@Pc(392) String local392 = Static472.method7093(Static469.method7081(Static319.aClass4_Sub11_Sub1_2));
					if (local314 == 2) {
						Static502.method7386("<img=1>" + local290, 0, null, "<img=1>" + local292, 7, -1, local392, local290);
					} else if (local314 == 1) {
						Static502.method7386("<img=0>" + local290, 0, null, "<img=0>" + local292, 7, -1, local392, local290);
					} else {
						Static502.method7386(local290, 0, null, local292, 3, -1, local392, local290);
					}
				}
				Static257.aClass362_105 = null;
				return true;
			}
			@Pc(477) int local477;
			if (Static257.aClass362_105 == Static332.aClass362_142) {
				local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
				local73 = Static319.aClass4_Sub11_Sub1_2.method4956();
				local477 = Static319.aClass4_Sub11_Sub1_2.method4950();
				if (Static485.method7230(local230)) {
					Static223.method3625(local73, local477);
				}
				Static257.aClass362_105 = null;
				return true;
			}
			@Pc(527) long local527;
			@Pc(533) int local533;
			@Pc(537) int local537;
			if (Static257.aClass362_105 == Static439.aClass362_181) {
				local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
				local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
				local292 = local290;
				if (local286) {
					local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
				}
				local303 = Static319.aClass4_Sub11_Sub1_2.method4903();
				local310 = Static319.aClass4_Sub11_Sub1_2.method4936();
				local527 = Static319.aClass4_Sub11_Sub1_2.method4934();
				local533 = Static319.aClass4_Sub11_Sub1_2.method4905();
				local537 = Static319.aClass4_Sub11_Sub1_2.method4936();
				@Pc(544) long local544 = (local310 << 32) + local527;
				@Pc(546) boolean local546 = false;
				@Pc(548) int local548 = 0;
				while (true) {
					if (local548 >= 100) {
						if (local533 <= 1 && Static511.method7464(local292)) {
							local546 = true;
						}
						break;
					}
					if (Static446.aLongArray15[local548] == local544) {
						local546 = true;
						break;
					}
					local548++;
				}
				if (!local546 && Static24.anInt386 == 0) {
					Static446.aLongArray15[Static384.anInt7374] = local544;
					Static384.anInt7374 = (Static384.anInt7374 + 1) % 100;
					@Pc(606) String local606 = Static190.aClass295_1.method7021(local537).method3765(Static319.aClass4_Sub11_Sub1_2);
					if (local533 == 2) {
						Static502.method7386("<img=1>" + local290, 0, Static89.method2077(local303), "<img=1>" + local292, 20, local537, local606, local290);
					} else if (local533 == 1) {
						Static502.method7386("<img=0>" + local290, 0, Static89.method2077(local303), "<img=0>" + local292, 20, local537, local606, local290);
					} else {
						Static502.method7386(local290, 0, Static89.method2077(local303), local292, 20, local537, local606, local290);
					}
				}
				Static257.aClass362_105 = null;
				return true;
			} else if (Static257.aClass362_105 == Static26.aClass362_19) {
				local230 = Static319.aClass4_Sub11_Sub1_2.method4938();
				local73 = Static319.aClass4_Sub11_Sub1_2.method4923();
				if (local73 == 65535) {
					local73 = -1;
				}
				local477 = Static319.aClass4_Sub11_Sub1_2.method4947();
				Static379.method6044(local230, local477, local73);
				Static257.aClass362_105 = null;
				return true;
			} else if (Static257.aClass362_105 == Static468.aClass362_55) {
				local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
				if (local230 == 65535) {
					local230 = -1;
				}
				local73 = Static319.aClass4_Sub11_Sub1_2.method4916();
				local477 = Static319.aClass4_Sub11_Sub1_2.method4934();
				Static40.method493(local477, local73, local230);
				Static257.aClass362_105 = null;
				return true;
			} else {
				@Pc(777) int local777;
				@Pc(773) int local773;
				@Pc(783) int local783;
				if (Static257.aClass362_105 == Static542.aClass362_216) {
					local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
					local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local777 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local783 = Static319.aClass4_Sub11_Sub1_2.method4936();
					if (Static485.method7230(local230)) {
						Static225.aBooleanArray10[local73] = true;
						Static352.anIntArray351[local73] = local477;
						Static129.anIntArray133[local73] = local773;
						Static87.anIntArray86[local73] = local777;
						Static525.anIntArray503[local73] = local783;
					}
					Static257.aClass362_105 = null;
					return true;
				} else if (Static257.aClass362_105 == Static148.aClass362_229) {
					Static446.method6892(Static123.aClass162_8);
					Static257.aClass362_105 = null;
					return true;
				} else if (Static257.aClass362_105 == Static265.aClass362_112) {
					local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
					local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
					Static137.anIntArray141[local230] = local477;
					Static28.anIntArray19[local230] = local73;
					Static174.anIntArray177[local230] = 1;
					local773 = Static223.anIntArray199[local230] - 1;
					for (local777 = 0; local777 < local773; local777++) {
						if (local477 >= Class77_Sub1.anIntArray109[local777]) {
							Static174.anIntArray177[local230] = local777 + 2;
						}
					}
					Static306.anIntArray301[Static264.anInt5062++ & 0x1F] = local230;
					Static257.aClass362_105 = null;
					return true;
				} else {
					@Pc(921) Class4_Sub37 local921;
					if (Static266.aClass362_114 == Static257.aClass362_105) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4947();
						local477 = Static319.aClass4_Sub11_Sub1_2.method4950();
						local773 = Static319.aClass4_Sub11_Sub1_2.method4956();
						if (Static485.method7230(local477)) {
							local921 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local773);
							if (local921 != null) {
								Static161.method525(false, local921.anInt8141 != local230, local921);
							}
							Static428.method6706(false, local73, local773, local230);
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static113.aClass362_62 == Static257.aClass362_105) {
						Static498.method7377(Static319.aClass4_Sub11_Sub1_2, Static186.anInt3680, Static406.aClass354_5);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static298.aClass362_128) {
						Static446.method6892(Static240.aClass162_28);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static433.aClass362_179) {
						Static446.method6892(Static212.aClass162_10);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static480.aClass362_230) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
						local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
						if (Static485.method7230(local477)) {
							Static216.method6132(local230, local73);
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static68.aClass362_36 == Static257.aClass362_105) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4927();
						local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
						local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
						if (Static485.method7230(local477)) {
							Static595.method8399(local290, local230);
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static526.aClass362_77 == Static257.aClass362_105) {
						for (local230 = 0; local230 < Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1.length; local230++) {
							if (Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local230] != null) {
								Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local230].anIntArray459 = null;
								Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local230].anInt8412 = -1;
							}
						}
						for (local73 = 0; local73 < Static436.anInt8163; local73++) {
							Static457.aClass4_Sub4Array1[local73].aClass1_Sub4_Sub2_Sub1_Sub1_1.anIntArray459 = null;
							Static457.aClass4_Sub4Array1[local73].aClass1_Sub4_Sub2_Sub1_Sub1_1.anInt8412 = -1;
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static14.aClass362_8) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
						local477 = Static319.aClass4_Sub11_Sub1_2.method4931();
						local773 = Static319.aClass4_Sub11_Sub1_2.method4923();
						local777 = Static319.aClass4_Sub11_Sub1_2.method4955();
						if (Static485.method7230(local230)) {
							Static257.method4156(local777, local477, local73, local773);
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static98.aClass362_49) {
						Static446.method6892(Static247.aClass162_12);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static75.aClass362_21) {
						Static446.method6892(Static220.aClass162_11);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static306.aClass362_130 == Static257.aClass362_105) {
						Static446.method6892(Static270.aClass162_13);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static572.aClass362_225 == Static257.aClass362_105) {
						Static446.method6892(Static3.aClass162_1);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static159.aClass362_74 == Static257.aClass362_105) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4899();
						Static45.aClass148_1.method3451(local73, local230);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static458.aClass362_191) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4931();
						local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
						local773 = Static319.aClass4_Sub11_Sub1_2.method4923();
						if (Static485.method7230(local773)) {
							Static486.method7234(local477 + (local230 << 16), local73);
						}
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static502.aClass362_199) {
						local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
						local73 = Static319.aClass4_Sub11_Sub1_2.method4899();
						Static45.aClass148_1.method3456(local73, local230);
						Static257.aClass362_105 = null;
						return true;
					} else if (Static257.aClass362_105 == Static84.aClass362_43) {
						Static570.anInt9983 = Static319.aClass4_Sub11_Sub1_2.method4953() << 3;
						Static39.anInt538 = Static319.aClass4_Sub11_Sub1_2.method4925() << 3;
						Static102.anInt6216 = Static319.aClass4_Sub11_Sub1_2.method4938();
						Static257.aClass362_105 = null;
						return true;
					} else {
						@Pc(1297) String local1297;
						@Pc(1324) String local1324;
						@Pc(1295) String local1295;
						if (Static174.aClass362_78 == Static257.aClass362_105) {
							local230 = Static319.aClass4_Sub11_Sub1_2.method4942();
							local73 = Static319.aClass4_Sub11_Sub1_2.method4931();
							local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
							local1295 = "";
							local1297 = local1295;
							if ((local477 & 0x1) != 0) {
								local1295 = Static319.aClass4_Sub11_Sub1_2.method4920();
								if ((local477 & 0x2) == 0) {
									local1297 = local1295;
								} else {
									local1297 = Static319.aClass4_Sub11_Sub1_2.method4920();
								}
							}
							local1324 = Static319.aClass4_Sub11_Sub1_2.method4920();
							if (local230 == 99) {
								Static82.method1376(local1324);
							} else if (local1297.equals("") || !Static511.method7464(local1297)) {
								Static574.method8209(local1295, local1324, local1295, local1297, local230, local73);
							} else {
								Static257.aClass362_105 = null;
								return true;
							}
							Static257.aClass362_105 = null;
							return true;
						} else if (Static222.aClass362_90 == Static257.aClass362_105) {
							Static528.anInt9395 = Static319.aClass4_Sub11_Sub1_2.method4946();
							Static284.anInt5784 = Static436.anInt8161;
							Static257.aClass362_105 = null;
							return true;
						} else if (Static70.aClass362_37 == Static257.aClass362_105) {
							local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
							if (Static319.aClass4_Sub11_Sub1_2.method4905() == 0) {
								Static84.aClass358Array1[local230] = new Class358();
							} else {
								Static319.aClass4_Sub11_Sub1_2.anInt5831--;
								Static84.aClass358Array1[local230] = new Class358(Static319.aClass4_Sub11_Sub1_2);
							}
							Static257.aClass362_105 = null;
							Static502.anInt9043 = Static436.anInt8161;
							return true;
						} else {
							@Pc(1479) int local1479;
							@Pc(1669) int local1669;
							@Pc(1967) int local1967;
							@Pc(1450) boolean local1450;
							@Pc(1463) int local1463;
							@Pc(1589) boolean local1589;
							if (Static559.aClass362_223 == Static257.aClass362_105) {
								local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
								local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
								local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
								local773 = Static319.aClass4_Sub11_Sub1_2.method4923();
								local777 = Static319.aClass4_Sub11_Sub1_2.method4950();
								local1450 = (local230 & 0x80) != 0;
								if (local477 >> 30 == 0) {
									@Pc(1617) Class200 local1617;
									@Pc(1638) Class365 local1638;
									@Pc(1632) Class365 local1632;
									if (local477 >> 29 != 0) {
										local1463 = local477 & 0xFFFF;
										@Pc(1870) Class4_Sub4 local1870 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local1463);
										if (local1870 != null) {
											@Pc(1875) Class1_Sub4_Sub2_Sub1_Sub1 local1875 = local1870.aClass1_Sub4_Sub2_Sub1_Sub1_1;
											if (local773 == 65535) {
												local773 = -1;
											}
											@Pc(1882) boolean local1882 = true;
											local537 = local1450 ? local1875.anInt8406 : local1875.anInt8403;
											if (local773 != -1 && local537 != -1) {
												if (local537 == local773) {
													local1617 = Static569.aClass213_2.method5291(local773);
													if (local1617.aBoolean441 && local1617.anInt5925 != -1) {
														local1632 = Static61.aClass48_1.method1016(local1617.anInt5925);
														local1967 = local1632.anInt10221;
														if (local1967 == 0 || local1967 == 2) {
															local1882 = false;
														} else if (local1967 == 1) {
															local1882 = true;
														}
													}
												} else {
													local1617 = Static569.aClass213_2.method5291(local773);
													@Pc(1909) Class200 local1909 = Static569.aClass213_2.method5291(local537);
													if (local1617.anInt5925 != -1 && local1909.anInt5925 != -1) {
														local1638 = Static61.aClass48_1.method1016(local1617.anInt5925);
														@Pc(1930) Class365 local1930 = Static61.aClass48_1.method1016(local1909.anInt5925);
														if (local1638.anInt10218 < local1930.anInt10218) {
															local1882 = false;
														}
													}
												}
											}
											if (local1882) {
												if (local1450) {
													local1875.anInt8421 = 1;
													local1875.anInt8387 = local777;
													local1875.anInt8383 = 0;
													local1875.anInt8376 = Static106.anInt2418 + local73;
													local1875.anInt8406 = local773;
													local1875.anInt8432 = 0;
													local1875.anInt8438 = local230 & 0x7;
													if (local1875.anInt8376 > Static106.anInt2418) {
														local1875.anInt8383 = -1;
													}
													if (local1875.anInt8406 != -1 && local1875.anInt8376 == Static106.anInt2418) {
														local325 = Static569.aClass213_2.method5291(local1875.anInt8406).anInt5925;
														if (local325 != -1) {
															local1632 = Static61.aClass48_1.method1016(local325);
															if (local1632 != null && local1632.anIntArray551 != null && !local1875.aBoolean590) {
																Static301.method5179(local1632, local1875, 0);
															}
														}
													}
												} else {
													local1875.anInt8417 = 0;
													local1875.anInt8403 = local773;
													local1875.anInt8437 = local230 & 0x7;
													local1875.anInt8397 = 0;
													local1875.anInt8396 = 1;
													local1875.anInt8380 = local777;
													local1875.anInt8429 = Static106.anInt2418 + local73;
													if (local1875.anInt8429 > Static106.anInt2418) {
														local1875.anInt8417 = -1;
													}
													if (local1875.anInt8403 != -1 && Static106.anInt2418 == local1875.anInt8429) {
														local325 = Static569.aClass213_2.method5291(local1875.anInt8403).anInt5925;
														if (local325 != -1) {
															local1632 = Static61.aClass48_1.method1016(local325);
															if (local1632 != null && local1632.anIntArray551 != null && !local1875.aBoolean590) {
																Static301.method5179(local1632, local1875, 0);
															}
														}
													}
												}
											}
										}
									} else if (local477 >> 28 != 0) {
										local1463 = local477 & 0xFFFF;
										@Pc(1572) Class1_Sub4_Sub2_Sub1_Sub2 local1572;
										if (Static411.anInt7797 == local1463) {
											local1572 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1;
										} else {
											local1572 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local1463];
										}
										if (local1572 != null) {
											if (local773 == 65535) {
												local773 = -1;
											}
											local1589 = true;
											local533 = local1450 ? local1572.anInt8406 : local1572.anInt8403;
											@Pc(1666) Class365 local1666;
											if (local773 != -1 && local533 != -1) {
												@Pc(1612) Class200 local1612;
												if (local533 == local773) {
													local1612 = Static569.aClass213_2.method5291(local773);
													if (local1612.aBoolean441 && local1612.anInt5925 != -1) {
														local1666 = Static61.aClass48_1.method1016(local1612.anInt5925);
														local1669 = local1666.anInt10221;
														if (local1669 == 0 || local1669 == 2) {
															local1589 = false;
														} else if (local1669 == 1) {
															local1589 = true;
														}
													}
												} else {
													local1612 = Static569.aClass213_2.method5291(local773);
													local1617 = Static569.aClass213_2.method5291(local533);
													if (local1612.anInt5925 != -1 && local1617.anInt5925 != -1) {
														local1632 = Static61.aClass48_1.method1016(local1612.anInt5925);
														local1638 = Static61.aClass48_1.method1016(local1617.anInt5925);
														if (local1638.anInt10218 > local1632.anInt10218) {
															local1589 = false;
														}
													}
												}
											}
											if (local1589) {
												if (local1450) {
													local1572.anInt8421 = 1;
													local1572.anInt8387 = local777;
													local1572.anInt8406 = local773;
													local1572.anInt8376 = Static106.anInt2418 + local73;
													local1572.anInt8383 = 0;
													local1572.anInt8432 = 0;
													local1572.anInt8438 = local230 & 0x7;
													if (local1572.anInt8406 == 65535) {
														local1572.anInt8406 = -1;
													}
													if (local1572.anInt8376 > Static106.anInt2418) {
														local1572.anInt8383 = -1;
													}
													if (local1572.anInt8406 != -1 && local1572.anInt8376 == Static106.anInt2418) {
														local537 = Static569.aClass213_2.method5291(local1572.anInt8406).anInt5925;
														if (local537 != -1) {
															local1666 = Static61.aClass48_1.method1016(local537);
															if (local1666 != null && local1666.anIntArray551 != null && !local1572.aBoolean590) {
																Static301.method5179(local1666, local1572, 0);
															}
														}
													}
												} else {
													local1572.anInt8396 = 1;
													local1572.anInt8380 = local777;
													local1572.anInt8403 = local773;
													local1572.anInt8429 = local73 + Static106.anInt2418;
													local1572.anInt8417 = 0;
													local1572.anInt8437 = local230 & 0x7;
													local1572.anInt8397 = 0;
													if (Static106.anInt2418 < local1572.anInt8429) {
														local1572.anInt8417 = -1;
													}
													if (local1572.anInt8403 == 65535) {
														local1572.anInt8403 = -1;
													}
													if (local1572.anInt8403 != -1 && Static106.anInt2418 == local1572.anInt8429) {
														local537 = Static569.aClass213_2.method5291(local1572.anInt8403).anInt5925;
														if (local537 != -1) {
															local1666 = Static61.aClass48_1.method1016(local537);
															if (local1666 != null && local1666.anIntArray551 != null && !local1572.aBoolean590) {
																Static301.method5179(local1666, local1572, 0);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local1463 = local477 >> 28 & 0x3;
									local314 = (local477 >> 14 & 0x3FFF) - Static552.anInt9805;
									local1479 = (local477 & 0x3FFF) - Static254.anInt4667;
									if (local314 >= 0 && local1479 >= 0 && local314 < Static428.anInt8046 && local1479 < Static119.anInt2717) {
										local533 = local314 * 512 + 256;
										local537 = local1479 * 512 + 256;
										local325 = local1463;
										if (local1463 < 3 && Static310.method5267(local314, local1479)) {
											local325 = local1463 + 1;
										}
										@Pc(1539) Class1_Sub4_Sub2_Sub5 local1539 = new Class1_Sub4_Sub2_Sub5(local773, 0, Static106.anInt2418, local1463, local325, local533, Static501.method5641(local533, local1463, local537) - local777, local537, local314, local314, local1479, local1479, local230 & 0x7);
										Static584.aClass244_62.method5960(new Class4_Sub5_Sub18(local1539));
									}
								}
								Static257.aClass362_105 = null;
								return true;
							} else if (Static257.aClass362_105 == Static59.aClass362_32) {
								Static135.method2684(Static89.aBoolean155);
								Static257.aClass362_105 = null;
								return false;
							} else {
								@Pc(2169) boolean local2169;
								if (Static257.aClass362_105 == Static72.aClass362_174) {
									local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
									local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
									local2169 = (local73 & 0x1) == 1;
									while (Static319.aClass4_Sub11_Sub1_2.anInt5831 < Static186.anInt3680) {
										local773 = Static319.aClass4_Sub11_Sub1_2.method4942();
										local777 = Static319.aClass4_Sub11_Sub1_2.method4936();
										local783 = 0;
										if (local777 != 0) {
											local783 = Static319.aClass4_Sub11_Sub1_2.method4905();
											if (local783 == 255) {
												local783 = Static319.aClass4_Sub11_Sub1_2.method4931();
											}
										}
										Static104.method2215(local783, local773, local2169, local230, local777 - 1);
									}
									Static453.anIntArray466[Static552.anInt9807++ & 0x1F] = local230;
									Static257.aClass362_105 = null;
									return true;
								}
								@Pc(2253) boolean local2253;
								if (Static257.aClass362_105 == Static523.aClass362_204) {
									local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
									local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
									local292 = local290;
									if (local286) {
										local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
									}
									local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
									local2253 = false;
									if (local773 <= 1) {
										if (Static263.aBoolean365 && !Static593.aBoolean725 || Static417.aBoolean537) {
											local2253 = true;
										} else if (local773 <= 1 && Static511.method7464(local292)) {
											local2253 = true;
										}
									}
									if (!local2253 && Static24.anInt386 == 0) {
										local1324 = Static472.method7093(Static469.method7081(Static319.aClass4_Sub11_Sub1_2));
										if (local773 == 2) {
											Static502.method7386("<img=1>" + local290, 0, null, "<img=1>" + local292, 24, -1, local1324, local290);
										} else if (local773 == 1) {
											Static502.method7386("<img=0>" + local290, 0, null, "<img=0>" + local292, 24, -1, local1324, local290);
										} else {
											Static502.method7386(local290, 0, null, local292, 24, -1, local1324, local290);
										}
									}
									Static257.aClass362_105 = null;
									return true;
								} else if (Static257.aClass362_105 == Static544.aClass362_217) {
									local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
									local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
									local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
									local773 = Static319.aClass4_Sub11_Sub1_2.method4936() << 2;
									local777 = Static319.aClass4_Sub11_Sub1_2.method4905();
									local783 = Static319.aClass4_Sub11_Sub1_2.method4905();
									if (Static485.method7230(local230)) {
										Static387.method6106(local477, local773, true, local783, local73, local777);
									}
									Static257.aClass362_105 = null;
									return true;
								} else if (Static124.aClass362_219 == Static257.aClass362_105) {
									local230 = Static319.aClass4_Sub11_Sub1_2.method4931();
									local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
									if (Static485.method7230(local73)) {
										Static173.method3149(local230, 3, -1, -1);
									}
									Static257.aClass362_105 = null;
									return true;
								} else if (Static331.aClass362_141 == Static257.aClass362_105) {
									Static257.aClass362_105 = null;
									return false;
								} else if (Static111.aClass362_61 == Static257.aClass362_105) {
									local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
									local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
									local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
									if (Static485.method7230(local73)) {
										Static277.method4811(local292, local230);
									}
									Static257.aClass362_105 = null;
									return true;
								} else if (Static257.aClass362_105 == Static412.aClass362_172) {
									Static534.anInt9504 = Static319.aClass4_Sub11_Sub1_2.method4938();
									Static99.anInt2281 = Static319.aClass4_Sub11_Sub1_2.method4947();
									Static257.aClass362_105 = null;
									return true;
								} else if (Static375.aClass362_156 == Static257.aClass362_105) {
									Static319.aClass4_Sub11_Sub1_2.anInt5831 += 28;
									if (Static319.aClass4_Sub11_Sub1_2.method4907()) {
										Static490.method7269(Static319.aClass4_Sub11_Sub1_2, Static319.aClass4_Sub11_Sub1_2.anInt5831 - 28);
									}
									Static257.aClass362_105 = null;
									return true;
								} else {
									@Pc(2526) String local2526;
									if (Static257.aClass362_105 == Static539.aClass362_211) {
										local2526 = Static319.aClass4_Sub11_Sub1_2.method4920();
										local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
										if (local73 == 65535) {
											local73 = -1;
										}
										local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
										local773 = Static319.aClass4_Sub11_Sub1_2.method4947();
										if (local773 >= 1 && local773 <= 8) {
											if (local2526.equalsIgnoreCase("null")) {
												local2526 = null;
											}
											Static394.aStringArray50[local773 - 1] = local2526;
											Static377.anIntArray368[local773 - 1] = local73;
											Static205.aBooleanArray7[local773 - 1] = local477 == 0;
										}
										Static257.aClass362_105 = null;
										return true;
									} else if (Static262.aClass362_107 == Static257.aClass362_105) {
										local230 = Static319.aClass4_Sub11_Sub1_2.method4927();
										local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
										local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
										local773 = Static319.aClass4_Sub11_Sub1_2.method4923();
										if (local773 == 65535) {
											local773 = -1;
										}
										if (Static485.method7230(local477)) {
											Static513.method7505(local230, local773, local73);
											@Pc(2629) Class242 local2629 = Static521.aClass273_2.method6712(local773);
											Static257.method4156(local2629.anInt7097, local230, local2629.anInt7126, local2629.anInt7113);
											Static59.method989(local2629.anInt7142, local2629.anInt7082, local230, local2629.anInt7137);
										}
										Static257.aClass362_105 = null;
										return true;
									} else if (Static456.aClass362_190 == Static257.aClass362_105) {
										local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
										local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
										local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
										local773 = Static319.aClass4_Sub11_Sub1_2.method4936() << 2;
										local777 = Static319.aClass4_Sub11_Sub1_2.method4905();
										local783 = Static319.aClass4_Sub11_Sub1_2.method4905();
										if (Static485.method7230(local230)) {
											Static561.method5050(local73, local783, local777, local773, local477);
										}
										Static257.aClass362_105 = null;
										return true;
									} else {
										@Pc(2715) boolean local2715;
										if (Static257.aClass362_105 == Static535.aClass362_210) {
											local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
											local2715 = Static319.aClass4_Sub11_Sub1_2.method4916() == 1;
											if (Static485.method7230(local230)) {
												Static394.aBoolean520 = local2715;
											}
											Static257.aClass362_105 = null;
											return true;
										} else if (Static257.aClass362_105 == Static34.aClass362_24) {
											Static294.aClass247_3 = Static441.method5002(Static319.aClass4_Sub11_Sub1_2.method4905());
											Static257.aClass362_105 = null;
											return true;
										} else if (Static257.aClass362_105 == Static265.aClass362_113) {
											local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
											if (Static485.method7230(local230)) {
												Static428.method6708();
											}
											Static257.aClass362_105 = null;
											return true;
										} else if (Static474.aClass362_197 == Static257.aClass362_105) {
											Static446.method6892(Static153.aClass162_9);
											Static257.aClass362_105 = null;
											return true;
										} else if (Static140.aClass362_52 == Static257.aClass362_105) {
											local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
											@Pc(2788) byte[] local2788 = new byte[Static186.anInt3680 - 1];
											Static319.aClass4_Sub11_Sub1_2.method4926(Static186.anInt3680 - 1, local2788);
											Static224.method3665(local2788, local286);
											Static257.aClass362_105 = null;
											return true;
										} else {
											@Pc(3137) String local3137;
											@Pc(2844) boolean local2844;
											if (Static243.aClass362_98 == Static257.aClass362_105) {
												while (Static186.anInt3680 > Static319.aClass4_Sub11_Sub1_2.anInt5831) {
													local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
													local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local773 = Static319.aClass4_Sub11_Sub1_2.method4936();
													local777 = Static319.aClass4_Sub11_Sub1_2.method4905();
													local1324 = "";
													local2844 = false;
													if (local773 > 0) {
														local1324 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local2844 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
													}
													for (local314 = 0; local314 < Static493.anInt8959; local314++) {
														if (local286) {
															if (local292.equals(Static220.aStringArray22[local314])) {
																Static220.aStringArray22[local314] = local290;
																Static274.aStringArray34[local314] = local292;
																local290 = null;
																break;
															}
														} else if (local290.equals(Static220.aStringArray22[local314])) {
															if (local773 != Static471.anIntArray476[local314]) {
																local1589 = true;
																for (@Pc(2905) Class1_Sub1_Sub2 local2905 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3288(); local2905 != null; local2905 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3286()) {
																	if (local2905.aString70.equals(local290)) {
																		if (local773 != 0 && local2905.aShort79 == 0) {
																			local2905.method8252();
																			local1589 = false;
																		} else if (local773 == 0 && local2905.aShort79 != 0) {
																			local2905.method8252();
																			local1589 = false;
																		}
																	}
																}
																if (local1589) {
																	Static543.aClass136_8.method3289(new Class1_Sub1_Sub2(local290, local773));
																}
																Static471.anIntArray476[local314] = local773;
															}
															Static274.aStringArray34[local314] = local292;
															Static241.aStringArray25[local314] = local1324;
															Static344.anIntArray342[local314] = local777;
															Static374.aBooleanArray23[local314] = local2844;
															local290 = null;
															break;
														}
													}
													if (local290 != null && Static493.anInt8959 < 200) {
														Static220.aStringArray22[Static493.anInt8959] = local290;
														Static274.aStringArray34[Static493.anInt8959] = local292;
														Static471.anIntArray476[Static493.anInt8959] = local773;
														Static241.aStringArray25[Static493.anInt8959] = local1324;
														Static344.anIntArray342[Static493.anInt8959] = local777;
														Static374.aBooleanArray23[Static493.anInt8959] = local2844;
														Static493.anInt8959++;
													}
												}
												Static341.anInt6623 = Static436.anInt8161;
												Static238.anInt4334 = 2;
												local73 = Static493.anInt8959;
												while (local73 > 0) {
													local73--;
													local286 = true;
													for (local477 = 0; local477 < local73; local477++) {
														if (Static471.anIntArray476[local477] != Static60.aClass342_1.anInt9881 && Static60.aClass342_1.anInt9881 == Static471.anIntArray476[local477 + 1] || Static471.anIntArray476[local477] == 0 && Static471.anIntArray476[local477 + 1] != 0) {
															local773 = Static471.anIntArray476[local477];
															Static471.anIntArray476[local477] = Static471.anIntArray476[local477 + 1];
															Static471.anIntArray476[local477 + 1] = local773;
															local1297 = Static241.aStringArray25[local477];
															Static241.aStringArray25[local477] = Static241.aStringArray25[local477 + 1];
															Static241.aStringArray25[local477 + 1] = local1297;
															local1324 = Static220.aStringArray22[local477];
															Static220.aStringArray22[local477] = Static220.aStringArray22[local477 + 1];
															Static220.aStringArray22[local477 + 1] = local1324;
															local3137 = Static274.aStringArray34[local477];
															Static274.aStringArray34[local477] = Static274.aStringArray34[local477 + 1];
															Static274.aStringArray34[local477 + 1] = local3137;
															local314 = Static344.anIntArray342[local477];
															Static344.anIntArray342[local477] = Static344.anIntArray342[local477 + 1];
															Static344.anIntArray342[local477 + 1] = local314;
															local1589 = Static374.aBooleanArray23[local477];
															Static374.aBooleanArray23[local477] = Static374.aBooleanArray23[local477 + 1];
															Static374.aBooleanArray23[local477 + 1] = local1589;
															local286 = false;
														}
													}
													if (local286) {
														break;
													}
												}
												Static257.aClass362_105 = null;
												return true;
											} else if (Static257.aClass362_105 == Static367.aClass362_151) {
												@Pc(3213) int[] local3213 = new int[4];
												for (local73 = 0; local73 < 4; local73++) {
													local3213[local73] = Static319.aClass4_Sub11_Sub1_2.method4923();
												}
												local477 = Static319.aClass4_Sub11_Sub1_2.method4947();
												local773 = Static319.aClass4_Sub11_Sub1_2.method4955();
												@Pc(3244) Class4_Sub4 local3244 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local773);
												if (local3244 != null) {
													Static240.method7432(local3213, local477, local3244.aClass1_Sub4_Sub2_Sub1_Sub1_1);
												}
												Static257.aClass362_105 = null;
												return true;
											} else if (Static471.aClass362_194 == Static257.aClass362_105) {
												local230 = Static319.aClass4_Sub11_Sub1_2.method4931();
												local73 = Static319.aClass4_Sub11_Sub1_2.method4923();
												local477 = Static319.aClass4_Sub11_Sub1_2.method4947();
												if (Static485.method7230(local73)) {
													Static36.method7992(local230, local477);
												}
												Static257.aClass362_105 = null;
												return true;
											} else if (Static257.aClass362_105 == Static440.aClass362_183) {
												local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
												local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
												local292 = local290;
												if (local286) {
													local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
												}
												local303 = Static319.aClass4_Sub11_Sub1_2.method4903();
												local310 = Static319.aClass4_Sub11_Sub1_2.method4936();
												local527 = Static319.aClass4_Sub11_Sub1_2.method4934();
												local533 = Static319.aClass4_Sub11_Sub1_2.method4905();
												@Pc(3335) long local3335 = local527 + (local310 << 32);
												@Pc(3337) boolean local3337 = false;
												local1967 = 0;
												while (true) {
													if (local1967 >= 100) {
														if (local533 <= 1) {
															if (Static263.aBoolean365 && !Static593.aBoolean725 || Static417.aBoolean537) {
																local3337 = true;
															} else if (Static511.method7464(local292)) {
																local3337 = true;
															}
														}
														break;
													}
													if (Static446.aLongArray15[local1967] == local3335) {
														local3337 = true;
														break;
													}
													local1967++;
												}
												if (!local3337 && Static24.anInt386 == 0) {
													Static446.aLongArray15[Static384.anInt7374] = local3335;
													Static384.anInt7374 = (Static384.anInt7374 + 1) % 100;
													@Pc(3396) String local3396 = Static472.method7093(Static469.method7081(Static319.aClass4_Sub11_Sub1_2));
													if (local533 == 2 || local533 == 3) {
														Static502.method7386("<img=1>" + local290, 0, Static89.method2077(local303), "<img=1>" + local292, 9, -1, local3396, local290);
													} else if (local533 == 1) {
														Static502.method7386("<img=0>" + local290, 0, Static89.method2077(local303), "<img=0>" + local292, 9, -1, local3396, local290);
													} else {
														Static502.method7386(local290, 0, Static89.method2077(local303), local292, 9, -1, local3396, local290);
													}
												}
												Static257.aClass362_105 = null;
												return true;
											} else {
												@Pc(3536) Class181 local3536;
												if (Static257.aClass362_105 == Static266.aClass362_115) {
													local2526 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local2169 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
													if (local2169) {
														local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
													} else {
														local290 = local2526;
													}
													local773 = Static319.aClass4_Sub11_Sub1_2.method4936();
													@Pc(3517) byte local3517 = Static319.aClass4_Sub11_Sub1_2.method4925();
													local1450 = false;
													if (local3517 == -128) {
														local1450 = true;
													}
													if (local1450) {
														if (Static247.anInt4517 == 0) {
															Static257.aClass362_105 = null;
															return true;
														}
														for (local1463 = 0; local1463 < Static247.anInt4517 && (!Static126.aClass181Array1[local1463].aString50.equals(local290) || local773 != Static126.aClass181Array1[local1463].anInt4676); local1463++) {
														}
														if (Static247.anInt4517 > local1463) {
															while (local1463 < Static247.anInt4517 - 1) {
																Static126.aClass181Array1[local1463] = Static126.aClass181Array1[local1463 + 1];
																local1463++;
															}
															Static247.anInt4517--;
															Static126.aClass181Array1[Static247.anInt4517] = null;
														}
													} else {
														local3137 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local3536 = new Class181();
														local3536.aString50 = local290;
														local3536.aString51 = local2526;
														local3536.aString53 = Static444.method6843(local3536.aString50);
														local3536.anInt4676 = local773;
														local3536.aByte43 = local3517;
														local3536.aString52 = local3137;
														for (local1479 = Static247.anInt4517 - 1; local1479 >= 0; local1479--) {
															local533 = Static126.aClass181Array1[local1479].aString53.compareTo(local3536.aString53);
															if (local533 == 0) {
																Static126.aClass181Array1[local1479].anInt4676 = local773;
																Static126.aClass181Array1[local1479].aByte43 = local3517;
																Static126.aClass181Array1[local1479].aString52 = local3137;
																if (local290.equals(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78)) {
																	Static351.aByte115 = local3517;
																}
																Static257.aClass362_105 = null;
																Static74.anInt1244 = Static436.anInt8161;
																return true;
															}
															if (local533 < 0) {
																break;
															}
														}
														if (Static126.aClass181Array1.length <= Static247.anInt4517) {
															Static257.aClass362_105 = null;
															return true;
														}
														for (local533 = Static247.anInt4517 - 1; local533 > local1479; local533--) {
															Static126.aClass181Array1[local533 + 1] = Static126.aClass181Array1[local533];
														}
														if (Static247.anInt4517 == 0) {
															Static126.aClass181Array1 = new Class181[100];
														}
														Static126.aClass181Array1[local1479 + 1] = local3536;
														Static247.anInt4517++;
														if (local290.equals(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78)) {
															Static351.aByte115 = local3517;
														}
													}
													Static74.anInt1244 = Static436.anInt8161;
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static261.aClass362_106) {
													Static341.anInt6623 = Static436.anInt8161;
													Static238.anInt4334 = 1;
													Static257.aClass362_105 = null;
													return true;
												} else if (Static427.aClass362_176 == Static257.aClass362_105) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4899();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4899();
													if (Static485.method7230(local230)) {
														@Pc(3779) Class4_Sub37 local3779 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local477);
														local921 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local73);
														if (local921 != null) {
															Static161.method525(false, local3779 == null || local3779.anInt8141 != local921.anInt8141, local921);
														}
														if (local3779 != null) {
															local3779.method8379();
															Static189.aClass350_14.method8199((long) local73, local3779);
														}
														@Pc(3825) Class225 local3825 = Static490.method7272(local477);
														if (local3825 != null) {
															Static92.method2100(local3825);
														}
														local3825 = Static490.method7272(local73);
														if (local3825 != null) {
															Static92.method2100(local3825);
															Static38.method489(true, local3825);
														}
														if (Static332.anInt6370 != -1) {
															Static228.method3612(1, Static332.anInt6370);
														}
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static558.aClass362_222 == Static257.aClass362_105) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4956();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
													if (local477 == 65535) {
														local477 = -1;
													}
													if (Static485.method7230(local73)) {
														Static173.method3149(local230, 2, local477, -1);
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static219.aClass362_89) {
													Static446.method6892(Static504.aClass162_27);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static466.aClass362_214) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
													local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
													if (Static485.method7230(local477)) {
														Static277.method4811(local290, local230);
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static42.aClass362_27) {
													Static205.method3453(Static319.aClass4_Sub11_Sub1_2, Static186.anInt3680);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static463.aClass362_154 == Static257.aClass362_105) {
													Static74.anInt1244 = Static436.anInt8161;
													if (Static186.anInt3680 == 0) {
														Static517.aString89 = null;
														Static126.aClass181Array1 = null;
														Static257.aClass362_105 = null;
														Static395.aString73 = null;
														Static247.anInt4517 = 0;
														return true;
													}
													Static395.aString73 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
													if (local286) {
														Static319.aClass4_Sub11_Sub1_2.method4920();
													}
													@Pc(3992) long local3992 = Static319.aClass4_Sub11_Sub1_2.method4903();
													Static517.aString89 = Static315.method5297(local3992);
													Static44.aByte11 = Static319.aClass4_Sub11_Sub1_2.method4925();
													local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
													if (local773 == 255) {
														Static257.aClass362_105 = null;
														return true;
													}
													Static247.anInt4517 = local773;
													@Pc(4018) Class181[] local4018 = new Class181[100];
													for (local783 = 0; local783 < Static247.anInt4517; local783++) {
														local4018[local783] = new Class181();
														local4018[local783].aString51 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
														if (local286) {
															local4018[local783].aString50 = Static319.aClass4_Sub11_Sub1_2.method4920();
														} else {
															local4018[local783].aString50 = local4018[local783].aString51;
														}
														local4018[local783].aString53 = Static444.method6843(local4018[local783].aString50);
														local4018[local783].anInt4676 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local4018[local783].aByte43 = Static319.aClass4_Sub11_Sub1_2.method4925();
														local4018[local783].aString52 = Static319.aClass4_Sub11_Sub1_2.method4920();
														if (local4018[local783].aString50.equals(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78)) {
															Static351.aByte115 = local4018[local783].aByte43;
														}
													}
													local1479 = Static247.anInt4517;
													while (local1479 > 0) {
														local1479--;
														local2844 = true;
														for (local533 = 0; local533 < local1479; local533++) {
															if (local4018[local533].aString53.compareTo(local4018[local533 + 1].aString53) > 0) {
																local3536 = local4018[local533];
																local4018[local533] = local4018[local533 + 1];
																local4018[local533 + 1] = local3536;
																local2844 = false;
															}
														}
														if (local2844) {
															break;
														}
													}
													Static126.aClass181Array1 = local4018;
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static524.aClass362_227) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
													if (Static485.method7230(local230)) {
														Static276.anInt5641 = local73;
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static490.aClass362_198) {
													Static307.anInt6166 = Static319.aClass4_Sub11_Sub1_2.method4905();
													Static257.aClass362_105 = null;
													Static284.anInt5784 = Static436.anInt8161;
													return true;
												} else if (Static257.aClass362_105 == Static322.aClass362_137) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
													if (local230 == 65535) {
														local230 = -1;
													}
													local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
													local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
													Static190.method3334(local773, local477, local230, true, 256, local73);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static17.aClass362_10 == Static257.aClass362_105) {
													Static536.method7777(Static319.aClass4_Sub11_Sub1_2.method4920());
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static53.aClass362_28) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
													local773 = Static319.aClass4_Sub11_Sub1_2.method4931();
													if (Static485.method7230(local230)) {
														Static173.method3149(local773, 5, local477, local73);
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static15.aClass362_9 == Static257.aClass362_105) {
													Static45.aClass148_1.method3457();
													Static532.anInt9484 += 32;
													Static257.aClass362_105 = null;
													return true;
												} else if (Static99.aClass362_50 == Static257.aClass362_105) {
													Static292.method6463();
													Static257.aClass362_105 = null;
													return false;
												} else if (Static257.aClass362_105 == Static340.aClass362_145) {
													local210 = Static319.aClass4_Sub11_Sub1_2.method4925();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4905();
													if (Static485.method7230(local73)) {
														Static36.method7993(local477, local210);
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static251.aClass362_99) {
													if (Static13.aFrame1 != null) {
														Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
													}
													@Pc(4378) byte[] local4378 = new byte[Static186.anInt3680];
													Static319.aClass4_Sub11_Sub1_2.method1539(local4378, Static186.anInt3680);
													local290 = Static534.method7768(Static186.anInt3680, 0, local4378);
													Static516.method7519(true, local290, Static495.anInt9000 == 1, Static406.aClass354_5);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static440.aClass362_182 == Static257.aClass362_105) {
													if (Static272.method4728(Static203.anInt3855)) {
														Static454.anInt8310 = (int) ((float) Static319.aClass4_Sub11_Sub1_2.method4936() * 2.5F);
													} else {
														Static454.anInt8310 = Static319.aClass4_Sub11_Sub1_2.method4936() * 30;
													}
													Static257.aClass362_105 = null;
													Static284.anInt5784 = Static436.anInt8161;
													return true;
												} else if (Static257.aClass362_105 == Static462.aClass362_193) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4910();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
													if (Static485.method7230(local230)) {
														Static226.method3712(local73, local477);
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static73.aClass362_40 == Static257.aClass362_105) {
													Static446.method6892(Static540.aClass162_16);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static315.aClass362_135) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4947();
													local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4955();
													if (Static485.method7230(local477)) {
														if (local230 == 2) {
															Static343.method5579();
														}
														Static332.anInt6370 = local73;
														Static178.method3228(local73);
														Static487.method7235(false);
														Static388.method6115(Static332.anInt6370);
														for (local773 = 0; local773 < 100; local773++) {
															Static261.aBooleanArray18[local773] = true;
														}
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static275.aClass362_122) {
													Static446.method6892(Static12.aClass162_2);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static58.aClass362_31) {
													Static267.anInt5132 = Static319.aClass4_Sub11_Sub1_2.method4905();
													for (local230 = 0; local230 < Static267.anInt5132; local230++) {
														Static523.aStringArray64[local230] = Static319.aClass4_Sub11_Sub1_2.method4920();
														Static535.aStringArray66[local230] = Static319.aClass4_Sub11_Sub1_2.method4920();
														if (Static535.aStringArray66[local230].equals("")) {
															Static535.aStringArray66[local230] = Static523.aStringArray64[local230];
														}
														Static282.aStringArray27[local230] = Static319.aClass4_Sub11_Sub1_2.method4920();
														Static502.aStringArray63[local230] = Static319.aClass4_Sub11_Sub1_2.method4920();
														if (Static502.aStringArray63[local230].equals("")) {
															Static502.aStringArray63[local230] = Static282.aStringArray27[local230];
														}
														Static324.aBooleanArray20[local230] = false;
													}
													Static257.aClass362_105 = null;
													Static341.anInt6623 = Static436.anInt8161;
													return true;
												} else if (Static257.aClass362_105 == Static263.aClass362_108) {
													Static574.anInt10047 = Static319.aClass4_Sub11_Sub1_2.method4905();
													Static257.aClass362_105 = null;
													return true;
												} else if (Static257.aClass362_105 == Static189.aClass362_83) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
													if (local230 == 65535) {
														local230 = -1;
													}
													local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
													local477 = local73 >> 28 & 0x3;
													local773 = local73 >> 14 & 0x3FFF;
													local777 = local73 & 0x3FFF;
													local783 = Static319.aClass4_Sub11_Sub1_2.method4916();
													local1463 = local783 >> 2;
													local314 = local783 & 0x3;
													local777 -= Static254.anInt4667;
													local773 -= Static552.anInt9805;
													local1479 = Static550.anIntArray521[local1463];
													Static39.method491(local314, local773, local777, local230, local477, local1479, local1463);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static530.aClass362_206 == Static257.aClass362_105) {
													Static446.method6892(Static296.aClass162_17);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static301.aClass362_129 == Static257.aClass362_105) {
													local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
													local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
													local292 = local290;
													if (local286) {
														local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
													}
													local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
													local777 = Static319.aClass4_Sub11_Sub1_2.method4936();
													local1450 = false;
													if (local773 <= 1 && Static511.method7464(local292)) {
														local1450 = true;
													}
													if (!local1450 && Static24.anInt386 == 0) {
														local3137 = Static190.aClass295_1.method7021(local777).method3765(Static319.aClass4_Sub11_Sub1_2);
														if (local773 == 2) {
															Static502.method7386("<img=1>" + local290, 0, null, "<img=1>" + local292, 25, local777, local3137, local290);
														} else if (local773 == 1) {
															Static502.method7386("<img=0>" + local290, 0, null, "<img=0>" + local292, 25, local777, local3137, local290);
														} else {
															Static502.method7386(local290, 0, null, local292, 25, local777, local3137, local290);
														}
													}
													Static257.aClass362_105 = null;
													return true;
												} else if (Static371.aClass362_155 == Static257.aClass362_105) {
													Static446.method6892(Static278.aClass162_15);
													Static257.aClass362_105 = null;
													return true;
												} else if (Static104.aClass362_53 == Static257.aClass362_105) {
													local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
													if (local230 == 65535) {
														local230 = -1;
													}
													local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
													local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
													local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
													local777 = Static319.aClass4_Sub11_Sub1_2.method4936();
													Static190.method3334(local773, local477, local230, false, local777, local73);
													Static257.aClass362_105 = null;
													return true;
												} else {
													@Pc(4943) long local4943;
													@Pc(4962) Class4_Sub2 local4962;
													@Pc(4951) Class4_Sub2 local4951;
													if (Static257.aClass362_105 == Static385.aClass362_159) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4927();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4931();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4955();
														if (local477 == 65535) {
															local477 = -1;
														}
														local773 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local777 = Static319.aClass4_Sub11_Sub1_2.method4955();
														if (local777 == 65535) {
															local777 = -1;
														}
														if (Static485.method7230(local773)) {
															for (local783 = local477; local783 <= local777; local783++) {
																local4943 = (long) local783 + ((long) local230 << 32);
																local4951 = (Class4_Sub2) Static307.aClass350_24.method8207(local4943);
																if (local4951 != null) {
																	local4962 = new Class4_Sub2(local73, local4951.anInt151);
																	local4951.method8379();
																} else if (local783 == -1) {
																	local4962 = new Class4_Sub2(local73, Static490.method7272(local230).aClass4_Sub2_2.anInt151);
																} else {
																	local4962 = new Class4_Sub2(local73, -1);
																}
																Static307.aClass350_24.method8199(local4943, local4962);
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static111.aClass362_60 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4899();
														if (Static485.method7230(local230)) {
															Static173.method3149(local73, 5, Static411.anInt7797, 0);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static416.aClass362_173 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local2715 = (local230 & 0x1) == 1;
														local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local1295 = Static319.aClass4_Sub11_Sub1_2.method4920();
														if (local1295.equals("")) {
															local1295 = local292;
														}
														local1297 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local1324 = Static319.aClass4_Sub11_Sub1_2.method4920();
														if (local1324.equals("")) {
															local1324 = local1297;
														}
														if (local2715) {
															for (local1463 = 0; local1463 < Static267.anInt5132; local1463++) {
																if (Static535.aStringArray66[local1463].equals(local1324)) {
																	Static523.aStringArray64[local1463] = local292;
																	Static535.aStringArray66[local1463] = local1295;
																	Static282.aStringArray27[local1463] = local1297;
																	Static502.aStringArray63[local1463] = local1324;
																	break;
																}
															}
														} else {
															Static523.aStringArray64[Static267.anInt5132] = local292;
															Static535.aStringArray66[Static267.anInt5132] = local1295;
															Static282.aStringArray27[Static267.anInt5132] = local1297;
															Static502.aStringArray63[Static267.anInt5132] = local1324;
															Static324.aBooleanArray20[Static267.anInt5132] = (local230 & 0x2) == 2;
															Static267.anInt5132++;
														}
														Static341.anInt6623 = Static436.anInt8161;
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static308.aClass362_131) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (Static485.method7230(local477)) {
															Static463.method5955(local73, local230);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static515.aClass362_201) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local2169 = (local73 & 0x1) == 1;
														Static62.method1017(local230, local2169);
														local773 = Static319.aClass4_Sub11_Sub1_2.method4936();
														for (local777 = 0; local777 < local773; local777++) {
															local783 = Static319.aClass4_Sub11_Sub1_2.method4905();
															if (local783 == 255) {
																local783 = Static319.aClass4_Sub11_Sub1_2.method4931();
															}
															local1463 = Static319.aClass4_Sub11_Sub1_2.method4955();
															Static104.method2215(local783, local777, local2169, local230, local1463 - 1);
														}
														Static453.anIntArray466[Static552.anInt9807++ & 0x1F] = local230;
														Static257.aClass362_105 = null;
														return true;
													} else if (Static136.aClass362_67 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														@Pc(5273) Class1_Sub4_Sub2_Sub1_Sub2 local5273;
														if (local230 == Static411.anInt7797) {
															local5273 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1;
														} else {
															local5273 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local230];
														}
														if (local5273 == null) {
															Static257.aClass362_105 = null;
															return true;
														}
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local2253 = (local477 & 0x8000) != 0;
														if (local5273.aString78 != null && local5273.aClass166_1 != null) {
															local1450 = false;
															if (local773 <= 1) {
																if (!local2253 && (Static263.aBoolean365 && !Static593.aBoolean725 || Static417.aBoolean537)) {
																	local1450 = true;
																} else if (Static511.method7464(local5273.aString78)) {
																	local1450 = true;
																}
															}
															if (!local1450 && Static24.anInt386 == 0) {
																local314 = -1;
																if (local2253) {
																	local477 &= 0x7FFF;
																	@Pc(5361) Class63 local5361 = Static315.method5299(Static319.aClass4_Sub11_Sub1_2);
																	local314 = local5361.anInt2196;
																	local3137 = local5361.aClass4_Sub5_Sub9_1.method3765(Static319.aClass4_Sub11_Sub1_2);
																} else {
																	local3137 = Static472.method7093(Static469.method7081(Static319.aClass4_Sub11_Sub1_2));
																}
																local5273.aString76 = local3137.trim();
																local5273.anInt8362 = local477 >> 8;
																local5273.anInt8399 = 150;
																local5273.anInt8430 = local477 & 0xFF;
																if (local773 == 1 || local773 == 2) {
																	local1479 = local2253 ? 17 : 1;
																} else {
																	local1479 = local2253 ? 17 : 2;
																}
																if (local773 == 2) {
																	Static502.method7386("<img=1>" + local5273.method6949(), 0, null, "<img=1>" + local5273.method6939(), local1479, local314, local3137, local5273.aString77);
																} else if (local773 == 1) {
																	Static502.method7386("<img=0>" + local5273.method6949(), 0, null, "<img=0>" + local5273.method6939(), local1479, local314, local3137, local5273.aString77);
																} else {
																	Static502.method7386(local5273.method6949(), 0, null, local5273.method6939(), local1479, local314, local3137, local5273.aString77);
																}
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static367.aClass362_150 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4956();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (Static485.method7230(local230)) {
															Static280.method4858(local73, local477);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static518.aClass362_202 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4954();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4910();
														if (Static485.method7230(local73)) {
															Static262.method4436(local230, local477, local773);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static264.aClass362_109) {
														Static177.method7478();
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static264.aClass362_110) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (Static485.method7230(local230)) {
															Static383.method6076();
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static17.aClass362_11) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
														@Pc(5608) Object[] local5608 = new Object[local290.length() + 1];
														for (local773 = local290.length() - 1; local773 >= 0; local773--) {
															if (local290.charAt(local773) == 's') {
																local5608[local773 + 1] = Static319.aClass4_Sub11_Sub1_2.method4920();
															} else {
																local5608[local773 + 1] = Integer.valueOf(Static319.aClass4_Sub11_Sub1_2.method4931());
															}
														}
														local5608[0] = Integer.valueOf(Static319.aClass4_Sub11_Sub1_2.method4931());
														if (Static485.method7230(local230)) {
															@Pc(5664) Class4_Sub25 local5664 = new Class4_Sub25();
															local5664.anObjectArray1 = local5608;
															Static388.method6121(local5664);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static314.aClass362_134 == Static257.aClass362_105) {
														Static135.method2684(false);
														Static257.aClass362_105 = null;
														return false;
													} else if (Static257.aClass362_105 == Static553.aClass362_221) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (local230 == 65535) {
															local230 = -1;
														}
														local73 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local777 = Static319.aClass4_Sub11_Sub1_2.method4936();
														Static212.method3531(local230, local773, local777, local477, local73);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static191.aClass362_85 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (local477 == 65535) {
															local477 = -1;
														}
														if (Static485.method7230(local230)) {
															Static13.method183(local73, local477);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static99.aClass362_51 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4923();
														Static45.aClass148_1.method3451(local230, local73);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static439.aClass362_180) {
														local2526 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local290 = Static472.method7093(Static469.method7081(Static319.aClass4_Sub11_Sub1_2));
														Static574.method8209(local2526, local290, local2526, local2526, 6, 0);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static585.aClass362_220 == Static257.aClass362_105) {
														local210 = Static319.aClass4_Sub11_Sub1_2.method4901();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (Static485.method7230(local477)) {
															Static280.method4858(local210, local73);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static196.aClass362_86 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4955();
														local777 = Static319.aClass4_Sub11_Sub1_2.method4923();
														if (Static485.method7230(local73)) {
															Static173.method3149(local477, 7, local230 | local773 << 16, local777);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static329.aClass362_140 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4927();
														if (Static485.method7230(local230)) {
															if (local73 == -1) {
																Static214.anInt3969 = -1;
																Static326.anInt6302 = -1;
															} else {
																local477 = local73 >> 14 & 0x3FFF;
																local773 = local73 & 0x3FFF;
																local477 -= Static552.anInt9805;
																if (local477 < 0) {
																	local477 = 0;
																} else if (Static428.anInt8046 <= local477) {
																	local477 = Static428.anInt8046;
																}
																local773 -= Static254.anInt4667;
																if (local773 < 0) {
																	local773 = 0;
																} else if (local773 >= Static119.anInt2717) {
																	local773 = Static119.anInt2717;
																}
																Static326.anInt6302 = (local477 << 9) + 256;
																Static214.anInt3969 = (local773 << 9) + 256;
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static6.aClass362_7) {
														Static446.method6892(Static274.aClass162_14);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static232.aClass362_93 == Static257.aClass362_105) {
														Static39.anInt538 = Static319.aClass4_Sub11_Sub1_2.method4953() << 3;
														Static102.anInt6216 = Static319.aClass4_Sub11_Sub1_2.method4916();
														Static570.anInt9983 = Static319.aClass4_Sub11_Sub1_2.method4952() << 3;
														while (Static186.anInt3680 > Static319.aClass4_Sub11_Sub1_2.anInt5831) {
															@Pc(5995) Class162 local5995 = Static134.method2658()[Static319.aClass4_Sub11_Sub1_2.method4905()];
															Static446.method6892(local5995);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static569.aClass362_228 == Static257.aClass362_105) {
														local2526 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local292 = Static190.aClass295_1.method7021(local73).method3765(Static319.aClass4_Sub11_Sub1_2);
														Static502.method7386(local2526, 0, null, local2526, 19, local73, local292, local2526);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static42.aClass362_26 == Static257.aClass362_105) {
														Static478.aString85 = Static186.anInt3680 > 2 ? Static319.aClass4_Sub11_Sub1_2.method4920() : Static590.aClass364_30.method8334(Static154.anInt3181);
														Static410.anInt7776 = Static186.anInt3680 > 0 ? Static319.aClass4_Sub11_Sub1_2.method4936() : -1;
														Static257.aClass362_105 = null;
														if (Static410.anInt7776 == 65535) {
															Static410.anInt7776 = -1;
														}
														return true;
													} else if (Static583.aClass362_231 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4938();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4916();
														if (local230 == 255) {
															local73 = -1;
															local230 = -1;
														}
														Static246.method3956(local230, local73);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static33.aClass362_23 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4936();
														if (Static485.method7230(local230) && Static343.aClass225ArrayArray1[local73] != null) {
															for (local777 = local477; local777 < local773; local777++) {
																local783 = Static319.aClass4_Sub11_Sub1_2.method4934();
																if (Static343.aClass225ArrayArray1[local73].length > local777 && Static343.aClass225ArrayArray1[local73][local777] != null) {
																	Static343.aClass225ArrayArray1[local73][local777].anInt6549 = local783;
																}
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static187.aClass362_82) {
														Static39.anInt538 = Static319.aClass4_Sub11_Sub1_2.method4953() << 3;
														Static570.anInt9983 = Static319.aClass4_Sub11_Sub1_2.method4925() << 3;
														Static102.anInt6216 = Static319.aClass4_Sub11_Sub1_2.method4905();
														for (@Pc(6206) Class4_Sub13 local6206 = (Class4_Sub13) Static251.aClass350_19.method8198(); local6206 != null; local6206 = (Class4_Sub13) Static251.aClass350_19.method8205()) {
															local73 = (int) (local6206.aLong268 >> 28 & 0x3L);
															local477 = (int) (local6206.aLong268 & 0x3FFFL);
															local773 = local477 - Static552.anInt9805;
															local777 = (int) (local6206.aLong268 >> 14 & 0x3FFFL);
															local783 = local777 - Static254.anInt4667;
															if (local73 == Static102.anInt6216 && Static570.anInt9983 <= local773 && Static570.anInt9983 + 8 > local773 && local783 >= Static39.anInt538 && Static39.anInt538 + 8 > local783) {
																local6206.method8379();
																if (local773 >= 0 && local783 >= 0 && local773 < Static428.anInt8046 && Static119.anInt2717 > local783) {
																	Static270.method4609(local773, local783, Static102.anInt6216);
																}
															}
														}
														for (@Pc(6308) Class4_Sub51 local6308 = (Class4_Sub51) Static377.aClass244_51.method5963(); local6308 != null; local6308 = (Class4_Sub51) Static377.aClass244_51.method5965()) {
															if (Static570.anInt9983 <= local6308.anInt10248 && local6308.anInt10248 < Static570.anInt9983 + 8 && local6308.anInt10261 >= Static39.anInt538 && Static39.anInt538 + 8 > local6308.anInt10261 && local6308.anInt10249 == Static102.anInt6216) {
																local6308.anInt10257 = 0;
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static424.aClass362_175) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4923();
														if (local230 == 65535) {
															local230 = -1;
														}
														local73 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4923();
														local773 = Static319.aClass4_Sub11_Sub1_2.method4955();
														if (local773 == 65535) {
															local773 = -1;
														}
														local777 = Static319.aClass4_Sub11_Sub1_2.method4927();
														if (Static485.method7230(local477)) {
															for (local783 = local773; local783 <= local230; local783++) {
																local4943 = (long) local783 + ((long) local777 << 32);
																local4951 = (Class4_Sub2) Static307.aClass350_24.method8207(local4943);
																if (local4951 != null) {
																	local4962 = new Class4_Sub2(local4951.anInt156, local73);
																	local4951.method8379();
																} else if (local783 == -1) {
																	local4962 = new Class4_Sub2(Static490.method7272(local777).aClass4_Sub2_2.anInt156, local73);
																} else {
																	local4962 = new Class4_Sub2(0, local73);
																}
																Static307.aClass350_24.method8199(local4943, local4962);
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static71.aClass362_39 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4955();
														local2169 = (local230 & 0x1) == 1;
														Static142.method2737(local2169, local73);
														Static453.anIntArray466[Static552.anInt9807++ & 0x1F] = local73;
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static236.aClass362_96) {
														local286 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
														local290 = Static319.aClass4_Sub11_Sub1_2.method4920();
														local292 = local290;
														if (local286) {
															local292 = Static319.aClass4_Sub11_Sub1_2.method4920();
														}
														local303 = Static319.aClass4_Sub11_Sub1_2.method4936();
														local310 = Static319.aClass4_Sub11_Sub1_2.method4934();
														local314 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local1479 = Static319.aClass4_Sub11_Sub1_2.method4936();
														@Pc(6560) long local6560 = local310 + (local303 << 32);
														@Pc(6562) boolean local6562 = false;
														local1669 = 0;
														while (true) {
															if (local1669 >= 100) {
																if (local314 <= 1 && Static511.method7464(local292)) {
																	local6562 = true;
																}
																break;
															}
															if (Static446.aLongArray15[local1669] == local6560) {
																local6562 = true;
																break;
															}
															local1669++;
														}
														if (!local6562 && Static24.anInt386 == 0) {
															Static446.aLongArray15[Static384.anInt7374] = local6560;
															Static384.anInt7374 = (Static384.anInt7374 + 1) % 100;
															@Pc(6620) String local6620 = Static190.aClass295_1.method7021(local1479).method3765(Static319.aClass4_Sub11_Sub1_2);
															if (local314 == 2) {
																Static502.method7386("<img=1>" + local290, 0, null, "<img=1>" + local292, 18, local1479, local6620, local290);
															} else if (local314 == 1) {
																Static502.method7386("<img=0>" + local290, 0, null, "<img=0>" + local292, 18, local1479, local6620, local290);
															} else {
																Static502.method7386(local290, 0, null, local292, 18, local1479, local6620, local290);
															}
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static335.aClass362_144) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4905();
														local73 = local230 >> 5;
														local477 = local230 & 0x1F;
														if (local477 == 0) {
															Static532.aClass366Array1[local73] = null;
															Static257.aClass362_105 = null;
															return true;
														}
														@Pc(6721) Class366 local6721 = new Class366();
														local6721.anInt10235 = local477;
														local6721.anInt10237 = Static319.aClass4_Sub11_Sub1_2.method4905();
														if (local6721.anInt10237 >= 0 && Static273.aClass78Array16.length > local6721.anInt10237) {
															if (local6721.anInt10235 == 1 || local6721.anInt10235 == 10) {
																local6721.anInt10240 = Static319.aClass4_Sub11_Sub1_2.method4936();
																Static319.aClass4_Sub11_Sub1_2.anInt5831 += 6;
															} else if (local6721.anInt10235 >= 2 && local6721.anInt10235 <= 6) {
																if (local6721.anInt10235 == 2) {
																	local6721.anInt10231 = 256;
																	local6721.anInt10233 = 256;
																}
																if (local6721.anInt10235 == 3) {
																	local6721.anInt10233 = 256;
																	local6721.anInt10231 = 0;
																}
																if (local6721.anInt10235 == 4) {
																	local6721.anInt10231 = 512;
																	local6721.anInt10233 = 256;
																}
																if (local6721.anInt10235 == 5) {
																	local6721.anInt10233 = 0;
																	local6721.anInt10231 = 256;
																}
																if (local6721.anInt10235 == 6) {
																	local6721.anInt10233 = 512;
																	local6721.anInt10231 = 256;
																}
																local6721.anInt10235 = 2;
																local6721.anInt10239 = Static319.aClass4_Sub11_Sub1_2.method4905();
																local6721.anInt10231 += Static319.aClass4_Sub11_Sub1_2.method4936() - Static552.anInt9805 << 9;
																local6721.anInt10233 += Static319.aClass4_Sub11_Sub1_2.method4936() - Static254.anInt4667 << 9;
																local6721.anInt10234 = Static319.aClass4_Sub11_Sub1_2.method4905() << 2;
																local6721.anInt10236 = Static319.aClass4_Sub11_Sub1_2.method4936();
															}
															local6721.anInt10238 = Static319.aClass4_Sub11_Sub1_2.method4936();
															if (local6721.anInt10238 == 65535) {
																local6721.anInt10238 = -1;
															}
															Static532.aClass366Array1[local73] = local6721;
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static34.aClass362_25) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4955();
														if (local230 == 65535) {
															local230 = -1;
														}
														local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4899();
														if (Static485.method7230(local73)) {
															Static173.method3149(local477, 1, local230, -1);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static122.aClass362_64 == Static257.aClass362_105) {
														Static300.anInt6063 = Static319.aClass4_Sub11_Sub1_2.method4895();
														Static263.aBoolean365 = Static319.aClass4_Sub11_Sub1_2.method4905() == 1;
														Static257.aClass362_105 = null;
														return true;
													} else if (Static446.aClass362_186 == Static257.aClass362_105) {
														if (Static332.anInt6370 != -1) {
															Static228.method3612(0, Static332.anInt6370);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static257.aClass362_105 == Static521.aClass362_203) {
														Static446.method6892(Static364.aClass162_19);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static297.aClass362_127 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4931();
														Static66.aClass234_1 = Static406.aClass354_5.method8223(local230);
														Static257.aClass362_105 = null;
														return true;
													} else if (Static234.aClass362_95 == Static257.aClass362_105) {
														local230 = Static319.aClass4_Sub11_Sub1_2.method4950();
														local73 = Static319.aClass4_Sub11_Sub1_2.method4950();
														local477 = Static319.aClass4_Sub11_Sub1_2.method4927();
														if (Static485.method7230(local73)) {
															Static200.method3418(local230, local477);
														}
														Static257.aClass362_105 = null;
														return true;
													} else if (Static65.aClass362_35 == Static257.aClass362_105) {
														Static195.method3373();
														Static257.aClass362_105 = null;
														return false;
													} else {
														Static205.method3450("T1 - " + (Static257.aClass362_105 == null ? -1 : Static257.aClass362_105.method8310()) + "," + (Static401.aClass362_169 == null ? -1 : Static401.aClass362_169.method8310()) + "," + (Static400.aClass362_168 == null ? -1 : Static400.aClass362_168.method8310()) + " - " + Static186.anInt3680, null);
														Static135.method2684(false);
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
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
	public static boolean method8380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public static void method8382() {
		if (Static579.anIntArray543 != null) {
			return;
		}
		Static579.anIntArray543 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(84) float local84 = (float) -local74 + local71;
				@Pc(90) float local90 = (1.0F - local52) * local61;
				@Pc(99) float local99 = (1.0F - local52 * local84) * local61;
				@Pc(110) float local110 = local61 * (1.0F - local52 * (1.0F - local84));
				if (local78 == 0) {
					local67 = local90;
					local65 = local110;
					local63 = local61;
				} else if (local78 == 1) {
					local65 = local61;
					local67 = local90;
					local63 = local99;
				} else if (local78 == 2) {
					local65 = local61;
					local63 = local90;
					local67 = local110;
				} else if (local78 == 3) {
					local67 = local61;
					local63 = local90;
					local65 = local99;
				} else if (local78 == 4) {
					local63 = local110;
					local65 = local90;
					local67 = local61;
				} else if (local78 == 5) {
					local63 = local61;
					local67 = local99;
					local65 = local90;
				}
				local63 = (float) Math.pow((double) local63, local20);
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				@Pc(205) int local205 = (int) (local63 * 256.0F);
				@Pc(210) int local210 = (int) (local65 * 256.0F);
				@Pc(215) int local215 = (int) (local67 * 256.0F);
				@Pc(229) int local229 = (local205 << 16) + (local210 << 8) + local215 - 16777216;
				Static579.anIntArray543[local22++] = local229;
			}
		}
	}
}
