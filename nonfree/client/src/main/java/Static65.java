import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	public static int anInt1080;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_20 = new Class156(116, 0);

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
	public static final int[] anIntArray67 = new int[3];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!kc;[II)Lclient!nn;")
	public static Class256 method1081(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(13) float[][] local13 = null;
		if (arg1.aByteArray53 != null) {
			@Pc(26) int local26 = arg1.anInt5110;
			@Pc(29) int[] local29 = new int[local26];
			@Pc(32) int[] local32 = new int[local26];
			@Pc(35) int[] local35 = new int[local26];
			@Pc(38) int[] local38 = new int[local26];
			@Pc(41) int[] local41 = new int[local26];
			@Pc(44) int[] local44 = new int[local26];
			for (@Pc(46) int local46 = 0; local46 < local26; local46++) {
				local29[local46] = Integer.MAX_VALUE;
				local32[local46] = -2147483647;
				local35[local46] = Integer.MAX_VALUE;
				local38[local46] = -2147483647;
				local41[local46] = Integer.MAX_VALUE;
				local44[local46] = -2147483647;
			}
			local11 = new int[local26];
			@Pc(95) int local95;
			@Pc(153) int local153;
			for (@Pc(87) int local87 = 0; local87 < arg0; local87++) {
				local95 = arg2[local87];
				if (arg1.aByteArray53[local95] != -1) {
					@Pc(108) int local108 = arg1.aByteArray53[local95] & 0xFF;
					for (@Pc(110) int local110 = 0; local110 < 3; local110++) {
						@Pc(129) short local129;
						if (local110 == 0) {
							local129 = arg1.aShortArray67[local95];
						} else if (local110 == 1) {
							local129 = arg1.aShortArray71[local95];
						} else {
							local129 = arg1.aShortArray64[local95];
						}
						@Pc(148) int local148 = arg1.anIntArray307[local129];
						local153 = arg1.anIntArray299[local129];
						@Pc(158) int local158 = arg1.anIntArray302[local129];
						if (local148 < local29[local108]) {
							local29[local108] = local148;
						}
						if (local32[local108] < local148) {
							local32[local108] = local148;
						}
						if (local35[local108] > local153) {
							local35[local108] = local153;
						}
						if (local153 > local38[local108]) {
							local38[local108] = local153;
						}
						if (local158 < local41[local108]) {
							local41[local108] = local158;
						}
						if (local44[local108] < local158) {
							local44[local108] = local158;
						}
					}
				}
			}
			local13 = new float[local26][];
			local9 = new int[local26];
			local7 = new int[local26];
			for (local95 = 0; local95 < local26; local95++) {
				@Pc(266) byte local266 = arg1.aByteArray54[local95];
				if (local266 > 0) {
					local7[local95] = (local29[local95] + local32[local95]) / 2;
					local9[local95] = (local35[local95] + local38[local95]) / 2;
					local11[local95] = (local44[local95] + local41[local95]) / 2;
					@Pc(325) float local325;
					@Pc(341) float local341;
					@Pc(333) float local333;
					if (local266 == 1) {
						local153 = arg1.anIntArray304[local95];
						local341 = 64.0F / (float) arg1.anIntArray306[local95];
						if (local153 == 0) {
							local333 = 1.0F;
							local325 = 1.0F;
						} else if (local153 <= 0) {
							local333 = 1.0F;
							local325 = (float) -local153 / 1024.0F;
						} else {
							local333 = (float) local153 / 1024.0F;
							local325 = 1.0F;
						}
					} else if (local266 == 2) {
						local325 = 64.0F / (float) arg1.anIntArray304[local95];
						local333 = 64.0F / (float) arg1.anIntArray297[local95];
						local341 = 64.0F / (float) arg1.anIntArray306[local95];
					} else {
						local341 = (float) arg1.anIntArray306[local95] / 1024.0F;
						local333 = (float) arg1.anIntArray297[local95] / 1024.0F;
						local325 = (float) arg1.anIntArray304[local95] / 1024.0F;
					}
					local13[local95] = Static273.method4458(local333, local325, arg1.aByteArray51[local95] & 0xFF, arg1.aShortArray69[local95], local341, arg1.aShortArray63[local95], arg1.aShortArray65[local95]);
				}
			}
		}
		return new Class256(local7, local9, local11, local13);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)Z")
	public static boolean method1082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static186.method3178(arg1, arg0) | (arg1 & 0x70000) != 0 || Static328.method4972(arg0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILclient!mha;Lclient!mha;)V")
	public static void method1083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub5 arg3, @OriginalArg(4) Class4_Sub1_Sub5 arg4) {
		@Pc(4) Class128 local4 = Static362.method8360(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub5_2 = arg3;
		local4.aClass4_Sub1_Sub5_1 = arg4;
		@Pc(22) int local22 = Static177.aClass84Array2 == Static77.aClass84Array1 ? 1 : 0;
		if (!arg3.method8356()) {
			arg3.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local22];
			Static321.aClass4_Sub1Array5[local22] = arg3;
		} else if (arg3.method8344()) {
			arg3.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local22];
			Static194.aClass4_Sub1Array13[local22] = arg3;
		} else {
			arg3.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local22];
			Static623.aClass4_Sub1Array11[local22] = arg3;
			Static597.aBoolean675 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8356()) {
			if (arg4.method8344()) {
				arg4.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local22];
				Static194.aClass4_Sub1Array13[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local22];
			Static623.aClass4_Sub1Array11[local22] = arg4;
			Static597.aBoolean675 = true;
			return;
		}
		arg4.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local22];
		Static321.aClass4_Sub1Array5[local22] = arg4;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Z")
	public static boolean method1085(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V")
	public static void method1087(@OriginalArg(0) int arg0) {
		Static591.method8147();
		@Pc(11) int local11 = Static628.aClass348_1.method7726(arg0).anInt8734;
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static23.aClass247_1.anIntArray373[arg0];
		if (local11 == 5) {
			Static446.anInt7312 = local27;
		}
		if (local11 == 6) {
			Static559.anInt8804 = local27;
		}
	}
}
