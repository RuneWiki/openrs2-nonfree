import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt4761;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
	public static int[] anIntArray381 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)V")
	public static void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static152.method2728(false);
		Static87.anInt2459 = arg2;
		Static96.anInt2665 = arg0;
		Static116.method2304(arg1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg6 && arg1 == arg8 && arg7 == arg4 && arg0 == arg3) {
			Static113.method4189(arg2, arg6, arg8, arg4, arg3);
			return;
		}
		@Pc(39) int local39 = arg6;
		@Pc(43) int local43 = arg8 * 3;
		@Pc(45) int local45 = arg8;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg1 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(75) int local75 = local53 + arg4 - arg6 - local65;
		@Pc(80) int local80 = local53 - local49;
		@Pc(89) int local89 = local43 + local61 - local57 - local57;
		@Pc(99) int local99 = local65 + local49 - local53 - local53;
		@Pc(109) int local109 = arg3 + local57 - local61 - arg8;
		@Pc(113) int local113 = local57 - local43;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local115 * local123 >> 12;
			@Pc(133) int local133 = local109 * local129;
			@Pc(137) int local137 = local123 * local99;
			@Pc(141) int local141 = local89 * local123;
			@Pc(145) int local145 = local129 * local75;
			@Pc(149) int local149 = local115 * local80;
			@Pc(153) int local153 = local115 * local113;
			@Pc(163) int local163 = (local145 + local137 + local149 >> 12) + arg6;
			@Pc(174) int local174 = (local153 + local133 + local141 >> 12) + arg8;
			Static113.method4189(arg2, local39, local45, local163, local174);
			local39 = local163;
			local45 = local174;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	public static int method3553(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ai;I)I")
	public static int method3554(@OriginalArg(0) Class9_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt370;
		@Pc(17) Class59 local17 = arg0.method207();
		if (local17.anInt2744 == arg0.anInt451) {
			local8 = arg0.anInt360;
		} else if (arg0.anInt451 == local17.anInt2726 || arg0.anInt451 == local17.anInt2729 || local17.anInt2725 == arg0.anInt451 || arg0.anInt451 == local17.anInt2741) {
			local8 = arg0.anInt369;
		} else if (arg0.anInt451 == local17.anInt2758 || local17.anInt2756 == arg0.anInt451 || local17.anInt2750 == arg0.anInt451 || local17.anInt2739 == arg0.anInt451) {
			local8 = arg0.anInt379;
		}
		return local8;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	public static int method3555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}
}
