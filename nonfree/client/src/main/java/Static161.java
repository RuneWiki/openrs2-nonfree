import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public static int anInt2962;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public static int anInt2963;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	public static int anInt2958 = 0;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "[I")
	public static final int[] anIntArray145 = new int[200];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!ha;IILclient!faa;Lclient!bs;)Z")
	public static boolean method2559(@OriginalArg(1) Class67 arg0, @OriginalArg(4) Class105 arg1, @OriginalArg(5) Class3_Sub12 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray150 != null) {
			local13 = Static654.anInt8147 - (Static654.anInt8147 - Static654.anInt8152) * (arg1.anInt3101 + arg2.anInt947 - Static654.anInt8154) / (Static654.anInt8151 - Static654.anInt8154);
			local11 = Static654.anInt8147 - (arg2.anInt947 + arg1.anInt3086 - Static654.anInt8154) * (Static654.anInt8147 + -Static654.anInt8152) / (Static654.anInt8151 - Static654.anInt8154);
			local7 = Static654.anInt8145 + (Static654.anInt8149 - Static654.anInt8145) * (arg2.anInt952 + arg1.anInt3082 - Static654.anInt8144) / (Static654.anInt8146 - Static654.anInt8144);
			local9 = Static654.anInt8145 + (arg2.anInt952 + arg1.anInt3092 - Static654.anInt8144) * (Static654.anInt8149 - Static654.anInt8145) / (Static654.anInt8146 - Static654.anInt8144);
		}
		@Pc(101) Class9 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg1.anInt3103 != -1) {
			if (arg2.aBoolean76 && arg1.anInt3102 != -1) {
				local101 = arg1.method2653(arg0, true);
			} else {
				local101 = arg1.method2653(arg0, false);
			}
			if (local101 != null) {
				local103 = arg2.anInt948 - (local101.method8619() + 1 >> 1);
				local105 = arg2.anInt948 + (local101.method8619() + 1 >> 1);
				if (local7 > local103) {
					local7 = local103;
				}
				local107 = arg2.anInt949 - (local101.method8613() + 1 >> 1);
				if (local9 < local105) {
					local9 = local105;
				}
				local109 = arg2.anInt949 + (local101.method8613() + 1 >> 1);
				if (local11 > local107) {
					local11 = local107;
				}
				if (local13 < local109) {
					local13 = local109;
				}
			}
		}
		@Pc(213) Class38 local213 = null;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(317) int local317;
		if (arg1.aString57 != null) {
			local213 = Static360.method5154(arg1.anInt3109);
			if (local213 != null) {
				local215 = Static48.aClass330_1.method7912(arg1.aString57, (int[]) null, Static503.aStringArray32, (Class9[]) null);
				local217 = (Static654.anInt8149 - Static654.anInt8145) * arg1.anInt3078 / (Static654.anInt8146 - Static654.anInt8144) + arg2.anInt948;
				local219 = arg2.anInt949 - (Static654.anInt8147 - Static654.anInt8152) * arg1.anInt3108 / (Static654.anInt8151 - Static654.anInt8154);
				if (local101 == null) {
					local219 -= local213.method746() * local215 / 2;
				} else {
					local219 -= (local101.method8613() >> 1) + (local215 * local213.method745());
				}
				for (local317 = 0; local317 < local215; local317++) {
					@Pc(323) String local323 = Static503.aStringArray32[local317];
					if (local317 < local215 - 1) {
						local323 = local323.substring(0, local323.length() - 4);
					}
					@Pc(344) int local344 = local213.method747(local323);
					if (local221 < local344) {
						local221 = local344;
					}
				}
				local223 = local217 - local221 / 2;
				if (local7 > local223) {
					local7 = local223;
				}
				local225 = local221 / 2 + local217;
				local235 = local219;
				if (local9 < local225) {
					local9 = local225;
				}
				local237 = local219 + local215 * local213.method745();
				if (local235 < local11) {
					local11 = local235;
				}
				if (local237 > local13) {
					local13 = local237;
				}
			}
		}
		if (local9 < Static654.anInt8145 || local7 > Static654.anInt8149 || local13 < Static654.anInt8152 || local11 > Static654.anInt8147) {
			return true;
		}
		Static654.method6898(arg0, arg2, arg1);
		if (local101 != null) {
			if (Static148.anInt2790 > 0 && (Static143.anInt2734 != -1 && Static143.anInt2734 == arg2.anInt950 || Static541.anInt6223 != -1 && Static541.anInt6223 == arg1.anInt3089)) {
				if (Static608.anInt9862 <= 50) {
					local317 = Static608.anInt9862 * 2;
				} else {
					local317 = 200 - Static608.anInt9862 * 2;
				}
				@Pc(510) int local510 = local317 << 24 | 0xFFFF00;
				arg0.method7677(local101.method8602() / 2 + 7, arg2.anInt949, arg2.anInt948, local510);
				arg0.method7677(local101.method8602() / 2 + 5, arg2.anInt949, arg2.anInt948, local510);
				arg0.method7677(local101.method8602() / 2 + 3, arg2.anInt949, arg2.anInt948, local510);
				arg0.method7677(local101.method8602() / 2 + 1, arg2.anInt949, arg2.anInt948, local510);
				arg0.method7677(local101.method8602() / 2, arg2.anInt949, arg2.anInt948, local510);
			}
			local101.method8617(arg2.anInt948 - (local101.method8619() >> 1), arg2.anInt949 - (local101.method8613() >> 1));
		}
		if (arg1.aString57 != null && local213 != null) {
			Static580.method8002(local215, local217, local219, local213, arg2, arg1, arg0, local221);
		}
		if (arg1.anInt3103 != -1 || arg1.aString57 != null) {
			@Pc(628) Class3_Sub45 local628 = new Class3_Sub45(arg2);
			local628.anInt8638 = local225;
			local628.anInt8647 = local103;
			local628.anInt8641 = local235;
			local628.anInt8643 = local105;
			local628.anInt8642 = local107;
			local628.anInt8646 = local237;
			local628.anInt8645 = local223;
			local628.anInt8640 = local109;
			Static335.aClass357_28.method8401(local628);
		}
		return false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub53 local7 = null;
		for (@Pc(17) Class3_Sub53 local17 = (Class3_Sub53) Static423.aClass357_43.method8391(); local17 != null; local17 = (Class3_Sub53) Static423.aClass357_43.method8392()) {
			if (local17.anInt10313 == arg6 && local17.anInt10319 == arg5 && local17.anInt10317 == arg1 && arg3 == local17.anInt10320) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub53();
			local7.anInt10317 = arg1;
			local7.anInt10319 = arg5;
			local7.anInt10320 = arg3;
			local7.anInt10313 = arg6;
			if (arg5 >= 0 && arg1 >= 0 && Static362.anInt8653 > arg5 && arg1 < Static206.anInt11291) {
				Static191.method2895(local7);
			}
			Static423.aClass357_43.method8401(local7);
		}
		local7.anInt10315 = arg0;
		local7.anInt10314 = arg2;
		local7.aBoolean745 = false;
		local7.anInt10311 = arg4;
		local7.aBoolean746 = true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	public static boolean method2562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static14.method271(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static632.method8567(arg1, arg0) | Static189.method2879(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static645.method8717(arg0, arg1) | Static667.method8875(arg0, arg1));
		} else {
			return false;
		}
	}
}
