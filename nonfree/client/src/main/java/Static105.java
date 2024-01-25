import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!du", name = "e", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIBIIII)V")
	public static void method1892(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static403.anInt6982;
		Static83.anInt1830 = 0;
		@Pc(11) int[] local11 = Static430.anIntArray447;
		@Pc(174) int local174;
		@Pc(199) int local199;
		@Pc(244) int local244;
		@Pc(315) int local315;
		@Pc(402) int local402;
		@Pc(850) int local850;
		@Pc(530) int local530;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static88.anInt1884; local13++) {
			@Pc(17) Class264 local17 = null;
			@Pc(26) Class41_Sub2_Sub1_Sub4 local26;
			if (local7 > local13) {
				local26 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local11[local13]];
			} else {
				local26 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local13 - local7])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
				local17 = ((Class41_Sub2_Sub1_Sub4_Sub1) local26).aClass264_1;
				if (local17.anIntArray443 != null) {
					local17 = local17.method5994(Static491.aClass318_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt9530 >= 0 && (Static81.anInt1761 == local26.anInt9500 || Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 == local26.aByte117)) {
				Static196.method7553(local26, arg2 >> 1, local26.method7860(), arg0 >> 1);
				if (Static22.anIntArray20[0] >= 0) {
					if (local26.aString94 != null && (local13 >= local7 || Static475.anInt7863 == 0 || Static475.anInt7863 == 3 || Static475.anInt7863 == 1 && Static154.method2915(((Class41_Sub2_Sub1_Sub4_Sub2) local26).aString95)) && Static583.anInt9413 > Static83.anInt1830) {
						Static583.anIntArray617[Static83.anInt1830] = Static75.aClass134_7.method3348(local26.aString94) / 2;
						Static583.anIntArray618[Static83.anInt1830] = Static22.anIntArray20[0];
						Static583.anIntArray619[Static83.anInt1830] = Static22.anIntArray20[1];
						Static583.anIntArray615[Static83.anInt1830] = local26.anInt9495;
						Static583.anIntArray614[Static83.anInt1830] = local26.anInt9475;
						Static583.anIntArray616[Static83.anInt1830] = local26.anInt9494;
						Static583.aStringArray39[Static83.anInt1830] = local26.aString94;
						Static83.anInt1830++;
					}
					local174 = arg3 + Static22.anIntArray20[1];
					@Pc(229) Class14[] local229;
					@Pc(236) Class279[] local236;
					@Pc(288) Class14 local288;
					if (local26.aBoolean740 || local26.anInt9501 <= Static506.anInt8251) {
						local174 -= Math.max(Static75.aClass134_7.anInt3765, Static17.aClass14Array5[0].u());
					} else {
						@Pc(185) byte local185 = 1;
						if (local7 > local13) {
							@Pc(194) Class41_Sub2_Sub1_Sub4_Sub2 local194 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local11[local13]];
							local199 = local26.method7861().anInt9725;
							if (local194.aBoolean743) {
								local185 = 2;
							}
						} else {
							local199 = local17.anInt7152;
							if (local199 == -1) {
								local199 = local26.method7861().anInt9725;
							}
						}
						@Pc(219) Class14[] local219 = Static17.aClass14Array5;
						if (local199 != -1) {
							local229 = (Class14[]) Static536.aClass6_62.method92((long) local199);
							if (local229 == null) {
								local236 = Static604.method6156(Static552.aClass322_150, local199);
								if (local236 != null) {
									local229 = new Class14[local236.length];
									for (local244 = 0; local244 < local236.length; local244++) {
										local229[local244] = Static505.aClass45_11.method7398(local236[local244], true);
									}
									Static536.aClass6_62.method106((long) local199, local229);
								}
							}
							if (local229 != null && local229.length >= 2) {
								local219 = local229;
							}
						}
						if (local185 >= local219.length) {
							local185 = 1;
						}
						@Pc(284) Class14 local284 = local219[0];
						local288 = local219[local185];
						local174 -= Math.max(Static75.aClass134_7.anInt3765, local284.u());
						local244 = Static22.anIntArray20[0] + arg1 - (local284.E() >> 1);
						local315 = local284.E() * local26.anInt9465 / 255;
						if (local26.anInt9465 > 0 && local315 < 2) {
							local315 = 2;
						}
						local284.method7680(local244, local174);
						Static505.aClass45_11.V(local244, local174, local315 + local244, local174 + local284.u());
						local288.method7680(local244, local174);
						Static505.aClass45_11.da(arg1, arg3, arg1 + arg2, arg3 + arg0);
					}
					local174 -= 2;
					if (!local26.aBoolean740) {
						@Pc(385) Class14 local385;
						if (Static506.anInt8251 < local26.anInt9518) {
							local385 = Static367.aClass14Array13[local26.aBoolean738 ? 2 : 0];
							@Pc(394) Class14 local394 = Static367.aClass14Array13[local26.aBoolean738 ? 3 : 1];
							if (local26 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
								local402 = local17.anInt7153;
								if (local402 == -1) {
									local402 = local26.method7861().anInt9752;
								}
							} else {
								local402 = local26.method7861().anInt9752;
							}
							if (local402 != -1) {
								local229 = (Class14[]) Static328.aClass6_38.method92((long) local402);
								if (local229 == null) {
									local236 = Static604.method6156(Static552.aClass322_150, local402);
									if (local236 != null) {
										local229 = new Class14[local236.length];
										for (local244 = 0; local244 < local236.length; local244++) {
											local229[local244] = Static505.aClass45_11.method7398(local236[local244], true);
										}
										Static328.aClass6_38.method106((long) local402, local229);
									}
								}
								if (local229 != null && local229.length == 4) {
									local394 = local229[local26.aBoolean738 ? 3 : 1];
									local385 = local229[local26.aBoolean738 ? 2 : 0];
								}
							}
							@Pc(494) int local494 = local26.anInt9518 - Static506.anInt8251;
							if (local494 > local26.anInt9458) {
								local494 -= local26.anInt9458;
								local244 = local26.anInt9469 == 0 ? 0 : local26.anInt9469 * ((local26.anInt9471 - local494) / local26.anInt9469);
								local530 = local385.E() * local244 / local26.anInt9471;
							} else {
								local530 = local385.E();
							}
							local244 = local385.u();
							local174 -= local244;
							local315 = Static22.anIntArray20[0] + arg1 - (local385.E() >> 1);
							local385.method7680(local315, local174);
							Static505.aClass45_11.V(local315, local174, local530 + local315, local174 - -local244);
							local394.method7680(local315, local174);
							local174 -= 2;
							Static505.aClass45_11.da(arg1, arg3, arg1 + arg2, arg3 - -arg0);
						}
						if (local7 > local13) {
							@Pc(624) Class41_Sub2_Sub1_Sub4_Sub2 local624 = (Class41_Sub2_Sub1_Sub4_Sub2) local26;
							if (local624.anInt9557 != -1) {
								local174 -= 25;
								Static210.aClass14Array11[local624.anInt9557].method7680(Static22.anIntArray20[0] + arg1 - 12, local174);
								local174 -= 2;
							}
							if (local624.anInt9575 != -1) {
								local174 -= 25;
								Static16.aClass14Array4[local624.anInt9575].method7680(Static22.anIntArray20[0] + arg1 - 12, local174);
								local174 -= 2;
							}
						} else if (local17.anInt7134 >= 0 && local17.anInt7134 < Static16.aClass14Array4.length) {
							local385 = Static16.aClass14Array4[local17.anInt7134];
							local174 -= 25;
							local385.method7680(arg1 + Static22.anIntArray20[0] - (local385.E() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(669) Class205[] local669;
					@Pc(677) Class205 local677;
					if (!(local26 instanceof Class41_Sub2_Sub1_Sub4_Sub2)) {
						local199 = 0;
						local669 = Static283.aClass205Array1;
						for (local402 = 0; local402 < local669.length; local402++) {
							local677 = local669[local402];
							if (local677 != null && local677.anInt5477 == 1 && Static445.anIntArray470[local13 - local7] == local677.anInt5482) {
								local288 = Static506.aClass14Array15[local677.anInt5471];
								if (local288.u() > local199) {
									local199 = local288.u();
								}
								if (Static506.anInt8251 % 20 < 10) {
									local288.method7680(arg1 + Static22.anIntArray20[0] - 12, local174 + -local288.u());
								}
							}
						}
						if (local199 > 0) {
						}
					} else if (local13 >= 0) {
						local199 = 0;
						local669 = Static283.aClass205Array1;
						for (local402 = 0; local402 < local669.length; local402++) {
							local677 = local669[local402];
							if (local677 != null && local677.anInt5477 == 10 && local11[local13] == local677.anInt5482) {
								local288 = Static506.aClass14Array15[local677.anInt5471];
								if (local199 < local288.u()) {
									local199 = local288.u();
								}
								local288.method7680(Static22.anIntArray20[0] + arg1 - 12, -local288.u() + local174);
							}
						}
						if (local199 > 0) {
						}
					}
					for (local199 = 0; local199 < 4; local199++) {
						if (Static506.anInt8251 < local26.anIntArray624[local199]) {
							local850 = local26.method7860() / 2;
							Static196.method7553(local26, arg2 >> 1, local850, arg0 >> 1);
							if (Static22.anIntArray20[0] > -1) {
								local402 = Static15.aClass14Array3[local26.anIntArray626[local199]].E();
								if (local199 == 1) {
									Static22.anIntArray20[1] -= 20;
								}
								if (local199 == 2) {
									Static22.anIntArray20[1] -= 10;
									Static22.anIntArray20[0] -= local402 - 9;
								}
								if (local199 == 3) {
									Static22.anIntArray20[0] += local402 - 9;
									Static22.anIntArray20[1] -= 10;
								}
								Static15.aClass14Array3[local26.anIntArray626[local199]].method7680(arg1 + Static22.anIntArray20[0] - (local402 >> 1), Static22.anIntArray20[1] + arg3 + -12);
								Static544.aClass54_15.method7803(Integer.toString(local26.anIntArray625[local199]), -1, 0, arg3 + Static22.anIntArray20[1] + 3, arg1 + -1 + Static22.anIntArray20[0]);
							}
						}
					}
				}
			}
		}
		@Pc(999) int local999;
		for (@Pc(993) int local993 = 0; local993 < Static521.anInt8386; local993++) {
			local999 = Static397.anIntArray423[local993];
			@Pc(1006) Class41_Sub2_Sub1_Sub4 local1006;
			if (local999 < 2048) {
				local1006 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local999];
			} else {
				local1006 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) (local999 - 2048))).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			}
			local199 = Static497.anIntArray516[local993];
			@Pc(1037) Class41_Sub2_Sub1_Sub4 local1037;
			if (local199 >= 2048) {
				local1037 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) (local199 - 2048))).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			} else {
				local1037 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local199];
			}
			Static581.method6766(arg3, arg1, local1006, local1037, arg0, --local1006.anInt9457, arg2);
		}
		local999 = Static75.aClass134_7.anInt3765 + Static75.aClass134_7.anInt3760 + 2;
		for (local174 = 0; local174 < Static83.anInt1830; local174++) {
			local199 = Static583.anIntArray618[local174];
			local850 = Static583.anIntArray619[local174];
			local402 = Static583.anIntArray617[local174];
			@Pc(1097) boolean local1097 = true;
			while (local1097) {
				local1097 = false;
				for (local530 = 0; local530 < local174; local530++) {
					if (local850 + 2 > -local999 + Static583.anIntArray619[local530] && Static583.anIntArray619[local530] + 2 > local850 + -local999 && Static583.anIntArray617[local530] + Static583.anIntArray618[local530] > local199 + -local402 && Static583.anIntArray618[local530] - Static583.anIntArray617[local530] < local199 + local402 && local850 > Static583.anIntArray619[local530] - local999) {
						local1097 = true;
						local850 = Static583.anIntArray619[local530] - local999;
					}
				}
			}
			Static583.anIntArray619[local174] = local850;
			@Pc(1187) String local1187 = Static583.aStringArray39[local174];
			if (Static487.anInt9194 == 0) {
				local244 = 16776960;
				if (Static583.anIntArray615[local174] < 6) {
					local244 = Static557.anIntArray581[Static583.anIntArray615[local174]];
				}
				if (Static583.anIntArray615[local174] == 6) {
					local244 = Static81.anInt1761 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static583.anIntArray615[local174] == 7) {
					local244 = Static81.anInt1761 % 20 < 10 ? 255 : 65535;
				}
				if (Static583.anIntArray615[local174] == 8) {
					local244 = Static81.anInt1761 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static583.anIntArray615[local174] == 9) {
					local315 = 150 - Static583.anIntArray616[local174];
					if (local315 < 50) {
						local244 = local315 * 1280 + 16711680;
					} else if (local315 < 100) {
						local244 = 16776960 - (local315 - 50) * 327680;
					} else if (local315 < 150) {
						local244 = (local315 - 100) * 5 + 65280;
					}
				}
				if (Static583.anIntArray615[local174] == 10) {
					local315 = 150 - Static583.anIntArray616[local174];
					if (local315 < 50) {
						local244 = local315 * 5 + 16711680;
					} else if (local315 < 100) {
						local244 = 16711935 + 16384000 - local315 * 327680;
					} else if (local315 < 150) {
						local244 = (local315 + -100) * 327680 + 255 - (local315 - 100) * 5;
					}
				}
				if (Static583.anIntArray615[local174] == 11) {
					local315 = 150 - Static583.anIntArray616[local174];
					if (local315 < 50) {
						local244 = 16777215 - local315 * 327685;
					} else if (local315 < 100) {
						local244 = (local315 - 50) * 327685 + 65280;
					} else if (local315 < 150) {
						local244 = 16777215 - (local315 - 100) * 327680;
					}
				}
				local315 = local244 | 0xFF000000;
				if (Static583.anIntArray614[local174] == 0) {
					Static460.aClass54_10.method7803(local1187, local315, -16777216, arg3 + local850, arg1 - -local199);
				}
				if (Static583.anIntArray614[local174] == 1) {
					Static460.aClass54_10.method7806(local315, local850 + arg3, arg1 + local199, Static81.anInt1761, local1187);
				}
				if (Static583.anIntArray614[local174] == 2) {
					Static460.aClass54_10.method7793(local1187, local850 + arg3, arg1 + local199, local315, Static81.anInt1761);
				}
				if (Static583.anIntArray614[local174] == 3) {
					Static460.aClass54_10.method7795(local199 + arg1, local315, 150 - Static583.anIntArray616[local174], Static81.anInt1761, arg3 + local850, local1187);
				}
				@Pc(1517) int local1517;
				if (Static583.anIntArray614[local174] == 4) {
					local1517 = (150 - Static583.anIntArray616[local174]) * (Static75.aClass134_7.method3348(local1187) + 100) / 150;
					Static505.aClass45_11.V(arg1 + local199 - 50, arg3, local199 + arg1 + 50, arg3 + arg0);
					Static460.aClass54_10.method7796(local1187, -16777216, local199 + arg1 + 50 - local1517, local315, arg3 + local850);
					Static505.aClass45_11.da(arg1, arg3, arg1 + arg2, arg0 + arg3);
				}
				if (Static583.anIntArray614[local174] == 5) {
					local1517 = 150 - Static583.anIntArray616[local174];
					@Pc(1576) int local1576 = 0;
					if (local1517 < 25) {
						local1576 = local1517 - 25;
					} else if (local1517 > 125) {
						local1576 = local1517 - 125;
					}
					@Pc(1602) int local1602 = Static75.aClass134_7.anInt3760 + Static75.aClass134_7.anInt3765;
					Static505.aClass45_11.V(arg1, arg3 + local850 - local1602 - 1, arg2 + arg1, local850 + arg3 + 5);
					Static460.aClass54_10.method7803(local1187, local315, -16777216, local850 + arg3 + local1576, local199 + arg1);
					Static505.aClass45_11.da(arg1, arg3, arg2 + arg1, arg3 + arg0);
				}
			} else {
				Static460.aClass54_10.method7803(local1187, -256, -16777216, local850 + arg3, local199 + arg1);
			}
		}
	}
}
