import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "[Lclient!oi;")
	public static Class41_Sub3_Sub1_Sub1[] aClass41_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!sn", name = "D", descriptor = "B")
	public static byte aByte108;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_61 = new Class6(128, 4);

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "[I")
	public static final int[] anIntArray512 = new int[8];

	@OriginalMember(owner = "client!sn", name = "F", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_159 = new Class56(55, 7);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBII[B)V")
	public static void method6662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg3 > 0 && !Static259.method3984(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3984(arg2)) {
			@Pc(36) int local36 = Static367.method5385(arg0);
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) byte[] local59 = arg5;
			@Pc(71) byte[] local71 = new byte[local36 * local57 * local53];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local38, arg1, arg3, arg2, 0, arg0, 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(90) int local90 = local36 * arg3;
				@Pc(92) byte[] local92 = local71;
				for (@Pc(94) int local94 = 0; local94 < local36; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local90 + local94;
					for (@Pc(106) int local106 = 0; local106 < local57; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local53; local110++) {
							@Pc(116) byte local116 = local59[local100];
							local100 += local36;
							@Pc(126) int local126 = local116 + local59[local100];
							local100 += local36;
							@Pc(136) int local136 = local126 + local59[local104];
							local104 += local36;
							@Pc(146) int local146 = local136 + local59[local104];
							local104 += local36;
							local71[local98] = (byte) (local146 >> 2);
							local98 += local36;
						}
						local104 += local90;
						local100 += local90;
					}
				}
				local71 = local59;
				arg2 = local57;
				local59 = local92;
				arg3 = local53;
				local57 >>= 0x1;
				local49 >>= 0x1;
				local38++;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method6663() {
		@Pc(9) int local9 = Static413.anInt7051 * 512 + 256;
		@Pc(15) int local15 = Static92.anInt1927 * 512 + 256;
		@Pc(24) int local24 = Static475.method6537(local15, Static117.anInt2694, local9) - Static515.anInt3055;
		if (Static257.anInt4538 >= 100) {
			Static350.anInt6080 = Static92.anInt1927 * 512 + 256;
			Static226.anInt3984 = Static413.anInt7051 * 512 + 256;
			Static461.anInt7704 = Static475.method6537(Static350.anInt6080, Static117.anInt2694, Static226.anInt3984) - Static515.anInt3055;
		} else {
			if (local9 > Static226.anInt3984) {
				Static226.anInt3984 += (local9 - Static226.anInt3984) * Static257.anInt4538 / 1000 + Static254.anInt4507;
				if (Static226.anInt3984 > local9) {
					Static226.anInt3984 = local9;
				}
			}
			if (Static461.anInt7704 < local24) {
				Static461.anInt7704 += Static254.anInt4507 + Static257.anInt4538 * (local24 - Static461.anInt7704) / 1000;
				if (local24 < Static461.anInt7704) {
					Static461.anInt7704 = local24;
				}
			}
			if (local9 < Static226.anInt3984) {
				Static226.anInt3984 -= Static254.anInt4507 + Static257.anInt4538 * (Static226.anInt3984 - local9) / 1000;
				if (Static226.anInt3984 < local9) {
					Static226.anInt3984 = local9;
				}
			}
			if (local24 < Static461.anInt7704) {
				Static461.anInt7704 -= Static254.anInt4507 + Static257.anInt4538 * (Static461.anInt7704 - local24) / 1000;
				if (Static461.anInt7704 < local24) {
					Static461.anInt7704 = local24;
				}
			}
			if (local15 > Static350.anInt6080) {
				Static350.anInt6080 += (local15 - Static350.anInt6080) * Static257.anInt4538 / 1000 + Static254.anInt4507;
				if (Static350.anInt6080 > local15) {
					Static350.anInt6080 = local15;
				}
			}
			if (Static350.anInt6080 > local15) {
				Static350.anInt6080 -= Static254.anInt4507 + (Static350.anInt6080 - local15) * Static257.anInt4538 / 1000;
				if (local15 > Static350.anInt6080) {
					Static350.anInt6080 = local15;
				}
			}
		}
		local9 = Static379.anInt6484 * 512 + 256;
		local15 = Static399.anInt6956 * 512 + 256;
		local24 = Static475.method6537(local15, Static117.anInt2694, local9) - Static351.anInt6111;
		@Pc(234) int local234 = local9 - Static226.anInt3984;
		@Pc(238) int local238 = local24 - Static461.anInt7704;
		@Pc(243) int local243 = local15 - Static350.anInt6080;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local243 * local243 + local234 * local234));
		@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		@Pc(281) int local281 = (int) (Math.atan2((double) local234, (double) local243) * -2607.5945876176133D) & 0x3FFF;
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (local265 > Static494.anInt8029) {
			Static494.anInt8029 += Static562.anInt9174 * (local265 - Static494.anInt8029 >> 3) / 1000 + Static477.anInt7888 << 3;
			if (local265 < Static494.anInt8029) {
				Static494.anInt8029 = local265;
			}
		}
		if (local265 < Static494.anInt8029) {
			Static494.anInt8029 -= Static477.anInt7888 + Static562.anInt9174 * (Static494.anInt8029 - local265 >> 3) / 1000 << 3;
			if (Static494.anInt8029 < local265) {
				Static494.anInt8029 = local265;
			}
		}
		@Pc(354) int local354 = local281 - Static333.anInt5565;
		if (local354 > 8192) {
			local354 -= 16384;
		}
		if (local354 < -8192) {
			local354 += 16384;
		}
		local354 >>= 0x3;
		if (local354 > 0) {
			Static333.anInt5565 += Static477.anInt7888 + Static562.anInt9174 * local354 / 1000 << 3;
			Static333.anInt5565 &= 0x3FFF;
		}
		if (local354 < 0) {
			Static333.anInt5565 -= Static477.anInt7888 + -local354 * Static562.anInt9174 / 1000 << 3;
			Static333.anInt5565 &= 0x3FFF;
		}
		@Pc(413) int local413 = local281 - Static333.anInt5565;
		if (local413 > 8192) {
			local413 -= 16384;
		}
		if (local413 < -8192) {
			local413 += 16384;
		}
		if (local413 < 0 && local354 > 0 || local413 > 0 && local354 < 0) {
			Static333.anInt5565 = local281;
		}
		Static208.anInt3801 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public static void method6665() {
		if (Static27.aClass272_7 != Static516.aClass272_11) {
			try {
				Static600.method2617("tbrefresh", Static308.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIBIZI)Z")
	public static boolean method6667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0];
		@Pc(21) int local21 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0];
		if (local8 < 0 || Static54.anInt1038 <= local8 || local21 < 0 || Static140.anInt3026 <= local21) {
			return false;
		} else if (arg5 >= 0 && Static54.anInt1038 > arg5 && arg7 >= 0 && Static140.anInt3026 > arg7) {
			@Pc(74) int local74 = Static92.method1744(arg7, Static252.anIntArray240, arg1, arg0, Static67.anIntArray66, arg6, arg2, Static460.aClass169Array3[Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117], Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858(), local8, local21, arg5, arg3, arg4);
			if (local74 < 1) {
				return false;
			}
			Static551.anInt8768 = Static252.anIntArray240[local74 - 1];
			Static125.anInt2831 = Static67.anIntArray66[local74 - 1];
			Static542.aBoolean666 = false;
			Static293.method3983();
			return true;
		} else {
			return false;
		}
	}
}
