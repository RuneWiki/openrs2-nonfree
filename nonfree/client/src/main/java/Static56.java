import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!gh", name = "db", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_598 = Static146.method2172("titlebox");

	@OriginalMember(owner = "client!gh", name = "pb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_600 = Static146.method2172("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!gh", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_599 = aClass77_600;

	@OriginalMember(owner = "client!gh", name = "nb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1 = new Class1();

	@OriginalMember(owner = "client!gh", name = "ob", descriptor = "[I")
	public static int[] anIntArray233 = new int[100];

	@OriginalMember(owner = "client!gh", name = "qb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array10 = new Class77[500];

	@OriginalMember(owner = "client!gh", name = "rb", descriptor = "[I")
	public static int[] anIntArray234 = new int[2000];

	@OriginalMember(owner = "client!gh", name = "sb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_601 = Static146.method2172("null");

	@OriginalMember(owner = "client!gh", name = "tb", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)I")
	public static int method1057() {
		@Pc(1) int local1 = 3;
		if (Static130.anInt3165 < 310) {
			@Pc(13) int local13 = Static7.anInt215 >> 7;
			@Pc(17) int local17 = Static121.anInt2979 >> 7;
			if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][local13][local17] & 0x4) != 0) {
				local1 = Static54.anInt1472;
			}
			@Pc(37) int local37 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7;
			@Pc(42) int local42 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7;
			@Pc(54) int local54;
			if (local42 <= local13) {
				local54 = local13 - local42;
			} else {
				local54 = local42 - local13;
			}
			@Pc(66) int local66;
			if (local17 >= local37) {
				local66 = local17 - local37;
			} else {
				local66 = local37 - local17;
			}
			@Pc(86) int local86;
			@Pc(80) int local80;
			if (local54 <= local66) {
				local80 = 32768;
				local86 = local54 * 65536 / local66;
				while (local37 != local17) {
					local80 += local86;
					if (local37 > local17) {
						local17++;
					} else if (local37 < local17) {
						local17--;
					}
					if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][local13][local17] & 0x4) != 0) {
						local1 = Static54.anInt1472;
					}
					if (local80 >= 65536) {
						if (local13 < local42) {
							local13++;
						} else if (local42 < local13) {
							local13--;
						}
						local80 -= 65536;
						if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][local13][local17] & 0x4) != 0) {
							local1 = Static54.anInt1472;
						}
					}
				}
			} else {
				local86 = local66 * 65536 / local54;
				local80 = 32768;
				while (local13 != local42) {
					local80 += local86;
					if (local42 > local13) {
						local13++;
					} else if (local13 > local42) {
						local13--;
					}
					if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][local13][local17] & 0x4) != 0) {
						local1 = Static54.anInt1472;
					}
					if (local80 >= 65536) {
						if (local37 > local17) {
							local17++;
						} else if (local17 > local37) {
							local17--;
						}
						local80 -= 65536;
						if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][local13][local17] & 0x4) != 0) {
							local1 = Static54.anInt1472;
						}
					}
				}
			}
		}
		if ((Static140.aByteArrayArrayArray6[Static54.anInt1472][Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7][Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7] & 0x4) != 0) {
			local1 = Static54.anInt1472;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(Z)V")
	public static void method1058() {
		Static61.aClass82_23.method2698();
		Static143.aClass82_51.method2698();
		Static46.aClass82_17.method2698();
		Static46.aClass82_18.method2698();
		Static176.aClass82_63.method2698();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public static void method1059(@OriginalArg(1) int arg0) {
		Static157.method2674();
		Static87.method1614();
		@Pc(19) int local19 = Static89.method1645(arg0).anInt2145;
		if (local19 == 0) {
			return;
		}
		@Pc(26) int local26 = Static6.anIntArray24[arg0];
		if (local19 == 1) {
			if (local26 == 1) {
				Static12.method240(0.9F);
			}
			if (local26 == 2) {
				Static12.method240(0.8F);
			}
			if (local26 == 3) {
				Static12.method240(0.7F);
			}
			if (local26 == 4) {
				Static12.method240(0.6F);
			}
			Static177.method2966();
		}
		if (local19 == 3) {
			@Pc(62) short local62 = 0;
			if (local26 == 0) {
				local62 = 255;
			}
			if (local26 == 1) {
				local62 = 192;
			}
			if (local26 == 2) {
				local62 = 128;
			}
			if (local26 == 3) {
				local62 = 64;
			}
			if (local26 == 4) {
				local62 = 0;
			}
			if (Static120.anInt1042 != local62) {
				if (Static120.anInt1042 == 0 && Static99.anInt2498 != -1) {
					Static58.method1066(Static176.aClass43_Sub1_20, 0, local62, Static99.anInt2498);
					Static8.aBoolean10 = false;
				} else if (local62 == 0) {
					Static54.method1030();
					Static8.aBoolean10 = false;
				} else {
					Static128.method2199(local62);
				}
				Static120.anInt1042 = local62;
			}
		}
		if (local19 == 5) {
			Static98.anInt2481 = local26;
		}
		if (local19 == 4) {
			if (local26 == 0) {
				Static31.anInt883 = 127;
			}
			if (local26 == 1) {
				Static31.anInt883 = 96;
			}
			if (local26 == 2) {
				Static31.anInt883 = 64;
			}
			if (local26 == 3) {
				Static31.anInt883 = 32;
			}
			if (local26 == 4) {
				Static31.anInt883 = 0;
			}
		}
		if (local19 == 9) {
			Static60.anInt1612 = local26;
		}
		if (local19 == 10) {
			if (local26 == 0) {
				Static18.anInt617 = 127;
			}
			if (local26 == 1) {
				Static18.anInt617 = 96;
			}
			if (local26 == 2) {
				Static18.anInt617 = 64;
			}
			if (local26 == 3) {
				Static18.anInt617 = 32;
			}
			if (local26 == 4) {
				Static18.anInt617 = 0;
			}
		}
		if (local19 == 6) {
			Static49.anInt1347 = local26;
		}
	}

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V")
	public static void method1060() {
		anIntArray234 = null;
		aClass77_601 = null;
		aClass77_600 = null;
		aRandom1 = null;
		anIntArray233 = null;
		aClass1_1 = null;
		aClass77Array10 = null;
		aClass77_599 = null;
		aClass77_598 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!wb;)V")
	public static void method1061(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray29;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub2_Sub2 local18 = Static111.method1991(local14);
		if (local18 == null) {
			return;
		}
		Static142.anInt3476 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local18.anIntArray35;
		@Pc(32) int local32 = -1;
		@Pc(35) int[] local35 = local18.anIntArray34;
		@Pc(37) byte local37 = -1;
		@Pc(55) int local55;
		@Pc(68) int local68;
		try {
			Static62.anIntArray258 = new int[local18.anInt255];
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			Static6.aClass77Array1 = new Class77[local18.anInt254];
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local68 = (Integer) local8[local55];
					if (local68 == -2147483647) {
						local68 = arg1.anInt4466;
					}
					if (local68 == -2147483646) {
						local68 = arg1.anInt4461;
					}
					if (local68 == -2147483645) {
						local68 = arg1.aClass66_14 == null ? -1 : arg1.aClass66_14.anInt3229;
					}
					if (local68 == -2147483644) {
						local68 = arg1.anInt4462;
					}
					if (local68 == -2147483643) {
						local68 = arg1.aClass66_14 == null ? -1 : arg1.aClass66_14.anInt3212;
					}
					if (local68 == -2147483642) {
						local68 = arg1.aClass66_15 == null ? -1 : arg1.aClass66_15.anInt3229;
					}
					if (local68 == -2147483641) {
						local68 = arg1.aClass66_15 == null ? -1 : arg1.aClass66_15.anInt3212;
					}
					if (local68 == -2147483640) {
						local68 = arg1.anInt4463;
					}
					if (local68 == -2147483639) {
						local68 = arg1.anInt4459;
					}
					Static62.anIntArray258[local45++] = local68;
				} else if (local8[local55] instanceof Class77) {
					@Pc(171) Class77 local171 = (Class77) local8[local55];
					if (local171.method2519(Static71.aClass77_769)) {
						local171 = arg1.aClass77_1522;
					}
					Static6.aClass77Array1[local43++] = local171;
				}
			}
			local68 = 0;
			label2167: while (true) {
				local68++;
				if (local68 > arg0) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(205) int local205 = local30[local32];
				@Pc(637) int local637;
				@Pc(755) int local755;
				@Pc(750) int local750;
				@Pc(616) int local616;
				@Pc(574) Class77 local574;
				if (local205 < 100) {
					if (local205 == 0) {
						Static127.anIntArray455[local25++] = local35[local32];
						continue;
					}
					@Pc(228) int local228;
					if (local205 == 1) {
						local228 = local35[local32];
						Static127.anIntArray455[local25++] = Static6.anIntArray24[local228];
						continue;
					}
					if (local205 == 2) {
						local228 = local35[local32];
						local25--;
						Static6.anIntArray24[local228] = Static127.anIntArray455[local25];
						continue;
					}
					if (local205 == 3) {
						Static178.aClass77Array27[local27++] = local18.aClass77Array2[local32];
						continue;
					}
					if (local205 == 6) {
						local32 += local35[local32];
						continue;
					}
					if (local205 == 7) {
						local25 -= 2;
						if (Static127.anIntArray455[local25 + 1] != Static127.anIntArray455[local25]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 8) {
						local25 -= 2;
						if (Static127.anIntArray455[local25 + 1] == Static127.anIntArray455[local25]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 9) {
						local25 -= 2;
						if (Static127.anIntArray455[local25] < Static127.anIntArray455[local25 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 10) {
						local25 -= 2;
						if (Static127.anIntArray455[local25] > Static127.anIntArray455[local25 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 21) {
						if (Static142.anInt3476 == 0) {
							return;
						}
						@Pc(397) Class17 local397 = Static96.aClass17Array1[--Static142.anInt3476];
						Static6.aClass77Array1 = local397.aClass77Array5;
						local18 = local397.aClass2_Sub2_Sub2_1;
						local32 = local397.anInt881;
						local30 = local18.anIntArray35;
						Static62.anIntArray258 = local397.anIntArray141;
						local35 = local18.anIntArray34;
						continue;
					}
					if (local205 == 25) {
						local228 = local35[local32];
						Static127.anIntArray455[local25++] = Static53.method1023(local228);
						continue;
					}
					if (local205 == 27) {
						local228 = local35[local32];
						local25--;
						Static173.method2919(local228, Static127.anIntArray455[local25]);
						continue;
					}
					if (local205 == 31) {
						local25 -= 2;
						if (Static127.anIntArray455[local25] <= Static127.anIntArray455[local25 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 32) {
						local25 -= 2;
						if (Static127.anIntArray455[local25 + 1] <= Static127.anIntArray455[local25]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local205 == 33) {
						Static127.anIntArray455[local25++] = Static62.anIntArray258[local35[local32]];
						continue;
					}
					@Pc(520) int local520;
					if (local205 == 34) {
						local520 = local35[local32];
						local25--;
						Static62.anIntArray258[local520] = Static127.anIntArray455[local25];
						continue;
					}
					if (local205 == 35) {
						Static178.aClass77Array27[local27++] = Static6.aClass77Array1[local35[local32]];
						continue;
					}
					if (local205 == 36) {
						local520 = local35[local32];
						local27--;
						Static6.aClass77Array1[local520] = Static178.aClass77Array27[local27];
						continue;
					}
					if (local205 == 37) {
						local228 = local35[local32];
						local27 -= local228;
						local574 = Static136.method2289(local27, Static178.aClass77Array27, local228);
						Static178.aClass77Array27[local27++] = local574;
						continue;
					}
					if (local205 == 38) {
						local25--;
						continue;
					}
					if (local205 == 39) {
						local27--;
						continue;
					}
					if (local205 == 40) {
						local228 = local35[local32];
						@Pc(606) Class2_Sub2_Sub2 local606 = Static111.method1991(local228);
						@Pc(610) int[] local610 = new int[local606.anInt255];
						@Pc(614) Class77[] local614 = new Class77[local606.anInt254];
						for (local616 = 0; local616 < local606.anInt256; local616++) {
							local610[local616] = Static127.anIntArray455[local616 + local25 - local606.anInt256];
						}
						for (local637 = 0; local637 < local606.anInt253; local637++) {
							local614[local637] = Static178.aClass77Array27[local637 + local27 - local606.anInt253];
						}
						local27 -= local606.anInt253;
						local25 -= local606.anInt256;
						@Pc(669) Class17 local669 = new Class17();
						local669.anIntArray141 = Static62.anIntArray258;
						local669.aClass77Array5 = Static6.aClass77Array1;
						local669.anInt881 = local32;
						local32 = -1;
						local669.aClass2_Sub2_Sub2_1 = local18;
						local18 = local606;
						Static96.aClass17Array1[Static142.anInt3476++] = local669;
						local30 = local606.anIntArray35;
						Static6.aClass77Array1 = local614;
						Static62.anIntArray258 = local610;
						local35 = local606.anIntArray34;
						continue;
					}
					if (local205 == 42) {
						Static127.anIntArray455[local25++] = anIntArray234[local35[local32]];
						continue;
					}
					if (local205 == 43) {
						local520 = local35[local32];
						local25--;
						anIntArray234[local520] = Static127.anIntArray455[local25];
						continue;
					}
					if (local205 == 44) {
						local228 = local35[local32] >> 16;
						local750 = local35[local32] & 0xFFFF;
						local25--;
						local755 = Static127.anIntArray455[local25];
						if (local755 >= 0 && local755 <= 5000) {
							@Pc(766) byte local766 = -1;
							if (local750 == 105) {
								local766 = 0;
							}
							Static169.anIntArray597[local228] = local755;
							local616 = 0;
							while (true) {
								if (local616 >= local755) {
									continue label2167;
								}
								Static101.anIntArrayArray19[local228][local616] = local766;
								local616++;
							}
						}
						throw new RuntimeException();
					}
					if (local205 == 45) {
						local228 = local35[local32];
						local25--;
						local750 = Static127.anIntArray455[local25];
						if (local750 >= 0 && local750 < Static169.anIntArray597[local228]) {
							Static127.anIntArray455[local25++] = Static101.anIntArrayArray19[local228][local750];
							continue;
						}
						throw new RuntimeException();
					}
					if (local205 == 46) {
						local25 -= 2;
						local750 = Static127.anIntArray455[local25];
						local228 = local35[local32];
						if (local750 >= 0 && local750 < Static169.anIntArray597[local228]) {
							Static101.anIntArrayArray19[local228][local750] = Static127.anIntArray455[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local205 == 47) {
						@Pc(881) Class77 local881 = Static52.aClass77Array9[local35[local32]];
						if (local881 == null) {
							local881 = Static38.aClass77_435;
						}
						Static178.aClass77Array27[local27++] = local881;
						continue;
					}
					if (local205 == 48) {
						local520 = local35[local32];
						local27--;
						Static52.aClass77Array9[local520] = Static178.aClass77Array27[local27];
						continue;
					}
				}
				@Pc(917) boolean local917;
				if (local35[local32] == 1) {
					local917 = true;
				} else {
					local917 = false;
				}
				@Pc(951) Class66 local951;
				@Pc(4409) int local4409;
				@Pc(1689) int local1689;
				@Pc(6505) Class66 local6505;
				@Pc(6526) Class66 local6526;
				if (local205 < 1000) {
					if (local205 == 100) {
						local25 -= 3;
						local1689 = Static127.anIntArray455[local25 + 2];
						local755 = Static127.anIntArray455[local25 + 1];
						local750 = Static127.anIntArray455[local25];
						if (local755 == 0) {
							throw new RuntimeException();
						}
						local6505 = Static55.method1034(local750);
						if (local6505.aClass66Array2 == null) {
							local6505.aClass66Array2 = new Class66[local1689 + 1];
						}
						if (local1689 >= local6505.aClass66Array2.length) {
							@Pc(7588) Class66[] local7588 = new Class66[local1689 + 1];
							for (local4409 = 0; local4409 < local6505.aClass66Array2.length; local4409++) {
								local7588[local4409] = local6505.aClass66Array2[local4409];
							}
							local6505.aClass66Array2 = local7588;
						}
						if (local1689 > 0 && local6505.aClass66Array2[local1689 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1689 - 1));
						}
						@Pc(7637) Class66 local7637 = new Class66();
						local7637.aBoolean131 = true;
						local7637.anInt3212 = local1689;
						local7637.anInt3237 = local7637.anInt3229 = local6505.anInt3229;
						local7637.anInt3230 = local755;
						local6505.aClass66Array2[local1689] = local7637;
						if (local917) {
							Static64.aClass66_7 = local7637;
						} else {
							Static30.aClass66_2 = local7637;
						}
						Static57.method2994(local6505);
						continue;
					}
					@Pc(7704) Class66 local7704;
					if (local205 == 101) {
						local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
						if (local951.anInt3212 == -1) {
							if (!local917) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7704 = Static55.method1034(local951.anInt3229);
						local7704.aClass66Array2[local951.anInt3212] = null;
						Static57.method2994(local7704);
						continue;
					}
					if (local205 == 102) {
						local25--;
						local951 = Static55.method1034(Static127.anIntArray455[local25]);
						local951.aClass66Array2 = null;
						Static57.method2994(local951);
						continue;
					}
					if (local205 == 200) {
						local25 -= 2;
						local755 = Static127.anIntArray455[local25 + 1];
						local750 = Static127.anIntArray455[local25];
						local6526 = Static105.method1835(local750, local755);
						if (local6526 != null && local755 != -1) {
							Static127.anIntArray455[local25++] = 1;
							if (local917) {
								Static64.aClass66_7 = local6526;
							} else {
								Static30.aClass66_2 = local6526;
							}
							continue;
						}
						Static127.anIntArray455[local25++] = 0;
						continue;
					}
					if (local205 == 201) {
						local25--;
						local750 = Static127.anIntArray455[local25];
						local7704 = Static55.method1034(local750);
						if (local7704 == null) {
							Static127.anIntArray455[local25++] = 0;
						} else {
							Static127.anIntArray455[local25++] = 1;
							if (local917) {
								Static64.aClass66_7 = local7704;
							} else {
								Static30.aClass66_2 = local7704;
							}
						}
						continue;
					}
				} else if ((local205 < 1000 || local205 >= 1100) && (local205 < 2000 || local205 >= 2100)) {
					@Pc(1397) Class77 local1397;
					if (local205 >= 1100 && local205 < 1200 || local205 >= 2100 && local205 < 2200) {
						if (local205 >= 2000) {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							local205 -= 1000;
						} else {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
						}
						if (local205 == 1100) {
							local25 -= 2;
							local951.anInt3218 = Static127.anIntArray455[local25];
							if (local951.anInt3188 - local951.anInt3227 < local951.anInt3218) {
								local951.anInt3218 = local951.anInt3188 - local951.anInt3227;
							}
							if (local951.anInt3218 < 0) {
								local951.anInt3218 = 0;
							}
							local951.anInt3189 = Static127.anIntArray455[local25 + 1];
							if (local951.anInt3207 - local951.anInt3168 < local951.anInt3189) {
								local951.anInt3189 = local951.anInt3207 - local951.anInt3168;
							}
							if (local951.anInt3189 < 0) {
								local951.anInt3189 = 0;
							}
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1101) {
							local25--;
							local951.anInt3210 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1102) {
							local25--;
							local951.aBoolean134 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1103) {
							local25--;
							local951.anInt3241 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1104) {
							local25--;
							local951.anInt3192 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1105) {
							local25--;
							local951.anInt3216 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1106) {
							local25--;
							local951.anInt3231 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1107) {
							local25--;
							local951.aBoolean136 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1108) {
							local951.anInt3187 = 1;
							local25--;
							local951.anInt3183 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1109) {
							local25 -= 6;
							local951.anInt3196 = Static127.anIntArray455[local25];
							local951.anInt3179 = Static127.anIntArray455[local25 + 1];
							local951.anInt3235 = Static127.anIntArray455[local25 + 2];
							local951.anInt3220 = Static127.anIntArray455[local25 + 3];
							local951.anInt3205 = Static127.anIntArray455[local25 + 4];
							local951.anInt3243 = Static127.anIntArray455[local25 + 5];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1110) {
							local25--;
							local755 = Static127.anIntArray455[local25];
							if (local951.anInt3206 != local755) {
								local951.anInt3206 = local755;
								local951.anInt3209 = 0;
								local951.anInt3226 = 0;
								Static57.method2994(local951);
							}
							continue;
						}
						if (local205 == 1111) {
							local25--;
							local951.aBoolean138 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1112) {
							local27--;
							local1397 = Static178.aClass77Array27[local27];
							if (!local1397.method2519(local951.aClass77_1159)) {
								local951.aClass77_1159 = local1397;
								Static57.method2994(local951);
							}
							continue;
						}
						if (local205 == 1113) {
							local25--;
							local951.anInt3169 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1114) {
							local25 -= 3;
							local951.anInt3221 = Static127.anIntArray455[local25];
							local951.anInt3198 = Static127.anIntArray455[local25 + 1];
							local951.anInt3223 = Static127.anIntArray455[local25 + 2];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1115) {
							local25--;
							local951.aBoolean129 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1116) {
							local25--;
							local951.anInt3190 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1117) {
							local25--;
							local951.anInt3176 = Static127.anIntArray455[local25];
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1118) {
							local25--;
							local951.aBoolean139 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1119) {
							local25--;
							local951.aBoolean128 = Static127.anIntArray455[local25] == 1;
							Static57.method2994(local951);
							continue;
						}
						if (local205 == 1120) {
							local25 -= 2;
							local951.anInt3188 = Static127.anIntArray455[local25];
							local951.anInt3207 = Static127.anIntArray455[local25 + 1];
							Static57.method2994(local951);
							continue;
						}
					} else if (local205 >= 1200 && local205 < 1300 || local205 >= 2200 && local205 < 2300) {
						if (local205 < 2000) {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
						} else {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							local205 -= 1000;
						}
						Static57.method2994(local951);
						if (local205 == 1200) {
							local25 -= 2;
							local1689 = Static127.anIntArray455[local25 + 1];
							local755 = Static127.anIntArray455[local25];
							local951.anInt3240 = local755;
							local951.anInt3239 = local1689;
							@Pc(7434) Class2_Sub2_Sub9 local7434 = Static158.method2689(local755);
							local951.anInt3196 = local7434.anInt1782;
							local951.anInt3235 = local7434.anInt1790;
							local951.anInt3205 = local7434.anInt1809;
							local951.anInt3243 = local7434.anInt1800;
							if (local951.anInt3227 > 0) {
								local951.anInt3243 = local951.anInt3243 * 32 / local951.anInt3227;
							}
							local951.anInt3220 = local7434.anInt1785;
							local951.anInt3179 = local7434.anInt1776;
							continue;
						}
						if (local205 == 1201) {
							local951.anInt3187 = 2;
							local25--;
							local951.anInt3183 = Static127.anIntArray455[local25];
							continue;
						}
						if (local205 == 1202) {
							local951.anInt3187 = 3;
							local951.anInt3183 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2.method2();
							continue;
						}
						if (local205 == 1203) {
							local951.anInt3187 = 6;
							local25--;
							local951.anInt3183 = Static127.anIntArray455[local25];
							continue;
						}
						if (local205 == 1204) {
							local951.anInt3187 = 5;
							local25--;
							local951.anInt3183 = Static127.anIntArray455[local25];
							continue;
						}
					} else if (local205 >= 1300 && local205 < 1400 || local205 >= 2300 && local205 < 2400) {
						if (local205 >= 2000) {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							local205 -= 1000;
						} else {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
						}
						if (local205 == 1300) {
							local25--;
							local755 = Static127.anIntArray455[local25] - 1;
							if (local755 >= 0 && local755 <= 9) {
								local27--;
								local951.method2245(Static178.aClass77Array27[local27], local755);
								continue;
							}
							local27--;
							continue;
						}
						if (local205 == 1301) {
							local25 -= 2;
							local755 = Static127.anIntArray455[local25];
							local1689 = Static127.anIntArray455[local25 + 1];
							local951.aClass66_10 = Static105.method1835(local755, local1689);
							continue;
						}
						if (local205 == 1302) {
							local25--;
							local951.aBoolean137 = Static127.anIntArray455[local25] == 1;
							continue;
						}
						if (local205 == 1303) {
							local25--;
							local951.anInt3195 = Static127.anIntArray455[local25];
							continue;
						}
						if (local205 == 1304) {
							local25--;
							local951.anInt3191 = Static127.anIntArray455[local25];
							continue;
						}
						if (local205 == 1305) {
							local27--;
							local951.aClass77_1164 = Static178.aClass77Array27[local27];
							continue;
						}
						if (local205 == 1306) {
							local27--;
							local951.aClass77_1161 = Static178.aClass77Array27[local27];
							continue;
						}
						if (local205 == 1307) {
							local951.aClass77Array19 = null;
							continue;
						}
					} else {
						if (local205 >= 1400 && local205 < 1500 || local205 >= 2400 && local205 < 2500) {
							if (local205 < 2000) {
								local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
							} else {
								local25--;
								local951 = Static55.method1034(Static127.anIntArray455[local25]);
								local205 -= 1000;
							}
							local27--;
							local1397 = Static178.aClass77Array27[local27];
							@Pc(7082) int[] local7082 = null;
							if (local1397.method2532() > 0 && local1397.method2526(local1397.method2532() - 1) == 89) {
								local25--;
								local616 = Static127.anIntArray455[local25];
								if (local616 > 0) {
									local7082 = new int[local616];
									while (local616-- > 0) {
										local25--;
										local7082[local616] = Static127.anIntArray455[local25];
									}
								}
								local1397 = local1397.method2530(0, local1397.method2532() - 1);
							}
							@Pc(7143) Object[] local7143 = new Object[local1397.method2532() + 1];
							for (local637 = local7143.length - 1; local637 >= 1; local637--) {
								if (local1397.method2526(local637 - 1) == 115) {
									local27--;
									local7143[local637] = Static178.aClass77Array27[local27];
								} else {
									local25--;
									local7143[local637] = Integer.valueOf(Static127.anIntArray455[local25]);
								}
							}
							local25--;
							local4409 = Static127.anIntArray455[local25];
							if (local4409 == -1) {
								local7143 = null;
							} else {
								local7143[0] = Integer.valueOf(local4409);
							}
							if (local205 == 1409) {
								local951.anObjectArray6 = local7143;
							}
							if (local205 == 1406) {
								local951.anObjectArray15 = local7143;
							}
							if (local205 == 1404) {
								local951.anObjectArray7 = local7143;
							}
							if (local205 == 1421) {
								local951.anObjectArray17 = local7143;
							}
							if (local205 == 1402) {
								local951.anObjectArray27 = local7143;
							}
							if (local205 == 1420) {
								local951.anObjectArray23 = local7143;
							}
							if (local205 == 1425) {
								local951.anObjectArray16 = local7143;
							}
							if (local205 == 1400) {
								local951.anObjectArray21 = local7143;
							}
							local951.aBoolean133 = true;
							if (local205 == 1412) {
								local951.anObjectArray26 = local7143;
							}
							if (local205 == 1405) {
								local951.anObjectArray11 = local7143;
							}
							if (local205 == 1418) {
								local951.anObjectArray20 = local7143;
							}
							if (local205 == 1401) {
								local951.anObjectArray18 = local7143;
							}
							if (local205 == 1414) {
								local951.anObjectArray9 = local7143;
								local951.anIntArray475 = local7082;
							}
							if (local205 == 1422) {
								local951.anObjectArray14 = local7143;
							}
							if (local205 == 1408) {
								local951.anObjectArray4 = local7143;
							}
							if (local205 == 1411) {
								local951.anObjectArray19 = local7143;
							}
							if (local205 == 1410) {
								local951.anObjectArray24 = local7143;
							}
							if (local205 == 1416) {
								local951.anObjectArray8 = local7143;
							}
							if (local205 == 1419) {
								local951.anObjectArray10 = local7143;
							}
							if (local205 == 1407) {
								local951.anObjectArray3 = local7143;
								local951.anIntArray473 = local7082;
							}
							if (local205 == 1423) {
								local951.anObjectArray12 = local7143;
							}
							if (local205 == 1424) {
								local951.anObjectArray22 = local7143;
							}
							if (local205 == 1403) {
								local951.anObjectArray5 = local7143;
							}
							if (local205 == 1415) {
								local951.anIntArray469 = local7082;
								local951.anObjectArray13 = local7143;
							}
							if (local205 == 1417) {
								local951.anObjectArray25 = local7143;
							}
							continue;
						}
						if (local205 < 1600) {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
							if (local205 == 1500) {
								Static127.anIntArray455[local25++] = local951.anInt3184;
								continue;
							}
							if (local205 == 1501) {
								Static127.anIntArray455[local25++] = local951.anInt3242;
								continue;
							}
							if (local205 == 1502) {
								Static127.anIntArray455[local25++] = local951.anInt3227;
								continue;
							}
							if (local205 == 1503) {
								Static127.anIntArray455[local25++] = local951.anInt3168;
								continue;
							}
							if (local205 == 1504) {
								Static127.anIntArray455[local25++] = local951.aBoolean135 ? 1 : 0;
								continue;
							}
							if (local205 == 1505) {
								Static127.anIntArray455[local25++] = local951.anInt3237;
								continue;
							}
						} else if (local205 < 1700) {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
							if (local205 == 1600) {
								Static127.anIntArray455[local25++] = local951.anInt3218;
								continue;
							}
							if (local205 == 1601) {
								Static127.anIntArray455[local25++] = local951.anInt3189;
								continue;
							}
							if (local205 == 1602) {
								Static178.aClass77Array27[local27++] = local951.aClass77_1159;
								continue;
							}
							if (local205 == 1603) {
								Static127.anIntArray455[local25++] = local951.anInt3188;
								continue;
							}
							if (local205 == 1604) {
								Static127.anIntArray455[local25++] = local951.anInt3207;
								continue;
							}
							if (local205 == 1605) {
								Static127.anIntArray455[local25++] = local951.anInt3243;
								continue;
							}
							if (local205 == 1606) {
								Static127.anIntArray455[local25++] = local951.anInt3235;
								continue;
							}
							if (local205 == 1607) {
								Static127.anIntArray455[local25++] = local951.anInt3205;
								continue;
							}
							if (local205 == 1608) {
								Static127.anIntArray455[local25++] = local951.anInt3220;
								continue;
							}
							if (local205 == 1609) {
								Static127.anIntArray455[local25++] = local951.anInt3241;
								continue;
							}
						} else if (local205 < 1800) {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
							if (local205 == 1700) {
								Static127.anIntArray455[local25++] = local951.anInt3240;
								continue;
							}
							if (local205 == 1701) {
								if (local951.anInt3240 == -1) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = local951.anInt3239;
								}
								continue;
							}
							if (local205 == 1702) {
								Static127.anIntArray455[local25++] = local951.anInt3212;
								continue;
							}
						} else if (local205 < 1900) {
							local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
							if (local205 == 1800) {
								Static127.anIntArray455[local25++] = Static40.method796(Static63.method1160(local951));
								continue;
							}
							if (local205 == 1801) {
								local25--;
								local755 = Static127.anIntArray455[local25];
								local755--;
								if (local951.aClass77Array19 != null && local951.aClass77Array19.length > local755 && local951.aClass77Array19[local755] != null) {
									Static178.aClass77Array27[local27++] = local951.aClass77Array19[local755];
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 1802) {
								if (local951.aClass77_1164 == null) {
									Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								} else {
									Static178.aClass77Array27[local27++] = local951.aClass77_1164;
								}
								continue;
							}
						} else if (local205 < 2600) {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							if (local205 == 2500) {
								Static127.anIntArray455[local25++] = local951.anInt3184;
								continue;
							}
							if (local205 == 2501) {
								Static127.anIntArray455[local25++] = local951.anInt3242;
								continue;
							}
							if (local205 == 2502) {
								Static127.anIntArray455[local25++] = local951.anInt3227;
								continue;
							}
							if (local205 == 2503) {
								Static127.anIntArray455[local25++] = local951.anInt3168;
								continue;
							}
							if (local205 == 2504) {
								Static127.anIntArray455[local25++] = local951.aBoolean135 ? 1 : 0;
								continue;
							}
							if (local205 == 2505) {
								Static127.anIntArray455[local25++] = local951.anInt3237;
								continue;
							}
						} else if (local205 < 2700) {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							if (local205 == 2600) {
								Static127.anIntArray455[local25++] = local951.anInt3218;
								continue;
							}
							if (local205 == 2601) {
								Static127.anIntArray455[local25++] = local951.anInt3189;
								continue;
							}
							if (local205 == 2602) {
								Static178.aClass77Array27[local27++] = local951.aClass77_1159;
								continue;
							}
							if (local205 == 2603) {
								Static127.anIntArray455[local25++] = local951.anInt3188;
								continue;
							}
							if (local205 == 2604) {
								Static127.anIntArray455[local25++] = local951.anInt3207;
								continue;
							}
							if (local205 == 2605) {
								Static127.anIntArray455[local25++] = local951.anInt3243;
								continue;
							}
							if (local205 == 2606) {
								Static127.anIntArray455[local25++] = local951.anInt3235;
								continue;
							}
							if (local205 == 2607) {
								Static127.anIntArray455[local25++] = local951.anInt3205;
								continue;
							}
							if (local205 == 2608) {
								Static127.anIntArray455[local25++] = local951.anInt3220;
								continue;
							}
							if (local205 == 2609) {
								Static127.anIntArray455[local25++] = local951.anInt3241;
								continue;
							}
						} else if (local205 < 2800) {
							if (local205 == 2700) {
								local25--;
								local951 = Static55.method1034(Static127.anIntArray455[local25]);
								Static127.anIntArray455[local25++] = local951.anInt3240;
								continue;
							}
							if (local205 == 2701) {
								local25--;
								local951 = Static55.method1034(Static127.anIntArray455[local25]);
								if (local951.anInt3240 == -1) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = local951.anInt3239;
								}
								continue;
							}
							if (local205 == 2702) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								@Pc(1952) Class2_Sub10 local1952 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local750);
								if (local1952 == null) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = 1;
								}
								continue;
							}
							if (local205 == 2703) {
								local25--;
								local951 = Static55.method1034(Static127.anIntArray455[local25]);
								if (local951.aClass66Array2 == null) {
									Static127.anIntArray455[local25++] = 0;
									continue;
								}
								local755 = local951.aClass66Array2.length;
								for (local1689 = 0; local1689 < local951.aClass66Array2.length; local1689++) {
									if (local951.aClass66Array2[local1689] == null) {
										local755 = local1689;
										break;
									}
								}
								Static127.anIntArray455[local25++] = local755;
								continue;
							}
							if (local205 == 2704 || local205 == 2705) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								@Pc(2046) Class2_Sub10 local2046 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local750);
								if (local2046 != null && local2046.anInt1896 == local755) {
									Static127.anIntArray455[local25++] = 1;
								} else {
									Static127.anIntArray455[local25++] = 0;
								}
								continue;
							}
						} else if (local205 < 2900) {
							local25--;
							local951 = Static55.method1034(Static127.anIntArray455[local25]);
							if (local205 == 2800) {
								Static127.anIntArray455[local25++] = Static40.method796(Static63.method1160(local951));
								continue;
							}
							if (local205 == 2801) {
								local25--;
								local755 = Static127.anIntArray455[local25];
								local755--;
								if (local951.aClass77Array19 != null && local951.aClass77Array19.length > local755 && local951.aClass77Array19[local755] != null) {
									Static178.aClass77Array27[local27++] = local951.aClass77Array19[local755];
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 2802) {
								if (local951.aClass77_1164 == null) {
									Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								} else {
									Static178.aClass77Array27[local27++] = local951.aClass77_1164;
								}
								continue;
							}
						} else if (local205 < 3200) {
							if (local205 == 3100) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static174.method2943(Static105.aClass77_995, local574, 0);
								continue;
							}
							if (local205 == 3101) {
								local25 -= 2;
								Static59.method1094(Static127.anIntArray455[local25], Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11, Static127.anIntArray455[local25 + 1]);
								continue;
							}
							if (local205 == 3103) {
								Static136.method2285();
								continue;
							}
							if (local205 == 3104) {
								local755 = 0;
								local27--;
								local574 = Static178.aClass77Array27[local27];
								if (local574.method2502()) {
									local755 = local574.method2521();
								}
								Static124.aClass2_Sub18_Sub1_3.method2398(173);
								Static124.aClass2_Sub18_Sub1_3.method2370(local755);
								continue;
							}
							if (local205 == 3105) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static124.aClass2_Sub18_Sub1_3.method2398(148);
								Static124.aClass2_Sub18_Sub1_3.method2384(local574.method2531());
								continue;
							}
							if (local205 == 3106) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static124.aClass2_Sub18_Sub1_3.method2398(53);
								Static124.aClass2_Sub18_Sub1_3.method2389(local574.method2532() + 1);
								Static124.aClass2_Sub18_Sub1_3.method2367(local574);
								continue;
							}
							if (local205 == 3107) {
								local27--;
								local1397 = Static178.aClass77Array27[local27];
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static100.method551(local1397, local750);
								continue;
							}
							if (local205 == 3108) {
								local25 -= 3;
								local750 = Static127.anIntArray455[local25];
								local1689 = Static127.anIntArray455[local25 + 2];
								local755 = Static127.anIntArray455[local25 + 1];
								local6505 = Static55.method1034(local1689);
								Static114.method2018(local755, local750, local6505);
								continue;
							}
							if (local205 == 3109) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local6526 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
								local755 = Static127.anIntArray455[local25 + 1];
								Static114.method2018(local755, local750, local6526);
								continue;
							}
							if (local205 == 3110) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static124.aClass2_Sub18_Sub1_3.method2398(47);
								Static124.aClass2_Sub18_Sub1_3.method2369(local750);
								continue;
							}
						} else if (local205 < 3300) {
							if (local205 == 3200) {
								local25 -= 3;
								Static164.method2753(Static127.anIntArray455[local25 + 2], Static127.anIntArray455[local25 + 1], Static127.anIntArray455[local25]);
								continue;
							}
							if (local205 == 3201) {
								local25--;
								Static132.method2244(Static127.anIntArray455[local25]);
								continue;
							}
							if (local205 == 3202) {
								local25 -= 2;
								Static15.method329(Static127.anIntArray455[local25 + 1], Static127.anIntArray455[local25]);
								continue;
							}
						} else if (local205 < 3400) {
							if (local205 == 3300) {
								Static127.anIntArray455[local25++] = Static143.anInt3513;
								continue;
							}
							if (local205 == 3301) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static87.method1610(local750, local755);
								continue;
							}
							if (local205 == 3302) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static171.method2866(local750, local755);
								continue;
							}
							if (local205 == 3303) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = Static103.method1803(local755, local750);
								continue;
							}
							if (local205 == 3304) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static144.method2434(local750).anInt1920;
								continue;
							}
							if (local205 == 3305) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static147.anIntArray521[local750];
								continue;
							}
							if (local205 == 3306) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static78.anIntArray343[local750];
								continue;
							}
							if (local205 == 3307) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static111.anIntArray428[local750];
								continue;
							}
							if (local205 == 3308) {
								local755 = Static157.anInt3889 + (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7);
								local750 = Static54.anInt1472;
								local1689 = (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7) + Static168.anInt4143;
								Static127.anIntArray455[local25++] = local1689 + (local755 << 14) + (local750 << 28);
								continue;
							}
							if (local205 == 3309) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = local750 >> 14 & 0x3FFF;
								continue;
							}
							if (local205 == 3310) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = local750 >> 28;
								continue;
							}
							if (local205 == 3311) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = local750 & 0x3FFF;
								continue;
							}
							if (local205 == 3312) {
								Static127.anIntArray455[local25++] = Static153.aBoolean154 ? 1 : 0;
								continue;
							}
							if (local205 == 3313) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25] + 32768;
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = Static87.method1610(local750, local755);
								continue;
							}
							if (local205 == 3314) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25] + 32768;
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = Static171.method2866(local750, local755);
								continue;
							}
							if (local205 == 3315) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25] + 32768;
								Static127.anIntArray455[local25++] = Static103.method1803(local755, local750);
								continue;
							}
							if (local205 == 3316) {
								if (Static46.anInt1207 < 2) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = Static46.anInt1207;
								}
								continue;
							}
							if (local205 == 3317) {
								Static127.anIntArray455[local25++] = Static92.anInt2387;
								continue;
							}
							if (local205 == 3318) {
								Static127.anIntArray455[local25++] = Static70.anInt1900;
								continue;
							}
							if (local205 == 3321) {
								Static127.anIntArray455[local25++] = Static162.anInt1247;
								continue;
							}
							if (local205 == 3322) {
								Static127.anIntArray455[local25++] = Static82.anInt2150;
								continue;
							}
							if (local205 == 3323) {
								if (Static46.anInt1207 == 1) {
									Static127.anIntArray455[local25++] = 1;
								} else {
									Static127.anIntArray455[local25++] = 0;
								}
								continue;
							}
							if (local205 == 3324) {
								if (Static162.anInt1251 >= 5 && Static162.anInt1251 <= 9) {
									Static127.anIntArray455[local25++] = Static162.anInt1251;
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3325) {
								if (Static150.anInt3701 <= 0) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = 1;
								}
								continue;
							}
						} else if (local205 < 3500) {
							if (local205 == 3400) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25];
								@Pc(6164) Class2_Sub2_Sub18 local6164 = Static17.method438(local750);
								for (local616 = 0; local616 < local6164.anInt4132; local616++) {
									if (local755 == local6164.anIntArray592[local616]) {
										Static178.aClass77Array27[local27++] = local6164.aClass77Array23[local616];
										local6164 = null;
										break;
									}
								}
								if (local6164 != null) {
									Static178.aClass77Array27[local27++] = local6164.aClass77_1417;
								}
								continue;
							}
							if (local205 == 3408) {
								local25 -= 4;
								local755 = Static127.anIntArray455[local25 + 1];
								local1689 = Static127.anIntArray455[local25 + 2];
								local750 = Static127.anIntArray455[local25];
								local616 = Static127.anIntArray455[local25 + 3];
								@Pc(6234) Class2_Sub2_Sub18 local6234 = Static17.method438(local1689);
								if (local6234.anInt4134 == local750 && local755 == local6234.anInt4133) {
									for (local4409 = 0; local4409 < local6234.anInt4132; local4409++) {
										if (local6234.anIntArray592[local4409] == local616) {
											if (local755 == 115) {
												Static178.aClass77Array27[local27++] = local6234.aClass77Array23[local4409];
											} else {
												Static127.anIntArray455[local25++] = local6234.anIntArray593[local4409];
											}
											local6234 = null;
											break;
										}
									}
									if (local6234 != null) {
										if (local755 == 115) {
											Static178.aClass77Array27[local27++] = local6234.aClass77_1417;
										} else {
											Static127.anIntArray455[local25++] = local6234.anInt4135;
										}
									}
									continue;
								}
								if (local755 == 115) {
									Static178.aClass77Array27[local27++] = Static38.aClass77_435;
								} else {
									Static127.anIntArray455[local25++] = 0;
								}
								continue;
							}
						} else if (local205 < 3700) {
							if (local205 == 3600) {
								if (Static40.anInt1155 == 0) {
									Static127.anIntArray455[local25++] = -2;
								} else if (Static40.anInt1155 == 1) {
									Static127.anIntArray455[local25++] = -1;
								} else {
									Static127.anIntArray455[local25++] = Static51.anInt1395;
								}
								continue;
							}
							if (local205 == 3601) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static40.anInt1155 == 2 && local750 < Static51.anInt1395) {
									Static178.aClass77Array27[local27++] = Static120.aClass77Array7[local750];
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 3602) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static40.anInt1155 == 2 && Static51.anInt1395 > local750) {
									Static127.anIntArray455[local25++] = Static11.anIntArray41[local750];
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3603) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static40.anInt1155 == 2 && local750 < Static51.anInt1395) {
									Static127.anIntArray455[local25++] = Static169.anIntArray599[local750];
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3604) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25--;
								local755 = Static127.anIntArray455[local25];
								Static59.method1096(local574, local755);
								continue;
							}
							if (local205 == 3605) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static53.method1026(local574.method2531());
								continue;
							}
							if (local205 == 3606) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static105.method1832(local574.method2531());
								continue;
							}
							if (local205 == 3607) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static1.method8(local574.method2531());
								continue;
							}
							if (local205 == 3608) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static15.method328(local574.method2531());
								continue;
							}
							if (local205 == 3609) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								if (local574.method2522(Static89.aClass77_906) || local574.method2522(Static8.aClass77_130)) {
									local574 = local574.method2504(7);
								}
								Static127.anIntArray455[local25++] = Static27.method565(local574) ? 1 : 0;
								continue;
							}
							if (local205 == 3611) {
								if (Static96.aClass77_932 == null) {
									Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								} else {
									Static178.aClass77Array27[local27++] = Static96.aClass77_932.method2525();
								}
								continue;
							}
							if (local205 == 3612) {
								if (Static96.aClass77_932 == null) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = Static19.anInt621;
								}
								continue;
							}
							if (local205 == 3613) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static96.aClass77_932 != null && local750 < Static19.anInt621) {
									Static178.aClass77Array27[local27++] = Static33.aClass2_Sub8Array1[local750].aClass77_640.method2525();
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 3614) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static96.aClass77_932 != null && local750 < Static19.anInt621) {
									Static127.anIntArray455[local25++] = Static33.aClass2_Sub8Array1[local750].anInt1679;
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3615) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static96.aClass77_932 != null && local750 < Static19.anInt621) {
									Static127.anIntArray455[local25++] = Static33.aClass2_Sub8Array1[local750].aByte4;
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3616) {
								Static127.anIntArray455[local25++] = Static105.aByte7;
								continue;
							}
							if (local205 == 3617) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static149.method2541(local574);
								continue;
							}
							if (local205 == 3618) {
								Static127.anIntArray455[local25++] = Static177.aByte9;
								continue;
							}
							if (local205 == 3619) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static168.method2800(local574.method2531());
								continue;
							}
							if (local205 == 3620) {
								Static7.method123();
								continue;
							}
							if (local205 == 3621) {
								if (Static40.anInt1155 == 0) {
									Static127.anIntArray455[local25++] = -1;
								} else {
									Static127.anIntArray455[local25++] = Static181.anInt4605;
								}
								continue;
							}
							if (local205 == 3622) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static40.anInt1155 != 0 && local750 < Static181.anInt4605) {
									Static178.aClass77Array27[local27++] = Static107.method1884(Static72.aLongArray4[local750]).method2525();
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 3623) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								if (local574.method2522(Static89.aClass77_906) || local574.method2522(Static8.aClass77_130)) {
									local574 = local574.method2504(7);
								}
								Static127.anIntArray455[local25++] = Static93.method1683(local574) ? 1 : 0;
								continue;
							}
							if (local205 == 3624) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (Static33.aClass2_Sub8Array1 != null && Static19.anInt621 > local750 && Static33.aClass2_Sub8Array1[local750].aClass77_640.method2508(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482)) {
									Static127.anIntArray455[local25++] = 1;
									continue;
								}
								Static127.anIntArray455[local25++] = 0;
								continue;
							}
							if (local205 == 3625) {
								if (Static98.aClass77_956 == null) {
									Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								} else {
									Static178.aClass77Array27[local27++] = Static98.aClass77_956.method2525();
								}
								continue;
							}
						} else if (local205 < 4000) {
							if (local205 == 3903) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].method1688();
								continue;
							}
							if (local205 == 3904) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].anInt2404;
								continue;
							}
							if (local205 == 3905) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].anInt2402;
								continue;
							}
							if (local205 == 3906) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].anInt2408;
								continue;
							}
							if (local205 == 3907) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].anInt2406;
								continue;
							}
							if (local205 == 3908) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static80.aClass49Array1[local750].anInt2403;
								continue;
							}
							if (local205 == 3910) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local755 = Static80.aClass49Array1[local750].method1690();
								Static127.anIntArray455[local25++] = local755 == 0 ? 1 : 0;
								continue;
							}
							if (local205 == 3911) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local755 = Static80.aClass49Array1[local750].method1690();
								Static127.anIntArray455[local25++] = local755 == 2 ? 1 : 0;
								continue;
							}
							if (local205 == 3912) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local755 = Static80.aClass49Array1[local750].method1690();
								Static127.anIntArray455[local25++] = local755 == 5 ? 1 : 0;
								continue;
							}
						} else if (local205 < 4100) {
							if (local205 == 4000) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 + local750;
								continue;
							}
							if (local205 == 4001) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local750 - local755;
								continue;
							}
							if (local205 == 4002) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local750 * local755;
								continue;
							}
							if (local205 == 4003) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = local750 / local755;
								continue;
							}
							if (local205 == 4004) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = (int) (Math.random() * (double) local750);
								continue;
							}
							if (local205 == 4005) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = (int) (Math.random() * (double) (local750 + 1));
								continue;
							}
							if (local205 == 4006) {
								local25 -= 5;
								local616 = Static127.anIntArray455[local25 + 3];
								local1689 = Static127.anIntArray455[local25 + 2];
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								local637 = Static127.anIntArray455[local25 + 4];
								Static127.anIntArray455[local25++] = local750 + (local755 - local750) * (local637 + -local1689) / (local616 - local1689);
								continue;
							}
							if (local205 == 4007) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 * local750 / 100 + local750;
								continue;
							}
							if (local205 == 4008) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = 0x1 << local755 | local750;
								continue;
							}
							if (local205 == 4009) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local750 & -(0x1 << local755) - 1;
								continue;
							}
							if (local205 == 4010) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = (0x1 << local755 & local750) == 0 ? 0 : 1;
								continue;
							}
							if (local205 == 4011) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local750 % local755;
								continue;
							}
							if (local205 == 4012) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								if (local750 == 0) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = (int) Math.pow((double) local750, (double) local755);
								}
								continue;
							}
							if (local205 == 4013) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25 + 1];
								local750 = Static127.anIntArray455[local25];
								if (local750 == 0) {
									Static127.anIntArray455[local25++] = 0;
								} else if (local755 == 0) {
									Static127.anIntArray455[local25++] = Integer.MAX_VALUE;
								} else {
									Static127.anIntArray455[local25++] = (int) Math.pow((double) local750, 1.0D / (double) local755);
								}
								continue;
							}
							if (local205 == 4014) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 & local750;
								continue;
							}
							if (local205 == 4015) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 | local750;
								continue;
							}
							if (local205 == 4016) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 <= local750 ? local755 : local750;
								continue;
							}
							if (local205 == 4017) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local755 >= local750 ? local755 : local750;
								continue;
							}
							if (local205 == 4018) {
								local25 -= 3;
								@Pc(5487) long local5487 = (long) Static127.anIntArray455[local25];
								@Pc(5494) long local5494 = (long) Static127.anIntArray455[local25 + 2];
								@Pc(5501) long local5501 = (long) Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = (int) (local5494 * local5487 / local5501);
								continue;
							}
						} else if (local205 < 4200) {
							if (local205 == 4100) {
								local25--;
								local755 = Static127.anIntArray455[local25];
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static178.aClass77Array27[local27++] = Static146.method2168(new Class77[] { local574, Static2.method61(local755) });
								continue;
							}
							if (local205 == 4101) {
								local27 -= 2;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static178.aClass77Array27[local27 + 1];
								Static178.aClass77Array27[local27++] = Static146.method2168(new Class77[] { local574, local1397 });
								continue;
							}
							if (local205 == 4102) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25--;
								local755 = Static127.anIntArray455[local25];
								Static178.aClass77Array27[local27++] = Static146.method2168(new Class77[] { local574, Static106.method1859(local755) });
								continue;
							}
							if (local205 == 4103) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static178.aClass77Array27[local27++] = local574.method2529();
								continue;
							}
							if (local205 == 4104) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								@Pc(4391) long local4391 = ((long) local750 + 11745L) * 86400000L;
								Static130.aCalendar1.setTime(new Date(local4391));
								local616 = Static130.aCalendar1.get(5);
								local637 = Static130.aCalendar1.get(2);
								local4409 = Static130.aCalendar1.get(1);
								Static178.aClass77Array27[local27++] = Static146.method2168(new Class77[] { Static2.method61(local616), Static72.aClass77_778, Static96.aClass77Array16[local637], Static72.aClass77_778, Static2.method61(local4409) });
								continue;
							}
							if (local205 == 4105) {
								local27 -= 2;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static178.aClass77Array27[local27 + 1];
								if (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2 != null && Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2.aBoolean1) {
									Static178.aClass77Array27[local27++] = local1397;
									continue;
								}
								Static178.aClass77Array27[local27++] = local574;
								continue;
							}
							if (local205 == 4106) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static178.aClass77Array27[local27++] = Static2.method61(local750);
								continue;
							}
							if (local205 == 4107) {
								local27 -= 2;
								Static127.anIntArray455[local25++] = Static178.aClass77Array27[local27].method2534(Static178.aClass77Array27[local27 + 1]);
								continue;
							}
							@Pc(4553) Class2_Sub2_Sub3_Sub4_Sub1 local4553;
							@Pc(4548) byte[] local4548;
							if (local205 == 4108) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25 -= 2;
								local755 = Static127.anIntArray455[local25];
								local1689 = Static127.anIntArray455[local25 + 1];
								local4548 = Static28.aClass43_Sub1_4.method2205(0, local1689);
								local4553 = new Class2_Sub2_Sub3_Sub4_Sub1(local4548);
								Static127.anIntArray455[local25++] = local4553.method1278(local574, local755);
								continue;
							}
							if (local205 == 4109) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25 -= 2;
								local755 = Static127.anIntArray455[local25];
								local1689 = Static127.anIntArray455[local25 + 1];
								local4548 = Static28.aClass43_Sub1_4.method2205(0, local1689);
								local4553 = new Class2_Sub2_Sub3_Sub4_Sub1(local4548);
								Static127.anIntArray455[local25++] = local4553.method1264(local574, local755);
								continue;
							}
							if (local205 == 4110) {
								local27 -= 2;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static178.aClass77Array27[local27 + 1];
								local25--;
								if (Static127.anIntArray455[local25] == 1) {
									Static178.aClass77Array27[local27++] = local574;
								} else {
									Static178.aClass77Array27[local27++] = local1397;
								}
								continue;
							}
							if (local205 == 4111) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								Static178.aClass77Array27[local27++] = Static102.method1279(local574);
								continue;
							}
							if (local205 == 4112) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25--;
								local755 = Static127.anIntArray455[local25];
								Static178.aClass77Array27[local27++] = local574.method2535(local755);
								continue;
							}
							if (local205 == 4113) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static159.method2696(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4114) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static153.method2608(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4115) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static30.method611(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4116) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static141.method2402(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4117) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								if (local574 == null) {
									Static127.anIntArray455[local25++] = 0;
								} else {
									Static127.anIntArray455[local25++] = local574.method2532();
								}
								continue;
							}
							if (local205 == 4118) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25];
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local1689 = Static127.anIntArray455[local25 + 1];
								Static178.aClass77Array27[local27++] = local574.method2530(local755, local1689);
								continue;
							}
							if (local205 == 4119) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static90.method1664(local574.method2532());
								@Pc(4850) boolean local4850 = false;
								for (local616 = 0; local616 < local574.method2532(); local616++) {
									local637 = local574.method2526(local616);
									if (local637 == 60) {
										local4850 = true;
									} else if (local637 == 62) {
										local4850 = false;
									} else if (!local4850) {
										local1397.method2538(local637);
									}
								}
								local1397.method2517();
								Static178.aClass77Array27[local27++] = local1397;
								continue;
							}
							if (local205 == 4120) {
								local25 -= 2;
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local755 = Static127.anIntArray455[local25];
								local1689 = Static127.anIntArray455[local25 + 1];
								Static127.anIntArray455[local25++] = local574.method2509(local755, local1689);
								continue;
							}
							if (local205 == 4121) {
								local27 -= 2;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static178.aClass77Array27[local27 + 1];
								local25--;
								local1689 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = local574.method2537(local1689, local1397);
								continue;
							}
						} else if (local205 < 4300) {
							if (local205 == 4200) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static178.aClass77Array27[local27++] = Static158.method2689(local750).aClass77_717;
								continue;
							}
							@Pc(3945) Class2_Sub2_Sub9 local3945;
							if (local205 == 4201) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								local3945 = Static158.method2689(local750);
								if (local755 >= 1 && local755 <= 5 && local3945.aClass77Array14[local755 - 1] != null) {
									Static178.aClass77Array27[local27++] = local3945.aClass77Array14[local755 - 1];
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 4202) {
								local25 -= 2;
								local750 = Static127.anIntArray455[local25];
								local755 = Static127.anIntArray455[local25 + 1];
								local3945 = Static158.method2689(local750);
								if (local755 >= 1 && local755 <= 5 && local3945.aClass77Array15[local755 - 1] != null) {
									Static178.aClass77Array27[local27++] = local3945.aClass77Array15[local755 - 1];
									continue;
								}
								Static178.aClass77Array27[local27++] = Static105.aClass77_995;
								continue;
							}
							if (local205 == 4203) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static158.method2689(local750).anInt1794;
								continue;
							}
							if (local205 == 4204) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static158.method2689(local750).anInt1795 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4096) Class2_Sub2_Sub9 local4096;
							if (local205 == 4205) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local4096 = Static158.method2689(local750);
								if (local4096.anInt1799 == -1 && local4096.anInt1779 >= 0) {
									Static127.anIntArray455[local25++] = local4096.anInt1779;
									continue;
								}
								Static127.anIntArray455[local25++] = local750;
								continue;
							}
							if (local205 == 4206) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local4096 = Static158.method2689(local750);
								if (local4096.anInt1799 >= 0 && local4096.anInt1779 >= 0) {
									Static127.anIntArray455[local25++] = local4096.anInt1779;
									continue;
								}
								Static127.anIntArray455[local25++] = local750;
								continue;
							}
							if (local205 == 4207) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								Static127.anIntArray455[local25++] = Static158.method2689(local750).aBoolean81 ? 1 : 0;
								continue;
							}
							if (local205 == 4210) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local25--;
								local755 = Static127.anIntArray455[local25];
								Static94.method1691(local755 == 1, local574);
								Static127.anIntArray455[local25++] = Static18.anInt616;
								continue;
							}
							if (local205 == 4211) {
								if (Static70.aShortArray69 != null && Static18.anInt616 > Static14.anInt475) {
									Static127.anIntArray455[local25++] = Static70.aShortArray69[Static14.anInt475++] & 0xFFFF;
									continue;
								}
								Static127.anIntArray455[local25++] = -1;
								continue;
							}
							if (local205 == 4212) {
								Static14.anInt475 = 0;
								continue;
							}
						} else if (local205 < 5100) {
							if (local205 == 5000) {
								Static127.anIntArray455[local25++] = Static38.anInt1109;
								continue;
							}
							if (local205 == 5001) {
								local25 -= 3;
								Static38.anInt1109 = Static127.anIntArray455[local25];
								Static27.anInt816 = Static127.anIntArray455[local25 + 1];
								Static66.anInt1833 = Static127.anIntArray455[local25 + 2];
								Static124.aClass2_Sub18_Sub1_3.method2398(168);
								Static124.aClass2_Sub18_Sub1_3.method2389(Static38.anInt1109);
								Static124.aClass2_Sub18_Sub1_3.method2389(Static27.anInt816);
								Static124.aClass2_Sub18_Sub1_3.method2389(Static66.anInt1833);
								continue;
							}
							if (local205 == 5002) {
								local25 -= 2;
								local755 = Static127.anIntArray455[local25];
								local27--;
								local574 = Static178.aClass77Array27[local27];
								local1689 = Static127.anIntArray455[local25 + 1];
								Static124.aClass2_Sub18_Sub1_3.method2398(22);
								Static124.aClass2_Sub18_Sub1_3.method2384(local574.method2531());
								Static124.aClass2_Sub18_Sub1_3.method2389(local755 - 1);
								Static124.aClass2_Sub18_Sub1_3.method2389(local1689);
								continue;
							}
							if (local205 == 5003) {
								local1397 = null;
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (local750 < 100) {
									local1397 = Static9.aClass77Array3[local750];
								}
								if (local1397 == null) {
									local1397 = Static105.aClass77_995;
								}
								Static178.aClass77Array27[local27++] = local1397;
								continue;
							}
							if (local205 == 5004) {
								local755 = -1;
								local25--;
								local750 = Static127.anIntArray455[local25];
								if (local750 < 100 && Static9.aClass77Array3[local750] != null) {
									local755 = Static44.anIntArray185[local750];
								}
								Static127.anIntArray455[local25++] = local755;
								continue;
							}
							if (local205 == 5005) {
								Static127.anIntArray455[local25++] = Static27.anInt816;
								continue;
							}
							if (local205 == 5008) {
								local27--;
								local574 = Static178.aClass77Array27[local27];
								if (local574.method2522(Static61.aClass77_634)) {
									Static11.method177(local574);
								} else {
									local1397 = local574.method2529();
									@Pc(3134) byte local3134 = 0;
									if (local1397.method2522(Static41.aClass77_469)) {
										local574 = local574.method2504(Static41.aClass77_469.method2532());
										local3134 = 0;
									} else if (local1397.method2522(Static25.aClass77_316)) {
										local3134 = 1;
										local574 = local574.method2504(Static25.aClass77_316.method2532());
									} else if (local1397.method2522(Static106.aClass77_1010)) {
										local3134 = 2;
										local574 = local574.method2504(Static106.aClass77_1010.method2532());
									} else if (local1397.method2522(Static90.aClass77_908)) {
										local3134 = 3;
										local574 = local574.method2504(Static90.aClass77_908.method2532());
									} else if (local1397.method2522(Static171.aClass77_1448)) {
										local3134 = 4;
										local574 = local574.method2504(Static171.aClass77_1448.method2532());
									} else if (local1397.method2522(Static15.aClass77_232)) {
										local3134 = 5;
										local574 = local574.method2504(Static15.aClass77_232.method2532());
									} else if (local1397.method2522(Static13.aClass77_194)) {
										local3134 = 6;
										local574 = local574.method2504(Static13.aClass77_194.method2532());
									} else if (local1397.method2522(Static55.aClass77_587)) {
										local574 = local574.method2504(Static55.aClass77_587.method2532());
										local3134 = 7;
									} else if (local1397.method2522(Static48.aClass77_513)) {
										local574 = local574.method2504(Static48.aClass77_513.method2532());
										local3134 = 8;
									} else if (local1397.method2522(Static146.aClass77_1123)) {
										local574 = local574.method2504(Static146.aClass77_1123.method2532());
										local3134 = 9;
									} else if (local1397.method2522(Static60.aClass77_622)) {
										local574 = local574.method2504(Static60.aClass77_622.method2532());
										local3134 = 10;
									} else if (local1397.method2522(Static123.aClass77_1115)) {
										local3134 = 11;
										local574 = local574.method2504(Static123.aClass77_1115.method2532());
									} else if (Static136.anInt3303 != 0) {
										if (local1397.method2522(Static41.aClass77_470)) {
											local574 = local574.method2504(Static41.aClass77_470.method2532());
											local3134 = 0;
										} else if (local1397.method2522(Static25.aClass77_312)) {
											local574 = local574.method2504(Static25.aClass77_312.method2532());
											local3134 = 1;
										} else if (local1397.method2522(Static106.aClass77_1006)) {
											local3134 = 2;
											local574 = local574.method2504(Static106.aClass77_1006.method2532());
										} else if (local1397.method2522(Static90.aClass77_910)) {
											local3134 = 3;
											local574 = local574.method2504(Static90.aClass77_910.method2532());
										} else if (local1397.method2522(Static171.aClass77_1450)) {
											local574 = local574.method2504(Static171.aClass77_1450.method2532());
											local3134 = 4;
										} else if (local1397.method2522(Static15.aClass77_230)) {
											local574 = local574.method2504(Static15.aClass77_230.method2532());
											local3134 = 5;
										} else if (local1397.method2522(Static13.aClass77_191)) {
											local574 = local574.method2504(Static13.aClass77_191.method2532());
											local3134 = 6;
										} else if (local1397.method2522(Static55.aClass77_590)) {
											local574 = local574.method2504(Static55.aClass77_590.method2532());
											local3134 = 7;
										} else if (local1397.method2522(Static48.aClass77_514)) {
											local3134 = 8;
											local574 = local574.method2504(Static48.aClass77_514.method2532());
										} else if (local1397.method2522(Static146.aClass77_1124)) {
											local574 = local574.method2504(Static146.aClass77_1124.method2532());
											local3134 = 9;
										} else if (local1397.method2522(Static60.aClass77_626)) {
											local574 = local574.method2504(Static60.aClass77_626.method2532());
											local3134 = 10;
										} else if (local1397.method2522(Static123.aClass77_1116)) {
											local574 = local574.method2504(Static123.aClass77_1116.method2532());
											local3134 = 11;
										}
									}
									local1397 = local574.method2529();
									@Pc(3551) byte local3551 = 0;
									if (local1397.method2522(Static110.aClass77_1220)) {
										local3551 = 1;
										local574 = local574.method2504(Static110.aClass77_1220.method2532());
									} else if (local1397.method2522(Static97.aClass77_946)) {
										local3551 = 2;
										local574 = local574.method2504(Static97.aClass77_946.method2532());
									} else if (local1397.method2522(Static82.aClass77_850)) {
										local3551 = 3;
										local574 = local574.method2504(Static82.aClass77_850.method2532());
									} else if (local1397.method2522(Static126.aClass77_898)) {
										local574 = local574.method2504(Static126.aClass77_898.method2532());
										local3551 = 4;
									} else if (local1397.method2522(Static133.aClass77_1168)) {
										local574 = local574.method2504(Static133.aClass77_1168.method2532());
										local3551 = 5;
									} else if (Static136.anInt3303 != 0) {
										if (local1397.method2522(Static110.aClass77_1223)) {
											local574 = local574.method2504(Static110.aClass77_1223.method2532());
											local3551 = 1;
										} else if (local1397.method2522(Static97.aClass77_948)) {
											local574 = local574.method2504(Static97.aClass77_948.method2532());
											local3551 = 2;
										} else if (local1397.method2522(Static82.aClass77_852)) {
											local574 = local574.method2504(Static82.aClass77_852.method2532());
											local3551 = 3;
										} else if (local1397.method2522(Static126.aClass77_899)) {
											local574 = local574.method2504(Static126.aClass77_899.method2532());
											local3551 = 4;
										} else if (local1397.method2522(Static133.aClass77_1165)) {
											local3551 = 5;
											local574 = local574.method2504(Static133.aClass77_1165.method2532());
										}
									}
									Static124.aClass2_Sub18_Sub1_3.method2398(4);
									Static124.aClass2_Sub18_Sub1_3.method2389(0);
									local637 = Static124.aClass2_Sub18_Sub1_3.anInt3423;
									Static124.aClass2_Sub18_Sub1_3.method2389(local3134);
									Static124.aClass2_Sub18_Sub1_3.method2389(local3551);
									Static10.method149(local574, Static124.aClass2_Sub18_Sub1_3);
									Static124.aClass2_Sub18_Sub1_3.method2371(Static124.aClass2_Sub18_Sub1_3.anInt3423 - local637);
								}
								continue;
							}
							if (local205 == 5009) {
								local27 -= 2;
								local574 = Static178.aClass77Array27[local27];
								local1397 = Static178.aClass77Array27[local27 + 1];
								Static124.aClass2_Sub18_Sub1_3.method2398(34);
								Static124.aClass2_Sub18_Sub1_3.method2389(0);
								local1689 = Static124.aClass2_Sub18_Sub1_3.anInt3423;
								Static124.aClass2_Sub18_Sub1_3.method2384(local574.method2531());
								Static10.method149(local1397, Static124.aClass2_Sub18_Sub1_3);
								Static124.aClass2_Sub18_Sub1_3.method2371(Static124.aClass2_Sub18_Sub1_3.anInt3423 - local1689);
								continue;
							}
							if (local205 == 5010) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local1397 = null;
								if (local750 < 100) {
									local1397 = Static107.aClass77Array17[local750];
								}
								if (local1397 == null) {
									local1397 = Static105.aClass77_995;
								}
								Static178.aClass77Array27[local27++] = local1397;
								continue;
							}
							if (local205 == 5011) {
								local25--;
								local750 = Static127.anIntArray455[local25];
								local1397 = null;
								if (local750 < 100) {
									local1397 = Static166.aClass77Array25[local750];
								}
								if (local1397 == null) {
									local1397 = Static105.aClass77_995;
								}
								Static178.aClass77Array27[local27++] = local1397;
								continue;
							}
							if (local205 == 5015) {
								if (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11 == null || Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482 == null) {
									local574 = Static39.aClass77_446;
								} else {
									local574 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482;
								}
								Static178.aClass77Array27[local27++] = local574;
								continue;
							}
							if (local205 == 5016) {
								Static127.anIntArray455[local25++] = Static66.anInt1833;
								continue;
							}
							if (local205 == 5017) {
								Static127.anIntArray455[local25++] = Static137.anInt3306;
								continue;
							}
						}
					}
				} else {
					if (local205 >= 2000) {
						local205 -= 1000;
						local25--;
						local951 = Static55.method1034(Static127.anIntArray455[local25]);
					} else {
						local951 = local917 ? Static64.aClass66_7 : Static30.aClass66_2;
					}
					if (local205 == 1000) {
						local25 -= 2;
						local951.anInt3184 = Static127.anIntArray455[local25];
						local951.anInt3242 = Static127.anIntArray455[local25 + 1];
						Static57.method2994(local951);
						continue;
					}
					if (local205 == 1001) {
						local25 -= 2;
						local951.anInt3227 = Static127.anIntArray455[local25];
						local951.anInt3168 = Static127.anIntArray455[local25 + 1];
						Static57.method2994(local951);
						continue;
					}
					if (local205 == 1003) {
						local25--;
						@Pc(1016) boolean local1016 = Static127.anIntArray455[local25] == 1;
						if (local1016 != local951.aBoolean135) {
							local951.aBoolean135 = local1016;
							Static57.method2994(local951);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7827) Exception local7827) {
			if (local18.aClass77_144 == null) {
				if (Static18.anInt619 != 0) {
					Static174.method2943(Static105.aClass77_995, Static61.aClass77_633, 0);
				}
				Static19.method441("CS2 - scr:" + local18.aLong134 + " op:" + local37, local7827);
			} else {
				@Pc(7834) Class77 local7834 = Static90.method1664(30);
				local7834.method2503(Static167.aClass77_1414).method2503(local18.aClass77_144);
				for (local55 = Static142.anInt3476 - 1; local55 >= 0; local55--) {
					local7834.method2503(Static154.aClass77_1312).method2503(Static96.aClass17Array1[local55].aClass2_Sub2_Sub2_1.aClass77_144);
				}
				if (local37 == 40) {
					local68 = local35[local32];
					local7834.method2503(Static28.aClass77_341).method2503(Static2.method61(local68));
				}
				if (Static18.anInt619 != 0) {
					Static174.method2943(Static105.aClass77_995, Static146.method2168(new Class77[] { Static147.aClass77_1260, local18.aClass77_144 }), 0);
				}
				Static19.method441("CS2 - scr:" + local18.aLong134 + " op:" + local37 + new String(local7834.method2506()), local7827);
			}
		}
	}
}
