import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public static int anInt5307;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
	public static boolean aBoolean386 = false;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_144 = new Class136(48, -1);

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt5306 = 0;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!of;")
	public static final Class174 aClass174_151 = new Class174("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method4365(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString2 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local21 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local21 = local21 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local21 = local21 + local64.substring(local129 + 5, local77);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)V")
	public static void method4370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static271.anInt4534;
		@Pc(9) int[] local9 = Static215.anIntArray267;
		Static55.anInt1085 = 0;
		@Pc(176) int local176;
		@Pc(217) int local217;
		@Pc(265) int local265;
		@Pc(336) int local336;
		@Pc(412) int local412;
		@Pc(875) int local875;
		@Pc(555) int local555;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static379.anInt6398; local13++) {
			@Pc(17) Class158 local17 = null;
			@Pc(26) Class1_Sub2_Sub6 local26;
			if (local13 < local7) {
				local26 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local9[local13]];
			} else {
				local26 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local13 - local7])).aClass1_Sub2_Sub6_Sub1_2;
				local17 = ((Class1_Sub2_Sub6_Sub1) local26).aClass158_1;
				if (local17.anIntArray294 != null) {
					local17 = local17.method3705(Static119.aClass47_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt7598 >= 0 && (Static463.anInt7797 == local26.anInt7575 || local26.aByte101 == Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101)) {
				Static441.method5948(local26, arg0 >> 1, arg2 >> 1, local26.method6193());
				if (Static90.anIntArray75[0] >= 0) {
					if (local26.aString68 != null && (local7 <= local13 || Static118.anInt2076 == 0 || Static118.anInt2076 == 3 || Static118.anInt2076 == 1 && Static60.method1135(((Class1_Sub2_Sub6_Sub2) local26).aString69)) && Static25.anInt448 > Static55.anInt1085) {
						Static25.anIntArray17[Static55.anInt1085] = Static251.aClass124_14.method3099(local26.aString68) / 2;
						Static25.anIntArray13[Static55.anInt1085] = Static90.anIntArray75[0];
						Static25.anIntArray15[Static55.anInt1085] = Static90.anIntArray75[1];
						Static25.anIntArray14[Static55.anInt1085] = local26.anInt7567;
						Static25.anIntArray16[Static55.anInt1085] = local26.lb;
						Static25.anIntArray18[Static55.anInt1085] = local26.anInt7619;
						Static25.aStringArray3[Static55.anInt1085] = local26.aString68;
						Static55.anInt1085++;
					}
					local176 = arg1 + Static90.anIntArray75[1];
					@Pc(250) Class2[] local250;
					@Pc(257) Class154[] local257;
					@Pc(309) Class2 local309;
					if (local26.aBoolean510 || local26.anInt7607 <= Static172.anInt3107) {
						local176 -= Math.max(Static251.aClass124_14.anInt3604, Static107.aClass2Array5[0].V());
					} else {
						@Pc(199) byte local199 = 1;
						if (local13 < local7) {
							@Pc(212) Class1_Sub2_Sub6_Sub2 local212 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local9[local13]];
							local217 = local26.method6189().anInt4151;
							if (local212.aBoolean512) {
								local199 = 2;
							}
						} else {
							local217 = local17.anInt4464;
							if (local217 == -1) {
								local217 = local26.method6189().anInt4151;
							}
						}
						@Pc(239) Class2[] local239 = Static107.aClass2Array5;
						if (local217 != -1) {
							local250 = (Class2[]) Static72.aClass268_12.method6166((long) local217);
							if (local250 == null) {
								local257 = Static467.method3627(Static8.aClass250_2, local217);
								if (local257 != null) {
									local250 = new Class2[local257.length];
									for (local265 = 0; local265 < local257.length; local265++) {
										local250[local265] = Static413.aClass167_11.method5993(local257[local265]);
									}
									Static72.aClass268_12.method6164(local250, (long) local217);
								}
							}
							if (local250 != null && local250.length >= 2) {
								local239 = local250;
							}
						}
						if (local199 >= local239.length) {
							local199 = 1;
						}
						@Pc(305) Class2 local305 = local239[0];
						local309 = local239[local199];
						local176 -= Math.max(Static251.aClass124_14.anInt3604, local305.V());
						local265 = Static90.anIntArray75[0] + arg3 - (local305.TA() >> 1);
						local336 = local305.TA() * local26.anInt7634 / 255;
						if (local26.anInt7634 > 0 && local336 < 2) {
							local336 = 2;
						}
						local305.method5829(local265, local176);
						Static413.aClass167_11.IA(local265, local176, local265 + local336, local176 + local305.V());
						local309.method5829(local265, local176);
						Static413.aClass167_11.w(arg3, arg1, arg0 + arg3, arg2 + arg1);
					}
					local176 -= 2;
					if (!local26.aBoolean510) {
						@Pc(395) Class2 local395;
						if (Static172.anInt3107 < local26.anInt7616) {
							local395 = Static63.aClass2Array18[local26.aBoolean508 ? 2 : 0];
							@Pc(404) Class2 local404 = Static63.aClass2Array18[local26.aBoolean508 ? 3 : 1];
							if (local26 instanceof Class1_Sub2_Sub6_Sub1) {
								local412 = local17.anInt4469;
								if (local412 == -1) {
									local412 = local26.method6189().anInt4193;
								}
							} else {
								local412 = local26.method6189().anInt4193;
							}
							if (local412 != -1) {
								local250 = (Class2[]) Static313.aClass268_44.method6166((long) local412);
								if (local250 == null) {
									local257 = Static467.method3627(Static8.aClass250_2, local412);
									if (local257 != null) {
										local250 = new Class2[local257.length];
										for (local265 = 0; local265 < local257.length; local265++) {
											local250[local265] = Static413.aClass167_11.method5993(local257[local265]);
										}
										Static313.aClass268_44.method6164(local250, (long) local412);
									}
								}
								if (local250 != null && local250.length == 4) {
									local395 = local250[local26.aBoolean508 ? 2 : 0];
									local404 = local250[local26.aBoolean508 ? 3 : 1];
								}
							}
							@Pc(514) int local514 = local26.anInt7616 - Static172.anInt3107;
							if (local514 > local26.anInt7639) {
								local514 -= local26.anInt7639;
								local265 = local26.anInt7608 == 0 ? 0 : local26.anInt7608 * ((local26.anInt7622 - local514) / local26.anInt7608);
								local555 = local265 * local395.TA() / local26.anInt7622;
							} else {
								local555 = local395.TA();
							}
							local265 = local395.V();
							local176 -= local265;
							local336 = Static90.anIntArray75[0] + arg3 - (local395.TA() >> 1);
							local395.method5829(local336, local176);
							Static413.aClass167_11.IA(local336, local176, local555 + local336, local265 + local176);
							local404.method5829(local336, local176);
							Static413.aClass167_11.w(arg3, arg1, arg0 + arg3, arg1 - -arg2);
							local176 -= 2;
						}
						if (local13 < local7) {
							@Pc(653) Class1_Sub2_Sub6_Sub2 local653 = (Class1_Sub2_Sub6_Sub2) local26;
							if (local653.anInt7652 != -1) {
								local176 -= 25;
								Static153.aClass2Array10[local653.anInt7652].method5829(arg3 + Static90.anIntArray75[0] - 12, local176);
								local176 -= 2;
							}
							if (local653.anInt7678 != -1) {
								local176 -= 25;
								Static419.aClass2Array17[local653.anInt7678].method5829(Static90.anIntArray75[0] + arg3 - 12, local176);
								local176 -= 2;
							}
						} else if (local17.anInt4461 >= 0 && Static419.aClass2Array17.length > local17.anInt4461) {
							local176 -= 25;
							local395 = Static419.aClass2Array17[local17.anInt4461];
							local395.method5829(arg3 + Static90.anIntArray75[0] - (local395.TA() >> 1), local176);
							local176 -= 2;
						}
					}
					@Pc(705) Class36[] local705;
					@Pc(713) Class36 local713;
					if (!(local26 instanceof Class1_Sub2_Sub6_Sub2)) {
						local217 = 0;
						local705 = Static138.aClass36Array1;
						for (local412 = 0; local412 < local705.length; local412++) {
							local713 = local705[local412];
							if (local713 != null && local713.anInt1123 == 1 && Static198.anIntArray225[local13 - local7] == local713.anInt1122) {
								local309 = Static93.aClass2Array4[local713.anInt1119];
								if (local309.V() > local217) {
									local217 = local309.V();
								}
								if (Static172.anInt3107 % 20 < 10) {
									local309.method5829(Static90.anIntArray75[0] + arg3 - 12, -local309.V() + local176);
								}
							}
						}
						if (local217 > 0) {
						}
					} else if (local13 >= 0) {
						local217 = 0;
						local705 = Static138.aClass36Array1;
						for (local412 = 0; local412 < local705.length; local412++) {
							local713 = local705[local412];
							if (local713 != null && local713.anInt1123 == 10 && local9[local13] == local713.anInt1122) {
								local309 = Static93.aClass2Array4[local713.anInt1119];
								if (local217 < local309.V()) {
									local217 = local309.V();
								}
								local309.method5829(arg3 + Static90.anIntArray75[0] - 12, -local309.V() + local176);
							}
						}
						if (local217 > 0) {
						}
					}
					for (local217 = 0; local217 < 4; local217++) {
						if (local26.anIntArray506[local217] > Static172.anInt3107) {
							local875 = local26.method6193() / 2;
							Static441.method5948(local26, arg0 >> 1, arg2 >> 1, local875);
							if (Static90.anIntArray75[0] > -1) {
								local412 = Static40.aClass2Array2[local26.anIntArray507[local217]].TA();
								if (local217 == 1) {
									Static90.anIntArray75[1] -= 20;
								}
								if (local217 == 2) {
									Static90.anIntArray75[1] -= 10;
									Static90.anIntArray75[0] -= local412 - 9;
								}
								if (local217 == 3) {
									Static90.anIntArray75[1] -= 10;
									Static90.anIntArray75[0] += local412 - 9;
								}
								Static40.aClass2Array2[local26.anIntArray507[local217]].method5829(Static90.anIntArray75[0] + arg3 - (local412 >> 1), Static90.anIntArray75[1] + arg1 - 12);
								Static275.aClass18_3.method5169(Integer.toString(local26.anIntArray508[local217]), -1, arg1 + Static90.anIntArray75[1] + 3, 0, arg3 + Static90.anIntArray75[0] - 1);
							}
						}
					}
				}
			}
		}
		@Pc(1022) int local1022;
		for (@Pc(1016) int local1016 = 0; local1016 < Static360.anInt6139; local1016++) {
			local1022 = Static240.anIntArray390[local1016];
			@Pc(1035) Class1_Sub2_Sub6 local1035;
			if (local1022 >= 2048) {
				local1035 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) (local1022 - 2048))).aClass1_Sub2_Sub6_Sub1_2;
			} else {
				local1035 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local1022];
			}
			local217 = Static301.anIntArray330[local1016];
			@Pc(1058) Class1_Sub2_Sub6 local1058;
			if (local217 >= 2048) {
				local1058 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) (local217 - 2048))).aClass1_Sub2_Sub6_Sub1_2;
			} else {
				local1058 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local217];
			}
			Static96.method1663(arg3, local1058, local1035, arg0, arg2, --local1035.anInt7636, arg1);
		}
		local1022 = Static251.aClass124_14.anInt3604 + Static251.aClass124_14.anInt3597 + 2;
		for (local176 = 0; local176 < Static55.anInt1085; local176++) {
			local217 = Static25.anIntArray13[local176];
			local875 = Static25.anIntArray15[local176];
			local412 = Static25.anIntArray17[local176];
			@Pc(1112) boolean local1112 = true;
			while (local1112) {
				local1112 = false;
				for (local555 = 0; local555 < local176; local555++) {
					if (Static25.anIntArray15[local555] - local1022 < local875 + 2 && local875 - local1022 < Static25.anIntArray15[local555] - -2 && local217 - local412 < Static25.anIntArray17[local555] + Static25.anIntArray13[local555] && Static25.anIntArray13[local555] - Static25.anIntArray17[local555] < local217 - -local412 && Static25.anIntArray15[local555] - local1022 < local875) {
						local1112 = true;
						local875 = Static25.anIntArray15[local555] - local1022;
					}
				}
			}
			Static25.anIntArray15[local176] = local875;
			@Pc(1212) String local1212 = Static25.aStringArray3[local176];
			if (Static335.anInt5574 == 0) {
				local265 = 16776960;
				if (Static25.anIntArray14[local176] < 6) {
					local265 = Static21.anIntArray511[Static25.anIntArray14[local176]];
				}
				if (Static25.anIntArray14[local176] == 6) {
					local265 = Static463.anInt7797 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static25.anIntArray14[local176] == 7) {
					local265 = Static463.anInt7797 % 20 >= 10 ? 65535 : 255;
				}
				if (Static25.anIntArray14[local176] == 8) {
					local265 = Static463.anInt7797 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static25.anIntArray14[local176] == 9) {
					local336 = 150 - Static25.anIntArray18[local176];
					if (local336 < 50) {
						local265 = local336 * 1280 + 16711680;
					} else if (local336 < 100) {
						local265 = 16776960 - (local336 - 50) * 327680;
					} else if (local336 < 150) {
						local265 = local336 * 5 + 65280 - 500;
					}
				}
				if (Static25.anIntArray14[local176] == 10) {
					local336 = 150 - Static25.anIntArray18[local176];
					if (local336 < 50) {
						local265 = local336 * 5 + 16711680;
					} else if (local336 < 100) {
						local265 = 16711935 - (local336 - 50) * 327680;
					} else if (local336 < 150) {
						local265 = (local336 + -100) * 327680 + 500 + 255 - local336 * 5;
					}
				}
				if (Static25.anIntArray14[local176] == 11) {
					local336 = 150 - Static25.anIntArray18[local176];
					if (local336 < 50) {
						local265 = 16777215 - local336 * 327685;
					} else if (local336 < 100) {
						local265 = local336 * 327685 + 65280 - 16384250;
					} else if (local336 < 150) {
						local265 = 16777215 - (local336 - 100) * 327680;
					}
				}
				local336 = local265 | 0xFF000000;
				if (Static25.anIntArray16[local176] == 0) {
					Static266.aClass18_2.method5169(local1212, local336, local875 + arg1, -16777216, local217 + arg3);
				}
				if (Static25.anIntArray16[local176] == 1) {
					Static266.aClass18_2.method5178(local336, Static463.anInt7797, local1212, local217 + arg3, local875 + arg1);
				}
				if (Static25.anIntArray16[local176] == 2) {
					Static266.aClass18_2.method5163(arg3 + local217, local1212, local336, local875 + arg1, Static463.anInt7797);
				}
				if (Static25.anIntArray16[local176] == 3) {
					Static266.aClass18_2.method5172(local875 + arg1, local1212, arg3 + local217, local336, 150 - Static25.anIntArray18[local176], Static463.anInt7797);
				}
				@Pc(1548) int local1548;
				if (Static25.anIntArray16[local176] == 4) {
					local1548 = (150 - Static25.anIntArray18[local176]) * (Static251.aClass124_14.method3099(local1212) + 100) / 150;
					Static413.aClass167_11.IA(local217 + arg3 - 50, arg1, arg3 + local217 + 50, arg1 + arg2);
					Static266.aClass18_2.method5167(local1212, local336, -16777216, local217 + arg3 + 50 - local1548, local875 + arg1);
					Static413.aClass167_11.w(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (Static25.anIntArray16[local176] == 5) {
					local1548 = 150 - Static25.anIntArray18[local176];
					@Pc(1608) int local1608 = 0;
					if (local1548 < 25) {
						local1608 = local1548 - 25;
					} else if (local1548 > 125) {
						local1608 = local1548 - 125;
					}
					@Pc(1632) int local1632 = Static251.aClass124_14.anInt3597 + Static251.aClass124_14.anInt3604;
					Static413.aClass167_11.IA(arg3, local875 + arg1 - local1632 - 1, arg3 - -arg0, local875 + arg1 + 5);
					Static266.aClass18_2.method5169(local1212, local336, local1608 + local875 + arg1, -16777216, arg3 + local217);
					Static413.aClass167_11.w(arg3, arg1, arg3 + arg0, arg1 - -arg2);
				}
			} else {
				Static266.aClass18_2.method5169(local1212, -256, arg1 + local875, -16777216, local217 + arg3);
			}
		}
	}
}
