import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!jo;")
	public static Class168 aClass168_56;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "[Lclient!am;")
	public static final Class16[] aClass16Array1 = new Class16[14];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(DB)V")
	public static void method4102(@OriginalArg(0) double arg0) {
		if (Static525.aDouble8 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static52.anIntArray94[local11] = local23 <= 255 ? local23 : 255;
		}
		Static525.aDouble8 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public static void method4103() {
		if (Static389.aString92.toLowerCase().indexOf("microsoft") != -1) {
			Static207.anIntArray285[219] = 42;
			Static207.anIntArray285[186] = 57;
			Static207.anIntArray285[221] = 43;
			Static207.anIntArray285[189] = 26;
			Static207.anIntArray285[220] = 74;
			Static207.anIntArray285[222] = 59;
			Static207.anIntArray285[187] = 27;
			Static207.anIntArray285[191] = 73;
			Static207.anIntArray285[188] = 71;
			Static207.anIntArray285[223] = 28;
			Static207.anIntArray285[190] = 72;
			Static207.anIntArray285[192] = 58;
			return;
		}
		Static207.anIntArray285[47] = 73;
		Static207.anIntArray285[45] = 26;
		Static207.anIntArray285[59] = 57;
		Static207.anIntArray285[93] = 43;
		Static207.anIntArray285[44] = 71;
		Static207.anIntArray285[46] = 72;
		Static207.anIntArray285[61] = 27;
		Static207.anIntArray285[92] = 74;
		if (Static389.aMethod2 == null) {
			Static207.anIntArray285[192] = 58;
			Static207.anIntArray285[222] = 59;
		} else {
			Static207.anIntArray285[222] = 58;
			Static207.anIntArray285[520] = 59;
			Static207.anIntArray285[192] = 28;
		}
		Static207.anIntArray285[91] = 42;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pp;Lclient!pp;Z)V")
	public static void method4105(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		if (arg0.aClass6_Sub4_60 != null) {
			arg0.method8035();
		}
		arg0.aClass6_Sub4_60 = arg1;
		arg0.aClass6_Sub4_59 = arg1.aClass6_Sub4_59;
		arg0.aClass6_Sub4_60.aClass6_Sub4_59 = arg0;
		arg0.aClass6_Sub4_59.aClass6_Sub4_60 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method4107() {
		if (Static558.anInt9502 == 0 || Static558.anInt9502 == 6) {
			return;
		}
		try {
			if (++Static436.anInt7961 > 2000) {
				if (Static52.aClass64_1 != null) {
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
				}
				if (Static569.anInt9617 >= 2) {
					Static558.anInt9502 = 0;
					Static554.method7903(-5);
					return;
				}
				if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
					Static293.aClass275_2.method6665();
				} else {
					Static267.aClass275_1.method6665();
				}
				Static436.anInt7961 = 0;
				Static569.anInt9617++;
				Static558.anInt9502 = 1;
			}
			if (Static558.anInt9502 == 1) {
				if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
					Static230.aClass280_3 = Static293.aClass275_2.method6662(Static414.aClass246_5);
				} else {
					Static230.aClass280_3 = Static267.aClass275_1.method6662(Static414.aClass246_5);
				}
				Static558.anInt9502 = 2;
			}
			if (Static558.anInt9502 == 2) {
				if (Static230.aClass280_3.anInt8467 == 2) {
					throw new IOException();
				}
				if (Static230.aClass280_3.anInt8467 != 1) {
					return;
				}
				Static52.aClass64_1 = Static29.method993((Socket) Static230.aClass280_3.anObject16);
				Static230.aClass280_3 = null;
				@Pc(122) long local122 = Static524.aLong226 = Static118.method2353(Static319.aString70);
				Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
				@Pc(132) int local132 = (int) (local122 >> 16 & 0x1FL);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static562.aClass219_1.anInt6222, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(local132, -81849);
				Static52.aClass64_1.method1819(2, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
				Static558.anInt9502 = 3;
			}
			@Pc(174) int local174;
			if (Static558.anInt9502 == 3) {
				if (!Static52.aClass64_1.method1820(1)) {
					return;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				local174 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
				if (local174 != 0) {
					Static558.anInt9502 = 0;
					Static554.method7903(local174);
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					Static418.method1818();
					return;
				}
				Static558.anInt9502 = 4;
			}
			if (Static558.anInt9502 == 4) {
				if (!Static52.aClass64_1.method1820(8)) {
					return;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 8);
				Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
				Static42.aLong22 = Static345.aClass6_Sub26_Sub2_1.method4935();
				@Pc(224) Class6_Sub26 local224 = new Class6_Sub26(518);
				@Pc(227) int[] local227 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static42.aLong22 >> 32), (int) Static42.aLong22 };
				local224.method4950(10, -81849);
				local224.method4979(local227[0]);
				local224.method4979(local227[1]);
				local224.method4979(local227[2]);
				local224.method4979(local227[3]);
				local224.method4943(Static118.method2353(Static319.aString70));
				local224.method4998(Static148.aString116);
				local224.method4943(Static196.aLong84);
				local224.method4943(Static4.aLong7);
				local224.method4956(Static241.aBigInteger3, Static83.aBigInteger2);
				@Pc(312) Class6_Sub26_Sub2 local312 = Static547.aClass6_Sub26_Sub2_2;
				local312.anInt5769 = 0;
				@Pc(337) int local337;
				if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
					if (Static325.anInt6149 == 13) {
						local312.method4950(Static562.aClass219_5.anInt6222, -81849);
					} else {
						local312.method4950(Static562.aClass219_3.anInt6222, -81849);
					}
					local312.method4962(0);
					local337 = local312.anInt5769;
					local312.method4979(612);
					local312.method4950(Static518.anInt9045, -81849);
					local312.method4950(Static298.method4852(), -81849);
					local312.method4962(Static228.anInt4744);
					local312.method4962(Static180.anInt4051);
					local312.method4950(Static104.aClass6_Sub6_Sub1_4.anInt1166, -81849);
					Static457.method7118(local312);
					local312.method4998(Static166.aString38);
					local312.method4979(Static294.anInt5607);
					@Pc(466) Class6_Sub26 local466 = new Class6_Sub26(Static553.method7876());
					Static104.aClass6_Sub6_Sub1_4.method1060(local466);
					local312.method4950(local466.anInt5769, -81849);
					local312.method4939(local466.anInt5769, local466.aByteArray65);
					Static54.aBoolean151 = true;
					@Pc(491) Class6_Sub26 local491 = new Class6_Sub26(Static250.method4402());
					(new Class6_Sub28(true, Static414.aClass246_5)).method4065(local491);
					local312.method4939(local491.aByteArray65.length, local491.aByteArray65);
					local312.method4962(Static444.anInt8179);
					local312.method4943(Static347.aLong149);
					Static359.method5400();
					local312.method4939(local224.anInt5769, local224.aByteArray65);
					local312.method4963(local312.anInt5769 - local337);
				} else {
					local312.method4950(Static562.aClass219_6.anInt6222, -81849);
					local312.method4962(0);
					local337 = local312.anInt5769;
					local312.method4979(612);
					local312.method4950(Static38.aClass162_1.anInt4926, -81849);
					local312.method4950(Static286.anInt5468, -81849);
					Static457.method7118(local312);
					local312.method4998(Static166.aString38);
					local312.method4979(Static294.anInt5607);
					Static359.method5400();
					local312.method4939(local224.anInt5769, local224.aByteArray65);
					local312.method4963(local312.anInt5769 - local337);
				}
				Static52.aClass64_1.method1819(local312.anInt5769, local312.aByteArray65);
				local312.method5005(local227);
				for (local337 = 0; local337 < 4; local337++) {
					local227[local337] += 50;
				}
				Static345.aClass6_Sub26_Sub2_1.method5005(local227);
				Static558.anInt9502 = 5;
			}
			if (Static558.anInt9502 == 5) {
				if (!Static52.aClass64_1.method1820(1)) {
					return;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				local174 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
				if (local174 == 21) {
					Static558.anInt9502 = 8;
				} else if (local174 == 29) {
					Static558.anInt9502 = 14;
				} else if (local174 == 1) {
					Static558.anInt9502 = 6;
					Static554.method7903(local174);
					return;
				} else if (local174 == 2) {
					Static558.anInt9502 = 9;
				} else if (local174 == 15) {
					Static558.anInt9502 = 15;
					Static462.anInt8534 = -2;
				} else if (local174 == 23 && Static569.anInt9617 < 2) {
					Static558.anInt9502 = 1;
					Static436.anInt7961 = 0;
					Static569.anInt9617++;
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					return;
				} else {
					Static558.anInt9502 = 0;
					Static554.method7903(local174);
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					Static418.method1818();
					return;
				}
			}
			if (Static558.anInt9502 == 7) {
				Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
				Static547.aClass6_Sub26_Sub2_2.method5010(Static562.aClass219_13.anInt6222);
				Static52.aClass64_1.method1819(Static547.aClass6_Sub26_Sub2_2.anInt5769, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
				Static558.anInt9502 = 5;
			} else if (Static558.anInt9502 == 8) {
				if (Static52.aClass64_1.method1820(1)) {
					Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
					local174 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
					Static558.anInt9502 = 0;
					Static220.anInt4641 = (local174 + 3) * 60;
					Static554.method7903(21);
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					Static418.method1818();
				}
			} else if (Static558.anInt9502 == 14) {
				if (Static52.aClass64_1.method1820(1)) {
					Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
					Static558.anInt9502 = 0;
					Static310.anInt5847 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
					Static554.method7903(29);
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					Static418.method1818();
				}
			} else if (Static558.anInt9502 != 9) {
				@Pc(830) Class6_Sub26_Sub2 local830;
				if (Static558.anInt9502 == 10) {
					local830 = Static345.aClass6_Sub26_Sub2_1;
					if (Static49.anInt1353 == 3) {
						Static494.aBoolean671 = true;
					} else {
						Static494.aBoolean671 = false;
					}
					if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
						if (!Static52.aClass64_1.method1820(Static525.anInt9113)) {
							return;
						}
						Static52.aClass64_1.method1813(local830.aByteArray65, 0, Static525.anInt9113);
						local830.anInt5769 = 0;
						Static456.anInt8437 = local830.method4966();
						Static405.anInt7594 = local830.method4966();
						Static200.aBoolean349 = local830.method4966() == 1;
						Static554.aBoolean702 = local830.method4966() == 1;
						Static323.aBoolean452 = local830.method4966() == 1;
						Static245.aBoolean376 = local830.method4966() == 1;
						Static412.anInt7714 = local830.method4999();
						Static175.aBoolean325 = local830.method4966() == 1;
						Static179.anInt3991 = local830.method4953();
						Static156.aBoolean272 = local830.method4966() == 1;
						if (Static49.anInt1353 == 3) {
							@Pc(960) boolean local960 = local830.method4966() == 1;
							if (local960) {
								@Pc(966) long local966 = local830.method4935();
								@Pc(972) String local972 = Static141.method2654(local966);
								@Pc(978) int local978 = local830.method4966();
								@Pc(981) byte[] local981 = new byte[local978];
								local830.method5001(local981, local978);
								@Pc(991) String local991 = Static151.method2925(local981);
								@Pc(993) Class155 local993 = null;
								try {
									@Pc(999) Class280 local999 = Static414.aClass246_5.method6136("3", false);
									while (local999.anInt8467 == 0) {
										Static566.method8004(1L);
									}
									if (local999.anInt8467 == 1) {
										local993 = (Class155) local999.anObject16;
										@Pc(1029) int local1029 = local972.length() + local991.length() + 3 + 2 + 14;
										if (local1029 > 60) {
											throw new RuntimeException(">60");
										}
										@Pc(1044) Class6_Sub26 local1044 = new Class6_Sub26(local1029 + 1);
										local1044.method4950(local1029, -81849);
										local1044.method4950(2, -81849);
										local1044.method4994(local972);
										local1044.method4994(local991);
										local1044.method4962(Static294.anInt5607);
										local1044.method4943(Static347.aLong149);
										local1044.method4982();
										local993.method4079(local1044.anInt5769, local1044.aByteArray65, 0);
									}
								} catch (@Pc(1084) Exception local1084) {
								}
								try {
									if (local993 != null) {
										local993.method4077();
									}
								} catch (@Pc(1093) Exception local1093) {
								}
								try {
									Static590.method5698("demoaccountcreated", Static87.anApplet1);
								} catch (@Pc(1100) Throwable local1100) {
								}
							}
						}
						Static480.aClass57_11.method1470(Static156.aBoolean272);
						Static98.aClass203_1.method4908(Static156.aBoolean272);
						Static504.aClass343_2.method7993(Static156.aBoolean272);
					} else if (Static52.aClass64_1.method1820(Static525.anInt9113)) {
						Static52.aClass64_1.method1813(local830.aByteArray65, 0, Static525.anInt9113);
						local830.anInt5769 = 0;
						Static456.anInt8437 = local830.method4966();
						Static405.anInt7594 = local830.method4966();
						Static200.aBoolean349 = local830.method4966() == 1;
						Static554.aBoolean702 = local830.method4966() == 1;
						Static323.aBoolean452 = local830.method4966() == 1;
						Static70.anInt1700 = local830.method4999();
						Static175.aBoolean325 = Static70.anInt1700 > 0;
						Static385.anInt7230 = local830.method4999();
						Static49.anInt1350 = local830.method4999();
						Static444.anInt8180 = local830.method4999();
						Static158.anInt3385 = local830.method5000();
						Static255.aClass280_4 = Static414.aClass246_5.method6142(Static158.anInt3385);
						Static177.anInt3968 = local830.method4966();
						Static429.anInt7863 = local830.method4999();
						Static536.anInt9249 = local830.method4999();
						Static448.aBoolean602 = local830.method4966() == 1;
						Static350.aClass11_Sub1_Sub1_Sub2_4.aString95 = Static350.aClass11_Sub1_Sub1_Sub2_4.aString96 = local830.method4945();
						Static381.anInt7162 = local830.method4966();
						Static552.aClass275_4 = new Class275();
						Static552.aClass275_4.anInt7968 = local830.method4999();
						if (Static552.aClass275_4.anInt7968 == 65535) {
							Static552.aClass275_4.anInt7968 = -1;
						}
						Static552.aClass275_4.aString100 = local830.method4945();
						if (Static230.aClass123_8 != Static186.aClass123_6) {
							Static552.aClass275_4.anInt7972 = Static552.aClass275_4.anInt7968 + 40000;
							Static552.aClass275_4.anInt7971 = Static552.aClass275_4.anInt7968 + 50000;
						}
						if (Static79.aClass123_16 != Static186.aClass123_6 && (Static293.aClass275_2.method6664(Static580.aClass275_6) || Static293.aClass275_2.method6664(Static516.aClass275_5))) {
							Static88.method1976();
						}
					} else {
						return;
					}
					if (Static200.aBoolean349 && !Static323.aBoolean452 || Static175.aBoolean325) {
						try {
							Static590.method5698("zap", Static87.anApplet1);
						} catch (@Pc(1329) Throwable local1329) {
							if (Static343.aBoolean495) {
								try {
									Static87.anApplet1.getAppletContext().showDocument(new URL(Static87.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1343) Exception local1343) {
								}
							}
						}
					} else {
						try {
							Static590.method5698("unzap", Static87.anApplet1);
						} catch (@Pc(1320) Throwable local1320) {
						}
					}
					if (Static230.aClass123_8 == Static186.aClass123_6) {
						try {
							Static590.method5698("loggedin", Static87.anApplet1);
						} catch (@Pc(1354) Throwable local1354) {
						}
					}
					if (Static49.anInt1353 != 2 && Static49.anInt1353 != 3) {
						Static558.anInt9502 = 0;
						Static554.method7903(2);
						Static128.method2508();
						Static145.method2683(7);
						Static180.aClass254_74 = null;
						return;
					}
					Static558.anInt9502 = 12;
				}
				if (Static558.anInt9502 == 12) {
					if (!Static52.aClass64_1.method1820(3)) {
						return;
					}
					Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 3);
					Static558.anInt9502 = 13;
				}
				if (Static558.anInt9502 == 13) {
					local830 = Static345.aClass6_Sub26_Sub2_1;
					local830.anInt5769 = 0;
					if (local830.method5004()) {
						if (!Static52.aClass64_1.method1820(1)) {
							return;
						}
						Static52.aClass64_1.method1813(local830.aByteArray65, 3, 1);
					}
					Static180.aClass254_74 = Static233.method4119()[local830.method5003()];
					Static462.anInt8534 = local830.method4999();
					Static558.anInt9502 = 11;
				}
				if (Static558.anInt9502 == 11) {
					if (Static52.aClass64_1.method1820(Static462.anInt8534)) {
						Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, Static462.anInt8534);
						Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
						Static558.anInt9502 = 0;
						local174 = Static462.anInt8534;
						Static554.method7903(2);
						Static84.method1838();
						Static193.method3701(Static345.aClass6_Sub26_Sub2_1);
						Static335.anInt6221 = -1;
						if (Static180.aClass254_74 == Static150.aClass254_137) {
							Static314.method6696();
						} else {
							Static220.method3992();
						}
						if (local174 != Static345.aClass6_Sub26_Sub2_1.anInt5769) {
							throw new RuntimeException("lswp pos:" + Static345.aClass6_Sub26_Sub2_1.anInt5769 + " psize:" + local174);
						}
						Static180.aClass254_74 = null;
					}
				} else if (Static558.anInt9502 == 15) {
					if (Static462.anInt8534 == -2) {
						if (!Static52.aClass64_1.method1820(2)) {
							return;
						}
						Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 2);
						Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
						Static462.anInt8534 = Static345.aClass6_Sub26_Sub2_1.method4999();
					}
					if (Static52.aClass64_1.method1820(Static462.anInt8534)) {
						Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, Static462.anInt8534);
						Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
						Static558.anInt9502 = 0;
						local174 = Static462.anInt8534;
						Static554.method7903(15);
						Static364.method6159();
						Static193.method3701(Static345.aClass6_Sub26_Sub2_1);
						if (Static345.aClass6_Sub26_Sub2_1.anInt5769 != local174) {
							throw new RuntimeException("lswpr pos:" + Static345.aClass6_Sub26_Sub2_1.anInt5769 + " psize:" + local174);
						}
						Static180.aClass254_74 = null;
					}
				}
			} else if (Static52.aClass64_1.method1820(1)) {
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				Static525.anInt9113 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
				Static558.anInt9502 = 10;
			}
		} catch (@Pc(1596) IOException local1596) {
			if (Static52.aClass64_1 != null) {
				Static52.aClass64_1.method1812();
				Static52.aClass64_1 = null;
			}
			if (Static569.anInt9617 >= 2) {
				Static558.anInt9502 = 0;
				Static554.method7903(-4);
				Static418.method1818();
			} else {
				if (Static49.anInt1353 == 2 || Static49.anInt1353 == 3) {
					Static293.aClass275_2.method6665();
				} else {
					Static267.aClass275_1.method6665();
				}
				Static569.anInt9617++;
				Static436.anInt7961 = 0;
				Static558.anInt9502 = 1;
			}
		}
	}
}
