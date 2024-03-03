import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!r;")
	public static Class197 aClass197_57;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!r;")
	public static Class197 aClass197_58;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 8)
	public static void method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(9, arg1);
		local8.method2313();
		local8.anInt2286 = arg0;
		local8.anInt2287 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!nk;ILclient!wm;IILclient!kf;II)V", line = 38)
	public static void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class164 local14 = Static219.aClass125_1.method3380(arg2);
		if (local14 == null || !local14.aBoolean304 || !local14.method4181(Static199.aClass226_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray290 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray290.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static291.anInt5899 == 4) {
					local44 = (int) Class187.aFloat66 & 0x3FFF;
				} else {
					local44 = (int) Class187.aFloat66 + Class2_Sub3_Sub1.anInt158 & 0x3FFF;
				}
				@Pc(58) int local58 = Class19.anIntArray178[local44];
				@Pc(62) int local62 = Class19.anIntArray177[local44];
				if (Static291.anInt5899 != 4) {
					local62 = local62 * 256 / (Class71.anInt2003 + 256);
					local58 = local58 * 256 / (Class71.anInt2003 + 256);
				}
				local32[local34 * 2] = ((local14.anIntArray290[local34 * 2] * 4 + arg6) * local62 + (local14.anIntArray290[local34 * 2 + 1] * 4 + arg4) * local58 >> 15) + arg1.anInt4242 / 2 + arg0;
				local32[local34 * 2 + 1] = arg7 + arg1.anInt4255 / 2 - (local62 * (arg4 + local14.anIntArray290[local34 * 2 + 1] * 4) - (local14.anIntArray290[local34 * 2] * 4 + arg6) * local58 >> 15);
			}
			Static270.method5048(arg3, local32, local14.anInt4407, arg1.anIntArray282, arg1.anIntArray280);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg3.method2817(local32[local44 * 2], local32[local44 * 2 + 1], local32[(local44 + 1) * 2], local32[local44 * 2 + 1 + 2], local14.anInt4415, arg5, arg0, arg7);
			}
			arg3.method2817(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt4415, arg5, arg0, arg7);
		}
		@Pc(267) Class13 local267 = null;
		if (local14.anInt4413 != -1) {
			local267 = local14.method4190(arg3, false);
			if (local267 != null) {
				Static351.method6289(arg5, arg6, arg0, arg4, local267, arg7, arg1);
			}
		}
		if (local14.aString48 == null) {
			return;
		}
		local34 = 0;
		if (local267 != null) {
			local34 = local267.method6383();
		}
		@Pc(301) Class130 local301 = Static187.aClass130_3;
		@Pc(303) Class239 local303 = Static49.aClass239_1;
		if (local14.anInt4411 == 1) {
			local303 = Static155.aClass239_3;
			local301 = Static253.aClass130_4;
		}
		if (local14.anInt4411 == 2) {
			local301 = Static49.aClass130_1;
			local303 = Static106.aClass239_2;
		}
		Static154.method3148(arg0, arg4, arg7, local14.anInt4424, arg6, local34, local301, local303, arg5, local14.aString48, arg1);
		return;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 141)
	public static void method3778() {
		for (@Pc(7) int local7 = 0; local7 < Class2_Sub2_Sub13.anInt4496; local7++) {
			@Pc(15) int local15 = Class162.anIntArray283[local7]--;
			if (Class162.anIntArray283[local7] >= -10) {
				@Pc(90) Class247 local90 = Class119.aClass247Array2[local7];
				if (local90 == null) {
					local90 = Static395.method6436(Static81.aClass197_21, Class11_Sub5_Sub3.anIntArray321[local7], 0);
					if (local90 == null) {
						continue;
					}
					Class162.anIntArray283[local7] += local90.method6437();
					Class119.aClass247Array2[local7] = local90;
				}
				if (Class162.anIntArray283[local7] < 0) {
					@Pc(143) int local143;
					if (Class115.anIntArray188[local7] == 0) {
						local143 = Static203.aClass177_Sub1_2.anInt4878 * Class156.anIntArray256[local7] >> 8;
					} else {
						@Pc(133) int local133 = Class115.anIntArray188[local7] >> 24 & 0x3;
						if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local133) {
							@Pc(153) int local153 = (Class115.anIntArray188[local7] & 0xFF) * 128;
							@Pc(161) int local161 = Class115.anIntArray188[local7] >> 16 & 0xFF;
							@Pc(171) int local171 = local161 * 128 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768;
							if (local171 < 0) {
								local171 = -local171;
							}
							@Pc(187) int local187 = Class115.anIntArray188[local7] >> 8 & 0xFF;
							@Pc(197) int local197 = local187 * 128 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770;
							if (local197 < 0) {
								local197 = -local197;
							}
							@Pc(211) int local211 = local197 + local171 - 128;
							if (local153 < local211) {
								Class162.anIntArray283[local7] = -100;
								continue;
							}
							if (local211 < 0) {
								local211 = 0;
							}
							local143 = Class156.anIntArray256[local7] * (local153 - local211) * Static203.aClass177_Sub1_2.anInt4872 / local153 >> 8;
						} else {
							local143 = 0;
						}
					}
					if (local143 > 0) {
						@Pc(264) Class2_Sub21_Sub1 local264 = local90.method6435().method3180(Static277.aClass249_1);
						@Pc(269) Class2_Sub12_Sub4 local269 = Static392.method5007(local264, local143);
						local269.method4985(Class2_Sub3_Sub34.anIntArray419[local7] - 1);
						Static211.aClass2_Sub12_Sub2_2.method2085(local269);
					}
					Class162.anIntArray283[local7] = -100;
				}
			} else {
				Class2_Sub2_Sub13.anInt4496--;
				for (@Pc(29) int local29 = local7; local29 < Class2_Sub2_Sub13.anInt4496; local29++) {
					Class11_Sub5_Sub3.anIntArray321[local29] = Class11_Sub5_Sub3.anIntArray321[local29 + 1];
					Class119.aClass247Array2[local29] = Class119.aClass247Array2[local29 + 1];
					Class2_Sub3_Sub34.anIntArray419[local29] = Class2_Sub3_Sub34.anIntArray419[local29 + 1];
					Class162.anIntArray283[local29] = Class162.anIntArray283[local29 + 1];
					Class115.anIntArray188[local29] = Class115.anIntArray188[local29 + 1];
					Class156.anIntArray256[local29] = Class156.anIntArray256[local29 + 1];
				}
				local7--;
			}
		}
		if (Class252.aBoolean486 && !Static60.method1706()) {
			if (Static203.aClass177_Sub1_2.anInt4879 != 0 && Class2_Sub3_Sub18.anInt3264 != -1) {
				Static88.method2044(Static203.aClass177_Sub1_2.anInt4879, Class2_Sub3_Sub18.anInt3264, Static94.aClass197_23);
			}
			Class252.aBoolean486 = false;
		} else if (Static203.aClass177_Sub1_2.anInt4879 != 0 && Class2_Sub3_Sub18.anInt3264 != -1 && !Static60.method1706()) {
			Static85.method1962(Class52.aClass145_56);
			Class14.aClass2_Sub4_Sub2_4.method4814(Class2_Sub3_Sub18.anInt3264);
			Class2_Sub3_Sub18.anInt3264 = -1;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 278)
	public static void method3779(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(7, arg0);
		local12.method2314();
	}
}
