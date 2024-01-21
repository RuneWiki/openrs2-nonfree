import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array6;

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
	public static int anInt3419;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_870 = Static8.method128("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
	public static final int anInt3417 = 50;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[I")
	public static int[] anIntArray297 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_871 = Static8.method128("<)4col>");

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "[I")
	public static int[] anIntArray299 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "[I")
	public static int[] anIntArray300 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
	public static int[] anIntArray301 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "[I")
	public static int[] anIntArray302 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "[I")
	public static int[] anIntArray303 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "[I")
	public static int[] anIntArray304 = new int[anInt3417];

	@OriginalMember(owner = "client!pe", name = "wb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array17 = new Class18[anInt3417];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
	public static void method2375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg5 & 0x7FF;
		@Pc(21) int local21 = arg0;
		@Pc(23) int local23 = 0;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (local10 != 0) {
			local32 = Class1_Sub1_Sub8_Sub4.anIntArray212[local10];
			local36 = Class1_Sub1_Sub8_Sub4.anIntArray216[local10];
			local47 = local36 * 0 - arg0 * local32 >> 16;
			local21 = arg0 * local36 + local32 * 0 >> 16;
			local23 = local47;
		}
		if (local19 != 0) {
			local32 = Class1_Sub1_Sub8_Sub4.anIntArray212[local19];
			local36 = Class1_Sub1_Sub8_Sub4.anIntArray216[local19];
			local47 = local36 * 0 + local32 * local21 >> 16;
			local21 = local21 * local36 - local32 * 0 >> 16;
			local12 = local47;
		}
		Static45.anInt1552 = arg1 - local12;
		Static106.anInt3132 = arg5;
		Static38.anInt1189 = arg2 - local21;
		Static125.anInt3614 = arg4;
		Static178.anInt4735 = arg3 - local23;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIIIII)V")
	public static void method2376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static48.anInt1566 == arg1 && arg0 == Static47.anInt4242 && (arg3 == Static99.anInt3024 || !Static27.aBoolean26)) {
			return;
		}
		Static48.anInt1566 = arg1;
		Static99.anInt3024 = arg3;
		Static47.anInt4242 = arg0;
		if (!Static27.aBoolean26) {
			Static99.anInt3024 = 0;
		}
		Static6.method107(25);
		Static161.method2992(Static173.aClass18_1214, true);
		@Pc(44) int local44 = Static110.anInt3227;
		@Pc(46) int local46 = Static117.anInt3328;
		Static110.anInt3227 = arg0 * 8 - 48;
		Static117.anInt3328 = (arg1 - 6) * 8;
		@Pc(63) int local63 = Static110.anInt3227 - local44;
		@Pc(69) int local69 = Static117.anInt3328 - local46;
		for (@Pc(73) int local73 = 0; local73 < 32768; local73++) {
			@Pc(79) Class1_Sub1_Sub5_Sub1_Sub1 local79 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.anIntArray314[local83] -= local69;
					local79.anIntArray315[local83] -= local63;
				}
				local79.anInt3579 -= local69 * 128;
				local79.anInt3558 -= local63 * 128;
			}
		}
		for (@Pc(129) int local129 = 0; local129 < 2048; local129++) {
			@Pc(135) Class1_Sub1_Sub5_Sub1_Sub2 local135 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local129];
			if (local135 != null) {
				for (@Pc(139) int local139 = 0; local139 < 10; local139++) {
					local135.anIntArray314[local139] -= local69;
					local135.anIntArray315[local139] -= local63;
				}
				local135.anInt3558 -= local63 * 128;
				local135.anInt3579 -= local69 * 128;
			}
		}
		Static9.anInt295 = arg3;
		Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2481(arg2, arg4, false);
		@Pc(195) byte local195 = 0;
		@Pc(197) byte local197 = 1;
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 0;
		if (local69 < 0) {
			local195 = 103;
			local199 = -1;
			local197 = -1;
		}
		@Pc(211) byte local211 = 104;
		@Pc(213) byte local213 = 1;
		if (local63 < 0) {
			local213 = -1;
			local211 = -1;
			local201 = 103;
		}
		for (@Pc(226) int local226 = local195; local226 != local199; local226 += local197) {
			for (@Pc(230) int local230 = local201; local230 != local211; local230 += local213) {
				@Pc(237) int local237 = local226 + local69;
				@Pc(242) int local242 = local230 + local63;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local237 >= 0 && local242 >= 0 && local237 < 104 && local242 < 104) {
						Static105.aClass59ArrayArrayArray1[local244][local226][local230] = Static105.aClass59ArrayArrayArray1[local244][local237][local242];
					} else {
						Static105.aClass59ArrayArrayArray1[local244][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(315) Class1_Sub3 local315 = (Class1_Sub3) Static145.aClass59_53.method2417(); local315 != null; local315 = (Class1_Sub3) Static145.aClass59_53.method2424()) {
			local315.anInt228 -= local69;
			local315.anInt222 -= local63;
			if (local315.anInt228 < 0 || local315.anInt222 < 0 || local315.anInt228 >= 104 || local315.anInt222 >= 104) {
				local315.method3198();
			}
		}
		if (Static161.anInt4393 != 0) {
			Static166.anInt4506 -= local63;
			Static161.anInt4393 -= local69;
		}
		Static33.anInt1116 = 0;
		Static122.aBoolean152 = false;
		Static168.anInt4561 = -1;
		Static45.aClass59_25.method2416();
		Static40.aClass59_16.method2416();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ea;Z)V")
	public static void method2377(@OriginalArg(0) Class18 arg0) {
		if (Static114.anInt3306 >= 2) {
			if (arg0.method734(Static118.aClass18_852)) {
				System.gc();
			}
			if (arg0.method734(Static173.aClass18_1215)) {
				Static108.method2227();
			}
			if (arg0.method734(Static111.aClass18_822)) {
				Static135.aBoolean168 = true;
			}
			if (arg0.method734(Static9.aClass18_108)) {
				Static135.aBoolean168 = false;
			}
			if (arg0.method734(Static178.aClass18_1227)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static141.aClass22Array2[local42].anIntArrayArray45[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method734(Static91.aClass18_685) && Static94.anInt2919 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method740(Static43.aClass18_351)) {
				Static124.anInt3517 = arg0.method733(12).method726().method750();
				Static88.method1922(null, 0, Static144.method2735(new Class18[] { Static110.aClass18_816, Static132.method2564(Static124.anInt3517) }));
			}
			if (arg0.method734(Static37.aClass18_286)) {
				Static33.aBoolean37 = true;
			}
		}
		Static95.aClass1_Sub6_Sub1_1.method555(202);
		Static95.aClass1_Sub6_Sub1_1.method530(arg0.method747() - 1);
		Static95.aClass1_Sub6_Sub1_1.method543(arg0.method733(2));
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lclient!pf;")
	public static Class1_Sub1_Sub12 method2378(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub12 local6 = (Class1_Sub1_Sub12) Static104.aClass66_11.method2599((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static113.aClass16_31.method2254(arg0, 12);
		local6 = new Class1_Sub1_Sub12();
		if (local28 != null) {
			local6.method2401(new Class1_Sub6(local28));
		}
		local6.method2404();
		Static104.aClass66_11.method2597((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
	public static boolean method2379(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
	public static void method2380() {
		aClass18_870 = null;
		anIntArray298 = null;
		aClass1_Sub1_Sub8_Sub3Array6 = null;
		anIntArray303 = null;
		anIntArray300 = null;
		anIntArray304 = null;
		aClass18_871 = null;
		anIntArray302 = null;
		anIntArray299 = null;
		anIntArray297 = null;
		anIntArray301 = null;
		aClass18Array17 = null;
	}

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "(I)V")
	public static void method2381() {
		while (true) {
			if (Static167.aClass1_Sub6_Sub1_3.method557(Static12.anInt4661) >= 27) {
				@Pc(22) int local22 = Static167.aClass1_Sub6_Sub1_3.method562(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local22] == null) {
						Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local22] = new Class1_Sub1_Sub5_Sub1_Sub1();
						local29 = true;
					}
					@Pc(45) Class1_Sub1_Sub5_Sub1_Sub1 local45 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local22];
					Static150.anIntArray382[Static155.anInt4267++] = local22;
					local45.anInt3557 = Static41.anInt1322;
					@Pc(63) int local63 = Static167.aClass1_Sub6_Sub1_3.method562(5);
					local45.aClass1_Sub1_Sub15_1 = Static164.method3047(Static167.aClass1_Sub6_Sub1_3.method562(14));
					@Pc(80) int local80 = Static167.aClass1_Sub6_Sub1_3.method562(5);
					if (local63 > 15) {
						local63 -= 32;
					}
					@Pc(89) int local89 = Static167.aClass1_Sub6_Sub1_3.method562(1);
					if (local89 == 1) {
						Static82.anIntArray220[Static76.anInt2355++] = local22;
					}
					if (local80 > 15) {
						local80 -= 32;
					}
					@Pc(113) int local113 = Static105.anIntArray275[Static167.aClass1_Sub6_Sub1_3.method562(3)];
					if (local29) {
						local45.anInt3590 = local45.anInt3576 = local113;
					}
					@Pc(126) int local126 = Static167.aClass1_Sub6_Sub1_3.method562(1);
					local45.anInt3587 = local45.aClass1_Sub1_Sub15_1.anInt3801;
					local45.anInt3603 = local45.aClass1_Sub1_Sub15_1.anInt3790;
					local45.anInt3581 = local45.aClass1_Sub1_Sub15_1.anInt3793;
					local45.anInt3573 = local45.aClass1_Sub1_Sub15_1.anInt3787;
					if (local45.anInt3581 == 0) {
						local45.anInt3576 = 0;
					}
					local45.anInt3585 = local45.aClass1_Sub1_Sub15_1.anInt3810;
					local45.anInt3607 = local45.aClass1_Sub1_Sub15_1.anInt3783;
					local45.anInt3594 = local45.aClass1_Sub1_Sub15_1.anInt3794;
					local45.anInt3570 = local45.aClass1_Sub1_Sub15_1.anInt3784;
					local45.anInt3591 = local45.aClass1_Sub1_Sub15_1.anInt3809;
					local45.method2481(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0] + local80, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0] + local63, local126 == 1);
					continue;
				}
			}
			Static167.aClass1_Sub6_Sub1_3.method554();
			return;
		}
	}
}
