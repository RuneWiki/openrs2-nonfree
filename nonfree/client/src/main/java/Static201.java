import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "Lclient!pt;")
	public static Class237 aClass237_3;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!el;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
	public static final int anInt3832 = 1;

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
	public static int anInt3833 = -1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	public static void method3293() {
		Static415.method5995(Static520.aClass236_96);
		Static164.aClass5_Sub3_Sub1_2.method4192(0);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIII)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg1, 4);
		local8.method1327();
		local8.anInt1437 = arg2;
		local8.anInt1434 = arg0;
		local8.anInt1433 = arg3;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIIII)V")
	public static void method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) float local14 = (float) Static245.anInt7313 / (float) Static245.anInt7316;
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = arg1;
		if (local14 < 1.0F) {
			local18 = (int) ((float) arg3 * local14);
		} else {
			local16 = (int) ((float) arg1 / local14);
		}
		@Pc(45) int local45 = arg2 - (arg1 - local18) / 2;
		@Pc(54) int local54 = arg0 - (arg3 - local16) / 2;
		anInt3833 = -1;
		Static435.anInt7668 = Static245.anInt7316 * local54 / local16;
		Static489.anInt8411 = Static245.anInt7313 - Static245.anInt7313 * local45 / local18;
		Static107.anInt2341 = -1;
		Static117.method2269();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLclient!ui;)I")
	public static int method3300(@OriginalArg(1) Class5_Sub47 arg0) {
		@Pc(12) String local12 = Static477.method6654(arg0);
		@Pc(14) int[] local14 = null;
		if (Static225.method3574(arg0.anInt8474)) {
			local14 = Static451.aClass67_2.method2006((int) arg0.aLong237).anIntArray35;
		} else if (arg0.anInt8478 != -1) {
			local14 = Static451.aClass67_2.method2006(arg0.anInt8478).anIntArray35;
		} else if (Static448.method6334(arg0.anInt8474)) {
			@Pc(46) Class5_Sub51 local46 = (Class5_Sub51) Static521.aClass42_42.method1109((long) arg0.aLong237);
			if (local46 != null) {
				@Pc(51) Class15_Sub2_Sub1_Sub2 local51 = local46.aClass15_Sub2_Sub1_Sub2_2;
				@Pc(54) Class305 local54 = local51.aClass305_1;
				if (local54.anIntArray679 != null) {
					local54 = local54.method7150(Static540.aClass242_1);
				}
				if (local54 != null) {
					local14 = local54.anIntArray681;
				}
			}
		} else if (Static311.method5044(arg0.anInt8474)) {
			@Pc(86) Class283 local86;
			if (arg0.anInt8474 == 1004) {
				local86 = Static453.aClass88_3.method2294((int) arg0.aLong237);
			} else {
				local86 = Static453.aClass88_3.method2294((int) (arg0.aLong237 >>> 32 & 0x7FFFFFFFL));
			}
			if (local86.anIntArray632 != null) {
				local86 = local86.method6604(Static540.aClass242_1);
			}
			if (local86 != null) {
				local14 = local86.anIntArray633;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static61.method1174(local14);
		}
		@Pc(139) int local139 = Static312.aClass256_7.method6116(Static372.aClass25Array8, local12);
		if (arg0.aBoolean610) {
			local139 += Static300.aClass25_15.c() + 4;
		}
		return local139;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3302(@OriginalArg(1) Class62 arg0) {
		@Pc(7) int local7 = Static159.anInt3261;
		@Pc(9) int local9 = Static122.anInt2575;
		@Pc(11) int local11 = Static142.anInt2984;
		@Pc(15) int local15 = Static221.anInt4157 - 3;
		if (Static12.aClass25_1 == null || Static169.aClass25_8 == null) {
			if (Static533.aClass117_228.method2973(Static247.anInt5009) && Static533.aClass117_228.method2973(Static460.anInt7895)) {
				Static12.aClass25_1 = arg0.method6998(Static551.method2427(Static533.aClass117_228, Static247.anInt5009, 0));
				@Pc(44) Class96 local44 = Static551.method2427(Static533.aClass117_228, Static460.anInt7895, 0);
				Static169.aClass25_8 = arg0.method6998(local44);
				local44.method2431();
				Static235.aClass25_14 = arg0.method6998(local44);
			} else {
				arg0.f(local7, local9, local11, 20, Static151.anInt3120 | 255 - Static413.anInt9078 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static12.aClass25_1 != null && Static169.aClass25_8 != null) {
			local88 = (local11 - Static169.aClass25_8.c() * 2) / Static12.aClass25_1.c();
			for (local90 = 0; local90 < local88; local90++) {
				Static12.aClass25_1.method6956(local7 + Static169.aClass25_8.c() + local90 * Static12.aClass25_1.c(), local9);
			}
			Static169.aClass25_8.method6956(local7, local9);
			Static235.aClass25_14.method6956(local11 + local7 - Static235.aClass25_14.c(), local9);
		}
		Static130.aClass13_2.method7211(-1, local7 + 3, local9 + 14, Static400.aClass40_112.method1063(Static194.anInt3737), Static275.anInt5378 | 0xFF000000);
		arg0.f(local7, local9 + 20, local11, local15 - 20, -Static413.anInt9078 + 255 << 24 | Static151.anInt3120, 1);
		local88 = Static280.aClass214_1.method6766();
		local90 = Static280.aClass214_1.method6770();
		@Pc(175) int local175 = 0;
		@Pc(198) int local198;
		for (@Pc(180) Class5_Sub47 local180 = (Class5_Sub47) Static521.aClass99_78.method2526(); local180 != null; local180 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			local198 = (Static257.anInt5147 - local175 - 1) * 16 + local9 + 33;
			if (local7 < local88 && local88 < local7 + local11 && local198 - 13 < local90 && local90 < local198 + 4 && local180.aBoolean611) {
				arg0.f(local7, local198 - 12, local11, 16, 255 - Static373.anInt6911 << 24 | Static458.anInt7887, 1);
			}
			local175++;
		}
		if ((Static318.aClass25_16 == null || Static53.aClass25_4 == null || Static353.aClass25_20 == null) && Static533.aClass117_228.method2973(Static106.anInt2329) && Static533.aClass117_228.method2973(Static215.anInt4065) && Static533.aClass117_228.method2973(Static93.anInt2150)) {
			@Pc(279) Class96 local279 = Static551.method2427(Static533.aClass117_228, Static215.anInt4065, 0);
			Static53.aClass25_4 = arg0.method6998(local279);
			local279.method2431();
			Static494.aClass25_26 = arg0.method6998(local279);
			Static318.aClass25_16 = arg0.method6998(Static551.method2427(Static533.aClass117_228, Static106.anInt2329, 0));
			@Pc(304) Class96 local304 = Static551.method2427(Static533.aClass117_228, Static93.anInt2150, 0);
			Static353.aClass25_20 = arg0.method6998(local304);
			local304.method2431();
			Static126.aClass25_25 = arg0.method6998(local304);
		}
		@Pc(375) int local375;
		@Pc(335) int local335;
		if (Static318.aClass25_16 != null && Static53.aClass25_4 != null && Static353.aClass25_20 != null) {
			local198 = (local11 - Static353.aClass25_20.c() * 2) / Static318.aClass25_16.c();
			for (local335 = 0; local335 < local198; local335++) {
				Static318.aClass25_16.method6956(local7 + Static353.aClass25_20.c() + local335 * Static318.aClass25_16.c(), -Static318.aClass25_16.la() + local15 + local9);
			}
			local375 = (local15 - Static353.aClass25_20.la() - 20) / Static53.aClass25_4.la();
			for (@Pc(377) int local377 = 0; local377 < local375; local377++) {
				Static53.aClass25_4.method6956(local7, Static53.aClass25_4.la() * local377 + local9 + 20);
				Static494.aClass25_26.method6956(local11 + local7 - Static494.aClass25_26.c(), local9 - -20 + Static53.aClass25_4.la() * local377);
			}
			Static353.aClass25_20.method6956(local7, local15 + local9 - Static353.aClass25_20.la());
			Static126.aClass25_25.method6956(local7 + local11 - Static353.aClass25_20.c(), local15 + (local9 - Static353.aClass25_20.la()));
		}
		local175 = 0;
		for (@Pc(443) Class5_Sub47 local443 = (Class5_Sub47) Static521.aClass99_78.method2526(); local443 != null; local443 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			local335 = (Static257.anInt5147 - local175 - 1) * 16 + local9 + 20 + 13;
			local375 = Static275.anInt5378 | 0xFF000000;
			if (local7 < local88 && local7 + local11 > local88 && local335 - 13 < local90 && local335 + 4 > local90 && local443.aBoolean611) {
				local375 = Static65.anInt1249 | 0xFF000000;
			}
			@Pc(504) int[] local504 = null;
			if (Static225.method3574(local443.anInt8474)) {
				local504 = Static451.aClass67_2.method2006((int) local443.aLong237).anIntArray35;
			} else if (local443.anInt8478 != -1) {
				local504 = Static451.aClass67_2.method2006(local443.anInt8478).anIntArray35;
			} else if (Static448.method6334(local443.anInt8474)) {
				@Pc(530) Class5_Sub51 local530 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local443.aLong237);
				if (local530 != null) {
					@Pc(535) Class15_Sub2_Sub1_Sub2 local535 = local530.aClass15_Sub2_Sub1_Sub2_2;
					@Pc(538) Class305 local538 = local535.aClass305_1;
					if (local538.anIntArray679 != null) {
						local538 = local538.method7150(Static540.aClass242_1);
					}
					if (local538 != null) {
						local504 = local538.anIntArray681;
					}
				}
			} else if (Static311.method5044(local443.anInt8474)) {
				@Pc(576) Class283 local576;
				if (local443.anInt8474 == 1004) {
					local576 = Static453.aClass88_3.method2294((int) local443.aLong237);
				} else {
					local576 = Static453.aClass88_3.method2294((int) (local443.aLong237 >>> 32 & 0x7FFFFFFFL));
				}
				if (local576.anIntArray632 != null) {
					local576 = local576.method6604(Static540.aClass242_1);
				}
				if (local576 != null) {
					local504 = local576.anIntArray633;
				}
			}
			@Pc(618) String local618 = Static477.method6654(local443);
			if (local504 != null) {
				local618 = local618 + Static61.method1174(local504);
			}
			Static130.aClass13_2.method7206(Static372.aClass25Array8, Static208.anIntArray276, local618, local375, local7 + 3, local335);
			if (local443.aBoolean610) {
				Static300.aClass25_15.method6956(Static312.aClass256_7.method6113(local618) + local7 + 5, local335 - 12);
			}
			local175++;
		}
		Static274.method4497(Static159.anInt3261, Static122.anInt2575, Static221.anInt4157, Static142.anInt2984);
	}
}
