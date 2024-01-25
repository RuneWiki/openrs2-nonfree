import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Lclient!dj;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_202 = new Class305(37, 5);

	@OriginalMember(owner = "client!j", name = "U", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method3971(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static213.method3946(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static207.anInt4085;
		@Pc(14) int[] local14 = Static209.anIntArray327;
		Class1_Sub3_Sub1.lb = 0;
		@Pc(175) int local175;
		@Pc(204) int local204;
		@Pc(258) int local258;
		@Pc(339) int local339;
		@Pc(418) int local418;
		@Pc(863) int local863;
		@Pc(525) int local525;
		for (@Pc(18) int local18 = 0; local18 < local12 + Static141.anInt2822; local18++) {
			@Pc(22) Class283 local22 = null;
			@Pc(38) Class20_Sub1_Sub1 local38;
			if (local18 >= local12) {
				local38 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local18 - local12])).aClass20_Sub1_Sub1_Sub2_2;
				local22 = ((Class20_Sub1_Sub1_Sub2) local38).aClass283_1;
				if (local22.anIntArray743 != null) {
					local22 = local22.method7368(Static417.aClass10_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local38 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local14[local18]];
			}
			if (local38.anInt9029 >= 0 && (Static389.anInt6904 == local38.anInt9017 || Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 == local38.aByte108)) {
				Static415.method6535(arg3 >> 1, local38.method7805(), arg2 >> 1, local38);
				if (Static32.anIntArray66[0] >= 0) {
					if (local38.aString205 != null && (local18 >= local12 || Static78.anInt1854 == 0 || Static78.anInt1854 == 3 || Static78.anInt1854 == 1 && Static164.method2935(((Class20_Sub1_Sub1_Sub1) local38).aString13)) && Static531.anInt9389 > Class1_Sub3_Sub1.lb) {
						Static531.anIntArray823[Class1_Sub3_Sub1.lb] = Static270.aClass96_10.method2370(local38.aString205) / 2;
						Static531.anIntArray818[Class1_Sub3_Sub1.lb] = Static32.anIntArray66[0];
						Static531.anIntArray821[Class1_Sub3_Sub1.lb] = Static32.anIntArray66[1];
						Static531.anIntArray820[Class1_Sub3_Sub1.lb] = local38.anInt9021;
						Static531.anIntArray822[Class1_Sub3_Sub1.lb] = local38.anInt9010;
						Static531.anIntArray819[Class1_Sub3_Sub1.lb] = local38.anInt9008;
						Static531.aStringArray40[Class1_Sub3_Sub1.lb] = local38.aString205;
						Class1_Sub3_Sub1.lb++;
					}
					local175 = arg0 + Static32.anIntArray66[1];
					@Pc(243) Class104[] local243;
					@Pc(250) Class70[] local250;
					@Pc(312) Class104 local312;
					if (local38.aBoolean678 || local38.anInt8982 <= Static445.anInt7791) {
						local175 -= Math.max(Static270.aClass96_10.anInt2545, Static342.aClass104Array59[0].la());
					} else {
						@Pc(198) byte local198 = 1;
						if (local12 <= local18) {
							local204 = local22.anInt8441;
							if (local204 == -1) {
								local204 = local38.method7819().anInt8824;
							}
						} else {
							@Pc(221) Class20_Sub1_Sub1_Sub1 local221 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local14[local18]];
							local204 = local38.method7819().anInt8824;
							if (local221.aBoolean54) {
								local198 = 2;
							}
						}
						@Pc(233) Class104[] local233 = Static342.aClass104Array59;
						if (local204 != -1) {
							local243 = (Class104[]) Static163.aClass277_25.method7014((long) local204);
							if (local243 == null) {
								local250 = Static547.method1918(Static46.aClass69_14, local204);
								if (local250 != null) {
									local243 = new Class104[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static455.aClass4_11.method7149(local250[local258]);
									}
									Static163.aClass277_25.method7016(local243, (long) local204);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local233 = local243;
							}
						}
						if (local233.length <= local198) {
							local198 = 1;
						}
						@Pc(308) Class104 local308 = local233[0];
						local312 = local233[local198];
						local175 -= Math.max(Static270.aClass96_10.anInt2545, local308.la());
						local258 = Static32.anIntArray66[0] + arg1 - (local308.c() >> 1);
						local339 = local308.c() * local38.anInt8996 / 255;
						if (local38.anInt8996 > 0 && local339 < 2) {
							local339 = 2;
						}
						local308.method7716(local258, local175);
						Static455.aClass4_11.F(local258, local175, local339 + local258, local308.la() + local175);
						local312.method7716(local258, local175);
						Static455.aClass4_11.N(arg1, arg0, arg1 + arg2, arg3 + arg0);
					}
					local175 -= 2;
					if (!local38.aBoolean678) {
						@Pc(401) Class104 local401;
						if (Static445.anInt7791 < local38.anInt8989) {
							local401 = Static16.aClass104Array86[local38.aBoolean676 ? 2 : 0];
							@Pc(410) Class104 local410 = Static16.aClass104Array86[local38.aBoolean676 ? 3 : 1];
							if (local38 instanceof Class20_Sub1_Sub1_Sub2) {
								local418 = local22.anInt8424;
								if (local418 == -1) {
									local418 = local38.method7819().anInt8849;
								}
							} else {
								local418 = local38.method7819().anInt8849;
							}
							if (local418 != -1) {
								local243 = (Class104[]) Static340.aClass277_48.method7014((long) local418);
								if (local243 == null) {
									local250 = Static547.method1918(Static46.aClass69_14, local418);
									if (local250 != null) {
										local243 = new Class104[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static455.aClass4_11.method7149(local250[local258]);
										}
										Static340.aClass277_48.method7016(local243, (long) local418);
									}
								}
								if (local243 != null && local243.length == 4) {
									local401 = local243[local38.aBoolean676 ? 2 : 0];
									local410 = local243[local38.aBoolean676 ? 3 : 1];
								}
							}
							@Pc(514) int local514 = local38.anInt8989 - Static445.anInt7791;
							if (local38.anInt8986 >= local514) {
								local525 = local401.c();
							} else {
								local514 -= local38.anInt8986;
								local258 = local38.anInt9016 == 0 ? 0 : (local38.anInt8995 - local514) / local38.anInt9016 * local38.anInt9016;
								local525 = local258 * local401.c() / local38.anInt8995;
							}
							local258 = local401.la();
							local175 -= local258;
							local339 = arg1 + Static32.anIntArray66[0] - (local401.c() >> 1);
							local401.method7716(local339, local175);
							Static455.aClass4_11.F(local339, local175, local339 + local525, local258 + local175);
							local410.method7716(local339, local175);
							local175 -= 2;
							Static455.aClass4_11.N(arg1, arg0, arg1 + arg2, arg3 + arg0);
						}
						if (local12 > local18) {
							@Pc(651) Class20_Sub1_Sub1_Sub1 local651 = (Class20_Sub1_Sub1_Sub1) local38;
							if (local651.anInt666 != -1) {
								local175 -= 25;
								Static359.aClass104Array60[local651.anInt666].method7716(Static32.anIntArray66[0] + arg1 - 12, local175);
								local175 -= 2;
							}
							if (local651.anInt686 != -1) {
								local175 -= 25;
								Static90.aClass104Array21[local651.anInt686].method7716(arg1 + Static32.anIntArray66[0] - 12, local175);
								local175 -= 2;
							}
						} else if (local22.anInt8444 >= 0 && local22.anInt8444 < Static90.aClass104Array21.length) {
							local401 = Static90.aClass104Array21[local22.anInt8444];
							local175 -= 25;
							local401.method7716(Static32.anIntArray66[0] + arg1 - (local401.c() >> 1), local175);
							local175 -= 2;
						}
					}
					@Pc(699) Class248[] local699;
					@Pc(707) Class248 local707;
					if (!(local38 instanceof Class20_Sub1_Sub1_Sub1)) {
						local204 = 0;
						local699 = Static261.aClass248Array1;
						for (local418 = 0; local418 < local699.length; local418++) {
							local707 = local699[local418];
							if (local707 != null && local707.anInt7271 == 1 && Static220.anIntArray339[local18 - local12] == local707.anInt7267) {
								local312 = Static321.aClass104Array55[local707.anInt7270];
								if (local312.la() > local204) {
									local204 = local312.la();
								}
								if (Static445.anInt7791 % 20 < 10) {
									local312.method7716(arg1 + Static32.anIntArray66[0] - 12, -local312.la() + local175);
								}
							}
						}
						if (local204 > 0) {
						}
					} else if (local18 >= 0) {
						local204 = 0;
						local699 = Static261.aClass248Array1;
						for (local418 = 0; local418 < local699.length; local418++) {
							local707 = local699[local418];
							if (local707 != null && local707.anInt7271 == 10 && local707.anInt7267 == local14[local18]) {
								local312 = Static321.aClass104Array55[local707.anInt7270];
								if (local204 < local312.la()) {
									local204 = local312.la();
								}
								local312.method7716(arg1 + Static32.anIntArray66[0] - 12, -local312.la() + local175);
							}
						}
						if (local204 > 0) {
						}
					}
					for (local204 = 0; local204 < 4; local204++) {
						if (Static445.anInt7791 < local38.anIntArray777[local204]) {
							local863 = local38.method7805() / 2;
							Static415.method6535(arg3 >> 1, local863, arg2 >> 1, local38);
							if (Static32.anIntArray66[0] > -1) {
								local418 = Static130.aClass104Array77[local38.anIntArray778[local204]].c();
								if (local204 == 1) {
									Static32.anIntArray66[1] -= 20;
								}
								if (local204 == 2) {
									Static32.anIntArray66[1] -= 10;
									Static32.anIntArray66[0] -= local418 - 9;
								}
								if (local204 == 3) {
									Static32.anIntArray66[1] -= 10;
									Static32.anIntArray66[0] += local418 - 9;
								}
								Static130.aClass104Array77[local38.anIntArray778[local204]].method7716(arg1 + Static32.anIntArray66[0] - (local418 >> 1), Static32.anIntArray66[1] + (arg0 - 12));
								Static403.aClass36_3.method7948(Integer.toString(local38.anIntArray779[local204]), 0, Static32.anIntArray66[1] + arg0 + 3, -1, arg1 - -Static32.anIntArray66[0] + -1);
							}
						}
					}
				}
			}
		}
		@Pc(1014) int local1014;
		for (@Pc(1008) int local1008 = 0; local1008 < Static413.anInt7228; local1008++) {
			local1014 = Static340.anIntArray614[local1008];
			@Pc(1029) Class20_Sub1_Sub1 local1029;
			if (local1014 >= 2048) {
				local1029 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) (local1014 - 2048))).aClass20_Sub1_Sub1_Sub2_2;
			} else {
				local1029 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local1014];
			}
			local204 = Static306.anIntArray459[local1008];
			@Pc(1048) Class20_Sub1_Sub1 local1048;
			if (local204 < 2048) {
				local1048 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local204];
			} else {
				local1048 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) (local204 - 2048))).aClass20_Sub1_Sub1_Sub2_2;
			}
			Static339.method5711(arg2, arg1, local1048, local1029, --local1029.anInt8994, arg3, arg0);
		}
		local1014 = Static270.aClass96_10.anInt2538 + Static270.aClass96_10.anInt2545 + 2;
		for (local175 = 0; local175 < Class1_Sub3_Sub1.lb; local175++) {
			local204 = Static531.anIntArray818[local175];
			local863 = Static531.anIntArray821[local175];
			local418 = Static531.anIntArray823[local175];
			@Pc(1107) boolean local1107 = true;
			while (local1107) {
				local1107 = false;
				for (local525 = 0; local525 < local175; local525++) {
					if (local863 + 2 > Static531.anIntArray821[local525] - local1014 && local863 - local1014 < Static531.anIntArray821[local525] + 2 && local204 - local418 < Static531.anIntArray818[local525] - -Static531.anIntArray823[local525] && Static531.anIntArray818[local525] - Static531.anIntArray823[local525] < local204 - -local418 && local863 > Static531.anIntArray821[local525] - local1014) {
						local863 = Static531.anIntArray821[local525] - local1014;
						local1107 = true;
					}
				}
			}
			Static531.anIntArray821[local175] = local863;
			@Pc(1192) String local1192 = Static531.aStringArray40[local175];
			if (Static455.anInt7936 == 0) {
				local258 = 16776960;
				if (Static531.anIntArray820[local175] < 6) {
					local258 = Static303.anIntArray457[Static531.anIntArray820[local175]];
				}
				if (Static531.anIntArray820[local175] == 6) {
					local258 = Static389.anInt6904 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static531.anIntArray820[local175] == 7) {
					local258 = Static389.anInt6904 % 20 < 10 ? 255 : 65535;
				}
				if (Static531.anIntArray820[local175] == 8) {
					local258 = Static389.anInt6904 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static531.anIntArray820[local175] == 9) {
					local339 = 150 - Static531.anIntArray819[local175];
					if (local339 < 50) {
						local258 = local339 * 1280 + 16711680;
					} else if (local339 < 100) {
						local258 = 16776960 - (local339 - 50) * 327680;
					} else if (local339 < 150) {
						local258 = (local339 - 100) * 5 + 65280;
					}
				}
				if (Static531.anIntArray820[local175] == 10) {
					local339 = 150 - Static531.anIntArray819[local175];
					if (local339 < 50) {
						local258 = local339 * 5 + 16711680;
					} else if (local339 < 100) {
						local258 = 16711935 + 16384000 - local339 * 327680;
					} else if (local339 < 150) {
						local258 = local339 * 327680 + 255 + 500 - local339 * 5 - 32768000;
					}
				}
				if (Static531.anIntArray820[local175] == 11) {
					local339 = 150 - Static531.anIntArray819[local175];
					if (local339 < 50) {
						local258 = 16777215 - local339 * 327685;
					} else if (local339 < 100) {
						local258 = local339 * 327685 + 65280 - 16384250;
					} else if (local339 < 150) {
						local258 = 32768000 + 16777215 - local339 * 327680;
					}
				}
				local339 = local258 | 0xFF000000;
				if (Static531.anIntArray822[local175] == 0) {
					Static511.aClass36_4.method7948(local1192, -16777216, local863 + arg0, local339, arg1 + local204);
				}
				if (Static531.anIntArray822[local175] == 1) {
					Static511.aClass36_4.method7951(arg0 + local863, local204 + arg1, Static389.anInt6904, local339, local1192);
				}
				if (Static531.anIntArray822[local175] == 2) {
					Static511.aClass36_4.method7952(local204 + arg1, local863 + arg0, Static389.anInt6904, local1192, local339);
				}
				if (Static531.anIntArray822[local175] == 3) {
					Static511.aClass36_4.method7961(local1192, arg1 + local204, -Static531.anIntArray819[local175] + 150, local863 + arg0, local339, Static389.anInt6904);
				}
				@Pc(1522) int local1522;
				if (Static531.anIntArray822[local175] == 4) {
					local1522 = (150 - Static531.anIntArray819[local175]) * (Static270.aClass96_10.method2370(local1192) + 100) / 150;
					Static455.aClass4_11.F(local204 + arg1 - 50, arg0, arg1 + local204 + 50, arg3 + arg0);
					Static511.aClass36_4.method7954(local339, local863 + arg0, local1192, local204 + arg1 + 50 - local1522, -16777216);
					Static455.aClass4_11.N(arg1, arg0, arg2 + arg1, arg0 - -arg3);
				}
				if (Static531.anIntArray822[local175] == 5) {
					local1522 = 150 - Static531.anIntArray819[local175];
					@Pc(1580) int local1580 = 0;
					if (local1522 < 25) {
						local1580 = local1522 - 25;
					} else if (local1522 > 125) {
						local1580 = local1522 - 125;
					}
					@Pc(1604) int local1604 = Static270.aClass96_10.anInt2538 + Static270.aClass96_10.anInt2545;
					Static455.aClass4_11.F(arg1, arg0 + local863 - local1604 - 1, arg1 - -arg2, arg0 + local863 + 5);
					Static511.aClass36_4.method7948(local1192, -16777216, local863 + arg0 + local1580, local339, local204 + arg1);
					Static455.aClass4_11.N(arg1, arg0, arg2 + arg1, arg0 - -arg3);
				}
			} else {
				Static511.aClass36_4.method7948(local1192, -16777216, local863 + arg0, -256, arg1 - -local204);
			}
		}
	}
}
