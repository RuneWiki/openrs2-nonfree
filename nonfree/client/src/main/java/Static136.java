import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public static int anInt3010 = 0;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public static int anInt3011 = -1;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	public static int anInt3012 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method2777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static68.aClass87_15 = new Class87(arg0);
		Static259.aClass87_26 = new Class87(arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static102.anInt2428 = 0;
		@Pc(168) int local168;
		@Pc(211) int local211;
		@Pc(394) int local394;
		@Pc(507) int local507;
		@Pc(266) int local266;
		@Pc(624) int local624;
		@Pc(446) int local446;
		for (@Pc(9) int local9 = -1; local9 < Static5.anInt200 + Static357.anInt4331; local9++) {
			@Pc(13) Class213 local13 = null;
			@Pc(31) Class17_Sub1_Sub1 local31;
			if (local9 < 0) {
				local31 = Static198.aClass17_Sub1_Sub1_Sub1_3;
			} else if (Static357.anInt4331 <= local9) {
				local31 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local9 - Static357.anInt4331]];
				local13 = ((Class17_Sub1_Sub1_Sub2) local31).aClass213_1;
				if (local13.anIntArray517 != null) {
					local13 = local13.method5480();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local31 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local9]];
			}
			if (local31.anInt4842 >= 0) {
				Static154.method3094(local31.method4315(), arg0 >> 1, local31, arg3 >> 1);
				if (Static22.anIntArray444[0] >= 0) {
					if (local31.aString50 != null && (local9 >= Static357.anInt4331 || Static157.anInt4885 == 0 || Static157.anInt4885 == 3 || Static157.anInt4885 == 1 && Static266.method4683(((Class17_Sub1_Sub1_Sub1) local31).aString13)) && Static12.anInt412 > Static102.anInt2428) {
						Static12.anIntArray49[Static102.anInt2428] = Static90.aClass63_3.method1746(local31.aString50) / 2;
						Static12.anIntArray53[Static102.anInt2428] = Static22.anIntArray444[0];
						Static12.anIntArray58[Static102.anInt2428] = Static22.anIntArray444[1];
						Static12.anIntArray51[Static102.anInt2428] = local31.anInt4851;
						Static12.anIntArray56[Static102.anInt2428] = local31.anInt4823;
						Static12.anIntArray57[Static102.anInt2428] = local31.anInt4880;
						Static12.aStringArray4[Static102.anInt2428] = local31.aString50;
						Static102.anInt2428++;
					}
					@Pc(156) Class5 local156 = Static81.aClass5Array21[0];
					local168 = Static22.anIntArray444[1] + arg2 - Math.max(Static90.aClass63_3.anInt1998, local156.method3623());
					@Pc(179) Class5 local179;
					@Pc(278) int local278;
					if (!local31.aBoolean473 && Static5.anInt208 < local31.lb) {
						local179 = Static81.aClass5Array21[1];
						if (local31 instanceof Class17_Sub1_Sub1_Sub2) {
							@Pc(185) Class17_Sub1_Sub1_Sub2 local185 = (Class17_Sub1_Sub1_Sub2) local31;
							@Pc(194) Class5[] local194 = (Class5[]) Static267.aClass87_47.method2482((long) local185.aClass213_1.anInt6534);
							if (local194 == null) {
								@Pc(203) Class99[] local203 = Static366.method2659(Static193.aClass216_64, local185.aClass213_1.anInt6534);
								if (local203 != null) {
									local194 = new Class5[local203.length];
									for (local211 = 0; local211 < local203.length; local211++) {
										local194[local211] = Static208.aClass32_11.method2149(local203[local211]);
									}
									Static267.aClass87_47.method2481(local194, (long) local185.aClass213_1.anInt6534);
								}
							}
							if (local194 != null && local194.length == 2) {
								local156 = local194[0];
								local179 = local194[1];
							}
						}
						local266 = Static22.anIntArray444[0] + arg1 - (local156.method3629() >> 1);
						local156.method3621(local266, local168);
						local278 = local156.method3629() * local31.anInt4831 / 255;
						if (local31.anInt4831 > 0 && local278 < 2) {
							local278 = 2;
						}
						Static208.aClass32_11.method2220(local266, local168, local278 + local266, local168 - -local156.method3623());
						local179.method3621(local266, local168);
						Static208.aClass32_11.method2226(arg1, arg2, arg3 + arg1, arg0 + arg2);
					}
					local168 -= 2;
					if (!local31.aBoolean473) {
						if (Static5.anInt208 < local31.anInt4849) {
							local179 = Static86.aClass5Array10[local31.aBoolean470 ? 2 : 0];
							@Pc(345) Class5 local345 = Static86.aClass5Array10[local31.aBoolean470 ? 3 : 1];
							if (local31 instanceof Class17_Sub1_Sub1_Sub2) {
								local278 = local13.anInt6517;
								if (local278 == -1) {
									local278 = local31.method4319().anInt3690;
								}
							} else {
								local278 = local31.method4319().anInt3690;
							}
							if (local278 != -1) {
								@Pc(379) Class5[] local379 = (Class5[]) Static147.aClass87_28.method2482((long) local278);
								if (local379 == null) {
									@Pc(386) Class99[] local386 = Static366.method2659(Static193.aClass216_64, local278);
									if (local386 != null) {
										local379 = new Class5[local386.length];
										for (local394 = 0; local394 < local386.length; local394++) {
											local379[local394] = Static208.aClass32_11.method2149(local386[local394]);
										}
										Static147.aClass87_28.method2481(local379, (long) local278);
									}
								}
								if (local379 != null && local379.length == 4) {
									local345 = local379[local31.aBoolean470 ? 3 : 1];
									local179 = local379[local31.aBoolean470 ? 2 : 0];
								}
							}
							local446 = local31.anInt4849 - Static5.anInt208;
							if (local446 > local31.anInt4866) {
								local446 -= local31.anInt4866;
								local394 = local31.anInt4879 == 0 ? 0 : local31.anInt4879 * ((local31.anInt4878 - local446) / local31.anInt4879);
								local211 = local394 * local179.method3629() / local31.anInt4878;
							} else {
								local211 = local179.method3629();
							}
							local394 = local179.method3623();
							local168 -= local394;
							local507 = Static22.anIntArray444[0] + arg1 - (local179.method3629() >> 1);
							local179.method3621(local507, local168);
							Static208.aClass32_11.method2220(local507, local168, local211 + local507, local168 - -local394);
							local345.method3621(local507, local168);
							local168 -= 2;
							Static208.aClass32_11.method2226(arg1, arg2, arg3 + arg1, arg0 + arg2);
						}
						if (Static357.anInt4331 > local9) {
							@Pc(577) Class17_Sub1_Sub1_Sub1 local577 = (Class17_Sub1_Sub1_Sub1) local31;
							if (local577.anInt808 != -1) {
								local168 -= 25;
								Static18.aClass5Array3[local577.anInt808].method3621(arg1 + Static22.anIntArray444[0] - 12, local168);
								local168 -= 2;
							}
							if (local577.anInt812 != -1) {
								local168 -= 25;
								Static261.aClass5Array8[local577.anInt812].method3621(Static22.anIntArray444[0] + arg1 - 12, local168);
								local168 -= 2;
							}
						} else if (local13.anInt6523 >= 0 && Static261.aClass5Array8.length > local13.anInt6523) {
							local179 = Static261.aClass5Array8[local13.anInt6523];
							local168 -= 25;
							local179.method3621(Static22.anIntArray444[0] + arg1 - (local179.method3629() >> 1), local168);
							local168 -= 2;
						}
					}
					@Pc(626) Class105[] local626;
					@Pc(634) Class105 local634;
					@Pc(653) Class5 local653;
					if (!(local31 instanceof Class17_Sub1_Sub1_Sub1)) {
						local624 = 0;
						local626 = Static340.aClass105Array1;
						for (local278 = 0; local278 < local626.length; local278++) {
							local634 = local626[local278];
							if (local634 != null && local634.anInt3081 == 1 && local634.anInt3076 == Static171.anIntArray333[local9 - Static357.anInt4331]) {
								local653 = Static228.aClass5Array17[local634.anInt3080];
								if (local653.method3623() > local624) {
									local624 = local653.method3623();
								}
								if (Static5.anInt208 % 20 < 10) {
									local653.method3621(Static22.anIntArray444[0] + arg1 - 12, -local653.method3623() + local168);
								}
							}
						}
						if (local624 > 0) {
						}
					} else if (local9 >= 0) {
						local624 = 0;
						local626 = Static340.aClass105Array1;
						for (local278 = 0; local278 < local626.length; local278++) {
							local634 = local626[local278];
							if (local634 != null && local634.anInt3081 == 10 && Static298.anIntArray492[local9] == local634.anInt3076) {
								local653 = Static228.aClass5Array17[local634.anInt3080];
								if (local653.method3623() > local624) {
									local624 = local653.method3623();
								}
								local653.method3621(Static22.anIntArray444[0] + arg1 - 12, -local653.method3623() + local168);
							}
						}
						if (local624 > 0) {
						}
					}
					for (local624 = 0; local624 < 4; local624++) {
						if (local31.anIntArray435[local624] > Static5.anInt208) {
							local266 = local31.method4315() / 2;
							Static154.method3094(local266, arg0 >> 1, local31, arg3 >> 1);
							if (Static22.anIntArray444[0] > -1) {
								if (local624 == 1) {
									Static22.anIntArray444[1] -= 20;
								}
								if (local624 == 2) {
									Static22.anIntArray444[0] -= 15;
									Static22.anIntArray444[1] -= 10;
								}
								if (local624 == 3) {
									Static22.anIntArray444[0] += 15;
									Static22.anIntArray444[1] -= 10;
								}
								Static58.aClass5Array9[local31.anIntArray434[local624]].method3621(Static22.anIntArray444[0] + arg1 - 12, arg2 - (-Static22.anIntArray444[1] - -12));
								Static56.aClass9_2.method5019(0, arg1 + Static22.anIntArray444[0] - 1, -1, arg2 - (-Static22.anIntArray444[1] + -3), Integer.toString(local31.anIntArray436[local624]));
							}
						}
					}
				}
			}
		}
		@Pc(929) int local929;
		for (@Pc(923) int local923 = 0; local923 < Static103.anInt2458; local923++) {
			local929 = Static110.anIntArray514[local923];
			@Pc(938) Class17_Sub1_Sub1 local938;
			if (local929 >= 2048) {
				local938 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local929 - 2048];
			} else {
				local938 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local929];
			}
			local168 = Static8.anIntArray493[local923];
			@Pc(957) Class17_Sub1_Sub1 local957;
			if (local168 < 2048) {
				local957 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local168];
			} else {
				local957 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local168 - 2048];
			}
			Static115.method2439(arg2, arg0, arg3, local957, arg1, local938, --local938.anInt4860);
		}
		local929 = Static90.aClass63_3.anInt1998 + Static90.aClass63_3.anInt1997 + 2;
		for (@Pc(1001) int local1001 = 0; local1001 < Static102.anInt2428; local1001++) {
			local168 = Static12.anIntArray53[local1001];
			local624 = Static12.anIntArray58[local1001];
			local266 = Static12.anIntArray49[local1001];
			@Pc(1017) boolean local1017 = true;
			while (local1017) {
				local1017 = false;
				for (local446 = 0; local446 < local1001; local446++) {
					if (Static12.anIntArray58[local446] - local929 < local624 + 2 && local624 - local929 < Static12.anIntArray58[local446] + 2 && Static12.anIntArray49[local446] + Static12.anIntArray53[local446] > local168 + -local266 && Static12.anIntArray53[local446] - Static12.anIntArray49[local446] < local168 - -local266 && local624 > Static12.anIntArray58[local446] - local929) {
						local1017 = true;
						local624 = Static12.anIntArray58[local446] - local929;
					}
				}
			}
			Static12.anIntArray58[local1001] = local624;
			@Pc(1115) String local1115 = Static12.aStringArray4[local1001];
			if (Static133.anInt2966 == 0) {
				local211 = 16776960;
				if (Static12.anIntArray51[local1001] < 6) {
					local211 = Static6.anIntArray29[Static12.anIntArray51[local1001]];
				}
				if (Static12.anIntArray51[local1001] == 6) {
					local211 = Static247.anInt5067 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static12.anIntArray51[local1001] == 7) {
					local211 = Static247.anInt5067 % 20 >= 10 ? 65535 : 255;
				}
				if (Static12.anIntArray51[local1001] == 8) {
					local211 = Static247.anInt5067 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static12.anIntArray51[local1001] == 9) {
					local394 = 150 - Static12.anIntArray57[local1001];
					if (local394 < 50) {
						local211 = local394 * 1280 + 16711680;
					} else if (local394 < 100) {
						local211 = 16776960 - (local394 - 50) * 327680;
					} else if (local394 < 150) {
						local211 = (local394 - 100) * 5 + 65280;
					}
				}
				if (Static12.anIntArray51[local1001] == 10) {
					local394 = 150 - Static12.anIntArray57[local1001];
					if (local394 < 50) {
						local211 = local394 * 5 + 16711680;
					} else if (local394 < 100) {
						local211 = 16711935 - (local394 - 50) * 327680;
					} else if (local394 < 150) {
						local211 = (local394 - 100) * 327680 + 255 + 500 - local394 * 5;
					}
				}
				if (Static12.anIntArray51[local1001] == 11) {
					local394 = 150 - Static12.anIntArray57[local1001];
					if (local394 < 50) {
						local211 = 16777215 - local394 * 327685;
					} else if (local394 < 100) {
						local211 = local394 * 327685 - 16318970;
					} else if (local394 < 150) {
						local211 = 32768000 + 16777215 - local394 * 327680;
					}
				}
				local394 = local211 | 0xFF000000;
				if (Static12.anIntArray56[local1001] == 0) {
					Static49.aClass9_1.method5019(-16777216, local168 + arg1, local394, local624 + arg2, local1115);
				}
				if (Static12.anIntArray56[local1001] == 1) {
					Static49.aClass9_1.method5004(local394, local1115, arg1 + local168, Static247.anInt5067, local624 + arg2);
				}
				if (Static12.anIntArray56[local1001] == 2) {
					Static49.aClass9_1.method5006(local624 + arg2, Static247.anInt5067, local168 + arg1, local394, local1115);
				}
				if (Static12.anIntArray56[local1001] == 3) {
					Static49.aClass9_1.method5010(local168 + arg1, 150 - Static12.anIntArray57[local1001], Static247.anInt5067, local1115, arg2 + local624, local394);
				}
				if (Static12.anIntArray56[local1001] == 4) {
					local507 = (150 - Static12.anIntArray57[local1001]) * (Static90.aClass63_3.method1746(local1115) + 100) / 150;
					Static208.aClass32_11.method2220(local168 + arg1 - 50, arg2, local168 + arg1 + 50, arg2 - -arg0);
					Static49.aClass9_1.method5021(local394, arg1 + local168 + 50 - local507, arg2 + local624, -16777216, local1115);
					Static208.aClass32_11.method2226(arg1, arg2, arg1 + arg3, arg2 + arg0);
				}
				if (Static12.anIntArray56[local1001] == 5) {
					local507 = 150 - Static12.anIntArray57[local1001];
					@Pc(1520) int local1520 = 0;
					if (local507 < 25) {
						local1520 = local507 - 25;
					} else if (local507 > 125) {
						local1520 = local507 - 125;
					}
					@Pc(1544) int local1544 = Static90.aClass63_3.anInt1998 + Static90.aClass63_3.anInt1997;
					Static208.aClass32_11.method2220(arg1, arg2 + local624 - local1544 - 1, arg3 + arg1, arg2 + local624 + 5);
					Static49.aClass9_1.method5019(-16777216, arg1 + local168, local394, local1520 + local624 + arg2, local1115);
					Static208.aClass32_11.method2226(arg1, arg2, arg3 + arg1, arg2 + arg0);
				}
			} else {
				Static49.aClass9_1.method5019(-16777216, local168 + arg1, -256, local624 + arg2, local1115);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILclient!uo;)V")
	public static void method2779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static251.anInt4676 == 0 || Static355.anInt6764 == 0) {
			return;
		}
		arg2.method2242(Static216.anInt4585, Static240.anInt1897, Static251.anInt4676, Static355.anInt6764);
		arg2.method2226(Static280.anInt5700, Static28.anInt1033, Static251.anInt4676, Static355.anInt6764);
		@Pc(35) Class109 local35 = arg2.method2221();
		local35.method3865(Static343.anInt6447, Static357.anInt4327, Static230.anInt4756, Static263.anInt5364, Static187.anInt4034, Static226.anInt4718);
		arg2.method2201(local35);
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (Static190.aClass53Array1 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(55) int local55 = arg2.method2223();
			local64 = (arg0 - Static216.anInt4585) * local55 / Static251.anInt4676;
			local72 = (arg1 - Static240.anInt1897) * local55 / Static355.anInt6764;
			local75 = arg2.method2203();
			local84 = local75 * (arg0 - Static216.anInt4585) / Static251.anInt4676;
			local93 = local75 * (arg1 - Static240.anInt1897) / Static355.anInt6764;
			@Pc(108) int[] local108 = new int[] { local64, local72, local55 };
			local35.method3879(local108);
			@Pc(126) int[] local126 = new int[] { local84, local93, local75 };
			local35.method3879(local126);
			@Pc(131) float local131 = 0.0F;
			@Pc(140) int local140 = local126[0] - local108[0];
			@Pc(149) int local149 = local126[1] - local108[1];
			@Pc(158) int local158 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				@Pc(171) int local171 = (int) ((float) local108[0] + local131 * (float) local140);
				@Pc(175) int local175 = local171 >> 7;
				@Pc(186) int local186 = (int) (local131 * (float) local158 + (float) local108[2]);
				@Pc(190) int local190 = local186 >> 7;
				if (local175 > 0 && local190 > 0 && local175 < Static233.anInt5573 && Static134.anInt2971 > local190) {
					@Pc(213) int local213 = Static242.anInt6745;
					if (local213 < 3 && (Static200.aByteArrayArrayArray8[1][local175][local190] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static190.aClass53Array1[local213].method2792(local171, local186) < (float) local149 * local131 + (float) local108[1]) {
						local50 = (Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() - 1) * 64 + local171 >> 7;
						local52 = local186 + (Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() - 1) * 64 >> 7;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static91.aBoolean214 && (Static257.anInt5340 & 0x40) != 0) {
					@Pc(336) Class12 local336 = Static209.method3975(Static97.anInt5544, Static349.anInt6682);
					if (local336 == null) {
						Static96.method5290();
					} else {
						Static58.method1506(Static175.anInt3793, " ->", local52, 0L, Static24.aString15, local50, 60);
					}
				} else {
					if (Static8.anInt5875 == 1) {
						Static58.method1506(-1, "", local52, 0L, Static113.aClass34_82.method1285(Static259.anInt2907), local50, 59);
					}
					Static58.method1506(-1, "", local52, 0L, Static328.aString61, local50, 21);
				}
			}
		}
		@Pc(353) Class217 local353 = Static92.aClass217_8;
		for (@Pc(366) Class8_Sub5 local366 = (Class8_Sub5) local353.method5683(); local366 != null; local366 = (Class8_Sub5) local353.method5679()) {
			if (local366.method3156(arg1, arg0, arg2) && Static242.anInt6745 == local366.anInt3438) {
				@Pc(491) int local491;
				@Pc(503) int local503;
				if (local366.aClass17_1 instanceof Class17_Sub1_Sub1_Sub1) {
					@Pc(391) Class17_Sub1_Sub1_Sub1 local391 = (Class17_Sub1_Sub1_Sub1) local366.aClass17_1;
					local64 = local391.method4318();
					if ((local64 & 0x1) == 0 && (local391.anInt5109 & 0x7F) == 0 && (local391.anInt5108 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local391.anInt5109 & 0x7F) == 64 && (local391.anInt5108 & 0x7F) == 64) {
						local72 = local391.anInt5109 + 64 - local391.method4318() * 64;
						local75 = local391.anInt5108 + 64 - local391.method4318() * 64;
						for (local84 = 0; local84 < Static5.anInt200; local84++) {
							@Pc(468) Class17_Sub1_Sub1_Sub2 local468 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local84]];
							if (local468 != null && local468.anInt4861 != Static5.anInt208 && local468.aBoolean473) {
								local491 = local468.anInt5109 - (local468.aClass213_1.anInt6509 - 1) * 64;
								local503 = local468.anInt5108 - (local468.aClass213_1.anInt6509 - 1) * 64;
								if (local72 <= local491 && local468.aClass213_1.anInt6509 <= local391.method4318() - (local491 - local72 >> 7) && local503 >= local75 && local468.aClass213_1.anInt6509 <= local391.method4318() - (local503 - local75 >> 7)) {
									Static202.method3830(local468);
									local468.anInt4861 = Static5.anInt208;
								}
							}
						}
						for (local93 = 0; local93 < Static357.anInt4331; local93++) {
							@Pc(562) Class17_Sub1_Sub1_Sub1 local562 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local93]];
							if (local562 != null && local562.anInt4861 != Static5.anInt208 && local562 != local391 && local562.aBoolean473) {
								local503 = local562.anInt5109 + 64 - local562.method4318() * 64;
								@Pc(600) int local600 = local562.anInt5108 + 64 - local562.method4318() * 64;
								if (local503 >= local72 && local562.method4318() <= local391.method4318() - (local503 - local72 >> 7) && local600 >= local75 && local562.method4318() <= local391.method4318() - (local600 - local75 >> 7)) {
									Static232.method4271(local562);
									local562.anInt4861 = Static5.anInt208;
								}
							}
						}
					}
					if (Static5.anInt208 == local391.anInt4861) {
						continue;
					}
					Static232.method4271(local391);
					local391.anInt4861 = Static5.anInt208;
				}
				if (local366.aClass17_1 instanceof Class17_Sub1_Sub1_Sub2) {
					@Pc(678) Class17_Sub1_Sub1_Sub2 local678 = (Class17_Sub1_Sub1_Sub2) local366.aClass17_1;
					if (local678.aClass213_1 != null) {
						if ((local678.aClass213_1.anInt6509 & 0x1) == 0 && (local678.anInt5109 & 0x7F) == 0 && (local678.anInt5108 & 0x7F) == 0 || (local678.aClass213_1.anInt6509 & 0x1) == 1 && (local678.anInt5109 & 0x7F) == 64 && (local678.anInt5108 & 0x7F) == 64) {
							local64 = local678.anInt5109 - (local678.aClass213_1.anInt6509 - 1) * 64;
							local72 = local678.anInt5108 - (local678.aClass213_1.anInt6509 - 1) * 64;
							for (local75 = 0; local75 < Static5.anInt200; local75++) {
								@Pc(757) Class17_Sub1_Sub1_Sub2 local757 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local75]];
								if (local757 != null && local757.anInt4861 != Static5.anInt208 && local678 != local757 && local757.aBoolean473) {
									local93 = local757.anInt5109 - (local757.aClass213_1.anInt6509 - 1) * 64;
									local491 = local757.anInt5108 + 64 - local757.aClass213_1.anInt6509 * 64;
									if (local64 <= local93 && local678.aClass213_1.anInt6509 - (local93 - local64 >> 7) >= local757.aClass213_1.anInt6509 && local72 <= local491 && local678.aClass213_1.anInt6509 - (local491 - local72 >> 7) >= local757.aClass213_1.anInt6509) {
										Static202.method3830(local757);
										local757.anInt4861 = Static5.anInt208;
									}
								}
							}
							for (local84 = 0; local84 < Static357.anInt4331; local84++) {
								@Pc(864) Class17_Sub1_Sub1_Sub1 local864 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local84]];
								if (local864 != null && Static5.anInt208 != local864.anInt4861 && local864.aBoolean473) {
									local491 = local864.anInt5109 - (local864.method4318() - 1) * 64;
									local503 = local864.anInt5108 - (local864.method4318() - 1) * 64;
									if (local491 >= local64 && local864.method4318() <= local678.aClass213_1.anInt6509 - (local491 - local64 >> 7) && local503 >= local72 && local864.method4318() <= local678.aClass213_1.anInt6509 - (local503 - local72 >> 7)) {
										Static232.method4271(local864);
										local864.anInt4861 = Static5.anInt208;
									}
								}
							}
						}
						if (Static5.anInt208 == local678.anInt4861) {
							continue;
						}
						Static202.method3830(local678);
						local678.anInt4861 = Static5.anInt208;
					}
				}
				if (local366.aClass17_1 instanceof Class17_Sub2_Sub1) {
					@Pc(996) Class1_Sub7 local996 = (Class1_Sub7) Static339.aClass197_30.method5157((long) (local366.anInt3436 << 14 | local366.anInt3438 << 28 | local366.anInt3442));
					if (local996 != null) {
						for (@Pc(1004) Class1_Sub40 local1004 = (Class1_Sub40) local996.aClass16_2.method420(); local1004 != null; local1004 = (Class1_Sub40) local996.aClass16_2.method409()) {
							@Pc(1011) Class111 local1011 = Static20.method561(local1004.anInt6580);
							if (Static91.aBoolean214) {
								@Pc(1152) Class1_Sub4_Sub15 local1152 = Static152.anInt4540 == -1 ? null : Static357.method3867(Static152.anInt4540);
								if ((Static257.anInt5340 & 0x1) != 0 && (local1152 == null || local1011.method2997(Static152.anInt4540, local1152.anInt3392) != local1152.anInt3392)) {
									Static58.method1506(Static175.anInt3793, Static281.aString56 + " -> <col=ff9040>" + local1011.aString30, local366.anInt3436, (long) local1004.anInt6580, Static24.aString15, local366.anInt3442, 6);
								}
							} else {
								@Pc(1016) String[] local1016 = local1011.aStringArray30;
								for (local84 = 4; local84 >= 0; local84--) {
									if (local1016 != null && local1016[local84] != null) {
										@Pc(1028) byte local1028 = 0;
										local491 = Static255.anInt5262;
										if (local84 == 0) {
											local1028 = 12;
										}
										if (local84 == 1) {
											local1028 = 11;
										}
										if (local84 == 2) {
											local1028 = 45;
										}
										if (local84 == 3) {
											local1028 = 47;
										}
										if (local1011.anInt3328 == local84) {
											local491 = local1011.anInt3289;
										}
										if (local84 == 4) {
											local1028 = 46;
										}
										if (local84 == local1011.anInt3308) {
											local491 = local1011.anInt3312;
										}
										Static58.method1506(local491, "<col=ff9040>" + local1011.aString30, local366.anInt3436, (long) local1004.anInt6580, local1016[local84], local366.anInt3442, local1028);
									}
								}
								Static58.method1506(Static351.anInt6706, "<col=ff9040>" + local1011.aString30, local366.anInt3436, (long) local1004.anInt6580, Static278.aClass34_157.method1285(Static259.anInt2907), local366.anInt3442, 1009);
							}
						}
					}
				}
				if (local366.aClass17_1 instanceof Interface5) {
					@Pc(1213) Interface5 local1213 = (Interface5) local366.aClass17_1;
					@Pc(1219) Class141 local1219 = Static119.method2548(local1213.method4799());
					if (local1219.anIntArray391 != null) {
						local1219 = local1219.method3833();
					}
					if (local1219 != null) {
						if (Static91.aBoolean214) {
							@Pc(1241) Class1_Sub4_Sub15 local1241 = Static152.anInt4540 == -1 ? null : Static357.method3867(Static152.anInt4540);
							if ((Static257.anInt5340 & 0x4) != 0 && (local1241 == null || local1219.method3839(local1241.anInt3392, Static152.anInt4540) != local1241.anInt3392)) {
								Static58.method1506(Static175.anInt3793, Static281.aString56 + " -> <col=00ffff>" + local1219.aString38, local366.anInt3436, Static121.method2560(local366.anInt3442, local1213, local366.anInt3436), Static24.aString15, local366.anInt3442, 44);
							}
						} else {
							@Pc(1299) String[] local1299 = local1219.aStringArray45;
							if (local1299 != null) {
								for (local75 = 4; local75 >= 0; local75--) {
									if (local1299[local75] != null) {
										@Pc(1311) short local1311 = 0;
										local93 = Static255.anInt5262;
										if (local75 == 0) {
											local1311 = 3;
										}
										if (local75 == 1) {
											local1311 = 9;
										}
										if (local75 == 2) {
											local1311 = 51;
										}
										if (local75 == 3) {
											local1311 = 17;
										}
										if (local75 == local1219.anInt4300) {
											local93 = local1219.anInt4289;
										}
										if (local75 == 4) {
											local1311 = 1002;
										}
										if (local75 == local1219.anInt4295) {
											local93 = local1219.anInt4265;
										}
										Static58.method1506(local93, "<col=00ffff>" + local1219.aString38, local366.anInt3436, Static121.method2560(local366.anInt3442, local1213, local366.anInt3436), local1299[local75], local366.anInt3442, local1311);
									}
								}
							}
							Static58.method1506(Static351.anInt6706, "<col=00ffff>" + local1219.aString38, local366.anInt3436, (long) local1219.anInt4281, Static278.aClass34_157.method1285(Static259.anInt2907), local366.anInt3442, 1011);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIIIII)V")
	public static void method2780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(14) int local14 = arg1 + arg2;
		for (@Pc(27) int local27 = arg2; local27 < local14; local27++) {
			Static39.method919(arg3, Static344.anIntArrayArray65[local27], arg5, arg0);
		}
		for (@Pc(49) int local49 = arg4; local49 > local10; local49--) {
			Static39.method919(arg3, Static344.anIntArrayArray65[local49], arg5, arg0);
		}
		@Pc(73) int local73 = arg1 + arg0;
		@Pc(78) int local78 = arg5 - arg1;
		for (@Pc(80) int local80 = local14; local80 <= local10; local80++) {
			@Pc(86) int[] local86 = Static344.anIntArrayArray65[local80];
			Static39.method919(arg3, local86, local73, arg0);
			Static39.method919(arg3, local86, arg5, local78);
		}
	}
}
