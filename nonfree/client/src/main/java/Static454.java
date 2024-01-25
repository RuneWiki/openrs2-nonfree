import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V")
	public static void method6006(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0, 21);
		local14.method9260();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!rw;I)V")
	public static void method6007(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(15) Class3_Sub56 local15 = (Class3_Sub56) Static420.aClass342_49.method7644(); local15 != null; local15 = (Class3_Sub56) Static420.aClass342_49.method7650()) {
			if (arg0 == local15.aClass9_Sub1_Sub1_Sub2_Sub2_3) {
				if (local15.aClass3_Sub33_Sub5_1 != null) {
					Static391.aClass3_Sub33_Sub4_1.method8544(local15.aClass3_Sub33_Sub5_1);
					local15.aClass3_Sub33_Sub5_1 = null;
				}
				local15.method9596();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method6013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static376.method5111(arg0, 0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public static void method6016() {
		if (Static77.anInt1736 <= 0) {
			Static689.aString129 = "";
			return;
		}
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static547.aStringArray37.length; local17++) {
			if (Static547.aStringArray37[local17].indexOf("--> ") != -1) {
				local15++;
				if (local15 == Static77.anInt1736) {
					Static689.aString129 = Static547.aStringArray37[local17].substring(Static547.aStringArray37[local17].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I")
	public static int method6020(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local62 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(188) int local188 = (int) (local68 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local167 >>= 0x4;
		} else if (local188 > 217) {
			local167 >>= 0x3;
		} else if (local188 > 192) {
			local167 >>= 0x2;
		} else if (local188 > 179) {
			local167 >>= 0x1;
		}
		return ((local162 >> 2 & 0x3F) << 10) + (local167 >> 5 << 7) + (local188 >> 1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public static void method6025() {
		for (@Pc(10) Class3_Sub7_Sub14 local10 = (Class3_Sub7_Sub14) Static355.aClass342_94.method7644(); local10 != null; local10 = (Class3_Sub7_Sub14) Static355.aClass342_94.method7650()) {
			@Pc(15) Class9_Sub1_Sub1_Sub4 local15 = local10.aClass9_Sub1_Sub1_Sub4_1;
			if (local15.anInt5044 < Static716.anInt11157) {
				local10.method9596();
				local15.method4624();
			} else if (Static716.anInt11157 >= local15.anInt5029) {
				local15.method4625();
				if (local15.anInt5052 > 0) {
					if (Static103.anInt2245 == 3) {
						@Pc(60) Class9_Sub1_Sub1_Sub2 local60 = Static470.aClass7Array1[local15.anInt5052 - 1].method249();
						if (local60 != null && local60.anInt10694 >= 0 && local60.anInt10694 < Static497.anInt7926 * 512 && local60.anInt10695 >= 0 && Static646.anInt9979 * 512 > local60.anInt10695) {
							local15.method4629(Static77.method1633(local60.anInt10695, local60.anInt10694, local15.aByte139) - local15.anInt5053, local60.anInt10694, Static716.anInt11157, local60.anInt10695);
						}
					} else {
						@Pc(135) Class3_Sub52 local135 = (Class3_Sub52) Static94.aClass313_8.method7104((long) (local15.anInt5052 - 1));
						if (local135 != null) {
							@Pc(140) Class9_Sub1_Sub1_Sub2_Sub2 local140 = local135.aClass9_Sub1_Sub1_Sub2_Sub2_2;
							if (local140.anInt10694 >= 0 && Static497.anInt7926 * 512 > local140.anInt10694 && local140.anInt10695 >= 0 && local140.anInt10695 < Static646.anInt9979 * 512) {
								local15.method4629(Static77.method1633(local140.anInt10695, local140.anInt10694, local15.aByte139) - local15.anInt5053, local140.anInt10694, Static716.anInt11157, local140.anInt10695);
							}
						}
					}
				}
				if (local15.anInt5052 < 0) {
					@Pc(205) int local205 = -local15.anInt5052 - 1;
					@Pc(216) Class9_Sub1_Sub1_Sub2_Sub1 local216;
					if (Static574.anInt8718 == local205) {
						local216 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					} else {
						local216 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local205];
					}
					if (local216 != null && local216.anInt10694 >= 0 && Static497.anInt7926 * 512 > local216.anInt10694 && local216.anInt10695 >= 0 && Static646.anInt9979 * 512 > local216.anInt10695) {
						local15.method4629(Static77.method1633(local216.anInt10695, local216.anInt10694, local15.aByte139) - local15.anInt5053, local216.anInt10694, Static716.anInt11157, local216.anInt10695);
					}
				}
				local15.method4627(Static286.anInt4372);
				Static507.method6900(local15, true);
			}
		}
	}
}
