import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_31 = new Class186(73, 4);

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	public static final int[] anIntArray192 = new int[1];

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIIIII)V")
	public static void method2273(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) int local5 = Static412.anInt7191;
		Static221.anInt4478 = 0;
		@Pc(9) int[] local9 = Static349.anIntArray479;
		@Pc(183) int local183;
		@Pc(212) int local212;
		@Pc(261) int local261;
		@Pc(339) int local339;
		@Pc(435) int local435;
		@Pc(878) int local878;
		@Pc(540) int local540;
		for (@Pc(16) int local16 = 0; local16 < Static457.anInt7857 + local5; local16++) {
			@Pc(19) Class238 local19 = null;
			@Pc(32) Class47_Sub2_Sub3 local32;
			if (local5 > local16) {
				local32 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local9[local16]];
			} else {
				local32 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local16 - local5])).aClass47_Sub2_Sub3_Sub1_2;
				local19 = ((Class47_Sub2_Sub3_Sub1) local32).aClass238_1;
				if (local19.anIntArray511 != null) {
					local19 = local19.method5866(Static343.aClass286_1);
					if (local19 == null) {
						continue;
					}
				}
			}
			if (local32.anInt5023 >= 0 && (local32.anInt5011 == Static15.anInt833 || Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local32.aByte94)) {
				Static508.method7308(local32, arg3 >> 1, local32.method4358(), arg1 >> 1);
				if (Static367.anIntArray490[0] >= 0) {
					if (local32.aString35 != null && (local16 >= local5 || Static291.anInt5669 == 0 || Static291.anInt5669 == 3 || Static291.anInt5669 == 1 && Static206.method3780(((Class47_Sub2_Sub3_Sub2) local32).aString36)) && Static120.anInt2884 > Static221.anInt4478) {
						Static120.anIntArray221[Static221.anInt4478] = Static159.aClass177_3.method4664(local32.aString35) / 2;
						Static120.anIntArray223[Static221.anInt4478] = Static367.anIntArray490[0];
						Static120.anIntArray225[Static221.anInt4478] = Static367.anIntArray490[1];
						Static120.anIntArray222[Static221.anInt4478] = local32.anInt5000;
						Static120.anIntArray218[Static221.anInt4478] = local32.anInt5014;
						Static120.anIntArray220[Static221.anInt4478] = local32.anInt5043;
						Static120.aStringArray12[Static221.anInt4478] = local32.aString35;
						Static221.anInt4478++;
					}
					local183 = Static367.anIntArray490[1] + arg2;
					@Pc(246) Class12[] local246;
					@Pc(253) Class242[] local253;
					@Pc(312) Class12 local312;
					if (local32.aBoolean342 || Static416.anInt7252 >= local32.anInt5046) {
						local183 -= Math.max(Static159.aClass177_3.anInt5365, Static149.aClass12Array20[0].la());
					} else {
						@Pc(194) byte local194 = 1;
						if (local5 > local16) {
							@Pc(203) Class47_Sub2_Sub3_Sub2 local203 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local9[local16]];
							local212 = local32.method4356().anInt7269;
							if (local203.aBoolean346) {
								local194 = 2;
							}
						} else {
							local212 = local19.anInt6780;
							if (local212 == -1) {
								local212 = local32.method4356().anInt7269;
							}
						}
						@Pc(236) Class12[] local236 = Static149.aClass12Array20;
						if (local212 != -1) {
							local246 = (Class12[]) Static309.aClass316_45.method7799((long) local212);
							if (local246 == null) {
								local253 = Static559.method5935(Static390.aClass160_80, local212);
								if (local253 != null) {
									local246 = new Class12[local253.length];
									for (local261 = 0; local261 < local253.length; local261++) {
										local246[local261] = Static478.aClass9_10.method7625(local253[local261]);
									}
									Static309.aClass316_45.method7792((long) local212, local246);
								}
							}
							if (local246 != null && local246.length >= 2) {
								local236 = local246;
							}
						}
						if (local194 >= local236.length) {
							local194 = 1;
						}
						@Pc(308) Class12 local308 = local236[0];
						local312 = local236[local194];
						local183 -= Math.max(Static159.aClass177_3.anInt5365, local308.la());
						local261 = Static367.anIntArray490[0] + arg0 - (local308.c() >> 1);
						local339 = local308.c() * local32.anInt5062 / 255;
						if (local32.anInt5062 > 0 && local339 < 2) {
							local339 = 2;
						}
						local308.method7191(local261, local183);
						Static478.aClass9_10.F(local261, local183, local261 + local339, local183 - -local308.la());
						local312.method7191(local261, local183);
						Static478.aClass9_10.N(arg0, arg2, arg0 + arg3, arg2 + arg1);
					}
					local183 -= 2;
					if (!local32.aBoolean342) {
						@Pc(412) Class12 local412;
						if (local32.anInt5060 > Static416.anInt7252) {
							local412 = Static217.aClass12Array14[local32.aBoolean341 ? 2 : 0];
							@Pc(421) Class12 local421 = Static217.aClass12Array14[local32.aBoolean341 ? 3 : 1];
							if (local32 instanceof Class47_Sub2_Sub3_Sub1) {
								local435 = local19.anInt6767;
								if (local435 == -1) {
									local435 = local32.method4356().anInt7260;
								}
							} else {
								local435 = local32.method4356().anInt7260;
							}
							if (local435 != -1) {
								local246 = (Class12[]) Static497.aClass316_60.method7799((long) local435);
								if (local246 == null) {
									local253 = Static559.method5935(Static390.aClass160_80, local435);
									if (local253 != null) {
										local246 = new Class12[local253.length];
										for (local261 = 0; local261 < local253.length; local261++) {
											local246[local261] = Static478.aClass9_10.method7625(local253[local261]);
										}
										Static497.aClass316_60.method7792((long) local435, local246);
									}
								}
								if (local246 != null && local246.length == 4) {
									local421 = local246[local32.aBoolean341 ? 3 : 1];
									local412 = local246[local32.aBoolean341 ? 2 : 0];
								}
							}
							@Pc(529) int local529 = local32.anInt5060 - Static416.anInt7252;
							if (local529 <= local32.anInt5050) {
								local540 = local412.c();
							} else {
								local529 -= local32.anInt5050;
								local261 = local32.anInt5015 == 0 ? 0 : local32.anInt5015 * ((local32.anInt5069 - local529) / local32.anInt5015);
								local540 = local261 * local412.c() / local32.anInt5069;
							}
							local261 = local412.la();
							local183 -= local261;
							local339 = Static367.anIntArray490[0] + arg0 - (local412.c() >> 1);
							local412.method7191(local339, local183);
							Static478.aClass9_10.F(local339, local183, local339 + local540, local183 - -local261);
							local421.method7191(local339, local183);
							local183 -= 2;
							Static478.aClass9_10.N(arg0, arg2, arg3 + arg0, arg1 + arg2);
						}
						if (local5 > local16) {
							@Pc(660) Class47_Sub2_Sub3_Sub2 local660 = (Class47_Sub2_Sub3_Sub2) local32;
							if (local660.anInt5114 != -1) {
								local183 -= 25;
								Static290.aClass12Array24[local660.anInt5114].method7191(Static367.anIntArray490[0] + arg0 - 12, local183);
								local183 -= 2;
							}
							if (local660.anInt5104 != -1) {
								local183 -= 25;
								Static289.aClass12Array19[local660.anInt5104].method7191(Static367.anIntArray490[0] + arg0 - 12, local183);
								local183 -= 2;
							}
						} else if (local19.anInt6763 >= 0 && local19.anInt6763 < Static289.aClass12Array19.length) {
							local412 = Static289.aClass12Array19[local19.anInt6763];
							local183 -= 25;
							local412.method7191(arg0 + Static367.anIntArray490[0] - (local412.c() >> 1), local183);
							local183 -= 2;
						}
					}
					@Pc(709) Class28[] local709;
					@Pc(716) Class28 local716;
					if (!(local32 instanceof Class47_Sub2_Sub3_Sub2)) {
						local212 = 0;
						local709 = Static484.aClass28Array1;
						for (local435 = 0; local435 < local709.length; local435++) {
							local716 = local709[local435];
							if (local716 != null && local716.anInt1262 == 1 && Static386.anIntArray503[local16 - local5] == local716.anInt1265) {
								local312 = Static81.aClass12Array8[local716.anInt1264];
								if (local212 < local312.la()) {
									local212 = local312.la();
								}
								if (Static416.anInt7252 % 20 < 10) {
									local312.method7191(arg0 + Static367.anIntArray490[0] - 12, local183 + -local312.la());
								}
							}
						}
						if (local212 > 0) {
						}
					} else if (local16 >= 0) {
						local212 = 0;
						local709 = Static484.aClass28Array1;
						for (local435 = 0; local435 < local709.length; local435++) {
							local716 = local709[local435];
							if (local716 != null && local716.anInt1262 == 10 && local716.anInt1265 == local9[local16]) {
								local312 = Static81.aClass12Array8[local716.anInt1264];
								if (local312.la() > local212) {
									local212 = local312.la();
								}
								local312.method7191(Static367.anIntArray490[0] + arg0 - 12, -local312.la() + local183);
							}
						}
						if (local212 > 0) {
						}
					}
					for (local212 = 0; local212 < 4; local212++) {
						if (Static416.anInt7252 < local32.anIntArray360[local212]) {
							local878 = local32.method4358() / 2;
							Static508.method7308(local32, arg3 >> 1, local878, arg1 >> 1);
							if (Static367.anIntArray490[0] > -1) {
								local435 = Static137.aClass12Array10[local32.anIntArray359[local212]].c();
								if (local212 == 1) {
									Static367.anIntArray490[1] -= 20;
								}
								if (local212 == 2) {
									Static367.anIntArray490[1] -= 10;
									Static367.anIntArray490[0] -= local435 - 9;
								}
								if (local212 == 3) {
									Static367.anIntArray490[0] += local435 - 9;
									Static367.anIntArray490[1] -= 10;
								}
								Static137.aClass12Array10[local32.anIntArray359[local212]].method7191(arg0 + Static367.anIntArray490[0] - (local435 >> 1), Static367.anIntArray490[1] + (arg2 - 12));
								Static58.aClass27_2.method7824(Static367.anIntArray490[1] + arg2 + 3, Integer.toString(local32.anIntArray358[local212]), -1, arg0 + Static367.anIntArray490[0] - 1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1024) int local1024;
		for (@Pc(1019) int local1019 = 0; local1019 < Static289.anInt5651; local1019++) {
			local1024 = Static397.anIntArray522[local1019];
			@Pc(1037) Class47_Sub2_Sub3 local1037;
			if (local1024 >= 2048) {
				local1037 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) (local1024 - 2048))).aClass47_Sub2_Sub3_Sub1_2;
			} else {
				local1037 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local1024];
			}
			local212 = Static523.anIntArray763[local1019];
			@Pc(1053) Class47_Sub2_Sub3 local1053;
			if (local212 < 2048) {
				local1053 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local212];
			} else {
				local1053 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) (local212 - 2048))).aClass47_Sub2_Sub3_Sub1_2;
			}
			Static128.method2791(local1053, arg0, local1037, arg2, --local1037.anInt5002, arg1, arg3);
		}
		local1024 = Static159.aClass177_3.anInt5368 + Static159.aClass177_3.anInt5365 + 2;
		for (local183 = 0; local183 < Static221.anInt4478; local183++) {
			local212 = Static120.anIntArray223[local183];
			local878 = Static120.anIntArray225[local183];
			local435 = Static120.anIntArray221[local183];
			@Pc(1114) boolean local1114 = true;
			while (local1114) {
				local1114 = false;
				for (local540 = 0; local540 < local183; local540++) {
					if (Static120.anIntArray225[local540] - local1024 < local878 - -2 && Static120.anIntArray225[local540] + 2 > local878 + -local1024 && Static120.anIntArray223[local540] + Static120.anIntArray221[local540] > local212 + -local435 && Static120.anIntArray223[local540] - Static120.anIntArray221[local540] < local212 - -local435 && local878 > Static120.anIntArray225[local540] - local1024) {
						local878 = Static120.anIntArray225[local540] - local1024;
						local1114 = true;
					}
				}
			}
			Static120.anIntArray225[local183] = local878;
			@Pc(1216) String local1216 = Static120.aStringArray12[local183];
			if (Static146.anInt3337 == 0) {
				local261 = 16776960;
				if (Static120.anIntArray222[local183] < 6) {
					local261 = Static261.anIntArray363[Static120.anIntArray222[local183]];
				}
				if (Static120.anIntArray222[local183] == 6) {
					local261 = Static15.anInt833 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static120.anIntArray222[local183] == 7) {
					local261 = Static15.anInt833 % 20 < 10 ? 255 : 65535;
				}
				if (Static120.anIntArray222[local183] == 8) {
					local261 = Static15.anInt833 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static120.anIntArray222[local183] == 9) {
					local339 = 150 - Static120.anIntArray220[local183];
					if (local339 < 50) {
						local261 = local339 * 1280 + 16711680;
					} else if (local339 < 100) {
						local261 = 16776960 - (local339 - 50) * 327680;
					} else if (local339 < 150) {
						local261 = local339 * 5 + 64780;
					}
				}
				if (Static120.anIntArray222[local183] == 10) {
					local339 = 150 - Static120.anIntArray220[local183];
					if (local339 < 50) {
						local261 = local339 * 5 + 16711680;
					} else if (local339 < 100) {
						local261 = 16711935 + 16384000 - local339 * 327680;
					} else if (local339 < 150) {
						local261 = (local339 + -100) * 327680 + 500 + 255 - local339 * 5;
					}
				}
				if (Static120.anIntArray222[local183] == 11) {
					local339 = 150 - Static120.anIntArray220[local183];
					if (local339 < 50) {
						local261 = 16777215 - local339 * 327685;
					} else if (local339 < 100) {
						local261 = (local339 - 50) * 327685 + 65280;
					} else if (local339 < 150) {
						local261 = 32768000 + 16777215 - local339 * 327680;
					}
				}
				local339 = local261 | 0xFF000000;
				if (Static120.anIntArray218[local183] == 0) {
					Static106.aClass27_3.method7824(local878 + arg2, local1216, local339, local212 + arg0, -16777216);
				}
				if (Static120.anIntArray218[local183] == 1) {
					Static106.aClass27_3.method7821(local212 + arg0, local878 + arg2, Static15.anInt833, local1216, local339);
				}
				if (Static120.anIntArray218[local183] == 2) {
					Static106.aClass27_3.method7815(local1216, local339, arg0 + local212, Static15.anInt833, local878 + arg2);
				}
				if (Static120.anIntArray218[local183] == 3) {
					Static106.aClass27_3.method7811(local1216, arg2 + local878, Static15.anInt833, local339, 150 - Static120.anIntArray220[local183], local212 + arg0);
				}
				@Pc(1549) int local1549;
				if (Static120.anIntArray218[local183] == 4) {
					local1549 = (150 - Static120.anIntArray220[local183]) * (Static159.aClass177_3.method4664(local1216) + 100) / 150;
					Static478.aClass9_10.F(arg0 + local212 - 50, arg2, arg0 + local212 + 50, arg1 + arg2);
					Static106.aClass27_3.method7816(local212 + arg0 + 50 - local1549, local1216, -16777216, local339, local878 + arg2);
					Static478.aClass9_10.N(arg0, arg2, arg3 + arg0, arg1 + arg2);
				}
				if (Static120.anIntArray218[local183] == 5) {
					local1549 = 150 - Static120.anIntArray220[local183];
					@Pc(1607) int local1607 = 0;
					if (local1549 < 25) {
						local1607 = local1549 - 25;
					} else if (local1549 > 125) {
						local1607 = local1549 - 125;
					}
					@Pc(1632) int local1632 = Static159.aClass177_3.anInt5365 + Static159.aClass177_3.anInt5368;
					Static478.aClass9_10.F(arg0, arg2 + local878 - local1632 - 1, arg3 + arg0, local878 + arg2 + 5);
					Static106.aClass27_3.method7824(local1607 + arg2 + local878, local1216, local339, local212 + arg0, -16777216);
					Static478.aClass9_10.N(arg0, arg2, arg3 + arg0, arg2 - -arg1);
				}
			} else {
				Static106.aClass27_3.method7824(arg2 + local878, local1216, -256, arg0 + local212, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Object;IBI[I)V")
	public static void method2274(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg1) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) int local30 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(44) Object local44 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local44;
		@Pc(61) int local61 = local30 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg2; local63 < arg1; local63++) {
			if ((local63 & local61) + local30 > arg3[local63]) {
				@Pc(77) int local77 = arg3[local63];
				arg3[local63] = arg3[local26];
				arg3[local26] = local77;
				@Pc(91) Object local91 = arg0[local63];
				arg0[local63] = arg0[local26];
				arg0[local26++] = local91;
			}
		}
		arg3[arg1] = arg3[local26];
		arg3[local26] = local30;
		arg0[arg1] = arg0[local26];
		arg0[local26] = local44;
		method2274(arg0, local26 - 1, arg2, arg3);
		method2274(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
	public static void method2276(@OriginalArg(1) boolean arg0) {
		if (Static457.aString65.length() == 0) {
			return;
		}
		Static327.method5346("--> " + Static457.aString65);
		Static295.method4962(arg0, Static457.aString65, false);
		Static3.anInt53 = 0;
		Static488.anInt8330 = 0;
		Static457.aString65 = "";
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
	public static int method2277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local35 + (((arg1 & 0xFF00FF) * local17 & 0xFF00FF00 | (arg1 & 0xFF00) * local17 & 0xFF0000) >>> 8);
	}
}
