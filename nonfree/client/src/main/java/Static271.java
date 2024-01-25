import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt4937;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[Lclient!fe;")
	public static final Class105[] aClass105Array1 = new Class105[4];

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_68 = new Class200(99, 3);

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_69 = new Class200(67, 6);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	public static boolean method4455() throws IOException {
		if (Static413.aClass230_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static61.aClass200_15 == null) {
			if (Static308.aBoolean411) {
				if (!Static413.aClass230_1.method6031(1)) {
					return false;
				}
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
				Static343.anInt6699 = 0;
				Static553.anInt9279++;
				Static308.aBoolean411 = false;
			}
			Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
			if (Static30.aClass3_Sub3_Sub2_1.method4267()) {
				if (!Static413.aClass230_1.method6031(1)) {
					return false;
				}
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 1);
				Static343.anInt6699 = 0;
				Static553.anInt9279++;
			}
			Static308.aBoolean411 = true;
			@Pc(69) Class200[] local69 = Static81.method5057();
			local73 = Static30.aClass3_Sub3_Sub2_1.method4277();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static30.aClass3_Sub3_Sub2_1.anInt4736);
			}
			Static61.aClass200_15 = local69[local73];
			Static272.anInt4948 = Static61.aClass200_15.anInt5907;
		}
		if (Static272.anInt4948 == -1) {
			if (!Static413.aClass230_1.method6031(1)) {
				return false;
			}
			Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
			Static553.anInt9279++;
			Static272.anInt4948 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
			Static343.anInt6699 = 0;
		}
		if (Static272.anInt4948 == -2) {
			if (!Static413.aClass230_1.method6031(2)) {
				return false;
			}
			Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 2, 0);
			Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
			Static272.anInt4948 = Static30.aClass3_Sub3_Sub2_1.method4221();
			Static553.anInt9279 += 2;
			Static343.anInt6699 = 0;
		}
		if (Static272.anInt4948 > 0) {
			if (!Static413.aClass230_1.method6031(Static272.anInt4948)) {
				return false;
			}
			Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
			Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, Static272.anInt4948, 0);
			Static343.anInt6699 = 0;
			Static553.anInt9279 += Static272.anInt4948;
		}
		Static66.aClass200_16 = Static191.aClass200_47;
		Static191.aClass200_47 = Static149.aClass200_28;
		Static149.aClass200_28 = Static61.aClass200_15;
		@Pc(204) int local204;
		if (Static61.aClass200_15 == Static289.aClass200_126) {
			local204 = Static30.aClass3_Sub3_Sub2_1.method4236();
			if (local204 == 65535) {
				local204 = -1;
			}
			local73 = Static30.aClass3_Sub3_Sub2_1.method4223();
			Static630.method8655();
			Static597.method8377(1, local204, -1, local73);
			Static61.aClass200_15 = null;
			return true;
		}
		@Pc(238) boolean local238;
		if (Static61.aClass200_15 == Static498.aClass200_127) {
			local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
			@Pc(243) byte[] local243 = new byte[Static272.anInt4948 - 1];
			Static30.aClass3_Sub3_Sub2_1.method4206(local243, Static272.anInt4948 - 1, 0);
			Static187.method3215(local238, local243);
			Static61.aClass200_15 = null;
			return true;
		} else if (Static61.aClass200_15 == Static299.aClass200_79) {
			local238 = Static30.aClass3_Sub3_Sub2_1.method4259() == 1;
			Static630.method8655();
			Static146.aBoolean189 = local238;
			Static61.aClass200_15 = null;
			return true;
		} else if (Static566.aClass200_137 == Static61.aClass200_15) {
			Static639.method8721(Static413.aClass337_11);
			Static61.aClass200_15 = null;
			return true;
		} else {
			@Pc(309) int local309;
			@Pc(313) int local313;
			@Pc(317) int local317;
			if (Static642.aClass200_151 == Static61.aClass200_15) {
				local204 = Static30.aClass3_Sub3_Sub2_1.method4222() << 2;
				local73 = Static30.aClass3_Sub3_Sub2_1.method4243();
				local309 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local317 = Static30.aClass3_Sub3_Sub2_1.method4225();
				Static630.method8655();
				Static74.method1759(local317, local309, local204, local73, local313, true);
				Static61.aClass200_15 = null;
				return true;
			}
			@Pc(343) byte local343;
			if (Static161.aClass200_36 == Static61.aClass200_15) {
				local204 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local343 = Static30.aClass3_Sub3_Sub2_1.method4245();
				Static630.method8655();
				Static114.method2325(local343, local204);
				Static61.aClass200_15 = null;
				return true;
			} else if (Static61.aClass200_15 == Static595.aClass200_149) {
				local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
				local73 = Static30.aClass3_Sub3_Sub2_1.method4223();
				Static373.aClass150_1.method3825(local204, local73);
				Static61.aClass200_15 = null;
				return true;
			} else {
				@Pc(394) boolean local394;
				if (Static249.aClass200_65 == Static61.aClass200_15) {
					local204 = Static30.aClass3_Sub3_Sub2_1.method4259();
					local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local394 = (local204 & 0x1) == 1;
					Static82.method1951(local394, local73);
					Static382.anIntArray435[Static416.anInt7577++ & 0x1F] = local73;
					Static61.aClass200_15 = null;
					return true;
				} else if (Static61.aClass200_15 == Static614.aClass200_144) {
					local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local309 = Static30.aClass3_Sub3_Sub2_1.method4221();
					Static630.method8655();
					if (Static92.aClass279ArrayArray1[local204] != null) {
						for (local313 = local73; local313 < local309; local313++) {
							local317 = Static30.aClass3_Sub3_Sub2_1.method4204();
							if (Static92.aClass279ArrayArray1[local204].length > local313 && Static92.aClass279ArrayArray1[local204][local313] != null) {
								Static92.aClass279ArrayArray1[local204][local313].anInt8183 = local317;
							}
						}
					}
					Static61.aClass200_15 = null;
					return true;
				} else if (Static61.aClass200_15 == Static583.aClass200_138) {
					Static435.method6794();
					Static61.aClass200_15 = null;
					return true;
				} else if (Static460.aClass200_118 == Static61.aClass200_15) {
					Static443.method6906();
					Static61.aClass200_15 = null;
					return false;
				} else if (Static156.aClass200_71 == Static61.aClass200_15) {
					local204 = Static30.aClass3_Sub3_Sub2_1.method4224();
					local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
					Static630.method8655();
					Static392.method6339(local204, local73);
					Static61.aClass200_15 = null;
					return true;
				} else {
					@Pc(553) long local553;
					@Pc(535) String local535;
					@Pc(548) long local548;
					@Pc(537) String local537;
					@Pc(557) int local557;
					@Pc(561) int local561;
					@Pc(569) boolean local569;
					@Pc(571) int local571;
					if (Static61.aClass200_15 == Static614.aClass200_145) {
						local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
						local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
						local537 = local535;
						if (local238) {
							local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
						}
						local548 = Static30.aClass3_Sub3_Sub2_1.method4221();
						local553 = Static30.aClass3_Sub3_Sub2_1.method4204();
						local557 = Static30.aClass3_Sub3_Sub2_1.method4225();
						local561 = Static30.aClass3_Sub3_Sub2_1.method4221();
						@Pc(567) long local567 = local553 + (local548 << 32);
						local569 = false;
						local571 = 0;
						while (true) {
							if (local571 >= 100) {
								if (local557 <= 1 && Static201.method3498(local537)) {
									local569 = true;
								}
								break;
							}
							if (Static168.aLongArray12[local571] == local567) {
								local569 = true;
								break;
							}
							local571++;
						}
						if (!local569 && Static56.anInt1566 == 0) {
							Static168.aLongArray12[Static302.anInt5359] = local567;
							Static302.anInt5359 = (Static302.anInt5359 + 1) % 100;
							@Pc(622) String local622 = Static430.aClass113_2.method2868(local561).method4828(Static30.aClass3_Sub3_Sub2_1);
							if (local557 == 2) {
								Static491.method7315("<img=1>" + local535, local561, local535, 0, "<img=1>" + local537, 18, local622, null);
							} else if (local557 == 1) {
								Static491.method7315("<img=0>" + local535, local561, local535, 0, "<img=0>" + local537, 18, local622, null);
							} else {
								Static491.method7315(local535, local561, local535, 0, local537, 18, local622, null);
							}
						}
						Static61.aClass200_15 = null;
						return true;
					} else if (Static135.aClass200_26 == Static61.aClass200_15) {
						local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
						Static630.method8655();
						Static461.method7014(local204);
						Static61.aClass200_15 = null;
						return true;
					} else if (aClass200_69 == Static61.aClass200_15) {
						local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
						if (local204 == 65535) {
							local204 = -1;
						}
						local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
						local309 = Static30.aClass3_Sub3_Sub2_1.method4221();
						local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
						Static533.method7799(local73, local204, local309, true, 256, local313);
						Static61.aClass200_15 = null;
						return true;
					} else if (Static93.aClass200_21 == Static61.aClass200_15) {
						local204 = Static30.aClass3_Sub3_Sub2_1.method4236();
						local343 = Static30.aClass3_Sub3_Sub2_1.method4254();
						Static630.method8655();
						Static175.method3055(local343, local204);
						Static61.aClass200_15 = null;
						return true;
					} else {
						@Pc(801) boolean local801;
						@Pc(822) String local822;
						if (Static61.aClass200_15 == Static43.aClass200_8) {
							local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
							local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
							local537 = local535;
							if (local238) {
								local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
							}
							local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
							local317 = Static30.aClass3_Sub3_Sub2_1.method4221();
							local801 = false;
							if (local313 <= 1 && Static201.method3498(local537)) {
								local801 = true;
							}
							if (!local801 && Static56.anInt1566 == 0) {
								local822 = Static430.aClass113_2.method2868(local317).method4828(Static30.aClass3_Sub3_Sub2_1);
								if (local313 == 2) {
									Static491.method7315("<img=1>" + local535, local317, local535, 0, "<img=1>" + local537, 25, local822, null);
								} else if (local313 == 1) {
									Static491.method7315("<img=0>" + local535, local317, local535, 0, "<img=0>" + local537, 25, local822, null);
								} else {
									Static491.method7315(local535, local317, local535, 0, local537, 25, local822, null);
								}
							}
							Static61.aClass200_15 = null;
							return true;
						} else if (Static61.aClass200_15 == Static278.aClass200_70) {
							local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
							local73 = Static30.aClass3_Sub3_Sub2_1.method4209();
							local309 = Static30.aClass3_Sub3_Sub2_1.method4235();
							Static630.method8655();
							Static240.method8607(local73, local204, local309);
							Static61.aClass200_15 = null;
							return true;
						} else {
							@Pc(989) int local989;
							@Pc(996) int local996;
							@Pc(1471) int local1471;
							@Pc(959) int local959;
							@Pc(1387) boolean local1387;
							@Pc(1026) int local1026;
							@Pc(1034) int local1034;
							if (Static234.aClass200_59 == Static61.aClass200_15) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
								local73 = Static30.aClass3_Sub3_Sub2_1.method4222();
								local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
								local313 = Static30.aClass3_Sub3_Sub2_1.method4224();
								local317 = Static30.aClass3_Sub3_Sub2_1.method4225();
								local801 = (local317 & 0x80) != 0;
								local959 = local317 & 0x7;
								local557 = local317 >> 3 & 0xF;
								if (local557 == 15) {
									local557 = -1;
								}
								if (local313 >> 30 == 0) {
									@Pc(1189) Class361 local1189;
									@Pc(1141) Class361 local1141;
									@Pc(1128) Class145 local1128;
									if (local313 >> 29 != 0) {
										local561 = local313 & 0xFFFF;
										@Pc(1091) Class3_Sub28 local1091 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local561);
										if (local1091 != null) {
											@Pc(1096) Class4_Sub1_Sub2_Sub1_Sub1 local1096 = local1091.aClass4_Sub1_Sub2_Sub1_Sub1_2;
											if (local204 == 65535) {
												local204 = -1;
											}
											local569 = true;
											local571 = local801 ? local1096.anInt5717 : local1096.anInt5720;
											if (local204 != -1 && local571 != -1) {
												if (local571 == local204) {
													local1128 = Static275.aClass68_2.method2087(local204);
													if (local1128.aBoolean288 && local1128.anInt4224 != -1) {
														local1141 = Static115.aClass227_1.method5968(local1128.anInt4224);
														@Pc(1144) int local1144 = local1141.anInt9867;
														if (local1144 == 0 || local1144 == 2) {
															local569 = false;
														} else if (local1144 == 1) {
															local569 = true;
														}
													}
												} else {
													local1128 = Static275.aClass68_2.method2087(local204);
													@Pc(1174) Class145 local1174 = Static275.aClass68_2.method2087(local571);
													if (local1128.anInt4224 != -1 && local1174.anInt4224 != -1) {
														local1189 = Static115.aClass227_1.method5968(local1128.anInt4224);
														@Pc(1195) Class361 local1195 = Static115.aClass227_1.method5968(local1174.anInt4224);
														if (local1195.anInt9855 > local1189.anInt9855) {
															local569 = false;
														}
													}
												}
											}
											if (local569) {
												if (local801) {
													local1096.anInt5717 = local204;
													local1096.anInt5781 = local557;
													local1096.anInt5765 = 0;
													local1096.anInt5783 = 0;
													local1096.anInt5784 = local73;
													local1096.anInt5726 = 1;
													local1096.anInt5716 = Static101.anInt2262 + local309;
													local1096.anInt5756 = local959;
													if (Static101.anInt2262 < local1096.anInt5716) {
														local1096.anInt5765 = -1;
													}
													if (local1096.anInt5717 != -1 && local1096.anInt5716 == Static101.anInt2262) {
														local1034 = Static275.aClass68_2.method2087(local1096.anInt5717).anInt4224;
														if (local1034 != -1) {
															local1141 = Static115.aClass227_1.method5968(local1034);
															if (local1141 != null && local1141.anIntArray638 != null && !local1096.aBoolean405) {
																Static74.method1765(0, local1141, local1096);
															}
														}
													}
												} else {
													local1096.anInt5755 = Static101.anInt2262 + local309;
													local1096.anInt5714 = 0;
													local1096.anInt5720 = local204;
													local1096.anInt5713 = local959;
													local1096.anInt5769 = 1;
													local1096.anInt5719 = local557;
													local1096.anInt5736 = local73;
													local1096.anInt5752 = 0;
													if (Static101.anInt2262 < local1096.anInt5755) {
														local1096.anInt5714 = -1;
													}
													if (local1096.anInt5720 != -1 && Static101.anInt2262 == local1096.anInt5755) {
														local1034 = Static275.aClass68_2.method2087(local1096.anInt5720).anInt4224;
														if (local1034 != -1) {
															local1141 = Static115.aClass227_1.method5968(local1034);
															if (local1141 != null && local1141.anIntArray638 != null && !local1096.aBoolean405) {
																Static74.method1765(0, local1141, local1096);
															}
														}
													}
												}
											}
										}
									} else if (local313 >> 28 != 0) {
										local561 = local313 & 0xFFFF;
										@Pc(1372) Class4_Sub1_Sub2_Sub1_Sub2 local1372;
										if (local561 == Static97.anInt2234) {
											local1372 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2;
										} else {
											local1372 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local561];
										}
										if (local1372 != null) {
											if (local204 == 65535) {
												local204 = -1;
											}
											local1387 = true;
											local1026 = local801 ? local1372.anInt5717 : local1372.anInt5720;
											@Pc(1468) Class361 local1468;
											if (local204 != -1 && local1026 != -1) {
												@Pc(1410) Class145 local1410;
												if (local204 == local1026) {
													local1410 = Static275.aClass68_2.method2087(local204);
													if (local1410.aBoolean288 && local1410.anInt4224 != -1) {
														local1468 = Static115.aClass227_1.method5968(local1410.anInt4224);
														local1471 = local1468.anInt9867;
														if (local1471 == 0 || local1471 == 2) {
															local1387 = false;
														} else if (local1471 == 1) {
															local1387 = true;
														}
													}
												} else {
													local1410 = Static275.aClass68_2.method2087(local204);
													local1128 = Static275.aClass68_2.method2087(local1026);
													if (local1410.anInt4224 != -1 && local1128.anInt4224 != -1) {
														local1141 = Static115.aClass227_1.method5968(local1410.anInt4224);
														local1189 = Static115.aClass227_1.method5968(local1128.anInt4224);
														if (local1189.anInt9855 > local1141.anInt9855) {
															local1387 = false;
														}
													}
												}
											}
											if (local1387) {
												if (local801) {
													local1372.anInt5784 = local73;
													local1372.anInt5726 = 1;
													local1372.anInt5765 = 0;
													local1372.anInt5756 = local959;
													local1372.anInt5783 = 0;
													local1372.anInt5781 = local557;
													local1372.anInt5716 = local309 + Static101.anInt2262;
													local1372.anInt5717 = local204;
													if (Static101.anInt2262 < local1372.anInt5716) {
														local1372.anInt5765 = -1;
													}
													if (local1372.anInt5717 == 65535) {
														local1372.anInt5717 = -1;
													}
													if (local1372.anInt5717 != -1 && Static101.anInt2262 == local1372.anInt5716) {
														local571 = Static275.aClass68_2.method2087(local1372.anInt5717).anInt4224;
														if (local571 != -1) {
															local1468 = Static115.aClass227_1.method5968(local571);
															if (local1468 != null && local1468.anIntArray638 != null && !local1372.aBoolean405) {
																Static74.method1765(0, local1468, local1372);
															}
														}
													}
												} else {
													local1372.anInt5736 = local73;
													local1372.anInt5713 = local959;
													local1372.anInt5720 = local204;
													local1372.anInt5714 = 0;
													local1372.anInt5719 = local557;
													local1372.anInt5752 = 0;
													local1372.anInt5769 = 1;
													local1372.anInt5755 = Static101.anInt2262 + local309;
													if (Static101.anInt2262 < local1372.anInt5755) {
														local1372.anInt5714 = -1;
													}
													if (local1372.anInt5720 == 65535) {
														local1372.anInt5720 = -1;
													}
													if (local1372.anInt5720 != -1 && Static101.anInt2262 == local1372.anInt5755) {
														local571 = Static275.aClass68_2.method2087(local1372.anInt5720).anInt4224;
														if (local571 != -1) {
															local1468 = Static115.aClass227_1.method5968(local571);
															if (local1468 != null && local1468.anIntArray638 != null && !local1372.aBoolean405) {
																Static74.method1765(0, local1468, local1372);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local561 = local313 >> 28 & 0x3;
									local989 = (local313 >> 14 & 0x3FFF) - Static299.anInt5307;
									local996 = (local313 & 0x3FFF) - Static171.anInt3340;
									if (local989 >= 0 && local996 >= 0 && local989 < Static634.anInt10129 && Static638.anInt10172 > local996) {
										local1026 = local989 * 512 + 256;
										local571 = local996 * 512 + 256;
										local1034 = local561;
										if (local561 < 3 && Static486.method7232(local996, local989)) {
											local1034 = local561 + 1;
										}
										@Pc(1067) Class4_Sub1_Sub2_Sub5 local1067 = new Class4_Sub1_Sub2_Sub5(local204, local309, Static101.anInt2262, local561, local1034, local1026, Static192.method3263(local571, local1026, local561) - local73, local571, local989, local989, local996, local996, local959);
										Static108.aClass223_12.method5868(new Class3_Sub4_Sub19(local1067));
									}
								}
								Static61.aClass200_15 = null;
								return true;
							}
							@Pc(1676) String local1676;
							if (Static337.aClass200_88 == Static61.aClass200_15) {
								local1676 = Static30.aClass3_Sub3_Sub2_1.method4233();
								@Pc(1682) Object[] local1682 = new Object[local1676.length() + 1];
								for (local309 = local1676.length() - 1; local309 >= 0; local309--) {
									if (local1676.charAt(local309) == 's') {
										local1682[local309 + 1] = Static30.aClass3_Sub3_Sub2_1.method4233();
									} else {
										local1682[local309 + 1] = Integer.valueOf(Static30.aClass3_Sub3_Sub2_1.method4207());
									}
								}
								local1682[0] = Integer.valueOf(Static30.aClass3_Sub3_Sub2_1.method4207());
								Static630.method8655();
								@Pc(1736) Class3_Sub21 local1736 = new Class3_Sub21();
								local1736.anObjectArray1 = local1682;
								Static304.method4843(local1736);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static364.aClass200_112 == Static61.aClass200_15) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4236();
								local73 = Static30.aClass3_Sub3_Sub2_1.method4263();
								Static373.aClass150_1.method3825(local204, local73);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static564.aClass200_136 == Static61.aClass200_15) {
								Static639.method8721(Static63.aClass337_3);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static294.aClass200_76) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4236();
								local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
								Static630.method8655();
								Static175.method3055(local73, local204);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static456.aClass200_117 == Static61.aClass200_15) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
								Static465.aClass304_5 = Static205.aClass138_2.method3586(local204);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static484.aClass200_122) {
								@Pc(1824) int[] local1824 = new int[4];
								for (local73 = 0; local73 < 4; local73++) {
									local1824[local73] = Static30.aClass3_Sub3_Sub2_1.method4231();
								}
								local309 = Static30.aClass3_Sub3_Sub2_1.method4225();
								local313 = Static30.aClass3_Sub3_Sub2_1.method4236();
								@Pc(1855) Class3_Sub28 local1855 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local313);
								if (local1855 != null) {
									Static276.method4494(local309, local1855.aClass4_Sub1_Sub2_Sub1_Sub1_2, local1824);
								}
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static352.aClass200_93) {
								Static630.method8655();
								Static366.method5967();
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static376.aClass200_100) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4224();
								Static630.method8655();
								Static597.method8377(3, -1, -1, local204);
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static407.aClass200_108) {
								Static30.aClass3_Sub3_Sub2_1.anInt4736 += 28;
								if (Static30.aClass3_Sub3_Sub2_1.method4260()) {
									Static308.method5078(Static30.aClass3_Sub3_Sub2_1.anInt4736 - 28, Static30.aClass3_Sub3_Sub2_1);
								}
								Static61.aClass200_15 = null;
								return true;
							} else if (Static488.aClass200_123 == Static61.aClass200_15) {
								if (Static365.method5961(Static485.anInt8420)) {
									Static458.anInt8066 = (int) ((float) Static30.aClass3_Sub3_Sub2_1.method4221() * 2.5F);
								} else {
									Static458.anInt8066 = Static30.aClass3_Sub3_Sub2_1.method4221() * 30;
								}
								Static406.anInt7450 = Static371.anInt7006;
								Static61.aClass200_15 = null;
								return true;
							} else if (Static85.aClass200_19 == Static61.aClass200_15) {
								for (local204 = 0; local204 < Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1.length; local204++) {
									if (Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local204] != null) {
										Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local204].anIntArray306 = null;
										Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local204].anInt5718 = -1;
									}
								}
								for (local73 = 0; local73 < Static294.anInt5193; local73++) {
									Static28.aClass3_Sub28Array1[local73].aClass4_Sub1_Sub2_Sub1_Sub1_2.anIntArray306 = null;
									Static28.aClass3_Sub28Array1[local73].aClass4_Sub1_Sub2_Sub1_Sub1_2.anInt5718 = -1;
								}
								Static61.aClass200_15 = null;
								return true;
							} else if (Static61.aClass200_15 == Static515.aClass200_128) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4225();
								if (Static30.aClass3_Sub3_Sub2_1.method4225() == 0) {
									Static220.aClass212Array1[local204] = new Class212();
								} else {
									Static30.aClass3_Sub3_Sub2_1.anInt4736--;
									Static220.aClass212Array1[local204] = new Class212(Static30.aClass3_Sub3_Sub2_1);
								}
								Static16.anInt4340 = Static371.anInt7006;
								Static61.aClass200_15 = null;
								return true;
							} else if (Static362.aClass200_94 == Static61.aClass200_15) {
								local204 = Static30.aClass3_Sub3_Sub2_1.method4225();
								local73 = Static30.aClass3_Sub3_Sub2_1.method4263();
								local309 = Static30.aClass3_Sub3_Sub2_1.method4243();
								local313 = Static30.aClass3_Sub3_Sub2_1.method4221();
								local317 = Static30.aClass3_Sub3_Sub2_1.method4243();
								Static630.method8655();
								Static424.aBooleanArray19[local317] = true;
								Static106.anIntArray91[local317] = local73;
								Static636.anIntArray660[local317] = local204;
								Static446.anIntArray494[local317] = local309;
								Static293.anIntArray280[local317] = local313;
								Static61.aClass200_15 = null;
								return true;
							} else {
								@Pc(2133) int local2133;
								if (Static639.aClass200_150 == Static61.aClass200_15) {
									local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
									local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
									local394 = (local73 & 0x1) == 1;
									while (Static30.aClass3_Sub3_Sub2_1.anInt4736 < Static272.anInt4948) {
										local313 = Static30.aClass3_Sub3_Sub2_1.method4228();
										local317 = Static30.aClass3_Sub3_Sub2_1.method4221();
										local2133 = 0;
										if (local317 != 0) {
											local2133 = Static30.aClass3_Sub3_Sub2_1.method4225();
											if (local2133 == 255) {
												local2133 = Static30.aClass3_Sub3_Sub2_1.method4207();
											}
										}
										Static432.method6767(local204, local2133, local313, local394, local317 - 1);
									}
									Static382.anIntArray435[Static416.anInt7577++ & 0x1F] = local204;
									Static61.aClass200_15 = null;
									return true;
								} else if (Static287.aClass200_73 == Static61.aClass200_15) {
									Static4.anInt54 = Static30.aClass3_Sub3_Sub2_1.method4243();
									Static364.anInt7722 = Static30.aClass3_Sub3_Sub2_1.method4250() << 3;
									Static250.anInt4602 = Static30.aClass3_Sub3_Sub2_1.method4245() << 3;
									for (@Pc(2203) Class3_Sub51 local2203 = (Class3_Sub51) Static356.aClass280_28.method7110(); local2203 != null; local2203 = (Class3_Sub51) Static356.aClass280_28.method7108()) {
										local73 = (int) (local2203.aLong276 >> 28 & 0x3L);
										local309 = (int) (local2203.aLong276 & 0x3FFFL);
										local313 = local309 - Static299.anInt5307;
										local317 = (int) (local2203.aLong276 >> 14 & 0x3FFFL);
										local2133 = local317 - Static171.anInt3340;
										if (Static4.anInt54 == local73 && Static250.anInt4602 <= local313 && Static250.anInt4602 + 8 > local313 && Static364.anInt7722 <= local2133 && local2133 < Static364.anInt7722 + 8) {
											local2203.method8769();
											if (local313 >= 0 && local2133 >= 0 && Static634.anInt10129 > local313 && local2133 < Static638.anInt10172) {
												Static264.method4347(local2133, Static4.anInt54, local313);
											}
										}
									}
									for (@Pc(2308) Class3_Sub40 local2308 = (Class3_Sub40) Static229.aClass223_18.method5874(); local2308 != null; local2308 = (Class3_Sub40) Static229.aClass223_18.method5870()) {
										if (local2308.anInt7269 >= Static250.anInt4602 && Static250.anInt4602 + 8 > local2308.anInt7269 && local2308.anInt7265 >= Static364.anInt7722 && local2308.anInt7265 < Static364.anInt7722 + 8 && Static4.anInt54 == local2308.anInt7263) {
											local2308.anInt7272 = 0;
										}
									}
									Static61.aClass200_15 = null;
									return true;
								} else {
									@Pc(2421) Class3_Sub15 local2421;
									@Pc(2412) Class3_Sub15 local2412;
									if (Static329.aClass200_85 == Static61.aClass200_15) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4210();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4222();
										local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
										if (local309 == 65535) {
											local309 = -1;
										}
										local313 = Static30.aClass3_Sub3_Sub2_1.method4222();
										if (local313 == 65535) {
											local313 = -1;
										}
										Static630.method8655();
										for (local317 = local313; local317 <= local309; local317++) {
											local553 = (long) local317 + ((long) local204 << 32);
											local2412 = (Class3_Sub15) Static559.aClass280_44.method7107(local553);
											if (local2412 != null) {
												local2421 = new Class3_Sub15(local2412.anInt2466, local73);
												local2412.method8769();
											} else if (local317 == -1) {
												local2421 = new Class3_Sub15(Static433.method6771(local204).aClass3_Sub15_1.anInt2466, local73);
											} else {
												local2421 = new Class3_Sub15(0, local73);
											}
											Static559.aClass280_44.method7109(local2421, local553);
										}
										Static61.aClass200_15 = null;
										return true;
									}
									@Pc(2497) String local2497;
									@Pc(2487) String local2487;
									@Pc(2501) String local2501;
									if (Static54.aClass200_11 == Static61.aClass200_15) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4225();
										@Pc(2479) boolean local2479 = (local204 & 0x1) == 1;
										local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
										local2487 = Static30.aClass3_Sub3_Sub2_1.method4233();
										if (local2487.equals("")) {
											local2487 = local537;
										}
										local2497 = Static30.aClass3_Sub3_Sub2_1.method4233();
										local2501 = Static30.aClass3_Sub3_Sub2_1.method4233();
										if (local2501.equals("")) {
											local2501 = local2497;
										}
										if (local2479) {
											for (local959 = 0; local959 < Static222.anInt4237; local959++) {
												if (Static236.aStringArray17[local959].equals(local2501)) {
													Static553.aStringArray35[local959] = local537;
													Static236.aStringArray17[local959] = local2487;
													Static383.aStringArray26[local959] = local2497;
													Static145.aStringArray9[local959] = local2501;
													break;
												}
											}
										} else {
											Static553.aStringArray35[Static222.anInt4237] = local537;
											Static236.aStringArray17[Static222.anInt4237] = local2487;
											Static383.aStringArray26[Static222.anInt4237] = local2497;
											Static145.aStringArray9[Static222.anInt4237] = local2501;
											Static258.aBooleanArray14[Static222.anInt4237] = (local204 & 0x2) == 2;
											Static222.anInt4237++;
										}
										Static61.aClass200_15 = null;
										Static258.anInt4764 = Static371.anInt7006;
										return true;
									} else if (Static61.aClass200_15 == Static555.aClass200_134) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4228();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
										local309 = Static30.aClass3_Sub3_Sub2_1.method4225();
										local2487 = "";
										local2497 = local2487;
										if ((local309 & 0x1) != 0) {
											local2487 = Static30.aClass3_Sub3_Sub2_1.method4233();
											if ((local309 & 0x2) == 0) {
												local2497 = local2487;
											} else {
												local2497 = Static30.aClass3_Sub3_Sub2_1.method4233();
											}
										}
										local2501 = Static30.aClass3_Sub3_Sub2_1.method4233();
										if (local204 == 99) {
											Static410.method6501(local2501);
										} else if (local2497.equals("") || !Static201.method3498(local2497)) {
											Static582.method8231(local2501, local2487, local204, local73, local2497, local2487);
										} else {
											Static61.aClass200_15 = null;
											return true;
										}
										Static61.aClass200_15 = null;
										return true;
									} else if (Static346.aClass200_92 == Static61.aClass200_15) {
										Static639.method8721(Static67.aClass337_4);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static30.aClass200_5) {
										if (Static4.aFrame1 != null) {
											Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
										}
										@Pc(2692) byte[] local2692 = new byte[Static272.anInt4948];
										Static30.aClass3_Sub3_Sub2_1.method4268(local2692, Static272.anInt4948);
										local535 = Static89.method2004(local2692, Static272.anInt4948, 0);
										Static442.method6898(true, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 1, local535, Static205.aClass138_2);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static245.aClass200_62) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4222();
										if (local73 == 65535) {
											local73 = -1;
										}
										Static630.method8655();
										Static21.method963(local73, local204);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static382.aClass200_103 == Static61.aClass200_15) {
										Static382.anInt7176 = Static30.aClass3_Sub3_Sub2_1.method4247();
										Static134.aBoolean181 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static545.aClass200_143) {
										Static222.anInt4237 = Static30.aClass3_Sub3_Sub2_1.method4225();
										for (local204 = 0; local204 < Static222.anInt4237; local204++) {
											Static553.aStringArray35[local204] = Static30.aClass3_Sub3_Sub2_1.method4233();
											Static236.aStringArray17[local204] = Static30.aClass3_Sub3_Sub2_1.method4233();
											if (Static236.aStringArray17[local204].equals("")) {
												Static236.aStringArray17[local204] = Static553.aStringArray35[local204];
											}
											Static383.aStringArray26[local204] = Static30.aClass3_Sub3_Sub2_1.method4233();
											Static145.aStringArray9[local204] = Static30.aClass3_Sub3_Sub2_1.method4233();
											if (Static145.aStringArray9[local204].equals("")) {
												Static145.aStringArray9[local204] = Static383.aStringArray26[local204];
											}
											Static258.aBooleanArray14[local204] = false;
										}
										Static61.aClass200_15 = null;
										Static258.anInt4764 = Static371.anInt7006;
										return true;
									} else if (Static166.aClass200_37 == Static61.aClass200_15) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
										local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
										Static630.method8655();
										Static311.method6190(local204, local535);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static638.aClass200_148) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4223();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
										Static630.method8655();
										Static556.method8019(local73, local204);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static422.aClass200_110) {
										Static373.aClass150_1.method3826();
										Static61.aClass200_15 = null;
										Static231.anInt4366 += 32;
										return true;
									} else if (Static61.aClass200_15 == Static150.aClass200_29) {
										Static368.anInt6963 = Static30.aClass3_Sub3_Sub2_1.method4263();
										Static442.anInt7936 = Static30.aClass3_Sub3_Sub2_1.method4259();
										Static61.aClass200_15 = null;
										return true;
									} else if (Static82.aClass200_18 == Static61.aClass200_15) {
										local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
										local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
										local537 = local535;
										if (local238) {
											local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
										}
										local548 = Static30.aClass3_Sub3_Sub2_1.method4221();
										local553 = Static30.aClass3_Sub3_Sub2_1.method4204();
										local557 = Static30.aClass3_Sub3_Sub2_1.method4225();
										@Pc(2970) long local2970 = (local548 << 32) + local553;
										local1387 = false;
										local1026 = 0;
										while (true) {
											if (local1026 >= 100) {
												if (local557 <= 1) {
													if (Static134.aBoolean181 && !Static12.aBoolean56 || Static512.aBoolean628) {
														local1387 = true;
													} else if (Static201.method3498(local537)) {
														local1387 = true;
													}
												}
												break;
											}
											if (Static168.aLongArray12[local1026] == local2970) {
												local1387 = true;
												break;
											}
											local1026++;
										}
										if (!local1387 && Static56.anInt1566 == 0) {
											Static168.aLongArray12[Static302.anInt5359] = local2970;
											Static302.anInt5359 = (Static302.anInt5359 + 1) % 100;
											@Pc(3031) String local3031 = Static305.method4859(Static512.method7641(Static30.aClass3_Sub3_Sub2_1));
											if (local557 == 2) {
												Static491.method7315("<img=1>" + local535, -1, local535, 0, "<img=1>" + local537, 7, local3031, null);
											} else if (local557 == 1) {
												Static491.method7315("<img=0>" + local535, -1, local535, 0, "<img=0>" + local537, 7, local3031, null);
											} else {
												Static491.method7315(local535, -1, local535, 0, local537, 3, local3031, null);
											}
										}
										Static61.aClass200_15 = null;
										return true;
									} else if (Static100.aClass200_22 == Static61.aClass200_15) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4235();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4210();
										Static630.method8655();
										Static272.method4459(local204, local73);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static61.aClass200_15 == Static205.aClass200_50) {
										local204 = Static30.aClass3_Sub3_Sub2_1.method4223();
										local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
										local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
										if (local309 == 65535) {
											local309 = -1;
										}
										Static630.method8655();
										Static174.method3045(local309, local204, local73);
										@Pc(3156) Class38 local3156 = Static320.aClass53_2.method1770(local309);
										Static474.method7125(local3156.anInt1433, local73, local3156.anInt1484, local3156.anInt1469);
										Static433.method6769(local3156.anInt1478, local73, local3156.anInt1441, local3156.anInt1436);
										Static61.aClass200_15 = null;
										return true;
									} else if (Static622.aClass200_146 == Static61.aClass200_15) {
										Static639.method8721(Static51.aClass337_2);
										Static61.aClass200_15 = null;
										return true;
									} else {
										@Pc(3232) boolean local3232;
										if (Static61.aClass200_15 == Static537.aClass200_132) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
											@Pc(3206) Class4_Sub1_Sub2_Sub1_Sub2 local3206;
											if (Static97.anInt2234 == local204) {
												local3206 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2;
											} else {
												local3206 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local204];
											}
											if (local3206 == null) {
												Static61.aClass200_15 = null;
												return true;
											}
											local309 = Static30.aClass3_Sub3_Sub2_1.method4221();
											local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
											local3232 = (local309 & 0x8000) != 0;
											if (local3206.aString63 != null && local3206.aClass178_1 != null) {
												local801 = false;
												if (local313 <= 1) {
													if (!local3232 && (Static134.aBoolean181 && !Static12.aBoolean56 || Static512.aBoolean628)) {
														local801 = true;
													} else if (Static201.method3498(local3206.aString63)) {
														local801 = true;
													}
												}
												if (!local801 && Static56.anInt1566 == 0) {
													local557 = -1;
													if (local3232) {
														local309 &= 0x7FFF;
														@Pc(3288) Class61 local3288 = Static423.method6627(Static30.aClass3_Sub3_Sub2_1);
														local557 = local3288.anInt2092;
														local822 = local3288.aClass3_Sub4_Sub16_1.method4828(Static30.aClass3_Sub3_Sub2_1);
													} else {
														local822 = Static305.method4859(Static512.method7641(Static30.aClass3_Sub3_Sub2_1));
													}
													local3206.aString62 = local822.trim();
													local3206.anInt5747 = 150;
													local3206.anInt5761 = local309 & 0xFF;
													local3206.anInt5785 = local309 >> 8;
													if (local313 == 1 || local313 == 2) {
														local561 = local3232 ? 17 : 1;
													} else {
														local561 = local3232 ? 17 : 2;
													}
													if (local313 == 2) {
														Static491.method7315("<img=1>" + local3206.method5089(), local557, local3206.aString64, 0, "<img=1>" + local3206.method5086(), local561, local822, null);
													} else if (local313 == 1) {
														Static491.method7315("<img=0>" + local3206.method5089(), local557, local3206.aString64, 0, "<img=0>" + local3206.method5086(), local561, local822, null);
													} else {
														Static491.method7315(local3206.method5089(), local557, local3206.aString64, 0, local3206.method5086(), local561, local822, null);
													}
												}
											}
											Static61.aClass200_15 = null;
											return true;
										} else if (Static394.aClass200_106 == Static61.aClass200_15) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4210();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4231();
											local309 = Static30.aClass3_Sub3_Sub2_1.method4231();
											Static630.method8655();
											Static365.method5965(local204, local309 + (local73 << 16));
											Static61.aClass200_15 = null;
											return true;
										} else if (Static215.aClass200_53 == Static61.aClass200_15) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4259();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4259();
											local309 = Static30.aClass3_Sub3_Sub2_1.method4224();
											Static532.anIntArray576[local204] = local309;
											Static505.anIntArray538[local204] = local73;
											Static93.anIntArray82[local204] = 1;
											local313 = Static8.anIntArray9[local204] - 1;
											for (local317 = 0; local317 < local313; local317++) {
												if (Class148.anIntArray221[local317] <= local309) {
													Static93.anIntArray82[local204] = local317 + 2;
												}
											}
											Static324.anIntArray508[Static159.anInt3137++ & 0x1F] = local204;
											Static61.aClass200_15 = null;
											return true;
										} else if (Static517.aClass200_129 == Static61.aClass200_15) {
											Static439.method6845(false);
											Static61.aClass200_15 = null;
											return false;
										} else if (Static61.aClass200_15 == Static174.aClass200_39) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4225();
											local73 = local204 >> 5;
											local309 = local204 & 0x1F;
											if (local309 == 0) {
												Static82.aClass251Array1[local73] = null;
												Static61.aClass200_15 = null;
												return true;
											}
											@Pc(3564) Class251 local3564 = new Class251();
											local3564.anInt7476 = local309;
											local3564.anInt7480 = Static30.aClass3_Sub3_Sub2_1.method4225();
											if (local3564.anInt7480 >= 0 && local3564.anInt7480 < Static203.aClass24Array9.length) {
												if (local3564.anInt7476 == 1 || local3564.anInt7476 == 10) {
													local3564.anInt7486 = Static30.aClass3_Sub3_Sub2_1.method4221();
													Static30.aClass3_Sub3_Sub2_1.anInt4736 += 6;
												} else if (local3564.anInt7476 >= 2 && local3564.anInt7476 <= 6) {
													if (local3564.anInt7476 == 2) {
														local3564.anInt7477 = 256;
														local3564.anInt7487 = 256;
													}
													if (local3564.anInt7476 == 3) {
														local3564.anInt7487 = 0;
														local3564.anInt7477 = 256;
													}
													if (local3564.anInt7476 == 4) {
														local3564.anInt7477 = 256;
														local3564.anInt7487 = 512;
													}
													if (local3564.anInt7476 == 5) {
														local3564.anInt7487 = 256;
														local3564.anInt7477 = 0;
													}
													if (local3564.anInt7476 == 6) {
														local3564.anInt7477 = 512;
														local3564.anInt7487 = 256;
													}
													local3564.anInt7476 = 2;
													local3564.anInt7478 = Static30.aClass3_Sub3_Sub2_1.method4225();
													local3564.anInt7487 += Static30.aClass3_Sub3_Sub2_1.method4221() - Static299.anInt5307 << 9;
													local3564.anInt7477 += Static30.aClass3_Sub3_Sub2_1.method4221() - Static171.anInt3340 << 9;
													local3564.anInt7481 = Static30.aClass3_Sub3_Sub2_1.method4225() << 2;
													local3564.anInt7485 = Static30.aClass3_Sub3_Sub2_1.method4221();
												}
												local3564.anInt7488 = Static30.aClass3_Sub3_Sub2_1.method4221();
												if (local3564.anInt7488 == 65535) {
													local3564.anInt7488 = -1;
												}
												Static82.aClass251Array1[local73] = local3564;
											}
											Static61.aClass200_15 = null;
											return true;
										} else if (Static158.aClass200_34 == Static61.aClass200_15) {
											Static266.method4392();
											Static61.aClass200_15 = null;
											return false;
										} else if (Static456.aClass200_116 == Static61.aClass200_15) {
											local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
											local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
											local537 = local535;
											if (local238) {
												local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
											}
											local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
											local3232 = false;
											if (local313 <= 1) {
												if (Static134.aBoolean181 && !Static12.aBoolean56 || Static512.aBoolean628) {
													local3232 = true;
												} else if (local313 <= 1 && Static201.method3498(local537)) {
													local3232 = true;
												}
											}
											if (!local3232 && Static56.anInt1566 == 0) {
												local2501 = Static305.method4859(Static512.method7641(Static30.aClass3_Sub3_Sub2_1));
												if (local313 == 2) {
													Static491.method7315("<img=1>" + local535, -1, local535, 0, "<img=1>" + local537, 24, local2501, null);
												} else if (local313 == 1) {
													Static491.method7315("<img=0>" + local535, -1, local535, 0, "<img=0>" + local537, 24, local2501, null);
												} else {
													Static491.method7315(local535, -1, local535, 0, local537, 24, local2501, null);
												}
											}
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static284.aClass200_72) {
											Static639.method8721(Static242.aClass337_7);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static155.aClass200_32 == Static61.aClass200_15) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4243();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
											local309 = Static30.aClass3_Sub3_Sub2_1.method4222();
											if (local309 == 65535) {
												local309 = -1;
											}
											Static43.method1369(local204, local73, local309);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static186.aClass200_45) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4259();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4217();
											local309 = Static30.aClass3_Sub3_Sub2_1.method4222();
											if (local309 == 65535) {
												local309 = -1;
											}
											Static200.method3478(local309, local204, local73);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static626.aClass200_147) {
											Static639.method8721(Static207.aClass337_6);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static481.aClass200_121) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4222();
											if (local204 == 65535) {
												local204 = -1;
											}
											local73 = Static30.aClass3_Sub3_Sub2_1.method4243();
											local309 = local73 >> 2;
											local313 = local73 & 0x3;
											local317 = Static410.anIntArray458[local309];
											local2133 = Static30.aClass3_Sub3_Sub2_1.method4224();
											local959 = local2133 >> 28 & 0x3;
											local557 = local2133 >> 14 & 0x3FFF;
											local561 = local2133 & 0x3FFF;
											local557 -= Static299.anInt5307;
											local561 -= Static171.anInt3340;
											Static73.method1758(local959, local313, local557, local204, local309, local317, local561);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static319.aClass200_83 == Static61.aClass200_15) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4236();
											local309 = Static30.aClass3_Sub3_Sub2_1.method4222();
											local313 = Static30.aClass3_Sub3_Sub2_1.method4236();
											Static630.method8655();
											Static474.method7125(local73, local204, local313, local309);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static58.aClass200_14) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4224();
											Static630.method8655();
											Static61.aClass200_15 = null;
											if (local204 == -1) {
												Static331.anInt6175 = -1;
												Static530.anInt9071 = -1;
											} else {
												local73 = local204 >> 14 & 0x3FFF;
												local73 -= Static299.anInt5307;
												local309 = local204 & 0x3FFF;
												local309 -= Static171.anInt3340;
												if (local73 < 0) {
													local73 = 0;
												} else if (Static634.anInt10129 <= local73) {
													local73 = Static634.anInt10129;
												}
												if (local309 < 0) {
													local309 = 0;
												} else if (local309 >= Static638.anInt10172) {
													local309 = Static638.anInt10172;
												}
												Static530.anInt9071 = (local73 << 9) + 256;
												Static331.anInt6175 = (local309 << 9) + 256;
											}
											return true;
										} else if (Static108.aClass200_23 == Static61.aClass200_15) {
											Static61.aClass200_15 = null;
											Static258.anInt4764 = Static371.anInt7006;
											Static311.anInt7186 = 1;
											return true;
										} else if (Static475.aClass200_120 == Static61.aClass200_15) {
											local204 = Static30.aClass3_Sub3_Sub2_1.method4243();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4263();
											if (local204 == 255) {
												local73 = -1;
												local204 = -1;
											}
											Static503.method7432(local204, local73);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static56.aClass200_13 == Static61.aClass200_15) {
											@Pc(4177) byte local4177 = Static30.aClass3_Sub3_Sub2_1.method4239();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
											Static373.aClass150_1.method3823(local4177, local73);
											Static61.aClass200_15 = null;
											return true;
										} else if (Static26.aClass200_3 == Static61.aClass200_15) {
											Static630.method8655();
											Static329.method5384();
											Static61.aClass200_15 = null;
											return true;
										} else if (Static61.aClass200_15 == Static436.aClass200_113) {
											Static51.method1471(Static30.aClass3_Sub3_Sub2_1.method4233());
											Static61.aClass200_15 = null;
											return true;
										} else if (Static214.aClass200_52 == Static61.aClass200_15) {
											local1676 = Static30.aClass3_Sub3_Sub2_1.method4233();
											local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
											local537 = Static430.aClass113_2.method2868(local73).method4828(Static30.aClass3_Sub3_Sub2_1);
											Static491.method7315(local1676, local73, local1676, 0, local1676, 19, local537, null);
											Static61.aClass200_15 = null;
											return true;
										} else {
											@Pc(4287) long local4287;
											if (Static61.aClass200_15 == Static248.aClass200_64) {
												local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
												local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
												local537 = local535;
												if (local238) {
													local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
												}
												local548 = Static30.aClass3_Sub3_Sub2_1.method4246();
												local553 = Static30.aClass3_Sub3_Sub2_1.method4221();
												local4287 = Static30.aClass3_Sub3_Sub2_1.method4204();
												local989 = Static30.aClass3_Sub3_Sub2_1.method4225();
												@Pc(4297) long local4297 = (local553 << 32) + local4287;
												@Pc(4299) boolean local4299 = false;
												local1034 = 0;
												while (true) {
													if (local1034 >= 100) {
														if (local989 <= 1) {
															if (Static134.aBoolean181 && !Static12.aBoolean56 || Static512.aBoolean628) {
																local4299 = true;
															} else if (Static201.method3498(local537)) {
																local4299 = true;
															}
														}
														break;
													}
													if (local4297 == Static168.aLongArray12[local1034]) {
														local4299 = true;
														break;
													}
													local1034++;
												}
												if (!local4299 && Static56.anInt1566 == 0) {
													Static168.aLongArray12[Static302.anInt5359] = local4297;
													Static302.anInt5359 = (Static302.anInt5359 + 1) % 100;
													@Pc(4365) String local4365 = Static305.method4859(Static512.method7641(Static30.aClass3_Sub3_Sub2_1));
													if (local989 == 2 || local989 == 3) {
														Static491.method7315("<img=1>" + local535, -1, local535, 0, "<img=1>" + local537, 9, local4365, Static629.method8652(local548));
													} else if (local989 == 1) {
														Static491.method7315("<img=0>" + local535, -1, local535, 0, "<img=0>" + local537, 9, local4365, Static629.method8652(local548));
													} else {
														Static491.method7315(local535, -1, local535, 0, local537, 9, local4365, Static629.method8652(local548));
													}
												}
												Static61.aClass200_15 = null;
												return true;
											} else if (Static61.aClass200_15 == Static409.aClass200_109) {
												Static639.method8721(Static47.aClass337_1);
												Static61.aClass200_15 = null;
												return true;
											} else {
												@Pc(4481) Class3_Sub29 local4481;
												if (Static210.aClass200_51 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4243();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4210();
													local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
													Static630.method8655();
													local4481 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local73);
													if (local4481 != null) {
														Static54.method1546(local4481.anInt4601 != local309, false, local4481);
													}
													Static502.method7412(local73, local309, false, local204);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static377.aClass200_101 == Static61.aClass200_15) {
													Static639.method8721(Static377.aClass337_10);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static221.aClass200_56) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4224();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4222();
													local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
													local313 = Static30.aClass3_Sub3_Sub2_1.method4222();
													Static630.method8655();
													Static597.method8377(7, local73 << 16 | local309, local313, local204);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static256.aClass200_66) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
													Static630.method8655();
													@Pc(4572) Class3_Sub29 local4572 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local204);
													local4481 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local73);
													if (local4481 != null) {
														Static54.method1546(local4572 == null || local4481.anInt4601 != local4572.anInt4601, false, local4481);
													}
													if (local4572 != null) {
														local4572.method8769();
														Static356.aClass280_29.method7109(local4572, (long) local73);
													}
													@Pc(4610) Class279 local4610 = Static433.method6771(local204);
													if (local4610 != null) {
														Static482.method7193(local4610);
													}
													local4610 = Static433.method6771(local73);
													if (local4610 != null) {
														Static482.method7193(local4610);
														Static5.method3192(local4610, true);
													}
													if (Static307.anInt5465 != -1) {
														Static596.method8356(1, Static307.anInt5465);
													}
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static346.aClass200_91) {
													Static195.method3396();
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static155.aClass200_31) {
													Static231.method3855(Static30.aClass3_Sub3_Sub2_1, Static272.anInt4948);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static183.aClass200_44 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
													if (local204 == 65535) {
														local204 = -1;
													}
													local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
													local309 = Static30.aClass3_Sub3_Sub2_1.method4221();
													local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
													local317 = Static30.aClass3_Sub3_Sub2_1.method4221();
													Static533.method7799(local73, local204, local309, false, local317, local313);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static555.aClass200_135) {
													Static639.method8721(Static580.aClass337_14);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static394.aClass200_105 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4210();
													local309 = Static30.aClass3_Sub3_Sub2_1.method4223();
													Static630.method8655();
													Static597.method8377(5, local204, local309, local73);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static61.aClass200_15 == Static375.aClass200_99) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
													local394 = (local73 & 0x1) == 1;
													Static287.method4606(local204, local394);
													local313 = Static30.aClass3_Sub3_Sub2_1.method4221();
													for (local317 = 0; local317 < local313; local317++) {
														local2133 = Static30.aClass3_Sub3_Sub2_1.method4263();
														if (local2133 == 255) {
															local2133 = Static30.aClass3_Sub3_Sub2_1.method4223();
														}
														local959 = Static30.aClass3_Sub3_Sub2_1.method4236();
														Static432.method6767(local204, local2133, local317, local394, local959 - 1);
													}
													Static382.anIntArray435[Static416.anInt7577++ & 0x1F] = local204;
													Static61.aClass200_15 = null;
													return true;
												} else if (Static371.aClass200_98 == Static61.aClass200_15) {
													Static61.aClass200_15 = null;
													return false;
												} else if (Static219.aClass200_54 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
													local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
													Static630.method8655();
													Static342.method5733(local204, local73);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static534.aClass200_131 == Static61.aClass200_15) {
													Static123.aString17 = Static272.anInt4948 <= 2 ? Static59.aClass43_26.method1598(Static325.anInt6083) : Static30.aClass3_Sub3_Sub2_1.method4233();
													Static524.anInt8435 = Static272.anInt4948 <= 0 ? -1 : Static30.aClass3_Sub3_Sub2_1.method4221();
													Static61.aClass200_15 = null;
													if (Static524.anInt8435 == 65535) {
														Static524.anInt8435 = -1;
													}
													return true;
												} else if (Static150.aClass200_30 == Static61.aClass200_15) {
													Static4.anInt54 = Static30.aClass3_Sub3_Sub2_1.method4243();
													Static250.anInt4602 = Static30.aClass3_Sub3_Sub2_1.method4254() << 3;
													Static364.anInt7722 = Static30.aClass3_Sub3_Sub2_1.method4245() << 3;
													while (Static272.anInt4948 > Static30.aClass3_Sub3_Sub2_1.anInt4736) {
														@Pc(4907) Class337 local4907 = Static598.method8383()[Static30.aClass3_Sub3_Sub2_1.method4225()];
														Static639.method8721(local4907);
													}
													Static61.aClass200_15 = null;
													return true;
												} else if (Static145.aClass200_27 == Static61.aClass200_15) {
													Static51.anInt1431 = Static30.aClass3_Sub3_Sub2_1.method4225();
													Static61.aClass200_15 = null;
													return true;
												} else if (Static76.aClass200_17 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
													local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
													Static630.method8655();
													Static49.method1445(local204, local535);
													Static61.aClass200_15 = null;
													return true;
												} else if (Static242.aClass200_61 == Static61.aClass200_15) {
													local204 = Static30.aClass3_Sub3_Sub2_1.method4222();
													if (local204 == 65535) {
														local204 = -1;
													}
													local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
													local309 = Static30.aClass3_Sub3_Sub2_1.method4243();
													local2487 = Static30.aClass3_Sub3_Sub2_1.method4233();
													if (local309 >= 1 && local309 <= 8) {
														if (local2487.equalsIgnoreCase("null")) {
															local2487 = null;
														}
														Static602.aStringArray37[local309 - 1] = local2487;
														Static429.anIntArray473[local309 - 1] = local204;
														Static225.aBooleanArray22[local309 - 1] = local73 == 0;
													}
													Static61.aClass200_15 = null;
													return true;
												} else {
													@Pc(5196) boolean local5196;
													@Pc(5219) Class69 local5219;
													if (Static61.aClass200_15 == Static179.aClass200_41) {
														Static337.anInt6314 = Static371.anInt7006;
														if (Static272.anInt4948 == 0) {
															Static61.aClass200_15 = null;
															Static212.aString50 = null;
															Static469.aClass69Array1 = null;
															Static68.aString7 = null;
															Static70.anInt6477 = 0;
															return true;
														}
														Static68.aString7 = Static30.aClass3_Sub3_Sub2_1.method4233();
														local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
														if (local238) {
															Static30.aClass3_Sub3_Sub2_1.method4233();
														}
														@Pc(5068) long local5068 = Static30.aClass3_Sub3_Sub2_1.method4246();
														Static212.aString50 = Static171.method3001(local5068);
														Static434.aByte106 = Static30.aClass3_Sub3_Sub2_1.method4254();
														local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
														if (local313 == 255) {
															Static61.aClass200_15 = null;
															return true;
														}
														Static70.anInt6477 = local313;
														@Pc(5094) Class69[] local5094 = new Class69[100];
														for (local2133 = 0; local2133 < Static70.anInt6477; local2133++) {
															local5094[local2133] = new Class69();
															local5094[local2133].aString14 = Static30.aClass3_Sub3_Sub2_1.method4233();
															local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
															if (local238) {
																local5094[local2133].aString12 = Static30.aClass3_Sub3_Sub2_1.method4233();
															} else {
																local5094[local2133].aString12 = local5094[local2133].aString14;
															}
															local5094[local2133].aString13 = Static22.method978(local5094[local2133].aString12);
															local5094[local2133].anInt2207 = Static30.aClass3_Sub3_Sub2_1.method4221();
															local5094[local2133].aByte22 = Static30.aClass3_Sub3_Sub2_1.method4254();
															local5094[local2133].aString15 = Static30.aClass3_Sub3_Sub2_1.method4233();
															if (local5094[local2133].aString12.equals(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63)) {
																Static22.aByte7 = local5094[local2133].aByte22;
															}
														}
														local561 = Static70.anInt6477;
														while (local561 > 0) {
															local561--;
															local5196 = true;
															for (local989 = 0; local989 < local561; local989++) {
																if (local5094[local989].aString13.compareTo(local5094[local989 + 1].aString13) > 0) {
																	local5219 = local5094[local989];
																	local5094[local989] = local5094[local989 + 1];
																	local5094[local989 + 1] = local5219;
																	local5196 = false;
																}
															}
															if (local5196) {
																break;
															}
														}
														Static61.aClass200_15 = null;
														Static469.aClass69Array1 = local5094;
														return true;
													} else if (Static174.aClass200_40 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
														Static630.method8655();
														Static308.method5077(local73, local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static232.aClass200_58) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4263();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
														Static630.method8655();
														Static226.method1814(local73, local204, true);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static40.aClass200_6) {
														Static639.method8721(Static302.aClass337_9);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static495.aClass200_125 == Static61.aClass200_15) {
														Static199.anInt3922 = Static30.aClass3_Sub3_Sub2_1.method4225();
														Static406.anInt7450 = Static371.anInt7006;
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static299.aClass200_78) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4263();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4263();
														local309 = Static30.aClass3_Sub3_Sub2_1.method4236() << 2;
														local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
														local317 = Static30.aClass3_Sub3_Sub2_1.method4225();
														Static630.method8655();
														Static27.method1052(local317, local204, local309, local73, local313);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static439.aClass200_114 == Static61.aClass200_15) {
														local1676 = Static30.aClass3_Sub3_Sub2_1.method4233();
														local394 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
														if (local394) {
															local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
														} else {
															local535 = local1676;
														}
														local313 = Static30.aClass3_Sub3_Sub2_1.method4221();
														@Pc(5396) byte local5396 = Static30.aClass3_Sub3_Sub2_1.method4254();
														local801 = false;
														if (local5396 == -128) {
															local801 = true;
														}
														if (local801) {
															if (Static70.anInt6477 == 0) {
																Static61.aClass200_15 = null;
																return true;
															}
															for (local959 = 0; local959 < Static70.anInt6477 && (!Static469.aClass69Array1[local959].aString12.equals(local535) || Static469.aClass69Array1[local959].anInt2207 != local313); local959++) {
															}
															if (Static70.anInt6477 > local959) {
																while (local959 < Static70.anInt6477 - 1) {
																	Static469.aClass69Array1[local959] = Static469.aClass69Array1[local959 + 1];
																	local959++;
																}
																Static70.anInt6477--;
																Static469.aClass69Array1[Static70.anInt6477] = null;
															}
														} else {
															local822 = Static30.aClass3_Sub3_Sub2_1.method4233();
															local5219 = new Class69();
															local5219.aString14 = local1676;
															local5219.aString12 = local535;
															local5219.aString13 = Static22.method978(local5219.aString12);
															local5219.aByte22 = local5396;
															local5219.aString15 = local822;
															local5219.anInt2207 = local313;
															for (local561 = Static70.anInt6477 - 1; local561 >= 0; local561--) {
																local989 = Static469.aClass69Array1[local561].aString13.compareTo(local5219.aString13);
																if (local989 == 0) {
																	Static469.aClass69Array1[local561].anInt2207 = local313;
																	Static469.aClass69Array1[local561].aByte22 = local5396;
																	Static469.aClass69Array1[local561].aString15 = local822;
																	if (local535.equals(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63)) {
																		Static22.aByte7 = local5396;
																	}
																	Static61.aClass200_15 = null;
																	Static337.anInt6314 = Static371.anInt7006;
																	return true;
																}
																if (local989 < 0) {
																	break;
																}
															}
															if (Static469.aClass69Array1.length <= Static70.anInt6477) {
																Static61.aClass200_15 = null;
																return true;
															}
															for (local989 = Static70.anInt6477 - 1; local989 > local561; local989--) {
																Static469.aClass69Array1[local989 + 1] = Static469.aClass69Array1[local989];
															}
															if (Static70.anInt6477 == 0) {
																Static469.aClass69Array1 = new Class69[100];
															}
															Static469.aClass69Array1[local561 + 1] = local5219;
															Static70.anInt6477++;
															if (local535.equals(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63)) {
																Static22.aByte7 = local5396;
															}
														}
														Static337.anInt6314 = Static371.anInt7006;
														Static61.aClass200_15 = null;
														return true;
													} else if (Static43.aClass200_7 == Static61.aClass200_15) {
														Static258.method4297(Static272.anInt4948, Static30.aClass3_Sub3_Sub2_1, Static205.aClass138_2);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static193.aClass200_48 == Static61.aClass200_15) {
														@Pc(5708) boolean local5708;
														while (Static30.aClass3_Sub3_Sub2_1.anInt4736 < Static272.anInt4948) {
															local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
															local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
															local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
															local313 = Static30.aClass3_Sub3_Sub2_1.method4221();
															local317 = Static30.aClass3_Sub3_Sub2_1.method4225();
															local2501 = "";
															local5196 = false;
															if (local313 > 0) {
																local2501 = Static30.aClass3_Sub3_Sub2_1.method4233();
																local5196 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
															}
															for (local557 = 0; local557 < Static68.anInt1696; local557++) {
																if (local238) {
																	if (local537.equals(Static422.aStringArray29[local557])) {
																		Static422.aStringArray29[local557] = local535;
																		local535 = null;
																		Static159.aStringArray13[local557] = local537;
																		break;
																	}
																} else if (local535.equals(Static422.aStringArray29[local557])) {
																	if (Static117.anIntArray105[local557] != local313) {
																		local5708 = true;
																		for (@Pc(5713) Class4_Sub2_Sub1 local5713 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2966(); local5713 != null; local5713 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2962()) {
																			if (local5713.aString53.equals(local535)) {
																				if (local313 != 0 && local5713.aShort59 == 0) {
																					local5708 = false;
																					local5713.method7841();
																				} else if (local313 == 0 && local5713.aShort59 != 0) {
																					local5713.method7841();
																					local5708 = false;
																				}
																			}
																		}
																		if (local5708) {
																			Static643.aClass120_9.method2960(new Class4_Sub2_Sub1(local535, local313));
																		}
																		Static117.anIntArray105[local557] = local313;
																	}
																	Static159.aStringArray13[local557] = local537;
																	Static159.aStringArray14[local557] = local2501;
																	Static153.anIntArray145[local557] = local317;
																	local535 = null;
																	Static301.aBooleanArray15[local557] = local5196;
																	break;
																}
															}
															if (local535 != null && Static68.anInt1696 < 200) {
																Static422.aStringArray29[Static68.anInt1696] = local535;
																Static159.aStringArray13[Static68.anInt1696] = local537;
																Static117.anIntArray105[Static68.anInt1696] = local313;
																Static159.aStringArray14[Static68.anInt1696] = local2501;
																Static153.anIntArray145[Static68.anInt1696] = local317;
																Static301.aBooleanArray15[Static68.anInt1696] = local5196;
																Static68.anInt1696++;
															}
														}
														Static258.anInt4764 = Static371.anInt7006;
														Static311.anInt7186 = 2;
														local73 = Static68.anInt1696;
														while (local73 > 0) {
															local73--;
															local238 = true;
															for (local309 = 0; local309 < local73; local309++) {
																if (Static4.aClass363_1.anInt9891 != Static117.anIntArray105[local309] && Static117.anIntArray105[local309 + 1] == Static4.aClass363_1.anInt9891 || Static117.anIntArray105[local309] == 0 && Static117.anIntArray105[local309 + 1] != 0) {
																	local313 = Static117.anIntArray105[local309];
																	Static117.anIntArray105[local309] = Static117.anIntArray105[local309 + 1];
																	Static117.anIntArray105[local309 + 1] = local313;
																	local2497 = Static159.aStringArray14[local309];
																	Static159.aStringArray14[local309] = Static159.aStringArray14[local309 + 1];
																	Static159.aStringArray14[local309 + 1] = local2497;
																	local2501 = Static422.aStringArray29[local309];
																	Static422.aStringArray29[local309] = Static422.aStringArray29[local309 + 1];
																	Static422.aStringArray29[local309 + 1] = local2501;
																	local822 = Static159.aStringArray13[local309];
																	Static159.aStringArray13[local309] = Static159.aStringArray13[local309 + 1];
																	Static159.aStringArray13[local309 + 1] = local822;
																	local557 = Static153.anIntArray145[local309];
																	Static153.anIntArray145[local309] = Static153.anIntArray145[local309 + 1];
																	Static153.anIntArray145[local309 + 1] = local557;
																	local5708 = Static301.aBooleanArray15[local309];
																	Static301.aBooleanArray15[local309] = Static301.aBooleanArray15[local309 + 1];
																	local238 = false;
																	Static301.aBooleanArray15[local309 + 1] = local5708;
																}
															}
															if (local238) {
																break;
															}
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static597.aClass200_142 == Static61.aClass200_15) {
														Static4.anInt54 = Static30.aClass3_Sub3_Sub2_1.method4225();
														Static364.anInt7722 = Static30.aClass3_Sub3_Sub2_1.method4239() << 3;
														Static250.anInt4602 = Static30.aClass3_Sub3_Sub2_1.method4245() << 3;
														Static61.aClass200_15 = null;
														return true;
													} else if (Static188.aClass200_46 == Static61.aClass200_15) {
														local238 = Static30.aClass3_Sub3_Sub2_1.method4225() == 1;
														local535 = Static30.aClass3_Sub3_Sub2_1.method4233();
														local537 = local535;
														if (local238) {
															local537 = Static30.aClass3_Sub3_Sub2_1.method4233();
														}
														local548 = Static30.aClass3_Sub3_Sub2_1.method4246();
														local553 = Static30.aClass3_Sub3_Sub2_1.method4221();
														local4287 = Static30.aClass3_Sub3_Sub2_1.method4204();
														local989 = Static30.aClass3_Sub3_Sub2_1.method4225();
														local996 = Static30.aClass3_Sub3_Sub2_1.method4221();
														@Pc(6103) long local6103 = local4287 + (local553 << 32);
														@Pc(6105) boolean local6105 = false;
														local1471 = 0;
														while (true) {
															if (local1471 >= 100) {
																if (local989 <= 1 && Static201.method3498(local537)) {
																	local6105 = true;
																}
																break;
															}
															if (Static168.aLongArray12[local1471] == local6103) {
																local6105 = true;
																break;
															}
															local1471++;
														}
														if (!local6105 && Static56.anInt1566 == 0) {
															Static168.aLongArray12[Static302.anInt5359] = local6103;
															Static302.anInt5359 = (Static302.anInt5359 + 1) % 100;
															@Pc(6158) String local6158 = Static430.aClass113_2.method2868(local996).method4828(Static30.aClass3_Sub3_Sub2_1);
															if (local989 == 2) {
																Static491.method7315("<img=1>" + local535, local996, local535, 0, "<img=1>" + local537, 20, local6158, Static629.method8652(local548));
															} else if (local989 == 1) {
																Static491.method7315("<img=0>" + local535, local996, local535, 0, "<img=0>" + local537, 20, local6158, Static629.method8652(local548));
															} else {
																Static491.method7315(local535, local996, local535, 0, local537, 20, local6158, Static629.method8652(local548));
															}
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static369.aClass200_97 == Static61.aClass200_15) {
														Static569.aClass215_4 = Static184.method3195(Static30.aClass3_Sub3_Sub2_1.method4225());
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static123.aClass200_24) {
														Static639.method8721(Static264.aClass337_8);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static52.aClass200_10) {
														Static474.anInt8296 = Static30.aClass3_Sub3_Sub2_1.method4209();
														Static406.anInt7450 = Static371.anInt7006;
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static54.aClass200_12) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4243();
														Static630.method8655();
														Static454.anInt8026 = local204;
														Static61.aClass200_15 = null;
														return true;
													} else if (Static246.aClass200_63 == Static61.aClass200_15) {
														Static639.method8721(Static457.aClass337_13);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static330.aClass200_86) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4223();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4243();
														Static630.method8655();
														Static232.method3890(local204, local73);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static20.aClass200_2 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
														Static630.method8655();
														Static176.method3079(local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static30.aClass200_4 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
														if (local204 == 65535) {
															local204 = -1;
														}
														local73 = Static30.aClass3_Sub3_Sub2_1.method4210();
														local309 = Static30.aClass3_Sub3_Sub2_1.method4236();
														if (local309 == 65535) {
															local309 = -1;
														}
														local313 = Static30.aClass3_Sub3_Sub2_1.method4207();
														Static630.method8655();
														for (local317 = local204; local317 <= local309; local317++) {
															local553 = ((long) local73 << 32) + (long) local317;
															local2412 = (Class3_Sub15) Static559.aClass280_44.method7107(local553);
															if (local2412 != null) {
																local2421 = new Class3_Sub15(local313, local2412.anInt2463);
																local2412.method8769();
															} else if (local317 == -1) {
																local2421 = new Class3_Sub15(local313, Static433.method6771(local73).aClass3_Sub15_1.anInt2463);
															} else {
																local2421 = new Class3_Sub15(local313, -1);
															}
															Static559.aClass280_44.method7109(local2421, local553);
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static131.aClass200_25) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4223();
														Static630.method8655();
														Static597.method8377(5, Static97.anInt2234, 0, local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == aClass200_68) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4263();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4221();
														Static630.method8655();
														if (local204 == 2) {
															Static109.method2230();
														}
														Static307.anInt5465 = local73;
														Static117.method2402(local73);
														Static422.method6616(false);
														Static304.method4838(Static307.anInt5465);
														for (local309 = 0; local309 < 100; local309++) {
															Static477.aBooleanArray21[local309] = true;
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static86.aClass200_141 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4223();
														Static373.aClass150_1.method3823(local73, local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static552.aClass200_133) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4221();
														if (local204 == 65535) {
															local204 = -1;
														}
														local73 = Static30.aClass3_Sub3_Sub2_1.method4225();
														local309 = Static30.aClass3_Sub3_Sub2_1.method4221();
														local313 = Static30.aClass3_Sub3_Sub2_1.method4225();
														local317 = Static30.aClass3_Sub3_Sub2_1.method4221();
														Static137.method2968(local204, local309, local317, local313, local73);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static48.aClass200_9) {
														local1676 = Static30.aClass3_Sub3_Sub2_1.method4233();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4231();
														Static630.method8655();
														Static311.method6190(local73, local1676);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static159.aClass200_35) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4231();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4207();
														Static630.method8655();
														Static169.method2963(local73, local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static19.aClass200_1 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4210();
														local73 = Static30.aClass3_Sub3_Sub2_1.method4222();
														Static630.method8655();
														if (local73 == 65535) {
															local73 = -1;
														}
														Static597.method8377(2, local73, -1, local204);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static335.aClass200_87 == Static61.aClass200_15) {
														if (Static307.anInt5465 != -1) {
															Static596.method8356(0, Static307.anInt5465);
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static306.aClass200_81 == Static61.aClass200_15) {
														local204 = Static30.aClass3_Sub3_Sub2_1.method4207();
														Static630.method8655();
														@Pc(6671) Class3_Sub29 local6671 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local204);
														if (local6671 != null) {
															Static54.method1546(true, false, local6671);
														}
														if (Static25.aClass279_13 != null) {
															Static482.method7193(Static25.aClass279_13);
															Static25.aClass279_13 = null;
														}
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static494.aClass200_124) {
														local1676 = Static30.aClass3_Sub3_Sub2_1.method4233();
														local535 = Static305.method4859(Static512.method7641(Static30.aClass3_Sub3_Sub2_1));
														Static582.method8231(local535, local1676, 6, 0, local1676, local1676);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static295.aClass200_77 == Static61.aClass200_15) {
														Static639.method8721(Static445.aClass337_12);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static270.aClass200_67 == Static61.aClass200_15) {
														Static639.method8721(Static146.aClass337_5);
														Static61.aClass200_15 = null;
														return true;
													} else if (Static61.aClass200_15 == Static311.aClass200_104) {
														Static439.method6845(Static48.aBoolean92);
														Static61.aClass200_15 = null;
														return false;
													} else {
														Static335.method5467("T1 - " + (Static61.aClass200_15 == null ? -1 : Static61.aClass200_15.method5148()) + "," + (Static191.aClass200_47 == null ? -1 : Static191.aClass200_47.method5148()) + "," + (Static66.aClass200_16 == null ? -1 : Static66.aClass200_16.method5148()) + " - " + Static272.anInt4948, null);
														Static439.method6845(false);
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

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Lclient!qs;")
	public static Class4_Sub8 method4457(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class120[] local15 = Class339.aClass120Array1;
		synchronized (Class339.aClass120Array1) {
			@Pc(38) Class4_Sub8 local38;
			if (Class339.aClass120Array1.length <= arg1 || Class339.aClass120Array1[arg1].method2965()) {
				local38 = new Class4_Sub8();
				local38.aClass4_Sub5Array1 = new Class4_Sub5[arg1];
				for (@Pc(60) int local60 = 0; local60 < arg1; local60++) {
					local38.aClass4_Sub5Array1[local60] = new Class4_Sub5();
				}
			} else {
				local38 = (Class4_Sub8) Class339.aClass120Array1[arg1].method2967();
				local38.method7841();
				@Pc(45) int local45 = Static106.anIntArray92[arg1]--;
			}
			local38.aBoolean581 = arg0;
			return local38;
		}
	}
}
