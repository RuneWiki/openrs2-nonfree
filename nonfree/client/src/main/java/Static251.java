import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	public static int anInt4514;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!lh;)Lclient!th;")
	public static Class57_Sub3 method3696(@OriginalArg(1) Class1_Sub1 arg0) {
		return new Class57_Sub3(arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4142(), arg0.method4130());
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZLclient!ss;)V")
	public static void method3698(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class219 arg1) {
		@Pc(12) int local12 = arg1.anInt6404 == 0 ? arg1.anInt6398 : arg1.anInt6404;
		@Pc(21) int local21 = arg1.anInt6413 == 0 ? arg1.anInt6363 : arg1.anInt6413;
		Static163.method2624(local21, Static448.aClass219ArrayArray2[arg1.anInt6422 >> 16], arg1.anInt6422, arg0, local12);
		if (arg1.aClass219Array3 != null) {
			Static163.method2624(local21, arg1.aClass219Array3, arg1.anInt6422, arg0, local12);
		}
		@Pc(57) Class1_Sub36 local57 = (Class1_Sub36) Static445.aClass27_42.method553((long) arg1.anInt6422);
		if (local57 != null) {
			Static77.method1347(arg0, local12, local21, local57.anInt5680);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!pp;Lclient!sd;)V")
	public static void method3700(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class211 arg1) {
		if (!arg1.aBoolean398) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort73;
		@Pc(9) short local9 = arg1.aShort74;
		@Pc(12) byte local12 = arg1.aByte73;
		@Pc(15) byte local15 = arg1.aByte78;
		@Pc(21) int local21 = (local6 << Static139.anInt2355) + Static122.anInt2160;
		@Pc(27) int local27 = (local9 << Static139.anInt2355) + Static122.anInt2160;
		@Pc(31) Class211[][] local31 = Static268.aClass211ArrayArrayArray4[local12];
		@Pc(53) float local53;
		if (Static160.aClass136Array2 == Static92.aClass136Array1) {
			Static233.aClass109_7.ba(Static328.aClass136Array3[0].va(local21, local27), Static106.method1649(local6, local9), Static352.method4874(local6, local9), Static75.method1285(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static233.aClass109_7.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class211 local86;
		@Pc(616) Class39_Sub4 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class39_Sub4 local377;
		@Pc(408) int local408;
		@Pc(411) Class26_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean397) {
			if (Static124.aBoolean122) {
				if (local12 > 0) {
					local86 = Static268.aClass211ArrayArrayArray4[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean398) {
						return;
					}
				}
				if (local6 <= Static384.anInt6665 && local6 > Static1.anInt149) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean398 && (local86.aBoolean397 || (arg1.aByte74 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static384.anInt6665 && local6 < Static160.anInt2750 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean398 && (local86.aBoolean397 || (arg1.aByte74 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static379.anInt6498 && local9 > Static179.anInt3236) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean398 && (local86.aBoolean397 || (arg1.aByte74 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static379.anInt6498 && local9 < Static333.anInt5793 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean398 && (local86.aBoolean397 || (arg1.aByte74 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static124.aBoolean122 = true;
			}
			arg1.aBoolean397 = false;
			if (arg1.aClass211_1 != null) {
				local86 = arg1.aClass211_1;
				Static233.aClass109_7.o(3000.0F, (201.5F - (float) (local86.aByte78 + 1) * 50.0F) * 1.5F);
				if (!Static97.method1525(local86.aByte78, local6, local9)) {
					Static92.aClass136Array1[local86.aByte78].method5975(local6, local9);
				}
				@Pc(249) Class26_Sub1 local249 = local86.aClass26_Sub1_2;
				if (local249 != null) {
					if (Static306.aBoolean360) {
						if ((local249.anInt3958 & arg1.aShort75) == 0) {
							Static45.method765(arg0, local12, local6, local9);
						} else {
							Static443.method5892(arg0, local249.anInt3958, local15, local6, local9);
						}
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local249.method5520(Static233.aClass109_7);
				}
				for (@Pc(286) Class125 local286 = local86.aClass125_3; local286 != null; local286 = local286.aClass125_1) {
					@Pc(290) Class26_Sub2 local290 = local286.aClass26_Sub2_1;
					if (local290 != null) {
						if (Static306.aBoolean360) {
							Static45.method765(arg0, local12, local6, local9);
							Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
						}
						local290.method5520(Static233.aClass109_7);
					}
				}
				Static233.aClass109_7.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static97.method1525(local15, local6, local9);
			if (local330) {
				Static92.aClass136Array1[local15].method5975(local6, local9);
				@Pc(341) Class26_Sub4 local341 = arg1.aClass26_Sub4_2;
				if (local341 != null && local341.aBoolean202) {
					if (local341.aBoolean201) {
						Static233.aClass109_7.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local377 = local341.method5520(Static233.aClass109_7);
					if (local377 != null) {
						local377.aClass26_1 = local341;
						local377.anInt3248 = local12;
						local377.anInt3249 = local6;
						local377.anInt3247 = local9;
						Static146.aClass188_4.method4538(local377);
					}
					if (local341.aBoolean201) {
						Static233.aClass109_7.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass26_Sub1_2;
			@Pc(414) Class26_Sub3 local414 = arg1.aClass26_Sub3_3;
			if (local411 != null || local414 != null) {
				if (Static384.anInt6665 == local6) {
					local406++;
				} else if (Static384.anInt6665 < local6) {
					local406 += 2;
				}
				if (Static379.anInt6498 == local9) {
					local406 += 3;
				} else if (Static379.anInt6498 > local9) {
					local406 += 6;
				}
				local408 = Static333.anIntArray458[local406];
				arg1.aShort75 = Static389.aShortArray85[local406];
			}
			if (local411 != null) {
				if ((local411.anInt3958 & Static440.anIntArray662[local406]) == 0) {
					arg1.aByte76 = 0;
				} else if (local411.anInt3958 == 16) {
					arg1.aByte76 = 3;
					arg1.aByte77 = Static67.aByteArray18[local406];
					arg1.aByte75 = (byte) (3 - arg1.aByte77);
				} else if (local411.anInt3958 == 32) {
					arg1.aByte76 = 6;
					arg1.aByte77 = Static280.aByteArray63[local406];
					arg1.aByte75 = (byte) (6 - arg1.aByte77);
				} else if (local411.anInt3958 == 64) {
					arg1.aByte76 = 12;
					arg1.aByte77 = Static55.aByteArray16[local406];
					arg1.aByte75 = (byte) (12 - arg1.aByte77);
				} else {
					arg1.aByte76 = 9;
					arg1.aByte77 = Static23.aByteArray11[local406];
					arg1.aByte75 = (byte) (9 - arg1.aByte77);
				}
				if ((local411.anInt3958 & local408) != 0 && !Static384.method5258(local15, local6, local9, local411.anInt3958)) {
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					@Pc(563) Class39_Sub4 local563 = local411.method5520(Static233.aClass109_7);
					if (local563 != null) {
						local563.aClass26_1 = local411;
						local563.anInt3248 = local12;
						local563.anInt3249 = local6;
						local563.anInt3247 = local9;
						Static146.aClass188_4.method4538(local563);
					}
				}
				@Pc(584) Class26_Sub1 local584 = arg1.aClass26_Sub1_3;
				if (local584 != null && (local584.anInt3958 & local408) != 0 && !Static384.method5258(local15, local6, local9, local584.anInt3958)) {
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local616 = local584.method5520(Static233.aClass109_7);
					if (local616 != null) {
						local616.aClass26_1 = local584;
						local616.anInt3248 = local12;
						local616.anInt3249 = local6;
						local616.anInt3247 = local9;
						Static146.aClass188_4.method4538(local616);
					}
				}
			}
			if (local414 != null && !Static132.method1899(local15, local6, local9, local414.method4627())) {
				@Pc(647) Class26_Sub3 local647 = arg1.aClass26_Sub3_2;
				Static233.aClass109_7.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5763 & local408) != 0) {
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local616 = local414.method5520(Static233.aClass109_7);
					if (local616 != null) {
						local616.aClass26_1 = local414;
						local616.anInt3248 = local12;
						local616.anInt3249 = local6;
						local616.anInt3247 = local9;
						Static146.aClass188_4.method4538(local616);
					}
				} else if (local414.anInt5763 == 256) {
					local706 = local414.anInt5768 - anInt4514;
					local711 = local414.anInt5760 - Static424.anInt7347;
					local714 = local414.anInt5759;
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
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					@Pc(759) Class39_Sub4 local759;
					if (local735 < local723) {
						local759 = local414.method5520(Static233.aClass109_7);
						if (local759 != null) {
							local759.aClass26_1 = local414;
							local759.anInt3248 = local12;
							local759.anInt3249 = local6;
							local759.anInt3247 = local9;
							Static146.aClass188_4.method4538(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5520(Static233.aClass109_7);
						if (local759 != null) {
							local759.aClass26_1 = local647;
							local759.anInt3248 = local12;
							local759.anInt3249 = local6;
							local759.anInt3247 = local9;
							Static146.aClass188_4.method4538(local759);
						}
					}
				}
				Static233.aClass109_7.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class26_Sub4 local814 = arg1.aClass26_Sub4_2;
				if (local814 != null && !local814.aBoolean202) {
					if (local814.aBoolean201) {
						Static233.aClass109_7.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local616 = local814.method5520(Static233.aClass109_7);
					if (local616 != null) {
						local616.aClass26_1 = local814;
						local616.anInt3248 = local12;
						local616.anInt3249 = local6;
						local616.anInt3247 = local9;
						Static146.aClass188_4.method4538(local616);
					}
					if (local814.aBoolean201) {
						Static233.aClass109_7.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class26_Sub5 local880 = arg1.aClass26_Sub5_1;
				if (local880 != null && !local880.aBoolean144) {
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					@Pc(903) Class39_Sub4 local903 = local880.method5520(Static233.aClass109_7);
					if (local903 != null) {
						local903.aClass26_1 = local880;
						local903.anInt3248 = local12;
						local903.anInt3249 = local6;
						local903.anInt3247 = local9;
						Static146.aClass188_4.method4538(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte74;
			if (local924 != 0) {
				@Pc(941) Class211 local941;
				if (local6 < Static384.anInt6665 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean398) {
						Static66.aClass54_1.method4348(local941);
					}
				}
				if (local9 < Static379.anInt6498 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean398) {
						Static66.aClass54_1.method4348(local941);
					}
				}
				if (local6 > Static384.anInt6665 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean398) {
						Static66.aClass54_1.method4348(local941);
					}
				}
				if (local9 > Static379.anInt6498 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean398) {
						Static66.aClass54_1.method4348(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class26_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class125 local1030;
		if (arg1.aByte76 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass125_3; local1030 != null; local1030 = local1030.aClass125_1) {
				if (local1030.aClass26_Sub2_1.anInt7066 != Static48.anInt907 && (local1030.anInt3453 & arg1.aByte76) == arg1.aByte77) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass26_Sub1_2;
				if (!Static384.method5258(local15, local6, local9, local1057.anInt3958)) {
					if (Static306.aBoolean360) {
						label682: {
							if (local1057.anInt3958 >= 16) {
								local1074 = local6 - Static384.anInt6665;
								local1078 = local9 - Static379.anInt6498;
								if (local1057.anInt3958 == 16) {
									local1074 -= Static122.anInt2160;
									local1078 += Static122.anInt2160;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static378.anInt6480) {
										Static45.method765(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt3958 == 32) {
									local1074 += Static122.anInt2160;
									local1078 += Static122.anInt2160;
									if (local1078 < -local1074 && local6 < Static377.anInt6467 && local9 < Static378.anInt6480) {
										Static45.method765(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt3958 == 64) {
									local1074 += Static122.anInt2160;
									local1078 -= Static122.anInt2160;
									if (local1078 > local1074 && local6 < Static377.anInt6467 && local9 > 0) {
										Static45.method765(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt3958 == 128) {
									local1074 -= Static122.anInt2160;
									local1078 -= Static122.anInt2160;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static45.method765(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static45.method765(arg0, local12, local6, local9);
						}
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					@Pc(1216) Class39_Sub4 local1216 = local1057.method5520(Static233.aClass109_7);
					if (local1216 != null) {
						local1216.aClass26_1 = local1057;
						local1216.anInt3248 = local12;
						local1216.anInt3249 = local6;
						local1216.anInt3247 = local9;
						Static146.aClass188_4.method4538(local1216);
					}
				}
				arg1.aByte76 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean399) {
			try {
				arg1.aBoolean399 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass125_3; local1030 != null; local1030 = local1030.aClass125_1) {
					@Pc(1252) Class26_Sub2 local1252 = local1030.aClass26_Sub2_1;
					if (local1252.anInt7066 != Static48.anInt907) {
						for (local1074 = local1252.aShort93; local1074 <= local1252.aShort92; local1074++) {
							for (local1078 = local1252.aShort94; local1078 <= local1252.aShort95; local1078++) {
								@Pc(1270) Class211 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean397) {
									arg1.aBoolean399 = true;
									continue label625;
								}
								if (local1270.aByte76 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort93) {
										local706++;
									}
									if (local1074 < local1252.aShort92) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort94) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort95) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte76) == arg1.aByte75) {
										arg1.aBoolean399 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static384.anInt6665 - local1252.aShort93;
						local1333 = local1252.aShort92 - Static384.anInt6665;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static379.anInt6498 - local1252.aShort94;
						local711 = local1252.aShort95 - Static379.anInt6498;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass26_Sub2Array2[local1245] = local1252;
						arg0.anIntArray211[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class26_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass26_Sub2Array2[local1078];
						if (local1384.anInt7066 != Static48.anInt907) {
							local706 = arg0.anIntArray211[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7068 - anInt4514;
								local714 = local1384.anInt7065 - Static424.anInt7347;
								local723 = arg0.aClass26_Sub2Array2[local1074].anInt7068 - anInt4514;
								local735 = arg0.aClass26_Sub2Array2[local1074].anInt7065 - Static424.anInt7347;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass26_Sub2Array2[local1074];
					local1384.anInt7066 = Static48.anInt907;
					if (!Static374.method5129(local15, local1384.aShort93, local1384.aShort92, local1384.aShort94, local1384.aShort95, local1384.method5522())) {
						if (Static306.aBoolean360) {
							if (local1384.aByte94 == 0) {
								Static69.method1194(arg0, local12, local1384.aShort93, local1384.aShort94, local1384.aShort92, local1384.aShort95);
							} else {
								Static45.method765(arg0, local12, local6, local9);
								local706 = local6 - Static384.anInt6665;
								local711 = local9 - Static379.anInt6498;
								if (local1384.aByte94 == 2) {
									if (local711 > -local706) {
										Static333.method4650(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static333.method4650(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static333.method4650(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static333.method4650(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
						}
						local616 = local1384.method5520(Static233.aClass109_7);
						if (local616 != null) {
							local616.aClass26_1 = local1384;
							local616.anInt3248 = local12;
							local616.anInt3249 = local1384.aShort93;
							local616.anInt3247 = local1384.aShort94;
							Static146.aClass188_4.method4538(local616);
						}
					}
					for (local706 = local1384.aShort93; local706 <= local1384.aShort92; local706++) {
						for (local711 = local1384.aShort94; local711 <= local1384.aShort95; local711++) {
							@Pc(1609) Class211 local1609 = local31[local706][local711];
							if (local1609.aByte76 != 0) {
								Static66.aClass54_1.method4348(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean398) {
								Static66.aClass54_1.method4348(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean399) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean399 = false;
			}
		}
		if (arg1.aClass185_1 != null && arg1.aByte72 == (byte) (Static365.anInt6212 & 0xFF)) {
			@Pc(1664) Class185 local1664 = arg1.aClass185_1;
			local406 = Static92.aClass136Array1[local12].I(local6, local9);
			if (local12 < Static107.anInt1964 - 1) {
				local408 = Static92.aClass136Array1[local12].I(local6, local9) - Static92.aClass136Array1[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static139.anInt2355;
			}
			Static253.aClass18_5.method4940(local21, local406, local27, arg0.anIntArray210);
			local1074 = arg0.anIntArray210[2];
			Static253.aClass18_5.method4940(local21, local406 - local408, local27, arg0.anIntArray210);
			local1078 = arg0.anIntArray210[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static273.anInt4870;
			local706 += Static273.anInt4870;
			local1664.anInt5596 = local1333;
			local1664.anInt5595 = local706;
			local1664.aBoolean365 = true;
			Static233.aClass109_7.method4702(local1664);
		}
		if (!arg1.aBoolean398) {
			return;
		}
		if (arg1.aByte76 != 0) {
			return;
		}
		if (local6 <= Static384.anInt6665 && local6 > Static1.anInt149) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean398) {
				return;
			}
		}
		if (local6 >= Static384.anInt6665 && local6 < Static160.anInt2750 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean398) {
				return;
			}
		}
		if (local9 <= Static379.anInt6498 && local9 > Static179.anInt3236) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean398) {
				return;
			}
		}
		if (local9 >= Static379.anInt6498 && local9 < Static333.anInt5793 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean398) {
				return;
			}
		}
		arg1.aBoolean398 = false;
		Static331.anInt5788--;
		@Pc(1855) Class26_Sub5 local1855 = arg1.aClass26_Sub5_1;
		if (local1855 != null && local1855.aBoolean144) {
			if (Static306.aBoolean360) {
				Static45.method765(arg0, local12, local6, local9);
				Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
			}
			@Pc(1878) Class39_Sub4 local1878 = local1855.method5520(Static233.aClass109_7);
			if (local1878 != null) {
				local1878.aClass26_1 = local1855;
				local1878.anInt3248 = local12;
				local1878.anInt3249 = local6;
				local1878.anInt3247 = local9;
				Static146.aClass188_4.method4538(local1878);
			}
		}
		if (arg1.aShort75 != 0) {
			@Pc(1902) Class26_Sub3 local1902 = arg1.aClass26_Sub3_3;
			if (local1902 != null && !Static132.method1899(local15, local6, local9, local1902.method4627())) {
				if ((local1902.anInt5763 & arg1.aShort75) != 0) {
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					local377 = local1902.method5520(Static233.aClass109_7);
					if (local377 != null) {
						local377.aClass26_1 = local1902;
						local377.anInt3248 = local12;
						local377.anInt3249 = local6;
						local377.anInt3247 = local9;
						Static146.aClass188_4.method4538(local377);
					}
				} else if (local1902.anInt5763 == 256) {
					local408 = local1902.anInt5768 - anInt4514;
					local1074 = local1902.anInt5760 - Static424.anInt7347;
					local1078 = local1902.anInt5759;
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
					if (Static306.aBoolean360) {
						Static45.method765(arg0, local12, local6, local9);
						Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
					}
					@Pc(2012) Class26_Sub3 local2012 = arg1.aClass26_Sub3_2;
					@Pc(2020) Class39_Sub4 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5520(Static233.aClass109_7);
						if (local2020 != null) {
							local2020.aClass26_1 = local1902;
							local2020.anInt3248 = local12;
							local2020.anInt3249 = local6;
							local2020.anInt3247 = local9;
							Static146.aClass188_4.method4538(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5520(Static233.aClass109_7);
						if (local2020 != null) {
							local2020.aClass26_1 = local2012;
							local2020.anInt3248 = local12;
							local2020.anInt3249 = local6;
							local2020.anInt3247 = local9;
							Static146.aClass188_4.method4538(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass26_Sub1_2;
			local411 = arg1.aClass26_Sub1_3;
			@Pc(2105) Class39_Sub4 local2105;
			if (local411 != null && (local411.anInt3958 & arg1.aShort75) != 0 && !Static384.method5258(local15, local6, local9, local411.anInt3958)) {
				if (Static306.aBoolean360) {
					Static443.method5892(arg0, local411.anInt3958, local12, local6, local9);
					Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
				}
				local2105 = local411.method5520(Static233.aClass109_7);
				if (local2105 != null) {
					local2105.aClass26_1 = local411;
					local2105.anInt3248 = local12;
					local2105.anInt3249 = local6;
					local2105.anInt3247 = local9;
					Static146.aClass188_4.method4538(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt3958 & arg1.aShort75) != 0 && !Static384.method5258(local15, local6, local9, local1057.anInt3958)) {
				if (Static306.aBoolean360) {
					Static443.method5892(arg0, local1057.anInt3958, local12, local6, local9);
					Static233.aClass109_7.method4726(arg0.anInt2244, arg0.aClass1_Sub5Array2);
				}
				local2105 = local1057.method5520(Static233.aClass109_7);
				if (local2105 != null) {
					local2105.aClass26_1 = local1057;
					local2105.anInt3248 = local12;
					local2105.anInt3249 = local6;
					local2105.anInt3247 = local9;
					Static146.aClass188_4.method4538(local2105);
				}
			}
		}
		@Pc(2191) Class211 local2191;
		if (local12 < Static107.anInt1964 - 1) {
			local2191 = Static268.aClass211ArrayArrayArray4[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean398) {
				Static66.aClass54_1.method4344(local2191);
			}
		}
		if (local6 < Static384.anInt6665) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean398) {
				Static66.aClass54_1.method4348(local2191);
			}
		}
		if (local9 < Static379.anInt6498) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean398) {
				Static66.aClass54_1.method4348(local2191);
			}
		}
		if (local6 > Static384.anInt6665) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean398) {
				Static66.aClass54_1.method4348(local2191);
			}
		}
		if (local9 > Static379.anInt6498) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean398) {
				Static66.aClass54_1.method4348(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBIIZIILclient!qp;Lclient!qa;ILclient!c;II)Lclient!c;")
	public static Class37 method3701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class191 arg8, @OriginalArg(10) Class109 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class37 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return null;
		}
		@Pc(18) int local18 = 2055;
		if (arg8 != null) {
			local18 = arg8.method4612(false, -1, arg0) | 0x807;
			local18 &= 0xFFFFFDFF;
		}
		@Pc(54) long local54 = ((long) arg12 << 48) + ((long) arg10 << 32) + (long) ((arg6 << 24) + (arg1 << 16) + arg2);
		@Pc(56) Class83 local56 = Static244.aClass83_38;
		@Pc(66) Class37 local66;
		synchronized (Static244.aClass83_38) {
			local66 = (Class37) Static244.aClass83_38.method1658(local54);
		}
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(180) int local180;
		if (local66 == null || arg9.method4710(local66.n(), local18) != 0) {
			if (local66 != null) {
				local18 = arg9.method4699(local18, local66.n());
			}
			@Pc(101) byte local101;
			if (arg2 == 1) {
				local101 = 9;
			} else if (arg2 == 2) {
				local101 = 12;
			} else if (arg2 == 3) {
				local101 = 15;
			} else if (arg2 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(138) int[] local138 = new int[] { 64, 96, 128 };
			@Pc(157) Class264 local157 = new Class264(local101 * 3 + 1, local101 * 2 * 3 + -local101, 0);
			local164 = local157.method5912(0, 0, 0);
			@Pc(168) int[][] local168 = new int[3][local101];
			@Pc(182) int local182;
			@Pc(206) int local206;
			for (local170 = 0; local170 < 3; local170++) {
				local176 = local138[local170];
				local180 = local138[local170];
				for (local182 = 0; local182 < local101; local182++) {
					@Pc(190) int local190 = (local182 << 14) / local101;
					@Pc(198) int local198 = Class4.anIntArray7[local190] * local176 >> 15;
					local206 = Class4.anIntArray6[local190] * local180 >> 15;
					local168[local170][local182] = local157.method5912(local206, 0, local198);
				}
			}
			for (local176 = 0; local176 < 3; local176++) {
				local180 = (local176 * 256 + 128) / 3;
				local182 = 256 - local180;
				@Pc(259) byte local259 = (byte) (local182 * arg1 + arg6 * local180 >> 8);
				@Pc(304) short local304 = (short) ((local180 * (arg12 & 0x380) + (arg10 & 0x380) * local182 & 0x38000) + ((arg10 & 0xFC00) * local182 + local180 * (arg12 & 0xFC00) & 0xFC0000) + (local182 * (arg10 & 0x7F) + (arg12 & 0x7F) * local180 & 0x7F00) >> 8);
				for (local206 = 0; local206 < local101; local206++) {
					if (local176 == 0) {
						local157.method5908((short) -1, local168[0][local206], (byte) 1, local304, local168[0][(local206 + 1) % local101], local259, local164, (byte) -1);
					} else {
						local157.method5908((short) -1, local168[local176][(local206 + 1) % local101], (byte) 1, local304, local168[local176 - 1][(local206 + 1) % local101], local259, local168[local176 - 1][local206], (byte) -1);
						local157.method5908((short) -1, local168[local176][local206], (byte) 1, local304, local168[local176][(local206 + 1) % local101], local259, local168[local176 - 1][local206], (byte) -1);
					}
				}
			}
			local66 = arg9.method4697(local157, local18, Static400.anInt6932, 64, 768);
			@Pc(427) Class83 local427 = Static244.aClass83_38;
			synchronized (Static244.aClass83_38) {
				Static244.aClass83_38.method1675(local54, local66);
			}
		}
		@Pc(446) int local446 = (arg2 << 6) - 1;
		@Pc(449) int local449 = -local446;
		@Pc(452) int local452 = -local446;
		@Pc(454) int local454 = local446;
		local164 = local446;
		if (arg5) {
			if (arg13 > 13312 || arg13 < 3072) {
				local452 -= 128;
			}
			if (arg13 > 5120 && arg13 < 11264) {
				local164 = local446 + 128;
			}
			if (arg13 > 9216 && arg13 < 15360) {
				local454 = local446 + 128;
			}
			if (arg13 > 1024 && arg13 < 7168) {
				local449 -= 128;
			}
		}
		@Pc(501) int local501 = arg11.la();
		local170 = arg11.VA();
		local176 = arg11.X();
		if (local501 < local449) {
			local501 = local449;
		}
		if (local452 > local176) {
			local176 = local452;
		}
		if (local454 < local170) {
			local170 = local454;
		}
		local180 = arg11.C();
		if (local180 > local164) {
			local180 = local164;
		}
		@Pc(540) Class1_Sub2_Sub6 local540 = null;
		if (arg8 != null) {
			@Pc(547) int local547 = arg8.anIntArray452[arg0];
			local540 = Static191.aClass28_1.method571(local547 >> 16);
			arg0 = local547 & 0xFFFF;
		}
		if (local540 == null) {
			local66 = local66.method4221((byte) 3, local18, true);
			local66.XA(local170 - local501 >> 1, 128, local180 - local176 >> 1);
			local66.ja(local170 + local501 >> 1, 0, local176 + local180 >> 1);
		} else {
			local66 = local66.method4221((byte) 3, local18, true);
			local66.XA(local170 - local501 >> 1, 128, local180 - local176 >> 1);
			local66.ja(local501 + local170 >> 1, 0, local180 + local176 >> 1);
			local66.method4233(arg0, local540);
		}
		if (arg7 != 0) {
			local66.WA(arg7);
		}
		if (arg4 != 0) {
			local66.o(arg4);
		}
		if (arg3 != 0) {
			local66.ja(0, arg3, 0);
		}
		return local66;
	}
}
