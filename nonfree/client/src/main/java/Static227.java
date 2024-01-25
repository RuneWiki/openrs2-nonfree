import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!da;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt4609 = 0;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public static int method3937(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ha;IIZLclient!uv;)V")
	public static void method3939(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class344 arg3) {
		@Pc(10) Class1 local10 = arg3.method8166(arg0);
		if (local10 == null) {
			return;
		}
		arg0.KA(arg2, arg1, arg3.anInt9546 + arg2, arg1 - -arg3.anInt9602);
		if (Static322.anInt6163 == 2 || Static322.anInt6163 == 5 || Static294.aClass103_32 == null) {
			arg0.A(-16777216, local10, arg2, arg1);
			return;
		}
		@Pc(52) int local52;
		@Pc(69) int local69;
		@Pc(60) int local60;
		@Pc(66) int local66;
		if (Static471.anInt8064 == 4) {
			local52 = Static49.anInt971;
			local60 = (int) -Static170.aFloat71 & 0x3FFF;
			local69 = Static528.anInt8946;
			local66 = 4096;
		} else {
			local52 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152;
			local60 = (int) -Static170.aFloat71 + Static579.anInt9458 & 0x3FFF;
			local66 = 4096 - Static296.anInt5883 * 16;
			local69 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
		}
		@Pc(96) int local96 = local52 / 128 + 208 + 48 - Static399.anInt7121 * 2;
		@Pc(114) int local114 = Static24.anInt345 * 4 + 208 + 48 - Static24.anInt345 * 2 - local69 / 128;
		Static294.aClass103_32.method7446((float) arg3.anInt9546 / 2.0F + (float) arg2, (float) arg3.anInt9602 / 2.0F + (float) arg1, (float) local96, (float) local114, local66, local60 << 2, local10, arg2, arg1);
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(186) int local186;
		@Pc(196) int local196;
		for (@Pc(148) Class3_Sub51 local148 = (Class3_Sub51) Static559.aClass216_67.method5457(); local148 != null; local148 = (Class3_Sub51) Static559.aClass216_67.method5458()) {
			@Pc(153) int local153 = local148.anInt9787;
			local165 = (Static177.aClass76_3.anIntArray144[local153] >> 14 & 0x3FFF) - Static427.anInt7462;
			local175 = (Static177.aClass76_3.anIntArray144[local153] & 0x3FFF) - Static22.anInt329;
			local186 = local165 * 4 + 2 - local52 / 128;
			local196 = local175 * 4 + 2 - local69 / 128;
			Static387.method6061(arg3, local186, local10, arg0, arg1, local196, arg2, Static177.aClass76_3.anIntArray143[local153]);
		}
		for (local165 = 0; local165 < Static415.anInt7299; local165++) {
			local175 = Static578.anIntArray593[local165] * 4 + 2 - local52 / 128;
			local186 = Static402.anIntArray426[local165] * 4 + 2 - local69 / 128;
			@Pc(252) Class330 local252 = Static370.aClass284_3.method6915(Static584.anIntArray594[local165]);
			if (local252.anIntArray581 != null) {
				local252 = local252.method7892(Static183.aClass285_1);
				if (local252 == null || local252.anInt9202 == -1) {
					continue;
				}
			}
			Static387.method6061(arg3, local175, local10, arg0, arg1, local186, arg2, local252.anInt9202);
		}
		@Pc(337) int local337;
		@Pc(348) int local348;
		for (@Pc(289) Class3_Sub25 local289 = (Class3_Sub25) Static39.aClass25_8.method435(); local289 != null; local289 = (Class3_Sub25) Static39.aClass25_8.method432()) {
			local186 = (int) (local289.aLong277 >> 28 & 0x3L);
			if (Static617.anInt9920 == local186) {
				local196 = (int) (local289.aLong277 & 0x3FFFL) - Static427.anInt7462;
				@Pc(326) int local326 = (int) (local289.aLong277 >> 14 & 0x3FFFL) - Static22.anInt329;
				local337 = local196 * 4 + 2 - local52 / 128;
				local348 = local326 * 4 + 2 - local69 / 128;
				Static453.method6694(arg3, arg2, local10, local348, local337, arg1, Static142.aClass103Array23[0]);
			}
		}
		@Pc(434) int local434;
		for (local186 = 0; local186 < Static596.anInt9702; local186++) {
			@Pc(379) Class3_Sub43 local379 = (Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local186]);
			if (local379 != null) {
				@Pc(384) Class9_Sub2_Sub1_Sub2_Sub2 local384 = local379.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				if (local384.method8638() && local384.aByte127 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
					@Pc(396) Class309 local396 = local384.aClass309_1;
					if (local396 != null && local396.anIntArray553 != null) {
						local396 = local396.method7594(Static183.aClass285_1);
					}
					if (local396 != null && local396.aBoolean660 && local396.aBoolean659) {
						local348 = local384.anInt10152 / 128 - local52 / 128;
						local434 = local384.anInt10158 / 128 - local69 / 128;
						if (local396.anInt8829 == -1) {
							Static453.method6694(arg3, arg2, local10, local434, local348, arg1, Static142.aClass103Array23[1]);
						} else {
							Static387.method6061(arg3, local348, local10, arg0, arg1, local434, arg2, local396.anInt8829);
						}
					}
				}
			}
		}
		local196 = Static174.anInt3362;
		@Pc(475) int[] local475 = Static495.anIntArray529;
		@Pc(526) int local526;
		@Pc(530) int local530;
		@Pc(562) int local562;
		for (local337 = 0; local337 < local196; local337++) {
			@Pc(485) Class9_Sub2_Sub1_Sub2_Sub1 local485 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local475[local337]];
			if (local485 != null && local485.method1156() && !local485.aBoolean77 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 != local485 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 == local485.aByte127) {
				local434 = local485.anInt10152 / 128 - local52 / 128;
				local526 = local485.anInt10158 / 128 - local69 / 128;
				@Pc(528) boolean local528 = false;
				for (local530 = 0; local530 < Static606.anInt9791; local530++) {
					if (local485.aString5.equals(Static233.aStringArray32[local530]) && Static112.anIntArray152[local530] != 0) {
						local528 = true;
						break;
					}
				}
				@Pc(560) boolean local560 = false;
				for (local562 = 0; local562 < Static398.anInt7117; local562++) {
					if (local485.aString5.equals(Static95.aClass253Array1[local562].aString60)) {
						local560 = true;
						break;
					}
				}
				@Pc(582) boolean local582 = false;
				if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1287 != 0 && local485.anInt1287 != 0 && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1287 == local485.anInt1287) {
					local582 = true;
				}
				if (local485.aBoolean80) {
					Static453.method6694(arg3, arg2, local10, local526, local434, arg1, Static142.aClass103Array23[6]);
				} else if (local528) {
					Static453.method6694(arg3, arg2, local10, local526, local434, arg1, Static142.aClass103Array23[3]);
				} else if (local560) {
					Static453.method6694(arg3, arg2, local10, local526, local434, arg1, Static142.aClass103Array23[5]);
				} else if (local582) {
					Static453.method6694(arg3, arg2, local10, local526, local434, arg1, Static142.aClass103Array23[4]);
				} else {
					Static453.method6694(arg3, arg2, local10, local526, local434, arg1, Static142.aClass103Array23[2]);
				}
			}
		}
		@Pc(676) Class118[] local676 = Static16.aClass118Array1;
		@Pc(762) int local762;
		for (local434 = 0; local434 < local676.length; local434++) {
			@Pc(684) Class118 local684 = local676[local434];
			if (local684 != null && local684.anInt3289 != 0 && Static304.anInt8391 % 20 < 10) {
				@Pc(726) int local726;
				if (local684.anInt3289 == 1) {
					@Pc(711) Class3_Sub43 local711 = (Class3_Sub43) Static545.aClass25_40.method426((long) local684.anInt3290);
					if (local711 != null) {
						@Pc(716) Class9_Sub2_Sub1_Sub2_Sub2 local716 = local711.aClass9_Sub2_Sub1_Sub2_Sub2_2;
						local726 = local716.anInt10152 / 128 - local52 / 128;
						local562 = local716.anInt10158 / 128 - local69 / 128;
						Static533.method1200(local726, 360000L, arg1, local562, arg3, local684.anInt3285, local10, arg2);
					}
				}
				if (local684.anInt3289 == 2) {
					local762 = local684.anInt3294 / 128 - local52 / 128;
					local530 = local684.anInt3288 / 128 - local69 / 128;
					@Pc(778) long local778 = (long) (local684.anInt3296 << 7);
					@Pc(782) long local782 = local778 * local778;
					Static533.method1200(local762, local782, arg1, local530, arg3, local684.anInt3285, local10, arg2);
				}
				if (local684.anInt3289 == 10 && local684.anInt3290 >= 0 && local684.anInt3290 < Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1.length) {
					@Pc(810) Class9_Sub2_Sub1_Sub2_Sub1 local810 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local684.anInt3290];
					if (local810 != null) {
						local530 = local810.anInt10152 / 128 - local52 / 128;
						local726 = local810.anInt10158 / 128 - local69 / 128;
						Static533.method1200(local530, 360000L, arg1, local726, arg3, local684.anInt3285, local10, arg2);
					}
				}
			}
		}
		if (Static471.anInt8064 == 4) {
			return;
		}
		if (Static162.anInt3235 != 0) {
			local526 = Static162.anInt3235 * 4 + (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() + -1) * 2 + 2 - local52 / 128;
			local762 = Static258.anInt5032 * 4 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() * 2 + 2 - local69 / 128 - 2;
			Static453.method6694(arg3, arg2, local10, local762, local526, arg1, Static431.aClass103Array17[Static309.aBoolean441 ? 1 : 0]);
		}
		if (!Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aBoolean77) {
			arg0.method6134(arg3.anInt9546 / 2 + arg2 - 1, 3, 3, -1, arg1 + arg3.anInt9602 / 2 - 1);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!uq;)V")
	public static void method3943(@OriginalArg(0) Class9_Sub2 arg0) {
		Static568.aClass82_14.H(arg0.anInt10152, arg0.anInt10154 + (arg0.method8613() >> 1), arg0.anInt10158, Static214.anIntArray237);
		arg0.anInt10157 = Static214.anIntArray237[0];
		arg0.anInt10155 = Static214.anIntArray237[1];
		arg0.anInt10151 = Static214.anIntArray237[2];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([ILclient!dw;III[I)Lclient!nw;")
	public static Class1_Sub1 method3944(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class82_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg3 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg3; local17++) {
			@Pc(27) int local27 = local17 * arg2 + arg4[local17];
			for (@Pc(29) int local29 = 0; local29 < arg0[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub1(arg1, arg2, arg3, local15);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3945(@OriginalArg(1) String arg0) {
		@Pc(6) Class3_Sub27 local6 = Static458.method6779();
		local6.aClass3_Sub9_Sub2_2.method5572(Static284.aClass126_12.anInt3445);
		local6.aClass3_Sub9_Sub2_2.method5620(0);
		@Pc(29) int local29 = local6.aClass3_Sub9_Sub2_2.anInt6453;
		local6.aClass3_Sub9_Sub2_2.method5620(641);
		@Pc(38) int[] local38 = Static196.method3128(local6);
		@Pc(42) int local42 = local6.aClass3_Sub9_Sub2_2.anInt6453;
		local6.aClass3_Sub9_Sub2_2.method5638(arg0);
		local6.aClass3_Sub9_Sub2_2.method5572(Static455.anInt7738);
		local6.aClass3_Sub9_Sub2_2.anInt6453 += 7;
		local6.aClass3_Sub9_Sub2_2.method5576(local6.aClass3_Sub9_Sub2_2.anInt6453, local38, local42);
		local6.aClass3_Sub9_Sub2_2.method5629(local6.aClass3_Sub9_Sub2_2.anInt6453 - local29);
		Static148.method2572(local6);
		Static32.anInt482 = -3;
		Static469.anInt8027 = 0;
		Static187.anInt3550 = 1;
		Static560.anInt9308 = 0;
	}
}
