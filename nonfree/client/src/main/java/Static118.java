import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[Lclient!sk;")
	public static Class183[] aClass183Array1;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public static int anInt2819 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2490(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static289.anInt5643; local15++) {
			@Pc(23) Class8_Sub1_Sub2_Sub1 local23 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local15]];
			if (local23 != null && local23.aString24 != null && local23.aString24.equalsIgnoreCase(arg1)) {
				local13 = true;
				if (arg0 == 1) {
					Static15.aClass4_Sub11_Sub1_2.method706(144);
					Static15.aClass4_Sub11_Sub1_2.method3438(Static333.anIntArray494[local15]);
					Static15.aClass4_Sub11_Sub1_2.method3434(0);
				} else if (arg0 == 4) {
					Static15.aClass4_Sub11_Sub1_2.method706(145);
					Static15.aClass4_Sub11_Sub1_2.method3419(0);
					Static15.aClass4_Sub11_Sub1_2.method3402(Static333.anIntArray494[local15]);
				} else if (arg0 == 5) {
					Static15.aClass4_Sub11_Sub1_2.method706(199);
					Static15.aClass4_Sub11_Sub1_2.method3441(0);
					Static15.aClass4_Sub11_Sub1_2.method3459(Static333.anIntArray494[local15]);
				} else if (arg0 == 6) {
					Static15.aClass4_Sub11_Sub1_2.method706(59);
					Static15.aClass4_Sub11_Sub1_2.method3419(0);
					Static15.aClass4_Sub11_Sub1_2.method3402(Static333.anIntArray494[local15]);
				} else if (arg0 == 7) {
					Static15.aClass4_Sub11_Sub1_2.method706(40);
					Static15.aClass4_Sub11_Sub1_2.method3441(0);
					Static15.aClass4_Sub11_Sub1_2.method3438(Static333.anIntArray494[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static282.method4191(Static232.aClass159_247.method4311(Static180.anInt3835) + arg1);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)V")
	public static void method2491(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(16) byte local16;
		@Pc(18) byte[][] local18;
		if (arg0) {
			local16 = 1;
			local18 = Static293.aByteArrayArray16;
		} else {
			local16 = 4;
			local18 = Static65.aByteArrayArray4;
		}
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			Static319.method5250();
			for (@Pc(31) int local31 = 0; local31 < Static350.anInt6637 >> 3; local31++) {
				for (@Pc(35) int local35 = 0; local35 < Static105.anInt2647 >> 3; local35++) {
					@Pc(39) boolean local39 = false;
					@Pc(47) int local47 = Static345.anIntArrayArrayArray41[local26][local31][local35];
					if (local47 != -1) {
						@Pc(57) int local57 = local47 >> 24 & 0x3;
						if (!arg0 || local57 == 0) {
							@Pc(67) int local67 = local47 >> 1 & 0x3;
							@Pc(73) int local73 = local47 >> 14 & 0x3FF;
							@Pc(79) int local79 = local47 >> 3 & 0x7FF;
							@Pc(89) int local89 = (local73 / 8 << 8) + local79 / 8;
							for (@Pc(91) int local91 = 0; local91 < Static155.anIntArray297.length; local91++) {
								if (Static155.anIntArray297[local91] == local89 && local18[local91] != null) {
									@Pc(126) int[] local126 = Static16.method287(local31 * 8, local57, local26, local18[local91], arg0, local73, local35 * 8, local67, Static16.aClass170Array1, Static274.aClass47_9, local79);
									local39 = true;
									if (local7 == null && local126 != null) {
										local7 = local126;
									}
									break;
								}
							}
						}
					}
					if (!local39) {
						Static62.method1277(8, 8, local26, local35 * 8, local31 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static122.aClass73_1 = null;
		} else {
			Static122.aClass73_1 = Static309.method5097(local7[1], local7[2], local7[3], local7[0]);
			Static248.anInt5060 = local7[4];
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V")
	public static void method2492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg1) {
			Static317.method5237(arg2, arg4, arg0, arg3);
		} else if (arg3 - arg0 >= Static5.anInt2965 && Static220.anInt6565 >= arg3 + arg0 && arg2 - arg1 >= Static349.anInt6619 && Static195.anInt4097 >= arg1 + arg2) {
			Static81.method2011(arg3, arg1, arg4, arg2, arg0);
		} else {
			Static158.method3080(arg1, arg2, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!pn;I)V")
	public static void method2493(@OriginalArg(0) Class8_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(16) Class4_Sub29 local16 = (Class4_Sub29) Static114.aClass116_14.method3270(); local16 != null; local16 = (Class4_Sub29) Static114.aClass116_14.method3272()) {
			if (local16.aClass8_Sub1_Sub2_Sub2_1 == arg0) {
				if (local16.aClass4_Sub1_Sub1_1 != null) {
					Static196.aClass4_Sub1_Sub3_3.method3510(local16.aClass4_Sub1_Sub1_1);
					local16.aClass4_Sub1_Sub1_1 = null;
				}
				local16.method5687();
				return;
			}
		}
	}
}
