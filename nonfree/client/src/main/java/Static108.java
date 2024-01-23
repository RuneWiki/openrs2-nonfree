import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt2516;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!hi;")
	public static Class61 aClass61_13 = new Class61();

	@OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
	public static int[] anIntArray220 = new int[32];

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	public static int[] anIntArray221 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!qc;")
	public static Class135 aClass135_10 = new Class135(100);

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZII)I")
	public static int method1984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (arg1 >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)J")
	public static long method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass72_1 == null ? 0L : local7.aClass72_1.aLong105;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z")
	public static boolean method1987(@OriginalArg(1) int arg0) {
		if (Static187.aBooleanArray38[arg0]) {
			return true;
		} else if (Static298.aClass91_206.method2509(arg0)) {
			@Pc(24) int local24 = Static298.aClass91_206.method2510(arg0);
			if (local24 == 0) {
				Static187.aBooleanArray38[arg0] = true;
				return true;
			}
			if (Static77.aClass71ArrayArray1[arg0] == null) {
				Static77.aClass71ArrayArray1[arg0] = new Class71[local24];
			}
			for (@Pc(47) int local47 = 0; local47 < local24; local47++) {
				if (Static77.aClass71ArrayArray1[arg0][local47] == null) {
					@Pc(68) byte[] local68 = Static298.aClass91_206.method2495(arg0, local47);
					if (local68 != null) {
						@Pc(81) Class71 local81 = Static77.aClass71ArrayArray1[arg0][local47] = new Class71();
						local81.anInt2655 = (arg0 << 16) + local47;
						if (local68[0] == -1) {
							local81.method2108(new Class1_Sub11(local68));
						} else {
							local81.method2111(new Class1_Sub11(local68));
						}
					}
				}
			}
			Static187.aBooleanArray38[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg4 == arg8 && arg6 == arg1 && arg2 == arg5) {
			Static272.method4158(arg4, arg3, arg5, arg6, arg7);
			return;
		}
		@Pc(37) int local37 = arg3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(43) int local43 = arg4;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg2 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg1 * 3;
		@Pc(68) int local68 = arg5 + local55 - local51 - arg4;
		@Pc(78) int local78 = local41 + local51 - local55 - local55;
		@Pc(82) int local82 = arg0 * 3;
		@Pc(86) int local86 = local82 - local47;
		@Pc(97) int local97 = local59 + local47 - local82 - local82;
		@Pc(107) int local107 = local82 + arg6 - local59 - arg3;
		@Pc(112) int local112 = local55 - local41;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(123) int local123 = local114 * local114 >> 12;
			@Pc(129) int local129 = local114 * local123 >> 12;
			@Pc(133) int local133 = local123 * local97;
			@Pc(137) int local137 = local107 * local129;
			@Pc(141) int local141 = local129 * local68;
			@Pc(145) int local145 = local123 * local78;
			@Pc(149) int local149 = local114 * local86;
			@Pc(153) int local153 = local112 * local114;
			@Pc(164) int local164 = arg3 + (local149 + local133 + local137 >> 12);
			@Pc(175) int local175 = arg4 + (local153 + local141 + local145 >> 12);
			Static272.method4158(local43, local37, local175, local164, arg7);
			local43 = local175;
			local37 = local164;
		}
	}
}
