import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "[J")
	public static long[] aLongArray12;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
	public static int anInt3968;

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
	public static int anInt3969;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
	public static int anInt3970;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!p;")
	public static Class4_Sub17 aClass4_Sub17_7 = new Class4_Sub17(10000);

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_1 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_2 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_3 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_4 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_5 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lclient!pe;")
	public static Class12_Sub2_Sub2 aClass12_Sub2_Sub2_6 = new Class12_Sub2_Sub2();

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "[I")
	public static int[] anIntArray346 = new int[1];

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "[I")
	public static int[] anIntArray347 = new int[1];

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIFFF)[F")
	public static float[] method3170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(4) float local4 = 1.0F;
		@Pc(6) float local6 = 0.0F;
		@Pc(11) float local11 = (float) arg1 / 32767.0F;
		@Pc(21) float local21 = -((float) Math.sqrt((double) (1.0F - local11 * local11)));
		@Pc(25) float local25 = 1.0F - local11;
		@Pc(36) float local36 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local36 != 0.0F) {
			local4 = (float) -arg2 / local36;
			local6 = (float) arg0 / local36;
		}
		local2[0] = local11 + local4 * local4 * local25;
		local2[1] = local6 * local21;
		local2[2] = local6 * local4 * local25;
		local2[3] = -local6 * local21;
		local2[4] = local11;
		local2[5] = local4 * local21;
		local2[6] = local4 * local6 * local25;
		local2[7] = -local4 * local21;
		local2[8] = local11 + local6 * local6 * local25;
		@Pc(120) float[] local120 = new float[9];
		local11 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local120[0] = local11;
		local120[1] = 0.0F;
		local120[2] = local21;
		local120[3] = 0.0F;
		local120[4] = 1.0F;
		local120[5] = 0.0F;
		local120[6] = -local21;
		local120[7] = 0.0F;
		local120[8] = local11;
		@Pc(180) float[] local180 = new float[] { local120[0] * local2[0] + local120[1] * local2[3] + local120[2] * local2[6], local120[0] * local2[1] + local120[1] * local2[4] + local120[2] * local2[7], local120[0] * local2[2] + local120[1] * local2[5] + local120[2] * local2[8], local120[3] * local2[0] + local120[4] * local2[3] + local120[5] * local2[6], local120[3] * local2[1] + local120[4] * local2[4] + local120[5] * local2[7], local120[3] * local2[2] + local120[4] * local2[5] + local120[5] * local2[8], local120[6] * local2[0] + local120[7] * local2[3] + local120[8] * local2[6], local120[6] * local2[1] + local120[7] * local2[4] + local120[8] * local2[7], local120[6] * local2[2] + local120[7] * local2[5] + local120[8] * local2[8] };
		local180[0] *= arg4;
		local180[1] *= arg4;
		local180[2] *= arg4;
		local180[3] *= arg5;
		local180[4] *= arg5;
		local180[5] *= arg5;
		local180[6] *= arg6;
		local180[7] *= arg6;
		local180[8] *= arg6;
		return local180;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[FIF)V")
	public static void method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg8 + 0.5F;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		aFloat39 = local100;
		aFloat37 = local113;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)I")
	public static int method3175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ISIB)I")
	public static int method3180(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Static204.anIntArray354[Static37.method612(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(15) int local15 = Static204.anInterface2_1.method1981(arg1 & 0xFFFF);
			@Pc(21) int local21;
			@Pc(44) int local44;
			if (local15 != 0) {
				if (arg2 < 0) {
					local21 = 0;
				} else if (arg2 > 127) {
					local21 = 16777215;
				} else {
					local21 = arg2 * 131586;
				}
				if (local15 == 256) {
					local5 = local21;
				} else {
					local44 = 256 - local15;
					local5 = ((local21 & 0xFF00FF) * local15 + (local5 & 0xFF00FF) * local44 & 0xFF00FF00) + ((local21 & 0xFF00) * local15 + (local5 & 0xFF00) * local44 & 0xFF0000) >> 8;
				}
			}
			local21 = Static204.anInterface2_1.method1982(arg1 & 0xFFFF);
			if (local21 != 0) {
				local21 += 256;
				@Pc(92) int local92 = (local5 >> 16 & 0xFF) * local21;
				if (local92 > 65535) {
					local92 = 65535;
				}
				local44 = (local5 >> 8 & 0xFF) * local21;
				if (local44 > 65535) {
					local44 = 65535;
				}
				@Pc(116) int local116 = (local5 & 0xFF) * local21;
				if (local116 > 65535) {
					local116 = 65535;
				}
				local5 = ((local92 & 0xFF00) << 8) + (local44 & 0xFF00) + (local116 >> 8);
			}
		}
		return (local5 << 8) + (255 - (arg3 & 0xFF));
	}

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "()V")
	public static void method3181() {
		aLongArray12 = null;
		aClass4_Sub17_7 = null;
		aByteBuffer9 = null;
		aClass12_Sub2_Sub2_1 = null;
		aClass12_Sub2_Sub2_2 = null;
		aClass12_Sub2_Sub2_3 = null;
		aClass12_Sub2_Sub2_4 = null;
		aClass12_Sub2_Sub2_5 = null;
		aClass12_Sub2_Sub2_6 = null;
		anIntArray346 = null;
		anIntArray347 = null;
	}

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "()V")
	public static void method3183() {
		aClass12_Sub2_Sub2_1 = new Class12_Sub2_Sub2();
		aClass12_Sub2_Sub2_2 = new Class12_Sub2_Sub2();
		aClass12_Sub2_Sub2_3 = new Class12_Sub2_Sub2();
		aClass12_Sub2_Sub2_4 = new Class12_Sub2_Sub2();
		aClass12_Sub2_Sub2_5 = new Class12_Sub2_Sub2();
		aClass12_Sub2_Sub2_6 = new Class12_Sub2_Sub2();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[FFIF)V")
	public static void method3191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + arg9 + 0.5F;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		aFloat41 = local85;
		aFloat40 = local99;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([FI)[F")
	public static float[] method3192(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static307.method3245(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([SI)[S")
	public static short[] method3198(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		Static307.method3241(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII[FIFFF)V")
	public static void method3200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg11 + 0.5F - local74;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = arg9 + 0.5F - local32;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else {
			local82 = arg11 + 0.5F - local74;
			local89 = arg10 + 0.5F - local53;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		aFloat38 = local82;
		aFloat36 = local89;
	}
}
