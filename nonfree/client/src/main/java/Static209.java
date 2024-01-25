import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_36 = new Class267(4);

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Lclient!s;")
	public static final Class217 aClass217_91 = new Class217(25, 8);

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!os;")
	public static final Class182 aClass182_139 = new Class182("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!nn;B)V")
	public static void method3243(@OriginalArg(0) Class10_Sub8 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static70.anInt1480; local3++) {
			@Pc(9) int local9 = arg0.method2469();
			@Pc(13) int local13 = arg0.method2485();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static436.aClass56_Sub1Array2[local9] != null) {
				Static436.aClass56_Sub1Array2[local9].anInt4652 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method3245() {
		if (Static326.anInt5600 > 1) {
			Static326.anInt5600--;
			Static80.anInt1678 = Static193.anInt3856;
		}
		if (Static146.anInt3027 > 0) {
			Static146.anInt3027--;
		}
		if (Static317.aBoolean361) {
			Static317.aBoolean361 = false;
			Static106.method1864();
			return;
		}
		if (!Static35.aBoolean37) {
			Static35.method482();
		}
		for (@Pc(37) int local37 = 0; local37 < 100 && Static231.method3444(); local37++) {
		}
		if (Static358.anInt6086 != 9) {
			return;
		}
		Static338.method4532(Static337.aClass10_Sub8_Sub2_2, Static80.aClass27_32.method450());
		if (Static259.aClass10_Sub28_4 == null) {
			if (Static37.aLong25 <= Static220.method3314()) {
				Static259.aClass10_Sub28_4 = Static179.aClass31_1.method652(Static87.aClass21_2.aString5);
			}
		} else if (Static259.aClass10_Sub28_4.anInt4505 != -1) {
			Static310.method4308(Static189.aClass27_64);
			Static337.aClass10_Sub8_Sub2_2.method2509(Static259.aClass10_Sub28_4.anInt4505);
			Static259.aClass10_Sub28_4 = null;
			Static37.aLong25 = Static220.method3314() + 30000L;
		}
		@Pc(109) Class10_Sub16 local109 = (Class10_Sub16) Static173.aClass163_29.method3620();
		@Pc(123) int local123;
		@Pc(146) int local146;
		@Pc(165) int local165;
		@Pc(181) boolean local181;
		@Pc(225) int local225;
		@Pc(232) int local232;
		@Pc(244) int local244;
		if (local109 != null || Static220.method3314() - 2000L > client.lb) {
			@Pc(120) boolean local120 = false;
			local123 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
			for (@Pc(128) Class10_Sub16 local128 = (Class10_Sub16) Static126.aClass163_24.method3620(); local128 != null && Static337.aClass10_Sub8_Sub2_2.anInt2989 - local123 < 240; local128 = (Class10_Sub16) Static126.aClass163_24.method3621()) {
				local128.method6033();
				local146 = local128.method1923();
				if (local146 < 0) {
					local146 = 0;
				} else if (local146 > 65534) {
					local146 = 65534;
				}
				local165 = local128.method1921();
				if (local165 < 0) {
					local165 = 0;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				local181 = false;
				if (local128.method1923() == -1 && local128.method1921() == -1) {
					local181 = true;
					local146 = -1;
					local165 = -1;
				}
				if (Static254.anInt4577 != local165 || Static279.anInt4889 != local146) {
					if (!local120) {
						Static310.method4308(Static250.aClass27_71);
						Static337.aClass10_Sub8_Sub2_2.method2458(0);
						local120 = true;
						local123 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
					}
					local225 = local165 - Static254.anInt4577;
					Static254.anInt4577 = local165;
					local232 = local146 - Static279.anInt4889;
					Static279.anInt4889 = local146;
					local244 = (int) ((local128.method1925() - client.lb) / 20L);
					if (local244 < 8 && local225 >= -32 && local225 <= 31 && local232 >= -32 && local232 <= 31) {
						local225 += 32;
						local232 += 32;
						Static337.aClass10_Sub8_Sub2_2.method2509((local244 << 12) + (local225 << 6) + local232);
					} else if (local244 < 32 && local225 >= -128 && local225 <= 127 && local232 >= -128 && local232 <= 127) {
						local232 += 128;
						Static337.aClass10_Sub8_Sub2_2.method2458(local244 + 128);
						local225 += 128;
						Static337.aClass10_Sub8_Sub2_2.method2509(local232 + (local225 << 8));
					} else if (local244 >= 32) {
						Static337.aClass10_Sub8_Sub2_2.method2509(local244 + 57344);
						if (local181) {
							Static337.aClass10_Sub8_Sub2_2.method2506(Integer.MIN_VALUE);
						} else {
							Static337.aClass10_Sub8_Sub2_2.method2506(local146 << 16 | local165);
						}
					} else {
						Static337.aClass10_Sub8_Sub2_2.method2458(local244 + 192);
						if (local181) {
							Static337.aClass10_Sub8_Sub2_2.method2506(Integer.MIN_VALUE);
						} else {
							Static337.aClass10_Sub8_Sub2_2.method2506(local165 | local146 << 16);
						}
					}
					client.lb = local128.method1925();
				}
			}
			if (local120) {
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local123);
			}
		}
		@Pc(412) int local412;
		@Pc(463) int local463;
		if (local109 != null) {
			@Pc(398) long local398 = (local109.method1925() - Static69.aLong47) / 50L;
			if (local398 > 32767L) {
				local398 = 32767L;
			}
			Static69.aLong47 = local109.method1925();
			local412 = local109.method1923();
			if (local412 < 0) {
				local412 = 0;
			} else if (local412 > 65535) {
				local412 = 65535;
			}
			local146 = local109.method1921();
			if (local146 < 0) {
				local146 = 0;
			} else if (local146 > 65535) {
				local146 = 65535;
			}
			@Pc(448) byte local448 = 0;
			if (local109.method1924() == 2) {
				local448 = 1;
			}
			Static310.method4308(Static442.aClass27_108);
			local463 = (int) local398;
			Static337.aClass10_Sub8_Sub2_2.method2523(local146 | local412 << 16);
			Static337.aClass10_Sub8_Sub2_2.method2519(local463 | local448 << 15);
		}
		@Pc(492) int local492;
		if (Static35.anInt574 > 0) {
			local492 = 0;
			for (local123 = 0; local123 < Static35.anInt574; local123++) {
				if (Static121.aClass3Array1[local123].method3432()) {
					local492++;
				}
			}
			if (local492 > 0) {
				if (local492 > 75) {
					local492 = 75;
				}
				Static310.method4308(Static96.aClass27_39);
				Static337.aClass10_Sub8_Sub2_2.method2458(local492 * 3);
				for (local412 = 0; local412 < Static35.anInt574; local412++) {
					@Pc(544) Class3 local544 = Static121.aClass3Array1[local412];
					if (local544.method3432()) {
						@Pc(557) long local557 = (local544.method3435() - Static322.aLong190) / 50L;
						Static322.aLong190 = local544.method3435();
						if (local557 > 65535L) {
							local557 = 65535L;
						}
						Static337.aClass10_Sub8_Sub2_2.method2458(local544.method3434());
						Static337.aClass10_Sub8_Sub2_2.method2509((int) local557);
					}
				}
			}
		}
		if (Static160.anInt3221 > 0) {
			Static160.anInt3221--;
		}
		if (Static406.aBoolean448 && Static160.anInt3221 <= 0) {
			Static406.aBoolean448 = false;
			Static160.anInt3221 = 20;
			Static310.method4308(Static386.aClass27_90);
			Static337.aClass10_Sub8_Sub2_2.method2497((int) Static16.aFloat6 >> 3);
			Static337.aClass10_Sub8_Sub2_2.method2519((int) Static149.aFloat53 >> 3);
		}
		if (Static451.aBoolean497 && !Static29.aBoolean35) {
			Static29.aBoolean35 = true;
			Static310.method4308(Static392.aClass27_92);
			Static337.aClass10_Sub8_Sub2_2.method2458(1);
		}
		if (!Static451.aBoolean497 && Static29.aBoolean35) {
			Static29.aBoolean35 = false;
			Static310.method4308(Static392.aClass27_92);
			Static337.aClass10_Sub8_Sub2_2.method2458(0);
		}
		if (!Static419.aBoolean463) {
			Static310.method4308(Static151.aClass27_58);
			Static337.aClass10_Sub8_Sub2_2.method2458(0);
			local492 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
			@Pc(693) Class10_Sub8 local693 = Static361.aClass85_Sub1_1.method2112();
			Static337.aClass10_Sub8_Sub2_2.method2457(local693.anInt2989, local693.aByteArray44);
			Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local492);
			Static419.aBoolean463 = true;
		}
		if (Static309.aClass11ArrayArrayArray2 != null) {
			if (Static157.anInt3176 == 2) {
				Static164.method3360();
			} else if (Static157.anInt3176 == 3) {
				Static59.method1021();
			}
		}
		if (Static122.aBoolean183) {
			Static122.aBoolean183 = false;
		} else {
			Static141.aFloat52 /= 2.0F;
		}
		if (Static9.aBoolean8) {
			Static9.aBoolean8 = false;
		} else {
			Static231.aFloat70 /= 2.0F;
		}
		Static1.method1();
		if (Static358.anInt6086 != 9) {
			return;
		}
		Static92.method1713();
		Static429.method5683();
		Static6.method49();
		Static162.method2704();
		Static262.anInt4660++;
		if (Static262.anInt4660 > 750) {
			Static106.method1864();
			return;
		}
		Static433.method5735();
		Static437.method5694();
		Static292.method4102();
		for (local492 = Static329.aClass201_9.method4482(true); local492 != -1; local492 = Static329.aClass201_9.method4482(false)) {
			Static423.method5590(local492);
			Static422.anIntArray683[Static76.anInt1552++ & 0x1F] = local492;
		}
		@Pc(876) Class89 local876;
		for (@Pc(813) Class10_Sub1_Sub17 local813 = Static94.method1720(); local813 != null; local813 = Static94.method1720()) {
			local412 = local813.method5339();
			local146 = local813.method5342();
			if (local412 == 1) {
				Static136.anIntArray282[local146] = local813.anInt6806;
				Static5.aBoolean4 |= Static156.aBooleanArray7[local146];
				Static236.anIntArray428[Static374.anInt6425++ & 0x1F] = local146;
			} else if (local412 == 2) {
				Static195.aStringArray29[local146] = local813.aString66;
				Static93.anIntArray749[Static43.anInt727++ & 0x1F] = local146;
			} else if (local412 == 3) {
				local876 = Static40.method557(local146);
				if (!local813.aString66.equals(local876.aString17)) {
					local876.aString17 = local813.aString66;
					Static135.method5400(local876);
				}
			} else if (local412 == 4) {
				local876 = Static40.method557(local146);
				local463 = local813.anInt6806;
				local225 = local813.anInt6813;
				local232 = local813.anInt6807;
				if (local876.anInt2728 != local463 || local876.anInt2733 != local225 || local876.anInt2722 != local232) {
					local876.anInt2728 = local463;
					local876.anInt2733 = local225;
					local876.anInt2722 = local232;
					Static135.method5400(local876);
				}
			} else if (local412 == 5) {
				local876 = Static40.method557(local146);
				if (local813.anInt6806 != local876.anInt2697 || local813.anInt6806 == -1) {
					local876.anInt2697 = local813.anInt6806;
					local876.anInt2665 = 1;
					local876.anInt2661 = 0;
					local876.anInt2704 = 0;
					Static135.method5400(local876);
				}
			} else if (local412 == 6) {
				local165 = local813.anInt6806;
				local463 = local165 >> 10 & 0x1F;
				local225 = local165 >> 5 & 0x1F;
				local232 = local165 & 0x1F;
				local244 = (local225 << 11) + (local463 << 19) + (local232 << 3);
				@Pc(1289) Class89 local1289 = Static40.method557(local146);
				if (local1289.anInt2662 != local244) {
					local1289.anInt2662 = local244;
					Static135.method5400(local1289);
				}
			} else if (local412 == 7) {
				local876 = Static40.method557(local146);
				local181 = local813.anInt6806 == 1;
				if (local876.aBoolean198 != local181) {
					local876.aBoolean198 = local181;
					Static135.method5400(local876);
				}
			} else if (local412 == 8) {
				local876 = Static40.method557(local146);
				if (local876.anInt2663 != local813.anInt6806 || local813.anInt6813 != local876.anInt2685 || local876.anInt2688 != local813.anInt6807) {
					local876.anInt2685 = local813.anInt6813;
					local876.anInt2663 = local813.anInt6806;
					local876.anInt2688 = local813.anInt6807;
					if (local876.anInt2670 != -1) {
						if (local876.anInt2706 > 0) {
							local876.anInt2688 = local876.anInt2688 * 32 / local876.anInt2706;
						} else if (local876.anInt2748 > 0) {
							local876.anInt2688 = local876.anInt2688 * 32 / local876.anInt2748;
						}
					}
					Static135.method5400(local876);
				}
			} else if (local412 == 9) {
				local876 = Static40.method557(local146);
				if (local876.anInt2670 != local813.anInt6806 || local813.anInt6813 != local876.anInt2719) {
					local876.anInt2719 = local813.anInt6813;
					local876.anInt2670 = local813.anInt6806;
					Static135.method5400(local876);
				}
			} else if (local412 == 10) {
				local876 = Static40.method557(local146);
				if (local876.anInt2668 != local813.anInt6806 || local876.anInt2680 != local813.anInt6813 || local876.anInt2675 != local813.anInt6807) {
					local876.anInt2675 = local813.anInt6807;
					local876.anInt2668 = local813.anInt6806;
					local876.anInt2680 = local813.anInt6813;
					Static135.method5400(local876);
				}
			} else if (local412 == 11) {
				local876 = Static40.method557(local146);
				local876.aByte21 = 0;
				local876.anInt2678 = local876.anInt2707 = local813.anInt6806;
				local876.aByte19 = 0;
				local876.anInt2721 = local876.anInt2692 = local813.anInt6813;
				Static135.method5400(local876);
			} else if (local412 == 12) {
				local876 = Static40.method557(local146);
				local463 = local813.anInt6806;
				if (local876 != null && local876.anInt2727 == 0) {
					if (local463 > local876.anInt2708 - local876.anInt2682) {
						local463 = local876.anInt2708 - local876.anInt2682;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local463 != local876.anInt2699) {
						local876.anInt2699 = local463;
						Static135.method5400(local876);
					}
				}
			} else if (local412 == 14) {
				local876 = Static40.method557(local146);
				local876.anInt2734 = local813.anInt6806;
			} else if (local412 == 15) {
				Static297.anInt5146 = local813.anInt6806;
				Static336.aBoolean367 = true;
				Static457.anInt7597 = local813.anInt6813;
			} else if (local412 == 16) {
				local876 = Static40.method557(local146);
				local876.anInt2671 = local813.anInt6806;
			}
		}
		Static68.anInt1469++;
		if (Static177.anInt3658 != 0) {
			Static167.anInt3308 += 20;
			if (Static167.anInt3308 >= 400) {
				Static177.anInt3658 = 0;
			}
		}
		if (Static343.aClass89_9 != null) {
			Static24.anInt392++;
			if (Static24.anInt392 >= 15) {
				Static135.method5400(Static343.aClass89_9);
				Static343.aClass89_9 = null;
			}
		}
		Static356.aClass89_10 = null;
		Static44.aBoolean49 = false;
		Static11.aClass89_1 = null;
		Static48.aBoolean51 = false;
		Static48.method839(-1, -1, null);
		Static58.method1018(-1, null, -1);
		if (!Static401.aBoolean489) {
			Static40.anInt656 = -1;
		}
		Static404.method5324();
		Static193.anInt3856++;
		if (Static159.aBoolean219) {
			Static310.method4308(Static390.aClass27_91);
			Static337.aClass10_Sub8_Sub2_2.method2506(Static288.anInt5044 | Static429.anInt7210 << 14 | Static397.anInt6730 << 28);
			Static159.aBoolean219 = false;
		}
		while (true) {
			@Pc(1432) Class10_Sub40 local1432;
			@Pc(1437) Class89 local1437;
			do {
				local1432 = (Class10_Sub40) Static292.aClass163_34.method3622();
				if (local1432 == null) {
					while (true) {
						do {
							local1432 = (Class10_Sub40) Static353.aClass163_39.method3622();
							if (local1432 == null) {
								while (true) {
									do {
										local1432 = (Class10_Sub40) Static72.aClass163_15.method3622();
										if (local1432 == null) {
											if (Static11.aClass89_1 == null) {
												Static443.anInt7416 = 0;
											}
											if (Static458.aClass89_14 != null) {
												Static98.method1774();
											}
											if (Static200.anInt3974 > 0 && Static197.aClass245_1.method5907(82) && Static197.aClass245_1.method5907(81) && Static93.anInt7570 != 0) {
												local412 = Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 - Static93.anInt7570;
												if (local412 < 0) {
													local412 = 0;
												} else if (local412 > 3) {
													local412 = 3;
												}
												Static297.method4135(Static72.anInt1488 + Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0], Static168.anInt3353 - -Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0], local412);
											}
											Static133.method2300();
											for (local412 = 0; local412 < 5; local412++) {
												@Pc(1639) int local1639 = Static397.anIntArray657[local412]++;
											}
											if (Static5.aBoolean4 && Static220.method3314() - 60000L > Static155.aLong101) {
												Static353.method4776();
											}
											for (@Pc(1664) Class40_Sub2_Sub2 local1664 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5227(); local1664 != null; local1664 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5230()) {
												if ((long) local1664.anInt4209 < Static220.method3314() / 1000L - 5L) {
													if (local1664.aShort68 > 0) {
														Static104.method1823("", 0, local1664.aString36 + Static13.aClass182_183.method4155(Static191.anInt3842), "", 5);
													}
													if (local1664.aShort68 == 0) {
														Static104.method1823("", 0, local1664.aString36 + Static49.aClass182_39.method4155(Static191.anInt3842), "", 5);
													}
													local1664.method4364();
												}
											}
											Static182.anInt3702++;
											if (Static182.anInt3702 > 500) {
												Static182.anInt3702 = 0;
												local165 = (int) (Math.random() * 8.0D);
												if ((local165 & 0x1) == 1) {
													Static414.anInt6929 += Static255.anInt4593;
												}
												if ((local165 & 0x2) == 2) {
													Static427.anInt7191 += Static53.anInt967;
												}
												if ((local165 & 0x4) == 4) {
													Static168.anInt3341 += Static204.anInt4018;
												}
											}
											if (Static414.anInt6929 < -50) {
												Static255.anInt4593 = 2;
											}
											if (Static427.anInt7191 < -55) {
												Static53.anInt967 = 2;
											}
											if (Static414.anInt6929 > 50) {
												Static255.anInt4593 = -2;
											}
											if (Static427.anInt7191 > 55) {
												Static53.anInt967 = -2;
											}
											if (Static168.anInt3341 < -40) {
												Static204.anInt4018 = 1;
											}
											if (Static168.anInt3341 > 40) {
												Static204.anInt4018 = -1;
											}
											Static364.anInt6194++;
											if (Static364.anInt6194 > 500) {
												Static364.anInt6194 = 0;
												local165 = (int) (Math.random() * 8.0D);
												if ((local165 & 0x1) == 1) {
													Static419.anInt7040 += Static264.anInt4668;
												}
												if ((local165 & 0x2) == 2) {
													Static394.anInt6667 += Static336.anInt5675;
												}
											}
											if (Static419.anInt7040 < -60) {
												Static264.anInt4668 = 2;
											}
											if (Static394.anInt6667 < -20) {
												Static336.anInt5675 = 1;
											}
											if (Static419.anInt7040 > 60) {
												Static264.anInt4668 = -2;
											}
											Static370.anInt6389++;
											if (Static394.anInt6667 > 10) {
												Static336.anInt5675 = -1;
											}
											if (Static370.anInt6389 > 50) {
												Static310.method4308(Static225.aClass27_110);
											}
											if (Static216.aBoolean280) {
												Static306.method4254();
												Static216.aBoolean280 = false;
											}
											try {
												if (Static160.aClass253_3 != null && Static337.aClass10_Sub8_Sub2_2.anInt2989 > 0) {
													Static302.anInt5229 += Static337.aClass10_Sub8_Sub2_2.anInt2989;
													Static160.aClass253_3.method5494(Static337.aClass10_Sub8_Sub2_2.anInt2989, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
													Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
													Static370.anInt6389 = 0;
													return;
												}
												return;
											} catch (@Pc(1939) IOException local1939) {
												Static106.method1864();
												return;
											}
										}
										local1437 = local1432.aClass89_12;
										if (local1437.anInt2720 < 0) {
											break;
										}
										local876 = Static40.method557(local1437.anInt2694);
									} while (local876 == null || local876.aClass89Array1 == null || local876.aClass89Array1.length <= local1437.anInt2720 || local876.aClass89Array1[local1437.anInt2720] != local1437);
									Static79.method1501(local1432);
								}
							}
							local1437 = local1432.aClass89_12;
							if (local1437.anInt2720 < 0) {
								break;
							}
							local876 = Static40.method557(local1437.anInt2694);
						} while (local876 == null || local876.aClass89Array1 == null || local876.aClass89Array1.length <= local1437.anInt2720 || local1437 != local876.aClass89Array1[local1437.anInt2720]);
						Static79.method1501(local1432);
					}
				}
				local1437 = local1432.aClass89_12;
				if (local1437.anInt2720 < 0) {
					break;
				}
				local876 = Static40.method557(local1437.anInt2694);
			} while (local876 == null || local876.aClass89Array1 == null || local876.aClass89Array1.length <= local1437.anInt2720 || local1437 != local876.aClass89Array1[local1437.anInt2720]);
			Static79.method1501(local1432);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static419.method5518(arg0)) {
			Static71.method983(Static166.aClass89ArrayArray2[arg0], arg1);
		}
	}
}
