import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void method1382() {
		for (@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) Static411.aClass265_50.method6005(); local10 != null; local10 = (Class2_Sub2_Sub1) Static411.aClass265_50.method6001()) {
			@Pc(15) Class4_Sub2_Sub5 local15 = local10.aClass4_Sub2_Sub5_1;
			if (local15.aByte92 != Static301.anInt5383 || Static164.anInt3206 > local15.anInt6597) {
				local10.method6072();
				local15.method5182();
			} else if (Static164.anInt3206 >= local15.lb) {
				if (local15.anInt6582 > 0) {
					@Pc(41) Class4_Sub2_Sub2_Sub2 local41 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local15.anInt6582 - 1];
					if (local41 != null && local41.anInt7117 >= 0 && local41.anInt7117 < Static81.anInt1950 * 128 && local41.anInt7111 >= 0 && local41.anInt7111 < Static171.anInt3288 * 128) {
						local15.method5183(Static164.anInt3206, Static66.method1200(local15.aByte92, local41.anInt7117, local41.anInt7111) - local15.anInt6606, local41.anInt7111, local41.anInt7117);
					}
				}
				if (local15.anInt6582 < 0) {
					@Pc(92) int local92 = -local15.anInt6582 - 1;
					@Pc(97) Class4_Sub2_Sub2_Sub1 local97;
					if (Static393.anInt6881 == local92) {
						local97 = Static231.aClass4_Sub2_Sub2_Sub1_2;
					} else {
						local97 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local92];
					}
					if (local97 != null && local97.anInt7117 >= 0 && local97.anInt7117 < Static81.anInt1950 * 128 && local97.anInt7111 >= 0 && local97.anInt7111 < Static171.anInt3288 * 128) {
						local15.method5183(Static164.anInt3206, Static66.method1200(local15.aByte92, local97.anInt7117, local97.anInt7111) - local15.anInt6606, local97.anInt7111, local97.anInt7117);
					}
				}
				local15.method5185(Static305.anInt1351);
				Static317.method4544(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBIIIII)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) int local12 = Static348.anInt6137;
		@Pc(14) int[] local14 = Static348.anIntArray412;
		Static332.anInt5919 = 0;
		@Pc(178) int local178;
		@Pc(195) int local195;
		@Pc(254) int local254;
		@Pc(333) int local333;
		@Pc(421) int local421;
		@Pc(873) int local873;
		@Pc(559) int local559;
		for (@Pc(18) int local18 = 0; local18 < Static391.anInt6867 + local12; local18++) {
			@Pc(22) Class215 local22 = null;
			@Pc(33) Class4_Sub2_Sub2 local33;
			if (local18 >= local12) {
				local33 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local18 - local12]];
				local22 = ((Class4_Sub2_Sub2_Sub2) local33).aClass215_1;
				if (local22.anIntArray400 != null) {
					local22 = local22.method4795(Static215.aClass225_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local33 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local14[local18]];
			}
			if (local33.anInt6471 >= 0 && (Static41.anInt1082 == local33.anInt6474 || local33.aByte92 == Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92)) {
				Static80.method1408(arg1 >> 1, local33, arg3 >> 1, local33.method5129());
				if (Static413.anIntArray483[0] >= 0) {
					if (local33.aString55 != null && (local12 <= local18 || Static385.anInt6819 == 0 || Static385.anInt6819 == 3 || Static385.anInt6819 == 1 && Static159.method2516(((Class4_Sub2_Sub2_Sub1) local33).aString48)) && Static164.anInt3207 > Static332.anInt5919) {
						Static164.anIntArray211[Static332.anInt5919] = Static55.aClass210_1.method4758(local33.aString55) / 2;
						Static164.anIntArray212[Static332.anInt5919] = Static413.anIntArray483[0];
						Static164.anIntArray215[Static332.anInt5919] = Static413.anIntArray483[1];
						Static164.anIntArray213[Static332.anInt5919] = local33.anInt6461;
						Static164.anIntArray210[Static332.anInt5919] = local33.anInt6485;
						Static164.anIntArray214[Static332.anInt5919] = local33.anInt6514;
						Static164.aStringArray13[Static332.anInt5919] = local33.aString55;
						Static332.anInt5919++;
					}
					local178 = arg0 + Static413.anIntArray483[1];
					@Pc(239) Class76[] local239;
					@Pc(246) Class89[] local246;
					@Pc(306) Class76 local306;
					if (local33.aBoolean559 || Static164.anInt3206 >= local33.anInt6451) {
						local178 -= Math.max(Static55.aClass210_1.anInt5946, Static192.aClass76Array6[0].qa());
					} else {
						@Pc(189) byte local189 = 1;
						if (local12 <= local18) {
							local195 = local22.anInt6034;
							if (local195 == -1) {
								local195 = local33.method5131().anInt329;
							}
						} else {
							@Pc(214) Class4_Sub2_Sub2_Sub1 local214 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local14[local18]];
							local195 = local33.method5131().anInt329;
							if (local214.aBoolean510) {
								local189 = 2;
							}
						}
						@Pc(226) Class76[] local226 = Static192.aClass76Array6;
						if (local195 != -1) {
							local239 = (Class76[]) Static356.aClass129_54.method3023((long) local195);
							if (local239 == null) {
								local246 = Static456.method1762(Static351.aClass188_97, local195);
								if (local246 != null) {
									local239 = new Class76[local246.length];
									for (local254 = 0; local254 < local246.length; local254++) {
										local239[local254] = Static387.aClass26_9.method2230(local246[local254]);
									}
									Static356.aClass129_54.method3029(local239, (long) local195);
								}
							}
							if (local239 != null && local239.length >= 2) {
								local226 = local239;
							}
						}
						if (local189 >= local226.length) {
							local189 = 1;
						}
						@Pc(302) Class76 local302 = local226[0];
						local306 = local226[local189];
						local178 -= Math.max(Static55.aClass210_1.anInt5946, local302.qa());
						local254 = Static413.anIntArray483[0] + arg2 - (local302.UA() >> 1);
						local333 = local302.UA() * local33.anInt6511 / 255;
						if (local33.anInt6511 > 0 && local333 < 2) {
							local333 = 2;
						}
						local302.method6088(local254, local178);
						Static387.aClass26_9.Z(local254, local178, local254 + local333, local178 + local302.qa());
						local306.method6088(local254, local178);
						Static387.aClass26_9.pa(arg2, arg0, arg2 + arg1, arg0 + arg3);
					}
					local178 -= 2;
					if (!local33.aBoolean559) {
						@Pc(402) Class76 local402;
						if (local33.anInt6475 > Static164.anInt3206) {
							local402 = Static375.aClass76Array17[local33.aBoolean562 ? 2 : 0];
							@Pc(411) Class76 local411 = Static375.aClass76Array17[local33.aBoolean562 ? 3 : 1];
							if (local33 instanceof Class4_Sub2_Sub2_Sub2) {
								local421 = local22.anInt6019;
								if (local421 == -1) {
									local421 = local33.method5131().anInt341;
								}
							} else {
								local421 = local33.method5131().anInt341;
							}
							if (local421 != -1) {
								local239 = (Class76[]) Static342.aClass129_53.method3023((long) local421);
								if (local239 == null) {
									local246 = Static456.method1762(Static351.aClass188_97, local421);
									if (local246 != null) {
										local239 = new Class76[local246.length];
										for (local254 = 0; local254 < local246.length; local254++) {
											local239[local254] = Static387.aClass26_9.method2230(local246[local254]);
										}
										Static342.aClass129_53.method3029(local239, (long) local421);
									}
								}
								if (local239 != null && local239.length == 4) {
									local402 = local239[local33.aBoolean562 ? 2 : 0];
									local411 = local239[local33.aBoolean562 ? 3 : 1];
								}
							}
							@Pc(519) int local519 = local33.anInt6475 - Static164.anInt3206;
							if (local33.anInt6502 < local519) {
								local519 -= local33.anInt6502;
								local254 = local33.anInt6516 == 0 ? 0 : local33.anInt6516 * ((local33.anInt6489 - local519) / local33.anInt6516);
								local559 = local254 * local402.UA() / local33.anInt6489;
							} else {
								local559 = local402.UA();
							}
							local254 = local402.qa();
							local178 -= local254;
							local333 = arg2 + Static413.anIntArray483[0] - (local402.UA() >> 1);
							local402.method6088(local333, local178);
							Static387.aClass26_9.Z(local333, local178, local333 + local559, local254 + local178);
							local411.method6088(local333, local178);
							Static387.aClass26_9.pa(arg2, arg0, arg1 + arg2, arg3 + arg0);
							local178 -= 2;
						}
						if (local18 < local12) {
							@Pc(659) Class4_Sub2_Sub2_Sub1 local659 = (Class4_Sub2_Sub2_Sub1) local33;
							if (local659.anInt5720 != -1) {
								local178 -= 25;
								Static372.aClass76Array16[local659.anInt5720].method6088(arg2 + Static413.anIntArray483[0] - 12, local178);
								local178 -= 2;
							}
							if (local659.anInt5740 != -1) {
								local178 -= 25;
								Static266.aClass76Array14[local659.anInt5740].method6088(arg2 + Static413.anIntArray483[0] - 12, local178);
								local178 -= 2;
							}
						} else if (local22.anInt6018 >= 0 && Static266.aClass76Array14.length > local22.anInt6018) {
							local402 = Static266.aClass76Array14[local22.anInt6018];
							local178 -= 25;
							local402.method6088(arg2 + Static413.anIntArray483[0] - (local402.UA() >> 1), local178);
							local178 -= 2;
						}
					}
					@Pc(710) Class233[] local710;
					@Pc(718) Class233 local718;
					if (!(local33 instanceof Class4_Sub2_Sub2_Sub1)) {
						local195 = 0;
						local710 = Static2.aClass233Array1;
						for (local421 = 0; local421 < local710.length; local421++) {
							local718 = local710[local421];
							if (local718 != null && local718.anInt6828 == 1 && local718.anInt6821 == Static312.anIntArray202[local18 - local12]) {
								local306 = Static76.aClass76Array8[local718.anInt6825];
								if (local195 < local306.qa()) {
									local195 = local306.qa();
								}
								if (Static164.anInt3206 % 20 < 10) {
									local306.method6088(Static413.anIntArray483[0] + arg2 - 12, local178 + -local306.qa());
								}
							}
						}
						if (local195 > 0) {
						}
					} else if (local18 >= 0) {
						local195 = 0;
						local710 = Static2.aClass233Array1;
						for (local421 = 0; local421 < local710.length; local421++) {
							local718 = local710[local421];
							if (local718 != null && local718.anInt6828 == 10 && local718.anInt6821 == local14[local18]) {
								local306 = Static76.aClass76Array8[local718.anInt6825];
								if (local195 < local306.qa()) {
									local195 = local306.qa();
								}
								local306.method6088(arg2 + Static413.anIntArray483[0] - 12, local178 - local306.qa());
							}
						}
						if (local195 > 0) {
						}
					}
					for (local195 = 0; local195 < 4; local195++) {
						if (Static164.anInt3206 < local33.anIntArray433[local195]) {
							local873 = local33.method5129() / 2;
							Static80.method1408(arg1 >> 1, local33, arg3 >> 1, local873);
							if (Static413.anIntArray483[0] > -1) {
								if (local195 == 1) {
									Static413.anIntArray483[1] -= 20;
								}
								if (local195 == 2) {
									Static413.anIntArray483[0] -= 15;
									Static413.anIntArray483[1] -= 10;
								}
								if (local195 == 3) {
									Static413.anIntArray483[0] += 15;
									Static413.anIntArray483[1] -= 10;
								}
								Static218.aClass76Array3[local33.anIntArray434[local195]].method6088(arg2 + Static413.anIntArray483[0] - 12, Static413.anIntArray483[1] + (arg0 - 12));
								Static418.aClass56_4.method5844(0, arg0 + Static413.anIntArray483[1] + 3, -1, arg2 - (-Static413.anIntArray483[0] + 1), Integer.toString(local33.anIntArray431[local195]));
							}
						}
					}
				}
			}
		}
		@Pc(1005) int local1005;
		for (@Pc(999) int local999 = 0; local999 < Static393.anInt6879; local999++) {
			local1005 = Static56.anIntArray66[local999];
			@Pc(1014) Class4_Sub2_Sub2 local1014;
			if (local1005 < 2048) {
				local1014 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local1005];
			} else {
				local1014 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local1005 - 2048];
			}
			local195 = Static118.anIntArray134[local999];
			@Pc(1033) Class4_Sub2_Sub2 local1033;
			if (local195 < 2048) {
				local1033 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local195];
			} else {
				local1033 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local195 - 2048];
			}
			Static336.method4752(arg0, arg2, --local1014.anInt6455, arg3, arg1, local1033, local1014);
		}
		local1005 = Static55.aClass210_1.anInt5944 + Static55.aClass210_1.anInt5946 + 2;
		for (local178 = 0; local178 < Static332.anInt5919; local178++) {
			local195 = Static164.anIntArray212[local178];
			local873 = Static164.anIntArray215[local178];
			local421 = Static164.anIntArray211[local178];
			@Pc(1088) boolean local1088 = true;
			while (local1088) {
				local1088 = false;
				for (local559 = 0; local559 < local178; local559++) {
					if (local873 + 2 > -local1005 + Static164.anIntArray215[local559] && Static164.anIntArray215[local559] + 2 > -local1005 + local873 && local195 - local421 < Static164.anIntArray211[local559] + Static164.anIntArray212[local559] && local421 + local195 > Static164.anIntArray212[local559] - Static164.anIntArray211[local559] && Static164.anIntArray215[local559] - local1005 < local873) {
						local873 = Static164.anIntArray215[local559] - local1005;
						local1088 = true;
					}
				}
			}
			Static164.anIntArray215[local178] = local873;
			@Pc(1182) String local1182 = Static164.aStringArray13[local178];
			if (Static264.anInt4916 == 0) {
				local254 = 16776960;
				if (Static164.anIntArray213[local178] < 6) {
					local254 = Static183.anIntArray241[Static164.anIntArray213[local178]];
				}
				if (Static164.anIntArray213[local178] == 6) {
					local254 = Static41.anInt1082 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static164.anIntArray213[local178] == 7) {
					local254 = Static41.anInt1082 % 20 < 10 ? 255 : 65535;
				}
				if (Static164.anIntArray213[local178] == 8) {
					local254 = Static41.anInt1082 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static164.anIntArray213[local178] == 9) {
					local333 = 150 - Static164.anIntArray214[local178];
					if (local333 < 50) {
						local254 = local333 * 1280 + 16711680;
					} else if (local333 < 100) {
						local254 = 16776960 + 16384000 - local333 * 327680;
					} else if (local333 < 150) {
						local254 = local333 * 5 + 65280 - 500;
					}
				}
				if (Static164.anIntArray213[local178] == 10) {
					local333 = 150 - Static164.anIntArray214[local178];
					if (local333 < 50) {
						local254 = local333 * 5 + 16711680;
					} else if (local333 < 100) {
						local254 = 16711935 + 16384000 - local333 * 327680;
					} else if (local333 < 150) {
						local254 = local333 * 327680 - (local333 - 100) * 5 - 32767745;
					}
				}
				if (Static164.anIntArray213[local178] == 11) {
					local333 = 150 - Static164.anIntArray214[local178];
					if (local333 < 50) {
						local254 = 16777215 - local333 * 327685;
					} else if (local333 < 100) {
						local254 = (local333 - 50) * 327685 + 65280;
					} else if (local333 < 150) {
						local254 = 16777215 + 32768000 - local333 * 327680;
					}
				}
				local333 = local254 | 0xFF000000;
				if (Static164.anIntArray210[local178] == 0) {
					Static193.aClass56_3.method5844(-16777216, local873 + arg0, local333, arg2 + local195, local1182);
				}
				if (Static164.anIntArray210[local178] == 1) {
					Static193.aClass56_3.method5840(arg0 + local873, arg2 + local195, local333, local1182, Static41.anInt1082);
				}
				if (Static164.anIntArray210[local178] == 2) {
					Static193.aClass56_3.method5837(arg0 + local873, local333, local1182, arg2 + local195, Static41.anInt1082);
				}
				if (Static164.anIntArray210[local178] == 3) {
					Static193.aClass56_3.method5852(local333, local1182, 150 - Static164.anIntArray214[local178], local873 + arg0, local195 + arg2, Static41.anInt1082);
				}
				@Pc(1522) int local1522;
				if (Static164.anIntArray210[local178] == 4) {
					local1522 = (150 - Static164.anIntArray214[local178]) * (Static55.aClass210_1.method4758(local1182) + 100) / 150;
					Static387.aClass26_9.Z(arg2 + local195 - 50, arg0, local195 + arg2 + 50, arg3 + arg0);
					Static193.aClass56_3.method5848(local1182, arg0 + local873, local333, arg2 + local195 + 50 - local1522, -16777216);
					Static387.aClass26_9.pa(arg2, arg0, arg2 + arg1, arg0 + arg3);
				}
				if (Static164.anIntArray210[local178] == 5) {
					local1522 = 150 - Static164.anIntArray214[local178];
					@Pc(1582) int local1582 = 0;
					if (local1522 < 25) {
						local1582 = local1522 - 25;
					} else if (local1522 > 125) {
						local1582 = local1522 - 125;
					}
					@Pc(1606) int local1606 = Static55.aClass210_1.anInt5944 + Static55.aClass210_1.anInt5946;
					Static387.aClass26_9.Z(arg2, arg0 + local873 - local1606 - 1, arg2 + arg1, arg0 + local873 + 5);
					Static193.aClass56_3.method5844(-16777216, local873 + arg0 + local1582, local333, local195 + arg2, local1182);
					Static387.aClass26_9.pa(arg2, arg0, arg1 + arg2, arg0 - -arg3);
				}
			} else {
				Static193.aClass56_3.method5844(-16777216, arg0 + local873, -256, arg2 + local195, local1182);
			}
		}
	}
}
