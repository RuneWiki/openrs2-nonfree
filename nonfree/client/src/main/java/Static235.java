import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	public static int anInt4389;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!r;)V")
	public static void method3561(@OriginalArg(1) Class134 arg0) {
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != Static567.anInt9401 && (Static292.aClass39ArrayArrayArray2 != null && Static506.method7062(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, arg0))) {
			Static567.anInt9401 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public static void method3562(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub6_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class47 local8 = Static216.aClass47Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static507.anInt8645; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static27.anInt373; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static351.anInt5832;
							@Pc(32) int local32 = local12 << Static351.anInt5832;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class47 local41 = Static216.aClass47Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7545(local15, local12) - local41.method7545(local15, local12);
									@Pc(71) int local71 = local8.method7545(local15 + 1, local12) - local41.method7545(local15 + 1, local12);
									@Pc(91) int local91 = local8.method7545(local15 + 1, local12 + 1) - local41.method7545(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method7545(local15, local12 + 1) - local41.method7545(local15, local12 + 1);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static220.anInt4237;
		@Pc(9) int[] local9 = Static572.anIntArray717;
		Static175.anInt9127 = 0;
		@Pc(179) int local179;
		@Pc(216) int local216;
		@Pc(263) int local263;
		@Pc(340) int local340;
		@Pc(423) int local423;
		@Pc(864) int local864;
		@Pc(550) int local550;
		for (@Pc(13) int local13 = 0; local13 < Static39.anInt609 + local7; local13++) {
			@Pc(17) Class20 local17 = null;
			@Pc(30) Class8_Sub3_Sub3_Sub1 local30;
			if (local7 > local13) {
				local30 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local9[local13]];
			} else {
				local30 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local13 - local7])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
				local17 = ((Class8_Sub3_Sub3_Sub1_Sub2) local30).aClass20_1;
				if (local17.anIntArray40 != null) {
					local17 = local17.method284(Static430.aClass321_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt6790 >= 0 && (Static350.anInt5818 == local30.anInt6834 || local30.aByte123 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123)) {
				Static369.method4966(arg2 >> 1, arg1 >> 1, local30, local30.method5432());
				if (Static348.anIntArray473[0] >= 0) {
					if (local30.aString68 != null && (local7 <= local13 || Static351.anInt5833 == 0 || Static351.anInt5833 == 3 || Static351.anInt5833 == 1 && Static232.method3509(((Class8_Sub3_Sub3_Sub1_Sub1) local30).aString16)) && Static175.anInt9127 < Static70.anInt1401) {
						Static70.anIntArray114[Static175.anInt9127] = Static373.aClass334_13.method7354(local30.aString68) / 2;
						Static70.anIntArray117[Static175.anInt9127] = Static348.anIntArray473[0];
						Static70.anIntArray115[Static175.anInt9127] = Static348.anIntArray473[1];
						Static70.anIntArray119[Static175.anInt9127] = local30.anInt6778;
						Static70.anIntArray116[Static175.anInt9127] = local30.anInt6799;
						Static70.anIntArray118[Static175.anInt9127] = local30.anInt6815;
						Static70.aStringArray8[Static175.anInt9127] = local30.aString68;
						Static175.anInt9127++;
					}
					local179 = Static348.anIntArray473[1] + arg0;
					@Pc(248) Class22[] local248;
					@Pc(255) Class102[] local255;
					@Pc(313) Class22 local313;
					if (local30.aBoolean551 || local30.anInt6816 <= Static301.anInt5197) {
						local179 -= Math.max(Static373.aClass334_13.anInt9005, Static246.aClass22Array14[0].u());
					} else {
						@Pc(202) byte local202 = 1;
						if (local13 < local7) {
							@Pc(211) Class8_Sub3_Sub3_Sub1_Sub1 local211 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local9[local13]];
							local216 = local30.method5425().anInt3601;
							if (local211.aBoolean137) {
								local202 = 2;
							}
						} else {
							local216 = local17.anInt338;
							if (local216 == -1) {
								local216 = local30.method5425().anInt3601;
							}
						}
						@Pc(237) Class22[] local237 = Static246.aClass22Array14;
						if (local216 != -1) {
							local248 = (Class22[]) Static467.aClass222_52.method4430((long) local216);
							if (local248 == null) {
								local255 = Static601.method2079(Static463.aClass270_98, local216);
								if (local255 != null) {
									local248 = new Class22[local255.length];
									for (local263 = 0; local263 < local255.length; local263++) {
										local248[local263] = Static16.aClass134_1.method6896(local255[local263], true);
									}
									Static467.aClass222_52.method4434(local248, (long) local216);
								}
							}
							if (local248 != null && local248.length >= 2) {
								local237 = local248;
							}
						}
						if (local237.length <= local202) {
							local202 = 1;
						}
						@Pc(309) Class22 local309 = local237[0];
						local313 = local237[local202];
						local179 -= Math.max(Static373.aClass334_13.anInt9005, local309.u());
						local263 = Static348.anIntArray473[0] + arg3 - (local309.E() >> 1);
						local340 = local309.E() * local30.anInt6851 / 255;
						if (local30.anInt6851 > 0 && local340 < 2) {
							local340 = 2;
						}
						local309.method7662(local263, local179);
						Static16.aClass134_1.V(local263, local179, local340 + local263, local309.u() + local179);
						local313.method7662(local263, local179);
						Static16.aClass134_1.da(arg3, arg0, arg3 + arg1, arg2 + arg0);
					}
					local179 -= 2;
					if (!local30.aBoolean551) {
						@Pc(404) Class22 local404;
						if (local30.anInt6811 > Static301.anInt5197) {
							local404 = Static446.aClass22Array19[local30.aBoolean552 ? 2 : 0];
							@Pc(413) Class22 local413 = Static446.aClass22Array19[local30.aBoolean552 ? 3 : 1];
							if (local30 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
								local423 = local17.anInt354;
								if (local423 == -1) {
									local423 = local30.method5425().anInt3620;
								}
							} else {
								local423 = local30.method5425().anInt3620;
							}
							if (local423 != -1) {
								local248 = (Class22[]) Static257.aClass222_27.method4430((long) local423);
								if (local248 == null) {
									local255 = Static601.method2079(Static463.aClass270_98, local423);
									if (local255 != null) {
										local248 = new Class22[local255.length];
										for (local263 = 0; local263 < local255.length; local263++) {
											local248[local263] = Static16.aClass134_1.method6896(local255[local263], true);
										}
										Static257.aClass222_27.method4434(local248, (long) local423);
									}
								}
								if (local248 != null && local248.length == 4) {
									local413 = local248[local30.aBoolean552 ? 3 : 1];
									local404 = local248[local30.aBoolean552 ? 2 : 0];
								}
							}
							@Pc(513) int local513 = local30.anInt6811 - Static301.anInt5197;
							if (local30.anInt6827 < local513) {
								local513 -= local30.anInt6827;
								local263 = local30.anInt6837 == 0 ? 0 : (local30.anInt6776 - local513) / local30.anInt6837 * local30.anInt6837;
								local550 = local263 * local404.E() / local30.anInt6776;
							} else {
								local550 = local404.E();
							}
							local263 = local404.u();
							local179 -= local263;
							local340 = arg3 + Static348.anIntArray473[0] - (local404.E() >> 1);
							local404.method7662(local340, local179);
							Static16.aClass134_1.V(local340, local179, local550 + local340, local263 + local179);
							local413.method7662(local340, local179);
							Static16.aClass134_1.da(arg3, arg0, arg3 + arg1, arg2 + arg0);
							local179 -= 2;
						}
						if (local13 < local7) {
							@Pc(615) Class8_Sub3_Sub3_Sub1_Sub1 local615 = (Class8_Sub3_Sub3_Sub1_Sub1) local30;
							if (local615.anInt1740 != -1) {
								local179 -= 25;
								Static50.aClass22Array2[local615.anInt1740].method7662(arg3 + Static348.anIntArray473[0] - 12, local179);
								local179 -= 2;
							}
							if (local615.anInt1718 != -1) {
								local179 -= 25;
								Static216.aClass22Array12[local615.anInt1718].method7662(Static348.anIntArray473[0] + arg3 - 12, local179);
								local179 -= 2;
							}
						} else if (local17.anInt322 >= 0 && Static216.aClass22Array12.length > local17.anInt322) {
							local404 = Static216.aClass22Array12[local17.anInt322];
							local179 -= 25;
							local404.method7662(Static348.anIntArray473[0] + arg3 - (local404.E() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(701) Class154[] local701;
					@Pc(709) Class154 local709;
					if (!(local30 instanceof Class8_Sub3_Sub3_Sub1_Sub1)) {
						local216 = 0;
						local701 = Static41.aClass154Array1;
						for (local423 = 0; local423 < local701.length; local423++) {
							local709 = local701[local423];
							if (local709 != null && local709.anInt4116 == 1 && Static17.anIntArray24[local13 - local7] == local709.anInt4115) {
								local313 = Static444.aClass22Array15[local709.anInt4117];
								if (local313.u() > local216) {
									local216 = local313.u();
								}
								if (Static301.anInt5197 % 20 < 10) {
									local313.method7662(Static348.anIntArray473[0] + arg3 - 12, local179 - local313.u());
								}
							}
						}
						if (local216 > 0) {
						}
					} else if (local13 >= 0) {
						local216 = 0;
						local701 = Static41.aClass154Array1;
						for (local423 = 0; local423 < local701.length; local423++) {
							local709 = local701[local423];
							if (local709 != null && local709.anInt4116 == 10 && local9[local13] == local709.anInt4115) {
								local313 = Static444.aClass22Array15[local709.anInt4117];
								if (local313.u() > local216) {
									local216 = local313.u();
								}
								local313.method7662(Static348.anIntArray473[0] + arg3 - 12, local179 - local313.u());
							}
						}
						if (local216 > 0) {
						}
					}
					for (local216 = 0; local216 < 4; local216++) {
						if (Static301.anInt5197 < local30.anIntArray529[local216]) {
							local864 = local30.method5432() / 2;
							Static369.method4966(arg2 >> 1, arg1 >> 1, local30, local864);
							if (Static348.anIntArray473[0] > -1) {
								local423 = Static324.aClass22Array17[local30.anIntArray531[local216]].E();
								if (local216 == 1) {
									Static348.anIntArray473[1] -= 20;
								}
								if (local216 == 2) {
									Static348.anIntArray473[1] -= 10;
									Static348.anIntArray473[0] -= local423 - 9;
								}
								if (local216 == 3) {
									Static348.anIntArray473[0] += local423 - 9;
									Static348.anIntArray473[1] -= 10;
								}
								Static324.aClass22Array17[local30.anIntArray531[local216]].method7662(arg3 + Static348.anIntArray473[0] - (local423 >> 1), arg0 + -12 + Static348.anIntArray473[1]);
								Static28.aClass64_1.method6605(0, -1, Static348.anIntArray473[0] + arg3 - 1, Integer.toString(local30.anIntArray530[local216]), Static348.anIntArray473[1] + arg0 + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1004) int local1004;
		for (@Pc(998) int local998 = 0; local998 < Static161.anInt2919; local998++) {
			local1004 = Static25.anIntArray43[local998];
			@Pc(1017) Class8_Sub3_Sub3_Sub1 local1017;
			if (local1004 >= 2048) {
				local1017 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) (local1004 - 2048))).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			} else {
				local1017 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local1004];
			}
			local216 = Static156.anIntArray233[local998];
			@Pc(1036) Class8_Sub3_Sub3_Sub1 local1036;
			if (local216 < 2048) {
				local1036 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local216];
			} else {
				local1036 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) (local216 - 2048))).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			}
			Static69.method1221(arg3, --local1017.anInt6843, arg1, arg0, local1017, local1036, arg2);
		}
		local1004 = Static373.aClass334_13.anInt9005 + Static373.aClass334_13.anInt9008 + 2;
		for (local179 = 0; local179 < Static175.anInt9127; local179++) {
			local216 = Static70.anIntArray117[local179];
			local864 = Static70.anIntArray115[local179];
			local423 = Static70.anIntArray114[local179];
			@Pc(1095) boolean local1095 = true;
			while (local1095) {
				local1095 = false;
				for (local550 = 0; local550 < local179; local550++) {
					if (Static70.anIntArray115[local550] - local1004 < local864 + 2 && Static70.anIntArray115[local550] + 2 > local864 + -local1004 && Static70.anIntArray114[local550] + Static70.anIntArray117[local550] > -local423 + local216 && local216 + local423 > Static70.anIntArray117[local550] + -Static70.anIntArray114[local550] && local864 > Static70.anIntArray115[local550] - local1004) {
						local864 = Static70.anIntArray115[local550] - local1004;
						local1095 = true;
					}
				}
			}
			Static70.anIntArray115[local179] = local864;
			@Pc(1194) String local1194 = Static70.aStringArray8[local179];
			if (Static447.anInt7728 == 0) {
				local263 = 16776960;
				if (Static70.anIntArray119[local179] < 6) {
					local263 = Static572.anIntArray716[Static70.anIntArray119[local179]];
				}
				if (Static70.anIntArray119[local179] == 6) {
					local263 = Static350.anInt5818 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static70.anIntArray119[local179] == 7) {
					local263 = Static350.anInt5818 % 20 < 10 ? 255 : 65535;
				}
				if (Static70.anIntArray119[local179] == 8) {
					local263 = Static350.anInt5818 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static70.anIntArray119[local179] == 9) {
					local340 = 150 - Static70.anIntArray118[local179];
					if (local340 < 50) {
						local263 = local340 * 1280 + 16711680;
					} else if (local340 < 100) {
						local263 = 16776960 - (local340 - 50) * 327680;
					} else if (local340 < 150) {
						local263 = (local340 - 100) * 5 + 65280;
					}
				}
				if (Static70.anIntArray119[local179] == 10) {
					local340 = 150 - Static70.anIntArray118[local179];
					if (local340 < 50) {
						local263 = local340 * 5 + 16711680;
					} else if (local340 < 100) {
						local263 = 16384000 + 16711935 - local340 * 327680;
					} else if (local340 < 150) {
						local263 = (local340 - 100) * 327680 + 255 + 500 - local340 * 5;
					}
				}
				if (Static70.anIntArray119[local179] == 11) {
					local340 = 150 - Static70.anIntArray118[local179];
					if (local340 < 50) {
						local263 = 16777215 - local340 * 327685;
					} else if (local340 < 100) {
						local263 = (local340 - 50) * 327685 + 65280;
					} else if (local340 < 150) {
						local263 = 32768000 + 16777215 - local340 * 327680;
					}
				}
				local340 = local263 | 0xFF000000;
				if (Static70.anIntArray116[local179] == 0) {
					Static418.aClass64_11.method6605(-16777216, local340, arg3 + local216, local1194, local864 + arg0);
				}
				if (Static70.anIntArray116[local179] == 1) {
					Static418.aClass64_11.method6617(Static350.anInt5818, arg0 + local864, local1194, arg3 + local216, local340);
				}
				if (Static70.anIntArray116[local179] == 2) {
					Static418.aClass64_11.method6601(local340, local1194, Static350.anInt5818, arg3 + local216, local864 + arg0);
				}
				if (Static70.anIntArray116[local179] == 3) {
					Static418.aClass64_11.method6608(150 - Static70.anIntArray118[local179], local340, Static350.anInt5818, local1194, arg3 + local216, local864 + arg0);
				}
				@Pc(1555) int local1555;
				if (Static70.anIntArray116[local179] == 4) {
					local1555 = (150 - Static70.anIntArray118[local179]) * (Static373.aClass334_13.method7354(local1194) + 100) / 150;
					Static16.aClass134_1.V(local216 + arg3 - 50, arg0, arg3 + local216 + 50, arg2 + arg0);
					Static418.aClass64_11.method6602(local340, local1194, local216 + arg3 + 50 - local1555, -16777216, arg0 + local864);
					Static16.aClass134_1.da(arg3, arg0, arg3 + arg1, arg2 + arg0);
				}
				if (Static70.anIntArray116[local179] == 5) {
					local1555 = 150 - Static70.anIntArray118[local179];
					@Pc(1613) int local1613 = 0;
					if (local1555 < 25) {
						local1613 = local1555 - 25;
					} else if (local1555 > 125) {
						local1613 = local1555 - 125;
					}
					@Pc(1638) int local1638 = Static373.aClass334_13.anInt9005 + Static373.aClass334_13.anInt9008;
					Static16.aClass134_1.V(arg3, local864 + arg0 - local1638 - 1, arg1 + arg3, local864 + arg0 + 5);
					Static418.aClass64_11.method6605(-16777216, local340, local216 + arg3, local1194, local864 + arg0 + local1613);
					Static16.aClass134_1.da(arg3, arg0, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static418.aClass64_11.method6605(-16777216, -256, local216 + arg3, local1194, arg0 + local864);
			}
		}
	}
}
