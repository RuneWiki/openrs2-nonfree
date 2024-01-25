import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "I")
	public static int anInt3474 = 0;

	@OriginalMember(owner = "client!js", name = "R", descriptor = "[I")
	public static final int[] anIntArray307 = new int[32];

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIIII)V")
	public static void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg2);
		@Pc(20) int local20 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg3);
		@Pc(26) int local26 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg0);
		@Pc(32) int local32 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4);
		for (@Pc(34) int local34 = local14; local34 <= local20; local34++) {
			Static59.method1261(Static163.anIntArrayArray35[local34], local32, local26, arg1);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIII)V")
	public static void method3011(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static143.anInt2766 == 0) {
			Static127.method2242(false);
		} else {
			Static87.anInt1874 = Static143.anInt2766;
			Static178.method2844(0);
		}
		Static219.anInt4016 = arg2;
		Static456.aBoolean509 = arg1;
		Static134.anInt2688 = arg3;
		Static168.method417(arg0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIII)V")
	public static void method3014(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static155.anInt2952;
		@Pc(9) int[] local9 = Static381.anIntArray619;
		Static214.anInt5352 = 0;
		@Pc(174) int local174;
		@Pc(219) int local219;
		@Pc(265) int local265;
		@Pc(341) int local341;
		@Pc(419) int local419;
		@Pc(870) int local870;
		@Pc(525) int local525;
		for (@Pc(13) int local13 = 0; local13 < Static5.anInt163 + local7; local13++) {
			@Pc(17) Class53 local17 = null;
			@Pc(29) Class31_Sub2_Sub1 local29;
			if (local7 <= local13) {
				local29 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local13 - local7]];
				local17 = ((Class31_Sub2_Sub1_Sub2) local29).aClass53_1;
				if (local17.anIntArray131 != null) {
					local17 = local17.method1508(Static394.aClass23_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local29 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local9[local13]];
			}
			if (local29.anInt7349 >= 0 && (Static244.anInt4494 == local29.anInt7343 || Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 == local29.aByte100)) {
				Static344.method4827(arg0 >> 1, local29.method5987(), local29, arg3 >> 1);
				if (Static262.anIntArray406[0] >= 0) {
					if (local29.aString72 != null && (local13 >= local7 || Static456.anInt7402 == 0 || Static456.anInt7402 == 3 || Static456.anInt7402 == 1 && Static49.method879(((Class31_Sub2_Sub1_Sub1) local29).aString10)) && Static214.anInt5352 < Static429.anInt6935) {
						Static429.anIntArray626[Static214.anInt5352] = Static3.aClass151_6.method3475(local29.aString72) / 2;
						Static429.anIntArray624[Static214.anInt5352] = Static262.anIntArray406[0];
						Static429.anIntArray623[Static214.anInt5352] = Static262.anIntArray406[1];
						Static429.anIntArray625[Static214.anInt5352] = local29.anInt7344;
						Static429.anIntArray621[Static214.anInt5352] = local29.anInt7304;
						Static429.anIntArray622[Static214.anInt5352] = local29.anInt7313;
						Static429.aStringArray44[Static214.anInt5352] = local29.aString72;
						Static214.anInt5352++;
					}
					local174 = arg1 + Static262.anIntArray406[1];
					@Pc(250) Class143[] local250;
					@Pc(257) Class51[] local257;
					@Pc(313) Class143 local313;
					if (local29.aBoolean506 || local29.anInt7340 <= Static378.anInt4244) {
						local174 -= Math.max(Static3.aClass151_6.anInt4134, Static218.aClass143Array7[0].ma());
					} else {
						@Pc(201) byte local201 = 1;
						if (local13 < local7) {
							@Pc(214) Class31_Sub2_Sub1_Sub1 local214 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local9[local13]];
							local219 = local29.method5982().anInt623;
							if (local214.aBoolean70) {
								local201 = 2;
							}
						} else {
							local219 = local17.anInt1721;
							if (local219 == -1) {
								local219 = local29.method5982().anInt623;
							}
						}
						@Pc(240) Class143[] local240 = Static218.aClass143Array7;
						if (local219 != -1) {
							local250 = (Class143[]) Static409.aClass134_54.method3266((long) local219);
							if (local250 == null) {
								local257 = Static461.method1446(Static345.aClass246_187, local219);
								if (local257 != null) {
									local250 = new Class143[local257.length];
									for (local265 = 0; local265 < local257.length; local265++) {
										local250[local265] = Static415.aClass39_11.method4549(local257[local265]);
									}
									Static409.aClass134_54.method3263((long) local219, local250);
								}
							}
							if (local250 != null && local250.length >= 2) {
								local240 = local250;
							}
						}
						if (local240.length <= local201) {
							local201 = 1;
						}
						@Pc(309) Class143 local309 = local240[0];
						local313 = local240[local201];
						local174 -= Math.max(Static3.aClass151_6.anInt4134, local309.ma());
						local265 = arg2 + Static262.anIntArray406[0] - (local309.la() >> 1);
						local341 = local309.la() * local29.anInt7366 / 255;
						if (local29.anInt7366 > 0 && local341 < 2) {
							local341 = 2;
						}
						local309.method5723(local265, local174);
						Static415.aClass39_11.fa(local265, local174, local341 + local265, local174 + local309.ma());
						local313.method5723(local265, local174);
						Static415.aClass39_11.OA(arg2, arg1, arg2 + arg3, arg0 + arg1);
					}
					local174 -= 2;
					if (!local29.aBoolean506) {
						@Pc(402) Class143 local402;
						if (local29.anInt7348 > Static378.anInt4244) {
							local402 = Static446.aClass143Array14[local29.aBoolean504 ? 2 : 0];
							@Pc(411) Class143 local411 = Static446.aClass143Array14[local29.aBoolean504 ? 3 : 1];
							if (local29 instanceof Class31_Sub2_Sub1_Sub2) {
								local419 = local17.anInt1731;
								if (local419 == -1) {
									local419 = local29.method5982().anInt600;
								}
							} else {
								local419 = local29.method5982().anInt600;
							}
							if (local419 != -1) {
								local250 = (Class143[]) Static319.aClass134_35.method3266((long) local419);
								if (local250 == null) {
									local257 = Static461.method1446(Static345.aClass246_187, local419);
									if (local257 != null) {
										local250 = new Class143[local257.length];
										for (local265 = 0; local265 < local257.length; local265++) {
											local250[local265] = Static415.aClass39_11.method4549(local257[local265]);
										}
										Static319.aClass134_35.method3263((long) local419, local250);
									}
								}
								if (local250 != null && local250.length == 4) {
									local402 = local250[local29.aBoolean504 ? 2 : 0];
									local411 = local250[local29.aBoolean504 ? 3 : 1];
								}
							}
							@Pc(518) int local518 = local29.anInt7348 - Static378.anInt4244;
							if (local518 <= local29.anInt7330) {
								local525 = local402.la();
							} else {
								local518 -= local29.anInt7330;
								local265 = local29.anInt7325 == 0 ? 0 : local29.anInt7325 * ((local29.anInt7352 - local518) / local29.anInt7325);
								local525 = local402.la() * local265 / local29.anInt7352;
							}
							local265 = local402.ma();
							local174 -= local265;
							local341 = arg2 + Static262.anIntArray406[0] - (local402.la() >> 1);
							local402.method5723(local341, local174);
							Static415.aClass39_11.fa(local341, local174, local341 + local525, local174 + local265);
							local411.method5723(local341, local174);
							local174 -= 2;
							Static415.aClass39_11.OA(arg2, arg1, arg2 + arg3, arg0 + arg1);
						}
						if (local13 < local7) {
							@Pc(651) Class31_Sub2_Sub1_Sub1 local651 = (Class31_Sub2_Sub1_Sub1) local29;
							if (local651.anInt1286 != -1) {
								local174 -= 25;
								Static150.aClass143Array5[local651.anInt1286].method5723(arg2 + Static262.anIntArray406[0] - 12, local174);
								local174 -= 2;
							}
							if (local651.anInt1316 != -1) {
								local174 -= 25;
								Static311.aClass143Array9[local651.anInt1316].method5723(Static262.anIntArray406[0] + arg2 - 12, local174);
								local174 -= 2;
							}
						} else if (local17.anInt1715 >= 0 && Static311.aClass143Array9.length > local17.anInt1715) {
							local402 = Static311.aClass143Array9[local17.anInt1715];
							local174 -= 25;
							local402.method5723(arg2 + Static262.anIntArray406[0] - (local402.la() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(698) Class83[] local698;
					@Pc(706) Class83 local706;
					if (!(local29 instanceof Class31_Sub2_Sub1_Sub1)) {
						local219 = 0;
						local698 = Static353.aClass83Array2;
						for (local419 = 0; local419 < local698.length; local419++) {
							local706 = local698[local419];
							if (local706 != null && local706.anInt2462 == 1 && Static331.anIntArray648[local13 - local7] == local706.anInt2459) {
								local313 = Static141.aClass143Array3[local706.anInt2458];
								if (local313.ma() > local219) {
									local219 = local313.ma();
								}
								if (Static378.anInt4244 % 20 < 10) {
									local313.method5723(arg2 + Static262.anIntArray406[0] - 12, local174 - local313.ma());
								}
							}
						}
						if (local219 > 0) {
						}
					} else if (local13 >= 0) {
						local219 = 0;
						local698 = Static353.aClass83Array2;
						for (local419 = 0; local419 < local698.length; local419++) {
							local706 = local698[local419];
							if (local706 != null && local706.anInt2462 == 10 && local9[local13] == local706.anInt2459) {
								local313 = Static141.aClass143Array3[local706.anInt2458];
								if (local313.ma() > local219) {
									local219 = local313.ma();
								}
								local313.method5723(Static262.anIntArray406[0] + arg2 - 12, local174 + -local313.ma());
							}
						}
						if (local219 > 0) {
						}
					}
					for (local219 = 0; local219 < 4; local219++) {
						if (local29.anIntArray654[local219] > Static378.anInt4244) {
							local870 = local29.method5987() / 2;
							Static344.method4827(arg0 >> 1, local870, local29, arg3 >> 1);
							if (Static262.anIntArray406[0] > -1) {
								local419 = Static251.aClass143Array8[local29.anIntArray656[local219]].la();
								if (local219 == 1) {
									Static262.anIntArray406[1] -= 20;
								}
								if (local219 == 2) {
									Static262.anIntArray406[0] -= local419 - 9;
									Static262.anIntArray406[1] -= 10;
								}
								if (local219 == 3) {
									Static262.anIntArray406[1] -= 10;
									Static262.anIntArray406[0] += local419 - 9;
								}
								Static251.aClass143Array8[local29.anIntArray656[local219]].method5723(arg2 + Static262.anIntArray406[0] - (local419 >> 1), Static262.anIntArray406[1] + arg1 - 12);
								Static26.aClass71_1.method5446(Static262.anIntArray406[1] + arg1 + 3, Integer.toString(local29.anIntArray655[local219]), 0, -1, Static262.anIntArray406[0] + arg2 - 1);
							}
						}
					}
				}
			}
		}
		@Pc(1017) int local1017;
		for (@Pc(1011) int local1011 = 0; local1011 < Static67.anInt1513; local1011++) {
			local1017 = Static303.anIntArray452[local1011];
			@Pc(1026) Class31_Sub2_Sub1 local1026;
			if (local1017 >= 2048) {
				local1026 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local1017 - 2048];
			} else {
				local1026 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local1017];
			}
			local219 = Static139.anIntArray210[local1011];
			@Pc(1045) Class31_Sub2_Sub1 local1045;
			if (local219 < 2048) {
				local1045 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local219];
			} else {
				local1045 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local219 - 2048];
			}
			Static272.method4012(arg2, --local1026.anInt7322, local1045, arg1, local1026, arg3, arg0);
		}
		local1017 = Static3.aClass151_6.anInt4134 + Static3.aClass151_6.anInt4125 + 2;
		for (local174 = 0; local174 < Static214.anInt5352; local174++) {
			local219 = Static429.anIntArray624[local174];
			local870 = Static429.anIntArray623[local174];
			local419 = Static429.anIntArray626[local174];
			@Pc(1110) boolean local1110 = true;
			while (local1110) {
				local1110 = false;
				for (local525 = 0; local525 < local174; local525++) {
					if (local870 + 2 > Static429.anIntArray623[local525] + -local1017 && Static429.anIntArray623[local525] + 2 > local870 - local1017 && Static429.anIntArray626[local525] + Static429.anIntArray624[local525] > -local419 + local219 && local419 + local219 > -Static429.anIntArray626[local525] + Static429.anIntArray624[local525] && local870 > Static429.anIntArray623[local525] - local1017) {
						local870 = Static429.anIntArray623[local525] - local1017;
						local1110 = true;
					}
				}
			}
			Static429.anIntArray623[local174] = local870;
			@Pc(1200) String local1200 = Static429.aStringArray44[local174];
			if (Static392.anInt6294 == 0) {
				local265 = 16776960;
				if (Static429.anIntArray625[local174] < 6) {
					local265 = Static311.anIntArray464[Static429.anIntArray625[local174]];
				}
				if (Static429.anIntArray625[local174] == 6) {
					local265 = Static244.anInt4494 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static429.anIntArray625[local174] == 7) {
					local265 = Static244.anInt4494 % 20 >= 10 ? 65535 : 255;
				}
				if (Static429.anIntArray625[local174] == 8) {
					local265 = Static244.anInt4494 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static429.anIntArray625[local174] == 9) {
					local341 = 150 - Static429.anIntArray622[local174];
					if (local341 < 50) {
						local265 = local341 * 1280 + 16711680;
					} else if (local341 < 100) {
						local265 = 16384000 + 16776960 - local341 * 327680;
					} else if (local341 < 150) {
						local265 = local341 * 5 + 64780;
					}
				}
				if (Static429.anIntArray625[local174] == 10) {
					local341 = 150 - Static429.anIntArray622[local174];
					if (local341 < 50) {
						local265 = local341 * 5 + 16711680;
					} else if (local341 < 100) {
						local265 = 33095935 - local341 * 327680;
					} else if (local341 < 150) {
						local265 = local341 * 327680 + 255 + 500 - local341 * 5 - 32768000;
					}
				}
				if (Static429.anIntArray625[local174] == 11) {
					local341 = 150 - Static429.anIntArray622[local174];
					if (local341 < 50) {
						local265 = 16777215 - local341 * 327685;
					} else if (local341 < 100) {
						local265 = local341 * 327685 + 65280 - 16384250;
					} else if (local341 < 150) {
						local265 = 16777215 - (local341 - 100) * 327680;
					}
				}
				local341 = local265 | 0xFF000000;
				if (Static429.anIntArray621[local174] == 0) {
					Static178.aClass71_5.method5446(local870 + arg1, local1200, -16777216, local341, arg2 + local219);
				}
				if (Static429.anIntArray621[local174] == 1) {
					Static178.aClass71_5.method5447(Static244.anInt4494, local219 + arg2, local870 + arg1, local1200, local341);
				}
				if (Static429.anIntArray621[local174] == 2) {
					Static178.aClass71_5.method5450(arg1 + local870, local341, arg2 + local219, local1200, Static244.anInt4494);
				}
				if (Static429.anIntArray621[local174] == 3) {
					Static178.aClass71_5.method5457(local341, 150 - Static429.anIntArray622[local174], local870 + arg1, Static244.anInt4494, arg2 + local219, local1200);
				}
				@Pc(1555) int local1555;
				if (Static429.anIntArray621[local174] == 4) {
					local1555 = (150 - Static429.anIntArray622[local174]) * (Static3.aClass151_6.method3475(local1200) - -100) / 150;
					Static415.aClass39_11.fa(local219 + arg2 - 50, arg1, arg2 + local219 + 50, arg0 + arg1);
					Static178.aClass71_5.method5454(arg2 + local219 + 50 - local1555, -16777216, local341, local870 + arg1, local1200);
					Static415.aClass39_11.OA(arg2, arg1, arg3 + arg2, arg0 + arg1);
				}
				if (Static429.anIntArray621[local174] == 5) {
					local1555 = 150 - Static429.anIntArray622[local174];
					@Pc(1612) int local1612 = 0;
					if (local1555 < 25) {
						local1612 = local1555 - 25;
					} else if (local1555 > 125) {
						local1612 = local1555 - 125;
					}
					@Pc(1637) int local1637 = Static3.aClass151_6.anInt4134 + Static3.aClass151_6.anInt4125;
					Static415.aClass39_11.fa(arg2, arg1 + local870 - local1637 - 1, arg3 + arg2, arg1 + local870 + 5);
					Static178.aClass71_5.method5446(local870 + arg1 + local1612, local1200, -16777216, local341, local219 + arg2);
					Static415.aClass39_11.OA(arg2, arg1, arg3 + arg2, arg1 + arg0);
				}
			} else {
				Static178.aClass71_5.method5446(arg1 + local870, local1200, -16777216, -256, local219 + arg2);
			}
		}
	}
}
