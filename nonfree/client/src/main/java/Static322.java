import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt5770;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "Lclient!df;")
	public static Class49 aClass49_24;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_143 = new Class81(87, 3);

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_77 = new Class44(78, 12);

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_7 = new Class222("", 15);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lclient!tk;")
	public static Class2_Sub38 method4608() {
		if (Static169.aClass265_27 == null || Static333.aClass247_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub38 local16 = (Class2_Sub38) Static333.aClass247_1.method5528(); local16 != null; local16 = (Class2_Sub38) Static333.aClass247_1.method5528()) {
			@Pc(24) Class83 local24 = Static169.aClass173_3.method4022(local16.anInt6772);
			if (local24 != null && local24.aBoolean198 && local24.method1708(Static169.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4610(@OriginalArg(0) long arg0) {
		Static401.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static401.aCalendar2.get(7);
		@Pc(23) int local23 = Static401.aCalendar2.get(5);
		@Pc(27) int local27 = Static401.aCalendar2.get(2);
		@Pc(31) int local31 = Static401.aCalendar2.get(1);
		@Pc(35) int local35 = Static401.aCalendar2.get(11);
		@Pc(39) int local39 = Static401.aCalendar2.get(12);
		@Pc(43) int local43 = Static401.aCalendar2.get(13);
		return Static351.aStringArray33[local13 - 1] + ", " + local23 / 10 + local23 % 10 + "-" + Static244.aStringArray23[local27] + "-" + local31 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static440.method5950(arg0, Static175.anInt3399, Static75.anInt1858);
		@Pc(23) int local23 = Static440.method5950(arg3, Static175.anInt3399, Static75.anInt1858);
		@Pc(29) int local29 = Static440.method5950(arg1, Static351.anInt6176, Static331.anInt5894);
		@Pc(35) int local35 = Static440.method5950(arg2, Static351.anInt6176, Static331.anInt5894);
		@Pc(43) int local43 = Static440.method5950(arg6 + arg0, Static175.anInt3399, Static75.anInt1858);
		@Pc(51) int local51 = Static440.method5950(arg3 - arg6, Static175.anInt3399, Static75.anInt1858);
		for (@Pc(53) int local53 = local11; local53 < local43; local53++) {
			Static49.method990(Static277.anIntArrayArray40[local53], local35, local29, arg5);
		}
		for (@Pc(73) int local73 = local23; local73 > local51; local73--) {
			Static49.method990(Static277.anIntArrayArray40[local73], local35, local29, arg5);
		}
		@Pc(97) int local97 = Static440.method5950(arg6 + arg1, Static351.anInt6176, Static331.anInt5894);
		@Pc(106) int local106 = Static440.method5950(arg2 - arg6, Static351.anInt6176, Static331.anInt5894);
		for (@Pc(108) int local108 = local43; local108 <= local51; local108++) {
			@Pc(114) int[] local114 = Static277.anIntArrayArray40[local108];
			Static49.method990(local114, local97, local29, arg5);
			Static49.method990(local114, local106, local97, arg4);
			Static49.method990(local114, local35, local106, arg5);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lclient!sn;")
	public static Class223 method4614(@OriginalArg(0) int arg0) {
		@Pc(13) Class223[] local13 = Static121.method1760();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class223 local21 = local13[local15];
			if (local21.anInt6386 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!bi;Lclient!ht;)V")
	public static void method4615(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class113 arg1) {
		if (!arg1.aBoolean272) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort37;
		@Pc(9) short local9 = arg1.aShort36;
		@Pc(12) byte local12 = arg1.aByte29;
		@Pc(15) byte local15 = arg1.aByte33;
		@Pc(21) int local21 = (local6 << Static250.anInt4056) + Static176.anInt3421;
		@Pc(27) int local27 = (local9 << Static250.anInt4056) + Static176.anInt3421;
		@Pc(31) Class113[][] local31 = Static176.aClass113ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static77.aClass106Array12 == Static372.aClass106Array11) {
			Static444.aClass26_11.ba(Static72.aClass106Array4[0].va(local21, local27), Static348.method4895(local6, local9), Static222.method3420(local6, local9), Static310.method4420(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static444.aClass26_11.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class113 local86;
		@Pc(616) Class38_Sub3 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class38_Sub3 local377;
		@Pc(408) int local408;
		@Pc(411) Class4_Sub4 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean270) {
			if (Static397.aBoolean589) {
				if (local12 > 0) {
					local86 = Static176.aClass113ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean272) {
						return;
					}
				}
				if (local6 <= Static249.anInt4746 && local6 > Static165.anInt6202) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean272 && (local86.aBoolean270 || (arg1.aByte34 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static249.anInt4746 && local6 < Static8.anInt266 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean272 && (local86.aBoolean270 || (arg1.aByte34 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static404.anInt7034 && local9 > Static12.anInt315) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean272 && (local86.aBoolean270 || (arg1.aByte34 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static404.anInt7034 && local9 < Static257.anInt4830 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean272 && (local86.aBoolean270 || (arg1.aByte34 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static397.aBoolean589 = true;
			}
			arg1.aBoolean270 = false;
			if (arg1.aClass113_1 != null) {
				local86 = arg1.aClass113_1;
				Static444.aClass26_11.o(3000.0F, (201.5F - (float) (local86.aByte33 + 1) * 50.0F) * 1.5F);
				if (!Static233.method3560(local86.aByte33, local6, local9)) {
					Static372.aClass106Array11[local86.aByte33].method5482(local6, local9);
				}
				@Pc(249) Class4_Sub4 local249 = local86.aClass4_Sub4_2;
				if (local249 != null) {
					if (Static193.aBoolean313) {
						if ((local249.anInt7608 & arg1.aShort38) == 0) {
							Static192.method1238(arg0, local12, local6, local9);
						} else {
							Static287.method4211(arg0, local249.anInt7608, local15, local6, local9);
						}
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local249.method5896(Static444.aClass26_11);
				}
				for (@Pc(286) Class134 local286 = local86.aClass134_1; local286 != null; local286 = local286.aClass134_2) {
					@Pc(290) Class4_Sub2 local290 = local286.aClass4_Sub2_1;
					if (local290 != null) {
						if (Static193.aBoolean313) {
							Static192.method1238(arg0, local12, local6, local9);
							Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
						}
						local290.method5896(Static444.aClass26_11);
					}
				}
				Static444.aClass26_11.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static233.method3560(local15, local6, local9);
			if (local330) {
				Static372.aClass106Array11[local15].method5482(local6, local9);
				@Pc(341) Class4_Sub3 local341 = arg1.aClass4_Sub3_1;
				if (local341 != null && local341.aBoolean343) {
					if (local341.aBoolean344) {
						Static444.aClass26_11.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local377 = local341.method5896(Static444.aClass26_11);
					if (local377 != null) {
						local377.aClass4_1 = local341;
						local377.anInt2378 = local12;
						local377.anInt2376 = local6;
						local377.anInt2375 = local9;
						Static346.aClass184_6.method4207(local377);
					}
					if (local341.aBoolean344) {
						Static444.aClass26_11.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass4_Sub4_2;
			@Pc(414) Class4_Sub1 local414 = arg1.aClass4_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static249.anInt4746 == local6) {
					local406++;
				} else if (Static249.anInt4746 < local6) {
					local406 += 2;
				}
				if (Static404.anInt7034 == local9) {
					local406 += 3;
				} else if (Static404.anInt7034 > local9) {
					local406 += 6;
				}
				local408 = Static15.anIntArray22[local406];
				arg1.aShort38 = Static302.aShortArray56[local406];
			}
			if (local411 != null) {
				if ((local411.anInt7608 & Static211.anIntArray263[local406]) == 0) {
					arg1.aByte28 = 0;
				} else if (local411.anInt7608 == 16) {
					arg1.aByte28 = 3;
					arg1.aByte32 = Static81.aByteArray50[local406];
					arg1.aByte30 = (byte) (3 - arg1.aByte32);
				} else if (local411.anInt7608 == 32) {
					arg1.aByte28 = 6;
					arg1.aByte32 = Static171.aByteArray102[local406];
					arg1.aByte30 = (byte) (6 - arg1.aByte32);
				} else if (local411.anInt7608 == 64) {
					arg1.aByte28 = 12;
					arg1.aByte32 = Static49.aByteArray33[local406];
					arg1.aByte30 = (byte) (12 - arg1.aByte32);
				} else {
					arg1.aByte28 = 9;
					arg1.aByte32 = Static184.aByteArray109[local406];
					arg1.aByte30 = (byte) (9 - arg1.aByte32);
				}
				if ((local411.anInt7608 & local408) != 0 && !Static222.method3422(local15, local6, local9, local411.anInt7608)) {
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					@Pc(563) Class38_Sub3 local563 = local411.method5896(Static444.aClass26_11);
					if (local563 != null) {
						local563.aClass4_1 = local411;
						local563.anInt2378 = local12;
						local563.anInt2376 = local6;
						local563.anInt2375 = local9;
						Static346.aClass184_6.method4207(local563);
					}
				}
				@Pc(584) Class4_Sub4 local584 = arg1.aClass4_Sub4_1;
				if (local584 != null && (local584.anInt7608 & local408) != 0 && !Static222.method3422(local15, local6, local9, local584.anInt7608)) {
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local616 = local584.method5896(Static444.aClass26_11);
					if (local616 != null) {
						local616.aClass4_1 = local584;
						local616.anInt2378 = local12;
						local616.anInt2376 = local6;
						local616.anInt2375 = local9;
						Static346.aClass184_6.method4207(local616);
					}
				}
			}
			if (local414 != null && !Static95.method1599(local15, local6, local9, local414.method4502())) {
				@Pc(647) Class4_Sub1 local647 = arg1.aClass4_Sub1_3;
				Static444.aClass26_11.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5529 & local408) != 0) {
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local616 = local414.method5896(Static444.aClass26_11);
					if (local616 != null) {
						local616.aClass4_1 = local414;
						local616.anInt2378 = local12;
						local616.anInt2376 = local6;
						local616.anInt2375 = local9;
						Static346.aClass184_6.method4207(local616);
					}
				} else if (local414.anInt5529 == 256) {
					local706 = local414.anInt5532 - Static305.anInt1349;
					local711 = local414.anInt5533 - Static49.anInt1358;
					local714 = local414.anInt5535;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					@Pc(759) Class38_Sub3 local759;
					if (local735 < local723) {
						local759 = local414.method5896(Static444.aClass26_11);
						if (local759 != null) {
							local759.aClass4_1 = local414;
							local759.anInt2378 = local12;
							local759.anInt2376 = local6;
							local759.anInt2375 = local9;
							Static346.aClass184_6.method4207(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5896(Static444.aClass26_11);
						if (local759 != null) {
							local759.aClass4_1 = local647;
							local759.anInt2378 = local12;
							local759.anInt2376 = local6;
							local759.anInt2375 = local9;
							Static346.aClass184_6.method4207(local759);
						}
					}
				}
				Static444.aClass26_11.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class4_Sub3 local814 = arg1.aClass4_Sub3_1;
				if (local814 != null && !local814.aBoolean343) {
					if (local814.aBoolean344) {
						Static444.aClass26_11.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local616 = local814.method5896(Static444.aClass26_11);
					if (local616 != null) {
						local616.aClass4_1 = local814;
						local616.anInt2378 = local12;
						local616.anInt2376 = local6;
						local616.anInt2375 = local9;
						Static346.aClass184_6.method4207(local616);
					}
					if (local814.aBoolean344) {
						Static444.aClass26_11.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class4_Sub5 local880 = arg1.aClass4_Sub5_1;
				if (local880 != null && !local880.aBoolean650) {
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					@Pc(903) Class38_Sub3 local903 = local880.method5896(Static444.aClass26_11);
					if (local903 != null) {
						local903.aClass4_1 = local880;
						local903.anInt2378 = local12;
						local903.anInt2376 = local6;
						local903.anInt2375 = local9;
						Static346.aClass184_6.method4207(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte34;
			if (local924 != 0) {
				@Pc(941) Class113 local941;
				if (local6 < Static249.anInt4746 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean272) {
						Static151.aClass125_1.method2952(local941);
					}
				}
				if (local9 < Static404.anInt7034 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean272) {
						Static151.aClass125_1.method2952(local941);
					}
				}
				if (local6 > Static249.anInt4746 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean272) {
						Static151.aClass125_1.method2952(local941);
					}
				}
				if (local9 > Static404.anInt7034 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean272) {
						Static151.aClass125_1.method2952(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class4_Sub4 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class134 local1030;
		if (arg1.aByte28 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass134_1; local1030 != null; local1030 = local1030.aClass134_2) {
				if (local1030.aClass4_Sub2_1.anInt7112 != Static243.anInt4537 && (local1030.anInt3955 & arg1.aByte28) == arg1.aByte32) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass4_Sub4_2;
				if (!Static222.method3422(local15, local6, local9, local1057.anInt7608)) {
					if (Static193.aBoolean313) {
						label682: {
							if (local1057.anInt7608 >= 16) {
								local1074 = local6 - Static249.anInt4746;
								local1078 = local9 - Static404.anInt7034;
								if (local1057.anInt7608 == 16) {
									local1074 -= Static176.anInt3421;
									local1078 += Static176.anInt3421;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static360.anInt6340) {
										Static192.method1238(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7608 == 32) {
									local1074 += Static176.anInt3421;
									local1078 += Static176.anInt3421;
									if (local1078 < -local1074 && local6 < Static86.anInt2009 && local9 < Static360.anInt6340) {
										Static192.method1238(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7608 == 64) {
									local1074 += Static176.anInt3421;
									local1078 -= Static176.anInt3421;
									if (local1078 > local1074 && local6 < Static86.anInt2009 && local9 > 0) {
										Static192.method1238(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt7608 == 128) {
									local1074 -= Static176.anInt3421;
									local1078 -= Static176.anInt3421;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static192.method1238(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static192.method1238(arg0, local12, local6, local9);
						}
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					@Pc(1216) Class38_Sub3 local1216 = local1057.method5896(Static444.aClass26_11);
					if (local1216 != null) {
						local1216.aClass4_1 = local1057;
						local1216.anInt2378 = local12;
						local1216.anInt2376 = local6;
						local1216.anInt2375 = local9;
						Static346.aClass184_6.method4207(local1216);
					}
				}
				arg1.aByte28 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean271) {
			try {
				arg1.aBoolean271 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass134_1; local1030 != null; local1030 = local1030.aClass134_2) {
					@Pc(1252) Class4_Sub2 local1252 = local1030.aClass4_Sub2_1;
					if (local1252.anInt7112 != Static243.anInt4537) {
						for (local1074 = local1252.aShort88; local1074 <= local1252.aShort87; local1074++) {
							for (local1078 = local1252.aShort89; local1078 <= local1252.aShort86; local1078++) {
								@Pc(1270) Class113 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean270) {
									arg1.aBoolean271 = true;
									continue label625;
								}
								if (local1270.aByte28 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort88) {
										local706++;
									}
									if (local1074 < local1252.aShort87) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort89) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort86) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte28) == arg1.aByte30) {
										arg1.aBoolean271 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static249.anInt4746 - local1252.aShort88;
						local1333 = local1252.aShort87 - Static249.anInt4746;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static404.anInt7034 - local1252.aShort89;
						local711 = local1252.aShort86 - Static404.anInt7034;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass4_Sub2Array2[local1245] = local1252;
						arg0.anIntArray460[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class4_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass4_Sub2Array2[local1078];
						if (local1384.anInt7112 != Static243.anInt4537) {
							local706 = arg0.anIntArray460[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7117 - Static305.anInt1349;
								local714 = local1384.anInt7111 - Static49.anInt1358;
								local723 = arg0.aClass4_Sub2Array2[local1074].anInt7117 - Static305.anInt1349;
								local735 = arg0.aClass4_Sub2Array2[local1074].anInt7111 - Static49.anInt1358;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass4_Sub2Array2[local1074];
					local1384.anInt7112 = Static243.anInt4537;
					if (!Static161.method2566(local15, local1384.aShort88, local1384.aShort87, local1384.aShort89, local1384.aShort86, local1384.method5562())) {
						if (Static193.aBoolean313) {
							if (local1384.aByte91 == 0) {
								Static358.method5012(arg0, local12, local1384.aShort88, local1384.aShort89, local1384.aShort87, local1384.aShort86);
							} else {
								Static192.method1238(arg0, local12, local6, local9);
								local706 = local6 - Static249.anInt4746;
								local711 = local9 - Static404.anInt7034;
								if (local1384.aByte91 == 2) {
									if (local711 > -local706) {
										Static433.method5831(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static433.method5831(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static433.method5831(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static433.method5831(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
						}
						local616 = local1384.method5896(Static444.aClass26_11);
						if (local616 != null) {
							local616.aClass4_1 = local1384;
							local616.anInt2378 = local12;
							local616.anInt2376 = local1384.aShort88;
							local616.anInt2375 = local1384.aShort89;
							Static346.aClass184_6.method4207(local616);
						}
					}
					for (local706 = local1384.aShort88; local706 <= local1384.aShort87; local706++) {
						for (local711 = local1384.aShort89; local711 <= local1384.aShort86; local711++) {
							@Pc(1609) Class113 local1609 = local31[local706][local711];
							if (local1609.aByte28 != 0) {
								Static151.aClass125_1.method2952(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean272) {
								Static151.aClass125_1.method2952(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean271) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean271 = false;
			}
		}
		if (arg1.aClass192_1 != null && arg1.aByte31 == (byte) (Static339.anInt5986 & 0xFF)) {
			@Pc(1664) Class192 local1664 = arg1.aClass192_1;
			local406 = Static372.aClass106Array11[local12].I(local6, local9);
			if (local12 < Static58.anInt1578 - 1) {
				local408 = Static372.aClass106Array11[local12].I(local6, local9) - Static372.aClass106Array11[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static250.anInt4056;
			}
			Static181.aClass102_3.method4926(local21, local406, local27, arg0.anIntArray461);
			local1074 = arg0.anIntArray461[2];
			Static181.aClass102_3.method4926(local21, local406 - local408, local27, arg0.anIntArray461);
			local1078 = arg0.anIntArray461[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static195.anInt3812;
			local706 += Static195.anInt3812;
			local1664.anInt5384 = local1333;
			local1664.anInt5381 = local706;
			local1664.aBoolean468 = true;
			Static444.aClass26_11.method2252(local1664);
		}
		if (!arg1.aBoolean272) {
			return;
		}
		if (arg1.aByte28 != 0) {
			return;
		}
		if (local6 <= Static249.anInt4746 && local6 > Static165.anInt6202) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean272) {
				return;
			}
		}
		if (local6 >= Static249.anInt4746 && local6 < Static8.anInt266 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean272) {
				return;
			}
		}
		if (local9 <= Static404.anInt7034 && local9 > Static12.anInt315) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean272) {
				return;
			}
		}
		if (local9 >= Static404.anInt7034 && local9 < Static257.anInt4830 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean272) {
				return;
			}
		}
		arg1.aBoolean272 = false;
		Static159.anInt3140--;
		@Pc(1855) Class4_Sub5 local1855 = arg1.aClass4_Sub5_1;
		if (local1855 != null && local1855.aBoolean650) {
			if (Static193.aBoolean313) {
				Static192.method1238(arg0, local12, local6, local9);
				Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
			}
			@Pc(1878) Class38_Sub3 local1878 = local1855.method5896(Static444.aClass26_11);
			if (local1878 != null) {
				local1878.aClass4_1 = local1855;
				local1878.anInt2378 = local12;
				local1878.anInt2376 = local6;
				local1878.anInt2375 = local9;
				Static346.aClass184_6.method4207(local1878);
			}
		}
		if (arg1.aShort38 != 0) {
			@Pc(1902) Class4_Sub1 local1902 = arg1.aClass4_Sub1_2;
			if (local1902 != null && !Static95.method1599(local15, local6, local9, local1902.method4502())) {
				if ((local1902.anInt5529 & arg1.aShort38) != 0) {
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					local377 = local1902.method5896(Static444.aClass26_11);
					if (local377 != null) {
						local377.aClass4_1 = local1902;
						local377.anInt2378 = local12;
						local377.anInt2376 = local6;
						local377.anInt2375 = local9;
						Static346.aClass184_6.method4207(local377);
					}
				} else if (local1902.anInt5529 == 256) {
					local408 = local1902.anInt5532 - Static305.anInt1349;
					local1074 = local1902.anInt5533 - Static49.anInt1358;
					local1078 = local1902.anInt5535;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static193.aBoolean313) {
						Static192.method1238(arg0, local12, local6, local9);
						Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
					}
					@Pc(2012) Class4_Sub1 local2012 = arg1.aClass4_Sub1_3;
					@Pc(2020) Class38_Sub3 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5896(Static444.aClass26_11);
						if (local2020 != null) {
							local2020.aClass4_1 = local1902;
							local2020.anInt2378 = local12;
							local2020.anInt2376 = local6;
							local2020.anInt2375 = local9;
							Static346.aClass184_6.method4207(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5896(Static444.aClass26_11);
						if (local2020 != null) {
							local2020.aClass4_1 = local2012;
							local2020.anInt2378 = local12;
							local2020.anInt2376 = local6;
							local2020.anInt2375 = local9;
							Static346.aClass184_6.method4207(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass4_Sub4_2;
			local411 = arg1.aClass4_Sub4_1;
			@Pc(2105) Class38_Sub3 local2105;
			if (local411 != null && (local411.anInt7608 & arg1.aShort38) != 0 && !Static222.method3422(local15, local6, local9, local411.anInt7608)) {
				if (Static193.aBoolean313) {
					Static287.method4211(arg0, local411.anInt7608, local12, local6, local9);
					Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
				}
				local2105 = local411.method5896(Static444.aClass26_11);
				if (local2105 != null) {
					local2105.aClass4_1 = local411;
					local2105.anInt2378 = local12;
					local2105.anInt2376 = local6;
					local2105.anInt2375 = local9;
					Static346.aClass184_6.method4207(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt7608 & arg1.aShort38) != 0 && !Static222.method3422(local15, local6, local9, local1057.anInt7608)) {
				if (Static193.aBoolean313) {
					Static287.method4211(arg0, local1057.anInt7608, local12, local6, local9);
					Static444.aClass26_11.method2265(arg0.anInt6960, arg0.aClass2_Sub7Array3);
				}
				local2105 = local1057.method5896(Static444.aClass26_11);
				if (local2105 != null) {
					local2105.aClass4_1 = local1057;
					local2105.anInt2378 = local12;
					local2105.anInt2376 = local6;
					local2105.anInt2375 = local9;
					Static346.aClass184_6.method4207(local2105);
				}
			}
		}
		@Pc(2191) Class113 local2191;
		if (local12 < Static58.anInt1578 - 1) {
			local2191 = Static176.aClass113ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean272) {
				Static151.aClass125_1.method2953(local2191);
			}
		}
		if (local6 < Static249.anInt4746) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean272) {
				Static151.aClass125_1.method2952(local2191);
			}
		}
		if (local9 < Static404.anInt7034) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean272) {
				Static151.aClass125_1.method2952(local2191);
			}
		}
		if (local6 > Static249.anInt4746) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean272) {
				Static151.aClass125_1.method2952(local2191);
			}
		}
		if (local9 > Static404.anInt7034) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean272) {
				Static151.aClass125_1.method2952(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BIII)I")
	public static int method4616(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local7 = Class2_Sub2_Sub15.anIntArray486[(local7 ^ arg0[local14]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	public static void method4617() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static81.anInt1950; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static171.anInt3288; local17++) {
				if (Static365.method5076(local17, Static176.aClass113ArrayArrayArray3, local11, local13, true)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}
