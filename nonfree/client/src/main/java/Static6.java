import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "Qb", descriptor = "Lclient!hh;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!af", name = "Vb", descriptor = "Z")
	public static boolean aBoolean17;

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "J")
	public static long aLong9 = 0L;

	@OriginalMember(owner = "client!af", name = "yb", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!af", name = "Rb", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_4 = new Class112(13, 0, 1, 0);

	@OriginalMember(owner = "client!af", name = "Tb", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_7 = new Class245(8);

	@OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
	public static int anInt302 = -1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIII)V")
	public static void method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static197.anInt4268 = arg1;
		Static10.anInt537 = arg3;
		Static318.anInt5995 = arg0;
		Static294.anInt5604 = arg4;
		Static570.anInt9637 = arg5;
		Static367.anInt6944 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method500(@OriginalArg(1) Class9 arg0) {
		if (Static218.aBoolean366) {
			Static579.method6612(arg0);
		} else {
			Static109.method2238(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "I", descriptor = "()V")
	public static void method501() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static398.aClass224ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static398.aClass224ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static396.anInt7505; local6++) {
					for (local9 = 0; local9 < Static54.anInt1441; local9++) {
						if (Static398.aClass224ArrayArrayArray3[local3][local6][local9] != null) {
							Static398.aClass224ArrayArrayArray3[local3][local6][local9].method5375();
						}
						Static398.aClass224ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static398.aClass224ArrayArrayArray3 = null;
		Static53.aClass62Array2 = null;
		if (Static263.aClass224ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static263.aClass224ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static396.anInt7505; local6++) {
					for (local9 = 0; local9 < Static54.anInt1441; local9++) {
						if (Static263.aClass224ArrayArrayArray2[local3][local6][local9] != null) {
							Static263.aClass224ArrayArrayArray2[local3][local6][local9].method5375();
						}
						Static263.aClass224ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static263.aClass224ArrayArrayArray2 = null;
		Static369.aClass62Array3 = null;
		Static256.aClass224ArrayArrayArray1 = null;
		Static47.aClass62Array1 = null;
		Static499.anInt8899 = 0;
		if (Static456.aClass350Array2 != null) {
			for (local3 = 0; local3 < Static499.anInt8899; local3++) {
				Static456.aClass350Array2[local3] = null;
			}
		}
		if (Static374.aClass11_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static209.anInt4411; local3++) {
				Static374.aClass11_Sub1Array1[local3] = null;
			}
			Static209.anInt4411 = 0;
		}
		if (Static470.aClass342Array1 != null) {
			for (local3 = 0; local3 < Static258.anInt5217; local3++) {
				Static470.aClass342Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static192.anInt4157; local6++) {
				for (local9 = 0; local9 < Static396.anInt7505; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static54.anInt1441; local160++) {
						Static447.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static258.anInt5217 = 0;
		}
		Static173.anIntArrayArrayArray4 = null;
		Static325.method5244();
		Static16.aClass267_1.method6536();
		Static270.aByteArrayArray18 = null;
		Static448.anIntArrayArray53 = null;
		Static571.aShortArrayArray11 = null;
		Static83.aClass58_2 = null;
		Static258.aClass8_6 = null;
		Static114.aClass9_5 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vp;Lclient!ne;)V")
	public static void method504(@OriginalArg(0) Class288 arg0, @OriginalArg(1) Class224 arg1) {
		if (!arg1.aBoolean471) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort66;
		@Pc(9) short local9 = arg1.aShort65;
		@Pc(12) byte local12 = arg1.aByte68;
		@Pc(15) byte local15 = arg1.aByte69;
		@Pc(21) int local21 = (local6 << Static494.anInt8859) + Static406.anInt9843;
		@Pc(27) int local27 = (local9 << Static494.anInt8859) + Static406.anInt9843;
		@Pc(31) Class224[][] local31 = Static256.aClass224ArrayArrayArray1[local12];
		if (Static369.aClass62Array3 == Static47.aClass62Array1) {
			Static114.aClass9_5.LA(Static53.aClass62Array2[0].sa(local21, local27), Static249.method4399(local6, local9), Static552.method7226(local6, local9), Static301.method4871(local6, local9));
		}
		@Pc(68) Class224 local68;
		@Pc(556) Class5_Sub5 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class5_Sub5 local326;
		@Pc(348) int local348;
		@Pc(351) Class11_Sub4 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean469) {
			if (Static342.aBoolean472) {
				if (local12 > 0) {
					local68 = Static256.aClass224ArrayArrayArray1[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean471) {
						return;
					}
				}
				if (local6 <= Static579.anInt7897 && local6 > Static118.anInt2585) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean471 && (local68.aBoolean469 || (arg1.aByte66 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static579.anInt7897 && local6 < Static275.anInt5345 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean471 && (local68.aBoolean469 || (arg1.aByte66 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static266.anInt4817 && local9 > Static17.anInt874) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean471 && (local68.aBoolean469 || (arg1.aByte66 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static266.anInt4817 && local9 < Static67.anInt1577 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean471 && (local68.aBoolean469 || (arg1.aByte66 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static342.aBoolean472 = true;
			}
			arg1.aBoolean469 = false;
			if (arg1.aClass224_1 != null) {
				local68 = arg1.aClass224_1;
				if (!Static104.method6580(local68.aByte69, local6, local9)) {
					Static47.aClass62Array1[local68.aByte69].method8204(local6, local9);
				}
				@Pc(217) Class11_Sub4 local217 = local68.aClass11_Sub4_3;
				if (local217 != null) {
					if (Static311.aBoolean405) {
						if ((local217.anInt5482 & arg1.aShort67) == 0) {
							Static371.method5918(arg0, local12, local6, local9);
						} else {
							Static59.method1321(arg0, local217.anInt5482, local15, local6, local9);
						}
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local217.method8109(Static114.aClass9_5);
				}
				for (@Pc(254) Class270 local254 = local68.aClass270_1; local254 != null; local254 = local254.aClass270_2) {
					@Pc(258) Class11_Sub1 local258 = local254.aClass11_Sub1_2;
					if (local258 != null) {
						if (Static311.aBoolean405) {
							Static371.method5918(arg0, local12, local6, local9);
							Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
						}
						local258.method8109(Static114.aClass9_5);
					}
				}
			}
			local292 = !Static104.method6580(local15, local6, local9);
			if (local292) {
				Static47.aClass62Array1[local15].method8204(local6, local9);
				@Pc(303) Class11_Sub5 local303 = arg1.aClass11_Sub5_2;
				if (local303 != null && local303.aBoolean717) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local326 = local303.method8109(Static114.aClass9_5);
					if (local326 != null) {
						local326.aClass11_1 = local303;
						local326.anInt7020 = local12;
						local326.anInt7025 = local6;
						local326.anInt7024 = local9;
						Static16.aClass267_1.method6538(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass11_Sub4_3;
			@Pc(354) Class11_Sub3 local354 = arg1.aClass11_Sub3_2;
			if (local351 != null || local354 != null) {
				if (Static579.anInt7897 == local6) {
					local346++;
				} else if (Static579.anInt7897 < local6) {
					local346 += 2;
				}
				if (Static266.anInt4817 == local9) {
					local346 += 3;
				} else if (Static266.anInt4817 > local9) {
					local346 += 6;
				}
				local348 = Static350.anIntArray430[local346];
				arg1.aShort67 = Static145.aShortArray34[local346];
			}
			if (local351 != null) {
				if ((local351.anInt5482 & Static412.anIntArray553[local346]) == 0) {
					arg1.aByte71 = 0;
				} else if (local351.anInt5482 == 16) {
					arg1.aByte71 = 3;
					arg1.aByte72 = Static258.aByteArray60[local346];
					arg1.aByte70 = (byte) (3 - arg1.aByte72);
				} else if (local351.anInt5482 == 32) {
					arg1.aByte71 = 6;
					arg1.aByte72 = Static507.aByteArray116[local346];
					arg1.aByte70 = (byte) (6 - arg1.aByte72);
				} else if (local351.anInt5482 == 64) {
					arg1.aByte71 = 12;
					arg1.aByte72 = Static90.aByteArray41[local346];
					arg1.aByte70 = (byte) (12 - arg1.aByte72);
				} else {
					arg1.aByte71 = 9;
					arg1.aByte72 = Static269.aByteArray61[local346];
					arg1.aByte70 = (byte) (9 - arg1.aByte72);
				}
				if ((local351.anInt5482 & local348) != 0 && !Static130.method2515(local15, local6, local9, local351.anInt5482)) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					@Pc(503) Class5_Sub5 local503 = local351.method8109(Static114.aClass9_5);
					if (local503 != null) {
						local503.aClass11_1 = local351;
						local503.anInt7020 = local12;
						local503.anInt7025 = local6;
						local503.anInt7024 = local9;
						Static16.aClass267_1.method6538(local503);
					}
				}
				@Pc(524) Class11_Sub4 local524 = arg1.aClass11_Sub4_2;
				if (local524 != null && (local524.anInt5482 & local348) != 0 && !Static130.method2515(local15, local6, local9, local524.anInt5482)) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local556 = local524.method8109(Static114.aClass9_5);
					if (local556 != null) {
						local556.aClass11_1 = local524;
						local556.anInt7020 = local12;
						local556.anInt7025 = local6;
						local556.anInt7024 = local9;
						Static16.aClass267_1.method6538(local556);
					}
				}
			}
			if (local354 != null && !Static57.method8161(local15, local6, local9, local354.method7208())) {
				@Pc(587) Class11_Sub3 local587 = arg1.aClass11_Sub3_1;
				if ((local354.anInt8623 & local348) != 0) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local556 = local354.method8109(Static114.aClass9_5);
					if (local556 != null) {
						local556.aClass11_1 = local354;
						local556.anInt7020 = local12;
						local556.anInt7025 = local6;
						local556.anInt7024 = local9;
						Static16.aClass267_1.method6538(local556);
					}
				} else if (local354.anInt8623 == 256) {
					local638 = local354.anInt8625 - Static279.anInt5385;
					local643 = local354.anInt8617 - Static325.anInt6147;
					local646 = local354.anInt8622;
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
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					@Pc(691) Class5_Sub5 local691;
					if (local667 < local655) {
						local691 = local354.method8109(Static114.aClass9_5);
						if (local691 != null) {
							local691.aClass11_1 = local354;
							local691.anInt7020 = local12;
							local691.anInt7025 = local6;
							local691.anInt7024 = local9;
							Static16.aClass267_1.method6538(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method8109(Static114.aClass9_5);
						if (local691 != null) {
							local691.aClass11_1 = local587;
							local691.anInt7020 = local12;
							local691.anInt7025 = local6;
							local691.anInt7024 = local9;
							Static16.aClass267_1.method6538(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class11_Sub5 local740 = arg1.aClass11_Sub5_2;
				if (local740 != null && !local740.aBoolean717) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local556 = local740.method8109(Static114.aClass9_5);
					if (local556 != null) {
						local556.aClass11_1 = local740;
						local556.anInt7020 = local12;
						local556.anInt7025 = local6;
						local556.anInt7024 = local9;
						Static16.aClass267_1.method6538(local556);
					}
				}
				@Pc(784) Class11_Sub2 local784 = arg1.aClass11_Sub2_1;
				if (local784 != null && !local784.aBoolean85) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					@Pc(807) Class5_Sub5 local807 = local784.method8109(Static114.aClass9_5);
					if (local807 != null) {
						local807.aClass11_1 = local784;
						local807.anInt7020 = local12;
						local807.anInt7025 = local6;
						local807.anInt7024 = local9;
						Static16.aClass267_1.method6538(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte66;
			if (local828 != 0) {
				@Pc(845) Class224 local845;
				if (local6 < Static579.anInt7897 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean471) {
						Static83.aClass58_2.method5092(local845);
					}
				}
				if (local9 < Static266.anInt4817 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean471) {
						Static83.aClass58_2.method5092(local845);
					}
				}
				if (local6 > Static579.anInt7897 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean471) {
						Static83.aClass58_2.method5092(local845);
					}
				}
				if (local9 > Static266.anInt4817 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean471) {
						Static83.aClass58_2.method5092(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class11_Sub4 local961;
		@Pc(982) int local982;
		@Pc(934) Class270 local934;
		if (arg1.aByte71 != 0) {
			local292 = true;
			for (local934 = arg1.aClass270_1; local934 != null; local934 = local934.aClass270_2) {
				if (local934.aClass11_Sub1_2.anInt7348 != Static467.anInt8612 && (local934.anInt7849 & arg1.aByte71) == arg1.aByte72) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass11_Sub4_3;
				if (!Static130.method2515(local15, local6, local9, local961.anInt5482)) {
					if (Static311.aBoolean405) {
						label663: {
							if (local961.anInt5482 >= 16) {
								local978 = local6 - Static579.anInt7897;
								local982 = local9 - Static266.anInt4817;
								if (local961.anInt5482 == 16) {
									local978 -= Static406.anInt9843;
									local982 += Static406.anInt9843;
									if (local982 < local978 && local6 > 0 && local9 <= Static54.anInt1441) {
										Static371.method5918(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt5482 == 32) {
									local978 += Static406.anInt9843;
									local982 += Static406.anInt9843;
									if (local982 < -local978 && local6 < Static396.anInt7505 && local9 < Static54.anInt1441) {
										Static371.method5918(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt5482 == 64) {
									local978 += Static406.anInt9843;
									local982 -= Static406.anInt9843;
									if (local982 > local978 && local6 < Static396.anInt7505 && local9 > 0) {
										Static371.method5918(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt5482 == 128) {
									local978 -= Static406.anInt9843;
									local982 -= Static406.anInt9843;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static371.method5918(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static371.method5918(arg0, local12, local6, local9);
						}
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					@Pc(1120) Class5_Sub5 local1120 = local961.method8109(Static114.aClass9_5);
					if (local1120 != null) {
						local1120.aClass11_1 = local961;
						local1120.anInt7020 = local12;
						local1120.anInt7025 = local6;
						local1120.anInt7024 = local9;
						Static16.aClass267_1.method6538(local1120);
					}
				}
				arg1.aByte71 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean470) {
			try {
				arg1.aBoolean470 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass270_1; local934 != null; local934 = local934.aClass270_2) {
					@Pc(1156) Class11_Sub1 local1156 = local934.aClass11_Sub1_2;
					if (local1156.anInt7348 != Static467.anInt8612) {
						for (local978 = local1156.aShort78; local978 <= local1156.aShort79; local978++) {
							for (local982 = local1156.aShort80; local982 <= local1156.aShort77; local982++) {
								@Pc(1174) Class224 local1174 = local31[local978][local982];
								if (local1174.aBoolean469) {
									arg1.aBoolean470 = true;
									continue label606;
								}
								if (local1174.aByte71 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort78) {
										local638++;
									}
									if (local978 < local1156.aShort79) {
										local638 += 4;
									}
									if (local982 > local1156.aShort80) {
										local638 += 8;
									}
									if (local982 < local1156.aShort77) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte71) == arg1.aByte70) {
										arg1.aBoolean470 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static579.anInt7897 - local1156.aShort78;
						local1237 = local1156.aShort79 - Static579.anInt7897;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static266.anInt4817 - local1156.aShort80;
						local643 = local1156.aShort77 - Static266.anInt4817;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass11_Sub1Array3[local1149] = local1156;
						arg0.anIntArray726[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class11_Sub1 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass11_Sub1Array3[local982];
						if (local1288.anInt7348 != Static467.anInt8612) {
							local638 = arg0.anIntArray726[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt7347 - Static279.anInt5385;
								local646 = local1288.anInt7351 - Static325.anInt6147;
								local655 = arg0.aClass11_Sub1Array3[local978].anInt7347 - Static279.anInt5385;
								local667 = arg0.aClass11_Sub1Array3[local978].anInt7351 - Static325.anInt6147;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass11_Sub1Array3[local978];
					local1288.anInt7348 = Static467.anInt8612;
					if (!Static360.method5793(local15, local1288.aShort78, local1288.aShort79, local1288.aShort80, local1288.aShort77, local1288.method6199())) {
						if (Static311.aBoolean405) {
							if (local1288.aByte78 == 0) {
								Static91.method2009(arg0, local12, local1288.aShort78, local1288.aShort80, local1288.aShort79, local1288.aShort77);
							} else {
								Static371.method5918(arg0, local12, local6, local9);
								local638 = local6 - Static579.anInt7897;
								local643 = local9 - Static266.anInt4817;
								if (local1288.aByte78 == 2) {
									if (local643 > -local638) {
										Static471.method7253(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static471.method7253(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static471.method7253(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static471.method7253(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
						}
						local556 = local1288.method8109(Static114.aClass9_5);
						if (local556 != null) {
							local556.aClass11_1 = local1288;
							local556.anInt7020 = local12;
							local556.anInt7025 = local1288.aShort78;
							local556.anInt7024 = local1288.aShort80;
							Static16.aClass267_1.method6538(local556);
						}
					}
					for (local638 = local1288.aShort78; local638 <= local1288.aShort79; local638++) {
						for (local643 = local1288.aShort80; local643 <= local1288.aShort77; local643++) {
							@Pc(1513) Class224 local1513 = local31[local638][local643];
							if (local1513.aByte71 != 0) {
								Static83.aClass58_2.method5092(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean471) {
								Static83.aClass58_2.method5092(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean470) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean470 = false;
			}
		}
		if (arg1.aClass299_2 != null && arg1.aByte67 == (byte) (Static300.anInt5686 & 0xFF)) {
			@Pc(1568) Class299 local1568 = arg1.aClass299_2;
			local346 = Static47.aClass62Array1[local12].JA(local6, local9);
			if (local12 < Static192.anInt4157 - 1) {
				local348 = Static47.aClass62Array1[local12].JA(local6, local9) - Static47.aClass62Array1[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static494.anInt8859;
			}
			Static258.aClass8_6.method8176(local21, local346, local27, arg0.anIntArray727);
			local978 = arg0.anIntArray727[2];
			Static258.aClass8_6.method8176(local21, local346 - local348, local27, arg0.anIntArray727);
			local982 = arg0.anIntArray727[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static109.anInt2480;
			local638 += Static109.anInt2480;
			local1568.anInt8806 = local1237;
			local1568.anInt8805 = local638;
			local1568.aBoolean663 = true;
			Static114.aClass9_5.method5433(local1568);
		}
		if (!arg1.aBoolean471) {
			return;
		}
		if (arg1.aByte71 != 0) {
			return;
		}
		if (local6 <= Static579.anInt7897 && local6 > Static118.anInt2585) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean471) {
				return;
			}
		}
		if (local6 >= Static579.anInt7897 && local6 < Static275.anInt5345 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean471) {
				return;
			}
		}
		if (local9 <= Static266.anInt4817 && local9 > Static17.anInt874) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean471) {
				return;
			}
		}
		if (local9 >= Static266.anInt4817 && local9 < Static67.anInt1577 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean471) {
				return;
			}
		}
		arg1.aBoolean471 = false;
		Static480.anInt9428--;
		@Pc(1759) Class11_Sub2 local1759 = arg1.aClass11_Sub2_1;
		if (local1759 != null && local1759.aBoolean85) {
			if (Static311.aBoolean405) {
				Static371.method5918(arg0, local12, local6, local9);
				Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
			}
			@Pc(1782) Class5_Sub5 local1782 = local1759.method8109(Static114.aClass9_5);
			if (local1782 != null) {
				local1782.aClass11_1 = local1759;
				local1782.anInt7020 = local12;
				local1782.anInt7025 = local6;
				local1782.anInt7024 = local9;
				Static16.aClass267_1.method6538(local1782);
			}
		}
		if (arg1.aShort67 != 0) {
			@Pc(1806) Class11_Sub3 local1806 = arg1.aClass11_Sub3_2;
			if (local1806 != null && !Static57.method8161(local15, local6, local9, local1806.method7208())) {
				if ((local1806.anInt8623 & arg1.aShort67) != 0) {
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					local326 = local1806.method8109(Static114.aClass9_5);
					if (local326 != null) {
						local326.aClass11_1 = local1806;
						local326.anInt7020 = local12;
						local326.anInt7025 = local6;
						local326.anInt7024 = local9;
						Static16.aClass267_1.method6538(local326);
					}
				} else if (local1806.anInt8623 == 256) {
					local348 = local1806.anInt8625 - Static279.anInt5385;
					local978 = local1806.anInt8617 - Static325.anInt6147;
					local982 = local1806.anInt8622;
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
					if (Static311.aBoolean405) {
						Static371.method5918(arg0, local12, local6, local9);
						Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
					}
					@Pc(1916) Class11_Sub3 local1916 = arg1.aClass11_Sub3_1;
					@Pc(1924) Class5_Sub5 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method8109(Static114.aClass9_5);
						if (local1924 != null) {
							local1924.aClass11_1 = local1806;
							local1924.anInt7020 = local12;
							local1924.anInt7025 = local6;
							local1924.anInt7024 = local9;
							Static16.aClass267_1.method6538(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method8109(Static114.aClass9_5);
						if (local1924 != null) {
							local1924.aClass11_1 = local1916;
							local1924.anInt7020 = local12;
							local1924.anInt7025 = local6;
							local1924.anInt7024 = local9;
							Static16.aClass267_1.method6538(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass11_Sub4_3;
			local351 = arg1.aClass11_Sub4_2;
			@Pc(2009) Class5_Sub5 local2009;
			if (local351 != null && (local351.anInt5482 & arg1.aShort67) != 0 && !Static130.method2515(local15, local6, local9, local351.anInt5482)) {
				if (Static311.aBoolean405) {
					Static59.method1321(arg0, local351.anInt5482, local12, local6, local9);
					Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
				}
				local2009 = local351.method8109(Static114.aClass9_5);
				if (local2009 != null) {
					local2009.aClass11_1 = local351;
					local2009.anInt7020 = local12;
					local2009.anInt7025 = local6;
					local2009.anInt7024 = local9;
					Static16.aClass267_1.method6538(local2009);
				}
			}
			if (local961 != null && (local961.anInt5482 & arg1.aShort67) != 0 && !Static130.method2515(local15, local6, local9, local961.anInt5482)) {
				if (Static311.aBoolean405) {
					Static59.method1321(arg0, local961.anInt5482, local12, local6, local9);
					Static114.aClass9_5.method5401(arg0.anInt8651, arg0.aClass6_Sub29Array6);
				}
				local2009 = local961.method8109(Static114.aClass9_5);
				if (local2009 != null) {
					local2009.aClass11_1 = local961;
					local2009.anInt7020 = local12;
					local2009.anInt7025 = local6;
					local2009.anInt7024 = local9;
					Static16.aClass267_1.method6538(local2009);
				}
			}
		}
		@Pc(2095) Class224 local2095;
		if (local12 < Static192.anInt4157 - 1) {
			local2095 = Static256.aClass224ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean471) {
				Static83.aClass58_2.method5089(local2095);
			}
		}
		if (local6 < Static579.anInt7897) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean471) {
				Static83.aClass58_2.method5092(local2095);
			}
		}
		if (local9 < Static266.anInt4817) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean471) {
				Static83.aClass58_2.method5092(local2095);
			}
		}
		if (local6 > Static579.anInt7897) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean471) {
				Static83.aClass58_2.method5092(local2095);
			}
		}
		if (local9 > Static266.anInt4817) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean471) {
				Static83.aClass58_2.method5092(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!bca;BI)Lclient!nk;")
	public static Class6_Sub4_Sub10 method505(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 8 | arg1.anInt1011;
		@Pc(19) Class6_Sub4_Sub10 local19 = (Class6_Sub4_Sub10) Static146.aClass199_6.method4863((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(41) byte[] local41 = Static318.aClass168_76.method4438(Static318.aClass168_76.method4452(local10));
		if (local41 == null) {
			local10 = arg0 + 65536 << 8 | arg1.anInt1011;
			local19 = (Class6_Sub4_Sub10) Static146.aClass199_6.method4863((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local41 = Static318.aClass168_76.method4438(Static318.aClass168_76.method4452(local10));
			if (local41 == null) {
				local10 = arg1.anInt1011 | 0xFFFF00;
				local19 = (Class6_Sub4_Sub10) Static146.aClass199_6.method4863((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local41 = Static318.aClass168_76.method4438(Static318.aClass168_76.method4452(local10));
				if (local41 == null) {
					return null;
				} else if (local41.length <= 1) {
					return null;
				} else {
					local19 = Static512.method7257(local41);
					local19.aClass26_6 = arg1;
					Static146.aClass199_6.method4858(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local41.length <= 1) {
				return null;
			} else {
				local19 = Static512.method7257(local41);
				local19.aClass26_6 = arg1;
				Static146.aClass199_6.method4858(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local41.length <= 1) {
			return null;
		} else {
			local19 = Static512.method7257(local41);
			local19.aClass26_6 = arg1;
			Static146.aClass199_6.method4858(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;ZII)V")
	public static void method506(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		Static17.aClass168_13.anInt5130 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(26) Class99 local26 = Static499.aClass118_2.method3497(arg5);
			if (local26 == null || arg0 != local26.method2523()) {
				return;
			}
			if (local26.method2523()) {
				local18 = local26.aString35;
			} else {
				local16 = local26.anInt2851;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static98.aClass203_1.anInt5738; local58++) {
			@Pc(65) Class145 local65 = Static98.aClass203_1.method4899(local58);
			if ((!arg4 || local65.aBoolean359) && local65.anInt4451 == -1 && local65.anInt4471 == -1 && local65.anInt4468 == 0 && local65.aString52.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg0) {
						if (!arg3.equals(local65.method3843(local18, arg5))) {
							continue;
						}
					} else if (arg1 != local65.method3852(local16, arg5)) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static127.aShortArray31 = null;
					Static503.anInt8951 = -1;
					return;
				}
				if (local14.length <= local56) {
					@Pc(139) short[] local139 = new short[local14.length * 2];
					for (@Pc(141) int local141 = 0; local141 < local56; local141++) {
						local139[local141] = local14[local141];
					}
					local14 = local139;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static503.anInt8951 = local56;
		Static267.anInt5287 = 0;
		Static127.aShortArray31 = local14;
		@Pc(188) String[] local188 = new String[Static503.anInt8951];
		for (@Pc(190) int local190 = 0; local190 < Static503.anInt8951; local190++) {
			local188[local190] = Static98.aClass203_1.method4899(local14[local190]).aString52;
		}
		Static141.method2651(Static127.aShortArray31, local188);
		Static17.aClass168_13.method4448();
		Static17.aClass168_13.anInt5130 = 2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ep;I)Ljava/lang/String;")
	public static String method507(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1) {
		if (!Static69.method1454(arg1).method7360(arg0) && arg1.anObjectArray5 == null) {
			return null;
		} else if (arg1.aStringArray17 == null || arg1.aStringArray17.length <= arg0 || arg1.aStringArray17[arg0] == null || arg1.aStringArray17[arg0].trim().length() == 0) {
			return Static13.aBoolean37 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray17[arg0];
		}
	}
}
