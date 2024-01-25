import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "[Lclient!o;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public static int anInt1863 = -1;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public static final int anInt1865 = 1;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
	public static int[] anIntArray130 = new int[2];

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "[I")
	public static final int[] anIntArray131 = new int[256];

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
	public static void method1647(@OriginalArg(1) int arg0) {
		Static245.anInt4781 = -1;
		Static113.anInt2426 = -1;
		Static97.anInt2096 = arg0;
		Static142.method2614();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[FIFIIIIII)V")
	public static void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg4 - arg7;
		@Pc(9) int local9 = arg5 - arg6;
		@Pc(17) int local17 = arg8 - arg0;
		@Pc(38) float local38 = (float) local17 * arg1[0] + (float) local9 * arg1[1] + (float) local5 * arg1[2];
		@Pc(59) float local59 = arg1[5] * (float) local5 + arg1[3] * (float) local17 + (float) local9 * arg1[4];
		@Pc(80) float local80 = (float) local9 * arg1[7] + (float) local17 * arg1[6] + arg1[8] * (float) local5;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg3 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(140) float local140;
		if (arg2 == 1) {
			local140 = local106;
			local106 = -local119;
			local119 = local140;
		} else if (arg2 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg2 == 3) {
			local140 = local106;
			local106 = local119;
			local119 = -local140;
		}
		Static361.aFloat87 = local106;
		Static46.aFloat28 = local119;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IJ)V")
	public static void method1649(@OriginalArg(1) long arg0) {
		Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
		Static457.aClass4_Sub20_Sub1_5.method4590(Static34.aClass81_8.anInt2486);
		Static457.aClass4_Sub20_Sub1_5.method4556(arg0);
		Static457.aClass4_Sub20_Sub1_5.method4590(Static168.anInt3290);
		Static186.anInt3782 = 0;
		Static266.anInt5058 = -3;
		Static44.anInt1000 = 0;
		Static328.anInt5873 = 1;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZII)I")
	public static int method1651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static57.anIntArray87[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIZ)V")
	public static void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static454.aLong224 = 0L;
		@Pc(16) int local16 = Static331.method4891();
		if (arg2 == 3 || local16 == 3) {
			arg3 = true;
		}
		if (!Static30.aClass30_3.method2071()) {
			arg3 = true;
		}
		Static21.method354(local16, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(JI)V")
	public static void method1653(@OriginalArg(0) long arg0) {
		if (arg0 <= (long) 0) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static107.method2122(arg0 - 1L);
			Static107.method2122(1L);
		} else {
			Static107.method2122(arg0);
		}
	}
}
