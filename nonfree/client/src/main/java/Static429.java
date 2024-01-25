import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Z")
	public static boolean aBoolean567;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "F")
	public static float aFloat132 = 0.0F;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!cn;B)V")
	public static void method6350(@OriginalArg(0) Class73 arg0) {
		if (!Static199.aBoolean706) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(19) Class73 local19 = Static506.method9206(Static7.anInt85, Static400.anInt6886);
			if (local19 != null) {
				@Pc(25) Class5_Sub3 local25 = new Class5_Sub3();
				local25.aClass73_1 = arg0;
				local25.aClass73_2 = local19;
				local25.anObjectArray1 = arg0.anObjectArray30;
				Static173.method2520(local25);
			}
		}
		@Pc(42) Class5_Sub50 local42 = Static457.method6722(Static672.aClass387_129, Static80.aClass313_1);
		local42.aClass5_Sub23_Sub2_2.method8486(arg0.anInt1388);
		local42.aClass5_Sub23_Sub2_2.method8492(Static400.anInt6886);
		local42.aClass5_Sub23_Sub2_2.method8480(arg0.anInt1364);
		local42.aClass5_Sub23_Sub2_2.method8530(Static7.anInt85);
		local42.aClass5_Sub23_Sub2_2.method8514(arg0.anInt1419);
		local42.aClass5_Sub23_Sub2_2.method8520(Static395.anInt6753);
		Static494.method7120(local42);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;ZZLjava/lang/String;ZI)V")
	public static void method6351(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static348.aClass208_79.anInt5851 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(35) Class152 local35 = Static4.aClass355_1.method8693(arg5);
			if (local35 == null || local35.method2972() != arg2) {
				return;
			}
			if (local35.method2972()) {
				local18 = local35.aString49;
			} else {
				local16 = local35.anInt3373;
			}
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static201.aClass127_1.anInt2923; local62++) {
			@Pc(69) Class204 local69 = Static201.aClass127_1.method2501(local62);
			if ((!arg4 || local69.aBoolean433) && local69.anInt5701 == -1 && local69.anInt5728 == -1 && local69.anInt5689 == -1 && local69.anInt5679 == 0 && local69.aString72.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg2) {
						if (!arg1.equals(local69.method4861(local18, arg5))) {
							continue;
						}
					} else if (arg0 != local69.method4860(arg5, local16)) {
						continue;
					}
				}
				if (local60 >= 250) {
					Static539.aShortArray118 = null;
					Static450.anInt7749 = -1;
					return;
				}
				if (local14.length <= local60) {
					@Pc(173) short[] local173 = new short[local14.length * 2];
					for (@Pc(175) int local175 = 0; local175 < local60; local175++) {
						local173[local175] = local14[local175];
					}
					local14 = local173;
				}
				local14[local60++] = (short) local62;
			}
		}
		Static418.anInt7221 = 0;
		Static450.anInt7749 = local60;
		Static539.aShortArray118 = local14;
		@Pc(219) String[] local219 = new String[Static450.anInt7749];
		for (@Pc(221) int local221 = 0; local221 < Static450.anInt7749; local221++) {
			local219[local221] = Static201.aClass127_1.method2501(local14[local221]).aString72;
		}
		Static183.method2675(local219, Static539.aShortArray118);
		Static348.aClass208_79.method5001();
		Static348.aClass208_79.anInt5851 = 2;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method6352(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static40.method688(arg1, arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!dja;IBII[III[IIIIZI)I")
	public static int method6353(@OriginalArg(0) int arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(9) int local9 = 0; local9 < 128; local9++) {
				Static568.anIntArrayArray53[local3][local9] = 0;
				Static514.anIntArrayArray48[local3][local9] = 99999999;
			}
		}
		if (79 != 79) {
			return -66;
		}
		@Pc(76) boolean local76;
		if (arg6 == 1) {
			local76 = Static328.method5014(arg1, arg10, arg9, arg2, arg7, arg13, arg11, arg4, arg0, arg3);
		} else if (arg6 == 2) {
			local76 = Static328.method5013(arg4, arg13, arg3, arg1, arg0, arg2, arg9, arg7, arg10, arg11);
		} else {
			local76 = Static476.method6934(arg2, arg10, arg1, arg13, arg11, arg3, arg6, arg0, arg9, arg7, arg4);
		}
		@Pc(113) int local113 = arg13 - 64;
		@Pc(117) int local117 = arg0 - 64;
		@Pc(119) int local119 = Static340.anInt6055;
		@Pc(121) int local121 = Static377.anInt6461;
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(141) int local141;
		if (!local76) {
			if (!arg12) {
				return -1;
			}
			local132 = Integer.MAX_VALUE;
			local134 = Integer.MAX_VALUE;
			for (local141 = arg10 - 10; local141 <= arg10 + 10; local141++) {
				for (@Pc(149) int local149 = arg2 - 10; local149 <= arg2 + 10; local149++) {
					@Pc(156) int local156 = local141 - local113;
					@Pc(161) int local161 = local149 - local117;
					if (local156 >= 0 && local161 >= 0 && local156 < 128 && local161 < 128 && Static514.anIntArrayArray48[local156][local161] < 100) {
						@Pc(193) int local193 = 0;
						if (arg10 > local141) {
							local193 = arg10 - local141;
						} else if (local141 > arg11 + arg10 - 1) {
							local193 = local141 + 1 - arg11 - arg10;
						}
						@Pc(228) int local228 = 0;
						if (arg2 > local149) {
							local228 = arg2 - local149;
						} else if (arg2 + arg4 - 1 < local149) {
							local228 = local149 + 1 - arg4 - arg2;
						}
						@Pc(270) int local270 = local228 * local228 + local193 * local193;
						if (local132 > local270 || local270 == local132 && Static514.anIntArrayArray48[local156][local161] < local134) {
							local121 = local149;
							local119 = local141;
							local132 = local270;
							local134 = Static514.anIntArrayArray48[local156][local161];
						}
					}
				}
			}
			if (local132 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local119 == arg13 && arg0 == local121) {
			return 0;
		}
		@Pc(356) byte local356 = 0;
		Static516.anIntArray504[0] = local119;
		local132 = local356 + 1;
		Static385.anIntArray377[0] = local121;
		@Pc(377) int local377;
		local134 = local377 = Static568.anIntArrayArray53[local119 - local113][local121 - local117];
		while (local119 != arg13 || local121 != arg0) {
			if (local134 != local377) {
				Static516.anIntArray504[local132] = local119;
				local377 = local134;
				Static385.anIntArray377[local132++] = local121;
			}
			if ((local134 & 0x2) != 0) {
				local119++;
			} else if ((local134 & 0x8) != 0) {
				local119--;
			}
			if ((local134 & 0x1) != 0) {
				local121++;
			} else if ((local134 & 0x4) != 0) {
				local121--;
			}
			local134 = Static568.anIntArrayArray53[local119 - local113][local121 - local117];
		}
		local141 = 0;
		while (local132-- > 0) {
			arg8[local141] = Static516.anIntArray504[local132];
			arg5[local141++] = Static385.anIntArray377[local132];
			if (arg8.length <= local141) {
				break;
			}
		}
		return local141;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
	public static void method6354(@OriginalArg(0) int arg0) {
		Static670.anInt10721 = 2;
		Static295.anInt5127 = arg0;
		Static261.method3843(Static537.aString57.equals(""), true, "", Static537.aString57);
	}
}
