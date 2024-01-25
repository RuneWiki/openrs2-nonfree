import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "[I")
	public static int[] anIntArray512;

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_192 = new Class129(25, 10);

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
	public static int anInt7468 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public static void method5989() {
		Static333.aClass44_52.method1031();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!za;Lclient!fi;IIB)V")
	public static void method5995(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class97 local10 = arg1.method1688(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ba(arg2, arg3, arg1.anInt2127 + arg2, arg3 - -arg1.anInt2106);
		if (Static221.anInt3661 == 2 || Static221.anInt3661 == 5 || Static64.aClass49_5 == null) {
			arg0.ra(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(62) int local62;
		@Pc(52) int local52;
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (Static449.anInt7379 == 4) {
			local49 = (int) -Static99.aFloat33 & 0x3FFF;
			local52 = Static21.anInt449;
			local62 = Static423.anInt7090;
			local59 = 4096;
		} else {
			local49 = Static65.anInt5018 + (int) -Static99.aFloat33 & 0x3FFF;
			local52 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502;
			local59 = 4096 - Static430.anInt7181 * 16;
			local62 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
		}
		@Pc(90) int local90 = local62 / 32 + 48 - (Static433.anInt7210 - 104) * 2;
		@Pc(108) int local108 = Static418.anInt6969 * 4 + 48 + 208 - local52 / 32 - Static418.anInt6969 * 2;
		Static64.aClass49_5.method5794((float) arg2 + (float) arg1.anInt2127 / 2.0F, (float) arg3 + (float) arg1.anInt2106 / 2.0F, (float) local90, (float) local108, local59, local49 << 2, local10, arg2, arg3);
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(180) int local180;
		@Pc(191) int local191;
		for (@Pc(142) Class5_Sub34 local142 = (Class5_Sub34) Static151.aClass177_51.method3618(); local142 != null; local142 = (Class5_Sub34) Static151.aClass177_51.method3619()) {
			@Pc(147) int local147 = local142.anInt5642;
			local159 = (Static161.aClass153_2.anIntArray252[local147] >> 14 & 0x3FFF) - Static31.anInt618;
			local169 = (Static161.aClass153_2.anIntArray252[local147] & 0x3FFF) - Static226.anInt3768;
			local180 = local159 * 4 + 2 - local62 / 32;
			local191 = local169 * 4 + 2 - local52 / 32;
			Static366.method4748(Static161.aClass153_2.anIntArray253[local147], local180, arg2, arg3, arg0, arg1, local191, local10);
		}
		for (local159 = 0; local159 < Static325.anInt5063; local159++) {
			local169 = Static210.anIntArray213[local159] * 4 + 2 - local62 / 32;
			local180 = Static118.anIntArray113[local159] * 4 + 2 - local52 / 32;
			@Pc(248) Class114 local248 = Static398.aClass256_4.method5782(Static339.anIntArray393[local159]);
			if (local248.anIntArray170 != null) {
				local248 = local248.method2393(Static408.aClass39_1);
				if (local248 == null || local248.anInt2964 == -1) {
					continue;
				}
			}
			Static366.method4748(local248.anInt2964, local169, arg2, arg3, arg0, arg1, local180, local10);
		}
		@Pc(331) int local331;
		@Pc(342) int local342;
		for (@Pc(288) Class5_Sub24 local288 = (Class5_Sub24) Static400.aClass252_38.method5660(); local288 != null; local288 = (Class5_Sub24) Static400.aClass252_38.method5666()) {
			local180 = (int) (local288.aLong234 >> 28 & 0x3L);
			if (Static183.anInt3097 == local180) {
				local191 = (int) (local288.aLong234 & 0x3FFFL) - Static31.anInt618;
				@Pc(320) int local320 = (int) (local288.aLong234 >> 14 & 0x3FFFL) - Static226.anInt3768;
				local331 = local191 * 4 + 2 - local62 / 32;
				local342 = local320 * 4 + 2 - local52 / 32;
				Static280.method3468(local10, local331, arg3, Static454.aClass49Array14[0], arg2, arg1, local342);
			}
		}
		@Pc(430) int local430;
		for (local180 = 0; local180 < Static424.anInt7114; local180++) {
			@Pc(375) Class5_Sub7 local375 = (Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local180]);
			if (local375 != null) {
				@Pc(380) Class2_Sub1_Sub3_Sub1 local380 = local375.aClass2_Sub1_Sub3_Sub1_1;
				if (local380.method4088() && local380.aByte105 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) {
					@Pc(392) Class131 local392 = local380.aClass131_1;
					if (local392 != null && local392.anIntArray209 != null) {
						local392 = local392.method2781(Static408.aClass39_1);
					}
					if (local392 != null && local392.aBoolean222 && local392.aBoolean224) {
						local342 = local380.anInt7500 / 32 - local62 / 32;
						local430 = local380.anInt7502 / 32 - local52 / 32;
						if (local392.anInt3488 == -1) {
							Static280.method3468(local10, local342, arg3, Static454.aClass49Array14[1], arg2, arg1, local430);
						} else {
							Static366.method4748(local392.anInt3488, local342, arg2, arg3, arg0, arg1, local430, local10);
						}
					}
				}
			}
		}
		local191 = Static31.anInt622;
		@Pc(466) int[] local466 = Static334.anIntArray387;
		@Pc(514) int local514;
		@Pc(518) int local518;
		@Pc(546) int local546;
		for (local331 = 0; local331 < local191; local331++) {
			@Pc(476) Class2_Sub1_Sub3_Sub2 local476 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local466[local331]];
			if (local476 != null && local476.method4929() && local476 != Static220.aClass2_Sub1_Sub3_Sub2_1 && Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 == local476.aByte105) {
				local430 = local476.anInt7500 / 32 - local62 / 32;
				local514 = local476.anInt7502 / 32 - local52 / 32;
				@Pc(516) boolean local516 = false;
				for (local518 = 0; local518 < Static244.anInt3939; local518++) {
					if (local476.aString65.equals(Static225.aStringArray27[local518]) && Static226.anIntArray238[local518] != 0) {
						local516 = true;
						break;
					}
				}
				@Pc(544) boolean local544 = false;
				for (local546 = 0; local546 < Static406.anInt6806; local546++) {
					if (local476.aString65.equals(Static349.aClass124Array1[local546].aString37)) {
						local544 = true;
						break;
					}
				}
				@Pc(566) boolean local566 = false;
				if (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6219 != 0 && local476.anInt6219 != 0 && Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6219 == local476.anInt6219) {
					local566 = true;
				}
				if (local476.aBoolean412) {
					Static280.method3468(local10, local430, arg3, Static454.aClass49Array14[6], arg2, arg1, local514);
				} else if (local516) {
					Static280.method3468(local10, local430, arg3, Static454.aClass49Array14[3], arg2, arg1, local514);
				} else if (local544) {
					Static280.method3468(local10, local430, arg3, Static454.aClass49Array14[5], arg2, arg1, local514);
				} else if (local566) {
					Static280.method3468(local10, local430, arg3, Static454.aClass49Array14[4], arg2, arg1, local514);
				} else {
					Static280.method3468(local10, local430, arg3, Static454.aClass49Array14[2], arg2, arg1, local514);
				}
			}
		}
		@Pc(670) Class266[] local670 = Static186.aClass266Array1;
		@Pc(754) int local754;
		for (local430 = 0; local430 < local670.length; local430++) {
			@Pc(678) Class266 local678 = local670[local430];
			if (local678 != null && local678.anInt7406 != 0 && Static85.anInt1536 % 20 < 10) {
				@Pc(717) int local717;
				if (local678.anInt7406 == 1) {
					@Pc(702) Class5_Sub7 local702 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local678.anInt7405);
					if (local702 != null) {
						@Pc(707) Class2_Sub1_Sub3_Sub1 local707 = local702.aClass2_Sub1_Sub3_Sub1_1;
						local717 = local707.anInt7500 / 32 - local62 / 32;
						local546 = local707.anInt7502 / 32 - local52 / 32;
						Static273.method3427(local717, local678.anInt7412, local546, 360000L, arg3, local10, arg1, arg2);
					}
				}
				if (local678.anInt7406 == 2) {
					local754 = local678.anInt7410 / 32 - local62 / 32;
					local518 = local678.anInt7413 / 32 - local52 / 32;
					@Pc(769) long local769 = (long) (local678.anInt7407 << 5);
					@Pc(773) long local773 = local769 * local769;
					Static273.method3427(local754, local678.anInt7412, local518, local773, arg3, local10, arg1, arg2);
				}
				if (local678.anInt7406 == 10 && local678.anInt7405 >= 0 && local678.anInt7405 < Static359.aClass2_Sub1_Sub3_Sub2Array1.length) {
					@Pc(808) Class2_Sub1_Sub3_Sub2 local808 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local678.anInt7405];
					if (local808 != null) {
						local518 = local808.anInt7500 / 32 - local62 / 32;
						local717 = local808.anInt7502 / 32 - local52 / 32;
						Static273.method3427(local518, local678.anInt7412, local717, 360000L, arg3, local10, arg1, arg2);
					}
				}
			}
		}
		if (Static449.anInt7379 == 4) {
			return;
		}
		if (Static453.anInt6195 != 0) {
			local514 = Static453.anInt6195 * 4 + Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() * 2 - local62 / 32;
			local754 = Static209.anInt3498 * 4 + (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() + -1) * 2 + 2 - local52 / 32;
			Static280.method3468(local10, local514, arg3, Static112.aClass49Array6[Static375.aBoolean416 ? 1 : 0], arg2, arg1, local754);
		}
		arg0.method5856(arg3 + arg1.anInt2106 / 2 - 1, -1, 3, 3, arg1.anInt2127 / 2 + arg2 - 1);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)V")
	public static void method6000() {
		Static352.method4983();
		Static341.method4427();
	}
}
