import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
	public static int anInt3383;

	@OriginalMember(owner = "client!pj", name = "fb", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	public static void method2341() {
		while (true) {
			if (Static108.aClass2_Sub11_Sub1_3.method1588(Static35.anInt838) >= 27) {
				@Pc(21) int local21 = Static108.aClass2_Sub11_Sub1_3.method1584(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static9.aClass7_Sub2_Sub1Array1[local21] == null) {
						Static9.aClass7_Sub2_Sub1Array1[local21] = new Class7_Sub2_Sub1();
						local28 = true;
					}
					@Pc(44) Class7_Sub2_Sub1 local44 = Static9.aClass7_Sub2_Sub1Array1[local21];
					Static199.anIntArray373[Static118.anInt2607++] = local21;
					local44.anInt3043 = Static25.anInt581;
					@Pc(60) int local60 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
					if (local60 == 1) {
						Static187.anIntArray355[Static196.anInt4032++] = local21;
					}
					@Pc(76) int local76 = Static108.aClass2_Sub11_Sub1_3.method1584(5);
					@Pc(83) int local83 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
					if (local76 > 15) {
						local76 -= 32;
					}
					@Pc(94) int local94 = Static185.anIntArray350[Static108.aClass2_Sub11_Sub1_3.method1584(3)];
					if (local28) {
						local44.anInt3098 = local44.anInt3071 = local94;
					}
					local44.aClass2_Sub1_Sub20_1 = Static170.method2500(Static108.aClass2_Sub11_Sub1_3.method1584(14));
					@Pc(117) int local117 = Static108.aClass2_Sub11_Sub1_3.method1584(5);
					local44.anInt3082 = local44.aClass2_Sub1_Sub20_1.anInt3546;
					local44.anInt3068 = local44.aClass2_Sub1_Sub20_1.anInt3564;
					if (local117 > 15) {
						local117 -= 32;
					}
					local44.anInt3048 = local44.aClass2_Sub1_Sub20_1.anInt3558;
					local44.anInt3074 = local44.aClass2_Sub1_Sub20_1.anInt3560;
					local44.anInt3054 = local44.aClass2_Sub1_Sub20_1.anInt3554;
					if (local44.anInt3054 == 0) {
						local44.anInt3071 = 0;
					}
					local44.anInt3095 = local44.aClass2_Sub1_Sub20_1.anInt3541;
					local44.anInt3077 = local44.aClass2_Sub1_Sub20_1.anInt3544;
					local44.anInt3088 = local44.aClass2_Sub1_Sub20_1.anInt3545;
					local44.anInt3072 = local44.aClass2_Sub1_Sub20_1.anInt3543;
					local44.method2176(Static186.aClass7_Sub2_Sub2_1.anIntArray274[0] + local117, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0] + local76, local83 == 1);
					continue;
				}
			}
			Static108.aClass2_Sub11_Sub1_3.method1585();
			return;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!u;I[B)V")
	public static void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class2_Sub26 local3 = new Class2_Sub26();
		local3.aClass98_4 = arg1;
		local3.anInt4228 = 0;
		local3.aByteArray50 = arg2;
		local3.aLong148 = arg0;
		@Pc(22) Class13 local22 = Static115.aClass13_7;
		synchronized (Static115.aClass13_7) {
			Static115.aClass13_7.method304(local3);
		}
		Static140.method2149();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	public static void method2344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static119.anInt2643 = 0;
		@Pc(284) int local284;
		@Pc(203) int local203;
		@Pc(132) int local132;
		for (@Pc(9) int local9 = -1; local9 < Static118.anInt2607 + Static145.anInt3126; local9++) {
			@Pc(28) Class7_Sub2 local28;
			if (local9 == -1) {
				local28 = Static186.aClass7_Sub2_Sub2_1;
			} else if (Static145.anInt3126 > local9) {
				local28 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local9]];
			} else {
				local28 = Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local9 - Static145.anInt3126]];
			}
			if (local28 != null && local28.method2177()) {
				@Pc(58) Class2_Sub1_Sub20 local58;
				if (local28 instanceof Class7_Sub2_Sub1) {
					local58 = ((Class7_Sub2_Sub1) local28).aClass2_Sub1_Sub20_1;
					if (local58.anIntArray304 != null) {
						local58 = local58.method2451();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (Static145.anInt3126 <= local9) {
					local58 = ((Class7_Sub2_Sub1) local28).aClass2_Sub1_Sub20_1;
					if (local58.anIntArray304 != null) {
						local58 = local58.method2451();
					}
					if (local58.anInt3550 >= 0 && local58.anInt3550 < Static40.aClass2_Sub1_Sub2Array4.length) {
						Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() + 15, local28);
						if (Static154.anInt3305 > -1) {
							Static40.aClass2_Sub1_Sub2Array4[local58.anInt3550].method280(arg1 + Static154.anInt3305 - 12, arg0 - -Static22.anInt515 - 30);
						}
					}
					@Pc(130) Class32[] local130 = Static181.aClass32Array1;
					for (local132 = 0; local132 < local130.length; local132++) {
						@Pc(138) Class32 local138 = local130[local132];
						if (local138 != null && local138.anInt1118 == 1 && Static199.anIntArray373[local9 - Static145.anInt3126] == local138.anInt1120 && Static25.anInt581 % 20 < 10) {
							Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() + 15, local28);
							if (Static154.anInt3305 > -1) {
								Static15.aClass2_Sub1_Sub2Array2[local138.anInt1126].method280(Static154.anInt3305 + arg1 - 12, arg0 + Static22.anInt515 + -28);
							}
						}
					}
				} else {
					local203 = 30;
					@Pc(206) Class7_Sub2_Sub2 local206 = (Class7_Sub2_Sub2) local28;
					if (local206.anInt3103 != -1 || local206.anInt3109 != -1) {
						Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() + 15, local28);
						if (Static154.anInt3305 > -1) {
							if (local206.anInt3103 != -1) {
								Static78.aClass2_Sub1_Sub2Array6[local206.anInt3103].method280(arg1 + Static154.anInt3305 - 12, Static22.anInt515 + arg0 + -30);
								local203 += 25;
							}
							if (local206.anInt3109 != -1) {
								Static40.aClass2_Sub1_Sub2Array4[local206.anInt3109].method280(arg1 + Static154.anInt3305 - 12, Static22.anInt515 + arg0 - local203);
								local203 += 25;
							}
						}
					}
					if (local9 >= 0) {
						@Pc(282) Class32[] local282 = Static181.aClass32Array1;
						for (local284 = 0; local284 < local282.length; local284++) {
							@Pc(290) Class32 local290 = local282[local284];
							if (local290 != null && local290.anInt1118 == 10 && Static28.anIntArray60[local9] == local290.anInt1120) {
								Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() + 15, local28);
								if (Static154.anInt3305 > -1) {
									Static15.aClass2_Sub1_Sub2Array2[local290.anInt1126].method280(Static154.anInt3305 + arg1 - 12, Static22.anInt515 + arg0 + -local203);
								}
							}
						}
					}
				}
				if (local28.aClass62_1066 != null && (local9 >= Static145.anInt3126 || Static214.anInt4480 == 0 || Static214.anInt4480 == 3 || Static214.anInt4480 == 1 && Static6.method128(((Class7_Sub2_Sub2) local28).aClass62_1072))) {
					Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172(), local28);
					if (Static154.anInt3305 > -1 && Static101.anInt2311 > Static119.anInt2643) {
						Static101.anIntArray209[Static119.anInt2643] = Static47.aClass2_Sub1_Sub12_3.method1384(local28.aClass62_1066) / 2;
						Static101.anIntArray211[Static119.anInt2643] = Static47.aClass2_Sub1_Sub12_3.anInt2021;
						Static101.anIntArray212[Static119.anInt2643] = Static154.anInt3305;
						Static101.anIntArray213[Static119.anInt2643] = Static22.anInt515;
						Static101.anIntArray214[Static119.anInt2643] = local28.anInt3049;
						Static101.anIntArray208[Static119.anInt2643] = local28.anInt3063;
						Static101.anIntArray207[Static119.anInt2643] = local28.anInt3090;
						Static101.aClass62Array71[Static119.anInt2643] = local28.aClass62_1066;
						Static119.anInt2643++;
					}
				}
				if (local28.anInt3045 > Static25.anInt581) {
					Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() + 15, local28);
					if (Static154.anInt3305 > -1) {
						Static212.method3103(Static154.anInt3305 + arg1 - 15, Static22.anInt515 + -3 + arg0, local28.anInt3065, 5, 65280);
						Static212.method3103(local28.anInt3065 + arg1 + Static154.anInt3305 - 15, arg0 + Static22.anInt515 + -3, 30 - local28.anInt3065, 5, 16711680);
					}
				}
				for (local203 = 0; local203 < 4; local203++) {
					if (local28.anIntArray279[local203] > Static25.anInt581) {
						Static126.method1979(arg2 >> 1, arg3 >> 1, local28.method2172() / 2, local28);
						if (Static154.anInt3305 > -1) {
							if (local203 == 1) {
								Static22.anInt515 -= 20;
							}
							if (local203 == 2) {
								Static154.anInt3305 -= 15;
								Static22.anInt515 -= 10;
							}
							if (local203 == 3) {
								Static22.anInt515 -= 10;
								Static154.anInt3305 += 15;
							}
							Static135.aClass2_Sub1_Sub2Array8[local28.anIntArray278[local203]].method280(arg1 + Static154.anInt3305 - 12, Static22.anInt515 + arg0 - 12);
							Static10.aClass2_Sub1_Sub12_1.method1370(Static119.method1865(local28.anIntArray277[local203]), Static154.anInt3305 + arg1 - 1, Static22.anInt515 + 3 + arg0, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(628) int local628 = 0; local628 < Static119.anInt2643; local628++) {
			local203 = Static101.anIntArray212[local628];
			@Pc(638) int local638 = Static101.anIntArray213[local628];
			local132 = Static101.anIntArray209[local628];
			@Pc(644) boolean local644 = true;
			local284 = Static101.anIntArray211[local628];
			while (local644) {
				local644 = false;
				for (@Pc(654) int local654 = 0; local654 < local628; local654++) {
					if (local638 + 2 > -Static101.anIntArray211[local654] + Static101.anIntArray213[local654] && local638 - local284 < Static101.anIntArray213[local654] + 2 && Static101.anIntArray209[local654] + Static101.anIntArray212[local654] > -local132 + local203 && local132 + local203 > Static101.anIntArray212[local654] + -Static101.anIntArray209[local654] && local638 > Static101.anIntArray213[local654] - Static101.anIntArray211[local654]) {
						local638 = Static101.anIntArray213[local654] - Static101.anIntArray211[local654];
						local644 = true;
					}
				}
			}
			Static154.anInt3305 = Static101.anIntArray212[local628];
			Static22.anInt515 = Static101.anIntArray213[local628] = local638;
			@Pc(750) Class62 local750 = Static101.aClass62Array71[local628];
			if (Static39.anInt4456 == 0) {
				@Pc(767) int local767 = 16776960;
				if (Static101.anIntArray214[local628] < 6) {
					local767 = Static94.anIntArray200[Static101.anIntArray214[local628]];
				}
				if (Static101.anIntArray214[local628] == 6) {
					local767 = Static185.anInt3845 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static101.anIntArray214[local628] == 7) {
					local767 = Static185.anInt3845 % 20 >= 10 ? 65535 : 255;
				}
				if (Static101.anIntArray214[local628] == 8) {
					local767 = Static185.anInt3845 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(842) int local842;
				if (Static101.anIntArray214[local628] == 9) {
					local842 = 150 - Static101.anIntArray207[local628];
					if (local842 < 50) {
						local767 = local842 * 1280 + 16711680;
					} else if (local842 < 100) {
						local767 = 16776960 - (local842 - 50) * 327680;
					} else if (local842 < 150) {
						local767 = (local842 - 100) * 5 + 65280;
					}
				}
				if (Static101.anIntArray214[local628] == 10) {
					local842 = 150 - Static101.anIntArray207[local628];
					if (local842 < 50) {
						local767 = local842 * 5 + 16711680;
					} else if (local842 < 100) {
						local767 = 16711935 - (local842 - 50) * 327680;
					} else if (local842 < 150) {
						local767 = (local842 - 100) * 327680 + 255 - (local842 - 100) * 5;
					}
				}
				if (Static101.anIntArray214[local628] == 11) {
					local842 = 150 - Static101.anIntArray207[local628];
					if (local842 < 50) {
						local767 = 16777215 - local842 * 327685;
					} else if (local842 < 100) {
						local767 = (local842 - 50) * 327685 + 65280;
					} else if (local842 < 150) {
						local767 = 16777215 - (local842 - 100) * 327680;
					}
				}
				if (Static101.anIntArray208[local628] == 0) {
					Static47.aClass2_Sub1_Sub12_3.method1370(local750, Static154.anInt3305 + arg1, Static22.anInt515 + arg0, local767, 0);
				}
				if (Static101.anIntArray208[local628] == 1) {
					Static47.aClass2_Sub1_Sub12_3.method1358(local750, arg1 + Static154.anInt3305, Static22.anInt515 + arg0, local767, Static185.anInt3845);
				}
				if (Static101.anIntArray208[local628] == 2) {
					Static47.aClass2_Sub1_Sub12_3.method1363(local750, Static154.anInt3305 + arg1, arg0 + Static22.anInt515, local767, Static185.anInt3845);
				}
				if (Static101.anIntArray208[local628] == 3) {
					Static47.aClass2_Sub1_Sub12_3.method1381(local750, Static154.anInt3305 + arg1, arg0 + Static22.anInt515, local767, Static185.anInt3845, 150 - Static101.anIntArray207[local628]);
				}
				if (Static101.anIntArray208[local628] == 4) {
					local842 = (150 - Static101.anIntArray207[local628]) * (Static47.aClass2_Sub1_Sub12_3.method1384(local750) + 100) / 150;
					Static212.method3110(arg1 + Static154.anInt3305 - 50, arg0, arg1 + Static154.anInt3305 + 50, arg0 - -arg2);
					Static47.aClass2_Sub1_Sub12_3.method1366(local750, Static154.anInt3305 + arg1 + 50 - local842, arg0 + Static22.anInt515, local767, 0);
					Static212.method3095(arg1, arg0, arg3 + arg1, arg2 + arg0);
				}
				if (Static101.anIntArray208[local628] == 5) {
					local842 = 150 - Static101.anIntArray207[local628];
					Static212.method3110(arg1, arg0 + Static22.anInt515 - Static47.aClass2_Sub1_Sub12_3.anInt2021 - 1, arg1 - -arg3, Static22.anInt515 + arg0 + 5);
					@Pc(1162) int local1162 = 0;
					if (local842 < 25) {
						local1162 = local842 - 25;
					} else if (local842 > 125) {
						local1162 = local842 - 125;
					}
					Static47.aClass2_Sub1_Sub12_3.method1370(local750, Static154.anInt3305 + arg1, arg0 - -Static22.anInt515 + local1162, local767, 0);
					Static212.method3095(arg1, arg0, arg3 + arg1, arg2 + arg0);
				}
			} else {
				Static47.aClass2_Sub1_Sub12_3.method1370(local750, Static154.anInt3305 + arg1, Static22.anInt515 + arg0, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!mb;)V")
	public static void method2345(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		Static58.aClass2_Sub11_Sub1_2.method1595(25);
		Static58.aClass2_Sub11_Sub1_2.method1528(arg0);
		Static58.aClass2_Sub11_Sub1_2.method1545(arg1.method1843());
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!pb;)V")
	public static void method2346(@OriginalArg(1) Class71 arg0) {
		Static50.aClass71_10 = arg0;
	}
}
