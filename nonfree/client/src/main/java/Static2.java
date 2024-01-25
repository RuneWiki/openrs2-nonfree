import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array6;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method1426() {
		Static159.anInt3128 = -1;
		Static224.anInt4437 = -1;
		Static271.anInt5299 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)V")
	public static void method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static226.method4085(arg5);
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg5 - arg2;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local18;
		@Pc(32) int local32 = -local18;
		@Pc(34) int local34 = -1;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		if (arg0 >= Static75.anInt1447 && arg0 <= Static346.anInt6668) {
			@Pc(48) int[] local48 = Static129.anIntArrayArray46[arg0];
			local57 = Static161.method2842(arg3 - arg5, Static353.anInt6760, Static163.anInt3234);
			local65 = Static161.method2842(arg3 + arg5, Static353.anInt6760, Static163.anInt3234);
			local74 = Static161.method2842(arg3 - local18, Static353.anInt6760, Static163.anInt3234);
			local83 = Static161.method2842(arg3 + local18, Static353.anInt6760, Static163.anInt3234);
			Static160.method2840(arg1, local74, local57, local48);
			Static160.method2840(arg4, local83, local74, local48);
			Static160.method2840(arg1, local65, local83, local48);
		}
		@Pc(103) int local103 = -1;
		while (local10 < local24) {
			local103 += 2;
			local34 += 2;
			local32 += local103;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static349.anIntArray633[local29] = local10;
			}
			local10++;
			@Pc(199) int local199;
			@Pc(208) int local208;
			@Pc(215) int[] local215;
			@Pc(149) int local149;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local149 = arg0 - local24;
				local57 = local24 + arg0;
				if (local57 >= Static75.anInt1447 && Static346.anInt6668 >= local149) {
					if (local18 > local24) {
						local65 = Static349.anIntArray633[local24];
						local74 = Static161.method2842(local10 + arg3, Static353.anInt6760, Static163.anInt3234);
						local83 = Static161.method2842(arg3 - local10, Static353.anInt6760, Static163.anInt3234);
						local199 = Static161.method2842(arg3 + local65, Static353.anInt6760, Static163.anInt3234);
						local208 = Static161.method2842(arg3 - local65, Static353.anInt6760, Static163.anInt3234);
						if (Static346.anInt6668 >= local57) {
							local215 = Static129.anIntArrayArray46[local57];
							Static160.method2840(arg1, local208, local83, local215);
							Static160.method2840(arg4, local199, local208, local215);
							Static160.method2840(arg1, local74, local199, local215);
						}
						if (local149 >= Static75.anInt1447) {
							local215 = Static129.anIntArrayArray46[local149];
							Static160.method2840(arg1, local208, local83, local215);
							Static160.method2840(arg4, local199, local208, local215);
							Static160.method2840(arg1, local74, local199, local215);
						}
					} else {
						local65 = Static161.method2842(arg3 + local10, Static353.anInt6760, Static163.anInt3234);
						local74 = Static161.method2842(arg3 - local10, Static353.anInt6760, Static163.anInt3234);
						if (local57 <= Static346.anInt6668) {
							Static160.method2840(arg1, local65, local74, Static129.anIntArrayArray46[local57]);
						}
						if (local149 >= Static75.anInt1447) {
							Static160.method2840(arg1, local65, local74, Static129.anIntArrayArray46[local149]);
						}
					}
				}
			}
			local149 = arg0 - local10;
			local57 = arg0 + local10;
			if (Static75.anInt1447 <= local57 && Static346.anInt6668 >= local149) {
				local65 = arg3 + local24;
				local74 = arg3 - local24;
				if (local65 >= Static163.anInt3234 && Static353.anInt6760 >= local74) {
					local65 = Static161.method2842(local65, Static353.anInt6760, Static163.anInt3234);
					local74 = Static161.method2842(local74, Static353.anInt6760, Static163.anInt3234);
					if (local10 < local18) {
						local83 = local29 < local10 ? Static349.anIntArray633[local10] : local29;
						local199 = Static161.method2842(local83 + arg3, Static353.anInt6760, Static163.anInt3234);
						local208 = Static161.method2842(arg3 - local83, Static353.anInt6760, Static163.anInt3234);
						if (Static346.anInt6668 >= local57) {
							local215 = Static129.anIntArrayArray46[local57];
							Static160.method2840(arg1, local208, local74, local215);
							Static160.method2840(arg4, local199, local208, local215);
							Static160.method2840(arg1, local65, local199, local215);
						}
						if (local149 >= Static75.anInt1447) {
							local215 = Static129.anIntArrayArray46[local149];
							Static160.method2840(arg1, local208, local74, local215);
							Static160.method2840(arg4, local199, local208, local215);
							Static160.method2840(arg1, local65, local199, local215);
						}
					} else {
						if (Static346.anInt6668 >= local57) {
							Static160.method2840(arg1, local65, local74, Static129.anIntArrayArray46[local57]);
						}
						if (local149 >= Static75.anInt1447) {
							Static160.method2840(arg1, local65, local74, Static129.anIntArrayArray46[local149]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method1430(@OriginalArg(1) Class55 arg0) {
		@Pc(11) int local11 = Static187.anInt3710;
		@Pc(13) int local13 = Static141.anInt2737;
		@Pc(15) int local15 = Static334.anInt6466;
		@Pc(17) int local17 = Static127.anInt2450;
		arg0.method5254(local15, -10660793, local17, local11, local13);
		arg0.method5254(local15 - 2, -16777216, 16, local11 + 1, local13 + 1);
		arg0.method5251(local11 + 1, -16777216, -2 + local15, local17 - 19, local13 - -18);
		Static77.aClass18_1.method4174(local11 + 3, -10660793, local13 + 14, -1, Static8.aClass85_6.method2020(Static41.anInt726));
		@Pc(76) int local76 = Static316.aClass118_3.method4054();
		@Pc(80) int local80 = Static316.aClass118_3.method4050();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class5_Sub20 local87 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local87 != null; local87 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			@Pc(102) int local102 = local13 + (Static160.anInt3181 + (-1 - local82)) * 16 + 31;
			@Pc(104) short local104 = -1;
			if (local11 < local76 && local76 < local11 + local15 && local102 - 13 < local80 && local102 + 3 > local80) {
				local104 = -256;
			}
			@Pc(130) int[] local130 = null;
			if (Static96.method1758(local87.anInt2094)) {
				local130 = Static322.method544((int) local87.aLong73).anIntArray385;
			} else if (Static60.method1846(local87.anInt2094)) {
				@Pc(177) Class4_Sub5_Sub2_Sub2 local177 = Static280.aClass4_Sub5_Sub2_Sub2Array1[(int) local87.aLong73];
				if (local177 != null) {
					local130 = local177.aClass106_1.anIntArray323;
				}
			} else if (Static134.method1927(local87.anInt2094)) {
				if (local87.anInt2094 == 1011) {
					local130 = Static111.method1967((int) local87.aLong73).anIntArray436;
				} else {
					local130 = Static111.method1967((int) (local87.aLong73 >>> 32 & 0x7FFFFFFFL)).anIntArray436;
				}
			}
			@Pc(195) String local195 = Static124.method2199(local87);
			if (local130 != null) {
				local195 = local195 + Static7.method121(local130);
			}
			Static77.aClass18_1.method4173(Static34.anIntArray70, local195, Static303.aClass95Array15, local104, local102, local11 + 3);
			local82++;
		}
		Static142.method2518(Static334.anInt6466, Static127.anInt2450, Static187.anInt3710, Static141.anInt2737);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!h;)V")
	public static void method1432(@OriginalArg(1) Class5_Sub20 arg0) {
		if (arg0 == null || Class4_Sub3_Sub2.aClass103_139.aClass5_114 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt2093;
		@Pc(18) int local18 = arg0.anInt2092;
		@Pc(21) int local21 = arg0.anInt2094;
		@Pc(25) int local25 = (int) arg0.aLong73;
		@Pc(33) long local33 = arg0.aLong73;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (Static150.aClass5_Sub26_1 == null) {
			local47 = Static119.anInt3763;
			local43 = Static164.anInt3268;
		} else {
			local43 = Static150.aClass5_Sub26_1.method4478();
			local47 = Static150.aClass5_Sub26_1.method4483();
		}
		@Pc(62) Class4_Sub5_Sub2_Sub1 local62;
		if (local21 == 19) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static156.anInt3028 = 0;
				Static208.anInt4116 = 2;
				Static40.anInt716 = local47;
				Static335.anInt6568 = local43;
				Static125.aClass5_Sub12_Sub2_3.method5125(64);
				Static125.aClass5_Sub12_Sub2_3.method5076(local25);
				Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		@Pc(137) Class4_Sub5_Sub2_Sub2 local137;
		if (local21 == 10) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static40.anInt716 = local47;
				Static208.anInt4116 = 2;
				Static335.anInt6568 = local43;
				Static156.anInt3028 = 0;
				Static125.aClass5_Sub12_Sub2_3.method5125(75);
				Static125.aClass5_Sub12_Sub2_3.method5095(local25);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 45) {
			Static208.anInt4116 = 2;
			Static40.anInt716 = local47;
			Static156.anInt3028 = 0;
			Static335.anInt6568 = local43;
			Static125.aClass5_Sub12_Sub2_3.method5125(198);
			Static125.aClass5_Sub12_Sub2_3.method5076(local25);
			Static125.aClass5_Sub12_Sub2_3.method5088(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static96.method1759(local18, local15);
		}
		if (local21 == 1008) {
			Static335.anInt6568 = local43;
			Static208.anInt4116 = 2;
			Static40.anInt716 = local47;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(188);
			Static125.aClass5_Sub12_Sub2_3.method5076(local25);
		}
		if (local21 == 9) {
			Static40.anInt716 = local47;
			Static156.anInt3028 = 0;
			Static208.anInt4116 = 2;
			Static335.anInt6568 = local43;
			Static125.aClass5_Sub12_Sub2_3.method5125(4);
			Static125.aClass5_Sub12_Sub2_3.method5084(Static240.anInt4828);
			Static125.aClass5_Sub12_Sub2_3.method5082(Static166.anInt3318);
			Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5095(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5088(local25);
			Static125.aClass5_Sub12_Sub2_3.method5088(local15 + Static172.anInt4394);
			Static96.method1759(local18, local15);
		}
		if (local21 == 1011) {
			Static208.anInt4116 = 2;
			Static40.anInt716 = local47;
			Static156.anInt3028 = 0;
			Static335.anInt6568 = local43;
			Static125.aClass5_Sub12_Sub2_3.method5125(222);
			Static125.aClass5_Sub12_Sub2_3.method5095(local25);
		}
		if (local21 == 48) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static40.anInt716 = local47;
				Static335.anInt6568 = local43;
				Static208.anInt4116 = 2;
				Static156.anInt3028 = 0;
				Static125.aClass5_Sub12_Sub2_3.method5125(221);
				Static125.aClass5_Sub12_Sub2_3.method5076(local25);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 23 && Static208.aClass201_9 == null) {
			Static269.method4715(local18, local15);
			Static208.aClass201_9 = Static297.method5150(local18, local15);
			Static189.method3383(Static208.aClass201_9);
		}
		if (local21 == 12) {
			Static208.anInt4116 = 2;
			Static40.anInt716 = local47;
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(71);
			Static125.aClass5_Sub12_Sub2_3.method5095(local15 + Static172.anInt4394);
			Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5095(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5088(local25);
			Static96.method1759(local18, local15);
		}
		@Pc(511) Class201 local511;
		if (local21 == 6) {
			local511 = Static297.method5150(local18, local15);
			if (local511 != null) {
				Static306.method5347(local511);
			}
		}
		if (local21 == 20) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static208.anInt4116 = 2;
				Static156.anInt3028 = 0;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static125.aClass5_Sub12_Sub2_3.method5125(37);
				Static125.aClass5_Sub12_Sub2_3.method5084(local25);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 1012 || local21 == 1007 || local21 == 1010 || local21 == 1003 || local21 == 1002) {
			Static33.method563(local25, local21, local15);
		}
		if (local21 == 57) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static208.anInt4116 = 2;
				Static40.anInt716 = local47;
				Static156.anInt3028 = 0;
				Static335.anInt6568 = local43;
				Static125.aClass5_Sub12_Sub2_3.method5125(208);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5088(local25);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 4) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static208.anInt4116 = 2;
				Static156.anInt3028 = 0;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static125.aClass5_Sub12_Sub2_3.method5125(161);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5076(local25);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 1001) {
			Static208.anInt4116 = 2;
			Static156.anInt3028 = 0;
			Static40.anInt716 = local47;
			Static335.anInt6568 = local43;
			Static125.aClass5_Sub12_Sub2_3.method5125(197);
			Static125.aClass5_Sub12_Sub2_3.method5059(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5084(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5088((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static125.aClass5_Sub12_Sub2_3.method5084(local18 + Static12.anInt3797);
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 15) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static156.anInt3028 = 0;
				Static208.anInt4116 = 2;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static125.aClass5_Sub12_Sub2_3.method5125(167);
				Static125.aClass5_Sub12_Sub2_3.method5095(local25);
				Static125.aClass5_Sub12_Sub2_3.method5059(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 60) {
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			Static208.anInt4116 = 2;
			Static40.anInt716 = local47;
			Static125.aClass5_Sub12_Sub2_3.method5125(58);
			Static125.aClass5_Sub12_Sub2_3.method5095(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5088((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static125.aClass5_Sub12_Sub2_3.method5076(local15 + Static172.anInt4394);
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 47) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static156.anInt3028 = 0;
				Static40.anInt716 = local47;
				Static208.anInt4116 = 2;
				Static335.anInt6568 = local43;
				Static125.aClass5_Sub12_Sub2_3.method5125(158);
				Static125.aClass5_Sub12_Sub2_3.method5088(local25);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 25) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static156.anInt3028 = 0;
				Static40.anInt716 = local47;
				Static335.anInt6568 = local43;
				Static208.anInt4116 = 2;
				Static125.aClass5_Sub12_Sub2_3.method5125(185);
				Static125.aClass5_Sub12_Sub2_3.method5088(local25);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 30) {
			Static40.anInt716 = local47;
			Static208.anInt4116 = 1;
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(11);
			Static125.aClass5_Sub12_Sub2_3.method5108(Static166.anInt3318);
			Static125.aClass5_Sub12_Sub2_3.method5095(local18 + Static12.anInt3797);
			Static125.aClass5_Sub12_Sub2_3.method5084(Static240.anInt4828);
			Static125.aClass5_Sub12_Sub2_3.method5095(Static172.anInt4394 + local15);
			Static155.method2784(local18, true, 1, 0, 1, local15, -4, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
		}
		if (local21 == 1006) {
			Static40.anInt716 = local47;
			Static208.anInt4116 = 2;
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				@Pc(1173) Class106 local1173 = local137.aClass106_1;
				if (local1173.anIntArray326 != null) {
					local1173 = local1173.method2829();
				}
				if (local1173 != null) {
					Static125.aClass5_Sub12_Sub2_3.method5125(231);
					Static125.aClass5_Sub12_Sub2_3.method5076(local1173.anInt3131);
				}
			}
		}
		if (local21 == 3) {
			Static156.anInt3028 = 0;
			Static335.anInt6568 = local43;
			Static40.anInt716 = local47;
			Static208.anInt4116 = 2;
			Static125.aClass5_Sub12_Sub2_3.method5125(141);
			Static125.aClass5_Sub12_Sub2_3.method5095((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static125.aClass5_Sub12_Sub2_3.method5059(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5088(local18 + Static12.anInt3797);
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 58) {
			Static40.anInt716 = local47;
			Static156.anInt3028 = 0;
			Static335.anInt6568 = local43;
			Static208.anInt4116 = 2;
			Static125.aClass5_Sub12_Sub2_3.method5125(168);
			Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5095(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static125.aClass5_Sub12_Sub2_3.method5088(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5095(local18 + Static12.anInt3797);
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 51) {
			Static156.anInt3028 = 0;
			Static40.anInt716 = local47;
			Static335.anInt6568 = local43;
			Static208.anInt4116 = 2;
			Static125.aClass5_Sub12_Sub2_3.method5125(48);
			Static125.aClass5_Sub12_Sub2_3.method5088(local25);
			Static125.aClass5_Sub12_Sub2_3.method5084(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5088(local18 + Static12.anInt3797);
			Static96.method1759(local18, local15);
		}
		if (local21 == 18) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static156.anInt3028 = 0;
				Static208.anInt4116 = 2;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static125.aClass5_Sub12_Sub2_3.method5125(61);
				Static125.aClass5_Sub12_Sub2_3.method5088(local25);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 17) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static156.anInt3028 = 0;
				Static208.anInt4116 = 2;
				Static125.aClass5_Sub12_Sub2_3.method5125(179);
				Static125.aClass5_Sub12_Sub2_3.method5095(local25);
				Static125.aClass5_Sub12_Sub2_3.method5088(Static240.anInt4828);
				Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5070(Static166.anInt3318);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 5) {
			local511 = Static297.method5150(local18, local15);
			if (local511 != null) {
				Static113.method1983();
				@Pc(1532) Class5_Sub44 local1532 = Static45.method707(local511);
				Static223.method4068(local18, local1532.anInt6432, local15, local511.anInt6560, local511.anInt6562, local1532.method5748());
				Static255.aString49 = Static89.method1617(local511);
				if (Static255.aString49 == null) {
					Static255.aString49 = "Null";
				}
				Static230.aString42 = local511.aString62 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 50) {
			if (Static262.anInt5151 > 0 && Static174.aClass2_1.method1425(82) && Static174.aClass2_1.method1425(81)) {
				Static283.method4923(Static239.anInt4811, Static172.anInt4394 + local15, Static12.anInt3797 - -local18);
			} else {
				Static156.anInt3028 = 0;
				Static208.anInt4116 = 1;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static125.aClass5_Sub12_Sub2_3.method5125(132);
				Static125.aClass5_Sub12_Sub2_3.method5088(local15 + Static172.anInt4394);
				Static125.aClass5_Sub12_Sub2_3.method5076(local18 + Static12.anInt3797);
			}
		}
		if (local21 == 13) {
			if (Static262.anInt5151 > 0 && Static174.aClass2_1.method1425(82) && Static174.aClass2_1.method1425(81)) {
				Static283.method4923(Static239.anInt4811, Static172.anInt4394 + local15, Static12.anInt3797 + local18);
			} else {
				Static188.method3368(local18, local25, local15);
				if (local25 == 1) {
					Static125.aClass5_Sub12_Sub2_3.method5089(-1);
					Static125.aClass5_Sub12_Sub2_3.method5089(-1);
					Static125.aClass5_Sub12_Sub2_3.method5084((int) Static164.aFloat24);
					Static125.aClass5_Sub12_Sub2_3.method5089(57);
					Static125.aClass5_Sub12_Sub2_3.method5089(Static170.anInt3407);
					Static125.aClass5_Sub12_Sub2_3.method5089(Static9.anInt191);
					Static125.aClass5_Sub12_Sub2_3.method5089(89);
					Static125.aClass5_Sub12_Sub2_3.method5084(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631);
					Static125.aClass5_Sub12_Sub2_3.method5084(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632);
					Static125.aClass5_Sub12_Sub2_3.method5089(63);
				} else {
					Static40.anInt716 = local47;
					Static335.anInt6568 = local43;
					Static208.anInt4116 = 1;
					Static156.anInt3028 = 0;
				}
				Static155.method2784(local18, true, 1, 0, 1, local15, -4, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 11) {
			Static40.anInt716 = local47;
			Static208.anInt4116 = 2;
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(63);
			Static125.aClass5_Sub12_Sub2_3.method5076(local25);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5059(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static12.anInt3797 + local18);
			Static96.method1759(local18, local15);
		}
		if (local21 == 2 || local21 == 1009) {
			Static159.method2824(local15, local25, local18, arg0.aString13);
		}
		if (local21 == 49) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static156.anInt3028 = 0;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static208.anInt4116 = 2;
				Static125.aClass5_Sub12_Sub2_3.method5125(95);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5088(local25);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 59) {
			Static40.anInt716 = local47;
			Static335.anInt6568 = local43;
			Static208.anInt4116 = 2;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(232);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static240.anInt4828);
			Static125.aClass5_Sub12_Sub2_3.method5084(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5082(Static166.anInt3318);
			Static125.aClass5_Sub12_Sub2_3.method5088(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5095(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 21) {
			Static208.anInt4116 = 2;
			Static156.anInt3028 = 0;
			Static40.anInt716 = local47;
			Static335.anInt6568 = local43;
			Static125.aClass5_Sub12_Sub2_3.method5125(47);
			Static125.aClass5_Sub12_Sub2_3.method5084(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static125.aClass5_Sub12_Sub2_3.method5084(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5059(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static12.anInt3797 + local18);
			Static139.method2459(local15, local18, local33);
		}
		if (local21 == 22) {
			Static40.anInt716 = local47;
			Static208.anInt4116 = 2;
			Static335.anInt6568 = local43;
			Static156.anInt3028 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5125(228);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static12.anInt3797 + local18);
			Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
			Static125.aClass5_Sub12_Sub2_3.method5076(Static172.anInt4394 + local15);
			Static125.aClass5_Sub12_Sub2_3.method5084(local25);
			Static96.method1759(local18, local15);
		}
		if (local21 == 8) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static208.anInt4116 = 2;
				Static40.anInt716 = local47;
				Static156.anInt3028 = 0;
				Static335.anInt6568 = local43;
				Static125.aClass5_Sub12_Sub2_3.method5125(108);
				Static125.aClass5_Sub12_Sub2_3.method5071(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5084(local25);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 46) {
			local62 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local25];
			if (local62 != null) {
				Static156.anInt3028 = 0;
				Static40.anInt716 = local47;
				Static335.anInt6568 = local43;
				Static208.anInt4116 = 2;
				Static125.aClass5_Sub12_Sub2_3.method5125(233);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5095(local25);
				Static155.method2784(local62.anIntArray522[0], true, local62.method4807(), 0, local62.method4807(), local62.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (local21 == 44) {
			local137 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local25];
			if (local137 != null) {
				Static208.anInt4116 = 2;
				Static335.anInt6568 = local43;
				Static40.anInt716 = local47;
				Static156.anInt3028 = 0;
				Static125.aClass5_Sub12_Sub2_3.method5125(73);
				Static125.aClass5_Sub12_Sub2_3.method5084(local25);
				Static125.aClass5_Sub12_Sub2_3.method5082(Static166.anInt3318);
				Static125.aClass5_Sub12_Sub2_3.method5069(Static174.aClass2_1.method1425(82) ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5076(Static240.anInt4828);
				Static155.method2784(local137.anIntArray522[0], true, local137.method4807(), 0, local137.method4807(), local137.anIntArray523[0], -2, 0, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0]);
			}
		}
		if (Static54.aBoolean72) {
			Static113.method1983();
		}
		if (Static325.aClass201_11 != null && Static53.anInt995 == 0) {
			Static189.method3383(Static325.aClass201_11);
		}
	}
}
