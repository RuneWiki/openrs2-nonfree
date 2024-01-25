import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt7994 = 0;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray42 = new boolean[100];

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
	public static final int[] anIntArray545 = new int[1];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIB)I")
	public static int method6696(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub22 local10 = Static284.method8371(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray220.length; local23++) {
				if (local10.anIntArray219[local23] == arg2) {
					local21 += local10.anIntArray220[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method6697() {
		for (@Pc(16) Class11_Sub3 local16 = (Class11_Sub3) Static49.aClass143_2.method3534(); local16 != null; local16 = (Class11_Sub3) Static49.aClass143_2.method3534()) {
			Static407.method6258(local16);
		}
		@Pc(37) int local37;
		@Pc(36) int local36;
		if (Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 1) {
			local36 = 3;
			local37 = 0;
		} else {
			local36 = Static576.anInt9519;
			local37 = Static576.anInt9519;
		}
		Static69.method1331();
		for (@Pc(45) int local45 = local37; local45 <= local36; local45++) {
			Static69.method1333();
			Static69.method1328(local45);
			Static69.method1330(local45);
		}
		Static69.method1324();
		Static69.method1329();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!gs;II)V")
	public static void method6703(@OriginalArg(0) Class11_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class11_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9928;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9928 < local27 + (local29 & 0x1)) {
				@Pc(44) Class11_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6703(arg0, arg1, local10 - 1);
		method6703(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[FB[FIIIFI)V")
	public static void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int local13 = arg0 - arg9;
		@Pc(17) int local17 = arg6 - arg1;
		@Pc(21) int local21 = arg2 - arg7;
		@Pc(42) float local42 = arg4[2] * (float) local17 + arg4[1] * (float) local13 + (float) local21 * arg4[0];
		@Pc(63) float local63 = arg4[5] * (float) local17 + (float) local21 * arg4[3] + (float) local13 * arg4[4];
		@Pc(84) float local84 = (float) local17 * arg4[8] + arg4[7] * (float) local13 + (float) local21 * arg4[6];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local42 * local42));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = (float) Math.asin((double) (local63 / local99)) / 3.1415927F + arg8 + 0.5F;
		@Pc(128) float local128;
		if (arg5 == 1) {
			local128 = local110;
			local110 = -local123;
			local123 = local128;
		} else if (arg5 == 2) {
			local110 = -local110;
			local123 = -local123;
		} else if (arg5 == 3) {
			local128 = local110;
			local110 = local123;
			local123 = -local128;
		}
		arg3[0] = local110;
		arg3[1] = local123;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method6707(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub5_Sub10 local13 = Static594.method8175(arg0, 8);
		local13.method4387();
	}
}
