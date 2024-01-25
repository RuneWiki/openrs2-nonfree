import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
	public static int anInt6809;

	@OriginalMember(owner = "client!oha", name = "p", descriptor = "Lclient!bt;")
	public static Class34 aClass34_93;

	@OriginalMember(owner = "client!oha", name = "w", descriptor = "[I")
	public static final int[] anIntArray471 = new int[5];

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	public static void method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static201.method3062(arg1, arg0);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BIIIII)V")
	public static void method5970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg3; local3++) {
			Static559.method7424(arg2, Static172.anIntArrayArray17[local3], arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public static void method5973() {
		if (Static179.anInt3120 > 1) {
			Static465.anInt7431 = Static317.anInt4914;
			Static179.anInt3120--;
		}
		if (Static559.aBoolean671) {
			Static559.aBoolean671 = false;
			Static665.method8811();
			return;
		}
		if (!Static333.aBoolean400) {
			Static217.method3246();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static554.method7187(); local27++) {
		}
		if (Static656.anInt10356 != 10) {
			return;
		}
		@Pc(51) Class4_Sub48 local51;
		@Pc(60) int local60;
		while (Static494.method6888()) {
			local51 = Static335.method4615(Static13.aClass216_6, Static669.aClass196_2);
			local51.aClass4_Sub11_Sub1_2.method8822(0);
			local60 = local51.aClass4_Sub11_Sub1_2.anInt10466;
			Static420.method5764(local51.aClass4_Sub11_Sub1_2);
			local51.aClass4_Sub11_Sub1_2.method8835(local51.aClass4_Sub11_Sub1_2.anInt10466 - local60);
			Static410.method5170(local51);
		}
		if (Static290.aClass4_Sub14_2 == null) {
			if (Static429.method5935() >= Static307.aLong264) {
				Static290.aClass4_Sub14_2 = Static408.aClass19_1.method475(Static653.aClass382_5.aString122);
			}
		} else if (Static290.aClass4_Sub14_2.anInt2029 != -1) {
			local51 = Static335.method4615(Static577.aClass216_128, Static669.aClass196_2);
			local51.aClass4_Sub11_Sub1_2.method8838(Static290.aClass4_Sub14_2.anInt2029);
			Static410.method5170(local51);
			Static290.aClass4_Sub14_2 = null;
			Static307.aLong264 = Static429.method5935() + 30000L;
		}
		@Pc(126) Class4_Sub15 local126 = (Class4_Sub15) Static385.aClass163_35.method3639();
		@Pc(143) int local143;
		@Pc(166) int local166;
		@Pc(184) int local184;
		@Pc(231) int local231;
		@Pc(237) int local237;
		@Pc(248) int local248;
		@Pc(141) Class4_Sub48 local141;
		if (local126 != null || Static429.method5935() - 2000L > Static152.aLong89) {
			local141 = null;
			local143 = 0;
			for (@Pc(148) Class4_Sub15 local148 = (Class4_Sub15) Static269.aClass163_24.method3639(); local148 != null && (local141 == null || local141.aClass4_Sub11_Sub1_2.anInt10466 - local143 < 240); local148 = (Class4_Sub15) Static269.aClass163_24.method3640()) {
				local148.method9000();
				local166 = local148.method4787();
				if (local166 < -1) {
					local166 = -1;
				} else if (local166 > 65534) {
					local166 = 65534;
				}
				local184 = local148.method4789();
				if (local184 < -1) {
					local184 = -1;
				} else if (local184 > 65534) {
					local184 = 65534;
				}
				if (local184 != Static524.anInt8097 || Static663.anInt10412 != local166) {
					if (local141 == null) {
						local141 = Static335.method4615(Static192.aClass216_64, Static669.aClass196_2);
						local141.aClass4_Sub11_Sub1_2.method8822(0);
						local143 = local141.aClass4_Sub11_Sub1_2.anInt10466;
					}
					local231 = local184 - Static524.anInt8097;
					Static524.anInt8097 = local184;
					local237 = local166 - Static663.anInt10412;
					Static663.anInt10412 = local166;
					local248 = (int) ((local148.method4785() - Static152.aLong89) / 20L);
					if (local248 < 8 && local231 >= -32 && local231 <= 31 && local237 >= -32 && local237 <= 31) {
						local237 += 32;
						local231 += 32;
						local141.aClass4_Sub11_Sub1_2.method8838((local231 << 6) + ((local248 << 12) + local237));
					} else if (local248 < 32 && local231 >= -128 && local231 <= 127 && local237 >= -128 && local237 <= 127) {
						local141.aClass4_Sub11_Sub1_2.method8822(local248 + 128);
						local231 += 128;
						local237 += 128;
						local141.aClass4_Sub11_Sub1_2.method8838((local231 << 8) + local237);
					} else if (local248 < 32) {
						local141.aClass4_Sub11_Sub1_2.method8822(local248 + 192);
						if (local184 == 1 || local166 == -1) {
							local141.aClass4_Sub11_Sub1_2.method8860(Integer.MIN_VALUE);
						} else {
							local141.aClass4_Sub11_Sub1_2.method8860(local166 << 16 | local184);
						}
					} else {
						local141.aClass4_Sub11_Sub1_2.method8838(local248 + 57344);
						if (local184 == 1 || local166 == -1) {
							local141.aClass4_Sub11_Sub1_2.method8860(Integer.MIN_VALUE);
						} else {
							local141.aClass4_Sub11_Sub1_2.method8860(local184 | local166 << 16);
						}
					}
					Static152.aLong89 = local148.method4785();
				}
			}
			if (local141 != null) {
				local141.aClass4_Sub11_Sub1_2.method8835(local141.aClass4_Sub11_Sub1_2.anInt10466 - local143);
				Static410.method5170(local141);
			}
		}
		@Pc(449) int local449;
		if (local126 != null) {
			@Pc(433) long local433 = (local126.method4785() - Static477.aLong219) / 50L;
			if (local433 > 32767L) {
				local433 = 32767L;
			}
			Static477.aLong219 = local126.method4785();
			local449 = local126.method4787();
			if (local449 < 0) {
				local449 = 0;
			} else if (local449 > 65535) {
				local449 = 65535;
			}
			local166 = local126.method4789();
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 65535) {
				local166 = 65535;
			}
			@Pc(485) byte local485 = 0;
			if (local126.method4791() == 2) {
				local485 = 1;
			}
			local231 = (int) local433;
			@Pc(506) Class4_Sub48 local506 = Static335.method4615(Static632.aClass216_145, Static669.aClass196_2);
			local506.aClass4_Sub11_Sub1_2.method8876(local231 | local485 << 15);
			local506.aClass4_Sub11_Sub1_2.method8860(local166 | local449 << 16);
			Static410.method5170(local506);
		}
		@Pc(565) long local565;
		if (Static384.anInt5665 > 0) {
			local141 = Static335.method4615(Static80.aClass216_28, Static669.aClass196_2);
			local141.aClass4_Sub11_Sub1_2.method8822(Static384.anInt5665 * 3);
			for (local143 = 0; local143 < Static384.anInt5665; local143++) {
				@Pc(556) Interface26 local556 = Static385.anInterface26Array2[local143];
				local565 = (local556.method7133() - Static150.aLong88) / 50L;
				if (local565 > 65535L) {
					local565 = 65535L;
				}
				Static150.aLong88 = local556.method7133();
				local141.aClass4_Sub11_Sub1_2.method8822(local556.method7132());
				local141.aClass4_Sub11_Sub1_2.method8838((int) local565);
			}
			Static410.method5170(local141);
		}
		if (Static486.anInt7644 > 0) {
			Static486.anInt7644--;
		}
		if (Static123.aBoolean157 && Static486.anInt7644 <= 0) {
			Static123.aBoolean157 = false;
			Static486.anInt7644 = 20;
			local141 = Static335.method4615(Static205.aClass216_67, Static669.aClass196_2);
			local141.aClass4_Sub11_Sub1_2.method8849((int) Static642.aFloat230 >> 3);
			local141.aClass4_Sub11_Sub1_2.method8891((int) Static275.aFloat105 >> 3);
			Static410.method5170(local141);
		}
		if (Static175.aBoolean230 != Static81.aBoolean116) {
			Static81.aBoolean116 = Static175.aBoolean230;
			local141 = Static335.method4615(Static183.aClass216_62, Static669.aClass196_2);
			local141.aClass4_Sub11_Sub1_2.method8822(Static175.aBoolean230 ? 1 : 0);
			Static410.method5170(local141);
		}
		if (!Static391.aBoolean438) {
			local141 = Static335.method4615(Static141.aClass216_52, Static669.aClass196_2);
			local141.aClass4_Sub11_Sub1_2.method8822(0);
			local143 = local141.aClass4_Sub11_Sub1_2.anInt10466;
			@Pc(695) Class4_Sub11 local695 = Static124.aClass4_Sub20_4.method3146();
			local141.aClass4_Sub11_Sub1_2.method8824(local695.aByteArray107, local695.anInt10466, 0);
			local141.aClass4_Sub11_Sub1_2.method8835(local141.aClass4_Sub11_Sub1_2.anInt10466 - local143);
			Static410.method5170(local141);
			Static391.aBoolean438 = true;
		}
		if (Static267.aClass73ArrayArrayArray2 != null) {
			if (Static259.anInt4200 == 2) {
				Static82.method7284();
			} else if (Static259.anInt4200 == 3) {
				Static366.method4841();
			}
		}
		if (Static677.aBoolean804) {
			Static677.aBoolean804 = false;
		} else {
			Static110.aFloat39 /= 2.0F;
		}
		if (Static567.aBoolean692) {
			Static567.aBoolean692 = false;
		} else {
			Static566.aFloat202 /= 2.0F;
		}
		Static516.method6996();
		if (Static656.anInt10356 != 10) {
			return;
		}
		Static432.method5963();
		Static381.method3016();
		Static146.method2548();
		Static163.anInt2980++;
		if (Static163.anInt2980 > 750) {
			Static665.method8811();
			return;
		}
		Static191.method2971();
		Static482.method6603();
		Static610.method7998();
		for (local60 = Static526.aClass293_1.method6537(true); local60 != -1; local60 = Static526.aClass293_1.method6537(false)) {
			Static525.method7093(local60);
			Static619.anIntArray669[Static538.anInt8331++ & 0x1F] = local60;
		}
		for (@Pc(819) Class4_Sub5_Sub11 local819 = Static429.method5932(); local819 != null; local819 = Static429.method5932()) {
			local449 = local819.method3957();
			local565 = local819.method3952();
			if (local449 == 1) {
				Static509.anIntArray546[(int) local565] = local819.anInt4427;
				Static550.aBoolean656 |= Static51.aBooleanArray3[(int) local565];
				Static157.anIntArray207[Static116.anInt2236++ & 0x1F] = (int) local565;
			} else if (local449 == 2) {
				Static89.aStringArray9[(int) local565] = local819.aString42;
				Static436.anIntArray513[Static192.anInt3237++ & 0x1F] = (int) local565;
			} else {
				@Pc(845) Class199 local845;
				if (local449 == 3) {
					local845 = Static569.method7534((int) local565);
					if (!local819.aString42.equals(local845.aString52)) {
						local845.aString52 = local819.aString42;
						Static331.method4565(local845);
					}
				} else {
					@Pc(1284) int local1284;
					if (local449 == 4) {
						local845 = Static569.method7534((int) local565);
						local237 = local819.anInt4427;
						local248 = local819.anInt4425;
						local1284 = local819.anInt4429;
						if (local845.anInt5039 != local237 || local845.anInt4956 != local248 || local1284 != local845.anInt4983) {
							local845.anInt4983 = local1284;
							local845.anInt5039 = local237;
							local845.anInt4956 = local248;
							Static331.method4565(local845);
						}
					} else if (local449 == 5) {
						local845 = Static569.method7534((int) local565);
						if (local845.anInt4948 != local819.anInt4427 || local819.anInt4427 == -1) {
							local845.anInt4948 = local819.anInt4427;
							local845.anInt5014 = 1;
							local845.anInt4960 = 0;
							local845.anInt4985 = 0;
							@Pc(1354) Class124 local1354 = local845.anInt4948 == -1 ? null : Static99.aClass2_1.method22(local845.anInt4948);
							if (local1354 != null) {
								Static122.method2185(local845.anInt4985, local1354);
							}
							Static331.method4565(local845);
						}
					} else if (local449 == 6) {
						local231 = local819.anInt4427;
						local237 = local231 >> 10 & 0x1F;
						local248 = local231 >> 5 & 0x1F;
						local1284 = local231 & 0x1F;
						@Pc(1296) int local1296 = (local1284 << 3) + (local248 << 11) + (local237 << 19);
						@Pc(1301) Class199 local1301 = Static569.method7534((int) local565);
						if (local1296 != local1301.anInt4950) {
							local1301.anInt4950 = local1296;
							Static331.method4565(local1301);
						}
					} else if (local449 == 7) {
						local845 = Static569.method7534((int) local565);
						@Pc(1249) boolean local1249 = local819.anInt4427 == 1;
						if (local845.aBoolean373 != local1249) {
							local845.aBoolean373 = local1249;
							Static331.method4565(local845);
						}
					} else if (local449 == 8) {
						local845 = Static569.method7534((int) local565);
						if (local819.anInt4427 != local845.anInt4972 || local819.anInt4425 != local845.anInt5006 || local845.anInt4961 != local819.anInt4429) {
							local845.anInt5006 = local819.anInt4425;
							local845.anInt4961 = local819.anInt4429;
							local845.anInt4972 = local819.anInt4427;
							if (local845.anInt5002 != -1) {
								if (local845.anInt4953 > 0) {
									local845.anInt4961 = local845.anInt4961 * 32 / local845.anInt4953;
								} else if (local845.anInt4962 > 0) {
									local845.anInt4961 = local845.anInt4961 * 32 / local845.anInt4962;
								}
							}
							Static331.method4565(local845);
						}
					} else if (local449 == 9) {
						local845 = Static569.method7534((int) local565);
						if (local845.anInt5002 != local819.anInt4427 || local845.anInt5032 != local819.anInt4425) {
							local845.anInt5032 = local819.anInt4425;
							local845.anInt5002 = local819.anInt4427;
							Static331.method4565(local845);
						}
					} else if (local449 == 10) {
						local845 = Static569.method7534((int) local565);
						if (local845.lb != local819.anInt4427 || local819.anInt4425 != local845.anInt5021 || local845.anInt4957 != local819.anInt4429) {
							local845.anInt4957 = local819.anInt4429;
							local845.lb = local819.anInt4427;
							local845.anInt5021 = local819.anInt4425;
							Static331.method4565(local845);
						}
					} else if (local449 == 11) {
						local845 = Static569.method7534((int) local565);
						local845.anInt4973 = local845.anInt4968 = local819.anInt4427;
						local845.aByte78 = 0;
						local845.anInt5028 = local845.anInt5026 = local819.anInt4425;
						local845.aByte77 = 0;
						Static331.method4565(local845);
					} else if (local449 == 12) {
						local845 = Static569.method7534((int) local565);
						local237 = local819.anInt4427;
						if (local845 != null && local845.anInt4966 == 0) {
							if (local845.anInt4981 - local845.anInt4994 < local237) {
								local237 = local845.anInt4981 - local845.anInt4994;
							}
							if (local237 < 0) {
								local237 = 0;
							}
							if (local237 != local845.anInt4977) {
								local845.anInt4977 = local237;
								Static331.method4565(local845);
							}
						}
					} else if (local449 == 14) {
						local845 = Static569.method7534((int) local565);
						local845.anInt4958 = local819.anInt4427;
					} else if (local449 == 15) {
						Static63.aBoolean88 = true;
						Static78.anInt1643 = local819.anInt4427;
						Static110.anInt2183 = local819.anInt4425;
					} else if (local449 == 16) {
						local845 = Static569.method7534((int) local565);
						local845.anInt4980 = local819.anInt4427;
					} else if (local449 == 17) {
						local845 = Static569.method7534((int) local565);
						local845.anInt4951 = local819.anInt4427;
					} else if (local449 == 18) {
						local845 = Static569.method7534((int) local565);
						local237 = (int) (local565 >> 32);
						local845.method4411(local237, (short) local819.anInt4425, (short) local819.anInt4427);
					} else if (local449 == 19) {
						local845 = Static569.method7534((int) local565);
						local237 = (int) (local565 >> 32);
						local845.method4426((short) local819.anInt4427, local237, (short) local819.anInt4425);
					}
				}
			}
		}
		Static88.anInt1794++;
		if (Static645.anInt10146 != 0) {
			Static23.anInt506 += 20;
			if (Static23.anInt506 >= 400) {
				Static645.anInt10146 = 0;
			}
		}
		if (Static234.aClass199_2 != null) {
			Static530.anInt8211++;
			if (Static530.anInt8211 >= 15) {
				Static331.method4565(Static234.aClass199_2);
				Static234.aClass199_2 = null;
			}
		}
		Static620.aClass199_15 = null;
		Static277.aClass199_7 = null;
		Static436.aBoolean594 = false;
		Static584.aBoolean331 = false;
		Static369.method4868(-1, -1, (Class199) null);
		Static492.method6685(-1, -1, (Class199) null);
		if (!Static463.aBoolean582) {
			Static530.anInt8205 = -1;
		}
		Static128.method2305();
		Static317.anInt4914++;
		if (Static363.aBoolean413) {
			@Pc(1528) Class4_Sub48 local1528 = Static335.method4615(Static298.aClass216_134, Static669.aClass196_2);
			local1528.aClass4_Sub11_Sub1_2.method8860(Static567.anInt8751 << 14 | Static56.anInt1266 << 28 | Static273.anInt4430);
			Static410.method5170(local1528);
			Static363.aBoolean413 = false;
		}
		while (true) {
			@Pc(1551) Class4_Sub25 local1551;
			@Pc(1564) Class199 local1564;
			@Pc(1556) Class199 local1556;
			do {
				local1551 = (Class4_Sub25) Static363.aClass163_33.method3644();
				if (local1551 == null) {
					while (true) {
						do {
							local1551 = (Class4_Sub25) Static152.aClass163_18.method3644();
							if (local1551 == null) {
								while (true) {
									do {
										local1551 = (Class4_Sub25) Static209.aClass163_20.method3644();
										if (local1551 == null) {
											if (Static277.aClass199_7 == null) {
												Static481.anInt7584 = 0;
											}
											if (Static507.aClass199_12 != null) {
												Static229.method3333();
											}
											if (Static279.anInt4498 > 0 && Static231.aClass102_6.method4311(82) && Static231.aClass102_6.method4311(81) && Static191.anInt3219 != 0) {
												local449 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 - Static191.anInt3219;
												if (local449 < 0) {
													local449 = 0;
												} else if (local449 > 3) {
													local449 = 3;
												}
												Static98.method1981(Static445.anInt6949 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0], Static321.anInt5000 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0], local449);
											}
											Static644.method8591();
											for (local449 = 0; local449 < 5; local449++) {
												@Pc(1747) int local1747 = Static395.anIntArray212[local449]++;
											}
											if (Static550.aBoolean656 && Static429.method5935() - 60000L > Static16.aLong11) {
												Static352.method4721();
											}
											for (@Pc(1774) Class3_Sub3_Sub2 local1774 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4958(); local1774 != null; local1774 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4950()) {
												if (Static429.method5935() / 1000L - 5L > (long) local1774.anInt5461) {
													if (local1774.aShort85 > 0) {
														Static388.method5002("", local1774.aString71 + Static279.aClass179_19.method4066(Static164.anInt2984), "", "", 5, 0);
													}
													if (local1774.aShort85 == 0) {
														Static388.method5002("", local1774.aString71 + Static279.aClass179_20.method4066(Static164.anInt2984), "", "", 5, 0);
													}
													local1774.method8898();
												}
											}
											Static63.anInt1355++;
											if (Static63.anInt1355 > 500) {
												Static63.anInt1355 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x1) == 1) {
													Static384.anInt5666 += Static310.anInt4825;
												}
												if ((local184 & 0x2) == 2) {
													Static477.anInt7546 += Static138.anInt2569;
												}
												if ((local184 & 0x4) == 4) {
													Static617.anInt9695 += Static455.anInt7330;
												}
											}
											if (Static384.anInt5666 < -50) {
												Static310.anInt4825 = 2;
											}
											if (Static384.anInt5666 > 50) {
												Static310.anInt4825 = -2;
											}
											if (Static477.anInt7546 < -55) {
												Static138.anInt2569 = 2;
											}
											if (Static477.anInt7546 > 55) {
												Static138.anInt2569 = -2;
											}
											if (Static617.anInt9695 < -40) {
												Static455.anInt7330 = 1;
											}
											Static293.anInt4644++;
											if (Static617.anInt9695 > 40) {
												Static455.anInt7330 = -1;
											}
											if (Static293.anInt4644 > 500) {
												Static293.anInt4644 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x2) == 2) {
													Static338.anInt5228 += Static607.anInt9329;
												}
												if ((local184 & 0x1) == 1) {
													Static354.anInt5391 += Static14.anInt206;
												}
											}
											if (Static354.anInt5391 < -60) {
												Static14.anInt206 = 2;
											}
											if (Static338.anInt5228 < -20) {
												Static607.anInt9329 = 1;
											}
											if (Static354.anInt5391 > 60) {
												Static14.anInt206 = -2;
											}
											if (Static338.anInt5228 > 10) {
												Static607.anInt9329 = -1;
											}
											Static635.anInt9890++;
											if (Static635.anInt9890 > 50) {
												@Pc(2004) Class4_Sub48 local2004 = Static335.method4615(Static7.aClass216_4, Static669.aClass196_2);
												Static410.method5170(local2004);
											}
											if (Static673.aBoolean800) {
												Static76.method1618();
												Static673.aBoolean800 = false;
											}
											try {
												Static460.method6417();
												return;
											} catch (@Pc(2017) IOException local2017) {
												Static665.method8811();
												return;
											}
										}
										local1556 = local1551.aClass199_6;
										if (local1556.anInt5005 < 0) {
											break;
										}
										local1564 = Static569.method7534(local1556.anInt4982);
									} while (local1564 == null || local1564.aClass199Array1 == null || local1564.aClass199Array1.length <= local1556.anInt5005 || local1556 != local1564.aClass199Array1[local1556.anInt5005]);
									Static237.method3393(local1551);
								}
							}
							local1556 = local1551.aClass199_6;
							if (local1556.anInt5005 < 0) {
								break;
							}
							local1564 = Static569.method7534(local1556.anInt4982);
						} while (local1564 == null || local1564.aClass199Array1 == null || local1556.anInt5005 >= local1564.aClass199Array1.length || local1564.aClass199Array1[local1556.anInt5005] != local1556);
						Static237.method3393(local1551);
					}
				}
				local1556 = local1551.aClass199_6;
				if (local1556.anInt5005 < 0) {
					break;
				}
				local1564 = Static569.method7534(local1556.anInt4982);
			} while (local1564 == null || local1564.aClass199Array1 == null || local1556.anInt5005 >= local1564.aClass199Array1.length || local1564.aClass199Array1[local1556.anInt5005] != local1556);
			Static237.method3393(local1551);
		}
	}
}
