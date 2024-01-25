import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!za;BILclient!at;I)V")
	public static void method4758(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class35 local18 = arg2.method239(arg0);
		if (local18 == null) {
			return;
		}
		arg0.ba(arg3, arg1, arg3 + arg2.anInt294, arg2.anInt285 + arg1);
		if (Static288.anInt4731 == 2 || Static288.anInt4731 == 5 || Static137.aClass13_22 == null) {
			arg0.ra(-16777216, local18, arg3, arg1);
			return;
		}
		@Pc(47) int local47;
		@Pc(55) int local55;
		@Pc(53) int local53;
		@Pc(57) int local57;
		if (Static414.anInt6776 == 4) {
			local47 = Static294.anInt1008;
			local53 = (int) -Static113.aFloat19 & 0x3FFF;
			local55 = Static136.anInt2424;
			local57 = 4096;
		} else {
			local47 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
			local57 = 4096 - Static454.anInt7274 * 16;
			local55 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
			local53 = Static363.anInt6120 + (int) -Static113.aFloat19 & 0x3FFF;
		}
		@Pc(93) int local93 = local47 / 32 + 48 - (Static166.anInt2852 + -104) * 2;
		@Pc(111) int local111 = Static426.anInt6923 * 4 + 48 - (Static426.anInt6923 - 104) * 2 - local55 / 32;
		Static137.aClass13_22.method5664((float) arg3 + (float) arg2.anInt294 / 2.0F, (float) arg2.anInt285 / 2.0F + (float) arg1, (float) local93, (float) local111, local57, local53 << 2, local18, arg3, arg1);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class2_Sub20 local145 = (Class2_Sub20) Static289.aClass156_37.method3155(); local145 != null; local145 = (Class2_Sub20) Static289.aClass156_37.method3150()) {
			@Pc(150) int local150 = local145.anInt2212;
			local162 = (Static171.aClass67_1.anIntArray144[local150] >> 14 & 0x3FFF) - Static275.anInt4506;
			local172 = (Static171.aClass67_1.anIntArray144[local150] & 0x3FFF) - Static209.anInt3497;
			local183 = local162 * 4 + 2 - local47 / 32;
			local194 = local172 * 4 + 2 - local55 / 32;
			Static377.method3544(Static171.aClass67_1.anIntArray143[local150], local18, local183, arg0, arg3, local194, arg1, arg2);
		}
		for (local162 = 0; local162 < Static98.anInt1865; local162++) {
			local172 = Static334.anIntArray497[local162] * 4 + 2 - local47 / 32;
			local183 = Static404.anIntArray554[local162] * 4 + 2 - local55 / 32;
			@Pc(250) Class192 local250 = Static50.aClass190_1.method4218(Static284.anIntArray397[local162]);
			if (local250.anIntArray434 != null) {
				local250 = local250.method4228(Static138.aClass268_1);
				if (local250 == null || local250.anInt5318 == -1) {
					continue;
				}
			}
			Static377.method3544(local250.anInt5318, local18, local172, arg0, arg3, local183, arg1, arg2);
		}
		@Pc(339) int local339;
		@Pc(349) int local349;
		for (@Pc(291) Class2_Sub12 local291 = (Class2_Sub12) Static201.aClass72_21.method1655(); local291 != null; local291 = (Class2_Sub12) Static201.aClass72_21.method1649()) {
			local183 = (int) (local291.aLong225 >> 28 & 0x3L);
			if (local183 == Static445.anInt7140) {
				local194 = (int) (local291.aLong225 & 0x3FFFL) - Static275.anInt4506;
				@Pc(328) int local328 = (int) (local291.aLong225 >> 14 & 0x3FFFL) - Static209.anInt3497;
				local339 = local194 * 4 + 2 - local47 / 32;
				local349 = local328 * 4 + 2 - local55 / 32;
				Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[0], local339, local349, arg1);
			}
		}
		@Pc(439) int local439;
		for (local183 = 0; local183 < Static351.anInt5969; local183++) {
			@Pc(380) Class2_Sub28 local380 = (Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local183]);
			if (local380 != null) {
				@Pc(385) Class3_Sub4_Sub1_Sub1 local385 = local380.aClass3_Sub4_Sub1_Sub1_1;
				if (local385.method2633() && Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 == local385.aByte91) {
					@Pc(401) Class245 local401 = local385.aClass245_1;
					if (local401 != null && local401.anIntArray560 != null) {
						local401 = local401.method5205(Static138.aClass268_1);
					}
					if (local401 != null && local401.aBoolean478 && local401.aBoolean476) {
						local349 = local385.anInt6833 / 32 - local47 / 32;
						local439 = local385.anInt6835 / 32 - local55 / 32;
						if (local401.anInt6699 == -1) {
							Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[1], local349, local439, arg1);
						} else {
							Static377.method3544(local401.anInt6699, local18, local349, arg0, arg3, local439, arg1, arg2);
						}
					}
				}
			}
		}
		local194 = Static119.anInt2204;
		@Pc(479) int[] local479 = Static200.anIntArray295;
		@Pc(523) int local523;
		@Pc(527) int local527;
		@Pc(556) int local556;
		for (local339 = 0; local339 < local194; local339++) {
			@Pc(489) Class3_Sub4_Sub1_Sub2 local489 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local479[local339]];
			if (local489 != null && local489.method4016() && Static60.aClass3_Sub4_Sub1_Sub2_1 != local489 && local489.aByte91 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) {
				local439 = local489.anInt6833 / 32 - local47 / 32;
				local523 = local489.anInt6835 / 32 - local55 / 32;
				@Pc(525) boolean local525 = false;
				for (local527 = 0; local527 < Static209.anInt3494; local527++) {
					if (local489.aString148.equals(Static290.aStringArray29[local527]) && Static158.anIntArray186[local527] != 0) {
						local525 = true;
						break;
					}
				}
				@Pc(554) boolean local554 = false;
				for (local556 = 0; local556 < Static173.anInt6618; local556++) {
					if (local489.aString148.equals(Static46.aClass237Array1[local556].aString181)) {
						local554 = true;
						break;
					}
				}
				@Pc(580) boolean local580 = false;
				if (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4982 != 0 && local489.anInt4982 != 0 && Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4982 == local489.anInt4982) {
					local580 = true;
				}
				if (local489.aBoolean358) {
					Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[6], local439, local523, arg1);
				} else if (local525) {
					Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[3], local439, local523, arg1);
				} else if (local554) {
					Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[5], local439, local523, arg1);
				} else if (local580) {
					Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[4], local439, local523, arg1);
				} else {
					Static30.method455(local18, arg2, arg3, Static415.aClass13Array22[2], local439, local523, arg1);
				}
			}
		}
		@Pc(682) Class185[] local682 = Static186.aClass185Array5;
		@Pc(768) int local768;
		for (local439 = 0; local439 < local682.length; local439++) {
			@Pc(690) Class185 local690 = local682[local439];
			if (local690 != null && local690.anInt4814 != 0 && Static266.anInt4392 % 20 < 10) {
				@Pc(732) int local732;
				if (local690.anInt4814 == 1) {
					@Pc(717) Class2_Sub28 local717 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local690.anInt4822);
					if (local717 != null) {
						@Pc(722) Class3_Sub4_Sub1_Sub1 local722 = local717.aClass3_Sub4_Sub1_Sub1_1;
						local732 = local722.anInt6833 / 32 - local47 / 32;
						local556 = local722.anInt6835 / 32 - local55 / 32;
						Static166.method2339(local18, 360000L, local556, arg1, local732, arg3, local690.anInt4818, arg2);
					}
				}
				if (local690.anInt4814 == 2) {
					local768 = local690.anInt4813 / 32 - local47 / 32;
					local527 = local690.anInt4816 / 32 - local55 / 32;
					@Pc(784) long local784 = (long) (local690.anInt4821 << 5);
					@Pc(788) long local788 = local784 * local784;
					Static166.method2339(local18, local788, local527, arg1, local768, arg3, local690.anInt4818, arg2);
				}
				if (local690.anInt4814 == 10 && local690.anInt4822 >= 0 && Static152.aClass3_Sub4_Sub1_Sub2Array1.length > local690.anInt4822) {
					@Pc(825) Class3_Sub4_Sub1_Sub2 local825 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local690.anInt4822];
					if (local825 != null) {
						local527 = local825.anInt6833 / 32 - local47 / 32;
						local732 = local825.anInt6835 / 32 - local55 / 32;
						Static166.method2339(local18, 360000L, local732, arg1, local527, arg3, local690.anInt4818, arg2);
					}
				}
			}
		}
		if (Static414.anInt6776 == 4) {
			return;
		}
		if (Static233.anInt6980 != 0) {
			local523 = Static233.anInt6980 * 4 + Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() * 2 - local47 / 32;
			local768 = Static333.anInt5631 * 4 + Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() * 2 + 2 - local55 / 32 - 2;
			Static30.method455(local18, arg2, arg3, Static65.aClass13Array3[Static426.aBoolean501 ? 1 : 0], local523, local768, arg1);
		}
		arg0.method5545(3, -1, 3, arg2.anInt285 / 2 + arg1 - 1, arg3 + arg2.anInt294 / 2 + -1);
		return;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!mk;I)V")
	public static void method4759(@OriginalArg(0) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int arg2) {
		Static411.aClass159ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method4760() {
		if (Static452.aBoolean525) {
			Static126.aClass13_4 = null;
			Static220.aClass13_13 = null;
			Static452.aBoolean525 = false;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)S")
	public static short method4761(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(46) int local46 = local24 + local41;
		@Pc(55) int local55;
		if (local46 == 0) {
			local55 = local41 << 1;
		} else {
			local55 = (local41 << 8) / local46;
		}
		return (short) (local46 | local9 << 10 | local55 >> 4 << 7);
	}
}
