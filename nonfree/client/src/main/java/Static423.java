import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	public static int anInt7490 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method6073() {
		Static451.aClass99_69 = new Class99();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public static int method6074() {
		return Static484.anInt8950;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)I")
	public static int method6075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static545.anIntArray729[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIII)V")
	public static void method6076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static103.anInt992;
		@Pc(9) int[] local9 = Static523.anIntArray682;
		Static545.anInt9126 = 0;
		@Pc(167) int local167;
		@Pc(188) int local188;
		@Pc(242) int local242;
		@Pc(320) int local320;
		@Pc(403) int local403;
		@Pc(861) int local861;
		@Pc(506) int local506;
		for (@Pc(13) int local13 = 0; local13 < Static438.anInt7689 + local7; local13++) {
			@Pc(17) Class305 local17 = null;
			@Pc(26) Class15_Sub2_Sub1 local26;
			if (local13 < local7) {
				local26 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local9[local13]];
			} else {
				local26 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local13 - local7])).aClass15_Sub2_Sub1_Sub2_2;
				local17 = ((Class15_Sub2_Sub1_Sub2) local26).aClass305_1;
				if (local17.anIntArray679 != null) {
					local17 = local17.method7150(Static540.aClass242_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt4697 >= 0 && (Static314.anInt4188 == local26.anInt4701 || local26.aByte91 == Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91)) {
				Static98.method2075(local26, arg0 >> 1, local26.method4038(), arg2 >> 1);
				if (Static469.anIntArray626[0] >= 0) {
					if (local26.aString47 != null && (local13 >= local7 || Static58.anInt1190 == 0 || Static58.anInt1190 == 3 || Static58.anInt1190 == 1 && Static444.method6295(((Class15_Sub2_Sub1_Sub1) local26).aString18)) && Static315.anInt6125 > Static545.anInt9126) {
						Static315.anIntArray421[Static545.anInt9126] = Static312.aClass256_7.method6113(local26.aString47) / 2;
						Static315.anIntArray419[Static545.anInt9126] = Static469.anIntArray626[0];
						Static315.anIntArray423[Static545.anInt9126] = Static469.anIntArray626[1];
						Static315.anIntArray420[Static545.anInt9126] = local26.anInt4676;
						Static315.anIntArray424[Static545.anInt9126] = local26.anInt4733;
						Static315.anIntArray422[Static545.anInt9126] = local26.anInt4751;
						Static315.aStringArray28[Static545.anInt9126] = local26.aString47;
						Static545.anInt9126++;
					}
					local167 = arg3 + Static469.anIntArray626[1];
					@Pc(227) Class25[] local227;
					@Pc(234) Class96[] local234;
					@Pc(292) Class25 local292;
					if (local26.aBoolean300 || Static481.anInt8318 >= local26.anInt4739) {
						local167 -= Math.max(Static312.aClass256_7.anInt7541, Static356.aClass25Array15[0].la());
					} else {
						@Pc(178) byte local178 = 1;
						if (local13 >= local7) {
							local188 = local17.anInt8825;
							if (local188 == -1) {
								local188 = local26.method4026().anInt8101;
							}
						} else {
							@Pc(205) Class15_Sub2_Sub1_Sub1 local205 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local9[local13]];
							local188 = local26.method4026().anInt8101;
							if (local205.aBoolean33) {
								local178 = 2;
							}
						}
						@Pc(217) Class25[] local217 = Static356.aClass25Array15;
						if (local188 != -1) {
							local227 = (Class25[]) Static337.aClass288_44.method6745((long) local188);
							if (local227 == null) {
								local234 = Static551.method2429(Static533.aClass117_228, local188);
								if (local234 != null) {
									local227 = new Class25[local234.length];
									for (local242 = 0; local242 < local234.length; local242++) {
										local227[local242] = Static110.aClass62_15.method6998(local234[local242]);
									}
									Static337.aClass288_44.method6746(local227, (long) local188);
								}
							}
							if (local227 != null && local227.length >= 2) {
								local217 = local227;
							}
						}
						if (local178 >= local217.length) {
							local178 = 1;
						}
						@Pc(288) Class25 local288 = local217[0];
						local292 = local217[local178];
						local167 -= Math.max(Static312.aClass256_7.anInt7541, local288.la());
						local242 = arg1 + Static469.anIntArray626[0] - (local288.c() >> 1);
						local320 = local288.c() * local26.anInt4740 / 255;
						if (local26.anInt4740 > 0 && local320 < 2) {
							local320 = 2;
						}
						local288.method6956(local242, local167);
						Static110.aClass62_15.F(local242, local167, local242 + local320, local288.la() + local167);
						local292.method6956(local242, local167);
						Static110.aClass62_15.N(arg1, arg3, arg1 + arg2, arg0 + arg3);
					}
					local167 -= 2;
					if (!local26.aBoolean300) {
						@Pc(386) Class25 local386;
						if (local26.anInt4691 > Static481.anInt8318) {
							local386 = Static301.aClass25Array14[local26.aBoolean301 ? 2 : 0];
							@Pc(395) Class25 local395 = Static301.aClass25Array14[local26.aBoolean301 ? 3 : 1];
							if (local26 instanceof Class15_Sub2_Sub1_Sub2) {
								local403 = local17.anInt8829;
								if (local403 == -1) {
									local403 = local26.method4026().anInt8110;
								}
							} else {
								local403 = local26.method4026().anInt8110;
							}
							if (local403 != -1) {
								local227 = (Class25[]) Static443.aClass288_57.method6745((long) local403);
								if (local227 == null) {
									local234 = Static551.method2429(Static533.aClass117_228, local403);
									if (local234 != null) {
										local227 = new Class25[local234.length];
										for (local242 = 0; local242 < local234.length; local242++) {
											local227[local242] = Static110.aClass62_15.method6998(local234[local242]);
										}
										Static443.aClass288_57.method6746(local227, (long) local403);
									}
								}
								if (local227 != null && local227.length == 4) {
									local386 = local227[local26.aBoolean301 ? 2 : 0];
									local395 = local227[local26.aBoolean301 ? 3 : 1];
								}
							}
							@Pc(499) int local499 = local26.anInt4691 - Static481.anInt8318;
							if (local499 <= local26.anInt4679) {
								local506 = local386.c();
							} else {
								local499 -= local26.anInt4679;
								local242 = local26.anInt4722 == 0 ? 0 : (local26.anInt4700 - local499) / local26.anInt4722 * local26.anInt4722;
								local506 = local386.c() * local242 / local26.anInt4700;
							}
							local242 = local386.la();
							local167 -= local242;
							local320 = Static469.anIntArray626[0] + arg1 - (local386.c() >> 1);
							local386.method6956(local320, local167);
							Static110.aClass62_15.F(local320, local167, local320 + local506, local167 + local242);
							local395.method6956(local320, local167);
							local167 -= 2;
							Static110.aClass62_15.N(arg1, arg3, arg1 + arg2, arg0 + arg3);
						}
						if (local7 > local13) {
							@Pc(598) Class15_Sub2_Sub1_Sub1 local598 = (Class15_Sub2_Sub1_Sub1) local26;
							if (local598.anInt848 != -1) {
								local167 -= 25;
								Static84.aClass25Array4[local598.anInt848].method6956(arg1 + Static469.anIntArray626[0] - 12, local167);
								local167 -= 2;
							}
							if (local598.anInt853 != -1) {
								local167 -= 25;
								Static77.aClass25Array13[local598.anInt853].method6956(Static469.anIntArray626[0] + arg1 - 12, local167);
								local167 -= 2;
							}
						} else if (local17.anInt8822 >= 0 && Static77.aClass25Array13.length > local17.anInt8822) {
							local386 = Static77.aClass25Array13[local17.anInt8822];
							local167 -= 25;
							local386.method6956(arg1 + Static469.anIntArray626[0] - (local386.c() >> 1), local167);
							local167 -= 2;
						}
					}
					@Pc(685) Class34[] local685;
					@Pc(693) Class34 local693;
					if (!(local26 instanceof Class15_Sub2_Sub1_Sub1)) {
						local188 = 0;
						local685 = Static531.aClass34Array1;
						for (local403 = 0; local403 < local685.length; local403++) {
							local693 = local685[local403];
							if (local693 != null && local693.anInt976 == 1 && local693.anInt973 == Static547.anIntArray731[local13 - local7]) {
								local292 = Static438.aClass25Array16[local693.anInt975];
								if (local188 < local292.la()) {
									local188 = local292.la();
								}
								if (Static481.anInt8318 % 20 < 10) {
									local292.method6956(Static469.anIntArray626[0] + arg1 - 12, local167 - local292.la());
								}
							}
						}
						if (local188 > 0) {
						}
					} else if (local13 >= 0) {
						local188 = 0;
						local685 = Static531.aClass34Array1;
						for (local403 = 0; local403 < local685.length; local403++) {
							local693 = local685[local403];
							if (local693 != null && local693.anInt976 == 10 && local693.anInt973 == local9[local13]) {
								local292 = Static438.aClass25Array16[local693.anInt975];
								if (local188 < local292.la()) {
									local188 = local292.la();
								}
								local292.method6956(arg1 + Static469.anIntArray626[0] - 12, -local292.la() + local167);
							}
						}
						if (local188 > 0) {
						}
					}
					for (local188 = 0; local188 < 4; local188++) {
						if (local26.anIntArray304[local188] > Static481.anInt8318) {
							local861 = local26.method4038() / 2;
							Static98.method2075(local26, arg0 >> 1, local861, arg2 >> 1);
							if (Static469.anIntArray626[0] > -1) {
								local403 = Static45.aClass25Array2[local26.anIntArray305[local188]].c();
								if (local188 == 1) {
									Static469.anIntArray626[1] -= 20;
								}
								if (local188 == 2) {
									Static469.anIntArray626[0] -= local403 - 9;
									Static469.anIntArray626[1] -= 10;
								}
								if (local188 == 3) {
									Static469.anIntArray626[0] += local403 - 9;
									Static469.anIntArray626[1] -= 10;
								}
								Static45.aClass25Array2[local26.anIntArray305[local188]].method6956(Static469.anIntArray626[0] + arg1 - (local403 >> 1), arg3 + -12 + Static469.anIntArray626[1]);
								Static121.aClass13_1.method7204(Integer.toString(local26.anIntArray303[local188]), arg1 + Static469.anIntArray626[0] - 1, 0, arg3 + Static469.anIntArray626[1] + 3, -1);
							}
						}
					}
				}
			}
		}
		@Pc(1010) int local1010;
		for (@Pc(1004) int local1004 = 0; local1004 < Static339.anInt6369; local1004++) {
			local1010 = Static34.anIntArray62[local1004];
			@Pc(1019) Class15_Sub2_Sub1 local1019;
			if (local1010 < 2048) {
				local1019 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local1010];
			} else {
				local1019 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) (local1010 - 2048))).aClass15_Sub2_Sub1_Sub2_2;
			}
			local188 = Static378.anIntArray547[local1004];
			@Pc(1050) Class15_Sub2_Sub1 local1050;
			if (local188 >= 2048) {
				local1050 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) (local188 - 2048))).aClass15_Sub2_Sub1_Sub2_2;
			} else {
				local1050 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local188];
			}
			Static169.method3006(local1050, arg2, arg1, arg3, local1019, --local1019.anInt4723, arg0);
		}
		local1010 = Static312.aClass256_7.anInt7540 + Static312.aClass256_7.anInt7541 + 2;
		for (local167 = 0; local167 < Static545.anInt9126; local167++) {
			local188 = Static315.anIntArray419[local167];
			local861 = Static315.anIntArray423[local167];
			local403 = Static315.anIntArray421[local167];
			@Pc(1108) boolean local1108 = true;
			while (local1108) {
				local1108 = false;
				for (local506 = 0; local506 < local167; local506++) {
					if (Static315.anIntArray423[local506] - local1010 < local861 + 2 && local861 - local1010 < Static315.anIntArray423[local506] - -2 && Static315.anIntArray421[local506] + Static315.anIntArray419[local506] > -local403 + local188 && local188 + local403 > -Static315.anIntArray421[local506] + Static315.anIntArray419[local506] && Static315.anIntArray423[local506] - local1010 < local861) {
						local861 = Static315.anIntArray423[local506] - local1010;
						local1108 = true;
					}
				}
			}
			Static315.anIntArray423[local167] = local861;
			@Pc(1211) String local1211 = Static315.aStringArray28[local167];
			if (Static507.anInt8630 == 0) {
				local242 = 16776960;
				if (Static315.anIntArray420[local167] < 6) {
					local242 = Static14.anIntArray22[Static315.anIntArray420[local167]];
				}
				if (Static315.anIntArray420[local167] == 6) {
					local242 = Static314.anInt4188 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static315.anIntArray420[local167] == 7) {
					local242 = Static314.anInt4188 % 20 < 10 ? 255 : 65535;
				}
				if (Static315.anIntArray420[local167] == 8) {
					local242 = Static314.anInt4188 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static315.anIntArray420[local167] == 9) {
					local320 = 150 - Static315.anIntArray422[local167];
					if (local320 < 50) {
						local242 = local320 * 1280 + 16711680;
					} else if (local320 < 100) {
						local242 = 16776960 - (local320 - 50) * 327680;
					} else if (local320 < 150) {
						local242 = (local320 - 100) * 5 + 65280;
					}
				}
				if (Static315.anIntArray420[local167] == 10) {
					local320 = 150 - Static315.anIntArray422[local167];
					if (local320 < 50) {
						local242 = local320 * 5 + 16711680;
					} else if (local320 < 100) {
						local242 = 16711935 + 16384000 - local320 * 327680;
					} else if (local320 < 150) {
						local242 = local320 * 327680 - (local320 - 100) * 5 - 32767745;
					}
				}
				if (Static315.anIntArray420[local167] == 11) {
					local320 = 150 - Static315.anIntArray422[local167];
					if (local320 < 50) {
						local242 = 16777215 - local320 * 327685;
					} else if (local320 < 100) {
						local242 = (local320 - 50) * 327685 + 65280;
					} else if (local320 < 150) {
						local242 = 32768000 + 16777215 - local320 * 327680;
					}
				}
				local320 = local242 | 0xFF000000;
				if (Static315.anIntArray424[local167] == 0) {
					Static130.aClass13_2.method7204(local1211, arg1 + local188, -16777216, arg3 + local861, local320);
				}
				if (Static315.anIntArray424[local167] == 1) {
					Static130.aClass13_2.method7212(local320, Static314.anInt4188, local1211, local188 + arg1, arg3 - -local861);
				}
				if (Static315.anIntArray424[local167] == 2) {
					Static130.aClass13_2.method7202(local320, local861 + arg3, local1211, arg1 + local188, Static314.anInt4188);
				}
				if (Static315.anIntArray424[local167] == 3) {
					Static130.aClass13_2.method7213(Static314.anInt4188, 150 - Static315.anIntArray422[local167], arg3 + local861, local320, local188 + arg1, local1211);
				}
				@Pc(1567) int local1567;
				if (Static315.anIntArray424[local167] == 4) {
					local1567 = (150 - Static315.anIntArray422[local167]) * (Static312.aClass256_7.method6113(local1211) + 100) / 150;
					Static110.aClass62_15.F(arg1 + local188 - 50, arg3, arg1 + local188 + 50, arg3 - -arg0);
					Static130.aClass13_2.method7211(-16777216, local188 + arg1 + 50 - local1567, arg3 - -local861, local1211, local320);
					Static110.aClass62_15.N(arg1, arg3, arg1 + arg2, arg3 + arg0);
				}
				if (Static315.anIntArray424[local167] == 5) {
					local1567 = 150 - Static315.anIntArray422[local167];
					@Pc(1628) int local1628 = 0;
					if (local1567 < 25) {
						local1628 = local1567 - 25;
					} else if (local1567 > 125) {
						local1628 = local1567 - 125;
					}
					@Pc(1652) int local1652 = Static312.aClass256_7.anInt7541 + Static312.aClass256_7.anInt7540;
					Static110.aClass62_15.F(arg1, arg3 + local861 - local1652 - 1, arg1 - -arg2, arg3 + local861 + 5);
					Static130.aClass13_2.method7204(local1211, local188 + arg1, -16777216, local861 + arg3 + local1628, local320);
					Static110.aClass62_15.N(arg1, arg3, arg2 + arg1, arg0 + arg3);
				}
			} else {
				Static130.aClass13_2.method7204(local1211, local188 + arg1, -16777216, arg3 + local861, -256);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!jk;III)V")
	public static void method6077(@OriginalArg(0) Class15_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0.anInt4711 && arg2 != -1) {
			@Pc(21) Class31 local21 = Static155.aClass76_2.method2152(arg2);
			@Pc(24) int local24 = local21.anInt923;
			if (local24 == 1) {
				arg0.anInt4690 = 0;
				arg0.anInt4714 = arg1;
				arg0.anInt4730 = 1;
				arg0.anInt4709 = 0;
				arg0.anInt4704 = 0;
				Static279.method4554(false, arg0.anInt8493, arg0.anInt4709, local21, arg0.anInt8492, arg0.aByte91);
			}
			if (local24 == 2) {
				arg0.anInt4690 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4711 == -1 || Static155.aClass76_2.method2152(arg2).anInt933 >= Static155.aClass76_2.method2152(arg0.anInt4711).anInt933) {
			arg0.anInt4714 = arg1;
			arg0.anInt4711 = arg2;
			arg0.anInt4690 = 0;
			arg0.anInt4730 = 1;
			arg0.anInt4709 = 0;
			arg0.anInt4756 = arg0.anInt4753;
			arg0.anInt4704 = 0;
			if (arg0.anInt4711 != -1) {
				Static279.method4554(false, arg0.anInt8493, arg0.anInt4709, Static155.aClass76_2.method2152(arg0.anInt4711), arg0.anInt8492, arg0.aByte91);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Z")
	public static boolean method6078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method6080() {
		if (Static110.aClass62_15.method7020()) {
			Static110.aClass62_15.method7014(Static209.aCanvas6);
			Static92.method1976();
			Static110.aClass62_15.method7026(Static209.aCanvas6);
			Static110.aClass62_15.method7015(Static209.aCanvas6);
		} else {
			Static77.method4915(Static17.anInt459);
		}
		Static544.method2108();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ae;Lclient!co;BI)V")
	public static void method6082(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class5_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class5_Sub41 local20 = new Class5_Sub41();
		local20.anInt7534 = arg1.method4220();
		local20.anInt7532 = arg1.method4230();
		local20.aClass83Array2 = new Class83[local20.anInt7534];
		local20.anIntArray571 = new int[local20.anInt7534];
		local20.aClass83Array1 = new Class83[local20.anInt7534];
		local20.anIntArray573 = new int[local20.anInt7534];
		local20.anIntArray572 = new int[local20.anInt7534];
		local20.aByteArrayArrayArray16 = new byte[local20.anInt7534][][];
		for (@Pc(62) int local62 = 0; local62 < local20.anInt7534; local62++) {
			try {
				@Pc(68) int local68 = arg1.method4220();
				@Pc(95) String local95;
				@Pc(99) String local99;
				@Pc(105) int local105;
				if (local68 == 0 || local68 == 1 || local68 == 2) {
					local95 = arg1.method4234();
					local99 = arg1.method4234();
					local105 = 0;
					if (local68 == 1) {
						local105 = arg1.method4230();
					}
					local20.anIntArray572[local62] = local68;
					local20.anIntArray571[local62] = local105;
					local20.aClass83Array1[local62] = arg0.method297(Static371.method5607(local95), local99);
				} else if (local68 == 3 || local68 == 4) {
					local95 = arg1.method4234();
					local99 = arg1.method4234();
					local105 = arg1.method4220();
					@Pc(108) String[] local108 = new String[local105];
					for (@Pc(110) int local110 = 0; local110 < local105; local110++) {
						local108[local110] = arg1.method4234();
					}
					@Pc(125) byte[][] local125 = new byte[local105][];
					@Pc(136) int local136;
					if (local68 == 3) {
						for (@Pc(130) int local130 = 0; local130 < local105; local130++) {
							local136 = arg1.method4230();
							local125[local130] = new byte[local136];
							arg1.method4177(local125[local130], local136);
						}
					}
					local20.anIntArray572[local62] = local68;
					@Pc(161) Class[] local161 = new Class[local105];
					for (local136 = 0; local136 < local105; local136++) {
						local161[local136] = Static371.method5607(local108[local136]);
					}
					local20.aClass83Array2[local62] = arg0.method281(Static371.method5607(local95), local161, local99);
					local20.aByteArrayArrayArray16[local62] = local125;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local20.anIntArray573[local62] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local20.anIntArray573[local62] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local20.anIntArray573[local62] = -3;
			} catch (@Pc(259) Exception local259) {
				local20.anIntArray573[local62] = -4;
			} catch (@Pc(266) Throwable local266) {
				local20.anIntArray573[local62] = -5;
			}
		}
		Static451.aClass99_69.method2513(local20);
	}
}
