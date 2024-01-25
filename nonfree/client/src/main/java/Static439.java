import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "Lclient!db;")
	public static final Class64 aClass64_480 = new Class64(91, 7);

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "Lclient!db;")
	public static final Class64 aClass64_481 = new Class64(28, -2);

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!db;")
	public static final Class64 aClass64_482 = new Class64(70, 3);

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "Lclient!db;")
	public static final Class64 aClass64_483 = new Class64(36, -2);

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "J")
	public static long aLong296 = -1L;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
	public static int anInt9627 = -1;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!dw;Lclient!fba;)V")
	public static void method7891(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class100 arg1) {
		if (!arg1.aBoolean246) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort50;
		@Pc(9) short local9 = arg1.aShort51;
		@Pc(12) byte local12 = arg1.aByte37;
		@Pc(15) byte local15 = arg1.aByte34;
		@Pc(21) int local21 = (local6 << Static41.anInt810) + Static436.anInt7494;
		@Pc(27) int local27 = (local9 << Static41.anInt810) + Static436.anInt7494;
		@Pc(31) Class100[][] local31 = Static309.aClass100ArrayArrayArray2[local12];
		if (Static109.aClass16Array2 == Static112.aClass16Array3) {
			Static474.aClass66_8.LA(Static45.aClass16Array1[0].sa(local21, local27), Static293.method4587(local6, local9), Static113.method2340(local6, local9), Static176.method3345(local6, local9));
		}
		@Pc(68) Class100 local68;
		@Pc(556) Class26_Sub6 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class26_Sub6 local326;
		@Pc(348) int local348;
		@Pc(351) Class10_Sub2 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean244) {
			if (Static384.aBoolean505) {
				if (local12 > 0) {
					local68 = Static309.aClass100ArrayArrayArray2[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean246) {
						return;
					}
				}
				if (local6 <= Static22.anInt439 && local6 > Static580.anInt2683) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean246 && (local68.aBoolean244 || (arg1.aByte36 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static22.anInt439 && local6 < Static19.anInt391 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean246 && (local68.aBoolean244 || (arg1.aByte36 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static140.anInt3150 && local9 > Static312.anInt9781) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean246 && (local68.aBoolean244 || (arg1.aByte36 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static140.anInt3150 && local9 < Static268.anInt5152 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean246 && (local68.aBoolean244 || (arg1.aByte36 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static384.aBoolean505 = true;
			}
			arg1.aBoolean244 = false;
			if (arg1.aClass100_1 != null) {
				local68 = arg1.aClass100_1;
				if (!Static246.method4173(local68.aByte34, local6, local9)) {
					Static112.aClass16Array3[local68.aByte34].method8044(local6, local9);
				}
				@Pc(217) Class10_Sub2 local217 = local68.aClass10_Sub2_3;
				if (local217 != null) {
					if (Static590.aBoolean681) {
						if ((local217.anInt8054 & arg1.aShort52) == 0) {
							Static245.method4154(arg0, local12, local6, local9);
						} else {
							Static185.method7125(arg0, local217.anInt8054, local15, local6, local9);
						}
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local217.method7727(Static474.aClass66_8);
				}
				for (@Pc(254) Class35 local254 = local68.aClass35_2; local254 != null; local254 = local254.aClass35_1) {
					@Pc(258) Class10_Sub1 local258 = local254.aClass10_Sub1_1;
					if (local258 != null) {
						if (Static590.aBoolean681) {
							Static245.method4154(arg0, local12, local6, local9);
							Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
						}
						local258.method7727(Static474.aClass66_8);
					}
				}
			}
			local292 = !Static246.method4173(local15, local6, local9);
			if (local292) {
				Static112.aClass16Array3[local15].method8044(local6, local9);
				@Pc(303) Class10_Sub5 local303 = arg1.aClass10_Sub5_1;
				if (local303 != null && local303.aBoolean668) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local326 = local303.method7727(Static474.aClass66_8);
					if (local326 != null) {
						local326.aClass10_1 = local303;
						local326.anInt6988 = local12;
						local326.anInt6990 = local6;
						local326.anInt6987 = local9;
						Static350.aClass8_4.method109(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass10_Sub2_3;
			@Pc(354) Class10_Sub4 local354 = arg1.aClass10_Sub4_1;
			if (local351 != null || local354 != null) {
				if (Static22.anInt439 == local6) {
					local346++;
				} else if (Static22.anInt439 < local6) {
					local346 += 2;
				}
				if (Static140.anInt3150 == local9) {
					local346 += 3;
				} else if (Static140.anInt3150 > local9) {
					local346 += 6;
				}
				local348 = Static580.anIntArray248[local346];
				arg1.aShort52 = Static215.aShortArray86[local346];
			}
			if (local351 != null) {
				if ((local351.anInt8054 & Static346.anIntArray507[local346]) == 0) {
					arg1.aByte35 = 0;
				} else if (local351.anInt8054 == 16) {
					arg1.aByte35 = 3;
					arg1.aByte33 = Static67.aByteArray16[local346];
					arg1.aByte38 = (byte) (3 - arg1.aByte33);
				} else if (local351.anInt8054 == 32) {
					arg1.aByte35 = 6;
					arg1.aByte33 = Static99.aByteArray30[local346];
					arg1.aByte38 = (byte) (6 - arg1.aByte33);
				} else if (local351.anInt8054 == 64) {
					arg1.aByte35 = 12;
					arg1.aByte33 = Static404.aByteArray84[local346];
					arg1.aByte38 = (byte) (12 - arg1.aByte33);
				} else {
					arg1.aByte35 = 9;
					arg1.aByte33 = Static467.aByteArray104[local346];
					arg1.aByte38 = (byte) (9 - arg1.aByte33);
				}
				if ((local351.anInt8054 & local348) != 0 && !Static171.method3298(local15, local6, local9, local351.anInt8054)) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					@Pc(503) Class26_Sub6 local503 = local351.method7727(Static474.aClass66_8);
					if (local503 != null) {
						local503.aClass10_1 = local351;
						local503.anInt6988 = local12;
						local503.anInt6990 = local6;
						local503.anInt6987 = local9;
						Static350.aClass8_4.method109(local503);
					}
				}
				@Pc(524) Class10_Sub2 local524 = arg1.aClass10_Sub2_2;
				if (local524 != null && (local524.anInt8054 & local348) != 0 && !Static171.method3298(local15, local6, local9, local524.anInt8054)) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local556 = local524.method7727(Static474.aClass66_8);
					if (local556 != null) {
						local556.aClass10_1 = local524;
						local556.anInt6988 = local12;
						local556.anInt6990 = local6;
						local556.anInt6987 = local9;
						Static350.aClass8_4.method109(local556);
					}
				}
			}
			if (local354 != null && !Static528.method7383(local15, local6, local9, local354.method7188())) {
				@Pc(587) Class10_Sub4 local587 = arg1.aClass10_Sub4_2;
				if ((local354.anInt8731 & local348) != 0) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local556 = local354.method7727(Static474.aClass66_8);
					if (local556 != null) {
						local556.aClass10_1 = local354;
						local556.anInt6988 = local12;
						local556.anInt6990 = local6;
						local556.anInt6987 = local9;
						Static350.aClass8_4.method109(local556);
					}
				} else if (local354.anInt8731 == 256) {
					local638 = local354.anInt8732 - Static365.anInt6607;
					local643 = local354.anInt8737 - Static427.anInt7348;
					local646 = local354.anInt8736;
					if (local646 == 1 || local646 == 2) {
						local655 = -local638;
					} else {
						local655 = local638;
					}
					if (local646 == 2 || local646 == 3) {
						local667 = -local643;
					} else {
						local667 = local643;
					}
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					@Pc(691) Class26_Sub6 local691;
					if (local667 < local655) {
						local691 = local354.method7727(Static474.aClass66_8);
						if (local691 != null) {
							local691.aClass10_1 = local354;
							local691.anInt6988 = local12;
							local691.anInt6990 = local6;
							local691.anInt6987 = local9;
							Static350.aClass8_4.method109(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7727(Static474.aClass66_8);
						if (local691 != null) {
							local691.aClass10_1 = local587;
							local691.anInt6988 = local12;
							local691.anInt6990 = local6;
							local691.anInt6987 = local9;
							Static350.aClass8_4.method109(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class10_Sub5 local740 = arg1.aClass10_Sub5_1;
				if (local740 != null && !local740.aBoolean668) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local556 = local740.method7727(Static474.aClass66_8);
					if (local556 != null) {
						local556.aClass10_1 = local740;
						local556.anInt6988 = local12;
						local556.anInt6990 = local6;
						local556.anInt6987 = local9;
						Static350.aClass8_4.method109(local556);
					}
				}
				@Pc(784) Class10_Sub3 local784 = arg1.aClass10_Sub3_1;
				if (local784 != null && !local784.aBoolean193) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					@Pc(807) Class26_Sub6 local807 = local784.method7727(Static474.aClass66_8);
					if (local807 != null) {
						local807.aClass10_1 = local784;
						local807.anInt6988 = local12;
						local807.anInt6990 = local6;
						local807.anInt6987 = local9;
						Static350.aClass8_4.method109(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte36;
			if (local828 != 0) {
				@Pc(845) Class100 local845;
				if (local6 < Static22.anInt439 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean246) {
						Static146.aClass40_1.method7716(local845);
					}
				}
				if (local9 < Static140.anInt3150 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean246) {
						Static146.aClass40_1.method7716(local845);
					}
				}
				if (local6 > Static22.anInt439 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean246) {
						Static146.aClass40_1.method7716(local845);
					}
				}
				if (local9 > Static140.anInt3150 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean246) {
						Static146.aClass40_1.method7716(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class10_Sub2 local961;
		@Pc(982) int local982;
		@Pc(934) Class35 local934;
		if (arg1.aByte35 != 0) {
			local292 = true;
			for (local934 = arg1.aClass35_2; local934 != null; local934 = local934.aClass35_1) {
				if (local934.aClass10_Sub1_1.anInt8930 != Static287.anInt5340 && (local934.anInt845 & arg1.aByte35) == arg1.aByte33) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass10_Sub2_3;
				if (!Static171.method3298(local15, local6, local9, local961.anInt8054)) {
					if (Static590.aBoolean681) {
						label663: {
							if (local961.anInt8054 >= 16) {
								local978 = local6 - Static22.anInt439;
								local982 = local9 - Static140.anInt3150;
								if (local961.anInt8054 == 16) {
									local978 -= Static436.anInt7494;
									local982 += Static436.anInt7494;
									if (local982 < local978 && local6 > 0 && local9 <= Static357.anInt6212) {
										Static245.method4154(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt8054 == 32) {
									local978 += Static436.anInt7494;
									local982 += Static436.anInt7494;
									if (local982 < -local978 && local6 < Static173.anInt3719 && local9 < Static357.anInt6212) {
										Static245.method4154(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt8054 == 64) {
									local978 += Static436.anInt7494;
									local982 -= Static436.anInt7494;
									if (local982 > local978 && local6 < Static173.anInt3719 && local9 > 0) {
										Static245.method4154(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt8054 == 128) {
									local978 -= Static436.anInt7494;
									local982 -= Static436.anInt7494;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static245.method4154(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static245.method4154(arg0, local12, local6, local9);
						}
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					@Pc(1120) Class26_Sub6 local1120 = local961.method7727(Static474.aClass66_8);
					if (local1120 != null) {
						local1120.aClass10_1 = local961;
						local1120.anInt6988 = local12;
						local1120.anInt6990 = local6;
						local1120.anInt6987 = local9;
						Static350.aClass8_4.method109(local1120);
					}
				}
				arg1.aByte35 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean245) {
			try {
				arg1.aBoolean245 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass35_2; local934 != null; local934 = local934.aClass35_1) {
					@Pc(1156) Class10_Sub1 local1156 = local934.aClass10_Sub1_1;
					if (local1156.anInt8930 != Static287.anInt5340) {
						for (local978 = local1156.aShort116; local978 <= local1156.aShort118; local978++) {
							for (local982 = local1156.aShort117; local982 <= local1156.aShort115; local982++) {
								@Pc(1174) Class100 local1174 = local31[local978][local982];
								if (local1174.aBoolean244) {
									arg1.aBoolean245 = true;
									continue label606;
								}
								if (local1174.aByte35 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort116) {
										local638++;
									}
									if (local978 < local1156.aShort118) {
										local638 += 4;
									}
									if (local982 > local1156.aShort117) {
										local638 += 8;
									}
									if (local982 < local1156.aShort115) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte35) == arg1.aByte38) {
										arg1.aBoolean245 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static22.anInt439 - local1156.aShort116;
						local1237 = local1156.aShort118 - Static22.anInt439;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static140.anInt3150 - local1156.aShort117;
						local643 = local1156.aShort115 - Static140.anInt3150;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass10_Sub1Array2[local1149] = local1156;
						arg0.anIntArray610[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class10_Sub1 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass10_Sub1Array2[local982];
						if (local1288.anInt8930 != Static287.anInt5340) {
							local638 = arg0.anIntArray610[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt8934 - Static365.anInt6607;
								local646 = local1288.anInt8929 - Static427.anInt7348;
								local655 = arg0.aClass10_Sub1Array2[local978].anInt8934 - Static365.anInt6607;
								local667 = arg0.aClass10_Sub1Array2[local978].anInt8929 - Static427.anInt7348;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass10_Sub1Array2[local978];
					local1288.anInt8930 = Static287.anInt5340;
					if (!Static115.method2393(local15, local1288.aShort116, local1288.aShort118, local1288.aShort117, local1288.aShort115, local1288.method7342())) {
						if (Static590.aBoolean681) {
							if (local1288.aByte102 == 0) {
								Static481.method6706(arg0, local12, local1288.aShort116, local1288.aShort117, local1288.aShort118, local1288.aShort115);
							} else {
								Static245.method4154(arg0, local12, local6, local9);
								local638 = local6 - Static22.anInt439;
								local643 = local9 - Static140.anInt3150;
								if (local1288.aByte102 == 2) {
									if (local643 > -local638) {
										Static545.method7552(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static545.method7552(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static545.method7552(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static545.method7552(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
						}
						local556 = local1288.method7727(Static474.aClass66_8);
						if (local556 != null) {
							local556.aClass10_1 = local1288;
							local556.anInt6988 = local12;
							local556.anInt6990 = local1288.aShort116;
							local556.anInt6987 = local1288.aShort117;
							Static350.aClass8_4.method109(local556);
						}
					}
					for (local638 = local1288.aShort116; local638 <= local1288.aShort118; local638++) {
						for (local643 = local1288.aShort117; local643 <= local1288.aShort115; local643++) {
							@Pc(1513) Class100 local1513 = local31[local638][local643];
							if (local1513.aByte35 != 0) {
								Static146.aClass40_1.method7716(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean246) {
								Static146.aClass40_1.method7716(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean245) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean245 = false;
			}
		}
		if (arg1.aClass42_1 != null && arg1.aByte39 == (byte) (Static247.anInt4915 & 0xFF)) {
			@Pc(1568) Class42 local1568 = arg1.aClass42_1;
			local346 = Static112.aClass16Array3[local12].JA(local6, local9);
			if (local12 < Static562.anInt9418 - 1) {
				local348 = Static112.aClass16Array3[local12].JA(local6, local9) - Static112.aClass16Array3[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static41.anInt810;
			}
			Static203.aClass134_5.method7826(local21, local346, local27, arg0.anIntArray609);
			local978 = arg0.anIntArray609[2];
			Static203.aClass134_5.method7826(local21, local346 - local348, local27, arg0.anIntArray609);
			local982 = arg0.anIntArray609[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static34.anInt9208;
			local638 += Static34.anInt9208;
			local1568.anInt912 = local1237;
			local1568.anInt913 = local638;
			local1568.aBoolean80 = true;
			Static474.aClass66_8.method6846(local1568);
		}
		if (!arg1.aBoolean246) {
			return;
		}
		if (arg1.aByte35 != 0) {
			return;
		}
		if (local6 <= Static22.anInt439 && local6 > Static580.anInt2683) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean246) {
				return;
			}
		}
		if (local6 >= Static22.anInt439 && local6 < Static19.anInt391 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean246) {
				return;
			}
		}
		if (local9 <= Static140.anInt3150 && local9 > Static312.anInt9781) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean246) {
				return;
			}
		}
		if (local9 >= Static140.anInt3150 && local9 < Static268.anInt5152 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean246) {
				return;
			}
		}
		arg1.aBoolean246 = false;
		Static387.anInt9643--;
		@Pc(1759) Class10_Sub3 local1759 = arg1.aClass10_Sub3_1;
		if (local1759 != null && local1759.aBoolean193) {
			if (Static590.aBoolean681) {
				Static245.method4154(arg0, local12, local6, local9);
				Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
			}
			@Pc(1782) Class26_Sub6 local1782 = local1759.method7727(Static474.aClass66_8);
			if (local1782 != null) {
				local1782.aClass10_1 = local1759;
				local1782.anInt6988 = local12;
				local1782.anInt6990 = local6;
				local1782.anInt6987 = local9;
				Static350.aClass8_4.method109(local1782);
			}
		}
		if (arg1.aShort52 != 0) {
			@Pc(1806) Class10_Sub4 local1806 = arg1.aClass10_Sub4_1;
			if (local1806 != null && !Static528.method7383(local15, local6, local9, local1806.method7188())) {
				if ((local1806.anInt8731 & arg1.aShort52) != 0) {
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					local326 = local1806.method7727(Static474.aClass66_8);
					if (local326 != null) {
						local326.aClass10_1 = local1806;
						local326.anInt6988 = local12;
						local326.anInt6990 = local6;
						local326.anInt6987 = local9;
						Static350.aClass8_4.method109(local326);
					}
				} else if (local1806.anInt8731 == 256) {
					local348 = local1806.anInt8732 - Static365.anInt6607;
					local978 = local1806.anInt8737 - Static427.anInt7348;
					local982 = local1806.anInt8736;
					if (local982 == 1 || local982 == 2) {
						local1237 = -local348;
					} else {
						local1237 = local348;
					}
					if (local982 == 2 || local982 == 3) {
						local638 = -local978;
					} else {
						local638 = local978;
					}
					if (Static590.aBoolean681) {
						Static245.method4154(arg0, local12, local6, local9);
						Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
					}
					@Pc(1916) Class10_Sub4 local1916 = arg1.aClass10_Sub4_2;
					@Pc(1924) Class26_Sub6 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7727(Static474.aClass66_8);
						if (local1924 != null) {
							local1924.aClass10_1 = local1806;
							local1924.anInt6988 = local12;
							local1924.anInt6990 = local6;
							local1924.anInt6987 = local9;
							Static350.aClass8_4.method109(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7727(Static474.aClass66_8);
						if (local1924 != null) {
							local1924.aClass10_1 = local1916;
							local1924.anInt6988 = local12;
							local1924.anInt6990 = local6;
							local1924.anInt6987 = local9;
							Static350.aClass8_4.method109(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass10_Sub2_3;
			local351 = arg1.aClass10_Sub2_2;
			@Pc(2009) Class26_Sub6 local2009;
			if (local351 != null && (local351.anInt8054 & arg1.aShort52) != 0 && !Static171.method3298(local15, local6, local9, local351.anInt8054)) {
				if (Static590.aBoolean681) {
					Static185.method7125(arg0, local351.anInt8054, local12, local6, local9);
					Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
				}
				local2009 = local351.method7727(Static474.aClass66_8);
				if (local2009 != null) {
					local2009.aClass10_1 = local351;
					local2009.anInt6988 = local12;
					local2009.anInt6990 = local6;
					local2009.anInt6987 = local9;
					Static350.aClass8_4.method109(local2009);
				}
			}
			if (local961 != null && (local961.anInt8054 & arg1.aShort52) != 0 && !Static171.method3298(local15, local6, local9, local961.anInt8054)) {
				if (Static590.aBoolean681) {
					Static185.method7125(arg0, local961.anInt8054, local12, local6, local9);
					Static474.aClass66_8.method6785(arg0.anInt7407, arg0.aClass4_Sub32Array5);
				}
				local2009 = local961.method7727(Static474.aClass66_8);
				if (local2009 != null) {
					local2009.aClass10_1 = local961;
					local2009.anInt6988 = local12;
					local2009.anInt6990 = local6;
					local2009.anInt6987 = local9;
					Static350.aClass8_4.method109(local2009);
				}
			}
		}
		@Pc(2095) Class100 local2095;
		if (local12 < Static562.anInt9418 - 1) {
			local2095 = Static309.aClass100ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean246) {
				Static146.aClass40_1.method7711(local2095);
			}
		}
		if (local6 < Static22.anInt439) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean246) {
				Static146.aClass40_1.method7716(local2095);
			}
		}
		if (local9 < Static140.anInt3150) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean246) {
				Static146.aClass40_1.method7716(local2095);
			}
		}
		if (local6 > Static22.anInt439) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean246) {
				Static146.aClass40_1.method7716(local2095);
			}
		}
		if (local9 > Static140.anInt3150) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean246) {
				Static146.aClass40_1.method7716(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)Lclient!rba;")
	public static Class4_Sub41 method7893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class4_Sub41 local5 = null;
		if (arg0 == 0) {
			local5 = Static128.method2707(Static102.aClass61_28, Class16_Sub3.lb);
		}
		if (arg0 == 1) {
			local5 = Static128.method2707(Static171.aClass61_41, Class16_Sub3.lb);
		}
		local5.aClass4_Sub9_Sub1_3.method5984(Static6.anInt97 + arg1);
		local5.aClass4_Sub9_Sub1_3.method5961(-345277664, Static12.aClass173_1.method6259(82) ? 1 : 0);
		local5.aClass4_Sub9_Sub1_3.method6002(Static373.anInt6695 + arg2);
		Static319.anInt5739 = arg2;
		Static357.aBoolean462 = false;
		Static435.anInt7462 = arg1;
		Static52.method798();
		return local5;
	}
}
