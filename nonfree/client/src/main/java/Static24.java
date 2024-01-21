import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "[Lclient!cb;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "[Lclient!ph;")
	public static Class66[] aClass66Array1 = new Class66[16];

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_224 = Static49.method1293("Your profile will be transferred in:");

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_225 = Static49.method1293("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
	public static int anInt659 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_226 = aClass70_224;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)V")
	public static void method517(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static102.method2167(arg0 - 1L);
			Static102.method2167(1L);
		} else {
			Static102.method2167(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIZ)I")
	public static int method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method519(@OriginalArg(0) int arg0) {
		Static53.anInt1717 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static73.anInt2250; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static85.anInt2550; local6++) {
				if (Static90.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] == null) {
					Static90.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub17(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V")
	public static void method520() {
		anIntArray40 = null;
		aClass66Array1 = null;
		aClass70_225 = null;
		aClass70_226 = null;
		anIntArray41 = null;
		aClass70_224 = null;
		aCanvas1 = null;
		aClass12Array1 = null;
		aBooleanArray2 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static141.anInt3712 = 0;
		@Pc(166) int local166;
		for (@Pc(5) int local5 = -1; local5 < Static86.anInt2582 + Static104.anInt2960; local5++) {
			@Pc(13) Class1_Sub1_Sub4_Sub2 local13;
			if (local5 == -1) {
				local13 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1;
			} else if (Static104.anInt2960 > local5) {
				local13 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local5]];
			} else {
				local13 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local5 - Static104.anInt2960]];
			}
			if (local13 != null && local13.method1517()) {
				@Pc(50) Class1_Sub1_Sub13 local50;
				if (local13 instanceof Class1_Sub1_Sub4_Sub2_Sub2) {
					local50 = ((Class1_Sub1_Sub4_Sub2_Sub2) local13).aClass1_Sub1_Sub13_1;
					if (local50.anIntArray318 != null) {
						local50 = local50.method2427();
					}
					if (local50 == null) {
						continue;
					}
				}
				if (local5 >= Static104.anInt2960) {
					local50 = ((Class1_Sub1_Sub4_Sub2_Sub2) local13).aClass1_Sub1_Sub13_1;
					if (local50.anIntArray318 != null) {
						local50 = local50.method2427();
					}
					if (local50.anInt3254 >= 0 && Static158.aClass1_Sub1_Sub1_Sub4Array9.length > local50.anInt3254) {
						Static10.method295(local13, local13.method1518() + 15);
						if (Static151.anInt4006 > -1) {
							Static158.aClass1_Sub1_Sub1_Sub4Array9[local50.anInt3254].method3021(Static151.anInt4006 + arg3 - 12, Static57.anInt1834 + arg0 - 30);
						}
					}
					if (Static4.anInt199 == 1 && Static152.anIntArray208[local5 - Static104.anInt2960] == Static20.anInt552 && Static47.anInt1654 % 20 < 10) {
						Static10.method295(local13, local13.method1518() + 15);
						if (Static151.anInt4006 > -1) {
							Static89.aClass1_Sub1_Sub1_Sub4Array4[0].method3021(arg3 + Static151.anInt4006 - 12, arg0 - (-Static57.anInt1834 - -28));
						}
					}
				} else {
					local166 = 30;
					@Pc(169) Class1_Sub1_Sub4_Sub2_Sub1 local169 = (Class1_Sub1_Sub4_Sub2_Sub1) local13;
					if (local169.anInt1308 != -1 || local169.anInt1301 != -1) {
						Static10.method295(local13, local13.method1518() + 15);
						if (Static151.anInt4006 > -1) {
							if (local169.anInt1308 != -1) {
								Static136.aClass1_Sub1_Sub1_Sub4Array8[local169.anInt1308].method3021(arg3 + Static151.anInt4006 - 12, Static57.anInt1834 + -30 + arg0);
								local166 += 25;
							}
							if (local169.anInt1301 != -1) {
								Static158.aClass1_Sub1_Sub1_Sub4Array9[local169.anInt1301].method3021(Static151.anInt4006 + arg3 - 12, -local166 + Static57.anInt1834 + arg0);
								local166 += 25;
							}
						}
					}
					if (local5 >= 0 && Static4.anInt199 == 10 && Static26.anIntArray46[local5] == Static123.anInt3341) {
						Static10.method295(local13, local13.method1518() + 15);
						if (Static151.anInt4006 > -1) {
							Static89.aClass1_Sub1_Sub1_Sub4Array4[1].method3021(Static151.anInt4006 + arg3 - 12, -local166 + Static57.anInt1834 + arg0);
						}
					}
				}
				if (local13.aClass70_631 != null && (Static104.anInt2960 <= local5 || Static53.anInt1710 == 0 || Static53.anInt1710 == 3 || Static53.anInt1710 == 1 && Static31.method790(((Class1_Sub1_Sub4_Sub2_Sub1) local13).aClass70_408))) {
					Static10.method295(local13, local13.method1518());
					if (Static151.anInt4006 > -1 && Static137.anInt3600 > Static141.anInt3712) {
						Static137.anIntArray347[Static141.anInt3712] = Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2374(local13.aClass70_631) / 2;
						Static137.anIntArray340[Static141.anInt3712] = Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.anInt3198;
						Static137.anIntArray344[Static141.anInt3712] = Static151.anInt4006;
						Static137.anIntArray343[Static141.anInt3712] = Static57.anInt1834;
						Static137.anIntArray341[Static141.anInt3712] = local13.anInt2019;
						Static137.anIntArray342[Static141.anInt3712] = local13.anInt2046;
						Static137.anIntArray346[Static141.anInt3712] = local13.anInt1995;
						Static137.aClass70Array19[Static141.anInt3712] = local13.aClass70_631;
						Static141.anInt3712++;
					}
				}
				if (local13.anInt2039 > Static47.anInt1654) {
					Static10.method295(local13, local13.method1518() + 15);
					if (Static151.anInt4006 > -1) {
						Static155.method3012(arg3 + Static151.anInt4006 - 15, arg0 + Static57.anInt1834 + -3, local13.anInt2002, 5, 65280);
						Static155.method3012(local13.anInt2002 + Static151.anInt4006 + arg3 - 15, Static57.anInt1834 + -3 + arg0, 30 - local13.anInt2002, 5, 16711680);
					}
				}
				for (local166 = 0; local166 < 4; local166++) {
					if (local13.anIntArray201[local166] > Static47.anInt1654) {
						Static10.method295(local13, local13.method1518() / 2);
						if (Static151.anInt4006 > -1) {
							if (local166 == 1) {
								Static57.anInt1834 -= 20;
							}
							if (local166 == 2) {
								Static151.anInt4006 -= 15;
								Static57.anInt1834 -= 10;
							}
							if (local166 == 3) {
								Static57.anInt1834 -= 10;
								Static151.anInt4006 += 15;
							}
							Static95.aClass1_Sub1_Sub1_Sub4Array5[local13.anIntArray195[local166]].method3021(Static151.anInt4006 + arg3 - 12, Static57.anInt1834 + arg0 + -12);
							Static128.aClass1_Sub1_Sub1_Sub2_Sub1_7.method2397(Static34.method873(local13.anIntArray196[local166]), arg3 + Static151.anInt4006 - 1, arg0 - (-Static57.anInt1834 - 3), 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(532) int local532 = 0; local532 < Static141.anInt3712; local532++) {
			local166 = Static137.anIntArray344[local532];
			@Pc(542) int local542 = Static137.anIntArray343[local532];
			@Pc(546) int local546 = Static137.anIntArray347[local532];
			@Pc(550) int local550 = Static137.anIntArray340[local532];
			@Pc(552) boolean local552 = true;
			while (local552) {
				local552 = false;
				for (@Pc(558) int local558 = 0; local558 < local532; local558++) {
					if (local542 + 2 > Static137.anIntArray343[local558] - Static137.anIntArray340[local558] && Static137.anIntArray343[local558] + 2 > -local550 + local542 && Static137.anIntArray347[local558] + Static137.anIntArray344[local558] > -local546 + local166 && local546 + local166 > Static137.anIntArray344[local558] + -Static137.anIntArray347[local558] && local542 > Static137.anIntArray343[local558] - Static137.anIntArray340[local558]) {
						local552 = true;
						local542 = Static137.anIntArray343[local558] - Static137.anIntArray340[local558];
					}
				}
			}
			Static151.anInt4006 = Static137.anIntArray344[local532];
			Static57.anInt1834 = Static137.anIntArray343[local532] = local542;
			@Pc(658) Class70 local658 = Static137.aClass70Array19[local532];
			if (Static44.anInt1470 == 0) {
				@Pc(662) int local662 = 16776960;
				if (Static137.anIntArray341[local532] < 6) {
					local662 = Static105.anIntArray290[Static137.anIntArray341[local532]];
				}
				if (Static137.anIntArray341[local532] == 6) {
					local662 = Static146.anInt3838 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static137.anIntArray341[local532] == 7) {
					local662 = Static146.anInt3838 % 20 < 10 ? 255 : 65535;
				}
				if (Static137.anIntArray341[local532] == 8) {
					local662 = Static146.anInt3838 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(735) int local735;
				if (Static137.anIntArray341[local532] == 9) {
					local735 = 150 - Static137.anIntArray346[local532];
					if (local735 < 50) {
						local662 = local735 * 1280 + 16711680;
					} else if (local735 < 100) {
						local662 = 16776960 - (local735 - 50) * 327680;
					} else if (local735 < 150) {
						local662 = (local735 - 100) * 5 + 65280;
					}
				}
				if (Static137.anIntArray341[local532] == 10) {
					local735 = 150 - Static137.anIntArray346[local532];
					if (local735 < 50) {
						local662 = local735 * 5 + 16711680;
					} else if (local735 < 100) {
						local662 = 16384000 + 16711935 - local735 * 327680;
					} else if (local735 < 150) {
						local662 = (local735 - 100) * 327680 + 255 - (local735 - 100) * 5;
					}
				}
				if (Static137.anIntArray341[local532] == 11) {
					local735 = 150 - Static137.anIntArray346[local532];
					if (local735 < 50) {
						local662 = 16777215 - local735 * 327685;
					} else if (local735 < 100) {
						local662 = local735 * 327685 + 65280 - 16384250;
					} else if (local735 < 150) {
						local662 = 32768000 + 16777215 - local735 * 327680;
					}
				}
				if (Static137.anIntArray342[local532] == 0) {
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2397(local658, Static151.anInt4006 + arg3, arg0 + Static57.anInt1834, local662, 0);
				}
				if (Static137.anIntArray342[local532] == 1) {
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2399(local658, arg3 + Static151.anInt4006, arg0 + Static57.anInt1834, local662, Static146.anInt3838);
				}
				if (Static137.anIntArray342[local532] == 2) {
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2372(local658, arg3 + Static151.anInt4006, Static57.anInt1834 + arg0, local662, Static146.anInt3838);
				}
				if (Static137.anIntArray342[local532] == 3) {
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2393(local658, Static151.anInt4006 + arg3, Static57.anInt1834 + arg0, local662, Static146.anInt3838, 150 - Static137.anIntArray346[local532]);
				}
				if (Static137.anIntArray342[local532] == 4) {
					local735 = (150 - Static137.anIntArray346[local532]) * (Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2374(local658) + 100) / 150;
					Static155.method3011(Static151.anInt4006 + arg3 - 50, arg0, arg3 + Static151.anInt4006 + 50, arg2 + arg0);
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2391(local658, arg3 + Static151.anInt4006 + 50 - local735, Static57.anInt1834 + arg0, local662, 0);
					Static155.method2998(arg3, arg0, arg1 + arg3, arg0 + arg2);
				}
				if (Static137.anIntArray342[local532] == 5) {
					local735 = 150 - Static137.anIntArray346[local532];
					Static155.method3011(arg3, Static57.anInt1834 + arg0 - Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.anInt3198 - 1, arg3 + arg1, arg0 + Static57.anInt1834 + 5);
					@Pc(1059) int local1059 = 0;
					if (local735 < 25) {
						local1059 = local735 - 25;
					} else if (local735 > 125) {
						local1059 = local735 - 125;
					}
					Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2397(local658, Static151.anInt4006 + arg3, local1059 + Static57.anInt1834 + arg0, local662, 0);
					Static155.method2998(arg3, arg0, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2397(local658, arg3 + Static151.anInt4006, Static57.anInt1834 + arg0, 16776960, 0);
			}
		}
	}
}
