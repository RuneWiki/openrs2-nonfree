import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bia", name = "A", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_147 = new Class73(18, 3);

	@OriginalMember(owner = "client!bia", name = "E", descriptor = "[Lclient!jea;")
	public static final Class6_Sub5_Sub18[] aClass6_Sub5_Sub18Array4 = new Class6_Sub5_Sub18[14];

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "(I)Z")
	public static boolean method6921() throws IOException {
		if (Static226.aClass41_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static165.aClass73_55 == null) {
			if (Static486.aBoolean831) {
				if (!Static226.aClass41_1.method1729(1)) {
					return false;
				}
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
				Static85.anInt2620 = 0;
				Static186.anInt4076++;
				Static486.aBoolean831 = false;
			}
			Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
			if (Static84.aClass6_Sub8_Sub1_1.method1515()) {
				if (!Static226.aClass41_1.method1729(1)) {
					return false;
				}
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 1, 1);
				Static186.anInt4076++;
				Static85.anInt2620 = 0;
			}
			Static486.aBoolean831 = true;
			@Pc(69) Class73[] local69 = Static543.method7665();
			local73 = Static84.aClass6_Sub8_Sub1_1.method1510();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static84.aClass6_Sub8_Sub1_1.anInt10061);
			}
			Static165.aClass73_55 = local69[local73];
			Static125.anInt3103 = Static165.aClass73_55.anInt2981;
		}
		if (Static125.anInt3103 == -1) {
			if (!Static226.aClass41_1.method1729(1)) {
				return false;
			}
			Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
			Static85.anInt2620 = 0;
			Static125.anInt3103 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
			Static186.anInt4076++;
		}
		if (Static125.anInt3103 == -2) {
			if (!Static226.aClass41_1.method1729(2)) {
				return false;
			}
			Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 2);
			Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
			Static125.anInt3103 = Static84.aClass6_Sub8_Sub1_1.method8220();
			Static186.anInt4076 += 2;
			Static85.anInt2620 = 0;
		}
		if (Static125.anInt3103 > 0) {
			if (!Static226.aClass41_1.method1729(Static125.anInt3103)) {
				return false;
			}
			Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
			Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, Static125.anInt3103);
			Static85.anInt2620 = 0;
			Static186.anInt4076 += Static125.anInt3103;
		}
		Static340.aClass73_118 = Static461.aClass73_148;
		Static461.aClass73_148 = Static321.aClass73_107;
		Static321.aClass73_107 = Static165.aClass73_55;
		if (Static165.aClass73_55 == Static146.aClass73_134) {
			Static165.aClass73_55 = null;
			return false;
		}
		@Pc(223) int local223;
		if (Static118.aClass73_41 == Static165.aClass73_55) {
			local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
			local73 = Static84.aClass6_Sub8_Sub1_1.method8220();
			Static140.aClass157_1.method4853(local223, local73);
			Static165.aClass73_55 = null;
			return true;
		}
		@Pc(254) String local254;
		@Pc(248) boolean local248;
		@Pc(252) String local252;
		@Pc(264) int local264;
		@Pc(301) String local301;
		@Pc(266) boolean local266;
		if (Static366.aClass73_123 == Static165.aClass73_55) {
			local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
			local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
			local254 = local252;
			if (local248) {
				local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
			}
			local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
			local266 = false;
			if (local264 <= 1) {
				if (Static198.aBoolean342 && !Static561.aBoolean771 || Static334.aBoolean523) {
					local266 = true;
				} else if (local264 <= 1 && Static29.method769(local254)) {
					local266 = true;
				}
			}
			if (!local266 && Static47.anInt1657 == 0) {
				local301 = Static438.method6712(Static556.method7795(Static84.aClass6_Sub8_Sub1_1));
				if (local264 == 2) {
					Static264.method4755(local252, 24, "<img=1>" + local252, local301, -1, (String) null, 0, "<img=1>" + local254);
				} else if (local264 == 1) {
					Static264.method4755(local252, 24, "<img=0>" + local252, local301, -1, (String) null, 0, "<img=0>" + local254);
				} else {
					Static264.method4755(local252, 24, local252, local301, -1, (String) null, 0, local254);
				}
			}
			Static165.aClass73_55 = null;
			return true;
		} else if (Static177.aClass73_160 == Static165.aClass73_55) {
			local223 = Static84.aClass6_Sub8_Sub1_1.method8236();
			local73 = Static84.aClass6_Sub8_Sub1_1.method8220();
			Static277.method4915();
			Static238.method4325(local73, local223);
			Static165.aClass73_55 = null;
			return true;
		} else {
			@Pc(417) int local417;
			if (Static165.aClass73_55 == Static356.aClass73_121) {
				local223 = Static84.aClass6_Sub8_Sub1_1.method8237();
				if (local223 == 65535) {
					local223 = -1;
				}
				local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
				local417 = Static84.aClass6_Sub8_Sub1_1.method8226();
				Static277.method4915();
				Static594.method8190(local417, local73, local223);
				@Pc(432) Class306 local432 = Static356.aClass221_1.method5923(local223);
				Static604.method8338(local432.anInt9082, local417, local432.anInt9031, local432.anInt9093);
				Static558.method7839(local417, local432.anInt9052, local432.anInt9062, local432.anInt9057);
				Static165.aClass73_55 = null;
				return true;
			} else if (Static165.aClass73_55 == Static77.aClass73_100) {
				Static277.method4915();
				Static603.method8326();
				Static165.aClass73_55 = null;
				return true;
			} else if (aClass73_147 == Static165.aClass73_55) {
				local223 = Static84.aClass6_Sub8_Sub1_1.method8229();
				local73 = Static84.aClass6_Sub8_Sub1_1.method8253();
				Static277.method4915();
				Static472.method7022(local73, true, local223);
				Static165.aClass73_55 = null;
				return true;
			} else if (Static165.aClass73_55 == Static375.aClass73_127) {
				Static380.method6022(Static429.aClass101_15);
				Static165.aClass73_55 = null;
				return true;
			} else {
				@Pc(528) Class6_Sub25 local528;
				if (Static165.aClass73_55 == Static556.aClass73_165) {
					local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
					local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
					local417 = Static84.aClass6_Sub8_Sub1_1.method8243();
					Static277.method4915();
					local528 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local223);
					if (local528 != null) {
						Static360.method5823(false, local528, local73 != local528.anInt5034);
					}
					Static558.method7841(false, local73, local223, local417);
					Static165.aClass73_55 = null;
					return true;
				} else if (Static165.aClass73_55 == Static406.aClass73_136) {
					local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
					local73 = Static84.aClass6_Sub8_Sub1_1.method8226();
					Static277.method4915();
					Static400.method6274(local73, local223);
					Static165.aClass73_55 = null;
					return true;
				} else if (Static165.aClass73_55 == Static603.aClass73_181) {
					Static178.anInt10783 = Static84.aClass6_Sub8_Sub1_1.method8253();
					Static467.anInt8313 = Static84.aClass6_Sub8_Sub1_1.method8247();
					Static165.aClass73_55 = null;
					return true;
				} else {
					@Pc(596) String local596;
					if (Static521.aClass73_172 == Static165.aClass73_55) {
						local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
						local73 = Static84.aClass6_Sub8_Sub1_1.method8220();
						local254 = Static105.aClass291_1.method7162(local73).method3484(Static84.aClass6_Sub8_Sub1_1);
						Static264.method4755(local596, 19, local596, local254, local73, (String) null, 0, local596);
						Static165.aClass73_55 = null;
						return true;
					} else if (Static525.aClass73_157 == Static165.aClass73_55) {
						Static380.method6022(Static10.aClass101_4);
						Static165.aClass73_55 = null;
						return true;
					} else if (Static209.aClass73_65 == Static165.aClass73_55) {
						Static380.method6022(Static257.aClass101_12);
						Static165.aClass73_55 = null;
						return true;
					} else if (Static168.aClass73_58 == Static165.aClass73_55) {
						Static404.method3627(Static496.aClass104_4, Static84.aClass6_Sub8_Sub1_1, Static125.anInt3103);
						Static165.aClass73_55 = null;
						return true;
					} else if (Static606.aClass73_183 == Static165.aClass73_55) {
						local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
						local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
						Static277.method4915();
						Static167.method3176(local252, local223);
						Static165.aClass73_55 = null;
						return true;
					} else if (Static165.aClass73_55 == Static383.aClass73_132) {
						Static276.method8007(Static84.aClass6_Sub8_Sub1_1.method8221());
						Static165.aClass73_55 = null;
						return true;
					} else if (Static595.aClass73_176 == Static165.aClass73_55) {
						local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
						local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
						Static277.method4915();
						@Pc(713) Class6_Sub25 local713 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local73);
						local528 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local223);
						if (local528 != null) {
							Static360.method5823(false, local528, local713 == null || local713.anInt5034 != local528.anInt5034);
						}
						if (local713 != null) {
							local713.method8792();
							Static214.aClass380_15.method8753(local713, (long) local223);
						}
						@Pc(755) Class302 local755 = Static299.method5103(local73);
						if (local755 != null) {
							Static580.method8049(local755);
						}
						local755 = Static299.method5103(local223);
						if (local755 != null) {
							Static580.method8049(local755);
							Static123.method2614(local755, true);
						}
						if (Static30.anInt830 != -1) {
							Static375.method5973(1, Static30.anInt830);
						}
						Static165.aClass73_55 = null;
						return true;
					} else if (Static241.aClass73_82 == Static165.aClass73_55) {
						local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
						@Pc(803) byte[] local803 = new byte[Static125.anInt3103 - 1];
						Static84.aClass6_Sub8_Sub1_1.method8207(local803, Static125.anInt3103 - 1, 0);
						Static178.method8793(local803, local248);
						Static165.aClass73_55 = null;
						return true;
					} else {
						@Pc(849) int local849;
						@Pc(853) boolean local853;
						@Pc(870) int local870;
						@Pc(1137) String local1137;
						@Pc(1101) String local1101;
						if (Static412.aClass73_137 == Static165.aClass73_55) {
							@Pc(887) boolean local887;
							while (Static84.aClass6_Sub8_Sub1_1.anInt10061 < Static125.anInt3103) {
								local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
								local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
								local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
								local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
								local849 = Static84.aClass6_Sub8_Sub1_1.method8246();
								local301 = "";
								local853 = false;
								if (local264 > 0) {
									local301 = Static84.aClass6_Sub8_Sub1_1.method8221();
									local853 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
								}
								for (local870 = 0; local870 < Static544.anInt9412; local870++) {
									if (local248) {
										if (local254.equals(Static277.aStringArray16[local870])) {
											Static277.aStringArray16[local870] = local252;
											local252 = null;
											Static545.aStringArray34[local870] = local254;
											break;
										}
									} else if (local252.equals(Static277.aStringArray16[local870])) {
										if (local264 != Static284.anIntArray265[local870]) {
											local887 = true;
											for (@Pc(892) Class9_Sub1_Sub2 local892 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6092(); local892 != null; local892 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6098()) {
												if (local892.aString50.equals(local252)) {
													if (local264 != 0 && local892.aShort48 == 0) {
														local887 = false;
														local892.method8408();
													} else if (local264 == 0 && local892.aShort48 != 0) {
														local887 = false;
														local892.method8408();
													}
												}
											}
											if (local887) {
												Static220.aClass234_13.method6097(new Class9_Sub1_Sub2(local252, local264));
											}
											Static284.anIntArray265[local870] = local264;
										}
										Static545.aStringArray34[local870] = local254;
										Static304.aStringArray18[local870] = local301;
										Static130.anIntArray538[local870] = local849;
										local252 = null;
										Static366.aBooleanArray17[local870] = local853;
										break;
									}
								}
								if (local252 != null && Static544.anInt9412 < 200) {
									Static277.aStringArray16[Static544.anInt9412] = local252;
									Static545.aStringArray34[Static544.anInt9412] = local254;
									Static284.anIntArray265[Static544.anInt9412] = local264;
									Static304.aStringArray18[Static544.anInt9412] = local301;
									Static130.anIntArray538[Static544.anInt9412] = local849;
									Static366.aBooleanArray17[Static544.anInt9412] = local853;
									Static544.anInt9412++;
								}
							}
							Static617.anInt10423 = Static51.anInt1750;
							Static310.anInt1851 = 2;
							local73 = Static544.anInt9412;
							while (local73 > 0) {
								local248 = true;
								local73--;
								for (local417 = 0; local417 < local73; local417++) {
									if (Static284.anIntArray265[local417] != Static184.aClass358_1.anInt10266 && Static284.anIntArray265[local417 + 1] == Static184.aClass358_1.anInt10266 || Static284.anIntArray265[local417] == 0 && Static284.anIntArray265[local417 + 1] != 0) {
										local264 = Static284.anIntArray265[local417];
										Static284.anIntArray265[local417] = Static284.anIntArray265[local417 + 1];
										Static284.anIntArray265[local417 + 1] = local264;
										local1101 = Static304.aStringArray18[local417];
										Static304.aStringArray18[local417] = Static304.aStringArray18[local417 + 1];
										Static304.aStringArray18[local417 + 1] = local1101;
										local301 = Static277.aStringArray16[local417];
										Static277.aStringArray16[local417] = Static277.aStringArray16[local417 + 1];
										Static277.aStringArray16[local417 + 1] = local301;
										local1137 = Static545.aStringArray34[local417];
										Static545.aStringArray34[local417] = Static545.aStringArray34[local417 + 1];
										Static545.aStringArray34[local417 + 1] = local1137;
										local870 = Static130.anIntArray538[local417];
										Static130.anIntArray538[local417] = Static130.anIntArray538[local417 + 1];
										Static130.anIntArray538[local417 + 1] = local870;
										local887 = Static366.aBooleanArray17[local417];
										Static366.aBooleanArray17[local417] = Static366.aBooleanArray17[local417 + 1];
										local248 = false;
										Static366.aBooleanArray17[local417 + 1] = local887;
									}
								}
								if (local248) {
									break;
								}
							}
							Static165.aClass73_55 = null;
							return true;
						} else if (Static351.aClass73_120 == Static165.aClass73_55) {
							local223 = Static84.aClass6_Sub8_Sub1_1.method8237();
							local73 = Static84.aClass6_Sub8_Sub1_1.method8253();
							local417 = Static84.aClass6_Sub8_Sub1_1.method8247();
							local264 = Static84.aClass6_Sub8_Sub1_1.method8247();
							local849 = Static84.aClass6_Sub8_Sub1_1.method8243();
							Static277.method4915();
							Static388.aBooleanArray18[local849] = true;
							Static366.anIntArray334[local849] = local73;
							Static203.anIntArray199[local849] = local264;
							Static367.anIntArray496[local849] = local417;
							Static382.anIntArray344[local849] = local223;
							Static165.aClass73_55 = null;
							return true;
						} else if (Static547.aClass73_3 == Static165.aClass73_55) {
							Static627.anInt10534 = Static84.aClass6_Sub8_Sub1_1.method8246();
							Static165.aClass73_55 = null;
							Static440.anInt7977 = Static51.anInt1750;
							return true;
						} else if (Static165.aClass73_55 == Static371.aClass73_126) {
							Static458.method6904();
							Static165.aClass73_55 = null;
							return false;
						} else if (Static165.aClass73_55 == Static458.aClass73_146) {
							Static380.method6022(Static531.aClass101_16);
							Static165.aClass73_55 = null;
							return true;
						} else if (Static165.aClass73_55 == Static80.aClass73_29) {
							Static84.aClass6_Sub8_Sub1_1.anInt10061 += 28;
							if (Static84.aClass6_Sub8_Sub1_1.method8227()) {
								Static296.method5062(Static84.aClass6_Sub8_Sub1_1.anInt10061 - 28, Static84.aClass6_Sub8_Sub1_1);
							}
							Static165.aClass73_55 = null;
							return true;
						} else if (Static165.aClass73_55 == Static146.aClass73_135) {
							local223 = Static84.aClass6_Sub8_Sub1_1.method8236();
							Static277.method4915();
							if (local223 == -1) {
								Static594.anInt10048 = -1;
								Static214.anInt4587 = -1;
							} else {
								local73 = local223 >> 14 & 0x3FFF;
								local417 = local223 & 0x3FFF;
								local73 -= Static477.anInt8412;
								local417 -= Static227.anInt5049;
								if (local73 < 0) {
									local73 = 0;
								} else if (Static306.anInt6176 <= local73) {
									local73 = Static306.anInt6176;
								}
								Static214.anInt4587 = (local73 << 9) + 256;
								if (local417 < 0) {
									local417 = 0;
								} else if (Static108.anInt2930 <= local417) {
									local417 = Static108.anInt2930;
								}
								Static594.anInt10048 = (local417 << 9) + 256;
							}
							Static165.aClass73_55 = null;
							return true;
						} else if (Static165.aClass73_55 == Static545.aClass73_162) {
							local223 = Static84.aClass6_Sub8_Sub1_1.method8253();
							local73 = Static84.aClass6_Sub8_Sub1_1.method8247();
							local417 = Static84.aClass6_Sub8_Sub1_1.method8246();
							local264 = Static84.aClass6_Sub8_Sub1_1.method8243();
							local849 = Static84.aClass6_Sub8_Sub1_1.method8245() << 2;
							Static277.method4915();
							Static216.method7126(local264, local73, local849, local223, local417);
							Static165.aClass73_55 = null;
							return true;
						} else if (Static610.aClass73_184 == Static165.aClass73_55) {
							Static380.method6022(Static151.aClass101_10);
							Static165.aClass73_55 = null;
							return true;
						} else {
							@Pc(1511) int local1511;
							@Pc(1526) int local1526;
							@Pc(1950) boolean local1950;
							@Pc(1552) int local1552;
							@Pc(1726) int local1726;
							@Pc(1490) int local1490;
							@Pc(1486) boolean local1486;
							@Pc(1519) int local1519;
							@Pc(1636) boolean local1636;
							@Pc(1546) int local1546;
							@Pc(1554) int local1554;
							if (Static338.aClass73_116 == Static165.aClass73_55) {
								local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
								local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
								local417 = Static84.aClass6_Sub8_Sub1_1.method8237();
								local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
								local849 = Static84.aClass6_Sub8_Sub1_1.method8243();
								local1486 = (local849 & 0x80) != 0;
								local1490 = local849 & 0x7;
								local870 = local849 >> 3 & 0xF;
								if (local870 == 15) {
									local870 = -1;
								}
								if (local223 >> 30 == 0) {
									@Pc(1689) Class113 local1689;
									@Pc(1683) Class113 local1683;
									@Pc(1668) Class124 local1668;
									if (local223 >> 29 != 0) {
										local1511 = local223 & 0xFFFF;
										@Pc(1938) Class6_Sub42 local1938 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local1511);
										if (local1938 != null) {
											@Pc(1943) Class9_Sub4_Sub2_Sub1_Sub1 local1943 = local1938.aClass9_Sub4_Sub2_Sub1_Sub1_1;
											if (local264 == 65535) {
												local264 = -1;
											}
											local1950 = true;
											local1552 = local1486 ? local1943.anInt4294 : local1943.anInt4306;
											if (local264 != -1 && local1552 != -1) {
												if (local264 == local1552) {
													local1668 = Static360.aClass312_2.method7492(local264);
													if (local1668.aBoolean336 && local1668.anInt4155 != -1) {
														local1683 = Static528.aClass198_2.method5706(local1668.anInt4155);
														@Pc(1997) int local1997 = local1683.anInt3849;
														if (local1997 == 0 || local1997 == 2) {
															local1950 = false;
														} else if (local1997 == 1) {
															local1950 = true;
														}
													}
												} else {
													local1668 = Static360.aClass312_2.method7492(local264);
													@Pc(2023) Class124 local2023 = Static360.aClass312_2.method7492(local1552);
													if (local1668.anInt4155 != -1 && local2023.anInt4155 != -1) {
														local1689 = Static528.aClass198_2.method5706(local1668.anInt4155);
														@Pc(2045) Class113 local2045 = Static528.aClass198_2.method5706(local2023.anInt4155);
														if (local2045.anInt3857 > local1689.anInt3857) {
															local1950 = false;
														}
													}
												}
											}
											if (local1950) {
												if (local1486) {
													local1943.anInt4352 = local417 + Static384.anInt7234;
													local1943.anInt4279 = local870;
													local1943.anInt4353 = 0;
													local1943.anInt4288 = local1490;
													local1943.anInt4294 = local264;
													local1943.anInt4356 = 0;
													local1943.anInt4350 = 1;
													local1943.anInt4292 = local73;
													if (Static384.anInt7234 < local1943.anInt4352) {
														local1943.anInt4356 = -1;
													}
													if (local1943.anInt4294 != -1 && Static384.anInt7234 == local1943.anInt4352) {
														local1554 = Static360.aClass312_2.method7492(local1943.anInt4294).anInt4155;
														if (local1554 != -1) {
															local1683 = Static528.aClass198_2.method5706(local1554);
															if (local1683 != null && local1683.anIntArray178 != null && !local1943.aBoolean350) {
																Static598.method8288(local1943, 0, local1683);
															}
														}
													}
												} else {
													local1943.anInt4296 = 1;
													local1943.anInt4314 = local1490;
													local1943.anInt4301 = 0;
													local1943.anInt4323 = 0;
													local1943.anInt4306 = local264;
													local1943.anInt4337 = local870;
													local1943.anInt4317 = Static384.anInt7234 + local417;
													local1943.anInt4310 = local73;
													if (local1943.anInt4317 > Static384.anInt7234) {
														local1943.anInt4301 = -1;
													}
													if (local1943.anInt4306 != -1 && local1943.anInt4317 == Static384.anInt7234) {
														local1554 = Static360.aClass312_2.method7492(local1943.anInt4306).anInt4155;
														if (local1554 != -1) {
															local1683 = Static528.aClass198_2.method5706(local1554);
															if (local1683 != null && local1683.anIntArray178 != null && !local1943.aBoolean350) {
																Static598.method8288(local1943, 0, local1683);
															}
														}
													}
												}
											}
										}
									} else if (local223 >> 28 != 0) {
										local1511 = local223 & 0xFFFF;
										@Pc(1621) Class9_Sub4_Sub2_Sub1_Sub2 local1621;
										if (local1511 == Static238.anInt5268) {
											local1621 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1;
										} else {
											local1621 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local1511];
										}
										if (local1621 != null) {
											if (local264 == 65535) {
												local264 = -1;
											}
											local1636 = true;
											local1546 = local1486 ? local1621.anInt4294 : local1621.anInt4306;
											@Pc(1723) Class113 local1723;
											if (local264 != -1 && local1546 != -1) {
												@Pc(1663) Class124 local1663;
												if (local264 == local1546) {
													local1663 = Static360.aClass312_2.method7492(local264);
													if (local1663.aBoolean336 && local1663.anInt4155 != -1) {
														local1723 = Static528.aClass198_2.method5706(local1663.anInt4155);
														local1726 = local1723.anInt3849;
														if (local1726 == 0 || local1726 == 2) {
															local1636 = false;
														} else if (local1726 == 1) {
															local1636 = true;
														}
													}
												} else {
													local1663 = Static360.aClass312_2.method7492(local264);
													local1668 = Static360.aClass312_2.method7492(local1546);
													if (local1663.anInt4155 != -1 && local1668.anInt4155 != -1) {
														local1683 = Static528.aClass198_2.method5706(local1663.anInt4155);
														local1689 = Static528.aClass198_2.method5706(local1668.anInt4155);
														if (local1683.anInt3857 < local1689.anInt3857) {
															local1636 = false;
														}
													}
												}
											}
											if (local1636) {
												if (local1486) {
													local1621.anInt4353 = 0;
													local1621.anInt4352 = local417 + Static384.anInt7234;
													local1621.anInt4279 = local870;
													local1621.anInt4294 = local264;
													local1621.anInt4288 = local1490;
													local1621.anInt4356 = 0;
													local1621.anInt4292 = local73;
													local1621.anInt4350 = 1;
													if (Static384.anInt7234 < local1621.anInt4352) {
														local1621.anInt4356 = -1;
													}
													if (local1621.anInt4294 == 65535) {
														local1621.anInt4294 = -1;
													}
													if (local1621.anInt4294 != -1 && local1621.anInt4352 == Static384.anInt7234) {
														local1552 = Static360.aClass312_2.method7492(local1621.anInt4294).anInt4155;
														if (local1552 != -1) {
															local1723 = Static528.aClass198_2.method5706(local1552);
															if (local1723 != null && local1723.anIntArray178 != null && !local1621.aBoolean350) {
																Static598.method8288(local1621, 0, local1723);
															}
														}
													}
												} else {
													local1621.anInt4301 = 0;
													local1621.anInt4323 = 0;
													local1621.anInt4296 = 1;
													local1621.anInt4337 = local870;
													local1621.anInt4306 = local264;
													local1621.anInt4310 = local73;
													local1621.anInt4314 = local1490;
													local1621.anInt4317 = local417 + Static384.anInt7234;
													if (local1621.anInt4317 > Static384.anInt7234) {
														local1621.anInt4301 = -1;
													}
													if (local1621.anInt4306 == 65535) {
														local1621.anInt4306 = -1;
													}
													if (local1621.anInt4306 != -1 && local1621.anInt4317 == Static384.anInt7234) {
														local1552 = Static360.aClass312_2.method7492(local1621.anInt4306).anInt4155;
														if (local1552 != -1) {
															local1723 = Static528.aClass198_2.method5706(local1552);
															if (local1723 != null && local1723.anIntArray178 != null && !local1621.aBoolean350) {
																Static598.method8288(local1621, 0, local1723);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local1511 = local223 >> 28 & 0x3;
									local1519 = (local223 >> 14 & 0x3FFF) - Static477.anInt8412;
									local1526 = (local223 & 0x3FFF) - Static227.anInt5049;
									if (local1519 >= 0 && local1526 >= 0 && Static306.anInt6176 > local1519 && Static108.anInt2930 > local1526) {
										local1546 = local1519 * 512 + 256;
										local1552 = local1526 * 512 + 256;
										local1554 = local1511;
										if (local1511 < 3 && Static3.method52(local1526, local1519)) {
											local1554 = local1511 + 1;
										}
										@Pc(1589) Class9_Sub4_Sub2_Sub3 local1589 = new Class9_Sub4_Sub2_Sub3(local264, local417, Static384.anInt7234, local1511, local1554, local1546, Static150.method2982(local1511, local1552, local1546) - local73, local1552, local1519, local1519, local1526, local1526, local1490);
										Static158.aClass163_20.method4967(new Class6_Sub5_Sub4(local1589));
									}
								}
								Static165.aClass73_55 = null;
								return true;
							} else if (Static165.aClass73_55 == Static139.aClass73_47) {
								Static159.aClass354_1 = Static132.method2690(Static84.aClass6_Sub8_Sub1_1.method8246());
								Static165.aClass73_55 = null;
								return true;
							} else if (Static109.aClass73_39 == Static165.aClass73_55) {
								Static380.method6022(Static72.aClass101_5);
								Static165.aClass73_55 = null;
								return true;
							} else {
								@Pc(2250) String local2250;
								if (Static165.aClass73_55 == Static287.aClass73_97) {
									local223 = Static84.aClass6_Sub8_Sub1_1.method8214();
									local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
									local417 = Static84.aClass6_Sub8_Sub1_1.method8246();
									local2250 = "";
									local1101 = local2250;
									if ((local417 & 0x1) != 0) {
										local2250 = Static84.aClass6_Sub8_Sub1_1.method8221();
										if ((local417 & 0x2) == 0) {
											local1101 = local2250;
										} else {
											local1101 = Static84.aClass6_Sub8_Sub1_1.method8221();
										}
									}
									local301 = Static84.aClass6_Sub8_Sub1_1.method8221();
									if (local223 == 99) {
										Static552.method7749(local301);
									} else if (local1101.equals("") || !Static29.method769(local1101)) {
										Static548.method7725(local223, local301, local73, local1101, local2250, local2250);
									} else {
										Static165.aClass73_55 = null;
										return true;
									}
									Static165.aClass73_55 = null;
									return true;
								} else if (Static597.aClass73_178 == Static165.aClass73_55) {
									Static380.method6022(Static270.aClass101_13);
									Static165.aClass73_55 = null;
									return true;
								} else {
									@Pc(2377) Class162 local2377;
									@Pc(2342) boolean local2342;
									if (Static165.aClass73_55 == Static234.aClass73_74) {
										local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
										local2342 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
										if (local2342) {
											local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
										} else {
											local252 = local596;
										}
										local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
										@Pc(2360) byte local2360 = Static84.aClass6_Sub8_Sub1_1.method8208();
										local1486 = false;
										if (local2360 == -128) {
											local1486 = true;
										}
										if (local1486) {
											if (Static67.anInt2305 == 0) {
												Static165.aClass73_55 = null;
												return true;
											}
											for (local1490 = 0; local1490 < Static67.anInt2305 && (!Static638.aClass162Array1[local1490].aString63.equals(local252) || Static638.aClass162Array1[local1490].anInt5950 != local264); local1490++) {
											}
											if (Static67.anInt2305 > local1490) {
												while (local1490 < Static67.anInt2305 - 1) {
													Static638.aClass162Array1[local1490] = Static638.aClass162Array1[local1490 + 1];
													local1490++;
												}
												Static67.anInt2305--;
												Static638.aClass162Array1[Static67.anInt2305] = null;
											}
										} else {
											local1137 = Static84.aClass6_Sub8_Sub1_1.method8221();
											local2377 = new Class162();
											local2377.aString65 = local596;
											local2377.aString63 = local252;
											local2377.aString62 = Static604.method8337(local2377.aString63);
											local2377.aByte68 = local2360;
											local2377.anInt5950 = local264;
											local2377.aString64 = local1137;
											for (local1511 = Static67.anInt2305 - 1; local1511 >= 0; local1511--) {
												local1519 = Static638.aClass162Array1[local1511].aString62.compareTo(local2377.aString62);
												if (local1519 == 0) {
													Static638.aClass162Array1[local1511].anInt5950 = local264;
													Static638.aClass162Array1[local1511].aByte68 = local2360;
													Static638.aClass162Array1[local1511].aString64 = local1137;
													if (local252.equals(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46)) {
														Static204.aByte89 = local2360;
													}
													Static507.anInt8770 = Static51.anInt1750;
													Static165.aClass73_55 = null;
													return true;
												}
												if (local1519 < 0) {
													break;
												}
											}
											if (Static67.anInt2305 >= Static638.aClass162Array1.length) {
												Static165.aClass73_55 = null;
												return true;
											}
											for (local1519 = Static67.anInt2305 - 1; local1519 > local1511; local1519--) {
												Static638.aClass162Array1[local1519 + 1] = Static638.aClass162Array1[local1519];
											}
											if (Static67.anInt2305 == 0) {
												Static638.aClass162Array1 = new Class162[100];
											}
											Static638.aClass162Array1[local1511 + 1] = local2377;
											Static67.anInt2305++;
											if (local252.equals(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46)) {
												Static204.aByte89 = local2360;
											}
										}
										Static165.aClass73_55 = null;
										Static507.anInt8770 = Static51.anInt1750;
										return true;
									} else if (Static165.aClass73_55 == Static170.aClass73_59) {
										local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
										local73 = Static84.aClass6_Sub8_Sub1_1.method8243();
										Static277.method4915();
										Static358.method5811(local73, local223);
										Static165.aClass73_55 = null;
										return true;
									} else if (Static165.aClass73_55 == Static224.aClass73_69) {
										local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
										local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
										Static277.method4915();
										Static167.method3176(local596, local73);
										Static165.aClass73_55 = null;
										return true;
									} else if (Static28.aClass73_10 == Static165.aClass73_55) {
										local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
										if (local223 == 65535) {
											local223 = -1;
										}
										local73 = Static84.aClass6_Sub8_Sub1_1.method8246();
										local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
										local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
										Static141.method2795(local264, local73, local223, true, local417, 256);
										Static165.aClass73_55 = null;
										return true;
									} else if (Static165.aClass73_55 == Static588.aClass73_174) {
										local223 = Static84.aClass6_Sub8_Sub1_1.method8237();
										local73 = Static84.aClass6_Sub8_Sub1_1.method8266();
										Static277.method4915();
										Static127.method2642(local223, local73);
										Static165.aClass73_55 = null;
										return true;
									} else if (Static165.aClass73_55 == Static243.aClass73_68) {
										local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
										@Pc(2710) Class9_Sub4_Sub2_Sub1_Sub2 local2710;
										if (local223 == Static238.anInt5268) {
											local2710 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1;
										} else {
											local2710 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local223];
										}
										if (local2710 == null) {
											Static165.aClass73_55 = null;
											return true;
										}
										local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
										local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
										local266 = (local417 & 0x8000) != 0;
										if (local2710.aString46 != null && local2710.aClass320_1 != null) {
											local1486 = false;
											if (local264 <= 1) {
												if (!local266 && (Static198.aBoolean342 && !Static561.aBoolean771 || Static334.aBoolean523)) {
													local1486 = true;
												} else if (Static29.method769(local2710.aString46)) {
													local1486 = true;
												}
											}
											if (!local1486 && Static47.anInt1657 == 0) {
												local870 = -1;
												if (local266) {
													local417 &= 0x7FFF;
													@Pc(2795) Class308 local2795 = Static83.method6980(Static84.aClass6_Sub8_Sub1_1);
													local870 = local2795.anInt9126;
													local1137 = local2795.aClass6_Sub5_Sub14_1.method3484(Static84.aClass6_Sub8_Sub1_1);
												} else {
													local1137 = Static438.method6712(Static556.method7795(Static84.aClass6_Sub8_Sub1_1));
												}
												local2710.aString44 = local1137.trim();
												local2710.anInt4325 = local417 >> 8;
												local2710.anInt4329 = local417 & 0xFF;
												local2710.anInt4311 = 150;
												if (local264 == 1 || local264 == 2) {
													local1511 = local266 ? 17 : 1;
												} else {
													local1511 = local266 ? 17 : 2;
												}
												if (local264 == 2) {
													Static264.method4755(local2710.aString45, local1511, "<img=1>" + local2710.method3642(), local1137, local870, (String) null, 0, "<img=1>" + local2710.method3638());
												} else if (local264 == 1) {
													Static264.method4755(local2710.aString45, local1511, "<img=0>" + local2710.method3642(), local1137, local870, (String) null, 0, "<img=0>" + local2710.method3638());
												} else {
													Static264.method4755(local2710.aString45, local1511, local2710.method3642(), local1137, local870, (String) null, 0, local2710.method3638());
												}
											}
										}
										Static165.aClass73_55 = null;
										return true;
									} else if (Static557.aClass73_167 == Static165.aClass73_55) {
										local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
										if (local223 == 65535) {
											local223 = -1;
										}
										local73 = Static84.aClass6_Sub8_Sub1_1.method8266();
										Static277.method4915();
										Static184.method3443(local73, local223);
										Static165.aClass73_55 = null;
										return true;
									} else {
										@Pc(2980) byte local2980;
										if (Static165.aClass73_55 == Static337.aClass73_115) {
											local223 = Static84.aClass6_Sub8_Sub1_1.method8253();
											local2980 = Static84.aClass6_Sub8_Sub1_1.method8204();
											Static277.method4915();
											Static97.method2355(local2980, local223);
											Static165.aClass73_55 = null;
											return true;
										} else if (Static165.aClass73_55 == Static342.aClass73_119) {
											Static380.method6022(Static122.aClass101_8);
											Static165.aClass73_55 = null;
											return true;
										} else if (Static165.aClass73_55 == Static232.aClass73_80) {
											local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
											Static277.method4915();
											Static462.method6943(local223);
											Static165.aClass73_55 = null;
											return true;
										} else if (Static165.aClass73_55 == Static337.aClass73_114) {
											local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
											local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
											Static277.method4915();
											Static535.method7570(local73, local223);
											Static165.aClass73_55 = null;
											return true;
										} else if (Static577.aClass73_113 == Static165.aClass73_55) {
											@Pc(3049) int[] local3049 = new int[4];
											for (local73 = 0; local73 < 4; local73++) {
												local3049[local73] = Static84.aClass6_Sub8_Sub1_1.method8245();
											}
											local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
											local264 = Static84.aClass6_Sub8_Sub1_1.method8247();
											@Pc(3082) Class6_Sub42 local3082 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local417);
											if (local3082 != null) {
												Static486.method8549(local264, local3082.aClass9_Sub4_Sub2_Sub1_Sub1_1, local3049);
											}
											Static165.aClass73_55 = null;
											return true;
										} else if (Static183.aClass73_185 == Static165.aClass73_55) {
											local223 = Static84.aClass6_Sub8_Sub1_1.method8246();
											if (Static84.aClass6_Sub8_Sub1_1.method8246() == 0) {
												Static395.aClass118Array1[local223] = new Class118();
											} else {
												Static84.aClass6_Sub8_Sub1_1.anInt10061--;
												Static395.aClass118Array1[local223] = new Class118(Static84.aClass6_Sub8_Sub1_1);
											}
											Static165.aClass73_55 = null;
											Static221.anInt4989 = Static51.anInt1750;
											return true;
										} else {
											@Pc(3171) int local3171;
											if (Static165.aClass73_55 == Static30.aClass73_11) {
												local223 = Static84.aClass6_Sub8_Sub1_1.method8243();
												local73 = local223 >> 2;
												local417 = local223 & 0x3;
												local264 = Static379.anIntArray341[local73];
												local849 = Static84.aClass6_Sub8_Sub1_1.method8237();
												if (local849 == 65535) {
													local849 = -1;
												}
												local3171 = Static84.aClass6_Sub8_Sub1_1.method8226();
												local1490 = local3171 >> 28 & 0x3;
												local870 = local3171 >> 14 & 0x3FFF;
												local870 -= Static477.anInt8412;
												local1511 = local3171 & 0x3FFF;
												local1511 -= Static227.anInt5049;
												Static499.method7245(local73, local417, local870, local1511, local1490, local849, local264);
												Static165.aClass73_55 = null;
												return true;
											} else if (Static125.aClass73_44 == Static165.aClass73_55) {
												Static380.method6022(Static118.aClass101_7);
												Static165.aClass73_55 = null;
												return true;
											} else if (Static84.aClass73_30 == Static165.aClass73_55) {
												local223 = Static84.aClass6_Sub8_Sub1_1.method8229();
												local2980 = Static84.aClass6_Sub8_Sub1_1.method8251();
												Static140.aClass157_1.method4853(local2980, local223);
												Static165.aClass73_55 = null;
												return true;
											} else if (Static165.aClass73_55 == Static413.aClass73_139) {
												if (Static224.aFrame5 != null) {
													Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
												}
												@Pc(3255) byte[] local3255 = new byte[Static125.anInt3103];
												Static84.aClass6_Sub8_Sub1_1.method1506(Static125.anInt3103, local3255);
												local252 = Static99.method2380(Static125.anInt3103, 0, local3255);
												Static545.method7684(true, Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 1, local252, Static496.aClass104_4);
												Static165.aClass73_55 = null;
												return true;
											} else {
												@Pc(3318) long local3318;
												@Pc(3325) long local3325;
												if (Static134.aClass73_45 == Static165.aClass73_55) {
													local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
													local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local254 = local252;
													if (local248) {
														local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
													}
													local3318 = (long) Static84.aClass6_Sub8_Sub1_1.method8220();
													local3325 = (long) Static84.aClass6_Sub8_Sub1_1.method8203();
													local870 = Static84.aClass6_Sub8_Sub1_1.method8246();
													@Pc(3335) long local3335 = (local3318 << 32) + local3325;
													local1636 = false;
													local1546 = 0;
													while (true) {
														if (local1546 >= 100) {
															if (local870 <= 1) {
																if (Static198.aBoolean342 && !Static561.aBoolean771 || Static334.aBoolean523) {
																	local1636 = true;
																} else if (Static29.method769(local254)) {
																	local1636 = true;
																}
															}
															break;
														}
														if (local3335 == Static167.aLongArray5[local1546]) {
															local1636 = true;
															break;
														}
														local1546++;
													}
													if (!local1636 && Static47.anInt1657 == 0) {
														Static167.aLongArray5[Static285.anInt5953] = local3335;
														Static285.anInt5953 = (Static285.anInt5953 + 1) % 100;
														@Pc(3396) String local3396 = Static438.method6712(Static556.method7795(Static84.aClass6_Sub8_Sub1_1));
														if (local870 == 2) {
															Static264.method4755(local252, 7, "<img=1>" + local252, local3396, -1, (String) null, 0, "<img=1>" + local254);
														} else if (local870 == 1) {
															Static264.method4755(local252, 7, "<img=0>" + local252, local3396, -1, (String) null, 0, "<img=0>" + local254);
														} else {
															Static264.method4755(local252, 3, local252, local3396, -1, (String) null, 0, local254);
														}
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static18.aClass73_6) {
													Static478.method7046();
													Static165.aClass73_55 = null;
													return true;
												} else if (Static634.aClass73_189 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
													local2980 = Static84.aClass6_Sub8_Sub1_1.method8208();
													Static277.method4915();
													Static214.method3814(local2980, local223);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static85.aClass73_31) {
													local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8266();
													Static277.method4915();
													Static4.method384(local73, local596);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static32.aClass73_12) {
													Static5.method440(Static366.aBoolean559);
													Static165.aClass73_55 = null;
													return false;
												} else if (Static165.aClass73_55 == Static490.aClass73_78) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8210();
													Static277.method4915();
													Static520.method7443(local417, local73 + (local223 << 16));
													Static165.aClass73_55 = null;
													return true;
												} else if (Static499.aClass73_155 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8266();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8266();
													Static277.method4915();
													Static230.method4187(local73, local223, 5, local417);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static628.aClass73_187 == Static165.aClass73_55) {
													Static437.anInt7955 = Static84.aClass6_Sub8_Sub1_1.method8246();
													for (local223 = 0; local223 < Static437.anInt7955; local223++) {
														Static241.aStringArray14[local223] = Static84.aClass6_Sub8_Sub1_1.method8221();
														Static448.aStringArray27[local223] = Static84.aClass6_Sub8_Sub1_1.method8221();
														if (Static448.aStringArray27[local223].equals("")) {
															Static448.aStringArray27[local223] = Static241.aStringArray14[local223];
														}
														Static548.aStringArray35[local223] = Static84.aClass6_Sub8_Sub1_1.method8221();
														Static202.aStringArray12[local223] = Static84.aClass6_Sub8_Sub1_1.method8221();
														if (Static202.aStringArray12[local223].equals("")) {
															Static202.aStringArray12[local223] = Static548.aStringArray35[local223];
														}
														Static633.aBooleanArray27[local223] = false;
													}
													Static617.anInt10423 = Static51.anInt1750;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static288.aClass73_99) {
													Static440.method6728();
													Static165.aClass73_55 = null;
													return false;
												} else if (Static536.aClass73_159 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8243();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8229();
													Static140.aClass157_1.method4859(local73, local223);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static136.aClass73_46 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8229();
													if (local223 == 65535) {
														local223 = -1;
													}
													local73 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local264 = Static84.aClass6_Sub8_Sub1_1.method8247();
													if (local264 >= 1 && local264 <= 8) {
														if (local254.equalsIgnoreCase("null")) {
															local254 = null;
														}
														Static473.aStringArray29[local264 - 1] = local254;
														Static643.anIntArray573[local264 - 1] = local223;
														Static326.aBooleanArray14[local264 - 1] = local73 == 0;
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static629.aClass73_188 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local73 = local223 >> 5;
													local417 = local223 & 0x1F;
													if (local417 == 0) {
														Static189.aClass50Array1[local73] = null;
														Static165.aClass73_55 = null;
														return true;
													}
													@Pc(3800) Class50 local3800 = new Class50();
													local3800.anInt2414 = local417;
													local3800.anInt2407 = Static84.aClass6_Sub8_Sub1_1.method8246();
													if (local3800.anInt2407 >= 0 && local3800.anInt2407 < Static530.aClass4Array13.length) {
														if (local3800.anInt2414 == 1 || local3800.anInt2414 == 10) {
															local3800.anInt2411 = Static84.aClass6_Sub8_Sub1_1.method8220();
															Static84.aClass6_Sub8_Sub1_1.anInt10061 += 6;
														} else if (local3800.anInt2414 >= 2 && local3800.anInt2414 <= 6) {
															if (local3800.anInt2414 == 2) {
																local3800.anInt2404 = 256;
																local3800.anInt2415 = 256;
															}
															if (local3800.anInt2414 == 3) {
																local3800.anInt2404 = 0;
																local3800.anInt2415 = 256;
															}
															if (local3800.anInt2414 == 4) {
																local3800.anInt2404 = 512;
																local3800.anInt2415 = 256;
															}
															if (local3800.anInt2414 == 5) {
																local3800.anInt2404 = 256;
																local3800.anInt2415 = 0;
															}
															if (local3800.anInt2414 == 6) {
																local3800.anInt2415 = 512;
																local3800.anInt2404 = 256;
															}
															local3800.anInt2414 = 2;
															local3800.anInt2408 = Static84.aClass6_Sub8_Sub1_1.method8246();
															local3800.anInt2404 += Static84.aClass6_Sub8_Sub1_1.method8220() - Static477.anInt8412 << 9;
															local3800.anInt2415 += Static84.aClass6_Sub8_Sub1_1.method8220() - Static227.anInt5049 << 9;
															local3800.anInt2409 = Static84.aClass6_Sub8_Sub1_1.method8246() << 2;
															local3800.anInt2406 = Static84.aClass6_Sub8_Sub1_1.method8220();
														}
														local3800.anInt2405 = Static84.aClass6_Sub8_Sub1_1.method8220();
														if (local3800.anInt2405 == 65535) {
															local3800.anInt2405 = -1;
														}
														Static189.aClass50Array1[local73] = local3800;
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static378.aClass73_128) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													if (local223 == 65535) {
														local223 = -1;
													}
													local73 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local849 = Static84.aClass6_Sub8_Sub1_1.method8220();
													Static141.method2795(local264, local73, local223, false, local417, local849);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static523.aClass73_156) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8253();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8245() << 2;
													local264 = Static84.aClass6_Sub8_Sub1_1.method8253();
													local849 = Static84.aClass6_Sub8_Sub1_1.method8253();
													Static277.method4915();
													Static4.method360(local223, local264, true, local417, local73, local849);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static116.aClass73_40 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local2342 = (local73 & 0x1) == 1;
													Static412.method6457(local223, local2342);
													local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
													for (local849 = 0; local849 < local264; local849++) {
														local3171 = Static84.aClass6_Sub8_Sub1_1.method8229();
														local1490 = Static84.aClass6_Sub8_Sub1_1.method8243();
														if (local1490 == 255) {
															local1490 = Static84.aClass6_Sub8_Sub1_1.method8210();
														}
														Static598.method8289(local2342, local1490, local223, local3171 - 1, local849);
													}
													Static148.anIntArray155[Static282.anInt5928++ & 0x1F] = local223;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static371.aClass73_124) {
													local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local252 = Static438.method6712(Static556.method7795(Static84.aClass6_Sub8_Sub1_1));
													Static548.method7725(6, local252, 0, local596, local596, local596);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static288.aClass73_98) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8247();
													if (local223 == 255) {
														local73 = -1;
														local223 = -1;
													}
													Static432.method6658(local223, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static266.aClass73_88) {
													Static571.anInt9787 = Static84.aClass6_Sub8_Sub1_1.method8246();
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static462.aClass73_149) {
													Static380.method6022(Static547.aClass101_3);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static53.aClass73_17 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8266();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
													Static277.method4915();
													Static91.method2288(local73, local223);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static226.aClass73_70) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
													Static277.method4915();
													if (Static299.aClass302ArrayArray2[local223] != null) {
														for (local264 = local73; local264 < local417; local264++) {
															local849 = Static84.aClass6_Sub8_Sub1_1.method8203();
															if (Static299.aClass302ArrayArray2[local223].length > local264 && Static299.aClass302ArrayArray2[local223][local264] != null) {
																Static299.aClass302ArrayArray2[local223][local264].anInt8873 = local849;
															}
														}
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static7.aClass73_1) {
													Static380.method6022(Static149.aClass101_9);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static90.aClass73_36 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8237();
													local2342 = (local223 & 0x1) == 1;
													Static341.method5676(local2342, local73);
													Static148.anIntArray155[Static282.anInt5928++ & 0x1F] = local73;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static258.aClass73_87 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8253();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8229();
													Static277.method4915();
													if (local223 == 2) {
														Static411.method6453();
													}
													Static30.anInt830 = local73;
													Static258.method4588(local73);
													Static80.method2189(false);
													Static435.method6680(Static30.anInt830);
													for (local417 = 0; local417 < 100; local417++) {
														Static366.aBooleanArray16[local417] = true;
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static25.aClass73_9 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8243();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8243();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8245();
													if (local417 == 65535) {
														local417 = -1;
													}
													Static205.method6795(local417, local223, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static151.aClass73_54 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8209();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8245();
													if (local417 == 65535) {
														local417 = -1;
													}
													Static405.method6336(local223, local73, local417);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static24.aClass73_7) {
													Static374.anInt9757 = Static84.aClass6_Sub8_Sub1_1.method8246();
													Static573.anInt9802 = Static84.aClass6_Sub8_Sub1_1.method8204() << 3;
													Static106.anInt5768 = Static84.aClass6_Sub8_Sub1_1.method8201() << 3;
													while (Static84.aClass6_Sub8_Sub1_1.anInt10061 < Static125.anInt3103) {
														@Pc(4490) Class101 local4490 = Static208.method3746()[Static84.aClass6_Sub8_Sub1_1.method8246()];
														Static380.method6022(local4490);
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static144.aClass73_191 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													if (local223 == 65535) {
														local223 = -1;
													}
													local73 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local849 = Static84.aClass6_Sub8_Sub1_1.method8220();
													Static523.method7452(local849, local223, local73, local417, local264);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static378.aClass73_129 == Static165.aClass73_55) {
													Static277.method4915();
													Static500.method7617();
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static498.aClass73_153) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8237();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
													Static140.aClass157_1.method4859(local223, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static388.aClass73_133) {
													Static380.method6022(Static251.aClass101_11);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static269.aClass73_175) {
													Static106.anInt5768 = Static84.aClass6_Sub8_Sub1_1.method8201() << 3;
													Static374.anInt9757 = Static84.aClass6_Sub8_Sub1_1.method8243();
													Static573.anInt9802 = Static84.aClass6_Sub8_Sub1_1.method8201() << 3;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static284.aClass73_95 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local2342 = (local73 & 0x1) == 1;
													while (Static84.aClass6_Sub8_Sub1_1.anInt10061 < Static125.anInt3103) {
														local264 = Static84.aClass6_Sub8_Sub1_1.method8214();
														local849 = Static84.aClass6_Sub8_Sub1_1.method8220();
														local3171 = 0;
														if (local849 != 0) {
															local3171 = Static84.aClass6_Sub8_Sub1_1.method8246();
															if (local3171 == 255) {
																local3171 = Static84.aClass6_Sub8_Sub1_1.method8236();
															}
														}
														Static598.method8289(local2342, local3171, local223, local849 - 1, local264);
													}
													Static148.anIntArray155[Static282.anInt5928++ & 0x1F] = local223;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static565.aClass73_169 == Static165.aClass73_55) {
													local248 = Static84.aClass6_Sub8_Sub1_1.method8247() == 1;
													Static277.method4915();
													Static26.aBoolean75 = local248;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static57.aClass73_18) {
													Static196.method3570(Static125.anInt3103, Static84.aClass6_Sub8_Sub1_1);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static299.aClass73_104 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8246();
													@Pc(4752) boolean local4752 = (local223 & 0x1) == 1;
													local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local2250 = Static84.aClass6_Sub8_Sub1_1.method8221();
													if (local2250.equals("")) {
														local2250 = local254;
													}
													local1101 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local301 = Static84.aClass6_Sub8_Sub1_1.method8221();
													if (local301.equals("")) {
														local301 = local1101;
													}
													if (local4752) {
														for (local1490 = 0; local1490 < Static437.anInt7955; local1490++) {
															if (Static448.aStringArray27[local1490].equals(local301)) {
																Static241.aStringArray14[local1490] = local254;
																Static448.aStringArray27[local1490] = local2250;
																Static548.aStringArray35[local1490] = local1101;
																Static202.aStringArray12[local1490] = local301;
																break;
															}
														}
													} else {
														Static241.aStringArray14[Static437.anInt7955] = local254;
														Static448.aStringArray27[Static437.anInt7955] = local2250;
														Static548.aStringArray35[Static437.anInt7955] = local1101;
														Static202.aStringArray12[Static437.anInt7955] = local301;
														Static633.aBooleanArray27[Static437.anInt7955] = (local223 & 0x2) == 2;
														Static437.anInt7955++;
													}
													Static165.aClass73_55 = null;
													Static617.anInt10423 = Static51.anInt1750;
													return true;
												} else if (Static165.aClass73_55 == Static240.aClass73_81) {
													local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
													local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
													local254 = local252;
													if (local248) {
														local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
													}
													local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
													local849 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local1486 = false;
													if (local264 <= 1 && Static29.method769(local254)) {
														local1486 = true;
													}
													if (!local1486 && Static47.anInt1657 == 0) {
														local1137 = Static105.aClass291_1.method7162(local849).method3484(Static84.aClass6_Sub8_Sub1_1);
														if (local264 == 2) {
															Static264.method4755(local252, 25, "<img=1>" + local252, local1137, local849, (String) null, 0, "<img=1>" + local254);
														} else if (local264 == 1) {
															Static264.method4755(local252, 25, "<img=0>" + local252, local1137, local849, (String) null, 0, "<img=0>" + local254);
														} else {
															Static264.method4755(local252, 25, local252, local1137, local849, (String) null, 0, local254);
														}
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static553.aClass73_163 == Static165.aClass73_55) {
													Static5.method440(false);
													Static165.aClass73_55 = null;
													return false;
												} else if (Static165.aClass73_55 == Static106.aClass73_91) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8247();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8247();
													Static105.anIntArray98[local73] = local223;
													Static494.anIntArray442[local73] = local417;
													Static534.anIntArray481[local73] = 1;
													local264 = Static70.anIntArray76[local73] - 1;
													for (local849 = 0; local849 < local264; local849++) {
														if (local223 >= Class31_Sub1.anIntArray84[local849]) {
															Static534.anIntArray481[local73] = local849 + 2;
														}
													}
													Static210.anIntArray202[Static243.anInt4625++ & 0x1F] = local73;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static12.aClass73_4) {
													Static380.method6022(Static77.aClass101_14);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static624.aClass73_186) {
													Static389.aString74 = Static125.anInt3103 > 2 ? Static84.aClass6_Sub8_Sub1_1.method8221() : Static536.aClass316_28.method7577(Static638.anInt10709);
													Static365.anInt7043 = Static125.anInt3103 > 0 ? Static84.aClass6_Sub8_Sub1_1.method8220() : -1;
													Static165.aClass73_55 = null;
													if (Static365.anInt7043 == 65535) {
														Static365.anInt7043 = -1;
													}
													return true;
												} else if (Static165.aClass73_55 == Static371.aClass73_125) {
													Static310.anInt1851 = 1;
													Static165.aClass73_55 = null;
													Static617.anInt10423 = Static51.anInt1750;
													return true;
												} else if (Static165.aClass73_55 == Static283.aClass73_151) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
													Static277.method4915();
													Static230.method4187(Static238.anInt5268, 0, 5, local223);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static285.aClass73_96) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8259();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8200();
													Static277.method4915();
													Static183.method8419(local417, local223, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static57.aClass73_19) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8266();
													Static277.method4915();
													@Pc(5195) Class6_Sub25 local5195 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local223);
													if (local5195 != null) {
														Static360.method5823(false, local5195, true);
													}
													if (Static97.aClass302_2 != null) {
														Static580.method8049(Static97.aClass302_2);
														Static97.aClass302_2 = null;
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static426.aClass73_140) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8215();
													Static277.method4915();
													Static389.method6095(local223, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static535.aClass73_158 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8220();
													local73 = Static84.aClass6_Sub8_Sub1_1.method8266();
													local417 = Static84.aClass6_Sub8_Sub1_1.method8237();
													local264 = Static84.aClass6_Sub8_Sub1_1.method8229();
													Static277.method4915();
													Static230.method4187(local417 << 16 | local223, local264, 7, local73);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static499.aClass73_154) {
													Static380.method6022(Static602.aClass101_17);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static165.aClass73_55 == Static603.aClass73_182) {
													Static145.anInt3425 = Static84.aClass6_Sub8_Sub1_1.method8244();
													Static198.aBoolean342 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static469.aClass73_150 == Static165.aClass73_55) {
													if (Static30.anInt830 != -1) {
														Static375.method5973(0, Static30.anInt830);
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static209.aClass73_66 == Static165.aClass73_55) {
													if (Static275.method8428(Static333.anInt6626)) {
														Static96.anInt2770 = (int) ((float) Static84.aClass6_Sub8_Sub1_1.method8220() * 2.5F);
													} else {
														Static96.anInt2770 = Static84.aClass6_Sub8_Sub1_1.method8220() * 30;
													}
													Static440.anInt7977 = Static51.anInt1750;
													Static165.aClass73_55 = null;
													return true;
												} else if (Static585.aClass73_173 == Static165.aClass73_55) {
													Static380.method6022(Static4.aClass101_1);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static442.aClass73_142 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
													Static277.method4915();
													Static122.method2609(local223);
													Static165.aClass73_55 = null;
													return true;
												} else if (Static542.aClass73_161 == Static165.aClass73_55) {
													for (local223 = 0; local223 < Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1.length; local223++) {
														if (Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local223] != null) {
															Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local223].anIntArray189 = null;
															Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local223].anInt4341 = -1;
														}
													}
													for (local73 = 0; local73 < Static337.anInt6701; local73++) {
														Static303.aClass6_Sub42Array1[local73].aClass9_Sub4_Sub2_Sub1_Sub1_1.anIntArray189 = null;
														Static303.aClass6_Sub42Array1[local73].aClass9_Sub4_Sub2_Sub1_Sub1_1.anInt4341 = -1;
													}
													Static165.aClass73_55 = null;
													return true;
												} else if (Static574.aClass73_171 == Static165.aClass73_55) {
													local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
													Static277.method4915();
													Static230.method4187(-1, -1, 3, local223);
													Static165.aClass73_55 = null;
													return true;
												} else {
													@Pc(5492) long local5492;
													if (Static165.aClass73_55 == Static15.aClass73_5) {
														local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
														local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
														local254 = local252;
														if (local248) {
															local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
														}
														local3318 = Static84.aClass6_Sub8_Sub1_1.method8263();
														local3325 = (long) Static84.aClass6_Sub8_Sub1_1.method8220();
														local5492 = (long) Static84.aClass6_Sub8_Sub1_1.method8203();
														local1519 = Static84.aClass6_Sub8_Sub1_1.method8246();
														@Pc(5502) long local5502 = (local3325 << 32) + local5492;
														@Pc(5504) boolean local5504 = false;
														local1554 = 0;
														while (true) {
															if (local1554 >= 100) {
																if (local1519 <= 1) {
																	if (Static198.aBoolean342 && !Static561.aBoolean771 || Static334.aBoolean523) {
																		local5504 = true;
																	} else if (Static29.method769(local254)) {
																		local5504 = true;
																	}
																}
																break;
															}
															if (local5502 == Static167.aLongArray5[local1554]) {
																local5504 = true;
																break;
															}
															local1554++;
														}
														if (!local5504 && Static47.anInt1657 == 0) {
															Static167.aLongArray5[Static285.anInt5953] = local5502;
															Static285.anInt5953 = (Static285.anInt5953 + 1) % 100;
															@Pc(5564) String local5564 = Static438.method6712(Static556.method7795(Static84.aClass6_Sub8_Sub1_1));
															if (local1519 == 2 || local1519 == 3) {
																Static264.method4755(local252, 9, "<img=1>" + local252, local5564, -1, Static40.method1345(local3318), 0, "<img=1>" + local254);
															} else if (local1519 == 1) {
																Static264.method4755(local252, 9, "<img=0>" + local252, local5564, -1, Static40.method1345(local3318), 0, "<img=0>" + local254);
															} else {
																Static264.method4755(local252, 9, local252, local5564, -1, Static40.method1345(local3318), 0, local254);
															}
														}
														Static165.aClass73_55 = null;
														return true;
													}
													@Pc(5711) Class6_Sub50 local5711;
													@Pc(5702) Class6_Sub50 local5702;
													if (Static165.aClass73_55 == Static322.aClass73_108) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
														local73 = Static84.aClass6_Sub8_Sub1_1.method8229();
														if (local73 == 65535) {
															local73 = -1;
														}
														local417 = Static84.aClass6_Sub8_Sub1_1.method8229();
														if (local417 == 65535) {
															local417 = -1;
														}
														local264 = Static84.aClass6_Sub8_Sub1_1.method8266();
														Static277.method4915();
														for (local849 = local417; local849 <= local73; local849++) {
															local3325 = ((long) local264 << 32) + ((long) local849);
															local5702 = (Class6_Sub50) Static314.aClass380_23.method8747(local3325);
															if (local5702 != null) {
																local5711 = new Class6_Sub50(local223, local5702.anInt10442);
																local5702.method8792();
															} else if (local849 == -1) {
																local5711 = new Class6_Sub50(local223, Static299.method5103(local264).aClass6_Sub50_2.anInt10442);
															} else {
																local5711 = new Class6_Sub50(local223, -1);
															}
															Static314.aClass380_23.method8753(local5711, local3325);
														}
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static74.aClass73_27) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8210();
														local73 = Static84.aClass6_Sub8_Sub1_1.method8220();
														if (local73 == 65535) {
															local73 = -1;
														}
														local417 = Static84.aClass6_Sub8_Sub1_1.method8229();
														local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
														if (local264 == 65535) {
															local264 = -1;
														}
														Static277.method4915();
														for (local849 = local73; local849 <= local264; local849++) {
															local3325 = ((long) local223 << 32) + ((long) local849);
															local5702 = (Class6_Sub50) Static314.aClass380_23.method8747(local3325);
															if (local5702 != null) {
																local5711 = new Class6_Sub50(local5702.anInt10438, local417);
																local5702.method8792();
															} else if (local849 == -1) {
																local5711 = new Class6_Sub50(Static299.method5103(local223).aClass6_Sub50_2.anInt10438, local417);
															} else {
																local5711 = new Class6_Sub50(0, local417);
															}
															Static314.aClass380_23.method8753(local5711, local3325);
														}
														Static165.aClass73_55 = null;
														return true;
													} else if (Static295.aClass73_101 == Static165.aClass73_55) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8266();
														local73 = Static84.aClass6_Sub8_Sub1_1.method8229();
														local417 = Static84.aClass6_Sub8_Sub1_1.method8220();
														local264 = Static84.aClass6_Sub8_Sub1_1.method8220();
														Static277.method4915();
														Static604.method8338(local264, local223, local417, local73);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static199.aClass73_61) {
														Static507.anInt8770 = Static51.anInt1750;
														if (Static125.anInt3103 == 0) {
															Static638.aClass162Array1 = null;
															Static585.aString105 = null;
															Static67.anInt2305 = 0;
															Static292.aString67 = null;
															Static165.aClass73_55 = null;
															return true;
														}
														Static585.aString105 = Static84.aClass6_Sub8_Sub1_1.method8221();
														local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
														if (local248) {
															Static84.aClass6_Sub8_Sub1_1.method8221();
														}
														@Pc(5943) long local5943 = Static84.aClass6_Sub8_Sub1_1.method8263();
														Static292.aString67 = Static310.method1707(local5943);
														Static412.aByte90 = Static84.aClass6_Sub8_Sub1_1.method8208();
														local264 = Static84.aClass6_Sub8_Sub1_1.method8246();
														if (local264 == 255) {
															Static165.aClass73_55 = null;
															return true;
														}
														Static67.anInt2305 = local264;
														@Pc(5969) Class162[] local5969 = new Class162[100];
														for (local3171 = 0; local3171 < Static67.anInt2305; local3171++) {
															local5969[local3171] = new Class162();
															local5969[local3171].aString65 = Static84.aClass6_Sub8_Sub1_1.method8221();
															local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
															if (local248) {
																local5969[local3171].aString63 = Static84.aClass6_Sub8_Sub1_1.method8221();
															} else {
																local5969[local3171].aString63 = local5969[local3171].aString65;
															}
															local5969[local3171].aString62 = Static604.method8337(local5969[local3171].aString63);
															local5969[local3171].anInt5950 = Static84.aClass6_Sub8_Sub1_1.method8220();
															local5969[local3171].aByte68 = Static84.aClass6_Sub8_Sub1_1.method8208();
															local5969[local3171].aString64 = Static84.aClass6_Sub8_Sub1_1.method8221();
															if (local5969[local3171].aString63.equals(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46)) {
																Static204.aByte89 = local5969[local3171].aByte68;
															}
														}
														local1511 = Static67.anInt2305;
														while (local1511 > 0) {
															local853 = true;
															local1511--;
															for (local1519 = 0; local1519 < local1511; local1519++) {
																if (local5969[local1519].aString62.compareTo(local5969[local1519 + 1].aString62) > 0) {
																	local2377 = local5969[local1519];
																	local5969[local1519] = local5969[local1519 + 1];
																	local5969[local1519 + 1] = local2377;
																	local853 = false;
																}
															}
															if (local853) {
																break;
															}
														}
														Static165.aClass73_55 = null;
														Static638.aClass162Array1 = local5969;
														return true;
													} else if (Static40.aClass73_13 == Static165.aClass73_55) {
														local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
														local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
														local254 = local252;
														if (local248) {
															local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
														}
														local3318 = Static84.aClass6_Sub8_Sub1_1.method8263();
														local3325 = (long) Static84.aClass6_Sub8_Sub1_1.method8220();
														local5492 = (long) Static84.aClass6_Sub8_Sub1_1.method8203();
														local1519 = Static84.aClass6_Sub8_Sub1_1.method8246();
														local1526 = Static84.aClass6_Sub8_Sub1_1.method8220();
														@Pc(6186) long local6186 = local5492 + (local3325 << 32);
														@Pc(6188) boolean local6188 = false;
														local1726 = 0;
														while (true) {
															if (local1726 >= 100) {
																if (local1519 <= 1 && Static29.method769(local254)) {
																	local6188 = true;
																}
																break;
															}
															if (local6186 == Static167.aLongArray5[local1726]) {
																local6188 = true;
																break;
															}
															local1726++;
														}
														if (!local6188 && Static47.anInt1657 == 0) {
															Static167.aLongArray5[Static285.anInt5953] = local6186;
															Static285.anInt5953 = (Static285.anInt5953 + 1) % 100;
															@Pc(6239) String local6239 = Static105.aClass291_1.method7162(local1526).method3484(Static84.aClass6_Sub8_Sub1_1);
															if (local1519 == 2) {
																Static264.method4755(local252, 20, "<img=1>" + local252, local6239, local1526, Static40.method1345(local3318), 0, "<img=1>" + local254);
															} else if (local1519 == 1) {
																Static264.method4755(local252, 20, "<img=0>" + local252, local6239, local1526, Static40.method1345(local3318), 0, "<img=0>" + local254);
															} else {
																Static264.method4755(local252, 20, local252, local6239, local1526, Static40.method1345(local3318), 0, local254);
															}
														}
														Static165.aClass73_55 = null;
														return true;
													} else if (Static333.aClass73_111 == Static165.aClass73_55) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8237();
														local73 = Static84.aClass6_Sub8_Sub1_1.method8266();
														Static277.method4915();
														Static214.method3814(local73, local223);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static63.aClass73_20) {
														local248 = Static84.aClass6_Sub8_Sub1_1.method8246() == 1;
														local252 = Static84.aClass6_Sub8_Sub1_1.method8221();
														local254 = local252;
														if (local248) {
															local254 = Static84.aClass6_Sub8_Sub1_1.method8221();
														}
														local3318 = (long) Static84.aClass6_Sub8_Sub1_1.method8220();
														local3325 = (long) Static84.aClass6_Sub8_Sub1_1.method8203();
														local870 = Static84.aClass6_Sub8_Sub1_1.method8246();
														local1511 = Static84.aClass6_Sub8_Sub1_1.method8220();
														@Pc(6385) long local6385 = local3325 + (local3318 << 32);
														local1950 = false;
														local1552 = 0;
														while (true) {
															if (local1552 >= 100) {
																if (local870 <= 1 && Static29.method769(local254)) {
																	local1950 = true;
																}
																break;
															}
															if (Static167.aLongArray5[local1552] == local6385) {
																local1950 = true;
																break;
															}
															local1552++;
														}
														if (!local1950 && Static47.anInt1657 == 0) {
															Static167.aLongArray5[Static285.anInt5953] = local6385;
															Static285.anInt5953 = (Static285.anInt5953 + 1) % 100;
															@Pc(6439) String local6439 = Static105.aClass291_1.method7162(local1511).method3484(Static84.aClass6_Sub8_Sub1_1);
															if (local870 == 2) {
																Static264.method4755(local252, 18, "<img=1>" + local252, local6439, local1511, (String) null, 0, "<img=1>" + local254);
															} else if (local870 == 1) {
																Static264.method4755(local252, 18, "<img=0>" + local252, local6439, local1511, (String) null, 0, "<img=0>" + local254);
															} else {
																Static264.method4755(local252, 18, local252, local6439, local1511, (String) null, 0, local254);
															}
														}
														Static165.aClass73_55 = null;
														return true;
													} else if (Static144.aClass73_190 == Static165.aClass73_55) {
														Static308.method5180();
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static596.aClass73_177) {
														local596 = Static84.aClass6_Sub8_Sub1_1.method8221();
														@Pc(6533) Object[] local6533 = new Object[local596.length() + 1];
														for (local417 = local596.length() - 1; local417 >= 0; local417--) {
															if (local596.charAt(local417) == 's') {
																local6533[local417 + 1] = Static84.aClass6_Sub8_Sub1_1.method8221();
															} else {
																local6533[local417 + 1] = Integer.valueOf(Static84.aClass6_Sub8_Sub1_1.method8236());
															}
														}
														local6533[0] = Integer.valueOf(Static84.aClass6_Sub8_Sub1_1.method8236());
														Static277.method4915();
														@Pc(6585) Class6_Sub29 local6585 = new Class6_Sub29();
														local6585.anObjectArray1 = local6533;
														Static435.method6669(local6585);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static573.aClass73_170) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8226();
														local73 = Static84.aClass6_Sub8_Sub1_1.method8245();
														if (local73 == 65535) {
															local73 = -1;
														}
														Static277.method4915();
														Static230.method4187(local73, -1, 2, local223);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static165.aClass73_55 == Static441.aClass73_141) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8245();
														if (local223 == 65535) {
															local223 = -1;
														}
														local73 = Static84.aClass6_Sub8_Sub1_1.method8236();
														Static277.method4915();
														Static230.method4187(local223, -1, 1, local73);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static502.aClass73_130 == Static165.aClass73_55) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8246();
														Static277.method4915();
														Static186.anInt4078 = local223;
														Static165.aClass73_55 = null;
														return true;
													} else if (Static502.aClass73_131 == Static165.aClass73_55) {
														Static51.anInt1766 = Static84.aClass6_Sub8_Sub1_1.method8231();
														Static440.anInt7977 = Static51.anInt1750;
														Static165.aClass73_55 = null;
														return true;
													} else if (Static99.aClass73_37 == Static165.aClass73_55) {
														local223 = Static84.aClass6_Sub8_Sub1_1.method8236();
														Static350.aClass159_6 = Static496.aClass104_4.method3137(local223);
														Static165.aClass73_55 = null;
														return true;
													} else if (Static360.aClass73_122 == Static165.aClass73_55) {
														Static140.aClass157_1.method4855();
														Static423.anInt7806 += 32;
														Static165.aClass73_55 = null;
														return true;
													} else if (Static25.aClass73_8 == Static165.aClass73_55) {
														Static374.anInt9757 = Static84.aClass6_Sub8_Sub1_1.method8246();
														Static573.anInt9802 = Static84.aClass6_Sub8_Sub1_1.method8251() << 3;
														Static106.anInt5768 = Static84.aClass6_Sub8_Sub1_1.method8208() << 3;
														for (@Pc(6741) Class6_Sub47 local6741 = (Class6_Sub47) Static283.aClass380_37.method8755(); local6741 != null; local6741 = (Class6_Sub47) Static283.aClass380_37.method8752()) {
															local73 = (int) (local6741.aLong278 >> 28 & 0x3L);
															local417 = (int) (local6741.aLong278 & 0x3FFFL);
															local264 = local417 - Static477.anInt8412;
															local849 = (int) (local6741.aLong278 >> 14 & 0x3FFFL);
															local3171 = local849 - Static227.anInt5049;
															if (Static374.anInt9757 == local73 && local264 >= Static106.anInt5768 && Static106.anInt5768 + 8 > local264 && Static573.anInt9802 <= local3171 && local3171 < Static573.anInt9802 + 8) {
																local6741.method8792();
																if (local264 >= 0 && local3171 >= 0 && local264 < Static306.anInt6176 && Static108.anInt2930 > local3171) {
																	Static367.method7655(local264, Static374.anInt9757, local3171);
																}
															}
														}
														@Pc(6844) Class6_Sub36 local6844;
														for (local6844 = (Class6_Sub36) Static354.aClass163_40.method4966(); local6844 != null; local6844 = (Class6_Sub36) Static354.aClass163_40.method4965()) {
															if (local6844.anInt7720 >= Static106.anInt5768 && local6844.anInt7720 < Static106.anInt5768 + 8 && local6844.anInt7721 >= Static573.anInt9802 && Static573.anInt9802 + 8 > local6844.anInt7721 && Static374.anInt9757 == local6844.anInt7724) {
																local6844.aBoolean609 = true;
															}
														}
														for (local6844 = (Class6_Sub36) Static122.aClass163_15.method4966(); local6844 != null; local6844 = (Class6_Sub36) Static122.aClass163_15.method4965()) {
															if (Static106.anInt5768 <= local6844.anInt7720 && local6844.anInt7720 < Static106.anInt5768 + 8 && Static573.anInt9802 <= local6844.anInt7721 && Static573.anInt9802 + 8 > local6844.anInt7721 && Static374.anInt9757 == local6844.anInt7724) {
																local6844.aBoolean609 = true;
															}
														}
														Static165.aClass73_55 = null;
														return true;
													} else {
														Static358.method5809((Throwable) null, "T1 - " + (Static165.aClass73_55 == null ? -1 : Static165.aClass73_55.method2522()) + "," + (Static461.aClass73_148 == null ? -1 : Static461.aClass73_148.method2522()) + "," + (Static340.aClass73_118 == null ? -1 : Static340.aClass73_118.method2522()) + " - " + Static125.anInt3103);
														Static5.method440(false);
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

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)V")
	public static void method6923(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 17);
		local8.method5174();
	}
}
