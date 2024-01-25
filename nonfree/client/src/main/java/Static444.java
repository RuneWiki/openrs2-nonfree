import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Lclient!pw;")
	public static final Class256 aClass256_9 = new Class256();

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "[I")
	public static final int[] anIntArray563 = new int[8];

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "[S")
	public static short[] aShortArray133 = new short[256];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BFFF)I")
	public static int method6284(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!oa;ILclient!faa;II)V")
	public static void method6285(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class17 local10 = arg2.method2294(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ca(arg1, arg3, arg2.anInt2690 + arg1, arg3 - -arg2.anInt2670);
		if (Static154.anInt2875 == 2 || Static154.anInt2875 == 5 || Static186.aClass71_19 == null) {
			arg0.L(-16777216, local10, arg1, arg3);
			return;
		}
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (Static60.anInt1008 == 4) {
			local49 = (int) -Static562.aFloat14 & 0x3FFF;
			local51 = 4096;
			local53 = Static173.anInt3141;
			local55 = Static450.anInt7952;
		} else {
			local49 = (int) -Static562.aFloat14 + Static63.anInt1086 & 0x3FFF;
			local53 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911;
			local55 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913;
			local51 = 4096 - Static213.anInt4015 * 16;
		}
		@Pc(91) int local91 = local53 / 128 + 48 - (Static18.anInt5706 - 104) * 2;
		@Pc(107) int local107 = Static80.anInt1367 * 4 + 48 + 208 - local55 / 128 - Static80.anInt1367 * 2;
		Static186.aClass71_19.method7773((float) arg2.anInt2690 / 2.0F + (float) arg1, (float) arg3 + (float) arg2.anInt2670 / 2.0F, (float) local91, (float) local107, local51, local49 << 2, local10, arg1, arg3);
		@Pc(157) int local157;
		@Pc(166) int local166;
		@Pc(177) int local177;
		@Pc(188) int local188;
		for (@Pc(141) Class6_Sub14 local141 = (Class6_Sub14) Static247.aClass298_97.method6809(); local141 != null; local141 = (Class6_Sub14) Static247.aClass298_97.method6821()) {
			@Pc(146) int local146 = local141.anInt2188;
			local157 = (Static577.aClass170_3.anIntArray391[local146] >> 14 & 0x3FFF) - Static150.anInt2792;
			local166 = (Static577.aClass170_3.anIntArray391[local146] & 0x3FFF) - Static154.anInt2878;
			local177 = local157 * 4 + 2 - local53 / 128;
			local188 = local166 * 4 + 2 - local55 / 128;
			Static485.method6814(local10, Static577.aClass170_3.anIntArray390[local146], arg0, arg3, local188, arg2, arg1, local177);
		}
		for (local157 = 0; local157 < Static460.anInt8109; local157++) {
			local166 = Static360.anIntArray467[local157] * 4 + 2 - local53 / 128;
			local177 = Static68.anIntArray109[local157] * 4 + 2 - local55 / 128;
			@Pc(246) Class192 local246 = Static85.aClass27_1.method516(Static357.anIntArray465[local157]);
			if (local246.lb != null) {
				local246 = local246.method4585(Static65.aClass51_1);
				if (local246 == null || local246.anInt5597 == -1) {
					continue;
				}
			}
			Static485.method6814(local10, local246.anInt5597, arg0, arg3, local177, arg2, arg1, local166);
		}
		@Pc(331) int local331;
		@Pc(342) int local342;
		for (@Pc(285) Class6_Sub30 local285 = (Class6_Sub30) Static500.aClass234_44.method5469(); local285 != null; local285 = (Class6_Sub30) Static500.aClass234_44.method5465()) {
			local177 = (int) (local285.aLong245 >> 28 & 0x3L);
			if (local177 == Static82.anInt1372) {
				local188 = (int) (local285.aLong245 & 0x3FFFL) - Static150.anInt2792;
				@Pc(321) int local321 = (int) (local285.aLong245 >> 14 & 0x3FFFL) - Static154.anInt2878;
				local331 = local188 * 4 + 2 - local53 / 128;
				local342 = local321 * 4 + 2 - local55 / 128;
				Static509.method5847(arg1, Static201.aClass71Array24[0], local331, local10, local342, arg2, arg3);
			}
		}
		@Pc(434) int local434;
		for (local177 = 0; local177 < Static429.anInt7650; local177++) {
			@Pc(375) Class6_Sub49 local375 = (Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local177]);
			if (local375 != null) {
				@Pc(380) Class15_Sub2_Sub4_Sub1 local380 = local375.aClass15_Sub2_Sub4_Sub1_2;
				if (local380.method4293() && Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 == local380.aByte98) {
					@Pc(396) Class88 local396 = local380.aClass88_1;
					if (local396 != null && local396.anIntArray182 != null) {
						local396 = local396.method1940(Static65.aClass51_1);
					}
					if (local396 != null && local396.aBoolean146 && local396.aBoolean142) {
						local342 = local380.anInt8911 / 128 - local53 / 128;
						local434 = local380.anInt8913 / 128 - local55 / 128;
						if (local396.anInt2145 == -1) {
							Static509.method5847(arg1, Static201.aClass71Array24[1], local342, local10, local434, arg2, arg3);
						} else {
							Static485.method6814(local10, local396.anInt2145, arg0, arg3, local434, arg2, arg1, local342);
						}
					}
				}
			}
		}
		local188 = Static333.anInt6355;
		@Pc(475) int[] local475 = Static354.anIntArray461;
		@Pc(519) int local519;
		@Pc(523) int local523;
		@Pc(548) int local548;
		for (local331 = 0; local331 < local188; local331++) {
			@Pc(485) Class15_Sub2_Sub4_Sub2 local485 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local475[local331]];
			if (local485 != null && local485.method7153() && local485 != Static461.aClass15_Sub2_Sub4_Sub2_2 && local485.aByte98 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) {
				local434 = local485.anInt8911 / 128 - local53 / 128;
				local519 = local485.anInt8913 / 128 - local55 / 128;
				@Pc(521) boolean local521 = false;
				for (local523 = 0; local523 < Static569.anInt9840; local523++) {
					if (local485.aString82.equals(Static326.aStringArray26[local523]) && Static392.anIntArray501[local523] != 0) {
						local521 = true;
						break;
					}
				}
				@Pc(546) boolean local546 = false;
				for (local548 = 0; local548 < Static181.anInt3476; local548++) {
					if (local485.aString82.equals(Static175.aClass264Array1[local548].aString61)) {
						local546 = true;
						break;
					}
				}
				@Pc(572) boolean local572 = false;
				if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9031 != 0 && local485.anInt9031 != 0 && Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9031 == local485.anInt9031) {
					local572 = true;
				}
				if (local485.aBoolean586) {
					Static509.method5847(arg1, Static201.aClass71Array24[6], local434, local10, local519, arg2, arg3);
				} else if (local521) {
					Static509.method5847(arg1, Static201.aClass71Array24[3], local434, local10, local519, arg2, arg3);
				} else if (local546) {
					Static509.method5847(arg1, Static201.aClass71Array24[5], local434, local10, local519, arg2, arg3);
				} else if (local572) {
					Static509.method5847(arg1, Static201.aClass71Array24[4], local434, local10, local519, arg2, arg3);
				} else {
					Static509.method5847(arg1, Static201.aClass71Array24[2], local434, local10, local519, arg2, arg3);
				}
			}
		}
		@Pc(668) Class279[] local668 = Static168.aClass279Array1;
		@Pc(753) int local753;
		for (local434 = 0; local434 < local668.length; local434++) {
			@Pc(676) Class279 local676 = local668[local434];
			if (local676 != null && local676.anInt7966 != 0 && Static363.anInt6671 % 20 < 10) {
				@Pc(718) int local718;
				if (local676.anInt7966 == 1) {
					@Pc(703) Class6_Sub49 local703 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local676.anInt7964);
					if (local703 != null) {
						@Pc(708) Class15_Sub2_Sub4_Sub1 local708 = local703.aClass15_Sub2_Sub4_Sub1_2;
						local718 = local708.anInt8911 / 128 - local53 / 128;
						local548 = local708.anInt8913 / 128 - local55 / 128;
						Static381.method5580(arg1, local548, local10, local718, arg2, local676.anInt7965, 360000L, arg3);
					}
				}
				if (local676.anInt7966 == 2) {
					local753 = local676.anInt7971 / 128 - local53 / 128;
					local523 = local676.anInt7961 / 128 - local55 / 128;
					@Pc(769) long local769 = (long) (local676.anInt7970 << 7);
					@Pc(773) long local773 = local769 * local769;
					Static381.method5580(arg1, local523, local10, local753, arg2, local676.anInt7965, local773, arg3);
				}
				if (local676.anInt7966 == 10 && local676.anInt7964 >= 0 && local676.anInt7964 < Static551.aClass15_Sub2_Sub4_Sub2Array1.length) {
					@Pc(806) Class15_Sub2_Sub4_Sub2 local806 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local676.anInt7964];
					if (local806 != null) {
						local523 = local806.anInt8911 / 128 - local53 / 128;
						local718 = local806.anInt8913 / 128 - local55 / 128;
						Static381.method5580(arg1, local718, local10, local523, arg2, local676.anInt7965, 360000L, arg3);
					}
				}
			}
		}
		if (Static60.anInt1008 == 4) {
			return;
		}
		if (Static567.anInt9818 != 0) {
			local519 = Static567.anInt9818 * 4 + (Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() + -1) * 2 + 2 - local53 / 128;
			local753 = Static542.anInt9320 * 4 + Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() * 2 + 2 - local55 / 128 - 2;
			Static509.method5847(arg1, Static570.aClass71Array56[Static243.aBoolean327 ? 1 : 0], local519, local10, local753, arg2, arg3);
		}
		arg0.method7482(arg3 + arg2.anInt2670 / 2 - 1, -1, 3, 3, arg1 + arg2.anInt2690 / 2 - 1);
		return;
	}
}
