import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt2393 = 0;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_73 = new Class77(69, -1);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!km;II)V")
	public static void method2273(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static276.anInt4913 == 0 || Static78.anInt1505 == 0) {
			return;
		}
		arg1.method4506(Static279.anInt4940, Static195.anInt3565, Static276.anInt4913, Static78.anInt1505);
		arg1.method4477(Static390.anInt6703, Static214.anInt3952, Static276.anInt4913, Static78.anInt1505);
		@Pc(39) Class54 local39 = arg1.method4493();
		local39.method4792(Static118.anInt2269, Static2.anInt3794, Static193.anInt6660, Static226.anInt4222, Static32.anInt6040, Static125.anInt2370);
		arg1.method4533(local39);
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static39.aClass33Array2 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			@Pc(59) int local59 = arg1.method4529();
			local68 = (arg2 - Static279.anInt4940) * local59 / Static276.anInt4913;
			local77 = local59 * (arg0 - Static195.anInt3565) / Static78.anInt1505;
			local80 = arg1.method4518();
			local88 = (arg2 - Static279.anInt4940) * local80 / Static276.anInt4913;
			local97 = (arg0 - Static195.anInt3565) * local80 / Static78.anInt1505;
			local112 = new int[] { local68, local77, local59 };
			local39.method4788(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local80 };
			local39.method4788(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			@Pc(162) int local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) (local135 * (float) local162 + (float) local112[2]);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && local179 < Static392.anInt6751 && Static307.anInt5484 > local194) {
					@Pc(217) int local217 = Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74;
					if (local217 < 3 && (Static244.aByteArrayArrayArray4[1][local179][local194] & 0x2) != 0) {
						local217++;
					}
					if ((float) Static39.aClass33Array2[local217].method4055(local175, local190) < local135 * (float) local153 + (float) local112[1]) {
						local54 = local175 + Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() * 64 - 64 >> 7;
						local56 = local190 + Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() * 64 - 64 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Static68.aBoolean110 && (Static26.anInt622 & 0x40) != 0) {
					@Pc(343) Class155 local343 = Static257.method5607(Static106.anInt2069, Static54.anInt1110);
					if (local343 == null) {
						Static327.method5048();
					} else {
						Static163.method2688(false, local54, " ->", local56, 2, 0L, Static363.anInt5936, -1, Static258.aString34, true);
					}
				} else {
					if (Static209.aClass48_2 == Static77.aClass48_1) {
						Static163.method2688(false, local54, "", local56, 6, 0L, -1, -1, Static72.aClass221_52.method5229(Static189.anInt5185), true);
					}
					Static163.method2688(false, local54, "", local56, 9, 0L, -1, -1, Static73.aString17, true);
				}
			}
		}
		@Pc(363) Class56 local363 = Static371.aClass56_7;
		for (@Pc(368) Class22_Sub8 local368 = (Class22_Sub8) local363.method1259(); local368 != null; local368 = (Class22_Sub8) local363.method1254()) {
			if (local368.anInt6046 == Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 && local368.method5238(arg0, arg1, arg2)) {
				@Pc(483) int local483;
				if (local368.aClass12_1 instanceof Class12_Sub1_Sub2_Sub2) {
					@Pc(390) Class12_Sub1_Sub2_Sub2 local390 = (Class12_Sub1_Sub2_Sub2) local368.aClass12_1;
					local68 = local390.method4706();
					if ((local68 & 0x1) == 0 && (local390.anInt6328 & 0x7F) == 0 && (local390.anInt6317 & 0x7F) == 0 || (local68 & 0x1) == 1 && (local390.anInt6328 & 0x7F) == 64 && (local390.anInt6317 & 0x7F) == 64) {
						local77 = local390.anInt6328 - (local390.method4706() - 1) * 64;
						local80 = local390.anInt6317 + 64 - local390.method4706() * 64;
						@Pc(495) int local495;
						for (local88 = 0; local88 < Static199.anInt3672; local88++) {
							@Pc(461) Class12_Sub1_Sub2_Sub1 local461 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local88]];
							if (local461 != null && local461.anInt5366 != Static295.anInt5281 && local461.aBoolean421) {
								local483 = local461.anInt6328 + 64 - local461.aClass240_1.anInt6483 * 64;
								local495 = local461.anInt6317 + 64 - local461.aClass240_1.anInt6483 * 64;
								if (local77 <= local483 && local461.aClass240_1.anInt6483 <= local390.method4706() - (local483 - local77 >> 7) && local495 >= local80 && local461.aClass240_1.anInt6483 <= local390.method4706() - (local495 - local80 >> 7)) {
									Static101.method1815(local461, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local368.anInt6046);
									local461.anInt5366 = Static295.anInt5281;
								}
							}
						}
						local97 = Static168.anInt3003;
						local112 = Static7.anIntArray24;
						for (local495 = 0; local495 < local97; local495++) {
							@Pc(570) Class12_Sub1_Sub2_Sub2 local570 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local112[local495]];
							if (local570 != null && Static295.anInt5281 != local570.anInt5366 && local390 != local570 && local570.aBoolean421) {
								local144 = local570.anInt6328 - (local570.method4706() - 1) * 64;
								local153 = local570.anInt6317 + 64 - local570.method4706() * 64;
								if (local144 >= local77 && local570.method4706() <= local390.method4706() - (local144 - local77 >> 7) && local80 <= local153 && local570.method4706() <= local390.method4706() - (local153 - local80 >> 7)) {
									Static264.method4094(Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local368.anInt6046, local570);
									local570.anInt5366 = Static295.anInt5281;
								}
							}
						}
					}
					if (local390.anInt5366 == Static295.anInt5281) {
						continue;
					}
					Static264.method4094(Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local368.anInt6046, local390);
					local390.anInt5366 = Static295.anInt5281;
				}
				if (local368.aClass12_1 instanceof Class12_Sub1_Sub2_Sub1) {
					@Pc(703) Class12_Sub1_Sub2_Sub1 local703 = (Class12_Sub1_Sub2_Sub1) local368.aClass12_1;
					if (local703.aClass240_1 != null) {
						if ((local703.aClass240_1.anInt6483 & 0x1) == 0 && (local703.anInt6328 & 0x7F) == 0 && (local703.anInt6317 & 0x7F) == 0 || (local703.aClass240_1.anInt6483 & 0x1) == 1 && (local703.anInt6328 & 0x7F) == 64 && (local703.anInt6317 & 0x7F) == 64) {
							local68 = local703.anInt6328 + 64 - local703.aClass240_1.anInt6483 * 64;
							local77 = local703.anInt6317 - (local703.aClass240_1.anInt6483 - 1) * 64;
							for (local80 = 0; local80 < Static199.anInt3672; local80++) {
								@Pc(783) Class12_Sub1_Sub2_Sub1 local783 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local80]];
								if (local783 != null && Static295.anInt5281 != local783.anInt5366 && local703 != local783 && local783.aBoolean421) {
									local97 = local783.anInt6328 + 64 - local783.aClass240_1.anInt6483 * 64;
									local483 = local783.anInt6317 + 64 - local783.aClass240_1.anInt6483 * 64;
									if (local97 >= local68 && local703.aClass240_1.anInt6483 - (local97 - local68 >> 7) >= local783.aClass240_1.anInt6483 && local483 >= local77 && local703.aClass240_1.anInt6483 - (local483 - local77 >> 7) >= local783.aClass240_1.anInt6483) {
										Static101.method1815(local783, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local368.anInt6046);
										local783.anInt5366 = Static295.anInt5281;
									}
								}
							}
							local88 = Static168.anInt3003;
							@Pc(884) int[] local884 = Static7.anIntArray24;
							for (local483 = 0; local483 < local88; local483++) {
								@Pc(894) Class12_Sub1_Sub2_Sub2 local894 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local884[local483]];
								if (local894 != null && local894.anInt5366 != Static295.anInt5281 && local894.aBoolean421) {
									@Pc(916) int local916 = local894.anInt6328 + 64 - local894.method4706() * 64;
									local144 = local894.anInt6317 + 64 - local894.method4706() * 64;
									if (local916 >= local68 && local894.method4706() <= local703.aClass240_1.anInt6483 - (local916 - local68 >> 7) && local144 >= local77 && local894.method4706() <= local703.aClass240_1.anInt6483 - (local144 - local77 >> 7)) {
										Static264.method4094(local368.anInt6046 != Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, local894);
										local894.anInt5366 = Static295.anInt5281;
									}
								}
							}
						}
						if (local703.anInt5366 == Static295.anInt5281) {
							continue;
						}
						Static101.method1815(local703, local368.anInt6046 != Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74);
						local703.anInt5366 = Static295.anInt5281;
					}
				}
				if (local368.aClass12_1 instanceof Class12_Sub3_Sub1) {
					@Pc(1045) Class2_Sub5 local1045 = (Class2_Sub5) Static147.aClass214_14.method5059((long) (local368.anInt6043 | local368.anInt6046 << 28 | local368.anInt6047 << 14));
					if (local1045 != null) {
						for (@Pc(1053) Class2_Sub8 local1053 = (Class2_Sub8) local1045.aClass210_5.method5036(); local1053 != null; local1053 = (Class2_Sub8) local1045.aClass210_5.method5034()) {
							@Pc(1061) Class117 local1061 = Static106.aClass250_1.method5735(local1053.anInt683);
							if (!Static68.aBoolean110) {
								if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local368.anInt6046) {
									@Pc(1149) String[] local1149 = local1061.aStringArray18;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1149 != null && local1149[local88] != null) {
											@Pc(1161) byte local1161 = 0;
											if (local88 == 0) {
												local1161 = 4;
											}
											local483 = Static356.anInt6263;
											if (local88 == 1) {
												local1161 = 51;
											}
											if (local88 == 2) {
												local1161 = 30;
											}
											if (local88 == 3) {
												local1161 = 58;
											}
											if (local1061.anInt2844 == local88) {
												local483 = local1061.anInt2871;
											}
											if (local88 == 4) {
												local1161 = 47;
											}
											if (local1061.anInt2857 == local88) {
												local483 = local1061.anInt2881;
											}
											Static163.method2688(false, local368.anInt6043, "<col=ff9040>" + local1061.aString27, local368.anInt6047, local1161, (long) local1053.anInt683, local483, -1, local1149[local88], true);
										}
									}
								}
								Static163.method2688(local368.anInt6046 != Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, local368.anInt6043, "<col=ff9040>" + local1061.aString27, local368.anInt6047, 1002, (long) local1053.anInt683, Static359.anInt6307, -1, Static155.aClass221_105.method5229(Static189.anInt5185), true);
							} else if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local368.anInt6046) {
								@Pc(1083) Class61 local1083 = Static50.anInt1031 == -1 ? null : Static82.aClass184_1.method4403(Static50.anInt1031);
								if ((Static26.anInt622 & 0x1) != 0 && (local1083 == null || local1061.method2631(local1083.anInt1488, Static50.anInt1031) != local1083.anInt1488)) {
									Static163.method2688(false, local368.anInt6043, Static187.aString28 + " -> <col=ff9040>" + local1061.aString27, local368.anInt6047, 19, (long) local1053.anInt683, Static363.anInt5936, -1, Static258.aString34, true);
								}
							}
						}
					}
				}
				if (local368.aClass12_1 instanceof Interface11) {
					@Pc(1295) Interface11 local1295 = (Interface11) local368.aClass12_1;
					@Pc(1302) Class34 local1302 = Static11.aClass123_5.method2703(local1295.method5025());
					if (local1302.anIntArray122 != null) {
						local1302 = local1302.method831(Static248.aClass125_1);
					}
					if (local1302 != null) {
						if (!Static68.aBoolean110) {
							if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local368.anInt6046) {
								@Pc(1400) String[] local1400 = local1302.aStringArray6;
								if (local1400 != null) {
									for (local80 = 4; local80 >= 0; local80--) {
										if (local1400[local80] != null) {
											@Pc(1412) short local1412 = 0;
											if (local80 == 0) {
												local1412 = 11;
											}
											local97 = Static356.anInt6263;
											if (local80 == 1) {
												local1412 = 45;
											}
											if (local80 == 2) {
												local1412 = 46;
											}
											if (local80 == 3) {
												local1412 = 60;
											}
											if (local80 == local1302.anInt796) {
												local97 = local1302.anInt813;
											}
											if (local80 == 4) {
												local1412 = 1011;
											}
											if (local1302.anInt786 == local80) {
												local97 = local1302.anInt771;
											}
											Static163.method2688(false, local368.anInt6043, "<col=00ffff>" + local1302.aString6, local368.anInt6047, local1412, Static184.method5425(local1295, local368.anInt6047, local368.anInt6043), local97, -1, local1400[local80], true);
										}
									}
								}
							}
							Static163.method2688(Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local368.anInt6046, local368.anInt6043, "<col=00ffff>" + local1302.aString6, local368.anInt6047, 1007, (long) local1302.anInt802, Static359.anInt6307, -1, Static155.aClass221_105.method5229(Static189.anInt5185), true);
						} else if (Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local368.anInt6046) {
							@Pc(1333) Class61 local1333 = Static50.anInt1031 == -1 ? null : Static82.aClass184_1.method4403(Static50.anInt1031);
							if ((Static26.anInt622 & 0x4) != 0 && (local1333 == null || local1302.method823(local1333.anInt1488, Static50.anInt1031) != local1333.anInt1488)) {
								Static163.method2688(false, local368.anInt6043, Static187.aString28 + " -> <col=00ffff>" + local1302.aString6, local368.anInt6047, 22, Static184.method5425(local1295, local368.anInt6047, local368.anInt6043), Static363.anInt5936, -1, Static258.aString34, true);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method2274() {
		@Pc(1) Class154 local1 = Static285.aClass154_38;
		synchronized (Static285.aClass154_38) {
			Static285.aClass154_38.method3748();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class22_Sub5 local7 = new Class22_Sub5();
		local7.anInt2241 = arg0;
		local7.aString25 = arg2;
		local7.anInt2242 = Static295.anInt5281 + arg1;
		local7.anInt2246 = arg3;
		local7.anInt2245 = arg5;
		local7.anInt2239 = arg6;
		local7.anInt2243 = arg4;
		Static55.aClass56_2.method1253(local7);
	}
}
