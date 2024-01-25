import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!um", name = "u", descriptor = "I")
	public static int anInt5643;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "Lclient!cm;")
	public static Class3_Sub11 aClass3_Sub11_4;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	public static int anInt5639 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4745(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static329.method5266(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static41.anInt1004; local31++) {
			@Pc(37) String local37 = Static241.aStringArray51[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static329.method5266(local37);
			if (local37 != null && local37.equals(local22)) {
				Static41.anInt1004--;
				for (@Pc(61) int local61 = local31; local61 < Static41.anInt1004; local61++) {
					Static241.aStringArray51[local61] = Static241.aStringArray51[local61 + 1];
					Static147.aStringArray21[local61] = Static147.aStringArray21[local61 + 1];
					Static65.aStringArray11[local61] = Static65.aStringArray11[local61 + 1];
					Static516.aStringArray48[local61] = Static516.aStringArray48[local61 + 1];
					Static196.aBooleanArray22[local61] = Static196.aBooleanArray22[local61 + 1];
				}
				Static305.anInt5997 = Static446.anInt8177;
				Static278.method4791(Static160.aClass158_43);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0));
				Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)J")
	public static long method4747() {
		return Static148.aClass95_1.method6526();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!oa;Lclient!lm;Lclient!lq;I)V")
	public static void method4749(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class3_Sub31 arg2) {
		@Pc(10) Class119 local10 = arg1.method4797(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local16 < local10.b()) {
			local16 = local10.b();
		}
		@Pc(32) int local32 = arg2.anInt5805;
		@Pc(35) int local35 = arg2.anInt5807;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg1.aString41 != null) {
			local37 = Static23.aClass53_15.method1385(arg1.aString41, null, null, Static137.aStringArray18);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static137.aStringArray18[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static509.aClass106_9.method3106(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = local37 * Static509.aClass106_9.method3105() + Static509.aClass106_9.method3103() / 2;
		}
		local55 = local16 / 2 + arg2.anInt5805;
		if (Static55.anInt1981 + local16 > local32) {
			local32 = Static55.anInt1981;
			local55 = Static55.anInt1981 + local16 / 2 + local39 / 2 + 5 + 10;
		} else if (Static55.anInt1980 - local16 < local32) {
			local55 = Static55.anInt1980 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static55.anInt1980 - local16;
		}
		@Pc(168) int local168 = arg2.anInt5807;
		if (local35 < Static55.anInt1976 + local16) {
			local35 = Static55.anInt1976;
			local168 = Static55.anInt1976 + local16 / 2 + 10;
		} else if (Static55.anInt1973 - local16 < local35) {
			local35 = Static55.anInt1973 - local16;
			local168 = Static55.anInt1973 - local41 - local16 / 2 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg2.anInt5805), (double) (local35 - arg2.anInt5807)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6675((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		if (arg1.aString41 != null) {
			local261 = local168;
			local259 = local55 - local39 / 2 - 5;
			local265 = local168 + Static509.aClass106_9.method3105() * local37 + 3;
			local263 = local39 + local259 + 10;
			if (arg1.anInt5738 != 0) {
				arg0.method7459(local263 - local259, local168, arg1.anInt5738, local265 - local168, local259);
			}
			if (arg1.anInt5733 != 0) {
				arg0.method7440(local265 - local168, local168, local263 - local259, arg1.anInt5733, local259);
			}
			for (@Pc(335) int local335 = 0; local335 < local37; local335++) {
				@Pc(341) String local341 = Static137.aStringArray18[local335];
				if (local37 - 1 > local335) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static509.aClass106_9.method3102(arg0, local341, local55, local168, arg1.anInt5719);
				local168 += Static509.aClass106_9.method3105();
			}
		}
		if (arg1.anInt5730 == -1 && arg1.aString41 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(397) Class3_Sub50 local397 = new Class3_Sub50(arg2);
		local397.anInt9372 = local35 - local16;
		local397.anInt9371 = local261;
		local397.anInt9370 = local35 + local16;
		local397.anInt9374 = local265;
		local397.anInt9367 = local263;
		local397.anInt9376 = local32 + local16;
		local397.anInt9369 = local32 - local16;
		local397.anInt9375 = local259;
		Static325.aClass71_47.method2076(local397);
	}
}
