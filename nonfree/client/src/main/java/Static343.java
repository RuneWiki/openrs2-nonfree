import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!tja;")
	public static Class350 aClass350_4;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!ca;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	public static final int anInt5829 = 52;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!gg;I)V")
	public static void method5235(@OriginalArg(0) Class4_Sub3_Sub3_Sub3_Sub2 arg0) {
		@Pc(11) Class14_Sub42 local11 = (Class14_Sub42) Static341.aClass125_19.method2630((long) arg0.anInt3238);
		if (local11 == null) {
			return;
		}
		if (local11.aClass14_Sub1_Sub1_4 != null) {
			Static196.aClass14_Sub1_Sub2_1.method1810(local11.aClass14_Sub1_Sub1_4);
			local11.aClass14_Sub1_Sub1_4 = null;
		}
		local11.method9513();
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	public static void method5237() {
		Static627.anInt10289 = 0;
		@Pc(10) Class14_Sub21_Sub2 local10 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		@Pc(14) int local14 = local10.method7712();
		@Pc(26) boolean local26 = local10.method7695(107) == 1;
		@Pc(30) int local30 = local10.method7738(1275460792);
		@Pc(34) int local34 = local10.method7754();
		Static116.method1821();
		Static120.method1873(local30);
		@Pc(47) int local47 = (Static277.aClass347_2.anInt9628 - local10.anInt8936) / 16;
		Static157.anIntArrayArray16 = new int[local47][4];
		@Pc(65) int local65;
		for (@Pc(61) int local61 = 0; local61 < local47; local61++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static157.anIntArrayArray16[local61][local65] = local10.method7748();
			}
		}
		Static495.anIntArray447 = new int[local47];
		Static535.anIntArray475 = new int[local47];
		Static365.anIntArray336 = new int[local47];
		Static73.aByteArrayArray2 = new byte[local47][];
		Static634.anIntArray558 = new int[local47];
		Static250.anIntArray238 = new int[local47];
		Static103.aByteArrayArray3 = new byte[local47][];
		Static601.aByteArrayArray29 = new byte[local47][];
		Static47.anIntArray50 = null;
		Static475.aByteArrayArray20 = new byte[local47][];
		Static511.aByteArrayArray23 = null;
		local47 = 0;
		for (local65 = (local14 - (Static380.anInt6689 >> 4)) / 8; local65 <= ((Static380.anInt6689 >> 4) + local14) / 8; local65++) {
			for (@Pc(152) int local152 = (local34 - (Static542.anInt9214 >> 4)) / 8; local152 <= ((Static542.anInt9214 >> 4) + local34) / 8; local152++) {
				Static365.anIntArray336[local47] = local152 + (local65 << 8);
				Static535.anIntArray475[local47] = Static655.aClass310_132.method7794("m" + local65 + "_" + local152);
				Static634.anIntArray558[local47] = Static655.aClass310_132.method7794("l" + local65 + "_" + local152);
				Static495.anIntArray447[local47] = Static655.aClass310_132.method7794("um" + local65 + "_" + local152);
				Static250.anIntArray238[local47] = Static655.aClass310_132.method7794("ul" + local65 + "_" + local152);
				local47++;
			}
		}
		Static333.method8696(local26, 12, local14, local34);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZIIZ)I")
	public static int method5238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class14_Sub14 local8 = Static495.method7455(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local8.anIntArray107.length; local23++) {
				if (arg1 == local8.anIntArray106[local23]) {
					local21 += local8.anIntArray107[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIBI)V")
	public static void method5239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class14_Sub42 local6 = (Class14_Sub42) Static618.aClass32_66.method584(); local6 != null; local6 = (Class14_Sub42) Static618.aClass32_66.method577()) {
			Static211.method3242(local6, arg0, arg1, arg2, arg3);
		}
		@Pc(138) int local138;
		@Pc(200) boolean local200;
		for (@Pc(33) Class14_Sub42 local33 = (Class14_Sub42) Static489.aClass32_57.method584(); local33 != null; local33 = (Class14_Sub42) Static489.aClass32_57.method577()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class141 local44 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.method2865();
			@Pc(50) int local50 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.aClass181_7.method8959();
			if (local50 == -1 || local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.aBoolean236) {
				local39 = 0;
			} else if (local50 == local44.anInt3543 || local50 == local44.anInt3560 || local44.anInt3530 == local50 || local50 == local44.anInt3559) {
				local39 = 2;
			} else if (local50 == local44.anInt3562 || local50 == local44.anInt3563 || local44.anInt3536 == local50 || local44.anInt3528 == local50) {
				local39 = 3;
			}
			if (local33.anInt9540 != local39) {
				local138 = Static420.method6288(local33.aClass4_Sub3_Sub3_Sub3_Sub1_1);
				@Pc(142) Class362 local142 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.aClass362_1;
				if (local142.lb != null) {
					local142 = local142.method8641(Static188.aClass238_1);
				}
				if (local142 == null || local138 == -1) {
					local33.anInt9540 = local39;
					local33.aBoolean659 = false;
					local33.anInt9545 = -1;
				} else if (local33.anInt9545 == local138 && local33.aBoolean659 == local142.aBoolean697) {
					local33.anInt9540 = local39;
					local33.anInt9543 = local142.anInt10078;
				} else {
					local200 = false;
					if (local33.aClass14_Sub1_Sub1_4 == null) {
						local200 = true;
					} else {
						local33.anInt9543 -= 512;
						if (local33.anInt9543 <= 0) {
							Static196.aClass14_Sub1_Sub2_1.method1810(local33.aClass14_Sub1_Sub1_4);
							local200 = true;
							local33.aClass14_Sub1_Sub1_4 = null;
						}
					}
					if (local200) {
						local33.aBoolean659 = local142.aBoolean697;
						local33.aClass14_Sub53_3 = null;
						local33.aClass14_Sub19_Sub1_3 = null;
						local33.anInt9543 = local142.anInt10078;
						local33.anInt9545 = local138;
						local33.anInt9540 = local39;
					}
				}
			}
			local33.anInt9546 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.anInt11184;
			local33.anInt9534 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.anInt11184 + (local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.method2870(0) << 8);
			local33.anInt9535 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.anInt11178;
			local33.anInt9536 = local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.anInt11178 + (local33.aClass4_Sub3_Sub3_Sub3_Sub1_1.method2870(0) << 8);
			Static211.method3242(local33, arg0, arg1, arg2, arg3);
		}
		for (@Pc(320) Class14_Sub42 local320 = (Class14_Sub42) Static341.aClass125_19.method2633(); local320 != null; local320 = (Class14_Sub42) Static341.aClass125_19.method2627()) {
			@Pc(324) byte local324 = 1;
			@Pc(329) Class141 local329 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.method2865();
			local138 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.aClass181_7.method8959();
			if (local138 == -1 || local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.aBoolean236) {
				local324 = 0;
			} else if (local329.anInt3543 == local138 || local138 == local329.anInt3560 || local329.anInt3530 == local138 || local329.anInt3559 == local138) {
				local324 = 2;
			} else if (local138 == local329.anInt3562 || local138 == local329.anInt3563 || local138 == local329.anInt3536 || local138 == local329.anInt3528) {
				local324 = 3;
			}
			if (local320.anInt9540 != local324) {
				@Pc(436) int local436 = Static254.method4274(local320.aClass4_Sub3_Sub3_Sub3_Sub2_2);
				if (local436 == local320.anInt9545 && local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.aBoolean247 == local320.aBoolean659) {
					local320.anInt9540 = local324;
					local320.anInt9543 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt3323;
				} else {
					local200 = false;
					if (local320.aClass14_Sub1_Sub1_4 == null) {
						local200 = true;
					} else {
						local320.anInt9543 -= 512;
						if (local320.anInt9543 <= 0) {
							Static196.aClass14_Sub1_Sub2_1.method1810(local320.aClass14_Sub1_Sub1_4);
							local200 = true;
							local320.aClass14_Sub1_Sub1_4 = null;
						}
					}
					if (local200) {
						local320.anInt9543 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt3323;
						local320.aClass14_Sub53_3 = null;
						local320.aClass14_Sub19_Sub1_3 = null;
						local320.anInt9545 = local436;
						local320.aBoolean659 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.aBoolean247;
						local320.anInt9540 = local324;
					}
				}
			}
			local320.anInt9546 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt11184;
			local320.anInt9534 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt11184 + (local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.method2870(0) << 8);
			local320.anInt9535 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt11178;
			local320.anInt9536 = local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt11178 + (local320.aClass4_Sub3_Sub3_Sub3_Sub2_2.method2870(0) << 8);
			Static211.method3242(local320, arg0, arg1, arg2, arg3);
		}
	}
}
