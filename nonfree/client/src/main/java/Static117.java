import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	public static int anInt2381;

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "[Lclient!gs;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_45 = new Class253(83, 6);

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "[I")
	public static final int[] anIntArray167 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
	public static final int anInt2385 = 1339;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Z")
	public static boolean method1986(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V")
	public static void method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static36.anInt647;
		@Pc(9) int[] local9 = Static362.anIntArray533;
		Static309.anInt5155 = 0;
		@Pc(179) int local179;
		@Pc(204) int local204;
		@Pc(250) int local250;
		@Pc(324) int local324;
		@Pc(412) int local412;
		@Pc(859) int local859;
		@Pc(542) int local542;
		for (@Pc(17) int local17 = 0; local17 < Static56.anInt943 + local7; local17++) {
			@Pc(21) Class249 local21 = null;
			@Pc(30) Class26_Sub2_Sub4 local30;
			if (local17 < local7) {
				local30 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9[local17]];
			} else {
				local30 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local17 - local7]];
				local21 = ((Class26_Sub2_Sub4_Sub1) local30).aClass249_1;
				if (local21.anIntArray579 != null) {
					local21 = local21.method5179(Static224.aClass239_7);
					if (local21 == null) {
						continue;
					}
				}
			}
			if (local30.anInt7063 >= 0 && (Static143.anInt2745 == local30.anInt7045 || local30.aByte102 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102)) {
				Static373.method4781(arg3 >> 1, local30, local30.method5516(), arg1 >> 1);
				if (Static25.anIntArray37[0] >= 0) {
					if (local30.aString68 != null && (local7 <= local17 || Static127.anInt2456 == 0 || Static127.anInt2456 == 3 || Static127.anInt2456 == 1 && Static220.method3098(((Class26_Sub2_Sub4_Sub2) local30).aString69)) && Static309.anInt5155 < Static333.anInt3376) {
						Static333.anIntArray309[Static309.anInt5155] = Static35.aClass57_13.method1387(local30.aString68) / 2;
						Static333.anIntArray307[Static309.anInt5155] = Static25.anIntArray37[0];
						Static333.anIntArray306[Static309.anInt5155] = Static25.anIntArray37[1];
						Static333.anIntArray308[Static309.anInt5155] = local30.anInt7101;
						Static333.anIntArray310[Static309.anInt5155] = local30.anInt7084;
						Static333.anIntArray311[Static309.anInt5155] = local30.anInt7075;
						Static333.aStringArray28[Static309.anInt5155] = local30.aString68;
						Static309.anInt5155++;
					}
					local179 = arg2 + Static25.anIntArray37[1];
					@Pc(235) Class11[] local235;
					@Pc(242) Class246[] local242;
					@Pc(296) Class11 local296;
					if (local30.aBoolean476 || local30.anInt7079 <= Static274.anInt4617) {
						local179 -= Math.max(Static35.aClass57_13.anInt1607, Static18.aClass11Array2[0].ma());
					} else {
						@Pc(190) byte local190 = 1;
						if (local17 < local7) {
							@Pc(199) Class26_Sub2_Sub4_Sub2 local199 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9[local17]];
							local204 = local30.method5507().anInt2264;
							if (local199.aBoolean482) {
								local190 = 2;
							}
						} else {
							local204 = local21.anInt6515;
							if (local204 == -1) {
								local204 = local30.method5507().anInt2264;
							}
						}
						@Pc(225) Class11[] local225 = Static18.aClass11Array2;
						if (local204 != -1) {
							local235 = (Class11[]) Static87.aClass126_16.method2822((long) local204);
							if (local235 == null) {
								local242 = Static469.method5146(Static25.aClass178_9, local204);
								if (local242 != null) {
									local235 = new Class11[local242.length];
									for (local250 = 0; local250 < local242.length; local250++) {
										local235[local250] = Static269.aClass51_9.method5308(local242[local250]);
									}
									Static87.aClass126_16.method2824((long) local204, local235);
								}
							}
							if (local235 != null && local235.length >= 2) {
								local225 = local235;
							}
						}
						if (local190 >= local225.length) {
							local190 = 1;
						}
						@Pc(292) Class11 local292 = local225[0];
						local296 = local225[local190];
						local179 -= Math.max(Static35.aClass57_13.anInt1607, local292.ma());
						local250 = arg0 + Static25.anIntArray37[0] - (local292.la() >> 1);
						local324 = local292.la() * local30.anInt7051 / 255;
						if (local30.anInt7051 > 0 && local324 < 2) {
							local324 = 2;
						}
						local292.method4394(local250, local179);
						Static269.aClass51_9.fa(local250, local179, local324 + local250, local179 - -local292.ma());
						local296.method4394(local250, local179);
						Static269.aClass51_9.OA(arg0, arg2, arg0 + arg3, arg1 + arg2);
					}
					local179 -= 2;
					if (!local30.aBoolean476) {
						@Pc(395) Class11 local395;
						if (local30.anInt7054 > Static274.anInt4617) {
							local395 = Static58.aClass11Array4[local30.aBoolean478 ? 2 : 0];
							@Pc(404) Class11 local404 = Static58.aClass11Array4[local30.aBoolean478 ? 3 : 1];
							if (local30 instanceof Class26_Sub2_Sub4_Sub1) {
								local412 = local21.anInt6514;
								if (local412 == -1) {
									local412 = local30.method5507().anInt2286;
								}
							} else {
								local412 = local30.method5507().anInt2286;
							}
							if (local412 != -1) {
								local235 = (Class11[]) Static343.aClass126_51.method2822((long) local412);
								if (local235 == null) {
									local242 = Static469.method5146(Static25.aClass178_9, local412);
									if (local242 != null) {
										local235 = new Class11[local242.length];
										for (local250 = 0; local250 < local242.length; local250++) {
											local235[local250] = Static269.aClass51_9.method5308(local242[local250]);
										}
										Static343.aClass126_51.method2824((long) local412, local235);
									}
								}
								if (local235 != null && local235.length == 4) {
									local395 = local235[local30.aBoolean478 ? 2 : 0];
									local404 = local235[local30.aBoolean478 ? 3 : 1];
								}
							}
							@Pc(505) int local505 = local30.anInt7054 - Static274.anInt4617;
							if (local30.anInt7106 < local505) {
								local505 -= local30.anInt7106;
								local250 = local30.anInt7092 == 0 ? 0 : local30.anInt7092 * ((local30.anInt7064 - local505) / local30.anInt7092);
								local542 = local250 * local395.la() / local30.anInt7064;
							} else {
								local542 = local395.la();
							}
							local250 = local395.ma();
							local179 -= local250;
							local324 = arg0 + Static25.anIntArray37[0] - (local395.la() >> 1);
							local395.method4394(local324, local179);
							Static269.aClass51_9.fa(local324, local179, local324 + local542, local250 + local179);
							local404.method4394(local324, local179);
							local179 -= 2;
							Static269.aClass51_9.OA(arg0, arg2, arg3 + arg0, arg1 + arg2);
						}
						if (local17 < local7) {
							@Pc(602) Class26_Sub2_Sub4_Sub2 local602 = (Class26_Sub2_Sub4_Sub2) local30;
							if (local602.anInt7128 != -1) {
								local179 -= 25;
								Static313.aClass11Array8[local602.anInt7128].method4394(arg0 + Static25.anIntArray37[0] - 12, local179);
								local179 -= 2;
							}
							if (local602.anInt7144 != -1) {
								local179 -= 25;
								Static378.aClass11Array11[local602.anInt7144].method4394(Static25.anIntArray37[0] + arg0 - 12, local179);
								local179 -= 2;
							}
						} else if (local21.anInt6508 >= 0 && local21.anInt6508 < Static378.aClass11Array11.length) {
							local179 -= 25;
							local395 = Static378.aClass11Array11[local21.anInt6508];
							local395.method4394(arg0 + Static25.anIntArray37[0] - (local395.la() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(686) Class150[] local686;
					@Pc(694) Class150 local694;
					if (!(local30 instanceof Class26_Sub2_Sub4_Sub2)) {
						local204 = 0;
						local686 = Static325.aClass150Array1;
						for (local412 = 0; local412 < local686.length; local412++) {
							local694 = local686[local412];
							if (local694 != null && local694.anInt4136 == 1 && local694.anInt4139 == Static228.anIntArray347[local17 - local7]) {
								local296 = Static378.aClass11Array12[local694.anInt4138];
								if (local204 < local296.ma()) {
									local204 = local296.ma();
								}
								if (Static274.anInt4617 % 20 < 10) {
									local296.method4394(arg0 + Static25.anIntArray37[0] - 12, -local296.ma() + local179);
								}
							}
						}
						if (local204 > 0) {
						}
					} else if (local17 >= 0) {
						local204 = 0;
						local686 = Static325.aClass150Array1;
						for (local412 = 0; local412 < local686.length; local412++) {
							local694 = local686[local412];
							if (local694 != null && local694.anInt4136 == 10 && local9[local17] == local694.anInt4139) {
								local296 = Static378.aClass11Array12[local694.anInt4138];
								if (local204 < local296.ma()) {
									local204 = local296.ma();
								}
								local296.method4394(Static25.anIntArray37[0] + arg0 - 12, -local296.ma() + local179);
							}
						}
						if (local204 > 0) {
						}
					}
					for (local204 = 0; local204 < 4; local204++) {
						if (local30.anIntArray601[local204] > Static274.anInt4617) {
							local859 = local30.method5516() / 2;
							Static373.method4781(arg3 >> 1, local30, local859, arg1 >> 1);
							if (Static25.anIntArray37[0] > -1) {
								local412 = Static368.aClass11Array10[local30.anIntArray600[local204]].la();
								if (local204 == 1) {
									Static25.anIntArray37[1] -= 20;
								}
								if (local204 == 2) {
									Static25.anIntArray37[0] -= local412 - 9;
									Static25.anIntArray37[1] -= 10;
								}
								if (local204 == 3) {
									Static25.anIntArray37[1] -= 10;
									Static25.anIntArray37[0] += local412 - 9;
								}
								Static368.aClass11Array10[local30.anIntArray600[local204]].method4394(arg0 + Static25.anIntArray37[0] - (local412 >> 1), Static25.anIntArray37[1] + -12 + arg2);
								Static359.aClass63_11.method4585(0, -1, Integer.toString(local30.anIntArray602[local204]), arg0 + Static25.anIntArray37[0] - 1, arg2 + Static25.anIntArray37[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1002) int local1002;
		for (@Pc(996) int local996 = 0; local996 < Static375.anInt6098; local996++) {
			local1002 = Static212.anIntArray335[local996];
			@Pc(1011) Class26_Sub2_Sub4 local1011;
			if (local1002 < 2048) {
				local1011 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local1002];
			} else {
				local1011 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local1002 - 2048];
			}
			local204 = Static225.anIntArray441[local996];
			@Pc(1034) Class26_Sub2_Sub4 local1034;
			if (local204 >= 2048) {
				local1034 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local204 - 2048];
			} else {
				local1034 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local204];
			}
			Static295.method3892(arg2, --local1011.anInt7108, arg0, local1011, local1034, arg1, arg3);
		}
		local1002 = Static35.aClass57_13.anInt1596 + Static35.aClass57_13.anInt1607 + 2;
		for (local179 = 0; local179 < Static309.anInt5155; local179++) {
			local204 = Static333.anIntArray307[local179];
			local859 = Static333.anIntArray306[local179];
			local412 = Static333.anIntArray309[local179];
			@Pc(1087) boolean local1087 = true;
			while (local1087) {
				local1087 = false;
				for (local542 = 0; local542 < local179; local542++) {
					if (Static333.anIntArray306[local542] - local1002 < local859 - -2 && Static333.anIntArray306[local542] + 2 > -local1002 + local859 && Static333.anIntArray307[local542] + Static333.anIntArray309[local542] > -local412 + local204 && local412 + local204 > -Static333.anIntArray309[local542] + Static333.anIntArray307[local542] && local859 > Static333.anIntArray306[local542] - local1002) {
						local859 = Static333.anIntArray306[local542] - local1002;
						local1087 = true;
					}
				}
			}
			Static333.anIntArray306[local179] = local859;
			@Pc(1185) String local1185 = Static333.aStringArray28[local179];
			if (Static7.anInt49 == 0) {
				local250 = 16776960;
				if (Static333.anIntArray308[local179] < 6) {
					local250 = Static43.anIntArray67[Static333.anIntArray308[local179]];
				}
				if (Static333.anIntArray308[local179] == 6) {
					local250 = Static143.anInt2745 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static333.anIntArray308[local179] == 7) {
					local250 = Static143.anInt2745 % 20 < 10 ? 255 : 65535;
				}
				if (Static333.anIntArray308[local179] == 8) {
					local250 = Static143.anInt2745 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static333.anIntArray308[local179] == 9) {
					local324 = 150 - Static333.anIntArray311[local179];
					if (local324 < 50) {
						local250 = local324 * 1280 + 16711680;
					} else if (local324 < 100) {
						local250 = 16776960 - (local324 - 50) * 327680;
					} else if (local324 < 150) {
						local250 = local324 * 5 + 65280 - 500;
					}
				}
				if (Static333.anIntArray308[local179] == 10) {
					local324 = 150 - Static333.anIntArray311[local179];
					if (local324 < 50) {
						local250 = local324 * 5 + 16711680;
					} else if (local324 < 100) {
						local250 = 33095935 - local324 * 327680;
					} else if (local324 < 150) {
						local250 = local324 * 327680 + 755 - local324 * 5 - 32768000;
					}
				}
				if (Static333.anIntArray308[local179] == 11) {
					local324 = 150 - Static333.anIntArray311[local179];
					if (local324 < 50) {
						local250 = 16777215 - local324 * 327685;
					} else if (local324 < 100) {
						local250 = local324 * 327685 - 16318970;
					} else if (local324 < 150) {
						local250 = 16777215 - (local324 - 100) * 327680;
					}
				}
				local324 = local250 | 0xFF000000;
				if (Static333.anIntArray310[local179] == 0) {
					Static305.aClass63_15.method4585(-16777216, local324, local1185, arg0 + local204, local859 + arg2);
				}
				if (Static333.anIntArray310[local179] == 1) {
					Static305.aClass63_15.method4588(arg2 + local859, local324, Static143.anInt2745, local1185, local204 + arg0);
				}
				if (Static333.anIntArray310[local179] == 2) {
					Static305.aClass63_15.method4578(local324, arg2 + local859, Static143.anInt2745, local1185, arg0 + local204);
				}
				if (Static333.anIntArray310[local179] == 3) {
					Static305.aClass63_15.method4589(local324, 150 - Static333.anIntArray311[local179], Static143.anInt2745, arg0 + local204, arg2 + local859, local1185);
				}
				@Pc(1536) int local1536;
				if (Static333.anIntArray310[local179] == 4) {
					local1536 = (150 - Static333.anIntArray311[local179]) * (Static35.aClass57_13.method1387(local1185) - -100) / 150;
					Static269.aClass51_9.fa(local204 + arg0 - 50, arg2, arg0 + local204 + 50, arg2 - -arg1);
					Static305.aClass63_15.method4581(-16777216, local859 + arg2, local324, local1185, local204 + arg0 + 50 - local1536);
					Static269.aClass51_9.OA(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
				if (Static333.anIntArray310[local179] == 5) {
					local1536 = 150 - Static333.anIntArray311[local179];
					@Pc(1595) int local1595 = 0;
					if (local1536 < 25) {
						local1595 = local1536 - 25;
					} else if (local1536 > 125) {
						local1595 = local1536 - 125;
					}
					@Pc(1621) int local1621 = Static35.aClass57_13.anInt1596 + Static35.aClass57_13.anInt1607;
					Static269.aClass51_9.fa(arg0, local859 + arg2 - local1621 - 1, arg3 + arg0, local859 + arg2 + 5);
					Static305.aClass63_15.method4585(-16777216, local324, local1185, local204 + arg0, local1595 + local859 + arg2);
					Static269.aClass51_9.OA(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static305.aClass63_15.method4585(-16777216, -256, local1185, arg0 + local204, arg2 + local859);
			}
		}
	}
}
