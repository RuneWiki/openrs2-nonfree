import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[Lclient!kc;")
	public static Class131[] aClass131Array1;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!la;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_22 = new Class107(93, 12);

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public static int anInt585 = 0;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_2 = new Class204(7, 0, 1, 1);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg0 < 1 || Static195.anInt3537 - 2 < arg6 || arg0 > Static118.anInt2419 - 2) {
			return;
		}
		@Pc(34) int local34 = arg2;
		if (arg2 < 3 && Static87.method1622(arg6, arg0)) {
			local34 = arg2 + 1;
		}
		if (!Static38.aClass135_Sub1_1.method4244(Static143.anInt2766) && !Static412.method5522(arg6, local34, Static170.anInt3116, arg0)) {
			return;
		}
		if (client.lb == null) {
			return;
		}
		Static74.aClass14_Sub1_3.method3006(arg6, Static415.aClass39_11, arg2, arg0, arg7, Static125.aClass188Array1[arg2]);
		if (arg5 < 0) {
			return;
		}
		@Pc(80) boolean local80 = Static38.aClass135_Sub1_1.aBoolean356;
		Static38.aClass135_Sub1_1.aBoolean356 = true;
		Static74.aClass14_Sub1_3.method3012(arg1, arg4, local34, arg3, Static125.aClass188Array1[arg2], arg0, Static415.aClass39_11, arg6, arg5, arg2);
		Static38.aClass135_Sub1_1.aBoolean356 = local80;
		return;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public static void method559() {
		if (Static425.anInt6874 > 1) {
			Static433.anInt7017 = Static319.anInt4221;
			Static425.anInt6874--;
		}
		if (Static264.anInt4690 > 0) {
			Static264.anInt4690--;
		}
		if (Static418.aBoolean473) {
			Static418.aBoolean473 = false;
			Static276.method4032();
			return;
		}
		if (!Static385.aBoolean436) {
			Static220.method3399();
		}
		for (@Pc(37) int local37 = 0; local37 < 100 && Static58.method1257(); local37++) {
		}
		if (Static342.anInt5771 != 9) {
			return;
		}
		Static74.method1495(Static324.aClass179_68.method4060(), Static92.aClass1_Sub5_Sub1_1);
		if (Static171.aClass1_Sub39_1 == null) {
			if (Static115.aLong80 <= Static279.method4058()) {
				Static171.aClass1_Sub39_1 = Static9.aClass69_3.method1878(Static451.aClass209_5.aString60);
			}
		} else if (Static171.aClass1_Sub39_1.anInt6016 != -1) {
			Static193.method2984(Static280.aClass179_56);
			Static92.aClass1_Sub5_Sub1_1.method5393(Static171.aClass1_Sub39_1.anInt6016);
			Static171.aClass1_Sub39_1 = null;
			Static115.aLong80 = Static279.method4058() + 30000L;
		}
		@Pc(106) Class1_Sub7 local106 = (Class1_Sub7) Static447.aClass181_64.method4112();
		@Pc(124) int local124;
		@Pc(149) int local149;
		@Pc(166) int local166;
		@Pc(181) boolean local181;
		@Pc(231) int local231;
		@Pc(237) int local237;
		@Pc(248) int local248;
		if (local106 != null || Static451.aLong219 < Static279.method4058() - 2000L) {
			@Pc(121) boolean local121 = false;
			local124 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
			for (@Pc(129) Class1_Sub7 local129 = (Class1_Sub7) Static231.aClass181_65.method4112(); local129 != null && Static92.aClass1_Sub5_Sub1_1.anInt6475 - local124 < 240; local129 = (Class1_Sub7) Static231.aClass181_65.method4104()) {
				local129.method6020();
				local149 = local129.method3632();
				if (local149 < 0) {
					local149 = 0;
				} else if (local149 > 65534) {
					local149 = 65534;
				}
				local166 = local129.method3633();
				if (local166 < 0) {
					local166 = 0;
				} else if (local166 > 65534) {
					local166 = 65534;
				}
				local181 = false;
				if (local129.method3632() == -1 && local129.method3633() == -1) {
					local181 = true;
					local166 = -1;
					local149 = -1;
				}
				if (Static400.anInt6417 != local166 || Static249.anInt4553 != local149) {
					if (!local121) {
						Static193.method2984(Static138.aClass179_82);
						Static92.aClass1_Sub5_Sub1_1.method5396(0);
						local121 = true;
						local124 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
					}
					local231 = local166 - Static400.anInt6417;
					Static400.anInt6417 = local166;
					local237 = local149 - Static249.anInt4553;
					Static249.anInt4553 = local149;
					local248 = (int) ((local129.method3630() - Static451.aLong219) / 20L);
					if (local248 < 8 && local231 >= -32 && local231 <= 31 && local237 >= -32 && local237 <= 31) {
						local237 += 32;
						local231 += 32;
						Static92.aClass1_Sub5_Sub1_1.method5393(local237 + (local248 << 12) + (local231 << 6));
					} else if (local248 < 32 && local231 >= -128 && local231 <= 127 && local237 >= -128 && local237 <= 127) {
						local237 += 128;
						Static92.aClass1_Sub5_Sub1_1.method5396(local248 + 128);
						local231 += 128;
						Static92.aClass1_Sub5_Sub1_1.method5393(local237 + (local231 << 8));
					} else if (local248 >= 32) {
						Static92.aClass1_Sub5_Sub1_1.method5393(local248 + 57344);
						if (local181) {
							Static92.aClass1_Sub5_Sub1_1.method5417(Integer.MIN_VALUE);
						} else {
							Static92.aClass1_Sub5_Sub1_1.method5417(local149 << 16 | local166);
						}
					} else {
						Static92.aClass1_Sub5_Sub1_1.method5396(local248 + 192);
						if (local181) {
							Static92.aClass1_Sub5_Sub1_1.method5417(Integer.MIN_VALUE);
						} else {
							Static92.aClass1_Sub5_Sub1_1.method5417(local166 | local149 << 16);
						}
					}
					Static451.aLong219 = local129.method3630();
				}
			}
			if (local121) {
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local124);
			}
		}
		@Pc(429) int local429;
		@Pc(476) int local476;
		if (local106 != null) {
			@Pc(413) long local413 = (local106.method3630() - Static429.aLong209) / 50L;
			if (local413 > 32767L) {
				local413 = 32767L;
			}
			Static429.aLong209 = local106.method3630();
			local429 = local106.method3632();
			if (local429 < 0) {
				local429 = 0;
			} else if (local429 > 65535) {
				local429 = 65535;
			}
			local149 = local106.method3633();
			if (local149 < 0) {
				local149 = 0;
			} else if (local149 > 65535) {
				local149 = 65535;
			}
			@Pc(459) byte local459 = 0;
			if (local106.method3628() == 2) {
				local459 = 1;
			}
			Static193.method2984(Static323.aClass179_66);
			local476 = (int) local413;
			Static92.aClass1_Sub5_Sub1_1.method5359(local476 | local459 << 15);
			Static92.aClass1_Sub5_Sub1_1.method5417(local429 << 16 | local149);
		}
		@Pc(500) int local500;
		if (Static150.anInt2864 > 0) {
			local500 = 0;
			for (local124 = 0; local124 < Static150.anInt2864; local124++) {
				if (Static344.aClass250Array1[local124].method5638()) {
					local500++;
				}
			}
			if (local500 > 0) {
				if (local500 > 75) {
					local500 = 75;
				}
				Static193.method2984(Static336.aClass179_70);
				Static92.aClass1_Sub5_Sub1_1.method5396(local500 * 3);
				for (local429 = 0; local429 < Static150.anInt2864; local429++) {
					@Pc(549) Class250 local549 = Static344.aClass250Array1[local429];
					if (local549.method5638()) {
						@Pc(562) long local562 = (local549.method5640() - Static174.aLong105) / 50L;
						if (local562 > 65535L) {
							local562 = 65535L;
						}
						Static174.aLong105 = local549.method5640();
						Static92.aClass1_Sub5_Sub1_1.method5396(local549.method5639());
						Static92.aClass1_Sub5_Sub1_1.method5393((int) local562);
					}
				}
			}
		}
		if (Static325.anInt5554 > 0) {
			Static325.anInt5554--;
		}
		if (Static84.aBoolean109 && Static325.anInt5554 <= 0) {
			Static325.anInt5554 = 20;
			Static84.aBoolean109 = false;
			Static193.method2984(Static389.aClass179_81);
			Static92.aClass1_Sub5_Sub1_1.method5393((int) Static142.aFloat89 >> 3);
			Static92.aClass1_Sub5_Sub1_1.method5393((int) Static201.aFloat56 >> 3);
		}
		if (Static289.aBoolean418 && !Static331.aBoolean497) {
			Static331.aBoolean497 = true;
			Static193.method2984(Static323.aClass179_67);
			Static92.aClass1_Sub5_Sub1_1.method5396(1);
		}
		if (!Static289.aBoolean418 && Static331.aBoolean497) {
			Static331.aBoolean497 = false;
			Static193.method2984(Static323.aClass179_67);
			Static92.aClass1_Sub5_Sub1_1.method5396(0);
		}
		if (!Static77.aBoolean102) {
			Static193.method2984(Static68.aClass179_12);
			Static92.aClass1_Sub5_Sub1_1.method5396(0);
			local500 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
			@Pc(703) Class1_Sub5 local703 = Static38.aClass135_Sub1_1.method4238();
			Static92.aClass1_Sub5_Sub1_1.method5367(local703.aByteArray89, local703.anInt6475);
			Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local500);
			Static77.aBoolean102 = true;
		}
		if (client.lb != null) {
			if (Static345.anInt5797 == 2) {
				Static246.method4279();
			} else if (Static345.anInt5797 == 3) {
				Static182.method2891();
			}
		}
		if (Static388.aBoolean439) {
			Static388.aBoolean439 = false;
		} else {
			Static316.aFloat76 /= 2.0F;
		}
		if (Static88.aBoolean115) {
			Static88.aBoolean115 = false;
		} else {
			Static245.aFloat66 /= 2.0F;
		}
		Static109.method1976();
		if (Static342.anInt5771 != 9) {
			return;
		}
		Static191.method2972();
		Static187.method2935();
		Static364.method4981();
		Static437.method3291();
		Static126.anInt2566++;
		if (Static126.anInt2566 > 750) {
			Static276.method4032();
			return;
		}
		Static387.method5220();
		Static328.method4663();
		Static93.method1689();
		for (local500 = Static394.aClass23_1.method605(true); local500 != -1; local500 = Static394.aClass23_1.method605(false)) {
			Static32.method606(local500);
			Static194.anIntArray307[Static183.anInt3335++ & 0x1F] = local500;
		}
		@Pc(851) Class251 local851;
		for (@Pc(828) Class1_Sub2_Sub6 local828 = Static141.method2349(); local828 != null; local828 = Static141.method2349()) {
			local429 = local828.method1776();
			local149 = local828.method1781();
			if (local429 == 1) {
				Static266.anIntArray630[local149] = local828.anInt2056;
				Static359.aBoolean414 |= Static32.aBooleanArray1[local149];
				Static320.anIntArray560[Static59.anInt1424++ & 0x1F] = local149;
			} else if (local429 == 2) {
				Static280.aStringArray31[local149] = local828.aString18;
				Static336.anIntArray525[Static5.anInt159++ & 0x1F] = local149;
			} else if (local429 == 3) {
				local851 = Static378.method3544(local149);
				if (!local828.aString18.equals(local851.aString67)) {
					local851.aString67 = local828.aString18;
					Static408.method5469(local851);
				}
			} else if (local429 == 4) {
				local851 = Static378.method3544(local149);
				local476 = local828.anInt2056;
				local231 = local828.anInt2055;
				local237 = local828.anInt2059;
				if (local851.anInt6710 != local476 || local231 != local851.anInt6738 || local237 != local851.anInt6743) {
					local851.anInt6738 = local231;
					local851.anInt6743 = local237;
					local851.anInt6710 = local476;
					Static408.method5469(local851);
				}
			} else if (local429 == 5) {
				local851 = Static378.method3544(local149);
				if (local851.anInt6699 != local828.anInt2056 || local828.anInt2056 == -1) {
					local851.anInt6717 = 0;
					local851.anInt6716 = 1;
					local851.anInt6699 = local828.anInt2056;
					local851.anInt6721 = 0;
					Static408.method5469(local851);
				}
			} else if (local429 == 6) {
				local166 = local828.anInt2056;
				local476 = local166 >> 10 & 0x1F;
				local231 = local166 >> 5 & 0x1F;
				local237 = local166 & 0x1F;
				local248 = (local237 << 3) + (local231 << 11) + (local476 << 19);
				@Pc(1308) Class251 local1308 = Static378.method3544(local149);
				if (local1308.anInt6730 != local248) {
					local1308.anInt6730 = local248;
					Static408.method5469(local1308);
				}
			} else if (local429 == 7) {
				local851 = Static378.method3544(local149);
				local181 = local828.anInt2056 == 1;
				if (local851.aBoolean462 != local181) {
					local851.aBoolean462 = local181;
					Static408.method5469(local851);
				}
			} else if (local429 == 8) {
				local851 = Static378.method3544(local149);
				if (local828.anInt2056 != local851.anInt6724 || local851.anInt6707 != local828.anInt2055 || local851.anInt6706 != local828.anInt2059) {
					local851.anInt6706 = local828.anInt2059;
					local851.anInt6707 = local828.anInt2055;
					local851.anInt6724 = local828.anInt2056;
					if (local851.anInt6704 != -1) {
						if (local851.anInt6680 > 0) {
							local851.anInt6706 = local851.anInt6706 * 32 / local851.anInt6680;
						} else if (local851.anInt6686 > 0) {
							local851.anInt6706 = local851.anInt6706 * 32 / local851.anInt6686;
						}
					}
					Static408.method5469(local851);
				}
			} else if (local429 == 9) {
				local851 = Static378.method3544(local149);
				if (local851.anInt6704 != local828.anInt2056 || local851.anInt6673 != local828.anInt2055) {
					local851.anInt6704 = local828.anInt2056;
					local851.anInt6673 = local828.anInt2055;
					Static408.method5469(local851);
				}
			} else if (local429 == 10) {
				local851 = Static378.method3544(local149);
				if (local851.anInt6711 != local828.anInt2056 || local851.anInt6702 != local828.anInt2055 || local828.anInt2059 != local851.anInt6696) {
					local851.anInt6702 = local828.anInt2055;
					local851.anInt6696 = local828.anInt2059;
					local851.anInt6711 = local828.anInt2056;
					Static408.method5469(local851);
				}
			} else if (local429 == 11) {
				local851 = Static378.method3544(local149);
				local851.aByte95 = 0;
				local851.anInt6690 = local851.anInt6661 = local828.anInt2056;
				local851.aByte93 = 0;
				local851.anInt6723 = local851.anInt6669 = local828.anInt2055;
				Static408.method5469(local851);
			} else if (local429 == 12) {
				local851 = Static378.method3544(local149);
				local476 = local828.anInt2056;
				if (local851 != null && local851.anInt6654 == 0) {
					if (local851.anInt6727 - local851.anInt6677 < local476) {
						local476 = local851.anInt6727 - local851.anInt6677;
					}
					if (local476 < 0) {
						local476 = 0;
					}
					if (local476 != local851.anInt6741) {
						local851.anInt6741 = local476;
						Static408.method5469(local851);
					}
				}
			} else if (local429 == 14) {
				local851 = Static378.method3544(local149);
				local851.anInt6675 = local828.anInt2056;
			} else if (local429 == 15) {
				Static229.aBoolean295 = true;
				Static207.anInt3927 = local828.anInt2055;
				Static414.anInt6715 = local828.anInt2056;
			} else if (local429 == 16) {
				local851 = Static378.method3544(local149);
				local851.anInt6737 = local828.anInt2056;
			}
		}
		Static4.anInt115++;
		if (Static62.anInt1464 != 0) {
			Static47.anInt945 += 20;
			if (Static47.anInt945 >= 400) {
				Static62.anInt1464 = 0;
			}
		}
		if (Static453.aClass251_13 != null) {
			Static440.anInt7079++;
			if (Static440.anInt7079 >= 15) {
				Static408.method5469(Static453.aClass251_13);
				Static453.aClass251_13 = null;
			}
		}
		Static16.aBoolean13 = false;
		Static325.aClass251_9 = null;
		Static312.aClass251_8 = null;
		Static281.aBoolean419 = false;
		Static187.method2936(null, -1, -1);
		Static413.method5646(null, -1, -1);
		if (!Static355.aBoolean412) {
			Static221.anInt2659 = -1;
		}
		Static453.method5942();
		Static319.anInt4221++;
		if (Static409.aBoolean449) {
			Static193.method2984(Static403.aClass179_85);
			Static92.aClass1_Sub5_Sub1_1.method5388(Static34.anInt713 | Static177.anInt3266 << 28 | Static348.anInt5826 << 14);
			Static409.aBoolean449 = false;
		}
		while (true) {
			@Pc(1461) Class1_Sub24 local1461;
			@Pc(1466) Class251 local1466;
			do {
				local1461 = (Class1_Sub24) Static176.aClass181_30.method4109();
				if (local1461 == null) {
					while (true) {
						do {
							local1461 = (Class1_Sub24) Static257.aClass181_47.method4109();
							if (local1461 == null) {
								while (true) {
									do {
										local1461 = (Class1_Sub24) Static249.aClass181_43.method4109();
										if (local1461 == null) {
											if (Static325.aClass251_9 == null) {
												Static34.anInt714 = 0;
											}
											if (Static455.aClass251_14 != null) {
												Static114.method2107();
											}
											if (Static225.anInt4107 > 0 && Static306.aClass155_1.method3516(82) && Static306.aClass155_1.method3516(81) && Static268.anInt4749 != 0) {
												local429 = Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 - Static268.anInt4749;
												if (local429 < 0) {
													local429 = 0;
												} else if (local429 > 3) {
													local429 = 3;
												}
												Static192.method2982(local429, Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] + Static345.anInt5799, Static165.anInt3049 + Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0]);
											}
											Static184.method2899();
											for (local429 = 0; local429 < 5; local429++) {
												@Pc(1661) int local1661 = Static297.anIntArray446[local429]++;
											}
											if (Static359.aBoolean414 && Static209.aLong120 < Static279.method4058() - 60000L) {
												Static89.method1640();
											}
											for (@Pc(1690) Class4_Sub2_Sub2 local1690 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3357(); local1690 != null; local1690 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3360()) {
												if ((long) local1690.anInt1892 < Static279.method4058() / 1000L - 5L) {
													if (local1690.aShort30 > 0) {
														Static378.method3527(local1690.aString15 + Static262.aClass7_109.method331(Static341.anInt5770), 0, "", "", 5);
													}
													if (local1690.aShort30 == 0) {
														Static378.method3527(local1690.aString15 + Static321.aClass7_124.method331(Static341.anInt5770), 0, "", "", 5);
													}
													local1690.method5737();
												}
											}
											Static320.anInt6068++;
											if (Static320.anInt6068 > 500) {
												Static320.anInt6068 = 0;
												local166 = (int) (Math.random() * 8.0D);
												if ((local166 & 0x1) == 1) {
													Static130.anInt2614 += Static186.anInt3377;
												}
												if ((local166 & 0x4) == 4) {
													Static444.anInt7150 += Static135.anInt2707;
												}
												if ((local166 & 0x2) == 2) {
													Static247.anInt7109 += Static439.anInt7056;
												}
											}
											if (Static130.anInt2614 < -50) {
												Static186.anInt3377 = 2;
											}
											if (Static247.anInt7109 < -55) {
												Static439.anInt7056 = 2;
											}
											if (Static130.anInt2614 > 50) {
												Static186.anInt3377 = -2;
											}
											if (Static444.anInt7150 < -40) {
												Static135.anInt2707 = 1;
											}
											if (Static247.anInt7109 > 55) {
												Static439.anInt7056 = -2;
											}
											if (Static444.anInt7150 > 40) {
												Static135.anInt2707 = -1;
											}
											Static215.anInt3998++;
											if (Static215.anInt3998 > 500) {
												Static215.anInt3998 = 0;
												local166 = (int) (Math.random() * 8.0D);
												if ((local166 & 0x1) == 1) {
													Static82.anInt1815 += Static377.anInt6163;
												}
												if ((local166 & 0x2) == 2) {
													Static119.anInt840 += Static436.anInt7050;
												}
											}
											if (Static82.anInt1815 < -60) {
												Static377.anInt6163 = 2;
											}
											if (Static119.anInt840 < -20) {
												Static436.anInt7050 = 1;
											}
											if (Static82.anInt1815 > 60) {
												Static377.anInt6163 = -2;
											}
											if (Static119.anInt840 > 10) {
												Static436.anInt7050 = -1;
											}
											Static245.anInt4501++;
											if (Static245.anInt4501 > 50) {
												Static193.method2984(Static249.aClass179_53);
											}
											if (Static193.aBoolean209) {
												Static250.method3755();
												Static193.aBoolean209 = false;
											}
											try {
												if (Static82.aClass229_1 != null && Static92.aClass1_Sub5_Sub1_1.anInt6475 > 0) {
													Static417.anInt6756 += Static92.aClass1_Sub5_Sub1_1.anInt6475;
													Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, Static92.aClass1_Sub5_Sub1_1.anInt6475);
													Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
													Static245.anInt4501 = 0;
													return;
												}
												return;
											} catch (@Pc(1949) IOException local1949) {
												Static276.method4032();
												return;
											}
										}
										local1466 = local1461.aClass251_5;
										if (local1466.anInt6679 < 0) {
											break;
										}
										local851 = Static378.method3544(local1466.anInt6722);
									} while (local851 == null || local851.aClass251Array2 == null || local851.aClass251Array2.length <= local1466.anInt6679 || local1466 != local851.aClass251Array2[local1466.anInt6679]);
									Static13.method366(local1461);
								}
							}
							local1466 = local1461.aClass251_5;
							if (local1466.anInt6679 < 0) {
								break;
							}
							local851 = Static378.method3544(local1466.anInt6722);
						} while (local851 == null || local851.aClass251Array2 == null || local1466.anInt6679 >= local851.aClass251Array2.length || local1466 != local851.aClass251Array2[local1466.anInt6679]);
						Static13.method366(local1461);
					}
				}
				local1466 = local1461.aClass251_5;
				if (local1466.anInt6679 < 0) {
					break;
				}
				local851 = Static378.method3544(local1466.anInt6722);
			} while (local851 == null || local851.aClass251Array2 == null || local1466.anInt6679 >= local851.aClass251Array2.length || local851.aClass251Array2[local1466.anInt6679] != local1466);
			Static13.method366(local1461);
		}
	}
}
