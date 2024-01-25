import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt5151 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
	public static void method4615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg1, 8);
		local8.method850();
		local8.anInt994 = arg2;
		local8.anInt996 = arg3;
		local8.anInt991 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)Lclient!vg;")
	public static Class201 method4616(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static304.aClass201ArrayArray1[local7] == null || Static304.aClass201ArrayArray1[local7][local17] == null) {
			@Pc(31) boolean local31 = Static92.method1683(local7);
			if (!local31) {
				return null;
			}
		}
		return Static304.aClass201ArrayArray1[local7][local17];
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!of;)V")
	public static void method4617(@OriginalArg(1) Class4_Sub5_Sub2_Sub1 arg0) {
		if (Static160.anInt3181 >= 400 || arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2) {
			return;
		}
		@Pc(39) String local39;
		@Pc(83) int local83;
		if (arg0.anInt4547 == 0) {
			@Pc(42) boolean local42 = true;
			if (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4563 != -1 && arg0.anInt4563 != -1) {
				@Pc(62) int local62 = arg0.anInt4566 >= Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566 ? arg0.anInt4566 : Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566;
				@Pc(73) int local73 = arg0.anInt4563 <= Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4563 ? arg0.anInt4563 : Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4563;
				local83 = local62 * 10 / 100 + local73 + 5;
				@Pc(89) int local89 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566 - arg0.anInt4566;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local89 > local83) {
					local42 = false;
				}
			}
			@Pc(114) String local114 = Static111.anInt2077 == 1 ? Static235.aClass85_107.method2020(Static41.anInt726) : Static160.aClass85_74.method2020(Static41.anInt726);
			if (arg0.anInt4566 >= arg0.anInt4544) {
				local39 = arg0.method4121() + (local42 ? Static318.method5545(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566, arg0.anInt4566) : "<col=ffffff>") + " (" + local114 + arg0.anInt4566 + ")";
			} else {
				local39 = arg0.method4121() + (local42 ? Static318.method5545(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566, arg0.anInt4566) : "<col=ffffff>") + " (" + local114 + arg0.anInt4566 + "+" + (arg0.anInt4544 - arg0.anInt4566) + ")";
			}
		} else {
			local39 = arg0.method4121() + " (" + Static10.aClass85_8.method2020(Static41.anInt726) + arg0.anInt4547 + ")";
		}
		if (!Static54.aBoolean72) {
			for (@Pc(224) int local224 = 7; local224 >= 0; local224--) {
				if (Static31.aStringArray9[local224] != null) {
					@Pc(231) short local231 = 0;
					if (Static111.anInt2077 == 0 && Static31.aStringArray9[local224].equalsIgnoreCase(Static313.aClass85_129.method2020(Static41.anInt726))) {
						if (arg0.anInt4566 > Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566) {
							local231 = 2000;
						}
						if (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4575 != 0 && arg0.anInt4575 != 0) {
							if (arg0.anInt4575 == Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4575) {
								local231 = 2000;
							} else {
								local231 = 0;
							}
						}
					} else if (Static52.aBooleanArray6[local224]) {
						local231 = 2000;
					}
					@Pc(289) short local289 = (short) (local231 + Static320.aShortArray109[local224]);
					local83 = Static30.anIntArray68[local224] == -1 ? Static314.anInt6099 : Static30.anIntArray68[local224];
					Static30.method540(Static31.aStringArray9[local224], local289, 0, (long) arg0.anInt5386, 0, local83, "<col=ffffff>" + local39);
				}
			}
		} else if ((Static5.anInt93 & 0x8) != 0) {
			Static30.method540(Static255.aString49, 17, 0, (long) arg0.anInt5386, 0, Static169.anInt6216, Static230.aString42 + " -> <col=ffffff>" + local39);
		}
		for (@Pc(334) Class5_Sub20 local334 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local334 != null; local334 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			if (local334.anInt2094 == 13) {
				local334.aString13 = "<col=ffffff>" + local39;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)I")
	public static int method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(24) int local24 = 128 - arg1;
		@Pc(38) int local38 = arg1 * (arg2 & 0x7F) + local24 * (arg0 & 0x7F) >> 7;
		@Pc(53) int local53 = (arg0 & 0x380) * local24 + (arg2 & 0x380) * arg1 >> 7;
		@Pc(67) int local67 = (arg0 & 0xFC00) * local24 + arg1 * (arg2 & 0xFC00) >> 7;
		return local53 & 0x380 | local67 & 0xFC00 | local38 & 0x7F;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IILclient!of;[I[I)V")
	public static void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class4_Sub5_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) int local16 = 0; local16 < arg3.length; local16++) {
			@Pc(22) int local22 = arg3[local16];
			@Pc(26) int local26 = arg2[local16];
			@Pc(30) int local30 = arg0[local16];
			@Pc(32) int local32 = 0;
			while (local26 != 0 && local32 < arg1.aClass193Array3.length) {
				if ((local26 & 0x1) != 0) {
					if (local22 == -1) {
						arg1.aClass193Array3[local32] = null;
					} else {
						@Pc(55) Class89 local55 = Static162.method2849(local22);
						@Pc(58) int local58 = local55.anInt2468;
						@Pc(63) Class193 local63 = arg1.aClass193Array3[local32];
						if (local63 != null) {
							if (local63.anInt6179 == local22) {
								if (local58 == 0) {
									local63 = arg1.aClass193Array3[local32] = null;
								} else if (local58 == 1) {
									local63.anInt6182 = 0;
									local63.anInt6181 = 0;
									local63.anInt6178 = 1;
									local63.anInt6184 = local30;
									local63.anInt6177 = 0;
									Static311.method3258(local55, arg1.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg1, 0, arg1.anInt6632);
								} else if (local58 == 2) {
									local63.anInt6181 = 0;
								}
							} else if (local55.anInt2465 >= Static162.method2849(local63.anInt6179).anInt2465) {
								local63 = arg1.aClass193Array3[local32] = null;
							}
						}
						if (local63 == null) {
							local63 = arg1.aClass193Array3[local32] = new Class193();
							local63.anInt6184 = local30;
							local63.anInt6177 = 0;
							local63.anInt6178 = 1;
							local63.anInt6181 = 0;
							local63.anInt6182 = 0;
							local63.anInt6179 = local22;
							Static311.method3258(local55, arg1.anInt6631, arg1 == Static192.aClass4_Sub5_Sub2_Sub1_2, 0, arg1.anInt6632);
						}
					}
				}
				local32++;
				local26 >>>= 0x1;
			}
		}
	}
}
