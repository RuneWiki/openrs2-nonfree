import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[Lclient!om;")
	public static final Interface23[] anInterface23Array2 = new Interface23[75];

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_158 = new Class381(20, 8);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!rda;)V")
	public static void method5508(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class4_Sub1 local8 = null;
			for (@Pc(12) Class4_Sub1 local12 = Static623.aClass4_Sub1Array11[local5]; local12 != null; local12 = local12.aClass4_Sub1_23) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static623.aClass4_Sub1Array11[local5] = local12.aClass4_Sub1_23;
					} else {
						local8.aClass4_Sub1_23 = local12.aClass4_Sub1_23;
					}
					Static597.aBoolean675 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class4_Sub1 local47 = Static194.aClass4_Sub1Array13[local5]; local47 != null; local47 = local47.aClass4_Sub1_23) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static194.aClass4_Sub1Array13[local5] = local47.aClass4_Sub1_23;
					} else {
						local8.aClass4_Sub1_23 = local47.aClass4_Sub1_23;
					}
					Static597.aBoolean675 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class4_Sub1 local82 = Static321.aClass4_Sub1Array5[local5]; local82 != null; local82 = local82.aClass4_Sub1_23) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static321.aClass4_Sub1Array5[local5] = local82.aClass4_Sub1_23;
					} else {
						local8.aClass4_Sub1_23 = local82.aClass4_Sub1_23;
					}
					Static597.aBoolean675 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I")
	public static int method5510(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([ILclient!ip;BI)V")
	public static void method5511(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray403 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray403.length; local12++) {
				if (arg0[local12] != arg1.anIntArray403[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt6872 != -1) {
				@Pc(55) Class264 local55 = Static315.aClass14_1.method227(arg1.anInt6872);
				@Pc(58) int local58 = local55.anInt7047;
				if (local58 == 1) {
					arg1.anInt6869 = 0;
					arg1.anInt6836 = 1;
					arg1.anInt6844 = 0;
					arg1.anInt6886 = arg3;
					arg1.anInt6839 = 0;
					if (!arg1.aBoolean455) {
						Static628.method8566(local55, arg1.anInt6839, arg1);
					}
				}
				if (local58 == 2) {
					arg1.anInt6844 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray403 == null || arg1.anIntArray403[local12] == -1 || Static315.aClass14_1.method227(arg0[local12]).anInt7043 >= Static315.aClass14_1.method227(arg1.anIntArray403[local12]).anInt7043) {
				arg1.anIntArray403 = arg0;
				arg1.anInt6886 = arg3;
				break;
			}
		}
		if (arg2 != 17) {
			method5511((int[]) null, (Class4_Sub1_Sub1_Sub2_Sub1) null, (byte) 33, -71);
		}
		if (local10) {
			arg1.anIntArray403 = arg0;
			arg1.anInt6886 = arg3;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method5512(@OriginalArg(0) byte arg0) {
		for (@Pc(6) Class5_Sub11 local6 = (Class5_Sub11) Static3.aClass306_1.method6941(); local6 != null; local6 = (Class5_Sub11) Static3.aClass306_1.method6940()) {
			if (local6.aClass275_Sub1_1.method6312()) {
				Static419.method6142(local6.anInt1181);
			} else {
				local6.aClass275_Sub1_1.method6329();
				try {
					local6.aClass275_Sub1_1.method6324();
				} catch (@Pc(33) Exception local33) {
					Static522.method7115(local33, "TV: " + local6.anInt1181);
					Static419.method6142(local6.anInt1181);
				}
				if (!local6.aBoolean86 && !local6.aBoolean89) {
					@Pc(63) Class5_Sub14_Sub3 local63 = local6.aClass275_Sub1_1.method6322();
					if (local63 != null) {
						@Pc(69) Class5_Sub4_Sub5 local69 = local63.method7157();
						if (local69 != null) {
							local69.method4718(local6.anInt1179);
							Static265.aClass5_Sub4_Sub1_2.method334(local69);
							local6.aBoolean86 = true;
						}
					}
				}
			}
		}
		if (arg0 != 32) {
			method5512((byte) -74);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBFI[FIIII[F)V")
	public static void method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg1 - arg7;
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(13) int local13 = arg8 - arg5;
		@Pc(38) float local38 = arg4[2] * (float) local13 + arg4[1] * (float) local5 + (float) local9 * arg4[0];
		@Pc(59) float local59 = (float) local13 * arg4[5] + (float) local5 * arg4[4] + arg4[3] * (float) local9;
		@Pc(80) float local80 = arg4[8] * (float) local13 + (float) local5 * arg4[7] + (float) local9 * arg4[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg2 + 0.5F;
		@Pc(124) float local124;
		if (arg6 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg6 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg6 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		arg9[0] = local106;
		arg9[1] = local119;
	}
}
