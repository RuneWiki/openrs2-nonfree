import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cw", name = "F", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!cw", name = "G", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!cw", name = "H", descriptor = "[I")
	public static int[] anIntArray213 = new int[1];

	@OriginalMember(owner = "client!cw", name = "M", descriptor = "I")
	public static int anInt1668 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBIIIII)V")
	public static void method1404(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static272.anInt5182;
		Static271.anInt5164 = 0;
		@Pc(11) int[] local11 = Static362.anIntArray519;
		@Pc(185) int local185;
		@Pc(210) int local210;
		@Pc(256) int local256;
		@Pc(328) int local328;
		@Pc(424) int local424;
		@Pc(871) int local871;
		@Pc(558) int local558;
		for (@Pc(13) int local13 = 0; local13 < Static428.anInt7363 + local7; local13++) {
			@Pc(17) Class54 local17 = null;
			@Pc(30) Class10_Sub1_Sub2 local30;
			if (local7 > local13) {
				local30 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local11[local13]];
			} else {
				local30 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local13 - local7])).aClass10_Sub1_Sub2_Sub1_1;
				local17 = ((Class10_Sub1_Sub2_Sub1) local30).aClass54_1;
				if (local17.anIntArray150 != null) {
					local17 = local17.method1118(Static511.aClass335_2);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt8511 >= 0 && (Static523.anInt8897 == local30.anInt8535 || local30.aByte101 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101)) {
				Static382.method5664(arg3 >> 1, arg1 >> 1, local30, local30.method7027());
				if (Static458.anIntArray627[0] >= 0) {
					if (local30.aString91 != null && (local7 <= local13 || Static290.anInt5384 == 0 || Static290.anInt5384 == 3 || Static290.anInt5384 == 1 && Static263.method6569(((Class10_Sub1_Sub2_Sub2) local30).aString93)) && Static271.anInt5164 < Static245.anInt4854) {
						Static245.anIntArray427[Static271.anInt5164] = Static195.aClass196_5.method4386(local30.aString91) / 2;
						Static245.anIntArray431[Static271.anInt5164] = Static458.anIntArray627[0];
						Static245.anIntArray429[Static271.anInt5164] = Static458.anIntArray627[1];
						Static245.anIntArray428[Static271.anInt5164] = local30.anInt8499;
						Static245.anIntArray430[Static271.anInt5164] = local30.anInt8471;
						Static245.anIntArray432[Static271.anInt5164] = local30.anInt8501;
						Static245.aStringArray22[Static271.anInt5164] = local30.aString91;
						Static271.anInt5164++;
					}
					local185 = Static458.anIntArray627[1] + arg2;
					@Pc(241) Class13[] local241;
					@Pc(248) Class268[] local248;
					@Pc(300) Class13 local300;
					if (local30.aBoolean591 || local30.anInt8505 <= Static237.anInt7561) {
						local185 -= Math.max(Static195.aClass196_5.anInt5173, Static167.aClass13Array11[0].b());
					} else {
						@Pc(196) byte local196 = 1;
						if (local7 > local13) {
							@Pc(205) Class10_Sub1_Sub2_Sub2 local205 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local11[local13]];
							local210 = local30.method7026().anInt3821;
							if (local205.aBoolean598) {
								local196 = 2;
							}
						} else {
							local210 = local17.anInt1287;
							if (local210 == -1) {
								local210 = local30.method7026().anInt3821;
							}
						}
						@Pc(231) Class13[] local231 = Static167.aClass13Array11;
						if (local210 != -1) {
							local241 = (Class13[]) Static136.aClass223_23.method4943((long) local210);
							if (local241 == null) {
								local248 = Static607.method5879(Static360.aClass31_78, local210);
								if (local248 != null) {
									local241 = new Class13[local248.length];
									for (local256 = 0; local256 < local248.length; local256++) {
										local241[local256] = Static185.aClass66_14.method6799(local248[local256], true);
									}
									Static136.aClass223_23.method4938((long) local210, local241);
								}
							}
							if (local241 != null && local241.length >= 2) {
								local231 = local241;
							}
						}
						if (local196 >= local231.length) {
							local196 = 1;
						}
						@Pc(296) Class13 local296 = local231[0];
						local300 = local231[local196];
						local185 -= Math.max(Static195.aClass196_5.anInt5173, local296.b());
						local256 = arg0 + Static458.anIntArray627[0] - (local296.QA() >> 1);
						local328 = local296.QA() * local30.anInt8534 / 255;
						if (local30.anInt8534 > 0 && local328 < 2) {
							local328 = 2;
						}
						local296.method8019(local256, local185);
						Static185.aClass66_14.Q(local256, local185, local256 + local328, local185 - -local296.b());
						local300.method8019(local256, local185);
						Static185.aClass66_14.ca(arg0, arg2, arg3 + arg0, arg1 + arg2);
					}
					local185 -= 2;
					if (!local30.aBoolean591) {
						@Pc(405) Class13 local405;
						if (local30.anInt8464 > Static237.anInt7561) {
							local405 = Static244.aClass13Array16[local30.aBoolean593 ? 2 : 0];
							@Pc(414) Class13 local414 = Static244.aClass13Array16[local30.aBoolean593 ? 3 : 1];
							if (local30 instanceof Class10_Sub1_Sub2_Sub1) {
								local424 = local17.anInt1275;
								if (local424 == -1) {
									local424 = local30.method7026().anInt3808;
								}
							} else {
								local424 = local30.method7026().anInt3808;
							}
							if (local424 != -1) {
								local241 = (Class13[]) Static519.aClass223_58.method4943((long) local424);
								if (local241 == null) {
									local248 = Static607.method5879(Static360.aClass31_78, local424);
									if (local248 != null) {
										local241 = new Class13[local248.length];
										for (local256 = 0; local256 < local248.length; local256++) {
											local241[local256] = Static185.aClass66_14.method6799(local248[local256], true);
										}
										Static519.aClass223_58.method4938((long) local424, local241);
									}
								}
								if (local241 != null && local241.length == 4) {
									local414 = local241[local30.aBoolean593 ? 3 : 1];
									local405 = local241[local30.aBoolean593 ? 2 : 0];
								}
							}
							@Pc(520) int local520 = local30.anInt8464 - Static237.anInt7561;
							if (local30.anInt8524 < local520) {
								local520 -= local30.anInt8524;
								local256 = local30.anInt8523 == 0 ? 0 : (local30.anInt8492 - local520) / local30.anInt8523 * local30.anInt8523;
								local558 = local256 * local405.QA() / local30.anInt8492;
							} else {
								local558 = local405.QA();
							}
							local256 = local405.b();
							local185 -= local256;
							local328 = Static458.anIntArray627[0] + arg0 - (local405.QA() >> 1);
							local405.method8019(local328, local185);
							Static185.aClass66_14.Q(local328, local185, local558 + local328, local185 + local256);
							local414.method8019(local328, local185);
							local185 -= 2;
							Static185.aClass66_14.ca(arg0, arg2, arg3 + arg0, arg1 + arg2);
						}
						if (local7 > local13) {
							@Pc(652) Class10_Sub1_Sub2_Sub2 local652 = (Class10_Sub1_Sub2_Sub2) local30;
							if (local652.anInt8558 != -1) {
								local185 -= 25;
								Static496.aClass13Array25[local652.anInt8558].method8019(Static458.anIntArray627[0] + arg0 - 12, local185);
								local185 -= 2;
							}
							if (local652.anInt8574 != -1) {
								local185 -= 25;
								Static112.aClass13Array7[local652.anInt8574].method8019(arg0 + Static458.anIntArray627[0] - 12, local185);
								local185 -= 2;
							}
						} else if (local17.anInt1277 >= 0 && local17.anInt1277 < Static112.aClass13Array7.length) {
							local185 -= 25;
							local405 = Static112.aClass13Array7[local17.anInt1277];
							local405.method8019(arg0 + Static458.anIntArray627[0] - (local405.QA() >> 1), local185);
							local185 -= 2;
						}
					}
					@Pc(699) Class18[] local699;
					@Pc(707) Class18 local707;
					if (!(local30 instanceof Class10_Sub1_Sub2_Sub2)) {
						local210 = 0;
						local699 = Static186.aClass18Array1;
						for (local424 = 0; local424 < local699.length; local424++) {
							local707 = local699[local424];
							if (local707 != null && local707.anInt388 == 1 && local707.anInt387 == Static444.anIntArray617[local13 - local7]) {
								local300 = Static315.aClass13Array20[local707.anInt392];
								if (local210 < local300.b()) {
									local210 = local300.b();
								}
								if (Static237.anInt7561 % 20 < 10) {
									local300.method8019(Static458.anIntArray627[0] + arg0 - 12, local185 - local300.b());
								}
							}
						}
						if (local210 > 0) {
						}
					} else if (local13 >= 0) {
						local210 = 0;
						local699 = Static186.aClass18Array1;
						for (local424 = 0; local424 < local699.length; local424++) {
							local707 = local699[local424];
							if (local707 != null && local707.anInt388 == 10 && local707.anInt387 == local11[local13]) {
								local300 = Static315.aClass13Array20[local707.anInt392];
								if (local210 < local300.b()) {
									local210 = local300.b();
								}
								local300.method8019(Static458.anIntArray627[0] + arg0 - 12, local185 + -local300.b());
							}
						}
						if (local210 > 0) {
						}
					}
					for (local210 = 0; local210 < 4; local210++) {
						if (local30.anIntArray652[local210] > Static237.anInt7561) {
							local871 = local30.method7027() / 2;
							Static382.method5664(arg3 >> 1, arg1 >> 1, local30, local871);
							if (Static458.anIntArray627[0] > -1) {
								local424 = Static92.aClass13Array6[local30.anIntArray650[local210]].QA();
								if (local210 == 1) {
									Static458.anIntArray627[1] -= 20;
								}
								if (local210 == 2) {
									Static458.anIntArray627[0] -= local424 - 9;
									Static458.anIntArray627[1] -= 10;
								}
								if (local210 == 3) {
									Static458.anIntArray627[0] += local424 - 9;
									Static458.anIntArray627[1] -= 10;
								}
								Static92.aClass13Array6[local30.anIntArray650[local210]].method8019(arg0 + Static458.anIntArray627[0] - (local424 >> 1), arg2 - -Static458.anIntArray627[1] + -12);
								Static334.aClass91_5.method7467(Integer.toString(local30.anIntArray649[local210]), Static458.anIntArray627[0] + arg0 - 1, arg2 + 3 + Static458.anIntArray627[1], -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1029) int local1029;
		for (@Pc(1023) int local1023 = 0; local1023 < Static486.anInt8198; local1023++) {
			local1029 = Static278.anIntArray452[local1023];
			@Pc(1036) Class10_Sub1_Sub2 local1036;
			if (local1029 < 2048) {
				local1036 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local1029];
			} else {
				local1036 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) (local1029 - 2048))).aClass10_Sub1_Sub2_Sub1_1;
			}
			local210 = Static263.anIntArray635[local1023];
			@Pc(1059) Class10_Sub1_Sub2 local1059;
			if (local210 < 2048) {
				local1059 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local210];
			} else {
				local1059 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) (local210 - 2048))).aClass10_Sub1_Sub2_Sub1_1;
			}
			Static313.method4801(--local1036.anInt8477, local1059, arg3, local1036, arg2, arg0, arg1);
		}
		local1029 = Static195.aClass196_5.anInt5177 + Static195.aClass196_5.anInt5173 + 2;
		for (local185 = 0; local185 < Static271.anInt5164; local185++) {
			local210 = Static245.anIntArray431[local185];
			local871 = Static245.anIntArray429[local185];
			local424 = Static245.anIntArray427[local185];
			@Pc(1122) boolean local1122 = true;
			while (local1122) {
				local1122 = false;
				for (local558 = 0; local558 < local185; local558++) {
					if (local871 + 2 > -local1029 + Static245.anIntArray429[local558] && Static245.anIntArray429[local558] + 2 > -local1029 + local871 && Static245.anIntArray427[local558] + Static245.anIntArray431[local558] > -local424 + local210 && local210 + local424 > -Static245.anIntArray427[local558] + Static245.anIntArray431[local558] && local871 > Static245.anIntArray429[local558] - local1029) {
						local1122 = true;
						local871 = Static245.anIntArray429[local558] - local1029;
					}
				}
			}
			Static245.anIntArray429[local185] = local871;
			@Pc(1218) String local1218 = Static245.aStringArray22[local185];
			if (Static19.anInt389 == 0) {
				local256 = 16776960;
				if (Static245.anIntArray428[local185] < 6) {
					local256 = Static335.anIntArray524[Static245.anIntArray428[local185]];
				}
				if (Static245.anIntArray428[local185] == 6) {
					local256 = Static523.anInt8897 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static245.anIntArray428[local185] == 7) {
					local256 = Static523.anInt8897 % 20 >= 10 ? 65535 : 255;
				}
				if (Static245.anIntArray428[local185] == 8) {
					local256 = Static523.anInt8897 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static245.anIntArray428[local185] == 9) {
					local328 = 150 - Static245.anIntArray432[local185];
					if (local328 < 50) {
						local256 = local328 * 1280 + 16711680;
					} else if (local328 < 100) {
						local256 = 16384000 + 16776960 - local328 * 327680;
					} else if (local328 < 150) {
						local256 = (local328 - 100) * 5 + 65280;
					}
				}
				if (Static245.anIntArray428[local185] == 10) {
					local328 = 150 - Static245.anIntArray432[local185];
					if (local328 < 50) {
						local256 = local328 * 5 + 16711680;
					} else if (local328 < 100) {
						local256 = 16711935 - (local328 - 50) * 327680;
					} else if (local328 < 150) {
						local256 = local328 * 327680 - (local328 + -100) * 5 - 32767745;
					}
				}
				if (Static245.anIntArray428[local185] == 11) {
					local328 = 150 - Static245.anIntArray432[local185];
					if (local328 < 50) {
						local256 = 16777215 - local328 * 327685;
					} else if (local328 < 100) {
						local256 = local328 * 327685 - 16318970;
					} else if (local328 < 150) {
						local256 = 32768000 + 16777215 - local328 * 327680;
					}
				}
				local328 = local256 | 0xFF000000;
				if (Static245.anIntArray430[local185] == 0) {
					Static65.aClass91_4.method7467(local1218, local210 + arg0, local871 + arg2, local328, -16777216);
				}
				if (Static245.anIntArray430[local185] == 1) {
					Static65.aClass91_4.method7469(local1218, arg0 + local210, arg2 + local871, Static523.anInt8897, local328);
				}
				if (Static245.anIntArray430[local185] == 2) {
					Static65.aClass91_4.method7468(local210 + arg0, local1218, local328, arg2 + local871, Static523.anInt8897);
				}
				if (Static245.anIntArray430[local185] == 3) {
					Static65.aClass91_4.method7470(local1218, local328, local871 + arg2, arg0 - -local210, Static523.anInt8897, 150 - Static245.anIntArray432[local185]);
				}
				@Pc(1550) int local1550;
				if (Static245.anIntArray430[local185] == 4) {
					local1550 = (150 - Static245.anIntArray432[local185]) * (Static195.aClass196_5.method4386(local1218) + 100) / 150;
					Static185.aClass66_14.Q(arg0 + local210 - 50, arg2, local210 + arg0 + 50, arg2 + arg1);
					Static65.aClass91_4.method7451(arg0 + local210 + 50 - local1550, local328, -16777216, local1218, arg2 + local871);
					Static185.aClass66_14.ca(arg0, arg2, arg3 + arg0, arg2 + arg1);
				}
				if (Static245.anIntArray430[local185] == 5) {
					local1550 = 150 - Static245.anIntArray432[local185];
					@Pc(1608) int local1608 = 0;
					if (local1550 < 25) {
						local1608 = local1550 - 25;
					} else if (local1550 > 125) {
						local1608 = local1550 - 125;
					}
					@Pc(1631) int local1631 = Static195.aClass196_5.anInt5173 + Static195.aClass196_5.anInt5177;
					Static185.aClass66_14.Q(arg0, arg2 + local871 - local1631 - 1, arg3 + arg0, arg2 + local871 + 5);
					Static65.aClass91_4.method7467(local1218, local210 + arg0, local871 + arg2 + local1608, local328, -16777216);
					Static185.aClass66_14.ca(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static65.aClass91_4.method7467(local1218, local210 + arg0, local871 + arg2, -256, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "([Lclient!te;ZLclient!no;)Lclient!vca;")
	public static Class344 method1405(@OriginalArg(0) Class312[] arg0, @OriginalArg(2) Class66_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong260 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local29, arg0[local36].aLong260);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static188.anIntArray375, 0);
		if (Static188.anIntArray375[0] == 0) {
			if (Static188.anIntArray375[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static188.anIntArray375, 1);
			if (Static188.anIntArray375[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static188.anIntArray375[1]];
				OpenGL.glGetInfoLogARB(local29, Static188.anIntArray375[1], Static188.anIntArray375, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static188.anIntArray375[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local29, arg0[local109].aLong260);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class344(arg1, local29, arg0);
	}
}
