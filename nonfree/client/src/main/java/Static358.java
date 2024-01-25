import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	public static boolean aBoolean477 = true;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BIII)V")
	public static void method5396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 + Static242.anInt10133;
		@Pc(15) int local15 = arg0 + Static157.anInt3323;
		if (Static571.aClass182ArrayArrayArray3 == null || arg2 < 0 || arg0 < 0 || Static338.anInt6508 <= arg2 || Static390.anInt7654 <= arg0 || !Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) && arg1 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
			return;
		}
		@Pc(67) long local67 = (long) (local15 << 14 | arg1 << 28 | local10);
		@Pc(75) Class4_Sub32 local75 = (Class4_Sub32) Static17.aClass221_1.method5075(local67);
		if (local75 == null) {
			Static165.method2737(arg1, arg2, arg0);
			return;
		}
		@Pc(96) Class4_Sub23 local96 = (Class4_Sub23) local75.aClass22_44.method895();
		if (local96 == null) {
			Static165.method2737(arg1, arg2, arg0);
			return;
		}
		@Pc(110) Class21_Sub1_Sub4_Sub1 local110 = (Class21_Sub1_Sub4_Sub1) Static165.method2737(arg1, arg2, arg0);
		if (local110 == null) {
			local110 = new Class21_Sub1_Sub4_Sub1(arg2 << 9, Static255.aClass115Array2[arg1].method8055(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local110.anInt10568 = local110.anInt10573 = -1;
		}
		local110.anInt10582 = local96.anInt3992;
		local110.anInt10567 = local96.anInt3993;
		label56: while (true) {
			@Pc(153) Class4_Sub23 local153 = (Class4_Sub23) local75.aClass22_44.method889();
			if (local153 == null) {
				break;
			}
			if (local110.anInt10567 != local153.anInt3993) {
				local110.anInt10578 = local153.anInt3992;
				local110.anInt10568 = local153.anInt3993;
				while (true) {
					@Pc(178) Class4_Sub23 local178 = (Class4_Sub23) local75.aClass22_44.method889();
					if (local178 == null) {
						break label56;
					}
					if (local178.anInt3993 != local110.anInt10567 && local110.anInt10568 != local178.anInt3993) {
						local110.anInt10573 = local178.anInt3993;
						local110.anInt10575 = local178.anInt3992;
					}
				}
			}
		}
		@Pc(218) int local218 = Static461.method6782((arg0 << 9) + 256, arg1, (arg2 << 9) + 256);
		local110.aByte127 = (byte) arg1;
		local110.anInt10580 = 0;
		local110.anInt10551 = arg2 << 9;
		local110.anInt10554 = local218;
		local110.aByte128 = (byte) arg1;
		local110.anInt10550 = arg0 << 9;
		if (Static193.method3175(arg0, arg2)) {
			local110.aByte128++;
		}
		method5400(arg1, arg2, arg0, local218, local110);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	public static void method5397() {
		Static260.method4123(false);
		Static179.anInt3762 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static33.aByteArrayArray1.length; local14++) {
			if (Static151.anIntArray158[local14] != -1 && Static33.aByteArrayArray1[local14] == null) {
				Static33.aByteArrayArray1[local14] = Static46.aClass348_22.method7964(0, Static151.anIntArray158[local14]);
				if (Static33.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static179.anInt3762++;
				}
			}
			if (Static154.anIntArray163[local14] != -1 && Static286.aByteArrayArray21[local14] == null) {
				Static286.aByteArrayArray21[local14] = Static46.aClass348_22.method7958(0, Static154.anIntArray163[local14], Static366.anIntArrayArray36[local14]);
				if (Static286.aByteArrayArray21[local14] == null) {
					Static179.anInt3762++;
					local12 = false;
				}
			}
			if (Static559.anIntArray589[local14] != -1 && Static466.aByteArrayArray26[local14] == null) {
				Static466.aByteArrayArray26[local14] = Static46.aClass348_22.method7964(0, Static559.anIntArray589[local14]);
				if (Static466.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static179.anInt3762++;
				}
			}
			if (Static470.anIntArray520[local14] != -1 && Static106.aByteArrayArray10[local14] == null) {
				Static106.aByteArrayArray10[local14] = Static46.aClass348_22.method7964(0, Static470.anIntArray520[local14]);
				if (Static106.aByteArrayArray10[local14] == null) {
					Static179.anInt3762++;
					local12 = false;
				}
			}
			if (Static238.anIntArray272 != null && Static72.aByteArrayArray7[local14] == null && Static238.anIntArray272[local14] != -1) {
				Static72.aByteArrayArray7[local14] = Static46.aClass348_22.method7958(0, Static238.anIntArray272[local14], Static366.anIntArrayArray36[local14]);
				if (Static72.aByteArrayArray7[local14] == null) {
					Static179.anInt3762++;
					local12 = false;
				}
			}
		}
		if (Static11.aClass42_1 == null) {
			if (Static476.aClass4_Sub6_Sub16_1 == null || !Static272.aClass348_136.method7970(Static476.aClass4_Sub6_Sub16_1.aString167 + "_staticelements")) {
				Static11.aClass42_1 = new Class42(0);
			} else if (Static272.aClass348_136.method7955(Static476.aClass4_Sub6_Sub16_1.aString167 + "_staticelements")) {
				Static11.aClass42_1 = Static292.method4720(Static476.aClass4_Sub6_Sub16_1.aString167 + "_staticelements", Static258.aBoolean367, Static272.aClass348_136);
			} else {
				local12 = false;
				Static179.anInt3762++;
			}
		}
		if (!local12) {
			Static279.anInt5791 = 1;
			return;
		}
		local12 = true;
		Static106.anInt2491 = 0;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static33.aByteArrayArray1.length; local250++) {
			@Pc(256) byte[] local256 = Static286.aByteArrayArray21[local250];
			if (local256 != null) {
				local269 = (Static322.anIntArray351[local250] >> 8) * 64 - Static242.anInt10133;
				local279 = (Static322.anIntArray351[local250] & 0xFF) * 64 - Static157.anInt3323;
				if (Static343.anInt6623 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static536.method7528(local269, Static390.anInt7654, local279, Static338.anInt6508, local256);
			}
			local256 = Static106.aByteArrayArray10[local250];
			if (local256 != null) {
				local269 = (Static322.anIntArray351[local250] >> 8) * 64 - Static242.anInt10133;
				local279 = (Static322.anIntArray351[local250] & 0xFF) * 64 - Static157.anInt3323;
				if (Static343.anInt6623 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static536.method7528(local269, Static390.anInt7654, local279, Static338.anInt6508, local256);
			}
		}
		if (!local12) {
			Static279.anInt5791 = 2;
			return;
		}
		if (Static279.anInt5791 != 0) {
			Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088) + "<br>(100%)");
		}
		Static487.method7088();
		Static276.method4458();
		@Pc(379) boolean local379 = false;
		if (Static39.aClass7_2.method7803() && Static455.aClass4_Sub35_Sub1_1.aBoolean677) {
			for (local269 = 0; local269 < Static33.aByteArrayArray1.length; local269++) {
				if (Static106.aByteArrayArray10[local269] != null || Static466.aByteArrayArray26[local269] != null) {
					local379 = true;
					break;
				}
			}
		}
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean673) {
			local269 = Static210.anIntArray588[Static298.anInt6033];
		} else {
			local269 = Static71.anIntArray74[Static298.anInt6033];
		}
		if (Static39.aClass7_2.method7813()) {
			local269++;
		}
		Static432.method6462(Static39.aClass7_2, Static98.anInt2403, Static338.anInt6508, Static390.anInt7654, local269, local379, Static39.aClass7_2.method7835() > 0);
		Static184.method3035(Static75.anInt1921);
		if (Static75.anInt1921 == 0) {
			Static32.method1000(null);
		} else {
			Static32.method1000(Static464.aClass45_9);
		}
		for (local279 = 0; local279 < 4; local279++) {
			Static526.aClass232Array1[local279].method5276();
		}
		Static513.method7330();
		Static496.method7171(false);
		Static574.method8088();
		Static357.aClass260_1 = null;
		Static245.aBoolean358 = false;
		Static487.method7088();
		System.gc();
		Static260.method4123(true);
		Static402.method6123();
		Static2.anInt11 = Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614);
		Static179.aBoolean277 = Static503.anInt9410 >= 96;
		Static416.aBoolean573 = Static455.aClass4_Sub35_Sub1_1.aBoolean677;
		Static250.aBoolean364 = Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614);
		Static12.aBoolean81 = !Static455.aClass4_Sub35_Sub1_1.aBoolean680;
		Static100.anInt2434 = Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) ? -1 : Static550.anInt10029;
		Static170.aBoolean268 = Static517.method8194(Static453.anInt8614) || Static455.aClass4_Sub35_Sub1_1.aBoolean670;
		Static246.aBoolean359 = Static455.aClass4_Sub35_Sub1_1.aBoolean675;
		Static360.aClass123_Sub1_2 = new Class123_Sub1(4, Static338.anInt6508, Static390.anInt7654, false);
		if (Static343.anInt6623 == 0) {
			Static6.method638(Static33.aByteArrayArray1, Static360.aClass123_Sub1_2);
		} else {
			Static178.method2949(Static33.aByteArrayArray1, Static360.aClass123_Sub1_2);
		}
		Static388.method5970(Static390.anInt7654 >> 4, Static338.anInt6508 >> 4);
		Static201.method3281();
		if (local379) {
			Static402.method6122(true);
			Static290.aClass123_Sub1_1 = new Class123_Sub1(1, Static338.anInt6508, Static390.anInt7654, true);
			if (Static343.anInt6623 == 0) {
				Static6.method638(Static466.aByteArrayArray26, Static290.aClass123_Sub1_1);
				Static260.method4123(true);
			} else {
				Static178.method2949(Static466.aByteArrayArray26, Static290.aClass123_Sub1_1);
				Static260.method4123(true);
			}
			Static290.aClass123_Sub1_1.method5163(Static360.aClass123_Sub1_2.anIntArrayArrayArray14[0]);
			Static290.aClass123_Sub1_1.method5159(null, Static39.aClass7_2, null);
			Static402.method6122(false);
		}
		Static360.aClass123_Sub1_2.method5159(local379 ? Static290.aClass123_Sub1_1.anIntArrayArrayArray14 : null, Static39.aClass7_2, Static526.aClass232Array1);
		if (Static343.anInt6623 == 0) {
			Static260.method4123(true);
			Static392.method2879(Static360.aClass123_Sub1_2, Static286.aByteArrayArray21);
			if (Static72.aByteArrayArray7 != null) {
				Static405.method6141();
			}
		} else {
			Static260.method4123(true);
			Static244.method7177(Static286.aByteArrayArray21, Static360.aClass123_Sub1_2);
		}
		Static276.method4458();
		if (Static503.anInt9410 < 96) {
			Static478.method6940();
		}
		Static260.method4123(true);
		Static360.aClass123_Sub1_2.method5153(Static39.aClass7_2, null, local379 ? Static140.aClass115Array1[0] : null);
		Static360.aClass123_Sub1_2.method5168(Static39.aClass7_2, false);
		Static260.method4123(true);
		if (local379) {
			Static402.method6122(true);
			Static260.method4123(true);
			if (Static343.anInt6623 == 0) {
				Static392.method2879(Static290.aClass123_Sub1_1, Static106.aByteArrayArray10);
			} else {
				Static244.method7177(Static106.aByteArrayArray10, Static290.aClass123_Sub1_1);
			}
			Static276.method4458();
			Static260.method4123(true);
			Static290.aClass123_Sub1_1.method5153(Static39.aClass7_2, Static432.aClass115Array3[0], null);
			Static290.aClass123_Sub1_1.method5168(Static39.aClass7_2, true);
			Static260.method4123(true);
			Static402.method6122(false);
		}
		Static149.method2568();
		@Pc(725) int local725 = Static360.aClass123_Sub1_2.anInt6524;
		if (Static352.anInt6764 < local725) {
			local725 = Static352.anInt6764;
		}
		if (Static352.anInt6764 - 1 > local725) {
			local725 = Static352.anInt6764 - 1;
		}
		if (Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614)) {
			Static593.method8264(0);
		} else {
			Static593.method8264(local725);
		}
		@Pc(764) int local764;
		@Pc(768) int local768;
		for (@Pc(760) int local760 = 0; local760 < 4; local760++) {
			for (local764 = 0; local764 < Static338.anInt6508; local764++) {
				for (local768 = 0; local768 < Static390.anInt7654; local768++) {
					method5396(local768, local760, local764);
				}
			}
		}
		Static385.method5956();
		Static487.method7088();
		Static450.method6622();
		Static276.method4458();
		Static181.method2994();
		@Pc(815) Class4_Sub39 local815;
		if (Static402.aFrame3 != null && Static528.aClass36_2 != null && Static9.anInt758 == 11) {
			local815 = Static32.method999(Static402.aClass356_1, Static293.aClass344_47);
			local815.aClass4_Sub13_Sub2_1.method7032(1057001181);
			Static50.method1166(local815);
		}
		if (Static343.anInt6623 == 0) {
			local764 = (Static173.anInt3656 - (Static338.anInt6508 >> 4)) / 8;
			local768 = (Static173.anInt3656 + (Static338.anInt6508 >> 4)) / 8;
			@Pc(858) int local858 = (Static560.anInt10211 - (Static390.anInt7654 >> 4)) / 8;
			@Pc(866) int local866 = (Static560.anInt10211 + (Static390.anInt7654 >> 4)) / 8;
			for (@Pc(870) int local870 = local764 - 1; local870 <= local768 + 1; local870++) {
				for (@Pc(876) int local876 = local858 - 1; local876 <= local866 + 1; local876++) {
					if (local764 > local870 || local768 < local870 || local858 > local876 || local876 > local866) {
						Static46.aClass348_22.method7975("m" + local870 + "_" + local876);
						Static46.aClass348_22.method7975("l" + local870 + "_" + local876);
					}
				}
			}
		}
		if (Static9.anInt758 == 4) {
			Static231.method3759(3);
		} else if (Static9.anInt758 == 8) {
			Static231.method3759(7);
		} else {
			Static231.method3759(10);
			if (Static528.aClass36_2 != null) {
				local815 = Static32.method999(Static402.aClass356_1, Static397.aClass344_66);
				Static50.method1166(local815);
			}
		}
		Static218.method3530();
		Static487.method7088();
		Static23.method882();
		if (Static433.aBoolean593) {
			Static47.method1139("Took: " + (Static112.method2047() - Static346.aLong178) + "ms");
			Static433.aBoolean593 = false;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[Lclient!dm;")
	public static Class77[] method5399() {
		if (Static271.aClass77Array1 == null) {
			@Pc(7) Class77[] local7 = Static445.method6558(Static372.aClass366_5);
			@Pc(11) Class77[] local11 = new Class77[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static455.aClass4_Sub35_Sub1_1.method7632(Static453.anInt8614);
			@Pc(77) int local77;
			@Pc(83) Class77 local83;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class77 local26 = local7[local20];
				if ((local26.anInt2402 <= 0 || local26.anInt2402 >= 24) && local26.anInt2399 >= 800 && local26.anInt2396 >= 600 && (local18 != 2 || local26.anInt2399 <= 800 && local26.anInt2396 <= 600) && (local18 != 1 || local26.anInt2399 <= 1024 && local26.anInt2396 <= 768)) {
					for (local77 = 0; local77 < local13; local77++) {
						local83 = local11[local77];
						if (local26.anInt2399 == local83.anInt2399 && local26.anInt2396 == local83.anInt2396) {
							if (local83.anInt2402 < local26.anInt2402) {
								local11[local77] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static271.aClass77Array1 = new Class77[local13];
			Static599.method3061(local11, 0, Static271.aClass77Array1, 0, local13);
			@Pc(143) int[] local143 = new int[Static271.aClass77Array1.length];
			for (local77 = 0; local77 < Static271.aClass77Array1.length; local77++) {
				local83 = Static271.aClass77Array1[local77];
				local143[local77] = local83.anInt2396 * local83.anInt2399;
			}
			Static414.method6240(Static271.aClass77Array1, local143);
		}
		return Static271.aClass77Array1;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIILclient!kj;)V")
	private static void method5400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class21_Sub1_Sub4 arg4) {
		@Pc(4) Class182 local4 = Static560.method7938(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10551 = (arg1 << Static392.anInt3635) + Static209.anInt4422;
		arg4.anInt10554 = arg3;
		arg4.anInt10550 = (arg2 << Static392.anInt3635) + Static209.anInt4422;
		if (local4.aClass21_Sub1_Sub5_1 != null) {
			arg4.anInt10554 -= local4.aClass21_Sub1_Sub5_1.aShort87;
		}
		local4.aClass21_Sub1_Sub4_1 = arg4;
		@Pc(44) int local44 = Static255.aClass115Array2 == Static140.aClass115Array1 ? 1 : 0;
		if (arg4.method8235()) {
			if (arg4.method8229()) {
				Static338.aClass21_Sub1ArrayArray2[local44][Static254.anIntArray281[local44]++] = arg4;
				return;
			}
			Static48.aClass21_Sub1ArrayArray4[local44][Static137.anIntArray143[local44]++] = arg4;
			return;
		}
		Static375.aClass21_Sub1ArrayArray3[local44][Static27.anIntArray195[local44]++] = arg4;
	}
}
