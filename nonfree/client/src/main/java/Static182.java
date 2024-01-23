import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	public static int anInt4014;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
	public static int anInt4018;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
	public static int[] anIntArray355 = new int[1000];

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
	public static int anInt4017 = 1;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!wf;IILclient!em;I)V")
	public static void method2953(@OriginalArg(0) int arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(20) int local20;
		if (Static106.anInt2378 == 4) {
			local20 = (int) Static62.aFloat16 & 0x7FF;
		} else {
			local20 = (int) Static62.aFloat16 + Static220.anInt4691 & 0x7FF;
		}
		@Pc(39) int local39 = Math.max(arg1.anInt6088 / 2, arg1.anInt6128 / 2) + 10;
		@Pc(47) int local47 = arg2 * arg2 + arg3 * arg3;
		if (local39 * local39 < local47) {
			return;
		}
		@Pc(62) int local62 = Class146.anIntArray461[local20];
		@Pc(66) int local66 = Class146.anIntArray463[local20];
		if (Static106.anInt2378 != 4) {
			local62 = local62 * 256 / (Static253.anInt5117 + 256);
			local66 = local66 * 256 / (Static253.anInt5117 + 256);
		}
		@Pc(97) int local97 = local66 * arg3 + local62 * arg2 >> 16;
		@Pc(108) int local108 = arg2 * local66 - arg3 * local62 >> 16;
		if (Static294.aBoolean367) {
			((Class46_Sub2) arg4).method3529(arg0 + arg1.anInt6088 / 2 + local97 - arg4.anInt4745 / 2, arg1.anInt6128 / 2 + arg5 - local108 + -(arg4.anInt4747 / 2), (Class1_Sub3_Sub13_Sub1) arg1.method4674(false));
		} else {
			((Class46_Sub1) arg4).method2481(local97 + arg0 + arg1.anInt6088 / 2 - arg4.anInt4745 / 2, -(arg4.anInt4747 / 2) + arg1.anInt6128 / 2 + arg5 + -local108, arg1.anIntArray557, arg1.anIntArray554);
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)Lclient!vg;")
	public static Class182 method2955(@OriginalArg(1) int arg0) {
		@Pc(6) Class182 local6 = (Class182) Static127.aClass89_14.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static270.aClass168_183.method4058(arg0, 31);
		local6 = new Class182();
		if (local28 != null) {
			local6.method4531(arg0, new Class1_Sub14(local28));
		}
		Static127.aClass89_14.method2272((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method2957(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) int local10 = Static195.aClass1_Sub3_Sub5_3.method3501(arg0, 250);
		@Pc(17) int local17 = Static195.aClass1_Sub3_Sub5_3.method3516(arg0, 250) * 13;
		if (Static294.aBoolean367) {
			Static156.method2537(6, 6, local10 + 4 + 4, local17 - -4 - -4, 0);
			Static156.method2540(6, 6, local10 + 4 + 4, local17 + 8, 16777215);
		} else {
			Static231.method3630(6, 6, local10 + 4 + 4, local17 + 4 - -4, 0);
			Static231.method3626(6, 6, local10 + 8, local17 + 8, 16777215);
		}
		Static195.aClass1_Sub3_Sub5_3.method3512(arg0, 10, 10, local10, local17, 16777215, -1, 1, 1, 0);
		Static155.method2520(6, 6, local10 + 4 + 4, local17 + 8);
		if (!arg1) {
			Static163.method2578(10, local10, local17, 10);
		} else if (Static294.aBoolean367) {
			Static294.method4509();
		} else {
			try {
				@Pc(162) Graphics local162 = Static108.aCanvas1.getGraphics();
				Static293.aClass3_1.method2410(local162);
			} catch (@Pc(170) Exception local170) {
				Static108.aCanvas1.repaint();
			}
		}
	}
}
