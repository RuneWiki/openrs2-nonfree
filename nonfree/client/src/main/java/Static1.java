import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static int anInt1 = 0;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1 = Static158.method3034("(U");

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_2 = Static158.method3034("Starting 3d library");

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_3 = Static158.method3034("Loading wordpack )2 ");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_4 = Static158.method3034("blaugr-Un:");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[Lclient!ja;")
	public static final Class40[] aClass40Array1 = new Class40[23];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_5 = Static158.method3034("button near the top of that page)3");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt4 = 0;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!ob;")
	public static Class60 aClass60_6 = aClass60_3;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!ob;")
	public static Class60 aClass60_7 = aClass60_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!ob;")
	public static Class60 aClass60_8 = aClass60_5;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	public static void method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) long local15 = Static197.method3579(arg3, arg2, arg4);
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(28) int local28;
		@Pc(57) int local57;
		@Pc(67) int local67;
		if (local15 != 0L) {
			local26 = (int) local15 >> 20 & 0x3;
			local28 = arg0;
			local35 = (int) local15 >> 14 & 0x1F;
			if (local15 > 0L) {
				local28 = arg1;
			}
			local57 = arg2 * 4 + (103 - arg4) * 2048 + 24624;
			@Pc(60) int[] local60 = Static98.aClass2_Sub1_Sub7_Sub4_6.anIntArray310;
			local67 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(71) Class2_Sub1_Sub9 local71 = Static158.method3037(local67);
			if (local71.anInt1649 == -1) {
				if (local35 == 0 || local35 == 2) {
					if (local26 == 0) {
						local60[local57] = local28;
						local60[local57 + 512] = local28;
						local60[local57 + 1024] = local28;
						local60[local57 + 1536] = local28;
					} else if (local26 == 1) {
						local60[local57] = local28;
						local60[local57 + 1] = local28;
						local60[local57 + 2] = local28;
						local60[local57 + 3] = local28;
					} else if (local26 == 2) {
						local60[local57 + 3] = local28;
						local60[local57 + 515] = local28;
						local60[local57 + 3 + 1024] = local28;
						local60[local57 + 3 + 1536] = local28;
					} else if (local26 == 3) {
						local60[local57 + 1536] = local28;
						local60[local57 + 1 + 1536] = local28;
						local60[local57 + 2 + 1536] = local28;
						local60[local57 + 3 + 1536] = local28;
					}
				}
				if (local35 == 3) {
					if (local26 == 0) {
						local60[local57] = local28;
					} else if (local26 == 1) {
						local60[local57 + 3] = local28;
					} else if (local26 == 2) {
						local60[local57 + 3 + 1536] = local28;
					} else if (local26 == 3) {
						local60[local57 + 1536] = local28;
					}
				}
				if (local35 == 2) {
					if (local26 == 3) {
						local60[local57] = local28;
						local60[local57 + 512] = local28;
						local60[local57 + 1024] = local28;
						local60[local57 + 1536] = local28;
					} else if (local26 == 0) {
						local60[local57] = local28;
						local60[local57 + 1] = local28;
						local60[local57 + 2] = local28;
						local60[local57 + 3] = local28;
					} else if (local26 == 1) {
						local60[local57 + 3] = local28;
						local60[local57 + 512 + 3] = local28;
						local60[local57 + 3 + 1024] = local28;
						local60[local57 + 1539] = local28;
					} else if (local26 == 2) {
						local60[local57 + 1536] = local28;
						local60[local57 + 1537] = local28;
						local60[local57 + 1538] = local28;
						local60[local57 + 1539] = local28;
					}
				}
			} else {
				@Pc(81) Class2_Sub1_Sub7_Sub2 local81 = Static57.aClass2_Sub1_Sub7_Sub2Array3[local71.anInt1649];
				if (local81 != null) {
					@Pc(94) int local94 = (local71.anInt1688 * 4 - local81.anInt1596) / 2;
					@Pc(105) int local105 = (local71.anInt1683 * 4 - local81.anInt1594) / 2;
					local81.method1202(arg2 * 4 + local94 + 48, local105 + 48 + (-local71.anInt1683 + (104 - arg4)) * 4);
				}
			}
		}
		local15 = Static41.method911(arg3, arg2, arg4);
		if (local15 != 0L) {
			local26 = (int) local15 >> 20 & 0x3;
			local35 = (int) local15 >> 14 & 0x1F;
			local28 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(468) Class2_Sub1_Sub9 local468 = Static158.method3037(local28);
			@Pc(501) int local501;
			if (local468.anInt1649 != -1) {
				@Pc(477) Class2_Sub1_Sub7_Sub2 local477 = Static57.aClass2_Sub1_Sub7_Sub2Array3[local468.anInt1649];
				if (local477 != null) {
					local67 = (local468.anInt1688 * 4 - local477.anInt1596) / 2;
					local501 = (local468.anInt1683 * 4 - local477.anInt1594) / 2;
					local477.method1202(local67 + arg2 * 4 + 48, 48 - -((-local468.anInt1683 + -arg4 + 104) * 4) - -local501);
				}
			} else if (local35 == 9) {
				@Pc(536) int[] local536 = Static98.aClass2_Sub1_Sub7_Sub4_6.anIntArray310;
				local501 = arg2 * 4 + (-(arg4 * 512) + 52736) * 4 + 24624;
				local57 = 15658734;
				if (local15 > 0L) {
					local57 = 15597568;
				}
				if (local26 == 0 || local26 == 2) {
					local536[local501 + 1536] = local57;
					local536[local501 + 1025] = local57;
					local536[local501 + 512 + 2] = local57;
					local536[local501 + 3] = local57;
				} else {
					local536[local501] = local57;
					local536[local501 + 1 + 512] = local57;
					local536[local501 + 1024 + 2] = local57;
					local536[local501 + 1536 + 3] = local57;
				}
			}
		}
		local15 = Static160.method1485(arg3, arg2, arg4);
		if (local15 == 0L) {
			return;
		}
		local26 = Integer.MAX_VALUE & (int) (local15 >>> 32);
		@Pc(647) Class2_Sub1_Sub9 local647 = Static158.method3037(local26);
		if (local647.anInt1649 == -1) {
			return;
		}
		@Pc(656) Class2_Sub1_Sub7_Sub2 local656 = Static57.aClass2_Sub1_Sub7_Sub2Array3[local647.anInt1649];
		if (local656 != null) {
			@Pc(669) int local669 = (local647.anInt1688 * 4 - local656.anInt1596) / 2;
			local57 = (local647.anInt1683 * 4 - local656.anInt1594) / 2;
			local656.method1202(arg2 * 4 + local669 + 48, local57 + (-local647.anInt1683 + -arg4 + 104) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)J")
	public static synchronized long method2() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static160.aLong61) {
			Static64.aLong59 += Static160.aLong61 - local10;
		}
		Static160.aLong61 = local10;
		return local10 + Static64.aLong59;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg0;
		@Pc(15) int[] local15 = new int[4];
		@Pc(22) int local22 = 1;
		local15[0] = arg1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static48.anIntArray140[local28] != arg0) {
				local8[local22] = Static48.anIntArray140[local28];
				local15[local22] = Static24.anIntArray79[local28];
				local22++;
			}
		}
		Static48.anIntArray140 = local8;
		Static24.anIntArray79 = local15;
		Static22.method542(Static43.aClass14Array1, Static24.anIntArray79, 0, Static48.anIntArray140, Static43.aClass14Array1.length - 1);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!ra;II)V")
	public static void method4(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static107.method2406();
		Static133.method2110(arg3, arg2, arg1.anInt3878 + arg3, arg2 - -arg1.anInt3871);
		if (Static166.anInt4104 == 2 || Static166.anInt4104 == 5) {
			Static133.method2128(arg3, arg2, arg1.anIntArray433, arg1.anIntArray434);
		} else {
			@Pc(41) int local41 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32 + 48;
			@Pc(47) int local47 = Static88.anInt2591 + Static188.anInt4484 & 0x7FF;
			@Pc(55) int local55 = 464 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
			Static98.aClass2_Sub1_Sub7_Sub4_6.method2138(arg3, arg2, arg1.anInt3878, arg1.anInt3871, local41, local55, local47, Static105.anInt3614 + 256, arg1.anIntArray433, arg1.anIntArray434);
			@Pc(91) int local91;
			@Pc(104) int local104;
			for (@Pc(75) int local75 = 0; local75 < Static81.anInt2408; local75++) {
				local91 = Static84.anIntArray277[local75] * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
				local104 = Static193.anIntArray501[local75] * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
				Static4.method70(Static89.aClass2_Sub1_Sub7_Sub4Array8[local75], arg3, local104, arg1, arg2, local91);
			}
			@Pc(148) int local148;
			for (local91 = 0; local91 < 104; local91++) {
				for (local104 = 0; local104 < 104; local104++) {
					@Pc(134) Class67 local134 = Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local91][local104];
					if (local134 != null) {
						local148 = local104 * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
						@Pc(159) int local159 = local91 * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
						Static4.method70(Static4.aClass2_Sub1_Sub7_Sub4Array1[0], arg3, local148, arg1, arg2, local159);
					}
				}
			}
			@Pc(235) int local235;
			for (local104 = 0; local104 < Static174.anInt4255; local104++) {
				@Pc(189) Class2_Sub1_Sub1_Sub3_Sub2 local189 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local104]];
				if (local189 != null && local189.method2554()) {
					@Pc(198) Class2_Sub1_Sub2 local198 = local189.aClass2_Sub1_Sub2_1;
					if (local198 != null && local198.anIntArray32 != null) {
						local198 = local198.method273();
					}
					if (local198 != null && local198.aBoolean7 && local198.aBoolean4) {
						local148 = local189.anInt3302 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
						local235 = local189.anInt3273 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
						Static4.method70(Static4.aClass2_Sub1_Sub7_Sub4Array1[1], arg3, local235, arg1, arg2, local148);
					}
				}
			}
			for (@Pc(251) int local251 = 0; local251 < Static166.anInt4101; local251++) {
				@Pc(259) Class2_Sub1_Sub1_Sub3_Sub1 local259 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local251]];
				if (local259 != null && local259.method2554()) {
					local235 = local259.anInt3273 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
					@Pc(277) boolean local277 = false;
					local148 = local259.anInt3302 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
					@Pc(293) long local293 = local259.aClass60_288.method2691();
					for (@Pc(295) int local295 = 0; local295 < Static81.anInt2399; local295++) {
						if (Static118.aLongArray5[local295] == local293 && Static93.anIntArray313[local295] != 0) {
							local277 = true;
							break;
						}
					}
					@Pc(325) boolean local325 = false;
					if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1289 != 0 && local259.anInt1289 != 0 && local259.anInt1289 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1289) {
						local325 = true;
					}
					if (local277) {
						Static4.method70(Static4.aClass2_Sub1_Sub7_Sub4Array1[3], arg3, local235, arg1, arg2, local148);
					} else if (local325) {
						Static4.method70(Static4.aClass2_Sub1_Sub7_Sub4Array1[4], arg3, local235, arg1, arg2, local148);
					} else {
						Static4.method70(Static4.aClass2_Sub1_Sub7_Sub4Array1[2], arg3, local235, arg1, arg2, local148);
					}
				}
			}
			@Pc(392) Class47[] local392 = Static177.aClass47Array1;
			@Pc(488) int local488;
			for (local148 = 0; local148 < local392.length; local148++) {
				@Pc(400) Class47 local400 = local392[local148];
				if (local400 != null && local400.anInt2856 != 0 && Static20.anInt580 % 20 < 10) {
					@Pc(459) int local459;
					@Pc(448) int local448;
					if (local400.anInt2856 == 1 && local400.anInt2853 >= 0 && local400.anInt2853 < Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1.length) {
						@Pc(435) Class2_Sub1_Sub1_Sub3_Sub2 local435 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local400.anInt2853];
						if (local435 != null) {
							local448 = local435.anInt3302 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
							local459 = local435.anInt3273 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
							Static40.method907(arg3, local400.anInt2860, local448, arg2, local459, arg1);
						}
					}
					if (local400.anInt2856 == 2) {
						local488 = (local400.anInt2857 - Static76.anInt2319) * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
						local448 = (local400.anInt2855 - Static76.anInt2317) * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
						Static40.method907(arg3, local400.anInt2860, local488, arg2, local448, arg1);
					}
					if (local400.anInt2856 == 10 && local400.anInt2853 >= 0 && Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3.length > local400.anInt2853) {
						@Pc(535) Class2_Sub1_Sub1_Sub3_Sub1 local535 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local400.anInt2853];
						if (local535 != null) {
							local459 = local535.anInt3273 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
							local448 = local535.anInt3302 / 32 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
							Static40.method907(arg3, local400.anInt2860, local448, arg2, local459, arg1);
						}
					}
				}
			}
			if (Static197.anInt4656 != 0) {
				local235 = Static197.anInt4656 * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 / 32;
				local488 = Static194.anInt4620 * 4 + 2 - Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 / 32;
				Static4.method70(Static157.aClass2_Sub1_Sub7_Sub4_8, arg3, local488, arg1, arg2, local235);
			}
			Static133.method2120(arg1.anInt3878 / 2 + arg3 - 1, arg1.anInt3871 / 2 + -1 + arg2, 3, 3, 16777215);
		}
		Static196.aBooleanArray19[arg0] = true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!aa;IIIII)V")
	public static void method5(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static98.anInt2864) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static146.anInt3815) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static193.anInt4611 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub17 local62 = Static118.aClass2_Sub17ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static100.anIntArrayArrayArray5[local17][local23][local32] + Static100.anIntArrayArrayArray5[local17][local23 + 1][local32] + Static100.anIntArrayArrayArray5[local17][local23][local32 + 1] + Static100.anIntArrayArrayArray5[local17][local23 + 1][local32 + 1]) / 4 - (Static100.anIntArrayArrayArray5[arg1][arg2][arg3] + Static100.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + Static100.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + Static100.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class74 local151 = local62.aClass74_1;
									if (local151 != null) {
										if (local151.aClass2_Sub1_Sub1_10.method3178()) {
											arg0.method3176(local151.aClass2_Sub1_Sub1_10, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass2_Sub1_Sub1_9 != null && local151.aClass2_Sub1_Sub1_9.method3178()) {
											arg0.method3176(local151.aClass2_Sub1_Sub1_9, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt3604; local222++) {
										@Pc(228) Class6 local228 = local62.aClass6Array2[local222];
										if (local228 != null && local228.aClass2_Sub1_Sub1_1.method3178()) {
											@Pc(242) int local242 = local228.anInt292 + 1 - local228.anInt299;
											@Pc(250) int local250 = local228.anInt300 + 1 - local228.anInt291;
											arg0.method3176(local228.aClass2_Sub1_Sub1_1, (local228.anInt299 - arg2) * 128 + (local242 - arg4) * 64, local148, (local228.anInt291 - arg3) * 128 + (local250 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ah;)V")
	public static void method6(@OriginalArg(0) Class6 arg0) {
		for (@Pc(2) int local2 = arg0.anInt299; local2 <= arg0.anInt292; local2++) {
			for (@Pc(6) int local6 = arg0.anInt291; local6 <= arg0.anInt300; local6++) {
				@Pc(16) Class2_Sub17 local16 = Static118.aClass2_Sub17ArrayArrayArray1[arg0.anInt295][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt3604; local20++) {
						if (local16.aClass6Array2[local20] == arg0) {
							local16.anInt3604--;
							for (local35 = local20; local35 < local16.anInt3604; local35++) {
								local16.aClass6Array2[local35] = local16.aClass6Array2[local35 + 1];
								local16.anIntArray409[local35] = local16.anIntArray409[local35 + 1];
							}
							local16.aClass6Array2[local16.anInt3604] = null;
							break;
						}
					}
					local16.anInt3608 = 0;
					for (local35 = 0; local35 < local16.anInt3604; local35++) {
						local16.anInt3608 |= local16.anIntArray409[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static163.method3070(arg3 + arg0, arg0 + -arg3, arg1, Static42.anIntArrayArray8[arg2]);
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = -arg3;
		@Pc(25) int local25 = arg3;
		@Pc(35) int local35 = -1;
		while (local20 < local25) {
			local35 += 2;
			local23 += local35;
			local20++;
			if (local23 >= 0) {
				local25--;
				local23 -= local25 << 1;
				@Pc(62) int[] local62 = Static42.anIntArrayArray8[arg2 - local25];
				@Pc(67) int local67 = arg0 + local20;
				@Pc(73) int[] local73 = Static42.anIntArrayArray8[local25 + arg2];
				@Pc(78) int local78 = arg0 - local20;
				Static163.method3070(local67, local78, arg1, local73);
				Static163.method3070(local67, local78, arg1, local62);
			}
			@Pc(94) int local94 = arg0 + local25;
			@Pc(99) int local99 = arg0 - local25;
			@Pc(106) int[] local106 = Static42.anIntArrayArray8[arg2 + local20];
			@Pc(113) int[] local113 = Static42.anIntArrayArray8[arg2 - local20];
			Static163.method3070(local94, local99, arg1, local106);
			Static163.method3070(local94, local99, arg1, local113);
		}
	}
}
