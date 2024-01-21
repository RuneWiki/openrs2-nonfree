import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!ve;")
	public static Class69 aClass69_8;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!ve;")
	public static Class69 aClass69_9;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static final int anInt991 = 2301979;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_237 = Static81.method1507(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
	public static final int[] anIntArray88 = new int[128];

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[I")
	public static final int[] anIntArray89 = new int[4000];

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_238 = Static81.method1507("Null");

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIB)I")
	public static int method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 >> 7;
		@Pc(16) int local16 = arg2 >> 7;
		if (local16 < 0 || local12 < 0 || local16 > 103 || local12 > 103) {
			return 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 & 0x7F;
		if (arg1 < 3 && (Static43.aByteArrayArrayArray3[1][local16][local12] & 0x2) == 2) {
			local40 = arg1 + 1;
		}
		@Pc(67) int local67 = arg0 & 0x7F;
		@Pc(95) int local95 = Static186.anIntArrayArrayArray2[local40][local16][local12] * (128 - local44) + local44 * Static186.anIntArrayArrayArray2[local40][local16 + 1][local12] >> 7;
		@Pc(126) int local126 = Static186.anIntArrayArrayArray2[local40][local16 + 1][local12 + 1] * local44 + (128 - local44) * Static186.anIntArrayArrayArray2[local40][local16][local12 + 1] >> 7;
		return (128 - local67) * local95 + local126 * local67 >> 7;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V")
	public static void method700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class87 local11 = Static31.aClass87ArrayArrayArray1[Static170.anInt3799][arg0][arg1];
		if (local11 == null) {
			Static94.method1690(Static170.anInt3799, arg0, arg1);
			return;
		}
		@Pc(29) int local29 = -99999999;
		@Pc(34) Class1_Sub2_Sub16 local34 = (Class1_Sub2_Sub16) local11.method2827();
		@Pc(36) Class1_Sub2_Sub16 local36 = null;
		while (local34 != null) {
			@Pc(43) Class1_Sub2_Sub23 local43 = Static168.method2886(local34.aClass5_Sub7_1.anInt4089);
			@Pc(46) int local46 = local43.anInt4210;
			if (local43.anInt4214 == 1) {
				local46 *= local34.aClass5_Sub7_1.anInt4083 + 1;
			}
			if (local46 > local29) {
				local36 = local34;
				local29 = local46;
			}
			local34 = (Class1_Sub2_Sub16) local11.method2830();
		}
		if (local36 == null) {
			Static94.method1690(Static170.anInt3799, arg0, arg1);
			return;
		}
		local11.method2824(local36);
		local34 = (Class1_Sub2_Sub16) local11.method2827();
		@Pc(92) Class5_Sub7 local92 = null;
		@Pc(94) Class5_Sub7 local94 = null;
		while (local34 != null) {
			@Pc(98) Class5_Sub7 local98 = local34.aClass5_Sub7_1;
			if (local36.aClass5_Sub7_1.anInt4089 != local98.anInt4089) {
				if (local92 == null) {
					local92 = local98;
				}
				if (local92.anInt4089 != local98.anInt4089 && local94 == null) {
					local94 = local98;
				}
			}
			local34 = (Class1_Sub2_Sub16) local11.method2830();
		}
		@Pc(137) long local137 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static68.method1336(Static170.anInt3799, arg0, arg1, method699(arg1 * 128 + 64, Static170.anInt3799, arg0 * 128 + 64), local36.aClass5_Sub7_1, local137, local92, local94);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method701() {
		while (true) {
			if (Static192.aClass1_Sub7_Sub1_31.method2807(Static80.anInt1916) >= 11) {
				@Pc(14) int local14 = Static192.aClass1_Sub7_Sub1_31.method2811(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static110.aClass5_Sub2_Sub1Array1[local14] == null) {
						Static110.aClass5_Sub2_Sub1Array1[local14] = new Class5_Sub2_Sub1();
						if (Static114.aClass1_Sub7Array1[local14] != null) {
							Static110.aClass5_Sub2_Sub1Array1[local14].method476(Static114.aClass1_Sub7Array1[local14]);
						}
						local21 = true;
					}
					Static41.anIntArray115[Static82.anInt1956++] = local14;
					@Pc(57) Class5_Sub2_Sub1 local57 = Static110.aClass5_Sub2_Sub1Array1[local14];
					local57.anInt2489 = Static42.anInt1100;
					@Pc(65) int local65 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
					@Pc(72) int local72 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
					if (local72 == 1) {
						Static127.anIntArray222[Static24.anInt663++] = local14;
					}
					@Pc(90) int local90 = Static192.aClass1_Sub7_Sub1_31.method2811(5);
					@Pc(99) int local99 = Static74.anIntArray153[Static192.aClass1_Sub7_Sub1_31.method2811(3)];
					if (local90 > 15) {
						local90 -= 32;
					}
					if (local21) {
						local57.anInt2463 = local57.anInt2474 = local99;
					}
					@Pc(120) int local120 = Static192.aClass1_Sub7_Sub1_31.method2811(5);
					if (local120 > 15) {
						local120 -= 32;
					}
					local57.method1889(Static87.aClass5_Sub2_Sub1_1.anIntArray199[0] + local120, local90 + Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], local65 == 1);
					continue;
				}
			}
			Static192.aClass1_Sub7_Sub1_31.method2804();
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lclient!de;")
	public static Class1_Sub2_Sub5 method702(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub5 local10 = (Class1_Sub2_Sub5) Static75.aClass86_62.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static61.aClass69_17.method2208(Static72.method1364(arg0), Static53.method1057(arg0));
		local10 = new Class1_Sub2_Sub5();
		local10.anInt980 = arg0;
		if (local24 != null) {
			local10.method697(new Class1_Sub7(local24));
		}
		local10.method688();
		if (local10.aBoolean51) {
			local10.aBoolean53 = false;
			local10.anInt965 = 0;
		}
		if (!Static17.aBoolean18 && local10.aBoolean47) {
			local10.aClass24Array6 = null;
		}
		Static75.aClass86_62.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!vc;II)V")
	public static void method703(@OriginalArg(1) int arg0, @OriginalArg(2) Class98 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static67.method1334();
		Static90.method3501(arg3, arg2, arg3 + arg1.anInt4400, arg1.anInt4403 + arg2);
		if (Static103.anInt2308 == 2 || Static103.anInt2308 == 5) {
			Static90.method3493(arg3, arg2, arg1.anIntArray387, arg1.anIntArray389);
		} else {
			@Pc(43) int local43 = Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32 + 48;
			@Pc(49) int local49 = Static66.anInt1655 + Static115.anInt2586 & 0x7FF;
			@Pc(57) int local57 = 464 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
			Static169.aClass1_Sub2_Sub8_Sub3_3.method2345(arg3, arg2, arg1.anInt4400, arg1.anInt4403, local43, local57, local49, Static192.anInt4308 + 256, arg1.anIntArray387, arg1.anIntArray389);
			@Pc(93) int local93;
			@Pc(107) int local107;
			for (@Pc(77) int local77 = 0; local77 < Static185.anInt4151; local77++) {
				local93 = Static66.anIntArray142[local77] * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
				local107 = Static153.anIntArray290[local77] * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
				@Pc(113) Class1_Sub2_Sub5 local113 = method702(Static57.anIntArray126[local77]);
				if (local113.anIntArray85 != null) {
					local113 = local113.method695();
					if (local113 == null || local113.anInt957 == -1) {
						continue;
					}
				}
				Static102.method1758(arg3, Static134.aClass1_Sub2_Sub8_Sub3Array15[local113.anInt957], local107, arg1, arg2, local93);
			}
			@Pc(173) int local173;
			for (local93 = 0; local93 < 104; local93++) {
				for (local107 = 0; local107 < 104; local107++) {
					@Pc(159) Class87 local159 = Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local93][local107];
					if (local159 != null) {
						local173 = local107 * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
						@Pc(185) int local185 = local93 * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
						Static102.method1758(arg3, Static207.aClass1_Sub2_Sub8_Sub3Array22[0], local173, arg1, arg2, local185);
					}
				}
			}
			@Pc(265) int local265;
			for (local107 = 0; local107 < Static138.anInt3107; local107++) {
				@Pc(217) Class5_Sub2_Sub2 local217 = Static148.aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local107]];
				if (local217 != null && local217.method1894()) {
					@Pc(226) Class1_Sub2_Sub21 local226 = local217.aClass1_Sub2_Sub21_1;
					if (local226 != null && local226.anIntArray337 != null) {
						local226 = local226.method3046();
					}
					if (local226 != null && local226.aBoolean183 && local226.aBoolean184) {
						local173 = local217.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
						local265 = local217.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
						Static102.method1758(arg3, Static207.aClass1_Sub2_Sub8_Sub3Array22[1], local265, arg1, arg2, local173);
					}
				}
			}
			for (@Pc(285) int local285 = 0; local285 < Static82.anInt1956; local285++) {
				@Pc(293) Class5_Sub2_Sub1 local293 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local285]];
				if (local293 != null && local293.method1894()) {
					local173 = local293.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
					local265 = local293.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
					@Pc(323) boolean local323 = false;
					@Pc(328) long local328 = local293.aClass24_173.method747();
					for (@Pc(330) int local330 = 0; local330 < Static105.anInt2367; local330++) {
						if (local328 == Static145.aLongArray28[local330] && Static34.anIntArray80[local330] != 0) {
							local323 = true;
							break;
						}
					}
					@Pc(352) boolean local352 = false;
					if (Static87.aClass5_Sub2_Sub1_1.anInt617 != 0 && local293.anInt617 != 0 && local293.anInt617 == Static87.aClass5_Sub2_Sub1_1.anInt617) {
						local352 = true;
					}
					if (local323) {
						Static102.method1758(arg3, Static207.aClass1_Sub2_Sub8_Sub3Array22[3], local265, arg1, arg2, local173);
					} else if (local352) {
						Static102.method1758(arg3, Static207.aClass1_Sub2_Sub8_Sub3Array22[4], local265, arg1, arg2, local173);
					} else {
						Static102.method1758(arg3, Static207.aClass1_Sub2_Sub8_Sub3Array22[2], local265, arg1, arg2, local173);
					}
				}
			}
			local173 = 0;
			@Pc(419) Class48[] local419 = Static56.aClass48Array1;
			@Pc(512) int local512;
			while (local419.length > local173) {
				@Pc(425) Class48 local425 = local419[local173];
				if (local425 != null && local425.anInt2070 != 0 && Static42.anInt1100 % 20 < 10) {
					@Pc(483) int local483;
					@Pc(473) int local473;
					if (local425.anInt2070 == 1 && local425.anInt2072 >= 0 && Static148.aClass5_Sub2_Sub2Array1.length > local425.anInt2072) {
						@Pc(460) Class5_Sub2_Sub2 local460 = Static148.aClass5_Sub2_Sub2Array1[local425.anInt2072];
						if (local460 != null) {
							local473 = local460.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
							local483 = local460.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
							Static70.method2484(arg3, arg1, local425.anInt2062, local483, arg2, local473);
						}
					}
					if (local425.anInt2070 == 2) {
						local512 = (local425.anInt2073 + -Static196.anInt4343) * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
						local473 = (local425.anInt2065 - Static127.anInt2789) * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
						Static70.method2484(arg3, arg1, local425.anInt2062, local473, arg2, local512);
					}
					if (local425.anInt2070 == 10 && local425.anInt2072 >= 0 && Static110.aClass5_Sub2_Sub1Array1.length > local425.anInt2072) {
						@Pc(554) Class5_Sub2_Sub1 local554 = Static110.aClass5_Sub2_Sub1Array1[local425.anInt2072];
						if (local554 != null) {
							local473 = local554.anInt2501 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
							local483 = local554.anInt2448 / 32 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
							Static70.method2484(arg3, arg1, local425.anInt2062, local483, arg2, local473);
						}
					}
				}
				local173++;
			}
			if (Static174.anInt3879 != 0) {
				local265 = Static174.anInt3879 * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2501 / 32;
				local512 = Static35.anInt4154 * 4 + 2 - Static87.aClass5_Sub2_Sub1_1.anInt2448 / 32;
				Static102.method1758(arg3, Static172.aClass1_Sub2_Sub8_Sub3_4, local512, arg1, arg2, local265);
			}
			Static90.method3482(arg1.anInt4400 / 2 + arg3 - 1, arg2 + -1 - -(arg1.anInt4403 / 2), 3, 3, 16777215);
		}
		Static163.aBooleanArray17[arg0] = true;
	}
}
