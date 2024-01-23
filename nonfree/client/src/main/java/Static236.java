import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[S")
	public static short[] aShortArray72;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array16;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	public static int anInt4779 = 0;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "[I")
	public static int[] anIntArray432 = new int[5];

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Loading sprites - ";

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!gj;I)V")
	public static void method3732(@OriginalArg(1) Class22_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt4600 > Static37.anInt757) {
			Static66.method1110(arg0);
		} else if (arg0.anInt4586 < Static37.anInt757) {
			Static63.method1092(arg0);
		} else {
			Static218.method3438(arg0);
		}
		if (arg0.anInt4601 < 128 || arg0.anInt4623 < 128 || arg0.anInt4601 >= 13184 || arg0.anInt4623 >= 13184) {
			arg0.anInt4600 = 0;
			arg0.anInt4562 = -1;
			arg0.anInt4586 = 0;
			arg0.anInt4642 = -1;
			arg0.anInt4601 = arg0.anIntArray427[0] * 128 + arg0.method3660() * 64;
			arg0.anInt4623 = arg0.anIntArray424[0] * 128 + arg0.method3660() * 64;
			arg0.method3657();
		}
		if (Static229.aClass22_Sub3_Sub2_2 == arg0 && (arg0.anInt4601 < 1536 || arg0.anInt4623 < 1536 || arg0.anInt4601 >= 11776 || arg0.anInt4623 >= 11776)) {
			arg0.anInt4600 = 0;
			arg0.anInt4562 = -1;
			arg0.anInt4586 = 0;
			arg0.anInt4642 = -1;
			arg0.anInt4601 = arg0.anIntArray427[0] * 128 + arg0.method3660() * 64;
			arg0.anInt4623 = arg0.anIntArray424[0] * 128 + arg0.method3660() * 64;
			arg0.method3657();
		}
		Static206.method3273(arg0);
		Static194.method3156(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIILclient!tc;Lclient!hc;ZIII)Lclient!hc;")
	public static Class22_Sub4 method3737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class167 arg7, @OriginalArg(9) Class22_Sub4 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) long local27 = ((long) arg11 << 48) + ((long) arg4 << 32) + (long) ((arg2 << 16) + (arg6 - -(arg3 << 24)));
		@Pc(33) Class22_Sub4 local33 = (Class22_Sub4) Static147.aClass169_84.method4017(local27);
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(135) int local135;
		@Pc(131) int local131;
		@Pc(160) int local160;
		if (local33 == null) {
			@Pc(49) byte local49;
			if (arg6 == 1) {
				local49 = 9;
			} else if (arg6 == 2) {
				local49 = 12;
			} else if (arg6 == 3) {
				local49 = 15;
			} else if (arg6 == 4) {
				local49 = 18;
			} else {
				local49 = 21;
			}
			@Pc(90) int[] local90 = new int[] { 64, 96, 128 };
			@Pc(108) Class22_Sub7 local108 = new Class22_Sub7(local49 * 3 + 1, -local49 + 2 * 3 * local49, 0);
			local114 = local108.method4103(0, 0);
			@Pc(118) int[][] local118 = new int[3][local49];
			for (local120 = 0; local120 < 3; local120++) {
				local131 = local90[local120];
				local135 = local90[local120];
				for (@Pc(137) int local137 = 0; local137 < local49; local137++) {
					@Pc(150) int local150 = (local137 << 11) / local49;
					local160 = Class17.anIntArray22[local150] * local135 + arg0 >> 16;
					@Pc(170) int local170 = local131 * Class17.anIntArray24[local150] + arg5 >> 16;
					local118[local120][local137] = local108.method4103(local160, local170);
				}
			}
			for (local120 = 0; local120 < 3; local120++) {
				local135 = (local120 * 256 + 128) / 3;
				local131 = 256 - local135;
				@Pc(215) byte local215 = (byte) (local131 * arg2 + local135 * arg3 >> 8);
				@Pc(260) short local260 = (short) (((arg11 & 0x7F) * local135 + local131 * (arg4 & 0x7F) & 0x7F00) + (local135 * (arg11 & 0x380) + (arg4 & 0x380) * local131 & 0x38000) + (local131 * (arg4 & 0xFC00) + local135 * (arg11 & 0xFC00) & 0xFC0000) >> 8);
				for (local160 = 0; local160 < local49; local160++) {
					if (local120 == 0) {
						local108.method4094(local114, local118[0][(local160 + 1) % local49], local118[0][local160], local260, local215);
					} else {
						local108.method4094(local118[local120 - 1][local160], local118[local120 - 1][(local160 + 1) % local49], local118[local120][(local160 + 1) % local49], local260, local215);
						local108.method4094(local118[local120 - 1][local160], local118[local120][(local160 + 1) % local49], local118[local120][local160], local260, local215);
					}
				}
			}
			local33 = local108.method4097(64, 768, -50, -10, -50);
			Static147.aClass169_84.method4016(local33, local27);
		}
		@Pc(380) int local380 = arg8.method3553();
		@Pc(386) int local386 = arg6 * 64 - 1;
		local114 = local386;
		@Pc(390) int local390 = local386;
		local120 = arg8.method3560();
		@Pc(396) int local396 = -local386;
		@Pc(399) int local399 = -local386;
		if (arg9) {
			if (arg1 > 128 && arg1 < 896) {
				local399 -= 128;
			}
			if (arg1 > 1152 && arg1 < 1920) {
				local390 = local386 + 128;
			}
			if (arg1 > 640 && arg1 < 1408) {
				local114 = local386 + 128;
			}
			if (arg1 > 1664 || arg1 < 384) {
				local396 -= 128;
			}
		}
		if (local380 < local399) {
			local380 = local399;
		}
		if (local120 > local390) {
			local120 = local390;
		}
		local135 = arg8.method3566();
		local131 = arg8.method3574();
		if (local135 < local396) {
			local135 = local396;
		}
		if (local131 > local114) {
			local131 = local114;
		}
		@Pc(482) Class1_Sub1_Sub24 local482 = null;
		if (arg7 != null) {
			@Pc(490) int local490 = arg7.anIntArray461[arg12];
			local482 = Static270.method3983(local490 >> 16);
			arg12 = local490 & 0xFFFF;
		}
		if (local482 == null) {
			local33 = local33.method3568(true, true, true);
			local33.method3575((local120 - local380) / 2, 128, (local131 - local135) / 2);
			local33.method3577((local120 + local380) / 2, 0, (local135 + local131) / 2);
		} else {
			local33 = local33.method3568(!local482.method4482(arg12), !local482.method4484(arg12), true);
			local33.method3575((local120 - local380) / 2, 128, (local131 - local135) / 2);
			local33.method3577((local120 + local380) / 2, 0, (local131 + local135) / 2);
			local33.method3573(local482, arg12);
		}
		if (arg1 != 0) {
			local33.method3554(arg1);
		}
		if (Static291.aBoolean404) {
			@Pc(674) Class22_Sub4_Sub1 local674 = (Class22_Sub4_Sub1) local33;
			if (Static104.method1648(Static295.anInt5586, arg0 + local380, local135 + arg5) != arg10 || arg10 != Static104.method1648(Static295.anInt5586, local120 + arg0, arg5 - -local131)) {
				for (local160 = 0; local160 < local674.anInt1917; local160++) {
					local674.anIntArray175[local160] += Static104.method1648(Static295.anInt5586, arg0 + local674.anIntArray174[local160], local674.anIntArray170[local160] - -arg5) - arg10;
				}
				local674.aClass130_2.aBoolean277 = false;
				local674.aClass27_1.aBoolean39 = false;
			}
		} else {
			@Pc(604) Class22_Sub4_Sub2 local604 = (Class22_Sub4_Sub2) local33;
			if (Static104.method1648(Static295.anInt5586, arg0 + local380, local135 + arg5) != arg10 || Static104.method1648(Static295.anInt5586, local120 + arg0, local131 + arg5) != arg10) {
				for (local160 = 0; local160 < local604.anInt4462; local160++) {
					local604.anIntArray382[local160] += Static104.method1648(Static295.anInt5586, local604.anIntArray385[local160] + arg0, arg5 + local604.anIntArray379[local160]) - arg10;
				}
				local604.aBoolean316 = false;
			}
		}
		return local33;
	}
}
