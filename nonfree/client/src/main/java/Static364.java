import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "[I")
	public static int[] anIntArray383 = new int[1];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IZ)V")
	public static void method5227() {
		Static643.aClass85_65.method1742(50);
		Static533.aClass85_54.method1742(50);
		Static225.aClass85_23.method1742(50);
		Static524.aClass85_52.method1742(50);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIBIII)V")
	public static void method5228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(15) int local15 = Static268.anInt4162;
		Static658.anInt8473 = 0;
		@Pc(19) int[] local19 = Static597.anIntArray677;
		@Pc(27) int local27;
		if (Static166.anInt2884 == 3) {
			local27 = Static199.aClass61Array1.length;
		} else {
			local27 = local15 + Static217.anInt3445;
		}
		@Pc(248) int local248;
		@Pc(301) int local301;
		@Pc(388) int local388;
		@Pc(391) int local391;
		@Pc(1273) int local1273;
		@Pc(1320) int local1320;
		@Pc(1322) int local1322;
		@Pc(1324) int local1324;
		@Pc(1326) int local1326;
		@Pc(226) int local226;
		@Pc(495) int local495;
		@Pc(1166) int local1166;
		@Pc(614) int local614;
		for (@Pc(34) int local34 = 0; local34 < local27; local34++) {
			@Pc(38) Class261 local38 = null;
			@Pc(52) Class4_Sub2_Sub1_Sub2 local52;
			if (Static166.anInt2884 == 3) {
				@Pc(45) Class61 local45 = Static199.aClass61Array1[local34];
				if (!local45.aBoolean151) {
					continue;
				}
				local52 = local45.method1238();
				if (Static68.anInt1174 != local52.anInt2329) {
					continue;
				}
				if (local45.anInt1410 >= 0) {
					local38 = ((Class4_Sub2_Sub1_Sub2_Sub2) local52).aClass261_1;
					if (local38.anIntArray499 != null) {
						local38 = local38.method6272(Static396.aClass107_1);
						if (local38 == null) {
							continue;
						}
					}
				}
			} else {
				if (local15 <= local34) {
					local52 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local34 - local15], 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
					local38 = ((Class4_Sub2_Sub1_Sub2_Sub2) local52).aClass261_1;
					if (local38.anIntArray499 != null) {
						local38 = local38.method6272(Static396.aClass107_1);
						if (local38 == null) {
							continue;
						}
					}
				} else {
					local52 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local19[local34]];
				}
				if (local52.anInt2315 < 0 || Static68.anInt1174 != local52.anInt2329 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 != local52.aByte133) {
					continue;
				}
			}
			Static311.method4347(local52, arg3 >> 1, arg2 >> 1, local52.method2051());
			if (Static189.anIntArray243[0] >= 0) {
				if (local52.method2048()) {
					@Pc(180) Class217 local180 = local52.method2052();
					if (local180 != null && Static497.anInt7960 > Static658.anInt8473) {
						Static497.anIntArray568[Static658.anInt8473] = Static277.aClass289_8.method6935(local180.method4850()) / 2;
						Static497.anIntArray569[Static658.anInt8473] = Static189.anIntArray243[0];
						Static497.anIntArray567[Static658.anInt8473] = Static189.anIntArray243[1];
						Static497.aClass217Array1[Static658.anInt8473] = local180;
						Static658.anInt8473++;
					}
				}
				local226 = Static189.anIntArray243[1] + arg0;
				@Pc(286) Class43[] local286;
				@Pc(293) Class355[] local293;
				@Pc(361) Class43 local361;
				if (local52.aBoolean247 || Static528.anInt8386 >= local52.anInt2333) {
					local226 -= Math.max(Static277.aClass289_8.anInt7758, Static217.aClass43Array8[0].method9592());
				} else {
					@Pc(243) byte local243 = 1;
					if (local38 == null) {
						@Pc(264) Class4_Sub2_Sub1_Sub2_Sub1 local264 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local19[local34]];
						local248 = local52.method2064(-112).anInt1084;
						if (local264.aBoolean102) {
							local243 = 2;
						}
					} else {
						local248 = local38.anInt7025;
						if (local248 == -1) {
							local248 = local52.method2064(-41).anInt1084;
						}
					}
					@Pc(276) Class43[] local276 = Static217.aClass43Array8;
					if (local248 != -1) {
						local286 = (Class43[]) Static126.aClass85_16.method1737((long) local248);
						if (local286 == null) {
							local293 = Static737.method8363(Static117.aClass254_47, local248);
							if (local293 != null) {
								local286 = new Class43[local293.length];
								for (local301 = 0; local301 < local293.length; local301++) {
									local286[local301] = Static396.aClass145_6.method9683(local293[local301], true);
								}
								Static126.aClass85_16.method1745((long) local248, 16383, local286);
							}
						}
						if (local286 != null && local286.length >= 2) {
							local276 = local286;
						}
					}
					if (local276.length <= local243) {
						local243 = 1;
					}
					@Pc(357) Class43 local357 = local276[0];
					local361 = local276[local243];
					local226 -= Math.max(Static277.aClass289_8.anInt7758, local357.method9592());
					local301 = Static189.anIntArray243[0] + arg1 - (local357.method9601() >> 1);
					local388 = local357.method9601() * local52.anInt2352 / 255;
					local391 = local357.method9592();
					if (local52.anInt2352 > 0 && local388 < 2) {
						local388 = 2;
					}
					local357.method9588(local301, local226);
					Static396.aClass145_6.T(local301, local226, local301 + local388, local391 + local226);
					local361.method9588(local301, local226);
					Static396.aClass145_6.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
					Static5.method72(local391 + local226, local226, local301 + local357.method9587(), local301);
				}
				local226 -= 2;
				if (!local52.aBoolean247) {
					@Pc(477) Class43 local477;
					@Pc(487) Class43 local487;
					if (local52.anInt2325 > Static528.anInt8386) {
						local477 = Static628.aClass43Array18[local52.aBoolean246 ? 2 : 0];
						local487 = Static628.aClass43Array18[local52.aBoolean246 ? 3 : 1];
						if (local52 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
							local495 = local38.anInt7039;
							if (local495 == -1) {
								local495 = local52.method2064(-128).anInt1068;
							}
						} else {
							local495 = local52.method2064(-53).anInt1068;
						}
						if (local495 != -1) {
							local286 = (Class43[]) Static444.aClass85_47.method1737((long) local495);
							if (local286 == null) {
								local293 = Static737.method8363(Static117.aClass254_47, local495);
								if (local293 != null) {
									local286 = new Class43[local293.length];
									for (local301 = 0; local301 < local293.length; local301++) {
										local286[local301] = Static396.aClass145_6.method9683(local293[local301], true);
									}
									Static444.aClass85_47.method1745((long) local495, 16383, local286);
								}
							}
							if (local286 != null && local286.length == 4) {
								local477 = local286[local52.aBoolean246 ? 2 : 0];
								local487 = local286[local52.aBoolean246 ? 3 : 1];
							}
						}
						@Pc(603) int local603 = local52.anInt2325 - Static528.anInt8386;
						if (local52.anInt2310 >= local603) {
							local614 = local477.method9601();
						} else {
							local603 -= local52.anInt2310;
							local301 = local52.anInt2342 == 0 ? 0 : local52.anInt2342 * ((local52.anInt2349 - local603) / local52.anInt2342);
							local614 = local301 * local477.method9601() / local52.anInt2349;
						}
						local301 = local477.method9592();
						local226 -= local301;
						local388 = Static189.anIntArray243[0] + arg1 - (local477.method9601() >> 1);
						local477.method9588(local388, local226);
						Static396.aClass145_6.T(local388, local226, local614 + local388, local226 - -local301);
						local487.method9588(local388, local226);
						Static396.aClass145_6.KA(arg1, arg0, arg1 + arg3, arg0 - -arg2);
						Static5.method72(local226 + local301, local226, local388 + local477.method9587(), local388);
						local226 -= 2;
					}
					if (local38 == null) {
						@Pc(717) Class4_Sub2_Sub1_Sub2_Sub1 local717 = (Class4_Sub2_Sub1_Sub2_Sub1) local52;
						if (local717.anInt816 != -1) {
							local487 = Static356.aClass43Array15[local717.anInt816];
							local226 -= local487.method9592();
							local487.method9588(Static189.anIntArray243[0] + arg1 - 12, local226);
							Static5.method72(local487.method9600() + local226, local226, arg1 + Static189.anIntArray243[0] + local487.method9587() - 12, Static189.anIntArray243[0] + -12 + arg1);
							local226 -= 2;
						}
						if (local717.anInt849 != -1) {
							local487 = Static3.aClass43Array1[local717.anInt849];
							local226 -= local487.method9592();
							local487.method9588(arg1 + Static189.anIntArray243[0] - 12, local226);
							Static5.method72(local226 + local487.method9600(), local226, Static189.anIntArray243[0] + arg1 + local487.method9587() - 12, Static189.anIntArray243[0] + arg1 - 12);
							local226 -= 2;
						}
					} else if (local38.anInt7024 >= 0 && local38.anInt7024 < Static3.aClass43Array1.length) {
						local477 = Static3.aClass43Array1[local38.anInt7024];
						local226 -= local477.method9592();
						local477.method9588(arg1 + Static189.anIntArray243[0] - (local477.method9601() >> 1), local226);
						Static5.method72(local226 + local477.method9600(), local226, arg1 + Static189.anIntArray243[0] - (local477.method9601() >> 1) + local477.method9587(), arg1 - -Static189.anIntArray243[0] + -(local477.method9601() >> 1));
						local226 -= 2;
					}
				}
				@Pc(898) Class350[] local898;
				@Pc(906) Class350 local906;
				if (!(local52 instanceof Class4_Sub2_Sub1_Sub2_Sub1)) {
					local248 = 0;
					local898 = Static690.aClass350Array1;
					for (local495 = 0; local495 < local898.length; local495++) {
						local906 = local898[local495];
						if (local906 != null && local906.anInt9441 == 1 && local906.anInt9439 == Static266.anIntArray305[local34 - local15]) {
							local361 = Static22.aClass43Array3[local906.anInt9437];
							if (local361.method9592() > local248) {
								local248 = local361.method9592();
							}
							@Pc(947) boolean local947;
							if (local906.anInt9438 == 0) {
								local947 = true;
							} else {
								local388 = Static280.method6055() * 1000 / local906.anInt9438 / 2;
								local947 = Static528.anInt8386 % (local388 * 2) < local388;
							}
							if (local947) {
								local361.method9588(arg1 + Static189.anIntArray243[0] - 12, -local361.method9592() + local226);
								Static5.method72(local226 - local361.method9592() + local361.method9600(), -local361.method9592() + local226, Static189.anIntArray243[0] + arg1 + local361.method9587() - 12, arg1 - -Static189.anIntArray243[0] - 12);
							}
						}
					}
					if (local248 > 0) {
					}
				} else if (local34 >= 0) {
					local248 = 0;
					local898 = Static690.aClass350Array1;
					for (local495 = 0; local495 < local898.length; local495++) {
						local906 = local898[local495];
						if (local906 != null && local906.anInt9441 == 10 && local19[local34] == local906.anInt9439) {
							local361 = Static22.aClass43Array3[local906.anInt9437];
							if (local248 < local361.method9592()) {
								local248 = local361.method9592();
							}
							local361.method9588(arg1 + Static189.anIntArray243[0] - 12, local226 + -local361.method9592());
							Static5.method72(local226 - local361.method9592() + local361.method9600(), -local361.method9592() + local226, Static189.anIntArray243[0] + arg1 + local361.method9587() - 12, arg1 - (-Static189.anIntArray243[0] + 12));
						}
					}
					if (local248 > 0) {
					}
				}
				for (local248 = 0; local248 < Static519.aClass132_1.anInt3158; local248++) {
					local1166 = local52.anIntArray173[local248];
					local495 = local52.anIntArray178[local248];
					@Pc(1173) Class312 local1173 = null;
					local614 = 0;
					if (local495 >= 0) {
						if (local1166 <= Static528.anInt8386) {
							continue;
						}
						local1173 = Static159.aClass346_1.method8207(local52.anIntArray178[local248]);
						local614 = local1173.anInt8296;
					} else if (local1166 < 0) {
						continue;
					}
					local301 = local52.anIntArray180[local248];
					@Pc(1215) Class312 local1215 = null;
					if (local301 >= 0) {
						local1215 = Static159.aClass346_1.method8207(local301);
					}
					if (Static528.anInt8386 >= local1166 - local614) {
						local391 = local52.anIntArray175[local248];
						if (local391 >= 0) {
							local52.anInt2352 = local391;
							local52.anInt2333 = Static528.anInt8386 + 300;
							local52.anIntArray175[local248] = -1;
						}
						if (local1173 == null) {
							local52.anIntArray173[local248] = -1;
						} else {
							local1273 = local52.method2051() / 2;
							Static311.method4347(local52, arg3 >> 1, arg2 >> 1, local1273);
							if (Static189.anIntArray243[0] > -1) {
								Static189.anIntArray243[0] += Static519.aClass132_1.anIntArray253[local248];
								Static189.anIntArray243[1] += Static519.aClass132_1.anIntArray254[local248];
								local1320 = 0;
								local1322 = 0;
								local1324 = 0;
								local1326 = 0;
								@Pc(1328) int local1328 = 0;
								@Pc(1330) int local1330 = 0;
								@Pc(1332) int local1332 = 0;
								@Pc(1334) int local1334 = 0;
								@Pc(1336) Class43 local1336 = null;
								@Pc(1338) Class43 local1338 = null;
								@Pc(1340) Class43 local1340 = null;
								@Pc(1342) Class43 local1342 = null;
								@Pc(1344) int local1344 = 0;
								@Pc(1346) int local1346 = 0;
								@Pc(1348) int local1348 = 0;
								@Pc(1350) int local1350 = 0;
								@Pc(1352) int local1352 = 0;
								@Pc(1354) int local1354 = 0;
								@Pc(1356) int local1356 = 0;
								@Pc(1358) int local1358 = 0;
								@Pc(1363) Class43 local1363 = local1173.method7379(Static396.aClass145_6);
								@Pc(1365) int local1365 = 0;
								@Pc(1373) int local1373;
								if (local1363 != null) {
									local1320 = local1363.method9601();
									local1373 = local1363.method9592();
									if (local1373 > 0) {
										local1365 = local1373;
									}
									local1363.method9599(Static22.anIntArray34);
									local1328 = Static22.anIntArray34[0];
								}
								@Pc(1394) Class43 local1394 = local1173.method7377(Static396.aClass145_6);
								if (local1394 != null) {
									local1322 = local1394.method9601();
									local1373 = local1394.method9592();
									if (local1373 > local1365) {
										local1365 = local1373;
									}
									local1394.method9599(Static22.anIntArray34);
									local1330 = Static22.anIntArray34[0];
								}
								@Pc(1423) Class43 local1423 = local1173.method7380(Static396.aClass145_6);
								if (local1423 != null) {
									local1324 = local1423.method9601();
									local1373 = local1423.method9592();
									local1423.method9599(Static22.anIntArray34);
									if (local1365 < local1373) {
										local1365 = local1373;
									}
									local1332 = Static22.anIntArray34[0];
								}
								@Pc(1452) Class43 local1452 = local1173.method7378(Static396.aClass145_6);
								if (local1452 != null) {
									local1326 = local1452.method9601();
									local1373 = local1452.method9592();
									local1452.method9599(Static22.anIntArray34);
									if (local1365 < local1373) {
										local1365 = local1373;
									}
									local1334 = Static22.anIntArray34[0];
								}
								if (local1215 != null) {
									local1336 = local1215.method7379(Static396.aClass145_6);
									if (local1336 != null) {
										local1344 = local1336.method9601();
										local1373 = local1336.method9592();
										if (local1365 < local1373) {
											local1365 = local1373;
										}
										local1336.method9599(Static22.anIntArray34);
										local1352 = Static22.anIntArray34[0];
									}
									local1338 = local1215.method7377(Static396.aClass145_6);
									if (local1338 != null) {
										local1346 = local1338.method9601();
										local1373 = local1338.method9592();
										local1338.method9599(Static22.anIntArray34);
										if (local1365 < local1373) {
											local1365 = local1373;
										}
										local1354 = Static22.anIntArray34[0];
									}
									local1340 = local1215.method7380(Static396.aClass145_6);
									if (local1340 != null) {
										local1348 = local1340.method9601();
										local1373 = local1340.method9592();
										if (local1365 < local1373) {
											local1365 = local1373;
										}
										local1340.method9599(Static22.anIntArray34);
										local1356 = Static22.anIntArray34[0];
									}
									local1342 = local1215.method7378(Static396.aClass145_6);
									if (local1342 != null) {
										local1350 = local1342.method9601();
										local1373 = local1342.method9592();
										if (local1365 < local1373) {
											local1365 = local1373;
										}
										local1342.method9599(Static22.anIntArray34);
										local1358 = Static22.anIntArray34[0];
									}
								}
								@Pc(1580) Class68 local1580 = Static435.aClass68_11;
								@Pc(1582) Class68 local1582 = Static435.aClass68_11;
								@Pc(1584) Class289 local1584 = Static607.aClass289_17;
								local1373 = local1173.anInt8295;
								@Pc(1589) Class289 local1589 = Static607.aClass289_17;
								@Pc(1598) Class68 local1598;
								@Pc(1603) Class289 local1603;
								if (local1373 >= 0) {
									local1598 = Static311.method4349(true, local1373, true, Static396.aClass145_6);
									local1603 = Static473.method6776(Static396.aClass145_6, local1373);
									if (local1598 != null && local1603 != null) {
										local1584 = local1603;
										local1580 = local1598;
									}
								}
								if (local1215 != null) {
									local1373 = local1215.anInt8295;
									if (local1373 >= 0) {
										local1598 = Static311.method4349(true, local1373, true, Static396.aClass145_6);
										local1603 = Static473.method6776(Static396.aClass145_6, local1373);
										if (local1598 != null && local1603 != null) {
											local1589 = local1603;
											local1582 = local1598;
										}
									}
								}
								@Pc(1646) String local1646 = null;
								@Pc(1656) String local1656 = local1173.method7383(local52.anIntArray176[local248]);
								@Pc(1658) int local1658 = 0;
								@Pc(1663) int local1663 = local1584.method6935(local1656);
								if (local1215 != null) {
									local1646 = local1215.method7383(local52.anIntArray177[local248]);
									local1658 = local1589.method6935(local1646);
								}
								@Pc(1680) int local1680 = 0;
								@Pc(1682) int local1682 = 0;
								if (local1322 > 0) {
									local1680 = local1663 / local1322 + 1;
								}
								if (local1215 != null && local1346 > 0) {
									local1682 = local1658 / local1346 + 1;
								}
								@Pc(1704) int local1704 = 0;
								if (local1320 > 0) {
									local1704 = local1320;
								}
								local1704 += 2;
								@Pc(1718) int local1718 = local1704;
								if (local1324 > 0) {
									local1704 += local1324;
								}
								@Pc(1729) int local1729 = local1704;
								@Pc(1731) int local1731 = local1704;
								@Pc(1740) int local1740;
								if (local1322 > 0) {
									local1740 = local1680 * local1322;
									local1704 += local1740;
									local1731 += (local1740 - local1663) / 2;
								} else {
									local1704 += local1663;
								}
								local1740 = local1704;
								if (local1326 > 0) {
									local1704 += local1326;
								}
								@Pc(1771) int local1771 = 0;
								@Pc(1773) int local1773 = 0;
								@Pc(1775) int local1775 = 0;
								@Pc(1777) int local1777 = 0;
								@Pc(1779) int local1779 = 0;
								@Pc(1818) int local1818;
								if (local1215 != null) {
									local1704 += 2;
									local1771 = local1704;
									if (local1344 > 0) {
										local1704 += local1344;
									}
									local1704 += 2;
									local1773 = local1704;
									if (local1348 > 0) {
										local1704 += local1348;
									}
									local1779 = local1704;
									local1775 = local1704;
									if (local1346 <= 0) {
										local1704 += local1658;
									} else {
										local1818 = local1346 * local1682;
										local1704 += local1818;
										local1779 += (local1818 - local1658) / 2;
									}
									local1777 = local1704;
									if (local1350 > 0) {
										local1704 += local1350;
									}
								}
								local1818 = local52.anIntArray173[local248] - Static528.anInt8386;
								@Pc(1861) int local1861 = local1173.anInt8304 - local1173.anInt8304 * local1818 / local1173.anInt8296;
								@Pc(1873) int local1873 = local1173.anInt8303 * local1818 / local1173.anInt8296 - local1173.anInt8303;
								@Pc(1887) int local1887 = arg1 + Static189.anIntArray243[0] + local1861 - (local1704 >> 1);
								@Pc(1897) int local1897 = local1873 + Static189.anIntArray243[1] + arg0 - 12;
								@Pc(1899) int local1899 = local1897;
								@Pc(1903) int local1903 = local1365 + local1897;
								@Pc(1911) int local1911 = local1897 + local1173.anInt8292 + 15;
								@Pc(1917) int local1917 = local1911 - local1584.anInt7758;
								@Pc(1922) int local1922 = local1911 + local1584.anInt7763;
								if (local1917 < local1897) {
									local1899 = local1917;
								}
								if (local1903 < local1922) {
									local1903 = local1922;
								}
								@Pc(1938) int local1938 = 0;
								@Pc(1952) int local1952;
								@Pc(1967) int local1967;
								if (local1215 != null) {
									local1938 = local1215.anInt8292 + local1897 + 15;
									local1952 = local1938 - local1589.anInt7758;
									if (local1952 < local1899) {
										local1899 = local1952;
									}
									local1967 = local1938 + local1589.anInt7763;
									if (local1903 < local1967) {
										local1903 = local1967;
									}
								}
								local1952 = 255;
								if (local1173.anInt8294 >= 0) {
									local1952 = (local1818 << 8) / (local1173.anInt8296 - local1173.anInt8294);
								}
								if (local1952 >= 0 && local1952 < 255) {
									local1967 = local1952 << 24;
									@Pc(2010) int local2010 = local1967 | 0xFFFFFF;
									if (local1363 != null) {
										local1363.method9583(local1887 - local1328, local1897, 0, local2010, 1);
									}
									if (local1423 != null) {
										local1423.method9583(local1718 + local1887 - local1332, local1897, 0, local2010, 1);
									}
									@Pc(2046) int local2046;
									if (local1394 != null) {
										for (local2046 = 0; local2046 < local1680; local2046++) {
											local1394.method9583(local1887 + local1729 + local2046 * local1322 - local1330, local1897, 0, local2010, 1);
										}
									}
									if (local1452 != null) {
										local1452.method9583(local1740 + local1887 - local1334, local1897, 0, local2010, 1);
									}
									local1580.method7882(local1731 + local1887, local1967 | local1173.anInt8302, local1656, local1911, 0);
									if (local1215 != null) {
										if (local1336 != null) {
											local1336.method9583(local1887 + local1771 - local1352, local1897, 0, local2010, 1);
										}
										if (local1340 != null) {
											local1340.method9583(local1773 + local1887 - local1356, local1897, 0, local2010, 1);
										}
										if (local1338 != null) {
											for (local2046 = 0; local2046 < local1682; local2046++) {
												local1338.method9583(local1887 + local1775 + local1346 * local2046 - local1354, local1897, 0, local2010, 1);
											}
										}
										if (local1342 != null) {
											local1342.method9583(local1777 + local1887 - local1358, local1897, 0, local2010, 1);
										}
										local1582.method7882(local1779 + local1887, local1967 | local1215.anInt8302, local1646, local1938, 0);
									}
								} else {
									if (local1363 != null) {
										local1363.method9588(local1887 - local1328, local1897);
									}
									if (local1423 != null) {
										local1423.method9588(local1887 + local1718 - local1332, local1897);
									}
									if (local1394 != null) {
										for (local1967 = 0; local1967 < local1680; local1967++) {
											local1394.method9588(local1967 * local1322 + local1887 + local1729 - local1330, local1897);
										}
									}
									if (local1452 != null) {
										local1452.method9588(local1887 + local1740 - local1334, local1897);
									}
									local1580.method7882(local1887 + local1731, local1173.anInt8302 | 0xFF000000, local1656, local1911, 0);
									if (local1215 != null) {
										if (local1336 != null) {
											local1336.method9588(local1771 + local1887 - local1352, local1897);
										}
										if (local1340 != null) {
											local1340.method9588(local1887 + local1773 - local1356, local1897);
										}
										if (local1338 != null) {
											for (local1967 = 0; local1967 < local1682; local1967++) {
												local1338.method9588(local1346 * local1967 + local1775 + local1887 - local1354, local1897);
											}
										}
										if (local1342 != null) {
											local1342.method9588(local1777 + local1887 - local1358, local1897);
										}
										local1582.method7882(local1779 + local1887, local1215.anInt8302 | 0xFF000000, local1646, local1938, 0);
									}
								}
								Static5.method72(local1903 + 1, local1899, local1887 + local1704, local1887);
							}
						}
					}
				}
			}
		}
		@Pc(2413) int local2413;
		for (@Pc(2407) int local2407 = 0; local2407 < Static623.anInt9548; local2407++) {
			local2413 = Static101.anIntArray645[local2407];
			@Pc(2426) Class4_Sub2_Sub1_Sub2 local2426;
			if (local2413 >= 2048) {
				local2426 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) (local2413 - 2048), 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			} else {
				local2426 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local2413];
			}
			local248 = Static467.anIntArray540[local2407];
			@Pc(2451) Class4_Sub2_Sub1_Sub2 local2451;
			if (local248 >= 2048) {
				local2451 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) (local248 - 2048), 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			} else {
				local2451 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local248];
			}
			Static598.method8205(--local2426.anInt2331, arg1, arg0, arg3, local2426, local2451, arg2);
		}
		local2413 = Static277.aClass289_8.anInt7758 + Static277.aClass289_8.anInt7763 + 2;
		for (local226 = 0; local226 < Static658.anInt8473; local226++) {
			local248 = Static497.anIntArray569[local226];
			local1166 = Static497.anIntArray567[local226];
			local495 = Static497.anIntArray568[local226];
			@Pc(2507) boolean local2507 = true;
			while (local2507) {
				local2507 = false;
				for (local614 = 0; local614 < local226; local614++) {
					if (local1166 + 2 > -local2413 + Static497.anIntArray567[local614] && Static497.anIntArray567[local614] + 2 > local1166 - local2413 && Static497.anIntArray569[local614] + Static497.anIntArray568[local614] > local248 + -local495 && Static497.anIntArray569[local614] - Static497.anIntArray568[local614] < local495 + local248 && Static497.anIntArray567[local614] - local2413 < local1166) {
						local1166 = Static497.anIntArray567[local614] - local2413;
						local2507 = true;
					}
				}
			}
			Static497.anIntArray567[local226] = local1166;
			@Pc(2603) String local2603 = Static497.aClass217Array1[local226].method4850();
			local301 = Static277.aClass289_8.method6935(local2603);
			local388 = local248 + arg1;
			local391 = arg0 + local1166 - Static277.aClass289_8.anInt7758;
			local1273 = local301 + local388;
			@Pc(2630) int local2630 = arg0 + local1166 + Static277.aClass289_8.anInt7763;
			if (Static607.anInt9426 == 0) {
				@Pc(2662) int local2662 = 16776960;
				@Pc(2668) int local2668 = Static497.aClass217Array1[local226].method4849();
				if (local2668 < 6) {
					local2662 = Static331.anIntArray361[local2668];
				}
				if (local2668 == 6) {
					local2662 = Static68.anInt1174 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local2668 == 7) {
					local2662 = Static68.anInt1174 % 20 >= 10 ? 65535 : 255;
				}
				if (local2668 == 8) {
					local2662 = Static68.anInt1174 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2750) int local2750;
				if (local2668 == 9) {
					local2750 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					if (local2750 < 50) {
						local2662 = local2750 * 1280 + 16711680;
					} else if (local2750 < 100) {
						local2662 = 16776960 + 16384000 - local2750 * 327680;
					} else if (local2750 < 150) {
						local2662 = local2750 * 5 + 65280 - 500;
					}
				}
				if (local2668 == 10) {
					local2750 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					if (local2750 < 50) {
						local2662 = local2750 * 5 + 16711680;
					} else if (local2750 < 100) {
						local2662 = 16384000 + 16711935 - local2750 * 327680;
					} else if (local2750 < 150) {
						local2662 = local2750 * 327680 + 255 - (local2750 + -100) * 5 - 32768000;
					}
				}
				if (local2668 == 11) {
					local2750 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					if (local2750 < 50) {
						local2662 = 16777215 - local2750 * 327685;
					} else if (local2750 < 100) {
						local2662 = local2750 * 327685 + 65280 - 16384250;
					} else if (local2750 < 150) {
						local2662 = 16777215 - (local2750 - 100) * 327680;
					}
				}
				local2750 = local2662 | 0xFF000000;
				local1320 = Static497.aClass217Array1[local226].method4846();
				if (local1320 == 0) {
					local1273 -= local301 >> 1;
					Static387.aClass68_12.method7888(local2603, arg1 + local248, -16777216, arg0 + local1166, local2750);
					local388 -= local301 >> 1;
				}
				if (local1320 == 1) {
					local1273 -= local301 >> 1;
					local2630 += 5;
					Static387.aClass68_12.method7889(arg0 + local1166, arg1 + local248, local2750, local2603, Static68.anInt1174);
					local388 -= local301 >> 1;
					local391 -= 5;
				}
				if (local1320 == 2) {
					local2630 += 5;
					Static387.aClass68_12.method7883(local2750, Static68.anInt1174, local2603, arg1 + local248, arg0 - -local1166);
					local391 -= 5;
					local388 -= (local301 >> 1) + 5;
					local1273 -= (local301 >> 1) - 5;
				}
				if (local1320 == 3) {
					local1322 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					local388 -= local301 >> 1;
					local391 -= 7;
					Static387.aClass68_12.method7893(Static68.anInt1174, arg0 + local1166, local2603, arg1 + local248, local1322, local2750);
					local2630 += 7;
					local1273 -= local301 >> 1;
				}
				if (local1320 == 4) {
					local1322 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					local1324 = (Static277.aClass289_8.method6935(local2603) + 100) * local1322 / 150;
					Static396.aClass145_6.T(local248 + arg1 - 50, arg0, local248 + arg1 + 50, arg2 + arg0);
					Static387.aClass68_12.method7882(arg1 + local248 + 50 - local1324, local2750, local2603, local1166 + arg0, -16777216);
					local1273 += 50 - local1324;
					local388 += 50 - local1324;
					Static396.aClass145_6.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
				}
				if (local1320 == 5) {
					local1322 = 150 - Static497.aClass217Array1[local226].method4848() * 150 / Static497.aClass217Array1[local226].method4844();
					local1324 = 0;
					if (local1322 < 25) {
						local1324 = local1322 - 25;
					} else if (local1322 > 125) {
						local1324 = local1322 - 125;
					}
					local1326 = Static277.aClass289_8.anInt7763 + Static277.aClass289_8.anInt7758;
					Static396.aClass145_6.T(arg1, arg0 + local1166 - local1326 - 1, arg3 + arg1, local1166 + arg0 + 5);
					local391 += local1324;
					local1273 -= local301 >> 1;
					Static387.aClass68_12.method7888(local2603, local248 + arg1, -16777216, local1166 + arg0 + local1324, local2750);
					local2630 += local1324;
					local388 -= local301 >> 1;
					Static396.aClass145_6.KA(arg1, arg0, arg3 + arg1, arg2 + arg0);
				}
			} else {
				local1273 -= local301 >> 1;
				local388 -= local301 >> 1;
				Static387.aClass68_12.method7888(local2603, local248 + arg1, -16777216, arg0 + local1166, -256);
			}
			Static5.method72(local2630 + 1, local391, local1273 + 1, local388);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method5229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class145 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static491.anInt7888 == 0 || Static275.anInt4246 == 0) {
			return;
		}
		@Pc(43) Class86 local43;
		@Pc(62) int local62;
		@Pc(58) int local58;
		@Pc(54) int local54;
		@Pc(50) int local50;
		@Pc(68) int local68;
		@Pc(74) int local74;
		if (Static392.aBoolean549) {
			Static187.method2679(false);
			local43 = arg2.method9716();
			@Pc(46) int[] local46 = arg2.Y();
			local50 = local46[3];
			local54 = local46[2];
			local58 = local46[1];
			local62 = local46[0];
			local68 = Static284.method3976(false) + arg1;
			local74 = Static204.method2894(false) + arg0;
		} else {
			arg2.DA(Static653.anInt10221, Static565.anInt8886, Static491.anInt7888, Static275.anInt4246);
			local62 = Static653.anInt10221;
			local50 = Static275.anInt4246;
			local58 = Static565.anInt8886;
			local54 = Static491.anInt7888;
			arg2.KA(Static335.anInt5132, Static445.anInt7222, Static491.anInt7888, Static275.anInt4246);
			local43 = arg2.method9691();
			local43.method7021(Static571.anInt8992, Static617.anInt9500, Static675.anInt10485, Static605.anInt9403, Static134.anInt2240, Static50.anInt814);
			arg2.method9656(local43);
			local68 = arg1;
			local74 = arg0;
		}
		if (local54 == 0) {
			local54 = 1;
		}
		Static721.method9621(true);
		if (local50 == 0) {
			local50 = 1;
		}
		@Pc(147) int local147;
		@Pc(171) int local171;
		@Pc(159) int local159;
		@Pc(284) int local284;
		@Pc(293) int local293;
		@Pc(304) int local304;
		@Pc(315) int local315;
		@Pc(139) int local139;
		@Pc(364) int local364;
		if (Static126.aClass133Array1 != null && (!Static581.aBoolean787 || (Static523.anInt6605 & 0x40) != 0)) {
			local139 = -1;
			@Pc(141) int local141 = -1;
			@Pc(144) int local144 = arg2.i();
			local147 = arg2.XA();
			@Pc(160) int local160;
			@Pc(170) int local170;
			if (Static591.aBoolean812) {
				local160 = local159 = (local74 - local58) * Static96.anInt1733 / local50;
				local171 = local170 = (local68 - local62) * Static96.anInt1733 / local54;
			} else {
				local171 = (local68 - local62) * local144 / local54;
				local170 = local147 * (local68 - local62) / local54;
				local160 = local144 * (local74 - local58) / local50;
				local159 = local147 * (local74 - local58) / local50;
			}
			@Pc(223) int[] local223 = new int[] { local171, local160, local144 };
			@Pc(238) int[] local238 = new int[] { local170, local159, local147 };
			local43.method7030(local223);
			local43.method7030(local238);
			@Pc(272) float local272 = Static636.method8645((float) local223[0], (float) local223[1], (float) local238[0], (float) local238[1], (float) local238[2], (float) local223[2], 4);
			if (local272 > 0.0F) {
				local284 = local238[0] - local223[0];
				local293 = local238[2] - local223[2];
				local304 = (int) (local272 * (float) local284 + (float) local223[0]);
				local315 = (int) ((float) local223[2] + local272 * (float) local293);
				local139 = local304 + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() - 1 << 8) >> 9;
				local141 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() - 1 << 8) + local315 >> 9;
				@Pc(342) byte local342 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133;
				if (local342 < 3 && (Static392.aByteArrayArrayArray16[1][local304 >> 9][local315 >> 9] & 0x2) != 0) {
					local364 = local342 + 1;
				}
			}
			if (local139 != -1 && local141 != -1) {
				if (Static581.aBoolean787 && (Static523.anInt6605 & 0x40) != 0) {
					@Pc(394) Class273 local394 = Static147.method2144(Static203.anInt3318, Static166.anInt2883);
					if (local394 == null) {
						Static643.method8704();
					} else {
						Static27.method371(Static96.anInt1729, (long) (local141 | local139 << 0), true, -1, Static175.aString127, true, 49, false, " ->", 0L, local141, local139);
					}
				} else {
					if (Static354.aBoolean482) {
						Static27.method371(-1, (long) (local141 | local139 << 0), true, -1, Static289.aClass191_27.method4067(Static414.anInt9485), true, 3, false, "", 0L, local141, local139);
					}
					Static27.method371(Static240.anInt10698, (long) (local141 | local139 << 0), true, -1, Static612.aString104, true, 6, false, "", 0L, local141, local139);
				}
			}
		}
		if (Static392.aBoolean549) {
			Static116.method1686();
		}
		for (local139 = 0; local139 < (Static392.aBoolean549 ? 2 : 1); local139++) {
			@Pc(500) boolean local500 = local139 == 0;
			@Pc(507) Class52 local507 = local500 ? Static655.aClass52_3 : Static247.aClass52_1;
			local147 = arg1;
			local171 = arg0;
			if (Static392.aBoolean549) {
				Static187.method2679(local500);
				local147 = arg1 + Static284.method3976(local500);
				local171 = arg0 + Static204.method2894(local500);
			}
			@Pc(531) Class320 local531 = local507.aClass320_1;
			for (@Pc(536) Class4_Sub8 local536 = (Class4_Sub8) local531.method7605(); local536 != null; local536 = (Class4_Sub8) local531.method7608()) {
				if ((Static603.aBoolean801 || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 == local536.aClass4_Sub2_13.aByte133) && local536.method3682(local147, arg2, local171)) {
					@Pc(573) int local573;
					if (local536.aClass4_Sub2_13 instanceof Class4_Sub2_Sub1) {
						local159 = ((Class4_Sub2_Sub1) local536.aClass4_Sub2_13).aShort130;
						local573 = ((Class4_Sub2_Sub1) local536.aClass4_Sub2_13).aShort127;
					} else {
						local573 = local536.aClass4_Sub2_13.anInt10228 >> 9;
						local159 = local536.aClass4_Sub2_13.anInt10229 >> 9;
					}
					@Pc(720) int local720;
					@Pc(732) int local732;
					@Pc(860) int local860;
					@Pc(603) int local603;
					if (local536.aClass4_Sub2_13 instanceof Class4_Sub2_Sub1_Sub2_Sub1) {
						@Pc(599) Class4_Sub2_Sub1_Sub2_Sub1 local599 = (Class4_Sub2_Sub1_Sub2_Sub1) local536.aClass4_Sub2_13;
						local603 = local599.method2046();
						if ((local603 & 0x1) == 0 && (local599.anInt10229 & 0x1FF) == 0 && (local599.anInt10228 & 0x1FF) == 0 || (local603 & 0x1) == 1 && (local599.anInt10229 & 0x1FF) == 256 && (local599.anInt10228 & 0x1FF) == 256) {
							local284 = local599.anInt10229 - (local599.method2046() - 1 << 8);
							local293 = local599.anInt10228 - (local599.method2046() - 1 << 8);
							for (local304 = 0; local304 < Static217.anInt3445; local304++) {
								@Pc(691) Class2_Sub49 local691 = (Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local304], 0);
								if (local691 != null) {
									@Pc(696) Class4_Sub2_Sub1_Sub2_Sub2 local696 = local691.aClass4_Sub2_Sub1_Sub2_Sub2_3;
									if (Static528.anInt8386 != local696.anInt2311 && local696.aBoolean247) {
										local720 = local696.anInt10229 - (local696.aClass261_1.anInt7010 - 1 << 8);
										local732 = local696.anInt10228 - (local696.aClass261_1.anInt7010 - 1 << 8);
										if (local284 <= local720 && local696.aClass261_1.anInt7010 <= local599.method2046() - (local720 - local284 >> 9) && local732 >= local293 && local696.aClass261_1.anInt7010 <= local599.method2046() - (local732 - local293 >> 9)) {
											Static570.method7905(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 != local536.aClass4_Sub2_13.aByte133, local696);
											local696.anInt2311 = Static528.anInt8386;
										}
									}
								}
							}
							local315 = Static268.anInt4162;
							@Pc(812) int[] local812 = Static597.anIntArray677;
							for (local720 = 0; local720 < local315; local720++) {
								@Pc(822) Class4_Sub2_Sub1_Sub2_Sub1 local822 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local812[local720]];
								if (local822 != null && local822.anInt2311 != Static528.anInt8386 && local822 != local599 && local822.aBoolean247) {
									local860 = local822.anInt10229 - (local822.method2046() - 1 << 8);
									@Pc(871) int local871 = local822.anInt10228 - (local822.method2046() - 1 << 8);
									if (local860 >= local284 && local822.method2046() <= local599.method2046() - (local860 - local284 >> 9) && local293 <= local871 && local822.method2046() <= local599.method2046() - (local871 - local293 >> 9)) {
										Static130.method1892(local822, local536.aClass4_Sub2_13.aByte133 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133);
										local822.anInt2311 = Static528.anInt8386;
									}
								}
							}
						}
						if (Static528.anInt8386 == local599.anInt2311) {
							continue;
						}
						Static130.method1892(local599, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 != local536.aClass4_Sub2_13.aByte133);
						local599.anInt2311 = Static528.anInt8386;
					}
					if (local536.aClass4_Sub2_13 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
						@Pc(987) Class4_Sub2_Sub1_Sub2_Sub2 local987 = (Class4_Sub2_Sub1_Sub2_Sub2) local536.aClass4_Sub2_13;
						if (local987.aClass261_1 != null) {
							if ((local987.aClass261_1.anInt7010 & 0x1) == 0 && (local987.anInt10229 & 0x1FF) == 0 && (local987.anInt10228 & 0x1FF) == 0 || (local987.aClass261_1.anInt7010 & 0x1) == 1 && (local987.anInt10229 & 0x1FF) == 256 && (local987.anInt10228 & 0x1FF) == 256) {
								local603 = local987.anInt10229 - (local987.aClass261_1.anInt7010 - 1 << 8);
								local284 = local987.anInt10228 - (local987.aClass261_1.anInt7010 - 1 << 8);
								for (local293 = 0; local293 < Static217.anInt3445; local293++) {
									@Pc(1083) Class2_Sub49 local1083 = (Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local293], 0);
									if (local1083 != null) {
										@Pc(1088) Class4_Sub2_Sub1_Sub2_Sub2 local1088 = local1083.aClass4_Sub2_Sub1_Sub2_Sub2_3;
										if (Static528.anInt8386 != local1088.anInt2311 && local1088 != local987 && local1088.aBoolean247) {
											local364 = local1088.anInt10229 - (local1088.aClass261_1.anInt7010 - 1 << 8);
											local720 = local1088.anInt10228 - (local1088.aClass261_1.anInt7010 - 1 << 8);
											if (local364 >= local603 && local1088.aClass261_1.anInt7010 <= local987.aClass261_1.anInt7010 - (local364 - local603 >> 9) && local720 >= local284 && local1088.aClass261_1.anInt7010 <= local987.aClass261_1.anInt7010 - (local720 - local284 >> 9)) {
												Static570.method7905(local536.aClass4_Sub2_13.aByte133 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, local1088);
												local1088.anInt2311 = Static528.anInt8386;
											}
										}
									}
								}
								local304 = Static268.anInt4162;
								@Pc(1217) int[] local1217 = Static597.anIntArray677;
								for (local364 = 0; local364 < local304; local364++) {
									@Pc(1227) Class4_Sub2_Sub1_Sub2_Sub1 local1227 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local1217[local364]];
									if (local1227 != null && Static528.anInt8386 != local1227.anInt2311 && local1227.aBoolean247) {
										local732 = local1227.anInt10229 - (local1227.method2046() - 1 << 8);
										local860 = local1227.anInt10228 - (local1227.method2046() - 1 << 8);
										if (local732 >= local603 && local1227.method2046() <= local987.aClass261_1.anInt7010 - (local732 - local603 >> 9) && local860 >= local284 && local1227.method2046() <= local987.aClass261_1.anInt7010 - (local860 - local284 >> 9)) {
											Static130.method1892(local1227, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 != local536.aClass4_Sub2_13.aByte133);
											local1227.anInt2311 = Static528.anInt8386;
										}
									}
								}
							}
							if (local987.anInt2311 == Static528.anInt8386) {
								continue;
							}
							Static570.method7905(local536.aClass4_Sub2_13.aByte133 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, local987);
							local987.anInt2311 = Static528.anInt8386;
						}
					}
					if (local536.aClass4_Sub2_13 instanceof Class4_Sub2_Sub5_Sub1) {
						@Pc(1381) int local1381 = local159 + Static243.anInt3820;
						local603 = Static224.anInt11062 + local573;
						@Pc(1402) Class2_Sub53 local1402 = (Class2_Sub53) Static596.aClass218_41.method5095((long) (local536.aClass4_Sub2_13.aByte133 << 28 | local603 << 14 | local1381), 0);
						if (local1402 != null) {
							local293 = 0;
							@Pc(1412) Class2_Sub48 local1412 = (Class2_Sub48) local1402.aClass60_217.method1227();
							while (local1412 != null) {
								@Pc(1420) Class203 local1420 = Static543.aClass37_2.method605(local1412.anInt8383);
								if (Static581.aBoolean787 && local536.aClass4_Sub2_13.aByte133 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133) {
									@Pc(1447) Class22 local1447 = Static27.anInt377 == -1 ? null : Static97.aClass328_2.method7810(Static27.anInt377);
									if ((Static523.anInt6605 & 0x1) != 0 && (local1447 == null || local1420.method4411(Static27.anInt377, local1447.anInt376) != local1447.anInt376)) {
										Static27.method371(Static96.anInt1729, (long) local293, true, -1, Static175.aString127, false, 46, false, Static701.aString94 + " -> <col=ff9040>" + local1420.aString52, (long) local1412.anInt8383, local573, local159);
									}
								}
								if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 == local536.aClass4_Sub2_13.aByte133) {
									@Pc(1517) String[] local1517 = local1420.aStringArray21;
									for (local720 = local1517.length - 1; local720 >= 0; local720--) {
										if (local1517[local720] != null) {
											@Pc(1532) short local1532 = 0;
											if (local720 == 0) {
												local1532 = 11;
											}
											local860 = Static576.anInt9090;
											if (local720 == 1) {
												local1532 = 10;
											}
											if (local720 == 2) {
												local1532 = 44;
											}
											if (local720 == 3) {
												local1532 = 21;
											}
											if (local720 == 4) {
												local1532 = 8;
											}
											if (local1420.anInt4883 == local720) {
												local860 = local1420.anInt4895;
											}
											if (local720 == 5) {
												local1532 = 1007;
											}
											if (local1420.anInt4868 == local720) {
												local860 = local1420.anInt4834;
											}
											Static27.method371(local860, (long) local293, true, -1, local1517[local720], false, local1532, false, "<col=ff9040>" + local1420.aString52, (long) local1412.anInt8383, local573, local159);
										}
									}
								}
								local1412 = (Class2_Sub48) local1402.aClass60_217.method1224();
								local293++;
							}
						}
					}
					if (local536.aClass4_Sub2_13 instanceof Interface25) {
						@Pc(1643) Interface25 local1643 = (Interface25) local536.aClass4_Sub2_13;
						@Pc(1650) Class81 local1650 = Static148.aClass153_3.method3342(local1643.method8986());
						if (local1650.anIntArray143 != null) {
							local1650 = local1650.method1629(Static396.aClass107_1);
						}
						if (local1650 != null) {
							if (Static581.aBoolean787 && local536.aClass4_Sub2_13.aByte133 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133) {
								@Pc(1689) Class22 local1689 = Static27.anInt377 == -1 ? null : Static97.aClass328_2.method7810(Static27.anInt377);
								if ((Static523.anInt6605 & 0x4) != 0 && (local1689 == null || local1650.method1639(local1689.anInt376, Static27.anInt377) != local1689.anInt376)) {
									Static27.method371(Static96.anInt1729, (long) local1643.hashCode(), true, -1, Static175.aString127, false, 30, false, Static701.aString94 + " -> <col=00ffff>" + local1650.aString16, Static251.method3562(local159, local573, local1643), local573, local159);
								}
							}
							if (local536.aClass4_Sub2_13.aByte133 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133) {
								@Pc(1766) String[] local1766 = local1650.aStringArray11;
								if (local1766 != null) {
									for (local293 = local1766.length - 1; local293 >= 0; local293--) {
										if (local1766[local293] != null) {
											@Pc(1783) short local1783 = 0;
											local315 = Static576.anInt9090;
											if (local293 == 0) {
												local1783 = 4;
											}
											if (local293 == 1) {
												local1783 = 23;
											}
											if (local293 == 2) {
												local1783 = 48;
											}
											if (local293 == 3) {
												local1783 = 18;
											}
											if (local293 == 4) {
												local1783 = 1010;
											}
											if (local293 == 5) {
												local1783 = 1002;
											}
											if (local1650.anInt1855 == local293) {
												local315 = local1650.anInt1897;
											}
											if (local1650.anInt1895 == local293) {
												local315 = local1650.anInt1886;
											}
											Static27.method371(local315, (long) local1643.hashCode(), true, -1, local1766[local293], false, local1783, false, "<col=00ffff>" + local1650.aString16, Static251.method3562(local159, local573, local1643), local573, local159);
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static392.aBoolean549) {
				Static116.method1686();
			}
		}
		Static721.method9621(false);
	}
}
