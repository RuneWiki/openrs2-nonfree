import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!nh;)V")
	public static void method3883(@OriginalArg(0) Class170 arg0) {
		if (Static48.anInt963 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub20 local6 = arg0.aClass2_Sub20_1;
		Static140.aClass170Array1[Static48.anInt963] = arg0;
		Static69.aBooleanArray8[Static48.anInt963] = false;
		Static48.anInt963++;
		@Pc(21) int local21 = arg0.anInt4842;
		if (arg0.aBoolean347) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4842;
		if (arg0.aBoolean348) {
			local29 = Static254.anInt4782 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5741() + Static414.anInt6898 - local6.method5743() >> Static307.anInt5425;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5741() + local6.method5743() - Static414.anInt6898 >> Static307.anInt5425;
			if (local73 >= Static386.anInt6463) {
				local73 = Static386.anInt6463 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray77[local41++];
				@Pc(105) int local105 = (local6.method5740() + Static414.anInt6898 - local6.method5743() >> Static307.anInt5425) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static42.anInt4340) {
					local113 = Static42.anInt4340 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static351.aLongArrayArrayArray2[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static351.aLongArrayArrayArray2[local38][local126][local82] = local135 | (long) Static48.anInt963;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static351.aLongArrayArrayArray2[local38][local126][local82] = local135 | (long) Static48.anInt963 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static351.aLongArrayArrayArray2[local38][local126][local82] = local135 | (long) Static48.anInt963 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static351.aLongArrayArrayArray2[local38][local126][local82] = local135 | (long) Static48.anInt963 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	public static int method3884(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	public static void method3886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static222.anInt4314 == 1) {
			Static437.method5683(arg0, arg1, Static77.aClass2_Sub22_1);
		} else if (Static222.anInt4314 == 2) {
			Static320.method4498(arg0, arg1);
		}
		Static77.aClass2_Sub22_1 = null;
		Static222.anInt4314 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I")
	public static int method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static23.anInt564 < 100) {
			return -2;
		}
		@Pc(19) int local19 = -2;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg2 - Static88.anInt4520;
		@Pc(31) int local31 = arg1 - Static88.anInt4515;
		for (@Pc(36) Class2_Sub18 local36 = (Class2_Sub18) Static88.aClass14_34.method309(); local36 != null; local36 = (Class2_Sub18) Static88.aClass14_34.method311()) {
			if (arg0 == local36.anInt3142) {
				@Pc(49) int local49 = local36.anInt3147;
				@Pc(52) int local52 = local36.anInt3146;
				@Pc(62) int local62 = local49 + Static88.anInt4520 << 14 | Static88.anInt4515 + local52;
				@Pc(81) int local81 = (local26 - local49) * (-local49 + local26) + (local31 - local52) * (-local52 + local31);
				if (local19 < 0 || local81 < local21) {
					local21 = local81;
					local19 = local62;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!jo;I)V")
	public static void method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3) {
		for (@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) Static72.aClass14_7.method309(); local8 != null; local8 = (Class2_Sub24) Static72.aClass14_7.method311()) {
			if (local8.anInt4279 == arg1 && local8.anInt4285 == arg2 << 7 && local8.anInt4276 == arg0 << 7 && local8.aClass134_1.anInt3648 == arg3.anInt3648) {
				if (local8.aClass2_Sub3_Sub3_2 != null) {
					Static260.aClass2_Sub3_Sub1_2.method1826(local8.aClass2_Sub3_Sub3_2);
					local8.aClass2_Sub3_Sub3_2 = null;
				}
				if (local8.aClass2_Sub3_Sub3_1 != null) {
					Static260.aClass2_Sub3_Sub1_2.method1826(local8.aClass2_Sub3_Sub3_1);
					local8.aClass2_Sub3_Sub3_1 = null;
				}
				local8.method5866();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
	public static boolean method3889() {
		if (Static92.aBoolean239) {
			try {
				if ((Boolean) Static463.method4344("showingVideoAd", Static43.aClass59_5.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
