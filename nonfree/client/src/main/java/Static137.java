import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "J")
	public static long aLong109;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1057 = Static120.method2057("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1058 = Static120.method2057("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1059 = Static120.method2057("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)I")
	public static int method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return (4096 - arg1) * arg0 + arg1 * arg2 >> 12;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V")
	private static void method2308(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static114.aClass1_Sub2_Sub2_Sub3_7.anIntArray288;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (103 - local29) * 4 * 512 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static43.aByteArrayArrayArray2[arg0][local44][local29] & 0x18) == 0) {
					Static163.method2850(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray2[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static163.method2850(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) + 228;
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static114.aClass1_Sub2_Sub2_Sub3_7.method2127();
		@Pc(143) int local143;
		for (@Pc(139) int local139 = 1; local139 < 103; local139++) {
			for (local143 = 1; local143 < 103; local143++) {
				if ((Static43.aByteArrayArrayArray2[arg0][local143][local139] & 0x18) == 0) {
					Static120.method2060(arg0, local44, local139, local143, local42);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray2[arg0 + 1][local143][local139] & 0x8) != 0) {
					Static120.method2060(arg0 + 1, local44, local139, local143, local42);
				}
			}
		}
		Static152.anInt3466 = 0;
		for (local143 = 0; local143 < 104; local143++) {
			for (@Pc(202) int local202 = 0; local202 < 104; local202++) {
				@Pc(209) long local209 = Static48.method2781(Static44.anInt1086, local143, local202);
				if (local209 != 0L) {
					@Pc(225) int local225 = Static14.method220(Integer.MAX_VALUE & (int) (local209 >>> 32)).anInt1273;
					if (local225 >= 0) {
						@Pc(232) int local232 = local202;
						@Pc(234) int local234 = local143;
						if (local225 != 22 && local225 != 29 && local225 != 34 && local225 != 36 && local225 != 46 && local225 != 47 && local225 != 48) {
							@Pc(266) int[][] local266 = Static141.aClass28Array2[Static44.anInt1086].anIntArrayArray8;
							for (@Pc(268) int local268 = 0; local268 < 10; local268++) {
								@Pc(275) int local275 = (int) (Math.random() * 4.0D);
								if (local275 == 0 && local234 > 0 && local234 > local143 - 3 && (local266[local234 - 1][local232] & 0x12C0108) == 0) {
									local234--;
								}
								if (local275 == 1 && local234 < 103 && local143 + 3 > local234 && (local266[local234 + 1][local232] & 0x12C0180) == 0) {
									local234++;
								}
								if (local275 == 2 && local232 > 0 && local202 - 3 < local232 && (local266[local234][local232 - 1] & 0x12C0102) == 0) {
									local232--;
								}
								if (local275 == 3 && local232 < 103 && local232 < local202 + 3 && (local266[local234][local232 + 1] & 0x12C0120) == 0) {
									local232++;
								}
							}
						}
						Static63.aClass1_Sub2_Sub2_Sub3Array4[Static152.anInt3466] = Static131.aClass1_Sub2_Sub2_Sub3Array9[local225];
						Static174.anIntArray415[Static152.anInt3466] = local234;
						Static12.anIntArray434[Static152.anInt3466] = local232;
						Static152.anInt3466++;
					}
				}
			}
		}
		Static147.aClass34_1.method1636();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ad;)V")
	public static void method2309(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray1;
		@Pc(22) int local22 = (Integer) local8[0];
		@Pc(26) Class1_Sub2_Sub9 local26 = Static47.method854(local22);
		if (local26 == null) {
			return;
		}
		@Pc(31) int local31 = 0;
		Static29.anInt755 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(40) int[] local40 = local26.anIntArray135;
		@Pc(43) int[] local43 = local26.anIntArray136;
		@Pc(45) byte local45 = -1;
		@Pc(59) int local59;
		@Pc(97) int local97;
		try {
			Static172.anIntArray420 = new int[local26.anInt1660];
			@Pc(51) int local51 = 0;
			Static116.aClass81Array13 = new Class81[local26.anInt1654];
			@Pc(57) int local57 = 0;
			for (local59 = 1; local59 < local8.length; local59++) {
				if (local8[local59] instanceof Integer) {
					local97 = (Integer) local8[local59];
					if (local97 == -2147483647) {
						local97 = arg1.anInt144;
					}
					if (local97 == -2147483646) {
						local97 = arg1.anInt138;
					}
					if (local97 == -2147483645) {
						local97 = arg1.aClass77_1 == null ? -1 : arg1.aClass77_1.anInt3231;
					}
					if (local97 == -2147483644) {
						local97 = arg1.anInt143;
					}
					if (local97 == -2147483643) {
						local97 = arg1.aClass77_1 == null ? -1 : arg1.aClass77_1.anInt3189;
					}
					if (local97 == -2147483642) {
						local97 = arg1.aClass77_2 == null ? -1 : arg1.aClass77_2.anInt3231;
					}
					if (local97 == -2147483641) {
						local97 = arg1.aClass77_2 == null ? -1 : arg1.aClass77_2.anInt3189;
					}
					if (local97 == -2147483640) {
						local97 = arg1.anInt145;
					}
					if (local97 == -2147483639) {
						local97 = arg1.anInt142;
					}
					Static172.anIntArray420[local51++] = local97;
				} else if (local8[local59] instanceof Class81) {
					@Pc(76) Class81 local76 = (Class81) local8[local59];
					if (local76.method2800(Static74.aClass81_616)) {
						local76 = arg1.aClass81_50;
					}
					Static116.aClass81Array13[local57++] = local76;
				}
			}
			local97 = 0;
			label2241: while (true) {
				local97++;
				if (local97 > arg0) {
					throw new RuntimeException("slow");
				}
				local37++;
				@Pc(219) int local219 = local40[local37];
				@Pc(785) int local785;
				@Pc(630) int local630;
				@Pc(780) int local780;
				@Pc(654) int local654;
				@Pc(586) Class81 local586;
				if (local219 < 100) {
					if (local219 == 0) {
						Static53.anIntArray109[local31++] = local43[local37];
						continue;
					}
					@Pc(245) int local245;
					if (local219 == 1) {
						local245 = local43[local37];
						Static53.anIntArray109[local31++] = Static83.anIntArray178[local245];
						continue;
					}
					if (local219 == 2) {
						local245 = local43[local37];
						local31--;
						Static83.anIntArray178[local245] = Static53.anIntArray109[local31];
						continue;
					}
					if (local219 == 3) {
						Static168.aClass81Array20[local35++] = local26.aClass81Array6[local37];
						continue;
					}
					if (local219 == 6) {
						local37 += local43[local37];
						continue;
					}
					if (local219 == 7) {
						local31 -= 2;
						if (Static53.anIntArray109[local31 + 1] != Static53.anIntArray109[local31]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 8) {
						local31 -= 2;
						if (Static53.anIntArray109[local31] == Static53.anIntArray109[local31 + 1]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 9) {
						local31 -= 2;
						if (Static53.anIntArray109[local31] < Static53.anIntArray109[local31 + 1]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 10) {
						local31 -= 2;
						if (Static53.anIntArray109[local31 + 1] < Static53.anIntArray109[local31]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 21) {
						if (Static29.anInt755 == 0) {
							return;
						}
						@Pc(411) Class15 local411 = Static11.aClass15Array2[--Static29.anInt755];
						Static116.aClass81Array13 = local411.aClass81Array3;
						Static172.anIntArray420 = local411.anIntArray77;
						local26 = local411.aClass1_Sub2_Sub9_1;
						local37 = local411.anInt975;
						local40 = local26.anIntArray135;
						local43 = local26.anIntArray136;
						continue;
					}
					if (local219 == 25) {
						local245 = local43[local37];
						Static53.anIntArray109[local31++] = Static103.method1704(local245);
						continue;
					}
					if (local219 == 27) {
						local245 = local43[local37];
						local31--;
						Static103.method1705(local245, Static53.anIntArray109[local31]);
						continue;
					}
					if (local219 == 31) {
						local31 -= 2;
						if (Static53.anIntArray109[local31] <= Static53.anIntArray109[local31 + 1]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 32) {
						local31 -= 2;
						if (Static53.anIntArray109[local31] >= Static53.anIntArray109[local31 + 1]) {
							local37 += local43[local37];
						}
						continue;
					}
					if (local219 == 33) {
						Static53.anIntArray109[local31++] = Static172.anIntArray420[local43[local37]];
						continue;
					}
					@Pc(528) int local528;
					if (local219 == 34) {
						local528 = local43[local37];
						local31--;
						Static172.anIntArray420[local528] = Static53.anIntArray109[local31];
						continue;
					}
					if (local219 == 35) {
						Static168.aClass81Array20[local35++] = Static116.aClass81Array13[local43[local37]];
						continue;
					}
					if (local219 == 36) {
						local528 = local43[local37];
						local35--;
						Static116.aClass81Array13[local528] = Static168.aClass81Array20[local35];
						continue;
					}
					if (local219 == 37) {
						local245 = local43[local37];
						local35 -= local245;
						local586 = Static181.method3108(Static168.aClass81Array20, local245, local35);
						Static168.aClass81Array20[local35++] = local586;
						continue;
					}
					if (local219 == 38) {
						local31--;
						continue;
					}
					if (local219 == 39) {
						local35--;
						continue;
					}
					if (local219 == 40) {
						local245 = local43[local37];
						@Pc(620) Class1_Sub2_Sub9 local620 = Static47.method854(local245);
						@Pc(624) int[] local624 = new int[local620.anInt1660];
						@Pc(628) Class81[] local628 = new Class81[local620.anInt1654];
						for (local630 = 0; local630 < local620.anInt1653; local630++) {
							local624[local630] = Static53.anIntArray109[local630 + local31 - local620.anInt1653];
						}
						for (local654 = 0; local654 < local620.anInt1652; local654++) {
							local628[local654] = Static168.aClass81Array20[local654 + local35 - local620.anInt1652];
						}
						local31 -= local620.anInt1653;
						local35 -= local620.anInt1652;
						@Pc(691) Class15 local691 = new Class15();
						local691.aClass81Array3 = Static116.aClass81Array13;
						local691.anInt975 = local37;
						local691.anIntArray77 = Static172.anIntArray420;
						local691.aClass1_Sub2_Sub9_1 = local26;
						if (Static11.aClass15Array2.length <= Static29.anInt755) {
							throw new RuntimeException();
						}
						local26 = local620;
						Static11.aClass15Array2[Static29.anInt755++] = local691;
						Static172.anIntArray420 = local624;
						local43 = local620.anIntArray136;
						Static116.aClass81Array13 = local628;
						local37 = -1;
						local40 = local620.anIntArray135;
						continue;
					}
					if (local219 == 42) {
						Static53.anIntArray109[local31++] = Static58.anIntArray117[local43[local37]];
						continue;
					}
					if (local219 == 43) {
						local528 = local43[local37];
						local31--;
						Static58.anIntArray117[local528] = Static53.anIntArray109[local31];
						continue;
					}
					if (local219 == 44) {
						local780 = local43[local37] & 0xFFFF;
						local31--;
						local785 = Static53.anIntArray109[local31];
						local245 = local43[local37] >> 16;
						if (local785 >= 0 && local785 <= 5000) {
							@Pc(802) byte local802 = -1;
							if (local780 == 105) {
								local802 = 0;
							}
							Static75.anIntArray173[local245] = local785;
							local630 = 0;
							while (true) {
								if (local630 >= local785) {
									continue label2241;
								}
								Static114.anIntArrayArray20[local245][local630] = local802;
								local630++;
							}
						}
						throw new RuntimeException();
					}
					if (local219 == 45) {
						local31--;
						local780 = Static53.anIntArray109[local31];
						local245 = local43[local37];
						if (local780 >= 0 && local780 < Static75.anIntArray173[local245]) {
							Static53.anIntArray109[local31++] = Static114.anIntArrayArray20[local245][local780];
							continue;
						}
						throw new RuntimeException();
					}
					if (local219 == 46) {
						local31 -= 2;
						local245 = local43[local37];
						local780 = Static53.anIntArray109[local31];
						if (local780 >= 0 && local780 < Static75.anIntArray173[local245]) {
							Static114.anIntArrayArray20[local245][local780] = Static53.anIntArray109[local31 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local219 == 47) {
						@Pc(911) Class81 local911 = Static120.aClass81Array14[local43[local37]];
						if (local911 == null) {
							local911 = Static114.aClass81_758;
						}
						Static168.aClass81Array20[local35++] = local911;
						continue;
					}
					if (local219 == 48) {
						local528 = local43[local37];
						local35--;
						Static120.aClass81Array14[local528] = Static168.aClass81Array20[local35];
						continue;
					}
				}
				@Pc(945) boolean local945;
				if (local43[local37] == 1) {
					local945 = true;
				} else {
					local945 = false;
				}
				@Pc(3479) int local3479;
				@Pc(1054) Class77 local1054;
				@Pc(1732) int local1732;
				@Pc(7266) Class77 local7266;
				@Pc(7284) Class77 local7284;
				if (local219 < 300) {
					if (local219 == 100) {
						local31 -= 3;
						local780 = Static53.anIntArray109[local31];
						local1732 = Static53.anIntArray109[local31 + 2];
						local785 = Static53.anIntArray109[local31 + 1];
						if (local785 == 0) {
							throw new RuntimeException();
						}
						local7266 = Static41.method800(local780);
						if (local7266.aClass77Array1 == null) {
							local7266.aClass77Array1 = new Class77[local1732 + 1];
						}
						if (local7266.aClass77Array1.length <= local1732) {
							@Pc(7768) Class77[] local7768 = new Class77[local1732 + 1];
							for (local3479 = 0; local3479 < local7266.aClass77Array1.length; local3479++) {
								local7768[local3479] = local7266.aClass77Array1[local3479];
							}
							local7266.aClass77Array1 = local7768;
						}
						if (local1732 > 0 && local7266.aClass77Array1[local1732 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1732 - 1));
						}
						@Pc(7814) Class77 local7814 = new Class77();
						local7814.anInt3189 = local1732;
						local7814.anInt3226 = local785;
						local7814.aBoolean138 = true;
						local7814.anInt3196 = local7814.anInt3231 = local7266.anInt3231;
						local7266.aClass77Array1[local1732] = local7814;
						if (local945) {
							Static171.aClass77_13 = local7814;
						} else {
							Static80.aClass77_10 = local7814;
						}
						Static51.method913(local7266);
						continue;
					}
					@Pc(7879) Class77 local7879;
					if (local219 == 101) {
						local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
						if (local1054.anInt3189 == -1) {
							if (local945) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local7879 = Static41.method800(local1054.anInt3231);
						local7879.aClass77Array1[local1054.anInt3189] = null;
						Static51.method913(local7879);
						continue;
					}
					if (local219 == 102) {
						local31--;
						local1054 = Static41.method800(Static53.anIntArray109[local31]);
						local1054.aClass77Array1 = null;
						Static51.method913(local1054);
						continue;
					}
					if (local219 == 200) {
						local31 -= 2;
						local780 = Static53.anIntArray109[local31];
						local785 = Static53.anIntArray109[local31 + 1];
						local7284 = Static166.method2908(local780, local785);
						if (local7284 != null && local785 != -1) {
							Static53.anIntArray109[local31++] = 1;
							if (local945) {
								Static171.aClass77_13 = local7284;
							} else {
								Static80.aClass77_10 = local7284;
							}
							continue;
						}
						Static53.anIntArray109[local31++] = 0;
						continue;
					}
					if (local219 == 201) {
						local31--;
						local780 = Static53.anIntArray109[local31];
						local7879 = Static41.method800(local780);
						if (local7879 == null) {
							Static53.anIntArray109[local31++] = 0;
						} else {
							Static53.anIntArray109[local31++] = 1;
							if (local945) {
								Static171.aClass77_13 = local7879;
							} else {
								Static80.aClass77_10 = local7879;
							}
						}
						continue;
					}
				} else if (local219 < 500) {
					if (local219 == 403) {
						local31 -= 2;
						local785 = Static53.anIntArray109[local31 + 1];
						local780 = Static53.anIntArray109[local31];
						if (local780 >= 7) {
							local780 -= 7;
						}
						Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.method3112(local785, local780);
						continue;
					}
					if (local219 == 404) {
						local31 -= 2;
						local780 = Static53.anIntArray109[local31];
						local785 = Static53.anIntArray109[local31 + 1];
						Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.method3120(local785, local780);
						continue;
					}
					if (local219 == 410) {
						local31--;
						@Pc(1024) boolean local1024 = Static53.anIntArray109[local31] != 0;
						Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.method3121(local1024);
						continue;
					}
				} else if ((local219 < 1000 || local219 >= 1100) && (local219 < 2000 || local219 >= 2100)) {
					@Pc(1498) Class81 local1498;
					if (local219 >= 1100 && local219 < 1200 || !(local219 < 2100 || local219 >= 2200)) {
						if (local219 < 2000) {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
						} else {
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
							local219 -= 1000;
						}
						if (local219 == 1100) {
							local31 -= 2;
							local1054.anInt3252 = Static53.anIntArray109[local31];
							if (local1054.anInt3252 > local1054.anInt3232 - local1054.anInt3217) {
								local1054.anInt3252 = local1054.anInt3232 - local1054.anInt3217;
							}
							if (local1054.anInt3252 < 0) {
								local1054.anInt3252 = 0;
							}
							local1054.anInt3234 = Static53.anIntArray109[local31 + 1];
							if (local1054.anInt3234 > local1054.anInt3247 - local1054.anInt3245) {
								local1054.anInt3234 = local1054.anInt3247 - local1054.anInt3245;
							}
							if (local1054.anInt3234 < 0) {
								local1054.anInt3234 = 0;
							}
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1101) {
							local31--;
							local1054.anInt3223 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1102) {
							local31--;
							local1054.aBoolean135 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1103) {
							local31--;
							local1054.anInt3208 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1104) {
							local31--;
							local1054.anInt3261 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1105) {
							local31--;
							local1054.anInt3199 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1106) {
							local31--;
							local1054.anInt3228 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1107) {
							local31--;
							local1054.aBoolean128 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1108) {
							local1054.anInt3190 = 1;
							local31--;
							local1054.anInt3222 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1109) {
							local31 -= 6;
							local1054.anInt3194 = Static53.anIntArray109[local31];
							local1054.anInt3221 = Static53.anIntArray109[local31 + 1];
							local1054.anInt3214 = Static53.anIntArray109[local31 + 2];
							local1054.anInt3210 = Static53.anIntArray109[local31 + 3];
							local1054.anInt3263 = Static53.anIntArray109[local31 + 4];
							local1054.anInt3259 = Static53.anIntArray109[local31 + 5];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1110) {
							local31--;
							local785 = Static53.anIntArray109[local31];
							if (local785 != local1054.anInt3212) {
								local1054.anInt3216 = 0;
								local1054.anInt3246 = 0;
								local1054.anInt3212 = local785;
								Static51.method913(local1054);
							}
							continue;
						}
						if (local219 == 1111) {
							local31--;
							local1054.aBoolean137 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1112) {
							local35--;
							local1498 = Static168.aClass81Array20[local35];
							if (!local1498.method2800(local1054.aClass81_1144)) {
								local1054.aClass81_1144 = local1498;
								Static51.method913(local1054);
							}
							continue;
						}
						if (local219 == 1113) {
							local31--;
							local1054.anInt3213 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1114) {
							local31 -= 3;
							local1054.anInt3253 = Static53.anIntArray109[local31];
							local1054.anInt3238 = Static53.anIntArray109[local31 + 1];
							local1054.anInt3255 = Static53.anIntArray109[local31 + 2];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1115) {
							local31--;
							local1054.aBoolean130 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1116) {
							local31--;
							local1054.anInt3193 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1117) {
							local31--;
							local1054.anInt3237 = Static53.anIntArray109[local31];
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1118) {
							local31--;
							local1054.aBoolean133 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1119) {
							local31--;
							local1054.aBoolean136 = Static53.anIntArray109[local31] == 1;
							Static51.method913(local1054);
							continue;
						}
						if (local219 == 1120) {
							local31 -= 2;
							local1054.anInt3232 = Static53.anIntArray109[local31];
							local1054.anInt3247 = Static53.anIntArray109[local31 + 1];
							Static51.method913(local1054);
							continue;
						}
					} else if (local219 >= 1200 && local219 < 1300 || local219 >= 2200 && local219 < 2300) {
						if (local219 >= 2000) {
							local219 -= 1000;
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
						} else {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
						}
						Static51.method913(local1054);
						if (local219 == 1200) {
							local31 -= 2;
							local785 = Static53.anIntArray109[local31];
							local1732 = Static53.anIntArray109[local31 + 1];
							if (local785 == -1) {
								local1054.anInt3222 = -1;
								local1054.anInt3190 = 1;
								local1054.anInt3211 = -1;
							} else {
								local1054.anInt3220 = local1732;
								local1054.anInt3211 = local785;
								@Pc(1757) Class1_Sub2_Sub12 local1757 = Static54.method969(local785);
								local1054.anInt3194 = local1757.anInt2392;
								local1054.anInt3210 = local1757.anInt2382;
								local1054.anInt3263 = local1757.anInt2397;
								local1054.anInt3221 = local1757.anInt2396;
								local1054.anInt3214 = local1757.anInt2389;
								local1054.anInt3259 = local1757.anInt2405;
								if (local1054.anInt3217 > 0) {
									local1054.anInt3259 = local1054.anInt3259 * 32 / local1054.anInt3217;
								}
							}
							continue;
						}
						if (local219 == 1201) {
							local1054.anInt3190 = 2;
							local31--;
							local1054.anInt3222 = Static53.anIntArray109[local31];
							continue;
						}
						if (local219 == 1202) {
							local1054.anInt3190 = 3;
							local1054.anInt3222 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.method3111();
							continue;
						}
						if (local219 == 1203) {
							local1054.anInt3190 = 6;
							local31--;
							local1054.anInt3222 = Static53.anIntArray109[local31];
							continue;
						}
						if (local219 == 1204) {
							local1054.anInt3190 = 5;
							local31--;
							local1054.anInt3222 = Static53.anIntArray109[local31];
							continue;
						}
					} else if (local219 >= 1300 && local219 < 1400 || local219 >= 2300 && local219 < 2400) {
						if (local219 >= 2000) {
							local219 -= 1000;
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
						} else {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
						}
						if (local219 == 1300) {
							local31--;
							local785 = Static53.anIntArray109[local31] - 1;
							if (local785 >= 0 && local785 <= 9) {
								local35--;
								local1054.method2489(local785, Static168.aClass81Array20[local35]);
								continue;
							}
							local35--;
							continue;
						}
						if (local219 == 1301) {
							local31 -= 2;
							local785 = Static53.anIntArray109[local31];
							local1732 = Static53.anIntArray109[local31 + 1];
							local1054.aClass77_12 = Static166.method2908(local785, local1732);
							continue;
						}
						if (local219 == 1302) {
							local31--;
							local1054.aBoolean139 = Static53.anIntArray109[local31] == 1;
							continue;
						}
						if (local219 == 1303) {
							local31--;
							local1054.anInt3205 = Static53.anIntArray109[local31];
							continue;
						}
						if (local219 == 1304) {
							local31--;
							local1054.anInt3242 = Static53.anIntArray109[local31];
							continue;
						}
						if (local219 == 1305) {
							local35--;
							local1054.aClass81_1147 = Static168.aClass81Array20[local35];
							continue;
						}
						if (local219 == 1306) {
							local35--;
							local1054.aClass81_1148 = Static168.aClass81Array20[local35];
							continue;
						}
						if (local219 == 1307) {
							local1054.aClass81Array17 = null;
							continue;
						}
					} else {
						if (local219 >= 1400 && local219 < 1500 || local219 >= 2400 && local219 < 2500) {
							if (local219 < 2000) {
								local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
							} else {
								local31--;
								local1054 = Static41.method800(Static53.anIntArray109[local31]);
								local219 -= 1000;
							}
							local35--;
							local1498 = Static168.aClass81Array20[local35];
							@Pc(7407) int[] local7407 = null;
							if (local1498.method2820() > 0 && local1498.method2826(local1498.method2820() - 1) == 89) {
								local31--;
								local630 = Static53.anIntArray109[local31];
								if (local630 > 0) {
									local7407 = new int[local630];
									while (local630-- > 0) {
										local31--;
										local7407[local630] = Static53.anIntArray109[local31];
									}
								}
								local1498 = local1498.method2823(0, local1498.method2820() - 1);
							}
							@Pc(7468) Object[] local7468 = new Object[local1498.method2820() + 1];
							for (local654 = local7468.length - 1; local654 >= 1; local654--) {
								if (local1498.method2826(local654 - 1) == 115) {
									local35--;
									local7468[local654] = Static168.aClass81Array20[local35];
								} else {
									local31--;
									local7468[local654] = Integer.valueOf(Static53.anIntArray109[local31]);
								}
							}
							local31--;
							local3479 = Static53.anIntArray109[local31];
							if (local3479 == -1) {
								local7468 = null;
							} else {
								local7468[0] = Integer.valueOf(local3479);
							}
							local1054.aBoolean129 = true;
							if (local219 == 1419) {
								local1054.anObjectArray23 = local7468;
							}
							if (local219 == 1412) {
								local1054.anObjectArray12 = local7468;
							}
							if (local219 == 1410) {
								local1054.anObjectArray9 = local7468;
							}
							if (local219 == 1418) {
								local1054.anObjectArray26 = local7468;
							}
							if (local219 == 1421) {
								local1054.anObjectArray20 = local7468;
							}
							if (local219 == 1400) {
								local1054.anObjectArray13 = local7468;
							}
							if (local219 == 1416) {
								local1054.anObjectArray7 = local7468;
							}
							if (local219 == 1417) {
								local1054.anObjectArray24 = local7468;
							}
							if (local219 == 1408) {
								local1054.anObjectArray15 = local7468;
							}
							if (local219 == 1401) {
								local1054.anObjectArray18 = local7468;
							}
							if (local219 == 1422) {
								local1054.anObjectArray21 = local7468;
							}
							if (local219 == 1423) {
								local1054.anObjectArray11 = local7468;
							}
							if (local219 == 1425) {
								local1054.anObjectArray19 = local7468;
							}
							if (local219 == 1409) {
								local1054.anObjectArray2 = local7468;
							}
							if (local219 == 1403) {
								local1054.anObjectArray25 = local7468;
							}
							if (local219 == 1420) {
								local1054.anObjectArray8 = local7468;
							}
							if (local219 == 1415) {
								local1054.anObjectArray4 = local7468;
								local1054.anIntArray347 = local7407;
							}
							if (local219 == 1411) {
								local1054.anObjectArray10 = local7468;
							}
							if (local219 == 1407) {
								local1054.anIntArray346 = local7407;
								local1054.anObjectArray6 = local7468;
							}
							if (local219 == 1406) {
								local1054.anObjectArray22 = local7468;
							}
							if (local219 == 1402) {
								local1054.anObjectArray17 = local7468;
							}
							if (local219 == 1405) {
								local1054.anObjectArray5 = local7468;
							}
							if (local219 == 1424) {
								local1054.anObjectArray14 = local7468;
							}
							if (local219 == 1414) {
								local1054.anObjectArray16 = local7468;
								local1054.anIntArray345 = local7407;
							}
							if (local219 == 1404) {
								local1054.anObjectArray3 = local7468;
							}
							continue;
						}
						if (local219 < 1600) {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
							if (local219 == 1500) {
								Static53.anIntArray109[local31++] = local1054.anInt3258;
								continue;
							}
							if (local219 == 1501) {
								Static53.anIntArray109[local31++] = local1054.anInt3230;
								continue;
							}
							if (local219 == 1502) {
								Static53.anIntArray109[local31++] = local1054.anInt3217;
								continue;
							}
							if (local219 == 1503) {
								Static53.anIntArray109[local31++] = local1054.anInt3245;
								continue;
							}
							if (local219 == 1504) {
								Static53.anIntArray109[local31++] = local1054.aBoolean134 ? 1 : 0;
								continue;
							}
							if (local219 == 1505) {
								Static53.anIntArray109[local31++] = local1054.anInt3196;
								continue;
							}
						} else if (local219 < 1700) {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
							if (local219 == 1600) {
								Static53.anIntArray109[local31++] = local1054.anInt3252;
								continue;
							}
							if (local219 == 1601) {
								Static53.anIntArray109[local31++] = local1054.anInt3234;
								continue;
							}
							if (local219 == 1602) {
								Static168.aClass81Array20[local35++] = local1054.aClass81_1144;
								continue;
							}
							if (local219 == 1603) {
								Static53.anIntArray109[local31++] = local1054.anInt3232;
								continue;
							}
							if (local219 == 1604) {
								Static53.anIntArray109[local31++] = local1054.anInt3247;
								continue;
							}
							if (local219 == 1605) {
								Static53.anIntArray109[local31++] = local1054.anInt3259;
								continue;
							}
							if (local219 == 1606) {
								Static53.anIntArray109[local31++] = local1054.anInt3214;
								continue;
							}
							if (local219 == 1607) {
								Static53.anIntArray109[local31++] = local1054.anInt3263;
								continue;
							}
							if (local219 == 1608) {
								Static53.anIntArray109[local31++] = local1054.anInt3210;
								continue;
							}
							if (local219 == 1609) {
								Static53.anIntArray109[local31++] = local1054.anInt3208;
								continue;
							}
						} else if (local219 < 1800) {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
							if (local219 == 1700) {
								Static53.anIntArray109[local31++] = local1054.anInt3211;
								continue;
							}
							if (local219 == 1701) {
								if (local1054.anInt3211 == -1) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = local1054.anInt3220;
								}
								continue;
							}
							if (local219 == 1702) {
								Static53.anIntArray109[local31++] = local1054.anInt3189;
								continue;
							}
						} else if (local219 < 1900) {
							local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
							if (local219 == 1800) {
								Static53.anIntArray109[local31++] = Static14.method219(Static165.method2894(local1054));
								continue;
							}
							if (local219 == 1801) {
								local31--;
								local785 = Static53.anIntArray109[local31];
								local785--;
								if (local1054.aClass81Array17 != null && local1054.aClass81Array17.length > local785 && local1054.aClass81Array17[local785] != null) {
									Static168.aClass81Array20[local35++] = local1054.aClass81Array17[local785];
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 1802) {
								if (local1054.aClass81_1147 == null) {
									Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								} else {
									Static168.aClass81Array20[local35++] = local1054.aClass81_1147;
								}
								continue;
							}
						} else if (local219 < 2600) {
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
							if (local219 == 2500) {
								Static53.anIntArray109[local31++] = local1054.anInt3258;
								continue;
							}
							if (local219 == 2501) {
								Static53.anIntArray109[local31++] = local1054.anInt3230;
								continue;
							}
							if (local219 == 2502) {
								Static53.anIntArray109[local31++] = local1054.anInt3217;
								continue;
							}
							if (local219 == 2503) {
								Static53.anIntArray109[local31++] = local1054.anInt3245;
								continue;
							}
							if (local219 == 2504) {
								Static53.anIntArray109[local31++] = local1054.aBoolean134 ? 1 : 0;
								continue;
							}
							if (local219 == 2505) {
								Static53.anIntArray109[local31++] = local1054.anInt3196;
								continue;
							}
						} else if (local219 < 2700) {
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
							if (local219 == 2600) {
								Static53.anIntArray109[local31++] = local1054.anInt3252;
								continue;
							}
							if (local219 == 2601) {
								Static53.anIntArray109[local31++] = local1054.anInt3234;
								continue;
							}
							if (local219 == 2602) {
								Static168.aClass81Array20[local35++] = local1054.aClass81_1144;
								continue;
							}
							if (local219 == 2603) {
								Static53.anIntArray109[local31++] = local1054.anInt3232;
								continue;
							}
							if (local219 == 2604) {
								Static53.anIntArray109[local31++] = local1054.anInt3247;
								continue;
							}
							if (local219 == 2605) {
								Static53.anIntArray109[local31++] = local1054.anInt3259;
								continue;
							}
							if (local219 == 2606) {
								Static53.anIntArray109[local31++] = local1054.anInt3214;
								continue;
							}
							if (local219 == 2607) {
								Static53.anIntArray109[local31++] = local1054.anInt3263;
								continue;
							}
							if (local219 == 2608) {
								Static53.anIntArray109[local31++] = local1054.anInt3210;
								continue;
							}
							if (local219 == 2609) {
								Static53.anIntArray109[local31++] = local1054.anInt3208;
								continue;
							}
						} else if (local219 < 2800) {
							if (local219 == 2700) {
								local31--;
								local1054 = Static41.method800(Static53.anIntArray109[local31]);
								Static53.anIntArray109[local31++] = local1054.anInt3211;
								continue;
							}
							if (local219 == 2701) {
								local31--;
								local1054 = Static41.method800(Static53.anIntArray109[local31]);
								if (local1054.anInt3211 == -1) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = local1054.anInt3220;
								}
								continue;
							}
							if (local219 == 2702) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								@Pc(2630) Class1_Sub4 local2630 = (Class1_Sub4) Static119.aClass5_8.method134((long) local780);
								if (local2630 == null) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = 1;
								}
								continue;
							}
							if (local219 == 2703) {
								local31--;
								local1054 = Static41.method800(Static53.anIntArray109[local31]);
								if (local1054.aClass77Array1 == null) {
									Static53.anIntArray109[local31++] = 0;
									continue;
								}
								local785 = local1054.aClass77Array1.length;
								for (local1732 = 0; local1732 < local1054.aClass77Array1.length; local1732++) {
									if (local1054.aClass77Array1[local1732] == null) {
										local785 = local1732;
										break;
									}
								}
								Static53.anIntArray109[local31++] = local785;
								continue;
							}
							if (local219 == 2704 || local219 == 2705) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								@Pc(2726) Class1_Sub4 local2726 = (Class1_Sub4) Static119.aClass5_8.method134((long) local780);
								if (local2726 != null && local785 == local2726.anInt155) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
						} else if (local219 < 2900) {
							local31--;
							local1054 = Static41.method800(Static53.anIntArray109[local31]);
							if (local219 == 2800) {
								Static53.anIntArray109[local31++] = Static14.method219(Static165.method2894(local1054));
								continue;
							}
							if (local219 == 2801) {
								local31--;
								local785 = Static53.anIntArray109[local31];
								local785--;
								if (local1054.aClass81Array17 != null && local1054.aClass81Array17.length > local785 && local1054.aClass81Array17[local785] != null) {
									Static168.aClass81Array20[local35++] = local1054.aClass81Array17[local785];
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 2802) {
								if (local1054.aClass81_1147 == null) {
									Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								} else {
									Static168.aClass81Array20[local35++] = local1054.aClass81_1147;
								}
								continue;
							}
						} else if (local219 < 3200) {
							if (local219 == 3100) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static131.method2247(0, local586, Static140.aClass81_1099);
								continue;
							}
							if (local219 == 3101) {
								local31 -= 2;
								Static160.method2790(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1, Static53.anIntArray109[local31 + 1], Static53.anIntArray109[local31]);
								continue;
							}
							if (local219 == 3103) {
								Static122.method2149();
								continue;
							}
							if (local219 == 3104) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local785 = 0;
								if (local586.method2793()) {
									local785 = local586.method2807();
								}
								Static104.aClass1_Sub8_Sub1_2.method366(42);
								Static104.aClass1_Sub8_Sub1_2.method328(local785);
								continue;
							}
							if (local219 == 3105) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static104.aClass1_Sub8_Sub1_2.method366(23);
								Static104.aClass1_Sub8_Sub1_2.method355(local586.method2821());
								continue;
							}
							if (local219 == 3106) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static104.aClass1_Sub8_Sub1_2.method366(207);
								Static104.aClass1_Sub8_Sub1_2.method331(local586.method2820() + 1);
								Static104.aClass1_Sub8_Sub1_2.method348(local586);
								continue;
							}
							if (local219 == 3107) {
								local35--;
								local1498 = Static168.aClass81Array20[local35];
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static112.method1969(local1498, local780);
								continue;
							}
							if (local219 == 3108) {
								local31 -= 3;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								local1732 = Static53.anIntArray109[local31 + 2];
								local7266 = Static41.method800(local1732);
								Static178.method3076(local780, local785, local7266);
								continue;
							}
							if (local219 == 3109) {
								local7284 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								Static178.method3076(local780, local785, local7284);
								continue;
							}
							if (local219 == 3110) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static104.aClass1_Sub8_Sub1_2.method366(168);
								Static104.aClass1_Sub8_Sub1_2.method337(local780);
								continue;
							}
						} else if (local219 < 3300) {
							if (local219 == 3200) {
								local31 -= 3;
								Static141.method603(Static53.anIntArray109[local31 + 1], Static53.anIntArray109[local31], Static53.anIntArray109[local31 + 2]);
								continue;
							}
							if (local219 == 3201) {
								local31--;
								Static25.method553(Static53.anIntArray109[local31]);
								continue;
							}
							if (local219 == 3202) {
								local31 -= 2;
								Static67.method1202(Static53.anIntArray109[local31 + 1], Static53.anIntArray109[local31]);
								continue;
							}
						} else if (local219 < 3400) {
							if (local219 == 3300) {
								Static53.anIntArray109[local31++] = Static142.anInt3104;
								continue;
							}
							if (local219 == 3301) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = Static106.method1749(local780, local785);
								continue;
							}
							if (local219 == 3302) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = Static163.method2849(local780, local785);
								continue;
							}
							if (local219 == 3303) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = Static183.method3129(local780, local785);
								continue;
							}
							if (local219 == 3304) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static167.method2971(local780).anInt3592;
								continue;
							}
							if (local219 == 3305) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static70.anIntArray149[local780];
								continue;
							}
							if (local219 == 3306) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static16.anIntArray13[local780];
								continue;
							}
							if (local219 == 3307) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static113.anIntArray272[local780];
								continue;
							}
							if (local219 == 3308) {
								local780 = Static44.anInt1086;
								local1732 = Static114.anInt2140 + (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7);
								local785 = (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7) + Static51.anInt1219;
								Static53.anIntArray109[local31++] = local1732 + (local780 << 28) + (local785 << 14);
								continue;
							}
							if (local219 == 3309) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local780 >> 14 & 0x3FFF;
								continue;
							}
							if (local219 == 3310) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local780 >> 28;
								continue;
							}
							if (local219 == 3311) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local780 & 0x3FFF;
								continue;
							}
							if (local219 == 3312) {
								Static53.anIntArray109[local31++] = Static44.aBoolean40 ? 1 : 0;
								continue;
							}
							if (local219 == 3313) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31] + 32768;
								Static53.anIntArray109[local31++] = Static106.method1749(local780, local785);
								continue;
							}
							if (local219 == 3314) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31] + 32768;
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = Static163.method2849(local780, local785);
								continue;
							}
							if (local219 == 3315) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31] + 32768;
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = Static183.method3129(local780, local785);
								continue;
							}
							if (local219 == 3316) {
								if (Static51.anInt1221 >= 2) {
									Static53.anIntArray109[local31++] = Static51.anInt1221;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
							if (local219 == 3317) {
								Static53.anIntArray109[local31++] = Static106.anInt2330;
								continue;
							}
							if (local219 == 3318) {
								Static53.anIntArray109[local31++] = Static48.anInt3637;
								continue;
							}
							if (local219 == 3321) {
								Static53.anIntArray109[local31++] = Static168.anInt3907;
								continue;
							}
							if (local219 == 3322) {
								Static53.anIntArray109[local31++] = Static120.anInt2668;
								continue;
							}
							if (local219 == 3323) {
								if (Static51.anInt1221 == 1) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
							if (local219 == 3324) {
								if (Static122.anInt2751 >= 5 && Static122.anInt2751 <= 9) {
									Static53.anIntArray109[local31++] = Static122.anInt2751;
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3325) {
								if (Static133.anInt2871 > 0) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
							if (local219 == 3326) {
								Static53.anIntArray109[local31++] = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526;
								continue;
							}
							if (local219 == 3327) {
								Static53.anIntArray109[local31++] = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.aBoolean169 ? 1 : 0;
								continue;
							}
						} else if (local219 < 3500) {
							if (local219 == 3400) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								@Pc(3378) Class1_Sub2_Sub19 local3378 = Static44.method822(local780);
								for (local630 = 0; local630 < local3378.anInt4033; local630++) {
									if (local3378.anIntArray426[local630] == local785) {
										Static168.aClass81Array20[local35++] = local3378.aClass81Array23[local630];
										local3378 = null;
										break;
									}
								}
								if (local3378 != null) {
									Static168.aClass81Array20[local35++] = local3378.aClass81_1414;
								}
								continue;
							}
							if (local219 == 3408) {
								local31 -= 4;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								local1732 = Static53.anIntArray109[local31 + 2];
								local630 = Static53.anIntArray109[local31 + 3];
								@Pc(3448) Class1_Sub2_Sub19 local3448 = Static44.method822(local1732);
								if (local3448.anInt4041 == local780 && local785 == local3448.anInt4036) {
									for (local3479 = 0; local3479 < local3448.anInt4033; local3479++) {
										if (local3448.anIntArray426[local3479] == local630) {
											if (local785 == 115) {
												Static168.aClass81Array20[local35++] = local3448.aClass81Array23[local3479];
											} else {
												Static53.anIntArray109[local31++] = local3448.anIntArray427[local3479];
											}
											local3448 = null;
											break;
										}
									}
									if (local3448 != null) {
										if (local785 == 115) {
											Static168.aClass81Array20[local35++] = local3448.aClass81_1414;
										} else {
											Static53.anIntArray109[local31++] = local3448.anInt4038;
										}
									}
									continue;
								}
								if (local785 == 115) {
									Static168.aClass81Array20[local35++] = Static114.aClass81_758;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
						} else if (local219 < 3700) {
							if (local219 == 3600) {
								if (Static150.anInt3394 == 0) {
									Static53.anIntArray109[local31++] = -2;
								} else if (Static150.anInt3394 == 1) {
									Static53.anIntArray109[local31++] = -1;
								} else {
									Static53.anIntArray109[local31++] = Static58.anInt1378;
								}
								continue;
							}
							if (local219 == 3601) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static150.anInt3394 == 2 && local780 < Static58.anInt1378) {
									Static168.aClass81Array20[local35++] = Static178.aClass81Array22[local780];
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 3602) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static150.anInt3394 == 2 && Static58.anInt1378 > local780) {
									Static53.anIntArray109[local31++] = Static179.anIntArray428[local780];
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3603) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static150.anInt3394 == 2 && local780 < Static58.anInt1378) {
									Static53.anIntArray109[local31++] = Static111.anIntArray270[local780];
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3604) {
								local31--;
								local785 = Static53.anIntArray109[local31];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static177.method3059(local785, local586);
								continue;
							}
							if (local219 == 3605) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static60.method1070(local586.method2821());
								continue;
							}
							if (local219 == 3606) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								method2311(local586.method2821());
								continue;
							}
							if (local219 == 3607) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static133.method2257(local586.method2821());
								continue;
							}
							if (local219 == 3608) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static8.method129(local586.method2821());
								continue;
							}
							if (local219 == 3609) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								if (local586.method2796(Static89.aClass81_1412) || local586.method2796(Static47.aClass81_410)) {
									local586 = local586.method2801(7);
								}
								Static53.anIntArray109[local31++] = Static99.method2683(local586) ? 1 : 0;
								continue;
							}
							if (local219 == 3611) {
								if (Static12.aClass81_1448 == null) {
									Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								} else {
									Static168.aClass81Array20[local35++] = Static12.aClass81_1448.method2808();
								}
								continue;
							}
							if (local219 == 3612) {
								if (Static12.aClass81_1448 == null) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = Static94.anInt2072;
								}
								continue;
							}
							if (local219 == 3613) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static12.aClass81_1448 != null && Static94.anInt2072 > local780) {
									Static168.aClass81Array20[local35++] = Static163.aClass1_Sub13Array1[local780].aClass81_378.method2808();
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 3614) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static12.aClass81_1448 != null && local780 < Static94.anInt2072) {
									Static53.anIntArray109[local31++] = Static163.aClass1_Sub13Array1[local780].anInt1078;
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3615) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static12.aClass81_1448 != null && Static94.anInt2072 > local780) {
									Static53.anIntArray109[local31++] = Static163.aClass1_Sub13Array1[local780].aByte1;
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3616) {
								Static53.anIntArray109[local31++] = Static113.aByte4;
								continue;
							}
							if (local219 == 3617) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static165.method2888(local586);
								continue;
							}
							if (local219 == 3618) {
								Static53.anIntArray109[local31++] = Static128.aByte7;
								continue;
							}
							if (local219 == 3619) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static119.method2035(local586.method2821());
								continue;
							}
							if (local219 == 3620) {
								Static57.method1011();
								continue;
							}
							if (local219 == 3621) {
								if (Static150.anInt3394 == 0) {
									Static53.anIntArray109[local31++] = -1;
								} else {
									Static53.anIntArray109[local31++] = Static9.anInt178;
								}
								continue;
							}
							if (local219 == 3622) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static150.anInt3394 != 0 && Static9.anInt178 > local780) {
									Static168.aClass81Array20[local35++] = Static106.method1751(Static90.aLongArray4[local780]).method2808();
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 3623) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								if (local586.method2796(Static89.aClass81_1412) || local586.method2796(Static47.aClass81_410)) {
									local586 = local586.method2801(7);
								}
								Static53.anIntArray109[local31++] = Static60.method1074(local586) ? 1 : 0;
								continue;
							}
							if (local219 == 3624) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								if (Static163.aClass1_Sub13Array1 != null && Static94.anInt2072 > local780 && Static163.aClass1_Sub13Array1[local780].aClass81_378.method2811(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518)) {
									Static53.anIntArray109[local31++] = 1;
									continue;
								}
								Static53.anIntArray109[local31++] = 0;
								continue;
							}
							if (local219 == 3625) {
								if (Static112.aClass81_923 == null) {
									Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								} else {
									Static168.aClass81Array20[local35++] = Static112.aClass81_923.method2808();
								}
								continue;
							}
						} else if (local219 < 4000) {
							if (local219 == 3903) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].method2032();
								continue;
							}
							if (local219 == 3904) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].anInt2617;
								continue;
							}
							if (local219 == 3905) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].anInt2623;
								continue;
							}
							if (local219 == 3906) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].anInt2620;
								continue;
							}
							if (local219 == 3907) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].anInt2622;
								continue;
							}
							if (local219 == 3908) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.aClass61Array1[local780].anInt2625;
								continue;
							}
							if (local219 == 3910) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local785 = Static54.aClass61Array1[local780].method2031();
								Static53.anIntArray109[local31++] = local785 == 0 ? 1 : 0;
								continue;
							}
							if (local219 == 3911) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local785 = Static54.aClass61Array1[local780].method2031();
								Static53.anIntArray109[local31++] = local785 == 2 ? 1 : 0;
								continue;
							}
							if (local219 == 3912) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local785 = Static54.aClass61Array1[local780].method2031();
								Static53.anIntArray109[local31++] = local785 == 5 ? 1 : 0;
								continue;
							}
							if (local219 == 3913) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local785 = Static54.aClass61Array1[local780].method2031();
								Static53.anIntArray109[local31++] = local785 == 1 ? 1 : 0;
								continue;
							}
						} else if (local219 < 4100) {
							if (local219 == 4000) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local785 + local780;
								continue;
							}
							if (local219 == 4001) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local780 - local785;
								continue;
							}
							if (local219 == 4002) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local780 * local785;
								continue;
							}
							if (local219 == 4003) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local780 / local785;
								continue;
							}
							if (local219 == 4004) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = (int) (Math.random() * (double) local780);
								continue;
							}
							if (local219 == 4005) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = (int) (Math.random() * (double) (local780 + 1));
								continue;
							}
							if (local219 == 4006) {
								local31 -= 5;
								local780 = Static53.anIntArray109[local31];
								local1732 = Static53.anIntArray109[local31 + 2];
								local654 = Static53.anIntArray109[local31 + 4];
								local630 = Static53.anIntArray109[local31 + 3];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = (local654 - local1732) * (local785 + -local780) / (local630 - local1732) + local780;
								continue;
							}
							if (local219 == 4007) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local785 * local780 / 100 + local780;
								continue;
							}
							if (local219 == 4008) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = 0x1 << local785 | local780;
								continue;
							}
							if (local219 == 4009) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = -(0x1 << local785) - 1 & local780;
								continue;
							}
							if (local219 == 4010) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = (local780 & 0x1 << local785) == 0 ? 0 : 1;
								continue;
							}
							if (local219 == 4011) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local780 % local785;
								continue;
							}
							if (local219 == 4012) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								if (local780 == 0) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = (int) Math.pow((double) local780, (double) local785);
								}
								continue;
							}
							if (local219 == 4013) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								if (local780 == 0) {
									Static53.anIntArray109[local31++] = 0;
								} else if (local785 == 0) {
									Static53.anIntArray109[local31++] = Integer.MAX_VALUE;
								} else {
									Static53.anIntArray109[local31++] = (int) Math.pow((double) local780, 1.0D / (double) local785);
								}
								continue;
							}
							if (local219 == 4014) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local780 & local785;
								continue;
							}
							if (local219 == 4015) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31 + 1];
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = local785 | local780;
								continue;
							}
							if (local219 == 4016) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local780 >= local785 ? local785 : local780;
								continue;
							}
							if (local219 == 4017) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								Static53.anIntArray109[local31++] = local785 >= local780 ? local785 : local780;
								continue;
							}
							if (local219 == 4018) {
								local31 -= 3;
								@Pc(6795) long local6795 = (long) Static53.anIntArray109[local31 + 1];
								@Pc(6800) long local6800 = (long) Static53.anIntArray109[local31];
								@Pc(6807) long local6807 = (long) Static53.anIntArray109[local31 + 2];
								Static53.anIntArray109[local31++] = (int) (local6807 * local6800 / local6795);
								continue;
							}
						} else if (local219 < 4200) {
							if (local219 == 4100) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local31--;
								local785 = Static53.anIntArray109[local31];
								Static168.aClass81Array20[local35++] = Static127.method2169(new Class81[] { local586, Static149.method2548(local785) });
								continue;
							}
							if (local219 == 4101) {
								local35 -= 2;
								local586 = Static168.aClass81Array20[local35];
								local1498 = Static168.aClass81Array20[local35 + 1];
								Static168.aClass81Array20[local35++] = Static127.method2169(new Class81[] { local586, local1498 });
								continue;
							}
							if (local219 == 4102) {
								local31--;
								local785 = Static53.anIntArray109[local31];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static168.aClass81Array20[local35++] = Static127.method2169(new Class81[] { local586, Static153.method2674(local785) });
								continue;
							}
							if (local219 == 4103) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static168.aClass81Array20[local35++] = local586.method2802();
								continue;
							}
							if (local219 == 4104) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								@Pc(5672) long local5672 = (long) local780 * 86400000L + 1014768000000L;
								Static156.aCalendar1.setTime(new Date(local5672));
								local630 = Static156.aCalendar1.get(5);
								local654 = Static156.aCalendar1.get(2);
								local3479 = Static156.aCalendar1.get(1);
								Static168.aClass81Array20[local35++] = Static127.method2169(new Class81[] { Static149.method2548(local630), Static129.aClass81_1021, Static5.aClass81Array1[local654], Static129.aClass81_1021, Static149.method2548(local3479) });
								continue;
							}
							if (local219 == 4105) {
								local35 -= 2;
								local586 = Static168.aClass81Array20[local35];
								local1498 = Static168.aClass81Array20[local35 + 1];
								if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2 != null && Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2.aBoolean169) {
									Static168.aClass81Array20[local35++] = local1498;
									continue;
								}
								Static168.aClass81Array20[local35++] = local586;
								continue;
							}
							if (local219 == 4106) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static168.aClass81Array20[local35++] = Static149.method2548(local780);
								continue;
							}
							if (local219 == 4107) {
								local35 -= 2;
								Static53.anIntArray109[local31++] = Static168.aClass81Array20[local35].method2810(Static168.aClass81Array20[local35 + 1]);
								continue;
							}
							@Pc(5832) Class1_Sub2_Sub2_Sub2_Sub1 local5832;
							@Pc(5827) byte[] local5827;
							if (local219 == 4108) {
								local31 -= 2;
								local1732 = Static53.anIntArray109[local31 + 1];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local785 = Static53.anIntArray109[local31];
								local5827 = Static98.aClass82_Sub1_10.method2942(0, local1732);
								local5832 = new Class1_Sub2_Sub2_Sub2_Sub1(local5827);
								local5832.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
								Static53.anIntArray109[local31++] = local5832.method1922(local586, local785);
								continue;
							}
							if (local219 == 4109) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local1732 = Static53.anIntArray109[local31 + 1];
								local5827 = Static98.aClass82_Sub1_10.method2942(0, local1732);
								local5832 = new Class1_Sub2_Sub2_Sub2_Sub1(local5827);
								local5832.method1946(Static110.aClass1_Sub2_Sub2_Sub4Array8, null);
								Static53.anIntArray109[local31++] = local5832.method1952(local586, local785);
								continue;
							}
							if (local219 == 4110) {
								local35 -= 2;
								local586 = Static168.aClass81Array20[local35];
								local1498 = Static168.aClass81Array20[local35 + 1];
								local31--;
								if (Static53.anIntArray109[local31] == 1) {
									Static168.aClass81Array20[local35++] = local586;
								} else {
									Static168.aClass81Array20[local35++] = local1498;
								}
								continue;
							}
							if (local219 == 4111) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static168.aClass81Array20[local35++] = Static186.method1941(local586);
								continue;
							}
							if (local219 == 4112) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local31--;
								local785 = Static53.anIntArray109[local31];
								Static168.aClass81Array20[local35++] = local586.method2824(local785);
								continue;
							}
							if (local219 == 4113) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static125.method2159(local780) ? 1 : 0;
								continue;
							}
							if (local219 == 4114) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static173.method3040(local780) ? 1 : 0;
								continue;
							}
							if (local219 == 4115) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static1.method15(local780) ? 1 : 0;
								continue;
							}
							if (local219 == 4116) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static121.method2085(local780) ? 1 : 0;
								continue;
							}
							if (local219 == 4117) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								if (local586 == null) {
									Static53.anIntArray109[local31++] = 0;
								} else {
									Static53.anIntArray109[local31++] = local586.method2820();
								}
								continue;
							}
							if (local219 == 4118) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local1732 = Static53.anIntArray109[local31 + 1];
								Static168.aClass81Array20[local35++] = local586.method2823(local785, local1732);
								continue;
							}
							if (local219 == 4119) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local1498 = Static16.method235(local586.method2820());
								@Pc(6135) boolean local6135 = false;
								for (local630 = 0; local630 < local586.method2820(); local630++) {
									local654 = local586.method2826(local630);
									if (local654 == 60) {
										local6135 = true;
									} else if (local654 == 62) {
										local6135 = false;
									} else if (!local6135) {
										local1498.method2818(local654);
									}
								}
								local1498.method2825();
								Static168.aClass81Array20[local35++] = local1498;
								continue;
							}
							if (local219 == 4120) {
								local31 -= 2;
								local785 = Static53.anIntArray109[local31];
								local1732 = Static53.anIntArray109[local31 + 1];
								local35--;
								local586 = Static168.aClass81Array20[local35];
								Static53.anIntArray109[local31++] = local586.method2795(local785, local1732);
								continue;
							}
							if (local219 == 4121) {
								local35 -= 2;
								local586 = Static168.aClass81Array20[local35];
								local31--;
								local1732 = Static53.anIntArray109[local31];
								local1498 = Static168.aClass81Array20[local35 + 1];
								Static53.anIntArray109[local31++] = local586.method2806(local1498, local1732);
								continue;
							}
						} else if (local219 < 4300) {
							if (local219 == 4200) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static168.aClass81Array20[local35++] = Static54.method969(local780).aClass81_843;
								continue;
							}
							@Pc(5245) Class1_Sub2_Sub12 local5245;
							if (local219 == 4201) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								local5245 = Static54.method969(local780);
								if (local785 >= 1 && local785 <= 5 && local5245.aClass81Array9[local785 - 1] != null) {
									Static168.aClass81Array20[local35++] = local5245.aClass81Array9[local785 - 1];
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 4202) {
								local31 -= 2;
								local780 = Static53.anIntArray109[local31];
								local785 = Static53.anIntArray109[local31 + 1];
								local5245 = Static54.method969(local780);
								if (local785 >= 1 && local785 <= 5 && local5245.aClass81Array10[local785 - 1] != null) {
									Static168.aClass81Array20[local35++] = local5245.aClass81Array10[local785 - 1];
									continue;
								}
								Static168.aClass81Array20[local35++] = Static140.aClass81_1099;
								continue;
							}
							if (local219 == 4203) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.method969(local780).anInt2395;
								continue;
							}
							if (local219 == 4204) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.method969(local780).anInt2414 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5388) Class1_Sub2_Sub12 local5388;
							if (local219 == 4205) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local5388 = Static54.method969(local780);
								if (local5388.anInt2399 == -1 && local5388.anInt2388 >= 0) {
									Static53.anIntArray109[local31++] = local5388.anInt2388;
									continue;
								}
								Static53.anIntArray109[local31++] = local780;
								continue;
							}
							if (local219 == 4206) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local5388 = Static54.method969(local780);
								if (local5388.anInt2399 >= 0 && local5388.anInt2388 >= 0) {
									Static53.anIntArray109[local31++] = local5388.anInt2388;
									continue;
								}
								Static53.anIntArray109[local31++] = local780;
								continue;
							}
							if (local219 == 4207) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								Static53.anIntArray109[local31++] = Static54.method969(local780).aBoolean103 ? 1 : 0;
								continue;
							}
							if (local219 == 4210) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local31--;
								local785 = Static53.anIntArray109[local31];
								Static16.method239(local785 == 1, local586);
								Static53.anIntArray109[local31++] = Static184.anInt4117;
								continue;
							}
							if (local219 == 4211) {
								if (Static143.aShortArray37 != null && Static15.anInt309 < Static184.anInt4117) {
									Static53.anIntArray109[local31++] = Static143.aShortArray37[Static15.anInt309++] & 0xFFFF;
									continue;
								}
								Static53.anIntArray109[local31++] = -1;
								continue;
							}
							if (local219 == 4212) {
								Static15.anInt309 = 0;
								continue;
							}
						} else if (local219 < 5100) {
							if (local219 == 5000) {
								Static53.anIntArray109[local31++] = Static70.anInt1713;
								continue;
							}
							if (local219 == 5001) {
								local31 -= 3;
								Static70.anInt1713 = Static53.anIntArray109[local31];
								Static64.anInt1610 = Static53.anIntArray109[local31 + 1];
								Static44.anInt1085 = Static53.anIntArray109[local31 + 2];
								Static104.aClass1_Sub8_Sub1_2.method366(134);
								Static104.aClass1_Sub8_Sub1_2.method331(Static70.anInt1713);
								Static104.aClass1_Sub8_Sub1_2.method331(Static64.anInt1610);
								Static104.aClass1_Sub8_Sub1_2.method331(Static44.anInt1085);
								continue;
							}
							if (local219 == 5002) {
								local31 -= 2;
								local35--;
								local586 = Static168.aClass81Array20[local35];
								local785 = Static53.anIntArray109[local31];
								local1732 = Static53.anIntArray109[local31 + 1];
								Static104.aClass1_Sub8_Sub1_2.method366(230);
								Static104.aClass1_Sub8_Sub1_2.method355(local586.method2821());
								Static104.aClass1_Sub8_Sub1_2.method331(local785 - 1);
								Static104.aClass1_Sub8_Sub1_2.method331(local1732);
								continue;
							}
							if (local219 == 5003) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local1498 = null;
								if (local780 < 100) {
									local1498 = Static68.aClass81Array7[local780];
								}
								if (local1498 == null) {
									local1498 = Static140.aClass81_1099;
								}
								Static168.aClass81Array20[local35++] = local1498;
								continue;
							}
							if (local219 == 5004) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local785 = -1;
								if (local780 < 100 && Static68.aClass81Array7[local780] != null) {
									local785 = Static77.anIntArray175[local780];
								}
								Static53.anIntArray109[local31++] = local785;
								continue;
							}
							if (local219 == 5005) {
								Static53.anIntArray109[local31++] = Static64.anInt1610;
								continue;
							}
							if (local219 == 5008) {
								local35--;
								local586 = Static168.aClass81Array20[local35];
								if (local586.method2796(Static52.aClass81_446)) {
									Static182.method3115(local586);
								} else {
									@Pc(4456) byte local4456 = 0;
									local1498 = local586.method2802();
									@Pc(4462) byte local4462 = 0;
									if (local1498.method2796(Static7.aClass81_74)) {
										local586 = local586.method2801(Static7.aClass81_74.method2820());
										local4462 = 0;
									} else if (local1498.method2796(Static20.aClass81_168)) {
										local4462 = 1;
										local586 = local586.method2801(Static20.aClass81_168.method2820());
									} else if (local1498.method2796(Static170.aClass81_1380)) {
										local586 = local586.method2801(Static170.aClass81_1380.method2820());
										local4462 = 2;
									} else if (local1498.method2796(Static146.aClass81_1145)) {
										local586 = local586.method2801(Static146.aClass81_1145.method2820());
										local4462 = 3;
									} else if (local1498.method2796(Static46.aClass81_401)) {
										local586 = local586.method2801(Static46.aClass81_401.method2820());
										local4462 = 4;
									} else if (local1498.method2796(Static5.aClass81_56)) {
										local4462 = 5;
										local586 = local586.method2801(Static5.aClass81_56.method2820());
									} else if (local1498.method2796(Static150.aClass81_1229)) {
										local4462 = 6;
										local586 = local586.method2801(Static150.aClass81_1229.method2820());
									} else if (local1498.method2796(Static144.aClass81_1133)) {
										local4462 = 7;
										local586 = local586.method2801(Static144.aClass81_1133.method2820());
									} else if (local1498.method2796(Static92.aClass81_720)) {
										local4462 = 8;
										local586 = local586.method2801(Static92.aClass81_720.method2820());
									} else if (local1498.method2796(Static25.aClass81_217)) {
										local586 = local586.method2801(Static25.aClass81_217.method2820());
										local4462 = 9;
									} else if (local1498.method2796(Static116.aClass81_955)) {
										local4462 = 10;
										local586 = local586.method2801(Static116.aClass81_955.method2820());
									} else if (local1498.method2796(Static32.aClass81_1093)) {
										local586 = local586.method2801(Static32.aClass81_1093.method2820());
										local4462 = 11;
									} else if (Static125.anInt2756 != 0) {
										if (local1498.method2796(Static7.aClass81_78)) {
											local4462 = 0;
											local586 = local586.method2801(Static7.aClass81_78.method2820());
										} else if (local1498.method2796(Static20.aClass81_171)) {
											local586 = local586.method2801(Static20.aClass81_171.method2820());
											local4462 = 1;
										} else if (local1498.method2796(Static170.aClass81_1377)) {
											local4462 = 2;
											local586 = local586.method2801(Static170.aClass81_1377.method2820());
										} else if (local1498.method2796(Static146.aClass81_1146)) {
											local4462 = 3;
											local586 = local586.method2801(Static146.aClass81_1146.method2820());
										} else if (local1498.method2796(Static46.aClass81_407)) {
											local4462 = 4;
											local586 = local586.method2801(Static46.aClass81_407.method2820());
										} else if (local1498.method2796(Static5.aClass81_49)) {
											local4462 = 5;
											local586 = local586.method2801(Static5.aClass81_49.method2820());
										} else if (local1498.method2796(Static150.aClass81_1232)) {
											local586 = local586.method2801(Static150.aClass81_1232.method2820());
											local4462 = 6;
										} else if (local1498.method2796(Static144.aClass81_1127)) {
											local586 = local586.method2801(Static144.aClass81_1127.method2820());
											local4462 = 7;
										} else if (local1498.method2796(Static92.aClass81_723)) {
											local586 = local586.method2801(Static92.aClass81_723.method2820());
											local4462 = 8;
										} else if (local1498.method2796(Static25.aClass81_215)) {
											local586 = local586.method2801(Static25.aClass81_215.method2820());
											local4462 = 9;
										} else if (local1498.method2796(Static116.aClass81_954)) {
											local4462 = 10;
											local586 = local586.method2801(Static116.aClass81_954.method2820());
										} else if (local1498.method2796(Static32.aClass81_1095)) {
											local4462 = 11;
											local586 = local586.method2801(Static32.aClass81_1095.method2820());
										}
									}
									local1498 = local586.method2802();
									if (local1498.method2796(Static68.aClass81_574)) {
										local4456 = 1;
										local586 = local586.method2801(Static68.aClass81_574.method2820());
									} else if (local1498.method2796(Static24.aClass81_206)) {
										local4456 = 2;
										local586 = local586.method2801(Static24.aClass81_206.method2820());
									} else if (local1498.method2796(Static141.aClass81_249)) {
										local4456 = 3;
										local586 = local586.method2801(Static141.aClass81_249.method2820());
									} else if (local1498.method2796(Static30.aClass81_265)) {
										local4456 = 4;
										local586 = local586.method2801(Static30.aClass81_265.method2820());
									} else if (local1498.method2796(Static113.aClass81_940)) {
										local586 = local586.method2801(Static113.aClass81_940.method2820());
										local4456 = 5;
									} else if (Static125.anInt2756 != 0) {
										if (local1498.method2796(Static68.aClass81_575)) {
											local4456 = 1;
											local586 = local586.method2801(Static68.aClass81_575.method2820());
										} else if (local1498.method2796(Static24.aClass81_205)) {
											local4456 = 2;
											local586 = local586.method2801(Static24.aClass81_205.method2820());
										} else if (local1498.method2796(Static141.aClass81_246)) {
											local586 = local586.method2801(Static141.aClass81_246.method2820());
											local4456 = 3;
										} else if (local1498.method2796(Static30.aClass81_268)) {
											local4456 = 4;
											local586 = local586.method2801(Static30.aClass81_268.method2820());
										} else if (local1498.method2796(Static113.aClass81_936)) {
											local586 = local586.method2801(Static113.aClass81_936.method2820());
											local4456 = 5;
										}
									}
									Static104.aClass1_Sub8_Sub1_2.method366(192);
									Static104.aClass1_Sub8_Sub1_2.method331(0);
									local654 = Static104.aClass1_Sub8_Sub1_2.anInt446;
									Static104.aClass1_Sub8_Sub1_2.method331(local4462);
									Static104.aClass1_Sub8_Sub1_2.method331(local4456);
									Static175.method2238(local586, Static104.aClass1_Sub8_Sub1_2);
									Static104.aClass1_Sub8_Sub1_2.method341(Static104.aClass1_Sub8_Sub1_2.anInt446 - local654);
								}
								continue;
							}
							if (local219 == 5009) {
								local35 -= 2;
								local586 = Static168.aClass81Array20[local35];
								local1498 = Static168.aClass81Array20[local35 + 1];
								Static104.aClass1_Sub8_Sub1_2.method366(6);
								Static104.aClass1_Sub8_Sub1_2.method331(0);
								local1732 = Static104.aClass1_Sub8_Sub1_2.anInt446;
								Static104.aClass1_Sub8_Sub1_2.method355(local586.method2821());
								Static175.method2238(local1498, Static104.aClass1_Sub8_Sub1_2);
								Static104.aClass1_Sub8_Sub1_2.method341(Static104.aClass1_Sub8_Sub1_2.anInt446 - local1732);
								continue;
							}
							if (local219 == 5010) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local1498 = null;
								if (local780 < 100) {
									local1498 = Static136.aClass81Array16[local780];
								}
								if (local1498 == null) {
									local1498 = Static140.aClass81_1099;
								}
								Static168.aClass81Array20[local35++] = local1498;
								continue;
							}
							if (local219 == 5011) {
								local31--;
								local780 = Static53.anIntArray109[local31];
								local1498 = null;
								if (local780 < 100) {
									local1498 = Static182.aClass81Array24[local780];
								}
								if (local1498 == null) {
									local1498 = Static140.aClass81_1099;
								}
								Static168.aClass81Array20[local35++] = local1498;
								continue;
							}
							if (local219 == 5015) {
								if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 == null || Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518 == null) {
									local586 = Static165.aClass81_1344;
								} else {
									local586 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518;
								}
								Static168.aClass81Array20[local35++] = local586;
								continue;
							}
							if (local219 == 5016) {
								Static53.anIntArray109[local31++] = Static44.anInt1085;
								continue;
							}
							if (local219 == 5017) {
								Static53.anIntArray109[local31++] = Static50.anInt1176;
								continue;
							}
						} else if (local219 < 5200) {
							if (local219 == 5100) {
								if (Static107.aBooleanArray13[86]) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
							if (local219 == 5101) {
								if (Static107.aBooleanArray13[82]) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
							if (local219 == 5102) {
								if (Static107.aBooleanArray13[81]) {
									Static53.anIntArray109[local31++] = 1;
								} else {
									Static53.anIntArray109[local31++] = 0;
								}
								continue;
							}
						}
					}
				} else {
					if (local219 >= 2000) {
						local219 -= 1000;
						local31--;
						local1054 = Static41.method800(Static53.anIntArray109[local31]);
					} else {
						local1054 = local945 ? Static171.aClass77_13 : Static80.aClass77_10;
					}
					if (local219 == 1000) {
						local31 -= 2;
						local1054.anInt3258 = Static53.anIntArray109[local31];
						local1054.anInt3230 = Static53.anIntArray109[local31 + 1];
						Static51.method913(local1054);
						continue;
					}
					if (local219 == 1001) {
						local31 -= 2;
						local1054.anInt3217 = Static53.anIntArray109[local31];
						local1054.anInt3245 = Static53.anIntArray109[local31 + 1];
						Static51.method913(local1054);
						continue;
					}
					if (local219 == 1003) {
						local31--;
						@Pc(1121) boolean local1121 = Static53.anIntArray109[local31] == 1;
						if (local1054.aBoolean134 != local1121) {
							local1054.aBoolean134 = local1121;
							Static51.method913(local1054);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7997) Exception local7997) {
			if (local26.aClass81_554 == null) {
				if (Static59.anInt1402 != 0) {
					Static131.method2247(0, Static52.aClass81_450, Static140.aClass81_1099);
				}
				Static5.method115("CS2 - scr:" + local26.aLong148 + " op:" + local45, local7997);
			} else {
				@Pc(8027) Class81 local8027 = Static16.method235(30);
				local8027.method2814(Static170.aClass81_1382).method2814(local26.aClass81_554);
				for (local59 = Static29.anInt755 - 1; local59 >= 0; local59--) {
					local8027.method2814(Static58.aClass81_480).method2814(Static11.aClass15Array2[local59].aClass1_Sub2_Sub9_1.aClass81_554);
				}
				if (local45 == 40) {
					local97 = local43[local37];
					local8027.method2814(Static58.aClass81_477).method2814(Static149.method2548(local97));
				}
				if (Static59.anInt1402 != 0) {
					Static131.method2247(0, Static127.method2169(new Class81[] { Static121.aClass81_980, local26.aClass81_554 }), Static140.aClass81_1099);
				}
				Static5.method115("CS2 - scr:" + local26.aLong148 + " op:" + local45 + new String(local8027.method2828()), local7997);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method2310() {
		if (Static50.aBoolean45 && Static44.anInt1086 != Static77.anInt1824) {
			Static31.method677(Static44.anInt1086, Static35.anInt963, Static98.anInt2164, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0]);
		} else if (Static44.anInt1086 != Static168.anInt3903) {
			Static168.anInt3903 = Static44.anInt1086;
			method2308(Static44.anInt1086);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IJ)V")
	private static void method2311(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static58.anInt1378; local14++) {
			if (arg0 == Static121.aLongArray6[local14]) {
				Static58.anInt1378--;
				for (@Pc(36) int local36 = local14; local36 < Static58.anInt1378; local36++) {
					Static178.aClass81Array22[local36] = Static178.aClass81Array22[local36 + 1];
					Static179.anIntArray428[local36] = Static179.anIntArray428[local36 + 1];
					Static121.aLongArray6[local36] = Static121.aLongArray6[local36 + 1];
					Static111.anIntArray270[local36] = Static111.anIntArray270[local36 + 1];
				}
				Static140.anInt3066 = Static121.anInt2701;
				Static104.aClass1_Sub8_Sub1_2.method366(146);
				Static104.aClass1_Sub8_Sub1_2.method355(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public static void method2312() {
		aClass81_1058 = null;
		aClass81_1059 = null;
		aRandom1 = null;
		aClass81_1057 = null;
	}
}
