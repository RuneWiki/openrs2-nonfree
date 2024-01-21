import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
	public static final int anInt464 = 4;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "[[Lclient!lj;")
	public static final Class61[][] aClass61ArrayArray1 = new Class61[anInt464][500];

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_156 = Static81.method1507("<)4col>");

	@OriginalMember(owner = "client!bj", name = "V", descriptor = "[I")
	public static final int[] anIntArray40 = new int[anInt464];

	@OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_157 = Static81.method1507("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
	public static void method430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static90.method3501(arg3, arg1, arg2 + arg3, arg1 - -arg0);
		Static182.method3156();
		Static90.method3482(arg3, arg1, arg2, arg0, 0);
		if (Static135.anInt2989 < 100) {
			return;
		}
		Static49.method904(arg1, arg3 + arg2, 0, Static146.anInt3124, Static189.anInt4212, 0, arg0 + arg1, arg3);
		@Pc(50) int local50 = arg3 + arg2 * Static132.anInt2942 / Static146.anInt3124;
		@Pc(58) int local58 = arg1 + arg0 * Static40.anInt1062 / Static189.anInt4212;
		@Pc(64) int local64 = Static175.anInt3909 * arg0 / Static189.anInt4212;
		@Pc(70) int local70 = Static210.anInt4653 * arg2 / Static146.anInt3124;
		Static90.method3488(local50, local58, local70, local64, 16711680, 128);
		Static90.method3490(local50, local58, local70, local64, 16711680);
		if (Static70.anInt3206 <= 0 || Static70.anInt3206 % 10 >= 5) {
			return;
		}
		for (@Pc(98) Class1_Sub23 local98 = (Class1_Sub23) Static168.aClass87_25.method2827(); local98 != null; local98 = (Class1_Sub23) Static168.aClass87_25.method2830()) {
			if (local98.anInt4153 == Static137.anInt3096) {
				@Pc(113) int local113 = arg2 * local98.anInt4152 / Static146.anInt3124 + arg3;
				@Pc(123) int local123 = arg1 + arg0 * local98.anInt4149 / Static189.anInt4212;
				Static90.method3482(local113 - 2, local123 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!cc;IIIIII)V")
	public static void method431(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray63.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray63[local5] - Static167.anInt3703;
			local20 = arg0.anIntArray60[local5] - Static134.anInt2982;
			local27 = arg0.anIntArray61[local5] - Static176.anInt4669;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray65 != null) {
				Static23.anIntArray62[local5] = local37;
				Static23.anIntArray58[local5] = local59;
				Static23.anIntArray67[local5] = local69;
			}
			Static23.anIntArray56[local5] = Static182.anInt4072 + (local37 << 9) / local69;
			Static23.anIntArray59[local5] = Static182.anInt4069 + (local59 << 9) / local69;
		}
		Static182.anInt4071 = 0;
		local3 = arg0.anIntArray55.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray55[local13];
			local27 = arg0.anIntArray57[local13];
			local37 = arg0.anIntArray54[local13];
			@Pc(142) int local142 = Static23.anIntArray56[local20];
			@Pc(146) int local146 = Static23.anIntArray56[local27];
			@Pc(150) int local150 = Static23.anIntArray56[local37];
			@Pc(154) int local154 = Static23.anIntArray59[local20];
			@Pc(158) int local158 = Static23.anIntArray59[local27];
			@Pc(162) int local162 = Static23.anIntArray59[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static65.aBoolean84 && Static13.method305(Static191.anInt4295 + Static182.anInt4072, Static94.anInt2171 + Static182.anInt4069, local154, local158, local162, local142, local146, local150)) {
					Static28.anInt730 = arg5;
					Static137.anInt3092 = arg6;
				}
				Static182.aBoolean191 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static182.anInt4068 || local146 > Static182.anInt4068 || local150 > Static182.anInt4068) {
					Static182.aBoolean191 = true;
				}
				if (arg0.anIntArray65 == null || arg0.anIntArray65[local13] == -1) {
					if (arg0.anIntArray66[local13] != 12345678) {
						Static182.method3149(local154, local158, local162, local142, local146, local150, arg0.anIntArray66[local13], arg0.anIntArray64[local13], arg0.anIntArray68[local13]);
					}
				} else if (Static193.aBoolean201) {
					@Pc(367) int local367 = Static182.anInterface2_2.method1320(arg0.anIntArray65[local13]);
					Static182.method3149(local154, local158, local162, local142, local146, local150, Static57.method1096(local367, arg0.anIntArray66[local13]), Static57.method1096(local367, arg0.anIntArray64[local13]), Static57.method1096(local367, arg0.anIntArray68[local13]));
				} else if (arg0.aBoolean29) {
					Static182.method3150(local154, local158, local162, local142, local146, local150, arg0.anIntArray66[local13], arg0.anIntArray64[local13], arg0.anIntArray68[local13], Static23.anIntArray62[0], Static23.anIntArray62[1], Static23.anIntArray62[3], Static23.anIntArray58[0], Static23.anIntArray58[1], Static23.anIntArray58[3], Static23.anIntArray67[0], Static23.anIntArray67[1], Static23.anIntArray67[3], arg0.anIntArray65[local13]);
				} else {
					Static182.method3150(local154, local158, local162, local142, local146, local150, arg0.anIntArray66[local13], arg0.anIntArray64[local13], arg0.anIntArray68[local13], Static23.anIntArray62[local20], Static23.anIntArray62[local27], Static23.anIntArray62[local37], Static23.anIntArray58[local20], Static23.anIntArray58[local27], Static23.anIntArray58[local37], Static23.anIntArray67[local20], Static23.anIntArray67[local27], Static23.anIntArray67[local37], arg0.anIntArray65[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(14) int local14 = arg3 - arg4;
		@Pc(19) int local19 = arg5 + arg4;
		@Pc(24) int local24 = arg0 - arg4;
		for (@Pc(30) int local30 = arg1; local30 < local9; local30++) {
			Static39.method731(Static98.anIntArrayArray16[local30], arg5, arg0, arg2);
		}
		for (@Pc(46) int local46 = arg3; local46 > local14; local46--) {
			Static39.method731(Static98.anIntArrayArray16[local46], arg5, arg0, arg2);
		}
		for (@Pc(66) int local66 = local9; local66 <= local14; local66++) {
			@Pc(72) int[] local72 = Static98.anIntArrayArray16[local66];
			Static39.method731(local72, arg5, local19, arg2);
			Static39.method731(local72, local19, local24, arg6);
			Static39.method731(local72, local24, arg0, arg2);
		}
	}
}
