import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	public static int anInt3214;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_74 = new Class140(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!lq;")
	public static final Class129 aClass129_7 = new Class129();

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_75 = new Class140("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	public static int anInt3213 = -1;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_105 = new Class157(32, 7);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIII)V")
	public static void method2888(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static146.method2839(arg2)) {
			Static12.method179(arg0, arg3, Static264.aClass68ArrayArray1[arg2], -1, arg1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public static void method2889() {
		if (Static101.anInt2051 > 1) {
			Static101.anInt2051--;
			Static196.anInt4296 = Static125.anInt2664;
		}
		if (Static99.anInt2030 > 0) {
			Static99.anInt2030--;
		}
		if (Static107.aBoolean215) {
			Static107.aBoolean215 = false;
			Static36.method468();
			return;
		}
		if (!Static258.aBoolean470) {
			Static296.method5451();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static292.method4864(); local38++) {
		}
		if (Static176.anInt3971 != 30) {
			return;
		}
		Static361.method5748(Static197.aClass2_Sub12_Sub2_2, Static307.aClass157_190.method4402());
		if (Static319.aClass2_Sub2_2 == null) {
			if (Static22.method285() >= Static236.aLong31) {
				Static319.aClass2_Sub2_2 = Static350.aClass62_1.method1685(Static90.aString19);
			}
		} else if (Static319.aClass2_Sub2_2.anInt98 != -1) {
			Static300.method5057(Static106.aClass157_77);
			Static197.aClass2_Sub12_Sub2_2.method3158(Static319.aClass2_Sub2_2.anInt98);
			Static319.aClass2_Sub2_2 = null;
			Static236.aLong31 = Static22.method285() + 30000L;
		}
		@Pc(121) int local121;
		@Pc(143) int local143;
		@Pc(163) int local163;
		@Pc(181) boolean local181;
		@Pc(227) int local227;
		@Pc(234) int local234;
		@Pc(245) int local245;
		if (Static17.aClass2_Sub1_1 != null || Static22.method285() - 2000L > Static334.aLong202) {
			@Pc(118) boolean local118 = false;
			local121 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
			for (@Pc(126) Class2_Sub1 local126 = (Class2_Sub1) Static290.aClass180_40.method4919(); local126 != null && Static197.aClass2_Sub12_Sub2_2.anInt3606 - local121 < 240; local126 = (Class2_Sub1) Static290.aClass180_40.method4916()) {
				local126.method5723();
				local143 = local126.method51();
				if (local143 < 0) {
					local143 = 0;
				} else if (local143 > 65534) {
					local143 = 65534;
				}
				local163 = local126.method49();
				if (local163 < 0) {
					local163 = 0;
				} else if (local163 > 65534) {
					local163 = 65534;
				}
				local181 = false;
				if (local126.method51() == -1 && local126.method49() == -1) {
					local143 = -1;
					local163 = -1;
					local181 = true;
				}
				if (local163 != Static98.anInt2019 || Static338.anInt6590 != local143) {
					if (!local118) {
						Static300.method5057(Static79.aClass157_52);
						Static197.aClass2_Sub12_Sub2_2.method3147(0);
						local121 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
						local118 = true;
					}
					local227 = local163 - Static98.anInt2019;
					Static98.anInt2019 = local163;
					local234 = local143 - Static338.anInt6590;
					Static338.anInt6590 = local143;
					local245 = (int) ((local126.method47() - Static334.aLong202) / 20L);
					if (local245 < 8 && local227 >= -32 && local227 <= 31 && local234 >= -32 && local234 <= 31) {
						local234 += 32;
						local227 += 32;
						Static197.aClass2_Sub12_Sub2_2.method3158(local234 + (local227 << 6) + (local245 << 12));
					} else if (local245 < 32 && local227 >= -128 && local227 <= 127 && local234 >= -128 && local234 <= 127) {
						Static197.aClass2_Sub12_Sub2_2.method3147(local245 + 128);
						local234 += 128;
						local227 += 128;
						Static197.aClass2_Sub12_Sub2_2.method3158((local227 << 8) + local234);
					} else if (local245 >= 32) {
						Static197.aClass2_Sub12_Sub2_2.method3158(local245 + 57344);
						if (local181) {
							Static197.aClass2_Sub12_Sub2_2.method3162(Integer.MIN_VALUE);
						} else {
							Static197.aClass2_Sub12_Sub2_2.method3162(local143 << 16 | local163);
						}
					} else {
						Static197.aClass2_Sub12_Sub2_2.method3147(local245 + 192);
						if (local181) {
							Static197.aClass2_Sub12_Sub2_2.method3162(Integer.MIN_VALUE);
						} else {
							Static197.aClass2_Sub12_Sub2_2.method3162(local163 | local143 << 16);
						}
					}
					Static334.aLong202 = local126.method47();
				}
			}
			if (local118) {
				Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local121);
			}
		}
		@Pc(428) int local428;
		@Pc(471) int local471;
		if (Static17.aClass2_Sub1_1 != null) {
			@Pc(414) long local414 = (Static17.aClass2_Sub1_1.method47() - Static213.aLong139) / 50L;
			if (local414 > 32767L) {
				local414 = 32767L;
			}
			Static213.aLong139 = Static17.aClass2_Sub1_1.method47();
			local428 = Static17.aClass2_Sub1_1.method51();
			if (local428 < 0) {
				local428 = 0;
			} else if (local428 > 65535) {
				local428 = 65535;
			}
			local143 = Static17.aClass2_Sub1_1.method49();
			if (local143 < 0) {
				local143 = 0;
			} else if (local143 > 65535) {
				local143 = 65535;
			}
			@Pc(459) byte local459 = 0;
			if (Static17.aClass2_Sub1_1.method53() == 2) {
				local459 = 1;
			}
			local471 = (int) local414;
			Static300.method5057(Static344.aClass157_213);
			Static197.aClass2_Sub12_Sub2_2.method3121(local459 << 15 | local471);
			Static197.aClass2_Sub12_Sub2_2.method3138(local143 | local428 << 16);
		}
		@Pc(501) int local501;
		if (Static304.anInt6075 > 0) {
			local501 = 0;
			for (local121 = 0; local121 < Static304.anInt6075; local121++) {
				if (Static255.aClass50Array1[local121].method1169()) {
					local501++;
				}
			}
			if (local501 > 0) {
				if (local501 > 75) {
					local501 = 75;
				}
				Static300.method5057(Static268.aClass157_173);
				Static197.aClass2_Sub12_Sub2_2.method3147(local501 * 3);
				for (local428 = 0; local428 < Static304.anInt6075; local428++) {
					@Pc(551) Class50 local551 = Static255.aClass50Array1[local428];
					if (local551.method1169()) {
						@Pc(564) long local564 = (local551.method1161() - Static251.aLong159) / 50L;
						if (local564 > 65535L) {
							local564 = 65535L;
						}
						Static251.aLong159 = local551.method1161();
						Static197.aClass2_Sub12_Sub2_2.method3147(local551.method1162());
						Static197.aClass2_Sub12_Sub2_2.method3158((int) local564);
					}
				}
			}
		}
		if (Static195.anInt4285 > 0) {
			Static195.anInt4285--;
		}
		if (Static273.aBoolean493 && Static195.anInt4285 <= 0) {
			Static273.aBoolean493 = false;
			Static195.anInt4285 = 20;
			Static300.method5057(Static218.aClass157_144);
			Static197.aClass2_Sub12_Sub2_2.method3115((int) Static366.aFloat48 >> 3);
			Static197.aClass2_Sub12_Sub2_2.method3115((int) Static99.aFloat33 >> 3);
		}
		if (Static107.aBoolean216 && !Static297.aBoolean519) {
			Static297.aBoolean519 = true;
			Static300.method5057(Static198.aClass157_134);
			Static197.aClass2_Sub12_Sub2_2.method3147(1);
		}
		if (!Static107.aBoolean216 && Static297.aBoolean519) {
			Static297.aBoolean519 = false;
			Static300.method5057(Static198.aClass157_134);
			Static197.aClass2_Sub12_Sub2_2.method3147(0);
		}
		if (!Static128.aBoolean263) {
			Static300.method5057(Static41.aClass157_175);
			Static197.aClass2_Sub12_Sub2_2.method3162(Static127.method2504());
			Static128.aBoolean263 = true;
		}
		if (Static196.aClass51ArrayArrayArray3 != null) {
			if (Static135.anInt2910 == 2) {
				Static190.method5238();
			} else if (Static135.anInt2910 == 3) {
				Static125.method2441();
			}
		}
		if (Static96.aBoolean178) {
			Static96.aBoolean178 = false;
		} else {
			Static90.aFloat32 /= 2.0F;
		}
		if (Static107.aBoolean214) {
			Static107.aBoolean214 = false;
		} else {
			Static145.aFloat37 /= 2.0F;
		}
		Static53.method1170();
		if (Static176.anInt3971 != 30) {
			return;
		}
		Static63.method1318();
		Static193.method3607();
		Static283.method4808();
		Static201.anInt4409++;
		if (Static201.anInt4409 > 750) {
			Static36.method468();
			return;
		}
		Static292.method4862();
		Static317.method5261();
		Static9.method149();
		for (local501 = Static85.method1709(true); local501 != -1; local501 = Static85.method1709(false)) {
			Static260.method4614(local501);
			Static139.anIntArray243[Static139.anInt3006++ & 0x1F] = local501;
		}
		@Pc(874) Class68 local874;
		for (@Pc(800) Class2_Sub9_Sub4 local800 = Static51.method1027(); local800 != null; local800 = Static51.method1027()) {
			local428 = local800.method1800();
			local143 = local800.method1794();
			if (local428 == 1) {
				Static20.anIntArray40[local143] = local800.anInt1723;
				Static6.aBoolean9 |= Static18.aBooleanArray4[local143];
				Static241.anIntArray399[Static353.anInt5916++ & 0x1F] = local143;
			} else if (local428 == 2) {
				Static253.aStringArray35[local143] = local800.aString16;
				Static78.anIntArray123[Static243.anInt5157++ & 0x1F] = local143;
			} else if (local428 == 3) {
				local874 = Static8.method144(local143);
				if (!local800.aString16.equals(local874.aString25)) {
					local874.aString25 = local800.aString16;
					Static114.method2241(local874);
				}
			} else if (local428 == 4) {
				local874 = Static8.method144(local143);
				local471 = local800.anInt1723;
				local227 = local800.anInt1729;
				local234 = local800.anInt1719;
				if (local874.anInt1897 != local471 || local874.anInt1903 != local227 || local874.anInt1896 != local234) {
					local874.anInt1897 = local471;
					local874.anInt1896 = local234;
					local874.anInt1903 = local227;
					Static114.method2241(local874);
				}
			} else if (local428 == 5) {
				local874 = Static8.method144(local143);
				if (local800.anInt1723 != local874.anInt1880 || local800.anInt1723 == -1) {
					local874.anInt1838 = 0;
					local874.anInt1906 = 1;
					local874.anInt1880 = local800.anInt1723;
					local874.anInt1899 = 0;
					Static114.method2241(local874);
				}
			} else if (local428 == 6) {
				local163 = local800.anInt1723;
				local471 = local163 >> 10 & 0x1F;
				local227 = local163 >> 5 & 0x1F;
				local234 = local163 & 0x1F;
				local245 = (local234 << 3) + (local471 << 19) + (local227 << 11);
				@Pc(1210) Class68 local1210 = Static8.method144(local143);
				if (local1210.anInt1888 != local245) {
					local1210.anInt1888 = local245;
					Static114.method2241(local1210);
				}
			} else if (local428 == 7) {
				local874 = Static8.method144(local143);
				local181 = local800.anInt1723 == 1;
				if (local181 != local874.aBoolean172) {
					local874.aBoolean172 = local181;
					Static114.method2241(local874);
				}
			} else if (local428 == 8) {
				local874 = Static8.method144(local143);
				if (local874.anInt1907 != local800.anInt1723 || local874.anInt1887 != local800.anInt1729 || local800.anInt1719 != local874.anInt1861) {
					local874.anInt1887 = local800.anInt1729;
					local874.anInt1907 = local800.anInt1723;
					local874.anInt1861 = local800.anInt1719;
					if (local874.anInt1890 != -1) {
						if (local874.anInt1895 > 0) {
							local874.anInt1861 = local874.anInt1861 * 32 / local874.anInt1895;
						} else if (local874.anInt1840 > 0) {
							local874.anInt1861 = local874.anInt1861 * 32 / local874.anInt1840;
						}
					}
					Static114.method2241(local874);
				}
			} else if (local428 == 9) {
				local874 = Static8.method144(local143);
				if (local874.anInt1890 != local800.anInt1723 || local874.anInt1866 != local800.anInt1729) {
					local874.anInt1890 = local800.anInt1723;
					local874.anInt1866 = local800.anInt1729;
					Static114.method2241(local874);
				}
			} else if (local428 == 10) {
				local874 = Static8.method144(local143);
				if (local874.anInt1850 != local800.anInt1723 || local874.anInt1910 != local800.anInt1729 || local800.anInt1719 != local874.anInt1835) {
					local874.anInt1850 = local800.anInt1723;
					local874.anInt1910 = local800.anInt1729;
					local874.anInt1835 = local800.anInt1719;
					Static114.method2241(local874);
				}
			} else if (local428 == 11) {
				local874 = Static8.method144(local143);
				local874.aByte17 = 0;
				local874.anInt1833 = local874.anInt1902 = local800.anInt1729;
				local874.aByte19 = 0;
				local874.anInt1831 = local874.anInt1856 = local800.anInt1723;
				Static114.method2241(local874);
			} else if (local428 == 12) {
				local874 = Static8.method144(local143);
				local471 = local800.anInt1723;
				if (local874 != null && local874.anInt1871 == 0) {
					if (local874.anInt1894 - local874.anInt1845 < local471) {
						local471 = local874.anInt1894 - local874.anInt1845;
					}
					if (local471 < 0) {
						local471 = 0;
					}
					if (local471 != local874.anInt1872) {
						local874.anInt1872 = local471;
						Static114.method2241(local874);
					}
				}
			} else if (local428 == 14) {
				local874 = Static8.method144(local143);
				local874.anInt1879 = local800.anInt1723;
			} else if (local428 == 15) {
				Static360.anInt6858 = local800.anInt1729;
				Static100.aBoolean187 = true;
				Static57.anInt1013 = local800.anInt1723;
			} else if (local428 == 16) {
				local874 = Static8.method144(local143);
				local874.anInt1904 = local800.anInt1723;
			}
		}
		if (Static289.anInt4725 != 0) {
			Static172.anInt3886 += 20;
			if (Static172.anInt3886 >= 400) {
				Static289.anInt4725 = 0;
			}
		}
		Static170.anInt5086++;
		if (Static36.aClass68_2 != null) {
			Static7.anInt144++;
			if (Static7.anInt144 >= 15) {
				Static114.method2241(Static36.aClass68_2);
				Static36.aClass68_2 = null;
			}
		}
		Static280.aBoolean499 = false;
		Static114.aClass68_17 = null;
		Static193.aBoolean354 = false;
		Static40.aClass68_3 = null;
		Static209.method5788(null, -1, -1);
		Static294.method4923(-1, null, -1);
		Static8.method148();
		Static125.anInt2664++;
		if (Static165.aBoolean328) {
			Static300.method5057(Static105.aClass157_75);
			Static197.aClass2_Sub12_Sub2_2.method3125(Static1.anInt5235 << 28 | Static222.anInt6841 << 14 | Static338.anInt6591);
			Static165.aBoolean328 = false;
		}
		while (true) {
			@Pc(1436) Class2_Sub41 local1436;
			@Pc(1441) Class68 local1441;
			do {
				local1436 = (Class2_Sub41) Static311.aClass180_42.method4914();
				if (local1436 == null) {
					while (true) {
						do {
							local1436 = (Class2_Sub41) Static215.aClass180_28.method4914();
							if (local1436 == null) {
								while (true) {
									do {
										local1436 = (Class2_Sub41) Static245.aClass180_36.method4914();
										if (local1436 == null) {
											if (Static40.aClass68_3 == null) {
												Static366.anInt4511 = 0;
											}
											if (Static18.aClass68_1 != null) {
												Static150.method3006();
											}
											if (Static291.anInt5264 > 0 && Static166.aClass25_1.method398(82) && Static166.aClass25_1.method398(81) && Static184.anInt4075 != 0) {
												local428 = Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 - Static184.anInt4075;
												if (local428 < 0) {
													local428 = 0;
												} else if (local428 > 3) {
													local428 = 3;
												}
												Static357.method5710(Static287.anInt5776 + Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], local428, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0] + Static150.anInt3453);
											}
											Static268.method4689();
											for (local428 = 0; local428 < 5; local428++) {
												@Pc(1640) int local1640 = Static338.anIntArray503[local428]++;
											}
											if (Static6.aBoolean9 && Static271.aLong174 < Static22.method285() - 60000L) {
												Static191.method3581();
											}
											Static112.anInt2363++;
											if (Static112.anInt2363 > 500) {
												Static112.anInt2363 = 0;
												local143 = (int) (Math.random() * 8.0D);
												if ((local143 & 0x4) == 4) {
													Static206.anInt4521 += Static336.anInt6524;
												}
												if ((local143 & 0x2) == 2) {
													Static222.anInt6840 += Static346.anInt5917;
												}
												if ((local143 & 0x1) == 1) {
													Static159.anInt2742 += Static112.anInt2361;
												}
											}
											if (Static159.anInt2742 < -50) {
												Static112.anInt2361 = 2;
											}
											if (Static222.anInt6840 < -55) {
												Static346.anInt5917 = 2;
											}
											if (Static159.anInt2742 > 50) {
												Static112.anInt2361 = -2;
											}
											if (Static222.anInt6840 > 55) {
												Static346.anInt5917 = -2;
											}
											if (Static206.anInt4521 < -40) {
												Static336.anInt6524 = 1;
											}
											Static21.anInt3163++;
											if (Static206.anInt4521 > 40) {
												Static336.anInt6524 = -1;
											}
											if (Static21.anInt3163 > 500) {
												Static21.anInt3163 = 0;
												local143 = (int) (Math.random() * 8.0D);
												if ((local143 & 0x2) == 2) {
													Static267.anInt5561 += Static215.anInt4744;
												}
												if ((local143 & 0x1) == 1) {
													Static85.anInt1601 += Static288.anInt5784;
												}
											}
											if (Static85.anInt1601 < -60) {
												Static288.anInt5784 = 2;
											}
											if (Static267.anInt5561 < -20) {
												Static215.anInt4744 = 1;
											}
											if (Static85.anInt1601 > 60) {
												Static288.anInt5784 = -2;
											}
											if (Static267.anInt5561 > 10) {
												Static215.anInt4744 = -1;
											}
											Static87.anInt1641++;
											if (Static87.anInt1641 > 50) {
												Static300.method5057(Static132.aClass157_95);
											}
											if (Static28.aBoolean35) {
												Static312.method5212();
												Static28.aBoolean35 = false;
											}
											try {
												if (Static129.aClass117_2 != null && Static197.aClass2_Sub12_Sub2_2.anInt3606 > 0) {
													Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
													Static87.anInt1641 = 0;
													Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
													return;
												}
												return;
											} catch (@Pc(1843) IOException local1843) {
												Static36.method468();
												return;
											}
										}
										local1441 = local1436.aClass68_35;
										if (local1441.anInt1851 < 0) {
											break;
										}
										local874 = Static8.method144(local1441.anInt1830);
									} while (local874 == null || local874.aClass68Array1 == null || local874.aClass68Array1.length <= local1441.anInt1851 || local874.aClass68Array1[local1441.anInt1851] != local1441);
									Static367.method5890(local1436);
								}
							}
							local1441 = local1436.aClass68_35;
							if (local1441.anInt1851 < 0) {
								break;
							}
							local874 = Static8.method144(local1441.anInt1830);
						} while (local874 == null || local874.aClass68Array1 == null || local1441.anInt1851 >= local874.aClass68Array1.length || local874.aClass68Array1[local1441.anInt1851] != local1441);
						Static367.method5890(local1436);
					}
				}
				local1441 = local1436.aClass68_35;
				if (local1441.anInt1851 < 0) {
					break;
				}
				local874 = Static8.method144(local1441.anInt1830);
			} while (local874 == null || local874.aClass68Array1 == null || local874.aClass68Array1.length <= local1441.anInt1851 || local1441 != local874.aClass68Array1[local1441.anInt1851]);
			Static367.method5890(local1436);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method2890(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub9_Sub4 local12 = Static98.method1971(14, arg0);
		local12.method1799();
	}
}
