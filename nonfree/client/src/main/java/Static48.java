import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	public static int anInt8831;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public static void method7038() {
		if (Static532.aFloat185 < 1024.0F) {
			Static532.aFloat185 = 1024.0F;
		}
		while (Static562.aFloat14 >= 16384.0F) {
			Static562.aFloat14 -= 16384.0F;
		}
		if (Static532.aFloat185 > 3072.0F) {
			Static532.aFloat185 = 3072.0F;
		}
		while (Static562.aFloat14 < 0.0F) {
			Static562.aFloat14 += 16384.0F;
		}
		@Pc(43) int local43 = Static480.anInt8528 >> 9;
		@Pc(47) int local47 = Static168.anInt3085 >> 9;
		@Pc(55) int local55 = Static37.method631(Static168.anInt3085, Static480.anInt8528, Static391.anInt7128);
		@Pc(57) int local57 = 0;
		@Pc(77) int local77;
		if (local43 > 3 && local47 > 3 && Static18.anInt5706 - 4 > local43 && Static80.anInt1367 - 4 > local47) {
			for (local77 = local43 - 4; local77 <= local43 + 4; local77++) {
				for (@Pc(83) int local83 = local47 - 4; local83 <= local47 + 4; local83++) {
					@Pc(87) int local87 = Static391.anInt7128;
					if (local87 < 3 && Static77.method1114(local83, local77)) {
						local87++;
					}
					@Pc(100) int local100 = 0;
					if (Static375.aClass238_Sub1_5.aByteArrayArrayArray19 != null && Static375.aClass238_Sub1_5.aByteArrayArrayArray19[local87] != null) {
						local100 = (Static375.aClass238_Sub1_5.aByteArrayArrayArray19[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local100 + local55 - Static205.aClass46Array1[local87].JA(local77, local83);
					if (local132 > local57) {
						local57 = local132;
					}
				}
			}
		}
		local77 = (local57 >> 2) * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (local77 > Static428.anInt7623) {
			Static428.anInt7623 += (local77 - Static428.anInt7623) / 24;
		} else if (Static428.anInt7623 > local77) {
			Static428.anInt7623 += (local77 - Static428.anInt7623) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IFII[FFIIBIIIF)V")
	public static void method7039(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg9 - arg8;
		@Pc(13) int local13 = arg2 - arg7;
		@Pc(17) int local17 = arg6 - arg0;
		@Pc(38) float local38 = arg4[2] * (float) local13 + (float) local17 * arg4[0] + arg4[1] * (float) local5;
		@Pc(64) float local64 = arg4[5] * (float) local13 + (float) local5 * arg4[4] + arg4[3] * (float) local17;
		@Pc(85) float local85 = (float) local13 * arg4[8] + arg4[6] * (float) local17 + arg4[7] * (float) local5;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (arg3 == 0) {
			local94 = arg11 + 0.5F - local85;
			local100 = local38 + arg5 + 0.5F;
		} else if (arg3 == 1) {
			local100 = arg5 + local38 + 0.5F;
			local94 = arg11 + local85 + 0.5F;
		} else if (arg3 == 2) {
			local94 = arg1 + 0.5F - local64;
			local100 = arg5 + 0.5F - local38;
		} else if (arg3 == 3) {
			local100 = local38 + arg5 + 0.5F;
			local94 = arg1 + 0.5F - local64;
		} else if (arg3 == 4) {
			local100 = arg11 + local85 + 0.5F;
			local94 = arg1 + 0.5F - local64;
		} else {
			local100 = arg11 + 0.5F - local85;
			local94 = arg1 + 0.5F - local64;
		}
		@Pc(213) float local213;
		if (arg10 == 1) {
			local213 = local100;
			local100 = -local94;
			local94 = local213;
		} else if (arg10 == 2) {
			local100 = -local100;
			local94 = -local94;
		} else if (arg10 == 3) {
			local213 = local100;
			local100 = local94;
			local94 = -local213;
		}
		Static41.aFloat21 = local94;
		Static460.aFloat174 = local100;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLclient!faa;Lclient!faa;)V")
	public static void method7043(@OriginalArg(1) Class97 arg0, @OriginalArg(2) Class97 arg1) {
		Static534.method7063(Static189.aClass316_44);
		Static340.aClass6_Sub12_Sub2_1.method6042(arg0.anInt2678);
		Static340.aClass6_Sub12_Sub2_1.method6032(arg0.anInt2607);
		Static340.aClass6_Sub12_Sub2_1.method6053(arg1.anInt2675);
		Static340.aClass6_Sub12_Sub2_1.method6006(arg1.anInt2678);
		Static340.aClass6_Sub12_Sub2_1.method6041(arg0.anInt2675);
		Static340.aClass6_Sub12_Sub2_1.method6032(arg1.anInt2607);
	}
}
