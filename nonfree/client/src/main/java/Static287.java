import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lq", name = "S", descriptor = "Lclient!ao;")
	public static Class17 aClass17_27;

	@OriginalMember(owner = "client!lq", name = "Z", descriptor = "[[I")
	public static int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_159 = new Class88("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!lq", name = "X", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_12 = new Class225(9, 0, 4, 1);

	@OriginalMember(owner = "client!lq", name = "Y", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
	public static void method4698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(11) int local11 = Static381.anInt7254;
		Static25.anInt419 = 0;
		@Pc(15) int[] local15 = Static496.anIntArray465;
		@Pc(191) int local191;
		@Pc(216) int local216;
		@Pc(270) int local270;
		@Pc(344) int local344;
		@Pc(435) int local435;
		@Pc(889) int local889;
		@Pc(538) int local538;
		for (@Pc(17) int local17 = 0; local17 < Static451.anInt4553 + local11; local17++) {
			@Pc(21) Class130 local21 = null;
			@Pc(43) Class30_Sub1_Sub1 local43;
			if (local11 <= local17) {
				local43 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local17 - local11])).aClass30_Sub1_Sub1_Sub2_2;
				local21 = ((Class30_Sub1_Sub1_Sub2) local43).aClass130_1;
				if (local21.anIntArray308 != null) {
					local21 = local21.method3570(Static393.aClass31_1);
					if (local21 == null) {
						continue;
					}
				}
			} else {
				local43 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local15[local17]];
			}
			if (local43.anInt4182 >= 0 && (Static491.anInt8889 == local43.anInt4158 || Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 == local43.aByte99)) {
				Static125.method2669(local43, arg3 >> 1, arg1 >> 1, local43.method3597());
				if (Static147.anIntArray243[0] >= 0) {
					if (local43.aString38 != null && (local17 >= local11 || Static177.anInt3997 == 0 || Static177.anInt3997 == 3 || Static177.anInt3997 == 1 && Static68.method1558(((Class30_Sub1_Sub1_Sub1) local43).aString6)) && Static25.anInt419 < Static324.anInt6092) {
						Static324.anIntArray428[Static25.anInt419] = Static445.aClass244_7.method6147(local43.aString38) / 2;
						Static324.anIntArray429[Static25.anInt419] = Static147.anIntArray243[0];
						Static324.anIntArray430[Static25.anInt419] = Static147.anIntArray243[1];
						Static324.anIntArray427[Static25.anInt419] = local43.anInt4175;
						Static324.anIntArray431[Static25.anInt419] = local43.anInt4160;
						Static324.anIntArray432[Static25.anInt419] = local43.anInt4170;
						Static324.aStringArray38[Static25.anInt419] = local43.aString38;
						Static25.anInt419++;
					}
					local191 = Static147.anIntArray243[1] + arg2;
					@Pc(255) Class84[] local255;
					@Pc(262) Class40[] local262;
					@Pc(316) Class84 local316;
					if (local43.aBoolean334 || Static409.anInt7683 >= local43.anInt4144) {
						local191 -= Math.max(Static445.aClass244_7.anInt7376, Static316.aClass84Array11[0].la());
					} else {
						@Pc(206) byte local206 = 1;
						if (local17 >= local11) {
							local216 = local21.anInt4078;
							if (local216 == -1) {
								local216 = local43.method3602().anInt4954;
							}
						} else {
							@Pc(233) Class30_Sub1_Sub1_Sub1 local233 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local15[local17]];
							local216 = local43.method3602().anInt4954;
							if (local233.aBoolean43) {
								local206 = 2;
							}
						}
						@Pc(245) Class84[] local245 = Static316.aClass84Array11;
						if (local216 != -1) {
							local255 = (Class84[]) Static316.aClass125_45.method3446((long) local216);
							if (local255 == null) {
								local262 = Static550.method895(Static440.aClass16_103, local216);
								if (local262 != null) {
									local255 = new Class84[local262.length];
									for (local270 = 0; local270 < local262.length; local270++) {
										local255[local270] = Static243.aClass42_4.method5839(local262[local270]);
									}
									Static316.aClass125_45.method3437(local255, (long) local216);
								}
							}
							if (local255 != null && local255.length >= 2) {
								local245 = local255;
							}
						}
						if (local206 >= local245.length) {
							local206 = 1;
						}
						@Pc(312) Class84 local312 = local245[0];
						local316 = local245[local206];
						local191 -= Math.max(Static445.aClass244_7.anInt7376, local312.la());
						local270 = Static147.anIntArray243[0] + arg0 - (local312.c() >> 1);
						local344 = local312.c() * local43.anInt4165 / 255;
						if (local43.anInt4165 > 0 && local344 < 2) {
							local344 = 2;
						}
						local312.method7487(local270, local191);
						Static243.aClass42_4.F(local270, local191, local344 + local270, local312.la() + local191);
						local316.method7487(local270, local191);
						Static243.aClass42_4.N(arg0, arg2, arg0 + arg3, arg2 + arg1);
					}
					local191 -= 2;
					if (!local43.aBoolean334) {
						@Pc(416) Class84 local416;
						if (Static409.anInt7683 < local43.anInt4137) {
							local416 = Static308.aClass84Array10[local43.aBoolean336 ? 2 : 0];
							@Pc(425) Class84 local425 = Static308.aClass84Array10[local43.aBoolean336 ? 3 : 1];
							if (local43 instanceof Class30_Sub1_Sub1_Sub2) {
								local435 = local21.anInt4097;
								if (local435 == -1) {
									local435 = local43.method3602().anInt4965;
								}
							} else {
								local435 = local43.method3602().anInt4965;
							}
							if (local435 != -1) {
								local255 = (Class84[]) Static420.aClass125_58.method3446((long) local435);
								if (local255 == null) {
									local262 = Static550.method895(Static440.aClass16_103, local435);
									if (local262 != null) {
										local255 = new Class84[local262.length];
										for (local270 = 0; local270 < local262.length; local270++) {
											local255[local270] = Static243.aClass42_4.method5839(local262[local270]);
										}
										Static420.aClass125_58.method3437(local255, (long) local435);
									}
								}
								if (local255 != null && local255.length == 4) {
									local425 = local255[local43.aBoolean336 ? 3 : 1];
									local416 = local255[local43.aBoolean336 ? 2 : 0];
								}
							}
							@Pc(531) int local531 = local43.anInt4137 - Static409.anInt7683;
							if (local43.anInt4133 >= local531) {
								local538 = local416.c();
							} else {
								local531 -= local43.anInt4133;
								local270 = local43.anInt4128 == 0 ? 0 : local43.anInt4128 * ((local43.anInt4129 - local531) / local43.anInt4128);
								local538 = local416.c() * local270 / local43.anInt4129;
							}
							local270 = local416.la();
							local191 -= local270;
							local344 = Static147.anIntArray243[0] + arg0 - (local416.c() >> 1);
							local416.method7487(local344, local191);
							Static243.aClass42_4.F(local344, local191, local344 + local538, local270 + local191);
							local425.method7487(local344, local191);
							Static243.aClass42_4.N(arg0, arg2, arg3 + arg0, arg2 + arg1);
							local191 -= 2;
						}
						if (local17 < local11) {
							@Pc(663) Class30_Sub1_Sub1_Sub1 local663 = (Class30_Sub1_Sub1_Sub1) local43;
							if (local663.anInt732 != -1) {
								local191 -= 25;
								Static225.aClass84Array6[local663.anInt732].method7487(Static147.anIntArray243[0] + arg0 - 12, local191);
								local191 -= 2;
							}
							if (local663.anInt735 != -1) {
								local191 -= 25;
								Static243.aClass84Array7[local663.anInt735].method7487(arg0 + Static147.anIntArray243[0] - 12, local191);
								local191 -= 2;
							}
						} else if (local21.anInt4094 >= 0 && local21.anInt4094 < Static243.aClass84Array7.length) {
							local416 = Static243.aClass84Array7[local21.anInt4094];
							local191 -= 25;
							local416.method7487(Static147.anIntArray243[0] + arg0 - (local416.c() >> 1), local191);
							local191 -= 2;
						}
					}
					@Pc(709) Class76[] local709;
					@Pc(717) Class76 local717;
					if (!(local43 instanceof Class30_Sub1_Sub1_Sub1)) {
						local216 = 0;
						local709 = Static22.aClass76Array28;
						for (local435 = 0; local435 < local709.length; local435++) {
							local717 = local709[local435];
							if (local717 != null && local717.anInt2310 == 1 && local717.anInt2309 == Static11.anIntArray16[local17 - local11]) {
								local316 = Static450.aClass84Array13[local717.anInt2315];
								if (local216 < local316.la()) {
									local216 = local316.la();
								}
								if (Static409.anInt7683 % 20 < 10) {
									local316.method7487(arg0 + Static147.anIntArray243[0] - 12, -local316.la() + local191);
								}
							}
						}
						if (local216 > 0) {
						}
					} else if (local17 >= 0) {
						local216 = 0;
						local709 = Static22.aClass76Array28;
						for (local435 = 0; local435 < local709.length; local435++) {
							local717 = local709[local435];
							if (local717 != null && local717.anInt2310 == 10 && local15[local17] == local717.anInt2309) {
								local316 = Static450.aClass84Array13[local717.anInt2315];
								if (local316.la() > local216) {
									local216 = local316.la();
								}
								local316.method7487(Static147.anIntArray243[0] + arg0 - 12, -local316.la() + local191);
							}
						}
						if (local216 > 0) {
						}
					}
					for (local216 = 0; local216 < 4; local216++) {
						if (local43.anIntArray314[local216] > Static409.anInt7683) {
							local889 = local43.method3597() / 2;
							Static125.method2669(local43, arg3 >> 1, arg1 >> 1, local889);
							if (Static147.anIntArray243[0] > -1) {
								local435 = Static24.aClass84Array2[local43.anIntArray315[local216]].c();
								if (local216 == 1) {
									Static147.anIntArray243[1] -= 20;
								}
								if (local216 == 2) {
									Static147.anIntArray243[0] -= local435 - 9;
									Static147.anIntArray243[1] -= 10;
								}
								if (local216 == 3) {
									Static147.anIntArray243[1] -= 10;
									Static147.anIntArray243[0] += local435 - 9;
								}
								Static24.aClass84Array2[local43.anIntArray315[local216]].method7487(Static147.anIntArray243[0] + arg0 - (local435 >> 1), arg2 + -12 + Static147.anIntArray243[1]);
								Static340.aClass80_3.method7772(Static147.anIntArray243[1] + arg2 + 3, -1, -1 + arg0 + Static147.anIntArray243[0], Integer.toString(local43.anIntArray312[local216]), 0);
							}
						}
					}
				}
			}
		}
		@Pc(1035) int local1035;
		for (@Pc(1029) int local1029 = 0; local1029 < Static348.anInt6539; local1029++) {
			local1035 = Static290.anIntArray398[local1029];
			@Pc(1044) Class30_Sub1_Sub1 local1044;
			if (local1035 < 2048) {
				local1044 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local1035];
			} else {
				local1044 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) (local1035 - 2048))).aClass30_Sub1_Sub1_Sub2_2;
			}
			local216 = Static354.anIntArray459[local1029];
			@Pc(1075) Class30_Sub1_Sub1 local1075;
			if (local216 >= 2048) {
				local1075 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) (local216 - 2048))).aClass30_Sub1_Sub1_Sub2_2;
			} else {
				local1075 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local216];
			}
			Static365.method5702(arg2, arg1, local1044, arg0, local1075, arg3, --local1044.anInt4176);
		}
		local1035 = Static445.aClass244_7.anInt7388 + Static445.aClass244_7.anInt7376 + 2;
		for (local191 = 0; local191 < Static25.anInt419; local191++) {
			local216 = Static324.anIntArray429[local191];
			local889 = Static324.anIntArray430[local191];
			local435 = Static324.anIntArray428[local191];
			@Pc(1128) boolean local1128 = true;
			while (local1128) {
				local1128 = false;
				for (local538 = 0; local538 < local191; local538++) {
					if (Static324.anIntArray430[local538] - local1035 < local889 + 2 && Static324.anIntArray430[local538] + 2 > -local1035 + local889 && local216 - local435 < Static324.anIntArray428[local538] + Static324.anIntArray429[local538] && Static324.anIntArray429[local538] - Static324.anIntArray428[local538] < local435 + local216 && Static324.anIntArray430[local538] - local1035 < local889) {
						local889 = Static324.anIntArray430[local538] - local1035;
						local1128 = true;
					}
				}
			}
			Static324.anIntArray430[local191] = local889;
			@Pc(1219) String local1219 = Static324.aStringArray38[local191];
			if (Static261.anInt5287 == 0) {
				local270 = 16776960;
				if (Static324.anIntArray427[local191] < 6) {
					local270 = Static537.anIntArray688[Static324.anIntArray427[local191]];
				}
				if (Static324.anIntArray427[local191] == 6) {
					local270 = Static491.anInt8889 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static324.anIntArray427[local191] == 7) {
					local270 = Static491.anInt8889 % 20 < 10 ? 255 : 65535;
				}
				if (Static324.anIntArray427[local191] == 8) {
					local270 = Static491.anInt8889 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static324.anIntArray427[local191] == 9) {
					local344 = 150 - Static324.anIntArray432[local191];
					if (local344 < 50) {
						local270 = local344 * 1280 + 16711680;
					} else if (local344 < 100) {
						local270 = 33160960 - local344 * 327680;
					} else if (local344 < 150) {
						local270 = (local344 - 100) * 5 + 65280;
					}
				}
				if (Static324.anIntArray427[local191] == 10) {
					local344 = 150 - Static324.anIntArray432[local191];
					if (local344 < 50) {
						local270 = local344 * 5 + 16711680;
					} else if (local344 < 100) {
						local270 = 16711935 + 16384000 - local344 * 327680;
					} else if (local344 < 150) {
						local270 = local344 * 327680 + 255 - (local344 + -100) * 5 - 32768000;
					}
				}
				if (Static324.anIntArray427[local191] == 11) {
					local344 = 150 - Static324.anIntArray432[local191];
					if (local344 < 50) {
						local270 = 16777215 - local344 * 327685;
					} else if (local344 < 100) {
						local270 = (local344 - 50) * 327685 + 65280;
					} else if (local344 < 150) {
						local270 = 16777215 - (local344 - 100) * 327680;
					}
				}
				local344 = local270 | 0xFF000000;
				if (Static324.anIntArray431[local191] == 0) {
					Static12.aClass80_1.method7772(local889 + arg2, local344, arg0 + local216, local1219, -16777216);
				}
				if (Static324.anIntArray431[local191] == 1) {
					Static12.aClass80_1.method7768(arg2 + local889, local344, Static491.anInt8889, local1219, local216 + arg0);
				}
				if (Static324.anIntArray431[local191] == 2) {
					Static12.aClass80_1.method7766(local889 + arg2, Static491.anInt8889, local344, local1219, local216 + arg0);
				}
				if (Static324.anIntArray431[local191] == 3) {
					Static12.aClass80_1.method7774(local344, Static491.anInt8889, local1219, local216 + arg0, -Static324.anIntArray432[local191] + 150, local889 + arg2);
				}
				@Pc(1551) int local1551;
				if (Static324.anIntArray431[local191] == 4) {
					local1551 = (150 - Static324.anIntArray432[local191]) * (Static445.aClass244_7.method6147(local1219) + 100) / 150;
					Static243.aClass42_4.F(arg0 + local216 - 50, arg2, local216 + arg0 + 50, arg1 + arg2);
					Static12.aClass80_1.method7769(-16777216, arg0 + local216 + 50 - local1551, local1219, local889 + arg2, local344);
					Static243.aClass42_4.N(arg0, arg2, arg3 + arg0, arg2 + arg1);
				}
				if (Static324.anIntArray431[local191] == 5) {
					local1551 = 150 - Static324.anIntArray432[local191];
					@Pc(1608) int local1608 = 0;
					if (local1551 < 25) {
						local1608 = local1551 - 25;
					} else if (local1551 > 125) {
						local1608 = local1551 - 125;
					}
					@Pc(1634) int local1634 = Static445.aClass244_7.anInt7376 + Static445.aClass244_7.anInt7388;
					Static243.aClass42_4.F(arg0, local889 + arg2 - local1634 - 1, arg0 + arg3, local889 + arg2 + 5);
					Static12.aClass80_1.method7772(local1608 + local889 + arg2, local344, arg0 + local216, local1219, -16777216);
					Static243.aClass42_4.N(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static12.aClass80_1.method7772(arg2 + local889, -256, arg0 + local216, local1219, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4699(@OriginalArg(1) String arg0) {
		if (Static92.aString17.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static92.aString17.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static92.aString17.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			throw new RuntimeException();
		}
	}
}
