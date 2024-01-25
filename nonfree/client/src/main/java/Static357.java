import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!ad;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!ik;")
	public static Class122 aClass122_3;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "[Lclient!an;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!up;")
	public static final Class250 aClass250_18 = new Class250(6, 7);

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public static int anInt5911 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ya;Lclient!hd;III)V")
	public static void method4710(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class71 local10 = arg1.method2064(arg0);
		if (local10 == null) {
			return;
		}
		arg0.OA(arg3, arg2, arg3 + arg1.anInt2617, arg2 - -arg1.anInt2590);
		if (Static387.anInt6335 == 2 || Static387.anInt6335 == 5 || Static224.aClass95_11 == null) {
			arg0.ca(-16777216, local10, arg3, arg2);
			return;
		}
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(65) int local65;
		@Pc(59) int local59;
		if (Static97.anInt1791 == 4) {
			local59 = 4096;
			local65 = (int) -Static109.aFloat75 & 0x3FFF;
			local67 = Static190.anInt3490;
			local69 = Static212.anInt3693;
		} else {
			local65 = (int) -Static109.aFloat75 + Static35.anInt575 & 0x3FFF;
			local69 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
			local67 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
			local59 = 4096 - Static380.anInt6188 * 16;
		}
		@Pc(106) int local106 = local67 / 32 + 48 - (Static337.anInt5497 + -104) * 2;
		@Pc(125) int local125 = Static282.anInt4644 * 4 + 48 - local69 / 32 - (Static282.anInt4644 + -104) * 2;
		Static224.aClass95_11.method5828((float) arg3 + (float) arg1.anInt2617 / 2.0F, (float) arg1.anInt2590 / 2.0F + (float) arg2, (float) local106, (float) local125, local59, local65 << 2, local10, arg3, arg2);
		@Pc(178) int local178;
		@Pc(188) int local188;
		@Pc(199) int local199;
		@Pc(210) int local210;
		for (@Pc(161) Class4_Sub24 local161 = (Class4_Sub24) Static259.aClass244_22.method5263(); local161 != null; local161 = (Class4_Sub24) Static259.aClass244_22.method5271()) {
			@Pc(166) int local166 = local161.anInt4057;
			local178 = (Static337.aClass11_2.anIntArray7[local166] >> 14 & 0x3FFF) - Static365.anInt6047;
			local188 = (Static337.aClass11_2.anIntArray7[local166] & 0x3FFF) - Static366.anInt6052;
			local199 = local178 * 4 + 2 - local67 / 32;
			local210 = local188 * 4 + 2 - local69 / 32;
			Static58.method821(Static337.aClass11_2.anIntArray9[local166], local199, arg3, local10, arg2, arg1, arg0, local210);
		}
		for (local178 = 0; local178 < Static248.anInt4505; local178++) {
			local188 = Static361.anIntArray51[local178] * 4 + 2 - local67 / 32;
			local199 = Static102.anIntArray140[local178] * 4 + 2 - local69 / 32;
			@Pc(266) Class114 local266 = Static51.aClass151_1.method2917(Static170.anIntArray553[local178]);
			if (local266.anIntArray235 != null) {
				local266 = local266.method2181(Static52.aClass81_1);
				if (local266 == null || local266.anInt2845 == -1) {
					continue;
				}
			}
			Static58.method821(local266.anInt2845, local188, arg3, local10, arg2, arg1, arg0, local199);
		}
		for (@Pc(305) Class4_Sub6 local305 = (Class4_Sub6) Static41.aClass67_2.method1428(); local305 != null; local305 = (Class4_Sub6) Static41.aClass67_2.method1424()) {
			local199 = (int) (local305.aLong227 >> 28 & 0x3L);
			if (Static254.anInt4209 == local199) {
				local210 = (int) (local305.aLong227 & 0x3FFFL) * 4 + 2 - local67 / 32;
				@Pc(354) int local354 = (int) (local305.aLong227 >> 14 & 0x3FFFL) * 4 + 2 - local69 / 32;
				Static119.method4570(arg2, local210, local10, Static44.aClass95Array2[0], arg3, local354, arg1);
			}
		}
		@Pc(428) int local428;
		for (local199 = 0; local199 < Static148.anInt2692; local199++) {
			@Pc(382) Class8_Sub3_Sub1_Sub2 local382 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local199]];
			if (local382 != null && local382.method5910() && Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local382.aByte99) {
				@Pc(400) Class78 local400 = local382.aClass78_1;
				if (local400 != null && local400.anIntArray145 != null) {
					local400 = local400.method1547(Static52.aClass81_1);
				}
				if (local400 != null && local400.aBoolean134 && local400.lb) {
					local428 = local382.anInt7339 / 32 - local67 / 32;
					@Pc(438) int local438 = local382.anInt7343 / 32 - local69 / 32;
					if (local400.anInt1887 == -1) {
						Static119.method4570(arg2, local428, local10, Static44.aClass95Array2[1], arg3, local438, arg1);
					} else {
						Static58.method821(local400.anInt1887, local428, arg3, local10, arg2, arg1, arg0, local438);
					}
				}
			}
		}
		local210 = Static438.anInt2796;
		@Pc(475) int[] local475 = Static78.anIntArray114;
		@Pc(513) int local513;
		@Pc(522) int local522;
		@Pc(526) int local526;
		for (local428 = 0; local428 < local210; local428++) {
			@Pc(485) Class8_Sub3_Sub1_Sub1 local485 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local475[local428]];
			if (local485 != null && local485.method4562() && Static401.aClass8_Sub3_Sub1_Sub1_2 != local485 && local485.aByte99 == Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99) {
				local513 = local485.anInt7339 / 32 - local67 / 32;
				local522 = local485.anInt7343 / 32 - local69 / 32;
				@Pc(524) boolean local524 = false;
				for (local526 = 0; local526 < Static284.anInt4659; local526++) {
					if (local485.aString60.equals(Static322.aStringArray36[local526]) && Static63.anIntArray454[local526] != 0) {
						local524 = true;
						break;
					}
				}
				@Pc(553) boolean local553 = false;
				for (@Pc(555) int local555 = 0; local555 < Static87.anInt1666; local555++) {
					if (local485.aString60.equals(Static404.aClass130Array1[local555].aString28)) {
						local553 = true;
						break;
					}
				}
				@Pc(575) boolean local575 = false;
				if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5665 != 0 && local485.anInt5665 != 0 && Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5665 == local485.anInt5665) {
					local575 = true;
				}
				if (local485.aBoolean399) {
					Static119.method4570(arg2, local513, local10, Static44.aClass95Array2[6], arg3, local522, arg1);
				} else if (local524) {
					Static119.method4570(arg2, local513, local10, Static44.aClass95Array2[3], arg3, local522, arg1);
				} else if (local553) {
					Static119.method4570(arg2, local513, local10, Static44.aClass95Array2[5], arg3, local522, arg1);
				} else if (local575) {
					Static119.method4570(arg2, local513, local10, Static44.aClass95Array2[4], arg3, local522, arg1);
				} else {
					Static119.method4570(arg2, local513, local10, Static44.aClass95Array2[2], arg3, local522, arg1);
				}
			}
		}
		@Pc(674) Class133[] local674 = Static62.aClass133Array1;
		@Pc(765) int local765;
		for (local513 = 0; local513 < local674.length; local513++) {
			@Pc(682) Class133 local682 = local674[local513];
			if (local682 != null && local682.anInt3345 != 0 && Static265.anInt4371 % 20 < 10) {
				@Pc(739) int local739;
				if (local682.anInt3345 == 1 && local682.anInt3347 >= 0 && local682.anInt3347 < Static367.aClass8_Sub3_Sub1_Sub2Array1.length) {
					@Pc(717) Class8_Sub3_Sub1_Sub2 local717 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local682.anInt3347];
					if (local717 != null) {
						local526 = local717.anInt7339 / 32 - local67 / 32;
						local739 = local717.anInt7343 / 32 - local69 / 32;
						Static372.method4895(local10, arg2, local526, local682.anInt3343, arg1, 360000L, local739, arg3);
					}
				}
				if (local682.anInt3345 == 2) {
					local765 = local682.anInt3344 / 32 - local67 / 32;
					local526 = local682.anInt3340 / 32 - local69 / 32;
					@Pc(780) long local780 = (long) (local682.anInt3341 << 5);
					@Pc(784) long local784 = local780 * local780;
					Static372.method4895(local10, arg2, local765, local682.anInt3343, arg1, local784, local526, arg3);
				}
				if (local682.anInt3345 == 10 && local682.anInt3347 >= 0 && Static267.aClass8_Sub3_Sub1_Sub1Array1.length > local682.anInt3347) {
					@Pc(815) Class8_Sub3_Sub1_Sub1 local815 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local682.anInt3347];
					if (local815 != null) {
						local526 = local815.anInt7339 / 32 - local67 / 32;
						local739 = local815.anInt7343 / 32 - local69 / 32;
						Static372.method4895(local10, arg2, local526, local682.anInt3343, arg1, 360000L, local739, arg3);
					}
				}
			}
		}
		if (Static97.anInt1791 == 4) {
			return;
		}
		if (Static363.anInt5531 != 0) {
			local522 = Static363.anInt5531 * 4 + (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() + -1) * 2 + 2 - local67 / 32;
			local765 = Static25.anInt375 * 4 + (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() + -1) * 2 + 2 - local69 / 32;
			Static119.method4570(arg2, local522, local10, Static366.aClass95Array13[Static435.aBoolean509 ? 1 : 0], arg3, local765, arg1);
		}
		arg0.method5394(3, arg3 + arg1.anInt2617 / 2 - 1, 3, arg2 + arg1.anInt2590 / 2 - 1, -1);
	}
}
