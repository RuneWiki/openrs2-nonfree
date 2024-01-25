import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
	public static int anInt5150;

	@OriginalMember(owner = "client!jja", name = "d", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_85 = new Class322(61, -2);

	@OriginalMember(owner = "client!jja", name = "h", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_8 = new Class221(13, 7);

	@OriginalMember(owner = "client!jja", name = "g", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jja", name = "c", descriptor = "I")
	public static int anInt5151 = 0;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
	public static void method4705() {
		@Pc(7) Class320 local7 = null;
		try {
			local7 = Static174.method3358("2");
			@Pc(25) Class6_Sub15 local25 = new Class6_Sub15(Static684.anInt10456 * 6 + 3);
			local25.method3016(1);
			local25.method3040(Static684.anInt10456);
			for (@Pc(35) int local35 = 0; local35 < Static333.anIntArray333.length; local35++) {
				if (Static371.aBooleanArray19[local35]) {
					local25.method3040(local35);
					local25.method3029(Static333.anIntArray333[local35]);
				}
			}
			local7.method7688(local25.anInt3174, local25.aByteArray20, 0);
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method7693();
			}
		} catch (@Pc(85) Exception local85) {
		}
		Static478.aLong260 = Static549.method7758();
		Static269.aBoolean380 = false;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!ob;B)Z")
	public static boolean method4707(@OriginalArg(0) Class260 arg0) throws IOException {
		@Pc(8) Class141 local8 = arg0.aClass141_1;
		@Pc(11) Class6_Sub15_Sub1 local11 = arg0.aClass6_Sub15_Sub1_2;
		if (local8 == null) {
			return false;
		}
		@Pc(102) int local102;
		if (arg0.aClass322_128 == null) {
			if (arg0.aBoolean539) {
				if (!local8.method7613(1)) {
					return false;
				}
				local8.method7610(0, 1, arg0.aClass6_Sub15_Sub1_2.aByteArray20);
				arg0.aBoolean539 = false;
				arg0.anInt7202++;
				arg0.anInt7199 = 0;
			}
			local11.anInt3174 = 0;
			if (local11.method2476()) {
				if (!local8.method7613(1)) {
					return false;
				}
				local8.method7610(1, 1, arg0.aClass6_Sub15_Sub1_2.aByteArray20);
				arg0.anInt7199 = 0;
				arg0.anInt7202++;
			}
			arg0.aBoolean539 = true;
			@Pc(98) Class322[] local98 = Static207.method3819();
			local102 = local11.method2475();
			if (local102 < 0 || local102 >= local98.length) {
				throw new IOException("invo:" + local102 + " ip:" + local11.anInt3174);
			}
			arg0.aClass322_128 = local98[local102];
			arg0.anInt7198 = arg0.aClass322_128.anInt8818;
		}
		if (arg0.anInt7198 == -1) {
			if (!local8.method7613(1)) {
				return false;
			}
			local8.method7610(0, 1, local11.aByteArray20);
			arg0.anInt7202++;
			arg0.anInt7199 = 0;
			arg0.anInt7198 = local11.aByteArray20[0] & 0xFF;
		}
		if (arg0.anInt7198 == -2) {
			if (!local8.method7613(2)) {
				return false;
			}
			local8.method7610(0, 2, local11.aByteArray20);
			local11.anInt3174 = 0;
			arg0.anInt7198 = local11.method3018();
			arg0.anInt7202 += 2;
			arg0.anInt7199 = 0;
		}
		if (arg0.anInt7198 > 0) {
			if (!local8.method7613(arg0.anInt7198)) {
				return false;
			}
			local11.anInt3174 = 0;
			local8.method7610(0, arg0.anInt7198, local11.aByteArray20);
			arg0.anInt7199 = 0;
			arg0.anInt7202 += arg0.anInt7198;
		}
		arg0.aClass322_129 = arg0.aClass322_126;
		arg0.aClass322_126 = arg0.aClass322_127;
		arg0.aClass322_127 = arg0.aClass322_128;
		@Pc(314) int local314;
		@Pc(335) int local335;
		@Pc(344) int local344;
		@Pc(351) int local351;
		@Pc(382) int local382;
		@Pc(615) int local615;
		@Pc(290) int local290;
		@Pc(298) int local298;
		@Pc(302) int local302;
		@Pc(306) int local306;
		@Pc(310) int local310;
		@Pc(320) int local320;
		@Pc(376) int local376;
		@Pc(475) boolean local475;
		@Pc(665) boolean local665;
		@Pc(384) int local384;
		if (arg0.aClass322_128 == Static635.aClass322_183) {
			local290 = local11.method3021();
			local102 = local11.method3022();
			local298 = local11.method3018();
			local302 = local11.method3018();
			local306 = local11.method3048();
			local310 = local11.method3034();
			local314 = local310 & 0x7;
			local320 = local310 >> 3 & 0xF;
			if (local320 == 15) {
				local320 = -1;
			}
			if (local102 >> 30 == 0) {
				@Pc(569) Class212 local569;
				@Pc(575) Class212 local575;
				@Pc(552) Class17 local552;
				@Pc(517) int local517;
				if (local102 >> 29 != 0) {
					local335 = local102 & 0xFFFF;
					@Pc(646) Class6_Sub11 local646 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local335);
					if (local646 != null) {
						@Pc(651) Class60_Sub1_Sub1_Sub3_Sub2 local651 = local646.aClass60_Sub1_Sub1_Sub3_Sub2_1;
						if (local302 == 65535) {
							local302 = -1;
						}
						@Pc(663) Class40 local663 = local651.aClass40Array3[local290];
						local665 = true;
						local384 = local663.anInt571;
						if (local302 != -1 && local384 != -1) {
							if (local302 == local384) {
								local552 = Static655.aClass172_2.method4449(local302);
								if (local552.aBoolean21 && local552.anInt251 != -1) {
									local569 = Static444.aClass68_3.method1286(local552.anInt251);
									@Pc(710) int local710 = local569.anInt5520;
									if (local710 == 0 || local710 == 2) {
										local665 = false;
									} else if (local710 == 1) {
										local665 = true;
									}
								}
							} else {
								local552 = Static655.aClass172_2.method4449(local302);
								@Pc(745) Class17 local745 = Static655.aClass172_2.method4449(local384);
								if (local552.anInt251 != -1 && local745.anInt251 != -1) {
									local575 = Static444.aClass68_3.method1286(local552.anInt251);
									@Pc(767) Class212 local767 = Static444.aClass68_3.method1286(local745.anInt251);
									if (local767.anInt5523 > local575.anInt5523) {
										local665 = false;
									}
								}
							}
						}
						if (local665) {
							local663.anInt574 = local298;
							local663.anInt571 = local302;
							local663.anInt573 = local320;
							if (local302 == -1) {
								local663.aClass104_1.method9035(-1);
							} else {
								local552 = Static655.aClass172_2.method4449(local302);
								local517 = local552.aBoolean21 ? 0 : 2;
								local663.aClass104_1.method9042(local552.anInt251, local517, false, local306);
							}
						}
					}
				} else if (local102 >> 28 != 0) {
					local335 = local102 & 0xFFFF;
					@Pc(455) Class60_Sub1_Sub1_Sub3_Sub1 local455;
					if (local335 == Static503.anInt8407) {
						local455 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1;
					} else {
						local455 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local335];
					}
					if (local455 != null) {
						@Pc(468) Class40 local468 = local455.aClass40Array3[local290];
						if (local302 == 65535) {
							local302 = -1;
						}
						local475 = true;
						local382 = local468.anInt571;
						@Pc(498) Class17 local498;
						if (local302 != -1 && local382 != -1) {
							if (local382 == local302) {
								local498 = Static655.aClass172_2.method4449(local302);
								if (local498.aBoolean21 && local498.anInt251 != -1) {
									@Pc(514) Class212 local514 = Static444.aClass68_3.method1286(local498.anInt251);
									local517 = local514.anInt5520;
									if (local517 == 0 || local517 == 2) {
										local475 = false;
									} else if (local517 == 1) {
										local475 = true;
									}
								}
							} else {
								local498 = Static655.aClass172_2.method4449(local302);
								local552 = Static655.aClass172_2.method4449(local382);
								if (local498.anInt251 != -1 && local552.anInt251 != -1) {
									local569 = Static444.aClass68_3.method1286(local498.anInt251);
									local575 = Static444.aClass68_3.method1286(local552.anInt251);
									if (local575.anInt5523 > local569.anInt5523) {
										local475 = false;
									}
								}
							}
						}
						if (local475) {
							local468.anInt573 = local320;
							local468.anInt574 = local298;
							local468.anInt571 = local302;
							local468.anInt575 = local314;
							if (local302 == -1) {
								local468.aClass104_1.method9035(-1);
							} else {
								local498 = Static655.aClass172_2.method4449(local302);
								local615 = local498.aBoolean21 ? 0 : 2;
								local468.aClass104_1.method9042(local498.anInt251, local615, false, local306);
							}
						}
					}
				}
			} else {
				local335 = local102 >> 28 & 0x3;
				local344 = (local102 >> 14 & 0x3FFF) - Static50.anInt606;
				local351 = (local102 & 0x3FFF) - Static404.anInt7039;
				if (local344 >= 0 && local351 >= 0 && Static29.anInt380 > local344 && local351 < Static327.anInt5650) {
					local376 = local344 * 512 + 256;
					local382 = local351 * 512 + 256;
					local384 = local335;
					if (local335 < 3 && Static180.method3417(1, local344, local351)) {
						local384 = local335 + 1;
					}
					@Pc(422) Class60_Sub1_Sub1_Sub2 local422 = new Class60_Sub1_Sub1_Sub2(local302, local306, local335, local384, local376, Static248.method4318(local382, local335, local376) - local298, local382, local344, local344, local351, local351, local314, false);
					Static276.aClass340_37.method8131(new Class6_Sub2_Sub13(local422));
				}
			}
			arg0.aClass322_128 = null;
			return true;
		} else if (Static145.aClass322_47 == arg0.aClass322_128) {
			local290 = local11.method3018();
			Static42.method537();
			Static277.method4643(local290);
			arg0.aClass322_128 = null;
			return true;
		} else {
			@Pc(870) boolean local870;
			if (Static66.aClass322_22 == arg0.aClass322_128) {
				local290 = local11.method3018();
				local102 = local11.method3030();
				local870 = (local102 & 0x1) == 1;
				while (local11.anInt3174 < arg0.anInt7198) {
					local302 = local11.method2992();
					local306 = local11.method3018();
					local310 = 0;
					if (local306 != 0) {
						local310 = local11.method3030();
						if (local310 == 255) {
							local310 = local11.method3015();
						}
					}
					Static669.method8872(local306 - 1, local870, local310, local302, local290);
				}
				Static257.anIntArray268[Static674.anInt10346++ & 0x1F] = local290;
				arg0.aClass322_128 = null;
				return true;
			} else if (Static257.aClass322_80 == arg0.aClass322_128) {
				local290 = local11.method3018();
				local102 = local11.method3030();
				local870 = (local102 & 0x1) == 1;
				Static635.method8595(local870, local290);
				local302 = local11.method3018();
				for (local306 = 0; local306 < local302; local306++) {
					local310 = local11.method3021();
					if (local310 == 255) {
						local310 = local11.method3051();
					}
					local314 = local11.method3018();
					Static669.method8872(local314 - 1, local870, local310, local306, local290);
				}
				Static257.anIntArray268[Static674.anInt10346++ & 0x1F] = local290;
				arg0.aClass322_128 = null;
				return true;
			} else if (arg0.aClass322_128 == Static122.aClass322_41) {
				arg0.aClass322_128 = null;
				return false;
			} else {
				@Pc(1065) String local1065;
				if (Static326.aClass322_101 == arg0.aClass322_128) {
					local290 = local11.method3030();
					local102 = local11.method3005();
					if (local102 == 65535) {
						local102 = -1;
					}
					local298 = local11.method3036();
					local1065 = local11.method3046();
					if (local298 >= 1 && local298 <= 8) {
						if (local1065.equalsIgnoreCase("null")) {
							local1065 = null;
						}
						Static130.aStringArray10[local298 - 1] = local1065;
						Static128.anIntArray131[local298 - 1] = local102;
						Static581.aBooleanArray28[local298 - 1] = local290 == 0;
					}
					arg0.aClass322_128 = null;
					return true;
				} else if (arg0.aClass322_128 == Static300.aClass322_157) {
					local290 = local11.method3032();
					Static42.method537();
					arg0.aClass322_128 = null;
					if (local290 == -1) {
						Static16.anInt232 = -1;
						Static126.anInt2529 = -1;
					} else {
						local102 = local290 >> 14 & 0x3FFF;
						local102 -= Static50.anInt606;
						local298 = local290 & 0x3FFF;
						if (local102 < 0) {
							local102 = 0;
						} else if (Static29.anInt380 <= local102) {
							local102 = Static29.anInt380;
						}
						local298 -= Static404.anInt7039;
						if (local298 < 0) {
							local298 = 0;
						} else if (local298 >= Static327.anInt5650) {
							local298 = Static327.anInt5650;
						}
						Static126.anInt2529 = (local102 << 9) + 256;
						Static16.anInt232 = (local298 << 9) + 256;
					}
					return true;
				} else {
					@Pc(1245) long local1245;
					@Pc(1223) boolean local1223;
					@Pc(1227) String local1227;
					@Pc(1229) String local1229;
					@Pc(1240) long local1240;
					@Pc(1256) long local1256;
					@Pc(1258) boolean local1258;
					@Pc(1344) String local1344;
					if (arg0.aClass322_128 == Static644.aClass322_188) {
						local1223 = local11.method3030() == 1;
						local1227 = local11.method3046();
						local1229 = local1227;
						if (local1223) {
							local1229 = local11.method3046();
						}
						local1240 = (long) local11.method3018();
						local1245 = (long) local11.method2987();
						local320 = local11.method3030();
						local1256 = (local1240 << 32) + local1245;
						local1258 = false;
						local376 = 0;
						while (true) {
							if (local376 >= 100) {
								if (local320 <= 1) {
									if (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714) {
										local1258 = true;
									} else if (Static446.method6903(local1229)) {
										local1258 = true;
									}
								}
								break;
							}
							if (Static253.aLongArray7[local376] == local1256) {
								local1258 = true;
								break;
							}
							local376++;
						}
						if (!local1258 && Static225.anInt4393 == 0) {
							Static253.aLongArray7[Static415.anInt7192] = local1256;
							Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
							local1344 = Static491.method7288(Static122.method2208(local11), (byte) -123);
							if (local320 == 2) {
								Static601.method8306(local1227, 7, "<img=1>" + local1229, local1344, (String) null, "<img=1>" + local1227, -1, 0);
							} else if (local320 == 1) {
								Static601.method8306(local1227, 7, "<img=0>" + local1229, local1344, (String) null, "<img=0>" + local1227, -1, 0);
							} else {
								Static601.method8306(local1227, 3, local1229, local1344, (String) null, local1227, -1, 0);
							}
						}
						arg0.aClass322_128 = null;
						return true;
					} else if (Static575.aClass322_179 == arg0.aClass322_128) {
						Static140.anInt2884 = Static633.anInt8242;
						local1223 = local11.method3030() == 1;
						@Pc(1454) Class374 local1454 = new Class374(local11);
						@Pc(1458) Class6_Sub29 local1458;
						if (local1223) {
							local1458 = Static488.aClass6_Sub29_3;
						} else {
							local1458 = Static99.aClass6_Sub29_1;
						}
						local1454.method8645(local1458);
						arg0.aClass322_128 = null;
						return true;
					} else if (Static272.aClass322_26 == arg0.aClass322_128) {
						Static23.method259(Static354.aClass221_13);
						arg0.aClass322_128 = null;
						return true;
					} else if (Static676.aClass322_202 == arg0.aClass322_128) {
						local290 = local11.method3051();
						Static42.method537();
						@Pc(1504) Class6_Sub25 local1504 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local290);
						if (local1504 != null) {
							Static133.method2562(local1504, true, false);
						}
						if (Static339.aClass381_8 != null) {
							Static168.method3312(Static339.aClass381_8);
							Static339.aClass381_8 = null;
						}
						arg0.aClass322_128 = null;
						return true;
					} else if (Static48.aClass322_121 == arg0.aClass322_128) {
						local290 = local11.method3015();
						local102 = local11.method3003();
						Static42.method537();
						Static182.method3447(local290, local102);
						arg0.aClass322_128 = null;
						return true;
					} else if (arg0.aClass322_128 == Static395.aClass322_122) {
						Class60_Sub1_Sub5_Sub2.lb = local11.method3030();
						Static535.anInt4139 = local11.method3021();
						arg0.aClass322_128 = null;
						return true;
					} else if (Static295.aClass322_89 == arg0.aClass322_128) {
						Static303.aClass55_2.method944();
						arg0.aClass322_128 = null;
						Static521.anInt9056 += 32;
						return true;
					} else if (Static446.aClass322_137 == arg0.aClass322_128) {
						local290 = local11.method3018();
						if (local290 == 65535) {
							local290 = -1;
						}
						local102 = local11.method3030();
						local298 = local11.method3018();
						local302 = local11.method3030();
						Static503.method7340(local298, true, local290, local102, 256, local302);
						arg0.aClass322_128 = null;
						return true;
					} else if (Static55.aClass322_96 == arg0.aClass322_128) {
						local290 = local11.method3036();
						local102 = local11.method3005();
						Static303.aClass55_2.method945(local290, local102);
						arg0.aClass322_128 = null;
						return true;
					} else if (Static486.aClass322_150 == arg0.aClass322_128) {
						Static23.method259(aClass221_8);
						arg0.aClass322_128 = null;
						return true;
					} else {
						@Pc(1999) String local1999;
						@Pc(1706) String local1706;
						@Pc(2035) String local2035;
						@Pc(1708) boolean local1708;
						if (arg0.aClass322_128 == Static641.aClass322_186) {
							@Pc(1771) boolean local1771;
							while (local11.anInt3174 < arg0.anInt7198) {
								local1223 = local11.method3030() == 1;
								local1227 = local11.method3046();
								local1229 = local11.method3046();
								local302 = local11.method3018();
								local306 = local11.method3030();
								local1706 = "";
								local1708 = false;
								if (local302 > 0) {
									local1706 = local11.method3046();
									local1708 = local11.method3030() == 1;
								}
								for (local320 = 0; local320 < Static265.anInt5023; local320++) {
									if (local1223) {
										if (local1229.equals(Static35.aStringArray5[local320])) {
											Static35.aStringArray5[local320] = local1227;
											local1227 = null;
											Static665.aStringArray45[local320] = local1229;
											break;
										}
									} else if (local1227.equals(Static35.aStringArray5[local320])) {
										if (Static241.anIntArray241[local320] != local302) {
											local1771 = true;
											for (@Pc(1776) Class60_Sub2_Sub2 local1776 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8778(); local1776 != null; local1776 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8773()) {
												if (local1776.aString90.equals(local1227)) {
													if (local302 != 0 && local1776.aShort95 == 0) {
														local1776.method8914();
														local1771 = false;
													} else if (local302 == 0 && local1776.aShort95 != 0) {
														local1776.method8914();
														local1771 = false;
													}
												}
											}
											if (local1771) {
												Static555.aClass385_9.method8779(new Class60_Sub2_Sub2(local1227, local302));
											}
											Static241.anIntArray241[local320] = local302;
										}
										Static665.aStringArray45[local320] = local1229;
										Static626.aStringArray41[local320] = local1706;
										Static609.anIntArray626[local320] = local306;
										Static665.aBooleanArray31[local320] = local1708;
										local1227 = null;
										break;
									}
								}
								if (local1227 != null && Static265.anInt5023 < 200) {
									Static35.aStringArray5[Static265.anInt5023] = local1227;
									Static665.aStringArray45[Static265.anInt5023] = local1229;
									Static241.anIntArray241[Static265.anInt5023] = local302;
									Static626.aStringArray41[Static265.anInt5023] = local1706;
									Static609.anIntArray626[Static265.anInt5023] = local306;
									Static665.aBooleanArray31[Static265.anInt5023] = local1708;
									Static265.anInt5023++;
								}
							}
							Static535.anInt4136 = Static633.anInt8242;
							Static191.anInt3933 = 2;
							local102 = Static265.anInt5023;
							while (local102 > 0) {
								local1223 = true;
								local102--;
								for (local298 = 0; local298 < local102; local298++) {
									if (Static241.anIntArray241[local298] != Static82.aClass165_2.anInt4607 && Static82.aClass165_2.anInt4607 == Static241.anIntArray241[local298 + 1] || Static241.anIntArray241[local298] == 0 && Static241.anIntArray241[local298 + 1] != 0) {
										local302 = Static241.anIntArray241[local298];
										Static241.anIntArray241[local298] = Static241.anIntArray241[local298 + 1];
										Static241.anIntArray241[local298 + 1] = local302;
										local1999 = Static626.aStringArray41[local298];
										Static626.aStringArray41[local298] = Static626.aStringArray41[local298 + 1];
										Static626.aStringArray41[local298 + 1] = local1999;
										local1706 = Static35.aStringArray5[local298];
										Static35.aStringArray5[local298] = Static35.aStringArray5[local298 + 1];
										Static35.aStringArray5[local298 + 1] = local1706;
										local2035 = Static665.aStringArray45[local298];
										Static665.aStringArray45[local298] = Static665.aStringArray45[local298 + 1];
										Static665.aStringArray45[local298 + 1] = local2035;
										local320 = Static609.anIntArray626[local298];
										Static609.anIntArray626[local298] = Static609.anIntArray626[local298 + 1];
										Static609.anIntArray626[local298 + 1] = local320;
										local1771 = Static665.aBooleanArray31[local298];
										Static665.aBooleanArray31[local298] = Static665.aBooleanArray31[local298 + 1];
										local1223 = false;
										Static665.aBooleanArray31[local298 + 1] = local1771;
									}
								}
								if (local1223) {
									break;
								}
							}
							arg0.aClass322_128 = null;
							return true;
						} else if (Static479.aClass322_144 == arg0.aClass322_128) {
							local290 = local11.method3034();
							Static42.method537();
							arg0.aClass322_128 = null;
							Static679.anInt6106 = local290;
							return true;
						} else if (Static672.aClass322_200 == arg0.aClass322_128) {
							Static23.method259(Static8.aClass221_1);
							arg0.aClass322_128 = null;
							return true;
						} else if (Static603.aClass322_178 == arg0.aClass322_128) {
							local290 = local11.method3034();
							local102 = local290 >> 2;
							local298 = local290 & 0x3;
							local302 = Static49.anIntArray45[local102];
							local306 = local11.method3042();
							if (local306 == 65535) {
								local306 = -1;
							}
							local310 = local11.method3051();
							local314 = local310 >> 28 & 0x3;
							local320 = local310 >> 14 & 0x3FFF;
							local335 = local310 & 0x3FFF;
							local320 -= Static50.anInt606;
							local335 -= Static404.anInt7039;
							Static71.method942(local320, local306, local314, local102, local302, local335, local298);
							arg0.aClass322_128 = null;
							return true;
						} else if (arg0.aClass322_128 == Static59.aClass322_20) {
							local290 = local11.method3015();
							local102 = local11.method3048();
							Static42.method537();
							if (local102 == 65535) {
								local102 = -1;
							}
							Static33.method443(local290, local102);
							arg0.aClass322_128 = null;
							return true;
						} else if (arg0.aClass322_128 == Static638.aClass322_185) {
							@Pc(2263) int[] local2263 = new int[4];
							for (local102 = 0; local102 < 4; local102++) {
								local2263[local102] = local11.method3018();
							}
							local298 = local11.method3036();
							local302 = local11.method3048();
							@Pc(2296) Class6_Sub11 local2296 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local302);
							if (local2296 != null) {
								Static365.method5544(local2263, local2296.aClass60_Sub1_Sub1_Sub3_Sub2_1, local298, true);
							}
							arg0.aClass322_128 = null;
							return true;
						} else if (arg0.aClass322_128 == Static265.aClass322_83) {
							Static58.aByte9 = local11.method3014();
							if (Static58.aByte9 == 0 || Static58.aByte9 == 1) {
								Static434.aBoolean553 = true;
							}
							arg0.aClass322_128 = null;
							return true;
						} else if (arg0.aClass322_128 == Static387.aClass322_118) {
							local290 = local11.method3036();
							local102 = local11.method3036();
							if (local102 == 255) {
								local290 = -1;
								local102 = -1;
							}
							Static320.method5032(local102, local290);
							arg0.aClass322_128 = null;
							return true;
						} else if (arg0.aClass322_128 == Static315.aClass322_95) {
							Static188.aClass267_2 = Static483.method7190(local11.method3030());
							arg0.aClass322_128 = null;
							return true;
						} else {
							@Pc(2452) boolean local2452;
							@Pc(2442) boolean local2442;
							if (Static233.aClass322_69 == arg0.aClass322_128) {
								local290 = local11.method3018();
								@Pc(2410) Class60_Sub1_Sub1_Sub3_Sub1 local2410;
								if (local290 == Static503.anInt8407) {
									local2410 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1;
								} else {
									local2410 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local290];
								}
								if (local2410 == null) {
									arg0.aClass322_128 = null;
									return true;
								}
								local298 = local11.method3018();
								local302 = local11.method3030();
								local2442 = (local298 & 0x8000) != 0;
								if (local2410.aString23 != null && local2410.aClass73_1 != null) {
									local2452 = false;
									if (local302 <= 1) {
										if (!local2442 && (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714)) {
											local2452 = true;
										} else if (Static446.method6903(local2410.aString23)) {
											local2452 = true;
										}
									}
									if (!local2452 && Static225.anInt4393 == 0) {
										local320 = -1;
										if (local2442) {
											local298 &= 0x7FFF;
											@Pc(2502) Class39 local2502 = Static461.method7019(local11);
											local320 = local2502.anInt552;
											local2035 = local2502.aClass6_Sub2_Sub20_1.method8372(local11);
										} else {
											local2035 = Static491.method7288(Static122.method2208(local11), (byte) -124);
										}
										local2410.aString50 = local2035.trim();
										local2410.anInt4848 = local298 >> 8;
										local2410.anInt4860 = 150;
										local2410.anInt4826 = local298 & 0xFF;
										if (local302 == 1 || local302 == 2) {
											local335 = local2442 ? 17 : 1;
										} else {
											local335 = local2442 ? 17 : 2;
										}
										if (local302 == 2) {
											Static601.method8306(local2410.aString24, local335, "<img=1>" + local2410.method2703(), local2035, (String) null, "<img=1>" + local2410.method2701(), local320, 0);
										} else if (local302 == 1) {
											Static601.method8306(local2410.aString24, local335, "<img=0>" + local2410.method2703(), local2035, (String) null, "<img=0>" + local2410.method2701(), local320, 0);
										} else {
											Static601.method8306(local2410.aString24, local335, local2410.method2703(), local2035, (String) null, local2410.method2701(), local320, 0);
										}
									}
								}
								arg0.aClass322_128 = null;
								return true;
							} else if (arg0.aClass322_128 == Static30.aClass322_7) {
								local290 = local11.method3048();
								local102 = local11.method3030();
								Static42.method537();
								if (local102 == 2) {
									Static643.method3511();
								}
								Static635.anInt9910 = local290;
								Static276.method4638(local290);
								Static623.method8541(false);
								Static301.method4834(Static635.anInt9910);
								for (local298 = 0; local298 < 100; local298++) {
									Static72.aBooleanArray5[local298] = true;
								}
								arg0.aClass322_128 = null;
								return true;
							} else if (arg0.aClass322_128 == Static139.aClass322_44) {
								Static216.method3962();
								arg0.aClass322_128 = null;
								return false;
							} else if (Static270.aClass322_84 == arg0.aClass322_128) {
								local290 = local11.method3022();
								local102 = local11.method3005();
								Static42.method537();
								Static391.method5998(local290, local102);
								arg0.aClass322_128 = null;
								return true;
							} else {
								@Pc(2781) byte local2781;
								if (Static95.aClass322_35 == arg0.aClass322_128) {
									local2781 = local11.method3033();
									local102 = local11.method3021();
									Static42.method537();
									Static426.method8705(local2781, local102);
									arg0.aClass322_128 = null;
									return true;
								} else if (arg0.aClass322_128 == Static248.aClass322_77) {
									local290 = local11.method3015();
									Static42.method537();
									Static358.method5445(local290, 5, Static503.anInt8407, 0);
									arg0.aClass322_128 = null;
									return true;
								} else if (arg0.aClass322_128 == Static45.aClass322_14) {
									Static170.method3326();
									arg0.aClass322_128 = null;
									return true;
								} else if (arg0.aClass322_128 == Static106.aClass322_37) {
									local290 = local11.method2992();
									local102 = local11.method3015();
									local298 = local11.method3030();
									local1065 = "";
									local1999 = local1065;
									if ((local298 & 0x1) != 0) {
										local1065 = local11.method3046();
										if ((local298 & 0x2) == 0) {
											local1999 = local1065;
										} else {
											local1999 = local11.method3046();
										}
									}
									local1706 = local11.method3046();
									if (local290 == 99) {
										Static655.method8761(local1706);
									} else if (local290 == 98) {
										Static176.method3368(local1706);
									} else if (local1999.equals("") || !Static446.method6903(local1999)) {
										Static14.method193(local1065, local1065, local1999, local102, local1706, local290);
									} else {
										arg0.aClass322_128 = null;
										return true;
									}
									arg0.aClass322_128 = null;
									return true;
								} else if (arg0.aClass322_128 == Static324.aClass322_100) {
									local290 = local11.method3018();
									local102 = local11.method3018();
									Static42.method537();
									Static75.method1017(local102, local290);
									arg0.aClass322_128 = null;
									return true;
								} else if (arg0.aClass322_128 == Static638.aClass322_184) {
									Static187.aBoolean315 = local11.method3030() == 1;
									arg0.aClass322_128 = null;
									return true;
								} else if (Static43.aClass322_13 == arg0.aClass322_128) {
									Static23.method259(Static560.aClass221_19);
									arg0.aClass322_128 = null;
									return true;
								} else {
									@Pc(3005) String local3005;
									if (Static141.aClass322_162 == arg0.aClass322_128) {
										local3005 = local11.method3046();
										local1227 = Static491.method7288(Static122.method2208(local11), (byte) -77);
										Static14.method193(local3005, local3005, local3005, 0, local1227, 6);
										arg0.aClass322_128 = null;
										return true;
									} else if (arg0.aClass322_128 == Static120.aClass322_40) {
										local290 = local11.method3018();
										if (local290 == 65535) {
											local290 = -1;
										}
										local102 = local11.method3030();
										local298 = local11.method3018();
										local302 = local11.method3030();
										local306 = local11.method3018();
										Static503.method7340(local298, false, local290, local102, local306, local302);
										arg0.aClass322_128 = null;
										return true;
									} else if (arg0.aClass322_128 == Static370.aClass322_53) {
										local1223 = local11.method3021() == 1;
										Static42.method537();
										arg0.aClass322_128 = null;
										Static438.aBoolean554 = local1223;
										return true;
									} else {
										@Pc(3110) long local3110;
										if (Static381.aClass322_115 == arg0.aClass322_128) {
											local290 = local11.method3018();
											local3110 = local11.method3049();
											if (Static64.anObjectArray1 == null) {
												Static64.anObjectArray1 = new Object[Static582.aClass367_1.anInt9877];
											}
											Static64.anObjectArray1[local290] = Long.valueOf(local3110);
											Static209.anIntArray215[Static331.anInt8307++ & 0x1F] = local290;
											arg0.aClass322_128 = null;
											return true;
										} else if (Static237.aClass322_73 == arg0.aClass322_128) {
											local290 = local11.method3048();
											local102 = local11.method3022();
											local298 = local11.method3018();
											local302 = local11.method3018();
											Static42.method537();
											Static358.method5445(local102, 7, local298 | local302 << 16, local290);
											arg0.aClass322_128 = null;
											return true;
										} else if (Static659.aClass322_193 == arg0.aClass322_128) {
											Static166.method3296(Static624.aBoolean726);
											arg0.aClass322_128 = null;
											return false;
										} else if (Static363.aClass322_110 == arg0.aClass322_128) {
											local290 = local11.method3042();
											if (local290 == 65535) {
												local290 = -1;
											}
											local102 = local11.method3022();
											local298 = local11.method3022();
											Static42.method537();
											Static469.method7073(local290, local298, local102);
											@Pc(3225) Class282 local3225 = Static149.aClass244_1.method5958(local290);
											Static350.method5368(local3225.anInt7920, local3225.anInt7901, local298, local3225.anInt7937);
											Static209.method3839(local3225.anInt7930, local3225.anInt7913, local3225.anInt7886, local298);
											arg0.aClass322_128 = null;
											return true;
										} else if (arg0.aClass322_128 == Static389.aClass322_196) {
											local290 = local11.method3005();
											local102 = local11.method3051();
											Static303.aClass55_2.method943(local290, local102);
											arg0.aClass322_128 = null;
											return true;
										} else if (Static288.aClass322_87 == arg0.aClass322_128) {
											Static23.method259(Static160.aClass221_5);
											arg0.aClass322_128 = null;
											return true;
										} else if (Static667.aClass322_198 == arg0.aClass322_128) {
											local290 = local11.method3018();
											local102 = local11.method3030();
											local870 = (local102 & 0x1) == 1;
											Static479.method7156(local870, local290);
											Static257.anIntArray268[Static674.anInt10346++ & 0x1F] = local290;
											arg0.aClass322_128 = null;
											return true;
										} else if (Static485.aClass322_149 == arg0.aClass322_128) {
											local290 = local11.method3022();
											local102 = local11.method3051();
											local298 = local11.method3018();
											Static42.method537();
											Static358.method5445(local102, 5, local298, local290);
											arg0.aClass322_128 = null;
											return true;
										} else if (Static633.aClass322_148 == arg0.aClass322_128) {
											local290 = local11.method3032();
											if (local290 != Static99.anInt1944) {
												Static99.anInt1944 = local290;
												Static301.method4845(Static379.aClass275_12, -1, -1);
											}
											arg0.aClass322_128 = null;
											return true;
										} else if (arg0.aClass322_128 == Static38.aClass322_12) {
											local290 = local11.method3034();
											local102 = local11.method3018();
											local298 = local11.method3051();
											local302 = local11.method3018();
											Static42.method537();
											Static336.method5187(local298, local102, local302, local290);
											arg0.aClass322_128 = null;
											return true;
										} else {
											@Pc(3438) byte local3438;
											if (Static159.aClass322_49 == arg0.aClass322_128) {
												local290 = local11.method3005();
												local3438 = local11.method2990();
												Static303.aClass55_2.method943(local290, local3438);
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static307.aClass322_94) {
												Static23.method259(Static144.aClass221_16);
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static255.aClass322_79) {
												Static23.method259(Static168.aClass221_6);
												arg0.aClass322_128 = null;
												return true;
											} else if (Static386.aClass322_117 == arg0.aClass322_128) {
												Static140.anInt2884 = Static633.anInt8242;
												local1223 = local11.method3030() == 1;
												if (arg0.anInt7198 != 1) {
													if (local1223) {
														Static488.aClass6_Sub29_3 = new Class6_Sub29(local11);
													} else {
														Static99.aClass6_Sub29_1 = new Class6_Sub29(local11);
													}
													arg0.aClass322_128 = null;
													return true;
												}
												if (local1223) {
													Static488.aClass6_Sub29_3 = null;
												} else {
													Static99.aClass6_Sub29_1 = null;
												}
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static14.aClass322_3) {
												local290 = local11.method3051();
												local102 = local11.method3042();
												Static42.method537();
												Static516.method7463(local290, local102);
												arg0.aClass322_128 = null;
												return true;
											} else if (Static245.aClass322_76 == arg0.aClass322_128) {
												Static23.method259(Static408.aClass221_14);
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static432.aClass322_132) {
												local3005 = local11.method3046();
												local102 = local11.method3015();
												Static42.method537();
												Static644.method8664(local3005, local102);
												arg0.aClass322_128 = null;
												return true;
											} else if (Static335.aClass322_104 == arg0.aClass322_128) {
												local290 = local11.method3048();
												if (local290 == 65535) {
													local290 = -1;
												}
												local102 = local11.method3032();
												Static42.method537();
												Static358.method5445(local102, 1, local290, -1);
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static561.aClass322_170) {
												local11.anInt3174 += 28;
												if (local11.method3001()) {
													Static156.method3098(local11, local11.anInt3174 - 28);
												}
												arg0.aClass322_128 = null;
												return true;
											} else if (arg0.aClass322_128 == Static577.aClass322_174) {
												Static623.anInt9828 = local11.method2989();
												Static128.anInt2539 = Static633.anInt8242;
												arg0.aClass322_128 = null;
												return true;
											} else {
												@Pc(3759) Class6_Sub32 local3759;
												@Pc(3742) Class6_Sub32 local3742;
												if (Static386.aClass322_116 == arg0.aClass322_128) {
													local290 = local11.method3005();
													if (local290 == 65535) {
														local290 = -1;
													}
													local102 = local11.method3042();
													if (local102 == 65535) {
														local102 = -1;
													}
													local298 = local11.method3051();
													local302 = local11.method3005();
													Static42.method537();
													for (local306 = local102; local306 <= local290; local306++) {
														local1245 = ((long) local298 << 32) + ((long) local306);
														local3742 = (Class6_Sub32) Static497.aClass74_58.method1401(local1245);
														if (local3742 != null) {
															local3759 = new Class6_Sub32(local3742.anInt5776, local302);
															local3742.method9051();
														} else if (local306 == -1) {
															local3759 = new Class6_Sub32(Static69.method899(local298).aClass6_Sub32_2.anInt5776, local302);
														} else {
															local3759 = new Class6_Sub32(0, local302);
														}
														Static497.aClass74_58.method1399(local3759, local1245);
													}
													arg0.aClass322_128 = null;
													return true;
												} else if (Static359.aClass322_108 == arg0.aClass322_128) {
													local3005 = local11.method3046();
													local102 = local11.method3018();
													Static42.method537();
													Static93.method1341(local3005, local102);
													arg0.aClass322_128 = null;
													return true;
												} else if (arg0.aClass322_128 == Static321.aClass322_99) {
													anInt5151 = local11.method3030();
													for (local290 = 0; local290 < anInt5151; local290++) {
														Static73.aStringArray11[local290] = local11.method3046();
														Static591.aStringArray36[local290] = local11.method3046();
														if (Static591.aStringArray36[local290].equals("")) {
															Static591.aStringArray36[local290] = Static73.aStringArray11[local290];
														}
														Static433.aStringArray31[local290] = local11.method3046();
														Static353.aStringArray26[local290] = local11.method3046();
														if (Static353.aStringArray26[local290].equals("")) {
															Static353.aStringArray26[local290] = Static433.aStringArray31[local290];
														}
														Static510.aBooleanArray29[local290] = false;
													}
													arg0.aClass322_128 = null;
													Static535.anInt4136 = Static633.anInt8242;
													return true;
												} else if (arg0.aClass322_128 == Static608.aClass322_181) {
													arg0.aClass322_128 = null;
													Static64.anObjectArray1 = null;
													return true;
												} else if (Static666.aClass322_197 == arg0.aClass322_128) {
													local3005 = local11.method3046();
													local102 = local11.method3018();
													local1229 = Static35.aClass276_1.method6929(local102).method8372(local11);
													Static601.method8306(local3005, 19, local3005, local1229, (String) null, local3005, local102, 0);
													arg0.aClass322_128 = null;
													return true;
												} else if (Static592.aClass322_176 == arg0.aClass322_128) {
													Static166.method3296(false);
													arg0.aClass322_128 = null;
													return false;
												} else if (Static601.aClass322_177 == arg0.aClass322_128) {
													Static613.method8454(local11.method3046());
													arg0.aClass322_128 = null;
													return true;
												} else if (arg0.aClass322_128 == Static506.aClass322_156) {
													local290 = local11.method3015();
													local102 = local11.method3042();
													local298 = local11.method3005();
													Static42.method537();
													Static33.method444(local290, local102 + (local298 << 16));
													arg0.aClass322_128 = null;
													return true;
												} else if (Static444.aClass322_134 == arg0.aClass322_128) {
													local290 = local11.method3018();
													if (local290 == 65535) {
														local290 = -1;
													}
													local102 = local11.method3030();
													local298 = local11.method3018();
													local302 = local11.method3030();
													local306 = local11.method3018();
													Static241.method4231(local306, local290, local302, local298, local102);
													arg0.aClass322_128 = null;
													return true;
												} else {
													@Pc(4092) Class6_Sub25 local4092;
													if (Static536.aClass322_163 == arg0.aClass322_128) {
														local290 = local11.method3034();
														local102 = local11.method3051();
														local298 = local11.method3042();
														Static42.method537();
														local4092 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local102);
														if (local4092 != null) {
															Static133.method2562(local4092, local4092.anInt5007 != local298, false);
														}
														Static307.method4890(local102, false, local298, local290);
														arg0.aClass322_128 = null;
														return true;
													} else if (arg0.aClass322_128 == Static572.aClass322_191) {
														local290 = local11.method3022();
														local102 = local11.method3048();
														Static42.method537();
														Static232.method4116(local290, local102);
														arg0.aClass322_128 = null;
														return true;
													} else if (arg0.aClass322_128 == Static136.aClass322_43) {
														Static632.anInt9896 = local11.method3004();
														Static334.aBoolean425 = local11.method3030() == 1;
														arg0.aClass322_128 = null;
														return true;
													} else if (Static304.aClass322_93 == arg0.aClass322_128) {
														local1223 = local11.method3030() == 1;
														local1227 = local11.method3046();
														local1229 = local1227;
														if (local1223) {
															local1229 = local11.method3046();
														}
														local302 = local11.method3030();
														local306 = local11.method3018();
														local2452 = false;
														if (local302 <= 1 && Static446.method6903(local1229)) {
															local2452 = true;
														}
														if (!local2452 && Static225.anInt4393 == 0) {
															local2035 = Static35.aClass276_1.method6929(local306).method8372(local11);
															if (local302 == 2) {
																Static601.method8306(local1227, 25, "<img=1>" + local1229, local2035, (String) null, "<img=1>" + local1227, local306, 0);
															} else if (local302 == 1) {
																Static601.method8306(local1227, 25, "<img=0>" + local1229, local2035, (String) null, "<img=0>" + local1227, local306, 0);
															} else {
																Static601.method8306(local1227, 25, local1229, local2035, (String) null, local1227, local306, 0);
															}
														}
														arg0.aClass322_128 = null;
														return true;
													} else {
														@Pc(4374) long local4374;
														if (Static510.aClass322_182 == arg0.aClass322_128) {
															local1223 = local11.method3030() == 1;
															local1227 = local11.method3046();
															local1229 = local1227;
															if (local1223) {
																local1229 = local11.method3046();
															}
															local1240 = local11.method3049();
															local1245 = (long) local11.method3018();
															local4374 = (long) local11.method2987();
															local344 = local11.method3030();
															@Pc(4384) long local4384 = (local1245 << 32) + local4374;
															local665 = false;
															local384 = 0;
															while (true) {
																if (local384 >= 100) {
																	if (local344 <= 1) {
																		if (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714) {
																			local665 = true;
																		} else if (Static446.method6903(local1229)) {
																			local665 = true;
																		}
																	}
																	break;
																}
																if (local4384 == Static253.aLongArray7[local384]) {
																	local665 = true;
																	break;
																}
																local384++;
															}
															if (!local665 && Static225.anInt4393 == 0) {
																Static253.aLongArray7[Static415.anInt7192] = local4384;
																Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
																@Pc(4472) String local4472 = Static491.method7288(Static122.method2208(local11), (byte) -102);
																if (local344 == 2 || local344 == 3) {
																	Static601.method8306(local1227, 9, "<img=1>" + local1229, local4472, Static676.method8941(local1240), "<img=1>" + local1227, -1, 0);
																} else if (local344 == 1) {
																	Static601.method8306(local1227, 9, "<img=0>" + local1229, local4472, Static676.method8941(local1240), "<img=0>" + local1227, -1, 0);
																} else {
																	Static601.method8306(local1227, 9, local1229, local4472, Static676.method8941(local1240), local1227, -1, 0);
																}
															}
															arg0.aClass322_128 = null;
															return true;
														} else if (arg0.aClass322_128 == Static582.aClass322_175) {
															Static16.method210();
															arg0.aClass322_128 = null;
															return true;
														} else if (arg0.aClass322_128 == Static483.aClass322_146) {
															local290 = local11.method3018();
															local102 = local11.method3018();
															local298 = local11.method3018();
															Static42.method537();
															if (Static686.aClass381ArrayArray2[local290] != null) {
																for (local302 = local102; local302 < local298; local302++) {
																	local306 = local11.method2987();
																	if (Static686.aClass381ArrayArray2[local290].length > local302 && Static686.aClass381ArrayArray2[local290][local302] != null) {
																		Static686.aClass381ArrayArray2[local290][local302].anInt10146 = local306;
																	}
																}
															}
															arg0.aClass322_128 = null;
															return true;
														} else if (arg0.aClass322_128 == Static494.aClass322_61) {
															Static577.method8049();
															arg0.aClass322_128 = null;
															return false;
														} else if (Static359.aClass322_107 == arg0.aClass322_128) {
															local2781 = local11.method3014();
															local102 = local11.method3018();
															Static42.method537();
															Static232.method4116(local2781, local102);
															arg0.aClass322_128 = null;
															return true;
														} else if (Static114.aClass322_39 == arg0.aClass322_128) {
															for (local290 = 0; local290 < Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1.length; local290++) {
																if (Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local290] != null) {
																	Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local290].anIntArray256 = null;
																	Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local290].aClass104_8.method9035(-1);
																}
															}
															for (local102 = 0; local102 < Static251.anInt4781; local102++) {
																Static216.aClass6_Sub11Array1[local102].aClass60_Sub1_Sub1_Sub3_Sub2_1.anIntArray256 = null;
																Static216.aClass6_Sub11Array1[local102].aClass60_Sub1_Sub1_Sub3_Sub2_1.aClass104_8.method9035(-1);
															}
															arg0.aClass322_128 = null;
															return true;
														} else if (arg0.aClass322_128 == Static455.aClass322_140) {
															local290 = local11.method3018();
															if (local290 == 65535) {
																local290 = -1;
															}
															local102 = local11.method3030();
															local298 = local11.method3030();
															Static229.method4087(local298, local102, local290);
															arg0.aClass322_128 = null;
															return true;
														} else if (Static545.aClass322_164 == arg0.aClass322_128) {
															local290 = local11.method3025();
															local102 = local11.method3005();
															if (local102 == 65535) {
																local102 = -1;
															}
															local298 = local11.method3036();
															Static67.method811(local298, local102, local290);
															arg0.aClass322_128 = null;
															return true;
														} else if (Static420.aClass322_130 == arg0.aClass322_128) {
															Static467.anInt8011 = local11.method3030();
															Static497.anInt8376 = local11.method2990() << 3;
															Static118.anInt2280 = local11.method3027() << 3;
															arg0.aClass322_128 = null;
															return true;
														} else if (arg0.aClass322_128 == Static16.aClass322_4) {
															Static349.anInt5933 = Static633.anInt8242;
															local1223 = local11.method3030() == 1;
															if (arg0.anInt7198 != 1) {
																if (local1223) {
																	Static531.aClass391_2 = new Class391(local11);
																} else {
																	Static579.aClass391_3 = new Class391(local11);
																}
																arg0.aClass322_128 = null;
																return true;
															}
															if (local1223) {
																Static531.aClass391_2 = null;
															} else {
																Static579.aClass391_3 = null;
															}
															arg0.aClass322_128 = null;
															return true;
														} else if (Static644.aClass322_187 == arg0.aClass322_128) {
															local290 = local11.method3015();
															Static308.aClass380_3 = Static651.aClass122_38.method3345(local290);
															arg0.aClass322_128 = null;
															return true;
														} else {
															@Pc(4976) long local4976;
															@Pc(4971) long local4971;
															@Pc(5081) String local5081;
															if (arg0.aClass322_128 == Static294.aClass322_88) {
																local1223 = local11.method3030() == 1;
																local1227 = local11.method3046();
																local4971 = (long) local11.method3018();
																local4976 = (long) local11.method2987();
																local314 = local11.method3030();
																local320 = local11.method3018();
																local1256 = (local4971 << 32) + local4976;
																local1258 = false;
																@Pc(5001) Class6_Sub29 local5001 = local1223 ? Static488.aClass6_Sub29_3 : Static99.aClass6_Sub29_1;
																if (local5001 == null) {
																	local1258 = true;
																} else {
																	label2218: {
																		for (local382 = 0; local382 < 100; local382++) {
																			if (local1256 == Static253.aLongArray7[local382]) {
																				local1258 = true;
																				break label2218;
																			}
																		}
																		if (local314 <= 1 && Static446.method6903(local1227)) {
																			local1258 = true;
																		}
																	}
																}
																if (!local1258 && Static225.anInt4393 == 0) {
																	Static253.aLongArray7[Static415.anInt7192] = local1256;
																	Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
																	local5081 = Static35.aClass276_1.method6929(local320).method8372(local11);
																	local384 = local1223 ? 42 : 45;
																	if (local314 == 2 || local314 == 3) {
																		Static601.method8306(local1227, local384, "<img=1>" + local1227, local5081, local5001.aString61, "<img=1>" + local1227, local320, 0);
																	} else if (local314 == 1) {
																		Static601.method8306(local1227, local384, "<img=0>" + local1227, local5081, local5001.aString61, "<img=0>" + local1227, local320, 0);
																	} else {
																		Static601.method8306(local1227, local384, local1227, local5081, local5001.aString61, local1227, local320, 0);
																	}
																}
																arg0.aClass322_128 = null;
																return true;
															} else if (aClass322_85 == arg0.aClass322_128) {
																local3005 = local11.method3046();
																local102 = local11.method3018();
																Static42.method537();
																Static93.method1341(local3005, local102);
																arg0.aClass322_128 = null;
																return true;
															} else {
																@Pc(5225) boolean local5225;
																if (arg0.aClass322_128 == Static442.aClass322_133) {
																	local290 = local11.method3032();
																	local5225 = local11.method3036() == 1;
																	if (local5225 != Static681.aBoolean768 || local290 != Static481.anInt8149) {
																		Static681.aBoolean768 = local5225;
																		Static481.anInt8149 = local290;
																		Static301.method4845(Static73.aClass275_8, -1, -1);
																	}
																	arg0.aClass322_128 = null;
																	return true;
																} else if (arg0.aClass322_128 == Static469.aClass322_143) {
																	local290 = local11.method3030();
																	if (local11.method3030() == 0) {
																		Static30.aClass272Array1[local290] = new Class272();
																	} else {
																		local11.anInt3174--;
																		Static30.aClass272Array1[local290] = new Class272(local11);
																	}
																	Static414.anInt7187 = Static633.anInt8242;
																	arg0.aClass322_128 = null;
																	return true;
																} else if (Static389.aClass322_195 == arg0.aClass322_128) {
																	Static681.method8963(Static651.aClass122_38, local11, arg0.anInt7198);
																	arg0.aClass322_128 = null;
																	return true;
																} else if (Static645.aClass322_173 == arg0.aClass322_128) {
																	local290 = local11.method3051();
																	local102 = local11.method3034();
																	local298 = local11.method3034();
																	Static147.anIntArray167[local298] = local290;
																	Static476.anIntArray507[local298] = local102;
																	Static232.anIntArray229[local298] = 1;
																	local302 = Static263.anIntArray271[local298] - 1;
																	for (local306 = 0; local306 < local302; local306++) {
																		if (Class140.anIntArray212[local306] <= local290) {
																			Static232.anIntArray229[local298] = local306 + 2;
																		}
																	}
																	Static379.anIntArray375[Static337.anInt5768++ & 0x1F] = local298;
																	arg0.aClass322_128 = null;
																	return true;
																} else if (arg0.aClass322_128 == Static518.aClass322_161) {
																	local1223 = local11.method3030() == 1;
																	local1227 = local11.method3046();
																	local1229 = local1227;
																	if (local1223) {
																		local1229 = local11.method3046();
																	}
																	local302 = local11.method3030();
																	local2442 = false;
																	if (local302 <= 1) {
																		if (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714) {
																			local2442 = true;
																		} else if (local302 <= 1 && Static446.method6903(local1229)) {
																			local2442 = true;
																		}
																	}
																	if (!local2442 && Static225.anInt4393 == 0) {
																		local1706 = Static491.method7288(Static122.method2208(local11), (byte) -82);
																		if (local302 == 2) {
																			Static601.method8306(local1227, 24, "<img=1>" + local1229, local1706, (String) null, "<img=1>" + local1227, -1, 0);
																		} else if (local302 == 1) {
																			Static601.method8306(local1227, 24, "<img=0>" + local1229, local1706, (String) null, "<img=0>" + local1227, -1, 0);
																		} else {
																			Static601.method8306(local1227, 24, local1229, local1706, (String) null, local1227, -1, 0);
																		}
																	}
																	arg0.aClass322_128 = null;
																	return true;
																} else if (arg0.aClass322_128 == Static288.aClass322_86) {
																	Static324.aString64 = arg0.anInt7198 > 2 ? local11.method3046() : Static50.aClass43_25.method596(Static601.anInt9518);
																	Static631.anInt9892 = arg0.anInt7198 <= 0 ? -1 : local11.method3018();
																	arg0.aClass322_128 = null;
																	if (Static631.anInt9892 == 65535) {
																		Static631.anInt9892 = -1;
																	}
																	return true;
																} else if (arg0.aClass322_128 == Static374.aClass322_112) {
																	local290 = local11.method3030();
																	local102 = local11.method3034();
																	local298 = local11.method3018();
																	local302 = local11.method3021();
																	local306 = local11.method3030();
																	Static42.method537();
																	Static153.aBooleanArray9[local290] = true;
																	Static566.anIntArray532[local290] = local306;
																	Static449.anIntArray491[local290] = local302;
																	Static401.anIntArray429[local290] = local102;
																	Static237.anIntArray239[local290] = local298;
																	arg0.aClass322_128 = null;
																	return true;
																} else if (Static84.aClass322_33 == arg0.aClass322_128) {
																	arg0.aClass322_128 = null;
																	Static64.anObjectArray1 = new Object[Static582.aClass367_1.anInt9877];
																	return true;
																} else if (arg0.aClass322_128 == Static236.aClass322_70) {
																	Static23.method259(Static152.aClass221_4);
																	arg0.aClass322_128 = null;
																	return true;
																} else {
																	@Pc(5719) byte[] local5719;
																	if (Static297.aClass322_199 == arg0.aClass322_128) {
																		if (Static221.aFrame1 != null) {
																			Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
																		}
																		local5719 = new byte[arg0.anInt7198];
																		local11.method2478(local5719, arg0.anInt7198);
																		local1227 = Static420.method6420(0, arg0.anInt7198, local5719);
																		local1229 = "opensn";
																		if (!Static477.aBoolean381 || Static591.method8212(local1227, 1, local1229, Static651.aClass122_38).anInt10067 == 2) {
																			Static118.method2175(Static651.aClass122_38, true, local1229, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 1, local1227);
																		}
																		arg0.aClass322_128 = null;
																		return true;
																	} else if (arg0.aClass322_128 == Static135.aClass322_42) {
																		local1223 = local11.method3030() == 1;
																		local1227 = local11.method3046();
																		local1229 = local1227;
																		if (local1223) {
																			local1229 = local11.method3046();
																		}
																		local1240 = (long) local11.method3018();
																		local1245 = (long) local11.method2987();
																		local320 = local11.method3030();
																		local335 = local11.method3018();
																		@Pc(5831) long local5831 = local1245 + (local1240 << 32);
																		local475 = false;
																		local382 = 0;
																		while (true) {
																			if (local382 >= 100) {
																				if (local320 <= 1 && Static446.method6903(local1229)) {
																					local475 = true;
																				}
																				break;
																			}
																			if (local5831 == Static253.aLongArray7[local382]) {
																				local475 = true;
																				break;
																			}
																			local382++;
																		}
																		if (!local475 && Static225.anInt4393 == 0) {
																			Static253.aLongArray7[Static415.anInt7192] = local5831;
																			Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
																			local5081 = Static35.aClass276_1.method6929(local335).method8372(local11);
																			if (local320 == 2) {
																				Static601.method8306(local1227, 18, "<img=1>" + local1229, local5081, (String) null, "<img=1>" + local1227, local335, 0);
																			} else if (local320 == 1) {
																				Static601.method8306(local1227, 18, "<img=0>" + local1229, local5081, (String) null, "<img=0>" + local1227, local335, 0);
																			} else {
																				Static601.method8306(local1227, 18, local1229, local5081, (String) null, local1227, local335, 0);
																			}
																		}
																		arg0.aClass322_128 = null;
																		return true;
																	} else if (arg0.aClass322_128 == Static502.aClass322_155) {
																		local290 = local11.method3042();
																		if (local290 == 65535) {
																			local290 = -1;
																		}
																		local102 = local11.method3022();
																		Static42.method537();
																		Static358.method5445(local102, 2, local290, -1);
																		arg0.aClass322_128 = null;
																		return true;
																	} else if (Static302.aClass322_92 == arg0.aClass322_128) {
																		local290 = local11.method3022();
																		local102 = local11.method3042();
																		if (local102 == 65535) {
																			local102 = -1;
																		}
																		local298 = local11.method3015();
																		local302 = local11.method3005();
																		Static42.method537();
																		if (local302 == 65535) {
																			local302 = -1;
																		}
																		for (local306 = local102; local306 <= local302; local306++) {
																			local1245 = ((long) local298 << 32) + ((long) local306);
																			local3742 = (Class6_Sub32) Static497.aClass74_58.method1401(local1245);
																			if (local3742 != null) {
																				local3759 = new Class6_Sub32(local290, local3742.anInt5779);
																				local3742.method9051();
																			} else if (local306 == -1) {
																				local3759 = new Class6_Sub32(local290, Static69.method899(local298).aClass6_Sub32_2.anInt5779);
																			} else {
																				local3759 = new Class6_Sub32(local290, -1);
																			}
																			Static497.aClass74_58.method1399(local3759, local1245);
																		}
																		arg0.aClass322_128 = null;
																		return true;
																	} else if (arg0.aClass322_128 == Static59.aClass322_19) {
																		local3005 = local11.method3046();
																		@Pc(6143) Object[] local6143 = new Object[local3005.length() + 1];
																		for (local298 = local3005.length() - 1; local298 >= 0; local298--) {
																			if (local3005.charAt(local298) == 's') {
																				local6143[local298 + 1] = local11.method3046();
																			} else {
																				local6143[local298 + 1] = Integer.valueOf(local11.method3015());
																			}
																		}
																		local6143[0] = Integer.valueOf(local11.method3015());
																		Static42.method537();
																		@Pc(6203) Class6_Sub53 local6203 = new Class6_Sub53();
																		local6203.anObjectArray3 = local6143;
																		Static301.method4842(local6203);
																		arg0.aClass322_128 = null;
																		return true;
																	} else {
																		@Pc(6435) Class231 local6435;
																		if (arg0.aClass322_128 == Static318.aClass322_97) {
																			Static305.anInt6023 = Static633.anInt8242;
																			if (arg0.anInt7198 == 0) {
																				Static188.anInt3786 = 0;
																				arg0.aClass322_128 = null;
																				Static29.aClass231Array1 = null;
																				Static175.aString39 = null;
																				Static108.aString18 = null;
																				return true;
																			}
																			Static108.aString18 = local11.method3046();
																			local1223 = local11.method3030() == 1;
																			if (local1223) {
																				local11.method3046();
																			}
																			local3110 = local11.method3049();
																			Static175.aString39 = Static23.method263(local3110);
																			Static13.aByte2 = local11.method3027();
																			local302 = local11.method3030();
																			if (local302 == 255) {
																				arg0.aClass322_128 = null;
																				return true;
																			}
																			Static188.anInt3786 = local302;
																			@Pc(6294) Class231[] local6294 = new Class231[100];
																			for (local310 = 0; local310 < Static188.anInt3786; local310++) {
																				local6294[local310] = new Class231();
																				local6294[local310].aString71 = local11.method3046();
																				local1223 = local11.method3030() == 1;
																				if (local1223) {
																					local6294[local310].aString72 = local11.method3046();
																				} else {
																					local6294[local310].aString72 = local6294[local310].aString71;
																				}
																				local6294[local310].aString74 = Static273.method4625(local6294[local310].aString72);
																				local6294[local310].anInt6148 = local11.method3018();
																				local6294[local310].aByte94 = local11.method3027();
																				local6294[local310].aString73 = local11.method3046();
																				if (local6294[local310].aString72.equals(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23)) {
																					Static522.aByte128 = local6294[local310].aByte94;
																				}
																			}
																			local335 = Static188.anInt3786;
																			while (local335 > 0) {
																				local1708 = true;
																				local335--;
																				for (local344 = 0; local344 < local335; local344++) {
																					if (local6294[local344].aString74.compareTo(local6294[local344 + 1].aString74) > 0) {
																						local6435 = local6294[local344];
																						local6294[local344] = local6294[local344 + 1];
																						local1708 = false;
																						local6294[local344 + 1] = local6435;
																					}
																				}
																				if (local1708) {
																					break;
																				}
																			}
																			arg0.aClass322_128 = null;
																			Static29.aClass231Array1 = local6294;
																			return true;
																		} else if (arg0.aClass322_128 == Static191.aClass322_59) {
																			local3005 = local11.method3046();
																			local870 = local11.method3030() == 1;
																			if (local870) {
																				local1227 = local11.method3046();
																			} else {
																				local1227 = local3005;
																			}
																			local302 = local11.method3018();
																			@Pc(6514) byte local6514 = local11.method3027();
																			local2452 = false;
																			if (local6514 == -128) {
																				local2452 = true;
																			}
																			if (local2452) {
																				if (Static188.anInt3786 == 0) {
																					arg0.aClass322_128 = null;
																					return true;
																				}
																				for (local314 = 0; Static188.anInt3786 > local314 && (!Static29.aClass231Array1[local314].aString72.equals(local1227) || local302 != Static29.aClass231Array1[local314].anInt6148); local314++) {
																				}
																				if (Static188.anInt3786 > local314) {
																					while (Static188.anInt3786 - 1 > local314) {
																						Static29.aClass231Array1[local314] = Static29.aClass231Array1[local314 + 1];
																						local314++;
																					}
																					Static188.anInt3786--;
																					Static29.aClass231Array1[Static188.anInt3786] = null;
																				}
																			} else {
																				local2035 = local11.method3046();
																				local6435 = new Class231();
																				local6435.aString72 = local1227;
																				local6435.aString71 = local3005;
																				local6435.aString74 = Static273.method4625(local6435.aString72);
																				local6435.aByte94 = local6514;
																				local6435.aString73 = local2035;
																				local6435.anInt6148 = local302;
																				for (local335 = Static188.anInt3786 - 1; local335 >= 0; local335--) {
																					local344 = Static29.aClass231Array1[local335].aString74.compareTo(local6435.aString74);
																					if (local344 == 0) {
																						Static29.aClass231Array1[local335].anInt6148 = local302;
																						Static29.aClass231Array1[local335].aByte94 = local6514;
																						Static29.aClass231Array1[local335].aString73 = local2035;
																						if (local1227.equals(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23)) {
																							Static522.aByte128 = local6514;
																						}
																						Static305.anInt6023 = Static633.anInt8242;
																						arg0.aClass322_128 = null;
																						return true;
																					}
																					if (local344 < 0) {
																						break;
																					}
																				}
																				if (Static188.anInt3786 >= Static29.aClass231Array1.length) {
																					arg0.aClass322_128 = null;
																					return true;
																				}
																				for (local344 = Static188.anInt3786 - 1; local344 > local335; local344--) {
																					Static29.aClass231Array1[local344 + 1] = Static29.aClass231Array1[local344];
																				}
																				if (Static188.anInt3786 == 0) {
																					Static29.aClass231Array1 = new Class231[100];
																				}
																				Static29.aClass231Array1[local335 + 1] = local6435;
																				Static188.anInt3786++;
																				if (local1227.equals(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23)) {
																					Static522.aByte128 = local6514;
																				}
																			}
																			Static305.anInt6023 = Static633.anInt8242;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static664.aClass322_194 == arg0.aClass322_128) {
																			local1223 = local11.method3030() == 1;
																			@Pc(6796) byte[] local6796 = new byte[arg0.anInt7198 - 1];
																			local11.method3019(arg0.anInt7198 - 1, 0, local6796);
																			Static124.method2319(local1223, local6796);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static462.aClass322_141 == arg0.aClass322_128) {
																			Static23.method259(Static573.aClass221_20);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static552.aClass322_166) {
																			Static118.anInt2280 = local11.method2990() << 3;
																			Static467.anInt8011 = local11.method3034();
																			Static497.anInt8376 = local11.method2990() << 3;
																			while (arg0.anInt7198 > local11.anInt3174) {
																				@Pc(6862) Class221 local6862 = Static38.method490()[local11.method3030()];
																				Static23.method259(local6862);
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static251.aClass322_78 == arg0.aClass322_128) {
																			local290 = local11.method3005();
																			Static42.method537();
																			Static468.method7067(local290);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static106.aClass322_38 == arg0.aClass322_128) {
																			Static23.method259(Static560.aClass221_18);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static189.aClass322_58 == arg0.aClass322_128) {
																			if (Static635.anInt9910 != -1) {
																				Static490.method7251(0, Static635.anInt9910);
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static426.aClass322_192) {
																			Static23.method259(Static206.aClass221_7);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static163.aClass322_51) {
																			local290 = local11.method3015();
																			Static42.method537();
																			Static358.method5445(local290, 3, -1, -1);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static607.aClass322_180 == arg0.aClass322_128) {
																			local290 = local11.method3015();
																			local102 = local11.method3015();
																			@Pc(6986) Class6_Sub13 local6986 = Static30.method353(Static677.aClass241_116, arg0.aClass270_2);
																			local6986.aClass6_Sub15_Sub1_1.method3029(local290);
																			local6986.aClass6_Sub15_Sub1_1.method3029(local102);
																			arg0.method6404(local6986);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static447.aClass322_138 == arg0.aClass322_128) {
																			if (Static188.method3527(Static37.anInt498)) {
																				Static594.anInt9443 = (int) ((float) local11.method3018() * 2.5F);
																			} else {
																				Static594.anInt9443 = local11.method3018() * 30;
																			}
																			arg0.aClass322_128 = null;
																			Static128.anInt2539 = Static633.anInt8242;
																			return true;
																		} else if (arg0.aClass322_128 == Static295.aClass322_90) {
																			Static349.anInt5933 = Static633.anInt8242;
																			local1223 = local11.method3030() == 1;
																			@Pc(7069) Class308 local7069 = new Class308(local11);
																			@Pc(7073) Class391 local7073;
																			if (local1223) {
																				local7073 = Static531.aClass391_2;
																			} else {
																				local7073 = Static579.aClass391_3;
																			}
																			local7069.method7386(local7073);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static467.aClass322_142) {
																			local290 = local11.method3005();
																			local102 = local11.method3034();
																			Static42.method537();
																			Static298.method4813(local290, true, local102);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static316.aClass322_113 == arg0.aClass322_128) {
																			Static378.anInt6595 = local11.method3030();
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static263.aClass322_82) {
																			local1223 = local11.method3030() == 1;
																			local1227 = local11.method3046();
																			local4971 = (long) local11.method3018();
																			local4976 = (long) local11.method2987();
																			local314 = local11.method3030();
																			local4374 = local4976 + (local4971 << 32);
																			@Pc(7171) boolean local7171 = false;
																			@Pc(7180) Class6_Sub29 local7180 = local1223 ? Static488.aClass6_Sub29_3 : Static99.aClass6_Sub29_1;
																			if (local7180 == null) {
																				local7171 = true;
																			} else {
																				label2244: {
																					for (local376 = 0; local376 < 100; local376++) {
																						if (Static253.aLongArray7[local376] == local4374) {
																							local7171 = true;
																							break label2244;
																						}
																					}
																					if (local314 <= 1) {
																						if (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714) {
																							local7171 = true;
																						} else if (Static446.method6903(local1227)) {
																							local7171 = true;
																						}
																					}
																				}
																			}
																			if (!local7171 && Static225.anInt4393 == 0) {
																				Static253.aLongArray7[Static415.anInt7192] = local4374;
																				Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
																				local1344 = Static491.method7288(Static122.method2208(local11), (byte) -41);
																				local382 = local1223 ? 41 : 44;
																				if (local314 == 2 || local314 == 3) {
																					Static601.method8306(local1227, local382, "<img=1>" + local1227, local1344, local7180.aString61, "<img=1>" + local1227, -1, 0);
																				} else if (local314 == 1) {
																					Static601.method8306(local1227, local382, "<img=0>" + local1227, local1344, local7180.aString61, "<img=0>" + local1227, -1, 0);
																				} else {
																					Static601.method8306(local1227, local382, local1227, local1344, local7180.aString61, local1227, -1, 0);
																				}
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static363.aClass322_109 == arg0.aClass322_128) {
																			local290 = local11.method3030();
																			local102 = local290 >> 5;
																			local298 = local290 & 0x1F;
																			if (local298 == 0) {
																				Static236.aClass232Array1[local102] = null;
																				arg0.aClass322_128 = null;
																				return true;
																			}
																			@Pc(7407) Class232 local7407 = new Class232();
																			local7407.anInt6164 = local298;
																			local7407.anInt6162 = local11.method3030();
																			if (local7407.anInt6162 >= 0 && Static323.aClass49Array7.length > local7407.anInt6162) {
																				if (local7407.anInt6164 == 1 || local7407.anInt6164 == 10) {
																					local7407.anInt6165 = local11.method3018();
																					local11.anInt3174 += 6;
																				} else if (local7407.anInt6164 >= 2 && local7407.anInt6164 <= 6) {
																					if (local7407.anInt6164 == 2) {
																						local7407.anInt6174 = 256;
																						local7407.anInt6167 = 256;
																					}
																					if (local7407.anInt6164 == 3) {
																						local7407.anInt6174 = 256;
																						local7407.anInt6167 = 0;
																					}
																					if (local7407.anInt6164 == 4) {
																						local7407.anInt6174 = 256;
																						local7407.anInt6167 = 512;
																					}
																					if (local7407.anInt6164 == 5) {
																						local7407.anInt6174 = 0;
																						local7407.anInt6167 = 256;
																					}
																					if (local7407.anInt6164 == 6) {
																						local7407.anInt6174 = 512;
																						local7407.anInt6167 = 256;
																					}
																					local7407.anInt6164 = 2;
																					local7407.anInt6161 = local11.method3030();
																					local7407.anInt6167 += local11.method3018() - Static50.anInt606 << 9;
																					local7407.anInt6174 += local11.method3018() - Static404.anInt7039 << 9;
																					local7407.anInt6163 = local11.method3030() << 2;
																					local7407.anInt6166 = local11.method3018();
																				}
																				local7407.anInt6170 = local11.method3018();
																				if (local7407.anInt6170 == 65535) {
																					local7407.anInt6170 = -1;
																				}
																				Static236.aClass232Array1[local102] = local7407;
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static327.aClass322_102) {
																			Static106.method2036(local11, arg0.anInt7198);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static140.aClass322_45) {
																			local290 = local11.method3005();
																			local102 = local11.method3022();
																			Static303.aClass55_2.method945(local102, local290);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static446.aClass322_136) {
																			local290 = local11.method3018();
																			local1227 = local11.method3046();
																			if (Static64.anObjectArray1 == null) {
																				Static64.anObjectArray1 = new Object[Static582.aClass367_1.anInt9877];
																			}
																			Static64.anObjectArray1[local290] = local1227;
																			Static209.anIntArray215[Static331.anInt8307++ & 0x1F] = local290;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static491.aClass322_152) {
																			Static467.anInt8011 = local11.method3036();
																			Static497.anInt8376 = local11.method3014() << 3;
																			Static118.anInt2280 = local11.method3027() << 3;
																			for (@Pc(7716) Class6_Sub36 local7716 = (Class6_Sub36) Static650.aClass74_72.method1404(); local7716 != null; local7716 = (Class6_Sub36) Static650.aClass74_72.method1405()) {
																				local102 = (int) (local7716.aLong346 >> 28 & 0x3L);
																				local298 = (int) (local7716.aLong346 & 0x3FFFL);
																				local302 = local298 - Static50.anInt606;
																				local306 = (int) (local7716.aLong346 >> 14 & 0x3FFFL);
																				local310 = local306 - Static404.anInt7039;
																				if (Static467.anInt8011 == local102 && local302 >= Static497.anInt8376 && local302 < Static497.anInt8376 + 8 && local310 >= Static118.anInt2280 && Static118.anInt2280 + 8 > local310) {
																					local7716.method9051();
																					if (local302 >= 0 && local310 >= 0 && Static29.anInt380 > local302 && Static327.anInt5650 > local310) {
																						Static459.method7009(local310, Static467.anInt8011, local302);
																					}
																				}
																			}
																			@Pc(7825) Class6_Sub50 local7825;
																			for (local7825 = (Class6_Sub50) Static666.aClass340_75.method8124(); local7825 != null; local7825 = (Class6_Sub50) Static666.aClass340_75.method8134()) {
																				if (local7825.anInt9410 >= Static497.anInt8376 && local7825.anInt9410 < Static497.anInt8376 + 8 && local7825.anInt9409 >= Static118.anInt2280 && local7825.anInt9409 < Static118.anInt2280 + 8 && Static467.anInt8011 == local7825.anInt9417) {
																					local7825.aBoolean702 = true;
																				}
																			}
																			for (local7825 = (Class6_Sub50) Static39.aClass340_2.method8124(); local7825 != null; local7825 = (Class6_Sub50) Static39.aClass340_2.method8134()) {
																				if (Static497.anInt8376 <= local7825.anInt9410 && local7825.anInt9410 < Static497.anInt8376 + 8 && Static118.anInt2280 <= local7825.anInt9409 && local7825.anInt9409 < Static118.anInt2280 + 8 && Static467.anInt8011 == local7825.anInt9417) {
																					local7825.aBoolean702 = true;
																				}
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static77.aClass322_30) {
																			local290 = local11.method3032();
																			local102 = local11.method3030();
																			Static42.method537();
																			Static520.method7512(local102, local290);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static493.aClass322_153) {
																			local290 = local11.method3018();
																			local102 = local11.method3015();
																			if (Static64.anObjectArray1 == null) {
																				Static64.anObjectArray1 = new Object[Static582.aClass367_1.anInt9877];
																			}
																			Static64.anObjectArray1[local290] = Integer.valueOf(local102);
																			Static209.anIntArray215[Static331.anInt8307++ & 0x1F] = local290;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static414.aClass322_125) {
																			Static23.method259(Static536.aClass221_17);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static45.aClass322_15 == arg0.aClass322_128) {
																			local290 = local11.method3051();
																			local102 = local11.method3003();
																			local298 = local11.method3003();
																			Static42.method537();
																			Static243.method4295(local290, local102, local298);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static216.aClass322_63 == arg0.aClass322_128) {
																			Static42.method537();
																			Static552.method7810();
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static672.aClass322_201 == arg0.aClass322_128) {
																			local290 = local11.method3018();
																			local3438 = local11.method3027();
																			if (Static64.anObjectArray1 == null) {
																				Static64.anObjectArray1 = new Object[Static582.aClass367_1.anInt9877];
																			}
																			Static64.anObjectArray1[local290] = Integer.valueOf(local3438);
																			Static209.anIntArray215[Static331.anInt8307++ & 0x1F] = local290;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static371.aClass322_111) {
																			local290 = local11.method3032();
																			local102 = local11.method3018();
																			local298 = local11.method3042();
																			local302 = local11.method3030();
																			Static42.method537();
																			Static122.method2206(local298, local102, local290, local302);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static161.aClass322_50) {
																			Static535.anInt4136 = Static633.anInt8242;
																			arg0.aClass322_128 = null;
																			Static191.anInt3933 = 1;
																			return true;
																		} else if (arg0.aClass322_128 == Static343.aClass322_105) {
																			local290 = local11.method3018();
																			local1227 = local11.method3046();
																			local870 = local11.method3030() == 1;
																			Static526.aBoolean666 = local870;
																			Static27.aClass165_1 = Static82.aClass165_2;
																			Static653.method8740(local290, local1227);
																			Static307.method4889(15);
																			arg0.aClass322_128 = null;
																			return false;
																		} else if (arg0.aClass322_128 == Static563.aClass322_171) {
																			local290 = local11.method3015();
																			local102 = local11.method3042();
																			Static42.method537();
																			Static376.method5665(local290, local102);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static482.aClass322_145 == arg0.aClass322_128) {
																			local290 = local11.method3018();
																			local102 = local11.method3051();
																			local298 = local11.method3048();
																			local302 = local11.method3048();
																			Static42.method537();
																			Static350.method5368(local290, local298, local102, local302);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static158.aClass322_48) {
																			local290 = local11.method3030();
																			local5225 = (local290 & 0x1) == 1;
																			local1229 = local11.method3046();
																			local1065 = local11.method3046();
																			if (local1065.equals("")) {
																				local1065 = local1229;
																			}
																			local1999 = local11.method3046();
																			local1706 = local11.method3046();
																			if (local1706.equals("")) {
																				local1706 = local1999;
																			}
																			if (local5225) {
																				for (local314 = 0; local314 < anInt5151; local314++) {
																					if (Static591.aStringArray36[local314].equals(local1706)) {
																						Static73.aStringArray11[local314] = local1229;
																						Static591.aStringArray36[local314] = local1065;
																						Static433.aStringArray31[local314] = local1999;
																						Static353.aStringArray26[local314] = local1706;
																						break;
																					}
																				}
																			} else {
																				Static73.aStringArray11[anInt5151] = local1229;
																				Static591.aStringArray36[anInt5151] = local1065;
																				Static433.aStringArray31[anInt5151] = local1999;
																				Static353.aStringArray26[anInt5151] = local1706;
																				Static510.aBooleanArray29[anInt5151] = (local290 & 0x2) == 2;
																				anInt5151++;
																			}
																			Static535.anInt4136 = Static633.anInt8242;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static422.aClass322_131) {
																			local290 = local11.method3034();
																			local102 = local11.method3036();
																			local298 = local11.method3030();
																			local302 = local11.method3018() << 2;
																			local306 = local11.method3036();
																			Static42.method537();
																			Static437.method6611(local306, local102, local290, local298, local302);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static444.aClass322_135 == arg0.aClass322_128) {
																			Static42.method537();
																			Static470.method7087();
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static176.aClass322_55) {
																			local290 = local11.method3018();
																			local102 = local11.method3015();
																			Static42.method537();
																			Static366.method5551(local102, local290);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static675.aClass322_98) {
																			local1223 = local11.method3030() == 1;
																			local1227 = local11.method3046();
																			local1229 = local1227;
																			if (local1223) {
																				local1229 = local11.method3046();
																			}
																			local1240 = local11.method3049();
																			local1245 = (long) local11.method3018();
																			local4374 = (long) local11.method2987();
																			local344 = local11.method3030();
																			local351 = local11.method3018();
																			@Pc(8557) long local8557 = local4374 + (local1245 << 32);
																			@Pc(8559) boolean local8559 = false;
																			local615 = 0;
																			while (true) {
																				if (local615 >= 100) {
																					if (local344 <= 1 && Static446.method6903(local1229)) {
																						local8559 = true;
																					}
																					break;
																				}
																				if (Static253.aLongArray7[local615] == local8557) {
																					local8559 = true;
																					break;
																				}
																				local615++;
																			}
																			if (!local8559 && Static225.anInt4393 == 0) {
																				Static253.aLongArray7[Static415.anInt7192] = local8557;
																				Static415.anInt7192 = (Static415.anInt7192 + 1) % 100;
																				@Pc(8628) String local8628 = Static35.aClass276_1.method6929(local351).method8372(local11);
																				if (local344 == 2) {
																					Static601.method8306(local1227, 20, "<img=1>" + local1229, local8628, Static676.method8941(local1240), "<img=1>" + local1227, local351, 0);
																				} else if (local344 == 1) {
																					Static601.method8306(local1227, 20, "<img=0>" + local1229, local8628, Static676.method8941(local1240), "<img=0>" + local1227, local351, 0);
																				} else {
																					Static601.method8306(local1227, 20, local1229, local8628, Static676.method8941(local1240), local1227, local351, 0);
																				}
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static223.aClass322_66) {
																			Static673.anInt10330 = local11.method3030();
																			Static128.anInt2539 = Static633.anInt8242;
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static333.aClass322_103 == arg0.aClass322_128) {
																			Static23.method259(Static144.aClass221_15);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static52.aClass322_57) {
																			local290 = local11.method3032();
																			local102 = local11.method3022();
																			Static42.method537();
																			@Pc(8772) Class6_Sub25 local8772 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local102);
																			local4092 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local290);
																			if (local4092 != null) {
																				Static133.method2562(local4092, local8772 == null || local8772.anInt5007 != local4092.anInt5007, false);
																			}
																			if (local8772 != null) {
																				local8772.method9051();
																				Static477.aClass74_31.method1399(local8772, (long) local290);
																			}
																			@Pc(8821) Class381 local8821 = Static69.method899(local102);
																			if (local8821 != null) {
																				Static168.method3312(local8821);
																			}
																			local8821 = Static69.method899(local290);
																			if (local8821 != null) {
																				Static168.method3312(local8821);
																				Static518.method7497(true, local8821);
																			}
																			if (Static635.anInt9910 != -1) {
																				Static490.method7251(1, Static635.anInt9910);
																			}
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static183.aClass322_56) {
																			local290 = local11.method3018() << 2;
																			local102 = local11.method3030();
																			local298 = local11.method3034();
																			local302 = local11.method3021();
																			local306 = local11.method3034();
																			Static42.method537();
																			Static155.method3085(local302, local102, true, local298, local306, local290);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (Static259.aClass322_81 == arg0.aClass322_128) {
																			if (Static221.aFrame1 != null) {
																				Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
																			}
																			local5719 = new byte[arg0.anInt7198];
																			local11.method2478(local5719, arg0.anInt7198);
																			local1227 = Static420.method6420(0, arg0.anInt7198, local5719);
																			Static379.method5863(local1227, true, Static651.aClass122_38, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 1);
																			arg0.aClass322_128 = null;
																			return true;
																		} else if (arg0.aClass322_128 == Static517.aClass322_160) {
																			Static23.method259(Static647.aClass221_21);
																			arg0.aClass322_128 = null;
																			return true;
																		} else {
																			Static550.method7785((Throwable) null, "T1 - " + (arg0.aClass322_128 == null ? -1 : arg0.aClass322_128.method7719()) + "," + (arg0.aClass322_126 == null ? -1 : arg0.aClass322_126.method7719()) + "," + (arg0.aClass322_129 == null ? -1 : arg0.aClass322_129.method7719()) + " - " + arg0.anInt7198);
																			Static166.method3296(false);
																			return true;
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILclient!lga;I)Lclient!cd;")
	public static Class53 method4708(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1) {
		@Pc(8) byte[] local8 = arg1.method5275(arg0);
		return local8 == null ? null : new Class53(local8);
	}
}
