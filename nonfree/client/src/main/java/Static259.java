import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!io", name = "L", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)Z")
	public static boolean method3828() throws IOException {
		if (Static492.aClass295_1 == null) {
			return false;
		}
		@Pc(82) int local82;
		if (Static493.aClass109_175 == null) {
			if (Static400.aBoolean529) {
				if (!Static492.aClass295_1.method7021(1)) {
					return false;
				}
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static200.anInt3241++;
				Static400.aBoolean529 = false;
				Static333.anInt5937 = 0;
			}
			Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
			if (Static515.aClass5_Sub23_Sub2_1.method8544()) {
				if (!Static492.aClass295_1.method7021(1)) {
					return false;
				}
				Static492.aClass295_1.method7020(1, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static200.anInt3241++;
				Static333.anInt5937 = 0;
			}
			Static400.aBoolean529 = true;
			@Pc(78) Class109[] local78 = Static89.method1344();
			local82 = Static515.aClass5_Sub23_Sub2_1.method8545();
			if (local82 < 0 || local78.length <= local82) {
				throw new IOException("invo:" + local82 + " ip:" + Static515.aClass5_Sub23_Sub2_1.anInt9869);
			}
			Static493.aClass109_175 = local78[local82];
			Static327.anInt5853 = Static493.aClass109_175.anInt2321;
		}
		if (Static327.anInt5853 == -1) {
			if (!Static492.aClass295_1.method7021(1)) {
				return false;
			}
			Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
			Static327.anInt5853 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
			Static200.anInt3241++;
			Static333.anInt5937 = 0;
		}
		if (Static327.anInt5853 == -2) {
			if (!Static492.aClass295_1.method7021(2)) {
				return false;
			}
			Static492.aClass295_1.method7020(0, 2, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
			Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
			Static327.anInt5853 = Static515.aClass5_Sub23_Sub2_1.method8519();
			Static333.anInt5937 = 0;
			Static200.anInt3241 += 2;
		}
		if (Static327.anInt5853 > 0) {
			if (!Static492.aClass295_1.method7021(Static327.anInt5853)) {
				return false;
			}
			Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
			Static492.aClass295_1.method7020(0, Static327.anInt5853, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
			Static200.anInt3241 += Static327.anInt5853;
			Static333.anInt5937 = 0;
		}
		Static113.aClass109_48 = Static247.aClass109_94;
		Static247.aClass109_94 = Static212.aClass109_77;
		Static212.aClass109_77 = Static493.aClass109_175;
		@Pc(245) int local245;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(267) int local267;
		@Pc(295) int local295;
		@Pc(320) boolean local320;
		@Pc(323) int local323;
		@Pc(742) int local742;
		@Pc(237) int local237;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(787) int local787;
		@Pc(793) int local793;
		@Pc(823) int local823;
		@Pc(558) boolean local558;
		@Pc(501) int local501;
		if (Static637.aClass109_220 == Static493.aClass109_175) {
			local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
			local82 = Static515.aClass5_Sub23_Sub2_1.method8505();
			local245 = Static515.aClass5_Sub23_Sub2_1.method8515();
			local249 = Static515.aClass5_Sub23_Sub2_1.method8527();
			local253 = Static515.aClass5_Sub23_Sub2_1.method8529();
			local257 = Static515.aClass5_Sub23_Sub2_1.method8518();
			local261 = local82 & 0x7;
			local267 = local82 >> 3 & 0xF;
			if (local267 == 15) {
				local267 = -1;
			}
			if (local249 >> 30 == 0) {
				@Pc(373) Class165 local373;
				@Pc(350) Class160 local350;
				@Pc(367) Class165 local367;
				if (local249 >> 29 != 0) {
					local295 = local249 & 0xFFFF;
					@Pc(541) Class5_Sub35 local541 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local295, 1);
					if (local541 != null) {
						@Pc(546) Class8_Sub1_Sub3_Sub2_Sub2 local546 = local541.aClass8_Sub1_Sub3_Sub2_Sub2_2;
						if (local245 == 65535) {
							local245 = -1;
						}
						@Pc(556) Class150 local556 = local546.aClass150Array3[local253];
						local558 = true;
						local501 = local556.anInt3303;
						if (local245 != -1 && local501 != -1) {
							if (local245 == local501) {
								local350 = Static421.aClass385_2.method9166(local245);
								if (local350.aBoolean288 && local350.anInt3635 != -1) {
									local367 = Static158.aClass317_1.method7882(local350.anInt3635, 100);
									@Pc(599) int local599 = local367.anInt3919;
									if (local599 == 0 || local599 == 2) {
										local558 = false;
									} else if (local599 == 1) {
										local558 = true;
									}
								}
							} else {
								local350 = Static421.aClass385_2.method9166(local245);
								@Pc(636) Class160 local636 = Static421.aClass385_2.method9166(local501);
								if (local350.anInt3635 != -1 && local636.anInt3635 != -1) {
									local373 = Static158.aClass317_1.method7882(local350.anInt3635, 100);
									@Pc(659) Class165 local659 = Static158.aClass317_1.method7882(local636.anInt3635, 100);
									if (local373.anInt3910 < local659.anInt3910) {
										local558 = false;
									}
								}
							}
						}
						if (local558) {
							local556.anInt3302 = Static44.anInt740 + local237;
							local556.anInt3296 = local257;
							local556.anInt3301 = 1;
							local556.anInt3294 = local267;
							local556.anInt3303 = local245;
							local556.anInt3297 = local261;
							local556.anInt3298 = 0;
							local556.anInt3295 = 0;
							if (Static44.anInt740 < local556.anInt3302) {
								local556.anInt3298 = -1;
							}
							if (local556.anInt3303 == 65535) {
								local556.anInt3303 = -1;
							}
							if (local556.anInt3303 != -1 && local556.anInt3302 == Static44.anInt740) {
								local742 = Static421.aClass385_2.method9166(local556.anInt3303).anInt3635;
								if (local742 != -1) {
									local367 = Static158.aClass317_1.method7882(local742, 100);
									if (local367 != null && local367.anIntArray226 != null && !local546.aBoolean540) {
										Static268.method4004(local367, local546, 0);
									}
								}
							}
						}
					}
				} else if (local249 >> 28 != 0) {
					local295 = local249 & 0xFFFF;
					@Pc(300) Class8_Sub1_Sub3_Sub2_Sub1 local300;
					if (local295 == Static279.anInt4838) {
						local300 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1;
					} else {
						local300 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local295];
					}
					if (local300 != null) {
						@Pc(313) Class150 local313 = local300.aClass150Array3[local253];
						if (local245 == 65535) {
							local245 = -1;
						}
						local320 = true;
						local323 = local313.anInt3303;
						@Pc(407) Class165 local407;
						if (local245 != -1 && local323 != -1) {
							@Pc(345) Class160 local345;
							if (local245 == local323) {
								local345 = Static421.aClass385_2.method9166(local245);
								if (local345.aBoolean288 && local345.anInt3635 != -1) {
									local407 = Static158.aClass317_1.method7882(local345.anInt3635, 100);
									@Pc(410) int local410 = local407.anInt3919;
									if (local410 == 0 || local410 == 2) {
										local320 = false;
									} else if (local410 == 1) {
										local320 = true;
									}
								}
							} else {
								local345 = Static421.aClass385_2.method9166(local245);
								local350 = Static421.aClass385_2.method9166(local323);
								if (local345.anInt3635 != -1 && local350.anInt3635 != -1) {
									local367 = Static158.aClass317_1.method7882(local345.anInt3635, 100);
									local373 = Static158.aClass317_1.method7882(local350.anInt3635, 100);
									if (local373.anInt3910 > local367.anInt3910) {
										local320 = false;
									}
								}
							}
						}
						if (local320) {
							local313.anInt3302 = Static44.anInt740 + local237;
							local313.anInt3297 = local261;
							local313.anInt3294 = local267;
							local313.anInt3301 = 1;
							local313.anInt3303 = local245;
							local313.anInt3296 = local257;
							local313.anInt3298 = 0;
							local313.anInt3295 = 0;
							if (Static44.anInt740 < local313.anInt3302) {
								local313.anInt3298 = -1;
							}
							if (local313.anInt3303 == 65535) {
								local313.anInt3303 = -1;
							}
							if (local313.anInt3303 != -1 && Static44.anInt740 == local313.anInt3302) {
								local501 = Static421.aClass385_2.method9166(local313.anInt3303).anInt3635;
								if (local501 != -1) {
									local407 = Static158.aClass317_1.method7882(local501, 100);
									if (local407 != null && local407.anIntArray226 != null && !local300.aBoolean540) {
										Static268.method4004(local407, local300, 0);
									}
								}
							}
						}
					}
				}
			} else {
				local295 = local249 >> 28 & 0x3;
				local787 = (local249 >> 14 & 0x3FFF) - Static622.anInt10188;
				local793 = (local249 & 0x3FFF) - Static668.anInt10683;
				if (local787 >= 0 && local793 >= 0 && local787 < Static544.anInt9261 && local793 < Static282.anInt4887) {
					local823 = local787 * 512 + 256;
					local323 = local793 * 512 + 256;
					local501 = local295;
					if (local295 < 3 && Static90.method1353(1, local793, local787)) {
						local501 = local295 + 1;
					}
					@Pc(868) Class8_Sub1_Sub3_Sub5 local868 = new Class8_Sub1_Sub3_Sub5(local245, local237, Static44.anInt740, local295, local501, local823, Static380.method5559(local823, local295, local323, 0) - local257, local323, local787, local787, local793, local793, local261);
					Static480.aClass102_51.method1921(new Class5_Sub5_Sub9(local868));
				}
			}
			Static493.aClass109_175 = null;
			return true;
		} else if (Static493.aClass109_175 == Static426.aClass109_155) {
			local237 = Static515.aClass5_Sub23_Sub2_1.method8483();
			Static188.method2727();
			Static493.aClass109_175 = null;
			Static80.anInt1219 = local237;
			return true;
		} else {
			@Pc(918) boolean local918;
			if (Static153.aClass109_62 == Static493.aClass109_175) {
				local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
				local82 = Static515.aClass5_Sub23_Sub2_1.method8483();
				local918 = (local82 & 0x1) == 1;
				Static669.method9214(local237, local918);
				Static377.anIntArray373[Static469.anInt7969++ & 0x1F] = local237;
				Static493.aClass109_175 = null;
				return true;
			}
			@Pc(984) long local984;
			@Pc(1004) Class5_Sub45 local1004;
			@Pc(990) Class5_Sub45 local990;
			if (Static493.aClass109_175 == Static675.aClass109_225) {
				local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
				local245 = Static515.aClass5_Sub23_Sub2_1.method8506();
				if (local245 == 65535) {
					local245 = -1;
				}
				local249 = Static515.aClass5_Sub23_Sub2_1.method8518();
				Static188.method2727();
				if (local249 == 65535) {
					local249 = -1;
				}
				for (local253 = local249; local253 <= local245; local253++) {
					local984 = (long) local253 + ((long) local82 << 32);
					local990 = (Class5_Sub45) Static131.aClass291_11.method6993(local984, 1);
					if (local990 != null) {
						local1004 = new Class5_Sub45(local990.anInt8267, local237);
						local990.method9327(1);
					} else if (local253 == -1) {
						local1004 = new Class5_Sub45(method3831(local82).aClass5_Sub45_1.anInt8267, local237);
					} else {
						local1004 = new Class5_Sub45(0, local237);
					}
					Static131.aClass291_11.method6984(local984, local1004);
				}
				Static493.aClass109_175 = null;
				return true;
			}
			@Pc(1068) String local1068;
			@Pc(1056) String local1056;
			if (Static493.aClass109_175 == Static533.aClass109_189) {
				local1056 = Static515.aClass5_Sub23_Sub2_1.method8497();
				local82 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local1068 = Static502.aClass259_2.method6241(local82).method672(Static515.aClass5_Sub23_Sub2_1);
				Static243.method3607(local1056, 0, (String) null, local82, local1056, local1056, local1068, 19);
				Static493.aClass109_175 = null;
				return true;
			} else if (Static493.aClass109_175 == Static66.aClass109_30) {
				Static411.aByte122 = Static515.aClass5_Sub23_Sub2_1.method8536();
				Static493.aClass109_175 = null;
				if (Static411.aByte122 == 0 || Static411.aByte122 == 1) {
					Static473.aBoolean599 = true;
				}
				return true;
			} else {
				@Pc(1128) String local1128;
				@Pc(1124) boolean local1124;
				@Pc(1138) long local1138;
				@Pc(1133) long local1133;
				@Pc(1154) boolean local1154;
				@Pc(1236) String local1236;
				@Pc(1152) long local1152;
				if (Static578.aClass109_205 == Static493.aClass109_175) {
					local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
					local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
					local1133 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
					local1138 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
					local261 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local267 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local1152 = local1138 + (local1133 << 32);
					local1154 = false;
					@Pc(1163) Class5_Sub53 local1163 = local1124 ? Static335.aClass5_Sub53_6 : Static208.aClass5_Sub53_9;
					if (local1163 == null) {
						local1154 = true;
					} else {
						label2131: {
							for (local323 = 0; local323 < 100; local323++) {
								if (Static36.aLongArray8[local323] == local1152) {
									local1154 = true;
									break label2131;
								}
							}
							if (local261 <= 1 && Static393.method6334(local1128)) {
								local1154 = true;
							}
						}
					}
					if (!local1154 && Static678.anInt10816 == 0) {
						Static36.aLongArray8[Static482.anInt8134] = local1152;
						Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
						local1236 = Static502.aClass259_2.method6241(local267).method672(Static515.aClass5_Sub23_Sub2_1);
						local501 = local1124 ? 42 : 45;
						if (local261 == 2 || local261 == 3) {
							Static243.method3607(local1128, 0, local1163.aString136, local267, "<img=1>" + local1128, "<img=1>" + local1128, local1236, local501);
						} else if (local261 == 1) {
							Static243.method3607(local1128, 0, local1163.aString136, local267, "<img=0>" + local1128, "<img=0>" + local1128, local1236, local501);
						} else {
							Static243.method3607(local1128, 0, local1163.aString136, local267, local1128, local1128, local1236, local501);
						}
					}
					Static493.aClass109_175 = null;
					return true;
				} else if (Static42.aClass109_42 == Static493.aClass109_175) {
					local237 = Static515.aClass5_Sub23_Sub2_1.method8506();
					local82 = Static515.aClass5_Sub23_Sub2_1.method8503();
					Static413.aClass118_1.method2147(local237, local82);
					Static493.aClass109_175 = null;
					return true;
				} else {
					@Pc(1398) String local1398;
					@Pc(1374) String local1374;
					@Pc(1372) String local1372;
					if (Static278.aClass109_108 == Static493.aClass109_175) {
						local237 = Static515.aClass5_Sub23_Sub2_1.method8499();
						local82 = Static515.aClass5_Sub23_Sub2_1.method8527();
						local245 = Static515.aClass5_Sub23_Sub2_1.method8529();
						local1372 = "";
						local1374 = local1372;
						if ((local245 & 0x1) != 0) {
							local1372 = Static515.aClass5_Sub23_Sub2_1.method8497();
							if ((local245 & 0x2) == 0) {
								local1374 = local1372;
							} else {
								local1374 = Static515.aClass5_Sub23_Sub2_1.method8497();
							}
						}
						local1398 = Static515.aClass5_Sub23_Sub2_1.method8497();
						if (local237 == 99) {
							Static619.method3013(local1398);
						} else if (local1374.equals("") || !Static393.method6334(local1374)) {
							Static177.method2584(local1372, local1398, local1372, local82, local237, local1374);
						} else {
							Static493.aClass109_175 = null;
							return true;
						}
						Static493.aClass109_175 = null;
						return true;
					} else if (Static493.aClass109_175 == Static516.aClass109_183) {
						Static453.anInt7761 = Static515.aClass5_Sub23_Sub2_1.method8529();
						for (local237 = 0; local237 < Static453.anInt7761; local237++) {
							Static197.aStringArray73[local237] = Static515.aClass5_Sub23_Sub2_1.method8497();
							Static30.aStringArray4[local237] = Static515.aClass5_Sub23_Sub2_1.method8497();
							if (Static30.aStringArray4[local237].equals("")) {
								Static30.aStringArray4[local237] = Static197.aStringArray73[local237];
							}
							Static430.aStringArray43[local237] = Static515.aClass5_Sub23_Sub2_1.method8497();
							Static546.aStringArray71[local237] = Static515.aClass5_Sub23_Sub2_1.method8497();
							if (Static546.aStringArray71[local237].equals("")) {
								Static546.aStringArray71[local237] = Static430.aStringArray43[local237];
							}
							Static24.aBooleanArray1[local237] = false;
						}
						Static493.aClass109_175 = null;
						Static148.anInt2385 = Static261.anInt4525;
						return true;
					} else if (Static391.aClass109_141 == Static493.aClass109_175) {
						Static660.method9140();
						Static493.aClass109_175 = null;
						return true;
					} else if (Static493.aClass109_175 == Static72.aClass109_32) {
						local237 = Static515.aClass5_Sub23_Sub2_1.method8527();
						Static188.method2727();
						Static247.method3634(Static279.anInt4838, 5, local237, 0);
						Static493.aClass109_175 = null;
						return true;
					} else if (Static493.aClass109_175 == Static375.aClass109_131) {
						Static12.method239(Static581.aClass370_18);
						Static493.aClass109_175 = null;
						return true;
					} else if (Static112.aClass109_47 == Static493.aClass109_175) {
						local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
						if (local237 == 65535) {
							local237 = -1;
						}
						local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
						local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
						local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
						local253 = Static515.aClass5_Sub23_Sub2_1.method8519();
						Static443.method6563(local245, local253, local82, local249, local237);
						Static493.aClass109_175 = null;
						return true;
					} else if (Static493.aClass109_175 == Static284.aClass109_110) {
						local237 = Static515.aClass5_Sub23_Sub2_1.method8474();
						Static188.method2727();
						@Pc(1621) Class5_Sub49 local1621 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local237, 1);
						if (local1621 != null) {
							Static372.method7048(local1621, true, false);
						}
						if (Static24.aClass73_3 != null) {
							Static298.method4399(Static24.aClass73_3);
							Static24.aClass73_3 = null;
						}
						Static493.aClass109_175 = null;
						return true;
					} else {
						@Pc(1675) long local1675;
						@Pc(1779) String local1779;
						if (Static493.aClass109_175 == Static378.aClass109_132) {
							local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
							local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
							local1068 = local1128;
							if (local1124) {
								local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
							}
							local1675 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
							local984 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
							local267 = Static515.aClass5_Sub23_Sub2_1.method8529();
							local1152 = local984 + (local1675 << 32);
							local1154 = false;
							local823 = 0;
							while (true) {
								if (local823 >= 100) {
									if (local267 <= 1) {
										if (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721) {
											local1154 = true;
										} else if (Static393.method6334(local1068)) {
											local1154 = true;
										}
									}
									break;
								}
								if (Static36.aLongArray8[local823] == local1152) {
									local1154 = true;
									break;
								}
								local823++;
							}
							if (!local1154 && Static678.anInt10816 == 0) {
								Static36.aLongArray8[Static482.anInt8134] = local1152;
								Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
								local1779 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
								if (local267 == 2) {
									Static243.method3607(local1128, 0, (String) null, -1, "<img=1>" + local1128, "<img=1>" + local1068, local1779, 7);
								} else if (local267 == 1) {
									Static243.method3607(local1128, 0, (String) null, -1, "<img=0>" + local1128, "<img=0>" + local1068, local1779, 7);
								} else {
									Static243.method3607(local1128, 0, (String) null, -1, local1128, local1068, local1779, 3);
								}
							}
							Static493.aClass109_175 = null;
							return true;
						} else if (Static223.aClass109_80 == Static493.aClass109_175) {
							local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
							local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
							local245 = Static515.aClass5_Sub23_Sub2_1.method8506();
							local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
							Static188.method2727();
							Static114.method1636(local245, local249, local82, local237);
							Static493.aClass109_175 = null;
							return true;
						} else if (Static190.aClass109_68 == Static493.aClass109_175) {
							local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
							local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
							local245 = Static515.aClass5_Sub23_Sub2_1.method8527();
							local249 = Static515.aClass5_Sub23_Sub2_1.method8505();
							Static188.method2727();
							Static622.method8761(local249, local82, local237, local245);
							Static493.aClass109_175 = null;
							return true;
						} else {
							@Pc(1967) boolean local1967;
							@Pc(2292) String local2292;
							if (Static367.aClass109_212 == Static493.aClass109_175) {
								@Pc(2026) boolean local2026;
								while (Static327.anInt5853 > Static515.aClass5_Sub23_Sub2_1.anInt9869) {
									local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
									local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
									local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
									local249 = Static515.aClass5_Sub23_Sub2_1.method8519();
									local253 = Static515.aClass5_Sub23_Sub2_1.method8529();
									local1398 = "";
									local1967 = false;
									if (local249 > 0) {
										local1398 = Static515.aClass5_Sub23_Sub2_1.method8497();
										local1967 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
									}
									for (local267 = 0; local267 < Static463.anInt7895; local267++) {
										if (local1124) {
											if (local1068.equals(Static444.aStringArray54[local267])) {
												Static444.aStringArray54[local267] = local1128;
												local1128 = null;
												Static446.aStringArray57[local267] = local1068;
												break;
											}
										} else if (local1128.equals(Static444.aStringArray54[local267])) {
											if (local249 != Static279.anIntArray271[local267]) {
												local2026 = true;
												for (@Pc(2036) Class8_Sub8_Sub2 local2036 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1777(); local2036 != null; local2036 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1782()) {
													if (local2036.aString106.equals(local1128)) {
														if (local249 != 0 && local2036.aShort98 == 0) {
															local2026 = false;
															local2036.method8893();
														} else if (local249 == 0 && local2036.aShort98 != 0) {
															local2026 = false;
															local2036.method8893();
														}
													}
												}
												if (local2026) {
													Static140.aClass98_4.method1780(new Class8_Sub8_Sub2(local1128, local249));
												}
												Static279.anIntArray271[local267] = local249;
											}
											Static446.aStringArray57[local267] = local1068;
											Static95.aStringArray9[local267] = local1398;
											Static105.anIntArray91[local267] = local253;
											Static514.aBooleanArray20[local267] = local1967;
											local1128 = null;
											break;
										}
									}
									if (local1128 != null && Static463.anInt7895 < 200) {
										Static444.aStringArray54[Static463.anInt7895] = local1128;
										Static446.aStringArray57[Static463.anInt7895] = local1068;
										Static279.anIntArray271[Static463.anInt7895] = local249;
										Static95.aStringArray9[Static463.anInt7895] = local1398;
										Static105.anIntArray91[Static463.anInt7895] = local253;
										Static514.aBooleanArray20[Static463.anInt7895] = local1967;
										Static463.anInt7895++;
									}
								}
								Static148.anInt2385 = Static261.anInt4525;
								Static205.anInt3334 = 2;
								local82 = Static463.anInt7895;
								while (local82 > 0) {
									local82--;
									local1124 = true;
									for (local245 = 0; local245 < local82; local245++) {
										if (Static197.aClass54_35.anInt869 != Static279.anIntArray271[local245] && Static279.anIntArray271[local245 + 1] == Static197.aClass54_35.anInt869 || Static279.anIntArray271[local245] == 0 && Static279.anIntArray271[local245 + 1] != 0) {
											local249 = Static279.anIntArray271[local245];
											Static279.anIntArray271[local245] = Static279.anIntArray271[local245 + 1];
											Static279.anIntArray271[local245 + 1] = local249;
											local1374 = Static95.aStringArray9[local245];
											Static95.aStringArray9[local245] = Static95.aStringArray9[local245 + 1];
											Static95.aStringArray9[local245 + 1] = local1374;
											local1398 = Static444.aStringArray54[local245];
											Static444.aStringArray54[local245] = Static444.aStringArray54[local245 + 1];
											Static444.aStringArray54[local245 + 1] = local1398;
											local2292 = Static446.aStringArray57[local245];
											Static446.aStringArray57[local245] = Static446.aStringArray57[local245 + 1];
											Static446.aStringArray57[local245 + 1] = local2292;
											local267 = Static105.anIntArray91[local245];
											Static105.anIntArray91[local245] = Static105.anIntArray91[local245 + 1];
											Static105.anIntArray91[local245 + 1] = local267;
											local2026 = Static514.aBooleanArray20[local245];
											Static514.aBooleanArray20[local245] = Static514.aBooleanArray20[local245 + 1];
											local1124 = false;
											Static514.aBooleanArray20[local245 + 1] = local2026;
										}
									}
									if (local1124) {
										break;
									}
								}
								Static493.aClass109_175 = null;
								return true;
							}
							@Pc(2406) boolean local2406;
							if (Static369.aClass109_128 == Static493.aClass109_175) {
								local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
								local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
								local1068 = local1128;
								if (local1124) {
									local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
								}
								local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
								local253 = Static515.aClass5_Sub23_Sub2_1.method8519();
								local2406 = false;
								if (local249 <= 1 && Static393.method6334(local1068)) {
									local2406 = true;
								}
								if (!local2406 && Static678.anInt10816 == 0) {
									local2292 = Static502.aClass259_2.method6241(local253).method672(Static515.aClass5_Sub23_Sub2_1);
									if (local249 == 2) {
										Static243.method3607(local1128, 0, (String) null, local253, "<img=1>" + local1128, "<img=1>" + local1068, local2292, 25);
									} else if (local249 == 1) {
										Static243.method3607(local1128, 0, (String) null, local253, "<img=0>" + local1128, "<img=0>" + local1068, local2292, 25);
									} else {
										Static243.method3607(local1128, 0, (String) null, local253, local1128, local1068, local2292, 25);
									}
								}
								Static493.aClass109_175 = null;
								return true;
							} else if (Static493.aClass109_175 == Static667.aClass109_224) {
								local237 = Static515.aClass5_Sub23_Sub2_1.method8506();
								local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
								local245 = Static515.aClass5_Sub23_Sub2_1.method8518();
								local249 = Static515.aClass5_Sub23_Sub2_1.method8503();
								Static188.method2727();
								Static247.method3634(local245 << 16 | local82, 7, local249, local237);
								Static493.aClass109_175 = null;
								return true;
							} else if (Static493.aClass109_175 == Static35.aClass109_192) {
								if (Static390.anInt6669 != -1) {
									Static190.method2757(Static390.anInt6669, 0);
								}
								Static493.aClass109_175 = null;
								return true;
							} else if (Static245.aClass109_93 == Static493.aClass109_175) {
								Static170.anInt2914 = Static515.aClass5_Sub23_Sub2_1.method8529();
								Static493.aClass109_175 = null;
								return true;
							} else if (Static493.aClass109_175 == Static16.aClass109_14) {
								local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
								if (local237 == 65535) {
									local237 = -1;
								}
								local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
								Static188.method2727();
								Static277.method4085(local82, local237);
								Static493.aClass109_175 = null;
								return true;
							} else if (Static493.aClass109_175 == Static205.aClass109_73) {
								local237 = Static515.aClass5_Sub23_Sub2_1.method8506();
								local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
								Static188.method2727();
								Static66.method1087(local237, local1128);
								Static493.aClass109_175 = null;
								return true;
							} else if (Static493.aClass109_175 == Static378.aClass109_133) {
								Static481.method6997((byte) -79);
								Static493.aClass109_175 = null;
								return false;
							} else if (Static493.aClass109_175 == Static413.aClass109_153) {
								local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
								local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
								Static188.method2727();
								Static46.method752(local237, local82);
								Static493.aClass109_175 = null;
								return true;
							} else {
								@Pc(2709) boolean local2709;
								if (Static191.aClass109_69 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
									@Pc(2678) Class8_Sub1_Sub3_Sub2_Sub1 local2678;
									if (local237 == Static279.anInt4838) {
										local2678 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1;
									} else {
										local2678 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local237];
									}
									if (local2678 == null) {
										Static493.aClass109_175 = null;
										return true;
									}
									local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
									local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
									local2709 = (local245 & 0x8000) != 0;
									if (local2678.aString62 != null && local2678.aClass100_1 != null) {
										local2406 = false;
										if (local249 <= 1) {
											if (!local2709 && (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721)) {
												local2406 = true;
											} else if (Static393.method6334(local2678.aString62)) {
												local2406 = true;
											}
										}
										if (!local2406 && Static678.anInt10816 == 0) {
											local267 = -1;
											if (local2709) {
												local245 &= 0x7FFF;
												@Pc(2782) Class139 local2782 = Static214.method3079(Static515.aClass5_Sub23_Sub2_1);
												local267 = local2782.anInt3083;
												local2292 = local2782.aClass5_Sub5_Sub1_1.method672(Static515.aClass5_Sub23_Sub2_1);
											} else {
												local2292 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
											}
											local2678.aString92 = local2292.trim();
											local2678.anInt7022 = 150;
											local2678.anInt7015 = local245 >> 8;
											local2678.anInt6990 = local245 & 0xFF;
											if (local249 == 1 || local249 == 2) {
												local295 = local2709 ? 17 : 1;
											} else {
												local295 = local2709 ? 17 : 2;
											}
											if (local249 == 2) {
												Static243.method3607(local2678.aString61, 0, (String) null, local267, "<img=1>" + local2678.method3599(), "<img=1>" + local2678.method3608(), local2292, local295);
											} else if (local249 == 1) {
												Static243.method3607(local2678.aString61, 0, (String) null, local267, "<img=0>" + local2678.method3599(), "<img=0>" + local2678.method3608(), local2292, local295);
											} else {
												Static243.method3607(local2678.aString61, 0, (String) null, local267, local2678.method3599(), local2678.method3608(), local2292, local295);
											}
										}
									}
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static40.aClass109_18) {
									local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
									local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
									local1068 = local1128;
									if (local1124) {
										local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
									}
									local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
									local2709 = false;
									if (local249 <= 1) {
										if (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721) {
											local2709 = true;
										} else if (local249 <= 1 && Static393.method6334(local1068)) {
											local2709 = true;
										}
									}
									if (!local2709 && Static678.anInt10816 == 0) {
										local1398 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
										if (local249 == 2) {
											Static243.method3607(local1128, 0, (String) null, -1, "<img=1>" + local1128, "<img=1>" + local1068, local1398, 24);
										} else if (local249 == 1) {
											Static243.method3607(local1128, 0, (String) null, -1, "<img=0>" + local1128, "<img=0>" + local1068, local1398, 24);
										} else {
											Static243.method3607(local1128, 0, (String) null, -1, local1128, local1068, local1398, 24);
										}
									}
									Static493.aClass109_175 = null;
									return true;
								} else if (Static583.aClass109_207 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
									if (Static515.aClass5_Sub23_Sub2_1.method8529() == 0) {
										Static257.aClass343Array4[local237] = new Class343();
									} else {
										Static515.aClass5_Sub23_Sub2_1.anInt9869--;
										Static257.aClass343Array4[local237] = new Class343(Static515.aClass5_Sub23_Sub2_1);
									}
									Static493.aClass109_175 = null;
									Static463.anInt7898 = Static261.anInt4525;
									return true;
								} else if (Static142.aClass109_59 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
									local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
									local918 = (local82 & 0x1) == 1;
									while (Static327.anInt5853 > Static515.aClass5_Sub23_Sub2_1.anInt9869) {
										local249 = Static515.aClass5_Sub23_Sub2_1.method8499();
										local253 = Static515.aClass5_Sub23_Sub2_1.method8519();
										local257 = 0;
										if (local253 != 0) {
											local257 = Static515.aClass5_Sub23_Sub2_1.method8529();
											if (local257 == 255) {
												local257 = Static515.aClass5_Sub23_Sub2_1.method8527();
											}
										}
										Static454.method6680(local918, local253 - 1, local249, local257, local237);
									}
									Static377.anIntArray373[Static469.anInt7969++ & 0x1F] = local237;
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static115.aClass109_49) {
									Static416.aString133 = Static327.anInt5853 <= 2 ? Static582.aClass335_27.method8349(Static323.anInt5795) : Static515.aClass5_Sub23_Sub2_1.method8497();
									Static195.anInt3175 = Static327.anInt5853 > 0 ? Static515.aClass5_Sub23_Sub2_1.method8519() : -1;
									if (Static195.anInt3175 == 65535) {
										Static195.anInt3175 = -1;
									}
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static296.aClass109_221) {
									Static539.anInt9219 = Static515.aClass5_Sub23_Sub2_1.method8500();
									Static583.anInt9776 = Static515.aClass5_Sub23_Sub2_1.method8500();
									Static493.aClass109_175 = null;
									return true;
								} else if (Static312.aClass109_118 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
									local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
									Static188.method2727();
									Static66.method1087(local237, local1128);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static520.aClass109_185 == Static493.aClass109_175) {
									Static413.aClass118_1.method2144();
									Static649.anInt5975 += 32;
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static600.aClass109_210) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
									local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
									Static188.method2727();
									Static397.method5810(local237, local82);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static393.aClass109_157) {
									Static182.method2666(Static515.aClass5_Sub23_Sub2_1.method8497());
									Static493.aClass109_175 = null;
									return true;
								} else if (Static182.aClass109_66 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8527();
									local82 = Static515.aClass5_Sub23_Sub2_1.method8527();
									@Pc(3381) Class5_Sub50 local3381 = Static457.method6722(Static260.aClass387_48, Static80.aClass313_1);
									local3381.aClass5_Sub23_Sub2_2.method8486(local82);
									local3381.aClass5_Sub23_Sub2_2.method8486(local237);
									Static494.method7120(local3381);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static475.aClass109_169 == Static493.aClass109_175) {
									Static515.aClass5_Sub23_Sub2_1.anInt9869 += 28;
									if (Static515.aClass5_Sub23_Sub2_1.method8512()) {
										Static93.method8786(Static515.aClass5_Sub23_Sub2_1, Static515.aClass5_Sub23_Sub2_1.anInt9869 - 28);
									}
									Static493.aClass109_175 = null;
									return true;
								} else if (Static537.aClass109_84 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
									local82 = Static515.aClass5_Sub23_Sub2_1.method8503();
									Static188.method2727();
									Static110.method1582(local82, local237);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static267.aClass109_103 == Static493.aClass109_175) {
									Static48.method766(Static327.anInt5853, Static515.aClass5_Sub23_Sub2_1);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static40.aClass109_19) {
									Static345.anInt6091 = Static515.aClass5_Sub23_Sub2_1.method8508() << 3;
									Static309.anInt5494 = Static515.aClass5_Sub23_Sub2_1.method8536() << 3;
									Static68.anInt1099 = Static515.aClass5_Sub23_Sub2_1.method8529();
									for (@Pc(3484) Class5_Sub25 local3484 = (Class5_Sub25) Static466.aClass291_33.method6987(); local3484 != null; local3484 = (Class5_Sub25) Static466.aClass291_33.method6989()) {
										local82 = (int) (local3484.aLong314 >> 28 & 0x3L);
										local245 = (int) (local3484.aLong314 & 0x3FFFL);
										local249 = local245 - Static622.anInt10188;
										local253 = (int) (local3484.aLong314 >> 14 & 0x3FFFL);
										local257 = local253 - Static668.anInt10683;
										if (local82 == Static68.anInt1099 && Static309.anInt5494 <= local249 && local249 < Static309.anInt5494 + 8 && Static345.anInt6091 <= local257 && Static345.anInt6091 + 8 > local257) {
											local3484.method9327(1);
											if (local249 >= 0 && local257 >= 0 && local249 < Static544.anInt9261 && local257 < Static282.anInt4887) {
												Static619.method3009(local257, local249, Static68.anInt1099);
											}
										}
									}
									@Pc(3596) Class5_Sub44 local3596;
									for (local3596 = (Class5_Sub44) Static298.aClass102_38.method1916(); local3596 != null; local3596 = (Class5_Sub44) Static298.aClass102_38.method1915()) {
										if (local3596.anInt8141 >= Static309.anInt5494 && Static309.anInt5494 + 8 > local3596.anInt8141 && Static345.anInt6091 <= local3596.anInt8152 && Static345.anInt6091 + 8 > local3596.anInt8152 && Static68.anInt1099 == local3596.anInt8144) {
											local3596.aBoolean609 = true;
										}
									}
									for (local3596 = (Class5_Sub44) Static605.aClass102_70.method1916(); local3596 != null; local3596 = (Class5_Sub44) Static605.aClass102_70.method1915()) {
										if (local3596.anInt8141 >= Static309.anInt5494 && local3596.anInt8141 < Static309.anInt5494 + 8 && local3596.anInt8152 >= Static345.anInt6091 && local3596.anInt8152 < Static345.anInt6091 + 8 && local3596.anInt8144 == Static68.anInt1099) {
											local3596.aBoolean609 = true;
										}
									}
									Static493.aClass109_175 = null;
									return true;
								} else if (Static93.aClass109_215 == Static493.aClass109_175) {
									Static12.method239(Static483.aClass370_17);
									Static493.aClass109_175 = null;
									return true;
								} else if (Static493.aClass109_175 == Static273.aClass109_105) {
									if (Static416.method8829(Static107.anInt1746)) {
										Static142.anInt2314 = (int) ((float) Static515.aClass5_Sub23_Sub2_1.method8519() * 2.5F);
									} else {
										Static142.anInt2314 = Static515.aClass5_Sub23_Sub2_1.method8519() * 30;
									}
									Static45.anInt10277 = Static261.anInt4525;
									Static493.aClass109_175 = null;
									return true;
								} else if (Static339.aClass109_121 == Static493.aClass109_175) {
									local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
									local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
									Static188.method2727();
									Static489.method7067(local237, true, local82);
									Static493.aClass109_175 = null;
									return true;
								} else {
									@Pc(3827) long local3827;
									if (Static3.aClass109_6 == Static493.aClass109_175) {
										local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
										local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
										local1068 = local1128;
										if (local1124) {
											local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
										}
										local1675 = Static515.aClass5_Sub23_Sub2_1.method8509();
										local984 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
										local3827 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
										local787 = Static515.aClass5_Sub23_Sub2_1.method8529();
										@Pc(3837) long local3837 = (local984 << 32) + local3827;
										local558 = false;
										local501 = 0;
										while (true) {
											if (local501 >= 100) {
												if (local787 <= 1) {
													if (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721) {
														local558 = true;
													} else if (Static393.method6334(local1068)) {
														local558 = true;
													}
												}
												break;
											}
											if (Static36.aLongArray8[local501] == local3837) {
												local558 = true;
												break;
											}
											local501++;
										}
										if (!local558 && Static678.anInt10816 == 0) {
											Static36.aLongArray8[Static482.anInt8134] = local3837;
											Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
											@Pc(3924) String local3924 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
											if (local787 == 2 || local787 == 3) {
												Static243.method3607(local1128, 0, Static375.method5507(local1675), -1, "<img=1>" + local1128, "<img=1>" + local1068, local3924, 9);
											} else if (local787 == 1) {
												Static243.method3607(local1128, 0, Static375.method5507(local1675), -1, "<img=0>" + local1128, "<img=0>" + local1068, local3924, 9);
											} else {
												Static243.method3607(local1128, 0, Static375.method5507(local1675), -1, local1128, local1068, local3924, 9);
											}
										}
										Static493.aClass109_175 = null;
										return true;
									} else if (Static51.aClass109_26 == Static493.aClass109_175) {
										local1056 = Static515.aClass5_Sub23_Sub2_1.method8497();
										local1128 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
										Static177.method2584(local1056, local1128, local1056, 0, 6, local1056);
										Static493.aClass109_175 = null;
										return true;
									} else if (Static493.aClass109_175 == Static372.aClass109_172) {
										local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
										local82 = Static515.aClass5_Sub23_Sub2_1.method8527();
										Static188.method2727();
										Static378.method5531(local82, local237);
										Static493.aClass109_175 = null;
										return true;
									} else {
										@Pc(4098) Class5_Sub49 local4098;
										if (Static502.aClass109_176 == Static493.aClass109_175) {
											local237 = Static515.aClass5_Sub23_Sub2_1.method8523();
											local82 = Static515.aClass5_Sub23_Sub2_1.method8523();
											Static188.method2727();
											@Pc(4091) Class5_Sub49 local4091 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local82, 1);
											local4098 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local237, 1);
											if (local4098 != null) {
												Static372.method7048(local4098, local4091 == null || local4098.anInt9322 != local4091.anInt9322, false);
											}
											if (local4091 != null) {
												local4091.method9327(1);
												Static549.aClass291_37.method6984((long) local237, local4091);
											}
											@Pc(4136) Class73 local4136 = method3831(local82);
											if (local4136 != null) {
												Static298.method4399(local4136);
											}
											local4136 = method3831(local237);
											if (local4136 != null) {
												Static298.method4399(local4136);
												Static547.method7962(local4136, true);
											}
											if (Static390.anInt6669 != -1) {
												Static190.method2757(Static390.anInt6669, 1);
											}
											Static493.aClass109_175 = null;
											return true;
										} else if (Static493.aClass109_175 == Static46.aClass109_24) {
											local1056 = Static515.aClass5_Sub23_Sub2_1.method8497();
											local82 = Static515.aClass5_Sub23_Sub2_1.method8503();
											Static188.method2727();
											Static86.method1311(local82, local1056);
											Static493.aClass109_175 = null;
											return true;
										} else {
											@Pc(4207) byte local4207;
											if (Static513.aClass109_182 == Static493.aClass109_175) {
												local4207 = Static515.aClass5_Sub23_Sub2_1.method8521();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8500();
												Static188.method2727();
												Static666.method9172(local4207, local82);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static561.aClass109_196 == Static493.aClass109_175) {
												Static493.aClass109_175 = null;
												return false;
											} else if (Static285.aClass109_113 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8516();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8527();
												local245 = Static515.aClass5_Sub23_Sub2_1.method8525();
												Static188.method2727();
												Static170.method2481(local245, local82, local237);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static172.aClass109_64) {
												local4207 = Static515.aClass5_Sub23_Sub2_1.method8508();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8518();
												Static188.method2727();
												Static140.method1965(local4207, local82);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static74.aClass109_33 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8527();
												local245 = Static515.aClass5_Sub23_Sub2_1.method8518();
												Static188.method2727();
												Static247.method3634(local245, 5, local237, local82);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static294.aClass109_115) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8525();
												Static188.method2727();
												Static528.method7596(local237, local82);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static270.aClass109_104) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
												local82 = local237 >> 5;
												local245 = local237 & 0x1F;
												if (local245 == 0) {
													Static598.aClass28Array1[local82] = null;
													Static493.aClass109_175 = null;
													return true;
												}
												@Pc(4362) Class28 local4362 = new Class28();
												local4362.anInt500 = local245;
												local4362.anInt505 = Static515.aClass5_Sub23_Sub2_1.method8529();
												if (local4362.anInt505 >= 0 && local4362.anInt505 < Static56.aClass134Array10.length) {
													if (local4362.anInt500 == 1 || local4362.anInt500 == 10) {
														local4362.anInt502 = Static515.aClass5_Sub23_Sub2_1.method8519();
														Static515.aClass5_Sub23_Sub2_1.anInt9869 += 6;
													} else if (local4362.anInt500 >= 2 && local4362.anInt500 <= 6) {
														if (local4362.anInt500 == 2) {
															local4362.anInt503 = 256;
															local4362.anInt498 = 256;
														}
														if (local4362.anInt500 == 3) {
															local4362.anInt498 = 256;
															local4362.anInt503 = 0;
														}
														if (local4362.anInt500 == 4) {
															local4362.anInt503 = 512;
															local4362.anInt498 = 256;
														}
														if (local4362.anInt500 == 5) {
															local4362.anInt503 = 256;
															local4362.anInt498 = 0;
														}
														if (local4362.anInt500 == 6) {
															local4362.anInt503 = 256;
															local4362.anInt498 = 512;
														}
														local4362.anInt500 = 2;
														local4362.anInt499 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local4362.anInt503 += Static515.aClass5_Sub23_Sub2_1.method8519() - Static622.anInt10188 << 9;
														local4362.anInt498 += Static515.aClass5_Sub23_Sub2_1.method8519() - Static668.anInt10683 << 9;
														local4362.anInt497 = Static515.aClass5_Sub23_Sub2_1.method8529() << 2;
														local4362.anInt504 = Static515.aClass5_Sub23_Sub2_1.method8519();
													}
													local4362.anInt501 = Static515.aClass5_Sub23_Sub2_1.method8519();
													if (local4362.anInt501 == 65535) {
														local4362.anInt501 = -1;
													}
													Static598.aClass28Array1[local82] = local4362;
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static628.aClass109_214 == Static493.aClass109_175) {
												Static12.method239(Static290.aClass370_9);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static41.aClass109_20 == Static493.aClass109_175) {
												Static12.method239(Static319.aClass370_10);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static217.aClass109_79 == Static493.aClass109_175) {
												Static309.anInt5494 = Static515.aClass5_Sub23_Sub2_1.method8536() << 3;
												Static68.anInt1099 = Static515.aClass5_Sub23_Sub2_1.method8529();
												Static345.anInt6091 = Static515.aClass5_Sub23_Sub2_1.method8508() << 3;
												while (Static515.aClass5_Sub23_Sub2_1.anInt9869 < Static327.anInt5853) {
													@Pc(4615) Class370 local4615 = Static121.method1704()[Static515.aClass5_Sub23_Sub2_1.method8529()];
													Static12.method239(local4615);
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static90.aClass109_37) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8527();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8506();
												Static413.aClass118_1.method2142(local82, local237);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static54.aClass109_27 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8519();
												Static413.aClass118_1.method2142(local82, local237);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static358.aClass109_125) {
												Static141.anInt4798 = Static515.aClass5_Sub23_Sub2_1.method8516();
												Static45.anInt10277 = Static261.anInt4525;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static601.aClass109_211) {
												Static309.anInt5494 = Static515.aClass5_Sub23_Sub2_1.method8521() << 3;
												Static68.anInt1099 = Static515.aClass5_Sub23_Sub2_1.method8500();
												Static345.anInt6091 = Static515.aClass5_Sub23_Sub2_1.method8508() << 3;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static250.aClass109_95 == Static493.aClass109_175) {
												Static12.method239(Static622.aClass370_20);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static60.aClass109_29 == Static493.aClass109_175) {
												Static642.anInt10431 = Static261.anInt4525;
												local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
												if (Static327.anInt5853 != 1) {
													if (local1124) {
														Static514.aClass205_3 = new Class205(Static515.aClass5_Sub23_Sub2_1);
													} else {
														Static209.aClass205_2 = new Class205(Static515.aClass5_Sub23_Sub2_1);
													}
													Static493.aClass109_175 = null;
													return true;
												}
												if (local1124) {
													Static514.aClass205_3 = null;
												} else {
													Static209.aClass205_2 = null;
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static579.aClass109_206 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
												@Pc(4807) boolean local4807 = (local237 & 0x1) == 1;
												local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
												local1372 = Static515.aClass5_Sub23_Sub2_1.method8497();
												if (local1372.equals("")) {
													local1372 = local1068;
												}
												local1374 = Static515.aClass5_Sub23_Sub2_1.method8497();
												local1398 = Static515.aClass5_Sub23_Sub2_1.method8497();
												if (local1398.equals("")) {
													local1398 = local1374;
												}
												if (local4807) {
													for (local261 = 0; local261 < Static453.anInt7761; local261++) {
														if (Static30.aStringArray4[local261].equals(local1398)) {
															Static197.aStringArray73[local261] = local1068;
															Static30.aStringArray4[local261] = local1372;
															Static430.aStringArray43[local261] = local1374;
															Static546.aStringArray71[local261] = local1398;
															break;
														}
													}
												} else {
													Static197.aStringArray73[Static453.anInt7761] = local1068;
													Static30.aStringArray4[Static453.anInt7761] = local1372;
													Static430.aStringArray43[Static453.anInt7761] = local1374;
													Static546.aStringArray71[Static453.anInt7761] = local1398;
													Static24.aBooleanArray1[Static453.anInt7761] = (local237 & 0x2) == 2;
													Static453.anInt7761++;
												}
												Static148.anInt2385 = Static261.anInt4525;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static238.aClass109_88 == Static493.aClass109_175) {
												Static600.method8644(Static541.aBoolean711);
												Static493.aClass109_175 = null;
												return false;
											} else if (Static444.aClass109_164 == Static493.aClass109_175) {
												local4207 = Static515.aClass5_Sub23_Sub2_1.method8488();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
												Static413.aClass118_1.method2147(local82, local4207);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static80.aClass109_34 == Static493.aClass109_175) {
												Static12.method239(Static452.aClass370_12);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static631.aClass109_217) {
												Static12.method239(Static549.aClass370_16);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static624.aClass109_213 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8483();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8500();
												local245 = Static515.aClass5_Sub23_Sub2_1.method8515();
												local249 = Static515.aClass5_Sub23_Sub2_1.method8505();
												local253 = Static515.aClass5_Sub23_Sub2_1.method8505();
												Static188.method2727();
												Static261.aBooleanArray7[local253] = true;
												Static311.anIntArray306[local253] = local249;
												Static24.anIntArray29[local253] = local82;
												Static166.anIntArray148[local253] = local237;
												Static547.anIntArray521[local253] = local245;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static297.aClass109_116) {
												Static620.anInt10173 = Static515.aClass5_Sub23_Sub2_1.method8511();
												Static31.aBoolean46 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static425.aClass109_154 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8474();
												local82 = local237 >> 28 & 0x3;
												local245 = local237 >> 14 & 0x3FFF;
												local249 = local237 & 0x3FFF;
												local253 = Static515.aClass5_Sub23_Sub2_1.method8483();
												local257 = local253 >> 2;
												local261 = local253 & 0x3;
												local267 = Static680.anIntArray624[local257];
												local295 = Static515.aClass5_Sub23_Sub2_1.method8519();
												local249 -= Static668.anInt10683;
												local245 -= Static622.anInt10188;
												if (local295 == 65535) {
													local295 = -1;
												}
												Static459.method6734(local267, local261, local82, local257, local245, local249, local295);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static293.aClass109_114) {
												local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
												local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
												local1068 = local1128;
												if (local1124) {
													local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
												}
												local1675 = Static515.aClass5_Sub23_Sub2_1.method8509();
												local984 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
												local3827 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
												local787 = Static515.aClass5_Sub23_Sub2_1.method8529();
												local793 = Static515.aClass5_Sub23_Sub2_1.method8519();
												@Pc(5178) long local5178 = (local984 << 32) + local3827;
												@Pc(5180) boolean local5180 = false;
												local742 = 0;
												while (true) {
													if (local742 >= 100) {
														if (local787 <= 1 && Static393.method6334(local1068)) {
															local5180 = true;
														}
														break;
													}
													if (local5178 == Static36.aLongArray8[local742]) {
														local5180 = true;
														break;
													}
													local742++;
												}
												if (!local5180 && Static678.anInt10816 == 0) {
													Static36.aLongArray8[Static482.anInt8134] = local5178;
													Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
													@Pc(5249) String local5249 = Static502.aClass259_2.method6241(local793).method672(Static515.aClass5_Sub23_Sub2_1);
													if (local787 == 2) {
														Static243.method3607(local1128, 0, Static375.method5507(local1675), local793, "<img=1>" + local1128, "<img=1>" + local1068, local5249, 20);
													} else if (local787 == 1) {
														Static243.method3607(local1128, 0, Static375.method5507(local1675), local793, "<img=0>" + local1128, "<img=0>" + local1068, local5249, 20);
													} else {
														Static243.method3607(local1128, 0, Static375.method5507(local1675), local793, local1128, local1068, local5249, 20);
													}
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static352.aClass109_123) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8506();
												if (local82 == 65535) {
													local82 = -1;
												}
												local245 = Static515.aClass5_Sub23_Sub2_1.method8503();
												Static188.method2727();
												Static636.method8888(local82, local245, local237);
												@Pc(5376) Class204 local5376 = Static201.aClass127_1.method2501(local82);
												Static282.method4151(local245, local5376.anInt5719, local5376.anInt5687, local5376.anInt5713);
												Static577.method8286(local245, local5376.anInt5673, local5376.anInt5694, local5376.anInt5686);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static107.aClass109_43 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
												if (local237 == 65535) {
													local237 = -1;
												}
												local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
												Static188.method2727();
												Static247.method3634(local237, 2, local82, -1);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static132.aClass109_56 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8519();
												local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
												Static188.method2727();
												if (Static489.aClass73ArrayArray2[local237] != null) {
													for (local249 = local82; local249 < local245; local249++) {
														local253 = Static515.aClass5_Sub23_Sub2_1.method8510();
														if (local249 < Static489.aClass73ArrayArray2[local237].length && Static489.aClass73ArrayArray2[local237][local249] != null) {
															Static489.aClass73ArrayArray2[local237][local249].anInt1372 = local253;
														}
													}
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static366.aClass109_127) {
												Static417.aBoolean554 = Static515.aClass5_Sub23_Sub2_1.method8505() == 1;
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static565.aClass109_219) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
												if (local237 == 65535) {
													local237 = -1;
												}
												local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
												local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
												local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
												local253 = Static515.aClass5_Sub23_Sub2_1.method8519();
												Static391.method5714(local249, local245, local237, local253, local82, false);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static634.aClass109_218 == Static493.aClass109_175) {
												Static642.anInt10431 = Static261.anInt4525;
												local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
												@Pc(5582) Class365 local5582 = new Class365(Static515.aClass5_Sub23_Sub2_1);
												@Pc(5586) Class205 local5586;
												if (local1124) {
													local5586 = Static514.aClass205_3;
												} else {
													local5586 = Static209.aClass205_2;
												}
												local5582.method8773(local5586);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static677.aClass109_226 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
												Static188.method2727();
												Static441.method6513(local237);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static452.aClass109_160) {
												Static208.method7710();
												Static493.aClass109_175 = null;
												return false;
											} else if (Static263.aClass109_100 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8500();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
												if (local82 == 65535) {
													local82 = -1;
												}
												local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
												local249 = Static515.aClass5_Sub23_Sub2_1.method8500();
												if (local249 >= 1 && local249 <= 8) {
													if (local1068.equalsIgnoreCase("null")) {
														local1068 = null;
													}
													Static560.aStringArray67[local249 - 1] = local1068;
													Static351.anIntArray340[local249 - 1] = local82;
													Static478.aBooleanArray19[local249 - 1] = local237 == 0;
												}
												Static493.aClass109_175 = null;
												return true;
											} else if (Static446.aClass109_165 == Static493.aClass109_175) {
												Static211.aClass103_4 = Static469.method6847(Static515.aClass5_Sub23_Sub2_1.method8529());
												Static493.aClass109_175 = null;
												return true;
											} else if (Static521.aClass109_186 == Static493.aClass109_175) {
												Static600.method8644(false);
												Static493.aClass109_175 = null;
												return false;
											} else if (Static493.aClass109_175 == Static448.aClass109_166) {
												Static524.method7585(Static327.anInt5853, Static515.aClass5_Sub23_Sub2_1, Static294.aClass230_3);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static84.aClass109_35) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8500();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8500();
												if (local82 == 255) {
													local237 = -1;
													local82 = -1;
												}
												Static178.method2589(local237, local82);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static493.aClass109_175 == Static563.aClass109_198) {
												Static12.method239(Static539.aClass370_15);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static242.aClass109_91 == Static493.aClass109_175) {
												Static188.method2727();
												Static110.method1585();
												Static493.aClass109_175 = null;
												return true;
											} else if (Static433.aClass109_158 == Static493.aClass109_175) {
												Static12.method239(Static42.aClass370_4);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static110.aClass109_45 == Static493.aClass109_175) {
												Static12.method239(Static641.aClass370_21);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static519.aClass109_184 == Static493.aClass109_175) {
												local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
												@Pc(5830) byte[] local5830 = new byte[Static327.anInt5853 - 1];
												Static515.aClass5_Sub23_Sub2_1.method8487(local5830, Static327.anInt5853 - 1, 0);
												Static81.method1250(local5830, local1124);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static401.aClass109_147 == Static493.aClass109_175) {
												local1056 = Static515.aClass5_Sub23_Sub2_1.method8497();
												@Pc(5859) Object[] local5859 = new Object[local1056.length() + 1];
												for (local245 = local1056.length() - 1; local245 >= 0; local245--) {
													if (local1056.charAt(local245) == 's') {
														local5859[local245 + 1] = Static515.aClass5_Sub23_Sub2_1.method8497();
													} else {
														local5859[local245 + 1] = Integer.valueOf(Static515.aClass5_Sub23_Sub2_1.method8527());
													}
												}
												local5859[0] = Integer.valueOf(Static515.aClass5_Sub23_Sub2_1.method8527());
												Static188.method2727();
												@Pc(5919) Class5_Sub3 local5919 = new Class5_Sub3();
												local5919.anObjectArray1 = local5859;
												Static173.method2520(local5919);
												Static493.aClass109_175 = null;
												return true;
											} else if (Static481.aClass109_171 == Static493.aClass109_175) {
												local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
												local82 = Static515.aClass5_Sub23_Sub2_1.method8518();
												Static188.method2727();
												Static110.method1581(local237, local82);
												Static493.aClass109_175 = null;
												return true;
											} else {
												@Pc(6004) Class349 local6004;
												if (Static659.aClass109_222 == Static493.aClass109_175) {
													local1056 = Static515.aClass5_Sub23_Sub2_1.method8497();
													local918 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
													if (local918) {
														local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
													} else {
														local1128 = local1056;
													}
													local249 = Static515.aClass5_Sub23_Sub2_1.method8519();
													@Pc(5987) byte local5987 = Static515.aClass5_Sub23_Sub2_1.method8488();
													local2406 = false;
													if (local5987 == -128) {
														local2406 = true;
													}
													if (local2406) {
														if (Static7.anInt86 == 0) {
															Static493.aClass109_175 = null;
															return true;
														}
														for (local261 = 0; Static7.anInt86 > local261 && (!Static191.aClass349Array1[local261].aString127.equals(local1128) || local249 != Static191.aClass349Array1[local261].anInt10075); local261++) {
														}
														if (Static7.anInt86 > local261) {
															while (Static7.anInt86 - 1 > local261) {
																Static191.aClass349Array1[local261] = Static191.aClass349Array1[local261 + 1];
																local261++;
															}
															Static7.anInt86--;
															Static191.aClass349Array1[Static7.anInt86] = null;
														}
													} else {
														local2292 = Static515.aClass5_Sub23_Sub2_1.method8497();
														local6004 = new Class349();
														local6004.aString127 = local1128;
														local6004.aString128 = local1056;
														local6004.aString130 = Static250.method3679(local6004.aString127);
														local6004.aString129 = local2292;
														local6004.anInt10075 = local249;
														local6004.aByte142 = local5987;
														for (local295 = Static7.anInt86 - 1; local295 >= 0; local295--) {
															local787 = Static191.aClass349Array1[local295].aString130.compareTo(local6004.aString130);
															if (local787 == 0) {
																Static191.aClass349Array1[local295].anInt10075 = local249;
																Static191.aClass349Array1[local295].aByte142 = local5987;
																Static191.aClass349Array1[local295].aString129 = local2292;
																if (local1128.equals(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62)) {
																	Static677.aByte150 = local5987;
																}
																Static493.aClass109_175 = null;
																Static459.anInt7835 = Static261.anInt4525;
																return true;
															}
															if (local787 < 0) {
																break;
															}
														}
														if (Static7.anInt86 >= Static191.aClass349Array1.length) {
															Static493.aClass109_175 = null;
															return true;
														}
														for (local787 = Static7.anInt86 - 1; local787 > local295; local787--) {
															Static191.aClass349Array1[local787 + 1] = Static191.aClass349Array1[local787];
														}
														if (Static7.anInt86 == 0) {
															Static191.aClass349Array1 = new Class349[100];
														}
														Static191.aClass349Array1[local295 + 1] = local6004;
														Static7.anInt86++;
														if (local1128.equals(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62)) {
															Static677.aByte150 = local5987;
														}
													}
													Static459.anInt7835 = Static261.anInt4525;
													Static493.aClass109_175 = null;
													return true;
												} else if (Static493.aClass109_175 == Static240.aClass109_90) {
													local237 = Static515.aClass5_Sub23_Sub2_1.method8515();
													local82 = Static515.aClass5_Sub23_Sub2_1.method8503();
													Static188.method2727();
													Static140.method1965(local82, local237);
													Static493.aClass109_175 = null;
													return true;
												} else if (Static256.aClass109_99 == Static493.aClass109_175) {
													Static438.anInt7510 = Static261.anInt4525;
													local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
													if (Static327.anInt5853 != 1) {
														if (local1124) {
															Static335.aClass5_Sub53_6 = new Class5_Sub53(Static515.aClass5_Sub23_Sub2_1);
														} else {
															Static208.aClass5_Sub53_9 = new Class5_Sub53(Static515.aClass5_Sub23_Sub2_1);
														}
														Static493.aClass109_175 = null;
														return true;
													}
													Static493.aClass109_175 = null;
													if (local1124) {
														Static335.aClass5_Sub53_6 = null;
													} else {
														Static208.aClass5_Sub53_9 = null;
													}
													return true;
												} else if (Static415.aClass109_204 == Static493.aClass109_175) {
													Static12.method239(Static476.aClass370_13);
													Static493.aClass109_175 = null;
													return true;
												} else if (Static443.aClass109_163 == Static493.aClass109_175) {
													Static188.method2727();
													Static433.method6419();
													Static493.aClass109_175 = null;
													return true;
												} else if (Static493.aClass109_175 == Static232.aClass109_87) {
													Static12.method239(Static202.aClass370_5);
													Static493.aClass109_175 = null;
													return true;
												} else {
													@Pc(6397) byte[] local6397;
													if (Static402.aClass109_150 == Static493.aClass109_175) {
														if (Static517.aFrame1 != null) {
															Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
														}
														local6397 = new byte[Static327.anInt5853];
														Static515.aClass5_Sub23_Sub2_1.method8553(Static327.anInt5853, local6397);
														local1128 = Static455.method6706(local6397, 0, Static327.anInt5853);
														local1068 = "opensn";
														if (!Static301.aBoolean679 || Static606.method8454(local1128, Static294.aClass230_3, 1, local1068).anInt10206 == 2) {
															Static166.method2390(local1128, true, local1068, Static294.aClass230_3, Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1);
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static503.aClass109_177 == Static493.aClass109_175) {
														Static540.method5814((byte) -28);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static141.aClass109_107) {
														for (local237 = 0; local237 < Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1.length; local237++) {
															if (Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local237] != null) {
																Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local237].anIntArray412 = null;
																Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local237].anInt7023 = -1;
															}
														}
														for (local82 = 0; local82 < Static230.anInt3776; local82++) {
															Static85.aClass5_Sub35Array1[local82].aClass8_Sub1_Sub3_Sub2_Sub2_2.anIntArray412 = null;
															Static85.aClass5_Sub35Array1[local82].aClass8_Sub1_Sub3_Sub2_Sub2_2.anInt7023 = -1;
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static401.aClass109_148 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8483();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8483();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8515() << 2;
														local253 = Static515.aClass5_Sub23_Sub2_1.method8505();
														Static188.method2727();
														Static663.method1227(local82, local249, local245, local237, local253);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static206.aClass109_74 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
														if (local237 == 65535) {
															local237 = -1;
														}
														local82 = Static515.aClass5_Sub23_Sub2_1.method8518();
														if (local82 == 65535) {
															local82 = -1;
														}
														local245 = Static515.aClass5_Sub23_Sub2_1.method8474();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8503();
														Static188.method2727();
														for (local253 = local82; local253 <= local237; local253++) {
															local984 = (long) local253 + ((long) local245 << 32);
															local990 = (Class5_Sub45) Static131.aClass291_11.method6993(local984, 1);
															if (local990 != null) {
																local1004 = new Class5_Sub45(local249, local990.anInt8276);
																local990.method9327(1);
															} else if (local253 == -1) {
																local1004 = new Class5_Sub45(local249, method3831(local245).aClass5_Sub45_1.anInt8276);
															} else {
																local1004 = new Class5_Sub45(local249, -1);
															}
															Static131.aClass291_11.method6984(local984, local1004);
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static119.aClass109_50 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8500();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8515();
														if (local82 == 65535) {
															local82 = -1;
														}
														local245 = Static515.aClass5_Sub23_Sub2_1.method8483();
														Static474.method6908(local82, local237, local245);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static568.aClass109_202 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8500();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8532();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
														if (local245 == 65535) {
															local245 = -1;
														}
														Static530.method7638(local245, local82, local237);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static68.aClass109_31) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
														Static188.method2727();
														Static388.method5660(local237);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static416.aClass109_216) {
														local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
														local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
														local1133 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
														local1138 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
														local261 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local3827 = local1138 + (local1133 << 32);
														@Pc(6800) boolean local6800 = false;
														@Pc(6809) Class5_Sub53 local6809 = local1124 ? Static335.aClass5_Sub53_6 : Static208.aClass5_Sub53_9;
														if (local6809 == null) {
															local6800 = true;
														} else {
															label2191: {
																for (local823 = 0; local823 < 100; local823++) {
																	if (Static36.aLongArray8[local823] == local3827) {
																		local6800 = true;
																		break label2191;
																	}
																}
																if (local261 <= 1) {
																	if (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721) {
																		local6800 = true;
																	} else if (Static393.method6334(local1128)) {
																		local6800 = true;
																	}
																}
															}
														}
														if (!local6800 && Static678.anInt10816 == 0) {
															Static36.aLongArray8[Static482.anInt8134] = local3827;
															Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
															local1779 = Static513.method7487(Static122.method1708(Static515.aClass5_Sub23_Sub2_1));
															local323 = local1124 ? 41 : 44;
															if (local261 == 2 || local261 == 3) {
																Static243.method3607(local1128, 0, local6809.aString136, -1, "<img=1>" + local1128, "<img=1>" + local1128, local1779, local323);
															} else if (local261 == 1) {
																Static243.method3607(local1128, 0, local6809.aString136, -1, "<img=0>" + local1128, "<img=0>" + local1128, local1779, local323);
															} else {
																Static243.method3607(local1128, 0, local6809.aString136, -1, local1128, local1128, local1779, local323);
															}
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static551.aClass109_193) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
														Static188.method2727();
														Static493.aClass109_175 = null;
														if (local237 == -1) {
															Static272.anInt4763 = -1;
															Static651.anInt10529 = -1;
														} else {
															local82 = local237 >> 14 & 0x3FFF;
															local82 -= Static622.anInt10188;
															local245 = local237 & 0x3FFF;
															local245 -= Static668.anInt10683;
															if (local82 < 0) {
																local82 = 0;
															} else if (local82 >= Static544.anInt9261) {
																local82 = Static544.anInt9261;
															}
															if (local245 < 0) {
																local245 = 0;
															} else if (local245 >= Static282.anInt4887) {
																local245 = Static282.anInt4887;
															}
															Static651.anInt10529 = (local82 << 9) + 256;
															Static272.anInt4763 = (local245 << 9) + 256;
														}
														return true;
													} else if (Static91.aClass109_38 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local918 = (local82 & 0x1) == 1;
														Static282.method4148(local237, local918);
														local249 = Static515.aClass5_Sub23_Sub2_1.method8519();
														for (local253 = 0; local253 < local249; local253++) {
															local257 = Static515.aClass5_Sub23_Sub2_1.method8518();
															local261 = Static515.aClass5_Sub23_Sub2_1.method8483();
															if (local261 == 255) {
																local261 = Static515.aClass5_Sub23_Sub2_1.method8474();
															}
															Static454.method6680(local918, local257 - 1, local253, local261, local237);
														}
														Static377.anIntArray373[Static469.anInt7969++ & 0x1F] = local237;
														Static493.aClass109_175 = null;
														return true;
													} else if (Static503.aClass109_178 == Static493.aClass109_175) {
														Static459.anInt7835 = Static261.anInt4525;
														if (Static327.anInt5853 == 0) {
															Static7.anInt86 = 0;
															Static493.aClass109_175 = null;
															Static119.aString33 = null;
															Static191.aClass349Array1 = null;
															Static81.aString20 = null;
															return true;
														}
														Static81.aString20 = Static515.aClass5_Sub23_Sub2_1.method8497();
														local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
														if (local1124) {
															Static515.aClass5_Sub23_Sub2_1.method8497();
														}
														@Pc(7223) long local7223 = Static515.aClass5_Sub23_Sub2_1.method8509();
														Static119.aString33 = Static447.method6658(local7223);
														Static37.aByte15 = Static515.aClass5_Sub23_Sub2_1.method8488();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
														if (local249 == 255) {
															Static493.aClass109_175 = null;
															return true;
														}
														Static7.anInt86 = local249;
														@Pc(7250) Class349[] local7250 = new Class349[100];
														for (local257 = 0; local257 < Static7.anInt86; local257++) {
															local7250[local257] = new Class349();
															local7250[local257].aString128 = Static515.aClass5_Sub23_Sub2_1.method8497();
															local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
															if (local1124) {
																local7250[local257].aString127 = Static515.aClass5_Sub23_Sub2_1.method8497();
															} else {
																local7250[local257].aString127 = local7250[local257].aString128;
															}
															local7250[local257].aString130 = Static250.method3679(local7250[local257].aString127);
															local7250[local257].anInt10075 = Static515.aClass5_Sub23_Sub2_1.method8519();
															local7250[local257].aByte142 = Static515.aClass5_Sub23_Sub2_1.method8488();
															local7250[local257].aString129 = Static515.aClass5_Sub23_Sub2_1.method8497();
															if (local7250[local257].aString127.equals(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62)) {
																Static677.aByte150 = local7250[local257].aByte142;
															}
														}
														local295 = Static7.anInt86;
														while (local295 > 0) {
															local1967 = true;
															local295--;
															for (local787 = 0; local787 < local295; local787++) {
																if (local7250[local787].aString130.compareTo(local7250[local787 + 1].aString130) > 0) {
																	local6004 = local7250[local787];
																	local7250[local787] = local7250[local787 + 1];
																	local7250[local787 + 1] = local6004;
																	local1967 = false;
																}
															}
															if (local1967) {
																break;
															}
														}
														Static191.aClass349Array1 = local7250;
														Static493.aClass109_175 = null;
														return true;
													} else if (Static174.aClass109_65 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8506();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8523();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8505();
														Static188.method2727();
														local4098 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local82, 1);
														if (local4098 != null) {
															Static372.method7048(local4098, local237 != local4098.anInt9322, false);
														}
														Static470.method7565(local245, local237, local82, false);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static509.aClass109_180) {
														local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
														local1128 = Static515.aClass5_Sub23_Sub2_1.method8497();
														local1068 = local1128;
														if (local1124) {
															local1068 = Static515.aClass5_Sub23_Sub2_1.method8497();
														}
														local1675 = (long) Static515.aClass5_Sub23_Sub2_1.method8519();
														local984 = (long) Static515.aClass5_Sub23_Sub2_1.method8510();
														local267 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local295 = Static515.aClass5_Sub23_Sub2_1.method8519();
														@Pc(7544) long local7544 = local984 + (local1675 << 32);
														local320 = false;
														local323 = 0;
														while (true) {
															if (local323 >= 100) {
																if (local267 <= 1 && Static393.method6334(local1068)) {
																	local320 = true;
																}
																break;
															}
															if (local7544 == Static36.aLongArray8[local323]) {
																local320 = true;
																break;
															}
															local323++;
														}
														if (!local320 && Static678.anInt10816 == 0) {
															Static36.aLongArray8[Static482.anInt8134] = local7544;
															Static482.anInt8134 = (Static482.anInt8134 + 1) % 100;
															local1236 = Static502.aClass259_2.method6241(local295).method672(Static515.aClass5_Sub23_Sub2_1);
															if (local267 == 2) {
																Static243.method3607(local1128, 0, (String) null, local295, "<img=1>" + local1128, "<img=1>" + local1068, local1236, 18);
															} else if (local267 == 1) {
																Static243.method3607(local1128, 0, (String) null, local295, "<img=0>" + local1128, "<img=0>" + local1068, local1236, 18);
															} else {
																Static243.method3607(local1128, 0, (String) null, local295, local1128, local1068, local1236, 18);
															}
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static57.aClass109_28 == Static493.aClass109_175) {
														Static493.aClass109_175 = null;
														Static148.anInt2385 = Static261.anInt4525;
														Static205.anInt3334 = 1;
														return true;
													} else if (Static493.aClass109_175 == Static402.aClass109_149) {
														@Pc(7716) int[] local7716 = new int[4];
														for (local82 = 0; local82 < 4; local82++) {
															local7716[local82] = Static515.aClass5_Sub23_Sub2_1.method8506();
														}
														local245 = Static515.aClass5_Sub23_Sub2_1.method8515();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
														@Pc(7749) Class5_Sub35 local7749 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local245, 1);
														if (local7749 != null) {
															Static205.method2933(local7749.aClass8_Sub1_Sub3_Sub2_Sub2_2, local249, local7716);
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static212.aClass109_76) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
														if (local237 == 65535) {
															local237 = -1;
														}
														local82 = Static515.aClass5_Sub23_Sub2_1.method8474();
														Static188.method2727();
														Static247.method3634(local237, 1, local82, -1);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static200.aClass109_71) {
														Static12.method239(Static595.aClass370_19);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static256.aClass109_97 == Static493.aClass109_175) {
														Static12.method239(Static536.aClass370_14);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static566.aClass109_200) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8518();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8483();
														Static188.method2727();
														if (local82 == 2) {
															Static190.method2758();
														}
														Static390.anInt6669 = local237;
														Static366.method5408(local237);
														Static294.method4358(false);
														Static173.method2523(Static390.anInt6669);
														for (local245 = 0; local245 < 100; local245++) {
															Static386.aBooleanArray13[local245] = true;
														}
														Static493.aClass109_175 = null;
														return true;
													} else if (Static386.aClass109_137 == Static493.aClass109_175) {
														local1124 = Static515.aClass5_Sub23_Sub2_1.method8483() == 1;
														Static188.method2727();
														Static493.aClass109_175 = null;
														Static434.aBoolean573 = local1124;
														return true;
													} else if (Static586.aClass109_208 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8506();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8518();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8527();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8506();
														Static188.method2727();
														Static282.method4151(local245, local82, local249, local237);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static275.aClass109_106) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8483();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8506() << 2;
														local245 = Static515.aClass5_Sub23_Sub2_1.method8500();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8483();
														local253 = Static515.aClass5_Sub23_Sub2_1.method8529();
														Static188.method2727();
														Static46.method755(true, local237, local245, local249, local82, local253);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static129.aClass109_53) {
														Static438.anInt7510 = Static261.anInt4525;
														local1124 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
														@Pc(8001) Class56 local8001 = new Class56(Static515.aClass5_Sub23_Sub2_1);
														@Pc(8005) Class5_Sub53 local8005;
														if (local1124) {
															local8005 = Static335.aClass5_Sub53_6;
														} else {
															local8005 = Static208.aClass5_Sub53_9;
														}
														local8001.method874(local8005);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static372.aClass109_173) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8503();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8500();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8500();
														Static108.anIntArray94[local245] = local237;
														Static370.anIntArray580[local245] = local82;
														Static62.anIntArray51[local245] = 1;
														local249 = Static166.anIntArray149[local245] - 1;
														for (local253 = 0; local253 < local249; local253++) {
															if (local237 >= Class272.anIntArray456[local253]) {
																Static62.anIntArray51[local245] = local253 + 2;
															}
														}
														Static351.anIntArray338[Static242.anInt4080++ & 0x1F] = local245;
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static226.aClass109_81) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8515();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8518();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8527();
														Static188.method2727();
														Static666.method9174(local245, local82 + (local237 << 16));
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static1.aClass109_197) {
														if (Static517.aFrame1 != null) {
															Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
														}
														local6397 = new byte[Static327.anInt5853];
														Static515.aClass5_Sub23_Sub2_1.method8553(Static327.anInt5853, local6397);
														local1128 = Static455.method6706(local6397, 0, Static327.anInt5853);
														Static421.method6305(local1128, Static294.aClass230_3, Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1, true);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static526.aClass109_187 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
														local82 = Static515.aClass5_Sub23_Sub2_1.method8519();
														Static188.method2727();
														Static256.method3779(local237, local82);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static667.aClass109_223 == Static493.aClass109_175) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8519();
														if (local237 == 65535) {
															local237 = -1;
														}
														local82 = Static515.aClass5_Sub23_Sub2_1.method8529();
														local245 = Static515.aClass5_Sub23_Sub2_1.method8519();
														local249 = Static515.aClass5_Sub23_Sub2_1.method8529();
														Static391.method5714(local249, local245, local237, 256, local82, true);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static348.aClass109_122 == Static493.aClass109_175) {
														Static12.method239(Static277.aClass370_8);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static143.aClass109_60) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8523();
														Static188.method2727();
														Static247.method3634(-1, 3, local237, -1);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static256.aClass109_98) {
														Static155.anInt2440 = Static515.aClass5_Sub23_Sub2_1.method8529();
														Static493.aClass109_175 = null;
														Static45.anInt10277 = Static261.anInt4525;
														return true;
													} else if (Static493.aClass109_175 == Static533.aClass109_190) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8527();
														Static596.aClass366_8 = Static294.aClass230_3.method5342(local237);
														Static493.aClass109_175 = null;
														return true;
													} else if (Static493.aClass109_175 == Static391.aClass109_140) {
														local237 = Static515.aClass5_Sub23_Sub2_1.method8474();
														if (local237 != Static202.anInt3291) {
															Static202.anInt3291 = local237;
															Static173.method2509(Static301.aClass354_19, -1, -1);
														}
														Static493.aClass109_175 = null;
														return true;
													} else {
														Static405.method5934("T1 - " + (Static493.aClass109_175 == null ? -1 : Static493.aClass109_175.method2012()) + "," + (Static247.aClass109_94 == null ? -1 : Static247.aClass109_94.method2012()) + "," + (Static113.aClass109_48 == null ? -1 : Static113.aClass109_48.method2012()) + " - " + Static327.anInt5853, (Throwable) null);
														Static600.method8644(false);
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

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[Ljava/lang/String;[I)V")
	public static void method3829(@OriginalArg(1) String[] arg0, @OriginalArg(2) int[] arg1) {
		Static367.method8719(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)Lclient!gaa;")
	public static Class5_Sub5_Sub6 method3830() {
		@Pc(10) Class5_Sub5_Sub6 local10 = (Class5_Sub5_Sub6) Static184.aClass149_7.method2890();
		if (local10 != null) {
			local10.method9327(1);
			local10.method9186();
			return local10;
		}
		do {
			local10 = (Class5_Sub5_Sub6) Static566.aClass149_9.method2890();
			if (local10 == null) {
				return null;
			}
			if (local10.method2691() > Static515.method7499(120)) {
				return null;
			}
			local10.method9327(1);
			local10.method9186();
		} while ((local10.aLong312 & Long.MIN_VALUE) == 0L);
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)Lclient!cn;")
	public static Class73 method3831(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = arg0 >> 16;
		@Pc(20) int local20 = arg0 & 0xFFFF;
		if (Static489.aClass73ArrayArray2[local16] == null || Static489.aClass73ArrayArray2[local16][local20] == null) {
			@Pc(36) boolean local36 = Static596.method8616(local16);
			if (!local36) {
				return null;
			}
		}
		return Static489.aClass73ArrayArray2[local16][local20];
	}
}
