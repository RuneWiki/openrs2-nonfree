import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public static int anInt4759;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!nq;")
	public static Class144 aClass144_81;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Lclient!bo;")
	public static Class30 aClass30_5;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!ms;")
	public static Class137 aClass137_13 = null;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)V")
	public static void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static137.anInt2548 = 0;
		@Pc(186) int local186;
		@Pc(233) int local233;
		@Pc(403) int local403;
		@Pc(515) int local515;
		@Pc(288) int local288;
		@Pc(638) int local638;
		@Pc(455) int local455;
		for (@Pc(15) int local15 = -1; local15 < Static331.anInt6366 + Static141.anInt2601; local15++) {
			@Pc(19) Class82 local19 = null;
			@Pc(23) Class67_Sub3_Sub3 local23;
			if (local15 < 0) {
				local23 = Static156.aClass67_Sub3_Sub3_Sub2_2;
			} else if (Static331.anInt6366 <= local15) {
				local23 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local15 - Static331.anInt6366]];
				local19 = ((Class67_Sub3_Sub3_Sub1) local23).aClass82_1;
				if (local19.anIntArray134 != null) {
					local19 = local19.method1569();
					if (local19 == null) {
						continue;
					}
				}
			} else {
				local23 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local15]];
			}
			if (local23.anInt4997 >= 0) {
				Static320.method5311(local23.method4380(), local23, arg3 >> 1, arg1 >> 1);
				if (Static267.anIntArray414[0] >= 0) {
					if (local23.aString49 != null && (Static331.anInt6366 <= local15 || Static221.anInt4493 == 0 || Static221.anInt4493 == 3 || Static221.anInt4493 == 1 && Static51.method733(((Class67_Sub3_Sub3_Sub2) local23).aString50)) && Static67.anInt1249 > Static137.anInt2548) {
						Static67.anIntArray86[Static137.anInt2548] = Static102.aClass114_3.method2472(local23.aString49) / 2;
						Static67.anIntArray81[Static137.anInt2548] = Static267.anIntArray414[0];
						Static67.anIntArray85[Static137.anInt2548] = Static267.anIntArray414[1];
						Static67.anIntArray82[Static137.anInt2548] = local23.anInt5003;
						Static67.anIntArray83[Static137.anInt2548] = local23.anInt5059;
						Static67.anIntArray84[Static137.anInt2548] = local23.anInt4995;
						Static67.aStringArray7[Static137.anInt2548] = local23.aString49;
						Static137.anInt2548++;
					}
					@Pc(173) Class97 local173 = Static186.aClass97Array15[0];
					local186 = arg0 + Static267.anIntArray414[1] - Math.max(Static102.aClass114_3.anInt2912, local173.method5543());
					@Pc(201) Class97 local201;
					@Pc(300) int local300;
					if (!local23.aBoolean330 && Static293.anInt5807 < local23.anInt5042) {
						local201 = Static186.aClass97Array15[1];
						if (local23 instanceof Class67_Sub3_Sub3_Sub1) {
							@Pc(207) Class67_Sub3_Sub3_Sub1 local207 = (Class67_Sub3_Sub3_Sub1) local23;
							@Pc(216) Class97[] local216 = (Class97[]) Static108.aClass26_17.method332((long) local207.aClass82_1.anInt1870);
							if (local216 == null) {
								@Pc(225) Class125[] local225 = Static368.method2868(Static182.aClass144_49, local207.aClass82_1.anInt1870);
								if (local225 != null) {
									local216 = new Class97[local225.length];
									for (local233 = 0; local233 < local225.length; local233++) {
										local216[local233] = Static107.aClass129_4.method5018(local225[local233]);
									}
									Static108.aClass26_17.method330((long) local207.aClass82_1.anInt1870, local216);
								}
							}
							if (local216 != null && local216.length == 2) {
								local201 = local216[1];
								local173 = local216[0];
							}
						}
						local288 = arg2 + Static267.anIntArray414[0] - (local173.method5558() >> 1);
						local173.method5555(local288, local186);
						local300 = local173.method5558() * local23.anInt4998 / 255;
						Static107.aClass129_4.method4984(local288, local186, local300 + local288, local186 + local173.method5543());
						local201.method5555(local288, local186);
						Static107.aClass129_4.method4952(arg2, arg0, arg1 + arg2, arg3 + arg0);
					}
					local186 -= 2;
					if (!local23.aBoolean330) {
						if (Static293.anInt5807 < local23.anInt5019) {
							local201 = Static80.aClass97Array24[local23.aBoolean331 ? 2 : 0];
							@Pc(355) Class97 local355 = Static80.aClass97Array24[local23.aBoolean331 ? 3 : 1];
							if (local23 instanceof Class67_Sub3_Sub3_Sub1) {
								local300 = local19.anInt1884;
								if (local300 == -1) {
									local300 = local23.method4374().anInt1181;
								}
							} else {
								local300 = local23.method4374().anInt1181;
							}
							if (local300 != -1) {
								@Pc(388) Class97[] local388 = (Class97[]) Static156.aClass26_26.method332((long) local300);
								if (local388 == null) {
									@Pc(395) Class125[] local395 = Static368.method2868(Static182.aClass144_49, local300);
									if (local395 != null) {
										local388 = new Class97[local395.length];
										for (local403 = 0; local403 < local395.length; local403++) {
											local388[local403] = Static107.aClass129_4.method5018(local395[local403]);
										}
										Static156.aClass26_26.method330((long) local300, local388);
									}
								}
								if (local388 != null && local388.length == 4) {
									local355 = local388[local23.aBoolean331 ? 3 : 1];
									local201 = local388[local23.aBoolean331 ? 2 : 0];
								}
							}
							local455 = local23.anInt5019 - Static293.anInt5807;
							if (local455 > local23.anInt5028) {
								local455 -= local23.anInt5028;
								local403 = local23.anInt5020 == 0 ? 0 : (local23.anInt5053 - local455) / local23.anInt5020 * local23.anInt5020;
								local233 = local201.method5558() * local403 / local23.anInt5053;
							} else {
								local233 = local201.method5558();
							}
							local403 = local201.method5543();
							local186 -= local403;
							local515 = Static267.anIntArray414[0] + arg2 - (local201.method5558() >> 1);
							local201.method5555(local515, local186);
							Static107.aClass129_4.method4984(local515, local186, local515 + local233, local403 + local186);
							local355.method5555(local515, local186);
							local186 -= 2;
							Static107.aClass129_4.method4952(arg2, arg0, arg2 + arg1, arg0 - -arg3);
						}
						if (local15 < Static331.anInt6366) {
							@Pc(556) Class67_Sub3_Sub3_Sub2 local556 = (Class67_Sub3_Sub3_Sub2) local23;
							if (local556.anInt5080 != -1) {
								local186 -= 25;
								Static247.aClass97Array19[local556.anInt5080].method5555(Static267.anIntArray414[0] + arg2 - 12, local186);
								local186 -= 2;
							}
							if (local556.anInt5109 != -1) {
								local186 -= 25;
								Static342.aClass97Array27[local556.anInt5109].method5555(arg2 + Static267.anIntArray414[0] - 12, local186);
								local186 -= 2;
							}
						} else if (local19.anInt1900 >= 0 && local19.anInt1900 < Static342.aClass97Array27.length) {
							local186 -= 25;
							local201 = Static342.aClass97Array27[local19.anInt1900];
							local201.method5555(arg2 + Static267.anIntArray414[0] - (local201.method5558() >> 1), local186);
							local186 -= 2;
						}
					}
					@Pc(640) Class119[] local640;
					@Pc(648) Class119 local648;
					@Pc(669) Class97 local669;
					if (!(local23 instanceof Class67_Sub3_Sub3_Sub2)) {
						local638 = 0;
						local640 = Static23.aClass119Array1;
						for (local300 = 0; local300 < local640.length; local300++) {
							local648 = local640[local300];
							if (local648 != null && local648.anInt3328 == 1 && Static4.anIntArray4[local15 - Static331.anInt6366] == local648.anInt3336) {
								local669 = Static214.aClass97Array18[local648.anInt3323];
								if (local669.method5543() > local638) {
									local638 = local669.method5543();
								}
								if (Static293.anInt5807 % 20 < 10) {
									local669.method5555(Static267.anIntArray414[0] + arg2 - 12, local186 + -local669.method5543());
								}
							}
						}
						if (local638 > 0) {
						}
					} else if (local15 >= 0) {
						local638 = 0;
						local640 = Static23.aClass119Array1;
						for (local300 = 0; local300 < local640.length; local300++) {
							local648 = local640[local300];
							if (local648 != null && local648.anInt3328 == 10 && Static87.anIntArray104[local15] == local648.anInt3336) {
								local669 = Static214.aClass97Array18[local648.anInt3323];
								if (local638 < local669.method5543()) {
									local638 = local669.method5543();
								}
								local669.method5555(arg2 + Static267.anIntArray414[0] - 12, -local669.method5543() + local186);
							}
						}
						if (local638 > 0) {
						}
					}
					for (local638 = 0; local638 < 4; local638++) {
						if (local23.anIntArray389[local638] > Static293.anInt5807) {
							local288 = local23.method4380() / 2;
							Static320.method5311(local288, local23, arg3 >> 1, arg1 >> 1);
							if (Static267.anIntArray414[0] > -1) {
								if (local638 == 1) {
									Static267.anIntArray414[1] -= 20;
								}
								if (local638 == 2) {
									Static267.anIntArray414[0] -= 15;
									Static267.anIntArray414[1] -= 10;
								}
								if (local638 == 3) {
									Static267.anIntArray414[1] -= 10;
									Static267.anIntArray414[0] += 15;
								}
								Static56.aClass97Array2[local23.anIntArray388[local638]].method5555(arg2 + Static267.anIntArray414[0] - 12, arg0 + -12 - -Static267.anIntArray414[1]);
								Static283.aClass9_3.method3570(Static267.anIntArray414[0] + arg2 - 1, Static267.anIntArray414[1] + arg0 + 3, 0, Integer.toString(local23.anIntArray390[local638]), -1);
							}
						}
					}
				}
			}
		}
		@Pc(945) int local945;
		for (@Pc(939) int local939 = 0; local939 < Static338.anInt6503; local939++) {
			local945 = Static338.anIntArray537[local939];
			@Pc(952) Class67_Sub3_Sub3 local952;
			if (local945 < 2048) {
				local952 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local945];
			} else {
				local952 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local945 - 2048];
			}
			local186 = Static195.anIntArray341[local939];
			@Pc(971) Class67_Sub3_Sub3 local971;
			if (local186 < 2048) {
				local971 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local186];
			} else {
				local971 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local186 - 2048];
			}
			Static213.method3845(local971, local952, arg3, --local952.anInt4996, arg0, arg2, arg1);
		}
		local945 = Static102.aClass114_3.anInt2911 + Static102.aClass114_3.anInt2912 + 2;
		for (@Pc(1010) int local1010 = 0; local1010 < Static137.anInt2548; local1010++) {
			local186 = Static67.anIntArray81[local1010];
			local638 = Static67.anIntArray85[local1010];
			local288 = Static67.anIntArray86[local1010];
			@Pc(1026) boolean local1026 = true;
			while (local1026) {
				local1026 = false;
				for (local455 = 0; local455 < local1010; local455++) {
					if (Static67.anIntArray85[local455] - local945 < local638 - -2 && Static67.anIntArray85[local455] + 2 > local638 + -local945 && Static67.anIntArray81[local455] + Static67.anIntArray86[local455] > -local288 + local186 && local186 + local288 > -Static67.anIntArray86[local455] + Static67.anIntArray81[local455] && Static67.anIntArray85[local455] - local945 < local638) {
						local1026 = true;
						local638 = Static67.anIntArray85[local455] - local945;
					}
				}
			}
			Static67.anIntArray85[local1010] = local638;
			@Pc(1116) String local1116 = Static67.aStringArray7[local1010];
			if (Static170.anInt3356 == 0) {
				local233 = 16776960;
				if (Static67.anIntArray82[local1010] < 6) {
					local233 = Static293.anIntArray450[Static67.anIntArray82[local1010]];
				}
				if (Static67.anIntArray82[local1010] == 6) {
					local233 = Static347.anInt6633 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static67.anIntArray82[local1010] == 7) {
					local233 = Static347.anInt6633 % 20 >= 10 ? 65535 : 255;
				}
				if (Static67.anIntArray82[local1010] == 8) {
					local233 = Static347.anInt6633 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static67.anIntArray82[local1010] == 9) {
					local403 = 150 - Static67.anIntArray84[local1010];
					if (local403 < 50) {
						local233 = local403 * 1280 + 16711680;
					} else if (local403 < 100) {
						local233 = 16776960 - (local403 - 50) * 327680;
					} else if (local403 < 150) {
						local233 = (local403 - 100) * 5 + 65280;
					}
				}
				if (Static67.anIntArray82[local1010] == 10) {
					local403 = 150 - Static67.anIntArray84[local1010];
					if (local403 < 50) {
						local233 = local403 * 5 + 16711680;
					} else if (local403 < 100) {
						local233 = 16711935 - (local403 - 50) * 327680;
					} else if (local403 < 150) {
						local233 = local403 * 327680 + 255 - (local403 - 100) * 5 - 32768000;
					}
				}
				if (Static67.anIntArray82[local1010] == 11) {
					local403 = 150 - Static67.anIntArray84[local1010];
					if (local403 < 50) {
						local233 = 16777215 - local403 * 327685;
					} else if (local403 < 100) {
						local233 = (local403 - 50) * 327685 + 65280;
					} else if (local403 < 150) {
						local233 = 16777215 + 32768000 - local403 * 327680;
					}
				}
				local403 = local233 | 0xFF000000;
				if (Static67.anIntArray83[local1010] == 0) {
					Static106.aClass9_2.method3570(local186 + arg2, local638 + arg0, -16777216, local1116, local403);
				}
				if (Static67.anIntArray83[local1010] == 1) {
					Static106.aClass9_2.method3581(local1116, local186 + arg2, arg0 - -local638, local403, Static347.anInt6633);
				}
				if (Static67.anIntArray83[local1010] == 2) {
					Static106.aClass9_2.method3576(Static347.anInt6633, local186 + arg2, local1116, local403, arg0 + local638);
				}
				if (Static67.anIntArray83[local1010] == 3) {
					Static106.aClass9_2.method3583(Static347.anInt6633, local638 + arg0, 150 - Static67.anIntArray84[local1010], local403, arg2 + local186, local1116);
				}
				if (Static67.anIntArray83[local1010] == 4) {
					local515 = (150 - Static67.anIntArray84[local1010]) * (Static102.aClass114_3.method2472(local1116) + 100) / 150;
					Static107.aClass129_4.method4984(local186 + arg2 - 50, arg0, local186 + arg2 + 50, arg0 - -arg3);
					Static106.aClass9_2.method3573(-16777216, arg0 + local638, local1116, local186 + arg2 + 50 - local515, local403);
					Static107.aClass129_4.method4952(arg2, arg0, arg1 + arg2, arg3 + arg0);
				}
				if (Static67.anIntArray83[local1010] == 5) {
					local515 = 150 - Static67.anIntArray84[local1010];
					@Pc(1516) int local1516 = 0;
					if (local515 < 25) {
						local1516 = local515 - 25;
					} else if (local515 > 125) {
						local1516 = local515 - 125;
					}
					@Pc(1540) int local1540 = Static102.aClass114_3.anInt2911 + Static102.aClass114_3.anInt2912;
					Static107.aClass129_4.method4984(arg2, arg0 + local638 - local1540 - 1, arg2 - -arg1, arg0 + local638 + 5);
					Static106.aClass9_2.method3570(arg2 + local186, local638 + arg0 + local1516, -16777216, local1116, local403);
					Static107.aClass129_4.method4952(arg2, arg0, arg2 + arg1, arg3 + arg0);
				}
			} else {
				Static106.aClass9_2.method3570(arg2 + local186, arg0 + local638, -16777216, local1116, -256);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILclient!es;Lclient!es;)V")
	public static void method4185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class67_Sub1 arg3, @OriginalArg(4) Class67_Sub1 arg4) {
		if (Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static112.method1688(arg0, arg1, arg2);
		}
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub1_1 = arg3;
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub1_2 = arg4;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public static void method4191() {
		Static261.aClass26_46.method333();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I")
	public static int method4194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static162.anIntArray203[arg1 & 0x3] : Static152.anIntArray424[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	public static void method4195(@OriginalArg(1) int arg0) {
		Static289.anInt5724 = arg0;
		Static132.aClass26_21.method333();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!uo;)V")
	public static void method4196(@OriginalArg(1) Class129 arg0) {
		arg0.method4952(0, 0, Static164.anInt3090, 350);
		arg0.method4945(0, 0, Static164.anInt3090, 350, Static236.anInt4750 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static316.anIntArray508[local25];
			local35 = Static325.anIntArray88[local25];
			arg0.method4945(local31, local35, 2, 2, Static186.anIntArray286[local25] << 24 | 0xFFFFFF, 1);
		}
		local31 = 350 / Static96.anInt1757;
		if (Static6.anInt4028 > 0) {
			local35 = 346 - Static96.anInt1757 - 4;
			@Pc(84) int local84 = local35 * local31 / (Static6.anInt4028 + local31 - 1);
			@Pc(86) int local86 = 4;
			if (Static6.anInt4028 > 1) {
				local86 = (local35 - local84) * (Static6.anInt4028 - (Static23.anInt431 + 1)) / (Static6.anInt4028 - 1) + 4;
			}
			arg0.method4945(Static164.anInt3090 - 16, local86, 12, local84, Static236.anInt4750 << 24 | 0x332277, 2);
			for (@Pc(123) int local123 = Static23.anInt431; Static23.anInt431 + local31 > local123 && local123 < Static6.anInt4028; local123++) {
				@Pc(132) String[] local132 = Static313.method5273('\b', Static314.aStringArray21[local123]);
				@Pc(141) int local141 = (Static164.anInt3090 - 16 - 8) / local132.length;
				for (@Pc(143) int local143 = 0; local143 < local132.length; local143++) {
					@Pc(151) int local151 = local141 * local143 + 8;
					arg0.method4952(local151, 0, local141 + local151 - 8, 350);
					Static30.aClass9_1.method3573(-16777216, 350 - Static246.anInt4945 - Static332.aClass114_8.anInt2911 - Static96.anInt1757 * (local123 - Static23.anInt431) - 2, local132[local143], local151, -1);
				}
			}
		}
		arg0.method4952(0, 0, Static164.anInt3090, 350);
		arg0.method4998(Static164.anInt3090, 350 - Static246.anInt4945, -1, 0);
		Static106.aClass9_2.method3573(-16777216, 349 - Static102.aClass114_3.anInt2911, "--> " + Static55.aString9, 10, -1);
		local35 = -1;
		if (Static293.anInt5807 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method4940(12, local35, 339 - Static102.aClass114_3.anInt2911, Static102.aClass114_3.method2472("--> " + Static55.aString9.substring(0, Static328.anInt6296)) + 10);
	}
}
