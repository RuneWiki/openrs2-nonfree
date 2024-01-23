import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
	public static int anInt5314 = 0;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "[Lclient!jj;")
	public static Class69[] aClass69Array1 = new Class69[50];

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)[Lclient!ag;")
	public static Class7[] method4045() {
		@Pc(8) Class7[] local8 = new Class7[Static75.anInt2041];
		for (@Pc(10) int local10 = 0; local10 < Static75.anInt2041; local10++) {
			local8[local10] = new Class7_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local10], Static79.anIntArray165[local10], Static218.anIntArray382[local10], Static233.anIntArray438[local10], Static11.aByteArrayArray1[local10], Static102.anIntArray201);
		}
		Static259.method4155();
		return local8;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!qg;IIIIIIZ)V")
	public static void method4046(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray327.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray327[local5] - Static68.anInt1403;
			local20 = arg0.anIntArray330[local5] - Static24.anInt815;
			local27 = arg0.anIntArray326[local5] - Static112.anInt2954;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray331 != null) {
				Static192.anIntArray329[local5] = local37;
				Static192.anIntArray334[local5] = local59;
				Static192.anIntArray323[local5] = local69;
			}
			Static192.anIntArray336[local5] = Static235.anInt5119 + (local37 << 9) / local69;
			Static192.anIntArray332[local5] = Static235.anInt5117 + (local59 << 9) / local69;
		}
		Static235.anInt5120 = 0;
		local3 = arg0.anIntArray324.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray324[local13];
			local27 = arg0.anIntArray335[local13];
			local37 = arg0.anIntArray333[local13];
			@Pc(142) int local142 = Static192.anIntArray336[local20];
			@Pc(146) int local146 = Static192.anIntArray336[local27];
			@Pc(150) int local150 = Static192.anIntArray336[local37];
			@Pc(154) int local154 = Static192.anIntArray332[local20];
			@Pc(158) int local158 = Static192.anIntArray332[local27];
			@Pc(162) int local162 = Static192.anIntArray332[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static112.aBoolean162 && Static134.method2499(Static230.anInt5408 + Static235.anInt5119, Static134.anInt3303 + Static235.anInt5117, local154, local158, local162, local142, local146, local150)) {
					Static58.anInt1619 = arg5;
					Static266.anInt5559 = arg6;
				}
				if (!arg7) {
					Static235.aBoolean258 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static235.anInt5116 || local146 > Static235.anInt5116 || local150 > Static235.anInt5116) {
						Static235.aBoolean258 = true;
					}
					if (arg0.anIntArray331 == null || arg0.anIntArray331[local13] == -1) {
						if (arg0.anIntArray337[local13] != 12345678) {
							Static235.method3896(local154, local158, local162, local142, local146, local150, arg0.anIntArray337[local13], arg0.anIntArray328[local13], arg0.anIntArray325[local13]);
						}
					} else if (!Static140.aBoolean181) {
						@Pc(369) int local369 = Static235.anInterface1_1.method391(arg0.anIntArray331[local13]);
						Static235.method3896(local154, local158, local162, local142, local146, local150, Static170.method2959(local369, arg0.anIntArray337[local13]), Static170.method2959(local369, arg0.anIntArray328[local13]), Static170.method2959(local369, arg0.anIntArray325[local13]));
					} else if (arg0.aBoolean215) {
						Static235.method3911(local154, local158, local162, local142, local146, local150, arg0.anIntArray337[local13], arg0.anIntArray328[local13], arg0.anIntArray325[local13], Static192.anIntArray329[0], Static192.anIntArray329[1], Static192.anIntArray329[3], Static192.anIntArray334[0], Static192.anIntArray334[1], Static192.anIntArray334[3], Static192.anIntArray323[0], Static192.anIntArray323[1], Static192.anIntArray323[3], arg0.anIntArray331[local13]);
					} else {
						Static235.method3911(local154, local158, local162, local142, local146, local150, arg0.anIntArray337[local13], arg0.anIntArray328[local13], arg0.anIntArray325[local13], Static192.anIntArray329[local20], Static192.anIntArray329[local27], Static192.anIntArray329[local37], Static192.anIntArray334[local20], Static192.anIntArray334[local27], Static192.anIntArray334[local37], Static192.anIntArray323[local20], Static192.anIntArray323[local27], Static192.anIntArray323[local37], arg0.anIntArray331[local13]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!hc;I)I")
	public static int method4047(@OriginalArg(0) Class51 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method1868(Static30.anInt914)) {
			local1++;
		}
		if (arg0.method1868(Static210.anInt4599)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
	public static void method4048() {
		for (@Pc(13) Class1_Sub21 local13 = (Class1_Sub21) Static174.aClass3_17.method30(); local13 != null; local13 = (Class1_Sub21) Static174.aClass3_17.method33()) {
			if (local13.anInt4021 > 0) {
				local13.anInt4021--;
			}
			if (local13.anInt4021 != 0) {
				if (local13.anInt4026 > 0) {
					local13.anInt4026--;
				}
				if (local13.anInt4026 == 0 && local13.anInt4014 >= 1 && local13.anInt4015 >= 1 && local13.anInt4014 <= 102 && local13.anInt4015 <= 102 && (local13.anInt4031 < 0 || Static86.method1843(local13.anInt4019, local13.anInt4031))) {
					Static109.method2232(local13.anInt4025, local13.anInt4014, local13.anInt4015, local13.anInt4024, local13.anInt4019, local13.anInt4031, local13.anInt4033);
					local13.anInt4026 = -1;
					if (local13.anInt4017 == local13.anInt4031 && local13.anInt4017 == -1) {
						local13.method4186();
					} else if (local13.anInt4017 == local13.anInt4031 && local13.anInt4023 == local13.anInt4033 && local13.anInt4020 == local13.anInt4019) {
						local13.method4186();
					}
				}
			} else if (local13.anInt4017 < 0 || Static86.method1843(local13.anInt4020, local13.anInt4017)) {
				Static109.method2232(local13.anInt4025, local13.anInt4014, local13.anInt4015, local13.anInt4024, local13.anInt4020, local13.anInt4017, local13.anInt4023);
				local13.method4186();
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
	public static void method4049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 * Static106.anInt2847 >> 8;
		if (local13 != 0 && arg0 != -1) {
			Static262.method4184(Static218.aClass51_71, arg0, local13);
			Static1.aBoolean1 = true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V")
	public static void method4050() {
		if (Static158.aFloat32 < 128.0F) {
			Static158.aFloat32 = 128.0F;
		}
		@Pc(15) int local15 = Static57.anInt1583 >> 7;
		if (Static158.aFloat32 > 383.0F) {
			Static158.aFloat32 = 383.0F;
		}
		@Pc(25) int local25 = Static81.anInt2193 >> 7;
		while (Static230.aFloat51 >= 2048.0F) {
			Static230.aFloat51 -= 2048.0F;
		}
		while (Static230.aFloat51 < 0.0F) {
			Static230.aFloat51 += 2048.0F;
		}
		@Pc(59) int local59 = 0;
		@Pc(65) int local65 = Static200.method3326(Static137.anInt3321, Static81.anInt2193, Static57.anInt1583);
		@Pc(83) int local83;
		if (local15 > 3 && local25 > 3 && local15 < 100 && local25 < 100) {
			for (local83 = local15 - 4; local83 <= local15 + 4; local83++) {
				for (@Pc(89) int local89 = local25 - 4; local89 <= local25 + 4; local89++) {
					@Pc(93) int local93 = Static137.anInt3321;
					if (local93 < 3 && (Static145.aByteArrayArrayArray13[1][local83][local89] & 0x2) == 2) {
						local93++;
					}
					@Pc(135) int local135 = local65 + (Static144.aByteArrayArrayArray12[local93][local83][local89] & 0xFF) * 8 - Static38.anIntArrayArrayArray6[local93][local83][local89];
					if (local59 < local135) {
						local59 = local135;
					}
				}
			}
		}
		local83 = local59 * 192;
		if (local83 > 98048) {
			local83 = 98048;
		}
		if (local83 < 32768) {
			local83 = 32768;
		}
		if (local83 > Static257.anInt5461) {
			Static257.anInt5461 += (local83 - Static257.anInt5461) / 24;
		} else if (Static257.anInt5461 > local83) {
			Static257.anInt5461 += (local83 - Static257.anInt5461) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method4051(@OriginalArg(1) Class1_Sub4 arg0) {
		if (arg0.aClass1_Sub7_5 != null) {
			arg0.aClass1_Sub7_5.anInt1532 = 0;
		}
		arg0.aBoolean201 = false;
		for (@Pc(26) Class1_Sub4 local26 = arg0.method3073(); local26 != null; local26 = arg0.method3075()) {
			method4051(local26);
		}
	}
}
