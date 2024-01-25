import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!fca;")
	public static Class3_Sub22 aClass3_Sub22_4;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_3 = new Class218(31, -1);

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	public static int anInt545 = 0;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Lclient!sja;")
	public static final Class321 aClass321_1 = new Class321(true);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	public static void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static15.aClass164ArrayArrayArray5[0][arg1][arg2] != null && Static15.aClass164ArrayArrayArray5[0][arg1][arg2].aClass164_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static15.aClass164ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(44) Class164 local44 = Static15.aClass164ArrayArrayArray5[local22][arg1][arg2] = new Class164(local22);
				if (local20) {
					local44.aByte68++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BIILclient!ha;)V")
	public static void method660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static63.anInt1263 == 0 || Static666.anInt10607 == 0) {
			return;
		}
		@Pc(34) Class239 local34;
		@Pc(45) int local45;
		@Pc(41) int local41;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(59) int local59;
		@Pc(66) int local66;
		if (Static82.aBoolean134) {
			Static60.method1290(false);
			local34 = arg2.method8528();
			@Pc(37) int[] local37 = arg2.Y();
			local41 = local37[1];
			local45 = local37[0];
			local49 = local37[2];
			local53 = local37[3];
			local59 = Static405.method5732(false) + arg0;
			local66 = arg1 + Static372.method5402(false);
		} else {
			arg2.DA(Static385.anInt6092, Static115.anInt2363, Static63.anInt1263, Static666.anInt10607);
			local49 = Static63.anInt1263;
			local41 = Static115.anInt2363;
			local45 = Static385.anInt6092;
			local53 = Static666.anInt10607;
			arg2.KA(Static53.anInt1109, Static651.anInt10355, Static63.anInt1263, Static666.anInt10607);
			local34 = arg2.method8461();
			local34.method9237(Static51.anInt1086, Static155.anInt3064, Static668.anInt10668, Static428.anInt6845, Static519.anInt8363, Static361.anInt5826);
			local66 = arg1;
			local59 = arg0;
			arg2.method8501(local34);
		}
		if (local49 == 0) {
			local49 = 1;
		}
		if (local53 == 0) {
			local53 = 1;
		}
		Static511.method7219(true);
		@Pc(141) int local141;
		@Pc(170) int local170;
		@Pc(179) int local179;
		@Pc(278) int local278;
		@Pc(287) int local287;
		@Pc(298) int local298;
		@Pc(309) int local309;
		@Pc(133) int local133;
		@Pc(358) int local358;
		if (Static582.aClass21Array3 != null && (!Static624.aBoolean698 || (Static173.anInt3449 & 0x40) != 0)) {
			local133 = -1;
			@Pc(135) int local135 = -1;
			@Pc(138) int local138 = arg2.i();
			local141 = arg2.XA();
			@Pc(161) int local161;
			@Pc(152) int local152;
			if (Static443.aBoolean515) {
				local161 = local179 = (local66 - local41) * Static675.anInt10880 / local53;
				local170 = local152 = (local59 - local45) * Static675.anInt10880 / local49;
			} else {
				local152 = (local59 - local45) * local141 / local49;
				local161 = local138 * (local66 - local41) / local53;
				local170 = local138 * (local59 - local45) / local49;
				local179 = (local66 - local41) * local141 / local53;
			}
			@Pc(217) int[] local217 = new int[] { local170, local161, local138 };
			local34.method9241(local217);
			@Pc(235) int[] local235 = new int[] { local152, local179, local141 };
			local34.method9241(local235);
			@Pc(266) float local266 = Static415.method5919((float) local235[1], (float) local217[2], (float) local217[1], (float) local235[2], (float) local217[0], 4, (float) local235[0]);
			if (local266 > 0.0F) {
				local278 = local235[0] - local217[0];
				local287 = local235[2] - local217[2];
				local298 = (int) ((float) local217[0] + (float) local278 * local266);
				local309 = (int) ((float) local287 * local266 + (float) local217[2]);
				local133 = local298 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() - 1 << 8) >> 9;
				local135 = local309 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() - 1 << 8) >> 9;
				@Pc(338) byte local338 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174;
				if (local338 < 3 && (Static90.aByteArrayArrayArray25[1][local298 >> 9][local309 >> 9] & 0x2) != 0) {
					local358 = local338 + 1;
				}
			}
			if (local133 != -1 && local135 != -1) {
				if (Static624.aBoolean698 && (Static173.anInt3449 & 0x40) != 0) {
					@Pc(378) Class260 local378 = Static245.method4101(Static531.anInt8767, Static287.anInt4913);
					if (local378 == null) {
						Static632.method8816();
					} else {
						Static303.method4660(false, Static90.aString119, true, -1, " ->", true, local133, 2, (long) (local135 | local133 << 0), local135, Static463.anInt7620, 0L);
					}
				} else {
					if (Static320.aBoolean733) {
						Static303.method4660(false, Static601.aClass346_29.method8440(Static609.anInt9834), true, -1, "", true, local133, 57, (long) (local133 << 0 | local135), local135, -1, 0L);
					}
					Static303.method4660(false, Static553.aString107, true, -1, "", true, local133, 51, (long) (local133 << 0 | local135), local135, Static13.anInt138, 0L);
				}
			}
		}
		if (Static82.aBoolean134) {
			Static439.method6264();
		}
		for (local133 = 0; local133 < (Static82.aBoolean134 ? 2 : 1); local133++) {
			@Pc(469) boolean local469 = local133 == 0;
			@Pc(475) Class321 local475 = local469 ? Static645.aClass321_3 : aClass321_1;
			local141 = arg0;
			local170 = arg1;
			if (Static82.aBoolean134) {
				Static60.method1290(local469);
				local141 = arg0 + Static405.method5732(local469);
				local170 = arg1 + Static372.method5402(local469);
			}
			@Pc(499) Class371 local499 = local475.aClass371_7;
			for (@Pc(504) Class28_Sub3 local504 = (Class28_Sub3) local499.method8911(); local504 != null; local504 = (Class28_Sub3) local499.method8917()) {
				if ((Static630.aBoolean763 || local504.aClass28_Sub1_5.aByte174 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) && local504.method1775(local141, local170, arg2)) {
					@Pc(545) int local545;
					if (local504.aClass28_Sub1_5 instanceof Class28_Sub1_Sub1) {
						local179 = ((Class28_Sub1_Sub1) local504.aClass28_Sub1_5).aShort125;
						local545 = ((Class28_Sub1_Sub1) local504.aClass28_Sub1_5).aShort123;
					} else {
						local179 = local504.aClass28_Sub1_5.anInt10729 >> 9;
						local545 = local504.aClass28_Sub1_5.anInt10731 >> 9;
					}
					@Pc(676) int local676;
					@Pc(688) int local688;
					@Pc(789) int local789;
					@Pc(569) int local569;
					if (local504.aClass28_Sub1_5 instanceof Class28_Sub1_Sub1_Sub1_Sub1) {
						@Pc(565) Class28_Sub1_Sub1_Sub1_Sub1 local565 = (Class28_Sub1_Sub1_Sub1_Sub1) local504.aClass28_Sub1_5;
						local569 = local565.method9314();
						if ((local569 & 0x1) == 0 && (local565.anInt10729 & 0x1FF) == 0 && (local565.anInt10731 & 0x1FF) == 0 || (local569 & 0x1) == 1 && (local565.anInt10729 & 0x1FF) == 256 && (local565.anInt10731 & 0x1FF) == 256) {
							local278 = local565.anInt10729 - (local565.method9314() - 1 << 8);
							local287 = local565.anInt10731 - (local565.method9314() - 1 << 8);
							for (local298 = 0; local298 < Static561.anInt9114; local298++) {
								@Pc(650) Class3_Sub3 local650 = (Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local298]);
								if (local650 != null) {
									@Pc(655) Class28_Sub1_Sub1_Sub1_Sub2 local655 = local650.aClass28_Sub1_Sub1_Sub1_Sub2_1;
									if (local655.anInt10747 != Static588.anInt9467 && local655.aBoolean819) {
										local676 = local655.anInt10729 - (local655.aClass300_1.anInt8313 - 1 << 8);
										local688 = local655.anInt10731 - (local655.aClass300_1.anInt8313 - 1 << 8);
										if (local676 >= local278 && local655.aClass300_1.anInt8313 <= local565.method9314() - (local676 - local278 >> 9) && local287 <= local688 && local655.aClass300_1.anInt8313 <= local565.method9314() - (local688 - local287 >> 9)) {
											Static342.method5135(local504.aClass28_Sub1_5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, local655);
											local655.anInt10747 = Static588.anInt9467;
										}
									}
								}
							}
							local309 = Static393.anInt6147;
							@Pc(754) int[] local754 = Static430.anIntArray612;
							for (local676 = 0; local676 < local309; local676++) {
								@Pc(764) Class28_Sub1_Sub1_Sub1_Sub1 local764 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local754[local676]];
								if (local764 != null && local764.anInt10747 != Static588.anInt9467 && local565 != local764 && local764.aBoolean819) {
									local789 = local764.anInt10729 - (local764.method9314() - 1 << 8);
									@Pc(801) int local801 = local764.anInt10731 - (local764.method9314() - 1 << 8);
									if (local278 <= local789 && local764.method9314() <= local565.method9314() - (local789 - local278 >> 9) && local287 <= local801 && local764.method9314() <= local565.method9314() - (local801 - local287 >> 9)) {
										Static40.method1043(local764, local504.aClass28_Sub1_5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174);
										local764.anInt10747 = Static588.anInt9467;
									}
								}
							}
						}
						if (local565.anInt10747 == Static588.anInt9467) {
							continue;
						}
						Static40.method1043(local565, local504.aClass28_Sub1_5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174);
						local565.anInt10747 = Static588.anInt9467;
					}
					if (local504.aClass28_Sub1_5 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
						@Pc(903) Class28_Sub1_Sub1_Sub1_Sub2 local903 = (Class28_Sub1_Sub1_Sub1_Sub2) local504.aClass28_Sub1_5;
						if (local903.aClass300_1 != null) {
							if ((local903.aClass300_1.anInt8313 & 0x1) == 0 && (local903.anInt10729 & 0x1FF) == 0 && (local903.anInt10731 & 0x1FF) == 0 || (local903.aClass300_1.anInt8313 & 0x1) == 1 && (local903.anInt10729 & 0x1FF) == 256 && (local903.anInt10731 & 0x1FF) == 256) {
								local569 = local903.anInt10729 - (local903.aClass300_1.anInt8313 - 1 << 8);
								local278 = local903.anInt10731 - (local903.aClass300_1.anInt8313 - 1 << 8);
								for (local287 = 0; local287 < Static561.anInt9114; local287++) {
									@Pc(986) Class3_Sub3 local986 = (Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local287]);
									if (local986 != null) {
										@Pc(991) Class28_Sub1_Sub1_Sub1_Sub2 local991 = local986.aClass28_Sub1_Sub1_Sub1_Sub2_1;
										if (Static588.anInt9467 != local991.anInt10747 && local903 != local991 && local991.aBoolean819) {
											local358 = local991.anInt10729 - (local991.aClass300_1.anInt8313 - 1 << 8);
											local676 = local991.anInt10731 - (local991.aClass300_1.anInt8313 - 1 << 8);
											if (local358 >= local569 && local991.aClass300_1.anInt8313 <= local903.aClass300_1.anInt8313 - (local358 - local569 >> 9) && local676 >= local278 && local991.aClass300_1.anInt8313 <= local903.aClass300_1.anInt8313 - (local676 - local278 >> 9)) {
												Static342.method5135(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 != local504.aClass28_Sub1_5.aByte174, local991);
												local991.anInt10747 = Static588.anInt9467;
											}
										}
									}
								}
								local298 = Static393.anInt6147;
								@Pc(1101) int[] local1101 = Static430.anIntArray612;
								for (local358 = 0; local358 < local298; local358++) {
									@Pc(1111) Class28_Sub1_Sub1_Sub1_Sub1 local1111 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local1101[local358]];
									if (local1111 != null && Static588.anInt9467 != local1111.anInt10747 && local1111.aBoolean819) {
										local688 = local1111.anInt10729 - (local1111.method9314() - 1 << 8);
										local789 = local1111.anInt10731 - (local1111.method9314() - 1 << 8);
										if (local688 >= local569 && local1111.method9314() <= local903.aClass300_1.anInt8313 - (local688 - local569 >> 9) && local278 <= local789 && local1111.method9314() <= local903.aClass300_1.anInt8313 - (local789 - local278 >> 9)) {
											Static40.method1043(local1111, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 != local504.aClass28_Sub1_5.aByte174);
											local1111.anInt10747 = Static588.anInt9467;
										}
									}
								}
							}
							if (Static588.anInt9467 == local903.anInt10747) {
								continue;
							}
							Static342.method5135(local504.aClass28_Sub1_5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, local903);
							local903.anInt10747 = Static588.anInt9467;
						}
					}
					if (local504.aClass28_Sub1_5 instanceof Class28_Sub1_Sub5_Sub1) {
						@Pc(1248) int local1248 = local179 + Static287.anInt4910;
						local569 = local545 + Static72.anInt1361;
						@Pc(1270) Class3_Sub16 local1270 = (Class3_Sub16) Static98.aClass83_6.method2368((long) (local1248 | local569 << 14 | local504.aClass28_Sub1_5.aByte174 << 28));
						if (local1270 != null) {
							local287 = 0;
							for (@Pc(1280) Class3_Sub27 local1280 = (Class3_Sub27) local1270.aClass338_44.method8167(); local1280 != null; local1280 = (Class3_Sub27) local1270.aClass338_44.method8174()) {
								@Pc(1288) Class374 local1288 = Static170.aClass370_1.method8900(local1280.anInt3843);
								if (Static624.aBoolean698 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 == local504.aClass28_Sub1_5.aByte174) {
									@Pc(1311) Class322 local1311 = Static311.anInt5146 == -1 ? null : Static467.aClass367_1.method8812(Static311.anInt5146);
									if ((Static173.anInt3449 & 0x1) != 0 && (local1311 == null || local1288.method8997(local1311.anInt9033, Static311.anInt5146) != local1311.anInt9033)) {
										Static303.method4660(false, Static90.aString119, false, -1, Static103.aString17 + " -> <col=ff9040>" + local1288.aString121, true, local179, 10, (long) local287, local545, Static463.anInt7620, (long) local1280.anInt3843);
									}
								}
								if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 == local504.aClass28_Sub1_5.aByte174) {
									@Pc(1366) String[] local1366 = local1288.aStringArray40;
									for (local676 = 4; local676 >= 0; local676--) {
										if (local1366 != null && local1366[local676] != null) {
											@Pc(1378) byte local1378 = 0;
											local789 = Static209.anInt4029;
											if (local676 == 0) {
												local1378 = 44;
											}
											if (local676 == 1) {
												local1378 = 3;
											}
											if (local676 == 2) {
												local1378 = 46;
											}
											if (local676 == 3) {
												local1378 = 48;
											}
											if (local676 == 4) {
												local1378 = 53;
											}
											if (local1288.anInt10277 == local676) {
												local789 = local1288.anInt10283;
											}
											if (local1288.anInt10338 == local676) {
												local789 = local1288.anInt10337;
											}
											Static303.method4660(false, local1366[local676], false, -1, "<col=ff9040>" + local1288.aString121, true, local179, local1378, (long) local287, local545, local789, (long) local1280.anInt3843);
										}
									}
								}
								Static303.method4660(local504.aClass28_Sub1_5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, Static601.aClass346_24.method8440(Static609.anInt9834), false, -1, "<col=ff9040>" + local1288.aString121, true, local179, 1003, (long) local287, local545, Static116.anInt2402, (long) local1280.anInt3843);
								local287++;
							}
						}
					}
					if (local504.aClass28_Sub1_5 instanceof Interface11) {
						@Pc(1522) Interface11 local1522 = (Interface11) local504.aClass28_Sub1_5;
						@Pc(1529) Class277 local1529 = Static652.aClass267_4.method6682(local1522.method9221());
						if (local1529.anIntArray660 != null) {
							local1529 = local1529.method6815(Static131.aClass66_1);
						}
						if (local1529 != null) {
							if (Static624.aBoolean698 && local504.aClass28_Sub1_5.aByte174 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) {
								@Pc(1562) Class322 local1562 = Static311.anInt5146 == -1 ? null : Static467.aClass367_1.method8812(Static311.anInt5146);
								if ((Static173.anInt3449 & 0x4) != 0 && (local1562 == null || local1529.method6805(Static311.anInt5146, local1562.anInt9033) != local1562.anInt9033)) {
									Static303.method4660(false, Static90.aString119, false, -1, Static103.aString17 + " -> <col=00ffff>" + local1529.aString87, true, local179, 22, (long) local1522.hashCode(), local545, Static463.anInt7620, Static70.method5709(local1522, local179, local545));
								}
							}
							if (local504.aClass28_Sub1_5.aByte174 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) {
								@Pc(1627) String[] local1627 = local1529.aStringArray21;
								if (local1627 != null) {
									for (local287 = 4; local287 >= 0; local287--) {
										if (local1627[local287] != null) {
											@Pc(1639) short local1639 = 0;
											local309 = Static209.anInt4029;
											if (local287 == 0) {
												local1639 = 13;
											}
											if (local287 == 1) {
												local1639 = 58;
											}
											if (local287 == 2) {
												local1639 = 23;
											}
											if (local287 == 3) {
												local1639 = 17;
											}
											if (local287 == 4) {
												local1639 = 1012;
											}
											if (local287 == local1529.anInt7743) {
												local309 = local1529.anInt7754;
											}
											if (local287 == local1529.anInt7727) {
												local309 = local1529.anInt7733;
											}
											Static303.method4660(false, local1627[local287], false, -1, "<col=00ffff>" + local1529.aString87, true, local179, local1639, (long) local1522.hashCode(), local545, local309, Static70.method5709(local1522, local179, local545));
										}
									}
								}
								Static303.method4660(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 != local504.aClass28_Sub1_5.aByte174, Static601.aClass346_24.method8440(Static609.anInt9834), false, -1, "<col=00ffff>" + local1529.aString87, true, local179, 1008, (long) local1522.hashCode(), local545, Static116.anInt2402, (long) local1529.anInt7714);
							}
						}
					}
				}
			}
			if (Static82.aBoolean134) {
				Static439.method6264();
			}
		}
		Static511.method7219(false);
	}
}
