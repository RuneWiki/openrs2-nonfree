import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
	public static int anInt4185;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
	public static int anInt4182 = 0;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_140 = new Class18(46, 3);

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	public static final int anInt4190 = 0;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
	public static int anInt4193 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)Z")
	public static boolean method3867(@OriginalArg(1) int arg0) {
		return arg0 == 13 || arg0 == 2 || arg0 == 1004 || arg0 == 57 || arg0 == 50;
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V")
	public static void method3869() {
		Static133.method2725(Static243.aClass112_15);
		Static311.anInt5651++;
		if (Static291.aBoolean429 && Static224.aBoolean333) {
			@Pc(26) int local26 = Static164.aClass142_1.method4911();
			@Pc(30) int local30 = Static164.aClass142_1.method4915();
			local26 -= Static8.anInt235;
			local30 -= Static325.anInt5184;
			@Pc(51) int local51;
			@Pc(55) int local55;
			if (Static311.anInt5651 > Static243.aClass112_15.anInt3382) {
				local51 = local26 - Static146.anInt6824;
				local55 = local30 - Static130.anInt2824;
				if (local51 > Static243.aClass112_15.anInt3414 || local51 < -Static243.aClass112_15.anInt3414 || local55 > Static243.aClass112_15.anInt3414 || -Static243.aClass112_15.anInt3414 > local55) {
					Static359.aBoolean506 = true;
				}
			}
			if (Static353.anInt6596 > local26) {
				local26 = Static353.anInt6596;
			}
			if (Static293.anInt4950 > local30) {
				local30 = Static293.anInt4950;
			}
			if (local26 + Static243.aClass112_15.anInt3381 > Static353.anInt6596 + Static110.aClass112_8.anInt3381) {
				local26 = Static353.anInt6596 + Static110.aClass112_8.anInt3381 - Static243.aClass112_15.anInt3381;
			}
			if (local30 + Static243.aClass112_15.anInt3444 > Static110.aClass112_8.anInt3444 + Static293.anInt4950) {
				local30 = Static293.anInt4950 + Static110.aClass112_8.anInt3444 - Static243.aClass112_15.anInt3444;
			}
			local51 = local26 + Static110.aClass112_8.anInt3372 - Static353.anInt6596;
			local55 = Static110.aClass112_8.anInt3419 + local30 - Static293.anInt4950;
			@Pc(158) Class1_Sub35 local158;
			if (Static243.aClass112_15.anObjectArray8 != null && Static359.aBoolean506) {
				local158 = new Class1_Sub35();
				local158.anObjectArray34 = Static243.aClass112_15.anObjectArray8;
				local158.anInt5223 = local55;
				local158.anInt5222 = local51;
				local158.aClass112_16 = Static243.aClass112_15;
				Static302.method5243(local158);
			}
			if (!Static164.aClass142_1.method4913()) {
				if (Static359.aBoolean506) {
					if (Static243.aClass112_15.anObjectArray3 != null) {
						local158 = new Class1_Sub35();
						local158.aClass112_16 = Static243.aClass112_15;
						local158.aClass112_17 = Static128.aClass112_21;
						local158.anInt5222 = local51;
						local158.anInt5223 = local55;
						local158.anObjectArray34 = Static243.aClass112_15.anObjectArray3;
						Static302.method5243(local158);
					}
					if (Static128.aClass112_21 != null && Static44.method1081(Static243.aClass112_15) != null) {
						Static86.method1809(Static243.aClass112_15, Static128.aClass112_21);
					}
				} else if ((Static349.anInt6554 == 1 || Static186.method3504()) && Static224.anInt4512 > 2) {
					Static82.method1767(Static325.anInt5184 + Static130.anInt2824, Static146.anInt6824 + Static8.anInt235, 2);
				} else if (Static195.method3640()) {
					Static82.method1767(Static130.anInt2824 + Static325.anInt5184, Static146.anInt6824 + Static8.anInt235, 0);
				}
				Static243.aClass112_15 = null;
			}
		} else if (Static311.anInt5651 > 1) {
			Static243.aClass112_15 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!va;Lclient!va;IIIIIZ)V")
	public static void method3870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub2_Sub6 arg2, @OriginalArg(3) Class11_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2.method5886();
		if (local7 == -1) {
			return;
		}
		@Pc(25) Class4 local25 = (Class4) Static219.aClass21_119.method854((long) local7);
		if (local25 == null) {
			@Pc(32) Class201[] local32 = Static382.method5434(Static280.aClass30_83, local7);
			if (local32 == null) {
				return;
			}
			local25 = Static9.aClass63_1.method4589(local32[0]);
			Static219.aClass21_119.method843(local25, (long) local7);
		}
		Static204.method3760(arg3.method5894() * 64, arg5 >> 1, arg6 >> 1, arg3.anInt6729, arg3.anInt6726, 0, arg3.aByte79);
		@Pc(78) int local78 = Static168.anIntArray261[0] + arg0 - 18;
		@Pc(86) int local86 = local78 + arg1 / 4 * 18;
		@Pc(96) int local96 = Static168.anIntArray261[1] + arg4 - 54 - 16;
		@Pc(104) int local104 = local96 + arg1 % 4 * 18;
		local25.method5948(local86, local104);
		if (arg2 == arg3) {
			Static9.aClass63_1.method4577(18, local86 - 1, -256, 18, local104 - 1);
		}
		@Pc(126) Class32_Sub6 local126 = Static270.method4844();
		local126.anInt5679 = local104 + 16;
		local126.anInt5676 = local86 + 16;
		local126.anInt5675 = local104;
		local126.anInt5677 = local86;
		local126.aClass11_Sub2_Sub6_1 = arg2;
		Static16.aClass195_1.method5300(local126);
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
	public static void method3871() {
		if (Static166.anInt3465 > 0) {
			Static166.anInt3465--;
		}
		if (Static133.anInt2883 > 1) {
			Static133.anInt2883--;
			Static264.anInt5206 = Static356.anInt6822;
		}
		if (Static301.aBoolean434) {
			Static301.aBoolean434 = false;
			Static228.method4268();
			return;
		}
		if (!Static217.aBoolean322) {
			Static284.method5722();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static138.method2792(); local36++) {
		}
		if (Static13.anInt334 != 30) {
			return;
		}
		Static6.method276(Static89.aClass18_71.method697(), Static339.aClass1_Sub7_Sub2_4);
		if (Static285.aClass1_Sub12_2 == null) {
			if (Static183.method3462() >= Static153.aLong113) {
				Static285.aClass1_Sub12_2 = Static149.aClass117_1.method3399(Static306.aString53);
			}
		} else if (Static285.aClass1_Sub12_2.anInt930 != -1) {
			Static280.method5009(Static155.aClass18_104);
			Static339.aClass1_Sub7_Sub2_4.method2144(Static285.aClass1_Sub12_2.anInt930);
			Static285.aClass1_Sub12_2 = null;
			Static153.aLong113 = Static183.method3462() + 30000L;
		}
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(157) int local157;
		@Pc(170) boolean local170;
		@Pc(218) int local218;
		@Pc(225) int local225;
		@Pc(236) int local236;
		if (Static189.aClass1_Sub8_1 != null || Static77.aLong64 < Static183.method3462() - 2000L) {
			@Pc(111) boolean local111 = false;
			local114 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
			for (@Pc(119) Class1_Sub8 local119 = (Class1_Sub8) Static355.aClass42_45.method1543(); local119 != null && Static339.aClass1_Sub7_Sub2_4.anInt2219 - local114 < 240; local119 = (Class1_Sub8) Static355.aClass42_45.method1551()) {
				local119.method6045();
				local137 = local119.method596();
				if (local137 < 0) {
					local137 = 0;
				} else if (local137 > 65534) {
					local137 = 65534;
				}
				local157 = local119.method593();
				if (local157 < 0) {
					local157 = 0;
				} else if (local157 > 65534) {
					local157 = 65534;
				}
				local170 = false;
				if (local119.method596() == -1 && local119.method593() == -1) {
					local137 = -1;
					local170 = true;
					local157 = -1;
				}
				if (local157 != Static285.anInt4724 || local137 != Static213.anInt4277) {
					if (!local111) {
						Static280.method5009(Static188.aClass18_122);
						Static339.aClass1_Sub7_Sub2_4.method2121(0);
						local111 = true;
						local114 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
					}
					local218 = local157 - Static285.anInt4724;
					Static285.anInt4724 = local157;
					local225 = local137 - Static213.anInt4277;
					Static213.anInt4277 = local137;
					local236 = (int) ((local119.method595() - Static77.aLong64) / 20L);
					if (local236 < 8 && local218 >= -32 && local218 <= 31 && local225 >= -32 && local225 <= 31) {
						local218 += 32;
						local225 += 32;
						Static339.aClass1_Sub7_Sub2_4.method2144(local225 + (local236 << 12) + (local218 << 6));
					} else if (local236 < 32 && local218 >= -128 && local218 <= 127 && local225 >= -128 && local225 <= 127) {
						local225 += 128;
						Static339.aClass1_Sub7_Sub2_4.method2121(local236 + 128);
						local218 += 128;
						Static339.aClass1_Sub7_Sub2_4.method2144((local218 << 8) + local225);
					} else if (local236 < 32) {
						Static339.aClass1_Sub7_Sub2_4.method2121(local236 + 192);
						if (local170) {
							Static339.aClass1_Sub7_Sub2_4.method2115(Integer.MIN_VALUE);
						} else {
							Static339.aClass1_Sub7_Sub2_4.method2115(local157 | local137 << 16);
						}
					} else {
						Static339.aClass1_Sub7_Sub2_4.method2144(local236 + 57344);
						if (local170) {
							Static339.aClass1_Sub7_Sub2_4.method2115(Integer.MIN_VALUE);
						} else {
							Static339.aClass1_Sub7_Sub2_4.method2115(local157 | local137 << 16);
						}
					}
					Static77.aLong64 = local119.method595();
				}
			}
			if (local111) {
				Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local114);
			}
		}
		@Pc(405) int local405;
		@Pc(446) int local446;
		if (Static189.aClass1_Sub8_1 != null) {
			@Pc(389) long local389 = (Static189.aClass1_Sub8_1.method595() - Static19.aLong19) / 50L;
			if (local389 > 32767L) {
				local389 = 32767L;
			}
			Static19.aLong19 = Static189.aClass1_Sub8_1.method595();
			local405 = Static189.aClass1_Sub8_1.method596();
			if (local405 < 0) {
				local405 = 0;
			} else if (local405 > 65535) {
				local405 = 65535;
			}
			local137 = Static189.aClass1_Sub8_1.method593();
			if (local137 < 0) {
				local137 = 0;
			} else if (local137 > 65535) {
				local137 = 65535;
			}
			@Pc(436) byte local436 = 0;
			if (Static189.aClass1_Sub8_1.method598() == 2) {
				local436 = 1;
			}
			local446 = (int) local389;
			Static280.method5009(Static232.aClass18_157);
			Static339.aClass1_Sub7_Sub2_4.method2155(local137 | local405 << 16);
			Static339.aClass1_Sub7_Sub2_4.method2101(local436 << 15 | local446);
		}
		@Pc(476) int local476;
		if (Static27.anInt619 > 0) {
			local476 = 0;
			for (local114 = 0; local114 < Static27.anInt619; local114++) {
				if (Static204.aClass159Array1[local114].method4334()) {
					local476++;
				}
			}
			if (local476 > 0) {
				Static280.method5009(Static79.aClass18_58);
				if (local476 > 75) {
					local476 = 75;
				}
				Static339.aClass1_Sub7_Sub2_4.method2121(local476 * 3);
				for (local405 = 0; local405 < Static27.anInt619; local405++) {
					@Pc(525) Class159 local525 = Static204.aClass159Array1[local405];
					if (local525.method4334()) {
						@Pc(537) long local537 = (local525.method4335() - Static219.aLong157) / 50L;
						if (local537 > 65535L) {
							local537 = 65535L;
						}
						Static219.aLong157 = local525.method4335();
						Static339.aClass1_Sub7_Sub2_4.method2121(local525.method4339());
						Static339.aClass1_Sub7_Sub2_4.method2144((int) local537);
					}
				}
			}
		}
		if (Static291.anInt5640 > 0) {
			Static291.anInt5640--;
		}
		if (Static195.aBoolean294 && Static291.anInt5640 <= 0) {
			Static291.anInt5640 = 20;
			Static195.aBoolean294 = false;
			Static280.method5009(Static212.aClass18_143);
			Static339.aClass1_Sub7_Sub2_4.method2101((int) Static332.aFloat62 >> 3);
			Static339.aClass1_Sub7_Sub2_4.method2138((int) Static357.aFloat76 >> 3);
		}
		if (Static177.aBoolean275 && !Static22.aBoolean498) {
			Static22.aBoolean498 = true;
			Static280.method5009(Static243.aClass18_170);
			Static339.aClass1_Sub7_Sub2_4.method2121(1);
		}
		if (!Static177.aBoolean275 && Static22.aBoolean498) {
			Static22.aBoolean498 = false;
			Static280.method5009(Static243.aClass18_170);
			Static339.aClass1_Sub7_Sub2_4.method2121(0);
		}
		if (!Static307.aBoolean439) {
			Static280.method5009(Static116.aClass18_84);
			Static339.aClass1_Sub7_Sub2_4.method2115(Static104.method2270());
			Static307.aBoolean439 = true;
		}
		if (Static105.aClass155ArrayArrayArray3 != null) {
			if (Static50.anInt1273 == 2) {
				Static123.method2600();
			} else if (Static50.anInt1273 == 3) {
				Static218.method4030();
			}
		}
		if (Static5.aBoolean11) {
			Static5.aBoolean11 = false;
		} else {
			Static294.aFloat58 /= 2.0F;
		}
		if (Static351.aBoolean199) {
			Static351.aBoolean199 = false;
		} else {
			Static118.aFloat22 /= 2.0F;
		}
		Static230.method1869();
		if (Static13.anInt334 != 30) {
			return;
		}
		Static215.method3983();
		Static62.method1473();
		Static137.method2771();
		Static16.anInt401++;
		if (Static16.anInt401 > 750) {
			Static228.method4268();
			return;
		}
		Static74.method1621();
		Static194.method3631();
		Static296.method5176();
		for (local476 = Static34.method881(true); local476 != -1; local476 = Static34.method881(false)) {
			Static41.method955(local476);
			Static1.anIntArray1[Static120.anInt2628++ & 0x1F] = local476;
		}
		@Pc(813) Class112 local813;
		for (@Pc(765) Class1_Sub4_Sub17 local765 = Static24.method609(); local765 != null; local765 = Static24.method609()) {
			local405 = local765.method3478();
			local137 = local765.method3476();
			if (local405 == 1) {
				Static7.anIntArray24[local137] = local765.anInt3727;
				Static174.aBoolean271 |= Static237.aBooleanArray11[local137];
				Static162.anIntArray243[Static294.anInt5666++ & 0x1F] = local137;
			} else if (local405 == 2) {
				Static304.aStringArray37[local137] = local765.aString34;
				Static165.anIntArray254[Static138.anInt2974++ & 0x1F] = local137;
			} else if (local405 == 3) {
				local813 = Static188.method3536(local137);
				if (!local765.aString34.equals(local813.aString28)) {
					local813.aString28 = local765.aString34;
					Static133.method2725(local813);
				}
			} else if (local405 == 4) {
				local813 = Static188.method3536(local137);
				local446 = local765.anInt3727;
				local218 = local765.anInt3725;
				local225 = local765.anInt3724;
				if (local446 != local813.anInt3438 || local218 != local813.anInt3440 || local813.anInt3384 != local225) {
					local813.anInt3438 = local446;
					local813.anInt3440 = local218;
					local813.anInt3384 = local225;
					Static133.method2725(local813);
				}
			} else if (local405 == 5) {
				local813 = Static188.method3536(local137);
				if (local765.anInt3727 != local813.anInt3387 || local765.anInt3727 == -1) {
					local813.anInt3409 = 0;
					local813.anInt3441 = 1;
					local813.anInt3387 = local765.anInt3727;
					local813.anInt3407 = 0;
					Static133.method2725(local813);
				}
			} else if (local405 == 6) {
				local157 = local765.anInt3727;
				local446 = local157 >> 10 & 0x1F;
				local218 = local157 >> 5 & 0x1F;
				local225 = local157 & 0x1F;
				local236 = (local225 << 3) + (local218 << 11) + (local446 << 19);
				@Pc(909) Class112 local909 = Static188.method3536(local137);
				if (local236 != local909.anInt3415) {
					local909.anInt3415 = local236;
					Static133.method2725(local909);
				}
			} else if (local405 == 7) {
				local813 = Static188.method3536(local137);
				local170 = local765.anInt3727 == 1;
				if (local813.aBoolean232 != local170) {
					local813.aBoolean232 = local170;
					Static133.method2725(local813);
				}
			} else if (local405 == 8) {
				local813 = Static188.method3536(local137);
				if (local813.anInt3367 != local765.anInt3727 || local765.anInt3725 != local813.anInt3371 || local813.anInt3445 != local765.anInt3724) {
					local813.anInt3371 = local765.anInt3725;
					local813.anInt3445 = local765.anInt3724;
					local813.anInt3367 = local765.anInt3727;
					if (local813.anInt3451 != -1) {
						if (local813.anInt3431 > 0) {
							local813.anInt3445 = local813.anInt3445 * 32 / local813.anInt3431;
						} else if (local813.anInt3447 > 0) {
							local813.anInt3445 = local813.anInt3445 * 32 / local813.anInt3447;
						}
					}
					Static133.method2725(local813);
				}
			} else if (local405 == 9) {
				local813 = Static188.method3536(local137);
				if (local813.anInt3451 != local765.anInt3727 || local765.anInt3725 != local813.anInt3432) {
					local813.anInt3432 = local765.anInt3725;
					local813.anInt3451 = local765.anInt3727;
					Static133.method2725(local813);
				}
			} else if (local405 == 10) {
				local813 = Static188.method3536(local137);
				if (local765.anInt3727 != local813.anInt3425 || local813.anInt3391 != local765.anInt3725 || local813.anInt3426 != local765.anInt3724) {
					local813.anInt3425 = local765.anInt3727;
					local813.anInt3426 = local765.anInt3724;
					local813.anInt3391 = local765.anInt3725;
					Static133.method2725(local813);
				}
			} else if (local405 == 11) {
				local813 = Static188.method3536(local137);
				local813.anInt3408 = local813.anInt3375 = local765.anInt3727;
				local813.aByte21 = 0;
				local813.anInt3450 = local813.anInt3416 = local765.anInt3725;
				local813.aByte23 = 0;
				Static133.method2725(local813);
			} else if (local405 == 12) {
				local813 = Static188.method3536(local137);
				local446 = local765.anInt3727;
				if (local813 != null && local813.anInt3373 == 0) {
					if (local813.anInt3427 - local813.anInt3444 < local446) {
						local446 = local813.anInt3427 - local813.anInt3444;
					}
					if (local446 < 0) {
						local446 = 0;
					}
					if (local446 != local813.anInt3419) {
						local813.anInt3419 = local446;
						Static133.method2725(local813);
					}
				}
			} else if (local405 == 14) {
				local813 = Static188.method3536(local137);
				local813.anInt3369 = local765.anInt3727;
			} else if (local405 == 15) {
				Static97.anInt2177 = local765.anInt3725;
				Static237.anInt2678 = local765.anInt3727;
				Static361.aBoolean508 = true;
			} else if (local405 == 16) {
				local813 = Static188.method3536(local137);
				local813.anInt3379 = local765.anInt3727;
			}
		}
		Static217.anInt4314++;
		if (Static146.anInt6825 != 0) {
			Static87.anInt1925 += 20;
			if (Static87.anInt1925 >= 400) {
				Static146.anInt6825 = 0;
			}
		}
		if (Static12.aClass112_1 != null) {
			Static288.anInt5578++;
			if (Static288.anInt5578 >= 15) {
				Static133.method2725(Static12.aClass112_1);
				Static12.aClass112_1 = null;
			}
		}
		Static135.aClass112_10 = null;
		Static291.aBoolean429 = false;
		Static128.aClass112_21 = null;
		Static224.aBoolean333 = false;
		Static143.method2851(-1, -1, null);
		Static113.method2409(-1, null, -1);
		Static144.method2857();
		Static356.anInt6822++;
		if (Static51.aBoolean89) {
			Static280.method5009(Static351.aClass18_89);
			Static339.aClass1_Sub7_Sub2_4.method2155(Static277.anInt5393 << 14 | Static31.anInt787 << 28 | Static89.anInt1986);
			Static51.aBoolean89 = false;
		}
		while (true) {
			@Pc(1398) Class1_Sub35 local1398;
			@Pc(1403) Class112 local1403;
			do {
				local1398 = (Class1_Sub35) Static180.aClass42_31.method1541();
				if (local1398 == null) {
					while (true) {
						do {
							local1398 = (Class1_Sub35) Static154.aClass42_17.method1541();
							if (local1398 == null) {
								while (true) {
									do {
										local1398 = (Class1_Sub35) Static215.aClass42_37.method1541();
										if (local1398 == null) {
											if (Static135.aClass112_10 == null) {
												Static313.anInt6023 = 0;
											}
											if (Static243.aClass112_15 != null) {
												method3869();
											}
											if (Static110.anInt2477 > 0 && Static271.aClass60_2.method1863(82) && Static271.aClass60_2.method1863(81) && Static140.anInt3024 != 0) {
												local405 = Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 - Static140.anInt3024;
												if (local405 < 0) {
													local405 = 0;
												} else if (local405 > 3) {
													local405 = 3;
												}
												Static344.method4474(Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] + Static50.anInt1271, local405, Static299.anInt4036 + Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
											}
											Static226.method4180();
											for (local405 = 0; local405 < 5; local405++) {
												@Pc(1594) int local1594 = Static113.anIntArray188[local405]++;
											}
											if (Static174.aBoolean271 && Static123.aLong98 < Static183.method3462() - 60000L) {
												Static344.method4471();
											}
											Static121.anInt2632++;
											if (Static121.anInt2632 > 500) {
												Static121.anInt2632 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x2) == 2) {
													Static315.anInt5994 += Static240.anInt4897;
												}
												if ((local137 & 0x1) == 1) {
													Static255.anInt5175 += Static217.anInt4331;
												}
												if ((local137 & 0x4) == 4) {
													Static38.anInt944 += Static193.anInt3885;
												}
											}
											if (Static255.anInt5175 < -50) {
												Static217.anInt4331 = 2;
											}
											if (Static315.anInt5994 < -55) {
												Static240.anInt4897 = 2;
											}
											if (Static255.anInt5175 > 50) {
												Static217.anInt4331 = -2;
											}
											if (Static38.anInt944 < -40) {
												Static193.anInt3885 = 1;
											}
											if (Static315.anInt5994 > 55) {
												Static240.anInt4897 = -2;
											}
											Static283.anInt5524++;
											if (Static38.anInt944 > 40) {
												Static193.anInt3885 = -1;
											}
											if (Static283.anInt5524 > 500) {
												Static283.anInt5524 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x1) == 1) {
													Static163.anInt3359 += Static144.anInt3082;
												}
												if ((local137 & 0x2) == 2) {
													Static293.anInt4951 += Static268.anInt5270;
												}
											}
											if (Static163.anInt3359 < -60) {
												Static144.anInt3082 = 2;
											}
											if (Static293.anInt4951 < -20) {
												Static268.anInt5270 = 1;
											}
											if (Static163.anInt3359 > 60) {
												Static144.anInt3082 = -2;
											}
											Static182.anInt3704++;
											if (Static293.anInt4951 > 10) {
												Static268.anInt5270 = -1;
											}
											if (Static182.anInt3704 > 50) {
												Static280.method5009(Static195.aClass18_126);
											}
											if (Static254.aBoolean383) {
												Static137.method2773();
												Static254.aBoolean383 = false;
											}
											try {
												if (Static165.aClass76_2 != null && Static339.aClass1_Sub7_Sub2_4.anInt2219 > 0) {
													Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
													Static182.anInt3704 = 0;
													Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
													return;
												}
												return;
											} catch (@Pc(1794) IOException local1794) {
												Static228.method4268();
												return;
											}
										}
										local1403 = local1398.aClass112_16;
										if (local1403.anInt3398 < 0) {
											break;
										}
										local813 = Static188.method3536(local1403.anInt3428);
									} while (local813 == null || local813.aClass112Array2 == null || local1403.anInt3398 >= local813.aClass112Array2.length || local813.aClass112Array2[local1403.anInt3398] != local1403);
									Static302.method5243(local1398);
								}
							}
							local1403 = local1398.aClass112_16;
							if (local1403.anInt3398 < 0) {
								break;
							}
							local813 = Static188.method3536(local1403.anInt3428);
						} while (local813 == null || local813.aClass112Array2 == null || local813.aClass112Array2.length <= local1403.anInt3398 || local1403 != local813.aClass112Array2[local1403.anInt3398]);
						Static302.method5243(local1398);
					}
				}
				local1403 = local1398.aClass112_16;
				if (local1403.anInt3398 < 0) {
					break;
				}
				local813 = Static188.method3536(local1403.anInt3428);
			} while (local813 == null || local813.aClass112Array2 == null || local1403.anInt3398 >= local813.aClass112Array2.length || local1403 != local813.aClass112Array2[local1403.anInt3398]);
			Static302.method5243(local1398);
		}
	}
}
