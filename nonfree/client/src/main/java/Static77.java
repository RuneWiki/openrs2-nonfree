import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	public static int anInt6024;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!iia;")
	public static final Class142 aClass142_7 = new Class142();

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_14 = new Class101(14, 8);

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_100 = new Class73(25, 0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg2 < 0L) {
			local27 = true;
			arg2 = -arg2;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (arg1 > 0) {
			for (local53 = 0; local53 < arg1; local53++) {
				local58 = (int) arg2;
				arg2 /= 10L;
				local46.append((char) (local58 + 48 - (int) arg2 * 10));
			}
			local46.append(local7);
		}
		local53 = 0;
		while (true) {
			local58 = (int) arg2;
			arg2 /= 10L;
			local46.append((char) (local58 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local27) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg3) {
				local53++;
				if (local53 % 3 == 0) {
					local46.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method5028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static34.anInt3509 == 0 || Static497.anInt8648 == 0) {
			return;
		}
		@Pc(34) Class115 local34;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(41) int local41;
		@Pc(62) int local62;
		@Pc(68) int local68;
		if (Static238.aBoolean425) {
			Static252.method4480(false);
			local34 = arg2.method6115();
			@Pc(37) int[] local37 = arg2.Y();
			local41 = local37[3];
			local45 = local37[0];
			local49 = local37[2];
			local53 = local37[1];
			local62 = arg1 + Static43.method1508(false);
			local68 = Static618.method8474(false) + arg0;
		} else {
			arg2.DA(Static188.anInt4107, Static363.anInt9493, Static34.anInt3509, Static497.anInt8648);
			local41 = Static497.anInt8648;
			local53 = Static363.anInt9493;
			local45 = Static188.anInt4107;
			local49 = Static34.anInt3509;
			arg2.KA(Static304.anInt6167, Static151.anInt3537, Static34.anInt3509, Static497.anInt8648);
			local34 = arg2.method6184();
			local34.method6283(Static612.anInt10334, Static462.anInt8286, Static264.anInt5684, Static608.anInt10294, Static381.anInt7217, Static94.anInt2721);
			local62 = arg1;
			arg2.method6122(local34);
			local68 = arg0;
		}
		if (local49 == 0) {
			local49 = 1;
		}
		Static369.method5892(true);
		if (local41 == 0) {
			local41 = 1;
		}
		@Pc(137) int local137;
		@Pc(150) int local150;
		@Pc(159) int local159;
		@Pc(273) int local273;
		@Pc(282) int local282;
		@Pc(293) int local293;
		@Pc(304) int local304;
		@Pc(129) int local129;
		@Pc(352) int local352;
		if (Static150.aClass245Array2 != null && (!Static141.aBoolean262 || (Static38.anInt1411 & 0x40) != 0)) {
			local129 = -1;
			@Pc(131) int local131 = -1;
			@Pc(134) int local134 = arg2.i();
			local137 = arg2.XA();
			@Pc(160) int local160;
			@Pc(149) int local149;
			if (Static423.aBoolean622) {
				local150 = local149 = (local62 - local45) * Static32.anInt849 / local49;
				local160 = local159 = Static32.anInt849 * (local68 - local53) / local41;
			} else {
				local150 = (local62 - local45) * local134 / local49;
				local159 = local137 * (local68 - local53) / local41;
				local149 = local137 * (local62 - local45) / local49;
				local160 = (local68 - local53) * local134 / local41;
			}
			@Pc(211) int[] local211 = new int[] { local150, local160, local134 };
			@Pc(226) int[] local226 = new int[] { local149, local159, local137 };
			local34.method6298(local211);
			local34.method6298(local226);
			@Pc(260) float local260 = Static375.method5962(4, (float) local211[2], (float) local226[0], (float) local226[1], (float) local211[1], (float) local226[2], (float) local211[0]);
			if (local260 > 0.0F) {
				local273 = local226[0] - local211[0];
				local282 = local226[2] - local211[2];
				local293 = (int) ((float) local273 * local260 + (float) local211[0]);
				local304 = (int) ((float) local211[2] + (float) local282 * local260);
				local129 = local293 + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() - 1 << 8) >> 9;
				local131 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() - 1 << 8) + local304 >> 9;
				@Pc(331) byte local331 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135;
				if (local331 < 3 && (Static495.aByteArrayArrayArray17[1][local293 >> 9][local304 >> 9] & 0x2) != 0) {
					local352 = local331 + 1;
				}
			}
			if (local129 != -1 && local131 != -1) {
				if (Static141.aBoolean262 && (Static38.anInt1411 & 0x40) != 0) {
					@Pc(371) Class302 local371 = Static454.method6884(Static350.anInt6854, Static541.anInt9362);
					if (local371 == null) {
						Static516.method7391();
					} else {
						Static513.method7357(true, 0L, Static574.anInt9810, local129, " ->", true, local131, 46, (long) (local129 << 0 | local131), -1, false, Static381.aString72);
					}
				} else {
					if (Static26.aBoolean75) {
						Static513.method7357(true, 0L, -1, local129, "", true, local131, 60, (long) (local129 << 0 | local131), -1, false, Static536.aClass316_29.method7577(Static638.anInt10709));
					}
					Static513.method7357(true, 0L, Static365.anInt7043, local129, "", true, local131, 6, (long) (local129 << 0 | local131), -1, false, Static389.aString74);
				}
			}
		}
		if (Static238.aBoolean425) {
			Static375.method5974();
		}
		for (local129 = 0; local129 < (Static238.aBoolean425 ? 2 : 1); local129++) {
			@Pc(462) boolean local462 = local129 == 0;
			@Pc(468) Class100 local468 = local462 ? Static418.aClass100_1 : Static469.aClass100_3;
			local137 = arg1;
			local150 = arg0;
			if (Static238.aBoolean425) {
				Static252.method4480(local462);
				local137 = arg1 + Static43.method1508(local462);
				local150 = arg0 + Static618.method8474(local462);
			}
			@Pc(492) Class234 local492 = local468.aClass234_4;
			for (@Pc(497) Class9_Sub2 local497 = (Class9_Sub2) local492.method6092(); local497 != null; local497 = (Class9_Sub2) local492.method6098()) {
				if ((Static560.aBoolean765 || local497.aClass9_Sub4_1.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) && local497.method797(arg2, local137, local150)) {
					@Pc(536) int local536;
					if (local497.aClass9_Sub4_1 instanceof Class9_Sub4_Sub2) {
						local159 = ((Class9_Sub4_Sub2) local497.aClass9_Sub4_1).aShort115;
						local536 = ((Class9_Sub4_Sub2) local497.aClass9_Sub4_1).aShort114;
					} else {
						local159 = local497.aClass9_Sub4_1.anInt10360 >> 9;
						local536 = local497.aClass9_Sub4_1.anInt10357 >> 9;
					}
					@Pc(666) int local666;
					@Pc(678) int local678;
					@Pc(792) int local792;
					@Pc(562) int local562;
					if (local497.aClass9_Sub4_1 instanceof Class9_Sub4_Sub2_Sub1_Sub2) {
						@Pc(558) Class9_Sub4_Sub2_Sub1_Sub2 local558 = (Class9_Sub4_Sub2_Sub1_Sub2) local497.aClass9_Sub4_1;
						local562 = local558.method3620();
						if ((local562 & 0x1) == 0 && (local558.anInt10360 & 0x1FF) == 0 && (local558.anInt10357 & 0x1FF) == 0 || (local562 & 0x1) == 1 && (local558.anInt10360 & 0x1FF) == 256 && (local558.anInt10357 & 0x1FF) == 256) {
							local273 = local558.anInt10360 - (local558.method3620() - 1 << 8);
							local282 = local558.anInt10357 - (local558.method3620() - 1 << 8);
							for (local293 = 0; local293 < Static288.anInt5977; local293++) {
								@Pc(640) Class6_Sub42 local640 = (Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local293]);
								if (local640 != null) {
									@Pc(645) Class9_Sub4_Sub2_Sub1_Sub1 local645 = local640.aClass9_Sub4_Sub2_Sub1_Sub1_1;
									if (local645.anInt4339 != Static384.anInt7234 && local645.aBoolean350) {
										local666 = local645.anInt10360 - (local645.aClass158_1.anInt5826 - 1 << 8);
										local678 = local645.anInt10357 - (local645.aClass158_1.anInt5826 - 1 << 8);
										if (local666 >= local273 && local645.aClass158_1.anInt5826 <= local558.method3620() - (local666 - local273 >> 9) && local282 <= local678 && local645.aClass158_1.anInt5826 <= local558.method3620() - (local678 - local282 >> 9)) {
											Static112.method8726(local645, local497.aClass9_Sub4_1.aByte135 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135);
											local645.anInt4339 = Static384.anInt7234;
										}
									}
								}
							}
							local304 = Static6.anInt462;
							@Pc(756) int[] local756 = Static551.anIntArray503;
							for (local666 = 0; local666 < local304; local666++) {
								@Pc(766) Class9_Sub4_Sub2_Sub1_Sub2 local766 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local756[local666]];
								if (local766 != null && local766.anInt4339 != Static384.anInt7234 && local766 != local558 && local766.aBoolean350) {
									local792 = local766.anInt10360 - (local766.method3620() - 1 << 8);
									@Pc(804) int local804 = local766.anInt10357 - (local766.method3620() - 1 << 8);
									if (local792 >= local273 && local766.method3620() <= local558.method3620() - (local792 - local273 >> 9) && local282 <= local804 && local766.method3620() <= local558.method3620() - (local804 - local282 >> 9)) {
										Static321.method5334(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 != local497.aClass9_Sub4_1.aByte135, local766);
										local766.anInt4339 = Static384.anInt7234;
									}
								}
							}
						}
						if (local558.anInt4339 == Static384.anInt7234) {
							continue;
						}
						Static321.method5334(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 != local497.aClass9_Sub4_1.aByte135, local558);
						local558.anInt4339 = Static384.anInt7234;
					}
					if (local497.aClass9_Sub4_1 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
						@Pc(906) Class9_Sub4_Sub2_Sub1_Sub1 local906 = (Class9_Sub4_Sub2_Sub1_Sub1) local497.aClass9_Sub4_1;
						if (local906.aClass158_1 != null) {
							if ((local906.aClass158_1.anInt5826 & 0x1) == 0 && (local906.anInt10360 & 0x1FF) == 0 && (local906.anInt10357 & 0x1FF) == 0 || (local906.aClass158_1.anInt5826 & 0x1) == 1 && (local906.anInt10360 & 0x1FF) == 256 && (local906.anInt10357 & 0x1FF) == 256) {
								local562 = local906.anInt10360 - (local906.aClass158_1.anInt5826 - 1 << 8);
								local273 = local906.anInt10357 - (local906.aClass158_1.anInt5826 - 1 << 8);
								for (local282 = 0; local282 < Static288.anInt5977; local282++) {
									@Pc(989) Class6_Sub42 local989 = (Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local282]);
									if (local989 != null) {
										@Pc(994) Class9_Sub4_Sub2_Sub1_Sub1 local994 = local989.aClass9_Sub4_Sub2_Sub1_Sub1_1;
										if (Static384.anInt7234 != local994.anInt4339 && local906 != local994 && local994.aBoolean350) {
											local352 = local994.anInt10360 - (local994.aClass158_1.anInt5826 - 1 << 8);
											local666 = local994.anInt10357 - (local994.aClass158_1.anInt5826 - 1 << 8);
											if (local562 <= local352 && local906.aClass158_1.anInt5826 - (local352 - local562 >> 9) >= local994.aClass158_1.anInt5826 && local666 >= local273 && local906.aClass158_1.anInt5826 - (local666 - local273 >> 9) >= local994.aClass158_1.anInt5826) {
												Static112.method8726(local994, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 != local497.aClass9_Sub4_1.aByte135);
												local994.anInt4339 = Static384.anInt7234;
											}
										}
									}
								}
								local293 = Static6.anInt462;
								@Pc(1098) int[] local1098 = Static551.anIntArray503;
								for (local352 = 0; local352 < local293; local352++) {
									@Pc(1108) Class9_Sub4_Sub2_Sub1_Sub2 local1108 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local1098[local352]];
									if (local1108 != null && local1108.anInt4339 != Static384.anInt7234 && local1108.aBoolean350) {
										local678 = local1108.anInt10360 - (local1108.method3620() - 1 << 8);
										local792 = local1108.anInt10357 - (local1108.method3620() - 1 << 8);
										if (local678 >= local562 && local1108.method3620() <= local906.aClass158_1.anInt5826 - (local678 - local562 >> 9) && local792 >= local273 && local1108.method3620() <= local906.aClass158_1.anInt5826 - (local792 - local273 >> 9)) {
											Static321.method5334(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 != local497.aClass9_Sub4_1.aByte135, local1108);
											local1108.anInt4339 = Static384.anInt7234;
										}
									}
								}
							}
							if (local906.anInt4339 == Static384.anInt7234) {
								continue;
							}
							Static112.method8726(local906, local497.aClass9_Sub4_1.aByte135 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135);
							local906.anInt4339 = Static384.anInt7234;
						}
					}
					if (local497.aClass9_Sub4_1 instanceof Class9_Sub4_Sub4_Sub1) {
						@Pc(1242) int local1242 = Static477.anInt8412 + local159;
						local562 = local536 + Static227.anInt5049;
						@Pc(1264) Class6_Sub47 local1264 = (Class6_Sub47) Static283.aClass380_37.method8747((long) (local1242 | local562 << 14 | local497.aClass9_Sub4_1.aByte135 << 28));
						if (local1264 != null) {
							local282 = 0;
							@Pc(1276) Class6_Sub32 local1276 = (Class6_Sub32) local1264.aClass163_56.method4975();
							while (local1276 != null) {
								@Pc(1284) Class306 local1284 = Static356.aClass221_1.method5923(local1276.anInt5945);
								if (Static141.aBoolean262 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 == local497.aClass9_Sub4_1.aByte135) {
									@Pc(1307) Class164 local1307 = Static26.anInt771 == -1 ? null : Static69.aClass369_1.method8523(Static26.anInt771);
									if ((Static38.anInt1411 & 0x1) != 0 && (local1307 == null || local1284.method7408(Static26.anInt771, local1307.anInt5972) != local1307.anInt5972)) {
										Static513.method7357(true, (long) local1276.anInt5945, Static574.anInt9810, local159, Static275.aString109 + " -> <col=ff9040>" + local1284.aString93, false, local536, 58, (long) local282, -1, false, Static381.aString72);
									}
								}
								if (local497.aClass9_Sub4_1.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
									@Pc(1366) String[] local1366 = local1284.aStringArray31;
									for (local666 = 4; local666 >= 0; local666--) {
										if (local1366 != null && local1366[local666] != null) {
											@Pc(1378) byte local1378 = 0;
											if (local666 == 0) {
												local1378 = 13;
											}
											local792 = Static197.anInt6051;
											if (local666 == 1) {
												local1378 = 23;
											}
											if (local666 == 2) {
												local1378 = 2;
											}
											if (local666 == 3) {
												local1378 = 30;
											}
											if (local666 == local1284.anInt9053) {
												local792 = local1284.anInt9055;
											}
											if (local666 == 4) {
												local1378 = 18;
											}
											if (local1284.anInt9036 == local666) {
												local792 = local1284.anInt9089;
											}
											Static513.method7357(true, (long) local1276.anInt5945, local792, local159, "<col=ff9040>" + local1284.aString93, false, local536, local1378, (long) local282, -1, false, local1366[local666]);
										}
									}
								}
								Static513.method7357(true, (long) local1276.anInt5945, Static32.anInt843, local159, "<col=ff9040>" + local1284.aString93, false, local536, 1008, (long) local282, -1, local497.aClass9_Sub4_1.aByte135 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, Static536.aClass316_24.method7577(Static638.anInt10709));
								local1276 = (Class6_Sub32) local1264.aClass163_56.method4964();
								local282++;
							}
						}
					}
					if (local497.aClass9_Sub4_1 instanceof Interface22) {
						@Pc(1525) Interface22 local1525 = (Interface22) local497.aClass9_Sub4_1;
						@Pc(1534) Class356 local1534 = Static249.aClass310_1.method7474(local1525.method8436());
						if (local1534.anIntArray545 != null) {
							local1534 = local1534.method8322(Static140.aClass157_1);
						}
						if (local1534 != null) {
							if (Static141.aBoolean262 && local497.aClass9_Sub4_1.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
								@Pc(1567) Class164 local1567 = Static26.anInt771 == -1 ? null : Static69.aClass369_1.method8523(Static26.anInt771);
								if ((Static38.anInt1411 & 0x4) != 0 && (local1567 == null || local1534.method8336(local1567.anInt5972, Static26.anInt771) != local1567.anInt5972)) {
									Static513.method7357(true, Static637.method8734(local1525, local159, local536), Static574.anInt9810, local159, Static275.aString109 + " -> <col=00ffff>" + local1534.aString106, false, local536, 50, (long) local1525.hashCode(), -1, false, Static381.aString72);
								}
							}
							if (local497.aClass9_Sub4_1.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
								@Pc(1634) String[] local1634 = local1534.aStringArray38;
								if (local1634 != null) {
									for (local282 = 4; local282 >= 0; local282--) {
										if (local1634[local282] != null) {
											@Pc(1646) short local1646 = 0;
											if (local282 == 0) {
												local1646 = 15;
											}
											local304 = Static197.anInt6051;
											if (local282 == 1) {
												local1646 = 4;
											}
											if (local282 == 2) {
												local1646 = 8;
											}
											if (local282 == 3) {
												local1646 = 16;
											}
											if (local282 == local1534.anInt10255) {
												local304 = local1534.anInt10259;
											}
											if (local282 == 4) {
												local1646 = 1007;
											}
											if (local1534.anInt10210 == local282) {
												local304 = local1534.anInt10237;
											}
											Static513.method7357(true, Static637.method8734(local1525, local159, local536), local304, local159, "<col=00ffff>" + local1534.aString106, false, local536, local1646, (long) local1525.hashCode(), -1, false, local1634[local282]);
										}
									}
								}
								Static513.method7357(true, (long) local1534.anInt10211, Static32.anInt843, local159, "<col=00ffff>" + local1534.aString106, false, local536, 1009, (long) local1525.hashCode(), -1, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 != local497.aClass9_Sub4_1.aByte135, Static536.aClass316_24.method7577(Static638.anInt10709));
							}
						}
					}
				}
			}
			if (Static238.aBoolean425) {
				Static375.method5974();
			}
		}
		Static369.method5892(false);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method5031() {
		if (Static292.aClass5_5 != null) {
			Static292.aClass5_5.method6106();
			Static422.aClass34_8 = null;
			Static292.aClass5_5 = null;
		}
	}
}
