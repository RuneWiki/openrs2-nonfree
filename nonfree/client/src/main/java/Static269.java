import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!qj;")
	public static Class165 aClass165_80;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "[[[Lclient!uk;")
	public static Class204[][][] aClass204ArrayArrayArray3;

	@OriginalMember(owner = "client!rg", name = "rb", descriptor = "[I")
	public static int[] anIntArray658;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public static int anInt5189 = 0;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
	public static final int[] anIntArray657 = new int[13];

	@OriginalMember(owner = "client!rg", name = "fd", descriptor = "I")
	public static int anInt5258 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method4685(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub2 local16 = Static42.method1000(9, arg0);
		local16.method167();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!aa;Lclient!rg;II)V")
	public static void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class97 local10 = arg2.method4686(arg1);
		if (local10 == null) {
			return;
		}
		arg1.method3250(arg0, arg3, arg0 + arg2.anInt5179, arg3 + arg2.anInt5209);
		if (Static298.anInt5959 == 2 || Static298.anInt5959 == 5 || Static254.aClass90_15 == null) {
			arg1.method3334(local10, arg0, arg3);
			return;
		}
		@Pc(56) int local56;
		@Pc(73) int local73;
		@Pc(70) int local70;
		@Pc(62) int local62;
		if (Static81.anInt1609 == 4) {
			local70 = (int) -Static304.aFloat110 & 0x3FFF;
			local73 = Static230.anInt4531;
			local56 = Static339.anInt6426;
			local62 = 4096;
		} else {
			local56 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050;
			local62 = 4096 - Static311.anInt5996 * 16;
			local70 = Static277.anInt6206 + (int) -Static304.aFloat110 & 0x3FFF;
			local73 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047;
		}
		@Pc(100) int local100 = local56 / 32 + 48 + 208 - Static48.anInt1107 * 2;
		@Pc(119) int local119 = Static337.anInt6402 * 4 + 208 + 48 - Static337.anInt6402 * 2 - local73 / 32;
		Static254.aClass90_15.method5468((float) arg0 + (float) arg2.anInt5179 / 2.0F, (float) arg3 + (float) arg2.anInt5209 / 2.0F, (float) local100, (float) local119, local62, local70 << 2, local10, arg0, arg3);
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(191) int local191;
		@Pc(202) int local202;
		for (@Pc(153) Class1_Sub37 local153 = (Class1_Sub37) Static50.aClass195_7.method5029(); local153 != null; local153 = (Class1_Sub37) Static50.aClass195_7.method5021()) {
			@Pc(158) int local158 = local153.anInt6000;
			local170 = (Static97.aClass6_1.anIntArray21[local158] >> 14 & 0x3FFF) - Static182.anInt3775;
			local180 = (Static97.aClass6_1.anIntArray21[local158] & 0x3FFF) - Static161.anInt3315;
			local191 = local170 * 4 + 2 - local56 / 32;
			local202 = local180 * 4 + 2 - local73 / 32;
			Static257.method4560(arg0, arg1, local10, arg3, Static97.aClass6_1.anIntArray22[local158], local191, local202, arg2);
		}
		for (local170 = 0; local170 < Static189.anInt3926; local170++) {
			local180 = Static34.anIntArray102[local170] * 4 + 2 - local56 / 32;
			local191 = Static240.anIntArray599[local170] * 4 + 2 - local73 / 32;
			@Pc(257) Class188 local257 = Static126.method2405(Static135.anIntArray314[local170]);
			if (local257.anIntArray697 != null) {
				local257 = local257.method4915();
				if (local257 == null || local257.anInt5549 == -1) {
					continue;
				}
			}
			Static257.method4560(arg0, arg1, local10, arg3, local257.anInt5549, local180, local191, arg2);
		}
		for (@Pc(297) Class1_Sub39 local297 = (Class1_Sub39) Static52.aClass26_4.method871(); local297 != null; local297 = (Class1_Sub39) Static52.aClass26_4.method878()) {
			local191 = (int) (local297.aLong215 >> 28 & 0x3L);
			if (Static99.anInt1954 == local191) {
				local202 = (int) (local297.aLong215 & 0x3FFFL) * 4 + 2 - local56 / 32;
				@Pc(342) int local342 = (int) (local297.aLong215 >> 14 & 0x3FFFL) * 4 + 2 - local73 / 32;
				Static120.method2166(arg2, local202, local342, Static72.aClass90Array5[0], arg0, arg3, local10);
			}
		}
		@Pc(408) int local408;
		@Pc(418) int local418;
		for (local191 = 0; local191 < Static338.anInt6419; local191++) {
			@Pc(370) Class5_Sub3_Sub3_Sub2 local370 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local191]];
			if (local370 != null && local370.method4552()) {
				@Pc(381) Class122 local381 = local370.aClass122_1;
				if (local381 != null && local381.anIntArray451 != null) {
					local381 = local381.method3573();
				}
				if (local381 != null && local381.aBoolean327 && local381.aBoolean322) {
					local408 = local370.anInt5050 / 32 - local56 / 32;
					local418 = local370.anInt5047 / 32 - local73 / 32;
					if (local381.anInt3817 == -1) {
						Static120.method2166(arg2, local408, local418, Static72.aClass90Array5[1], arg0, arg3, local10);
					} else {
						Static257.method4560(arg0, arg1, local10, arg3, local381.anInt3817, local408, local418, arg2);
					}
				}
			}
		}
		@Pc(496) int local496;
		for (local202 = 0; local202 < Static334.anInt6370; local202++) {
			@Pc(465) Class5_Sub3_Sub3_Sub1 local465 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local202]];
			if (local465 != null && local465.method3065()) {
				local408 = local465.anInt5050 / 32 - local56 / 32;
				local418 = local465.anInt5047 / 32 - local73 / 32;
				@Pc(494) boolean local494 = false;
				for (local496 = 0; local496 < Static290.anInt5612; local496++) {
					if (local465.aString130.equals(Static257.aStringArray33[local496]) && Static205.anIntArray493[local496] != 0) {
						local494 = true;
						break;
					}
				}
				@Pc(523) boolean local523 = false;
				for (@Pc(525) int local525 = 0; local525 < Static229.anInt1684; local525++) {
					if (local465.aString130.equals(Static23.aClass123Array1[local525].aString154)) {
						local523 = true;
						break;
					}
				}
				@Pc(549) boolean local549 = false;
				if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3316 != 0 && local465.anInt3316 != 0 && Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3316 == local465.anInt3316) {
					local549 = true;
				}
				if (local494) {
					Static120.method2166(arg2, local408, local418, Static72.aClass90Array5[3], arg0, arg3, local10);
				} else if (local523) {
					Static120.method2166(arg2, local408, local418, Static72.aClass90Array5[5], arg0, arg3, local10);
				} else if (local549) {
					Static120.method2166(arg2, local408, local418, Static72.aClass90Array5[4], arg0, arg3, local10);
				} else {
					Static120.method2166(arg2, local408, local418, Static72.aClass90Array5[2], arg0, arg3, local10);
				}
			}
		}
		@Pc(631) Class136[] local631 = Static135.aClass136Array1;
		@Pc(719) int local719;
		for (local408 = 0; local408 < local631.length; local408++) {
			@Pc(639) Class136 local639 = local631[local408];
			if (local639 != null && local639.anInt4068 != 0 && Static215.anInt4246 % 20 < 10) {
				@Pc(690) int local690;
				if (local639.anInt4068 == 1 && local639.anInt4063 >= 0 && Static169.aClass5_Sub3_Sub3_Sub2Array2.length > local639.anInt4063) {
					@Pc(668) Class5_Sub3_Sub3_Sub2 local668 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local639.anInt4063];
					if (local668 != null) {
						local496 = local668.anInt5050 / 32 - local56 / 32;
						local690 = local668.anInt5047 / 32 - local73 / 32;
						Static61.method1282(360000, arg3, arg0, local496, local639.anInt4066, local10, arg2, local690);
					}
				}
				if (local639.anInt4068 == 2) {
					local719 = (local639.anInt4067 - Static182.anInt3775) * 4 + 2 - local56 / 32;
					local496 = (local639.anInt4052 - Static161.anInt3315) * 4 + 2 - local73 / 32;
					local690 = local639.anInt4054 * 4;
					local690 *= local690;
					Static61.method1282(local690, arg3, arg0, local719, local639.anInt4066, local10, arg2, local496);
				}
				if (local639.anInt4068 == 10 && local639.anInt4063 >= 0 && local639.anInt4063 < Static254.aClass5_Sub3_Sub3_Sub1Array1.length) {
					@Pc(773) Class5_Sub3_Sub3_Sub1 local773 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local639.anInt4063];
					if (local773 != null) {
						local496 = local773.anInt5050 / 32 - local56 / 32;
						local690 = local773.anInt5047 / 32 - local73 / 32;
						Static61.method1282(360000, arg3, arg0, local496, local639.anInt4066, local10, arg2, local690);
					}
				}
			}
		}
		if (Static81.anInt1609 == 4) {
			return;
		}
		if (Static94.anInt1845 != 0) {
			local418 = Static94.anInt1845 * 4 + Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() * 2 + 2 - local56 / 32 - 2;
			local719 = Static152.anInt3053 * 4 + Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() * 2 + 2 - local73 / 32 - 2;
			Static120.method2166(arg2, local418, local719, Static66.aClass90Array4[Static307.aBoolean518 ? 1 : 0], arg0, arg3, local10);
		}
		arg1.method3277(arg2.anInt5209 / 2 + arg3 - 1, 3, arg2.anInt5179 / 2 + arg0 - 1, -1, 3);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public static int method4691() {
		if (Static272.aBoolean453) {
			return 0;
		} else if (Static123.method2195()) {
			return Static216.aBoolean364 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)I")
	public static int method4696(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZI)Lclient!cm;")
	public static Class1_Sub9 method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub9 local7 = new Class1_Sub9();
		local7.anInt1106 = arg3;
		local7.anInt1104 = arg1;
		Static348.aClass26_20.method877((long) arg0, local7);
		Static194.method3681(arg1);
		@Pc(26) Class177 local26 = Static140.method2694(arg0);
		if (local26 != null) {
			Static133.method2517(local26);
		}
		if (Static297.aClass177_20 != null) {
			Static133.method2517(Static297.aClass177_20);
			Static297.aClass177_20 = null;
		}
		Static164.method3164();
		if (local26 != null) {
			Static217.method3973(!arg2, local26);
		}
		if (!arg2) {
			Static98.method1798(arg1);
		}
		if (!arg2 && Static100.anInt2086 != -1) {
			Static152.method2897(1, Static100.anInt2086);
		}
		return local7;
	}
}
