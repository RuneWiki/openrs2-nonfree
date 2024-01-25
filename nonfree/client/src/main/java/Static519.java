import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
	public static int[] anIntArray708;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt8358;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	public static int anInt8360;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	public static int anInt8363;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!dfa;B)V")
	public static void method7297(@OriginalArg(0) Class28_Sub3 arg0) {
		arg0.aClass28_Sub1_5 = null;
		@Pc(10) int local10 = arg0.aClass28_Sub8Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass28_Sub8Array1[local12].aBoolean716 = false;
		}
		@Pc(29) Class371[] local29 = Class3_Sub9_Sub23.aClass371Array1;
		synchronized (Class3_Sub9_Sub23.aClass371Array1) {
			if (local10 < Class3_Sub9_Sub23.aClass371Array1.length && Static619.anIntArray944[local10] < 200) {
				Class3_Sub9_Sub23.aClass371Array1[local10].method8908(arg0);
				@Pc(62) int local62 = Static619.anIntArray944[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ha;ILclient!or;II)V")
	public static void method7299(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class260 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1 local12 = arg2.method6245(arg0);
		if (local12 == null) {
			return;
		}
		arg0.KA(arg1, arg3, arg2.anInt6963 + arg1, arg3 - -arg2.anInt6971);
		if (Static184.anInt3729 == 2 || Static184.anInt3729 == 5 || Static304.aClass33_11 == null) {
			arg0.A(-16777216, local12, arg1, arg3);
			return;
		}
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(62) int local62;
		@Pc(54) int local54;
		if (Static428.anInt6834 == 4) {
			local52 = Static294.anInt6316;
			local54 = 4096;
			local56 = Static96.anInt1798;
			local62 = (int) -Static618.aFloat207 & 0x3FFF;
		} else {
			local56 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
			local52 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
			local54 = 4096 - Static663.anInt10571 * 16;
			local62 = Static490.anInt8101 + (int) -Static618.aFloat207 & 0x3FFF;
		}
		@Pc(97) int local97 = local52 / 128 + 48 - (Static158.anInt927 - 104) * 2;
		@Pc(116) int local116 = Static515.anInt8292 * 4 + 48 - local56 / 128 - (Static515.anInt8292 + -104) * 2;
		Static304.aClass33_11.method7655((float) arg1 + (float) arg2.anInt6963 / 2.0F, (float) arg3 + (float) arg2.anInt6971 / 2.0F, (float) local97, (float) local116, local54, local62 << 2, local12, arg1, arg3);
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(197) int local197;
		for (@Pc(150) Class3_Sub33 local150 = (Class3_Sub33) Static522.aClass338_197.method8177(); local150 != null; local150 = (Class3_Sub33) Static522.aClass338_197.method8168()) {
			@Pc(155) int local155 = local150.anInt4831;
			local167 = (Static537.aClass130_2.anIntArray363[local155] >> 14 & 0x3FFF) - Static287.anInt4910;
			local176 = (Static537.aClass130_2.anIntArray363[local155] & 0x3FFF) - Static72.anInt1361;
			local186 = local167 * 4 + 2 - local52 / 128;
			local197 = local176 * 4 + 2 - local56 / 128;
			Static252.method4147(local186, local12, arg0, local197, arg3, arg2, arg1, Static537.aClass130_2.anIntArray364[local155]);
		}
		for (local167 = 0; local167 < Static275.anInt4800; local167++) {
			local176 = Static479.anIntArray672[local167] * 4 + 2 - local52 / 128;
			local186 = Static670.anIntArray815[local167] * 4 + 2 - local56 / 128;
			@Pc(256) Class277 local256 = Static652.aClass267_4.method6682(Static150.anIntArray491[local167]);
			if (local256.anIntArray660 != null) {
				local256 = local256.method6815(Static131.aClass66_1);
				if (local256 == null || local256.anInt7728 == -1) {
					continue;
				}
			}
			Static252.method4147(local176, local12, arg0, local186, arg3, arg2, arg1, local256.anInt7728);
		}
		@Pc(341) int local341;
		@Pc(352) int local352;
		for (@Pc(293) Class3_Sub16 local293 = (Class3_Sub16) Static98.aClass83_6.method2375(); local293 != null; local293 = (Class3_Sub16) Static98.aClass83_6.method2370()) {
			local186 = (int) (local293.aLong311 >> 28 & 0x3L);
			if (local186 == Static276.anInt4810) {
				local197 = (int) (local293.aLong311 & 0x3FFFL) - Static287.anInt4910;
				@Pc(330) int local330 = (int) (local293.aLong311 >> 14 & 0x3FFFL) - Static72.anInt1361;
				local341 = local197 * 4 + 2 - local52 / 128;
				local352 = local330 * 4 + 2 - local56 / 128;
				Static236.method3938(local341, local352, arg3, arg2, local12, Static589.aClass33Array26[0], arg1);
			}
		}
		@Pc(441) int local441;
		for (local186 = 0; local186 < Static561.anInt9114; local186++) {
			@Pc(385) Class3_Sub3 local385 = (Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local186]);
			if (local385 != null) {
				@Pc(390) Class28_Sub1_Sub1_Sub1_Sub2 local390 = local385.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				if (local390.method9329() && local390.aByte174 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) {
					@Pc(404) Class300 local404 = local390.aClass300_1;
					if (local404 != null && local404.anIntArray696 != null) {
						local404 = local404.method7258(Static131.aClass66_1);
					}
					if (local404 != null && local404.aBoolean632 && local404.aBoolean631) {
						local352 = local390.anInt10729 / 128 - local52 / 128;
						local441 = local390.anInt10731 / 128 - local56 / 128;
						if (local404.anInt8309 == -1) {
							Static236.method3938(local352, local441, arg3, arg2, local12, Static589.aClass33Array26[1], arg1);
						} else {
							Static252.method4147(local352, local12, arg0, local441, arg3, arg2, arg1, local404.anInt8309);
						}
					}
				}
			}
		}
		local197 = Static393.anInt6147;
		@Pc(480) int[] local480 = Static430.anIntArray612;
		@Pc(531) int local531;
		@Pc(535) int local535;
		@Pc(563) int local563;
		for (local341 = 0; local341 < local197; local341++) {
			@Pc(490) Class28_Sub1_Sub1_Sub1_Sub1 local490 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local480[local341]];
			if (local490 != null && local490.method9108() && !local490.aBoolean791 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 != local490 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 == local490.aByte174) {
				local441 = local490.anInt10729 / 128 - local52 / 128;
				local531 = local490.anInt10731 / 128 - local56 / 128;
				@Pc(533) boolean local533 = false;
				for (local535 = 0; local535 < Static458.anInt7581; local535++) {
					if (local490.aString123.equals(Static461.aStringArray20[local535]) && Static212.anIntArray839[local535] != 0) {
						local533 = true;
						break;
					}
				}
				@Pc(561) boolean local561 = false;
				for (local563 = 0; local563 < Static590.anInt9480; local563++) {
					if (local490.aString123.equals(Static41.aClass189Array1[local563].aString50)) {
						local561 = true;
						break;
					}
				}
				@Pc(587) boolean local587 = false;
				if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10518 != 0 && local490.anInt10518 != 0 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10518 == local490.anInt10518) {
					local587 = true;
				}
				if (local490.aBoolean792) {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[6], arg1);
				} else if (local587) {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[4], arg1);
				} else if (local490.aBoolean793) {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[7], arg1);
				} else if (local533) {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[3], arg1);
				} else if (local561) {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[5], arg1);
				} else {
					Static236.method3938(local441, local531, arg3, arg2, local12, Static589.aClass33Array26[2], arg1);
				}
			}
		}
		@Pc(707) Class142[] local707 = Static292.aClass142Array1;
		@Pc(793) int local793;
		for (local441 = 0; local441 < local707.length; local441++) {
			@Pc(715) Class142 local715 = local707[local441];
			if (local715 != null && local715.anInt4300 != 0 && Static588.anInt9467 % 20 < 10) {
				@Pc(758) int local758;
				if (local715.anInt4300 == 1) {
					@Pc(744) Class3_Sub3 local744 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local715.anInt4302);
					if (local744 != null) {
						@Pc(749) Class28_Sub1_Sub1_Sub1_Sub2 local749 = local744.aClass28_Sub1_Sub1_Sub1_Sub2_1;
						local758 = local749.anInt10729 / 128 - local52 / 128;
						local563 = local749.anInt10731 / 128 - local56 / 128;
						Static555.method7900(arg2, arg3, 360000L, local758, local715.anInt4303, arg1, local12, local563);
					}
				}
				if (local715.anInt4300 == 2) {
					local793 = local715.anInt4304 / 128 - local52 / 128;
					local535 = local715.anInt4299 / 128 - local56 / 128;
					@Pc(809) long local809 = (long) (local715.anInt4296 << 7);
					@Pc(813) long local813 = local809 * local809;
					Static555.method7900(arg2, arg3, local813, local793, local715.anInt4303, arg1, local12, local535);
				}
				if (local715.anInt4300 == 10 && local715.anInt4302 >= 0 && Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1.length > local715.anInt4302) {
					@Pc(845) Class28_Sub1_Sub1_Sub1_Sub1 local845 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local715.anInt4302];
					if (local845 != null) {
						local535 = local845.anInt10729 / 128 - local52 / 128;
						local758 = local845.anInt10731 / 128 - local56 / 128;
						Static555.method7900(arg2, arg3, 360000L, local535, local715.anInt4303, arg1, local12, local758);
					}
				}
			}
		}
		if (Static428.anInt6834 == 4) {
			return;
		}
		if (Static661.anInt10551 != 0) {
			local531 = Static661.anInt10551 * 4 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() * 2 + 2 - local52 / 128 - 2;
			local793 = Static514.anInt8261 * 4 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() + -1) * 2 + 2 - local56 / 128;
			Static236.method3938(local531, local793, arg3, arg2, local12, Static138.aClass33Array11[Static27.aBoolean43 ? 1 : 0], arg1);
		}
		if (!Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aBoolean791) {
			arg0.method8452(3, arg3 + arg2.anInt6971 / 2 - 1, 3, arg1 + arg2.anInt6963 / 2 - 1, -1);
			return;
		}
	}
}
