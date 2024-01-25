import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!nr", name = "T", descriptor = "Lclient!ah;")
	public static Interface2 anInterface2_4;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!mo;B)V")
	public static void method3962(@OriginalArg(0) Class143 arg0) {
		Static26.aClass143_16 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!tm;I)I")
	public static int method3963(@OriginalArg(0) Class10_Sub3_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt6017;
		@Pc(17) Class128 local17 = arg0.method5364();
		if (arg0.aBoolean414) {
			local13 = arg0.anInt6022;
		} else if (arg0.anInt5939 == local17.anInt3760 || local17.anInt3725 == arg0.anInt5939 || local17.anInt3733 == arg0.anInt5939 || local17.anInt3743 == arg0.anInt5939) {
			local13 = arg0.anInt6023;
		} else if (local17.anInt3754 == arg0.anInt5939 || local17.anInt3718 == arg0.anInt5939 || local17.anInt3749 == arg0.anInt5939 || local17.anInt3741 == arg0.anInt5939) {
			local13 = arg0.anInt6003;
		}
		return local13;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method3965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static126.method2624(arg3)) {
			Static34.method3919(arg2, arg4, arg6, -1, arg0, Static182.aClass146ArrayArray1[arg3], arg1, arg7, arg5);
		} else if (arg2 == -1) {
			for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
				Static338.aBooleanArray29[local18] = true;
			}
		} else {
			Static338.aBooleanArray29[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZLclient!ne;II)V")
	public static void method3966(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = arg1.anInt4133;
		@Pc(16) int local16 = arg1.anInt4199;
		if (arg1.aByte39 == 0) {
			arg1.anInt4133 = arg1.anInt4125;
		} else if (arg1.aByte39 == 1) {
			arg1.anInt4133 = arg2 - arg1.anInt4125;
		} else if (arg1.aByte39 == 2) {
			arg1.anInt4133 = arg1.anInt4125 * arg2 >> 14;
		} else if (arg1.aByte39 == 3) {
			if (arg1.anInt4135 == 2) {
				arg1.anInt4133 = arg1.anInt4172 * (arg1.anInt4125 - 1) + arg1.anInt4125 * 32;
			} else if (arg1.anInt4135 == 7) {
				arg1.anInt4133 = arg1.anInt4172 * (arg1.anInt4125 - 1) + arg1.anInt4125 * 115;
			}
		}
		if (arg1.aByte40 == 0) {
			arg1.anInt4199 = arg1.anInt4129;
		} else if (arg1.aByte40 == 1) {
			arg1.anInt4199 = arg3 - arg1.anInt4129;
		} else if (arg1.aByte40 == 2) {
			arg1.anInt4199 = arg3 * arg1.anInt4129 >> 14;
		} else if (arg1.aByte40 == 3) {
			if (arg1.anInt4135 == 2) {
				arg1.anInt4199 = arg1.anInt4129 * 32 + (arg1.anInt4129 - 1) * arg1.anInt4212;
			} else if (arg1.anInt4135 == 7) {
				arg1.anInt4199 = arg1.anInt4212 * (arg1.anInt4129 - 1) + arg1.anInt4129 * 12;
			}
		}
		if (arg1.aByte39 == 4) {
			arg1.anInt4133 = arg1.anInt4137 * arg1.anInt4199 / arg1.anInt4144;
		}
		if (arg1.aByte40 == 4) {
			arg1.anInt4199 = arg1.anInt4133 * arg1.anInt4144 / arg1.anInt4137;
		}
		if (Static195.aBoolean248 && (Static42.method1040(arg1).anInt2702 != 0 || arg1.anInt4135 == 0)) {
			if (arg1.anInt4199 < 5 && arg1.anInt4133 < 5) {
				arg1.anInt4133 = 5;
				arg1.anInt4199 = 5;
			} else {
				if (arg1.anInt4133 <= 0) {
					arg1.anInt4133 = 5;
				}
				if (arg1.anInt4199 <= 0) {
					arg1.anInt4199 = 5;
				}
			}
		}
		if (arg1.anInt4198 == 1337) {
			Static103.aClass146_24 = arg1;
		}
		if (arg0 && arg1.anObjectArray6 != null && (local13 != arg1.anInt4133 || local16 != arg1.anInt4199)) {
			@Pc(290) Class14_Sub15 local290 = new Class14_Sub15();
			local290.aClass146_22 = arg1;
			local290.anObjectArray3 = arg1.anObjectArray6;
			Static307.aClass18_11.method451(local290);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
	public static void method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class188 local13 = Static162.aClass188ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static272.anInt5177 = local13.anInt5704;
			Static351.anInt6642 = local13.anInt5699;
			Static307.anInt2890 = local13.anInt5700;
		}
		Static215.method3860();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!e;Lclient!br;ZLclient!el;)V")
	public static void method3969(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class14_Sub5 arg1, @OriginalArg(3) Class52 arg2) {
		@Pc(10) Class2 local10 = arg2.method1775(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method2639();
		if (local10.method2640() > local16) {
			local16 = local10.method2640();
		}
		@Pc(32) int local32 = arg1.anInt731;
		@Pc(35) int local35 = arg1.anInt726;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg2.aString65 != null) {
			local37 = Static205.aClass76_6.method2254(null, Static335.aStringArray74, arg2.aString65, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static335.aStringArray74[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static121.aClass212_5.method5865(local61);
				if (local39 < local82) {
					local39 = local82;
				}
			}
			local41 = Static121.aClass212_5.method5869() * local37 + Static121.aClass212_5.method5863() / 2;
		}
		local55 = local16 / 2 + arg1.anInt731;
		@Pc(116) int local116 = arg1.anInt726;
		if (local32 < local16 + Static241.anInt5679) {
			local55 = Static241.anInt5679 + local16 / 2 + local39 / 2 + 10 + 5;
			local32 = Static241.anInt5679;
		} else if (local32 > Static241.anInt5682 - local16) {
			local32 = Static241.anInt5682 - local16;
			local55 = Static241.anInt5682 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		if (Static241.anInt5678 + local16 > local35) {
			local35 = Static241.anInt5678;
			local116 = Static241.anInt5678 + local16 / 2 + 10;
		} else if (Static241.anInt5685 - local16 < local35) {
			local35 = Static241.anInt5685 - local16;
			local116 = Static241.anInt5685 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt731), (double) (local35 - arg1.anInt726)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method2629((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg2.aString65 != null) {
			local259 = local55 - local39 / 2 - 5;
			local261 = local116;
			local269 = local116 + Static121.aClass212_5.method5869() * local37 + 3;
			local267 = local259 + local39 + 10;
			if (arg2.anInt1731 != 0) {
				arg0.method5108(local267 - local259, local259, local269 - local116, arg2.anInt1731, local116);
			}
			if (arg2.anInt1739 != 0) {
				arg0.method5087(local116, local269 - local116, local259, arg2.anInt1739, local267 - local259);
			}
			for (@Pc(342) int local342 = 0; local342 < local37; local342++) {
				@Pc(348) String local348 = Static335.aStringArray74[local342];
				if (local37 - 1 > local342) {
					local348 = local348.substring(0, local348.length() - 4);
				}
				Static121.aClass212_5.method5866(arg0, local348, local55, local116, arg2.anInt1735);
				local116 += Static121.aClass212_5.method5869();
			}
		}
		if (arg2.anInt1743 == -1 && arg2.aString65 == null) {
			return;
		}
		@Pc(396) Class14_Sub36 local396 = new Class14_Sub36(arg1);
		local16 >>= 0x1;
		local396.anInt6351 = local269;
		local396.anInt6343 = local35 - local16;
		local396.anInt6345 = local16 + local35;
		local396.anInt6340 = local32 - local16;
		local396.anInt6350 = local259;
		local396.anInt6342 = local32 + local16;
		local396.anInt6347 = local261;
		local396.anInt6353 = local267;
		Static326.aClass18_44.method451(local396);
	}
}
