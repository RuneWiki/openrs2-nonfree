import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!via", name = "y", descriptor = "I")
	public static int anInt7728;

	@OriginalMember(owner = "client!via", name = "t", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!via", name = "r", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray3;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II[IIIZILclient!ii;I[IIIIII)I")
	public static int method6718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class169 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
				Static238.anIntArrayArray33[local7][local13] = 0;
				Static617.anIntArrayArray59[local7][local13] = 99999999;
			}
		}
		if (arg11 <= 40) {
			method6721(14, (String) null, true);
		}
		@Pc(81) boolean local81;
		if (arg14 == 1) {
			local81 = Static250.method4087(arg12, arg10, arg3, arg4, arg13, arg8, arg0, arg7, arg1, arg6);
		} else if (arg14 == 2) {
			local81 = Static614.method8443(arg13, arg7, arg3, arg0, arg10, arg8, arg6, arg1, arg4, arg12);
		} else {
			local81 = Static100.method1535(arg7, arg3, arg10, arg1, arg14, arg6, arg12, arg4, arg13, arg0, arg8);
		}
		@Pc(116) int local116 = arg8 - 64;
		@Pc(120) int local120 = arg10 - 64;
		@Pc(122) int local122 = Static458.anInt7397;
		@Pc(124) int local124 = Static388.anInt6572;
		@Pc(135) int local135;
		@Pc(137) int local137;
		@Pc(144) int local144;
		if (!local81) {
			if (!arg5) {
				return -1;
			}
			local135 = Integer.MAX_VALUE;
			local137 = Integer.MAX_VALUE;
			for (local144 = arg13 - 10; local144 <= arg13 + 10; local144++) {
				for (@Pc(153) int local153 = arg6 - 10; local153 <= arg6 + 10; local153++) {
					@Pc(159) int local159 = local144 - local116;
					@Pc(163) int local163 = local153 - local120;
					if (local159 >= 0 && local163 >= 0 && local159 < 128 && local163 < 128 && Static617.anIntArrayArray59[local159][local163] < 100) {
						@Pc(197) int local197 = 0;
						if (arg13 > local144) {
							local197 = arg13 - local144;
						} else if (arg13 + arg4 - 1 < local144) {
							local197 = local144 + 1 - arg4 - arg13;
						}
						@Pc(231) int local231 = 0;
						if (arg6 > local153) {
							local231 = arg6 - local153;
						} else if (arg6 + arg12 - 1 < local153) {
							local231 = local153 + 1 - arg12 - arg6;
						}
						@Pc(271) int local271 = local197 * local197 + local231 * local231;
						if (local271 < local135 || local135 == local271 && Static617.anIntArrayArray59[local159][local163] < local137) {
							local135 = local271;
							local137 = Static617.anIntArrayArray59[local159][local163];
							local122 = local144;
							local124 = local153;
						}
					}
				}
			}
			if (local135 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg8 == local122 && local124 == arg10) {
			return 0;
		}
		@Pc(345) byte local345 = 0;
		Static272.anIntArray266[0] = local122;
		local135 = local345 + 1;
		Static403.anIntArray393[0] = local124;
		@Pc(366) int local366;
		local137 = local366 = Static238.anIntArrayArray33[local122 - local116][local124 - local120];
		while (local122 != arg8 || arg10 != local124) {
			if (local366 != local137) {
				local366 = local137;
				Static272.anIntArray266[local135] = local122;
				Static403.anIntArray393[local135++] = local124;
			}
			if ((local137 & 0x2) != 0) {
				local122++;
			} else if ((local137 & 0x8) != 0) {
				local122--;
			}
			if ((local137 & 0x1) != 0) {
				local124++;
			} else if ((local137 & 0x4) != 0) {
				local124--;
			}
			local137 = Static238.anIntArrayArray33[local122 - local116][local124 - local120];
		}
		local144 = 0;
		while (local135-- > 0) {
			arg2[local144] = Static272.anIntArray266[local135];
			arg9[local144++] = Static403.anIntArray393[local135];
			if (local144 >= arg2.length) {
				break;
			}
		}
		return local144;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!rs;")
	public static RuntimeException_Sub1 method6719(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString96 = local12.aString96 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method6721(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 == null) {
			return;
		}
		if (Static62.anInt1053 >= 100) {
			Static218.method3476(Static184.aClass131_40.method3168(Static375.anInt7800));
			return;
		}
		@Pc(27) String local27 = Static382.method5678(arg1);
		if (local27 == null || arg0 < 71) {
			return;
		}
		@Pc(82) String local82;
		for (@Pc(38) int local38 = 0; local38 < Static62.anInt1053; local38++) {
			@Pc(48) String local48 = Static382.method5678(Static119.aStringArray8[local38]);
			if (local48 != null && local48.equals(local27)) {
				Static218.method3476(arg1 + Static184.aClass131_41.method3168(Static375.anInt7800));
				return;
			}
			if (Static669.aStringArray42[local38] != null) {
				local82 = Static382.method5678(Static669.aStringArray42[local38]);
				if (local82 != null && local82.equals(local27)) {
					Static218.method3476(arg1 + Static184.aClass131_41.method3168(Static375.anInt7800));
					return;
				}
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static645.anInt10557; local116++) {
			local82 = Static382.method5678(Static167.aStringArray13[local116]);
			if (local82 != null && local82.equals(local27)) {
				Static218.method3476(Static184.aClass131_46.method3168(Static375.anInt7800) + arg1 + Static184.aClass131_47.method3168(Static375.anInt7800));
				return;
			}
			if (Static7.aStringArray1[local116] != null) {
				@Pc(165) String local165 = Static382.method5678(Static7.aStringArray1[local116]);
				if (local165 != null && local165.equals(local27)) {
					Static218.method3476(Static184.aClass131_46.method3168(Static375.anInt7800) + arg1 + Static184.aClass131_47.method3168(Static375.anInt7800));
					return;
				}
			}
		}
		if (Static382.method5678(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44).equals(local27)) {
			Static218.method3476(Static184.aClass131_43.method3168(Static375.anInt7800));
			return;
		}
		@Pc(229) Class389 local229 = Static120.method1769(false);
		@Pc(235) Class5_Sub41 local235 = Static647.method8905(Static221.aClass381_96, local229.aClass393_2);
		local235.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg1) + 1);
		local235.aClass5_Sub36_Sub2_1.method7327(arg1);
		local235.aClass5_Sub36_Sub2_1.method7324(arg2 ? 1 : 0);
		local229.method9079(local235);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IJ)V")
	public static void method6722(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static488.anInt7900;
		@Pc(18) int local18 = Static334.anInt9969;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (Static620.anInt8145 != local7) {
			local26 = local7 - Static620.anInt8145;
			local34 = (int) (arg0 * (long) local26 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local26 < local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local34 < local26) {
				local34 = local26;
			}
			Static620.anInt8145 += local34;
		}
		if (local18 != Static343.anInt5712) {
			local26 = local18 - Static343.anInt5712;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local26 < local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local34 < local26) {
				local34 = local26;
			}
			Static343.anInt5712 += local34;
		}
		Static211.aFloat113 += Static317.aFloat130 * (float) arg0 / 40.0F * 8.0F;
		Static243.aFloat117 += Static449.aFloat140 * (float) arg0 / 40.0F * 8.0F;
		Static301.method4696();
	}
}
