import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_20 = new Class173(41, 3);

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBILclient!kfa;IILclient!fga;Lclient!rda;)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub4_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class101 arg5, @OriginalArg(7) Class1_Sub4_Sub2_Sub1_Sub2 arg6) {
		@Pc(11) Class4_Sub36 local11 = new Class4_Sub36();
		local11.anInt8131 = arg0 << 9;
		local11.anInt8132 = arg4 << 9;
		local11.anInt8123 = arg3;
		if (arg5 != null) {
			local11.aClass101_1 = arg5;
			@Pc(32) int local32 = arg5.anInt2946;
			@Pc(35) int local35 = arg5.anInt2969;
			if (arg1 == 1 || arg1 == 3) {
				local35 = arg5.anInt2946;
				local32 = arg5.anInt2969;
			}
			local11.anInt8119 = local32 + arg0 << 9;
			local11.aBoolean564 = arg5.aBoolean227;
			local11.anInt8126 = arg5.anInt2965;
			local11.anInt8133 = arg5.anInt2973;
			local11.anInt8120 = arg5.anInt2967;
			local11.anInt8122 = arg5.anInt2961;
			local11.anInt8134 = arg5.anInt2927;
			local11.anInt8125 = local35 + arg4 << 9;
			local11.anIntArray423 = arg5.anIntArray139;
			local11.aBoolean565 = arg5.aBoolean224;
			local11.anInt8127 = arg5.anInt2954 << 9;
			local11.anInt8121 = arg5.anInt2957;
			if (arg5.anIntArray140 != null) {
				local11.aBoolean563 = true;
				local11.method6756();
			}
			if (local11.anIntArray423 != null) {
				local11.anInt8129 = (int) (Math.random() * (double) (local11.anInt8134 - local11.anInt8120)) + local11.anInt8120;
			}
			Static88.aClass244_18.method5960(local11);
		} else if (arg2 != null) {
			local11.aClass1_Sub4_Sub2_Sub1_Sub1_2 = arg2;
			@Pc(144) Class283 local144 = arg2.aClass283_1;
			if (local144.anIntArray453 != null) {
				local11.aBoolean563 = true;
				local144 = local144.method6834(Static45.aClass148_1);
			}
			if (local144 != null) {
				local11.anInt8125 = local144.anInt8266 + arg4 << 9;
				local11.anInt8119 = local144.anInt8266 + arg0 << 9;
				local11.anInt8133 = Static533.method7755(arg2);
				local11.anInt8127 = local144.anInt8231 << 9;
				local11.anInt8126 = local144.anInt8272;
				local11.anInt8122 = local144.anInt8243;
				local11.anInt8121 = local144.anInt8237;
				local11.aBoolean564 = local144.aBoolean572;
			}
			Static190.aClass244_25.method5960(local11);
		} else if (arg6 != null) {
			local11.aClass1_Sub4_Sub2_Sub1_Sub2_2 = arg6;
			local11.anInt8119 = arg6.method6925() + arg0 << 9;
			local11.anInt8125 = arg6.method6925() + arg4 << 9;
			local11.anInt8133 = Static434.method6771(arg6);
			local11.anInt8127 = arg6.anInt8454 << 9;
			local11.aBoolean564 = arg6.aBoolean597;
			local11.anInt8122 = arg6.anInt8485;
			local11.anInt8121 = 256;
			local11.anInt8126 = 256;
			Static583.aClass350_42.method8199((long) arg6.anInt8435, local11);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIBII)Z")
	public static boolean method964(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg1 % 8;
		@Pc(18) int local18;
		if (local14 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local14;
		}
		@Pc(33) int local33 = -((arg4 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg1 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local33; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local18;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!un;Z)Lclient!rp;")
	public static Class294 method966(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) String local7 = arg0.method4920();
		@Pc(14) Class258 local14 = Static240.method7436()[arg0.method4905()];
		@Pc(21) Class250 local21 = Static215.method3573()[arg0.method4905()];
		@Pc(25) int local25 = arg0.method4946();
		@Pc(29) int local29 = arg0.method4946();
		@Pc(45) int local45 = arg0.method4905();
		@Pc(49) int local49 = arg0.method4905();
		@Pc(53) int local53 = arg0.method4905();
		@Pc(57) int local57 = arg0.method4936();
		@Pc(61) int local61 = arg0.method4936();
		@Pc(65) int local65 = arg0.method4931();
		@Pc(69) int local69 = arg0.method4931();
		@Pc(73) int local73 = arg0.method4931();
		return new Class294(local7, local14, local21, local25, local29, local45, local49, local53, local57, local61, local65, local69, local73);
	}
}
