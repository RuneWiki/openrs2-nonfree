import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_26 = new Class74("", 19);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!d;IILclient!ha;II)V")
	public static void method7720(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class126 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static88.anInt1458 < 100) {
			Static226.method3558(arg1, arg3);
		}
		arg3.KA(arg4, arg5, arg4 + arg0, arg2 + arg5);
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (Static88.anInt1458 < 100) {
			local32 = arg4 + arg0 / 2;
			local43 = arg2 / 2 + arg5 - 20 - 18;
			arg3.aa(arg4, arg5, arg0, arg2, -16777216, 0);
			arg3.method7021(local32 - 152, local43, 304, 34, Static564.aColorArray3[Static409.anInt7033].getRGB(), 0);
			arg3.aa(local32 - 150, local43 + 2, Static88.anInt1458 * 3, 30, Static294.aColorArray2[Static409.anInt7033].getRGB(), 0);
			Static471.aClass6_12.method7199(local32, Static76.aClass58_19.method1237(Static321.anInt5554), local43 + 20, Static229.aColorArray1[Static409.anInt7033].getRGB(), -1);
			return;
		}
		@Pc(107) int local107 = Static504.anInt8544 - (int) ((float) arg0 / Static203.aFloat3);
		local32 = (int) ((float) arg2 / Static203.aFloat3) + Static449.anInt7564;
		local43 = Static504.anInt8544 + (int) ((float) arg0 / Static203.aFloat3);
		Static382.anInt10004 = (int) ((float) (arg2 * 2) / Static203.aFloat3);
		Static100.anInt1578 = Static504.anInt8544 - (int) ((float) arg0 / Static203.aFloat3);
		@Pc(157) int local157 = Static449.anInt7564 - (int) ((float) arg2 / Static203.aFloat3);
		Static552.anInt9133 = Static449.anInt7564 - (int) ((float) arg2 / Static203.aFloat3);
		Static69.anInt1101 = (int) ((float) (arg0 * 2) / Static203.aFloat3);
		Static203.method157(Static203.anInt136 + local107, local32 - -Static203.anInt137, Static203.anInt136 + local43, Static203.anInt137 + local157, arg4, arg5, arg0 + arg4, arg2 + 1 + arg5);
		Static203.method155(arg3);
		@Pc(203) Class306 local203 = Static203.method160(arg3);
		Static166.method2532(arg3, local203);
		if (Static340.anInt5872 > 0) {
			Static10.anInt161--;
			if (Static10.anInt161 == 0) {
				Static10.anInt161 = 20;
				Static340.anInt5872--;
			}
		}
		if (!Static125.aBoolean158) {
			return;
		}
		@Pc(237) int local237 = arg4 + arg0 - 5;
		@Pc(243) int local243 = arg2 + arg5 - 8;
		Static437.aClass6_11.method7221(16776960, local237, -1, local243, "Fps:" + Static33.anInt623);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static437.aClass6_11.method7221(local272, local237, -1, local258, "Mem:" + local270 + "k");
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!kn;)I")
	public static int method7722(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt2956 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(58) int local58;
		if (arg0.anInt2951 != -1) {
			@Pc(18) Class14_Sub1_Sub1_Sub3 local18 = null;
			if (arg0.anInt2951 < 32768) {
				@Pc(44) Class5_Sub13 local44 = (Class5_Sub13) Static51.aClass81_11.method1599((long) arg0.anInt2951);
				if (local44 != null) {
					local18 = local44.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				}
			} else if (arg0.anInt2951 >= 32768) {
				local18 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt2951 - 32768];
			}
			if (local18 != null) {
				local58 = arg0.anInt9317 - local18.anInt9317;
				local64 = arg0.anInt9315 - local18.anInt9315;
				if (local58 != 0 || local64 != 0) {
					arg0.method2507((int) (Math.atan2((double) local58, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class14_Sub1_Sub1_Sub3_Sub1) {
			@Pc(93) Class14_Sub1_Sub1_Sub3_Sub1 local93 = (Class14_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local93.anInt2714 != -1 && (local93.anInt2972 == 0 || local93.anInt2971 > 0)) {
				local93.method2507(local93.anInt2714);
				local93.anInt2714 = -1;
			}
		} else if (arg0 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
			@Pc(120) Class14_Sub1_Sub1_Sub3_Sub2 local120 = (Class14_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local120.anInt2982 != -1 && (local120.anInt2972 == 0 || local120.anInt2971 > 0)) {
				local58 = local120.anInt9317 - (local120.anInt2982 - Static113.anInt1785 - Static113.anInt1785) * 256;
				local64 = local120.anInt9315 - (local120.anInt2990 - Static622.anInt10087 - Static622.anInt10087) * 256;
				if (local58 != 0 || local64 != 0) {
					local120.method2507((int) (Math.atan2((double) local58, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local120.anInt2982 = -1;
			}
		}
		return arg0.method2513();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method7723() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static605.aBoolean812) {
			local9 = 4096;
			if (Static165.aBoolean249) {
				local7 = 2048;
			}
		}
		if (Static371.aFloat65 < (float) local7) {
			Static371.aFloat65 = (float) local7;
		}
		while (Static112.aFloat22 >= 16384.0F) {
			Static112.aFloat22 -= 16384.0F;
		}
		if ((float) local9 < Static371.aFloat65) {
			Static371.aFloat65 = (float) local9;
		}
		while (Static112.aFloat22 < 0.0F) {
			Static112.aFloat22 += 16384.0F;
		}
		@Pc(65) int local65 = Static134.anInt2212 >> 9;
		@Pc(69) int local69 = Static319.anInt5539 >> 9;
		@Pc(75) int local75 = Static600.method8378(Static319.anInt5539, Static134.anInt2212, Static299.anInt4751);
		@Pc(77) int local77 = 0;
		@Pc(105) int local105;
		if (local65 > 3 && local69 > 3 && Static111.anInt1752 - 4 > local65 && local69 < Static279.anInt4567 - 4) {
			for (local105 = local65 - 4; local105 <= local65 + 4; local105++) {
				for (@Pc(111) int local111 = local69 - 4; local111 <= local69 + 4; local111++) {
					@Pc(115) int local115 = Static299.anInt4751;
					if (local115 < 3 && Static353.method5596(local105, local111)) {
						local115++;
					}
					@Pc(128) int local128 = 0;
					if (Static121.aClass15_Sub1_2.aByteArrayArrayArray11 != null && Static121.aClass15_Sub1_2.aByteArrayArrayArray11[local115] != null) {
						local128 = (Static121.aClass15_Sub1_2.aByteArrayArrayArray11[local115][local105][local111] & 0xFF) * 8 << 2;
					}
					if (Static299.aClass40Array1 != null && Static299.aClass40Array1[local115] != null) {
						@Pc(170) int local170 = local75 + local128 - Static299.aClass40Array1[local115].method8442(local105, local111);
						if (local170 > local77) {
							local77 = local170;
						}
					}
				}
			}
		}
		local105 = (local77 >> 2) * 1536;
		if (local105 > 786432) {
			local105 = 786432;
		}
		if (local105 < 262144) {
			local105 = 262144;
		}
		if (local105 > Static93.anInt1497) {
			Static93.anInt1497 += (local105 - Static93.anInt1497) / 24;
		} else if (Static93.anInt1497 > local105) {
			Static93.anInt1497 += (local105 - Static93.anInt1497) / 80;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	public static boolean method7724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(FIFFFFFI)F")
	public static float method7726(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg0 - arg5;
		@Pc(16) float local16 = arg4 - arg6;
		@Pc(21) float local21 = arg3 - arg2;
		@Pc(24) float local24 = (float) 0;
		@Pc(26) float local26 = 0.0F;
		@Pc(28) float local28 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(36) float local36 = arg5 + local12 * local7;
			@Pc(42) float local42 = arg6 + local16 * local7;
			@Pc(48) float local48 = arg2 + local21 * local7;
			@Pc(53) int local53 = (int) local36 >> 9;
			@Pc(58) int local58 = (int) local48 >> 9;
			if (local53 > 0 && local58 > 0 && Static111.anInt1752 > local53 && Static279.anInt4567 > local58) {
				@Pc(78) int local78 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125;
				if (local78 < 3 && (Static480.aByteArrayArrayArray19[1][local53][local58] & 0x2) != 0) {
					local78++;
				}
				@Pc(102) int local102 = Static492.aClass40Array3[local78].method8447((int) local36, (int) local48);
				if (local42 > (float) local102) {
					if (arg1 >= 2) {
						return method7726(local36, arg1 - 1, local28, local48, local42, local24, local26) * 0.1F + local7 - 0.1F;
					}
					return local7;
				}
			}
			local28 = local48;
			local24 = local36;
			local26 = local42;
			local7 += 0.1F;
		}
		return -1.0F;
	}
}
